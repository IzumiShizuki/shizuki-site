/** Resolve Folia's current hashed Vite entry from its HTML shell. */
export function resolveFoliaEntryModule(html) {
  const matches = [...String(html || '').matchAll(/<script\b(?=[^>]*\btype=["']module["'])[^>]*\bsrc=["']([^"']+)["'][^>]*>/gi)];
  const src = matches[0]?.[1]?.trim();
  if (!src) throw new Error('Folia 页面没有提供入口模块，请刷新后重试');
  return src;
}
