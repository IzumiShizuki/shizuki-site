<template>
  <div
    ref="containerRef"
    class="drop-container"
    :class="{
      'is-dragging': state.isDragging,
      'is-expanded': state.isExpanded,
      'is-idle': state.isIdle
    }"
  >
    <div ref="visualRef" class="drop-body liquid-material">
      <div class="icon-gear-wrapper">
        <svg viewBox="0 0 24 24">
          <path
            d="M19.14,12.94c0.04-0.3,0.06-0.61,0.06-0.94c0-0.32-0.02-0.64-0.07-0.94l2.03-1.58c0.18-0.14,0.23-0.41,0.12-0.61 l-1.92-3.32c-0.12-0.22-0.37-0.29-0.59-0.22l-2.39,0.96c-0.5-0.38-1.03-0.7-1.62-0.94L14.4,2.81c-0.04-0.24-0.24-0.41-0.48-0.41 h-3.84c-0.24,0-0.43,0.17-0.47,0.41L9.25,5.35C8.66,5.59,8.12,5.92,7.63,6.29L5.24,5.33c-0.22-0.08-0.47,0-0.59,0.22L2.74,8.87 C2.62,9.08,2.66,9.34,2.86,9.48l2.03,1.58C4.84,11.36,4.8,11.69,4.8,12s0.02,0.64,0.07,0.94l-2.03,1.58 c-0.18,0.14-0.23,0.41-0.12,0.61l1.92,3.32c0.12,0.22,0.37,0.29,0.59,0.22l2.39-0.96c0.5,0.38,1.03,0.7,1.62,0.94l0.36,2.54 c0.05,0.24,0.24,0.41,0.48,0.41h3.84c0.24,0,0.44-0.17,0.47-0.41l0.36-2.54c0.59-0.24,1.13-0.56,1.62-0.94l2.39,0.96 c0.22,0.08,0.47,0,0.59-0.22l1.92-3.32c0.12-0.22,0.07-0.47-0.12-0.61L19.14,12.94z M12,15.6c-1.98,0-3.6-1.62-3.6-3.6 s1.62-3.6,3.6-3.6s3.6,1.62,3.6,3.6S13.98,15.6,12,15.6z"
          />
        </svg>
      </div>

      <div class="menu-list">
        <div class="menu-item close-btn" title="Close" @click.stop="handleCloseClick">
          <svg viewBox="0 0 24 24">
            <path d="M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z" />
          </svg>
        </div>
        <div ref="chatButtonRef" class="menu-item chat-btn" title="Chat" @click.stop="handleChatClick">
          <svg viewBox="0 0 24 24">
            <path d="M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2z" />
          </svg>
        </div>
        <div class="menu-item" title="Record" @click.stop="handleMenuAction('record', $event)">
          <svg viewBox="0 0 24 24">
            <path d="M14 2H6c-1.1 0-1.99.9-1.99 2L4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8l-6-6zm2 16H8v-2h8v2zm0-4H8v-2h8v2zm-3-5V3.5L18.5 9H13z" />
          </svg>
        </div>
        <div class="menu-item" title="Settings" @click.stop="handleMenuAction('settings', $event)">
          <svg viewBox="0 0 24 24">
            <path d="M3 17v2h6v-2H3zM3 5v2h10V5H3zm10 16v-2h8v-2h-8v-2h-2v6h2zM7 9v2H3v2h4v2h2V9H7zm14 4v-2H11v2h10zm-6-4h2V7h4V5h-4V3h-2v6z" />
          </svg>
        </div>
      </div>

      <div
        class="submenu-panel liquid-material"
        :class="{ 'is-open': state.isSubmenuOpen }"
        :aria-hidden="(!state.isSubmenuOpen).toString()"
        :style="{ top: chatSubmenuTop }"
      >
        <button class="submenu-item" style="--submenu-item-index: 0" type="button" @click.stop="handleSubmenuAction('a', $event)">
          a
        </button>
        <button class="submenu-item" style="--submenu-item-index: 1" type="button" @click.stop="handleSubmenuAction('b', $event)">
          b
        </button>
        <button class="submenu-item" style="--submenu-item-index: 2" type="button" @click.stop="handleSubmenuAction('c', $event)">
          c
        </button>
      </div>
    </div>
  </div>
</template>

<script setup>
import { onBeforeUnmount, onMounted, reactive, ref } from 'vue';

const containerRef = ref(null);
const visualRef = ref(null);
const chatButtonRef = ref(null);
const chatSubmenuTop = ref('58px');

const EXPANDED_WIDTH = 70;
const EXPANDED_HEIGHT = 260;
const BASE_SIZE = 60;
const SUBMENU_WIDTH = 78;
const SUBMENU_HEIGHT = 144;
const SUBMENU_GAP = 12;

const IDLE_TIMEOUT = 3000;
const FRICTION = 0.85;
const SPRING = 0.1;
const SNAP_THRESHOLD = 100;
const STRETCH_FACTOR = 0.3;
const MAX_STRETCH = 0.3;
const SCREEN_MARGIN_EXPANDED = 10;
const HIDING_RATIO = 0.4;

const state = reactive({
  x: 0,
  y: 100,
  vx: 0,
  vy: 0,
  isDragging: false,
  isExpanded: false,
  isIdle: false,
  isSubmenuOpen: false
});

const dragOffset = { x: 0, y: 0 };
const lastPos = { x: 0, y: 0 };
const startClickPos = { x: 0, y: 0 };

let pointerId = null;
let idleTimer = null;
let targetSnap = null;
let rafId = null;
let destroyed = false;

const touchStartOptions = { passive: true };

function onPointerDown(e) {
  const target = e.target;
  if (target.closest('.menu-item, .submenu-item')) return;

  if (state.isIdle) {
    wakeUp();
  }

  const container = containerRef.value;
  if (!container) return;

  const rect = container.getBoundingClientRect();
  dragOffset.x = e.clientX - rect.left;
  dragOffset.y = e.clientY - rect.top;

  state.isDragging = true;

  try {
    container.setPointerCapture(e.pointerId);
    pointerId = e.pointerId;
  } catch {
    pointerId = null;
  }

  state.vx = 0;
  state.vy = 0;
  lastPos.x = e.clientX;
  lastPos.y = e.clientY;
  startClickPos.x = e.clientX;
  startClickPos.y = e.clientY;
}

function onPointerMove(e) {
  resetIdleTimer();
  if (!state.isDragging) return;
  if (pointerId !== null && e.pointerId !== pointerId) return;

  const targetX = e.clientX - dragOffset.x;
  const targetY = e.clientY - dragOffset.y;

  state.vx = e.clientX - lastPos.x;
  state.vy = e.clientY - lastPos.y;

  state.x = targetX;
  state.y = targetY;

  lastPos.x = e.clientX;
  lastPos.y = e.clientY;
}

function onPointerUp(e) {
  if (!state.isDragging) return;
  if (pointerId !== null && e.pointerId !== pointerId) return;

  const container = containerRef.value;

  state.isDragging = false;

  if (container && pointerId !== null && container.hasPointerCapture(pointerId)) {
    container.releasePointerCapture(pointerId);
  }
  pointerId = null;

  handleSnap();
}

function handleSnap() {
  const currentW = state.isExpanded ? EXPANDED_WIDTH : BASE_SIZE;
  const currentH = state.isExpanded ? EXPANDED_HEIGHT : BASE_SIZE;
  const screenW = window.innerWidth;
  const screenH = window.innerHeight;

  let destX = state.x;
  let destY = state.y;

  const distLeft = state.x;
  const distRight = screenW - (state.x + currentW);
  const distTop = state.y;
  const distBottom = screenH - (state.y + currentH);

  if (!state.isExpanded) {
    const hideOffset = BASE_SIZE * HIDING_RATIO;

    if (distLeft < SNAP_THRESHOLD) {
      destX = -hideOffset;
    } else if (distRight < SNAP_THRESHOLD) {
      destX = screenW - currentW + hideOffset;
    } else {
      if (destX < SCREEN_MARGIN_EXPANDED) destX = SCREEN_MARGIN_EXPANDED;
      if (destX > screenW - currentW - SCREEN_MARGIN_EXPANDED) destX = screenW - currentW - SCREEN_MARGIN_EXPANDED;
    }

    if (distTop < SNAP_THRESHOLD) {
      destY = -hideOffset;
    } else if (distBottom < SNAP_THRESHOLD) {
      destY = screenH - currentH + hideOffset;
    } else {
      if (destY < SCREEN_MARGIN_EXPANDED) destY = SCREEN_MARGIN_EXPANDED;
      if (destY > screenH - currentH - SCREEN_MARGIN_EXPANDED) destY = screenH - currentH - SCREEN_MARGIN_EXPANDED;
    }
  } else {
    if (distLeft < SNAP_THRESHOLD) {
      destX = SCREEN_MARGIN_EXPANDED;
    } else if (distRight < SNAP_THRESHOLD) {
      destX = screenW - currentW - SCREEN_MARGIN_EXPANDED;
    } else {
      if (destX < SCREEN_MARGIN_EXPANDED) destX = SCREEN_MARGIN_EXPANDED;
      if (destX > screenW - currentW - SCREEN_MARGIN_EXPANDED) destX = screenW - currentW - SCREEN_MARGIN_EXPANDED;
    }

    if (distTop < SNAP_THRESHOLD) {
      destY = SCREEN_MARGIN_EXPANDED;
    } else if (distBottom < SNAP_THRESHOLD) {
      destY = screenH - currentH - SCREEN_MARGIN_EXPANDED;
    } else {
      if (destY < SCREEN_MARGIN_EXPANDED) destY = SCREEN_MARGIN_EXPANDED;
      if (destY > screenH - currentH - SCREEN_MARGIN_EXPANDED) destY = screenH - currentH - SCREEN_MARGIN_EXPANDED;
    }
  }

  targetSnap = { x: destX, y: destY };
}

function onResize() {
  handleSnap();
  if (state.isExpanded && state.isSubmenuOpen) {
    ensureSubmenuVisible();
    positionSubmenuAtChat();
  }
}

function animate() {
  if (destroyed) return;

  const container = containerRef.value;
  const visual = visualRef.value;

  if (!container || !visual) {
    rafId = requestAnimationFrame(animate);
    return;
  }

  if (!state.isDragging) {
    if (targetSnap) {
      const dx = targetSnap.x - state.x;
      const dy = targetSnap.y - state.y;
      state.vx += dx * SPRING;
      state.vy += dy * SPRING;
      state.vx *= FRICTION;
      state.vy *= FRICTION;

      if (Math.abs(dx) < 0.5 && Math.abs(dy) < 0.5 && Math.abs(state.vx) < 0.1 && Math.abs(state.vy) < 0.1) {
        state.x = targetSnap.x;
        state.y = targetSnap.y;
        state.vx = 0;
        state.vy = 0;
        targetSnap = null;
      }
    } else {
      state.vx *= FRICTION;
      state.vy *= FRICTION;

      if (state.x < -BASE_SIZE || state.x > window.innerWidth) state.vx *= -0.5;
      if (state.y < -BASE_SIZE || state.y > window.innerHeight) state.vy *= -0.5;
    }

    state.x += state.vx;
    state.y += state.vy;
  }

  container.style.transform = `translate3d(${state.x}px, ${state.y}px, 0)`;

  const velocity = Math.sqrt(state.vx * state.vx + state.vy * state.vy);
  if (!state.isExpanded) {
    let scaleX = 1;
    let scaleY = 1;
    let angle = 0;

    if (velocity > 1) {
      angle = Math.atan2(state.vy, state.vx);
      const stretch = Math.min(velocity * STRETCH_FACTOR * 0.01, MAX_STRETCH);
      scaleX = 1 + stretch;
      scaleY = 1 - stretch * 0.5;
    }

    visual.style.transform = `rotate(${angle}rad) scale(${scaleX}, ${scaleY})`;
  } else {
    visual.style.transform = 'none';
  }

  rafId = requestAnimationFrame(animate);
}

function resetIdleTimer() {
  if (state.isExpanded) return;
  if (state.isIdle) wakeUp();

  clearTimeout(idleTimer);
  idleTimer = setTimeout(goIdle, IDLE_TIMEOUT);
}

function goIdle() {
  if (state.isDragging || state.isExpanded) return;
  state.isIdle = true;
}

function wakeUp() {
  state.isIdle = false;
  const visual = visualRef.value;

  if (visual?.animate) {
    visual.animate(
      [{ transform: 'scale(0.95)' }, { transform: 'scale(1.05)' }, { transform: 'scale(1)' }],
      { duration: 400, easing: 'cubic-bezier(0.175, 0.885, 0.32, 1.275)' }
    );
  }

  clearTimeout(idleTimer);
  idleTimer = setTimeout(goIdle, IDLE_TIMEOUT);
}

function onDocumentPointerDown(e) {
  if (!state.isExpanded) return;

  const container = containerRef.value;
  const target = e.target;

  if (container && container.contains(target)) return;
  if (target.closest('.top-menu-root')) return;

  collapseMenu();
}

function onClickContainer(e) {
  if (state.isIdle) return;

  const dx = e.clientX - startClickPos.x;
  const dy = e.clientY - startClickPos.y;
  const distance = Math.sqrt(dx * dx + dy * dy);

  if (distance > 5) return;

  if (!state.isExpanded) {
    expandMenu();
  }
}

function expandMenu() {
  closeChatSubmenu();

  let newX = state.x;
  let newY = state.y;
  const screenW = window.innerWidth;
  const screenH = window.innerHeight;

  if (newX < 0) newX = SCREEN_MARGIN_EXPANDED;
  if (newX > screenW - EXPANDED_WIDTH - SCREEN_MARGIN_EXPANDED) {
    newX = screenW - EXPANDED_WIDTH - SCREEN_MARGIN_EXPANDED;
  }

  if (newY < 0) newY = SCREEN_MARGIN_EXPANDED;
  if (screenH - newY < EXPANDED_HEIGHT + 20) {
    newY = screenH - EXPANDED_HEIGHT - 20;
  }

  targetSnap = { x: newX, y: newY };
  state.isExpanded = true;

  clearTimeout(idleTimer);

  const visual = visualRef.value;
  if (visual?.animate) {
    visual.animate(
      [
        { transform: 'translateY(0) scale(1,1)' },
        { transform: 'translateY(-15px) scale(0.9, 1.1)' },
        { transform: 'translateY(0) scale(1,1)' }
      ],
      { duration: 300, easing: 'ease-out' }
    );
  }
}

function collapseMenu() {
  closeChatSubmenu();
  state.isExpanded = false;
  resetIdleTimer();
  setTimeout(handleSnap, 400);
}

function toggleExpanded() {
  if (state.isExpanded) {
    collapseMenu();
  } else {
    expandMenu();
  }
}

function toggleChatSubmenu() {
  if (!state.isExpanded) return;

  if (state.isSubmenuOpen) {
    closeChatSubmenu();
  } else {
    openChatSubmenu();
  }
}

function openChatSubmenu() {
  ensureSubmenuVisible();
  positionSubmenuAtChat();
  state.isSubmenuOpen = true;
}

function closeChatSubmenu() {
  state.isSubmenuOpen = false;
}

function ensureSubmenuVisible() {
  const screenW = window.innerWidth;
  const screenH = window.innerHeight;
  const maxX = screenW - EXPANDED_WIDTH - SCREEN_MARGIN_EXPANDED;
  const maxY = screenH - EXPANDED_HEIGHT - SCREEN_MARGIN_EXPANDED;
  const originalX = state.x;
  const originalY = state.y;

  if (state.x < SCREEN_MARGIN_EXPANDED) state.x = SCREEN_MARGIN_EXPANDED;
  if (state.x > maxX) state.x = maxX;
  if (state.y < SCREEN_MARGIN_EXPANDED) state.y = SCREEN_MARGIN_EXPANDED;
  if (state.y > maxY) state.y = maxY;

  const rightEdge = state.x + EXPANDED_WIDTH + SUBMENU_GAP + SUBMENU_WIDTH + SCREEN_MARGIN_EXPANDED;
  if (rightEdge > screenW) {
    const overflow = rightEdge - screenW;
    state.x = Math.max(SCREEN_MARGIN_EXPANDED, state.x - overflow);
  }

  if (state.x !== originalX || state.y !== originalY) {
    targetSnap = { x: state.x, y: state.y };
  }
}

function positionSubmenuAtChat() {
  const chatButton = chatButtonRef.value;
  const visual = visualRef.value;
  if (!chatButton || !visual) return;

  const chatRect = chatButton.getBoundingClientRect();
  const visualRect = visual.getBoundingClientRect();

  let top = chatRect.top - visualRect.top + chatRect.height * 0.5 - SUBMENU_HEIGHT * 0.5;
  const minTop = 8;
  const maxTop = EXPANDED_HEIGHT - SUBMENU_HEIGHT - 8;
  if (top < minTop) top = minTop;
  if (top > maxTop) top = maxTop;

  chatSubmenuTop.value = `${top}px`;
}

function triggerRipple(element) {
  if (!element?.animate) return;

  element.animate([{ transform: 'scale(0.9)' }, { transform: 'scale(1)' }], {
    duration: 200,
    easing: 'ease-out'
  });
}

function handleCloseClick(e) {
  triggerRipple(e.currentTarget);
  collapseMenu();
}

function handleChatClick(e) {
  triggerRipple(e.currentTarget);
  toggleChatSubmenu();
}

function handleMenuAction(action, e) {
  triggerRipple(e.currentTarget);
  closeChatSubmenu();
  console.log(`Action ${action} clicked`);
}

function handleSubmenuAction(label, e) {
  triggerRipple(e.currentTarget);
  console.log(`Submenu ${label} clicked`);
}

defineExpose({
  toggleExpanded
});

onMounted(() => {
  const container = containerRef.value;
  if (!container) return;

  destroyed = false;
  state.x = window.innerWidth - 100;
  state.y = 100;

  container.addEventListener('pointerdown', onPointerDown);
  container.addEventListener('click', onClickContainer);

  window.addEventListener('pointermove', onPointerMove);
  window.addEventListener('pointerup', onPointerUp);
  window.addEventListener('resize', onResize);

  document.addEventListener('mousemove', resetIdleTimer);
  document.addEventListener('touchstart', resetIdleTimer, touchStartOptions);
  document.addEventListener('pointerdown', onDocumentPointerDown);

  rafId = requestAnimationFrame(animate);
  resetIdleTimer();
});

onBeforeUnmount(() => {
  destroyed = true;

  const container = containerRef.value;
  if (container) {
    container.removeEventListener('pointerdown', onPointerDown);
    container.removeEventListener('click', onClickContainer);
  }

  window.removeEventListener('pointermove', onPointerMove);
  window.removeEventListener('pointerup', onPointerUp);
  window.removeEventListener('resize', onResize);

  document.removeEventListener('mousemove', resetIdleTimer);
  document.removeEventListener('touchstart', resetIdleTimer, touchStartOptions);
  document.removeEventListener('pointerdown', onDocumentPointerDown);

  clearTimeout(idleTimer);
  if (rafId !== null) {
    cancelAnimationFrame(rafId);
    rafId = null;
  }
});
</script>

<style scoped>
.drop-container {
  --drop-size: 60px;
  --menu-width: 70px;
  --menu-height: 260px;
  --submenu-width: 78px;
  --submenu-height: 144px;
  --submenu-gap: 12px;
  --ease-elastic: cubic-bezier(0.34, 1.56, 0.64, 1);
}

.drop-container {
  position: fixed;
  top: 0;
  left: 0;
  width: var(--drop-size);
  height: var(--drop-size);
  z-index: 1000;
  touch-action: none;
  cursor: pointer;
  transition: opacity 0.6s ease;
}

.drop-container.is-idle {
  opacity: 0.3;
}

.drop-body {
  --liquid-bg: var(--glass-bg);
  position: relative;
  width: 100%;
  height: 100%;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  overflow: hidden;
  transform-origin: center center;
  transition:
    width 0.4s var(--ease-elastic),
    height 0.4s var(--ease-elastic),
    border-radius 0.4s ease,
    background-color 0.3s ease;
}

.drop-body::after {
  content: '';
  position: absolute;
  top: 8%;
  left: 12%;
  width: 40%;
  height: 25%;
  border-radius: 50%;
  background: radial-gradient(circle at center, rgba(255, 255, 255, 0.8) 0%, rgba(255, 255, 255, 0) 70%);
  opacity: 0.7;
  pointer-events: none;
  filter: blur(2px);
}

@keyframes breath {
  0%,
  100% {
    transform: scale(1);
  }
  50% {
    transform: scale(1.03);
  }
}

.drop-container:not(.is-dragging):not(.is-expanded) .drop-body {
  animation: breath 6s ease-in-out infinite;
}

@keyframes press-wobble {
  0% {
    transform: scale(1);
  }
  35% {
    transform: scale(0.92, 1.06);
  }
  70% {
    transform: scale(1.04, 0.96);
  }
  100% {
    transform: scale(1);
  }
}

@keyframes submenu-panel-in {
  0% {
    opacity: 0;
    transform: translateX(-14px) scale(0.9);
  }
  100% {
    opacity: 1;
    transform: translateX(0) scale(1);
  }
}

@keyframes submenu-item-in {
  0% {
    opacity: 0;
    transform: translateX(-8px) scale(0.94);
  }
  100% {
    opacity: 1;
    transform: translateX(0) scale(1);
  }
}

.icon-gear-wrapper {
  position: absolute;
  width: 24px;
  height: 24px;
  opacity: 0.6;
  transition: opacity 0.3s, transform 0.3s;
}

.icon-gear-wrapper svg {
  width: 100%;
  height: 100%;
  fill: #fff;
  filter: drop-shadow(0 1px 2px rgba(0, 0, 0, 0.1));
}

.drop-container.is-expanded .icon-gear-wrapper {
  opacity: 0;
  transform: scale(0.5);
}

.menu-list {
  position: absolute;
  inset: 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-evenly;
  opacity: 0;
  pointer-events: none;
  transform: translateY(10px);
  transition: opacity 0.2s 0.1s, transform 0.3s var(--ease-elastic) 0.1s;
}

.drop-container.is-expanded .menu-list {
  opacity: 1;
  pointer-events: auto;
  transform: translateY(0);
}

.drop-container.is-expanded .drop-body {
  --liquid-bg: rgba(var(--glass-rgb), 0.45);
  width: var(--menu-width);
  height: var(--menu-height);
  border-radius: 35px;
  overflow: visible;
}

.menu-item {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 40px;
  height: 40px;
  border-radius: 50%;
  background: rgba(255, 255, 255, 0.2);
  font-size: 0;
  cursor: pointer;
  transition: transform 0.1s, background 0.2s;
  position: relative;
}

.menu-item:hover {
  background: rgba(205, 220, 242, 0.62);
}

.menu-item:active {
  animation: press-wobble 260ms ease;
}

.menu-item.close-btn {
  background: rgba(0, 0, 0, 0.1);
}

.menu-item.close-btn:hover {
  background: rgba(0, 0, 0, 0.22);
}

.menu-item.close-btn svg {
  fill: rgba(0, 0, 0, 0.6);
}

.menu-item svg {
  width: 20px;
  height: 20px;
  fill: rgba(255, 255, 255, 0.9);
}

.submenu-panel {
  position: absolute;
  left: calc(100% + var(--submenu-gap));
  width: var(--submenu-width);
  height: var(--submenu-height);
  padding: 10px 8px;
  border-radius: 24px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  align-items: center;
  opacity: 0;
  pointer-events: none;
  transform: translateX(-10px) scale(0.95);
  transform-origin: left center;
  transition: opacity 0.2s ease, transform 0.25s var(--ease-elastic);
}

.submenu-panel.is-open {
  opacity: 1;
  pointer-events: auto;
  transform: translateX(0) scale(1);
  animation: submenu-panel-in 260ms cubic-bezier(0.22, 1, 0.36, 1);
}

.submenu-item {
  width: 46px;
  height: 36px;
  border: 0;
  border-radius: 18px;
  background: rgba(255, 255, 255, 0.3);
  color: rgba(255, 255, 255, 0.95);
  font-size: 15px;
  font-weight: 600;
  cursor: pointer;
  opacity: 0;
  transform: translateX(-8px) scale(0.94);
  transition: background 0.2s, color 0.2s;
}

.submenu-item:hover {
  background: rgba(205, 220, 242, 0.62);
  color: #ffffff;
}

.submenu-item:active {
  animation: press-wobble 260ms ease;
}

.submenu-panel.is-open .submenu-item {
  animation: submenu-item-in 240ms ease forwards;
  animation-delay: calc(var(--submenu-item-index) * 55ms + 35ms);
}

.drop-container.is-expanded .menu-item:nth-child(1) {
  transition-delay: 0.05s;
}

.drop-container.is-expanded .menu-item:nth-child(2) {
  transition-delay: 0.1s;
}

.drop-container.is-expanded .menu-item:nth-child(3) {
  transition-delay: 0.15s;
}

.drop-container.is-expanded .menu-item:nth-child(4) {
  transition-delay: 0.2s;
}
</style>
