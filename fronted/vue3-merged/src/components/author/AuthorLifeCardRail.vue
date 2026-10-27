<template>
  <HorizontalCardRail class="author-life-rail" :class="{ 'is-empty': items.length === 0 }" :label="railLabel" :title="railTitle">
    <template #header>
      <div class="life-rail-heading">
        <div>
          <span>{{ kind === 'albums' ? 'MEMORY ARCHIVE' : 'LIFE LOG' }}</span>
          <h2>{{ railTitle }}</h2>
        </div>
        <RouterLink v-if="!featureDisabled" :to="allRoute">查看全部</RouterLink>
      </div>
    </template>

    <article v-if="loading && items.length === 0" class="life-preview-state" role="status">
      <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
      <strong>正在读取{{ contentLabel }}……</strong>
    </article>

    <article
      v-else-if="featureDisabled && items.length === 0"
      class="life-preview-state is-unavailable"
      :data-testid="`${kind}-rail-disabled`"
      role="status"
    >
      <i class="fas fa-lock" aria-hidden="true"></i>
      <strong>{{ contentLabel }}尚未开放</strong>
      <span>站点暂未公开这个栏目，开放后内容会自动出现在这里。</span>
    </article>

    <article v-else-if="error && items.length === 0" class="life-preview-state is-error" :data-testid="`${kind}-rail-error`">
      <i class="far fa-circle-xmark" aria-hidden="true"></i>
      <strong>{{ contentLabel }}暂时没有读到</strong>
      <span>介绍内容不受影响，可以稍后单独重试。</span>
      <button type="button" @click="$emit('retry')">重新读取</button>
    </article>

    <article v-else-if="items.length === 0" class="life-preview-state" :data-testid="`${kind}-rail-empty`">
      <i :class="kind === 'albums' ? 'far fa-images' : 'far fa-comment-dots'" aria-hidden="true"></i>
      <strong>{{ contentLabel }}还没有公开内容</strong>
      <span>{{ emptyDescription }}</span>
      <RouterLink v-if="canManage" class="life-preview-action" :to="studioRoute">
        前往{{ contentLabel }}工作台
        <i class="fas fa-arrow-right" aria-hidden="true"></i>
      </RouterLink>
    </article>

    <template v-else>
      <RouterLink
        v-for="item in items"
        :key="itemKey(item)"
        class="life-preview-card"
        :class="{ 'without-media': !visibleCover(item.cover) }"
        :to="itemRoute(item)"
      >
        <span v-if="visibleCover(item.cover)" class="life-preview-media">
          <img
            :src="item.cover.preview.url"
            :alt="item.cover.altText || itemTitle(item)"
            :width="item.cover.preview.width"
            :height="item.cover.preview.height"
            @error="hideFailedMedia(item.cover.mediaRef)"
          />
        </span>
        <span v-else class="life-preview-placeholder" aria-hidden="true">
          <i :class="kind === 'albums' ? 'far fa-images' : 'far fa-comment-dots'"></i>
        </span>
        <span class="life-preview-copy">
          <small>{{ kind === 'albums' ? 'ALBUM' : formatPublishedAt(item.publishedAt) }}</small>
          <strong>{{ itemTitle(item) }}</strong>
          <span>{{ itemMeta(item) }}</span>
        </span>
        <i class="fas fa-arrow-right life-preview-arrow" aria-hidden="true"></i>
      </RouterLink>
    </template>
  </HorizontalCardRail>
</template>

<script setup>
import { computed, reactive } from 'vue';
import HorizontalCardRail from '../content/HorizontalCardRail.vue';
import { isFeatureDisabledProblem } from '../../utils/optionalCapabilityState';

const props = defineProps({
  kind: {
    type: String,
    required: true,
    validator: (value) => ['albums', 'moments'].includes(value)
  },
  items: {
    type: Array,
    default: () => []
  },
  loading: {
    type: Boolean,
    default: false
  },
  error: {
    type: [Error, Object, Boolean],
    default: null
  },
  canManage: {
    type: Boolean,
    default: false
  }
});

defineEmits(['retry']);

const failedMediaRefs = reactive(new Set());
const railLabel = computed(() => props.kind === 'albums' ? '精选相册' : '精选动态');
const railTitle = computed(() => props.kind === 'albums' ? '记忆相册' : '最近动态');
const allRoute = computed(() => props.kind === 'albums' ? { name: 'albums' } : { name: 'moments' });
const studioRoute = computed(() => ({
  path: '/author',
  query: { tab: `admin:${props.kind}` }
}));
const contentLabel = computed(() => props.kind === 'albums' ? '相册' : '动态');
const featureDisabled = computed(() => isFeatureDisabledProblem(props.error));
const emptyDescription = computed(() => props.kind === 'albums'
  ? '第一组真实相册发布后会出现在这里，不会用头像或壁纸代替。'
  : '第一条真实动态发布后会出现在这里。');

function visibleCover(cover) {
  return Boolean(cover?.preview?.url && !failedMediaRefs.has(cover.mediaRef));
}

function hideFailedMedia(mediaRef) {
  if (mediaRef) failedMediaRefs.add(mediaRef);
}

function itemKey(item) {
  return props.kind === 'albums' ? item.publicSlug : item.publicId;
}

function itemRoute(item) {
  return props.kind === 'albums'
    ? { name: 'album-detail', params: { publicSlug: item.publicSlug } }
    : { name: 'moment-detail', params: { publicId: item.publicId } };
}

function excerpt(value, maxLength) {
  const text = String(value || '').trim();
  return text.length > maxLength ? `${text.slice(0, maxLength)}…` : text;
}

function itemTitle(item) {
  return props.kind === 'albums' ? item.title : excerpt(item.body, 56);
}

function itemMeta(item) {
  if (props.kind === 'albums') {
    const summary = excerpt(item.summary, 72);
    return summary || `${item.photoCount || 0} 张照片`;
  }
  return item.photos?.length ? `${item.photos.length} 张配图` : '一段生活记录';
}

function formatPublishedAt(value) {
  const parsed = new Date(value || '');
  if (Number.isNaN(parsed.getTime())) return 'MOMENT';
  return new Intl.DateTimeFormat('zh-CN', { month: 'short', day: 'numeric' }).format(parsed);
}
</script>

<style scoped>
.author-life-rail {
  min-width: 0;
  padding: clamp(16px, 2.5vw, 24px) 0;
  border: 0;
  border-block: none;
  border-radius: 0;
  background: transparent;
  box-shadow: none;
}

.life-rail-heading {
  min-width: 0;
  display: flex;
  align-items: end;
  justify-content: space-between;
  gap: 18px;
  margin-bottom: 20px;
}

.life-rail-heading > div {
  min-width: 0;
  display: grid;
  gap: 3px;
}

.life-rail-heading span {
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))));
  font-size: 9.5px;
  font-weight: 780;
  letter-spacing: 0.15em;
  text-transform: uppercase;
}

.life-rail-heading h2 {
  margin: 0;
  color: var(--about-text-primary, var(--theme-text-primary));
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: clamp(18px, 2.2vw, 24px);
  font-weight: 700;
  line-height: 1.38;
  letter-spacing: -0.015em;
}

.life-rail-heading > a {
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: 11.5px;
  font-weight: 580;
  text-decoration: none;
  transition: color 180ms ease;
}

.life-rail-heading > a:hover {
  color: var(--about-text-primary, var(--theme-text-primary));
}

.life-preview-card,
.life-preview-state {
  min-height: 218px;
  border: 0;
  border-radius: 0;
  background: transparent;
  box-shadow: none;
}

.life-preview-card {
  position: relative;
  overflow: hidden;
  display: grid;
  grid-template-rows: 128px minmax(0, 1fr);
  color: var(--about-text-primary, var(--theme-text-primary));
  text-decoration: none;
  transition: transform 280ms cubic-bezier(0.22, 1, 0.36, 1), border-color 200ms ease, box-shadow 280ms ease;
}

.life-preview-card:hover {
  transform: translateY(-6px) rotate(-0.45deg);
  border-color: var(--about-accent-border, rgba(var(--accent-rgb), 0.52));
  box-shadow: none;
}

.life-preview-card:focus-visible,
.life-preview-state button:focus-visible,
.life-preview-action:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 4px;
}

.life-preview-media,
.life-preview-placeholder {
  min-width: 0;
  min-height: 0;
  display: grid;
  place-items: center;
  background: linear-gradient(145deg, var(--about-accent-fill, rgba(var(--accent-rgb), 0.22)), rgba(var(--accent-soft-rgb), 0.08));
  border-bottom: 0;
  border-radius: 32px 12px 32px 12px;
}

.life-preview-media img {
  width: 100%;
  height: 100%;
  display: block;
  object-fit: cover;
}

.life-preview-placeholder {
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))));
  font-size: 2.2rem;
  opacity: 0.72;
}

.life-preview-copy {
  min-width: 0;
  display: grid;
  align-content: start;
  gap: 6px;
  padding: 15px 32px 16px 0;
}

.life-preview-copy small {
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))));
  font-size: 10px;
  font-weight: 770;
  letter-spacing: 0.14em;
  text-transform: uppercase;
}

.life-preview-copy strong {
  overflow: hidden;
  display: -webkit-box;
  color: var(--about-text-primary, var(--theme-text-primary));
  font-size: 15px;
  font-weight: 640;
  line-height: 1.5;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
}

.life-preview-copy span {
  overflow: hidden;
  display: -webkit-box;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  font-size: 11.5px;
  font-weight: 500;
  line-height: 1.58;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
}

.life-preview-arrow {
  position: absolute;
  right: 16px;
  bottom: 17px;
  color: var(--about-text-tertiary, var(--theme-icon-muted, var(--theme-text-secondary)));
  font-size: 11.5px;
  transition: transform 200ms ease-out;
}

.life-preview-card:hover .life-preview-arrow {
  transform: translate(2px, -2px);
}

.life-preview-state {
  display: grid;
  grid-template-columns: 52px minmax(0, 1fr);
  justify-items: start;
  align-content: center;
  align-items: start;
  gap: 6px 18px;
  min-height: 106px;
  padding: 16px 4px;
  color: var(--about-text-secondary, var(--theme-text-secondary));
  text-align: left;
}

.author-life-rail.is-empty :deep(.horizontal-card-rail__track) {
  grid-auto-columns: minmax(0, 1fr);
}

.life-preview-state > i {
  grid-row: 1 / span 2;
  display: grid;
  place-items: center;
  width: 52px;
  height: 52px;
  border-radius: 50%;
  background: var(--about-accent-fill, var(--accent-mode-fill-soft));
  color: var(--about-accent-text, rgb(var(--accent-readable-rgb, var(--accent-strong-rgb))));
  font-size: 1.8rem;
}

.life-preview-state strong {
  color: var(--about-text-primary, var(--theme-text-primary));
  font-size: 14.5px;
  font-weight: 660;
}

.life-preview-state span {
  max-width: 68ch;
  font-size: 11.5px;
  font-weight: 490;
  line-height: 1.62;
}

.life-preview-state button,
.life-preview-action {
  grid-column: 2;
  min-height: 40px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
  padding: 0 16px;
  border: 1.5px solid var(--about-border-subtle, var(--theme-border));
  border-radius: 999px;
  color: var(--about-text-primary, var(--theme-text-primary));
  background: var(--about-surface-elevated, var(--theme-surface-soft));
  cursor: pointer;
  font-size: 11.5px;
  font-weight: 600;
  text-decoration: none;
  transition: transform 180ms ease-out, border-color 180ms ease, box-shadow 180ms ease;
}

.life-preview-action:hover,
.life-preview-state button:hover {
  transform: translateY(-1px);
  border-color: var(--about-accent-border, rgba(var(--accent-rgb), 0.54));
  box-shadow: var(--about-shadow-soft, var(--theme-shadow-soft));
}

[data-motion-mode='soothing'] .life-preview-card,
:global(:root[data-effective-motion-mode='soothing']) .life-preview-card {
  transition: opacity 160ms ease, border-color 160ms ease;
}

[data-motion-mode='soothing'] .life-preview-card:hover,
:global(:root[data-effective-motion-mode='soothing']) .life-preview-card:hover {
  transform: none;
}

@media (prefers-reduced-motion: reduce) {
  .life-preview-card,
  .life-preview-card:hover,
  .life-preview-arrow,
  .life-preview-action:hover,
  .life-preview-state button:hover {
    transform: none;
    transition: opacity 140ms linear, border-color 140ms linear;
  }
}
</style>
