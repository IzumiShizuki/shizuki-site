import { normalizeApiData } from './httpClient';
import { absolutizeApiUrl } from './apiBase';

const ROOT = '/api/v1/me/daily-art';
const field = (item, camel, snake = camel) => item?.[camel] ?? item?.[snake];

export function parsePixivUserId(raw) {
  const value = String(raw || '').trim();
  if (/^[1-9]\d{0,11}$/.test(value)) return value;
  try {
    const url = new URL(value);
    if (url.protocol !== 'https:' || url.hostname !== 'www.pixiv.net') return '';
    return url.pathname.match(/^\/(?:[a-z]{2}\/)?users\/([1-9]\d{0,11})(?:\/.*)?$/)?.[1] || '';
  } catch { return ''; }
}

export function shanghaiDate(now = new Date()) {
  const parts = new Intl.DateTimeFormat('en-CA', {
    timeZone: 'Asia/Shanghai', year: 'numeric', month: '2-digit', day: '2-digit'
  }).formatToParts(now);
  const values = Object.fromEntries(parts.map(({ type, value }) => [type, value]));
  return `${values.year}-${values.month}-${values.day}`;
}

function normalizeArtist(item) {
  const id = parsePixivUserId(item?.id);
  return id ? { id, name: String(item?.name || id), sourceUrl: `https://www.pixiv.net/users/${id}` } : null;
}

export function normalizeArtwork(item) {
  const id = parsePixivUserId(item?.id);
  if (!id) return null;
  return {
    id, title: String(item?.title || '未命名作品'),
    artistId: parsePixivUserId(field(item, 'artistId', 'artist_id')),
    artistName: String(field(item, 'artistName', 'artist_name') || 'Pixiv 画师'),
    imageUrl: absolutizeApiUrl(`/api/v1/daily-art/pixiv/artworks/${id}/preview`),
    sourceUrl: `https://www.pixiv.net/artworks/${id}`,
    tags: Array.isArray(item?.tags) ? item.tags.map(String) : []
  };
}

export function normalizeDailySettings(payload) {
  const data = normalizeApiData(payload) || {};
  return {
    connected: Boolean(data.connected),
    accountId: parsePixivUserId(field(data, 'accountId', 'account_id')),
    accountName: String(field(data, 'accountName', 'account_name') || ''),
    manualArtists: (field(data, 'manualArtists', 'manual_artists') || []).map(normalizeArtist).filter(Boolean),
    followedArtists: (field(data, 'followedArtists', 'followed_artists') || []).map(normalizeArtist).filter(Boolean),
    truncated: Boolean(data.truncated),
    includePrivate: Boolean(field(data, 'includePrivate', 'include_private')),
    syncedAt: String(field(data, 'syncedAt', 'synced_at') || '')
  };
}

export function normalizeDailyContent(payload) {
  const data = normalizeApiData(payload) || {};
  const wife = data.wife;
  return {
    date: String(data.date || ''),
    recommendationState: String(field(data, 'recommendationState', 'recommendation_state') || 'empty'),
    artworks: (data.artworks || []).map(normalizeArtwork).filter(Boolean),
    wife: wife ? {
      name: String(wife.name || ''), tag: String(wife.tag || ''), series: String(wife.series || ''),
      searchUrl: `https://www.pixiv.net/tags/${encodeURIComponent(String(wife.tag || '妹'))}/artworks?mode=safe`,
      artwork: normalizeArtwork(wife.artwork)
    } : null
  };
}

export function createDailyArtApi(authorizedFetch, expectedUserId) {
  async function request(path, options = {}) {
    const response = await authorizedFetch(`${ROOT}${path}`, {
      timeoutMs: 40000, ...options
    }, { expectedUserId });
    return normalizeApiData(response);
  }
  return {
    settings: async () => normalizeDailySettings(await request('/settings')),
    today: async () => normalizeDailyContent(await request('/today')),
    connect: async (accountId, session) => normalizeDailySettings(await request('/pixiv', {
      method: 'PUT', body: { accountId, session }
    })),
    disconnect: async () => normalizeDailySettings(await request('/pixiv', { method: 'DELETE' })),
    sync: async (includePrivate) => normalizeDailySettings(await request('/pixiv/sync', {
      method: 'POST', query: { include_private: Boolean(includePrivate) }
    })),
    saveArtists: async (artistIds) => normalizeDailySettings(await request('/artists', { method: 'PUT', body: { artistIds } })),
    search: async (query) => {
      const result = await request('/search', { query: { q: query } });
      return (result?.artworks || []).map(normalizeArtwork).filter(Boolean);
    }
  };
}
