export const QR_TOOL_TAB_ITEMS = Object.freeze([
  { code: 'generate', label: '生成', iconClass: 'fas fa-wand-magic-sparkles' },
  { code: 'scan', label: '识别', iconClass: 'fas fa-camera' },
  { code: 'wifi', label: 'WiFi', iconClass: 'fas fa-wifi' }
]);

export const QR_CONTENT_KIND_LABELS = Object.freeze({
  url: '链接',
  wifi: 'WiFi',
  email: '邮箱',
  tel: '电话',
  sms: '短信',
  text: '文本'
});

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

export function normalizeQrDownloadFileName(title, extension) {
  const base = String(title || '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9]+/g, '-')
    .replace(/^-+|-+$/g, '') || 'qr-code';
  const ext = String(extension || '').trim().toLowerCase().replace(/^\.+/, '') || 'png';
  return `${base}.${ext}`;
}
