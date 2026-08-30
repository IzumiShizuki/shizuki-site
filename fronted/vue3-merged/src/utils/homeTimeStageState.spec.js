import { beforeEach, describe, expect, it } from 'vitest';
import { MOTION_PREFERENCE_STORAGE_KEY } from '../composables/useMotionPreference';
import {
  HOME_APPEARANCE_STORAGE_KEY,
  __resetHomeAppearanceForTests,
  initializeHomeAppearance,
  normalizeHomeAppearance,
  resolveHomeClockVisibility,
  setHomeClockBehavior,
  setHomeColorMode,
  setHomeManualAccentHex,
  setHomeMotionLevel,
  setWallpaperClockOverride
} from './homeTimeStageState';

describe('home time stage appearance state', () => {
  beforeEach(() => {
    window.localStorage.clear();
    __resetHomeAppearanceForTests();
  });

  it('uses automatic clock behavior and immersive motion by default', () => {
    expect(normalizeHomeAppearance()).toEqual({
      version: 1,
      clockBehavior: 'auto',
      motionLevel: 'immersive',
      colorMode: 'auto',
      manualAccentHex: '#F2B39D',
      wallpaperClockOverrides: {}
    });
    expect(resolveHomeClockVisibility({ isDynamic: false })).toBe(true);
    expect(resolveHomeClockVisibility({ isDynamic: true })).toBe(false);
  });

  it('lets a wallpaper override take precedence over the global behavior', () => {
    expect(resolveHomeClockVisibility({
      clockBehavior: 'hide',
      wallpaperId: 'still-1',
      wallpaperClockOverrides: { 'still-1': 'show' }
    })).toBe(true);
    expect(resolveHomeClockVisibility({
      clockBehavior: 'show',
      wallpaperId: 'video-1',
      wallpaperClockOverrides: { 'video-1': 'hide' }
    })).toBe(false);
  });

  it('persists normalized choices and removes inherited wallpaper overrides', () => {
    initializeHomeAppearance();
    setHomeClockBehavior('hide');
    setHomeMotionLevel('calm');
    setWallpaperClockOverride('wallpaper-7', 'show');

    expect(JSON.parse(window.localStorage.getItem(HOME_APPEARANCE_STORAGE_KEY))).toMatchObject({
      version: 1,
      clockBehavior: 'hide',
      wallpaperClockOverrides: { 'wallpaper-7': 'show' }
    });
    expect(JSON.parse(window.localStorage.getItem(HOME_APPEARANCE_STORAGE_KEY))).not.toHaveProperty('motionLevel');
    expect(JSON.parse(window.localStorage.getItem(MOTION_PREFERENCE_STORAGE_KEY))).toMatchObject({
      mode: 'soothing'
    });

    setWallpaperClockOverride('wallpaper-7', 'inherit');
    expect(JSON.parse(window.localStorage.getItem(HOME_APPEARANCE_STORAGE_KEY)).wallpaperClockOverrides).toEqual({});
  });

  it('normalizes malformed stored values during initialization', () => {
    window.localStorage.setItem(HOME_APPEARANCE_STORAGE_KEY, JSON.stringify({
      clockBehavior: 'sometimes',
      motionLevel: 'extreme',
      wallpaperClockOverrides: { keep: 'show', drop: 'maybe' }
    }));

    expect(initializeHomeAppearance()).toMatchObject({
      clockBehavior: 'auto',
      motionLevel: 'immersive',
      wallpaperClockOverrides: { keep: 'show' }
    });
  });

  it('persists automatic color by default and a valid manual Home override', () => {
    initializeHomeAppearance();
    expect(setHomeColorMode('auto')).toBe('auto');
    expect(setHomeManualAccentHex('#8fdcc8')).toEqual({ ok: true, normalized: '#8FDCC8' });

    expect(JSON.parse(window.localStorage.getItem(HOME_APPEARANCE_STORAGE_KEY))).toMatchObject({
      colorMode: 'manual',
      manualAccentHex: '#8FDCC8'
    });
    expect(setHomeManualAccentHex('invalid')).toMatchObject({ ok: false });
  });
});
