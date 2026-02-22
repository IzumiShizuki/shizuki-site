function parseSearch(search) {
  const params = new URLSearchParams(String(search || ''));
  const code = params.get('code') || '';
  const state = params.get('state') || '';
  return { code, state };
}

export function resolveOAuthCallbackRedirect(path, search) {
  if (String(path || '') === '/auth/callback') {
    return null;
  }
  const { code, state } = parseSearch(search);
  if (!code || !state) {
    return null;
  }
  return { path: '/auth/callback' };
}

