<template>
  <transition name="dialog-fade">
    <div v-if="visible" class="dialog-mask" @click.self="emit('close')">
      <section class="dialog-shell liquid-material" role="dialog" aria-modal="true" @click.stop>
        <header class="dialog-head">
          <h3>创建歌单</h3>
          <button class="dialog-close ripple-trigger" type="button" @click="emit('close')">
            <i class="fas fa-xmark"></i>
          </button>
        </header>

        <label class="dialog-field">
          <span>歌单名称</span>
          <input
            ref="inputRef"
            v-model.trim="nameInput"
            type="text"
            maxlength="64"
            placeholder="请输入歌单名称"
            @keydown.enter.prevent="submit"
            @keydown.esc.prevent="emit('close')"
          />
        </label>

        <p v-if="errorText" class="dialog-error">{{ errorText }}</p>

        <footer class="dialog-actions">
          <button class="dialog-btn ripple-trigger" type="button" @click="emit('close')">取消</button>
          <button class="dialog-btn primary ripple-trigger" type="button" :disabled="submitting" @click="submit">
            {{ submitting ? '创建中...' : '确认创建' }}
          </button>
        </footer>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { nextTick, ref, watch } from 'vue';

const props = defineProps({
  visible: { type: Boolean, default: false },
  submitting: { type: Boolean, default: false },
  errorText: { type: String, default: '' }
});

const emit = defineEmits(['close', 'confirm']);

const inputRef = ref(null);
const nameInput = ref('');

function submit() {
  const name = String(nameInput.value || '').trim();
  emit('confirm', name);
}

watch(
  () => props.visible,
  async (nextVisible) => {
    if (!nextVisible) {
      nameInput.value = '';
      return;
    }
    nameInput.value = '';
    await nextTick();
    inputRef.value?.focus?.();
  }
);
</script>

<style scoped>
.dialog-mask {
  position: fixed;
  inset: 0;
  z-index: 1380;
  display: grid;
  place-items: center;
  background: var(--theme-scrim, rgba(6, 10, 18, 0.52));
  backdrop-filter: blur(5px);
}

.dialog-shell {
  --liquid-bg: var(--theme-panel-surface);
  --liquid-border: var(--theme-border);
  --liquid-shadow: var(--theme-shadow-hard, 0 20px 36px rgba(18, 9, 8, 0.2));
  width: min(420px, calc(100vw - 24px));
  border-radius: 16px;
  padding: 14px;
  display: grid;
  gap: 12px;
}

.dialog-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.dialog-head h3 {
  margin: 0;
  font-size: 18px;
  color: var(--theme-text-primary);
}

.dialog-close {
  width: 30px;
  height: 30px;
  border-radius: 9px;
  border: 1px solid var(--theme-border);
  background: var(--theme-panel-surface-elevated);
  color: var(--theme-icon-primary);
}

.dialog-field {
  display: grid;
  gap: 6px;
}

.dialog-field span {
  font-size: 12px;
  color: var(--theme-text-secondary);
}

.dialog-field input {
  min-height: 38px;
  border-radius: 10px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
  padding: 0 11px;
  outline: none;
}

.dialog-field input:focus {
  border-color: rgba(var(--accent-rgb), 0.62);
  box-shadow: 0 0 0 2px rgba(var(--accent-rgb), 0.2);
}

.dialog-error {
  margin: 0;
  font-size: 12px;
  color: rgba(255, 134, 165, 0.98);
}

.dialog-actions {
  display: flex;
  justify-content: flex-end;
  gap: 8px;
}

.dialog-btn {
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid var(--theme-border);
  background: var(--theme-panel-surface-elevated);
  color: var(--theme-text-primary);
  padding: 0 14px;
}

.dialog-btn.primary {
  border-color: rgba(var(--accent-rgb), 0.62);
  background: rgba(var(--accent-rgb), 0.26);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.22);
}

.dialog-fade-enter-active,
.dialog-fade-leave-active {
  transition: opacity 200ms ease;
}

.dialog-fade-enter-from,
.dialog-fade-leave-to {
  opacity: 0;
}
</style>
