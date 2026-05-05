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

export const LIGHT_APP_PAGE_MODE_WINDOW_ID_OFFSET = 5000000;

const HEADER_PORTAL_PREFIX = 'lightapp-header-portal-shell';

const shellState = reactive({
  runtime: createWindowRuntimeState(),
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
  return sharedWindowId + LIGHT_APP_PAGE_MODE_WINDOW_ID_OFFSET;
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
  return targetWindowId;
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

export function getVisibleLightAppWindows(isHomeRoute) {
  return getVisibleWindows(shellState.runtime, Boolean(isHomeRoute));
}

export function openLightAppPageMode(code, options = {}) {
  const normalizedCode = normalizeCode(code);
  const app = getLightAppByCode(normalizedCode);
  if (!app) return 0;

  shellState.pageMode.code = app.code;
  shellState.pageMode.source = String(options?.source || '').trim();
  shellState.pageMode.openedAt = Date.now();

  const pageWindowId = resolveLightAppPageModeWindowId(app.code);
  applyOpenPayload(app.code, pageWindowId, options);
  return pageWindowId;
}

export function closeLightAppPageMode() {
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

  const pageCode = normalizeCode(shellState.pageMode.code);
  if (pageCode) {
    const pageWindowId = resolveLightAppPageModeWindowId(pageCode);
    if (pageWindowId > 0) {
      releaseWindowLinkedStateByCode(pageCode, pageWindowId);
    }
  }

  closeLightAppPageMode();
  replaceRuntime(createWindowRuntimeState());
  activeConsumers = 0;
  unbindListeners();
}
