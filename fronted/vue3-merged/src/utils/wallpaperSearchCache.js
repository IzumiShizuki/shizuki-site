const DEFAULT_TTL_MS = 12_000;
const DEFAULT_MAX_ENTRIES = 24;

function clonePayload(value) {
  if (typeof structuredClone === 'function') return structuredClone(value);
  return JSON.parse(JSON.stringify(value));
}

export function createWallpaperSearchCache({ ttlMs = DEFAULT_TTL_MS, maxEntries = DEFAULT_MAX_ENTRIES, now = () => Date.now() } = {}) {
  const entries = new Map();

  function trim() {
    const currentTime = now();
    for (const [key, entry] of entries) {
      if (!entry.pending && entry.expiresAt <= currentTime) entries.delete(key);
    }
    while (entries.size > maxEntries) entries.delete(entries.keys().next().value);
  }

  return {
    async get(key, loader, { forceRefresh = false } = {}) {
      trim();
      const normalizedKey = String(key || '');
      const existing = entries.get(normalizedKey);
      if (!forceRefresh && existing?.pending) return clonePayload(await existing.pending);
      if (!forceRefresh && existing && existing.expiresAt > now()) {
        entries.delete(normalizedKey);
        entries.set(normalizedKey, existing);
        return clonePayload(existing.value);
      }

      const entry = { pending: null, value: null, expiresAt: 0 };
      const pending = Promise.resolve().then(loader);
      entry.pending = pending;
      entries.delete(normalizedKey);
      entries.set(normalizedKey, entry);
      try {
        const value = await pending;
        if (entries.get(normalizedKey) === entry) {
          entry.value = clonePayload(value);
          entry.expiresAt = now() + ttlMs;
          entry.pending = null;
        }
        trim();
        return clonePayload(value);
      } catch (error) {
        if (entries.get(normalizedKey) === entry) entries.delete(normalizedKey);
        throw error;
      }
    },
    clear() { entries.clear(); },
    get size() { trim(); return entries.size; }
  };
}
