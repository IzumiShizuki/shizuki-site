<template>
  <div class="sticky-card-stack" :style="stackStyle">
    <slot />
  </div>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  top: {
    type: String,
    default: 'calc(var(--app-topbar-height, 72px) + 20px)'
  },
  gap: {
    type: String,
    default: '16px'
  }
});

const stackStyle = computed(() => ({
  '--sticky-card-top': props.top,
  '--sticky-card-gap': props.gap
}));
</script>

<style scoped>
.sticky-card-stack {
  position: sticky;
  top: var(--sticky-card-top);
  display: grid;
  gap: var(--sticky-card-gap);
  min-width: 0;
  max-height: none;
  overflow: visible;
}

@media (max-width: 899.98px) {
  .sticky-card-stack {
    position: static;
  }
}
</style>
