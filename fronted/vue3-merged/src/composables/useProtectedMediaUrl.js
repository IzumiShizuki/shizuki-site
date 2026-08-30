import { getCurrentScope, onScopeDispose, ref } from 'vue';
import { HttpError } from '../services/httpClient';
import { fetchProtectedMediaBlob } from '../services/mediaGatewayApi';

/**
 * Resolves a short-lived media capability, retries once with a fresh presentation on expiry,
 * and owns/revokes the generated object URL.
 */
export function useProtectedMediaUrl(resolveVariant, {
  fetchBlob = fetchProtectedMediaBlob,
  createObjectUrl = (blob) => URL.createObjectURL(blob),
  revokeObjectUrl = (value) => URL.revokeObjectURL(value)
} = {}) {
  if (typeof resolveVariant !== 'function') throw new TypeError('media variant resolver is required');
  const url = ref('');
  const loading = ref(false);
  const error = ref(null);
  let controller = null;
  let generation = 0;

  function revokeCurrent() {
    if (!url.value) return;
    revokeObjectUrl(url.value);
    url.value = '';
  }

  async function refresh(reason = 'refresh') {
    controller?.abort('superseded');
    const requestGeneration = ++generation;
    const requestController = new AbortController();
    controller = requestController;
    loading.value = true;
    error.value = null;
    for (let attempt = 0; attempt < 2; attempt += 1) {
      try {
        const variant = await resolveVariant({
          signal: requestController.signal,
          refreshPresentation: attempt > 0,
          reason
        });
        const blob = await fetchBlob(variant, { signal: requestController.signal });
        if (requestGeneration !== generation || requestController.signal.aborted) return '';
        const nextUrl = createObjectUrl(blob);
        revokeCurrent();
        url.value = nextUrl;
        loading.value = false;
        return nextUrl;
      } catch (cause) {
        if (requestGeneration !== generation || requestController.signal.aborted) return '';
        const capabilityExpired = cause instanceof HttpError
          && (cause.status === 401 || cause.status === 403 || cause.problemCode === 'MEDIA_CAPABILITY_EXPIRED');
        if (attempt === 0 && capabilityExpired) continue;
        error.value = cause instanceof Error ? cause : new Error(String(cause || 'Media request failed'));
        loading.value = false;
        return '';
      }
    }
    loading.value = false;
    return '';
  }

  function cancel(reason = 'cancelled') {
    generation += 1;
    controller?.abort(reason);
    controller = null;
    loading.value = false;
  }

  function dispose() {
    cancel('disposed');
    revokeCurrent();
  }

  if (getCurrentScope()) onScopeDispose(dispose);
  return Object.freeze({ url, loading, error, refresh, cancel, dispose });
}
