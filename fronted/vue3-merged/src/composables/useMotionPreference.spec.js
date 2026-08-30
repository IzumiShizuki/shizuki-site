import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import {
  LEGACY_HOME_APPEARANCE_STORAGE_KEY,
  MOTION_PREFERENCE_STORAGE_KEY,
  __resetMotionPreferenceForTests,
  initializeMotionPreference,
  setMotionMode,
  useMotionPreference
} from './useMotionPreference';

function installReducedMotionQuery(initialMatches = false) {
  const listeners = new Set();
  const query = {
    matches: initialMatches,
    media: '(prefers-reduced-motion: reduce)',
    addEventListener: vi.fn((type, listener) => {
      if (type === 'change') listeners.add(listener);
    }),
    removeEventListener: vi.fn((type, listener) => {
      if (type === 'change') listeners.delete(listener);
    })
  };
  const matchMedia = vi.fn(() => query);
  Object.defineProperty(window, 'matchMedia', {
    configurable: true,
    writable: true,
    value: matchMedia
  });

  return {
    matchMedia,
    setMatches(matches) {
      query.matches = matches;
      listeners.forEach((listener) => listener({ matches, media: query.media }));
    }
  };
}

function readPersistedMode() {
  return JSON.parse(window.localStorage.getItem(MOTION_PREFERENCE_STORAGE_KEY) || '{}').mode;
}

describe('useMotionPreference', () => {
  let originalInnerWidth;
  let originalHardwareConcurrency;
  let originalConnection;
  let originalGetBattery;

  beforeEach(() => {
    originalInnerWidth = Object.getOwnPropertyDescriptor(window, 'innerWidth');
    originalHardwareConcurrency = Object.getOwnPropertyDescriptor(navigator, 'hardwareConcurrency');
    originalConnection = Object.getOwnPropertyDescriptor(navigator, 'connection');
    originalGetBattery = Object.getOwnPropertyDescriptor(navigator, 'getBattery');
    window.localStorage.clear();
    __resetMotionPreferenceForTests();
    installReducedMotionQuery(false);
  });

  afterEach(() => {
    __resetMotionPreferenceForTests();
    for (const [target, key, descriptor] of [
      [window, 'innerWidth', originalInnerWidth],
      [navigator, 'hardwareConcurrency', originalHardwareConcurrency],
      [navigator, 'connection', originalConnection],
      [navigator, 'getBattery', originalGetBattery]
    ]) {
      if (descriptor) Object.defineProperty(target, key, descriptor);
      else delete target[key];
    }
  });

  it('defaults a first visit to immersive and exposes stored/effective root state', () => {
    const preference = useMotionPreference();

    expect(preference.storedMode.value).toBe('immersive');
    expect(preference.effectiveMode.value).toBe('immersive');
    expect(readPersistedMode()).toBe('immersive');
    expect(document.documentElement.dataset.motionMode).toBe('immersive');
    expect(document.documentElement.dataset.effectiveMotionMode).toBe('immersive');
  });

  it.each([
    ['vivid', 'immersive'],
    ['calm', 'soothing'],
    ['off', 'soothing']
  ])('migrates legacy Home mode %s to %s and removes the old field', (legacyMode, expectedMode) => {
    window.localStorage.setItem(LEGACY_HOME_APPEARANCE_STORAGE_KEY, JSON.stringify({
      version: 1,
      clockBehavior: 'auto',
      motionLevel: legacyMode,
      colorMode: 'auto'
    }));

    initializeMotionPreference();

    expect(useMotionPreference().storedMode.value).toBe(expectedMode);
    expect(readPersistedMode()).toBe(expectedMode);
    expect(JSON.parse(window.localStorage.getItem(LEGACY_HOME_APPEARANCE_STORAGE_KEY))).not.toHaveProperty('motionLevel');
  });

  it.each(['unknown-mode', '{broken json'])('normalizes a damaged or unknown stored value %s to immersive', (raw) => {
    window.localStorage.setItem(MOTION_PREFERENCE_STORAGE_KEY, raw);

    initializeMotionPreference();

    expect(useMotionPreference().storedMode.value).toBe('immersive');
    expect(readPersistedMode()).toBe('immersive');
  });

  it('shares one state across route consumers and restores the manual choice in a later session', () => {
    const firstRoute = useMotionPreference();
    expect(firstRoute.setMode('soothing')).toBe('soothing');

    const secondRoute = useMotionPreference();
    expect(secondRoute.storedMode.value).toBe('soothing');
    expect(secondRoute.effectiveMode.value).toBe('soothing');

    __resetMotionPreferenceForTests();
    const laterSession = useMotionPreference();
    expect(laterSession.storedMode.value).toBe('soothing');
    expect(readPersistedMode()).toBe('soothing');
  });

  it('uses reduced motion only for the effective mode and restores the saved choice afterwards', () => {
    const media = installReducedMotionQuery(false);
    const preference = useMotionPreference();
    setMotionMode('immersive');

    media.setMatches(true);
    expect(preference.storedMode.value).toBe('immersive');
    expect(preference.effectiveMode.value).toBe('soothing');
    expect(readPersistedMode()).toBe('immersive');
    expect(document.documentElement.dataset.effectiveMotionMode).toBe('soothing');

    media.setMatches(false);
    expect(preference.storedMode.value).toBe('immersive');
    expect(preference.effectiveMode.value).toBe('immersive');
  });

  it('does not inspect or downgrade for viewport, device, frame, battery, or network conditions', () => {
    const media = installReducedMotionQuery(false);
    const preference = useMotionPreference();
    setMotionMode('immersive');

    Object.defineProperty(window, 'innerWidth', { configurable: true, value: 320 });
    Object.defineProperty(navigator, 'hardwareConcurrency', { configurable: true, value: 1 });
    Object.defineProperty(navigator, 'connection', {
      configurable: true,
      value: { effectiveType: 'slow-2g', saveData: true }
    });
    Object.defineProperty(navigator, 'getBattery', {
      configurable: true,
      value: vi.fn().mockResolvedValue({ level: 0.01, charging: false })
    });
    window.dispatchEvent(new Event('resize'));
    window.dispatchEvent(new Event('offline'));

    expect(preference.storedMode.value).toBe('immersive');
    expect(preference.effectiveMode.value).toBe('immersive');
    expect(media.matchMedia).toHaveBeenCalledTimes(1);
    expect(media.matchMedia).toHaveBeenCalledWith('(prefers-reduced-motion: reduce)');
    expect(navigator.getBattery).not.toHaveBeenCalled();
  });
});
