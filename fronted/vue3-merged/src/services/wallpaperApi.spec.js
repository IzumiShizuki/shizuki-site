import { afterEach, describe, expect, it, vi } from 'vitest';
import {
  getWallpaperDiscoveryPreviewUrl,
  searchWallhavenWallpapers,
  searchWorkshopWallpapers
} from './wallpaperApi';

afterEach(() => {
  vi.restoreAllMocks();
});

describe('wallpaperApi', () => {
  it('builds same-origin preview URLs for supported sources', () => {
    expect(getWallpaperDiscoveryPreviewUrl('Workshop', '2141505896')).toMatch(
      /\/api\/v1\/home-wallpapers\/discovery\/preview\/workshop\/2141505896$/
    );
    expect(getWallpaperDiscoveryPreviewUrl('wallhaven', 'x8gxgz')).toMatch(
      /\/api\/v1\/home-wallpapers\/discovery\/preview\/wallhaven\/x8gxgz$/
    );
  });

  it('rejects unsupported or empty preview identifiers', () => {
    expect(getWallpaperDiscoveryPreviewUrl('steam', '2141505896')).toBe('');
    expect(getWallpaperDiscoveryPreviewUrl('workshop', '')).toBe('');
  });

  it('uses the public http client for guest discovery reads', async () => {
    const fetchMock = vi.fn().mockResolvedValue({
      ok: true,
      headers: { get: () => 'application/json' },
      json: async () => ({ code: 'OK', data: { items: [] } })
    });
    vi.stubGlobal('fetch', fetchMock);

    await searchWorkshopWallpapers({ query: 'rain', page: 2, sort: 'trend' }, null);

    expect(fetchMock).toHaveBeenCalledWith(
      expect.stringMatching(/\/api\/v1\/home-wallpapers\/discovery\/workshop\/search\?query=rain&page=2&sort=trend/),
      expect.objectContaining({ method: 'GET' })
    );
  });

  it('sends Workshop source tags and complete Wallhaven filters', async () => {
    const fetchMock = vi.fn().mockResolvedValue({
      ok: true,
      headers: { get: () => 'application/json' },
      json: async () => ({ code: 'OK', data: { items: [] } })
    });
    vi.stubGlobal('fetch', fetchMock);

    await searchWorkshopWallpapers({
      query: 'rain',
      page: 1,
      sort: 'trend',
      tags: ['Scene', 'Anime', '1920 x 1080']
    });
    await searchWallhavenWallpapers({
      query: 'city',
      page: 2,
      categories: '110',
      purity: '110',
      sorting: 'views',
      order: 'asc',
      atleast: '2560x1440',
      ratios: '21x9,32x9'
    });

    expect(fetchMock.mock.calls[0][0]).toContain('tags=Scene%2CAnime%2C1920%20x%201080');
    expect(fetchMock.mock.calls[1][0]).toContain('purity=110');
    expect(fetchMock.mock.calls[1][0]).toContain('order=asc');
    expect(fetchMock.mock.calls[1][0]).toContain('ratios=21x9%2C32x9');
  });
});
