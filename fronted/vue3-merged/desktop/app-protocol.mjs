import { existsSync, statSync } from 'node:fs';
import path from 'node:path';
import { pathToFileURL } from 'node:url';

const APP_ORIGIN = 'app://shizuki';

export function createGatewayUrl(requestUrl, gatewayOrigin) {
  const source = new URL(requestUrl);
  if (source.protocol !== 'app:' || source.hostname !== 'shizuki' || !source.pathname.startsWith('/api/')) {
    throw new TypeError('Only Shizuki app-scheme API URLs can be proxied.');
  }
  const gateway = new URL(gatewayOrigin);
  if (!['http:', 'https:'].includes(gateway.protocol)) {
    throw new TypeError('Gateway origin must use HTTP or HTTPS.');
  }
  return new URL(`${source.pathname}${source.search}`, `${gateway.origin}/`).toString();
}

export function resolveStaticAsset(distRoot, requestUrl) {
  const source = new URL(requestUrl);
  if (source.protocol !== 'app:' || source.hostname !== 'shizuki') {
    throw new TypeError('Untrusted desktop application URL.');
  }

  let pathname;
  try {
    pathname = decodeURIComponent(source.pathname);
  } catch {
    throw new TypeError('Malformed application asset path.');
  }
  if (pathname.includes('\0')) throw new TypeError('Malformed application asset path.');

  const root = path.resolve(distRoot);
  const relative = pathname.replace(/^\/+/, '') || 'index.html';
  const candidate = path.resolve(root, relative);
  if (candidate !== root && !candidate.startsWith(`${root}${path.sep}`)) {
    throw new TypeError('Application asset path escapes the bundle root.');
  }

  if (existsSync(candidate) && statSync(candidate).isFile()) return candidate;
  const extension = path.extname(relative);
  if (!extension) return path.join(root, 'index.html');
  return null;
}

function copyProxyHeaders(requestHeaders) {
  const headers = new Headers(requestHeaders);
  for (const name of ['host', 'origin', 'referer', 'content-length', 'connection']) {
    headers.delete(name);
  }
  return headers;
}

export function registerAppProtocol({ protocol, net, distRoot, gatewayOrigin }) {
  protocol.handle('app', async request => {
    const url = new URL(request.url);
    if (url.origin !== APP_ORIGIN && !(url.protocol === 'app:' && url.hostname === 'shizuki')) {
      return new Response('Not found', { status: 404 });
    }

    if (url.pathname.startsWith('/api/')) {
      const method = String(request.method || 'GET').toUpperCase();
      return net.fetch(createGatewayUrl(request.url, gatewayOrigin), {
        method,
        headers: copyProxyHeaders(request.headers),
        body: ['GET', 'HEAD'].includes(method) ? undefined : request.body,
        redirect: 'manual',
        duplex: request.body ? 'half' : undefined
      });
    }

    const target = resolveStaticAsset(distRoot, request.url);
    if (!target) return new Response('Not found', { status: 404 });
    return net.fetch(pathToFileURL(target).toString());
  });
}
