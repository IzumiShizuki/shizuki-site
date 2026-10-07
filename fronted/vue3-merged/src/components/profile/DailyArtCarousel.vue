<template>
  <section v-if="activeArtwork" class="art-carousel" role="region" aria-roledescription="轮播图"
    aria-label="每日推荐图片" tabindex="0" @keydown="onKeydown"
    @touchstart.passive="onTouchStart" @touchend.passive="onTouchEnd" @touchcancel="touchStart = null">
    <DailyArtwork :key="activeArtwork.id" :artwork="activeArtwork" featured />
    <p class="sr-only" role="status">第 {{ activeIndex + 1 }} 张，共 {{ artworks.length }} 张：{{ activeArtwork.title }}</p>
    <div v-if="artworks.length > 1" class="carousel-navigation">
      <button class="step-button" type="button" aria-label="上一张每日推荐" @click="step(-1)">
        <i class="fas fa-chevron-left" aria-hidden="true"></i><span>上一张</span>
      </button>
      <div class="slide-selectors" role="group" aria-label="选择每日推荐图片">
        <button v-for="(work, index) in artworks" :key="work.id" type="button"
          :aria-label="`查看第 ${index + 1} 张：${work.title}`" :aria-current="index === activeIndex ? 'true' : undefined"
          @click="activeIndex = index">{{ index + 1 }}</button>
      </div>
      <button class="step-button" type="button" aria-label="下一张每日推荐" @click="step(1)">
        <span>下一张</span><i class="fas fa-chevron-right" aria-hidden="true"></i>
      </button>
    </div>
  </section>
</template>

<script setup>
import { computed, ref, watch } from 'vue';
import DailyArtwork from './DailyArtwork.vue';

const props = defineProps({ artworks: { type: Array, default: () => [] } });
const activeIndex = ref(0);
const activeArtwork = computed(() => props.artworks[activeIndex.value]);
let touchStart = null;

watch(() => props.artworks.map(work => work.id).join(','), () => {
  activeIndex.value = 0;
  touchStart = null;
}, { flush: 'sync' });

function step(direction) {
  const count = props.artworks.length;
  if (count > 1) activeIndex.value = (activeIndex.value + direction + count) % count;
}

function onKeydown(event) {
  if (props.artworks.length < 2 || event.altKey || event.ctrlKey || event.metaKey || event.shiftKey) return;
  if (!['ArrowLeft', 'ArrowRight', 'Home', 'End'].includes(event.key)) return;
  event.preventDefault();
  if (event.key === 'Home') activeIndex.value = 0;
  else if (event.key === 'End') activeIndex.value = props.artworks.length - 1;
  else step(event.key === 'ArrowLeft' ? -1 : 1);
}

function onTouchStart(event) {
  touchStart = event.touches.length === 1 ? { x: event.touches[0].clientX, y: event.touches[0].clientY } : null;
}

function onTouchEnd(event) {
  const start = touchStart;
  touchStart = null;
  if (!start || event.touches.length || event.changedTouches.length !== 1) return;
  const x = event.changedTouches[0].clientX - start.x;
  const y = event.changedTouches[0].clientY - start.y;
  if (Math.abs(x) >= 48 && Math.abs(x) > Math.abs(y) * 1.3) step(x < 0 ? 1 : -1);
}
</script>

<style scoped>
.art-carousel { min-width: 0; border-radius: 12px; touch-action: pan-y pinch-zoom; }
.carousel-navigation { display: flex; align-items: center; justify-content: space-between; gap: 10px; padding-top: 12px; }
button { min-width: 44px; min-height: 44px; padding: 8px; border: 1px solid transparent; border-radius: 9px; color: var(--theme-text-secondary, #8b7885); background: transparent; font: inherit; font-size: 12px; cursor: pointer; }
.step-button { display: inline-flex; align-items: center; justify-content: center; gap: 8px; flex-shrink: 0; }
.slide-selectors { display: flex; justify-content: center; flex-wrap: wrap; gap: 2px; font-variant-numeric: tabular-nums; }
.slide-selectors button[aria-current=true] { color: var(--theme-text-primary, #403843); background: var(--accent-mode-fill-soft, rgba(242,179,157,.18)); border-color: var(--theme-border, rgba(239,160,168,.3)); font-weight: 600; }
button:hover { color: var(--theme-text-primary, #403843); background: var(--accent-mode-fill-soft-hover, rgba(242,179,157,.3)); }
button:focus-visible, .art-carousel:focus-visible { outline: 2px solid var(--accent-hex, #f2b39d); outline-offset: 3px; }
.sr-only { position: absolute; width: 1px; height: 1px; margin: -1px; padding: 0; overflow: hidden; clip-path: inset(50%); white-space: nowrap; }
@media (max-width: 620px) { .carousel-navigation { flex-wrap: wrap; gap: 4px; } .slide-selectors { order: -1; flex-basis: 100%; } }
</style>
