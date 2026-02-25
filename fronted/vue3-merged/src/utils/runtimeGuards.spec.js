import { describe, expect, it } from 'vitest';
import { resolveRuntimeGuards } from './runtimeGuards';

function createStorageReader(entries = {}) {
  return (key) => (Object.prototype.hasOwnProperty.call(entries, key) ? entries[key] : null);
}

describe('resolveRuntimeGuards', () => {
  it('returns all guards as false by default', () => {
    const guards = resolveRuntimeGuards({
      search: '',
      storageReader: createStorageReader()
    });

    expect(guards).toEqual({
      diagWindow: false,
      disableLevitationBall: false,
      disableGlobalPointerHooks: false,
      disableVisualizerLoop: false
    });
  });

  it('resolves all guard flags from query parameters', () => {
    const guards = resolveRuntimeGuards({
      search: '?diag_window=1&guard_no_ball=true&guard_no_pointer=yes&guard_no_visualizer=on',
      storageReader: createStorageReader()
    });

    expect(guards.diagWindow).toBe(true);
    expect(guards.disableLevitationBall).toBe(true);
    expect(guards.disableGlobalPointerHooks).toBe(true);
    expect(guards.disableVisualizerLoop).toBe(true);
  });

  it('falls back to localStorage keys when query flags are absent', () => {
    const guards = resolveRuntimeGuards({
      search: '',
      storageReader: createStorageReader({
        'shizuki.diag.window': 'true',
        'shizuki.guard.disableLevitationBall': '1',
        'shizuki.guard.disableGlobalPointerHooks': 'on',
        'shizuki.guard.disableVisualizerLoop': 'yes'
      })
    });

    expect(guards).toEqual({
      diagWindow: true,
      disableLevitationBall: false,
      disableGlobalPointerHooks: true,
      disableVisualizerLoop: true
    });
  });

  it('prefers query values over stored values', () => {
    const guards = resolveRuntimeGuards({
      search: '?guard_no_ball=0&guard_no_pointer=false',
      storageReader: createStorageReader({
        'shizuki.guard.disableLevitationBall': '1',
        'shizuki.guard.disableGlobalPointerHooks': '1'
      })
    });

    expect(guards.disableLevitationBall).toBe(false);
    expect(guards.disableGlobalPointerHooks).toBe(false);
  });
});
