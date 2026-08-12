export const LEVITATION_BALL_POSITION_STORAGE_KEY = 'shizuki.levitationBall.position.v1';
export const DEFAULT_LEVITATION_BALL_POSITION = Object.freeze({
  version: 1,
  side: 'right',
  yRatio: 0.32
});

function clamp(value, min, max) {
  return Math.min(max, Math.max(min, value));
}

export function normalizeLevitationBallPosition(input) {
  const source = input && typeof input === 'object' && !Array.isArray(input) ? input : {};
  const side = String(source.side || '').trim().toLowerCase() === 'left' ? 'left' : 'right';
  const rawRatio = Number(source.yRatio);
  return {
    version: 1,
    side,
    yRatio: Number.isFinite(rawRatio) ? clamp(rawRatio, 0, 1) : DEFAULT_LEVITATION_BALL_POSITION.yRatio
  };
}

export function resolveLevitationBallCoordinates(
  savedPosition,
  { viewportWidth = 0, viewportHeight = 0, width = 58, height = 58, edgeGap = 8 } = {}
) {
  const saved = normalizeLevitationBallPosition(savedPosition);
  const maxX = Math.max(edgeGap, Number(viewportWidth) - Number(width) - edgeGap);
  const maxY = Math.max(edgeGap, Number(viewportHeight) - Number(height) - edgeGap);
  const availableY = Math.max(0, maxY - edgeGap);
  return {
    side: saved.side,
    x: saved.side === 'left' ? edgeGap : maxX,
    y: clamp(edgeGap + availableY * saved.yRatio, edgeGap, maxY)
  };
}

export function resolveNearestLevitationBallSide(x, { viewportWidth = 0, width = 58 } = {}) {
  const center = Number(x) + Number(width) / 2;
  return center <= Number(viewportWidth) / 2 ? 'left' : 'right';
}

export function resolveLevitationBallYRatio(y, { viewportHeight = 0, height = 58, edgeGap = 8 } = {}) {
  const maxY = Math.max(edgeGap, Number(viewportHeight) - Number(height) - edgeGap);
  const availableY = Math.max(1, maxY - edgeGap);
  return clamp((Number(y) - edgeGap) / availableY, 0, 1);
}

export function readLevitationBallPosition(storage = typeof window !== 'undefined' ? window.localStorage : null) {
  if (!storage?.getItem) return { ...DEFAULT_LEVITATION_BALL_POSITION };
  try {
    const raw = storage.getItem(LEVITATION_BALL_POSITION_STORAGE_KEY);
    return raw ? normalizeLevitationBallPosition(JSON.parse(raw)) : { ...DEFAULT_LEVITATION_BALL_POSITION };
  } catch {
    return { ...DEFAULT_LEVITATION_BALL_POSITION };
  }
}

export function writeLevitationBallPosition(position, storage = typeof window !== 'undefined' ? window.localStorage : null) {
  const normalized = normalizeLevitationBallPosition(position);
  if (storage?.setItem) {
    try {
      storage.setItem(LEVITATION_BALL_POSITION_STORAGE_KEY, JSON.stringify(normalized));
    } catch {
      // Ignore unavailable storage; the current session still keeps its position.
    }
  }
  return normalized;
}
