<template>
  <HorizontalCardRail class="author-life-rail" :label="railLabel" :title="railTitle">
    <template #header>
      <div class="life-rail-heading">
        <div>
          <span>{{ kind === 'albums' ? 'MEMORY ARCHIVE' : 'LIFE LOG' }}</span>
          <h2>{{ railTitle }}</h2>
        </div>
        <RouterLink :to="allRoute">查看全部</RouterLink>
      </div>
    </template>

    <article v-if="loading && items.length === 0" class="life-preview-state" role="status">
      <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
      <strong>正在读取{{ contentLabel }}……</strong>
    </article>

    <article v-else-if="error && items.length === 0" class="life-preview-state is-error" :data-testid="`${kind}-rail-error`">
      <i class="far fa-circle-xmark" aria-hidden="true"></i>
      <strong>{{ contentLabel }}暂时没有读到</strong>
      <span>介绍内容不受影响，可以稍后单独重试。</span>
      <button type="button" @click="$emit('retry')">重新读取</button>
    </article>

    <article v-else-if="items.length === 0" class="life-preview-state" :data-testid="`${kind}-rail-empty`">
      <i :class="kind === 'albums' ? 'far fa-images' : 'far fa-comment-dots'" aria-hidden="true"></i>
      <strong>内容正在整理</strong>
      <span>{{ emptyDescription }}</span>
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
  }
});

defineEmits(['retry']);

const failedMediaRefs = reactive(new Set());
const railLabel = computed(() => props.kind === 'albums' ? '精选相册' : '精选动态');
const railTitle = computed(() => props.kind === 'albums' ? '记忆相册' : '最近动态');
const allRoute = computed(() => props.kind === 'albums' ? { name: 'albums' } : { name: 'moments' });
const contentLabel = computed(() => props.kind === 'albums' ? '相册' : '动态');
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
  padding: 16px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.16));
  border-radius: 20px;
  background: color-mix(in srgb, var(--theme-panel-surface) 88%, transparent);
  box-shadow: 0 14px 34px rgba(8, 10, 20, 0.12);
}

.life-rail-heading {
  min-width: 0;
  display: flex;
  align-items: end;
  justify-content: space-between;
  gap: 16px;
}

.life-rail-heading > div {
  min-width: 0;
  display: grid;
  gap: 2px;
}

.life-rail-heading span {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 9px;
  font-weight: 760;
  letter-spacing: 0.13em;
}

.life-rail-heading h2 {
  margin: 0;
  color: var(--theme-text-primary);
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: clamp(1rem, 1.8vw, 1.25rem);
}

.life-rail-heading > a {
  color: var(--theme-text-secondary);
  font-size: 11px;
  text-decoration: none;
}

.life-rail-heading > a:hover {
  color: var(--theme-text-primary);
}

.life-preview-card,
.life-preview-state {
  min-height: 206px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.16));
  border-radius: 18px;
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.08));
}

.life-preview-card {
  position: relative;
  overflow: hidden;
  display: grid;
  grid-template-rows: 118px minmax(0, 1fr);
  color: var(--theme-text-primary);
  text-decoration: none;
  transition: transform 260ms cubic-bezier(0.22, 1, 0.36, 1), border-color 180ms ease, box-shadow 260ms ease;
}

.life-preview-card:hover {
  transform: translateY(-5px) rotate(-0.35deg);
  border-color: rgba(var(--accent-rgb), 0.48);
  box-shadow: 0 18px 34px rgba(8, 10, 20, 0.2);
}

.life-preview-card:focus-visible,
.life-preview-state button:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.life-preview-media,
.life-preview-placeholder {
  min-width: 0;
  min-height: 0;
  display: grid;
  place-items: center;
  background: linear-gradient(145deg, rgba(var(--accent-rgb), 0.2), rgba(var(--accent-soft-rgb), 0.07));
}

.life-preview-media img {
  width: 100%;
  height: 100%;
  display: block;
  object-fit: cover;
}

.life-preview-placeholder {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 2rem;
}

.life-preview-copy {
  min-width: 0;
  display: grid;
  align-content: start;
  gap: 5px;
  padding: 13px 38px 14px 14px;
}

.life-preview-copy small {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  font-weight: 750;
  letter-spacing: 0.13em;
}

.life-preview-copy strong {
  overflow: hidden;
  display: -webkit-box;
  color: var(--theme-text-primary);
  font-size: 14px;
  line-height: 1.45;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
}

.life-preview-copy span {
  overflow: hidden;
  display: -webkit-box;
  color: var(--theme-text-secondary);
  font-size: 11px;
  line-height: 1.5;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
}

.life-preview-arrow {
  position: absolute;
  right: 14px;
  bottom: 15px;
  color: var(--theme-icon-muted, var(--theme-text-secondary));
  font-size: 11px;
}

.life-preview-state {
  display: grid;
  place-items: center;
  align-content: center;
  gap: 8px;
  padding: 20px;
  color: var(--theme-text-secondary);
  text-align: center;
}

.life-preview-state > i {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 1.6rem;
}

.life-preview-state strong {
  color: var(--theme-text-primary);
  font-size: 14px;
}

.life-preview-state span {
  max-width: 230px;
  font-size: 11px;
  line-height: 1.5;
}

.life-preview-state button {
  min-height: 38px;
  padding: 0 14px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.2));
  border-radius: 999px;
  color: var(--theme-text-primary);
  background: var(--theme-surface-soft, rgba(255, 255, 255, 0.1));
  cursor: pointer;
}

[data-motion-mode='soothing'] .life-preview-card,
:global(:root[data-effective-motion-mode='soothing']) .life-preview-card {
  transition: opacity 140ms ease, border-color 140ms ease;
}

[data-motion-mode='soothing'] .life-preview-card:hover,
:global(:root[data-effective-motion-mode='soothing']) .life-preview-card:hover {
  transform: none;
}

@media (prefers-reduced-motion: reduce) {
  .life-preview-card,
  .life-preview-card:hover {
    transform: none;
    transition: opacity 120ms linear, border-color 120ms linear;
  }
}
</style>
