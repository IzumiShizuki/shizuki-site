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
    count,
    renderState.value
  );
}

function clearCanvas() {
  if (!context2d || !canvasRef.value) return;
  context2d.clearRect(0, 0, canvasRef.value.width, canvasRef.value.height);
}

const LEAF_COLORS = [
  ['rgba(233, 178, 108, 0.95)', 'rgba(196, 116, 62, 0.92)'],
  ['rgba(224, 146, 84, 0.95)', 'rgba(168, 88, 50, 0.92)'],
  ['rgba(210, 120, 78, 0.94)', 'rgba(150, 70, 52, 0.9)'],
  ['rgba(226, 186, 96, 0.94)', 'rgba(178, 128, 58, 0.9)']
];

const AURORA_COLORS = [
  [128, 246, 200],
  [96, 198, 255],
  [178, 140, 255]
];

function particleColorIndex(particle, length) {
  const raw = String(particle.id || '');
  let hash = 0;
  for (let i = 0; i < raw.length; i += 1) {
    hash = (hash * 31 + raw.charCodeAt(i)) % 997;
  }
  return hash % length;
}

function drawStar(ctx, particle) {
  const radius = Math.max(0.5, particle.size);
  ctx.globalCompositeOperation = 'lighter';
  const glow = ctx.createRadialGradient(0, 0, 0, 0, 0, radius * 3);
  glow.addColorStop(0, 'rgba(255, 255, 255, 0.95)');
  glow.addColorStop(0.4, 'rgba(214, 230, 255, 0.5)');
  glow.addColorStop(1, 'rgba(214, 230, 255, 0)');
  ctx.fillStyle = glow;
  ctx.beginPath();
  ctx.arc(0, 0, radius * 3, 0, Math.PI * 2);
  ctx.fill();
  if (particle.variant === 'bright-star') {
    ctx.strokeStyle = 'rgba(236, 244, 255, 0.6)';
    ctx.lineWidth = 0.8;
    const ray = radius * 4.4;
    ctx.beginPath();
    ctx.moveTo(-ray, 0);
    ctx.lineTo(ray, 0);
    ctx.moveTo(0, -ray);
    ctx.lineTo(0, ray);
    ctx.stroke();
  }
}

function drawParticle(ctx, presetId, particle, opacity) {
  ctx.save();
  ctx.globalAlpha = Math.max(0.04, particle.alpha * opacity);
  ctx.translate(particle.x, particle.y);

  if (presetId === 'starfield' || (presetId === 'meteor' && particle.variant !== 'meteor')) {
    drawStar(ctx, particle);
    ctx.restore();
    return;
  }

  if (presetId === 'meteor') {
    ctx.globalCompositeOperation = 'lighter';
    const speed = Math.hypot(particle.speedX || 1, particle.speedY || 1) || 1;
    const ux = (particle.speedX || 0.6) / speed;
    const uy = (particle.speedY || 0.8) / speed;
    const tail = Math.max(30, particle.size);
    const gradient = ctx.createLinearGradient(0, 0, -ux * tail, -uy * tail);
    gradient.addColorStop(0, 'rgba(255, 255, 255, 0.95)');
    gradient.addColorStop(0.24, 'rgba(198, 220, 255, 0.55)');
    gradient.addColorStop(1, 'rgba(198, 220, 255, 0)');
    ctx.strokeStyle = gradient;
    ctx.lineWidth = 1.7;
    ctx.lineCap = 'round';
    ctx.beginPath();
    ctx.moveTo(0, 0);
    ctx.lineTo(-ux * tail, -uy * tail);
    ctx.stroke();
    const head = ctx.createRadialGradient(0, 0, 0, 0, 0, 5);
    head.addColorStop(0, 'rgba(255, 255, 255, 0.95)');
    head.addColorStop(1, 'rgba(255, 255, 255, 0)');
    ctx.fillStyle = head;
    ctx.beginPath();
    ctx.arc(0, 0, 5, 0, Math.PI * 2);
    ctx.fill();
    ctx.restore();
    return;
  }

  if (presetId === 'bubbles') {
    const radius = Math.max(1.4, particle.size);
    const body = ctx.createRadialGradient(-radius * 0.3, -radius * 0.34, radius * 0.1, 0, 0, radius);
    body.addColorStop(0, 'rgba(255, 255, 255, 0.34)');
    body.addColorStop(0.62, 'rgba(214, 240, 255, 0.08)');
    body.addColorStop(1, 'rgba(214, 240, 255, 0.02)');
    ctx.fillStyle = body;
    ctx.beginPath();
    ctx.arc(0, 0, radius, 0, Math.PI * 2);
    ctx.fill();
    ctx.strokeStyle = 'rgba(224, 244, 255, 0.7)';
    ctx.lineWidth = 1;
    ctx.stroke();
    ctx.fillStyle = 'rgba(255, 255, 255, 0.82)';
    ctx.beginPath();
    ctx.arc(-radius * 0.38, -radius * 0.42, Math.max(0.6, radius * 0.16), 0, Math.PI * 2);
    ctx.fill();
    ctx.restore();
    return;
  }

  if (presetId === 'dust') {
    ctx.globalCompositeOperation = 'lighter';
    const radius = Math.max(0.8, particle.size);
    const glow = ctx.createRadialGradient(0, 0, 0, 0, 0, radius * 2.6);
    glow.addColorStop(0, 'rgba(255, 244, 214, 0.85)');
    glow.addColorStop(0.5, 'rgba(255, 238, 200, 0.28)');
    glow.addColorStop(1, 'rgba(255, 238, 200, 0)');
    ctx.fillStyle = glow;
    ctx.beginPath();
    ctx.arc(0, 0, radius * 2.6, 0, Math.PI * 2);
    ctx.fill();
    ctx.restore();
    return;
  }

  if (presetId === 'aurora') {
    ctx.globalCompositeOperation = 'lighter';
    ctx.rotate(particle.rotation * 0.5);
    const [cr, cg, cb] = AURORA_COLORS[particleColorIndex(particle, AURORA_COLORS.length)];
    const bandWidth = Math.max(60, particle.size);
    const bandHeight = bandWidth * 2.3;
    const gradient = ctx.createLinearGradient(0, -bandHeight * 0.16, 0, bandHeight);
    gradient.addColorStop(0, `rgba(${cr}, ${cg}, ${cb}, 0.5)`);
    gradient.addColorStop(0.42, `rgba(${cr}, ${cg}, ${cb}, 0.16)`);
    gradient.addColorStop(1, `rgba(${cr}, ${cg}, ${cb}, 0)`);
    ctx.fillStyle = gradient;
    ctx.beginPath();
    ctx.ellipse(0, bandHeight * 0.34, bandWidth * 0.5, bandHeight * 0.52, 0, 0, Math.PI * 2);
    ctx.fill();
    ctx.restore();
    return;
  }

  ctx.rotate(particle.rotation);

  if (presetId === 'leaves') {
    const size = Math.max(4, particle.size);
    const [light, dark] = LEAF_COLORS[particleColorIndex(particle, LEAF_COLORS.length)];
    const fill = ctx.createLinearGradient(0, -size * 0.5, 0, size * 0.5);
    fill.addColorStop(0, light);
    fill.addColorStop(1, dark);
    ctx.fillStyle = fill;
    ctx.beginPath();
    ctx.moveTo(0, -size * 0.5);
    ctx.quadraticCurveTo(size * 0.46, -size * 0.1, 0, size * 0.5);
    ctx.quadraticCurveTo(-size * 0.46, -size * 0.1, 0, -size * 0.5);
    ctx.fill();
    ctx.strokeStyle = 'rgba(120, 66, 40, 0.4)';
    ctx.lineWidth = 0.7;
    ctx.beginPath();
    ctx.moveTo(0, -size * 0.42);
    ctx.lineTo(0, size * 0.46);
    ctx.stroke();
    ctx.restore();
    return;
  }

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

  particles = stepSceneEffectParticles(renderState.value.presetId, particles, dt, width, height, renderState.value);
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
