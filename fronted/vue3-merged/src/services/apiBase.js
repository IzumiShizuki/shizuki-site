const API_BASE_STORAGE_KEY = 'shizuki.apiBase.v1';

const ENV_BASE = String(import.meta.env.VITE_GATEWAY_BASE_URL || '/').trim() || '/';

function sanitizeBase(raw) {
  const value = String(raw || '').trim();
  if (!value || value === '/') return '';
  if (!/^https?:\/\//i.test(value)) return '';
  return value.replace(/\/+$/, '');
}

export function isNativeAppShell() {
  if (typeof window === 'undefined') return false;
  try {
    const cap = window.Capacitor;
    if (!cap) return false;
    if (typeof cap.isNativePlatform === 'function') return cap.isNativePlatform();
    return Boolean(cap.isNative);
  } catch {
    return false;
  }
}

function readStoredBase() {
  if (typeof window === 'undefined') return '';
  try {
    return sanitizeBase(window.localStorage.getItem(API_BASE_STORAGE_KEY));
  } catch {
    return '';
  }
}

let runtimeBase = null;

function resolveInitialBase() {
  const envBase = sanitizeBase(ENV_BASE);
  // 仅原生 App 允许运行时覆盖网关地址，网页端始终跟随部署环境。
  if (isNativeAppShell()) {
    return readStoredBase() || envBase;
  }
  return envBase;
}

export function getApiBaseUrl() {
  if (runtimeBase === null) {
    runtimeBase = resolveInitialBase();
  }
  return runtimeBase;
}

export function getDefaultApiBaseUrl() {
  return sanitizeBase(ENV_BASE);
}

export function setApiBaseUrl(nextBase) {
  const sanitized = sanitizeBase(nextBase);
  runtimeBase = sanitized || sanitizeBase(ENV_BASE);
  if (typeof window !== 'undefined' && isNativeAppShell()) {
    try {
      if (sanitized && sanitized !== sanitizeBase(ENV_BASE)) {
        window.localStorage.setItem(API_BASE_STORAGE_KEY, sanitized);
      } else {
        window.localStorage.removeItem(API_BASE_STORAGE_KEY);
      }
    } catch {
      // ignore storage failures
    }
  }
  return runtimeBase;
}

/**
 * 原生 App 内，服务端返回的相对 `/api/...` 资源（音频流、歌词、封面）需要
 * 补全网关域名，否则会被 WebView 解析到本地 bundle。网页端原样返回。
 */
export function absolutizeApiUrl(raw) {
  const url = String(raw || '');
  if (!url) return url;
  if (!isNativeAppShell()) return url;
  if (!url.startsWith('/api/')) return url;
  const base = getApiBaseUrl();
  if (!base) return url;
  return `${base}${url}`;
}

export function __resetApiBaseForTest() {
  runtimeBase = null;
}
