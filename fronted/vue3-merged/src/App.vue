<template>
  <MotionConfig reduced-motion="user">
    <div class="app-shell">
      <div class="bg-layer" :class="{ home: isHomeRoute }" aria-hidden="true">
        <img class="bg-image" :src="activeImageBackground" alt="background" />
        <video
          v-if="activeVideoBackground && !videoFailed"
          class="bg-video"
          :src="activeVideoBackground"
          autoplay
          muted
          loop
          playsinline
          preload="auto"
          @error="videoFailed = true"
        ></video>
        <WallpaperL2dCanvas
          v-if="activeL2dVisible"
          :model-url="activeBackground?.src || ''"
          :model-entry="activeBackground?.l2dEntryModelJson || ''"
          :fallback-src="activeImageBackground"
          @error="handleL2dRenderError"
        />
        <audio
          ref="wallpaperBgmRef"
          class="wallpaper-audio"
          :src="activeWallpaperBgmUrl"
          preload="metadata"
          loop
          playsinline
        ></audio>
        <video
          ref="wallpaperBgvRef"
          class="wallpaper-audio"
          :src="activeWallpaperBgvUrl"
          preload="metadata"
          loop
          playsinline
        ></video>
        <div class="bg-fx" :class="{ 'bg-fx-home': isHomeRoute }"></div>
      </div>

      <TopMenu
        :menu-expanded="menuExpanded"
        :ai-chat-active="aiChatActive"
        :is-authenticated="auth.isAuthenticated.value"
        :is-admin="isAdminUser"
        :display-name="authDisplayName"
        :avatar-url="authAvatarUrl"
        @toggle-menu="toggleMenu"
        @toggle-ai-chat="toggleAiChat"
        @select-main-route="handleMainRouteSelect"
        @open-profile="openProfile"
        @open-admin="openAdmin"
        @open-author="openAuthor"
        @open-auth="openAuth"
        @logout="handleLogout"
        @open-background-picker="backgroundPickerVisible = true"
      />

      <section class="workspace-shell" :class="{ expanded: menuExpanded, 'with-ai-panel': sidebarAiColumnMounted }">
        <main
          class="route-content"
          :class="{
            'route-content-home': isHomeRoute,
            'route-content-blog': isBlogRoute,
            'route-content-music-player': isMusicPlayerDetailRoute,
            'route-content-music-shell': isMusicLibraryRoute && !isMusicPlayerDetailRoute
          }"
        >
          <RouterView v-slot="{ Component, route: viewRoute }">
            <transition name="route-switch" mode="out-in">
              <component :is="Component" :key="resolveRouteViewKey(viewRoute)" class="route-page-view" />
            </transition>
          </RouterView>
        </main>

        <aside v-if="sidebarAiColumnMounted" class="ai-side-column">
          <AiDialog :visible="showSidebarAiPanel" mode="sidebar" @close="closeAiChat" />
        </aside>
      </section>

      <AiDialog v-if="showMobileAiPanel" :visible="true" mode="sheet" @close="closeAiChat" />

      <MusicPlayer
        :track="player.currentTrack.value"
        :tracks="player.tracks.value"
        :lyric-line="player.currentLyricLine.value"
        :lyric-context="player.lyricContext.value"
        :current-time="player.currentTime.value"
        :duration="player.duration.value"
        :is-playing="player.isPlaying.value"
        :is-expanded="player.isPlayerExpanded.value"
        :is-pinned="player.isPinned.value"
        :play-mode="player.playMode.value"
        :list-open="player.listOpen.value"
        :visualizer-mode="player.visualizerMode.value"
        :visualizer-style="activeVisualizerStyle"
        :is-home-route="isHomeRoute"
        :is-mobile-viewport="isMobileViewport"
        :suppressed-by-route="isMusicLibraryRoute"
        :show-visualizer-controls="isHomeRoute"
        @set-expanded="player.setPlayerExpanded"
        @set-pinned="player.setPinned"
        @toggle-play="player.togglePlay"
        @prev="player.playPrev"
        @next="player.playNext"
        @cycle-mode="player.cyclePlayMode"
        @seek="player.seekToPercent"
        @toggle-list="player.setListOpen(!player.listOpen.value)"
        @select-track="handleSelectTrack"
        @toggle-subtitle="subtitleVisible = !subtitleVisible"
        @set-visualizer-mode="setVisualizerMode"
        @set-visualizer-style="setVisualizerStyle"
        @reorder-tracks="handleReorderTracks"
        @open-settings="openPlayerSettings"
      />

      <transition name="lyric-fade">
        <div
          v-if="subtitleVisible && !isMusicLibraryRoute"
          class="global-lyric-bar liquid-material"
          :style="bottomFloatingStyle(lyricOffset)"
          @pointerdown="startDrag($event)"
        >
          <span>{{ player.currentLyricLine.value || '纯音乐，无歌词' }}</span>
        </div>
      </transition>

      <div v-if="showBarsVisualizer" class="global-bars" :class="barsVisualizerClass" aria-hidden="true">
        <span v-for="(level, index) in barLevels" :key="`bar-${index}`" class="bar" :style="barStyle(level, index)"></span>
      </div>

      <div v-if="showRingVisualizer" class="global-ring" :class="ringVisualizerClass" aria-hidden="true">
        <div class="ring-core">
          <span v-for="(level, index) in ringLevels" :key="`ring-${index}`" class="ring-seg" :style="ringSegStyle(level, index)"></span>
        </div>
      </div>

      <transition name="picker-fade">
        <div v-if="backgroundPickerVisible" class="bg-picker-mask" @click.self="backgroundPickerVisible = false">
          <section class="bg-picker liquid-material">
            <header class="picker-head">
              <div class="picker-title">背景设置</div>
              <button class="picker-close ripple-trigger" @click="backgroundPickerVisible = false">关闭</button>
            </header>

            <div class="picker-status">
              <button class="scope-btn ripple-trigger" :disabled="wallpaperLoading" @click="refreshBackgroundLibrary">
                {{ wallpaperLoading ? '刷新中...' : '刷新壁纸库' }}
              </button>
              <span v-if="backgroundManifestFallbackUsed" class="route-bg-note">当前使用本地 manifest 兜底</span>
              <span v-if="wallpaperErrorHint" class="route-bg-note">{{ wallpaperErrorHint }}</span>
              <span v-if="importState.hint" class="route-bg-note">{{ importState.hint }}</span>
            </div>

            <div v-if="auth.isAuthenticated.value" class="picker-import-grid">
              <section class="import-card">
                <h4>本地包导入</h4>
                <input type="file" accept=".zip,image/*,video/*" @change="onPackageFileChange" />
                <input v-model.trim="importState.packageTitle" class="field-input-lite" type="text" placeholder="壁纸标题（可选）" />
                <select v-model="importState.packageVisibility" class="field-input-lite">
                  <option value="PRIVATE">私有</option>
                  <option value="PUBLIC">公开</option>
                </select>
                <button class="scope-btn ripple-trigger" :disabled="importState.busy || !importState.packageFile" @click="submitPackageImport">
                  上传并导入
                </button>
              </section>

              <section class="import-card">
                <h4>Workshop 导入</h4>
                <input
                  v-model.trim="importState.workshopUrl"
                  class="field-input-lite"
                  type="url"
                  placeholder="https://steamcommunity.com/sharedfiles/filedetails/?id=..."
                />
                <input v-model.trim="importState.workshopTitle" class="field-input-lite" type="text" placeholder="标题覆盖（可选）" />
                <select v-model="importState.workshopVisibility" class="field-input-lite">
                  <option value="PRIVATE">私有</option>
                  <option value="PUBLIC">公开</option>
                </select>
                <button class="scope-btn ripple-trigger" :disabled="importState.busy || !importState.workshopUrl" @click="submitWorkshopImport">
                  创建导入任务
                </button>
              </section>
            </div>
            <p v-else class="route-bg-note">登录后可上传本地包或导入 Workshop 资源。</p>

            <div class="picker-tabs">
              <button
                v-for="tab in bgTabs"
                :key="tab.key"
                class="tab-btn ripple-trigger"
                :class="{ active: bgTab === tab.key }"
                @click="setBgTab(tab.key)"
              >
                {{ tab.label }}
              </button>
            </div>

            <div class="picker-apply-mode">
              <button
                class="scope-btn ripple-trigger"
                :class="{ active: backgroundApplyTarget === 'route' }"
                @click="backgroundApplyTarget = 'route'"
              >
                应用到当前路由
              </button>
              <button
                class="scope-btn ripple-trigger"
                :class="{ active: backgroundApplyTarget === 'global' }"
                @click="backgroundApplyTarget = 'global'"
              >
                应用到全局默认
              </button>
              <button
                v-if="backgroundApplyTarget === 'route'"
                class="scope-btn danger ripple-trigger"
                @click="clearCurrentRouteBackground"
              >
                清空当前路由背景
              </button>
            </div>

            <p class="route-bg-note">
              当前路由：{{ currentRouteLabel }}
              <span v-if="currentRouteBackgroundId">（已单独设置）</span>
              <span v-else>（未设置，沿用全局）</span>
            </p>

            <section v-if="activeBackground?.wallpaperId && canEditActiveWallpaper" class="wallpaper-settings">
              <div class="picker-title">Wallpaper 设置</div>
              <p class="route-bg-note">
                来源：{{ activeBackground.importSource || 'PACKAGE' }}
                <span v-if="activeBackground.workshopItemId"> | Workshop ID: {{ activeBackground.workshopItemId }}</span>
              </p>
              <div class="settings-grid">
                <label>
                  主音量 {{ formatPercent(wallpaperSettingState.masterVolume) }}
                  <input v-model.number="wallpaperSettingState.masterVolume" type="range" min="0" max="1" step="0.01" />
                </label>
                <label>
                  BGM 音量 {{ formatPercent(wallpaperSettingState.bgmVolume) }}
                  <input v-model.number="wallpaperSettingState.bgmVolume" type="range" min="0" max="1" step="0.01" />
                </label>
                <label>
                  BGV 音量 {{ formatPercent(wallpaperSettingState.bgvVolume) }}
                  <input v-model.number="wallpaperSettingState.bgvVolume" type="range" min="0" max="1" step="0.01" />
                </label>
                <label>
                  内置 BGM 资源 ID
                  <input v-model.trim="wallpaperSettingState.bgmAssetIdText" class="field-input-lite" type="text" placeholder="可选，数字ID" />
                </label>
                <label>
                  内置 BGV 资源 ID
                  <input v-model.trim="wallpaperSettingState.bgvAssetIdText" class="field-input-lite" type="text" placeholder="可选，数字ID" />
                </label>
              </div>

              <div class="settings-checks">
                <label><input v-model="wallpaperSettingState.bgmEnabled" type="checkbox" /> 启用 BGM</label>
                <label><input v-model="wallpaperSettingState.bgvEnabled" type="checkbox" /> 启用 BGV</label>
              </div>

              <div v-if="activeCustomSchemaItems.length" class="settings-custom">
                <h4>自定义参数</h4>
                <div v-for="schemaItem in activeCustomSchemaItems" :key="schemaItem.key" class="custom-row">
                  <label>{{ schemaItem.label }}</label>
                  <input
                    v-if="schemaItem.type === 'slider'"
                    v-model.number="wallpaperSettingState.customValues[schemaItem.key]"
                    type="range"
                    :min="schemaItem.min"
                    :max="schemaItem.max"
                    :step="schemaItem.step"
                  />
                  <select
                    v-else-if="schemaItem.type === 'select'"
                    v-model="wallpaperSettingState.customValues[schemaItem.key]"
                    class="field-input-lite"
                  >
                    <option v-for="option in schemaItem.options" :key="option.value" :value="option.value">{{ option.label }}</option>
                  </select>
                  <input
                    v-else-if="schemaItem.type === 'toggle'"
                    v-model="wallpaperSettingState.customValues[schemaItem.key]"
                    type="checkbox"
                  />
                  <input
                    v-else-if="schemaItem.type === 'color'"
                    v-model="wallpaperSettingState.customValues[schemaItem.key]"
                    type="color"
                  />
                  <input
                    v-else
                    v-model="wallpaperSettingState.customValues[schemaItem.key]"
                    class="field-input-lite"
                    type="text"
                  />
                </div>
              </div>

              <div class="picker-apply-mode">
                <button class="scope-btn ripple-trigger" :disabled="wallpaperSettingState.saving" @click="saveActiveWallpaperSettings">
                  {{ wallpaperSettingState.saving ? '保存中...' : '保存设置' }}
                </button>
                <button class="scope-btn ripple-trigger" :disabled="wallpaperSettingState.visibilitySaving" @click="setActiveWallpaperVisibility('PUBLIC')">
                  提交公开
                </button>
                <button class="scope-btn danger ripple-trigger" :disabled="wallpaperSettingState.visibilitySaving" @click="setActiveWallpaperVisibility('PRIVATE')">
                  设为私有
                </button>
              </div>
              <p v-if="wallpaperSettingState.error" class="route-bg-note">{{ wallpaperSettingState.error }}</p>
            </section>

            <div class="picker-grid">
              <button
                v-for="item in filteredBackgroundItems"
                :key="item.id"
                class="picker-item ripple-trigger"
                :class="{ active: item.id === activeBackgroundId }"
                @click="selectBackground(item.id)"
              >
                <img class="picker-preview" :src="item.preview" :alt="item.name" />
                <span class="picker-name">{{ item.name }}</span>
                <span class="picker-meta">{{ item.type.toUpperCase() }}</span>
              </button>
            </div>
          </section>
        </div>
      </transition>

      <LevitationBall v-if="showLevitationBall" ref="levitationRef" />

      <div class="click-ripple-layer" aria-hidden="true">
        <span
          v-for="ripple in clickRipples"
          :key="ripple.id"
          class="click-ripple"
          :style="{
            left: `${ripple.x}px`,
            top: `${ripple.y}px`,
            width: `${ripple.size}px`,
            height: `${ripple.size}px`
          }"
        ></span>
      </div>
    </div>
  </MotionConfig>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, provide, reactive, ref, watch } from 'vue';
import { MotionConfig } from 'motion-v';
import { RouterView, useRoute, useRouter } from 'vue-router';
import AiDialog from './components/AiDialog.vue';
import LevitationBall from './components/LevitationBall.vue';
import MusicPlayer from './components/MusicPlayer.vue';
import WallpaperL2dCanvas from './components/WallpaperL2dCanvas.vue';
import TopMenu from './components/TopMenu.vue';
import { useAuthSession } from './composables/useAuthSession';
import { PLAYER_BRIDGE_KEY } from './composables/playerBridge';
import { usePlayerEngine } from './composables/usePlayerEngine';
import { useMusicLibraryUiState } from './pages/musicLibraryUiState';
import { useUiPreferences } from './composables/useUiPreferences';
import { routePathByKey } from './router';
import * as wallpaperApi from './services/wallpaperApi';
import { refreshAosManager } from './utils/aosManager';
import { runtimeGuards } from './utils/runtimeGuards';
import { recordWindowDiag } from './utils/windowLifecycleDiag';

const PLAYER_STORAGE_KEY = 'shizuki.musicPlayer.v2';
const LEGACY_PLAYER_STORAGE_KEY = 'shizuki.musicPlayer.v1';
const MUSIC_EQ_CHANGE_EVENT = 'shizuki:music:eq-change';
const menuExpanded = ref(false);
const levitationRef = ref(null);
const clickRipples = ref([]);
const videoFailed = ref(false);
const backgroundPickerVisible = ref(false);
const backgroundItems = ref([]);
const backgroundManifestFallbackUsed = ref(false);
const wallpaperLoading = ref(false);
const wallpaperErrorHint = ref('');
const bgTab = ref('all');
const backgroundApplyTarget = ref('route');
const subtitleVisible = ref(true);
const lyricOffset = ref({ x: 0, y: 0 });
const isMobileViewport = ref(false);
const pageVisible = ref(typeof document === 'undefined' ? true : !document.hidden);
const windowFocused = ref(typeof document === 'undefined' ? true : document.hasFocus());
const barLevels = ref(Array.from({ length: 44 }, () => 0));
const ringLevels = ref(Array.from({ length: 72 }, () => 0));
const sidebarAiColumnVisible = ref(false);
const l2dRenderFailed = ref(false);
const wallpaperBgmRef = ref(null);
const wallpaperBgvRef = ref(null);
const wallpaperCustomValuesById = reactive({});

const importState = reactive({
  packageVisibility: 'PRIVATE',
  packageTitle: '',
  packageFile: null,
  workshopUrl: '',
  workshopVisibility: 'PRIVATE',
  workshopTitle: '',
  runningJobId: 0,
  hint: '',
  busy: false
});

const wallpaperSettingState = reactive({
  masterVolume: 1,
  bgmVolume: 1,
  bgvVolume: 1,
  bgmEnabled: true,
  bgvEnabled: true,
  bgmAssetIdText: '',
  bgvAssetIdText: '',
  customValues: {},
  saving: false,
  visibilitySaving: false,
  error: ''
});

const dragState = {
  pointerId: null,
  startX: 0,
  startY: 0,
  originX: 0,
  originY: 0
};

let rippleSeq = 0;
let audioCtx = null;
let sourceNode = null;
let eqLowNode = null;
let eqMidNode = null;
let eqHighNode = null;
let analyser = null;
let freqData = null;
let rafId = 0;
let lastVisualizerFrameAt = 0;
let sidebarAiCloseTimer = 0;
let wallpaperImportPollTimer = 0;
let wallpaperPreferenceSaveTimer = 0;
const AI_SIDEBAR_EXIT_MS = 260;
const VISUALIZER_TARGET_FPS = 30;
const VISUALIZER_FRAME_MS = 1000 / VISUALIZER_TARGET_FPS;

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();
const player = usePlayerEngine({
  getAuthorizedFetch: () => (auth.isAuthenticated.value ? auth.authorizedFetch : undefined)
});
const musicUi = useMusicLibraryUiState();
const ui = useUiPreferences();

const routeLabelMap = {
  home: '主页',
  blog: '博客',
  'music-library': '音乐库',
  'music-library-playlist': '音乐歌单',
  'music-library-player': '播放详情',
  apps: '轻应用',
  'ai-tavern': 'AI酒馆',
  auth: '登录',
  'auth-callback': '登录回调',
  profile: '个人页面',
  admin: '管理后台',
  author: '作者介绍'
};

const currentRouteKey = computed(() => {
  const name = typeof route.name === 'string' ? route.name : 'home';
  if (name.startsWith('blog')) return 'blog';
  if (name.startsWith('music-library')) return 'music-library';
  return Object.prototype.hasOwnProperty.call(routeLabelMap, name) ? name : 'home';
});

const currentRouteLabel = computed(() => routeLabelMap[currentRouteKey.value] || '主页');
const isHomeRoute = computed(() => currentRouteKey.value === 'home');
const isBlogRoute = computed(() => currentRouteKey.value === 'blog');
const isMusicLibraryRoute = computed(() => route.path.startsWith('/music-library'));
const isMusicPlayerDetailRoute = computed(() => route.path.startsWith('/music-library/player'));
const isAiTavernRoute = computed(() => currentRouteKey.value === 'ai-tavern');
const showLevitationBall = computed(() => !runtimeGuards.disableLevitationBall && !isBlogRoute.value);
const authDisplayName = computed(() => auth.user.value?.nickname || '个人页面');
const authAvatarUrl = computed(() => String(auth.user.value?.avatarUrl || '').trim());
const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((groupCode) => String(groupCode || '').toUpperCase() === 'ADMIN');
});

const aiChatActive = computed({
  get: () => ui.state.aiPanelOpen,
  set: (nextValue) => ui.setAiPanelOpen(nextValue)
});

const canUseSidebarAi = computed(() => !isAiTavernRoute.value && !isMobileViewport.value);
const showSidebarAiPanel = computed(() => aiChatActive.value && canUseSidebarAi.value);
const sidebarAiColumnMounted = computed(() => canUseSidebarAi.value && (showSidebarAiPanel.value || sidebarAiColumnVisible.value));
const showMobileAiPanel = computed(() => aiChatActive.value && !isAiTavernRoute.value && isMobileViewport.value);
const showBarsVisualizer = computed(() => isHomeRoute.value && player.visualizerMode.value === 'bars');
const showRingVisualizer = computed(() => isHomeRoute.value && player.visualizerMode.value === 'ring');
const shouldRunVisualizer = computed(
  () => isHomeRoute.value && ['bars', 'ring'].includes(player.visualizerMode.value) && player.isPlaying.value
);
const activeVisualizerStyle = computed(() => {
  const style = player.visualizerStyle.value;
  if (style) return style;
  return player.visualizerMode.value === 'ring' ? 'ring-halo' : 'bars-neon';
});
const barsVisualizerClass = computed(() => (activeVisualizerStyle.value.startsWith('bars-') ? activeVisualizerStyle.value : 'bars-neon'));
const ringVisualizerClass = computed(() => (activeVisualizerStyle.value.startsWith('ring-') ? activeVisualizerStyle.value : 'ring-halo'));
const interactionAllowed = computed(
  () => !runtimeGuards.disableGlobalPointerHooks && pageVisible.value && windowFocused.value
);
const visualizerPaused = computed(() => runtimeGuards.disableVisualizerLoop || !pageVisible.value);

const bgTabs = [
  { key: 'all', label: '全部' },
  { key: 'static', label: '静态图片' },
  { key: 'dynamic', label: '动态图片' },
  { key: 'l2d', label: 'L2D' }
];

const filteredBackgroundItems = computed(() => {
  if (bgTab.value === 'all') return backgroundItems.value;
  return backgroundItems.value.filter((item) => item.type === bgTab.value);
});

const currentRouteBackgroundId = computed(() => ui.state.routeBackgroundByKey?.[currentRouteKey.value] || '');

const defaultBackgroundId = computed(() => {
  const first = backgroundItems.value.find((item) => !!item.src);
  return first?.id || '';
});

const activeBackgroundId = computed(() => {
  return ui.getEffectiveBackgroundId(currentRouteKey.value) || defaultBackgroundId.value;
});

const activeBackground = computed(() => {
  return backgroundItems.value.find((item) => item.id === activeBackgroundId.value) || null;
});

const canEditActiveWallpaper = computed(() => {
  const item = activeBackground.value;
  if (!item || !item.wallpaperId) return false;
  return Boolean(item.mine) || isAdminUser.value;
});

const activeVideoBackground = computed(() => {
  if (activeBackground.value?.type === 'l2d') return '';
  const src = activeBackground.value?.src || '';
  const ext = src.split('?')[0].split('#')[0].split('.').pop()?.toLowerCase();
  if (['webm', 'mp4', 'mov', 'ogg'].includes(ext)) return src;
  return '';
});

const activeImageBackground = computed(() => {
  return activeBackground.value?.preview || `${import.meta.env.BASE_URL}images/original-bg.png`;
});

const activeL2dVisible = computed(() => {
  if (l2dRenderFailed.value) return false;
  const item = activeBackground.value;
  if (!item) return false;
  if (item.type !== 'l2d') return false;
  return Boolean(item.src) && Boolean(item.l2dEntryModelJson);
});

const activeWallpaperBgmUrl = computed(() => String(activeBackground.value?.embeddedBgmUrl || '').trim());
const activeWallpaperBgvUrl = computed(() => String(activeBackground.value?.embeddedBgvUrl || '').trim());
const activeWallpaperCustomSchema = computed(() => {
  const schema = activeBackground.value?.customSchema;
  if (!schema || typeof schema !== 'object') return [];
  if (Array.isArray(schema)) {
    return schema
      .map((item, index) => normalizeSchemaItem(item, `custom_${index}`))
      .filter(Boolean);
  }
  return Object.entries(schema)
    .map(([key, value]) => normalizeSchemaItem(value, key))
    .filter(Boolean);
});
const activeCustomSchemaItems = computed(() => activeWallpaperCustomSchema.value);

const playerBridge = Object.freeze({
  tracks: player.tracks,
  playlistProfile: player.playlistProfile,
  playlistLoading: player.playlistLoading,
  playlistError: player.playlistError,
  currentTrack: player.currentTrack,
  isPlaying: player.isPlaying,
  currentTime: player.currentTime,
  duration: player.duration,
  currentLyricLine: player.currentLyricLine,
  lyricContext: player.lyricContext,
  lyricTimeline: player.lyricTimeline,
  currentLyricEntryIndex: player.currentLyricEntryIndex,
  lyricRenderMode: player.lyricRenderMode,
  availableLyricModes: player.availableLyricModes,
  listOpen: player.listOpen,
  volume: player.volume,
  playMode: player.playMode,
  togglePlay: player.togglePlay,
  playPrev: player.playPrev,
  playNext: player.playNext,
  selectTrackByIndex: player.selectTrackByIndex,
  enqueueExternalTrack: player.enqueueExternalTrack,
  enqueueNextTrack: player.enqueueNextTrack,
  playExternalTrack: player.playExternalTrack,
  seekToPercent: player.seekToPercent,
  seekToTime: player.seekToTime,
  setVolume: player.setVolume,
  setLyricRenderMode: player.setLyricRenderMode,
  setListOpen: player.setListOpen,
  cyclePlayMode: player.cyclePlayMode,
  loadPlaylistByCode: player.loadPlaylistByCode,
  reloadPlaylist: player.reloadPlaylist,
  replaceQueueWithTracks: player.replaceQueueWithTracks
});

provide(PLAYER_BRIDGE_KEY, playerBridge);

function normalizeAssetPath(path) {
  if (!path) return `${import.meta.env.BASE_URL}images/original-bg.png`;
  if (path.startsWith('http') || path.startsWith('/')) return path;
  return `${import.meta.env.BASE_URL}${path.replace(/^\/+/, '')}`;
}

function inferBgType(item) {
  if (item?.type === 'l2d') return 'l2d';
  if (String(item?.sceneType || '').toUpperCase() === 'L2D') return 'l2d';
  const src = String(item?.src || item?.preview || '').toLowerCase();
  if (/\.(webm|mp4|mov|ogg|gif|webp)$/.test(src)) return 'dynamic';
  return 'static';
}

function readRecordField(record, camel, snake, fallback = '') {
  if (!record || typeof record !== 'object') return fallback;
  if (record[camel] !== undefined && record[camel] !== null) return record[camel];
  if (record[snake] !== undefined && record[snake] !== null) return record[snake];
  return fallback;
}

function toSafeNumber(input, fallback = 0) {
  const value = Number(input);
  return Number.isFinite(value) ? value : fallback;
}

function clampUnit(input, fallback = 1) {
  const value = toSafeNumber(input, fallback);
  return Math.max(0, Math.min(1, value));
}

function parsePositiveId(raw) {
  const value = Number(raw);
  return Number.isFinite(value) && value > 0 ? Math.floor(value) : 0;
}

function toBoolean(input, fallback = false) {
  if (typeof input === 'boolean') return input;
  if (typeof input === 'string') {
    const normalized = input.trim().toLowerCase();
    if (normalized === 'true') return true;
    if (normalized === 'false') return false;
  }
  return fallback;
}

function formatPercent(value) {
  return `${Math.round(clampUnit(value, 1) * 100)}%`;
}

function normalizeSchemaItem(raw, keyFallback = '') {
  if (!raw || typeof raw !== 'object') return null;
  const key = String(raw.key || keyFallback || '').trim();
  if (!key) return null;
  const typeRaw = String(raw.type || 'text').trim().toLowerCase();
  const type = ['slider', 'select', 'toggle', 'color', 'text'].includes(typeRaw) ? typeRaw : 'text';
  const optionsRaw = Array.isArray(raw.options) ? raw.options : [];
  const options = optionsRaw
    .map((item) => {
      if (item && typeof item === 'object') {
        const value = readRecordField(item, 'value', 'value', '');
        return {
          value: String(value),
          label: String(readRecordField(item, 'label', 'label', value))
        };
      }
      const value = String(item ?? '');
      return {
        value,
        label: value
      };
    })
    .filter((item) => item.value !== '');

  return {
    key,
    label: String(raw.label || key),
    type,
    min: toSafeNumber(raw.min, 0),
    max: toSafeNumber(raw.max, 1),
    step: toSafeNumber(raw.step, 0.01),
    options
  };
}

function normalizeWallpaperProfile(raw, index = 0) {
  const wallpaperId = parsePositiveId(readRecordField(raw, 'wallpaperId', 'wallpaper_id', 0));
  const sceneType = String(readRecordField(raw, 'sceneType', 'scene_type', 'STATIC')).trim().toUpperCase();
  const type = sceneType === 'L2D' ? 'l2d' : sceneType === 'DYNAMIC' ? 'dynamic' : 'static';
  const visualUrl = String(readRecordField(raw, 'visualUrl', 'visual_url', '') || '').trim();
  const previewUrl = String(readRecordField(raw, 'previewUrl', 'preview_url', visualUrl) || '').trim();
  const itemId = wallpaperId > 0 ? `wp-${wallpaperId}` : `wp-temp-${index}`;
  return {
    id: itemId,
    wallpaperId,
    name: String(readRecordField(raw, 'title', 'title', `壁纸 ${index + 1}`) || `壁纸 ${index + 1}`),
    src: visualUrl || normalizeAssetPath('images/original-bg.png'),
    preview: previewUrl || visualUrl || normalizeAssetPath('images/original-bg.png'),
    type,
    sceneType,
    visibility: String(readRecordField(raw, 'visibility', 'visibility', 'PRIVATE')).toUpperCase(),
    auditStatus: String(readRecordField(raw, 'auditStatus', 'audit_status', 'PENDING_AUDIT')).toUpperCase(),
    embeddedBgmAssetId: parsePositiveId(readRecordField(raw, 'embeddedBgmAssetId', 'embedded_bgm_asset_id', 0)),
    embeddedBgmUrl: String(readRecordField(raw, 'embeddedBgmUrl', 'embedded_bgm_url', '') || '').trim(),
    embeddedBgvAssetId: parsePositiveId(readRecordField(raw, 'embeddedBgvAssetId', 'embedded_bgv_asset_id', 0)),
    embeddedBgvUrl: String(readRecordField(raw, 'embeddedBgvUrl', 'embedded_bgv_url', '') || '').trim(),
    l2dEntryModelJson: String(readRecordField(raw, 'l2dEntryModelJson', 'l2d_entry_model_json', '') || '').trim(),
    defaultMasterVolume: clampUnit(readRecordField(raw, 'defaultMasterVolume', 'default_master_volume', 1), 1),
    defaultBgmVolume: clampUnit(readRecordField(raw, 'defaultBgmVolume', 'default_bgm_volume', 1), 1),
    defaultBgvVolume: clampUnit(readRecordField(raw, 'defaultBgvVolume', 'default_bgv_volume', 1), 1),
    customSchema: readRecordField(raw, 'customSchema', 'custom_schema', {}),
    customDefaults: readRecordField(raw, 'customDefaults', 'custom_defaults', {}),
    importSource: String(readRecordField(raw, 'importSource', 'import_source', 'PACKAGE') || 'PACKAGE'),
    workshopItemId: String(readRecordField(raw, 'workshopItemId', 'workshop_item_id', '') || ''),
    mine: toBoolean(readRecordField(raw, 'mine', 'mine', false), false)
  };
}

function applyBackgroundSelectionGuard() {
  const validIds = new Set(backgroundItems.value.map((item) => item.id));
  if (ui.state.globalBackgroundId && !validIds.has(ui.state.globalBackgroundId)) {
    ui.setGlobalBackgroundId('');
  }
  Object.entries(ui.state.routeBackgroundByKey || {}).forEach(([key, value]) => {
    if (!validIds.has(value)) {
      ui.clearRouteBackground(key);
    }
  });
  if (!ui.state.globalBackgroundId && !Object.keys(ui.state.routeBackgroundByKey || {}).length && defaultBackgroundId.value) {
    ui.setGlobalBackgroundId(defaultBackgroundId.value);
  }
}

async function loadBackgroundManifestFallback() {
  backgroundManifestFallbackUsed.value = true;
  try {
    const resp = await fetch(`${import.meta.env.BASE_URL}media/manifest.json`, { cache: 'no-store' });
    if (!resp.ok) throw new Error('manifest not found');
    const data = await resp.json();
    const list = Array.isArray(data?.backgrounds) ? data.backgrounds : [];
    backgroundItems.value = list
      .filter((item) => item?.available !== false)
      .slice(0, 180)
      .map((item, index) => ({
        id: item.id || `bg-${index}`,
        wallpaperId: 0,
        name: item.name || item.id || `背景 ${index + 1}`,
        src: item.src ? normalizeAssetPath(item.src) : '',
        preview: normalizeAssetPath(item.preview || item.src || 'images/original-bg.png'),
        type: inferBgType(item),
        sceneType: inferBgType(item).toUpperCase(),
        visibility: 'PUBLIC',
        auditStatus: 'APPROVED',
        embeddedBgmAssetId: 0,
        embeddedBgmUrl: '',
        embeddedBgvAssetId: 0,
        embeddedBgvUrl: '',
        l2dEntryModelJson: '',
        defaultMasterVolume: 1,
        defaultBgmVolume: 1,
        defaultBgvVolume: 1,
        customSchema: {},
        customDefaults: {},
        importSource: 'MANIFEST',
        workshopItemId: '',
        mine: false
      }));
  } catch {
    backgroundItems.value = [
      {
        id: 'video-954',
        wallpaperId: 0,
        name: '954',
        src: `${import.meta.env.BASE_URL}media/background/954.webm`,
        preview: `${import.meta.env.BASE_URL}images/original-bg.png`,
        type: 'dynamic',
        sceneType: 'DYNAMIC',
        visibility: 'PUBLIC',
        auditStatus: 'APPROVED',
        embeddedBgmAssetId: 0,
        embeddedBgmUrl: '',
        embeddedBgvAssetId: 0,
        embeddedBgvUrl: '',
        l2dEntryModelJson: '',
        defaultMasterVolume: 1,
        defaultBgmVolume: 1,
        defaultBgvVolume: 1,
        customSchema: {},
        customDefaults: {},
        importSource: 'MANIFEST',
        workshopItemId: '',
        mine: false
      },
      {
        id: 'default-bg',
        wallpaperId: 0,
        name: '默认',
        src: `${import.meta.env.BASE_URL}images/original-bg.png`,
        preview: `${import.meta.env.BASE_URL}images/original-bg.png`,
        type: 'static',
        sceneType: 'STATIC',
        visibility: 'PUBLIC',
        auditStatus: 'APPROVED',
        embeddedBgmAssetId: 0,
        embeddedBgmUrl: '',
        embeddedBgvAssetId: 0,
        embeddedBgvUrl: '',
        l2dEntryModelJson: '',
        defaultMasterVolume: 1,
        defaultBgmVolume: 1,
        defaultBgvVolume: 1,
        customSchema: {},
        customDefaults: {},
        importSource: 'MANIFEST',
        workshopItemId: '',
        mine: false
      },
      {
        id: 'l2d-placeholder',
        wallpaperId: 0,
        name: 'L2D 占位',
        src: '',
        preview: `${import.meta.env.BASE_URL}images/katanegai.jpg`,
        type: 'l2d',
        sceneType: 'L2D',
        visibility: 'PUBLIC',
        auditStatus: 'APPROVED',
        embeddedBgmAssetId: 0,
        embeddedBgmUrl: '',
        embeddedBgvAssetId: 0,
        embeddedBgvUrl: '',
        l2dEntryModelJson: '',
        defaultMasterVolume: 1,
        defaultBgmVolume: 1,
        defaultBgvVolume: 1,
        customSchema: {},
        customDefaults: {},
        importSource: 'MANIFEST',
        workshopItemId: '',
        mine: false
      }
    ];
  }
}

async function loadBackgroundLibrary() {
  wallpaperLoading.value = true;
  wallpaperErrorHint.value = '';
  backgroundManifestFallbackUsed.value = false;
  try {
    let list = [];
    if (auth.isAuthenticated.value) {
      list = await wallpaperApi.listWallpaperLibrary('all', auth.authorizedFetch);
    } else {
      list = await wallpaperApi.listPublicWallpapers();
    }
    const profiles = Array.isArray(list) ? list : [];
    if (profiles.length > 0) {
      backgroundItems.value = profiles.map((item, index) => normalizeWallpaperProfile(item, index));
    } else {
      await loadBackgroundManifestFallback();
      wallpaperErrorHint.value = '当前壁纸库为空，已回退到本地资源。';
    }
  } catch (error) {
    await loadBackgroundManifestFallback();
    const detail = String(error?.detail || error?.message || '').trim();
    wallpaperErrorHint.value = detail ? `壁纸库加载失败：${detail}` : '壁纸库加载失败，已回退到本地资源。';
  } finally {
    applyBackgroundSelectionGuard();
    wallpaperLoading.value = false;
    syncActiveWallpaperSettingFromItem(true);
  }
}

async function refreshBackgroundLibrary() {
  await loadBackgroundLibrary();
}

function saveActiveCustomValueSnapshot() {
  const activeId = String(activeBackgroundId.value || '').trim();
  if (!activeId) return;
  wallpaperCustomValuesById[activeId] = {
    ...(wallpaperSettingState.customValues || {})
  };
}

function syncActiveWallpaperSettingFromItem(force = false) {
  const item = activeBackground.value;
  if (!item) return;
  if (!force) {
    saveActiveCustomValueSnapshot();
  }
  const defaults = item.customDefaults && typeof item.customDefaults === 'object' && !Array.isArray(item.customDefaults)
    ? { ...item.customDefaults }
    : {};
  const activeId = String(item.id || '').trim();
  const cached = activeId ? wallpaperCustomValuesById[activeId] : null;
  wallpaperSettingState.masterVolume = clampUnit(item.defaultMasterVolume, 1);
  wallpaperSettingState.bgmVolume = clampUnit(item.defaultBgmVolume, 1);
  wallpaperSettingState.bgvVolume = clampUnit(item.defaultBgvVolume, 1);
  wallpaperSettingState.bgmEnabled = toBoolean(defaults.bgmEnabled, item.embeddedBgmAssetId > 0);
  wallpaperSettingState.bgvEnabled = toBoolean(defaults.bgvEnabled, item.embeddedBgvAssetId > 0);
  wallpaperSettingState.bgmAssetIdText = item.embeddedBgmAssetId > 0 ? String(item.embeddedBgmAssetId) : '';
  wallpaperSettingState.bgvAssetIdText = item.embeddedBgvAssetId > 0 ? String(item.embeddedBgvAssetId) : '';
  wallpaperSettingState.customValues = cached && typeof cached === 'object'
    ? { ...cached }
    : { ...defaults };
}

function applyWallpaperCustomVariables() {
  if (typeof document === 'undefined') return;
  const root = document.documentElement;
  const values = wallpaperSettingState.customValues || {};
  Object.entries(values).forEach(([key, value]) => {
    const cssKey = String(key || '').trim().replace(/[^a-z0-9_-]+/gi, '-').toLowerCase();
    if (!cssKey) return;
    root.style.setProperty(`--wallpaper-custom-${cssKey}`, String(value ?? ''));
  });
}

function applyWallpaperAudioState() {
  const master = clampUnit(wallpaperSettingState.masterVolume, 1);
  const bgmVol = clampUnit(wallpaperSettingState.bgmVolume, 1);
  const bgvVol = clampUnit(wallpaperSettingState.bgvVolume, 1);

  const bgmEl = wallpaperBgmRef.value;
  if (bgmEl) {
    bgmEl.volume = master * bgmVol;
    bgmEl.muted = !wallpaperSettingState.bgmEnabled || !activeWallpaperBgmUrl.value;
    if (!bgmEl.muted && bgmEl.paused) {
      bgmEl.play().catch(() => {});
    }
    if (bgmEl.muted && !bgmEl.paused) {
      bgmEl.pause();
    }
  }

  const bgvEl = wallpaperBgvRef.value;
  if (bgvEl) {
    bgvEl.volume = master * bgvVol;
    bgvEl.muted = !wallpaperSettingState.bgvEnabled || !activeWallpaperBgvUrl.value;
    if (!bgvEl.muted && bgvEl.paused) {
      bgvEl.play().catch(() => {});
    }
    if (bgvEl.muted && !bgvEl.paused) {
      bgvEl.pause();
    }
  }
}

async function loadRemoteWallpaperPreference() {
  if (!auth.isAuthenticated.value) return;
  try {
    const payload = await auth.getPreference();
    const preferenceMap = payload && typeof payload === 'object' ? payload : {};
    const wallpaperPreference = preferenceMap.home_wallpaper && typeof preferenceMap.home_wallpaper === 'object'
      ? preferenceMap.home_wallpaper
      : preferenceMap.homeWallpaper && typeof preferenceMap.homeWallpaper === 'object'
        ? preferenceMap.homeWallpaper
        : {};

    if (typeof wallpaperPreference.globalBackgroundId === 'string') {
      ui.setGlobalBackgroundId(wallpaperPreference.globalBackgroundId);
    }
    if (wallpaperPreference.routeBackgroundByKey && typeof wallpaperPreference.routeBackgroundByKey === 'object') {
      Object.entries(wallpaperPreference.routeBackgroundByKey).forEach(([key, value]) => {
        if (typeof value === 'string' && value) {
          ui.setRouteBackground(key, value);
        }
      });
    }
    if (wallpaperPreference.customValuesByWallpaper && typeof wallpaperPreference.customValuesByWallpaper === 'object') {
      Object.entries(wallpaperPreference.customValuesByWallpaper).forEach(([key, value]) => {
        if (value && typeof value === 'object') {
          wallpaperCustomValuesById[key] = { ...value };
        }
      });
    }
    wallpaperSettingState.masterVolume = clampUnit(wallpaperPreference.masterVolume, wallpaperSettingState.masterVolume);
    wallpaperSettingState.bgmVolume = clampUnit(wallpaperPreference.bgmVolume, wallpaperSettingState.bgmVolume);
    wallpaperSettingState.bgvVolume = clampUnit(wallpaperPreference.bgvVolume, wallpaperSettingState.bgvVolume);
    wallpaperSettingState.bgmEnabled = toBoolean(wallpaperPreference.bgmEnabled, wallpaperSettingState.bgmEnabled);
    wallpaperSettingState.bgvEnabled = toBoolean(wallpaperPreference.bgvEnabled, wallpaperSettingState.bgvEnabled);
  } catch {
    // keep local cache when remote preference unavailable
  }
}

function buildWallpaperPreferencePayload() {
  saveActiveCustomValueSnapshot();
  return {
    globalBackgroundId: ui.state.globalBackgroundId || '',
    routeBackgroundByKey: { ...(ui.state.routeBackgroundByKey || {}) },
    masterVolume: clampUnit(wallpaperSettingState.masterVolume, 1),
    bgmVolume: clampUnit(wallpaperSettingState.bgmVolume, 1),
    bgvVolume: clampUnit(wallpaperSettingState.bgvVolume, 1),
    bgmEnabled: Boolean(wallpaperSettingState.bgmEnabled),
    bgvEnabled: Boolean(wallpaperSettingState.bgvEnabled),
    customValuesByWallpaper: { ...wallpaperCustomValuesById }
  };
}

function queueWallpaperPreferenceSync() {
  if (!auth.isAuthenticated.value) return;
  if (wallpaperPreferenceSaveTimer) {
    window.clearTimeout(wallpaperPreferenceSaveTimer);
  }
  wallpaperPreferenceSaveTimer = window.setTimeout(async () => {
    try {
      const current = await auth.getPreference();
      const source = current && typeof current === 'object' ? { ...current } : {};
      source.home_wallpaper = buildWallpaperPreferencePayload();
      await auth.updatePreference(source);
    } catch {
      // ignore remote sync failure
    } finally {
      wallpaperPreferenceSaveTimer = 0;
    }
  }, 650);
}

function onPackageFileChange(event) {
  const file = event?.target?.files?.[0];
  importState.packageFile = file instanceof File ? file : null;
}

function normalizeImportJobResponse(raw) {
  if (!raw || typeof raw !== 'object') return null;
  return {
    jobId: parsePositiveId(readRecordField(raw, 'jobId', 'job_id', 0)),
    sourceType: String(readRecordField(raw, 'sourceType', 'source_type', 'PACKAGE')),
    status: String(readRecordField(raw, 'status', 'status', 'PENDING')).toUpperCase(),
    visibility: String(readRecordField(raw, 'visibility', 'visibility', 'PRIVATE')).toUpperCase(),
    wallpaperId: parsePositiveId(readRecordField(raw, 'wallpaperId', 'wallpaper_id', 0)),
    errorMessage: String(readRecordField(raw, 'errorMessage', 'error_message', '')),
    fallbackHint: String(readRecordField(raw, 'fallbackHint', 'fallback_hint', ''))
  };
}

function stopImportPolling() {
  if (wallpaperImportPollTimer) {
    window.clearInterval(wallpaperImportPollTimer);
    wallpaperImportPollTimer = 0;
  }
}

async function pollWallpaperImportJob(jobId) {
  if (!auth.isAuthenticated.value || !jobId) return;
  const payload = normalizeImportJobResponse(await wallpaperApi.getWallpaperImportJob(jobId, auth.authorizedFetch));
  if (!payload) return;
  const status = payload.status;
  if (status === 'SUCCEEDED') {
    importState.hint = `导入成功（任务 #${payload.jobId}）`;
    stopImportPolling();
    await refreshBackgroundLibrary();
    if (payload.wallpaperId > 0) {
      const targetId = `wp-${payload.wallpaperId}`;
      if (backgroundItems.value.some((item) => item.id === targetId)) {
        ui.setGlobalBackgroundId(targetId);
      }
    }
    return;
  }
  if (status === 'FAILED' || status === 'FALLBACK_REQUIRED') {
    const detail = payload.errorMessage || payload.fallbackHint || '导入失败';
    importState.hint = `导入未完成：${detail}`;
    stopImportPolling();
    return;
  }
  importState.hint = `任务 #${payload.jobId} 状态：${status}`;
}

function startImportPolling(jobId) {
  stopImportPolling();
  importState.runningJobId = jobId;
  pollWallpaperImportJob(jobId).catch(() => {});
  wallpaperImportPollTimer = window.setInterval(() => {
    pollWallpaperImportJob(jobId).catch(() => {});
  }, 2500);
}

async function submitPackageImport() {
  if (!auth.isAuthenticated.value) {
    importState.hint = '请先登录后再上传导入。';
    return;
  }
  if (!(importState.packageFile instanceof File)) {
    importState.hint = '请先选择本地资源包。';
    return;
  }
  importState.busy = true;
  importState.hint = '';
  try {
    const payload = normalizeImportJobResponse(await wallpaperApi.importWallpaperPackage(
      importState.packageFile,
      {
        visibility: importState.packageVisibility,
        title: importState.packageTitle
      },
      auth.authorizedFetch
    ));
    if (!payload || !payload.jobId) {
      throw new Error('导入任务创建失败');
    }
    importState.hint = `导入任务已创建：#${payload.jobId}`;
    startImportPolling(payload.jobId);
  } catch (error) {
    importState.hint = String(error?.detail || error?.message || '包导入失败');
  } finally {
    importState.busy = false;
  }
}

async function submitWorkshopImport() {
  if (!auth.isAuthenticated.value) {
    importState.hint = '请先登录后再导入 Workshop。';
    return;
  }
  if (!importState.workshopUrl) {
    importState.hint = '请输入 Workshop URL。';
    return;
  }
  importState.busy = true;
  importState.hint = '';
  try {
    const payload = normalizeImportJobResponse(await wallpaperApi.importWallpaperWorkshop(
      {
        workshopUrl: importState.workshopUrl,
        visibility: importState.workshopVisibility,
        title: importState.workshopTitle
      },
      auth.authorizedFetch
    ));
    if (!payload || !payload.jobId) {
      throw new Error('任务创建失败');
    }
    importState.hint = `Workshop 导入任务已创建：#${payload.jobId}`;
    startImportPolling(payload.jobId);
  } catch (error) {
    importState.hint = String(error?.detail || error?.message || 'Workshop 导入失败');
  } finally {
    importState.busy = false;
  }
}

async function saveActiveWallpaperSettings() {
  wallpaperSettingState.error = '';
  if (!auth.isAuthenticated.value) {
    wallpaperSettingState.error = '请先登录。';
    return;
  }
  const item = activeBackground.value;
  if (!item || !item.wallpaperId) {
    wallpaperSettingState.error = '当前壁纸不支持设置。';
    return;
  }
  wallpaperSettingState.saving = true;
  try {
    const payload = await wallpaperApi.updateWallpaperSettings(
      item.wallpaperId,
      {
        embeddedBgmAssetId: parsePositiveId(wallpaperSettingState.bgmAssetIdText) || undefined,
        embeddedBgvAssetId: parsePositiveId(wallpaperSettingState.bgvAssetIdText) || undefined,
        defaultMasterVolume: clampUnit(wallpaperSettingState.masterVolume, 1),
        defaultBgmVolume: clampUnit(wallpaperSettingState.bgmVolume, 1),
        defaultBgvVolume: clampUnit(wallpaperSettingState.bgvVolume, 1),
        bgmEnabled: Boolean(wallpaperSettingState.bgmEnabled),
        bgvEnabled: Boolean(wallpaperSettingState.bgvEnabled),
        customDefaults: { ...(wallpaperSettingState.customValues || {}) }
      },
      auth.authorizedFetch
    );
    const normalized = normalizeWallpaperProfile(payload, 0);
    const targetIndex = backgroundItems.value.findIndex((bg) => bg.id === item.id);
    if (targetIndex >= 0) {
      backgroundItems.value[targetIndex] = {
        ...backgroundItems.value[targetIndex],
        ...normalized
      };
    }
    saveActiveCustomValueSnapshot();
    queueWallpaperPreferenceSync();
  } catch (error) {
    wallpaperSettingState.error = String(error?.detail || error?.message || '设置保存失败');
  } finally {
    wallpaperSettingState.saving = false;
  }
}

async function setActiveWallpaperVisibility(visibility) {
  wallpaperSettingState.error = '';
  if (!auth.isAuthenticated.value) {
    wallpaperSettingState.error = '请先登录。';
    return;
  }
  const item = activeBackground.value;
  if (!item || !item.wallpaperId) {
    wallpaperSettingState.error = '当前壁纸不支持设置。';
    return;
  }
  wallpaperSettingState.visibilitySaving = true;
  try {
    const payload = await wallpaperApi.updateWallpaperVisibility(item.wallpaperId, visibility, auth.authorizedFetch);
    const normalized = normalizeWallpaperProfile(payload, 0);
    const targetIndex = backgroundItems.value.findIndex((bg) => bg.id === item.id);
    if (targetIndex >= 0) {
      backgroundItems.value[targetIndex] = {
        ...backgroundItems.value[targetIndex],
        ...normalized
      };
    }
    importState.hint = visibility === 'PUBLIC' ? '公开申请已提交，等待审核。' : '已切换为私有。';
  } catch (error) {
    wallpaperSettingState.error = String(error?.detail || error?.message || '可见性更新失败');
  } finally {
    wallpaperSettingState.visibilitySaving = false;
  }
}

function handleL2dRenderError(message) {
  l2dRenderFailed.value = true;
  wallpaperErrorHint.value = `L2D 渲染失败，已降级到封面图。${String(message || '')}`.trim();
}

function loadPersistedExtra() {
  try {
    const raw = window.localStorage.getItem(PLAYER_STORAGE_KEY);
    if (raw) {
      const data = JSON.parse(raw);
      subtitleVisible.value = data?.subtitleVisible !== false;

      if (data?.lyricOffset && Number.isFinite(data.lyricOffset.x) && Number.isFinite(data.lyricOffset.y)) {
        lyricOffset.value = { x: data.lyricOffset.x, y: data.lyricOffset.y };
      } else if (data?.lyricBar && Number.isFinite(data.lyricBar.offsetX) && Number.isFinite(data.lyricBar.offsetY)) {
        lyricOffset.value = { x: data.lyricBar.offsetX, y: data.lyricBar.offsetY };
      }
    }
    if (LEGACY_PLAYER_STORAGE_KEY !== PLAYER_STORAGE_KEY) {
      window.localStorage.removeItem(LEGACY_PLAYER_STORAGE_KEY);
    }
  } catch {
    // ignore malformed persisted data
  }
}

function persistExtra() {
  try {
    const raw = window.localStorage.getItem(PLAYER_STORAGE_KEY);
    const prev = raw ? JSON.parse(raw) : {};
    window.localStorage.setItem(
      PLAYER_STORAGE_KEY,
      JSON.stringify({
        ...prev,
        subtitleVisible: subtitleVisible.value,
        lyricOffset: lyricOffset.value,
        lyricBar: {
          offsetX: lyricOffset.value.x,
          offsetY: lyricOffset.value.y,
          visible: subtitleVisible.value
        }
      })
    );
  } catch {
    // ignore persistence errors
  }
}

function setBgTab(tabKey) {
  bgTab.value = tabKey;
}

function selectBackground(id) {
  const item = backgroundItems.value.find((target) => target.id === id);
  if (!item || !item.src) return;

  if (backgroundApplyTarget.value === 'route') {
    ui.setRouteBackground(currentRouteKey.value, id);
  } else {
    ui.setGlobalBackgroundId(id);
  }

  l2dRenderFailed.value = false;
  videoFailed.value = false;
  syncActiveWallpaperSettingFromItem();
  queueWallpaperPreferenceSync();
}

function clearCurrentRouteBackground() {
  ui.clearRouteBackground(currentRouteKey.value);
  videoFailed.value = false;
  queueWallpaperPreferenceSync();
}

function normalizeEqLevel(raw, fallback = 0.5) {
  const value = Number(raw);
  if (!Number.isFinite(value)) return fallback;
  return Math.max(0, Math.min(1, value));
}

function eqLevelToDb(level) {
  const centered = normalizeEqLevel(level, 0.5) - 0.5;
  return Math.max(-12, Math.min(12, centered * 24));
}

function applyEqLevels(levels) {
  if (!eqLowNode || !eqMidNode || !eqHighNode) return;
  const sourceLevels = Array.isArray(levels) ? levels : [];
  const low = normalizeEqLevel(sourceLevels[0], 0.66);
  const mid = normalizeEqLevel(sourceLevels[1], 0.52);
  const high = normalizeEqLevel(sourceLevels[2], 0.74);
  eqLowNode.gain.value = eqLevelToDb(low);
  eqMidNode.gain.value = eqLevelToDb(mid);
  eqHighNode.gain.value = eqLevelToDb(high);
}

function ensureAudioAnalyser() {
  if (analyser || !player.audioElement || typeof window === 'undefined' || !window.AudioContext) return;
  audioCtx = new window.AudioContext();
  sourceNode = audioCtx.createMediaElementSource(player.audioElement);
  eqLowNode = audioCtx.createBiquadFilter();
  eqLowNode.type = 'lowshelf';
  eqLowNode.frequency.value = 180;
  eqLowNode.Q.value = 0.8;

  eqMidNode = audioCtx.createBiquadFilter();
  eqMidNode.type = 'peaking';
  eqMidNode.frequency.value = 1200;
  eqMidNode.Q.value = 0.95;

  eqHighNode = audioCtx.createBiquadFilter();
  eqHighNode.type = 'highshelf';
  eqHighNode.frequency.value = 5200;
  eqHighNode.Q.value = 0.72;

  analyser = audioCtx.createAnalyser();
  analyser.fftSize = 512;
  analyser.smoothingTimeConstant = 0.88;
  sourceNode.connect(eqLowNode);
  eqLowNode.connect(eqMidNode);
  eqMidNode.connect(eqHighNode);
  eqHighNode.connect(analyser);
  analyser.connect(audioCtx.destination);
  freqData = new Uint8Array(analyser.frequencyBinCount);
  applyEqLevels(musicUi.eqLevels.value);
}

function handleEqChangeEvent(event) {
  const levels = Array.isArray(event?.detail?.levels)
    ? event.detail.levels
    : Array.isArray(musicUi.eqLevels.value)
      ? musicUi.eqLevels.value
      : [0.66, 0.52, 0.74];
  ensureAudioAnalyser();
  if (audioCtx?.state === 'suspended') {
    audioCtx.resume().catch(() => {});
  }
  applyEqLevels(levels);
}

function stopVisualizerLoop() {
  if (rafId) {
    window.cancelAnimationFrame(rafId);
    rafId = 0;
  }
  lastVisualizerFrameAt = 0;
}

function pumpVisualizer(timestamp = 0) {
  if (!shouldRunVisualizer.value || !analyser || !freqData) {
    stopVisualizerLoop();
    return;
  }

  if (timestamp - lastVisualizerFrameAt < VISUALIZER_FRAME_MS) {
    rafId = window.requestAnimationFrame(pumpVisualizer);
    return;
  }
  lastVisualizerFrameAt = timestamp;

  analyser.getByteFrequencyData(freqData);

  barLevels.value = barLevels.value.map((_, index) => {
    const freqIndex = Math.floor((index / barLevels.value.length) * freqData.length);
    return Math.pow((freqData[freqIndex] || 0) / 255, 1.35);
  });

  ringLevels.value = ringLevels.value.map((_, index) => {
    const freqIndex = Math.floor((index / ringLevels.value.length) * freqData.length);
    return Math.pow((freqData[freqIndex] || 0) / 255, 1.55);
  });

  rafId = window.requestAnimationFrame(pumpVisualizer);
}

function startVisualizerLoop() {
  if (rafId) return;
  ensureAudioAnalyser();
  if (audioCtx?.state === 'suspended') {
    audioCtx.resume().catch(() => {});
  }
  if (!analyser || !freqData) return;
  lastVisualizerFrameAt = 0;
  rafId = window.requestAnimationFrame(pumpVisualizer);
}

function barStyle(level, index) {
  const style = barsVisualizerClass.value;
  const baseHeight = style === 'bars-firefly' ? 8 : 10;
  const gain = style === 'bars-crystal' ? 40 : style === 'bars-firefly' ? 36 : 44;
  const spreadHue = style === 'bars-crystal' ? 56 : 42;
  const hue = 248 + (index / Math.max(1, barLevels.value.length)) * spreadHue;

  return {
    height: `${baseHeight + level * gain}px`,
    '--bar-hue': `${hue}`,
    '--bar-opacity': `${0.45 + level * 0.55}`,
    '--bar-scale': `${0.84 + level * 0.36}`
  };
}

function ringSegStyle(level, index) {
  const style = ringVisualizerClass.value;
  const total = ringLevels.value.length;
  const angle = (360 / total) * index;
  const radius = style === 'ring-orbit' ? 176 : style === 'ring-pulse' ? 162 : 170;
  const base = style === 'ring-orbit' ? 8 : style === 'ring-pulse' ? 14 : 10;
  const gain = style === 'ring-orbit' ? 28 : style === 'ring-pulse' ? 38 : 32;
  const len = base + level * gain;
  return {
    transform: `rotate(${angle}deg) translateY(-${radius}px)`,
    height: `${len}px`,
    opacity: 0.2 + level * 0.5,
    '--ring-hue': `${250 + (index / Math.max(1, total)) * 48}`
  };
}

function setVisualizerMode(mode) {
  if (!isHomeRoute.value) return;
  if (mode !== 'bars' && mode !== 'ring') return;
  player.setVisualizerMode(mode);
}

function setVisualizerStyle(style) {
  if (!isHomeRoute.value) return;
  player.setVisualizerStyle(style);
}

function bottomFloatingStyle(offset) {
  return {
    transform: `translate(calc(-50% + ${offset.x}px), ${offset.y}px)`
  };
}

function startDrag(event) {
  if (!interactionAllowed.value || event.button !== 0) return;
  dragState.pointerId = event.pointerId;
  dragState.startX = event.clientX;
  dragState.startY = event.clientY;
  dragState.originX = lyricOffset.value.x;
  dragState.originY = lyricOffset.value.y;
}

function onGlobalPointerMove(event) {
  if (!interactionAllowed.value) return;
  if (dragState.pointerId === null || event.pointerId !== dragState.pointerId) return;
  const dx = event.clientX - dragState.startX;
  const dy = event.clientY - dragState.startY;
  lyricOffset.value = {
    x: Math.max(-520, Math.min(520, dragState.originX + dx)),
    y: Math.max(-340, Math.min(340, dragState.originY + dy))
  };
}

function onGlobalPointerUp(event) {
  if (!interactionAllowed.value) return;
  if (dragState.pointerId === null || event.pointerId !== dragState.pointerId) return;
  dragState.pointerId = null;
}

function releaseLyricPointer() {
  dragState.pointerId = null;
}

function onVisibilityChange() {
  pageVisible.value = typeof document === 'undefined' ? true : !document.hidden;
  if (!pageVisible.value) {
    releaseLyricPointer();
  }
  recordWindowDiag('app.visibilitychange', {
    hidden: !pageVisible.value,
    visibilityState: typeof document === 'undefined' ? 'unknown' : document.visibilityState
  });
}

function onWindowBlur(event) {
  if (typeof window !== 'undefined' && event?.target && event.target !== window) return;
  windowFocused.value = false;
  releaseLyricPointer();
  recordWindowDiag('app.blur', { hasFocus: false });
}

function onWindowFocus(event) {
  if (typeof window !== 'undefined' && event?.target && event.target !== window) return;
  windowFocused.value = true;
  recordWindowDiag('app.focus', { hasFocus: true });
}

function onPageHide(event) {
  pageVisible.value = false;
  windowFocused.value = false;
  releaseLyricPointer();
  recordWindowDiag('app.pagehide', { persisted: Boolean(event?.persisted) });
}

function onPageShow(event) {
  pageVisible.value = typeof document === 'undefined' ? true : !document.hidden;
  windowFocused.value = typeof document === 'undefined' ? true : document.hasFocus();
  recordWindowDiag('app.pageshow', {
    persisted: Boolean(event?.persisted),
    hidden: !pageVisible.value,
    hasFocus: windowFocused.value
  });
}

function updateViewportMode() {
  isMobileViewport.value = window.matchMedia('(max-width: 900px), (orientation: portrait)').matches;
}

function toggleMenu() {
  menuExpanded.value = !menuExpanded.value;
}

function toggleAiChat() {
  if (isAiTavernRoute.value) return;
  aiChatActive.value = !aiChatActive.value;
}

function closeAiChat() {
  aiChatActive.value = false;
}

function handleMainRouteSelect(routeKey) {
  const nextPath = routePathByKey[routeKey] || '/';
  if (route.path === nextPath) return;
  router.push(nextPath);
}

function resolveRouteViewKey(viewRoute) {
  const path = String(viewRoute?.path || '');
  if (path.startsWith('/music-library')) {
    return 'music-library-shell';
  }
  return String(viewRoute?.fullPath || path || 'route');
}

function normalizeRedirectPath(path) {
  if (!path || typeof path !== 'string') return '/profile';
  if (!path.startsWith('/')) return '/profile';
  if (path.startsWith('/auth')) return '/profile';
  return path;
}

function openAuth(redirectPath) {
  const redirect = normalizeRedirectPath(redirectPath || route.fullPath || '/profile');
  router.push({
    path: '/auth',
    query: { redirect }
  });
}

function openProfile(tabKey = 'profile') {
  if (!auth.isAuthenticated.value) {
    const redirect = tabKey ? `/profile?tab=${encodeURIComponent(tabKey)}` : '/profile';
    openAuth(redirect);
    return;
  }
  const nextQuery = tabKey ? { tab: tabKey } : {};
  const currentTab = typeof route.query?.tab === 'string' ? route.query.tab : '';
  if (route.path === '/profile' && currentTab === (tabKey || '')) return;
  router.push({ path: '/profile', query: nextQuery });
}

function openAdmin(tabKey = 'overview') {
  if (!auth.isAuthenticated.value) {
    const redirect = tabKey ? `/admin?tab=${encodeURIComponent(tabKey)}` : '/admin';
    openAuth(redirect);
    return;
  }
  if (!isAdminUser.value) {
    openProfile('profile');
    return;
  }

  const nextQuery = tabKey ? { tab: tabKey } : {};
  const currentTab = typeof route.query?.tab === 'string' ? route.query.tab : '';
  if (route.path === '/admin' && currentTab === (tabKey || '')) return;
  router.push({ path: '/admin', query: nextQuery });
}

function openAuthor(tabKey = 'overview') {
  if (tabKey === 'edit' && !isAdminUser.value) {
    tabKey = 'overview';
  }
  const nextQuery = tabKey ? { tab: tabKey } : {};
  const currentTab = typeof route.query?.tab === 'string' ? route.query.tab : '';
  if (route.path === '/author' && currentTab === (tabKey || '')) return;
  router.push({ path: '/author', query: nextQuery });
}

function handleSelectTrack(index) {
  player.selectTrackByIndex(index, true);
}

function handleReorderTracks(payload) {
  player.reorderTracks(payload.from, payload.to);
}

function openPlayerSettings() {
  openProfile('settings');
}

async function handleLogout() {
  await auth.logout();
  if (route.meta?.requiresAuth || route.path === '/profile' || route.path === '/admin') {
    router.replace({
      path: '/auth',
      query: {
        reason: 'signed_out',
        redirect: route.path === '/admin' ? '/admin' : '/profile'
      }
    });
  }
}

function onGlobalPointerDown(event) {
  if (!interactionAllowed.value) return;
  if (event.button !== 0) return;
  const target = event.target;
  if (!(target instanceof Element)) return;

  if (shouldRunVisualizer.value && audioCtx?.state === 'suspended') {
    audioCtx.resume().catch(() => {});
  }

  const trigger = target.closest('.ripple-trigger');
  if (!trigger) return;

  const rect = trigger.getBoundingClientRect();
  const baseSize = Math.max(rect.width, rect.height);
  const size = Math.max(72, Math.min(148, baseSize * 1.6));
  const x = rect.left + rect.width * 0.5 - size * 0.5;
  const y = rect.top + rect.height * 0.5 - size * 0.5;
  const id = rippleSeq++;

  clickRipples.value.push({ id, size, x, y });

  window.setTimeout(() => {
    clickRipples.value = clickRipples.value.filter((ripple) => ripple.id !== id);
  }, 560);
}

function onGlobalHotkey(event) {
  if (!interactionAllowed.value) return;
  if (!event.ctrlKey || !event.shiftKey || event.altKey || event.metaKey) return;

  const target = event.target;
  if (target instanceof HTMLElement) {
    const tag = target.tagName;
    if (tag === 'INPUT' || tag === 'TEXTAREA' || target.isContentEditable) return;
  }

  if (event.code === 'Backquote') {
    event.preventDefault();
    levitationRef.value?.toggleExpanded?.();
    return;
  }

  if (event.code === 'Minus') {
    event.preventDefault();
    toggleAiChat();
    return;
  }

  if (event.code === 'Equal') {
    event.preventDefault();
    toggleMenu();
    return;
  }

  if (event.code === 'Digit1' || event.code === 'Digit2' || event.code === 'Digit3' || event.code === 'Digit4') {
    event.preventDefault();
    const index = Number(event.code.replace('Digit', ''));
    levitationRef.value?.triggerMenuByIndex?.(index);
    return;
  }

  if (event.code === 'KeyM') {
    event.preventDefault();
    player.setPlayerExpanded(!player.isPlayerExpanded.value);
    return;
  }

  if (event.code === 'ArrowLeft') {
    event.preventDefault();
    player.playPrev();
    return;
  }

  if (event.code === 'ArrowRight') {
    event.preventDefault();
    player.playNext();
    return;
  }

  if (event.code === 'KeyP') {
    event.preventDefault();
    player.togglePlay();
    return;
  }

  if (event.code === 'ArrowUp') {
    event.preventDefault();
    player.adjustVolume(0.05);
    return;
  }

  if (event.code === 'ArrowDown') {
    event.preventDefault();
    player.adjustVolume(-0.05);
  }
}

watch([subtitleVisible, lyricOffset], persistExtra, { deep: true });
watch(activeBackgroundId, () => {
  videoFailed.value = false;
  l2dRenderFailed.value = false;
  syncActiveWallpaperSettingFromItem(true);
  applyWallpaperAudioState();
});
watch(
  () => [activeWallpaperBgmUrl.value, activeWallpaperBgvUrl.value],
  () => {
    applyWallpaperAudioState();
  },
  { immediate: true }
);
watch(
  () => [
    wallpaperSettingState.masterVolume,
    wallpaperSettingState.bgmVolume,
    wallpaperSettingState.bgvVolume,
    wallpaperSettingState.bgmEnabled,
    wallpaperSettingState.bgvEnabled
  ],
  () => {
    applyWallpaperAudioState();
    queueWallpaperPreferenceSync();
  }
);
watch(
  () => wallpaperSettingState.customValues,
  () => {
    applyWallpaperCustomVariables();
    saveActiveCustomValueSnapshot();
    queueWallpaperPreferenceSync();
  },
  { deep: true }
);
watch(
  () => [ui.state.globalBackgroundId, JSON.stringify(ui.state.routeBackgroundByKey || {})],
  () => {
    queueWallpaperPreferenceSync();
  }
);
watch(
  () => route.fullPath,
  async () => {
    await nextTick();
    refreshAosManager();
  },
  { immediate: true }
);
watch(
  canUseSidebarAi,
  (allowed) => {
    if (allowed) return;
    if (sidebarAiCloseTimer) {
      window.clearTimeout(sidebarAiCloseTimer);
      sidebarAiCloseTimer = 0;
    }
    sidebarAiColumnVisible.value = false;
  },
  { immediate: true }
);

watch(
  showSidebarAiPanel,
  (opened) => {
    if (sidebarAiCloseTimer) {
      window.clearTimeout(sidebarAiCloseTimer);
      sidebarAiCloseTimer = 0;
    }

    if (opened) {
      sidebarAiColumnVisible.value = true;
      return;
    }

    if (!sidebarAiColumnVisible.value) return;
    sidebarAiCloseTimer = window.setTimeout(() => {
      sidebarAiColumnVisible.value = false;
      sidebarAiCloseTimer = 0;
    }, AI_SIDEBAR_EXIT_MS);
  },
  { immediate: true }
);

watch(
  () => (Array.isArray(musicUi.eqLevels.value) ? musicUi.eqLevels.value.slice() : []),
  (levels) => {
    if (!eqLowNode || !eqMidNode || !eqHighNode) return;
    applyEqLevels(levels);
  }
);

watch(
  [shouldRunVisualizer, visualizerPaused],
  ([enabled, paused]) => {
    if (typeof window === 'undefined') return;
    if (enabled && !paused) {
      startVisualizerLoop();
      return;
    }
    stopVisualizerLoop();
    if (!enabled || runtimeGuards.disableVisualizerLoop) {
      barLevels.value = barLevels.value.map(() => 0);
      ringLevels.value = ringLevels.value.map(() => 0);
    }
  },
  { immediate: true }
);

onMounted(async () => {
  await auth.ensureReady();
  ui.initializeUiPreferences();
  loadPersistedExtra();
  await loadRemoteWallpaperPreference();
  await loadBackgroundLibrary();
  applyWallpaperCustomVariables();
  applyWallpaperAudioState();
  updateViewportMode();
  recordWindowDiag('app.guard.state', runtimeGuards);

  window.addEventListener('resize', updateViewportMode);
  document.addEventListener('visibilitychange', onVisibilityChange);
  window.addEventListener('blur', onWindowBlur);
  window.addEventListener('focus', onWindowFocus);
  window.addEventListener('pagehide', onPageHide);
  window.addEventListener('pageshow', onPageShow);
  window.addEventListener(MUSIC_EQ_CHANGE_EVENT, handleEqChangeEvent);

  if (!runtimeGuards.disableGlobalPointerHooks) {
    window.addEventListener('keydown', onGlobalHotkey);
    window.addEventListener('pointerdown', onGlobalPointerDown, true);
    window.addEventListener('pointermove', onGlobalPointerMove, true);
    window.addEventListener('pointerup', onGlobalPointerUp, true);
    window.addEventListener('pointercancel', onGlobalPointerUp, true);
  } else {
    recordWindowDiag('app.guard.pointer.disabled');
  }
});

onBeforeUnmount(() => {
  stopImportPolling();
  if (wallpaperPreferenceSaveTimer) {
    window.clearTimeout(wallpaperPreferenceSaveTimer);
    wallpaperPreferenceSaveTimer = 0;
  }
  if (sidebarAiCloseTimer) {
    window.clearTimeout(sidebarAiCloseTimer);
    sidebarAiCloseTimer = 0;
  }

  window.removeEventListener('resize', updateViewportMode);
  document.removeEventListener('visibilitychange', onVisibilityChange);
  window.removeEventListener('blur', onWindowBlur);
  window.removeEventListener('focus', onWindowFocus);
  window.removeEventListener('pagehide', onPageHide);
  window.removeEventListener('pageshow', onPageShow);
  window.removeEventListener(MUSIC_EQ_CHANGE_EVENT, handleEqChangeEvent);
  window.removeEventListener('keydown', onGlobalHotkey);
  window.removeEventListener('pointerdown', onGlobalPointerDown, true);
  window.removeEventListener('pointermove', onGlobalPointerMove, true);
  window.removeEventListener('pointerup', onGlobalPointerUp, true);
  window.removeEventListener('pointercancel', onGlobalPointerUp, true);
  stopVisualizerLoop();
  if (audioCtx) {
    audioCtx.close().catch(() => {});
    audioCtx = null;
    sourceNode = null;
    eqLowNode = null;
    eqMidNode = null;
    eqHighNode = null;
    analyser = null;
    freqData = null;
  }
});
</script>

<style scoped>
.app-shell {
  position: relative;
  width: 100%;
  height: 100%;
  overflow: hidden;
  isolation: isolate;
  background: linear-gradient(120deg, #1d2230, #211e34, #1b2538);
}

.bg-layer {
  position: fixed;
  inset: 0;
  z-index: 0;
  pointer-events: none;
  overflow: hidden;
}

.bg-image,
.bg-video {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  object-fit: cover;
  object-position: center;
  filter: brightness(0.64) saturate(118%);
  transition: filter 420ms cubic-bezier(0.22, 1, 0.36, 1);
}

.bg-layer.home .bg-image,
.bg-layer.home .bg-video {
  filter: brightness(0.98) saturate(108%);
}

.bg-video {
  z-index: 1;
}

.bg-fx {
  position: absolute;
  inset: 0;
  z-index: 2;
  background: linear-gradient(180deg, rgba(8, 11, 18, 0.34), rgba(8, 11, 18, 0.52));
  backdrop-filter: blur(7px) saturate(120%);
  -webkit-backdrop-filter: blur(7px) saturate(120%);
  opacity: 1;
  transition:
    opacity 360ms ease,
    backdrop-filter 360ms ease,
    -webkit-backdrop-filter 360ms ease;
}

.bg-fx.bg-fx-home {
  opacity: 0;
  backdrop-filter: blur(0px) saturate(100%);
  -webkit-backdrop-filter: blur(0px) saturate(100%);
}

.workspace-shell {
  --music-top-offset-collapsed: 58px;
  --music-top-offset-expanded: 134px;
  --music-bottom-offset: 14px;
  --music-top-offset-current: var(--music-top-offset-collapsed);
  position: relative;
  z-index: 40;
  height: 100%;
  box-sizing: border-box;
  padding: 58px 14px 14px;
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: minmax(0, 1fr);
  gap: 12px;
  transition: padding-top 260ms ease;
}

.workspace-shell.expanded {
  --music-top-offset-current: var(--music-top-offset-expanded);
  padding-top: 134px;
}

.workspace-shell.with-ai-panel {
  grid-template-columns: minmax(0, 3fr) minmax(300px, 1fr);
}

.workspace-shell > .route-content,
.workspace-shell > .ai-side-column {
  min-height: 0;
  height: 100%;
}

.route-content {
  min-height: 0;
  overflow: auto;
  scrollbar-width: thin;
  scrollbar-color: rgba(120, 132, 158, 0.48) rgba(9, 14, 24, 0.12);
  border-radius: 18px;
  padding: 16px;
  background: rgba(10, 14, 22, 0.32);
  border: 1px solid rgba(255, 255, 255, 0.18);
  box-shadow: 0 14px 32px rgba(6, 10, 18, 0.22);
  transition:
    background-color 340ms ease,
    border-color 320ms ease,
    box-shadow 360ms ease,
    padding 260ms ease;
}

.route-content::-webkit-scrollbar {
  width: 10px;
  height: 10px;
}

.route-content::-webkit-scrollbar-track {
  background: rgba(9, 14, 24, 0.14);
  border-radius: 999px;
}

.route-content::-webkit-scrollbar-thumb {
  border-radius: 999px;
  border: 2px solid transparent;
  background: linear-gradient(180deg, rgba(156, 172, 205, 0.62), rgba(115, 128, 156, 0.5));
  background-clip: content-box;
}

.route-content::-webkit-scrollbar-thumb:hover {
  background: linear-gradient(180deg, rgba(177, 194, 232, 0.72), rgba(135, 149, 181, 0.62));
  background-clip: content-box;
}

.route-content.route-content-home {
  background: transparent;
  border: 0;
  box-shadow: none;
  padding: 0;
}

.route-content.route-content-blog {
  display: flex;
  overflow: hidden;
}

.route-content.route-content-blog > .route-page-view {
  flex: 1;
  min-width: 0;
  min-height: 0;
  height: 100%;
}

.route-content.route-content-music-player {
  background: transparent;
  border: 0;
  box-shadow: none;
  padding: 0;
  overflow: hidden;
  height: calc(100dvh - var(--music-top-offset-current) - var(--music-bottom-offset));
}

.route-content.route-content-music-shell {
  overflow: hidden;
  padding: 8px;
}

.route-page-view {
  min-height: 100%;
}

.route-switch-enter-active,
.route-switch-leave-active {
  transition: opacity 260ms ease, transform 340ms cubic-bezier(0.22, 1, 0.36, 1);
}

.route-switch-enter-from {
  opacity: 0;
  transform: translateY(12px) scale(0.992);
}

.route-switch-leave-to {
  opacity: 0;
  transform: translateY(-8px) scale(0.995);
}

.ai-side-column {
  min-height: 0;
  overflow: hidden;
  transform-origin: right center;
  will-change: transform, opacity;
}

@media (prefers-reduced-motion: reduce) {
  .route-switch-enter-active,
  .route-switch-leave-active {
    transition: opacity 120ms linear;
  }

  .route-switch-enter-from,
  .route-switch-leave-to {
    transform: none;
    opacity: 0;
  }

}

.global-lyric-bar {
  --liquid-bg: rgba(var(--glass-rgb), 0.34);
  --liquid-border: rgba(255, 255, 255, 0.4);
  --liquid-shadow: 0 8px 22px rgba(7, 11, 18, 0.2);
  position: fixed;
  left: 50%;
  bottom: 96px;
  min-width: min(82vw, 760px);
  max-width: 90vw;
  min-height: 50px;
  border-radius: 25px;
  display: grid;
  place-items: center;
  z-index: 1100;
  color: rgba(245, 248, 255, 0.92);
  text-shadow: 0 2px 8px rgba(0, 0, 0, 0.34);
  cursor: grab;
  user-select: none;
}

.global-bars {
  position: fixed;
  left: 50%;
  bottom: 20px;
  width: min(94vw, 1040px);
  height: 74px;
  display: flex;
  align-items: end;
  justify-content: center;
  gap: 5px;
  z-index: 1020;
  pointer-events: none;
  filter: drop-shadow(0 4px 10px rgba(0, 0, 0, 0.38));
}

.global-bars::before {
  content: '';
  position: absolute;
  inset: 6px 2%;
  border-radius: 999px;
  background: radial-gradient(ellipse at center, rgba(8, 12, 18, 0.32), rgba(8, 12, 18, 0.08) 60%, rgba(8, 12, 18, 0));
  border: 1px solid rgba(255, 255, 255, 0.12);
  z-index: -1;
}

.bar {
  width: 6px;
  border-radius: 4px;
  position: relative;
  overflow: hidden;
  transform-origin: center bottom;
  opacity: var(--bar-opacity, 0.85);
  transform: scaleY(var(--bar-scale, 1));
  transition: height 86ms linear, transform 110ms ease, opacity 110ms ease;
  border: 1px solid rgba(255, 255, 255, 0.42);
}

.bar::after {
  content: '';
  position: absolute;
  inset: 0;
  border-radius: inherit;
  background: linear-gradient(180deg, rgba(255, 255, 255, 0.56), rgba(255, 255, 255, 0));
  mix-blend-mode: screen;
  opacity: 0.8;
}

.global-bars.bars-neon .bar {
  background: linear-gradient(180deg, rgba(var(--accent-soft-rgb), 0.94), rgba(var(--accent-strong-rgb), 0.84));
  box-shadow:
    0 0 0 1px rgba(var(--accent-soft-rgb), 0.2),
    0 0 14px rgba(var(--accent-rgb), 0.42),
    0 0 24px rgba(var(--accent-rgb), 0.24);
}

.global-bars.bars-crystal .bar {
  background: linear-gradient(180deg, rgba(255, 255, 255, 0.98), rgba(var(--accent-soft-rgb), 0.92));
  box-shadow:
    0 0 0 1px rgba(255, 255, 255, 0.34),
    0 0 14px rgba(var(--accent-rgb), 0.3),
    0 0 26px rgba(255, 255, 255, 0.18);
}

.global-bars.bars-firefly .bar {
  background: linear-gradient(180deg, hsla(var(--bar-hue), 96%, 82%, 0.95), hsla(var(--bar-hue), 90%, 62%, 0.78));
  box-shadow:
    0 0 0 1px hsla(var(--bar-hue), 96%, 86%, 0.42),
    0 0 16px hsla(var(--bar-hue), 96%, 70%, 0.38),
    0 0 24px hsla(var(--bar-hue), 96%, 70%, 0.22);
  animation: bar-sway 1.8s ease-in-out infinite;
}

.global-ring {
  position: fixed;
  left: 50%;
  top: 50%;
  z-index: 1018;
  pointer-events: none;
  filter: drop-shadow(0 4px 12px rgba(0, 0, 0, 0.42));
}

.ring-core {
  width: 348px;
  height: 348px;
  position: relative;
  display: grid;
  place-items: center;
}

.ring-core::before {
  content: '';
  position: absolute;
  inset: 80px;
  border-radius: 50%;
  border: 2px solid rgba(var(--accent-soft-rgb), 0.32);
  box-shadow:
    inset 0 0 24px rgba(var(--accent-rgb), 0.22),
    0 0 28px rgba(var(--accent-rgb), 0.2);
}

.ring-core::after {
  content: '';
  position: absolute;
  inset: 92px;
  border-radius: 50%;
  background: radial-gradient(circle, rgba(8, 12, 18, 0.24), rgba(8, 12, 18, 0.06) 65%, rgba(8, 12, 18, 0));
  z-index: -1;
}

.global-ring.ring-orbit .ring-core::before {
  border-style: dashed;
  border-color: rgba(var(--accent-soft-rgb), 0.34);
  box-shadow:
    inset 0 0 18px rgba(var(--accent-rgb), 0.2),
    0 0 20px rgba(var(--accent-rgb), 0.16);
}

.global-ring.ring-pulse .ring-core::before {
  border-width: 2px;
  border-color: rgba(var(--accent-soft-rgb), 0.28);
  animation: ring-breathe 2.3s ease-in-out infinite;
}

.ring-seg {
  position: absolute;
  width: 5px;
  border-radius: 4px;
  background: linear-gradient(180deg, hsla(var(--ring-hue), 94%, 84%, 0.88), hsla(var(--ring-hue), 92%, 66%, 0.74));
  transform-origin: center 170px;
  transition: height 90ms linear, opacity 120ms ease;
  border: 1px solid rgba(255, 255, 255, 0.4);
  box-shadow:
    0 0 0 1px rgba(var(--accent-soft-rgb), 0.18),
    0 0 10px rgba(var(--accent-rgb), 0.36);
}

.global-ring.ring-orbit .ring-seg {
  width: 4px;
  border-radius: 999px;
  box-shadow:
    0 0 0 1px rgba(var(--accent-soft-rgb), 0.18),
    0 0 10px rgba(var(--accent-rgb), 0.28);
}

.global-ring.ring-pulse .ring-seg {
  width: 6px;
  border-radius: 999px;
  box-shadow:
    0 0 0 1px rgba(var(--accent-soft-rgb), 0.24),
    0 0 12px rgba(var(--accent-rgb), 0.38),
    0 0 20px rgba(var(--accent-rgb), 0.22);
  animation: ring-seg-pulse 1.9s ease-in-out infinite;
}

@keyframes bar-sway {
  0%, 100% { transform: translateY(0) scaleY(var(--bar-scale, 1)); }
  50% { transform: translateY(-2px) scaleY(calc(var(--bar-scale, 1) * 1.06)); }
}

@keyframes ring-breathe {
  0%, 100% { transform: scale(0.96); opacity: 0.72; }
  50% { transform: scale(1.04); opacity: 1; }
}

@keyframes ring-seg-pulse {
  0%, 100% { filter: brightness(0.94); }
  50% { filter: brightness(1.14); }
}

.bg-picker-mask {
  position: fixed;
  inset: 0;
  z-index: 1500;
  background: rgba(10, 12, 18, 0.42);
  display: grid;
  place-items: center;
}

.bg-picker {
  --liquid-bg: rgba(var(--glass-rgb), 0.38);
  --liquid-border: rgba(255, 255, 255, 0.46);
  --liquid-shadow: 0 16px 44px rgba(8, 12, 20, 0.32);
  width: min(94vw, 980px);
  max-height: min(88vh, 760px);
  border-radius: 22px;
  padding: 14px;
  overflow: hidden;
  display: flex;
  flex-direction: column;
  gap: 10px;
}

.picker-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.picker-title {
  color: rgba(23, 27, 36, 0.9);
  font-size: 18px;
  font-weight: 700;
}

.picker-close {
  border: 0;
  border-radius: 10px;
  min-width: 60px;
  height: 32px;
  background: rgba(255, 255, 255, 0.38);
  color: rgba(30, 34, 42, 0.8);
}

.picker-tabs {
  display: flex;
  align-items: center;
  gap: 8px;
}

.tab-btn {
  border: 0;
  border-radius: 10px;
  min-width: 78px;
  height: 32px;
  background: rgba(255, 255, 255, 0.34);
  color: rgba(27, 31, 40, 0.78);
}

.tab-btn.active {
  background: rgba(var(--accent-strong-rgb), 0.86);
  color: rgba(248, 238, 255, 0.94);
}

.picker-apply-mode {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px;
}

.scope-btn {
  border: 0;
  border-radius: 10px;
  min-height: 32px;
  padding: 0 12px;
  background: rgba(255, 255, 255, 0.34);
  color: rgba(27, 31, 40, 0.78);
}

.scope-btn.active {
  background: rgba(var(--accent-rgb), 0.3);
  color: rgba(248, 238, 255, 0.94);
}

.scope-btn.danger {
  background: rgba(235, 94, 124, 0.2);
  color: rgba(135, 27, 50, 0.9);
}

.route-bg-note {
  color: rgba(28, 32, 40, 0.82);
  font-size: 12px;
}

.wallpaper-audio {
  position: absolute;
  width: 1px;
  height: 1px;
  opacity: 0;
  pointer-events: none;
}

.picker-status {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px;
}

.picker-import-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.import-card {
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.24);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.import-card h4 {
  margin: 0;
  color: rgba(24, 28, 38, 0.88);
  font-size: 13px;
}

.field-input-lite {
  width: 100%;
  border: 0;
  border-radius: 10px;
  min-height: 32px;
  padding: 0 10px;
  background: rgba(255, 255, 255, 0.6);
  color: rgba(24, 28, 38, 0.9);
}

.wallpaper-settings {
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.26);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.settings-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.settings-grid label {
  display: grid;
  gap: 4px;
  color: rgba(28, 32, 40, 0.86);
  font-size: 12px;
}

.settings-checks {
  display: flex;
  align-items: center;
  gap: 14px;
}

.settings-checks label {
  color: rgba(25, 30, 40, 0.86);
  font-size: 12px;
}

.settings-custom {
  display: grid;
  gap: 8px;
}

.settings-custom h4 {
  margin: 0;
  color: rgba(25, 30, 40, 0.88);
  font-size: 13px;
}

.custom-row {
  display: grid;
  grid-template-columns: 140px minmax(0, 1fr);
  align-items: center;
  gap: 8px;
}

.custom-row label {
  color: rgba(24, 28, 38, 0.88);
  font-size: 12px;
}

.picker-grid {
  flex: 1;
  min-height: 0;
  overflow: auto;
  -webkit-overflow-scrolling: touch;
  touch-action: pan-y;
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(132px, 1fr));
  gap: 10px;
}

.picker-item {
  border: 0;
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.3);
  padding: 6px;
  display: grid;
  gap: 4px;
}

.picker-item.active {
  box-shadow: inset 0 0 0 2px rgba(var(--accent-rgb), 0.82);
}

.picker-preview {
  width: 100%;
  height: 88px;
  object-fit: cover;
  border-radius: 8px;
}

.picker-name {
  color: rgba(28, 32, 40, 0.84);
  font-size: 12px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.picker-meta {
  color: rgba(34, 38, 48, 0.68);
  font-size: 11px;
}

.click-ripple-layer {
  position: fixed;
  inset: 0;
  z-index: 2200;
  pointer-events: none;
  overflow: hidden;
}

.click-ripple {
  position: absolute;
  border-radius: 50%;
  border: 1.2px solid rgba(var(--accent-rgb), 0.28);
  background: radial-gradient(circle, rgba(var(--accent-rgb), 0.24) 0%, rgba(var(--accent-rgb), 0.12) 38%, rgba(var(--accent-rgb), 0) 74%);
  box-shadow: 0 0 0 1px rgba(var(--accent-rgb), 0.2);
  transform: scale(0.2);
  opacity: 0.72;
  animation: click-ripple 560ms cubic-bezier(0.22, 1, 0.36, 1) forwards;
}

.lyric-fade-enter-active,
.lyric-fade-leave-active,
.picker-fade-enter-active,
.picker-fade-leave-active {
  transition: opacity 180ms ease;
}

.lyric-fade-enter-from,
.lyric-fade-leave-to,
.picker-fade-enter-from,
.picker-fade-leave-to {
  opacity: 0;
}

@keyframes click-ripple {
  0% {
    transform: scale(0.2);
    opacity: 0.74;
  }
  100% {
    transform: scale(1.85);
    opacity: 0;
  }
}

@media (max-width: 900px) {
  .workspace-shell {
    --music-top-offset-collapsed: 50px;
    --music-top-offset-expanded: 70px;
    --music-bottom-offset: 10px;
    padding: 50px 10px 10px 48px;
  }

  .workspace-shell.expanded {
    --music-top-offset-current: var(--music-top-offset-expanded);
    padding-top: 70px;
  }

  .workspace-shell.with-ai-panel {
    grid-template-columns: 1fr;
  }

  .route-content {
    border-radius: 14px;
    padding: 12px;
    padding-bottom: 154px;
  }

  .route-content.route-content-music-player {
    border-radius: 14px;
    padding: 0;
    border: 0;
    background: transparent;
    box-shadow: none;
  }

  .route-content.route-content-music-shell {
    padding: 6px;
  }

  .global-lyric-bar {
    bottom: 114px;
    min-width: min(92vw, 640px);
  }

  .global-bars {
    bottom: 108px;
    height: 64px;
    width: min(92vw, 760px);
    gap: 4px;
  }

  .bar {
    width: 5px;
  }
}

@media (max-width: 600px), (orientation: portrait) {
  .workspace-shell {
    --music-top-offset-collapsed: 10px;
    --music-top-offset-expanded: 16px;
    --music-bottom-offset: 8px;
    padding: 10px 8px 8px 44px;
  }

  .workspace-shell.expanded {
    --music-top-offset-current: var(--music-top-offset-expanded);
    padding-top: 16px;
  }

  .route-content {
    padding: 10px;
    padding-bottom: 150px;
  }

  .route-content.route-content-music-player {
    padding: 0;
    border: 0;
    background: transparent;
    box-shadow: none;
  }

  .route-content.route-content-music-shell {
    padding: 4px;
  }

  .global-lyric-bar {
    bottom: 112px;
    min-width: min(92vw, 640px);
  }

  .global-bars {
    bottom: 114px;
    height: 56px;
    width: min(94vw, 620px);
    gap: 3px;
  }

  .bg-picker {
    width: calc(100vw - 12px);
    max-height: 90vh;
    border-radius: 16px;
    padding: 10px;
  }

  .picker-import-grid,
  .settings-grid {
    grid-template-columns: 1fr;
  }

  .custom-row {
    grid-template-columns: 1fr;
  }

  .picker-grid {
    grid-template-columns: repeat(auto-fill, minmax(116px, 1fr));
  }
}
</style>
