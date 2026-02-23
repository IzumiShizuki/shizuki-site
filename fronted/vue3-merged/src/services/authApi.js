import { httpRequest, normalizeApiData } from './httpClient';

const BACKEND_TIMEOUT_MS = 5000;

function backendRequest(path, options = {}) {
  return httpRequest(path, {
    ...options,
    timeoutMs: BACKEND_TIMEOUT_MS
  });
}

function unwrapApiResponse(response) {
  return normalizeApiData(response);
}

export async function issueToken(payload) {
  const response = await backendRequest('/api/v1/auth/tokens', {
    method: 'POST',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function registerByEmail(payload) {
  const response = await backendRequest('/api/v1/auth/register/email', {
    method: 'POST',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function createImageCaptcha() {
  const response = await backendRequest('/api/v1/auth/captchas/image', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function sendEmailVerification(payload) {
  const response = await backendRequest('/api/v1/auth/verifications/email/send', {
    method: 'POST',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function resetPasswordByEmail(payload) {
  const response = await backendRequest('/api/v1/auth/password/reset', {
    method: 'POST',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function createOAuthAuthorization(payload) {
  const response = await backendRequest('/api/v1/auth/oauth/authorizations', {
    method: 'POST',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function confirmConflictBinding(payload) {
  const response = await backendRequest('/api/v1/auth/bindings/confirm', {
    method: 'POST',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function logout(payload, accessToken) {
  const response = await backendRequest('/api/v1/auth/logout', {
    method: 'POST',
    body: payload,
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function getCurrentUser(accessToken) {
  const response = await backendRequest('/api/v1/me', {
    method: 'GET',
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function getMeAccount(accessToken) {
  const response = await backendRequest('/api/v1/me/account', {
    method: 'GET',
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function updateMeProfile(payload, accessToken) {
  const response = await backendRequest('/api/v1/me/profile', {
    method: 'PUT',
    body: payload,
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function changeMePassword(payload, accessToken) {
  const response = await backendRequest('/api/v1/me/password', {
    method: 'PUT',
    body: payload,
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function bindEmailCredential(payload, accessToken) {
  const response = await backendRequest('/api/v1/me/bindings/email', {
    method: 'POST',
    body: payload,
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function bindOAuthCredential(payload, accessToken) {
  const response = await backendRequest('/api/v1/me/bindings/oauth', {
    method: 'POST',
    body: payload,
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function createUploadPolicy(payload, accessToken) {
  const response = await backendRequest('/api/v1/assets/upload-policies', {
    method: 'POST',
    body: payload,
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function createAsset(payload, accessToken) {
  const response = await backendRequest('/api/v1/assets', {
    method: 'POST',
    body: payload,
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}

export async function getAssetDownloadUrl(assetId, accessToken) {
  const response = await backendRequest(`/api/v1/assets/${encodeURIComponent(assetId)}/download-url`, {
    method: 'GET',
    auth: true,
    accessToken
  });
  return unwrapApiResponse(response);
}
