import { describe, expect, it } from 'vitest';
import { normalizePermanentPublicAssetUrl, resolveSignedStorageExpiryEpochMs } from './publicAssetUrl';

describe('normalizePermanentPublicAssetUrl', () => {
  it('removes OSS signed query parameters from public asset urls', () => {
    const rawUrl =
      'https://cdn.example.com/assets/author/avatar.webp?OSSAccessKeyId=test-key&Expires=1893456000&Signature=test-sign';

    expect(normalizePermanentPublicAssetUrl(rawUrl)).toBe('https://cdn.example.com/assets/author/avatar.webp');
  });

  it('keeps normal asset urls untouched when query is not a storage signature', () => {
    const rawUrl = 'https://cdn.example.com/assets/author/avatar.webp?width=800&format=webp';

    expect(normalizePermanentPublicAssetUrl(rawUrl)).toBe(rawUrl);
  });

  it('keeps relative asset paths untouched', () => {
    expect(normalizePermanentPublicAssetUrl('/images/katanegai.jpg')).toBe('/images/katanegai.jpg');
  });

  it('extracts absolute expiry time from OSS signed urls', () => {
    const rawUrl =
      'https://cdn.example.com/assets/hero/avatar.webp?OSSAccessKeyId=test-key&Expires=1893456000&Signature=test-sign';

    expect(resolveSignedStorageExpiryEpochMs(rawUrl)).toBe(1893456000 * 1000);
  });

  it('extracts relative expiry time from AWS style signed urls', () => {
    const rawUrl =
      'https://cdn.example.com/assets/hero/avatar.webp?X-Amz-Date=20260327T020000Z&X-Amz-Expires=900&X-Amz-Signature=test-sign';

    expect(resolveSignedStorageExpiryEpochMs(rawUrl)).toBe(Date.UTC(2026, 2, 27, 2, 15, 0));
  });
});
