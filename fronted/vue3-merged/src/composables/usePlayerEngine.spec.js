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

describe('usePlayerEngine lyric chain', () => {
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

  it('builds timed lyric context from resolve-playback lyricText', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/track.mp3',
      cover: 'https://cover.example.com/track.jpg',
      lyricText: '[00:01.00]line1\n[00:03.00]line2'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      {
        provider: 'netease',
        trackId: '448316816',
        title: '测试歌曲',
        artist: '测试歌手'
      },
      true,
      { replaceQueue: true }
    );

    expect(vi.mocked(resolvePlaybackTrack).mock.calls.length).toBeGreaterThanOrEqual(1);
    expect(engine.currentTrack.value?.cover).toBe('https://cover.example.com/track.jpg');
    expect(engine.currentTrack.value?.lyricText).toBe('[00:01.00]line1\n[00:03.00]line2');
    expect(engine.lyricContext.value.current).toBe('line1');
    expect(engine.lyricContext.value.next).toBe('line2');
  });

  it('falls back to line-based lyric entries when lyricText has no time tags', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/plain.mp3',
      lyricText: 'plain line 1\nplain line 2'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      {
        provider: 'kuwo',
        trackId: '168060593',
        title: 'Plain',
        artist: 'Singer'
      },
      true,
      { replaceQueue: true }
    );

    expect(vi.mocked(resolvePlaybackTrack).mock.calls.length).toBeGreaterThanOrEqual(1);
    expect(engine.lyricContext.value.current).toBe('plain line 1');
    expect(engine.lyricContext.value.next).toBe('plain line 2');
  });

  it('reads lyric text from metadata fallback field', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/meta.mp3',
      metadata: {
        lyricText: '[00:01.00]meta line 1\n[00:04.00]meta line 2'
      }
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      {
        provider: 'qq',
        trackId: 'meta-track',
        title: 'Meta',
        artist: 'Singer'
      },
      true,
      { replaceQueue: true }
    );

    expect(vi.mocked(resolvePlaybackTrack).mock.calls.length).toBeGreaterThanOrEqual(1);
    expect(engine.currentTrack.value?.lyricText).toContain('meta line 1');
    expect(engine.lyricContext.value.current).toBe('meta line 1');
  });

  it('uses snake_case lyric_text when existing lyricText is empty', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/snake.mp3',
      lyric_text: '[00:01.00]snake line 1\n[00:04.00]snake line 2'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      {
        provider: 'netease',
        trackId: 'snake-track',
        title: 'Snake',
        artist: 'Singer',
        lyricText: ''
      },
      true,
      { replaceQueue: true }
    );

    expect(vi.mocked(resolvePlaybackTrack).mock.calls.length).toBeGreaterThanOrEqual(1);
    expect(engine.currentTrack.value?.lyricText).toContain('snake line 1');
    expect(engine.lyricContext.value.current).toBe('snake line 1');
  });
});
