export const SEARCH_HISTORY_LIMIT = 10;

function getDefaultStorage() {
  if (typeof window === 'undefined') return null;
  return window.localStorage;
}

function normalizeKeyword(value) {
  return String(value || '')
    .trim()
    .replace(/\s+/g, ' ');
}

function normalizeHistory(raw, limit = SEARCH_HISTORY_LIMIT) {
  const seen = new Set();
  const result = [];
  const max = Math.max(1, Number(limit) || SEARCH_HISTORY_LIMIT);
  const source = Array.isArray(raw) ? raw : [];
  for (const item of source) {
    const keyword = normalizeKeyword(item);
    if (!keyword) continue;
    const identity = keyword.toLowerCase();
    if (seen.has(identity)) continue;
    seen.add(identity);
    result.push(keyword);
    if (result.length >= max) break;
  }
  return result;
}

function safeParse(rawText) {
  if (!rawText) return [];
  try {
    return JSON.parse(rawText);
  } catch {
    return [];
  }
}

function safeWriteHistory(storageKey, history, storage = getDefaultStorage()) {
  if (!storage) return;
  try {
    if (!history.length) {
      storage.removeItem(storageKey);
      return;
    }
    storage.setItem(storageKey, JSON.stringify(history));
  } catch {
    // ignore storage quota and permission failures
  }
}

export function readSearchHistory(storageKey, storage = getDefaultStorage(), limit = SEARCH_HISTORY_LIMIT) {
  if (!storageKey) return [];
  if (!storage) return [];
  try {
    const rawText = storage.getItem(storageKey);
    return normalizeHistory(safeParse(rawText), limit);
  } catch {
    return [];
  }
}

export function recordSearchHistory(storageKey, keyword, storage = getDefaultStorage(), limit = SEARCH_HISTORY_LIMIT) {
  if (!storageKey) return [];
  const normalizedKeyword = normalizeKeyword(keyword);
  const existing = readSearchHistory(storageKey, storage, limit);
  if (!normalizedKeyword) return existing;
  const next = normalizeHistory([normalizedKeyword, ...existing], limit);
  safeWriteHistory(storageKey, next, storage);
  return next;
}

export function clearSearchHistory(storageKey, storage = getDefaultStorage()) {
  if (!storageKey) return;
  if (!storage) return;
  try {
    storage.removeItem(storageKey);
  } catch {
    // ignore storage failures
  }
}
