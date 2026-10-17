<template>
  <Teleport to="body">
    <Transition name="mobile-toc" @after-enter="handleAfterEnter" @after-leave="handleAfterLeave">
      <div
        v-if="open"
        class="mobile-toc-overlay"
        @click="handleClose"
      >
        <nav
          ref="panelRef"
          class="mobile-toc-panel"
          :aria-label="title"
          role="dialog"
          aria-modal="true"
          tabindex="-1"
          @click.stop
          @keydown="handleKeydown"
        >
          <header class="mobile-toc-header">
            <h2>{{ title }}</h2>
            <button
              ref="closeButtonRef"
              type="button"
              class="mobile-toc-close ripple-trigger"
              aria-label="关闭目录"
              @click="handleClose"
            >
              <i class="fas fa-times"></i>
            </button>
          </header>
          <div ref="tocContentRef" class="mobile-toc-content">
            <slot></slot>
          </div>
        </nav>
      </div>
    </Transition>
  </Teleport>
</template>

<script setup>
import { ref, watch, onMounted, onBeforeUnmount, nextTick } from 'vue';

const props = defineProps({
  open: {
    type: Boolean,
    required: true
  },
  title: {
    type: String,
    default: '目录'
  }
});

const emit = defineEmits(['update:open', 'close']);
const panelRef = ref(null);
const closeButtonRef = ref(null);
const tocContentRef = ref(null);
let returnFocus = null;
let savedBodyOverflow = '';
let scrollLocked = false;

function releaseScroll() {
  if (!scrollLocked) return;
  document.body.style.overflow = savedBodyOverflow;
  scrollLocked = false;
}

function handleClose() {
  emit('update:open', false);
  emit('close');
}

function handleAfterLeave() {
  const target = returnFocus;
  if (target && document.body.contains(target)) {
    nextTick(() => {
      if (document.body.contains(target)) {
        target.focus({ preventScroll: true });
      }
    });
  }
  returnFocus = null;
}

function handleAfterEnter() {
  // Set initial focus to the first focusable element (close button)
  nextTick(() => {
    if (closeButtonRef.value) {
      closeButtonRef.value.focus();
    }
  });
}

function handleKeydown(event) {
  if (event.key === 'Escape') {
    event.preventDefault();
    handleClose();
    return;
  }

  // Tab key focus trap
  if (event.key === 'Tab') {
    const panel = panelRef.value;
    if (!panel) return;

    const focusableElements = panel.querySelectorAll(
      'button:not([disabled]), [href], input:not([disabled]), select:not([disabled]), textarea:not([disabled]), [tabindex]:not([tabindex="-1"])'
    );
    const focusableArray = Array.from(focusableElements);

    if (focusableArray.length === 0) return;

    const firstFocusable = focusableArray[0];
    const lastFocusable = focusableArray[focusableArray.length - 1];

    if (event.shiftKey) {
      // Shift+Tab: loop from first to last
      if (document.activeElement === firstFocusable) {
        event.preventDefault();
        lastFocusable.focus();
      }
    } else {
      // Tab: loop from last to first
      if (document.activeElement === lastFocusable) {
        event.preventDefault();
        firstFocusable.focus();
      }
    }
  }
}

function handleEscape(event) {
  if (event.key === 'Escape' && props.open && !event.defaultPrevented) {
    handleClose();
  }
}

watch(() => props.open, (isOpen) => {
  if (isOpen) {
    returnFocus = document.activeElement;
    savedBodyOverflow = document.body.style.overflow;
    scrollLocked = true;
    document.body.style.overflow = 'hidden';
  } else {
    releaseScroll();
  }
}, { immediate: true });

onMounted(() => {
  document.addEventListener('keydown', handleEscape);
});

onBeforeUnmount(() => {
  document.removeEventListener('keydown', handleEscape);
  releaseScroll();
  handleAfterLeave();
});
</script>

<style scoped>
.mobile-toc-overlay {
  position: fixed;
  inset: 0;
  z-index: 3300;
  background: var(--theme-scrim);
  backdrop-filter: blur(4px);
  -webkit-backdrop-filter: blur(4px);
  display: flex;
  align-items: flex-end;
  padding: 0;
}

@media (min-width: 900px) {
  .mobile-toc-overlay {
    align-items: center;
    justify-content: center;
    padding: var(--space-4);
  }
}

.mobile-toc-panel {
  width: 100%;
  max-width: 500px;
  max-height: 75vh;
  background: var(--app-shell-backdrop);
  border-radius: var(--radius-lg) var(--radius-lg) 0 0;
  box-shadow: var(--shadow-lg);
  display: flex;
  flex-direction: column;
  overflow: hidden;
}

@media (min-width: 900px) {
  .mobile-toc-panel {
    border-radius: var(--radius-lg);
    max-height: 80vh;
  }
}

.mobile-toc-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: var(--space-4) var(--space-5);
  border-bottom: 1px solid var(--theme-border-subtle);
  flex-shrink: 0;
}

.mobile-toc-header h2 {
  font-size: 1.125rem;
  font-weight: 600;
  color: var(--theme-text-primary);
  margin: 0;
}

.mobile-toc-close {
  width: 44px;
  height: 44px;
  display: flex;
  align-items: center;
  justify-content: center;
  border: none;
  background: var(--theme-surface-soft);
  color: var(--theme-icon-primary);
  border-radius: var(--radius-sm);
  cursor: pointer;
  transition: background-color var(--dur-fast) var(--ease-out);
  flex-shrink: 0;
}

.mobile-toc-close:hover {
  background: var(--theme-floating-surface-hover);
}

.mobile-toc-close:focus-visible {
  outline: none;
  box-shadow: var(--focus-ring);
}

.mobile-toc-content {
  flex: 1;
  overflow-y: auto;
  overscroll-behavior: contain;
  padding: var(--space-4) var(--space-5);
  padding-bottom: max(var(--space-6), env(safe-area-inset-bottom));
}

/* Transition animations */
.mobile-toc-enter-active,
.mobile-toc-leave-active {
  transition: opacity var(--dur-base) var(--ease-out);
}

.mobile-toc-enter-active .mobile-toc-panel,
.mobile-toc-leave-active .mobile-toc-panel {
  transition: transform var(--dur-base) var(--ease-out);
}

.mobile-toc-enter-from,
.mobile-toc-leave-to {
  opacity: 0;
}

.mobile-toc-enter-from .mobile-toc-panel,
.mobile-toc-leave-to .mobile-toc-panel {
  transform: translateY(100%);
}

@media (min-width: 900px) {
  .mobile-toc-enter-from .mobile-toc-panel,
  .mobile-toc-leave-to .mobile-toc-panel {
    transform: translateY(20px) scale(0.95);
  }
}

.mobile-toc-enter-to .mobile-toc-panel,
.mobile-toc-leave-from .mobile-toc-panel {
  transform: translateY(0) scale(1);
}

/* Reduced motion support */
@media (prefers-reduced-motion: reduce) {
  .mobile-toc-enter-active,
  .mobile-toc-leave-active,
  .mobile-toc-enter-active .mobile-toc-panel,
  .mobile-toc-leave-active .mobile-toc-panel {
    transition-duration: 1ms;
  }
}
</style>
