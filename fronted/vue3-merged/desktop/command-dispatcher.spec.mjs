import { describe, expect, it, vi } from 'vitest';
import { ControlEventHub } from './control-service.mjs';
import { DesktopCommandDispatcher, normalizeRendererState } from './command-dispatcher.mjs';

function fakeWindow() {
  let visible = true;
  let minimized = false;
  return {
    isDestroyed: () => false,
    isVisible: () => visible,
    isFocused: () => true,
    isMinimized: () => minimized,
    isMaximized: () => false,
    getBounds: () => ({ x: 0, y: 0, width: 1000, height: 700 }),
    show: vi.fn(() => { visible = true; }),
    hide: vi.fn(() => { visible = false; }),
    focus: vi.fn(),
    minimize: vi.fn(() => { minimized = true; }),
    restore: vi.fn(() => { minimized = false; }),
    webContents: {
      isDestroyed: () => false,
      send: vi.fn()
    }
  };
}

describe('DesktopCommandDispatcher', () => {
  it('normalizes renderer state without leaking unknown fields', () => {
    const state = normalizeRendererState({
      ready: true,
      route: { name: 'home', path: '/', fullPath: '/', accessToken: 'secret' },
      player: { isPlaying: true, currentTrack: { id: '1', title: 'T', artist: 'A', audio: 'secret' } }
    });
    expect(state.route).toEqual({ name: 'home', path: '/', fullPath: '/' });
    expect(JSON.stringify(state)).not.toContain('secret');
  });

  it('executes native window commands without involving the renderer', async () => {
    const window = fakeWindow();
    const dispatcher = new DesktopCommandDispatcher({ getWindow: () => window, eventHub: new ControlEventHub() });
    const result = await dispatcher.dispatch({ id: '1', command: 'window.hide', payload: {}, target: 'native' });
    expect(window.hide).toHaveBeenCalledOnce();
    expect(result.window.visible).toBe(false);
    expect(window.webContents.send).not.toHaveBeenCalled();
  });

  it('correlates renderer acknowledgements with pending commands', async () => {
    const window = fakeWindow();
    const dispatcher = new DesktopCommandDispatcher({ getWindow: () => window, eventHub: new ControlEventHub() });
    dispatcher.updateRendererState({ ready: true, route: { path: '/', fullPath: '/' } });
    const pending = dispatcher.dispatch({ id: 'meguri-1', command: 'music.next', payload: {}, target: 'renderer' });
    expect(window.webContents.send).toHaveBeenCalledWith(
      'shizuki-desktop:command',
      expect.objectContaining({ id: 'meguri-1', command: 'music.next' })
    );
    expect(dispatcher.completeRendererCommand({ id: 'meguri-1', ok: true, result: { accepted: true } })).toBe(true);
    await expect(pending).resolves.toEqual({ accepted: true });
  });
});
