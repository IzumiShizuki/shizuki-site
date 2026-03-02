const TIME_TAG = /\[(\d{1,2}):(\d{1,2}(?:\.\d{1,3})?)\]/g;

export function parseLrc(lrcText) {
  const normalized = normalizeLyricText(lrcText);
  if (!normalized) return [];

  const lines = normalized.split(/\r?\n/);
  const entries = [];

  for (const rawLine of lines) {
    if (!rawLine) continue;
    const text = rawLine.replace(TIME_TAG, '').trim();
    TIME_TAG.lastIndex = 0;

    let match = TIME_TAG.exec(rawLine);
    while (match) {
      const min = Number.parseInt(match[1], 10);
      const sec = Number.parseFloat(match[2]);
      if (Number.isFinite(min) && Number.isFinite(sec)) {
        entries.push({ time: min * 60 + sec, text });
      }
      match = TIME_TAG.exec(rawLine);
    }
  }

  entries.sort((a, b) => a.time - b.time);
  return entries;
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
