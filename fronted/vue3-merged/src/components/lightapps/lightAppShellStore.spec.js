import { beforeEach, describe, expect, it, vi } from 'vitest';
import { LIGHT_APP_WINDOW_OPEN_EVENT } from '../../utils/lightAppWindowBus';
import {
  __resetLightAppShellForTests,
  closeLightAppPageMode,
  closeLightAppWindow,
  enterLightAppWindowFullscreen,
  exitLightAppWindowFullscreen,
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
  toggleLightAppWindowFullscreen,
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

  it('keeps page-mode compatibility on the shared fullscreen window identity', () => {
    const shellWindowId = openLightAppShellWindow('pomodoro-timer');
    const pageWindowId = openLightAppPageMode('pomodoro-timer');
    const state = useLightAppShellState();

    expect(shellWindowId).toBeGreaterThan(0);
    expect(pageWindowId).toBe(resolveLightAppPageModeWindowId('pomodoro-timer'));
    expect(pageWindowId).toBe(shellWindowId);
    expect(state.pageMode.code).toBe('pomodoro-timer');
    expect(state.fullscreenWindowId).toBe(shellWindowId);

    closeLightAppPageMode();
    expect(state.pageMode.code).toBe('');
    expect(state.fullscreenWindowId).toBe(0);
  });

  it('applies payload when opening page mode for timeprism', () => {
    const pageWindowId = openLightAppPageMode('timeprism-todo', {
      moduleCode: 'board'
    });
    const session = resolveTimePrismSuiteSession(pageWindowId);

    expect(pageWindowId).toBe(resolveLightAppPageModeWindowId('timeprism-todo'));
    expect(session.activeModule).toBe('board');
  });

  it('owns fullscreen exclusively while preserving geometry and restoring minimized windows', () => {
    const todoWindowId = openLightAppShellWindow('timeprism-todo', {}, { width: 1440, height: 900 });
    const timerWindowId = openLightAppShellWindow('pomodoro-timer', {}, { width: 1440, height: 900 });
    const state = useLightAppShellState();
    const todoBefore = { ...state.runtime.windows.find((item) => item.id === todoWindowId) };

    toggleLightAppWindowMinimized(todoWindowId);
    expect(state.runtime.windows.find((item) => item.id === todoWindowId)?.minimized).toBe(true);

    expect(enterLightAppWindowFullscreen(todoWindowId)).toBe(todoWindowId);
    expect(state.fullscreenWindowId).toBe(todoWindowId);
    expect(state.runtime.windows.find((item) => item.id === todoWindowId)?.minimized).toBe(false);

    expect(enterLightAppWindowFullscreen(timerWindowId)).toBe(timerWindowId);
    expect(state.fullscreenWindowId).toBe(timerWindowId);
    expect(exitLightAppWindowFullscreen(timerWindowId)).toBe(timerWindowId);
    expect(state.fullscreenWindowId).toBe(0);

    const todoAfter = state.runtime.windows.find((item) => item.id === todoWindowId);
    expect({ x: todoAfter.x, y: todoAfter.y, width: todoAfter.width, height: todoAfter.height }).toEqual({
      x: todoBefore.x,
      y: todoBefore.y,
      width: todoBefore.width,
      height: todoBefore.height
    });
  });

  it('supports open and toggle fullscreen, and clears ownership on close and reset', () => {
    const state = useLightAppShellState();
    const timerWindowId = openLightAppShellWindow('pomodoro-timer', { fullscreen: true });

    expect(state.fullscreenWindowId).toBe(timerWindowId);
    expect(toggleLightAppWindowFullscreen(timerWindowId)).toBe(timerWindowId);
    expect(state.fullscreenWindowId).toBe(0);
    expect(toggleLightAppWindowFullscreen(timerWindowId)).toBe(timerWindowId);
    expect(state.fullscreenWindowId).toBe(timerWindowId);

    closeLightAppWindow(timerWindowId);
    expect(state.fullscreenWindowId).toBe(0);

    const todoWindowId = openLightAppShellWindow('timeprism-todo', { fullscreen: true });
    expect(state.fullscreenWindowId).toBe(todoWindowId);
    __resetLightAppShellForTests();
    expect(state.fullscreenWindowId).toBe(0);
  });

  it('ignores unknown fullscreen ids and keeps the fullscreen owner visible across route rules', () => {
    const todoWindowId = openLightAppShellWindow('timeprism-todo');
    toggleLightAppWindowPinned(todoWindowId);
    enterLightAppWindowFullscreen(todoWindowId);
    const state = useLightAppShellState();

    expect(enterLightAppWindowFullscreen(999999)).toBe(0);
    expect(exitLightAppWindowFullscreen(999999)).toBe(0);
    expect(state.fullscreenWindowId).toBe(todoWindowId);
    expect(getVisibleLightAppWindows(false).map((item) => item.id)).toContain(todoWindowId);
    expect(
      getVisibleLightAppWindows({
        isFocusActive: true,
        focusAppCodes: ['pomodoro-timer']
      }).map((item) => item.id)
    ).toContain(todoWindowId);
  });

  it('dispatches resize after entering and leaving fullscreen', () => {
    const resizeListener = vi.fn();
    window.addEventListener('resize', resizeListener);
    const windowId = openLightAppShellWindow('qr-tools');

    enterLightAppWindowFullscreen(windowId);
    exitLightAppWindowFullscreen(windowId);

    expect(resizeListener).toHaveBeenCalledTimes(2);
    window.removeEventListener('resize', resizeListener);
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

    expect(
      getVisibleLightAppWindows({
        isFocusActive: true,
        focusAppCodes: ['pomodoro-timer']
      }).map((item) => item.id)
    ).toEqual([pomodoroWindowId]);

    expect(resolveLightAppHeaderPortalId(todoWindowId)).toBe(`lightapp-header-portal-shell-${todoWindowId}`);
    expect(resolveLightAppHeaderPortalSelector(todoWindowId)).toBe(`#lightapp-header-portal-shell-${todoWindowId}`);
    expect(resolveLightAppHeaderPortalId(0)).toBe('');
    expect(resolveLightAppHeaderPortalSelector(0)).toBe('');
    expect(state.runtime.windows).toHaveLength(2);
  });
});
