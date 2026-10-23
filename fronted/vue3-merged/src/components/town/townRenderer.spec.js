import { describe, expect, it, vi } from 'vitest';
import { drawTile } from './townRenderer';
import { createSceneMap } from './townScenes';
import { townTileset } from './townMap';

describe('scene atlas sampling', () => {
  it('uses the downloaded 32px atlas cells including ids reserved by the legacy renderer', () => {
    const ctx = { drawImage: vi.fn() }, atlas = { complete: true, naturalWidth: 1024 };
    drawTile(ctx, atlas, 132, 10, 20, 32, 0, townTileset(createSceneMap('victorian')));
    expect(ctx.drawImage).toHaveBeenCalledWith(atlas, 4 * 32, 4 * 32, 32, 32, 10, 20, 32, 32);
  });
});
