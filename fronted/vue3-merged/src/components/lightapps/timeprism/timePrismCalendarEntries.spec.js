import { describe, expect, it } from 'vitest';
import { buildTimePrismCalendarEntries, calendarEntriesForDate, calendarEntryStatus, formatCalendarEntryTime } from './timePrismCalendarEntries';
import { buildCalendarWeeks, parseCalendarDate } from './timePrismCalendarState';

describe('TimePrism calendar entries', () => {
  it('combines all sources and omits hidden, undated, and reversed ranges', () => {
    const entries = buildTimePrismCalendarEntries({
      projects: [{ projectId: 2, name: '网站' }],
      todos: [
        { todoId: 1, title: '发布', projectId: 2, dueAt: '2026-10-08T18:30:00' },
        { todoId: 2, title: '隐藏', dueAt: '2026-10-08', showOnCalendar: false },
        { todoId: 3, title: '未排期' },
        { todoId: 4, title: '错误区间', timingMode: 'RANGE', rangeStartAt: '2026-10-10', dueAt: '2026-10-08' }
      ],
      tasks: [{ taskId: 1, title: '设计', dueAt: '2026-10-08', timePrecision: 'DAY', columnCode: 'done' }],
      schedules: [{ scheduleId: 1, title: '活动', startAt: '2026-10-07T09:00:00', endAt: '2026-10-11T23:59:00' }]
    });
    expect(entries).toHaveLength(3);
    expect(new Set(entries.map(item => item.key)).size).toBe(3);
    expect(entries.find(item => item.sourceType === 'todo').projectName).toBe('网站');
    expect(calendarEntriesForDate(entries, '2026-10-08')).toHaveLength(3);
    expect(calendarEntriesForDate(entries, '2026-10-11')).toHaveLength(1);
    expect(calendarEntriesForDate(entries, '2026-10-12')).toHaveLength(0);
  });

  it('shows full precision and treats day deadlines as pending throughout that day', () => {
    const [entry] = buildTimePrismCalendarEntries({ todos: [{ todoId: 1, title: '截止', timePrecision: 'DAY', dueAt: '2026-10-08' }] });
    expect(formatCalendarEntryTime(entry.end, entry.timePrecision)).toBe('2026-10-08');
    expect(formatCalendarEntryTime(new Date(2026, 9, 8, 18, 30), 'MINUTE')).toBe('2026-10-08 18:30');
    expect(calendarEntryStatus(entry, new Date(2026, 9, 8, 22))).toBe('待完成');
    expect(calendarEntryStatus(entry, new Date(2026, 9, 9))).toBe('已逾期');
    expect(calendarEntryStatus({ ...entry, done: true }, new Date(2026, 9, 9))).toBe('已完成');
    expect(parseCalendarDate('2026-02-30')).toBeNull();
  });

  it('does not truncate date details and keeps late Sunday range bars in the week', () => {
    const entries = buildTimePrismCalendarEntries({
      todos: Array.from({ length: 6 }, (_, index) => ({ todoId: index + 1, title: `任务 ${index}`, dueAt: '2026-10-11T18:30:00' })),
      schedules: [{ scheduleId: 1, title: '周日活动', startAt: '2026-10-11T09:00:00', endAt: '2026-10-11T23:59:00' }]
    });
    const week = buildCalendarWeeks(new Date(2026, 9, 1), entries).find(item => item.days.some(day => day.isoDate === '2026-10-11'));
    expect(week.days.find(day => day.isoDate === '2026-10-11').singleItems).toHaveLength(4);
    expect(week.rangeBars[0]).toMatchObject({ date: '2026-10-11', startColumn: 7, endColumn: 8 });
    expect(calendarEntriesForDate(entries, '2026-10-11')).toHaveLength(7);
  });
});
