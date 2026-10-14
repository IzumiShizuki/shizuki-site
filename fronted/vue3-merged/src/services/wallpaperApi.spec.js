import { describe, expect, it, vi } from 'vitest';
import { getWallpaperDiscoveryPreviewUrl, getWallhavenItemDetail, searchWallhavenWallpapers, searchWorkshopWallpapers } from './wallpaperApi';

describe('wallpaperApi private discovery', () => {
  it('requires an authorized request for searches and details', async () => {
    await expect(searchWorkshopWallpapers({})).rejects.toThrow('authorizedFetch is required');
    await expect(searchWallhavenWallpapers({})).rejects.toThrow('authorizedFetch is required');
    await expect(getWallhavenItemDetail('pomle9')).rejects.toThrow('authorizedFetch is required');
  });
  it('validates identifiers and uses authorized detail reads', async () => {
    const request = vi.fn().mockResolvedValue({ data: { title: 'Tokyo' } });
    expect(await getWallhavenItemDetail('pomle9', request)).toEqual({ title: 'Tokyo' });
    expect(request).toHaveBeenCalledWith('/api/v1/home-wallpapers/discovery/wallhaven/items/pomle9', { method: 'GET' });
    await expect(getWallhavenItemDetail('../invalid', request)).rejects.toThrow('wallhaven itemId is required');
  });
  it('builds preview paths without including credentials', () => {
    expect(getWallpaperDiscoveryPreviewUrl('Workshop', '2141505896')).toMatch(/\/preview\/workshop\/2141505896$/);
    expect(getWallpaperDiscoveryPreviewUrl('steam', '2141505896')).toBe('');
    expect(getWallpaperDiscoveryPreviewUrl('workshop', '')).toBe('');
  });
  it('sends source tags and complete filters through the authorized client', async () => {
    const request = vi.fn().mockResolvedValue({ data: { items: [] } });
    await searchWorkshopWallpapers({ query: 'rain', page: 1, sort: 'trend', tags: ['Scene', 'Anime'] }, request);
    await searchWallhavenWallpapers({ query: 'city', page: 2, categories: '110', purity: '110', sorting: 'views', order: 'asc', atleast: '2560x1440', ratios: '21x9' }, request);
    expect(request.mock.calls[0][1].query.tags).toBe('Scene,Anime');
    expect(request.mock.calls[1][1].query).toMatchObject({ purity: '110', order: 'asc', ratios: '21x9' });
  });
  it('checks authorization again instead of sharing sensitive search results across accounts', async () => {
    const request = vi.fn().mockResolvedValueOnce({ data: { items: [{ title: 'private' }] } }).mockRejectedValueOnce(new Error('permission revoked'));
    await searchWorkshopWallpapers({ query: 'same' }, request);
    await expect(searchWorkshopWallpapers({ query: 'same' }, request)).rejects.toThrow('permission revoked');
    expect(request).toHaveBeenCalledTimes(2);
  });
});
