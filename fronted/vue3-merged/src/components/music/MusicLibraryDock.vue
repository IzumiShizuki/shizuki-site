<template>
  <footer ref="rootRef" class="music-library-dock liquid-material" :class="{ 'detail-layout': detailLayout }" @click="handleRootClick">
    <!-- Twilight_Echo 播放栏内嵌频谱条（Web 端数据源：站点 AnalyserNode，见 twLightBar/） -->
    <TwLightSpectrum class="tw-spectrum" :active="isPlaying" />

    <!-- 左侧：封面 + 曲目信息 -->
    <div class="track-block">
      <div class="cover" :style="coverStyle"></div>
      <div class="meta">
        <p class="title">{{ track?.title || '暂无音乐' }}</p>
        <p class="artist">{{ track?.artist || '未知歌手' }}</p>
      </div>
    </div>

    <!-- 中央：走带控制 -->
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

    <!-- 中央下方：进度（真实 DOM 轨道 + 输入覆盖层，--twl-progress 驱动填充） -->
    <div class="dock-progress-row" :style="{ '--twl-progress': progress }" @click.stop>
      <span class="time" :title="progressTitle">
        <span v-if="isPreviewPlayback" class="preview-badge">试听</span>
        {{ playedText }}
      </span>
      <div class="twl-progress-wrap">
        <div class="twl-progress-track" aria-hidden="true">
          <div class="twl-progress-fill"></div>
        </div>
        <input
          class="progress-input"
          type="range"
          min="0"
          max="1000"
          :value="Math.round(progress * 1000)"
          :disabled="!hasPlayableDuration"
          aria-label="歌曲播放进度"
          :aria-valuetext="progressTitle"
          :title="progressTitle"
          @input="onSeek"
        />
      </div>
      <span class="time">{{ durationText }}</span>
    </div>

    <!-- 右侧：播放模式 / 播放列表 / 收藏 / 音量 -->
    <div class="utility-block" @click.stop>
      <button
        class="play-mode-pill ripple-trigger icon-only"
        type="button"
        :title="`播放顺序：${modeLabel}`"
        :aria-label="`播放顺序：${modeLabel}`"
        @click.stop="emit('cycle-mode')"
      >
        <span class="play-mode-icon" aria-hidden="true">
          <i class="fas" :class="modeIconClass"></i>
          <span v-if="playMode === 'single'" class="single-repeat-badge">1</span>
        </span>
      </button>
      <button
        class="mode-btn ripple-trigger"
        :class="{ active: queueOpen }"
        type="button"
        title="播放列表"
        @click="toggleQueue"
      >
        <i class="fas fa-list"></i>
      </button>
      <button class="mode-btn ripple-trigger" type="button" title="收藏到歌单" @click="emit('open-collect-dialog')">
        <i class="fas fa-heart"></i>
      </button>
      <div class="twl-volume">
        <i class="fas fa-volume-low volume-icon"></i>
        <input
          class="volume-input"
          type="range"
          min="0"
          max="100"
          :value="Math.round(volume * 100)"
          :style="{ '--level-percent': `${Math.round(volume * 100)}%` }"
          @input="onVolume"
        />
      </div>
    </div>

    <section v-if="queueOpen" class="dock-queue liquid-material" @click.stop>
      <header class="queue-head">
        <p>播放列表<span v-if="tracks.length" class="twl-queue-count">{{ tracks.length }} 首</span></p>
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
          <span class="twl-queue-line">
            <span class="queue-name">{{ item.title || '未知标题' }}</span>
            <span
              v-if="(item.id || '') === currentTrackId"
              class="playing-bars"
              :class="{ paused: !isPlaying }"
              aria-hidden="true"
            >
              <i></i><i></i><i></i>
            </span>
          </span>
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
import TwLightSpectrum from './twLightBar/TwLightSpectrum.vue';

const props = defineProps({
  track: { type: Object, default: null },
  tracks: { type: Array, default: () => [] },
  currentTrackId: { type: String, default: '' },
  currentTime: { type: Number, default: 0 },
  duration: { type: Number, default: 0 },
  expectedDuration: { type: Number, default: 0 },
  isPreviewPlayback: { type: Boolean, default: false },
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

const hasPlayableDuration = computed(() => Number.isFinite(props.duration) && props.duration > 0);
const playedText = computed(() => formatMediaTime(props.currentTime));
const durationText = computed(() => (hasPlayableDuration.value ? formatMediaTime(props.duration) : '--:--'));
const progressTitle = computed(() => {
  if (!hasPlayableDuration.value) return '等待音频时长信息';
  if (!props.isPreviewPlayback) return `播放进度 ${playedText.value} / ${durationText.value}`;
  const expected = Number(props.expectedDuration);
  const fullText = Number.isFinite(expected) && expected > props.duration
    ? `，完整时长 ${formatMediaTime(expected)}`
    : '';
  return `试听音频，可播放 ${durationText.value}${fullText}`;
});

const modeLabel = computed(() => {
  if (props.playMode === 'random') return '随机';
  if (props.playMode === 'single') return '单曲';
  return '顺序';
});
const modeIconClass = computed(() => {
  if (props.playMode === 'random') return 'fa-shuffle';
  return 'fa-repeat';
});

function onSeek(event) {
  if (!hasPlayableDuration.value) return;
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

<!--
  视觉层样式自 Twilight_Echo（Apache-2.0，Px-asen）PlayerBar.css 移植，
  适配站点主题令牌；数据/逻辑绑定保持不变。详见 twLightBar/twLightPlayerBar.css。
-->
<style scoped src="./twLightBar/twLightPlayerBar.css"></style>
