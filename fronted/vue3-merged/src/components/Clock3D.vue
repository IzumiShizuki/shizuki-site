<script setup lang="ts">
import { ref, onMounted, onUnmounted } from 'vue';

const clockRef = ref<HTMLElement | null>(null);
let tiltX = 0;
let tiltY = 0;
let animationFrameId: number | null = null;

const props = defineProps<{
  time: string;
  seconds: string;
}>();

function handleMouseMove(e: MouseEvent) {
  if (!clockRef.value) return;

  const rect = clockRef.value.getBoundingClientRect();
  const centerX = rect.left + rect.width / 2;
  const centerY = rect.top + rect.height / 2;

  const deltaX = (e.clientX - centerX) / (rect.width / 2);
  const deltaY = (e.clientY - centerY) / (rect.height / 2);

  tiltX = -deltaY * 15; // 反向Y轴
  tiltY = deltaX * 15;
}

function handleMouseLeave() {
  tiltX = 0;
  tiltY = 0;
}

function animate() {
  if (clockRef.value) {
    clockRef.value.style.transform = `
      perspective(1000px)
      rotateX(${tiltX}deg)
      rotateY(${tiltY}deg)
      translateZ(20px)
    `;
  }
  animationFrameId = requestAnimationFrame(animate);
}

onMounted(() => {
  animate();
  window.addEventListener('mousemove', handleMouseMove);
});

onUnmounted(() => {
  if (animationFrameId) {
    cancelAnimationFrame(animationFrameId);
  }
  window.removeEventListener('mousemove', handleMouseMove);
});
</script>

<template>
  <div
    ref="clockRef"
    class="clock-3d-container"
    @mouseleave="handleMouseLeave"
  >
    <div class="clock-glow-ring"></div>
    <div class="clock-3d-time">
      <span class="time-digits">{{ time }}</span>
      <span class="time-seconds">{{ seconds }}</span>
    </div>
    <div class="clock-shine"></div>
  </div>
</template>

<style scoped>
.clock-3d-container {
  position: relative;
  display: inline-block;
  transform-style: preserve-3d;
  transition: transform 0.3s cubic-bezier(0.4, 0.0, 0.2, 1);
  filter: drop-shadow(0 20px 50px rgba(0, 0, 0, 0.4));
}

.clock-3d-time {
  position: relative;
  display: flex;
  align-items: flex-start;
  gap: 0.3em;
  font-size: clamp(92px, 14vw, 202px);
  font-weight: 200;
  line-height: 0.82;
  letter-spacing: -0.075em;
  font-variant-numeric: tabular-nums lining-nums;
  font-feature-settings: 'tnum' 1, 'lnum' 1;

  background: linear-gradient(
    135deg,
    rgba(255, 255, 255, 1) 0%,
    rgba(200, 220, 255, 0.95) 50%,
    rgba(255, 255, 255, 0.9) 100%
  );
  -webkit-background-clip: text;
  -webkit-text-fill-color: transparent;
  background-clip: text;

  /* 多层文字阴影创造深度 */
  text-shadow:
    0 0 20px rgba(100, 200, 255, 0.6),
    0 0 40px rgba(100, 200, 255, 0.4),
    0 2px 4px rgba(0, 0, 0, 0.3),
    0 8px 16px rgba(0, 0, 0, 0.2);
}

.time-digits {
  position: relative;
  z-index: 1;
}

.time-seconds {
  margin-top: 0.06em;
  font-size: 0.12em;
  font-weight: 500;
  letter-spacing: 0.08em;
  opacity: 0.7;
}

/* 发光光环 */
.clock-glow-ring {
  position: absolute;
  inset: -40px;
  border-radius: 50%;
  background: radial-gradient(
    circle,
    rgba(0, 217, 255, 0.3) 0%,
    rgba(0, 217, 255, 0.1) 30%,
    transparent 70%
  );
  filter: blur(30px);
  animation: pulse-glow 3s ease-in-out infinite;
  pointer-events: none;
  z-index: 0;
}

@keyframes pulse-glow {
  0%, 100% {
    transform: scale(1);
    opacity: 0.6;
  }
  50% {
    transform: scale(1.1);
    opacity: 0.8;
  }
}

/* 高光效果 */
.clock-shine {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  height: 40%;
  background: linear-gradient(
    180deg,
    rgba(255, 255, 255, 0.3) 0%,
    transparent 100%
  );
  border-radius: inherit;
  pointer-events: none;
  mix-blend-mode: overlay;
  z-index: 2;
}

/* 响应式 */
@media (max-width: 768px) {
  .clock-3d-container {
    filter: drop-shadow(0 10px 30px rgba(0, 0, 0, 0.4));
  }

  .clock-glow-ring {
    inset: -20px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .clock-3d-container {
    transform: none !important;
  }

  .clock-glow-ring {
    animation: none;
  }
}
</style>
