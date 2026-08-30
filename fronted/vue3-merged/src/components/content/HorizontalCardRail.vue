<template>
  <section
    class="horizontal-card-rail motion-managed"
    :aria-label="label"
    :data-motion-mode="motionPreference.effectiveMode.value"
  >
    <header v-if="title || $slots.header" class="horizontal-card-rail__header">
      <slot name="header">
        <h2 class="horizontal-card-rail__title">{{ title }}</h2>
      </slot>
      <div class="horizontal-card-rail__controls" aria-label="滑轨方向操作">
        <button
          type="button"
          class="horizontal-card-rail__button"
          :aria-label="`向前浏览${label}`"
          :disabled="!canMoveBackward"
          @click="move(-1)"
        >
          <span aria-hidden="true">←</span>
        </button>
        <button
          type="button"
          class="horizontal-card-rail__button"
          :aria-label="`向后浏览${label}`"
          :disabled="!canMoveForward"
          @click="move(1)"
        >
          <span aria-hidden="true">→</span>
        </button>
      </div>
    </header>

    <div
      ref="track"
      class="horizontal-card-rail__track"
      tabindex="0"
      :aria-label="`${label}，可横向滚动`"
      @scroll="updateEdges"
      @wheel="handleWheel"
      @keydown="handleKeydown"
    >
      <slot />
    </div>
  </section>
</template>

<script setup>
import { nextTick, onBeforeUnmount, onMounted, ref } from 'vue';
import { useMotionPreference } from '../../composables/useMotionPreference';

const props = defineProps({
  label: {
    type: String,
    default: '内容预览'
  },
  title: {
    type: String,
    default: ''
  },
  step: {
    type: Number,
    default: 0
  }
});

const motionPreference = useMotionPreference();
const track = ref(null);
const canMoveBackward = ref(false);
const canMoveForward = ref(false);
let resizeObserver;

function maxScrollLeft(element) {
  return Math.max(0, element.scrollWidth - element.clientWidth);
}

function updateEdges() {
  const element = track.value;
  if (!element) return;
  const max = maxScrollLeft(element);
  canMoveBackward.value = element.scrollLeft > 1;
  canMoveForward.value = element.scrollLeft < max - 1;
}

function scrollByDistance(distance) {
  const element = track.value;
  if (!element) return;
  const left = Math.max(0, Math.min(maxScrollLeft(element), element.scrollLeft + distance));
  if (typeof element.scrollTo === 'function') {
    element.scrollTo({
      left,
      behavior: motionPreference.effectiveMode.value === 'immersive' ? 'smooth' : 'auto'
    });
  } else {
    element.scrollLeft = left;
  }
  updateEdges();
}

function move(direction) {
  const element = track.value;
  if (!element) return;
  const distance = props.step > 0 ? props.step : Math.max(240, element.clientWidth * 0.8);
  scrollByDistance(distance * direction);
}

function handleWheel(event) {
  const element = track.value;
  if (!element || maxScrollLeft(element) <= 1) return;
  const delta = Math.abs(event.deltaY) >= Math.abs(event.deltaX) ? event.deltaY : event.deltaX;
  if (!delta) return;
  const canConsume = delta > 0
    ? element.scrollLeft < maxScrollLeft(element) - 1
    : element.scrollLeft > 1;
  if (!canConsume) return;
  event.preventDefault();
  scrollByDistance(delta);
}

function handleKeydown(event) {
  if (event.key === 'ArrowRight') {
    event.preventDefault();
    move(1);
  } else if (event.key === 'ArrowLeft') {
    event.preventDefault();
    move(-1);
  } else if (event.key === 'Home') {
    event.preventDefault();
    scrollByDistance(-maxScrollLeft(track.value));
  } else if (event.key === 'End') {
    event.preventDefault();
    scrollByDistance(maxScrollLeft(track.value));
  }
}

onMounted(async () => {
  await nextTick();
  updateEdges();
  if (typeof ResizeObserver === 'function' && track.value) {
    resizeObserver = new ResizeObserver(updateEdges);
    resizeObserver.observe(track.value);
  }
});

onBeforeUnmount(() => resizeObserver?.disconnect());
</script>

<style scoped>
.horizontal-card-rail {
  min-width: 0;
}

.horizontal-card-rail__header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 16px;
  margin-bottom: 12px;
}

.horizontal-card-rail__title {
  margin: 0;
  color: var(--theme-text-primary);
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: clamp(1rem, 1.8vw, 1.25rem);
}

.horizontal-card-rail__controls {
  display: flex;
  gap: 8px;
}

.horizontal-card-rail__button {
  display: inline-grid;
  place-items: center;
  width: 38px;
  min-height: 38px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.22));
  border-radius: 999px;
  color: var(--theme-text-primary);
  background: var(--theme-surface-soft, rgba(255, 255, 255, 0.1));
  cursor: pointer;
}

.horizontal-card-rail__button:disabled {
  opacity: 0.38;
  cursor: default;
}

.horizontal-card-rail__button:focus-visible,
.horizontal-card-rail__track:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.horizontal-card-rail__track {
  display: grid;
  grid-auto-flow: column;
  grid-auto-columns: minmax(min(78vw, 240px), 1fr);
  gap: 16px;
  min-width: 0;
  overflow-x: auto;
  overflow-y: hidden;
  overscroll-behavior-inline: contain;
  scroll-snap-type: inline proximity;
  scrollbar-width: thin;
  touch-action: pan-x pan-y;
}

.horizontal-card-rail__track > :deep(*) {
  min-width: 0;
  scroll-snap-align: start;
}

@media (min-width: 900px) {
  .horizontal-card-rail__track {
    grid-auto-columns: minmax(240px, 32%);
  }
}
</style>
