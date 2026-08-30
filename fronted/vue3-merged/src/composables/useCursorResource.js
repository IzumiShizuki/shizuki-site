import { computed, getCurrentScope, onScopeDispose, ref } from 'vue';

function defaultKey(item, index) {
  return item?.id ?? item?.publicId ?? item?.publicSlug ?? index;
}

function mergeUnique(existing, incoming, keyOf) {
  const merged = [...existing];
  const seen = new Set(existing.map((item, index) => String(keyOf(item, index))));
  incoming.forEach((item, index) => {
    const key = String(keyOf(item, existing.length + index));
    if (!seen.has(key)) {
      seen.add(key);
      merged.push(item);
    }
  });
  return merged;
}

/** Stable cursor feed with cancellation, late-response suppression and duplicate-free merging. */
export function useCursorResource(loader, { immediate = false, keyOf = defaultKey } = {}) {
  if (typeof loader !== 'function') throw new TypeError('cursor loader is required');
  const items = ref([]);
  const loading = ref(false);
  const error = ref(null);
  const hasResolved = ref(false);
  const nextCursor = ref('');
  const hasMore = ref(false);
  const empty = computed(() => hasResolved.value && !loading.value && !error.value && items.value.length === 0);
  let generation = 0;
  let controller = null;

  async function request({ cursor = '', replace = false, reason = 'page' } = {}) {
    if (loading.value && !replace) return null;
    controller?.abort('superseded');
    const requestGeneration = ++generation;
    controller = new AbortController();
    const requestController = controller;
    loading.value = true;
    error.value = null;
    try {
      const page = await loader({ cursor, signal: requestController.signal, reason });
      if (requestGeneration !== generation || requestController.signal.aborted) return null;
      const pageItems = Array.isArray(page?.items) ? page.items : [];
      items.value = replace ? mergeUnique([], pageItems, keyOf) : mergeUnique(items.value, pageItems, keyOf);
      hasMore.value = Boolean(page?.hasMore);
      nextCursor.value = hasMore.value ? String(page?.nextCursor || '') : '';
      hasResolved.value = true;
      return page;
    } catch (cause) {
      if (requestGeneration !== generation || requestController.signal.aborted) return null;
      error.value = cause instanceof Error ? cause : new Error(String(cause || 'Cursor request failed'));
      hasResolved.value = true;
      return null;
    } finally {
      if (requestGeneration === generation) loading.value = false;
    }
  }

  function refresh(reason = 'refresh') {
    return request({ cursor: '', replace: true, reason });
  }

  function loadMore() {
    if (!hasMore.value || !nextCursor.value || loading.value) return Promise.resolve(null);
    return request({ cursor: nextCursor.value, replace: false, reason: 'load-more' });
  }

  function cancel(reason = 'cancelled') {
    generation += 1;
    controller?.abort(reason);
    controller = null;
    loading.value = false;
  }

  function reset() {
    cancel('reset');
    items.value = [];
    error.value = null;
    nextCursor.value = '';
    hasMore.value = false;
    hasResolved.value = false;
  }

  if (getCurrentScope()) onScopeDispose(cancel);
  if (immediate) void refresh('initial');

  return Object.freeze({
    items,
    loading,
    error,
    empty,
    hasResolved,
    nextCursor,
    hasMore,
    refresh,
    loadMore,
    cancel,
    reset
  });
}
