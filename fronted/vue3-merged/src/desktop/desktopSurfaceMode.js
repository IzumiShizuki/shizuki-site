export const DESKTOP_SURFACE_ROLES = Object.freeze(['desktop', 'main', 'orb']);

export function resolveDesktopSurface(api = typeof window !== 'undefined' ? window.shizukiDesktop : null) {
  if (!api?.isDesktop) return Object.freeze({ managed: false, role: 'web', displayId: '' });
  const rawRole = String(api.surface?.role || 'main');
  const role = DESKTOP_SURFACE_ROLES.includes(rawRole) ? rawRole : 'main';
  return Object.freeze({
    managed: true,
    role,
    displayId: String(api.surface?.displayId || '')
  });
}

export function shouldMountOrbSurface(surface) {
  return Boolean(surface?.managed && surface.role === 'orb');
}

export function guardDesktopHomeRoute(surface, destination) {
  if (surface?.managed && surface.role === 'desktop' && destination?.path !== '/') {
    return { path: '/', replace: true };
  }
  return true;
}
