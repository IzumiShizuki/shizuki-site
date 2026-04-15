<template>
  <footer ref="rootRef" class="music-library-dock liquid-material" :class="{ 'detail-layout': detailLayout }" @click="handleRootClick">
    <div class="dock-progress-row" @click.stop>
      <button class="play-mode-pill ripple-trigger icon-only" type="button" :title="`播放顺序：${modeLabel}`" @click.stop="emit('cycle-mode')">
        <i class="fas" :class="modeIconClass"></i>
      </button>
      <input class="progress-input" type="range" min="0" max="1000" :value="Math.round(progress * 1000)" @input="onSeek" />
      <span class="time">{{ playedText }} / {{ durationText }}</span>
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
        <input class="volume-input" type="range" min="0" max="100" :value="Math.round(volume * 100)" @input="onVolume" />
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

const playedText = computed(() => formatMediaTime(props.currentTime));
const durationText = computed(() => formatMediaTime(props.duration));

const modeLabel = computed(() => {
  if (props.playMode === 'random') return '随机';
  if (props.playMode === 'single') return '单曲';
  return '顺序';
});
const modeIconClass = computed(() => {
  if (props.playMode === 'random') return 'fa-shuffle';
  if (props.playMode === 'single') return 'fa-repeat-1';
  return 'fa-repeat';
});

function onSeek(event) {
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
  border: 1px solid var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  color: var(--accent-mode-text);
  font-size: 12px;
  letter-spacing: 0.03em;
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

.time {
  color: var(--theme-text-tertiary);
  font-size: 12px;
  min-width: 86px;
  text-align: right;
}

.progress-input {
  width: 100%;
  accent-color: rgb(var(--accent-strong-rgb));
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
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
}

.ctrl-btn.primary {
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.3));
  color: var(--accent-mode-text);
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
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
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
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
  width: 100%;
  accent-color: rgb(var(--accent-strong-rgb));
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
