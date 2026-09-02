import { mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it } from 'vitest';
import ThemeColorStudio from './ThemeColorStudio.vue';
import { useUiPreferences } from '../../composables/useUiPreferences';

describe('ThemeColorStudio', () => {
  const ui = useUiPreferences();

  beforeEach(() => {
    window.localStorage.clear();
    ui.setThemeMode('night');
    ui.setAccentMode('solid');
    ui.setAccentHex('#F2B39D');
    ui.setPaletteStyle('soft');
  });

  it('renders compact semantic controls without the custom editor', () => {
    const wrapper = mount(ThemeColorStudio, { props: { mode: 'compact' } });

    expect(wrapper.classes()).toContain('is-compact');
    expect(wrapper.text()).toContain('Material 3 Expressive');
    expect(wrapper.text()).toContain('柔和陪伴');
    expect(wrapper.find('.semantic-preview').exists()).toBe(true);
    expect(wrapper.find('.custom-editor').exists()).toBe(false);
  });

  it('keeps compact and full instances synchronized through shared preferences', async () => {
    const compact = mount(ThemeColorStudio, { props: { mode: 'compact' } });
    const full = mount(ThemeColorStudio, { props: { mode: 'full' } });
    const expressive = compact.findAll('.style-card').find((node) => node.text().includes('灵动跳色'));

    await expressive.trigger('click');

    expect(ui.state.paletteStyle).toBe('expressive');
    expect(compact.findAll('.style-card').find((node) => node.text().includes('灵动跳色')).attributes('aria-pressed')).toBe('true');
    expect(full.findAll('.style-card').find((node) => node.text().includes('灵动跳色')).attributes('aria-pressed')).toBe('true');
    expect(full.find('.custom-editor').exists()).toBe(true);
  });

  it('switches day mode and gradient presets with native button semantics', async () => {
    const wrapper = mount(ThemeColorStudio, { props: { mode: 'compact' } });
    const day = wrapper.findAll('.segments button').find((node) => node.text().includes('日间'));
    const gradient = wrapper.findAll('.segments button').find((node) => node.text().includes('渐变'));

    await day.trigger('click');
    await gradient.trigger('click');
    const ocean = wrapper.findAll('.seed-btn').find((node) => node.text().includes('极光海蓝'));
    await ocean.trigger('click');

    expect(ui.state.themeMode).toBe('day');
    expect(ui.state.accentMode).toBe('gradient');
    expect(ui.state.accentGradientId).toBe('glass-ocean');
    expect(day.attributes('aria-pressed')).toBe('true');
    expect(ocean.attributes('aria-pressed')).toBe('true');
  });
});
