import { afterEach, describe, expect, it, vi } from 'vitest';
import {
  getNearbyWeather,
  getSiteWeather,
  getTodayQuote,
  normalizeDailyQuote,
  normalizeWeatherSnapshot
} from './siteWidgetsApi';

function jsonResponse(data) {
  return new Response(JSON.stringify({ code: 'SUCCESS', data }), {
    status: 200,
    headers: { 'content-type': 'application/json' }
  });
}

afterEach(() => vi.unstubAllGlobals());

describe('siteWidgetsApi', () => {
  it('normalizes weather freshness, forecast and visible HTTPS attribution', async () => {
    const fetchMock = vi.fn().mockResolvedValue(jsonResponse({
      locationLabel: '杭州',
      temperature: 28.4,
      apparentTemperature: 30.1,
      relativeHumidity: 62,
      weatherCode: 2,
      windSpeed: 8.2,
      forecast: [{
        date: '2026-08-29',
        minimumTemperature: 23,
        maximumTemperature: 31,
        weatherCode: 2,
        precipitationProbability: 20
      }],
      observedAt: '2026-08-29T01:00:00Z',
      fetchedAt: '2026-08-29T01:05:00Z',
      freshness: 'fresh',
      attribution: { name: 'Open-Meteo', destination: 'https://open-meteo.com/' }
    }));
    vi.stubGlobal('fetch', fetchMock);

    const weather = await getSiteWeather();
    expect(weather).toMatchObject({
      available: true,
      freshness: 'fresh',
      locationLabel: '杭州',
      temperature: 28.4,
      attribution: { name: 'Open-Meteo', destination: 'https://open-meteo.com/' }
    });
    expect(weather.forecast).toHaveLength(1);
  });

  it('keeps unavailable weather and quotes empty instead of filling zero or sample content', () => {
    const weather = normalizeWeatherSnapshot({
      freshness: 'unavailable',
      attribution: { name: 'Open-Meteo', destination: 'https://open-meteo.com/' },
      temperature: 0,
      locationLabel: 'guessed city'
    });
    const quote = normalizeDailyQuote({ state: 'unavailable', text: 'sample quote' });

    expect(weather).toMatchObject({ available: false, temperature: null, locationLabel: '', forecast: [] });
    expect(quote).toMatchObject({ available: false, text: '', sourceUrl: '' });
  });

  it('refuses nearby weather before explicit consent or with invalid coordinates', async () => {
    const fetchMock = vi.fn();
    vi.stubGlobal('fetch', fetchMock);

    await expect(getNearbyWeather({ latitude: 30, longitude: 120, consent: false })).rejects.toThrow('consent');
    await expect(getNearbyWeather({ latitude: 95, longitude: 120, consent: true })).rejects.toThrow('Coordinates');
    expect(fetchMock).not.toHaveBeenCalled();
  });

  it('requests nearby weather only after consent and preserves quote provenance', async () => {
    const fetchMock = vi.fn()
      .mockResolvedValueOnce(jsonResponse({
        locationLabel: '附近位置',
        temperature: 26,
        weatherCode: 1,
        freshness: 'fresh',
        attribution: { name: 'Open-Meteo', destination: 'https://open-meteo.com/' }
      }))
      .mockResolvedValueOnce(jsonResponse({
        snapshotId: 7,
        effectiveDate: '2026-08-29',
        text: '风经过书页，也经过今天。',
        author: '本地精选',
        providerCode: 'LOCAL',
        sourceUrl: 'http://unsafe.example/source',
        state: 'current'
      }));
    vi.stubGlobal('fetch', fetchMock);

    await getNearbyWeather({ latitude: 30.25, longitude: 120.18, consent: true });
    const quote = await getTodayQuote();

    expect(fetchMock.mock.calls[0][0]).toMatch(/\/api\/v1\/site\/weather\/nearby$/);
    expect(JSON.parse(fetchMock.mock.calls[0][1].body)).toEqual({
      latitude: 30.25,
      longitude: 120.18,
      consent: true
    });
    expect(quote).toMatchObject({
      available: true,
      text: '风经过书页，也经过今天。',
      providerCode: 'LOCAL',
      sourceUrl: ''
    });
  });
});
