<template>
  <section class="music-player-detail-view liquid-material">
    <header class="detail-head">
      <button class="back-btn ripple-trigger" type="button" @click="music.exitPlayerDetail">
        <i class="fas fa-chevron-left"></i>
        返回
      </button>
      <p>播放详情</p>
    </header>

    <div class="detail-layout">
      <aside class="vinyl-column">
        <div class="vinyl-stage">
          <div class="vinyl-arm" :class="{ playing: music.player.isPlaying.value }"></div>
          <div class="vinyl-disc" :class="{ spinning: music.player.isPlaying.value }">
            <div class="vinyl-cover" :style="coverStyle"></div>
          </div>
        </div>
      </aside>

      <section class="content-column">
        <header class="track-meta">
          <h1>{{ track?.title || '暂无播放曲目' }}</h1>
          <p class="sub">{{ track?.artist || '未知歌手' }}</p>
        </header>

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
      </section>

      <aside class="side-column">
        <button class="side-toggle ripple-trigger" type="button" @click="toggleQueuePanel">
          <i class="fas fa-bars"></i>
        </button>
        <p class="side-caption">歌曲列表，点击从右侧展开</p>

        <transition name="side-pop">
          <section v-if="queueOpen" class="queue-panel liquid-material">
            <header>
              <h4>当前队列</h4>
              <button class="queue-close ripple-trigger" type="button" @click="queueOpen = false">
                <i class="fas fa-xmark"></i>
              </button>
            </header>
            <div class="queue-list">
              <button
                v-for="(item, index) in queueTracks"
                :key="`queue-row-${item.id || index}`"
                class="queue-row ripple-trigger"
                :class="{ active: index === currentQueueIndex }"
                type="button"
                @click="selectQueueTrack(index)"
              >
                <span class="queue-index">{{ index + 1 }}</span>
                <span class="queue-title">{{ item.title || '未知歌曲' }}</span>
              </button>
            </div>
          </section>
        </transition>

        <button class="mode-pill ripple-trigger" type="button" @click="toggleModePanel">
          {{ activeLyricModeLabel }}
        </button>

        <transition name="side-pop">
          <div v-if="modePanelOpen" class="lyric-mode-stack liquid-material">
            <button class="mode-btn ripple-trigger" :class="{ active: lyricMode === 'original_translation' }" type="button" @click="setLyricMode('original_translation')">
              译
            </button>
            <button class="mode-btn ripple-trigger" :class="{ active: lyricMode === 'original_furigana' }" type="button" @click="setLyricMode('original_furigana')">
              音
            </button>
            <button class="mode-btn ripple-trigger" :class="{ active: lyricMode === 'original' }" type="button" @click="setLyricMode('original')">
              原
            </button>
          </div>
        </transition>

        <p class="side-order">播放顺序 · {{ playModeLabel }}</p>
      </aside>
    </div>

    <footer class="detail-footer">
      <div class="progress-row">
        <span>{{ playedText }}</span>
        <input type="range" min="0" max="1000" :value="Math.round(progress * 1000)" @input="onSeek" />
        <span>{{ remainText }}</span>
      </div>

      <div class="footer-row">
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
      </div>
    </footer>
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
const queueTracks = computed(() => (Array.isArray(music.player.tracks?.value) ? music.player.tracks.value : []));
const currentQueueIndex = computed(() => {
  const currentId = String(track.value?.id || '');
  if (!currentId) return -1;
  return queueTracks.value.findIndex((item) => String(item?.id || '') === currentId);
});
const playModeLabel = computed(() => {
  const raw = String(music.player.playMode?.value || 'sequential');
  if (raw === 'random') return '随机';
  if (raw === 'single') return '单曲循环';
  return '顺序';
});
const activeLyricModeLabel = computed(() => {
  if (lyricMode.value === 'original') return '原文';
  if (lyricMode.value === 'original_furigana') return '原文+注音';
  return '原文+翻译';
});

const lyricListRef = ref(null);
const lyricRowRefs = ref([]);
const centerTimeVisible = ref(false);
const centerTimeText = ref('00:00');
const centerLyricTime = ref(0);
const queueOpen = ref(false);
const modePanelOpen = ref(false);

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
  modePanelOpen.value = false;
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

function toggleQueuePanel() {
  queueOpen.value = !queueOpen.value;
}

function toggleModePanel() {
  modePanelOpen.value = !modePanelOpen.value;
}

function selectQueueTrack(index) {
  const safeIndex = Number(index);
  if (!Number.isFinite(safeIndex) || safeIndex < 0 || safeIndex >= queueTracks.value.length) return;
  music.player.selectTrackByIndex?.(safeIndex, true);
  queueOpen.value = false;
}

watch(
  () => queueOpen.value,
  (nextOpen) => {
    music.player.setListOpen?.(nextOpen);
  }
);

watch(
  () => music.player.listOpen?.value,
  (nextOpen) => {
    if (typeof nextOpen !== 'boolean') return;
    if (nextOpen === queueOpen.value) return;
    queueOpen.value = nextOpen;
  }
);

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
  --liquid-bg: linear-gradient(160deg, rgba(14, 20, 30, 0.94), rgba(7, 10, 20, 0.92));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 24px 46px rgba(5, 8, 16, 0.46);
  min-height: 100%;
  border-radius: 18px;
  padding: 16px;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr) auto;
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

.detail-layout {
  min-height: 0;
  display: grid;
  grid-template-columns: minmax(280px, 360px) minmax(0, 1fr) 88px;
  gap: 16px;
}

.vinyl-column {
  display: grid;
}

.vinyl-stage {
  position: sticky;
  top: 8px;
  display: grid;
  place-items: center;
  padding-top: 32px;
}

.vinyl-arm {
  position: absolute;
  top: 0;
  left: 52px;
  width: 214px;
  height: 8px;
  border-radius: 999px;
  background: linear-gradient(90deg, rgba(248, 249, 252, 0.95), rgba(229, 236, 248, 0.82));
  transform-origin: 8% 50%;
  transform: rotate(-22deg);
  transition: transform 420ms cubic-bezier(0.22, 1, 0.36, 1);
  box-shadow: 0 10px 24px rgba(0, 0, 0, 0.28);
}

.vinyl-arm.playing {
  transform: rotate(-8deg);
}

.vinyl-disc {
  width: min(82vw, 420px);
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

.content-column {
  min-width: 0;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  gap: 12px;
}

.track-meta h1 {
  margin: 0;
  font-size: clamp(28px, 3vw, 52px);
  color: rgba(246, 249, 255, 0.97);
  line-height: 1.08;
}

.track-meta .sub {
  margin: 6px 0 0;
  color: rgba(189, 201, 226, 0.87);
}

.lyric-scroll-shell {
  position: relative;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: linear-gradient(180deg, rgba(18, 24, 36, 0.74), rgba(14, 18, 28, 0.7));
  min-height: 0;
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
  height: 100%;
  max-height: 620px;
  min-height: 440px;
  overflow-y: auto;
  padding: 180px 24px;
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
  font-size: 30px;
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

.side-column {
  position: relative;
  display: grid;
  align-content: start;
  justify-items: center;
  gap: 12px;
  padding-top: 8px;
}

.side-toggle,
.mode-pill {
  min-height: 34px;
  min-width: 34px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(236, 243, 255, 0.94);
  padding: 0 10px;
}

.mode-pill {
  min-width: 76px;
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

.side-caption,
.side-order {
  margin: 0;
  font-size: 12px;
  line-height: 1.4;
  color: rgba(186, 198, 224, 0.9);
  text-align: center;
}

.lyric-mode-stack {
  border-radius: 999px;
  padding: 10px 8px;
  display: grid;
  gap: 8px;
  background: rgba(18, 23, 35, 0.72);
}

.mode-btn {
  width: 40px;
  height: 40px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(230, 238, 255, 0.92);
}

.mode-btn.active {
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.3));
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
}

.queue-panel {
  --liquid-bg: rgba(18, 23, 35, 0.82);
  --liquid-border: rgba(255, 255, 255, 0.18);
  --liquid-shadow: 0 18px 30px rgba(5, 8, 16, 0.42);
  position: absolute;
  right: calc(100% + 8px);
  top: 0;
  width: 280px;
  max-height: 62vh;
  border-radius: 12px;
  padding: 10px;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  gap: 8px;
  z-index: 6;
}

.queue-panel header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.queue-panel h4 {
  margin: 0;
  font-size: 13px;
  color: rgba(236, 243, 255, 0.94);
}

.queue-close {
  width: 24px;
  height: 24px;
  border-radius: 50%;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(228, 236, 255, 0.9);
}

.queue-list {
  min-height: 0;
  overflow: auto;
  display: grid;
  gap: 6px;
}

.queue-row {
  width: 100%;
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.06);
  color: rgba(221, 230, 248, 0.9);
  padding: 6px 8px;
  display: grid;
  grid-template-columns: 28px minmax(0, 1fr);
  align-items: center;
  gap: 8px;
}

.queue-row .queue-index {
  opacity: 0.85;
}

.queue-row .queue-title {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  text-align: left;
}

.queue-row.active {
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

.detail-footer {
  padding-top: 2px;
  display: grid;
  gap: 10px;
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

.footer-row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 18px;
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
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.3));
  color: var(--accent-mode-text, rgba(255, 255, 255, 0.96));
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
}

.volume-row {
  width: min(460px, 48vw);
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

.side-pop-enter-active,
.side-pop-leave-active,
.lyric-time-fade-enter-active,
.lyric-time-fade-leave-active {
  transition: opacity 220ms ease, transform 260ms ease;
}

.side-pop-enter-from,
.side-pop-leave-to,
.lyric-time-fade-enter-from,
.lyric-time-fade-leave-to {
  opacity: 0;
  transform: translateY(-6px);
}

@keyframes detail-vinyl-spin {
  from {
    transform: rotate(0deg);
  }
  to {
    transform: rotate(360deg);
  }
}

@media (max-width: 1220px) {
  .detail-layout {
    grid-template-columns: minmax(240px, 310px) minmax(0, 1fr) 74px;
  }

  .lyric-row .line-main {
    font-size: 26px;
  }

  .lyric-row.active .line-main {
    font-size: 30px;
  }

  .lyric-row .line-sub {
    font-size: 21px;
  }

  .lyric-row.active .line-sub {
    font-size: 24px;
  }
}

@media (max-width: 980px) {
  .detail-layout {
    grid-template-columns: 1fr;
  }

  .vinyl-column,
  .side-column {
    order: 0;
  }

  .content-column {
    order: 1;
  }

  .vinyl-stage {
    position: static;
    padding-top: 20px;
  }

  .side-column {
    grid-auto-flow: column;
    justify-content: start;
    justify-items: start;
    gap: 10px;
  }

  .queue-panel {
    left: 0;
    right: auto;
    top: calc(100% + 8px);
    width: min(86vw, 360px);
  }

  .lyric-scroll {
    min-height: 360px;
    max-height: 60vh;
  }

  .footer-row {
    flex-direction: column;
    align-items: stretch;
  }

  .volume-row {
    width: 100%;
  }
}

@media (prefers-reduced-motion: reduce) {
  .vinyl-disc.spinning {
    animation-duration: 1ms;
    animation-iteration-count: 1;
  }

  .lyric-row,
  .side-pop-enter-active,
  .side-pop-leave-active,
  .lyric-time-fade-enter-active,
  .lyric-time-fade-leave-active,
  .vinyl-arm {
    transition: none !important;
  }
}
</style>
