function normalizeText(value) {
  return typeof value === 'string' ? value.trim() : '';
}

export function resolveBlogPostDisplayTitle(raw, fallback = '未命名文章') {
  if (raw && typeof raw === 'object') {
    const title = normalizeText(raw.title);
    const summary = normalizeText(raw.summary);
    const slugCode = normalizeText(raw.slugCode ?? raw.slug_code);
    return title || summary || slugCode || fallback;
  }
  return normalizeText(raw) || fallback;
}
