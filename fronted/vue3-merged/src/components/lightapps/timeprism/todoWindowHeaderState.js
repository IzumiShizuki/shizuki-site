import { reactive } from 'vue';
import { TODO_VIEW_ALL, normalizeTodoViewFilter } from './timePrismSuiteState';

export const TODO_PRIORITY_ITEMS = Object.freeze([
  { value: 'LOW', label: '低' },
  { value: 'MEDIUM', label: '中' },
  { value: 'HIGH', label: '高' }
]);

export const TODO_TIMING_MODE_ITEMS = Object.freeze([
  { value: 'DEADLINE', label: '截止' },
  { value: 'RANGE', label: '范围' }
]);

export const TODO_TIME_PRECISION_ITEMS = Object.freeze([
  { value: 'MINUTE', label: '分钟' },
  { value: 'DAY', label: '日级' }
]);

const PRIORITY_SET = new Set(TODO_PRIORITY_ITEMS.map((item) => item.value));
const TIMING_MODE_SET = new Set(TODO_TIMING_MODE_ITEMS.map((item) => item.value));
const TIME_PRECISION_SET = new Set(TODO_TIME_PRECISION_ITEMS.map((item) => item.value));
const windowStateMap = new Map();

function normalizeWindowId(windowId) {
  const normalized = Number(windowId);
  if (!Number.isInteger(normalized) || normalized <= 0) {
    return 0;
  }
  return normalized;
}

function normalizeCount(value) {
  const normalized = Number(value);
  if (!Number.isFinite(normalized) || normalized < 0) {
    return 0;
  }
  return Math.round(normalized);
}

function normalizeProjectIdValue(value) {
  const normalized = Number(value);
  if (!Number.isInteger(normalized) || normalized <= 0) {
    return '';
  }
  return String(normalized);
}

function normalizeProjectOption(item) {
  const projectId = Number(item?.projectId);
  if (!Number.isInteger(projectId) || projectId <= 0) return null;
  const fallbackName = `项目#${projectId}`;
  return {
    projectId,
    name: String(item?.name || fallbackName).trim() || fallbackName,
    color: String(item?.color || '').trim() || '#6aa9ff'
  };
}

function normalizeProjectOptions(input) {
  const source = Array.isArray(input) ? input : [];
  return source.map(normalizeProjectOption).filter(Boolean);
}

function createDefaultDraft() {
  return {
    title: '',
    detail: '',
    projectId: '',
    priority: 'MEDIUM',
    dueAt: '',
    timingMode: 'DEADLINE',
    rangeStartAt: '',
    timePrecision: 'MINUTE',
    showOnCalendar: true,
    reminderEnabled: false,
    startRemindValue: null,
    startRemindUnit: 'MINUTE',
    deadlineRemindValue: null,
    deadlineRemindUnit: 'MINUTE'
  };
}

export function normalizeTodoPriority(value) {
  const normalized = String(value || '').trim().toUpperCase();
  return PRIORITY_SET.has(normalized) ? normalized : 'MEDIUM';
}

export function normalizeTodoTimingMode(value) {
  const normalized = String(value || '').trim().toUpperCase();
  return TIMING_MODE_SET.has(normalized) ? normalized : 'DEADLINE';
}

export function normalizeTodoTimePrecision(value) {
  const normalized = String(value || '').trim().toUpperCase();
  return TIME_PRECISION_SET.has(normalized) ? normalized : 'MINUTE';
}

function createTodoWindowHeaderState() {
  return reactive({
    showCreateForm: false,
    showRecurringPanel: false,
    viewFilter: TODO_VIEW_ALL,
    projectOptions: [],
    hasUnassignedTodos: false,
    openCount: 0,
    totalCount: 0,
    draft: createDefaultDraft(),
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

export function syncTodoWindowHeaderMeta(windowId, snapshot = {}) {
  const state = resolveTodoWindowHeaderState(windowId);
  state.projectOptions = normalizeProjectOptions(snapshot.projectOptions);
  state.hasUnassignedTodos = Boolean(snapshot.hasUnassignedTodos);
  state.openCount = normalizeCount(snapshot.openCount);
  state.totalCount = normalizeCount(snapshot.totalCount);
  return state;
}

export function setTodoWindowViewFilter(windowId, viewFilter) {
  const state = resolveTodoWindowHeaderState(windowId);
  state.viewFilter = normalizeTodoViewFilter(viewFilter);
  return state;
}

export function patchTodoWindowDraft(windowId, patch = {}) {
  const state = resolveTodoWindowHeaderState(windowId);
  if (Object.prototype.hasOwnProperty.call(patch, 'projectId')) {
    state.draft.projectId = normalizeProjectIdValue(patch.projectId);
  }
  if (Object.prototype.hasOwnProperty.call(patch, 'priority')) {
    state.draft.priority = normalizeTodoPriority(patch.priority);
  }
  if (Object.prototype.hasOwnProperty.call(patch, 'timingMode')) {
    state.draft.timingMode = normalizeTodoTimingMode(patch.timingMode);
  }
  if (Object.prototype.hasOwnProperty.call(patch, 'timePrecision')) {
    state.draft.timePrecision = normalizeTodoTimePrecision(patch.timePrecision);
  }
  if (Object.prototype.hasOwnProperty.call(patch, 'showOnCalendar')) {
    state.draft.showOnCalendar = Boolean(patch.showOnCalendar);
  }
  if (Object.prototype.hasOwnProperty.call(patch, 'reminderEnabled')) {
    state.draft.reminderEnabled = Boolean(patch.reminderEnabled);
  }
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
