<template>
  <div ref="rootRef" class="track-collect" @click.stop>
    <button
      class="track-action-btn collect-trigger ripple-trigger"
      :class="{ active: open }"
      type="button"
      :title="buttonTitle"
      @click.stop="toggle"
    >
      <i class="fas fa-folder-plus"></i>
    </button>

    <section v-if="open" class="collect-popover liquid-material" @click.stop>
      <button
        v-if="canCollectDefaultPublic"
        class="collect-item primary ripple-trigger"
        type="button"
        @click.stop="collectDefaultPublic"
      >
        <span class="collect-name">加入默认收藏夹（云端）</span>
      </button>

      <button
        v-for="item in playlistOptions"
        :key="`collect-target-${item.playlistCode || item.playlist_code || item.name}`"
        class="collect-item ripple-trigger"
        type="button"
        @click.stop="collectToPlaylist(item.playlistCode || item.playlist_code)"
      >
        <span class="collect-name">{{ item.name || '未命名歌单' }}</span>
        <span class="collect-meta">{{ Number(item.trackCount || item.track_count || 0) }} 首</span>
      </button>

      <button v-if="!canCollect" class="collect-item login ripple-trigger" type="button" @click.stop="requireLogin">
        登录后可收藏到歌单
      </button>

      <p v-else-if="!playlistOptions.length && !canCollectDefaultPublic" class="collect-empty">暂无可收藏歌单</p>
    </section>
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, ref } from 'vue';

const props = defineProps({
  track: { type: Object, default: null },
  playlistOptions: { type: Array, default: () => [] },
  canCollect: { type: Boolean, default: false },
  canCollectDefaultPublic: { type: Boolean, default: false }
});

const emit = defineEmits(['collect', 'collect-default-public', 'require-login']);

const rootRef = ref(null);
const open = ref(false);

const buttonTitle = computed(() => {
  if (!props.canCollect) return '登录后可收藏';
  return '收藏到歌单';
});

function close() {
  open.value = false;
}

function toggle() {
  open.value = !open.value;
}

function requireLogin() {
  emit('require-login', props.track || null);
  close();
}

function collectToPlaylist(playlistCode) {
  const code = String(playlistCode || '').trim();
  if (!code) return;
  if (!props.canCollect) {
    requireLogin();
    return;
  }
  emit('collect', { track: props.track || null, playlistCode: code });
  close();
}

function collectDefaultPublic() {
  if (!props.canCollect) {
    requireLogin();
    return;
  }
  emit('collect-default-public', props.track || null);
  close();
}

function onDocumentPointerDown(event) {
  if (!open.value) return;
  const root = rootRef.value;
  const target = event?.target;
  if (!root || !(target instanceof Element)) return;
  if (root.contains(target)) return;
  close();
}

if (typeof document !== 'undefined') {
  document.addEventListener('pointerdown', onDocumentPointerDown, true);
}

onBeforeUnmount(() => {
  if (typeof document !== 'undefined') {
    document.removeEventListener('pointerdown', onDocumentPointerDown, true);
  }
});
</script>

<style scoped>
.track-collect {
  position: relative;
}

.track-action-btn {
  width: 30px;
  height: 30px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(231, 238, 252, 0.9);
}

.collect-trigger.active {
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
}

.collect-popover {
  --liquid-bg: linear-gradient(160deg, rgba(13, 17, 26, 0.96), rgba(10, 14, 20, 0.96));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 18px 32px rgba(4, 8, 14, 0.46);
  position: absolute;
  right: 0;
  top: calc(100% + 6px);
  width: min(320px, 74vw);
  border-radius: 12px;
  padding: 8px;
  display: grid;
  gap: 6px;
  z-index: 15;
}

.collect-item {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.08);
  padding: 8px 10px;
  text-align: left;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
  gap: 8px;
  color: rgba(241, 246, 255, 0.96);
}

.collect-item.primary {
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  background: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  box-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
}

.collect-item.login {
  grid-template-columns: 1fr;
  place-items: center;
}

.collect-name {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  font-size: 12px;
}

.collect-meta {
  font-size: 11px;
  color: rgba(180, 193, 219, 0.86);
}

.collect-empty {
  margin: 0;
  min-height: 54px;
  display: grid;
  place-items: center;
  border-radius: 10px;
  border: 1px dashed rgba(255, 255, 255, 0.2);
  color: rgba(177, 190, 216, 0.84);
  font-size: 12px;
}
</style>

