import { afterEach, describe, expect, it, vi } from 'vitest';
import {
  MOBILE_SHELL_PREF_KEY,
  isMobileShellPath,
  mapDesktopPathToMobile,
  mapMobilePathToDesktop,
  readMobileShellPreference,
  shouldUseMobileShell,
  writeMobileShellPreference
} from './mobileMode';

function mockMatchMedia(results) {
  window.matchMedia = vi.fn((query) => ({
    matches: Boolean(results[query]),
    media: query,
    addEventListener: vi.fn(),
    removeEventListener: vi.fn()
  }));
}

afterEach(() => {
  delete window.matchMedia;
  delete window.Capacitor;
  delete window.shizukiDesktop;
  window.localStorage.removeItem(MOBILE_SHELL_PREF_KEY);
});

describe('mobileMode path mapping', () => {
  it('detects mobile shell paths', () => {
    expect(isMobileShellPath('/m')).toBe(true);
    expect(isMobileShellPath('/m/music')).toBe(true);
    expect(isMobileShellPath('/music-library')).toBe(false);
    expect(isMobileShellPath('/madmin')).toBe(false);
  });

  it('maps desktop music routes to mobile equivalents', () => {
    expect(mapDesktopPathToMobile('/music-library/music')).toBe('/m/music');
    expect(mapDesktopPathToMobile('/music-library')).toBe('/m/music');
    expect(mapDesktopPathToMobile('/music-library/playlist/liked_1')).toBe('/m/playlist/liked_1');
    expect(mapDesktopPathToMobile('/music-library/player')).toBe('/m/music');
    expect(mapDesktopPathToMobile('/auth')).toBe('/m/auth');
    expect(mapDesktopPathToMobile('/profile')).toBe('/m/profile');
  });

  it('leaves uncovered desktop routes untouched', () => {
    expect(mapDesktopPathToMobile('/')).toBe('');
    expect(mapDesktopPathToMobile('/blog')).toBe('');
    expect(mapDesktopPathToMobile('/admin')).toBe('');
    expect(mapDesktopPathToMobile('/m/music')).toBe('');
  });

  it('maps mobile routes back to desktop equivalents', () => {
    expect(mapMobilePathToDesktop('/m')).toBe('/music-library/music');
    expect(mapMobilePathToDesktop('/m/music')).toBe('/music-library/music');
    expect(mapMobilePathToDesktop('/m/playlist/abc')).toBe('/music-library/playlist/abc');
    expect(mapMobilePathToDesktop('/m/auth')).toBe('/auth');
    expect(mapMobilePathToDesktop('/m/profile')).toBe('/profile');
    expect(mapMobilePathToDesktop('/blog')).toBe('');
  });
});

describe('shouldUseMobileShell', () => {
  it('is false on desktop-like viewports', () => {
    mockMatchMedia({
      '(max-width: 767px)': false,
      '(pointer: coarse)': false
    });
    expect(shouldUseMobileShell()).toBe(false);
  });

  it('is true on narrow touch viewports', () => {
    mockMatchMedia({
      '(max-width: 767px)': true,
      '(pointer: coarse)': true
    });
    expect(shouldUseMobileShell()).toBe(true);
  });

  it('is true on phone landscape (short touch viewport)', () => {
    mockMatchMedia({
      '(max-width: 767px)': false,
      '(orientation: landscape) and (max-height: 500px)': true,
      '(pointer: coarse)': true
    });
    expect(shouldUseMobileShell()).toBe(true);
  });

  it('is false on touch tablets in landscape', () => {
    mockMatchMedia({
      '(max-width: 767px)': false,
      '(orientation: landscape) and (max-height: 500px)': false,
      '(pointer: coarse)': true
    });
    expect(shouldUseMobileShell()).toBe(false);
  });

  it('respects the manual desktop override', () => {
    mockMatchMedia({
      '(max-width: 767px)': true,
      '(pointer: coarse)': true
    });
    writeMobileShellPreference('desktop');
    expect(readMobileShellPreference()).toBe('desktop');
    expect(shouldUseMobileShell()).toBe(false);
  });

  it('respects the manual mobile override on desktop', () => {
    mockMatchMedia({
      '(max-width: 767px)': false,
      '(pointer: coarse)': false
    });
    writeMobileShellPreference('mobile');
    expect(shouldUseMobileShell()).toBe(true);
  });

  it('is always true inside the native app shell', () => {
    mockMatchMedia({
      '(max-width: 767px)': false,
      '(pointer: coarse)': false
    });
    window.Capacitor = { isNativePlatform: () => true };
    writeMobileShellPreference('desktop');
    expect(shouldUseMobileShell()).toBe(true);
  });

  it('keeps desktop routes inside the Electron shell', () => {
    mockMatchMedia({
      '(max-width: 767px)': true,
      '(pointer: coarse)': true
    });
    window.shizukiDesktop = { isDesktop: true };
    writeMobileShellPreference('mobile');
    expect(shouldUseMobileShell()).toBe(false);
  });

  it('tolerates missing matchMedia', () => {
    expect(shouldUseMobileShell()).toBe(false);
  });
});
