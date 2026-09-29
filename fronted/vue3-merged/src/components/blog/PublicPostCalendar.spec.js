import { flushPromises, mount } from '@vue/test-utils';
import { describe, expect, it, vi } from 'vitest';
import PublicPostCalendar from './PublicPostCalendar.vue';

const mocked = vi.hoisted(() => ({ getPostPublicationCalendar: vi.fn() }));
vi.mock('../../services/blogApi', () => ({
  getPostPublicationCalendar: (...args) => mocked.getPostPublicationCalendar(...args)
}));

function deferred() {
  let resolve;
  const promise = new Promise((done) => { resolve = done; });
  return { promise, resolve };
}

describe('PublicPostCalendar', () => {
  it('keeps the newest month when earlier requests finish later', async () => {
    const first = deferred();
    const second = deferred();
    mocked.getPostPublicationCalendar.mockReset()
      .mockReturnValueOnce(first.promise)
      .mockReturnValueOnce(second.promise);
    const wrapper = mount(PublicPostCalendar);
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
    expect(wrapper.emitted('select')[0]).toEqual([secondMonth + '-12']);
  });

  it('keeps clear and retry actions available after a load failure', async () => {
    mocked.getPostPublicationCalendar.mockReset()
      .mockRejectedValueOnce(new Error('offline'))
      .mockResolvedValueOnce({ days: [] });
    const wrapper = mount(PublicPostCalendar, { props: { selectedDate: '2026-03-20' } });
    await flushPromises();

    expect(wrapper.text()).toContain('日历暂时无法读取');
    await wrapper.get('.calendar-selection button').trigger('click');
    expect(wrapper.emitted('clear')).toHaveLength(1);
    await wrapper.get('.calendar-message button').trigger('click');
    await flushPromises();
    expect(wrapper.text()).toContain('本月暂无公开文章');
  });
});
