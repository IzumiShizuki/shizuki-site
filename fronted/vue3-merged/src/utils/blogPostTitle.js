export const DEFAULT_BLOG_POST_TITLE = '未命名文章';

function normalizeText(value) {
  return typeof value === 'string' ? value.trim() : '';
}

export function resolveBlogPostDisplayTitle(raw, fallback = DEFAULT_BLOG_POST_TITLE) {
  if (raw && typeof raw === 'object') {
    const title = normalizeText(raw.title);
    const summary = normalizeText(raw.summary);
    const slugCode = normalizeText(raw.slugCode ?? raw.slug_code);
    return title || summary || slugCode || fallback;
  }
  return normalizeText(raw) || fallback;
}
