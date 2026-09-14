/**
 * playbackQueueController 核心测试（上游 Twilight_Echo 无对应测试文件，
 * 按控制器文档语义补写；Apache-2.0 移植配套）。
 */
import { describe, expect, it, vi } from 'vitest';
import { ref } from 'vue';
import { createPlaybackQueueController } from './playbackQueueController.js';

function makeTrack(id, overrides = {}) {
  return {
    id,
    title: `Track ${id}`,
    artist: 'Artist',
    album: 'Album',
    filePath: `C:/Music/${id}.flac`,
    fileName: `${id}.flac`,
    duration: 180,
    size: 1,
    cover: null,
    lyrics: null,
    source: 'local',
    ...overrides
  };
}

function setup(initialTracks) {
  const queue = ref(initialTracks.map((t) => ({ ...t, queueEntryId: `entry:${t.id}` })));
  const originalQueue = ref(queue.value.map((t) => ({ ...t })));
  const currentTrack = ref(queue.value[0] ? { ...queue.value[0] } : null);
  const queueIndex = ref(queue.value.length > 0 ? 0 : -1);
  const playMode = ref('sequential');
  const isPlaying = ref(false);
  const personalizedStreamSession = ref(null);
  const personalizedStreamRemaining = ref(0);
  const personalizedStreamEntryIds = new Set();
  const personalizedStreamPlayedEntryIds = new Set();
  const rendererPlayModeBoundaryPending = ref(false);
  const persistPlaybackSessionAfterQueueMutation = vi.fn();
  const queueNativeQueueStateSync = vi.fn().mockResolvedValue(undefined);
  const setAudioEngineError = vi.fn();
  const clearAutomaticLyricsBaselines = vi.fn();

  const controller = createPlaybackQueueController({
    currentTrack,
    queue,
    originalQueue,
    queueIndex,
    playMode,
    isPlaying,
    personalizedStreamSession,
    personalizedStreamRemaining,
    personalizedStreamEntryIds,
    personalizedStreamPlayedEntryIds,
    rendererPlayModeBoundaryPending,
    persistPlaybackSessionAfterQueueMutation,
    queueNativeQueueStateSync,
    setAudioEngineError,
    clearAutomaticLyricsBaselines
  });

  return {
    queue,
    originalQueue,
    currentTrack,
    queueIndex,
    playMode,
    isPlaying,
    personalizedStreamSession,
    personalizedStreamRemaining,
    personalizedStreamEntryIds,
    personalizedStreamPlayedEntryIds,
    rendererPlayModeBoundaryPending,
    persistPlaybackSessionAfterQueueMutation,
    queueNativeQueueStateSync,
    setAudioEngineError,
    clearAutomaticLyricsBaselines,
    controller
  };
}

describe('playbackQueueController queue editing', () => {
  it('enqueueTrack appends a snapshot with a unique entry identity and commits', () => {
    const s = setup([makeTrack('a'), makeTrack('b')]);

    s.controller.enqueueTrack(makeTrack('a'));

    expect(s.queue.value).toHaveLength(3);
    expect(s.queue.value[2].id).toBe('a');
    expect(s.queue.value[2].queueEntryId).toBeDefined();
    expect(s.queue.value[2].queueEntryId).not.toBe(s.queue.value[0].queueEntryId);
    expect(s.queueIndex.value).toBe(0);
    expect(s.persistPlaybackSessionAfterQueueMutation).toHaveBeenCalledTimes(1);
    expect(s.queueNativeQueueStateSync).toHaveBeenCalledTimes(1);
  });

  it('playNextTrack inserts after the current index without moving it', () => {
    const s = setup([makeTrack('a'), makeTrack('b'), makeTrack('c')]);

    s.controller.playNextTrack(makeTrack('x'));

    expect(s.queue.value.map((t) => t.id)).toEqual(['a', 'x', 'b', 'c']);
    expect(s.queueIndex.value).toBe(0);
  });

  it('removeQueueItem adjusts the current index when removing before it', () => {
    const s = setup([makeTrack('a'), makeTrack('b'), makeTrack('c'), makeTrack('d')]);
    s.queueIndex.value = 2; // current = c

    s.controller.removeQueueItem(1); // remove b (before current)
    expect(s.queue.value.map((t) => t.id)).toEqual(['a', 'c', 'd']);
    expect(s.queueIndex.value).toBe(1);

    s.controller.removeQueueItem(2); // remove d (after current)
    expect(s.queue.value.map((t) => t.id)).toEqual(['a', 'c']);
    expect(s.queueIndex.value).toBe(1);

    s.controller.removeQueueItem(1); // remove current itself
    expect(s.queue.value.map((t) => t.id)).toEqual(['a']);
    expect(s.queueIndex.value).toBe(0); // commitQueueEdit clamps to the last valid index
  });

  it('removeQueueItem ignores invalid indices', () => {
    const s = setup([makeTrack('a'), makeTrack('b')]);
    const before = s.queue.value.map((t) => t.id);

    s.controller.removeQueueItem(-1);
    s.controller.removeQueueItem(2);
    s.controller.removeQueueItem(1.5);

    expect(s.queue.value.map((t) => t.id)).toEqual(before);
    expect(s.persistPlaybackSessionAfterQueueMutation).not.toHaveBeenCalled();
  });

  it('clearQueue empties the queue and stops playback', () => {
    const s = setup([makeTrack('a'), makeTrack('b')]);
    s.isPlaying.value = true;

    s.controller.clearQueue();

    expect(s.queue.value).toEqual([]);
    expect(s.originalQueue.value).toEqual([]);
    expect(s.queueIndex.value).toBe(-1);
    expect(s.currentTrack.value).toBeNull();
    expect(s.isPlaying.value).toBe(false);
    expect(s.clearAutomaticLyricsBaselines).toHaveBeenCalledTimes(1);
  });

  it('reorderQueue keeps the current index tracking the moved track', () => {
    const s = setup([makeTrack('a'), makeTrack('b'), makeTrack('c'), makeTrack('d')]);
    s.queueIndex.value = 2; // current = c

    s.controller.reorderQueue(0, 3); // from < current <= to → current shifts down
    expect(s.queue.value.map((t) => t.id)).toEqual(['b', 'c', 'd', 'a']);
    expect(s.queueIndex.value).toBe(1);

    s.controller.reorderQueue(3, 1); // from > current >= to → current shifts up
    expect(s.queue.value.map((t) => t.id)).toEqual(['b', 'a', 'c', 'd']);
    expect(s.queueIndex.value).toBe(2);

    s.controller.reorderQueue(2, 0); // moved item is current → index follows it
    expect(s.queue.value.map((t) => t.id)).toEqual(['c', 'b', 'a', 'd']);
    expect(s.queueIndex.value).toBe(0);

    s.controller.reorderQueue(0, 0); // same position → no-op
    expect(s.persistPlaybackSessionAfterQueueMutation).toHaveBeenCalledTimes(3);
  });

  it('saveQueueAsPlaylist passes a snapshot copy of the queue', () => {
    const s = setup([makeTrack('a'), makeTrack('b')]);
    let captured = null;
    const result = s.controller.saveQueueAsPlaylist('My Queue', (name, tracks) => {
      captured = tracks;
      return `${name}:saved`;
    });

    expect(result).toBe('My Queue:saved');
    expect(captured.map((t) => t.id)).toEqual(['a', 'b']);
    captured.push(makeTrack('mutated'));
    expect(s.queue.value).toHaveLength(2);
  });

  it('commitQueueEdit clamps the next index into range', () => {
    const s = setup([makeTrack('a')]);

    s.controller.commitQueueEdit([makeTrack('a'), makeTrack('b')], 99);
    expect(s.queueIndex.value).toBe(1);

    s.controller.commitQueueEdit([], 5);
    expect(s.queueIndex.value).toBe(-1);
    expect(s.queue.value).toEqual([]);
  });

  it('appendQueueTracks appends snapshots and does not end a session-free edit path twice', () => {
    const s = setup([makeTrack('a')]);

    s.controller.appendQueueTracks([makeTrack('b'), makeTrack('b')]);

    expect(s.queue.value).toHaveLength(3);
    expect(s.queue.value[1].queueEntryId).not.toBe(s.queue.value[2].queueEntryId);
    expect(s.queueNativeQueueStateSync).toHaveBeenCalledTimes(1);
  });

  it('queue mutation surfaces native sync errors through the audio error channel', async () => {
    const s = setup([makeTrack('a')]);
    s.queueNativeQueueStateSync.mockRejectedValueOnce(new Error('sync boom'));

    s.controller.enqueueTrack(makeTrack('b'));

    await vi.waitFor(() => {
      expect(s.setAudioEngineError).toHaveBeenCalledWith('sync boom');
    });
  });
});

describe('playbackQueueController personalized stream sessions', () => {
  it('starts a session over the current queue and counts unplayed entries', () => {
    const s = setup([makeTrack('a'), makeTrack('b')]);
    s.currentTrack.value = s.queue.value[0];

    const session = s.controller.startPersonalizedStream('fm');

    expect(session.key).toBe('fm');
    expect(s.personalizedStreamSession.value).toEqual(session);
    expect([...s.personalizedStreamEntryIds]).toEqual(['entry:a', 'entry:b']);
    // current track (a) is marked played on start
    expect(s.personalizedStreamRemaining.value).toBe(1);
  });

  it('marks the current track played and appends only for the current session', () => {
    const s = setup([makeTrack('a'), makeTrack('b')]);
    s.currentTrack.value = s.queue.value[0];
    const session = s.controller.startPersonalizedStream('fm');

    s.currentTrack.value = s.queue.value[1];
    s.controller.markCurrentPersonalizedStreamTrackPlayed();
    expect(s.personalizedStreamRemaining.value).toBe(0);

    const added = s.controller.appendPersonalizedStreamTracks(session, [
      makeTrack('c'),
      makeTrack('d')
    ]);
    expect(added).toBe(true);
    expect(s.queue.value).toHaveLength(4);
    expect(s.personalizedStreamRemaining.value).toBe(2);
    expect(s.controller.isPersonalizedStreamTrack(s.queue.value[2])).toBe(true);

    const stale = s.controller.appendPersonalizedStreamTracks(
      { id: 999, key: 'fm' },
      [makeTrack('e')]
    );
    expect(stale).toBe(false);
    expect(s.queue.value).toHaveLength(4);
  });

  it('any queue edit ends the personalized stream', () => {
    const s = setup([makeTrack('a'), makeTrack('b')]);
    s.currentTrack.value = s.queue.value[0];
    s.controller.startPersonalizedStream('fm');
    expect(s.personalizedStreamSession.value).not.toBeNull();

    s.controller.enqueueTrack(makeTrack('c'));

    expect(s.personalizedStreamSession.value).toBeNull();
    expect(s.personalizedStreamRemaining.value).toBe(0);
    expect(s.personalizedStreamEntryIds.size).toBe(0);
  });
});

describe('playbackQueueController play-mode boundary', () => {
  it('shuffle re-queues with the current track first', () => {
    const s = setup([makeTrack('a'), makeTrack('b'), makeTrack('c'), makeTrack('d')]);
    s.currentTrack.value = s.queue.value[2]; // c
    s.playMode.value = 'shuffle';
    s.rendererPlayModeBoundaryPending.value = true;

    s.controller.applyPendingRendererPlayModeAtBoundary();

    expect(s.queue.value[0].id).toBe('c');
    expect(s.queueIndex.value).toBe(0);
    expect(s.queue.value.map((t) => t.id).sort()).toEqual(['a', 'b', 'c', 'd']);
    expect(s.rendererPlayModeBoundaryPending.value).toBe(false);
  });

  it('sequential restores the original order and locates the current track', () => {
    const s = setup([makeTrack('a'), makeTrack('b'), makeTrack('c'), makeTrack('d')]);
    s.queue.value = [s.queue.value[3], s.queue.value[0], s.queue.value[2], s.queue.value[1]];
    s.queueIndex.value = 0;
    s.currentTrack.value = s.queue.value[0]; // d
    s.rendererPlayModeBoundaryPending.value = true;

    s.controller.applyPendingRendererPlayModeAtBoundary();

    expect(s.queue.value.map((t) => t.id)).toEqual(['a', 'b', 'c', 'd']);
    expect(s.queueIndex.value).toBe(3);
  });

  it('does nothing when no boundary is pending or play mode is heart', () => {
    const s = setup([makeTrack('a'), makeTrack('b')]);
    s.rendererPlayModeBoundaryPending.value = false;

    s.controller.applyPendingRendererPlayModeAtBoundary();
    expect(s.queue.value).toHaveLength(2);

    s.rendererPlayModeBoundaryPending.value = true;
    s.playMode.value = 'heart';
    s.controller.applyPendingRendererPlayModeAtBoundary();
    expect(s.queueIndex.value).toBe(0);
    expect(s.rendererPlayModeBoundaryPending.value).toBe(false);
  });
});
