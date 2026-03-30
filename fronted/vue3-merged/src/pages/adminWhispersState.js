function readField(raw, camel, snake, fallback = '') {
  if (!raw || typeof raw !== 'object') return fallback;
  if (raw[camel] !== undefined && raw[camel] !== null) return raw[camel];
  if (raw[snake] !== undefined && raw[snake] !== null) return raw[snake];
  return fallback;
}

function toPositiveInt(input, fallback = 0) {
  const value = Number.parseInt(String(input || ''), 10);
  return Number.isFinite(value) && value > 0 ? value : fallback;
}

export function normalizeAdminWhisperItem(raw) {
  return {
    whisperId: toPositiveInt(readField(raw, 'whisperId', 'whisper_id', 0), 0),
    status: String(readField(raw, 'status', 'status', 'CREATED') || '').toUpperCase(),
    postId: toPositiveInt(readField(raw, 'postId', 'post_id', 0), 0),
    postTitle: String(readField(raw, 'postTitle', 'post_title', '站点留言') || '').trim() || '站点留言',
    content: String(readField(raw, 'content', 'content', '') || '').trim(),
    nickname: String(readField(raw, 'nickname', 'nickname', '') || '').trim(),
    remark: String(readField(raw, 'remark', 'remark', '') || '').trim(),
    createdAt: String(readField(raw, 'createdAt', 'created_at', '') || '').trim()
  };
}

export function normalizeAdminWhisperPage(payload, fallbackPage = 1, fallbackPageSize = 20) {
  const rawItems = Array.isArray(readField(payload, 'items', 'items', [])) ? readField(payload, 'items', 'items', []) : [];
  return {
    items: rawItems.map(normalizeAdminWhisperItem).filter((item) => item.whisperId > 0),
    page: toPositiveInt(readField(payload, 'pageNo', 'page_no', readField(payload, 'page', 'page', fallbackPage)), fallbackPage),
    pageSize: toPositiveInt(readField(payload, 'pageSize', 'page_size', fallbackPageSize), fallbackPageSize),
    total: Math.max(0, Number(readField(payload, 'total', 'total', rawItems.length)) || 0)
  };
}
