<template>
  <transition name="dialog-fade">
    <div v-if="visible" class="dialog-mask" @click.self="emit('close')">
      <section class="dialog-shell liquid-material" role="dialog" aria-modal="true" @click.stop>
        <header class="dialog-head">
          <div>
            <h3>收藏到歌单</h3>
            <p v-if="trackTitle" class="dialog-sub">{{ trackTitle }}</p>
          </div>
          <button class="dialog-close ripple-trigger" type="button" @click="emit('close')">
            <i class="fas fa-xmark"></i>
          </button>
        </header>

        <div class="dialog-body">
          <button
            v-if="canCollectDefaultPublic"
            class="collect-item primary ripple-trigger"
            type="button"
            @click="emit('collect-default-public')"
          >
            <span class="collect-name">加入默认收藏夹（云端）</span>
          </button>

          <button
            v-for="item in playlistOptions"
            :key="`collect-dialog-${item.playlistCode || item.playlist_code || item.name}`"
            class="collect-item ripple-trigger"
            type="button"
            @click="emit('collect', item.playlistCode || item.playlist_code)"
          >
            <span class="collect-name">{{ item.name || '未命名歌单' }}</span>
            <span class="collect-meta">{{ Number(item.trackCount || item.track_count || 0) }} 首</span>
          </button>

          <button v-if="!canCollect" class="collect-item login ripple-trigger" type="button" @click="emit('require-login')">
            登录后可收藏到歌单
          </button>

          <p v-else-if="!playlistOptions.length && !canCollectDefaultPublic" class="collect-empty">暂无可收藏歌单</p>
        </div>

        <p v-if="errorText" class="dialog-error">{{ errorText }}</p>

        <footer class="dialog-actions">
          <button class="dialog-btn ripple-trigger" type="button" @click="emit('close')">关闭</button>
          <button class="dialog-btn primary ripple-trigger" type="button" :disabled="busy" @click="emit('create-playlist')">
            {{ busy ? '处理中...' : '新建歌单' }}
          </button>
        </footer>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  visible: { type: Boolean, default: false },
  track: { type: Object, default: null },
  playlistOptions: { type: Array, default: () => [] },
  canCollect: { type: Boolean, default: false },
  canCollectDefaultPublic: { type: Boolean, default: false },
  busy: { type: Boolean, default: false },
  errorText: { type: String, default: '' }
});

const emit = defineEmits(['close', 'collect', 'collect-default-public', 'require-login', 'create-playlist']);

const trackTitle = computed(() => {
  const title = String(props.track?.title || '').trim();
  const artist = String(props.track?.artist || '').trim();
  if (!title && !artist) return '';
  if (!artist) return title;
  if (!title) return artist;
  return `${title} · ${artist}`;
});
</script>

<style scoped>
.dialog-mask {
  position: fixed;
  inset: 0;
  z-index: 1380;
  display: grid;
  place-items: center;
  background: var(--theme-scrim, rgba(6, 10, 18, 0.56));
  backdrop-filter: blur(6px);
}

.dialog-shell {
  --liquid-bg: var(--theme-panel-surface, linear-gradient(160deg, rgba(18, 22, 33, 0.92), rgba(13, 17, 26, 0.92)));
  --liquid-border: var(--theme-border, rgba(255, 255, 255, 0.18));
  --liquid-shadow: 0 20px 36px rgba(18, 9, 8, 0.2);
  width: min(460px, calc(100vw - 24px));
  border-radius: 16px;
  padding: 14px;
  display: grid;
  gap: 12px;
}

.dialog-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
}

.dialog-head h3 {
  margin: 0;
  font-size: 18px;
  color: var(--theme-text-primary, rgba(242, 247, 255, 0.97));
}

.dialog-sub {
  margin: 6px 0 0;
  font-size: 12px;
  color: var(--theme-text-secondary, rgba(180, 193, 219, 0.86));
}

.dialog-close {
  width: 30px;
  height: 30px;
  border-radius: 9px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.2));
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.12));
  color: var(--theme-icon-primary, rgba(237, 243, 255, 0.94));
}

.dialog-body {
  display: grid;
  gap: 8px;
  max-height: min(52vh, 360px);
  overflow-y: auto;
  padding-right: 4px;
}

.collect-item {
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.14));
  border-radius: 12px;
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.08));
  padding: 10px 12px;
  text-align: left;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
  gap: 8px;
  color: var(--theme-text-primary, rgba(241, 246, 255, 0.96));
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
  color: var(--theme-text-secondary, rgba(180, 193, 219, 0.86));
}

.collect-empty {
  margin: 0;
  min-height: 54px;
  display: grid;
  place-items: center;
  border-radius: 10px;
  border: 1px dashed var(--theme-border, rgba(255, 255, 255, 0.2));
  color: var(--theme-text-secondary, rgba(177, 190, 216, 0.84));
  font-size: 12px;
}

.dialog-error {
  margin: 0;
  font-size: 12px;
  color: rgba(255, 134, 165, 0.98);
}

.dialog-actions {
  display: flex;
  justify-content: flex-end;
  gap: 8px;
}

.dialog-btn {
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.2));
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.1));
  color: var(--theme-text-primary, rgba(233, 240, 255, 0.94));
  padding: 0 14px;
}

.dialog-btn.primary {
  border-color: rgba(var(--accent-rgb), 0.62);
  background: rgba(var(--accent-rgb), 0.26);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.22);
}

.dialog-fade-enter-active,
.dialog-fade-leave-active {
  transition: opacity 200ms ease;
}

.dialog-fade-enter-from,
.dialog-fade-leave-to {
  opacity: 0;
}
</style>
