import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

function source(path) {
  return readFileSync(resolve(process.cwd(), path), 'utf8');
}

describe('motion transform ownership', () => {
  it('lets the menu shell own open and close displacement while menu items only stagger opacity', () => {
    const menu = source('src/components/TopMenu.vue');

    expect(menu).toContain('data-transform-owner="menu-shell"');
    expect(menu).toMatch(/\.fixed-nav-wrapper \{[\s\S]*?transform: translateY\(15px\)/);
    expect(menu).toMatch(/\.fixed-nav-wrapper\.expanded \{[\s\S]*?transform: translateY\(15px\)/);
    expect(menu).toMatch(/\.fixed-nav-wrapper:not\(\.expanded\) \.menu-item-stack \{\s*opacity: 0;\s*pointer-events: none;/);
    expect(menu).not.toMatch(/\.fixed-nav-wrapper:not\(\.expanded\) \.menu-item-stack \{[^}]*transform:/);
    expect(menu).not.toContain('.top-menu-root.motion-managed .menu-item-stack');
  });

  it('lets each blog card cover own hover displacement without moving the outer card and its text', () => {
    const blog = source('src/pages/BlogListPage.vue');

    expect(blog.match(/data-transform-owner="cover"/g)).toHaveLength(2);
    expect(blog).not.toMatch(/\.feed-card:hover \{[^}]*transform:/);
    expect(blog).not.toMatch(/\.feed-hero:hover \{[^}]*transform:/);
    const readMoreHover = blog.match(/\.feed-card:hover \.read-more \{([^}]*)\}/)?.[1] || '';
    expect(readMoreHover).not.toContain('transform:');
    expect(blog).toMatch(/\.feed-hero:hover \.feed-hero-cover \{\s*transform: scale\(1\.03\)/);
    expect(blog).toMatch(/\.feed-card:hover \.cover-pane img \{\s*transform: scale\(1\.02\)/);
  });

  it('keeps drawer backdrop opacity and panel displacement on separate owners', () => {
    const drawer = source('src/components/content/AuxiliaryDrawer.vue');

    expect(drawer).toMatch(/\.auxiliary-drawer-enter-active,[\s\S]*?transition: opacity 220ms ease;/);
    expect(drawer).toMatch(/\.auxiliary-drawer-enter-active \.auxiliary-drawer__panel,[\s\S]*?transition: transform 220ms ease;/);
    expect(drawer).not.toContain('transition: opacity 220ms ease, transform 220ms ease');
  });

  it('does not wrap route components in a second CSS transform transition owner', () => {
    const app = source('src/App.vue');
    const routerView = app.slice(app.indexOf('<RouterView v-slot="{ Component, route: viewRoute }">'));
    const routeBlock = routerView.slice(0, routerView.indexOf('</RouterView>'));

    expect(routeBlock).toContain('<component :is="Component"');
    expect(routeBlock).not.toContain('<Transition');
    expect(routeBlock).not.toContain('<transition');
  });

  it('adds a fade-and-rise route entrance without taking ownership of page transforms', () => {
    const app = source('src/App.vue');

    expect(app).toMatch(/\.route-page-view \{[\s\S]*?animation: route-view-enter 360ms/);
    expect(app).toMatch(/@keyframes route-view-enter \{[\s\S]*?opacity: 0;[\s\S]*?translate: 0 12px;/);
    expect(app).not.toMatch(/@keyframes route-view-enter \{[^}]*transform:/);
    expect(app).toMatch(/@media \(prefers-reduced-motion: reduce\) \{[\s\S]*?\.route-page-view \{\s*animation: none !important;/);
  });

  it('uses immediate section scrolling when reduced motion is requested', () => {
    const author = source('src/pages/AuthorPage.vue');

    expect(author).toContain("window.matchMedia('(prefers-reduced-motion: reduce)').matches");
    expect(author).toContain("options.behavior === 'auto' || reducedMotionRequested ? 'auto' : 'smooth'");
    expect(author).toContain("scrollToPublicSection(publicSection, { behavior: 'auto', updateRoute: false })");
  });
});
