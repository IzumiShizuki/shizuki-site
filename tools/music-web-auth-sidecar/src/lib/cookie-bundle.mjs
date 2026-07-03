const QQMUSIC_USER_KEYS = new Set(['uin', 'p_uin']);
const QQMUSIC_TOKEN_KEYS = new Set(['qqmusic_key', 'qm_keyst', 'p_skey', 'pt4_token']);
const KUGOU_KEYS = new Set(['userid', 'token', 'kg_mid', 'kugoo', 'mid']);

function normalizeDomain(raw) {
  return String(raw || '').trim().toLowerCase().replace(/^\./, '');
}

function normalizeName(raw) {
  return String(raw || '').trim().toLowerCase();
}

function matchesAllowedDomain(cookieDomain, allowedDomains) {
  const normalized = normalizeDomain(cookieDomain);
  return allowedDomains.some((item) => normalized === item || normalized.endsWith(`.${item}`));
}

export function buildCookieBundle(cookies, allowedDomains = []) {
  const normalizedDomains = Array.isArray(allowedDomains)
    ? allowedDomains.map(normalizeDomain).filter(Boolean)
    : [];
  const result = new Map();
  const list = Array.isArray(cookies) ? cookies : [];
  for (const cookie of list) {
    const name = normalizeName(cookie?.name);
    const value = String(cookie?.value || '').trim();
    const domain = normalizeDomain(cookie?.domain);
    if (!name || !value || !domain) {
      continue;
    }
    if (normalizedDomains.length && !matchesAllowedDomain(domain, normalizedDomains)) {
      continue;
    }
    result.set(name, `${cookie.name}=${value}`);
  }
  return Array.from(result.values()).join('; ');
}

export function parseCookieBundle(cookieBundle) {
  const result = new Map();
  const raw = String(cookieBundle || '').trim();
  if (!raw) {
    return result;
  }
  for (const part of raw.split(';')) {
    const item = String(part || '').trim();
    if (!item) {
      continue;
    }
    const index = item.indexOf('=');
    if (index <= 0) {
      continue;
    }
    const name = normalizeName(item.slice(0, index));
    const value = item.slice(index + 1).trim();
    if (name && value) {
      result.set(name, value);
    }
  }
  return result;
}

export function isQqMusicCookieBundleValid(cookieBundle) {
  const cookieMap = parseCookieBundle(cookieBundle);
  const hasUser = Array.from(QQMUSIC_USER_KEYS).some((key) => cookieMap.has(key));
  const hasToken = Array.from(QQMUSIC_TOKEN_KEYS).some((key) => cookieMap.has(key));
  return hasUser && hasToken;
}

export function isKugouCookieBundleValid(cookieBundle) {
  const cookieMap = parseCookieBundle(cookieBundle);
  return Array.from(KUGOU_KEYS).some((key) => cookieMap.has(key));
}
