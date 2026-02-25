<template>
  <span class="group-badge" :style="badgeStyle" :title="groupCode">
    {{ label || groupCode || '-' }}
  </span>
</template>

<script setup>
import { computed } from 'vue';
import { getGroupBadgeStyle } from '../../utils/groupBadgePalette';

const props = defineProps({
  groupCode: {
    type: String,
    default: ''
  },
  label: {
    type: String,
    default: ''
  }
});

const badgeStyle = computed(() => getGroupBadgeStyle(props.groupCode));
</script>

<style scoped>
.group-badge {
  display: inline-flex;
  align-items: center;
  min-height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  font-size: 11px;
  font-weight: 620;
  letter-spacing: 0.01em;
  color: var(--group-badge-text);
  background: var(--group-badge-bg);
  box-shadow: inset 0 0 0 1px var(--group-badge-border);
  white-space: nowrap;
}
</style>
