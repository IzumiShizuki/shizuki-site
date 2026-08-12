import { describe, expect, it, vi } from 'vitest';
import { canSampleWallpaperSource, chooseRepresentativePixels, resolveWallpaperAccentSource, rgbToHex, sampleWallpaperAccent } from './wallpaperAccentSampler';

describe('wallpaper accent sampler', () => {
  it('uses static visuals directly and dynamic previews as representative frames', () => {
    expect(resolveWallpaperAccentSource({ type: 'static', src: '/still.webp', preview: '/thumb.webp' })).toBe('/still.webp');
    expect(resolveWallpaperAccentSource({ type: 'dynamic', src: '/video.mp4', preview: '/frame.webp' })).toBe('/frame.webp');
    expect(resolveWallpaperAccentSource({ type: 'l2d', src: '/model.json', preview: '/l2d-frame.webp' })).toBe('/l2d-frame.webp');
  });

  it('chooses a repeated chromatic bucket and ignores transparent or extreme pixels', () => {
    const pixels = new Uint8ClampedArray([
      245, 245, 245, 255,
      10, 10, 10, 255,
      238, 150, 166, 255,
      240, 152, 168, 255,
      70, 110, 220, 0
    ]);
    expect(chooseRepresentativePixels(pixels)).toBe('#EE96A6');
  });

  it('falls back to the warm theme accent when no useful pixels exist', () => {
    expect(chooseRepresentativePixels(new Uint8ClampedArray([255, 255, 255, 255]))).toBe('#F2B39D');
    expect(rgbToHex(242, 179, 157)).toBe('#F2B39D');
  });

  it('silently falls back for wallpaper sources that cannot be sampled by this origin', async () => {
    expect(canSampleWallpaperSource('/wallpaper/day.jpg', 'https://site.example/home')).toBe(true);
    expect(canSampleWallpaperSource('https://cdn.example/day.jpg', 'https://site.example/home')).toBe(false);

    const imageFactory = vi.fn();
    await expect(sampleWallpaperAccent(
      { type: 'static', src: 'https://cdn.example/day.jpg' },
      { baseHref: 'https://site.example/home', imageFactory }
    )).resolves.toBe('');
    expect(imageFactory).not.toHaveBeenCalled();
  });
});
