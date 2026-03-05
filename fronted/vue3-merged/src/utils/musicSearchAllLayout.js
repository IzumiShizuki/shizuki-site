const DEFAULT_MIN = 1;
const DEFAULT_MAX = 12;
const DEFAULT_FALLBACK = 3;
const DEFAULT_CARD_WIDTH = 188;
const DEFAULT_GAP = 10;

export function normalizePlaylistRowCapacity(value, options = {}) {
  const min = Number.isFinite(Number(options?.min)) ? Math.floor(Number(options.min)) : DEFAULT_MIN;
  const max = Number.isFinite(Number(options?.max)) ? Math.floor(Number(options.max)) : DEFAULT_MAX;
  const fallback = Number.isFinite(Number(options?.fallback)) ? Math.floor(Number(options.fallback)) : DEFAULT_FALLBACK;
  const lower = Math.max(1, Math.min(min, max));
  const upper = Math.max(lower, max);

  const numeric = Number(value);
  if (!Number.isFinite(numeric)) {
    return Math.max(lower, Math.min(upper, fallback));
  }
  return Math.max(lower, Math.min(upper, Math.floor(numeric)));
}

export function estimatePlaylistRowCapacity(containerWidth, options = {}) {
  const cardMinWidth = Number.isFinite(Number(options?.cardMinWidth))
    ? Math.max(1, Math.floor(Number(options.cardMinWidth)))
    : DEFAULT_CARD_WIDTH;
  const gap = Number.isFinite(Number(options?.gap)) ? Math.max(0, Math.floor(Number(options.gap))) : DEFAULT_GAP;
  const fallback = Number.isFinite(Number(options?.fallback)) ? Math.floor(Number(options.fallback)) : DEFAULT_FALLBACK;
  const min = Number.isFinite(Number(options?.min)) ? Math.floor(Number(options.min)) : DEFAULT_MIN;
  const max = Number.isFinite(Number(options?.max)) ? Math.floor(Number(options.max)) : DEFAULT_MAX;
  const width = Number(containerWidth);
  if (!Number.isFinite(width) || width <= 0) {
    return normalizePlaylistRowCapacity(fallback, { min, max, fallback });
  }
  const estimated = Math.floor((width + gap) / (cardMinWidth + gap));
  return normalizePlaylistRowCapacity(estimated, { min, max, fallback });
}
