// @vitest-environment jsdom
import { afterAll, beforeAll, describe, expect, it, vi } from 'vitest';
import { installShizukiExternalBridge } from '../../src/shizukiExternalBridge';
import { usePlaybackStore } from '../../src/stores/usePlaybackStore';
import { useOnlineProviderAccountStore } from '../../src/stores/useOnlineProviderAccountStore';
import type { SongResult } from '../../src/types';

describe('Shizuki platform like bridge', () => {
  beforeAll(() => {
    const root = document.createElement('div');
    root.id = 'folia-embed-root';
    document.body.append(root);
    vi.stubGlobal('requestAnimationFrame', vi.fn(() => 1));
    vi.stubGlobal('cancelAnimationFrame', vi.fn());
    vi.spyOn(window, 'setInterval').mockReturnValue(1 as unknown as ReturnType<typeof setInterval>);
    installShizukiExternalBridge();
  });
  afterAll(() => { vi.restoreAllMocks(); vi.unstubAllGlobals(); });

  it('reports the actual provider liked IDs instead of an unset playback-store flag', () => {
    usePlaybackStore.setState({ currentSong: { id: 42, name: 'Account track', artists: [], album: { id: 1, name: 'Album', coverUrl: '' }, durationMs: 1000, sourceRef: { kind: 'online', providerId: 'netease', mediaId: '42' } } as SongResult });
    useOnlineProviderAccountStore.getState().updateAccount('netease', { hydration: 'ready', likedSongIds: [42] });
    const messages = vi.spyOn(window, 'postMessage');
    window.dispatchEvent(new MessageEvent('message', { data: { type: 'shizuki:get-status' } }));
    expect(messages).toHaveBeenCalledWith(expect.objectContaining({ type: 'shizuki:status', liked: true, track: expect.objectContaining({ provider: 'netease' }) }), '*');
    messages.mockRestore();
  });

  it('relays an acknowledged host like to the UI without another platform write', () => {
    const changed = vi.fn();
    window.addEventListener('shizuki:track-like-state', changed);
    const detail = { type: 'shizuki:track-like-state', provider: 'netease', trackId: '42', liked: false };
    window.dispatchEvent(new MessageEvent('message', { data: detail }));
    expect(changed).toHaveBeenCalledOnce();
    expect(changed.mock.calls[0][0].detail).toEqual(detail);
    window.dispatchEvent(new MessageEvent('message', { data: { ...detail, trackId: 'invalid' } }));
    expect(changed).toHaveBeenCalledOnce();
    window.removeEventListener('shizuki:track-like-state', changed);
  });
});
