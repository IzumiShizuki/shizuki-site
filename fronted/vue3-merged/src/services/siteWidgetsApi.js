import { httpRequest, normalizeApiData } from './httpClient';

const REQUEST_TIMEOUT_MS = 8000;
const WEATHER_STATES = new Set(['fresh', 'stale', 'unavailable']);
const QUOTE_STATES = new Set(['current', 'stale', 'local_alternative', 'unavailable']);

function readField(value, camelKey, snakeKey = camelKey) {
  if (!value || typeof value !== 'object') return undefined;
  return Object.prototype.hasOwnProperty.call(value, camelKey) ? value[camelKey] : value[snakeKey];
}
function text(value, maxLength = 320) {
  return String(value ?? '').replace(/\s+/g, ' ').trim().slice(0, maxLength);
}

function finiteNumber(value) {
  const number = Number(value);
  return Number.isFinite(number) ? number : null;
}

function safeHttpsUrl(value) {
  const candidate = text(value, 2048);
  if (!candidate) return '';
  try {
    const parsed = new URL(candidate);
    return parsed.protocol === 'https:' ? parsed.toString() : '';
  } catch {
    return '';
  }
}

function normalizeAttribution(value) {
  const name = text(readField(value, 'name'), 120);
  const destination = safeHttpsUrl(readField(value, 'destination'));
  return name && destination ? Object.freeze({ name, destination }) : null;
}

function normalizeForecastDay(value) {
  const date = text(readField(value, 'date'), 20);
  const minimumTemperature = finiteNumber(readField(value, 'minimumTemperature', 'minimum_temperature'));
  const maximumTemperature = finiteNumber(readField(value, 'maximumTemperature', 'maximum_temperature'));
  const weatherCode = finiteNumber(readField(value, 'weatherCode', 'weather_code'));
  const precipitationProbability = finiteNumber(
    readField(value, 'precipitationProbability', 'precipitation_probability')
  );
  if (!date || minimumTemperature == null || maximumTemperature == null || weatherCode == null
    || precipitationProbability == null) return null;
  return Object.freeze({
    date,
    minimumTemperature,
    maximumTemperature,
    weatherCode,
    precipitationProbability: Math.min(100, Math.max(0, precipitationProbability))
  });
}

export function normalizeWeatherSnapshot(payload) {
  const value = normalizeApiData(payload);
  const freshness = text(readField(value, 'freshness'), 32).toLowerCase();
  const attribution = normalizeAttribution(readField(value, 'attribution'));
  if (!WEATHER_STATES.has(freshness) || !attribution) {
    throw new TypeError('Weather response is missing freshness or attribution');
  }
  if (freshness === 'unavailable') {
    return Object.freeze({
      available: false,
      freshness,
      locationLabel: '',
      temperature: null,
      apparentTemperature: null,
      relativeHumidity: null,
      weatherCode: null,
      windSpeed: null,
      forecast: [],
      observedAt: '',
      fetchedAt: '',
      attribution
    });
  }
  const temperature = finiteNumber(readField(value, 'temperature'));
  const weatherCode = finiteNumber(readField(value, 'weatherCode', 'weather_code'));
  if (temperature == null || weatherCode == null) {
    throw new TypeError('Available weather response is incomplete');
  }
  const forecast = Array.isArray(readField(value, 'forecast'))
    ? readField(value, 'forecast').map(normalizeForecastDay).filter(Boolean)
    : [];
  return Object.freeze({
    available: true,
    freshness,
    locationLabel: text(readField(value, 'locationLabel', 'location_label'), 160),
    temperature,
    apparentTemperature: finiteNumber(readField(value, 'apparentTemperature', 'apparent_temperature')),
    relativeHumidity: finiteNumber(readField(value, 'relativeHumidity', 'relative_humidity')),
    weatherCode,
    windSpeed: finiteNumber(readField(value, 'windSpeed', 'wind_speed')),
    forecast,
    observedAt: text(readField(value, 'observedAt', 'observed_at'), 80),
    fetchedAt: text(readField(value, 'fetchedAt', 'fetched_at'), 80),
    attribution
  });
}

export function normalizeDailyQuote(payload) {
  const value = normalizeApiData(payload);
  const state = text(readField(value, 'state'), 32).toLowerCase();
  if (!QUOTE_STATES.has(state)) throw new TypeError('Daily quote response has an invalid state');
  if (state === 'unavailable') {
    return Object.freeze({
      available: false,
      state,
      snapshotId: null,
      localQuoteId: null,
      effectiveDate: '',
      text: '',
      author: '',
      sourceTitle: '',
      categoryCode: '',
      providerCode: '',
      providerUuid: '',
      sourceUrl: '',
      fetchedAt: ''
    });
  }
  const quoteText = text(readField(value, 'text'), 1200);
  const providerCode = text(readField(value, 'providerCode', 'provider_code'), 80);
  if (!quoteText || !providerCode) throw new TypeError('Available daily quote is missing text or provenance');
  return Object.freeze({
    available: true,
    state,
    snapshotId: finiteNumber(readField(value, 'snapshotId', 'snapshot_id')),
    localQuoteId: finiteNumber(readField(value, 'localQuoteId', 'local_quote_id')),
    effectiveDate: text(readField(value, 'effectiveDate', 'effective_date'), 20),
    text: quoteText,
    author: text(readField(value, 'author'), 180),
    sourceTitle: text(readField(value, 'sourceTitle', 'source_title'), 240),
    categoryCode: text(readField(value, 'categoryCode', 'category_code'), 80),
    providerCode,
    providerUuid: text(readField(value, 'providerUuid', 'provider_uuid'), 180),
    sourceUrl: safeHttpsUrl(readField(value, 'sourceUrl', 'source_url')),
    fetchedAt: text(readField(value, 'fetchedAt', 'fetched_at'), 80)
  });
}

function getOptions(signal) {
  return { method: 'GET', signal, timeoutMs: REQUEST_TIMEOUT_MS };
}

export async function getSiteWeather(signal) {
  return normalizeWeatherSnapshot(await httpRequest('/api/v1/site/weather', getOptions(signal)));
}

export async function getNearbyWeather({ latitude, longitude, consent, signal } = {}) {
  const normalizedLatitude = finiteNumber(latitude);
  const normalizedLongitude = finiteNumber(longitude);
  if (consent !== true) throw new TypeError('Explicit geolocation consent is required');
  if (normalizedLatitude == null || normalizedLatitude < -90 || normalizedLatitude > 90
    || normalizedLongitude == null || normalizedLongitude < -180 || normalizedLongitude > 180) {
    throw new TypeError('Coordinates are outside the valid geographic range');
  }
  return normalizeWeatherSnapshot(await httpRequest('/api/v1/site/weather/nearby', {
    method: 'POST',
    signal,
    timeoutMs: REQUEST_TIMEOUT_MS,
    body: {
      latitude: normalizedLatitude,
      longitude: normalizedLongitude,
      consent: true
    }
  }));
}

export async function getTodayQuote(signal) {
  return normalizeDailyQuote(await httpRequest('/api/v1/site/quote/today', getOptions(signal)));
}

export async function getQuoteAlternative(afterQuoteId, signal) {
  const normalizedId = finiteNumber(afterQuoteId);
  return normalizeDailyQuote(await httpRequest('/api/v1/site/quote/alternatives', {
    ...getOptions(signal),
    query: { after_quote_id: normalizedId && normalizedId > 0 ? normalizedId : '' }
  }));
}
