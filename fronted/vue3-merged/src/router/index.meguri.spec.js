import { beforeEach, describe, expect, it, vi } from 'vitest';

const mockAuth = {
  ensureReady: vi.fn().mockResolvedValue(undefined),
  isAuthenticated: { value: true },
  user: { value: { userId: 1, groups: ['USER'] } },
  authorizedFetch: vi.fn()
};

vi.mock('../composables/useAuthSession', () => ({
  useAuthSession: () => mockAuth
}));

vi.mock('../services/musicApi', () => ({
  listMusicProviders: vi.fn().mockResolvedValue([])
}));

import router, { routePathByKey } from './index';

describe('meguri routing', () => {
  beforeEach(async () => {
    if (typeof window !== 'undefined') {
      Object.defineProperty(window, 'scrollTo', {
        configurable: true,
        value: vi.fn(),
        writable: true
      });
    }

    mockAuth.isAuthenticated.value = true;
    mockAuth.user.value = { userId: 1, groups: ['USER'] };
    await router.push('/');
    await router.isReady();
  });

  it('registers /meguri with auth + admin route meta', () => {
    expect(routePathByKey.meguri).toBe('/meguri');
    const resolved = router.resolve('/meguri');
    expect(resolved.name).toBe('meguri');
    expect(resolved.meta.requiresAuth).toBe(true);
    expect(resolved.meta.requiresAdmin).toBe(true);
  });

  it('redirects guests to /auth with a redirect back to /meguri', async () => {
    mockAuth.isAuthenticated.value = false;
    mockAuth.user.value = null;

    await router.push('/meguri');

    expect(router.currentRoute.value.path).toBe('/auth');
    expect(router.currentRoute.value.query.redirect).toBe('/meguri');
  });

  it('redirects non-admin users to the profile page', async () => {
    mockAuth.isAuthenticated.value = true;
    mockAuth.user.value = { userId: 2, groups: ['USER'] };

    await router.push('/meguri');

    expect(router.currentRoute.value.path).toBe('/profile');
    expect(router.currentRoute.value.query.reason).toBe('admin_only');
  });

  it('lets ADMIN group members open the meguri page', async () => {
    mockAuth.isAuthenticated.value = true;
    mockAuth.user.value = { userId: 1, groups: ['USER', 'ADMIN'] };

    await router.push('/meguri');

    expect(router.currentRoute.value.name).toBe('meguri');
  });
});
