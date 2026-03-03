const TIME_TAG = /(?:\[(\d{1,3}):(\d{1,2}(?:[.:,]\d{1,3})?)\])|(?:<(\d{1,3}):(\d{1,2}(?:[.:,]\d{1,3})?)>)/g;

export function parseLrc(lrcText) {
  const normalized = normalizeLyricText(extractLyricSource(lrcText));
  if (!normalized) return [];

  const lines = normalized.split(/\r?\n/);
  const entries = [];

  for (const rawLine of lines) {
    if (!rawLine) continue;
    const text = rawLine.replace(TIME_TAG, '').trim();
    TIME_TAG.lastIndex = 0;

    let match = TIME_TAG.exec(rawLine);
    while (match) {
      const minRaw = match[1] || match[3];
      const secRaw = match[2] || match[4];
      const min = Number.parseInt(minRaw, 10);
      const sec = parseSecondToken(secRaw);
      if (Number.isFinite(min) && Number.isFinite(sec)) {
        entries.push({ time: min * 60 + sec, text });
      }
      match = TIME_TAG.exec(rawLine);
    }
  }

  entries.sort((a, b) => a.time - b.time);
  return entries;
}

function parseSecondToken(token) {
  const raw = String(token || '').trim();
  if (!raw) return Number.NaN;
  const normalized = raw.replace(',', '.').replace(':', '.');
  return Number.parseFloat(normalized);
}

function extractLyricSource(input) {
  if (input == null) return '';
  if (typeof input === 'string') {
    const text = input.trim();
    if (!text) return '';
    if ((text.startsWith('{') && text.endsWith('}')) || (text.startsWith('[') && text.endsWith(']'))) {
      try {
        const parsed = JSON.parse(text);
        const nested = extractLyricSource(parsed);
        if (nested) return nested;
      } catch {
        // keep raw text
      }
    }
    if ((text.startsWith('"') && text.endsWith('"')) || (text.startsWith("'") && text.endsWith("'"))) {
      try {
        const normalizedQuote = text.startsWith("'") ? `"${text.slice(1, -1).replace(/"/g, '\\"')}"` : text;
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
      const resolved = extractLyricSource(candidate);
      if (resolved) return resolved;
    }
    if (input?.lrc && typeof input.lrc === 'object') {
      const resolved = extractLyricSource(input.lrc);
      if (resolved) return resolved;
    }
    if (input?.klyric && typeof input.klyric === 'object') {
      const resolved = extractLyricSource(input.klyric);
      if (resolved) return resolved;
    }
  }

  return '';
}

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

export function getLyricLineAt(entries, currentTimeSec) {
  if (!Array.isArray(entries) || entries.length === 0) return '';
  if (!Number.isFinite(currentTimeSec) || currentTimeSec < 0) return entries[0].text || '';

  let lo = 0;
  let hi = entries.length - 1;
  let ans = 0;

  while (lo <= hi) {
    const mid = (lo + hi) >> 1;
    if (entries[mid].time <= currentTimeSec) {
      ans = mid;
      lo = mid + 1;
    } else {
      hi = mid - 1;
    }
  }

  return entries[ans]?.text || '';
}
