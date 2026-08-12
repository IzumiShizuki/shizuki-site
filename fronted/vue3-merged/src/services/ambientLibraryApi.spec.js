import { describe, expect, it, vi } from 'vitest';
import { importAmbientLibraryTrack } from './ambientLibraryApi';

describe('ambientLibraryApi import', () => {
  it('submits only the Freesound sound id and normalizes the durable asset', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({
      data: {
        provider: 'freesound',
        sound_id: '42001',
        asset_id: 88,
        title: 'Rain on a quiet window',
        author: 'field-recorder',
        license: 'cc0',
        download_url: 'https://signed.example/ambient.mp3',
        expire_seconds: 600,
        already_imported: false
      }
    });

    const result = await importAmbientLibraryTrack(
      {
        soundId: '42001',
        previewUrl: 'https://attacker.example/should-not-be-sent.mp3',
        title: 'client title'
      },
      authorizedFetch
    );

    expect(authorizedFetch).toHaveBeenCalledWith('/api/v1/ambient-library/import', {
      method: 'POST',
      body: { soundId: '42001' }
    });
    expect(result).toMatchObject({ assetId: 88, soundId: '42001', title: 'Rain on a quiet window' });
    expect(JSON.stringify(authorizedFetch.mock.calls[0])).not.toContain('attacker.example');
  });
});
