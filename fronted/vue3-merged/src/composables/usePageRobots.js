import { getCurrentScope, onScopeDispose, watch } from 'vue';

/** Applies a reversible runtime robots directive for client-rendered link-only content. */
export function usePageRobots(noIndexSource, {
  documentTarget = typeof document !== 'undefined' ? document : null
} = {}) {
  let metaElement = null;
  let ownedElement = false;
  let previousContent = null;

  function restore() {
    if (!metaElement) return;
    if (ownedElement) metaElement.remove();
    else if (previousContent === null) metaElement.removeAttribute('content');
    else metaElement.setAttribute('content', previousContent);
    metaElement = null;
    ownedElement = false;
    previousContent = null;
  }

  function apply(blockIndexing) {
    if (!blockIndexing || !documentTarget?.head) {
      restore();
      return;
    }
    if (!metaElement) {
      metaElement = documentTarget.head.querySelector('meta[name="robots"]');
      ownedElement = !metaElement;
      if (!metaElement) {
        metaElement = documentTarget.createElement('meta');
        metaElement.setAttribute('name', 'robots');
        metaElement.dataset.shizukiRuntimeRobots = 'true';
        documentTarget.head.append(metaElement);
      } else {
        previousContent = metaElement.getAttribute('content');
      }
    }
    metaElement.setAttribute('content', 'noindex, nofollow, noarchive');
  }

  const stop = watch(noIndexSource, (value) => apply(Boolean(value)), { immediate: true });
  function dispose() {
    stop();
    restore();
  }
  if (getCurrentScope()) onScopeDispose(dispose);
  return Object.freeze({ dispose });
}
