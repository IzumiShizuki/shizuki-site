import { flushPromises, mount, shallowMount } from '@vue/test-utils';
import { computed, reactive, ref } from 'vue';
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
    'importMusicSourcePlaylists', 'getMusicSourceLikes', 'setMusicSourceTrackLiked'
  ];
  return Object.fromEntries(names.map((name) => [name, (...args) => mocked.api[name]?.(...args)]));
});

import MusicLibraryPage from './MusicLibraryPage.vue';
import { MUSIC_LIBRARY_CONTEXT_KEY } from '../composables/musicLibraryContext';

function deferred() {
  let resolve;
  let reject;
  const promise = new Promise((resolvePromise, rejectPromise) => {
    resolve = resolvePromise;
    reject = rejectPromise;
  });
  return { promise, resolve, reject };
}

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
    getMusicSourceLikes: vi.fn().mockResolvedValue([]),
    setMusicSourceTrackLiked: vi.fn(async (_provider, _id, liked) => ({ liked })),
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

  async function completeColdFoliaMount(entryUrl) {
    window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
    for (let turn = 0; turn < 4; turn += 1) await flushPromises();
    document.querySelector('script[src="/music/runtime-config.js"]')?.dispatchEvent(new Event('load'));
    for (let turn = 0; turn < 4; turn += 1) await flushPromises();
    const mainScript = document.querySelector(`script[src="${entryUrl}"]`);
    expect(mainScript).toBeTruthy();
    document.getElementById('folia-embed-root').appendChild(document.createElement('div'));
    mainScript.dispatchEvent(new Event('load'));
    for (let turn = 0; turn < 8; turn += 1) await flushPromises();
  }

  it('refreshes a Folia acknowledged like without sending another account mutation', async () => {
    resetMocks({ boundRows: [{ provider: 'netease', bound: true }] });
    const track = { id: '42', provider: 'netease' };
    mocked.player.currentTrack.value = track;
    const wrapper = await mountPage();
    try {
      const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
      mocked.api.getMusicSourceLikes.mockClear();
      mocked.api.getMusicSourceLikes.mockResolvedValue(['42']);
      window.dispatchEvent(new MessageEvent('message', {
        data: { type: 'shizuki:status', track, liked: true, sessionVersion: 0 }
      }));
      window.dispatchEvent(new MessageEvent('message', {
        data: { type: 'shizuki:status', track, liked: true, sessionVersion: 0 }
      }));
      await flushPromises();
      expect(context.isTrackLiked(track)).toBe(true);
      expect(mocked.api.getMusicSourceLikes).toHaveBeenCalledOnce();
      expect(mocked.api.setMusicSourceTrackLiked).not.toHaveBeenCalled();
    } finally {
      wrapper.unmount();
    }
  });

  it('sends one explicit normal-mode unlike and publishes the acknowledged account state', async () => {
    resetMocks({ boundRows: [{ provider: 'netease', bound: true }] });
    mocked.api.getMusicSourceLikes.mockResolvedValue(['42']);
    const wrapper = await mountPage();
    const synced = vi.fn();
    window.addEventListener('shizuki:account-synced', synced);
    try {
      const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
      const track = { id: '42', provider: 'netease' };
      await context.toggleTrackLike(track);
      expect(mocked.api.setMusicSourceTrackLiked).toHaveBeenCalledOnce();
      expect(mocked.api.setMusicSourceTrackLiked).toHaveBeenCalledWith('netease', '42', false, expect.any(Function));
      expect(context.isTrackLiked(track)).toBe(false);
      expect(synced).toHaveBeenCalledOnce();
    } finally {
      window.removeEventListener('shizuki:account-synced', synced);
      wrapper.unmount();
    }
  });

  it('removes an acknowledged unlike from the liked view without a failing post-write playlist reload or changing playback', async () => {
    resetMocks({ boundRows: [{ provider: 'netease', bound: true }] });
    mocked.route.name = 'music-library-playlist';
    mocked.route.params = { playlistCode: 'account_netease_5' };
    mocked.api.getMyMusicLibrarySidebar.mockResolvedValue({ likedPlaylist: { playlistCode: 'account_netease_5', trackCount: 2 } });
    mocked.api.getMusicSourceLikes.mockResolvedValue(['42', '43']);
    mocked.api.getPlaylistBundleByCode.mockResolvedValue({
      profile: { playlistCode: 'account_netease_5', name: '我喜欢的音乐', trackCount: 2 },
      tracks: [{ trackId: '42', provider: 'netease' }, { trackId: '43', provider: 'netease' }]
    });
    const wrapper = await mountPage();
    try {
      const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
      mocked.api.getPlaylistBundleByCode.mockClear();
      mocked.api.getPlaylistBundleByCode.mockRejectedValue(new Error('Playlist not found'));
      mocked.player.currentTrack.value = context.currentPlaylistAllTracks.value[0];
      await context.toggleTrackLike(context.currentPlaylistAllTracks.value[0]);
      await flushPromises();
      expect(context.currentPlaylistError.value).toBe('');
      expect(context.currentPlaylistAllTracks.value.map((item) => item.trackId || item.id)).toEqual(['43']);
      expect(mocked.api.getPlaylistBundleByCode).not.toHaveBeenCalled();
      expect(mocked.player.currentTrack.value.trackId || mocked.player.currentTrack.value.id).toBe('42');
      expect(mocked.player.replaceQueueWithTracks).not.toHaveBeenCalled();
    } finally { wrapper.unmount(); }
  });

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

  it('sends the unchanged paused current entry and complete queue before cold-entry navigation', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockResolvedValue({
      ok: true,
      text: async () => '<script type="module" crossorigin src="/music/assets/Lattice-stable-session.js"></script>'
    });
    const current = {
      id: 'local:opaque-track',
      trackId: 'local:opaque-track',
      provider: 'navidrome',
      title: 'Stable paused track',
      durationMs: 201000,
      queueEntryId: 'queue-entry-current'
    };
    const queue = [
      { id: 'local:first', trackId: 'local:first', provider: 'navidrome', title: 'First', queueEntryId: 'queue-entry-first' },
      current,
      { id: 'local:last', trackId: 'local:last', provider: 'navidrome', title: 'Last', queueEntryId: 'queue-entry-last' }
    ];
    mocked.player.currentTrack.value = current;
    mocked.player.tracks.value = queue;
    mocked.player.queueDisplayTracks.value = queue;
    mocked.player.queueSourceContext.value = {
      kind: 'collection',
      collection: { source: 'navidrome', type: 'playlist', id: 'opaque:library-set', name: 'Stable source' }
    };
    mocked.player.currentTime.value = 23.5;
    mocked.player.duration.value = 0;
    mocked.player.expectedDuration.value = 201;
    mocked.player.isPlaying.value = false;
    const wrapper = await mountPage({ teleport: true });
    const postMessage = vi.spyOn(window, 'postMessage');
    try {
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      for (let turn = 0; turn < 4; turn += 1) await flushPromises();
      const runtimeScript = document.querySelector('script[src="/music/runtime-config.js"]');
      runtimeScript?.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 4; turn += 1) await flushPromises();
      const mainScript = document.querySelector('script[src="/music/assets/Lattice-stable-session.js"]');
      expect(mainScript).toBeTruthy();
      document.getElementById('folia-embed-root').appendChild(document.createElement('div'));
      mainScript.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 8; turn += 1) await flushPromises();

      const outbound = postMessage.mock.calls
        .map(([payload]) => payload)
        .filter((payload) => payload && typeof payload === 'object');
      const sessionMessageIndex = outbound.findIndex((payload) => payload.type === 'shizuki:follow-playback');
      const navigationMessageIndex = outbound.findIndex((payload) => payload.type === 'shizuki:navigate' && payload.active);
      expect(sessionMessageIndex).toBeGreaterThanOrEqual(0);
      expect(sessionMessageIndex).toBeLessThan(navigationMessageIndex);
      const firstSession = outbound[sessionMessageIndex].session;
      expect(firstSession).toMatchObject({
        track: { id: 'local:opaque-track', queueEntryId: 'queue-entry-current' },
        queue: [
          { queueEntryId: 'queue-entry-first' },
          { queueEntryId: 'queue-entry-current' },
          { queueEntryId: 'queue-entry-last' }
        ],
        sourceContext: {
          kind: 'collection',
          collection: { source: 'navidrome', id: 'opaque:library-set' }
        },
        positionMs: 23500,
        durationMs: 201000,
        playing: false
      });
      expect(wrapper.get('.folia-track-name').text()).toBe('Stable paused track');
      window.dispatchEvent(new MessageEvent('message', {
        data: {
          type: 'shizuki:status',
          track: { id: 'local:opaque-track', trackId: 'local:opaque-track', provider: 'navidrome', name: 'Late old status', artists: [] },
          sessionVersion: firstSession.version - 1
        }
      }));
      await flushPromises();
      expect(wrapper.get('.folia-track-name').text()).toBe('Stable paused track');

      const initialSessionCount = outbound.filter((payload) => payload.type === 'shizuki:follow-playback').length;
      mocked.player.currentTrack.value = queue[0];
      await flushPromises();
      const changedEntrySessions = postMessage.mock.calls
        .map(([payload]) => payload)
        .filter((payload) => payload?.type === 'shizuki:follow-playback');
      expect(changedEntrySessions).toHaveLength(initialSessionCount + 1);
      expect(changedEntrySessions.at(-1).session.track.queueEntryId).toBe('queue-entry-first');
      mocked.player.currentTrack.value = current;
      await flushPromises();

      await wrapper.get('.folia-library-btn').trigger('click');
      await flushPromises();
      expect(mocked.router.push).toHaveBeenCalledWith({ name: 'music-library-queue' });
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      await flushPromises();
      const reentryMessages = postMessage.mock.calls.map(([payload]) => payload);
      const reentrySessionIndex = reentryMessages.findLastIndex((payload) => payload?.type === 'shizuki:follow-playback');
      const reentryNavigationIndex = reentryMessages.findLastIndex((payload) => payload?.type === 'shizuki:navigate' && payload.active);
      const exitNavigationIndex = reentryMessages.findLastIndex((payload) => payload?.type === 'shizuki:navigate' && !payload.active);
      expect(reentrySessionIndex).toBeGreaterThan(exitNavigationIndex);
      expect(reentrySessionIndex).toBeLessThan(reentryNavigationIndex);
      expect(reentryMessages[reentrySessionIndex].session).toMatchObject({
        track: { queueEntryId: 'queue-entry-current' },
        queue: [{ queueEntryId: 'queue-entry-first' }, { queueEntryId: 'queue-entry-current' }, { queueEntryId: 'queue-entry-last' }],
        playing: false
      });
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

  it('keeps the current queue when entry is cancelled during bootstrap', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockResolvedValue({
      ok: true,
      text: async () => '<script type="module" crossorigin src="/music/assets/Lattice-cancelled-entry.js"></script>'
    });
    const queue = [
      { id: 'navidrome:a', trackId: 'navidrome:a', provider: 'navidrome', title: 'Current', queueEntryId: 'entry-a' },
      { id: 'navidrome:b', trackId: 'navidrome:b', provider: 'navidrome', title: 'Next', queueEntryId: 'entry-b' }
    ];
    mocked.player.currentTrack.value = queue[0];
    mocked.player.tracks.value = queue;
    mocked.player.queueDisplayTracks.value = queue;
    mocked.player.queueSourceContext.value = {
      kind: 'collection',
      collection: { source: 'navidrome', type: 'playlist', id: 'cancel-safe', name: 'Cancel safe' }
    };
    const wrapper = await mountPage({ teleport: true });
    const postMessage = vi.spyOn(window, 'postMessage');
    try {
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      for (let turn = 0; turn < 4; turn += 1) await flushPromises();
      document.querySelector('script[src="/music/runtime-config.js"]')?.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 4; turn += 1) await flushPromises();
      const mainScript = document.querySelector('script[src="/music/assets/Lattice-cancelled-entry.js"]');
      expect(mainScript).toBeTruthy();

      await wrapper.get('.folia-library-btn').trigger('click');
      await flushPromises();
      mainScript.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 8; turn += 1) await flushPromises();

      expect(mocked.player.tracks.value).toEqual(queue);
      expect(mocked.player.currentTrack.value.queueEntryId).toBe(queue[0].queueEntryId);
      expect(mocked.player.replaceQueueWithTracks).not.toHaveBeenCalled();
      expect(mocked.router.push).toHaveBeenCalledWith({ name: 'music-library-queue' });
      expect(postMessage).not.toHaveBeenCalledWith(expect.objectContaining({ type: 'shizuki:activate-playback-bridge' }), window.location.origin);
      expect(postMessage.mock.calls.map(([payload]) => payload).filter((payload) => payload?.type === 'shizuki:navigate' && payload.active)).toHaveLength(0);
    } finally {
      postMessage.mockRestore();
      wrapper.unmount();
      globalThis.fetch = originalFetch;
    }
  });

  it('returns an empty Folia startup to its original browse route', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockResolvedValue({
      ok: true,
      text: async () => '<script type="module" crossorigin src="/music/assets/Lattice-empty-startup.js"></script>'
    });
    mocked.route = {
      name: 'music-library-music',
      path: '/music-library/music',
      fullPath: '/music-library/music?section=recent',
      query: { section: 'recent' },
      params: {},
      meta: {}
    };
    mocked.player.currentTrack.value = null;
    mocked.player.tracks.value = [];
    mocked.player.queueDisplayTracks.value = [];
    mocked.player.queueSourceContext.value = null;
    mocked.player.playlistProfile.value = null;
    const wrapper = await mountPage({ teleport: true });
    try {
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      for (let turn = 0; turn < 4; turn += 1) await flushPromises();
      document.querySelector('script[src="/music/runtime-config.js"]')?.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 4; turn += 1) await flushPromises();
      const mainScript = document.querySelector('script[src="/music/assets/Lattice-empty-startup.js"]');
      expect(mainScript).toBeTruthy();
      document.getElementById('folia-embed-root').appendChild(document.createElement('div'));
      mainScript.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 8; turn += 1) await flushPromises();

      await wrapper.get('.folia-library-btn').trigger('click');
      await flushPromises();

      expect(mocked.router.push).not.toHaveBeenCalled();
      expect(mocked.router.push).not.toHaveBeenCalledWith({ name: 'music-library-queue' });
      expect(mocked.route.fullPath).toBe('/music-library/music?section=recent');
    } finally {
      wrapper.unmount();
      globalThis.fetch = originalFetch;
    }
  });

  it('returns an empty player-detail entry to its saved from route', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockResolvedValue({
      ok: true,
      text: async () => '<script type="module" crossorigin src="/music/assets/Lattice-empty-player.js"></script>'
    });
    const sourcePath = '/music-library/playlist/road?tab=tracks';
    mocked.route = {
      name: 'music-library-player',
      path: '/music-library/player',
      fullPath: `/music-library/player?from=${encodeURIComponent(sourcePath)}`,
      query: { from: encodeURIComponent(sourcePath) },
      params: {},
      meta: {}
    };
    mocked.ui.lastContentPath = ref('');
    mocked.player.currentTrack.value = null;
    mocked.player.tracks.value = [];
    mocked.player.queueDisplayTracks.value = [];
    mocked.player.queueSourceContext.value = null;
    const wrapper = await mountPage({ teleport: true });
    try {
      await completeColdFoliaMount('/music/assets/Lattice-empty-player.js');
      await wrapper.get('.folia-library-btn').trigger('click');
      await flushPromises();

      expect(mocked.router.push).toHaveBeenCalledWith(sourcePath);
      expect(mocked.router.push).not.toHaveBeenCalledWith({ name: 'music-library-queue' });
    } finally {
      wrapper.unmount();
      globalThis.fetch = originalFetch;
    }
  });

  it('uses the music home route when an empty queue has no saved browse path', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockResolvedValue({
      ok: true,
      text: async () => '<script type="module" crossorigin src="/music/assets/Lattice-empty-queue.js"></script>'
    });
    mocked.route = {
      name: 'music-library-queue',
      path: '/music-library/queue',
      fullPath: '/music-library/queue',
      query: {},
      params: {},
      meta: {}
    };
    mocked.ui.lastContentPath = ref('');
    mocked.player.currentTrack.value = null;
    mocked.player.tracks.value = [];
    mocked.player.queueDisplayTracks.value = [];
    mocked.player.queueSourceContext.value = null;
    const wrapper = await mountPage({ teleport: true });
    try {
      await completeColdFoliaMount('/music/assets/Lattice-empty-queue.js');
      await wrapper.get('.folia-library-btn').trigger('click');
      await flushPromises();

      expect(mocked.router.push).toHaveBeenCalledWith('/music-library/music');
      expect(mocked.router.push).not.toHaveBeenCalledWith({ name: 'music-library-queue' });
    } finally {
      wrapper.unmount();
      globalThis.fetch = originalFetch;
    }
  });

  it('does not alert when an older same-track playlist selection loses queue-entry ownership', async () => {
    const staleSelection = deferred();
    mocked.route = {
      name: 'music-library-playlist',
      path: '/music-library/playlist/duplicate-clicks',
      fullPath: '/music-library/playlist/duplicate-clicks',
      query: {},
      params: { playlistCode: 'duplicate-clicks' },
      meta: {}
    };
    mocked.api.getPlaylistBundleByCode.mockResolvedValue({
      profile: { playlistCode: 'duplicate-clicks', name: 'Duplicate clicks' },
      tracks: [{ id: 'shared-song', trackId: 'shared-song', provider: 'netease', title: 'Same song' }]
    });
    const wrapper = await mountPage();
    const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
    const replaceQueue = mocked.player.replaceQueueWithTracks;
    let selectionNumber = 0;
    replaceQueue.mockImplementation((tracks, startIndex) => {
      selectionNumber += 1;
      const queue = tracks.map((track, index) => ({ ...track, queueEntryId: `selection-${selectionNumber}-${index}` }));
      mocked.player.tracks.value = queue;
      mocked.player.currentTrack.value = queue[startIndex];
      return selectionNumber === 1 ? staleSelection.promise : Promise.resolve(true);
    });
    const alert = vi.spyOn(window, 'alert').mockImplementation(() => {});

    try {
      const first = context.playTrackInCurrentPlaylist(0);
      const second = context.playTrackInCurrentPlaylist(0);
      await second;
      staleSelection.resolve(false);
      await first;

      expect(mocked.player.currentTrack.value.queueEntryId).toBe('selection-2-0');
      expect(alert).not.toHaveBeenCalled();
    } finally {
      alert.mockRestore();
      wrapper.unmount();
    }
  });

  it('still reports a failed playback while that queue entry remains current', async () => {
    mocked.route = {
      name: 'music-library-playlist',
      path: '/music-library/playlist/current-failure',
      fullPath: '/music-library/playlist/current-failure',
      query: {},
      params: { playlistCode: 'current-failure' },
      meta: {}
    };
    mocked.api.getPlaylistBundleByCode.mockResolvedValue({
      profile: { playlistCode: 'current-failure', name: 'Current failure' },
      tracks: [{ id: 'failed-song', trackId: 'failed-song', provider: 'netease', title: 'Failed song' }]
    });
    const wrapper = await mountPage();
    const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
    mocked.player.replaceQueueWithTracks.mockImplementation((tracks, startIndex) => {
      const queue = tracks.map((track, index) => ({ ...track, queueEntryId: `failed-${index}` }));
      mocked.player.tracks.value = queue;
      mocked.player.currentTrack.value = queue[startIndex];
      return Promise.resolve(false);
    });
    const alert = vi.spyOn(window, 'alert').mockImplementation(() => {});

    try {
      await context.playTrackInCurrentPlaylist(0);

      expect(alert).toHaveBeenCalledOnce();
      expect(alert).toHaveBeenCalledWith('该歌曲当前无法播放，请稍后重试');
    } finally {
      alert.mockRestore();
      wrapper.unmount();
    }
  });

  it('does not report a canceled playback after the active account changes', async () => {
    const pendingSelection = deferred();
    mocked.route = {
      name: 'music-library-playlist',
      path: '/music-library/playlist/account-cancel',
      fullPath: '/music-library/playlist/account-cancel',
      query: {},
      params: { playlistCode: 'account-cancel' },
      meta: {}
    };
    mocked.api.getPlaylistBundleByCode.mockResolvedValue({
      profile: { playlistCode: 'account-cancel', name: 'Account cancel' },
      tracks: [{ id: 'account-song', trackId: 'account-song', provider: 'netease', title: 'Account song' }]
    });
    const wrapper = await mountPage();
    const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
    mocked.player.replaceQueueWithTracks.mockImplementation((tracks, startIndex) => {
      const queue = tracks.map((track, index) => ({ ...track, queueEntryId: `account-${index}` }));
      mocked.player.tracks.value = queue;
      mocked.player.currentTrack.value = queue[startIndex];
      return pendingSelection.promise;
    });
    const alert = vi.spyOn(window, 'alert').mockImplementation(() => {});

    try {
      const selection = context.playTrackInCurrentPlaylist(0);
      mocked.user.value = { userId: 'site-user-2' };
      pendingSelection.resolve(false);
      await selection;

      expect(mocked.player.currentTrack.value.queueEntryId).toBe('account-0');
      expect(alert).not.toHaveBeenCalled();
    } finally {
      alert.mockRestore();
      wrapper.unmount();
    }
  });

  it('stops polling for the embedded root when the page unmounts after the entry loads', async () => {
    const originalFetch = globalThis.fetch;
    globalThis.fetch = vi.fn().mockResolvedValue({
      ok: true,
      text: async () => '<script type="module" crossorigin src="/music/assets/Lattice-empty-root.js"></script>'
    });
    const wrapper = await mountPage({ teleport: true });
    const getElementById = vi.spyOn(document, 'getElementById');
    try {
      window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode'));
      for (let turn = 0; turn < 5; turn += 1) await flushPromises();
      const mainScript = document.querySelector('script[src="/music/assets/Lattice-empty-root.js"]');
      expect(mainScript).toBeTruthy();
      expect(document.getElementById('folia-embed-root').children).toHaveLength(0);

      mainScript.dispatchEvent(new Event('load'));
      for (let turn = 0; turn < 5; turn += 1) await flushPromises();
      const pollCountAfterLoad = () => getElementById.mock.calls.filter(([id]) => id === 'folia-embed-root').length;
      expect(pollCountAfterLoad()).toBeGreaterThan(0);

      wrapper.unmount();
      const pollCountAfterUnmount = pollCountAfterLoad();
      await new Promise((resolve) => setTimeout(resolve, 250));

      expect(pollCountAfterLoad()).toBe(pollCountAfterUnmount);
    } finally {
      // Let any regression poll observe a mounted root before restoring the test DOM.
      document.getElementById('folia-embed-root')?.appendChild(document.createElement('div'));
      getElementById.mockRestore();
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
    mocked.player.tracks.value = [{ id: 'native-queued-song', trackId: 'native-queued-song', provider: 'navidrome', queueEntryId: 'native-entry' }];
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

  it('ignores stale playlist loads across route changes and account changes', async () => {
    const routeState = reactive({ name: 'music-library-music', path: '/music-library/music', fullPath: '/music-library/music', query: {}, params: {}, meta: {} });
    mocked.route = routeState;
    const oldSuccess = deferred();
    const currentSuccess = deferred();
    const oldFailure = deferred();
    const newerSuccess = deferred();
    const accountOne = deferred();
    const accountTwo = deferred();
    mocked.api.getPlaylistBundleByCode.mockImplementation((code) => {
      if (code === 'old-route') return oldSuccess.promise;
      if (code === 'current-route') return currentSuccess.promise;
      if (code === 'old-failure') return oldFailure.promise;
      if (code === 'newer-route') return newerSuccess.promise;
      if (code === 'account-route') {
        return mocked.user.value.userId === 'account-two' ? accountTwo.promise : accountOne.promise;
      }
      return Promise.resolve({ profile: { playlistCode: code, name: code }, tracks: [] });
    });
    const wrapper = await mountPage();
    const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];
    const openPlaylistRoute = async (code) => {
      routeState.name = 'music-library-playlist';
      routeState.path = `/music-library/playlist/${code}`;
      routeState.fullPath = routeState.path;
      routeState.params = { playlistCode: code };
      await flushPromises();
    };
    const bundle = (code, id) => ({ profile: { playlistCode: code, name: code }, tracks: [{ id, trackId: id, title: id }] });

    try {
      await openPlaylistRoute('old-route');
      await openPlaylistRoute('current-route');
      currentSuccess.resolve(bundle('current-route', 'current-track'));
      await flushPromises();
      oldSuccess.resolve(bundle('old-route', 'stale-track'));
      await flushPromises();
      expect(context.currentPlaylistProfile.value.playlistCode).toBe('current-route');
      expect(context.currentPlaylistAllTracks.value.map((track) => track.id)).toEqual(['current-track']);

      await openPlaylistRoute('old-failure');
      await openPlaylistRoute('newer-route');
      newerSuccess.resolve(bundle('newer-route', 'newer-track'));
      await flushPromises();
      oldFailure.reject(new Error('stale route failed'));
      await flushPromises();
      expect(context.currentPlaylistProfile.value.playlistCode).toBe('newer-route');
      expect(context.currentPlaylistAllTracks.value.map((track) => track.id)).toEqual(['newer-track']);

      await openPlaylistRoute('account-route');
      mocked.user.value = { userId: 'account-two' };
      await flushPromises();
      accountOne.resolve(bundle('account-route', 'old-account-track'));
      await flushPromises();
      accountTwo.resolve(bundle('account-route', 'new-account-track'));
      await flushPromises();
      expect(context.currentPlaylistProfile.value.playlistCode).toBe('account-route');
      expect(context.currentPlaylistAllTracks.value.map((track) => track.id)).toEqual(['new-account-track']);
    } finally {
      wrapper.unmount();
    }
  });

  it('shows the authoritative matching queue during refresh and preserves it when refresh fails', async () => {
    const routeState = reactive({ name: 'music-library-playlist', path: '/music-library/playlist/source-list', fullPath: '/music-library/playlist/source-list', query: {}, params: { playlistCode: 'source-list' }, meta: {} });
    mocked.route = routeState;
    const refresh = deferred();
    const queue = [
      { id: 'source-a', trackId: 'source-a', provider: 'navidrome', title: 'A', queueEntryId: 'source-entry-a' },
      { id: 'source-b', trackId: 'source-b', provider: 'navidrome', title: 'B', queueEntryId: 'source-entry-b' }
    ];
    mocked.player.tracks.value = queue;
    mocked.player.currentTrack.value = queue[0];
    mocked.player.playlistProfile.value = { playlistCode: 'source-list', name: 'Source list', trackCount: 2238 };
    mocked.player.queueSourceContext.value = { kind: 'queue', sitePlaylistCode: 'source-list' };
    mocked.api.getPlaylistBundleByCode.mockReturnValue(refresh.promise);
    const wrapper = await mountPage();
    const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];

    try {
      expect(context.currentPlaylistAllTracks.value.map((track) => track.queueEntryId)).toEqual(['source-entry-a', 'source-entry-b']);
      expect(context.currentPlaylistProfile.value).toMatchObject({ playlistCode: 'source-list', name: 'Source list', trackCount: 2238 });

      const pendingRefresh = context.reloadCurrentPlaylist();
      await flushPromises();
      expect(context.currentPlaylistAllTracks.value.map((track) => track.queueEntryId)).toEqual(['source-entry-a', 'source-entry-b']);
      refresh.reject(new Error('refresh failed'));
      await pendingRefresh;

      expect(context.currentPlaylistAllTracks.value.map((track) => track.queueEntryId)).toEqual(['source-entry-a', 'source-entry-b']);
      expect(context.currentPlaylistProfile.value).toMatchObject({ playlistCode: 'source-list', name: 'Source list', trackCount: 2238 });
      expect(context.currentPlaylistError.value).toContain('refresh failed');
    } finally {
      wrapper.unmount();
    }
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

  it('preserves loaded source playlist metadata when returning to a matching queue', async () => {
    const playlistCode = 'src_netease_4883188894_u_1';
    mocked.route = reactive({
      name: 'music-library-playlist',
      path: `/music-library/playlist/${playlistCode}`,
      fullPath: `/music-library/playlist/${playlistCode}`,
      query: {},
      params: { playlistCode },
      meta: {}
    });
    mocked.api.getPlaylistBundleByCode.mockResolvedValue({
      profile: { playlistCode, name: 'IzumiShizuki喜欢的音乐', trackCount: 2238 },
      tracks: [{ id: 'source-song', trackId: 'source-song', provider: 'netease', title: 'リバーシブル!' }]
    });
    const wrapper = await mountPage();
    const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];

    try {
      expect(context.currentPlaylistProfile.value).toMatchObject({ name: 'IzumiShizuki喜欢的音乐', trackCount: 2238 });
      mocked.player.replaceQueueWithTracks.mockResolvedValue(true);
      await context.playTrackInCurrentPlaylist(0);
      expect(mocked.player.replaceQueueWithTracks).toHaveBeenCalledWith(
        expect.any(Array), 0, true,
        expect.objectContaining({
          playlistProfile: expect.objectContaining({ name: 'IzumiShizuki喜欢的音乐', trackCount: 2238 })
        })
      );
      const queue = [{ id: 'source-song', trackId: 'source-song', provider: 'netease', title: 'リバーシブル!', queueEntryId: 'source-song-entry' }];
      mocked.player.tracks.value = queue;
      mocked.player.currentTrack.value = queue[0];
      mocked.player.playlistProfile.value = { playlistCode, name: '默认收藏夹' };
      mocked.player.queueSourceContext.value = { kind: 'queue', sitePlaylistCode: playlistCode };

      Object.assign(mocked.route, {
        name: 'music-library-queue', path: '/music-library/queue', fullPath: '/music-library/queue', params: {}
      });
      await flushPromises();
      Object.assign(mocked.route, {
        name: 'music-library-playlist',
        path: `/music-library/playlist/${playlistCode}`,
        fullPath: `/music-library/playlist/${playlistCode}`,
        params: { playlistCode }
      });
      await flushPromises();

      expect(context.currentPlaylistProfile.value).toMatchObject({ playlistCode, name: 'IzumiShizuki喜欢的音乐', trackCount: 2238 });
      expect(context.currentPlaylistAllTracks.value.map((track) => track.queueEntryId)).toEqual(['source-song-entry']);
    } finally {
      wrapper.unmount();
    }
  });

  it('uses known playlist metadata when returning to a source whose engine profile is stale', async () => {
    const playlistCode = 'known-source-list';
    mocked.route = reactive({
      name: 'music-library-queue', path: '/music-library/queue', fullPath: '/music-library/queue', query: {}, params: {}, meta: {}
    });
    mocked.api.getMyMusicLibrarySidebar.mockResolvedValue({
      defaultPlaylist: null,
      likedPlaylist: { playlistCode, name: 'Known liked songs', trackCount: 823 }
    });
    const queue = [{ id: 'known-song', trackId: 'known-song', provider: 'netease', queueEntryId: 'known-entry' }];
    mocked.player.tracks.value = queue;
    mocked.player.currentTrack.value = queue[0];
    mocked.player.playlistProfile.value = { playlistCode, name: '默认收藏夹' };
    mocked.player.queueSourceContext.value = { kind: 'queue', sitePlaylistCode: playlistCode };
    const wrapper = await mountPage();
    const context = wrapper.vm.$.provides[MUSIC_LIBRARY_CONTEXT_KEY];

    try {
      Object.assign(mocked.route, {
        name: 'music-library-playlist',
        path: `/music-library/playlist/${playlistCode}`,
        fullPath: `/music-library/playlist/${playlistCode}`,
        params: { playlistCode }
      });
      await flushPromises();

      expect(context.currentPlaylistProfile.value).toMatchObject({ playlistCode, name: 'Known liked songs', trackCount: 823 });
      expect(context.currentPlaylistAllTracks.value.map((track) => track.queueEntryId)).toEqual(['known-entry']);
    } finally {
      wrapper.unmount();
    }
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
