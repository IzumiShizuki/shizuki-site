const DEFAULT_WIDTH = 420;
const DEFAULT_HEIGHT = 360;
const MIN_WIDTH = 300;
const MIN_HEIGHT = 220;
const EDGE_PADDING = 12;
const BASE_Z_INDEX = 2400;
export const LIGHT_APP_SHARED_WINDOW_IDS = Object.freeze({
  'timeprism-todo': 910001,
  'pomodoro-timer': 910002,
  'balance-ledger': 910003,
  'url-links': 910004,
  'board-canvas': 910005,
  'blog-slidev': 910006
});
const WINDOW_PRESETS = Object.freeze({
  'timeprism-todo': {
    widthRatio: 0.58,
    heightRatio: 0.76,
    minWidth: 760,
    minHeight: 520,
    maxWidthRatio: 0.86,
    maxHeightRatio: 0.9
  },
  'board-canvas': {
    widthRatio: 0.78,
    heightRatio: 0.82,
    minWidth: 920,
    minHeight: 620,
    maxWidthRatio: 0.94,
    maxHeightRatio: 0.92
  },
  'blog-slidev': {
    widthRatio: 0.76,
    heightRatio: 0.84,
    minWidth: 980,
    minHeight: 620,
    maxWidthRatio: 0.94,
    maxHeightRatio: 0.94
  }
});

function clamp(value, min, max) {
  if (value < min) return min;
  if (value > max) return max;
  return value;
}

function withFallbackViewport(viewport) {
  const width = Number(viewport?.width) > 0 ? Number(viewport.width) : 1280;
  const height = Number(viewport?.height) > 0 ? Number(viewport.height) : 720;
  return { width, height };
}

function resolveInitialRect(viewport, index, code) {
  const view = withFallbackViewport(viewport);
  const preset = WINDOW_PRESETS[String(code || '').trim()] || null;
  const widthRatio = Number(preset?.widthRatio) > 0 ? Number(preset.widthRatio) : 0.34;
  const heightRatio = Number(preset?.heightRatio) > 0 ? Number(preset.heightRatio) : 0.46;
  const maxWidthRatio = Number(preset?.maxWidthRatio) > 0 ? Number(preset.maxWidthRatio) : 0.68;
  const maxHeightRatio = Number(preset?.maxHeightRatio) > 0 ? Number(preset.maxHeightRatio) : 0.76;
  const presetMinWidth = Number(preset?.minWidth) > 0 ? Number(preset.minWidth) : MIN_WIDTH;
  const presetMinHeight = Number(preset?.minHeight) > 0 ? Number(preset.minHeight) : MIN_HEIGHT;
  const width = clamp(
    Math.round(view.width * widthRatio),
    Math.max(MIN_WIDTH, presetMinWidth),
    Math.max(Math.max(MIN_WIDTH, presetMinWidth), Math.min(Math.round(view.width * maxWidthRatio), view.width - EDGE_PADDING * 2))
  );
  const height = clamp(
    Math.round(view.height * heightRatio),
    Math.max(MIN_HEIGHT, presetMinHeight),
    Math.max(Math.max(MIN_HEIGHT, presetMinHeight), Math.min(Math.round(view.height * maxHeightRatio), view.height - EDGE_PADDING * 2))
  );

  const cascadeOffset = index * 24;
  const x = clamp(EDGE_PADDING + cascadeOffset, EDGE_PADDING, Math.max(EDGE_PADDING, view.width - width - EDGE_PADDING));
  const y = clamp(76 + cascadeOffset, EDGE_PADDING, Math.max(EDGE_PADDING, view.height - height - EDGE_PADDING));

  return { x, y, width, height };
}

function normalizeWindowRect(viewport, rect) {
  const view = withFallbackViewport(viewport);
  const width = clamp(Number(rect.width) || DEFAULT_WIDTH, MIN_WIDTH, Math.max(MIN_WIDTH, view.width - EDGE_PADDING * 2));
  const height = clamp(Number(rect.height) || DEFAULT_HEIGHT, MIN_HEIGHT, Math.max(MIN_HEIGHT, view.height - EDGE_PADDING * 2));
  const x = clamp(Number(rect.x) || EDGE_PADDING, EDGE_PADDING, Math.max(EDGE_PADDING, view.width - width - EDGE_PADDING));
  const y = clamp(Number(rect.y) || EDGE_PADDING, EDGE_PADDING, Math.max(EDGE_PADDING, view.height - height - EDGE_PADDING));
  return { x, y, width, height };
}

function cloneState(state) {
  return {
    nextId: Number(state?.nextId) > 0 ? Number(state.nextId) : 1,
    nextZIndex: Number(state?.nextZIndex) > 0 ? Number(state.nextZIndex) : BASE_Z_INDEX,
    windows: Array.isArray(state?.windows) ? state.windows.map((item) => ({ ...item })) : []
  };
}

export function createWindowRuntimeState() {
  return {
    nextId: 1,
    nextZIndex: BASE_Z_INDEX,
    windows: []
  };
}

export function openOrFocusWindow(state, appMeta, viewport) {
  const next = cloneState(state);
  const code = String(appMeta?.code || '').trim();
  if (!code) return next;
  const sharedWindowId = Number(LIGHT_APP_SHARED_WINDOW_IDS[code]) || 0;

  const existedIndex = next.windows.findIndex((item) => item.code === code);
  if (existedIndex >= 0) {
    next.nextZIndex += 1;
    const existed = next.windows[existedIndex];
    existed.zIndex = next.nextZIndex;
    existed.minimized = false;
    return next;
  }

  const rect = resolveInitialRect(viewport, next.windows.length, code);
  next.nextZIndex += 1;
  next.windows.push({
    id: sharedWindowId || next.nextId,
    code,
    title: String(appMeta?.title || code),
    iconClass: String(appMeta?.iconClass || 'fas fa-window-maximize'),
    x: rect.x,
    y: rect.y,
    width: rect.width,
    height: rect.height,
    zIndex: next.nextZIndex,
    minimized: false,
    pinned: false
  });
  if (!sharedWindowId) {
    next.nextId += 1;
  }
  return next;
}

export function closeWindow(state, id) {
  const next = cloneState(state);
  const numericId = Number(id);
  next.windows = next.windows.filter((item) => item.id !== numericId);
  return next;
}

export function focusWindow(state, id) {
  const next = cloneState(state);
  const numericId = Number(id);
  const index = next.windows.findIndex((item) => item.id === numericId);
  if (index < 0) return next;
  next.nextZIndex += 1;
  next.windows[index].zIndex = next.nextZIndex;
  return next;
}

export function setWindowMinimized(state, id, minimized) {
  const next = cloneState(state);
  const numericId = Number(id);
  const index = next.windows.findIndex((item) => item.id === numericId);
  if (index < 0) return next;
  next.windows[index].minimized = Boolean(minimized);
  return next;
}

export function toggleWindowPinned(state, id) {
  const next = cloneState(state);
  const numericId = Number(id);
  const index = next.windows.findIndex((item) => item.id === numericId);
  if (index < 0) return next;
  next.windows[index].pinned = !next.windows[index].pinned;
  return next;
}

export function setWindowRect(state, id, rect, viewport) {
  const next = cloneState(state);
  const numericId = Number(id);
  const index = next.windows.findIndex((item) => item.id === numericId);
  if (index < 0) return next;
  const normalized = normalizeWindowRect(viewport, {
    ...next.windows[index],
    ...rect
  });
  next.windows[index] = {
    ...next.windows[index],
    ...normalized
  };
  return next;
}

export function getVisibleWindows(state, isHomeRoute) {
  const source = Array.isArray(state?.windows) ? state.windows : [];
  if (isHomeRoute) {
    return source.slice().sort((left, right) => left.zIndex - right.zIndex);
  }
  return source.filter((item) => !item.pinned).sort((left, right) => left.zIndex - right.zIndex);
}
