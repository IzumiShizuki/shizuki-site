import { flushPromises, mount } from '@vue/test-utils';
import { nextTick, reactive, ref } from 'vue';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import MobileSearchPage from './MobileSearchPage.vue';

const h = vi.hoisted(() => ({
  route: null, replace: vi.fn(), push: vi.fn(), searchMusic: vi.fn(), shell: null
}));

vi.mock('vue-router', () => ({
  useRoute: () => h.route,
  useRouter: () => ({ replace: h.replace, push: h.push })
}));
vi.mock('../../services/musicApi', () => ({ searchMusic: h.searchMusic }));
vi.mock('../mobileShellContext', () => ({ useMobileShell: () => h.shell }));

function render() {
  return mount(MobileSearchPage, { global: { stubs: { MobileTrackRow: true, MobileSheet: true } } });
}
function deferred() {
  let resolve;
  return { promise: new Promise((finish) => { resolve = finish; }), resolve };
}
async function submit(wrapper, term) {
  await wrapper.get('input').setValue(term);
  await wrapper.get('form').trigger('submit');
  await flushPromises();
}

describe('mobile music search navigation', () => {
  beforeEach(() => {
    h.route = reactive({ query: {} });
    h.replace.mockReset();
    h.replace.mockImplementation(({ query }) => { h.route.query = query; });
    h.push.mockReset();
    h.searchMusic.mockReset();
    h.shell = {
      auth: { isAuthenticated: ref(false) },
      player: { currentTrack: ref(null), isPlaying: ref(false), replaceQueueWithTracks: vi.fn() },
      showToast: vi.fn()
    };
    window.localStorage.clear();
  });

  it('restores a submitted query and browses a playlist without touching playback', async () => {
    h.route.query.q = 'Beat';
    h.searchMusic.mockResolvedValue({ playlists: [{ playlistCode: 'known', name: 'Fixture' }] });
    const wrapper = render();
    await flushPromises();
    expect(wrapper.get('input').element.value).toBe('Beat');
    await wrapper.get('.playlist-row').trigger('click');
    expect(h.push).toHaveBeenCalledWith({ name: 'mobile-playlist', params: { playlistCode: 'known' } });
    expect(h.shell.player.replaceQueueWithTracks).not.toHaveBeenCalled();
    wrapper.unmount();
  });

  it('aborts a pending submission and ignores a stale completion', async () => {
    const old = deferred();
    h.searchMusic.mockReturnValueOnce(old.promise).mockResolvedValueOnce({ query: 'Newer', playlists: [{ playlistCode: 'new', name: 'New song list' }] });
    const wrapper = render();
    await submit(wrapper, 'Slow');
    const signal = h.searchMusic.mock.calls[0][1].signal;
    await submit(wrapper, 'Newer');
    expect(signal.aborted).toBe(true);
    old.resolve({ query: 'Slow', playlists: [{ playlistCode: 'old', name: 'Old song list' }] });
    await flushPromises();
    expect(wrapper.text()).not.toContain('Old song list');
    expect(wrapper.text()).toContain('New song list');
    wrapper.unmount();
  });

  it('retries the displayed error even after the draft changes, and clears to history', async () => {
    h.searchMusic.mockRejectedValueOnce(new Error('Temporary failure')).mockResolvedValue({});
    const wrapper = render();
    await submit(wrapper, 'Retry');
    expect(wrapper.get('[role=alert]').text()).toContain('Temporary failure');
    await wrapper.get('input').setValue('Different draft');
    await wrapper.get('[role=alert] button').trigger('click');
    await flushPromises();
    expect(h.searchMusic.mock.calls.map((call) => call[0])).toEqual(['Retry', 'Retry']);
    await wrapper.get('.clear-btn').trigger('click');
    await nextTick();
    expect(h.route.query.q).toBeUndefined();
    expect(wrapper.find('.search-idle').exists()).toBe(true);
    wrapper.unmount();
  });
});
