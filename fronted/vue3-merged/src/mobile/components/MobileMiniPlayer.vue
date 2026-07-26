<template>
  <transition name="m-mini">
    <div v-if="track" class="m-mini m-press" role="button" tabindex="0" @click="$emit('expand')" @keydown.enter="$emit('expand')">
      <div class="mini-progress" aria-hidden="true">
        <span :style="{ width: `${progressPercent}%` }"></span>
      </div>
      <div class="mini-cover" :class="{ spinning: isPlaying }">
        <img :src="track.cover" alt="" />
      </div>
      <div class="mini-main">
        <p class="mini-title">{{ track.title }}</p>
        <p class="mini-sub">{{ lyricLine || track.artist }}</p>
      </div>
      <button type="button" class="mini-btn" :aria-label="isPlaying ? '暂停' : '播放'" @click.stop="$emit('toggle-play')">
        <i :class="isPlaying ? 'fa-solid fa-pause' : 'fa-solid fa-play'" aria-hidden="true"></i>
      </button>
      <button type="button" class="mini-btn subtle" aria-label="下一首" @click.stop="$emit('next')">
        <i class="fa-solid fa-forward-step" aria-hidden="true"></i>
      </button>
    </div>
  </transition>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  track: {
    type: Object,
    default: null
  },
  isPlaying: {
    type: Boolean,
    default: false
  },
  currentTime: {
    type: Number,
    default: 0
  },
  duration: {
    type: Number,
    default: 0
  },
  lyricLine: {
    type: String,
    default: ''
  }
});

defineEmits(['expand', 'toggle-play', 'next']);

const progressPercent = computed(() => {
  if (!Number.isFinite(props.duration) || props.duration <= 0) return 0;
  return Math.max(0, Math.min(100, (props.currentTime / props.duration) * 100));
});
</script>

<style scoped>
.m-mini {
  position: absolute;
  left: 50%;
  transform: translateX(-50%);
  bottom: calc(var(--m-safe-bottom) + var(--m-tabbar-height) + 20px);
  z-index: 55;
  width: min(calc(100% - 32px), 520px);
  display: flex;
  align-items: center;
  gap: 12px;
  padding: 8px 12px 8px 8px;
  border-radius: 22px;
  background: var(--m-surface-strong);
  border: 1px solid var(--m-border);
  backdrop-filter: var(--m-blur);
  -webkit-backdrop-filter: var(--m-blur);
  box-shadow: var(--m-shadow);
  cursor: pointer;
  overflow: hidden;
}

.mini-progress {
  position: absolute;
  top: 0;
  left: 14px;
  right: 14px;
  height: 2.5px;
  border-radius: 0 0 4px 4px;
  background: var(--m-surface-soft);
  overflow: hidden;
}

.mini-progress span {
  display: block;
  height: 100%;
  background: var(--m-accent-gradient);
  border-radius: inherit;
  transition: width 400ms linear;
}

.mini-cover {
  width: 44px;
  height: 44px;
  flex-shrink: 0;
  border-radius: 999px;
  overflow: hidden;
  border: 2px solid rgba(var(--m-accent-rgb), 0.4);
  box-shadow: 0 4px 14px rgba(var(--m-accent-rgb), 0.28);
}

.mini-cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.mini-cover.spinning img {
  animation: m-spin 14s linear infinite;
}

@keyframes m-spin {
  to {
    transform: rotate(360deg);
  }
}

.mini-main {
  flex: 1;
  min-width: 0;
}

.mini-title {
  margin: 0;
  font-size: 13.5px;
  font-weight: 700;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.mini-sub {
  margin: 2px 0 0;
  font-size: 11.5px;
  color: var(--m-text-sub);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.mini-btn {
  flex-shrink: 0;
  width: 38px;
  height: 38px;
  display: grid;
  place-items: center;
  border: none;
  border-radius: 999px;
  background: var(--m-accent-gradient);
  color: #3c2320;
  font-size: 13px;
  cursor: pointer;
  box-shadow: 0 6px 14px rgba(var(--m-accent-rgb), 0.3);
}

.mini-btn.subtle {
  background: var(--m-surface-soft);
  color: var(--m-text);
  box-shadow: none;
  border: 1px solid var(--m-border);
}

.m-mini-enter-active,
.m-mini-leave-active {
  transition: transform 300ms cubic-bezier(0.32, 0.72, 0.24, 1), opacity 240ms ease;
}

.m-mini-enter-from,
.m-mini-leave-to {
  transform: translateX(-50%) translateY(24px);
  opacity: 0;
}

@media (orientation: landscape) and (max-height: 500px) {
  .m-mini {
    left: calc(var(--m-safe-left) + 12px);
    transform: none;
    bottom: calc(var(--m-safe-bottom) + 8px);
    width: min(46vw, 420px);
  }

  .m-mini-enter-from,
  .m-mini-leave-to {
    transform: translateY(24px);
  }
}

@media (prefers-reduced-motion: reduce) {
  .mini-cover.spinning img {
    animation: none;
  }
}
</style>
