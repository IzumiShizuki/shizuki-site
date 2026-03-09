<template>
  <section class="widget-body">
    <form class="event-create" @submit.prevent="createEvent">
      <input v-model.trim="draftTitle" type="text" placeholder="新增日程，例如：周会复盘" />
      <input v-model="draftStartAt" type="datetime-local" />
      <input v-model="draftEndAt" type="datetime-local" />
      <button class="action-btn ripple-trigger" type="submit">添加</button>
    </form>

    <ul v-if="sortedEvents.length" class="event-list">
      <li v-for="item in sortedEvents" :key="item.id" class="event-item" :class="eventClass(item)">
        <div class="event-main">
          <p>{{ item.title }}</p>
          <small>{{ formatRange(item.startAt, item.endAt) }}</small>
        </div>
        <button class="icon-btn ripple-trigger" type="button" @click="removeEvent(item.id)">
          <i class="fas fa-trash"></i>
        </button>
      </li>
    </ul>
    <p v-else class="empty-hint">暂无日程，先规划今天要做的事。</p>
  </section>
</template>

<script setup>
import { computed, ref, watch } from 'vue';

const props = defineProps({
  modelValue: {
    type: Object,
    default: () => ({})
  }
});

const emit = defineEmits(['update:modelValue']);

const draftTitle = ref('');
const draftStartAt = ref('');
const draftEndAt = ref('');
const events = ref([]);

function parseDatetime(raw) {
  const value = String(raw || '').trim();
  if (!value) return '';
  const timestamp = Date.parse(value);
  if (!Number.isFinite(timestamp)) return '';
  return new Date(timestamp).toISOString();
}

function normalizeEvents(raw) {
  if (!Array.isArray(raw)) return [];
  return raw
    .map((item, index) => {
      if (!item || typeof item !== 'object') return null;
      const title = String(item.title || '').trim();
      const startAt = parseDatetime(item.startAt || item.start_at);
      if (!title || !startAt) return null;
      const endAt = parseDatetime(item.endAt || item.end_at);
      return {
        id: Number.isFinite(Number(item.id)) ? Number(item.id) : Date.now() + index,
        title,
        startAt,
        endAt: endAt && endAt >= startAt ? endAt : ''
      };
    })
    .filter(Boolean)
    .slice(0, 200);
}

watch(
  () => props.modelValue,
  () => {
    const payload = props.modelValue && typeof props.modelValue === 'object' ? props.modelValue : {};
    events.value = normalizeEvents(payload.events);
  },
  { deep: true, immediate: true }
);

const sortedEvents = computed(() => {
  return [...events.value].sort((left, right) => Date.parse(left.startAt) - Date.parse(right.startAt));
});

function commit(nextEvents) {
  const normalizedEvents = normalizeEvents(nextEvents);
  events.value = normalizedEvents;
  emit('update:modelValue', {
    ...props.modelValue,
    events: normalizedEvents
  });
}

function createEvent() {
  const title = draftTitle.value.trim();
  const startAtIso = parseDatetime(draftStartAt.value);
  if (!title || !startAtIso) return;
  const endAtIso = parseDatetime(draftEndAt.value);

  commit([
    ...events.value,
    {
      id: Date.now() + Math.floor(Math.random() * 1000),
      title,
      startAt: startAtIso,
      endAt: endAtIso && endAtIso >= startAtIso ? endAtIso : ''
    }
  ]);

  draftTitle.value = '';
  draftStartAt.value = '';
  draftEndAt.value = '';
}

function removeEvent(id) {
  commit(events.value.filter((item) => item.id !== id));
}

function eventClass(item) {
  const now = Date.now();
  const start = Date.parse(item.startAt);
  const end = item.endAt ? Date.parse(item.endAt) : start;
  if (start <= now && now <= end) return 'is-live';
  if (end < now) return 'is-past';
  return 'is-upcoming';
}

function formatDateTime(iso) {
  const date = new Date(iso);
  return `${date.getMonth() + 1}/${date.getDate()} ${String(date.getHours()).padStart(2, '0')}:${String(date.getMinutes()).padStart(2, '0')}`;
}

function formatRange(startAt, endAt) {
  if (!endAt) return formatDateTime(startAt);
  return `${formatDateTime(startAt)} - ${formatDateTime(endAt)}`;
}
</script>

<style scoped>
.widget-body {
  display: grid;
  gap: 10px;
}

.event-create {
  display: grid;
  grid-template-columns: minmax(0, 1fr) repeat(2, 178px) 76px;
  gap: 8px;
}

.event-create input {
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(15, 20, 33, 0.5);
  color: rgba(239, 244, 255, 0.94);
  border-radius: 10px;
  padding: 8px 10px;
}

.action-btn,
.icon-btn {
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(17, 23, 38, 0.64);
  color: rgba(239, 244, 255, 0.95);
  border-radius: 10px;
}

.event-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.event-item {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
  gap: 10px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.13);
  background: rgba(10, 14, 24, 0.46);
  padding: 10px 12px;
}

.event-item.is-live {
  border-color: rgba(90, 224, 177, 0.66);
}

.event-item.is-past {
  opacity: 0.68;
}

.event-main p {
  margin: 0;
}

.event-main small {
  color: rgba(223, 230, 249, 0.72);
}

.icon-btn {
  width: 34px;
  height: 34px;
  padding: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.empty-hint {
  margin: 0;
  text-align: center;
  color: rgba(223, 230, 249, 0.72);
  padding: 18px 0;
}

@media (max-width: 980px) {
  .event-create {
    grid-template-columns: 1fr;
  }
}
</style>
