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

  it('stores 10-band eq state migrated from legacy 3-band levels and clamps writes', async () => {
    const ui = await createUiState();

    expect(ui.eqBands10.value).toHaveLength(10);
    // 默认 [0.66, 0.52, 0.74] 就近迁移：31–250 Hz 继承 low、500–2k 继承 mid、4k–16k 继承 high
    expect(ui.eqBands10.value[0]).toBeCloseTo(0.66);
    expect(ui.eqBands10.value[3]).toBeCloseTo(0.66);
    expect(ui.eqBands10.value[4]).toBeCloseTo(0.52);
    expect(ui.eqBands10.value[6]).toBeCloseTo(0.52);
    expect(ui.eqBands10.value[7]).toBeCloseTo(0.74);
    expect(ui.eqBands10.value[9]).toBeCloseTo(0.74);

    ui.setEqBand10(1, 2);
    ui.setEqBand10(2, -1);
    ui.setEqBand10(11, 0.9);
    expect(ui.eqBands10.value[1]).toBe(1);
    expect(ui.eqBands10.value[2]).toBe(0);
    expect(ui.eqBands10.value[9]).toBeCloseTo(0.74);

    ui.setEqBands10(Array.from({ length: 10 }, (_, index) => index / 10));
    expect(ui.eqBands10.value[4]).toBeCloseTo(0.4);

    // 长度不符的整体写入被忽略
    ui.setEqBands10([1]);
    expect(ui.eqBands10.value[4]).toBeCloseTo(0.4);

    // 旧 3 段接口保持可用（向后兼容），且不反向覆盖 10 段状态
    ui.setEqLevel(0, 3);
    expect(ui.eqLevels.value[0]).toBe(1);
    expect(ui.eqBands10.value[0]).toBeCloseTo(0);
  });
});
