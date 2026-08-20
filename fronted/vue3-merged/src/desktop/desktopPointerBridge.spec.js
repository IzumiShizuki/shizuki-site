import { describe, expect, it, vi } from 'vitest';
import { installDesktopPointerBridge, pointerRequiresDesktopInput } from './desktopPointerBridge';

describe('desktopPointerBridge', () => {
  it('captures only audited interactive targets outside edit mode', () => {
    expect(pointerRequiresDesktopInput({ closest: () => null }, false)).toBe(false);
    expect(pointerRequiresDesktopInput({ closest: () => ({ tagName: 'BUTTON' }) }, false)).toBe(true);
    expect(pointerRequiresDesktopInput(null, true)).toBe(true);
  });

  it('deduplicates pointer forwarding and captures the whole surface in edit mode', () => {
    const listeners = new Map();
    const target = {
      addEventListener: (name, listener) => listeners.set(name, listener),
      removeEventListener: vi.fn()
    };
    const api = {
      isDesktop: true,
      surface: { role: 'desktop' },
      setInputPassThrough: vi.fn()
    };
    const dispose = installDesktopPointerBridge({ desktopApi: api, windowTarget: target });
    expect(api.setInputPassThrough).toHaveBeenLastCalledWith(true);
    listeners.get('pointermove')({ target: { closest: () => ({}) } });
    expect(api.setInputPassThrough).toHaveBeenLastCalledWith(false);
    listeners.get('shizuki-desktop-edit-mode')({ detail: { enabled: true } });
    expect(api.setInputPassThrough).toHaveBeenCalledTimes(2);
    dispose();
  });
});
