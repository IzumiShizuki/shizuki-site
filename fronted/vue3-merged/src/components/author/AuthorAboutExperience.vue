<template>
  <section class="author-about-experience" data-author-about-layout="shared-shell" aria-label="作者公开内容">
    <div class="author-about-center">
      <section id="author-section-about" class="author-about-section author-about-section--intro" data-author-section="about">
        <AuthorAboutOverview
          :hero="profile.profileJson?.hero || {}"
          :identity="profile.profileJson?.identity || {}"
          :skills="profile.profileJson?.skills || []"
          :enabled="profile.enabled !== false"
          :portals="portals"
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
          :can-manage="canEdit"
          :loading="albumsLoading"
          :error="albumsError"
          @retry="$emit('retry-albums')"
        />
        <AuthorLifeCardRail
          kind="moments"
          :items="moments"
          :can-manage="canEdit"
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
        aria-label="站点文章"
      >
        <AuthorPublicPostsColumn />
      </section>
    </div>
  </section>
</template>

<script setup>
import AuthorAboutOverview from './AuthorAboutOverview.vue';
import AuthorAboutStoryColumn from './AuthorAboutStoryColumn.vue';
import AuthorLifeCardRail from './AuthorLifeCardRail.vue';
import AuthorPublicPostsColumn from './AuthorPublicPostsColumn.vue';

defineProps({
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
  gap: clamp(38px, 6vw, 68px);
  padding: 2px 4px max(96px, env(safe-area-inset-bottom));
}

.author-about-section {
  min-width: 0;
  scroll-margin-top: 20px;
}

.author-about-section--intro {
  display: grid;
  gap: 18px;
}

.author-about-section--journey {
  display: grid;
  gap: 18px;
}

.author-section-heading {
  display: flex;
  align-items: end;
  justify-content: space-between;
  gap: 20px;
  padding: 0 clamp(4px, 1.2vw, 12px);
}

.author-section-heading > div {
  min-width: 0;
  display: grid;
  gap: 7px;
}

.author-section-heading h2,
.author-section-heading p,
.about-journey-entry h3,
.about-journey-entry p,
.author-section-empty {
  margin: 0;
}

.author-section-heading h2 {
  color: var(--theme-text-primary);
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  font-size: clamp(24px, 3vw, 36px);
  line-height: 1.12;
  letter-spacing: -0.025em;
}

.author-section-heading p {
  max-width: 68ch;
  color: var(--theme-text-secondary);
  font-size: 13px;
  line-height: 1.7;
}

.author-section-action {
  min-height: 40px;
  padding: 0 14px;
  border: 1px solid var(--accent-mode-border);
  border-radius: var(--radius-sm);
  display: inline-flex;
  align-items: center;
  gap: 8px;
  color: var(--theme-text-primary);
  background: var(--accent-mode-fill-soft);
  font: inherit;
  font-size: 12px;
  font-weight: 700;
  white-space: nowrap;
  cursor: pointer;
  transition: transform var(--dur-fast) var(--ease-out), border-color var(--dur-fast) ease;
}

.author-section-action:hover {
  border-color: var(--accent-mode-border-strong);
  transform: translateY(-2px);
}

.author-section-action:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 3px;
}

.about-journey-archive-list {
  display: grid;
  gap: 14px;
}

.about-journey-entry {
  min-width: 0;
  display: grid;
  grid-template-columns: minmax(150px, 0.34fr) minmax(0, 1fr);
  overflow: hidden;
}

.about-journey-entry:not(.has-image) {
  grid-template-columns: 1fr;
}

.about-journey-entry > img {
  width: 100%;
  height: 100%;
  min-height: 170px;
  display: block;
  object-fit: cover;
}

.about-journey-entry-copy {
  min-width: 0;
  display: grid;
  align-content: center;
  gap: 8px;
  padding: clamp(18px, 3vw, 28px);
}

.about-journey-entry time,
.about-journey-entry-copy > span {
  color: rgb(var(--accent-readable-rgb));
  font-size: 11px;
  font-weight: 700;
}

.about-journey-entry h3 {
  color: var(--theme-text-primary);
  font-size: clamp(17px, 2vw, 22px);
  line-height: 1.3;
}

.about-journey-entry p {
  max-width: 70ch;
  color: var(--theme-text-secondary);
  font-size: 13px;
  line-height: 1.75;
}

.author-section-empty {
  padding: 24px;
  border: 1px solid var(--theme-border-subtle);
  border-radius: var(--radius-md);
  color: var(--theme-text-secondary);
  background: var(--theme-panel-surface);
  text-align: center;
}

@media (max-width: 720px) {
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
  .author-section-action {
    transition: none;
  }
}
</style>
