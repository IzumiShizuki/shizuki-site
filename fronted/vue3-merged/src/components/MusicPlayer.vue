<template>
  <section class="music-player-shell" :class="shellClass" ref="rootRef">
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
        <div class="lyrics-triplet">
          <div class="lyric prev">{{ lyricContext?.prev || '' }}</div>
          <div class="lyric current">
            <span>{{ lyricContext?.current || (lyricLine || '纯音乐，无歌词') }}</span>
            <span
              v-if="lyricRenderMode === 'original_translation' && lyricContext?.currentTranslation"
              class="lyric-translation"
            >
              {{ lyricContext.currentTranslation }}
            </span>
          </div>
          <div class="lyric next">
            <span>{{ lyricContext?.next || '' }}</span>
            <span
              v-if="lyricRenderMode === 'original_translation' && lyricContext?.nextTranslation"
              class="lyric-translation"
            >
              {{ lyricContext.nextTranslation }}
            </span>
          </div>
        </div>
      </div>

      <div class="progress-row">
        <button
          class="mode-btn ripple-trigger"
          type="button"
          :title="`播放模式: ${modeLabel}`"
          :aria-label="`播放模式: ${modeLabel}`"
          @click="emit('cycle-mode')"
        >
          <span class="play-mode-icon" aria-hidden="true">
            <i :class="modeIcon"></i>
            <span v-if="playMode === 'single'" class="single-repeat-badge">1</span>
          </span>
        </button>

        <div
          class="progress-wrap"
          :class="{ disabled: !hasPlayableDuration }"
          ref="progressRef"
          role="slider"
          aria-label="歌曲播放进度"
          :aria-disabled="!hasPlayableDuration"
          :aria-valuemin="0"
          :aria-valuemax="100"
          :aria-valuenow="Math.round(progressPercent * 100)"
          :aria-valuetext="progressTitle"
          :tabindex="hasPlayableDuration ? 0 : -1"
          :title="progressTitle"
          @mousemove="onProgressMove"
          @mouseenter="previewVisible = hasPlayableDuration"
          @mouseleave="previewVisible = false"
          @click="onProgressClick"
          @keydown="onProgressKeydown"
        >
          <div class="progress-track">
            <div class="progress-fill" :style="{ width: `${progressPercent * 100}%` }"></div>
          </div>
          <div v-if="previewVisible" class="progress-preview" :style="{ left: `${previewPercent * 100}%` }">
            {{ previewTimeText }}
          </div>
        </div>

        <div class="time-mix" :title="progressTitle">
          <span v-if="isPreviewPlayback" class="preview-badge">试听</span>
          {{ playedText }} / {{ durationText }}
        </div>
      </div>

      <div class="pause-row">
        <button class="pause-btn ripple-trigger" type="button" :title="isPlaying ? '暂停' : '播放'" @click="emit('toggle-play')">
          <i class="fas" :class="isPlaying ? 'fa-pause' : 'fa-play'"></i>
        </button>
      </div>

      <div class="bottom-row" :class="{ 'with-viz-control': showVisualizerControls }">
        <button class="mini-action ripple-trigger" type="button" title="字幕" @click="emit('toggle-subtitle')">
          <i class="fas fa-closed-captioning"></i>
          <span>字幕</span>
        </button>
        <button class="mini-action ripple-trigger" type="button" title="列表" @click="emit('toggle-list')">
          <i class="fas fa-list"></i>
          <span>列表</span>
        </button>
        <div v-if="showVisualizerControls" class="viz-ctrl">
          <button class="mini-action ripple-trigger viz-btn" type="button" title="可视化" @click.stop="vizMenuOpen = !vizMenuOpen">
            <i class="fas fa-wave-square"></i>
            <span>可视化</span>
          </button>
          <div v-if="vizMenuOpen" class="viz-menu liquid-material">
            <div class="viz-mode-row">
              <button class="viz-opt ripple-trigger" :class="{ active: visualizerMode === 'bars' }" type="button" @click.stop="selectVisualizerMode('bars')">
                线型
              </button>
              <button class="viz-opt ripple-trigger" :class="{ active: visualizerMode === 'ring' }" type="button" @click.stop="selectVisualizerMode('ring')">
                圆形
              </button>
            </div>

            <div class="viz-style-grid">
              <button
                v-for="style in styleOptionsForMode"
                :key="style.key"
                class="viz-style-btn ripple-trigger"
                :class="{ active: visualizerStyle === style.key }"
                type="button"
                @click.stop="selectVisualizerStyle(style.key)"
              >
                <span class="viz-preview" :class="style.key">
                  <template v-if="style.mode === 'bars'">
                    <i class="p-bar"></i>
                    <i class="p-bar"></i>
                    <i class="p-bar"></i>
                    <i class="p-bar"></i>
                    <i class="p-bar"></i>
                  </template>
                  <template v-else>
                    <i class="p-ring"></i>
                    <i class="p-dot"></i>
                  </template>
                </span>
                <span class="viz-style-label">{{ style.label }}</span>
              </button>
            </div>
          </div>
        </div>
      </div>
    </article>

    <aside v-if="!suppressedByRoute" class="side-list liquid-material" :class="{ visible: isExpanded && listOpen }">
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
          :key="item.queueEntryId || `${item.provider || 'local'}:${item.trackId || item.id || idx}`"
          class="track-item ripple-trigger"
          :class="{ active: isCurrentQueueItem(item) }"
          :ref="isCurrentQueueItem(item) ? setCurrentQueueRow : undefined"
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
import { computed, nextTick, onBeforeUnmount, ref, shallowRef, watch } from 'vue';
import { useDismissiblePopover } from '../composables/useDismissiblePopover';
import { formatMediaTime } from '../utils/mediaTime';
import { safeCssUrl } from '../utils/url';
import {
  MUSIC_PLAYER_PEEK_MODE,
  MUSIC_PLAYER_PEEK_STATE,
  isMusicPlayerPeekEligible,
  nextMusicPlayerPeekStateOnDiscClick,
  resolveMusicPlayerPeekMode,
  resolveMusicPlayerPeekState
} from '../utils/musicPlayerPeekState';

const props = defineProps({
  track: { type: Object, default: null },
  tracks: { type: Array, default: () => [] },
  lyricLine: { type: String, default: '' },
  lyricContext: {
    type: Object,
    default: () => ({ prev: '', current: '', next: '', key: 'empty' })
  },
  lyricRenderMode: { type: String, default: 'original_translation' },
  currentTime: { type: Number, default: 0 },
  duration: { type: Number, default: 0 },
  expectedDuration: { type: Number, default: 0 },
  isPreviewPlayback: { type: Boolean, default: false },
  isPlaying: { type: Boolean, default: false },
  isExpanded: { type: Boolean, default: false },
  isPinned: { type: Boolean, default: false },
  playMode: { type: String, default: 'sequential' },
  listOpen: { type: Boolean, default: false },
  visualizerMode: { type: String, default: 'bars' },
  visualizerStyle: { type: String, default: 'bars-aurora' },
  showVisualizerControls: { type: Boolean, default: false },
  isHomeRoute: { type: Boolean, default: true },
  isMobileViewport: { type: Boolean, default: false },
  suppressedByRoute: { type: Boolean, default: false }
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
  'set-visualizer-mode',
  'set-visualizer-style',
  'reorder-tracks',
  'open-settings'
]);

const rootRef = ref(null);
const currentQueueRowRef = shallowRef(null);
const dragIndex = ref(-1);
const progressRef = ref(null);
const previewVisible = ref(false);
const previewPercent = ref(0);
const vizMenuOpen = ref(false);
const peekState = ref(
  resolveMusicPlayerPeekState({
    isHomeRoute: props.isHomeRoute,
    isExpanded: props.isExpanded,
    isPinned: props.isPinned
  })
);
const peekRevealAnimating = ref(false);

const gesture = {
  pointerId: null,
  startX: 0,
  startY: 0,
  moved: false
};

let peekRevealTimer = 0;

const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const safeCover = safeCssUrl(props.track?.cover || fallback);
  return {
    backgroundImage: safeCover ? `url('${safeCover}')` : 'none'
  };
});

const modeIcon = computed(() => {
  if (props.playMode === 'random') return 'fas fa-shuffle';
  return 'fas fa-repeat';
});

const modeLabel = computed(() => {
  if (props.playMode === 'random') return '随机';
  if (props.playMode === 'single') return '单曲循环';
  return '顺序播放';
});

const isPeekEligible = computed(() =>
  isMusicPlayerPeekEligible({
    isHomeRoute: props.isHomeRoute,
    isExpanded: props.isExpanded,
    isPinned: props.isPinned
  })
);

const peekMode = computed(() => resolveMusicPlayerPeekMode({ isMobileViewport: props.isMobileViewport }));

const shellClass = computed(() => ({
  'peek-hidden': isPeekEligible.value && peekState.value === MUSIC_PLAYER_PEEK_STATE.HIDDEN,
  'peek-revealed': isPeekEligible.value && peekState.value === MUSIC_PLAYER_PEEK_STATE.REVEALED,
  'peek-corner-quarter': isPeekEligible.value && peekMode.value === MUSIC_PLAYER_PEEK_MODE.CORNER_QUARTER,
  'peek-bottom-half': isPeekEligible.value && peekMode.value === MUSIC_PLAYER_PEEK_MODE.BOTTOM_HALF,
  'peek-reveal-accel': peekRevealAnimating.value,
  'is-route-suppressed': props.suppressedByRoute
}));

const visualizerStyleOptions = [
  { key: 'bars-aurora', label: '极光光柱', mode: 'bars' },
  { key: 'bars-neon', label: '霓虹脉冲', mode: 'bars' },
  { key: 'bars-crystal', label: '晶体频谱', mode: 'bars' },
  { key: 'bars-firefly', label: '萤火流光', mode: 'bars' },
  { key: 'ring-halo', label: '光环矩阵', mode: 'ring' },
  { key: 'ring-orbit', label: '轨道星环', mode: 'ring' },
  { key: 'ring-pulse', label: '脉冲漩涡', mode: 'ring' }
];

const styleOptionsForMode = computed(() => {
  const mode = props.visualizerMode === 'ring' ? 'ring' : 'bars';
  return visualizerStyleOptions.filter((item) => item.mode === mode);
});

const progressPercent = computed(() => {
  if (!Number.isFinite(props.duration) || props.duration <= 0) return 0;
  return Math.max(0, Math.min(1, props.currentTime / props.duration));
});

const hasPlayableDuration = computed(() => Number.isFinite(props.duration) && props.duration > 0);
const playedText = computed(() => formatMediaTime(props.currentTime));
const durationText = computed(() => (hasPlayableDuration.value ? formatMediaTime(props.duration) : '--:--'));
const progressTitle = computed(() => {
  if (!hasPlayableDuration.value) return '等待音频时长信息';
  if (!props.isPreviewPlayback) return `播放进度 ${playedText.value} / ${durationText.value}`;
  const expected = Number(props.expectedDuration);
  const fullText = Number.isFinite(expected) && expected > props.duration
    ? `，完整时长 ${formatMediaTime(expected)}`
    : '';
  return `试听音频，可播放 ${durationText.value}${fullText}`;
});

const previewTimeText = computed(() => {
  const total = Number.isFinite(props.duration) ? props.duration : 0;
  return formatMediaTime(total * previewPercent.value);
});

const currentQueueIdentity = computed(() => {
  const entryId = String(props.track?.queueEntryId || '').trim();
  const baseIdentity = entryId
    ? `entry:${entryId}`
    : `track:${String(props.track?.provider || '').trim().toLowerCase()}:${String(props.track?.trackId || props.track?.id || '').trim()}`;
  return `${baseIdentity}:${props.tracks.findIndex(isCurrentQueueItem)}`;
});

function isCurrentQueueItem(item) {
  if (!item || !props.track) return false;
  const itemEntryId = String(item.queueEntryId || '').trim();
  const currentEntryId = String(props.track.queueEntryId || '').trim();
  if (itemEntryId && currentEntryId) return itemEntryId === currentEntryId;
  const itemProvider = String(item.provider || '').trim().toLowerCase();
  const currentProvider = String(props.track.provider || '').trim().toLowerCase();
  const itemId = String(item.trackId || item.id || '').trim();
  const currentId = String(props.track.trackId || props.track.id || '').trim();
  return itemId === currentId && (!itemProvider || !currentProvider || itemProvider === currentProvider);
}

function setCurrentQueueRow(element) {
  if (element) currentQueueRowRef.value = element;
}

watch(
  [() => props.listOpen && props.isExpanded && !props.suppressedByRoute, () => currentQueueIdentity.value],
  ([isOpen], previous) => {
    if (!isOpen || (previous && previous[0] && previous[1] === currentQueueIdentity.value)) return;
    nextTick(() => currentQueueRowRef.value?.scrollIntoView?.({ block: 'nearest' }));
  }
);

function stopPeekRevealAnimation() {
  if (peekRevealTimer) {
    window.clearTimeout(peekRevealTimer);
    peekRevealTimer = 0;
  }
  peekRevealAnimating.value = false;
}

function triggerPeekRevealAnimation() {
  stopPeekRevealAnimation();
  peekRevealAnimating.value = true;
  peekRevealTimer = window.setTimeout(() => {
    peekRevealAnimating.value = false;
    peekRevealTimer = 0;
  }, 560);
}

function syncPeekStateFromProps() {
  const nextState = resolveMusicPlayerPeekState({
    isHomeRoute: props.isHomeRoute,
    isExpanded: props.isExpanded,
    isPinned: props.isPinned
  });

  if (nextState === MUSIC_PLAYER_PEEK_STATE.HIDDEN) {
    peekState.value = MUSIC_PLAYER_PEEK_STATE.HIDDEN;
    return;
  }

  peekState.value = MUSIC_PLAYER_PEEK_STATE.REVEALED;
  stopPeekRevealAnimation();
}

function onDiscClick() {
  if (props.isExpanded) return;

  const transition = nextMusicPlayerPeekStateOnDiscClick({
    currentState: peekState.value,
    isPeekEligible: isPeekEligible.value
  });

  peekState.value = transition.nextState;
  if (transition.action === 'reveal') {
    triggerPeekRevealAnimation();
    return;
  }

  stopPeekRevealAnimation();
  emit('set-expanded', true);
}

function pointToPercent(clientX) {
  const el = progressRef.value;
  if (!el) return 0;
  const rect = el.getBoundingClientRect();
  if (rect.width <= 0) return 0;
  return Math.max(0, Math.min(1, (clientX - rect.left) / rect.width));
}

function onProgressMove(e) {
  if (!hasPlayableDuration.value) return;
  previewPercent.value = pointToPercent(e.clientX);
}

function onProgressClick(e) {
  if (!hasPlayableDuration.value) return;
  const pct = pointToPercent(e.clientX);
  previewPercent.value = pct;
  emit('seek', pct);
}

function onProgressKeydown(event) {
  if (!hasPlayableDuration.value) return;
  let next = progressPercent.value;
  const step = Math.min(0.1, 5 / props.duration);
  if (event.key === 'ArrowLeft' || event.key === 'ArrowDown') next -= step;
  else if (event.key === 'ArrowRight' || event.key === 'ArrowUp') next += step;
  else if (event.key === 'Home') next = 0;
  else if (event.key === 'End') next = 1;
  else return;
  event.preventDefault();
  emit('seek', Math.max(0, Math.min(1, next)));
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

function selectVisualizerMode(mode) {
  if (mode !== 'bars' && mode !== 'ring') return;
  emit('set-visualizer-mode', mode);
}

function selectVisualizerStyle(styleKey) {
  emit('set-visualizer-style', styleKey);
}

function dismissPlayerShell() {
  vizMenuOpen.value = false;
  const canDismissExpanded = props.isExpanded && !props.isPinned;
  if (canDismissExpanded) {
    emit('set-expanded', false);
    return;
  }
  stopPeekRevealAnimation();
  peekState.value = MUSIC_PLAYER_PEEK_STATE.HIDDEN;
}

watch(
  () => [props.isHomeRoute, props.isExpanded, props.isPinned],
  () => {
    syncPeekStateFromProps();
  },
  { immediate: true }
);

useDismissiblePopover({
  rootRef,
  enabled: () => {
    const canDismissExpanded = props.isExpanded && !props.isPinned;
    const canDismissPeek = !props.isExpanded && isPeekEligible.value && peekState.value === MUSIC_PLAYER_PEEK_STATE.REVEALED;
    return canDismissExpanded || canDismissPeek;
  },
  shouldIgnoreEvent: (event) => {
    const target = event?.target;
    if (!(target instanceof Element)) return false;
    if (target.closest('.global-bars') || target.closest('.global-ring') || target.closest('.global-lyric-bar')) return true;
    if (target.closest('.top-menu-root') || target.closest('.ai-dialog-shell')) return true;
    return false;
  },
  onDismiss: dismissPlayerShell
});

onBeforeUnmount(() => {
  stopPeekRevealAnimation();
});
</script>

<style scoped>
/* ========================================
   Music Player Shell - Warm & Cozy Design
   ======================================== */

.music-player-shell {
  /* Animation Curves */
  --elastic: cubic-bezier(0.34, 1.56, 0.64, 1);
  --smooth: var(--ease-smooth);

  /* Position Variables */
  --shell-base-x: 0px;
  --shell-base-y: 0px;
  --peek-offset-x: 0px;
  --peek-offset-y: 0px;
  --suppress-offset-x: 0px;
  --suppress-offset-y: 0px;
  --suppress-scale: 1;
  --suppress-opacity: 1;
  --peek-corner-hidden-x: -62px;
  --peek-corner-hidden-y: 62px;
  --peek-bottom-hidden-y: 44px;

  /* Dimensions - More Spacious */
  --panel-w: min(92vw, 380px);
  --panel-h: 640px;
  --disc-size: 92px;
  --title-size: var(--text-2xl);
  --top-btn-size: 48px;
  --edge-btn-size: 52px;
  --mode-btn-size: 40px;
  --pause-btn-size: 68px;
  --mini-btn-h: 48px;
  --mini-font-size: var(--text-sm);

  /* Layout Positions */
  --head-top: var(--space-4);
  --disc-top: 96px;
  --artist-top: 352px;
  --lyrics-top: 388px;
  --progress-top: 464px;
  --pause-top: 512px;
  --bottom-top: 572px;

  position: fixed;
  left: var(--space-6);
  bottom: var(--space-6);
  z-index: 1120;
  pointer-events: auto;
  transform: translate3d(
    calc(var(--shell-base-x) + var(--peek-offset-x) + var(--suppress-offset-x)),
    calc(var(--shell-base-y) + var(--peek-offset-y) + var(--suppress-offset-y)),
    0
  ) scale(var(--suppress-scale));
  opacity: var(--suppress-opacity);
  transition:
    transform var(--duration-slow) var(--elastic),
    opacity var(--duration-base) var(--ease-out);
  will-change: transform;
}

.music-player-shell.is-route-suppressed {
  --suppress-offset-x: -20px;
  --suppress-offset-y: 20px;
  --suppress-scale: 0.4;
  --suppress-opacity: 0;
  pointer-events: none;
}

.music-player-shell.peek-hidden.peek-corner-quarter {
  --peek-offset-x: var(--peek-corner-hidden-x);
  --peek-offset-y: var(--peek-corner-hidden-y);
}

.music-player-shell.peek-hidden.peek-bottom-half {
  --peek-offset-x: 0px;
  --peek-offset-y: var(--peek-bottom-hidden-y);
}

.music-player-shell.peek-revealed {
  --peek-offset-x: 0px;
  --peek-offset-y: 0px;
}

.music-player-shell.peek-reveal-accel.peek-corner-quarter {
  animation: music-player-peek-reveal-corner 560ms cubic-bezier(0.2, 0.88, 0.18, 1.18);
}

.music-player-shell.peek-reveal-accel.peek-bottom-half {
  animation: music-player-peek-reveal-bottom 560ms cubic-bezier(0.2, 0.88, 0.18, 1.18);
}

/* ========================================
   Player Card - Enhanced Glass Morphism
   ======================================== */

.player-card {
  position: relative;
  width: var(--disc-size);
  height: var(--disc-size);
  border-radius: var(--radius-full);
  overflow: hidden;
  pointer-events: auto;
  transition:
    width 620ms var(--elastic),
    height 620ms var(--elastic),
    border-radius 420ms var(--smooth);

  /* Warm glass effect */
  background:
    var(--gradient-glow),
    var(--glass-bg-gradient),
    var(--surface-elevated);
  border: 1px solid var(--glass-border-strong);
  box-shadow:
    var(--shadow-2xl),
    var(--glass-highlight),
    var(--glass-shadow);
  backdrop-filter: var(--glass-backdrop);
  -webkit-backdrop-filter: var(--glass-backdrop);
}

.player-card.active {
  width: var(--panel-w);
  height: var(--panel-h);
  border-radius: var(--radius-3xl);
}

/* ========================================
   Header Row - Title & Controls
   ======================================== */

.head-row {
  position: absolute;
  left: 0;
  right: 0;
  top: var(--head-top);
  display: grid;
  grid-template-columns: 52px 1fr 52px;
  align-items: center;
  gap: var(--space-2);
  padding: 0 var(--space-4);
  opacity: 0;
  transform: translateY(-10px);
  transition:
    opacity var(--duration-base) var(--ease-out),
    transform var(--duration-base) var(--smooth);
  pointer-events: none;
}

.player-card.active .head-row {
  opacity: 1;
  transform: translateY(0);
  pointer-events: auto;
  transition-delay: 200ms;
}

.top-btn {
  width: var(--top-btn-size);
  height: var(--top-btn-size);
  border: 0;
  border-radius: var(--radius-lg);
  background: var(--surface-soft);
  color: var(--icon-primary);
  border: 1px solid var(--border-base);
  font-size: var(--text-lg);
  cursor: pointer;
  transition: all var(--duration-fast) var(--smooth);
  display: flex;
  align-items: center;
  justify-content: center;
}

.top-btn:hover {
  background: var(--interactive-hover);
  border-color: var(--border-strong);
  transform: translateY(-2px);
  box-shadow: var(--shadow-sm);
}

.top-btn:active {
  transform: translateY(0) scale(0.96);
}

.song-title {
  text-align: center;
  color: var(--text-primary);
  font-size: var(--title-size);
  font-weight: var(--font-weight-bold);
  line-height: var(--line-height-tight);
  transform: scale(0.5);
  transform-origin: center;
  transition: transform var(--duration-base) var(--smooth);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.player-card.active .song-title {
  transform: scale(1);
  transition-delay: 220ms;
}

.player-card.pinned .top-pin {
  background: var(--accent-fill-strong);
  color: var(--accent-surface-text);
  border-color: var(--accent-border);
  box-shadow: var(--shadow-accent-sm);
}

.player-card.pinned .top-pin i {
  display: inline-block;
  transform: rotate(-20deg);
}

/* ========================================
   Disc Row - Vinyl & Navigation
   ======================================== */

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
  transition:
    top 620ms var(--elastic),
    transform 620ms var(--elastic),
    opacity var(--duration-base) var(--ease-out);
}

.player-card.active .disc-row {
  top: var(--disc-top);
  transform: translateY(0);
  grid-template-columns: 60px 1fr 60px;
  padding: 0 var(--space-4);
  transition-delay: 100ms;
}

.edge-btn {
  width: var(--edge-btn-size);
  height: var(--edge-btn-size);
  border: 0;
  border-radius: var(--radius-full);
  background: var(--surface-soft);
  color: var(--icon-primary);
  border: 1px solid var(--border-base);
  font-size: var(--text-lg);
  cursor: pointer;
  opacity: 0;
  pointer-events: none;
  transition: all var(--duration-fast) var(--smooth);
  display: flex;
  align-items: center;
  justify-content: center;
}

.player-card.active .edge-btn {
  opacity: 1;
  pointer-events: auto;
  transition-delay: 280ms;
}

.edge-btn:hover {
  background: var(--interactive-hover);
  border-color: var(--border-strong);
  transform: translateY(-2px) scale(1.08);
  box-shadow: var(--shadow-sm);
}

.edge-btn:active {
  transform: scale(0.94);
}

/* ========================================
   Vinyl Disc - 3D Effect & Spin
   ======================================== */

.disc-wrap {
  width: 84px;
  height: 84px;
  border: 0;
  background: transparent;
  display: grid;
  place-items: center;
  cursor: pointer;
  pointer-events: auto;
  position: relative;
  z-index: 8;
  transition:
    width 620ms var(--elastic),
    height 620ms var(--elastic);
}

.player-card.active .disc-wrap {
  width: 252px;
  height: 252px;
  transition-delay: 120ms;
}

.cover-vinyl {
  position: relative;
  width: 76px;
  height: 76px;
  border-radius: var(--radius-full);
  pointer-events: auto;
  transition: all 620ms var(--elastic);
  animation: disc-spin 3s linear infinite;
  animation-play-state: paused;

  /* Enhanced vinyl texture with warm tones */
  background:
    /* Highlight spot */
    radial-gradient(
      circle at 28% 25%,
      rgba(255, 255, 255, 0.12),
      transparent 45%
    ),
    /* Center label gradient */
    radial-gradient(
      circle at 50% 50%,
      rgba(255, 200, 180, 0.15) 0%,
      rgba(40, 35, 30, 0.95) 32%,
      transparent 38%
    ),
    /* Grooves - concentric rings */
    repeating-radial-gradient(
      circle at 50% 50%,
      rgba(0, 0, 0, 0.08) 0px,
      rgba(255, 255, 255, 0.02) 1px,
      rgba(0, 0, 0, 0.08) 2px
    ),
    /* Conic gradient for depth */
    conic-gradient(
      from 0deg,
      rgba(0, 0, 0, 0.06) 0deg,
      rgba(255, 255, 255, 0.04) 90deg,
      rgba(0, 0, 0, 0.06) 180deg,
      rgba(255, 255, 255, 0.04) 270deg,
      rgba(0, 0, 0, 0.06) 360deg
    ),
    /* Base color */
    #1A1614;

  box-shadow:
    /* Outer rim */
    0 0 0 2px rgba(255, 255, 255, 0.06),
    /* Elevation shadow */
    0 8px 24px rgba(0, 0, 0, 0.32),
    /* Inner highlight */
    inset 0 1px 2px rgba(255, 255, 255, 0.08),
    /* Inner shadow */
    inset 0 -2px 4px rgba(0, 0, 0, 0.24);
}

.player-card.active .cover-vinyl {
  width: 244px;
  height: 244px;
  box-shadow:
    /* Label ring */
    inset 0 0 0 3px rgba(20, 18, 16, 0.95),
    /* Label area */
    inset 0 0 0 68px rgba(15, 13, 11, 0.85),
    /* Label edge highlight */
    inset 0 0 0 70px rgba(255, 200, 180, 0.12),
    /* Outer edge */
    0 0 0 2px rgba(255, 255, 255, 0.08),
    /* Deep shadow */
    0 16px 48px rgba(0, 0, 0, 0.36),
    /* Soft glow */
    0 0 32px rgba(var(--accent-rgb), 0.08);
}

.cover-vinyl.expanded {
  /* Subtle pulsing when expanded */
  animation: disc-spin 3s linear infinite, vinyl-breathe 4s ease-in-out infinite;
}

/* Cover Image */
.cover-img {
  position: absolute;
  inset: 0;
  border-radius: inherit;
  background-size: cover;
  background-position: center;
  z-index: 1;
  transition: opacity var(--duration-base) var(--ease-smooth);
}

.player-card.active .cover-img {
  /* Crop to label area when expanded */
  inset: 28%;
  border-radius: var(--radius-full);
  box-shadow:
    0 0 0 1px rgba(255, 255, 255, 0.08),
    0 2px 8px rgba(0, 0, 0, 0.2);
}

/* Center Hole */
.center-hole {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 18px;
  height: 18px;
  border-radius: var(--radius-full);
  background:
    radial-gradient(
      circle,
      rgba(0, 0, 0, 0.95) 0%,
      rgba(40, 35, 30, 0.85) 100%
    );
  border: 1px solid rgba(0, 0, 0, 0.7);
  box-shadow:
    inset 0 1px 2px rgba(0, 0, 0, 0.8),
    0 1px 2px rgba(255, 255, 255, 0.1);
  z-index: 3;
  transition: all 620ms var(--elastic);
}

.player-card.active .center-hole {
  width: 24px;
  height: 24px;
}

/* ========================================
   Artist & Lyrics - Elegant Typography
   ======================================== */

.artist-line {
  position: absolute;
  left: 0;
  right: 0;
  top: var(--artist-top);
  text-align: center;
  color: var(--text-secondary);
  font-size: var(--text-base);
  font-weight: var(--font-weight-medium);
  padding: 0 var(--space-6);
  opacity: 0;
  transform: translateY(8px);
  transition:
    opacity var(--duration-base) var(--ease-out),
    transform var(--duration-base) var(--smooth);
  pointer-events: none;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.player-card.active .artist-line {
  opacity: 1;
  transform: translateY(0);
  pointer-events: auto;
  transition-delay: 300ms;
}

.lyrics-window {
  position: absolute;
  left: var(--space-6);
  right: var(--space-6);
  top: var(--lyrics-top);
  min-height: 64px;
  opacity: 0;
  transform: translateY(10px);
  transition:
    opacity var(--duration-base) var(--ease-out),
    transform var(--duration-base) var(--smooth);
  pointer-events: none;
}

.player-card.active .lyrics-window {
  opacity: 1;
  transform: translateY(0);
  pointer-events: auto;
  transition-delay: 320ms;
}

.lyrics-triplet {
  display: grid;
  gap: var(--space-2);
  text-align: center;
}

.lyric {
  display: flex;
  flex-direction: column;
  gap: var(--space-1);
  line-height: var(--line-height-relaxed);
  transition: all var(--duration-base) var(--smooth);
}

.lyric.prev,
.lyric.next {
  font-size: var(--text-sm);
  color: var(--text-tertiary);
  opacity: 0.6;
}

.lyric.current {
  font-size: var(--text-lg);
  font-weight: var(--font-weight-semibold);
  color: var(--text-primary);
  padding: var(--space-2) var(--space-3);
  background: var(--surface-soft);
  border: 1px solid var(--border-subtle);
  border-radius: var(--radius-lg);
  box-shadow: var(--shadow-xs);
}

.lyric-translation {
  font-size: var(--text-sm);
  color: var(--text-secondary);
  font-weight: var(--font-weight-normal);
  opacity: 0.85;
}

/* ========================================
   Progress Row - Enhanced Scrubber
   ======================================== */

.progress-row {
  position: absolute;
  left: var(--space-4);
  right: var(--space-4);
  top: var(--progress-top);
  display: grid;
  grid-template-columns: var(--mode-btn-size) 1fr auto;
  align-items: center;
  gap: var(--space-3);
  opacity: 0;
  transform: translateY(8px);
  transition:
    opacity var(--duration-base) var(--ease-out),
    transform var(--duration-base) var(--smooth);
  pointer-events: none;
}

.player-card.active .progress-row {
  opacity: 1;
  transform: translateY(0);
  pointer-events: auto;
  transition-delay: 340ms;
}

.mode-btn {
  width: var(--mode-btn-size);
  height: var(--mode-btn-size);
  border: 0;
  border-radius: var(--radius-md);
  background: var(--surface-soft);
  color: var(--icon-secondary);
  border: 1px solid var(--border-base);
  font-size: var(--text-md);
  cursor: pointer;
  transition: all var(--duration-fast) var(--smooth);
  display: flex;
  align-items: center;
  justify-content: center;
  position: relative;
}

.mode-btn:hover {
  background: var(--interactive-hover);
  border-color: var(--border-strong);
  color: var(--icon-primary);
  transform: translateY(-1px);
}

.play-mode-icon {
  position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
}

.single-repeat-badge {
  position: absolute;
  top: -4px;
  right: -4px;
  width: 14px;
  height: 14px;
  border-radius: var(--radius-full);
  background: var(--accent-base);
  color: var(--accent-surface-text);
  font-size: 9px;
  font-weight: var(--font-weight-bold);
  display: flex;
  align-items: center;
  justify-content: center;
  box-shadow: var(--shadow-xs);
}

.progress-wrap {
  position: relative;
  height: 40px;
  display: flex;
  align-items: center;
  cursor: pointer;
  padding: 0 var(--space-1);
}

.progress-wrap.disabled {
  cursor: not-allowed;
  opacity: 0.5;
}

.progress-wrap:focus-visible {
  outline: 2px solid var(--accent-base);
  outline-offset: 2px;
  border-radius: var(--radius-sm);
}

.progress-track {
  position: relative;
  width: 100%;
  height: 4px;
  background: var(--surface-soft);
  border: 1px solid var(--border-subtle);
  border-radius: var(--radius-full);
  overflow: visible;
}

.progress-fill {
  position: absolute;
  left: 0;
  top: 0;
  height: 100%;
  background: linear-gradient(
    90deg,
    var(--accent-strong),
    var(--accent-base)
  );
  border-radius: inherit;
  transition: width 100ms linear;
  box-shadow: var(--glow-sm);
}

/* Progress Thumb (handle) */
.progress-fill::after {
  content: '';
  position: absolute;
  right: -7px;
  top: 50%;
  transform: translateY(-50%);
  width: 14px;
  height: 14px;
  background: var(--accent-base);
  border: 2px solid var(--surface-elevated);
  border-radius: var(--radius-full);
  box-shadow:
    var(--shadow-sm),
    var(--glow-sm);
  opacity: 0;
  transition: opacity var(--duration-fast) var(--smooth);
}

.progress-wrap:hover .progress-fill::after,
.progress-wrap:focus-visible .progress-fill::after {
  opacity: 1;
}

.progress-preview {
  position: absolute;
  bottom: calc(100% + var(--space-2));
  transform: translateX(-50%);
  padding: var(--space-1) var(--space-2);
  background: var(--surface-elevated);
  border: 1px solid var(--border-base);
  border-radius: var(--radius-md);
  color: var(--text-primary);
  font-size: var(--text-xs);
  font-weight: var(--font-weight-medium);
  white-space: nowrap;
  pointer-events: none;
  box-shadow: var(--shadow-md);
  z-index: 10;
}

.progress-preview::after {
  content: '';
  position: absolute;
  top: 100%;
  left: 50%;
  transform: translateX(-50%);
  width: 0;
  height: 0;
  border-left: 5px solid transparent;
  border-right: 5px solid transparent;
  border-top: 5px solid var(--border-base);
}

.time-mix {
  font-size: var(--text-xs);
  font-weight: var(--font-weight-medium);
  color: var(--text-tertiary);
  white-space: nowrap;
  display: flex;
  align-items: center;
  gap: var(--space-1);
}

.preview-badge {
  padding: 2px var(--space-1);
  background: var(--accent-fill);
  color: var(--accent-base);
  border-radius: var(--radius-xs);
  font-size: 9px;
  font-weight: var(--font-weight-bold);
  text-transform: uppercase;
  letter-spacing: 0.05em;
}

/* Spin Animations */
.cover-vinyl.spinning {
  animation-play-state: running;
}

@keyframes disc-spin {
  from { transform: rotate(0deg); }
  to { transform: rotate(360deg); }
}

@keyframes vinyl-breathe {
  0%, 100% { filter: brightness(1); }
  50% { filter: brightness(1.05); }
}

/* ========================================
   Pause Button - Elegant Play Control
   ======================================== */

/* ========================================
   Pause Button - Elegant Play Control
   ======================================== */

.pause-row {
  position: absolute;
  left: 0;
  right: 0;
  top: var(--pause-top);
  display: grid;
  place-items: center;
  opacity: 0;
  transform: translateY(8px);
  transition:
    opacity var(--duration-base) var(--ease-out),
    transform var(--duration-base) var(--smooth);
  pointer-events: none;
}

.player-card.active .pause-row {
  opacity: 1;
  transform: translateY(0);
  pointer-events: auto;
  transition-delay: 360ms;
}

.pause-btn {
  width: var(--pause-btn-size);
  height: var(--pause-btn-size);
  border: 0;
  border-radius: var(--radius-full);
  background: linear-gradient(
    135deg,
    var(--accent-soft),
    var(--accent-base)
  );
  color: var(--accent-surface-text);
  font-size: var(--text-2xl);
  cursor: pointer;
  transition: all var(--duration-fast) var(--smooth);
  display: flex;
  align-items: center;
  justify-content: center;
  box-shadow:
    var(--shadow-lg),
    var(--glow-soft);
  border: 1px solid rgba(var(--accent-rgb), 0.4);
  position: relative;
  overflow: hidden;
}

.pause-btn::before {
  content: '';
  position: absolute;
  inset: 0;
  background: radial-gradient(
    circle at 50% 0%,
    rgba(255, 255, 255, 0.2),
    transparent 70%
  );
  opacity: 0.8;
  transition: opacity var(--duration-fast);
}

.pause-btn:hover {
  transform: translateY(-3px) scale(1.05);
  box-shadow:
    var(--shadow-xl),
    var(--glow-md);
}

.pause-btn:active {
  transform: translateY(-1px) scale(1);
}

/* ========================================
   Bottom Actions - Elegant Controls
   ======================================== */

/* ========================================
   Bottom Actions - Elegant Controls
   ======================================== */

.bottom-row {
  position: absolute;
  left: 0;
  right: 0;
  top: var(--bottom-top);
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  padding: 0 var(--space-6);
  gap: var(--space-3);
  opacity: 0;
  transform: translateY(8px);
  transition:
    opacity var(--duration-base) var(--ease-out),
    transform var(--duration-base) var(--smooth);
  pointer-events: none;
}

.bottom-row.with-viz-control {
  grid-template-columns: repeat(3, minmax(0, 1fr));
}

.player-card.active .bottom-row {
  opacity: 1;
  transform: translateY(0);
  pointer-events: auto;
  transition-delay: 380ms;
}

.mini-action {
  border: 0;
  border-radius: var(--radius-lg);
  width: 100%;
  min-height: var(--mini-btn-h);
  background: var(--surface-soft);
  color: var(--icon-primary);
  border: 1px solid var(--border-base);
  font-size: var(--mini-font-size);
  font-weight: var(--font-weight-medium);
  cursor: pointer;
  transition: all var(--duration-fast) var(--smooth);
  display: flex;
  align-items: center;
  justify-content: center;
  gap: var(--space-2);
}

.mini-action:hover {
  background: var(--interactive-hover);
  border-color: var(--border-strong);
  transform: translateY(-2px);
  box-shadow: var(--shadow-sm);
}

.mini-action:active {
  transform: translateY(0);
}

.viz-ctrl {
  position: relative;
  min-width: 0;
  z-index: 12;
}

.viz-btn {
  min-width: 0;
}

/* Visualizer Menu */
.viz-menu {
  position: absolute;
  right: 0;
  bottom: calc(100% + var(--space-2));
  border-radius: var(--radius-xl);
  padding: var(--space-2);
  display: grid;
  gap: var(--space-2);
  min-width: 240px;
  z-index: 20;
  background:
    var(--glass-bg-gradient),
    var(--surface-elevated);
  border: 1px solid var(--glass-border);
  box-shadow:
    var(--shadow-xl),
    var(--glass-highlight);
  backdrop-filter: var(--glass-backdrop);
  -webkit-backdrop-filter: var(--glass-backdrop);
}

.viz-mode-row {
  display: grid;
  grid-template-columns: 1fr 1fr;
  gap: var(--space-2);
}

.viz-opt {
  border: 0;
  border-radius: var(--radius-md);
  height: 32px;
  background: var(--surface-soft);
  color: var(--text-secondary);
  border: 1px solid var(--border-base);
  font-size: var(--text-sm);
  font-weight: var(--font-weight-medium);
  cursor: pointer;
  transition: all var(--duration-fast) var(--smooth);
}

.viz-opt:hover {
  background: var(--interactive-hover);
  color: var(--text-primary);
}

.viz-opt.active {
  background: var(--accent-fill-strong);
  color: var(--accent-base);
  border-color: var(--accent-border);
  box-shadow: var(--shadow-accent-sm);
}

.viz-style-grid {
  display: grid;
  grid-template-columns: 1fr;
  gap: var(--space-2);
}

.viz-style-btn {
  border: 0;
  border-radius: var(--radius-lg);
  min-height: 40px;
  padding: var(--space-2) var(--space-3);
  background: var(--surface-soft);
  color: var(--text-secondary);
  border: 1px solid var(--border-base);
  cursor: pointer;
  transition: all var(--duration-fast) var(--smooth);
  display: flex;
  align-items: center;
  gap: var(--space-2);
  text-align: left;
}

.viz-style-btn:hover {
  background: var(--interactive-hover);
  color: var(--text-primary);
}

.viz-style-btn.active {
  background: var(--accent-fill);
  border-color: var(--accent-border);
  box-shadow: var(--shadow-accent-sm);
}

.viz-style-label {
  font-size: var(--text-sm);
  font-weight: var(--font-weight-medium);
  line-height: 1;
}

/* Visualizer Preview Icons */
.viz-preview {
  width: 56px;
  height: 24px;
  border-radius: var(--radius-full);
  position: relative;
  display: flex;
  align-items: end;
  justify-content: center;
  gap: 2px;
  padding: 2px;
  background: rgba(0, 0, 0, 0.2);
  overflow: hidden;
}

.viz-preview .p-bar {
  width: 3px;
  border-radius: var(--radius-full);
  background: var(--accent-soft);
  box-shadow: var(--glow-sm);
  animation: viz-preview-bars 1.3s ease-in-out infinite;
}

.viz-preview .p-bar:nth-child(1) { height: 8px; animation-delay: 0s; }
.viz-preview .p-bar:nth-child(2) { height: 14px; animation-delay: 0.08s; }
.viz-preview .p-bar:nth-child(3) { height: 18px; animation-delay: 0.16s; }
.viz-preview .p-bar:nth-child(4) { height: 12px; animation-delay: 0.24s; }
.viz-preview .p-bar:nth-child(5) { height: 7px; animation-delay: 0.32s; }

.viz-preview .p-ring {
  width: 16px;
  height: 16px;
  border-radius: var(--radius-full);
  border: 2px solid var(--accent-soft);
  box-shadow: var(--glow-sm);
  animation: viz-preview-ring 1.5s ease-in-out infinite;
}

.viz-preview .p-dot {
  position: absolute;
  width: 4px;
  height: 4px;
  border-radius: var(--radius-full);
  background: var(--accent-strong);
  box-shadow: var(--glow-sm);
  animation: viz-preview-dot 1.6s linear infinite;
}

.viz-preview.bars-crystal .p-bar {
  background: linear-gradient(180deg, var(--accent-soft), rgba(255, 255, 255, 0.9));
}

.viz-preview.bars-firefly .p-bar {
  background: linear-gradient(180deg, var(--accent-soft), var(--accent-strong));
  filter: saturate(1.3);
}

.viz-preview.ring-orbit .p-ring {
  border-style: dashed;
}

.viz-preview.ring-pulse .p-ring {
  border-width: 3px;
}

@keyframes viz-preview-bars {
  0%, 100% { transform: scaleY(0.7); opacity: 0.7; }
  50% { transform: scaleY(1.1); opacity: 1; }
}

@keyframes viz-preview-ring {
  0%, 100% { transform: scale(0.85); opacity: 0.75; }
  50% { transform: scale(1.1); opacity: 1; }
}

@keyframes viz-preview-dot {
  0% { transform: translate(-10px, 0); }
  25% { transform: translate(0, -8px); }
  50% { transform: translate(10px, 0); }
  75% { transform: translate(0, 8px); }
  100% { transform: translate(-10px, 0); }
}

/* ========================================
   Playlist Sidebar - Warm Material
   ======================================== */

/* ========================================
   Playlist Sidebar - Warm Material
   ======================================== */

.side-list {
  position: absolute;
  left: calc(var(--panel-w) + var(--space-4));
  bottom: 0;
  width: min(42vw, 360px);
  max-height: 440px;
  border-radius: var(--radius-2xl);
  padding: var(--space-3);
  opacity: 0;
  transform: translateX(-20px);
  pointer-events: none;
  transition:
    opacity var(--duration-base) var(--ease-out),
    transform var(--duration-slow) var(--elastic);
  background:
    var(--glass-bg-gradient),
    var(--surface-elevated);
  border: 1px solid var(--glass-border);
  box-shadow:
    var(--shadow-xl),
    var(--glass-highlight);
  backdrop-filter: var(--glass-backdrop);
  -webkit-backdrop-filter: var(--glass-backdrop);
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
  padding: var(--space-2);
}

.list-title {
  color: var(--text-primary);
  font-size: var(--text-lg);
  font-weight: var(--font-weight-bold);
}

.head-actions {
  display: flex;
  gap: var(--space-2);
}

.head-btn {
  width: 32px;
  height: 32px;
  border: 0;
  border-radius: var(--radius-md);
  background: var(--surface-soft);
  color: var(--icon-secondary);
  border: 1px solid var(--border-base);
  cursor: pointer;
  transition: all var(--duration-fast) var(--smooth);
  display: flex;
  align-items: center;
  justify-content: center;
}

.head-btn:not(:disabled):hover {
  background: var(--interactive-hover);
  color: var(--icon-primary);
}

.head-btn:disabled {
  opacity: 0.4;
  cursor: not-allowed;
}

.list-body {
  margin-top: var(--space-2);
  max-height: 370px;
  overflow: auto;
  display: grid;
  gap: var(--space-2);
}

.track-item {
  border: 0;
  border-radius: var(--radius-lg);
  min-height: 50px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: var(--space-2) var(--space-3);
  cursor: grab;
  background: var(--surface-soft);
  color: var(--text-primary);
  border: 1px solid var(--border-subtle);
  transition: all var(--duration-fast) var(--smooth);
}

.track-item:hover {
  background: var(--interactive-hover);
  border-color: var(--border-base);
  transform: translateX(2px);
}

.track-item:active {
  cursor: grabbing;
}

.track-item.active {
  background: var(--accent-fill);
  border-color: var(--accent-border);
  box-shadow: var(--shadow-accent-sm);
}

.item-main {
  display: grid;
  text-align: left;
  gap: var(--space-1);
  min-width: 0;
}

.item-name {
  font-size: var(--text-base);
  font-weight: var(--font-weight-semibold);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.item-artist {
  font-size: var(--text-sm);
  color: var(--text-secondary);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.item-time {
  font-size: var(--text-sm);
  color: var(--text-tertiary);
  font-weight: var(--font-weight-medium);
}

/* ========================================
   Animation Keyframes
   ======================================== */

@keyframes music-player-peek-reveal-corner {
  0% {
    transform: translate3d(
      calc(var(--shell-base-x) + var(--peek-corner-hidden-x)),
      calc(var(--shell-base-y) + var(--peek-corner-hidden-y)),
      0
    );
  }
  58% {
    transform: translate3d(
      calc(var(--shell-base-x) + 10px),
      calc(var(--shell-base-y) - 10px),
      0
    );
  }
  100% {
    transform: translate3d(var(--shell-base-x), var(--shell-base-y), 0);
  }
}

@keyframes music-player-peek-reveal-bottom {
  0% {
    transform: translate3d(
      var(--shell-base-x),
      calc(var(--shell-base-y) + var(--peek-bottom-hidden-y)),
      0
    );
  }
  58% {
    transform: translate3d(
      var(--shell-base-x),
      calc(var(--shell-base-y) - 10px),
      0
    );
  }
  100% {
    transform: translate3d(var(--shell-base-x), var(--shell-base-y), 0);
  }
}

/* ========================================
   Responsive Design - Mobile & Tablet
   ======================================== */

/* ========================================
   Responsive Design - Mobile & Tablet
   ======================================== */

@media (max-width: 900px) {
  .music-player-shell {
    --peek-corner-hidden-x: -56px;
    --peek-corner-hidden-y: 56px;
    --peek-bottom-hidden-y: 40px;
    --panel-w: min(94vw, 350px);
    --panel-h: min(80vh, 600px);
    --disc-size: 84px;
    --title-size: var(--text-xl);
    --top-btn-size: 44px;
    --edge-btn-size: 48px;
    --mode-btn-size: 36px;
    --pause-btn-size: 62px;
    --mini-btn-h: 44px;
    --mini-font-size: var(--text-xs);
    --head-top: var(--space-3);
    --disc-top: 88px;
    --artist-top: 320px;
    --lyrics-top: 352px;
    --progress-top: 420px;
    --pause-top: 470px;
    --bottom-top: 540px;
    left: var(--space-3);
    bottom: var(--space-4);
  }

  .disc-row {
    top: 50%;
    transform: translateY(-50%);
    grid-template-columns: 0 1fr 0;
    padding: 0;
  }

  .player-card.active .disc-row {
    grid-template-columns: 52px 1fr 52px;
    padding: 0 var(--space-3);
  }

  .disc-wrap {
    width: 78px;
    height: 78px;
  }

  .player-card.active .disc-wrap {
    width: 222px;
    height: 222px;
  }

  .cover-vinyl {
    width: 72px;
    height: 72px;
  }

  .player-card.active .cover-vinyl {
    width: 210px;
    height: 210px;
  }

  .head-row {
    grid-template-columns: 46px 1fr 46px;
    padding: 0 var(--space-3);
  }

  .side-list {
    width: min(46vw, 340px);
    max-height: 400px;
  }
}

@media (max-width: 600px), (orientation: portrait) {
  .music-player-shell {
    --shell-base-x: -50%;
    --peek-bottom-hidden-y: 36px;
    --panel-w: min(96vw, 400px);
    --panel-h: min(76vh, 580px);
    --disc-size: 80px;
    --title-size: clamp(16px, 5vw, 21px);
    --top-btn-size: 40px;
    --edge-btn-size: 42px;
    --mode-btn-size: 34px;
    --pause-btn-size: 56px;
    --mini-btn-h: 42px;
    --mini-font-size: 10px;
    --head-top: var(--space-2);
    --disc-top: 72px;
    --artist-top: 280px;
    --lyrics-top: 308px;
    --progress-top: 362px;
    --pause-top: 408px;
    --bottom-top: 468px;
    left: 50%;
    bottom: var(--space-4);
  }

  .player-card.active {
    border-radius: var(--radius-2xl);
  }

  .head-row {
    padding: 0 var(--space-2);
    grid-template-columns: 42px 1fr 42px;
  }

  .player-card.active .disc-row {
    grid-template-columns: 46px 1fr 46px;
    padding: 0 var(--space-2);
  }

  .disc-wrap {
    width: 74px;
    height: 74px;
  }

  .player-card.active .disc-wrap {
    width: min(54vw, 198px);
    height: min(54vw, 198px);
  }

  .cover-vinyl {
    width: 68px;
    height: 68px;
  }

  .player-card.active .cover-vinyl {
    width: min(52vw, 188px);
    height: min(52vw, 188px);
  }

  .lyrics-window {
    left: var(--space-2);
    right: var(--space-2);
    min-height: 52px;
  }

  .lyric.prev,
  .lyric.next {
    font-size: 11px;
  }

  .lyric.current {
    font-size: var(--text-sm);
  }

  .progress-row {
    left: var(--space-2);
    right: var(--space-2);
    grid-template-columns: 36px 1fr auto;
    gap: var(--space-2);
  }

  .time-mix {
    min-width: 70px;
    font-size: 10px;
  }

  .bottom-row {
    padding: 0 var(--space-2);
    gap: var(--space-2);
  }

  .mini-action {
    border-radius: var(--radius-md);
    gap: var(--space-1);
  }

  .viz-menu {
    right: 0;
    bottom: calc(100% + var(--space-1));
  }

  .side-list {
    left: 0;
    right: 0;
    bottom: 0;
    width: var(--panel-w);
    height: var(--panel-h);
    max-height: none;
    border-radius: var(--radius-2xl);
    transform: scale(0.96);
    z-index: 30;
  }

  .side-list.visible {
    transform: scale(1);
  }

  .list-body {
    max-height: calc(var(--panel-h) - 70px);
  }
}

@media (max-width: 420px) {
  .music-player-shell {
    --panel-w: min(97vw, 370px);
    --panel-h: min(72vh, 540px);
    --disc-size: 76px;
    --title-size: 16px;
    --top-btn-size: 38px;
    --edge-btn-size: 40px;
    --mode-btn-size: 32px;
    --pause-btn-size: 52px;
    --mini-btn-h: 40px;
    --head-top: var(--space-2);
    --disc-top: 64px;
    --artist-top: 256px;
    --lyrics-top: 280px;
    --progress-top: 332px;
    --pause-top: 376px;
    --bottom-top: 430px;
  }

  .disc-wrap {
    width: 70px;
    height: 70px;
  }

  .player-card.active .disc-wrap {
    width: min(52vw, 176px);
    height: min(52vw, 176px);
  }

  .cover-vinyl {
    width: 64px;
    height: 64px;
  }

  .player-card.active .cover-vinyl {
    width: min(50vw, 166px);
    height: min(50vw, 166px);
  }

  .mini-action {
    padding: 0 var(--space-1);
  }
}

@media (max-height: 760px) {
  .music-player-shell {
    --panel-h: min(80vh, 580px);
  }
}
</style>
