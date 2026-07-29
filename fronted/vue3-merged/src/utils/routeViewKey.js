function normalizePath(value) {
  return typeof value === 'string' ? value : '';
}

export function resolveAppRouteViewKey(viewRoute) {
  const path = normalizePath(viewRoute?.path);
  if (path.startsWith('/music-library')) {
    return 'music-library-shell';
  }
  if (path === '/blog') {
    return 'blog-list-shell';
  }
  if (
    viewRoute?.name === 'blog-editor' ||
    viewRoute?.name === 'blog-detail' ||
    path.startsWith('/blog/editor/') ||
    /^\/blog\/[^/]+$/.test(path)
  ) {
    return 'blog-workspace-shell';
  }

  const routeName = String(viewRoute?.name || '').trim();
  if (routeName) {
    return `${routeName}-shell`;
  }
  return `${path || 'route'}-shell`;
}
