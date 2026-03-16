const AUTHOR_PROFILE_CACHE_KEY = 'shizuki.authorProfile.cache.v1';
const AUTHOR_PROFILE_CACHE_TTL_MS = 5 * 60 * 1000;
const AUTHOR_PROFILE_CACHE_UPDATED_EVENT = 'shizuki:author-profile-cache-updated';

function isPlainObject(value) {
  return Object.prototype.toString.call(value) === '[object Object]';
}

function resolveStorage(storage) {
  if (storage) return storage;
  if (typeof window === 'undefined') return null;
  return window.localStorage;
}

function normalizePositiveNumber(value, fallback) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric) || numeric <= 0) return fallback;
  return Math.round(numeric);
}

function dispatchAuthorProfileCacheUpdated(payload) {
  if (typeof window === 'undefined' || typeof window.dispatchEvent !== 'function') return;
  try {
    window.dispatchEvent(
      new CustomEvent(AUTHOR_PROFILE_CACHE_UPDATED_EVENT, {
        detail: {
          payload: isPlainObject(payload) ? payload : null
        }
      })
    );
  } catch {
    // ignore event dispatch failures
  }
}

export function readAuthorProfileCache(options = {}) {
  const storage = resolveStorage(options.storage);
  if (!storage) return null;
  const key = String(options.key || AUTHOR_PROFILE_CACHE_KEY);
  const ttlMs = normalizePositiveNumber(options.ttlMs, AUTHOR_PROFILE_CACHE_TTL_MS);
  const now = normalizePositiveNumber(options.now, Date.now());

  try {
    const raw = storage.getItem(key);
    if (!raw) return null;
    const parsed = JSON.parse(raw);
    if (!isPlainObject(parsed)) {
      storage.removeItem(key);
      return null;
    }
    const payload = parsed.payload;
    if (!isPlainObject(payload)) {
      storage.removeItem(key);
      return null;
    }

    const savedAt = normalizePositiveNumber(parsed.savedAt, 0);
    const expiresAt = normalizePositiveNumber(parsed.expiresAt, savedAt > 0 ? savedAt + ttlMs : 0);
    if (expiresAt > 0 && now > expiresAt) {
      storage.removeItem(key);
      return null;
    }
    if (savedAt > 0 && now - savedAt > ttlMs) {
      storage.removeItem(key);
      return null;
    }
    return payload;
  } catch {
    try {
      storage.removeItem(key);
    } catch {
      // ignore storage errors
    }
    return null;
  }
}

export function writeAuthorProfileCache(payload, options = {}) {
  const storage = resolveStorage(options.storage);
  if (!storage || !isPlainObject(payload)) return;

  const key = String(options.key || AUTHOR_PROFILE_CACHE_KEY);
  const ttlMs = normalizePositiveNumber(options.ttlMs, AUTHOR_PROFILE_CACHE_TTL_MS);
  const now = normalizePositiveNumber(options.now, Date.now());
  const cacheData = {
    version: 1,
    savedAt: now,
    expiresAt: now + ttlMs,
    payload
  };

  try {
    storage.setItem(key, JSON.stringify(cacheData));
    dispatchAuthorProfileCacheUpdated(payload);
  } catch {
    // ignore storage quota and permission failures
  }
}

export function clearAuthorProfileCache(options = {}) {
  const storage = resolveStorage(options.storage);
  if (!storage) return;
  const key = String(options.key || AUTHOR_PROFILE_CACHE_KEY);
  try {
    storage.removeItem(key);
    dispatchAuthorProfileCacheUpdated(null);
  } catch {
    // ignore storage failures
  }
}

export {
  AUTHOR_PROFILE_CACHE_UPDATED_EVENT,
  AUTHOR_PROFILE_CACHE_KEY,
  AUTHOR_PROFILE_CACHE_TTL_MS
};
