import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { nextTick } from 'vue';
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

  it('exposes only available lyric modes and rejects unavailable mode switch', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/single-line.mp3',
      lyricText: '[00:01.00]only original'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      {
        provider: 'netease',
        trackId: 'single-line',
        title: 'Single',
        artist: 'Singer'
      },
      true,
      { replaceQueue: true }
    );

    expect(engine.availableLyricModes.value).toEqual(['original']);
    expect(engine.lyricRenderMode.value).toBe('original');

    engine.setLyricRenderMode('original_translation');
    expect(engine.lyricRenderMode.value).toBe('original');
  });

  it('groups Japanese original lyrics and translation on the same timeline rows', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/yoru-ni-kakeru.mp3',
      metadata: {
        lyricTracks: {
          original: '[00:01.430]沈むように溶けてゆくように\n[00:05.120]二人だけの空が広がる夜に',
          translation: '[00:01.430]像是沉溺溶化一般\n[00:05.120]在只有你我的夜空之中',
          furigana: ''
        }
      }
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      {
        provider: 'netease',
        trackId: '1409311773',
        title: '夜に駆ける',
        artist: 'YOASOBI'
      },
      true,
      { replaceQueue: true }
    );
    await nextTick();

    expect(engine.availableLyricModes.value).toContain('original_translation');
    expect(engine.lyricRenderMode.value).toBe('original_translation');
    expect(engine.lyricTimeline.value[0]).toMatchObject({
      original: '沈むように溶けてゆくように',
      translation: '像是沉溺溶化一般'
    });
  });

  it('restores the translation preference and unwraps nested English lyric payloads', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValueOnce({
      audio: 'https://audio.example.com/original-only.mp3',
      lyricText: '[00:01.00]only original'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      { provider: 'netease', trackId: 'original-only', title: 'Original', artist: 'Singer' },
      true,
      { replaceQueue: true }
    );
    await nextTick();
    expect(engine.lyricRenderMode.value).toBe('original');

    await engine.enqueueExternalTrack(
      {
        provider: 'netease',
        trackId: '451703096',
        title: 'Shape of You',
        artist: 'Ed Sheeran',
        audio: 'https://audio.example.com/shape-of-you.mp3',
        lrc: { lyric: "[00:09.480]The club isn't the best place to find a lover" },
        tlyric: { lyric: '[00:09.480]这俱乐部不是个能找到安慰的地方' }
      },
      true,
      { replaceQueue: true }
    );
    await nextTick();

    expect(engine.lyricRenderMode.value).toBe('original_translation');
    expect(engine.lyricTimeline.value[0]).toMatchObject({
      original: "The club isn't the best place to find a lover",
      translation: '这俱乐部不是个能找到安慰的地方'
    });
  });

  it('migrates the legacy forced-original state back to bilingual-by-default', async () => {
    window.localStorage.setItem(
      'shizuki.musicPlayer.v2',
      JSON.stringify({ lyricRenderMode: 'original' })
    );
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/bilingual.mp3',
      lyricText: '[00:01.00]English line',
      translationLyricText: '[00:01.00]中文翻译'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      { provider: 'netease', trackId: 'legacy-mode', title: 'Bilingual', artist: 'Singer' },
      true,
      { replaceQueue: true }
    );
    await nextTick();

    expect(engine.lyricRenderMode.value).toBe('original_translation');
    expect(JSON.parse(window.localStorage.getItem('shizuki.musicPlayer.v2'))).toMatchObject({
      lyricRenderMode: 'original_translation',
      lyricPreferenceVersion: 2
    });
  });

  it('keeps an explicit v2 original-only preference', async () => {
    window.localStorage.setItem(
      'shizuki.musicPlayer.v2',
      JSON.stringify({ lyricRenderMode: 'original', lyricPreferenceVersion: 2 })
    );
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/bilingual.mp3',
      lyricText: '[00:01.00]English line',
      translationLyricText: '[00:01.00]中文翻译'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      { provider: 'netease', trackId: 'v2-original-mode', title: 'Bilingual', artist: 'Singer' },
      true,
      { replaceQueue: true }
    );
    await nextTick();

    expect(engine.lyricRenderMode.value).toBe('original');
    expect(JSON.parse(window.localStorage.getItem('shizuki.musicPlayer.v2'))).toMatchObject({
      lyricRenderMode: 'original',
      lyricPreferenceVersion: 2
    });
  });
});
