<template>
  <section v-if="cards.length" class="tp-reminder-stack" aria-live="polite">
    <article v-for="card in cards" :key="card.id" class="tp-reminder-card liquid-material">
      <header>
        <span>{{ card.sourceLabel }}</span>
        <button class="icon-btn ripple-trigger" type="button" title="关闭提醒" @click="dismissCard(card.id)">
          <i class="fas fa-xmark" aria-hidden="true"></i>
        </button>
      </header>
      <h4>{{ card.title }}</h4>
      <p>{{ card.message }}</p>
      <footer>
        <small>{{ card.triggerLabel }}</small>
        <button class="icon-btn ripple-trigger" type="button" title="查看事项" @click="openFromCard(card)">
          <i class="fas fa-up-right-from-square" aria-hidden="true"></i>
        </button>
      </footer>
    </article>
  </section>
</template>

<script setup>
import { onBeforeUnmount, onMounted, ref } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import { listLightAppSchedules, listLightAppTasks, listLightAppTodos } from '../../../services/lightAppsApi';
import { readGuestLightAppData } from '../../../utils/lightAppsDataStore';
import { openLightAppWindow } from '../../../utils/lightAppWindowBus';

const DEDUPE_STORAGE_KEY = 'shizuki.timeprism.reminder.dedupe.v1';
const SCAN_INTERVAL_MS = 30 * 1000;
const SYNC_INTERVAL_MS = 75 * 1000;
const REMINDER_GRACE_MS = 12 * 60 * 1000;
const DEDUPE_RETENTION_MS = 7 * 24 * 60 * 60 * 1000;

const auth = useAuthSession();
const cards = ref([]);
const items = ref({ todos: [], tasks: [], schedules: [] });
const dedupeMap = ref(readDedupeMap());

let scanTimer = 0;
let syncTimer = 0;

function parseDate(value) {
  const raw = String(value || '').trim();
  if (!raw) return null;
  const ts = Date.parse(raw);
  if (!Number.isFinite(ts)) return null;
  return new Date(ts);
}

function normalizeUnit(unit) {
  const normalized = String(unit || '').trim().toUpperCase();
  return normalized === 'DAY' ? 'DAY' : normalized === 'MINUTE' ? 'MINUTE' : '';
}

function offsetMs(value, unit) {
  const num = Number(value);
  if (!Number.isFinite(num) || num <= 0) return 0;
  return normalizeUnit(unit) === 'DAY' ? num * 24 * 60 * 60 * 1000 : num * 60 * 1000;
}

function loadCardsSnapshot() {
  cards.value = cards.value.slice(0, 5);
}

function readDedupeMap() {
  if (typeof window === 'undefined') return {};
  try {
    const parsed = JSON.parse(window.localStorage.getItem(DEDUPE_STORAGE_KEY) || '{}');
    return parsed && typeof parsed === 'object' ? parsed : {};
  } catch {
    return {};
  }
}

function persistDedupeMap() {
  if (typeof window === 'undefined') return;
  try {
    window.localStorage.setItem(DEDUPE_STORAGE_KEY, JSON.stringify(dedupeMap.value));
  } catch {
    // ignore
  }
}

function pruneDedupeMap(nowTs) {
  const next = {};
  Object.entries(dedupeMap.value || {}).forEach(([key, ts]) => {
    const value = Number(ts);
    if (!Number.isFinite(value)) return;
    if (nowTs - value > DEDUPE_RETENTION_MS) return;
    next[key] = value;
  });
  dedupeMap.value = next;
}

function markTriggered(dedupeKey, nowTs) {
  dedupeMap.value = {
    ...(dedupeMap.value || {}),
    [dedupeKey]: nowTs
  };
  persistDedupeMap();
}

function hasTriggered(dedupeKey) {
  return Number(dedupeMap.value?.[dedupeKey]) > 0;
}

function pushCard(payload) {
  const id = `${payload.dedupeKey}_${Date.now()}`;
  cards.value = [
    {
      ...payload,
      id
    },
    ...cards.value
  ].slice(0, 5);
  loadCardsSnapshot();
}

function dismissCard(cardId) {
  cards.value = cards.value.filter((item) => item.id !== cardId);
}

function formatTriggerLabel(triggerAt) {
  const date = new Date(triggerAt);
  const pad = (num) => String(num).padStart(2, '0');
  return `${date.getFullYear()}-${pad(date.getMonth() + 1)}-${pad(date.getDate())} ${pad(date.getHours())}:${pad(date.getMinutes())}`;
}

function openFromCard(card) {
  openLightAppWindow('timeprism-todo', {
    source: 'timeprism_reminder',
    moduleCode: card.moduleCode,
    focusItemId: card.itemId
  });
  dismissCard(card.id);
}

function buildReminderEvents() {
  const events = [];
  const appendEvent = (moduleCode, sourceLabel, rawItem, deadlineAt, startAt) => {
    if (!rawItem || rawItem.reminderEnabled !== true) return;
    const itemId = Number(rawItem.todoId ?? rawItem.taskId ?? rawItem.scheduleId);
    if (!itemId) return;
    const title = String(rawItem.title || '').trim();
    if (!title) return;

    const timingMode = String(rawItem.timingMode || (moduleCode === 'schedule' ? 'RANGE' : 'DEADLINE')).toUpperCase();
    const reminders = [];
    const deadlineOffset = offsetMs(rawItem.deadlineRemindValue, rawItem.deadlineRemindUnit);
    const startOffset = offsetMs(rawItem.startRemindValue, rawItem.startRemindUnit);

    if (deadlineOffset > 0 && deadlineAt) {
      reminders.push({
        kind: 'deadline',
        triggerAt: deadlineAt.getTime() - deadlineOffset,
        message: '截止提醒'
      });
    }
    if (timingMode === 'RANGE' && startOffset > 0 && startAt) {
      reminders.push({
        kind: 'start',
        triggerAt: startAt.getTime() - startOffset,
        message: '开始提醒'
      });
    }

    reminders.forEach((reminder) => {
      const dedupeKey = `${moduleCode}_${itemId}_${reminder.kind}_${reminder.triggerAt}`;
      events.push({
        dedupeKey,
        moduleCode,
        sourceLabel,
        itemId,
        title,
        message: reminder.message,
        triggerAt: reminder.triggerAt
      });
    });
  };

  (Array.isArray(items.value.todos) ? items.value.todos : []).forEach((item) => {
    appendEvent('todo', 'Todo', item, parseDate(item.dueAt), parseDate(item.rangeStartAt));
  });
  (Array.isArray(items.value.tasks) ? items.value.tasks : []).forEach((item) => {
    appendEvent('board', 'Task Board', item, parseDate(item.dueAt), parseDate(item.rangeStartAt));
  });
  (Array.isArray(items.value.schedules) ? items.value.schedules : []).forEach((item) => {
    appendEvent('schedule', 'Schedule', item, parseDate(item.endAt), parseDate(item.rangeStartAt || item.startAt));
  });
  return events;
}

function scanDueReminders() {
  if (typeof document !== 'undefined' && document.visibilityState !== 'visible') return;
  const nowTs = Date.now();
  pruneDedupeMap(nowTs);
  const events = buildReminderEvents();
  events.forEach((event) => {
    if (hasTriggered(event.dedupeKey)) return;
    if (nowTs < event.triggerAt) return;
    if (nowTs - event.triggerAt > REMINDER_GRACE_MS) return;
    markTriggered(event.dedupeKey, nowTs);
    pushCard({
      dedupeKey: event.dedupeKey,
      moduleCode: event.moduleCode,
      itemId: event.itemId,
      sourceLabel: event.sourceLabel,
      title: event.title,
      message: event.message,
      triggerLabel: formatTriggerLabel(event.triggerAt)
    });
  });
}

async function syncData() {
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    items.value = {
      todos: Array.isArray(guest.todos) ? guest.todos : [],
      tasks: Array.isArray(guest.tasks) ? guest.tasks : [],
      schedules: Array.isArray(guest.schedules) ? guest.schedules : []
    };
    return;
  }

  try {
    const [todoList, taskList, scheduleList] = await Promise.all([
      listLightAppTodos(auth.authorizedFetch),
      listLightAppTasks(auth.authorizedFetch),
      listLightAppSchedules(auth.authorizedFetch)
    ]);
    items.value = {
      todos: Array.isArray(todoList) ? todoList : [],
      tasks: Array.isArray(taskList) ? taskList : [],
      schedules: Array.isArray(scheduleList) ? scheduleList : []
    };
  } catch {
    // keep previous snapshot and continue scanning
  }
}

onMounted(async () => {
  await syncData();
  scanDueReminders();
  scanTimer = window.setInterval(scanDueReminders, SCAN_INTERVAL_MS);
  syncTimer = window.setInterval(async () => {
    await syncData();
    scanDueReminders();
  }, SYNC_INTERVAL_MS);
});

onBeforeUnmount(() => {
  if (scanTimer) window.clearInterval(scanTimer);
  if (syncTimer) window.clearInterval(syncTimer);
});
</script>

<style scoped>
.tp-reminder-stack {
  position: fixed;
  right: 16px;
  bottom: 22px;
  z-index: 2720;
  display: grid;
  gap: 8px;
  width: min(320px, calc(100vw - 28px));
  pointer-events: none;
}

.tp-reminder-card {
  --liquid-bg: rgba(var(--glass-rgb), 0.33);
  --liquid-border: rgba(255, 255, 255, 0.46);
  --liquid-shadow: 0 14px 30px rgba(12, 19, 35, 0.2);
  border-radius: 12px;
  padding: 10px;
  pointer-events: auto;
  display: grid;
  gap: 6px;
}

.tp-reminder-card header,
.tp-reminder-card footer {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.tp-reminder-card header span,
.tp-reminder-card small {
  font-size: 12px;
  color: rgba(58, 69, 92, 0.78);
}

.tp-reminder-card h4 {
  margin: 0;
  font-size: 14px;
  line-height: 1.35;
}

.tp-reminder-card p {
  margin: 0;
  font-size: 12px;
  color: rgba(52, 62, 84, 0.8);
}

.icon-btn {
  width: 28px;
  height: 28px;
  border: 1px solid rgba(255, 255, 255, 0.46);
  background: rgba(var(--glass-rgb), 0.28);
  color: rgba(30, 39, 57, 0.9);
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  padding: 0;
}
</style>
