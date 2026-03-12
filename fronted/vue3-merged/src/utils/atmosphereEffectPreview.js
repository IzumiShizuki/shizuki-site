const MIN_EFFECT_DENSITY = 0.4;
const MAX_EFFECT_DENSITY = 1.8;

function clampNumber(value, min, max) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return min;
  return Math.min(max, Math.max(min, numeric));
}

function toPreviewStyle({
  x,
  y,
  size,
  delay = 0,
  duration = 4.8,
  rotate = 0,
  opacity = 0.84,
  blur = 0
}) {
  return {
    '--preview-x': `${x}%`,
    '--preview-y': `${y}%`,
    '--preview-size': `${size}px`,
    '--preview-delay': `${delay}s`,
    '--preview-duration': `${duration}s`,
    '--preview-rotate': `${rotate}deg`,
    '--preview-opacity': String(opacity),
    '--preview-blur': `${blur}px`
  };
}

const EFFECT_PREVIEW_TOKENS = Object.freeze({
  none: Object.freeze([
    { kind: 'quiet', style: toPreviewStyle({ x: 28, y: 34, size: 20, delay: 0.1, duration: 6.4, opacity: 0.55, blur: 1 }) },
    { kind: 'quiet', style: toPreviewStyle({ x: 68, y: 58, size: 28, delay: 1.2, duration: 7.1, opacity: 0.42, blur: 2 }) }
  ]),
  sakura: Object.freeze([
    { kind: 'petal', style: toPreviewStyle({ x: 18, y: 20, size: 18, delay: 0.2, duration: 4.8, rotate: -18, opacity: 0.92 }) },
    { kind: 'petal', style: toPreviewStyle({ x: 34, y: 44, size: 16, delay: 1.1, duration: 5.6, rotate: 28, opacity: 0.86 }) },
    { kind: 'petal', style: toPreviewStyle({ x: 56, y: 18, size: 20, delay: 0.7, duration: 5.1, rotate: 16, opacity: 0.88 }) },
    { kind: 'petal', style: toPreviewStyle({ x: 74, y: 52, size: 17, delay: 1.7, duration: 4.9, rotate: -26, opacity: 0.8 }) },
    { kind: 'petal', style: toPreviewStyle({ x: 48, y: 72, size: 15, delay: 2.1, duration: 5.8, rotate: 36, opacity: 0.76 }) }
  ]),
  snow: Object.freeze([
    { kind: 'flake', style: toPreviewStyle({ x: 20, y: 24, size: 8, delay: 0.2, duration: 5.6, opacity: 0.96 }) },
    { kind: 'flake', style: toPreviewStyle({ x: 36, y: 54, size: 10, delay: 0.8, duration: 6.2, opacity: 0.84 }) },
    { kind: 'flake', style: toPreviewStyle({ x: 58, y: 18, size: 9, delay: 1.3, duration: 5.1, opacity: 0.92 }) },
    { kind: 'flake', style: toPreviewStyle({ x: 70, y: 42, size: 11, delay: 0.5, duration: 6.8, opacity: 0.78 }) },
    { kind: 'flake', style: toPreviewStyle({ x: 44, y: 78, size: 7, delay: 1.9, duration: 5.7, opacity: 0.72 }) },
    { kind: 'flake', style: toPreviewStyle({ x: 80, y: 70, size: 6, delay: 1.1, duration: 6.5, opacity: 0.66 }) }
  ]),
  'soft-rain': Object.freeze([
    { kind: 'streak', style: toPreviewStyle({ x: 22, y: 18, size: 26, delay: 0.1, duration: 2.4, rotate: 16, opacity: 0.78 }) },
    { kind: 'streak', style: toPreviewStyle({ x: 36, y: 44, size: 30, delay: 0.6, duration: 2.8, rotate: 14, opacity: 0.72 }) },
    { kind: 'streak', style: toPreviewStyle({ x: 54, y: 24, size: 28, delay: 1.0, duration: 2.6, rotate: 18, opacity: 0.82 }) },
    { kind: 'streak', style: toPreviewStyle({ x: 68, y: 50, size: 32, delay: 0.4, duration: 2.9, rotate: 15, opacity: 0.74 }) },
    { kind: 'streak', style: toPreviewStyle({ x: 80, y: 30, size: 24, delay: 1.3, duration: 2.3, rotate: 17, opacity: 0.7 }) }
  ]),
  fireflies: Object.freeze([
    { kind: 'glow', style: toPreviewStyle({ x: 22, y: 26, size: 18, delay: 0.2, duration: 4.6, opacity: 0.88, blur: 1 }) },
    { kind: 'glow', style: toPreviewStyle({ x: 40, y: 62, size: 15, delay: 1.4, duration: 5.8, opacity: 0.74, blur: 2 }) },
    { kind: 'glow', style: toPreviewStyle({ x: 58, y: 36, size: 20, delay: 0.9, duration: 4.9, opacity: 0.92, blur: 1 }) },
    { kind: 'glow', style: toPreviewStyle({ x: 72, y: 54, size: 16, delay: 1.8, duration: 5.4, opacity: 0.68, blur: 2 }) },
    { kind: 'glow', style: toPreviewStyle({ x: 52, y: 78, size: 13, delay: 2.2, duration: 6.1, opacity: 0.62, blur: 3 }) }
  ])
});

export function resolveEffectStrength(effectState) {
  const presetId = String(effectState?.presetId || 'none').trim() || 'none';
  const enabled = Boolean(effectState?.enabled) && presetId !== 'none';
  const density = clampNumber(effectState?.density, MIN_EFFECT_DENSITY, MAX_EFFECT_DENSITY);
  const opacity = clampNumber(effectState?.opacity, 0, 1);
  const densityPercent = Math.round(((density - MIN_EFFECT_DENSITY) / (MAX_EFFECT_DENSITY - MIN_EFFECT_DENSITY)) * 100);
  const opacityPercent = Math.round(opacity * 100);
  const percent = enabled ? Math.round(densityPercent * 0.58 + opacityPercent * 0.42) : 0;
  let label = '关闭';
  if (enabled && percent >= 68) label = '强';
  else if (enabled && percent >= 34) label = '中';
  else if (enabled) label = '柔';
  return {
    enabled,
    percent,
    label,
    densityPercent,
    opacityPercent
  };
}

export function resolveEffectPreviewTokens(presetId) {
  const normalized = String(presetId || 'none').trim() || 'none';
  return EFFECT_PREVIEW_TOKENS[normalized] || EFFECT_PREVIEW_TOKENS.none;
}

export function resolveEffectPreviewVars(effectState, options = {}) {
  const active = Boolean(options.active);
  const density = clampNumber(effectState?.density, MIN_EFFECT_DENSITY, MAX_EFFECT_DENSITY);
  const opacity = clampNumber(effectState?.opacity, 0, 1);
  const normalizedDensity = (density - MIN_EFFECT_DENSITY) / (MAX_EFFECT_DENSITY - MIN_EFFECT_DENSITY);
  const densityScale = active ? 0.82 + normalizedDensity * 0.72 : 0.94;
  const opacityScale = active ? 0.4 + opacity * 0.78 : 0.74;
  const driftScale = active ? 0.9 + normalizedDensity * 0.38 : 0.96;
  return {
    '--effect-preview-density-scale': densityScale.toFixed(3),
    '--effect-preview-opacity-scale': opacityScale.toFixed(3),
    '--effect-preview-drift-scale': driftScale.toFixed(3)
  };
}
