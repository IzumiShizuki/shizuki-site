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
          <div class="meta-actions">
            <button class="meta-collect-btn ripple-trigger" type="button" title="收藏到歌单" @click="music.openCollectDialog?.(track)">
              <i class="fas fa-folder-plus"></i>
              收藏到歌单
            </button>
          </div>
        </header>

        <section class="lyric-scroll-shell">
          <div v-show="centerTimeVisible" class="lyric-center-guide" aria-hidden="true"></div>

          <SubtleScrollArea
            class="lyric-scroll"
            ref="lyricListRef"
            tabindex="0"
            @scroll.passive="handleLyricScroll"
            @wheel.passive="handleLyricInteraction"
            @touchstart.passive="handleLyricInteraction"
            @pointerdown.passive="handleLyricInteraction"
            @keydown="handleLyricKeydown"
          >
            <button
              v-for="(row, index) in renderedRows"
              :key="`lyric-row-${index}-${row.time}`"
              :ref="(el) => setLyricRowRef(el, index)"
              class="lyric-row"
              :class="{ active: index === activeScrollIndex }"
              :aria-current="index === activeScrollIndex ? 'true' : undefined"
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
import { computed, nextTick, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import SubtleScrollArea from '../../components/SubtleScrollArea.vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import {
  resolveClosestLyricRowIndex,
  resolveLyricEdgePadding,
  resolveLyricScrollTop
} from '../../utils/lyricAlignment';
import { formatMediaTime } from '../../utils/mediaTime';
import { safeCssUrl } from '../../utils/url';

const music = useMusicLibraryContext();

const track = computed(() => music.player.currentTrack.value);
const lyricMode = computed(() => String(music.player.lyricRenderMode?.value || 'original_translation'));
const lyricTimeline = computed(() => (Array.isArray(music.player.lyricTimeline?.value) ? music.player.lyricTimeline.value : []));
const activeLyricIndex = computed(() => Number(music.player.currentLyricEntryIndex?.value ?? -1));
const currentTimeSec = computed(() => Number(music.player.currentTime?.value || 0));
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
let lyricResizeObserver = null;
let lyricResizeFrame = 0;

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

const activeScrollIndex = computed(() => {
  const list = renderedRows.value;
  if (!list.length) return -1;
  if (activeLyricIndex.value >= 0 && activeLyricIndex.value < list.length) {
    return activeLyricIndex.value;
  }
  const now = currentTimeSec.value;
  let idx = -1;
  for (let i = 0; i < list.length; i += 1) {
    if (Number(list[i].time || 0) <= now) idx = i;
    else break;
  }
  if (idx < 0) idx = 0;
  return idx;
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
  if (el) {
    lyricRowRefs.value[index] = el;
  }
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

function handleLyricInteraction() {
  autoFollowSuspendUntil = Date.now() + 1800;
}

function handleLyricKeydown(event) {
  if (['ArrowUp', 'ArrowDown', 'PageUp', 'PageDown', 'Home', 'End', ' '].includes(event?.key)) {
    handleLyricInteraction();
  }
}

function handleLyricScroll() {
  const container = getLyricListElement();
  if (!container) return;
  if (Date.now() >= autoFollowSuspendUntil) return;
  autoFollowSuspendUntil = Date.now() + 1800;

  const centerY = container.scrollTop + container.clientHeight / 2;
  const nearestIndex = resolveClosestLyricRowIndex(lyricRowRefs.value, centerY);

  if (nearestIndex >= 0) {
    revealCenterTime(renderedRows.value[nearestIndex]?.time || 0);
  }
}

function collectLyricRows() {
  const container = getLyricListElement();
  if (!container) return;
  lyricRowRefs.value = Array.from(container.querySelectorAll('.lyric-row'));
}

function syncLyricEdgePadding() {
  const container = getLyricListElement();
  const firstRow = lyricRowRefs.value[0];
  const lastRow = lyricRowRefs.value[lyricRowRefs.value.length - 1];
  if (!container || !firstRow || !lastRow) return;

  const topPadding = `${Math.round(resolveLyricEdgePadding(container.clientHeight, firstRow.offsetHeight))}px`;
  const bottomPadding = `${Math.round(resolveLyricEdgePadding(container.clientHeight, lastRow.offsetHeight))}px`;
  if (container.style.getPropertyValue('--lyric-padding-top') !== topPadding) {
    container.style.setProperty('--lyric-padding-top', topPadding);
  }
  if (container.style.getPropertyValue('--lyric-padding-bottom') !== bottomPadding) {
    container.style.setProperty('--lyric-padding-bottom', bottomPadding);
  }
}

function scrollToLyricIndex(index, behavior = 'smooth') {
  const container = getLyricListElement();
  const rowEl = lyricRowRefs.value[index];
  if (!container || !rowEl) return;
  const targetTop = resolveLyricScrollTop({
    rowOffsetTop: rowEl.offsetTop,
    rowHeight: rowEl.offsetHeight,
    containerHeight: container.clientHeight,
    scrollHeight: container.scrollHeight
  });
  if (typeof container.scrollTo === 'function') {
    container.scrollTo({ top: targetTop, behavior });
  } else {
    container.scrollTop = targetTop;
  }
}

function reconnectLyricResizeObserver() {
  if (!lyricResizeObserver) return;
  lyricResizeObserver.disconnect();
  const container = getLyricListElement();
  if (!container) return;
  lyricResizeObserver.observe(container);
  const firstRow = lyricRowRefs.value[0];
  const lastRow = lyricRowRefs.value[lyricRowRefs.value.length - 1];
  if (firstRow) lyricResizeObserver.observe(firstRow);
  if (lastRow && lastRow !== firstRow) lyricResizeObserver.observe(lastRow);
}

function refreshLyricLayout(behavior = 'auto') {
  collectLyricRows();
  syncLyricEdgePadding();
  reconnectLyricResizeObserver();
  if (Date.now() >= autoFollowSuspendUntil && activeScrollIndex.value >= 0) {
    scrollToLyricIndex(activeScrollIndex.value, behavior);
  }
}

function scheduleLyricLayoutRefresh() {
  if (lyricResizeFrame) {
    window.cancelAnimationFrame(lyricResizeFrame);
  }
  lyricResizeFrame = window.requestAnimationFrame(() => {
    lyricResizeFrame = 0;
    syncLyricEdgePadding();
    if (Date.now() >= autoFollowSuspendUntil && activeScrollIndex.value >= 0) {
      scrollToLyricIndex(activeScrollIndex.value, 'auto');
    }
  });
}

function toggleModePanel() {
  modePanelOpen.value = !modePanelOpen.value;
}

watch(
  () => [lyricTimeline.value, lyricMode.value, track.value?.id],
  async () => {
    await nextTick();
    refreshLyricLayout('auto');
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
  () => activeScrollIndex.value,
  async (nextIndex) => {
    if (nextIndex < 0) return;
    if (Date.now() < autoFollowSuspendUntil) return;
    await nextTick();
    syncLyricEdgePadding();
    scrollToLyricIndex(nextIndex, 'smooth');
  }
);

onMounted(async () => {
  if (typeof ResizeObserver === 'function') {
    lyricResizeObserver = new ResizeObserver(scheduleLyricLayoutRefresh);
  }
  await nextTick();
  refreshLyricLayout('auto');
});

onBeforeUnmount(() => {
  if (centerTimeHideTimer) {
    window.clearTimeout(centerTimeHideTimer);
    centerTimeHideTimer = 0;
  }
  if (lyricResizeObserver) {
    lyricResizeObserver.disconnect();
    lyricResizeObserver = null;
  }
  if (lyricResizeFrame) {
    window.cancelAnimationFrame(lyricResizeFrame);
    lyricResizeFrame = 0;
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
  padding: clamp(12px, 1.4vw, 18px);
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
  grid-template-columns: minmax(240px, 0.85fr) minmax(360px, 1.35fr) minmax(64px, 86px);
  gap: clamp(14px, 2vw, 28px);
  overflow: hidden;
}

.vinyl-column {
  display: grid;
  min-width: 0;
  min-height: 0;
}

.vinyl-stage {
  position: relative;
  display: grid;
  place-items: center;
  padding: 10px 0 0;
}

.vinyl-disc {
  width: clamp(190px, min(25vw, 44vh), 360px);
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
  min-height: 0;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  gap: 14px;
  padding-left: clamp(0px, 1.8vw, 28px);
}

.track-meta h1 {
  margin: 0;
  font-size: clamp(28px, 3vw, 52px);
  color: rgba(246, 249, 255, 0.97);
  line-height: 1.08;
  letter-spacing: 0.01em;
  overflow-wrap: anywhere;
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

.meta-actions {
  margin-top: 12px;
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
}

.meta-collect-btn {
  border: 1px solid rgba(255, 255, 255, 0.18);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(236, 244, 255, 0.96);
  padding: 8px 14px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  font-size: 13px;
}

.meta-collect-btn:hover {
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
}

.lyric-scroll-shell {
  position: relative;
  border: 0;
  border-radius: 0;
  background: transparent;
  min-height: 0;
  overflow: hidden;
  isolation: isolate;
}

.lyric-center-guide {
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  height: 1px;
  transform: translateY(-0.5px);
  background: linear-gradient(90deg, transparent, rgba(var(--accent-rgb), 0.24) 22%, rgba(255, 255, 255, 0.18) 50%, rgba(var(--accent-rgb), 0.24) 78%, transparent);
  box-shadow: 0 0 24px rgba(var(--accent-rgb), 0.16);
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
  box-sizing: border-box;
  padding: var(--lyric-padding-top, 120px) clamp(18px, 3vw, 42px) var(--lyric-padding-bottom, 120px);
  display: grid;
  grid-auto-rows: max-content;
  align-content: start;
  gap: clamp(1px, 0.45vh, 5px);
  scrollbar-gutter: stable;
  overflow-anchor: none;
  -webkit-mask-image: linear-gradient(to bottom, transparent 0, #000 10%, #000 90%, transparent 100%);
  mask-image: linear-gradient(to bottom, transparent 0, #000 10%, #000 90%, transparent 100%);
  outline: none;
}

.music-player-detail-view .lyric-scroll .lyric-row {
  width: 100%;
  min-width: 0;
  min-height: 0;
  border: 0 !important;
  border-radius: 0;
  background: transparent !important;
  box-shadow: none !important;
  color: rgba(188, 199, 220, 0.88) !important;
  text-align: center;
  padding: clamp(5px, 0.8vh, 9px) 4px;
  display: grid;
  align-content: center;
  justify-items: center;
  opacity: 0.54;
  cursor: pointer;
  transition:
    opacity 260ms ease,
    color 260ms ease,
    text-shadow 260ms ease;
}
.lyric-row .line-main,
.lyric-row .line-sub {
  max-width: 100%;
  margin: 0;
  line-height: 1.42;
  overflow-wrap: anywhere;
}

.lyric-row .line-main {
  font-size: clamp(20px, 1.85vw, 27px);
  font-weight: 560;
}

.lyric-row .line-sub {
  margin-top: 2px;
  font-size: clamp(13px, 1.18vw, 17px);
  color: rgba(178, 190, 214, 0.78);
  font-weight: 450;
}

.music-player-detail-view .lyric-scroll .lyric-row:hover {
  border-color: transparent !important;
  background: transparent !important;
  box-shadow: none !important;
  color: rgba(225, 232, 245, 0.94) !important;
  opacity: 0.82;
}

.music-player-detail-view .lyric-scroll .lyric-row.active {
  border-color: transparent !important;
  color: rgba(248, 251, 255, 0.99) !important;
  opacity: 1;
  text-shadow: 0 0 18px rgba(var(--accent-rgb), 0.22);
  background: transparent !important;
  box-shadow: none !important;
}

.lyric-row.active .line-main {
  font-weight: 700;
}

.lyric-row.active .line-sub {
  color: rgba(225, 233, 248, 0.92);
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
    grid-template-columns: minmax(220px, 0.72fr) minmax(0, 1.28fr) 70px;
    gap: 14px;
  }

  .content-column {
    padding-left: 0;
  }

  .track-meta h1 {
    font-size: clamp(24px, 3vw, 40px);
  }

  .lyric-row .line-main {
    font-size: clamp(19px, 2.2vw, 25px);
  }

  .lyric-row .line-sub {
    font-size: clamp(13px, 1.55vw, 17px);
  }
}

@media (max-width: 980px) {
  .detail-layout {
    grid-template-columns: minmax(170px, 0.62fr) minmax(0, 1.38fr);
    grid-template-rows: minmax(0, 1fr) auto;
    overflow: hidden;
  }

  .vinyl-column {
    grid-column: 1;
    grid-row: 1;
  }

  .content-column {
    grid-column: 2;
    grid-row: 1;
  }

  .vinyl-stage {
    padding: 0;
    align-content: start;
  }

  .vinyl-disc {
    width: clamp(150px, min(28vw, 36vh), 250px);
  }

  .side-column {
    grid-column: 1 / -1;
    grid-row: 2;
    display: flex;
    align-items: center;
    justify-content: center;
    gap: 10px;
    padding-top: 0;
  }

  .lyric-mode-stack {
    padding: 6px 8px;
    grid-auto-flow: column;
  }

  .lyric-scroll {
    min-height: 0;
    max-height: none;
  }

  .footer-row {
    flex-direction: column;
    align-items: stretch;
  }

  .volume-row {
    width: 100%;
  }
}

@media (max-width: 720px) {
  .music-player-detail-view {
    gap: 10px;
  }

  .detail-head p {
    font-size: 13px;
  }

  .detail-layout {
    grid-template-columns: minmax(0, 1fr);
    grid-template-rows: auto minmax(0, 1fr) auto;
    gap: 10px;
  }

  .vinyl-column {
    grid-column: 1;
    grid-row: 1;
  }

  .vinyl-stage {
    padding: 0;
  }

  .vinyl-disc {
    width: clamp(92px, 24vw, 126px);
  }

  .content-column {
    grid-column: 1;
    grid-row: 2;
    gap: 8px;
  }

  .track-meta {
    text-align: center;
  }

  .track-meta h1 {
    font-size: clamp(21px, 6vw, 28px);
  }

  .track-meta .sub,
  .track-meta .album {
    margin-top: 3px;
  }

  .meta-actions {
    margin-top: 8px;
    justify-content: center;
  }

  .meta-collect-btn {
    padding: 6px 11px;
  }

  .lyric-row {
    min-height: 0;
    padding: 5px 3px;
  }

  .lyric-row .line-main {
    font-size: clamp(18px, 5vw, 23px);
  }

  .lyric-row .line-sub {
    font-size: clamp(12px, 3.6vw, 16px);
  }

  .center-time-pill {
    right: 8px;
  }

  .side-column {
    grid-column: 1;
    grid-row: 3;
    justify-content: flex-start;
    overflow-x: auto;
  }
}

@media (max-width: 520px) {
  .vinyl-column {
    display: none;
  }

  .detail-layout {
    grid-template-rows: minmax(0, 1fr) auto;
  }

  .content-column {
    grid-row: 1;
  }

  .side-column {
    grid-row: 2;
  }

  .detail-head p,
  .track-meta .album {
    display: none;
  }
}

@media (max-height: 680px) and (min-width: 721px) {
  .vinyl-disc {
    width: clamp(150px, min(22vw, 34vh), 230px);
  }

  .track-meta h1 {
    font-size: clamp(22px, 2.6vw, 34px);
  }

  .meta-actions {
    margin-top: 8px;
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
