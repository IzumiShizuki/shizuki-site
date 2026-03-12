import { DEFAULT_EFFECT_DENSITY, DEFAULT_EFFECT_OPACITY, EFFECT_PRESET_DEFINITIONS } from './atmosphereCatalog';

function clampUnit(value, fallback) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return fallback;
  return Math.max(0, Math.min(1, numeric));
}

function clampDensity(value) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return DEFAULT_EFFECT_DENSITY;
  return Math.max(0.4, Math.min(1.8, Number(numeric.toFixed(2))));
}

export function computeSceneEffectState(effect, options = {}) {
  const source = effect && typeof effect === 'object' ? effect : {};
  const presetId = EFFECT_PRESET_DEFINITIONS.some((item) => item.id === source.presetId) ? source.presetId : 'none';
  const reducedMotion = Boolean(options.reducedMotion);
  const isHomeRoute = options.isHomeRoute !== false;
  const enabled = Boolean(source.enabled) && presetId !== 'none' && !reducedMotion;

  return {
    presetId,
    enabled,
    paused: !enabled,
    density: enabled ? clampDensity(source.density) : 0,
    opacity: enabled ? clampUnit(source.opacity, DEFAULT_EFFECT_OPACITY) * (isHomeRoute ? 1 : 0.46) : 0,
    reducedMotion
  };
}

export function computeSceneEffectParticleCount(effectState) {
  if (!effectState?.enabled) return 0;
  const presetId = String(effectState.presetId || 'none');
  const baseCount = presetId === 'soft-rain' ? 90 : presetId === 'fireflies' ? 34 : 54;
  return Math.max(8, Math.round(baseCount * clampDensity(effectState.density)));
}

export function createSceneEffectParticles(presetId, width, height, count, random = Math.random) {
  const safeWidth = Math.max(1, Number(width || 0));
  const safeHeight = Math.max(1, Number(height || 0));
  return Array.from({ length: Math.max(0, count) }, (_, index) => {
    const seeded = random();
    const preset = String(presetId || 'none');
    return {
      id: `${preset}-${index}`,
      x: seeded * safeWidth,
      y: random() * safeHeight,
      size: preset === 'fireflies' ? 1.6 + random() * 2.4 : 4 + random() * 10,
      speedX: preset === 'soft-rain' ? -8 - random() * 16 : -4 + random() * 8,
      speedY:
        preset === 'soft-rain'
          ? 180 + random() * 220
          : preset === 'snow'
            ? 16 + random() * 32
            : preset === 'fireflies'
              ? -4 + random() * 8
              : 22 + random() * 48,
      drift: -1 + random() * 2,
      rotation: random() * Math.PI * 2,
      alpha: 0.3 + random() * 0.7
    };
  });
}

export function stepSceneEffectParticles(presetId, particles, dtMs, width, height, random = Math.random) {
  const safeWidth = Math.max(1, Number(width || 0));
  const safeHeight = Math.max(1, Number(height || 0));
  const dt = Math.max(0.001, Number(dtMs || 16) / 1000);
  const normalizedPreset = String(presetId || 'none');

  return (Array.isArray(particles) ? particles : []).map((particle) => {
    const next = { ...particle };
    next.x += next.speedX * dt + next.drift * dt * 14;
    next.y += next.speedY * dt;
    next.rotation += dt * (normalizedPreset === 'sakura' ? 1.2 : 0.4);

    if (normalizedPreset === 'fireflies') {
      next.alpha = Math.max(0.12, Math.min(1, next.alpha + (-0.3 + random() * 0.6) * dt));
      next.y += Math.sin(next.rotation) * 8 * dt;
    }

    if (next.y > safeHeight + 22 || next.x < -28 || next.x > safeWidth + 28) {
      next.x = random() * safeWidth;
      next.y = -20;
      next.alpha = 0.28 + random() * 0.72;
    }

    return next;
  });
}
