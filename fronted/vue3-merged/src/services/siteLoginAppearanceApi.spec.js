import { describe, expect, it, vi } from 'vitest';
import {
  fetchAdminLoginAppearance,
  fetchSiteLoginAppearance,
  normalizeSiteLoginAppearance,
  saveAdminLoginAppearance
} from './siteLoginAppearanceApi';

vi.mock('./httpClient', () => ({
  httpRequest: vi.fn(),
  normalizeApiData: (payload) => (payload && typeof payload === 'object' && 'data' in payload ? payload.data : payload)
}));

import { httpRequest } from './httpClient';

describe('siteLoginAppearanceApi', () => {
  it('normalizes snake-case appearance payloads and rejects unconfigured rows', () => {
    expect(normalizeSiteLoginAppearance({ data: {
      theme_preset: 'peach',
      bg_image_url: 'https://example.com/bg.png',
      mascot_image_url: 'https://example.com/mascot.png',
      version: 2
    } })).toEqual({
      configured: true,
      themePreset: 'peach',
      bgImageUrl: 'https://example.com/bg.png',
      mascotImageUrl: 'https://example.com/mascot.png',
      version: 2
    });

    expect(normalizeSiteLoginAppearance({ data: { theme_preset: 'milkshake', version: 0 } })).toBeNull();
    expect(normalizeSiteLoginAppearance({ data: null })).toBeNull();
  });

  it('rejects unsafe image sources and unknown presets', () => {
    const normalized = normalizeSiteLoginAppearance({ data: {
      theme_preset: 'neon',
      bg_image_url: 'javascript:alert(1)',
      mascot_image_url: 'ftp://example.com/a.png'
    } });
    expect(normalized).toBeNull();
  });

  it('fetches the public appearance through the guest route', async () => {
    httpRequest.mockResolvedValueOnce({ data: { theme_preset: 'mint', version: 1 } });

    const appearance = await fetchSiteLoginAppearance();

    expect(httpRequest).toHaveBeenCalledWith('/api/v1/site/login-appearance', expect.objectContaining({
      method: 'GET'
    }));
    expect(appearance).toMatchObject({ configured: true, themePreset: 'mint' });
  });

  it('maps admin save calls to the versioned contract', async () => {
    const authorizedFetch = vi.fn().mockResolvedValueOnce({ data: {
      theme_preset: 'galaxy',
      bg_image_url: '',
      mascot_image_url: '/images/mascot.png',
      version: 1
    } });

    const saved = await saveAdminLoginAppearance(authorizedFetch, {
      expectedVersion: 0,
      themePreset: 'galaxy',
      bgImageUrl: '',
      mascotImageUrl: '/images/mascot.png'
    });

    expect(authorizedFetch).toHaveBeenCalledWith('/api/v1/admin/login-appearance', expect.objectContaining({
      method: 'PUT',
      body: {
        expected_version: 0,
        theme_preset: 'galaxy',
        bg_image_url: '',
        mascot_image_url: '/images/mascot.png'
      }
    }));
    expect(saved).toMatchObject({ themePreset: 'galaxy', mascotImageUrl: '/images/mascot.png' });
  });

  it('loads the admin appearance through the administrator route', async () => {
    const authorizedFetch = vi.fn().mockResolvedValueOnce({ data: { theme_preset: 'mint', version: 3 } });

    const appearance = await fetchAdminLoginAppearance(authorizedFetch);

    expect(authorizedFetch).toHaveBeenCalledWith('/api/v1/admin/login-appearance', { method: 'GET' });
    expect(appearance).toMatchObject({ configured: true, version: 3 });
  });
});
