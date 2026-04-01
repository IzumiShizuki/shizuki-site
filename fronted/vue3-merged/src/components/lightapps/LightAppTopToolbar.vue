<template>
  <LightAppHeaderPortal :window-id="windowId">
    <div class="lightapp-top-toolbar top-toolbar" :class="`layout-${layout}`">
      <slot />
    </div>
  </LightAppHeaderPortal>
</template>

<script setup>
import LightAppHeaderPortal from './LightAppHeaderPortal.vue';

defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  },
  layout: {
    type: String,
    default: 'wrap'
  }
});
</script>

<style scoped>
.top-toolbar {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.top-toolbar.layout-space-between {
  justify-content: space-between;
}

:deep(.toolbar-switches) {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  flex: 0 0 auto;
}

:deep(.toolbar-switches.with-divider) {
  padding-right: 8px;
  margin-right: 4px;
  border-right: 1px solid var(--theme-divider-soft, rgba(255, 255, 255, 0.28));
}

:deep(.toolbar-btn.is-active),
:deep(.toolbar-tab-btn.is-active) {
  border-color: rgba(var(--accent-rgb), 0.56);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgb(var(--accent-strong-rgb));
}
</style>
