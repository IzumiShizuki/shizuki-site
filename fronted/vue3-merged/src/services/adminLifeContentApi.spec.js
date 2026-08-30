import { describe, expect, it, vi } from 'vitest';
import {
  attachAdminAlbumPhotos,
  attachAdminMomentPhotos,
  createAdminAlbum,
  createAdminMoment,
  dryRunAdminAlbumPurge,
  dryRunAdminManagedPhotoPurge,
  dryRunAdminMomentPurge,
  listAdminAlbums,
  purgeAdminAlbum,
  purgeAdminManagedPhoto,
  purgeAdminMoment,
  publishAdminAlbum,
  retryAdminMediaDerivative,
  restoreAdminAlbum,
  restoreAdminManagedPhoto,
  restoreAdminMoment,
  updateAdminAlbum,
  updateAdminPhotoDownloadPolicy
} from './adminLifeContentApi';

describe('adminLifeContentApi', () => {
  it('uses no-store admin album endpoints and carries strong ETags on mutations', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({ success: true, data: { id: 7, audit: { etag: '"3"' } } });

    await listAdminAlbums({ includeRecycled: true, limit: 500 }, authorizedFetch);
    await createAdminAlbum({ title: ' 夏日 ', summary: 'note', visibility: 'private' }, authorizedFetch);
    await updateAdminAlbum(7, { title: '夏日', visibility: 'public', featured: true, sortNum: 4 }, '"3"', authorizedFetch);
    await attachAdminAlbumPhotos(7, [{ photoId: 9, caption: '', downloadMode: 'NONE' }], '"4"', authorizedFetch);
    await publishAdminAlbum(7, '"5"', authorizedFetch);

    expect(authorizedFetch.mock.calls[0]).toEqual(['/api/v1/admin/life/albums', {
      method: 'GET',
      query: { include_recycled: true, limit: 100 }
    }]);
    expect(authorizedFetch.mock.calls[2][1]).toMatchObject({ method: 'PUT', headers: { 'If-Match': '"3"' } });
    expect(authorizedFetch.mock.calls[3][1]).toMatchObject({ method: 'POST', headers: { 'If-Match': '"4"' } });
    expect(authorizedFetch.mock.calls[4][1]).toMatchObject({ method: 'POST', headers: { 'If-Match': '"5"' } });
  });

  it('uses server-issued retry routes and association versions without exposing storage identity', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({ success: true, data: { version: 2 } });
    const route = '/api/v1/admin/life/media-associations/med_opaque/processing/THUMB_WEBP/retry';

    await retryAdminMediaDerivative(route, '"1"', authorizedFetch);
    await updateAdminPhotoDownloadPolicy({ mediaRef: 'med_opaque', associationVersion: 6 }, 'SANITIZED', false, authorizedFetch);

    expect(authorizedFetch.mock.calls[0]).toEqual([route, { method: 'POST', headers: { 'If-Match': '"1"' } }]);
    expect(authorizedFetch.mock.calls[1][0]).toBe('/api/v1/admin/life/media-associations/med_opaque/download-policy');
    expect(authorizedFetch.mock.calls[1][1].body).toEqual({
      mode: 'SANITIZED',
      expectedVersion: 6,
      originalPrivacyAcknowledged: false
    });
    expect(JSON.stringify(authorizedFetch.mock.calls)).not.toMatch(/bucket|objectKey|signedUrl/u);
  });

  it('rejects caller-invented retry routes', async () => {
    await expect(retryAdminMediaDerivative('https://oss.example/private', '"1"', vi.fn())).rejects.toThrow('Invalid derivative retry route');
  });

  it('uses strong ETags for moment photo reuse', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({ data: { id: 5 } });

    await createAdminMoment({ body: 'hello', visibility: 'private' }, authorizedFetch);
    await attachAdminMomentPhotos(5, [9, 10], '"v1"', authorizedFetch);

    expect(authorizedFetch).toHaveBeenNthCalledWith(1, '/api/v1/admin/life/moments', expect.objectContaining({ method: 'POST' }));
    expect(authorizedFetch).toHaveBeenNthCalledWith(2, '/api/v1/admin/life/moments/5/photos/attach', {
      method: 'POST',
      headers: { 'If-Match': '"v1"' },
      body: { photoIds: [9, 10] }
    });
  });

  it('uses each resource concurrency contract for restoration and server-gated purge', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({ success: true, data: { eligible: true } });

    await restoreAdminAlbum(7, '"3"', authorizedFetch);
    await restoreAdminMoment(8, '"4"', authorizedFetch);
    await restoreAdminManagedPhoto(9, 5, authorizedFetch);
    await dryRunAdminAlbumPurge(7, 3, authorizedFetch);
    await dryRunAdminMomentPurge(8, 4, authorizedFetch);
    await dryRunAdminManagedPhotoPurge(9, 5, authorizedFetch);
    await purgeAdminAlbum(7, 3, 'once-a', 'PURGE ALBUM 7', authorizedFetch);
    await purgeAdminMoment(8, 4, 'once-m', 'PURGE MOMENT 8', authorizedFetch);
    await purgeAdminManagedPhoto(9, 5, 'once-p', 'PURGE PHOTO 9', authorizedFetch);

    expect(authorizedFetch.mock.calls[0]).toEqual(['/api/v1/admin/life/albums/7/restore', { method: 'POST', headers: { 'If-Match': '"3"' } }]);
    expect(authorizedFetch.mock.calls[1]).toEqual(['/api/v1/admin/life/moments/8/restore', { method: 'POST', headers: { 'If-Match': '"4"' } }]);
    expect(authorizedFetch.mock.calls[2]).toEqual(['/api/v1/admin/life/photos/9/restore', { method: 'POST', body: { expectedVersion: 5 } }]);
    expect(authorizedFetch.mock.calls[3][1].body).toEqual({ expectedVersion: 3 });
    expect(authorizedFetch.mock.calls[4][1].body).toEqual({ expectedVersion: 4 });
    expect(authorizedFetch.mock.calls[5][1].body).toEqual({ expectedVersion: 5 });
    expect(authorizedFetch.mock.calls[6][1].body).toEqual({ expectedVersion: 3, capability: 'once-a', confirmation: 'PURGE ALBUM 7' });
    expect(authorizedFetch.mock.calls[7][1].body).toEqual({ expectedVersion: 4, capability: 'once-m', confirmation: 'PURGE MOMENT 8' });
    expect(authorizedFetch.mock.calls[8][1].body).toEqual({ expectedVersion: 5, capability: 'once-p', confirmation: 'PURGE PHOTO 9' });
  });
});
