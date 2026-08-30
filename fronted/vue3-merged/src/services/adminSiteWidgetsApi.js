import { normalizeApiData } from './httpClient';
import { normalizeDailyQuote, normalizeWeatherSnapshot } from './siteWidgetsApi';

function requestWith(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') throw new TypeError('authorizedFetch is required');
  return authorizedFetch;
}

function read(value, camelKey, snakeKey = camelKey) {
  if (!value || typeof value !== 'object') return undefined;
  return Object.prototype.hasOwnProperty.call(value, camelKey) ? value[camelKey] : value[snakeKey];
}

function string(value, fallback = '') {
  const normalized = String(value ?? '').trim();
  return normalized || fallback;
}

function number(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : fallback;
}

function positiveId(value, label) {
  const id = Number(value);
  if (!Number.isSafeInteger(id) || id <= 0) throw new TypeError(`${label} must be a positive integer`);
  return id;
}

function quotePath(quoteId, suffix = '') {
  return `/api/v1/admin/site-widgets/quotes/${encodeURIComponent(positiveId(quoteId, 'quoteId'))}${suffix}`;
}

function quotePayload(payload = {}) {
  return {
    text: string(payload.text),
    author: string(payload.author),
    sourceTitle: string(payload.sourceTitle),
    categoryCode: string(payload.categoryCode),
    providerCode: string(payload.providerCode, 'LOCAL').toUpperCase(),
    providerUuid: string(payload.providerUuid),
    sourceUrl: string(payload.sourceUrl)
  };
}

export function normalizeAdminQuote(value) {
  if (!value || typeof value !== 'object') throw new TypeError('Quote response is invalid');
  const id = positiveId(read(value, 'id'), 'quoteId');
  return Object.freeze({
    id,
    text: string(read(value, 'text')),
    author: string(read(value, 'author')),
    sourceTitle: string(read(value, 'sourceTitle', 'source_title')),
    categoryCode: string(read(value, 'categoryCode', 'category_code')),
    providerCode: string(read(value, 'providerCode', 'provider_code'), 'LOCAL').toUpperCase(),
    providerUuid: string(read(value, 'providerUuid', 'provider_uuid')),
    sourceUrl: string(read(value, 'sourceUrl', 'source_url')),
    approvalStatus: string(read(value, 'approvalStatus', 'approval_status'), 'DRAFT').toUpperCase(),
    enabled: Boolean(read(value, 'enabled', 'enabled_flag')),
    version: Math.max(0, number(read(value, 'version', 'version_num'))),
    createdAt: string(read(value, 'createTime', 'create_time')),
    updatedAt: string(read(value, 'updateTime', 'update_time'))
  });
}

export function normalizeWidgetConfiguration(value) {
  if (!value || typeof value !== 'object') throw new TypeError('Widget configuration response is invalid');
  return Object.freeze({
    version: Math.max(0, number(read(value, 'version'))),
    activeLocationId: number(read(value, 'activeLocationId', 'active_location_id'), null),
    displayName: string(read(value, 'displayName', 'display_name')),
    latitude: number(read(value, 'latitude'), null),
    longitude: number(read(value, 'longitude'), null),
    timezone: string(read(value, 'timezone')),
    weatherEnabled: Boolean(read(value, 'weatherEnabled', 'weather_enabled')),
    weatherMaxStaleMinutes: Math.max(15, number(read(value, 'weatherMaxStaleMinutes', 'weather_max_stale_minutes'), 360)),
    quoteSourceMode: string(read(value, 'quoteSourceMode', 'quote_source_mode'), 'LOCAL').toUpperCase(),
    hitokotoEnabled: Boolean(read(value, 'hitokotoEnabled', 'hitokoto_enabled'))
  });
}

function unwrap(value) {
  return normalizeApiData(value);
}

export async function getAdminWidgetConfiguration(authorizedFetch) {
  const value = unwrap(await requestWith(authorizedFetch)(
    '/api/v1/admin/site-widgets/configuration',
    { method: 'GET' }
  ));
  return value == null ? null : normalizeWidgetConfiguration(value);
}

export async function saveAdminWidgetConfiguration(payload, authorizedFetch) {
  return normalizeWidgetConfiguration(unwrap(await requestWith(authorizedFetch)(
    '/api/v1/admin/site-widgets/configuration',
    {
      method: 'PUT',
      body: {
        expectedVersion: Math.max(0, number(payload?.version)),
        displayName: string(payload?.displayName),
        latitude: number(payload?.latitude, null),
        longitude: number(payload?.longitude, null),
        timezone: string(payload?.timezone),
        weatherEnabled: Boolean(payload?.weatherEnabled),
        weatherMaxStaleMinutes: Math.max(15, Math.min(10080, number(payload?.weatherMaxStaleMinutes, 360))),
        quoteSourceMode: string(payload?.quoteSourceMode, 'LOCAL').toUpperCase(),
        hitokotoEnabled: Boolean(payload?.hitokotoEnabled)
      }
    }
  )));
}

export async function getAdminSiteWeather(authorizedFetch) {
  return normalizeWeatherSnapshot(await requestWith(authorizedFetch)('/api/v1/site/weather', { method: 'GET' }));
}

export async function listAdminQuotes({ limit = 200 } = {}, authorizedFetch) {
  const value = unwrap(await requestWith(authorizedFetch)('/api/v1/admin/site-widgets/quotes', {
    method: 'GET',
    query: { limit: Math.max(1, Math.min(500, number(limit, 200))) }
  }));
  return Array.isArray(value) ? value.map(normalizeAdminQuote) : [];
}

export async function getAdminTodayQuote(authorizedFetch) {
  const response = await requestWith(authorizedFetch)('/api/v1/site/quote/today', { method: 'GET' });
  return normalizeDailyQuote(response);
}

export async function createAdminQuote(payload, authorizedFetch) {
  return normalizeAdminQuote(unwrap(await requestWith(authorizedFetch)(
    '/api/v1/admin/site-widgets/quotes',
    { method: 'POST', body: quotePayload(payload) }
  )));
}

export async function updateAdminQuote(quoteId, expectedVersion, payload, authorizedFetch) {
  return normalizeAdminQuote(unwrap(await requestWith(authorizedFetch)(quotePath(quoteId), {
    method: 'PUT',
    query: { expected_version: Math.max(0, number(expectedVersion)) },
    body: quotePayload(payload)
  })));
}

export async function reviewAdminQuote(quoteId, expectedVersion, approvalStatus, enabled, authorizedFetch) {
  return normalizeAdminQuote(unwrap(await requestWith(authorizedFetch)(quotePath(quoteId, '/review'), {
    method: 'PUT',
    body: {
      expectedVersion: Math.max(0, number(expectedVersion)),
      approvalStatus: string(approvalStatus, 'DRAFT').toUpperCase(),
      enabled: Boolean(enabled)
    }
  })));
}

export async function deleteAdminQuote(quoteId, expectedVersion, authorizedFetch) {
  return Boolean(unwrap(await requestWith(authorizedFetch)(quotePath(quoteId), {
    method: 'DELETE',
    query: { expected_version: Math.max(0, number(expectedVersion)) }
  })));
}

export async function refreshAdminDailyQuote(authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)('/api/v1/admin/site-widgets/quote/refresh', {
    method: 'POST'
  }));
}
