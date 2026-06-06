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
.page-intro-header {
  display: grid;
  gap: 10px;
  padding: 4px 0;
}

.page-intro-eyebrow {
  margin: 0;
  font-size: 11px;
  font-weight: 700;
  letter-spacing: 0.18em;
  text-transform: uppercase;
  color: var(--theme-text-secondary, rgba(231, 211, 196, 0.88));
  text-shadow: var(--theme-contrast-text-shadow-soft, 0 1px 0 rgba(0, 0, 0, 0.18));
}

.page-intro-title {
  margin: 0;
  line-height: 1.08;
  letter-spacing: -0.03em;
  text-wrap: balance;
  text-shadow: var(--theme-contrast-text-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.54));
  -webkit-text-stroke: var(--theme-contrast-outline-width, 0.18px) var(--theme-contrast-stroke-soft, rgba(5, 8, 14, 0.28));
}

.page-intro-description {
  margin: 0;
  max-width: 72ch;
  font-size: 14px;
  line-height: 1.65;
  color: var(--theme-text-secondary, rgba(231, 211, 196, 0.88));
  text-shadow: var(--theme-contrast-text-shadow-soft, 0 1px 0 rgba(0, 0, 0, 0.18));
}

.page-intro-hint {
  margin: 0;
  font-size: 12px;
  line-height: 1.55;
  color: var(--theme-text-tertiary, rgba(205, 183, 168, 0.78));
  text-shadow: var(--theme-contrast-text-shadow-soft, 0 1px 0 rgba(0, 0, 0, 0.18));
}

.page-intro-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 12px;
  align-items: center;
  margin-top: 4px;
}
</style>
