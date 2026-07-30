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

  it('refreshes a cached provider audio URL before replaying a previously heard track', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/fresh-signed-track.mp3'
    });

    const engine = usePlayerEngine();
    const played = await engine.replaceQueueWithTracks(
      [
        {
          provider: 'netease',
          trackId: 'cached-track',
          title: 'Previously heard',
          artist: 'Singer',
          audio: 'https://audio.example.com/expired-signed-track.mp3',
          lyricText: '[00:01.00]cached lyric'
        }
      ],
      0,
      true
    );

    expect(played).toBe(true);
    expect(resolvePlaybackTrack).toHaveBeenCalledTimes(1);
    expect(engine.audioElement.src).toBe('https://audio.example.com/fresh-signed-track.mp3');
    expect(engine.currentTrack.value?.lyricText).toBe('[00:01.00]cached lyric');
  });

  it('bypasses the server cache when a resolved audio URL emits an error', async () => {
    vi.mocked(resolvePlaybackTrack)
      .mockResolvedValueOnce({
        audio: 'https://audio.example.com/still-expired.mp3',
        lyricText: '[00:01.00]line'
      })
      .mockResolvedValueOnce({
        audio: 'https://audio.example.com/recovered.mp3'
      });

    const engine = usePlayerEngine();
    await engine.replaceQueueWithTracks(
      [
        {
          provider: 'netease',
          trackId: 'expired-after-resolve',
          title: 'Expired after resolve',
          artist: 'Singer',
          audio: 'https://audio.example.com/expired.mp3'
        }
      ],
      0,
      true
    );

    const callsBeforeError = resolvePlaybackTrack.mock.calls.length;
    engine.audioElement._emit('error');

    await vi.waitFor(() => expect(resolvePlaybackTrack.mock.calls.length).toBe(callsBeforeError + 1));
    expect(resolvePlaybackTrack.mock.calls.at(-1)[0]).toMatchObject({
      provider: 'netease',
      trackId: 'expired-after-resolve',
      forceRefresh: true
    });
    await vi.waitFor(() => {
      expect(engine.audioElement.src).toBe('https://audio.example.com/recovered.mp3');
    });
  });

  it('bypasses the server cache when audio play rejects before an error event', async () => {
    vi.mocked(resolvePlaybackTrack)
      .mockResolvedValueOnce({
        audio: 'https://audio.example.com/still-expired.mp3',
        lyricText: '[00:01.00]line'
      })
      .mockResolvedValueOnce({
        audio: 'https://audio.example.com/recovered-after-rejection.mp3'
      });

    const engine = usePlayerEngine();
    engine.audioElement.play = vi.fn()
      .mockRejectedValueOnce(new Error('Media source is not supported'))
      .mockResolvedValueOnce(undefined);

    const played = await engine.replaceQueueWithTracks(
      [
        {
          provider: 'netease',
          trackId: 'rejected-playback',
          title: 'Rejected playback',
          artist: 'Singer',
          audio: 'https://audio.example.com/expired.mp3'
        }
      ],
      0,
      true
    );

    expect(played).toBe(true);
    expect(resolvePlaybackTrack.mock.calls.at(-1)[0]).toMatchObject({
      trackId: 'rejected-playback',
      forceRefresh: true
    });
    expect(engine.audioElement.src).toBe('https://audio.example.com/recovered-after-rejection.mp3');
    expect(engine.audioElement.play).toHaveBeenCalledTimes(2);
  });

  it('synchronizes playback position and active lyrics immediately after seeking', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/seek.mp3',
      lyricText: '[00:01.00]line1\n[00:05.00]line2'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      {
        provider: 'netease',
        trackId: 'seek-track',
        title: 'Seek',
        artist: 'Singer'
      },
      true,
      { replaceQueue: true }
    );

    engine.seekToTime(5.2);

    expect(engine.audioElement.currentTime).toBe(5.2);
    expect(engine.currentTime.value).toBe(5.2);
    expect(engine.currentLyricEntryIndex.value).toBe(1);
    expect(engine.currentLyricLine.value).toBe('line2');

    engine.seekToPercent(0.5);

    expect(engine.audioElement.currentTime).toBe(90);
    expect(engine.currentTime.value).toBe(90);
  });

  it('refreshes an initially infinite duration when the media becomes finite', () => {
    const engine = usePlayerEngine();

    engine.audioElement.duration = Number.POSITIVE_INFINITY;
    engine.audioElement._emit('loadedmetadata');
    expect(engine.duration.value).toBe(0);

    engine.audioElement.duration = 245;
    engine.audioElement._emit('durationchange');
    expect(engine.duration.value).toBe(245);

    engine.audioElement.duration = 246;
    engine.audioElement._emit('canplay');
    expect(engine.duration.value).toBe(246);
  });

  it('marks a short resolved media source as a preview without losing the full track duration', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/preview.mp3',
      lyricText: '[00:01.00]line1\n[01:00.00]line2'
    });

    const engine = usePlayerEngine();
    await engine.enqueueExternalTrack(
      {
        provider: 'netease',
        trackId: 'preview-track',
        title: 'Preview',
        artist: 'Singer',
        durationSec: 240,
        durationLabel: '04:00'
      },
      true,
      { replaceQueue: true }
    );

    engine.audioElement.duration = 30;
    engine.audioElement._emit('durationchange');

    expect(engine.duration.value).toBe(30);
    expect(engine.expectedDuration.value).toBe(240);
    expect(engine.isPreviewPlayback.value).toBe(true);
    expect(engine.currentTrack.value?.playableDurationSec).toBe(30);
    expect(engine.currentTrack.value?.durationLabel).toBe('04:00');
  });

  it('preserves duration and preview metadata when enqueuing the next track', async () => {
    const engine = usePlayerEngine();

    await engine.enqueueNextTrack({
      provider: 'netease',
      trackId: 'queued-duration-seconds',
      title: 'Duration Seconds',
      artist: 'Singer',
      audio: 'https://audio.example.com/duration-seconds.mp3',
      durationSec: 258,
      durationLabel: '04:18',
      playbackKind: 'preview'
    });
    await engine.enqueueNextTrack({
      provider: 'netease',
      trackId: 'queued-duration-milliseconds',
      title: 'Duration Milliseconds',
      artist: 'Singer',
      audio: 'https://audio.example.com/duration-milliseconds.mp3',
      durationMs: 248000,
      duration: '04:08 catalog',
      playbackKind: 'full',
      isPreview: true
    });

    expect(engine.tracks.value).toHaveLength(2);
    expect(engine.tracks.value[0]).toMatchObject({
      durationSec: 258,
      durationLabel: '04:18',
      playbackKind: 'preview',
      isPreview: true
    });
    expect(engine.tracks.value[1]).toMatchObject({
      durationSec: 248,
      durationLabel: '04:08 catalog',
      playbackKind: 'preview',
      isPreview: true
    });
  });

  it('recognizes a short preview when timed lyrics extend beyond media without catalog duration', async () => {
    vi.mocked(resolvePlaybackTrack).mockResolvedValue({
      audio: 'https://audio.example.com/preview-without-duration.mp3',
      lyricText: '[00:01.00]line1\n[01:00.00]line2'
    });

    const engine = usePlayerEngine();
    engine.audioElement.duration = 30;
    await engine.enqueueExternalTrack(
      {
        provider: 'netease',
        trackId: 'preview-without-duration',
        title: 'Preview',
        artist: 'Singer'
      },
      true,
      { replaceQueue: true }
    );

    expect(engine.duration.value).toBe(30);
    expect(engine.expectedDuration.value).toBe(30);
    expect(engine.lyricTimeline.value.at(-1)?.time).toBe(60);
    expect(engine.isPreviewPlayback.value).toBe(true);
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
