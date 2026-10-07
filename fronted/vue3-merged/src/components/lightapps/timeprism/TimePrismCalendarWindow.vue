<template>
  <section class="lightapp-window calendar-window">
    <LightAppHeaderPortal :window-id="props.windowId">
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
    </LightAppHeaderPortal>
    <p class="calendar-gesture-hint">上下滚动或拖动可切换月份，日历始终展示最近 6 周。</p>

    <p v-if="loading" role="status">正在同步日历事项…</p>
    <p v-if="errorText" class="error-text" role="alert">{{ errorText }}</p>

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
          <button
            v-for="bar in week.rangeBars"
            :key="bar.key"
            class="week-range-item"
            type="button"
            :style="{ gridColumn: `${bar.startColumn} / ${bar.endColumn}` }"
            :title="bar.tooltip"
            @click="selectedDate = bar.date"
          >
            {{ bar.title }}
          </button>
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
              <button class="day-number" type="button" :aria-label="`${day.isoDate}，查看全部事项与截止时间`" @click="selectedDate = day.isoDate">{{ day.dayOfMonth }}</button>
              <span v-if="day.isToday" class="today-badge">今天</span>
            </header>
            <ol class="day-item-list">
              <li v-for="(item, index) in day.singleItems" :key="item.key">
                <button class="day-item" type="button" @click="selectedDate = day.isoDate">{{ index + 1 }} {{ item.label }}</button>
              </li>
            </ol>
          </section>
        </div>
      </article>
    </section>
    <CalendarDateDetails v-if="selectedDate" :date="selectedDate" :entries="calendarEntries" :loading="loading" :error="errorText" :now="today" @close="selectedDate = ''" @retry="hydrate" />
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, ref } from 'vue';
import { useTimePrismCalendar } from '../../../composables/useTimePrismCalendar';
import CalendarDateDetails from './CalendarDateDetails.vue';
import {
  buildCalendarWeeks,
  CALENDAR_WEEKDAY_NAMES,
  formatCalendarMonthLabel,
  formatCalendarTodayLabel,
  normalizeCalendarMonth,
  resolveCalendarPointerMonthDelta,
  resolveCalendarWheelMonthDelta
} from './timePrismCalendarState';
import LightAppHeaderPortal from '../LightAppHeaderPortal.vue';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const { entries: calendarEntries, loading, error: errorText, now: today, refresh: hydrate } = useTimePrismCalendar();
const selectedDate = ref('');
const currentMonth = ref(normalizeCalendarMonth(today.value));
const calendarBodyRef = ref(null);
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
  if (event.target?.closest('button')) return;
  if (event.pointerType === 'mouse' && event.button !== 0) return;
  pointerGesture.value.pointerId = event.pointerId;
  pointerGesture.value.startX = event.clientX;
  pointerGesture.value.startY = event.clientY;
  event.currentTarget?.setPointerCapture?.(event.pointerId);
}

function handleCalendarPointerUp(event) {
  if (!pointerGesture.value.pointerId) return;
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
  color: inherit;
  text-align: left;
  cursor: pointer;
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
.day-number, .day-item { color: inherit; border: 0; background: transparent; padding: 0; text-align: left; cursor: pointer; font: inherit; }
.day-number { min-width: 28px; min-height: 24px; font-weight: 600; }
.day-item { display: block; width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap; }
button:focus-visible { outline: 2px solid var(--theme-focus-ring, rgb(var(--accent-readable-rgb))); outline-offset: 2px; }

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
