import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import TimePrismReminderHost from './TimePrismReminderHost.vue';

const mocked = vi.hoisted(() => ({
  auth: null,
  readGuestLightAppData: vi.fn()
}));

vi.mock('../../../composables/useAuthSession', () => ({
  useAuthSession: () => mocked.auth
}));

vi.mock('../../../services/lightAppsApi', () => ({
  listLightAppSchedules: vi.fn(),
  listLightAppTasks: vi.fn(),
  listLightAppTodos: vi.fn()
}));

vi.mock('../../../utils/lightAppsDataStore', () => ({
  readGuestLightAppData: (...args) => mocked.readGuestLightAppData(...args)
}));

vi.mock('../../../utils/lightAppWindowBus', () => ({
  openLightAppWindow: vi.fn()
}));

describe('TimePrismReminderHost', () => {
  beforeEach(() => {
    vi.useFakeTimers();
    vi.setSystemTime(new Date('2026-09-29T10:00:00'));
    window.localStorage.clear();
    mocked.auth = {
      ensureReady: vi.fn().mockResolvedValue(undefined),
      isAuthenticated: ref(false)
    };
    mocked.readGuestLightAppData.mockReturnValue({ todos: [], tasks: [], schedules: [] });
  });

  afterEach(() => {
    vi.useRealTimers();
  });

  it('shows an exact-time deadline reminder at its deadline', async () => {
    mocked.readGuestLightAppData.mockReturnValue({
      todos: [{
        todoId: 42,
        title: '准时事项',
        reminderEnabled: true,
        timingMode: 'DEADLINE',
        dueAt: '2026-09-29T10:00:00',
        deadlineRemindValue: 0,
        deadlineRemindUnit: 'MINUTE'
      }],
      tasks: [],
      schedules: []
    });

    const wrapper = mount(TimePrismReminderHost);
    await flushPromises();

    expect(wrapper.text()).toContain('准时事项');
    expect(wrapper.text()).toContain('截止提醒');
    wrapper.unmount();
  });

  it('shows an exact-time start reminder at its start', async () => {
    mocked.readGuestLightAppData.mockReturnValue({
      todos: [],
      tasks: [],
      schedules: [{
        scheduleId: 43,
        title: '准时开始',
        reminderEnabled: true,
        timingMode: 'RANGE',
        startAt: '2026-09-29T10:00:00',
        endAt: '2026-09-29T11:00:00',
        startRemindValue: 0,
        startRemindUnit: 'MINUTE'
      }]
    });

    const wrapper = mount(TimePrismReminderHost);
    await flushPromises();

    expect(wrapper.text()).toContain('准时开始');
    expect(wrapper.text()).toContain('开始提醒');
    wrapper.unmount();
  });

  it('does not turn a missing reminder value into an exact-time reminder', async () => {
    mocked.readGuestLightAppData.mockReturnValue({
      todos: [{
        todoId: 44,
        title: '未设置提前量',
        reminderEnabled: true,
        timingMode: 'DEADLINE',
        dueAt: '2026-09-29T10:00:00',
        deadlineRemindValue: null,
        deadlineRemindUnit: 'MINUTE'
      }],
      tasks: [],
      schedules: []
    });

    const wrapper = mount(TimePrismReminderHost);
    await flushPromises();

    expect(wrapper.text()).not.toContain('未设置提前量');
    wrapper.unmount();
  });
});
