/**
 * Site projection for the Twilight_Echo lyric engine (src/utils/lyricEngine).
 *
 * Maps the engine's LyricLine[] output onto the legacy site timeline shape
 * consumed by MusicPlayer.vue / MusicRightPanel.vue / MusicPlayerDetailView.vue:
 *   { time, original, translation, furigana }
 *
 * Returns null when there is no parseable lyric content, so callers can fall
 * back to the legacy parseLrc + lyricAlignment pipeline.
 */

import { buildLyricLines, parseTimedLrc } from './lyrics';

/** Untimed lines reuse the legacy plain-lyric pacing (a marker every 4s). */
const UNTIMED_MARKER_STEP_SEC = 4;
const MAX_PLAIN_LAYER_LINES = 120;

function hasText(value) {
  return typeof value === 'string' && value.trim().length > 0;
}

/**
 * Best-effort unwrap of JSON-wrapped payloads and quoted strings, mirroring
 * the behavior of utils/lrc.js `extractLyricSource` so the engine path never
 * renders raw JSON as fake "plain lyric" rows.
 */
function extractLyricText(input) {
  if (input == null) return '';
  if (typeof input === 'string') {
    const text = input.trim();
    if (!text) return '';
    if ((text.startsWith('{') && text.endsWith('}')) || (text.startsWith('[') && text.endsWith(']'))) {
      try {
        const parsed = JSON.parse(text);
        const nested = extractLyricText(parsed);
        if (nested) return nested;
      } catch {
        // keep raw text
      }
    }
    if ((text.startsWith('"') && text.endsWith('"')) || (text.startsWith("'") && text.endsWith("'"))) {
      try {
        const normalizedQuote = text.startsWith("'")
          ? `"${text.slice(1, -1).replace(/"/g, '\\"')}"`
          : text;
        const decoded = JSON.parse(normalizedQuote);
        if (typeof decoded === 'string' && decoded.trim()) return decoded;
      } catch {
        // keep raw text
      }
    }
    return input;
  }

  if (typeof input === 'object') {
    const candidates = [
      input?.lyricText,
      input?.lyric_text,
      input?.lyric,
      input?.lrc,
      input?.content,
      input?.raw
    ];
    for (const candidate of candidates) {
      const resolved = extractLyricText(candidate);
      if (resolved) return resolved;
    }
  }

  return '';
}

/** BOM strip + line ending normalization, mirroring utils/lrc.js normalizeLyricText. */
function normalizeLyricText(raw) {
  if (!raw || typeof raw !== 'string') return '';
  let text = raw;
  if (text.charCodeAt(0) === 0xfeff) {
    text = text.slice(1);
  }
  text = text
    .replace(/\\r\\n/g, '\n')
    .replace(/\\n/g, '\n')
    .replace(/\\r/g, '\n')
    .replace(/\r\n/g, '\n')
    .replace(/\r/g, '\n');
  return text.trim();
}

function readLayerText(value) {
  return normalizeLyricText(extractLyricText(value));
}

/**
 * Plain (untimed) lines of an auxiliary layer, used to restore the legacy
 * index alignment: the engine only matches timestamped auxiliary layers, while
 * the legacy pipeline index-aligned unsynchronized plain layers.
 * Returns null for blank or timestamped layers.
 */
function readPlainLayerLines(value) {
  const text = readLayerText(value);
  if (!hasText(text)) return null;
  if (parseTimedLrc(text).length > 0) return null;
  return text
    .split(/\r?\n/)
    .map((line) => line.trim())
    .filter(Boolean)
    .slice(0, MAX_PLAIN_LAYER_LINES);
}

function projectLine(line) {
  return {
    time: line.time,
    original: String(line.text || '').trim() || '...',
    translation: String(line.translation || '').trim(),
    furigana: String(line.romanization || '').trim()
  };
}

/**
 * Parse the three lyric layers with the Twilight_Echo engine and project the
 * result onto the site timeline shape. Returns null when nothing can be
 * parsed; callers then fall back to the legacy parseLrc + lyricAlignment path.
 */
export function buildSiteLyricTimeline({ lyricText, tlyricText, romalrcText } = {}) {
  const lyric = readLayerText(lyricText);
  const tlyric = readLayerText(tlyricText);
  const romalrc = readLayerText(romalrcText);
  if (!hasText(lyric) && !hasText(tlyric) && !hasText(romalrc)) return null;

  let lines;
  try {
    lines = buildLyricLines(lyric, tlyric, romalrc);
  } catch {
    return null;
  }
  if (!Array.isArray(lines) || lines.length === 0) return null;

  const plainTranslations = readPlainLayerLines(tlyricText);
  const plainRomanizations = readPlainLayerLines(romalrcText);

  const timed = [];
  const untimed = [];
  for (const line of lines) {
    if (!line || typeof line !== 'object') continue;
    if (line.timed && Number.isFinite(Number(line.time))) timed.push(line);
    else untimed.push(line);
  }
  timed.sort((a, b) => a.time - b.time);

  const projected = timed.map(projectLine);
  // Untimed rows stay after the timed rows and receive incrementing markers so
  // the ascending-time contracts of the site components keep working.
  const markerStart = timed.length > 0
    ? timed[timed.length - 1].time + UNTIMED_MARKER_STEP_SEC
    : 0;
  untimed.forEach((line, index) => {
    const row = projectLine(line);
    row.time = markerStart + index * UNTIMED_MARKER_STEP_SEC;
    projected.push(row);
  });

  if (plainTranslations) {
    projected.forEach((row, index) => {
      if (!row.translation && plainTranslations[index]) {
        row.translation = plainTranslations[index];
      }
    });
  }
  if (plainRomanizations) {
    projected.forEach((row, index) => {
      if (!row.furigana && plainRomanizations[index]) {
        row.furigana = plainRomanizations[index];
      }
    });
  }

  return projected.length > 0 ? projected : null;
}
