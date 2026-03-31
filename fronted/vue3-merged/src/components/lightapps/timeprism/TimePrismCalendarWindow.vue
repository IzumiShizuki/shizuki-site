<template>
  <section class="lightapp-window calendar-window">
    <div class="calendar-toolbar">
      <div class="calendar-month-nav">
        <button class="icon-btn ripple-trigger" type="button" title="上个月" @click="shiftMonth(-1)">
          <i class="fas fa-chevron-left" aria-hidden="true"></i>
        </button>
        <h4>{{ monthLabel }}</h4>
        <button class="icon-btn ripple-trigger" type="button" title="下个月" @click="shiftMonth(1)">
          <i class="fas fa-chevron-right" aria-hidden="true"></i>
        </button>
      </div>
      <button class="today-btn ripple-trigger" type="button" title="快速跳转到今天" @click="goToday">
        <i class="fas fa-calendar-day" aria-hidden="true"></i>
        <span>今天</span>
        <strong>{{ todayLabel }}</strong>
      </button>
      <button class="icon-btn ripple-trigger" type="button" title="刷新" @click="hydrate">
        <i class="fas fa-rotate-right" aria-hidden="true"></i>
      </button>
    </div>
    <p class="calendar-gesture-hint">上下滚动或拖动可切换月份，日历始终展示最近 6 周。</p>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <div class="weekday-row">
      <span v-for="name in weekdayNames" :key="name">{{ name }}</span>
    </div>

    <section
      ref="calendarBodyRef"
      class="calendar-body"
      @wheel.prevent="handleCalendarWheel"
      @pointerdown="handleCalendarPointerDown"
      @pointerup="handleCalendarPointerUp"
      @pointercancel="resetCalendarPointerGesture"
    >
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
          <section
            v-for="day in week.days"
            :key="day.isoDate"
            class="day-cell"
            :class="{ muted: !day.inCurrentMonth, today: day.isToday }"
            :aria-current="day.isToday ? 'date' : undefined"
          >
            <header>
              <span class="day-number">{{ day.dayOfMonth }}</span>
              <span v-if="day.isToday" class="today-badge">今天</span>
            </header>
            <ol class="day-item-list">
              <li v-for="(item, index) in day.singleItems" :key="item.key">
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
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  listLightAppProjects,
  listLightAppSchedules,
  listLightAppTasks,
  listLightAppTodos
} from '../../../services/lightAppsApi';
import { readGuestLightAppData, readRemoteLightAppCache, writeRemoteLightAppCache } from '../../../utils/lightAppsDataStore';
import {
  buildCalendarWeeks,
  CALENDAR_WEEKDAY_NAMES,
  formatCalendarMonthLabel,
  formatCalendarTodayLabel,
  normalizeCalendarMonth,
  parseCalendarDate,
  resolveCalendarPointerMonthDelta,
  resolveCalendarWheelMonthDelta
} from './timePrismCalendarState';

const auth = useAuthSession();
const errorText = ref('');
const today = ref(new Date());
const currentMonth = ref(normalizeCalendarMonth(today.value));
const calendarBodyRef = ref(null);
const todos = ref([]);
const tasks = ref([]);
const schedules = ref([]);
const projects = ref([]);
const pointerGesture = ref({
  pointerId: 0,
  startX: 0,
  startY: 0
});
const wheelGesture = ref({
  accumulatedY: 0,
  resetTimer: 0,
  lastTriggeredAt: 0
});

const weekdayNames = CALENDAR_WEEKDAY_NAMES;

const monthLabel = computed(() => {
  return formatCalendarMonthLabel(currentMonth.value);
});
const todayLabel = computed(() => formatCalendarTodayLabel(today.value));

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
      key: `${sourceType}_${raw?.todoId ?? raw?.taskId ?? raw?.scheduleId ?? `${title}_${raw?.dueAt || raw?.endAt || raw?.rangeStartAt || raw?.startAt || ''}`}`,
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
  return buildCalendarWeeks(currentMonth.value, calendarEntries.value, {
    today: today.value,
    maxSingleItems: 4
  });
});

function shiftMonth(offset) {
  const current = currentMonth.value;
  currentMonth.value = normalizeCalendarMonth(new Date(current.getFullYear(), current.getMonth() + offset, 1));
}

function goToday() {
  const now = new Date();
  today.value = now;
  currentMonth.value = normalizeCalendarMonth(now);
}

function resetWheelGesture() {
  if (wheelGesture.value.resetTimer) {
    window.clearTimeout(wheelGesture.value.resetTimer);
  }
  wheelGesture.value.accumulatedY = 0;
  wheelGesture.value.resetTimer = 0;
}

function resetCalendarPointerGesture() {
  pointerGesture.value.pointerId = 0;
  pointerGesture.value.startX = 0;
  pointerGesture.value.startY = 0;
}

function applyCalendarMonthDelta(offset) {
  if (!offset) return;
  const now = Date.now();
  if (now - wheelGesture.value.lastTriggeredAt < 220) return;
  wheelGesture.value.lastTriggeredAt = now;
  shiftMonth(offset);
}

function handleCalendarWheel(event) {
  if (Math.abs(event.deltaY) <= Math.abs(event.deltaX)) return;
  wheelGesture.value.accumulatedY += event.deltaY;
  if (wheelGesture.value.resetTimer) {
    window.clearTimeout(wheelGesture.value.resetTimer);
  }
  wheelGesture.value.resetTimer = window.setTimeout(() => {
    resetWheelGesture();
  }, 160);
  const offset = resolveCalendarWheelMonthDelta(0, wheelGesture.value.accumulatedY);
  if (!offset) return;
  resetWheelGesture();
  applyCalendarMonthDelta(offset);
}

function handleCalendarPointerDown(event) {
  if (event.pointerType === 'mouse' && event.button !== 0) return;
  pointerGesture.value.pointerId = event.pointerId;
  pointerGesture.value.startX = event.clientX;
  pointerGesture.value.startY = event.clientY;
  event.currentTarget?.setPointerCapture?.(event.pointerId);
}

function handleCalendarPointerUp(event) {
  if (pointerGesture.value.pointerId && event.pointerId !== pointerGesture.value.pointerId) return;
  const offset = resolveCalendarPointerMonthDelta({
    startX: pointerGesture.value.startX,
    startY: pointerGesture.value.startY,
    endX: event.clientX,
    endY: event.clientY
  });
  event.currentTarget?.releasePointerCapture?.(event.pointerId);
  resetCalendarPointerGesture();
  applyCalendarMonthDelta(offset);
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

onBeforeUnmount(() => {
  resetWheelGesture();
  resetCalendarPointerGesture();
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
  min-height: 0;
  height: 100%;
}

.calendar-toolbar {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.calendar-month-nav {
  display: inline-flex;
  align-items: center;
  gap: 8px;
  min-width: 0;
}

.calendar-month-nav h4 {
  margin: 0;
  min-width: 112px;
  text-align: center;
}

.today-btn,
.icon-btn {
  border: 1px solid var(--la-border);
  background: rgba(var(--glass-rgb), 0.28);
  color: var(--la-text);
  border-radius: 10px;
}

.today-btn {
  min-height: 32px;
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.today-btn strong {
  font-size: 12px;
}

.calendar-gesture-hint {
  margin: 0;
  font-size: 12px;
  color: var(--la-muted);
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
  grid-template-rows: repeat(6, minmax(0, 1fr));
  min-height: 400px;
  min-height: clamp(400px, calc(100cqh - 124px), 640px);
  min-width: 0;
  touch-action: none;
  user-select: none;
  cursor: grab;
}

.calendar-body:active {
  cursor: grabbing;
}

.calendar-week {
  --liquid-bg: rgba(var(--glass-rgb), 0.2);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 8px;
  display: grid;
  gap: 8px;
  min-height: 0;
  grid-template-rows: auto minmax(0, 1fr);
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
  min-height: 0;
  background: var(--la-card-bg);
  display: grid;
  gap: 4px;
  overflow: hidden;
}

.day-cell.muted {
  opacity: 0.58;
}

.day-cell.today {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.16);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.18);
}

.day-cell header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  font-size: 12px;
  color: var(--la-muted);
}

.day-number {
  font-weight: 600;
}

.today-badge {
  border-radius: 999px;
  padding: 1px 7px;
  font-size: 10px;
  color: rgba(255, 255, 255, 0.95);
  background: rgba(var(--accent-rgb), 0.82);
}

.day-item-list {
  margin: 0;
  padding-left: 0;
  list-style: none;
  display: grid;
  gap: 2px;
  font-size: 11px;
  align-content: start;
  overflow: hidden;
}

.icon-btn {
  width: 30px;
  height: 30px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  padding: 0;
}

@container lightapp-window-body (max-width: 760px) {
  .calendar-toolbar {
    justify-content: space-between;
  }

  .calendar-month-nav {
    flex: 1 1 100%;
    justify-content: center;
  }

  .today-btn {
    flex: 1 1 auto;
    justify-content: center;
  }
}

@container lightapp-window-body (max-height: 460px) {
  .calendar-body {
    min-height: 0;
  }

  .week-range-item,
  .day-item-list {
    font-size: 10px;
  }

  .day-cell {
    padding: 4px;
  }
}

@media (max-width: 980px) {
  .day-cell {
    padding: 5px;
  }

  .day-item-list {
    font-size: 10px;
  }
}
</style>
