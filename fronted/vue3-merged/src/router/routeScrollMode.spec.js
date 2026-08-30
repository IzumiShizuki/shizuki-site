import { describe, expect, it } from 'vitest';
import { resolveRouteScrollMode, RouteScrollMode } from './routeScrollMode';
import router from './index';

describe('route scroll mode', () => {
  it.each([
    ['blog', undefined],
    ['blog-detail', undefined],
    ['author', { tab: 'journey' }]
  ])('keeps %s on the App-owned public scroll root', (name, query) => {
    expect(resolveRouteScrollMode({ name, query, meta: { scrollMode: RouteScrollMode.APP } })).toBe(RouteScrollMode.APP);
  });

  it.each([
    ['blog-editor'],
    ['blog-presentation'],
    ['music-library'],
    ['apps'],
    ['ai-hub'],
    ['admin']
  ])('keeps %s as an explicit fixed workspace exception', (name) => {
    expect(resolveRouteScrollMode({ name, meta: { scrollMode: RouteScrollMode.WORKSPACE } })).toBe(RouteScrollMode.WORKSPACE);
  });

  it('treats the embedded Author admin console as a workspace without changing the public Author route contract', () => {
    expect(resolveRouteScrollMode({
      name: 'author',
      query: { tab: 'admin:users' },
      meta: { scrollMode: RouteScrollMode.APP }
    })).toBe(RouteScrollMode.WORKSPACE);
  });

  it('declares public content and fixed workspace modes on the real route records', () => {
    expect(router.resolve('/blog').meta.scrollMode).toBe(RouteScrollMode.APP);
    expect(router.resolve('/blog/42').meta.scrollMode).toBe(RouteScrollMode.APP);
    expect(router.resolve('/author').meta.scrollMode).toBe(RouteScrollMode.APP);
    expect(router.resolve('/blog/editor/42').meta.scrollMode).toBe(RouteScrollMode.WORKSPACE);
    expect(router.resolve('/blog/42/presentation').meta.scrollMode).toBe(RouteScrollMode.WORKSPACE);
    expect(router.resolve('/music-library/music').meta.scrollMode).toBe(RouteScrollMode.WORKSPACE);
    expect(router.resolve('/apps').meta.scrollMode).toBe(RouteScrollMode.WORKSPACE);
    expect(router.resolve('/ai-hub').meta.scrollMode).toBe(RouteScrollMode.WORKSPACE);
    expect(router.resolve('/admin').meta.scrollMode).toBe(RouteScrollMode.WORKSPACE);
  });
});
