import { describe, expect, it, vi } from 'vitest';

async function createUiState() {
  vi.resetModules();
  const { useMusicLibraryUiState } = await import('./musicLibraryUiState');
  return useMusicLibraryUiState();
}

describe('musicLibraryUiState', () => {
  it('only accepts meting and spotify as expanded providers', async () => {
    const ui = await createUiState();

    expect(ui.expandedProvider.value).toBe('');

    ui.setExpandedProvider('tunehub');
    expect(ui.expandedProvider.value).toBe('');

    ui.setExpandedProvider('meting');
    expect(ui.expandedProvider.value).toBe('meting');

    ui.setExpandedProvider('TuneHub');
    expect(ui.expandedProvider.value).toBe('meting');

    ui.setExpandedProvider('spotify');
    expect(ui.expandedProvider.value).toBe('spotify');

    ui.setExpandedProvider('');
    expect(ui.expandedProvider.value).toBe('');
  });

  it('clamps eq levels and ignores invalid indexes', async () => {
    const ui = await createUiState();

    ui.setEqLevel(0, 3);
    ui.setEqLevel(1, -1);
    ui.setEqLevel(2, 0.25);
    ui.setEqLevel(4, 0.9);

    expect(ui.eqLevels.value).toEqual([1, 0, 0.25]);
  });
});
