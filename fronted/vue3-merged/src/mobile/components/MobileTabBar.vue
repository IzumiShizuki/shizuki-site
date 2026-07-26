<template>
  <nav class="m-tabbar" aria-label="主导航">
    <button
      v-for="tab in tabs"
      :key="tab.key"
      type="button"
      class="m-tab m-press"
      :class="{ active: activeKey === tab.key }"
      @click="$emit('select', tab)"
    >
      <i :class="tab.icon" aria-hidden="true"></i>
      <span>{{ tab.label }}</span>
    </button>
  </nav>
</template>

<script setup>
defineProps({
  tabs: {
    type: Array,
    default: () => []
  },
  activeKey: {
    type: String,
    default: ''
  }
});

defineEmits(['select']);
</script>

<style scoped>
.m-tabbar {
  position: absolute;
  left: 50%;
  transform: translateX(-50%);
  bottom: calc(var(--m-safe-bottom) + 10px);
  z-index: 60;
  display: flex;
  align-items: stretch;
  gap: 4px;
  padding: 6px;
  border-radius: 999px;
  background: var(--m-surface-strong);
  border: 1px solid var(--m-border);
  backdrop-filter: var(--m-blur);
  -webkit-backdrop-filter: var(--m-blur);
  box-shadow: var(--m-shadow);
}

.m-tab {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 3px;
  min-width: 86px;
  padding: 8px 14px;
  border: none;
  border-radius: 999px;
  background: transparent;
  color: var(--m-text-faint);
  font-size: 11px;
  letter-spacing: 0.06em;
  cursor: pointer;
}

.m-tab i {
  font-size: 17px;
  transition: transform 220ms cubic-bezier(0.34, 1.56, 0.64, 1);
}

.m-tab.active {
  background: linear-gradient(135deg, rgba(var(--m-grad-a), 0.2), rgba(var(--m-grad-b), 0.18));
  color: var(--m-text);
}

.m-tab.active i {
  transform: translateY(-1px) scale(1.08);
  background: var(--m-accent-gradient);
  -webkit-background-clip: text;
  background-clip: text;
  -webkit-text-fill-color: transparent;
  filter: drop-shadow(0 3px 10px rgba(var(--m-accent-rgb), 0.4));
}

@media (max-width: 359px) {
  .m-tab {
    min-width: 72px;
    padding: 8px 10px;
  }
}

@media (orientation: landscape) and (max-height: 500px) {
  .m-tabbar {
    left: auto;
    right: calc(var(--m-safe-right) + 12px);
    transform: none;
    bottom: calc(var(--m-safe-bottom) + 8px);
  }

  .m-tab {
    flex-direction: row;
    gap: 8px;
    min-width: 0;
    padding: 8px 16px;
  }
}
</style>
