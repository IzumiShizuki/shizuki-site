<template>
  <Teleport to="body">
    <dialog ref="dialog" class="calendar-details" aria-label="日历日期详情" @cancel.prevent="$emit('close')" @click="closeOnBackdrop">
      <header>
        <div><small>日历详情</small><h3>{{ date }}</h3></div>
        <button type="button" aria-label="关闭日历详情" @click="$emit('close')">×</button>
      </header>
      <div v-if="postCount" class="article-summary">
        <span>{{ postCount }} 篇公开文章</span>
        <button type="button" @click="$emit('view-posts', date)">查看当天文章</button>
      </div>
      <p v-if="loading" role="status">正在同步个人事项…</p>
      <p v-if="error" role="alert">{{ error }} <button type="button" @click="$emit('retry')">重试</button></p>
      <p v-if="!loading && !items.length" class="empty-message">这一天没有日历事项。</p>
      <ol v-if="items.length" class="details-list">
        <li v-for="item in items" :key="item.key" :class="{ done: item.done }">
          <div class="entry-meta"><span>{{ item.sourceLabel }} · {{ item.projectName }}</span><strong :class="{ overdue: calendarEntryStatus(item, now) === '已逾期' }">{{ calendarEntryStatus(item, now) }}</strong></div>
          <h4>{{ item.title }}</h4>
          <dl>
            <template v-if="item.isRange"><dt>开始</dt><dd>{{ formatCalendarEntryTime(item.start, item.timePrecision) }}</dd></template>
            <dt>截止</dt><dd>{{ formatCalendarEntryTime(item.end, item.timePrecision) }}{{ item.timePrecision === 'DAY' ? ' · 按天' : '' }}</dd>
          </dl>
          <p v-if="item.detail" class="entry-detail">{{ item.detail }}</p>
        </li>
      </ol>
    </dialog>
  </Teleport>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, ref } from 'vue';
import { calendarEntriesForDate, calendarEntryStatus, formatCalendarEntryTime } from './timePrismCalendarEntries';

const props = defineProps({
  date: { type: String, required: true },
  entries: { type: Array, default: () => [] },
  postCount: { type: Number, default: 0 },
  loading: { type: Boolean, default: false },
  error: { type: String, default: '' },
  now: { type: Date, default: () => new Date() }
});
const emit = defineEmits(['close', 'view-posts', 'retry']);
const dialog = ref(null);
const items = computed(() => calendarEntriesForDate(props.entries, props.date));
let previousFocus;
onMounted(async () => {
  previousFocus = document.activeElement;
  await nextTick();
  if (!dialog.value) return;
  if (typeof dialog.value.showModal === 'function') dialog.value.showModal();
  else dialog.value.setAttribute('open', '');
  dialog.value.querySelector('button')?.focus();
});
onBeforeUnmount(() => {
  dialog.value?.close?.();
  if (previousFocus?.isConnected) previousFocus.focus?.();
});
function closeOnBackdrop(event) {
  if (event.target !== dialog.value) return;
  const bounds = dialog.value.getBoundingClientRect();
  if (event.clientX < bounds.left || event.clientX > bounds.right || event.clientY < bounds.top || event.clientY > bounds.bottom) emit('close');
}
</script>

<style scoped>
.calendar-details { width: min(540px, calc(100vw - 32px)); max-height: min(720px, calc(100dvh - 48px)); box-sizing: border-box; overflow: auto; padding: 20px; border: 1px solid var(--theme-border); border-radius: 18px; color: var(--theme-text-primary); background: var(--theme-surface, #fff); backdrop-filter: blur(24px); box-shadow: 0 20px 70px rgba(0, 0, 0, .25); }
.calendar-details::backdrop { background: rgba(10, 18, 30, .45); }
header, .article-summary, .entry-meta { display: flex; align-items: center; justify-content: space-between; gap: 12px; }
h3 { margin: 3px 0 0; font-size: 20px; }
small, .entry-meta, .empty-message { color: var(--theme-text-secondary); }
button { min-height: 32px; border: 1px solid var(--theme-border); border-radius: 8px; padding: 4px 10px; color: inherit; background: var(--theme-surface-soft); cursor: pointer; }
button:focus-visible { outline: 2px solid var(--theme-focus-ring, rgb(var(--accent-readable-rgb))); outline-offset: 2px; }
.article-summary { margin-top: 18px; padding: 12px; border-radius: 10px; background: rgba(var(--accent-rgb), .12); }
.details-list { display: grid; gap: 12px; padding: 0; margin: 18px 0 0; list-style: none; }
.details-list li { padding: 14px; border: 1px solid var(--theme-border); border-radius: 12px; overflow-wrap: anywhere; }
.entry-meta { font-size: 12px; flex-wrap: wrap; }
.entry-meta strong { color: rgb(var(--accent-readable-rgb)); }
.entry-meta strong.overdue { color: var(--theme-danger, #bd3654); }
h4 { margin: 10px 0; font-size: 15px; }
.done h4 { text-decoration: line-through; color: var(--theme-text-secondary); }
dl { display: grid; grid-template-columns: auto 1fr; gap: 5px 12px; margin: 0; font-size: 13px; }
dt { color: var(--theme-text-secondary); } dd { margin: 0; font-variant-numeric: tabular-nums; }
.entry-detail { margin: 12px 0 0; white-space: pre-wrap; color: var(--theme-text-secondary); font-size: 13px; }
</style>
