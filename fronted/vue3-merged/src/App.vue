<template>
  <div class="app-shell">
    <div class="bg-layer" aria-hidden="true">
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
    </div>

    <TopMenu
      :menu-expanded="menuExpanded"
      :ai-chat-active="aiChatActive"
      @toggle-menu="toggleMenu"
      @toggle-ai-chat="toggleAiChat"
      @select-main-route="handleMainRouteSelect"
      @author-info-click="handleAuthorInfoClick"
      @open-background-picker="backgroundPickerVisible = true"
    />

    <AiDialog :visible="aiChatActive" :menu-expanded="menuExpanded" @close="closeAiChat" />

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
      :visualizer-options="visualizerOptions"
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
      @toggle-visualizer-option="toggleVisualizerOption"
      @reorder-tracks="handleReorderTracks"
      @open-settings="openPlayerSettings"
    />

    <transition name="lyric-fade">
      <div
        v-if="subtitleVisible"
        class="global-lyric-bar liquid-material"
        :style="bottomFloatingStyle(lyricOffset)"
        @pointerdown="startDrag('lyric', $event)"
      >
        <span>{{ player.currentLyricLine.value || '纯音乐，无歌词' }}</span>
      </div>
    </transition>

    <div
      v-if="visualizerOptions.bars"
      class="global-bars"
      :style="bottomFloatingStyle(vizOffset)"
      @pointerdown="startDrag('viz', $event)"
      aria-hidden="true"
    >
      <span v-for="(v, i) in barLevels" :key="`bar-${i}`" class="bar" :style="{ height: `${8 + v * 46}px` }"></span>
    </div>

    <div
      v-if="visualizerOptions.ring"
      class="global-ring"
      :style="centerFloatingStyle(vizOffset)"
      @pointerdown="startDrag('viz', $event)"
      aria-hidden="true"
    >
      <div class="ring-core">
        <span v-for="(v, i) in ringLevels" :key="`ring-${i}`" class="ring-seg" :style="ringSegStyle(v, i)"></span>
      </div>
    </div>

    <transition name="picker-fade">
      <div v-if="backgroundPickerVisible" class="bg-picker-mask" @click.self="backgroundPickerVisible = false">
        <section class="bg-picker liquid-material">
          <header class="picker-head">
            <div class="picker-title">变换图片</div>
            <button class="picker-close" @click="backgroundPickerVisible = false">关闭</button>
          </header>
          <div class="picker-tabs">
            <button
              v-for="tab in bgTabs"
              :key="tab.key"
              class="tab-btn"
              :class="{ active: bgTab === tab.key }"
              @click="setBgTab(tab.key)"
            >
              {{ tab.label }}
            </button>
          </div>
          <div class="picker-grid">
            <button
              v-for="item in filteredBackgroundItems"
              :key="item.id"
              class="picker-item ripple-trigger"
              :class="{ active: item.id === selectedBackgroundId }"
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
          height: `${ripple.size}px`,
          borderColor: ripple.borderColor,
          backgroundImage: ripple.backgroundImage,
          boxShadow: ripple.boxShadow
        }"
      ></span>
    </div>
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import AiDialog from './components/AiDialog.vue';
import LevitationBall from './components/LevitationBall.vue';
import MusicPlayer from './components/MusicPlayer.vue';
import TopMenu from './components/TopMenu.vue';
import { usePlayerEngine } from './composables/usePlayerEngine';

const STORAGE_KEY = 'shizuki.musicPlayer.v1';
const menuExpanded = ref(false);
const aiChatActive = ref(false);
const levitationRef = ref(null);
const currentMainRoute = ref('home');
const clickRipples = ref([]);
const videoFailed = ref(false);
const selectedBackgroundId = ref('video-954');
const backgroundPickerVisible = ref(false);
const backgroundItems = ref([]);
const bgTab = ref('all');
const subtitleVisible = ref(true);
const lyricOffset = ref({ x: 0, y: 0 });
const vizOffset = ref({ x: 0, y: 0 });
const barLevels = ref(Array.from({ length: 44 }, () => 0));
const ringLevels = ref(Array.from({ length: 72 }, () => 0));
const visualizerOptions = ref({ bars: true, ring: false });

const dragState = {
  kind: null,
  pointerId: null,
  startX: 0,
  startY: 0,
  originX: 0,
  originY: 0
};

let audioCtx = null;
let analyser = null;
let freqData = null;
let rafId = 0;
let rippleSeq = 0;

const player = usePlayerEngine();

const activeBackground = computed(() => backgroundItems.value.find((item) => item.id === selectedBackgroundId.value) || null);
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
const activeVideoBackground = computed(() => {
  const src = activeBackground.value?.src || `${import.meta.env.BASE_URL}media/background/954.webm`;
  const ext = src.split('?')[0].split('#')[0].split('.').pop()?.toLowerCase();
  if (['webm', 'mp4', 'mov', 'ogg'].includes(ext)) return src;
  return '';
});
const activeImageBackground = computed(() => activeBackground.value?.preview || `${import.meta.env.BASE_URL}images/original-bg.png`);

const ripplePalette = [
  {
    borderColor: 'rgba(186, 170, 255, 0.24)',
    boxShadow: '0 0 0 1px rgba(186, 170, 255, 0.2)',
    backgroundImage: 'radial-gradient(circle, rgba(186, 170, 255, 0.24) 0%, rgba(186, 170, 255, 0.12) 38%, rgba(186, 170, 255, 0) 74%)'
  },
  {
    borderColor: 'rgba(220, 190, 255, 0.22)',
    boxShadow: '0 0 0 1px rgba(220, 190, 255, 0.18)',
    backgroundImage: 'radial-gradient(circle, rgba(220, 190, 255, 0.22) 0%, rgba(220, 190, 255, 0.12) 38%, rgba(220, 190, 255, 0) 74%)'
  },
  {
    borderColor: 'rgba(176, 210, 255, 0.22)',
    boxShadow: '0 0 0 1px rgba(176, 210, 255, 0.18)',
    backgroundImage: 'radial-gradient(circle, rgba(176, 210, 255, 0.22) 0%, rgba(176, 210, 255, 0.12) 38%, rgba(176, 210, 255, 0) 74%)'
  }
];

function bottomFloatingStyle(offset) {
  return {
    transform: `translate(calc(-50% + ${offset.x}px), ${offset.y}px)`
  };
}

function centerFloatingStyle(offset) {
  return {
    transform: `translate(calc(-50% + ${offset.x}px), calc(-50% + ${offset.y}px))`
  };
}

function loadPersisted() {
  try {
    const raw = window.localStorage.getItem(STORAGE_KEY);
    if (!raw) return;
    const data = JSON.parse(raw);
    subtitleVisible.value = data?.subtitleVisible !== false;
    if (data?.visualizerOptions && typeof data.visualizerOptions === 'object') {
      visualizerOptions.value = {
        bars: data.visualizerOptions.bars !== false,
        ring: Boolean(data.visualizerOptions.ring)
      };
    } else {
      const mode = ['bars', 'ring', 'none'].includes(data?.visualizerMode) ? data.visualizerMode : 'bars';
      visualizerOptions.value = { bars: mode === 'bars', ring: mode === 'ring' };
    }
    if (typeof data?.backgroundSelectedId === 'string') selectedBackgroundId.value = data.backgroundSelectedId;
    if (data?.lyricOffset && Number.isFinite(data.lyricOffset.x) && Number.isFinite(data.lyricOffset.y)) {
      lyricOffset.value = { x: data.lyricOffset.x, y: data.lyricOffset.y };
    } else if (data?.lyricBar && Number.isFinite(data.lyricBar.offsetX) && Number.isFinite(data.lyricBar.offsetY)) {
      lyricOffset.value = { x: data.lyricBar.offsetX, y: data.lyricBar.offsetY };
    }
    if (data?.vizOffset && Number.isFinite(data.vizOffset.x) && Number.isFinite(data.vizOffset.y)) {
      vizOffset.value = { x: data.vizOffset.x, y: data.vizOffset.y };
    }
  } catch {
    // ignore
  }
}

function persistExtra() {
  try {
    const raw = window.localStorage.getItem(STORAGE_KEY);
    const prev = raw ? JSON.parse(raw) : {};
    window.localStorage.setItem(
      STORAGE_KEY,
      JSON.stringify({
        ...prev,
        subtitleVisible: subtitleVisible.value,
        visualizerMode: visualizerOptions.value.ring ? 'ring' : visualizerOptions.value.bars ? 'bars' : 'none',
        visualizerOptions: visualizerOptions.value,
        globalBarsVisible: visualizerOptions.value.bars,
        globalRingVisible: visualizerOptions.value.ring,
        backgroundSelectedId: selectedBackgroundId.value,
        lyricOffset: lyricOffset.value,
        lyricBar: {
          offsetX: lyricOffset.value.x,
          offsetY: lyricOffset.value.y,
          visible: subtitleVisible.value
        },
        vizOffset: vizOffset.value
      })
    );
  } catch {
    // ignore
  }
}

async function loadBackgroundManifest() {
  try {
    const resp = await fetch(`${import.meta.env.BASE_URL}media/manifest.json`, { cache: 'no-store' });
    if (!resp.ok) throw new Error('manifest not found');
    const data = await resp.json();
    const list = Array.isArray(data?.backgrounds) ? data.backgrounds : [];
    backgroundItems.value = list
      .filter((x) => x?.available !== false)
      .slice(0, 120)
      .map((x, i) => ({
        id: x.id || `bg-${i}`,
        name: x.name || x.id || `背景 ${i + 1}`,
        src: x.src ? normalizeAssetPath(x.src) : '',
        preview: normalizeAssetPath(x.preview || x.src || 'images/katanegai.jpg'),
        type: inferBgType(x)
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

  if (!backgroundItems.value.length) return;
  const exists = backgroundItems.value.some((x) => x.id === selectedBackgroundId.value);
  if (!exists) selectedBackgroundId.value = backgroundItems.value[0].id;
}

function inferBgType(item) {
  if (item?.type === 'l2d') return 'l2d';
  const src = String(item?.src || item?.preview || '').toLowerCase();
  if (/\.(webm|mp4|mov|ogg|gif|webp)$/.test(src)) return 'dynamic';
  return 'static';
}

function normalizeAssetPath(path) {
  if (!path) return `${import.meta.env.BASE_URL}images/original-bg.png`;
  if (path.startsWith('http') || path.startsWith('/')) return path;
  return `${import.meta.env.BASE_URL}${path.replace(/^\/+/, '')}`;
}

function selectBackground(id) {
  const item = backgroundItems.value.find((x) => x.id === id);
  if (!item || !item.src) return;
  selectedBackgroundId.value = id;
  videoFailed.value = false;
}

function setBgTab(tabKey) {
  bgTab.value = tabKey;
  const first = filteredBackgroundItems.value.find((item) => !!item.src);
  if (first) selectBackground(first.id);
}

function ensureAudioAnalyser() {
  if (audioCtx || !player.audioElement || !window.AudioContext) return;
  audioCtx = new window.AudioContext();
  const source = audioCtx.createMediaElementSource(player.audioElement);
  analyser = audioCtx.createAnalyser();
  analyser.fftSize = 512;
  analyser.smoothingTimeConstant = 0.88;
  source.connect(analyser);
  analyser.connect(audioCtx.destination);
  freqData = new Uint8Array(analyser.frequencyBinCount);
}

function pumpVisualizer() {
  if (analyser && freqData) {
    analyser.getByteFrequencyData(freqData);
    barLevels.value = barLevels.value.map((_, i) => {
      const idx = Math.floor((i / barLevels.value.length) * freqData.length);
      return Math.pow((freqData[idx] || 0) / 255, 1.4);
    });

    ringLevels.value = ringLevels.value.map((_, i) => {
      const idx = Math.floor((i / ringLevels.value.length) * freqData.length);
      return Math.pow((freqData[idx] || 0) / 255, 1.6);
    });
  }
  rafId = window.requestAnimationFrame(pumpVisualizer);
}

function ringSegStyle(level, index) {
  const total = ringLevels.value.length;
  const angle = (360 / total) * index;
  const len = 12 + level * 34;
  return {
    transform: `rotate(${angle}deg) translateY(-176px)`,
    height: `${len}px`,
    opacity: 0.16 + level * 0.42
  };
}

function toggleVisualizerOption(type) {
  if (type !== 'bars' && type !== 'ring') return;
  visualizerOptions.value = {
    ...visualizerOptions.value,
    [type]: !visualizerOptions.value[type]
  };
}

function startDrag(kind, e) {
  if (e.button !== 0) return;
  if (kind === 'viz') {
    const topElement = document.elementFromPoint(e.clientX, e.clientY);
    if (topElement instanceof Element && topElement.closest('.music-player-shell')) return;
  }
  dragState.kind = kind;
  dragState.pointerId = e.pointerId;
  dragState.startX = e.clientX;
  dragState.startY = e.clientY;
  const current = kind === 'lyric' ? lyricOffset.value : vizOffset.value;
  dragState.originX = current.x;
  dragState.originY = current.y;
}

function onGlobalPointerMove(e) {
  if (dragState.pointerId === null || e.pointerId !== dragState.pointerId) return;
  const dx = e.clientX - dragState.startX;
  const dy = e.clientY - dragState.startY;
  const next = {
    x: Math.max(-520, Math.min(520, dragState.originX + dx)),
    y: Math.max(-340, Math.min(340, dragState.originY + dy))
  };
  if (dragState.kind === 'lyric') lyricOffset.value = next;
  else vizOffset.value = next;
}

function onGlobalPointerUp(e) {
  if (dragState.pointerId === null || e.pointerId !== dragState.pointerId) return;
  dragState.pointerId = null;
  dragState.kind = null;
}

function toggleMenu() {
  menuExpanded.value = !menuExpanded.value;
}

function toggleAiChat() {
  aiChatActive.value = !aiChatActive.value;
}

function closeAiChat() {
  aiChatActive.value = false;
}

function handleMainRouteSelect(routeKey) {
  currentMainRoute.value = routeKey;
}

function handleAuthorInfoClick() {
  console.log('Author info clicked');
}

function handleSelectTrack(index) {
  player.selectTrackByIndex(index, true);
}

function handleReorderTracks(payload) {
  player.reorderTracks(payload.from, payload.to);
}

function openPlayerSettings() {
  console.log('Player settings placeholder');
}

function onGlobalPointerDown(e) {
  if (e.button !== 0) return;
  const target = e.target;
  if (!(target instanceof Element)) return;

  const trigger = target.closest('.ripple-trigger');
  if (!trigger) return;

  const rect = trigger.getBoundingClientRect();
  const baseSize = Math.max(rect.width, rect.height);
  const size = Math.max(72, Math.min(148, baseSize * 1.6));
  const x = rect.left + rect.width * 0.5 - size * 0.5;
  const y = rect.top + rect.height * 0.5 - size * 0.5;
  const colorDef = ripplePalette[Math.floor(Math.random() * ripplePalette.length)];
  const id = rippleSeq++;

  clickRipples.value.push({
    id,
    size,
    x,
    y,
    borderColor: colorDef.borderColor,
    boxShadow: colorDef.boxShadow,
    backgroundImage: colorDef.backgroundImage
  });

  window.setTimeout(() => {
    clickRipples.value = clickRipples.value.filter((ripple) => ripple.id !== id);
  }, 580);
}

function onGlobalHotkey(e) {
  if (!e.ctrlKey || !e.shiftKey || e.altKey || e.metaKey) return;

  const target = e.target;
  if (target instanceof HTMLElement) {
    const tag = target.tagName;
    if (tag === 'INPUT' || tag === 'TEXTAREA' || target.isContentEditable) return;
  }

  if (e.code === 'Backquote') {
    e.preventDefault();
    levitationRef.value?.toggleExpanded?.();
    return;
  }

  if (e.code === 'Minus') {
    e.preventDefault();
    toggleAiChat();
    return;
  }

  if (e.code === 'Equal') {
    e.preventDefault();
    toggleMenu();
    return;
  }

  if (e.code === 'Digit1' || e.code === 'Digit2' || e.code === 'Digit3' || e.code === 'Digit4') {
    e.preventDefault();
    const index = Number(e.code.replace('Digit', ''));
    levitationRef.value?.triggerMenuByIndex?.(index);
    return;
  }

  if (e.code === 'KeyM') {
    e.preventDefault();
    player.setPlayerExpanded(!player.isPlayerExpanded.value);
    return;
  }

  if (e.code === 'ArrowLeft') {
    e.preventDefault();
    player.playPrev();
    return;
  }

  if (e.code === 'ArrowRight') {
    e.preventDefault();
    player.playNext();
    return;
  }

  if (e.code === 'KeyP') {
    e.preventDefault();
    player.togglePlay();
    return;
  }

  if (e.code === 'ArrowUp') {
    e.preventDefault();
    player.adjustVolume(0.05);
    return;
  }

  if (e.code === 'ArrowDown') {
    e.preventDefault();
    player.adjustVolume(-0.05);
  }
}

watch([subtitleVisible, visualizerOptions, selectedBackgroundId, lyricOffset, vizOffset], persistExtra, { deep: true });

onMounted(async () => {
  loadPersisted();
  await loadBackgroundManifest();
  window.addEventListener('keydown', onGlobalHotkey);
  window.addEventListener('pointerdown', onGlobalPointerDown, true);
  window.addEventListener('pointermove', onGlobalPointerMove, true);
  window.addEventListener('pointerup', onGlobalPointerUp, true);
  window.addEventListener('pointercancel', onGlobalPointerUp, true);
  ensureAudioAnalyser();
  pumpVisualizer();
});

onBeforeUnmount(() => {
  window.removeEventListener('keydown', onGlobalHotkey);
  window.removeEventListener('pointerdown', onGlobalPointerDown, true);
  window.removeEventListener('pointermove', onGlobalPointerMove, true);
  window.removeEventListener('pointerup', onGlobalPointerUp, true);
  window.removeEventListener('pointercancel', onGlobalPointerUp, true);
  if (rafId) window.cancelAnimationFrame(rafId);
  if (audioCtx) audioCtx.close();
});
</script>

<style scoped>
.app-shell {
  position: relative;
  width: 100%;
  height: 100%;
  overflow: hidden;
  isolation: isolate;
  background: linear-gradient(120deg, #d3dceb, #e6dff0, #dccedf);
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
}

.bg-video {
  z-index: 1;
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
  bottom: 18px;
  width: min(94vw, 1080px);
  height: 76px;
  display: flex;
  align-items: end;
  justify-content: center;
  gap: 5px;
  z-index: 1020;
  cursor: grab;
  user-select: none;
}

.bar {
  width: 5px;
  border-radius: 4px;
  background: linear-gradient(180deg, rgba(152, 220, 255, 0.78), rgba(129, 176, 255, 0.68));
  box-shadow: 0 0 10px rgba(102, 148, 246, 0.26);
}

.global-ring {
  position: fixed;
  left: 50%;
  top: 50%;
  z-index: 1018;
  cursor: grab;
  user-select: none;
}

.ring-core {
  width: 360px;
  height: 360px;
  position: relative;
  display: grid;
  place-items: center;
}

.ring-core::before {
  content: '';
  position: absolute;
  inset: 84px;
  border-radius: 50%;
  border: 1px solid rgba(200, 224, 255, 0.18);
  box-shadow: inset 0 0 24px rgba(146, 180, 255, 0.06);
}

.ring-seg {
  position: absolute;
  width: 4px;
  border-radius: 4px;
  background: linear-gradient(180deg, rgba(181, 231, 255, 0.66), rgba(129, 176, 255, 0.6));
  transform-origin: center 176px;
}

.bg-picker-mask {
  position: fixed;
  inset: 0;
  z-index: 1300;
  background: rgba(10, 12, 18, 0.34);
  display: grid;
  place-items: center;
}

.bg-picker {
  --liquid-bg: rgba(var(--glass-rgb), 0.38);
  --liquid-border: rgba(255, 255, 255, 0.46);
  --liquid-shadow: 0 16px 44px rgba(8, 12, 20, 0.32);
  width: min(90vw, 980px);
  max-height: min(86vh, 760px);
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
  background: rgba(120, 84, 178, 0.84);
  color: rgba(248, 238, 255, 0.94);
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
  box-shadow: inset 0 0 0 2px rgba(104, 218, 149, 0.92);
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
  border: 1.2px solid transparent;
  background: radial-gradient(circle, rgba(186, 170, 255, 0.24) 0%, rgba(186, 170, 255, 0.12) 38%, rgba(186, 170, 255, 0) 74%);
  transform: scale(0.2);
  opacity: 0.7;
  animation: click-ripple 580ms cubic-bezier(0.22, 1, 0.36, 1) forwards;
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
    opacity: 0.75;
  }
  100% {
    transform: scale(1.85);
    opacity: 0;
  }
}

@media (max-width: 900px) {
  .global-bars {
    width: min(96vw, 760px);
    height: 62px;
    gap: 4px;
  }

  .bar {
    width: 4px;
  }

  .ring-core {
    width: 300px;
    height: 300px;
  }

  .ring-core::before {
    inset: 72px;
  }

  .ring-seg {
    transform-origin: center 148px;
  }
}

@media (max-width: 600px), (orientation: portrait) {
  .global-lyric-bar {
    bottom: 112px;
    min-width: min(92vw, 640px);
  }

  .global-bars {
    bottom: 26px;
    width: min(96vw, 560px);
    height: 56px;
    gap: 3px;
  }

  .bar {
    width: 3px;
  }

  .ring-core {
    width: min(72vw, 260px);
    height: min(72vw, 260px);
  }

  .ring-core::before {
    inset: 60px;
  }

  .ring-seg {
    transform-origin: center 130px;
  }
}
</style>
