/**
 * Site glue for word-level (AMLL TTML) lyric enhancement.
 *
 * The Twilight_Echo engine (src/utils/lyricEngine/lyrics.ts) can parse AMLL
 * TTML into timed lines carrying per-word timestamps (`words: LyricWord[]`,
 * shape {time, endTime, text}). This module attaches those word arrays onto
 * the legacy site timeline shape consumed by the music views:
 *   { time, original, translation, furigana, words?: LyricWord[] }
 *
 * Matching is by line timestamp (exact millisecond first, then the nearest
 * candidate within a small tolerance), with a light text-compatibility check
 * so words are never attached to a line whose text belongs to a different
 * lyric source. When nothing matches (or no AMLL payload is provided), the
 * original timeline is returned untouched, so callers keep line-level
 * rendering.
 */

import { buildLyricLines } from './lyrics';

/** Same order of magnitude as the engine's own LAYER_MATCH_TOLERANCE_MS. */
const MATCH_TOLERANCE_MS = 1500;

/**
 * Whitespace/punctuation-insensitive text key for comparing a site row's
 * original text with an AMLL line's text (LRC/YRC/TTML punctuation and
 * spacing conventions differ, even for the same lyric line).
 */
function comparableText(value) {
  return String(value ?? '')
    .replace(/[\s，。！？、,.!?…·'"“”「」『』（）()\[\]【】:：;；~〜～]/g, '')
    .toLowerCase();
}

function textCompatible(left, right) {
  const a = comparableText(left);
  const b = comparableText(right);
  if (!a || !b) return false;
  return a === b || a.includes(b) || b.includes(a);
}

function toMs(value) {
  return Math.round(Number(value) * 1000);
}

/**
 * Attach AMLL word timestamps to a site-shape lyric timeline.
 *
 * @param {Array<{time:number, original:string, translation:string, furigana:string, words?:Array}>} timeline
 * @param {string|null|undefined} amllTtmlText raw AMLL TTML (or any format
 *   buildLyricLines understands, e.g. YRC) carrying per-word timestamps
 * @returns the original `timeline` reference when nothing matched or the
 *   payload is unusable; otherwise a new array with `words` attached to the
 *   matched rows. Input rows are never mutated.
 */
export function enhanceTimelineWithWords(timeline, amllTtmlText) {
  if (!Array.isArray(timeline)) return timeline;
  if (typeof amllTtmlText !== 'string' || !amllTtmlText.trim()) return timeline;

  // AMLL TTML files sometimes carry an XML declaration, which the engine's
  // isAmlTtml probe does not accept; strip it before parsing.
  let ttmlText = amllTtmlText.trim();
  ttmlText = ttmlText.replace(/^<\?xml[\s\S]*?\?>\s*/i, '');
  if (!ttmlText) return timeline;

  let parsed;
  try {
    parsed = buildLyricLines(ttmlText, null, null);
  } catch {
    return timeline;
  }
  const wordLines = (Array.isArray(parsed) ? parsed : []).filter(
    (line) =>
      line &&
      typeof line === 'object' &&
      Number.isFinite(Number(line.time)) &&
      Array.isArray(line.words) &&
      line.words.length > 0
  );
  if (wordLines.length === 0) return timeline;

  const used = new Set();
  const rows = timeline.map((row) => {
    if (!row || typeof row !== 'object') return row;
    if (Array.isArray(row.words) && row.words.length > 0) return row;
    const time = Number(row.time);
    if (!Number.isFinite(time)) return row;

    const rowMs = toMs(time);
    let match = null;
    let bestDelta = Number.POSITIVE_INFINITY;
    for (const candidate of wordLines) {
      if (used.has(candidate)) continue;
      const delta = Math.abs(toMs(candidate.time) - rowMs);
      if (delta > MATCH_TOLERANCE_MS) continue;
      if (delta < bestDelta && textCompatible(row.original, candidate.text)) {
        bestDelta = delta;
        match = candidate;
      }
    }
    if (!match) return row;
    used.add(match);
    return { ...row, words: match.words.map((word) => ({ ...word })) };
  });

  return used.size > 0 ? rows : timeline;
}
