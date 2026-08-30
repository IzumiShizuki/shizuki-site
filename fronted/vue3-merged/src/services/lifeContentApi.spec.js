import { afterEach, describe, expect, it, vi } from 'vitest';
import {
  getFeaturedAlbums,
  getFeaturedMoments,
  getMomentDetail,
  isSiteOwnedPublicMediaPath,
  normalizeAlbumDetail,
  normalizeAlbumSummary,
  normalizeMoment
} from './lifeContentApi';

function jsonResponse(data) {
  return new Response(JSON.stringify({ code: 'SUCCESS', data }), {
    status: 200,
    headers: { 'content-type': 'application/json' }
  });
}

afterEach(() => {
  vi.unstubAllGlobals();
});

describe('lifeContentApi public preview contract', () => {
  it('accepts only site-owned opaque media gateway paths', () => {
    expect(isSiteOwnedPublicMediaPath('/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/THUMB_WEBP')).toBe(true);
    expect(isSiteOwnedPublicMediaPath('https://bucket.oss-cn.example/a.webp')).toBe(false);
    expect(isSiteOwnedPublicMediaPath('/api/v1/media/med_abc/../private')).toBe(false);
  });

  it('normalizes real album data and drops an unsafe cover instead of fabricating one', () => {
    const album = normalizeAlbumSummary({
      public_slug: 'summer-memory-4f21',
      title: '夏日散步',
      photo_count: 12,
      cover: {
        media_ref: 'med_album_cover_1',
        alt_text: '河岸晚霞',
        variants: [{
          variant: 'THUMB_WEBP',
          path: 'https://private-bucket.example/cover.webp',
          width: 640,
          height: 480,
          format: 'webp'
        }]
      }
    });

    expect(album).toMatchObject({
      publicSlug: 'summer-memory-4f21',
      title: '夏日散步',
      photoCount: 12,
      cover: null
    });
    expect(JSON.stringify(album)).not.toContain('private-bucket');
  });

  it('keeps moments without photos as text-only real content', () => {
    expect(normalizeMoment({
      publicId: 'moment-a1',
      body: '今天把窗边的花重新整理了一遍。',
      photos: []
    })).toMatchObject({
      publicId: 'moment-a1',
      cover: null,
      photos: []
    });
  });

  it('separates thumbnail and display derivatives and never exposes an original as browsing media', () => {
    const path = (variant) => `/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/${variant}`;
    const album = normalizeAlbumDetail({
      publicSlug: 'summer-memory-4f21',
      title: '夏日散步',
      photos: [{
        altText: '河岸晚霞',
        media: {
          mediaRef: 'med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1',
          variants: [
            { variant: 'ORIGINAL', path: path('ORIGINAL'), width: 6000, height: 4000, format: 'jpeg' },
            { variant: 'FULL_SANITIZED', path: path('FULL_SANITIZED'), width: 4000, height: 2667, format: 'webp' },
            { variant: 'DISPLAY_AVIF', path: path('DISPLAY_AVIF'), width: 1600, height: 1067, format: 'avif' },
            { variant: 'DISPLAY_WEBP', path: path('DISPLAY_WEBP'), width: 1600, height: 1067, format: 'webp' },
            { variant: 'THUMB_WEBP', path: path('THUMB_WEBP'), width: 640, height: 427, format: 'webp' }
          ]
        }
      }]
    });
    const media = album.photos[0].media;

    expect(media.thumbnail.variant).toBe('THUMB_WEBP');
    expect(media.display.variant).toBe('DISPLAY_WEBP');
    expect(media.displayAvif.variant).toBe('DISPLAY_AVIF');
    expect(media.variants.map((variant) => variant.variant)).not.toContain('ORIGINAL');
    expect(media.variants.map((variant) => variant.variant)).not.toContain('FULL_SANITIZED');
  });

  it('requests featured Albums and Moments independently with bounded limits', async () => {
    const fetchMock = vi.fn()
      .mockResolvedValueOnce(jsonResponse([{
        publicSlug: 'album-a',
        title: '真实相册',
        photoCount: 1,
        cover: {
          mediaRef: 'med_album_a',
          altText: '一张真实照片',
          variants: [{
            variant: 'THUMB_WEBP',
          path: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/THUMB_WEBP',
            width: 320,
            height: 240,
            format: 'webp'
          }]
        }
      }]))
      .mockResolvedValueOnce(jsonResponse([]));
    vi.stubGlobal('fetch', fetchMock);

    const albums = await getFeaturedAlbums(99);
    const moments = await getFeaturedMoments(2);

    expect(albums[0].cover.preview.url).toMatch(/\/api\/v1\/media\/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1\/variants\/THUMB_WEBP$/);
    expect(moments).toEqual([]);
    expect(fetchMock.mock.calls[0][0]).toMatch(/\/api\/v1\/albums\/featured\?limit=6$/);
    expect(fetchMock.mock.calls[1][0]).toMatch(/\/api\/v1\/moments\/featured\?limit=2$/);
  });

  it('normalizes an unlisted Moment detail without placing capabilities in a URL', async () => {
    const fetchMock = vi.fn().mockResolvedValue(jsonResponse({
      moment: {
        publicId: 'moment_ABCDEFGHIJKLMNOPQRSTUVWXYZ',
        body: '只通过链接抵达的动态。',
        photos: [{
          mediaRef: 'med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1',
          variants: [{
            variant: 'DISPLAY_WEBP',
            path: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/DISPLAY_WEBP',
            width: 1600,
            height: 1067,
            format: 'webp',
            capability: 'header-only-capability'
          }]
        }]
      },
      unlisted: true,
      noindex: true
    }));
    vi.stubGlobal('fetch', fetchMock);

    const detail = await getMomentDetail('moment_ABCDEFGHIJKLMNOPQRSTUVWXYZ');
    expect(detail).toMatchObject({ unlisted: true, noIndex: true });
    expect(detail.photos[0].protectedDisplay.capability).toBe('header-only-capability');
    expect(detail.photos[0].protectedDisplay.url).toBe('');
    expect(fetchMock.mock.calls[0][0]).not.toContain('capability');
  });
});
