/**
 * Minimal local type bridge for the ported Twilight_Echo lyrics engine.
 * Derived from Twilight_Echo (https://github.com/Px-asen/Twilight_Echo) — Apache-2.0,
 * original author Px-asen. Sources: renderer/src/types/music.ts (Track),
 * renderer/src/providers/mediaProvider.ts (MediaProviderLyrics) and
 * renderer/src/providers/ncmTrack.ts (getNcmSongId).
 *
 * Only the surface consumed by `lyricSourceResolution.ts` is declared here so the
 * resolver no longer depends on the Electron provider/type layers. The shizuki-site
 * track shape (see usePlayerEngine.normalizeTrack) is expected to be structurally
 * compatible: { id, source, lyrics, translatedLyrics, ncmSongId, metadataMatch }.
 */
import type { LyricSource } from './lyricsManagement.ts'

export type TrackSource = 'local' | 'ncm' | (string & {})

/** Minimal bridge of Twilight_Echo shared/track.ts TrackMetadataMatch. */
export interface TrackMetadataMatch {
  providerId?: string
  confidence?: string
  trackId?: string | number
}

/** Minimal bridge of Twilight_Echo types/music.ts Track (lyric fields only). */
export interface Track {
  id: string
  source?: TrackSource | null
  lyrics: string | null
  lyricsSource?: LyricSource | null
  translatedLyrics?: string | null
  translatedLyricsSource?: LyricSource | null
  metadataMatch?: TrackMetadataMatch | null
  ncmSongId?: number | null
}

/** Minimal bridge of Twilight_Echo providers/mediaProvider.ts MediaProviderLyrics. */
export interface MediaProviderLyrics {
  lyrics: string | null
  translatedLyrics: string | null
  /** Optional word-level payload (e.g. NetEase YRC). Prefer for timed display when present. */
  wordLyrics?: string | null
}

/** Minimal bridge of Twilight_Echo providers/ncmTrack.ts getNcmSongId. */
export function getNcmSongId(track: Pick<Track, 'id' | 'ncmSongId'>): number | null {
  if (track.ncmSongId != null) return track.ncmSongId
  if (!track.id.startsWith('ncm:')) return null
  const localId = track.id.slice('ncm:'.length)
  const songId = Number(localId)
  return Number.isFinite(songId) && songId > 0 ? songId : null
}
