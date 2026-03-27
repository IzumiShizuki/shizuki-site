function normalizePath(value) {
  return typeof value === 'string' ? value : '';
}

export function resolveAppRouteViewKey(viewRoute) {
  const path = normalizePath(viewRoute?.path);
  if (path.startsWith('/music-library')) {
    return 'music-library-shell';
  }
  if (path === '/blog') {
    return 'blog-shell';
  }
  return String(viewRoute?.fullPath || path || 'route');
}
