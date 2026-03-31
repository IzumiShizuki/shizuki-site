import { describe, expect, it, vi } from 'vitest';
import {
  registerTodoWindowHeaderHandlers,
  releaseTodoWindowHeaderState,
  resolveTodoWindowHeaderState,
  toggleTodoWindowCreateForm,
  toggleTodoWindowRecurringPanel
} from './todoWindowHeaderState';

describe('todoWindowHeaderState', () => {
  it('creates per-window state with closed header actions by default', () => {
    const state = resolveTodoWindowHeaderState(701);
    expect(state.showCreateForm).toBe(false);
    expect(state.showRecurringPanel).toBe(false);

    releaseTodoWindowHeaderState(701);
  });

  it('toggles local fallback flags when no handlers are registered', () => {
    toggleTodoWindowCreateForm(702);
    toggleTodoWindowRecurringPanel(702);

    const state = resolveTodoWindowHeaderState(702);
    expect(state.showCreateForm).toBe(true);
    expect(state.showRecurringPanel).toBe(true);

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
