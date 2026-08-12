import { afterEach, describe, expect, it, vi } from 'vitest';
import { getWallpaperDiscoveryPreviewUrl, searchWorkshopWallpapers } from './wallpaperApi';

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
});
