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

describe('AI Hub routing', () => {
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

  it('keeps AI Hub as the single top-level AI entry', () => {
    expect(routePathByKey['ai-hub']).toBe('/ai-hub');
    expect(Object.prototype.hasOwnProperty.call(routePathByKey, 'meguri')).toBe(false);

    const resolved = router.resolve('/ai-hub');
    expect(resolved.name).toBe('ai-hub');
  });

  it('does not register the retired standalone Meguri route', () => {
    expect(router.hasRoute('meguri')).toBe(false);
  });
});
