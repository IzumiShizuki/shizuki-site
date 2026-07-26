import { normalizeApiData } from './httpClient';

const SESSION_ID_PATTERN = /^[A-Za-z0-9_-]{8,64}$/;
const SPRITE_FILE_PATTERN = /^[a-z0-9_]{1,64}\.png$/;

function unwrapApiResponse(response) {
  return normalizeApiData(response);
}

function requireAuthorizedFetch(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required for this request');
  }
  return authorizedFetch;
}

export function createMeguriSessionId() {
  const random =
    typeof crypto !== 'undefined' && typeof crypto.randomUUID === 'function'
      ? crypto.randomUUID().replaceAll('-', '')
      : `${Date.now()}${Math.floor(Math.random() * 1e12)}`;
  return `web_${random}`.slice(0, 64);
}

export function isValidMeguriSessionId(sessionId) {
  return SESSION_ID_PATTERN.test(String(sessionId || ''));
}

export function isValidMeguriSpriteFile(fileName) {
  return SPRITE_FILE_PATTERN.test(String(fileName || ''));
}

export function meguriSpritePath(fileName) {
  const normalized = String(fileName || '').trim();
  if (!isValidMeguriSpriteFile(normalized)) return '';
  return `/api/v1/meguri/assets/sprites/${encodeURIComponent(normalized)}`;
}

export function normalizeMeguriBootstrap(raw = {}) {
  const source = raw && typeof raw === 'object' ? raw : {};
  return {
    enabled: Boolean(source.enabled),
    coreOnline: Boolean(source.coreOnline ?? source.core_online),
    buildId: String(source.buildId || source.build_id || '').trim(),
    ragChunks: Number(source.ragChunks ?? source.rag_chunks ?? 0) || 0,
    defaultSprite: String(source.defaultSprite || source.default_sprite || '').trim(),
    spriteAvailable: Boolean(source.spriteAvailable ?? source.sprite_available)
  };
}

export function normalizeMeguriTurnCreated(raw = {}) {
  const source = raw && typeof raw === 'object' ? raw : {};
  return {
    turnId: String(source.turn_id || source.turnId || '').trim(),
    sessionId: String(source.session_id || source.sessionId || '').trim(),
    buildId: String(source.build_id || source.buildId || '').trim(),
    status: String(source.status || '').trim()
  };
}

export async function getMeguriBootstrap(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/meguri/bootstrap', { method: 'GET' });
  return normalizeMeguriBootstrap(unwrapApiResponse(response));
}

export async function createMeguriTurn({ message, sessionId, idempotencyKey } = {}, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedMessage = String(message || '').trim();
  if (!normalizedMessage) {
    throw new Error('message is required');
  }
  const normalizedSessionId = String(sessionId || '').trim();
  if (!isValidMeguriSessionId(normalizedSessionId)) {
    throw new Error('sessionId is invalid');
  }
  const response = await request('/api/v1/meguri/turns', {
    method: 'POST',
    body: {
      message: normalizedMessage,
      sessionId: normalizedSessionId,
      idempotencyKey: String(idempotencyKey || '').trim() || undefined
    }
  });
  const created = normalizeMeguriTurnCreated(unwrapApiResponse(response));
  if (!created.turnId || !created.sessionId) {
    throw new Error('Meguri Core 返回的回合信息不完整');
  }
  return created;
}

export async function cancelMeguriTurn(turnId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedTurnId = String(turnId || '').trim();
  if (!normalizedTurnId) {
    throw new Error('turnId is required');
  }
  const response = await request(`/api/v1/meguri/turns/${encodeURIComponent(normalizedTurnId)}/cancel`, {
    method: 'POST'
  });
  return unwrapApiResponse(response);
}

export async function getMeguriTurnStatus(turnId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedTurnId = String(turnId || '').trim();
  if (!normalizedTurnId) {
    throw new Error('turnId is required');
  }
  const response = await request(`/api/v1/meguri/turns/${encodeURIComponent(normalizedTurnId)}`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

/**
 * Load one sprite PNG through the authenticated gateway and return an object
 * URL. `rawFetch` must return a fetch Response (useAuthSession().authorizedRawFetch).
 */
export async function fetchMeguriSpriteObjectUrl(fileName, rawFetch) {
  if (typeof rawFetch !== 'function') {
    throw new Error('rawFetch is required for sprite loading');
  }
  const path = meguriSpritePath(fileName);
  if (!path) {
    throw new Error('sprite file name is invalid');
  }
  const response = await rawFetch(path, { method: 'GET' });
  if (!response || !response.ok) {
    const error = new Error(`立绘加载失败（HTTP ${response ? response.status : '网络错误'}）`);
    error.status = response ? response.status : 0;
    throw error;
  }
  const blob = await response.blob();
  return URL.createObjectURL(blob);
}
