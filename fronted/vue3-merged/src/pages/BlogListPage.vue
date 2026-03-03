<template>
  <section class="route-page blog-list-page motion-managed">
    <header class="hero liquid-material">
      <div class="hero-main">
        <p class="hero-eyebrow">Blog</p>
        <h1>博客</h1>
        <p class="hero-subtitle">按分类与标签浏览文章，点击卡片进入详情页。</p>
      </div>
      <div class="hero-meta">
        <span>共 {{ listState.total }} 篇</span>
        <span v-if="listState.loading">加载中...</span>
      </div>
    </header>

    <transition name="search-slide">
      <div v-if="searchState.open" class="search-panel liquid-material">
        <form class="search-form" @submit.prevent="handleSearchSubmit">
          <input v-model.trim="filters.keyword" class="search-input" type="text" placeholder="搜索标题 / 摘要 / 标签" />
          <button type="submit" class="mini-btn ripple-trigger">搜索</button>
          <button type="button" class="mini-btn ripple-trigger" @click="clearArchiveFilter">清除归档</button>
          <button type="button" class="mini-btn ripple-trigger" @click="searchState.open = false">收起</button>
        </form>
      </div>
    </transition>

    <section
      ref="categoryStripRef"
      class="category-strip liquid-material"
      :class="{ dragging: categoryDrag.dragging }"
      @pointerdown="handleCategoryStripPointerDown"
      @wheel.prevent="handleCategoryStripWheel"
    >
      <button
        v-for="category in categoryTabs"
        :key="category.categoryCode || '__all__'"
        type="button"
        class="category-pill ripple-trigger"
        :class="{ active: filters.category === category.categoryCode }"
        @click="applyCategoryFilter(category.categoryCode)"
      >
        <span>{{ category.categoryCode || '全部' }}</span>
        <span class="pill-count">{{ category.count }}</span>
      </button>
    </section>

    <div class="list-layout">
      <main class="feed-column">
        <p v-if="listState.error" class="error-text">{{ listState.error }}</p>

        <article
          v-for="(post, index) in listState.items"
          :key="post.postId"
          class="feed-card liquid-material ripple-trigger"
          :class="{ reverse: index % 2 === 1 }"
          :style="{ '--stagger': index }"
          @click="openPostDetail(post.postId)"
        >
          <div class="cover-pane">
            <img :src="resolveCover(post.coverImageUrl)" :alt="post.title" loading="lazy" />
          </div>
          <div class="content-pane">
            <h2>{{ post.title }}</h2>
            <div class="meta-row">
              <span>{{ formatDate(post.publishedAt) }}</span>
              <span>{{ post.categoryCode || 'uncategorized' }}</span>
              <span>{{ post.readingMinutes }} 分钟</span>
            </div>
            <p class="summary">{{ post.summary || '...' }}</p>
            <div v-if="post.tags.length" class="tag-row">
              <button
                v-for="tag in post.tags"
                :key="`${post.postId}-${tag}`"
                type="button"
                class="tag-chip ripple-trigger"
                @click.stop="applyTagFilter(tag)"
              >
                #{{ tag }}
              </button>
            </div>
          </div>
        </article>

        <p v-if="!listState.loading && !listState.items.length" class="empty-text">暂无符合条件的文章。</p>

        <footer class="pagination-wrap">
          <button type="button" class="mini-btn ripple-trigger" :disabled="listState.pageNo <= 1" @click="goToPage(listState.pageNo - 1)">
            上一页
          </button>
          <button
            v-for="page in visiblePages"
            :key="`page-${page}`"
            type="button"
            class="mini-btn ripple-trigger page-btn"
            :class="{ active: page === listState.pageNo }"
            @click="goToPage(page)"
          >
            {{ page }}
          </button>
          <button
            type="button"
            class="mini-btn ripple-trigger"
            :disabled="listState.pageNo >= pageCount"
            @click="goToPage(listState.pageNo + 1)"
          >
            下一页
          </button>
        </footer>
      </main>

      <aside class="sidebar-column">
        <section class="side-card liquid-material">
          <header class="side-head">
            <h3>最新文章</h3>
            <button type="button" class="icon-btn ripple-trigger" @click="searchState.open = !searchState.open">
              <i class="fas fa-search"></i>
              <span>搜索</span>
            </button>
          </header>
          <div v-if="sidebarState.error" class="side-tip">{{ sidebarState.error }}</div>
          <button
            v-for="item in sidebarState.latestPosts"
            :key="`latest-${item.postId}`"
            type="button"
            class="latest-item ripple-trigger"
            @click="openPostDetail(item.postId)"
          >
            <img :src="resolveCover(item.coverImageUrl)" :alt="item.title" loading="lazy" />
            <span class="latest-text">
              <strong>{{ item.title }}</strong>
              <small>{{ formatDate(item.publishedAt) }}</small>
            </span>
          </button>
        </section>

        <section class="side-card liquid-material">
          <header class="side-head">
            <h3>分类</h3>
          </header>
          <button
            v-for="item in sidebarState.categories"
            :key="`category-${item.categoryCode}`"
            type="button"
            class="list-row ripple-trigger"
            :class="{ active: filters.category === item.categoryCode }"
            @click="applyCategoryFilter(item.categoryCode)"
          >
            <span>{{ item.categoryCode }}</span>
            <strong>{{ item.count }}</strong>
          </button>
        </section>

        <section class="side-card liquid-material">
          <header class="side-head">
            <h3>标签</h3>
          </header>
          <div class="tag-cloud">
            <button
              v-for="item in sidebarState.tags"
              :key="`tag-${item.tagCode}`"
              type="button"
              class="tag-chip ripple-trigger"
              :class="{ active: filters.tag === item.tagCode }"
              @click="applyTagFilter(item.tagCode)"
            >
              {{ item.tagCode }}
              <span>{{ item.count }}</span>
            </button>
          </div>
        </section>

        <section class="side-card liquid-material">
          <header class="side-head">
            <h3>归档</h3>
          </header>
          <button
            v-for="item in sidebarState.archives"
            :key="`archive-${item.month}`"
            type="button"
            class="list-row ripple-trigger"
            :class="{ active: filters.archiveMonth === item.month }"
            @click="applyArchiveFilter(item.month)"
          >
            <span>{{ item.month }}</span>
            <strong>{{ item.count }}</strong>
          </button>
        </section>
      </aside>
    </div>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref } from 'vue';
import { useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';
import { getPostSidebar, listPosts } from '../services/blogApi';

const DEFAULT_COVER_IMAGE = '/images/katanegai.jpg';
const PAGE_SIZE = 10;

const router = useRouter();
const auth = useAuthSession();
const categoryStripRef = ref(null);

const categoryDrag = reactive({
  dragging: false,
  startX: 0,
  startScrollLeft: 0
});

const filters = reactive({
  keyword: '',
  category: '',
  tag: '',
  publishedFrom: '',
  publishedTo: '',
  archiveMonth: ''
});

const searchState = reactive({
  open: false
});

const listState = reactive({
  loading: false,
  error: '',
  items: [],
  total: 0,
  pageNo: 1,
  pageSize: PAGE_SIZE
});

const sidebarState = reactive({
  loading: false,
  error: '',
  latestPosts: [],
  categories: [],
  tags: [],
  archives: []
});

const pageCount = computed(() => Math.max(1, Math.ceil(Math.max(0, listState.total) / listState.pageSize)));

const visiblePages = computed(() => {
  const total = pageCount.value;
  const current = listState.pageNo;
  if (total <= 7) {
    return Array.from({ length: total }, (_, index) => index + 1);
  }
  const start = Math.max(1, current - 3);
  const end = Math.min(total, start + 6);
  const normalizedStart = Math.max(1, end - 6);
  return Array.from({ length: end - normalizedStart + 1 }, (_, index) => normalizedStart + index);
});

const categoryTabs = computed(() => {
  const fromSidebar = Array.isArray(sidebarState.categories) ? sidebarState.categories : [];
  const sum = fromSidebar.reduce((acc, item) => acc + Math.max(0, Number(item.count) || 0), 0);
  const allItem = { categoryCode: '', count: sum };
  const tabs = [allItem, ...fromSidebar];
  if (filters.category && !tabs.some((item) => item.categoryCode === filters.category)) {
    tabs.push({ categoryCode: filters.category, count: 0 });
  }
  return tabs;
});

function resolveAuthorizedFetch() {
  return auth.isAuthenticated.value ? auth.authorizedFetch : undefined;
}

function normalizeString(value, fallback = '') {
  return typeof value === 'string' ? value : fallback;
}

function normalizeTags(value) {
  if (!Array.isArray(value)) return [];
  return value
    .map((item) => String(item || '').trim().toLowerCase())
    .filter(Boolean);
}

function normalizePostSummary(raw) {
  return {
    postId: Number(raw?.postId ?? raw?.post_id) || 0,
    title: normalizeString(raw?.title),
    summary: normalizeString(raw?.summary),
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url),
    visibility: normalizeString(raw?.visibility, 'PUBLIC').toUpperCase(),
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    tags: normalizeTags(raw?.tags),
    readingMinutes: Math.max(1, Number(raw?.readingMinutes ?? raw?.reading_minutes) || 1),
    likeCount: Math.max(0, Number(raw?.likeCount ?? raw?.like_count) || 0),
    publishedAt: raw?.publishedAt ?? raw?.published_at ?? null
  };
}

function normalizeLatestPost(raw) {
  return {
    postId: Number(raw?.postId ?? raw?.post_id) || 0,
    title: normalizeString(raw?.title),
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url),
    publishedAt: raw?.publishedAt ?? raw?.published_at ?? null
  };
}

function normalizeCategoryStat(raw) {
  return {
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    count: Math.max(0, Number(raw?.count) || 0)
  };
}

function normalizeTagStat(raw) {
  return {
    tagCode: normalizeString(raw?.tagCode ?? raw?.tag_code).toLowerCase(),
    count: Math.max(0, Number(raw?.count) || 0)
  };
}

function normalizeArchiveStat(raw) {
  return {
    month: normalizeString(raw?.month),
    count: Math.max(0, Number(raw?.count) || 0)
  };
}

function normalizeErrorMessage(error, fallback) {
  const detail = normalizeString(error?.detail).trim();
  if (detail) return detail;
  const message = normalizeString(error?.message).trim();
  return message || fallback;
}

function formatDate(value) {
  if (!value) return '-';
  const date = new Date(value);
  if (Number.isNaN(date.getTime())) return String(value);
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')}`;
}

function resolveCover(url) {
  const normalized = normalizeString(url).trim();
  return normalized || DEFAULT_COVER_IMAGE;
}

async function loadPostList() {
  listState.loading = true;
  listState.error = '';
  try {
    const payload = await listPosts(
      {
        pageNo: listState.pageNo,
        pageSize: listState.pageSize,
        keyword: filters.keyword,
        category: filters.category,
        tag: filters.tag,
        publishedFrom: filters.publishedFrom,
        publishedTo: filters.publishedTo
      },
      resolveAuthorizedFetch()
    );
    const items = Array.isArray(payload?.items) ? payload.items : [];
    listState.items = items.map(normalizePostSummary).filter((item) => item.postId > 0);
    listState.total = Math.max(0, Number(payload?.total) || listState.items.length);
  } catch (error) {
    listState.items = [];
    listState.total = 0;
    listState.error = normalizeErrorMessage(error, '加载博客列表失败');
  } finally {
    listState.loading = false;
  }
}

async function loadSidebar() {
  sidebarState.loading = true;
  sidebarState.error = '';
  try {
    const payload = await getPostSidebar(resolveAuthorizedFetch());
    sidebarState.latestPosts = Array.isArray(payload?.latestPosts ?? payload?.latest_posts)
      ? (payload.latestPosts ?? payload.latest_posts).map(normalizeLatestPost).filter((item) => item.postId > 0)
      : [];
    sidebarState.categories = Array.isArray(payload?.categories)
      ? payload.categories.map(normalizeCategoryStat).filter((item) => item.categoryCode)
      : [];
    sidebarState.tags = Array.isArray(payload?.tags) ? payload.tags.map(normalizeTagStat).filter((item) => item.tagCode) : [];
    sidebarState.archives = Array.isArray(payload?.archives)
      ? payload.archives.map(normalizeArchiveStat).filter((item) => item.month)
      : [];
  } catch (error) {
    sidebarState.error = normalizeErrorMessage(error, '加载侧栏数据失败');
    sidebarState.latestPosts = [];
    sidebarState.categories = [];
    sidebarState.tags = [];
    sidebarState.archives = [];
  } finally {
    sidebarState.loading = false;
  }
}

async function refreshPageData(options = {}) {
  await loadPostList();
  if (options.reloadSidebar) {
    await loadSidebar();
  }
}

function goToPage(pageNo) {
  const target = Math.max(1, Math.min(pageCount.value, Number(pageNo) || 1));
  if (target === listState.pageNo) return;
  listState.pageNo = target;
  loadPostList();
}

function handleSearchSubmit() {
  listState.pageNo = 1;
  loadPostList();
}

function applyCategoryFilter(categoryCode) {
  filters.category = normalizeString(categoryCode).toLowerCase();
  listState.pageNo = 1;
  loadPostList();
}

function applyTagFilter(tagCode) {
  filters.tag = normalizeString(tagCode).toLowerCase();
  listState.pageNo = 1;
  loadPostList();
}

function clearArchiveFilter() {
  filters.archiveMonth = '';
  filters.publishedFrom = '';
  filters.publishedTo = '';
  listState.pageNo = 1;
  loadPostList();
}

function applyArchiveFilter(monthText) {
  const normalized = normalizeString(monthText);
  const match = normalized.match(/^(\d{4})-(\d{2})$/);
  if (!match) return;
  const year = Number(match[1]);
  const monthIndex = Number(match[2]) - 1;
  if (!Number.isFinite(year) || !Number.isFinite(monthIndex) || monthIndex < 0 || monthIndex > 11) return;

  const from = new Date(Date.UTC(year, monthIndex, 1, 0, 0, 0));
  const to = new Date(Date.UTC(year, monthIndex + 1, 1, 0, 0, 0));
  filters.archiveMonth = normalized;
  filters.publishedFrom = from.toISOString();
  filters.publishedTo = to.toISOString();
  listState.pageNo = 1;
  loadPostList();
}

function openPostDetail(postId) {
  const normalized = Number(postId) || 0;
  if (normalized <= 0) return;
  router.push({ name: 'blog-detail', params: { postId: normalized } });
}

function handleCategoryStripPointerDown(event) {
  const strip = categoryStripRef.value;
  if (!strip) return;
  if (event.button !== 0) return;
  categoryDrag.dragging = true;
  categoryDrag.startX = event.clientX;
  categoryDrag.startScrollLeft = strip.scrollLeft;
  window.addEventListener('pointermove', handleCategoryStripPointerMove);
  window.addEventListener('pointerup', handleCategoryStripPointerUp);
}

function handleCategoryStripPointerMove(event) {
  const strip = categoryStripRef.value;
  if (!strip || !categoryDrag.dragging) return;
  const delta = event.clientX - categoryDrag.startX;
  strip.scrollLeft = categoryDrag.startScrollLeft - delta;
}

function handleCategoryStripPointerUp() {
  categoryDrag.dragging = false;
  window.removeEventListener('pointermove', handleCategoryStripPointerMove);
  window.removeEventListener('pointerup', handleCategoryStripPointerUp);
}

function handleCategoryStripWheel(event) {
  const strip = categoryStripRef.value;
  if (!strip) return;
  strip.scrollLeft += Math.abs(event.deltaY) > Math.abs(event.deltaX) ? event.deltaY : event.deltaX;
}

onMounted(async () => {
  await auth.ensureReady();
  await Promise.all([refreshPageData(), loadSidebar()]);
});

onBeforeUnmount(() => {
  window.removeEventListener('pointermove', handleCategoryStripPointerMove);
  window.removeEventListener('pointerup', handleCategoryStripPointerUp);
});
</script>

<style scoped>
.blog-list-page {
  min-height: 100%;
  display: grid;
  grid-template-rows: auto auto auto 1fr;
  gap: 12px;
  color: rgba(240, 244, 255, 0.96);
  font-family: 'Noto Sans SC', 'PingFang SC', 'Helvetica Neue', sans-serif;
}

.hero {
  --liquid-bg: rgba(14, 20, 33, 0.45);
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 16px 32px rgba(7, 10, 18, 0.22);
  border-radius: 16px;
  padding: 14px 16px;
  display: flex;
  justify-content: space-between;
  align-items: flex-end;
  gap: 12px;
}

.hero-eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

.hero h1 {
  margin-top: 4px;
  font-size: clamp(28px, 4vw, 38px);
}

.hero-subtitle {
  margin-top: 8px;
  color: rgba(219, 227, 247, 0.9);
}

.hero-meta {
  display: grid;
  gap: 4px;
  font-size: 13px;
  color: rgba(216, 226, 248, 0.92);
  text-align: right;
}

.search-panel {
  --liquid-bg: rgba(10, 16, 28, 0.52);
  --liquid-border: rgba(255, 255, 255, 0.18);
  --liquid-shadow: 0 12px 24px rgba(4, 9, 16, 0.24);
  border-radius: 14px;
  padding: 10px;
}

.search-form {
  display: flex;
  gap: 8px;
  align-items: center;
}

.search-input {
  flex: 1;
  min-width: 0;
  min-height: 36px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(7, 12, 23, 0.52);
  color: rgba(240, 245, 255, 0.96);
  padding: 0 12px;
}

.search-input:focus {
  outline: none;
  border-color: rgba(var(--accent-rgb), 0.62);
  box-shadow: 0 0 0 3px rgba(var(--accent-rgb), 0.2);
}

.mini-btn {
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(255, 255, 255, 0.15);
  color: rgba(241, 246, 255, 0.96);
  padding: 0 12px;
}

.mini-btn.active {
  border-color: rgba(var(--accent-rgb), 0.55);
  background: rgba(var(--accent-rgb), 0.28);
  box-shadow: 0 10px 20px rgba(var(--accent-rgb), 0.22);
}

.category-strip {
  --liquid-bg: rgba(11, 17, 29, 0.46);
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 12px 24px rgba(5, 9, 16, 0.2);
  border-radius: 14px;
  padding: 8px;
  display: flex;
  gap: 8px;
  overflow-x: auto;
  overscroll-behavior-x: contain;
  cursor: grab;
}

.category-strip.dragging {
  cursor: grabbing;
}

.category-strip::-webkit-scrollbar {
  display: none;
}

.category-pill {
  border: 1px solid rgba(255, 255, 255, 0.18);
  border-radius: 999px;
  min-height: 34px;
  padding: 0 10px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(236, 243, 255, 0.95);
  display: inline-flex;
  align-items: center;
  gap: 8px;
  white-space: nowrap;
}

.category-pill.active {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.28);
  box-shadow: 0 10px 20px rgba(var(--accent-rgb), 0.22);
}

.pill-count {
  min-width: 20px;
  height: 20px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.2);
  display: inline-grid;
  place-items: center;
  font-size: 11px;
}

.list-layout {
  min-height: 0;
  display: grid;
  grid-template-columns: minmax(0, 1fr) 286px;
  gap: 12px;
}

.feed-column {
  min-height: 0;
  overflow: auto;
  display: grid;
  align-content: start;
  gap: 12px;
  padding-right: 4px;
}

.feed-card {
  --liquid-bg: rgba(7, 10, 17, 0.78);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 18px 30px rgba(5, 8, 14, 0.28);
  border-radius: 14px;
  display: grid;
  grid-template-columns: minmax(220px, 42%) minmax(0, 1fr);
  min-height: 230px;
  overflow: hidden;
  cursor: pointer;
  transition: transform 220ms ease, box-shadow 220ms ease;
  animation: reveal-up 420ms ease both;
  animation-delay: calc(var(--stagger) * 42ms);
}

.feed-card.reverse {
  grid-template-columns: minmax(0, 1fr) minmax(220px, 42%);
}

.feed-card:hover {
  transform: translateY(-3px);
  box-shadow: 0 26px 44px rgba(2, 4, 8, 0.34);
}

.cover-pane {
  position: relative;
  overflow: hidden;
}

.cover-pane img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  transition: transform 320ms ease;
}

.feed-card:hover .cover-pane img {
  transform: scale(1.05);
}

.content-pane {
  padding: 22px;
  display: grid;
  gap: 12px;
  align-content: center;
}

.content-pane h2 {
  font-size: clamp(22px, 2.6vw, 38px);
  line-height: 1.24;
}

.meta-row {
  display: flex;
  flex-wrap: wrap;
  gap: 8px 12px;
  font-size: 13px;
  color: rgba(202, 214, 240, 0.9);
}

.summary {
  color: rgba(221, 230, 248, 0.92);
  line-height: 1.75;
  display: -webkit-box;
  -webkit-line-clamp: 4;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.tag-row {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.tag-chip {
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.14);
  color: rgba(236, 242, 255, 0.95);
  padding: 3px 9px;
  font-size: 12px;
}

.tag-chip.active {
  border-color: rgba(var(--accent-rgb), 0.6);
  background: rgba(var(--accent-rgb), 0.3);
}

.pagination-wrap {
  margin-top: 2px;
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.page-btn {
  min-width: 36px;
}

.sidebar-column {
  min-height: 0;
  overflow: auto;
  display: grid;
  gap: 12px;
  align-content: start;
}

.side-card {
  --liquid-bg: rgba(8, 11, 20, 0.82);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 16px 28px rgba(5, 8, 14, 0.28);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.side-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.side-head h3 {
  font-size: 15px;
}

.icon-btn {
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(237, 244, 255, 0.95);
  min-height: 30px;
  padding: 0 10px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.latest-item {
  border: 0;
  width: 100%;
  border-radius: 10px;
  padding: 4px;
  background: rgba(255, 255, 255, 0.05);
  display: grid;
  grid-template-columns: 48px minmax(0, 1fr);
  gap: 8px;
  text-align: left;
  color: inherit;
}

.latest-item img {
  width: 48px;
  height: 48px;
  border-radius: 8px;
  object-fit: cover;
}

.latest-text {
  min-width: 0;
  display: grid;
  gap: 3px;
}

.latest-text strong {
  font-size: 13px;
  line-height: 1.3;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.latest-text small {
  font-size: 12px;
  color: rgba(188, 203, 236, 0.86);
}

.list-row {
  border: 0;
  width: 100%;
  border-radius: 9px;
  padding: 8px 10px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  background: rgba(255, 255, 255, 0.06);
  color: rgba(236, 243, 255, 0.94);
}

.list-row.active {
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.6);
  background: rgba(var(--accent-rgb), 0.22);
}

.tag-cloud {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.tag-cloud .tag-chip span {
  margin-left: 4px;
  opacity: 0.8;
}

.error-text {
  color: #ffadb2;
  font-size: 13px;
}

.empty-text,
.side-tip {
  color: rgba(205, 218, 245, 0.88);
  font-size: 13px;
}

.search-slide-enter-active,
.search-slide-leave-active {
  transition: all 220ms ease;
}

.search-slide-enter-from,
.search-slide-leave-to {
  opacity: 0;
  transform: translateX(16px);
}

@keyframes reveal-up {
  from {
    opacity: 0;
    transform: translateY(10px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

@media (max-width: 1200px) {
  .list-layout {
    grid-template-columns: 1fr;
  }

  .sidebar-column {
    grid-template-columns: repeat(2, minmax(0, 1fr));
    display: grid;
  }
}

@media (max-width: 900px) {
  .hero {
    display: grid;
    align-items: start;
  }

  .hero-meta {
    text-align: left;
  }

  .search-form {
    flex-wrap: wrap;
  }

  .feed-card,
  .feed-card.reverse {
    grid-template-columns: 1fr;
    min-height: 0;
  }

  .cover-pane {
    min-height: 220px;
  }

  .content-pane {
    padding: 16px;
  }

  .sidebar-column {
    grid-template-columns: 1fr;
  }
}

@media (prefers-reduced-motion: reduce) {
  .feed-card,
  .search-slide-enter-active,
  .search-slide-leave-active {
    animation: none !important;
    transition: none !important;
  }
}
</style>
