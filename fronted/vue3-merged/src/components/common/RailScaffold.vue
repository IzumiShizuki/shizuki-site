<template>
  <component :is="tag" class="rail-scaffold">
    <slot name="rail" />
    <slot />
  </component>
</template>

<script setup>
defineProps({
  tag: {
    type: String,
    default: 'div'
  }
});
</script>
