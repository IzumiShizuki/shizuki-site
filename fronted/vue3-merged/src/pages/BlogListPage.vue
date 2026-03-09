<template>
  <section class="route-page blog-list-page motion-managed">
    <div
      class="blog-shell"
      :class="{ 'left-panel-collapsed': leftPanelCollapsed, 'right-panel-collapsed': rightPanelCollapsed }"
    >
      <SubtleScrollArea tag="aside" class="left-switch liquid-material" :class="{ collapsed: leftPanelCollapsed }">
        <div class="left-switch-head">
          <button
            type="button"
            class="icon-circle-btn ripple-trigger sidebar-collapse-btn"
            aria-label="收起左栏"
            title="收起左栏"
            @click="toggleLeftPanelCollapsed"
          >
            <i class="fas fa-angles-left"></i>
          </button>
        </div>
        <button
          type="button"
          class="switch-btn ripple-trigger"
          :class="{ active: uiState.panel === 'read' }"
          @click="setPanel('read')"
        >
          <i class="fas fa-house"></i>
          <span>主页</span>
        </button>
        <button
          type="button"
          class="switch-btn ripple-trigger"
          :class="{ active: uiState.panel === 'write', disabled: !canWrite }"
          @click="setPanel('write')"
        >
          <i class="fas fa-pen"></i>
          <span>写文</span>
        </button>
        <button
          type="button"
          class="switch-btn ripple-trigger"
          :class="{ active: uiState.panel === 'categories' }"
          @click="setPanel('categories')"
        >
          <i class="fas fa-folder-open"></i>
          <span>分类</span>
        </button>
        <button
          type="button"
          class="switch-btn ripple-trigger"
          :class="{ active: uiState.panel === 'whisper' }"
          @click="setPanel('whisper')"
        >
          <i class="fas fa-user-secret"></i>
          <span>悄悄话</span>
        </button>
        <p v-if="uiState.actionHint" class="action-hint">{{ uiState.actionHint }}</p>
      </SubtleScrollArea>

      <section class="main-column">
        <transition name="search-slide">
          <div v-if="searchState.open && uiState.panel === 'read'" class="search-panel liquid-material">
            <form class="search-form" @submit.prevent="handleSearchSubmit">
              <input v-model.trim="filters.keyword" class="search-input" type="text" placeholder="搜索标题 / 摘要 / 标签" />
              <button type="submit" class="mini-btn ripple-trigger">搜索</button>
              <button type="button" class="mini-btn ripple-trigger" @click="clearArchiveFilter">清除归档</button>
              <button type="button" class="mini-btn ripple-trigger" @click="searchState.open = false">收起</button>
            </form>
          </div>
        </transition>

        <template v-if="uiState.panel === 'read'">
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
              <img
                v-if="category.coverImageUrl && category.categoryCode"
                class="category-pill-cover"
                :src="resolveCover(category.coverImageUrl)"
                :alt="category.displayName || category.categoryCode"
                loading="lazy"
              />
              <span>{{ category.displayName || category.categoryCode || '全部' }}</span>
              <span class="pill-count">{{ category.count }}</span>
            </button>
            <span class="strip-meta">共 {{ listState.total }} 篇</span>
          </section>

          <div class="content-layout" :class="{ 'right-panel-collapsed': rightPanelCollapsed }">
            <SubtleScrollArea tag="main" class="feed-column">
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
                  <span>{{ post.wordCount }} 字 · {{ post.readingMinutes }} 分钟</span>
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
            </SubtleScrollArea>

            <SubtleScrollArea tag="aside" class="sidebar-column" :class="{ collapsed: rightPanelCollapsed }">
              <header class="sidebar-column-head">
                <span>侧栏</span>
                <button
                  type="button"
                  class="icon-circle-btn ripple-trigger sidebar-collapse-btn"
                  aria-label="收起右栏"
                  title="收起右栏"
                  @click="toggleRightPanelCollapsed"
                >
                  <i class="fas fa-angles-right"></i>
                </button>
              </header>
              <section class="side-card liquid-material">
                <header class="side-head">
                  <h3>最新文章</h3>
                  <div class="head-actions">
                    <button type="button" class="icon-btn ripple-trigger" @click="searchState.open = !searchState.open">
                      <i class="fas fa-search"></i>
                      <span>搜索</span>
                    </button>
                    <button v-if="canWrite" type="button" class="icon-btn ripple-trigger" @click="openEditor">
                      <i class="fas fa-pen"></i>
                      <span>写文</span>
                    </button>
                  </div>
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
                  <span class="category-row-main">
                    <img
                      v-if="item.coverImageUrl"
                      class="category-row-cover"
                      :src="resolveCover(item.coverImageUrl)"
                      :alt="item.displayName || item.categoryCode"
                      loading="lazy"
                    />
                    <span>{{ item.displayName || item.categoryCode }}</span>
                  </span>
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
            </SubtleScrollArea>
          </div>
        </template>

        <SubtleScrollArea v-else-if="uiState.panel === 'categories'" tag="section" class="category-panel liquid-material">
          <template v-if="canManageCategories">
            <h2>分类管理</h2>
            <p>在博客界面直接维护分类，支持新增分类、上传分类图和调整展示信息。</p>
            <AdminBlogCategoriesPanel
              :loading="categoryMetaLoading"
              :saving="categoryMetaSaving"
              :error="categoryMetaError"
              :items="categoryMetaItems"
              :uploading-code="categoryMetaUploadingCode"
              :allow-create="true"
              @refresh="reloadCategoryMetas"
              @save="saveCategoryMetaItem"
              @upload="uploadCategoryMetaCover"
            />
          </template>
          <template v-else>
            <h2>分类总览</h2>
            <p>这里展示当前可见的全部分类，点击即可按分类筛选并回到主页列表。</p>
            <div class="category-panel-grid">
              <button
                v-for="item in sidebarState.categories"
                :key="`panel-category-${item.categoryCode}`"
                type="button"
                class="category-panel-card ripple-trigger"
                @click="viewCategory(item.categoryCode)"
              >
                <img
                  v-if="item.coverImageUrl"
                  :src="resolveCover(item.coverImageUrl)"
                  :alt="item.displayName || item.categoryCode"
                  loading="lazy"
                />
                <div class="category-panel-card-main">
                  <strong>{{ item.displayName || item.categoryCode }}</strong>
                  <span>{{ item.count }} 篇</span>
                </div>
              </button>
              <p v-if="!sidebarState.categories.length && !sidebarState.loading" class="empty-text">暂无可见分类。</p>
            </div>
          </template>
        </SubtleScrollArea>

        <SubtleScrollArea v-else tag="section" class="whisper-panel liquid-material">
          <h2>悄悄话</h2>
          <p>支持匿名发送给作者，不登录也可以提交。备注可留空。</p>
          <form class="whisper-form" @submit.prevent="submitWhisper">
            <label class="whisper-field">
              <span>内容（必填）</span>
              <textarea
                v-model.trim="whisperState.form.content"
                maxlength="180"
                placeholder="想对作者说点什么..."
                required
              ></textarea>
            </label>
            <div class="whisper-grid">
              <label class="whisper-field">
                <span>昵称（可选）</span>
                <input v-model.trim="whisperState.form.nickname" type="text" maxlength="40" placeholder="匿名访客" />
              </label>
              <label class="whisper-field">
                <span>备注/联系方式（可选）</span>
                <input v-model.trim="whisperState.form.remark" type="text" maxlength="120" placeholder="QQ / 邮箱 / 留空都可以" />
              </label>
            </div>
            <label class="whisper-field">
              <span>关联文章（可选）</span>
              <select v-model="whisperState.form.postId">
                <option value="">不关联具体文章</option>
                <option v-for="item in sidebarState.latestPosts" :key="`whisper-post-${item.postId}`" :value="String(item.postId)">
                  {{ item.title }}
                </option>
              </select>
            </label>
            <div class="whisper-actions">
              <button type="submit" class="mini-btn ripple-trigger" :disabled="whisperState.submitting">
                {{ whisperState.submitting ? '发送中...' : '发送悄悄话' }}
              </button>
              <button type="button" class="mini-btn ripple-trigger" :disabled="whisperState.submitting" @click="resetWhisperForm">
                清空
              </button>
            </div>
            <p v-if="whisperState.error" class="error-text">{{ whisperState.error }}</p>
            <p v-if="whisperState.notice" class="side-tip">{{ whisperState.notice }}</p>
          </form>
        </SubtleScrollArea>
      </section>
    </div>

    <button
      v-if="leftPanelCollapsed"
      type="button"
      class="sidebar-reopen-btn sidebar-reopen-left icon-circle-btn ripple-trigger"
      aria-label="展开左栏"
      title="展开左栏"
      @click="openLeftPanel"
    >
      <i class="fas fa-chevron-right"></i>
    </button>

    <button
      v-if="rightPanelCollapsed && !isMobileLike"
      type="button"
      class="sidebar-reopen-btn sidebar-reopen-right icon-circle-btn ripple-trigger"
      aria-label="展开右栏"
      title="展开右栏"
      @click="openRightPanel"
    >
      <i class="fas fa-chevron-left"></i>
    </button>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import SubtleScrollArea from '../components/SubtleScrollArea.vue';
import AdminBlogCategoriesPanel from '../components/admin/AdminBlogCategoriesPanel.vue';
import { useAuthSession } from '../composables/useAuthSession';
import { useBlogResponsiveLayout } from '../composables/useBlogResponsiveLayout';
import { getPostSidebar, listPosts, submitPostWhisper } from '../services/blogApi';
import { listBlogCategoryMetas, updateBlogCategoryMeta, uploadBlogCategoryCover } from '../services/adminApi';

const DEFAULT_COVER_IMAGE = '/images/katanegai.jpg';
const PAGE_SIZE = 10;
const BLOG_LEFT_PANEL_STATE_KEY = 'blog_left_panel_collapsed';

const router = useRouter();
const route = useRoute();
const auth = useAuthSession();
const categoryStripRef = ref(null);
const leftPanelCollapsed = ref(readPersistedLeftPanelCollapsed());
const rightPanelCollapsed = ref(false);
const rightPanelTouchedByUser = ref(false);
const { isNarrowDesktop, isMobileLike, recommendedRightCollapsed } = useBlogResponsiveLayout({
  desktopBreakpoint: 1366,
  mobileBreakpoint: 980
});

const categoryDrag = reactive({
  dragging: false,
  startX: 0,
  startScrollLeft: 0
});

const uiState = reactive({
  panel: 'read',
  actionHint: ''
});

const whisperState = reactive({
  submitting: false,
  error: '',
  notice: '',
  form: {
    content: '',
    nickname: '',
    remark: '',
    postId: ''
  }
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

const categoryMetaLoading = ref(false);
const categoryMetaSaving = ref(false);
const categoryMetaError = ref('');
const categoryMetaUploadingCode = ref('');
const categoryMetaItems = ref([]);

const groupCodes = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.map((group) => String(group || '').trim().toUpperCase()).filter(Boolean);
});

const permissionCodes = computed(() => {
  const permissions = Array.isArray(auth.user.value?.permissions) ? auth.user.value.permissions : [];
  return permissions.map((code) => String(code || '').trim().toLowerCase()).filter(Boolean);
});

const canWrite = computed(() => groupCodes.value.includes('ADMIN') || permissionCodes.value.includes('blog.post.write'));
const canManageCategories = computed(() => groupCodes.value.includes('ADMIN'));
const pageCount = computed(() => Math.max(1, Math.ceil(Math.max(0, listState.total) / listState.pageSize)));
const viewportZone = computed(() => {
  if (isMobileLike.value) return 'mobile';
  if (isNarrowDesktop.value) return 'narrow';
  return 'wide';
});

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
  const allItem = { categoryCode: '', count: sum, displayName: '全部', coverImageUrl: '' };
  const tabs = [allItem, ...fromSidebar];
  if (filters.category && !tabs.some((item) => item.categoryCode === filters.category)) {
    tabs.push({ categoryCode: filters.category, count: 0, displayName: filters.category, coverImageUrl: '' });
  }
  return tabs;
});

function resolveAuthorizedFetch() {
  return auth.isAuthenticated.value ? auth.authorizedFetch : undefined;
}

function readPersistedLeftPanelCollapsed() {
  if (typeof window === 'undefined') return false;
  return window.localStorage.getItem(BLOG_LEFT_PANEL_STATE_KEY) === '1';
}

function persistLeftPanelCollapsed(value) {
  if (typeof window === 'undefined') return;
  if (value) {
    window.localStorage.setItem(BLOG_LEFT_PANEL_STATE_KEY, '1');
    return;
  }
  window.localStorage.removeItem(BLOG_LEFT_PANEL_STATE_KEY);
}

function normalizePanel(panel) {
  const normalized = String(panel || '').toLowerCase();
  if (normalized === 'categories' || normalized === 'category') return 'categories';
  if (normalized === 'whisper' || normalized === 'whispers' || normalized === 'comments' || normalized === 'comment') {
    return 'whisper';
  }
  return 'read';
}

function syncPanelFromRouteQuery() {
  uiState.panel = normalizePanel(route.query.panel);
}

function syncRouteQueryFromPanel(panel) {
  const normalized = normalizePanel(panel);
  const current = normalizePanel(route.query.panel);
  if (normalized === current) {
    const currentPanel = String(route.query.panel || '').toLowerCase();
    const isReadWithoutFlag = normalized === 'read' && !currentPanel;
    const isCategories = normalized === 'categories' && currentPanel === 'categories';
    const isWhisper = normalized === 'whisper' && (currentPanel === 'whisper' || currentPanel === 'comments');
    if (isReadWithoutFlag || isCategories || isWhisper) {
      return;
    }
  }
  const nextQuery = { ...route.query };
  if (normalized === 'categories') {
    nextQuery.panel = 'categories';
  } else if (normalized === 'whisper') {
    nextQuery.panel = 'whisper';
  } else {
    delete nextQuery.panel;
  }
  router.replace({ name: 'blog', query: nextQuery });
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
    title: normalizeString(raw?.title) || '未命名文章',
    summary: normalizeString(raw?.summary),
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url),
    visibility: normalizeString(raw?.visibility, 'PUBLIC').toUpperCase(),
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    tags: normalizeTags(raw?.tags),
    wordCount: Math.max(0, Number(raw?.wordCount ?? raw?.word_count) || 0),
    readingMinutes: Math.max(1, Number(raw?.readingMinutes ?? raw?.reading_minutes) || 1),
    likeCount: Math.max(0, Number(raw?.likeCount ?? raw?.like_count) || 0),
    publishedAt: raw?.publishedAt ?? raw?.published_at ?? null
  };
}

function normalizeLatestPost(raw) {
  return {
    postId: Number(raw?.postId ?? raw?.post_id) || 0,
    title: normalizeString(raw?.title) || '未命名文章',
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url),
    publishedAt: raw?.publishedAt ?? raw?.published_at ?? null
  };
}

function normalizeCategoryStat(raw) {
  return {
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    count: Math.max(0, Number(raw?.count) || 0),
    displayName: normalizeString(raw?.displayName ?? raw?.display_name),
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url)
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

function normalizeCategoryMetaItem(raw) {
  return {
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    displayName: normalizeString(raw?.displayName ?? raw?.display_name),
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url),
    sortNum: Number(raw?.sortNum ?? raw?.sort_num) || 1000,
    enabled: raw?.enabled !== false
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

async function reloadCategoryMetas() {
  if (!canManageCategories.value) return;
  categoryMetaError.value = '';
  categoryMetaLoading.value = true;
  try {
    const payload = await listBlogCategoryMetas(auth.authorizedFetch);
    categoryMetaItems.value = Array.isArray(payload)
      ? payload.map(normalizeCategoryMetaItem).filter((item) => item.categoryCode)
      : [];
  } catch (error) {
    categoryMetaItems.value = [];
    categoryMetaError.value = normalizeErrorMessage(error, '加载分类管理数据失败');
  } finally {
    categoryMetaLoading.value = false;
  }
}

async function saveCategoryMetaItem(payload) {
  if (!canManageCategories.value) {
    uiState.actionHint = '只有管理员可以修改分类';
    return;
  }
  const categoryCode = normalizeString(payload?.categoryCode).toLowerCase();
  if (!categoryCode) {
    categoryMetaError.value = '分类编码不能为空';
    return;
  }
  categoryMetaSaving.value = true;
  categoryMetaError.value = '';
  try {
    const saved = await updateBlogCategoryMeta(
      categoryCode,
      {
        displayName: normalizeString(payload?.displayName),
        coverImageUrl: normalizeString(payload?.coverImageUrl),
        sortNum: Number(payload?.sortNum),
        enabled: payload?.enabled !== false
      },
      auth.authorizedFetch
    );
    const normalized = normalizeCategoryMetaItem(saved);
    const index = categoryMetaItems.value.findIndex((item) => item.categoryCode === normalized.categoryCode);
    if (index >= 0) {
      categoryMetaItems.value[index] = normalized;
    } else {
      categoryMetaItems.value.push(normalized);
    }
    await loadSidebar();
    uiState.actionHint = `分类 ${categoryCode} 已保存`;
  } catch (error) {
    categoryMetaError.value = normalizeErrorMessage(error, '保存分类失败');
  } finally {
    categoryMetaSaving.value = false;
  }
}

async function uploadCategoryMetaCover(payload) {
  if (!canManageCategories.value) {
    uiState.actionHint = '只有管理员可以上传分类图片';
    return;
  }
  const categoryCode = normalizeString(payload?.categoryCode).toLowerCase();
  const file = payload?.file;
  if (!categoryCode || !(file instanceof File)) {
    categoryMetaError.value = '请选择分类图片后再上传';
    return;
  }
  categoryMetaUploadingCode.value = categoryCode;
  categoryMetaError.value = '';
  try {
    const uploadResult = await uploadBlogCategoryCover(file, auth.authorizedFetch);
    const url = normalizeString(uploadResult?.url);
    if (!url) {
      throw new Error('分类图片地址为空');
    }
    const original = categoryMetaItems.value.find((item) => item.categoryCode === categoryCode);
    await saveCategoryMetaItem({
      categoryCode,
      displayName: original?.displayName || categoryCode,
      coverImageUrl: url,
      sortNum: original?.sortNum ?? 1000,
      enabled: original?.enabled !== false
    });
  } catch (error) {
    categoryMetaError.value = normalizeErrorMessage(error, '上传分类图片失败');
  } finally {
    categoryMetaUploadingCode.value = '';
  }
}

function setPanel(nextPanel) {
  if (nextPanel === 'write') {
    if (!canWrite.value) {
      uiState.actionHint = '当前账号暂无写文权限';
      return;
    }
    uiState.actionHint = '';
    openEditor();
    return;
  }
  uiState.panel = normalizePanel(nextPanel);
  uiState.actionHint = '';
  if (uiState.panel === 'categories' && canManageCategories.value) {
    reloadCategoryMetas();
  }
  syncRouteQueryFromPanel(uiState.panel);
}

function viewCategory(categoryCode) {
  applyCategoryFilter(categoryCode);
  setPanel('read');
}

function resetWhisperForm() {
  whisperState.form.content = '';
  whisperState.form.nickname = '';
  whisperState.form.remark = '';
  whisperState.form.postId = '';
  whisperState.error = '';
  whisperState.notice = '';
}

async function submitWhisper() {
  whisperState.error = '';
  whisperState.notice = '';
  const content = normalizeString(whisperState.form.content).trim();
  if (!content) {
    whisperState.error = '请先填写悄悄话内容';
    return;
  }

  whisperState.submitting = true;
  try {
    const postId = Number.parseInt(String(whisperState.form.postId || ''), 10);
    await submitPostWhisper(
      {
        content,
        nickname: normalizeString(whisperState.form.nickname).trim(),
        remark: normalizeString(whisperState.form.remark).trim(),
        postId: Number.isFinite(postId) && postId > 0 ? postId : undefined
      },
      resolveAuthorizedFetch()
    );
    whisperState.notice = '已发送给作者，感谢你的留言。';
    whisperState.form.content = '';
  } catch (error) {
    whisperState.error = normalizeErrorMessage(error, '发送悄悄话失败');
  } finally {
    whisperState.submitting = false;
  }
}

function toggleLeftPanelCollapsed() {
  leftPanelCollapsed.value = !leftPanelCollapsed.value;
}

function openLeftPanel() {
  leftPanelCollapsed.value = false;
}

function toggleRightPanelCollapsed() {
  rightPanelCollapsed.value = !rightPanelCollapsed.value;
  rightPanelTouchedByUser.value = true;
}

function openRightPanel() {
  rightPanelCollapsed.value = false;
  rightPanelTouchedByUser.value = true;
}

function openEditor() {
  router.push({ name: 'blog-editor' });
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
  leftPanelCollapsed.value = readPersistedLeftPanelCollapsed();
  await auth.ensureReady();
  syncPanelFromRouteQuery();
  if (uiState.panel === 'categories' && canManageCategories.value) {
    await reloadCategoryMetas();
  }
  await Promise.all([loadPostList(), loadSidebar()]);
});

watch(
  () => route.query.panel,
  () => {
    syncPanelFromRouteQuery();
    if (uiState.panel === 'categories' && canManageCategories.value) {
      reloadCategoryMetas();
    }
  }
);

watch(
  () => leftPanelCollapsed.value,
  (value) => {
    persistLeftPanelCollapsed(value);
  }
);

watch(
  () => viewportZone.value,
  (zone, previousZone) => {
    if (zone === 'mobile') {
      rightPanelCollapsed.value = false;
      rightPanelTouchedByUser.value = false;
      return;
    }
    if (zone === 'wide') {
      rightPanelCollapsed.value = false;
      rightPanelTouchedByUser.value = false;
      return;
    }
    if (zone === 'narrow') {
      if (previousZone !== 'narrow' || !rightPanelTouchedByUser.value) {
        rightPanelCollapsed.value = recommendedRightCollapsed.value;
        rightPanelTouchedByUser.value = false;
      }
    }
  },
  { immediate: true }
);

onBeforeUnmount(() => {
  window.removeEventListener('pointermove', handleCategoryStripPointerMove);
  window.removeEventListener('pointerup', handleCategoryStripPointerUp);
});
</script>

<style scoped>
.blog-list-page {
  --blog-gap: clamp(8px, 0.9vw, 14px);
  --blog-panel-padding: clamp(8px, 0.8vw, 12px);
  --blog-left-width: clamp(200px, 18vw, 248px);
  --blog-right-width: clamp(190px, 20vw, 288px);
  --blog-right-effective-width: var(--blog-right-width);
  --blog-sidebar-button-size: clamp(28px, 2.2vw, 34px);
  height: 100%;
  min-height: 0;
  overflow: hidden;
  position: relative;
  color: rgba(240, 244, 255, 0.96);
  font-family: 'Noto Sans SC', 'PingFang SC', 'Helvetica Neue', sans-serif;
}

.blog-shell {
  height: 100%;
  min-height: 0;
  display: grid;
  grid-template-columns: var(--blog-left-width) minmax(0, 1fr);
  gap: var(--blog-gap);
  transition: grid-template-columns 200ms ease;
}

.blog-shell.left-panel-collapsed {
  --blog-left-width: 0px;
}

.blog-shell.right-panel-collapsed {
  --blog-right-effective-width: 0px;
}

.left-switch {
  --liquid-bg: rgba(11, 16, 27, 0.54);
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 14px 30px rgba(6, 9, 16, 0.24);
  border-radius: 14px;
  padding: var(--blog-panel-padding);
  display: grid;
  align-content: start;
  gap: 8px;
  min-width: 0;
  overflow: hidden;
  transition:
    opacity 0.2s ease,
    padding 0.2s ease,
    border-color 0.2s ease;
}

.left-switch.collapsed {
  padding: 0;
  gap: 0;
  max-height: 0;
  border-color: transparent;
  opacity: 0;
  pointer-events: none;
}

.left-switch-head {
  display: flex;
  justify-content: flex-end;
  align-items: center;
  margin-bottom: -2px;
}

.sidebar-collapse-btn {
  width: var(--blog-sidebar-button-size);
  height: var(--blog-sidebar-button-size);
  font-size: 12px;
}

.icon-circle-btn {
  border: 1px solid rgba(255, 255, 255, 0.24);
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.14);
  color: rgba(241, 246, 255, 0.96);
  display: inline-grid;
  place-items: center;
}

.sidebar-reopen-btn {
  position: absolute;
  top: 50%;
  transform: translateY(-50%);
  width: calc(var(--blog-sidebar-button-size, 30px) + 2px);
  height: clamp(46px, 6.2vh, 58px);
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(18, 26, 40, 0.68);
  color: rgba(232, 241, 255, 0.95);
  z-index: 1250;
}

.sidebar-reopen-left {
  left: 4px;
}

.sidebar-reopen-right {
  right: 4px;
}

.switch-btn {
  border: 1px solid rgba(255, 255, 255, 0.18);
  border-radius: 10px;
  min-height: 38px;
  padding: 0 10px;
  background: rgba(255, 255, 255, 0.1);
  color: rgba(236, 243, 255, 0.95);
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
}

.switch-btn.active {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.28);
  box-shadow: 0 10px 20px rgba(var(--accent-rgb), 0.2);
}

.switch-btn.disabled {
  opacity: 0.48;
}

.action-hint {
  margin-top: 6px;
  font-size: 12px;
  color: rgba(243, 198, 168, 0.98);
}

.main-column {
  height: 100%;
  min-height: 0;
  display: flex;
  flex-direction: column;
  gap: var(--blog-gap);
  overflow: hidden;
}

.search-panel {
  --liquid-bg: rgba(10, 16, 28, 0.52);
  --liquid-border: rgba(255, 255, 255, 0.18);
  --liquid-shadow: 0 12px 24px rgba(4, 9, 16, 0.24);
  border-radius: 14px;
  padding: var(--blog-panel-padding);
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
  min-height: 32px;
  border-radius: 9px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.14);
  color: rgba(241, 246, 255, 0.96);
  padding: 0 10px;
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
  padding: calc(var(--blog-panel-padding) - 2px);
  display: flex;
  align-items: center;
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
  min-height: 32px;
  padding: 0 10px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(236, 243, 255, 0.95);
  display: inline-flex;
  align-items: center;
  gap: 8px;
  white-space: nowrap;
}

.category-pill-cover {
  width: 20px;
  height: 20px;
  border-radius: 999px;
  object-fit: cover;
  border: 1px solid rgba(255, 255, 255, 0.2);
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

.strip-meta {
  margin-left: auto;
  font-size: 12px;
  white-space: nowrap;
  color: rgba(204, 215, 242, 0.88);
}

.content-layout {
  flex: 1;
  min-height: 0;
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(0, var(--blog-right-effective-width));
  gap: var(--blog-gap);
  overflow: hidden;
}

.content-layout.right-panel-collapsed {
  --blog-right-effective-width: 0px;
}

.feed-column {
  min-height: 0;
  height: 100%;
  display: grid;
  align-content: start;
  gap: var(--blog-gap);
  width: 100%;
  max-width: none;
  min-width: 0;
}

.feed-card {
  --liquid-bg: rgba(7, 10, 17, 0.78);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 16px 26px rgba(5, 8, 14, 0.26);
  border-radius: 12px;
  display: grid;
  grid-template-columns: minmax(136px, 34%) minmax(0, 1fr);
  grid-template-areas: 'cover content';
  height: clamp(152px, 18vw, 206px);
  min-height: 0;
  overflow: hidden;
  cursor: pointer;
  transition: transform 180ms ease, box-shadow 200ms ease;
  animation: reveal-up 350ms ease both;
  animation-delay: calc(var(--stagger) * 36ms);
}

.feed-card.reverse {
  grid-template-columns: minmax(0, 1fr) minmax(136px, 34%);
  grid-template-areas: 'content cover';
}

.feed-card:hover {
  transform: translateY(-1px);
  box-shadow: 0 18px 30px rgba(2, 4, 8, 0.3);
}

.cover-pane {
  grid-area: cover;
  position: relative;
  overflow: hidden;
}

.cover-pane img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  transition: transform 260ms ease;
}

.feed-card:hover .cover-pane img {
  transform: scale(1.02);
}

.content-pane {
  grid-area: content;
  padding: clamp(10px, 1.05vw, 14px);
  display: grid;
  gap: 6px;
  align-content: start;
}

.content-pane h2 {
  font-size: clamp(16px, 1.5vw, 22px);
  line-height: 1.25;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.meta-row {
  display: flex;
  flex-wrap: wrap;
  gap: 6px 10px;
  font-size: 11px;
  color: rgba(202, 214, 240, 0.9);
}

.summary {
  color: rgba(221, 230, 248, 0.92);
  line-height: 1.5;
  font-size: 13px;
  display: -webkit-box;
  -webkit-line-clamp: 2;
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
  padding: 2px 8px;
  font-size: 12px;
}

.tag-chip.active {
  border-color: rgba(var(--accent-rgb), 0.6);
  background: rgba(var(--accent-rgb), 0.3);
}

.pagination-wrap {
  margin-top: 2px;
  position: sticky;
  bottom: 0;
  z-index: 2;
  padding: 8px 0 4px;
  background: linear-gradient(180deg, rgba(8, 11, 18, 0) 0%, rgba(8, 11, 18, 0.82) 48%);
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.page-btn {
  min-width: 34px;
}

.sidebar-column {
  min-height: 0;
  height: 100%;
  display: grid;
  gap: var(--blog-gap);
  align-content: start;
  transition:
    opacity 0.2s ease,
    transform 0.2s ease;
}

.sidebar-column.collapsed {
  opacity: 0;
  transform: translateX(8px);
  pointer-events: none;
}

.sidebar-column-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  padding: 0 2px;
  color: rgba(204, 218, 247, 0.9);
  font-size: 12px;
  letter-spacing: 0.04em;
  text-transform: uppercase;
}

.side-card {
  --liquid-bg: rgba(8, 11, 20, 0.82);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 16px 28px rgba(5, 8, 14, 0.28);
  border-radius: 12px;
  padding: var(--blog-panel-padding);
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
  font-size: 14px;
}

.head-actions {
  display: flex;
  gap: 6px;
}

.icon-btn {
  border: 1px solid rgba(255, 255, 255, 0.16);
  border-radius: 9px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(237, 244, 255, 0.95);
  min-height: 28px;
  padding: 0 8px;
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 12px;
}

.latest-item {
  border: 0;
  width: 100%;
  border-radius: 10px;
  padding: 4px;
  background: rgba(255, 255, 255, 0.05);
  display: grid;
  grid-template-columns: 46px minmax(0, 1fr);
  gap: 7px;
  text-align: left;
  color: inherit;
}

.latest-item img {
  width: 46px;
  height: 46px;
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
  padding: 7px 10px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  background: rgba(255, 255, 255, 0.06);
  color: rgba(236, 243, 255, 0.94);
}

.category-row-main {
  min-width: 0;
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.category-row-cover {
  width: 22px;
  height: 22px;
  border-radius: 6px;
  object-fit: cover;
  border: 1px solid rgba(255, 255, 255, 0.18);
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

.category-panel,
.whisper-panel {
  --liquid-bg: rgba(10, 15, 24, 0.8);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 16px 28px rgba(5, 8, 14, 0.28);
  border-radius: 14px;
  padding: clamp(14px, 1.3vw, 18px);
  min-height: 0;
  display: grid;
  gap: 10px;
}

.category-panel h2,
.whisper-panel h2 {
  font-size: 22px;
}

.category-panel p,
.whisper-panel p {
  color: rgba(214, 225, 247, 0.9);
  line-height: 1.7;
}

.category-panel-grid {
  display: grid;
  gap: 10px;
}

.category-panel-card {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(236, 243, 255, 0.96);
  text-align: left;
  padding: 9px;
  display: grid;
  grid-template-columns: 62px minmax(0, 1fr);
  gap: 10px;
}

.category-panel-card img {
  width: 62px;
  height: 62px;
  border-radius: 10px;
  object-fit: cover;
}

.category-panel-card-main {
  min-width: 0;
  display: grid;
  align-content: center;
  gap: 4px;
}

.category-panel-card-main strong {
  font-size: 14px;
  line-height: 1.3;
}

.category-panel-card-main span {
  font-size: 12px;
  color: rgba(205, 218, 245, 0.88);
}

.whisper-form {
  display: grid;
  gap: 10px;
}

.whisper-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.whisper-field {
  display: grid;
  gap: 6px;
}

.whisper-field span {
  font-size: 12px;
  color: rgba(210, 223, 246, 0.92);
}

.whisper-field textarea,
.whisper-field input,
.whisper-field select {
  width: 100%;
  min-height: 36px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(9, 14, 25, 0.62);
  color: rgba(239, 244, 255, 0.96);
  padding: 8px 10px;
}

.whisper-field textarea {
  resize: vertical;
  min-height: 108px;
}

.whisper-field textarea:focus,
.whisper-field input:focus,
.whisper-field select:focus {
  outline: none;
  border-color: rgba(var(--accent-rgb), 0.62);
  box-shadow: 0 0 0 3px rgba(var(--accent-rgb), 0.2);
}

.whisper-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
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
  transform: translateX(14px);
}

@keyframes reveal-up {
  from {
    opacity: 0;
    transform: translateY(8px);
  }
  to {
    opacity: 1;
    transform: translateY(0);
  }
}

@media (max-width: 1365px) {
  .blog-shell {
    --blog-left-width: clamp(188px, 19vw, 232px);
    --blog-right-width: clamp(170px, 20vw, 236px);
  }
}

@media (max-width: 1200px) {
  .blog-shell {
    --blog-left-width: clamp(160px, 17vw, 196px);
    --blog-right-width: clamp(156px, 18vw, 210px);
  }
}

@media (max-width: 1080px) {
  .blog-shell {
    --blog-left-width: clamp(148px, 16vw, 176px);
    --blog-right-width: clamp(142px, 16.5vw, 188px);
  }
}

@media (max-width: 980px) {
  .blog-shell {
    --blog-left-width: 1fr;
    --blog-right-width: 1fr;
    --blog-right-effective-width: 1fr;
    grid-template-columns: 1fr;
  }

  .content-layout,
  .content-layout.right-panel-collapsed {
    grid-template-columns: 1fr;
  }

  .sidebar-column,
  .sidebar-column.collapsed {
    opacity: 1;
    transform: none;
    pointer-events: auto;
  }

  .sidebar-column-head {
    display: none;
  }

  .left-switch {
    grid-template-columns: repeat(4, minmax(0, 1fr));
    align-items: center;
  }

  .left-switch-head {
    grid-column: 1 / -1;
  }

  .action-hint {
    grid-column: 1 / -1;
    margin-top: 0;
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
    min-height: 160px;
  }

  .content-pane {
    padding: 12px;
  }

  .sidebar-column {
    grid-template-columns: 1fr;
  }

  .head-actions {
    flex-wrap: wrap;
    justify-content: flex-end;
  }

  .whisper-grid {
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
