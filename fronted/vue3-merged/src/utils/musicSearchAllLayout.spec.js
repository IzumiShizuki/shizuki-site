import { describe, expect, it } from 'vitest';
import { estimatePlaylistRowCapacity, normalizePlaylistRowCapacity } from './musicSearchAllLayout';

describe('musicSearchAllLayout', () => {
  it('normalizes playlist row capacity with boundaries', () => {
    expect(normalizePlaylistRowCapacity(0)).toBe(1);
    expect(normalizePlaylistRowCapacity(3.9)).toBe(3);
    expect(normalizePlaylistRowCapacity(100)).toBe(12);
    expect(normalizePlaylistRowCapacity('foo')).toBe(3);
  });

  it('estimates row capacity from container width', () => {
    expect(estimatePlaylistRowCapacity(620)).toBe(3);
    expect(estimatePlaylistRowCapacity(860)).toBe(4);
    expect(estimatePlaylistRowCapacity(0)).toBe(3);
  });

  it('supports custom sizing options', () => {
    expect(
      estimatePlaylistRowCapacity(480, {
        cardMinWidth: 140,
        gap: 8,
        min: 2,
        max: 8,
        fallback: 4
      })
    ).toBe(3);
  });
});
