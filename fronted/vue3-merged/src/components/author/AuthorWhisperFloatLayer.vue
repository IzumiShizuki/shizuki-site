<template>
  <div v-if="active && renderedSlots.length" class="whisper-float-layer" aria-hidden="true">
    <article
      v-for="slot in renderedSlots"
      :key="slot.key"
      class="whisper-float-card liquid-material"
      :style="slot.style"
    >
      <p>{{ slot.item.content }}</p>
      <span>{{ slot.item.nickname || '匿名访客' }}</span>
    </article>
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, ref, watch } from 'vue';

const props = defineProps({
  items: {
    type: Array,
    default: () => []
  },
  active: {
    type: Boolean,
    default: false
  }
});

const POSITION_PRESETS = Object.freeze([
  { top: '12%', left: '7%', width: '220px', rotate: '-3deg' },
  { top: '18%', right: '8%', width: '210px', rotate: '2deg' },
  { top: '42%', left: '4%', width: '240px', rotate: '-2deg' },
  { top: '46%', right: '7%', width: '224px', rotate: '3deg' },
  { top: '70%', left: '11%', width: '216px', rotate: '-1deg' },
  { top: '74%', right: '12%', width: '230px', rotate: '2deg' }
]);

const renderedSlots = ref([]);
let cycleTimer = 0;
let cycleSeed = 0;

const normalizedItems = computed(() => {
  return (Array.isArray(props.items) ? props.items : [])
    .map((item) => ({
      whisperId: Number(item?.whisperId) || 0,
      content: String(item?.content || '').trim(),
      nickname: String(item?.nickname || '').trim()
    }))
    .filter((item) => item.content);
});

function randomIndex(max) {
  cycleSeed += 1;
  return max <= 0 ? 0 : Math.abs((Date.now() + cycleSeed * 17) % max);
}

function resolveSlotCount() {
  if (typeof window !== 'undefined' && typeof window.matchMedia === 'function' && window.matchMedia('(max-width: 760px)').matches) {
    return 2;
  }
  return 3;
}

function pickUniqueItems(count) {
  const source = [...normalizedItems.value];
  const selected = [];
  while (source.length && selected.length < count) {
    const index = randomIndex(source.length);
    selected.push(source.splice(index, 1)[0]);
  }
  return selected;
}

function pickPositions(count) {
  const source = [...POSITION_PRESETS];
  const selected = [];
  while (source.length && selected.length < count) {
    const index = randomIndex(source.length);
    selected.push(source.splice(index, 1)[0]);
  }
  return selected;
}

function refillSlots() {
  const nextItems = pickUniqueItems(resolveSlotCount());
  const positions = pickPositions(nextItems.length);
  renderedSlots.value = nextItems.map((item, index) => ({
    key: `${item.whisperId}-${Date.now()}-${index}`,
    item,
    style: {
      top: positions[index]?.top,
      left: positions[index]?.left,
      right: positions[index]?.right,
      maxWidth: positions[index]?.width,
      '--whisper-rotate': positions[index]?.rotate || '0deg'
    }
  }));
}

function cycleSlots() {
  if (!props.active || normalizedItems.value.length <= renderedSlots.value.length) return;
  refillSlots();
}

function stopCycle() {
  if (!cycleTimer) return;
  window.clearInterval(cycleTimer);
  cycleTimer = 0;
}

function startCycle() {
  stopCycle();
  if (!props.active || !normalizedItems.value.length || typeof window === 'undefined') return;
  refillSlots();
  cycleTimer = window.setInterval(cycleSlots, 3600);
}

watch(
  () => [props.active, normalizedItems.value],
  () => {
    if (!props.active || !normalizedItems.value.length) {
      stopCycle();
      renderedSlots.value = [];
      return;
    }
    startCycle();
  },
  { deep: true, immediate: true }
);

onBeforeUnmount(() => {
  stopCycle();
});
</script>

<style scoped>
.whisper-float-layer {
  position: absolute;
  inset: 0;
  pointer-events: none;
  z-index: 0;
}

.whisper-float-card {
  --liquid-bg: rgba(255, 247, 252, 0.18);
  --liquid-border: rgba(255, 255, 255, 0.28);
  --liquid-shadow: 0 20px 40px rgba(17, 18, 36, 0.12);
  position: absolute;
  padding: 14px 16px;
  border-radius: 20px;
  display: grid;
  gap: 10px;
  color: rgba(245, 240, 250, 0.9);
  opacity: 0;
  transform: translate3d(0, 10px, 0) rotate(var(--whisper-rotate));
  animation: whisper-float-cycle 3.6s ease forwards;
}

.whisper-float-card p {
  margin: 0;
  line-height: 1.65;
  font-size: 13px;
}

.whisper-float-card span {
  font-size: 11px;
  letter-spacing: 0.06em;
  text-transform: uppercase;
  color: rgba(255, 220, 235, 0.78);
}

@keyframes whisper-float-cycle {
  0% {
    opacity: 0;
    transform: translate3d(0, 12px, 0) rotate(var(--whisper-rotate));
  }
  16%,
  72% {
    opacity: 1;
    transform: translate3d(0, 0, 0) rotate(var(--whisper-rotate));
  }
  100% {
    opacity: 0;
    transform: translate3d(0, -8px, 0) rotate(var(--whisper-rotate));
  }
}

@media (prefers-reduced-motion: reduce) {
  .whisper-float-card {
    animation-duration: 2.2s;
  }
}

@media (max-width: 760px) {
  .whisper-float-card {
    max-width: min(40vw, 180px) !important;
    padding: 12px 13px;
  }
}
</style>
