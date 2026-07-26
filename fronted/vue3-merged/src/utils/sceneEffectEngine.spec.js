import { describe, expect, it } from 'vitest';
import {
  computeSceneEffectParticleCount,
  computeSceneEffectState,
  createSceneEffectParticles,
  stepSceneEffectParticles
} from './sceneEffectEngine';

describe('sceneEffectEngine', () => {
  it('disables animation when reduced motion is requested', () => {
    const state = computeSceneEffectState(
      {
        enabled: true,
        presetId: 'sakura',
        density: 1.2,
        opacity: 0.8,
        fallSpeed: 1.4,
        spawnRate: 1.2
      },
      {
        reducedMotion: true,
        isHomeRoute: true
      }
    );

    expect(state.enabled).toBe(false);
    expect(state.paused).toBe(true);
    expect(computeSceneEffectParticleCount(state)).toBe(0);
  });

  it('keeps preset selection while reducing opacity off home route', () => {
    const state = computeSceneEffectState(
      {
        enabled: true,
        presetId: 'fireflies',
        density: 1,
        opacity: 0.9,
        fallSpeed: 1.35,
        spawnRate: 1.5
      },
      {
        reducedMotion: false,
        isHomeRoute: false
      }
    );

    expect(state.presetId).toBe('fireflies');
    expect(state.enabled).toBe(true);
    expect(state.opacity).toBeCloseTo(0.414, 3);
    expect(state.fallSpeed).toBe(1.35);
    expect(state.spawnRate).toBe(1.5);
  });

  it('creates and steps particles with speed and spawn controls', () => {
    const random = () => 0.5;
    const created = createSceneEffectParticles('soft-rain', 800, 600, 4, { fallSpeed: 1.6, spawnRate: 1.4 }, random);
    expect(created).toHaveLength(4);
    expect(created[0].speedY).toBeGreaterThan(280);

    const stepped = stepSceneEffectParticles('soft-rain', created, 16, 800, 600, { fallSpeed: 1.6, spawnRate: 1.4 }, random);
    expect(stepped[0].y).toBeGreaterThan(created[0].y);
  });

  it('lets spawn rate increase particle count', () => {
    const lowSpawnCount = computeSceneEffectParticleCount({
      enabled: true,
      presetId: 'snow',
      density: 1,
      spawnRate: 0.4
    });
    const highSpawnCount = computeSceneEffectParticleCount({
      enabled: true,
      presetId: 'snow',
      density: 1,
      spawnRate: 1.8
    });

    expect(highSpawnCount).toBeGreaterThan(lowSpawnCount);
  });

  it('creates rising bubbles that respawn at the bottom after leaving the top', () => {
    const random = () => 0.5;
    const created = createSceneEffectParticles('bubbles', 800, 600, 3, { fallSpeed: 1 }, random);
    expect(created[0].speedY).toBeLessThan(0);

    const nearTop = created.map((particle) => ({ ...particle, y: -40 }));
    const stepped = stepSceneEffectParticles('bubbles', nearTop, 16, 800, 600, { fallSpeed: 1, spawnRate: 1 }, random);
    expect(stepped[0].y).toBeGreaterThan(600);
  });

  it('mixes meteors with background stars and keeps starfield particles wrapped', () => {
    const random = () => 0.5;
    const meteorMix = createSceneEffectParticles('meteor', 800, 600, 10, { fallSpeed: 1 }, random);
    const meteors = meteorMix.filter((particle) => particle.variant === 'meteor');
    const stars = meteorMix.filter((particle) => particle.variant !== 'meteor');
    expect(meteors.length).toBeGreaterThan(0);
    expect(stars.length).toBeGreaterThan(meteors.length);
    expect(meteors[0].speedY).toBeGreaterThan(100);

    const starParticles = createSceneEffectParticles('starfield', 800, 600, 4, {}, random);
    const pushedOut = starParticles.map((particle) => ({ ...particle, x: 900 }));
    const stepped = stepSceneEffectParticles('starfield', pushedOut, 16, 800, 600, {}, random);
    expect(stepped[0].x).toBeLessThanOrEqual(0);
  });

  it('keeps aurora ribbon count low while other new presets scale normally', () => {
    const auroraCount = computeSceneEffectParticleCount({
      enabled: true,
      presetId: 'aurora',
      density: 0.4,
      spawnRate: 0.4
    });
    const dustCount = computeSceneEffectParticleCount({
      enabled: true,
      presetId: 'dust',
      density: 1,
      spawnRate: 1
    });

    expect(auroraCount).toBeGreaterThanOrEqual(3);
    expect(auroraCount).toBeLessThan(10);
    expect(dustCount).toBeGreaterThan(20);
  });
});
