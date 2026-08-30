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
import { RouteScrollMode } from './routeScrollMode';

describe('public life-content routing', () => {
  beforeEach(async () => {
    Object.defineProperty(window, 'scrollTo', {
      configurable: true,
      value: vi.fn(),
      writable: true
    });
    await router.push('/');
    await router.isReady();
  });

  it('registers Albums, Album detail and Moments under the App scroll contract', () => {
    expect(routePathByKey.albums).toBe('/albums');
    expect(routePathByKey.moments).toBe('/moments');

    const albums = router.resolve('/albums');
    const detail = router.resolve('/albums/a-real-public-slug');
    const moments = router.resolve('/moments?moment=moment-real-a1');
    const momentDetail = router.resolve('/moments/moment-real-a1');

    expect(albums.name).toBe('albums');
    expect(detail.name).toBe('album-detail');
    expect(detail.params.publicSlug).toBe('a-real-public-slug');
    expect(moments.name).toBe('moments');
    expect(momentDetail.name).toBe('moment-detail');
    expect(momentDetail.params.publicId).toBe('moment-real-a1');
    expect([albums, detail, moments, momentDetail]
      .every((route) => route.meta.scrollMode === RouteScrollMode.APP)).toBe(true);
  });

  it('navigates among public life routes without an authentication boundary', async () => {
    await router.push('/albums');
    expect(router.currentRoute.value.name).toBe('albums');

    await router.push('/moments');
    expect(router.currentRoute.value.name).toBe('moments');
  });
});
