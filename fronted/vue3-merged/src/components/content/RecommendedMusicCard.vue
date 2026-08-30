<template>
  <article
    class="music-projection liquid-material"
    :data-motion-mode="motionPreference.effectiveMode.value"
    data-global-player-projection
  >
    <button
      type="button"
      class="music-projection__action ripple-trigger"
      :disabled="!player"
      aria-label="打开全局音乐播放器"
      @click="openGlobalPlayer"
    >
      <span class="music-projection__cover" aria-hidden="true">
        <img
          v-if="displayTrack?.cover && !coverFailed"
          :src="displayTrack.cover"
          alt=""
          @error="coverFailed = true"
        />
        <i v-else class="fas fa-music"></i>
        <span v-if="isPlaying" class="music-projection__pulse"></span>
      </span>

      <span class="music-projection__copy">
        <small>{{ statusText }}</small>
        <strong>{{ displayTrack?.title || '音乐播放器' }}</strong>
        <span>{{ displayTrack?.artist || emptyHint }}</span>
      </span>

      <span class="music-projection__open">
        <span>打开播放器</span>
        <i class="fas fa-arrow-up-right-from-square" aria-hidden="true"></i>
      </span>
    </button>
  </article>
</template>

<script setup>
import { computed, ref, unref, watch } from 'vue';
import { useMotionPreference } from '../../composables/useMotionPreference';
import { useOptionalPlayerBridge } from '../../composables/playerBridge';

const emit = defineEmits(['open']);
const player = useOptionalPlayerBridge();
const motionPreference = useMotionPreference();
const coverFailed = ref(false);

const tracks = computed(() => {
  const value = unref(player?.tracks);
  return Array.isArray(value) ? value : [];
});
const currentTrack = computed(() => unref(player?.currentTrack) || null);
const displayTrack = computed(() => currentTrack.value || tracks.value[0] || null);
const isPlaying = computed(() => Boolean(unref(player?.isPlaying)));
const playlistLoading = computed(() => Boolean(unref(player?.playlistLoading)));
const playlistError = computed(() => String(unref(player?.playlistError) || '').trim());
const playlistName = computed(() => String(unref(player?.playlistProfile)?.name || '').trim());
const emptyHint = computed(() => {
  if (!player) return '当前页面未连接播放器';
  if (playlistLoading.value) return '正在同步全局歌单';
  if (playlistError.value) return '歌单暂不可用，仍可打开播放器';
  return '当前没有选中的曲目';
});
const statusText = computed(() => {
  if (currentTrack.value) return isPlaying.value ? '全局播放器 · 正在播放' : '全局播放器 · 已暂停';
  if (displayTrack.value) return playlistName.value ? `推荐自 ${playlistName.value}` : '全局歌单推荐';
  return playlistLoading.value ? '全局播放器 · 同步中' : '全局播放器 · 空闲';
});

watch(() => displayTrack.value?.id || displayTrack.value?.trackId || '', () => {
  coverFailed.value = false;
});

function openGlobalPlayer() {
  if (!player) return;
  player.setPlayerExpanded?.(true);
  player.setListOpen?.(true);
  emit('open');
}
</script>

<style scoped>
.music-projection {
  --liquid-bg: var(--theme-panel-surface-elevated, var(--theme-surface-elevated));
  --liquid-border: var(--theme-border, rgba(255, 255, 255, 0.2));
  overflow: hidden;
  border-radius: 20px;
}

.music-projection__action {
  width: 100%;
  min-height: 112px;
  border: 0;
  padding: 16px;
  display: grid;
  grid-template-columns: 64px minmax(0, 1fr);
  gap: 13px;
  align-items: center;
  color: var(--theme-text-primary);
  background: linear-gradient(135deg, rgba(var(--accent-rgb), 0.14), rgba(255, 255, 255, 0.035));
  text-align: left;
  cursor: pointer;
}

.music-projection__action:disabled {
  cursor: default;
  opacity: 0.72;
}

.music-projection__action:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: -4px;
}

.music-projection__cover {
  position: relative;
  width: 64px;
  aspect-ratio: 1;
  overflow: hidden;
  border: 1px solid var(--theme-border-subtle, rgba(255, 255, 255, 0.14));
  border-radius: 18px;
  display: grid;
  place-items: center;
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  background: var(--theme-surface-soft, rgba(255, 255, 255, 0.08));
  font-size: 1.25rem;
}

.music-projection__cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.music-projection__pulse {
  position: absolute;
  right: 6px;
  bottom: 6px;
  width: 10px;
  height: 10px;
  border: 2px solid var(--theme-surface, #17121d);
  border-radius: 999px;
  background: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  box-shadow: 0 0 0 4px rgba(var(--accent-rgb), 0.2);
}

.music-projection__copy {
  min-width: 0;
  display: grid;
  gap: 3px;
}

.music-projection__copy small {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  font-weight: 760;
  letter-spacing: 0.05em;
}

.music-projection__copy strong,
.music-projection__copy span {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.music-projection__copy strong {
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: 0.98rem;
}

.music-projection__copy span {
  color: var(--theme-text-secondary);
  font-size: 12px;
}

.music-projection__open {
  grid-column: 2;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  color: var(--theme-text-secondary);
  font-size: 11px;
}

.music-projection[data-motion-mode='immersive'] .music-projection__action {
  transition: background-color 180ms ease, transform 180ms ease;
}

.music-projection[data-motion-mode='immersive'] .music-projection__action:hover:not(:disabled) {
  background-color: rgba(var(--accent-rgb), 0.08);
  transform: translateY(-2px);
}

@media (prefers-reduced-motion: reduce) {
  .music-projection__action {
    transform: none !important;
    transition: none !important;
  }
}
</style>
