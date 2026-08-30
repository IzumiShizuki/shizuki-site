import { mount } from '@vue/test-utils';
import { nextTick, ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { PLAYER_BRIDGE_KEY } from '../../composables/playerBridge';
import RecommendedMusicCard from './RecommendedMusicCard.vue';

function createBridge() {
  return {
    tracks: ref([
      { id: 'track-1', title: '推荐曲目', artist: '推荐歌手', cover: '' },
      { id: 'track-2', title: '第二首', artist: '另一位歌手', cover: '' }
    ]),
    playlistProfile: ref({ name: '站点推荐' }),
    playlistLoading: ref(false),
    playlistError: ref(''),
    currentTrack: ref(null),
    isPlaying: ref(false),
    currentTime: ref(37),
    setPlayerExpanded: vi.fn(),
    setListOpen: vi.fn(),
    selectTrackByIndex: vi.fn(),
    togglePlay: vi.fn(),
    replaceQueueWithTracks: vi.fn()
  };
}

describe('RecommendedMusicCard', () => {
  beforeEach(() => {
    Object.defineProperty(window, 'matchMedia', {
      configurable: true,
      value: vi.fn(() => ({ matches: false, addEventListener: vi.fn(), removeEventListener: vi.fn() }))
    });
  });

  it('projects the idle global queue and only opens the existing player', async () => {
    const bridge = createBridge();
    const wrapper = mount(RecommendedMusicCard, {
      global: { provide: { [PLAYER_BRIDGE_KEY]: bridge } }
    });

    expect(wrapper.text()).toContain('推荐自 站点推荐');
    expect(wrapper.text()).toContain('推荐曲目');
    await wrapper.get('button').trigger('click');

    expect(bridge.setPlayerExpanded).toHaveBeenCalledWith(true);
    expect(bridge.setListOpen).toHaveBeenCalledWith(true);
    expect(bridge.selectTrackByIndex).not.toHaveBeenCalled();
    expect(bridge.togglePlay).not.toHaveBeenCalled();
    expect(bridge.replaceQueueWithTracks).not.toHaveBeenCalled();
  });

  it('reacts to the same current-track state without creating a local player', async () => {
    const bridge = createBridge();
    const wrapper = mount(RecommendedMusicCard, {
      global: { provide: { [PLAYER_BRIDGE_KEY]: bridge } }
    });

    bridge.currentTrack.value = { id: 'playing', title: '当前播放', artist: '同一个播放器', cover: '' };
    bridge.isPlaying.value = true;
    await nextTick();

    expect(wrapper.text()).toContain('正在播放');
    expect(wrapper.text()).toContain('当前播放');
    expect(wrapper.find('[data-global-player-projection]').exists()).toBe(true);
  });

  it('shows an honest disabled state outside the app player context', () => {
    const wrapper = mount(RecommendedMusicCard);

    expect(wrapper.get('button').attributes('disabled')).toBeDefined();
    expect(wrapper.text()).toContain('当前页面未连接播放器');
  });
});
