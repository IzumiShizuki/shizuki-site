import { describe, expect, it, vi } from 'vitest';
import { createAuthorMotionState, mapPointerToParallax, setupRevealObserver } from './authorMotionState';

describe('authorMotionState', () => {
  it('clamps pointer to max parallax offset', () => {
    const rect = { left: 100, top: 60, width: 300, height: 200 };
    expect(mapPointerToParallax(250, 160, rect, 8)).toEqual({ x: 0, y: 0 });
    expect(mapPointerToParallax(0, 0, rect, 8)).toEqual({ x: -8, y: -8 });
    expect(mapPointerToParallax(9999, 9999, rect, 8)).toEqual({ x: 8, y: 8 });
  });

  it('disables motion when reduced motion flag is enabled', () => {
    expect(createAuthorMotionState().motionEnabled).toBe(true);
    expect(createAuthorMotionState({ reducedMotion: true }).motionEnabled).toBe(false);
  });

  it('reveals target only once when observer triggers multiple times', () => {
    const root = document.createElement('div');
    const item = document.createElement('div');
    item.className = 'reveal-target';
    root.appendChild(item);

    const observed = new Set();
    const unobserved = new Set();
    let callbackRef = null;
    const disconnectSpy = vi.fn();
    const observerCtor = vi.fn((callback) => {
      callbackRef = callback;
      return {
        observe(target) {
          observed.add(target);
        },
        unobserve(target) {
          unobserved.add(target);
        },
        disconnect: disconnectSpy
      };
    });

    const originalObserver = globalThis.IntersectionObserver;
    globalThis.IntersectionObserver = observerCtor;

    try {
      const controller = setupRevealObserver(root, '.reveal-target', { once: true });
      expect(observed.has(item)).toBe(true);

      callbackRef?.([{ target: item, isIntersecting: true }]);
      callbackRef?.([{ target: item, isIntersecting: true }]);

      expect(item.classList.contains('is-revealed')).toBe(true);
      expect(unobserved.has(item)).toBe(true);
      controller.disconnect();
      expect(disconnectSpy).toHaveBeenCalledTimes(1);
    } finally {
      globalThis.IntersectionObserver = originalObserver;
    }
  });
});
