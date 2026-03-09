<template>
  <div v-if="visibleWindows.length" class="light-window-host" aria-live="polite">
    <article
      v-for="win in visibleWindows"
      :key="win.id"
      class="light-window liquid-material"
      :style="windowStyle(win)"
      @pointerdown="focusById(win.id)"
    >
      <header class="window-header" @pointerdown="startDrag($event, win)">
        <div class="window-title">
          <i :class="win.iconClass" aria-hidden="true"></i>
          <span>{{ win.title }}</span>
          <small v-if="win.pinned" class="pin-hint">主页固定</small>
        </div>
        <div class="window-actions">
          <button class="icon-btn ripple-trigger" :title="win.pinned ? '取消固定' : '固定到主页'" @click.stop="togglePinned(win.id)">
            <i :class="win.pinned ? 'fas fa-thumbtack' : 'fas fa-thumbtack fa-rotate-90'" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" :title="win.minimized ? '还原' : '最小化'" @click.stop="toggleMinimized(win.id)">
            <i :class="win.minimized ? 'fas fa-up-right-and-down-left-from-center' : 'fas fa-window-minimize'" aria-hidden="true"></i>
          </button>
          <button class="icon-btn ripple-trigger" title="关闭" @click.stop="closeById(win.id)">
            <i class="fas fa-xmark" aria-hidden="true"></i>
          </button>
        </div>
      </header>

      <section v-show="!win.minimized" class="window-body">
        <component :is="resolveWindowComponent(win.code)" :window-id="win.id" />
      </section>

      <button
        v-if="!win.minimized"
        class="window-resize"
        type="button"
        title="拖拽缩放"
        @pointerdown.stop.prevent="startResize($event, win)"
      >
        <i class="fas fa-up-right-and-down-left-from-center" aria-hidden="true"></i>
      </button>
    </article>
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive } from 'vue';
import { getLightAppByCode } from '../../utils/lightAppsCatalog';
import { LIGHT_APP_WINDOW_OPEN_EVENT } from '../../utils/lightAppWindowBus';
import {
  closeWindow,
  createWindowRuntimeState,
  focusWindow,
  getVisibleWindows,
  openOrFocusWindow,
  setWindowMinimized,
  setWindowRect,
  toggleWindowPinned
} from '../../utils/lightAppWindowRuntime';
import ProjectsWindow from './timeprism/ProjectsWindow.vue';
import ScheduleWindow from './timeprism/ScheduleWindow.vue';
import TaskBoardWindow from './timeprism/TaskBoardWindow.vue';
import TodoWindow from './timeprism/TodoWindow.vue';

const props = defineProps({
  isHomeRoute: {
    type: Boolean,
    default: false
  }
});

const state = reactive(createWindowRuntimeState());

const interaction = reactive({
  mode: '',
  windowId: 0,
  pointerId: 0,
  startX: 0,
  startY: 0,
  originX: 0,
  originY: 0,
  originWidth: 0,
  originHeight: 0
});

const componentMap = Object.freeze({
  'timeprism-todo': TodoWindow,
  'timeprism-board': TaskBoardWindow,
  'timeprism-schedule': ScheduleWindow,
  'timeprism-projects': ProjectsWindow
});

const visibleWindows = computed(() => getVisibleWindows(state, props.isHomeRoute));

function viewport() {
  if (typeof window === 'undefined') {
    return { width: 1280, height: 720 };
  }
  return {
    width: Number(window.innerWidth) || 1280,
    height: Number(window.innerHeight) || 720
  };
}

function replaceState(next) {
  state.nextId = next.nextId;
  state.nextZIndex = next.nextZIndex;
  state.windows = next.windows;
}

function resolveWindowComponent(code) {
  return componentMap[code] || TodoWindow;
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

function focusById(windowId) {
  replaceState(focusWindow(state, windowId));
}

function closeById(windowId) {
  replaceState(closeWindow(state, windowId));
}

function togglePinned(windowId) {
  replaceState(toggleWindowPinned(state, windowId));
}

function toggleMinimized(windowId) {
  const target = state.windows.find((item) => item.id === Number(windowId));
  if (!target) return;
  replaceState(setWindowMinimized(state, windowId, !target.minimized));
}

function startDrag(event, win) {
  if (!win || event.button !== 0) return;
  if (event.target?.closest?.('button')) return;

  interaction.mode = 'drag';
  interaction.windowId = win.id;
  interaction.pointerId = event.pointerId;
  interaction.startX = event.clientX;
  interaction.startY = event.clientY;
  interaction.originX = win.x;
  interaction.originY = win.y;

  focusById(win.id);
  window.addEventListener('pointermove', onPointerMove);
  window.addEventListener('pointerup', onPointerUp);
}

function startResize(event, win) {
  if (!win || event.button !== 0) return;

  interaction.mode = 'resize';
  interaction.windowId = win.id;
  interaction.pointerId = event.pointerId;
  interaction.startX = event.clientX;
  interaction.startY = event.clientY;
  interaction.originWidth = win.width;
  interaction.originHeight = win.height;

  focusById(win.id);
  window.addEventListener('pointermove', onPointerMove);
  window.addEventListener('pointerup', onPointerUp);
}

function onPointerMove(event) {
  if (!interaction.mode) return;
  if (interaction.pointerId && event.pointerId !== interaction.pointerId) return;

  const dx = event.clientX - interaction.startX;
  const dy = event.clientY - interaction.startY;

  if (interaction.mode === 'drag') {
    replaceState(
      setWindowRect(
        state,
        interaction.windowId,
        {
          x: interaction.originX + dx,
          y: interaction.originY + dy
        },
        viewport()
      )
    );
    return;
  }

  if (interaction.mode === 'resize') {
    replaceState(
      setWindowRect(
        state,
        interaction.windowId,
        {
          width: interaction.originWidth + dx,
          height: interaction.originHeight + dy
        },
        viewport()
      )
    );
  }
}

function onPointerUp(event) {
  if (!interaction.mode) return;
  if (interaction.pointerId && event.pointerId !== interaction.pointerId) return;

  interaction.mode = '';
  interaction.windowId = 0;
  interaction.pointerId = 0;
  window.removeEventListener('pointermove', onPointerMove);
  window.removeEventListener('pointerup', onPointerUp);
}

function openFromEvent(event) {
  const code = String(event?.detail?.code || '').trim();
  if (!code) return;
  const app = getLightAppByCode(code);
  if (!app) return;
  replaceState(openOrFocusWindow(state, app, viewport()));
}

function handleResize() {
  const next = {
    ...state,
    windows: state.windows.map((item) => item)
  };
  next.windows.forEach((win) => {
    const normalized = setWindowRect(next, win.id, {}, viewport());
    next.nextId = normalized.nextId;
    next.nextZIndex = normalized.nextZIndex;
    next.windows = normalized.windows;
  });
  replaceState(next);
}

onMounted(() => {
  window.addEventListener(LIGHT_APP_WINDOW_OPEN_EVENT, openFromEvent);
  window.addEventListener('resize', handleResize);
});

onBeforeUnmount(() => {
  window.removeEventListener(LIGHT_APP_WINDOW_OPEN_EVENT, openFromEvent);
  window.removeEventListener('resize', handleResize);
  window.removeEventListener('pointermove', onPointerMove);
  window.removeEventListener('pointerup', onPointerUp);
});
</script>

<style scoped>
.light-window-host {
  position: fixed;
  inset: 0;
  pointer-events: none;
  z-index: 2400;
}

.light-window {
  position: fixed;
  pointer-events: auto;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  min-width: 300px;
  min-height: 48px;
  border-radius: 14px;
  --liquid-bg: rgba(var(--glass-rgb), 0.3);
  --liquid-border: rgba(255, 255, 255, 0.44);
  --liquid-shadow: 0 16px 36px rgba(16, 23, 38, 0.16);
  overflow: hidden;
}

.window-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  padding: 8px 10px;
  border-bottom: 1px solid rgba(255, 255, 255, 0.26);
  cursor: move;
  user-select: none;
}

.window-title {
  display: flex;
  align-items: center;
  gap: 8px;
  min-width: 0;
  color: rgba(36, 43, 58, 0.9);
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

.window-actions {
  display: flex;
  align-items: center;
  gap: 6px;
}

.icon-btn {
  width: 28px;
  height: 28px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.42);
  background: rgba(255, 255, 255, 0.32);
  color: rgba(34, 41, 56, 0.84);
}

.window-body {
  min-height: 0;
  overflow: auto;
  padding: 10px;
}

.window-resize {
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
}

@media (max-width: 760px) {
  .light-window {
    min-width: 260px;
  }

  .window-title span {
    max-width: 132px;
  }
}
</style>
