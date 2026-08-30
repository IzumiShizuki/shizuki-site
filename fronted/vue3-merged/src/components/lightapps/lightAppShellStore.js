import { reactive, readonly } from 'vue';
import { getLightAppByCode } from '../../utils/lightAppsCatalog';
import { LIGHT_APP_WINDOW_OPEN_EVENT } from '../../utils/lightAppWindowBus';
import {
  LIGHT_APP_SHARED_WINDOW_IDS,
  closeWindow,
  createWindowRuntimeState,
  focusWindow,
  getVisibleWindows,
  openOrFocusWindow,
  setWindowMinimized,
  setWindowRect,
  toggleWindowPinned
} from '../../utils/lightAppWindowRuntime';
import { releasePomodoroWindowState } from './pomodoro/pomodoroWindowState';
import { releaseBalanceWindowState } from './balance/balanceWindowState';
import {
  releaseTimePrismSuiteSession,
  resolveTimePrismSuiteSession,
  setSuiteActiveModule
} from './timeprism/timePrismSuiteState';
import { emitTimePrismFocusItem } from './timeprism/timePrismFocusBus';
import {
  releaseBlogPresentationWindowState,
  setBlogPresentationWindowEntry
} from './blog/blogPresentationWindowState';

/** @deprecated Page mode now reuses the shared fullscreen window identity. */
export const LIGHT_APP_PAGE_MODE_WINDOW_ID_OFFSET = 0;

const HEADER_PORTAL_PREFIX = 'lightapp-header-portal-shell';

const shellState = reactive({
  runtime: createWindowRuntimeState(),
  fullscreenWindowId: 0,
  pageMode: {
    code: '',
    source: '',
    openedAt: 0
  }
});

let activeConsumers = 0;
let listenersBound = false;

function replaceRuntime(next) {
  shellState.runtime.nextId = Number(next?.nextId) > 0 ? Number(next.nextId) : 1;
  shellState.runtime.nextZIndex = Number(next?.nextZIndex) > 0 ? Number(next.nextZIndex) : 2400;
  shellState.runtime.windows = Array.isArray(next?.windows) ? next.windows : [];
}

function resolveViewport(viewport) {
  if (Number(viewport?.width) > 0 && Number(viewport?.height) > 0) {
    return {
      width: Number(viewport.width),
      height: Number(viewport.height)
    };
  }
  if (typeof window === 'undefined') {
    return { width: 1280, height: 720 };
  }
  return {
    width: Number(window.innerWidth) || 1280,
    height: Number(window.innerHeight) || 720
  };
}

function normalizeCode(value) {
  return String(value || '').trim();
}

function normalizeWindowId(value) {
  const normalized = Number(value);
  if (!Number.isInteger(normalized) || normalized <= 0) return 0;
  return normalized;
}

function findRuntimeWindow(windowId) {
  const normalizedId = normalizeWindowId(windowId);
  if (!normalizedId) return null;
  return shellState.runtime.windows.find((item) => item.id === normalizedId) || null;
}

function dispatchFullscreenResize() {
  if (typeof window === 'undefined' || typeof window.dispatchEvent !== 'function') return;
  window.dispatchEvent(new Event('resize'));
}

function releaseWindowLinkedStateByCode(code, windowId) {
  if (code === 'timeprism-todo') {
    releaseTimePrismSuiteSession(windowId);
    return;
  }
  if (code === 'pomodoro-timer') {
    releasePomodoroWindowState(windowId);
    return;
  }
  if (code === 'balance-ledger') {
    releaseBalanceWindowState(windowId);
    return;
  }
  if (code === 'blog-slidev') {
    releaseBlogPresentationWindowState(windowId);
  }
}

function applyOpenPayload(code, windowId, options = {}) {
  const targetCode = normalizeCode(code);
  const targetWindowId = normalizeWindowId(windowId);
  if (!targetCode || !targetWindowId) return;

  if (targetCode === 'timeprism-todo') {
    const moduleCode = String(options?.moduleCode || '').trim().toLowerCase();
    if (moduleCode) {
      setSuiteActiveModule(resolveTimePrismSuiteSession(targetWindowId), moduleCode);
    }
    const focusItemId = Number(options?.focusItemId) || 0;
    if (focusItemId > 0 && moduleCode) {
      emitTimePrismFocusItem({ moduleCode, itemId: focusItemId });
    }
    return;
  }

  if (targetCode === 'blog-slidev') {
    setBlogPresentationWindowEntry(targetWindowId, {
      postId: options?.postId,
      scope: options?.scope
    });
  }
}

function handleOpenEvent(event) {
  const detail = event?.detail && typeof event.detail === 'object' ? event.detail : {};
  const code = normalizeCode(detail.code);
  if (!code) return;
  openLightAppShellWindow(code, detail);
}

function handleWindowResize() {
  normalizeLightAppWindowsToViewport();
}

function bindListeners() {
  if (listenersBound || typeof window === 'undefined') return;
  window.addEventListener(LIGHT_APP_WINDOW_OPEN_EVENT, handleOpenEvent);
  window.addEventListener('resize', handleWindowResize);
  listenersBound = true;
}

function unbindListeners() {
  if (!listenersBound || typeof window === 'undefined') return;
  window.removeEventListener(LIGHT_APP_WINDOW_OPEN_EVENT, handleOpenEvent);
  window.removeEventListener('resize', handleWindowResize);
  listenersBound = false;
}

export function retainLightAppShell() {
  activeConsumers += 1;
  bindListeners();
  return readonly(shellState);
}

export function releaseLightAppShell() {
  activeConsumers = Math.max(0, activeConsumers - 1);
  if (activeConsumers === 0) {
    unbindListeners();
  }
}

export function useLightAppShellState() {
  return readonly(shellState);
}

export function resolveLightAppPageModeWindowId(code) {
  const normalizedCode = normalizeCode(code);
  const sharedWindowId = Number(LIGHT_APP_SHARED_WINDOW_IDS[normalizedCode]) || 0;
  if (!Number.isInteger(sharedWindowId) || sharedWindowId <= 0) {
    return 0;
  }
  return sharedWindowId;
}

export function resolveLightAppWindowIdByCode(code) {
  const normalizedCode = normalizeCode(code);
  const target = shellState.runtime.windows.find((item) => item.code === normalizedCode);
  return normalizeWindowId(target?.id);
}

export function resolveLightAppHeaderPortalId(windowId) {
  const normalized = normalizeWindowId(windowId);
  if (!normalized) return '';
  return `${HEADER_PORTAL_PREFIX}-${normalized}`;
}

export function resolveLightAppHeaderPortalSelector(windowId) {
  const id = resolveLightAppHeaderPortalId(windowId);
  if (!id) return '';
  return `#${id}`;
}

export function openLightAppShellWindow(code, options = {}, viewport) {
  const normalizedCode = normalizeCode(code);
  const app = getLightAppByCode(normalizedCode);
  if (!app) return 0;

  const next = openOrFocusWindow(shellState.runtime, app, resolveViewport(viewport));
  replaceRuntime(next);

  const targetWindowId = resolveLightAppWindowIdByCode(normalizedCode);
  applyOpenPayload(normalizedCode, targetWindowId, options);
  if (options?.fullscreen === true) {
    enterLightAppWindowFullscreen(targetWindowId);
  }
  return targetWindowId;
}

export function enterLightAppWindowFullscreen(windowId) {
  const normalizedId = normalizeWindowId(windowId);
  const target = findRuntimeWindow(normalizedId);
  if (!target) return 0;

  if (target.minimized) {
    replaceRuntime(setWindowMinimized(shellState.runtime, normalizedId, false));
  }
  replaceRuntime(focusWindow(shellState.runtime, normalizedId));
  shellState.fullscreenWindowId = normalizedId;
  dispatchFullscreenResize();
  return normalizedId;
}

export function exitLightAppWindowFullscreen(windowId) {
  const activeId = normalizeWindowId(shellState.fullscreenWindowId);
  if (!activeId) return 0;
  const requestedId = normalizeWindowId(windowId);
  if (windowId !== undefined && windowId !== null && requestedId !== activeId) return 0;

  shellState.fullscreenWindowId = 0;
  dispatchFullscreenResize();
  return activeId;
}

export function toggleLightAppWindowFullscreen(windowId) {
  const normalizedId = normalizeWindowId(windowId);
  if (!findRuntimeWindow(normalizedId)) return 0;
  if (normalizeWindowId(shellState.fullscreenWindowId) === normalizedId) {
    return exitLightAppWindowFullscreen(normalizedId);
  }
  return enterLightAppWindowFullscreen(normalizedId);
}

export function focusLightAppWindow(windowId) {
  const normalizedId = normalizeWindowId(windowId);
  if (!normalizedId) return 0;
  replaceRuntime(focusWindow(shellState.runtime, normalizedId));
  return normalizedId;
}

export function closeLightAppWindow(windowId) {
  const normalizedId = normalizeWindowId(windowId);
  if (!normalizedId) return 0;
  const target = shellState.runtime.windows.find((item) => item.id === normalizedId);
  if (target) {
    releaseWindowLinkedStateByCode(target.code, normalizedId);
  }
  if (normalizeWindowId(shellState.fullscreenWindowId) === normalizedId) {
    shellState.fullscreenWindowId = 0;
    dispatchFullscreenResize();
  }
  if (normalizeCode(shellState.pageMode.code) === normalizeCode(target?.code)) {
    shellState.pageMode.code = '';
    shellState.pageMode.source = '';
    shellState.pageMode.openedAt = 0;
  }
  replaceRuntime(closeWindow(shellState.runtime, normalizedId));
  return normalizedId;
}

export function toggleLightAppWindowPinned(windowId) {
  const normalizedId = normalizeWindowId(windowId);
  if (!normalizedId) return 0;
  replaceRuntime(toggleWindowPinned(shellState.runtime, normalizedId));
  return normalizedId;
}

export function toggleLightAppWindowMinimized(windowId) {
  const normalizedId = normalizeWindowId(windowId);
  if (!normalizedId) return 0;
  const target = shellState.runtime.windows.find((item) => item.id === normalizedId);
  if (!target) return 0;
  if (!target.minimized && normalizeWindowId(shellState.fullscreenWindowId) === normalizedId) {
    exitLightAppWindowFullscreen(normalizedId);
  }
  replaceRuntime(setWindowMinimized(shellState.runtime, normalizedId, !target.minimized));
  return normalizedId;
}

export function setLightAppWindowRect(windowId, rect = {}, viewport) {
  const normalizedId = normalizeWindowId(windowId);
  if (!normalizedId) return 0;
  replaceRuntime(setWindowRect(shellState.runtime, normalizedId, rect, resolveViewport(viewport)));
  return normalizedId;
}

export function normalizeLightAppWindowsToViewport(viewport) {
  const view = resolveViewport(viewport);
  const windows = Array.isArray(shellState.runtime.windows) ? shellState.runtime.windows : [];
  let next = shellState.runtime;
  windows.forEach((item) => {
    next = setWindowRect(next, item.id, {}, view);
  });
  replaceRuntime(next);
}

export function getVisibleLightAppWindows(viewOptions) {
  const visible = getVisibleWindows(shellState.runtime, viewOptions);
  const fullscreenWindow = findRuntimeWindow(shellState.fullscreenWindowId);
  if (!fullscreenWindow || visible.some((item) => item.id === fullscreenWindow.id)) {
    return visible;
  }
  return [...visible, fullscreenWindow].sort((left, right) => left.zIndex - right.zIndex);
}

export function openLightAppPageMode(code, options = {}) {
  const normalizedCode = normalizeCode(code);
  const app = getLightAppByCode(normalizedCode);
  if (!app) return 0;

  shellState.pageMode.code = app.code;
  shellState.pageMode.source = String(options?.source || '').trim();
  shellState.pageMode.openedAt = Date.now();

  return openLightAppShellWindow(app.code, { ...options, fullscreen: true });
}

export function closeLightAppPageMode() {
  const pageWindowId = resolveLightAppPageModeWindowId(shellState.pageMode.code);
  if (pageWindowId > 0) {
    exitLightAppWindowFullscreen(pageWindowId);
  }
  shellState.pageMode.code = '';
  shellState.pageMode.source = '';
  shellState.pageMode.openedAt = 0;
}

export function __resetLightAppShellForTests() {
  const windows = Array.isArray(shellState.runtime.windows) ? shellState.runtime.windows : [];
  windows.forEach((item) => {
    if (!item?.code || !item?.id) return;
    releaseWindowLinkedStateByCode(item.code, item.id);
  });

  shellState.fullscreenWindowId = 0;
  shellState.pageMode.code = '';
  shellState.pageMode.source = '';
  shellState.pageMode.openedAt = 0;
  replaceRuntime(createWindowRuntimeState());
  activeConsumers = 0;
  unbindListeners();
}
