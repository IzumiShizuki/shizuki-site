<script setup lang="ts">
import { onMounted, onUnmounted, ref } from 'vue';

interface Particle {
  x: number;
  y: number;
  size: number;
  speedY: number;
  speedX: number;
  opacity: number;
  hue: number;
}

const canvasRef = ref<HTMLCanvasElement | null>(null);
let animationFrameId: number;
let particles: Particle[] = [];
let ctx: CanvasRenderingContext2D | null = null;

const PARTICLE_COUNT = 100;
const MAX_SPEED_Y = 1.5;
const MAX_SPEED_X = 0.5;

function createParticle(): Particle {
  return {
    x: Math.random() * window.innerWidth,
    y: Math.random() * window.innerHeight + window.innerHeight,
    size: Math.random() * 2 + 1,
    speedY: -Math.random() * MAX_SPEED_Y - 0.3,
    speedX: (Math.random() - 0.5) * MAX_SPEED_X,
    opacity: Math.random() * 0.6 + 0.2,
    hue: Math.random() * 60 + 180 // 蓝绿色调
  };
}

function initParticles() {
  particles = [];
  for (let i = 0; i < PARTICLE_COUNT; i++) {
    particles.push(createParticle());
  }
}

function updateParticles() {
  if (!ctx) return;

  particles.forEach((particle, index) => {
    particle.y += particle.speedY;
    particle.x += particle.speedX;

    // 粒子离开屏幕顶部时重置
    if (particle.y < -10) {
      particles[index] = createParticle();
    }

    // 边界检查
    if (particle.x < -10 || particle.x > window.innerWidth + 10) {
      particle.speedX = -particle.speedX;
    }
  });
}

function drawParticles() {
  if (!ctx || !canvasRef.value) return;

  ctx.clearRect(0, 0, canvasRef.value.width, canvasRef.value.height);

  particles.forEach(particle => {
    if (!ctx) return;

    ctx.beginPath();
    ctx.arc(particle.x, particle.y, particle.size, 0, Math.PI * 2);
    ctx.fillStyle = `hsla(${particle.hue}, 70%, 70%, ${particle.opacity})`;
    ctx.fill();

    // 添加发光效果
    ctx.shadowBlur = 10;
    ctx.shadowColor = `hsla(${particle.hue}, 80%, 60%, ${particle.opacity * 0.8})`;
  });

  ctx.shadowBlur = 0;
}

function drawConnections() {
  if (!ctx) return;

  particles.forEach((p1, i) => {
    particles.slice(i + 1).forEach(p2 => {
      const dx = p1.x - p2.x;
      const dy = p1.y - p2.y;
      const distance = Math.sqrt(dx * dx + dy * dy);

      if (distance < 120) {
        const opacity = (1 - distance / 120) * 0.3;
        if (!ctx) return;

        ctx.beginPath();
        ctx.moveTo(p1.x, p1.y);
        ctx.lineTo(p2.x, p2.y);
        ctx.strokeStyle = `rgba(100, 200, 255, ${opacity})`;
        ctx.lineWidth = 0.5;
        ctx.stroke();
      }
    });
  });
}

function animate() {
  updateParticles();
  drawParticles();
  drawConnections();
  animationFrameId = requestAnimationFrame(animate);
}

function handleResize() {
  if (!canvasRef.value) return;

  canvasRef.value.width = window.innerWidth;
  canvasRef.value.height = window.innerHeight;
  initParticles();
}

onMounted(() => {
  if (!canvasRef.value) return;

  ctx = canvasRef.value.getContext('2d');
  if (!ctx) return;

  handleResize();
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
    class="particle-canvas"
    aria-hidden="true"
  />
</template>

<style scoped>
.particle-canvas {
  position: fixed;
  inset: 0;
  pointer-events: none;
  z-index: 0;
  opacity: 0.4;
}

@media (prefers-reduced-motion: reduce) {
  .particle-canvas {
    display: none;
  }
}
</style>
