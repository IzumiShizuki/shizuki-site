<template>
  <p class="search-result-excerpt"><template v-for="(part, index) in parts" :key="index"><mark v-if="part.match">{{ part.text }}</mark><span v-else>{{ part.text }}</span></template></p>
</template>

<script setup>
import { computed } from 'vue';
const props = defineProps({ text: { type: String, default: '' }, query: { type: String, default: '' } });
const parts = computed(() => {
  const terms = [...new Set(props.query.trim().split(/\s+/u).filter(Boolean))]
    .map(term => term.replace(/[.*+?^${}()|[\]\\]/g, '\\$&')).sort((a, b) => b.length - a.length);
  if (!terms.length) return [{ text: props.text, match: false }];
  const expression = new RegExp(`(${terms.join('|')})`, 'giu');
  return props.text.split(expression).filter(Boolean).map((text, index) => ({
    text, match: new RegExp(`^(?:${terms.join('|')})$`, 'iu').test(text)
  }));
});
</script>

<style scoped>
.search-result-excerpt { overflow-wrap: anywhere; }
mark { background: var(--accent-mode-fill, rgba(242, 179, 157, .24)); color: inherit; border-radius: 3px; padding-inline: 2px; font-weight: 650; }
</style>
