import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { MUSIC_LIBRARY_CONTEXT_KEY } from '../../composables/musicLibraryContext';

const api = vi.hoisted(() => ({ getRecommendedPodcasts: vi.fn(), getPersonalFmTracks: vi.fn() }));
vi.mock('../../services/musicApi', () => api);
import MusicPlatformRadioView from './MusicPlatformRadioView.vue';

function createContext() {
  return {
    authState: ref({ isAuthenticated: true, accountId: 'user-a' }),
    musicSourceAccounts: ref({ netease: { bound: true } }),
    authorizedMusicFetch: vi.fn(() => 'account-scoped-fetch'),
    openPlaylistDetail: vi.fn(), requestMusicLogin: vi.fn(), bindMusicSourceAccount: vi.fn(),
    isTrackLiked: vi.fn(() => false), toggleTrackLike: vi.fn(),
    player: { replaceQueueWithTracks: vi.fn().mockResolvedValue(true) }
  };
}
async function render(context = createContext()) {
  const wrapper = mount(MusicPlatformRadioView, { global: { provide: { [MUSIC_LIBRARY_CONTEXT_KEY]: context } } });
  await flushPromises();
  return { wrapper, context };
}
beforeEach(() => {
  vi.clearAllMocks();
  api.getRecommendedPodcasts.mockResolvedValue([{ playlist_code: 'podcast_netease_90', name: '真实声音', track_count: 2 }]);
  api.getPersonalFmTracks.mockResolvedValue([{ track_id: '42', title: '私人 FM 歌曲', provider: 'netease' }]);
});

describe('ordinary mode NetEase sound resources', () => {
  it('loads real podcast cards and opens their program list', async () => {
    const { wrapper, context } = await render();
    expect(wrapper.text()).toContain('真实声音');
    expect(wrapper.text()).not.toContain('预留');
    await wrapper.get('.podcast-card').trigger('click');
    expect(context.openPlaylistDetail).toHaveBeenCalledWith('podcast_netease_90');
    wrapper.unmount();
  });

  it('searches sounds through the platform API', async () => {
    const { wrapper } = await render();
    await wrapper.get('input').setValue('夜间声音');
    await wrapper.get('form').trigger('submit');
    expect(api.getRecommendedPodcasts).toHaveBeenLastCalledWith({ q: '夜间声音' }, 'account-scoped-fetch');
    wrapper.unmount();
  });

  it('passes a real FM batch to the shared queue and routes its heart to the account action', async () => {
    const { wrapper, context } = await render();
    await wrapper.findAll('button').find((button) => button.text() === '听私人 FM').trigger('click');
    await flushPromises();
    await wrapper.get('.fm-track-play').trigger('click');
    expect(context.player.replaceQueueWithTracks).toHaveBeenCalledWith(
      [expect.objectContaining({ trackId: '42', provider: 'netease' })], 0, true, expect.objectContaining({ sourceType: 'personal-fm' })
    );
    await wrapper.get('button[aria-label="喜欢这首歌"]').trigger('click');
    expect(context.toggleTrackLike).toHaveBeenCalledWith(expect.objectContaining({ trackId: '42' }));
    wrapper.unmount();
  });

  it('requests binding without calling FM for an unbound account', async () => {
    const context = createContext();
    context.musicSourceAccounts.value = {};
    const { wrapper } = await render(context);
    await wrapper.findAll('button').find((button) => button.text() === '听私人 FM').trigger('click');
    expect(context.bindMusicSourceAccount).toHaveBeenCalledWith('netease');
    expect(api.getPersonalFmTracks).not.toHaveBeenCalled();
    wrapper.unmount();
  });

  it('shows a retryable upstream error while retaining existing cards', async () => {
    const { wrapper } = await render();
    api.getRecommendedPodcasts.mockRejectedValueOnce(new Error('网易云暂时无法连接'));
    await wrapper.findAll('button').find((button) => button.text() === '刷新').trigger('click');
    await flushPromises();
    expect(wrapper.get('[role="alert"]').text()).toBe('网易云暂时无法连接');
    expect(wrapper.text()).toContain('真实声音');
    wrapper.unmount();
  });

  it('does not display a previous account FM response after switching users', async () => {
    const { wrapper, context } = await render();
    let resolve;
    api.getPersonalFmTracks.mockImplementationOnce(() => new Promise((done) => { resolve = done; }));
    await wrapper.findAll('button').find((button) => button.text() === '听私人 FM').trigger('click');
    context.authState.value = { isAuthenticated: true, accountId: 'user-b' };
    resolve([{ track_id: '42', title: '上一账号的推荐' }]);
    await flushPromises();
    expect(wrapper.text()).not.toContain('上一账号的推荐');
    wrapper.unmount();
  });
});
