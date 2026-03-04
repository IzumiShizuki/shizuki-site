<template>
  <component
    :is="tag"
    ref="rootRef"
    class="subtle-scroll-area"
    :class="[axisClass, { 'overscroll-contained': containOverscroll }]"
  >
    <slot></slot>
  </component>
</template>

<script setup>
import { computed, ref } from 'vue';

const props = defineProps({
  tag: {
    type: String,
    default: 'div'
  },
  axis: {
    type: String,
    default: 'y',
    validator: (value) => ['y', 'x', 'both'].includes(value)
  },
  containOverscroll: {
    type: Boolean,
    default: true
  }
});

const rootRef = ref(null);

const axisClass = computed(() => {
  if (props.axis === 'x') return 'axis-x';
  if (props.axis === 'both') return 'axis-both';
  return 'axis-y';
});

function getElement() {
  return rootRef.value;
}

defineExpose({
  el: rootRef,
  getElement
});
</script>

<style scoped>
.subtle-scroll-area {
  min-height: 0;
  scrollbar-width: thin;
  scrollbar-color: rgba(104, 113, 130, 0.34) rgba(8, 12, 20, 0.02);
}

.axis-y {
  overflow-y: auto;
  overflow-x: hidden;
}

.axis-x {
  overflow-x: auto;
  overflow-y: hidden;
}

.axis-both {
  overflow: auto;
}

.overscroll-contained {
  overscroll-behavior: contain;
}

.subtle-scroll-area::-webkit-scrollbar {
  width: 6px;
  height: 6px;
}

.subtle-scroll-area::-webkit-scrollbar-track {
  background: rgba(8, 12, 20, 0.03);
  border-radius: 999px;
}

.subtle-scroll-area::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(104, 113, 130, 0.3);
  border: 1px solid transparent;
  background-clip: content-box;
}

.subtle-scroll-area::-webkit-scrollbar-thumb:hover {
  background: rgba(124, 135, 157, 0.42);
  background-clip: content-box;
}

.subtle-scroll-area::-webkit-scrollbar-corner {
  background: transparent;
}
</style>
