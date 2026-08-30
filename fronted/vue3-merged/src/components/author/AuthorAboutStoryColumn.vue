<template>
  <div class="author-story-column about-motion-root about-story-root">
    <article class="author-card about-manifesto reveal-node" :style="staggerStyle(0)">
      <button
        v-if="canEdit"
        class="inline-edit-fab ripple-trigger"
        type="button"
        title="编辑关于网站"
        @click="$emit('edit')"
      >
        <i class="fas fa-pen" aria-hidden="true"></i>
      </button>
      <img
        v-if="about.introImageUrl"
        class="about-hero-image"
        :src="about.introImageUrl"
        :style="{ aspectRatio: '5 / 4' }"
        alt="关于本站配图"
      />
      <div class="about-manifesto-copy">
        <span class="about-section-code" aria-hidden="true">ABOUT / 00</span>
        <h2>关于这座小站</h2>
        <p
          v-for="(line, index) in about.intro"
          :key="`about-intro-${index}`"
          class="line-text reveal-line"
          :style="staggerStyle(index + 1)"
        >
          {{ line }}
        </p>
      </div>
    </article>

    <section class="about-flow-grid">
      <article
        class="author-card about-goal-stage reveal-node"
        :class="{ 'has-image': missionImage }"
        :style="staggerStyle(3)"
      >
        <div class="about-card-copy">
          <header class="about-card-heading">
            <span class="about-card-index" aria-hidden="true">01</span>
            <span>
              <small aria-hidden="true">方向</small>
              <h3>长期目标</h3>
            </span>
          </header>
          <p class="line-text">{{ about.mission }}</p>
        </div>
        <img
          v-if="missionImage"
          class="about-section-image"
          :src="missionImage"
          :style="{ aspectRatio: '16 / 9' }"
          alt="长期目标配图"
        />
      </article>

      <article class="author-card about-preference-stage reveal-node" :style="staggerStyle(4)">
        <header class="about-card-heading">
          <span class="about-card-index" aria-hidden="true">02</span>
          <span>
            <small aria-hidden="true">收藏</small>
            <h3>偏好与灵感</h3>
          </span>
        </header>
        <div class="about-tag-section">
          <p class="mini-title">关注方向</p>
          <div class="chip-row about-chip-row">
            <span v-for="focus in about.focus" :key="`about-focus-${focus}`" class="chip">{{ focus }}</span>
          </div>
        </div>
        <div class="about-tag-section">
          <p class="mini-title">音乐偏好</p>
          <div class="chip-row about-chip-row">
            <span v-for="music in about.music" :key="`about-music-${music}`" class="chip">{{ music }}</span>
          </div>
        </div>
      </article>

      <article
        class="author-card about-links-stage reveal-node"
        :class="{ 'has-image': linksImage }"
        :style="staggerStyle(5)"
      >
        <img
          v-if="linksImage"
          class="about-section-image"
          :src="linksImage"
          :style="{ aspectRatio: '16 / 9' }"
          alt="站点外链配图"
        />
        <div class="about-card-copy">
          <header class="about-card-heading">
            <span class="about-card-index" aria-hidden="true">03</span>
            <span>
              <small aria-hidden="true">继续探索</small>
              <h3>站点外链</h3>
            </span>
          </header>
          <div class="link-list">
            <a
              v-for="item in about.links"
              :key="`link-${item.label}-${item.url}`"
              :href="resolveLinkHref(item.url)"
              :target="opensInNewWindow(item.url) ? '_blank' : undefined"
              :rel="opensInNewWindow(item.url) ? 'noopener noreferrer' : undefined"
              class="link-btn ripple-trigger"
              :class="{ 'is-disabled': isInvalidLink(item.url) }"
              :aria-disabled="isInvalidLink(item.url) ? 'true' : undefined"
              @click="handleLinkClick($event, item.url)"
            >
              <span>{{ item.label }}</span>
              <i class="fas fa-arrow-up-right-from-square" aria-hidden="true"></i>
            </a>
          </div>
        </div>
      </article>
    </section>

    <section v-if="journey.length" class="author-card about-journey-preview reveal-node" :style="staggerStyle(6)">
      <header class="about-journey-heading">
        <div>
          <span class="about-section-code" aria-hidden="true">JOURNEY / NOW</span>
          <h2>建站轨迹</h2>
        </div>
        <button type="button" class="journey-more" @click="$emit('open-journey')">
          查看完整经历
          <i class="fas fa-arrow-right" aria-hidden="true"></i>
        </button>
      </header>
      <div class="about-journey-list">
        <article
          v-for="(item, index) in journey.slice(0, 3)"
          :key="`${item.title}-${index}`"
          :class="{ 'has-image': item.imageUrl }"
        >
          <img v-if="item.imageUrl" :src="item.imageUrl" :alt="`${item.title} 配图`" />
          <div>
            <time>{{ item.dateLabel || item.yearLabel || item.year || '持续更新' }}</time>
            <h3>{{ item.title }}</h3>
            <p>{{ item.description }}</p>
            <span v-if="item.stack?.length">{{ item.stack.slice(0, 3).join(' · ') }}</span>
          </div>
        </article>
      </div>
    </section>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useRouter } from 'vue-router';

const DEFAULT_ABOUT_PLACEHOLDER_IMAGE = '/images/katanegai.jpg';

const props = defineProps({
  about: {
    type: Object,
    required: true
  },
  canEdit: {
    type: Boolean,
    default: false
  },
  journey: {
    type: Array,
    default: () => []
  }
});

defineEmits(['edit', 'open-journey']);

const router = useRouter();
const usesDefaultArtwork = computed(() => {
  const images = [props.about.introImageUrl, props.about.missionImageUrl, props.about.linksImageUrl]
    .map((value) => String(value || '').trim());
  return images.every((image) => image === DEFAULT_ABOUT_PLACEHOLDER_IMAGE);
});
const missionImage = computed(() => usesDefaultArtwork.value ? '' : String(props.about.missionImageUrl || '').trim());
const linksImage = computed(() => usesDefaultArtwork.value ? '' : String(props.about.linksImageUrl || '').trim());

function staggerStyle(index) {
  return { '--reveal-delay': `${Math.max(0, Number(index) || 0) * 60}ms` };
}

function classifyLink(url) {
  const target = String(url || '').trim();
  if (!target) return { kind: 'invalid', target: '' };
  if (target.startsWith('/#/') || target.startsWith('#/') || (target.startsWith('/') && !target.startsWith('//'))) {
    return { kind: 'internal', target };
  }
  if (target.startsWith('//') || /^https?:\/\//i.test(target)) return { kind: 'external-web', target };
  if (/^(mailto|tel):/i.test(target)) return { kind: 'external-action', target };
  return { kind: 'invalid', target: '' };
}

function resolveLinkHref(url) {
  const link = classifyLink(url);
  return link.kind === 'invalid' ? '#' : link.target;
}

function opensInNewWindow(url) {
  return classifyLink(url).kind === 'external-web';
}

function isInvalidLink(url) {
  return classifyLink(url).kind === 'invalid';
}

function handleLinkClick(event, url) {
  const link = classifyLink(url);
  if (link.kind === 'invalid') {
    event.preventDefault();
    return;
  }
  if (event.button !== 0 || event.metaKey || event.ctrlKey || event.shiftKey || event.altKey) return;
  if (link.kind !== 'internal') return;
  event.preventDefault();
  if (link.target.startsWith('/#/')) router.push(link.target.slice(2));
  else if (link.target.startsWith('#/')) router.push(link.target.slice(1));
  else router.push(link.target);
}
</script>

<style scoped>
.author-story-column {
  display: grid;
  gap: 14px;
  min-width: 0;
}

.author-card {
  min-width: 0;
  max-width: 100%;
  padding: 14px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.14));
  border-radius: 14px;
  color: var(--theme-text-primary, rgba(244, 248, 255, 0.98));
  background: var(--theme-panel-surface, linear-gradient(155deg, rgba(20, 27, 42, 0.48), rgba(11, 17, 29, 0.44)));
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.04), 0 10px 22px rgba(6, 10, 18, 0.14);
  transition: transform 240ms cubic-bezier(0.22, 1, 0.36, 1), box-shadow 240ms ease, border-color 240ms ease;
}

:global(:root[data-theme-mode='day']) .author-card {
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.32), 0 10px 22px rgba(88, 60, 50, 0.08);
}

.inline-edit-fab {
  position: absolute;
  z-index: 6;
  top: 10px;
  right: 10px;
  width: 36px;
  height: 36px;
  border: 1px solid rgba(255, 255, 255, 0.28);
  border-radius: 999px;
  color: rgba(234, 241, 255, 0.98);
  background: rgba(9, 14, 24, 0.66);
  box-shadow: 0 10px 20px rgba(6, 10, 18, 0.25);
  cursor: pointer;
  transition: transform 220ms ease, border-color 220ms ease, box-shadow 220ms ease;
}

.inline-edit-fab:hover {
  transform: translateY(-2px);
  border-color: rgba(var(--accent-rgb), 0.62);
}

.about-manifesto {
  position: relative;
  overflow: hidden;
  min-height: 220px;
  display: grid;
  grid-template-columns: minmax(210px, 0.82fr) minmax(0, 1.18fr);
  gap: clamp(18px, 3vw, 32px);
  align-items: center;
  padding: clamp(16px, 2.4vw, 24px);
}

.about-hero-image {
  width: 100%;
  height: 100%;
  min-height: 188px;
  max-height: 280px;
  display: block;
  object-fit: cover;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.16));
  border-radius: 14px;
}

.about-manifesto-copy {
  display: grid;
  gap: 7px;
  align-content: center;
}

.about-section-code {
  color: var(--theme-text-secondary, rgba(184, 203, 224, 0.72));
  font-size: 10px;
  font-weight: 700;
  letter-spacing: 0.16em;
}

.about-manifesto-copy h2 {
  margin: 0;
  color: var(--theme-text-primary, rgba(245, 248, 255, 0.98));
  font-size: clamp(22px, 2.4vw, 32px);
  letter-spacing: -0.02em;
}

.line-text {
  margin-top: 8px;
  color: var(--theme-text-secondary, rgba(223, 230, 249, 0.88));
  line-height: 1.68;
}

.about-flow-grid {
  display: grid;
  grid-template-columns: minmax(0, 1.2fr) minmax(250px, 0.8fr);
  grid-template-areas: 'goal preference' 'links preference';
  gap: 12px;
  align-items: stretch;
}

.about-goal-stage {
  grid-area: goal;
  position: relative;
  overflow: hidden;
  min-height: 160px;
  display: grid;
  align-items: stretch;
}

.about-goal-stage.has-image {
  grid-template-columns: minmax(0, 1fr) minmax(170px, 0.72fr);
  gap: 14px;
}

.about-card-copy {
  min-width: 0;
  display: grid;
  align-content: start;
}

.about-goal-stage .about-card-copy,
.about-links-stage .about-card-copy {
  align-self: center;
}

.about-section-image {
  width: 100%;
  display: block;
  object-fit: cover;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.16));
  border-radius: 12px;
}

.about-goal-stage .about-section-image,
.about-links-stage .about-section-image {
  height: 100%;
  min-height: 132px;
  margin: 0;
}

.about-card-heading {
  display: flex;
  align-items: center;
  gap: 10px;
}

.about-card-heading > span:last-child {
  min-width: 0;
  display: grid;
  gap: 1px;
}

.about-card-heading h3 {
  margin: 0;
  color: var(--theme-text-primary, rgba(244, 248, 255, 0.98));
  font-size: 16px;
}

.about-card-heading small {
  color: var(--theme-text-secondary, rgba(184, 203, 224, 0.68));
  font-size: 10px;
  letter-spacing: 0.1em;
}

.about-card-index {
  flex: 0 0 34px;
  width: 34px;
  height: 34px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.14));
  border-radius: 11px;
  color: var(--accent-mode-text, rgba(228, 244, 255, 0.94));
  background: var(--accent-mode-fill-soft, linear-gradient(145deg, rgba(var(--accent-soft-rgb), 0.22), rgba(var(--accent-rgb), 0.1)));
  font-size: 11px;
  font-weight: 800;
  letter-spacing: 0.04em;
}

.about-preference-stage {
  grid-area: preference;
  min-width: 0;
  display: grid;
  align-content: start;
  gap: 14px;
}

.about-tag-section {
  display: grid;
  gap: 8px;
  padding-top: 12px;
  border-top: 1px solid var(--theme-border, rgba(255, 255, 255, 0.11));
}

.mini-title {
  margin: 0;
  color: var(--theme-text-secondary, rgba(184, 201, 230, 0.9));
  font-size: 12px;
}

.chip-row {
  display: flex;
  flex-wrap: wrap;
  gap: 7px;
}

.chip {
  padding: 4px 10px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.13));
  border-radius: 999px;
  color: var(--theme-text-primary, rgba(244, 248, 255, 0.98));
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.07));
  font-size: 12px;
}

.about-links-stage {
  grid-area: links;
  min-width: 0;
  display: grid;
  align-items: stretch;
}

.about-links-stage.has-image {
  grid-template-columns: minmax(140px, 0.62fr) minmax(0, 1.38fr);
  gap: 14px;
}

.link-list {
  display: grid;
  gap: 7px;
  margin-top: 10px;
}

.link-btn {
  min-height: 42px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  padding: 0 13px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.15));
  border-radius: 12px;
  color: var(--theme-text-primary, rgba(236, 243, 255, 0.95));
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.06));
  text-align: left;
  text-decoration: none;
  transition: transform 180ms ease, border-color 180ms ease, background-color 180ms ease;
}

.link-btn i {
  color: var(--theme-icon-muted, rgba(192, 211, 230, 0.68));
  font-size: 11px;
}

.link-btn:hover {
  transform: translateX(2px);
  border-color: var(--accent-mode-border-strong, rgba(var(--accent-strong-rgb), 0.54));
  background: var(--theme-floating-surface-hover, rgba(255, 255, 255, 0.1));
}

.link-btn.is-disabled {
  cursor: not-allowed;
  opacity: 0.55;
}

.link-btn.is-disabled:hover {
  transform: none;
}

.about-journey-preview {
  display: grid;
  gap: 14px;
  padding: clamp(16px, 2.4vw, 22px);
}

.about-journey-heading {
  display: flex;
  align-items: end;
  justify-content: space-between;
  gap: 18px;
}

.about-journey-heading > div {
  display: grid;
  gap: 3px;
}

.about-journey-heading h2 {
  margin: 0;
  font-size: clamp(19px, 2vw, 24px);
}

.journey-more {
  min-height: 40px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  padding: 0 13px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.16));
  border-radius: 999px;
  color: var(--theme-text-primary);
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.07));
  cursor: pointer;
}

.journey-more:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.about-journey-list {
  display: grid;
  gap: 10px;
}

.about-journey-list > article {
  min-width: 0;
  display: grid;
  grid-template-columns: minmax(100px, 0.32fr) minmax(0, 1fr);
  gap: 13px;
  padding: 10px;
  border: 1px solid var(--theme-border-subtle, rgba(255, 255, 255, 0.1));
  border-radius: 14px;
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.05));
}

.about-journey-list img {
  width: 100%;
  height: 100%;
  min-height: 92px;
  display: block;
  object-fit: cover;
  border-radius: 10px;
}

.about-journey-list > article:not(.has-image) {
  grid-template-columns: 1fr;
}

.about-journey-list article > div {
  min-width: 0;
  display: grid;
  align-content: center;
  gap: 4px;
}

.about-journey-list time,
.about-journey-list article > div > span {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  letter-spacing: 0.07em;
}

.about-journey-list h3,
.about-journey-list p {
  margin: 0;
}

.about-journey-list h3 {
  color: var(--theme-text-primary);
  font-size: 15px;
}

.about-journey-list p {
  overflow: hidden;
  display: -webkit-box;
  color: var(--theme-text-secondary);
  font-size: 11px;
  line-height: 1.55;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
}

.is-reveal-ready {
  opacity: 0;
  transform: translate3d(0, 18px, 0) scale(0.995);
  transition: opacity 560ms cubic-bezier(0.22, 1, 0.36, 1), transform 560ms cubic-bezier(0.22, 1, 0.36, 1);
  transition-delay: var(--reveal-delay, 0ms);
}

.is-reveal-ready.is-revealed {
  opacity: 1;
  transform: translate3d(0, 0, 0) scale(1);
}

@media (max-width: 820px) {
  .about-manifesto,
  .about-flow-grid {
    grid-template-columns: 1fr;
  }

  .about-flow-grid {
    grid-template-areas: 'goal' 'preference' 'links';
  }
}

@media (max-width: 640px) {
  .about-goal-stage.has-image,
  .about-links-stage.has-image {
    grid-template-columns: 1fr;
  }

  .about-goal-stage .about-section-image,
  .about-links-stage .about-section-image {
    height: auto;
  }

  .about-journey-heading {
    align-items: start;
    flex-direction: column;
  }

  .about-journey-list > article {
    grid-template-columns: 1fr;
  }

  .about-journey-list img {
    height: auto;
    aspect-ratio: 16 / 9;
  }
}

@media (prefers-reduced-motion: reduce) {
  .author-card,
  .inline-edit-fab,
  .is-reveal-ready {
    transform: none !important;
    transition: opacity 120ms linear !important;
  }

  .is-reveal-ready {
    opacity: 1 !important;
  }
}
</style>
