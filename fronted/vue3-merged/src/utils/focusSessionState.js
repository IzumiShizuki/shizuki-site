import { computed, reactive, readonly } from 'vue';

export const FOCUS_PRESETS = Object.freeze({
  desk: Object.freeze({
    id: 'desk',
    label: 'Desk Focus',
    description: 'Todo 与番茄钟一起准备好',
    appCodes: Object.freeze(['timeprism-todo', 'pomodoro-timer'])
  }),
  quiet: Object.freeze({
    id: 'quiet',
    label: 'Quiet Focus',
    description: '保持环境安静，不主动打开轻应用',
    appCodes: Object.freeze([])
  })
});

const focusState = reactive({
  status: 'idle',
  presetId: 'desk',
  startedAt: 0,
  currentTask: null,
  completionPending: false,
  transitionId: 0
});

const readonlyFocusState = readonly(focusState);

function normalizeModuleCode(value) {
  const normalized = String(value || '').trim().toLowerCase();
  return normalized || 'todo';
}

export function normalizeFocusTask(task) {
  if (!task || typeof task !== 'object') return null;
  const itemId = Number(task.itemId ?? task.todoId ?? task.id);
  const title = String(task.title || '').trim();
  if (!Number.isInteger(itemId) || itemId <= 0 || !title) return null;
  return {
    moduleCode: normalizeModuleCode(task.moduleCode),
    itemId,
    title,
    detail: String(task.detail || '').trim()
  };
}

export function resolveFocusPreset(presetId) {
  const normalized = String(presetId || '').trim().toLowerCase();
  return FOCUS_PRESETS[normalized] || FOCUS_PRESETS.desk;
}

export function startFocusSession(options = {}) {
  const preset = resolveFocusPreset(options.presetId || focusState.presetId);
  const nextTask = normalizeFocusTask(options.task) || focusState.currentTask;

  focusState.status = 'active';
  focusState.presetId = preset.id;
  focusState.startedAt = Number(options.startedAt) > 0 ? Number(options.startedAt) : Date.now();
  focusState.currentTask = nextTask;
  focusState.completionPending = false;
  focusState.transitionId += 1;
  return getFocusSessionSnapshot();
}

export function exitFocusSession() {
  if (focusState.status !== 'active') return getFocusSessionSnapshot();
  focusState.status = 'idle';
  focusState.startedAt = 0;
  focusState.completionPending = false;
  focusState.transitionId += 1;
  return getFocusSessionSnapshot();
}

export function setFocusTask(task) {
  focusState.currentTask = normalizeFocusTask(task);
  focusState.completionPending = false;
  return focusState.currentTask;
}

export function requestFocusTaskCompletion() {
  if (!focusState.currentTask || focusState.completionPending) return null;
  focusState.completionPending = true;
  return { ...focusState.currentTask };
}

export function resolveFocusTaskCompletion(task = {}) {
  const itemId = Number(task.itemId ?? task.todoId ?? task.id);
  if (!focusState.currentTask || itemId !== focusState.currentTask.itemId) return false;
  focusState.currentTask = null;
  focusState.completionPending = false;
  return true;
}

export function clearFocusTask() {
  focusState.currentTask = null;
  focusState.completionPending = false;
}

export function getFocusSessionSnapshot() {
  return {
    status: focusState.status,
    presetId: focusState.presetId,
    startedAt: focusState.startedAt,
    currentTask: focusState.currentTask ? { ...focusState.currentTask } : null,
    completionPending: focusState.completionPending,
    transitionId: focusState.transitionId
  };
}

export function useFocusSession() {
  const isActive = computed(() => readonlyFocusState.status === 'active');
  const preset = computed(() => resolveFocusPreset(readonlyFocusState.presetId));
  const activePresetAppCodes = computed(() => (isActive.value ? preset.value.appCodes.slice() : []));
  const currentTask = computed(() => readonlyFocusState.currentTask);
  const completionPending = computed(() => readonlyFocusState.completionPending);

  return {
    state: readonlyFocusState,
    status: computed(() => readonlyFocusState.status),
    isActive,
    preset,
    activePresetAppCodes,
    currentTask,
    completionPending,
    startFocusSession,
    exitFocusSession,
    setFocusTask,
    requestFocusTaskCompletion,
    resolveFocusTaskCompletion,
    clearFocusTask
  };
}

export function __resetFocusSessionForTests() {
  focusState.status = 'idle';
  focusState.presetId = 'desk';
  focusState.startedAt = 0;
  focusState.currentTask = null;
  focusState.completionPending = false;
  focusState.transitionId = 0;
}
