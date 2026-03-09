export const TIMEPRISM_SUITE_CONTEXT_KEY = Symbol('timeprism-suite-context');

export const TIMEPRISM_MODULE_TODO = 'todo';
export const TIMEPRISM_MODULE_BOARD = 'board';
export const TIMEPRISM_MODULE_SCHEDULE = 'schedule';
export const TIMEPRISM_MODULE_PROJECTS = 'projects';

export const TODO_VIEW_ALL = 'ALL';
export const TODO_VIEW_OPEN = 'OPEN';
export const TODO_VIEW_DONE = 'DONE';

export const UNASSIGNED_PROJECT_FILTER_ID = 0;

const MODULE_CODES = Object.freeze([
  TIMEPRISM_MODULE_TODO,
  TIMEPRISM_MODULE_BOARD,
  TIMEPRISM_MODULE_SCHEDULE,
  TIMEPRISM_MODULE_PROJECTS
]);

const TODO_VIEW_FILTERS = Object.freeze([TODO_VIEW_ALL, TODO_VIEW_OPEN, TODO_VIEW_DONE]);

export function normalizeSuiteModule(code) {
  const normalized = String(code || '').trim().toLowerCase();
  return MODULE_CODES.includes(normalized) ? normalized : TIMEPRISM_MODULE_TODO;
}

export function normalizeProjectFilterIds(input) {
  const source = Array.isArray(input) ? input : [];
  const seen = new Set();
  const next = [];

  source.forEach((item) => {
    const normalized = Number(item);
    if (!Number.isInteger(normalized) || normalized < 0) return;
    if (seen.has(normalized)) return;
    seen.add(normalized);
    next.push(normalized);
  });

  return next;
}

export function normalizeTodoViewFilter(value) {
  const normalized = String(value || '').trim().toUpperCase();
  return TODO_VIEW_FILTERS.includes(normalized) ? normalized : TODO_VIEW_ALL;
}

export function createTimePrismSuiteSessionState(seed = {}) {
  return {
    activeModule: normalizeSuiteModule(seed.activeModule),
    selectedProjectIds: normalizeProjectFilterIds(seed.selectedProjectIds)
  };
}

export function setSuiteActiveModule(state, code) {
  if (!state || typeof state !== 'object') return state;
  state.activeModule = normalizeSuiteModule(code);
  return state;
}

export function setSuiteProjectFilters(state, ids) {
  if (!state || typeof state !== 'object') return state;
  state.selectedProjectIds = normalizeProjectFilterIds(ids);
  return state;
}

export function openTodoWithProjectFilter(state, projectId) {
  if (!state || typeof state !== 'object') return state;
  state.activeModule = TIMEPRISM_MODULE_TODO;
  const normalized = Number(projectId);
  if (!Number.isInteger(normalized) || normalized <= 0) {
    state.selectedProjectIds = [];
    return state;
  }
  state.selectedProjectIds = [normalized];
  return state;
}

export function filterTodosByViewAndProjects(todos, viewFilter, projectFilterIds) {
  const source = Array.isArray(todos) ? todos : [];
  const normalizedView = normalizeTodoViewFilter(viewFilter);
  const normalizedProjectFilters = normalizeProjectFilterIds(projectFilterIds);
  const projectFilterSet = new Set(normalizedProjectFilters);
  const useProjectFilter = projectFilterSet.size > 0;

  return source.filter((todo) => {
    const done = Boolean(todo?.done);
    if (normalizedView === TODO_VIEW_OPEN && done) return false;
    if (normalizedView === TODO_VIEW_DONE && !done) return false;

    if (!useProjectFilter) return true;

    const projectId = Number(todo?.projectId);
    const normalizedProjectId =
      Number.isInteger(projectId) && projectId > 0 ? projectId : UNASSIGNED_PROJECT_FILTER_ID;
    return projectFilterSet.has(normalizedProjectId);
  });
}
