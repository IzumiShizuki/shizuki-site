<template>
  <section class="author-about-experience" data-author-about-layout="shared-shell" aria-label="作者公开内容">
    <div class="author-about-center">
      <section id="author-section-about" class="author-about-section author-about-section--intro" data-author-section="about">
        <AuthorAboutOverviewPremium
          :hero="profile.profileJson?.hero || {}"
          :identity="profile.profileJson?.identity || {}"
          :skills="profile.profileJson?.skills || []"
          :enabled="profile.enabled !== false"
          :portals="portals"
          :stats="publicStats.stats"
          :stats-loading="publicStats.loading.value"
          :stats-error="publicStats.error.value"
          @retry-stats="publicStats.refresh"
          @select-portal="$emit('select-portal', $event)"
        />
        <AuthorAboutStoryColumn
          :about="about"
          :journey="journey"
          :show-journey="false"
          :can-edit="canEdit"
          @edit="$emit('edit')"
        />
        <AuthorLifeCardRail
          kind="albums"
          :items="albums"
          :can-manage="canManageLifeContent"
          :loading="albumsLoading"
          :error="albumsError"
          @retry="$emit('retry-albums')"
        />
        <AuthorLifeCardRail
          kind="moments"
          :items="moments"
          :can-manage="canManageLifeContent"
          :loading="momentsLoading"
          :error="momentsError"
          @retry="$emit('retry-moments')"
        />
      </section>

      <section
        id="author-section-journey"
        class="author-about-section author-about-section--journey about-motion-root"
        data-author-section="journey"
        aria-labelledby="author-journey-title"
      >
        <header class="author-section-heading">
          <div>
            <h2 id="author-journey-title">建站经历</h2>
            <p>从第一次上线到现在，每一次重构与生长都完整留在这里。</p>
          </div>
          <button
            v-if="canEdit"
            type="button"
            class="author-section-action ripple-trigger"
            @click="$emit('edit-journey')"
          >
            <i class="fas fa-pen" aria-hidden="true"></i>
            编辑经历
          </button>
        </header>

        <div v-if="journey.length" class="about-journey-archive-list">
          <article
            v-for="(item, index) in journey"
            :key="`${item.title}-${item.dateLabel || item.year || index}`"
            class="about-journey-entry author-card reveal-node"
            :class="{ 'has-image': item.imageUrl }"
            :style="{ '--reveal-delay': `${Math.min(index, 6) * 60}ms` }"
          >
            <img v-if="item.imageUrl" :src="item.imageUrl" :alt="`${item.title} 配图`" />
            <div class="about-journey-entry-copy">
              <time>{{ item.dateLabel || item.yearLabel || item.year || '持续更新' }}</time>
              <h3>{{ item.title }}</h3>
              <p>{{ item.description || item.summary }}</p>
              <span v-if="item.stack?.length">{{ item.stack.join(' · ') }}</span>
            </div>
          </article>
        </div>
        <p v-else class="author-section-empty">建站经历正在整理，新的节点会在这里依次出现。</p>
      </section>

      <section
        id="author-section-posts"
        class="author-about-section author-about-section--posts"
        data-author-section="posts"
        aria-label="站点文章区域"
      >
        <AuthorPublicPostsColumn />
      </section>
    </div>
  </section>
</template>

<script setup>
import AuthorAboutOverviewPremium from './AuthorAboutOverviewPremium.vue';
import AuthorAboutStoryColumn from './AuthorAboutStoryColumn.vue';
import AuthorLifeCardRail from './AuthorLifeCardRail.vue';
import AuthorPublicPostsColumn from './AuthorPublicPostsColumn.vue';
import { usePublicSiteStats } from '../../composables/usePublicSiteStats';

const publicStats = usePublicSiteStats();

defineProps({
  canManageLifeContent: { type: Boolean, default: false },
  activeTab: {
    type: String,
    default: 'about'
  },
  profile: {
    type: Object,
    default: () => ({ profileJson: {} })
  },
  portals: {
    type: Array,
    default: () => []
  },
  about: {
    type: Object,
    required: true
  },
  journey: {
    type: Array,
    default: () => []
  },
  canEdit: {
    type: Boolean,
    default: false
  },
  albums: {
    type: Array,
    default: () => []
  },
  albumsLoading: {
    type: Boolean,
    default: false
  },
  albumsError: {
    type: [Error, Object, Boolean],
    default: null
  },
  moments: {
    type: Array,
    default: () => []
  },
  momentsLoading: {
    type: Boolean,
    default: false
  },
  momentsError: {
    type: [Error, Object, Boolean],
    default: null
  }
});

defineEmits(['select-tab', 'select-portal', 'edit', 'edit-journey', 'retry-albums', 'retry-moments']);
</script>

<style scoped>
.author-about-experience,
.author-about-center {
  min-width: 0;
  min-height: 0;
}

.author-about-center {
  display: grid;
  gap: clamp(52px, 8vw, 92px);
  padding: clamp(20px, 3vw, 36px) clamp(16px, 2.7vw, 40px) max(108px, env(safe-area-inset-bottom));
}

.author-about-section {
  min-width: 0;
  scroll-margin-top: 24px;
}

.author-about-section--intro {
  display: grid;
  gap: clamp(28px, 4vw, 48px);
}

.author-about-section--journey {
  display: grid;
  gap: 24px;
}

.author-section-heading {
  display: flex;
  align-items: end;
  justify-content: space-between;
  gap: 24px;
  padding: 0;
}

.author-section-heading > div {
  min-width: 0;
  display: grid;
  gap: 9px;
}

.author-section-heading h2,
.author-section-heading p,
.about-journey-entry h3,
.about-journey-entry p,
.author-section-empty {
  margin: 0;
}

.author-section-heading h2 {
  color: var(--about-text-hero, var(--theme-text-primary));
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  font-size: clamp(28px, 4vw, 44px);
  line-height: 1.18;
  font-weight: 780;
  letter-spacing: -0.03em;
}

.author-section-heading p {
  max-width: 68ch;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: 14px;
  font-weight: 480;
  line-height: 1.78;
}

.author-section-action {
  min-height: 44px;
  padding: 0 17px;
  border: 1.5px solid var(--about-accent-border, var(--accent-mode-border));
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  gap: 9px;
  color: var(--about-text-primary, var(--theme-text-primary));
  background: var(--about-accent-fill, var(--accent-mode-fill-soft));
  font: inherit;
  font-size: 13px;
  font-weight: 680;
  white-space: nowrap;
  cursor: pointer;
  transition: transform 220ms ease-out, border-color 220ms ease, box-shadow 220ms ease;
}

.author-section-action:hover {
  border-color: var(--about-accent-border, var(--accent-mode-border-strong));
  transform: translateY(-2px);
  box-shadow: var(--about-shadow-soft, var(--theme-shadow-soft));
}

.author-section-action:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 4px;
}

.about-journey-archive-list {
  display: grid;
  gap: 0;
}

.about-journey-entry {
  min-width: 0;
  display: grid;
  grid-template-columns: minmax(170px, 0.32fr) minmax(0, 1fr);
  gap: clamp(20px, 3vw, 36px);
  padding: clamp(24px, 3.5vw, 42px) 0;
  overflow: visible;
  border: 0;
  border-bottom: 1px solid var(--about-border-subtle, var(--theme-border-subtle));
  border-radius: 0;
  background: transparent;
  box-shadow: none;
  transition: transform 200ms ease-out;
}

.about-journey-entry:first-child {
  padding-top: 0;
}

.about-journey-entry:last-child {
  border-bottom: 0;
  padding-bottom: 0;
}

.about-journey-entry:hover {
  transform: translateX(4px);
}

.about-journey-entry:not(.has-image) {
  grid-template-columns: 1fr;
  max-width: 78ch;
}

.about-journey-entry > img {
  width: 100%;
  height: 100%;
  min-height: 190px;
  display: block;
  object-fit: cover;
  border: 0;
  border-radius: 16px;
  box-shadow: var(--about-shadow-soft, var(--theme-shadow-soft));
}

.about-journey-entry-copy {
  min-width: 0;
  display: grid;
  align-content: center;
  gap: 10px;
  padding: 0;
}

.about-journey-entry time,
.about-journey-entry-copy > span {
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb)));
  font-size: 11.5px;
  font-weight: 740;
  letter-spacing: 0.08em;
  text-transform: uppercase;
}

.about-journey-entry h3 {
  color: var(--about-text-hero, var(--theme-text-primary));
  font-size: clamp(19px, 2.6vw, 26px);
  font-weight: 700;
  line-height: 1.36;
  letter-spacing: -0.015em;
}

.about-journey-entry p {
  max-width: 72ch;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: 14px;
  font-weight: 470;
  line-height: 1.82;
}

.author-section-empty {
  padding: 32px 24px;
  border: 1px solid var(--about-border-subtle, var(--theme-border-subtle));
  border-radius: 16px;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  background: var(--about-surface-soft, var(--theme-panel-surface));
  text-align: center;
  font-size: 14px;
  font-weight: 480;
}

@media (max-width: 820px) {
  .author-about-center {
    padding-top: clamp(56px, 8vw, 72px);
    padding-inline: clamp(12px, 2.5vw, 24px);
  }

  .author-section-heading {
    align-items: start;
    flex-direction: column;
  }

  .about-journey-entry {
    grid-template-columns: 1fr;
  }

  .about-journey-entry > img {
    height: auto;
    min-height: 0;
    aspect-ratio: 16 / 9;
  }
}

@media (prefers-reduced-motion: reduce) {
  .author-section-action,
  .about-journey-entry {
    transition: none;
  }

  .author-section-action:hover,
  .about-journey-entry:hover {
    transform: none;
    padding-left: 0;
  }
}
</style>
