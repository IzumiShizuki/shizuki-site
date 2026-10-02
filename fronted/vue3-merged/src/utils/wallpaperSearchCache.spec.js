import { describe, expect, it, vi } from 'vitest';
import { createWallpaperSearchCache } from './wallpaperSearchCache';

describe('wallpaper search cache', () => {
  it('deduplicates in-flight calls and returns isolated payload copies', async () => {
    const cache = createWallpaperSearchCache();
    let resolve;
    const loader = vi.fn(() => new Promise((done) => { resolve = done; }));
    const first = cache.get('query=a', loader);
    const second = cache.get('query=a', loader);
    await Promise.resolve();
    resolve({ items: [{ title: 'A' }] });
    const [a, b] = await Promise.all([first, second]);
    expect(loader).toHaveBeenCalledTimes(1);
    a.items[0].title = 'mutated';
    expect(b.items[0].title).toBe('A');
    expect((await cache.get('query=a', loader)).items[0].title).toBe('A');
  });

  it('expires and bounds entries, while force refresh bypasses a hit', async () => {
    let now = 100;
    const cache = createWallpaperSearchCache({ ttlMs: 20, maxEntries: 2, now: () => now });
    const loader = vi.fn(async (value) => ({ value }));
    await cache.get('a', () => loader('one'));
    await cache.get('a', () => loader('ignored'));
    await cache.get('a', () => loader('fresh'), { forceRefresh: true });
    await cache.get('b', () => loader('two'));
    await cache.get('c', () => loader('three'));
    expect(cache.size).toBe(2);
    now = 121;
    expect(cache.size).toBe(0);
    expect(loader).toHaveBeenCalledTimes(4);
  });

  it('does not cache rejected requests', async () => {
    const cache = createWallpaperSearchCache();
    await expect(cache.get('bad', async () => { throw new Error('offline'); })).rejects.toThrow('offline');
    await expect(cache.get('bad', async () => ({ ok: true }))).resolves.toEqual({ ok: true });
  });
});
