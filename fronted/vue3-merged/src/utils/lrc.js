const TIME_TAG = /\[(\d{1,2}):(\d{1,2}(?:\.\d{1,3})?)\]/g;

export function parseLrc(lrcText) {
  if (!lrcText || typeof lrcText !== 'string') return [];

  const lines = lrcText.split(/\r?\n/);
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
