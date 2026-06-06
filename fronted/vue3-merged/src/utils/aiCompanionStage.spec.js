import { describe, expect, it } from 'vitest';
import {
  normalizeCompanionL2dAsset,
  resolveCompanionStageStatus,
  selectCompanionL2dAsset
} from './aiCompanionStage';

describe('aiCompanionStage', () => {
  it('normalizes public home-role L2D assets with model contract', () => {
    const asset = normalizeCompanionL2dAsset({
      asset_id: 42,
      asset_kind: 'LIVE2D_PACKAGE',
      cover_url: 'https://cdn.example/cover.png',
      download_url: 'https://cdn.example/model.zip',
      l2d_entry_model_json: 'Haru/Haru.model3.json'
    });

    expect(asset).toMatchObject({
      assetId: 42,
      modelUrl: 'https://cdn.example/model.zip',
      modelEntry: 'Haru/Haru.model3.json',
      fallbackSrc: 'https://cdn.example/cover.png',
      ready: true
    });
  });

  it('selects the preferred renderable L2D asset when available', () => {
    const selected = selectCompanionL2dAsset(
      [
        { assetId: 1, assetKind: 'STATIC', downloadUrl: 'https://cdn.example/a.png' },
        { assetId: 2, assetKind: 'LIVE2D_PACKAGE', downloadUrl: 'https://cdn.example/a.zip', l2dEntryModelJson: 'a.model3.json' },
        { assetId: 3, assetKind: 'LIVE2D_PACKAGE', downloadUrl: 'https://cdn.example/b.zip', l2dEntryModelJson: 'b.model3.json' }
      ],
      3
    );

    expect(selected.assetId).toBe(3);
    expect(selected.modelEntry).toBe('b.model3.json');
  });

  it('ignores incomplete L2D assets and returns null when none can render', () => {
    const selected = selectCompanionL2dAsset([
      { assetId: 4, assetKind: 'LIVE2D_PACKAGE', downloadUrl: 'https://cdn.example/no-entry.zip' },
      { assetId: 5, assetKind: 'STATIC', downloadUrl: 'https://cdn.example/static.png' }
    ]);

    expect(selected).toBeNull();
  });

  it('maps chat events into stage status', () => {
    expect(resolveCompanionStageStatus({ phase: 'send-start' })).toBe('thinking');
    expect(resolveCompanionStageStatus({ assistantMessage: '你好。' })).toBe('speaking');
    expect(resolveCompanionStageStatus({ status: 'idle' }, 'speaking')).toBe('idle');
  });
});
