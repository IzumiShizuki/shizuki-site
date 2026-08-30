<template>
  <Teleport to="body" :disabled="teleportDisabled">
    <Transition name="auxiliary-drawer">
      <div
        v-if="modelValue"
        class="auxiliary-drawer"
        :class="`motion-${motionPreference.effectiveMode.value}`"
        :data-motion-mode="motionPreference.effectiveMode.value"
        data-auxiliary-drawer
        @mousedown.self="close('backdrop')"
      >
        <section
          ref="panel"
          class="auxiliary-drawer__panel"
          role="dialog"
          aria-modal="true"
          :aria-labelledby="titleId"
          tabindex="-1"
          @keydown="handleKeydown"
        >
          <header class="auxiliary-drawer__header">
            <h2 :id="titleId" class="auxiliary-drawer__title">{{ title }}</h2>
            <button type="button" class="auxiliary-drawer__close" aria-label="关闭生活抽屉" @click="close('button')">
              <span aria-hidden="true">×</span>
            </button>
          </header>
          <div class="auxiliary-drawer__content">
            <slot />
          </div>
        </section>
      </div>
    </Transition>
  </Teleport>
</template>

<script setup>
import { nextTick, onBeforeUnmount, watch, ref } from 'vue';
import { useMotionPreference } from '../../composables/useMotionPreference';

const props = defineProps({
  modelValue: {
    type: Boolean,
    default: false
  },
  title: {
    type: String,
    default: '生活与辅助内容'
  },
  teleportDisabled: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits(['update:modelValue', 'close']);
const motionPreference = useMotionPreference();
const panel = ref(null);
const titleId = `auxiliary-drawer-title-${Math.random().toString(36).slice(2, 9)}`;
let returnFocus;
let previousOverflow = '';
let pageLocked = false;

function focusableElements() {
  if (!panel.value) return [];
  return [...panel.value.querySelectorAll(
    'a[href], button:not([disabled]), input:not([disabled]), select:not([disabled]), textarea:not([disabled]), [tabindex]:not([tabindex="-1"])'
  )].filter((element) => !element.hasAttribute('hidden'));
}

function close(reason) {
  emit('update:modelValue', false);
  emit('close', reason);
}

function handleKeydown(event) {
  if (event.key === 'Escape') {
    event.preventDefault();
    close('escape');
    return;
  }
  if (event.key !== 'Tab') return;
  const focusable = focusableElements();
  if (!focusable.length) {
    event.preventDefault();
    panel.value?.focus();
    return;
  }
  const first = focusable[0];
  const last = focusable.at(-1);
  if (event.shiftKey && document.activeElement === first) {
    event.preventDefault();
    last.focus();
  } else if (!event.shiftKey && document.activeElement === last) {
    event.preventDefault();
    first.focus();
  }
}

function restorePage() {
  if (!pageLocked) return;
  document.body.style.overflow = previousOverflow;
  if (returnFocus?.isConnected) returnFocus.focus();
  returnFocus = undefined;
  pageLocked = false;
}

watch(
  () => props.modelValue,
  async (open) => {
    if (open) {
      returnFocus = document.activeElement;
      previousOverflow = document.body.style.overflow;
      document.body.style.overflow = 'hidden';
      pageLocked = true;
      await nextTick();
      const firstFocusable = focusableElements()[0];
      if (firstFocusable) firstFocusable.focus();
      else panel.value?.focus();
    } else {
      restorePage();
    }
  },
  { immediate: true }
);

onBeforeUnmount(() => {
  if (props.modelValue) restorePage();
});
</script>

<style scoped>
.auxiliary-drawer {
  position: fixed;
  z-index: 960;
  inset: 0;
  display: grid;
  align-items: end;
  background: var(--theme-scrim, rgba(12, 8, 18, 0.62));
  backdrop-filter: blur(5px);
}

.auxiliary-drawer__panel {
  width: min(100%, 720px);
  max-height: min(82dvh, 760px);
  margin-inline: auto;
  padding: 18px max(18px, env(safe-area-inset-right)) max(18px, env(safe-area-inset-bottom)) max(18px, env(safe-area-inset-left));
  overflow-y: auto;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.2));
  border-bottom: 0;
  border-radius: 24px 24px 0 0;
  color: var(--theme-text-primary);
  background: var(--theme-surface, rgba(28, 22, 38, 0.94));
  box-shadow: 0 -24px 72px rgba(8, 6, 18, 0.34);
}

.auxiliary-drawer__header {
  position: sticky;
  z-index: 1;
  top: -18px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 16px;
  margin: -6px 0 14px;
  padding: 12px 0;
  background: inherit;
}

.auxiliary-drawer__title {
  margin: 0;
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: 1.1rem;
}

.auxiliary-drawer__close {
  display: inline-grid;
  place-items: center;
  width: 44px;
  min-height: 44px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.2));
  border-radius: 999px;
  color: inherit;
  background: var(--theme-surface-soft, rgba(255, 255, 255, 0.1));
  font-size: 1.5rem;
  cursor: pointer;
}

.auxiliary-drawer__close:focus-visible,
.auxiliary-drawer__panel:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.auxiliary-drawer-enter-active,
.auxiliary-drawer-leave-active {
  transition: opacity 220ms ease;
}

.auxiliary-drawer-enter-active .auxiliary-drawer__panel,
.auxiliary-drawer-leave-active .auxiliary-drawer__panel {
  transition: transform 220ms ease;
}

.auxiliary-drawer-enter-from,
.auxiliary-drawer-leave-to {
  opacity: 0;
}

.auxiliary-drawer-enter-from .auxiliary-drawer__panel,
.auxiliary-drawer-leave-to .auxiliary-drawer__panel {
  transform: translateY(24px);
}

.auxiliary-drawer.motion-soothing.auxiliary-drawer-enter-active,
.auxiliary-drawer.motion-soothing.auxiliary-drawer-leave-active {
  transition-duration: 120ms;
}

.auxiliary-drawer.motion-soothing .auxiliary-drawer__panel {
  transform: none;
  transition: none;
}

@media (min-width: 900px) {
  .auxiliary-drawer__panel {
    margin-bottom: 24px;
    border-bottom: 1px solid var(--theme-border, rgba(255, 255, 255, 0.2));
    border-radius: 24px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .auxiliary-drawer-enter-active,
  .auxiliary-drawer-leave-active {
    transition-duration: 1ms;
  }

  .auxiliary-drawer-enter-active .auxiliary-drawer__panel,
  .auxiliary-drawer-leave-active .auxiliary-drawer__panel {
    transform: none;
    transition: none;
  }
}
</style>
