const STORAGE_KEY = 'shizuki.blog.reading-context.v1';
const MAX_AGE_MS = 6 * 60 * 60 * 1000;
const FILTER_FIELDS = ['keyword', 'category', 'tag', 'publishedFrom', 'publishedTo', 'archiveMonth'];

function normalize(value, now) {
  if (!value || value.version !== 1 || !Number.isFinite(value.savedAt)
      || value.savedAt > now || now - value.savedAt > MAX_AGE_MS) return null;
  const filters = Object.fromEntries(FILTER_FIELDS.map(field => [field,
    typeof value.filters?.[field] === 'string' ? value.filters[field].slice(0, field === 'keyword' ? 128 : 160) : ''
  ]));
  return {
    version: 1, savedAt: value.savedAt, filters,
    pageNo: Math.max(1, Math.min(100000, Math.trunc(Number(value.pageNo) || 1))),
    scrollTop: Math.max(0, Math.min(10000000, Number(value.scrollTop) || 0))
  };
}

export function readBlogReadingContext(storage, now = Date.now()) {
  try {
    const raw = (storage ?? globalThis.sessionStorage)?.getItem(STORAGE_KEY);
    return raw && raw.length < 4096 ? normalize(JSON.parse(raw), now) : null;
  } catch { return null; }
}

export function saveBlogReadingContext(value, storage, now = Date.now()) {
  try {
    const context = normalize({ ...value, version: 1, savedAt: now }, now);
    (storage ?? globalThis.sessionStorage)?.setItem(STORAGE_KEY, JSON.stringify(context));
    return context;
  } catch { return null; }
}
