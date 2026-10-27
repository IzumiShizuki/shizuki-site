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
      <div class="stats-flow">
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
      </div>
      <div class="stats-caption" role="status">
        <p>{{ statsError || (statsLoading ? '正在读取公开内容统计…' : '统计范围：公开文章、分类与标签') }}</p>
        <button v-if="statsError" type="button" class="stats-retry" :disabled="statsLoading" @click="$emit('retry-stats')">
          <i class="fas fa-rotate-right" aria-hidden="true"></i>{{ statsLoading ? '重试中…' : '重新加载' }}
        </button>
      </div>
    </section>

    <div class="about-mixed-flow">
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
    </div>
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
  color: var(--about-text-primary, var(--theme-text-primary));
  display: grid;
  gap: clamp(32px, 4vw, 52px);
}
.about-hero {
  min-width: 0;
  position: relative;
  isolation: isolate;
  display: grid;
  grid-template-columns: minmax(0, 1.2fr) minmax(0, 0.9fr);
  align-items: center;
  gap: clamp(24px, 4vw, 56px);
  padding: 24px 0;
  overflow: visible;
  border: 0;
  border-radius: 0;
  background: transparent;
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
  gap: 14px;
  margin-bottom: clamp(28px, 4vw, 44px);
}
.hero-page-label {
  font-size: 11px;
  font-weight: 600;
  letter-spacing: 0.14em;
  text-transform: uppercase;
  color: var(--about-text-tertiary, var(--theme-text-secondary));
}
.about-overview-status {
  display: inline-flex;
  align-items: center;
  gap: 7px;
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
  font-size: 11.5px;
  font-weight: 650;
  letter-spacing: 0.03em;
}
.about-overview-status > span {
  width: 7px;
  height: 7px;
  border-radius: 50%;
  background: currentColor;
  animation: pulse-status 2.4s ease-in-out infinite;
}
@keyframes pulse-status {
  0%, 100% { opacity: 1; }
  50% { opacity: 0.55; }
}
.about-overview-status.offline {
  color: var(--about-text-tertiary, var(--theme-text-tertiary));
}
.about-overview-status.offline > span {
  animation: none;
  opacity: 0.48;
}
.hero-greeting {
  margin: 0 0 16px;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: clamp(14px, 1.8cqi, 17px);
  line-height: 1.75;
  font-weight: 440;
}
h1 {
  margin: 0;
  color: var(--about-text-hero, var(--theme-text-primary));
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  font-size: clamp(42px, 8.5cqi, 86px);
  font-weight: 840;
  line-height: 1.08;
  letter-spacing: -0.04em;
  overflow-wrap: anywhere;
  text-wrap: balance;
}
.name-period {
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
}
.hero-quote {
  margin: clamp(22px, 3vw, 32px) 0 clamp(28px, 4vw, 40px);
  max-width: 28ch;
  color: var(--about-text-primary, var(--theme-text-primary));
  font-family: var(--font-display, 'LXGW WenKai', sans-serif);
  font-size: clamp(17px, 3cqi, 26px);
  font-weight: 510;
  line-height: 1.68;
  overflow-wrap: anywhere;
  text-wrap: pretty;
}
.hero-facts {
  display: grid;
  gap: 12px;
  margin: 0;
}
.about-overview-fact {
  display: grid;
  grid-template-columns: 62px minmax(0, 1fr);
  align-items: baseline;
  gap: 14px;
}
.hero-facts dt {
  color: var(--about-text-tertiary, var(--theme-text-tertiary));
  font-size: 10.5px;
  font-weight: 600;
  letter-spacing: 0.08em;
  text-transform: uppercase;
}
.hero-facts dd {
  margin: 0;
  color: var(--about-text-primary, var(--theme-text-primary));
  font-size: 13.5px;
  line-height: 1.6;
  font-weight: 520;
  overflow-wrap: anywhere;
}
.hero-footnote {
  margin-top: clamp(32px, 4.5vw, 52px);
  display: flex;
  align-items: center;
  gap: 12px;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: 12px;
  font-weight: 480;
  line-height: 1.7;
}
.hero-footnote > span {
  width: 36px;
  height: 1.5px;
  background: var(--about-accent-border, rgb(var(--accent-readable-rgb)));
  opacity: 0.78;
}
.orbital-art {
  position: relative;
  min-width: 0;
  width: 100%;
  aspect-ratio: 0.88;
  margin-block: clamp(18px, 3vw, 32px) clamp(28px, 4vw, 48px);
}
.cover-arch {
  position: absolute;
  inset: 0 5% 3%;
  overflow: hidden;
  border-radius: 50% 50% 18% 18% / 42% 42% 14% 14%;
  transform: rotate(6deg);
  background: var(--about-surface-soft, var(--theme-surface-soft));
  box-shadow: var(--about-shadow-soft, var(--theme-shadow-soft));
}
.cover-image {
  display: block;
  width: 100%;
  height: 100%;
  object-fit: cover;
  object-position: 78% center;
  transform: rotate(-6deg) scale(1.15);
}
.orbit {
  position: absolute;
  z-index: 1;
  left: -15%;
  top: 22%;
  width: 130%;
  height: 48%;
  border: 1.5px solid var(--about-accent-border, rgb(var(--accent-readable-rgb)));
  border-radius: 50%;
  pointer-events: none;
  opacity: 0.72;
}
.orbit--ascending {
  transform: rotate(-34deg);
}
.orbit--descending {
  transform: rotate(40deg);
  opacity: 0.46;
}
.hero-star {
  position: absolute;
  z-index: 2;
  top: -8%;
  right: 0%;
  width: 23%;
  fill: var(--about-accent-text, rgb(var(--accent-rgb)));
  transform: rotate(14deg);
  opacity: 0.88;
}
.orbit-moon {
  position: absolute;
  z-index: 2;
  left: -2.5%;
  top: 17%;
  width: 16px;
  height: 16px;
  border-radius: 50%;
  background: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
  box-shadow: 0 0 16px var(--about-accent-fill);
}
.hero-avatar {
  position: absolute;
  z-index: 2;
  left: -4%;
  bottom: -3%;
  width: 30%;
  height: auto;
  aspect-ratio: 1;
  object-fit: cover;
  border: 6px solid var(--about-surface-elevated, rgb(var(--accent-soft-rgb)));
  border-radius: 50%;
  box-shadow: var(--about-shadow-md, var(--theme-shadow-soft));
}
.art-caption {
  position: absolute;
  right: 3%;
  bottom: -32px;
  color: var(--about-text-tertiary, var(--theme-text-secondary));
  font-size: 10.5px;
  font-weight: 520;
  letter-spacing: 0.02em;
  transform: rotate(-3.5deg);
  opacity: 1;
}
.stats-section {
  display: grid;
  gap: 18px;
  padding: clamp(18px, 3vw, 32px) 0;
  border-block: none;
}
.stats-flow {
  display: grid;
  grid-template-columns: minmax(140px, 0.65fr) minmax(0, 1.8fr);
  gap: clamp(18px, 3vw, 36px);
  align-items: center;
}
.stats-heading {
  display: flex;
  gap: 14px;
  align-items: center;
}
.stats-mark {
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
  font-size: 52px;
  line-height: 1;
  opacity: 0.92;
}
.stats-heading h2, .section-heading h2 {
  margin: 0;
  color: var(--about-text-primary, var(--theme-text-primary));
  font-family: var(--font-display, 'LXGW WenKai', sans-serif);
  font-size: clamp(20px, 3cqi, 28px);
  font-weight: 720;
  line-height: 1.42;
  letter-spacing: -0.015em;
  text-wrap: balance;
}
.stats-heading p, .section-heading p {
  margin: 7px 0 0;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: 12px;
  line-height: 1.72;
  font-weight: 460;
}
.stats-grid {
  margin: 0;
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: clamp(18px, 3vw, 28px);
}
.stat-item {
  min-width: 0;
  display: flex;
  flex-direction: column-reverse;
  gap: 6px;
}
.stat-item dt {
  color: var(--about-text-tertiary, var(--theme-text-secondary));
  font-size: 11px;
  font-weight: 560;
  letter-spacing: 0.04em;
}
.stat-item dd {
  margin: 0;
  display: grid;
  gap: 3px;
}
.stat-number {
  color: var(--about-text-hero, var(--theme-text-primary));
  font-size: clamp(28px, 5.2cqi, 48px);
  font-weight: 780;
  line-height: 1.12;
  letter-spacing: -0.03em;
  font-variant-numeric: tabular-nums;
  overflow-wrap: anywhere;
}
.stat-unavailable {
  color: var(--about-text-tertiary, var(--theme-text-tertiary));
  font-size: 10.5px;
  font-weight: 480;
}
.stats-caption {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-between;
  gap: 12px 18px;
}
.stats-caption p {
  margin: 0;
  font-size: 11px;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  line-height: 1.72;
  font-weight: 460;
}
.stats-retry {
  min-height: 42px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  padding: 0 15px;
  border: 1px solid var(--about-border-strong, var(--theme-border));
  border-radius: 999px;
  background: var(--about-surface-soft, var(--theme-surface-soft));
  color: var(--about-text-primary, var(--theme-text-primary));
  font: inherit;
  font-size: 12.5px;
  font-weight: 560;
  cursor: pointer;
  transition: transform 200ms ease-out, border-color 200ms ease, box-shadow 200ms ease;
}
.stats-retry:hover:not(:disabled) {
  transform: translateY(-1px);
  border-color: var(--about-accent-border, rgba(var(--accent-strong-rgb), 0.48));
  box-shadow: 0 8px 20px rgba(0, 0, 0, 0.12);
}
.stats-retry:disabled {
  opacity: 0.58;
  cursor: wait;
}
.about-mixed-flow {
  display: grid;
  grid-template-columns: minmax(280px, 0.88fr) minmax(0, 1.12fr);
  gap: clamp(32px, 5vw, 62px);
  align-items: start;
}
.skills-section, .portals-section {
  display: grid;
  gap: clamp(20px, 3vw, 32px);
}
.skill-constellation {
  margin: 0;
  padding: 0;
  list-style: none;
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 12px;
}
.about-skill-chip {
  max-width: 100%;
  padding: 14px 22px;
  font-size: 13px;
  font-weight: 560;
  color: var(--about-text-primary, var(--theme-text-primary));
  border: 1.5px solid var(--about-border-strong, var(--theme-border-strong));
  background: var(--about-surface-soft, transparent);
  overflow-wrap: anywhere;
  transition: transform 220ms ease-out, border-color 220ms ease, background-color 220ms ease;
}
.about-skill-chip:hover {
  transform: rotate(-1.5deg) translateY(-2px);
  border-color: var(--about-accent-border, rgba(var(--accent-strong-rgb), 0.52));
  background: var(--about-surface-elevated, var(--theme-surface-soft));
}
.skill-shape-0 {
  border-radius: 50%;
  padding-block: 20px;
}
.skill-shape-1 {
  border-radius: 28px 8px 28px 8px;
  background: var(--about-accent-fill, var(--accent-mode-fill-soft));
}
.skill-shape-2 {
  border-radius: 8px 28px 8px 28px;
}
.portal-list {
  min-width: 0;
  display: grid;
  gap: 0;
}
.about-portal-link {
  min-width: 0;
  width: 100%;
  display: grid;
  grid-template-columns: 46px minmax(0, 1fr) 20px;
  gap: 16px;
  align-items: center;
  padding: 20px 0;
  border: 0;
  border-bottom: none;
  color: var(--about-text-primary, var(--theme-text-primary));
  background: transparent;
  font: inherit;
  text-align: left;
  cursor: pointer;
  transition: color 200ms ease-out;
}
.about-portal-link:first-child {
  padding-top: 0;
}
.about-portal-link:last-child {
  border-bottom: none;
}
.about-portal-link:hover {
  color: var(--about-text-primary, var(--theme-text-primary));
}
.portal-symbol {
  display: grid;
  place-items: center;
  width: 46px;
  height: 46px;
  border-radius: 50%;
  background: var(--about-accent-fill, var(--accent-mode-fill-soft));
  border: 1px solid var(--about-accent-border, transparent);
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
  font-size: 16px;
  transition: transform 200ms ease-out, border-color 200ms ease;
}
.portal-copy {
  min-width: 0;
  display: grid;
  gap: 5px;
}
.portal-copy strong {
  font-size: 17px;
  font-weight: 640;
  line-height: 1.35;
  overflow-wrap: anywhere;
}
.portal-copy small {
  font-size: 11.5px;
  font-weight: 480;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  line-height: 1.62;
  overflow-wrap: anywhere;
}
.portal-arrow {
  font-size: 13px;
  color: var(--about-text-tertiary, var(--theme-text-secondary));
  transition: transform 200ms ease-out, color 200ms ease;
}
.about-portal-link:hover .portal-arrow {
  transform: translate(3px, -3px);
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
}
.about-portal-link:hover .portal-symbol {
  transform: rotate(-14deg) scale(1.04);
  border-color: var(--about-accent-border, rgba(var(--accent-strong-rgb), 0.48));
}
.about-portal-link:focus-visible, .stats-retry:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 5px;
  border-radius: 10px;
}
@media (prefers-reduced-motion: no-preference) {
  .orbital-art {
    animation: art-arrive 720ms cubic-bezier(0.16, 1, 0.3, 1) both;
  }
  @keyframes art-arrive {
    from {
      opacity: 0.4;
      transform: translateY(16px) rotate(-4deg);
    }
    to {
      opacity: 1;
      transform: translateY(0) rotate(0);
    }
  }
}
@container (max-width: 720px) {
  .about-hero {
    gap: 28px;
    padding: 28px 0;
    grid-template-columns: minmax(0, 1.15fr) minmax(0, 0.85fr);
  }
  .hero-topline {
    margin-bottom: 26px;
  }
  .hero-facts {
    gap: 10px;
  }
  .hero-footnote {
    margin-top: 26px;
  }
  .stats-flow {
    grid-template-columns: 1fr;
    gap: 22px;
  }
  .stats-mark {
    font-size: 38px;
  }
  .stats-heading {
    gap: 12px;
  }
  .stats-heading > div {
    display: flex;
    flex-wrap: wrap;
    align-items: baseline;
    gap: 14px;
  }
  .stats-grid {
    gap: 22px;
  }
  .about-mixed-flow {
    grid-template-columns: 1fr;
    gap: 32px;
  }
  .section-heading h2 br {
    display: none;
  }
}
@container (max-width: 480px) {
  .about-hero {
    grid-template-columns: 1fr;
    gap: 16px;
    padding: 28px 0 36px;
  }
  .hero-topline {
    margin-bottom: 24px;
  }
  h1 {
    font-size: clamp(44px, 15cqi, 64px);
  }
  .hero-quote {
    font-size: 19px;
    margin-block: 20px 24px;
  }
  .hero-footnote {
    display: none;
  }
  .orbital-art {
    width: 78%;
    justify-self: center;
    aspect-ratio: 1.06;
    margin-block: 18px 42px;
  }
  .art-caption {
    right: -10%;
  }
  .about-skill-chip {
    padding: 11px 16px;
    font-size: 12px;
  }
  .skill-shape-0 {
    padding-block: 17px;
  }
  .portal-copy strong {
    font-size: 16px;
  }
}
@media (prefers-reduced-motion: reduce) {
  .portal-arrow, .portal-symbol, .about-skill-chip, .stats-retry, .about-portal-link {
    transition: none;
  }
  .about-skill-chip:hover, .about-portal-link:hover {
    transform: none;
  }
  .about-overview-status > span {
    animation: none;
  }
}
</style>
