<template>
  <footer ref="rootRef" class="music-library-dock liquid-material" @click="emit('open-player-detail')">
    <div class="dock-track">
      <div class="cover" :style="coverStyle"></div>
      <div class="meta">
        <p class="title">{{ track?.title || '暂无音乐' }}</p>
        <p class="artist">{{ track?.artist || '未知歌手' }}</p>
      </div>
    </div>

    <div class="dock-main">
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

      <div class="progress-line" @click.stop>
        <span class="time">{{ playedText }}</span>
        <input class="progress-input" type="range" min="0" max="1000" :value="Math.round(progress * 1000)" @input="onSeek" />
        <span class="time">{{ remainText }}</span>
      </div>
    </div>

    <div class="dock-mode" @click.stop>
      <button class="mode-btn ripple-trigger" type="button" @click="toggleQueue">
        <i class="fas fa-list"></i>
      </button>
      <button class="mode-btn ripple-trigger" type="button" @click="emit('cycle-mode')">
        <i :class="modeIcon"></i>
      </button>
      <span>{{ modeLabel }}</span>
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
import { computed, onBeforeUnmount, ref } from 'vue';
import { safeCssUrl } from '../../utils/url';

const props = defineProps({
  track: { type: Object, default: null },
  tracks: { type: Array, default: () => [] },
  currentTrackId: { type: String, default: '' },
  currentTime: { type: Number, default: 0 },
  duration: { type: Number, default: 0 },
  isPlaying: { type: Boolean, default: false },
  playMode: { type: String, default: 'sequential' }
});

const emit = defineEmits(['toggle-play', 'prev', 'next', 'seek', 'cycle-mode', 'select-track', 'open-player-detail']);
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

const playedText = computed(() => formatTime(props.currentTime));
const remainText = computed(() => formatTime(Math.max(0, Number(props.duration || 0) - Number(props.currentTime || 0))));

const modeIcon = computed(() => {
  if (props.playMode === 'random') return 'fas fa-shuffle';
  if (props.playMode === 'single') return 'fas fa-repeat-1';
  return 'fas fa-repeat';
});

const modeLabel = computed(() => {
  if (props.playMode === 'random') return '随机';
  if (props.playMode === 'single') return '单曲';
  return '顺序';
});

function formatTime(sec) {
  if (!Number.isFinite(sec) || sec < 0) return '00:00';
  const t = Math.floor(sec);
  return `${String(Math.floor(t / 60)).padStart(2, '0')}:${String(t % 60).padStart(2, '0')}`;
}

function onSeek(event) {
  const raw = Number(event?.target?.value);
  emit('seek', Math.max(0, Math.min(1, raw / 1000)));
}

function toggleQueue() {
  queueOpen.value = !queueOpen.value;
}

function handleSelectTrack(index) {
  emit('select-track', index);
  queueOpen.value = false;
}

function onDocumentPointerDown(event) {
  if (!queueOpen.value) return;
  const root = rootRef.value;
  const target = event?.target;
  if (!root || !(target instanceof Element)) return;
  if (root.contains(target)) return;
  queueOpen.value = false;
}

if (typeof document !== 'undefined') {
  document.addEventListener('pointerdown', onDocumentPointerDown, true);
}

onBeforeUnmount(() => {
  if (typeof document !== 'undefined') {
    document.removeEventListener('pointerdown', onDocumentPointerDown, true);
  }
});
</script>

<style scoped>
.music-library-dock {
  --liquid-bg: linear-gradient(145deg, rgba(15, 18, 26, 0.9), rgba(12, 14, 21, 0.92));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 16px 36px rgba(7, 9, 15, 0.45);
  position: fixed;
  left: max(12px, env(safe-area-inset-left));
  right: max(12px, env(safe-area-inset-right));
  bottom: max(12px, env(safe-area-inset-bottom));
  min-height: 84px;
  border-radius: 18px;
  display: grid;
  grid-template-columns: minmax(180px, 1fr) minmax(0, 2.4fr) minmax(92px, auto);
  gap: 12px;
  align-items: center;
  padding: 12px 14px;
  z-index: 1240;
  cursor: pointer;
  overflow: visible;
}

.dock-track {
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
  color: rgba(240, 245, 255, 0.96);
  font-size: 14px;
}

.artist {
  margin: 6px 0 0;
  color: rgba(166, 178, 206, 0.88);
  font-size: 12px;
}

.dock-main {
  display: grid;
  gap: 8px;
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
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(237, 243, 255, 0.92);
}

.ctrl-btn.primary {
  background: linear-gradient(135deg, rgba(var(--accent-soft-rgb), 0.96), rgba(var(--accent-rgb), 0.92));
  color: rgba(20, 25, 39, 0.92);
  border-color: rgba(var(--accent-rgb), 0.58);
  box-shadow:
    0 0 0 1px rgba(var(--accent-rgb), 0.32),
    0 8px 16px rgba(var(--accent-rgb), 0.22);
}

.progress-line {
  display: grid;
  grid-template-columns: 46px minmax(0, 1fr) 46px;
  gap: 8px;
  align-items: center;
}

.time {
  color: rgba(177, 189, 216, 0.84);
  font-size: 11px;
  text-align: center;
}

.progress-input {
  width: 100%;
  accent-color: rgb(var(--accent-strong-rgb));
}

.dock-mode {
  display: grid;
  justify-items: center;
  gap: 4px;
  color: rgba(178, 190, 216, 0.88);
  font-size: 11px;
  grid-auto-flow: column;
  align-items: center;
}

.mode-btn {
  width: 32px;
  height: 32px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(239, 245, 255, 0.96);
}

.dock-queue {
  --liquid-bg: linear-gradient(160deg, rgba(13, 17, 26, 0.94), rgba(10, 14, 20, 0.94));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 18px 30px rgba(4, 8, 14, 0.46);
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
  color: rgba(235, 242, 255, 0.94);
}

.queue-close {
  width: 26px;
  height: 26px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.12);
  color: rgba(237, 243, 255, 0.94);
}

.queue-body {
  max-height: 260px;
  overflow: auto;
  display: grid;
  gap: 6px;
}

.queue-item {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.08);
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
  color: rgba(241, 246, 255, 0.96);
}

.queue-meta {
  font-size: 11px;
  color: rgba(180, 193, 219, 0.86);
}

.queue-empty {
  margin: 0;
  min-height: 62px;
  display: grid;
  place-items: center;
  border-radius: 10px;
  border: 1px dashed rgba(255, 255, 255, 0.2);
  color: rgba(177, 190, 216, 0.84);
  font-size: 12px;
}

@media (max-width: 900px) {
  .music-library-dock {
    left: max(8px, env(safe-area-inset-left));
    right: max(8px, env(safe-area-inset-right));
    bottom: max(8px, env(safe-area-inset-bottom));
    grid-template-columns: 1fr;
    gap: 8px;
    min-height: 116px;
  }

  .dock-mode {
    gap: 10px;
    justify-content: center;
  }

  .dock-queue {
    width: min(96vw, 520px);
    right: 0;
    left: 0;
    margin: 0 auto;
  }
}
</style>
