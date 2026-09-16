/**
 * shizuki-external-bridge.ts
 *
 * Shizuki-site external control bridge for the Folia (AGPL-3.0) music player.
 *
 * This file is a small, self-contained addition to the upstream Folia project
 * that lets the surrounding Shizuki website control the Folia player that is
 * embedded in an iframe on the same origin. It adds ONLY a window `message`
 * listener and two one-shot helpers; it does not modify any upstream business
 * logic. The upstream Folia player is AGPL-3.0; this bridge is distributed
 * with it and is therefore available under the same license. Source of this
 * bridge: https://gist.github.com/IzumiShizuki/folia-shizuki-bridge (public).
 *
 * Protocol (window.postMessage to the iframe):
 *
 *   { type: 'shizuki:sync-cookie', cookie: string }
 *     Writes the NetEase session cookie into localStorage so every upstream
 *     `fetchWithCreds` request carries it (key `netease_cookie`, the same key
 *     the upstream Folia login flow uses). No-op if `cookie` is empty.
 *
 *   { type: 'shizuki:play-track', trackId: number, trackName?: string }
 *     Resolves the NetEase song by id, fetches a playable audio URL via the
 *     configured NetEase API base and starts playback through the upstream
 *     playback store. Replies with a `shizuki:play-result` message:
 *     { type: 'shizuki:play-result', ok: boolean, error?: string, track?: {...} }
 *
 *   { type: 'shizuki:get-status' }
 *     Replies with the current playback snapshot:
 *     { type: 'shizuki:status', track?: { id, name, artists, coverUrl, durationMs },
 *       positionMs: number, playing: boolean, src?: string }
 *
 *   { type: 'shizuki:playback-intent', track, positionMs, playing }
 *     Sent when a user chooses another track inside Folia while it is following
 *     the Shizuki player. The parent resolves and plays that track with its
 *     single audio element, then pushes the resulting snapshot back here.
 */

import { neteaseApi } from './services/netease';
import { usePlaybackStore } from './stores/usePlaybackStore';
import { findLatestActiveLineIndex } from './utils/appPlaybackHelpers';
import type { SongResult } from './types';

const COOKIE_STORAGE_KEY = 'netease_cookie';
let followPlaybackActive = false;
let followClockFrame = 0;
let followClockPositionSec = 0;
let followClockStartedAt = 0;
let followClockPlaying = false;
let suppressPlaybackCommandsUntil = 0;

function readFollowSong(rawTrack: Record<string, unknown>): SongResult | null {
  const id = Number(rawTrack.id ?? rawTrack.trackId ?? rawTrack.track_id);
  if (!Number.isFinite(id) || id <= 0) return null;
  const rawArtists = Array.isArray(rawTrack.artists) ? rawTrack.artists : [];
  const artistText = String(rawTrack.artist || '').trim();
  const artists = rawArtists.length
    ? rawArtists
    : artistText.split(/\s*[/,&]\s*/).filter(Boolean).map((name) => ({ name }));
  const rawAlbum = rawTrack.album && typeof rawTrack.album === 'object'
    ? rawTrack.album as Record<string, unknown>
    : {};
  const durationMs = Number(
    rawTrack.durationMs
      ?? rawTrack.duration_ms
      ?? (Number(rawTrack.durationSec ?? rawTrack.duration_sec ?? rawTrack.duration) || 0) * 1000,
  );
  return {
    ...rawTrack,
    id,
    name: String(rawTrack.name || rawTrack.title || ''),
    artists,
    album: {
      ...rawAlbum,
      picUrl: String(
        rawAlbum.picUrl
          || rawTrack.cover
          || rawTrack.coverUrl
          || rawTrack.cover_url
          || '',
      ),
    },
    durationMs: Number.isFinite(durationMs) ? durationMs : 0,
  } as unknown as SongResult;
}

function writeFollowClock(positionSec: number): void {
  const safePosition = Math.max(0, Number(positionSec) || 0);
  try {
    const clock = (window as unknown as { __folia_current_time?: { set(v: number): void } }).__folia_current_time;
    clock?.set(safePosition);
    const store = usePlaybackStore.getState();
    const lines = store.lyrics?.lines || [];
    if (lines.length) {
      const index = findLatestActiveLineIndex(lines, safePosition);
      if (index !== store.currentLineIndex) store.setCurrentLineIndex(index);
    }
  } catch {
    // ignore clock projection failures
  }
}

function runFollowClockFrame(now: number): void {
  followClockFrame = 0;
  if (!followPlaybackActive) return;
  const elapsedSec = followClockPlaying ? Math.max(0, now - followClockStartedAt) / 1000 : 0;
  writeFollowClock(followClockPositionSec + elapsedSec);
  if (followClockPlaying) {
    followClockFrame = window.requestAnimationFrame(runFollowClockFrame);
  }
}

function syncFollowClock(positionMs: number, playing: boolean): void {
  followClockPositionSec = Math.max(0, Number(positionMs) || 0) / 1000;
  followClockStartedAt = performance.now();
  followClockPlaying = playing;
  if (followClockFrame) window.cancelAnimationFrame(followClockFrame);
  followClockFrame = 0;
  writeFollowClock(followClockPositionSec);
  if (followPlaybackActive && followClockPlaying) {
    followClockFrame = window.requestAnimationFrame(runFollowClockFrame);
  }
}

function stopFollowPlayback(): void {
  followPlaybackActive = false;
  followClockPlaying = false;
  if (followClockFrame) window.cancelAnimationFrame(followClockFrame);
  followClockFrame = 0;
  suppressPlaybackCommandsUntil = performance.now() + 300;
  try {
    usePlaybackStore.getState().setPlayerState('PAUSED');
  } catch {
    // ignore
  }
}

function readCookieFromStorage(): string {
  try {
    return window.localStorage.getItem(COOKIE_STORAGE_KEY) || '';
  } catch {
    return '';
  }
}

function writeCookieToStorage(cookie: string): void {
  if (!cookie) return;
  try {
    window.localStorage.setItem(COOKIE_STORAGE_KEY, cookie);
  } catch {
    // ignore storage failures
  }
}

function postToParent(payload: Record<string, unknown>): void {
  try {
    window.parent.postMessage(payload, '*');
  } catch {
    // ignore
  }
}

/** Resolve one NetEase song id to an upstream SongResult plus its audio URL. */
async function resolveTrack(trackId: number): Promise<{ song: unknown; audioUrl: string; name: string }> {
  const normalizedId = Number(trackId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('invalid track id');
  }
  const [detailPayload, urlPayload] = await Promise.all([
    neteaseApi.getSongDetail(normalizedId),
    neteaseApi.getSongUrl(normalizedId, 'exhigh'),
  ]);
  const song = detailPayload?.songs?.[0];
  if (!song) {
    throw new Error('song detail not found');
  }
  const url = String(urlPayload?.data?.[0]?.url || '');
  if (!url) {
    throw new Error('no playable audio url (VIP or region-restricted)');
  }
  const name = String(song?.name || '');
  return { song, audioUrl: url, name };
}

/** Play a NetEase track through the upstream playback store. */
async function playTrack(trackId: number, positionMs?: number): Promise<void> {
  stopFollowPlayback();
  const { song, audioUrl, name } = await resolveTrack(trackId);
  const normalized = (neteaseApi.normalizeSongResult
    ? neteaseApi.normalizeSongResult(song)
    : song) as SongResult;
  const store = usePlaybackStore.getState();
  store.setCurrentSong(normalized);
  store.setPlayQueue([normalized]);
  store.setAudioSrc(audioUrl);
  void name;
  // 加载歌词并写入 store（桥直接播放绕过了 Folia 的歌词加载流程，
  // 这里主动补齐，保证沉浸歌词有精确时间戳而非 fallback）。
  void loadLyricsForTrack(normalized);
  // 无缝续播：音频就绪后 seek 到指定位置（毫秒）。轮询重试直到 duration 就绪
  // （VIP 歌加载慢，单次定时器会错过）。
  if (positionMs != null && Number.isFinite(positionMs) && positionMs > 0) {
    const targetSec = positionMs / 1000;
    const applySeek = () => {
      try {
        const audio = document.querySelector('audio');
        if (audio && Number.isFinite(audio.duration) && audio.duration > 0 && !audio.paused) {
          audio.currentTime = Math.min(targetSec, Math.max(0, audio.duration - 0.5));
          const clock = (window as unknown as { __folia_current_time?: { set(v: number): void } }).__folia_current_time;
          clock?.set(audio.currentTime);
          return true;
        }
        return false;
      } catch {
        return true; // 不再重试，避免死循环
      }
    };
    let attempts = 0;
    const seekTimer = window.setInterval(() => {
      attempts += 1;
      if (applySeek() || attempts > 40) {
        window.clearInterval(seekTimer);
      }
    }, 300);
    // 首次 800ms 后开始探测（给音频加载时间）
    window.setTimeout(() => {
      if (applySeek()) window.clearInterval(seekTimer);
    }, 800);
  }
}

/** 拉取网易云歌词（带时间戳）并写入 playback store，供沉浸歌词精确渲染。 */
async function loadLyricsForTrack(song: SongResult): Promise<void> {
  try {
    const id = Number(song.id);
    if (!Number.isFinite(id) || id <= 0) return;
    const response = await neteaseApi.getLyric(id);
    const payload = typeof neteaseApi.getProcessedLyricPayload === 'function'
      ? neteaseApi.getProcessedLyricPayload(response)
      : response;
    const { processNeteaseLyrics } = await import('./utils/lyrics/neteaseProcessing');
    const processed = await processNeteaseLyrics(payload);
    if (processed.lyrics) {
      const store = usePlaybackStore.getState();
      store.setLyricsState(processed.lyrics);
    }
  } catch {
    // 歌词加载失败不影响播放
  }
}

/** Play a list of NetEase track ids as a queue (first starts, rest enqueued). */
async function playTracks(trackIds: number[]): Promise<{ played: number; failed: number }> {
  stopFollowPlayback();
  const ids = (Array.isArray(trackIds) ? trackIds : [])
    .map((id) => Number(id))
    .filter((id) => Number.isFinite(id) && id > 0);
  if (ids.length === 0) {
    throw new Error('empty track list');
  }
  let played = 0;
  let failed = 0;
  for (let index = 0; index < ids.length; index += 1) {
    const id = ids[index];
    try {
      const { song, audioUrl } = await resolveTrack(id);
      const normalized = (neteaseApi.normalizeSongResult
        ? neteaseApi.normalizeSongResult(song)
        : song) as SongResult;
      const store = usePlaybackStore.getState();
      if (index === 0) {
        store.setCurrentSong(normalized);
        store.setPlayQueue(ids.map(() => normalized));
        store.setAudioSrc(audioUrl);
      } else {
        // 后续曲目简化处理：仅构建队列（Folia 队列 API 较复杂，先保证第一首可播）
        const queue = usePlaybackStore.getState().playQueue;
        store.setPlayQueue([...queue, normalized]);
      }
      played += 1;
    } catch {
      failed += 1;
    }
  }
  return { played, failed };
}

function snapshotStatus(): Record<string, unknown> {
  const state = usePlaybackStore.getState();
  const song = state.currentSong as (Record<string, unknown> & {
    name?: string;
    artists?: Array<{ name?: string }>;
    album?: { picUrl?: string };
    durationMs?: number;
    id?: unknown;
  }) | null;
  const artists = Array.isArray(song?.artists)
    ? song.artists.map((artist) => String(artist?.name || '')).filter(Boolean)
    : [];
  // Folia exposes its live playback clock on window.__folia_current_time (a motion value).
  let positionMs = 0;
  try {
    const clock = (window as unknown as { __folia_current_time?: { get(): number } }).__folia_current_time;
    if (clock && typeof clock.get === 'function') {
      positionMs = Math.max(0, Math.round(Number(clock.get() || 0) * 1000));
    }
  } catch {
    // ignore
  }
  return {
    track: song
      ? {
          id: song.id,
          name: String(song.name || ''),
          artists,
          coverUrl: String(song.album?.picUrl || ''),
          durationMs: Number(song.durationMs || 0),
        }
      : null,
    positionMs,
    playing: state.playerState === 'PLAYING',
    src: String(state.audioSrc || ''),
    liked: Boolean((state as unknown as { isLiked?: boolean }).isLiked),
  };
}

function readSongId(song: unknown): number {
  const id = Number((song as { id?: unknown } | null)?.id || 0);
  return Number.isFinite(id) && id > 0 ? id : 0;
}

function pauseEmbeddedAudio(): void {
  try {
    const audio = document.querySelector('#folia-embed-root audio') as HTMLAudioElement | null;
    audio?.pause();
  } catch {
    // The parent audio element remains the authoritative playback output.
  }
}

function handleMessage(event: MessageEvent): void {
  const data = event.data as Record<string, unknown> | null;
  if (!data || typeof data !== 'object' || typeof data.type !== 'string') return;
  const type = data.type;

  if (type === 'shizuki:sync-cookie') {
    const cookie = typeof data.cookie === 'string' ? data.cookie : '';
    writeCookieToStorage(cookie);
    return;
  }

  if (type === 'shizuki:get-cookie') {
    // 把 Folia 侧已登录的网易云 cookie 回传父页面（父页面随后保存到站点后端）。
    postToParent({ type: 'shizuki:cookie', cookie: readCookieFromStorage() });
    return;
  }

  if (type === 'shizuki:set-theme') {
    // 站点主题同步到 Folia：昼夜模式跟随站点。
    try {
      if (typeof data.isDaylight === 'boolean') {
        import('./stores/useThemeSettingsStore').then(({ useThemeSettingsStore }) => {
          useThemeSettingsStore.getState().setDaylightPreference(Boolean(data.isDaylight));
        }).catch(() => {});
      }
    } catch {
      // ignore
    }
    return;
  }

  if (type === 'shizuki:set-view') {
    // 视图级切换：站点把 Folia 切到指定视图（player 播放器 / lattice 沉浸歌词与歌单大屏）。
    try {
      const view = String(data.view || '').trim();
      if (view === 'player' || view === 'lattice') {
        import('./stores/useAppViewStore').then(({ useAppViewStore }) => {
          useAppViewStore.getState().setView(view as 'player' | 'lattice');
        }).catch(() => {});
      }
    } catch {
      // ignore
    }
    return;
  }

  if (type === 'shizuki:play-track') {
    const trackId = Number(data.trackId);
    const positionMs = Number(data.positionMs);
    playTrack(trackId, Number.isFinite(positionMs) && positionMs > 0 ? positionMs : undefined)
      .then(() => {
        postToParent({ type: 'shizuki:play-result', ok: true, trackId });
      })
      .catch((error) => {
        postToParent({
          type: 'shizuki:play-result',
          ok: false,
          trackId,
          error: String(error?.message || error || 'playback failed'),
        });
      });
    return;
  }

  if (type === 'shizuki:play-tracks') {
    const trackIds = Array.isArray(data.trackIds) ? data.trackIds : [];
    playTracks(trackIds as number[])
      .then((summary) => {
        postToParent({ type: 'shizuki:play-tracks-result', ok: true, ...summary });
      })
      .catch((error) => {
        postToParent({
          type: 'shizuki:play-tracks-result',
          ok: false,
          error: String(error?.message || error || 'playback failed'),
        });
      });
    return;
  }

  if (type === 'shizuki:get-status') {
    postToParent({ type: 'shizuki:status', ...snapshotStatus() });
  }

  if (type === 'shizuki:follow-playback') {
    try {
      const store = usePlaybackStore.getState();
      const rawTrack = data.track as (Record<string, unknown> & { id?: unknown }) | null;
      const normalized = rawTrack ? readFollowSong(rawTrack) : null;
      const previousTrackId = Number((store.currentSong as { id?: unknown } | null)?.id || 0);
      followPlaybackActive = true;
      suppressPlaybackCommandsUntil = performance.now() + 400;
      const internalAudio = document.querySelector('#folia-embed-root audio') as HTMLAudioElement | null;
      internalAudio?.pause();
      if (normalized) {
        store.setCurrentSong(normalized);
        store.setPlayQueue([normalized]);
        if (Number(normalized.id) !== previousTrackId) void loadLyricsForTrack(normalized);
      }
      const playing = Boolean(data.playing);
      store.setPlayerState(playing ? 'PLAYING' : 'PAUSED');
      syncFollowClock(Number(data.positionMs || 0), playing);
    } catch {
      // ignore
    }
    return;
  }

  if (type === 'shizuki:activate-playback-bridge') {
    // Folia may be opened before the site has a current track. Keep selection
    // forwarding armed so the first Folia-picked song still reaches the shared
    // site audio element.
    followPlaybackActive = true;
    suppressPlaybackCommandsUntil = performance.now() + 300;
    pauseEmbeddedAudio();
    return;
  }

  if (type === 'shizuki:stop-follow-playback') {
    stopFollowPlayback();
    return;
  }

  if (type === 'shizuki:sync-clock') {
    if (!followPlaybackActive) return;
    const playing = Boolean(data.playing);
    suppressPlaybackCommandsUntil = performance.now() + 120;
    usePlaybackStore.getState().setPlayerState(playing ? 'PLAYING' : 'PAUSED');
    syncFollowClock(Number(data.positionMs || 0), playing);
    return;
  }
}

/** Install the bridge listener once. Safe to call multiple times. */
export function installShizukiExternalBridge(): void {
  if (typeof window === 'undefined') return;
  if ((window as unknown as { __shizukiBridgeInstalled?: boolean }).__shizukiBridgeInstalled) return;
  (window as unknown as { __shizukiBridgeInstalled?: boolean }).__shizukiBridgeInstalled = true;
  window.addEventListener('message', handleMessage);
  usePlaybackStore.subscribe((state, previousState) => {
    const now = performance.now();
    const switchedTrack = readSongId(state.currentSong) !== readSongId(previousState.currentSong);
    if (followPlaybackActive && switchedTrack && now >= suppressPlaybackCommandsUntil) {
      const snapshot = snapshotStatus();
      if (snapshot.track) {
        // A Folia selection is an input event, not a second audio owner. Stop its
        // local media element immediately and let the parent replay the selected
        // track through the shared site-owned element.
        suppressPlaybackCommandsUntil = now + 500;
        pauseEmbeddedAudio();
        usePlaybackStore.getState().setPlayerState('PAUSED');
        postToParent({
          type: 'shizuki:playback-intent',
          track: snapshot.track,
          positionMs: 0,
          playing: true
        });
      }
      return;
    }
    if (!followPlaybackActive || now < suppressPlaybackCommandsUntil) return;
    if (state.playerState === previousState.playerState) return;
    if (state.playerState === 'PLAYING') {
      postToParent({ type: 'shizuki:playback-command', action: 'play' });
    } else if (state.playerState === 'PAUSED') {
      postToParent({ type: 'shizuki:playback-command', action: 'pause' });
    }
  });
  // If the parent already pushed a cookie before this bundle ran, apply it now.
  const pending = (window as unknown as { __shizukiPendingCookie?: string }).__shizukiPendingCookie;
  if (pending) {
    writeCookieToStorage(pending);
    delete (window as unknown as { __shizukiPendingCookie?: string }).__shizukiPendingCookie;
  }
}
