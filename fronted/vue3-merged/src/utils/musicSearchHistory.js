import {
  clearSearchHistory,
  readSearchHistory,
  recordSearchHistory
} from './searchHistory';

export const MUSIC_SEARCH_HISTORY_KEY = 'music_search_history_v1';
export const MUSIC_SEARCH_HISTORY_LIMIT = 10;

export function readMusicSearchHistory(storage) {
  return readSearchHistory(MUSIC_SEARCH_HISTORY_KEY, storage, MUSIC_SEARCH_HISTORY_LIMIT);
}

export function recordMusicSearchHistory(keyword, storage) {
  return recordSearchHistory(MUSIC_SEARCH_HISTORY_KEY, keyword, storage, MUSIC_SEARCH_HISTORY_LIMIT);
}

export function clearMusicSearchHistory(storage) {
  clearSearchHistory(MUSIC_SEARCH_HISTORY_KEY, storage);
}
