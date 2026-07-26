import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import {
  IMAGE_CACHE_NAME,
  SNAPSHOT_STORAGE_KEY,
  loadCachedWallpaperObjectUrl,
  persistWallpaperImage,
  readBootWallpaperSnapshot,
  stableWallpaperCacheKey,
  writeBootWallpaperSnapshot
} from './wallpaperBootCache';

class FakeCache {
  constructor() {
    this.store = new Map();
  }

  static keyOf(key) {
    return typeof key === 'string' ? key : key.url;
  }

  async match(key) {
    return this.store.get(FakeCache.keyOf(key));
  }

  async put(key, response) {
    this.store.set(FakeCache.keyOf(key), response);
  }

  async keys() {
    return [...this.store.keys()].map((url) => ({ url }));
  }

  async delete(key) {
    return this.store.delete(FakeCache.keyOf(key));
  }
}

function fakeImageResponse(overrides = {}) {
  return {
    ok: true,
    type: 'basic',
    headers: {
      get: (name) => (String(name).toLowerCase() === 'content-type' ? 'image/jpeg' : '')
    },
    blob: async () => new Blob(['fake-image-bytes'], { type: 'image/jpeg' }),
    ...overrides
  };
}

let fakeCache;

beforeEach(() => {
  window.localStorage.clear();
  fakeCache = new FakeCache();
  vi.stubGlobal('caches', {
    open: vi.fn(async (name) => {
      expect(name).toBe(IMAGE_CACHE_NAME);
      return fakeCache;
    })
  });
  if (!URL.createObjectURL) {
    URL.createObjectURL = () => '';
  }
  vi.spyOn(URL, 'createObjectURL').mockReturnValue('blob:fake-object-url');
});

afterEach(() => {
  vi.unstubAllGlobals();
  vi.restoreAllMocks();
});

describe('stableWallpaperCacheKey', () => {
  it('strips query and hash from absolute urls', () => {
    expect(
      stableWallpaperCacheKey('https://oss.example.com/wallpapers/1/visual.jpg?x-oss-expires=600&signature=abc#frag')
    ).toBe('https://oss.example.com/wallpapers/1/visual.jpg');
  });

  it('resolves relative urls against current origin', () => {
    const expected = new URL('/images/original-bg.webp', window.location.href).toString();
    expect(stableWallpaperCacheKey('/images/original-bg.webp?v=2')).toBe(expected);
  });

  it('rejects empty, data, blob and non-http urls', () => {
    expect(stableWallpaperCacheKey('')).toBe('');
    expect(stableWallpaperCacheKey('   ')).toBe('');
    expect(stableWallpaperCacheKey('data:image/png;base64,AAAA')).toBe('');
    expect(stableWallpaperCacheKey('blob:https://a/b')).toBe('');
    expect(stableWallpaperCacheKey('javascript:alert(1)')).toBe('');
  });
});

describe('boot wallpaper snapshot', () => {
  it('round-trips a snapshot through localStorage', () => {
    const ok = writeBootWallpaperSnapshot({
      url: 'https://oss.example.com/wallpapers/9/preview.jpg?signature=abc',
      wallpaperId: 9
    });
    expect(ok).toBe(true);

    const snapshot = readBootWallpaperSnapshot();
    expect(snapshot).toBeTruthy();
    expect(snapshot.url).toBe('https://oss.example.com/wallpapers/9/preview.jpg?signature=abc');
    expect(snapshot.key).toBe('https://oss.example.com/wallpapers/9/preview.jpg');
    expect(snapshot.wallpaperId).toBe(9);
    expect(snapshot.savedAt).toBeGreaterThan(0);
  });

  it('refuses to write empty or uncacheable urls', () => {
    expect(writeBootWallpaperSnapshot({ url: '' })).toBe(false);
    expect(writeBootWallpaperSnapshot({ url: 'data:image/png;base64,AAAA' })).toBe(false);
    expect(window.localStorage.getItem(SNAPSHOT_STORAGE_KEY)).toBeNull();
  });

  it('returns null for corrupt or incomplete payloads', () => {
    window.localStorage.setItem(SNAPSHOT_STORAGE_KEY, '{not json');
    expect(readBootWallpaperSnapshot()).toBeNull();

    window.localStorage.setItem(SNAPSHOT_STORAGE_KEY, JSON.stringify({ url: 'https://a/b.jpg' }));
    expect(readBootWallpaperSnapshot()).toBeNull();

    window.localStorage.setItem(SNAPSHOT_STORAGE_KEY, JSON.stringify({ key: 'https://a/b.jpg' }));
    expect(readBootWallpaperSnapshot()).toBeNull();
  });
});

describe('persistWallpaperImage', () => {
  it('fetches and stores image bytes under the stable key', async () => {
    const fetchMock = vi.fn(async () => fakeImageResponse());
    vi.stubGlobal('fetch', fetchMock);

    const stored = await persistWallpaperImage('https://oss.example.com/wallpapers/1/visual.jpg?signature=abc');
    expect(stored).toBe(true);
    expect(fetchMock).toHaveBeenCalledTimes(1);
    expect(fakeCache.store.has('https://oss.example.com/wallpapers/1/visual.jpg')).toBe(true);
  });

  it('skips the network when the stable key is already cached', async () => {
    const fetchMock = vi.fn(async () => fakeImageResponse());
    vi.stubGlobal('fetch', fetchMock);

    await persistWallpaperImage('https://oss.example.com/wallpapers/1/visual.jpg?signature=first');
    const again = await persistWallpaperImage('https://oss.example.com/wallpapers/1/visual.jpg?signature=rotated');
    expect(again).toBe(true);
    expect(fetchMock).toHaveBeenCalledTimes(1);
  });

  it('does not store failed or html responses', async () => {
    vi.stubGlobal('fetch', vi.fn(async () => fakeImageResponse({ ok: false })));
    expect(await persistWallpaperImage('https://oss.example.com/broken.jpg')).toBe(false);

    vi.stubGlobal(
      'fetch',
      vi.fn(async () =>
        fakeImageResponse({
          headers: { get: () => 'text/html; charset=utf-8' }
        })
      )
    );
    expect(await persistWallpaperImage('https://oss.example.com/error-page.jpg')).toBe(false);
    expect(fakeCache.store.size).toBe(0);
  });

  it('survives fetch rejections (e.g. missing CORS headers)', async () => {
    vi.stubGlobal('fetch', vi.fn(async () => {
      throw new TypeError('Failed to fetch');
    }));
    expect(await persistWallpaperImage('https://no-cors.example.com/wall.jpg')).toBe(false);
  });

  it('prunes the oldest entries beyond the cache limit', async () => {
    vi.stubGlobal('fetch', vi.fn(async () => fakeImageResponse()));
    for (let i = 1; i <= 6; i += 1) {
      await persistWallpaperImage(`https://oss.example.com/wallpapers/${i}/visual.jpg`);
    }
    expect(fakeCache.store.size).toBeLessThanOrEqual(4);
    expect(fakeCache.store.has('https://oss.example.com/wallpapers/6/visual.jpg')).toBe(true);
    expect(fakeCache.store.has('https://oss.example.com/wallpapers/1/visual.jpg')).toBe(false);
  });
});

describe('loadCachedWallpaperObjectUrl', () => {
  it('returns an object url on cache hit', async () => {
    fakeCache.store.set('https://oss.example.com/wallpapers/1/visual.jpg', fakeImageResponse());
    const url = await loadCachedWallpaperObjectUrl('https://oss.example.com/wallpapers/1/visual.jpg');
    expect(url).toBe('blob:fake-object-url');
  });

  it('returns empty string on miss or empty key', async () => {
    expect(await loadCachedWallpaperObjectUrl('https://oss.example.com/none.jpg')).toBe('');
    expect(await loadCachedWallpaperObjectUrl('')).toBe('');
  });
});
