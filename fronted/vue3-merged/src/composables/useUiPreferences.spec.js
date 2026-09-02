import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';

const STORAGE_KEY = 'shizuki.uiPreferences.v1';

async function loadUiPreferencesModule() {
  vi.resetModules();
  return import('./useUiPreferences');
}

function readStoredPreferences() {
  const raw = window.localStorage.getItem(STORAGE_KEY);
  return raw ? JSON.parse(raw) : null;
}

function resetDocumentThemeState() {
  const root = document.documentElement;
  root.removeAttribute('data-accent-mode');
  root.removeAttribute('data-theme-mode');
  root.removeAttribute('data-palette-style');
  root.removeAttribute('style');
}

describe('useUiPreferences', () => {
  beforeEach(() => {
    window.localStorage.clear();
    resetDocumentThemeState();
  });

  afterEach(() => {
    window.localStorage.clear();
    resetDocumentThemeState();
  });

  it('initializes warm defaults and semantic theme variables', async () => {
    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();

    ui.initializeUiPreferences();

    expect(ui.state.themeMode).toBe('night');
    expect(ui.state.accentHex).toBe('#F2B39D');
    expect(ui.state.accentMode).toBe('solid');
    expect(ui.state.accentGradientId).toBe('apricot-blush');
    expect(ui.state.accentGradientStartHex).toBe('#F6C2A1');
    expect(ui.state.accentGradientEndHex).toBe('#EFA0A8');
    expect(ui.state.paletteStyle).toBe('soft');
    expect(document.documentElement.getAttribute('data-accent-mode')).toBe('solid');
    expect(document.documentElement.getAttribute('data-theme-mode')).toBe('night');
    expect(document.documentElement.getAttribute('data-palette-style')).toBe('soft');
    expect(document.documentElement.style.getPropertyValue('--m3-primary')).toMatch(/^#[0-9A-F]{6}$/);
    expect(document.documentElement.style.getPropertyValue('--m3-on-primary')).toMatch(/^#[0-9A-F]{6}$/);
    expect(document.documentElement.style.getPropertyValue('--m3-surface-container-low')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--m3e-focus-ring')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-surface')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-panel-surface')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-panel-surface-elevated')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-reader-surface')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-code-surface')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-code-border')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-icon-primary')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-icon-muted')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-icon-strong')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-divider-soft')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-contrast-text-shadow-strong')).not.toBe('');
    expect(document.documentElement.style.getPropertyValue('--theme-contrast-icon-shadow-strong')).not.toBe('');
    expect(readStoredPreferences()).toEqual(
      expect.objectContaining({
        themeMode: 'night',
        accentHex: '#F2B39D',
        accentMode: 'solid',
        accentGradientId: 'apricot-blush',
        accentGradientStartHex: '#F6C2A1',
        accentGradientEndHex: '#EFA0A8',
        paletteStyle: 'soft',
        themeDefaultsVersion: 3
      })
    );
  });

  it('migrates legacy default users to the new warm defaults', async () => {
    window.localStorage.setItem(
      STORAGE_KEY,
      JSON.stringify({
        accentHex: '#C8B4FF',
        accentMode: 'gradient',
        accentGradientId: 'berry',
        accentGradientStartHex: '#E94BC5',
        accentGradientEndHex: '#9D6BFF'
      })
    );

    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();

    ui.initializeUiPreferences();

    expect(ui.state.accentHex).toBe('#F2B39D');
    expect(ui.state.accentMode).toBe('gradient');
    expect(ui.state.accentGradientId).toBe('apricot-blush');
    expect(ui.state.accentGradientStartHex).toBe('#F6C2A1');
    expect(ui.state.accentGradientEndHex).toBe('#EFA0A8');
    expect(readStoredPreferences()).toEqual(
      expect.objectContaining({
        themeMode: 'night',
        accentHex: '#F2B39D',
        accentMode: 'gradient',
        accentGradientId: 'apricot-blush',
        accentGradientStartHex: '#F6C2A1',
        accentGradientEndHex: '#EFA0A8',
        themeDefaultsVersion: 3
      })
    );
  });

  it('migrates legacy defaults even when previous defaults marker is already saved', async () => {
    window.localStorage.setItem(
      STORAGE_KEY,
      JSON.stringify({
        themeDefaultsVersion: 2,
        accentHex: '#C8B4FF',
        accentMode: 'solid',
        accentGradientId: 'berry',
        accentGradientStartHex: '#E94BC5',
        accentGradientEndHex: '#9D6BFF'
      })
    );

    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();

    ui.initializeUiPreferences();

    expect(ui.state.accentHex).toBe('#F2B39D');
    expect(ui.state.accentMode).toBe('solid');
    expect(ui.state.accentGradientId).toBe('apricot-blush');
    expect(ui.state.accentGradientStartHex).toBe('#F6C2A1');
    expect(ui.state.accentGradientEndHex).toBe('#EFA0A8');
    expect(readStoredPreferences()).toEqual(
      expect.objectContaining({
        themeDefaultsVersion: 3,
        accentHex: '#F2B39D',
        accentMode: 'solid',
        accentGradientId: 'apricot-blush'
      })
    );
  });

  it('preserves custom theme users while upgrading the defaults version marker', async () => {
    window.localStorage.setItem(
      STORAGE_KEY,
      JSON.stringify({
        accentHex: '#8FDCC8',
        accentMode: 'solid',
        accentGradientId: 'sunset',
        accentGradientStartHex: '#FF7A8A',
        accentGradientEndHex: '#FFB168'
      })
    );

    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();

    ui.initializeUiPreferences();

    expect(ui.state.accentHex).toBe('#8FDCC8');
    expect(ui.state.accentMode).toBe('solid');
    expect(ui.state.accentGradientId).toBe('sunset');
    expect(ui.state.accentGradientStartHex).toBe('#FF7A8A');
    expect(ui.state.accentGradientEndHex).toBe('#FFB168');
    expect(ui.state.paletteStyle).toBe('soft');
    expect(readStoredPreferences()).toEqual(
      expect.objectContaining({
        themeMode: 'night',
        accentHex: '#8FDCC8',
        accentMode: 'solid',
        accentGradientId: 'sunset',
        accentGradientStartHex: '#FF7A8A',
        accentGradientEndHex: '#FFB168',
        paletteStyle: 'soft',
        themeDefaultsVersion: 3
      })
    );
  });

  it('resetAccent restores the new warm defaults', async () => {
    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();

    ui.initializeUiPreferences();
    ui.setAccentHex('#8FDCC8');
    ui.setAccentGradientPreset('berry');

    ui.resetAccent();

    expect(ui.state.accentHex).toBe('#F2B39D');
    expect(ui.state.accentGradientId).toBe('apricot-blush');
    expect(ui.state.accentGradientStartHex).toBe('#F6C2A1');
    expect(ui.state.accentGradientEndHex).toBe('#EFA0A8');
    expect(readStoredPreferences()).toEqual(
      expect.objectContaining({
        themeMode: 'night',
        accentHex: '#F2B39D',
        accentGradientId: 'apricot-blush',
        accentGradientStartHex: '#F6C2A1',
        accentGradientEndHex: '#EFA0A8',
        themeDefaultsVersion: 3
      })
    );
  });

  it('switches between night and day mode and persists the result', async () => {
    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();

    ui.initializeUiPreferences();
    const nightSurface = document.documentElement.style.getPropertyValue('--theme-surface');
    const nightStrongShadow = document.documentElement.style.getPropertyValue('--theme-contrast-text-shadow-strong');
    const nightPanelSurface = document.documentElement.style.getPropertyValue('--theme-panel-surface');
    const nightReaderSurface = document.documentElement.style.getPropertyValue('--theme-reader-surface');
    const nightIconPrimary = document.documentElement.style.getPropertyValue('--theme-icon-primary');
    const nightM3Surface = document.documentElement.style.getPropertyValue('--m3-surface');

    ui.toggleThemeMode();

    expect(ui.state.themeMode).toBe('day');
    expect(document.documentElement.getAttribute('data-theme-mode')).toBe('day');
    expect(document.documentElement.style.getPropertyValue('color-scheme')).toBe('light');
    expect(document.documentElement.style.getPropertyValue('--theme-surface')).not.toBe(nightSurface);
    expect(document.documentElement.style.getPropertyValue('--theme-panel-surface')).not.toBe(nightPanelSurface);
    expect(document.documentElement.style.getPropertyValue('--theme-reader-surface')).not.toBe(nightReaderSurface);
    expect(document.documentElement.style.getPropertyValue('--theme-icon-primary')).not.toBe(nightIconPrimary);
    expect(document.documentElement.style.getPropertyValue('--m3-surface')).not.toBe(nightM3Surface);
    expect(document.documentElement.style.getPropertyValue('--theme-icon-primary')).not.toBe(
      document.documentElement.style.getPropertyValue('--theme-text-primary')
    );
    expect(document.documentElement.style.getPropertyValue('--theme-contrast-text-shadow-strong')).not.toBe(nightStrongShadow);
    expect(readStoredPreferences()).toEqual(
      expect.objectContaining({
        themeMode: 'day'
      })
    );
  });

  it('applies and persists palette personalities without replacing the seed color', async () => {
    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();

    ui.initializeUiPreferences();
    const seedBefore = ui.state.accentHex;
    const softSecondary = document.documentElement.style.getPropertyValue('--m3-secondary');

    expect(ui.setPaletteStyle('expressive')).toBe('expressive');

    expect(ui.state.accentHex).toBe(seedBefore);
    expect(ui.state.paletteStyle).toBe('expressive');
    expect(document.documentElement.getAttribute('data-palette-style')).toBe('expressive');
    expect(document.documentElement.style.getPropertyValue('--m3-secondary')).not.toBe(softSecondary);
    expect(readStoredPreferences()).toEqual(expect.objectContaining({ paletteStyle: 'expressive' }));

    expect(ui.setPaletteStyle('unsupported')).toBe('soft');
    expect(document.documentElement.getAttribute('data-palette-style')).toBe('soft');
  });

  it('uses both gradient endpoints in emitted M3 roles', async () => {
    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();

    ui.initializeUiPreferences();
    ui.setAccentMode('gradient');
    ui.setAccentGradientCustom('#F472B6', '#34D399');
    const firstPrimary = document.documentElement.style.getPropertyValue('--m3-primary');
    const firstSecondary = document.documentElement.style.getPropertyValue('--m3-secondary');

    ui.setAccentGradientCustom('#F472B6', '#818CF8');

    expect(document.documentElement.style.getPropertyValue('--m3-primary')).toBe(firstPrimary);
    expect(document.documentElement.style.getPropertyValue('--m3-secondary')).not.toBe(firstSecondary);
    expect(document.documentElement.style.getPropertyValue('--m3-ambient-companion')).not.toBe('');
  });

  it('picks a dark ink on light accents and a light ink on dark accents', async () => {
    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();
    const readSurfaceText = () => document.documentElement.style.getPropertyValue('--accent-surface-text');

    ui.initializeUiPreferences();

    // 默认奶杏桃粉是浅色 → 强主色按钮上应是深墨
    expect(readSurfaceText()).toContain('46, 30, 24');

    // 深色主色 → 白墨（夜间模式）
    ui.setAccentHex('#1F2937');
    expect(readSurfaceText()).toContain('255, 255, 255');

    // 白天模式下深色主色仍是白墨（不再按昼夜写死深字）
    ui.setThemeMode('day');
    expect(readSurfaceText()).toContain('255, 255, 255');

    // 白天模式浅色主色 → 深墨
    ui.setAccentHex('#F2B39D');
    expect(readSurfaceText()).toContain('46, 30, 24');
  });

  it('computes the surface ink from gradient stops in gradient mode', async () => {
    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();
    const readSurfaceText = () => document.documentElement.style.getPropertyValue('--accent-surface-text');

    ui.initializeUiPreferences();
    ui.setAccentMode('gradient');

    // 浅色渐变（奶杏桃粉）→ 深墨
    ui.setAccentGradientPreset('apricot-blush');
    expect(readSurfaceText()).toContain('46, 30, 24');

    // 整体偏深的渐变 → 白墨
    ui.setAccentGradientCustom('#334155', '#1E1B4B');
    expect(readSurfaceText()).toContain('255, 255, 255');
  });

  it('keeps gradient title text readable against the page background', async () => {
    const { useUiPreferences } = await loadUiPreferencesModule();
    const ui = useUiPreferences();
    const readTextGradientStart = () =>
      document.documentElement.style.getPropertyValue('--accent-text-gradient-start-rgb').trim();

    ui.initializeUiPreferences();
    ui.setAccentMode('gradient');
    ui.setAccentGradientPreset('apricot-blush');

    // 夜间深底上浅色渐变本身对比度足够，不需要调整
    expect(readTextGradientStart()).toBe('246, 194, 161');

    // 白天浅底上同样的浅渐变必须被压深，否则标题看不清
    ui.setThemeMode('day');
    expect(readTextGradientStart()).not.toBe('246, 194, 161');
    expect(document.documentElement.style.getPropertyValue('--accent-text-gradient')).not.toBe('');
  });
});
