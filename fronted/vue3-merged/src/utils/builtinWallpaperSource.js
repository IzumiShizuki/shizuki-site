/** Keep legacy saved built-in URLs compatible without rewriting custom media. */
export function efficientBuiltinWallpaperSource(value) {
  const source = String(value || '');
  const builtin = `${import.meta.env.BASE_URL}images/original-bg.png`;
  if (source === builtin) return source.replace(/\.png$/, '.webp');
  if (typeof window !== 'undefined' && source === new URL(builtin, window.location.origin).href) {
    return source.replace(/\.png$/, '.webp');
  }
  return source;
}
