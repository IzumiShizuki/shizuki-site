/**
 * Ported from Twilight_Echo (https://github.com/Px-asen/Twilight_Echo) — Apache-2.0.
 * Original author: Px-asen. Copied into shizuki-site `src/utils/lyricEngine`.
 * Only import paths were adjusted for the shizuki-site layout; logic is unchanged.
 */

import type { LyricsFocusLineCount } from './lyricsAppearance.ts'

export function getLyricFocusLineIndices(
  totalLines: number,
  activeIndex: number,
  focusLineCount: LyricsFocusLineCount
): number[] {
  if (totalLines <= 0) return []
  if (focusLineCount === 'all') return Array.from({ length: totalLines }, (_value, index) => index)

  const count = Math.min(totalLines, focusLineCount)
  const selected = activeIndex < 0 ? 0 : Math.min(Math.max(activeIndex, 0), totalLines - 1)
  const start = Math.min(
    Math.max(0, selected - Math.floor(count / 2)),
    Math.max(0, totalLines - count)
  )

  return Array.from({ length: count }, (_value, index) => start + index)
}
