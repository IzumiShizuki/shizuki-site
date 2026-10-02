import QRCode from 'qrcode';
import { describe, expect, it } from 'vitest';
import {
  buildQrBitmap,
  buildWifiQrPayload,
  decodeQrImageData,
  describeQrContentKind,
  escapeWifiQrValue,
  findQrImageFile,
  inferQrContentKind,
  isQrToolMode,
  isQrImageFile,
  isUrlLike,
  normalizeQrDownloadFileName,
  normalizeQrRenderOptions,
  resolveDecodeScale
} from './qrToolsCore';

describe('qrToolsCore', () => {
  it('selects image transfer items first and falls back to local files', () => {
    const image = new File(['image'], 'pasted.png', { type: 'image/png' });
    const fallback = new File(['image'], 'fallback.JPG');
    expect(findQrImageFile({
      items: [{ kind: 'string', type: 'text/html' }, { kind: 'file', getAsFile: () => image }],
      files: [fallback]
    })).toBe(image);
    expect(findQrImageFile({ items: [{ kind: 'file', getAsFile: () => null }], files: [fallback] })).toBe(fallback);
    expect(findQrImageFile({ files: [new File(['text'], 'notes.txt')] })).toBeNull();
    expect(findQrImageFile(null)).toBeNull();
  });

  it('accepts image MIME types and uses extensions only when MIME metadata is absent', () => {
    expect(isQrImageFile(new File(['image'], 'clipboard', { type: 'image/png' }))).toBe(true);
    expect(isQrImageFile(new File(['image'], 'SCAN.PNG'))).toBe(true);
    expect(isQrImageFile(new File(['text'], 'fake.png', { type: 'text/plain' }))).toBe(false);
    expect(isQrImageFile(new File(['text'], 'notes.txt'))).toBe(false);
    expect(isQrImageFile(null)).toBe(false);
  });

  it('escapes wifi payload values', () => {
    expect(escapeWifiQrValue('Cafe;WiFi:2.4G\\Guest,Zone')).toBe('Cafe\\;WiFi\\:2.4G\\\\Guest\\,Zone');
  });

  it('builds wifi payloads with hidden flag', () => {
    expect(
      buildWifiQrPayload({
        ssid: 'Cafe;WiFi',
        password: 'pa:ss\\word,ok',
        encryption: 'wpa',
        hidden: true
      })
    ).toBe('WIFI:T:WPA;S:Cafe\\;WiFi;P:pa\\:ss\\\\word\\,ok;H:true;;');
  });

  it('omits password for nopass wifi payloads', () => {
    expect(
      buildWifiQrPayload({
        ssid: 'Open Space',
        password: 'ignored',
        encryption: 'nopass',
        hidden: false
      })
    ).toBe('WIFI:T:NOPASS;S:Open Space;;');
  });

  it('infers qr content kinds', () => {
    expect(inferQrContentKind('https://mytoolster.com')).toBe('url');
    expect(inferQrContentKind('WIFI:T:WPA;S:demo;P:12345678;;')).toBe('wifi');
    expect(inferQrContentKind('mailto:team@example.com')).toBe('email');
    expect(inferQrContentKind('tel:10086')).toBe('tel');
    expect(inferQrContentKind('Just some text')).toBe('text');
  });

  it('describes qr content kinds for display', () => {
    expect(describeQrContentKind('https://shizuki.example')).toBe('链接');
    expect(describeQrContentKind('')).toBe('文本');
  });

  it('detects url-like content', () => {
    expect(isUrlLike('https://shizuku.example')).toBe(true);
    expect(isUrlLike('tel:10086')).toBe(false);
  });

  it('normalizes download filenames', () => {
    expect(normalizeQrDownloadFileName('WiFi Card Preview', 'svg')).toBe('wifi-card-preview.svg');
    expect(normalizeQrDownloadFileName('', '')).toBe('qr-code.png');
  });

  it('recognizes supported tool modes', () => {
    expect(isQrToolMode('generate')).toBe(true);
    expect(isQrToolMode('scan')).toBe(true);
    expect(isQrToolMode('wifi')).toBe(true);
    expect(isQrToolMode('qr-tools')).toBe(false);
  });

  it('clamps render options and rejects invalid colors', () => {
    expect(normalizeQrRenderOptions({})).toEqual({
      width: 320,
      margin: 2,
      errorCorrectionLevel: 'M',
      color: { dark: '#142033', light: '#ffffff' }
    });
    expect(normalizeQrRenderOptions({
      width: 4000,
      margin: -4,
      errorCorrectionLevel: 'Z',
      darkColor: 'not-a-color',
      lightColor: '#ABCDEF'
    })).toEqual({
      width: 960,
      margin: 0,
      errorCorrectionLevel: 'M',
      color: { dark: '#142033', light: '#ABCDEF' }
    });
  });

  it('bounds decode dimensions for large images', () => {
    expect(resolveDecodeScale(800, 600)).toEqual({ width: 800, height: 600 });
    expect(resolveDecodeScale(3200, 1600, 1600)).toEqual({ width: 1600, height: 800 });
  });

  it('decodes a rendered QR bitmap back to its payload', () => {
    const payload = 'https://shizuki.example/qr-scan';
    const qr = QRCode.create(payload, { errorCorrectionLevel: 'M' });
    const bitmap = buildQrBitmap(qr.modules, { scale: 6, quietZone: 4 });

    expect(bitmap.width).toBe(bitmap.height);
    expect(bitmap.data).toHaveLength(bitmap.width * bitmap.height * 4);
    expect(decodeQrImageData(bitmap)).toBe(payload);
  });

  it('returns an empty payload when no QR code is present', () => {
    const size = 64;
    const blank = { data: new Uint8ClampedArray(size * size * 4).fill(255), width: size, height: size };
    expect(decodeQrImageData(blank)).toBe('');
    expect(decodeQrImageData(null)).toBe('');
  });
});
