import { mount } from '@vue/test-utils';
import { describe, expect, it, vi } from 'vitest';
import MusicPlayer from './MusicPlayer.vue';

describe('MusicPlayer authoritative queue list', () => {
  it('reveals the current duplicate entry in the full queue and ignores clock updates', async () => {
    const tracks = Array.from({ length: 1000 }, (_, index) => ({
      id: index === 12 || index === 869 ? 'duplicate-42' : `track-${index}`,
      trackId: index === 12 || index === 869 ? '42' : `track-${index}`,
      provider: 'navidrome',
      queueEntryId: `queue-entry-${index}`,
      title: index === 869 ? 'Current late duplicate' : index === 12 ? 'Earlier duplicate' : `Track ${index}`
    }));
    const originalScrollIntoView = HTMLElement.prototype.scrollIntoView;
    HTMLElement.prototype.scrollIntoView = vi.fn();
    const wrapper = mount(MusicPlayer, {
      attachTo: document.body,
      props: {
        tracks,
        track: tracks[869],
        currentTime: 100,
        duration: 240,
        isExpanded: true,
        listOpen: false
      }
    });
    try {
      await wrapper.setProps({ listOpen: true });
      await wrapper.vm.$nextTick();
      const activeRows = wrapper.findAll('.side-list .track-item.active');
      expect(activeRows).toHaveLength(1);
      expect(activeRows[0].text()).toContain('Current late duplicate');
      expect(HTMLElement.prototype.scrollIntoView).toHaveBeenCalledWith(expect.objectContaining({ block: 'nearest' }));

      await wrapper.setProps({ currentTime: 101 });
      expect(HTMLElement.prototype.scrollIntoView).toHaveBeenCalledOnce();
    } finally {
      wrapper.unmount();
      if (originalScrollIntoView) HTMLElement.prototype.scrollIntoView = originalScrollIntoView;
      else delete HTMLElement.prototype.scrollIntoView;
    }
  });

  it('does not mount its queue overlay while the host player is route-suppressed', () => {
    const wrapper = mount(MusicPlayer, {
      props: { isExpanded: true, listOpen: true, suppressedByRoute: true }
    });

    expect(wrapper.find('.side-list').exists()).toBe(false);
    wrapper.unmount();
  });
});
