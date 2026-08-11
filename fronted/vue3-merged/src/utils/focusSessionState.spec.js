import { beforeEach, describe, expect, it } from 'vitest';
import {
  __resetFocusSessionForTests,
  exitFocusSession,
  requestFocusTaskCompletion,
  resolveFocusPreset,
  resolveFocusTaskCompletion,
  setFocusTask,
  startFocusSession,
  useFocusSession
} from './focusSessionState';

describe('focusSessionState', () => {
  beforeEach(() => {
    __resetFocusSessionForTests();
  });

  it('starts and exits a Focus session without changing route context', () => {
    const focus = useFocusSession();

    expect(focus.isActive.value).toBe(false);
    startFocusSession({ presetId: 'quiet', startedAt: 1234 });

    expect(focus.isActive.value).toBe(true);
    expect(focus.preset.value.id).toBe('quiet');
    expect(focus.activePresetAppCodes.value).toEqual([]);

    exitFocusSession();

    expect(focus.isActive.value).toBe(false);
    expect(focus.state.startedAt).toBe(0);
  });

  it('resolves the default desk preset and keeps app selection separate from environment state', () => {
    const preset = resolveFocusPreset('desk');

    expect(preset.appCodes).toEqual(['timeprism-todo', 'pomodoro-timer']);
    expect(preset).not.toHaveProperty('wallpaper');
    expect(preset).not.toHaveProperty('theme');
  });

  it('normalizes and keeps a current Todo task until explicit completion', () => {
    const focus = useFocusSession();
    setFocusTask({ moduleCode: 'TODO', todoId: 7, title: '整理首页结构' });
    startFocusSession({ presetId: 'quiet' });

    expect(focus.currentTask.value).toMatchObject({ moduleCode: 'todo', itemId: 7, title: '整理首页结构' });
    expect(requestFocusTaskCompletion()).toMatchObject({ itemId: 7 });
    expect(focus.completionPending.value).toBe(true);
    expect(resolveFocusTaskCompletion({ itemId: 7 })).toBe(true);
    expect(focus.currentTask.value).toBe(null);
  });

  it('does not clear a task when leaving Focus without completion', () => {
    const focus = useFocusSession();
    setFocusTask({ itemId: 8, title: '继续写作' });
    startFocusSession({ presetId: 'quiet' });
    exitFocusSession();

    expect(focus.currentTask.value).toMatchObject({ itemId: 8, title: '继续写作' });
  });
});
