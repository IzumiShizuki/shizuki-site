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
          <MusicSearchToolbar
            class="music-toolbar-stick"
            :keyword="ui.globalSearchKeyword.value"
            :type="ui.globalSearchType.value"
            :loading="searchLoading"
            :error-text="searchError"
            :show-filters="showSearchToolbarFilters"
            :type-options="SEARCH_TYPE_OPTIONS"
            :provider-options="SEARCH_PROVIDER_OPTIONS"
            :selected-providers="ui.globalSearchProviders.value"
            @update:keyword="ui.setGlobalSearchKeyword($event)"
            @set-type="ui.setGlobalSearchType($event)"
            @toggle-provider="ui.toggleGlobalSearchProvider($event)"
            @search="triggerMusicSearch"
            @refresh="refreshMusicSearch"
          />

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

          <RouterView v-slot="{ Component, route: centerRoute }">
            <transition :name="centerTransitionName" mode="out-in">
              <component :is="Component" :key="resolveCenterViewKey(centerRoute)" class="music-center-view-shell" />
            </transition>
          </RouterView>
        </main>

        <MusicRightPanel
          :track="player.currentTrack.value"
          :lyric-line="player.currentLyricLine.value"
          :lyric-context="player.lyricContext.value"
          :volume="player.volume.value"
          :eq-levels="ui.eqLevels.value"
          :is-mobile="isMobileViewport"
          :drawer-open="ui.rightDrawerOpen.value"
          :is-authenticated="auth.isAuthenticated.value"
          :expanded-provider="ui.expandedProvider.value"
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
          @update:expanded-provider="ui.setExpandedProvider($event)"
          @update:tunehub-key-input="tunehubKeyInput = $event"
          @save-tunehub-key="handleSaveTunehubKey"
          @delete-tunehub-key="handleDeleteTunehubKey"
          @refresh-tunehub-status="loadTunehubStatus"
          @open-music-authorization="openMusicAuthorization"
          @bind-spotify="handleBindSpotify"
          @update:spotify-query="spotifyQuery = $event"
          @search-spotify="handleSearchSpotify"
          @preview-spotify="handlePreviewSpotify"
          @enqueue-spotify="handleEnqueueSpotify"
        />

        <MusicLibraryDock
          :track="player.currentTrack.value"
          :tracks="player.tracks.value"
          :current-track-id="player.currentTrack.value?.id || ''"
          :is-playing="player.isPlaying.value"
          :current-time="player.currentTime.value"
          :duration="player.duration.value"
          :play-mode="player.playMode.value"
          @toggle-play="player.togglePlay"
          @prev="player.playPrev"
          @next="player.playNext"
          @seek="player.seekToPercent"
          @cycle-mode="player.cyclePlayMode"
          @select-track="handleSelectTrackFromDock"
          @open-player-detail="enterPlayerDetail"
        />
      </template>

      <main v-else class="music-player-detail-pane">
        <RouterView />
      </main>
    </div>

    <MusicCreatePlaylistDialog
      :visible="createDialogVisible"
      :submitting="createDialogSubmitting"
      :error-text="createDialogError"
      @close="createDialogVisible = false"
      @confirm="submitCreatePlaylist"
    />
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, provide, ref, watch } from 'vue';
import { RouterView, useRoute, useRouter } from 'vue-router';
import MusicLibraryDock from '../components/music/MusicLibraryDock.vue';
import MusicCreatePlaylistDialog from '../components/music/MusicCreatePlaylistDialog.vue';
import MusicLeftSidebar from '../components/music/MusicLeftSidebar.vue';
import MusicRightPanel from '../components/music/MusicRightPanel.vue';
import MusicSearchToolbar from '../components/music/MusicSearchToolbar.vue';
import { MUSIC_LIBRARY_CONTEXT_KEY } from '../composables/musicLibraryContext';
import { useAuthSession } from '../composables/useAuthSession';
import { usePlayerBridge } from '../composables/playerBridge';
import { MUSIC_PRIMARY_NAV, useMusicLibraryUiState } from './musicLibraryUiState';
import * as musicApi from '../services/musicApi';
import { buildPlaylistTrackUpsertPayload } from '../utils/musicTrackPayload';

const DEFAULT_PLAYLIST_CODE = 'default_public';
const SEARCH_PAGE_SIZE = 24;
const PLAYLIST_BROWSE_INITIAL_VISIBLE = 60;
const PLAYLIST_BROWSE_STEP = 60;
const PLAYLIST_BROWSE_MAX = 200;
const SEARCH_ALL_INITIAL_VISIBLE = Object.freeze({
  playlists: 4,
  tracks: 10,
  artists: 10
});
const SEARCH_TYPE_OPTIONS = [
  { value: 'all', label: '全部' },
  { value: 'playlist', label: '歌单' },
  { value: 'track', label: '歌曲' },
  { value: 'artist', label: '歌手' }
];
const SEARCH_PROVIDER_OPTIONS = [
  { value: 'netease', label: '网易云' },
  { value: 'kuwo', label: '酷我' },
  { value: 'qq', label: 'QQ' },
  { value: 'spotify', label: 'Spotify' }
];
const DEFAULT_SEARCH_PROVIDERS = ['netease', 'kuwo', 'qq'];

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
const searchLoading = ref(false);
const searchLoadingMore = ref(false);
const searchLoadingMoreError = ref('');
const searchError = ref('');
const searchPage = ref(1);
const searchSectionPage = ref({
  playlists: 1,
  tracks: 1,
  artists: 1
});
const searchSectionLoading = ref({
  playlists: false,
  tracks: false,
  artists: false
});
const searchSectionError = ref({
  playlists: '',
  tracks: '',
  artists: ''
});
const searchHasMore = ref({
  playlists: false,
  tracks: false,
  artists: false
});
const searchAllVisibleCount = ref({
  playlists: SEARCH_ALL_INITIAL_VISIBLE.playlists,
  tracks: SEARCH_ALL_INITIAL_VISIBLE.tracks,
  artists: SEARCH_ALL_INITIAL_VISIBLE.artists
});
const searchAutoLoadLocked = ref(false);
const committedSearch = ref({
  keyword: '',
  type: 'all',
  providers: DEFAULT_SEARCH_PROVIDERS.slice()
});
const createDialogVisible = ref(false);
const createDialogSubmitting = ref(false);
const createDialogError = ref('');
const playlistBrowseVisibleCount = ref(PLAYLIST_BROWSE_INITIAL_VISIBLE);
const playlistBrowseAutoLoadLocked = ref(false);
const playlistBrowseLoading = ref(false);
const playlistBrowseError = ref('');
const playlistBrowseProfile = ref({
  playlistCode: DEFAULT_PLAYLIST_CODE,
  name: '默认歌单',
  description: '全站共通默认歌单',
  cover: ''
});
const playlistBrowseTracks = ref([]);
const searchResult = ref({
  query: '',
  type: 'all',
  partial: false,
  failedProviders: [],
  playlists: [],
  tracks: [],
  artists: []
});

const isPlaylistRoute = computed(() => route.name === 'music-library-playlist');
const isPlayerDetailRoute = computed(() => route.name === 'music-library-player');
const currentPlaylistCodeFromRoute = computed(() => String(route.params.playlistCode || '').trim());

const currentPlaylistProfile = computed(() => {
  const raw = playlistBrowseProfile.value || {};
  return {
    playlistCode: String(raw.playlistCode || raw.playlist_code || DEFAULT_PLAYLIST_CODE),
    name: String(raw.name || '默认歌单'),
    description: String(raw.description || ''),
    cover: String(raw.cover || '')
  };
});

const currentPlaylistAllTracks = computed(() => {
  const list = Array.isArray(playlistBrowseTracks.value) ? playlistBrowseTracks.value : [];
  return list.slice(0, PLAYLIST_BROWSE_MAX);
});

const currentPlaylistTracks = computed(() => {
  return currentPlaylistAllTracks.value.slice(0, Math.max(0, Number(playlistBrowseVisibleCount.value || 0)));
});
const currentPlaylistHasMore = computed(() => currentPlaylistTracks.value.length < currentPlaylistAllTracks.value.length);
const currentPlaylistLoading = computed(() => Boolean(playlistBrowseLoading.value));
const currentPlaylistError = computed(() => String(playlistBrowseError.value || ''));
const playerQueueTracks = computed(() => (Array.isArray(player.tracks.value) ? player.tracks.value : []));
const centerTransitionName = ref('music-center-fade');

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

const normalizedGlobalSearchKeyword = computed(() => String(ui.globalSearchKeyword.value || '').trim());

const hasActiveSearch = computed(() => String(committedSearch.value.keyword || '').trim().length >= 2);
const showSearchToolbarFilters = computed(() => {
  const nav = String(ui.activeNav.value || '').trim().toLowerCase();
  return !(nav === 'recommend' && !hasActiveSearch.value);
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
  const metadata = raw?.metadata && typeof raw.metadata === 'object' ? raw.metadata : {};
  const durationSec = Number.isFinite(Number(
    raw?.durationSec ?? raw?.duration_sec ?? metadata?.durationSec ?? metadata?.duration_sec
  ))
    ? Number(raw?.durationSec ?? raw?.duration_sec ?? metadata?.durationSec ?? metadata?.duration_sec)
    : null;
  const durationLabelRaw = String(
    raw?.durationLabel
    || raw?.duration_label
    || raw?.duration
    || metadata?.durationLabel
    || metadata?.duration_label
    || ''
  ).trim();
  const durationLabel = durationLabelRaw || (durationSec != null ? formatDurationBySec(durationSec) : '--:--');
  return {
    id,
    trackId: id,
    title: String(raw?.title || id),
    artist: String(raw?.artist || ''),
    cover: String(raw?.cover || raw?.coverUrl || raw?.cover_url || ''),
    audio: String(raw?.audio || raw?.audioUrl || raw?.audio_url || ''),
    lyric: String(raw?.lyric || raw?.lyricUrl || raw?.lyric_url || ''),
    lyricText: String(raw?.lyricText || raw?.lyric_text || metadata?.lyricText || metadata?.lyric_text || ''),
    provider: String(raw?.provider || raw?.providerCode || raw?.provider_code || 'local'),
    durationSec,
    durationLabel,
    duration: durationLabel,
    metadata
  };
}

function isPlaylistPath(path) {
  return String(path || '').startsWith('/music-library/playlist/');
}

function resolveCenterViewKey(viewRoute) {
  const routeName = String(viewRoute?.name || '');
  if (routeName === 'music-library-playlist') {
    const code = String(viewRoute?.params?.playlistCode || '').trim();
    return `playlist:${code}`;
  }
  return String(viewRoute?.fullPath || routeName || 'music-library');
}

function toPlaylistTrackUpsertPayload(track, fallbackSort = 0) {
  return buildPlaylistTrackUpsertPayload(track, {
    fallbackSort,
    playlistCode: currentPlaylistProfile.value?.playlistCode,
    activeNav: ui.activeNav.value,
    hasActiveSearch: hasActiveSearch.value,
    isPlaylistRoute: isPlaylistRoute.value
  });
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

function normalizeSearchPlaylist(raw) {
  return normalizePlaylistSummary(raw, DEFAULT_PLAYLIST_CODE);
}

function normalizeSearchTrack(raw, index = 0) {
  const trackId = String(raw?.trackId || raw?.track_id || raw?.id || `search-${index + 1}`).trim() || `search-${index + 1}`;
  return {
    id: trackId,
    trackId,
    provider: String(raw?.provider || 'local').trim() || 'local',
    title: String(raw?.title || '').trim() || '未知标题',
    artist: String(raw?.artist || '').trim() || '未知歌手',
    album: String(raw?.album || '').trim(),
    cover: String(raw?.cover || '').trim(),
    durationSec: Number.isFinite(Number(raw?.durationSec ?? raw?.duration_sec)) ? Number(raw.durationSec ?? raw.duration_sec) : null,
    durationLabel: Number.isFinite(Number(raw?.durationSec ?? raw?.duration_sec))
      ? formatDurationBySec(Number(raw.durationSec ?? raw.duration_sec))
      : '--:--',
    audio: '',
    lyric: ''
  };
}

function normalizeSearchArtist(raw) {
  return {
    name: String(raw?.name || '').trim() || '未知歌手',
    hitCount: Number.isFinite(Number(raw?.hitCount ?? raw?.hit_count)) ? Number(raw.hitCount ?? raw.hit_count) : 0,
    providers: Array.isArray(raw?.providers) ? raw.providers.map((item) => String(item || '').trim()).filter(Boolean) : []
  };
}

function formatDurationBySec(seconds) {
  const safe = Math.max(0, Number(seconds || 0));
  const minute = Math.floor(safe / 60);
  const second = Math.floor(safe % 60);
  return `${String(minute).padStart(2, '0')}:${String(second).padStart(2, '0')}`;
}

function createEmptySearchResult(type = 'all', query = '') {
  return {
    query,
    type,
    partial: false,
    failedProviders: [],
    playlists: [],
    tracks: [],
    artists: []
  };
}

function parseSearchHasMore(payload = {}) {
  return {
    playlists: Boolean(payload?.hasMorePlaylists ?? payload?.has_more_playlists),
    tracks: Boolean(payload?.hasMoreTracks ?? payload?.has_more_tracks),
    artists: Boolean(payload?.hasMoreArtists ?? payload?.has_more_artists)
  };
}

function normalizeSearchSection(type) {
  const normalized = String(type || '').trim().toLowerCase();
  if (normalized === 'playlist' || normalized === 'playlists') return 'playlists';
  if (normalized === 'artist' || normalized === 'artists') return 'artists';
  return 'tracks';
}

function resolveSearchTypeBySection(section) {
  if (section === 'playlists') return 'playlist';
  if (section === 'artists') return 'artist';
  return 'track';
}

function mergeUniqueBy(items, incoming, keySelector) {
  const source = Array.isArray(items) ? items.slice() : [];
  const seen = new Set(source.map((item) => keySelector(item)).filter(Boolean));
  (Array.isArray(incoming) ? incoming : []).forEach((item) => {
    const key = keySelector(item);
    if (!key || seen.has(key)) return;
    seen.add(key);
    source.push(item);
  });
  return source;
}

function getCurrentSearchHasMore(type = committedSearch.value.type) {
  const normalizedType = String(type || 'all').trim().toLowerCase();
  if (normalizedType === 'playlist') return Boolean(searchHasMore.value.playlists);
  if (normalizedType === 'artist') return Boolean(searchHasMore.value.artists);
  return Boolean(searchHasMore.value.tracks);
}

function getSearchLoadedCountByType(type = committedSearch.value.type) {
  const normalizedType = String(type || 'all').trim().toLowerCase();
  if (normalizedType === 'playlist') {
    return Array.isArray(searchResult.value?.playlists) ? searchResult.value.playlists.length : 0;
  }
  if (normalizedType === 'artist') {
    return Array.isArray(searchResult.value?.artists) ? searchResult.value.artists.length : 0;
  }
  return Array.isArray(searchResult.value?.tracks) ? searchResult.value.tracks.length : 0;
}

function resetSearchAllVisibleCount() {
  searchAllVisibleCount.value = {
    playlists: SEARCH_ALL_INITIAL_VISIBLE.playlists,
    tracks: SEARCH_ALL_INITIAL_VISIBLE.tracks,
    artists: SEARCH_ALL_INITIAL_VISIBLE.artists
  };
}

function resetPlaylistBrowseVisibleCount() {
  playlistBrowseVisibleCount.value = PLAYLIST_BROWSE_INITIAL_VISIBLE;
}

function growPlaylistBrowseVisibleCount() {
  const loaded = currentPlaylistAllTracks.value.length;
  const current = Math.max(0, Number(playlistBrowseVisibleCount.value || 0));
  if (loaded <= current) return false;
  const next = Math.min(loaded, current + PLAYLIST_BROWSE_STEP);
  if (next <= current) return false;
  playlistBrowseVisibleCount.value = next;
  return true;
}

function growSearchAllVisibleCount(section) {
  const key = normalizeSearchSection(section);
  if (!['playlists', 'tracks', 'artists'].includes(key)) return false;
  const loaded = Array.isArray(searchResult.value?.[key]) ? searchResult.value[key].length : 0;
  const current = Math.max(0, Number(searchAllVisibleCount.value[key] || 0));
  if (loaded <= current) return false;
  const step = Number(SEARCH_ALL_INITIAL_VISIBLE[key] || 0);
  const next = Math.min(loaded, current + Math.max(1, step));
  if (next <= current) return false;
  searchAllVisibleCount.value = {
    ...searchAllVisibleCount.value,
    [key]: next
  };
  return true;
}

function clearSearchState(options = {}) {
  const resetDraft = options?.resetDraft !== false;
  if (resetDraft) {
    ui.resetGlobalSearch();
  }
  searchPage.value = 1;
  searchSectionPage.value = { playlists: 1, tracks: 1, artists: 1 };
  searchSectionLoading.value = { playlists: false, tracks: false, artists: false };
  searchSectionError.value = { playlists: '', tracks: '', artists: '' };
  searchHasMore.value = { playlists: false, tracks: false, artists: false };
  searchLoadingMore.value = false;
  searchLoadingMoreError.value = '';
  searchAutoLoadLocked.value = false;
  resetSearchAllVisibleCount();
  committedSearch.value = {
    keyword: '',
    type: 'all',
    providers: DEFAULT_SEARCH_PROVIDERS.slice()
  };
  searchError.value = '';
  searchLoading.value = false;
  searchResult.value = createEmptySearchResult('all', '');
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
  maybeAutoLoadCurrentPlaylist();
  maybeAutoLoadNextSearchPage();
}

function restoreCenterScroll(path) {
  if (isPlayerDetailRoute.value) return;
  if (!centerPaneRef.value) return;
  const top = ui.readScroll(path || route.fullPath);
  centerPaneRef.value.scrollTop = top;
}

function handleSelectNav(navKey) {
  const key = String(navKey || '').trim();
  if (!key) return;

  clearSearchState();
  ui.setActiveNav(key);
  ui.closeDrawers();
  if (isPlaylistRoute.value) {
    router.push({ name: 'music-library' });
  }
}

function openMusicAuthorization() {
  ui.closeDrawers();
  router.push({ path: '/profile', query: { tab: 'account' } });
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

function normalizeSearchProviderList(input) {
  if (!Array.isArray(input)) return DEFAULT_SEARCH_PROVIDERS.slice();
  const providers = [...new Set(input.map((item) => String(item || '').trim().toLowerCase()).filter(Boolean))];
  return providers.length ? providers : DEFAULT_SEARCH_PROVIDERS.slice();
}

function commitSearchFromDraft() {
  const keyword = normalizedGlobalSearchKeyword.value;
  const type = String(ui.globalSearchType.value || 'all').trim().toLowerCase() || 'all';
  const providers = normalizeSearchProviderList(ui.globalSearchProviders.value);
  if (keyword.length < 2) {
    clearSearchState({ resetDraft: false });
    return false;
  }
  committedSearch.value = {
    keyword,
    type,
    providers
  };
  return true;
}

async function runMusicSearch(criteria = committedSearch.value, options = {}) {
  const append = Boolean(options?.append);
  const targetPage = Number.isFinite(Number(options?.page))
    ? Math.max(1, Number(options.page))
    : append
      ? searchPage.value + 1
      : 1;
  const keyword = String(criteria?.keyword || '').trim();
  const type = String(criteria?.type || 'all').trim().toLowerCase() || 'all';
  const providers = normalizeSearchProviderList(criteria?.providers);
  if (keyword.length < 2) {
    searchError.value = '';
    searchLoading.value = false;
    searchLoadingMore.value = false;
    searchLoadingMoreError.value = '';
    searchHasMore.value = { playlists: false, tracks: false, artists: false };
    searchPage.value = 1;
    searchSectionPage.value = { playlists: 1, tracks: 1, artists: 1 };
    searchSectionError.value = { playlists: '', tracks: '', artists: '' };
    searchSectionLoading.value = { playlists: false, tracks: false, artists: false };
    resetSearchAllVisibleCount();
    searchResult.value = createEmptySearchResult(type, '');
    return;
  }

  if (append) {
    searchLoadingMore.value = true;
    searchLoadingMoreError.value = '';
  } else {
    searchLoading.value = true;
    searchPage.value = 1;
    searchSectionPage.value = { playlists: 1, tracks: 1, artists: 1 };
    searchSectionError.value = { playlists: '', tracks: '', artists: '' };
    searchSectionLoading.value = { playlists: false, tracks: false, artists: false };
    searchHasMore.value = { playlists: false, tracks: false, artists: false };
    resetSearchAllVisibleCount();
    searchLoadingMoreError.value = '';
  }
  searchError.value = '';
  try {
    const payload = await musicApi.searchMusic(keyword, {
      type,
      providers,
      page: targetPage,
      limit: SEARCH_PAGE_SIZE
    });
    const normalized = {
      query: String(payload?.query || keyword),
      type: String(payload?.type || type || 'all'),
      partial: Boolean(payload?.partial),
      failedProviders: Array.isArray(payload?.failedProviders || payload?.failed_providers)
        ? (payload.failedProviders || payload.failed_providers).map((item) => String(item || '').trim()).filter(Boolean)
        : [],
      playlists: Array.isArray(payload?.playlists) ? payload.playlists.map((item) => normalizeSearchPlaylist(item)) : [],
      tracks: Array.isArray(payload?.tracks) ? payload.tracks.map((item, index) => normalizeSearchTrack(item, index)) : [],
      artists: Array.isArray(payload?.artists) ? payload.artists.map((item) => normalizeSearchArtist(item)) : []
    };
    const parsedHasMore = parseSearchHasMore(payload);
    const fallbackHasMore = {
      playlists: normalized.playlists.length >= SEARCH_PAGE_SIZE,
      tracks: normalized.tracks.length >= SEARCH_PAGE_SIZE,
      artists: normalized.artists.length >= SEARCH_PAGE_SIZE
    };

    if (append) {
      searchResult.value = {
        query: normalized.query,
        type: normalized.type,
        partial: Boolean(searchResult.value.partial || normalized.partial),
        failedProviders: mergeUniqueBy(
          searchResult.value.failedProviders || [],
          normalized.failedProviders || [],
          (item) => String(item || '').trim().toLowerCase()
        ),
        playlists: mergeUniqueBy(
          searchResult.value.playlists || [],
          normalized.playlists || [],
          (item) => String(item?.playlistCode || '').trim()
        ),
        tracks: mergeUniqueBy(
          searchResult.value.tracks || [],
          normalized.tracks || [],
          (item) => `${String(item?.provider || '').trim().toLowerCase()}:${String(item?.trackId || item?.id || '').trim()}`
        ),
        artists: mergeUniqueBy(
          searchResult.value.artists || [],
          normalized.artists || [],
          (item) => `${String(item?.name || '').trim().toLowerCase()}::${(Array.isArray(item?.providers) ? item.providers : []).join(',')}`
        )
      };
      searchPage.value = targetPage;
      searchLoadingMoreError.value = '';
    } else {
      searchResult.value = normalized;
      searchPage.value = 1;
    }

    searchHasMore.value = {
      playlists: parsedHasMore.playlists || fallbackHasMore.playlists,
      tracks: parsedHasMore.tracks || fallbackHasMore.tracks,
      artists: parsedHasMore.artists || fallbackHasMore.artists
    };
  } catch (error) {
    const message = parseErrorMessage(error, append ? '加载更多失败，请继续滑动或点击重试' : '搜索失败，请稍后重试');
    if (append) {
      searchLoadingMoreError.value = message;
    } else {
      searchError.value = message;
      searchResult.value = createEmptySearchResult(type, keyword);
      searchHasMore.value = { playlists: false, tracks: false, artists: false };
      searchPage.value = 1;
    }
  } finally {
    if (append) {
      searchLoadingMore.value = false;
    } else {
      searchLoading.value = false;
    }
  }
}

function triggerMusicSearch() {
  if (!commitSearchFromDraft()) return;
  searchLoadingMoreError.value = '';
  searchSectionError.value = { playlists: '', tracks: '', artists: '' };
  runMusicSearch(committedSearch.value, { append: false, page: 1 });
}

function refreshMusicSearch() {
  const committedKeyword = String(committedSearch.value.keyword || '').trim();
  if (committedKeyword.length < 2) return;
  searchLoadingMoreError.value = '';
  searchSectionError.value = { playlists: '', tracks: '', artists: '' };
  runMusicSearch(committedSearch.value, { append: false, page: 1 });
}

async function loadMoreMusicSearch() {
  if (!hasActiveSearch.value) return;
  if (String(committedSearch.value.type || 'all').toLowerCase() === 'all') return;
  if (searchLoading.value || searchLoadingMore.value) return;
  if (!getCurrentSearchHasMore(committedSearch.value.type)) return;
  await runMusicSearch(committedSearch.value, { append: true, page: searchPage.value + 1 });
}

async function loadMoreMusicSearchSection(sectionType, options = {}) {
  if (!hasActiveSearch.value) return;
  if (String(committedSearch.value.type || 'all').toLowerCase() !== 'all') return;
  const forceFetch = Boolean(options?.forceFetch);
  const section = normalizeSearchSection(sectionType);
  if (!['playlists', 'tracks', 'artists'].includes(section)) return;
  if (searchSectionLoading.value[section]) return;
  if (!forceFetch && growSearchAllVisibleCount(section)) return;
  if (!searchHasMore.value[section]) return;

  const nextPage = Math.max(1, Number(searchSectionPage.value[section] || 1) + 1);
  const queryType = resolveSearchTypeBySection(section);
  const criteria = {
    keyword: committedSearch.value.keyword,
    type: queryType,
    providers: committedSearch.value.providers
  };

  searchSectionLoading.value = { ...searchSectionLoading.value, [section]: true };
  searchSectionError.value = { ...searchSectionError.value, [section]: '' };
  try {
    const payload = await musicApi.searchMusic(criteria.keyword, {
      type: criteria.type,
      providers: criteria.providers,
      page: nextPage,
      limit: SEARCH_PAGE_SIZE
    });
    const parsedHasMore = parseSearchHasMore(payload);
    const playlists = Array.isArray(payload?.playlists) ? payload.playlists.map((item) => normalizeSearchPlaylist(item)) : [];
    const tracks = Array.isArray(payload?.tracks) ? payload.tracks.map((item, index) => normalizeSearchTrack(item, index)) : [];
    const artists = Array.isArray(payload?.artists) ? payload.artists.map((item) => normalizeSearchArtist(item)) : [];

    const nextSearchResult = {
      ...searchResult.value,
      query: String(payload?.query || committedSearch.value.keyword || ''),
      type: 'all',
      partial: Boolean(searchResult.value.partial || payload?.partial),
      failedProviders: mergeUniqueBy(
        searchResult.value.failedProviders || [],
        Array.isArray(payload?.failedProviders || payload?.failed_providers)
          ? (payload.failedProviders || payload.failed_providers).map((item) => String(item || '').trim()).filter(Boolean)
          : [],
        (item) => String(item || '').trim().toLowerCase()
      )
    };
    if (section === 'playlists') {
      nextSearchResult.playlists = mergeUniqueBy(
        searchResult.value.playlists || [],
        playlists,
        (item) => String(item?.playlistCode || '').trim()
      );
    } else if (section === 'artists') {
      nextSearchResult.artists = mergeUniqueBy(
        searchResult.value.artists || [],
        artists,
        (item) => `${String(item?.name || '').trim().toLowerCase()}::${(Array.isArray(item?.providers) ? item.providers : []).join(',')}`
      );
    } else {
      nextSearchResult.tracks = mergeUniqueBy(
        searchResult.value.tracks || [],
        tracks,
        (item) => `${String(item?.provider || '').trim().toLowerCase()}:${String(item?.trackId || item?.id || '').trim()}`
      );
    }
    searchResult.value = nextSearchResult;

    const nextHasMore = { ...searchHasMore.value };
    if (section === 'playlists') {
      nextHasMore.playlists = Boolean(parsedHasMore.playlists || playlists.length >= SEARCH_PAGE_SIZE);
    } else if (section === 'artists') {
      nextHasMore.artists = Boolean(parsedHasMore.artists || artists.length >= SEARCH_PAGE_SIZE);
    } else {
      nextHasMore.tracks = Boolean(parsedHasMore.tracks || tracks.length >= SEARCH_PAGE_SIZE);
    }
    searchHasMore.value = nextHasMore;
    searchSectionPage.value = { ...searchSectionPage.value, [section]: nextPage };
    growSearchAllVisibleCount(section);
  } catch (error) {
    searchSectionError.value = {
      ...searchSectionError.value,
      [section]: parseErrorMessage(error, '加载失败，继续滑动或点击重试')
    };
  } finally {
    searchSectionLoading.value = { ...searchSectionLoading.value, [section]: false };
  }
}

async function retryMusicSearchLoadMore(sectionType = '') {
  const section = normalizeSearchSection(sectionType);
  if (String(committedSearch.value.type || 'all').toLowerCase() === 'all') {
    await loadMoreMusicSearchSection(section, { forceFetch: true });
    return;
  }
  await loadMoreMusicSearch();
}

function loadMoreCurrentPlaylistTracks() {
  growPlaylistBrowseVisibleCount();
}

function maybeAutoLoadCurrentPlaylist() {
  if (!isPlaylistRoute.value) return;
  if (playlistBrowseLoading.value) return;
  if (!currentPlaylistHasMore.value) return;
  if (!centerPaneRef.value) return;
  if (playlistBrowseAutoLoadLocked.value) return;

  const container = centerPaneRef.value;
  const distanceToBottom = container.scrollHeight - (container.scrollTop + container.clientHeight);
  if (distanceToBottom > 420) return;

  playlistBrowseAutoLoadLocked.value = true;
  loadMoreCurrentPlaylistTracks();
  window.setTimeout(() => {
    playlistBrowseAutoLoadLocked.value = false;
  }, 220);
}

function maybeAutoLoadNextSearchPage() {
  if (!hasActiveSearch.value) return;
  const normalizedType = String(committedSearch.value.type || 'all').trim().toLowerCase();
  if (normalizedType === 'all') return;
  if (searchLoading.value || searchLoadingMore.value) return;
  if (!getCurrentSearchHasMore(normalizedType)) return;
  if (!centerPaneRef.value) return;
  if (searchAutoLoadLocked.value) return;
  const loadedCount = getSearchLoadedCountByType(normalizedType);
  if (loadedCount <= 0) return;
  const triggerCount = Math.max(1, loadedCount - Math.floor(SEARCH_PAGE_SIZE * 0.4));
  const scrollProgress = centerPaneRef.value.scrollTop + centerPaneRef.value.clientHeight;
  const scrollRatio = scrollProgress / Math.max(1, centerPaneRef.value.scrollHeight);
  const reachedCount = Math.ceil(scrollRatio * loadedCount);
  if (reachedCount < triggerCount) return;

  searchAutoLoadLocked.value = true;
  loadMoreMusicSearch().finally(() => {
    searchAutoLoadLocked.value = false;
  });
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
  const keyword = String(spotifyQuery.value || '').trim();
  if (!keyword) {
    spotifyResults.value = [];
    return;
  }
  spotifySearching.value = true;
  spotifyError.value = '';
  try {
    const payload = await musicApi.searchSpotifyTracks(
      keyword,
      12,
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
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
    const payload = await musicApi.getSpotifyPreview(
      trackId,
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
    return String(payload?.previewUrl || payload?.preview_url || '').trim();
  } catch {
    return '';
  }
}

async function enqueueSpotifyTrack(item, autoPlay = false) {
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

async function ensureCurrentRoutePlaylistLoaded(options = {}) {
  if (!isPlaylistRoute.value) return;
  const playlistCode = currentPlaylistCodeFromRoute.value || DEFAULT_PLAYLIST_CODE;
  ui.setSelectedPlaylistCode(playlistCode);
  const force = options?.force === true;
  if (!force && currentPlaylistProfile.value.playlistCode === playlistCode && currentPlaylistAllTracks.value.length) {
    return;
  }
  playlistBrowseLoading.value = true;
  playlistBrowseError.value = '';
  try {
    const payload = await musicApi.getPlaylistBundleByCode(
      playlistCode,
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
    const profile = normalizePlaylistSummary(payload?.profile || payload?.playlist, playlistCode);
    const tracks = Array.isArray(payload?.tracks) ? payload.tracks.map((item, index) => normalizeApiTrack(item, index)) : [];
    playlistBrowseProfile.value = profile;
    playlistBrowseTracks.value = tracks;
    resetPlaylistBrowseVisibleCount();
  } catch (error) {
    playlistBrowseProfile.value = normalizePlaylistSummary(
      { playlistCode, name: '歌单加载失败', description: '', cover: '' },
      playlistCode
    );
    playlistBrowseTracks.value = [];
    playlistBrowseError.value = parseErrorMessage(error, '歌单加载失败，请稍后重试');
    resetPlaylistBrowseVisibleCount();
  } finally {
    playlistBrowseLoading.value = false;
  }
}

async function playFeaturedTrack(item, index) {
  const trackId = String(item?.trackId || item?.track_id || item?.id || '').trim();
  const sourceIndex = playerQueueTracks.value.findIndex((track) => track.id === trackId);
  if (sourceIndex >= 0) {
    const played = await player.selectTrackByIndex(sourceIndex, true);
    if (!played) {
      window.alert('该歌曲当前无法播放，请稍后重试');
    }
    return;
  }

  const played = await player.playExternalTrack?.(
    normalizeApiTrack(item, Number(index) || 0),
    { replaceQueue: true }
  );
  if (!played) {
    window.alert('该歌曲当前无法播放，请稍后重试');
  }
}

async function playSearchTrack(item, index) {
  const trackId = String(item?.trackId || item?.track_id || item?.id || '').trim();
  const provider = String(item?.provider || '').trim().toLowerCase();
  const existingIndex = playerQueueTracks.value.findIndex((track) => {
    const rowId = String(track?.trackId || track?.id || '').trim();
    const rowProvider = String(track?.provider || '').trim().toLowerCase();
    return rowId === trackId && (!provider || provider === rowProvider);
  });
  if (existingIndex >= 0) {
    const played = await player.selectTrackByIndex(existingIndex, true);
    if (!played) {
      window.alert('该歌曲当前无法播放，请稍后重试');
    }
    return;
  }
  const played = await player.playExternalTrack?.(
    normalizeSearchTrack(item, Number(index) || 0),
    { replaceQueue: true }
  );
  if (!played) {
    window.alert('该歌曲当前无法播放，请稍后重试');
  }
}

async function enqueueSearchTrackNext(item, index) {
  const success = await player.enqueueNextTrack?.(normalizeSearchTrack(item, Number(index) || 0));
  if (!success) {
    window.alert('当前曲目暂不可加入“下一首播放”');
  }
}

async function playTrackInCurrentPlaylist(index) {
  const safeIndex = Number(index);
  if (!Number.isInteger(safeIndex) || safeIndex < 0 || safeIndex >= currentPlaylistAllTracks.value.length) return;
  const success = await player.replaceQueueWithTracks?.(
    currentPlaylistAllTracks.value,
    safeIndex,
    true,
    {
      sourceType: 'playlist',
      sourceCode: currentPlaylistProfile.value?.playlistCode || ''
    }
  );
  if (!success) {
    window.alert('该歌曲当前无法播放，请稍后重试');
    return;
  }
  growPlaylistBrowseVisibleCount();
}

async function handleSelectTrackFromDock(index) {
  const safeIndex = Number(index);
  if (!Number.isInteger(safeIndex) || safeIndex < 0) return;
  await player.selectTrackByIndex(safeIndex, true);
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
  clearSearchState();
  ui.setActiveNav('playlist');
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
  await ensureCurrentRoutePlaylistLoaded({ force: true });
}

async function handleCreatePlaylist() {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  createDialogError.value = '';
  createDialogVisible.value = true;
}

async function submitCreatePlaylist(rawName) {
  if (!auth.isAuthenticated.value) {
    createDialogVisible.value = false;
    goLogin();
    return;
  }
  const name = String(rawName || '').trim();
  if (!name) {
    createDialogError.value = '歌单名称不能为空';
    return;
  }
  createDialogSubmitting.value = true;
  createDialogError.value = '';
  try {
    const created = await musicApi.createMyMusicPlaylist({ name }, auth.authorizedFetch);
    await loadSidebarData();
    createDialogVisible.value = false;
    openPlaylistDetail(created?.playlistCode || created?.playlist_code);
  } catch (error) {
    createDialogError.value = parseErrorMessage(error, '创建歌单失败');
  } finally {
    createDialogSubmitting.value = false;
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
  searchLoading,
  searchLoadingMore,
  searchLoadingMoreError,
  searchSectionLoading,
  searchSectionError,
  searchError,
  searchResult,
  searchHasMore,
  searchAllVisibleCount,
  hasActiveSearch,
  currentPlaylistProfile,
  currentPlaylistAllTracks,
  currentPlaylistTracks,
  currentPlaylistHasMore,
  currentPlaylistLoading,
  currentPlaylistError,
  collectingPlaylist,
  isCurrentPlaylistCollected,
  reloadHomeData: loadHomeData,
  triggerMusicSearch,
  loadMoreMusicSearch,
  loadMoreMusicSearchSection,
  retryMusicSearchLoadMore,
  reloadCurrentPlaylist,
  loadMoreCurrentPlaylistTracks,
  openPlaylistDetail,
  backToMainList,
  enterPlayerDetail,
  exitPlayerDetail,
  playFeaturedTrack,
  playSearchTrack,
  enqueueSearchTrackNext,
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
  () => route.fullPath,
  (nextPath, prevPath) => {
    if (!prevPath) {
      centerTransitionName.value = 'music-center-fade';
      return;
    }
    const fromPlaylist = isPlaylistPath(prevPath);
    const toPlaylist = isPlaylistPath(nextPath);
    if (toPlaylist && !fromPlaylist) {
      centerTransitionName.value = 'music-center-forward';
      return;
    }
    if (!toPlaylist && fromPlaylist) {
      centerTransitionName.value = 'music-center-backward';
      return;
    }
    centerTransitionName.value = 'music-center-fade';
  }
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
  ui.setExpandedProvider('');
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
