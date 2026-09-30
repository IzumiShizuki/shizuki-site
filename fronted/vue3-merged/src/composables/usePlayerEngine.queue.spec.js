import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { ref } from 'vue';
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
  const originalFetch = globalThis.fetch;

  beforeEach(() => {
    vi.clearAllMocks();
    globalThis.Audio = FakeAudio;
    window.localStorage.clear();
    window.sessionStorage.clear();
    vi.mocked(getPlaylistBundleByCode).mockResolvedValue({ profile: {}, tracks: [] });
  });

  afterEach(() => {
    vi.restoreAllMocks();
    globalThis.Audio = originalAudio;
    globalThis.fetch = originalFetch;
  });

  it('prepares only the next sequential queue entry without changing the active track or audio', async () => {
    vi.mocked(resolvePlaybackTrack).mockImplementation(async ({ trackId }) => ({
      audio: `https://audio.example.com/${trackId}.mp3`
    }));
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'netease', trackId: 'current', title: 'Current', artist: 'Singer' },
      { provider: 'netease', trackId: 'next', title: 'Next', artist: 'Singer' },
      { provider: 'netease', trackId: 'later', title: 'Later', artist: 'Singer' }
    ], 0, true);

    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'next', resolveLyric: false }),
      undefined
    ));
    expect(resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'next')).toHaveLength(1);
    expect(engine.currentTrack.value?.trackId).toBe('current');
    expect(engine.audioElement.src).toBe('https://audio.example.com/current.mp3');
    expect(engine.tracks.value.find((track) => track.trackId === 'next')?.audio).toBe('');
  });

  it('refreshes and reuses an already populated next-track audio URL', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/next-refreshed.mp3'
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'local', trackId: 'current', title: 'Current', artist: 'Singer', audio: 'https://audio.example.com/current.mp3', lyricText: '[00:01.00]current line' },
      { provider: 'netease', trackId: 'next', title: 'Next', artist: 'Singer', audio: 'https://audio.example.com/next-stale.mp3', lyricText: '[00:01.00]next line' }
    ], 0, true);
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'next', resolveLyric: false, forceRefresh: true }), undefined
    ));
    const callsAfterPrepare = resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'next').length;

    await engine.selectTrackByIndex(1, true);

    expect(resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'next')).toHaveLength(callsAfterPrepare);
    expect(engine.audioElement.src).toBe('https://audio.example.com/next-refreshed.mp3');
    expect(engine.currentTrack.value?.trackId).toBe('next');

    await engine.selectTrackByIndex(1, true, { bypassCache: true });
    expect(resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'next')).toHaveLength(callsAfterPrepare + 1);
    expect(resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'next').at(-1)[0]).toMatchObject({
      resolveLyric: true,
      forceRefresh: true
    });
  });

  it('refreshes an expired preparation once near the end and consumes the fresh result', async () => {
    let now = 1_000;
    vi.spyOn(Date, 'now').mockImplementation(() => now);
    vi.mocked(resolvePlaybackTrack).mockImplementation((payload) => {
      if (payload.trackId !== 'next') return Promise.resolve({});
      const count = resolvePlaybackTrack.mock.calls.filter(([request]) => request.trackId === 'next').length;
      return Promise.resolve({
        audio: count === 1
          ? 'https://audio.example.com/next-initial.mp3'
          : 'https://audio.example.com/next-fresh.mp3'
      });
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'local', trackId: 'current', title: 'Current', artist: 'Singer', audio: 'https://audio.example.com/current.mp3' },
      { provider: 'netease', trackId: 'next', title: 'Next', artist: 'Singer', audio: 'https://audio.example.com/next-old.mp3', lyricText: '[00:01.00]next line' }
    ], 0, true);
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'next', resolveLyric: false, forceRefresh: true }), undefined
    ));
    expect(resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'next')).toHaveLength(1);

    now += 31_000;
    engine.duration.value = 254;
    engine.currentTime.value = 235;
    await vi.waitFor(() => expect(resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'next')).toHaveLength(2));

    await engine.selectTrackByIndex(1, true);

    expect(engine.audioElement.src).toBe('https://audio.example.com/next-fresh.mp3');
    expect(resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'next')).toHaveLength(2);
  });

  it('does not resolve a next entry while the current queue is paused', async () => {
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'local', trackId: 'current', title: 'Current', artist: 'Singer', audio: 'https://audio.example.com/current.mp3' },
      { provider: 'netease', trackId: 'next', title: 'Next', artist: 'Singer' }
    ], 0, false);
    await new Promise((resolve) => setTimeout(resolve, 0));

    expect(resolvePlaybackTrack).not.toHaveBeenCalled();
    expect(engine.isPlaying.value).toBe(false);
  });

  it('prepares the wrapped first entry after the sequential tail', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/first-refreshed.mp3'
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'netease', trackId: 'first', title: 'First', artist: 'Singer', audio: 'https://audio.example.com/first-old.mp3', lyricText: '[00:01.00]first line' },
      { provider: 'local', trackId: 'tail', title: 'Tail', artist: 'Singer', audio: 'https://audio.example.com/tail.mp3', lyricText: '[00:01.00]tail line' }
    ], 1, true);
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'first', resolveLyric: false, forceRefresh: true }), undefined
    ));
  });

  it('discards a late resolver result after rapid A then B selection', async () => {
    let finishA;
    let firstAResolution = true;
    vi.mocked(resolvePlaybackTrack).mockImplementation(({ trackId }) => {
      if (trackId === 'A' && firstAResolution) {
        firstAResolution = false;
        return new Promise((resolve) => { finishA = resolve; });
      }
      return Promise.resolve({ audio: 'https://audio.example.com/B.mp3' });
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'netease', trackId: 'A', title: 'A', artist: 'Singer' },
      { provider: 'local', trackId: 'B', title: 'B', artist: 'Singer', audio: 'https://audio.example.com/B-old.mp3' },
      { provider: 'local', trackId: 'C', title: 'C', artist: 'Singer', audio: 'https://audio.example.com/C.mp3' }
    ], 2, false);

    const selectA = engine.selectTrackByIndex(0, true);
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'A' }), undefined
    ));
    await engine.selectTrackByIndex(1, true);
    finishA({ audio: 'https://audio.example.com/A.mp3' });
    await selectA;

    expect(engine.currentTrack.value?.trackId).toBe('B');
    expect(engine.audioElement.src).toBe('https://audio.example.com/B-old.mp3');
  });

  it('resolves lyric fallback by queue entry after reordering during playback resolution', async () => {
    let finishA;
    vi.mocked(resolvePlaybackTrack).mockImplementation(({ trackId }) => {
      if (trackId === 'A' && !finishA) return new Promise((resolve) => { finishA = resolve; });
      return Promise.resolve({ lyricText: `[00:01.00]${trackId} lyric` });
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'netease', trackId: 'A', title: 'A', artist: 'Singer', audio: 'https://audio.example.com/A-old.mp3' },
      { provider: 'netease', trackId: 'B', title: 'B', artist: 'Singer', audio: 'https://audio.example.com/B.mp3', lyricText: '[00:01.00]B lyric' }
    ], 1, false);

    const selectA = engine.selectTrackByIndex(0, true);
    await vi.waitFor(() => expect(finishA).toBeTypeOf('function'));
    engine.reorderTracks(0, 1);
    finishA({ audio: 'https://audio.example.com/A-fresh.mp3' });
    await selectA;

    expect(resolvePlaybackTrack.mock.calls
      .filter(([payload]) => payload.resolveLyric === true)
      .map(([payload]) => payload.trackId)).toEqual(['A', 'A']);
    expect(engine.currentTrack.value?.trackId).toBe('A');
    expect(engine.lyricContext.value.current).toBe('A lyric');
  });

  it('does not let an old toggle-play rejection clear the newer track playback state', async () => {
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'local', trackId: 'A', title: 'A', artist: 'Singer', audio: 'https://audio.example.com/A.mp3', lyricText: '[00:01.00]A lyric' },
      { provider: 'local', trackId: 'B', title: 'B', artist: 'Singer', audio: 'https://audio.example.com/B.mp3', lyricText: '[00:01.00]B lyric' }
    ], 0, true);
    engine.audioElement.pause();
    let rejectAPlay;
    const normalPlay = engine.audioElement.play.bind(engine.audioElement);
    engine.audioElement.play = vi.fn(() => engine.audioElement.src.endsWith('/A.mp3')
      ? new Promise((resolve, reject) => { rejectAPlay = reject; })
      : normalPlay());

    const toggleA = engine.togglePlay();
    await vi.waitFor(() => expect(rejectAPlay).toBeTypeOf('function'));
    await engine.selectTrackByIndex(1, true);
    rejectAPlay(new Error('old play rejected'));
    await toggleA;

    expect(engine.currentTrack.value?.trackId).toBe('B');
    expect(engine.isPlaying.value).toBe(true);
  });

  it('does not let a stale recovery-play rejection stop the newer track', async () => {
    let aResolveCount = 0;
    vi.mocked(resolvePlaybackTrack).mockImplementation(({ trackId }) => {
      if (trackId === 'A') {
        aResolveCount += 1;
        return Promise.resolve({
          audio: aResolveCount === 1
            ? 'https://audio.example.com/A-initial.mp3'
            : 'https://audio.example.com/A-recovered.mp3',
          lyricText: '[00:01.00]A lyric'
        });
      }
      return Promise.resolve({});
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'netease', trackId: 'A', title: 'A', artist: 'Singer', audio: 'https://audio.example.com/A-old.mp3', lyricText: '[00:01.00]A lyric' },
      { provider: 'local', trackId: 'B', title: 'B', artist: 'Singer', audio: 'https://audio.example.com/B.mp3', lyricText: '[00:01.00]B lyric' }
    ], 0, true);
    let rejectRecoveryPlay;
    const normalPlay = engine.audioElement.play.bind(engine.audioElement);
    engine.audioElement.play = vi.fn(() => engine.audioElement.src.endsWith('/A-recovered.mp3')
      ? new Promise((resolve, reject) => { rejectRecoveryPlay = reject; })
      : normalPlay());

    engine.audioElement._emit('error');
    await vi.waitFor(() => expect(rejectRecoveryPlay).toBeTypeOf('function'));
    await engine.selectTrackByIndex(1, true);
    rejectRecoveryPlay(new Error('recovery play rejected'));
    await vi.waitFor(() => expect(engine.currentTrack.value?.trackId).toBe('B'));
    await new Promise((resolve) => setTimeout(resolve, 0));

    expect(engine.audioElement.src).toBe('https://audio.example.com/B.mp3');
    expect(engine.isPlaying.value).toBe(true);
  });

  it('prepares the next entry in randomized playback order', async () => {
    vi.spyOn(Math, 'random').mockReturnValue(0);
    vi.mocked(resolvePlaybackTrack).mockImplementation(async ({ trackId }) => ({
      audio: `https://audio.example.com/${trackId}.mp3`
    }));
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks(['first', 'second', 'third'].map((trackId) => ({
      provider: 'netease', trackId, title: trackId, artist: 'Singer'
    })), 0, true);

    const expectedNext = engine.queueDisplayTracks.value.find((track) => track.id !== engine.currentTrack.value?.id)?.trackId;
    await vi.waitFor(() => expect(resolvePlaybackTrack.mock.calls.some(
      ([payload]) => payload.trackId === expectedNext && payload.resolveLyric === false
    )).toBe(true));
    expect(expectedNext).toBeTruthy();
  });

  it('does not prepare another track in single-track mode', async () => {
    window.localStorage.setItem('shizuki.musicPlayer.v2', JSON.stringify({ playMode: 'single' }));
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'netease', trackId: 'current', title: 'Current', artist: 'Singer', audio: 'https://audio.example.com/current.mp3' },
      { provider: 'netease', trackId: 'next', title: 'Next', artist: 'Singer' }
    ], 0, true);
    await new Promise((resolve) => setTimeout(resolve, 0));

    expect(resolvePlaybackTrack.mock.calls.some(([payload]) => payload.trackId === 'next')).toBe(false);
    expect(resolvePlaybackTrack.mock.calls.some(([payload]) => payload.resolveLyric === false)).toBe(false);
    expect(engine.currentTrack.value?.trackId).toBe('current');
  });

  it('drops stale prepared data when its authorization context changes', async () => {
    let finishAccountA;
    const accountA = vi.fn();
    const accountB = vi.fn();
    const account = ref('a');
    const engine = usePlayerEngine({
      getAuthorizedFetch: () => account.value === 'a' ? accountA : accountB,
      getPlaybackAuthorizationKey: () => `account:${account.value}`
    });
    vi.mocked(resolvePlaybackTrack).mockImplementation((payload, authorizedFetch) => {
      if (payload.trackId === 'next' && authorizedFetch === accountA) {
        return new Promise((resolve) => { finishAccountA = resolve; });
      }
      return Promise.resolve({ audio: 'https://audio.example.com/account-b-next.mp3' });
    });
    await engine.replaceQueueWithTracks([
      { provider: 'local', trackId: 'current', title: 'Current', artist: 'Singer', audio: 'https://audio.example.com/current.mp3' },
      { provider: 'netease', trackId: 'next', title: 'Next', artist: 'Singer' }
    ], 0, true);
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'next', resolveLyric: false }), accountA
    ));

    account.value = 'b';
    finishAccountA({ audio: 'https://audio.example.com/account-a-stale.mp3' });
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'next', resolveLyric: false }), accountB
    ));
    await vi.waitFor(() => expect(engine.tracks.value.find((track) => track.trackId === 'next')?.audio).toBe(''));
    await engine.selectTrackByIndex(1, true);

    expect(engine.audioElement.src).toBe('https://audio.example.com/account-b-next.mp3');
    expect(engine.currentTrack.value?.trackId).toBe('next');
  });

  it('does not apply a foreground resolution after its authorization context changes', async () => {
    let finishAccountA;
    const accountA = vi.fn();
    const accountB = vi.fn();
    const account = ref('a');
    const engine = usePlayerEngine({
      getAuthorizedFetch: () => account.value === 'a' ? accountA : accountB,
      getPlaybackAuthorizationKey: () => `account:${account.value}`
    });
    vi.mocked(resolvePlaybackTrack).mockImplementation(() => new Promise((resolve) => { finishAccountA = resolve; }));
    await engine.replaceQueueWithTracks([
      { provider: 'netease', trackId: 'A', title: 'A', artist: 'Singer' },
      { provider: 'local', trackId: 'B', title: 'B', artist: 'Singer', audio: 'https://audio.example.com/B.mp3', lyricText: '[00:01.00]B lyric' }
    ], 1, false);

    const selectionA = engine.selectTrackByIndex(0, true);
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'A', resolveLyric: true }), accountA
    ));
    account.value = 'b';
    finishAccountA({ audio: 'https://audio.example.com/account-a-A.mp3', lyricText: '[00:01.00]A lyric' });
    await selectionA;

    expect(engine.currentTrack.value?.trackId).toBe('B');
    expect(engine.audioElement.src).toBe('https://audio.example.com/B.mp3');
    expect(engine.tracks.value.find((track) => track.trackId === 'A')?.audio).toBe('');
    expect(engine.lyricContext.value.current).toBe('B lyric');
  });

  it('ignores a prepared result for a queue entry removed while resolving', async () => {
    let finishOld;
    vi.mocked(resolvePlaybackTrack).mockImplementation(({ trackId }) => {
      if (trackId === 'old-next') return new Promise((resolve) => { finishOld = resolve; });
      return Promise.resolve({ audio: `https://audio.example.com/${trackId}.mp3` });
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'local', trackId: 'current', title: 'Current', artist: 'Singer', audio: 'https://audio.example.com/current.mp3' },
      { provider: 'netease', trackId: 'old-next', title: 'Old next', artist: 'Singer' }
    ], 0, true);
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'old-next', resolveLyric: false }), undefined
    ));

    await engine.replaceQueueWithTracks([
      { provider: 'local', trackId: 'replacement-current', title: 'Current', artist: 'Singer', audio: 'https://audio.example.com/replacement-current.mp3' },
      { provider: 'netease', trackId: 'replacement-next', title: 'New next', artist: 'Singer' }
    ], 0, true);
    finishOld({ audio: 'https://audio.example.com/removed-entry.mp3' });
    await vi.waitFor(() => expect(resolvePlaybackTrack).toHaveBeenCalledWith(
      expect.objectContaining({ trackId: 'replacement-next', resolveLyric: false }), undefined
    ));

    expect(engine.currentTrack.value?.trackId).toBe('replacement-current');
    expect(engine.audioElement.src).toBe('https://audio.example.com/replacement-current.mp3');
    expect(engine.tracks.value.map((track) => track.audio)).toEqual([
      'https://audio.example.com/replacement-current.mp3', ''
    ]);
  });

  it('keeps the newer lyric timeline when the previous track lyric request resolves late', async () => {
    let finishA;
    globalThis.fetch = vi.fn((url) => {
      if (String(url).endsWith('/a.lrc')) {
        return new Promise((resolve) => { finishA = resolve; });
      }
      return Promise.resolve({ ok: true, text: async () => '[00:01.00]B lyric' });
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'local', trackId: 'A', title: 'A', artist: 'Singer', audio: 'https://audio.example.com/A.mp3', lyric: 'https://lyrics.example.com/a.lrc' },
      { provider: 'local', trackId: 'B', title: 'B', artist: 'Singer', audio: 'https://audio.example.com/B.mp3', lyric: 'https://lyrics.example.com/b.lrc' }
    ], 1, false);

    const selectA = engine.selectTrackByIndex(0, true);
    await vi.waitFor(() => expect(finishA).toBeTypeOf('function'));
    await engine.selectTrackByIndex(1, true);
    finishA({ ok: true, text: async () => '[00:01.00]A lyric' });
    await selectA;

    expect(engine.currentTrack.value?.trackId).toBe('B');
    expect(engine.lyricContext.value.current).toBe('B lyric');
  });

  it('does not run stale playback recovery after a newer track is selected', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/A-resolved.mp3',
      lyricText: '[00:01.00]A lyric'
    });
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks([
      { provider: 'netease', trackId: 'A', title: 'A', artist: 'Singer', lyricText: '[00:01.00]A lyric' },
      { provider: 'local', trackId: 'B', title: 'B', artist: 'Singer', audio: 'https://audio.example.com/B.mp3', lyricText: '[00:01.00]B lyric' }
    ], 1, false);
    let rejectAPlay;
    const normalPlay = engine.audioElement.play.bind(engine.audioElement);
    engine.audioElement.play = vi.fn(() => engine.audioElement.src.includes('/A-resolved.mp3')
      ? new Promise((resolve, reject) => { rejectAPlay = reject; })
      : normalPlay());

    const selectA = engine.selectTrackByIndex(0, true);
    await vi.waitFor(() => expect(rejectAPlay).toBeTypeOf('function'));
    await engine.selectTrackByIndex(1, true);
    rejectAPlay(new Error('stale play rejected'));
    await selectA;

    expect(engine.currentTrack.value?.trackId).toBe('B');
    expect(engine.audioElement.src).toBe('https://audio.example.com/B.mp3');
    expect(resolvePlaybackTrack.mock.calls.filter(([payload]) => payload.trackId === 'A' && payload.resolveLyric === true)).toHaveLength(1);
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

  it('exposes the randomized playback sequence in the queue display order', async () => {
    vi.spyOn(Math, 'random').mockReturnValue(0);
    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks(
      ['a', 'b', 'c', 'd'].map((id) => ({
        provider: 'local',
        trackId: id,
        title: id.toUpperCase(),
        artist: 'Singer',
        audio: `https://audio.example.com/${id}.mp3`
      })),
      0,
      false
    );

    engine.playMode.value = 'random';

    expect(engine.queueDisplayTracks.value.map((track) => track.id)).toEqual(['a', 'c', 'd', 'b']);
    const displayedEntryIds = engine.queueDisplayTracks.value.map((track) => track.queueEntryId);
    expect(new Set(displayedEntryIds).size).toBe(4);
    expect([...displayedEntryIds].sort()).toEqual(engine.tracks.value.map((track) => track.queueEntryId).sort());
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
