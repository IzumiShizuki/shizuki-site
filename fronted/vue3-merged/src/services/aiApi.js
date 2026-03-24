import { httpRequest, normalizeApiData } from './httpClient';

function unwrapApiResponse(response) {
  return normalizeApiData(response);
}

function resolveRequest(authorizedFetch) {
  return typeof authorizedFetch === 'function' ? authorizedFetch : httpRequest;
}

function requireAuthorizedFetch(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required for this request');
  }
  return authorizedFetch;
}

export async function createAiSession(payload, authorizedFetch) {
  const request = resolveRequest(authorizedFetch);
  const response = await request('/api/v1/ai-sessions', {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function listAiSessions(authorizedFetch) {
  const request = resolveRequest(authorizedFetch);
  const response = await request('/api/v1/ai-sessions', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function sendAiMessage(sessionId, payload, authorizedFetch) {
  const normalizedSessionId = String(sessionId || '').trim();
  if (!normalizedSessionId) {
    throw new Error('sessionId is required');
  }
  const request = resolveRequest(authorizedFetch);
  const response = await request(`/api/v1/ai-sessions/${encodeURIComponent(normalizedSessionId)}/messages`, {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function getMyAiQuota(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/ai-quotas/me', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}
