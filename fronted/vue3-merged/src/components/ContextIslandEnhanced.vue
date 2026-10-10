<script setup lang="ts">
import { ref, onMounted, onUnmounted } from 'vue';

const islandRef = ref<HTMLElement | null>(null);
let magneticEffect: any = null;

const props = defineProps<{
  icon: string;
  eyebrow: string;
  title: string;
  caption: string;
  trailingIcon: string;
  isActive?: boolean;
}>();

const emit = defineEmits<{
  click: [];
}>();

function setupMagnetic() {
  if (!islandRef.value) return;

  islandRef.value.addEventListener('mousemove', handleMouseMove);
  islandRef.value.addEventListener('mouseleave', handleMouseLeave);
}

function handleMouseMove(e: MouseEvent) {
  if (!islandRef.value) return;

  const rect = islandRef.value.getBoundingClientRect();
  const centerX = rect.left + rect.width / 2;
  const centerY = rect.top + rect.height / 2;

  const deltaX = (e.clientX - centerX) / rect.width;
  const deltaY = (e.clientY - centerY) / rect.height;

  const moveX = deltaX * 15;
  const moveY = deltaY * 15;

  islandRef.value.style.transform = `translate(${moveX}px, ${moveY}px) scale(1.03)`;
}

function handleMouseLeave() {
  if (!islandRef.value) return;
  islandRef.value.style.transform = '';
}

function handleClick() {
  emit('click');

  // 涟漪效果
  if (islandRef.value) {
    const ripple = document.createElement('span');
    ripple.className = 'click-ripple';
    islandRef.value.appendChild(ripple);
    setTimeout(() => ripple.remove(), 800);
  }
}

onMounted(() => {
  setupMagnetic();
});

onUnmounted(() => {
  if (islandRef.value) {
    islandRef.value.removeEventListener('mousemove', handleMouseMove);
    islandRef.value.removeEventListener('mouseleave', handleMouseLeave);
  }
});
</script>

<template>
  <button
    ref="islandRef"
    class="context-island-enhanced"
    :class="{ 'is-active': isActive }"
    type="button"
    @click="handleClick"
  >
    <!-- 背景光效 -->
    <div class="island-glow" aria-hidden="true"></div>

    <!-- 彩虹边框 -->
    <div class="island-rainbow-border" aria-hidden="true"></div>

    <!-- 内容 -->
    <span class="island-icon-enhanced" aria-hidden="true">
      <i :class="icon"></i>
      <span class="icon-pulse"></span>
    </span>

    <span class="island-content">
      <small>{{ eyebrow }}</small>
      <strong>{{ title }}</strong>
      <span>{{ caption }}</span>
    </span>

    <i :class="trailingIcon" class="island-trailing-enhanced" aria-hidden="true"></i>
  </button>
</template>

<style scoped>
.context-island-enhanced {
  position: relative;
  min-height: 90px;
  padding: 14px 16px;
  border: 0;
  border-radius: 28px;
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  align-items: center;
  gap: 12px;

  /* 玻璃态高级效果 */
  background:
    linear-gradient(135deg,
      rgba(255, 255, 255, 0.25) 0%,
      rgba(255, 255, 255, 0.05) 50%,
      rgba(255, 255, 255, 0.15) 100%),
    linear-gradient(225deg,
      rgba(var(--accent-rgb), 0.2),
      rgba(var(--accent-rgb), 0.05)),
    rgba(36, 28, 35, 0.4);

  backdrop-filter: blur(30px) saturate(180%) brightness(1.1);
  -webkit-backdrop-filter: blur(30px) saturate(180%) brightness(1.1);

  box-shadow:
    0 8px 32px rgba(0, 0, 0, 0.3),
    0 2px 8px rgba(0, 0, 0, 0.2),
    inset 0 1px 0 rgba(255, 255, 255, 0.3),
    inset 0 -1px 0 rgba(0, 0, 0, 0.2),
    0 0 0 1px rgba(255, 255, 255, 0.2);

  transition: all 0.4s cubic-bezier(0.4, 0.0, 0.2, 1);
  cursor: pointer;
  overflow: hidden;
  transform-style: preserve-3d;
  will-change: transform;
}

.context-island-enhanced:hover {
  box-shadow:
    0 12px 48px rgba(0, 0, 0, 0.4),
    0 4px 16px rgba(0, 0, 0, 0.3),
    inset 0 1px 0 rgba(255, 255, 255, 0.4),
    inset 0 -1px 0 rgba(0, 0, 0, 0.2),
    0 0 0 1px rgba(255, 255, 255, 0.3),
    0 0 40px rgba(var(--accent-rgb), 0.3);
}

.context-island-enhanced.is-active {
  background:
    linear-gradient(135deg,
      rgba(255, 255, 255, 0.3) 0%,
      rgba(255, 255, 255, 0.1) 50%,
      rgba(255, 255, 255, 0.2) 100%),
    linear-gradient(225deg,
      rgba(var(--accent-rgb), 0.35),
      rgba(var(--accent-rgb), 0.15)),
    rgba(45, 35, 43, 0.5);

  box-shadow:
    0 12px 48px rgba(0, 0, 0, 0.4),
    0 0 0 2px rgba(var(--accent-rgb), 0.6),
    0 0 60px rgba(var(--accent-rgb), 0.4);
}

/* 背景光效 */
.island-glow {
  position: absolute;
  inset: -30px;
  background: radial-gradient(
    circle at var(--mouse-x, 50%) var(--mouse-y, 50%),
    rgba(0, 217, 255, 0.3) 0%,
    transparent 70%
  );
  opacity: 0;
  transition: opacity 0.4s;
  pointer-events: none;
  filter: blur(20px);
}

.context-island-enhanced:hover .island-glow {
  opacity: 1;
}

/* 彩虹边框（仅active时显示） */
.island-rainbow-border {
  position: absolute;
  inset: -2px;
  border-radius: inherit;
  padding: 2px;
  background: linear-gradient(90deg,
    #FF6B6B 0%, #FFA94D 14.28%, #FFD93D 28.57%,
    #6BCF7F 42.85%, #4ECDC4 57.14%, #5B5FFF 71.42%,
    #C77DFF 85.71%, #FF6B9D 100%
  );
  background-size: 200% 100%;
  -webkit-mask:
    linear-gradient(#fff 0 0) content-box,
    linear-gradient(#fff 0 0);
  -webkit-mask-composite: xor;
  mask-composite: exclude;
  opacity: 0;
  animation: rainbow-border-flow 3s linear infinite;
  pointer-events: none;
}

.context-island-enhanced.is-active .island-rainbow-border {
  opacity: 0.7;
}

@keyframes rainbow-border-flow {
  0% { background-position: 0% 50%; }
  100% { background-position: 200% 50%; }
}

/* 图标增强 */
.island-icon-enhanced {
  position: relative;
  width: 48px;
  height: 48px;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  background: linear-gradient(135deg,
    rgba(var(--accent-rgb), 0.25),
    rgba(var(--accent-rgb), 0.1));
  box-shadow:
    0 4px 12px rgba(0, 0, 0, 0.2),
    inset 0 1px 0 rgba(255, 255, 255, 0.3);
  font-size: 20px;
  color: rgba(255, 255, 255, 0.95);
  transition: all 0.3s cubic-bezier(0.68, -0.55, 0.265, 1.55);
}

.context-island-enhanced:hover .island-icon-enhanced {
  transform: scale(1.1) rotate(5deg);
  box-shadow:
    0 6px 20px rgba(0, 0, 0, 0.3),
    inset 0 1px 0 rgba(255, 255, 255, 0.4),
    0 0 20px rgba(var(--accent-rgb), 0.4);
}

/* 图标脉冲 */
.icon-pulse {
  position: absolute;
  inset: -4px;
  border: 2px solid rgba(var(--accent-rgb), 0.6);
  border-radius: 50%;
  opacity: 0;
  animation: icon-pulse 2s ease-out infinite;
}

.context-island-enhanced.is-active .icon-pulse {
  animation: icon-pulse 2s ease-out infinite;
}

@keyframes icon-pulse {
  0% {
    transform: scale(1);
    opacity: 0.8;
  }
  100% {
    transform: scale(1.5);
    opacity: 0;
  }
}

/* 内容区 */
.island-content {
  display: grid;
  gap: 3px;
  min-width: 0;
}

.island-content small {
  font-size: 10px;
  font-weight: 700;
  letter-spacing: 0.12em;
  text-transform: uppercase;
  color: rgba(255, 255, 255, 0.6);
}

.island-content strong {
  font-size: 15px;
  font-weight: 600;
  color: rgba(255, 255, 255, 0.98);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.island-content > span {
  font-size: 12px;
  color: rgba(255, 255, 255, 0.65);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

/* 尾部图标 */
.island-trailing-enhanced {
  font-size: 16px;
  color: rgba(255, 255, 255, 0.5);
  transition: all 0.3s cubic-bezier(0.68, -0.55, 0.265, 1.55);
}

.context-island-enhanced:hover .island-trailing-enhanced {
  transform: translateX(4px);
  color: rgba(255, 255, 255, 0.8);
}

/* 点击涟漪 */
.click-ripple {
  position: absolute;
  inset: 0;
  border-radius: inherit;
  background: radial-gradient(circle, rgba(255, 255, 255, 0.6) 0%, transparent 70%);
  animation: click-ripple-anim 0.8s ease-out forwards;
  pointer-events: none;
}

@keyframes click-ripple-anim {
  0% {
    transform: scale(0);
    opacity: 1;
  }
  100% {
    transform: scale(2);
    opacity: 0;
  }
}

/* 响应式 */
@media (max-width: 768px) {
  .context-island-enhanced {
    min-height: 80px;
    padding: 12px 14px;
    border-radius: 24px;
  }

  .island-icon-enhanced {
    width: 42px;
    height: 42px;
    font-size: 18px;
  }

  .island-content strong {
    font-size: 14px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .context-island-enhanced {
    transform: none !important;
    transition: background 0.2s, box-shadow 0.2s;
  }

  .island-glow,
  .island-rainbow-border,
  .icon-pulse,
  .click-ripple {
    display: none;
  }
}
</style>
