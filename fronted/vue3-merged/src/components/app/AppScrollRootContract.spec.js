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
    expect(appSource).toContain('const workspaceNavigationSpaceReserved = computed(() => fullNavigationVisible.value)');
    expect(appSource).not.toContain('fullNavigationVisible.value || Boolean(nestedScrollOwner.element.value)');
    expect(appSource).toContain("'author-workspace-active': isAuthorWorkspaceRoute");
    expect(appSource).toContain("const isAuthorWorkspaceRoute = computed(() => route.path === '/author')");
    expect(appSource).toContain('width: min(1760px, calc(100vw - 24px))');
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
    expect(authorSource).toContain('data-scroll-owner="center"');
    expect(authorSource).toContain(':scrollable="true"');
    expect(authorSource).toContain(':app-scroll-owner="true"');
    expect(authorSource).toContain('app-scroll-owner-media="(min-width: 1200px)"');
    expect(authorExperienceSource).not.toContain('app-scroll-owner');
    expect(authorSource).toContain('--content-shell-left: clamp(236px, 15vw, 276px)');
    expect(authorSource).toContain('--content-shell-right: clamp(300px, 18vw, 348px)');
    expect(authorSource).toContain('scroll-padding-bottom: max(96px, env(safe-area-inset-bottom))');
    expect(authorExperienceSource).toContain('padding: 2px 4px max(96px, env(safe-area-inset-bottom))');
    expect(authorSource).toContain('resolveContentScrollRoot()');
  });
});
