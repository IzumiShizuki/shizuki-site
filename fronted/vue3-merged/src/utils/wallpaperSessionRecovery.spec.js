import { describe, expect, it } from 'vitest';
import {
  isSnapshotSelectionCurrent,
  reconcileWallpaperSelections,
  resolveWallpaperSnapshotForSession
} from './wallpaperSessionRecovery';

describe('wallpaper startup recovery', () => {
  it('restores a public applied snapshot before auth initialization completes', () => {
    const profile = { id: 'wp-42', type: 'static', src: '/cached/wallpaper.jpg' };
    const restored = resolveWallpaperSnapshotForSession({
      profile,
      accountId: '',
      visibility: 'PUBLIC',
      scope: 'global'
    }, { authorizationReady: false, accountId: '' });

    expect(restored).toEqual({ profile, accountId: '', visibility: 'PUBLIC', scope: 'global' });
  });

  it('keeps saved global and route IDs when the library request fails', () => {
    const selection = {
      globalBackgroundId: 'wp-42',
      routeBackgroundByKey: { home: 'wp-84' }
    };

    expect(reconcileWallpaperSelections(selection, [], { authoritative: false })).toEqual(selection);
  });

  it('matches only the preference scope owned by the snapshot', () => {
    const snapshot = { profile: { id: 'wp-global' }, scope: 'global' };
    expect(isSnapshotSelectionCurrent(snapshot, {
      globalBackgroundId: 'wp-global', routeBackgroundId: 'wp-route'
    })).toBe(true);
    expect(isSnapshotSelectionCurrent({ ...snapshot, scope: 'route' }, {
      globalBackgroundId: 'wp-global', routeBackgroundId: 'wp-route'
    })).toBe(false);
  });


  it('does not expose a private snapshot until the matching account is ready', () => {
    const snapshot = {
      profile: { id: 'wp-private-8', visibility: 'PRIVATE' },
      accountId: 'account-8',
      visibility: 'PRIVATE',
      scope: 'global'
    };

    expect(resolveWallpaperSnapshotForSession(snapshot, {
      authorizationReady: false,
      accountId: ''
    })).toBeNull();
    expect(resolveWallpaperSnapshotForSession(snapshot, {
      authorizationReady: true,
      accountId: 'account-9'
    })).toBeNull();
    expect(resolveWallpaperSnapshotForSession(snapshot, {
      authorizationReady: true,
      accountId: 'account-8'
    })).toEqual(snapshot);
  });
});
