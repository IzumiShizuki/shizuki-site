import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { usePlayerEngine } from './usePlayerEngine';
import { getPlaylistBundleByCode, resolvePlaybackTrack } from '../services/musicApi';

vi.mock('../services/musicApi', () => ({
  getPlaylistBundleByCode: vi.fn(),
  resolvePlaybackTrack: vi.fn()
}));

class FakeAudio {
  constructor() {
    this.preload = 'metadata';
    this.volume = 1;
    this.currentTime = 0;
    this.duration = 180;
    this.src = '';
    this.paused = true;
    this._listeners = new Map();
  }

  addEventListener(event, handler) {
    const list = this._listeners.get(event) || [];
    list.push(handler);
    this._listeners.set(event, list);
  }

  removeEventListener(event, handler) {
    const list = this._listeners.get(event) || [];
    this._listeners.set(
      event,
      list.filter((item) => item !== handler)
    );
  }

  _emit(event) {
    const list = this._listeners.get(event) || [];
    for (const handler of list) {
      handler();
    }
  }

  load() {
    this._emit('loadedmetadata');
  }

  async play() {
    this.paused = false;
    this._emit('play');
    return undefined;
  }

  pause() {
    this.paused = true;
    this._emit('pause');
  }
}

describe('usePlayerEngine queue identity', () => {
  const originalAudio = globalThis.Audio;

  beforeEach(() => {
    vi.clearAllMocks();
    globalThis.Audio = FakeAudio;
    window.localStorage.clear();
    window.sessionStorage.clear();
    vi.mocked(getPlaylistBundleByCode).mockResolvedValue({ profile: {}, tracks: [] });
  });

  afterEach(() => {
    globalThis.Audio = originalAudio;
  });

  it('assigns a unique queueEntryId to every normalized track', async () => {
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks(
      [
        { provider: 'netease', trackId: 't-1', title: 'One', artist: 'Singer', audio: 'https://audio.example.com/1.mp3' },
        { provider: 'netease', trackId: 't-2', title: 'Two', artist: 'Singer', audio: 'https://audio.example.com/2.mp3' },
        { provider: 'netease', trackId: 't-3', title: 'Three', artist: 'Singer', audio: 'https://audio.example.com/3.mp3' }
      ],
      0,
      false
    );

    const ids = engine.tracks.value.map((t) => t.queueEntryId);
    expect(ids.every((id) => typeof id === 'string' && id.trim().length > 0)).toBe(true);
    expect(new Set(ids).size).toBe(ids.length);
    expect(ids[0]).toMatch(/^netease:t-1:\d+$/);
  });

  it('keeps the queueEntryId stable when a track is lazily resolved for playback', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/resolved.mp3',
      lyricText: '[00:01.00]line'
    });

    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks(
      [{ provider: 'netease', trackId: 'lazy-resolve', title: 'Lazy', artist: 'Singer' }],
      0,
      false
    );
    const before = engine.tracks.value[0].queueEntryId;
    await engine.selectTrackByIndex(0, true);

    expect(engine.tracks.value[0].queueEntryId).toBe(before);
    expect(engine.tracks.value[0].audio).toBe('https://audio.example.com/resolved.mp3');
  });

  it('gives distinct queueEntryId to duplicate enqueues of the same track', () => {
    const engine = usePlayerEngine();
    engine.appendToQueueEnd({ provider: 'netease', trackId: 'dup-track', title: 'Dup', artist: 'Singer', audio: 'https://audio.example.com/dup.mp3' });
    engine.appendToQueueEnd({ provider: 'netease', trackId: 'dup-track', title: 'Dup', artist: 'Singer', audio: 'https://audio.example.com/dup.mp3' });

    expect(engine.tracks.value).toHaveLength(2);
    expect(engine.tracks.value[0].id).toBe(engine.tracks.value[1].id);
    expect(engine.tracks.value[0].queueEntryId).not.toBe(engine.tracks.value[1].queueEntryId);
    expect(engine.tracks.value.map((t) => t.sort)).toEqual([1, 2]);
  });

  it('appends to the tail while enqueueNextTrack inserts after the current track', async () => {
    const engine = usePlayerEngine();
    engine.appendToQueueEnd({ provider: 'local', trackId: 'a', title: 'A', artist: 'S', audio: 'https://audio.example.com/a.mp3' });
    engine.appendToQueueEnd({ provider: 'local', trackId: 'b', title: 'B', artist: 'S', audio: 'https://audio.example.com/b.mp3' });
    engine.appendToQueueEnd({ provider: 'local', trackId: 'c', title: 'C', artist: 'S', audio: 'https://audio.example.com/c.mp3' });
    engine.currentTrackId.value = 'b';

    engine.appendToQueueEnd({ provider: 'local', trackId: 'd', title: 'D', artist: 'S', audio: 'https://audio.example.com/d.mp3' });
    await engine.enqueueNextTrack({ provider: 'local', trackId: 'e', title: 'E', artist: 'S', audio: 'https://audio.example.com/e.mp3' });

    expect(engine.tracks.value.map((t) => t.id)).toEqual(['a', 'b', 'e', 'c', 'd']);
  });

  it('keeps enqueueNextTrack dedup behavior and identity presence', async () => {
    const engine = usePlayerEngine();
    await engine.enqueueNextTrack({ provider: 'local', trackId: 'x', title: 'X', artist: 'S', audio: 'https://audio.example.com/x.mp3' });
    await engine.enqueueNextTrack({ provider: 'local', trackId: 'x', title: 'X updated', artist: 'S', audio: 'https://audio.example.com/x2.mp3' });

    expect(engine.tracks.value).toHaveLength(1);
    expect(engine.tracks.value[0].title).toBe('X updated');
    expect(typeof engine.tracks.value[0].queueEntryId).toBe('string');
    expect(engine.tracks.value[0].queueEntryId.trim().length).toBeGreaterThan(0);
  });

  it('removeQueueItem removes by queueEntryId among duplicate entries', () => {
    const engine = usePlayerEngine();
    engine.appendToQueueEnd({ provider: 'local', trackId: 'dup', title: 'Dup', artist: 'S', audio: 'https://audio.example.com/dup.mp3' });
    engine.appendToQueueEnd({ provider: 'local', trackId: 'dup', title: 'Dup', artist: 'S', audio: 'https://audio.example.com/dup.mp3' });

    const targetId = engine.tracks.value[1].queueEntryId;
    const removed = engine.removeQueueItem(targetId);

    expect(removed).toBe(true);
    expect(engine.tracks.value).toHaveLength(1);
    expect(engine.tracks.value[0].queueEntryId).not.toBe(targetId);
    expect(engine.tracks.value[0].sort).toBe(1);
  });

  it('removeQueueItem accepts a numeric index and rejects unknown identities', () => {
    const engine = usePlayerEngine();
    engine.appendToQueueEnd({ provider: 'local', trackId: 'a', title: 'A', artist: 'S', audio: 'https://audio.example.com/a.mp3' });
    engine.appendToQueueEnd({ provider: 'local', trackId: 'b', title: 'B', artist: 'S', audio: 'https://audio.example.com/b.mp3' });

    expect(engine.removeQueueItem(0)).toBe(true);
    expect(engine.tracks.value.map((t) => t.id)).toEqual(['b']);
    expect(engine.removeQueueItem('missing-entry-id')).toBe(false);
    expect(engine.removeQueueItem(5)).toBe(false);
    expect(engine.tracks.value).toHaveLength(1);
  });

  it('stops playback and resets state when the current track is removed', async () => {
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks(
      [
        { provider: 'local', trackId: 'playing', title: 'Playing', artist: 'S', audio: 'https://audio.example.com/playing.mp3' },
        { provider: 'local', trackId: 'next', title: 'Next', artist: 'S', audio: 'https://audio.example.com/next.mp3' }
      ],
      0,
      false
    );
    await engine.selectTrackByIndex(0, true);

    expect(engine.isPlaying.value).toBe(true);
    expect(engine.currentTrack.value?.id).toBe('playing');

    engine.removeQueueItem(engine.currentTrack.value.queueEntryId);

    expect(engine.isPlaying.value).toBe(false);
    expect(engine.currentTrack.value).toBeNull();
    expect(engine.currentTrackId.value).toBe('');
    expect(engine.audioElement.src).toBe('');
    expect(engine.tracks.value.map((t) => t.id)).toEqual(['next']);
    expect(engine.tracks.value[0].sort).toBe(1);
  });

  it('clearQueue empties the queue and resets playback state', async () => {
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks(
      [
        { provider: 'local', trackId: 'a', title: 'A', artist: 'S', audio: 'https://audio.example.com/a.mp3' },
        { provider: 'local', trackId: 'b', title: 'B', artist: 'S', audio: 'https://audio.example.com/b.mp3' }
      ],
      0,
      false
    );
    await engine.selectTrackByIndex(0, true);

    engine.clearQueue();

    expect(engine.tracks.value).toEqual([]);
    expect(engine.currentTrack.value).toBeNull();
    expect(engine.currentTrackId.value).toBe('');
    expect(engine.currentTime.value).toBe(0);
    expect(engine.duration.value).toBe(0);
    expect(engine.isPlaying.value).toBe(false);
    expect(engine.lyricTimeline.value).toEqual([]);
    expect(engine.audioElement.src).toBe('');
  });

  it('exposes enqueueTrack as the tail-append alias', () => {
    const engine = usePlayerEngine();
    expect(engine.enqueueTrack).toBe(engine.appendToQueueEnd);
  });

  it('rejects unplayable tracks that cannot be lazily resolved', () => {
    const engine = usePlayerEngine();
    const appended = engine.appendToQueueEnd({ provider: 'local', trackId: 'no-audio', title: 'No audio', artist: 'S' });

    expect(appended).toBe(false);
    expect(engine.tracks.value).toEqual([]);
  });

  it('preserves queueEntryId identity across reorderTracks', () => {
    const engine = usePlayerEngine();
    engine.appendToQueueEnd({ provider: 'local', trackId: 'a', title: 'A', artist: 'S', audio: 'https://audio.example.com/a.mp3' });
    engine.appendToQueueEnd({ provider: 'local', trackId: 'b', title: 'B', artist: 'S', audio: 'https://audio.example.com/b.mp3' });
    engine.appendToQueueEnd({ provider: 'local', trackId: 'c', title: 'C', artist: 'S', audio: 'https://audio.example.com/c.mp3' });

    const idOfA = engine.tracks.value[0].queueEntryId;
    engine.reorderTracks(0, 2);

    expect(engine.tracks.value.map((t) => t.id)).toEqual(['b', 'c', 'a']);
    expect(engine.tracks.value[2].queueEntryId).toBe(idOfA);
    expect(engine.tracks.value.map((t) => t.sort)).toEqual([1, 2, 3]);
  });

  it('regenerates the entry identity when the same snapshot is appended twice', () => {
    const engine = usePlayerEngine();
    const snapshot = {
      id: 'dup',
      trackId: 'dup',
      provider: 'local',
      queueEntryId: 'queue:dup:0',
      title: 'Dup',
      artist: 'S',
      audio: 'https://audio.example.com/dup.mp3'
    };

    engine.appendToQueueEnd(snapshot);
    engine.appendToQueueEnd(snapshot);

    expect(engine.tracks.value).toHaveLength(2);
    expect(engine.tracks.value[0].queueEntryId).toBe('queue:dup:0');
    expect(engine.tracks.value[1].queueEntryId).not.toBe('queue:dup:0');
    expect(engine.tracks.value[1].queueEntryId).toMatch(/^local:dup:\d+$/);
  });
});
