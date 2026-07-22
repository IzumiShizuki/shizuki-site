<template>
  <nav ref="railElement" class="route-dot-rail" :class="[railClassName, `variant-${normalizedVariant}`]" :aria-label="ariaLabel">
    <template v-if="normalizedVariant === 'menu'">
      <div
        v-for="(group, groupIndex) in groupedItems"
        :key="group.key"
        class="route-rail-group"
        role="group"
        :aria-labelledby="group.label ? `${railId}-group-${groupIndex}` : undefined"
      >
        <span v-if="group.label" :id="`${railId}-group-${groupIndex}`" class="route-rail-group-label">{{ group.label }}</span>

        <div class="route-rail-group-list">
          <button
            v-for="item in group.items"
            :key="item.key"
            class="dot-rail-btn ripple-trigger"
            :class="{ active: activeKey === item.key, disabled: item.disabled }"
            type="button"
            :title="item.label"
            :aria-label="item.label"
            :aria-current="activeKey === item.key ? 'page' : undefined"
            :disabled="item.disabled"
            @click="$emit('select', item.key)"
          >
            <span class="dot-rail-core" aria-hidden="true">
              <i :class="item.icon"></i>
            </span>
            <span class="route-rail-label">{{ item.label }}</span>
          </button>
        </div>
      </div>
    </template>

    <template v-else>
      <span v-if="showLine" class="dot-rail-line" aria-hidden="true"></span>

      <button
        v-for="item in normalizedItems"
        :key="item.key"
        class="dot-rail-btn ripple-trigger"
        :class="{ active: activeKey === item.key, disabled: item.disabled }"
        type="button"
        :title="item.label"
        :aria-label="item.label"
        :aria-current="activeKey === item.key ? 'page' : undefined"
        :disabled="item.disabled"
        @click="$emit('select', item.key)"
      >
        <span class="dot-rail-core" aria-hidden="true">
          <i :class="item.icon"></i>
        </span>
        <span class="sr-only">{{ item.label }}</span>
      </button>
    </template>
  </nav>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, ref, useId, watch } from 'vue';

const props = defineProps({
  items: {
    type: Array,
    default: () => []
  },
  activeKey: {
    type: String,
    default: ''
  },
  ariaLabel: {
    type: String,
    default: '页面导航'
  },
  showLine: {
    type: Boolean,
    default: true
  },
  distribution: {
    type: String,
    default: 'stack'
  },
  variant: {
    type: String,
    default: 'dots'
  }
});

defineEmits(['select']);

const railElement = ref(null);
const railId = useId();
let railResizeObserver = null;
let revealFrame = null;
let disposed = false;

const normalizedItems = computed(() =>
  props.items
    .map((item) => {
      const key = String(item?.key || '').trim();
      if (!key) return null;
      const label = String(item?.label || key).trim();
      const icon = String(item?.icon || 'fas fa-circle').trim();
      return {
        key,
        label: label || key,
        icon,
        group: String(item?.group || 'default').trim() || 'default',
        groupLabel: String(item?.groupLabel || '').trim(),
        disabled: Boolean(item?.disabled)
      };
    })
    .filter(Boolean)
);

const normalizedVariant = computed(() => (String(props.variant || '').trim().toLowerCase() === 'menu' ? 'menu' : 'dots'));

const groupedItems = computed(() => {
  const groups = new Map();

  normalizedItems.value.forEach((item) => {
    if (!groups.has(item.group)) {
      groups.set(item.group, {
        key: item.group,
        label: item.groupLabel,
        items: []
      });
    }

    const group = groups.get(item.group);
    if (!group.label && item.groupLabel) {
      group.label = item.groupLabel;
    }
    group.items.push(item);
  });

  return Array.from(groups.values());
});

function revealActiveItem() {
  if (disposed || normalizedVariant.value !== 'menu') return;
  void nextTick(() => {
    if (disposed) return;
    const runReveal = () => {
      revealFrame = null;
      if (disposed) return;
      adjustActiveItemScroll();
    };
    if (typeof globalThis.requestAnimationFrame === 'function') {
      if (revealFrame !== null && typeof globalThis.cancelAnimationFrame === 'function') {
        globalThis.cancelAnimationFrame(revealFrame);
      }
      revealFrame = globalThis.requestAnimationFrame(runReveal);
      return;
    }
    runReveal();
  });
}

function adjustActiveItemScroll() {
  const activeItem = railElement.value?.querySelector?.('[aria-current="page"]');
  if (!activeItem) return;

  const groupList = activeItem.closest?.('.route-rail-group-list');
  if (groupList && groupList.scrollWidth > groupList.clientWidth) {
    const listRect = groupList.getBoundingClientRect();
    const itemRect = activeItem.getBoundingClientRect();
    if (itemRect.left < listRect.left) {
      groupList.scrollLeft -= listRect.left - itemRect.left;
    } else if (itemRect.right > listRect.right) {
      groupList.scrollLeft += itemRect.right - listRect.right;
    }
  }

  const rail = railElement.value;
  if (rail && rail.scrollHeight > rail.clientHeight) {
    const railRect = rail.getBoundingClientRect();
    const itemRect = activeItem.getBoundingClientRect();
    if (itemRect.top < railRect.top) {
      rail.scrollTop -= railRect.top - itemRect.top;
    } else if (itemRect.bottom > railRect.bottom) {
      rail.scrollTop += itemRect.bottom - railRect.bottom;
    }
  }
}

watch(() => [props.activeKey, normalizedItems.value.length, normalizedVariant.value], revealActiveItem, { flush: 'post' });
onMounted(() => {
  disposed = false;
  revealActiveItem();
  if (typeof globalThis.ResizeObserver === 'function' && railElement.value) {
    railResizeObserver = new globalThis.ResizeObserver(revealActiveItem);
    railResizeObserver.observe(railElement.value);
  }
});
onBeforeUnmount(() => {
  disposed = true;
  railResizeObserver?.disconnect();
  railResizeObserver = null;
  if (revealFrame !== null && typeof globalThis.cancelAnimationFrame === 'function') {
    globalThis.cancelAnimationFrame(revealFrame);
  }
  revealFrame = null;
});

const railClassName = computed(() => {
  const allowed = new Set(['stack', 'mid-sixths', 'full-sixths']);
  const normalized = String(props.distribution || 'stack').trim().toLowerCase();
  const distribution = allowed.has(normalized) ? normalized : 'stack';
  return `distribution-${distribution}`;
});
</script>

<style scoped>
.route-dot-rail {
  position: relative;
  display: inline-flex;
  flex-direction: column;
  gap: 24px;
  align-items: center;
  justify-content: flex-start;
  width: 100%;
  min-height: 100%;
  padding: 16px 0;
}

.route-dot-rail.distribution-mid-sixths {
  display: grid;
  grid-template-columns: 1fr;
  grid-template-rows: repeat(6, minmax(0, 1fr));
  justify-content: center;
  justify-items: center;
  align-items: center;
  gap: 0;
  padding-top: 0;
  padding-bottom: 0;
}

.route-dot-rail.distribution-full-sixths {
  justify-content: space-evenly;
  gap: 0;
  padding-top: clamp(18px, 8%, 56px);
  padding-bottom: clamp(18px, 8%, 56px);
}

.dot-rail-line {
  position: absolute;
  top: 14px;
  bottom: 14px;
  left: 50%;
  width: 2px;
  transform: translateX(-50%);
  border-radius: 999px;
  background: linear-gradient(180deg, rgba(84, 212, 238, 0), rgba(84, 212, 238, 0.62), rgba(84, 212, 238, 0));
  pointer-events: none;
}

.route-dot-rail.distribution-mid-sixths .dot-rail-line {
  top: calc(100% / 6);
  bottom: calc(100% / 6);
  z-index: 0;
}

.route-dot-rail.distribution-mid-sixths .dot-rail-btn:nth-of-type(1) {
  grid-row: 2;
}

.route-dot-rail.distribution-mid-sixths .dot-rail-btn:nth-of-type(2) {
  grid-row: 3;
}

.route-dot-rail.distribution-mid-sixths .dot-rail-btn:nth-of-type(3) {
  grid-row: 4;
}

.route-dot-rail.distribution-mid-sixths .dot-rail-btn:nth-of-type(4) {
  grid-row: 5;
}

.route-dot-rail.distribution-full-sixths .dot-rail-line {
  top: clamp(12px, 6%, 42px);
  bottom: clamp(12px, 6%, 42px);
}

.dot-rail-btn {
  border: 0;
  width: 50px;
  height: 50px;
  border-radius: 999px;
  padding: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  background: transparent;
  color: rgba(210, 229, 247, 0.9);
  position: relative;
  z-index: 1;
  cursor: pointer;
  transition: transform 0.2s ease, color 0.2s ease;
}

.dot-rail-core {
  width: 40px;
  height: 40px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  color: rgba(195, 230, 250, 0.95);
  background: rgba(150, 186, 212, 0.17);
  box-shadow: inset 0 0 0 1px rgba(147, 181, 207, 0.26);
  transition: background-color 0.2s ease, box-shadow 0.2s ease, color 0.2s ease;
}

.dot-rail-core i {
  font-size: 14px;
}

.dot-rail-btn:hover {
  transform: translateY(-1px) scale(1.03);
}

.dot-rail-btn:hover .dot-rail-core {
  background: rgba(167, 198, 223, 0.24);
  box-shadow: inset 0 0 0 1px rgba(98, 209, 239, 0.42);
}

.dot-rail-btn:focus-visible {
  outline: 2px solid rgba(98, 219, 245, 0.75);
  outline-offset: 2px;
  box-shadow: 0 0 0 3px rgba(var(--accent-rgb), 0.24);
}

.dot-rail-btn.active .dot-rail-core {
  color: rgba(240, 248, 255, 0.98);
  background: linear-gradient(145deg, rgba(63, 176, 209, 0.34), rgba(56, 121, 191, 0.3));
  box-shadow: inset 0 0 0 1px rgba(89, 201, 233, 0.6);
}

.dot-rail-btn.disabled,
.dot-rail-btn:disabled {
  opacity: 0.45;
  cursor: not-allowed;
}

.route-dot-rail.variant-menu {
  container-name: route-menu;
  container-type: inline-size;
  display: flex;
  flex-direction: column;
  align-items: stretch;
  justify-content: flex-start;
  gap: 16px;
  width: 100%;
  min-height: 0;
  padding: 0;
}

.variant-menu .route-rail-group {
  display: grid;
  gap: 6px;
  min-width: 0;
}

.variant-menu .route-rail-group-label {
  padding: 0 8px;
  color: var(--theme-text-secondary, rgba(185, 205, 226, 0.72));
  font-size: 10px;
  font-weight: 700;
  letter-spacing: 0.14em;
}

.variant-menu .route-rail-group-list {
  display: grid;
  gap: 4px;
  min-width: 0;
}

.variant-menu .dot-rail-btn {
  width: 100%;
  height: 44px;
  min-height: 44px;
  justify-content: flex-start;
  gap: 9px;
  padding: 4px 10px 4px 5px;
  border: 1px solid transparent;
  border-radius: 12px;
  color: var(--theme-text-secondary, rgba(221, 232, 245, 0.9));
  background: transparent;
  grid-row: auto !important;
  transition:
    transform 180ms ease,
    color 180ms ease,
    background-color 180ms ease,
    border-color 180ms ease,
    box-shadow 180ms ease;
}

.variant-menu .dot-rail-core {
  flex: 0 0 32px;
  width: 32px;
  height: 32px;
  color: var(--theme-icon-muted, rgba(199, 222, 240, 0.88));
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.07));
  box-shadow: inset 0 0 0 1px var(--theme-border, rgba(255, 255, 255, 0.12));
}

.variant-menu .dot-rail-core i {
  font-size: 13px;
}

.variant-menu .route-rail-label {
  min-width: 0;
  overflow: hidden;
  font-size: 13px;
  font-weight: 600;
  letter-spacing: 0.01em;
  text-align: left;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.variant-menu .dot-rail-btn:hover {
  transform: translateX(2px);
  color: var(--theme-text-primary, rgba(247, 250, 255, 0.98));
  border-color: var(--theme-border-strong, rgba(255, 255, 255, 0.2));
  background: var(--theme-floating-surface-hover, rgba(255, 255, 255, 0.08));
}

.variant-menu .dot-rail-btn:hover .dot-rail-core {
  background: var(--theme-floating-surface-hover, rgba(255, 255, 255, 0.11));
  box-shadow: inset 0 0 0 1px var(--accent-mode-border, rgba(var(--accent-rgb), 0.32));
}

.variant-menu .dot-rail-btn.active,
.variant-menu .dot-rail-btn[aria-current='page'] {
  color: var(--theme-text-primary, rgba(247, 250, 255, 0.98)) !important;
  border-color: var(--accent-mode-border-strong, rgba(var(--accent-strong-rgb), 0.62));
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.14)) !important;
  box-shadow:
    inset 3px 0 0 rgba(var(--accent-strong-rgb), 0.86),
    0 8px 18px rgba(var(--accent-rgb), 0.12);
}

.variant-menu .dot-rail-btn.active .dot-rail-core,
.variant-menu .dot-rail-btn[aria-current='page'] .dot-rail-core {
  color: inherit;
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.2));
  box-shadow: inset 0 0 0 1px rgba(var(--accent-soft-rgb), 0.42);
}

.variant-menu .dot-rail-btn:focus-visible {
  outline: none;
  border-color: var(--accent-mode-border-strong, rgba(var(--accent-strong-rgb), 0.72));
  box-shadow: var(--accent-mode-focus-ring, 0 0 0 3px rgba(var(--accent-rgb), 0.24)) !important;
}

.sr-only {
  position: absolute;
  width: 1px;
  height: 1px;
  padding: 0;
  margin: -1px;
  overflow: hidden;
  clip: rect(0, 0, 0, 0);
  white-space: nowrap;
  border: 0;
}

@media (max-width: 1060px) {
  .route-dot-rail:not(.variant-menu) {
    display: flex;
    min-height: auto;
    width: 100%;
    flex-direction: row;
    justify-content: flex-start;
    padding: 6px 0;
    gap: 14px;
    overflow-x: auto;
    overflow-y: hidden;
    scrollbar-width: none;
  }

  .route-dot-rail:not(.variant-menu).distribution-mid-sixths,
  .route-dot-rail:not(.variant-menu).distribution-full-sixths {
    display: flex;
    grid-template-columns: none;
    grid-template-rows: none;
    justify-content: flex-start;
    gap: 14px;
    padding-top: 6px;
    padding-bottom: 6px;
  }

  .route-dot-rail:not(.variant-menu)::-webkit-scrollbar {
    display: none;
  }

  .dot-rail-line {
    top: 50%;
    bottom: auto;
    left: 10px;
    right: 10px;
    width: auto;
    height: 2px;
    transform: translateY(-50%);
    background: linear-gradient(90deg, rgba(84, 212, 238, 0), rgba(84, 212, 238, 0.62), rgba(84, 212, 238, 0));
  }
}

@container route-menu (min-width: 200px) {
  .variant-menu .route-rail-group {
    grid-template-columns: 62px minmax(0, 1fr);
    align-items: center;
    gap: 8px;
  }

  .variant-menu .route-rail-group-label {
    padding: 0;
    font-size: 11px;
    text-align: center;
  }

  .variant-menu .route-rail-group-list {
    display: flex;
    gap: 7px;
    padding: 2px 2px 6px;
    overflow-x: auto;
    overflow-y: hidden;
    scroll-padding-inline: 2px;
    scroll-snap-type: x proximity;
    scrollbar-width: thin;
    scrollbar-color: rgba(var(--accent-rgb), 0.38) transparent;
  }

  .variant-menu .route-rail-group-list::-webkit-scrollbar {
    height: 4px;
  }

  .variant-menu .route-rail-group-list::-webkit-scrollbar-thumb {
    border-radius: 999px;
    background: rgba(var(--accent-rgb), 0.38);
  }

  .variant-menu .dot-rail-btn {
    flex: 0 0 auto;
    width: auto;
    min-width: max-content;
    height: 44px;
    min-height: 44px;
    padding: 3px 11px 3px 4px;
    scroll-snap-align: start;
  }

  .variant-menu .dot-rail-core {
    flex-basis: 30px;
    width: 30px;
    height: 30px;
  }

  .variant-menu .dot-rail-btn:hover {
    transform: translateY(-1px);
  }
}

@media (max-width: 640px) {
  .variant-menu .route-rail-group {
    grid-template-columns: 1fr;
    gap: 4px;
  }

  .variant-menu .route-rail-group-label {
    padding-left: 4px;
    text-align: left;
  }
}
</style>
