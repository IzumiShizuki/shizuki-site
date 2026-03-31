export const CALENDAR_WEEKDAY_NAMES = Object.freeze(['周一', '周二', '周三', '周四', '周五', '周六', '周日']);
export const CALENDAR_WEEK_COUNT = 6;
export const CALENDAR_WHEEL_THRESHOLD = 48;
export const CALENDAR_POINTER_THRESHOLD = 60;

function pad(value) {
  return String(value).padStart(2, '0');
}

export function parseCalendarDate(value) {
  const raw = String(value || '').trim();
  if (!raw) return null;
  const ts = Date.parse(raw);
  if (!Number.isFinite(ts)) return null;
  return new Date(ts);
}

export function normalizeCalendarMonth(value) {
  const date = value instanceof Date ? value : parseCalendarDate(value) || new Date();
  return new Date(date.getFullYear(), date.getMonth(), 1);
}

export function formatCalendarMonthLabel(value) {
  const date = normalizeCalendarMonth(value);
  return `${date.getFullYear()}-${pad(date.getMonth() + 1)}`;
}

export function formatCalendarTodayLabel(value) {
  const date = value instanceof Date ? value : parseCalendarDate(value) || new Date();
  return `${date.getMonth() + 1}/${date.getDate()}`;
}

export function dateKey(date) {
  return `${date.getFullYear()}-${pad(date.getMonth() + 1)}-${pad(date.getDate())}`;
}

export function startOfWeek(date) {
  const target = new Date(date.getFullYear(), date.getMonth(), date.getDate());
  const day = target.getDay();
  const shift = day === 0 ? 6 : day - 1;
  target.setDate(target.getDate() - shift);
  return target;
}

export function addDays(date, offset) {
  const next = new Date(date.getFullYear(), date.getMonth(), date.getDate());
  next.setDate(next.getDate() + offset);
  return next;
}

export function isSameDate(left, right) {
  return dateKey(left) === dateKey(right);
}

export function weekdayColumn(date) {
  const day = date.getDay();
  return day === 0 ? 7 : day;
}

function maxDate(left, right) {
  return left.getTime() >= right.getTime() ? left : right;
}

function minDate(left, right) {
  return left.getTime() <= right.getTime() ? left : right;
}

function formatHHmm(date) {
  return `${pad(date.getHours())}:${pad(date.getMinutes())}`;
}

export function formatDateRange(startAt, endAt) {
  return `${dateKey(startAt)} ~ ${dateKey(endAt)}`;
}

export function buildCalendarWeeks(currentMonth, entries, options = {}) {
  const monthCursor = normalizeCalendarMonth(currentMonth);
  const month = monthCursor.getMonth();
  const todayKey = dateKey(options.today instanceof Date ? options.today : new Date());
  const maxSingleItems = Number(options.maxSingleItems) || 4;
  const gridStart = startOfWeek(monthCursor);
  const weeks = [];

  for (let weekIndex = 0; weekIndex < CALENDAR_WEEK_COUNT; weekIndex += 1) {
    const weekStart = addDays(gridStart, weekIndex * 7);
    const weekEnd = addDays(weekStart, 6);
    const days = [];

    for (let dayIndex = 0; dayIndex < 7; dayIndex += 1) {
      const dayDate = addDays(weekStart, dayIndex);
      const isoDate = dateKey(dayDate);
      const singleItems = (Array.isArray(entries) ? entries : [])
        .filter((item) => !item.isRange && isSameDate(item.start, dayDate))
        .sort((left, right) => left.start.getTime() - right.start.getTime())
        .slice(0, maxSingleItems)
        .map((item) => ({
          key: item.key,
          label: `${item.timePrecision === 'MINUTE' ? `${formatHHmm(item.start)} ` : ''}${item.title}`
        }));

      days.push({
        isoDate,
        dayOfMonth: dayDate.getDate(),
        inCurrentMonth: dayDate.getMonth() === month,
        isToday: isoDate === todayKey,
        singleItems
      });
    }

    const rangeBars = (Array.isArray(entries) ? entries : [])
      .filter((item) => item.isRange)
      .map((item) => {
        const start = maxDate(item.start, weekStart);
        const end = minDate(item.end, weekEnd);
        if (!start || !end || start.getTime() > end.getTime()) return null;
        return {
          key: `${item.key}_${dateKey(weekStart)}`,
          startColumn: weekdayColumn(start),
          endColumn: weekdayColumn(end) + 1,
          title: item.title,
          tooltip: `${item.title} · ${item.projectName} · ${formatDateRange(item.start, item.end)}`
        };
      })
      .filter(Boolean);

    weeks.push({
      key: `week_${dateKey(weekStart)}`,
      days,
      rangeBars
    });
  }

  return weeks;
}

export function resolveCalendarWheelMonthDelta(deltaX, deltaY, threshold = CALENDAR_WHEEL_THRESHOLD) {
  const horizontal = Number(deltaX) || 0;
  const vertical = Number(deltaY) || 0;
  if (Math.abs(vertical) < threshold || Math.abs(vertical) <= Math.abs(horizontal)) return 0;
  return vertical > 0 ? 1 : -1;
}

export function resolveCalendarPointerMonthDelta(gesture, threshold = CALENDAR_POINTER_THRESHOLD) {
  const deltaX = Number(gesture?.endX ?? 0) - Number(gesture?.startX ?? 0);
  const deltaY = Number(gesture?.endY ?? 0) - Number(gesture?.startY ?? 0);
  if (Math.abs(deltaY) < threshold || Math.abs(deltaY) <= Math.abs(deltaX)) return 0;
  return deltaY < 0 ? 1 : -1;
}
