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
});
