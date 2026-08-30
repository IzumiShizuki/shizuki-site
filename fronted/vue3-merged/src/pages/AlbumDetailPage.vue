<template>
  <div
    class="album-detail-page"
    :class="{ 'view-transition-fallback': !nativeViewTransitionsSupported }"
    :data-motion-mode="effectiveMode"
  >
    <ThreeColumnContentShell>
      <template #left>
        <StickyCardStack>
          <aside class="album-detail-side">
            <RouterLink class="back-link" to="/albums"><i class="fas fa-arrow-left" aria-hidden="true"></i> 返回相册</RouterLink>
            <template v-if="album">
              <span class="eyebrow">ALBUM NOTE</span>
              <h2>{{ album.title }}</h2>
              <time :datetime="album.publishedAt">{{ formatPublishedAt(album.publishedAt) }}</time>
              <p>{{ album.summary || '这本相册没有附加说明。' }}</p>
            </template>
          </aside>
        </StickyCardStack>
      </template>

      <section class="album-detail-main" :style="memoryLensStyle" aria-live="polite">
        <div v-if="loading" class="album-detail-state" role="status">
          <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
          <p>正在打开相册……</p>
        </div>
        <div v-else-if="error" class="album-detail-state" role="alert">
          <i class="far fa-circle-xmark" aria-hidden="true"></i>
          <h1>这本相册暂时无法打开</h1>
          <p>它可能已撤回，也可能只是网络暂时不可用。</p>
          <button type="button" @click="loadAlbum">重新读取</button>
        </div>
        <template v-else-if="album">
          <header class="album-detail-hero">
            <span class="eyebrow">PHOTO ALBUM</span>
            <h1>{{ album.title }}</h1>
            <p>{{ album.summary }}</p>
            <div class="album-detail-actions">
              <ContentShareButton
                kind="album"
                :public-id="album.publicSlug"
                :title="album.title"
              />
              <span v-if="album.noIndex" class="unlisted-label">
                <i class="fas fa-link" aria-hidden="true"></i>
                仅通过链接访问
              </span>
            </div>
          </header>

          <div v-if="album.photos.length === 0" class="album-detail-state">
            <i class="far fa-images" aria-hidden="true"></i>
            <h2>相册里还没有可展示的照片</h2>
          </div>
          <div v-else class="photo-field">
            <figure v-for="(photo, index) in album.photos" :key="photo.media?.mediaRef || index" class="photo-frame">
              <button
                type="button"
                class="photo-open"
                :disabled="!lightboxItemFor(photo)"
                :aria-label="`打开照片：${photoAlt(photo, index)}`"
                @click="openPhoto(photo)"
              >
                <picture v-if="visiblePhoto(photo)">
                  <source v-if="photo.media.displayAvif?.url" :srcset="photo.media.displayAvif.url" type="image/avif" />
                  <img
                    :src="photoCardVariant(photo).url"
                    :alt="photoAlt(photo, index)"
                    :width="photoCardVariant(photo).width"
                    :height="photoCardVariant(photo).height"
                    @error="hideFailedMedia(photo.media.mediaRef)"
                  />
                </picture>
                <span v-else class="photo-unavailable">
                  <i class="far fa-image" aria-hidden="true"></i>
                  <span>{{ lightboxItemFor(photo) ? '打开后安全读取照片' : '这张照片暂时不可用' }}</span>
                </span>
              </button>
              <figcaption v-if="photo.title || photo.caption || photo.locationLabel">
                <strong v-if="photo.title">{{ photo.title }}</strong>
                <span v-if="photo.caption">{{ photo.caption }}</span>
                <small v-if="photo.locationLabel"><i class="fas fa-location-dot" aria-hidden="true"></i> {{ photo.locationLabel }}</small>
              </figcaption>
            </figure>
          </div>
        </template>
      </section>

      <template #right>
        <StickyCardStack>
          <aside class="album-detail-side privacy-note">
            <span class="eyebrow">MEDIA PRIVACY</span>
            <h2>展示的是安全派生图</h2>
            <p>页面不会直接暴露原图存储地址。无法授权的照片会诚实地保持不可用。</p>
          </aside>
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
import { computed, reactive, ref, watch } from 'vue';
import { RouterLink, useRoute } from 'vue-router';
import ContentShareButton from '../components/content/ContentShareButton.vue';
import MediaLightbox from '../components/content/MediaLightbox.vue';
import StickyCardStack from '../components/content/StickyCardStack.vue';
import ThreeColumnContentShell from '../components/content/ThreeColumnContentShell.vue';
import { useMotionPreference } from '../composables/useMotionPreference';
import { usePageRobots } from '../composables/usePageRobots';
import { useAsyncResource } from '../composables/useAsyncResource';
import {
  resolveMemoryLensName,
  supportsNativeViewTransitions
} from '../composables/useViewTransitionNavigation';
import { getAlbumDetail } from '../services/lifeContentApi';

const route = useRoute();
const { effectiveMode } = useMotionPreference();
const nativeViewTransitionsSupported = supportsNativeViewTransitions();
const failedMediaRefs = reactive(new Set());
const lightboxOpen = ref(false);
const lightboxStartIndex = ref(0);
const albumResource = useAsyncResource(
  ({ signal }) => getAlbumDetail(route.params.publicSlug, signal)
);
const { data: album, loading, error, refresh } = albumResource;
usePageRobots(computed(() => Boolean(album.value?.noIndex)));
const memoryLensStyle = computed(() => ({
  viewTransitionName: effectiveMode.value === 'immersive'
    ? resolveMemoryLensName(route.params.publicSlug)
    : 'none'
}));
const lightboxItems = computed(() => (album.value?.photos || [])
  .map((photo, index) => toLightboxItem(photo, index))
  .filter(Boolean));

function photoAlt(photo, index) {
  return photo?.altText || photo?.media?.altText || photo?.title || `相册照片 ${index + 1}`;
}

function photoCardVariant(photo) {
  return photo?.media?.thumbnail || photo?.media?.display || null;
}

function visiblePhoto(photo) {
  return Boolean(photoCardVariant(photo)?.url && !failedMediaRefs.has(photo.media.mediaRef));
}

function hideFailedMedia(mediaRef) {
  if (mediaRef) failedMediaRefs.add(mediaRef);
}

function toLightboxItem(photo, index) {
  const media = photo?.media;
  if (!media) return null;
  const display = media.display || media.thumbnail;
  const protectedVariant = media.protectedDisplay || media.protectedThumbnail;
  if (!display?.url && !protectedVariant) return null;
  return Object.freeze({
    key: media.mediaRef,
    mediaRef: media.mediaRef,
    src: display?.url || '',
    avifSrc: media.displayAvif?.url || '',
    width: display?.width || protectedVariant?.width || 0,
    height: display?.height || protectedVariant?.height || 0,
    protectedVariant,
    alt: photoAlt(photo, index),
    title: photo.title,
    caption: photo.caption,
    locationLabel: photo.locationLabel
  });
}

function lightboxItemFor(photo) {
  const mediaRef = photo?.media?.mediaRef;
  return lightboxItems.value.find((item) => item.mediaRef === mediaRef) || null;
}

function openPhoto(photo) {
  const item = lightboxItemFor(photo);
  if (!item) return;
  lightboxStartIndex.value = lightboxItems.value.indexOf(item);
  lightboxOpen.value = true;
}

async function resolveProtectedVariant(item, { signal }) {
  const freshAlbum = await getAlbumDetail(route.params.publicSlug, signal);
  const freshPhoto = freshAlbum.photos.find((photo) => photo.media?.mediaRef === item.mediaRef);
  const variant = freshPhoto?.media?.protectedDisplay || freshPhoto?.media?.protectedThumbnail;
  if (!variant) throw new TypeError('Protected display variant is no longer available');
  return variant;
}

function formatPublishedAt(value) {
  const parsed = new Date(value || '');
  if (Number.isNaN(parsed.getTime())) return '发布时间未记录';
  return new Intl.DateTimeFormat('zh-CN', { year: 'numeric', month: 'long', day: 'numeric' }).format(parsed);
}

async function loadAlbum() {
  return refresh('route-or-retry');
}

watch(() => route.params.publicSlug, loadAlbum, { immediate: true });
</script>

<style scoped>
.album-detail-page {
  min-height: 100%;
  padding: clamp(20px, 3vw, 42px) clamp(4px, 1.5vw, 18px) 80px;
  color: var(--theme-text-primary);
}

.album-detail-page.view-transition-fallback[data-motion-mode='immersive'] {
  animation: life-route-fallback-enter 240ms cubic-bezier(0.2, 0.8, 0.2, 1) both;
}

.album-detail-page.view-transition-fallback[data-motion-mode='soothing'] {
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

.album-detail-side,
.album-detail-state {
  border: 1px solid var(--theme-border-subtle);
  background: color-mix(in srgb, var(--theme-panel-surface) 90%, transparent);
  box-shadow: var(--theme-shadow-soft);
}

.album-detail-side {
  padding: 20px;
  border-radius: 22px;
}

.back-link {
  min-height: 38px;
  margin-bottom: 20px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  color: var(--theme-text-secondary);
  text-decoration: none;
}

.back-link:hover {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
}

.eyebrow {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  font-weight: 760;
  letter-spacing: 0.17em;
}

.album-detail-side h2 {
  margin: 8px 0;
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: 19px;
}

.album-detail-side time,
.album-detail-side p {
  color: var(--theme-text-tertiary);
  font-size: 12px;
  line-height: 1.7;
}

.album-detail-hero {
  padding: clamp(22px, 4vw, 46px) clamp(10px, 3vw, 30px);
  text-align: center;
}

.album-detail-hero h1 {
  margin: 8px 0 10px;
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  font-size: clamp(34px, 6vw, 66px);
  letter-spacing: 0.06em;
}

.album-detail-hero p {
  max-width: 600px;
  margin: 0 auto;
  color: var(--theme-text-secondary);
  line-height: 1.7;
}

.album-detail-actions {
  margin-top: 18px;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-wrap: wrap;
  gap: 10px;
}

.unlisted-label {
  min-height: 36px;
  padding: 0 12px;
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  color: var(--theme-text-tertiary);
  background: rgba(var(--accent-rgb), 0.09);
  font-size: 11px;
}

.photo-field {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: clamp(16px, 2.4vw, 28px);
}

.photo-frame {
  margin: 0;
  padding: 9px 9px 16px;
  border: 1px solid var(--theme-border-subtle);
  border-radius: 8px 8px 17px 17px;
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 94%, transparent);
  box-shadow: 0 16px 38px rgba(12, 8, 18, 0.18);
  transition: transform 240ms ease, border-color 160ms ease;
}

[data-motion-mode='immersive'] .photo-frame:hover,
[data-motion-mode='immersive'] .photo-frame:focus-within {
  border-color: rgba(var(--accent-rgb), 0.44);
  transform: translateY(-4px);
}

[data-motion-mode='soothing'] .photo-frame {
  transform: none;
}

.photo-open,
.photo-open picture,
.photo-open img,
.photo-unavailable {
  width: 100%;
  aspect-ratio: 4 / 3;
  border-radius: 5px;
}

.photo-open {
  min-height: 44px;
  border: 0;
  padding: 0;
  display: block;
  color: inherit;
  background: transparent;
  font: inherit;
  cursor: zoom-in;
}

.photo-open:disabled {
  cursor: default;
}

.photo-open picture,
.photo-open img {
  display: block;
}

.photo-open img {
  display: block;
  object-fit: cover;
}

.photo-unavailable {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 8px;
  color: var(--theme-text-tertiary);
  background: var(--theme-panel-surface);
  font-size: 11px;
}

.photo-frame figcaption {
  display: flex;
  flex-direction: column;
  gap: 4px;
  padding: 12px 6px 0;
}

.photo-frame figcaption span,
.photo-frame figcaption small {
  color: var(--theme-text-tertiary);
  font-size: 11px;
  line-height: 1.5;
}

.album-detail-state {
  min-height: 320px;
  padding: 34px;
  border-style: dashed;
  border-radius: 24px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  text-align: center;
}

.album-detail-state i {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 30px;
}

.album-detail-state button {
  min-height: 42px;
  border: 1px solid var(--theme-border-strong);
  border-radius: 999px;
  padding: 0 18px;
  color: var(--theme-text-primary);
  background: rgba(var(--accent-rgb), 0.14);
  font: inherit;
  cursor: pointer;
}

.album-detail-state button:focus-visible,
.back-link:focus-visible,
.photo-open:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

@media (max-width: 680px) {
  .photo-field {
    grid-template-columns: 1fr;
  }
}
</style>
