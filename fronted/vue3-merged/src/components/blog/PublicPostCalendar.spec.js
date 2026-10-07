import { flushPromises, mount } from '@vue/test-utils';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { ref } from 'vue';
import { writeGuestLightAppData } from '../../utils/lightAppsDataStore';
import PublicPostCalendar from './PublicPostCalendar.vue';

const mocked = vi.hoisted(() => ({ getPostPublicationCalendar: vi.fn(), auth: null }));
vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));
vi.mock('../../services/blogApi', () => ({
  getPostPublicationCalendar: (...args) => mocked.getPostPublicationCalendar(...args)
}));

function deferred() {
  let resolve;
  const promise = new Promise((done) => { resolve = done; });
  return { promise, resolve };
}

describe('PublicPostCalendar', () => {
  const wrappers = [];
  beforeEach(() => {
    window.localStorage.clear();
    mocked.auth = { ensureReady: vi.fn().mockResolvedValue(), isAuthenticated: ref(false), user: ref(null) };
  });
  afterEach(() => { wrappers.splice(0).forEach(wrapper => wrapper.unmount()); });
  it('keeps the newest month when earlier requests finish later', async () => {
    const first = deferred();
    const second = deferred();
    mocked.getPostPublicationCalendar.mockReset()
      .mockReturnValueOnce(first.promise)
      .mockReturnValueOnce(second.promise);
    const wrapper = mount(PublicPostCalendar, { global: { stubs: { teleport: true } } });
    wrappers.push(wrapper);
    const firstMonth = mocked.getPostPublicationCalendar.mock.calls[0][0];

    await wrapper.get('[aria-label="下个月"]').trigger('click');
    const secondMonth = mocked.getPostPublicationCalendar.mock.calls[1][0];
    expect(secondMonth).not.toBe(firstMonth);
    second.resolve({ month: secondMonth, days: [{ date: secondMonth + '-12', count: 2 }] });
    await flushPromises();
    first.resolve({ month: firstMonth, days: [{ date: firstMonth + '-11', count: 1 }] });
    await flushPromises();

    expect(wrapper.findAll('.calendar-day.has-posts')).toHaveLength(1);
    expect(wrapper.get('.calendar-day.has-posts').attributes('aria-label')).toContain(secondMonth + '-12，2 篇公开文章');
    await wrapper.get('.calendar-day.has-posts').trigger('click');
    expect(wrapper.emitted('select')).toBeUndefined();
    await wrapper.findComponent({ name: 'CalendarDateDetails' }).get('.article-summary button').trigger('click');
    expect(wrapper.emitted('select')[0]).toEqual([secondMonth + '-12']);
  });

  it('keeps clear and retry actions available after a load failure', async () => {
    mocked.getPostPublicationCalendar.mockReset()
      .mockRejectedValueOnce(new Error('offline'))
      .mockResolvedValueOnce({ days: [] });
    const wrapper = mount(PublicPostCalendar, { props: { selectedDate: '2026-03-20' }, global: { stubs: { teleport: true } } });
    wrappers.push(wrapper);
    await flushPromises();

    expect(wrapper.text()).toContain('日历暂时无法读取');
    await wrapper.get('.calendar-selection button').trigger('click');
    expect(wrapper.emitted('clear')).toHaveLength(1);
    await wrapper.get('.calendar-message button').trigger('click');
    await flushPromises();
    expect(wrapper.text()).toContain('本月暂无公开文章');
  });

  it('opens task-only date details without filtering articles and updates after guest edits', async () => {
    mocked.getPostPublicationCalendar.mockResolvedValue({ days: [] });
    writeGuestLightAppData({ todos: [{ todoId: 3, title: '提交报告', dueAt: '2026-10-08T18:30:00', showOnCalendar: true }] });
    const wrapper = mount(PublicPostCalendar, { props: { selectedDate: '2026-10-01' }, global: { stubs: { teleport: true } } });
    wrappers.push(wrapper);
    await flushPromises();
    const day = wrapper.findAll('.calendar-day').find(button => button.attributes('aria-label').includes('2026-10-08'));
    expect(day.classes()).toContain('has-items');
    await day.trigger('click');
    const details = wrapper.findComponent({ name: 'CalendarDateDetails' });
    expect(details.text()).toContain('提交报告');
    expect(details.text()).toContain('2026-10-08 18:30');
    expect(wrapper.emitted('select')).toBeUndefined();
    writeGuestLightAppData({ todos: [{ todoId: 3, title: '提交报告', dueAt: '2026-10-08T18:30:00', done: true }] });
    await flushPromises();
    expect(details.text()).toContain('已完成');
    await details.get('[aria-label="关闭日历详情"]').trigger('click');
    expect(wrapper.findComponent({ name: 'CalendarDateDetails' }).exists()).toBe(false);
  });
});
