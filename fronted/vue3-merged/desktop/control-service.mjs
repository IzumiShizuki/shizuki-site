import { createServer } from 'node:http';
import { randomBytes, timingSafeEqual } from 'node:crypto';
import { mkdir, readFile, rename, rm, writeFile } from 'node:fs/promises';
import path from 'node:path';
import {
  CONTROL_PROTOCOL_VERSION,
  capabilitiesDocument,
  controlError,
  validateControlCommand
} from './protocol.mjs';

const LOOPBACK_HOST = '127.0.0.1';
const MAX_BODY_BYTES = 64 * 1024;
const EVENT_BUFFER_SIZE = 100;

function jsonResponse(response, status, body) {
  const payload = `${JSON.stringify(body)}\n`;
  response.writeHead(status, {
    'content-type': 'application/json; charset=utf-8',
    'content-length': Buffer.byteLength(payload),
    'cache-control': 'no-store',
    'x-content-type-options': 'nosniff'
  });
  response.end(payload);
}

function tokensMatch(actual, expected) {
  const actualBuffer = Buffer.from(String(actual || ''), 'utf8');
  const expectedBuffer = Buffer.from(String(expected || ''), 'utf8');
  return actualBuffer.length === expectedBuffer.length
    && actualBuffer.length > 0
    && timingSafeEqual(actualBuffer, expectedBuffer);
}

export function isAuthorizedRequest(request, token) {
  const header = String(request.headers.authorization || '');
  const prefix = 'Bearer ';
  if (!header.startsWith(prefix)) return false;
  return tokensMatch(header.slice(prefix.length), token);
}

async function readJsonBody(request, maxBytes = MAX_BODY_BYTES) {
  const chunks = [];
  let size = 0;
  for await (const chunk of request) {
    size += chunk.length;
    if (size > maxBytes) {
      const error = new Error('Request body is too large.');
      error.code = 'BODY_TOO_LARGE';
      throw error;
    }
    chunks.push(chunk);
  }
  if (size === 0) return {};
  try {
    return JSON.parse(Buffer.concat(chunks).toString('utf8'));
  } catch {
    const error = new Error('Request body is not valid JSON.');
    error.code = 'INVALID_JSON';
    throw error;
  }
}

function formatSseEvent(event) {
  return `id: ${event.id}\nevent: ${event.type}\ndata: ${JSON.stringify(event.data)}\n\n`;
}

export class ControlEventHub {
  constructor({ bufferSize = EVENT_BUFFER_SIZE } = {}) {
    this.bufferSize = Math.max(1, Number(bufferSize) || EVENT_BUFFER_SIZE);
    this.nextId = 1;
    this.buffer = [];
    this.clients = new Set();
  }

  publish(type, data) {
    const event = Object.freeze({
      id: this.nextId++,
      type: String(type || 'message'),
      at: new Date().toISOString(),
      data
    });
    this.buffer.push(event);
    if (this.buffer.length > this.bufferSize) this.buffer.shift();
    const encoded = formatSseEvent(event);
    for (const client of this.clients) client.write(encoded);
    return event;
  }

  connect(response, lastEventId = 0) {
    response.writeHead(200, {
      'content-type': 'text/event-stream; charset=utf-8',
      'cache-control': 'no-store',
      connection: 'keep-alive',
      'x-accel-buffering': 'no'
    });
    response.write(': connected\n\n');
    const after = Number(lastEventId) || 0;
    for (const event of this.buffer) {
      if (event.id > after) response.write(formatSseEvent(event));
    }
    this.clients.add(response);
    const keepAlive = setInterval(() => response.write(': keep-alive\n\n'), 15_000);
    const cleanup = () => {
      clearInterval(keepAlive);
      this.clients.delete(response);
    };
    response.once('close', cleanup);
    response.once('error', cleanup);
  }

  close() {
    for (const client of this.clients) client.end();
    this.clients.clear();
  }
}

async function publishManifest(manifestPath, manifest) {
  await mkdir(path.dirname(manifestPath), { recursive: true });
  const tempPath = `${manifestPath}.${process.pid}.${Date.now()}.tmp`;
  await writeFile(tempPath, `${JSON.stringify(manifest, null, 2)}\n`, { encoding: 'utf8', mode: 0o600 });
  try {
    await rename(tempPath, manifestPath);
  } catch (error) {
    if (!['EEXIST', 'EPERM'].includes(error?.code)) throw error;
    await rm(manifestPath, { force: true });
    await rename(tempPath, manifestPath);
  } finally {
    await rm(tempPath, { force: true });
  }
}

async function removeOwnedManifest(manifestPath, token) {
  try {
    const current = JSON.parse(await readFile(manifestPath, 'utf8'));
    if (current?.token === token && Number(current?.pid) === process.pid) {
      await rm(manifestPath, { force: true });
    }
  } catch {
    // Missing, stale, or malformed discovery files are safe to leave untouched.
  }
}

function commandFailureStatus(code) {
  if (code === 'RENDERER_TIMEOUT') return 504;
  if (code === 'RENDERER_UNAVAILABLE') return 503;
  if (code === 'DUPLICATE_COMMAND') return 409;
  return 422;
}

export async function startControlService({ manifestPath, getState, dispatchCommand, eventHub = new ControlEventHub() }) {
  if (!manifestPath) throw new TypeError('manifestPath is required.');
  if (typeof getState !== 'function' || typeof dispatchCommand !== 'function') {
    throw new TypeError('getState and dispatchCommand are required.');
  }

  const token = randomBytes(32).toString('base64url');
  const server = createServer(async (request, response) => {
    const url = new URL(request.url || '/', `http://${LOOPBACK_HOST}`);
    if (request.method === 'GET' && url.pathname === '/v1/health') {
      jsonResponse(response, 200, { status: 'ok', protocolVersion: CONTROL_PROTOCOL_VERSION });
      return;
    }

    if (!isAuthorizedRequest(request, token)) {
      jsonResponse(response, 401, { ok: false, error: controlError('UNAUTHORIZED', 'A valid bearer token is required.') });
      return;
    }

    if (request.method === 'GET' && url.pathname === '/v1/capabilities') {
      jsonResponse(response, 200, capabilitiesDocument());
      return;
    }
    if (request.method === 'GET' && url.pathname === '/v1/state') {
      jsonResponse(response, 200, getState());
      return;
    }
    if (request.method === 'GET' && url.pathname === '/v1/events') {
      eventHub.connect(response, request.headers['last-event-id'] || url.searchParams.get('after'));
      return;
    }
    if (request.method === 'POST' && url.pathname === '/v1/commands') {
      let raw;
      try {
        raw = await readJsonBody(request);
      } catch (error) {
        const status = error?.code === 'BODY_TOO_LARGE' ? 413 : 400;
        jsonResponse(response, status, {
          ok: false,
          error: controlError(error?.code || 'INVALID_REQUEST', error?.message || 'Invalid request body.')
        });
        return;
      }
      const validation = validateControlCommand(raw);
      if (!validation.ok) {
        jsonResponse(response, 422, { ok: false, error: validation.error });
        return;
      }
      try {
        const result = await dispatchCommand(validation.value);
        jsonResponse(response, 200, { id: validation.value.id, ok: true, result });
      } catch (error) {
        const code = String(error?.code || 'COMMAND_FAILED');
        jsonResponse(response, commandFailureStatus(code), {
          id: validation.value.id,
          ok: false,
          error: controlError(code, error?.message || 'Command failed.')
        });
      }
      return;
    }

    jsonResponse(response, 404, { ok: false, error: controlError('NOT_FOUND', 'Control endpoint not found.') });
  });

  await new Promise((resolve, reject) => {
    server.once('error', reject);
    server.listen(0, LOOPBACK_HOST, () => {
      server.removeListener('error', reject);
      resolve();
    });
  });

  const address = server.address();
  const endpoint = `http://${LOOPBACK_HOST}:${address.port}`;
  const manifest = {
    protocolVersion: CONTROL_PROTOCOL_VERSION,
    endpoint,
    pid: process.pid,
    token,
    createdAt: new Date().toISOString()
  };
  await publishManifest(manifestPath, manifest);

  let closing = false;
  return Object.freeze({
    endpoint,
    token,
    manifestPath,
    eventHub,
    async close() {
      if (closing) return;
      closing = true;
      eventHub.close();
      await new Promise(resolve => server.close(() => resolve()));
      await removeOwnedManifest(manifestPath, token);
    }
  });
}
