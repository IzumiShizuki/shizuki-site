export function createQuoteEditor(value = {}) {
  return {
    id: Number(value.id) || null,
    version: Math.max(0, Number(value.version) || 0),
    text: String(value.text || ''),
    author: String(value.author || ''),
    sourceTitle: String(value.sourceTitle || ''),
    categoryCode: String(value.categoryCode || ''),
    providerCode: String(value.providerCode || 'LOCAL').toUpperCase(),
    providerUuid: String(value.providerUuid || ''),
    sourceUrl: String(value.sourceUrl || ''),
    approvalStatus: String(value.approvalStatus || 'DRAFT').toUpperCase(),
    enabled: Boolean(value.enabled)
  };
}

export function quoteStatusPresentation(value) {
  const state = String(value?.state || 'unavailable').toLowerCase();
  if (state === 'current') return { tone: 'fresh', label: '今日快照正常', detail: '当天快照已提交，普通刷新不会替换它。' };
  if (state === 'stale') return { tone: 'stale', label: '正在使用 last-good', detail: '今日快照尚未补齐，访客仍看到原日期与真实来源。' };
  if (state === 'local_alternative') return { tone: 'local', label: '本地替代句', detail: '这是访客本地切换结果，不会改写今日快照。' };
  return { tone: 'unavailable', label: '今日一言不可用', detail: '当前没有可用快照或本地回退，页面不会虚构内容。' };
}

export function filterAdminQuotes(quotes, filter) {
  const list = Array.isArray(quotes) ? quotes : [];
  if (filter === 'FEATURED') return list.filter((quote) => quote.enabled);
  if (['DRAFT', 'APPROVED', 'REJECTED'].includes(filter)) {
    return list.filter((quote) => quote.approvalStatus === filter);
  }
  return list;
}
