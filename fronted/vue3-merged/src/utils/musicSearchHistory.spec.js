import { describe, expect, it } from 'vitest';
import {
  clearMusicSearchHistory,
  readMusicSearchHistory,
  recordMusicSearchHistory
} from './musicSearchHistory';

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

describe('musicSearchHistory', () => {
  it('stores latest keyword first and deduplicates case-insensitive values', () => {
    const storage = createMemoryStorage();
    recordMusicSearchHistory('  Yozuca  ', storage);
    recordMusicSearchHistory('白色相簿', storage);
    const history = recordMusicSearchHistory('yozuca', storage);
    expect(history).toEqual(['yozuca', '白色相簿']);
  });

  it('supports clear', () => {
    const storage = createMemoryStorage();
    recordMusicSearchHistory('Kirara', storage);
    clearMusicSearchHistory(storage);
    expect(readMusicSearchHistory(storage)).toEqual([]);
  });
});
