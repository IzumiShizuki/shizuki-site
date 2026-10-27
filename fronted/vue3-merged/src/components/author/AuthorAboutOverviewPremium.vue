<template>
  <section class="about-overview about-overview-premium" aria-labelledby="about-overview-title">
    <div class="about-hero">
      <div class="hero-copy">
        <div class="hero-topline">
          <span class="hero-page-label">关于网站</span>
          <span class="about-overview-status" :class="{ offline: !enabled }">
            <span aria-hidden="true"></span>{{ enabled ? activityStatus : '暂时离线' }}
          </span>
        </div>
        <p class="hero-greeting">{{ hero.greeting || '你好，很高兴认识你' }}</p>
        <h1 id="about-overview-title">{{ displayName }}<span class="name-period" aria-hidden="true">.</span></h1>
        <blockquote class="hero-quote">{{ hero.quote || '愿你终将与热爱相逢' }}</blockquote>
        <dl class="hero-facts" aria-label="作者身份信息">
          <div v-for="fact in compactFacts" :key="fact.label" class="about-overview-fact">
            <dt>{{ fact.label }}</dt><dd>{{ fact.value }}</dd>
          </div>
        </dl>
        <div class="hero-footnote"><span aria-hidden="true"></span>记录所学，也收藏生活。</div>
      </div>

      <div class="orbital-art">
        <div class="orbit orbit--ascending" aria-hidden="true"></div>
        <div class="orbit orbit--descending" aria-hidden="true"></div>
        <div class="cover-arch">
          <img class="cover-image" :src="coverUrl" :alt="`${displayName} 的网站封面`" fetchpriority="high" />
        </div>
        <svg class="hero-star" viewBox="0 0 100 100" aria-hidden="true">
          <path d="M50 0L59 33L85 15L67 41L100 50L67 59L85 85L59 67L50 100L41 67L15 85L33 59L0 50L33 41L15 15L41 33Z" />
        </svg>
        <span class="orbit-moon" aria-hidden="true"></span>
        <img class="hero-avatar" :src="avatarUrl" :alt="`${displayName} 的头像`" width="88" height="88" />
        <span class="art-caption">热爱，让小站慢慢生长。</span>
      </div>
    </div>

    <section class="stats-section" aria-labelledby="about-stats-title" :aria-busy="statsLoading">
      <header class="stats-heading">
        <span class="stats-mark" aria-hidden="true">✳</span>
        <div><h2 id="about-stats-title">数据一览</h2><p>小站留下的足迹</p></div>
      </header>
      <dl class="stats-grid" aria-label="公开内容统计">
        <div v-for="stat in statsData" :key="stat.key" class="stat-item">
          <dt>{{ stat.label }}</dt>
          <dd>
            <span class="stat-number">{{ formatCount(stat.value) }}</span>
            <span v-if="stat.value === null" class="stat-unavailable">{{ statsLoading ? '加载中' : '暂不可用' }}</span>
          </dd>
        </div>
      </dl>
      <div class="stats-caption" role="status">
        <p>{{ statsError || (statsLoading ? '正在读取公开内容统计…' : '统计范围：公开文章、分类与标签') }}</p>
        <button v-if="statsError" type="button" class="stats-retry" :disabled="statsLoading" @click="$emit('retry-stats')">
          <i class="fas fa-rotate-right" aria-hidden="true"></i>{{ statsLoading ? '重试中…' : '重新加载' }}
        </button>
      </div>
    </section>

    <section v-if="visibleSkills.length" class="skills-section" aria-labelledby="about-skills-title">
      <header class="section-heading"><h2 id="about-skills-title">正在学习<br />与构建</h2><p>让好奇心，有迹可循。</p></header>
      <ul class="skill-constellation" aria-label="技能方向">
        <li v-for="(skill, index) in visibleSkills" :key="skill" class="about-skill-chip" :class="`skill-shape-${index % 3}`">{{ skill }}</li>
      </ul>
    </section>

    <nav v-if="portals.length" class="portals-section" aria-label="站点入口">
      <header class="section-heading"><h2>从这里<br />继续探索</h2><p>写下的、喜欢的、正在做的。</p></header>
      <div class="portal-list">
        <button v-for="portal in portals" :key="portal.key" type="button" class="about-portal-link ripple-trigger" @click="$emit('select-portal', portal)">
          <span class="portal-symbol"><i :class="portal.icon" aria-hidden="true"></i></span>
          <span class="portal-copy"><strong>{{ portal.title }}</strong><small>{{ portal.description }}</small></span>
          <i class="fas fa-arrow-up-right-from-square portal-arrow" aria-hidden="true"></i>
        </button>
      </div>
    </nav>
  </section>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  hero: { type: Object, default: () => ({}) },
  identity: { type: Object, default: () => ({}) },
  skills: { type: Array, default: () => [] },
  enabled: { type: Boolean, default: true },
  portals: { type: Array, default: () => [] },
  stats: { type: Object, default: () => ({}) },
  statsLoading: { type: Boolean, default: false },
  statsError: { type: String, default: '' }
});

defineEmits(['select-portal', 'retry-stats']);
const displayName = computed(() => String(props.hero?.name || 'Shizuki').trim());
const avatarUrl = computed(() => String(props.hero?.avatarUrl || '/images/katanegai.jpg').trim());
const coverUrl = computed(() => String(props.hero?.coverImageUrl || avatarUrl.value).trim());
const activityStatus = computed(() => String(props.identity?.activityStatus || '学习中').trim());
const compactFacts = computed(() => [
  { label: '当前角色', value: props.identity?.role },
  { label: '专业', value: props.identity?.major },
  { label: props.identity?.location ? '所在城市' : '学校', value: props.identity?.location || props.identity?.school }
].filter((fact) => String(fact.value || '').trim()));
const visibleSkills = computed(() => {
  const seen = new Set();
  return props.skills.map((item) => String(item || '').trim()).filter((skill) => {
    const key = skill.toLowerCase();
    if (!key || seen.has(key)) return false;
    seen.add(key);
    return true;
  }).slice(0, 20);
});
const statsData = computed(() => [
  { key: 'posts', label: '公开文章', value: props.stats.posts ?? null },
  { key: 'categories', label: '内容分类', value: props.stats.categories ?? null },
  { key: 'tags', label: '内容标签', value: props.stats.tags ?? null }
]);
const numberFormatter = new Intl.NumberFormat('zh-CN');
function formatCount(value) {
  return Number.isSafeInteger(value) && value >= 0 ? numberFormatter.format(value) : '—';
}
</script>

<style scoped>
.about-overview-premium {
  container-type: inline-size;
  min-width: 0;
  color: var(--theme-text-primary);
  display: grid;
  gap: clamp(28px, 4vw, 48px);
}
.about-hero {
  min-width: 0;
  position: relative;
  isolation: isolate;
  display: grid;
  grid-template-columns: minmax(0, 1.1fr) minmax(0, 1fr);
  align-items: center;
  gap: 16px;
  padding: clamp(24px, 3.2vw, 44px);
  overflow: hidden;
  border-radius: 16px 16px 64px 16px;
  background: var(--theme-panel-surface);
}
.hero-copy {
  min-width: 0;
  position: relative;
  z-index: 2;
}
.hero-topline {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 12px;
  margin-bottom: 36px;
}
.hero-page-label {
  font-size: 12px;
  color: var(--theme-text-secondary);
}
.about-overview-status {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  color: rgb(var(--accent-readable-rgb));
  font-size: 11px;
}
.about-overview-status > span {
  width: 6px;
  height: 6px;
  border-radius: 50%;
  background: currentColor;
}
.about-overview-status.offline {
  color: var(--theme-text-tertiary);
}
.hero-greeting {
  margin: 0 0 12px;
  color: var(--theme-text-secondary);
  font-size: 14px;
  line-height: 1.8;
}
h1 {
  margin: 0;
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  font-size: clamp(38px, 7cqi, 76px);
  font-weight: 800;
  line-height: 1.12;
  letter-spacing: -0.035em;
  overflow-wrap: anywhere;
  text-wrap: balance;
}
.name-period {
  color: rgb(var(--accent-readable-rgb));
}
.hero-quote {
  margin: 22px 0 28px;
  max-width: 26ch;
  color: var(--theme-text-primary);
  font-family: var(--font-display, 'LXGW WenKai', sans-serif);
  font-size: clamp(16px, 2.6cqi, 23px);
  line-height: 1.7;
  overflow-wrap: anywhere;
}
.hero-facts {
  display: grid;
  gap: 10px;
  margin: 0;
}
.about-overview-fact {
  display: grid;
  grid-template-columns: 56px minmax(0, 1fr);
  align-items: baseline;
  gap: 10px;
}
.hero-facts dt {
  color: var(--theme-text-tertiary);
  font-size: 10px;
}
.hero-facts dd {
  margin: 0;
  font-size: 12px;
  line-height: 1.6;
  overflow-wrap: anywhere;
}
.hero-footnote {
  margin-top: 32px;
  display: flex;
  align-items: center;
  gap: 10px;
  color: var(--theme-text-secondary);
  font-size: 11px;
}
.hero-footnote > span {
  width: 28px;
  height: 1px;
  background: rgb(var(--accent-readable-rgb));
}
.orbital-art {
  position: relative;
  min-width: 0;
  width: 100%;
  aspect-ratio: 0.85;
  margin-block: 20px 36px;
}
.cover-arch {
  position: absolute;
  inset: 0 5% 3%;
  overflow: hidden;
  border-radius: 48% 48% 18% 18% / 40% 40% 14% 14%;
  transform: rotate(5deg);
  background: var(--theme-surface-soft);
}
.cover-image {
  display: block;
  width: 100%;
  height: 100%;
  object-fit: cover;
  object-position: 76% center;
  transform: rotate(-5deg) scale(1.13);
}
.orbit {
  position: absolute;
  z-index: 1;
  left: -15%;
  top: 21%;
  width: 130%;
  height: 48%;
  border: 1px solid rgb(var(--accent-readable-rgb));
  border-radius: 50%;
  pointer-events: none;
}
.orbit--ascending {
  transform: rotate(-32deg);
}
.orbit--descending {
  transform: rotate(38deg);
  opacity: 0.55;
}
.hero-star {
  position: absolute;
  z-index: 2;
  top: -7%;
  right: 1%;
  width: 22%;
  fill: rgb(var(--accent-rgb));
  transform: rotate(12deg);
}
.orbit-moon {
  position: absolute;
  z-index: 2;
  left: -2%;
  top: 18%;
  width: 14px;
  height: 14px;
  border-radius: 50%;
  background: rgb(var(--accent-readable-rgb));
}
.hero-avatar {
  position: absolute;
  z-index: 2;
  left: -3%;
  bottom: -2%;
  width: 29%;
  height: auto;
  aspect-ratio: 1;
  object-fit: cover;
  border: 5px solid rgb(var(--accent-soft-rgb));
  border-radius: 50%;
  box-shadow: var(--theme-shadow-soft);
}
.art-caption {
  position: absolute;
  right: 4%;
  bottom: -28px;
  color: var(--theme-text-secondary);
  font-size: 10px;
  transform: rotate(-4deg);
}
.stats-section {
  display: grid;
  grid-template-columns: minmax(130px, 0.7fr) minmax(0, 1.6fr);
  gap: 20px 24px;
  align-items: center;
  padding: 22px clamp(18px, 3vw, 32px);
  border-block: 1px solid var(--theme-border);
}
.stats-heading {
  display: flex;
  gap: 12px;
  align-items: center;
}
.stats-mark {
  color: rgb(var(--accent-readable-rgb));
  font-size: 48px;
  line-height: 1;
}
.stats-heading h2, .section-heading h2 {
  margin: 0;
  font-family: var(--font-display, 'LXGW WenKai', sans-serif);
  font-size: clamp(18px, 2.6cqi, 25px);
  line-height: 1.5;
  text-wrap: balance;
}
.stats-heading p, .section-heading p {
  margin: 6px 0 0;
  color: var(--theme-text-secondary);
  font-size: 11px;
  line-height: 1.8;
}
.stats-grid {
  margin: 0;
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 16px;
}
.stat-item {
  min-width: 0;
  display: flex;
  flex-direction: column-reverse;
  gap: 5px;
}
.stat-item dt {
  color: var(--theme-text-secondary);
  font-size: 11px;
}
.stat-item dd {
  margin: 0;
  display: grid;
  gap: 2px;
}
.stat-number {
  font-size: clamp(26px, 4.8cqi, 42px);
  font-weight: 750;
  line-height: 1.15;
  letter-spacing: -0.025em;
  font-variant-numeric: tabular-nums;
  overflow-wrap: anywhere;
}
.stat-unavailable {
  color: var(--theme-text-tertiary);
  font-size: 10px;
}
.stats-caption {
  grid-column: 1 / -1;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}
.stats-caption p {
  margin: 0;
  font-size: 10px;
  color: var(--theme-text-secondary);
  line-height: 1.7;
}
.stats-retry {
  min-height: 40px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  padding: 0 12px;
  border: 1px solid var(--theme-border);
  border-radius: 999px;
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
  font: inherit;
  font-size: 12px;
  cursor: pointer;
}
.stats-retry:disabled {
  opacity: 0.65;
  cursor: wait;
}
.skills-section, .portals-section {
  display: grid;
  grid-template-columns: minmax(130px, 0.7fr) minmax(0, 1.6fr);
  align-items: start;
  gap: 24px;
  padding-inline: clamp(18px, 3vw, 32px);
}
.skill-constellation {
  margin: 0;
  padding: 4px 0 0;
  list-style: none;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 10px;
}
.about-skill-chip {
  max-width: 100%;
  padding: 12px 18px;
  font-size: 12px;
  color: var(--theme-text-primary);
  border: 1px solid var(--theme-border-strong);
  overflow-wrap: anywhere;
}
.skill-shape-0 {
  border-radius: 50%;
  padding-block: 18px;
}
.skill-shape-1 {
  border-radius: 24px 6px 24px 6px;
  background: var(--accent-mode-fill-soft);
}
.skill-shape-2 {
  border-radius: 6px 24px 6px 24px;
}
.portal-list {
  min-width: 0;
  display: grid;
}
.about-portal-link {
  min-width: 0;
  width: 100%;
  display: grid;
  grid-template-columns: 40px minmax(0, 1fr) 18px;
  gap: 14px;
  align-items: center;
  padding: 16px 4px;
  border: 0;
  border-bottom: 1px solid var(--theme-border);
  color: var(--theme-text-primary);
  background: transparent;
  font: inherit;
  text-align: left;
  cursor: pointer;
}
.about-portal-link:first-child {
  padding-top: 0;
}
.portal-symbol {
  display: grid;
  place-items: center;
  width: 40px;
  height: 40px;
  border-radius: 50%;
  background: var(--accent-mode-fill-soft);
  color: rgb(var(--accent-readable-rgb));
  transition: transform 180ms ease-out;
}
.portal-copy {
  min-width: 0;
  display: grid;
  gap: 4px;
}
.portal-copy strong {
  font-size: 16px;
  overflow-wrap: anywhere;
}
.portal-copy small {
  font-size: 11px;
  color: var(--theme-text-secondary);
  line-height: 1.6;
  overflow-wrap: anywhere;
}
.portal-arrow {
  font-size: 12px;
  color: var(--theme-text-secondary);
  transition: transform 180ms ease-out;
}
.about-portal-link:hover .portal-arrow {
  transform: translate(2px, -2px);
  color: rgb(var(--accent-readable-rgb));
}
.about-portal-link:hover .portal-symbol {
  transform: rotate(-12deg);
}
.about-portal-link:focus-visible, .stats-retry:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 4px;
  border-radius: 8px;
}
@media (prefers-reduced-motion: no-preference) {
  .orbital-art {
    animation: art-arrive 650ms cubic-bezier(0.16, 1, 0.3, 1) both;
  }
  @keyframes art-arrive {
    from {
      transform: translateY(12px) rotate(-3deg);
    }
    to {
      transform: translateY(0) rotate(0);
    }
  }
}
@container (max-width: 600px) {
  .about-hero {
    gap: 24px;
    padding: 24px;
    grid-template-columns: minmax(0, 1.1fr) minmax(0, 0.9fr);
  }
  .hero-topline {
    margin-bottom: 24px;
  }
  .hero-facts {
    gap: 8px;
  }
  .hero-footnote {
    margin-top: 24px;
  }
  .stats-section {
    grid-template-columns: 1fr;
  }
  .stats-mark {
    font-size: 34px;
  }
  .stats-heading {
    gap: 10px;
  }
  .stats-heading > div {
    display: flex;
    flex-wrap: wrap;
    align-items: baseline;
    gap: 12px;
  }
  .stats-grid {
    gap: 20px;
  }
  .skills-section, .portals-section {
    grid-template-columns: 1fr;
    gap: 18px;
  }
  .section-heading h2 br {
    display: none;
  }
}
@container (max-width: 420px) {
  .about-hero {
    grid-template-columns: 1fr;
    gap: 12px;
    padding: 24px 22px 32px;
    border-bottom-right-radius: 48px;
  }
  .hero-topline {
    margin-bottom: 22px;
  }
  h1 {
    font-size: clamp(40px, 14cqi, 58px);
  }
  .hero-quote {
    font-size: 18px;
    margin-block: 16px 20px;
  }
  .hero-footnote {
    display: none;
  }
  .orbital-art {
    width: 76%;
    justify-self: center;
    aspect-ratio: 1.04;
    margin-block: 16px 36px;
  }
  .art-caption {
    right: -8%;
  }
  .stats-section, .skills-section, .portals-section {
    padding-inline: 12px;
  }
  .about-skill-chip {
    padding: 10px 14px;
  }
  .skill-shape-0 {
    padding-block: 15px;
  }
  .portal-copy strong {
    font-size: 15px;
  }
}
@media (prefers-reduced-motion: reduce) {
  .portal-arrow, .portal-symbol {
    transition: none;
  }
}
</style>
