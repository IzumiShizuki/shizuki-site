<template>
  <section class="music-player-detail-view liquid-material">
    <!-- Twilight_Echo 舞台氛围层：封面模糊 + 深色纱幕 + 主色光斑 -->
    <div class="te-backdrop" aria-hidden="true">
      <div v-if="track?.cover" class="te-backdrop-cover" :style="coverStyle"></div>
      <div class="te-backdrop-scrim"></div>
      <div class="te-backdrop-accent"></div>
    </div>

    <header class="detail-head">
      <button class="back-btn ripple-trigger" type="button" @click="music.exitPlayerDetail">
        <i class="fas fa-chevron-left"></i>
        返回
      </button>
      <p>播放详情</p>
      <button class="folia-mode-btn ripple-trigger" type="button" @click="openFoliaMode">
        <i class="fas fa-ghost"></i>
        Folia 沉浸模式
      </button>
    </header>

    <div class="detail-layout">
      <aside class="cover-column">
        <div class="te-cover-stage">
          <div class="te-cover-frame-wrap">
            <MusicVisualizerLayer
              class="te-cover-aura"
              variant="vinyl"
              :inner-ratio="VINYL_AURA_INNER_RATIO"
              :active="music.player.isPlaying.value"
            />
            <div
              :key="`te-cover:${track?.id || 'empty'}`"
              class="te-cover-frame"
              :style="coverStyle"
            >
              <div v-if="!track?.cover" class="te-cover-placeholder">
                <i class="fas fa-wave-square"></i>
              </div>
              <div class="te-cover-glint" aria-hidden="true"></div>
            </div>
          </div>
          <div class="te-cover-meta">
            <h1 class="te-track-title">{{ track?.title || '暂无播放曲目' }}</h1>
            <p class="te-track-artist">{{ track?.artist || '未知歌手' }}</p>
            <p v-if="albumText" class="te-track-album">{{ albumText }}</p>
          </div>
          <div class="te-spectrum-wrap" aria-hidden="true">
            <MusicVisualizerLayer
              class="te-spectrum-strip"
              variant="bars-crystal"
              :active="music.player.isPlaying.value"
            />
          </div>
        </div>
      </aside>

      <section class="content-column">
        <header class="track-meta">
          <p v-if="previewSummary" class="preview-summary">
            <span>试听</span>
            {{ previewSummary }}
          </p>
          <div class="meta-actions">
            <button class="meta-collect-btn ripple-trigger" type="button" title="收藏到歌单" @click="music.openCollectDialog?.(track)">
              <i class="fas fa-folder-plus"></i>
              收藏到歌单
            </button>
          </div>
        </header>

        <div class="lyric-mode-bar">
          <div class="lyric-mode-left">
            <span class="lyric-mode-label">歌词</span>
            <span class="te-time-chip" aria-label="播放时间">
              {{ formatMediaTime(currentTimeSec) }}<span class="te-time-sep">/</span>{{ formatMediaTime(playableDurationSec || expectedDurationSec) }}
            </span>
          </div>
        </div>

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
              :class="{
                active: index === activeScrollIndex,
                unavailable: isLyricOutsidePlayableRange(row.time)
              }"
              :aria-current="index === activeScrollIndex ? 'true' : undefined"
              :disabled="isLyricOutsidePlayableRange(row.time)"
              :title="lyricRowTitle(row.time)"
              type="button"
              @click="seekToLyricRow(row.time)"
            >
              <p class="line-main">
                <template v-if="row.words && row.words.length">
                  <span
                    v-for="(word, wordIndex) in row.words"
                    :key="`lyric-word-${index}-${wordIndex}`"
                    class="lyric-word"
                    :class="lyricWordClass(index, wordIndex)"
                  >{{ word.text }}</span>
                </template>
                <template v-else>{{ row.main || '...' }}</template>
              </p>
              <p v-if="row.sub" class="line-sub">{{ row.sub }}</p>
            </button>
          </SubtleScrollArea>

          <transition name="lyric-time-fade">
            <button
              v-if="centerTimeVisible"
              class="center-time-pill ripple-trigger"
              type="button"
              :disabled="isLyricOutsidePlayableRange(centerLyricTime)"
              :title="lyricRowTitle(centerLyricTime)"
              @click="seekToCenterLyric"
            >
              <i class="fas fa-play"></i>
              {{ centerTimeText }}
            </button>
          </transition>
        </section>
      </section>

      <aside class="side-column">
        <button
          class="mode-icon-btn ripple-trigger"
          type="button"
          :title="`播放顺序：${playModeLabel}`"
          :aria-label="`播放顺序：${playModeLabel}`"
          @click="cyclePlayMode"
        >
          <span class="play-mode-icon" aria-hidden="true">
            <i class="fas" :class="playModeIcon"></i>
            <span v-if="isSinglePlayMode" class="single-repeat-badge">1</span>
          </span>
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
import MusicVisualizerLayer from '../../components/MusicVisualizerLayer.vue';
import SubtleScrollArea from '../../components/SubtleScrollArea.vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import {
  resolveClosestLyricRowIndex,
  resolveLyricEdgePadding,
  resolveLyricScrollTop
} from '../../utils/lyricAlignment';
import { findActiveWordIndex } from '../../utils/lyricEngine/lyrics';
import { formatMediaTime } from '../../utils/mediaTime';
import { safeCssUrl } from '../../utils/url';

const music = useMusicLibraryContext();

// 封面光环画布为封面尺寸的 136%(CSS 中 inset: -18%),内圈比例与封面短边严格对应。
const VINYL_AURA_INNER_RATIO = 100 / 136;

const track = computed(() => music.player.currentTrack.value);

/** 切换到 Folia 沉浸模式（通知 MusicLibraryPage 切换并携带当前歌曲）。 */
function openFoliaMode() {
  if (typeof window === 'undefined') return;
  window.dispatchEvent(new CustomEvent('shizuki:open-folia-mode', {
    detail: { track: track.value || null }
  }));
}

const lyricMode = computed(() => String(music.player.lyricRenderMode?.value || 'original_translation'));
const lyricTimeline = computed(() => (Array.isArray(music.player.lyricTimeline?.value) ? music.player.lyricTimeline.value : []));
const activeLyricIndex = computed(() => Number(music.player.currentLyricEntryIndex?.value ?? -1));
const currentTimeSec = computed(() => Number(music.player.currentTime?.value || 0));
const playableDurationSec = computed(() => Number(music.player.duration?.value || 0));
const expectedDurationSec = computed(() => Number(music.player.expectedDuration?.value || 0));
const isPreviewPlayback = computed(() => music.player.isPreviewPlayback?.value === true);
const availableLyricModes = computed(() =>
  Array.isArray(music.player.availableLyricModes?.value) && music.player.availableLyricModes.value.length
    ? music.player.availableLyricModes.value
    : ['original']
);
const showLyricModeControls = computed(() => availableLyricModes.value.length > 1);
const isSinglePlayMode = computed(() => String(music.player.playMode?.value || 'sequential') === 'single');
const playModeLabel = computed(() => {
  const raw = String(music.player.playMode?.value || 'sequential');
  if (raw === 'random') return '随机';
  if (raw === 'single') return '单曲循环';
  return '顺序';
});
const playModeIcon = computed(() => {
  const raw = String(music.player.playMode?.value || 'sequential');
  if (raw === 'random') return 'fa-shuffle';
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
const previewSummary = computed(() => {
  if (!isPreviewPlayback.value) return '';
  const playable = playableDurationSec.value;
  const expected = expectedDurationSec.value;
  if (playable > 0 && expected > playable) {
    return `可播放 ${formatMediaTime(playable)}，完整时长 ${formatMediaTime(expected)}`;
  }
  if (playable > 0) return `可播放 ${formatMediaTime(playable)}`;
  return '正在读取可播放时长';
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
      sub,
      words: Array.isArray(item?.words) && item.words.length > 0 ? item.words : null
    };
  });
});

/** Active (currently sung) word index per row, -1 when the row has no word data. */
const activeWordIndexByRow = computed(() => {
  const now = currentTimeSec.value;
  return renderedRows.value.map((row) => {
    if (!Array.isArray(row.words) || row.words.length === 0) return -1;
    return findActiveWordIndex(row.words, now);
  });
});

function lyricWordClass(rowIndex, wordIndex) {
  const activeWordIndex = activeWordIndexByRow.value[rowIndex] ?? -1;
  return {
    // Highlight the current word only on the active line so past lines don't
    // keep a lingering accent on their last word.
    active: activeWordIndex === wordIndex && rowIndex === activeScrollIndex.value,
    past: activeWordIndex >= 0 && wordIndex < activeWordIndex
  };
}

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
  if (isLyricOutsidePlayableRange(target)) return;
  music.player.seekToTime?.(target);
}

function isLyricOutsidePlayableRange(time) {
  const target = Number(time);
  const playable = playableDurationSec.value;
  if (!isPreviewPlayback.value || !Number.isFinite(target)) return false;
  if (!Number.isFinite(playable) || playable <= 0) return true;
  return target > playable + 0.25;
}

function lyricRowTitle(time) {
  if (isPreviewPlayback.value && playableDurationSec.value <= 0) {
    return '试听音频正在读取可跳转范围';
  }
  return isLyricOutsidePlayableRange(time)
    ? `试听音频仅可跳转到 ${formatMediaTime(playableDurationSec.value)}`
    : '点击跳转到这句歌词';
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

<style scoped src="./tePlayingStyle.css"></style>
