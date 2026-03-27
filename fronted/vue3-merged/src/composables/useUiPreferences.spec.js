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

    expect(ui.state.accentHex).toBe('#F2B39D');
    expect(ui.state.accentMode).toBe('solid');
    expect(ui.state.accentGradientId).toBe('apricot-blush');
    expect(ui.state.accentGradientStartHex).toBe('#F6C2A1');
    expect(ui.state.accentGradientEndHex).toBe('#EFA0A8');
    expect(document.documentElement.getAttribute('data-accent-mode')).toBe('solid');
    expect(document.documentElement.style.getPropertyValue('--theme-surface')).not.toBe('');
    expect(readStoredPreferences()).toEqual(
      expect.objectContaining({
        accentHex: '#F2B39D',
        accentMode: 'solid',
        accentGradientId: 'apricot-blush',
        accentGradientStartHex: '#F6C2A1',
        accentGradientEndHex: '#EFA0A8',
        themeDefaultsVersion: 2
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
        accentHex: '#F2B39D',
        accentMode: 'gradient',
        accentGradientId: 'apricot-blush',
        accentGradientStartHex: '#F6C2A1',
        accentGradientEndHex: '#EFA0A8',
        themeDefaultsVersion: 2
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
    expect(readStoredPreferences()).toEqual(
      expect.objectContaining({
        accentHex: '#8FDCC8',
        accentMode: 'solid',
        accentGradientId: 'sunset',
        accentGradientStartHex: '#FF7A8A',
        accentGradientEndHex: '#FFB168',
        themeDefaultsVersion: 2
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
        accentHex: '#F2B39D',
        accentGradientId: 'apricot-blush',
        accentGradientStartHex: '#F6C2A1',
        accentGradientEndHex: '#EFA0A8',
        themeDefaultsVersion: 2
      })
    );
  });
});
