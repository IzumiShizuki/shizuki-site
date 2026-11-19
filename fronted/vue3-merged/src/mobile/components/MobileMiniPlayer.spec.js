import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import MobileMiniPlayer from './MobileMiniPlayer.vue';

describe('MobileMiniPlayer', () => {
  it('keeps keyboard focus and click actions on separate player controls', async () => {
    const wrapper = mount(MobileMiniPlayer, { props: { track: { title: 'Fixture', artist: 'Artist' } } });
    const buttons = wrapper.findAll('button');
    expect(buttons).toHaveLength(3);
    expect(wrapper.find('[role="button"]').exists()).toBe(false);
    await buttons[1].trigger('keydown.enter');
    await buttons[1].trigger('click');
    await buttons[2].trigger('keydown.enter');
    await buttons[2].trigger('click');
    expect(wrapper.emitted('toggle-play')).toHaveLength(1);
    expect(wrapper.emitted('next')).toHaveLength(1);
    expect(wrapper.emitted('expand')).toBeUndefined();
    await buttons[0].trigger('click');
    expect(wrapper.emitted('expand')).toHaveLength(1);
  });
});
