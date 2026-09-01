import { beforeEach, describe, expect, it, vi } from 'vitest';
import {
  MOTION_PREFERENCE_STORAGE_KEY,
  __resetMotionPreferenceForTests,
  initializeMotionPreference,
  normalizeMotionMode,
  setMotionMode,
  useMotionPreference
} from './useMotionPreference';

describe('useMotionPreference compatibility adapter', () => {
  beforeEach(() => {
    window.localStorage.clear();
    __resetMotionPreferenceForTests();
  });

  it('keeps non-Home rendering deterministically immersive', () => {
    const preference = useMotionPreference();

    expect(preference.storedMode.value).toBe('immersive');
    expect(preference.effectiveMode.value).toBe('immersive');
    expect(preference.systemReducedMotion.value).toBe(false);
    expect(document.documentElement.dataset.motionMode).toBe('immersive');
    expect(document.documentElement.dataset.effectiveMotionMode).toBe('immersive');
  });

  it.each([
    ['immersive', 'immersive'],
    ['soothing', 'soothing'],
    ['vivid', 'immersive'],
    ['calm', 'soothing'],
    ['off', 'soothing'],
    ['unknown', 'immersive']
  ])('normalizes %s for Home migration without changing the global adapter', (input, expected) => {
    expect(normalizeMotionMode(input)).toBe(expected);
    expect(setMotionMode(input)).toBe('immersive');
    expect(useMotionPreference().effectiveMode.value).toBe('immersive');
  });

  it('ignores legacy storage and operating-system reduced-motion state', () => {
    window.localStorage.setItem(MOTION_PREFERENCE_STORAGE_KEY, JSON.stringify({ mode: 'soothing' }));
    const matchMedia = vi.fn().mockReturnValue({ matches: true });
    Object.defineProperty(window, 'matchMedia', {
      configurable: true,
      writable: true,
      value: matchMedia
    });

    initializeMotionPreference({ storage: window.localStorage, windowTarget: window });

    expect(useMotionPreference().effectiveMode.value).toBe('immersive');
    expect(matchMedia).not.toHaveBeenCalled();
    expect(JSON.parse(window.localStorage.getItem(MOTION_PREFERENCE_STORAGE_KEY))).toEqual({ mode: 'soothing' });
  });
});
