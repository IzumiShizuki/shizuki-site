<template>
  <Transition name="focus-mode-bar">
    <section v-if="isActive" class="focus-mode-bar" data-focus-mode="active" aria-label="Focus mode">
      <div class="focus-mode-bar-inner liquid-material">
        <div class="focus-mode-mark" aria-hidden="true">
          <span class="focus-mode-pulse"></span>
          <i class="fas fa-bullseye"></i>
        </div>

        <div class="focus-mode-copy">
          <span class="focus-mode-kicker">FOCUS MODE · {{ preset.label }}</span>
          <strong>{{ currentTask?.title || '环境已准备好，先从一小段安静开始' }}</strong>
          <small>{{ currentTask ? '当前任务' : '没有指定任务也可以开始' }}</small>
        </div>

        <div class="focus-mode-elapsed" aria-live="polite">
          <small>已专注</small>
          <strong>{{ elapsedLabel }}</strong>
        </div>

        <div class="focus-mode-actions">
          <button
            v-if="currentTask?.moduleCode === 'todo'"
            class="focus-mode-complete ripple-trigger"
            type="button"
            :disabled="completionPending"
            @click="completeCurrentTask"
          >
            <i class="fas fa-check" aria-hidden="true"></i>
            {{ completionPending ? '正在写回…' : '完成任务' }}
          </button>
          <button class="focus-mode-exit ripple-trigger" type="button" @click="exitFocus">
            <i class="fas fa-door-open" aria-hidden="true"></i>
            结束专注
          </button>
        </div>
      </div>
    </section>
  </Transition>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import { useFocusSession, exitFocusSession, requestFocusTaskCompletion } from '../../utils/focusSessionState';
import { emitTimePrismCompleteItem } from '../lightapps/timeprism/timePrismFocusBus';

const focus = useFocusSession();
const isActive = focus.isActive;
const preset = focus.preset;
const currentTask = focus.currentTask;
const completionPending = focus.completionPending;
const clockNow = ref(Date.now());
let elapsedTimer = 0;

const elapsedLabel = computed(() => {
  const startedAt = Number(focus.state.startedAt) || 0;
  if (!startedAt) return '00:00';
  const totalSeconds = Math.max(0, Math.floor((clockNow.value - startedAt) / 1000));
  const hours = Math.floor(totalSeconds / 3600);
  const minutes = Math.floor((totalSeconds % 3600) / 60);
  const seconds = totalSeconds % 60;
  if (hours > 0) {
    return `${String(hours).padStart(2, '0')}:${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;
  }
  return `${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;
});

function completeCurrentTask() {
  const task = requestFocusTaskCompletion();
  if (!task || task.moduleCode !== 'todo') return;
  emitTimePrismCompleteItem(task);
}

function exitFocus() {
  exitFocusSession();
}

onMounted(() => {
  elapsedTimer = window.setInterval(() => {
    clockNow.value = Date.now();
  }, 1000);
});

onBeforeUnmount(() => {
  if (elapsedTimer) window.clearInterval(elapsedTimer);
});
</script>

<style scoped>
.focus-mode-bar {
  position: fixed;
  z-index: 3200;
  top: max(16px, env(safe-area-inset-top));
  left: 50%;
  width: min(calc(100% - 28px), 820px);
  transform: translateX(-50%);
  pointer-events: none;
}

.focus-mode-bar-inner {
  min-height: 68px;
  padding: 10px 13px;
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto auto;
  align-items: center;
  gap: 12px;
  border: 1px solid rgba(var(--accent-soft-rgb), 0.34);
  border-radius: 22px;
  background: rgba(24, 20, 31, 0.78);
  box-shadow: 0 18px 44px rgba(8, 5, 15, 0.3), 0 0 30px rgba(var(--accent-rgb), 0.1);
  pointer-events: auto;
}

.focus-mode-mark {
  position: relative;
  width: 38px;
  height: 38px;
  display: grid;
  place-items: center;
  border-radius: 14px;
  background: rgba(var(--accent-rgb), 0.18);
  color: rgba(var(--accent-soft-rgb), 0.98);
}

.focus-mode-mark i {
  position: relative;
  z-index: 1;
}

.focus-mode-pulse {
  position: absolute;
  inset: 7px;
  border: 1px solid rgba(var(--accent-soft-rgb), 0.62);
  border-radius: 50%;
  animation: focus-pulse 2.4s ease-out infinite;
}

.focus-mode-copy {
  min-width: 0;
  display: grid;
  gap: 2px;
}

.focus-mode-kicker,
.focus-mode-copy small,
.focus-mode-elapsed small {
  color: rgba(232, 220, 235, 0.68);
  font-size: 10px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
}

.focus-mode-copy strong {
  overflow: hidden;
  color: rgba(255, 248, 246, 0.98);
  font-size: 14px;
  font-weight: 650;
  line-height: 1.25;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.focus-mode-copy small {
  font-size: 11px;
  letter-spacing: 0;
  text-transform: none;
}

.focus-mode-elapsed {
  min-width: 78px;
  display: grid;
  gap: 2px;
  text-align: right;
}

.focus-mode-elapsed strong {
  color: rgba(var(--accent-soft-rgb), 0.98);
  font-family: var(--font-mono, ui-monospace, monospace);
  font-size: 16px;
  font-variant-numeric: tabular-nums;
  letter-spacing: 0.04em;
}

.focus-mode-actions {
  display: flex;
  align-items: center;
  gap: 7px;
}

.focus-mode-actions button {
  min-height: 34px;
  padding: 7px 11px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  border-radius: 999px;
  font: inherit;
  font-size: 12px;
  font-weight: 650;
  cursor: pointer;
  transition: background var(--dur-fast) var(--ease-out), border-color var(--dur-fast) var(--ease-out), transform var(--dur-fast) var(--ease-out);
}

.focus-mode-complete {
  border: 1px solid rgba(var(--accent-soft-rgb), 0.36);
  background: rgba(var(--accent-soft-rgb), 0.14);
  color: rgba(255, 247, 239, 0.94);
}

.focus-mode-exit {
  border: 1px solid rgba(255, 230, 224, 0.24);
  background: rgba(255, 255, 255, 0.06);
  color: rgba(255, 241, 237, 0.82);
}

.focus-mode-actions button:hover:not(:disabled) {
  transform: translateY(-1px);
  border-color: rgba(var(--accent-soft-rgb), 0.6);
  background: rgba(var(--accent-soft-rgb), 0.2);
}

.focus-mode-actions button:disabled {
  cursor: wait;
  opacity: 0.6;
}

@keyframes focus-pulse {
  0% {
    opacity: 0.75;
    transform: scale(0.7);
  }
  70%,
  100% {
    opacity: 0;
    transform: scale(1.25);
  }
}

.focus-mode-bar-enter-active,
.focus-mode-bar-leave-active {
  transition: opacity 240ms var(--ease-out), transform 260ms var(--ease-spring);
}

.focus-mode-bar-enter-from,
.focus-mode-bar-leave-to {
  opacity: 0;
  transform: translate(-50%, -14px);
}

:root[data-theme-mode='day'] .focus-mode-bar-inner {
  background: rgba(255, 249, 246, 0.86);
  border-color: rgba(147, 100, 95, 0.28);
  box-shadow: 0 18px 44px rgba(99, 67, 62, 0.16), 0 0 30px rgba(var(--accent-rgb), 0.08);
}

:root[data-theme-mode='day'] .focus-mode-copy strong {
  color: #4a3734;
}

:root[data-theme-mode='day'] .focus-mode-kicker,
:root[data-theme-mode='day'] .focus-mode-copy small,
:root[data-theme-mode='day'] .focus-mode-elapsed small {
  color: rgba(107, 76, 72, 0.68);
}

@media (prefers-reduced-motion: reduce) {
  .focus-mode-pulse {
    animation: none;
  }

  .focus-mode-bar-enter-active,
  .focus-mode-bar-leave-active {
    transition: opacity 160ms linear;
  }
}

@media (max-width: 640px) {
  .focus-mode-bar {
    width: min(calc(100% - 18px), 480px);
  }

  .focus-mode-bar-inner {
    grid-template-columns: auto minmax(0, 1fr) auto;
    gap: 9px;
  }

  .focus-mode-elapsed {
    display: none;
  }

  .focus-mode-actions {
    gap: 5px;
  }

  .focus-mode-actions button {
    padding-inline: 9px;
  }

  .focus-mode-actions button i {
    margin: 0;
  }

  .focus-mode-actions button:not(.focus-mode-exit) {
    width: 34px;
    padding: 0;
    justify-content: center;
    font-size: 0;
  }

  .focus-mode-exit {
    width: 34px;
    padding: 0;
    justify-content: center;
    font-size: 0;
  }
}
</style>
