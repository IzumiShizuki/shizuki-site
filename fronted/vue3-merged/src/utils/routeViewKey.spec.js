import { describe, expect, it } from 'vitest';
import { resolveAppRouteViewKey } from './routeViewKey';

describe('resolveAppRouteViewKey', () => {
  it('keeps the blog list shell stable across panel query changes', () => {
    expect(resolveAppRouteViewKey({ path: '/blog', fullPath: '/blog' })).toBe('blog-list-shell');
    expect(resolveAppRouteViewKey({ path: '/blog', fullPath: '/blog?panel=categories' })).toBe('blog-list-shell');
    expect(resolveAppRouteViewKey({ path: '/blog', fullPath: '/blog?panel=whisper' })).toBe('blog-list-shell');
  });

  it('reuses the blog workspace while moving between detail and editor routes', () => {
    expect(resolveAppRouteViewKey({ name: 'blog-detail', path: '/blog/12', fullPath: '/blog/12' })).toBe(
      'blog-workspace-shell'
    );
    expect(
      resolveAppRouteViewKey({ name: 'blog-editor', path: '/blog/editor/12', fullPath: '/blog/editor/12' })
    ).toBe('blog-workspace-shell');
    expect(resolveAppRouteViewKey({ name: 'blog-detail', path: '/blog/27', fullPath: '/blog/27' })).toBe(
      'blog-workspace-shell'
    );
  });

  it('keeps the dedicated music library shell behavior', () => {
    expect(resolveAppRouteViewKey({ path: '/music-library/player', fullPath: '/music-library/player' })).toBe(
      'music-library-shell'
    );
  });

  it('does not remount a route when only its query changes', () => {
    expect(resolveAppRouteViewKey({ name: 'author', path: '/author', fullPath: '/author?tab=posts' })).toBe(
      'author-shell'
    );
    expect(resolveAppRouteViewKey({ name: 'author', path: '/author', fullPath: '/author?tab=profile' })).toBe(
      'author-shell'
    );
  });
});
