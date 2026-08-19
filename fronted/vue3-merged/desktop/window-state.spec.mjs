import { describe, expect, it } from 'vitest';
import { normalizeWindowState } from './window-state.mjs';

const displays = [{ x: 0, y: 0, width: 1920, height: 1080 }];

describe('desktop window state', () => {
  it('restores valid visible bounds and maximized state', () => {
    expect(normalizeWindowState({ x: 80, y: 50, width: 1280, height: 760, maximized: true }, displays)).toEqual({
      x: 80,
      y: 50,
      width: 1280,
      height: 760,
      maximized: true
    });
  });

  it('centers safe defaults when persisted bounds are off-screen or undersized', () => {
    const state = normalizeWindowState({ x: 9000, y: 9000, width: 300, height: 200, maximized: true }, displays);
    expect(state).toEqual({ x: 240, y: 90, width: 1440, height: 900, maximized: false });
  });
});
