import { describe, expect, it } from 'vitest';
import {
  DEFAULT_PALETTE_STYLE,
  normalizePaletteStyle,
  resolveM3DynamicPalette,
  roleNameToCssVariable
} from './m3DynamicPalette';

describe('m3DynamicPalette', () => {
  it('normalizes supported personalities and falls back safely', () => {
    expect(normalizePaletteStyle('EXPRESSIVE')).toBe('expressive');
    expect(normalizePaletteStyle('vibrant')).toBe('vibrant');
    expect(normalizePaletteStyle('unknown')).toBe(DEFAULT_PALETTE_STYLE);
  });

  it('resolves paired semantic roles from a solid seed', () => {
    const palette = resolveM3DynamicPalette({
      primaryHex: '#F2B39D',
      accentMode: 'solid',
      isDark: false,
      paletteStyle: 'soft'
    });

    expect(palette.usesCompanion).toBe(false);
    expect(palette.roles.primary).toMatch(/^#[0-9A-F]{6}$/);
    expect(palette.roles.onPrimary).toMatch(/^#[0-9A-F]{6}$/);
    expect(palette.roles.primary).not.toBe(palette.roles.onPrimary);
    expect(palette.roles.surfaceContainerLow).not.toBe(palette.roles.surfaceContainerHighest);
  });

  it('uses the second gradient endpoint for companion color families', () => {
    const gradient = resolveM3DynamicPalette({
      primaryHex: '#F472B6',
      companionHex: '#34D399',
      accentMode: 'gradient',
      isDark: true,
      paletteStyle: 'expressive'
    });
    const primaryOnly = resolveM3DynamicPalette({
      primaryHex: '#F472B6',
      companionHex: '#F472B6',
      accentMode: 'gradient',
      isDark: true,
      paletteStyle: 'expressive'
    });

    expect(gradient.usesCompanion).toBe(true);
    expect(gradient.roles.primary).toBe(primaryOnly.roles.primary);
    expect(gradient.roles.secondary).not.toBe(primaryOnly.roles.secondary);
    expect(gradient.roles.tertiary).not.toBe(primaryOnly.roles.tertiary);
  });

  it('changes tonal roles between day and night schemes', () => {
    const day = resolveM3DynamicPalette({ primaryHex: '#9EC8FF', isDark: false, paletteStyle: 'vibrant' });
    const night = resolveM3DynamicPalette({ primaryHex: '#9EC8FF', isDark: true, paletteStyle: 'vibrant' });

    expect(day.roles.surface).not.toBe(night.roles.surface);
    expect(day.roles.onSurface).not.toBe(night.roles.onSurface);
    expect(day.roles.primary).not.toBe(night.roles.primary);
  });

  it('maps camel-case role names to CSS custom properties', () => {
    expect(roleNameToCssVariable('primaryContainer')).toBe('--m3-primary-container');
    expect(roleNameToCssVariable('surfaceContainerHighest')).toBe('--m3-surface-container-highest');
  });
});
