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
