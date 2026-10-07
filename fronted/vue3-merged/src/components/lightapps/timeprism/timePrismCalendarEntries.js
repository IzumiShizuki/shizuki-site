import { dateKey, parseCalendarDate } from './timePrismCalendarState';

const SOURCES = [
  { collection: 'todos', type: 'todo', label: 'Todo', id: 'todoId' },
  { collection: 'tasks', type: 'task', label: '任务看板', id: 'taskId' },
  { collection: 'schedules', type: 'schedule', label: '日程', id: 'scheduleId' }
];

export function buildTimePrismCalendarEntries(data = {}) {
  const projects = new Map((data.projects || []).map((item) => [Number(item.projectId), item.name]));
  const entries = [];
  for (const source of SOURCES) {
    for (const raw of Array.isArray(data[source.collection]) ? data[source.collection] : []) {
      const title = String(raw.title || '').trim();
      const end = parseCalendarDate(raw.dueAt || raw.endAt);
      if (!title || !end || raw.showOnCalendar === false) continue;
      const isRange = String(raw.timingMode || (source.type === 'schedule' ? 'RANGE' : 'DEADLINE')).toUpperCase() === 'RANGE';
      const start = isRange ? parseCalendarDate(raw.rangeStartAt || raw.startAt) || end : end;
      if (start > end) continue;
      entries.push({
        key: `${source.type}_${raw[source.id]}`,
        sourceType: source.type,
        sourceLabel: source.label,
        title,
        detail: String(raw.detail || '').trim(),
        projectName: projects.get(Number(raw.projectId)) || (raw.projectId ? `项目#${raw.projectId}` : '无项目'),
        timePrecision: raw.allDay || String(raw.timePrecision).toUpperCase() === 'DAY' ? 'DAY' : 'MINUTE',
        done: Boolean(raw.done) || String(raw.columnCode || '').toLowerCase() === 'done' || ['DONE', 'COMPLETED', 'CANCELLED'].includes(String(raw.status || '').toUpperCase()),
        start,
        end,
        isRange
      });
    }
  }
  return entries.sort((a, b) => a.end - b.end || a.title.localeCompare(b.title, 'zh-CN'));
}

export function calendarEntriesForDate(entries, date) {
  return (entries || []).filter((item) => item.isRange
    ? dateKey(item.start) <= date && date <= dateKey(item.end)
    : dateKey(item.end) === date);
}

export function formatCalendarEntryTime(date, precision) {
  const day = dateKey(date);
  return precision === 'DAY' ? day : `${day} ${String(date.getHours()).padStart(2, '0')}:${String(date.getMinutes()).padStart(2, '0')}`;
}

export function calendarEntryStatus(entry, now = new Date()) {
  if (entry.done) return '已完成';
  const overdue = entry.timePrecision === 'DAY' ? dateKey(entry.end) < dateKey(now) : entry.end < now;
  return overdue ? '已逾期' : '待完成';
}
