export function safeCssUrl(rawUrl) {
  const raw = String(rawUrl || '').trim();
  if (!raw) return '';

  let normalized = raw.replace(/[\u0000-\u001F\u007F]/g, '');
  if (normalized.startsWith('//')) {
    normalized = `https:${normalized}`;
  }

  try {
    normalized = encodeURI(normalized);
  } catch {
    // keep raw normalized value
  }

  return normalized.replace(/\\/g, '\\\\').replace(/'/g, "\\'");
}
