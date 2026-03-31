import { describe, expect, it, vi } from 'vitest';
import {
  patchTodoWindowDraft,
  registerTodoWindowHeaderHandlers,
  releaseTodoWindowHeaderState,
  resolveTodoWindowHeaderState,
  setTodoWindowViewFilter,
  syncTodoWindowHeaderMeta,
  toggleTodoWindowCreateForm,
  toggleTodoWindowRecurringPanel
} from './todoWindowHeaderState';
import { TODO_VIEW_ALL, TODO_VIEW_DONE } from './timePrismSuiteState';

describe('todoWindowHeaderState', () => {
  it('creates per-window state with compact todo defaults', () => {
    const state = resolveTodoWindowHeaderState(701);
    expect(state.viewFilter).toBe(TODO_VIEW_ALL);
    expect(state.showCreateForm).toBe(false);
    expect(state.draft.priority).toBe('MEDIUM');

    releaseTodoWindowHeaderState(701);
  });

  it('normalizes header metadata and draft patch values', () => {
    syncTodoWindowHeaderMeta(702, {
      projectOptions: [
        { projectId: 3, name: '学习', color: '#ffaa00' },
        { projectId: 0, name: 'ignored' }
      ],
      hasUnassignedTodos: 1,
      openCount: 5.2,
      totalCount: '9'
    });
    patchTodoWindowDraft(702, {
      projectId: '3',
      priority: 'high',
      timingMode: 'range',
      timePrecision: 'day',
      showOnCalendar: 0,
      reminderEnabled: 1
    });
    setTodoWindowViewFilter(702, TODO_VIEW_DONE);

    const state = resolveTodoWindowHeaderState(702);
    expect(state.projectOptions).toEqual([{ projectId: 3, name: '学习', color: '#ffaa00' }]);
    expect(state.hasUnassignedTodos).toBe(true);
    expect(state.openCount).toBe(5);
    expect(state.totalCount).toBe(9);
    expect(state.viewFilter).toBe(TODO_VIEW_DONE);
    expect(state.draft).toMatchObject({
      projectId: '3',
      priority: 'HIGH',
      timingMode: 'RANGE',
      timePrecision: 'DAY',
      showOnCalendar: false,
      reminderEnabled: true
    });

    releaseTodoWindowHeaderState(702);
  });

  it('delegates create and recurring toggles to registered handlers', () => {
    const toggleCreateForm = vi.fn();
    const toggleRecurringPanel = vi.fn();

    registerTodoWindowHeaderHandlers(703, {
      toggleCreateForm,
      toggleRecurringPanel
    });

    toggleTodoWindowCreateForm(703);
    toggleTodoWindowRecurringPanel(703);

    expect(toggleCreateForm).toHaveBeenCalledTimes(1);
    expect(toggleRecurringPanel).toHaveBeenCalledTimes(1);

    registerTodoWindowHeaderHandlers(703, null);
    releaseTodoWindowHeaderState(703);
  });
});
