<template>
  <header class="page-intro-header page-header">
    <p v-if="eyebrow" class="page-intro-eyebrow eyebrow">{{ eyebrow }}</p>
    <component :is="titleTag" class="page-intro-title">{{ title }}</component>
    <p v-if="description" class="page-intro-description">{{ description }}</p>
    <slot />
    <p v-if="hint" class="page-intro-hint state-tip">{{ hint }}</p>
    <div v-if="$slots.actions" class="page-intro-actions">
      <slot name="actions" />
    </div>
  </header>
</template>

<script setup>
defineProps({
  eyebrow: {
    type: String,
    default: ''
  },
  title: {
    type: String,
    default: ''
  },
  titleTag: {
    type: String,
    default: 'h1'
  },
  description: {
    type: String,
    default: ''
  },
  hint: {
    type: String,
    default: ''
  }
});
</script>

<style scoped>
.page-intro-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 12px;
  align-items: center;
  margin-top: 14px;
}
</style>
