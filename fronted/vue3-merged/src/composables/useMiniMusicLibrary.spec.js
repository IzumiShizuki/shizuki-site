import { ref } from 'vue';
import { describe, expect, it, vi } from 'vitest';
import {
  DEFAULT_MINI_MUSIC_PLAYLIST_CODE,
  createMiniMusicLibraryEngine
} from './useMiniMusicLibrary';

function createMusicApiStub() {
  return {
    getMusicLibraryHome: vi.fn(),
    getMyMusicLibrarySidebar: vi.fn(),
    getPlaylistBundleByCode: vi.fn()
  };
}

describe('createMiniMusicLibraryEngine', () => {
  it('loads public playlists without requiring route music context', async () => {
    const musicApi = createMusicApiStub();
    musicApi.getMusicLibraryHome.mockResolvedValue({
      featuredPlaylists: [
        { playlistCode: 'focus_mix', name: 'Focus Mix' },
        { playlistCode: 'night_drive', name: 'Night Drive' }
      ]
    });
    musicApi.getPlaylistBundleByCode.mockResolvedValue({
      profile: { playlistCode: DEFAULT_MINI_MUSIC_PLAYLIST_CODE, name: '默认歌单' },
      tracks: [{ trackId: 'a1', title: 'Track A', artist: 'Artist A', durationSec: 125 }]
    });

    const engine = createMiniMusicLibraryEngine({
      musicApi,
      isAuthenticated: ref(false)
    });

    await engine.ensureReady();

    expect(musicApi.getMyMusicLibrarySidebar).not.toHaveBeenCalled();
    expect(engine.sections.value.map((item) => item.key)).toEqual(['core', 'featured']);
    expect(engine.selectedPlaylist.value.playlistCode).toBe(DEFAULT_MINI_MUSIC_PLAYLIST_CODE);
    expect(engine.selectedTracks.value[0].durationLabel).toBe('02:05');
  });

  it('loads sidebar playlists for authenticated users and keeps them in a dedicated section', async () => {
    const musicApi = createMusicApiStub();
    musicApi.getMusicLibraryHome.mockResolvedValue({
      featuredPlaylists: [{ playlistCode: 'featured_alpha', name: 'Featured Alpha' }]
    });
    musicApi.getMyMusicLibrarySidebar.mockResolvedValue({
      defaultPlaylist: { playlistCode: DEFAULT_MINI_MUSIC_PLAYLIST_CODE, name: '默认歌单' },
      likedPlaylist: { playlistCode: 'liked', name: '红心歌单' },
      createdPlaylists: [{ playlistCode: 'created_1', name: '我的创建' }],
      collectedPlaylists: [{ playlistCode: 'collected_1', name: '我的收藏' }]
    });
    musicApi.getPlaylistBundleByCode.mockResolvedValue({
      profile: { playlistCode: DEFAULT_MINI_MUSIC_PLAYLIST_CODE, name: '默认歌单' },
      tracks: []
    });

    const engine = createMiniMusicLibraryEngine({
      musicApi,
      isAuthenticated: ref(true),
      getAuthorizedFetch: () => vi.fn()
    });

    await engine.ensureReady();

    expect(musicApi.getMyMusicLibrarySidebar).toHaveBeenCalledTimes(1);
    expect(engine.corePlaylists.value.map((item) => item.playlistCode)).toEqual([
      DEFAULT_MINI_MUSIC_PLAYLIST_CODE,
      'liked'
    ]);
    expect(engine.myPlaylists.value.map((item) => item.playlistCode)).toEqual(['created_1', 'collected_1']);
    expect(engine.sections.value.map((item) => item.key)).toEqual(['core', 'featured', 'mine']);
  });

  it('switches playlist and plays the selected track through the global player bridge', async () => {
    const musicApi = createMusicApiStub();
    musicApi.getMusicLibraryHome.mockResolvedValue({
      featuredPlaylists: [{ playlistCode: 'featured_alpha', name: 'Featured Alpha' }]
    });
    musicApi.getPlaylistBundleByCode
      .mockResolvedValueOnce({
        profile: { playlistCode: DEFAULT_MINI_MUSIC_PLAYLIST_CODE, name: '默认歌单' },
        tracks: [{ trackId: 'default_1', title: 'Default Track', artist: 'Default Artist' }]
      })
      .mockResolvedValueOnce({
        profile: { playlistCode: 'featured_alpha', name: 'Featured Alpha' },
        tracks: [
          { trackId: 'feature_1', title: 'Feature One', artist: 'Singer One' },
          { trackId: 'feature_2', title: 'Feature Two', artist: 'Singer Two' }
        ]
      });
    const replaceQueueWithTracks = vi.fn().mockResolvedValue(true);

    const engine = createMiniMusicLibraryEngine({
      musicApi,
      isAuthenticated: ref(false),
      player: { replaceQueueWithTracks }
    });

    await engine.ensureReady();
    await engine.selectPlaylist('featured_alpha');
    const result = await engine.playTrackAt(1);

    expect(result).toBe(true);
    expect(engine.selectedPlaylist.value.playlistCode).toBe('featured_alpha');
    expect(replaceQueueWithTracks).toHaveBeenCalledWith(
      engine.selectedTracks.value,
      1,
      true,
      expect.objectContaining({
        sourceCode: 'featured_alpha',
        sourceType: 'mini-music-library'
      })
    );
  });

  it('recovers to the public default playlist when auth state changes and private lists disappear', async () => {
    const musicApi = createMusicApiStub();
    const authenticated = ref(true);

    musicApi.getMusicLibraryHome.mockResolvedValue({
      featuredPlaylists: [{ playlistCode: 'featured_alpha', name: 'Featured Alpha' }]
    });
    musicApi.getMyMusicLibrarySidebar.mockResolvedValue({
      defaultPlaylist: { playlistCode: DEFAULT_MINI_MUSIC_PLAYLIST_CODE, name: '默认歌单' },
      createdPlaylists: [{ playlistCode: 'private_1', name: '私有歌单' }]
    });
    musicApi.getPlaylistBundleByCode
      .mockResolvedValueOnce({
        profile: { playlistCode: DEFAULT_MINI_MUSIC_PLAYLIST_CODE, name: '默认歌单' },
        tracks: []
      })
      .mockResolvedValueOnce({
        profile: { playlistCode: 'private_1', name: '私有歌单' },
        tracks: [{ trackId: 'private_track', title: 'Private Track', artist: 'Artist' }]
      })
      .mockResolvedValueOnce({
        profile: { playlistCode: DEFAULT_MINI_MUSIC_PLAYLIST_CODE, name: '默认歌单' },
        tracks: [{ trackId: 'fallback', title: 'Fallback Track', artist: 'Artist' }]
      });

    const engine = createMiniMusicLibraryEngine({
      musicApi,
      isAuthenticated: authenticated,
      getAuthorizedFetch: () => vi.fn()
    });

    await engine.ensureReady();
    await engine.selectPlaylist('private_1');
    authenticated.value = false;
    await engine.handleAuthChanged();

    expect(engine.selectedPlaylist.value.playlistCode).toBe(DEFAULT_MINI_MUSIC_PLAYLIST_CODE);
    expect(engine.sections.value.map((item) => item.key)).toEqual(['core', 'featured']);
    expect(engine.selectedTracks.value[0].trackId).toBe('fallback');
  });
});
