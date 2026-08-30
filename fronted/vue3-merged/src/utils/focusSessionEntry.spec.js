import { ref } from 'vue';
import { beforeEach, describe, expect, it } from 'vitest';
import {
  __resetLightAppShellForTests,
  openLightAppShellWindow,
  useLightAppShellState
} from '../components/lightapps/lightAppShellStore';
import { applyFocusSessionEntryUiState } from './focusSessionEntry';

describe('focus session entry effects', () => {
  beforeEach(() => {
    __resetLightAppShellForTests();
  });

  it('collapses menu and AI without opening preset light apps', () => {
    const menuExpanded = ref(true);
    const aiChatActive = ref(true);

    applyFocusSessionEntryUiState({ menuExpanded, aiChatActive });

    expect(menuExpanded.value).toBe(false);
    expect(aiChatActive.value).toBe(false);
    expect(useLightAppShellState().runtime.windows).toEqual([]);
  });

  it('leaves manual permitted app opening available after entry', () => {
    applyFocusSessionEntryUiState({ menuExpanded: ref(true), aiChatActive: ref(true) });

    openLightAppShellWindow('pomodoro-timer', { source: 'levitation_ball' });

    expect(useLightAppShellState().runtime.windows).toHaveLength(1);
    expect(useLightAppShellState().runtime.windows[0].code).toBe('pomodoro-timer');
  });
});
