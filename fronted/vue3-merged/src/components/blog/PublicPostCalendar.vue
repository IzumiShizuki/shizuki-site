<template>
  <section class="post-calendar" aria-label="文章与个人事项日历">
    <header class="calendar-heading">
      <strong>日历</strong>
      <span>{{ monthLabel }}</span>
    </header>
    <div class="calendar-actions" aria-label="切换月份">
      <button type="button" aria-label="上个月" @click="shiftMonth(-1)">
        <i class="fas fa-chevron-left" aria-hidden="true"></i>
      </button>
      <button type="button" aria-label="下个月" @click="shiftMonth(1)">
        <i class="fas fa-chevron-right" aria-hidden="true"></i>
      </button>
    </div>
    <p v-if="selectedDate" class="calendar-selection">
      正在查看 {{ selectedDate }}
      <button type="button" @click="$emit('clear')">清除</button>
    </p>
    <p v-if="loading" class="calendar-message" role="status">正在读取文章日期...</p>
    <p v-else-if="error" class="calendar-message" role="alert">
      {{ error }}
      <button type="button" @click="load">重试</button>
    </p>
    <p class="calendar-legend"><span>文章数量</span><span><i aria-hidden="true"></i> 我的事项</span></p>
    <p v-if="personalError" class="calendar-message" role="alert">{{ personalError }} <button type="button" @click="refresh">重试</button></p>
      <div class="calendar-week" aria-hidden="true">
        <span v-for="day in weekdays" :key="day">{{ day }}</span>
      </div>
      <div class="calendar-grid">
        <span v-for="blank in firstWeekday" :key="'blank-' + blank" aria-hidden="true"></span>
        <template v-for="day in dayCount" :key="day">
          <button
            type="button"
            class="calendar-day"
            :class="{ 'has-posts': counts[dateKey(day)], 'has-items': personalCounts[dateKey(day)], selected: (detailDate || selectedDate) === dateKey(day), today: todayKey === dateKey(day) }"
            :aria-label="dayLabel(day, counts[dateKey(day)])"
            :aria-pressed="(detailDate || selectedDate) === dateKey(day)"
            :aria-current="todayKey === dateKey(day) ? 'date' : undefined"
            @click="detailDate = dateKey(day)"
          >
            <span>{{ day }}</span><small v-if="counts[dateKey(day)]">{{ counts[dateKey(day)] }}</small><i v-if="personalCounts[dateKey(day)]" class="personal-dot" aria-hidden="true"></i>
          </button>
        </template>
      </div>
      <p v-if="!loading && !error && !hasPosts" class="calendar-message">本月暂无公开文章</p>
    <CalendarDateDetails
      v-if="detailDate"
      :date="detailDate"
      :entries="entries"
      :post-count="counts[detailDate] || 0"
      :loading="personalLoading"
      :error="personalError"
      :now="now"
      @close="detailDate = ''"
      @retry="refresh"
      @view-posts="viewPosts"
    />
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, ref, watch } from 'vue';
import { getPostPublicationCalendar } from '../../services/blogApi';
import { useTimePrismCalendar } from '../../composables/useTimePrismCalendar';
import CalendarDateDetails from '../lightapps/timeprism/CalendarDateDetails.vue';
import { calendarEntriesForDate } from '../lightapps/timeprism/timePrismCalendarEntries';

const props = defineProps({ selectedDate: { type: String, default: '' } });
const emit = defineEmits(['select', 'clear']);
const { entries, loading: personalLoading, error: personalError, now, refresh } = useTimePrismCalendar();
const detailDate = ref('');

const cursor = ref(new Date());
const counts = ref({});
const loading = ref(false);
const error = ref('');
const weekdays = ['日', '一', '二', '三', '四', '五', '六'];
let requestSequence = 0;

const monthKey = computed(() => cursor.value.getFullYear() + '-' + String(cursor.value.getMonth() + 1).padStart(2, '0'));
const monthLabel = computed(() => cursor.value.getFullYear() + ' 年 ' + (cursor.value.getMonth() + 1) + ' 月');
const dayCount = computed(() => new Date(cursor.value.getFullYear(), cursor.value.getMonth() + 1, 0).getDate());
const firstWeekday = computed(() => new Date(cursor.value.getFullYear(), cursor.value.getMonth(), 1).getDay());
const todayKey = computed(() => now.value.getFullYear() + '-' + String(now.value.getMonth() + 1).padStart(2, '0') + '-' + String(now.value.getDate()).padStart(2, '0'));
const hasPosts = computed(() => Object.values(counts.value).some((count) => count > 0));
const personalCounts = computed(() => Object.fromEntries(Array.from({ length: dayCount.value }, (_, index) => {
  const key = dateKey(index + 1);
  return [key, calendarEntriesForDate(entries.value, key).length];
})));

function viewPosts(date) {
  detailDate.value = '';
  emit('select', date);
}

function dateKey(day) {
  return monthKey.value + '-' + String(day).padStart(2, '0');
}

function dayLabel(day, count) {
  const prefix = todayKey.value === dateKey(day) ? '今天，' : '';
  return prefix + dateKey(day) + '，' + (count ? count + ' 篇公开文章' : '没有公开文章') + `，${personalCounts.value[dateKey(day)] || 0} 项个人事项，查看详情`;
}

async function load() {
  const currentRequest = ++requestSequence;
  const requestedMonth = monthKey.value;
  loading.value = true;
  error.value = '';
  counts.value = {};
  try {
    const payload = await getPostPublicationCalendar(requestedMonth);
    if (currentRequest !== requestSequence) return;
    counts.value = Object.fromEntries(
      (Array.isArray(payload?.days) ? payload.days : [])
        .filter((item) => /^\d{4}-\d{2}-\d{2}$/.test(String(item?.date || '')))
        .map((item) => [String(item.date), Math.max(0, Number(item.count) || 0)])
    );
  } catch {
    if (currentRequest !== requestSequence) return;
    error.value = '日历暂时无法读取。';
  } finally {
    if (currentRequest === requestSequence) loading.value = false;
  }
}

function shiftMonth(offset) {
  cursor.value = new Date(cursor.value.getFullYear(), cursor.value.getMonth() + offset, 1);
}

watch(() => props.selectedDate, (value) => {
  if (!/^\d{4}-\d{2}-\d{2}$/.test(value)) return;
  const selected = new Date(`${value}T00:00:00.000Z`);
  if (Number.isNaN(selected.getTime()) || selected.toISOString().slice(0, 10) !== value) return;
  cursor.value = new Date(selected.getUTCFullYear(), selected.getUTCMonth(), 1);
}, { immediate: true });

watch(monthKey, load, { immediate: true });
onBeforeUnmount(() => { requestSequence += 1; });
</script>

<style scoped>
.post-calendar {
  min-width: 0;
  display: grid;
  gap: 7px;
  padding: 10px 4px 4px;
  border-top: 1px solid var(--theme-border);
  color: var(--theme-text-secondary);
}
.calendar-heading,
.calendar-actions {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 4px;
}
.calendar-heading { font-size: 11px; }
.calendar-heading strong { color: var(--theme-text-primary); font-size: 12px; }
.calendar-actions { justify-content: flex-end; }
.calendar-actions button,
.calendar-selection button,
.calendar-message button {
  min-width: 28px;
  min-height: 28px;
  border: 1px solid var(--theme-border);
  border-radius: 7px;
  color: var(--theme-text-secondary);
  background: var(--theme-surface-soft);
  cursor: pointer;
}
.calendar-week,
.calendar-grid {
  min-width: 0;
  display: grid;
  grid-template-columns: repeat(7, minmax(0, 1fr));
  gap: 2px;
  text-align: center;
}
.calendar-week { color: var(--theme-text-tertiary); font-size: 9px; }
.calendar-day {
  position: relative;
  background: transparent;
  cursor: pointer;
  min-width: 0;
  min-height: 23px;
  display: grid;
  place-items: center;
  border: 1px solid transparent;
  border-radius: 6px;
  color: inherit;
  font-size: 10px;
}
.calendar-day.has-posts {
  position: relative;
  border-color: rgba(var(--accent-rgb), 0.35);
  color: var(--theme-text-primary);
  background: rgba(var(--accent-rgb), 0.15);
  cursor: pointer;
}
.calendar-day.has-items { background: rgba(var(--accent-rgb), 0.12); }
.personal-dot, .calendar-legend i { width: 4px; height: 4px; border-radius: 50%; background: rgb(var(--accent-readable-rgb)); }
.personal-dot { position: absolute; left: 2px; bottom: 2px; }
.calendar-legend { margin: 0; display: flex; justify-content: space-between; gap: 4px; font-size: 9px; }
.calendar-legend span { display: inline-flex; align-items: center; gap: 3px; }
.calendar-day.today { box-shadow: inset 0 0 0 1px var(--theme-text-primary); }
.calendar-day.selected { outline: 2px solid rgb(var(--accent-readable-rgb)); outline-offset: 1px; }
.calendar-day small { position: absolute; right: 1px; bottom: 0; font-size: 7px; }
.calendar-selection,
.calendar-message { margin: 0; font-size: 10px; line-height: 1.5; }
.calendar-selection button,
.calendar-message button { margin-left: 3px; padding: 0 6px; }
button:focus-visible { outline: 2px solid var(--theme-focus-ring, rgb(var(--accent-readable-rgb))); outline-offset: 2px; }
@media (max-width: 1080px) {
  .calendar-week,
  .calendar-grid { gap: 1px; }
  .calendar-day { min-height: 20px; font-size: 9px; }
  .calendar-day small { display: none; }
}
</style>
