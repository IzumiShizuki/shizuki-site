<template>
  <section class="about-overview" aria-labelledby="about-overview-title">
    <div class="about-overview-media">
      <img class="about-overview-photo" :src="coverUrl" :alt="`${displayName} 的网站封面`" />
      <span class="about-overview-photo-fade" aria-hidden="true"></span>
      <svg class="about-overview-wave" viewBox="0 0 1440 120" preserveAspectRatio="none" aria-hidden="true">
        <path d="M0 72C190 116 360 30 575 60C800 92 946 132 1160 76C1274 46 1367 45 1440 58V120H0Z" fill="currentColor" />
      </svg>
    </div>

    <div class="about-overview-content">
      <header class="about-overview-heading">
        <img class="about-overview-avatar" :src="avatarUrl" :alt="`${displayName} avatar`" />
        <div>
          <p>{{ hero.greeting || '你好，很高兴认识你' }}</p>
          <h1 id="about-overview-title">{{ displayName }}</h1>
          <blockquote>{{ hero.quote || '愿你终将与热爱相逢' }}</blockquote>
        </div>
        <span class="about-overview-status" :class="{ offline: !enabled }">
          <span aria-hidden="true"></span>
          {{ enabled ? activityStatus : '暂时离线' }}
        </span>
      </header>

      <dl class="about-overview-facts" aria-label="作者身份信息">
        <div v-for="fact in facts" :key="fact.label" class="about-overview-fact">
          <dt>{{ fact.label }}</dt>
          <dd>{{ fact.value }}</dd>
        </div>
      </dl>

      <div v-if="visibleSkills.length" class="about-overview-skills">
        <h2>正在学习与构建</h2>
        <div class="about-skill-list" aria-label="技能方向">
          <span v-for="skill in visibleSkills" :key="skill" class="about-skill-chip">{{ skill }}</span>
        </div>
      </div>

      <nav v-if="portals.length" class="about-portal-list" aria-label="站点主要入口">
        <button
          v-for="portal in portals"
          :key="portal.key"
          type="button"
          class="about-portal-link ripple-trigger"
          @click="$emit('select-portal', portal)"
        >
          <i :class="portal.icon" aria-hidden="true"></i>
          <span>
            <strong>{{ portal.title }}</strong>
            <small>{{ portal.description }}</small>
          </span>
          <i class="fas fa-arrow-right" aria-hidden="true"></i>
        </button>
      </nav>
    </div>
  </section>
</template>

<script setup>
import { computed } from 'vue';

const props = defineProps({
  hero: {
    type: Object,
    default: () => ({})
  },
  identity: {
    type: Object,
    default: () => ({})
  },
  skills: {
    type: Array,
    default: () => []
  },
  enabled: {
    type: Boolean,
    default: true
  },
  portals: {
    type: Array,
    default: () => []
  }
});

defineEmits(['select-portal']);

const displayName = computed(() => String(props.hero?.name || 'Shizuki').trim());
const avatarUrl = computed(() => String(props.hero?.avatarUrl || '/images/katanegai.jpg').trim());
const coverUrl = computed(() => String(props.hero?.coverImageUrl || avatarUrl.value).trim());
const activityStatus = computed(() => String(props.identity?.activityStatus || '学习中').trim());
const facts = computed(() => [
  { label: '学校', value: String(props.identity?.school || '持续前进中').trim() },
  { label: '专业', value: String(props.identity?.major || '持续探索中').trim() },
  { label: '当前角色', value: String(props.identity?.role || '独立开发者').trim() }
]);
const visibleSkills = computed(() => {
  const seen = new Set();
  return props.skills
    .map((item) => String(item || '').trim())
    .filter((item) => {
      const key = item.toLowerCase();
      if (!item || seen.has(key)) return false;
      seen.add(key);
      return true;
    })
    .slice(0, 10);
});
</script>

<style scoped>
:global(:root) {
  --author-about-hero-surface: color-mix(in srgb, rgb(var(--accent-rgb)) 16%, rgb(29 21 30));
}

:global(:root[data-theme-mode='day']) {
  --author-about-hero-surface: color-mix(in srgb, rgb(var(--accent-rgb)) 12%, rgb(255 251 247));
}

.about-overview {
  --about-overview-body: var(--author-about-hero-surface);
  position: relative;
  min-width: 0;
  overflow: hidden;
  border: 1px solid var(--theme-border);
  border-radius: var(--radius-md);
  color: var(--theme-text-primary);
  background: var(--about-overview-body, var(--theme-panel-surface));
  box-shadow: var(--theme-shadow-soft);
}

.about-overview-media {
  position: relative;
  min-height: clamp(240px, 38vw, 410px);
  overflow: hidden;
  background: var(--about-overview-body, var(--theme-surface-soft));
}

.about-overview-photo {
  width: 100%;
  height: 100%;
  position: absolute;
  inset: 0;
  display: block;
  object-fit: cover;
  filter: none;
  transform: none;
}

.about-overview-photo-fade {
  position: absolute;
  inset: 0;
  background: linear-gradient(180deg, transparent 58%, color-mix(in srgb, var(--about-overview-body) 78%, transparent) 100%);
  pointer-events: none;
}

.about-overview-wave {
  position: absolute;
  z-index: 1;
  right: -1px;
  bottom: -1px;
  left: -1px;
  width: calc(100% + 2px);
  height: clamp(58px, 8vw, 92px);
  display: block;
  color: var(--about-overview-body);
  pointer-events: none;
}

.about-overview-content {
  position: relative;
  z-index: 2;
  display: grid;
  gap: var(--space-5);
  padding: clamp(12px, 2.4vw, 26px) clamp(18px, 3vw, 30px) clamp(22px, 3vw, 32px);
  background: var(--about-overview-body, var(--theme-panel-surface));
}

.about-overview-heading {
  display: grid;
  grid-template-columns: 72px minmax(0, 1fr) auto;
  align-items: center;
  gap: var(--space-4);
}

.about-overview-avatar {
  width: 72px;
  height: 72px;
  display: block;
  object-fit: cover;
  border: 1px solid var(--theme-border-strong);
  border-radius: var(--radius-md);
  background: var(--theme-surface-soft);
  box-shadow: var(--shadow-sm);
}

.about-overview-heading div {
  min-width: 0;
}

.about-overview-heading p,
.about-overview-heading h1,
.about-overview-heading blockquote,
.about-overview-skills h2 {
  margin: 0;
}

.about-overview-heading p {
  margin-bottom: var(--space-1);
  color: rgb(var(--accent-readable-rgb));
  font-size: 12px;
  font-weight: 720;
}

.about-overview-heading h1 {
  color: var(--theme-text-primary);
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  font-size: clamp(26px, 4vw, 42px);
  line-height: 1.08;
  letter-spacing: -0.025em;
}

.about-overview-heading blockquote {
  max-width: 68ch;
  margin-top: var(--space-2);
  color: var(--theme-text-secondary);
  font-size: 13px;
  line-height: 1.6;
}

.about-overview-status {
  min-height: 34px;
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  border: 1px solid var(--accent-mode-border);
  border-radius: var(--radius-pill);
  color: var(--theme-text-primary);
  background: var(--accent-mode-fill-soft);
  font-size: 11px;
  font-weight: 700;
}

.about-overview-status > span {
  width: 7px;
  height: 7px;
  border-radius: 50%;
  background: rgb(var(--accent-readable-rgb));
  box-shadow: var(--accent-mode-glow);
}

.about-overview-status.offline {
  border-color: var(--theme-border);
  color: var(--theme-text-secondary);
  background: var(--theme-surface-soft);
}

.about-overview-status.offline > span {
  background: var(--theme-icon-muted);
  box-shadow: none;
}

.about-overview-facts {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: var(--space-4);
  margin: 0;
  padding: var(--space-4) 0;
  border-block: 1px solid var(--theme-border-subtle);
}

.about-overview-fact {
  min-width: 0;
  display: grid;
  gap: var(--space-1);
}

.about-overview-fact + .about-overview-fact {
  padding-left: var(--space-4);
  border-left: 1px solid var(--theme-border-subtle);
}

.about-overview-fact dt {
  color: var(--theme-text-tertiary);
  font-size: 10px;
}

.about-overview-fact dd {
  overflow: hidden;
  margin: 0;
  color: var(--theme-text-primary);
  font-size: 13px;
  font-weight: 700;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.about-overview-skills {
  display: grid;
  gap: var(--space-3);
}

.about-overview-skills h2 {
  color: var(--theme-text-secondary);
  font-size: 12px;
  font-weight: 700;
}

.about-skill-list {
  display: flex;
  flex-wrap: wrap;
  gap: var(--space-2);
}

.about-skill-chip {
  padding: 6px 10px;
  border: 1px solid var(--theme-border-subtle);
  border-radius: var(--radius-sm);
  color: var(--theme-text-secondary);
  background: var(--theme-surface-soft);
  font-size: 11px;
}

.about-portal-list {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: var(--space-2);
}

.about-portal-link {
  min-width: 0;
  min-height: 58px;
  padding: 10px 12px;
  border: 1px solid var(--theme-border-subtle);
  border-radius: var(--radius-sm);
  display: grid;
  grid-template-columns: 30px minmax(0, 1fr) 16px;
  align-items: center;
  gap: 10px;
  color: var(--theme-text-primary);
  background: var(--theme-panel-surface-elevated);
  font: inherit;
  text-align: left;
  cursor: pointer;
  transition: transform var(--dur-fast) var(--ease-out), border-color var(--dur-fast) ease, background-color var(--dur-fast) ease;
}

.about-portal-link:hover {
  border-color: var(--accent-mode-border-strong);
  background: var(--theme-floating-surface-hover);
  transform: translateY(-2px);
}

.about-portal-link:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 2px;
}

.about-portal-link > i:first-child {
  color: rgb(var(--accent-readable-rgb));
  font-size: 16px;
  text-align: center;
}

.about-portal-link > i:last-child {
  color: var(--theme-icon-muted);
  font-size: 10px;
  transition: transform var(--dur-fast) var(--ease-out), color var(--dur-fast) ease;
}

.about-portal-link:hover > i:last-child {
  color: rgb(var(--accent-readable-rgb));
  transform: translateX(3px);
}

.about-portal-link span {
  min-width: 0;
  display: grid;
  gap: 2px;
}

.about-portal-link strong,
.about-portal-link small {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.about-portal-link strong {
  font-size: 12px;
}

.about-portal-link small {
  color: var(--theme-text-tertiary);
  font-size: 10px;
}

@media (max-width: 720px) {
  .about-overview-heading {
    grid-template-columns: 56px minmax(0, 1fr);
  }

  .about-overview-avatar {
    width: 56px;
    height: 56px;
  }

  .about-overview-status {
    grid-column: 1 / -1;
    justify-self: start;
  }

  .about-overview-facts,
  .about-portal-list {
    grid-template-columns: 1fr;
  }

  .about-overview-fact + .about-overview-fact {
    padding-top: var(--space-3);
    padding-left: 0;
    border-top: 1px solid var(--theme-border-subtle);
    border-left: 0;
  }
}

@media (prefers-reduced-motion: reduce) {
  .about-portal-link,
  .about-portal-link > i:last-child {
    transition: none;
  }
}
</style>
