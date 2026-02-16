<template>
  <section class="music-player-shell" ref="rootRef">
    <article class="player-card liquid-material" :class="{ active: isExpanded, pinned: isPinned }">
      <div class="head-row">
        <button class="top-btn top-gear ripple-trigger" type="button" title="设置" @click.stop="emit('open-settings')">
          <i class="fas fa-gear"></i>
        </button>
        <div class="song-title">{{ track?.title || '暂无音乐' }}</div>
        <button class="top-btn top-pin ripple-trigger" type="button" title="置顶" @click.stop="emit('set-pinned', !isPinned)">
          <i class="fas fa-thumbtack"></i>
        </button>
      </div>

      <div
        class="disc-row"
        @pointerdown="onDiscGestureStart"
        @pointermove="onDiscGestureMove"
        @pointerup="onDiscGestureEnd"
        @pointercancel="onDiscGestureEnd"
      >
        <button class="edge-btn ripple-trigger" type="button" title="上一首" @click.stop="emit('prev')">
          <i class="fas fa-backward-step"></i>
        </button>

        <button class="disc-wrap ripple-trigger" type="button" title="展开播放器" @click="onDiscClick">
          <span class="cover-vinyl" :class="{ spinning: isPlaying, expanded: isExpanded }">
            <span class="cover-img" :style="coverStyle"></span>
            <span class="center-hole"></span>
          </span>
        </button>

        <button class="edge-btn ripple-trigger" type="button" title="下一首" @click.stop="emit('next')">
          <i class="fas fa-forward-step"></i>
        </button>
      </div>

      <div class="artist-line">{{ track?.artist || '未知歌手' }}</div>

      <div class="lyrics-window">
        <transition name="lyric-switch" mode="out-in">
          <div class="lyrics-triplet" :key="lyricContext?.key || 'empty'">
            <div class="lyric prev">{{ lyricContext?.prev || '' }}</div>
            <div class="lyric current">{{ lyricContext?.current || (lyricLine || '纯音乐，无歌词') }}</div>
            <div class="lyric next">{{ lyricContext?.next || '' }}</div>
          </div>
        </transition>
      </div>

      <div class="progress-row">
        <button class="mode-btn ripple-trigger" type="button" :title="`播放模式: ${modeLabel}`" @click="emit('cycle-mode')">
          <i :class="modeIcon"></i>
        </button>

        <div
          class="progress-wrap"
          ref="progressRef"
          @mousemove="onProgressMove"
          @mouseenter="previewVisible = true"
          @mouseleave="previewVisible = false"
          @click="onProgressClick"
        >
          <div class="progress-track">
            <div class="progress-fill" :style="{ width: `${progressPercent * 100}%` }"></div>
          </div>
          <div v-if="previewVisible" class="progress-preview" :style="{ left: `${previewPercent * 100}%` }">
            {{ previewTimeText }}
          </div>
        </div>

        <div class="time-mix">{{ playedText }} / -{{ remainText }}</div>
      </div>

      <div class="pause-row">
        <button class="pause-btn ripple-trigger" type="button" :title="isPlaying ? '暂停' : '播放'" @click="emit('toggle-play')">
          <i class="fas" :class="isPlaying ? 'fa-pause' : 'fa-play'"></i>
        </button>
      </div>

      <div class="bottom-row">
        <button class="mini-action ripple-trigger" type="button" title="字幕" @click="emit('toggle-subtitle')">
          <i class="fas fa-closed-captioning"></i>
          <span>字幕</span>
        </button>
        <button class="mini-action ripple-trigger" type="button" title="列表" @click="emit('toggle-list')">
          <i class="fas fa-list"></i>
          <span>列表</span>
        </button>
        <div class="viz-ctrl">
          <button class="mini-action ripple-trigger viz-btn" type="button" title="可视化" @click="vizMenuOpen = !vizMenuOpen">
            <i class="fas fa-wave-square"></i>
            <span>可视化</span>
          </button>
          <div v-if="vizMenuOpen" class="viz-menu liquid-material">
            <button class="viz-opt" :class="{ active: visualizerOptions?.bars }" @click="emit('toggle-visualizer-option', 'bars')">线型</button>
            <button class="viz-opt" :class="{ active: visualizerOptions?.ring }" @click="emit('toggle-visualizer-option', 'ring')">圆形</button>
          </div>
        </div>
      </div>
    </article>

    <aside class="side-list liquid-material" :class="{ visible: isExpanded && listOpen }">
      <header class="list-head">
        <div class="list-title">播放列表</div>
        <div class="head-actions">
          <button class="head-btn" type="button" title="添加（暂不可用)" disabled>
            <i class="fas fa-plus"></i>
          </button>
          <button class="head-btn" type="button" title="设置（暂不可用)" disabled>
            <i class="fas fa-gear"></i>
          </button>
        </div>
      </header>

      <div class="list-body">
        <button
          v-for="(item, idx) in tracks"
          :key="item.id"
          class="track-item ripple-trigger"
          :class="{ active: item.id === track?.id }"
          draggable="true"
          @click="emit('select-track', idx)"
          @dragstart="onDragStart(idx)"
          @dragover.prevent
          @drop="onDrop(idx)"
        >
          <span class="item-main">
            <span class="item-name">{{ item.title }}</span>
            <span class="item-artist">{{ item.artist || '未知歌手' }}</span>
          </span>
          <span class="item-time">{{ item.durationLabel || '--:--' }}</span>
        </button>
      </div>
    </aside>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, ref } from 'vue';

const props = defineProps({
  track: { type: Object, default: null },
  tracks: { type: Array, default: () => [] },
  lyricLine: { type: String, default: '' },
  lyricContext: {
    type: Object,
    default: () => ({ prev: '', current: '', next: '', key: 'empty' })
  },
  currentTime: { type: Number, default: 0 },
  duration: { type: Number, default: 0 },
  isPlaying: { type: Boolean, default: false },
  isExpanded: { type: Boolean, default: false },
  isPinned: { type: Boolean, default: false },
  playMode: { type: String, default: 'sequential' },
  listOpen: { type: Boolean, default: false },
  visualizerOptions: {
    type: Object,
    default: () => ({ bars: true, ring: false })
  }
});

const emit = defineEmits([
  'set-expanded',
  'set-pinned',
  'toggle-play',
  'prev',
  'next',
  'cycle-mode',
  'seek',
  'toggle-list',
  'select-track',
  'toggle-subtitle',
  'toggle-visualizer-option',
  'reorder-tracks',
  'open-settings'
]);

const rootRef = ref(null);
const dragIndex = ref(-1);
const progressRef = ref(null);
const previewVisible = ref(false);
const previewPercent = ref(0);
const vizMenuOpen = ref(false);

const gesture = {
  pointerId: null,
  startX: 0,
  startY: 0,
  moved: false
};

const coverStyle = computed(() => ({
  backgroundImage: `url('${props.track?.cover || `${import.meta.env.BASE_URL}images/katanegai.jpg`}')`
}));

const modeIcon = computed(() => {
  if (props.playMode === 'random') return 'fas fa-shuffle';
  if (props.playMode === 'single') return 'fas fa-repeat-1';
  return 'fas fa-repeat';
});

const modeLabel = computed(() => {
  if (props.playMode === 'random') return '随机';
  if (props.playMode === 'single') return '单曲循环';
  return '顺序播放';
});

const progressPercent = computed(() => {
  if (!Number.isFinite(props.duration) || props.duration <= 0) return 0;
  return Math.max(0, Math.min(1, props.currentTime / props.duration));
});

const playedText = computed(() => formatTime(props.currentTime));
const remainText = computed(() => {
  const remain = Number.isFinite(props.duration) ? Math.max(0, props.duration - props.currentTime) : 0;
  return formatTime(remain);
});

const previewTimeText = computed(() => {
  const total = Number.isFinite(props.duration) ? props.duration : 0;
  return formatTime(total * previewPercent.value);
});

function formatTime(sec) {
  if (!Number.isFinite(sec) || sec < 0) return '00:00';
  const t = Math.floor(sec);
  return `${String(Math.floor(t / 60)).padStart(2, '0')}:${String(t % 60).padStart(2, '0')}`;
}

function onDiscClick() {
  if (!props.isExpanded) emit('set-expanded', true);
}

function pointToPercent(clientX) {
  const el = progressRef.value;
  if (!el) return 0;
  const rect = el.getBoundingClientRect();
  if (rect.width <= 0) return 0;
  return Math.max(0, Math.min(1, (clientX - rect.left) / rect.width));
}

function onProgressMove(e) {
  previewPercent.value = pointToPercent(e.clientX);
}

function onProgressClick(e) {
  const pct = pointToPercent(e.clientX);
  previewPercent.value = pct;
  emit('seek', pct);
}

function onDiscGestureStart(e) {
  if (!props.isExpanded) return;
  gesture.pointerId = e.pointerId;
  gesture.startX = e.clientX;
  gesture.startY = e.clientY;
  gesture.moved = false;
}

function onDiscGestureMove(e) {
  if (gesture.pointerId === null || e.pointerId !== gesture.pointerId) return;
  if (Math.abs(e.clientX - gesture.startX) > 10 || Math.abs(e.clientY - gesture.startY) > 10) {
    gesture.moved = true;
  }
}

function onDiscGestureEnd(e) {
  if (gesture.pointerId === null || e.pointerId !== gesture.pointerId) return;
  const dx = e.clientX - gesture.startX;
  const dy = e.clientY - gesture.startY;
  if (gesture.moved && Math.abs(dx) > 42 && Math.abs(dx) > Math.abs(dy)) {
    if (dx > 0) emit('prev');
    else emit('next');
  }
  gesture.pointerId = null;
  gesture.moved = false;
}

function onDragStart(idx) {
  dragIndex.value = idx;
}

function onDrop(idx) {
  if (dragIndex.value < 0 || dragIndex.value === idx) return;
  emit('reorder-tracks', { from: dragIndex.value, to: idx });
  dragIndex.value = -1;
}

function onDocumentPointerDown(e) {
  if (!props.isExpanded || props.isPinned) return;
  const root = rootRef.value;
  if (!root) return;
  const target = e.target;
  if (!(target instanceof Element)) return;
  if (root.contains(target)) return;
  if (target.closest('.global-bars') || target.closest('.global-ring') || target.closest('.global-lyric-bar')) return;
  if (target.closest('.top-menu-root') || target.closest('.ai-dialog-shell')) return;
  vizMenuOpen.value = false;
  emit('set-expanded', false);
}

document.addEventListener('pointerdown', onDocumentPointerDown, true);

onBeforeUnmount(() => {
  document.removeEventListener('pointerdown', onDocumentPointerDown, true);
});
</script>

<style scoped>
.music-player-shell {
  --elastic: cubic-bezier(0.34, 1.56, 0.64, 1);
  --panel-w: min(92vw, 360px);
  --panel-h: 600px;
  --disc-size: 86px;
  --title-size: 26px;
  --top-btn-size: 44px;
  --edge-btn-size: 44px;
  --mode-btn-size: 36px;
  --pause-btn-size: 58px;
  --mini-btn-h: 44px;
  --mini-font-size: 12px;
  --main-gap: 10px;
  --head-top: 16px;
  --disc-top: 84px;
  --artist-top: 326px;
  --lyrics-top: 352px;
  --progress-top: 424px;
  --pause-top: 468px;
  --bottom-top: 536px;
  position: fixed;
  left: 24px;
  bottom: 24px;
  z-index: 1120;
  pointer-events: auto;
}

.player-card {
  --liquid-bg: rgba(var(--glass-rgb), 0.32);
  --liquid-border: rgba(255, 255, 255, 0.42);
  --liquid-shadow: 0 16px 42px rgba(10, 14, 24, 0.22);
  position: relative;
  width: var(--disc-size);
  height: var(--disc-size);
  border-radius: 50%;
  overflow: hidden;
  pointer-events: auto;
  transition: width 620ms var(--elastic), height 620ms var(--elastic), border-radius 420ms ease;
}

.player-card.active {
  width: var(--panel-w);
  height: var(--panel-h);
  border-radius: 30px;
}

.head-row {
  position: absolute;
  left: 0;
  right: 0;
  top: var(--head-top);
  display: grid;
  grid-template-columns: 48px 1fr 48px;
  align-items: center;
  gap: 8px;
  padding: 0 16px;
  opacity: 0;
  transform: translateY(-8px);
  transition: opacity 220ms ease, transform 240ms ease;
  pointer-events: none;
}

.player-card.active .head-row {
  opacity: 1;
  transform: translateY(0);
  pointer-events: auto;
}

.top-btn {
  width: var(--top-btn-size);
  height: var(--top-btn-size);
  border: 0;
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.34);
  color: rgba(24, 27, 36, 0.72);
}

.song-title {
  text-align: center;
  color: rgba(26, 29, 38, 0.94);
  font-size: var(--title-size);
  font-weight: 800;
  line-height: 1;
  transform: scale(0.48);
  transform-origin: center;
}

.player-card.pinned .top-pin {
  background: rgba(120, 84, 178, 0.88);
  color: rgba(242, 228, 255, 0.94);
}

.player-card.pinned .top-pin i {
  display: inline-block;
  transform: rotate(-18deg);
}

.disc-row {
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  transform: translateY(-50%);
  display: grid;
  grid-template-columns: 0 1fr 0;
  align-items: center;
  justify-items: center;
  padding: 0;
  opacity: 1;
  transition: top 620ms var(--elastic), transform 620ms var(--elastic), opacity 220ms ease;
}

.player-card.active .disc-row {
  top: var(--disc-top);
  transform: translateY(0);
  grid-template-columns: 54px 1fr 54px;
  padding: 0 16px;
}

.edge-btn {
  width: var(--edge-btn-size);
  height: var(--edge-btn-size);
  border: 0;
  border-radius: 50%;
  background: rgba(255, 255, 255, 0.35);
  color: rgba(30, 34, 42, 0.82);
  opacity: 0;
  pointer-events: none;
  transition: opacity 180ms ease;
}

.player-card.active .edge-btn {
  opacity: 1;
  pointer-events: auto;
}

.disc-wrap {
  width: 78px;
  height: 78px;
  border: 0;
  background: transparent;
  display: grid;
  place-items: center;
  cursor: pointer;
  pointer-events: auto;
  position: relative;
  z-index: 8;
  transition: width 620ms var(--elastic), height 620ms var(--elastic);
}

.player-card.active .disc-wrap {
  width: 232px;
  height: 232px;
}

.cover-vinyl {
  position: relative;
  width: 70px;
  height: 70px;
  border-radius: 50%;
  background: #111;
  box-shadow: 0 8px 20px rgba(0, 0, 0, 0.28);
  pointer-events: auto;
  transition: all 620ms var(--elastic);
  animation: disc-spin 12s linear infinite;
  animation-play-state: paused;
}

.player-card.active .cover-vinyl {
  width: 224px;
  height: 224px;
  box-shadow:
    inset 0 0 0 2px rgba(10, 12, 20, 0.9),
    inset 0 0 0 26px rgba(8, 10, 18, 0.78),
    inset 0 0 0 40px rgba(255, 255, 255, 0.05),
    0 16px 36px rgba(10, 13, 22, 0.26);
}

.cover-vinyl.spinning {
  animation-play-state: running;
}

.cover-img {
  position: absolute;
  inset: 4%;
  border-radius: 50%;
  background-size: cover;
  background-position: center;
}

.center-hole {
  position: absolute;
  left: 50%;
  top: 50%;
  width: 16px;
  height: 16px;
  margin-left: -8px;
  margin-top: -8px;
  border-radius: 50%;
  background: #10131d;
  box-shadow: 0 0 0 2px rgba(255, 255, 255, 0.28);
}

.artist-line {
  position: absolute;
  top: var(--artist-top);
  left: 0;
  right: 0;
  text-align: center;
  color: rgba(26, 29, 38, 0.76);
  font-size: 15px;
  opacity: 0;
  transition: opacity 220ms ease;
}

.player-card.active .artist-line {
  opacity: 1;
}

.lyrics-window {
  position: absolute;
  top: var(--lyrics-top);
  left: 16px;
  right: 16px;
  height: 62px;
  overflow: hidden;
  display: grid;
  place-items: center;
  opacity: 0;
  transition: opacity 240ms ease;
}

.player-card.active .lyrics-window {
  opacity: 1;
}

.lyrics-triplet {
  display: grid;
  gap: 3px;
  width: 100%;
  text-align: center;
}

.lyric {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.lyric.prev,
.lyric.next {
  font-size: 12px;
  color: rgba(25, 27, 36, 0.4);
}

.lyric.current {
  font-size: 14px;
  color: rgba(25, 27, 36, 0.82);
  font-weight: 600;
}

.progress-row {
  position: absolute;
  left: 16px;
  right: 16px;
  top: var(--progress-top);
  display: grid;
  grid-template-columns: 40px 1fr auto;
  gap: 8px;
  align-items: center;
  opacity: 0;
  transition: opacity 240ms ease;
}

.player-card.active .progress-row {
  opacity: 1;
}

.mode-btn {
  width: var(--mode-btn-size);
  height: var(--mode-btn-size);
  border: 0;
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.36);
  color: rgba(28, 31, 39, 0.82);
}

.progress-wrap {
  position: relative;
  height: 20px;
  display: grid;
  align-items: center;
  cursor: pointer;
}

.progress-track {
  height: 8px;
  border-radius: 999px;
  background: rgba(35, 40, 52, 0.16);
  overflow: hidden;
}

.progress-fill {
  height: 100%;
  background: linear-gradient(90deg, rgba(176, 215, 255, 0.88), rgba(142, 186, 255, 0.9));
}

.progress-preview {
  position: absolute;
  top: -24px;
  transform: translateX(-50%);
  min-width: 42px;
  height: 18px;
  padding: 0 6px;
  border-radius: 9px;
  background: rgba(24, 28, 38, 0.78);
  color: rgba(248, 251, 255, 0.95);
  font-size: 11px;
  display: grid;
  place-items: center;
  pointer-events: none;
}

.time-mix {
  color: rgba(27, 31, 40, 0.78);
  font-size: 12px;
  min-width: 84px;
  text-align: right;
}

.pause-row {
  position: absolute;
  left: 0;
  right: 0;
  top: var(--pause-top);
  display: grid;
  place-items: center;
  opacity: 0;
  transition: opacity 240ms ease;
}

.player-card.active .pause-row {
  opacity: 1;
}

.pause-btn {
  width: var(--pause-btn-size);
  height: var(--pause-btn-size);
  border: 0;
  border-radius: 50%;
  background: rgba(255, 255, 255, 0.62);
  color: rgba(26, 29, 37, 0.9);
  box-shadow: 0 8px 20px rgba(11, 14, 22, 0.2);
}

.bottom-row {
  position: absolute;
  left: 0;
  right: 0;
  top: var(--bottom-top);
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  padding: 0 28px;
  gap: var(--main-gap);
  opacity: 0;
  transition: opacity 260ms ease;
}

.player-card.active .bottom-row {
  opacity: 1;
}

.viz-ctrl {
  position: relative;
  min-width: 0;
  z-index: 12;
}

.mini-action {
  border: 0;
  border-radius: 14px;
  width: 100%;
  min-height: var(--mini-btn-h);
  background: rgba(255, 255, 255, 0.34);
  color: rgba(28, 31, 39, 0.8);
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 6px;
  font-size: var(--mini-font-size);
}

.viz-btn {
  min-width: 104px;
  width: 100%;
}

.viz-menu {
  --liquid-bg: rgba(var(--glass-rgb), 0.46);
  --liquid-border: rgba(255, 255, 255, 0.48);
  --liquid-shadow: 0 10px 22px rgba(10, 12, 20, 0.24);
  position: absolute;
  right: 0;
  bottom: 48px;
  border-radius: 12px;
  padding: 6px;
  display: grid;
  gap: 6px;
  min-width: 86px;
  z-index: 20;
}

.viz-opt {
  border: 0;
  border-radius: 9px;
  height: 30px;
  background: rgba(255, 255, 255, 0.36);
  color: rgba(24, 28, 36, 0.82);
  font-size: 12px;
}

.viz-opt.active {
  background: rgba(120, 84, 178, 0.82);
  color: rgba(248, 239, 255, 0.95);
}

.side-list {
  --liquid-bg: rgba(var(--glass-rgb), 0.34);
  --liquid-border: rgba(255, 255, 255, 0.42);
  --liquid-shadow: 0 12px 34px rgba(8, 12, 20, 0.22);
  position: absolute;
  left: calc(var(--panel-w) + 14px);
  bottom: 0;
  width: min(42vw, 360px);
  max-height: 430px;
  border-radius: 22px;
  padding: 12px;
  opacity: 0;
  transform: translateX(-18px);
  pointer-events: none;
  transition: opacity 220ms ease, transform 280ms var(--elastic);
}

.side-list.visible {
  opacity: 1;
  transform: translateX(0);
  pointer-events: auto;
}

.list-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.list-title {
  color: rgba(26, 29, 38, 0.86);
  font-weight: 700;
}

.head-actions {
  display: flex;
  gap: 8px;
}

.head-btn {
  width: 28px;
  height: 28px;
  border: 0;
  border-radius: 8px;
  background: rgba(255, 255, 255, 0.38);
  color: rgba(50, 55, 66, 0.6);
}

.list-body {
  margin-top: 10px;
  max-height: 360px;
  overflow: auto;
  display: grid;
  gap: 6px;
}

.track-item {
  border: 0;
  border-radius: 10px;
  min-height: 46px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 6px 10px;
  cursor: grab;
  background: rgba(255, 255, 255, 0.32);
  color: rgba(24, 27, 34, 0.84);
}

.track-item:active {
  cursor: grabbing;
}

.track-item.active {
  background: rgba(168, 202, 240, 0.62);
}

.item-main {
  display: grid;
  text-align: left;
}

.item-name {
  font-size: 13px;
  font-weight: 600;
}

.item-artist {
  font-size: 11px;
  opacity: 0.72;
}

.item-time {
  font-size: 12px;
  opacity: 0.78;
}

.lyric-switch-enter-active,
.lyric-switch-leave-active {
  transition: all 220ms ease;
}

.lyric-switch-enter-from {
  opacity: 0;
  transform: translateY(10px);
}

.lyric-switch-leave-to {
  opacity: 0;
  transform: translateY(-10px);
}

@keyframes disc-spin {
  from { transform: rotate(0deg); }
  to { transform: rotate(360deg); }
}

@media (max-width: 900px) {
  .music-player-shell {
    --panel-w: min(94vw, 350px);
    --panel-h: min(80vh, 590px);
    --title-size: 22px;
    --top-btn-size: 40px;
    --edge-btn-size: 40px;
    --mode-btn-size: 34px;
    --pause-btn-size: 54px;
    --mini-btn-h: 40px;
    --mini-font-size: 11px;
    --main-gap: 8px;
    --head-top: 12px;
    --disc-top: 86px;
    --artist-top: 300px;
    --lyrics-top: 324px;
    --progress-top: 392px;
    --pause-top: 442px;
    --bottom-top: 508px;
    left: 12px;
    bottom: 14px;
  }

  .disc-row {
    top: 50%;
    transform: translateY(-50%);
    grid-template-columns: 0 1fr 0;
    padding: 0;
  }

  .player-card.active .disc-row {
    grid-template-columns: 48px 1fr 48px;
    padding: 0 10px;
  }

  .disc-wrap {
    width: 74px;
    height: 74px;
  }

  .player-card.active .disc-wrap {
    width: 210px;
    height: 210px;
  }

  .player-card.active .cover-vinyl {
    width: 196px;
    height: 196px;
  }

  .head-row {
    grid-template-columns: 42px 1fr 42px;
    padding: 0 12px;
  }

  .side-list {
    width: min(46vw, 330px);
    max-height: 380px;
  }
}

@media (max-width: 600px), (orientation: portrait) {
  .music-player-shell {
    --panel-w: min(96vw, 390px);
    --panel-h: min(74vh, 560px);
    --title-size: clamp(16px, 4.8vw, 20px);
    --top-btn-size: 36px;
    --edge-btn-size: 36px;
    --mode-btn-size: 32px;
    --pause-btn-size: 50px;
    --mini-btn-h: 38px;
    --mini-font-size: 10px;
    --main-gap: 6px;
    --head-top: 10px;
    --disc-top: 66px;
    --artist-top: 258px;
    --lyrics-top: 282px;
    --progress-top: 338px;
    --pause-top: 378px;
    --bottom-top: 434px;
    left: 50%;
    bottom: 14px;
    transform: translateX(-50%);
  }

  .player-card.active {
    border-radius: 24px;
  }

  .head-row {
    padding: 0 10px;
    grid-template-columns: 40px 1fr 40px;
  }

  .player-card.active .disc-row {
    grid-template-columns: 42px 1fr 42px;
    padding: 0 8px;
  }

  .player-card.active .disc-wrap {
    width: min(52vw, 186px);
    height: min(52vw, 186px);
  }

  .player-card.active .cover-vinyl {
    width: min(50vw, 176px);
    height: min(50vw, 176px);
  }

  .lyrics-window {
    left: 10px;
    right: 10px;
    height: 50px;
  }

  .lyric.prev,
  .lyric.next {
    font-size: 11px;
  }

  .lyric.current {
    font-size: 12px;
  }

  .progress-row {
    left: 10px;
    right: 10px;
    grid-template-columns: 34px 1fr auto;
    gap: 4px;
  }

  .time-mix {
    min-width: 66px;
    font-size: 10px;
  }

  .bottom-row {
    padding: 0 8px;
  }

  .mini-action {
    border-radius: 12px;
    gap: 4px;
  }

  .viz-menu {
    right: 0;
    bottom: 42px;
  }

  .side-list {
    left: 0;
    right: 0;
    bottom: 0;
    width: var(--panel-w);
    height: var(--panel-h);
    max-height: none;
    border-radius: 24px;
    transform: scale(0.96);
    z-index: 30;
  }

  .side-list.visible {
    transform: scale(1);
  }

  .list-body {
    max-height: calc(var(--panel-h) - 64px);
  }
}

@media (max-width: 420px) {
  .music-player-shell {
    --panel-w: min(97vw, 360px);
    --panel-h: min(70vh, 520px);
    --title-size: 15px;
    --top-btn-size: 34px;
    --edge-btn-size: 34px;
    --mode-btn-size: 30px;
    --pause-btn-size: 46px;
    --mini-btn-h: 36px;
    --mini-font-size: 10px;
    --head-top: 8px;
    --disc-top: 58px;
    --artist-top: 238px;
    --lyrics-top: 258px;
    --progress-top: 312px;
    --pause-top: 352px;
    --bottom-top: 402px;
  }

  .player-card.active .disc-wrap {
    width: min(50vw, 166px);
    height: min(50vw, 166px);
  }

  .player-card.active .cover-vinyl {
    width: min(48vw, 158px);
    height: min(48vw, 158px);
  }

  .mini-action {
    padding: 0 4px;
  }
}

@media (max-height: 760px) {
  .music-player-shell {
    --panel-h: min(78vh, 560px);
  }
}
</style>
