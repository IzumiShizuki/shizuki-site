import { describe, expect, it } from 'vitest';
import {
  CALENDAR_WEEK_COUNT,
  buildCalendarWeeks,
  formatCalendarMonthLabel,
  formatCalendarTodayLabel,
  normalizeCalendarMonth,
  resolveCalendarPointerMonthDelta,
  resolveCalendarWheelMonthDelta
} from './timePrismCalendarState';

describe('timePrismCalendarState', () => {
  it('normalizes month cursors and formats toolbar labels', () => {
    const month = normalizeCalendarMonth(new Date('2026-03-18T09:00:00'));
    expect(month.getDate()).toBe(1);
    expect(formatCalendarMonthLabel(month)).toBe('2026-03');
    expect(formatCalendarTodayLabel(new Date('2026-03-31T08:00:00'))).toBe('3/31');
  });

  it('builds a stable six-week grid and marks today', () => {
    const weeks = buildCalendarWeeks(
      new Date('2026-03-01T00:00:00'),
      [
        {
          key: 'todo_1',
          title: '今天的待办',
          timePrecision: 'DAY',
          projectName: '无项目',
          start: new Date('2026-03-31T00:00:00'),
          end: new Date('2026-03-31T00:00:00'),
          isRange: false
        }
      ],
      { today: new Date('2026-03-31T12:00:00') }
    );

    expect(weeks).toHaveLength(CALENDAR_WEEK_COUNT);
    const todayCell = weeks.flatMap((week) => week.days).find((day) => day.isoDate === '2026-03-31');
    expect(todayCell).toMatchObject({
      inCurrentMonth: true,
      isToday: true
    });
    expect(todayCell?.singleItems[0]?.label).toBe('今天的待办');
  });

  it('clips range bars to the current visible week', () => {
    const weeks = buildCalendarWeeks(
      new Date('2026-03-01T00:00:00'),
      [
        {
          key: 'schedule_1',
          title: '跨周区间',
          timePrecision: 'DAY',
          projectName: '项目 A',
          start: new Date('2026-03-03T00:00:00'),
          end: new Date('2026-03-10T00:00:00'),
          isRange: true
        }
      ],
      { today: new Date('2026-03-05T12:00:00') }
    );

    expect(weeks[1].rangeBars[0]).toMatchObject({
      startColumn: 2,
      endColumn: 8
    });
    expect(weeks[2].rangeBars[0]).toMatchObject({
      startColumn: 1,
      endColumn: 3
    });
  });

  it('maps vertical wheel gestures to month changes', () => {
    expect(resolveCalendarWheelMonthDelta(0, 64)).toBe(1);
    expect(resolveCalendarWheelMonthDelta(0, -64)).toBe(-1);
    expect(resolveCalendarWheelMonthDelta(80, 64)).toBe(0);
    expect(resolveCalendarWheelMonthDelta(0, 12)).toBe(0);
  });

  it('maps vertical swipe gestures to month changes', () => {
    expect(resolveCalendarPointerMonthDelta({ startX: 0, startY: 100, endX: 6, endY: 20 })).toBe(1);
    expect(resolveCalendarPointerMonthDelta({ startX: 0, startY: 20, endX: 4, endY: 110 })).toBe(-1);
    expect(resolveCalendarPointerMonthDelta({ startX: 0, startY: 20, endX: 100, endY: 50 })).toBe(0);
  });
});
