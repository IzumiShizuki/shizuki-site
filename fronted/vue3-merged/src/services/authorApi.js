import { httpRequest, normalizeApiData } from './httpClient';

function unwrapApiResponse(response) {
  return normalizeApiData(response);
}

function requireAuthorizedFetch(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required for this request');
  }
  return authorizedFetch;
}

export async function getAuthorProfile(authorizedFetch) {
  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch('/api/v1/author/profile', { method: 'GET' })
      : await httpRequest('/api/v1/author/profile', { method: 'GET' });
  return unwrapApiResponse(response);
}

export async function getAdminAuthorProfile(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/author/profile', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function updateAdminAuthorProfile(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/author/profile', {
    method: 'PUT',
    body: {
      enabled: payload?.enabled !== false,
      profileJson: payload?.profileJson || {}
    }
  });
  return unwrapApiResponse(response);
}
