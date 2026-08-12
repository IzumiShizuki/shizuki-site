const DEFAULT_ACCENT_HEX = '#F2B39D';

function clampChannel(value) {
  return Math.max(0, Math.min(255, Math.round(value)));
}

export function rgbToHex(red, green, blue) {
  return `#${[red, green, blue].map((value) => clampChannel(value).toString(16).padStart(2, '0')).join('').toUpperCase()}`;
}

export function chooseRepresentativePixels(data, fallback = DEFAULT_ACCENT_HEX) {
  if (!data || typeof data.length !== 'number') return fallback;
  const buckets = new Map();
  for (let index = 0; index + 3 < data.length; index += 4) {
    const alpha = Number(data[index + 3]);
    if (alpha < 160) continue;
    const red = Number(data[index]);
    const green = Number(data[index + 1]);
    const blue = Number(data[index + 2]);
    const max = Math.max(red, green, blue);
    const min = Math.min(red, green, blue);
    const saturation = max - min;
    const luminance = red * 0.2126 + green * 0.7152 + blue * 0.0722;
    if (luminance < 34 || luminance > 240 || saturation < 18) continue;
    const key = `${Math.round(red / 32)},${Math.round(green / 32)},${Math.round(blue / 32)}`;
    const bucket = buckets.get(key) || { score: 0, red: 0, green: 0, blue: 0, count: 0 };
    const vividness = 1 + saturation / 96;
    bucket.score += vividness;
    bucket.red += red;
    bucket.green += green;
    bucket.blue += blue;
    bucket.count += 1;
    buckets.set(key, bucket);
  }
  const winner = [...buckets.values()].sort((a, b) => b.score - a.score)[0];
  if (!winner?.count) return fallback;
  return rgbToHex(winner.red / winner.count, winner.green / winner.count, winner.blue / winner.count);
}

export function resolveWallpaperAccentSource(wallpaper = {}) {
  const type = String(wallpaper.type || '').trim().toLowerCase();
  if (type === 'dynamic' || type === 'l2d') return String(wallpaper.preview || wallpaper.src || '').trim();
  return String(wallpaper.src || wallpaper.preview || '').trim();
}

export function canSampleWallpaperSource(source, baseHref = typeof window !== 'undefined' ? window.location.href : '') {
  const value = String(source || '').trim();
  if (!value) return false;
  if (/^(data|blob):/i.test(value)) return true;
  try {
    const resolved = new URL(value, baseHref || 'http://localhost/');
    const base = new URL(baseHref || 'http://localhost/');
    return resolved.origin === base.origin;
  } catch {
    return false;
  }
}

export async function sampleWallpaperAccent(wallpaper, options = {}) {
  const source = resolveWallpaperAccentSource(wallpaper);
  if (!source || typeof Image === 'undefined' || typeof document === 'undefined') return '';
  const canSample = options.canSampleSource || canSampleWallpaperSource;
  if (!canSample(source, options.baseHref)) return '';
  const imageFactory = options.imageFactory || (() => new Image());
  const canvasFactory = options.canvasFactory || (() => document.createElement('canvas'));
  try {
    const image = imageFactory();
    image.crossOrigin = 'anonymous';
    image.decoding = 'async';
    await new Promise((resolve, reject) => {
      image.onload = resolve;
      image.onerror = reject;
      image.src = source;
    });
    const canvas = canvasFactory();
    canvas.width = 24;
    canvas.height = 24;
    const context = canvas.getContext('2d', { willReadFrequently: true });
    if (!context) return '';
    context.drawImage(image, 0, 0, canvas.width, canvas.height);
    return chooseRepresentativePixels(context.getImageData(0, 0, canvas.width, canvas.height).data, '');
  } catch {
    return '';
  }
}
