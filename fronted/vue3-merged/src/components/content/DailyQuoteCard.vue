<template>
  <section class="site-widget-card quote-card" :data-motion-mode="effectiveMode" :aria-labelledby="titleId">
    <header class="widget-heading">
      <div>
        <span class="eyebrow">DAILY WORDS</span>
        <h2 :id="titleId">今日一言</h2>
      </div>
      <span v-if="quote?.available" class="quote-state" :class="quote.state">{{ stateLabel }}</span>
    </header>

    <div v-if="loading && !quote" class="widget-state" role="status">
      <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
      <span>正在读取今日一言……</span>
    </div>
    <blockquote v-else-if="quote?.available">
      <p>“{{ quote.text }}”</p>
      <footer>
        <span v-if="quote.author">— {{ quote.author }}</span>
        <span v-if="quote.sourceTitle">《{{ quote.sourceTitle }}》</span>
      </footer>
    </blockquote>
    <div v-else class="widget-state unavailable" role="status">
      <i class="fas fa-quote-left" aria-hidden="true"></i>
      <strong>{{ error ? '今日一言读取失败' : '一言来源尚未配置' }}</strong>
      <span>{{ error ? '这次没有连接到一言服务，可以稍后重新读取。' : '站点还没有可展示的今日快照或本地精选。' }}</span>
    </div>

    <div v-if="quote?.available" class="widget-actions">
      <button type="button" :disabled="loading" @click="showAlternative">
        <i class="fas fa-shuffle" aria-hidden="true"></i>
        换一句本地精选
      </button>
      <button
        v-if="showingAlternative"
        type="button"
        :disabled="loading"
        @click="returnToToday"
      >
        返回今日
      </button>
      <button type="button" :aria-expanded="detailsOpen" :aria-controls="detailsId" @click="toggleDetails">
        {{ detailsOpen ? '收起来源' : '查看来源' }}
      </button>
    </div>

    <p v-if="feedback" class="widget-feedback" role="status">{{ feedback }}</p>

    <dl v-if="detailsOpen && quote?.available" :id="detailsId" class="quote-details">
      <div><dt>日期</dt><dd>{{ quote.effectiveDate || '未记录' }}</dd></div>
      <div><dt>提供方</dt><dd>{{ providerLabel }}</dd></div>
      <div v-if="quote.categoryCode"><dt>分类</dt><dd>{{ quote.categoryCode }}</dd></div>
      <div><dt>抓取时间</dt><dd>{{ formatDateTime(quote.fetchedAt) }}</dd></div>
      <div v-if="quote.sourceUrl"><dt>来源链接</dt><dd><a :href="quote.sourceUrl" target="_blank" rel="noopener noreferrer">查看保存的来源</a></dd></div>
    </dl>

    <footer v-if="quote?.available || error" class="widget-provenance">
      <span v-if="quote?.available">来源：{{ providerLabel }}</span>
      <button v-if="error && !loading" type="button" @click="returnToToday">重新读取</button>
    </footer>
  </section>
</template>

<script setup>
import { computed, nextTick, ref, useId } from 'vue';
import { useMotionPreference } from '../../composables/useMotionPreference';
import { useDailyQuoteResource } from '../../composables/useSiteWidgets';

const props = defineProps({
  loadToday: {
    type: Function,
    default: undefined
  },
  loadAlternative: {
    type: Function,
    default: undefined
  }
});

const { effectiveMode } = useMotionPreference();
const componentId = useId();
const titleId = `daily-quote-title-${componentId}`;
const detailsId = `daily-quote-details-${componentId}`;
const resource = useDailyQuoteResource({
  loadToday: props.loadToday,
  loadAlternative: props.loadAlternative
});
const { data: quote, loading, error, showToday, showLocalAlternative } = resource;
const detailsOpen = ref(false);
const showingAlternative = ref(false);
const feedback = ref('');
const stateLabel = computed(() => ({
  current: '今日快照',
  stale: '历史回退',
  local_alternative: '本地精选'
}[quote.value?.state] || '已记录'));
const providerLabel = computed(() => {
  const provider = String(quote.value?.providerCode || '').toUpperCase();
  if (provider === 'HITOKOTO') return 'Hitokoto 一言';
  if (provider === 'LOCAL') return '本地精选';
  return provider || '来源未记录';
});

function formatDateTime(value) {
  const parsed = new Date(value || '');
  if (Number.isNaN(parsed.getTime())) return '未记录';
  return new Intl.DateTimeFormat('zh-CN', {
    month: 'short', day: 'numeric', hour: '2-digit', minute: '2-digit'
  }).format(parsed);
}

async function showAlternative() {
  feedback.value = '';
  await showLocalAlternative();
  if (resource.error.value) {
    feedback.value = '没有读到更多已审核的本地精选，今日一言保持不变。';
    return;
  }
  showingAlternative.value = resource.data.value?.state === 'local_alternative';
}

async function returnToToday() {
  feedback.value = '';
  showingAlternative.value = false;
  await showToday();
}

async function toggleDetails() {
  const scrollRoot = document.querySelector('.route-content.route-content-app-scroll')
    || document.querySelector('.route-content');
  const scrollTop = Number(scrollRoot?.scrollTop) || 0;
  detailsOpen.value = !detailsOpen.value;
  await nextTick();
  if (scrollRoot) scrollRoot.scrollTop = scrollTop;
}
</script>

<style scoped>
.site-widget-card { border: 1px solid var(--theme-border-subtle); border-radius: 22px; padding: 20px; color: var(--theme-text-primary); background: var(--theme-panel-surface); box-shadow: var(--theme-shadow-soft); }
.widget-heading, .widget-actions, .widget-provenance { display: flex; align-items: center; }
.widget-heading { justify-content: space-between; gap: 12px; }
.eyebrow { color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); font-size: 10px; font-weight: 760; letter-spacing: .16em; }
.widget-heading h2 { margin: 5px 0 0; font-family: var(--font-display, sans-serif); font-size: 19px; }
.quote-state { border-radius: 999px; padding: 4px 9px; color: var(--theme-text-secondary); background: rgba(var(--accent-rgb), .1); font-size: 10px; }
.quote-state.stale { color: #d29b52; background: rgba(210, 155, 82, .12); }
blockquote { margin: 18px 0 0; }
blockquote p { margin: 0; color: var(--theme-text-primary); font-family: var(--font-display, 'LXGW WenKai', serif); font-size: clamp(17px, 2vw, 23px); line-height: 1.75; }
blockquote footer { margin-top: 12px; display: flex; flex-wrap: wrap; gap: 8px; color: var(--theme-text-tertiary); font-size: 11px; }
.widget-state { min-height: 132px; display: flex; flex-direction: column; align-items: center; justify-content: center; gap: 8px; color: var(--theme-text-tertiary); text-align: center; font-size: 12px; }
.widget-state > i { color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); font-size: 26px; }
.widget-state strong { color: var(--theme-text-primary); }
.widget-actions { margin-top: 18px; flex-wrap: wrap; gap: 8px; }
.widget-actions button, .widget-provenance button { min-height: 44px; border: 1px solid var(--theme-border-subtle); border-radius: 999px; padding: 0 12px; color: var(--theme-text-secondary); background: rgba(var(--accent-rgb), .08); font: inherit; font-size: 11px; cursor: pointer; }
.widget-actions button:focus-visible, .widget-provenance button:focus-visible, .quote-details a:focus-visible { outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), .72)); outline-offset: 3px; }
.widget-feedback { margin: 10px 0 0; color: var(--theme-text-tertiary); font-size: 11px; }
.quote-details { margin: 14px 0 0; border-top: 1px solid var(--theme-border-subtle); padding-top: 14px; display: grid; gap: 7px; font-size: 11px; }
.quote-details div { display: grid; grid-template-columns: 70px 1fr; gap: 8px; }
.quote-details dt, .quote-details dd { margin: 0; }
.quote-details dt, .widget-provenance { color: var(--theme-text-tertiary); }
.quote-details a { color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))); }
.widget-provenance { min-height: 28px; margin-top: 12px; justify-content: space-between; gap: 10px; font-size: 10px; }
.widget-provenance button { min-height: 36px; }
</style>
