<template>
  <section class="presentation-page" :class="{ embedded }">
    <header class="presentation-toolbar liquid-material">
      <div class="presentation-toolbar-start">
        <button
          v-if="showBackButton"
          type="button"
          class="mini-btn ripple-trigger"
          @click="emit('back')"
        >
          返回文章
        </button>

        <div v-if="showPostLibrary" class="presentation-scope-toggle" role="tablist" aria-label="博客演示范围">
          <button
            type="button"
            class="scope-btn ripple-trigger"
            :class="{ active: currentScope === BLOG_PRESENTATION_SCOPE_PUBLIC }"
            :aria-selected="currentScope === BLOG_PRESENTATION_SCOPE_PUBLIC"
            @click="selectScope(BLOG_PRESENTATION_SCOPE_PUBLIC)"
          >
            公开文章
          </button>
          <button
            type="button"
            class="scope-btn ripple-trigger"
            :class="{ active: currentScope === BLOG_PRESENTATION_SCOPE_MINE }"
            :aria-selected="currentScope === BLOG_PRESENTATION_SCOPE_MINE"
            :disabled="!auth.isAuthenticated.value"
            @click="selectScope(BLOG_PRESENTATION_SCOPE_MINE)"
          >
            我的文章
          </button>
        </div>
      </div>

      <div class="presentation-toolbar-center">
        <h1>{{ presentationTitle }}</h1>
        <p>{{ statusText }}</p>
      </div>

      <div class="presentation-toolbar-actions">
        <button type="button" class="mini-btn ripple-trigger" :disabled="busyRefreshing" @click="refreshWorkspace">
          刷新
        </button>
        <button
          v-if="canGenerate"
          type="button"
          class="mini-btn ripple-trigger"
          :disabled="generating"
          @click="generatePresentation"
        >
          {{ generating ? '生成中' : generateButtonText }}
        </button>
        <button
          type="button"
          class="mini-btn ripple-trigger"
          :disabled="currentPostId <= 0"
          @click="openArticle"
        >
          {{ articleActionLabel }}
        </button>
        <button type="button" class="mini-btn ripple-trigger" :disabled="slides.length <= 1" @click="prevSlide">
          上一页
        </button>
        <button type="button" class="mini-btn ripple-trigger" :disabled="slides.length <= 1" @click="nextSlide">
          下一页
        </button>
        <button type="button" class="mini-btn ripple-trigger" :disabled="!canDownload" @click="downloadPpt">
          下载 PPT
        </button>
      </div>
    </header>

    <main class="presentation-shell liquid-material" :class="{ 'with-library': showPostLibrary }">
      <aside v-if="showPostLibrary" class="presentation-library liquid-material">
        <div class="library-head">
          <label class="library-search">
            <i class="fas fa-magnifying-glass" aria-hidden="true"></i>
            <input
              v-model.trim="libraryKeyword"
              type="search"
              maxlength="80"
              placeholder="搜索文章标题或简介"
              @keydown.enter.prevent="refreshLibrary"
            />
          </label>
          <button type="button" class="icon-btn ripple-trigger" title="刷新文章列表" @click="refreshLibrary">
            <i :class="libraryLoading ? 'fas fa-spinner fa-spin' : 'fas fa-rotate-right'" aria-hidden="true"></i>
          </button>
        </div>

        <p v-if="libraryError" class="error-text library-message">{{ libraryError }}</p>
        <p v-else-if="libraryLoading" class="library-message">文章列表加载中...</p>
        <div v-else-if="!libraryItems.length" class="library-empty">暂无可用文章。</div>

        <div v-else class="library-list">
          <button
            v-for="item in libraryItems"
            :key="`presentation_post_${currentScope}_${item.postId}`"
            type="button"
            class="library-item ripple-trigger"
            :class="{ active: item.postId === currentPostId }"
            @click="selectPost(item.postId)"
          >
            <div class="library-item-top">
              <span class="library-item-category">{{ resolveItemCategory(item) }}</span>
              <span class="library-item-date">{{ formatDate(item.publishedAt) }}</span>
            </div>
            <strong>{{ item.title }}</strong>
            <p>{{ item.summary || '暂无简介' }}</p>
            <small>{{ resolveItemStatus(item) }}</small>
          </button>
        </div>
      </aside>

      <section class="presentation-deck-shell">
        <div v-if="loading" class="presentation-empty">演示文稿加载中...</div>
        <div v-else-if="error" class="presentation-empty error-text">{{ error }}</div>
        <div v-else-if="!currentPostId" class="presentation-empty">
          {{ showPostLibrary ? '请先从左侧选择文章。' : '文章 ID 无效' }}
        </div>
        <div v-else-if="!slides.length" class="presentation-empty">
          {{ emptyHintText }}
        </div>

        <template v-else>
          <aside class="presentation-sidebar liquid-material">
            <button
              v-for="slide in slides"
              :key="slide.id"
              type="button"
              class="slide-nav-item ripple-trigger"
              :class="{ active: slide.index === activeSlideIndex }"
              @click="activeSlideIndex = slide.index"
            >
              <span class="slide-nav-index">{{ slide.index }}</span>
              <span class="slide-nav-title">{{ slide.title }}</span>
            </button>
          </aside>

          <section class="presentation-stage-wrap">
            <article class="presentation-stage liquid-material">
              <header class="presentation-stage-head">
                <span>第 {{ activeSlideIndex }} / {{ slides.length }} 页</span>
                <strong>{{ activeSlide?.title || presentationTitle }}</strong>
              </header>
              <div class="presentation-stage-body markdown-body" v-html="activeSlide?.html || ''"></div>
            </article>
          </section>
        </template>
      </section>
    </main>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useRouter } from 'vue-router';
import { useAuthSession } from '../../composables/useAuthSession';
import {
  generateMyPostPresentation,
  getMyPostPresentation,
  getMyPostPresentationPptDownloadUrl,
  getPostPresentation,
  getPostPresentationPptDownloadUrl,
  listMyPosts,
  listPosts
} from '../../services/blogApi';
import { parseSlidevDeck } from '../../utils/blogMarkdown';
import {
  BLOG_PRESENTATION_SCOPE_MINE,
  BLOG_PRESENTATION_SCOPE_PUBLIC,
  normalizeBlogPresentationPostId,
  normalizeBlogPresentationScope
} from '../lightapps/blog/blogPresentationWindowState';

const props = defineProps({
  postId: {
    type: [Number, String],
    default: 0
  },
  scope: {
    type: String,
    default: BLOG_PRESENTATION_SCOPE_PUBLIC
  },
  showBackButton: {
    type: Boolean,
    default: false
  },
  showPostLibrary: {
    type: Boolean,
    default: false
  },
  allowGenerate: {
    type: Boolean,
    default: false
  },
  embedded: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits(['back', 'update:postId', 'update:scope']);

const router = useRouter();
const auth = useAuthSession();

const currentPostId = ref(normalizeBlogPresentationPostId(props.postId));
const currentScope = ref(normalizeBlogPresentationScope(props.scope, false));
const loading = ref(false);
const error = ref('');
const presentation = ref(null);
const slides = ref([]);
const activeSlideIndex = ref(1);
const generating = ref(false);

const libraryKeyword = ref('');
const libraryLoading = ref(false);
const libraryError = ref('');
const libraryItems = ref([]);

let ready = false;
let pollTimer = 0;

function clearPollTimer() {
  if (!pollTimer) return;
  window.clearTimeout(pollTimer);
  pollTimer = 0;
}

function normalizeString(value, fallback = '') {
  return typeof value === 'string' ? value : fallback;
}

function normalizePostRecord(raw) {
  return {
    postId: normalizeBlogPresentationPostId(raw?.postId ?? raw?.post_id),
    title: normalizeString(raw?.title).trim() || '未命名文章',
    summary: normalizeString(raw?.summary).trim(),
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).trim().toLowerCase(),
    statusCode: normalizeString(raw?.statusCode ?? raw?.status_code, 'PUBLISHED').trim().toUpperCase(),
    publishedAt: raw?.publishedAt ?? raw?.published_at ?? null
  };
}

function normalizePresentation(raw) {
  return {
    postId: normalizeBlogPresentationPostId(raw?.postId ?? raw?.post_id),
    status: normalizeString(raw?.status, 'NOT_GENERATED').trim().toUpperCase(),
    slideCount: Math.max(0, Number(raw?.slideCount ?? raw?.slide_count) || 0),
    generatedAt: raw?.generatedAt ?? raw?.generated_at ?? null,
    templateVersion: normalizeString(raw?.templateVersion ?? raw?.template_version).trim(),
    slidevMarkdown: normalizeString(raw?.slidevMarkdown ?? raw?.slidev_markdown).trim(),
    pptReady: Boolean(raw?.pptReady ?? raw?.ppt_ready),
    errorText: normalizeString(raw?.errorText ?? raw?.error_text).trim()
  };
}

function normalizeErrorMessage(input, fallback) {
  const detail = normalizeString(input?.detail).trim();
  const message = normalizeString(input?.message).trim();
  return detail || message || fallback;
}

function formatDate(value) {
  if (!value) return '-';
  const date = new Date(value);
  if (Number.isNaN(date.getTime())) return '-';
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')}`;
}

function resolveAuthorizedFetch() {
  return auth.isAuthenticated.value ? auth.authorizedFetch : undefined;
}

function resolveCurrentSummary() {
  return libraryItems.value.find((item) => item.postId === currentPostId.value) || null;
}

function applyPresentationPayload(rawPayload) {
  const payload = normalizePresentation(rawPayload);
  presentation.value = payload;
  slides.value = parseSlidevDeck(payload.slidevMarkdown || '');
  activeSlideIndex.value = slides.value[0]?.index || 1;
  clearPollTimer();

  if (payload.status === 'GENERATING' && payload.postId === currentPostId.value) {
    pollTimer = window.setTimeout(() => {
      pollTimer = 0;
      void loadPresentation();
    }, 2500);
  }

  return payload;
}

const activeSlide = computed(() => slides.value.find((item) => item.index === activeSlideIndex.value) || slides.value[0] || null);
const canDownload = computed(() => presentation.value?.pptReady === true);
const canGenerate = computed(() => props.allowGenerate && auth.isAuthenticated.value && currentScope.value === BLOG_PRESENTATION_SCOPE_MINE && currentPostId.value > 0);
const busyRefreshing = computed(() => loading.value || libraryLoading.value);
const presentationTitle = computed(() => {
  const currentSummary = resolveCurrentSummary();
  const firstSlide = slides.value[0];
  return currentSummary?.title || firstSlide?.title || `演示文稿 #${currentPostId.value || '-'}`;
});
const statusText = computed(() => {
  const status = String(presentation.value?.status || 'NOT_GENERATED');
  if (status === 'READY') return `共 ${slides.value.length || presentation.value?.slideCount || 0} 页`;
  if (status === 'GENERATING') return '生成中，系统会自动刷新';
  if (status === 'FAILED') return presentation.value?.errorText || '生成失败';
  if (currentPostId.value <= 0) return props.showPostLibrary ? '从左侧选择文章后即可预览' : '请选择有效文章';
  return '未生成';
});
const emptyHintText = computed(() => {
  if (presentation.value?.status === 'FAILED') {
    return presentation.value?.errorText || '当前演示文稿生成失败。';
  }
  if (presentation.value?.status === 'GENERATING') {
    return '演示文稿正在生成中，系统稍后会自动刷新。';
  }
  if (currentScope.value === BLOG_PRESENTATION_SCOPE_MINE && auth.isAuthenticated.value) {
    return '当前文章还没有可预览的演示文稿，可尝试生成。';
  }
  return '当前文章暂无可预览演示文稿。';
});
const generateButtonText = computed(() => (presentation.value?.status === 'READY' ? '重新生成' : '生成演示'));
const articleActionLabel = computed(() => (currentScope.value === BLOG_PRESENTATION_SCOPE_MINE ? '打开编辑页' : '打开文章'));

async function loadLibrary() {
  if (!props.showPostLibrary) return;

  libraryLoading.value = true;
  libraryError.value = '';

  try {
    const payload = currentScope.value === BLOG_PRESENTATION_SCOPE_MINE
      ? await listMyPosts(
        {
          pageNo: 1,
          pageSize: 40,
          keyword: libraryKeyword.value
        },
        auth.authorizedFetch
      )
      : await listPosts(
        {
          pageNo: 1,
          pageSize: 40,
          keyword: libraryKeyword.value
        },
        resolveAuthorizedFetch()
      );

    const items = Array.isArray(payload?.items) ? payload.items : [];
    libraryItems.value = items.map(normalizePostRecord).filter((item) => item.postId > 0);

    if (currentPostId.value <= 0 && libraryItems.value.length) {
      currentPostId.value = libraryItems.value[0].postId;
    }
  } catch (inputError) {
    libraryItems.value = [];
    libraryError.value = normalizeErrorMessage(inputError, '加载文章列表失败');
  } finally {
    libraryLoading.value = false;
  }
}

async function loadPresentation() {
  clearPollTimer();

  if (currentPostId.value <= 0) {
    error.value = '';
    presentation.value = null;
    slides.value = [];
    activeSlideIndex.value = 1;
    return;
  }

  loading.value = true;
  error.value = '';

  try {
    const payload = currentScope.value === BLOG_PRESENTATION_SCOPE_MINE
      ? await getMyPostPresentation(currentPostId.value, auth.authorizedFetch)
      : await getPostPresentation(currentPostId.value, resolveAuthorizedFetch());
    applyPresentationPayload(payload);
  } catch (inputError) {
    presentation.value = null;
    slides.value = [];
    activeSlideIndex.value = 1;
    error.value = normalizeErrorMessage(inputError, '加载演示文稿失败');
  } finally {
    loading.value = false;
  }
}

async function refreshLibrary() {
  await loadLibrary();
  if (currentPostId.value > 0) {
    await loadPresentation();
  }
}

async function refreshWorkspace() {
  if (props.showPostLibrary) {
    await refreshLibrary();
    return;
  }
  await loadPresentation();
}

function selectScope(scope) {
  const normalized = normalizeBlogPresentationScope(scope, auth.isAuthenticated.value);
  if (normalized === currentScope.value) return;
  currentScope.value = normalized;
}

function selectPost(postId) {
  const normalized = normalizeBlogPresentationPostId(postId);
  if (normalized <= 0 || normalized === currentPostId.value) return;
  currentPostId.value = normalized;
}

function prevSlide() {
  activeSlideIndex.value = Math.max(1, activeSlideIndex.value - 1);
}

function nextSlide() {
  activeSlideIndex.value = Math.min(slides.value.length || 1, activeSlideIndex.value + 1);
}

async function downloadPpt() {
  if (!canDownload.value || currentPostId.value <= 0) return;
  try {
    const payload = currentScope.value === BLOG_PRESENTATION_SCOPE_MINE
      ? await getMyPostPresentationPptDownloadUrl(currentPostId.value, auth.authorizedFetch)
      : await getPostPresentationPptDownloadUrl(currentPostId.value, resolveAuthorizedFetch());
    const url = normalizeString(payload?.downloadUrl ?? payload?.download_url).trim();
    if (!url) {
      throw new Error('下载地址为空');
    }
    window.open(url, '_blank', 'noopener');
  } catch (inputError) {
    error.value = normalizeErrorMessage(inputError, '获取下载地址失败');
  }
}

async function generatePresentation() {
  if (!canGenerate.value) return;
  generating.value = true;
  error.value = '';

  try {
    const payload = await generateMyPostPresentation(currentPostId.value, auth.authorizedFetch);
    applyPresentationPayload(payload);
    await loadPresentation();
  } catch (inputError) {
    error.value = normalizeErrorMessage(inputError, '生成演示文稿失败');
  } finally {
    generating.value = false;
  }
}

function openArticle() {
  if (currentPostId.value <= 0) return;
  if (currentScope.value === BLOG_PRESENTATION_SCOPE_MINE) {
    router.push({ name: 'blog-editor', params: { postId: currentPostId.value } });
    return;
  }
  router.push({ name: 'blog-detail', params: { postId: currentPostId.value } });
}

function resolveItemCategory(item) {
  const categoryCode = normalizeString(item?.categoryCode).trim();
  return categoryCode || 'uncategorized';
}

function resolveItemStatus(item) {
  if (currentScope.value === BLOG_PRESENTATION_SCOPE_MINE) {
    return normalizeString(item?.statusCode, 'DRAFT').trim() || 'DRAFT';
  }
  return `发布于 ${formatDate(item?.publishedAt)}`;
}

function handleKeydown(event) {
  if (event.defaultPrevented) return;
  const targetTag = String(event.target?.tagName || '').toLowerCase();
  if (targetTag === 'input' || targetTag === 'textarea' || event.metaKey || event.ctrlKey || event.altKey) {
    return;
  }
  if (event.key === 'ArrowLeft') {
    event.preventDefault();
    prevSlide();
    return;
  }
  if (event.key === 'ArrowRight') {
    event.preventDefault();
    nextSlide();
  }
}

watch(
  () => props.postId,
  (value) => {
    const normalized = normalizeBlogPresentationPostId(value);
    if (normalized !== currentPostId.value) {
      currentPostId.value = normalized;
    }
  }
);

watch(
  () => props.scope,
  (value) => {
    const normalized = normalizeBlogPresentationScope(value, auth.isAuthenticated.value);
    if (normalized !== currentScope.value) {
      currentScope.value = normalized;
    }
  }
);

watch(currentPostId, async (value, previous) => {
  emit('update:postId', value);
  if (!ready || value === previous) return;
  await loadPresentation();
});

watch(currentScope, async (value, previous) => {
  emit('update:scope', value);
  if (!ready || value === previous) return;

  if (value === BLOG_PRESENTATION_SCOPE_MINE && !auth.isAuthenticated.value) {
    currentScope.value = BLOG_PRESENTATION_SCOPE_PUBLIC;
    return;
  }

  if (props.showPostLibrary) {
    const previousPostId = currentPostId.value;
    await loadLibrary();
    if (currentPostId.value === previousPostId && currentPostId.value > 0) {
      await loadPresentation();
    }
    return;
  }

  await loadPresentation();
});

onMounted(async () => {
  await auth.ensureReady();

  const normalizedScope = normalizeBlogPresentationScope(props.scope, auth.isAuthenticated.value);
  if (normalizedScope !== currentScope.value) {
    currentScope.value = normalizedScope;
  }

  if (props.showPostLibrary) {
    await loadLibrary();
  }

  await loadPresentation();
  ready = true;
  window.addEventListener('keydown', handleKeydown);
});

onBeforeUnmount(() => {
  ready = false;
  clearPollTimer();
  window.removeEventListener('keydown', handleKeydown);
});
</script>

<style scoped>
.presentation-page {
  height: 100%;
  min-height: 0;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  gap: 12px;
  color: rgba(239, 244, 255, 0.96);
}

.presentation-page.embedded {
  gap: 10px;
}

.presentation-toolbar,
.presentation-shell,
.presentation-library,
.presentation-sidebar,
.presentation-stage {
  --liquid-bg: rgba(20, 27, 42, 0.4);
  --liquid-border: rgba(255, 255, 255, 0.18);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
}

.presentation-toolbar {
  border-radius: 14px;
  padding: 12px 14px;
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  gap: 12px;
  align-items: center;
}

.presentation-toolbar-start {
  display: flex;
  align-items: center;
  gap: 10px;
  min-width: 0;
}

.presentation-toolbar-center {
  min-width: 0;
  text-align: center;
  display: grid;
  gap: 4px;
}

.presentation-toolbar-center h1 {
  margin: 0;
  font-size: 18px;
  letter-spacing: 0.02em;
}

.presentation-toolbar-center p {
  margin: 0;
  font-size: 12px;
  color: rgba(211, 223, 248, 0.9);
}

.presentation-toolbar-actions {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  flex-wrap: wrap;
  gap: 8px;
}

.presentation-scope-toggle {
  display: inline-flex;
  align-items: center;
  gap: 4px;
  padding: 4px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.08);
}

.scope-btn {
  border: 0;
  min-height: 32px;
  padding: 0 12px;
  border-radius: 999px;
  background: transparent;
  color: rgba(226, 235, 251, 0.88);
  font-size: 12px;
  white-space: nowrap;
}

.scope-btn.active {
  background: rgba(var(--accent-rgb), 0.24);
  color: rgba(255, 255, 255, 0.98);
}

.scope-btn:disabled {
  opacity: 0.48;
  cursor: not-allowed;
}

.presentation-shell {
  min-height: 0;
  border-radius: 18px;
  padding: 14px;
  display: grid;
  grid-template-columns: minmax(0, 1fr);
  gap: 14px;
}

.presentation-shell.with-library {
  grid-template-columns: minmax(260px, 300px) minmax(0, 1fr);
}

.presentation-library {
  min-height: 0;
  border-radius: 16px;
  padding: 12px;
  display: grid;
  grid-template-rows: auto auto minmax(0, 1fr);
  gap: 12px;
}

.library-head {
  display: flex;
  align-items: center;
  gap: 8px;
}

.library-search {
  flex: 1;
  min-width: 0;
  display: flex;
  align-items: center;
  gap: 8px;
  border-radius: 12px;
  padding: 0 12px;
  min-height: 40px;
  background: rgba(255, 255, 255, 0.08);
  border: 1px solid rgba(255, 255, 255, 0.12);
}

.library-search input {
  width: 100%;
  border: 0;
  outline: 0;
  background: transparent;
  color: inherit;
  font-size: 13px;
}

.library-message,
.library-empty {
  margin: 0;
  font-size: 12px;
  color: rgba(214, 224, 246, 0.88);
}

.library-list {
  min-height: 0;
  overflow: auto;
  display: grid;
  align-content: start;
  gap: 10px;
  padding-right: 2px;
}

.library-item {
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 14px;
  background:
    linear-gradient(135deg, rgba(var(--accent-rgb), 0.18), rgba(255, 255, 255, 0.05)),
    rgba(255, 255, 255, 0.04);
  padding: 12px;
  text-align: left;
  color: rgba(235, 242, 255, 0.95);
  display: grid;
  gap: 6px;
}

.library-item.active {
  border-color: rgba(var(--accent-rgb), 0.46);
  box-shadow: 0 12px 28px rgba(4, 10, 22, 0.2);
}

.library-item-top {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  font-size: 11px;
  color: rgba(203, 216, 244, 0.82);
}

.library-item strong {
  font-size: 14px;
  line-height: 1.45;
}

.library-item p,
.library-item small {
  margin: 0;
}

.library-item p {
  font-size: 12px;
  line-height: 1.55;
  color: rgba(214, 224, 246, 0.9);
}

.library-item small {
  color: rgba(var(--accent-rgb), 0.92);
}

.presentation-deck-shell {
  min-height: 0;
  display: grid;
  grid-template-columns: 240px minmax(0, 1fr);
  gap: 14px;
}

.presentation-sidebar {
  min-height: 0;
  overflow: auto;
  border-radius: 16px;
  padding: 10px;
  display: grid;
  align-content: start;
  gap: 8px;
}

.slide-nav-item {
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.08);
  padding: 10px 12px;
  color: rgba(232, 240, 255, 0.94);
  display: grid;
  gap: 4px;
  text-align: left;
}

.slide-nav-item.active {
  border-color: rgba(var(--accent-rgb), 0.48);
  background: rgba(var(--accent-rgb), 0.18);
}

.slide-nav-index {
  font-size: 11px;
  color: rgba(var(--accent-rgb), 0.9);
}

.slide-nav-title {
  font-size: 13px;
  line-height: 1.45;
}

.presentation-stage-wrap {
  min-height: 0;
}

.presentation-stage {
  border-radius: 16px;
  min-height: 100%;
  padding: 18px 20px;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  gap: 16px;
}

.presentation-stage-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  font-size: 13px;
  color: rgba(216, 227, 248, 0.92);
}

.presentation-stage-body {
  min-height: 0;
  overflow: auto;
  padding-right: 4px;
  line-height: 1.7;
}

.presentation-stage-body :deep(h1),
.presentation-stage-body :deep(h2),
.presentation-stage-body :deep(h3),
.presentation-stage-body :deep(h4) {
  margin: 0 0 0.8em;
  color: rgba(255, 255, 255, 0.98);
}

.presentation-stage-body :deep(p),
.presentation-stage-body :deep(li) {
  color: rgba(220, 230, 249, 0.94);
}

.presentation-stage-body :deep(pre) {
  padding: 12px 14px;
  border-radius: 12px;
  background: rgba(10, 16, 28, 0.7);
  overflow: auto;
}

.presentation-stage-body :deep(code) {
  font-family: 'SFMono-Regular', Consolas, 'Liberation Mono', Menlo, monospace;
}

.presentation-empty {
  grid-column: 1 / -1;
  min-height: 0;
  display: grid;
  place-items: center;
  text-align: center;
  color: rgba(216, 227, 248, 0.92);
  padding: 24px;
  border-radius: 16px;
  background: rgba(255, 255, 255, 0.04);
}

.mini-btn {
  border: 1px solid rgba(255, 255, 255, 0.22);
  border-radius: 10px;
  min-height: 34px;
  padding: 0 12px;
  background: rgba(255, 255, 255, 0.14);
  color: rgba(238, 244, 255, 0.95);
  white-space: nowrap;
}

@media (max-width: 1280px) {
  .presentation-toolbar {
    grid-template-columns: minmax(0, 1fr);
  }

  .presentation-toolbar-start,
  .presentation-toolbar-actions {
    justify-content: flex-start;
  }

  .presentation-toolbar-center {
    text-align: left;
  }
}

@media (max-width: 980px) {
  .presentation-shell.with-library,
  .presentation-deck-shell {
    grid-template-columns: minmax(0, 1fr);
  }

  .presentation-library,
  .presentation-sidebar {
    max-height: 280px;
  }
}
</style>
