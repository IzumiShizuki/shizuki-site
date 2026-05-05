<template>
  <div class="light-window-host" aria-live="polite">
    <TransitionGroup appear name="light-window-stretch" tag="div" class="light-window-layer">
      <article
        v-for="win in visibleWindows"
        :key="win.id"
        class="light-window liquid-material"
        :class="{
          'is-minimized': win.minimized,
          'is-active': Number(win.id) === activeWindowId
        }"
        :data-window-id="win.id"
        :data-window-code="win.code"
        :style="windowStyle(win)"
        @pointerdown="handleWindowPointerDown($event, win.id)"
      >
        <header class="window-header">
          <div class="window-head-row">
            <div class="window-drag-zone" @pointerdown="startDrag($event, win)">
              <div class="window-title">
                <i :class="win.iconClass" aria-hidden="true"></i>
                <span>{{ win.title }}</span>
                <small v-if="win.pinned" class="pin-hint">主页固定</small>
              </div>
            </div>
          </div>

          <div class="window-actions-zone" @pointerdown.stop>
            <button
              class="icon-btn icon-btn-action ripple-trigger"
              :title="win.pinned ? '取消固定' : '固定到主页'"
              type="button"
              @pointerdown.stop="handleActionPointerDown($event, win.id)"
              @click.stop.prevent="handleActionClick('pin', win.id)"
            >
              <i :class="win.pinned ? 'fas fa-thumbtack' : 'fas fa-thumbtack fa-rotate-90'" aria-hidden="true"></i>
            </button>
            <button
              class="icon-btn icon-btn-action ripple-trigger"
              :title="win.minimized ? '还原' : '最小化'"
              type="button"
              @pointerdown.stop="handleActionPointerDown($event, win.id)"
              @click.stop.prevent="handleActionClick('minimize', win.id)"
            >
              <i :class="win.minimized ? 'fas fa-up-right-and-down-left-from-center' : 'fas fa-window-minimize'" aria-hidden="true"></i>
            </button>
            <button
              class="icon-btn icon-btn-action ripple-trigger"
              title="关闭"
              type="button"
              @pointerdown.stop="handleActionPointerDown($event, win.id)"
              @click.stop.prevent="handleActionClick('close', win.id)"
            >
              <i class="fas fa-xmark" aria-hidden="true"></i>
            </button>
          </div>

          <div
            :id="headerPortalTargetId(win.id)"
            class="window-toolbar-zone window-toolbar-hit"
            @pointerdown.stop
          ></div>
        </header>

        <Transition name="window-collapse">
          <section v-if="!win.minimized" class="window-body">
            <component :is="resolveWindowComponent(win.code)" :window-id="win.id" />
          </section>
        </Transition>

        <Transition name="window-collapse">
          <button
            v-if="!win.minimized"
            class="window-resize-handle"
            type="button"
            title="拖拽缩放"
            @pointerdown.stop.prevent="startResize($event, win)"
          >
            <i class="fas fa-up-right-and-down-left-from-center" aria-hidden="true"></i>
          </button>
        </Transition>
      </article>
    </TransitionGroup>
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive } from 'vue';
import PomodoroWindow from './pomodoro/PomodoroWindow.vue';
import BalanceLedgerWindow from './balance/BalanceLedgerWindow.vue';
import TimePrismTodoSuiteWindow from './timeprism/TimePrismTodoSuiteWindow.vue';
import UrlLinksWindow from './url/UrlLinksWindow.vue';
import BoardCanvasWindow from './board/BoardCanvasWindow.vue';
import BlogSlidevWindow from './blog/BlogSlidevWindow.vue';
import {
  closeLightAppWindow,
  focusLightAppWindow,
  getVisibleLightAppWindows,
  releaseLightAppShell,
  resolveLightAppHeaderPortalId,
  retainLightAppShell,
  setLightAppWindowRect,
  toggleLightAppWindowMinimized,
  toggleLightAppWindowPinned
} from './lightAppShellStore';

const props = defineProps({
  isHomeRoute: {
    type: Boolean,
    default: false
  }
});

const componentMap = Object.freeze({
  'timeprism-todo': TimePrismTodoSuiteWindow,
  'pomodoro-timer': PomodoroWindow,
  'balance-ledger': BalanceLedgerWindow,
  'url-links': UrlLinksWindow,
  'board-canvas': BoardCanvasWindow,
  'blog-slidev': BlogSlidevWindow
});

const WINDOW_INTERACTIVE_SELECTOR = 'button, input, select, textarea, a, [role="button"], [contenteditable], .window-toolbar-hit';

const interaction = reactive({
  mode: '',
  windowId: 0,
  pointerId: 0,
  startX: 0,
  startY: 0,
  originX: 0,
  originY: 0,
  originWidth: 0,
  originHeight: 0,
  captureTarget: null
});

const visibleWindows = computed(() => getVisibleLightAppWindows(props.isHomeRoute));

const activeWindowId = computed(() => {
  const windows = Array.isArray(visibleWindows.value) ? visibleWindows.value : [];
  let maxZ = -Infinity;
  let id = 0;
  windows.forEach((item) => {
    const z = Number(item?.zIndex);
    if (!Number.isFinite(z) || z < maxZ) return;
    maxZ = z;
    id = Number(item?.id) || 0;
  });
  return id;
});

function viewport() {
  if (typeof window === 'undefined') {
    return { width: 1280, height: 720 };
  }
  return {
    width: Number(window.innerWidth) || 1280,
    height: Number(window.innerHeight) || 720
  };
}

function isPrimaryPointer(event) {
  if (!event) return true;
  if (typeof event.button !== 'number') return true;
  return Number(event.button) === 0;
}

function isInteractiveTarget(target) {
  return Boolean(target?.closest?.(WINDOW_INTERACTIVE_SELECTOR));
}

function resolveWindowComponent(code) {
  return componentMap[code] || TimePrismTodoSuiteWindow;
}

function windowStyle(win) {
  return {
    left: `${win.x}px`,
    top: `${win.y}px`,
    width: `${win.width}px`,
    height: win.minimized ? '48px' : `${win.height}px`,
    zIndex: String(win.zIndex)
  };
}

function headerPortalTargetId(windowId) {
  return resolveLightAppHeaderPortalId(windowId);
}

function focusById(windowId) {
  focusLightAppWindow(windowId);
}

function handleWindowPointerDown(event, windowId) {
  if (!isPrimaryPointer(event)) return;
  focusById(windowId);
}

function handleActionPointerDown(event, windowId) {
  if (!isPrimaryPointer(event)) return;
  event.stopPropagation();
  focusById(windowId);
}

function closeById(windowId) {
  if (interaction.windowId === Number(windowId)) {
    clearInteraction();
  }
  closeLightAppWindow(windowId);
}

function handleActionClick(action, windowId) {
  const normalized = String(action || '').trim().toLowerCase();
  focusById(windowId);

  if (normalized === 'pin') {
    toggleLightAppWindowPinned(windowId);
    return;
  }
  if (normalized === 'minimize') {
    toggleLightAppWindowMinimized(windowId);
    return;
  }
  if (normalized === 'close') {
    closeById(windowId);
  }
}

function bindInteractionListeners(target) {
  if (!target || typeof target.addEventListener !== 'function') return;
  target.addEventListener('pointermove', onInteractionPointerMove);
  target.addEventListener('pointerup', onInteractionPointerUp);
  target.addEventListener('pointercancel', onInteractionPointerCancel);
  window.addEventListener('blur', onInteractionPointerCancel);
}

function unbindInteractionListeners(target) {
  if (target && typeof target.removeEventListener === 'function') {
    target.removeEventListener('pointermove', onInteractionPointerMove);
    target.removeEventListener('pointerup', onInteractionPointerUp);
    target.removeEventListener('pointercancel', onInteractionPointerCancel);
  }
  window.removeEventListener('blur', onInteractionPointerCancel);
}

function beginInteraction(mode, event, win) {
  if (!win || !mode || !isPrimaryPointer(event)) return;
  const pointerId = Number(event.pointerId) || 0;
  const captureTarget = event.currentTarget && typeof event.currentTarget === 'object' ? event.currentTarget : window;

  clearInteraction();

  interaction.mode = mode;
  interaction.windowId = Number(win.id) || 0;
  interaction.pointerId = pointerId;
  interaction.startX = Number(event.clientX) || 0;
  interaction.startY = Number(event.clientY) || 0;
  interaction.originX = Number(win.x) || 0;
  interaction.originY = Number(win.y) || 0;
  interaction.originWidth = Number(win.width) || 0;
  interaction.originHeight = Number(win.height) || 0;
  interaction.captureTarget = captureTarget;

  if (pointerId && typeof captureTarget?.setPointerCapture === 'function') {
    try {
      captureTarget.setPointerCapture(pointerId);
    } catch {
      // ignore pointer capture failures
    }
  }

  bindInteractionListeners(captureTarget);
}

function startDrag(event, win) {
  if (!win || !isPrimaryPointer(event)) return;
  if (isInteractiveTarget(event?.target)) return;
  focusById(win.id);
  beginInteraction('drag', event, win);
}

function startResize(event, win) {
  if (!win || !isPrimaryPointer(event)) return;
  focusById(win.id);
  beginInteraction('resize', event, win);
}

function onInteractionPointerMove(event) {
  if (!interaction.mode) return;
  if (interaction.pointerId && Number(event?.pointerId) !== interaction.pointerId) return;

  const dx = (Number(event?.clientX) || 0) - interaction.startX;
  const dy = (Number(event?.clientY) || 0) - interaction.startY;

  if (interaction.mode === 'drag') {
    setLightAppWindowRect(
      interaction.windowId,
      {
        x: interaction.originX + dx,
        y: interaction.originY + dy
      },
      viewport()
    );
    return;
  }

  if (interaction.mode === 'resize') {
    setLightAppWindowRect(
      interaction.windowId,
      {
        width: interaction.originWidth + dx,
        height: interaction.originHeight + dy
      },
      viewport()
    );
  }
}

function clearInteraction() {
  if (interaction.captureTarget && interaction.pointerId && typeof interaction.captureTarget.releasePointerCapture === 'function') {
    try {
      interaction.captureTarget.releasePointerCapture(interaction.pointerId);
    } catch {
      // ignore pointer release failures
    }
  }

  unbindInteractionListeners(interaction.captureTarget || window);

  interaction.mode = '';
  interaction.windowId = 0;
  interaction.pointerId = 0;
  interaction.startX = 0;
  interaction.startY = 0;
  interaction.originX = 0;
  interaction.originY = 0;
  interaction.originWidth = 0;
  interaction.originHeight = 0;
  interaction.captureTarget = null;
}

function onInteractionPointerUp(event) {
  if (!interaction.mode) return;
  if (interaction.pointerId && Number(event?.pointerId) !== interaction.pointerId) return;
  clearInteraction();
}

function onInteractionPointerCancel() {
  if (!interaction.mode) return;
  clearInteraction();
}

onMounted(() => {
  retainLightAppShell();
});

onBeforeUnmount(() => {
  releaseLightAppShell();
  clearInteraction();
});
</script>

<style scoped>
.light-window-host {
  position: fixed;
  inset: 0;
  pointer-events: none;
  z-index: 2400;
}

.light-window-layer {
  position: relative;
  width: 100%;
  height: 100%;
  pointer-events: none;
}

.light-window {
  position: fixed;
  pointer-events: auto;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  min-width: 300px;
  min-height: 48px;
  border-radius: 14px;
  --liquid-bg: var(--theme-panel-surface-elevated, rgba(var(--glass-rgb), 0.3));
  --liquid-border: var(--theme-border-strong, rgba(255, 255, 255, 0.44));
  --liquid-shadow: 0 16px 36px rgba(18, 9, 8, 0.16);
  overflow: hidden;
  transition:
    box-shadow 220ms ease,
    border-color 180ms ease;
}

.light-window.is-active {
  --liquid-shadow: 0 24px 56px rgba(18, 9, 8, 0.24);
  --liquid-border: color-mix(in srgb, var(--theme-border-strong, rgba(255, 255, 255, 0.5)) 82%, rgba(var(--accent-rgb), 0.24));
}

.light-window:focus-within {
  --liquid-shadow: 0 24px 56px rgba(18, 9, 8, 0.24);
  --liquid-border: color-mix(in srgb, var(--theme-border-strong, rgba(255, 255, 255, 0.5)) 82%, rgba(var(--accent-rgb), 0.24));
}

.light-window-stretch-enter-active,
.light-window-stretch-leave-active {
  transition:
    transform 240ms cubic-bezier(0.23, 1, 0.32, 1),
    opacity 200ms ease;
  transform-origin: center top;
}

.light-window-stretch-enter-from,
.light-window-stretch-leave-to {
  opacity: 0;
  transform: scaleY(0.82) scaleX(0.97);
}

.light-window-stretch-enter-to,
.light-window-stretch-leave-from {
  opacity: 1;
  transform: scaleY(1) scaleX(1);
}

.light-window-stretch-move {
  transition: none;
}

.window-collapse-enter-active,
.window-collapse-leave-active {
  transition:
    transform 180ms cubic-bezier(0.2, 0.88, 0.32, 1),
    opacity 140ms ease;
  transform-origin: top center;
}

.window-collapse-enter-from,
.window-collapse-leave-to {
  opacity: 0;
  transform: scaleY(0.86);
}

.window-collapse-enter-to,
.window-collapse-leave-from {
  opacity: 1;
  transform: scaleY(1);
}

.window-header {
  position: relative;
  display: flex;
  flex-direction: column;
  gap: 6px;
  padding: 8px 10px 6px;
  padding-right: 112px;
  border-bottom: 1px solid var(--theme-divider-soft, rgba(255, 255, 255, 0.26));
  user-select: none;
  transition: background-color 180ms ease;
}

.window-header:hover {
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.08));
}

.window-head-row {
  display: block;
  min-height: 32px;
}

.window-drag-zone {
  display: flex;
  align-items: center;
  min-width: 0;
  min-height: 32px;
  width: 100%;
  cursor: move;
  border-radius: 10px;
  padding: 2px 4px 2px 0;
  position: relative;
  z-index: 1;
}

.window-title {
  display: flex;
  align-items: center;
  gap: 8px;
  min-width: 0;
  color: var(--theme-text-primary, rgba(36, 43, 58, 0.9));
}

.window-title span {
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.pin-hint {
  font-size: 11px;
  color: rgba(43, 109, 168, 0.88);
  border: 1px solid rgba(112, 170, 224, 0.45);
  border-radius: 999px;
  padding: 1px 8px;
  background: rgba(255, 255, 255, 0.26);
}

.window-actions-zone {
  position: absolute;
  top: 8px;
  right: 10px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  z-index: 3;
  pointer-events: auto;
}

.window-toolbar-zone {
  width: 100%;
  min-width: 0;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: flex-start;
  gap: 6px;
  overflow: hidden;
  padding-top: 2px;
  position: relative;
  z-index: 2;
}

.icon-btn {
  width: 28px;
  height: 28px;
  border-radius: 8px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.42));
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.32));
  color: var(--theme-icon-primary, rgba(34, 41, 56, 0.84));
  cursor: pointer;
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease,
    box-shadow 180ms ease;
}

.icon-btn-action {
  pointer-events: auto;
}

.icon-btn:hover {
  transform: translateY(-1px);
  border-color: rgba(var(--accent-rgb), 0.28);
  background: var(--theme-floating-surface-hover, rgba(255, 255, 255, 0.44));
  box-shadow: 0 5px 14px rgba(18, 9, 8, 0.14);
}

.app-switch-btn.active {
  border-color: rgba(var(--accent-rgb), 0.56);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgb(var(--accent-strong-rgb));
}

.light-window.is-minimized .window-header {
  padding-right: 112px;
  padding-bottom: 8px;
}

.light-window.is-minimized .window-toolbar-zone {
  display: none;
}

.window-body {
  min-height: 0;
  overflow: auto;
  padding: 10px;
  container-type: size;
  container-name: lightapp-window-body;
  scrollbar-width: thin;
  scrollbar-color: rgba(110, 122, 146, 0.44) rgba(255, 255, 255, 0.1);
}

.window-body::-webkit-scrollbar {
  width: 6px;
  height: 6px;
}

.window-body::-webkit-scrollbar-track {
  background: rgba(255, 255, 255, 0.1);
  border-radius: 999px;
}

.window-body::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(110, 122, 146, 0.4);
  border: 1px solid transparent;
  background-clip: content-box;
}

.window-body::-webkit-scrollbar-thumb:hover {
  background: rgba(121, 134, 161, 0.55);
  background-clip: content-box;
}

.window-body::-webkit-scrollbar-corner {
  background: transparent;
}

.window-resize-handle {
  position: absolute;
  right: 8px;
  bottom: 8px;
  width: 24px;
  height: 24px;
  border: 1px solid rgba(255, 255, 255, 0.42);
  border-radius: 6px;
  background: rgba(255, 255, 255, 0.3);
  color: rgba(34, 41, 56, 0.84);
  display: inline-flex;
  align-items: center;
  justify-content: center;
  cursor: nwse-resize;
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease;
}

.window-resize-handle:hover {
  transform: translateY(-1px);
  border-color: rgba(255, 255, 255, 0.58);
  background: rgba(255, 255, 255, 0.42);
}

@media (max-width: 760px) {
  .light-window {
    min-width: 260px;
  }

  .window-title span {
    max-width: 118px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .light-window-stretch-enter-active,
  .light-window-stretch-leave-active,
  .window-collapse-enter-active,
  .window-collapse-leave-active {
    transition-duration: 80ms;
  }
}
</style>
