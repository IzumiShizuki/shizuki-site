<template>
  <Teleport v-if="portalTarget" :to="portalTarget">
    <div class="lightapp-header-portal">
      <slot />
    </div>
  </Teleport>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const portalTarget = computed(() => {
  const normalized = Number(props.windowId);
  if (!Number.isInteger(normalized) || normalized <= 0) {
    return '';
  }
  return `#lightapp-header-portal-${normalized}`;
});
</script>

<style scoped>
.lightapp-header-portal {
  display: flex;
  align-items: center;
  gap: 8px;
  min-width: 0;
  overflow-x: auto;
  padding-left: 6px;
  scrollbar-width: thin;
}

.lightapp-header-portal::-webkit-scrollbar {
  height: 4px;
}

.lightapp-header-portal::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(118, 130, 156, 0.44);
}
</style>
