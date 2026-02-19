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
        <div class="bg-fx" :class="{ 'bg-fx-home': isHomeRoute }"></div>
      </div>

      <TopMenu
        :menu-expanded="menuExpanded"
        :ai-chat-active="aiChatActive"
        @toggle-menu="toggleMenu"
        @toggle-ai-chat="toggleAiChat"
        @select-main-route="handleMainRouteSelect"
        @open-profile="openProfile"
        @open-author="openAuthor"
        @open-background-picker="backgroundPickerVisible = true"
      />

      <section class="workspace-shell" :class="{ expanded: menuExpanded, 'with-ai-panel': sidebarAiColumnMounted }">
        <main class="route-content" :class="{ 'route-content-home': isHomeRoute }">
          <RouterView v-slot="{ Component, route: viewRoute }">
            <transition name="route-switch" mode="out-in">
              <component :is="Component" :key="viewRoute.fullPath" class="route-page-view" />
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
          v-if="subtitleVisible"
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
              </button>
            </div>
          </section>
        </div>
      </transition>

      <LevitationBall ref="levitationRef" />

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
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { MotionConfig } from 'motion-v';
import { RouterView, useRoute, useRouter } from 'vue-router';
import AiDialog from './components/AiDialog.vue';
import LevitationBall from './components/LevitationBall.vue';
import MusicPlayer from './components/MusicPlayer.vue';
import TopMenu from './components/TopMenu.vue';
import { usePlayerEngine } from './composables/usePlayerEngine';
import { useUiPreferences } from './composables/useUiPreferences';
import { routePathByKey } from './router';

const PLAYER_STORAGE_KEY = 'shizuki.musicPlayer.v1';
const menuExpanded = ref(false);
const levitationRef = ref(null);
const clickRipples = ref([]);
const videoFailed = ref(false);
const backgroundPickerVisible = ref(false);
const backgroundItems = ref([]);
const bgTab = ref('all');
const backgroundApplyTarget = ref('route');
const subtitleVisible = ref(true);
const lyricOffset = ref({ x: 0, y: 0 });
const isMobileViewport = ref(false);
const barLevels = ref(Array.from({ length: 44 }, () => 0));
const ringLevels = ref(Array.from({ length: 72 }, () => 0));
const sidebarAiColumnVisible = ref(false);

const dragState = {
  pointerId: null,
  startX: 0,
  startY: 0,
  originX: 0,
  originY: 0
};

let rippleSeq = 0;
let audioCtx = null;
let analyser = null;
let freqData = null;
let rafId = 0;
let sidebarAiCloseTimer = 0;
const AI_SIDEBAR_EXIT_MS = 260;

const route = useRoute();
const router = useRouter();
const player = usePlayerEngine();
const ui = useUiPreferences();

const routeLabelMap = {
  home: '主页',
  blog: '博客',
  'music-library': '音乐库',
  apps: '轻应用',
  'ai-tavern': 'AI酒馆',
  profile: '个人页面',
  author: '作者介绍'
};

const currentRouteKey = computed(() => {
  const name = typeof route.name === 'string' ? route.name : 'home';
  return Object.prototype.hasOwnProperty.call(routeLabelMap, name) ? name : 'home';
});

const currentRouteLabel = computed(() => routeLabelMap[currentRouteKey.value] || '主页');
const isHomeRoute = computed(() => currentRouteKey.value === 'home');
const isAiTavernRoute = computed(() => currentRouteKey.value === 'ai-tavern');

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
const shouldRunVisualizer = computed(() => isHomeRoute.value && ['bars', 'ring'].includes(player.visualizerMode.value));
const activeVisualizerStyle = computed(() => {
  const style = player.visualizerStyle.value;
  if (style) return style;
  return player.visualizerMode.value === 'ring' ? 'ring-halo' : 'bars-neon';
});
const barsVisualizerClass = computed(() => (activeVisualizerStyle.value.startsWith('bars-') ? activeVisualizerStyle.value : 'bars-neon'));
const ringVisualizerClass = computed(() => (activeVisualizerStyle.value.startsWith('ring-') ? activeVisualizerStyle.value : 'ring-halo'));

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

const activeVideoBackground = computed(() => {
  const src = activeBackground.value?.src || '';
  const ext = src.split('?')[0].split('#')[0].split('.').pop()?.toLowerCase();
  if (['webm', 'mp4', 'mov', 'ogg'].includes(ext)) return src;
  return '';
});

const activeImageBackground = computed(() => {
  return activeBackground.value?.preview || `${import.meta.env.BASE_URL}images/original-bg.png`;
});

function normalizeAssetPath(path) {
  if (!path) return `${import.meta.env.BASE_URL}images/original-bg.png`;
  if (path.startsWith('http') || path.startsWith('/')) return path;
  return `${import.meta.env.BASE_URL}${path.replace(/^\/+/, '')}`;
}

function inferBgType(item) {
  if (item?.type === 'l2d') return 'l2d';
  const src = String(item?.src || item?.preview || '').toLowerCase();
  if (/\.(webm|mp4|mov|ogg|gif|webp)$/.test(src)) return 'dynamic';
  return 'static';
}

function loadPersistedExtra() {
  try {
    const raw = window.localStorage.getItem(PLAYER_STORAGE_KEY);
    if (!raw) return;
    const data = JSON.parse(raw);
    subtitleVisible.value = data?.subtitleVisible !== false;

    if (data?.lyricOffset && Number.isFinite(data.lyricOffset.x) && Number.isFinite(data.lyricOffset.y)) {
      lyricOffset.value = { x: data.lyricOffset.x, y: data.lyricOffset.y };
    } else if (data?.lyricBar && Number.isFinite(data.lyricBar.offsetX) && Number.isFinite(data.lyricBar.offsetY)) {
      lyricOffset.value = { x: data.lyricBar.offsetX, y: data.lyricBar.offsetY };
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

async function loadBackgroundManifest() {
  try {
    const resp = await fetch(`${import.meta.env.BASE_URL}media/manifest.json`, { cache: 'no-store' });
    if (!resp.ok) throw new Error('manifest not found');
    const data = await resp.json();
    const list = Array.isArray(data?.backgrounds) ? data.backgrounds : [];
    backgroundItems.value = list
      .filter((item) => item?.available !== false)
      .slice(0, 140)
      .map((item, index) => ({
        id: item.id || `bg-${index}`,
        name: item.name || item.id || `背景 ${index + 1}`,
        src: item.src ? normalizeAssetPath(item.src) : '',
        preview: normalizeAssetPath(item.preview || item.src || 'images/original-bg.png'),
        type: inferBgType(item)
      }));
  } catch {
    backgroundItems.value = [
      {
        id: 'video-954',
        name: '954',
        src: `${import.meta.env.BASE_URL}media/background/954.webm`,
        preview: `${import.meta.env.BASE_URL}images/original-bg.png`,
        type: 'dynamic'
      },
      {
        id: 'default-bg',
        name: '默认',
        src: `${import.meta.env.BASE_URL}images/original-bg.png`,
        preview: `${import.meta.env.BASE_URL}images/original-bg.png`,
        type: 'static'
      },
      {
        id: 'l2d-placeholder',
        name: 'L2D 占位',
        src: '',
        preview: `${import.meta.env.BASE_URL}images/katanegai.jpg`,
        type: 'l2d'
      }
    ];
  }

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

  videoFailed.value = false;
}

function clearCurrentRouteBackground() {
  ui.clearRouteBackground(currentRouteKey.value);
  videoFailed.value = false;
}

function ensureAudioAnalyser() {
  if (analyser || !player.audioElement || typeof window === 'undefined' || !window.AudioContext) return;
  audioCtx = new window.AudioContext();
  const source = audioCtx.createMediaElementSource(player.audioElement);
  analyser = audioCtx.createAnalyser();
  analyser.fftSize = 512;
  analyser.smoothingTimeConstant = 0.88;
  source.connect(analyser);
  analyser.connect(audioCtx.destination);
  freqData = new Uint8Array(analyser.frequencyBinCount);
}

function stopVisualizerLoop() {
  if (rafId) {
    window.cancelAnimationFrame(rafId);
    rafId = 0;
  }
}

function pumpVisualizer() {
  if (!shouldRunVisualizer.value || !analyser || !freqData) {
    stopVisualizerLoop();
    return;
  }

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
  pumpVisualizer();
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
  if (event.button !== 0) return;
  dragState.pointerId = event.pointerId;
  dragState.startX = event.clientX;
  dragState.startY = event.clientY;
  dragState.originX = lyricOffset.value.x;
  dragState.originY = lyricOffset.value.y;
}

function onGlobalPointerMove(event) {
  if (dragState.pointerId === null || event.pointerId !== dragState.pointerId) return;
  const dx = event.clientX - dragState.startX;
  const dy = event.clientY - dragState.startY;
  lyricOffset.value = {
    x: Math.max(-520, Math.min(520, dragState.originX + dx)),
    y: Math.max(-340, Math.min(340, dragState.originY + dy))
  };
}

function onGlobalPointerUp(event) {
  if (dragState.pointerId === null || event.pointerId !== dragState.pointerId) return;
  dragState.pointerId = null;
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

function openProfile(tabKey = 'profile') {
  const nextQuery = tabKey ? { tab: tabKey } : {};
  const currentTab = typeof route.query?.tab === 'string' ? route.query.tab : '';
  if (route.path === '/profile' && currentTab === (tabKey || '')) return;
  router.push({ path: '/profile', query: nextQuery });
}

function openAuthor(tabKey = 'overview') {
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

function onGlobalPointerDown(event) {
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
});
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
  shouldRunVisualizer,
  (enabled) => {
    if (typeof window === 'undefined') return;
    if (enabled) {
      startVisualizerLoop();
      return;
    }
    stopVisualizerLoop();
    barLevels.value = barLevels.value.map(() => 0);
    ringLevels.value = ringLevels.value.map(() => 0);
  },
  { immediate: true }
);

onMounted(async () => {
  ui.initializeUiPreferences();
  loadPersistedExtra();
  await loadBackgroundManifest();
  if (player.visualizerMode.value === 'none') {
    player.setVisualizerMode('bars');
  }
  updateViewportMode();

  window.addEventListener('resize', updateViewportMode);
  window.addEventListener('keydown', onGlobalHotkey);
  window.addEventListener('pointerdown', onGlobalPointerDown, true);
  window.addEventListener('pointermove', onGlobalPointerMove, true);
  window.addEventListener('pointerup', onGlobalPointerUp, true);
  window.addEventListener('pointercancel', onGlobalPointerUp, true);
});

onBeforeUnmount(() => {
  if (sidebarAiCloseTimer) {
    window.clearTimeout(sidebarAiCloseTimer);
    sidebarAiCloseTimer = 0;
  }

  window.removeEventListener('resize', updateViewportMode);
  window.removeEventListener('keydown', onGlobalHotkey);
  window.removeEventListener('pointerdown', onGlobalPointerDown, true);
  window.removeEventListener('pointermove', onGlobalPointerMove, true);
  window.removeEventListener('pointerup', onGlobalPointerUp, true);
  window.removeEventListener('pointercancel', onGlobalPointerUp, true);
  stopVisualizerLoop();
  if (audioCtx) {
    audioCtx.close().catch(() => {});
    audioCtx = null;
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
  position: relative;
  z-index: 40;
  height: 100%;
  padding: 58px 14px 14px;
  display: grid;
  grid-template-columns: 1fr;
  gap: 12px;
  transition: padding-top 260ms ease;
}

.workspace-shell.expanded {
  padding-top: 134px;
}

.workspace-shell.with-ai-panel {
  grid-template-columns: minmax(0, 3fr) minmax(300px, 1fr);
}

.route-content {
  min-height: 0;
  overflow: auto;
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

.route-content.route-content-home {
  background: transparent;
  border: 0;
  box-shadow: none;
  padding: 0;
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
    padding: 50px 10px 10px 48px;
  }

  .workspace-shell.expanded {
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
    padding: 10px 8px 8px 44px;
  }

  .workspace-shell.expanded {
    padding-top: 16px;
  }

  .route-content {
    padding: 10px;
    padding-bottom: 150px;
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

  .picker-grid {
    grid-template-columns: repeat(auto-fill, minmax(116px, 1fr));
  }
}
</style>
