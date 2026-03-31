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
</style>
