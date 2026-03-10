<template>
  <section class="lightapp-window pomodoro-window">
    <header class="mode-switcher">
      <button
        v-for="item in modeItems"
        :key="item.mode"
        class="chip-btn ripple-trigger"
        :class="{ active: mode === item.mode }"
        type="button"
        @click="switchMode(item.mode)"
      >
        {{ item.label }}
      </button>
    </header>

    <section class="timer-panel liquid-material">
      <p class="mode-label">{{ currentModeLabel }}</p>
      <p class="time-text">{{ formattedTime }}</p>
      <div class="progress-track" role="progressbar" :aria-valuenow="progressPercent" aria-valuemin="0" aria-valuemax="100">
        <span class="progress-fill" :style="{ width: `${progressPercent}%` }"></span>
      </div>
      <p class="sub-hint">{{ isRunning ? '进行中' : '已暂停' }}</p>
    </section>

    <section class="control-row">
      <button class="action-btn ripple-trigger" type="button" @click="toggleRunning">
        {{ isRunning ? '暂停' : '开始' }}
      </button>
      <button class="action-btn ripple-trigger" type="button" @click="resetCurrent">重置</button>
      <button class="action-btn ripple-trigger" type="button" @click="skipCurrent">下一段</button>
    </section>

    <section class="setting-panel liquid-material">
      <header class="setting-head">
        <h4>番茄设置</h4>
        <label class="auto-check">
          <input v-model="draft.autoStartNext" type="checkbox" />
          <span>自动开始下一段</span>
        </label>
      </header>
      <div class="setting-grid">
        <label>
          专注(分钟)
          <input v-model.number="draft.focusMinutes" type="number" min="5" max="120" />
        </label>
        <label>
          短休息(分钟)
          <input v-model.number="draft.shortBreakMinutes" type="number" min="1" max="60" />
        </label>
        <label>
          长休息(分钟)
          <input v-model.number="draft.longBreakMinutes" type="number" min="5" max="90" />
        </label>
        <label>
          长休息间隔(轮)
          <input v-model.number="draft.longBreakEvery" type="number" min="2" max="12" />
        </label>
      </div>
      <button class="action-btn ripple-trigger" type="button" @click="applySettings">应用设置</button>
    </section>

    <section class="stats-row">
      <p>今日完成专注：{{ todayFocusCount }} 次</p>
      <p>下一次长休息剩余：{{ nextLongBreakIn }} 次专注</p>
    </section>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref } from 'vue';

const STORAGE_KEY = 'shizuki.lightapps.pomodoro.v1';

const MODE_FOCUS = 'focus';
const MODE_SHORT_BREAK = 'short_break';
const MODE_LONG_BREAK = 'long_break';

const modeItems = Object.freeze([
  { mode: MODE_FOCUS, label: '专注' },
  { mode: MODE_SHORT_BREAK, label: '短休息' },
  { mode: MODE_LONG_BREAK, label: '长休息' }
]);

const settings = reactive({
  focusMinutes: 25,
  shortBreakMinutes: 5,
  longBreakMinutes: 15,
  longBreakEvery: 4,
  autoStartNext: false
});

const draft = reactive({
  focusMinutes: settings.focusMinutes,
  shortBreakMinutes: settings.shortBreakMinutes,
  longBreakMinutes: settings.longBreakMinutes,
  longBreakEvery: settings.longBreakEvery,
  autoStartNext: settings.autoStartNext
});

const mode = ref(MODE_FOCUS);
const remainingSeconds = ref(settings.focusMinutes * 60);
const isRunning = ref(false);
const completedFocusRounds = ref(0);

const stats = reactive({
  date: '',
  focusCount: 0
});

let timerId = 0;

function clampNumber(value, min, max, fallback) {
  const normalized = Number(value);
  if (!Number.isFinite(normalized)) return fallback;
  if (normalized < min) return min;
  if (normalized > max) return max;
  return Math.round(normalized);
}

function todayKey() {
  return new Date().toISOString().slice(0, 10);
}

function ensureTodayStats() {
  const key = todayKey();
  if (stats.date !== key) {
    stats.date = key;
    stats.focusCount = 0;
  }
}

function durationByMode(targetMode) {
  if (targetMode === MODE_SHORT_BREAK) return settings.shortBreakMinutes * 60;
  if (targetMode === MODE_LONG_BREAK) return settings.longBreakMinutes * 60;
  return settings.focusMinutes * 60;
}

function formatTime(seconds) {
  const safe = Math.max(0, Number(seconds) || 0);
  const mins = Math.floor(safe / 60);
  const secs = safe % 60;
  return `${String(mins).padStart(2, '0')}:${String(secs).padStart(2, '0')}`;
}

function currentModeLabelFrom(targetMode) {
  if (targetMode === MODE_SHORT_BREAK) return '短休息';
  if (targetMode === MODE_LONG_BREAK) return '长休息';
  return '专注时间';
}

function stopTimer() {
  if (timerId) {
    window.clearInterval(timerId);
    timerId = 0;
  }
  isRunning.value = false;
}

function persistState() {
  if (typeof window === 'undefined') return;
  const payload = {
    settings: {
      focusMinutes: settings.focusMinutes,
      shortBreakMinutes: settings.shortBreakMinutes,
      longBreakMinutes: settings.longBreakMinutes,
      longBreakEvery: settings.longBreakEvery,
      autoStartNext: settings.autoStartNext
    },
    stats: {
      date: stats.date,
      focusCount: stats.focusCount
    },
    completedFocusRounds: completedFocusRounds.value
  };
  try {
    window.localStorage.setItem(STORAGE_KEY, JSON.stringify(payload));
  } catch {
    // ignore storage failures
  }
}

function syncDraftFromSettings() {
  draft.focusMinutes = settings.focusMinutes;
  draft.shortBreakMinutes = settings.shortBreakMinutes;
  draft.longBreakMinutes = settings.longBreakMinutes;
  draft.longBreakEvery = settings.longBreakEvery;
  draft.autoStartNext = settings.autoStartNext;
}

function loadState() {
  ensureTodayStats();
  if (typeof window === 'undefined') {
    syncDraftFromSettings();
    return;
  }

  try {
    const raw = window.localStorage.getItem(STORAGE_KEY);
    if (!raw) {
      syncDraftFromSettings();
      return;
    }
    const parsed = JSON.parse(raw);
    const savedSettings = parsed?.settings || {};
    settings.focusMinutes = clampNumber(savedSettings.focusMinutes, 5, 120, 25);
    settings.shortBreakMinutes = clampNumber(savedSettings.shortBreakMinutes, 1, 60, 5);
    settings.longBreakMinutes = clampNumber(savedSettings.longBreakMinutes, 5, 90, 15);
    settings.longBreakEvery = clampNumber(savedSettings.longBreakEvery, 2, 12, 4);
    settings.autoStartNext = Boolean(savedSettings.autoStartNext);

    const savedStats = parsed?.stats || {};
    if (savedStats.date === todayKey()) {
      stats.date = savedStats.date;
      stats.focusCount = clampNumber(savedStats.focusCount, 0, 999, 0);
    }

    completedFocusRounds.value = clampNumber(parsed?.completedFocusRounds, 0, 999, 0);
  } catch {
    // keep defaults on parse error
  }

  remainingSeconds.value = durationByMode(mode.value);
  syncDraftFromSettings();
}

function switchMode(targetMode) {
  if (mode.value === targetMode) return;
  stopTimer();
  mode.value = targetMode;
  remainingSeconds.value = durationByMode(targetMode);
}

function moveToNextSegment(countCompletedFocus) {
  if (countCompletedFocus && mode.value === MODE_FOCUS) {
    ensureTodayStats();
    stats.focusCount += 1;
    completedFocusRounds.value += 1;
  }

  if (mode.value === MODE_FOCUS) {
    const needLongBreak = completedFocusRounds.value > 0 && completedFocusRounds.value % settings.longBreakEvery === 0;
    mode.value = needLongBreak ? MODE_LONG_BREAK : MODE_SHORT_BREAK;
  } else {
    mode.value = MODE_FOCUS;
  }

  remainingSeconds.value = durationByMode(mode.value);
  persistState();

  if (settings.autoStartNext) {
    startTimer();
  }
}

function tick() {
  if (remainingSeconds.value <= 1) {
    stopTimer();
    moveToNextSegment(true);
    return;
  }
  remainingSeconds.value -= 1;
}

function startTimer() {
  if (isRunning.value) return;
  isRunning.value = true;
  if (timerId) {
    window.clearInterval(timerId);
  }
  timerId = window.setInterval(tick, 1000);
}

function toggleRunning() {
  if (isRunning.value) {
    stopTimer();
    return;
  }
  startTimer();
}

function resetCurrent() {
  stopTimer();
  remainingSeconds.value = durationByMode(mode.value);
}

function skipCurrent() {
  stopTimer();
  moveToNextSegment(false);
}

function applySettings() {
  settings.focusMinutes = clampNumber(draft.focusMinutes, 5, 120, settings.focusMinutes);
  settings.shortBreakMinutes = clampNumber(draft.shortBreakMinutes, 1, 60, settings.shortBreakMinutes);
  settings.longBreakMinutes = clampNumber(draft.longBreakMinutes, 5, 90, settings.longBreakMinutes);
  settings.longBreakEvery = clampNumber(draft.longBreakEvery, 2, 12, settings.longBreakEvery);
  settings.autoStartNext = Boolean(draft.autoStartNext);

  syncDraftFromSettings();
  if (!isRunning.value) {
    remainingSeconds.value = durationByMode(mode.value);
  }
  persistState();
}

const formattedTime = computed(() => formatTime(remainingSeconds.value));

const currentModeLabel = computed(() => currentModeLabelFrom(mode.value));

const progressPercent = computed(() => {
  const duration = durationByMode(mode.value);
  if (duration <= 0) return 0;
  const progress = ((duration - remainingSeconds.value) / duration) * 100;
  return Math.max(0, Math.min(100, Math.round(progress)));
});

const todayFocusCount = computed(() => stats.focusCount);

const nextLongBreakIn = computed(() => {
  const remainder = completedFocusRounds.value % settings.longBreakEvery;
  if (remainder === 0) return settings.longBreakEvery;
  return settings.longBreakEvery - remainder;
});

onMounted(() => {
  loadState();
});

onBeforeUnmount(() => {
  stopTimer();
  persistState();
});
</script>

<style scoped>
.lightapp-window {
  --la-border: rgba(255, 255, 255, 0.44);
  --la-input-bg: rgba(var(--glass-rgb), 0.3);
  --la-btn-bg: rgba(var(--glass-rgb), 0.28);
  --la-panel-bg: rgba(var(--glass-rgb), 0.24);
  --la-text: rgba(35, 42, 58, 0.92);
  --la-muted: rgba(58, 67, 87, 0.72);
  display: grid;
  gap: 10px;
  color: var(--la-text);
  min-width: 0;
}

.mode-switcher {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.chip-btn,
.action-btn {
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  color: var(--la-text);
  border-radius: 10px;
  min-height: 32px;
  padding: 0 10px;
}

.chip-btn.active {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.24);
}

.timer-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 12px;
  display: grid;
  gap: 8px;
  justify-items: center;
}

.mode-label {
  margin: 0;
  font-size: 13px;
  color: var(--la-muted);
}

.time-text {
  margin: 0;
  font-size: clamp(36px, 7vw, 52px);
  font-weight: 700;
  line-height: 1;
  letter-spacing: 1px;
}

.progress-track {
  width: min(320px, 100%);
  height: 8px;
  border-radius: 999px;
  overflow: hidden;
  border: 1px solid var(--la-border);
  background: rgba(var(--glass-rgb), 0.2);
}

.progress-fill {
  display: block;
  height: 100%;
  background: linear-gradient(90deg, rgba(var(--accent-rgb), 0.9), rgba(255, 145, 112, 0.9));
  border-radius: 999px;
  transition: width 240ms linear;
}

.sub-hint {
  margin: 0;
  font-size: 12px;
  color: var(--la-muted);
}

.control-row {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.setting-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 10px;
}

.setting-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.setting-head h4 {
  margin: 0;
}

.auto-check {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  font-size: 12px;
  color: var(--la-muted);
}

.setting-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.setting-grid label {
  display: grid;
  gap: 5px;
  font-size: 12px;
  color: var(--la-muted);
}

.setting-grid input {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 8px;
  min-height: 32px;
  padding: 0 10px;
}

.stats-row {
  display: flex;
  align-items: center;
  gap: 12px;
  flex-wrap: wrap;
  color: var(--la-muted);
  font-size: 12px;
}

.stats-row p {
  margin: 0;
}

@container lightapp-window-body (max-width: 640px) {
  .setting-grid {
    grid-template-columns: 1fr;
  }

  .control-row {
    justify-content: space-between;
  }
}
</style>
