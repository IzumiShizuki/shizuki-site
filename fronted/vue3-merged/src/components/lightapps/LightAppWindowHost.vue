<template>
  <div
    ref="hostElement"
    class="light-window-host"
    :class="{ 'is-fullscreen-active': fullscreenWindowId > 0 }"
    aria-live="polite"
  >
    <TransitionGroup appear name="light-window-stretch" tag="div" class="light-window-layer">
      <article
        v-for="win in visibleWindows"
        :key="win.id"
        class="light-window liquid-material"
        :class="{
          'is-minimized': win.minimized,
          'is-active': Number(win.id) === activeWindowId,
          'is-fullscreen': isFullscreenWindow(win.id)
        }"
        :ref="(element) => setWindowElement(win.id, element)"
        :data-window-id="win.id"
        :data-window-code="win.code"
        :role="isFullscreenWindow(win.id) ? 'dialog' : undefined"
        :aria-modal="isFullscreenWindow(win.id) ? 'true' : undefined"
        :aria-label="isFullscreenWindow(win.id) ? `${win.title} 全屏工作区` : undefined"
        :tabindex="isFullscreenWindow(win.id) ? -1 : undefined"
        :style="windowStyle(win)"
        @pointerdown="handleWindowPointerDown($event, win.id)"
        @keydown="handleFullscreenKeydown($event, win)"
      >
        <header class="window-header">
          <div class="window-head-row">
            <div
              class="window-drag-zone"
              :class="{ 'is-disabled': isFullscreenWindow(win.id) }"
              @pointerdown="startDrag($event, win)"
            >
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
              :title="isFullscreenWindow(win.id) ? '退出全屏' : '进入全屏'"
              :aria-label="isFullscreenWindow(win.id) ? '退出全屏' : '进入全屏'"
              type="button"
              @pointerdown.stop="handleActionPointerDown($event, win.id)"
              @click.stop.prevent="handleActionClick('fullscreen', win.id)"
            >
              <i
                :class="isFullscreenWindow(win.id) ? 'fas fa-compress' : 'fas fa-expand'"
                aria-hidden="true"
              ></i>
            </button>
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
            v-if="!win.minimized && !isFullscreenWindow(win.id)"
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
import { computed, defineAsyncComponent, h, nextTick, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import {
  closeLightAppWindow,
  focusLightAppWindow,
  getVisibleLightAppWindows,
  releaseLightAppShell,
  resolveLightAppHeaderPortalId,
  retainLightAppShell,
  setLightAppWindowRect,
  toggleLightAppWindowFullscreen,
  toggleLightAppWindowMinimized,
  toggleLightAppWindowPinned,
  useLightAppShellState
} from './lightAppShellStore';

const props = defineProps({
  isHomeRoute: {
    type: Boolean,
    default: false
  },
  isFocusActive: {
    type: Boolean,
    default: false
  },
  focusAppCodes: {
    type: Array,
    default: () => []
  }
});

const AsyncWindowLoading = {
  name: 'AsyncWindowLoading',
  render() {
    return h('div', { class: 'window-component-state window-component-state-loading' }, [
      h('i', { class: 'fas fa-spinner fa-spin', 'aria-hidden': 'true' }),
      h('span', null, '模块加载中...')
    ]);
  }
};

const AsyncWindowError = {
  name: 'AsyncWindowError',
  props: {
    error: {
      type: Object,
      default: null
    }
  },
  render() {
    return h('div', { class: 'window-component-state window-component-state-error' }, [
      h('i', { class: 'fas fa-triangle-exclamation', 'aria-hidden': 'true' }),
      h('span', null, this.error?.message || '模块加载失败，请关闭后重试。')
    ]);
  }
};

function createAsyncWindowComponent(loader) {
  return defineAsyncComponent({
    loader,
    delay: 120,
    timeout: 30000,
    loadingComponent: AsyncWindowLoading,
    errorComponent: AsyncWindowError,
    onError(error, retry, fail, attempts) {
      if (attempts <= 2) {
        retry();
        return;
      }
      fail(error);
    }
  });
}

const TimePrismTodoSuiteWindow = createAsyncWindowComponent(() => import('./timeprism/TimePrismTodoSuiteWindow.vue'));
const PomodoroWindow = createAsyncWindowComponent(() => import('./pomodoro/PomodoroWindow.vue'));
const BalanceLedgerWindow = createAsyncWindowComponent(() => import('./balance/BalanceLedgerWindow.vue'));
const UrlLinksWindow = createAsyncWindowComponent(() => import('./url/UrlLinksWindow.vue'));
const BoardCanvasWindow = createAsyncWindowComponent(() => import('./board/BoardCanvasWindow.vue'));
const BlogSlidevWindow = createAsyncWindowComponent(() => import('./blog/BlogSlidevWindow.vue'));
const QrToolsWindow = createAsyncWindowComponent(() => import('./qr/QrToolsWindow.vue'));
const WebToolboxWindow = createAsyncWindowComponent(() => import('./toolbox/WebToolboxWindow.vue'));
const KjToolSourceWindow = createAsyncWindowComponent(() => import('./kj/KjToolSourceWindow.vue'));

const componentMap = Object.freeze({
  'timeprism-todo': TimePrismTodoSuiteWindow,
  'pomodoro-timer': PomodoroWindow,
  'balance-ledger': BalanceLedgerWindow,
  'url-links': UrlLinksWindow,
  'board-canvas': BoardCanvasWindow,
  'blog-slidev': BlogSlidevWindow,
  'qr-tools': QrToolsWindow,
  'web-toolbox': WebToolboxWindow,
  'kj-tool-source': KjToolSourceWindow
});

const WINDOW_INTERACTIVE_SELECTOR = 'button, input, select, textarea, a, [role="button"], [contenteditable], .window-toolbar-hit';
const FOCUSABLE_SELECTOR = [
  'a[href]',
  'button:not([disabled])',
  'input:not([disabled])',
  'select:not([disabled])',
  'textarea:not([disabled])',
  '[contenteditable="true"]',
  '[tabindex]:not([tabindex="-1"])'
].join(',');
const EDITABLE_SELECTOR = 'input, textarea, select, [contenteditable="true"], [contenteditable=""]';

const shellState = useLightAppShellState();
const hostElement = ref(null);
const windowElements = new Map();
let isolationRecords = [];
let bodyStyleSnapshot = null;
let fullscreenReturnFocus = null;

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

const visibleWindows = computed(() =>
  getVisibleLightAppWindows({
    isHomeRoute: props.isHomeRoute,
    isFocusActive: props.isFocusActive,
    focusAppCodes: props.focusAppCodes
  })
);

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

const fullscreenWindowId = computed(() => Number(shellState.fullscreenWindowId) || 0);

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

function setWindowElement(windowId, element) {
  const normalizedId = Number(windowId) || 0;
  if (!normalizedId) return;
  if (element instanceof HTMLElement) {
    windowElements.set(normalizedId, element);
    return;
  }
  windowElements.delete(normalizedId);
}

function isFullscreenWindow(windowId) {
  return fullscreenWindowId.value > 0 && fullscreenWindowId.value === Number(windowId);
}

function windowStyle(win) {
  if (isFullscreenWindow(win.id)) {
    return {
      inset: '0',
      left: '0',
      top: '0',
      width: '100vw',
      height: '100dvh',
      zIndex: '2600'
    };
  }
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

  if (normalized === 'fullscreen') {
    clearInteraction();
    toggleLightAppWindowFullscreen(windowId);
    return;
  }
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
  if (isFullscreenWindow(win.id)) return;
  if (isInteractiveTarget(event?.target)) return;
  focusById(win.id);
  beginInteraction('drag', event, win);
}

function startResize(event, win) {
  if (!win || !isPrimaryPointer(event)) return;
  if (isFullscreenWindow(win.id)) return;
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

function isVisibleFocusable(element) {
  if (!(element instanceof HTMLElement)) return false;
  if (element.hidden || element.getAttribute('aria-hidden') === 'true') return false;
  return true;
}

function getFullscreenFocusables(fullscreenElement) {
  if (!(fullscreenElement instanceof HTMLElement)) return [];
  return Array.from(fullscreenElement.querySelectorAll(FOCUSABLE_SELECTOR)).filter(isVisibleFocusable);
}

function shouldKeepEscapeInsideApp(event, fullscreenElement) {
  const target = event?.target;
  if (!(target instanceof Element)) return false;
  if (target.matches(EDITABLE_SELECTOR) || target.closest(EDITABLE_SELECTOR)) return true;
  const nestedDialog = target.closest('[role="dialog"], [aria-modal="true"]');
  return Boolean(nestedDialog && nestedDialog !== fullscreenElement);
}

function handleFullscreenKeydown(event, win) {
  if (!isFullscreenWindow(win?.id)) return;
  const fullscreenElement = windowElements.get(Number(win.id));
  if (!(fullscreenElement instanceof HTMLElement)) return;

  if (event.key === 'Escape') {
    if (event.defaultPrevented || shouldKeepEscapeInsideApp(event, fullscreenElement)) return;
    event.preventDefault();
    event.stopPropagation();
    toggleLightAppWindowFullscreen(win.id);
    return;
  }

  if (event.key !== 'Tab') return;
  const focusable = getFullscreenFocusables(fullscreenElement);
  if (!focusable.length) {
    event.preventDefault();
    fullscreenElement.focus({ preventScroll: true });
    return;
  }

  const first = focusable[0];
  const last = focusable[focusable.length - 1];
  if (event.shiftKey && (document.activeElement === first || !fullscreenElement.contains(document.activeElement))) {
    event.preventDefault();
    last.focus({ preventScroll: true });
    return;
  }
  if (!event.shiftKey && (document.activeElement === last || !fullscreenElement.contains(document.activeElement))) {
    event.preventDefault();
    first.focus({ preventScroll: true });
  }
}

function isolateBackground() {
  if (typeof document === 'undefined') return;
  const host = hostElement.value;
  const parent = host?.parentElement;
  isolationRecords = [];
  if (parent) {
    Array.from(parent.children).forEach((element) => {
      if (element === host || !(element instanceof HTMLElement)) return;
      isolationRecords.push({
        element,
        inert: element.hasAttribute('inert'),
        ariaHidden: element.getAttribute('aria-hidden')
      });
      element.setAttribute('inert', '');
      element.setAttribute('aria-hidden', 'true');
    });
  }

  bodyStyleSnapshot = {
    overflow: document.body.style.overflow,
    overscrollBehavior: document.body.style.overscrollBehavior
  };
  document.body.style.overflow = 'hidden';
  document.body.style.overscrollBehavior = 'none';
}

function restoreBackground() {
  isolationRecords.forEach(({ element, inert, ariaHidden }) => {
    if (!(element instanceof HTMLElement)) return;
    if (!inert) element.removeAttribute('inert');
    if (ariaHidden === null) {
      element.removeAttribute('aria-hidden');
    } else {
      element.setAttribute('aria-hidden', ariaHidden);
    }
  });
  isolationRecords = [];

  if (bodyStyleSnapshot && typeof document !== 'undefined') {
    document.body.style.overflow = bodyStyleSnapshot.overflow;
    document.body.style.overscrollBehavior = bodyStyleSnapshot.overscrollBehavior;
  }
  bodyStyleSnapshot = null;
}

async function focusFullscreenWindow(windowId) {
  await nextTick();
  const fullscreenElement = windowElements.get(Number(windowId));
  if (!(fullscreenElement instanceof HTMLElement)) return;
  const focusable = getFullscreenFocusables(fullscreenElement);
  (focusable[0] || fullscreenElement).focus({ preventScroll: true });
}

function restoreFullscreenFocus() {
  const target = fullscreenReturnFocus;
  fullscreenReturnFocus = null;
  if (target instanceof HTMLElement && target.isConnected && typeof target.focus === 'function') {
    target.focus({ preventScroll: true });
  }
}

watch(fullscreenWindowId, (nextId, previousId) => {
  if (nextId > 0 && previousId <= 0) {
    fullscreenReturnFocus = document.activeElement instanceof HTMLElement ? document.activeElement : null;
    isolateBackground();
  }
  if (nextId > 0) {
    focusFullscreenWindow(nextId);
    return;
  }
  if (previousId > 0) {
    restoreBackground();
    nextTick(restoreFullscreenFocus);
  }
});

onMounted(() => {
  retainLightAppShell();
});

onBeforeUnmount(() => {
  releaseLightAppShell();
  clearInteraction();
  restoreBackground();
  restoreFullscreenFocus();
  windowElements.clear();
});
</script>

<style scoped>
.light-window-host {
  position: fixed;
  inset: 0;
  pointer-events: none;
  z-index: 2400;
}

.light-window-host.is-fullscreen-active {
  z-index: 2700;
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
    left 360ms cubic-bezier(0.16, 1, 0.3, 1),
    top 360ms cubic-bezier(0.16, 1, 0.3, 1),
    width 360ms cubic-bezier(0.16, 1, 0.3, 1),
    height 360ms cubic-bezier(0.16, 1, 0.3, 1),
    border-radius 320ms cubic-bezier(0.16, 1, 0.3, 1),
    box-shadow 220ms ease,
    border-color 180ms ease,
    background-color 240ms ease;
}

.light-window.is-fullscreen {
  min-width: 0;
  min-height: 0;
  max-width: none;
  max-height: none;
  border-radius: 0;
  border-color: color-mix(in srgb, var(--theme-border-strong, rgba(255, 255, 255, 0.5)) 72%, transparent);
  --liquid-bg: color-mix(
    in srgb,
    var(--theme-panel-surface, rgba(var(--glass-rgb), 0.72)) 88%,
    rgba(var(--accent-rgb), 0.08)
  );
  --liquid-shadow: 0 0 0 1px rgba(255, 255, 255, 0.08);
  background:
    radial-gradient(circle at 12% -8%, rgba(var(--accent-rgb), 0.18), transparent 38%),
    radial-gradient(circle at 92% 4%, rgba(255, 255, 255, 0.12), transparent 32%),
    var(--liquid-bg);
  isolation: isolate;
}

.light-window.is-fullscreen::after {
  content: '';
  position: absolute;
  inset: 0;
  z-index: -1;
  pointer-events: none;
  opacity: 0.42;
  background-image:
    linear-gradient(rgba(255, 255, 255, 0.025) 1px, transparent 1px),
    linear-gradient(90deg, rgba(255, 255, 255, 0.025) 1px, transparent 1px);
  background-size: 28px 28px;
  mask-image: linear-gradient(to bottom, black, transparent 68%);
}

.light-window.is-fullscreen:focus-visible {
  outline: 2px solid rgba(var(--accent-rgb), 0.7);
  outline-offset: -2px;
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
  padding-right: 154px;
  border-bottom: 1px solid var(--theme-divider-soft, rgba(255, 255, 255, 0.26));
  user-select: none;
  transition: background-color 180ms ease;
}

.light-window.is-fullscreen .window-header {
  min-height: 52px;
  padding-top: max(10px, env(safe-area-inset-top));
  padding-right: max(158px, calc(148px + env(safe-area-inset-right)));
  padding-left: max(12px, env(safe-area-inset-left));
  background: color-mix(in srgb, var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.12)) 86%, transparent);
  backdrop-filter: blur(24px) saturate(132%);
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

.window-drag-zone.is-disabled {
  cursor: default;
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

.light-window.is-fullscreen .window-actions-zone {
  top: max(10px, env(safe-area-inset-top));
  right: max(12px, env(safe-area-inset-right));
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
  padding-right: 154px;
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

.light-window.is-fullscreen .window-body {
  padding:
    clamp(10px, 1.4vw, 22px)
    max(clamp(10px, 1.6vw, 26px), env(safe-area-inset-right))
    max(clamp(12px, 1.6vw, 26px), env(safe-area-inset-bottom))
    max(clamp(10px, 1.6vw, 26px), env(safe-area-inset-left));
  overscroll-behavior: contain;
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

.window-component-state {
  display: flex;
  align-items: center;
  gap: 8px;
  min-height: 72px;
  margin: 4px 0;
  padding: 10px 12px;
  border-radius: 10px;
  border: 1px dashed rgba(255, 255, 255, 0.24);
  background: rgba(12, 18, 30, 0.42);
  color: rgba(229, 236, 249, 0.9);
  font-size: 13px;
}

.window-component-state-loading i {
  color: rgba(var(--accent-rgb), 0.9);
}

.window-component-state-error {
  border-color: rgba(255, 126, 148, 0.38);
  background: rgba(72, 16, 24, 0.36);
  color: rgba(255, 212, 220, 0.94);
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

  .light-window.is-fullscreen .window-header {
    padding-right: max(150px, calc(140px + env(safe-area-inset-right)));
  }

  .light-window.is-fullscreen .window-title span {
    max-width: min(30vw, 132px);
  }
}

:global(:root[data-effective-motion-mode='soothing']) .light-window {
  transition-duration: 120ms;
  transition-timing-function: ease-out;
}

:global(:root[data-effective-motion-mode='soothing']) .light-window.is-fullscreen::after {
  display: none;
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
