const HELPER_VERSION = '0.1.0';

const PROVIDER_CONFIG = Object.freeze({
  netease: Object.freeze({
    domains: ['music.163.com', '.music.163.com'],
    cookieNames: ['MUSIC_U', '__csrf', 'NMTID', '_ntes_nuid']
  }),
  qqmusic: Object.freeze({
    domains: ['y.qq.com', '.y.qq.com'],
    cookieNames: ['uin', 'qm_keyst', 'qqmusic_key', 'wxuin', 'fqm_pvqid']
  }),
  kugou: Object.freeze({
    domains: ['www.kugou.com', '.kugou.com'],
    cookieNames: ['kg_mid', 'userid', 'token', 'KuGoo']
  })
});

function normalizeProvider(provider) {
  return String(provider || '').trim().toLowerCase();
}

async function collectCookiesForDomain(domain, allowedNames) {
  const cookies = await chrome.cookies.getAll({ domain });
  if (!Array.isArray(cookies) || !cookies.length) {
    return [];
  }
  const allowSet = new Set((allowedNames || []).map((item) => String(item || '').trim()).filter(Boolean));
  const filtered = allowSet.size
    ? cookies.filter((item) => allowSet.has(String(item?.name || '').trim()))
    : cookies;
  return filtered.map((item) => `${item.name}=${item.value}`);
}

async function getCookies(provider) {
  const normalizedProvider = normalizeProvider(provider);
  const config = PROVIDER_CONFIG[normalizedProvider];
  if (!config) {
    throw new Error(`Unsupported provider: ${provider}`);
  }
  const segments = [];
  for (const domain of config.domains) {
    const rows = await collectCookiesForDomain(domain, config.cookieNames);
    if (rows.length) {
      segments.push(...rows);
    }
  }
  const deduped = Array.from(new Set(segments));
  return {
    provider: normalizedProvider,
    cookieBundle: deduped.join('; '),
    helperVersion: HELPER_VERSION
  };
}

chrome.runtime.onMessage.addListener((message, sender, sendResponse) => {
  const type = String(message?.type || '').trim().toUpperCase();
  if (type === 'PING') {
    sendResponse({ ready: true, version: HELPER_VERSION });
    return false;
  }
  if (type !== 'GET_COOKIES') {
    sendResponse({ ok: false, error: 'Unsupported helper message type' });
    return false;
  }
  const provider = normalizeProvider(message?.payload?.provider);
  getCookies(provider)
    .then((payload) => {
      sendResponse({ ok: true, payload });
    })
    .catch((error) => {
      sendResponse({ ok: false, error: String(error?.message || 'Failed to read cookies') });
    });
  return true;
});
