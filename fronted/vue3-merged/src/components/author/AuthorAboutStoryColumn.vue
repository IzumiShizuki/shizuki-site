<template>
  <div class="author-story-column about-motion-root about-story-root">
    <article class="story-surface about-manifesto reveal-node" :style="staggerStyle(0)">
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
        <span class="about-section-code">写给来访的你</span>
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
        class="story-surface about-goal-stage reveal-node"
        :class="{ 'has-image': missionImage }"
        :style="staggerStyle(3)"
      >
        <div class="about-card-copy">
          <header class="about-card-heading">
            <span class="about-card-index" aria-hidden="true"><i class="fas fa-location-arrow"></i></span>
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

      <article class="story-surface about-preference-stage reveal-node" :style="staggerStyle(4)">
        <header class="about-card-heading">
          <span class="about-card-index" aria-hidden="true">✳</span>
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
        class="story-surface about-links-stage reveal-node"
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
            <span class="about-card-index" aria-hidden="true"><i class="fas fa-link"></i></span>
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

    <section v-if="showJourney && journey.length" class="story-surface about-journey-preview reveal-node" :style="staggerStyle(6)">
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
  },
  showJourney: {
    type: Boolean,
    default: true
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
  gap: clamp(42px, 6vw, 72px);
  min-width: 0;
}

.story-surface {
  min-width: 0;
  max-width: 100%;
  padding: 0;
  border: 0;
  border-radius: 0;
  color: var(--about-text-primary, var(--theme-text-primary));
  background: transparent;
  box-shadow: none;
}

.inline-edit-fab {
  position: absolute;
  z-index: 6;
  top: 12px;
  right: 12px;
  width: 38px;
  height: 38px;
  border: 1.5px solid var(--about-border-strong, var(--theme-border-strong));
  border-radius: 50%;
  color: var(--about-text-primary, var(--theme-icon-primary));
  background: var(--about-surface-elevated, var(--theme-floating-surface));
  box-shadow: var(--about-shadow-soft, var(--shadow-sm));
  cursor: pointer;
  transition: transform 220ms ease, border-color 220ms ease, box-shadow 220ms ease;
}

.inline-edit-fab:hover {
  transform: translateY(-2px);
  border-color: var(--about-accent-border, rgba(var(--accent-rgb), 0.62));
  box-shadow: var(--about-shadow-md, var(--shadow-md));
}

.about-manifesto {
  position: relative;
  overflow: visible;
  min-height: 240px;
  display: grid;
  grid-template-columns: minmax(230px, 0.78fr) minmax(0, 1.22fr);
  gap: clamp(22px, 4vw, 44px);
  align-items: center;
  padding: clamp(12px, 2vw, 24px) 0;
  border: 0;
  border-block: none;
}

.about-manifesto:not(:has(.about-hero-image)) {
  grid-template-columns: 1fr;
  max-width: 74ch;
}

.about-hero-image {
  width: 100%;
  height: 100%;
  min-height: 210px;
  max-height: 320px;
  display: block;
  object-fit: cover;
  border: 0;
  border-radius: 52% 52% 14px 14px;
  box-shadow: var(--about-shadow-soft, var(--theme-shadow-soft));
}

.about-manifesto-copy {
  min-width: 0;
  display: grid;
  gap: 9px;
  align-content: center;
}

.about-section-code {
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
  font-size: 10.5px;
  font-weight: 740;
  letter-spacing: 0.18em;
  text-transform: uppercase;
}

.about-manifesto-copy h2 {
  margin: 0;
  color: var(--about-text-hero, var(--theme-text-primary));
  font-size: clamp(26px, 3.2vw, 38px);
  font-weight: 740;
  letter-spacing: -0.025em;
  line-height: 1.28;
}

.line-text {
  margin-top: 10px;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  line-height: 2;
  font-size: 14px;
  font-weight: 460;
  max-width: 64ch;
  overflow-wrap: anywhere;
}

.about-flow-grid {
  display: grid;
  grid-template-columns: minmax(0, 1.3fr) minmax(270px, 0.7fr);
  grid-template-areas: 'goal preference' 'links preference';
  gap: clamp(24px, 4vw, 52px);
  align-items: stretch;
}

.about-goal-stage {
  grid-area: goal;
  position: relative;
  overflow: hidden;
  min-height: 200px;
  display: grid;
  align-items: stretch;
  padding: 24px 0;
  background: transparent;
  border-radius: 0;
  border: 0;
  box-shadow: none;
}

.about-goal-stage::after {
  content: '';
  position: absolute;
  right: -62px;
  bottom: -96px;
  width: 210px;
  height: 210px;
  border: 1.5px solid var(--about-accent-border, var(--accent-mode-border-strong));
  border-radius: 50%;
  pointer-events: none;
  opacity: 0.52;
}

.about-goal-stage.has-image {
  grid-template-columns: minmax(0, 1fr) minmax(190px, 0.68fr);
  gap: 18px;
}

.about-card-copy {
  min-width: 0;
  display: grid;
  gap: 16px;
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
  border: 1px solid var(--about-border-subtle, var(--theme-border));
  border-radius: 14px;
  box-shadow: var(--about-shadow-soft, var(--theme-shadow-soft));
}

.about-goal-stage .about-section-image,
.about-links-stage .about-section-image {
  height: 100%;
  min-height: 148px;
  margin: 0;
}

.about-card-heading {
  display: flex;
  align-items: center;
  gap: 12px;
}

.about-card-heading > span:last-child {
  min-width: 0;
  display: grid;
  gap: 2px;
}

.about-card-heading h3 {
  margin: 0;
  color: var(--about-text-primary, var(--theme-text-primary));
  font-size: 18px;
  font-weight: 660;
  line-height: 1.38;
}

.about-card-heading small {
  color: var(--about-text-tertiary, var(--theme-text-secondary));
  font-size: 10px;
  font-weight: 620;
  letter-spacing: 0.12em;
  text-transform: uppercase;
}

.about-card-index {
  flex: 0 0 38px;
  width: 38px;
  height: 38px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  border: 1.5px solid var(--about-border-subtle, var(--theme-border));
  border-radius: 50%;
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
  background: var(--about-surface-soft, var(--accent-mode-fill-soft));
  font-size: 12px;
  font-weight: 800;
}

.about-preference-stage {
  grid-area: preference;
  min-width: 0;
  display: grid;
  align-content: start;
  gap: 26px;
  padding: 24px 0;
  background: transparent;
  border-radius: 0;
  border: 0;
  box-shadow: none;
}

.about-tag-section {
  display: grid;
  gap: 10px;
  padding-top: 10px;
  border-top: none;
}

.mini-title {
  margin: 0;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: 12.5px;
  font-weight: 600;
  letter-spacing: 0.02em;
}

.chip-row {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.chip {
  padding: 6px 13px;
  border: 1px solid var(--about-border-subtle, var(--theme-border));
  border-radius: 999px;
  color: var(--about-text-primary, var(--theme-text-primary));
  background: var(--about-surface-elevated, var(--theme-panel-surface-elevated));
  font-size: 12.5px;
  font-weight: 520;
  transition: transform 180ms ease-out, border-color 180ms ease;
}

.chip:hover {
  transform: translateY(-1px);
  border-color: var(--about-accent-border, rgba(var(--accent-strong-rgb), 0.42));
}

.about-links-stage {
  grid-area: links;
  min-width: 0;
  display: grid;
  align-items: stretch;
  padding: 0;
}

.about-links-stage.has-image {
  grid-template-columns: minmax(160px, 0.58fr) minmax(0, 1.42fr);
  gap: 18px;
}

.link-list {
  display: grid;
  gap: 0;
  margin-top: 12px;
}

.link-btn {
  min-height: 48px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 14px;
  padding: 0 0 0 2px;
  border: 0;
  border-bottom: none;
  border-radius: 0;
  color: var(--about-text-primary, var(--theme-text-primary));
  background: transparent;
  text-align: left;
  text-decoration: none;
  font-size: 15px;
  font-weight: 560;
  transition: color 200ms ease-out;
}

.link-btn:last-child {
  border-bottom: 0;
}

.link-btn i {
  color: var(--about-text-tertiary, var(--theme-icon-muted));
  font-size: 12px;
}

.link-btn:hover {
  color: var(--about-text-primary, var(--theme-text-primary));
}

.link-btn.is-disabled {
  cursor: not-allowed;
  opacity: 0.52;
}

.link-btn.is-disabled:hover {
  color: var(--about-text-primary, var(--theme-text-primary));
}

.link-btn:focus-visible,
.inline-edit-fab:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 5px;
  border-radius: 8px;
}

.about-journey-preview {
  display: grid;
  gap: 18px;
  padding: clamp(24px, 3.5vw, 36px) 0;
}

.about-journey-heading {
  display: flex;
  align-items: end;
  justify-content: space-between;
  gap: 22px;
}

.about-journey-heading > div {
  display: grid;
  gap: 4px;
}

.about-journey-heading h2 {
  margin: 0;
  font-size: clamp(22px, 2.8vw, 30px);
  font-weight: 720;
  letter-spacing: -0.02em;
}

.journey-more {
  min-height: 44px;
  display: inline-flex;
  align-items: center;
  gap: 9px;
  padding: 0 16px;
  border: 1.5px solid var(--about-border-strong, var(--theme-border));
  border-radius: 999px;
  color: var(--about-text-primary, var(--theme-text-primary));
  background: var(--about-surface-soft, var(--theme-panel-surface-elevated));
  font-size: 13px;
  font-weight: 600;
  cursor: pointer;
  transition: transform 200ms ease-out, border-color 200ms ease, box-shadow 200ms ease;
}

.journey-more:hover {
  transform: translateY(-2px);
  border-color: var(--about-accent-border, rgba(var(--accent-rgb), 0.52));
  box-shadow: var(--about-shadow-soft, var(--theme-shadow-soft));
}

.journey-more:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 4px;
}

.about-journey-list {
  display: grid;
  gap: 14px;
}

.about-journey-list > article {
  min-width: 0;
  display: grid;
  grid-template-columns: minmax(110px, 0.3fr) minmax(0, 1fr);
  gap: 16px;
  padding: 0;
  border: 0;
  border-bottom: none;
  padding-bottom: 8px;
  border-radius: 0;
  background: transparent;
  transition: color 180ms ease-out;
}

.about-journey-list > article:last-child {
  border-bottom: 0;
  padding-bottom: 0;
}

.about-journey-list > article:hover {
  color: var(--about-text-primary, var(--theme-text-primary));
}

.about-journey-list img {
  width: 100%;
  height: 100%;
  min-height: 104px;
  display: block;
  object-fit: cover;
  border-radius: 12px;
  box-shadow: var(--about-shadow-soft, var(--theme-shadow-soft));
}

.about-journey-list > article:not(.has-image) {
  grid-template-columns: 1fr;
}

.about-journey-list article > div {
  min-width: 0;
  display: grid;
  align-content: center;
  gap: 5px;
}

.about-journey-list time,
.about-journey-list article > div > span {
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))));
  font-size: 10.5px;
  font-weight: 720;
  letter-spacing: 0.09em;
  text-transform: uppercase;
}

.about-journey-list h3,
.about-journey-list p {
  margin: 0;
}

.about-journey-list h3 {
  color: var(--about-text-primary, var(--theme-text-primary));
  font-size: 16px;
  font-weight: 640;
  line-height: 1.42;
}

.about-journey-list p {
  overflow: hidden;
  display: -webkit-box;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: 12px;
  font-weight: 460;
  line-height: 1.65;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
}

.is-reveal-ready {
  opacity: 0;
  transform: translate3d(0, 22px, 0) scale(0.992);
  transition: opacity 640ms cubic-bezier(0.22, 1, 0.36, 1), transform 640ms cubic-bezier(0.22, 1, 0.36, 1);
  transition-delay: var(--reveal-delay, 0ms);
}

.is-reveal-ready.is-revealed {
  opacity: 1;
  transform: translate3d(0, 0, 0) scale(1);
}

@media (max-width: 900px) {
  .about-manifesto,
  .about-flow-grid {
    grid-template-columns: 1fr;
  }

  .about-flow-grid {
    grid-template-areas: 'goal' 'preference' 'links';
    gap: 32px;
  }
}

@media (max-width: 680px) {
  .about-goal-stage.has-image,
  .about-links-stage.has-image {
    grid-template-columns: 1fr;
  }

  .about-goal-stage .about-section-image,
  .about-links-stage .about-section-image {
    height: auto;
    min-height: 0;
    aspect-ratio: 16 / 9;
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
    min-height: 0;
    aspect-ratio: 16 / 9;
  }
}

@media (prefers-reduced-motion: reduce) {
  .story-surface,
  .inline-edit-fab,
  .is-reveal-ready,
  .link-btn,
  .journey-more,
  .chip,
  .about-journey-list > article {
    transform: none !important;
    transition: opacity 140ms linear, border-color 140ms linear !important;
  }

  .is-reveal-ready {
    opacity: 1 !important;
  }

  .link-btn:hover,
  .about-journey-list > article:hover {
    padding-left: 0 !important;
  }
}
</style>
