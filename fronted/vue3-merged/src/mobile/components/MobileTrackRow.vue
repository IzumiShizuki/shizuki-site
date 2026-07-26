<template>
  <div
    class="m-track-row m-press"
    :class="{ current: isCurrent }"
    role="button"
    tabindex="0"
    @click="$emit('play')"
    @keydown.enter="$emit('play')"
  >
    <div class="row-index">
      <span v-if="!isCurrent">{{ String(index + 1).padStart(2, '0') }}</span>
      <span v-else class="playing-glyph" :class="{ paused: !isPlaying }" aria-hidden="true">
        <i></i><i></i><i></i>
      </span>
    </div>
    <div class="row-cover" v-if="track.cover">
      <img :src="track.cover" alt="" loading="lazy" />
    </div>
    <div class="row-main">
      <p class="row-title">{{ track.title }}</p>
      <p class="row-sub">
        <span v-if="providerLabel" class="row-provider">{{ providerLabel }}</span>
        {{ track.artist }}
      </p>
    </div>
    <span class="row-duration">{{ track.durationLabel || track.duration || '--:--' }}</span>
    <button
      v-if="showMenu"
      type="button"
      class="row-menu"
      aria-label="更多操作"
      @click.stop="$emit('menu')"
    >
      <i class="fa-solid fa-ellipsis-vertical" aria-hidden="true"></i>
    </button>
  </div>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  track: {
    type: Object,
    required: true
  },
  index: {
    type: Number,
    default: 0
  },
  isCurrent: {
    type: Boolean,
    default: false
  },
  isPlaying: {
    type: Boolean,
    default: false
  },
  showMenu: {
    type: Boolean,
    default: true
  }
});

defineEmits(['play', 'menu']);

const PROVIDER_LABELS = {
  netease: '网易云',
  qq: 'QQ',
  kuwo: '酷我',
  asmr: 'ASMR',
  spotify: 'Spotify',
  local: ''
};

const providerLabel = computed(() => {
  const key = String(props.track?.provider || '').toLowerCase();
  return PROVIDER_LABELS[key] ?? key;
});
</script>

<style scoped>
.m-track-row {
  display: flex;
  align-items: center;
  gap: 12px;
  padding: 10px 12px;
  border-radius: var(--m-radius-md);
  cursor: pointer;
}

.m-track-row.current {
  background: linear-gradient(120deg, rgba(var(--m-grad-a), 0.16), rgba(var(--m-grad-b), 0.1));
  border: 1px solid rgba(var(--m-accent-rgb), 0.3);
}

.row-index {
  width: 26px;
  flex-shrink: 0;
  text-align: center;
  font-size: 12.5px;
  font-variant-numeric: tabular-nums;
  color: var(--m-text-faint);
}

.playing-glyph {
  display: inline-flex;
  align-items: flex-end;
  gap: 2px;
  height: 14px;
}

.playing-glyph i {
  width: 3px;
  border-radius: 2px;
  background: var(--m-accent-gradient);
  animation: m-eq 0.9s ease-in-out infinite;
}

.playing-glyph i:nth-child(1) {
  height: 7px;
}

.playing-glyph i:nth-child(2) {
  height: 13px;
  animation-delay: 0.2s;
}

.playing-glyph i:nth-child(3) {
  height: 9px;
  animation-delay: 0.4s;
}

.playing-glyph.paused i {
  animation-play-state: paused;
  opacity: 0.6;
}

@keyframes m-eq {
  0%,
  100% {
    transform: scaleY(0.55);
  }
  50% {
    transform: scaleY(1);
  }
}

.row-cover {
  width: 42px;
  height: 42px;
  flex-shrink: 0;
  border-radius: 12px;
  overflow: hidden;
  border: 1px solid var(--m-border);
  background: var(--m-surface-soft);
}

.row-cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.row-main {
  flex: 1;
  min-width: 0;
}

.row-title {
  margin: 0;
  font-size: 14.5px;
  font-weight: 600;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.m-track-row.current .row-title {
  background: var(--m-accent-gradient);
  -webkit-background-clip: text;
  background-clip: text;
  -webkit-text-fill-color: transparent;
}

.row-sub {
  margin: 3px 0 0;
  font-size: 12px;
  color: var(--m-text-sub);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  display: flex;
  align-items: center;
  gap: 6px;
}

.row-provider {
  flex-shrink: 0;
  padding: 1.5px 6px;
  border-radius: 6px;
  border: 1px solid var(--m-border);
  font-size: 10px;
  color: var(--m-text-faint);
}

.row-duration {
  flex-shrink: 0;
  font-size: 12px;
  font-variant-numeric: tabular-nums;
  color: var(--m-text-faint);
}

.row-menu {
  flex-shrink: 0;
  width: 34px;
  height: 34px;
  margin-right: -6px;
  display: grid;
  place-items: center;
  border: none;
  border-radius: 999px;
  background: transparent;
  color: var(--m-text-faint);
  font-size: 14px;
  cursor: pointer;
}

.row-menu:active {
  background: var(--m-surface-soft);
}

@media (prefers-reduced-motion: reduce) {
  .playing-glyph i {
    animation: none;
  }
}
</style>
