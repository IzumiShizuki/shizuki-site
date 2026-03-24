import { httpRequest, isUnauthorizedProblem, normalizeApiData } from './httpClient';

function unwrapApiResponse(response) {
  return normalizeApiData(response);
}

function requireAuthorizedFetch(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required for this request');
  }
  return authorizedFetch;
}

export async function getDefaultPlaylistBundle() {
  const response = await httpRequest('/api/v1/music/playlist/default/bundle', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getMusicLibraryHome(authorizedFetch) {
  const response = typeof authorizedFetch === 'function'
    ? await authorizedFetch('/api/v1/music/library/home', { method: 'GET' })
    : await httpRequest('/api/v1/music/library/home', { method: 'GET' });
  return unwrapApiResponse(response);
}

export async function searchMusic(query, options = {}, authorizedFetch) {
  const payload = {
    method: 'GET',
    query: {
      q: String(query || '').trim(),
      type: String(options?.type || 'all').trim(),
      providers: Array.isArray(options?.providers) ? options.providers.join(',') : String(options?.providers || '').trim(),
      page: Number.isFinite(Number(options?.page)) ? Number(options.page) : 1,
      limit: Number.isFinite(Number(options?.limit)) ? Number(options.limit) : 24
    }
  };
  const response = typeof authorizedFetch === 'function'
    ? await authorizedFetch('/api/v1/music/search', payload)
    : await httpRequest('/api/v1/music/search', payload);
  return unwrapApiResponse(response);
}

export async function getPlaylistBundleByCode(playlistCode, authorizedFetch) {
  const code = String(playlistCode || '').trim();
  if (!code) {
    throw new Error('playlistCode is required');
  }
  const path = `/api/v1/music/playlists/${encodeURIComponent(code)}/bundle`;
  const response = typeof authorizedFetch === 'function'
    ? await authorizedFetch(path, { method: 'GET' })
    : await httpRequest(path, { method: 'GET' });
  return unwrapApiResponse(response);
}

export async function resolvePlaybackTrack(payload, authorizedFetch) {
  const requestPayload = payload && typeof payload === 'object' ? payload : {};
  if (typeof authorizedFetch === 'function') {
    try {
      const response = await authorizedFetch('/api/v1/music/tracks/resolve-playback', {
        method: 'POST',
        body: requestPayload
      });
      return unwrapApiResponse(response);
    } catch (error) {
      if (!isUnauthorizedProblem(error)) {
        throw error;
      }
    }
  }

  const response = await httpRequest('/api/v1/music/tracks/resolve-playback', {
    method: 'POST',
    body: requestPayload
  });
  return unwrapApiResponse(response);
}

export async function listMusicProviders() {
  const response = await httpRequest('/api/v1/music/providers', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getMusicKeyGuide(provider) {
  const response = await httpRequest('/api/v1/music/key-guide', {
    method: 'GET',
    query: { provider }
  });
  return unwrapApiResponse(response);
}

export async function pickMusic(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/music/picks', {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function getMyMusicQuota(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/music/quota/me', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getMyMusicLibrarySidebar(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/me/music/library/sidebar', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function createMyMusicPlaylist(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/me/music/playlists', {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function updateMyMusicPlaylist(playlistCode, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const code = String(playlistCode || '').trim();
  if (!code) {
    throw new Error('playlistCode is required');
  }
  const response = await request(`/api/v1/me/music/playlists/${encodeURIComponent(code)}`, {
    method: 'PUT',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function deleteMyMusicPlaylist(playlistCode, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const code = String(playlistCode || '').trim();
  if (!code) {
    throw new Error('playlistCode is required');
  }
  const response = await request(`/api/v1/me/music/playlists/${encodeURIComponent(code)}`, {
    method: 'DELETE'
  });
  return unwrapApiResponse(response);
}

export async function upsertMyMusicPlaylistTrack(playlistCode, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const code = String(playlistCode || '').trim();
  if (!code) {
    throw new Error('playlistCode is required');
  }
  const response = await request(`/api/v1/me/music/playlists/${encodeURIComponent(code)}/tracks`, {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function deleteMyMusicPlaylistTrack(playlistCode, provider, trackId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const code = String(playlistCode || '').trim();
  if (!code) {
    throw new Error('playlistCode is required');
  }
  const response = await request(`/api/v1/me/music/playlists/${encodeURIComponent(code)}/tracks`, {
    method: 'DELETE',
    query: {
      provider,
      track_id: trackId
    }
  });
  return unwrapApiResponse(response);
}

export async function collectPlaylist(playlistCode, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const code = String(playlistCode || '').trim();
  if (!code) {
    throw new Error('playlistCode is required');
  }
  const response = await request(`/api/v1/me/music/playlists/${encodeURIComponent(code)}/collect`, {
    method: 'POST'
  });
  return unwrapApiResponse(response);
}

export async function uncollectPlaylist(playlistCode, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const code = String(playlistCode || '').trim();
  if (!code) {
    throw new Error('playlistCode is required');
  }
  const response = await request(`/api/v1/me/music/playlists/${encodeURIComponent(code)}/collect`, {
    method: 'DELETE'
  });
  return unwrapApiResponse(response);
}

export async function getAdminDefaultPlaylistBundle(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/music/default-playlist/bundle', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function replaceAdminDefaultPlaylistBundle(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/music/default-playlist/bundle', {
    method: 'PUT',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function upsertAdminDefaultPlaylistTrack(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/music/default-playlist/tracks', {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function listAdminProviders(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/music/providers', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function updateAdminProviderVisibility(provider, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/admin/music/providers/${encodeURIComponent(provider)}/visibility`, {
    method: 'PUT',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function listAdminProviderGuides(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/music/provider-guides', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function upsertAdminProviderGuide(provider, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/admin/music/provider-guides/${encodeURIComponent(provider)}`, {
    method: 'PUT',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function upsertMusicApiKey(provider, apiKey, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/me/music/api-keys/${encodeURIComponent(provider)}`, {
    method: 'PUT',
    body: {
      apiKey: String(apiKey || '').trim()
    }
  });
  return unwrapApiResponse(response);
}

export async function getMusicApiKeyStatus(provider, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/me/music/api-keys/${encodeURIComponent(provider)}/status`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function deleteMusicApiKey(provider, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/me/music/api-keys/${encodeURIComponent(provider)}`, {
    method: 'DELETE'
  });
  return unwrapApiResponse(response);
}

export async function getMusicSourceAccountStatus(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/me/music/source-accounts/status', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function upsertMusicSourceAccountCookie(provider, cookie, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/me/music/source-accounts/${encodeURIComponent(provider)}/cookie`, {
    method: 'PUT',
    body: {
      cookie: String(cookie || '').trim()
    }
  });
  return unwrapApiResponse(response);
}

export async function deleteMusicSourceAccount(provider, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/me/music/source-accounts/${encodeURIComponent(provider)}`, {
    method: 'DELETE'
  });
  return unwrapApiResponse(response);
}

export async function importMusicSourcePlaylists(provider, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/me/music/source-accounts/${encodeURIComponent(provider)}/import-playlists`, {
    method: 'POST'
  });
  return unwrapApiResponse(response);
}

export async function createMusicSourceBindSession(provider, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request(`/api/v1/me/music/source-accounts/${encodeURIComponent(provider)}/bind-sessions`, {
    method: 'POST'
  });
  return unwrapApiResponse(response);
}

export async function getMusicSourceBindSession(provider, sessionId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedSessionId = String(sessionId || '').trim();
  if (!normalizedSessionId) {
    throw new Error('sessionId is required');
  }
  const response = await request(
    `/api/v1/me/music/source-accounts/${encodeURIComponent(provider)}/bind-sessions/${encodeURIComponent(normalizedSessionId)}`,
    {
      method: 'GET'
    }
  );
  return unwrapApiResponse(response);
}

export async function completeMusicSourceBindSession(provider, sessionId, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedSessionId = String(sessionId || '').trim();
  if (!normalizedSessionId) {
    throw new Error('sessionId is required');
  }
  const response = await request(
    `/api/v1/me/music/source-accounts/${encodeURIComponent(provider)}/bind-sessions/${encodeURIComponent(normalizedSessionId)}/complete`,
    {
      method: 'POST',
      body: payload || {}
    }
  );
  return unwrapApiResponse(response);
}

export async function searchSpotifyTracks(query, limit, authorizedFetch) {
  const payload = {
    method: 'GET',
    query: {
      q: String(query || '').trim(),
      limit: Number.isFinite(Number(limit)) ? Number(limit) : 12
    }
  };
  const response = typeof authorizedFetch === 'function'
    ? await authorizedFetch('/api/v1/music/spotify/search', payload)
    : await httpRequest('/api/v1/music/spotify/search', payload);
  return unwrapApiResponse(response);
}

export async function getSpotifyPreview(trackId, authorizedFetch) {
  const payload = {
    method: 'GET',
    query: {
      track_id: String(trackId || '').trim()
    }
  };
  const response = typeof authorizedFetch === 'function'
    ? await authorizedFetch('/api/v1/music/spotify/preview-url', payload)
    : await httpRequest('/api/v1/music/spotify/preview-url', payload);
  return unwrapApiResponse(response);
}
