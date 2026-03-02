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

        <div class="action-row">
          <button class="action-btn ripple-trigger" type="button" @click="toggleLikeCurrent">
            <i class="fas" :class="isLikedCurrent ? 'fa-heart liked' : 'fa-heart-crack'"></i>
            {{ isLikedCurrent ? '已喜欢' : '加入我喜欢' }}
          </button>
        </div>

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
          <transition name="lyric-detail-soft" mode="out-in">
            <div :key="lyricTransitionKey" class="lyric-stack">
              <p class="prev">{{ lyricDisplay.prev }}</p>
              <p class="current">{{ lyricDisplay.current }}</p>
              <p class="next">{{ lyricDisplay.next }}</p>
            </div>
          </transition>
        </div>

        <div class="volume-row">
          <i class="fas fa-volume-low"></i>
          <input type="range" min="0" max="100" :value="Math.round(volume * 100)" @input="onVolume" />
          <span>{{ Math.round(volume * 100) }}%</span>
        </div>

        <section class="queue-panel">
          <header class="queue-head">
            <h3>当前播放列表</h3>
            <span>{{ tracks.length }} 首</span>
          </header>
          <div class="queue-list">
            <button
              v-for="(item, index) in tracks"
              :key="`detail-queue-${item.id || index}`"
              class="queue-row ripple-trigger"
              :class="{ active: (item.id || '') === (track?.id || '') }"
              type="button"
              @click="music.player.selectTrackByIndex(index, true)"
            >
              <span class="queue-index">{{ String(index + 1).padStart(2, '0') }}</span>
              <span class="queue-title">{{ item.title || '未知标题' }}</span>
              <span class="queue-time">{{ item.durationLabel || '--:--' }}</span>
            </button>
          </div>
        </section>
      </section>
    </div>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import { safeCssUrl } from '../../utils/url';

const music = useMusicLibraryContext();

const track = computed(() => music.player.currentTrack.value);
const lyricContext = computed(() => music.player.lyricContext.value || { prev: '', current: '', next: '' });
const lyricLine = computed(() => music.player.currentLyricLine.value || '');
const volume = computed(() => Number(music.player.volume.value || 0));
const tracks = computed(() => (Array.isArray(music.player.tracks.value) ? music.player.tracks.value : []));
const lyricDisplay = computed(() => {
  const raw = lyricContext.value || {};
  const current = String(raw.current || lyricLine.value || '').trim() || '纯音乐，无歌词';
  return {
    prev: String(raw.prev || '').trim(),
    current,
    next: String(raw.next || '').trim()
  };
});
const lyricTransitionKey = computed(() => `${lyricDisplay.value.prev}|${lyricDisplay.value.current}|${lyricDisplay.value.next}`);
const isLikedCurrent = computed(() => {
  const id = String(track.value?.trackId || track.value?.id || '').trim();
  if (!id) return false;
  return Boolean(music.isTrackLiked(id));
});

const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const safeCover = safeCssUrl(track.value?.cover || fallback);
  return {
    backgroundImage: safeCover ? `url('${safeCover}')` : 'none'
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

function toggleLikeCurrent() {
  if (!track.value) return;
  music.toggleTrackLike(track.value);
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
  gap: 14px;
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

.action-row {
  display: flex;
}

.action-btn {
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(236, 242, 255, 0.94);
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.action-btn .liked {
  color: rgb(var(--accent-strong-rgb));
}

.progress-row {
  display: grid;
  grid-template-columns: 52px minmax(0, 1fr) 52px;
  gap: 10px;
  align-items: center;
}

.progress-row input {
  width: 100%;
  accent-color: rgb(var(--accent-strong-rgb));
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
  background: linear-gradient(132deg, rgba(var(--accent-rgb), 0.92), rgba(var(--accent-soft-rgb), 0.88));
  color: rgba(255, 255, 255, 0.96);
  border-color: rgba(var(--accent-rgb), 0.62);
  box-shadow:
    0 0 0 1px rgba(var(--accent-rgb), 0.3),
    0 10px 18px rgba(var(--accent-rgb), 0.24);
}

.lyric-panel {
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.06);
  padding: 12px;
  overflow: hidden;
}

.lyric-stack {
  display: grid;
  gap: 8px;
}

.lyric-panel p {
  margin: 0;
  text-align: center;
  transition: opacity 300ms ease, transform 340ms ease, filter 300ms ease;
}

.lyric-panel .current {
  font-size: 18px;
  font-weight: 700;
  color: rgba(245, 250, 255, 0.97);
  text-shadow: 0 0 20px rgba(var(--accent-rgb), 0.22);
}

.lyric-panel .prev,
.lyric-panel .next {
  color: rgba(177, 189, 214, 0.86);
  opacity: 0.7;
  filter: blur(0.25px);
}

.lyric-detail-soft-enter-active,
.lyric-detail-soft-leave-active {
  transition: opacity 320ms ease, transform 380ms cubic-bezier(0.22, 1, 0.36, 1), filter 320ms ease;
}

.lyric-detail-soft-enter-from {
  opacity: 0;
  transform: translateY(12px) scale(0.985);
  filter: blur(4px);
}

.lyric-detail-soft-leave-to {
  opacity: 0;
  transform: translateY(-10px) scale(0.99);
  filter: blur(4px);
}

.lyric-detail-soft-enter-to,
.lyric-detail-soft-leave-from {
  opacity: 1;
  transform: translateY(0) scale(1);
  filter: blur(0);
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
  accent-color: rgb(var(--accent-strong-rgb));
}

.queue-panel {
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.06);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.queue-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.queue-head h3 {
  margin: 0;
  font-size: 14px;
  color: rgba(241, 247, 255, 0.94);
}

.queue-head span {
  font-size: 12px;
  color: rgba(180, 193, 220, 0.84);
}

.queue-list {
  max-height: 220px;
  overflow: auto;
  display: grid;
  gap: 6px;
}

.queue-row {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(236, 242, 255, 0.94);
  min-height: 34px;
  padding: 0 8px;
  display: grid;
  grid-template-columns: 34px minmax(0, 1fr) 54px;
  align-items: center;
  gap: 8px;
  text-align: left;
}

.queue-row.active {
  border-color: rgba(var(--accent-rgb), 0.64);
  background: rgba(var(--accent-rgb), 0.24);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.24);
}

.queue-index {
  color: rgba(184, 196, 223, 0.82);
  font-size: 11px;
}

.queue-title {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  font-size: 13px;
}

.queue-time {
  font-size: 11px;
  color: rgba(183, 196, 222, 0.84);
  text-align: right;
}

@media (max-width: 980px) {
  .detail-main {
    grid-template-columns: 1fr;
  }

  .album-cover {
    max-width: 360px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .lyric-detail-soft-enter-active,
  .lyric-detail-soft-leave-active,
  .lyric-panel p {
    transition-duration: 1ms !important;
    transition-delay: 0ms !important;
  }
}
</style>
