import { computed, readonly, ref } from 'vue';
import * as authApi from '../services/authApi';
import { httpRequest, HttpError, isUnauthorizedProblem } from '../services/httpClient';

const AUTH_STORAGE_KEY = 'shizuki.auth.v1';
const USER_STORAGE_KEY = 'shizuki.user.v1';
const OAUTH_PENDING_KEY = 'shizuki.oauth.pending.v1';
const OAUTH_PENDING_TTL_MS = 10 * 60 * 1000;
const LEGACY_CLEAR_KEYS = [AUTH_STORAGE_KEY, 'shizuki.session.v1', USER_STORAGE_KEY, 'shizuki.userProfile.v1'];

let sessionSingleton;

function normalizeRoutePath(path) {
  if (!path || typeof path !== 'string') return '/profile';
  if (!path.startsWith('/')) return '/profile';
  if (path.startsWith('/auth')) return '/profile';
  return path;
}

function parseJsonSafe(raw, fallback) {
  if (!raw) return fallback;
  try {
    const parsed = JSON.parse(raw);
    return parsed && typeof parsed === 'object' ? parsed : fallback;
  } catch {
    return fallback;
  }
}

function toNumber(value) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : 0;
}

function currentRouteFromHash() {
  if (typeof window === 'undefined') return '/';
  const hash = String(window.location.hash || '').replace(/^#/, '');
  if (!hash) return '/';
  return hash.startsWith('/') ? hash : `/${hash}`;
}

function toTokenPayload(raw = {}) {
  return {
    resultType: raw.resultType || raw.result_type || '',
    accessToken: raw.accessToken || raw.access_token || '',
    tokenType: raw.tokenType || raw.token_type || '',
    expiresInSec: toNumber(raw.expiresInSec ?? raw.expires_in_sec),
    refreshToken: raw.refreshToken || raw.refresh_token || '',
    refreshExpiresInSec: toNumber(raw.refreshExpiresInSec ?? raw.refresh_expires_in_sec),
    userId: toNumber(raw.userId ?? raw.user_id),
    groups: Array.isArray(raw.groups) ? raw.groups : [],
    bindTicket: raw.bindTicket || raw.bind_ticket || ''
  };
}

function toMePayload(raw = {}) {
  return {
    userId: toNumber(raw.userId ?? raw.user_id),
    nickname: raw.nickname || '',
    avatarUrl: raw.avatarUrl || raw.avatar_url || '',
    groups: Array.isArray(raw.groups) ? raw.groups : [],
    permissions: Array.isArray(raw.permissions) ? raw.permissions : []
  };
}

function toCaptchaPayload(raw = {}) {
  return {
    captchaId: raw.captchaId || raw.captcha_id || '',
    svgContent: raw.svgContent || raw.svg_content || '',
    expiresInSec: toNumber(raw.expiresInSec ?? raw.expires_in_sec)
  };
}

function toEmailVerifyPayload(raw = {}) {
  return {
    status: raw.status || '',
    cooldownSec: toNumber(raw.cooldownSec ?? raw.cooldown_sec)
  };
}

function toOAuthAuthorizePayload(raw = {}) {
  return {
    oauthLoginId: raw.oauthLoginId || raw.oauth_login_id || '',
    authorizeUrl: raw.authorizeUrl || raw.authorize_url || '',
    state: raw.state || ''
  };
}

function normalizeOAuthScene(raw) {
  const normalized = String(raw || '').trim().toUpperCase();
  return normalized === 'BIND' ? 'BIND' : 'LOGIN';
}

function readRefreshToken() {
  if (typeof window === 'undefined') return '';
  const payload = parseJsonSafe(window.localStorage.getItem(AUTH_STORAGE_KEY), {});
  return typeof payload.refreshToken === 'string' ? payload.refreshToken : '';
}

function writeRefreshToken(token) {
  if (typeof window === 'undefined') return;
  if (!token) {
    window.localStorage.removeItem(AUTH_STORAGE_KEY);
    return;
  }
  window.localStorage.setItem(
    AUTH_STORAGE_KEY,
    JSON.stringify({
      refreshToken: token,
      updatedAt: Date.now()
    })
  );
}

function readUserSnapshot() {
  if (typeof window === 'undefined') return null;
  const payload = parseJsonSafe(window.localStorage.getItem(USER_STORAGE_KEY), null);
  if (!payload || typeof payload !== 'object') return null;
  return {
    userId: toNumber(payload.userId),
    nickname: typeof payload.nickname === 'string' ? payload.nickname : '',
    avatarUrl:
      typeof payload.avatarUrl === 'string'
        ? payload.avatarUrl
        : typeof payload.avatar_url === 'string'
          ? payload.avatar_url
          : '',
    groups: Array.isArray(payload.groups) ? payload.groups : [],
    permissions: Array.isArray(payload.permissions) ? payload.permissions : []
  };
}

function writeUserSnapshot(user) {
  if (typeof window === 'undefined') return;
  if (!user || !user.userId) {
    window.localStorage.removeItem(USER_STORAGE_KEY);
    return;
  }
  window.localStorage.setItem(USER_STORAGE_KEY, JSON.stringify(user));
}

function clearLegacyStorage() {
  if (typeof window === 'undefined') return;
  LEGACY_CLEAR_KEYS.forEach((key) => window.localStorage.removeItem(key));
}

function readOAuthPendingAll() {
  if (typeof window === 'undefined') return { states: {} };
  const payload = parseJsonSafe(window.sessionStorage.getItem(OAUTH_PENDING_KEY), { states: {} });
  if (!payload.states || typeof payload.states !== 'object') {
    return { states: {} };
  }
  return { states: { ...payload.states } };
}

function writeOAuthPendingAll(payload) {
  if (typeof window === 'undefined') return;
  window.sessionStorage.setItem(OAUTH_PENDING_KEY, JSON.stringify(payload));
}

function pruneOAuthPending(states) {
  const now = Date.now();
  const next = {};
  Object.entries(states || {}).forEach(([state, item]) => {
    if (!item || typeof item !== 'object') return;
    const createdAt = toNumber(item.createdAt);
    if (createdAt <= 0) return;
    if (now - createdAt > OAUTH_PENDING_TTL_MS) return;
    next[state] = item;
  });
  return next;
}

function saveOAuthPending(state, payload) {
  if (typeof window === 'undefined') return;
  const all = readOAuthPendingAll();
  const cleaned = pruneOAuthPending(all.states);
  cleaned[state] = {
    ...payload,
    createdAt: Date.now()
  };
  writeOAuthPendingAll({ states: cleaned });
}

function readOAuthPending(state) {
  if (typeof window === 'undefined') return null;
  const all = readOAuthPendingAll();
  const cleaned = pruneOAuthPending(all.states);
  writeOAuthPendingAll({ states: cleaned });
  return cleaned[state] || null;
}

function removeOAuthPending(state) {
  if (typeof window === 'undefined') return;
  const all = readOAuthPendingAll();
  const cleaned = pruneOAuthPending(all.states);
  if (Object.prototype.hasOwnProperty.call(cleaned, state)) {
    delete cleaned[state];
  }
  writeOAuthPendingAll({ states: cleaned });
}

function peekOAuthPending(state) {
  const normalizedState = String(state || '');
  if (!normalizedState) return null;
  const pending = readOAuthPending(normalizedState);
  if (!pending || typeof pending !== 'object') return null;
  return {
    ...pending,
    scene: normalizeOAuthScene(pending.scene)
  };
}

function redirectToAuth(reason, redirectPath) {
  if (typeof window === 'undefined') return;
  const current = currentRouteFromHash();
  if (current.startsWith('/auth')) return;

  const params = new URLSearchParams();
  if (reason) params.set('reason', reason);
  params.set('redirect', normalizeRoutePath(redirectPath || current));
  const suffix = params.toString();
  window.location.hash = suffix ? `/auth?${suffix}` : '/auth';
}

function createAuthSession() {
  const accessToken = ref('');
  const refreshToken = ref('');
  const user = ref(null);
  const ready = ref(false);

  let ensurePromise = null;
  let refreshPromise = null;

  const isAuthenticated = computed(() => Boolean(accessToken.value) && Boolean(user.value?.userId));

  function clearSession() {
    accessToken.value = '';
    refreshToken.value = '';
    user.value = null;
    clearLegacyStorage();
  }

  function applyTokenPayload(tokenPayload) {
    accessToken.value = tokenPayload.accessToken || '';
    refreshToken.value = tokenPayload.refreshToken || refreshToken.value;
    writeRefreshToken(refreshToken.value);
  }

  async function refreshUserProfile() {
    if (!accessToken.value) {
      throw new Error('Missing access token');
    }
    const mePayload = toMePayload(await authApi.getCurrentUser(accessToken.value));
    user.value = mePayload;
    writeUserSnapshot(mePayload);
    return mePayload;
  }

  async function completeTokenIssued(tokenPayload) {
    applyTokenPayload(tokenPayload);

    if (tokenPayload.userId > 0 && !user.value) {
      user.value = {
        userId: tokenPayload.userId,
        nickname: '',
        groups: tokenPayload.groups,
        permissions: []
      };
      writeUserSnapshot(user.value);
    }

    await refreshUserProfile();
    return tokenPayload;
  }

  async function refreshAccessToken() {
    if (!refreshToken.value) {
      throw new Error('Missing refresh token');
    }
    if (refreshPromise) return refreshPromise;

    refreshPromise = (async () => {
      const tokenPayload = toTokenPayload(
        await authApi.issueToken({
          grantType: 'REFRESH_TOKEN',
          refreshToken: refreshToken.value
        })
      );

      if (tokenPayload.resultType !== 'TOKEN_ISSUED' || !tokenPayload.accessToken) {
        throw new Error('Refresh token response is invalid');
      }

      await completeTokenIssued(tokenPayload);
      return tokenPayload;
    })();

    try {
      return await refreshPromise;
    } finally {
      refreshPromise = null;
    }
  }

  async function ensureReady() {
    if (ready.value) return;
    if (ensurePromise) return ensurePromise;

    ensurePromise = (async () => {
      refreshToken.value = readRefreshToken();
      user.value = refreshToken.value ? readUserSnapshot() : null;

      if (refreshToken.value) {
        try {
          await refreshAccessToken();
        } catch {
          clearSession();
        }
      }
      ready.value = true;
    })();

    try {
      await ensurePromise;
    } finally {
      ensurePromise = null;
    }
  }

  async function requireAccessTokenForCall(redirectPath = currentRouteFromHash()) {
    if (!accessToken.value && refreshToken.value) {
      try {
        await refreshAccessToken();
      } catch {
        clearSession();
        redirectToAuth('session_expired', redirectPath);
        throw new Error('Session expired');
      }
    }
    if (!accessToken.value) {
      redirectToAuth('session_expired', redirectPath);
      throw new Error('Login required');
    }
    return accessToken.value;
  }

  async function loginByEmail(payload) {
    await ensureReady();
    const tokenPayload = toTokenPayload(
      await authApi.issueToken({
        grantType: 'EMAIL_PASSWORD',
        email: payload.email,
        password: payload.password
      })
    );

    if (tokenPayload.resultType !== 'TOKEN_ISSUED') {
      throw new Error('Email login did not return TOKEN_ISSUED');
    }
    return completeTokenIssued(tokenPayload);
  }

  async function registerByEmail(payload) {
    await ensureReady();
    const tokenPayload = toTokenPayload(
      await authApi.registerByEmail({
        email: payload.email,
        password: payload.password,
        nickname: payload.nickname,
        emailCode: payload.emailCode
      })
    );

    if (tokenPayload.resultType !== 'TOKEN_ISSUED') {
      throw new Error('Register did not return TOKEN_ISSUED');
    }
    return completeTokenIssued(tokenPayload);
  }

  async function createImageCaptcha() {
    await ensureReady();
    return toCaptchaPayload(await authApi.createImageCaptcha());
  }

  async function sendEmailVerification(payload) {
    await ensureReady();
    return toEmailVerifyPayload(
      await authApi.sendEmailVerification({
        email: payload.email,
        purpose: payload.purpose,
        captchaId: payload.captchaId,
        captchaAnswer: payload.captchaAnswer
      })
    );
  }

  async function sendRegisterVerification(payload) {
    return sendEmailVerification({
      ...payload,
      purpose: 'REGISTER'
    });
  }

  async function sendResetPasswordVerification(payload) {
    return sendEmailVerification({
      ...payload,
      purpose: 'RESET_PASSWORD'
    });
  }

  async function resetPasswordByEmail(payload) {
    await ensureReady();
    return authApi.resetPasswordByEmail({
      email: payload.email,
      emailCode: payload.emailCode,
      newPassword: payload.newPassword,
      confirmPassword: payload.confirmPassword
    });
  }

  async function startOAuthAuthorization(payload) {
    await ensureReady();

    const normalizedScene = normalizeOAuthScene(payload?.scene);
    const normalizedProvider = String(payload?.provider || '').trim().toLowerCase();
    if (!normalizedProvider) {
      throw new Error('OAuth provider is required');
    }
    const redirect = normalizeRoutePath(payload?.redirect || '/profile');
    if (normalizedScene === 'BIND') {
      await requireAccessTokenForCall('/profile?tab=account');
    }
    const redirectUri = `${window.location.origin}${window.location.pathname}`;

    const oauthPayload = toOAuthAuthorizePayload(
      await authApi.createOAuthAuthorization({
        provider: normalizedProvider,
        redirectUri,
        scene: normalizedScene
      })
    );

    if (!oauthPayload.state || !oauthPayload.oauthLoginId || !oauthPayload.authorizeUrl) {
      throw new Error('OAuth authorization response is invalid');
    }

    saveOAuthPending(oauthPayload.state, {
      provider: normalizedProvider,
      oauthLoginId: oauthPayload.oauthLoginId,
      redirect,
      scene: normalizedScene
    });

    window.location.assign(oauthPayload.authorizeUrl);
  }

  async function startOAuthLogin(provider, redirectPath) {
    return startOAuthAuthorization({
      provider,
      scene: 'LOGIN',
      redirect: redirectPath || '/profile'
    });
  }

  async function startOAuthBind(provider, redirectPath = '/profile?tab=account') {
    return startOAuthAuthorization({
      provider,
      scene: 'BIND',
      redirect: redirectPath
    });
  }

  async function handleOAuthCallback(payload) {
    await ensureReady();
    const code = String(payload?.code || '');
    const state = String(payload?.state || '');
    if (!code || !state) {
      throw new Error('OAuth callback code/state missing');
    }

    const pending = readOAuthPending(state);
    if (!pending?.oauthLoginId) {
      throw new Error('OAuth state not found or expired');
    }
    const scene = normalizeOAuthScene(pending.scene);
    if (scene === 'BIND') {
      const token = await requireAccessTokenForCall('/profile?tab=account');
      await authApi.bindOAuthCredential(
        {
          provider: pending.provider,
          oauthLoginId: pending.oauthLoginId,
          code,
          state
        },
        token
      );
      removeOAuthPending(state);
      await refreshUserProfile();
      return {
        resultType: 'BIND_SUCCESS',
        redirect: pending.redirect || '/profile?tab=account'
      };
    }

    const tokenPayload = toTokenPayload(
      await authApi.issueToken({
        grantType: 'OAUTH_CODE',
        provider: pending.provider,
        oauthLoginId: pending.oauthLoginId,
        code,
        state
      })
    );
    if (tokenPayload.resultType === 'BIND_REQUIRED') {
      removeOAuthPending(state);
      return {
        resultType: 'BIND_REQUIRED',
        bindTicket: tokenPayload.bindTicket,
        redirect: pending.redirect
      };
    }
    if (tokenPayload.resultType !== 'TOKEN_ISSUED') {
      throw new Error('Unsupported OAuth result type');
    }
    removeOAuthPending(state);
    await completeTokenIssued(tokenPayload);
    return {
      resultType: 'TOKEN_ISSUED',
      redirect: pending.redirect
    };
  }

  async function confirmConflictBinding(payload) {
    await ensureReady();

    const tokenPayload = toTokenPayload(
      await authApi.confirmConflictBinding({
        bindTicket: payload.bindTicket,
        email: payload.email,
        password: payload.password
      })
    );

    if (tokenPayload.resultType !== 'TOKEN_ISSUED') {
      throw new Error('Bind confirm did not return TOKEN_ISSUED');
    }
    return completeTokenIssued(tokenPayload);
  }

  async function logout(options = {}) {
    await ensureReady();

    const payload = {
      refreshToken: refreshToken.value || undefined,
      logoutAll: Boolean(options.logoutAll)
    };

    try {
      if (accessToken.value || refreshToken.value) {
        await authApi.logout(payload, accessToken.value || undefined);
      }
    } catch {
      // ignore logout error, always clear local session
    } finally {
      clearSession();
    }
  }

  async function getAccountProfile() {
    await ensureReady();
    const token = await requireAccessTokenForCall('/profile?tab=account');
    return authApi.getMeAccount(token);
  }

  async function updateProfile(payload) {
    await ensureReady();
    const token = await requireAccessTokenForCall('/profile?tab=account');
    const result = await authApi.updateMeProfile(payload || {}, token);
    await refreshUserProfile();
    return result;
  }

  async function changePasswordByEmail(payload) {
    await ensureReady();
    const token = await requireAccessTokenForCall('/profile?tab=account');
    return authApi.changeMePassword(
      {
        email: payload.email,
        emailCode: payload.emailCode,
        newPassword: payload.newPassword,
        confirmPassword: payload.confirmPassword
      },
      token
    );
  }

  async function bindEmailCredential(payload) {
    await ensureReady();
    const token = await requireAccessTokenForCall('/profile?tab=account');
    return authApi.bindEmailCredential(
      {
        email: payload.email,
        password: payload.password,
        emailCode: payload.emailCode
      },
      token
    );
  }

  async function uploadAvatar(file) {
    await ensureReady();
    const token = await requireAccessTokenForCall('/profile?tab=account');
    if (!file) {
      throw new Error('Please select image file');
    }
    const name = String(file.name || 'avatar.png');
    const contentType = String(file.type || '').toLowerCase();
    const allowedTypes = new Set(['image/png', 'image/jpeg', 'image/webp']);
    if (!allowedTypes.has(contentType)) {
      throw new Error('Avatar must be png/jpeg/webp');
    }
    if (Number(file.size || 0) > 2 * 1024 * 1024) {
      throw new Error('Avatar image must be <= 2MB');
    }

    const policy = await authApi.createUploadPolicy(
      {
        fileName: name,
        contentType,
        assetKind: 'STATIC_IMAGE',
        visibility: 'PUBLIC'
      },
      token
    );
    const uploadUrl = String(policy?.uploadUrl || policy?.upload_url || '').trim();
    const policyBucket = String(policy?.bucket || '').trim();
    const policyKey = String(policy?.key || '').trim();
    if (!uploadUrl || !policyBucket || !policyKey) {
      throw new Error('Upload policy is invalid');
    }
    let relayUsed = false;
    let bucket = policyBucket;
    let key = policyKey;
    let uploadContentType = contentType;

    try {
      const uploadResponse = await fetch(uploadUrl, {
        method: 'PUT',
        headers: {
          'Content-Type': contentType
        },
        body: file
      });
      if (!uploadResponse.ok) {
        throw new Error(`Avatar direct upload failed (${uploadResponse.status})`);
      }
    } catch (directError) {
      try {
        const relayPayload = await authApi.uploadRelay(
          file,
          {
            assetKind: 'STATIC_IMAGE',
            visibility: 'PUBLIC'
          },
          token
        );
        bucket = String(relayPayload?.bucket || '').trim();
        key = String(relayPayload?.key || '').trim();
        uploadContentType = String(relayPayload?.contentType || relayPayload?.content_type || contentType).trim() || contentType;
        if (!bucket || !key) {
          throw new Error('Avatar relay upload result invalid');
        }
        relayUsed = true;
      } catch (relayError) {
        const directMessage = directError instanceof Error ? directError.message : 'direct upload failed';
        const relayMessage = relayError instanceof Error ? relayError.message : 'relay upload failed';
        throw new Error(`Avatar upload failed: ${directMessage}; relay failed: ${relayMessage}`);
      }
    }

    const created = await authApi.createAsset(
      {
        bucket,
        key,
        assetType: 'image',
        assetKind: 'STATIC_IMAGE',
        contentType: uploadContentType,
        visibility: 'PUBLIC',
        metadata: {
          usage: 'avatar'
        }
      },
      token
    );
    const assetId = toNumber(created?.assetId ?? created?.asset_id);
    if (!assetId) {
      throw new Error('Create avatar asset failed');
    }

    const downloadInfo = await authApi.getAssetDownloadUrl(assetId, token);
    const avatarUrl = String(
      downloadInfo?.publicUrl || downloadInfo?.public_url || downloadInfo?.downloadUrl || downloadInfo?.download_url || ''
    ).trim();
    if (!avatarUrl) {
      throw new Error('Resolve avatar url failed');
    }

    await authApi.updateMeProfile({ avatarUrl }, token);
    await refreshUserProfile();
    return {
      avatarUrl,
      relayUsed
    };
  }

  async function authorizedFetch(path, options = {}) {
    await ensureReady();

    if (!accessToken.value && refreshToken.value) {
      try {
        await refreshAccessToken();
      } catch {
        clearSession();
        redirectToAuth('session_expired', currentRouteFromHash());
        throw new Error('Session expired');
      }
    }

    if (!accessToken.value) {
      redirectToAuth('session_expired', currentRouteFromHash());
      throw new Error('Login required');
    }

    try {
      return await httpRequest(path, {
        ...options,
        auth: true,
        accessToken: accessToken.value
      });
    } catch (error) {
      if (!isUnauthorizedProblem(error)) {
        throw error;
      }

      try {
        await refreshAccessToken();
      } catch {
        clearSession();
        redirectToAuth('session_expired', currentRouteFromHash());
        throw error;
      }

      return httpRequest(path, {
        ...options,
        auth: true,
        accessToken: accessToken.value
      });
    }
  }

  return {
    ensureReady,
    isAuthenticated,
    user: readonly(user),
    loginByEmail,
    registerByEmail,
    createImageCaptcha,
    sendEmailVerification,
    sendRegisterVerification,
    sendResetPasswordVerification,
    resetPasswordByEmail,
    getAccountProfile,
    updateProfile,
    changePasswordByEmail,
    bindEmailCredential,
    uploadAvatar,
    startOAuthAuthorization,
    startOAuthLogin,
    startOAuthBind,
    peekOAuthPending,
    handleOAuthCallback,
    confirmConflictBinding,
    logout,
    authorizedFetch,
    refreshAccessToken,
    clearSession,
    redirectToAuth,
    HttpError
  };
}

export function useAuthSession() {
  if (!sessionSingleton) {
    sessionSingleton = createAuthSession();
  }
  return sessionSingleton;
}

export function __resetAuthSessionForTest() {
  sessionSingleton = null;
}
