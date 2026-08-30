<template>
  <div class="media-processing" :data-processing-tone="tone">
    <div class="media-processing__summary">
      <span class="media-processing__dot" aria-hidden="true"></span>
      <strong>{{ status || 'PENDING' }}</strong>
      <small v-if="ready">可发布</small>
      <small v-else>尚未就绪</small>
    </div>
    <div v-if="variants.length" class="media-processing__variants">
      <span v-for="variant in variants" :key="`${variant.variant}-${variant.deliveryScope || ''}`">
        <b>{{ variant.variant }}</b>
        <em>{{ variant.status || 'PENDING' }}</em>
        <button v-if="canRetry(variant)" type="button" @click="$emit('retry', variant)">重试</button>
      </span>
    </div>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { processingTone } from './adminAlbumStudioState';

const props = defineProps({
  status: { type: String, default: 'PENDING' },
  readyForPublication: { type: Boolean, default: false },
  variants: { type: Array, default: () => [] }
});

defineEmits(['retry']);
const tone = computed(() => processingTone(props.status));
const ready = computed(() => props.readyForPublication || String(props.status).toUpperCase() === 'READY');
function canRetry(variant) { return Boolean(variant?.retryAllowed || variant?.retryEligible); }
</script>

<style scoped>
.media-processing { display: grid; gap: 7px; }
.media-processing__summary { display: flex; align-items: center; gap: 6px; width: fit-content; padding: 4px 7px; border-radius: 999px; color: var(--theme-text-secondary); background: rgba(148,163,184,.12); font-size: 9px; }
.media-processing__summary strong { color: var(--theme-text-primary); }
.media-processing__dot { width: 6px; height: 6px; border-radius: 50%; background: #94a3b8; box-shadow: 0 0 0 3px rgba(148,163,184,.1); }
[data-processing-tone="ready"] .media-processing__dot { background: #34d399; box-shadow: 0 0 0 3px rgba(52,211,153,.12); }
[data-processing-tone="failed"] .media-processing__dot { background: #f87171; box-shadow: 0 0 0 3px rgba(248,113,113,.12); }
.media-processing__variants { display: flex; flex-wrap: wrap; gap: 6px; }
.media-processing__variants span { display: inline-flex; align-items: center; gap: 5px; padding: 5px 7px; border-radius: 8px; color: var(--theme-text-secondary); background: rgba(var(--accent-rgb), .07); font-size: 9px; }
.media-processing__variants b { color: var(--theme-text-primary); }
.media-processing__variants em { font-style: normal; }
.media-processing__variants button { border: 0; padding: 0; color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); background: transparent; font: inherit; cursor: pointer; }
</style>
