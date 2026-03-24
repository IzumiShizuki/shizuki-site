import { reactive } from 'vue';

export const BLOG_PRESENTATION_SCOPE_PUBLIC = 'public';
export const BLOG_PRESENTATION_SCOPE_MINE = 'mine';

const SCOPE_SET = new Set([BLOG_PRESENTATION_SCOPE_PUBLIC, BLOG_PRESENTATION_SCOPE_MINE]);
const windowStateMap = new Map();

function normalizeWindowId(windowId) {
  const normalized = Number(windowId);
  if (!Number.isInteger(normalized) || normalized <= 0) {
    return 0;
  }
  return normalized;
}

export function normalizeBlogPresentationPostId(value) {
  const normalized = Number(value);
  if (!Number.isFinite(normalized) || normalized <= 0) {
    return 0;
  }
  return Math.trunc(normalized);
}

export function normalizeBlogPresentationScope(value, allowMine = true) {
  const normalized = String(value || '').trim().toLowerCase();
  if (normalized === BLOG_PRESENTATION_SCOPE_MINE && allowMine) {
    return BLOG_PRESENTATION_SCOPE_MINE;
  }
  return BLOG_PRESENTATION_SCOPE_PUBLIC;
}

function createBlogPresentationWindowState() {
  return reactive({
    postId: 0,
    scope: BLOG_PRESENTATION_SCOPE_PUBLIC
  });
}

export function resolveBlogPresentationWindowState(windowId) {
  const key = normalizeWindowId(windowId);
  if (!windowStateMap.has(key)) {
    windowStateMap.set(key, createBlogPresentationWindowState());
  }
  return windowStateMap.get(key);
}

export function releaseBlogPresentationWindowState(windowId) {
  const key = normalizeWindowId(windowId);
  windowStateMap.delete(key);
}

export function setBlogPresentationWindowEntry(windowId, input = {}) {
  const state = resolveBlogPresentationWindowState(windowId);
  const nextPostId = normalizeBlogPresentationPostId(input.postId);
  const rawScope = String(input.scope || '').trim().toLowerCase();

  if (nextPostId > 0) {
    state.postId = nextPostId;
  }

  if (SCOPE_SET.has(rawScope)) {
    state.scope = normalizeBlogPresentationScope(rawScope, true);
  }

  return state;
}
