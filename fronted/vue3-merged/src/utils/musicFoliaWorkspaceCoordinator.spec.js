import { describe, expect, it, vi } from 'vitest';
import { createMusicFoliaWorkspaceCoordinator } from './musicFoliaWorkspaceCoordinator.js';

function deferred() {
  let resolve;
  let reject;
  const promise = new Promise((resolvePromise, rejectPromise) => {
    resolve = resolvePromise;
    reject = rejectPromise;
  });
  return { promise, resolve, reject };
}

function makeCoordinator(overrides = {}) {
  const state = [];
  const deps = {
    loadPlaylist: vi.fn(async (code) => ({
      profile: { playlistCode: code, name: code },
      tracks: [{ id: `${code}-1` }, { id: `${code}-2` }]
    })),
    replaceQueueWithTracks: vi.fn(async () => true),
    playTrack: vi.fn(async () => true),
    navigate: vi.fn(async () => true),
    onStateChange: vi.fn((next) => state.push(next)),
    ...overrides
  };
  return { coordinator: createMusicFoliaWorkspaceCoordinator(deps), deps, state };
}

describe('music Folia workspace coordinator', () => {
  it('lets the latest playlist choice win even when an earlier load resolves last', async () => {
    const slowP1 = deferred();
    const { coordinator, deps } = makeCoordinator({
      loadPlaylist: vi.fn((code) => code === 'P1' ? slowP1.promise : Promise.resolve({
        profile: { playlistCode: code, name: code },
        tracks: [{ id: 'P2-A' }, { id: 'P2-B' }]
      }))
    });

    const first = coordinator.selectPlaylist({ playlistCode: 'P1' });
    const latest = coordinator.selectPlaylist({ playlistCode: 'P2' });
    await latest;
    slowP1.resolve({ profile: { playlistCode: 'P1', name: 'P1' }, tracks: [{ id: 'P1-A' }] });
    await first;

    expect(deps.replaceQueueWithTracks).toHaveBeenCalledOnce();
    expect(deps.replaceQueueWithTracks).toHaveBeenCalledWith(
      [{ id: 'P2-A' }, { id: 'P2-B' }],
      0,
      true,
      expect.objectContaining({ sourceCode: 'P2' })
    );
    expect(deps.navigate).toHaveBeenLastCalledWith(expect.objectContaining({
      view: 'lattice',
      sourceContext: { kind: 'queue', sitePlaylistCode: 'P2' }
    }));
  });

  it('installs a complete native collection at the requested song index and preserves its opaque source', async () => {
    const tracks = [{ id: 'a' }, { id: 'b' }, { id: 'c' }];
    const { coordinator, deps } = makeCoordinator();

    await coordinator.selectNativeCollection({
      collection: { source: 'navidrome', type: 'playlist', id: 'opaque:17', name: 'Road' },
      tracks,
      selectedIndex: 2
    });

    expect(deps.replaceQueueWithTracks).toHaveBeenCalledWith(
      tracks,
      2,
      true,
      expect.objectContaining({ sourceType: 'folia-native-collection', sourceContext: expect.any(Object) })
    );
    expect(deps.replaceQueueWithTracks.mock.calls[0][3]).not.toHaveProperty('sourceCode');
    expect(deps.navigate).toHaveBeenLastCalledWith(expect.objectContaining({
      view: 'lattice',
      sourceContext: {
        kind: 'collection',
        collection: { source: 'navidrome', type: 'playlist', id: 'opaque:17', name: 'Road' }
      }
    }));
  });

  it('clears pending state after native collection queue installation throws', async () => {
    const { coordinator, deps, state } = makeCoordinator({
      replaceQueueWithTracks: vi.fn().mockRejectedValue(new Error('provider resolution failed'))
    });

    await expect(coordinator.selectNativeCollection({
      collection: { source: 'navidrome', type: 'playlist', id: 'opaque', name: 'Native' },
      tracks: [{ id: 'unresolved' }]
    })).resolves.toMatchObject({ ok: false, error: expect.any(Error) });

    expect(deps.navigate).not.toHaveBeenCalled();
    expect(state.at(-1)).toMatchObject({ pending: false, error: 'provider resolution failed' });
  });

  it('navigates directly to the player when a playlist entry explicitly requests immersion', async () => {
    const { coordinator, deps } = makeCoordinator();

    await coordinator.selectPlaylist({ playlistCode: 'P2', view: 'player' });

    expect(deps.navigate).toHaveBeenCalledOnce();
    expect(deps.navigate).toHaveBeenCalledWith(expect.objectContaining({ view: 'player' }));
  });

  it('keeps wall song selection in the wall and opens the full player only for explicit immersion', async () => {
    const { coordinator, deps } = makeCoordinator();

    await coordinator.selectSong({ track: { id: 'wall-song' }, surface: 'wall' });
    await coordinator.openCurrentSong({ track: { id: 'current-song' }, surface: 'immersive' });

    expect(deps.playTrack).toHaveBeenNthCalledWith(1, { id: 'wall-song' }, expect.objectContaining({ queuePolicy: 'preserve-or-insert' }));
    expect(deps.navigate).toHaveBeenNthCalledWith(1, expect.objectContaining({ view: 'lattice' }));
    expect(deps.playTrack).toHaveBeenCalledOnce();
    expect(deps.navigate).toHaveBeenLastCalledWith(expect.objectContaining({ view: 'player' }));
  });

  it('ignores playlist work that resolves after the Folia workspace is deactivated', async () => {
    const pending = deferred();
    const { coordinator, deps } = makeCoordinator({ loadPlaylist: vi.fn(() => pending.promise) });

    const entry = coordinator.selectPlaylist({ playlistCode: 'P1' });
    coordinator.deactivate();
    pending.resolve({ profile: { playlistCode: 'P1', name: 'P1' }, tracks: [{ id: 'a' }] });
    await entry;

    expect(deps.replaceQueueWithTracks).not.toHaveBeenCalled();
    expect(deps.navigate).not.toHaveBeenCalled();
  });

  it('allocates protocol request IDs monotonically across coordinator instances', async () => {
    const first = makeCoordinator();
    const second = makeCoordinator();

    const firstEntry = await first.coordinator.openCurrentSong({ view: 'lattice' });
    const secondEntry = await second.coordinator.openCurrentSong({ view: 'lattice' });

    expect(secondEntry.requestId).toBeGreaterThan(firstEntry.requestId);
  });

  it('clears pending state and reports a recoverable playlist failure', async () => {
    const { coordinator, deps, state } = makeCoordinator({ loadPlaylist: vi.fn().mockRejectedValue(new Error('offline')) });

    await expect(coordinator.selectPlaylist({ playlistCode: 'P1' })).resolves.toMatchObject({ ok: false });

    expect(deps.replaceQueueWithTracks).not.toHaveBeenCalled();
    expect(deps.navigate).not.toHaveBeenCalled();
    expect(state.at(-1)).toMatchObject({ pending: false, error: expect.any(String) });
  });
});
