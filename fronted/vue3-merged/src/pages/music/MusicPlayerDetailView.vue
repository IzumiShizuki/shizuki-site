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
          <div class="vinyl-disc" :class="{ spinning: music.player.isPlaying.value }">
            <div class="vinyl-cover" :style="coverStyle"></div>
          </div>
        </div>
      </aside>

      <section class="content-column">
        <header class="track-meta">
          <h1>{{ track?.title || '暂无播放曲目' }}</h1>
          <p class="sub">{{ track?.artist || '未知歌手' }}</p>
          <p v-if="albumText" class="album">{{ albumText }}</p>
        </header>

        <section class="lyric-scroll-shell">
          <div class="lyric-center-guide" aria-hidden="true"></div>

          <SubtleScrollArea class="lyric-scroll" ref="lyricListRef" @scroll.passive="handleLyricScroll">
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
              <p v-if="row.sub" class="line-sub">{{ row.sub }}</p>
            </button>
          </SubtleScrollArea>

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
        <button class="mode-icon-btn ripple-trigger" type="button" :title="`播放顺序：${playModeLabel}`" @click="cyclePlayMode">
          <i class="fas" :class="playModeIcon"></i>
        </button>
        <p class="side-caption">{{ playModeLabel }}</p>

        <button v-if="showLyricModeControls" class="mode-pill ripple-trigger" type="button" @click="toggleModePanel">
          {{ activeLyricModeLabel }}
        </button>

        <transition name="side-pop">
          <div v-if="showLyricModeControls && modePanelOpen" class="lyric-mode-stack liquid-material">
            <button
              v-if="availableLyricModes.includes('original_translation')"
              class="mode-btn ripple-trigger"
              :class="{ active: lyricMode === 'original_translation' }"
              type="button"
              @click="setLyricMode('original_translation')"
            >
              译
            </button>
            <button
              v-if="availableLyricModes.includes('original_furigana')"
              class="mode-btn ripple-trigger"
              :class="{ active: lyricMode === 'original_furigana' }"
              type="button"
              @click="setLyricMode('original_furigana')"
            >
              音
            </button>
            <button class="mode-btn ripple-trigger" :class="{ active: lyricMode === 'original' }" type="button" @click="setLyricMode('original')">
              原
            </button>
          </div>
        </transition>
      </aside>
    </div>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, ref, watch } from 'vue';
import SubtleScrollArea from '../../components/SubtleScrollArea.vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import { formatMediaTime } from '../../utils/mediaTime';
import { safeCssUrl } from '../../utils/url';

const music = useMusicLibraryContext();

const track = computed(() => music.player.currentTrack.value);
const lyricMode = computed(() => String(music.player.lyricRenderMode?.value || 'original_translation'));
const lyricTimeline = computed(() => (Array.isArray(music.player.lyricTimeline?.value) ? music.player.lyricTimeline.value : []));
const activeLyricIndex = computed(() => Number(music.player.currentLyricEntryIndex?.value ?? -1));
const availableLyricModes = computed(() =>
  Array.isArray(music.player.availableLyricModes?.value) && music.player.availableLyricModes.value.length
    ? music.player.availableLyricModes.value
    : ['original']
);
const showLyricModeControls = computed(() => availableLyricModes.value.length > 1);
const playModeLabel = computed(() => {
  const raw = String(music.player.playMode?.value || 'sequential');
  if (raw === 'random') return '随机';
  if (raw === 'single') return '单曲循环';
  return '顺序';
});
const playModeIcon = computed(() => {
  const raw = String(music.player.playMode?.value || 'sequential');
  if (raw === 'random') return 'fa-shuffle';
  if (raw === 'single') return 'fa-repeat-1';
  return 'fa-repeat';
});
const activeLyricModeLabel = computed(() => {
  if (lyricMode.value === 'original') return '原文';
  if (lyricMode.value === 'original_furigana') return '原文+注音';
  return '原文+翻译';
});
const albumText = computed(() => {
  const metadata = track.value?.metadata && typeof track.value.metadata === 'object' ? track.value.metadata : {};
  return String(track.value?.album || metadata?.album || metadata?.albumName || metadata?.album_name || '').trim();
});

const lyricListRef = ref(null);
const lyricRowRefs = ref([]);
const centerTimeVisible = ref(false);
const centerTimeText = ref('00:00');
const centerLyricTime = ref(0);
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
      sub: ''
    }));
  }

  return rows.map((item) => {
    const main = String(item?.original || '').trim() || '...';
    const translation = String(item?.translation || '').trim();
    const furigana = String(item?.furigana || '').trim();

    let sub = '';
    if (lyricMode.value === 'original_translation') {
      sub = translation;
    } else if (lyricMode.value === 'original_furigana') {
      sub = furigana || translation;
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

function setLyricMode(mode) {
  music.player.setLyricRenderMode?.(mode);
  modePanelOpen.value = false;
}

function cyclePlayMode() {
  music.player.cyclePlayMode?.();
}

function setLyricRowRef(el, index) {
  if (!el) return;
  lyricRowRefs.value[index] = el;
}

function getLyricListElement() {
  const target = lyricListRef.value;
  if (!target) return null;
  if (target instanceof HTMLElement) return target;
  if (typeof target.getElement === 'function') {
    const element = target.getElement();
    if (element instanceof HTMLElement) return element;
  }
  if (target.el instanceof HTMLElement) return target.el;
  if (target.el?.value instanceof HTMLElement) return target.el.value;
  if (target.$el instanceof HTMLElement) return target.$el;
  return null;
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
  centerTimeText.value = formatMediaTime(centerLyricTime.value);
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
  const container = getLyricListElement();
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
  const container = getLyricListElement();
  const rowEl = lyricRowRefs.value[index];
  if (!container || !rowEl) return;
  const targetTop = rowEl.offsetTop - container.clientHeight / 2 + rowEl.offsetHeight / 2;
  container.scrollTo({ top: Math.max(0, targetTop), behavior });
}

function toggleModePanel() {
  modePanelOpen.value = !modePanelOpen.value;
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
  () => showLyricModeControls.value,
  (nextVisible) => {
    if (!nextVisible) {
      modePanelOpen.value = false;
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
  height: 100%;
  border-radius: 18px;
  padding: 16px;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  gap: 14px;
  overflow: hidden;
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
  height: 100%;
  display: grid;
  grid-template-columns: minmax(360px, 500px) minmax(0, 1fr) 86px;
  gap: 28px;
  overflow: hidden;
}

.vinyl-column {
  display: grid;
}

.vinyl-stage {
  position: relative;
  display: grid;
  place-items: center;
  padding-top: 10px;
  padding-left: 14px;
}

.vinyl-disc {
  width: clamp(220px, 26vw, 360px);
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
  gap: 14px;
  padding-left: 28px;
}

.track-meta h1 {
  margin: 0;
  font-size: clamp(28px, 3vw, 52px);
  color: rgba(246, 249, 255, 0.97);
  line-height: 1.08;
  letter-spacing: 0.01em;
}

.track-meta .sub {
  margin: 6px 0 0;
  color: rgba(189, 201, 226, 0.87);
}

.track-meta .album {
  margin: 4px 0 0;
  color: rgba(160, 175, 205, 0.86);
  font-size: 13px;
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
  max-height: none;
  min-height: 0;
  overflow-y: auto;
  padding: 150px 32px;
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
  padding-top: 10px;
}

.mode-icon-btn,
.mode-pill {
  min-height: 34px;
  min-width: 34px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(236, 243, 255, 0.94);
  padding: 0 10px;
}

.mode-icon-btn {
  width: 40px;
  min-width: 40px;
  height: 40px;
  padding: 0;
  font-size: 14px;
}

.mode-pill {
  min-width: 76px;
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
}

.side-caption {
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
    grid-template-columns: minmax(280px, 360px) minmax(0, 1fr) 70px;
    gap: 14px;
  }

  .content-column {
    padding-left: 10px;
  }

  .lyric-scroll {
    padding-left: 24px;
    padding-right: 24px;
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
    grid-template-rows: auto minmax(0, 1fr) auto;
    overflow: hidden;
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

  .lyric-scroll {
    min-height: 0;
    max-height: none;
    padding-top: 120px;
    padding-bottom: 120px;
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
  .lyric-time-fade-leave-active {
    transition: none !important;
  }
}
</style>
