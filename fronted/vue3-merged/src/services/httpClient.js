const API_BASE = (import.meta.env.VITE_GATEWAY_BASE_URL || 'http://localhost:8080').replace(/\/+$/, '');

function isPlainObject(value) {
  return Object.prototype.toString.call(value) === '[object Object]';
}

function toSnakeKey(key) {
  if (typeof key !== 'string') return key;
  return key
    .replace(/([a-z0-9])([A-Z])/g, '$1_$2')
    .replace(/[\s\-]+/g, '_')
    .toLowerCase();
}

function toSnakeCaseDeep(input) {
  if (Array.isArray(input)) {
    return input.map((item) => toSnakeCaseDeep(item));
  }
  if (!isPlainObject(input)) {
    return input;
  }

  const result = {};
  Object.entries(input).forEach(([key, value]) => {
    result[toSnakeKey(key)] = toSnakeCaseDeep(value);
  });
  return result;
}

function buildUrl(path, query) {
  const normalizedPath = path.startsWith('/') ? path : `/${path}`;
  const url = `${API_BASE}${normalizedPath}`;
  if (!query || !isPlainObject(query) || !Object.keys(query).length) return url;

  const params = new URLSearchParams();
  Object.entries(query).forEach(([key, value]) => {
    if (value === undefined || value === null || value === '') return;
    params.set(key, String(value));
  });

  const queryString = params.toString();
  if (!queryString) return url;
  return `${url}?${queryString}`;
}

export class HttpError extends Error {
  constructor(message, options = {}) {
    super(message);
    this.name = 'HttpError';
    this.status = options.status ?? 0;
    this.problemCode = options.problemCode || '';
    this.detail = options.detail || message;
    this.body = options.body ?? null;
    this.url = options.url || '';
  }
}

async function parseResponseBody(response) {
  const contentType = response.headers.get('content-type') || '';
  const normalizedType = contentType.toLowerCase();
  const isJson =
    normalizedType.includes('application/json') ||
    normalizedType.includes('application/problem+json') ||
    normalizedType.includes('+json');

  if (isJson) {
    try {
      return await response.json();
    } catch {
      return null;
    }
  }

  try {
    const text = await response.text();
    return text || null;
  } catch {
    return null;
  }
}

export async function httpRequest(path, options = {}) {
  const method = (options.method || 'GET').toUpperCase();
  const headers = {
    ...(options.headers || {})
  };
  const timeoutMs = Number(options.timeoutMs) > 0 ? Number(options.timeoutMs) : 0;

  const url = buildUrl(path, options.query);

  if (options.auth && options.accessToken) {
    headers.Authorization = `Bearer ${options.accessToken}`;
  }

  const requestController = new AbortController();
  let timedOut = false;
  let timeoutId = null;
  let onExternalAbort = null;

  if (options.signal) {
    if (options.signal.aborted) {
      requestController.abort(options.signal.reason);
    } else {
      onExternalAbort = () => requestController.abort(options.signal.reason);
      options.signal.addEventListener('abort', onExternalAbort, { once: true });
    }
  }
  if (timeoutMs > 0) {
    timeoutId = globalThis.setTimeout(() => {
      timedOut = true;
      requestController.abort('timeout');
    }, timeoutMs);
  }

  const fetchOptions = {
    method,
    headers,
    signal: requestController.signal
  };

  if (options.body !== undefined) {
    headers['Content-Type'] = headers['Content-Type'] || 'application/json';
    const normalizedBody = headers['Content-Type'].includes('application/json')
      ? JSON.stringify(toSnakeCaseDeep(options.body))
      : options.body;
    fetchOptions.body = normalizedBody;
  }

  let response;
  try {
    response = await fetch(url, fetchOptions);
  } catch (error) {
    if (timedOut) {
      throw new HttpError(`Request timeout after ${timeoutMs}ms`, {
        status: 0,
        problemCode: 'TIMEOUT',
        detail: `Request timeout after ${timeoutMs}ms`,
        url
      });
    }
    throw new HttpError('Network request failed', {
      status: 0,
      problemCode: 'NETWORK_ERROR',
      detail: error?.message || 'Network request failed',
      url
    });
  } finally {
    if (timeoutId !== null) {
      globalThis.clearTimeout(timeoutId);
    }
    if (options.signal && onExternalAbort) {
      options.signal.removeEventListener('abort', onExternalAbort);
    }
  }

  const body = await parseResponseBody(response);
  if (response.ok) {
    return body;
  }

  const detail = isPlainObject(body) ? body.detail || response.statusText : response.statusText;
  const problemCode = isPlainObject(body) ? body.code || '' : '';
  throw new HttpError(detail || `HTTP ${response.status}`, {
    status: response.status,
    problemCode,
    detail,
    body,
    url
  });
}

export function normalizeApiData(payload) {
  if (!payload || typeof payload !== 'object') return null;
  if (Object.prototype.hasOwnProperty.call(payload, 'data')) return payload.data;
  return payload;
}

export function isUnauthorizedProblem(error) {
  return error instanceof HttpError && error.status === 401 && error.problemCode === 'UNAUTHORIZED';
}
