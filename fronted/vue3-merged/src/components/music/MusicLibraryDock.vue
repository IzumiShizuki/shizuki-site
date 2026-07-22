<template>
  <footer ref="rootRef" class="music-library-dock liquid-material" :class="{ 'detail-layout': detailLayout }" @click="handleRootClick">
    <div class="dock-progress-row" @click.stop>
      <button
        class="play-mode-pill ripple-trigger icon-only"
        type="button"
        :title="`播放顺序：${modeLabel}`"
        :aria-label="`播放顺序：${modeLabel}`"
        @click.stop="emit('cycle-mode')"
      >
        <span class="play-mode-icon" aria-hidden="true">
          <i class="fas" :class="modeIconClass"></i>
          <span v-if="playMode === 'single'" class="single-repeat-badge">1</span>
        </span>
      </button>
      <input
        class="progress-input"
        type="range"
        min="0"
        max="1000"
        :value="Math.round(progress * 1000)"
        :disabled="!hasPlayableDuration"
        aria-label="歌曲播放进度"
        :aria-valuetext="progressTitle"
        :title="progressTitle"
        :style="{ '--level-percent': `${progress * 100}%` }"
        @input="onSeek"
      />
      <span class="time" :title="progressTitle">
        <span v-if="isPreviewPlayback" class="preview-badge">试听</span>
        {{ playedText }} / {{ durationText }}
      </span>
    </div>

    <div class="dock-main-row">
      <div class="track-block">
        <div class="cover" :style="coverStyle"></div>
        <div class="meta">
          <p class="title">{{ track?.title || '暂无音乐' }}</p>
          <p class="artist">{{ track?.artist || '未知歌手' }}</p>
        </div>
      </div>

      <div class="controls" @click.stop>
        <button class="ctrl-btn ripple-trigger" type="button" title="上一首" @click="emit('prev')">
          <i class="fas fa-backward-step"></i>
        </button>
        <button class="ctrl-btn primary ripple-trigger" type="button" :title="isPlaying ? '暂停' : '播放'" @click="emit('toggle-play')">
          <i class="fas" :class="isPlaying ? 'fa-pause' : 'fa-play'"></i>
        </button>
        <button class="ctrl-btn ripple-trigger" type="button" title="下一首" @click="emit('next')">
          <i class="fas fa-forward-step"></i>
        </button>
      </div>

      <div class="utility-block" @click.stop>
        <button class="mode-btn ripple-trigger" type="button" title="播放列表" @click="toggleQueue">
          <i class="fas fa-list"></i>
        </button>
        <button class="mode-btn ripple-trigger" type="button" title="收藏到歌单" @click="emit('open-collect-dialog')">
          <i class="fas fa-heart"></i>
        </button>
        <i class="fas fa-volume-low volume-icon"></i>
        <input
          class="volume-input"
          type="range"
          min="0"
          max="100"
          :value="Math.round(volume * 100)"
          :style="{ '--level-percent': `${Math.round(volume * 100)}%` }"
          @input="onVolume"
        />
      </div>
    </div>

    <section v-if="queueOpen" class="dock-queue liquid-material" @click.stop>
      <header class="queue-head">
        <p>播放列表</p>
        <button class="queue-close ripple-trigger" type="button" @click="queueOpen = false">
          <i class="fas fa-xmark"></i>
        </button>
      </header>

      <div class="queue-body">
        <button
          v-for="(item, index) in tracks"
          :key="`dock-track-${item.id || index}`"
          class="queue-item ripple-trigger"
          :class="{ active: (item.id || '') === currentTrackId }"
          type="button"
          @click="handleSelectTrack(index)"
        >
          <span class="queue-name">{{ item.title || '未知标题' }}</span>
          <span class="queue-meta">{{ item.artist || '未知歌手' }} · {{ item.durationLabel || '--:--' }}</span>
        </button>
        <p v-if="!tracks.length" class="queue-empty">当前没有可播放歌曲</p>
      </div>
    </section>

  </footer>
</template>

<script setup>
import { computed, ref } from 'vue';
import { formatMediaTime } from '../../utils/mediaTime';
import { safeCssUrl } from '../../utils/url';
import { useDismissiblePopover } from '../../composables/useDismissiblePopover';

const props = defineProps({
  track: { type: Object, default: null },
  tracks: { type: Array, default: () => [] },
  currentTrackId: { type: String, default: '' },
  currentTime: { type: Number, default: 0 },
  duration: { type: Number, default: 0 },
  expectedDuration: { type: Number, default: 0 },
  isPreviewPlayback: { type: Boolean, default: false },
  isPlaying: { type: Boolean, default: false },
  playMode: { type: String, default: 'sequential' },
  volume: { type: Number, default: 0.8 },
  detailLayout: { type: Boolean, default: false }
});

const emit = defineEmits([
  'toggle-play',
  'prev',
  'next',
  'seek',
  'cycle-mode',
  'set-volume',
  'select-track',
  'open-player-detail',
  'open-collect-dialog'
]);
const rootRef = ref(null);
const queueOpen = ref(false);

const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const safeCover = safeCssUrl(props.track?.cover || fallback);
  return {
    backgroundImage: safeCover ? `url('${safeCover}')` : 'none'
  };
});

const progress = computed(() => {
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

const modeLabel = computed(() => {
  if (props.playMode === 'random') return '随机';
  if (props.playMode === 'single') return '单曲';
  return '顺序';
});
const modeIconClass = computed(() => {
  if (props.playMode === 'random') return 'fa-shuffle';
  return 'fa-repeat';
});

function onSeek(event) {
  if (!hasPlayableDuration.value) return;
  const raw = Number(event?.target?.value);
  emit('seek', Math.max(0, Math.min(1, raw / 1000)));
}

function onVolume(event) {
  const raw = Number(event?.target?.value);
  emit('set-volume', Math.max(0, Math.min(1, raw / 100)));
}

function toggleQueue() {
  queueOpen.value = !queueOpen.value;
}

function handleSelectTrack(index) {
  emit('select-track', index);
  queueOpen.value = false;
}

function handleRootClick() {
  if (props.detailLayout) return;
  emit('open-player-detail');
}

useDismissiblePopover({
  rootRef,
  enabled: () => queueOpen.value,
  onDismiss: () => {
    queueOpen.value = false;
  }
});
</script>

<style scoped>
.music-library-dock {
  --liquid-bg: var(--theme-panel-surface);
  --liquid-border: var(--theme-border-strong);
  --liquid-shadow: var(--theme-shadow-soft, 0 16px 36px rgba(7, 9, 15, 0.15));
  position: fixed;
  left: max(12px, env(safe-area-inset-left));
  right: max(12px, env(safe-area-inset-right));
  bottom: max(12px, env(safe-area-inset-bottom));
  min-height: 106px;
  border-radius: 18px;
  display: grid;
  grid-template-rows: auto auto;
  gap: 10px;
  align-items: center;
  padding: 12px 16px 14px;
  z-index: 1240;
  cursor: pointer;
  overflow: visible;
}

.music-library-dock.detail-layout {
  left: max(16px, env(safe-area-inset-left));
  right: max(16px, env(safe-area-inset-right));
}

.dock-progress-row {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  align-items: center;
  gap: 10px;
}

.play-mode-pill {
  min-height: 28px;
  padding: 0 10px;
  border-radius: 999px;
  border: 1px solid var(--accent-mode-border, rgba(var(--accent-rgb), 0.52));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.28));
  color: var(--music-accent-text, var(--accent-mode-text));
  font-size: 12px;
  letter-spacing: 0.03em;
  transition: transform 0.2s ease, background 0.2s ease, box-shadow 0.2s ease;
}

.play-mode-pill:hover {
  transform: translateY(-1px) scale(1.05);
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.35));
  box-shadow: 0 4px 12px rgba(var(--accent-rgb), 0.18);
}

.play-mode-pill:active {
  transform: translateY(0) scale(0.96);
}

.play-mode-pill.icon-only {
  width: 32px;
  min-width: 32px;
  height: 32px;
  min-height: 32px;
  display: grid;
  place-items: center;
  padding: 0;
}

.play-mode-icon {
  position: relative;
  width: 1.3em;
  height: 1.3em;
  display: inline-grid;
  place-items: center;
  line-height: 1;
}

.play-mode-icon > i {
  line-height: 1;
}

.single-repeat-badge {
  position: absolute;
  top: -7px;
  right: -8px;
  min-width: 14px;
  height: 14px;
  padding: 0 2px;
  border: 1px solid rgba(255, 255, 255, 0.88);
  border-radius: 999px;
  display: grid;
  place-items: center;
  background: #d73248;
  color: #fff;
  box-shadow: 0 1px 4px rgba(45, 8, 16, 0.35);
  font-family: var(--font-ui, sans-serif);
  font-size: 9px;
  font-weight: 800;
  line-height: 1;
  letter-spacing: 0;
  pointer-events: none;
}

.time {
  color: var(--theme-text-tertiary);
  font-size: 12px;
  min-width: 86px;
  display: inline-flex;
  align-items: center;
  justify-content: flex-end;
  gap: 5px;
  white-space: nowrap;
  text-align: right;
}

.preview-badge {
  min-height: 18px;
  padding: 0 6px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  background: rgba(215, 50, 72, 0.16);
  color: #df5368;
  font-size: 10px;
  font-weight: 700;
}

.progress-input {
  -webkit-appearance: none;
  appearance: none;
  width: 100%;
  height: 24px;
  background: transparent;
  cursor: pointer;
}

.progress-input:disabled {
  cursor: not-allowed;
  opacity: 0.5;
}

.progress-input::-webkit-slider-runnable-track {
  height: 6px;
  border-radius: 3px;
  background: linear-gradient(
    90deg,
    rgb(var(--accent-strong-rgb)) 0%,
    rgb(var(--accent-strong-rgb)) var(--level-percent, 0%),
    var(--theme-border) var(--level-percent, 0%),
    var(--theme-surface-soft) 100%
  );
  border: 1px solid var(--theme-border-strong);
  box-shadow: inset 0 1px 2px rgba(0, 0, 0, 0.1);
}

.progress-input::-webkit-slider-thumb {
  -webkit-appearance: none;
  width: 14px;
  height: 14px;
  margin-top: -5px;
  border-radius: 50%;
  background: white;
  border: 2px solid rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 10px rgba(var(--accent-rgb), 0.4);
  transition: transform 0.2s cubic-bezier(0.2, 0, 0, 1);
}

.progress-input:hover::-webkit-slider-thumb {
  transform: scale(1.25);
  box-shadow: 0 0 15px rgba(var(--accent-rgb), 0.6);
}

.progress-input::-moz-range-track {
  height: 6px;
  border-radius: 3px;
  background: linear-gradient(
    90deg,
    rgb(var(--accent-strong-rgb)) 0%,
    rgb(var(--accent-strong-rgb)) var(--level-percent, 0%),
    var(--theme-border) var(--level-percent, 0%),
    var(--theme-surface-soft) 100%
  );
  border: 1px solid var(--theme-border-strong);
}

.progress-input::-moz-range-thumb {
  width: 14px;
  height: 14px;
  border-radius: 50%;
  background: white;
  border: 2px solid rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 10px rgba(var(--accent-rgb), 0.4);
}

.dock-main-row {
  display: grid;
  grid-template-columns: minmax(220px, 1.2fr) minmax(220px, 1fr) minmax(220px, 1.2fr);
  gap: 12px;
  align-items: center;
}

.track-block {
  display: grid;
  grid-template-columns: 56px 1fr;
  gap: 10px;
  align-items: center;
}

.cover {
  width: 56px;
  height: 56px;
  border-radius: 12px;
  background-size: cover;
  background-position: center;
}

.title {
  margin: 0;
  color: var(--theme-text-primary);
  font-size: 14px;
}

.artist {
  margin: 6px 0 0;
  color: var(--theme-text-secondary);
  font-size: 12px;
}

.controls {
  display: flex;
  justify-content: center;
  gap: 10px;
}

.ctrl-btn {
  width: 36px;
  height: 36px;
  border-radius: 50%;
  border: 1px solid var(--theme-border-strong);
  background: var(--theme-surface-strong);
  color: var(--theme-text-primary);
  transition: all 0.24s cubic-bezier(0.22, 1, 0.36, 1);
  box-shadow: 0 4px 12px rgba(6, 10, 18, 0.08);
}

.ctrl-btn:hover {
  transform: translateY(-2px) scale(1.08);
  border-color: rgba(var(--accent-rgb), 0.45);
  background: var(--theme-panel-surface-elevated);
  box-shadow: 0 8px 20px rgba(6, 10, 18, 0.15);
  color: rgba(var(--accent-rgb), 0.9);
}

.ctrl-btn:active {
  transform: translateY(0) scale(0.94);
}

.ctrl-btn.primary {
  background: linear-gradient(135deg, rgba(var(--accent-rgb), 0.55), rgba(var(--accent-soft-rgb), 0.45));
  color: var(--music-accent-text, var(--accent-mode-text));
  border-color: rgba(var(--accent-rgb), 0.55);
  box-shadow: 0 8px 22px rgba(var(--accent-rgb), 0.28);
}

.ctrl-btn.primary:hover {
  background: linear-gradient(135deg, rgba(var(--accent-rgb), 0.65), rgba(var(--accent-soft-rgb), 0.55));
  box-shadow: 0 10px 28px rgba(var(--accent-rgb), 0.35);
  color: white;
}

.utility-block {
  display: grid;
  grid-template-columns: auto auto auto minmax(86px, 1fr);
  gap: 10px;
  align-items: center;
  justify-content: end;
}

.mode-btn {
  width: 32px;
  height: 32px;
  border-radius: 10px;
  border: 1px solid var(--theme-border-strong);
  background: var(--theme-surface-strong);
  color: var(--theme-text-primary);
  transition: all 0.2s ease;
}

.mode-btn:hover {
  transform: translateY(-1px) scale(1.05);
  border-color: rgba(var(--accent-rgb), 0.4);
  background: var(--theme-panel-surface-elevated);
}

.mode-btn:active {
  transform: scale(0.95);
}

.mode-btn.active {
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

.volume-icon {
  color: var(--theme-text-tertiary);
  font-size: 14px;
}

.volume-input {
  -webkit-appearance: none;
  appearance: none;
  width: 100%;
  height: 20px;
  background: transparent;
  cursor: pointer;
}

.volume-input::-webkit-slider-runnable-track {
  height: 4px;
  border-radius: 2px;
  background: linear-gradient(
    90deg,
    rgb(var(--accent-strong-rgb)) 0%,
    rgb(var(--accent-strong-rgb)) var(--level-percent, 0%),
    var(--theme-border) var(--level-percent, 0%),
    var(--theme-surface-soft) 100%
  );
  border: 1px solid var(--theme-border-strong);
}

.volume-input::-webkit-slider-thumb {
  -webkit-appearance: none;
  width: 12px;
  height: 12px;
  margin-top: -5px;
  border-radius: 50%;
  background: white;
  border: 2px solid rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 8px rgba(var(--accent-rgb), 0.35);
  transition: transform 0.2s ease;
}

.volume-input:hover::-webkit-slider-thumb {
  transform: scale(1.3);
}

.volume-input::-moz-range-track {
  height: 4px;
  border-radius: 2px;
  background: linear-gradient(
    90deg,
    rgb(var(--accent-strong-rgb)) 0%,
    rgb(var(--accent-strong-rgb)) var(--level-percent, 0%),
    var(--theme-border) var(--level-percent, 0%),
    var(--theme-surface-soft) 100%
  );
  border: 1px solid var(--theme-border-strong);
}

.volume-input::-moz-range-thumb {
  width: 12px;
  height: 12px;
  border-radius: 50%;
  background: white;
  border: 2px solid rgb(var(--accent-strong-rgb));
}

.dock-queue {
  --liquid-bg: var(--theme-panel-surface);
  --liquid-border: var(--theme-border-strong);
  --liquid-shadow: var(--theme-shadow-soft, 0 18px 30px rgba(4, 8, 14, 0.16));
  position: absolute;
  right: 0;
  bottom: calc(100% + 8px);
  width: min(460px, 72vw);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 8px;
  z-index: 6;
}

.queue-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.queue-head p {
  margin: 0;
  font-size: 13px;
  color: var(--theme-text-primary);
}

.queue-close {
  width: 26px;
  height: 26px;
  border-radius: 8px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
}

.queue-body {
  max-height: 260px;
  overflow: auto;
  display: grid;
  gap: 6px;
}

.queue-item {
  border: 1px solid var(--theme-border);
  border-radius: 10px;
  background: var(--theme-surface-soft);
  padding: 8px 10px;
  text-align: left;
  display: grid;
  gap: 3px;
}

.queue-item.active {
  border-color: rgba(var(--accent-rgb), 0.62);
  background: rgba(var(--accent-rgb), 0.22);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.22);
}

.queue-name {
  font-size: 13px;
  color: var(--theme-text-primary);
}

.queue-meta {
  font-size: 11px;
  color: var(--theme-text-secondary);
}

.queue-empty {
  margin: 0;
  min-height: 62px;
  display: grid;
  place-items: center;
  border-radius: 10px;
  border: 1px dashed var(--theme-border);
  color: rgba(177, 190, 216, 0.84);
  font-size: 12px;
}

.dock-collect {
  --liquid-bg: linear-gradient(160deg, rgba(13, 17, 26, 0.94), rgba(10, 14, 20, 0.94));
  --liquid-border: var(--theme-border-strong);
  --liquid-shadow: 0 18px 30px rgba(4, 8, 14, 0.46);
  position: absolute;
  right: 0;
  bottom: calc(100% + 8px);
  width: min(320px, 72vw);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 8px;
  z-index: 7;
}

.collect-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.collect-head p {
  margin: 0;
  font-size: 13px;
  color: rgba(235, 242, 255, 0.94);
}

.collect-body {
  max-height: 260px;
  overflow: auto;
  display: grid;
  gap: 6px;
}

.collect-item,
.collect-login {
  border: 1px solid var(--theme-border);
  border-radius: 10px;
  background: var(--theme-surface-soft);
  padding: 8px 10px;
  text-align: left;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
  gap: 8px;
}

.collect-item.collect-default {
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
}

.collect-name {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  font-size: 13px;
  color: var(--theme-text-primary);
}

.collect-meta {
  font-size: 11px;
  color: var(--theme-text-secondary);
}

.collect-login {
  color: rgba(241, 246, 255, 0.94);
  place-items: center;
  grid-template-columns: 1fr;
}

.collect-empty {
  margin: 0;
  min-height: 62px;
  display: grid;
  place-items: center;
  border-radius: 10px;
  border: 1px dashed var(--theme-border);
  color: rgba(177, 190, 216, 0.84);
  font-size: 12px;
}

@media (max-width: 900px) {
  .music-library-dock {
    left: max(8px, env(safe-area-inset-left));
    right: max(8px, env(safe-area-inset-right));
    bottom: max(8px, env(safe-area-inset-bottom));
    min-height: 132px;
    gap: 8px;
    padding: 10px 12px 12px;
  }

  .music-library-dock.detail-layout {
    left: max(8px, env(safe-area-inset-left));
    right: max(8px, env(safe-area-inset-right));
  }

  .dock-main-row {
    grid-template-columns: 1fr;
    gap: 8px;
  }

  .controls {
    justify-content: flex-start;
  }

  .utility-block {
    justify-content: start;
    grid-template-columns: auto auto auto minmax(120px, 1fr);
  }

  .time {
    min-width: 76px;
    font-size: 11px;
  }

  .dock-queue {
    width: min(96vw, 520px);
    right: 0;
    left: 0;
    margin: 0 auto;
  }

  .dock-collect {
    width: min(96vw, 360px);
    right: 0;
    left: 0;
    margin: 0 auto;
  }
}
</style>
