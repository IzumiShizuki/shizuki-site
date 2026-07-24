import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import MusicRightPanel from './MusicRightPanel.vue';

function mountPanel(props = {}) {
  return mount(MusicRightPanel, {
    props: {
      track: {
        title: 'Test Track',
        artist: 'Test Artist',
        cover: 'https://example.com/cover.png'
      },
      lyricContext: {
        prev: 'prev',
        prevTime: 8,
        current: 'current',
        currentTime: 12,
        next: 'next',
        nextTime: 16
      },
      volume: 0.42,
      eqLevels: [0.66, 0.52, 0.74],
      expandedProvider: '',
      metingStatus: {
        available: true,
        providers: ['qqmusic', 'tencent', 'netease', 'kuwo']
      },
      spotifyResults: [],
      ...props
    }
  });
}

describe('MusicRightPanel', () => {
  it('keeps legacy tunehub provider collapsed and reflects mobile drawer state', () => {
    const wrapper = mountPanel({
      expandedProvider: 'tunehub',
      isMobile: true,
      drawerOpen: true
    });

    expect(wrapper.classes()).toContain('mobile');
    expect(wrapper.classes()).toContain('drawer-open');
    expect(wrapper.findAll('.integration-tile')[0].classes()).not.toContain('extended');
    expect(wrapper.find('.tile-expanded-content').exists()).toBe(false);
  });

  it('dedupes meting provider tags and collapses the active tile on repeat click', async () => {
    const wrapper = mountPanel({
      expandedProvider: 'meting'
    });

    expect(wrapper.findAll('.integration-tile')[0].classes()).toContain('extended');
    expect(wrapper.findAll('.provider-tag')).toHaveLength(3);

    await wrapper.findAll('.tile-trigger')[0].trigger('click');

    expect(wrapper.emitted('update:expandedProvider')).toEqual([['']]);
  });

  it('emits provider, volume, and eq updates with percent styles for sliders', async () => {
    const wrapper = mountPanel();
    const sliders = wrapper.findAll('input[type="range"]');

    expect(sliders).toHaveLength(4);
    expect(sliders[0].attributes('style')).toContain('--level-percent: 42%');
    expect(sliders[1].attributes('style')).toContain('--level-percent: 66%');

    await wrapper.findAll('.tile-trigger')[0].trigger('click');
    await wrapper.findAll('.tile-trigger')[1].trigger('click');
    await sliders[0].setValue(35);
    await sliders[2].setValue(80);

    expect(wrapper.emitted('update:expandedProvider')).toEqual([['meting'], ['spotify']]);
    expect(wrapper.emitted('set-volume')).toEqual([[0.35]]);
    expect(wrapper.emitted('set-eq-level')).toEqual([[{ index: 1, value: 0.8 }]]);
  });

  it('seeks to the clicked timestamped lyric line', async () => {
    const wrapper = mountPanel();
    const currentLine = wrapper.find('.lyric-card .line.current');

    expect(currentLine.element.tagName).toBe('BUTTON');
    expect(currentLine.attributes('disabled')).toBeUndefined();

    await currentLine.trigger('click');

    expect(wrapper.emitted('seek-lyric')).toEqual([[12]]);
  });
});
