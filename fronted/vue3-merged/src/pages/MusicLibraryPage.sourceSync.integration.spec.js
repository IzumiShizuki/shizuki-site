import { flushPromises, mount, shallowMount } from '@vue/test-utils';
import { computed, ref } from 'vue';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';

const mocked = vi.hoisted(() => ({
  api: {},
  authenticated: true,
  router: {},
  route: {},
  user: { userId: 'site-user-1' },
  auth: {},
  player: {},
  ui: {}
}));

vi.mock('vue-router', () => ({
  RouterView: { template: '<div />' },
  useRoute: () => mocked.route,
  useRouter: () => mocked.router
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
import { MUSIC_LIBRARY_CONTEXT_KEY } from '../composables/musicLibraryContext';

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
  mocked.router = { push: vi.fn(), replace: vi.fn() };
  mocked.route = { name: 'music-library-music', path: '/music-library/music', fullPath: '/music-library/music', query: {}, params: {}, meta: {} };
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
    getPlaylistBundleByCode: vi.fn(async (code) => ({
      profile: { playlistCode: code, name: code },
      tracks: [{ id: `${code}-first` }, { id: `${code}-second` }]
    })),
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

  afterEach(async () => {
    document.querySelectorAll('script[src*="/music/"]').forEach((script) => {
      if (script.dataset.loaded !== '1') script.dispatchEvent(new Event('error'));
    });
    await flushPromises();
    vi.clearAllMocks();
  });

  async function mountPage({ teleport = false } = {}) {
    const mountFn = teleport ? mount : shallowMount;
    const wrapper = mountFn(MusicLibraryPage, {
      ...(teleport ? { attachTo: document.body } : {}),
      global: { stubs: { transition: false, MusicVisualizerLayer: true } }
    });
    for (let turn = 0; turn < 4; turn += 1) await flushPromises();
    return wrapper;
  }

  it('does not swallow Escape from the embedded Folia surface before its active view can handle it', async () => {
    const wrapper = await mountPage({ teleport: true });
    const forwardedEscape = vi.fn();
    window.addEventListener('keydown', forwardedEscape);
    try {
      const host = wrapper.get('.folia-embed-host').element;
      host.dispatchEvent(new KeyboardEvent('keydown', { key: 'Escape', bubbles: true }));
      expect(forwardedEscape).toHaveBeenCalledOnce();
    } finally {
      window.removeEventListener('keydown', forwardedEscape);
      wrapper.unmount();
    }
  });

  it('hands a native Folia collection to the host player as its complete ordered queue', async () => {
    const wrapper = await mountPage();
    window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
    await flushPromises();
    const tracks = [{ id: 'native-a', provider: 'navidrome' }, { id: 'native-b', provider: 'navidrome' }];

    window.dispatchEvent(new MessageEvent('message', {
      data: {
        type: 'shizuki:playback-intent',
        track: tracks[1],
        selection: {
          kind: 'collection',
          queuePolicy: 'replace',
          selectedIndex: 0,
          tracks,
          sourceContext: {
            kind: 'collection',
            collection: { source: 'navidrome', type: 'playlist', id: 'opaque-collection', name: 'Native Mix' }
          }
        }
      }
    }));
    await flushPromises();

    const [installedTracks, startIndex, autoPlay, source] = mocked.player.replaceQueueWithTracks.mock.calls[0];
    expect(installedTracks).toHaveLength(2);
    expect(installedTracks.map((item) => item.id)).toEqual(['native-a', 'native-b']);
    expect(installedTracks.map((item) => item.provider)).toEqual(['navidrome', 'navidrome']);
    expect([startIndex, autoPlay]).toEqual([0, true]);
    expect(source).toMatchObject({ sourceType: 'folia-native-collection', sourceContext: expect.any(Object) });
    expect(source).not.toHaveProperty('sourceCode');

    wrapper.unmount();
  });

  it('shows a loader error and retries against the current Folia entry', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockRejectedValue(new Error('temporary network failure'));
    const wrapper = await mountPage({ teleport: true });
    try {
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      for (let turn = 0; turn < 5; turn += 1) await flushPromises();
      let runtimeScript = document.querySelector('script[src="/music/runtime-config.js"]');
      expect(runtimeScript).toBeTruthy();
      runtimeScript.dispatchEvent(new Event('error'));
      for (let turn = 0; turn < 5; turn += 1) await flushPromises();

      expect(wrapper.get('.folia-entry-status').text()).toContain('failed to load /music/runtime-config.js');
      const retry = wrapper.get('.folia-entry-status button');
      expect(retry.text()).toBe('重试 Folia');
      await retry.trigger('click');
      for (let turn = 0; turn < 5; turn += 1) await flushPromises();
      runtimeScript = document.querySelector('script[src="/music/runtime-config.js"]');
      expect(runtimeScript).toBeTruthy();
      runtimeScript.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 5; turn += 1) await flushPromises();

      expect(globalThis.fetch).toHaveBeenCalledWith(expect.stringMatching(/^\/music\/\?__shizuki_embed=/), { cache: 'no-store' });
      expect(wrapper.get('.folia-entry-status').text()).toContain('temporary network failure');
    } finally {
      wrapper.unmount();
      globalThis.fetch = originalFetch;
    }
  });

  it('mounts Folia from its current hashed entry and delivers the canonical navigation on a cold load', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockResolvedValue({
      ok: true,
      text: async () => '<script type="module" crossorigin src="/music/assets/Lattice-cold-entry.js"></script>'
    });
    const wrapper = await mountPage({ teleport: true });
    const postMessage = vi.spyOn(window, 'postMessage');
    try {
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      for (let turn = 0; turn < 4; turn += 1) await flushPromises();
      const mainScript = document.querySelector('script[src="/music/assets/Lattice-cold-entry.js"]');
      expect(mainScript).toBeTruthy();
      document.getElementById('folia-embed-root').appendChild(document.createElement('div'));
      mainScript.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 8; turn += 1) await flushPromises();

      expect(postMessage).toHaveBeenCalledWith(expect.objectContaining({ type: 'shizuki:activate-playback-bridge' }), window.location.origin);
      expect(postMessage).toHaveBeenCalledWith(expect.objectContaining({
        type: 'shizuki:navigate',
        protocolVersion: 1,
        view: 'player',
        active: true
      }), window.location.origin);
      expect(wrapper.find('.folia-entry-status').exists()).toBe(false);
    } finally {
      postMessage.mockRestore();
      wrapper.unmount();
      globalThis.fetch = originalFetch;
    }
  });

  it('does not activate Folia when a cold entry finishes after the page unmounts', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockResolvedValue({
      ok: true,
      text: async () => '<script type="module" crossorigin src="/music/assets/Lattice-unmount-entry.js"></script>'
    });
    const wrapper = await mountPage({ teleport: true });
    const postMessage = vi.spyOn(window, 'postMessage');
    window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
    try {
      for (let turn = 0; turn < 5; turn += 1) await flushPromises();
      const mainScript = document.querySelector('script[src="/music/assets/Lattice-unmount-entry.js"]');
      expect(mainScript).toBeTruthy();

      wrapper.unmount();
      document.getElementById('folia-embed-root')?.appendChild(document.createElement('div'));
      mainScript.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 8; turn += 1) await flushPromises();

      expect(postMessage).not.toHaveBeenCalledWith(expect.objectContaining({ type: 'shizuki:activate-playback-bridge' }), window.location.origin);
      expect(postMessage).not.toHaveBeenCalledWith(expect.objectContaining({ type: 'shizuki:navigate', active: true }), window.location.origin);
    } finally {
      postMessage.mockRestore();
      if (wrapper.exists()) wrapper.unmount();
      globalThis.fetch = originalFetch;
    }
  });

  it('does not activate Folia when entry is cancelled before its queued activation runs', async () => {
    const wrapper = await mountPage({ teleport: true });
    const postMessage = vi.spyOn(window, 'postMessage');
    try {
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      await wrapper.get('.folia-library-btn').trigger('click');
      for (let turn = 0; turn < 5; turn += 1) await flushPromises();

      expect(postMessage).not.toHaveBeenCalledWith(expect.objectContaining({ type: 'shizuki:activate-playback-bridge' }), window.location.origin);
      expect(postMessage).toHaveBeenCalledWith(expect.objectContaining({
        type: 'shizuki:navigate',
        active: false
      }), window.location.origin);
      expect(window.localStorage.getItem('shizuki.music.foliaMode')).toBe('0');
    } finally {
      postMessage.mockRestore();
      wrapper.unmount();
    }
  });

  it('keeps the host playback dock and queue overlay out of Folia mode', async () => {
    const wrapper = await mountPage({ teleport: true });
    expect(wrapper.find('.folia-compact-dock').exists()).toBe(false);
    window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
    await flushPromises();
    expect(wrapper.find('.folia-compact-dock').exists()).toBe(false);
    expect(wrapper.find('.folia-embed-pane .dock-queue').exists()).toBe(false);
    expect(mocked.router.push).not.toHaveBeenCalled();
    expect(window.localStorage.getItem('shizuki.music.foliaMode')).toBe('1');
    wrapper.unmount();
  });

  it('applies a Folia lyric color from the input event before a change event', async () => {
    const wrapper = await mountPage({ teleport: true });
    window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
    await flushPromises();
    const postMessage = vi.spyOn(window, 'postMessage');
    const input = wrapper.get('[aria-label="Folia 主歌词颜色"]');
    input.element.value = '#e43b57';

    await input.trigger('input');

    expect(window.localStorage.getItem('shizuki.music.foliaLyricColor')).toBe('#e43b57');
    expect(postMessage).toHaveBeenCalledOnce();
    expect(postMessage).toHaveBeenCalledWith(expect.objectContaining({
      type: 'shizuki:set-lyric-color', color: '#e43b57'
    }), window.location.origin);
    await input.trigger('change');
    expect(postMessage).toHaveBeenCalledOnce();

    postMessage.mockRestore();
    wrapper.unmount();
  });

  it('returns a native Folia collection to the current queue route without fetching a site playlist', async () => {
    const wrapper = await mountPage({ teleport: true });
    mocked.player.queueSourceContext.value = {
      kind: 'collection',
      collection: { source: 'navidrome', type: 'playlist', id: 'opaque:P2', name: 'Native P2' }
    };

    await wrapper.get('.folia-library-btn').trigger('click');
    await flushPromises();

    expect(mocked.router.push).toHaveBeenCalledWith({ name: 'music-library-queue' });
    expect(mocked.api.getPlaylistBundleByCode).not.toHaveBeenCalled();
    wrapper.unmount();
  });

  it('provides the shared queue as a local detail source without loading a backend playlist', async () => {
    const queue = [
      { id: '42', trackId: '42', provider: 'netease', queueEntryId: 'queue-entry-a' },
      { id: '42', trackId: '42', provider: 'netease', queueEntryId: 'queue-entry-b' }
    ];
    mocked.route = {
      name: 'music-library-queue', path: '/music-library/queue', fullPath: '/music-library/queue', query: {}, params: {}, meta: {}
    };
    mocked.player.tracks.value = queue;
    mocked.player.queueDisplayTracks.value = queue;
    mocked.player.queueSourceContext.value = {
      kind: 'collection',
      collection: { source: 'navidrome', type: 'playlist', id: 'opaque:P2', name: 'Native P2' }
    };
    mocked.player.playlistProfile.value = { playlistCode: '', name: 'Native P2' };
    const wrapper = await mountPage();
    const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];

    expect(context.currentPlaylistProfile.value).toMatchObject({ playlistCode: '', name: 'Native P2' });
    expect(context.currentPlaylistAllTracks.value).toEqual(queue);
    expect(context.currentPlaylistLoading.value).toBe(false);
    expect(context.currentPlaylistError.value).toBe('');
    await context.playTrackInCurrentPlaylist(1);
    expect(mocked.player.selectTrackByIndex).toHaveBeenCalledWith(1, true);
    expect(mocked.player.replaceQueueWithTracks).not.toHaveBeenCalled();
    expect(mocked.api.getPlaylistBundleByCode).not.toHaveBeenCalled();
    wrapper.unmount();
  });

  it('expands the current queue through a late duplicate and continues paging forward', async () => {
    const tracks = Array.from({ length: 1000 }, (_, index) => ({
      id: index === 12 || index === 869 ? 'duplicate-42' : `track-${index}`,
      trackId: index === 12 || index === 869 ? '42' : `track-${index}`,
      provider: 'navidrome',
      queueEntryId: `queue-entry-${index}`,
      title: index === 869 ? 'Current late duplicate' : index === 12 ? 'Earlier duplicate' : `Track ${index}`
    }));
    mocked.route = {
      name: 'music-library-queue', path: '/music-library/queue', fullPath: '/music-library/queue', query: {}, params: {}, meta: {}
    };
    mocked.player.tracks.value = tracks;
    mocked.player.queueDisplayTracks.value = tracks;
    mocked.player.currentTrack.value = tracks[869];
    mocked.player.queueSourceContext.value = {
      kind: 'collection', collection: { source: 'navidrome', type: 'playlist', id: 'opaque:P2', name: 'Native P2' }
    };
    const wrapper = await mountPage({ teleport: true });
    try {
      const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
      expect(context.currentPlaylistTracks.value).toHaveLength(870);
      expect(context.currentPlaylistTracks.value[869].queueEntryId).toBe('queue-entry-869');
      expect(context.currentPlaylistHasMore.value).toBe(true);

      context.loadMoreCurrentPlaylistTracks();
      expect(context.currentPlaylistTracks.value.length).toBeGreaterThan(870);
    } finally {
      wrapper.unmount();
    }
  });

  it('returns a changed Folia song to the same real playlist and signals a fresh row reveal', async () => {
    const tracks = [
      { id: 'default_public-first', trackId: 'default_public-first', provider: 'netease', queueEntryId: 'p1-entry-a', title: 'P1 A' },
      { id: 'default_public-second', trackId: 'default_public-second', provider: 'netease', queueEntryId: 'p1-entry-b', title: 'P1 B' }
    ];
    mocked.route = {
      name: 'music-library-playlist', path: '/music-library/playlist/default_public', fullPath: '/music-library/playlist/default_public',
      query: {}, params: { playlistCode: 'default_public' }, meta: {}
    };
    mocked.player.tracks.value = tracks;
    mocked.player.currentTrack.value = tracks[0];
    mocked.player.playlistProfile.value = { playlistCode: 'default_public', name: '默认歌单' };
    mocked.player.queueSourceContext.value = { kind: 'queue', sitePlaylistCode: 'default_public' };
    mocked.player.selectTrackByIndex.mockImplementation(async (index) => {
      mocked.player.currentTrack.value = tracks[index];
      return true;
    });
    const wrapper = await mountPage({ teleport: true });
    try {
      const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
      const initialRevealVersion = context.currentTrackRevealVersion.value;
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      await flushPromises();

      window.dispatchEvent(new MessageEvent('message', {
        data: {
          type: 'shizuki:playback-intent',
          track: tracks[1],
          selection: {
            kind: 'track', queuePolicy: 'preserve-or-insert', selectedIndex: 1,
            embeddedSelectionView: 'lattice',
            sourceContext: { kind: 'queue', sitePlaylistCode: 'default_public' }
          }
        }
      }));
      await flushPromises();
      expect(mocked.player.currentTrack.value.queueEntryId).toBe('p1-entry-b');

      await wrapper.get('.folia-library-btn').trigger('click');
      await flushPromises();

      expect(mocked.router.push).toHaveBeenCalledWith({
        name: 'music-library-playlist', params: { playlistCode: 'default_public' }
      });
      expect(context.currentTrackRevealVersion.value).toBeGreaterThan(initialRevealVersion);
    } finally {
      wrapper.unmount();
    }
  });

  it('selects the exact duplicate queue entry from a Folia wall without replacing the shared queue', async () => {
    const wrapper = await mountPage();
    window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
    const queue = [
      { id: 'repeat-42', trackId: '42', provider: 'netease', queueEntryId: 'entry-a', title: 'A' },
      { id: 'repeat-42', trackId: '42', provider: 'netease', queueEntryId: 'entry-b', title: 'B' }
    ];
    mocked.player.tracks.value = queue;
    mocked.player.currentTrack.value = queue[0];
    mocked.player.selectTrackByIndex.mockImplementation(async (index) => {
      mocked.player.currentTrack.value = queue[index];
      return true;
    });

    window.dispatchEvent(new MessageEvent('message', {
      data: {
        type: 'shizuki:playback-intent',
        track: queue[1],
        selection: {
          kind: 'track',
          queuePolicy: 'preserve-or-insert',
          selectedIndex: 1,
          embeddedSelectionView: 'lattice',
          sourceContext: { kind: 'queue', sitePlaylistCode: 'default_public' }
        }
      }
    }));
    await flushPromises();

    expect(mocked.player.selectTrackByIndex).toHaveBeenCalledWith(1, true);
    expect(mocked.player.currentTrack.value.queueEntryId).toBe('entry-b');
    expect(mocked.player.replaceQueueWithTracks).not.toHaveBeenCalled();
    expect(mocked.player.playExternalTrack).not.toHaveBeenCalled();
    wrapper.unmount();
  });

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
          expect.objectContaining({ replaceQueue: false, queuePolicy: 'preserve-or-insert' })
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
