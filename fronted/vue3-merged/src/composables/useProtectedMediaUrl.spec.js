import { describe, expect, it, vi } from 'vitest';
import { HttpError } from '../services/httpClient';
import { useProtectedMediaUrl } from './useProtectedMediaUrl';

describe('useProtectedMediaUrl', () => {
  it('refreshes an expired capability once and revokes owned object URLs', async () => {
    const resolveVariant = vi.fn(({ refreshPresentation }) => Promise.resolve({
      path: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/DISPLAY_WEBP',
      capability: refreshPresentation ? 'fresh-capability' : 'expired-capability'
    }));
    const fetchBlob = vi.fn()
      .mockRejectedValueOnce(new HttpError('expired', { status: 403, problemCode: 'MEDIA_CAPABILITY_EXPIRED' }))
      .mockResolvedValueOnce(new Blob(['first'], { type: 'image/webp' }))
      .mockResolvedValueOnce(new Blob(['second'], { type: 'image/webp' }));
    const createObjectUrl = vi.fn()
      .mockReturnValueOnce('blob:protected-first')
      .mockReturnValueOnce('blob:protected-second');
    const revokeObjectUrl = vi.fn();
    const media = useProtectedMediaUrl(resolveVariant, { fetchBlob, createObjectUrl, revokeObjectUrl });

    await media.refresh();
    expect(resolveVariant.mock.calls.map((call) => call[0].refreshPresentation)).toEqual([false, true]);
    expect(media.url.value).toBe('blob:protected-first');

    await media.refresh();
    expect(media.url.value).toBe('blob:protected-second');
    expect(revokeObjectUrl).toHaveBeenCalledWith('blob:protected-first');

    media.dispose();
    expect(revokeObjectUrl).toHaveBeenCalledWith('blob:protected-second');
    expect(media.url.value).toBe('');
  });
});
