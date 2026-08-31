import { computed, inject, onScopeDispose, provide, ref, shallowRef, unref, watch } from 'vue';

export const APP_SCROLL_ROOT_KEY = Symbol('app-scroll-root');

function normalizeScrollTop(value) {
  const numericValue = Number(value);
  return Number.isFinite(numericValue) ? Math.max(0, numericValue) : 0;
}

function isScrollableElement(value) {
  return typeof HTMLElement !== 'undefined' && value instanceof HTMLElement;
}

export function createAppScrollOwnerController() {
  const element = shallowRef(null);
  let activeClaim = null;

  function claim(nextElement) {
    if (!isScrollableElement(nextElement)) return () => {};
    const claimToken = Symbol('app-scroll-owner-claim');
    activeClaim = claimToken;
    element.value = nextElement;

    return () => {
      if (activeClaim !== claimToken) return;
      activeClaim = null;
      element.value = null;
    };
  }

  function clear() {
    activeClaim = null;
    element.value = null;
  }

  return {
    element,
    claim,
    clear
  };
}

export function useActiveScrollSource(sourceRef) {
  const activeSource = shallowRef(null);
  const scrollTop = ref(0);
  let removeScrollListener = null;

  function detach() {
    removeScrollListener?.();
    removeScrollListener = null;
    activeSource.value = null;
  }

  function bind(nextSource) {
    detach();
    const source = unref(nextSource);
    if (!isScrollableElement(source)) {
      scrollTop.value = 0;
      return;
    }

    const handleScroll = (event) => {
      if (event.currentTarget !== activeSource.value) return;
      scrollTop.value = normalizeScrollTop(activeSource.value?.scrollTop);
    };

    activeSource.value = source;
    scrollTop.value = normalizeScrollTop(source.scrollTop);
    source.addEventListener('scroll', handleScroll, { passive: true });
    removeScrollListener = () => source.removeEventListener('scroll', handleScroll);
  }

  const stopWatching = watch(
    () => unref(sourceRef),
    (nextSource) => bind(nextSource),
    { immediate: true, flush: 'post' }
  );

  onScopeDispose(() => {
    stopWatching();
    detach();
  });

  return {
    activeSource,
    scrollTop
  };
}

export function provideAppScrollRoot(context) {
  provide(APP_SCROLL_ROOT_KEY, context);
  return context;
}

export function useAppScrollRoot() {
  const context = inject(APP_SCROLL_ROOT_KEY, null);
  const inactive = computed(() => false);
  const emptyElement = shallowRef(null);
  const emptyScrollTop = ref(0);

  return {
    element: context?.element || emptyElement,
    isActive: context?.isActive || inactive,
    scrollTop: context?.scrollTop || emptyScrollTop,
    claimScrollOwner: context?.claimScrollOwner || (() => () => {}),
    clearScrollOwner: context?.clearScrollOwner || (() => {})
  };
}
