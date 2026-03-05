import { computed, onBeforeUnmount, onMounted, ref } from 'vue';

function normalizeBreakpoint(value, fallback) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric) || numeric <= 0) {
    return fallback;
  }
  return numeric;
}

export function useBlogResponsiveLayout(options = {}) {
  const desktopBreakpoint = normalizeBreakpoint(options.desktopBreakpoint, 1366);
  const mobileBreakpoint = normalizeBreakpoint(options.mobileBreakpoint, 980);
  const viewportWidth = ref(typeof window === 'undefined' ? desktopBreakpoint : window.innerWidth);

  let desktopMediaQuery = null;
  let mobileMediaQuery = null;
  let mediaChangeHandler = null;

  const syncViewportWidth = () => {
    if (typeof window === 'undefined') return;
    viewportWidth.value = window.innerWidth;
  };

  const isNarrowDesktop = computed(
    () => viewportWidth.value < desktopBreakpoint && viewportWidth.value >= mobileBreakpoint
  );
  const isMobileLike = computed(() => viewportWidth.value < mobileBreakpoint);
  const recommendedRightCollapsed = computed(() => isNarrowDesktop.value);

  onMounted(() => {
    if (typeof window === 'undefined') return;
    desktopMediaQuery = window.matchMedia(`(max-width: ${desktopBreakpoint - 0.02}px)`);
    mobileMediaQuery = window.matchMedia(`(max-width: ${mobileBreakpoint - 0.02}px)`);

    mediaChangeHandler = () => {
      syncViewportWidth();
    };

    if (desktopMediaQuery?.addEventListener) {
      desktopMediaQuery.addEventListener('change', mediaChangeHandler);
      mobileMediaQuery?.addEventListener?.('change', mediaChangeHandler);
    } else {
      desktopMediaQuery?.addListener?.(mediaChangeHandler);
      mobileMediaQuery?.addListener?.(mediaChangeHandler);
    }

    window.addEventListener('resize', syncViewportWidth, { passive: true });
    syncViewportWidth();
  });

  onBeforeUnmount(() => {
    if (typeof window === 'undefined') return;
    window.removeEventListener('resize', syncViewportWidth);
    if (!mediaChangeHandler) return;
    if (desktopMediaQuery?.removeEventListener) {
      desktopMediaQuery.removeEventListener('change', mediaChangeHandler);
      mobileMediaQuery?.removeEventListener?.('change', mediaChangeHandler);
    } else {
      desktopMediaQuery?.removeListener?.(mediaChangeHandler);
      mobileMediaQuery?.removeListener?.(mediaChangeHandler);
    }
  });

  return {
    viewportWidth,
    isNarrowDesktop,
    isMobileLike,
    recommendedRightCollapsed
  };
}
