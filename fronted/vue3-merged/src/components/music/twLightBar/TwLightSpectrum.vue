<!--
  Copyright 2025 Px-asen (Pxasen.com)

  Ported from Twilight_Echo (Apache-2.0) — player-bar/CompactPlayerBarVisualizer.vue
  and player-bar/compactPlayerBarVisualizer.ts, adapted for the shizuki-site
  web player bar. Web data source: the site AnalyserNode bus (audioAnalyserBus),
  replacing Twilight_Echo's Electron IPC visualization feed. When no analyser
  chain is available, bands fall back to a CSS idle shimmer.

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<script setup>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useAudioAnalyserBus } from '../../../composables/audioAnalyserBus';

const props = defineProps({
  /** 正在播放时才驱动真实频谱；暂停时落到静音底。 */
  active: { type: Boolean, default: false },
  /** 频带数量（Twilight_Echo 紧凑频谱条风格） */
  bandCount: { type: Number, default: 96 }
});

/** 静音底高度：让条带在暂停时也保留一条隐约的天际线。 */
const FLOOR_LEVEL = 0.07;

const analyserBus = useAudioAnalyserBus();
const hostRef = ref(null);
/** 是否已经拿到站点 AnalyserNode；false 时走 CSS 待机动画。 */
const hasLiveSource = ref(false);

const bandIndexes = computed(() => {
  const count = Math.max(8, Math.trunc(Number(props.bandCount) || 96));
  return Array.from({ length: count }, (_, index) => index);
});

let bandEls = [];
let analyser = null;
let freqBytes = null;
let unitBuffer = null;
let rafId = 0;
let reducedMotion = false;
let reducedMotionQuery = null;

function clampUnit(value) {
  if (!Number.isFinite(value)) return 0;
  return Math.min(1, Math.max(0, value));
}

/**
 * Twilight_Echo compactPlayerBarVisualizer.ts / compactVisualizerBands 移植
 * （仅频谱分支，波形包络在 Web 端省略）：
 * 对线性 FFT bin 做低频密集重采样，保留真实能量而非每帧归一化，
 * 再经邻带软化 + 噪声门 + 自适应增益 + gamma 提亮。
 */
function compactVisualizerBands(spectrum, bandCount) {
  const count = Math.max(2, Math.trunc(bandCount));
  if (!spectrum || spectrum.length === 0) return null;

  const sampled = Array.from({ length: count }, (_, index) => {
    const ratio = index / Math.max(1, count - 1);
    const sourcePosition = Math.pow(ratio, 1.72) * Math.max(0, spectrum.length - 1);
    const left = Math.floor(sourcePosition);
    const right = Math.min(spectrum.length - 1, left + 1);
    const fraction = sourcePosition - left;
    return clampUnit(
      clampUnit(spectrum[left] ?? 0) * (1 - fraction) + clampUnit(spectrum[right] ?? 0) * fraction
    );
  });

  const peak = Math.max(...sampled);
  if (peak < 0.002) return sampled;

  const adaptiveGain = Math.min(2.2, 0.86 / Math.max(0.24, peak));
  return sampled.map((value, index) => {
    const previous = sampled[Math.max(0, index - 1)] ?? value;
    const next = sampled[Math.min(sampled.length - 1, index + 1)] ?? value;
    const softened = previous * 0.16 + value * 0.68 + next * 0.16;
    const gated = Math.max(0, softened - 0.025) * adaptiveGain;
    return clampUnit(Math.pow(gated, 1.42));
  });
}

/** 每根条带的初始行内变量（待机动画的相位/延迟在挂载时一次写入）。 */
function bandStyle(index) {
  const phase = Math.sin(index * 0.62) * 0.5 + 0.5;
  return {
    '--tw-band-level': String(FLOOR_LEVEL),
    '--tw-band-delay': `${(index % 14) * -0.11}s`,
    '--tw-band-phase': phase.toFixed(3)
  };
}

/** 直接写 DOM 变量，避免逐帧触发 Vue 重渲染（96 根条带 × 60fps）。 */
function writeLevels(source) {
  const els = bandEls;
  if (!els.length) return;
  if (!source) {
    for (let i = 0; i < els.length; i += 1) {
      if (els[i]) els[i].style.setProperty('--tw-band-level', String(FLOOR_LEVEL));
    }
    return;
  }
  for (let i = 0; i < els.length; i += 1) {
    const level = Math.max(FLOOR_LEVEL, source[i] ?? 0);
    const el = els[i];
    if (el && el.style.getPropertyValue('--tw-band-level') !== String(level)) {
      el.style.setProperty('--tw-band-level', String(level));
    }
  }
}

function acquireAnalyser() {
  if (analyser) return analyser;
  const next = analyserBus?.getAnalyser?.() || null;
  if (next) {
    analyser = next;
    freqBytes = new Uint8Array(next.frequencyBinCount);
    unitBuffer = new Float32Array(next.frequencyBinCount);
  }
  return analyser;
}

function tick() {
  rafId = window.requestAnimationFrame(tick);
  if (typeof document !== 'undefined' && document.hidden) return;
  if (!props.active) {
    if (hasLiveSource.value) hasLiveSource.value = false;
    writeLevels(null);
    return;
  }
  const node = acquireAnalyser();
  if (!node) {
    if (hasLiveSource.value) hasLiveSource.value = false;
    writeLevels(null);
    return;
  }
  node.getByteFrequencyData(freqBytes);
  const length = freqBytes.length;
  for (let i = 0; i < length; i += 1) unitBuffer[i] = freqBytes[i] / 255;
  const bands = compactVisualizerBands(unitBuffer, bandIndexes.value.length);
  if (!hasLiveSource.value) hasLiveSource.value = true;
  writeLevels(bands);
}

function startLoop() {
  if (rafId || reducedMotion || typeof window === 'undefined') return;
  rafId = window.requestAnimationFrame(tick);
}

function stopLoop() {
  if (rafId) {
    window.cancelAnimationFrame(rafId);
    rafId = 0;
  }
  writeLevels(null);
  hasLiveSource.value = false;
}

function handleReducedMotionChange(event) {
  reducedMotion = event?.matches === true;
  if (reducedMotion) stopLoop();
  else if (props.active) startLoop();
}

watch(
  () => props.active,
  (next) => {
    if (next) startLoop();
    else stopLoop();
  }
);

onMounted(() => {
  bandEls = Array.from(hostRef.value?.querySelectorAll('.tw-spectrum__band') || []);
  if (typeof window !== 'undefined' && typeof window.matchMedia === 'function') {
    reducedMotionQuery = window.matchMedia('(prefers-reduced-motion: reduce)');
    reducedMotion = reducedMotionQuery.matches === true;
    if (typeof reducedMotionQuery.addEventListener === 'function') {
      reducedMotionQuery.addEventListener('change', handleReducedMotionChange);
    }
  }
  if (props.active) startLoop();
});

onBeforeUnmount(() => {
  stopLoop();
  bandEls = [];
  if (reducedMotionQuery && typeof reducedMotionQuery.removeEventListener === 'function') {
    reducedMotionQuery.removeEventListener('change', handleReducedMotionChange);
  }
  reducedMotionQuery = null;
});
</script>

<template>
  <div
    ref="hostRef"
    class="tw-spectrum"
    :class="{ 'is-active': active && hasLiveSource, 'is-idle-fallback': active && !hasLiveSource }"
    :style="{ '--tw-band-count': bandIndexes.length }"
    aria-hidden="true"
  >
    <span
      v-for="item in bandIndexes"
      :key="item"
      class="tw-spectrum__band"
      :style="bandStyle(item)"
    ></span>
  </div>
</template>

<style scoped>
.tw-spectrum {
  width: 100%;
  height: 100%;
  display: grid;
  grid-template-columns: repeat(var(--tw-band-count, 96), minmax(0, 1fr));
  align-items: end;
  gap: clamp(1px, 0.08vw, 2px);
  padding: 0 2px 3px;
  overflow: hidden;
  pointer-events: none;
}

.tw-spectrum__band {
  width: 100%;
  height: 34px;
  min-width: 1px;
  border-radius: 999px;
  background: linear-gradient(
    180deg,
    rgba(var(--accent-soft-rgb, 247, 211, 195), 0.95),
    rgba(var(--accent-rgb, 242, 179, 157), 0.78)
  );
  box-shadow: 0 0 5px rgba(var(--accent-rgb, 242, 179, 157), 0.28);
  opacity: 0.6;
  transform: scaleY(var(--tw-band-level, 0.07));
  transform-origin: 50% 100%;
  transition: transform 55ms linear;
  will-change: transform;
}

.tw-spectrum:not(.is-active) .tw-spectrum__band {
  opacity: 0.26;
}

/* 播放中但没有 AnalyserNode（如音频链尚未建立）：CSS 待机呼吸。 */
.tw-spectrum.is-idle-fallback .tw-spectrum__band {
  animation: tw-spectrum-idle 1.7s ease-in-out infinite;
  animation-delay: var(--tw-band-delay, 0s);
}

@keyframes tw-spectrum-idle {
  0%,
  100% {
    transform: scaleY(0.1);
  }
  50% {
    transform: scaleY(calc(0.26 + var(--tw-band-phase, 0.5) * 0.62));
  }
}

@media (prefers-reduced-motion: reduce) {
  .tw-spectrum__band {
    transition: none;
    animation: none;
    transform: scaleY(0.16);
  }
}
</style>
