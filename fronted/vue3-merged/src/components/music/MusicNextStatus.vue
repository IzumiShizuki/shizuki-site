<template>
  <div class="next-status">
    <span class="next-status-text" role="status" :title="message">{{ message }}</span>
    <button v-if="failedTrack && !target" class="next-retry" type="button" aria-label="重试加载下一首" @click.stop="emit('retry')">
      重试
    </button>
  </div>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  target: { type: Object, default: null },
  failedTrack: { type: Object, default: null }
});
const emit = defineEmits(['retry']);
const message = computed(() => {
  if (props.target) return props.target.title ? `正在加载：${props.target.title}` : '正在加载下一首';
  return props.failedTrack?.title ? `加载失败：${props.failedTrack.title}` : '下一首加载失败';
});
</script>

<style scoped>
.next-status {
  display: flex;
  align-items: center;
  gap: 0.4em;
  min-width: 0;
  max-width: 100%;
  font-size: 0.75rem;
}
.next-status-text {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}
.next-retry {
  position: relative;
  z-index: var(--next-retry-z-index, auto);
  flex: none;
  background: transparent;
  border: none;
  padding: 0 4px;
  font: inherit;
  color: inherit;
  text-decoration: underline;
  cursor: pointer;
}
@media (pointer: coarse) {
  .next-retry { min-height: 24px; min-width: 34px; }
}
</style>
