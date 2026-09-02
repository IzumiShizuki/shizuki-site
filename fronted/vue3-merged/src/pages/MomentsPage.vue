<template>
  <div
    class="moments-page"
    :class="{ 'view-transition-fallback': !nativeViewTransitionsSupported }"
    :data-motion-mode="effectiveMode"
  >
    <ThreeColumnContentShell>
      <template #left>
        <StickyCardStack>
          <aside class="moment-side-card">
            <span class="eyebrow">SITE / MOMENTS</span>
            <h2>生活时间线</h2>
            <p>比文章短一些，又值得单独记住的片段。</p>
            <nav aria-label="生活内容导航">
              <RouterLink to="/author?tab=about">About</RouterLink>
              <RouterLink to="/albums">Albums</RouterLink>
              <RouterLink class="active" to="/moments" aria-current="page">Moments</RouterLink>
            </nav>
          </aside>
        </StickyCardStack>
      </template>

      <section class="moments-flow" aria-labelledby="moments-page-title">
        <header class="moments-hero">
          <span class="eyebrow">LIFE IN SMALL FRAMES</span>
          <h1 id="moments-page-title">动态</h1>
          <p>日常没有必要都写成长文，但可以留下当时的温度。</p>
        </header>
        <RecommendedMusicCard class="moments-mobile-music" />

        <div v-if="pageLoading && pageItems.length === 0" class="moment-state" role="status">
          <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
          <p>正在读取动态……</p>
        </div>
        <div v-else-if="pageError && pageItems.length === 0" class="moment-state" role="alert">
          <i class="far fa-circle-xmark" aria-hidden="true"></i>
          <h2>动态暂时没有读到</h2>
          <p>这不会影响 About、Blog 或播放器。</p>
          <button type="button" @click="loadFirstPage">重新读取</button>
        </div>
        <div v-else-if="pageItems.length === 0" class="moment-state" data-testid="moments-page-empty">
          <i class="far fa-comment-dots" aria-hidden="true"></i>
          <h2>内容正在整理</h2>
          <p>第一条真实动态发布后，会自然地出现在这里。</p>
        </div>

        <div v-else class="moment-stream" data-testid="moments-page-list">
          <article
            v-for="moment in pageItems"
            :id="`moment-${moment.publicId}`"
            :key="moment.publicId"
            class="moment-card"
            :class="{ targeted: targetMomentId === moment.publicId }"
            :tabindex="targetMomentId === moment.publicId ? -1 : undefined"
          >
            <header>
              <time :datetime="moment.publishedAt">{{ formatPublishedAt(moment.publishedAt) }}</time>
              <span v-if="moment.pinned">置顶</span>
            </header>
            <p :id="`moment-body-${moment.publicId}`">{{ visibleMomentBody(moment) }}</p>
            <div
              v-if="visibleMomentPhotos(moment).length"
              class="moment-photo-strip"
              :class="`count-${Math.min(visibleMomentPhotos(moment).length, 3)}`"
            >
              <figure v-for="(photo, photoIndex) in visibleMomentPhotos(moment)" :key="photo.mediaRef">
                <button
                  type="button"
                  class="moment-photo-open"
                  :disabled="!momentPhotoItem(moment, photo)"
                  :aria-label="`打开动态照片 ${photoIndex + 1}`"
                  @click="openMomentPhoto(moment, photo)"
                >
                  <picture v-if="visiblePhoto(photo)">
                    <source v-if="photo.displayAvif?.url" :srcset="photo.displayAvif.url" type="image/avif" />
                    <img
                      :src="photoCardVariant(photo).url"
                      :alt="photo.altText || `动态配图 ${photoIndex + 1}`"
                      :width="photoCardVariant(photo).width"
                      :height="photoCardVariant(photo).height"
                      @error="hideFailedMedia(photo.mediaRef)"
                    />
                  </picture>
                  <span v-else class="photo-unavailable">
                    {{ momentPhotoItem(moment, photo) ? '打开后安全读取图片' : '图片暂不可用' }}
                  </span>
                </button>
                <figcaption v-if="photo.locationLabel">{{ photo.locationLabel }}</figcaption>
              </figure>
            </div>
            <footer class="moment-action-row">
              <ContentShareButton
                kind="moment"
                :public-id="moment.publicId"
                :title="momentShareTitle(moment)"
              />
              <span v-if="moment.noIndex" class="unlisted-label">
                <i class="fas fa-link" aria-hidden="true"></i>
                仅通过链接访问
              </span>
              <button
                v-if="momentCanExpand(moment)"
                type="button"
                class="moment-expand-button"
                :aria-expanded="momentIsExpanded(moment)"
                :aria-controls="`moment-body-${moment.publicId}`"
                @click="toggleMoment(moment)"
              >
                <span>{{ momentIsExpanded(moment) ? '收起动态' : '展开动态' }}</span>
                <i
                  class="fas fa-chevron-down"
                  :class="{ rotated: momentIsExpanded(moment) }"
                  aria-hidden="true"
                ></i>
              </button>
            </footer>
          </article>
        </div>

        <footer v-if="pageHasMore" class="load-more-row">
          <button type="button" :disabled="pageLoading" @click="loadMoreMoments">
            {{ pageLoading ? '读取中…' : '继续往前看' }}
          </button>
          <p v-if="pageError">下一页暂时没有读到，当前内容仍保持可见。</p>
        </footer>
      </section>

      <template #right>
        <StickyCardStack>
          <aside class="moment-side-card quiet-note">
            <span class="eyebrow">QUIET FEED</span>
            <h2>只读的生活记录</h2>
            <p>这里没有点赞、热度或自动生成的内容，只按实际发布时间排列。</p>
          </aside>
          <RecommendedMusicCard />
        </StickyCardStack>
      </template>
    </ThreeColumnContentShell>

    <MediaLightbox
      v-model="lightboxOpen"
      :items="lightboxItems"
      :start-index="lightboxStartIndex"
      :resolve-protected-variant="resolveProtectedVariant"
    />
  </div>
</template>

<script setup>
import { computed, nextTick, reactive, ref, watch } from 'vue';
import { RouterLink, useRoute } from 'vue-router';
import ContentShareButton from '../components/content/ContentShareButton.vue';
import MediaLightbox from '../components/content/MediaLightbox.vue';
import RecommendedMusicCard from '../components/content/RecommendedMusicCard.vue';
import StickyCardStack from '../components/content/StickyCardStack.vue';
import ThreeColumnContentShell from '../components/content/ThreeColumnContentShell.vue';
import { useMotionPreference } from '../composables/useMotionPreference';
import { useAsyncResource } from '../composables/useAsyncResource';
import { useCursorResource } from '../composables/useCursorResource';
import { usePageRobots } from '../composables/usePageRobots';
import { supportsNativeViewTransitions } from '../composables/useViewTransitionNavigation';
import { getMomentDetail, getMomentsPage } from '../services/lifeContentApi';

const route = useRoute();
const { effectiveMode } = useMotionPreference();
const nativeViewTransitionsSupported = supportsNativeViewTransitions();
const failedMediaRefs = reactive(new Set());
const lightboxOpen = ref(false);
const lightboxItems = ref([]);
const lightboxStartIndex = ref(0);
const expandedMomentIds = reactive(new Set());
const directMomentId = computed(() => String(route.params?.publicId || '').trim());
const momentFeed = useCursorResource(
  ({ cursor, signal }) => getMomentsPage({ cursor, limit: 12, signal }),
  { immediate: false, keyOf: (moment) => moment.publicId }
);
const { items, loading, error, hasMore, refresh, loadMore } = momentFeed;
const directResource = useAsyncResource(
  ({ signal }) => getMomentDetail(directMomentId.value, signal)
);
const directMoment = computed(() => (
  directResource.data.value?.publicId === directMomentId.value ? directResource.data.value : null
));
const pageItems = computed(() => (
  directMomentId.value ? (directMoment.value ? [directMoment.value] : []) : items.value
));
const pageLoading = computed(() => (
  directMomentId.value ? directResource.loading.value : loading.value
));
const pageError = computed(() => (
  directMomentId.value ? directResource.error.value : error.value
));
const pageHasMore = computed(() => !directMomentId.value && hasMore.value);
const targetMomentId = computed(() => (
  directMomentId.value || String(route.query?.moment || '').trim()
));
usePageRobots(computed(() => Boolean(directMoment.value?.noIndex)));
const COMPACT_BODY_LENGTH = 180;
const COMPACT_PHOTO_COUNT = 3;

function bodyCharacters(moment) {
  return Array.from(String(moment?.body || ''));
}

function momentIsExpanded(moment) {
  return expandedMomentIds.has(moment.publicId);
}

function momentCanExpand(moment) {
  return bodyCharacters(moment).length > COMPACT_BODY_LENGTH
    || moment.photos.length > COMPACT_PHOTO_COUNT;
}

function visibleMomentBody(moment) {
  const characters = bodyCharacters(moment);
  if (momentIsExpanded(moment) || characters.length <= COMPACT_BODY_LENGTH) return characters.join('');
  return `${characters.slice(0, COMPACT_BODY_LENGTH).join('').trimEnd()}…`;
}

function visibleMomentPhotos(moment) {
  return momentIsExpanded(moment)
    ? moment.photos
    : moment.photos.slice(0, COMPACT_PHOTO_COUNT);
}

async function toggleMoment(moment) {
  const scrollRoot = document.querySelector('.route-content.route-content-app-scroll')
    || document.querySelector('.route-content');
  const scrollTop = Number(scrollRoot?.scrollTop) || 0;
  if (momentIsExpanded(moment)) expandedMomentIds.delete(moment.publicId);
  else expandedMomentIds.add(moment.publicId);
  await nextTick();
  if (scrollRoot) scrollRoot.scrollTop = scrollTop;
}

function photoCardVariant(photo) {
  return photo?.thumbnail || photo?.display || null;
}

function visiblePhoto(photo) {
  return Boolean(photoCardVariant(photo)?.url && !failedMediaRefs.has(photo.mediaRef));
}

function hideFailedMedia(mediaRef) {
  if (mediaRef) failedMediaRefs.add(mediaRef);
}

function buildMomentLightboxItems(moment) {
  return moment.photos.map((photo, index) => {
    const display = photo.display || photo.thumbnail;
    const protectedVariant = photo.protectedDisplay || photo.protectedThumbnail;
    if (!display?.url && !protectedVariant) return null;
    return Object.freeze({
      key: photo.mediaRef,
      mediaRef: photo.mediaRef,
      momentId: moment.publicId,
      src: display?.url || '',
      avifSrc: photo.displayAvif?.url || '',
      width: display?.width || protectedVariant?.width || 0,
      height: display?.height || protectedVariant?.height || 0,
      protectedVariant,
      alt: photo.altText || `动态配图 ${index + 1}`,
      caption: moment.body,
      locationLabel: photo.locationLabel
    });
  }).filter(Boolean);
}

function momentPhotoItem(moment, photo) {
  return buildMomentLightboxItems(moment).find((item) => item.mediaRef === photo.mediaRef) || null;
}

function openMomentPhoto(moment, photo) {
  const nextItems = buildMomentLightboxItems(moment);
  const index = nextItems.findIndex((item) => item.mediaRef === photo.mediaRef);
  if (index < 0) return;
  lightboxItems.value = nextItems;
  lightboxStartIndex.value = index;
  lightboxOpen.value = true;
}

async function resolveProtectedVariant(item, { signal }) {
  const freshMoment = await getMomentDetail(item.momentId, signal);
  const freshPhoto = freshMoment.photos.find((photo) => photo.mediaRef === item.mediaRef);
  const variant = freshPhoto?.protectedDisplay || freshPhoto?.protectedThumbnail;
  if (!variant) throw new TypeError('Protected display variant is no longer available');
  return variant;
}

function momentShareTitle(moment) {
  const prefix = formatPublishedAt(moment.publishedAt);
  return `${prefix} · 生活动态`;
}

function formatPublishedAt(value) {
  const parsed = new Date(value || '');
  if (Number.isNaN(parsed.getTime())) return '最近发布';
  return new Intl.DateTimeFormat('zh-CN', { year: 'numeric', month: 'long', day: 'numeric' }).format(parsed);
}

async function revealTargetMoment() {
  if (!targetMomentId.value) return;
  await nextTick();
  const target = document.getElementById(`moment-${targetMomentId.value}`);
  target?.scrollIntoView?.({ block: 'center', behavior: effectiveMode.value === 'soothing' ? 'auto' : 'smooth' });
  target?.focus?.({ preventScroll: true });
}

function loadFirstPage() {
  return directMomentId.value
    ? directResource.refresh('retry')
    : refresh('retry');
}

function loadMoreMoments() {
  return loadMore();
}

function loadCurrentSurface() {
  lightboxOpen.value = false;
  return directMomentId.value
    ? directResource.refresh('direct-route')
    : refresh('feed-route');
}

watch(directMomentId, loadCurrentSurface, { immediate: true });
watch(targetMomentId, revealTargetMoment);
watch(() => pageItems.value.length, revealTargetMoment);
</script>

<style scoped>
.moments-page {
  min-height: 100%;
  padding: clamp(20px, 3vw, 42px) clamp(4px, 1.5vw, 18px) 80px;
  color: var(--theme-text-primary);
}

.moments-page.view-transition-fallback[data-motion-mode='immersive'] {
  animation: life-route-fallback-enter 240ms cubic-bezier(0.2, 0.8, 0.2, 1) both;
}

.moments-page.view-transition-fallback[data-motion-mode='soothing'] {
  animation: life-route-fallback-fade 120ms ease both;
}

@keyframes life-route-fallback-enter {
  from { opacity: 0; transform: translateY(8px) scale(0.995); }
  to { opacity: 1; transform: none; }
}

@keyframes life-route-fallback-fade {
  from { opacity: 0; }
  to { opacity: 1; }
}

.eyebrow {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  font-weight: 760;
  letter-spacing: 0.17em;
}

.moments-hero {
  margin-bottom: 26px;
  padding: clamp(22px, 4vw, 42px);
  border-bottom: 1px solid var(--theme-border-subtle);
}

.moments-hero h1 {
  margin: 6px 0 8px;
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  font-size: clamp(34px, 5vw, 64px);
  letter-spacing: 0.08em;
}

.moments-hero p,
.moment-side-card p,
.moment-state p {
  color: var(--theme-text-secondary);
  line-height: 1.7;
}

.moments-hero p,
.moment-side-card p {
  margin: 0;
}

.moment-side-card,
.moment-card,
.moment-state {
  border: 1px solid var(--theme-border-subtle);
  background: var(--theme-panel-surface);
  box-shadow: var(--theme-shadow-soft);
}

.moment-side-card {
  padding: 20px;
  border-radius: 22px;
}

.moment-side-card h2 {
  margin: 7px 0 9px;
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: 19px;
}

.moment-side-card p {
  font-size: 13px;
}

.moment-side-card nav {
  display: grid;
  gap: 6px;
  margin-top: 18px;
}

.moment-side-card a {
  min-height: 40px;
  padding: 0 12px;
  border-radius: 12px;
  display: flex;
  align-items: center;
  color: var(--theme-text-secondary);
  text-decoration: none;
}

.moment-side-card a:hover,
.moment-side-card a.active {
  color: var(--theme-text-primary);
  background: rgba(var(--accent-rgb), 0.16);
}

.moment-stream {
  position: relative;
  display: grid;
  gap: 18px;
  padding-left: 22px;
}

.moment-stream::before {
  content: '';
  position: absolute;
  top: 14px;
  bottom: 14px;
  left: 5px;
  width: 1px;
  background: color-mix(in srgb, var(--theme-border-strong) 72%, rgba(var(--accent-rgb), 0.25));
}

.moment-card {
  position: relative;
  padding: clamp(18px, 3vw, 28px);
  border-radius: 22px;
  transition: border-color 170ms ease, box-shadow 170ms ease, transform 240ms ease;
}

.moment-card::before {
  content: '';
  position: absolute;
  top: 30px;
  left: -23px;
  width: 9px;
  height: 9px;
  border: 3px solid var(--theme-panel-surface-elevated);
  border-radius: 50%;
  background: rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 0 1px rgba(var(--accent-rgb), 0.35);
}

[data-motion-mode='immersive'] .moment-card:hover {
  border-color: rgba(var(--accent-rgb), 0.42);
  transform: translateY(-3px);
}

[data-motion-mode='soothing'] .moment-card {
  transform: none;
}

.moment-card.targeted {
  border-color: rgba(var(--accent-rgb), 0.58);
  box-shadow: 0 18px 44px rgba(12, 8, 18, 0.2), 0 0 0 2px rgba(var(--accent-rgb), 0.12);
}

.moment-card:focus-visible,
.moment-state button:focus-visible,
.load-more-row button:focus-visible,
.moment-photo-open:focus-visible,
.moment-expand-button:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.moment-card header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  color: var(--theme-text-tertiary);
  font-size: 11px;
}

.moment-card header span {
  border-radius: 999px;
  padding: 3px 8px;
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  background: rgba(var(--accent-rgb), 0.13);
}

.moment-card > p {
  margin: 14px 0 0;
  color: var(--theme-text-primary);
  font-size: 15px;
  line-height: 1.85;
  white-space: pre-wrap;
}

.moment-action-row {
  margin-top: 18px;
  padding-top: 12px;
  border-top: 1px solid var(--theme-border-subtle);
  display: flex;
  align-items: center;
  flex-wrap: wrap;
  gap: 10px;
}

.moment-action-row .moment-expand-button {
  margin-left: auto;
}

.unlisted-label {
  min-height: 36px;
  padding: 0 11px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  color: var(--theme-text-tertiary);
  background: rgba(var(--accent-rgb), 0.09);
  font-size: 11px;
}

.moment-expand-button {
  min-height: 44px;
  border: 0;
  border-radius: 999px;
  padding: 0 13px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  background: rgba(var(--accent-rgb), 0.1);
  font: inherit;
  font-size: 12px;
  cursor: pointer;
}

.moment-expand-button i {
  font-size: 10px;
  transition: transform 180ms ease;
}

.moment-expand-button i.rotated {
  transform: rotate(180deg);
}

[data-motion-mode='soothing'] .moment-expand-button i {
  transition-duration: 100ms;
}

.moment-photo-strip {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 7px;
  margin-top: 18px;
}

.moment-photo-strip.count-1 {
  grid-template-columns: minmax(0, 1fr);
}

.moment-photo-strip.count-2 {
  grid-template-columns: repeat(2, minmax(0, 1fr));
}

.moment-photo-strip figure {
  min-width: 0;
  margin: 0;
}

.moment-photo-open {
  width: 100%;
  min-height: 44px;
  border: 0;
  padding: 0;
  display: block;
  color: inherit;
  background: transparent;
  font: inherit;
  cursor: zoom-in;
}

.moment-photo-open:disabled {
  cursor: default;
}

.moment-photo-open picture {
  display: block;
}

.moment-photo-strip img,
.photo-unavailable {
  width: 100%;
  aspect-ratio: 4 / 3;
  border-radius: 13px;
  display: flex;
  align-items: center;
  justify-content: center;
  object-fit: cover;
  color: var(--theme-text-tertiary);
  background: var(--theme-panel-surface-elevated);
  font-size: 11px;
}

.moment-photo-strip figcaption {
  margin-top: 5px;
  color: var(--theme-text-tertiary);
  font-size: 10px;
}

.moment-state {
  min-height: 300px;
  padding: 34px;
  border-style: dashed;
  border-radius: 24px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  text-align: center;
}

.moment-state i {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 30px;
}

.moment-state h2 {
  margin: 14px 0 0;
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
}

.moment-state button,
.load-more-row button {
  min-height: 42px;
  border: 1px solid var(--theme-border-strong);
  border-radius: 999px;
  padding: 0 18px;
  color: var(--theme-text-primary);
  background: rgba(var(--accent-rgb), 0.14);
  font: inherit;
  cursor: pointer;
}

.load-more-row {
  padding-top: 26px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 8px;
}

.load-more-row p {
  margin: 0;
  color: var(--theme-text-tertiary);
  font-size: 12px;
}

.moments-mobile-music {
  display: none;
}

@media (max-width: 899.98px) {
  .moments-mobile-music {
    display: block;
    margin-bottom: 20px;
  }
}

@media (max-width: 600px) {
  .moment-photo-strip,
  .moment-photo-strip.count-2 {
    grid-template-columns: 1fr;
  }
}
</style>
