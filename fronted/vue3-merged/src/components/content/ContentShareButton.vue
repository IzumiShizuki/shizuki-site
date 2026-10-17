<template>
  <div class="content-share">
    <button type="button" :disabled="sharing" :aria-label="`分享${title || '内容'}`" @click="share">
      <i :class="statusIcon" aria-hidden="true"></i>
      <span>{{ statusLabel }}</span>
    </button>
    <span class="content-share-status" aria-live="polite">{{ liveMessage }}</span>
    <label v-if="fallbackUrl" class="content-share-fallback">
      <span>分享链接</span>
      <input ref="fallbackInput" type="text" readonly :value="fallbackUrl" @focus="selectFallback" @click="selectFallback" />
    </label>
  </div>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, ref, watch } from 'vue';
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
const fallbackUrl = ref('');
const fallbackInput = ref(null);
let shareAttempt = 0;
watch(() => [props.kind, props.publicId, props.title], () => {
  shareAttempt++;
  sharing.value = false;
  status.value = 'idle';
  fallbackUrl.value = '';
}, { flush: 'sync' });
onBeforeUnmount(() => { shareAttempt++; });

function selectFallback() {
  fallbackInput.value?.select();
}
const statusLabel = computed(() => ({
  shared: '已分享',
  copied: '链接已复制',
  unavailable: '请复制下方链接',
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
  const attempt = ++shareAttempt;
  sharing.value = true;
  status.value = 'idle';
  fallbackUrl.value = '';
  try {
    const url = buildContentShareUrl(props.kind, props.publicId);
    const result = await shareContentLink({ title: props.title, url });
    if (attempt !== shareAttempt) return;
    status.value = result.status;
    if (result.status === 'unavailable') {
      fallbackUrl.value = result.url;
      await nextTick();
      if (attempt !== shareAttempt) return;
      fallbackInput.value?.focus({ preventScroll: true });
      selectFallback();
    }
  } catch {
    if (attempt === shareAttempt) status.value = 'error';
  } finally {
    if (attempt === shareAttempt) sharing.value = false;
  }
}
</script>

<style scoped>
.content-share {
  display: inline-flex;
  flex-wrap: wrap;
  min-width: 0;
  max-width: 100%;
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

.content-share button:focus-visible,
.content-share-fallback input:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.content-share-fallback {
  flex-basis: 100%;
  display: grid;
  gap: 6px;
  min-width: 0;
  color: var(--theme-text-secondary);
  font-size: 12px;
}

.content-share-fallback input {
  box-sizing: border-box;
  width: min(100%, 32rem);
  min-width: 0;
  min-height: 44px;
  padding: 10px;
  border: 1px solid var(--theme-border-strong);
  border-radius: var(--radius-sm, 10px);
  background: var(--theme-input-surface);
  color: var(--theme-text-primary);
  font: inherit;
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
