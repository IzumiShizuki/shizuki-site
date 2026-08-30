<template>
  <div class="content-share">
    <button type="button" :disabled="sharing" :aria-label="`分享${title || '内容'}`" @click="share">
      <i :class="statusIcon" aria-hidden="true"></i>
      <span>{{ statusLabel }}</span>
    </button>
    <span class="content-share-status" aria-live="polite">{{ liveMessage }}</span>
  </div>
</template>

<script setup>
import { computed, ref } from 'vue';
import { buildContentShareUrl, shareContentLink } from '../../utils/contentShare';

const props = defineProps({
  kind: {
    type: String,
    required: true
  },
  publicId: {
    type: String,
    required: true
  },
  title: {
    type: String,
    default: ''
  }
});

const sharing = ref(false);
const status = ref('idle');
const statusLabel = computed(() => ({
  shared: '已分享',
  copied: '链接已复制',
  unavailable: '请复制地址栏',
  cancelled: '分享',
  error: '分享失败'
}[status.value] || '分享'));
const liveMessage = computed(() => (status.value === 'idle' || status.value === 'cancelled'
  ? ''
  : statusLabel.value));
const statusIcon = computed(() => (
  status.value === 'copied' || status.value === 'shared'
    ? 'fas fa-check'
    : 'fas fa-arrow-up-from-bracket'
));

async function share() {
  if (sharing.value) return;
  sharing.value = true;
  status.value = 'idle';
  try {
    const url = buildContentShareUrl(props.kind, props.publicId);
    const result = await shareContentLink({ title: props.title, url });
    status.value = result.status;
  } catch {
    status.value = 'error';
  } finally {
    sharing.value = false;
  }
}
</script>

<style scoped>
.content-share {
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.content-share button {
  min-height: 44px;
  border: 1px solid var(--theme-border-subtle);
  border-radius: 999px;
  padding: 0 14px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  color: var(--theme-text-secondary);
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 82%, transparent);
  font: inherit;
  font-size: 12px;
  cursor: pointer;
}

.content-share button:hover {
  color: var(--theme-text-primary);
  border-color: rgba(var(--accent-rgb), 0.42);
}

.content-share button:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.content-share-status {
  position: absolute;
  width: 1px;
  height: 1px;
  overflow: hidden;
  clip: rect(0 0 0 0);
  clip-path: inset(50%);
  white-space: nowrap;
}
</style>
