import { describe, expect, it } from 'vitest';
import {
  createImportedAmbientAssetTrack,
  indexImportedAmbientAssets,
  normalizeAmbientLibraryAvailability,
  normalizeAtmospherePanelTab
} from './ambientOnlineLibraryState';

describe('ambient online library shell state', () => {
  it('keeps the online tab and exposes provider availability', () => {
    expect(normalizeAtmospherePanelTab('online')).toBe('online');
    expect(normalizeAtmospherePanelTab('colors')).toBe('colors');
    expect(normalizeAtmospherePanelTab('unknown')).toBe('music');
    expect(normalizeAmbientLibraryAvailability({ enabled: true, provider: 'freesound' })).toEqual({
      checked: true,
      enabled: true,
      provider: 'freesound',
      error: ''
    });
  });

  it('turns an import result into an enabled private asset track', () => {
    expect(createImportedAmbientAssetTrack({
      assetId: 88,
      soundId: '42001',
      title: 'Forest Rain',
      author: 'field-recorder',
      license: 'by',
      licenseName: 'CC-BY 需署名',
      pageUrl: 'https://freesound.org/s/42001/'
    })).toEqual({
      trackId: 'asset:88',
      source: 'asset',
      assetId: 88,
      enabled: true,
      volume: 0.72,
      title: 'Forest Rain',
      sourceProvider: 'freesound',
      sourceSoundId: '42001',
      author: 'field-recorder',
      license: 'by',
      licenseName: 'CC-BY 需署名',
      pageUrl: 'https://freesound.org/s/42001/'
    });
  });

  it('indexes persisted imports by Freesound sound id', () => {
    const imported = { source: 'asset', assetId: 88, sourceSoundId: '42001', enabled: false };
    expect(indexImportedAmbientAssets([imported, { source: 'builtin', trackId: 'rain' }])).toEqual({
      42001: imported
    });
  });
});
