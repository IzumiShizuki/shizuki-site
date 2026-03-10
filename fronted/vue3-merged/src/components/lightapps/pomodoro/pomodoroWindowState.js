import { reactive } from 'vue';

export const POMODORO_MODE_FOCUS = 'focus';
export const POMODORO_MODE_SHORT_BREAK = 'short_break';
export const POMODORO_MODE_LONG_BREAK = 'long_break';

export const POMODORO_MODE_ITEMS = Object.freeze([
  { mode: POMODORO_MODE_FOCUS, label: '专注', iconClass: 'fas fa-bullseye' },
  { mode: POMODORO_MODE_SHORT_BREAK, label: '短休息', iconClass: 'fas fa-mug-hot' },
  { mode: POMODORO_MODE_LONG_BREAK, label: '长休息', iconClass: 'fas fa-couch' }
]);

const MODE_SET = new Set(POMODORO_MODE_ITEMS.map((item) => item.mode));
const windowStateMap = new Map();

function normalizeWindowId(windowId) {
  const normalized = Number(windowId);
  if (!Number.isInteger(normalized) || normalized <= 0) {
    return 0;
  }
  return normalized;
}

export function normalizePomodoroMode(mode) {
  const normalized = String(mode || '').trim().toLowerCase();
  return MODE_SET.has(normalized) ? normalized : POMODORO_MODE_FOCUS;
}

function createPomodoroWindowState() {
  return reactive({
    mode: POMODORO_MODE_FOCUS,
    requestModeChange: null
  });
}

export function resolvePomodoroWindowState(windowId) {
  const key = normalizeWindowId(windowId);
  if (!windowStateMap.has(key)) {
    windowStateMap.set(key, createPomodoroWindowState());
  }
  return windowStateMap.get(key);
}

export function releasePomodoroWindowState(windowId) {
  const key = normalizeWindowId(windowId);
  windowStateMap.delete(key);
}

export function registerPomodoroModeChangeHandler(windowId, handler) {
  const state = resolvePomodoroWindowState(windowId);
  state.requestModeChange = typeof handler === 'function' ? handler : null;
  return state;
}

export function setPomodoroWindowMode(windowId, mode) {
  const state = resolvePomodoroWindowState(windowId);
  const normalized = normalizePomodoroMode(mode);
  if (typeof state.requestModeChange === 'function') {
    state.requestModeChange(normalized);
    return state;
  }
  state.mode = normalized;
  return state;
}
