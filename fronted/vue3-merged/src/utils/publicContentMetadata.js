export const DEFAULT_PUBLIC_SITE_ORIGIN = String(import.meta.env.VITE_PUBLIC_SITE_URL || 'https://site.shizuki.online');

export function publicSiteOrigin(locationTarget = globalThis.location, fallback = DEFAULT_PUBLIC_SITE_ORIGIN) {
  const href = typeof locationTarget === 'string' ? locationTarget : locationTarget?.href;
  for (const value of [href, fallback]) {
    try {
      const url = new URL(value);
      if (['http:', 'https:'].includes(url.protocol) && !url.username && !url.password) return url.origin;
    } catch { /* Try the configured public origin for desktop/offline contexts. */ }
  }
  throw new TypeError('A valid public HTTP(S) site origin is required');
}

export function applyPublicContentMetadata({ title, description = '', image = '', kind, identifier }, {
  documentTarget = globalThis.document,
  locationTarget = globalThis.location
} = {}) {
  if (!documentTarget?.head || !String(title || '').trim() || !/^[A-Za-z0-9_-]+$/.test(String(identifier || ''))) return () => {};
  const paths = { post: 'posts', album: 'albums', moment: 'moments' };
  if (!paths[kind]) return () => {};
  const origin = publicSiteOrigin(locationTarget);
  const canonical = `${origin}/read/${paths[kind]}/${encodeURIComponent(identifier)}`;
  const writtenTitle = `${String(title).slice(0, 255)} · Shizuki`;
  const previousTitle = documentTarget.title;
  documentTarget.title = writtenTitle;
  const restorers = [];
  const set = (selector, tagName, attributes, valueAttribute, value) => {
    let node = documentTarget.head.querySelector(selector);
    const created = !node;
    if (!node) {
      node = documentTarget.createElement(tagName);
      Object.entries(attributes).forEach(([key, item]) => node.setAttribute(key, item));
      documentTarget.head.append(node);
    }
    const previous = node.getAttribute(valueAttribute);
    node.setAttribute(valueAttribute, value);
    restorers.push(() => {
      if (node.getAttribute(valueAttribute) !== value) return;
      if (created) node.remove();
      else if (previous === null) node.removeAttribute(valueAttribute);
      else node.setAttribute(valueAttribute, previous);
    });
  };
  const meta = (attribute, key, value) => set(`meta[${attribute}="${key}"]`, 'meta', { [attribute]: key }, 'content', value);
  set('link[rel="canonical"]', 'link', { rel: 'canonical' }, 'href', canonical);
  meta('name', 'description', String(description).slice(0, 240));
  meta('property', 'og:title', String(title));
  meta('property', 'og:description', String(description).slice(0, 240));
  meta('property', 'og:url', canonical);
  meta('property', 'og:type', kind === 'post' ? 'article' : 'website');
  meta('name', 'twitter:card', 'summary_large_image');
  meta('name', 'twitter:title', String(title));
  meta('name', 'twitter:description', String(description).slice(0, 240));
  let cover = `${origin}/images/boot-bg-dark.webp`;
  try {
    const candidate = new URL(image, origin);
    if (image && ['https:', 'http:'].includes(candidate.protocol) && !candidate.username && !candidate.password
        && !candidate.search && !candidate.hash) cover = candidate.href;
  } catch { /* Retain the owned fallback. */ }
  meta('property', 'og:image', cover);
  meta('name', 'twitter:image', cover);
  return () => {
    restorers.reverse().forEach(restore => restore());
    if (documentTarget.title === writtenTitle) documentTarget.title = previousTitle;
  };
}
