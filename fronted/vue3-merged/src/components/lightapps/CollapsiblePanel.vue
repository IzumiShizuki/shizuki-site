<template>
  <Transition name="panel-collapse">
    <component :is="tag" v-if="visible" v-bind="attrs">
      <slot />
    </component>
  </Transition>
</template>

<script setup>
import { useAttrs } from 'vue';

defineOptions({
  inheritAttrs: false
});

defineProps({
  visible: {
    type: Boolean,
    default: false
  },
  tag: {
    type: [String, Object],
    default: 'section'
  }
});

const attrs = useAttrs();
</script>
