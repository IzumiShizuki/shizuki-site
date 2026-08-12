import { describe, expect, it } from 'vitest';
import { getWallpaperDiscoveryPreviewUrl } from './wallpaperApi';

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
});
