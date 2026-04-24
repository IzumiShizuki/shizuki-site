import { beforeEach, describe, expect, it } from 'vitest';
import { LIGHT_APP_WINDOW_OPEN_EVENT } from '../../utils/lightAppWindowBus';
import {
  __resetLightAppShellForTests,
  closeLightAppPageMode,
  closeLightAppWindow,
  focusLightAppWindow,
  getVisibleLightAppWindows,
  openLightAppPageMode,
  openLightAppShellWindow,
  releaseLightAppShell,
  resolveLightAppHeaderPortalId,
  resolveLightAppHeaderPortalSelector,
  resolveLightAppPageModeWindowId,
  retainLightAppShell,
  toggleLightAppWindowMinimized,
  toggleLightAppWindowPinned,
  useLightAppShellState
} from './lightAppShellStore';
import { resolveTimePrismSuiteSession } from './timeprism/timePrismSuiteState';

describe('lightAppShellStore', () => {
  beforeEach(() => {
    __resetLightAppShellForTests();
  });

  it('opens and manages window actions by shared store', () => {
    const todoWindowId = openLightAppShellWindow('timeprism-todo');
    const pomodoroWindowId = openLightAppShellWindow('pomodoro-timer');
    const state = useLightAppShellState();

    expect(todoWindowId).toBeGreaterThan(0);
    expect(pomodoroWindowId).toBeGreaterThan(0);
    expect(state.runtime.windows).toHaveLength(2);

    focusLightAppWindow(todoWindowId);
    const todo = state.runtime.windows.find((item) => item.id === todoWindowId);
    const pomodoro = state.runtime.windows.find((item) => item.id === pomodoroWindowId);
    expect(todo.zIndex).toBeGreaterThanOrEqual(pomodoro.zIndex);

    toggleLightAppWindowPinned(todoWindowId);
    expect(state.runtime.windows.find((item) => item.id === todoWindowId)?.pinned).toBe(true);

    toggleLightAppWindowMinimized(pomodoroWindowId);
    expect(state.runtime.windows.find((item) => item.id === pomodoroWindowId)?.minimized).toBe(true);

    closeLightAppWindow(todoWindowId);
    expect(state.runtime.windows).toHaveLength(1);
    expect(state.runtime.windows[0].id).toBe(pomodoroWindowId);
  });

  it('keeps page mode in a separated window id namespace', () => {
    const shellWindowId = openLightAppShellWindow('pomodoro-timer');
    const pageWindowId = openLightAppPageMode('pomodoro-timer');
    const state = useLightAppShellState();

    expect(shellWindowId).toBeGreaterThan(0);
    expect(pageWindowId).toBe(resolveLightAppPageModeWindowId('pomodoro-timer'));
    expect(pageWindowId).not.toBe(shellWindowId);
    expect(state.pageMode.code).toBe('pomodoro-timer');

    closeLightAppPageMode();
    expect(state.pageMode.code).toBe('');
  });

  it('applies payload when opening page mode for timeprism', () => {
    const pageWindowId = openLightAppPageMode('timeprism-todo', {
      moduleCode: 'board'
    });
    const session = resolveTimePrismSuiteSession(pageWindowId);

    expect(pageWindowId).toBe(resolveLightAppPageModeWindowId('timeprism-todo'));
    expect(session.activeModule).toBe('board');
  });

  it('keeps compatibility with existing open event bus', () => {
    retainLightAppShell();

    window.dispatchEvent(
      new CustomEvent(LIGHT_APP_WINDOW_OPEN_EVENT, {
        detail: {
          code: 'url-links',
          source: 'test-bus'
        }
      })
    );

    const state = useLightAppShellState();
    expect(state.runtime.windows).toHaveLength(1);
    expect(state.runtime.windows[0].code).toBe('url-links');

    releaseLightAppShell();
  });

  it('resolves visible windows and portal ids', () => {
    const todoWindowId = openLightAppShellWindow('timeprism-todo');
    const pomodoroWindowId = openLightAppShellWindow('pomodoro-timer');
    const state = useLightAppShellState();

    toggleLightAppWindowPinned(todoWindowId);
    expect(getVisibleLightAppWindows(true)).toHaveLength(2);
    expect(getVisibleLightAppWindows(false)).toHaveLength(1);
    expect(getVisibleLightAppWindows(false)[0].id).toBe(pomodoroWindowId);

    expect(resolveLightAppHeaderPortalId(todoWindowId)).toBe(`lightapp-header-portal-shell-${todoWindowId}`);
    expect(resolveLightAppHeaderPortalSelector(todoWindowId)).toBe(`#lightapp-header-portal-shell-${todoWindowId}`);
    expect(resolveLightAppHeaderPortalId(0)).toBe('');
    expect(resolveLightAppHeaderPortalSelector(0)).toBe('');
    expect(state.runtime.windows).toHaveLength(2);
  });
});
