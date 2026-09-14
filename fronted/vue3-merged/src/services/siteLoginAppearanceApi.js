import { httpRequest, normalizeApiData } from './httpClient';

const REQUEST_TIMEOUT_MS = 8000;
const SUPPORTED_PRESETS = new Set(['milkshake', 'blueberry', 'peach', 'matcha', 'mint', 'galaxy']);

function readField(value, camelKey, snakeKey = camelKey) {
  if (!value || typeof value !== 'object') return undefined;
  return Object.prototype.hasOwnProperty.call(value, camelKey) ? value[camelKey] : value[snakeKey];
}

function text(value, maxLength = 4096) {
  return String(value ?? '').trim().slice(0, maxLength);
}

function safeImageUrl(value) {
  const candidate = text(value);
  if (!candidate) return '';
  if (candidate.startsWith('data:image/')) return candidate;
  if (candidate.startsWith('/')) return candidate;
  try {
    const parsed = new URL(candidate);
    if (parsed.protocol === 'http:' || parsed.protocol === 'https:') return parsed.toString();
    return '';
  } catch {
    return '';
  }
}

function normalizePreset(value) {
  const normalized = text(value, 32).toLowerCase();
  return SUPPORTED_PRESETS.has(normalized) ? normalized : '';
}

export function normalizeSiteLoginAppearance(payload) {
  const value = normalizeApiData(payload);
  if (!value || typeof value !== 'object') return null;
  const themePreset = normalizePreset(readField(value, 'themePreset', 'theme_preset'));
  const bgImageUrl = safeImageUrl(readField(value, 'bgImageUrl', 'bg_image_url'));
  const mascotImageUrl = safeImageUrl(readField(value, 'mascotImageUrl', 'mascot_image_url'));
  const version = Number(readField(value, 'version')) || 0;
  // 只有默认预设且没有图片视为「未配置」，登录页回退到浏览器本地主题
  const configured = Boolean(bgImageUrl || mascotImageUrl || (themePreset && themePreset !== 'milkshake'));
  if (!configured) return null;
  return Object.freeze({ configured: true, themePreset: themePreset || 'milkshake', bgImageUrl, mascotImageUrl, version });
}

export async function fetchSiteLoginAppearance(signal) {
  const response = await httpRequest('/api/v1/site/login-appearance', {
    method: 'GET',
    signal,
    timeoutMs: REQUEST_TIMEOUT_MS
  });
  return normalizeSiteLoginAppearance(response);
}

export async function fetchAdminLoginAppearance(authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/login-appearance', { method: 'GET' });
  return normalizeSiteLoginAppearance(response);
}

export async function saveAdminLoginAppearance(authorizedFetch, payload) {
  const response = await authorizedFetch('/api/v1/admin/login-appearance', {
    method: 'PUT',
    body: {
      expected_version: Number(payload?.expectedVersion) || 0,
      theme_preset: String(payload?.themePreset || '').trim(),
      bg_image_url: String(payload?.bgImageUrl || '').trim(),
      mascot_image_url: String(payload?.mascotImageUrl || '').trim()
    }
  });
  return normalizeSiteLoginAppearance(response);
}
