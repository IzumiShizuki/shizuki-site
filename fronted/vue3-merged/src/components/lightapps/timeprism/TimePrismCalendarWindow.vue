<template>
  <section class="lightapp-window calendar-window">
    <div class="calendar-toolbar">
      <button class="icon-btn ripple-trigger" type="button" title="上个月" @click="shiftMonth(-1)">
        <i class="fas fa-chevron-left" aria-hidden="true"></i>
      </button>
      <h4>{{ monthLabel }}</h4>
      <button class="icon-btn ripple-trigger" type="button" title="下个月" @click="shiftMonth(1)">
        <i class="fas fa-chevron-right" aria-hidden="true"></i>
      </button>
      <button class="icon-btn ripple-trigger" type="button" title="回到本月" @click="goToday">
        <i class="fas fa-calendar-day" aria-hidden="true"></i>
      </button>
      <button class="icon-btn ripple-trigger" type="button" title="刷新" @click="hydrate">
        <i class="fas fa-rotate-right" aria-hidden="true"></i>
      </button>
    </div>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <div class="weekday-row">
      <span v-for="name in weekdayNames" :key="name">{{ name }}</span>
    </div>

    <section class="calendar-body">
      <article v-for="week in calendarWeeks" :key="week.key" class="calendar-week liquid-material">
        <div class="week-range-layer">
          <span
            v-for="bar in week.rangeBars"
            :key="bar.key"
            class="week-range-item"
            :style="{ gridColumn: `${bar.startColumn} / ${bar.endColumn}` }"
            :title="bar.tooltip"
          >
            {{ bar.title }}
          </span>
        </div>
        <div class="week-day-grid">
          <section v-for="day in week.days" :key="day.isoDate" class="day-cell" :class="{ muted: !day.inCurrentMonth }">
            <header>{{ day.dayOfMonth }}</header>
            <ol class="day-item-list">
              <li v-for="(item, index) in day.singleItems.slice(0, 4)" :key="item.key">
                {{ index + 1 }} {{ item.label }}
              </li>
            </ol>
          </section>
        </div>
      </article>
    </section>
  </section>
</template>

<script setup>
import { computed, onMounted, ref } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  listLightAppProjects,
  listLightAppSchedules,
  listLightAppTasks,
  listLightAppTodos
} from '../../../services/lightAppsApi';
import { readGuestLightAppData, readRemoteLightAppCache, writeRemoteLightAppCache } from '../../../utils/lightAppsDataStore';

const auth = useAuthSession();
const errorText = ref('');
const currentMonth = ref(new Date());
const todos = ref([]);
const tasks = ref([]);
const schedules = ref([]);
const projects = ref([]);

const weekdayNames = Object.freeze(['周一', '周二', '周三', '周四', '周五', '周六', '周日']);

const monthLabel = computed(() => {
  const date = currentMonth.value;
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}`;
});

const projectMap = computed(() => {
  const map = new Map();
  (Array.isArray(projects.value) ? projects.value : []).forEach((item) => {
    map.set(Number(item.projectId), item);
  });
  return map;
});

const calendarEntries = computed(() => {
  const entries = [];
  const appendItem = (raw, sourceType) => {
    const showOnCalendar = raw?.showOnCalendar !== false;
    if (!showOnCalendar) return;

    const timingMode = String(raw?.timingMode || (sourceType === 'schedule' ? 'RANGE' : 'DEADLINE')).toUpperCase();
    const timePrecision = String(raw?.timePrecision || 'MINUTE').toUpperCase();
    const dueAt = parseDate(raw?.dueAt || raw?.endAt);
    const rangeStartAt = parseDate(raw?.rangeStartAt || raw?.startAt);
    const title = String(raw?.title || '').trim();
    if (!title) return;

    const fallbackStart = sourceType === 'schedule' ? rangeStartAt : dueAt;
    const fallbackEnd = sourceType === 'schedule' ? dueAt : dueAt;
    const start = timingMode === 'RANGE' ? rangeStartAt || fallbackStart : dueAt || fallbackEnd;
    const end = timingMode === 'RANGE' ? dueAt || fallbackEnd : dueAt || fallbackEnd;
    if (!start || !end) return;

    const projectId = Number(raw?.projectId) || null;
    const projectName = projectId ? projectMap.value.get(projectId)?.name || `项目#${projectId}` : '无项目';
    entries.push({
      key: `${sourceType}_${raw?.todoId ?? raw?.taskId ?? raw?.scheduleId ?? Math.random()}`,
      sourceType,
      title,
      projectName,
      timePrecision,
      start,
      end,
      isRange: timingMode === 'RANGE'
    });
  };

  (Array.isArray(todos.value) ? todos.value : []).forEach((item) => appendItem(item, 'todo'));
  (Array.isArray(tasks.value) ? tasks.value : []).forEach((item) => appendItem(item, 'task'));
  (Array.isArray(schedules.value) ? schedules.value : []).forEach((item) => appendItem(item, 'schedule'));
  return entries;
});

const calendarWeeks = computed(() => {
  const base = new Date(currentMonth.value.getFullYear(), currentMonth.value.getMonth(), 1);
  const month = base.getMonth();
  const gridStart = startOfWeek(base);
  const weeks = [];
  for (let weekIndex = 0; weekIndex < 6; weekIndex += 1) {
    const weekStart = addDays(gridStart, weekIndex * 7);
    const weekEnd = addDays(weekStart, 6);
    const days = [];
    for (let dayIndex = 0; dayIndex < 7; dayIndex += 1) {
      const dayDate = addDays(weekStart, dayIndex);
      const isoDate = dateKey(dayDate);
      const singleItems = calendarEntries.value
        .filter((item) => !item.isRange && isSameDate(item.start, dayDate))
        .sort((left, right) => left.start.getTime() - right.start.getTime())
        .map((item) => ({
          key: item.key,
          label: `${item.timePrecision === 'MINUTE' ? `${formatHHmm(item.start)} ` : ''}${item.title}`
        }));
      days.push({
        isoDate,
        dayOfMonth: dayDate.getDate(),
        inCurrentMonth: dayDate.getMonth() === month,
        singleItems
      });
    }

    const rangeBars = calendarEntries.value
      .filter((item) => item.isRange)
      .map((item) => {
        const start = maxDate(item.start, weekStart);
        const end = minDate(item.end, weekEnd);
        if (!start || !end || start.getTime() > end.getTime()) return null;
        const startColumn = weekdayColumn(start);
        const endColumn = weekdayColumn(end) + 1;
        return {
          key: `${item.key}_${dateKey(weekStart)}`,
          startColumn,
          endColumn,
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
});

function parseDate(value) {
  const raw = String(value || '').trim();
  if (!raw) return null;
  const ts = Date.parse(raw);
  if (!Number.isFinite(ts)) return null;
  return new Date(ts);
}

function dateKey(date) {
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')}`;
}

function startOfWeek(date) {
  const target = new Date(date.getFullYear(), date.getMonth(), date.getDate());
  const day = target.getDay();
  const shift = day === 0 ? 6 : day - 1;
  target.setDate(target.getDate() - shift);
  return target;
}

function addDays(date, offset) {
  const next = new Date(date.getFullYear(), date.getMonth(), date.getDate());
  next.setDate(next.getDate() + offset);
  return next;
}

function isSameDate(left, right) {
  return dateKey(left) === dateKey(right);
}

function weekdayColumn(date) {
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
  return `${String(date.getHours()).padStart(2, '0')}:${String(date.getMinutes()).padStart(2, '0')}`;
}

function formatDateRange(startAt, endAt) {
  return `${dateKey(startAt)} ~ ${dateKey(endAt)}`;
}

function shiftMonth(offset) {
  const current = currentMonth.value;
  currentMonth.value = new Date(current.getFullYear(), current.getMonth() + offset, 1);
}

function goToday() {
  currentMonth.value = new Date();
}

async function hydrate() {
  errorText.value = '';
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    projects.value = Array.isArray(guest.projects) ? guest.projects : [];
    todos.value = Array.isArray(guest.todos) ? guest.todos : [];
    tasks.value = Array.isArray(guest.tasks) ? guest.tasks : [];
    schedules.value = Array.isArray(guest.schedules) ? guest.schedules : [];
    return;
  }

  try {
    const [projectList, todoList, taskList, scheduleList] = await Promise.all([
      listLightAppProjects(auth.authorizedFetch),
      listLightAppTodos(auth.authorizedFetch),
      listLightAppTasks(auth.authorizedFetch),
      listLightAppSchedules(auth.authorizedFetch)
    ]);
    projects.value = Array.isArray(projectList) ? projectList : [];
    todos.value = Array.isArray(todoList) ? todoList : [];
    tasks.value = Array.isArray(taskList) ? taskList : [];
    schedules.value = Array.isArray(scheduleList) ? scheduleList : [];
    writeRemoteLightAppCache({
      projects: projects.value,
      todos: todos.value,
      tasks: tasks.value,
      schedules: schedules.value
    });
  } catch (error) {
    const cache = readRemoteLightAppCache();
    projects.value = Array.isArray(cache.projects) ? cache.projects : [];
    todos.value = Array.isArray(cache.todos) ? cache.todos : [];
    tasks.value = Array.isArray(cache.tasks) ? cache.tasks : [];
    schedules.value = Array.isArray(cache.schedules) ? cache.schedules : [];
    errorText.value = error?.message || '日历数据加载失败，已回退缓存数据。';
  }
}

onMounted(() => {
  hydrate();
});
</script>

<style scoped>
.calendar-window {
  --la-border: rgba(255, 255, 255, 0.44);
  --la-card-bg: rgba(var(--glass-rgb), 0.24);
  --la-text: rgba(35, 42, 58, 0.9);
  --la-muted: rgba(55, 64, 84, 0.74);
  color: var(--la-text);
  display: grid;
  gap: 8px;
}

.calendar-toolbar {
  display: flex;
  align-items: center;
  gap: 8px;
}

.calendar-toolbar h4 {
  margin: 0;
  min-width: 112px;
  text-align: center;
}

.weekday-row {
  display: grid;
  grid-template-columns: repeat(7, minmax(0, 1fr));
  gap: 6px;
  font-size: 12px;
  color: var(--la-muted);
}

.weekday-row span {
  text-align: center;
}

.calendar-body {
  display: grid;
  gap: 8px;
}

.calendar-week {
  --liquid-bg: rgba(var(--glass-rgb), 0.2);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 8px;
  display: grid;
  gap: 8px;
}

.week-range-layer {
  display: grid;
  grid-template-columns: repeat(7, minmax(0, 1fr));
  gap: 6px;
  min-height: 20px;
}

.week-range-item {
  border-radius: 8px;
  background: rgba(106, 169, 255, 0.24);
  border: 1px solid rgba(106, 169, 255, 0.5);
  padding: 2px 6px;
  font-size: 11px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.week-day-grid {
  display: grid;
  grid-template-columns: repeat(7, minmax(0, 1fr));
  gap: 6px;
}

.day-cell {
  border: 1px solid var(--la-border);
  border-radius: 10px;
  padding: 6px;
  min-height: 96px;
  background: var(--la-card-bg);
  display: grid;
  gap: 4px;
}

.day-cell.muted {
  opacity: 0.58;
}

.day-cell header {
  font-size: 12px;
  color: var(--la-muted);
}

.day-item-list {
  margin: 0;
  padding-left: 0;
  list-style: none;
  display: grid;
  gap: 2px;
  font-size: 11px;
}

@media (max-width: 980px) {
  .day-cell {
    min-height: 74px;
    padding: 5px;
  }

  .day-item-list {
    font-size: 10px;
  }
}
</style>
