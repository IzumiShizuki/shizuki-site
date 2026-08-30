import { buildApiUrl, httpRequest, normalizeApiData } from './httpClient';

const PUBLIC_MEDIA_PATH_PATTERN = /^\/api\/v1\/media\/med_[A-Za-z0-9_-]{27}\/variants\/[A-Z0-9_]+$/;
const DEFAULT_TIMEOUT_MS = 8000;
const PREVIEW_VARIANT_PRIORITY = Object.freeze([
  'THUMB_WEBP',
  'DISPLAY_AVIF',
  'DISPLAY_WEBP'
]);
const BROWSING_VARIANTS = new Set(PREVIEW_VARIANT_PRIORITY);
const THUMBNAIL_VARIANT_PRIORITY = Object.freeze(['THUMB_WEBP', 'DISPLAY_WEBP']);
const DISPLAY_VARIANT_PRIORITY = Object.freeze(['DISPLAY_WEBP', 'THUMB_WEBP']);

function readField(value, camelKey, snakeKey = camelKey) {
  if (!value || typeof value !== 'object') return undefined;
  if (Object.prototype.hasOwnProperty.call(value, camelKey)) return value[camelKey];
  return value[snakeKey];
}

function cleanText(value, maxLength = 240) {
  const text = String(value ?? '').replace(/\s+/g, ' ').trim();
  return text.slice(0, maxLength);
}

function positiveInteger(value) {
  const number = Number(value);
  return Number.isInteger(number) && number > 0 ? number : 0;
}

export function isSiteOwnedPublicMediaPath(value) {
  if (typeof value !== 'string' || value !== value.trim() || /\s/.test(value)) return false;
  return PUBLIC_MEDIA_PATH_PATTERN.test(value);
}

function normalizeVariant(value) {
  const rawPath = readField(value, 'path');
  const path = typeof rawPath === 'string' ? rawPath : '';
  const variant = cleanText(readField(value, 'variant'), 48).toUpperCase();
  if (!BROWSING_VARIANTS.has(variant) || !isSiteOwnedPublicMediaPath(path)) return null;
  const width = positiveInteger(readField(value, 'width'));
  const height = positiveInteger(readField(value, 'height'));
  if (!width || !height) return null;
  const rawCapability = readField(value, 'capability');
  const capability = typeof rawCapability === 'string'
    && rawCapability === rawCapability.trim()
    && rawCapability.length <= 4096
    && !/[\r\n]/.test(rawCapability)
    ? rawCapability
    : '';
  return Object.freeze({
    variant,
    path,
    url: capability ? '' : buildApiUrl(path),
    width,
    height,
    format: cleanText(readField(value, 'format'), 32).toLowerCase(),
    protected: Boolean(capability),
    capability
  });
}

function normalizeVariants(value) {
  const variants = Array.isArray(value)
    ? value.map(normalizeVariant).filter(Boolean)
    : [];
  return variants.sort((left, right) => {
    const leftRank = PREVIEW_VARIANT_PRIORITY.indexOf(left.variant);
    const rightRank = PREVIEW_VARIANT_PRIORITY.indexOf(right.variant);
    return (leftRank < 0 ? 99 : leftRank) - (rightRank < 0 ? 99 : rightRank);
  });
}

function firstVariant(variants, priority, protectedValue) {
  for (const variantName of priority) {
    const match = variants.find((variant) => (
      variant.variant === variantName && variant.protected === protectedValue
    ));
    if (match) return match;
  }
  return null;
}

function normalizeMedia(value) {
  if (!value || typeof value !== 'object') return null;
  const mediaRef = cleanText(readField(value, 'mediaRef', 'media_ref'), 180);
  const variants = normalizeVariants(readField(value, 'variants'));
  if (!mediaRef || variants.length === 0) return null;
  const thumbnail = firstVariant(variants, THUMBNAIL_VARIANT_PRIORITY, false);
  const display = firstVariant(variants, DISPLAY_VARIANT_PRIORITY, false);
  const displayAvif = variants.find((variant) => (
    variant.variant === 'DISPLAY_AVIF' && !variant.protected
  )) || null;
  const protectedThumbnail = firstVariant(variants, THUMBNAIL_VARIANT_PRIORITY, true);
  const protectedDisplay = firstVariant(variants, DISPLAY_VARIANT_PRIORITY, true);
  return Object.freeze({
    mediaRef,
    altText: cleanText(readField(value, 'altText', 'alt_text'), 320),
    variants,
    thumbnail,
    display,
    displayAvif,
    protectedThumbnail,
    protectedDisplay,
    // Keep the established preview aliases for Site menu and list-card callers.
    preview: thumbnail,
    protectedPreview: protectedThumbnail
  });
}

function normalizeAlbumPhoto(value) {
  if (!value || typeof value !== 'object') return null;
  const media = normalizeMedia(readField(value, 'media'));
  return Object.freeze({
    title: cleanText(readField(value, 'title'), 200),
    altText: cleanText(readField(value, 'altText', 'alt_text'), 320),
    caption: cleanText(readField(value, 'caption'), 600),
    locationLabel: cleanText(readField(value, 'locationLabel', 'location_label'), 160),
    media
  });
}

export function normalizeAlbumSummary(value) {
  if (!value || typeof value !== 'object') return null;
  const publicSlug = cleanText(readField(value, 'publicSlug', 'public_slug'), 220);
  const title = cleanText(readField(value, 'title'), 200);
  if (!publicSlug || !title) return null;
  return Object.freeze({
    kind: 'album',
    publicSlug,
    title,
    summary: cleanText(readField(value, 'summary'), 360),
    publishedAt: cleanText(readField(value, 'publishedAt', 'published_at'), 80),
    photoCount: Math.max(0, Number(readField(value, 'photoCount', 'photo_count')) || 0),
    cover: normalizeMedia(readField(value, 'cover'))
  });
}

function normalizeMomentPhoto(value) {
  if (!value || typeof value !== 'object') return null;
  const media = normalizeMedia(value);
  if (!media) return null;
  return Object.freeze({
    ...media,
    locationLabel: cleanText(
      readField(value, 'publishedLocationLabel', 'published_location_label'),
      160
    )
  });
}

export function normalizeMoment(value) {
  if (!value || typeof value !== 'object') return null;
  const publicId = cleanText(readField(value, 'publicId', 'public_id'), 220);
  const body = cleanText(readField(value, 'body'), 1200);
  if (!publicId || !body) return null;
  const photos = Array.isArray(readField(value, 'photos'))
    ? readField(value, 'photos').map(normalizeMomentPhoto).filter(Boolean)
    : [];
  return Object.freeze({
    kind: 'moment',
    publicId,
    body,
    featured: Boolean(readField(value, 'featured')),
    pinned: Boolean(readField(value, 'pinned')),
    publishedAt: cleanText(readField(value, 'publishedAt', 'published_at'), 80),
    photos,
    cover: photos[0] || null
  });
}

export function normalizeMomentDetail(value) {
  if (!value || typeof value !== 'object') return null;
  const moment = normalizeMoment(readField(value, 'moment'));
  if (!moment) return null;
  const unlisted = Boolean(readField(value, 'unlisted'));
  const noIndex = Boolean(readField(value, 'noIndex', 'noindex'));
  return Object.freeze({
    ...moment,
    unlisted,
    noIndex: unlisted || noIndex
  });
}

export function normalizeAlbumDetail(value) {
  if (!value || typeof value !== 'object') return null;
  const publicSlug = cleanText(readField(value, 'publicSlug', 'public_slug'), 220);
  const title = cleanText(readField(value, 'title'), 200);
  if (!publicSlug || !title) return null;
  const photos = Array.isArray(readField(value, 'photos'))
    ? readField(value, 'photos').map(normalizeAlbumPhoto).filter(Boolean)
    : [];
  return Object.freeze({
    kind: 'album-detail',
    publicSlug,
    title,
    summary: cleanText(readField(value, 'summary'), 800),
    visibility: cleanText(readField(value, 'visibility'), 32).toUpperCase(),
    publishedAt: cleanText(readField(value, 'publishedAt', 'published_at'), 80),
    noIndex: Boolean(readField(value, 'noIndex', 'no_index')),
    photos
  });
}

function normalizeListPayload(payload, normalizeItem) {
  const data = normalizeApiData(payload);
  const items = Array.isArray(data) ? data : [];
  return items.map(normalizeItem).filter(Boolean);
}

function normalizeCursorPayload(payload, normalizeItem) {
  const data = normalizeApiData(payload);
  const items = Array.isArray(readField(data, 'items'))
    ? readField(data, 'items').map(normalizeItem).filter(Boolean)
    : [];
  const hasMore = Boolean(readField(data, 'hasMore', 'has_more'));
  return Object.freeze({
    items,
    hasMore,
    nextCursor: hasMore ? cleanText(readField(data, 'nextCursor', 'next_cursor'), 2048) : ''
  });
}

function requestOptions(signal) {
  return {
    method: 'GET',
    signal,
    timeoutMs: DEFAULT_TIMEOUT_MS
  };
}

export async function getFeaturedAlbums(limit = 2, signal) {
  const payload = await httpRequest('/api/v1/albums/featured', {
    ...requestOptions(signal),
    query: { limit: Math.min(6, Math.max(1, Number(limit) || 2)) }
  });
  return normalizeListPayload(payload, normalizeAlbumSummary);
}

export async function getFeaturedMoments(limit = 2, signal) {
  const payload = await httpRequest('/api/v1/moments/featured', {
    ...requestOptions(signal),
    query: { limit: Math.min(6, Math.max(1, Number(limit) || 2)) }
  });
  return normalizeListPayload(payload, normalizeMoment);
}

export async function getAlbumsPage({ cursor = '', limit = 12, signal } = {}) {
  const payload = await httpRequest('/api/v1/albums', {
    ...requestOptions(signal),
    query: {
      cursor,
      limit: Math.min(30, Math.max(1, Number(limit) || 12))
    }
  });
  return normalizeCursorPayload(payload, normalizeAlbumSummary);
}

export async function getAlbumDetail(publicSlug, signal) {
  const slug = cleanText(publicSlug, 220);
  if (!slug) throw new TypeError('publicSlug is required');
  const payload = await httpRequest(`/api/v1/albums/${encodeURIComponent(slug)}`, requestOptions(signal));
  const detail = normalizeAlbumDetail(normalizeApiData(payload));
  if (!detail) throw new TypeError('Album detail response is invalid');
  return detail;
}

export async function getMomentsPage({ cursor = '', limit = 12, signal } = {}) {
  const payload = await httpRequest('/api/v1/moments', {
    ...requestOptions(signal),
    query: {
      cursor,
      limit: Math.min(30, Math.max(1, Number(limit) || 12))
    }
  });
  return normalizeCursorPayload(payload, normalizeMoment);
}

export async function getMomentDetail(publicId, signal) {
  const identifier = cleanText(publicId, 220);
  if (!identifier) throw new TypeError('publicId is required');
  const payload = await httpRequest(`/api/v1/moments/${encodeURIComponent(identifier)}`, requestOptions(signal));
  const detail = normalizeMomentDetail(normalizeApiData(payload));
  if (!detail) throw new TypeError('Moment detail response is invalid');
  return detail;
}
