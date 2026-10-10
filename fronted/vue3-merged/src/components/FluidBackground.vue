<script setup lang="ts">
import { ref, onMounted, onUnmounted } from 'vue';

const canvasRef = ref<HTMLCanvasElement | null>(null);
let animationFrameId: number | null = null;
let time = 0;

interface Blob {
  x: number;
  y: number;
  radius: number;
  vx: number;
  vy: number;
  hue: number;
}

const blobs: Blob[] = [];
const BLOB_COUNT = 5;

function createBlob(): Blob {
  return {
    x: Math.random() * window.innerWidth,
    y: Math.random() * window.innerHeight,
    radius: Math.random() * 200 + 150,
    vx: (Math.random() - 0.5) * 0.5,
    vy: (Math.random() - 0.5) * 0.5,
    hue: Math.random() * 360
  };
}

function initBlobs() {
  blobs.length = 0;
  for (let i = 0; i < BLOB_COUNT; i++) {
    blobs.push(createBlob());
  }
}

function updateBlobs() {
  blobs.forEach(blob => {
    blob.x += blob.vx;
    blob.y += blob.vy;

    // 边界反弹
    if (blob.x < -blob.radius || blob.x > window.innerWidth + blob.radius) {
      blob.vx = -blob.vx;
    }
    if (blob.y < -blob.radius || blob.y > window.innerHeight + blob.radius) {
      blob.vy = -blob.vy;
    }

    // 色相缓慢变化
    blob.hue = (blob.hue + 0.1) % 360;
  });
}

function drawBlobs() {
  const canvas = canvasRef.value;
  if (!canvas) return;

  const ctx = canvas.getContext('2d');
  if (!ctx) return;

  ctx.clearRect(0, 0, canvas.width, canvas.height);

  blobs.forEach(blob => {
    const gradient = ctx.createRadialGradient(
      blob.x, blob.y, 0,
      blob.x, blob.y, blob.radius
    );

    gradient.addColorStop(0, `hsla(${blob.hue}, 70%, 60%, 0.4)`);
    gradient.addColorStop(0.5, `hsla(${blob.hue}, 70%, 50%, 0.2)`);
    gradient.addColorStop(1, `hsla(${blob.hue}, 70%, 40%, 0)`);

    ctx.fillStyle = gradient;
    ctx.beginPath();
    ctx.arc(blob.x, blob.y, blob.radius, 0, Math.PI * 2);
    ctx.fill();
  });

  // 应用模糊滤镜
  ctx.filter = 'blur(60px)';
}

function animate() {
  time += 0.01;
  updateBlobs();
  drawBlobs();
  animationFrameId = requestAnimationFrame(animate);
}

function handleResize() {
  if (!canvasRef.value) return;
  canvasRef.value.width = window.innerWidth;
  canvasRef.value.height = window.innerHeight;
}

onMounted(() => {
  handleResize();
  initBlobs();
  window.addEventListener('resize', handleResize);
  animate();
});

onUnmounted(() => {
  window.removeEventListener('resize', handleResize);
  if (animationFrameId) {
    cancelAnimationFrame(animationFrameId);
  }
});
</script>

<template>
  <canvas
    ref="canvasRef"
    class="fluid-background-canvas"
    aria-hidden="true"
  />
</template>

<style scoped>
.fluid-background-canvas {
  position: fixed;
  inset: 0;
  pointer-events: none;
  z-index: 0;
  opacity: 0.5;
  mix-blend-mode: screen;
}

@media (prefers-reduced-motion: reduce) {
  .fluid-background-canvas {
    display: none;
  }
}
</style>
