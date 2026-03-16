export function resolveActiveTimelineIndex(timeline, currentTime, entryIndex) {
  const list = Array.isArray(timeline) ? timeline : [];
  if (!list.length) return -1;
  if (Number.isInteger(entryIndex) && entryIndex >= 0 && entryIndex < list.length) {
    return entryIndex;
  }
  const now = Number(currentTime || 0);
  let fallbackIndex = -1;
  for (let i = 0; i < list.length; i += 1) {
    if (Number(list[i]?.time || 0) <= now) {
      fallbackIndex = i;
    } else {
      break;
    }
  }
  return fallbackIndex >= 0 ? fallbackIndex : 0;
}

export function buildLyricDisplayGroups({
  timeline,
  currentTime,
  entryIndex,
  mode = 'original',
  fallbackText = '纯音乐，无歌词'
}) {
  const list = Array.isArray(timeline) ? timeline : [];
  if (!list.length) {
    return {
      activeTime: 0,
      groups: [
        {
          time: 0,
          lines: [{ text: String(fallbackText || '纯音乐，无歌词').trim() || '纯音乐，无歌词', kind: 'original' }]
        }
      ]
    };
  }

  const groups = list.map((item) => {
    const original = String(item?.original || '').trim();
    const translation = String(item?.translation || '').trim();
    const furigana = String(item?.furigana || '').trim();
    const lines = [];
    if (original) {
      lines.push({ text: original, kind: 'original' });
    }
    if (mode === 'translation' && translation) {
      lines.push({ text: translation, kind: 'translation' });
    }
    if (mode === 'furigana' && furigana) {
      lines.push({ text: furigana, kind: 'furigana' });
    }
    if (!lines.length) {
      lines.push({ text: original || translation || furigana || '...', kind: 'original' });
    }
    return {
      time: Number(item?.time || 0),
      lines
    };
  });

  const activeIndex = resolveActiveTimelineIndex(list, currentTime, entryIndex);
  const activeTime = Number(groups[activeIndex]?.time || 0);
  const nextGroup = groups[activeIndex + 1];
  return {
    activeTime,
    groups: nextGroup ? [groups[activeIndex], nextGroup] : [groups[activeIndex]]
  };
}
