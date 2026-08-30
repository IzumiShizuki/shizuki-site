import { buildApiUrl, HttpError } from './httpClient';
import { isSiteOwnedPublicMediaPath } from './lifeContentApi';

export const MEDIA_CAPABILITY_HEADER = 'X-Media-Capability';

function validCapability(value) {
  return typeof value === 'string'
    && value.length > 0
    && value.length <= 4096
    && value === value.trim()
    && !/[\r\n]/.test(value);
}
/** Fetches a protected derivative without placing its capability in the URL or referrer. */
export async function fetchProtectedMediaBlob(variant, { signal, fetchImpl = globalThis.fetch } = {}) {
  if (!variant || !isSiteOwnedPublicMediaPath(variant.path) || !validCapability(variant.capability)) {
    throw new TypeError('Protected media route and capability are required');
  }
  if (typeof fetchImpl !== 'function') throw new TypeError('fetch is unavailable');
  const url = buildApiUrl(variant.path);
  let response;
  try {
    response = await fetchImpl(url, {
      method: 'GET',
      signal,
      headers: {
        Accept: 'image/avif,image/webp,image/*',
        [MEDIA_CAPABILITY_HEADER]: variant.capability
      }
    });
  } catch (cause) {
    throw new HttpError('Protected media request failed', {
      status: 0,
      problemCode: signal?.aborted ? 'ABORTED' : 'NETWORK_ERROR',
      detail: cause?.message || 'Protected media request failed',
      url
    });
  }
  if (!response.ok) {
    throw new HttpError('Protected media is unavailable', {
      status: response.status,
      problemCode: response.status === 401 || response.status === 403 ? 'MEDIA_CAPABILITY_EXPIRED' : 'MEDIA_UNAVAILABLE',
      url
    });
  }
  const contentType = String(response.headers.get('content-type') || '').toLowerCase();
  if (!contentType.startsWith('image/')) {
    throw new HttpError('Protected media response is not an image', {
      status: response.status,
      problemCode: 'INVALID_MEDIA_RESPONSE',
      url
    });
  }
  return response.blob();
}
