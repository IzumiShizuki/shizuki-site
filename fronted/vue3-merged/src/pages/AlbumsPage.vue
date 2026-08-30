<template>
  <div
    class="life-index-page"
    :class="{ 'view-transition-fallback': !nativeViewTransitionsSupported }"
    :data-motion-mode="effectiveMode"
  >
    <ThreeColumnContentShell>
      <template #left>
        <StickyCardStack>
          <aside class="life-side-card archive-index">
            <span class="eyebrow">SITE / ALBUMS</span>
            <h2>记忆目录</h2>
            <p>照片按一段经历而不是上传时间被整理在一起。</p>
            <nav aria-label="生活内容导航">
              <RouterLink to="/author?tab=about">About</RouterLink>
              <RouterLink class="active" to="/albums" aria-current="page">Albums</RouterLink>
              <RouterLink to="/moments">Moments</RouterLink>
            </nav>
          </aside>
        </StickyCardStack>
      </template>

      <section class="life-main-flow" aria-labelledby="albums-page-title">
        <header class="life-page-hero">
          <span class="eyebrow">PHOTO NOTES</span>
          <h1 id="albums-page-title">相册</h1>
          <p>一些被认真留下的光线、地点与同行的人。</p>
        </header>
        <RecommendedMusicCard class="life-mobile-music" />

        <div v-if="loading && items.length === 0" class="life-state" role="status">
          <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
          <p>正在翻找相册……</p>
        </div>

        <div v-else-if="error && items.length === 0" class="life-state" role="alert">
          <i class="far fa-circle-xmark" aria-hidden="true"></i>
          <h2>相册暂时没有读到</h2>
          <p>主站其他内容仍可继续浏览。</p>
          <button type="button" @click="loadFirstPage">重新读取</button>
        </div>

        <div v-else-if="items.length === 0" class="life-state" data-testid="albums-page-empty">
          <i class="far fa-images" aria-hidden="true"></i>
          <h2>内容正在整理</h2>
          <p>第一本真实相册发布后，会从这里开始展开。</p>
        </div>

        <div v-else class="album-grid" data-testid="albums-page-list">
          <RouterLink
            v-for="(album, index) in items"
            :key="album.publicSlug"
            :to="`/albums/${encodeURIComponent(album.publicSlug)}`"
            custom
            v-slot="{ href }"
          >
            <a
              :href="href"
              class="album-card"
              :class="{ 'without-cover': !visibleCover(album.cover) }"
              :style="{ '--album-order': index }"
              @click.prevent="openAlbum($event, album)"
            >
              <span v-if="visibleCover(album.cover)" class="album-stack" aria-hidden="true">
                <span class="album-stack-layer layer-back"></span>
                <span class="album-stack-layer layer-middle"></span>
              </span>
              <span v-if="visibleCover(album.cover)" class="album-cover">
                <img
                  :src="album.cover.preview.url"
                  :alt="album.cover.altText || album.title"
                  :width="album.cover.preview.width"
                  :height="album.cover.preview.height"
                  @error="hideFailedMedia(album.cover.mediaRef)"
                />
              </span>
              <span v-else class="album-cover-empty" aria-hidden="true"><i class="far fa-images"></i></span>
              <span class="album-caption">
                <small>{{ formatPublishedAt(album.publishedAt) }} · {{ album.photoCount }} 张</small>
                <strong>{{ album.title }}</strong>
                <span>{{ album.summary || '打开这本相册' }}</span>
              </span>
              <span class="memory-lens-glint" aria-hidden="true"></span>
            </a>
          </RouterLink>
        </div>

        <footer v-if="hasMore" class="load-more-row">
          <button type="button" :disabled="loading" @click="loadMore">
            {{ loading ? '读取中…' : '继续翻页' }}
          </button>
          <p v-if="error">下一页暂时没有读到，已经展示的相册不受影响。</p>
        </footer>
      </section>

      <template #right>
        <StickyCardStack>
          <aside class="life-side-card archive-note">
            <span class="eyebrow">A SMALL RULE</span>
            <h2>只展示真实发布</h2>
            <p>这里不会把头像、壁纸或示例图伪装成生活相册。没有内容时，空白也是准确的记录。</p>
          </aside>
          <RecommendedMusicCard />
        </StickyCardStack>
      </template>
    </ThreeColumnContentShell>
  </div>
</template>

<script setup>
import { reactive } from 'vue';
import { RouterLink } from 'vue-router';
import StickyCardStack from '../components/content/StickyCardStack.vue';
import RecommendedMusicCard from '../components/content/RecommendedMusicCard.vue';
import ThreeColumnContentShell from '../components/content/ThreeColumnContentShell.vue';
import { useMotionPreference } from '../composables/useMotionPreference';
import { useCursorResource } from '../composables/useCursorResource';
import {
  supportsNativeViewTransitions,
  useViewTransitionNavigation
} from '../composables/useViewTransitionNavigation';
import { getAlbumsPage } from '../services/lifeContentApi';

const { effectiveMode } = useMotionPreference();
const nativeViewTransitionsSupported = supportsNativeViewTransitions();
const transitionNavigation = useViewTransitionNavigation();
const failedMediaRefs = reactive(new Set());
const albumFeed = useCursorResource(
  ({ cursor, signal }) => getAlbumsPage({ cursor, limit: 12, signal }),
  { immediate: true, keyOf: (album) => album.publicSlug }
);
const { items, loading, error, hasMore, refresh, loadMore } = albumFeed;

function visibleCover(cover) {
  return Boolean(cover?.preview?.url && !failedMediaRefs.has(cover.mediaRef));
}

function hideFailedMedia(mediaRef) {
  if (mediaRef) failedMediaRefs.add(mediaRef);
}

function formatPublishedAt(value) {
  const parsed = new Date(value || '');
  if (Number.isNaN(parsed.getTime())) return '最近发布';
  return new Intl.DateTimeFormat('zh-CN', { year: 'numeric', month: 'short' }).format(parsed);
}

function openAlbum(event, album) {
  return transitionNavigation.navigate(
    `/albums/${encodeURIComponent(album.publicSlug)}`,
    { sourceElement: event.currentTarget, sharedName: album.publicSlug }
  );
}

function loadFirstPage() {
  return refresh('retry');
}
</script>

<style scoped>
.life-index-page {
  min-height: 100%;
  padding: clamp(20px, 3vw, 42px) clamp(4px, 1.5vw, 18px) 80px;
  color: var(--theme-text-primary);
}

.life-index-page.view-transition-fallback[data-motion-mode='immersive'] {
  animation: life-route-fallback-enter 240ms cubic-bezier(0.2, 0.8, 0.2, 1) both;
}

.life-index-page.view-transition-fallback[data-motion-mode='soothing'] {
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

.life-main-flow {
  min-width: 0;
}

.life-mobile-music {
  display: none;
}

@media (max-width: 899.98px) {
  .life-mobile-music {
    display: block;
    margin-bottom: 20px;
  }
}

.life-page-hero {
  margin-bottom: 24px;
  padding: clamp(22px, 4vw, 42px);
  border-bottom: 1px solid var(--theme-border-subtle);
}

.eyebrow {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  font-weight: 760;
  letter-spacing: 0.17em;
}

.life-page-hero h1 {
  margin: 6px 0 8px;
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  font-size: clamp(34px, 5vw, 64px);
  font-weight: 650;
  letter-spacing: 0.08em;
}

.life-page-hero p,
.life-side-card p,
.life-state p {
  color: var(--theme-text-secondary);
  line-height: 1.7;
}

.life-page-hero p {
  margin: 0;
}

.life-side-card,
.life-state {
  border: 1px solid var(--theme-border-subtle);
  color: var(--theme-text-primary);
  background: color-mix(in srgb, var(--theme-panel-surface) 90%, transparent);
  box-shadow: var(--theme-shadow-soft);
}

.life-side-card {
  padding: 20px;
  border-radius: 22px;
}

.life-side-card h2 {
  margin: 7px 0 9px;
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: 19px;
}

.life-side-card p {
  margin: 0;
  font-size: 13px;
}

.archive-index nav {
  display: grid;
  gap: 6px;
  margin-top: 18px;
}

.archive-index a {
  min-height: 40px;
  padding: 0 12px;
  border-radius: 12px;
  display: flex;
  align-items: center;
  color: var(--theme-text-secondary);
  text-decoration: none;
}

.archive-index a:hover,
.archive-index a.active {
  color: var(--theme-text-primary);
  background: rgba(var(--accent-rgb), 0.16);
}

.album-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: clamp(14px, 2vw, 22px);
}

.album-card {
  position: relative;
  min-width: 0;
  padding: 10px 10px 18px;
  border: 1px solid color-mix(in srgb, var(--theme-border-strong) 74%, transparent);
  border-radius: 9px 9px 18px 18px;
  color: inherit;
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 94%, transparent);
  box-shadow: 0 16px 36px rgba(12, 8, 18, 0.17);
  text-decoration: none;
  transform: rotate(calc((var(--album-order) - 0.5) * 0.35deg));
  transition: transform 260ms cubic-bezier(0.2, 0.8, 0.2, 1), border-color 180ms ease, box-shadow 180ms ease;
}

.album-card > *:not(.album-stack) {
  position: relative;
  z-index: 2;
}

.album-stack,
.album-stack-layer {
  position: absolute;
  inset: 7px 12px 84px;
  border: 1px solid color-mix(in srgb, var(--theme-border-strong) 76%, transparent);
  border-radius: 7px;
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 96%, transparent);
  pointer-events: none;
}

.album-stack {
  z-index: 0;
  inset: 0;
  border: 0;
  background: transparent;
}

.album-stack-layer.layer-back {
  transform: translate(7px, -5px) rotate(2.2deg);
}

.album-stack-layer.layer-middle {
  transform: translate(-6px, -3px) rotate(-1.7deg);
}

.memory-lens-glint {
  position: absolute !important;
  z-index: 3 !important;
  inset: 9px 9px auto;
  height: 42%;
  border-radius: 6px 6px 46% 46%;
  opacity: 0;
  pointer-events: none;
  background: linear-gradient(120deg, transparent 18%, rgba(255, 255, 255, 0.18) 46%, transparent 72%);
  transform: translateX(-36%);
  transition: opacity 180ms ease, transform 360ms ease;
}

[data-motion-mode='immersive'] .album-card:hover,
[data-motion-mode='immersive'] .album-card:focus-visible {
  border-color: rgba(var(--accent-rgb), 0.48);
  box-shadow: 0 24px 48px rgba(12, 8, 18, 0.24), 0 0 0 1px rgba(var(--accent-rgb), 0.16);
  transform: translateY(-7px) rotate(0deg);
}

[data-motion-mode='immersive'] .album-card:hover .layer-back,
[data-motion-mode='immersive'] .album-card:focus-visible .layer-back {
  transform: translate(13px, -10px) rotate(4deg);
}

[data-motion-mode='immersive'] .album-card:hover .layer-middle,
[data-motion-mode='immersive'] .album-card:focus-visible .layer-middle {
  transform: translate(-12px, -7px) rotate(-3deg);
}

[data-motion-mode='immersive'] .album-card:hover .memory-lens-glint,
[data-motion-mode='immersive'] .album-card:focus-visible .memory-lens-glint {
  opacity: 1;
  transform: translateX(30%);
}

.album-stack-layer {
  transition: transform 280ms cubic-bezier(0.2, 0.8, 0.2, 1);
}

[data-motion-mode='soothing'] .album-card {
  transform: none;
  transition: border-color 150ms ease, box-shadow 150ms ease;
}

[data-motion-mode='soothing'] .album-stack-layer {
  transform: none;
  transition: none;
}

[data-motion-mode='soothing'] .memory-lens-glint {
  display: none;
}

.album-card:focus-visible,
.load-more-row button:focus-visible,
.life-state button:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.album-cover,
.album-cover-empty {
  aspect-ratio: 4 / 3;
  border-radius: 5px;
  overflow: hidden;
  display: grid;
  place-items: center;
  color: var(--theme-text-tertiary);
  background: color-mix(in srgb, var(--theme-panel-surface) 86%, transparent);
}

.album-cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.album-cover-empty i {
  font-size: 28px;
}

.album-caption {
  min-width: 0;
  display: flex;
  flex-direction: column;
  gap: 4px;
  padding: 14px 6px 0;
}

.album-caption small,
.album-caption span {
  color: var(--theme-text-tertiary);
  font-size: 11px;
  line-height: 1.45;
}

.album-caption strong {
  overflow: hidden;
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
  font-size: 18px;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.life-state {
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

.life-state i {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 30px;
}

.life-state h2 {
  margin: 14px 0 0;
  font-family: var(--font-display, 'Zen Maru Gothic', sans-serif);
}

.life-state button,
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
  padding: 26px 0 0;
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

@media (max-width: 1090px) {
  .album-grid {
    grid-template-columns: 1fr;
  }
}

@media (max-width: 899.98px) {
  .life-index-page {
    padding-top: 12px;
  }

  .album-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}

@media (max-width: 560px) {
  .album-grid {
    grid-template-columns: 1fr;
  }
}
</style>
