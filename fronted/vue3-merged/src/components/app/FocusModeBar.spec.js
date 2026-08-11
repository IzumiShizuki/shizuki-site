import { mount } from '@vue/test-utils';
import { beforeEach, describe, expect, it } from 'vitest';
import FocusModeBar from './FocusModeBar.vue';
import {
  __resetFocusSessionForTests,
  setFocusTask,
  startFocusSession
} from '../../utils/focusSessionState';
import { TIMEPRISM_COMPLETE_ITEM_EVENT } from '../lightapps/timeprism/timePrismFocusBus';

describe('FocusModeBar', () => {
  beforeEach(() => {
    __resetFocusSessionForTests();
  });

  it('shows the active session, emits explicit Todo completion, and exits Focus', async () => {
    setFocusTask({ moduleCode: 'todo', itemId: 41, title: '完成首轮改造' });
    startFocusSession({ presetId: 'quiet', startedAt: Date.now() - 61_000 });
    const wrapper = mount(FocusModeBar);
    const listener = (event) => {
      expect(event.detail).toMatchObject({ moduleCode: 'todo', itemId: 41 });
    };
    window.addEventListener(TIMEPRISM_COMPLETE_ITEM_EVENT, listener);

    expect(wrapper.get('[data-focus-mode="active"]').text()).toContain('完成首轮改造');
    expect(wrapper.get('.focus-mode-elapsed').text()).toContain('01:');

    await wrapper.get('.focus-mode-complete').trigger('click');
    expect(wrapper.get('.focus-mode-complete').attributes('disabled')).toBeDefined();

    await wrapper.get('.focus-mode-exit').trigger('click');
    expect(wrapper.find('[data-focus-mode="active"]').exists()).toBe(false);
    window.removeEventListener(TIMEPRISM_COMPLETE_ITEM_EVENT, listener);
  });
});
