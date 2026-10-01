import { shallowMount } from '@vue/test-utils';
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
        queueSourceContext: ref({
          kind: 'collection',
          collection: { source: 'navidrome', type: 'playlist', id: 'opaque:P2', name: 'Native P2' }
        })
      },
      currentPlaylistProfile: ref({ playlistCode: '', name: 'Native P2', description: '当前共享播放队列', trackCount: 2 }),
      currentPlaylistAllTracks: ref(tracks),
      currentPlaylistTracks: ref(tracks),
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
});
