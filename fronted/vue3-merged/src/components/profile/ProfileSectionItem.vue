<template>
  <article class="section-item liquid-material" :class="{ open }">
    <button
      class="section-head ripple-trigger"
      type="button"
      :aria-expanded="open ? 'true' : 'false'"
      @click="$emit('toggle')"
    >
      <div class="head-main">
        <p class="section-title">{{ title }}</p>
        <p class="section-summary">{{ summary }}</p>
      </div>
      <div class="head-meta">
        <span v-if="statusText" class="status-chip">{{ statusText }}</span>
        <span class="chevron" :class="{ open }">⌄</span>
      </div>
    </button>

    <transition name="section-body">
      <div v-if="open" class="section-body">
        <slot />
      </div>
    </transition>
  </article>
</template>

<script setup>
defineProps({
  title: {
    type: String,
    required: true
  },
  summary: {
    type: String,
    default: ''
  },
  statusText: {
    type: String,
    default: ''
  },
  open: {
    type: Boolean,
    default: false
  }
});

defineEmits(['toggle']);
</script>

<style scoped>
.section-item {
  --liquid-bg: rgba(14, 22, 34, 0.42);
  --liquid-border: rgba(212, 226, 245, 0.2);
  --liquid-shadow: 0 14px 26px rgba(6, 10, 18, 0.16);
  border-radius: 14px;
  overflow: hidden;
}

.section-head {
  width: 100%;
  border: 0;
  padding: 14px 16px;
  background: transparent;
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 12px;
  color: rgba(236, 244, 255, 0.95);
  text-align: left;
}

.head-main {
  min-width: 0;
  display: grid;
  gap: 4px;
}

.section-title {
  font-size: 14px;
  font-weight: 650;
  letter-spacing: 0.01em;
}

.section-summary {
  color: rgba(208, 222, 242, 0.86);
  font-size: 12px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.head-meta {
  display: flex;
  align-items: center;
  gap: 8px;
}

.status-chip {
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  font-size: 11px;
  background: rgba(var(--accent-rgb), 0.22);
  color: rgba(242, 247, 255, 0.94);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.42);
}

.chevron {
  font-size: 16px;
  color: rgba(212, 226, 245, 0.84);
  transform: rotate(0deg);
  transition: transform 0.24s ease;
}

.chevron.open {
  transform: rotate(180deg);
}

.section-body {
  padding: 0 16px 16px;
  color: rgba(232, 240, 252, 0.95);
}

.section-body-enter-active,
.section-body-leave-active {
  transition: all 0.24s ease;
}

.section-body-enter-from,
.section-body-leave-to {
  opacity: 0;
  transform: translateY(-6px);
}

@media (max-width: 860px) {
  .section-head {
    padding: 13px 14px;
  }

  .section-body {
    padding: 0 14px 14px;
  }
}
</style>
