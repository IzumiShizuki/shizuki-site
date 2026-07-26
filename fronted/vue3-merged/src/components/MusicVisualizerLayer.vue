<template>
  <div ref="hostRef" class="music-visualizer-layer" :class="`variant-${variant}`" aria-hidden="true">
    <canvas ref="canvasRef"></canvas>
  </div>
</template>

<script setup>
import { onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useAudioAnalyserBus } from '../composables/audioAnalyserBus';
import { createIdlePulse, createSpectrumProcessor, downsampleWaveform } from '../utils/visualizerSpectrum';
import { createVisualizerPainter } from '../utils/visualizerPainters';

const props = defineProps({
  /** bars = 底部频谱条 | ring = 中央圆环 | vinyl = 唱片光环 */
  variant: { type: String, default: 'bars' },
  /** bars/ring 模式下的风格 key(bars-neon / ring-halo 等) */
  styleKey: { type: String, default: 'bars-neon' },
  /** 是否应当活跃(通常 = 正在播放 且 路由/guard 允许) */
  active: { type: Boolean, default: false },
  /** vinyl 变体:内圈(唱片)直径 / 画布短边 */
  innerRatio: { type: Number, default: 0.625 }
});

const BAND_COUNT = 64;
const WAVE_POINTS = 160;
const IDLE_AFTER_SILENT_MS = 1300;
const MAX_DPR = 2;
const COLOR_REFRESH_MS = 1200;

const DEFAULT_COLORS = {
  accent: [136, 156, 255],
  accentSoft: [178, 194, 255],
  accentStrong: [104, 120, 240]
};

const hostRef = ref(null);
const canvasRef = ref(null);
const analyserBus = useAudioAnalyserBus();

let ctx = null;
let rafId = 0;
let renderMode = 'off'; // 'live' | 'decay' | 'off'
let lastFrameAt = 0;
let hiddenPaused = false;
let reducedMotion = false;
let reducedMotionQuery = null;
let resizeObserver = null;
let cssWidth = 0;
let cssHeight = 0;

let painter = null;
let painterKey = '';
let processor = null;
let processorFftSize = 0;
let freqBytes = null;
let timeBytes = null;
let waveBuffer = new Float32Array(WAVE_POINTS);
let idlePulse = createIdlePulse(BAND_COUNT, { amplitude: 0.24 });
let idleLevels = new Float32Array(BAND_COUNT);
const idleFrame = {
  levels: idleLevels,
  peaks: idleLevels,
  energy: { bass: 0.08, mid: 0.08, treble: 0.06, overall: 0.08 },
  beat: { hit: false, strength: 0 },
  silent: true,
  silentMs: Infinity
};

let colors = DEFAULT_COLORS;
let lastColorReadAt = 0;

function parseRgbVariable(rawValue, fallback) {
  const parts = String(rawValue || '')
    .split(/[\s,]+/)
    .map((piece) => Number.parseFloat(piece))
    .filter((num) => Number.isFinite(num));
  if (parts.length < 3) return fallback;
  return parts.slice(0, 3).map((num) => Math.max(0, Math.min(255, Math.round(num))));
}

function refreshColors(timeMs) {
  if (timeMs - lastColorReadAt < COLOR_REFRESH_MS) return;
  lastColorReadAt = timeMs;
  if (typeof window === 'undefined' || !document?.documentElement) return;
  const styles = window.getComputedStyle(document.documentElement);
  colors = {
    accent: parseRgbVariable(styles.getPropertyValue('--accent-rgb'), DEFAULT_COLORS.accent),
    accentSoft: parseRgbVariable(styles.getPropertyValue('--accent-soft-rgb'), DEFAULT_COLORS.accentSoft),
    accentStrong: parseRgbVariable(styles.getPropertyValue('--accent-strong-rgb'), DEFAULT_COLORS.accentStrong)
  };
}

function resolvePainterKey() {
  if (props.variant === 'vinyl') return 'vinyl';
  return props.styleKey || (props.variant === 'ring' ? 'ring-halo' : 'bars-neon');
}

function ensurePainter() {
  const key = resolvePainterKey();
  if (!painter || painterKey !== key) {
    painterKey = key;
    painter = createVisualizerPainter(key);
  }
}

function ensureProcessor() {
  const analyser = analyserBus?.getAnalyser?.() || null;
  if (!analyser) return null;
  if (!processor || processorFftSize !== analyser.fftSize) {
    processorFftSize = analyser.fftSize;
    processor = createSpectrumProcessor({
      bandCount: BAND_COUNT,
      fftSize: analyser.fftSize,
      sampleRate: analyser.context?.sampleRate || 48000
    });
    freqBytes = new Uint8Array(analyser.frequencyBinCount);
    timeBytes = new Uint8Array(analyser.fftSize);
  }
  return analyser;
}

function syncCanvasSize() {
  const host = hostRef.value;
  const canvas = canvasRef.value;
  if (!host || !canvas) return;
  const rect = host.getBoundingClientRect();
  const dpr = Math.min(MAX_DPR, window.devicePixelRatio || 1);
  const nextWidth = Math.max(1, Math.round(rect.width));
  const nextHeight = Math.max(1, Math.round(rect.height));
  if (nextWidth === cssWidth && nextHeight === cssHeight && canvas.width === Math.round(nextWidth * dpr)) return;
  cssWidth = nextWidth;
  cssHeight = nextHeight;
  canvas.width = Math.round(nextWidth * dpr);
  canvas.height = Math.round(nextHeight * dpr);
  ctx = canvas.getContext('2d');
  if (ctx) ctx.setTransform(dpr, 0, 0, dpr, 0, 0);
}

function clearCanvas() {
  if (ctx && cssWidth && cssHeight) {
    ctx.clearRect(0, 0, cssWidth, cssHeight);
  }
}

function stopLoop() {
  if (rafId) {
    window.cancelAnimationFrame(rafId);
    rafId = 0;
  }
  lastFrameAt = 0;
}

function scheduleFrame() {
  if (!rafId) {
    rafId = window.requestAnimationFrame(renderFrame);
  }
}

function renderFrame(timestamp) {
  rafId = 0;
  if (renderMode === 'off' || hiddenPaused) return;
  if (!ctx) syncCanvasSize();
  if (!ctx) return;

  const dtMs = lastFrameAt > 0 ? timestamp - lastFrameAt : 16.7;
  lastFrameAt = timestamp;
  refreshColors(timestamp);

  const needsWave = props.variant !== 'bars';
  let frameToDraw = null;
  let wave = null;
  let quiet = false;

  if (renderMode === 'live') {
    const analyser = ensureProcessor();
    if (analyser && processor) {
      analyser.getByteFrequencyData(freqBytes);
      const frame = processor.update(freqBytes, dtMs);
      if (frame.silentMs >= IDLE_AFTER_SILENT_MS) {
        // 播放中但拿不到频谱(如跨域音频被 CORS 静音):用待机脉冲兜底。
        idlePulse.sample(idleLevels, timestamp);
        frameToDraw = idleFrame;
        quiet = true;
      } else {
        frameToDraw = frame;
        if (needsWave) {
          analyser.getByteTimeDomainData(timeBytes);
          wave = downsampleWaveform(timeBytes, WAVE_POINTS, waveBuffer);
        }
      }
    } else {
      // 无法建立分析链路(缺少 AudioContext 等):仍给出待机动画。
      idlePulse.sample(idleLevels, timestamp);
      frameToDraw = idleFrame;
      quiet = true;
    }
  } else if (renderMode === 'decay') {
    if (processor) {
      const stillVisible = processor.decay(dtMs);
      frameToDraw = processor.frame;
      if (!stillVisible) {
        renderMode = 'off';
        stopLoop();
        clearCanvas();
        return;
      }
    } else {
      renderMode = 'off';
      stopLoop();
      clearCanvas();
      return;
    }
  }

  if (!frameToDraw) {
    renderMode = 'off';
    stopLoop();
    return;
  }

  ensurePainter();
  clearCanvas();
  painter.paint(ctx, frameToDraw, {
    width: cssWidth,
    height: cssHeight,
    timeMs: timestamp,
    dtMs,
    colors,
    wave,
    reducedMotion,
    quiet,
    innerRatio: props.innerRatio
  });

  scheduleFrame();
}

function startLive() {
  renderMode = 'live';
  if (analyserBus?.ensure) {
    try {
      analyserBus.ensure();
    } catch {
      /* 忽略:无分析链路时走待机动画 */
    }
  }
  syncCanvasSize();
  lastFrameAt = 0;
  if (!hiddenPaused) scheduleFrame();
}

function beginDecay() {
  if (renderMode !== 'live') return;
  renderMode = 'decay';
  if (!hiddenPaused) scheduleFrame();
}

function handleVisibilityChange() {
  hiddenPaused = typeof document !== 'undefined' && document.hidden;
  if (hiddenPaused) {
    stopLoop();
  } else if (renderMode !== 'off') {
    lastFrameAt = 0;
    scheduleFrame();
  }
}

function handleReducedMotionChange(event) {
  reducedMotion = event?.matches === true;
}

watch(
  () => props.active,
  (nextActive) => {
    if (typeof window === 'undefined') return;
    if (nextActive) {
      startLive();
    } else {
      beginDecay();
    }
  },
  { immediate: false }
);

watch(
  () => [props.variant, props.styleKey],
  () => {
    ensurePainter();
    painter?.reset?.();
    processor?.reset?.();
    if (renderMode === 'off') clearCanvas();
  }
);

onMounted(() => {
  hiddenPaused = typeof document !== 'undefined' && document.hidden;
  syncCanvasSize();
  if (typeof ResizeObserver === 'function' && hostRef.value) {
    resizeObserver = new ResizeObserver(() => {
      syncCanvasSize();
    });
    resizeObserver.observe(hostRef.value);
  }
  if (typeof window !== 'undefined' && typeof window.matchMedia === 'function') {
    reducedMotionQuery = window.matchMedia('(prefers-reduced-motion: reduce)');
    reducedMotion = reducedMotionQuery.matches === true;
    if (typeof reducedMotionQuery.addEventListener === 'function') {
      reducedMotionQuery.addEventListener('change', handleReducedMotionChange);
    }
  }
  document.addEventListener('visibilitychange', handleVisibilityChange);
  if (props.active) startLive();
});

onBeforeUnmount(() => {
  stopLoop();
  renderMode = 'off';
  document.removeEventListener('visibilitychange', handleVisibilityChange);
  if (reducedMotionQuery && typeof reducedMotionQuery.removeEventListener === 'function') {
    reducedMotionQuery.removeEventListener('change', handleReducedMotionChange);
  }
  reducedMotionQuery = null;
  if (resizeObserver) {
    resizeObserver.disconnect();
    resizeObserver = null;
  }
});
</script>

<style scoped>
.music-visualizer-layer {
  position: relative;
  width: 100%;
  height: 100%;
  pointer-events: none;
}

.music-visualizer-layer canvas {
  display: block;
  width: 100%;
  height: 100%;
}
</style>
