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

export async function listPublicWallpapers() {
  const response = await httpRequest('/api/v1/home-wallpapers/public', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function listWallpaperLibrary(scope = 'my', authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/home-wallpapers/library', {
    method: 'GET',
    query: {
      scope: String(scope || 'my').trim().toLowerCase()
    }
  });
  return unwrapApiResponse(response);
}

export async function importWallpaperPackage(file, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  if (!(file instanceof File)) {
    throw new Error('请选择要上传的资源包文件');
  }

  const formData = new FormData();
  formData.append('file', file, file.name || 'wallpaper-package.zip');
  if (payload?.visibility) {
    formData.append('visibility', String(payload.visibility));
  }
  if (payload?.title) {
    formData.append('title', String(payload.title));
  }

  const response = await request('/api/v1/home-wallpapers/imports/package', {
    method: 'POST',
    body: formData
  });
  return unwrapApiResponse(response);
}

export async function importWallpaperWorkshop(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/home-wallpapers/imports/workshop', {
    method: 'POST',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function getWallpaperImportJob(jobId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(jobId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('jobId is required');
  }
  const response = await request(`/api/v1/home-wallpapers/imports/${encodeURIComponent(normalizedId)}`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function updateWallpaperSettings(wallpaperId, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(wallpaperId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('wallpaperId is required');
  }
  const response = await request(`/api/v1/home-wallpapers/${encodeURIComponent(normalizedId)}/settings`, {
    method: 'PUT',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function updateWallpaperVisibility(wallpaperId, visibility, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(wallpaperId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('wallpaperId is required');
  }
  const response = await request(`/api/v1/home-wallpapers/${encodeURIComponent(normalizedId)}/visibility`, {
    method: 'PUT',
    body: {
      visibility
    }
  });
  return unwrapApiResponse(response);
}

export async function deleteWallpaper(wallpaperId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(wallpaperId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('wallpaperId is required');
  }
  const response = await request(`/api/v1/home-wallpapers/${encodeURIComponent(normalizedId)}`, {
    method: 'DELETE'
  });
  return unwrapApiResponse(response);
}

export async function listPendingWallpapers(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/home-wallpapers/pending', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function auditWallpaper(wallpaperId, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const normalizedId = Number(wallpaperId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('wallpaperId is required');
  }
  const response = await request(`/api/v1/admin/home-wallpapers/${encodeURIComponent(normalizedId)}/audit-status`, {
    method: 'PUT',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}
