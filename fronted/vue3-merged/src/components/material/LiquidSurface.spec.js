import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import LiquidFilterDefinitions from './LiquidFilterDefinitions.vue';
import LiquidSurface from './LiquidSurface.vue';
import { LIQUID_FILTER_IDS } from './liquidFilterIds';

const liquidSurfaceCss = readFileSync(
  resolve(process.cwd(), 'src/styles/liquid-surface.css'),
  'utf8'
);

describe('LiquidSurface material foundation', () => {
  it('renders a semantic element and exposes one stable material variant', () => {
    const wrapper = mount(LiquidSurface, {
      props: { as: 'nav', variant: 'navigation' },
      slots: { default: '<a href="/">Home</a>' }
    });

    expect(wrapper.element.tagName).toBe('NAV');
    expect(wrapper.classes()).toContain('liquid-surface--navigation');
    expect(wrapper.attributes('data-liquid-variant')).toBe('navigation');
    expect(wrapper.attributes('data-liquid-refract')).toBe('true');
    expect(wrapper.get('a').text()).toBe('Home');
  });

  it('can opt out of refraction while retaining the glass fallback surface', () => {
    const wrapper = mount(LiquidSurface, {
      props: { variant: 'control', refract: false }
    });

    expect(wrapper.classes()).toContain('liquid-surface');
    expect(wrapper.attributes('data-liquid-refract')).toBe('false');
  });

  it('declares each shared SVG filter id exactly once', () => {
    const wrapper = mount(LiquidFilterDefinitions);
    const ids = wrapper.findAll('filter').map((filter) => filter.attributes('id'));

    expect(ids).toEqual([LIQUID_FILTER_IDS.surface, LIQUID_FILTER_IDS.lens]);
    expect(new Set(ids).size).toBe(ids.length);
    expect(wrapper.findAll('feDisplacementMap')).toHaveLength(2);
  });

  it('keeps day, night, unsupported-filter, and soothing-mode fallbacks explicit', () => {
    expect(liquidSurfaceCss).toContain(":root[data-theme-mode='day']");
    expect(liquidSurfaceCss).toContain(":root[data-theme-mode='night']");
    expect(liquidSurfaceCss).toContain('@supports ((backdrop-filter: blur(1px))');
    expect(liquidSurfaceCss).toContain('@supports not ((backdrop-filter: blur(1px))');
    expect(liquidSurfaceCss).toContain('var(--liquid-surface-fallback-fill)');
    expect(liquidSurfaceCss).toContain("@supports (filter: url('#shizuki-liquid-surface-refraction'))");
    expect(liquidSurfaceCss).toContain(":root[data-effective-motion-mode='soothing'] .liquid-surface::before");
    expect(liquidSurfaceCss).toContain('filter: none;');
    expect(liquidSurfaceCss).toContain('@media (forced-colors: active)');
  });

  it('keeps semantic keyboard focus and high-contrast no-filter colors', async () => {
    const wrapper = mount(LiquidSurface, {
      attachTo: document.body,
      props: { as: 'button', variant: 'control' },
      attrs: { type: 'button', 'aria-label': '打开站点菜单' }
    });

    expect(wrapper.element.tagName).toBe('BUTTON');
    expect(wrapper.attributes('aria-label')).toBe('打开站点菜单');
    wrapper.element.focus();
    expect(document.activeElement).toBe(wrapper.element);
    expect(liquidSurfaceCss).toContain('.liquid-surface:focus-visible');
    expect(liquidSurfaceCss).toContain('outline: 3px solid');
    expect(contrastRatio('#f7edf4', '#211a29')).toBeGreaterThan(7);
    expect(contrastRatio('#44363f', '#fffaf7')).toBeGreaterThan(7);
    wrapper.unmount();
  });
});

function contrastRatio(foreground, background) {
  const lighter = Math.max(relativeLuminance(foreground), relativeLuminance(background));
  const darker = Math.min(relativeLuminance(foreground), relativeLuminance(background));
  return (lighter + 0.05) / (darker + 0.05);
}

function relativeLuminance(hex) {
  const channels = hex.slice(1).match(/.{2}/g).map((value) => Number.parseInt(value, 16) / 255);
  const [red, green, blue] = channels.map((value) => (
    value <= 0.04045 ? value / 12.92 : ((value + 0.055) / 1.055) ** 2.4
  ));
  return 0.2126 * red + 0.7152 * green + 0.0722 * blue;
}
