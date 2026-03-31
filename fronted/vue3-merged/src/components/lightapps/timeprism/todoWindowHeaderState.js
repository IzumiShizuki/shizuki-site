import { reactive } from 'vue';

const windowStateMap = new Map();

function normalizeWindowId(windowId) {
  const normalized = Number(windowId);
  if (!Number.isInteger(normalized) || normalized <= 0) {
    return 0;
  }
  return normalized;
}

function createTodoWindowHeaderState() {
  return reactive({
    showCreateForm: false,
    showRecurringPanel: false,
    requestToggleCreateForm: null,
    requestToggleRecurringPanel: null
  });
}

export function resolveTodoWindowHeaderState(windowId) {
  const key = normalizeWindowId(windowId);
  if (!windowStateMap.has(key)) {
    windowStateMap.set(key, createTodoWindowHeaderState());
  }
  return windowStateMap.get(key);
}

export function releaseTodoWindowHeaderState(windowId) {
  const key = normalizeWindowId(windowId);
  windowStateMap.delete(key);
}

export function registerTodoWindowHeaderHandlers(windowId, handlers) {
  const state = resolveTodoWindowHeaderState(windowId);
  state.requestToggleCreateForm = typeof handlers?.toggleCreateForm === 'function' ? handlers.toggleCreateForm : null;
  state.requestToggleRecurringPanel =
    typeof handlers?.toggleRecurringPanel === 'function' ? handlers.toggleRecurringPanel : null;
  return state;
}

export function toggleTodoWindowCreateForm(windowId) {
  const state = resolveTodoWindowHeaderState(windowId);
  if (typeof state.requestToggleCreateForm === 'function') {
    state.requestToggleCreateForm();
    return state;
  }
  state.showCreateForm = !state.showCreateForm;
  return state;
}

export function toggleTodoWindowRecurringPanel(windowId) {
  const state = resolveTodoWindowHeaderState(windowId);
  if (typeof state.requestToggleRecurringPanel === 'function') {
    state.requestToggleRecurringPanel();
    return state;
  }
  state.showRecurringPanel = !state.showRecurringPanel;
  return state;
}
