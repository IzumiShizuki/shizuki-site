import { describe, expect, it } from 'vitest';
import {
  closeWindow,
  createWindowRuntimeState,
  focusWindow,
  getVisibleWindows,
  openOrFocusWindow,
  setWindowRect,
  toggleWindowPinned
} from './lightAppWindowRuntime';

describe('lightAppWindowRuntime', () => {
  it('opens multiple windows and keeps unique id', () => {
    let state = createWindowRuntimeState();
    state = openOrFocusWindow(state, { code: 'timeprism-todo', title: 'Todo' }, { width: 1280, height: 720 });
    state = openOrFocusWindow(state, { code: 'timeprism-schedule', title: 'Schedule' }, { width: 1280, height: 720 });

    expect(state.windows).toHaveLength(2);
    expect(state.windows[0].id).not.toBe(state.windows[1].id);
  });

  it('focuses existed app window instead of duplicating same code', () => {
    let state = createWindowRuntimeState();
    state = openOrFocusWindow(state, { code: 'timeprism-todo', title: 'Todo' }, { width: 1280, height: 720 });
    const firstZ = state.windows[0].zIndex;
    state = openOrFocusWindow(state, { code: 'timeprism-todo', title: 'Todo' }, { width: 1280, height: 720 });

    expect(state.windows).toHaveLength(1);
    expect(state.windows[0].zIndex).toBeGreaterThan(firstZ);
  });

  it('supports focus, resize and close', () => {
    let state = createWindowRuntimeState();
    state = openOrFocusWindow(state, { code: 'timeprism-todo', title: 'Todo' }, { width: 1280, height: 720 });
    state = openOrFocusWindow(state, { code: 'timeprism-board', title: 'Board' }, { width: 1280, height: 720 });

    const todoId = state.windows.find((item) => item.code === 'timeprism-todo').id;
    const boardId = state.windows.find((item) => item.code === 'timeprism-board').id;

    state = focusWindow(state, todoId);
    const todo = state.windows.find((item) => item.id === todoId);
    const board = state.windows.find((item) => item.id === boardId);
    expect(todo.zIndex).toBeGreaterThan(board.zIndex);

    state = setWindowRect(state, todoId, { width: 660, height: 520, x: 80, y: 120 }, { width: 1366, height: 900 });
    const resized = state.windows.find((item) => item.id === todoId);
    expect(resized.width).toBe(660);
    expect(resized.height).toBe(520);

    state = closeWindow(state, boardId);
    expect(state.windows).toHaveLength(1);
    expect(state.windows[0].code).toBe('timeprism-todo');
  });

  it('filters pinned windows outside home route', () => {
    let state = createWindowRuntimeState();
    state = openOrFocusWindow(state, { code: 'timeprism-todo', title: 'Todo' }, { width: 1280, height: 720 });
    state = openOrFocusWindow(state, { code: 'timeprism-schedule', title: 'Schedule' }, { width: 1280, height: 720 });

    const todoId = state.windows.find((item) => item.code === 'timeprism-todo').id;
    state = toggleWindowPinned(state, todoId);

    expect(getVisibleWindows(state, true)).toHaveLength(2);
    expect(getVisibleWindows(state, false)).toHaveLength(1);
    expect(getVisibleWindows(state, false)[0].code).toBe('timeprism-schedule');
  });
});
