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

const PRESET_BASE_PARTICLE_COUNT = Object.freeze({
  sakura: 54,
  snow: 54,
  'soft-rain': 90,
  fireflies: 34,
  leaves: 34,
  starfield: 96,
  meteor: 40,
  bubbles: 38,
  dust: 46,
  aurora: 7
});

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
  const baseCount = PRESET_BASE_PARTICLE_COUNT[presetId] ?? 54;
  const minCount = presetId === 'aurora' ? 3 : 8;
  return Math.max(
    minCount,
    Math.round(baseCount * clampDensity(effectState.density) * clampEffectRate(effectState.spawnRate, DEFAULT_EFFECT_SPAWN_RATE))
  );
}

function createClassicParticle(preset, index, safeWidth, safeHeight, fallSpeed, spawnRate, randomFn) {
  const seeded = randomFn();
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
}

function createStarParticle(preset, index, safeWidth, safeHeight, randomFn) {
  const brightness = randomFn();
  return {
    id: `${preset}-${index}`,
    x: randomFn() * safeWidth,
    y: randomFn() * safeHeight,
    size: 0.7 + randomFn() * (brightness > 0.82 ? 2.6 : 1.4),
    speedX: (-3 + randomFn() * 6) * 0.4,
    speedY: (-2 + randomFn() * 4) * 0.4,
    drift: randomFn() * Math.PI * 2,
    rotation: randomFn() * Math.PI * 2,
    alpha: 0.14 + randomFn() * 0.8,
    variant: brightness > 0.82 ? 'bright-star' : 'star'
  };
}

function createMeteorParticle(preset, index, safeWidth, safeHeight, fallSpeed, randomFn) {
  const speed = (300 + randomFn() * 260) * fallSpeed;
  return {
    id: `${preset}-${index}`,
    x: randomFn() * safeWidth * 1.3 - safeWidth * 0.25,
    y: -safeHeight * (0.08 + randomFn() * 1.5),
    size: 64 + randomFn() * 96,
    speedX: speed * 0.62,
    speedY: speed * 0.78,
    drift: 0,
    rotation: Math.atan2(0.78, 0.62),
    alpha: 0.45 + randomFn() * 0.55,
    variant: 'meteor'
  };
}

export function createSceneEffectParticles(presetId, width, height, count, options = {}, random = Math.random) {
  const { effectOptions, randomFn } = resolveEffectRuntimeOptions(options, random);
  const safeWidth = Math.max(1, Number(width || 0));
  const safeHeight = Math.max(1, Number(height || 0));
  const fallSpeed = clampEffectRate(effectOptions.fallSpeed, DEFAULT_EFFECT_FALL_SPEED);
  const spawnRate = clampEffectRate(effectOptions.spawnRate, DEFAULT_EFFECT_SPAWN_RATE);
  const preset = String(presetId || 'none');
  const total = Math.max(0, count);

  return Array.from({ length: total }, (_, index) => {
    if (preset === 'starfield') {
      return createStarParticle(preset, index, safeWidth, safeHeight, randomFn);
    }

    if (preset === 'meteor') {
      if (index % 5 === 0) {
        return createMeteorParticle(preset, index, safeWidth, safeHeight, fallSpeed, randomFn);
      }
      return createStarParticle(preset, index, safeWidth, safeHeight, randomFn);
    }

    if (preset === 'bubbles') {
      return {
        id: `${preset}-${index}`,
        x: randomFn() * safeWidth,
        y: randomFn() * safeHeight,
        size: 2.6 + randomFn() * 7.4,
        speedX: (-4 + randomFn() * 8) * 0.6,
        speedY: -(20 + randomFn() * 44) * fallSpeed,
        drift: 0.6 + randomFn() * 1.1,
        rotation: randomFn() * Math.PI * 2,
        alpha: 0.26 + randomFn() * 0.6
      };
    }

    if (preset === 'dust') {
      return {
        id: `${preset}-${index}`,
        x: randomFn() * safeWidth,
        y: randomFn() * safeHeight,
        size: 1.3 + randomFn() * 3.4,
        speedX: (-7 + randomFn() * 14) * 0.5 * Math.max(0.6, fallSpeed),
        speedY: (-5 + randomFn() * 10) * 0.5 * Math.max(0.6, fallSpeed),
        drift: (-1 + randomFn() * 2) * 0.8,
        rotation: randomFn() * Math.PI * 2,
        alpha: 0.1 + randomFn() * 0.5
      };
    }

    if (preset === 'aurora') {
      return {
        id: `${preset}-${index}`,
        x: (index / Math.max(1, total)) * safeWidth * 1.2 - safeWidth * 0.1,
        y: safeHeight * (0.02 + randomFn() * 0.26),
        size: 140 + randomFn() * 200,
        speedX: (4 + randomFn() * 9) * Math.max(0.5, fallSpeed * 0.6),
        speedY: 0,
        drift: randomFn(),
        rotation: -0.4 + randomFn() * 0.8,
        alpha: 0.1 + randomFn() * 0.18
      };
    }

    if (preset === 'leaves') {
      return {
        id: `${preset}-${index}`,
        x: randomFn() * safeWidth,
        y: randomFn() * safeHeight - safeHeight * Math.max(0, (1 - spawnRate) * 0.34),
        size: 9 + randomFn() * 12,
        speedX: (-14 + randomFn() * 20) * fallSpeed,
        speedY: (24 + randomFn() * 44) * fallSpeed,
        drift: (-1 + randomFn() * 2) * 1.4,
        rotation: randomFn() * Math.PI * 2,
        alpha: 0.42 + randomFn() * 0.58
      };
    }

    return createClassicParticle(preset, index, safeWidth, safeHeight, fallSpeed, spawnRate, randomFn);
  });
}

function respawnFromTop(next, safeWidth, safeHeight, spawnRate, randomFn) {
  next.x = randomFn() * safeWidth;
  next.y = -20 - randomFn() * Math.max(6, safeHeight * Math.max(0.02, (1.16 - spawnRate) * 0.16));
  next.alpha = 0.28 + randomFn() * 0.72;
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

    if (normalizedPreset === 'starfield' || (normalizedPreset === 'meteor' && next.variant !== 'meteor')) {
      next.x += next.speedX * dt;
      next.y += next.speedY * dt;
      next.drift += dt * (0.5 + fallSpeed * 0.5);
      next.alpha = Math.max(0.08, Math.min(1, next.alpha + (-0.7 + randomFn() * 1.4) * dt * 1.1));
      if (next.x < -12) next.x = safeWidth + 8;
      if (next.x > safeWidth + 12) next.x = -8;
      if (next.y < -12) next.y = safeHeight + 8;
      if (next.y > safeHeight + 12) next.y = -8;
      return next;
    }

    if (normalizedPreset === 'meteor') {
      next.x += next.speedX * dt;
      next.y += next.speedY * dt;
      if (next.y > safeHeight + 80 || next.x > safeWidth + 120) {
        next.x = randomFn() * safeWidth * 1.3 - safeWidth * 0.25;
        next.y = -safeHeight * (0.1 + randomFn() * (2.1 - spawnRate));
        next.alpha = 0.45 + randomFn() * 0.55;
      }
      return next;
    }

    if (normalizedPreset === 'bubbles') {
      next.rotation += dt * (1.3 + next.drift * 0.5);
      next.x += next.speedX * dt + Math.sin(next.rotation * 2.1) * 12 * dt * next.drift;
      next.y += next.speedY * dt;
      if (next.y < -30) {
        next.x = randomFn() * safeWidth;
        next.y = safeHeight + 16 + randomFn() * Math.max(10, safeHeight * Math.max(0.02, (1.16 - spawnRate) * 0.16));
        next.alpha = 0.26 + randomFn() * 0.6;
      }
      return next;
    }

    if (normalizedPreset === 'dust') {
      next.rotation += dt * 0.5;
      next.x += next.speedX * dt + next.drift * dt * 6;
      next.y += next.speedY * dt + Math.sin(next.rotation) * 4 * dt;
      next.alpha = Math.max(0.05, Math.min(0.7, next.alpha + (-0.22 + randomFn() * 0.44) * dt));
      if (next.x < -16) next.x = safeWidth + 12;
      if (next.x > safeWidth + 16) next.x = -12;
      if (next.y < -16) next.y = safeHeight + 12;
      if (next.y > safeHeight + 16) next.y = -12;
      return next;
    }

    if (normalizedPreset === 'aurora') {
      next.x += next.speedX * dt;
      next.rotation += Math.sin(next.drift * 6.28 + next.x * 0.002) * dt * 0.03;
      next.alpha = Math.max(0.06, Math.min(0.3, next.alpha + (-0.05 + randomFn() * 0.1) * dt));
      if (next.x - next.size > safeWidth) {
        next.x = -next.size * 1.2;
        next.y = safeHeight * (0.02 + randomFn() * 0.26);
      }
      return next;
    }

    if (normalizedPreset === 'leaves') {
      next.rotation += dt * 1.5 * Math.max(0.84, fallSpeed);
      next.x += next.speedX * dt + Math.sin(next.rotation * 0.9) * 16 * dt + next.drift * dt * 10;
      next.y += next.speedY * dt + Math.cos(next.rotation * 0.7) * 6 * dt;
      if (next.y > safeHeight + 26 || next.x < -32 || next.x > safeWidth + 32) {
        respawnFromTop(next, safeWidth, safeHeight, spawnRate, randomFn);
      }
      return next;
    }

    next.x += next.speedX * dt + next.drift * dt * 14;
    next.y += next.speedY * dt;
    next.rotation += dt * (normalizedPreset === 'sakura' ? 1.2 : 0.4) * Math.max(0.84, fallSpeed);

    if (normalizedPreset === 'fireflies') {
      next.alpha = Math.max(0.12, Math.min(1, next.alpha + (-0.3 + randomFn() * 0.6) * dt));
      next.y += Math.sin(next.rotation) * 8 * dt;
    }

    if (next.y > safeHeight + 22 || next.x < -28 || next.x > safeWidth + 28) {
      respawnFromTop(next, safeWidth, safeHeight, spawnRate, randomFn);
    }

    return next;
  });
}
