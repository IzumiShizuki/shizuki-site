import { describe, expect, it, vi } from 'vitest';
import { nativeHandleToDecimal, WindowsDesktopAdapter } from './windows-desktop-adapter.mjs';

describe('WindowsDesktopAdapter', () => {
  it('converts little-endian native handles without losing 64-bit precision', () => {
    const handle = Buffer.alloc(8);
    handle.writeBigUInt64LE(0x1234567890ABCDEFn);
    expect(nativeHandleToDecimal(handle)).toBe('1311768467294899695');
  });

  it('invokes only typed attach arguments', async () => {
    const runOperation = vi.fn().mockResolvedValue({ ok: true, attached: true });
    const adapter = new WindowsDesktopAdapter({ runOperation });
    const handle = Buffer.alloc(8);
    handle.writeBigUInt64LE(321n);
    await adapter.attachWindow({ getNativeWindowHandle: () => handle }, { x: -10, y: 5, width: 1920, height: 1080 });
    expect(runOperation).toHaveBeenCalledWith('attach', {
      WindowHandle: '321',
      X: -10,
      Y: 5,
      Width: 1920,
      Height: 1080
    });
  });

  it('exposes icon visibility and foreground inspection through fixed verbs', async () => {
    const runOperation = vi.fn()
      .mockResolvedValueOnce({ ok: true, visible: true })
      .mockResolvedValueOnce({ ok: true, visible: false })
      .mockResolvedValueOnce({ ok: true, fullscreen: true });
    const adapter = new WindowsDesktopAdapter({ runOperation });
    await expect(adapter.getDesktopIconsVisible()).resolves.toBe(true);
    await expect(adapter.setDesktopIconsVisible(false)).resolves.toBe(false);
    await expect(adapter.inspectForegroundFullscreen()).resolves.toMatchObject({ fullscreen: true });
    expect(runOperation.mock.calls.map(call => call[0])).toEqual(['get-icons', 'set-icons', 'foreground-fullscreen']);
  });
});
