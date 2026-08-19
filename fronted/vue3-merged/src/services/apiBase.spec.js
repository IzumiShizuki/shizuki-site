import { afterEach, describe, expect, it } from 'vitest';
import {
  __resetApiBaseForTest,
  absolutizeApiUrl,
  getApiBaseUrl,
  getDefaultApiBaseUrl,
  isDesktopAppShell,
  isNativeAppShell,
  setApiBaseUrl
} from './apiBase';

afterEach(() => {
  delete window.Capacitor;
  delete window.shizukiDesktop;
  window.localStorage.removeItem('shizuki.apiBase.v1');
  __resetApiBaseForTest();
});

describe('apiBase', () => {
  it('defaults to the configured environment base on web', () => {
    expect(isNativeAppShell()).toBe(false);
    expect(getApiBaseUrl()).toBe(getDefaultApiBaseUrl());
  });

  it('keeps urls untouched on web', () => {
    expect(absolutizeApiUrl('/api/v1/music/stream/1')).toBe('/api/v1/music/stream/1');
    expect(absolutizeApiUrl('https://cdn.example.com/a.mp3')).toBe('https://cdn.example.com/a.mp3');
  });

  it('detects the native shell via Capacitor global', () => {
    window.Capacitor = { isNativePlatform: () => true };
    expect(isNativeAppShell()).toBe(true);
  });

  it('detects Electron while keeping relative API paths on the secure app protocol', () => {
    window.shizukiDesktop = { isDesktop: true };
    __resetApiBaseForTest();
    expect(isDesktopAppShell()).toBe(true);
    expect(isNativeAppShell()).toBe(true);
    expect(absolutizeApiUrl('/api/v1/music/stream/1')).toBe('/api/v1/music/stream/1');
    setApiBaseUrl('https://untrusted-override.example.com');
    expect(getApiBaseUrl()).toBe(getDefaultApiBaseUrl());
  });

  it('prefixes /api/ paths with the gateway base in native shell', () => {
    window.Capacitor = { isNativePlatform: () => true };
    __resetApiBaseForTest();
    setApiBaseUrl('https://site.example.com/');
    expect(getApiBaseUrl()).toBe('https://site.example.com');
    expect(absolutizeApiUrl('/api/v1/music/stream/1')).toBe('https://site.example.com/api/v1/music/stream/1');
    expect(absolutizeApiUrl('/images/cover.jpg')).toBe('/images/cover.jpg');
    expect(absolutizeApiUrl('https://cdn.example.com/a.mp3')).toBe('https://cdn.example.com/a.mp3');
  });

  it('rejects invalid override urls', () => {
    window.Capacitor = { isNativePlatform: () => true };
    __resetApiBaseForTest();
    setApiBaseUrl('not-a-url');
    expect(getApiBaseUrl()).toBe(getDefaultApiBaseUrl());
  });
});
