const API_PATH = '/api/v1/light-apps/todos/dev';
const MAX_BODY_BYTES = 2 * 1024 * 1024;
const MAX_HISTORY_BYTES = 48 * 1024;
const TIMEOUT_MS = 10_000;

export class TodoApiError extends Error {}

function parseOrigin(raw) {
  let url;
  try {
    url = new URL(raw);
  } catch {
    throw new TodoApiError('Set SHIZUKI_TODO_ORIGIN to a valid server origin.');
  }

  const loopback = ['localhost', '127.0.0.1', '[::1]'].includes(url.hostname);
  if (url.username || url.password || url.pathname !== '/' || url.search || url.hash ||
      (url.protocol !== 'https:' && !(loopback && url.protocol === 'http:'))) {
    throw new TodoApiError('Todo server must be an HTTPS origin (HTTP allowed only on loopback), without a path, credentials, query or fragment.');
  }
  return url.origin;
}

function failureFor(status, isWrite) {
  const statuses = {
    400: 'Todo server rejected the input. Check stage requirements and artifact values.',
    401: 'Todo MCP credential was rejected; check the configured credential.',
    403: 'Todo MCP credential does not permit this operation.',
    404: 'Development Todo or endpoint unavailable in this project.',
    409: 'Todo was updated or the request ID already exists. Read fresh context and reconcile the intended change before resubmitting.',
    422: 'Todo server rejected the stage or artifact values.',
    429: 'Todo server rate limit reached. Wait before trying again.',
  };
  return new TodoApiError(statuses[status] ?? (isWrite
    ? 'Todo server error; write outcome unknown. Re-read context and reuse the same request ID only for an identical retry.'
    : 'Todo server returned an unexpected error.'));
}

async function readResponse(response) {
  const type = response.headers.get('content-type')?.split(';', 1)[0].trim().toLowerCase();
  if (type !== 'application/json' || !response.body) {
    await response.body?.cancel();
    throw new TodoApiError('Todo server did not return its expected JSON envelope.');
  }
  const reader = response.body.getReader();
  const decoder = new TextDecoder('utf-8', { fatal: true });
  let size = 0;
  let json = '';
  try {
    for (;;) {
      const { done, value } = await reader.read();
      if (done) break;
      size += value.byteLength;
      if (size > MAX_BODY_BYTES) throw new TodoApiError('Todo server response exceeded the size limit.');
      json += decoder.decode(value, { stream: true });
    }
    json += decoder.decode();
  } catch (err) {
    await reader.cancel().catch(() => {});
    if (err instanceof TodoApiError) throw err;
    throw new TodoApiError('Todo server response could not be read.');
  } finally {
    reader.releaseLock();
  }

  let envelope;
  try {
    envelope = JSON.parse(json);
  } catch {
    throw new TodoApiError('Todo server returned invalid JSON.');
  }
  if (envelope?.code !== 'OK' || envelope.data === null || typeof envelope.data !== 'object') {
    throw new TodoApiError('Todo server did not confirm the operation.');
  }
  return envelope.data;
}

function boundHistory(data) {
  if (Array.isArray(data) || !Array.isArray(data.events)) return data;
  const kept = [];
  let bytes = 0;
  for (const event of data.events) {
    bytes += Buffer.byteLength(JSON.stringify(event)) + 1;
    if (bytes > MAX_HISTORY_BYTES) break;
    kept.push(event);
  }
  return kept.length === data.events.length ? data : {
    ...data, events: kept, events_omitted: data.events.length - kept.length,
  };
}

export function makeTodoApi({ origin, accountToken, legacyToken }) {
  const base = parseOrigin(origin);
  const useAccount = accountToken !== undefined;
  const token = useAccount ? accountToken : legacyToken;
  const setting = useAccount || legacyToken === undefined ? 'SHIZUKI_MCP_TOKEN' : 'SHIZUKI_TODO_TOKEN';
  if (typeof token !== 'string' || !/^[A-Za-z0-9_-]{32,256}$/.test(token)) {
    throw new TodoApiError('Set ' + setting + ' to a valid MCP credential.');
  }
  const credentialHeader = useAccount ? 'X-MCP-Token' : 'X-Todo-Dev-Token';

  async function call(path, { query, body } = {}) {
    const url = new URL(API_PATH + path, base);
    if (query) {
      for (const [key, value] of Object.entries(query)) {
        if (value !== undefined) url.searchParams.set(key, value);
      }
    }

    const isWrite = body !== undefined;
    let response;
    try {
      response = await fetch(url, {
        method: isWrite ? 'POST' : 'GET',
        headers: {
          accept: 'application/json',
          [credentialHeader]: token,
          ...(isWrite ? { 'content-type': 'application/json' } : {}),
        },
        body: isWrite ? JSON.stringify(body) : undefined,
        redirect: 'error',
        signal: AbortSignal.timeout(TIMEOUT_MS),
      });
    } catch {
      throw new TodoApiError(isWrite
        ? 'Todo write outcome unknown (connection, timeout or redirect). Re-read context and reuse the same request ID only for an identical retry.'
        : 'Could not reach the Todo API. Check server availability and origin (redirects are disabled).');
    }

    if (!response.ok) {
      await response.body?.cancel().catch(() => {});
      throw failureFor(response.status, isWrite);
    }
    if (!isWrite) return readResponse(response);
    try {
      return await readResponse(response);
    } catch {
      throw new TodoApiError('Todo write outcome unknown (unconfirmed response). Re-read context and reuse the same request ID only for an identical retry.');
    }
  }

  return {
    search: ({ q, project_id }) => call('', { query: { q, project_id } }),
    context: (todoId) => call('/' + encodeURIComponent(todoId)),
    progress: (todoId, body) => call('/' + encodeURIComponent(todoId) + '/progress', { body }),
    submit: (todoId, body) => call('/' + encodeURIComponent(todoId) + '/submit', { body }),
    // Only JSON text is sent to the MCP client; redact the exact credential even
    // if an upstream response unexpectedly echoes it.
    toClientText: (data) => JSON.stringify(boundHistory(data)).replaceAll(token, '[redacted]'),
  };
}
