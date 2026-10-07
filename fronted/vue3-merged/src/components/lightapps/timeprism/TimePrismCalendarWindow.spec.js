import { mount, flushPromises } from '@vue/test-utils';
import { ref } from 'vue';
import { afterEach, describe, expect, it, vi } from 'vitest';
import TimePrismCalendarWindow from './TimePrismCalendarWindow.vue';
import { writeGuestLightAppData } from '../../../utils/lightAppsDataStore';

vi.mock('../../../composables/useAuthSession', () => ({
  useAuthSession: () => ({ isAuthenticated: ref(false), user: ref(null), ensureReady: vi.fn().mockResolvedValue() })
}));
let wrapper;
afterEach(() => { wrapper?.unmount(); localStorage.clear(); });
describe('TimePrism calendar date details', () => {
  it('opens all overflow items and range details, and retains empty dates', async () => {
    const date = new Date();
    const month = `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}`;
    const day = month + '-11';
    writeGuestLightAppData({
      todos: Array.from({ length: 6 }, (_, index) => ({ todoId: index + 1, title: `待办 ${index}`, dueAt: `${day}T18:30:00` })),
      schedules: [{ scheduleId: 1, title: '跨天活动', startAt: month + '-10T09:00:00', endAt: month + '-12T18:00:00' }]
    });
    wrapper = mount(TimePrismCalendarWindow, { global: { stubs: { teleport: true, LightAppHeaderPortal: { template: '<div><slot /></div>' } } } });
    await flushPromises();
    await wrapper.get(`[aria-label="${day}，查看全部事项与截止时间"]`).trigger('click');
    expect(wrapper.findAll('.details-list li')).toHaveLength(7);
    expect(wrapper.get('.calendar-details').text()).toContain(day + ' 18:30');
    expect(wrapper.get('.calendar-details').text()).toContain('开始');
    await wrapper.get('[aria-label="关闭日历详情"]').trigger('click');
    await wrapper.get('.week-range-item').trigger('click');
    expect(wrapper.get('.calendar-details').text()).toContain('跨天活动');
    await wrapper.get('[aria-label="关闭日历详情"]').trigger('click');
    await wrapper.get(`[aria-label="${month}-20，查看全部事项与截止时间"]`).trigger('click');
    expect(wrapper.get('.calendar-details').text()).toContain('这一天没有日历事项');
  });
});
