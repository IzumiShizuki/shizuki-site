<template>
  <Teleport to="body">
    <transition name="m-player">
      <section
        v-if="visible"
        class="m-player"
        :style="dragStyle"
        role="dialog"
        aria-modal="true"
        aria-label="播放器"
      >
        <div class="player-backdrop" aria-hidden="true">
          <img v-if="track?.cover" :src="track.cover" alt="" />
          <div class="backdrop-scrim"></div>
        </div>

        <header
          class="player-head"
          @touchstart.passive="onDragStart"
          @touchmove.passive="onDragMove"
          @touchend="onDragEnd"
        >
          <button type="button" class="head-btn" aria-label="收起播放器" @click="$emit('close')">
            <i class="fa-solid fa-chevron-down" aria-hidden="true"></i>
          </button>
          <div class="head-source">
            <span class="head-caption">正在播放</span>
            <span class="head-name">{{ sourceName || '播放队列' }}</span>
          </div>
          <button type="button" class="head-btn" aria-label="播放队列" @click="queueOpen = true">
            <i class="fa-solid fa-list-ul" aria-hidden="true"></i>
          </button>
        </header>

        <div class="player-body" :class="{ 'lyrics-active': view === 'lyrics' }">
          <div class="stage-pane" @click="toggleView">
            <div class="cover-wrap" :class="{ playing: isPlaying }">
              <img v-if="track?.cover" :src="track.cover" alt="封面" />
              <span v-if="isPreviewPlayback" class="preview-badge">试听片段</span>
            </div>
            <div class="meta-block">
              <h2 class="meta-title">{{ track?.title || '未选择歌曲' }}</h2>
              <p class="meta-artist">{{ track?.artist || '—' }}</p>
              <p class="meta-lyric-line" v-if="view === 'cover'">{{ currentLyricLine || ' ' }}</p>
            </div>
          </div>

          <div class="lyrics-pane" v-show="view === 'lyrics'" @click="toggleView">
            <div v-if="!lyricTimeline.length" class="lyrics-empty">纯音乐 / 暂无歌词</div>
            <div v-else ref="lyricsScrollRef" class="lyrics-scroll" @scroll.passive="onLyricsScroll" @click.stop>
              <p
                v-for="(line, idx) in lyricTimeline"
                :key="`ly-${idx}`"
                class="lyric-line"
                :class="{ active: idx === currentLyricEntryIndex }"
                :data-lyric-index="idx"
                @click="seekToLine(line)"
              >
                <span class="ly-original">{{ line.original || '♪' }}</span>
                <span v-if="showTranslation && line.translation" class="ly-extra">{{ line.translation }}</span>
                <span v-if="showFurigana && line.furigana" class="ly-extra">{{ line.furigana }}</span>
              </p>
              <div class="lyrics-tail"></div>
            </div>
            <div v-if="lyricModeOptions.length > 1" class="lyric-mode-row" @click.stop>
              <button
                v-for="mode in lyricModeOptions"
                :key="mode.value"
                type="button"
                class="m-chip"
                :class="{ active: lyricRenderMode === mode.value }"
                @click="$emit('set-lyric-mode', mode.value)"
              >
                {{ mode.label }}
              </button>
            </div>
          </div>
        </div>

        <footer class="player-foot">
          <div class="seek-row">
            <span class="time-label">{{ formatTime(displayTime) }}</span>
            <input
              class="seek-bar"
              type="range"
              min="0"
              max="1000"
              step="1"
              :value="seekValue"
              :style="seekFillStyle"
              aria-label="播放进度"
              @input="onSeekInput"
              @change="onSeekCommit"
              @touchstart.passive="seeking = true"
              @touchend="seeking = false"
              @mousedown="seeking = true"
              @mouseup="seeking = false"
            />
            <span class="time-label">{{ formatTime(duration) }}</span>
          </div>

          <div class="control-row">
            <button type="button" class="ctrl-btn subtle" :aria-label="playModeLabel" @click="$emit('cycle-mode')">
              <i :class="playModeIcon" aria-hidden="true"></i>
            </button>
            <button type="button" class="ctrl-btn" aria-label="上一首" @click="$emit('prev')">
              <i class="fa-solid fa-backward-step" aria-hidden="true"></i>
            </button>
            <button type="button" class="ctrl-btn primary" :aria-label="isPlaying ? '暂停' : '播放'" @click="$emit('toggle-play')">
              <i :class="isPlaying ? 'fa-solid fa-pause' : 'fa-solid fa-play'" aria-hidden="true"></i>
            </button>
            <button type="button" class="ctrl-btn" aria-label="下一首" @click="$emit('next')">
              <i class="fa-solid fa-forward-step" aria-hidden="true"></i>
            </button>
            <button
              type="button"
              class="ctrl-btn subtle"
              :class="{ toggled: view === 'lyrics' }"
              aria-label="歌词"
              @click="toggleView"
            >
              <i class="fa-solid fa-align-center" aria-hidden="true"></i>
            </button>
          </div>
        </footer>

        <MobileSheet :visible="queueOpen" title="播放队列" @close="queueOpen = false">
          <div v-if="!tracks.length" class="m-empty">
            <i class="fa-solid fa-music" aria-hidden="true"></i>
            <span>队列是空的</span>
          </div>
          <MobileTrackRow
            v-for="(item, idx) in tracks"
            :key="item.id || idx"
            :track="item"
            :index="idx"
            :is-current="item.id === track?.id"
            :is-playing="isPlaying"
            :show-menu="false"
            @play="onQueueSelect(idx)"
          />
        </MobileSheet>
      </section>
    </transition>
  </Teleport>
</template>

<script setup>
import { computed, nextTick, ref, watch } from 'vue';
import { formatMediaTime } from '../../utils/mediaTime';
import MobileSheet from './MobileSheet.vue';
import MobileTrackRow from './MobileTrackRow.vue';

const props = defineProps({
  visible: { type: Boolean, default: false },
  track: { type: Object, default: null },
  tracks: { type: Array, default: () => [] },
  sourceName: { type: String, default: '' },
  isPlaying: { type: Boolean, default: false },
  isPreviewPlayback: { type: Boolean, default: false },
  currentTime: { type: Number, default: 0 },
  duration: { type: Number, default: 0 },
  currentLyricLine: { type: String, default: '' },
  lyricTimeline: { type: Array, default: () => [] },
  currentLyricEntryIndex: { type: Number, default: -1 },
  lyricRenderMode: { type: String, default: 'original' },
  availableLyricModes: { type: Array, default: () => ['original'] },
  playMode: { type: String, default: 'sequential' }
});

const emit = defineEmits([
  'close',
  'toggle-play',
  'prev',
  'next',
  'cycle-mode',
  'seek-percent',
  'seek-time',
  'select-track',
  'set-lyric-mode'
]);

const view = ref('cover');
const queueOpen = ref(false);
const seeking = ref(false);
const seekPreview = ref(0);
const lyricsScrollRef = ref(null);
const userScrollUntil = ref(0);
const dragOffset = ref(0);
let dragStartY = null;

const displayTime = computed(() => (seeking.value ? seekPreview.value : props.currentTime));

const seekValue = computed(() => {
  const total = Number(props.duration);
  if (!Number.isFinite(total) || total <= 0) return 0;
  return Math.round((displayTime.value / total) * 1000);
});

const seekFillStyle = computed(() => ({
  '--seek-fill': `${(seekValue.value / 1000) * 100}%`
}));

const showTranslation = computed(() => props.lyricRenderMode === 'original_translation');
const showFurigana = computed(() => props.lyricRenderMode === 'original_furigana');

const LYRIC_MODE_LABELS = {
  original: '原文',
  original_translation: '原文+译文',
  original_furigana: '原文+注音'
};

const lyricModeOptions = computed(() =>
  (Array.isArray(props.availableLyricModes) ? props.availableLyricModes : []).map((value) => ({
    value,
    label: LYRIC_MODE_LABELS[value] || value
  }))
);

const playModeIcon = computed(() => {
  if (props.playMode === 'random') return 'fa-solid fa-shuffle';
  if (props.playMode === 'single') return 'fa-solid fa-repeat';
  return 'fa-solid fa-arrow-right-arrow-left';
});

const playModeLabel = computed(() => {
  if (props.playMode === 'random') return '随机播放';
  if (props.playMode === 'single') return '单曲循环';
  return '顺序播放';
});

const dragStyle = computed(() => {
  if (dragOffset.value <= 0) return undefined;
  return {
    transform: `translateY(${dragOffset.value}px)`,
    transition: 'none'
  };
});

function formatTime(sec) {
  return formatMediaTime(sec, { fallback: '0:00' });
}

function toggleView() {
  view.value = view.value === 'cover' ? 'lyrics' : 'cover';
}

function onSeekInput(event) {
  const total = Number(props.duration);
  if (!Number.isFinite(total) || total <= 0) return;
  const raw = Number(event?.target?.value || 0);
  seekPreview.value = (raw / 1000) * total;
}

function onSeekCommit(event) {
  const raw = Number(event?.target?.value || 0);
  seeking.value = false;
  emit('seek-percent', raw / 1000);
}

function seekToLine(line) {
  const time = Number(line?.time);
  if (!Number.isFinite(time)) return;
  emit('seek-time', Math.max(0, time));
}

function onQueueSelect(index) {
  emit('select-track', index);
  queueOpen.value = false;
}

function onLyricsScroll() {
  userScrollUntil.value = Date.now() + 2600;
}

function scrollActiveLyricIntoView() {
  if (view.value !== 'lyrics') return;
  if (Date.now() < userScrollUntil.value) return;
  const host = lyricsScrollRef.value;
  if (!host) return;
  const active = host.querySelector(`[data-lyric-index="${props.currentLyricEntryIndex}"]`);
  if (!active) return;
  const targetTop = active.offsetTop - host.clientHeight * 0.38;
  host.scrollTo({ top: Math.max(0, targetTop), behavior: 'smooth' });
}

watch(
  () => props.currentLyricEntryIndex,
  () => {
    nextTick(scrollActiveLyricIntoView);
  }
);

watch(
  () => [props.visible, view.value],
  () => {
    if (props.visible) {
      nextTick(scrollActiveLyricIntoView);
    } else {
      queueOpen.value = false;
      dragOffset.value = 0;
    }
  }
);

function onDragStart(event) {
  dragStartY = event.touches?.[0]?.clientY ?? null;
}

function onDragMove(event) {
  if (dragStartY == null) return;
  const currentY = event.touches?.[0]?.clientY ?? dragStartY;
  dragOffset.value = Math.max(0, currentY - dragStartY);
}

function onDragEnd() {
  const shouldClose = dragOffset.value > 110;
  dragOffset.value = 0;
  dragStartY = null;
  if (shouldClose) emit('close');
}
</script>

<style scoped>
.m-player {
  position: fixed;
  inset: 0;
  z-index: 100;
  display: flex;
  flex-direction: column;
  background: var(--m-bg);
  color: var(--m-text);
  overflow: hidden;
  transition: transform 300ms cubic-bezier(0.32, 0.72, 0.24, 1);
}

.player-backdrop {
  position: absolute;
  inset: 0;
  z-index: 0;
}

.player-backdrop img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  filter: blur(46px) saturate(136%) brightness(0.72);
  transform: scale(1.28);
}

:root[data-theme-mode='day'] .player-backdrop img {
  filter: blur(52px) saturate(120%) brightness(1.06) opacity(0.6);
}

.backdrop-scrim {
  position: absolute;
  inset: 0;
  background: linear-gradient(180deg, rgba(10, 14, 24, 0.3), rgba(10, 14, 24, 0.72));
}

:root[data-theme-mode='day'] .backdrop-scrim {
  background: linear-gradient(180deg, rgba(250, 244, 238, 0.4), rgba(250, 244, 238, 0.84));
}

.player-head {
  position: relative;
  z-index: 2;
  flex-shrink: 0;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
  padding: calc(var(--m-safe-top) + 12px) calc(var(--m-safe-right) + 16px) 8px calc(var(--m-safe-left) + 16px);
  touch-action: pan-y;
}

.head-btn {
  width: 40px;
  height: 40px;
  flex-shrink: 0;
  display: grid;
  place-items: center;
  border: 1px solid var(--m-border);
  border-radius: 999px;
  background: var(--m-surface-soft);
  color: var(--m-text);
  font-size: 14px;
  cursor: pointer;
  backdrop-filter: var(--m-blur);
  -webkit-backdrop-filter: var(--m-blur);
}

.head-source {
  flex: 1;
  min-width: 0;
  display: grid;
  justify-items: center;
  gap: 2px;
}

.head-caption {
  font-size: 10.5px;
  letter-spacing: 0.22em;
  text-transform: uppercase;
  color: var(--m-text-faint);
}

.head-name {
  max-width: 100%;
  font-size: 13.5px;
  font-weight: 700;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.player-body {
  position: relative;
  z-index: 1;
  flex: 1;
  min-height: 0;
  display: flex;
  flex-direction: column;
  padding: 8px calc(var(--m-safe-right) + 26px) 0 calc(var(--m-safe-left) + 26px);
}

.stage-pane {
  flex-shrink: 0;
  display: grid;
  justify-items: center;
  gap: 18px;
  cursor: pointer;
}

.cover-wrap {
  position: relative;
  width: min(68vw, 42dvh, 320px);
  aspect-ratio: 1;
  border-radius: 30px;
  overflow: hidden;
  border: 1px solid var(--m-border-strong);
  box-shadow:
    0 24px 60px rgba(4, 8, 18, 0.5),
    0 0 42px rgba(var(--m-accent-rgb), 0.22);
  transition: transform 500ms cubic-bezier(0.34, 1.3, 0.5, 1), box-shadow 500ms ease;
}

.cover-wrap:not(.playing) {
  transform: scale(0.94);
  box-shadow: 0 16px 40px rgba(4, 8, 18, 0.4);
}

.cover-wrap img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.preview-badge {
  position: absolute;
  top: 12px;
  right: 12px;
  padding: 4px 10px;
  border-radius: 999px;
  background: rgba(8, 11, 20, 0.62);
  border: 1px solid rgba(var(--m-accent-rgb), 0.5);
  color: rgba(var(--m-accent-rgb), 1);
  font-size: 11px;
  letter-spacing: 0.08em;
  backdrop-filter: blur(8px);
  -webkit-backdrop-filter: blur(8px);
}

.meta-block {
  display: grid;
  justify-items: center;
  gap: 6px;
  text-align: center;
  max-width: 100%;
}

.meta-title {
  margin: 0;
  max-width: 82vw;
  font-size: clamp(18px, 5.4vw, 23px);
  font-weight: 800;
  letter-spacing: 0.01em;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.meta-artist {
  margin: 0;
  font-size: 13.5px;
  color: var(--m-text-sub);
}

.meta-lyric-line {
  margin: 8px 0 0;
  min-height: 20px;
  max-width: 84vw;
  font-size: 13.5px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  background: var(--m-accent-gradient);
  -webkit-background-clip: text;
  background-clip: text;
  -webkit-text-fill-color: transparent;
}

.player-body.lyrics-active .stage-pane {
  grid-template-columns: 52px 1fr;
  justify-items: start;
  align-items: center;
  gap: 12px;
}

.player-body.lyrics-active .cover-wrap {
  width: 52px;
  border-radius: 14px;
  transform: none;
  box-shadow: 0 6px 18px rgba(4, 8, 18, 0.4);
}

.player-body.lyrics-active .meta-block {
  justify-items: start;
  text-align: left;
  gap: 2px;
}

.player-body.lyrics-active .meta-title {
  font-size: 15.5px;
  max-width: 100%;
}

.player-body.lyrics-active .meta-artist {
  font-size: 12px;
}

.lyrics-pane {
  position: relative;
  flex: 1;
  min-height: 0;
  display: flex;
  flex-direction: column;
  margin-top: 14px;
}

.lyrics-empty {
  flex: 1;
  display: grid;
  place-items: center;
  color: var(--m-text-faint);
  font-size: 14px;
}

.lyrics-scroll {
  flex: 1;
  min-height: 0;
  overflow-y: auto;
  -webkit-overflow-scrolling: touch;
  padding: 8px 4px 0;
  mask-image: linear-gradient(180deg, transparent 0, #000 9%, #000 82%, transparent 100%);
  -webkit-mask-image: linear-gradient(180deg, transparent 0, #000 9%, #000 82%, transparent 100%);
  scrollbar-width: none;
}

.lyrics-scroll::-webkit-scrollbar {
  display: none;
}

.lyric-line {
  margin: 0;
  padding: 9px 6px;
  display: grid;
  gap: 3px;
  color: var(--m-text-faint);
  font-size: 15px;
  line-height: 1.5;
  border-radius: 12px;
  transition: color 240ms ease, transform 240ms ease, opacity 240ms ease;
  transform-origin: left center;
  cursor: pointer;
}

.lyric-line .ly-extra {
  font-size: 12.5px;
  opacity: 0.85;
}

.lyric-line.active {
  color: var(--m-text);
  transform: scale(1.05);
  font-weight: 700;
}

.lyric-line.active .ly-original {
  background: var(--m-accent-gradient);
  -webkit-background-clip: text;
  background-clip: text;
  -webkit-text-fill-color: transparent;
}

.lyrics-tail {
  height: 38%;
}

.lyric-mode-row {
  flex-shrink: 0;
  display: flex;
  gap: 8px;
  justify-content: center;
  padding: 10px 0 2px;
}

.player-foot {
  position: relative;
  z-index: 2;
  flex-shrink: 0;
  padding: 10px calc(var(--m-safe-right) + 26px) calc(var(--m-safe-bottom) + 22px) calc(var(--m-safe-left) + 26px);
  display: grid;
  gap: 14px;
}

.seek-row {
  display: flex;
  align-items: center;
  gap: 12px;
}

.time-label {
  flex-shrink: 0;
  min-width: 38px;
  font-size: 11.5px;
  font-variant-numeric: tabular-nums;
  color: var(--m-text-sub);
  text-align: center;
}

.seek-bar {
  --seek-fill: 0%;
  flex: 1;
  height: 26px;
  appearance: none;
  -webkit-appearance: none;
  background: transparent;
  cursor: pointer;
}

.seek-bar::-webkit-slider-runnable-track {
  height: 5px;
  border-radius: 999px;
  background:
    linear-gradient(90deg, rgba(var(--m-grad-a), 0.95), rgba(var(--m-grad-b), 0.92)) 0 0 / var(--seek-fill) 100% no-repeat,
    var(--m-surface-soft);
}

.seek-bar::-webkit-slider-thumb {
  -webkit-appearance: none;
  width: 15px;
  height: 15px;
  margin-top: -5px;
  border-radius: 999px;
  background: #fff;
  border: 3px solid rgba(var(--m-accent-rgb), 1);
  box-shadow: 0 3px 10px rgba(var(--m-accent-rgb), 0.5);
}

.seek-bar::-moz-range-track {
  height: 5px;
  border-radius: 999px;
  background: var(--m-surface-soft);
}

.seek-bar::-moz-range-progress {
  height: 5px;
  border-radius: 999px;
  background: linear-gradient(90deg, rgba(var(--m-grad-a), 0.95), rgba(var(--m-grad-b), 0.92));
}

.seek-bar::-moz-range-thumb {
  width: 15px;
  height: 15px;
  border-radius: 999px;
  background: #fff;
  border: 3px solid rgba(var(--m-accent-rgb), 1);
}

.control-row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.ctrl-btn {
  width: 50px;
  height: 50px;
  display: grid;
  place-items: center;
  border: 1px solid var(--m-border);
  border-radius: 999px;
  background: var(--m-surface-soft);
  color: var(--m-text);
  font-size: 17px;
  cursor: pointer;
  transition: transform 160ms ease, background 200ms ease;
}

.ctrl-btn:active {
  transform: scale(0.92);
}

.ctrl-btn.subtle {
  width: 44px;
  height: 44px;
  font-size: 14px;
  color: var(--m-text-sub);
}

.ctrl-btn.subtle.toggled {
  color: #3c2320;
  background: var(--m-accent-gradient);
  border-color: transparent;
}

.ctrl-btn.primary {
  width: 68px;
  height: 68px;
  font-size: 22px;
  border: none;
  background: var(--m-accent-gradient);
  color: #3c2320;
  box-shadow: 0 14px 30px rgba(var(--m-accent-rgb), 0.4);
}

.m-player-enter-active,
.m-player-leave-active {
  transition: transform 320ms cubic-bezier(0.32, 0.72, 0.24, 1), opacity 280ms ease;
}

.m-player-enter-from,
.m-player-leave-to {
  transform: translateY(8%);
  opacity: 0;
}

/* ---------- 横屏：左右分栏 ---------- */

@media (orientation: landscape) and (max-height: 560px) {
  .player-body {
    flex-direction: row;
    align-items: center;
    gap: 26px;
    padding-top: 0;
  }

  .stage-pane {
    flex: 0 0 40%;
    gap: 12px;
  }

  .cover-wrap {
    width: min(30vw, 52dvh, 240px);
  }

  .player-body.lyrics-active .stage-pane {
    grid-template-columns: 1fr;
    justify-items: center;
    flex: 0 0 34%;
  }

  .player-body.lyrics-active .cover-wrap {
    width: min(22vw, 34dvh, 160px);
    border-radius: 20px;
  }

  .player-body.lyrics-active .meta-block {
    justify-items: center;
    text-align: center;
  }

  .lyrics-pane {
    flex: 1;
    height: 100%;
    margin-top: 0;
  }

  .meta-lyric-line {
    max-width: 36vw;
  }

  .player-foot {
    padding-top: 4px;
    padding-bottom: calc(var(--m-safe-bottom) + 12px);
  }

  .ctrl-btn.primary {
    width: 56px;
    height: 56px;
    font-size: 18px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .m-player,
  .cover-wrap,
  .lyric-line {
    transition: none;
  }
}
</style>
