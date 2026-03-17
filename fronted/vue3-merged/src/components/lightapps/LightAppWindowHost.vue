<template>
  <div class="light-window-host" aria-live="polite">
    <TransitionGroup appear name="light-window-stretch" tag="div" class="light-window-layer">
      <article
        v-for="win in visibleWindows"
        :key="win.id"
        class="light-window liquid-material"
        :style="windowStyle(win)"
        @pointerdown="focusById(win.id)"
      >
        <header class="window-header" @pointerdown="startDrag($event, win)">
          <div class="window-left">
            <div class="window-title">
              <i :class="win.iconClass" aria-hidden="true"></i>
              <span>{{ win.title }}</span>
              <small v-if="win.pinned" class="pin-hint">主页固定</small>
            </div>

            <div v-if="win.code === 'timeprism-todo'" class="window-app-actions" role="tablist" aria-label="TimePrism modules">
              <button
                v-for="module in TIMEPRISM_MODULE_ITEMS"
                :key="`timeprism_${win.id}_${module.code}`"
                class="icon-btn app-switch-btn ripple-trigger"
                :class="{ active: currentTimePrismModule(win.id) === module.code }"
                type="button"
                role="tab"
                :aria-selected="currentTimePrismModule(win.id) === module.code"
                :title="module.label"
                :aria-label="module.label"
                @click.stop="setTimePrismModule(win.id, module.code)"
              >
                <i :class="module.iconClass" aria-hidden="true"></i>
              </button>
            </div>

            <div v-else-if="win.code === 'pomodoro-timer'" class="window-app-actions" role="tablist" aria-label="Pomodoro modes">
              <button
                v-for="item in POMODORO_MODE_ITEMS"
                :key="`pomodoro_${win.id}_${item.mode}`"
                class="icon-btn app-switch-btn ripple-trigger"
                :class="{ active: currentPomodoroMode(win.id) === item.mode }"
                type="button"
                role="tab"
                :aria-selected="currentPomodoroMode(win.id) === item.mode"
                :title="item.label"
                :aria-label="item.label"
                @click.stop="setPomodoroMode(win.id, item.mode)"
              >
                <i :class="item.iconClass" aria-hidden="true"></i>
              </button>
            </div>

            <div v-else-if="win.code === 'balance-ledger'" class="window-app-actions" role="tablist" aria-label="Balance sections">
              <button
                v-for="item in BALANCE_SECTION_ITEMS"
                :key="`balance_${win.id}_${item.code}`"
                class="icon-btn app-switch-btn ripple-trigger"
                :class="{ active: currentBalanceSection(win.id) === item.code }"
                type="button"
                role="tab"
                :aria-selected="currentBalanceSection(win.id) === item.code"
                :title="item.label"
                :aria-label="item.label"
                @click.stop="setBalanceSection(win.id, item.code)"
              >
                <i :class="item.iconClass" aria-hidden="true"></i>
              </button>
            </div>
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

        <Transition name="window-collapse">
          <section v-if="!win.minimized" class="window-body">
            <component :is="resolveWindowComponent(win.code)" :window-id="win.id" />
          </section>
        </Transition>

        <Transition name="window-collapse">
          <button
            v-if="!win.minimized"
            class="window-resize"
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
import PomodoroWindow from './pomodoro/PomodoroWindow.vue';
import {
  POMODORO_MODE_ITEMS,
  releasePomodoroWindowState,
  resolvePomodoroWindowState,
  setPomodoroWindowMode
} from './pomodoro/pomodoroWindowState';
import BalanceLedgerWindow from './balance/BalanceLedgerWindow.vue';
import {
  BALANCE_SECTION_ITEMS,
  releaseBalanceWindowState,
  resolveBalanceWindowState,
  setBalanceWindowSection
} from './balance/balanceWindowState';
import TimePrismTodoSuiteWindow from './timeprism/TimePrismTodoSuiteWindow.vue';
import {
  TIMEPRISM_MODULE_ITEMS,
  releaseTimePrismSuiteSession,
  resolveTimePrismSuiteSession,
  setSuiteActiveModule
} from './timeprism/timePrismSuiteState';
import { emitTimePrismFocusItem } from './timeprism/timePrismFocusBus';
import UrlLinksWindow from './url/UrlLinksWindow.vue';

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
  'timeprism-todo': TimePrismTodoSuiteWindow,
  'pomodoro-timer': PomodoroWindow,
  'balance-ledger': BalanceLedgerWindow,
  'url-links': UrlLinksWindow
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

function focusById(windowId) {
  replaceState(focusWindow(state, windowId));
}

function closeById(windowId) {
  releaseWindowLinkedState(windowId);
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
  const next = openOrFocusWindow(state, app, viewport());
  replaceState(next);

  if (code === 'timeprism-todo') {
    const windowId = next.windows.find((item) => item.code === code)?.id;
    const moduleCode = String(event?.detail?.moduleCode || '').trim().toLowerCase();
    if (windowId && moduleCode) {
      setSuiteActiveModule(resolveTimePrismSuiteSession(windowId), moduleCode);
    }
    const focusItemId = Number(event?.detail?.focusItemId) || 0;
    if (focusItemId > 0 && moduleCode) {
      emitTimePrismFocusItem({ moduleCode, itemId: focusItemId });
    }
  }
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

function currentTimePrismModule(windowId) {
  return resolveTimePrismSuiteSession(windowId).activeModule;
}

function setTimePrismModule(windowId, moduleCode) {
  const session = resolveTimePrismSuiteSession(windowId);
  setSuiteActiveModule(session, moduleCode);
}

function currentPomodoroMode(windowId) {
  return resolvePomodoroWindowState(windowId).mode;
}

function setPomodoroMode(windowId, mode) {
  setPomodoroWindowMode(windowId, mode);
}

function currentBalanceSection(windowId) {
  return resolveBalanceWindowState(windowId).section;
}

function setBalanceSection(windowId, section) {
  setBalanceWindowSection(windowId, section);
}

function releaseWindowLinkedState(windowId) {
  const target = state.windows.find((item) => item.id === Number(windowId));
  if (!target) return;
  if (target.code === 'timeprism-todo') {
    releaseTimePrismSuiteSession(windowId);
  } else if (target.code === 'pomodoro-timer') {
    releasePomodoroWindowState(windowId);
  } else if (target.code === 'balance-ledger') {
    releaseBalanceWindowState(windowId);
  }
}

onMounted(() => {
  window.addEventListener(LIGHT_APP_WINDOW_OPEN_EVENT, openFromEvent);
  window.addEventListener('resize', handleResize);
});

onBeforeUnmount(() => {
  state.windows.forEach((item) => {
    releaseWindowLinkedState(item.id);
  });
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
  --liquid-bg: rgba(var(--glass-rgb), 0.3);
  --liquid-border: rgba(255, 255, 255, 0.44);
  --liquid-shadow: 0 16px 36px rgba(16, 23, 38, 0.16);
  overflow: hidden;
  transition:
    box-shadow 220ms ease,
    border-color 180ms ease;
}

.light-window:focus-within {
  --liquid-shadow: 0 24px 56px rgba(10, 16, 30, 0.24);
  --liquid-border: rgba(255, 255, 255, 0.5);
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
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  padding: 8px 10px;
  border-bottom: 1px solid rgba(255, 255, 255, 0.26);
  cursor: move;
  user-select: none;
  transition: background-color 180ms ease;
}

.window-header:hover {
  background: rgba(255, 255, 255, 0.08);
}

.window-left {
  display: flex;
  align-items: center;
  gap: 8px;
  min-width: 0;
  flex: 1;
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

.window-app-actions {
  display: inline-flex;
  align-items: center;
  gap: 4px;
  padding-left: 8px;
  border-left: 1px solid rgba(255, 255, 255, 0.28);
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
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease,
    box-shadow 180ms ease;
}

.icon-btn:hover {
  transform: translateY(-1px);
  border-color: rgba(255, 255, 255, 0.58);
  background: rgba(255, 255, 255, 0.44);
  box-shadow: 0 5px 14px rgba(14, 20, 34, 0.16);
}

.app-switch-btn.active {
  border-color: rgba(var(--accent-rgb), 0.56);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(34, 41, 56, 0.96);
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
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease;
}

.window-resize:hover {
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

  .window-app-actions {
    gap: 3px;
    padding-left: 6px;
  }

  .app-switch-btn {
    width: 26px;
    height: 26px;
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
