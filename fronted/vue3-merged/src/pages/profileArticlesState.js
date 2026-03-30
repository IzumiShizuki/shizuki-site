import { resolveBlogPostDisplayTitle } from '../utils/blogPostTitle';

const STATUS_DRAFT = 'DRAFT';
const STATUS_PUBLISHED = 'PUBLISHED';

function toSafeNumber(value, fallback = 0) {
  const n = Number(value);
  return Number.isFinite(n) ? n : fallback;
}

function normalizeText(value, fallback = '') {
  return typeof value === 'string' ? value : fallback;
}

function normalizeDate(value) {
  if (!value) return '';
  const date = new Date(value);
  if (Number.isNaN(date.getTime())) return '';
  return date.toISOString();
}

function toTimeValue(value) {
  if (!value) return 0;
  const timestamp = Date.parse(value);
  return Number.isFinite(timestamp) ? timestamp : 0;
}

export function normalizeAuthorPostItem(raw) {
  const statusCode = normalizeText(raw?.statusCode ?? raw?.status_code, STATUS_DRAFT).toUpperCase();
  const publishedAt = normalizeDate(raw?.publishedAt ?? raw?.published_at);
  const updatedAt = normalizeDate(raw?.updatedAt ?? raw?.updated_at);
  return {
    postId: toSafeNumber(raw?.postId ?? raw?.post_id, 0),
    title: resolveBlogPostDisplayTitle(raw),
    statusCode,
    categoryCode: normalizeText(raw?.categoryCode ?? raw?.category_code, 'uncategorized').toLowerCase(),
    visibility: normalizeText(raw?.visibility, 'PUBLIC').toUpperCase(),
    likeCount: Math.max(0, toSafeNumber(raw?.likeCount ?? raw?.like_count, 0)),
    readingMinutes: Math.max(1, toSafeNumber(raw?.readingMinutes ?? raw?.reading_minutes, 1)),
    publishedAt,
    updatedAt
  };
}

function normalizeAuthorPostItems(items) {
  if (!Array.isArray(items)) return [];
  return items.map(normalizeAuthorPostItem).filter((item) => item.postId > 0);
}

export function summarizeAuthorPosts(items) {
  const normalized = normalizeAuthorPostItems(items);
  const summary = {
    total: normalized.length,
    draftCount: 0,
    publishedCount: 0,
    otherCount: 0,
    latestUpdatedAt: '',
    latestPublishedAt: '',
    categories: [],
    recentUpdated: [],
    recentPublished: []
  };

  let latestUpdatedMs = 0;
  let latestPublishedMs = 0;
  const categoryCounter = new Map();

  normalized.forEach((item) => {
    if (item.statusCode === STATUS_DRAFT) {
      summary.draftCount += 1;
    } else if (item.statusCode === STATUS_PUBLISHED) {
      summary.publishedCount += 1;
    } else {
      summary.otherCount += 1;
    }

    const key = item.categoryCode || 'uncategorized';
    categoryCounter.set(key, (categoryCounter.get(key) || 0) + 1);

    const updatedMs = Math.max(toTimeValue(item.updatedAt), toTimeValue(item.publishedAt));
    if (updatedMs > latestUpdatedMs) {
      latestUpdatedMs = updatedMs;
      summary.latestUpdatedAt = item.updatedAt || item.publishedAt || '';
    }

    const publishedMs = toTimeValue(item.publishedAt);
    if (publishedMs > latestPublishedMs) {
      latestPublishedMs = publishedMs;
      summary.latestPublishedAt = item.publishedAt || '';
    }
  });

  summary.categories = Array.from(categoryCounter.entries())
    .map(([categoryCode, count]) => ({ categoryCode, count }))
    .sort((a, b) => b.count - a.count || a.categoryCode.localeCompare(b.categoryCode));

  summary.recentUpdated = normalized
    .slice()
    .sort((a, b) => {
      const aValue = Math.max(toTimeValue(a.updatedAt), toTimeValue(a.publishedAt));
      const bValue = Math.max(toTimeValue(b.updatedAt), toTimeValue(b.publishedAt));
      return bValue - aValue;
    })
    .slice(0, 5);

  summary.recentPublished = normalized
    .filter((item) => item.publishedAt)
    .sort((a, b) => toTimeValue(b.publishedAt) - toTimeValue(a.publishedAt))
    .slice(0, 5);

  return summary;
}
