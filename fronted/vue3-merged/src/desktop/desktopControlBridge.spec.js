import { ref } from 'vue';
import { describe, expect, it, vi } from 'vitest';
import {
  createDesktopCommandHandler,
  createDesktopRendererState,
  installDesktopControlBridge
} from './desktopControlBridge';

function fixture() {
  const router = {
    currentRoute: ref({ name: 'home', path: '/', fullPath: '/' }),
    push: vi.fn(async path => {
      router.currentRoute.value = { name: 'target', path, fullPath: path };
    })
  };
  const player = {
    isPlaying: ref(false),
    currentTime: ref(12),
    duration: ref(180),
    currentTrack: ref({ id: 'track-1', title: 'Title', artist: 'Artist', audio: 'secret-url' }),
    togglePlay: vi.fn(async () => {
      player.isPlaying.value = !player.isPlaying.value;
    }),
    playNext: vi.fn(),
    playPrev: vi.fn()
  };
  return { router, player };
}

describe('desktopControlBridge', () => {
  it('maps allowlisted navigation keys onto Vue Router paths', async () => {
    const { router, player } = fixture();
    const handle = createDesktopCommandHandler({ router, player });
    await handle({ command: 'app.navigate', payload: { destination: 'music' } });
    expect(router.push).toHaveBeenCalledWith('/music-library/music');
  });

  it('makes play and pause idempotent while keeping toggle explicit', async () => {
    const { router, player } = fixture();
    const handle = createDesktopCommandHandler({ router, player });
    await handle({ command: 'music.play', payload: {} });
    await handle({ command: 'music.play', payload: {} });
    await handle({ command: 'music.pause', payload: {} });
    expect(player.togglePlay).toHaveBeenCalledTimes(2);
    expect(player.isPlaying.value).toBe(false);
  });

  it('reports normalized route and player state without resource URLs', () => {
    const state = createDesktopRendererState(fixture());
    expect(state.route.fullPath).toBe('/');
    expect(state.player.currentTrack).toEqual({ id: 'track-1', title: 'Title', artist: 'Artist' });
    expect(JSON.stringify(state)).not.toContain('secret-url');
  });

  it('acknowledges renderer commands and reports updated state', async () => {
    const { router, player } = fixture();
    let listener;
    const desktopApi = {
      isDesktop: true,
      onCommand: vi.fn(next => {
        listener = next;
        return vi.fn();
      }),
      reportState: vi.fn(),
      respondToCommand: vi.fn()
    };
    const dispose = installDesktopControlBridge({ router, player, desktopApi });
    await listener({ id: 'cmd-1', command: 'music.next', payload: {} });
    expect(player.playNext).toHaveBeenCalledOnce();
    expect(desktopApi.respondToCommand).toHaveBeenCalledWith(expect.objectContaining({ id: 'cmd-1', ok: true }));
    dispose();
  });
});
