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
 */

import { neteaseApi } from './services/netease';
import { usePlaybackStore } from './stores/usePlaybackStore';
import type { SongResult } from './types';

const COOKIE_STORAGE_KEY = 'netease_cookie';

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
async function playTrack(trackId: number): Promise<void> {
  const { song, audioUrl, name } = await resolveTrack(trackId);
  const normalized = (neteaseApi.normalizeSongResult
    ? neteaseApi.normalizeSongResult(song)
    : song) as SongResult;
  const store = usePlaybackStore.getState();
  store.setCurrentSong(normalized);
  store.setPlayQueue([normalized]);
  store.setAudioSrc(audioUrl);
  void name;
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
  };
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

  if (type === 'shizuki:play-track') {
    const trackId = Number(data.trackId);
    playTrack(trackId)
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

  if (type === 'shizuki:get-status') {
    postToParent({ type: 'shizuki:status', ...snapshotStatus() });
  }
}

/** Install the bridge listener once. Safe to call multiple times. */
export function installShizukiExternalBridge(): void {
  if (typeof window === 'undefined') return;
  if ((window as unknown as { __shizukiBridgeInstalled?: boolean }).__shizukiBridgeInstalled) return;
  (window as unknown as { __shizukiBridgeInstalled?: boolean }).__shizukiBridgeInstalled = true;
  window.addEventListener('message', handleMessage);
  // If the parent already pushed a cookie before this bundle ran, apply it now.
  const pending = (window as unknown as { __shizukiPendingCookie?: string }).__shizukiPendingCookie;
  if (pending) {
    writeCookieToStorage(pending);
    delete (window as unknown as { __shizukiPendingCookie?: string }).__shizukiPendingCookie;
  }
}
