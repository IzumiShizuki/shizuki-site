import { computed, getCurrentScope, onScopeDispose, ref } from 'vue';

function defaultEmpty(value) {
  return value == null || (Array.isArray(value) && value.length === 0);
}

/**
 * One cancellable resource state. A superseded request can never overwrite the latest result,
 * even when its loader ignores AbortSignal.
 */
export function useAsyncResource(loader, {
  immediate = false,
  initialValue = null,
  isEmpty = defaultEmpty
} = {}) {
  if (typeof loader !== 'function') throw new TypeError('resource loader is required');

  const data = ref(initialValue);
  const loading = ref(false);
  const error = ref(null);
  const hasResolved = ref(false);
  const empty = computed(() => hasResolved.value && !loading.value && !error.value && isEmpty(data.value));
  let generation = 0;
  let controller = null;

  async function refresh(reason = 'refresh') {
    controller?.abort('superseded');
    const requestGeneration = ++generation;
    controller = new AbortController();
    const requestController = controller;
    loading.value = true;
    error.value = null;
    try {
      const result = await loader({ signal: requestController.signal, reason });
      if (requestGeneration !== generation || requestController.signal.aborted) return data.value;
      data.value = result;
      hasResolved.value = true;
      return result;
    } catch (cause) {
      if (requestGeneration !== generation || requestController.signal.aborted) return data.value;
      error.value = cause instanceof Error ? cause : new Error(String(cause || 'Resource request failed'));
      hasResolved.value = true;
      return data.value;
    } finally {
      if (requestGeneration === generation) loading.value = false;
    }
  }

  function cancel(reason = 'cancelled') {
    generation += 1;
    controller?.abort(reason);
    controller = null;
    loading.value = false;
  }

  function reset(value = initialValue) {
    cancel('reset');
    data.value = value;
    error.value = null;
    hasResolved.value = false;
  }

  if (getCurrentScope()) onScopeDispose(cancel);
  if (immediate) void refresh('initial');

  return Object.freeze({ data, loading, error, empty, hasResolved, refresh, cancel, reset });
}
