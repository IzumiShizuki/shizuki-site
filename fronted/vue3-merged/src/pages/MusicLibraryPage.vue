<template>
  <section class="route-page music-library-page" :class="{ 'player-detail-route': isPlayerDetailRoute }">
    <div class="music-library-module" :class="{ 'player-detail-only': isPlayerDetailRoute }">
      <template v-if="!isPlayerDetailRoute">
        <button
          v-if="isMobileViewport && (ui.leftDrawerOpen.value || ui.rightDrawerOpen.value)"
          class="drawer-mask"
          type="button"
          @click="ui.closeDrawers"
          aria-label="close drawer"
        ></button>

        <MusicLeftSidebar
          :nav-items="MUSIC_PRIMARY_NAV"
          :active-nav="ui.activeNav.value"
          :core-playlists="corePlaylists"
          :created-playlists="createdPlaylists"
          :collected-playlists="collectedPlaylists"
          :selected-playlist-code="selectedPlaylistCode"
          :can-create="auth.isAuthenticated.value"
          :is-mobile="isMobileViewport"
          :drawer-open="ui.leftDrawerOpen.value"
          @select-nav="handleSelectNav"
          @select-playlist="openPlaylistDetail"
          @create-playlist="handleCreatePlaylist"
          @close-drawer="ui.setLeftDrawerOpen(false)"
        />

        <main ref="centerPaneRef" class="music-center-pane" @scroll.passive="rememberCenterScroll">
          <header v-if="isMobileViewport" class="mobile-switch-bar">
            <button class="switch-btn ripple-trigger" type="button" @click="ui.setLeftDrawerOpen(true)">
              <i class="fas fa-bars"></i>
              菜单
            </button>
            <button class="switch-btn ripple-trigger" type="button" @click="ui.setRightDrawerOpen(true)">
              <i class="fas fa-sliders"></i>
              信息/音量
            </button>
          </header>

          <RouterView />
        </main>

        <MusicRightPanel
          :track="player.currentTrack.value"
          :lyric-line="player.currentLyricLine.value"
          :volume="player.volume.value"
          :eq-levels="ui.eqLevels.value"
          :is-mobile="isMobileViewport"
          :drawer-open="ui.rightDrawerOpen.value"
          :is-authenticated="auth.isAuthenticated.value"
          :tunehub-key-input="tunehubKeyInput"
          :tunehub-status="tunehubStatus"
          :tunehub-busy="tunehubBusy"
          :spotify-bound="spotifyBound"
          :spotify-busy="spotifyBusy"
          :spotify-query="spotifyQuery"
          :spotify-searching="spotifySearching"
          :spotify-results="spotifyResults"
          :spotify-error="spotifyError"
          @set-volume="handleSetVolume"
          @set-eq-level="handleSetEqLevel"
          @close-drawer="ui.setRightDrawerOpen(false)"
          @update:tunehub-key-input="tunehubKeyInput = $event"
          @save-tunehub-key="handleSaveTunehubKey"
          @delete-tunehub-key="handleDeleteTunehubKey"
          @refresh-tunehub-status="loadTunehubStatus"
          @bind-spotify="handleBindSpotify"
          @update:spotify-query="spotifyQuery = $event"
          @search-spotify="handleSearchSpotify"
          @preview-spotify="handlePreviewSpotify"
          @enqueue-spotify="handleEnqueueSpotify"
        />

        <MusicLibraryDock
          :track="player.currentTrack.value"
          :is-playing="player.isPlaying.value"
          :current-time="player.currentTime.value"
          :duration="player.duration.value"
          :play-mode="player.playMode.value"
          @toggle-play="player.togglePlay"
          @prev="player.playPrev"
          @next="player.playNext"
          @seek="player.seekToPercent"
          @cycle-mode="player.cyclePlayMode"
          @open-player-detail="enterPlayerDetail"
        />
      </template>

      <main v-else class="music-player-detail-pane">
        <RouterView />
      </main>
    </div>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, provide, ref, watch } from 'vue';
import { RouterView, useRoute, useRouter } from 'vue-router';
import MusicLibraryDock from '../components/music/MusicLibraryDock.vue';
import MusicLeftSidebar from '../components/music/MusicLeftSidebar.vue';
import MusicRightPanel from '../components/music/MusicRightPanel.vue';
import { MUSIC_LIBRARY_CONTEXT_KEY } from '../composables/musicLibraryContext';
import { useAuthSession } from '../composables/useAuthSession';
import { usePlayerBridge } from '../composables/playerBridge';
import { MUSIC_PRIMARY_NAV, useMusicLibraryUiState } from './musicLibraryUiState';
import * as musicApi from '../services/musicApi';

const DEFAULT_PLAYLIST_CODE = 'default_public';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();
const player = usePlayerBridge();
const ui = useMusicLibraryUiState();

const centerPaneRef = ref(null);
const isMobileViewport = ref(false);

const homeLoading = ref(false);
const homeError = ref('');
const homeData = ref({
  featuredPlaylists: [],
  featuredTracks: []
});

const sidebarData = ref({
  defaultPlaylist: null,
  likedPlaylist: null,
  createdPlaylists: [],
  collectedPlaylists: []
});

const tunehubKeyInput = ref('');
const tunehubStatus = ref({ keyBound: false, keyMask: '', updatedAt: '' });
const tunehubBusy = ref(false);

const spotifyBound = ref(false);
const spotifyBusy = ref(false);
const spotifyQuery = ref('');
const spotifySearching = ref(false);
const spotifyResults = ref([]);
const spotifyError = ref('');

const collectingPlaylist = ref(false);
const likedTrackIds = ref(new Set());

const isPlaylistRoute = computed(() => route.name === 'music-library-playlist');
const isPlayerDetailRoute = computed(() => route.name === 'music-library-player');
const currentPlaylistCodeFromRoute = computed(() => String(route.params.playlistCode || '').trim());

const currentPlaylistProfile = computed(() => {
  const raw = player.playlistProfile?.value || {};
  return {
    playlistCode: String(raw.playlistCode || raw.playlist_code || DEFAULT_PLAYLIST_CODE),
    name: String(raw.name || '默认歌单'),
    description: String(raw.description || ''),
    cover: String(raw.cover || '')
  };
});

const currentPlaylistTracks = computed(() => (Array.isArray(player.tracks.value) ? player.tracks.value : []));
const currentPlaylistLoading = computed(() => Boolean(player.playlistLoading?.value));
const currentPlaylistError = computed(() => String(player.playlistError?.value || ''));

const authState = computed(() => ({
  isAuthenticated: Boolean(auth.isAuthenticated.value)
}));

const selectedPlaylistCode = computed(() => {
  if (isPlaylistRoute.value && currentPlaylistCodeFromRoute.value) {
    return currentPlaylistCodeFromRoute.value;
  }
  return String(ui.selectedPlaylistCode.value || DEFAULT_PLAYLIST_CODE);
});

const corePlaylists = computed(() => {
  const list = [];
  const fallbackDefault = {
    playlistCode: DEFAULT_PLAYLIST_CODE,
    name: '默认歌单',
    description: '全站共通默认歌单',
    icon: 'fas fa-earth-asia'
  };
  const defaultPlaylist = normalizePlaylistSummary(sidebarData.value.defaultPlaylist || fallbackDefault, DEFAULT_PLAYLIST_CODE);
  list.push({ ...defaultPlaylist, icon: 'fas fa-earth-asia' });

  if (auth.isAuthenticated.value && sidebarData.value.likedPlaylist) {
    list.push({
      ...normalizePlaylistSummary(sidebarData.value.likedPlaylist),
      icon: 'fas fa-heart'
    });
  }
  return list;
});

const createdPlaylists = computed(() =>
  (Array.isArray(sidebarData.value.createdPlaylists) ? sidebarData.value.createdPlaylists : []).map((item) =>
    normalizePlaylistSummary(item)
  )
);

const collectedPlaylists = computed(() =>
  (Array.isArray(sidebarData.value.collectedPlaylists) ? sidebarData.value.collectedPlaylists : []).map((item) =>
    normalizePlaylistSummary(item)
  )
);

const collectedCodes = computed(() => {
  const set = new Set();
  collectedPlaylists.value.forEach((item) => {
    if (item.playlistCode) set.add(item.playlistCode);
  });
  return set;
});

const isCurrentPlaylistCollected = computed(() => {
  if (!auth.isAuthenticated.value) return false;
  return collectedCodes.value.has(currentPlaylistProfile.value.playlistCode);
});

const likedPlaylistCode = computed(() => {
  const code = sidebarData.value?.likedPlaylist?.playlistCode || sidebarData.value?.likedPlaylist?.playlist_code || '';
  return String(code || '').trim();
});

function parseErrorMessage(error, fallback = '操作失败，请稍后重试') {
  if (typeof error?.detail === 'string' && error.detail.trim()) return error.detail.trim();
  if (typeof error?.message === 'string' && error.message.trim()) return error.message.trim();
  return fallback;
}

function normalizePlaylistSummary(raw, fallbackCode = DEFAULT_PLAYLIST_CODE) {
  return {
    playlistCode: String(raw?.playlistCode || raw?.playlist_code || fallbackCode || DEFAULT_PLAYLIST_CODE).trim(),
    name: String(raw?.name || '未命名歌单').trim() || '未命名歌单',
    description: String(raw?.description || '').trim(),
    cover: String(raw?.cover || '').trim(),
    playlistType: String(raw?.playlistType || raw?.playlist_type || '').trim(),
    ownerUserId: Number(raw?.ownerUserId || raw?.owner_user_id || 0),
    isPublic: Boolean(raw?.isPublic ?? raw?.is_public),
    trackCount: Number(raw?.trackCount || raw?.track_count || 0)
  };
}

function normalizeApiTrack(raw, index = 0) {
  const id = String(raw?.trackId || raw?.track_id || raw?.id || `track-${index + 1}`);
  return {
    id,
    trackId: id,
    title: String(raw?.title || id),
    artist: String(raw?.artist || ''),
    cover: String(raw?.cover || raw?.coverUrl || raw?.cover_url || ''),
    audio: String(raw?.audio || raw?.audioUrl || raw?.audio_url || ''),
    lyric: String(raw?.lyric || raw?.lyricUrl || raw?.lyric_url || ''),
    provider: String(raw?.provider || raw?.providerCode || raw?.provider_code || 'local'),
    duration: String(raw?.duration || raw?.durationLabel || '--:--')
  };
}

function toPlaylistTrackUpsertPayload(track, fallbackSort = 0) {
  return {
    trackId: String(track?.trackId || track?.track_id || track?.id || '').trim(),
    provider: String(track?.provider || track?.providerCode || track?.provider_code || 'local').trim() || 'local',
    title: String(track?.title || '').trim(),
    artist: String(track?.artist || '').trim(),
    cover: String(track?.cover || track?.coverUrl || track?.cover_url || '').trim(),
    audio: String(track?.audio || track?.audioUrl || track?.audio_url || '').trim(),
    lyric: String(track?.lyric || track?.lyricUrl || track?.lyric_url || '').trim(),
    sort: Number.isFinite(Number(track?.sort)) ? Number(track.sort) : Number(fallbackSort || 0),
    enabled: track?.enabled !== false
  };
}

function normalizeApiKeyStatus(raw) {
  return {
    keyBound: Boolean(raw?.keyBound ?? raw?.key_bound),
    keyMask: String(raw?.keyMask || raw?.key_mask || ''),
    updatedAt: String(raw?.updatedAt || raw?.updated_at || '')
  };
}

function normalizeSpotifyResult(raw, index = 0) {
  return {
    id: String(raw?.trackId || raw?.track_id || raw?.id || `spotify-${index + 1}`),
    trackId: String(raw?.trackId || raw?.track_id || raw?.id || `spotify-${index + 1}`),
    title: String(raw?.title || raw?.name || ''),
    artist: String(raw?.artist || ''),
    previewUrl: String(raw?.previewUrl || raw?.preview_url || ''),
    provider: 'spotify'
  };
}

function goLogin() {
  auth.redirectToAuth('session_expired', route.fullPath || '/music-library');
}

function updateViewportMode() {
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') {
    isMobileViewport.value = false;
    return;
  }
  isMobileViewport.value = window.matchMedia('(max-width: 900px), (orientation: portrait)').matches;
}

function rememberCenterScroll() {
  if (isPlayerDetailRoute.value) return;
  if (!centerPaneRef.value) return;
  ui.rememberScroll(route.fullPath, centerPaneRef.value.scrollTop || 0);
}

function restoreCenterScroll(path) {
  if (isPlayerDetailRoute.value) return;
  if (!centerPaneRef.value) return;
  const top = ui.readScroll(path || route.fullPath);
  centerPaneRef.value.scrollTop = top;
}

function handleSelectNav(navKey) {
  ui.setActiveNav(navKey);
}

async function loadHomeData() {
  homeLoading.value = true;
  homeError.value = '';
  try {
    const payload = await musicApi.getMusicLibraryHome();
    const featuredPlaylists = Array.isArray(payload?.featuredPlaylists || payload?.featured_playlists)
      ? (payload.featuredPlaylists || payload.featured_playlists).map((item) => normalizePlaylistSummary(item, DEFAULT_PLAYLIST_CODE))
      : [];
    const featuredTracks = Array.isArray(payload?.featuredTracks || payload?.featured_tracks)
      ? (payload.featuredTracks || payload?.featured_tracks).map((item, index) => normalizeApiTrack(item, index))
      : [];
    homeData.value = { featuredPlaylists, featuredTracks };
  } catch (error) {
    homeData.value = { featuredPlaylists: [], featuredTracks: [] };
    homeError.value = parseErrorMessage(error, '音乐主列表加载失败');
  } finally {
    homeLoading.value = false;
  }
}

async function loadSidebarData() {
  if (!auth.isAuthenticated.value) {
    sidebarData.value = {
      defaultPlaylist: {
        playlistCode: DEFAULT_PLAYLIST_CODE,
        name: '默认歌单',
        description: '全站共通默认歌单'
      },
      likedPlaylist: null,
      createdPlaylists: [],
      collectedPlaylists: []
    };
    likedTrackIds.value = new Set();
    return;
  }

  try {
    const payload = await musicApi.getMyMusicLibrarySidebar(auth.authorizedFetch);
    sidebarData.value = {
      defaultPlaylist: normalizePlaylistSummary(payload?.defaultPlaylist || payload?.default_playlist, DEFAULT_PLAYLIST_CODE),
      likedPlaylist: payload?.likedPlaylist || payload?.liked_playlist ? normalizePlaylistSummary(payload?.likedPlaylist || payload?.liked_playlist) : null,
      createdPlaylists: Array.isArray(payload?.createdPlaylists || payload?.created_playlists)
        ? (payload.createdPlaylists || payload.created_playlists).map((item) => normalizePlaylistSummary(item))
        : [],
      collectedPlaylists: Array.isArray(payload?.collectedPlaylists || payload?.collected_playlists)
        ? (payload.collectedPlaylists || payload.collected_playlists).map((item) => normalizePlaylistSummary(item))
        : []
    };
    await loadLikedTrackIds();
  } catch {
    sidebarData.value = {
      defaultPlaylist: {
        playlistCode: DEFAULT_PLAYLIST_CODE,
        name: '默认歌单',
        description: '全站共通默认歌单'
      },
      likedPlaylist: null,
      createdPlaylists: [],
      collectedPlaylists: []
    };
    likedTrackIds.value = new Set();
  }
}

async function loadLikedTrackIds() {
  const likedCode = likedPlaylistCode.value;
  if (!auth.isAuthenticated.value || !likedCode) {
    likedTrackIds.value = new Set();
    return;
  }

  try {
    const payload = await musicApi.getPlaylistBundleByCode(likedCode, auth.authorizedFetch);
    const tracks = Array.isArray(payload?.tracks) ? payload.tracks : [];
    const next = new Set();
    tracks.forEach((item) => {
      const key = String(item?.trackId || item?.track_id || item?.id || '').trim();
      if (key) next.add(key);
    });
    likedTrackIds.value = next;
  } catch {
    likedTrackIds.value = new Set();
  }
}

async function loadTunehubStatus() {
  if (!auth.isAuthenticated.value) {
    tunehubStatus.value = { keyBound: false, keyMask: '', updatedAt: '' };
    return;
  }
  try {
    const payload = await musicApi.getMusicApiKeyStatus('tunehub', auth.authorizedFetch);
    tunehubStatus.value = normalizeApiKeyStatus(payload);
  } catch {
    tunehubStatus.value = { keyBound: false, keyMask: '', updatedAt: '' };
  }
}

async function handleSaveTunehubKey() {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  if (!String(tunehubKeyInput.value || '').trim()) {
    window.alert('请输入 TuneHub API Key');
    return;
  }
  tunehubBusy.value = true;
  try {
    const payload = await musicApi.upsertMusicApiKey('tunehub', tunehubKeyInput.value, auth.authorizedFetch);
    tunehubStatus.value = normalizeApiKeyStatus(payload);
    tunehubKeyInput.value = '';
  } catch (error) {
    window.alert(parseErrorMessage(error, 'TuneHub Key 保存失败'));
  } finally {
    tunehubBusy.value = false;
  }
}

async function handleDeleteTunehubKey() {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  tunehubBusy.value = true;
  try {
    await musicApi.deleteMusicApiKey('tunehub', auth.authorizedFetch);
    tunehubStatus.value = { keyBound: false, keyMask: '', updatedAt: '' };
  } catch (error) {
    window.alert(parseErrorMessage(error, 'TuneHub Key 删除失败'));
  } finally {
    tunehubBusy.value = false;
  }
}

async function loadSpotifyBindingStatus() {
  if (!auth.isAuthenticated.value) {
    spotifyBound.value = false;
    return;
  }
  try {
    const profile = await auth.getAccountProfile();
    const bindings = Array.isArray(profile?.oauthBindings || profile?.oauth_bindings)
      ? (profile.oauthBindings || profile.oauth_bindings)
      : [];
    spotifyBound.value = bindings.some((item) => String(item?.provider || '').trim().toLowerCase() === 'spotify');
  } catch {
    spotifyBound.value = false;
  }
}

async function handleBindSpotify() {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  spotifyBusy.value = true;
  try {
    await auth.startOAuthBind('spotify', '/music-library');
  } catch (error) {
    spotifyBusy.value = false;
    window.alert(parseErrorMessage(error, 'Spotify 连接失败'));
  }
}

async function handleSearchSpotify() {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  if (!spotifyBound.value) {
    window.alert('请先连接 Spotify 再执行搜索');
    return;
  }
  const keyword = String(spotifyQuery.value || '').trim();
  if (!keyword) {
    spotifyResults.value = [];
    return;
  }
  spotifySearching.value = true;
  spotifyError.value = '';
  try {
    const payload = await musicApi.searchSpotifyTracks(keyword, 12, auth.authorizedFetch);
    const list = Array.isArray(payload) ? payload : [];
    spotifyResults.value = list.map((item, index) => normalizeSpotifyResult(item, index));
  } catch (error) {
    spotifyResults.value = [];
    spotifyError.value = parseErrorMessage(error, 'Spotify 搜索失败');
  } finally {
    spotifySearching.value = false;
  }
}

async function resolveSpotifyPreviewUrl(item) {
  const embedded = String(item?.previewUrl || item?.preview_url || '').trim();
  if (embedded) return embedded;

  const trackId = String(item?.trackId || item?.track_id || item?.id || '').trim();
  if (!trackId) return '';

  try {
    const payload = await musicApi.getSpotifyPreview(trackId, auth.authorizedFetch);
    return String(payload?.previewUrl || payload?.preview_url || '').trim();
  } catch {
    return '';
  }
}

async function enqueueSpotifyTrack(item, autoPlay = false) {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  if (!spotifyBound.value) {
    window.alert('请先连接 Spotify 再播放或入队');
    return;
  }

  const trackId = String(item?.trackId || item?.track_id || item?.id || '').trim();
  if (!trackId) {
    window.alert('Spotify 曲目缺少 trackId');
    return;
  }

  const previewUrl = await resolveSpotifyPreviewUrl(item);
  if (!previewUrl) {
    window.alert('该 Spotify 曲目无可用 preview_url，无法入队播放');
    return;
  }

  const success = await player.enqueueExternalTrack?.(
    {
      trackId: `spotify:${trackId}`,
      provider: 'spotify',
      title: String(item?.title || 'Spotify Track'),
      artist: String(item?.artist || ''),
      cover: '',
      audio: previewUrl,
      lyric: '',
      enabled: true
    },
    autoPlay
  );

  if (!success) {
    window.alert('Spotify 曲目入队失败');
  }
}

async function handlePreviewSpotify(item) {
  await enqueueSpotifyTrack(item, true);
}

async function handleEnqueueSpotify(item) {
  await enqueueSpotifyTrack(item, false);
}

function playlistLoadOptions() {
  if (!auth.isAuthenticated.value) return {};
  return { authorizedFetch: auth.authorizedFetch };
}

async function ensureCurrentRoutePlaylistLoaded() {
  if (!isPlaylistRoute.value) return;
  const playlistCode = currentPlaylistCodeFromRoute.value || DEFAULT_PLAYLIST_CODE;
  ui.setSelectedPlaylistCode(playlistCode);
  if (currentPlaylistProfile.value.playlistCode === playlistCode && currentPlaylistTracks.value.length) {
    return;
  }
  await player.loadPlaylistByCode?.(playlistCode, playlistLoadOptions());
}

async function playFeaturedTrack(item, index) {
  if (currentPlaylistProfile.value.playlistCode !== DEFAULT_PLAYLIST_CODE) {
    await player.loadPlaylistByCode?.(DEFAULT_PLAYLIST_CODE, playlistLoadOptions());
  }

  const trackId = String(item?.trackId || item?.track_id || item?.id || '').trim();
  const sourceIndex = currentPlaylistTracks.value.findIndex((track) => track.id === trackId);
  if (sourceIndex >= 0) {
    await player.selectTrackByIndex(sourceIndex, true);
    return;
  }

  await player.playExternalTrack?.(normalizeApiTrack(item, Number(index) || 0));
}

async function playTrackInCurrentPlaylist(index) {
  await player.selectTrackByIndex(index, true);
}

function isTrackLiked(trackId) {
  return likedTrackIds.value.has(String(trackId || ''));
}

async function toggleTrackLike(trackInput) {
  const id = String(trackInput?.trackId || trackInput?.track_id || trackInput?.id || trackInput || '').trim();
  if (!id) return;

  const provider = String(trackInput?.provider || trackInput?.providerCode || trackInput?.provider_code || 'local').trim() || 'local';
  const next = new Set(likedTrackIds.value);
  if (next.has(id)) next.delete(id);
  else next.add(id);
  likedTrackIds.value = next;

  if (!auth.isAuthenticated.value || !likedPlaylistCode.value) {
    return;
  }

  try {
    if (next.has(id)) {
      await musicApi.upsertMyMusicPlaylistTrack(
        likedPlaylistCode.value,
        toPlaylistTrackUpsertPayload(trackInput, next.size),
        auth.authorizedFetch
      );
    } else {
      await musicApi.deleteMyMusicPlaylistTrack(
        likedPlaylistCode.value,
        provider,
        id,
        auth.authorizedFetch
      );
    }
    await loadSidebarData();
  } catch (error) {
    const rollback = new Set(likedTrackIds.value);
    if (rollback.has(id)) rollback.delete(id);
    else rollback.add(id);
    likedTrackIds.value = rollback;
    window.alert(parseErrorMessage(error, '更新红心歌单失败'));
  }
}

function openPlaylistDetail(playlistCode) {
  const code = String(playlistCode || '').trim();
  if (!code) return;
  ui.setSelectedPlaylistCode(code);
  ui.closeDrawers();
  router.push({
    name: 'music-library-playlist',
    params: { playlistCode: code }
  });
}

function backToMainList() {
  ui.closeDrawers();
  router.push({ name: 'music-library' });
}

function enterPlayerDetail() {
  ui.setLastContentPath(route.fullPath || '/music-library');
  ui.closeDrawers();
  router.push({
    name: 'music-library-player',
    query: {
      from: encodeURIComponent(route.fullPath || '/music-library')
    }
  });
}

function exitPlayerDetail() {
  const from = typeof route.query?.from === 'string' ? decodeURIComponent(route.query.from) : '';
  const target = from.startsWith('/music-library') ? from : ui.lastContentPath.value;
  router.push(target || '/music-library');
}

async function reloadCurrentPlaylist() {
  await player.loadPlaylistByCode?.(currentPlaylistProfile.value.playlistCode || DEFAULT_PLAYLIST_CODE, playlistLoadOptions());
}

async function handleCreatePlaylist() {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  const input = window.prompt('请输入新歌单名称', '我的歌单');
  if (input == null) return;
  const name = input.trim();
  if (!name) {
    window.alert('歌单名称不能为空');
    return;
  }
  try {
    const created = await musicApi.createMyMusicPlaylist({ name }, auth.authorizedFetch);
    await loadSidebarData();
    openPlaylistDetail(created?.playlistCode || created?.playlist_code);
  } catch (error) {
    window.alert(parseErrorMessage(error, '创建歌单失败'));
  }
}

async function toggleCollectCurrentPlaylist() {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  const playlistCode = currentPlaylistProfile.value.playlistCode;
  if (!playlistCode) return;

  collectingPlaylist.value = true;
  try {
    if (isCurrentPlaylistCollected.value) {
      await musicApi.uncollectPlaylist(playlistCode, auth.authorizedFetch);
    } else {
      await musicApi.collectPlaylist(playlistCode, auth.authorizedFetch);
    }
    await loadSidebarData();
  } catch (error) {
    window.alert(parseErrorMessage(error, '更新收藏状态失败'));
  } finally {
    collectingPlaylist.value = false;
  }
}

function handleSetVolume(nextVolume) {
  player.setVolume(nextVolume);
}

function handleSetEqLevel(payload) {
  ui.setEqLevel(payload?.index, payload?.value);
}

const musicContext = Object.freeze({
  player,
  ui,
  authState,
  homeData,
  homeLoading,
  homeError,
  currentPlaylistProfile,
  currentPlaylistTracks,
  currentPlaylistLoading,
  currentPlaylistError,
  collectingPlaylist,
  isCurrentPlaylistCollected,
  reloadHomeData: loadHomeData,
  reloadCurrentPlaylist,
  openPlaylistDetail,
  backToMainList,
  enterPlayerDetail,
  exitPlayerDetail,
  playFeaturedTrack,
  playTrackInCurrentPlaylist,
  toggleCollectCurrentPlaylist,
  toggleTrackLike,
  isTrackLiked
});

provide(MUSIC_LIBRARY_CONTEXT_KEY, musicContext);

watch(
  () => route.fullPath,
  async (nextPath) => {
    if (!isPlayerDetailRoute.value) {
      ui.setLastContentPath(nextPath);
      await nextTick();
      restoreCenterScroll(nextPath);
    }
  },
  { immediate: true }
);

watch(
  [() => route.name, currentPlaylistCodeFromRoute],
  async () => {
    await ensureCurrentRoutePlaylistLoaded();
  },
  { immediate: true }
);

watch(
  () => auth.isAuthenticated.value,
  async () => {
    await Promise.all([loadSidebarData(), loadTunehubStatus(), loadSpotifyBindingStatus()]);
    await ensureCurrentRoutePlaylistLoaded();
  }
);

onMounted(async () => {
  await auth.ensureReady();
  updateViewportMode();
  if (typeof window !== 'undefined') {
    window.addEventListener('resize', updateViewportMode, { passive: true });
  }

  await Promise.all([
    loadHomeData(),
    loadSidebarData(),
    loadTunehubStatus(),
    loadSpotifyBindingStatus(),
    ensureCurrentRoutePlaylistLoaded()
  ]);

  await nextTick();
  restoreCenterScroll(route.fullPath);
});

onBeforeUnmount(() => {
  if (typeof window !== 'undefined') {
    window.removeEventListener('resize', updateViewportMode);
  }
});
</script>
