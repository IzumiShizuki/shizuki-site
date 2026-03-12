<template>
  <canvas ref="canvasRef" class="scene-effect-layer" :style="{ opacity: `${renderState.opacity}` }" aria-hidden="true"></canvas>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import {
  computeSceneEffectParticleCount,
  computeSceneEffectState,
  createSceneEffectParticles,
  stepSceneEffectParticles
} from '../utils/sceneEffectEngine';

const props = defineProps({
  effect: {
    type: Object,
    default: () => ({})
  },
  isHomeRoute: {
    type: Boolean,
    default: true
  },
  reducedMotion: {
    type: Boolean,
    default: false
  }
});

const canvasRef = ref(null);
const renderState = computed(() =>
  computeSceneEffectState(props.effect, {
    reducedMotion: props.reducedMotion,
    isHomeRoute: props.isHomeRoute
  })
);

let context2d = null;
let particles = [];
let rafId = 0;
let lastFrameAt = 0;
let pageVisible = typeof document === 'undefined' ? true : !document.hidden;

function resizeCanvas() {
  const canvas = canvasRef.value;
  if (!canvas) return;
  const dpr = typeof window === 'undefined' ? 1 : Math.max(1, window.devicePixelRatio || 1);
  const width = Math.max(1, Math.floor(window.innerWidth || document.documentElement.clientWidth || 1));
  const height = Math.max(1, Math.floor(window.innerHeight || document.documentElement.clientHeight || 1));
  canvas.width = Math.floor(width * dpr);
  canvas.height = Math.floor(height * dpr);
  canvas.style.width = `${width}px`;
  canvas.style.height = `${height}px`;
  context2d = canvas.getContext('2d');
  if (context2d) {
    context2d.setTransform(dpr, 0, 0, dpr, 0, 0);
  }
}

function rebuildParticles() {
  if (!canvasRef.value) return;
  const count = computeSceneEffectParticleCount(renderState.value);
  particles = createSceneEffectParticles(
    renderState.value.presetId,
    Number(canvasRef.value.style.width.replace('px', '')) || window.innerWidth || 1,
    Number(canvasRef.value.style.height.replace('px', '')) || window.innerHeight || 1,
    count
  );
}

function clearCanvas() {
  if (!context2d || !canvasRef.value) return;
  context2d.clearRect(0, 0, canvasRef.value.width, canvasRef.value.height);
}

function drawParticle(ctx, presetId, particle, opacity) {
  ctx.save();
  ctx.globalAlpha = Math.max(0.04, particle.alpha * opacity);
  ctx.translate(particle.x, particle.y);
  ctx.rotate(particle.rotation);

  if (presetId === 'soft-rain') {
    ctx.strokeStyle = 'rgba(208, 226, 255, 0.9)';
    ctx.lineWidth = 1;
    ctx.beginPath();
    ctx.moveTo(0, 0);
    ctx.lineTo(0, particle.size * 2.4);
    ctx.stroke();
    ctx.restore();
    return;
  }

  if (presetId === 'snow') {
    ctx.fillStyle = 'rgba(240, 247, 255, 0.92)';
    ctx.beginPath();
    ctx.arc(0, 0, Math.max(1, particle.size * 0.22), 0, Math.PI * 2);
    ctx.fill();
    ctx.restore();
    return;
  }

  if (presetId === 'fireflies') {
    const radius = Math.max(1.2, particle.size);
    const glow = ctx.createRadialGradient(0, 0, 0, 0, 0, radius * 2.8);
    glow.addColorStop(0, 'rgba(255, 235, 152, 0.96)');
    glow.addColorStop(0.32, 'rgba(255, 220, 122, 0.68)');
    glow.addColorStop(1, 'rgba(255, 220, 122, 0)');
    ctx.fillStyle = glow;
    ctx.beginPath();
    ctx.arc(0, 0, radius * 2.8, 0, Math.PI * 2);
    ctx.fill();
    ctx.restore();
    return;
  }

  ctx.fillStyle = 'rgba(255, 219, 233, 0.92)';
  ctx.beginPath();
  ctx.ellipse(0, 0, particle.size * 0.36, particle.size * 0.22, 0.7, 0, Math.PI * 2);
  ctx.fill();
  ctx.restore();
}

function animate(timestamp) {
  rafId = 0;
  if (!renderState.value.enabled || !pageVisible) {
    clearCanvas();
    return;
  }

  if (!context2d || !canvasRef.value) {
    rafId = window.requestAnimationFrame(animate);
    return;
  }

  const width = Number(canvasRef.value.style.width.replace('px', '')) || window.innerWidth || 1;
  const height = Number(canvasRef.value.style.height.replace('px', '')) || window.innerHeight || 1;
  const dt = lastFrameAt ? Math.min(48, timestamp - lastFrameAt) : 16;
  lastFrameAt = timestamp;

  particles = stepSceneEffectParticles(renderState.value.presetId, particles, dt, width, height);
  clearCanvas();
  particles.forEach((particle) => drawParticle(context2d, renderState.value.presetId, particle, renderState.value.opacity));
  rafId = window.requestAnimationFrame(animate);
}

function ensureAnimation() {
  if (typeof window === 'undefined') return;
  if (rafId) return;
  rafId = window.requestAnimationFrame(animate);
}

function handleVisibilityChange() {
  pageVisible = typeof document === 'undefined' ? true : !document.hidden;
  if (!pageVisible) {
    clearCanvas();
    return;
  }
  ensureAnimation();
}

watch(
  renderState,
  () => {
    resizeCanvas();
    rebuildParticles();
    clearCanvas();
    ensureAnimation();
  },
  { deep: true, immediate: true }
);

onMounted(() => {
  if (typeof window === 'undefined') return;
  resizeCanvas();
  rebuildParticles();
  ensureAnimation();
  window.addEventListener('resize', resizeCanvas, { passive: true });
  document.addEventListener('visibilitychange', handleVisibilityChange);
});

onBeforeUnmount(() => {
  if (typeof window === 'undefined') return;
  if (rafId) {
    window.cancelAnimationFrame(rafId);
    rafId = 0;
  }
  window.removeEventListener('resize', resizeCanvas);
  document.removeEventListener('visibilitychange', handleVisibilityChange);
});
</script>

<style scoped>
.scene-effect-layer {
  position: fixed;
  inset: 0;
  z-index: 12;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 220ms ease;
}
</style>
