import { onBeforeUnmount, onMounted, unref } from 'vue';

function resolveElement(source) {
  const value = unref(source);
  if (!value) return null;
  if (value instanceof Element) return value;
  if (value.$el instanceof Element) return value.$el;
  return null;
}

function resolveEnabled(input) {
  if (typeof input === 'function') {
    return Boolean(input());
  }
  return Boolean(unref(input));
}

export function useDismissiblePopover(options = {}) {
  const { rootRef, enabled = true, onDismiss, shouldIgnoreEvent } = options;

  function handlePointerDown(event) {
    if (!resolveEnabled(enabled)) return;

    if (typeof shouldIgnoreEvent === 'function' && shouldIgnoreEvent(event)) {
      return;
    }

    const root = resolveElement(rootRef);
    const target = event?.target;
    if (!root || !(target instanceof Node)) return;
    if (root.contains(target)) return;

    if (typeof onDismiss === 'function') {
      onDismiss(event);
    }
  }

  onMounted(() => {
    if (typeof document !== 'undefined') {
      document.addEventListener('pointerdown', handlePointerDown, true);
    }
  });

  onBeforeUnmount(() => {
    if (typeof document !== 'undefined') {
      document.removeEventListener('pointerdown', handlePointerDown, true);
    }
  });

  return {
    handlePointerDown
  };
}
