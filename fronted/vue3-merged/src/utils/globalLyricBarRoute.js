const GLOBAL_LYRIC_BAR_EXCLUDED_ROUTE_ROOTS = ['/auth', '/m'];

export function shouldHideGlobalLyricBarOnRoute(routePath) {
  if (typeof routePath !== 'string') return false;
  return GLOBAL_LYRIC_BAR_EXCLUDED_ROUTE_ROOTS.some((routeRoot) => (
    routePath === routeRoot || routePath.startsWith(`${routeRoot}/`)
  ));
}

export function shouldShowGlobalLyricBar({
  subtitleVisible,
  hasCurrentTrack,
  routePath,
  isMusicLibraryRoute,
  isFocusActive,
  isDesktopHomeSurface
} = {}) {
  return Boolean(
    subtitleVisible
    && hasCurrentTrack
    && (!isMusicLibraryRoute || isFocusActive)
    && !shouldHideGlobalLyricBarOnRoute(routePath)
    && !isDesktopHomeSurface
  );
}