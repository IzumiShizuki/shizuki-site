<template>
  <nav class="route-dot-rail" :class="railClassName" :aria-label="ariaLabel">
    <span v-if="showLine" class="dot-rail-line" aria-hidden="true"></span>

    <button
      v-for="item in normalizedItems"
      :key="item.key"
      class="dot-rail-btn ripple-trigger"
      :class="{ active: activeKey === item.key, disabled: item.disabled }"
      type="button"
      :title="item.label"
      :aria-label="item.label"
      :disabled="item.disabled"
      @click="$emit('select', item.key)"
    >
      <span class="dot-rail-core" aria-hidden="true">
        <i :class="item.icon"></i>
      </span>
      <span class="sr-only">{{ item.label }}</span>
    </button>
  </nav>
</template>

<script setup>
import { computed } from 'vue';

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
  }
});

defineEmits(['select']);

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
        disabled: Boolean(item?.disabled)
      };
    })
    .filter(Boolean)
);

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
  justify-content: space-between;
  gap: 0;
  padding-top: clamp(96px, 33.333%, 256px);
  padding-bottom: clamp(48px, 16.667%, 140px);
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
  top: clamp(52px, 16.667%, 126px);
  bottom: clamp(24px, 8.334%, 76px);
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
  .route-dot-rail {
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

  .route-dot-rail.distribution-mid-sixths,
  .route-dot-rail.distribution-full-sixths {
    justify-content: flex-start;
    gap: 14px;
    padding-top: 6px;
    padding-bottom: 6px;
  }

  .route-dot-rail::-webkit-scrollbar {
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
</style>
