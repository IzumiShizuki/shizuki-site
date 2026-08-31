import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

function readSource(relativePath) {
  return readFileSync(resolve(process.cwd(), relativePath), 'utf8');
}

describe('App public scroll root contract', () => {
  it('tracks either the route container or a claimed center source and passes its state to navigation', () => {
    const appSource = readSource('src/App.vue');

    expect(appSource).toContain('ref="routeContentRef"');
    expect(appSource).toContain("'route-content-app-scroll': routeContentOwnsScroll");
    expect(appSource).toContain("'route-content-fixed-workspace': !routeContentOwnsScroll");
    expect(appSource).toContain(':route-scroll-top="routeScrollTop"');
    expect(appSource).toContain('createAppScrollOwnerController()');
    expect(appSource).toContain('useActiveScrollSource(activeRouteScrollSource)');
    expect(appSource).toContain('provideAppScrollRoot({');
    expect(appSource).toContain('claimScrollOwner: nestedScrollOwner.claim');
    expect(appSource).toContain('fullNavigationVisible.value || Boolean(nestedScrollOwner.element.value)');
    expect(appSource).toContain('const routeScrollPositions = new Map()');
    expect(appSource).toContain('routeScrollPositions.get(nextIdentity) || 0');
  });

  it('makes Blog list, Blog reader, and public Author content claim center scrolling on desktop', () => {
    const blogListSource = readSource('src/pages/BlogListPage.vue');
    const blogReaderSource = readSource('src/pages/BlogPage.vue');
    const authorSource = readSource('src/pages/AuthorPage.vue');
    const authorExperienceSource = readSource('src/components/author/AuthorAboutExperience.vue');

    expect(blogListSource).toContain(":data-scroll-owner=\"isMobileLike ? 'app' : 'center'\"");
    expect(blogListSource).toContain(':app-scroll-owner="!isMobileLike"');
    expect(blogReaderSource).toContain(":data-scroll-owner=\"viewMode === 'editor' ? 'workspace' : (isMobileLike ? 'app' : 'center')\"");
    expect(blogReaderSource).toContain(':app-scroll-owner="!isMobileLike"');
    expect(blogReaderSource).toContain('appScrollRoot.isActive.value');
    expect(authorSource).toContain(":data-scroll-owner=\"isAdminConsoleTab ? 'workspace' : (isPublicExperienceTab ? 'center' : 'app')\"");
    expect(authorSource).toContain(':scrollable="isAdminConsoleTab"');
    expect(authorExperienceSource).toContain(':app-scroll-owner="!compactLayout"');
    expect(authorSource).toContain('resolveContentScrollRoot()');
  });
});
