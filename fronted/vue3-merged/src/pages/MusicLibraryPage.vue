<template>
  <section class="route-page music-library-page" :class="{ 'player-detail-route': isPlayerDetailRoute, 'folia-mode-active': foliaMode }">
    <section
      class="folia-embed-pane music-mode-pane"
      :class="{ 'folia-embed-visible': foliaMode, 'folia-embed-hidden': !foliaMode }"
      :aria-hidden="!foliaMode"
      :inert="!foliaMode"
    >
      <div class="folia-embed-toolbar">
        <div class="folia-embed-track" v-if="foliaTrackInfo">
          <i class="fas fa-music"></i>
          <span class="folia-track-name">{{ foliaTrackInfo.name }}</span>
          <span v-if="foliaTrackInfo.artist" class="folia-track-artist">{{ foliaTrackInfo.artist }}</span>
        </div>
        <span v-else class="folia-embed-hint">正在加载 Folia 沉浸播放器…</span>
        <div class="folia-embed-actions">
          <label class="folia-playlist-picker" title="用音乐界面的歌单在 Folia 播放">
            <span class="folia-playlist-label"><i class="fas fa-list-ul"></i> 歌单</span>
            <select
              class="folia-playlist-select"
              :value="foliaSelectedPlaylist"
              @change="handleFoliaPlaylistSelect"
            >
              <option value="">选择歌单播放…</option>
              <option v-for="item in foliaPlaylistOptions" :key="item.playlistCode" :value="item.playlistCode">
                {{ item.name }}
              </option>
            </select>
          </label>
          <button class="folia-toolbar-btn ripple-trigger" type="button" @click="syncCookieToFolia">
            <i class="fas fa-sync-alt"></i>
            同步账号
          </button>
          <button class="folia-toolbar-btn ripple-trigger" type="button" @click="requestFoliaStatus">
            <i class="fas fa-info-circle"></i>
            播放状态
          </button>
          <button class="folia-toolbar-btn folia-fullscreen-btn ripple-trigger" type="button" title="全屏 Folia" aria-label="全屏 Folia" @click="toggleFoliaFullscreen">
            <i class="fas fa-expand"></i>
          </button>
          <button class="folia-toolbar-btn folia-library-btn ripple-trigger" type="button" title="返回音乐库" aria-label="返回音乐库" @click="setFoliaMode(false)">
            <i class="fas fa-arrow-left"></i>
          </button>
        </div>
      </div>
      <div
        ref="foliaEmbedHostRef"
        class="folia-embed-host"
        data-folia-embed
      ></div>
    </section>

    <section v-if="fatalErrorText && !foliaMode" class="music-fatal-error liquid-material">
      <h3>音乐页面加载失败</h3>
      <p>{{ fatalErrorText }}</p>
      <button class="retry-btn ripple-trigger" type="button" @click="reloadAfterFatalError">重试加载</button>
    </section>

    <div
      class="music-library-module music-mode-pane"
      :class="{
        'player-detail-only': isPlayerDetailRoute,
        'music-mode-pane-visible': !foliaMode,
        'music-mode-pane-hidden': foliaMode
      }"
      :aria-hidden="foliaMode"
      :inert="foliaMode"
    >
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
          :error-text="sidebarError"
          @select-nav="handleSelectNav"
          @select-playlist="openPlaylistDetail"
          @create-playlist="handleCreatePlaylist"
          @retry="loadSidebarData"
          @close-drawer="ui.setLeftDrawerOpen(false)"
        />

        <SubtleScrollArea tag="main" ref="centerPaneRef" class="music-center-pane" @scroll.passive="rememberCenterScroll">
          <header class="music-center-mode-switch" role="tablist" aria-label="music center mode tabs">
            <button
              class="mode-tab"
              type="button"
              role="tab"
              :aria-selected="currentCenterMode === 'music'"
              :class="{ active: currentCenterMode === 'music' }"
              @click="openCenterMode('music')"
            >
              音乐
            </button>
            <button
              v-if="voiceEntryVisible"
              class="mode-tab"
              type="button"
              role="tab"
              :aria-selected="currentCenterMode === 'voice'"
              :class="{ active: currentCenterMode === 'voice' }"
              @click="openCenterMode('voice')"
            >
              音声
            </button>
          </header>

          <MusicSearchToolbar
            v-if="showMusicSearchToolbar"
            class="music-toolbar-stick"
            :keyword="ui.globalSearchKeyword.value"
            :type="ui.globalSearchType.value"
            :loading="searchLoading"
            :error-text="searchError"
            :show-filters="showSearchToolbarFilters"
            :search-history="musicSearchHistory"
            :type-options="SEARCH_TYPE_OPTIONS"
            :provider-options="SEARCH_PROVIDER_OPTIONS"
            :selected-providers="ui.globalSearchProviders.value"
            @update:keyword="ui.setGlobalSearchKeyword($event)"
            @apply-history="applyMusicSearchHistory"
            @clear-history="clearMusicSearchHistoryRecords"
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
            <component :is="Component" :key="resolveMusicCenterViewKey(centerRoute)" class="music-center-view-shell" />
          </RouterView>
        </SubtleScrollArea>

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
          :meting-status="metingStatus"
          :meting-status-busy="metingStatusBusy"
          :spotify-bound="spotifyBound"
          :spotify-busy="spotifyBusy"
          :spotify-query="spotifyQuery"
          :spotify-searching="spotifySearching"
          :spotify-results="spotifyResults"
          :spotify-error="spotifyError"
          :source-mode="musicSourceMode"
          :source-provider-order="musicAccountProviderOrder"
          :source-accounts="musicSourceAccounts"
          :source-cookie-inputs="musicSourceCookieInputs"
          :source-busy-map="musicSourceBusyMap"
          :source-import-busy-map="musicSourceImportBusyMap"
          :source-bind-busy-map="musicSourceBindBusyMap"
          @set-volume="handleSetVolume"
          @set-eq-level="handleSetEqLevel"
          @seek-lyric="player.seekToTime($event)"
          @close-drawer="ui.setRightDrawerOpen(false)"
          @update:expanded-provider="ui.setExpandedProvider($event)"
          @refresh-meting-status="loadMetingStatus"
          @open-music-authorization="openMusicAuthorization"
          @bind-spotify="handleBindSpotify"
          @update:spotify-query="spotifyQuery = $event"
          @search-spotify="handleSearchSpotify"
          @preview-spotify="handlePreviewSpotify"
          @enqueue-spotify="handleEnqueueSpotify"
          @update:source-mode="handleUpdateMusicSourceMode"
          @move-source-provider="handleMoveMusicSourceProvider"
          @update:source-cookie="handleUpdateMusicSourceCookieInput"
          @save-source-cookie="handleSaveMusicSourceCookie"
          @delete-source-cookie="handleDeleteMusicSourceCookie"
          @import-source-playlists="handleImportMusicSourcePlaylists"
          @bind-source-account="handleBindMusicSourceAccount"
        />

      </template>

      <main v-else class="music-player-detail-pane">
        <RouterView />
      </main>

      <MusicLibraryDock
        :track="player.currentTrack.value"
        :tracks="player.tracks.value"
        :current-track-id="player.currentTrack.value?.id || ''"
        :is-playing="player.isPlaying.value && !foliaMode"
        :current-time="player.currentTime.value"
        :duration="player.duration.value"
        :expected-duration="player.expectedDuration.value"
        :is-preview-playback="player.isPreviewPlayback.value"
        :play-mode="player.playMode.value"
        :volume="player.volume.value"
        :detail-layout="isPlayerDetailRoute"
        @toggle-play="player.togglePlay"
        @prev="player.playPrev"
        @next="player.playNext"
        @seek="player.seekToPercent"
        @cycle-mode="player.cyclePlayMode"
        @set-volume="player.setVolume"
        @select-track="handleSelectTrackFromDock"
        @open-collect-dialog="openCollectDialog()"
        @open-player-detail="enterPlayerDetail"
      />
    </div>

    <MusicCollectTrackDialog
      :visible="collectDialogVisible"
      :track="collectDialogTrack"
      :playlist-options="collectPlaylistTargets"
      :can-collect="auth.isAuthenticated.value"
      :can-collect-default-public="isAdminUser"
      :busy="collectDialogBusy"
      :error-text="collectDialogError"
      @close="closeCollectDialog"
      @collect="handleCollectDialogSelect"
      @collect-default-public="handleCollectDialogDefaultPublic"
      @require-login="requestMusicLogin"
      @create-playlist="handleCreatePlaylist"
    />

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
import { computed, inject, nextTick, onBeforeUnmount, onErrorCaptured, onMounted, provide, ref, watch } from 'vue';
import { RouterView, useRoute, useRouter } from 'vue-router';
import MusicLibraryDock from '../components/music/MusicLibraryDock.vue';
import MusicCreatePlaylistDialog from '../components/music/MusicCreatePlaylistDialog.vue';
import MusicCollectTrackDialog from '../components/music/MusicCollectTrackDialog.vue';
import MusicLeftSidebar from '../components/music/MusicLeftSidebar.vue';
import MusicRightPanel from '../components/music/MusicRightPanel.vue';
import MusicSearchToolbar from '../components/music/MusicSearchToolbar.vue';
import SubtleScrollArea from '../components/SubtleScrollArea.vue';
import { MUSIC_LIBRARY_CONTEXT_KEY } from '../composables/musicLibraryContext';
import { useAuthSession } from '../composables/useAuthSession';
import { usePlayerBridge } from '../composables/playerBridge';
import { HOME_STAGE_CONTEXT_KEY } from '../utils/homeTimeStageState';
import { MUSIC_PRIMARY_NAV, useMusicLibraryUiState } from './musicLibraryUiState';
import * as musicApi from '../services/musicApi';
import { buildPlaylistTrackUpsertPayload } from '../utils/musicTrackPayload';
import {
  clearMusicSearchHistory,
  readMusicSearchHistory,
  recordMusicSearchHistory
} from '../utils/musicSearchHistory';
import { formatMediaTime } from '../utils/mediaTime';
import { normalizePlaylistRowCapacity } from '../utils/musicSearchAllLayout';
import { buildCollectPlaylistTargets } from '../utils/musicCollectTargets';
import { resolveMusicCenterViewKey } from '../utils/musicRouteViewKey';
import {
  enrichSearchPlaylists,
  readDurationLabel,
  readPositiveDurationSec
} from '../utils/musicSearchMetadata';
import {
  SOURCE_ACCOUNT_PROVIDERS,
  normalizeMusicSourceModeValue,
  normalizeSourceAccountStatus,
  normalizeSourceProviderOrder
} from '../utils/musicAuthorizationState';
import {
  describeMusicSourceQrBindSession,
  isTerminalMusicSourceBindSession,
  mergeMusicSourceBindSession,
  normalizeMusicSourceBindSession,
  resolveMusicSourceBindPollIntervalMs,
  waitForMusicSourceBind
} from '../utils/musicSourceBindSession';

const DEFAULT_PLAYLIST_CODE = 'default_public';
const SEARCH_PAGE_SIZE = 24;
const PLAYLIST_BROWSE_INITIAL_VISIBLE = 100;
const PLAYLIST_BROWSE_STEP = 100;
const PLAYLIST_PREFETCH_GAP = 40;
const SEARCH_ALL_PLAYLIST_MIN_CAPACITY = 1;
const SEARCH_ALL_PLAYLIST_MAX_CAPACITY = 12;
const SEARCH_ALL_INITIAL_VISIBLE = Object.freeze({
  playlists: 3,
  tracks: 10,
  artists: 10
});

// Folia 沉浸模式：同源嵌入已部署的 Folia 播放器（site.shizuki.online/music → gateway 18081）
const FOLIA_EMBED_URL = '/music/';
const FOLIA_MODE_STORAGE_KEY = 'shizuki.music.foliaMode';
const FOLIA_NETEASE_COOKIE_STORAGE_KEYS = ['online_provider:netease:cookie', 'netease_cookie'];
const FOLIA_OUTBOUND_MESSAGE_TYPES = new Set([
  'shizuki:follow-playback',
  'shizuki:activate-playback-bridge',
  'shizuki:stop-follow-playback',
  'shizuki:sync-clock',
  'shizuki:sync-cookie',
  'shizuki:get-cookie',
  'shizuki:get-status',
  'shizuki:set-theme',
  'shizuki:set-wallpaper',
  'shizuki:set-view'
]);
const homeStageContext = inject(HOME_STAGE_CONTEXT_KEY, null);
const foliaMode = ref(readFoliaModePreference());
const foliaEmbedHostRef = ref(null);
const foliaTrackInfo = ref(null);
const foliaSelectedPlaylist = ref('');
let foliaLastKnownNeteaseCookie = '';
let foliaBridgeReady = false;
let foliaPendingSession = null; // Folia bridge 就绪前暂存完整权威播放会话
let foliaPlaybackSessionVersion = 0;
let foliaPreloadPromise = null;
let foliaMountPromise = null;
let foliaWarmupHandle = 0;
let foliaWarmupUsesIdleCallback = false;
const foliaScriptLoads = new Map();

/**
 * 动态加载 Folia（同文档 embed，非 iframe）：
 * 1. 创建 #folia-embed-root 容器
 * 2. 注入 runtime-config.js + main chunk（?embed=1）
 * 3. Folia React 树渲染进容器，桥在同一 window 上监听
 */
/**
 * 预加载 Folia 脚本（不创建容器）：进入音乐页时预热，切 Folia 模式时秒挂载。
 * 脚本已加载后再次调用直接解析主 chunk 并等待就绪。
 */
async function preloadFoliaScripts() {
  if (foliaPreloadPromise) return foliaPreloadPromise;
  foliaPreloadPromise = (async () => {
    await loadScript('/music/runtime-config.js');
    // Folia has its own PWA service worker. Give each document session a fresh
    // index request so a previously precached HTML shell cannot point us at an
    // outdated hashed entry chunk after a Folia gateway deployment.
    const indexUrl = `${FOLIA_EMBED_URL}?__shizuki_embed=${Date.now()}`;
    const response = await fetch(indexUrl, { cache: 'no-store' });
    if (!response.ok) throw new Error(`failed to load Folia index (${response.status})`);
    const html = await response.text();
    const mainMatch = html.match(/<script type="module"[^>]*src="([^"]+)"/);
    const mainSrc = mainMatch ? mainMatch[1] : '/music/assets/main-C_MalaQ2.js';
    const existing = document.querySelector(`link[href="${mainSrc}"]`);
    if (!existing) {
      const link = document.createElement('link');
      link.rel = 'modulepreload';
      link.href = mainSrc;
      document.head.appendChild(link);
    }
    return mainSrc;
  })().catch((error) => {
    foliaPreloadPromise = null;
    throw error;
  });
  return foliaPreloadPromise;
}

/** 进入 Folia 模式：确保脚本已加载 + 创建容器 → Folia 立即挂载（无缝）。 */
async function loadFoliaEmbed() {
  if (foliaBridgeReady) return true;
  if (foliaMountPromise) return foliaMountPromise;
  const host = foliaEmbedHostRef.value || document.querySelector('[data-folia-embed]');
  if (!host) return false;
  foliaMountPromise = (async () => {
    let embedRoot = document.getElementById('folia-embed-root');
    if (!embedRoot) {
      embedRoot = document.createElement('div');
      embedRoot.id = 'folia-embed-root';
      embedRoot.style.cssText = 'position:absolute;inset:0;width:100%;height:100%;overflow:hidden;';
    }
    if (embedRoot.parentElement !== host) host.appendChild(embedRoot);

    if (embedRoot.children.length === 0) {
      const mainSrc = await preloadFoliaScripts();
      await loadScript(mainSrc, { module: true });
      await waitForFoliaMount(40000);
    }

    foliaBridgeReady = embedRoot.children.length > 0;
    if (!foliaBridgeReady) throw new Error('Folia embed mount timed out');
    postToFolia({ type: 'shizuki:activate-playback-bridge' });
    void (async () => {
      // Folia may have refreshed its login after the last site-side write.
      // Prefer that same-origin local value before asking the backend for an
      // older copy, otherwise startup can overwrite the newer credential.
      const foliaCookieSynced = await syncCookieBackFromFolia();
      if (!foliaCookieSynced) await syncCookieToFolia();
    })();
    deliverPendingFoliaSession();
    syncThemeToFolia();
    syncHomeWallpaperToFolia();
    return true;
  })().catch((error) => {
    foliaMountPromise = null;
    throw error;
  });
  return foliaMountPromise;
}

/** 轮询等待 Folia React 树挂载进 #folia-embed-root。 */
function waitForFoliaMount(timeoutMs = 20000) {
  const started = Date.now();
  return new Promise((resolve) => {
    const poll = () => {
      const root = document.getElementById('folia-embed-root');
      if (root && root.children.length > 0) {
        resolve(true);
        return;
      }
      if (Date.now() - started > timeoutMs) {
        resolve(false);
        return;
      }
      window.setTimeout(poll, 200);
    };
    poll();
  });
}

function loadScript(src, options = {}) {
  if (foliaScriptLoads.has(src)) return foliaScriptLoads.get(src);
  const promise = new Promise((resolve, reject) => {
    const existing = document.querySelector(`script[src="${src}"]`);
    if (existing?.dataset.loaded === '1') {
      resolve();
      return;
    }
    const script = existing || document.createElement('script');
    const handleLoad = () => {
      script.dataset.loaded = '1';
      resolve();
    };
    const handleError = () => {
      foliaScriptLoads.delete(src);
      if (!existing) script.remove();
      reject(new Error(`failed to load ${src}`));
    };
    script.addEventListener('load', handleLoad, { once: true });
    script.addEventListener('error', handleError, { once: true });
    if (!existing) {
      script.src = src;
      if (options.module) script.type = 'module';
      document.head.appendChild(script);
    }
  });
  foliaScriptLoads.set(src, promise);
  return promise;
}

function scheduleFoliaWarmup() {
  if (foliaBridgeReady || foliaMountPromise || foliaWarmupHandle) return;
  const warmup = () => {
    foliaWarmupHandle = 0;
    void loadFoliaEmbed().catch(() => {});
  };
  if (typeof window.requestIdleCallback === 'function') {
    foliaWarmupUsesIdleCallback = true;
    foliaWarmupHandle = window.requestIdleCallback(warmup, { timeout: 2500 });
  } else {
    foliaWarmupUsesIdleCallback = false;
    foliaWarmupHandle = window.setTimeout(warmup, 1200);
  }
}

function cancelFoliaWarmup() {
  if (!foliaWarmupHandle) return;
  if (foliaWarmupUsesIdleCallback && typeof window.cancelIdleCallback === 'function') {
    window.cancelIdleCallback(foliaWarmupHandle);
  } else {
    window.clearTimeout(foliaWarmupHandle);
  }
  foliaWarmupHandle = 0;
}

function parkFoliaEmbed() {
  const embedRoot = document.getElementById('folia-embed-root');
  if (!embedRoot) return;
  let parking = document.getElementById('folia-embed-parking');
  if (!parking) {
    parking = document.createElement('div');
    parking.id = 'folia-embed-parking';
    parking.setAttribute('aria-hidden', 'true');
    parking.inert = true;
    parking.style.cssText = 'position:fixed;inset:0;visibility:hidden;pointer-events:none;overflow:hidden;z-index:-1;';
    document.body.appendChild(parking);
  }
  parking.appendChild(embedRoot);
}

/** 把站点当前主题模式同步给 Folia（embed 模式下 Folia 跟随站点昼夜）。 */
function syncThemeToFolia() {
  try {
    const root = document.documentElement;
    const themeMode = String(root.dataset.themeMode || root.getAttribute('data-theme-mode') || 'night');
    const isDaylight = themeMode === 'day';
    postToFolia({ type: 'shizuki:set-theme', isDaylight });
  } catch {
    // ignore
  }
}

function resolveFoliaWallpaper() {
  const wallpaper = homeStageContext?.homeWallpaper?.value || homeStageContext?.wallpaper?.value || null;
  // CSS background images cannot render a video or Live2D source. In those
  // cases Folia deliberately uses Home's preview still instead.
  const source = String(
    wallpaper?.isDynamic
      ? (wallpaper?.preview || '')
      : (wallpaper?.src || wallpaper?.preview || '')
  ).trim();
  return {
    source,
    preview: String(wallpaper?.preview || source).trim(),
    isDynamic: Boolean(wallpaper?.isDynamic)
  };
}

function applyFoliaAmbientWallpaper(source) {
  const host = foliaEmbedHostRef.value;
  const pane = host?.closest?.('.folia-embed-pane');
  if (!pane) return;
  pane.dataset.foliaWallpaper = source ? 'active' : '';
  pane.style.setProperty(
    '--folia-ambient-wallpaper-image',
    source ? `url(${JSON.stringify(source)})` : 'none'
  );
}

/** Folia 内容区显示 Home 原图，外围保持柔化背景。 */
function syncHomeWallpaperToFolia() {
  const wallpaper = resolveFoliaWallpaper();
  applyFoliaAmbientWallpaper(wallpaper.source);
  postToFolia({
    type: 'shizuki:set-wallpaper',
    source: wallpaper.source,
    preview: wallpaper.preview,
    isDynamic: wallpaper.isDynamic
  });
}

function toggleFoliaFullscreen() {
  const pane = document.querySelector('.folia-embed-pane');
  if (!pane) return;
  if (document.fullscreenElement) {
    void document.exitFullscreen?.();
    return;
  }
  syncHomeWallpaperToFolia();
  void pane.requestFullscreen?.().catch(() => {});
}

/** 普通模式歌单（含默认/创建/收藏）作为 Folia 播放候选。 */
const foliaPlaylistOptions = computed(() => {
  const options = [];
  const push = (item) => {
    const code = String(item?.playlistCode || '').trim();
    const name = String(item?.name || '').trim();
    if (code && name) options.push({ playlistCode: code, name });
  };
  (Array.isArray(corePlaylists.value) ? corePlaylists.value : []).forEach(push);
  (Array.isArray(createdPlaylists.value) ? createdPlaylists.value : []).forEach(push);
  (Array.isArray(collectedPlaylists.value) ? collectedPlaylists.value : []).forEach(push);
  const seen = new Set();
  return options.filter((item) => (seen.has(item.playlistCode) ? false : (seen.add(item.playlistCode), true)));
});

/** 选择歌单后：由站点播放器接管队列，Folia 只跟随当前播放快照。 */
async function handleFoliaPlaylistSelect(event) {
  const code = String(event?.target?.value || '').trim();
  foliaSelectedPlaylist.value = code;
  if (!code) return;
  try {
    const payload = await musicApi.getPlaylistBundleByCode(code, auth.isAuthenticated.value ? auth.authorizedFetch : undefined);
    const tracks = Array.isArray(payload?.tracks) ? payload.tracks : [];
    if (!tracks.length) return;
    const selectedPlaylistName = foliaPlaylistOptions.value.find((item) => item.playlistCode === code)?.name || '';
    const replaced = await player.replaceQueueWithTracks?.(tracks, 0, true, {
      sourceCode: code,
      sourceName: selectedPlaylistName,
      sourceType: 'folia-toolbar'
    });
    if (!replaced) return;
    await pushCurrentTrackToFolia();
  } catch {
    foliaSelectedPlaylist.value = '';
  }
}

function readFoliaModePreference() {
  if (typeof window === 'undefined') return false;
  try {
    return window.localStorage.getItem(FOLIA_MODE_STORAGE_KEY) === '1';
  } catch {
    return false;
  }
}

function setFoliaMode(enabled, options = {}) {
  const nextEnabled = Boolean(enabled);
  const syncPlayback = options.syncPlayback !== false;
  foliaMode.value = nextEnabled;
  if (typeof window !== 'undefined') {
    try {
      window.localStorage.setItem(FOLIA_MODE_STORAGE_KEY, foliaMode.value ? '1' : '0');
    } catch {
      // ignore storage failures
    }
  }
  if (foliaMode.value) {
    cancelFoliaWarmup();
    void nextTick().then(async () => {
      await loadFoliaEmbed();
      postToFolia({ type: 'shizuki:activate-playback-bridge' });
    }).catch(() => {});
    if (syncPlayback) void pushCurrentTrackToFolia();
  } else {
    stopFoliaClockSync();
    postToFolia({ type: 'shizuki:stop-follow-playback' });
  }
}

/** 向 Folia 发送一条 postMessage（同文档 embed：桥在同一 window 上监听）。 */
function postToFolia(payload) {
  try {
    window.postMessage(payload, window.location.origin);
    return true;
  } catch {
    return false;
  }
}

/** 拉取当前用户网易云 cookie 并同步到 Folia 的当前存储键与旧版兼容键。 */
async function syncCookieToFolia() {
  if (!auth.isAuthenticated.value) return false;
  try {
    const response = await musicApi.getMySourceAccountCookie(auth.authorizedFetch);
    const cookie = String(response || '').trim();
    if (!cookie) return false;
    foliaLastKnownNeteaseCookie = cookie;
    if (foliaBridgeReady) {
      postToFolia({ type: 'shizuki:sync-cookie', cookie });
    } else {
      // Bridge 尚未就绪时，把 cookie 暂存到 window（index.tsx 安装桥时读取）。
      try {
        window.__shizukiPendingCookie = cookie;
      } catch {
        // ignore
      }
    }
    return true;
  } catch {
    return false;
  }
}

function readFoliaNeteaseCookie() {
  try {
    for (const key of FOLIA_NETEASE_COOKIE_STORAGE_KEYS) {
      const cookie = String(window.localStorage.getItem(key) || '').trim();
      if (cookie) return cookie;
    }
    return '';
  } catch {
    return '';
  }
}

async function persistFoliaNeteaseCookie(rawCookie) {
  const cookie = String(rawCookie || '').trim();
  if (!cookie || !auth.isAuthenticated.value) return false;
  if (cookie === foliaLastKnownNeteaseCookie) return true;

  const previousCookie = foliaLastKnownNeteaseCookie;
  foliaLastKnownNeteaseCookie = cookie;
  try {
    await musicApi.upsertMusicSourceAccountCookie('netease', cookie, auth.authorizedFetch);
    await loadMusicSourceAccountsStatus();
    // If Folia just refreshed the account while a 30-second trial is
    // audible in the normal player, immediately resolve this same queue
    // item again through the account-authorized source and keep its time.
    const currentTrack = player.currentTrack?.value;
    const provider = String(currentTrack?.provider || '').trim().toLowerCase();
    const wasPlaying = Boolean(player.isPlaying?.value);
    const positionSec = Math.max(0, Number(player.currentTime?.value || 0));
    if (wasPlaying && provider === 'netease' && currentTrack) {
      const refreshed = await player.playExternalTrack?.(currentTrack, { replaceQueue: false });
      if (refreshed && positionSec > 0) player.seekToTime?.(positionSec);
    }
    if (typeof window !== 'undefined') {
      window.dispatchEvent(new CustomEvent('shizuki:account-synced', { detail: { provider: 'netease' } }));
    }
    return true;
  } catch {
    foliaLastKnownNeteaseCookie = previousCookie;
    return false;
  }
}

function buildFoliaDisplayTrack(track) {
  if (!track || typeof track !== 'object') return null;
  const id = String(track.trackId || track.id || track.track_id || '').trim();
  if (!id) return null;
  const durationSec = Number(track.playableDurationSec ?? track.durationSec ?? track.duration_sec ?? 0);
  const durationMs = Number.isFinite(durationSec) && durationSec > 0 ? Math.round(durationSec * 1000) : 0;
  const artist = String(track.artist || '').trim();
  const artists = Array.isArray(track.artists)
    ? track.artists
      .map((item) => (typeof item === 'object' ? item?.name : item))
      .map((item) => String(item || '').trim())
      .filter(Boolean)
    : artist.split(/\s*[/,&]\s*/).filter(Boolean);
  const cover = String(track.cover || track.coverUrl || track.cover_url || '').trim();
  return {
    id,
    foliaId: readFoliaVisualId(id),
    trackId: id,
    provider: String(track.provider || '').trim(),
    name: String(track.title || track.name || '').trim(),
    title: String(track.title || track.name || '').trim(),
    artist,
    artists: artists.map((name) => ({ name })),
    cover,
    coverUrl: cover,
    album: { picUrl: cover },
    durationMs,
    durationSec: Number.isFinite(durationSec) && durationSec > 0 ? durationSec : 0,
    durationLabel: String(track.durationLabel || track.duration || '').trim(),
    queueEntryId: String(track.queueEntryId || '').trim(),
    sort: Number(track.sort || 0)
  };
}

function readFoliaVisualId(trackId) {
  const raw = String(trackId || '').trim();
  const numeric = Number(raw);
  if (Number.isSafeInteger(numeric) && numeric > 0) return numeric;
  let hash = 2166136261;
  for (let index = 0; index < raw.length; index += 1) {
    hash ^= raw.charCodeAt(index);
    hash = Math.imul(hash, 16777619);
  }
  return (hash >>> 0) || 1;
}

function buildFoliaLyricTimeline() {
  const timeline = Array.isArray(player.lyricTimeline?.value) ? player.lyricTimeline.value : [];
  return timeline.map((entry) => {
    const startTime = Math.max(0, Number(entry?.time || 0));
    const declaredEndTime = Number(entry?.endTime);
    return {
      time: startTime,
      // Plain LRC commonly represents the end as null. Sending it as 0 makes
      // Folia expire the line immediately instead of deriving the next boundary.
      endTime: Number.isFinite(declaredEndTime) && declaredEndTime > startTime ? declaredEndTime : null,
      original: String(entry?.original || entry?.text || '').trim(),
      translation: String(entry?.translation || '').trim(),
      furigana: String(entry?.furigana || entry?.romanization || '').trim(),
      words: Array.isArray(entry?.words)
        ? entry.words.map((word) => {
          const wordStartTime = Math.max(0, Number(word?.time ?? word?.startTime ?? 0));
          const declaredWordEndTime = Number(word?.endTime ?? word?.end);
          return {
            text: String(word?.text || '').trim(),
            time: wordStartTime,
            endTime: Number.isFinite(declaredWordEndTime) && declaredWordEndTime > wordStartTime
              ? declaredWordEndTime
              : null
          };
        }).filter((word) => word.text)
        : []
    };
  }).filter((entry) => entry.original);
}

/** 构造唯一的主站播放会话；Folia 只消费它，不能再自行补齐歌曲或歌词。 */
function buildFoliaPlaybackSession() {
  const track = buildFoliaDisplayTrack(player.currentTrack?.value);
  const queue = (Array.isArray(player.tracks?.value) ? player.tracks.value : [])
    .map(buildFoliaDisplayTrack)
    .filter(Boolean);
  const profile = player.playlistProfile?.value || null;
  const positionSec = Number(player.currentTime?.value || 0);
  const durationSec = Number(player.duration?.value || 0);
  const lyricIndex = Number(player.currentLyricEntryIndex?.value);
  return {
    version: ++foliaPlaybackSessionVersion,
    track,
    queue,
    playlist: profile
      ? {
        code: String(profile.playlistCode || profile.playlist_code || ''),
        name: String(profile.name || ''),
        cover: String(profile.cover || ''),
        description: String(profile.description || '')
      }
      : null,
    lyrics: buildFoliaLyricTimeline(),
    lyricRenderMode: String(player.lyricRenderMode?.value || 'original'),
    lyricIndex: Number.isInteger(lyricIndex) ? lyricIndex : -1,
    positionMs: Number.isFinite(positionSec) && positionSec > 0 ? Math.round(positionSec * 1000) : 0,
    durationMs: Number.isFinite(durationSec) && durationSec > 0 ? Math.round(durationSec * 1000) : 0,
    playing: Boolean(player.isPlaying?.value)
  };
}

/** 切到 Folia：站点 audio 是唯一输出，Folia 接收完整播放会话用于渲染。 */
async function pushCurrentTrackToFolia() {
  const session = buildFoliaPlaybackSession();
  foliaTrackInfo.value = session.track
    ? { name: session.track.name, artist: session.track.artist }
    : null;
  foliaPendingSession = session;
  if (foliaBridgeReady) {
    deliverPendingFoliaSession();
  }
}

/** 站点音频进度 → Folia clock 同步（跟随模式驱动 Folia 歌词/视觉）。 */
let foliaClockSyncTimer = null;
function startFoliaClockSync() {
  stopFoliaClockSync();
  let lastPositionMs = -1;
  let lastPlaying = null;
  foliaClockSyncTimer = window.setInterval(() => {
    if (!foliaMode.value || !foliaBridgeReady) {
      stopFoliaClockSync();
      return;
    }
    const positionSec = Number(player.currentTime?.value || 0);
    const positionMs = Number.isFinite(positionSec) && positionSec > 0 ? Math.round(positionSec * 1000) : 0;
    const playing = Boolean(player.isPlaying?.value);
    if (positionMs > 0 && (Math.abs(positionMs - lastPositionMs) >= 120 || playing !== lastPlaying)) {
      postToFolia({ type: 'shizuki:sync-clock', positionMs, playing });
      lastPositionMs = positionMs;
      lastPlaying = playing;
    }
  }, 250);
}

function stopFoliaClockSync() {
  if (foliaClockSyncTimer) {
    window.clearInterval(foliaClockSyncTimer);
    foliaClockSyncTimer = null;
  }
}

/** 把暂存的完整权威会话真正发给 Folia（桥就绪后调用）。 */
function deliverPendingFoliaSession() {
  if (!foliaPendingSession) return;
  const session = foliaPendingSession;
  foliaPendingSession = null;
  postToFolia({
    type: 'shizuki:follow-playback',
    session
  });
  startFoliaClockSync();
}

/** 从普通模式曲目对象中提取网易云 trackId。 */
function readFoliaTrackId(track) {
  if (!track) return 0;
  const rawId = String(track.trackId || track.id || track.track_id || '');
  const numeric = Number(rawId);
  if (Number.isFinite(numeric) && numeric > 0) return numeric;
  return 0;
}

/** 把 Folia 的轻量播放快照转换为站点播放器可解析的网易云曲目。 */
function normalizeFoliaPlaybackIntentTrack(rawTrack) {
  const trackId = String(rawTrack?.trackId || rawTrack?.track_id || rawTrack?.id || '').trim();
  if (!trackId) return null;
  const artists = Array.isArray(rawTrack?.artists)
    ? rawTrack.artists
      .map((artist) => (typeof artist === 'object' ? artist?.name : artist))
      .map((artist) => String(artist || '').trim())
      .filter(Boolean)
    : [];
  const durationMs = Number(rawTrack?.durationMs || rawTrack?.duration_ms || 0);
  const durationSec = Number.isFinite(durationMs) && durationMs > 0 ? durationMs / 1000 : null;
  const durationLabel = durationSec != null
    ? formatMediaTime(durationSec, { fallback: '--:--' })
    : '--:--';
  return {
    id: trackId,
    trackId,
    provider: String(rawTrack?.provider || 'netease').trim().toLowerCase() || 'netease',
    title: String(rawTrack?.name || rawTrack?.title || '').trim() || '未知标题',
    artist: artists.join(' / ') || String(rawTrack?.artist || '').trim() || '未知歌手',
    cover: String(rawTrack?.coverUrl || rawTrack?.cover || rawTrack?.cover_url || '').trim(),
    durationSec,
    duration: durationLabel,
    durationLabel,
    metadata: { folia: true, durationMs: Number.isFinite(durationMs) ? durationMs : 0 }
  };
}

let foliaPlaybackIntentVersion = 0;

/**
 * Folia 的选歌仅作为输入意图：站点播放器解析、播放并重新把快照推回 Folia。
 * 这样任一时刻都只有 usePlayerEngine.audioElement 产生声音。
 */
async function mirrorFoliaPlaybackIntent(data) {
  const track = normalizeFoliaPlaybackIntentTrack(data?.track);
  if (!track) return false;
  const intentVersion = ++foliaPlaybackIntentVersion;
  const requestedPositionMs = Math.max(0, Number(data?.positionMs || 0));
  const shouldPlay = data?.playing !== false;
  const currentTrackId = readFoliaTrackId(player.currentTrack.value);
  let played = true;

  if (currentTrackId !== readFoliaTrackId(track)) {
    // Folia is only a controller/view of the site-owned session. Replacing here
    // would collapse the current playlist to its selected track, so preserve the
    // existing queue just like a selection made from the normal music UI.
    played = await player.playExternalTrack?.(track, { replaceQueue: false });
  } else if (shouldPlay !== Boolean(player.isPlaying?.value)) {
    await player.togglePlay?.();
  }
  if (!played || intentVersion !== foliaPlaybackIntentVersion) return false;

  if (requestedPositionMs > 0) {
    player.seekToTime?.(requestedPositionMs / 1000);
  }
  if (!shouldPlay && player.isPlaying?.value) {
    await player.togglePlay?.();
  }
  await nextTick();
  if (intentVersion !== foliaPlaybackIntentVersion) return false;
  await pushCurrentTrackToFolia();
  return true;
}

async function applyFoliaPlaybackCommand(data) {
  if (!foliaMode.value) return;
  const action = String(data?.action || '').trim();
  const playing = Boolean(player.isPlaying?.value);
  if ((action === 'play' && !playing) || (action === 'pause' && playing)) {
    await player.togglePlay?.();
  } else if (action === 'seek') {
    const positionMs = Number(data?.positionMs || 0);
    if (Number.isFinite(positionMs) && positionMs >= 0) {
      player.seekToTime?.(positionMs / 1000);
    }
  } else if (action === 'next') {
    await player.playNext?.();
  } else if (action === 'previous') {
    await player.playPrev?.();
  } else {
    return;
  }
  await nextTick();
  await pushCurrentTrackToFolia();
}

/** 请求 Folia 回传当前播放状态。 */
function requestFoliaStatus() {
  postToFolia({ type: 'shizuki:get-status' });
}

function handleFoliaBridgeMessage(event) {
  const data = event.data;
  if (!data || typeof data !== 'object' || typeof data.type !== 'string') return;
  // 同文档 embed：忽略自己发出的消息（避免回声），只处理桥回包
  if (event.source === window && FOLIA_OUTBOUND_MESSAGE_TYPES.has(data.type)) {
    return;
  }
  if (data.type === 'shizuki:play-result') {
    if (data.ok && data.trackId) {
      // 播放成功：更新工具栏显示
    }
    return;
  }
  if (data.type === 'shizuki:playback-command') {
    void applyFoliaPlaybackCommand(data);
    return;
  }
  if (data.type === 'shizuki:playback-intent') {
    if (foliaMode.value) {
      void mirrorFoliaPlaybackIntent(data);
    }
    return;
  }
  if (data.type === 'shizuki:status') {
    if (data.track) {
      foliaTrackInfo.value = {
        name: String(data.track.name || ''),
        artist: Array.isArray(data.track.artists) ? data.track.artists.join(' / ') : ''
      };
    }
    // 点赞状态同步：Folia 的红心 → 普通模式红心（仅当明确给出且登录时）
    if (typeof data.liked === 'boolean' && data.track?.id && auth.isAuthenticated.value) {
      const trackId = String(data.track.id);
      const liked = Boolean(data.liked);
      const currentlyLiked = music.isTrackLiked?.(trackId);
      if (typeof music.isTrackLiked === 'function' && currentlyLiked !== liked) {
        // 尽力同步（网易云 like 与站点红心体系可能不同，静默失败）
        music.toggleTrackLike?.({ trackId, id: trackId, provider: 'netease', title: data.track.name || '' });
      }
    }
    return;
  }
  if (data.type === 'shizuki:cookie') {
    // Folia 侧登录的网易云 cookie 回传 → 保存到站点后端，两边账号统一
    const cookie = typeof data.cookie === 'string' ? data.cookie : '';
    void persistFoliaNeteaseCookie(cookie);
  }
}

/** 请求 Folia 把当前登录的网易云 cookie 回传（随后保存到后端）。 */
async function syncCookieBackFromFolia() {
  if (!auth.isAuthenticated.value) return false;
  const localCookie = readFoliaNeteaseCookie();
  if (localCookie) {
    // A transient backend write failure must not let an older server-side
    // credential overwrite the newer Folia login on this browser.
    await persistFoliaNeteaseCookie(localCookie);
    return true;
  }
  postToFolia({ type: 'shizuki:get-cookie' });
  return false;
}
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
const MUSIC_SEARCH_PROVIDER_VALUES = SEARCH_PROVIDER_OPTIONS.map((item) => String(item.value || '').trim().toLowerCase());
const DEFAULT_SEARCH_PROVIDERS = ['netease', 'kuwo', 'qq'];

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();
const player = usePlayerBridge();
const ui = useMusicLibraryUiState();

const centerPaneRef = ref(null);
const isMobileViewport = ref(false);
const providerRows = ref([]);
const voiceEntryVisible = ref(false);
const voiceAccessResolved = ref(false);
const voiceDeniedNoticeShown = ref(false);

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
const sidebarError = ref('');

const metingStatus = ref({ available: false, providers: ['netease', 'kuwo', 'qq'] });
const metingStatusBusy = ref(false);

const spotifyBound = ref(false);
const spotifyBusy = ref(false);
const spotifyQuery = ref('');
const spotifySearching = ref(false);
const spotifyResults = ref([]);
const spotifyError = ref('');
const musicSourceAccounts = ref({});
const musicSourceCookieInputs = ref({});
const musicSourceBusyMap = ref({});
const musicSourceImportBusyMap = ref({});
const musicSourceBindBusyMap = ref({});
const musicSourceBindSessions = ref({});
const musicSourceSyncResult = ref(null);
const musicSourceSyncError = ref('');
const musicSourceMode = ref('meting_first');
const musicAccountProviderOrder = ref(['netease', 'qqmusic', 'kugou']);

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
const searchPlaylistRowCapacity = ref(SEARCH_ALL_INITIAL_VISIBLE.playlists);
const searchAutoLoadLocked = ref(false);
const musicSearchHistory = ref([]);
const committedSearch = ref({
  keyword: '',
  type: 'all',
  providers: DEFAULT_SEARCH_PROVIDERS.slice()
});
const createDialogVisible = ref(false);
const createDialogSubmitting = ref(false);
const createDialogError = ref('');
const collectDialogVisible = ref(false);
const collectDialogTrack = ref(null);
const collectDialogError = ref('');
const collectDialogBusy = ref(false);
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
const isVoiceRoute = computed(() => route.name === 'music-library-voice' || route.name === 'music-library-voice-work');
const isMusicRoute = computed(() =>
  route.name === 'music-library-music' || route.name === 'music-library' || (!isPlaylistRoute.value && !isPlayerDetailRoute.value && !isVoiceRoute.value)
);
const currentCenterMode = computed(() => (isVoiceRoute.value ? 'voice' : 'music'));
const showMusicSearchToolbar = computed(() => currentCenterMode.value === 'music');
const currentPlaylistCodeFromRoute = computed(() => String(route.params.playlistCode || '').trim());

const currentPlaylistProfile = computed(() => {
  const raw = playlistBrowseProfile.value || {};
  return {
    playlistCode: String(raw.playlistCode || raw.playlist_code || DEFAULT_PLAYLIST_CODE),
    name: String(raw.name || '默认歌单'),
    description: String(raw.description || ''),
    cover: String(raw.cover || ''),
    trackCount: Number(raw.trackCount || raw.track_count || 0)
  };
});

const currentPlaylistAllTracks = computed(() => {
  const list = Array.isArray(playlistBrowseTracks.value) ? playlistBrowseTracks.value : [];
  return list;
});

const currentPlaylistTracks = computed(() => {
  const all = currentPlaylistAllTracks.value;
  if (!all.length) return [];
  const visible = Math.max(0, Number(playlistBrowseVisibleCount.value || 0));
  if (visible <= 0) {
    return all.slice(0, Math.min(all.length, PLAYLIST_BROWSE_INITIAL_VISIBLE));
  }
  return all.slice(0, visible);
});
const currentPlaylistHasMore = computed(() => currentPlaylistTracks.value.length < currentPlaylistAllTracks.value.length);
const currentPlaylistLoading = computed(() => Boolean(playlistBrowseLoading.value));
const currentPlaylistError = computed(() => String(playlistBrowseError.value || ''));
const playerQueueTracks = computed(() => (Array.isArray(player.tracks.value) ? player.tracks.value : []));
let allSearchCapacityRefreshTimer = 0;
const fatalErrorText = ref('');

const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((item) => String(item || '').trim().toUpperCase() === 'ADMIN');
});

const authState = computed(() => ({
  isAuthenticated: Boolean(auth.isAuthenticated.value),
  isAdmin: isAdminUser.value
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

const collectPlaylistTargets = computed(() =>
  buildCollectPlaylistTargets(createdPlaylists.value, collectedPlaylists.value, {
    excludedCodes: [DEFAULT_PLAYLIST_CODE]
  })
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

function setFatalError(error, fallback = '页面渲染异常，请刷新后重试') {
  fatalErrorText.value = parseErrorMessage(error, fallback);
  // eslint-disable-next-line no-console
  console.error('[MUSIC_PAGE_FATAL]', error);
}

function normalizeProviderVisibilityRow(raw) {
  return {
    provider: String(raw?.provider || raw?.providerCode || '').trim().toLowerCase(),
    enabled: Boolean(raw?.enabled),
    visible: Boolean(raw?.visible),
    sort: Number.isFinite(Number(raw?.sort)) ? Number(raw.sort) : 0
  };
}

function computeVoiceEntryVisible(rows) {
  const list = Array.isArray(rows) ? rows : [];
  const asmr = list.find((item) => String(item?.provider || '').trim().toLowerCase() === 'asmr');
  if (!asmr) return false;
  return Boolean(asmr.enabled) && Boolean(asmr.visible);
}

function normalizePlaylistSummary(raw, fallbackCode = DEFAULT_PLAYLIST_CODE) {
  return {
    playlistCode: String(raw?.playlistCode || raw?.playlist_code || fallbackCode || DEFAULT_PLAYLIST_CODE).trim(),
    name: String(raw?.name || '未命名歌单').trim() || '未命名歌单',
    description: String(raw?.description || '').trim(),
    cover: String(raw?.cover || raw?.coverUrl || raw?.cover_url || '').trim(),
    sourceProvider: String(
      raw?.sourceProvider || raw?.source_provider || raw?.provider || raw?.providerCode || raw?.provider_code || ''
    ).trim().toLowerCase(),
    playlistType: String(raw?.playlistType || raw?.playlist_type || '').trim(),
    ownerUserId: Number(raw?.ownerUserId || raw?.owner_user_id || 0),
    isPublic: Boolean(raw?.isPublic ?? raw?.is_public),
    trackCount: Number(raw?.trackCount || raw?.track_count || 0)
  };
}

function normalizeApiTrack(raw, index = 0) {
  const id = String(raw?.trackId || raw?.track_id || raw?.id || `track-${index + 1}`);
  const metadata = raw?.metadata && typeof raw.metadata === 'object' ? raw.metadata : {};
  const durationSec = readPositiveDurationSec(raw);
  const durationLabelRaw = readDurationLabel(raw);
  const durationLabel = durationLabelRaw || (durationSec != null ? formatMediaTime(durationSec, { fallback: '--:--' }) : '--:--');
  return {
    id,
    trackId: id,
    title: String(raw?.title || id),
    artist: String(raw?.artist || ''),
    album: String(raw?.album || metadata?.album || ''),
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

function toPlaylistTrackUpsertPayload(track, fallbackSort = 0, targetPlaylistCode = '') {
  const playlistCode = String(targetPlaylistCode || currentPlaylistProfile.value?.playlistCode || '').trim();
  return buildPlaylistTrackUpsertPayload(track, {
    fallbackSort,
    playlistCode,
    activeNav: ui.activeNav.value,
    hasActiveSearch: hasActiveSearch.value,
    isPlaylistRoute: isPlaylistRoute.value
  });
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
  const metadata = raw?.metadata && typeof raw.metadata === 'object' ? raw.metadata : {};
  const durationSec = readPositiveDurationSec(raw);
  const durationLabelRaw = readDurationLabel(raw);
  return {
    id: trackId,
    trackId,
    provider: String(raw?.provider || raw?.providerCode || raw?.provider_code || 'local').trim().toLowerCase() || 'local',
    title: String(raw?.title || '').trim() || '未知标题',
    artist: String(raw?.artist || '').trim() || '未知歌手',
    album: String(raw?.album || metadata?.album || '').trim(),
    cover: String(raw?.cover || raw?.coverUrl || raw?.cover_url || '').trim(),
    durationSec,
    durationLabel: durationLabelRaw || (durationSec != null ? formatMediaTime(durationSec, { fallback: '--:--' }) : '--:--'),
    duration: durationLabelRaw || (durationSec != null ? formatMediaTime(durationSec, { fallback: '--:--' }) : '--:--'),
    audio: String(raw?.audio || raw?.audioUrl || raw?.audio_url || '').trim(),
    lyric: String(raw?.lyric || raw?.lyricUrl || raw?.lyric_url || '').trim(),
    lyricText: String(raw?.lyricText || raw?.lyric_text || metadata?.lyricText || metadata?.lyric_text || '').trim(),
    metadata
  };
}

function normalizeSearchArtist(raw) {
  return {
    name: String(raw?.name || '').trim() || '未知歌手',
    hitCount: Number.isFinite(Number(raw?.hitCount ?? raw?.hit_count)) ? Number(raw.hitCount ?? raw.hit_count) : 0,
    providers: Array.isArray(raw?.providers) ? raw.providers.map((item) => String(item || '').trim()).filter(Boolean) : []
  };
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
    playlists: getAllPlaylistRequestLimit(),
    tracks: SEARCH_ALL_INITIAL_VISIBLE.tracks,
    artists: SEARCH_ALL_INITIAL_VISIBLE.artists
  };
}

function getAllPlaylistRequestLimit() {
  return normalizePlaylistRowCapacity(searchPlaylistRowCapacity.value, {
    min: SEARCH_ALL_PLAYLIST_MIN_CAPACITY,
    max: SEARCH_ALL_PLAYLIST_MAX_CAPACITY,
    fallback: SEARCH_ALL_INITIAL_VISIBLE.playlists
  });
}

function setSearchPlaylistRowCapacity(nextCapacity) {
  const normalized = normalizePlaylistRowCapacity(nextCapacity, {
    min: SEARCH_ALL_PLAYLIST_MIN_CAPACITY,
    max: SEARCH_ALL_PLAYLIST_MAX_CAPACITY,
    fallback: SEARCH_ALL_INITIAL_VISIBLE.playlists
  });
  if (normalized === searchPlaylistRowCapacity.value) return;
  searchPlaylistRowCapacity.value = normalized;
  searchAllVisibleCount.value = {
    ...searchAllVisibleCount.value,
    playlists: normalized
  };
  const isAllSearch = String(committedSearch.value.type || 'all').trim().toLowerCase() === 'all';
  if (!hasActiveSearch.value || !isAllSearch) return;
  if (searchLoading.value || searchLoadingMore.value || searchSectionLoading.value.playlists) return;
  if (allSearchCapacityRefreshTimer) {
    window.clearTimeout(allSearchCapacityRefreshTimer);
    allSearchCapacityRefreshTimer = 0;
  }
  allSearchCapacityRefreshTimer = window.setTimeout(() => {
    allSearchCapacityRefreshTimer = 0;
    runMusicSearch(committedSearch.value, { append: false, page: 1 });
  }, 180);
}

function resetPlaylistBrowseVisibleCount(totalCount = 0) {
  const safeTotal = Number.isFinite(Number(totalCount)) ? Math.max(0, Number(totalCount)) : 0;
  playlistBrowseVisibleCount.value = safeTotal > 0
    ? Math.max(1, Math.min(safeTotal, PLAYLIST_BROWSE_INITIAL_VISIBLE))
    : PLAYLIST_BROWSE_INITIAL_VISIBLE;
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
  const step = key === 'playlists'
    ? getAllPlaylistRequestLimit()
    : Number(SEARCH_ALL_INITIAL_VISIBLE[key] || 0);
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
  auth.redirectToAuth('session_expired', route.fullPath || '/music-library/music');
}

function requestMusicLogin() {
  goLogin();
}

function updateViewportMode() {
  if (typeof window === 'undefined') {
    isMobileViewport.value = false;
    return;
  }
  const viewportWidth = Number(window.innerWidth || document?.documentElement?.clientWidth || 0);
  const mobile = viewportWidth > 0 ? viewportWidth <= 900 : false;
  isMobileViewport.value = mobile;
  if (!mobile) {
    ui.closeDrawers();
  }
}

function getCenterPaneElement() {
  const target = centerPaneRef.value;
  if (!target) return null;
  if (target instanceof HTMLElement) return target;
  if (typeof target.getElement === 'function') {
    const element = target.getElement();
    if (element instanceof HTMLElement) return element;
  }
  if (target.el instanceof HTMLElement) return target.el;
  if (target.el?.value instanceof HTMLElement) return target.el.value;
  if (target.$el instanceof HTMLElement) return target.$el;
  return null;
}

function rememberCenterScroll() {
  if (isPlayerDetailRoute.value) return;
  const container = getCenterPaneElement();
  if (!container) return;
  ui.rememberScroll(route.fullPath, container.scrollTop || 0);
  maybeAutoLoadCurrentPlaylist();
  maybeAutoLoadNextSearchPage();
}

function restoreCenterScroll(path) {
  if (isPlayerDetailRoute.value) return;
  const container = getCenterPaneElement();
  if (!container) return;
  const top = ui.readScroll(path || route.fullPath);
  container.scrollTop = top;
}

function handleSelectNav(navKey) {
  const key = String(navKey || '').trim();
  if (!key) return;

  clearSearchState();
  ui.setActiveNav(key);
  ui.closeDrawers();
  if (!isMusicRoute.value) {
    router.push({ name: 'music-library-music' });
  }
}

function openMusicAuthorization() {
  ui.closeDrawers();
  router.push({ path: '/profile', query: { tab: 'account' } });
}

function notifyVoiceAccessDenied() {
  if (voiceDeniedNoticeShown.value) return;
  voiceDeniedNoticeShown.value = true;
  window.alert('当前账号无音声访问权限');
}

async function ensureVoiceRouteAccess(options = {}) {
  const notify = options?.notify !== false;
  if (!voiceAccessResolved.value) return;
  if (!isVoiceRoute.value) return;
  if (voiceEntryVisible.value) return;
  if (notify) {
    notifyVoiceAccessDenied();
  }
  await router.replace({
    name: 'music-library-music',
    query: {
      reason: 'voice_forbidden'
    }
  });
}

async function loadMusicProviderVisibility() {
  try {
    const payload = await musicApi.listMusicProviders(
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
    const rows = (Array.isArray(payload) ? payload : [])
      .map((item) => normalizeProviderVisibilityRow(item))
      .filter((item) => item.provider)
      .sort((left, right) => left.sort - right.sort);
    providerRows.value = rows;
    voiceEntryVisible.value = computeVoiceEntryVisible(rows);
  } catch {
    providerRows.value = [];
    voiceEntryVisible.value = false;
  } finally {
    voiceAccessResolved.value = true;
  }
  await ensureVoiceRouteAccess({ notify: false });
}

async function openCenterMode(mode) {
  const normalized = String(mode || '').trim().toLowerCase();
  if (normalized === 'voice') {
    if (!voiceEntryVisible.value) {
      notifyVoiceAccessDenied();
      return;
    }
    if (isVoiceRoute.value) return;
    rememberCenterScroll();
    ui.setLastContentPath(route.fullPath || '/music-library/music');
    await router.push({ name: 'music-library-voice' });
    return;
  }
  if (isMusicRoute.value) return;
  rememberCenterScroll();
  ui.setLastContentPath(route.fullPath || '/music-library/music');
  await router.push({ name: 'music-library-music' });
}

async function loadHomeData() {
  homeLoading.value = true;
  homeError.value = '';
  try {
    const payload = await musicApi.getMusicLibraryHome(
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
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
  const providers = [...new Set(
    input
      .map((item) => String(item || '').trim().toLowerCase())
      .filter((item) => item && MUSIC_SEARCH_PROVIDER_VALUES.includes(item))
  )];
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
  const isAllType = type === 'all';
  const providers = normalizeSearchProviderList(criteria?.providers);
  const allPlaylistLimit = getAllPlaylistRequestLimit();
  const allTrackLimit = SEARCH_ALL_INITIAL_VISIBLE.tracks;
  const allArtistLimit = SEARCH_ALL_INITIAL_VISIBLE.artists;
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

  if (append && isAllType) {
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
  const searchAuthorizedFetch = auth.isAuthenticated.value ? auth.authorizedFetch : undefined;
  try {
    if (!append && isAllType) {
      const [playlistsResponse, tracksResponse, artistsResponse] = await Promise.allSettled([
        musicApi.searchMusic(keyword, {
          type: 'playlist',
          providers,
          page: 1,
          limit: allPlaylistLimit
        }, searchAuthorizedFetch),
        musicApi.searchMusic(keyword, {
          type: 'track',
          providers,
          page: 1,
          limit: allTrackLimit
        }, searchAuthorizedFetch),
        musicApi.searchMusic(keyword, {
          type: 'artist',
          providers,
          page: 1,
          limit: allArtistLimit
        }, searchAuthorizedFetch)
      ]);

      const playlistsPayload = playlistsResponse.status === 'fulfilled' ? playlistsResponse.value : null;
      const tracksPayload = tracksResponse.status === 'fulfilled' ? tracksResponse.value : null;
      const artistsPayload = artistsResponse.status === 'fulfilled' ? artistsResponse.value : null;

      const playlists = Array.isArray(playlistsPayload?.playlists)
        ? playlistsPayload.playlists.map((item) => normalizeSearchPlaylist(item))
        : [];
      const tracks = Array.isArray(tracksPayload?.tracks)
        ? tracksPayload.tracks.map((item, index) => normalizeSearchTrack(item, index))
        : [];
      const artists = Array.isArray(artistsPayload?.artists)
        ? artistsPayload.artists.map((item) => normalizeSearchArtist(item))
        : [];

      const failedProviders = mergeUniqueBy(
        mergeUniqueBy(
          Array.isArray(playlistsPayload?.failedProviders || playlistsPayload?.failed_providers)
            ? (playlistsPayload.failedProviders || playlistsPayload.failed_providers).map((item) => String(item || '').trim()).filter(Boolean)
            : [],
          Array.isArray(tracksPayload?.failedProviders || tracksPayload?.failed_providers)
            ? (tracksPayload.failedProviders || tracksPayload.failed_providers).map((item) => String(item || '').trim()).filter(Boolean)
            : [],
          (item) => String(item || '').trim().toLowerCase()
        ),
        Array.isArray(artistsPayload?.failedProviders || artistsPayload?.failed_providers)
          ? (artistsPayload.failedProviders || artistsPayload.failed_providers).map((item) => String(item || '').trim()).filter(Boolean)
          : [],
        (item) => String(item || '').trim().toLowerCase()
      );
      const failedSections = [];
      if (playlistsResponse.status === 'rejected') failedSections.push('playlist');
      if (tracksResponse.status === 'rejected') failedSections.push('track');
      if (artistsResponse.status === 'rejected') failedSections.push('artist');
      const mergedFailedProviders = mergeUniqueBy(
        failedProviders,
        failedSections,
        (item) => String(item || '').trim().toLowerCase()
      );

      const anyRejected = playlistsResponse.status === 'rejected'
        || tracksResponse.status === 'rejected'
        || artistsResponse.status === 'rejected';

      const parsedPlaylistsHasMore = parseSearchHasMore(playlistsPayload || {}).playlists;
      const parsedTracksHasMore = parseSearchHasMore(tracksPayload || {}).tracks;
      const parsedArtistsHasMore = parseSearchHasMore(artistsPayload || {}).artists;

      const hydratedPlaylists = enrichSearchPlaylists(playlists, tracks);
      searchResult.value = {
        query: String(playlistsPayload?.query || tracksPayload?.query || artistsPayload?.query || keyword),
        type: 'all',
        partial: Boolean(playlistsPayload?.partial || tracksPayload?.partial || artistsPayload?.partial || anyRejected),
        failedProviders: mergedFailedProviders,
        playlists: hydratedPlaylists,
        tracks,
        artists
      };

      searchHasMore.value = {
        playlists: Boolean(parsedPlaylistsHasMore || playlists.length >= allPlaylistLimit),
        tracks: Boolean(parsedTracksHasMore || tracks.length >= allTrackLimit),
        artists: Boolean(parsedArtistsHasMore || artists.length >= allArtistLimit)
      };
      searchPage.value = 1;
      searchSectionPage.value = { playlists: 1, tracks: 1, artists: 1 };
      searchSectionError.value = { playlists: '', tracks: '', artists: '' };
      searchAllVisibleCount.value = {
        ...searchAllVisibleCount.value,
        playlists: allPlaylistLimit,
        tracks: allTrackLimit,
        artists: allArtistLimit
      };
      return;
    }

    const payload = await musicApi.searchMusic(keyword, {
      type,
      providers,
      page: targetPage,
      limit: SEARCH_PAGE_SIZE
    }, searchAuthorizedFetch);
    const normalizedTracks = Array.isArray(payload?.tracks)
      ? payload.tracks.map((item, index) => normalizeSearchTrack(item, index))
      : [];
    const normalizedPlaylists = Array.isArray(payload?.playlists)
      ? payload.playlists.map((item) => normalizeSearchPlaylist(item))
      : [];
    const normalized = {
      query: String(payload?.query || keyword),
      type: String(payload?.type || type || 'all'),
      partial: Boolean(payload?.partial),
      failedProviders: Array.isArray(payload?.failedProviders || payload?.failed_providers)
        ? (payload.failedProviders || payload.failed_providers).map((item) => String(item || '').trim()).filter(Boolean)
        : [],
      playlists: enrichSearchPlaylists(normalizedPlaylists, normalizedTracks),
      tracks: normalizedTracks,
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
  musicSearchHistory.value = recordMusicSearchHistory(committedSearch.value.keyword);
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

function applyMusicSearchHistory(keyword) {
  const normalized = String(keyword || '').trim();
  if (!normalized) return;
  ui.setGlobalSearchKeyword(normalized);
}

function clearMusicSearchHistoryRecords() {
  clearMusicSearchHistory();
  musicSearchHistory.value = [];
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
  const isAllType = String(committedSearch.value.type || 'all').toLowerCase() === 'all';
  if (!['playlists', 'tracks', 'artists'].includes(section)) return;
  if (searchSectionLoading.value[section]) return;
  const skipLocalGrow = isAllType && section === 'playlists';
  if (!forceFetch && !skipLocalGrow && growSearchAllVisibleCount(section)) return;
  if (!searchHasMore.value[section]) return;

  const nextPage = Math.max(1, Number(searchSectionPage.value[section] || 1) + 1);
  const queryType = resolveSearchTypeBySection(section);
  const sectionLimit = section === 'playlists' && isAllType ? getAllPlaylistRequestLimit() : SEARCH_PAGE_SIZE;
  const criteria = {
    keyword: committedSearch.value.keyword,
    type: queryType,
    providers: committedSearch.value.providers
  };

  searchSectionLoading.value = { ...searchSectionLoading.value, [section]: true };
  searchSectionError.value = { ...searchSectionError.value, [section]: '' };
  try {
    const searchAuthorizedFetch = auth.isAuthenticated.value ? auth.authorizedFetch : undefined;
    const payload = await musicApi.searchMusic(criteria.keyword, {
      type: criteria.type,
      providers: criteria.providers,
      page: nextPage,
      limit: sectionLimit
    }, searchAuthorizedFetch);
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
      nextSearchResult.playlists = isAllType
        ? playlists
        : mergeUniqueBy(
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
      nextHasMore.playlists = Boolean(parsedHasMore.playlists || playlists.length >= sectionLimit);
    } else if (section === 'artists') {
      nextHasMore.artists = Boolean(parsedHasMore.artists || artists.length >= SEARCH_PAGE_SIZE);
    } else {
      nextHasMore.tracks = Boolean(parsedHasMore.tracks || tracks.length >= SEARCH_PAGE_SIZE);
    }
    searchHasMore.value = nextHasMore;
    searchSectionPage.value = { ...searchSectionPage.value, [section]: nextPage };
    if (isAllType && section === 'playlists') {
      searchAllVisibleCount.value = {
        ...searchAllVisibleCount.value,
        playlists: sectionLimit
      };
    } else {
      growSearchAllVisibleCount(section);
    }
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
  const container = getCenterPaneElement();
  if (!container) return;
  if (playlistBrowseAutoLoadLocked.value) return;
  const visibleCount = Math.max(0, Number(playlistBrowseVisibleCount.value || 0));
  const triggerCount = Math.max(1, visibleCount - PLAYLIST_PREFETCH_GAP);
  const scrollProgress = container.scrollTop + container.clientHeight;
  const scrollRatio = scrollProgress / Math.max(1, container.scrollHeight);
  const reachedCount = Math.ceil(scrollRatio * visibleCount);
  if (reachedCount < triggerCount) return;

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
  const container = getCenterPaneElement();
  if (!container) return;
  if (searchAutoLoadLocked.value) return;
  const loadedCount = getSearchLoadedCountByType(normalizedType);
  if (loadedCount <= 0) return;
  const triggerCount = Math.max(1, loadedCount - Math.floor(SEARCH_PAGE_SIZE * 0.4));
  const scrollProgress = container.scrollTop + container.clientHeight;
  const scrollRatio = scrollProgress / Math.max(1, container.scrollHeight);
  const reachedCount = Math.ceil(scrollRatio * loadedCount);
  if (reachedCount < triggerCount) return;

  searchAutoLoadLocked.value = true;
  loadMoreMusicSearch().finally(() => {
    searchAutoLoadLocked.value = false;
  });
}

async function loadSidebarData() {
  if (!auth.isAuthenticated.value) {
    sidebarError.value = '';
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
    return true;
  }

  try {
    sidebarError.value = '';
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
    return true;
  } catch (error) {
    sidebarError.value = parseErrorMessage(error, '歌单加载失败，请重试');
    return false;
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

async function loadMetingStatus() {
  metingStatusBusy.value = true;
  try {
    const payload = await musicApi.getMetingStatus(
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
    metingStatus.value = {
      available: Boolean(payload?.available),
      providers: Array.isArray(payload?.providers) ? payload.providers : ['netease', 'kuwo', 'qq']
    };
  } catch {
    metingStatus.value = { available: false, providers: ['netease', 'kuwo', 'qq'] };
  } finally {
    metingStatusBusy.value = false;
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

async function loadMusicSourcePreference() {
  if (!auth.isAuthenticated.value) {
    musicSourceMode.value = 'meting_first';
    musicAccountProviderOrder.value = SOURCE_ACCOUNT_PROVIDERS.slice();
    return;
  }
  try {
    const payload = await auth.getPreference();
    const musicNode = payload?.music && typeof payload.music === 'object' ? payload.music : {};
    const modeRaw = payload?.['music.source_mode'] || musicNode?.source_mode;
    const orderRaw = payload?.['music.account_provider_order'] || musicNode?.account_provider_order;
    musicSourceMode.value = normalizeMusicSourceModeValue(modeRaw);
    musicAccountProviderOrder.value = normalizeSourceProviderOrder(orderRaw);
  } catch {
    musicSourceMode.value = 'meting_first';
    musicAccountProviderOrder.value = SOURCE_ACCOUNT_PROVIDERS.slice();
  }
}

async function persistMusicSourcePreference() {
  if (!auth.isAuthenticated.value) return;
  try {
    const payload = await auth.getPreference();
    const nextPreference = payload && typeof payload === 'object' ? { ...payload } : {};
    const nextMusic = nextPreference.music && typeof nextPreference.music === 'object'
      ? { ...nextPreference.music }
      : {};
    nextMusic.source_mode = musicSourceMode.value;
    nextMusic.account_provider_order = musicAccountProviderOrder.value.slice();
    nextPreference.music = nextMusic;
    nextPreference['music.source_mode'] = musicSourceMode.value;
    nextPreference['music.account_provider_order'] = musicAccountProviderOrder.value.slice();
    await auth.updatePreference(nextPreference);
  } catch (error) {
    window.alert(parseErrorMessage(error, '保存音乐源策略失败'));
  }
}

async function loadMusicSourceAccountsStatus() {
  if (!auth.isAuthenticated.value) {
    musicSourceAccounts.value = {};
    musicSourceCookieInputs.value = {};
    musicSourceBusyMap.value = {};
    musicSourceImportBusyMap.value = {};
    musicSourceBindBusyMap.value = {};
    musicSourceBindSessions.value = {};
    musicSourceSyncResult.value = null;
    musicSourceSyncError.value = '';
    return;
  }
  try {
    const payload = await musicApi.getMusicSourceAccountStatus(auth.authorizedFetch);
    const rows = Array.isArray(payload) ? payload : [];
    const statusMap = {};
    const inputMap = {};
    rows.forEach((item) => {
      const normalized = normalizeSourceAccountStatus(item);
      if (!normalized.provider) return;
      statusMap[normalized.provider] = normalized;
      inputMap[normalized.provider] = '';
    });
    SOURCE_ACCOUNT_PROVIDERS.forEach((provider) => {
      if (!statusMap[provider]) {
        statusMap[provider] = normalizeSourceAccountStatus({}, provider);
      }
      if (!Object.prototype.hasOwnProperty.call(inputMap, provider)) {
        inputMap[provider] = '';
      }
    });
    musicSourceAccounts.value = statusMap;
    musicSourceCookieInputs.value = inputMap;
  } catch {
    musicSourceAccounts.value = {};
  }
}

async function handleDetectMusicSourceHelper() {
  window.alert('请前往个人资料页完成音乐扫码绑定');
}

function handleOpenMusicSourceHelperGuide() {
  openMusicAuthorization();
}

async function handleBindMusicSourceAccount(provider) {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  const normalizedProvider = String(provider || '').trim().toLowerCase();
  if (!SOURCE_ACCOUNT_PROVIDERS.includes(normalizedProvider)) return;

  musicSourceBindBusyMap.value = {
    ...musicSourceBindBusyMap.value,
    [normalizedProvider]: true
  };

  try {
    const session = normalizeMusicSourceBindSession(
      await musicApi.createMusicSourceBindSession(normalizedProvider, auth.authorizedFetch),
      normalizedProvider
    );
    musicSourceBindSessions.value = {
      ...musicSourceBindSessions.value,
      [normalizedProvider]: session
    };

    const expiresAtMs = Date.parse(String(session?.expiresAt || ''));
    let currentSession = session;
    let lastErrorMessage = '';

    while (!isTerminalMusicSourceBindSession(currentSession)) {
      if (Number.isFinite(expiresAtMs) && Date.now() >= expiresAtMs) {
        currentSession = mergeMusicSourceBindSession(currentSession, {
          status: 'EXPIRED',
          qrStatus: 'EXPIRED',
          failureReason: '二维码已过期，请重新发起绑定'
        }, normalizedProvider);
        musicSourceBindSessions.value = {
          ...musicSourceBindSessions.value,
          [normalizedProvider]: currentSession
        };
        break;
      }
      try {
        currentSession = mergeMusicSourceBindSession(
          currentSession,
          await musicApi.getMusicSourceBindSession(
            normalizedProvider,
            String(currentSession?.sessionId || ''),
            auth.authorizedFetch
          ),
          normalizedProvider
        );
        musicSourceBindSessions.value = {
          ...musicSourceBindSessions.value,
          [normalizedProvider]: currentSession
        };
      } catch (error) {
        lastErrorMessage = parseErrorMessage(error, '');
      }

      if (isTerminalMusicSourceBindSession(currentSession)) {
        break;
      }
      await waitForMusicSourceBind(resolveMusicSourceBindPollIntervalMs(currentSession, 1800));
    }

    if (String(currentSession?.status || '').trim().toUpperCase() === 'COMPLETED') {
      await loadMusicSourceAccountsStatus();
      musicSourceBindSessions.value = {
        ...musicSourceBindSessions.value,
        [normalizedProvider]: {}
      };
      return;
    }

    window.alert(
      String(currentSession?.failureReason || '').trim()
      || lastErrorMessage
      || describeMusicSourceQrBindSession(currentSession, normalizedProvider)
    );
  } catch (error) {
    window.alert(parseErrorMessage(error, '打开二维码绑定失败'));
  } finally {
    musicSourceBindBusyMap.value = {
      ...musicSourceBindBusyMap.value,
      [normalizedProvider]: false
    };
  }
}

function handleUpdateMusicSourceMode(mode) {
  musicSourceMode.value = normalizeMusicSourceModeValue(mode);
  persistMusicSourcePreference();
}

function handleMoveMusicSourceProvider(payload) {
  const provider = String(payload?.provider || '').trim().toLowerCase();
  const direction = String(payload?.direction || '').trim().toLowerCase();
  if (!SOURCE_ACCOUNT_PROVIDERS.includes(provider)) return;
  const order = normalizeSourceProviderOrder(musicAccountProviderOrder.value);
  const index = order.indexOf(provider);
  if (index < 0) return;
  const delta = direction === 'down' ? 1 : -1;
  const target = Math.max(0, Math.min(order.length - 1, index + delta));
  if (target === index) return;
  const next = order.slice();
  const [item] = next.splice(index, 1);
  next.splice(target, 0, item);
  musicAccountProviderOrder.value = next;
  persistMusicSourcePreference();
}

function handleUpdateMusicSourceCookieInput(payload) {
  const provider = String(payload?.provider || '').trim().toLowerCase();
  if (!SOURCE_ACCOUNT_PROVIDERS.includes(provider)) return;
  musicSourceCookieInputs.value = {
    ...musicSourceCookieInputs.value,
    [provider]: String(payload?.value || '')
  };
}

async function handleSaveMusicSourceCookie(provider) {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  const normalizedProvider = String(provider || '').trim().toLowerCase();
  if (!SOURCE_ACCOUNT_PROVIDERS.includes(normalizedProvider)) return;
  const cookie = String(musicSourceCookieInputs.value?.[normalizedProvider] || '').trim();
  if (!cookie) {
    window.alert('请先输入 Cookie');
    return;
  }
  musicSourceBusyMap.value = { ...musicSourceBusyMap.value, [normalizedProvider]: true };
  try {
    const payload = await musicApi.upsertMusicSourceAccountCookie(normalizedProvider, cookie, auth.authorizedFetch);
    const nextStatus = normalizeSourceAccountStatus(payload, normalizedProvider);
    musicSourceAccounts.value = {
      ...musicSourceAccounts.value,
      [normalizedProvider]: nextStatus
    };
    musicSourceCookieInputs.value = {
      ...musicSourceCookieInputs.value,
      [normalizedProvider]: ''
    };
  } catch (error) {
    window.alert(parseErrorMessage(error, '保存 Cookie 失败'));
  } finally {
    musicSourceBusyMap.value = { ...musicSourceBusyMap.value, [normalizedProvider]: false };
  }
}

async function handleDeleteMusicSourceCookie(provider) {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  const normalizedProvider = String(provider || '').trim().toLowerCase();
  if (!SOURCE_ACCOUNT_PROVIDERS.includes(normalizedProvider)) return;
  musicSourceBusyMap.value = { ...musicSourceBusyMap.value, [normalizedProvider]: true };
  try {
    await musicApi.deleteMusicSourceAccount(normalizedProvider, auth.authorizedFetch);
    musicSourceAccounts.value = {
      ...musicSourceAccounts.value,
      [normalizedProvider]: normalizeSourceAccountStatus({}, normalizedProvider)
    };
    musicSourceCookieInputs.value = {
      ...musicSourceCookieInputs.value,
      [normalizedProvider]: ''
    };
  } catch (error) {
    window.alert(parseErrorMessage(error, '删除 Cookie 失败'));
  } finally {
    musicSourceBusyMap.value = { ...musicSourceBusyMap.value, [normalizedProvider]: false };
  }
}

async function handleImportMusicSourcePlaylists(provider) {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  const normalizedProvider = String(provider || '').trim().toLowerCase();
  if (!SOURCE_ACCOUNT_PROVIDERS.includes(normalizedProvider)) return;
  musicSourceSyncError.value = '';
  musicSourceSyncResult.value = null;
  musicSourceImportBusyMap.value = { ...musicSourceImportBusyMap.value, [normalizedProvider]: true };
  try {
    const payload = await musicApi.importMusicSourcePlaylists(normalizedProvider, auth.authorizedFetch);
    const result = {
      provider: normalizedProvider,
      importedPlaylists: Math.max(0, Number(payload?.importedPlaylists ?? payload?.imported_playlists ?? 0) || 0),
      importedTracks: Math.max(0, Number(payload?.importedTracks ?? payload?.imported_tracks ?? 0) || 0),
      skippedPlaylists: Math.max(0, Number(payload?.skippedPlaylists ?? payload?.skipped_playlists ?? 0) || 0),
      failedPlaylists: Math.max(0, Number(payload?.failedPlaylists ?? payload?.failed_playlists ?? 0) || 0),
      syncedAt: new Date().toISOString()
    };
    musicSourceSyncResult.value = result;
    if (result.importedPlaylists === 0 && result.failedPlaylists > 0) {
      musicSourceSyncError.value = '本次没有导入任何歌单，所有歌单均同步失败，请重试';
    } else if (
      result.importedPlaylists === 0
      && result.importedTracks === 0
      && result.skippedPlaylists === 0
      && result.failedPlaylists === 0
    ) {
      musicSourceSyncError.value = '网易云没有返回可同步歌单，请重新绑定账号后重试';
    }
    const sidebarLoaded = await loadSidebarData();
    if (!sidebarLoaded) {
      musicSourceSyncError.value = sidebarError.value || '歌单已同步，但列表刷新失败，请重试';
    }
    return result;
  } catch (error) {
    musicSourceSyncError.value = parseErrorMessage(error, '同步歌单失败，请稍后重试');
  } finally {
    musicSourceImportBusyMap.value = { ...musicSourceImportBusyMap.value, [normalizedProvider]: false };
  }
}

async function handleBindSpotify() {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return;
  }
  spotifyBusy.value = true;
  try {
    await auth.startOAuthBind('spotify', '/music-library/music');
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
      durationSec: readPositiveDurationSec(item),
      playbackKind: 'preview',
      isPreview: true,
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
    resetPlaylistBrowseVisibleCount(tracks.length);
    // Keep this lightweight line log for runtime troubleshooting in browser console.
    // eslint-disable-next-line no-console
    console.info('[MUSIC_FRONT_PLAYLIST_BUNDLE_LOADED]', {
      playlistCode,
      loadedTracks: tracks.length,
      visibleTracks: playlistBrowseVisibleCount.value,
      firstTrack: tracks[0] ? {
        trackId: tracks[0].trackId,
        provider: tracks[0].provider,
        title: tracks[0].title
      } : null
    });
  } catch (error) {
    playlistBrowseProfile.value = normalizePlaylistSummary(
      { playlistCode, name: '歌单加载失败', description: '', cover: '' },
      playlistCode
    );
    playlistBrowseTracks.value = [];
    playlistBrowseError.value = parseErrorMessage(error, '歌单加载失败，请稍后重试');
    resetPlaylistBrowseVisibleCount(0);
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

async function enqueueFeaturedTrackNext(item, index) {
  const success = await player.enqueueNextTrack?.(normalizeApiTrack(item, Number(index) || 0));
  if (!success) {
    window.alert('当前曲目暂不可加入“下一首播放”');
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

async function collectTrackToPlaylist(trackInput, rawPlaylistCode, options = {}) {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return false;
  }
  const playlistCode = String(rawPlaylistCode || '').trim();
  if (!playlistCode) {
    window.alert('请选择一个目标歌单');
    return false;
  }

  const currentTrack = trackInput || player.currentTrack.value;
  if (!currentTrack) {
    window.alert('当前没有可收藏的歌曲');
    return false;
  }

  try {
    await musicApi.upsertMyMusicPlaylistTrack(
      playlistCode,
      toPlaylistTrackUpsertPayload(currentTrack, playerQueueTracks.value.length + 1, playlistCode),
      auth.authorizedFetch
    );
    if (options?.silent !== true) {
      window.alert('已收藏到歌单');
    }
    if (isPlaylistRoute.value && currentPlaylistProfile.value.playlistCode === playlistCode) {
      await ensureCurrentRoutePlaylistLoaded({ force: true });
    }
    return true;
  } catch (error) {
    window.alert(parseErrorMessage(error, '收藏歌曲失败，请稍后重试'));
    return false;
  }
}

async function collectTrackToDefaultPublic(trackInput) {
  if (!auth.isAuthenticated.value) {
    goLogin();
    return false;
  }
  if (!isAdminUser.value) {
    window.alert('仅管理员可写入默认收藏夹');
    return false;
  }
  const currentTrack = trackInput || player.currentTrack.value;
  if (!currentTrack) {
    window.alert('当前没有可收藏的歌曲');
    return false;
  }
  try {
    await musicApi.upsertAdminDefaultPlaylistTrack(
      toPlaylistTrackUpsertPayload(currentTrack, playerQueueTracks.value.length + 1, DEFAULT_PLAYLIST_CODE),
      auth.authorizedFetch
    );
    window.alert('已加入默认收藏夹（云端）');
    if (isPlaylistRoute.value && currentPlaylistProfile.value.playlistCode === DEFAULT_PLAYLIST_CODE) {
      await ensureCurrentRoutePlaylistLoaded({ force: true });
    }
    return true;
  } catch (error) {
    window.alert(parseErrorMessage(error, '加入默认收藏夹失败，请稍后重试'));
    return false;
  }
}

function openCollectDialog(trackInput) {
  if (!auth.isAuthenticated.value) {
    requestMusicLogin();
    return;
  }
  const currentTrack = trackInput || player.currentTrack.value;
  if (!currentTrack) {
    window.alert('当前没有可收藏的歌曲');
    return;
  }
  collectDialogTrack.value = currentTrack;
  collectDialogError.value = '';
  collectDialogVisible.value = true;
}

function closeCollectDialog() {
  collectDialogVisible.value = false;
  collectDialogError.value = '';
  collectDialogTrack.value = null;
}

async function handleCollectDialogSelect(playlistCode) {
  collectDialogBusy.value = true;
  try {
    const ok = await collectTrackToPlaylist(collectDialogTrack.value, playlistCode, { silent: true });
    if (ok) {
      collectDialogVisible.value = false;
      return;
    }
    collectDialogError.value = '收藏失败，请稍后重试';
  } catch (error) {
    collectDialogError.value = parseErrorMessage(error, '收藏歌曲失败，请稍后重试');
  } finally {
    collectDialogBusy.value = false;
  }
}

async function handleCollectDialogDefaultPublic() {
  collectDialogBusy.value = true;
  try {
    const ok = await collectTrackToDefaultPublic(collectDialogTrack.value);
    if (ok) {
      collectDialogVisible.value = false;
      return;
    }
    collectDialogError.value = '加入默认收藏夹失败，请稍后重试';
  } catch (error) {
    collectDialogError.value = parseErrorMessage(error, '加入默认收藏夹失败，请稍后重试');
  } finally {
    collectDialogBusy.value = false;
  }
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
        toPlaylistTrackUpsertPayload(trackInput, next.size, likedPlaylistCode.value),
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
  rememberCenterScroll();
  ui.setLastContentPath(route.fullPath || '/music-library/music');
  ui.setSelectedPlaylistCode(code);
  ui.closeDrawers();
  router.push({
    name: 'music-library-playlist',
    params: { playlistCode: code }
  });
}

function backToMainList() {
  ui.closeDrawers();
  const target = String(ui.lastContentPath.value || '').trim();
  if (target.startsWith('/music-library') && target !== route.fullPath) {
    router.push(target);
    return;
  }
  router.push({ name: 'music-library-music' });
}

function enterPlayerDetail() {
  ui.setLastContentPath(route.fullPath || '/music-library/music');
  ui.closeDrawers();
  router.push({
    name: 'music-library-player',
    query: {
      from: encodeURIComponent(route.fullPath || '/music-library/music')
    }
  });
}

function exitPlayerDetail() {
  const from = typeof route.query?.from === 'string' ? decodeURIComponent(route.query.from) : '';
  const target = from.startsWith('/music-library') ? from : ui.lastContentPath.value;
  router.push(target || '/music-library/music');
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
  collectDialogVisible.value = false;
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
  if (typeof window !== 'undefined') {
    window.dispatchEvent(
      new CustomEvent('shizuki:music:eq-change', {
        detail: {
          levels: Array.isArray(ui.eqLevels.value) ? ui.eqLevels.value.slice() : []
        }
      })
    );
  }
}

const musicContext = Object.freeze({
  player,
  ui,
  authState,
  currentCenterMode,
  voiceEntryVisible,
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
  searchPlaylistRowCapacity,
  hasActiveSearch,
  createdPlaylists,
  collectedPlaylists,
  musicSourceAccounts,
  musicSourceBindSessions,
  musicSourceBindBusyMap,
  musicSourceImportBusyMap,
  musicSourceSyncResult,
  musicSourceSyncError,
  collectPlaylistTargets,
  currentPlaylistProfile,
  currentPlaylistAllTracks,
  currentPlaylistTracks,
  currentPlaylistHasMore,
  currentPlaylistLoading,
  currentPlaylistError,
  collectingPlaylist,
  isCurrentPlaylistCollected,
  requestMusicLogin,
  bindMusicSourceAccount: handleBindMusicSourceAccount,
  importMusicSourcePlaylists: handleImportMusicSourcePlaylists,
  refreshMusicSourceAccounts: loadMusicSourceAccountsStatus,
  openMusicAuthorization,
  reloadHomeData: loadHomeData,
  triggerMusicSearch,
  setSearchPlaylistRowCapacity,
  loadMoreMusicSearch,
  loadMoreMusicSearchSection,
  retryMusicSearchLoadMore,
  reloadCurrentPlaylist,
  ensureVoiceRouteAccess,
  openCenterMode,
  loadMoreCurrentPlaylistTracks,
  openPlaylistDetail,
  backToMainList,
  enterPlayerDetail,
  exitPlayerDetail,
  playFeaturedTrack,
  enqueueFeaturedTrackNext,
  playSearchTrack,
  enqueueSearchTrackNext,
  playTrackInCurrentPlaylist,
  toggleCollectCurrentPlaylist,
  collectTrackToPlaylist,
  collectTrackToDefaultPublic,
  openCollectDialog,
  toggleTrackLike,
  isTrackLiked
});

provide(MUSIC_LIBRARY_CONTEXT_KEY, musicContext);

watch(
  () => route.fullPath,
  async (nextPath) => {
    if (!isPlayerDetailRoute.value) {
      if (!isPlaylistRoute.value) {
        ui.setLastContentPath(nextPath);
      }
      await nextTick();
      restoreCenterScroll(nextPath);
    }
  },
  { immediate: true }
);

watch(
  () => [voiceAccessResolved.value, voiceEntryVisible.value, route.name],
  async () => {
    await ensureVoiceRouteAccess({ notify: false });
  },
  { immediate: true }
);

watch(
  () => route.query?.reason,
  (reason) => {
    if (String(reason || '').trim() === 'voice_forbidden') {
      notifyVoiceAccessDenied();
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
  [
    () => readFoliaTrackId(player.currentTrack.value),
    () => (Array.isArray(player.tracks?.value) ? player.tracks.value.map((track) => [
      track?.queueEntryId,
      track?.trackId || track?.id,
      track?.title,
      track?.artist,
      track?.cover,
      track?.playableDurationSec || track?.durationSec
    ]).join('|') : ''),
    () => {
      const profile = player.playlistProfile?.value || {};
      return [profile.playlistCode || profile.playlist_code, profile.name, profile.cover, profile.description].join('|');
    },
    () => (Array.isArray(player.lyricTimeline?.value) ? player.lyricTimeline.value.map((entry) => [
      entry?.time,
      entry?.endTime,
      entry?.original,
      entry?.translation,
      entry?.furigana,
      Array.isArray(entry?.words) ? entry.words.map((word) => [word?.time, word?.endTime, word?.text].join(',')).join(';') : ''
    ].join('|')).join('||') : ''),
    () => Number(player.currentLyricEntryIndex?.value ?? -1),
    () => String(player.lyricRenderMode?.value || 'original'),
    () => Number(player.duration?.value || 0),
    () => Boolean(player.isPlaying?.value)
  ],
  () => {
    if (foliaMode.value) void pushCurrentTrackToFolia();
  },
  { flush: 'post' }
);

watch(
  () => {
    const wallpaper = resolveFoliaWallpaper();
    return [wallpaper.source, wallpaper.preview, wallpaper.isDynamic];
  },
  () => {
    if (foliaMode.value && foliaBridgeReady) syncHomeWallpaperToFolia();
  },
  { immediate: true }
);

watch(
  () => auth.isAuthenticated.value,
  async () => {
    await Promise.all([
      loadHomeData(),
      loadMusicProviderVisibility(),
      loadSidebarData(),
      loadMetingStatus(),
      loadSpotifyBindingStatus(),
      loadMusicSourcePreference(),
      loadMusicSourceAccountsStatus()
    ]);
    await ensureCurrentRoutePlaylistLoaded();
  }
);

async function handleFoliaPlayRequest(event) {
  const track = event?.detail?.track;
  if (!track) return;
  const trackId = readFoliaTrackId(track);
  foliaTrackInfo.value = {
    name: String(track.title || track.name || ''),
    artist: String(track.artist || '')
  };
  if (!foliaMode.value) {
    setFoliaMode(true, { syncPlayback: false });
  }
  const currentTrackId = readFoliaTrackId(player.currentTrack.value);
  if (trackId && trackId !== currentTrackId) {
    const played = await player.playExternalTrack?.(track, { replaceQueue: false });
    if (!played) return;
  }
  await nextTick();
  await pushCurrentTrackToFolia();
}

function handleOpenFoliaMode(event) {
  const track = event?.detail?.track || null;
  if (track) {
    void handleFoliaPlayRequest(event);
    return;
  }
  if (!foliaMode.value) {
    setFoliaMode(true);
  }
}

/** 视图级沉浸切换：歌词沉浸 / 歌单大屏 → Folia lattice 视图。 */
async function handleOpenFoliaLattice(event) {
  const view = String(event?.detail?.view || 'lattice').trim();
  const track = event?.detail?.track || null;
  const requestedTracks = Array.isArray(event?.detail?.tracks) ? event.detail.tracks.filter(Boolean) : [];
  const requestedPlaylist = event?.detail?.playlist && typeof event.detail.playlist === 'object'
    ? event.detail.playlist
    : null;
  const trackIds = (Array.isArray(event?.detail?.trackIds) ? event.detail.trackIds : [])
    .map((id) => Number(id))
    .filter((id) => Number.isFinite(id) && id > 0);
  if (!foliaMode.value) {
    setFoliaMode(true, { syncPlayback: !track && !trackIds.length && !requestedTracks.length });
  }
  // 等桥就绪后切 Folia 视图（重试至多 5s）
  const applyView = (attempts = 0) => {
    if (foliaBridgeReady) {
      postToFolia({ type: 'shizuki:set-view', view: view === 'player' ? 'player' : 'lattice' });
      return;
    }
    if (attempts < 16) {
      window.setTimeout(() => applyView(attempts + 1), 300);
    }
  };
  applyView();
  if (track) {
    await handleFoliaPlayRequest(event);
    return;
  }
  if (requestedTracks.length) {
    const replaced = await player.replaceQueueWithTracks?.(requestedTracks, 0, true, {
      sourceCode: String(requestedPlaylist?.playlistCode || requestedPlaylist?.playlist_code || ''),
      sourceName: String(requestedPlaylist?.name || ''),
      sourceType: 'folia-playlist-view'
    });
    if (!replaced) return;
  }
  if (trackIds.length) {
    const queueByTrackId = new Map(
      playerQueueTracks.value
        .map((item) => [readFoliaTrackId(item), item])
        .filter(([id]) => id > 0)
    );
    const requestedTracks = trackIds.map((id) => queueByTrackId.get(id)).filter(Boolean);
    if (requestedTracks.length) {
      const replaced = await player.replaceQueueWithTracks?.(requestedTracks, 0, true, {
        sourceCode: player.playlistProfile?.value?.playlistCode || '',
        sourceName: player.playlistProfile?.value?.name || '',
        sourceType: 'folia-lattice'
      });
      if (!replaced) return;
    }
  }
  await nextTick();
  await pushCurrentTrackToFolia();
}

onMounted(async () => {
  try {
    await auth.ensureReady();
    ui.setExpandedProvider('');
    updateViewportMode();
    musicSearchHistory.value = readMusicSearchHistory();
    if (typeof window !== 'undefined') {
      window.addEventListener('resize', updateViewportMode, { passive: true });
      window.addEventListener('message', handleFoliaBridgeMessage);
      window.addEventListener('shizuki:play-in-folia', handleFoliaPlayRequest);
      window.addEventListener('shizuki:open-folia-mode', handleOpenFoliaMode);
      window.addEventListener('shizuki:open-folia-lattice', handleOpenFoliaLattice);
    }
    if (foliaMode.value) {
      await nextTick();
      void loadFoliaEmbed().then(() => pushCurrentTrackToFolia()).catch(() => {});
    }

    await Promise.all([
      loadHomeData(),
      loadMusicProviderVisibility(),
      loadSidebarData(),
      loadMetingStatus(),
      loadSpotifyBindingStatus(),
      loadMusicSourcePreference(),
      loadMusicSourceAccountsStatus(),
      ensureCurrentRoutePlaylistLoaded()
    ]);

    await nextTick();
    restoreCenterScroll(route.fullPath);
    if (!foliaMode.value) scheduleFoliaWarmup();
  } catch (error) {
    setFatalError(error, '初始化失败，请稍后重试');
  }
});

onErrorCaptured((error, instance, info) => {
  const componentName = String(instance?.type?.name || 'unknown');
  setFatalError(error, `渲染阶段异常（${componentName} / ${String(info || 'unknown')}）`);
  return false;
});

async function reloadAfterFatalError() {
  fatalErrorText.value = '';
  await Promise.all([
    loadHomeData(),
    loadMusicProviderVisibility(),
    loadSidebarData(),
    loadMetingStatus(),
    loadSpotifyBindingStatus(),
    loadMusicSourcePreference(),
    loadMusicSourceAccountsStatus(),
    ensureCurrentRoutePlaylistLoaded({ force: true })
  ]);
}

onBeforeUnmount(() => {
  cancelFoliaWarmup();
  stopFoliaClockSync();
  postToFolia({ type: 'shizuki:stop-follow-playback' });
  parkFoliaEmbed();
  if (allSearchCapacityRefreshTimer) {
    window.clearTimeout(allSearchCapacityRefreshTimer);
    allSearchCapacityRefreshTimer = 0;
  }
  if (typeof window !== 'undefined') {
    window.removeEventListener('resize', updateViewportMode);
    window.removeEventListener('message', handleFoliaBridgeMessage);
    window.removeEventListener('shizuki:play-in-folia', handleFoliaPlayRequest);
    window.removeEventListener('shizuki:open-folia-mode', handleOpenFoliaMode);
    window.removeEventListener('shizuki:open-folia-lattice', handleOpenFoliaLattice);
  }
});
</script>

<style scoped>
.music-library-page {
  position: relative;
  min-height: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}

.music-library-page.folia-mode-active {
  min-height: 100%;
  display: flex;
  flex-direction: column;
}

.folia-embed-pane {
  position: relative;
  flex: 1 1 auto;
  width: 100%;
  height: 100%;
  min-height: 0;
  border-radius: 14px;
  overflow: hidden;
  border: 1px solid var(--theme-border);
  background: #0b0e14;
  box-shadow: 0 16px 40px rgba(0, 0, 0, 0.35);
  display: flex;
  flex-direction: column;
  isolation: isolate;
}

.folia-embed-pane[data-folia-wallpaper='active']::before {
  content: '';
  position: absolute;
  inset: -24px;
  z-index: 0;
  pointer-events: none;
  background-image: var(--folia-ambient-wallpaper-image);
  background-position: center;
  background-size: cover;
  background-repeat: no-repeat;
  filter: blur(22px) saturate(0.82) brightness(0.72);
  transform: scale(1.08);
  opacity: 0.92;
}

.folia-embed-pane:fullscreen {
  width: 100%;
  height: 100%;
  border: 0;
  border-radius: 0;
  background: #0b0e14;
}

.folia-embed-pane[data-folia-wallpaper='active']:fullscreen::before {
  inset: 0;
  filter: none;
  transform: none;
  opacity: 1;
}

.folia-embed-pane.folia-embed-visible {
  position: relative;
  opacity: 1;
  visibility: visible;
  pointer-events: auto;
  z-index: 2;
}

.folia-embed-pane.folia-embed-hidden {
  position: absolute;
  inset: 0;
  opacity: 0;
  visibility: hidden;
  pointer-events: none;
  z-index: 0;
}

.music-mode-pane {
  transition: opacity 90ms linear;
  will-change: opacity;
}

.music-mode-pane-visible {
  position: relative;
  opacity: 1;
  visibility: visible;
  pointer-events: auto;
  z-index: 1;
}

.music-mode-pane-hidden {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  opacity: 0;
  visibility: hidden;
  pointer-events: none;
  z-index: 0;
}

.folia-embed-frame {
  display: block;
  width: 100%;
  height: 100%;
  min-height: 68vh;
  border: 0;
  background: #0b0e14;
}

.folia-embed-host {
  position: relative;
  flex: 1 1 auto;
  width: auto;
  height: auto;
  min-height: 68vh;
  min-width: 0;
  margin: 10px;
  overflow: hidden;
  background: #0b0e14;
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 10px;
  box-shadow: 0 16px 36px rgba(0, 0, 0, 0.3);
  /* 创建独立层叠上下文：Folia 内部的 fixed 元素（全屏遮罩等）相对本容器定位，
     不会盖住 Vue 页面的模式切换条 */
  transform: translateZ(0);
  contain: layout style;
  isolation: isolate;
  z-index: 1;
}

.folia-embed-toolbar {
  position: relative;
  z-index: 1;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  padding: 8px 140px 8px 12px;
  border-bottom: 1px solid var(--theme-border);
  background: color-mix(in srgb, var(--theme-panel-surface) 84%, transparent);
  backdrop-filter: blur(16px) saturate(130%);
  -webkit-backdrop-filter: blur(16px) saturate(130%);
}

.folia-embed-pane:fullscreen .folia-embed-host {
  margin: 0;
  border: 0;
  border-radius: 0;
  box-shadow: none;
}

.folia-embed-track {
  display: inline-flex;
  align-items: center;
  gap: 8px;
  min-width: 0;
  font-size: 12px;
  color: var(--theme-text-primary);
}

.folia-embed-track i {
  color: rgba(var(--accent-rgb), 0.9);
}

.folia-track-name {
  font-weight: 600;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  max-width: 40vw;
}

.folia-track-artist {
  color: var(--theme-text-secondary);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  max-width: 20vw;
}

.folia-embed-hint {
  font-size: 12px;
  color: var(--theme-text-tertiary);
}

.folia-embed-actions {
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.folia-toolbar-btn {
  min-height: 26px;
  padding: 0 10px;
  border-radius: 999px;
  border: 1px solid var(--theme-border-strong);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  font-size: 11px;
  display: inline-flex;
  align-items: center;
  gap: 5px;
  cursor: pointer;
}

.folia-toolbar-btn:hover {
  background: rgba(var(--accent-rgb), 0.14);
  color: var(--theme-text-primary);
}

.folia-playlist-picker {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  min-height: 26px;
  padding: 0 10px;
  border-radius: 999px;
  border: 1px solid var(--theme-border-strong);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  font-size: 11px;
}

.folia-playlist-label {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  white-space: nowrap;
}

.folia-playlist-select {
  border: 0;
  background: transparent;
  color: var(--theme-text-primary);
  font-size: 11px;
  max-width: 180px;
  cursor: pointer;
  outline: none;
}

.folia-playlist-select option {
  background: var(--theme-panel-surface);
  color: var(--theme-text-primary);
}

@media (max-width: 700px) {
  .music-library-page {
    box-sizing: border-box;
    padding-top: 52px;
  }

  .folia-embed-toolbar {
    min-height: 44px;
    gap: 4px;
    padding: 6px 8px;
  }

  .folia-embed-track,
  .folia-embed-hint {
    display: none;
  }

  .folia-embed-actions {
    width: 100%;
    min-width: 0;
    gap: 4px;
  }

  .folia-playlist-picker {
    flex: 1 1 auto;
    min-width: 0;
    padding: 0 6px;
  }

  .folia-playlist-label {
    font-size: 0;
  }

  .folia-playlist-label i {
    font-size: 11px;
  }

  .folia-playlist-select {
    width: 100%;
    min-width: 0;
    max-width: none;
  }

  .folia-toolbar-btn {
    flex: 0 0 28px;
    width: 28px;
    min-height: 26px;
    padding: 0;
    justify-content: center;
    gap: 0;
    font-size: 0;
  }

  .folia-toolbar-btn i {
    font-size: 11px;
  }

  .folia-fullscreen-btn,
  .folia-library-btn {
    flex-basis: 28px;
  }
}

.music-center-mode-switch {
  position: relative;
  z-index: 12;
  display: flex;
  align-items: baseline;
  gap: 16px;
  margin-bottom: 12px;
  padding: 0 4px;
}

.mode-tab {
  background: transparent !important;
  border: none !important;
  box-shadow: none !important;
  padding: 0;
  margin: 0;
  font-size: 16px;
  font-weight: 500;
  color: var(--theme-text-tertiary) !important;
  cursor: pointer;
  transition:
    color 0.3s cubic-bezier(0.25, 0.8, 0.25, 1),
    transform 0.3s cubic-bezier(0.25, 0.8, 0.25, 1);
  outline: none;
}

.mode-tab:hover {
  color: var(--theme-text-secondary) !important;
}

.mode-tab.active {
  font-size: 24px;
  font-weight: 700;
  color: var(--theme-text-primary) !important;
  cursor: default;
  transform: translateY(1px);
}

.music-fatal-error {
  --liquid-bg: linear-gradient(150deg, rgba(36, 17, 22, 0.82), rgba(24, 13, 18, 0.78));
  --liquid-border: rgba(255, 162, 186, 0.42);
  --liquid-shadow: 0 14px 30px rgba(40, 8, 16, 0.34);
  margin: 0 0 10px;
  border-radius: 14px;
  padding: 12px 14px;
  display: grid;
  gap: 8px;
}

.music-fatal-error h3 {
  margin: 0;
  font-size: 15px;
  color: rgba(255, 231, 239, 0.96);
}

.music-fatal-error p {
  margin: 0;
  font-size: 13px;
  color: rgba(255, 199, 217, 0.94);
  word-break: break-word;
}

.retry-btn {
  justify-self: start;
  min-height: 30px;
  padding: 0 12px;
  border-radius: 10px;
  border: 1px solid rgba(255, 175, 197, 0.48);
  background: rgba(255, 152, 183, 0.24);
  color: rgba(255, 242, 247, 0.96);
}

</style>
