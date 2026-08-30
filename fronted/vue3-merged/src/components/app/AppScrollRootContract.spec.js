import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

function readSource(relativePath) {
  return readFileSync(resolve(process.cwd(), relativePath), 'utf8');
}

describe('App public scroll root contract', () => {
  it('owns the active public scroll source and passes only its state to navigation', () => {
    const appSource = readSource('src/App.vue');

    expect(appSource).toContain('ref="routeContentRef"');
    expect(appSource).toContain("'route-content-app-scroll': isAppScrollRoute");
    expect(appSource).toContain(':route-scroll-top="routeScrollTop"');
    expect(appSource).toContain('useActiveScrollSource(activeRouteScrollSource)');
    expect(appSource).toContain('provideAppScrollRoot({');
    expect(appSource).toContain('const routeScrollPositions = new Map()');
    expect(appSource).toContain('routeScrollPositions.get(nextIdentity) || 0');
  });

  it('makes Blog list, Blog reader, and public Author content yield local vertical scrolling', () => {
    const blogListSource = readSource('src/pages/BlogListPage.vue');
    const blogReaderSource = readSource('src/pages/BlogPage.vue');
    const authorSource = readSource('src/pages/AuthorPage.vue');

    expect(blogListSource).toContain('data-scroll-owner="app"');
    expect(blogListSource).toContain('class="feed-column" :scrollable="false"');
    expect(blogReaderSource).toContain(':data-scroll-owner="viewMode === \'editor\' ? \'workspace\' : \'app\'"');
    expect(blogReaderSource).toContain('appScrollRoot.isActive.value');
    expect(authorSource).toContain(':data-scroll-owner="isAdminConsoleTab ? \'workspace\' : \'app\'"');
    expect(authorSource).toContain(':scrollable="isAdminConsoleTab"');
    expect(authorSource).toContain('resolveContentScrollRoot()');
  });
});
