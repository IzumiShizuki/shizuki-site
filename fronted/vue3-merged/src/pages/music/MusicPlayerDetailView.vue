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
      <section class="vinyl-stage">
        <div class="vinyl-arm" :class="{ playing: music.player.isPlaying.value }"></div>
        <div class="vinyl-disc" :class="{ spinning: music.player.isPlaying.value }">
          <div class="vinyl-cover" :style="coverStyle"></div>
        </div>
      </section>

      <section class="detail-right">
        <header class="track-meta">
          <h1>{{ track?.title || '暂无播放曲目' }}</h1>
          <p class="sub">{{ track?.artist || '未知歌手' }}</p>
        </header>

        <div class="lyric-mode-row">
          <button class="mode-btn ripple-trigger" :class="{ active: lyricMode === 'original' }" type="button" @click="setLyricMode('original')">
            原文
          </button>
          <button
            class="mode-btn ripple-trigger"
            :class="{ active: lyricMode === 'original_translation' }"
            type="button"
            @click="setLyricMode('original_translation')"
          >
            原文+翻译
          </button>
          <button
            class="mode-btn ripple-trigger"
            :class="{ active: lyricMode === 'original_furigana' }"
            type="button"
            @click="setLyricMode('original_furigana')"
          >
            原文+注音
          </button>
        </div>

        <section class="lyric-scroll-shell">
          <div class="lyric-center-guide" aria-hidden="true"></div>

          <div class="lyric-scroll" ref="lyricListRef" @scroll.passive="handleLyricScroll">
            <button
              v-for="(row, index) in renderedRows"
              :key="`lyric-row-${index}-${row.time}`"
              :ref="(el) => setLyricRowRef(el, index)"
              class="lyric-row ripple-trigger"
              :class="{ active: index === activeLyricIndex }"
              type="button"
              @click="seekToLyricRow(row.time)"
            >
              <p class="line-main">{{ row.main || '...' }}</p>
              <p class="line-sub">{{ row.sub || '' }}</p>
            </button>
          </div>

          <transition name="lyric-time-fade">
            <button
              v-if="centerTimeVisible"
              class="center-time-pill ripple-trigger"
              type="button"
              @click="seekToCenterLyric"
            >
              <i class="fas fa-play"></i>
              {{ centerTimeText }}
            </button>
          </transition>
        </section>

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
import { computed, nextTick, onBeforeUnmount, ref, watch } from 'vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import { safeCssUrl } from '../../utils/url';

const music = useMusicLibraryContext();

const track = computed(() => music.player.currentTrack.value);
const volume = computed(() => Number(music.player.volume.value || 0));
const lyricMode = computed(() => String(music.player.lyricRenderMode?.value || 'original_translation'));
const lyricTimeline = computed(() => (Array.isArray(music.player.lyricTimeline?.value) ? music.player.lyricTimeline.value : []));
const activeLyricIndex = computed(() => Number(music.player.currentLyricEntryIndex?.value ?? -1));

const lyricListRef = ref(null);
const lyricRowRefs = ref([]);
const centerTimeVisible = ref(false);
const centerTimeText = ref('00:00');
const centerLyricTime = ref(0);

let centerTimeHideTimer = 0;
let autoFollowSuspendUntil = 0;

const renderedRows = computed(() => {
  const rows = lyricTimeline.value;
  if (!rows.length) {
    const fallback = String(track.value?.lyricText || '').trim();
    if (!fallback) {
      return [{ time: 0, main: '纯音乐，无歌词', sub: '' }];
    }
    const lines = fallback
      .split(/\r?\n/)
      .map((line) => line.trim())
      .filter(Boolean)
      .slice(0, 180);
    if (!lines.length) {
      return [{ time: 0, main: '纯音乐，无歌词', sub: '' }];
    }
    return lines.map((line, idx) => ({
      time: idx * 4,
      main: line,
      sub: lines[idx + 1] || ''
    }));
  }

  return rows.map((item, idx) => {
    const main = String(item?.original || '').trim() || '...';
    const nextOriginal = String(rows[idx + 1]?.original || '').trim();
    const translation = String(item?.translation || '').trim();
    const furigana = String(item?.furigana || '').trim();

    let sub = '';
    if (lyricMode.value === 'original_translation') {
      sub = translation || nextOriginal;
    } else if (lyricMode.value === 'original_furigana') {
      sub = furigana || translation || nextOriginal;
    } else {
      sub = nextOriginal;
    }

    return {
      time: Number(item?.time || 0),
      main,
      sub
    };
  });
});

const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const safeCover = safeCssUrl(track.value?.cover || fallback);
  return {
    backgroundImage: safeCover ? `url('${safeCover}')` : 'none'
  };
});

const progress = computed(() => {
  const total = Number(music.player.duration.value || 0);
  const current = Number(music.player.currentTime.value || 0);
  if (!Number.isFinite(total) || total <= 0) return 0;
  return Math.max(0, Math.min(1, current / total));
});

const playedText = computed(() => formatTime(music.player.currentTime.value));
const remainText = computed(() => {
  const total = Number(music.player.duration.value || 0);
  const current = Number(music.player.currentTime.value || 0);
  return formatTime(Math.max(0, total - current));
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

function setLyricMode(mode) {
  music.player.setLyricRenderMode?.(mode);
}

function setLyricRowRef(el, index) {
  if (!el) return;
  lyricRowRefs.value[index] = el;
}

function seekToLyricRow(time) {
  const target = Number(time);
  if (!Number.isFinite(target) || target < 0) return;
  music.player.seekToTime?.(target);
}

function seekToCenterLyric() {
  seekToLyricRow(centerLyricTime.value);
}

function revealCenterTime(time) {
  centerLyricTime.value = Number.isFinite(Number(time)) ? Number(time) : 0;
  centerTimeText.value = formatTime(centerLyricTime.value);
  centerTimeVisible.value = true;
  if (centerTimeHideTimer) {
    window.clearTimeout(centerTimeHideTimer);
  }
  centerTimeHideTimer = window.setTimeout(() => {
    centerTimeVisible.value = false;
    centerTimeHideTimer = 0;
  }, 1400);
}

function handleLyricScroll() {
  const container = lyricListRef.value;
  if (!container) return;
  autoFollowSuspendUntil = Date.now() + 1800;

  const centerY = container.scrollTop + container.clientHeight / 2;
  let nearestIndex = -1;
  let nearestDistance = Number.POSITIVE_INFINITY;

  for (let i = 0; i < lyricRowRefs.value.length; i += 1) {
    const rowEl = lyricRowRefs.value[i];
    if (!rowEl) continue;
    const rowCenter = rowEl.offsetTop + rowEl.offsetHeight / 2;
    const distance = Math.abs(rowCenter - centerY);
    if (distance < nearestDistance) {
      nearestDistance = distance;
      nearestIndex = i;
    }
  }

  if (nearestIndex >= 0) {
    revealCenterTime(renderedRows.value[nearestIndex]?.time || 0);
  }
}

function scrollToLyricIndex(index, behavior = 'smooth') {
  const container = lyricListRef.value;
  const rowEl = lyricRowRefs.value[index];
  if (!container || !rowEl) return;
  const targetTop = rowEl.offsetTop - container.clientHeight / 2 + rowEl.offsetHeight / 2;
  container.scrollTo({ top: Math.max(0, targetTop), behavior });
}

watch(
  () => renderedRows.value.length,
  async () => {
    lyricRowRefs.value = [];
    await nextTick();
    const idx = activeLyricIndex.value;
    if (idx >= 0) {
      scrollToLyricIndex(idx, 'auto');
    }
  },
  { immediate: true }
);

watch(
  () => activeLyricIndex.value,
  async (nextIndex) => {
    if (nextIndex < 0) return;
    if (Date.now() < autoFollowSuspendUntil) return;
    await nextTick();
    scrollToLyricIndex(nextIndex, 'smooth');
  }
);

onBeforeUnmount(() => {
  if (centerTimeHideTimer) {
    window.clearTimeout(centerTimeHideTimer);
    centerTimeHideTimer = 0;
  }
});
</script>

<style scoped>
.music-player-detail-view {
  --liquid-bg: linear-gradient(160deg, rgba(16, 20, 29, 0.92), rgba(9, 12, 21, 0.9));
  --liquid-border: rgba(255, 255, 255, 0.18);
  --liquid-shadow: 0 22px 44px rgba(6, 10, 18, 0.42);
  min-height: 100%;
  border-radius: 18px;
  padding: 16px;
  display: grid;
  align-content: start;
  gap: 14px;
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
  gap: 22px;
  align-items: start;
}

.vinyl-stage {
  position: sticky;
  top: 12px;
  display: grid;
  place-items: center;
  padding-top: 36px;
}

.vinyl-arm {
  position: absolute;
  top: 2px;
  width: 190px;
  height: 8px;
  border-radius: 999px;
  background: linear-gradient(90deg, rgba(248, 249, 252, 0.92), rgba(229, 236, 248, 0.8));
  transform-origin: 8% 50%;
  transform: rotate(-22deg);
  transition: transform 420ms cubic-bezier(0.22, 1, 0.36, 1);
  box-shadow: 0 10px 24px rgba(0, 0, 0, 0.28);
}

.vinyl-arm.playing {
  transform: rotate(-8deg);
}

.vinyl-disc {
  width: min(86vw, 420px);
  aspect-ratio: 1 / 1;
  border-radius: 50%;
  display: grid;
  place-items: center;
  background:
    radial-gradient(circle at 50% 50%, rgba(34, 40, 58, 0.24) 0 38%, rgba(7, 10, 18, 0.95) 39% 62%, rgba(36, 43, 63, 0.38) 63% 100%),
    repeating-radial-gradient(circle at 50% 50%, rgba(236, 243, 255, 0.03) 0 2px, rgba(0, 0, 0, 0.03) 2px 4px);
  box-shadow:
    inset 0 0 0 1px rgba(255, 255, 255, 0.08),
    0 22px 42px rgba(5, 8, 14, 0.48);
}

.vinyl-disc.spinning {
  animation: detail-vinyl-spin 16s linear infinite;
}

.vinyl-cover {
  width: 62%;
  aspect-ratio: 1 / 1;
  border-radius: 50%;
  background-size: cover;
  background-position: center;
  box-shadow:
    inset 0 0 0 1px rgba(255, 255, 255, 0.18),
    0 10px 20px rgba(7, 10, 18, 0.32);
}

.detail-right {
  min-width: 0;
  display: grid;
  gap: 12px;
}

.track-meta h1 {
  margin: 0;
  font-size: clamp(30px, 3vw, 44px);
  color: rgba(246, 249, 255, 0.97);
}

.track-meta .sub {
  margin: 4px 0 0;
  color: rgba(189, 201, 226, 0.87);
}

.lyric-mode-row {
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.mode-btn {
  min-height: 32px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(226, 235, 252, 0.9);
  padding: 0 12px;
  font-size: 12px;
}

.mode-btn.active {
  border-color: rgba(var(--accent-rgb), 0.7);
  background: rgba(var(--accent-rgb), 0.24);
  color: rgba(250, 252, 255, 0.98);
}

.lyric-scroll-shell {
  position: relative;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: linear-gradient(180deg, rgba(18, 24, 36, 0.74), rgba(14, 18, 28, 0.7));
  min-height: 420px;
  overflow: hidden;
}

.lyric-center-guide {
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  height: 52px;
  transform: translateY(-50%);
  border-top: 1px solid rgba(255, 255, 255, 0.14);
  border-bottom: 1px solid rgba(255, 255, 255, 0.14);
  pointer-events: none;
  z-index: 1;
}

.lyric-scroll {
  position: relative;
  z-index: 2;
  max-height: 500px;
  min-height: 420px;
  overflow-y: auto;
  padding: 170px 24px;
  display: grid;
  gap: 14px;
  scroll-behavior: smooth;
}

.lyric-row {
  border: 0;
  background: transparent;
  color: rgba(188, 199, 220, 0.88);
  text-align: left;
  padding: 8px 2px;
  transition:
    transform 320ms cubic-bezier(0.22, 1, 0.36, 1),
    opacity 300ms ease,
    color 300ms ease,
    text-shadow 300ms ease;
}

.lyric-row .line-main,
.lyric-row .line-sub {
  margin: 0;
  line-height: 1.35;
}

.lyric-row .line-main {
  font-size: 28px;
  font-weight: 600;
}

.lyric-row .line-sub {
  margin-top: 2px;
  font-size: 24px;
  color: rgba(168, 182, 208, 0.82);
}

.lyric-row.active {
  transform: translateY(-8px);
  color: rgba(248, 251, 255, 0.99);
  text-shadow: 0 0 20px rgba(var(--accent-rgb), 0.25);
}

.lyric-row.active .line-main {
  font-size: 34px;
  font-weight: 700;
}

.lyric-row.active .line-sub {
  font-size: 28px;
  color: rgba(232, 240, 255, 0.95);
}

.center-time-pill {
  position: absolute;
  right: 14px;
  top: 50%;
  transform: translateY(-50%);
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(31, 37, 54, 0.92);
  color: rgba(236, 243, 255, 0.94);
  min-height: 30px;
  padding: 0 10px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  z-index: 4;
}

.lyric-time-fade-enter-active,
.lyric-time-fade-leave-active {
  transition: opacity 220ms ease, transform 260ms ease;
}

.lyric-time-fade-enter-from,
.lyric-time-fade-leave-to {
  opacity: 0;
  transform: translateY(-50%) scale(0.92);
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

@keyframes detail-vinyl-spin {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}

@media (max-width: 980px) {
  .detail-main {
    grid-template-columns: 1fr;
  }

  .vinyl-stage {
    position: static;
  }

  .lyric-scroll {
    min-height: 360px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .vinyl-disc.spinning {
    animation-duration: 1ms;
    animation-iteration-count: 1;
  }

  .lyric-row,
  .lyric-time-fade-enter-active,
  .lyric-time-fade-leave-active,
  .vinyl-arm {
    transition: none !important;
  }
}
</style>
