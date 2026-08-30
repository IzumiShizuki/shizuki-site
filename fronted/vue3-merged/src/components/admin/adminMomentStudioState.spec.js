import { describe, expect, it } from 'vitest';
import { momentPreviewPath, momentPublishReadiness, moveMomentPhoto } from './adminMomentStudioState';

const readyVariants = ['THUMB_WEBP', 'DISPLAY_WEBP', 'FULL_SANITIZED'].map((variant) => ({
  variant,
  deliveryScope: 'PRIVATE_WORKING',
  status: 'READY',
  auditStatus: 'APPROVED',
  previewPath: `/${variant}`
}));

describe('adminMomentStudioState', () => {
  it('blocks publication when required scoped derivatives are absent', () => {
    expect(momentPublishReadiness({ body: 'hello', visibility: 'PRIVATE', photos: [{ processingStatus: 'READY', derivatives: [] }] }).ready).toBe(false);
    expect(momentPublishReadiness({ body: 'hello', visibility: 'PRIVATE', photos: [{ processingStatus: 'READY', derivatives: readyVariants }] }).ready).toBe(true);
  });

  it('moves complete photo objects and keeps a canonical sort', () => {
    expect(moveMomentPhoto([{ photoId: 1 }, { photoId: 2 }], 1, 0)).toEqual([
      { photoId: 2, sort: 0 }, { photoId: 1, sort: 1 }
    ]);
  });

  it('selects only a protected admin preview path', () => {
    expect(momentPreviewPath({ derivatives: readyVariants })).toBe('/DISPLAY_WEBP');
  });
});
