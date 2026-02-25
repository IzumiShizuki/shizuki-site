<template>
  <footer class="music-library-dock liquid-material" @click="emit('open-player-detail')">
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
      <button class="mode-btn ripple-trigger" type="button" @click="emit('cycle-mode')">
        <i :class="modeIcon"></i>
      </button>
      <span>{{ modeLabel }}</span>
    </div>
  </footer>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  track: { type: Object, default: null },
  currentTime: { type: Number, default: 0 },
  duration: { type: Number, default: 0 },
  isPlaying: { type: Boolean, default: false },
  playMode: { type: String, default: 'sequential' }
});

const emit = defineEmits(['toggle-play', 'prev', 'next', 'seek', 'cycle-mode', 'open-player-detail']);

const coverStyle = computed(() => ({
  backgroundImage: `url('${props.track?.cover || `${import.meta.env.BASE_URL}images/katanegai.jpg`}')`
}));

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
</script>

<style scoped>
.music-library-dock {
  --liquid-bg: linear-gradient(145deg, rgba(15, 18, 26, 0.9), rgba(12, 14, 21, 0.92));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 16px 36px rgba(7, 9, 15, 0.45);
  position: absolute;
  left: 12px;
  right: 12px;
  bottom: 12px;
  min-height: 84px;
  border-radius: 18px;
  display: grid;
  grid-template-columns: minmax(180px, 1fr) minmax(0, 2.4fr) minmax(92px, auto);
  gap: 12px;
  align-items: center;
  padding: 12px 14px;
  z-index: 18;
  cursor: pointer;
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
  background: linear-gradient(135deg, rgba(255, 115, 194, 0.92), rgba(96, 255, 142, 0.84));
  color: #141927;
  border-color: rgba(255, 255, 255, 0.56);
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
  accent-color: #65ff9b;
}

.dock-mode {
  display: grid;
  justify-items: center;
  gap: 4px;
  color: rgba(178, 190, 216, 0.88);
  font-size: 11px;
}

.mode-btn {
  width: 32px;
  height: 32px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(239, 245, 255, 0.96);
}

@media (max-width: 900px) {
  .music-library-dock {
    left: 8px;
    right: 8px;
    bottom: 8px;
    grid-template-columns: 1fr;
    gap: 8px;
    min-height: 116px;
  }

  .dock-mode {
    grid-auto-flow: column;
    gap: 10px;
    justify-content: center;
  }
}
</style>
