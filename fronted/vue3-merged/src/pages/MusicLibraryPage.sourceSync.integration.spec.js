import { flushPromises, shallowMount } from '@vue/test-utils';
import { computed, ref } from 'vue';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';

const mocked = vi.hoisted(() => ({
  api: {},
  authenticated: true,
  user: { userId: 'site-user-1' },
  auth: {},
  player: {},
  ui: {}
}));

vi.mock('vue-router', () => ({
  RouterView: { template: '<div />' },
  useRoute: () => ({ path: '/music-library/music', fullPath: '/music-library/music', query: {}, params: {}, meta: {} }),
  useRouter: () => ({ push: vi.fn(), replace: vi.fn() })
}));
vi.mock('../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));
vi.mock('../composables/playerBridge', () => ({ usePlayerBridge: () => mocked.player }));
vi.mock('./musicLibraryUiState', () => ({
  MUSIC_PRIMARY_NAV: [],
  useMusicLibraryUiState: () => mocked.ui
}));
vi.mock('../services/musicApi', () => {
  const names = [
    'getMusicLibraryHome', 'listMusicProviders', 'getMyMusicLibrarySidebar', 'getPlaylistBundleByCode',
    'getMetingStatus', 'getMusicSourceAccountStatus', 'upsertMusicSourceAccountCookie',
    'importMusicSourcePlaylists'
  ];
  return Object.fromEntries(names.map((name) => [name, (...args) => mocked.api[name]?.(...args)]));
});

import MusicLibraryPage from './MusicLibraryPage.vue';

function makePlayer() {
  const refs = new Map();
  const actions = new Map();
  const functions = new Set([
    'replaceQueueWithTracks', 'selectTrackByIndex', 'playExternalTrack', 'seekToTime',
    'enqueueExternalTrack', 'togglePlay', 'playNext', 'playPrev', 'seekToPercent',
    'cyclePlayMode', 'setVolume', 'invalidatePlaybackPreparation'
  ]);
  return new Proxy({}, {
    get: (_target, key) => {
      if (functions.has(key)) {
        if (!actions.has(key)) actions.set(key, vi.fn().mockResolvedValue(true));
        return actions.get(key);
      }
      if (!refs.has(key)) refs.set(key, ref(key === 'tracks' || key === 'queueDisplayTracks' ? [] : null));
      return refs.get(key);
    }
  });
}

function resetMocks({ authenticated = true, userId = 'site-user-1', boundRows = [] } = {}) {
  mocked.user = ref(authenticated ? { userId } : null);
  mocked.auth = {
    isAuthenticated: computed(() => mocked.authenticated),
    user: computed(() => mocked.user.value),
    authorizedFetch: vi.fn(),
    ensureReady: vi.fn().mockResolvedValue(true),
    getPreference: vi.fn().mockResolvedValue({}),
    getAccountProfile: vi.fn().mockResolvedValue({}),
    startOAuthBind: vi.fn(),
    redirectToAuth: vi.fn()
  };
  mocked.authenticated = authenticated;
  mocked.player = makePlayer();
  mocked.ui = new Proxy({}, {
    get: (_target, key) => {
      if (key === 'readScroll') return vi.fn(() => 0);
      if (String(key).startsWith('set') || ['closeDrawers', 'rememberScroll', 'resetGlobalSearch'].includes(key)) return vi.fn();
      return ref(key === 'activeNav' ? 'home' : key === 'globalSearchProviders' ? [] : null);
    }
  });
  mocked.api = {
    getMusicLibraryHome: vi.fn().mockResolvedValue({}),
    listMusicProviders: vi.fn().mockResolvedValue([]),
    getMyMusicLibrarySidebar: vi.fn().mockResolvedValue({ defaultPlaylist: null }),
    getMetingStatus: vi.fn().mockResolvedValue({}),
    getMusicSourceAccountStatus: vi.fn().mockResolvedValue(boundRows),
    upsertMusicSourceAccountCookie: vi.fn().mockResolvedValue({}),
    importMusicSourcePlaylists: vi.fn().mockResolvedValue({ importedPlaylists: 1, importedTracks: 3 }),
    getSpotifyStatus: vi.fn().mockResolvedValue({})
  };
}

describe('MusicLibraryPage stored Folia account entry integration', () => {
  beforeEach(() => {
    window.localStorage.clear();
    window.localStorage.setItem('shizuki.music.foliaMode', '0');
    window.localStorage.setItem('online_provider:netease:cookie', 'session-cookie-a');
    resetMocks();
  });

  afterEach(() => {
    vi.clearAllMocks();
  });

  async function mountPage() {
    const wrapper = shallowMount(MusicLibraryPage, { global: { stubs: { transition: false } } });
    for (let turn = 0; turn < 4; turn += 1) await flushPromises();
    return wrapper;
  }

  it('persists Folia authorization, imports playlists, and refreshes the sidebar on normal entry', async () => {
    const wrapper = await mountPage();

    expect(mocked.api.upsertMusicSourceAccountCookie).toHaveBeenCalledWith(
      'netease', 'session-cookie-a', expect.any(Function)
    );
    expect(mocked.api.importMusicSourcePlaylists).toHaveBeenCalledWith('netease', expect.any(Function));
    await mocked.api.upsertMusicSourceAccountCookie.mock.calls[0][2]('/scoped-write', { method: 'PUT' });
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith(
      '/scoped-write', { method: 'PUT' }, { expectedUserId: 'site-user-1' }
    );
    expect(mocked.api.getMyMusicLibrarySidebar).toHaveBeenCalledTimes(2);
    expect(JSON.parse(window.localStorage.getItem('shizuki.music.foliaNeteaseCookieOwner')))
      .toMatchObject({ accountId: 'site-user-1' });
    wrapper.unmount();
  });

  it('imports for an existing bound backend account without a local cookie', async () => {
    window.localStorage.removeItem('online_provider:netease:cookie');
    resetMocks({ boundRows: [{ provider: 'netease', bound: true, updatedAt: 'revision-1' }] });
    const wrapper = await mountPage();

    expect(mocked.api.upsertMusicSourceAccountCookie).not.toHaveBeenCalled();
    expect(mocked.api.importMusicSourcePlaylists).toHaveBeenCalledOnce();
    wrapper.unmount();
  });

  it('retries a failed stored-cookie write through the visible sync action', async () => {
    mocked.api.upsertMusicSourceAccountCookie
      .mockRejectedValueOnce(new Error('temporary write failure'))
      .mockResolvedValueOnce({});
    const wrapper = await mountPage();
    expect(mocked.api.upsertMusicSourceAccountCookie).toHaveBeenCalledOnce();
    expect(mocked.api.importMusicSourcePlaylists).not.toHaveBeenCalled();

    wrapper.findComponent({ name: 'MusicRightPanel' }).vm.$emit('import-source-playlists', 'netease');
    for (let turn = 0; turn < 4; turn += 1) await flushPromises();

    expect(mocked.api.upsertMusicSourceAccountCookie).toHaveBeenCalledTimes(2);
    expect(mocked.api.importMusicSourcePlaylists).toHaveBeenCalledOnce();
    wrapper.unmount();
  });

  it('does not persist a stored Folia credential for a different site account owner', async () => {
    window.localStorage.setItem('shizuki.music.foliaNeteaseCookieOwner', JSON.stringify({
      accountId: 'site-user-old', cookieFingerprint: '18fbvwu'
    }));
    resetMocks({ userId: 'site-user-new' });
    const wrapper = await mountPage();

    expect(mocked.api.upsertMusicSourceAccountCookie).not.toHaveBeenCalled();
    expect(mocked.api.importMusicSourcePlaylists).not.toHaveBeenCalled();
    wrapper.unmount();
  });

  it('halts before import when the signed-in account changes during authorization persistence', async () => {
    let finishUpsert;
    mocked.api.upsertMusicSourceAccountCookie.mockImplementation(
      () => new Promise((resolve) => { finishUpsert = resolve; })
    );
    const wrapper = await mountPage();
    expect(mocked.api.upsertMusicSourceAccountCookie).toHaveBeenCalledOnce();

    mocked.user.value = { userId: 'site-user-2' };
    finishUpsert({});
    await flushPromises();
    await flushPromises();

    expect(mocked.api.importMusicSourcePlaylists).not.toHaveBeenCalled();
    wrapper.unmount();
  });

  it.each([
    {
      name: 'same provider with a different nonnumeric id',
      siteTrackA: { id: 'queue:A', trackId: 'legacy-A', provider: 'netease', title: 'A' },
      foliaTrackB: { id: 'legacy-B', trackId: 'legacy-B', provider: 'netease', name: 'B' },
      shouldSwitch: true
    },
    {
      name: 'different providers with the same numeric id',
      siteTrackA: { id: 'spotify:42', trackId: 42, provider: 'spotify', title: 'A' },
      foliaTrackB: { id: '42', trackId: 42, provider: 'netease', name: 'B' },
      shouldSwitch: true
    },
    {
      name: 'ordinary NetEase A to B selection',
      siteTrackA: { id: '101', trackId: '101', provider: 'netease', title: 'A' },
      foliaTrackB: { id: '202', trackId: '202', provider: 'netease', name: 'B' },
      shouldSwitch: true
    },
    {
      name: 'the same provider and track identity',
      siteTrackA: { id: 'netease:42', trackId: '42', provider: 'netease', title: 'A' },
      foliaTrackB: { id: '42', trackId: 42, provider: 'netease', name: 'A again' },
      shouldSwitch: false
    }
  ])('routes Folia selection by provider and track identity: $name', async ({ siteTrackA, foliaTrackB, shouldSwitch }) => {
    const wrapper = await mountPage();
    try {
      mocked.player.currentTrack.value = siteTrackA;
      mocked.player.isPlaying.value = true;
      mocked.player.playExternalTrack.mockImplementation(async (track) => {
        mocked.player.currentTrack.value = track;
        return true;
      });

      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      expect(window.localStorage.getItem('shizuki.music.foliaMode')).toBe('1');
      window.dispatchEvent(new MessageEvent('message', {
        data: { type: 'shizuki:playback-intent', track: foliaTrackB, positionMs: 0, playing: true }
      }));
      await flushPromises();
      await flushPromises();

      if (shouldSwitch) {
        expect(mocked.player.playExternalTrack).toHaveBeenCalledWith(
          expect.objectContaining({ provider: foliaTrackB.provider, title: foliaTrackB.name }),
          { replaceQueue: false }
        );
        expect(mocked.player.currentTrack.value).toMatchObject({
          id: String(foliaTrackB.id), trackId: String(foliaTrackB.trackId), provider: foliaTrackB.provider,
        });
      } else {
        expect(mocked.player.playExternalTrack).not.toHaveBeenCalled();
        expect(mocked.player.currentTrack.value).toMatchObject(siteTrackA);
      }
    } finally {
      wrapper.unmount();
    }
  });

  it('does not begin an import for a guest', async () => {
    resetMocks({ authenticated: false });
    const wrapper = await mountPage();

    expect(mocked.api.upsertMusicSourceAccountCookie).not.toHaveBeenCalled();
    expect(mocked.api.importMusicSourcePlaylists).not.toHaveBeenCalled();
    wrapper.unmount();
  });
});
