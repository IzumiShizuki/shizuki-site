<template>
  <StickyCardStack class="author-life-widgets" :top="stickyTop">
    <header class="life-widget-heading">
      <span>LIFE SIGNALS</span>
      <h2>此刻与一句话</h2>
      <p>来自站点配置和已保存快照；任一来源不可用时，其他内容仍会独立展示。</p>
    </header>
    <RecommendedMusicCard />
    <WeatherCard />
    <DailyQuoteCard />
  </StickyCardStack>
</template>

<script setup>
import DailyQuoteCard from '../content/DailyQuoteCard.vue';
import RecommendedMusicCard from '../content/RecommendedMusicCard.vue';
import StickyCardStack from '../content/StickyCardStack.vue';
import WeatherCard from '../content/WeatherCard.vue';

defineProps({
  stickyTop: {
    type: String,
    default: 'calc(var(--app-topbar-height, 72px) + 20px)'
  }
});
</script>

<style scoped>
.author-life-widgets {
  min-width: 0;
}

.life-widget-heading {
  display: grid;
  gap: 5px;
  padding: 4px 4px 2px;
}

.life-widget-heading span {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  font-weight: 760;
  letter-spacing: 0.15em;
}

.life-widget-heading h2 {
  margin: 0;
  color: var(--theme-text-primary);
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: 1rem;
}

.life-widget-heading p {
  margin: 0;
  color: var(--theme-text-secondary);
  font-size: 11px;
  line-height: 1.55;
}
</style>
