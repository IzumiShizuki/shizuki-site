import { beforeEach, describe, expect, it, vi } from 'vitest';

const mockAuth = {
  ensureReady: vi.fn().mockResolvedValue(undefined),
  isAuthenticated: { value: true },
  user: { value: { userId: 1001, groups: ['USER'] } },
  authorizedFetch: vi.fn()
};

const listMusicProvidersMock = vi.fn();
let nextUserId = 2000;

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mockAuth
}));

vi.mock('../services/musicApi', () => ({
  listMusicProviders: (...args) => listMusicProvidersMock(...args)
}));

import router, { routePathByKey } from './index';

describe('music voice routing', () => {
  beforeEach(async () => {
    if (typeof window !== 'undefined') {
      Object.defineProperty(window, 'scrollTo', {
        configurable: true,
        value: vi.fn(),
        writable: true
      });
    }

    listMusicProvidersMock.mockReset();
    mockAuth.ensureReady.mockClear();
    mockAuth.authorizedFetch.mockReset();
    mockAuth.isAuthenticated.value = true;
    nextUserId += 1;
    mockAuth.user.value = { userId: nextUserId, groups: ['USER'] };
    await router.push('/');
    await router.isReady();
  });

  it('redirects voice route to music when asmr is not visible', async () => {
    listMusicProvidersMock.mockResolvedValueOnce([
      { provider: 'asmr', enabled: true, visible: false }
    ]);

    await router.push('/music-library/voice');

    expect(router.currentRoute.value.fullPath).toBe('/music-library/music?reason=voice_forbidden');
  }, 10000);

  it('allows voice route when asmr is visible', async () => {
    listMusicProvidersMock.mockResolvedValueOnce([
      { provider: 'asmr', enabled: true, visible: true }
    ]);

    await router.push('/music-library/voice');

    expect(router.currentRoute.value.name).toBe('music-library-voice');
  });

  it('uses /music-library/music as top menu path', () => {
    expect(routePathByKey['music-library']).toBe('/music-library/music');
  });
});
