export const TOP_MENU_COMPACT_SCROLL_THRESHOLD = 96;

export function resolveTopMenuPresentation({ scrollTop = 0, manualExpanded = false } = {}) {
  const normalizedScrollTop = Number.isFinite(Number(scrollTop))
    ? Math.max(0, Math.round(Number(scrollTop)))
    : 0;
  const pastThreshold = normalizedScrollTop >= TOP_MENU_COMPACT_SCROLL_THRESHOLD;
  const compact = pastThreshold && manualExpanded !== true;
  return Object.freeze({
    normalizedScrollTop,
    pastThreshold,
    compact,
    full: !compact
  });
}
