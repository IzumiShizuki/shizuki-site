import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import AppBackgroundStage from './AppBackgroundStage.vue';

function mountStage(source) {
  return mount(AppBackgroundStage, {
    props: { activeImageBackground: source },
    global: { stubs: { SceneEffectLayer: true, WallpaperL2dCanvas: true } }
  });
}

describe('background stage resource selection', () => {
  it('avoids downloading the legacy 2MB built-in image from restored preferences', () => {
    const wrapper = mountStage('/images/original-bg.png');
    expect(wrapper.get('img.bg-image').attributes('src')).toBe('/images/original-bg.webp');
  });

  it('continues rendering the exact custom wallpaper selected by the visitor', () => {
    const wrapper = mountStage('https://images.example/selected-wallpaper.png');
    expect(wrapper.get('img.bg-image').attributes('src')).toBe('https://images.example/selected-wallpaper.png');
  });
});
