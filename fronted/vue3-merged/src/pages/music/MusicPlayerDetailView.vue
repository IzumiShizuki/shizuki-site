<template>
  <section class="music-player-detail-view liquid-material">
    <header class="detail-head">
      <button class="back-btn ripple-trigger" type="button" @click="music.exitPlayerDetail">
        <i class="fas fa-chevron-left"></i>
        返回
      </button>
      <p>播放详情</p>
    </header>

    <div class="detail-main">
      <div class="album-cover" :style="coverStyle"></div>

      <section class="meta-block">
        <h1>{{ track?.title || '暂无播放曲目' }}</h1>
        <p>{{ track?.artist || '未知歌手' }}</p>

        <div class="progress-row">
          <span>{{ playedText }}</span>
          <input type="range" min="0" max="1000" :value="Math.round(progress * 1000)" @input="onSeek" />
          <span>{{ remainText }}</span>
        </div>

        <div class="ctrl-row">
          <button class="ctrl-btn ripple-trigger" type="button" @click="music.player.playPrev">
            <i class="fas fa-backward-step"></i>
          </button>
          <button class="ctrl-btn primary ripple-trigger" type="button" @click="music.player.togglePlay">
            <i class="fas" :class="music.player.isPlaying.value ? 'fa-pause' : 'fa-play'"></i>
          </button>
          <button class="ctrl-btn ripple-trigger" type="button" @click="music.player.playNext">
            <i class="fas fa-forward-step"></i>
          </button>
        </div>

        <div class="lyric-panel">
          <p class="prev">{{ lyricContext.prev || '' }}</p>
          <p class="current">{{ lyricContext.current || lyricLine || '纯音乐，无歌词' }}</p>
          <p class="next">{{ lyricContext.next || '' }}</p>
        </div>

        <div class="volume-row">
          <i class="fas fa-volume-low"></i>
          <input type="range" min="0" max="100" :value="Math.round(volume * 100)" @input="onVolume" />
          <span>{{ Math.round(volume * 100) }}%</span>
        </div>
      </section>
    </div>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';

const music = useMusicLibraryContext();

const track = computed(() => music.player.currentTrack.value);
const lyricContext = computed(() => music.player.lyricContext.value || { prev: '', current: '', next: '' });
const lyricLine = computed(() => music.player.currentLyricLine.value || '');
const volume = computed(() => Number(music.player.volume.value || 0));

const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  return {
    backgroundImage: `url('${track.value?.cover || fallback}')`
  };
});

const progress = computed(() => {
  const duration = Number(music.player.duration.value || 0);
  const current = Number(music.player.currentTime.value || 0);
  if (!Number.isFinite(duration) || duration <= 0) return 0;
  return Math.max(0, Math.min(1, current / duration));
});

const playedText = computed(() => formatTime(music.player.currentTime.value));
const remainText = computed(() => {
  const duration = Number(music.player.duration.value || 0);
  const current = Number(music.player.currentTime.value || 0);
  return formatTime(Math.max(0, duration - current));
});

function formatTime(sec) {
  const value = Number(sec);
  if (!Number.isFinite(value) || value < 0) return '00:00';
  const rounded = Math.floor(value);
  return `${String(Math.floor(rounded / 60)).padStart(2, '0')}:${String(rounded % 60).padStart(2, '0')}`;
}

function onSeek(event) {
  const raw = Number(event?.target?.value);
  music.player.seekToPercent(Math.max(0, Math.min(1, raw / 1000)));
}

function onVolume(event) {
  const raw = Number(event?.target?.value);
  music.player.setVolume(Math.max(0, Math.min(1, raw / 100)));
}
</script>

<style scoped>
.music-player-detail-view {
  --liquid-bg: linear-gradient(160deg, rgba(16, 20, 29, 0.9), rgba(9, 12, 21, 0.86));
  --liquid-border: rgba(255, 255, 255, 0.18);
  --liquid-shadow: 0 22px 44px rgba(6, 10, 18, 0.42);
  min-height: 100%;
  border-radius: 18px;
  padding: 16px;
  display: grid;
  align-content: start;
  gap: 16px;
}

.detail-head {
  display: flex;
  align-items: center;
  gap: 12px;
}

.detail-head p {
  margin: 0;
  color: rgba(190, 202, 227, 0.86);
  letter-spacing: 0.06em;
}

.back-btn {
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(238, 244, 255, 0.94);
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.detail-main {
  display: grid;
  grid-template-columns: minmax(260px, 360px) minmax(0, 1fr);
  gap: 20px;
  align-items: start;
}

.album-cover {
  width: 100%;
  aspect-ratio: 1 / 1;
  border-radius: 18px;
  background-size: cover;
  background-position: center;
  box-shadow: 0 20px 42px rgba(4, 8, 14, 0.45);
}

.meta-block {
  display: grid;
  gap: 16px;
}

.meta-block h1 {
  margin: 0;
  font-size: clamp(28px, 3.2vw, 44px);
  color: rgba(246, 249, 255, 0.97);
}

.meta-block p {
  margin: 0;
  color: rgba(189, 201, 226, 0.87);
}

.progress-row {
  display: grid;
  grid-template-columns: 52px minmax(0, 1fr) 52px;
  gap: 10px;
  align-items: center;
}

.progress-row input {
  width: 100%;
  accent-color: #67ff9d;
}

.ctrl-row {
  display: flex;
  gap: 10px;
}

.ctrl-btn {
  width: 42px;
  height: 42px;
  border-radius: 50%;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(240, 245, 255, 0.94);
}

.ctrl-btn.primary {
  width: 54px;
  height: 54px;
  background: linear-gradient(132deg, rgba(255, 77, 112, 0.94), rgba(255, 122, 86, 0.9));
  color: #fff;
}

.lyric-panel {
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.06);
  padding: 12px;
  display: grid;
  gap: 8px;
}

.lyric-panel p {
  margin: 0;
  text-align: center;
}

.lyric-panel .current {
  font-size: 18px;
  color: rgba(245, 250, 255, 0.97);
}

.lyric-panel .prev,
.lyric-panel .next {
  color: rgba(177, 189, 214, 0.86);
}

.volume-row {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  gap: 10px;
  align-items: center;
  color: rgba(191, 203, 227, 0.88);
}

.volume-row input {
  width: 100%;
  accent-color: #67ff9d;
}

@media (max-width: 980px) {
  .detail-main {
    grid-template-columns: 1fr;
  }

  .album-cover {
    max-width: 360px;
  }
}
</style>
