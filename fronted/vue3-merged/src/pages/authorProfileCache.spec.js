import { describe, expect, it } from 'vitest';
import {
  AUTHOR_PROFILE_CACHE_KEY,
  clearAuthorProfileCache,
  readAuthorProfileCache,
  writeAuthorProfileCache
} from './authorProfileCache';

function createMemoryStorage() {
  const state = new Map();
  return {
    getItem(key) {
      return state.has(key) ? state.get(key) : null;
    },
    setItem(key, value) {
      state.set(key, String(value));
    },
    removeItem(key) {
      state.delete(key);
    }
  };
}

describe('authorProfileCache', () => {
  it('writes and reads cache payload within ttl', () => {
    const storage = createMemoryStorage();
    const payload = { authorCode: 'shizuki', profileJson: { hero: { name: 'Shizuki' } } };
    writeAuthorProfileCache(payload, { storage, now: 1000, ttlMs: 5000 });
    expect(readAuthorProfileCache({ storage, now: 5000, ttlMs: 5000 })).toEqual(payload);
  });

  it('returns null and clears expired cache payload', () => {
    const storage = createMemoryStorage();
    writeAuthorProfileCache({ authorCode: 'shizuki' }, { storage, now: 1000, ttlMs: 1200 });
    expect(readAuthorProfileCache({ storage, now: 2501, ttlMs: 1200 })).toBeNull();
    expect(storage.getItem(AUTHOR_PROFILE_CACHE_KEY)).toBeNull();
  });

  it('handles malformed payload and supports clear', () => {
    const storage = createMemoryStorage();
    storage.setItem(AUTHOR_PROFILE_CACHE_KEY, '{bad-json}');
    expect(readAuthorProfileCache({ storage })).toBeNull();

    writeAuthorProfileCache({ authorCode: 'shizuki' }, { storage });
    clearAuthorProfileCache({ storage });
    expect(readAuthorProfileCache({ storage })).toBeNull();
  });
});
