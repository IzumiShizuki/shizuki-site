<template>
  <Teleport to="body">
    <Transition name="media-lightbox">
      <div
        v-if="modelValue"
        ref="overlayRef"
        class="media-lightbox"
        :class="`motion-${effectiveMode}`"
        role="dialog"
        aria-modal="true"
        :aria-labelledby="captionId"
        tabindex="-1"
        @keydown="handleKeydown"
        @pointerdown.self="close('backdrop')"
      >
        <header class="media-lightbox-toolbar">
          <span aria-live="polite">{{ currentPositionLabel }}</span>
          <button ref="closeButtonRef" type="button" aria-label="关闭照片" @click="close('button')">
            <i class="fas fa-xmark" aria-hidden="true"></i>
          </button>
        </header>

        <button
          v-if="canMovePrevious"
          type="button"
          class="media-lightbox-nav previous"
          aria-label="上一张照片"
          @click="move(-1)"
        >
          <i class="fas fa-chevron-left" aria-hidden="true"></i>
        </button>

        <figure
          class="media-lightbox-stage"
          @pointerdown="beginSwipe"
          @pointerup="finishSwipe"
          @pointercancel="cancelSwipe"
        >
          <div v-if="protectedMedia.loading.value" class="media-lightbox-unavailable" role="status">
            <i class="fas fa-circle-notch fa-spin" aria-hidden="true"></i>
            <p>正在安全读取照片……</p>
          </div>
          <picture v-else-if="activeSource && !imageFailed">
            <source v-if="currentItem?.avifSrc" :srcset="currentItem.avifSrc" type="image/avif" />
            <img
              :key="currentItem.key || activeSource"
              :src="activeSource"
              :alt="currentItem.alt || currentItem.title || '照片'"
              :width="currentItem.width || undefined"
              :height="currentItem.height || undefined"
              @error="imageFailed = true"
            />
          </picture>
          <div v-else class="media-lightbox-unavailable" role="status">
            <i class="far fa-image" aria-hidden="true"></i>
            <p>这张照片暂时无法显示</p>
          </div>
          <figcaption :id="captionId">
            <strong v-if="currentItem?.title">{{ currentItem.title }}</strong>
            <span v-if="currentItem?.caption">{{ currentItem.caption }}</span>
            <small v-if="currentItem?.locationLabel">
              <i class="fas fa-location-dot" aria-hidden="true"></i>
              {{ currentItem.locationLabel }}
            </small>
          </figcaption>
        </figure>

        <button
          v-if="canMoveNext"
          type="button"
          class="media-lightbox-nav next"
          aria-label="下一张照片"
          @click="move(1)"
        >
          <i class="fas fa-chevron-right" aria-hidden="true"></i>
        </button>
      </div>
    </Transition>
  </Teleport>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, ref, watch } from 'vue';
import { useMotionPreference } from '../../composables/useMotionPreference';
import { useProtectedMediaUrl } from '../../composables/useProtectedMediaUrl';

const props = defineProps({
  modelValue: {
    type: Boolean,
    default: false
  },
  items: {
    type: Array,
    default: () => []
  },
  startIndex: {
    type: Number,
    default: 0
  },
  resolveProtectedVariant: {
    type: Function,
    default: null
  }
});

const emit = defineEmits(['update:modelValue', 'update:index', 'close']);
const { effectiveMode } = useMotionPreference();
const overlayRef = ref(null);
const closeButtonRef = ref(null);
const currentIndex = ref(0);
const imageFailed = ref(false);
const captionId = `media-lightbox-caption-${Math.random().toString(36).slice(2, 9)}`;
let returnFocus = null;
let lockedScrollElement = null;
let lockedScrollTop = 0;
let previousScrollOverflow = '';
let previousBodyOverflow = '';
let pageLocked = false;
let swipeStart = null;

const currentItem = computed(() => props.items[currentIndex.value] || null);
const protectedMedia = useProtectedMediaUrl(async (context) => {
  const item = currentItem.value;
  if (!item?.protectedVariant) throw new TypeError('Protected display variant is unavailable');
  if (!context.refreshPresentation) return item.protectedVariant;
  if (typeof props.resolveProtectedVariant !== 'function') {
    throw new TypeError('Protected media presentation cannot be refreshed');
  }
  return props.resolveProtectedVariant(item, context);
});
const activeSource = computed(() => currentItem.value?.src || protectedMedia.url.value || '');
const currentPositionLabel = computed(() => (
  props.items.length ? `${currentIndex.value + 1} / ${props.items.length}` : '0 / 0'
));
const canMovePrevious = computed(() => currentIndex.value > 0);
const canMoveNext = computed(() => currentIndex.value < props.items.length - 1);

function clampIndex(value) {
  if (!props.items.length) return 0;
  return Math.min(props.items.length - 1, Math.max(0, Number(value) || 0));
}

function focusableElements() {
  if (!overlayRef.value) return [];
  return Array.from(overlayRef.value.querySelectorAll('button:not([disabled]), [tabindex]:not([tabindex="-1"])'))
    .filter((element) => element.tabIndex >= 0);
}

function lockPage() {
  if (pageLocked || typeof document === 'undefined') return;
  lockedScrollElement = document.querySelector('.route-content.route-content-app-scroll')
    || document.querySelector('.route-content');
  lockedScrollTop = Number(lockedScrollElement?.scrollTop) || 0;
  previousScrollOverflow = lockedScrollElement?.style?.overflow || '';
  previousBodyOverflow = document.body.style.overflow;
  if (lockedScrollElement?.style) lockedScrollElement.style.overflow = 'hidden';
  document.body.style.overflow = 'hidden';
  pageLocked = true;
}

function restorePage() {
  if (!pageLocked || typeof document === 'undefined') return;
  if (lockedScrollElement?.style) {
    lockedScrollElement.style.overflow = previousScrollOverflow;
    lockedScrollElement.scrollTop = lockedScrollTop;
  }
  document.body.style.overflow = previousBodyOverflow;
  lockedScrollElement = null;
  pageLocked = false;
  if (returnFocus?.isConnected) returnFocus.focus({ preventScroll: true });
  returnFocus = null;
}

function close(reason) {
  emit('update:modelValue', false);
  emit('close', reason);
}

async function prepareCurrentItem(reason = 'photo-change') {
  protectedMedia.dispose();
  imageFailed.value = false;
  if (!props.modelValue || currentItem.value?.src || !currentItem.value?.protectedVariant) return;
  await protectedMedia.refresh(reason);
}

function move(offset) {
  const nextIndex = clampIndex(currentIndex.value + offset);
  if (nextIndex === currentIndex.value) return;
  currentIndex.value = nextIndex;
  emit('update:index', nextIndex);
  void prepareCurrentItem('navigate');
}

function handleKeydown(event) {
  if (event.key === 'Escape') {
    event.preventDefault();
    close('escape');
    return;
  }
  if (event.key === 'ArrowLeft') {
    event.preventDefault();
    move(-1);
    return;
  }
  if (event.key === 'ArrowRight') {
    event.preventDefault();
    move(1);
    return;
  }
  if (event.key !== 'Tab') return;
  const focusable = focusableElements();
  if (!focusable.length) {
    event.preventDefault();
    overlayRef.value?.focus();
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

function beginSwipe(event) {
  if (!event.isPrimary) return;
  swipeStart = { id: event.pointerId, x: event.clientX, y: event.clientY };
}

function finishSwipe(event) {
  if (!swipeStart || swipeStart.id !== event.pointerId) return;
  const deltaX = event.clientX - swipeStart.x;
  const deltaY = event.clientY - swipeStart.y;
  swipeStart = null;
  if (Math.abs(deltaX) < 52 || Math.abs(deltaX) <= Math.abs(deltaY)) return;
  move(deltaX < 0 ? 1 : -1);
}

function cancelSwipe() {
  swipeStart = null;
}

watch(
  () => props.modelValue,
  async (open) => {
    if (open) {
      returnFocus = document.activeElement;
      currentIndex.value = clampIndex(props.startIndex);
      imageFailed.value = false;
      lockPage();
      await nextTick();
      closeButtonRef.value?.focus();
      await prepareCurrentItem('open');
    } else {
      protectedMedia.dispose();
      restorePage();
    }
  },
  { immediate: true }
);

watch(() => props.startIndex, (value) => {
  if (!props.modelValue) return;
  currentIndex.value = clampIndex(value);
  void prepareCurrentItem('start-index');
});

watch(() => props.items.length, () => {
  currentIndex.value = clampIndex(currentIndex.value);
  void prepareCurrentItem('items-change');
});

onBeforeUnmount(restorePage);
</script>

<style scoped>
.media-lightbox {
  position: fixed;
  z-index: 1400;
  inset: 0;
  display: grid;
  grid-template-columns: minmax(56px, 90px) minmax(0, 1fr) minmax(56px, 90px);
  grid-template-rows: auto minmax(0, 1fr);
  align-items: center;
  color: rgba(255, 252, 248, 0.96);
  background: rgba(10, 8, 13, 0.94);
  backdrop-filter: blur(16px) saturate(0.82);
}

.media-lightbox-toolbar {
  grid-column: 1 / -1;
  min-height: 64px;
  padding: max(10px, env(safe-area-inset-top)) max(16px, env(safe-area-inset-right)) 8px max(16px, env(safe-area-inset-left));
  display: flex;
  align-items: center;
  justify-content: flex-end;
  gap: 16px;
  color: rgba(235, 224, 218, 0.74);
  font-size: 12px;
}

.media-lightbox-toolbar button,
.media-lightbox-nav {
  width: 48px;
  min-height: 48px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  border-radius: 50%;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  color: inherit;
  background: rgba(255, 255, 255, 0.08);
  font: inherit;
  cursor: pointer;
  touch-action: manipulation;
}

.media-lightbox-nav {
  justify-self: center;
  color: rgba(255, 252, 248, 0.92);
}

.media-lightbox-nav.previous {
  grid-column: 1;
}

.media-lightbox-nav.next {
  grid-column: 3;
}

.media-lightbox-stage {
  grid-column: 2;
  grid-row: 2;
  min-width: 0;
  min-height: 0;
  max-width: min(1120px, 100%);
  max-height: calc(100dvh - 76px);
  margin: 0 auto;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  touch-action: pan-y;
}

.media-lightbox-stage picture {
  max-width: 100%;
  max-height: calc(100dvh - 158px);
  display: contents;
}

.media-lightbox-stage img {
  max-width: 100%;
  max-height: calc(100dvh - 158px);
  border-radius: 12px;
  display: block;
  object-fit: contain;
  box-shadow: 0 30px 90px rgba(0, 0, 0, 0.44);
}

.media-lightbox-stage figcaption {
  width: min(720px, 100%);
  min-height: 60px;
  padding: 14px 10px 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 4px;
  text-align: center;
}

.media-lightbox-stage figcaption span,
.media-lightbox-stage figcaption small {
  color: rgba(235, 224, 218, 0.7);
  font-size: 12px;
  line-height: 1.5;
}

.media-lightbox-unavailable {
  width: min(680px, 100%);
  min-height: min(58vh, 520px);
  border: 1px dashed rgba(255, 255, 255, 0.18);
  border-radius: 18px;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 10px;
  color: rgba(235, 224, 218, 0.66);
}

.media-lightbox button:focus-visible,
.media-lightbox:focus-visible {
  outline: 3px solid rgba(var(--accent-rgb), 0.86);
  outline-offset: 3px;
}

.media-lightbox-enter-active,
.media-lightbox-leave-active {
  transition: opacity 220ms ease;
}

.media-lightbox-enter-active .media-lightbox-stage,
.media-lightbox-leave-active .media-lightbox-stage {
  transition: transform 300ms cubic-bezier(0.2, 0.8, 0.2, 1), opacity 180ms ease;
}

.media-lightbox-enter-from,
.media-lightbox-leave-to {
  opacity: 0;
}

.media-lightbox-enter-from .media-lightbox-stage,
.media-lightbox-leave-to .media-lightbox-stage {
  opacity: 0;
  transform: scale(0.97);
}

.media-lightbox.motion-soothing .media-lightbox-stage {
  transform: none;
  transition: opacity 140ms ease;
}

@media (max-width: 700px) {
  .media-lightbox {
    grid-template-columns: 52px minmax(0, 1fr) 52px;
  }

  .media-lightbox-toolbar button,
  .media-lightbox-nav {
    width: 44px;
    min-height: 44px;
  }

  .media-lightbox-stage img {
    max-height: calc(100dvh - 190px);
  }
}
</style>
