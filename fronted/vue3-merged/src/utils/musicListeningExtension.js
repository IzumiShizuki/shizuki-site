export function normalizeListeningTag(raw) {
  const tagId = Number(raw?.tagId ?? raw?.tag_id ?? raw?.id ?? 0);
  return {
    tagId: Number.isFinite(tagId) ? tagId : 0,
    name: String(raw?.name || raw?.label || '').trim()
  };
}

export function normalizeListeningExtensionWork(raw, index = 0) {
  const workId = Number(raw?.workId ?? raw?.work_id ?? raw?.id ?? 0);
  const safeWorkId = Number.isFinite(workId) && workId > 0 ? workId : index + 1;
  const tags = Array.isArray(raw?.tags)
    ? raw.tags.map((item) => normalizeListeningTag(item)).filter((item) => item.tagId || item.name)
    : [];
  const vas = Array.isArray(raw?.vas)
    ? raw.vas.map((item) => String(item || '').trim()).filter(Boolean)
    : [];
  const releaseDate = String(raw?.releaseDate || raw?.release_date || '').trim();
  const circle = String(raw?.circle || raw?.artist || raw?.author || '').trim();
  const rateAverage = Number(raw?.rateAverage ?? raw?.rate_average);
  const dlCount = Number(raw?.dlCount ?? raw?.dl_count);

  return {
    workId: safeWorkId,
    id: `voice-${safeWorkId}`,
    title: String(raw?.title || '').trim() || '未命名音声',
    circle: circle || '未知社团',
    cover: String(raw?.cover || raw?.coverUrl || raw?.cover_url || '').trim(),
    releaseDate,
    rateAverage: Number.isFinite(rateAverage) ? rateAverage : null,
    dlCount: Number.isFinite(dlCount) ? dlCount : null,
    tags,
    vas,
    tagLine: tags.length ? tags.slice(0, 3).map((item) => item.name || `Tag ${item.tagId}`).join(' / ') : '暂无标签',
    statLine: [
      releaseDate || '',
      Number.isFinite(dlCount) ? `销量 ${dlCount}` : '',
      Number.isFinite(rateAverage) ? `评分 ${rateAverage.toFixed(1)}` : ''
    ].filter(Boolean).join(' · '),
    description: vas.length ? `出演：${vas.slice(0, 2).join(' / ')}` : (circle || '来自音声资料库的延伸推荐')
  };
}

export function normalizeListeningExtensionWorks(payload, limit = 6) {
  const rows = Array.isArray(payload?.items) ? payload.items : Array.isArray(payload) ? payload : [];
  const seen = new Set();
  const max = Number.isFinite(Number(limit)) ? Math.max(0, Number(limit)) : 6;
  const result = [];
  rows.forEach((item, index) => {
    const normalized = normalizeListeningExtensionWork(item, index);
    if (!normalized.workId || seen.has(normalized.workId)) return;
    seen.add(normalized.workId);
    result.push(normalized);
  });
  return result.slice(0, max);
}
