import { mount, shallowMount } from '@vue/test-utils';
import { beforeEach, describe, expect, it, vi } from 'vitest';
import { ref } from 'vue';

const mocks = vi.hoisted(() => ({ route: { name: 'music-library-queue' }, context: null }));

vi.mock('vue-router', () => ({ useRoute: () => mocks.route }));
vi.mock('../../composables/musicLibraryContext', () => ({ useMusicLibraryContext: () => mocks.context }));

import MusicPlaylistDetailView from './MusicPlaylistDetailView.vue';

describe('MusicPlaylistDetailView current queue route', () => {
  beforeEach(() => {
    mocks.route = { name: 'music-library-queue' };
    const tracks = [
      { id: '42', trackId: '42', provider: 'netease', queueEntryId: 'queue-entry-a', title: 'First copy' },
      { id: '42', trackId: '42', provider: 'netease', queueEntryId: 'queue-entry-b', title: 'Second copy' }
    ];
    mocks.context = {
      player: {
        currentTrack: ref(tracks[0]),
        currentTime: ref(0),
        queueSourceContext: ref({
          kind: 'collection',
          collection: { source: 'navidrome', type: 'playlist', id: 'opaque:P2', name: 'Native P2' }
        })
      },
      currentPlaylistProfile: ref({ playlistCode: '', name: 'Native P2', description: '当前共享播放队列', trackCount: 2 }),
      currentPlaylistAllTracks: ref(tracks),
      currentPlaylistTracks: ref(tracks),
      currentTrackRevealVersion: ref(0),
      currentPlaylistLoading: ref(false),
      currentPlaylistError: ref(''),
      currentPlaylistHasMore: ref(false),
      authState: ref({ isAuthenticated: false }),
      collectingPlaylist: ref(false),
      isCurrentPlaylistCollected: ref(false),
      isTrackLiked: vi.fn(() => false),
      backToMainList: vi.fn(),
      playTrackInCurrentPlaylist: vi.fn(),
      reloadCurrentPlaylist: vi.fn(),
      toggleCollectCurrentPlaylist: vi.fn(),
      loadMoreCurrentPlaylistTracks: vi.fn(),
      toggleTrackLike: vi.fn(),
      openCollectDialog: vi.fn(),
      requestMusicLogin: vi.fn()
    };
  });

  it('renders the shared opaque queue and selecting a duplicate row selects its exact queue index', async () => {
    const wrapper = shallowMount(MusicPlaylistDetailView, {
      global: { stubs: { TrackCollectButton: true } }
    });

    expect(wrapper.get('.hero-type').text()).toBe('当前播放队列');
    expect(wrapper.get('.hero-main h1').text()).toBe('Native P2');
    const rows = wrapper.findAll('.table-row');
    expect(rows).toHaveLength(2);
    expect(rows[0].classes()).toContain('active');
    expect(rows[1].classes()).not.toContain('active');

    await rows[1].trigger('click');
    expect(mocks.context.playTrackInCurrentPlaylist).toHaveBeenCalledWith(1);
  });

  it('carries native source context on Folia playlist re-entry', async () => {
    const wrapper = shallowMount(MusicPlaylistDetailView, {
      global: { stubs: { TrackCollectButton: true } }
    });
    const dispatch = vi.spyOn(window, 'dispatchEvent');

    await wrapper.get('.hero-actions button:nth-child(2)').trigger('click');

    expect(dispatch).toHaveBeenCalledWith(expect.objectContaining({
      type: 'shizuki:open-folia-lattice',
      detail: expect.objectContaining({
        sourceContext: expect.objectContaining({
          kind: 'collection',
          collection: expect.objectContaining({ id: 'opaque:P2' })
        })
      })
    }));
    dispatch.mockRestore();
  });

  it('mounts and reveals the exact current duplicate playlist entry beyond the initial 300 rows', async () => {
    mocks.route = { name: 'music-library-playlist' };
    const allTracks = Array.from({ length: 1000 }, (_, index) => ({
      id: index === 869 ? 'duplicate-42' : index === 12 ? 'duplicate-42' : `track-${index}`,
      trackId: index === 869 || index === 12 ? '42' : `track-${index}`,
      provider: 'navidrome',
      queueEntryId: `queue-entry-${index}`,
      title: index === 869 ? 'Current late duplicate' : index === 12 ? 'Earlier duplicate' : `Track ${index}`
    }));
    const currentTrack = allTracks[869];
    mocks.context.player.currentTrack.value = currentTrack;
    mocks.context.currentPlaylistAllTracks.value = allTracks;
    mocks.context.currentPlaylistTracks.value = allTracks.slice(0, 300);
    mocks.context.currentPlaylistProfile.value = {
      playlistCode: 'default_public', name: 'P1', description: '', trackCount: allTracks.length
    };
    const originalScrollIntoView = HTMLElement.prototype.scrollIntoView;
    HTMLElement.prototype.scrollIntoView = vi.fn();
    const wrapper = mount(MusicPlaylistDetailView, {
      attachTo: document.body,
      global: { stubs: { TrackCollectButton: true } }
    });
    try {
      await wrapper.vm.$nextTick();
      const currentRow = wrapper.findAll('.table-row').find((row) => row.text().includes('Current late duplicate'));
      expect(currentRow).toBeTruthy();
      expect(currentRow.classes()).toContain('active');
      expect(HTMLElement.prototype.scrollIntoView).toHaveBeenCalledWith(expect.objectContaining({ block: 'nearest' }));

      await currentRow.trigger('click');
      expect(mocks.context.playTrackInCurrentPlaylist).toHaveBeenCalledWith(869);
      mocks.context.player.currentTime.value = 147;
      await wrapper.vm.$nextTick();
      expect(HTMLElement.prototype.scrollIntoView).toHaveBeenCalledTimes(1);
      mocks.context.currentTrackRevealVersion.value += 1;
      await wrapper.vm.$nextTick();
      await wrapper.vm.$nextTick();
      expect(HTMLElement.prototype.scrollIntoView).toHaveBeenCalledTimes(2);
    } finally {
      wrapper.unmount();
      if (originalScrollIntoView) HTMLElement.prototype.scrollIntoView = originalScrollIntoView;
      else delete HTMLElement.prototype.scrollIntoView;
    }
  });
});
