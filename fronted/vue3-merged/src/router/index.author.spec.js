import { beforeEach, describe, expect, it, vi } from 'vitest';

const mockAuth = {
  ensureReady: vi.fn().mockResolvedValue(undefined),
  isAuthenticated: { value: true },
  user: { value: { userId: 3001, groups: ['USER'] } },
  authorizedFetch: vi.fn()
};

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mockAuth
}));

vi.mock('../services/musicApi', () => ({
  listMusicProviders: vi.fn().mockResolvedValue([])
}));

import router, { routePathByKey } from './index';

describe('author homepage routing', () => {
  beforeEach(async () => {
    if (typeof window !== 'undefined') {
      Object.defineProperty(window, 'scrollTo', {
        configurable: true,
        value: vi.fn(),
        writable: true
      });
    }

    mockAuth.ensureReady.mockClear();
    await router.push('/');
    await router.isReady();
  });

  it('maps top menu home to / and keeps the site intro at /author', () => {
    expect(routePathByKey.home).toBe('/');
    expect(routePathByKey.author).toBe('/author');
  });

  it('resolves /author to the author route', () => {
    const resolved = router.resolve('/author');

    expect(resolved.name).toBe('author');
    expect(resolved.path).toBe('/author');
    expect(resolved.matched.at(-1)?.path).toBe('/author');
  });

  it('navigates to the author route when pushing /author', async () => {
    await router.push('/author');

    expect(router.currentRoute.value.name).toBe('author');
    expect(router.currentRoute.value.path).toBe('/author');
  });
});
