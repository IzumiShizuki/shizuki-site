import { describe, expect, it } from 'vitest';
import { efficientBuiltinWallpaperSource } from './builtinWallpaperSource';

describe('efficient built-in wallpaper delivery', () => {
  it('renders legacy saved built-in previews through the matching WebP', () => {
    expect(efficientBuiltinWallpaperSource('/images/original-bg.png')).toBe('/images/original-bg.webp');
    expect(efficientBuiltinWallpaperSource(new URL('/images/original-bg.png', window.location.origin).href))
      .toBe(new URL('/images/original-bg.webp', window.location.origin).href);
  });

  it('preserves custom media, URLs with parameters, blob previews and existing WebP', () => {
    for (const source of ['https://other.example/images/original-bg.png', '/images/original-bg.png?custom=1',
      '/uploaded/wallpaper.png', 'blob:https://site.shizuki.online/example', '/images/original-bg.webp', '']) {
      expect(efficientBuiltinWallpaperSource(source)).toBe(source);
    }
  });
});
