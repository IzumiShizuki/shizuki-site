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

it('shows a next target separately, leaves Next enabled and offers retry after a failure', async () => {
  const wrapper = mount(MobileMiniPlayer, { props: { track: { title: 'Old track' } } });
  try {
    const track = { title: 'Upcoming track' };
    await wrapper.setProps({ nextTarget: track });
    expect(wrapper.get('.mini-title').text()).toBe('Old track');
    expect(wrapper.get('[role="status"]').text()).toBe('正在加载：Upcoming track');
    expect(wrapper.get('button[aria-label="取消切歌"]').exists()).toBe(true);
    await wrapper.get('button[aria-label="下一首"]').trigger('click');
    expect(wrapper.emitted('next')).toHaveLength(1);
    await wrapper.setProps({ nextTarget: null, nextError: track });
    expect(wrapper.get('[role="status"]').text()).toBe('加载失败：Upcoming track');
    await wrapper.get('button[aria-label="重试加载下一首"]').trigger('click');
    expect(wrapper.emitted('retry-next')).toHaveLength(1);
    await wrapper.setProps({ track, nextError: null });
    expect(wrapper.get('.mini-title').text()).toBe('Upcoming track');
    expect(wrapper.find('.next-status').exists()).toBe(false);
  } finally {
    wrapper.unmount();
  }
});
