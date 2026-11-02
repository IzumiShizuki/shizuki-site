import { describe, expect, it } from 'vitest';
import { shouldHideGlobalLyricBarOnRoute, shouldShowGlobalLyricBar } from './globalLyricBarRoute';

describe('shouldHideGlobalLyricBarOnRoute', () => {
  it.each([
    ['/auth', true],
    ['/auth/login', true],
    ['/auth/oauth/callback', true],
    ['/m', true],
    ['/m/apps', true],
    ['/authentication', false],
    ['/music-library', false],
    ['/museums', false],
    ['/', false]
  ])('evaluates route %s as hidden=%s', (path, hidden) => {
    expect(shouldHideGlobalLyricBarOnRoute(path)).toBe(hidden);
  });
});

describe('shouldShowGlobalLyricBar', () => {
  const activeTrack = {
    subtitleVisible: true,
    hasCurrentTrack: true,
    routePath: '/',
    isMusicLibraryRoute: false,
    isFocusActive: false,
    isDesktopHomeSurface: false
  };

  it('shows live lyrics on a regular page while a track is active', () => {
    expect(shouldShowGlobalLyricBar(activeTrack)).toBe(true);
  });

  it.each(['/auth', '/auth/register', '/auth/oauth/callback', '/m', '/m/apps'])(
    'hides live lyrics on excluded route %s',
    (routePath) => {
      expect(shouldShowGlobalLyricBar({ ...activeTrack, routePath })).toBe(false);
    }
  );

  it('keeps lyrics hidden in the music library unless focus mode is active', () => {
    expect(shouldShowGlobalLyricBar({
      ...activeTrack,
      routePath: '/music-library',
      isMusicLibraryRoute: true
    })).toBe(false);
    expect(shouldShowGlobalLyricBar({
      ...activeTrack,
      routePath: '/music-library',
      isMusicLibraryRoute: true,
      isFocusActive: true
    })).toBe(true);
  });

  it.each([
    ['subtitles disabled', { subtitleVisible: false }],
    ['no active track', { hasCurrentTrack: false }],
    ['desktop home surface', { isDesktopHomeSurface: true }]
  ])('keeps the bar hidden when %s', (_label, overrides) => {
    expect(shouldShowGlobalLyricBar({ ...activeTrack, ...overrides })).toBe(false);
  });
});