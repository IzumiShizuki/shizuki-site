import {
  DEFAULT_EFFECT_DENSITY,
  DEFAULT_EFFECT_FALL_SPEED,
  DEFAULT_EFFECT_OPACITY,
  DEFAULT_EFFECT_SPAWN_RATE,
  EFFECT_PRESET_DEFINITIONS
} from './atmosphereCatalog';

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

function clampEffectRate(value, fallback) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return fallback;
  return Math.max(0.4, Math.min(1.8, Number(numeric.toFixed(2))));
}

function resolveEffectRuntimeOptions(options, random) {
  if (typeof options === 'function') {
    return {
      effectOptions: {},
      randomFn: options
    };
  }
  return {
    effectOptions: options && typeof options === 'object' ? options : {},
    randomFn: typeof random === 'function' ? random : Math.random
  };
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
    fallSpeed: clampEffectRate(source.fallSpeed, DEFAULT_EFFECT_FALL_SPEED),
    spawnRate: clampEffectRate(source.spawnRate, DEFAULT_EFFECT_SPAWN_RATE),
    reducedMotion
  };
}

export function computeSceneEffectParticleCount(effectState) {
  if (!effectState?.enabled) return 0;
  const presetId = String(effectState.presetId || 'none');
  const baseCount = presetId === 'soft-rain' ? 90 : presetId === 'fireflies' ? 34 : 54;
  return Math.max(8, Math.round(baseCount * clampDensity(effectState.density) * clampEffectRate(effectState.spawnRate, DEFAULT_EFFECT_SPAWN_RATE)));
}

export function createSceneEffectParticles(presetId, width, height, count, options = {}, random = Math.random) {
  const { effectOptions, randomFn } = resolveEffectRuntimeOptions(options, random);
  const safeWidth = Math.max(1, Number(width || 0));
  const safeHeight = Math.max(1, Number(height || 0));
  const fallSpeed = clampEffectRate(effectOptions.fallSpeed, DEFAULT_EFFECT_FALL_SPEED);
  const spawnRate = clampEffectRate(effectOptions.spawnRate, DEFAULT_EFFECT_SPAWN_RATE);
  return Array.from({ length: Math.max(0, count) }, (_, index) => {
    const seeded = randomFn();
    const preset = String(presetId || 'none');
    return {
      id: `${preset}-${index}`,
      x: seeded * safeWidth,
      y: randomFn() * safeHeight - safeHeight * Math.max(0, (1 - spawnRate) * 0.34),
      size: preset === 'fireflies' ? 1.6 + randomFn() * 2.4 : 4 + randomFn() * 10,
      speedX: (preset === 'soft-rain' ? -8 - randomFn() * 16 : -4 + randomFn() * 8) * fallSpeed,
      speedY:
        preset === 'soft-rain'
          ? (180 + randomFn() * 220) * fallSpeed
          : preset === 'snow'
            ? (16 + randomFn() * 32) * fallSpeed
            : preset === 'fireflies'
              ? (-4 + randomFn() * 8) * Math.max(0.7, fallSpeed)
              : (22 + randomFn() * 48) * fallSpeed,
      drift: (-1 + randomFn() * 2) * (0.82 + spawnRate * 0.18),
      rotation: randomFn() * Math.PI * 2,
      alpha: 0.3 + randomFn() * 0.7
    };
  });
}

export function stepSceneEffectParticles(presetId, particles, dtMs, width, height, options = {}, random = Math.random) {
  const { effectOptions, randomFn } = resolveEffectRuntimeOptions(options, random);
  const safeWidth = Math.max(1, Number(width || 0));
  const safeHeight = Math.max(1, Number(height || 0));
  const dt = Math.max(0.001, Number(dtMs || 16) / 1000);
  const normalizedPreset = String(presetId || 'none');
  const fallSpeed = clampEffectRate(effectOptions.fallSpeed, DEFAULT_EFFECT_FALL_SPEED);
  const spawnRate = clampEffectRate(effectOptions.spawnRate, DEFAULT_EFFECT_SPAWN_RATE);

  return (Array.isArray(particles) ? particles : []).map((particle) => {
    const next = { ...particle };
    next.x += next.speedX * dt + next.drift * dt * 14;
    next.y += next.speedY * dt;
    next.rotation += dt * (normalizedPreset === 'sakura' ? 1.2 : 0.4) * Math.max(0.84, fallSpeed);

    if (normalizedPreset === 'fireflies') {
      next.alpha = Math.max(0.12, Math.min(1, next.alpha + (-0.3 + randomFn() * 0.6) * dt));
      next.y += Math.sin(next.rotation) * 8 * dt;
    }

    if (next.y > safeHeight + 22 || next.x < -28 || next.x > safeWidth + 28) {
      next.x = randomFn() * safeWidth;
      next.y = -20 - randomFn() * Math.max(6, safeHeight * Math.max(0.02, (1.16 - spawnRate) * 0.16));
      next.alpha = 0.28 + randomFn() * 0.72;
    }

    return next;
  });
}
