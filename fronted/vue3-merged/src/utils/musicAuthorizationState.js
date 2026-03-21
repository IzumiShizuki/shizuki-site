export const SOURCE_ACCOUNT_PROVIDERS = Object.freeze(['netease', 'qqmusic', 'kugou']);

export const SOURCE_ACCOUNT_PROVIDER_CATALOG = Object.freeze({
  netease: Object.freeze({
    code: 'netease',
    name: '网易云',
    iconText: '网',
    supportsPlaylistImport: true
  }),
  qqmusic: Object.freeze({
    code: 'qqmusic',
    name: 'QQ 音乐',
    iconText: 'Q',
    supportsPlaylistImport: false
  }),
  kugou: Object.freeze({
    code: 'kugou',
    name: '酷狗',
    iconText: '酷',
    supportsPlaylistImport: false
  })
});

export const MUSIC_SOURCE_MODE_OPTIONS = Object.freeze([
  Object.freeze({ value: 'account_first', label: '账号优先' }),
  Object.freeze({ value: 'tunehub_first', label: 'TuneHub 优先' }),
  Object.freeze({ value: 'account_only', label: '仅账号源' }),
  Object.freeze({ value: 'tunehub_only', label: '仅 TuneHub' })
]);

export function normalizeMusicApiKeyStatus(raw) {
  return {
    keyBound: Boolean(raw?.keyBound ?? raw?.key_bound),
    keyMask: String(raw?.keyMask || raw?.key_mask || '').trim(),
    updatedAt: String(raw?.updatedAt || raw?.updated_at || '').trim()
  };
}

export const normalizeApiKeyStatus = normalizeMusicApiKeyStatus;

export function normalizeMusicSourceModeValue(raw) {
  const normalized = String(raw || '').trim().toLowerCase();
  if (MUSIC_SOURCE_MODE_OPTIONS.some((item) => item.value === normalized)) {
    return normalized;
  }
  return 'tunehub_first';
}

export function normalizeSourceProviderOrder(input) {
  const source = Array.isArray(input) ? input : [];
  const result = [];
  const seen = new Set();

  source.forEach((item) => {
    const value = String(item || '').trim().toLowerCase();
    if (!SOURCE_ACCOUNT_PROVIDERS.includes(value) || seen.has(value)) return;
    seen.add(value);
    result.push(value);
  });

  SOURCE_ACCOUNT_PROVIDERS.forEach((provider) => {
    if (seen.has(provider)) return;
    seen.add(provider);
    result.push(provider);
  });

  return result;
}

export function normalizeSourceAccountStatus(raw, fallbackProvider = '') {
  const provider = String(raw?.provider || fallbackProvider || '').trim().toLowerCase();
  return {
    provider,
    authType: String(raw?.authType || raw?.auth_type || 'cookie').trim() || 'cookie',
    bound: Boolean(raw?.bound ?? raw?.keyBound ?? raw?.key_bound),
    mask: String(raw?.mask || raw?.keyMask || raw?.key_mask || '').trim(),
    status: String(raw?.status || '').trim().toUpperCase() || (Boolean(raw?.bound ?? raw?.keyBound ?? raw?.key_bound) ? 'BOUND' : 'UNBOUND'),
    updatedAt: String(raw?.updatedAt || raw?.updated_at || '').trim(),
    lastVerifiedAt: String(raw?.lastVerifiedAt || raw?.last_verified_at || '').trim(),
    expireAt: String(raw?.expireAt || raw?.expire_at || '').trim()
  };
}

export function getSourceAccountProviderMeta(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  if (SOURCE_ACCOUNT_PROVIDER_CATALOG[normalized]) {
    return SOURCE_ACCOUNT_PROVIDER_CATALOG[normalized];
  }
  return {
    code: normalized,
    name: normalized || '未知平台',
    iconText: '源',
    supportsPlaylistImport: false
  };
}

export function getSourceAccountProviderLabel(provider) {
  return getSourceAccountProviderMeta(provider).name;
}
