import { describe, expect, it } from 'vitest';
import {
  TIMEPRISM_MODULE_BOARD,
  TIMEPRISM_MODULE_TODO,
  TODO_VIEW_ALL,
  TODO_VIEW_DONE,
  TODO_VIEW_OPEN,
  UNASSIGNED_PROJECT_FILTER_ID,
  createTimePrismSuiteSessionState,
  bumpSuiteProjectVersion,
  filterTodosByViewAndProjects,
  normalizeProjectFilterIds,
  openTodoWithProjectFilter,
  setSuiteActiveModule,
  setSuiteProjectFilters
} from './timePrismSuiteState';

describe('timePrismSuiteState', () => {
  it('creates session state with todo default and empty project filters', () => {
    const state = createTimePrismSuiteSessionState();
    expect(state.activeModule).toBe(TIMEPRISM_MODULE_TODO);
    expect(state.selectedProjectIds).toEqual([]);
  });

  it('switches active module and falls back to todo on unknown values', () => {
    const state = createTimePrismSuiteSessionState();
    setSuiteActiveModule(state, TIMEPRISM_MODULE_BOARD);
    expect(state.activeModule).toBe(TIMEPRISM_MODULE_BOARD);

    setSuiteActiveModule(state, 'unknown-module');
    expect(state.activeModule).toBe(TIMEPRISM_MODULE_TODO);
  });

  it('normalizes project filters and supports dedupe + unassigned filter id', () => {
    expect(normalizeProjectFilterIds([1, '1', 2, 0, -1, 'abc', 0])).toEqual([1, 2, UNASSIGNED_PROJECT_FILTER_ID]);

    const state = createTimePrismSuiteSessionState();
    setSuiteProjectFilters(state, [2, 2, 3, UNASSIGNED_PROJECT_FILTER_ID]);
    expect(state.selectedProjectIds).toEqual([2, 3, UNASSIGNED_PROJECT_FILTER_ID]);

    bumpSuiteProjectVersion(state);
    bumpSuiteProjectVersion(state);
    expect(state.projectVersion).toBe(2);
  });

  it('opens todo with single project filter when triggered from projects module', () => {
    const state = createTimePrismSuiteSessionState({
      activeModule: TIMEPRISM_MODULE_BOARD,
      selectedProjectIds: [2, 3]
    });

    openTodoWithProjectFilter(state, 99);
    expect(state.activeModule).toBe(TIMEPRISM_MODULE_TODO);
    expect(state.selectedProjectIds).toEqual([99]);
  });

  it('filters todos by completion status and selected projects', () => {
    const todos = [
      { todoId: 1, done: false, projectId: 1 },
      { todoId: 2, done: true, projectId: 1 },
      { todoId: 3, done: false, projectId: 2 },
      { todoId: 4, done: false, projectId: null }
    ];

    expect(filterTodosByViewAndProjects(todos, TODO_VIEW_ALL, [])).toHaveLength(4);
    expect(filterTodosByViewAndProjects(todos, TODO_VIEW_OPEN, [1]).map((item) => item.todoId)).toEqual([1]);
    expect(filterTodosByViewAndProjects(todos, TODO_VIEW_DONE, [1]).map((item) => item.todoId)).toEqual([2]);
    expect(
      filterTodosByViewAndProjects(todos, TODO_VIEW_OPEN, [UNASSIGNED_PROJECT_FILTER_ID]).map((item) => item.todoId)
    ).toEqual([4]);
  });
});
