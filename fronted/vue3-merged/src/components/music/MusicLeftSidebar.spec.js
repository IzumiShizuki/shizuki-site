import { mount } from '@vue/test-utils';
import { describe, expect, it } from 'vitest';
import MusicLeftSidebar from './MusicLeftSidebar.vue';

describe('MusicLeftSidebar', () => {
  it('shows a retryable load error instead of disguising it as an empty library', async () => {
    const wrapper = mount(MusicLeftSidebar, {
      props: {
        errorText: '歌单加载失败，请重试'
      }
    });

    expect(wrapper.get('[role="alert"]').text()).toContain('歌单加载失败');
    await wrapper.get('.retry-sidebar-btn').trigger('click');
    expect(wrapper.emitted('retry')).toHaveLength(1);
  });

  it('marks source-account playlists with a cloud import icon', () => {
    const wrapper = mount(MusicLeftSidebar, {
      props: {
        createdPlaylists: [{
          playlistCode: 'source-net-1',
          name: '网易云歌单',
          sourceProvider: 'netease'
        }]
      }
    });

    expect(wrapper.get('.list-item .fa-cloud-arrow-down').exists()).toBe(true);
  });
});
