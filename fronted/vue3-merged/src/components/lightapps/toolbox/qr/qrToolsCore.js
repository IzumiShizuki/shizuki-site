import jsQR from 'jsqr';

export const QR_TOOL_MODES = Object.freeze(['generate', 'scan', 'wifi']);

export const QR_CONTENT_KIND_LABELS = Object.freeze({
  url: '链接',
  wifi: 'WiFi',
  email: '邮箱',
  tel: '电话',
  sms: '短信',
  text: '文本'
});

export const QR_RENDER_DEFAULTS = Object.freeze({
  width: 320,
  margin: 2,
  errorCorrectionLevel: 'M',
  darkColor: '#142033',
  lightColor: '#ffffff'
});

const ERROR_CORRECTION_LEVELS = Object.freeze(['L', 'M', 'Q', 'H']);
const HEX_COLOR_PATTERN = /^#[0-9a-fA-F]{6}$/;
const MAX_DECODE_DIMENSION = 1600;

export function isQrImageFile(file) {
  if (!file) return false;
  const type = String(file.type || '').trim().toLowerCase();
  return type ? type.startsWith('image/') : /\.(png|jpe?g|webp|gif|bmp|avif|svg|ico)$/i.test(file.name || '');
}

/** Read only local image files supplied by a paste/drop event. */
export function findQrImageFile(transfer) {
  for (const item of Array.from(transfer?.items || [])) {
    if (item.kind !== 'file' || typeof item.getAsFile !== 'function') continue;
    const file = item.getAsFile();
    if (isQrImageFile(file)) return file;
  }
  return Array.from(transfer?.files || []).find(isQrImageFile) || null;
}

export function isQrToolMode(value) {
  return QR_TOOL_MODES.includes(String(value || '').trim());
}

export function escapeWifiQrValue(value) {
  return String(value || '').replace(/([\\;,:"])/g, '\\$1');
}

export function buildWifiQrPayload(input = {}) {
  const ssid = String(input.ssid || '').trim();
  const password = String(input.password || '').trim();
  const encryption = String(input.encryption || 'WPA').trim().toUpperCase();
  const hidden = Boolean(input.hidden);

  const parts = ['WIFI:'];
  parts.push(`T:${encryption || 'WPA'};`);
  parts.push(`S:${escapeWifiQrValue(ssid)};`);
  if (encryption !== 'NOPASS') {
    parts.push(`P:${escapeWifiQrValue(password)};`);
  }
  if (hidden) {
    parts.push('H:true;');
  }
  parts.push(';');
  return parts.join('');
}

export function inferQrContentKind(value) {
  const text = String(value || '').trim();
  if (!text) return 'text';

  const lowered = text.toLowerCase();
  if (lowered.startsWith('wifi:')) return 'wifi';
  if (lowered.startsWith('mailto:')) return 'email';
  if (lowered.startsWith('tel:')) return 'tel';
  if (lowered.startsWith('smsto:') || lowered.startsWith('sms:')) return 'sms';
  if (/^https?:\/\//i.test(text)) return 'url';
  return 'text';
}

export function isUrlLike(value) {
  return inferQrContentKind(value) === 'url';
}

export function describeQrContentKind(value) {
  return QR_CONTENT_KIND_LABELS[inferQrContentKind(value)] || QR_CONTENT_KIND_LABELS.text;
}

export function normalizeQrDownloadFileName(title, extension) {
  const base = String(title || '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9]+/g, '-')
    .replace(/^-+|-+$/g, '') || 'qr-code';
  const ext = String(extension || '').trim().toLowerCase().replace(/^\.+/, '') || 'png';
  return `${base}.${ext}`;
}

/**
 * Clamp user-facing render options into values the `qrcode` encoder accepts.
 * Invalid colors fall back to the default palette instead of throwing.
 */
export function normalizeQrRenderOptions(input = {}) {
  const width = Number(input.width);
  const margin = Number(input.margin);
  const level = String(input.errorCorrectionLevel || '').trim().toUpperCase();
  const darkColor = String(input.darkColor || '').trim();
  const lightColor = String(input.lightColor || '').trim();

  return {
    width: Number.isFinite(width) ? Math.min(960, Math.max(160, Math.round(width))) : QR_RENDER_DEFAULTS.width,
    margin: Number.isFinite(margin) ? Math.min(8, Math.max(0, Math.round(margin))) : QR_RENDER_DEFAULTS.margin,
    errorCorrectionLevel: ERROR_CORRECTION_LEVELS.includes(level) ? level : QR_RENDER_DEFAULTS.errorCorrectionLevel,
    color: {
      dark: HEX_COLOR_PATTERN.test(darkColor) ? darkColor : QR_RENDER_DEFAULTS.darkColor,
      light: HEX_COLOR_PATTERN.test(lightColor) ? lightColor : QR_RENDER_DEFAULTS.lightColor
    }
  };
}

/**
 * Downscale an image so decoding stays bounded for large photos.
 */
export function resolveDecodeScale(width, height, maxDimension = MAX_DECODE_DIMENSION) {
  const sourceWidth = Number(width) || 0;
  const sourceHeight = Number(height) || 0;
  const limit = Number(maxDimension) > 0 ? Number(maxDimension) : MAX_DECODE_DIMENSION;
  if (sourceWidth <= limit || sourceWidth <= 0) {
    return { width: Math.max(1, Math.round(sourceWidth)), height: Math.max(1, Math.round(sourceHeight)) };
  }
  const ratio = limit / sourceWidth;
  return {
    width: Math.max(1, Math.round(sourceWidth * ratio)),
    height: Math.max(1, Math.round(sourceHeight * ratio))
  };
}

export function resolveQrDecoder(decoder) {
  if (typeof decoder === 'function') return decoder;
  if (typeof jsQR === 'function') return jsQR;
  if (jsQR && typeof jsQR.default === 'function') return jsQR.default;
  return null;
}

/**
 * Decode a QR payload from raw image data. Takes a plain
 * `{ data, width, height }` shape so it stays testable without a canvas.
 */
export function decodeQrImageData(imageData, decoder) {
  if (!imageData) return '';
  const width = Number(imageData.width) || 0;
  const height = Number(imageData.height) || 0;
  if (!width || !height || !imageData.data) return '';

  const run = resolveQrDecoder(decoder);
  if (!run) throw new Error('当前浏览器不支持二维码解码');

  const result = run(imageData.data, width, height, { inversionAttempts: 'attemptBoth' });
  return String(result?.data || '').trim();
}

/**
 * Build a black/white RGBA bitmap from QR module data. Shared by tests and any
 * caller that needs a canvas-free rendering of a QR code.
 */
export function buildQrBitmap(modules, options = {}) {
  const size = Number(modules?.size) || 0;
  const data = modules?.data;
  if (!size || !data) throw new Error('二维码模块数据无效');

  const scale = Math.max(1, Math.round(Number(options.scale) || 8));
  const quiet = Math.max(0, Math.round(Number(options.quietZone) || 4));
  const dimension = (size + quiet * 2) * scale;
  const dark = options.darkColor || { r: 0, g: 0, b: 0 };
  const light = options.lightColor || { r: 255, g: 255, b: 255 };
  const pixels = new Uint8ClampedArray(dimension * dimension * 4);

  for (let y = 0; y < dimension; y += 1) {
    for (let x = 0; x < dimension; x += 1) {
      const moduleX = Math.floor(x / scale) - quiet;
      const moduleY = Math.floor(y / scale) - quiet;
      const isDark = moduleX >= 0 && moduleY >= 0 && moduleX < size && moduleY < size
        ? Boolean(data[moduleY * size + moduleX])
        : false;
      const color = isDark ? dark : light;
      const offset = (y * dimension + x) * 4;
      pixels[offset] = color.r;
      pixels[offset + 1] = color.g;
      pixels[offset + 2] = color.b;
      pixels[offset + 3] = 255;
    }
  }

  return { data: pixels, width: dimension, height: dimension };
}
