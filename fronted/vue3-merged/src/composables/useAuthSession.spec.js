import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { __resetAuthSessionForTest, useAuthSession } from './useAuthSession';

const AUTH_STORAGE_KEY = 'shizuki.auth.v1';
const USER_STORAGE_KEY = 'shizuki.user.v1';
const OAUTH_PENDING_KEY = 'shizuki.oauth.pending.v1';

function jsonResponse(status, payload) {
  return new Response(JSON.stringify(payload), {
    status,
    headers: {
      'Content-Type': 'application/json'
    }
  });
}

function delayedJsonResponse(delayMs, status, payload) {
  return new Promise((resolve) => {
    setTimeout(() => resolve(jsonResponse(status, payload)), delayMs);
  });
}

describe('useAuthSession', () => {
  const originalFetch = globalThis.fetch;

  beforeEach(() => {
    __resetAuthSessionForTest();
    window.localStorage.clear();
    window.sessionStorage.clear();
    window.location.hash = '#/';
    vi.restoreAllMocks();
  });

  afterEach(() => {
    globalThis.fetch = originalFetch;
  });

  it('logs in by email and persists refresh token + user snapshot', async () => {
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'access-token-1',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'refresh-token-1',
            refresh_expires_in_sec: 2592000,
            user_id: 7,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 7,
            nickname: 'Shizuki',
            groups: ['USER'],
            permissions: ['music.read']
          }
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await auth.loginByEmail({
      email: 'demo@example.com',
      password: 'password-123'
    });

    expect(auth.isAuthenticated.value).toBe(true);
    expect(auth.user.value?.nickname).toBe('Shizuki');

    const savedAuth = JSON.parse(window.localStorage.getItem(AUTH_STORAGE_KEY) || '{}');
    expect(savedAuth.refreshToken).toBe('refresh-token-1');

    const savedUser = JSON.parse(window.localStorage.getItem(USER_STORAGE_KEY) || '{}');
    expect(savedUser.nickname).toBe('Shizuki');

    const firstRequestBody = JSON.parse(fetchMock.mock.calls[0][1].body);
    expect(firstRequestBody.grant_type).toBe('EMAIL_PASSWORD');
    expect(firstRequestBody.email).toBe('demo@example.com');
    expect(firstRequestBody.password).toBe('password-123');
  });

  it('starts OAuth login with root callback redirect_uri and stores pending state', async () => {
    const fetchMock = vi.fn().mockResolvedValueOnce(
      jsonResponse(200, {
        data: {
          oauth_login_id: 'oauth-login-001',
          authorize_url: 'https://github.com/login/oauth/authorize?client_id=demo',
          state: 'state-001'
        }
      })
    );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    try {
      await auth.startOAuthLogin('github', '/profile');
    } catch {
      // jsdom may throw on window.location.assign navigation.
    }

    const requestBody = JSON.parse(fetchMock.mock.calls[0][1].body || '{}');
    expect(requestBody.redirect_uri).toBe(`${window.location.origin}${window.location.pathname}`);
    expect(requestBody.redirect_uri.includes('#')).toBe(false);

    const pendingAll = JSON.parse(window.sessionStorage.getItem(OAUTH_PENDING_KEY) || '{}');
    expect(pendingAll.states?.['state-001']?.oauthLoginId).toBe('oauth-login-001');
  });

  it('consumes OAuth pending state after callback token exchange', async () => {
    window.sessionStorage.setItem(
      OAUTH_PENDING_KEY,
      JSON.stringify({
        states: {
          'state-xyz': {
            provider: 'github',
            oauthLoginId: 'oauth-login-xyz',
            redirect: '/profile',
            createdAt: Date.now()
          }
        }
      })
    );

    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'oauth-access-token',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'oauth-refresh-token',
            refresh_expires_in_sec: 2592000,
            user_id: 11,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 11,
            nickname: 'OAuth User',
            groups: ['USER'],
            permissions: []
          }
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    const result = await auth.handleOAuthCallback({
      code: 'oauth-code-1',
      state: 'state-xyz'
    });

    expect(result.resultType).toBe('TOKEN_ISSUED');
    expect(result.redirect).toBe('/profile');

    const tokenExchangeBody = JSON.parse(fetchMock.mock.calls[0][1].body || '{}');
    expect(tokenExchangeBody.oauth_login_id).toBe('oauth-login-xyz');
    expect(tokenExchangeBody.state).toBe('state-xyz');
    expect(tokenExchangeBody.code).toBe('oauth-code-1');

    const pendingAllAfter = JSON.parse(window.sessionStorage.getItem(OAUTH_PENDING_KEY) || '{}');
    expect(pendingAllAfter.states?.['state-xyz']).toBeUndefined();
  });

  it('removes OAuth pending state when callback result is BIND_REQUIRED', async () => {
    window.sessionStorage.setItem(
      OAUTH_PENDING_KEY,
      JSON.stringify({
        states: {
          'state-bind': {
            provider: 'linuxdo',
            oauthLoginId: 'oauth-login-bind',
            redirect: '/profile',
            createdAt: Date.now()
          }
        }
      })
    );

    const fetchMock = vi.fn().mockResolvedValueOnce(
      jsonResponse(200, {
        data: {
          result_type: 'BIND_REQUIRED',
          bind_ticket: 'bind-ticket-001'
        }
      })
    );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    const result = await auth.handleOAuthCallback({
      code: 'oauth-code-bind',
      state: 'state-bind'
    });

    expect(result).toEqual({
      resultType: 'BIND_REQUIRED',
      bindTicket: 'bind-ticket-001',
      redirect: '/profile'
    });

    const pendingAllAfter = JSON.parse(window.sessionStorage.getItem(OAUTH_PENDING_KEY) || '{}');
    expect(pendingAllAfter.states?.['state-bind']).toBeUndefined();
  });

  it('handles OAuth bind scene callback and calls /api/v1/me/bindings/oauth', async () => {
    window.localStorage.setItem(
      AUTH_STORAGE_KEY,
      JSON.stringify({
        refreshToken: 'refresh-token-bind',
        updatedAt: Date.now()
      })
    );
    window.localStorage.setItem(
      USER_STORAGE_KEY,
      JSON.stringify({
        userId: 12,
        nickname: 'Bind User',
        groups: ['USER'],
        permissions: []
      })
    );
    window.sessionStorage.setItem(
      OAUTH_PENDING_KEY,
      JSON.stringify({
        states: {
          'state-bind-ok': {
            provider: 'github',
            oauthLoginId: 'oauth-login-bind-ok',
            redirect: '/profile?tab=account',
            scene: 'BIND',
            createdAt: Date.now()
          }
        }
      })
    );

    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'bind-access-token',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'bind-refresh-token',
            refresh_expires_in_sec: 2592000,
            user_id: 12,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 12,
            nickname: 'Bind User',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            status: 'OK'
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 12,
            nickname: 'Bind User Updated',
            groups: ['USER'],
            permissions: []
          }
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    const result = await auth.handleOAuthCallback({
      code: 'oauth-code-bind-ok',
      state: 'state-bind-ok'
    });

    expect(result).toEqual({
      resultType: 'BIND_SUCCESS',
      redirect: '/profile?tab=account'
    });

    const bindRequestBody = JSON.parse(fetchMock.mock.calls[2][1].body || '{}');
    expect(bindRequestBody.provider).toBe('github');
    expect(bindRequestBody.oauth_login_id).toBe('oauth-login-bind-ok');
    expect(bindRequestBody.code).toBe('oauth-code-bind-ok');
    expect(bindRequestBody.state).toBe('state-bind-ok');

    const pendingAllAfter = JSON.parse(window.sessionStorage.getItem(OAUTH_PENDING_KEY) || '{}');
    expect(pendingAllAfter.states?.['state-bind-ok']).toBeUndefined();
  });

  it('keeps OAuth pending state when callback token exchange fails', async () => {
    window.sessionStorage.setItem(
      OAUTH_PENDING_KEY,
      JSON.stringify({
        states: {
          'state-failed': {
            provider: 'github',
            oauthLoginId: 'oauth-login-failed',
            redirect: '/profile',
            createdAt: Date.now()
          }
        }
      })
    );

    const fetchMock = vi.fn().mockResolvedValueOnce(
      jsonResponse(400, {
        code: 'BAD_REQUEST',
        detail:
          'OAuth provider configuration or request invalid: OAuth token endpoint error: bad_verification_code'
      })
    );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await expect(
      auth.handleOAuthCallback({
        code: 'oauth-code-failed',
        state: 'state-failed'
      })
    ).rejects.toBeTruthy();

    const pendingAllAfter = JSON.parse(window.sessionStorage.getItem(OAUTH_PENDING_KEY) || '{}');
    expect(pendingAllAfter.states?.['state-failed']?.oauthLoginId).toBe('oauth-login-failed');
  });

  it('exposes OAuth pending snapshot for callback retry actions', () => {
    window.sessionStorage.setItem(
      OAUTH_PENDING_KEY,
      JSON.stringify({
        states: {
          'state-retry': {
            provider: 'github',
            oauthLoginId: 'oauth-login-retry',
            redirect: '/profile',
            createdAt: Date.now()
          }
        }
      })
    );

    const auth = useAuthSession();
    const pending = auth.peekOAuthPending('state-retry');

    expect(pending).toEqual(
      expect.objectContaining({
        provider: 'github',
        oauthLoginId: 'oauth-login-retry',
        redirect: '/profile',
        scene: 'LOGIN'
      })
    );
  });

  it('simulates full frontend OAuth login flow from authorization to session ready', async () => {
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            oauth_login_id: 'oauth-login-flow',
            authorize_url: 'https://github.com/login/oauth/authorize?client_id=demo&state=state-flow',
            state: 'state-flow'
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'flow-access-token',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'flow-refresh-token',
            refresh_expires_in_sec: 2592000,
            user_id: 42,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 42,
            nickname: 'Flow User',
            groups: ['USER'],
            permissions: ['music.read']
          }
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    try {
      await auth.startOAuthLogin('github', '/profile');
    } catch {
      // jsdom may throw on window.location.assign navigation.
    }
    const callbackResult = await auth.handleOAuthCallback({
      code: 'oauth-code-flow',
      state: 'state-flow'
    });

    expect(callbackResult).toEqual({
      resultType: 'TOKEN_ISSUED',
      redirect: '/profile'
    });
    expect(auth.isAuthenticated.value).toBe(true);
    expect(auth.user.value?.nickname).toBe('Flow User');

    const savedAuth = JSON.parse(window.localStorage.getItem(AUTH_STORAGE_KEY) || '{}');
    expect(savedAuth.refreshToken).toBe('flow-refresh-token');

    const authorizeBody = JSON.parse(fetchMock.mock.calls[0][1].body || '{}');
    expect(authorizeBody.provider).toBe('github');
    expect(authorizeBody.scene).toBe('LOGIN');

    const tokenBody = JSON.parse(fetchMock.mock.calls[1][1].body || '{}');
    expect(tokenBody.grant_type).toBe('OAUTH_CODE');
    expect(tokenBody.oauth_login_id).toBe('oauth-login-flow');
    expect(tokenBody.code).toBe('oauth-code-flow');
  });

  it('uploads avatar through direct OSS path when direct upload succeeds', async () => {
    const file = new File([new Uint8Array([1, 2, 3, 4])], 'avatar.png', { type: 'image/png' });
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'avatar-access-1',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'avatar-refresh-1',
            refresh_expires_in_sec: 2592000,
            user_id: 21,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 21,
            nickname: 'Avatar User',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            bucket: 'shizuki-public',
            key: 'assets/user-21/avatar.png',
            upload_url: 'https://oss.example.com/upload-avatar',
            expire_seconds: 300,
            asset_kind: 'STATIC_IMAGE'
          }
        })
      )
      .mockResolvedValueOnce(new Response('', { status: 200 }))
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            asset_id: 301
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            public_url: 'https://cdn.example.com/avatar-301.png'
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 21,
            nickname: 'Avatar User',
            avatar_url: 'https://cdn.example.com/avatar-301.png',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 21,
            nickname: 'Avatar User',
            avatar_url: 'https://cdn.example.com/avatar-301.png',
            groups: ['USER'],
            permissions: []
          }
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await auth.loginByEmail({
      email: 'avatar@example.com',
      password: 'password-123'
    });

    const result = await auth.uploadAvatar(file);

    expect(result).toEqual({
      avatarUrl: 'https://cdn.example.com/avatar-301.png',
      relayUsed: false
    });
    expect(fetchMock.mock.calls.some(([url]) => String(url).includes('/api/v1/assets/upload-relay'))).toBe(false);
  });

  it('falls back to relay upload when direct OSS upload fails', async () => {
    const file = new File([new Uint8Array([1, 2, 3, 4])], 'avatar.png', { type: 'image/png' });
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'avatar-access-2',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'avatar-refresh-2',
            refresh_expires_in_sec: 2592000,
            user_id: 22,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 22,
            nickname: 'Relay User',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            bucket: 'shizuki-public',
            key: 'assets/user-22/avatar.png',
            upload_url: 'https://oss.example.com/upload-avatar',
            expire_seconds: 300,
            asset_kind: 'STATIC_IMAGE'
          }
        })
      )
      .mockResolvedValueOnce(new Response('', { status: 500 }))
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            bucket: 'shizuki-public',
            key: 'assets/user-22/avatar-relay.png',
            content_type: 'image/png',
            asset_kind: 'STATIC_IMAGE',
            upload_strategy: 'RELAY_OSS'
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            asset_id: 401
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            public_url: 'https://cdn.example.com/avatar-401.png'
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 22,
            nickname: 'Relay User',
            avatar_url: 'https://cdn.example.com/avatar-401.png',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 22,
            nickname: 'Relay User',
            avatar_url: 'https://cdn.example.com/avatar-401.png',
            groups: ['USER'],
            permissions: []
          }
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await auth.loginByEmail({
      email: 'relay@example.com',
      password: 'password-123'
    });

    const result = await auth.uploadAvatar(file);

    expect(result).toEqual({
      avatarUrl: 'https://cdn.example.com/avatar-401.png',
      relayUsed: true
    });
    expect(fetchMock.mock.calls.some(([url]) => String(url).includes('/api/v1/assets/upload-relay'))).toBe(true);
  });

  it('throws detailed error when direct and relay upload both fail', async () => {
    const file = new File([new Uint8Array([1, 2, 3, 4])], 'avatar.png', { type: 'image/png' });
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'avatar-access-3',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'avatar-refresh-3',
            refresh_expires_in_sec: 2592000,
            user_id: 23,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 23,
            nickname: 'Relay Failed User',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            bucket: 'shizuki-public',
            key: 'assets/user-23/avatar.png',
            upload_url: 'https://oss.example.com/upload-avatar',
            expire_seconds: 300,
            asset_kind: 'STATIC_IMAGE'
          }
        })
      )
      .mockResolvedValueOnce(new Response('', { status: 500 }))
      .mockResolvedValueOnce(
        jsonResponse(500, {
          code: 'INTERNAL_ERROR',
          detail: 'Relay upload failed'
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await auth.loginByEmail({
      email: 'relay-failed@example.com',
      password: 'password-123'
    });

    await expect(auth.uploadAvatar(file)).rejects.toThrow(/Avatar upload failed/);
  });

  it('refreshes token and retries once when protected request returns 401 UNAUTHORIZED', async () => {
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'access-token-1',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'refresh-token-1',
            refresh_expires_in_sec: 2592000,
            user_id: 9,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 9,
            nickname: 'Initial User',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(401, {
          code: 'UNAUTHORIZED',
          detail: 'Access token expired'
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'access-token-2',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'refresh-token-2',
            refresh_expires_in_sec: 2592000,
            user_id: 9,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 9,
            nickname: 'Refreshed User',
            groups: ['USER'],
            permissions: ['music.read']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            ok: true
          }
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await auth.loginByEmail({
      email: 'demo@example.com',
      password: 'password-123'
    });

    const response = await auth.authorizedFetch('/api/v1/protected/resource', {
      method: 'GET'
    });

    expect(response?.data?.ok).toBe(true);
    expect(auth.user.value?.nickname).toBe('Refreshed User');

    const firstProtectedHeaders = fetchMock.mock.calls[2][1].headers;
    const retryProtectedHeaders = fetchMock.mock.calls[5][1].headers;
    expect(firstProtectedHeaders.Authorization).toBe('Bearer access-token-1');
    expect(retryProtectedHeaders.Authorization).toBe('Bearer access-token-2');

    const refreshBody = JSON.parse(fetchMock.mock.calls[3][1].body);
    expect(refreshBody.grant_type).toBe('REFRESH_TOKEN');
    expect(refreshBody.refresh_token).toBe('refresh-token-1');
  });

  it('prompts for re-login and clears session when account request hits 401 and refresh also fails', async () => {
    window.location.hash = '#/profile?tab=account';
    const confirmSpy = vi.spyOn(window, 'confirm').mockReturnValue(true);
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'access-token-1',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'refresh-token-1',
            refresh_expires_in_sec: 2592000,
            user_id: 18,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 18,
            nickname: 'Session User',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(401, {
          code: 'TOKEN_EXPIRED',
          detail: 'Access token expired'
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(401, {
          code: 'REFRESH_TOKEN_EXPIRED',
          detail: 'Refresh token expired'
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await auth.loginByEmail({
      email: 'session@example.com',
      password: 'password-123'
    });

    await expect(auth.getAccountProfile()).rejects.toBeTruthy();

    expect(confirmSpy).toHaveBeenCalledWith('当前登录态已失效，是否前往登录页面重新登录？');
    expect(auth.isAuthenticated.value).toBe(false);
    expect(window.localStorage.getItem(AUTH_STORAGE_KEY)).toBeNull();
    expect(window.localStorage.getItem(USER_STORAGE_KEY)).toBeNull();
    expect(window.location.hash).toContain('/auth?');
    expect(window.location.hash).toContain('reason=session_expired');
    expect(decodeURIComponent(window.location.hash)).toContain('redirect=/profile?tab=account');
  });

  it('leaves protected route when re-login prompt is declined after 401 failure', async () => {
    window.location.hash = '#/profile';
    const confirmSpy = vi.spyOn(window, 'confirm').mockReturnValue(false);
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'access-token-1',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'refresh-token-1',
            refresh_expires_in_sec: 2592000,
            user_id: 19,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 19,
            nickname: 'Decline User',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(401, {
          code: 'ACCESS_DENIED',
          detail: 'Access token rejected'
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(401, {
          code: 'REFRESH_DENIED',
          detail: 'Refresh token rejected'
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await auth.loginByEmail({
      email: 'decline@example.com',
      password: 'password-123'
    });

    await expect(
      auth.authorizedFetch('/api/v1/protected/resource', {
        method: 'GET'
      })
    ).rejects.toBeTruthy();

    expect(confirmSpy).toHaveBeenCalledWith('当前登录态已失效，是否前往登录页面重新登录？');
    expect(auth.isAuthenticated.value).toBe(false);
    expect(window.location.hash).toBe('#/');
  });

  it('uses single-flight promise for concurrent refresh requests', async () => {
    const fetchMock = vi
      .fn()
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'access-token-1',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'refresh-token-1',
            refresh_expires_in_sec: 2592000,
            user_id: 3,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 3,
            nickname: 'User3',
            groups: ['USER'],
            permissions: []
          }
        })
      )
      .mockImplementationOnce(() =>
        delayedJsonResponse(30, 200, {
          data: {
            result_type: 'TOKEN_ISSUED',
            access_token: 'access-token-2',
            token_type: 'Bearer',
            expires_in_sec: 900,
            refresh_token: 'refresh-token-2',
            refresh_expires_in_sec: 2592000,
            user_id: 3,
            groups: ['USER']
          }
        })
      )
      .mockResolvedValueOnce(
        jsonResponse(200, {
          data: {
            user_id: 3,
            nickname: 'User3 refreshed',
            groups: ['USER'],
            permissions: ['music.read']
          }
        })
      );
    globalThis.fetch = fetchMock;

    const auth = useAuthSession();
    await auth.loginByEmail({
      email: 'demo@example.com',
      password: 'password-123'
    });

    await Promise.all([auth.refreshAccessToken(), auth.refreshAccessToken()]);

    const refreshCalls = fetchMock.mock.calls.filter(([url, options]) => {
      if (!String(url).endsWith('/api/v1/auth/tokens')) return false;
      const body = JSON.parse(options.body || '{}');
      return body.grant_type === 'REFRESH_TOKEN';
    });

    expect(refreshCalls).toHaveLength(1);
    expect(auth.user.value?.nickname).toBe('User3 refreshed');
  });
});
