/**
 * Ported from Twilight_Echo (https://github.com/Px-asen/Twilight_Echo) — Apache-2.0.
 * Original author: Px-asen. Copied into shizuki-site `src/utils/lyricEngine`.
 * Only import paths were adjusted for the shizuki-site layout; logic is unchanged.
 */

import type { LyricSourcePreference } from './lyricsManagement.ts'

export interface ResolverLyricsState {
  lyrics: string | null
  translatedLyrics?: string | null
  lyricsSource?: string | null
  translatedLyricsSource?: string | null
}

/**
 * Forced sources never become the Auto baseline. Auto receives the cached
 * resolver result from before a forced Local/Provider selection.
 */
export function resolverLyricsInput<T extends ResolverLyricsState>(
  current: T,
  automaticBaseline: T | undefined,
  source: Exclude<LyricSourcePreference, 'manual'>
): T {
  const baseline = automaticBaseline ?? current
  if (source === 'auto') return baseline
  return {
    ...baseline,
    lyrics: null,
    translatedLyrics: null,
    lyricsSource: null,
    translatedLyricsSource: null
  }
}
