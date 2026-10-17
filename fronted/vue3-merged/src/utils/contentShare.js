import { publicSiteOrigin } from './publicContentMetadata';

const CONTENT_PATHS = Object.freeze({
  post: '/read/posts',
  album: '/read/albums',
  moment: '/read/moments'
});

function normalizedIdentifier(value) {
  const identifier = String(value ?? '').trim();
  if (!identifier || identifier.length > 240 || !/^[A-Za-z0-9_-]+$/.test(identifier)) {
    throw new TypeError('A safe public content identifier is required');
  }
  return identifier;
}

function locationHref(locationTarget) {
  if (typeof locationTarget === 'string') return locationTarget;
  if (typeof locationTarget?.href === 'string') return locationTarget.href;
  return '';
}

export function buildContentShareUrl(kind, publicIdentifier, {
  locationTarget = globalThis.location
} = {}) {
  const routeBase = CONTENT_PATHS[String(kind || '').trim().toLowerCase()];
  if (!routeBase) throw new TypeError('Unsupported share content kind');
  const identifier = normalizedIdentifier(publicIdentifier);
  const url = new URL(`${routeBase}/${encodeURIComponent(identifier)}`, publicSiteOrigin(locationHref(locationTarget)));
  return url.href;
}

function assertSafeContentUrl(value) {
  const url = new URL(String(value || ''));
  const safeHash = /^#\/(blog|albums|moments)\/[A-Za-z0-9_-]+$/.test(url.hash);
  const safePath = /^\/read\/(posts|albums|moments)\/[A-Za-z0-9_-]+$/.test(url.pathname) && !url.hash;
  if ((!safeHash && !safePath) || !['https:', 'http:'].includes(url.protocol) || url.search || url.username || url.password) {
    throw new TypeError('Share URL must be a sanitized site content route');
  }
  return url.href;
}

async function copyWithDocument(value, documentTarget) {
  if (!documentTarget?.body || typeof documentTarget.execCommand !== 'function') return false;
  const textarea = documentTarget.createElement('textarea');
  const returnFocus = documentTarget.activeElement;
  textarea.value = value;
  textarea.setAttribute('readonly', '');
  textarea.style.position = 'fixed';
  textarea.style.opacity = '0';
  documentTarget.body.append(textarea);
  textarea.select();
  let copied = false;
  try {
    copied = documentTarget.execCommand('copy') === true;
  } catch {
    copied = false;
  } finally {
    textarea.remove();
    if (returnFocus?.isConnected && typeof returnFocus.focus === 'function') {
      returnFocus.focus({ preventScroll: true });
    }
  }
  return copied;
}

export async function shareContentLink({
  title,
  url,
  navigatorTarget = globalThis.navigator,
  documentTarget = globalThis.document
}) {
  const safeUrl = assertSafeContentUrl(url);
  const safeTitle = String(title || 'Shizuki Site').replace(/[\r\n]+/g, ' ').trim().slice(0, 160);

  if (typeof navigatorTarget?.share === 'function') {
    try {
      await navigatorTarget.share({ title: safeTitle, url: safeUrl });
      return Object.freeze({ status: 'shared', url: safeUrl });
    } catch (error) {
      if (error?.name === 'AbortError') return Object.freeze({ status: 'cancelled', url: safeUrl });
    }
  }

  if (typeof navigatorTarget?.clipboard?.writeText === 'function') {
    try {
      await navigatorTarget.clipboard.writeText(safeUrl);
      return Object.freeze({ status: 'copied', url: safeUrl });
    } catch {
      // Continue to the selection-based copy fallback.
    }
  }

  const copied = await copyWithDocument(safeUrl, documentTarget);
  return Object.freeze({ status: copied ? 'copied' : 'unavailable', url: safeUrl });
}
