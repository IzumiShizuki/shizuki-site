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

export async function listAiTownScenes(authorizedFetch) {
  const request = resolveRequest(authorizedFetch);
  const response = await request('/api/v1/ai-town/scenes', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getAiTownScene(sceneCode, authorizedFetch) {
  const request = resolveRequest(authorizedFetch);
  const normalizedSceneCode = String(sceneCode || '').trim();
  if (!normalizedSceneCode) {
    throw new Error('sceneCode is required');
  }
  const response = await request(`/api/v1/ai-town/scenes/${encodeURIComponent(normalizedSceneCode)}`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getAiTownPublicMap(authorizedFetch) {
  const request = resolveRequest(authorizedFetch);
  const response = await request('/api/v1/ai-town/public-map', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function createAdminTownNpcSession(npcCode, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedNpcCode = String(npcCode || '').trim();
  if (!normalizedNpcCode) {
    throw new Error('npcCode is required');
  }
  const response = await request(`/api/v1/admin/ai-town/npcs/${encodeURIComponent(normalizedNpcCode)}/sessions`, {
    method: 'POST'
  });
  return unwrapApiResponse(response);
}

export async function createAiCharacter(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/ai-characters', {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function importAiCharacterCard(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/ai-character-cards/import', {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function listAiCharacters(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/ai-characters', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getAiCharacter(characterId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(characterId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('characterId is required');
  }
  const response = await request(`/api/v1/ai-characters/${encodeURIComponent(normalizedId)}`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function createAiWorldbook(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/ai-worldbooks', {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function listAiWorldbooks(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/ai-worldbooks', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getAiWorldbook(worldbookId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(worldbookId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('worldbookId is required');
  }
  const response = await request(`/api/v1/ai-worldbooks/${encodeURIComponent(normalizedId)}`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function updateAiWorldbook(worldbookId, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(worldbookId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('worldbookId is required');
  }
  const response = await request(`/api/v1/ai-worldbooks/${encodeURIComponent(normalizedId)}`, {
    method: 'PUT',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function createAiWorldbookEntry(worldbookId, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(worldbookId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('worldbookId is required');
  }
  const response = await request(`/api/v1/ai-worldbooks/${encodeURIComponent(normalizedId)}/entries`, {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function updateAiWorldbookEntry(worldbookId, entryId, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedWorldbookId = Number(worldbookId);
  const normalizedEntryId = Number(entryId);
  if (!Number.isFinite(normalizedWorldbookId) || normalizedWorldbookId <= 0) {
    throw new Error('worldbookId is required');
  }
  if (!Number.isFinite(normalizedEntryId) || normalizedEntryId <= 0) {
    throw new Error('entryId is required');
  }
  const response = await request(
    `/api/v1/ai-worldbooks/${encodeURIComponent(normalizedWorldbookId)}/entries/${encodeURIComponent(normalizedEntryId)}`,
    {
      method: 'PUT',
      body: payload || {}
    }
  );
  return unwrapApiResponse(response);
}
