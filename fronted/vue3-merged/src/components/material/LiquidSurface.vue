<template>
  <component
    :is="as"
    class="liquid-surface"
    :class="`liquid-surface--${variant}`"
    :data-liquid-variant="variant"
    :data-liquid-refract="refract ? 'true' : 'false'"
  >
    <slot />
  </component>
</template>

<script setup>
defineProps({
  as: {
    type: [String, Object],
    default: 'div'
  },
  variant: {
    type: String,
    default: 'panel',
    validator: (value) => ['panel', 'navigation', 'control', 'lens'].includes(value)
  },
  refract: {
    type: Boolean,
    default: true
  }
});
</script>
