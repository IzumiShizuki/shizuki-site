import { describe, expect, it } from 'vitest';
import {
  albumPublishReadiness,
  canReapplyPhotoOrder,
  createUploadQueueItems,
  moveAlbumPhoto,
  preferredAdminPreviewRoute,
  retryableUploadItems,
  updateUploadQueueItem,
  uploadBatchCompletionMessage,
  uploadProgressLabel
} from './adminAlbumStudioState';

describe('adminAlbumStudioState', () => {
  it('keeps publication blocked until cover, alt text and derivatives are ready', () => {
    expect(albumPublishReadiness({ title: 'Trip', photos: [] }).ready).toBe(false);
    expect(albumPublishReadiness({
      title: 'Trip',
      coverPhotoId: 9,
      photos: [{ photoId: 9, altText: 'Lake', processing: { readyForPublication: true } }]
    })).toEqual({ ready: true, blockers: [] });
  });

  it('reorders complete photo objects without mutating the source', () => {
    const source = [{ photoId: 1 }, { photoId: 2 }, { photoId: 3 }];
    const moved = moveAlbumPhoto(source, 2, 0);
    expect(moved.map((item) => item.photoId)).toEqual([3, 1, 2]);
    expect(moved.map((item) => item.sortNum)).toEqual([0, 1, 2]);
    expect(source.map((item) => item.photoId)).toEqual([1, 2, 3]);
  });

  it('chooses protected display route without exposing storage identities', () => {
    const route = preferredAdminPreviewRoute({
      previewVariants: [
        { variant: 'THUMB_WEBP', route: '/thumb' },
        { variant: 'DISPLAY_WEBP', route: '/display' }
      ]
    });
    expect(route).toBe('/display');
    expect(uploadProgressLabel('relay')).toContain('中继');
  });

  it('allows manual order reapplication only when the server photo set is unchanged', () => {
    expect(canReapplyPhotoOrder([{ photoId: 1 }, { photoId: 2 }], [2, 1])).toBe(true);
    expect(canReapplyPhotoOrder([{ photoId: 1 }, { photoId: 3 }], [2, 1])).toBe(false);
  });

  it('retains failed batch uploads as individually retryable queue items after partial success', () => {
    const [first, second] = createUploadQueueItems([
      { name: 'lake.png' }, { name: 'mist.webp' }
    ], 123);
    const afterPartialBatch = updateUploadQueueItem(
      updateUploadQueueItem([first, second], first.id, { status: 'attached' }),
      second.id,
      { status: 'failed', error: 'upload unavailable' }
    );

    expect(afterPartialBatch.map((item) => item.status)).toEqual(['attached', 'failed']);
    expect(retryableUploadItems(afterPartialBatch)).toEqual([expect.objectContaining({ id: second.id, status: 'failed' })]);
    expect(uploadBatchCompletionMessage(1, 2)).toBe('本批次完成 1/2 项；失败项保留，可单独重试。');
  });
});
