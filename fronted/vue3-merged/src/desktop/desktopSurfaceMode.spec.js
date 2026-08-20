import { describe, expect, it } from 'vitest';
import { guardDesktopHomeRoute, resolveDesktopSurface, shouldMountOrbSurface } from './desktopSurfaceMode';

describe('desktopSurfaceMode', () => {
  it('keeps ordinary web rendering unmanaged', () => {
    expect(resolveDesktopSurface(null)).toEqual({ managed: false, role: 'web', displayId: '' });
  });

  it('normalizes immutable desktop roles', () => {
    const surface = resolveDesktopSurface({ isDesktop: true, surface: { role: 'desktop', displayId: '2' } });
    expect(surface).toEqual({ managed: true, role: 'desktop', displayId: '2' });
    expect(shouldMountOrbSurface(surface)).toBe(false);
    expect(shouldMountOrbSurface(resolveDesktopSurface({ isDesktop: true, surface: { role: 'orb' } }))).toBe(true);
  });

  it('keeps the desktop surface on Home while main and web routes remain unrestricted', () => {
    expect(guardDesktopHomeRoute({ managed: true, role: 'desktop' }, { path: '/apps' })).toEqual({ path: '/', replace: true });
    expect(guardDesktopHomeRoute({ managed: true, role: 'desktop' }, { path: '/' })).toBe(true);
    expect(guardDesktopHomeRoute({ managed: true, role: 'main' }, { path: '/apps' })).toBe(true);
  });
});
