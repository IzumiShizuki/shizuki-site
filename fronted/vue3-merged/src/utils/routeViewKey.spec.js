import { describe, expect, it } from 'vitest';
import { resolveAppRouteViewKey } from './routeViewKey';

describe('resolveAppRouteViewKey', () => {
  it('keeps the blog list shell stable across panel query changes', () => {
    expect(resolveAppRouteViewKey({ path: '/blog', fullPath: '/blog' })).toBe('blog-shell');
    expect(resolveAppRouteViewKey({ path: '/blog', fullPath: '/blog?panel=categories' })).toBe('blog-shell');
    expect(resolveAppRouteViewKey({ path: '/blog', fullPath: '/blog?panel=whisper' })).toBe('blog-shell');
  });

  it('keeps the dedicated music library shell behavior', () => {
    expect(resolveAppRouteViewKey({ path: '/music-library/player', fullPath: '/music-library/player' })).toBe(
      'music-library-shell'
    );
  });

  it('preserves fullPath keys for non-shell routes', () => {
    expect(resolveAppRouteViewKey({ path: '/blog/12', fullPath: '/blog/12?scope=mine' })).toBe('/blog/12?scope=mine');
    expect(resolveAppRouteViewKey({ path: '/author', fullPath: '/author?tab=posts' })).toBe('/author?tab=posts');
  });
});
