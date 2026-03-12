import { describe, expect, it } from 'vitest';
import {
  resolveEffectPreviewTokens,
  resolveEffectPreviewVars,
  resolveEffectStrength
} from './atmosphereEffectPreview';

describe('atmosphereEffectPreview', () => {
  it('computes a disabled strength summary for none preset or disabled state', () => {
    expect(resolveEffectStrength({ enabled: false, presetId: 'sakura', density: 1.4, opacity: 0.8 })).toMatchObject({
      enabled: false,
      percent: 0,
      label: '关闭'
    });

    expect(resolveEffectStrength({ enabled: true, presetId: 'none', density: 1.4, opacity: 0.8 })).toMatchObject({
      enabled: false,
      percent: 0,
      label: '关闭'
    });
  });

  it('maps active effect state to density/opacity percentages and intensity labels', () => {
    const soft = resolveEffectStrength({ enabled: true, presetId: 'sakura', density: 0.55, opacity: 0.28, fallSpeed: 0.52, spawnRate: 0.48 });
    const strong = resolveEffectStrength({ enabled: true, presetId: 'fireflies', density: 1.72, opacity: 0.94, fallSpeed: 1.68, spawnRate: 1.72 });

    expect(soft.label).toBe('柔');
    expect(soft.percent).toBeGreaterThan(0);
    expect(strong.label).toBe('强');
    expect(strong.percent).toBeGreaterThan(soft.percent);
    expect(strong.densityPercent).toBeGreaterThan(soft.densityPercent);
    expect(strong.opacityPercent).toBeGreaterThan(soft.opacityPercent);
    expect(strong.fallSpeedPercent).toBeGreaterThan(soft.fallSpeedPercent);
    expect(strong.spawnRatePercent).toBeGreaterThan(soft.spawnRatePercent);
  });

  it('returns preview tokens and css vars for effect previews', () => {
    const rainTokens = resolveEffectPreviewTokens('soft-rain', { spawnRate: 1.8 });
    const rainLowSpawnTokens = resolveEffectPreviewTokens('soft-rain', { spawnRate: 0.4 });
    const fallbackTokens = resolveEffectPreviewTokens('unknown');
    const vars = resolveEffectPreviewVars({ density: 1.8, opacity: 0.95, fallSpeed: 1.8, spawnRate: 1.8 }, { active: true });

    expect(rainTokens).toHaveLength(5);
    expect(rainLowSpawnTokens).toHaveLength(2);
    expect(rainTokens[0].kind).toBe('streak');
    expect(fallbackTokens).toHaveLength(2);
    expect(vars['--effect-preview-density-scale']).toBe('1.540');
    expect(vars['--effect-preview-opacity-scale']).toBe('1.222');
    expect(vars['--effect-preview-drift-scale']).toBe('0.700');
  });
});
