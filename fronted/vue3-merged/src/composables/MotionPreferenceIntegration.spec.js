import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

function source(path) {
  return readFileSync(resolve(process.cwd(), path), 'utf8');
}

describe('Home-scoped motion mode integration', () => {
  it('keeps the global motion provider deterministic instead of binding the Home choice to the whole app', () => {
    const app = source('src/App.vue');

    expect(app).toContain('<MotionConfig reduced-motion="never">');
    expect(app).not.toContain('motionConfigReducedMotion');
    expect(app).not.toContain(':data-motion-mode="motionPreference.effectiveMode.value"');
    expect(app).toContain("const reducedMotion = computed(() => isHomeRoute.value && homeAppearance.state.effectiveMotionLevel === 'soothing')");
  });

  it.each([
    'src/pages/HomePage.vue',
    'src/pages/AuthorPage.vue',
    'src/pages/BlogListPage.vue',
    'src/pages/BlogPage.vue',
    'src/pages/AlbumsPage.vue',
    'src/pages/AlbumDetailPage.vue',
    'src/pages/MomentsPage.vue',
    'src/components/content/MediaLightbox.vue',
    'src/components/content/HorizontalCardRail.vue',
    'src/components/content/AuxiliaryDrawer.vue'
  ])('%s consumes the shared preference or a shared Home adapter', (path) => {
    const contents = source(path);

    expect(contents).toMatch(/useMotionPreference|useHomeAppearance/);
    expect(contents).toMatch(/effectiveMode|effectiveMotionLevel/);
  });

  it('uses the effective root mode for AOS and manual soothing scroll behavior', () => {
    const aosManager = source('src/utils/aosManager.js');
    const globalCss = source('src/styles/global.css');

    expect(aosManager).toContain('dataset?.effectiveMotionMode');
    expect(aosManager).toContain("effectiveMode === 'soothing'");
    expect(globalCss).toContain(":root[data-effective-motion-mode='soothing']");
    expect(globalCss).toContain('scroll-behavior: auto');
  });
});
