import { describe, expect, it } from 'vitest';
import {
  clearSearchHistory,
  readSearchHistory,
  recordSearchHistory
} from './searchHistory';

const TEST_KEY = 'search-history-test-key';

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

describe('searchHistory', () => {
  it('records latest keyword first and deduplicates values', () => {
    const storage = createMemoryStorage();
    recordSearchHistory(TEST_KEY, ' Vue3 ', storage, 5);
    recordSearchHistory(TEST_KEY, 'spring boot', storage, 5);
    const history = recordSearchHistory(TEST_KEY, 'vue3', storage, 5);
    expect(history).toEqual(['vue3', 'spring boot']);
  });

  it('keeps a bounded history length', () => {
    const storage = createMemoryStorage();
    for (let index = 1; index <= 12; index += 1) {
      recordSearchHistory(TEST_KEY, `keyword-${index}`, storage, 10);
    }
    const history = readSearchHistory(TEST_KEY, storage, 10);
    expect(history).toHaveLength(10);
    expect(history[0]).toBe('keyword-12');
    expect(history[9]).toBe('keyword-3');
  });

  it('ignores malformed storage payload and supports clear', () => {
    const storage = createMemoryStorage();
    storage.setItem(TEST_KEY, '{bad-json}');
    expect(readSearchHistory(TEST_KEY, storage)).toEqual([]);
    recordSearchHistory(TEST_KEY, 'shizuki', storage, 10);
    clearSearchHistory(TEST_KEY, storage);
    expect(readSearchHistory(TEST_KEY, storage)).toEqual([]);
  });
});
