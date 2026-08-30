import { describe, expect, it, vi } from 'vitest';
import { MEDIA_CAPABILITY_HEADER, fetchProtectedMediaBlob } from './mediaGatewayApi';

const protectedVariant = Object.freeze({
  path: '/api/v1/media/med_ABCDEFGHIJKLMNOPQRSTUVWXYZ1/variants/DISPLAY_WEBP',
  capability: 'short-lived-capability-a1'
});
describe('mediaGatewayApi', () => {
  it('sends a protected capability only in the dedicated header', async () => {
    const fetchImpl = vi.fn().mockResolvedValue(new Response(new Blob(['image-bytes'], { type: 'image/webp' }), {
      status: 200,
      headers: { 'content-type': 'image/webp' }
    }));

    const blob = await fetchProtectedMediaBlob(protectedVariant, { fetchImpl });

    expect(blob.type).toBe('image/webp');
    expect(fetchImpl.mock.calls[0][0]).not.toContain(protectedVariant.capability);
    expect(fetchImpl.mock.calls[0][1].headers[MEDIA_CAPABILITY_HEADER]).toBe(protectedVariant.capability);
  });

  it('rejects non-site routes and newline-bearing capabilities before fetch', async () => {
    const fetchImpl = vi.fn();
    await expect(fetchProtectedMediaBlob({
      path: 'https://bucket.example/private.webp',
      capability: 'secret'
    }, { fetchImpl })).rejects.toThrow('route');
    await expect(fetchProtectedMediaBlob({
      ...protectedVariant,
      capability: 'secret\r\nX-Injected: yes'
    }, { fetchImpl })).rejects.toThrow('capability');
    expect(fetchImpl).not.toHaveBeenCalled();
  });
});
