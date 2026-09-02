import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

function readSource(relativePath) {
  return readFileSync(resolve(process.cwd(), relativePath), 'utf8');
}

describe('blog M3E route contract', () => {
  it('keeps ambient color fields scoped to observable blog route hooks', () => {
    const listSource = readSource('src/pages/BlogListPage.vue');
    const readerSource = readSource('src/pages/BlogPage.vue');
    const styles = readSource('src/styles/blog-m3e.css');

    expect(listSource).toContain('class="route-page blog-list-page m3e-blog-route motion-managed"');
    expect(listSource).toContain('data-m3e-blog-surface="list"');
    expect(readerSource).toContain('class="route-page blog-page m3e-blog-route motion-managed"');
    expect(readerSource).toContain(":data-m3e-blog-surface=\"viewMode === 'detail' ? 'reader' : undefined\"");
    expect(styles).toContain('.m3e-blog-route::before');
    expect(styles).toContain('pointer-events: none');
    expect(styles).toContain('var(--m3-ambient-primary');
    expect(styles).toContain('var(--m3-ambient-companion');
  });

  it('maps list and reader surfaces to semantic M3 roles without targeting the editor workspace', () => {
    const styles = readSource('src/styles/blog-m3e.css');

    expect(styles).toContain('.blog-list-page.m3e-blog-route .feed-card');
    expect(styles).toContain('.feed-hero-title, .feed-hero-summary, .feed-hero-meta');
    expect(styles).toContain('.blog-page--public.m3e-blog-route .detail-scroll');
    expect(styles).toContain('var(--blog-m3-surface-container)');
    expect(styles).toContain('var(--blog-m3-secondary-container)');
    expect(styles).not.toContain('.blog-page--workspace.m3e-blog-route');
  });

  it('keeps keyboard, reduced-motion and mobile contracts explicit', () => {
    const listSource = readSource('src/pages/BlogListPage.vue');
    const readerSource = readSource('src/pages/BlogPage.vue');
    const styles = readSource('src/styles/blog-m3e.css');

    expect(listSource.match(/role="link"/g)).toHaveLength(2);
    expect(listSource.match(/tabindex="0"/g)).toHaveLength(2);
    expect(listSource).toContain('@keydown.enter="openPostDetail');
    expect(readerSource).toContain(':aria-busy="detailState.loading');
    expect(styles).toContain(':focus-visible');
    expect(styles).toContain("[data-motion-mode='soothing']");
    expect(styles).toContain('@media (prefers-reduced-motion: reduce)');
    expect(styles).toContain('@media (max-width: 899.98px)');
    expect(styles).toContain("'cover'");
    expect(styles).toContain('.blog-layout--reader > .center-panel');
  });
});
