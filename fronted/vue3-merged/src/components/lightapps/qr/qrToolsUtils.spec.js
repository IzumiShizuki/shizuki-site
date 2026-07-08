import { describe, expect, it } from 'vitest';
import {
  buildWifiQrPayload,
  escapeWifiQrValue,
  inferQrContentKind,
  isUrlLike,
  normalizeQrDownloadFileName
} from './qrToolsUtils';

describe('qrToolsUtils', () => {
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

  it('detects url-like content', () => {
    expect(isUrlLike('https://shizuku.example')).toBe(true);
    expect(isUrlLike('tel:10086')).toBe(false);
  });

  it('normalizes download filenames', () => {
    expect(normalizeQrDownloadFileName('WiFi Card Preview', 'svg')).toBe('wifi-card-preview.svg');
    expect(normalizeQrDownloadFileName('', '')).toBe('qr-code.png');
  });
});
