import http from 'node:http';
import { randomUUID } from 'node:crypto';
import { resolveProviderAdapter } from './providers/index.mjs';

const port = Number(process.env.PORT || 39041) || 39041;
const bearerToken = String(process.env.MUSIC_WEB_AUTH_TOKEN || '').trim();
const sessions = new Map();

function sendJson(res, statusCode, payload) {
  const body = JSON.stringify(payload);
  res.writeHead(statusCode, {
    'Content-Type': 'application/json; charset=utf-8',
    'Content-Length': Buffer.byteLength(body)
  });
  res.end(body);
}

function readBody(req) {
  return new Promise((resolve, reject) => {
    const chunks = [];
    req.on('data', (chunk) => chunks.push(chunk));
    req.on('end', () => {
      if (!chunks.length) {
        resolve({});
        return;
      }
      try {
        resolve(JSON.parse(Buffer.concat(chunks).toString('utf8')));
      } catch (error) {
        reject(error);
      }
    });
    req.on('error', reject);
  });
}

function ensureAuthorized(req, res) {
  if (!bearerToken) {
    return true;
  }
  const raw = String(req.headers.authorization || '').trim();
  if (raw === `Bearer ${bearerToken}`) {
    return true;
  }
  sendJson(res, 401, { message: 'Unauthorized' });
  return false;
}

function parseRoute(urlPath) {
  const match = /^\/internal\/music-auth\/providers\/([^/]+)\/bind-sessions(?:\/([^/]+))?$/.exec(urlPath);
  if (!match) {
    return null;
  }
  return {
    provider: decodeURIComponent(match[1]),
    sessionId: match[2] ? decodeURIComponent(match[2]) : ''
  };
}

function getSessionKey(provider, sessionId) {
  return `${String(provider || '').trim().toLowerCase()}::${String(sessionId || '').trim()}`;
}

function normalizeIso(value, fallback = '') {
  const raw = String(value || fallback).trim();
  if (!raw) {
    return '';
  }
  const date = new Date(raw);
  return Number.isNaN(date.getTime()) ? raw : date.toISOString();
}

const server = http.createServer(async (req, res) => {
  try {
    const pathname = new URL(req.url, `http://127.0.0.1:${port}`).pathname;
    if (req.method === 'GET' && pathname === '/healthz') {
      sendJson(res, 200, {
        status: 'ok',
        activeSessions: sessions.size
      });
      return;
    }

    if (!ensureAuthorized(req, res)) {
      return;
    }

    const route = parseRoute(pathname);
    if (!route) {
      sendJson(res, 404, { message: 'Not Found' });
      return;
    }

    const adapter = resolveProviderAdapter(route.provider);

    if (req.method === 'POST' && !route.sessionId) {
      const body = await readBody(req);
      const sessionId = String(body.sessionId || randomUUID()).trim() || randomUUID();
      const expiresAt = normalizeIso(body.expiresAt, new Date(Date.now() + 10 * 60 * 1000).toISOString());
      const session = await adapter.createBindSession(sessionId, expiresAt);
      sessions.set(getSessionKey(route.provider, sessionId), { ...session, provider: route.provider });
      sendJson(res, 200, sessions.get(getSessionKey(route.provider, sessionId)));
      return;
    }

    if (req.method === 'GET' && route.sessionId) {
      const session = sessions.get(getSessionKey(route.provider, route.sessionId));
      if (!session) {
        sendJson(res, 404, { message: 'Bind session not found' });
        return;
      }
      const snapshot = await adapter.getBindSessionSnapshot(session);
      sessions.set(getSessionKey(route.provider, route.sessionId), snapshot);
      sendJson(res, 200, snapshot);
      return;
    }

    sendJson(res, 404, { message: 'Not Found' });
  } catch (error) {
    sendJson(res, 500, {
      message: String(error?.message || error || 'Internal error')
    });
  }
});

server.listen(port, () => {
  process.stdout.write(`[music-web-auth-sidecar] listening on :${port}\n`);
});
