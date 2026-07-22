const DEFAULT_TIMESTAMP_TOLERANCE_SEC = 0.35;

function readEntryText(entry) {
  return String(entry?.text || '').trim();
}

function readEntryTime(entry) {
  const time = Number(entry?.time);
  return Number.isFinite(time) ? time : null;
}

export function alignAuxiliaryLyricEntries(baseEntries, auxiliaryEntries, options = {}) {
  const base = Array.isArray(baseEntries) ? baseEntries : [];
  const auxiliary = Array.isArray(auxiliaryEntries) ? auxiliaryEntries : [];
  const tolerance = Number.isFinite(Number(options?.toleranceSec))
    ? Math.max(0, Number(options.toleranceSec))
    : DEFAULT_TIMESTAMP_TOLERANCE_SEC;
  const hasSynchronizedAuxiliary = auxiliary.some(
    (entry) => entry?.synchronized !== false && readEntryTime(entry) !== null
  );

  if (!hasSynchronizedAuxiliary) {
    return base.map((_, index) => readEntryText(auxiliary[index]));
  }

  const usedIndexes = new Set();
  return base.map((baseEntry) => {
    const baseTime = readEntryTime(baseEntry);
    if (baseTime === null) return '';

    let matchIndex = -1;
    let matchDistance = tolerance + Number.EPSILON;
    for (let index = 0; index < auxiliary.length; index += 1) {
      if (usedIndexes.has(index) || auxiliary[index]?.synchronized === false) continue;
      const auxiliaryTime = readEntryTime(auxiliary[index]);
      if (auxiliaryTime === null) continue;
      const distance = Math.abs(auxiliaryTime - baseTime);
      if (distance < matchDistance) {
        matchIndex = index;
        matchDistance = distance;
      }
    }

    if (matchIndex < 0) return '';
    usedIndexes.add(matchIndex);
    return readEntryText(auxiliary[matchIndex]);
  });
}

export function buildAlignedLyricTimeline(originalEntries, translationEntries, furiganaEntries, options = {}) {
  const original = Array.isArray(originalEntries) ? originalEntries : [];
  const translations = alignAuxiliaryLyricEntries(original, translationEntries, options);
  const furigana = alignAuxiliaryLyricEntries(original, furiganaEntries, options);

  return original.map((entry, index) => ({
    time: Math.max(0, readEntryTime(entry) ?? 0),
    original: readEntryText(entry) || '...',
    translation: translations[index] || '',
    furigana: furigana[index] || ''
  }));
}

export function resolveLyricEdgePadding(containerHeight, rowHeight, minimumPadding = 24) {
  const viewport = Math.max(0, Number(containerHeight) || 0);
  const row = Math.max(0, Number(rowHeight) || 0);
  const minimum = Math.max(0, Number(minimumPadding) || 0);
  return Math.max(minimum, viewport / 2 - row / 2);
}

export function resolveLyricScrollTop({
  rowOffsetTop,
  rowHeight,
  containerHeight,
  scrollHeight
} = {}) {
  const viewport = Math.max(0, Number(containerHeight) || 0);
  const contentHeight = Math.max(viewport, Number(scrollHeight) || 0);
  const rowTop = Math.max(0, Number(rowOffsetTop) || 0);
  const rowSize = Math.max(0, Number(rowHeight) || 0);
  const centeredTop = rowTop + rowSize / 2 - viewport / 2;
  return Math.min(Math.max(0, centeredTop), Math.max(0, contentHeight - viewport));
}

export function resolveClosestLyricRowIndex(rows, viewportCenterY) {
  const list = Array.from(rows || []);
  const centerY = Number(viewportCenterY);
  if (!Number.isFinite(centerY)) return -1;

  let closestIndex = -1;
  let closestDistance = Number.POSITIVE_INFINITY;
  list.forEach((row, index) => {
    if (!row) return;
    const rowCenter = (Number(row.offsetTop) || 0) + (Number(row.offsetHeight) || 0) / 2;
    const distance = Math.abs(rowCenter - centerY);
    if (distance < closestDistance) {
      closestDistance = distance;
      closestIndex = index;
    }
  });
  return closestIndex;
}
