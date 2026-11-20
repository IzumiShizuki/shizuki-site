import { mount } from '@vue/test-utils';
import { describe, expect, it, vi } from 'vitest';
import MusicLibraryDock from './MusicLibraryDock.vue';

describe('MusicLibraryDock current queue presentation', () => {
  it('reveals only the exact current duplicate entry in a long queue and does not chase the clock', async () => {
    const tracks = Array.from({ length: 1000 }, (_, index) => ({
      id: index === 869 || index === 12 ? 'duplicate-42' : `track-${index}`,
      provider: 'navidrome',
      queueEntryId: `queue-entry-${index}`,
      title: index === 869 ? 'Current late duplicate' : index === 12 ? 'Earlier duplicate' : `Track ${index}`
    }));
    const originalScrollIntoView = HTMLElement.prototype.scrollIntoView;
    HTMLElement.prototype.scrollIntoView = vi.fn();
    const wrapper = mount(MusicLibraryDock, {
      attachTo: document.body,
      props: {
        tracks,
        queueTracks: tracks,
        track: tracks[869],
        currentTrackId: 'duplicate-42',
        currentQueueEntryId: 'queue-entry-869',
        currentTime: 100,
        duration: 240
      },
      global: { stubs: { MusicVisualizerLayer: true } }
    });
    try {
      await wrapper.get('button[title="播放列表"]').trigger('click');
      const activeRows = wrapper.findAll('.queue-item.active');
      expect(activeRows).toHaveLength(1);
      expect(activeRows[0].text()).toContain('Current late duplicate');
      expect(HTMLElement.prototype.scrollIntoView).toHaveBeenCalledWith(expect.objectContaining({ block: 'nearest' }));

      await wrapper.setProps({ currentTime: 101 });
      expect(HTMLElement.prototype.scrollIntoView).toHaveBeenCalledTimes(1);
    } finally {
      wrapper.unmount();
      if (originalScrollIntoView) HTMLElement.prototype.scrollIntoView = originalScrollIntoView;
      else delete HTMLElement.prototype.scrollIntoView;
    }
  });
});

it('shows a next target separately, leaves Next enabled and offers retry after a failure', async () => {
  const wrapper = mount(MusicLibraryDock, {
    props: { track: { title: 'Old track' } },
    global: { stubs: { MusicVisualizerLayer: true } }
  });
  try {
    const track = { title: 'Upcoming track' };
    await wrapper.setProps({ nextTarget: track });
    expect(wrapper.get('.title').text()).toBe('Old track');
    expect(wrapper.get('[role="status"]').text()).toBe('正在加载：Upcoming track');
    expect(wrapper.get('button[title="取消切歌"]').exists()).toBe(true);
    await wrapper.get('button[title="下一首"]').trigger('click');
    expect(wrapper.emitted('next')).toHaveLength(1);
    await wrapper.setProps({ nextTarget: null, nextError: track });
    expect(wrapper.get('[role="status"]').text()).toBe('加载失败：Upcoming track');
    await wrapper.get('button[aria-label="重试加载下一首"]').trigger('click');
    expect(wrapper.emitted('retry-next')).toHaveLength(1);
    await wrapper.setProps({ track, nextError: null });
    expect(wrapper.get('.title').text()).toBe('Upcoming track');
    expect(wrapper.find('.next-status').exists()).toBe(false);
  } finally {
    wrapper.unmount();
  }
});
