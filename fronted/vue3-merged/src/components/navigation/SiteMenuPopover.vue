<template>
  <Teleport to="body" :disabled="!mobile">
    <div
      v-if="mobile"
      ref="backdropRef"
      class="site-menu-backdrop"
      :class="{ open }"
      :aria-hidden="open ? 'false' : 'true'"
      @pointerdown.self="requestClose('backdrop')"
    ></div>
    <LiquidSurface
      :id="popoverId"
      ref="panelRef"
      as="section"
      class="site-menu-popover"
      :class="{ open, 'mobile-drawer': mobile, 'mode-soothing': effectiveMode === 'soothing' }"
      :data-anchor-mode="anchorMode"
      :aria-hidden="open ? 'false' : 'true'"
      :aria-modal="mobile && open ? 'true' : undefined"
      aria-label="Site 个人内容"
      role="dialog"
      tabindex="-1"
      variant="lens"
      @keydown="handlePanelKeydown"
    >
    <header class="site-menu-heading">
      <div>
        <span class="site-menu-kicker">SHIZUKI · PERSONAL ARCHIVE</span>
        <h2>生活侧页</h2>
      </div>
      <p>关于我、相册与近况，都从这里展开。</p>
      <button
        v-if="mobile"
        type="button"
        class="mobile-drawer-close"
        aria-label="关闭生活抽屉"
        :tabindex="open ? 0 : -1"
        @click="requestClose('button')"
      >
        <i class="fas fa-xmark" aria-hidden="true"></i>
      </button>
    </header>

    <div class="site-menu-grid" @keydown="handleGridKeydown">
      <nav class="site-destinations" aria-label="个人内容页面">
        <button
          v-for="item in destinations"
          :key="item.key"
          :ref="(element) => setDestinationRef(item.key, element)"
          type="button"
          class="site-destination"
          :class="{ active: activeDestination === item.key }"
          :aria-current="activeDestination === item.key ? 'page' : undefined"
          :tabindex="open ? 0 : -1"
          @click="selectDestination(item.key)"
        >
          <span class="destination-icon" aria-hidden="true"><i :class="item.icon"></i></span>
          <span class="destination-copy">
            <strong>{{ item.label }}</strong>
            <small>{{ item.description }}</small>
          </span>
          <i class="fas fa-arrow-right destination-arrow" aria-hidden="true"></i>
        </button>
      </nav>

      <section class="site-preview-column" aria-labelledby="site-menu-albums-title">
        <header class="preview-heading">
          <div>
            <span>ALBUMS</span>
            <h3 id="site-menu-albums-title">最近相册</h3>
          </div>
          <button type="button" :tabindex="open ? 0 : -1" @click="selectDestination('albums')">全部</button>
        </header>

        <div v-if="albumsState.loading" class="preview-loading" role="status" aria-label="正在读取相册">
          <span></span><span></span>
        </div>
        <div v-else-if="albumsState.error" class="preview-message" data-testid="albums-error">
          <i class="far fa-circle-xmark" aria-hidden="true"></i>
          <p>最近相册暂时没有读到。</p>
          <button type="button" :tabindex="open ? 0 : -1" @click="loadAlbums(true)">重试</button>
        </div>
        <div v-else-if="albumsState.items.length === 0" class="preview-message" data-testid="albums-empty">
          <i class="far fa-images" aria-hidden="true"></i>
          <p>内容正在整理</p>
          <small>这里不会用头像或壁纸代替相册。</small>
        </div>
        <div v-else class="preview-list" data-testid="album-previews">
          <button
            v-for="album in albumsState.items"
            :key="album.publicSlug"
            type="button"
            class="content-preview"
            :tabindex="open ? 0 : -1"
            @click="selectAlbum(album.publicSlug)"
          >
            <span v-if="visibleCover(album.cover)" class="content-preview-media">
              <img
                :src="album.cover.preview.url"
                :alt="album.cover.altText || album.title"
                :width="album.cover.preview.width"
                :height="album.cover.preview.height"
                @error="hideFailedMedia(album.cover.mediaRef)"
              />
            </span>
            <span v-else class="content-preview-no-media" aria-hidden="true"><i class="far fa-images"></i></span>
            <span class="content-preview-copy">
              <strong>{{ album.title }}</strong>
              <small>{{ album.photoCount }} 张照片</small>
            </span>
          </button>
        </div>
      </section>

      <section class="site-preview-column" aria-labelledby="site-menu-moments-title">
        <header class="preview-heading">
          <div>
            <span>MOMENTS</span>
            <h3 id="site-menu-moments-title">最近动态</h3>
          </div>
          <button type="button" :tabindex="open ? 0 : -1" @click="selectDestination('moments')">全部</button>
        </header>

        <div v-if="momentsState.loading" class="preview-loading" role="status" aria-label="正在读取动态">
          <span></span><span></span>
        </div>
        <div v-else-if="momentsState.error" class="preview-message" data-testid="moments-error">
          <i class="far fa-circle-xmark" aria-hidden="true"></i>
          <p>最近动态暂时没有读到。</p>
          <button type="button" :tabindex="open ? 0 : -1" @click="loadMoments(true)">重试</button>
        </div>
        <div v-else-if="momentsState.items.length === 0" class="preview-message" data-testid="moments-empty">
          <i class="far fa-comment-dots" aria-hidden="true"></i>
          <p>内容正在整理</p>
          <small>第一条真实动态发布后会出现在这里。</small>
        </div>
        <div v-else class="preview-list" data-testid="moment-previews">
          <button
            v-for="moment in momentsState.items"
            :key="moment.publicId"
            type="button"
            class="content-preview moment-preview"
            :class="{ 'without-media': !visibleCover(moment.cover) }"
            :tabindex="open ? 0 : -1"
            @click="selectMoment(moment.publicId)"
          >
            <span v-if="visibleCover(moment.cover)" class="content-preview-media">
              <img
                :src="moment.cover.preview.url"
                :alt="moment.cover.altText || '动态配图'"
                :width="moment.cover.preview.width"
                :height="moment.cover.preview.height"
                @error="hideFailedMedia(moment.cover.mediaRef)"
              />
            </span>
            <span class="content-preview-copy">
              <strong>{{ momentExcerpt(moment.body) }}</strong>
              <small>{{ formatPublishedAt(moment.publishedAt) }}</small>
            </span>
          </button>
        </div>
      </section>
    </div>
    </LiquidSurface>
  </Teleport>
</template>

<script setup>
import { nextTick, onBeforeUnmount, reactive, ref, watch } from 'vue';
import { useMotionPreference } from '../../composables/useMotionPreference';
import { getFeaturedAlbums, getFeaturedMoments } from '../../services/lifeContentApi';
import LiquidSurface from '../material/LiquidSurface.vue';

const props = defineProps({
  open: {
    type: Boolean,
    default: false
  },
  activeDestination: {
    type: String,
    default: ''
  },
  anchorMode: {
    type: String,
    default: 'full',
    validator: (value) => ['full', 'compact'].includes(value)
  },
  popoverId: {
    type: String,
    default: 'site-personal-menu'
  },
  mobile: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits(['select', 'request-close']);
const { effectiveMode } = useMotionPreference();
const destinationRefs = new Map();
const failedMediaRefs = reactive(new Set());
const albumsState = reactive({ loading: false, error: false, items: [], loadedAt: 0 });
const momentsState = reactive({ loading: false, error: false, items: [], loadedAt: 0 });
const albumsController = ref(null);
const momentsController = ref(null);
const panelRef = ref(null);
const backdropRef = ref(null);
let lockedScrollElement = null;
let lockedScrollTop = 0;
let previousScrollOverflow = '';
let previousBodyOverflow = '';
let pageLocked = false;

const destinations = Object.freeze([
  { key: 'about', label: 'About', description: '关于我与这个站点', icon: 'far fa-user' },
  { key: 'albums', label: 'Albums', description: '按记忆整理的照片', icon: 'far fa-images' },
  { key: 'moments', label: 'Moments', description: '生活里短一些的记录', icon: 'far fa-comment-dots' }
]);

function setDestinationRef(key, element) {
  if (element) destinationRefs.set(key, element);
  else destinationRefs.delete(key);
}

function selectDestination(destination) {
  emit('select', { destination });
}

function selectAlbum(publicSlug) {
  emit('select', { destination: 'album-detail', publicSlug });
}

function selectMoment(publicId) {
  emit('select', { destination: 'moments', publicId });
}

function visibleCover(cover) {
  return Boolean(cover?.preview?.url && !failedMediaRefs.has(cover.mediaRef));
}

function hideFailedMedia(mediaRef) {
  if (mediaRef) failedMediaRefs.add(mediaRef);
}

function momentExcerpt(body) {
  const value = String(body || '').trim();
  return value.length > 52 ? `${value.slice(0, 52)}…` : value;
}

function formatPublishedAt(value) {
  if (!value) return '最近发布';
  const parsed = new Date(value);
  if (Number.isNaN(parsed.getTime())) return '最近发布';
  return new Intl.DateTimeFormat('zh-CN', { month: 'short', day: 'numeric' }).format(parsed);
}

async function loadAlbums(force = false) {
  if (albumsState.loading || (!force && albumsState.loadedAt > 0)) return;
  albumsController.value?.abort();
  const controller = new AbortController();
  albumsController.value = controller;
  albumsState.loading = true;
  albumsState.error = false;
  try {
    albumsState.items = await getFeaturedAlbums(2, controller.signal);
    albumsState.loadedAt = Date.now();
  } catch (error) {
    if (controller.signal.aborted) return;
    albumsState.error = true;
  } finally {
    if (albumsController.value === controller) {
      albumsState.loading = false;
      albumsController.value = null;
    }
  }
}

async function loadMoments(force = false) {
  if (momentsState.loading || (!force && momentsState.loadedAt > 0)) return;
  momentsController.value?.abort();
  const controller = new AbortController();
  momentsController.value = controller;
  momentsState.loading = true;
  momentsState.error = false;
  try {
    momentsState.items = await getFeaturedMoments(2, controller.signal);
    momentsState.loadedAt = Date.now();
  } catch (error) {
    if (controller.signal.aborted) return;
    momentsState.error = true;
  } finally {
    if (momentsController.value === controller) {
      momentsState.loading = false;
      momentsController.value = null;
    }
  }
}

async function focusFirst() {
  await nextTick();
  destinationRefs.get('about')?.focus?.();
}

function focusableElements() {
  const root = panelRef.value?.$el || panelRef.value;
  if (!root?.querySelectorAll) return [];
  return Array.from(root.querySelectorAll(
    'button:not([disabled]), a[href], [tabindex]:not([tabindex="-1"])'
  )).filter((element) => element.tabIndex >= 0 && !element.hasAttribute('hidden'));
}

function requestClose(reason) {
  emit('request-close', reason);
}

function handlePanelKeydown(event) {
  if (event.key === 'Escape') {
    event.preventDefault();
    requestClose('escape');
    return;
  }
  if (!props.mobile || event.key !== 'Tab') return;
  const focusable = focusableElements();
  if (!focusable.length) {
    event.preventDefault();
    (panelRef.value?.$el || panelRef.value)?.focus?.();
    return;
  }
  const first = focusable[0];
  const last = focusable.at(-1);
  if (event.shiftKey && document.activeElement === first) {
    event.preventDefault();
    last.focus();
  } else if (!event.shiftKey && document.activeElement === last) {
    event.preventDefault();
    first.focus();
  }
}

function lockMobilePage() {
  if (pageLocked || typeof document === 'undefined') return;
  lockedScrollElement = document.querySelector('.route-content.route-content-app-scroll')
    || document.querySelector('.route-content');
  lockedScrollTop = Number(lockedScrollElement?.scrollTop) || 0;
  previousScrollOverflow = lockedScrollElement?.style?.overflow || '';
  previousBodyOverflow = document.body.style.overflow;
  if (lockedScrollElement?.style) lockedScrollElement.style.overflow = 'hidden';
  document.body.style.overflow = 'hidden';
  document.documentElement.classList.add('site-life-drawer-open');
  pageLocked = true;
}

function restoreMobilePage() {
  if (!pageLocked || typeof document === 'undefined') return;
  if (lockedScrollElement?.style) {
    lockedScrollElement.style.overflow = previousScrollOverflow;
    lockedScrollElement.scrollTop = lockedScrollTop;
  }
  document.body.style.overflow = previousBodyOverflow;
  document.documentElement.classList.remove('site-life-drawer-open');
  lockedScrollElement = null;
  pageLocked = false;
}

function containsTarget(target) {
  const panel = panelRef.value?.$el || panelRef.value;
  return Boolean(panel?.contains?.(target) || backdropRef.value?.contains?.(target));
}

function handleGridKeydown(event) {
  if (!['ArrowDown', 'ArrowUp', 'ArrowLeft', 'ArrowRight', 'Home', 'End'].includes(event.key)) return;
  const root = event.currentTarget;
  const focusable = Array.from(root.querySelectorAll('button:not([disabled])')).filter((element) => element.tabIndex >= 0);
  const currentIndex = focusable.indexOf(document.activeElement);
  if (currentIndex < 0) return;
  event.preventDefault();
  let nextIndex = currentIndex;
  if (event.key === 'Home') nextIndex = 0;
  else if (event.key === 'End') nextIndex = focusable.length - 1;
  else if (event.key === 'ArrowDown' || event.key === 'ArrowRight') nextIndex = (currentIndex + 1) % focusable.length;
  else nextIndex = (currentIndex - 1 + focusable.length) % focusable.length;
  focusable[nextIndex]?.focus();
}

watch(
  () => props.open,
  (open) => {
    if (!open) return;
    void Promise.allSettled([loadAlbums(), loadMoments()]);
  },
  { immediate: true }
);

watch(
  () => [props.open, props.mobile],
  ([open, mobile]) => {
    if (open && mobile) lockMobilePage();
    else restoreMobilePage();
  },
  { immediate: true }
);

onBeforeUnmount(() => {
  albumsController.value?.abort();
  momentsController.value?.abort();
  restoreMobilePage();
});

defineExpose({ focusFirst, loadAlbums, loadMoments, containsTarget });
</script>

<style scoped>
.site-menu-popover {
  --liquid-fill: color-mix(in srgb, var(--theme-panel-surface-elevated) 94%, transparent);
  --liquid-border: color-mix(in srgb, var(--theme-border-strong) 80%, rgba(var(--accent-rgb), 0.22));
  --liquid-shadow: 0 28px 72px rgba(14, 8, 16, 0.34), 0 8px 24px rgba(var(--accent-rgb), 0.08);
  position: absolute;
  top: 100px;
  left: 50%;
  width: min(900px, calc(100vw - 36px));
  padding: 20px;
  border-radius: 28px;
  color: var(--theme-text-primary);
  opacity: 0;
  visibility: hidden;
  pointer-events: none;
  transform: translate(-50%, -10px) scale(0.985);
  transform-origin: 50% 0;
  transition: opacity 180ms ease, visibility 180ms ease, transform 360ms cubic-bezier(0.2, 0.8, 0.2, 1);
  z-index: 6;
}

.site-menu-backdrop {
  position: fixed;
  z-index: 1090;
  inset: 0;
  visibility: hidden;
  opacity: 0;
  pointer-events: none;
  background: var(--theme-scrim, rgba(12, 8, 18, 0.62));
  backdrop-filter: blur(5px);
  transition: opacity 180ms ease, visibility 180ms ease;
}

.site-menu-backdrop.open {
  visibility: visible;
  opacity: 1;
  pointer-events: auto;
}

.site-menu-popover[data-anchor-mode='compact'] {
  top: 66px;
}

.site-menu-popover.open {
  opacity: 1;
  visibility: visible;
  pointer-events: auto;
  transform: translate(-50%, 0) scale(1);
}

.site-menu-popover.mode-soothing {
  transition: opacity 150ms ease, visibility 150ms ease, transform 150ms ease;
}

.site-menu-popover.mode-soothing:not(.open) {
  transform: translate(-50%, -3px);
}

.site-menu-heading {
  display: flex;
  align-items: end;
  justify-content: space-between;
  gap: 24px;
  padding: 0 2px 16px;
  border-bottom: 1px solid var(--theme-border-subtle, rgba(255, 255, 255, 0.14));
}

.site-menu-heading h2,
.preview-heading h3 {
  margin: 0;
  font-family: var(--font-display, 'Zen Maru Gothic', 'LXGW WenKai', sans-serif);
  color: var(--theme-text-primary);
}

.site-menu-heading h2 {
  margin-top: 4px;
  font-size: 24px;
  letter-spacing: 0.04em;
}

.site-menu-heading p {
  max-width: 320px;
  margin: 0;
  color: var(--theme-text-secondary);
  font-size: 13px;
  line-height: 1.55;
  text-align: right;
}

.mobile-drawer-close {
  display: none;
}

.site-menu-kicker,
.preview-heading span {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 10px;
  font-weight: 750;
  letter-spacing: 0.16em;
}

.site-menu-grid {
  display: grid;
  grid-template-columns: minmax(210px, 0.92fr) repeat(2, minmax(0, 1fr));
  gap: 14px;
  padding-top: 16px;
}

.site-destinations,
.site-preview-column {
  min-width: 0;
}

.site-destinations {
  display: flex;
  flex-direction: column;
  gap: 8px;
  padding-right: 14px;
  border-right: 1px solid var(--theme-border-subtle, rgba(255, 255, 255, 0.13));
}

.site-destination,
.content-preview {
  width: 100%;
  border: 1px solid transparent;
  color: inherit;
  background: transparent;
  font: inherit;
  text-align: left;
  cursor: pointer;
}

.site-destination {
  min-height: 64px;
  padding: 8px 9px;
  border-radius: 17px;
  display: grid;
  grid-template-columns: 42px minmax(0, 1fr) 18px;
  align-items: center;
  gap: 10px;
  transition: background-color 160ms ease, border-color 160ms ease, box-shadow 160ms ease;
}

.site-destination:hover,
.site-destination.active {
  border-color: var(--menu-active-border, rgba(var(--accent-rgb), 0.35));
  background: color-mix(in srgb, var(--menu-active-bg, rgba(var(--accent-rgb), 0.18)) 72%, transparent);
}

.site-destination.active {
  box-shadow: inset 3px 0 0 rgb(var(--accent-strong-rgb));
}

.destination-icon {
  width: 42px;
  height: 42px;
  border-radius: 50%;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 78%, rgba(var(--accent-rgb), 0.18));
  box-shadow: inset 0 0 0 1px var(--theme-border-subtle);
}

.destination-copy {
  min-width: 0;
  display: flex;
  flex-direction: column;
  gap: 3px;
}

.destination-copy strong {
  font-size: 14px;
  letter-spacing: 0.025em;
}

.destination-copy small,
.content-preview-copy small,
.preview-message small {
  color: var(--theme-text-tertiary, var(--theme-text-secondary));
  font-size: 11px;
  line-height: 1.4;
}

.destination-arrow {
  color: var(--theme-text-tertiary);
  font-size: 10px;
}

.site-preview-column {
  padding: 0 2px;
}

.preview-heading {
  min-height: 42px;
  display: flex;
  align-items: start;
  justify-content: space-between;
  gap: 10px;
  margin-bottom: 8px;
}

.preview-heading h3 {
  margin-top: 2px;
  font-size: 15px;
}

.preview-heading button,
.preview-message button {
  border: 0;
  padding: 4px 6px;
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  background: transparent;
  font: inherit;
  font-size: 11px;
  cursor: pointer;
}

.preview-list {
  display: flex;
  flex-direction: column;
  gap: 8px;
}

.content-preview {
  min-height: 76px;
  padding: 7px;
  border-radius: 15px;
  display: grid;
  grid-template-columns: 62px minmax(0, 1fr);
  align-items: center;
  gap: 10px;
  border-color: var(--theme-border-subtle, rgba(255, 255, 255, 0.12));
  background: color-mix(in srgb, var(--theme-panel-surface) 82%, transparent);
  transition: border-color 160ms ease, background-color 160ms ease;
}

.content-preview:hover {
  border-color: var(--menu-active-border, rgba(var(--accent-rgb), 0.35));
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 88%, rgba(var(--accent-rgb), 0.08));
}

.content-preview-media,
.content-preview-no-media {
  width: 62px;
  height: 58px;
  border-radius: 11px;
  overflow: hidden;
  display: flex;
  align-items: center;
  justify-content: center;
  color: var(--theme-text-tertiary);
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 84%, transparent);
}

.content-preview-media img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.content-preview-copy {
  min-width: 0;
  display: flex;
  flex-direction: column;
  gap: 5px;
}

.content-preview-copy strong {
  display: -webkit-box;
  overflow: hidden;
  color: var(--theme-text-primary);
  font-size: 12px;
  font-weight: 650;
  line-height: 1.45;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
}

.moment-preview.without-media {
  grid-template-columns: 1fr;
}

.preview-loading,
.preview-message {
  min-height: 160px;
  border: 1px dashed var(--theme-border-subtle, rgba(255, 255, 255, 0.15));
  border-radius: 16px;
}

.preview-loading {
  padding: 12px;
  display: flex;
  flex-direction: column;
  gap: 10px;
}

.preview-loading span {
  height: 54px;
  border-radius: 12px;
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 84%, transparent);
  animation: preview-breathe 1.4s ease-in-out infinite alternate;
}

.preview-message {
  padding: 18px 14px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 7px;
  color: var(--theme-text-tertiary);
  text-align: center;
}

.preview-message i {
  color: rgb(var(--accent-readable-rgb, var(--accent-strong-rgb)));
  font-size: 19px;
}

.preview-message p {
  margin: 0;
  color: var(--theme-text-secondary);
  font-size: 12px;
}

.site-menu-popover button:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 2px;
}

@keyframes preview-breathe {
  from { opacity: 0.42; }
  to { opacity: 0.82; }
}

@media (max-width: 900px) {
  .site-menu-popover {
    width: min(680px, calc(100vw - 24px));
    max-height: calc(100dvh - 88px);
    overflow-y: auto;
    padding: 16px;
    border-radius: 22px;
  }

  .site-menu-grid {
    grid-template-columns: minmax(190px, 0.82fr) minmax(0, 1.18fr);
  }

  .site-preview-column:last-child {
    grid-column: 2;
  }
}

.site-menu-popover.mobile-drawer {
  position: fixed;
  z-index: 1100;
  top: auto;
  right: 0;
  bottom: 0;
  left: 0;
  width: min(100%, 720px);
  max-height: min(86dvh, 820px);
  margin-inline: auto;
  padding: 18px max(18px, env(safe-area-inset-right)) max(20px, env(safe-area-inset-bottom)) max(18px, env(safe-area-inset-left));
  overflow-y: auto;
  border-radius: 28px 28px 0 0;
  opacity: 0;
  visibility: hidden;
  transform: translateY(32px);
  transform-origin: 50% 100%;
}

.site-menu-popover.mobile-drawer.open {
  opacity: 1;
  visibility: visible;
  transform: translateY(0);
}

.site-menu-popover.mobile-drawer.mode-soothing:not(.open) {
  transform: translateY(4px);
}

.mobile-drawer .site-menu-heading {
  position: sticky;
  z-index: 2;
  top: -18px;
  align-items: center;
  margin: -4px 0 0;
  padding: 14px 2px 15px;
  background: color-mix(in srgb, var(--theme-panel-surface-elevated) 96%, transparent);
}

.mobile-drawer-close {
  flex: 0 0 auto;
  width: 44px;
  min-height: 44px;
  border: 1px solid var(--theme-border-strong);
  border-radius: 50%;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  color: var(--theme-text-primary);
  background: var(--theme-panel-surface);
  font: inherit;
  cursor: pointer;
}

.mobile-drawer .site-destination,
.mobile-drawer .preview-heading button,
.mobile-drawer .preview-message button,
.mobile-drawer .content-preview {
  min-height: 44px;
  touch-action: manipulation;
}

@media (max-width: 640px) {
  .site-menu-heading p {
    display: none;
  }

  .site-menu-grid {
    grid-template-columns: 1fr;
  }

  .site-destinations {
    padding-right: 0;
    padding-bottom: 12px;
    border-right: 0;
    border-bottom: 1px solid var(--theme-border-subtle);
  }

  .site-preview-column:last-child {
    grid-column: auto;
  }
}

@media (prefers-reduced-motion: reduce) {
  .preview-loading span {
    animation: none;
  }
}
</style>
