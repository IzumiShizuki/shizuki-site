<template>
  <section class="route-page blog-page">
    <header class="page-header">
      <p class="eyebrow">Blog Module</p>
      <h1>博客</h1>
      <p>一期已接入：列表、详情、双模式 TOC、阅读进度、Markdown 下载、草稿/发布与粘贴 Markdown 智能识别。</p>
    </header>

    <div class="toolbar liquid-material">
      <form class="search-form" @submit.prevent="handleSearchSubmit">
        <input v-model.trim="filters.keyword" type="text" class="field-input" placeholder="搜索标题/摘要/标签" />
        <button type="submit" class="mini-btn ripple-trigger">搜索</button>
        <button type="button" class="mini-btn ripple-trigger" @click="resetFilters">重置</button>
      </form>
      <div class="toolbar-meta">
        <span>共 {{ listState.total }} 篇</span>
        <span v-if="loadingAny">加载中...</span>
      </div>
    </div>

    <div class="blog-layout">
      <aside class="left-panel liquid-material">
        <section class="side-block">
          <h2>分类</h2>
          <div class="chip-group">
            <button
              v-for="category in categoryOptions"
              :key="category.code || 'all'"
              type="button"
              class="chip-btn ripple-trigger"
              :class="{ active: filters.category === category.code }"
              @click="applyCategoryFilter(category.code)"
            >
              {{ category.label }}
            </button>
          </div>
        </section>

        <section class="side-block">
          <h2>标签</h2>
          <div class="chip-group">
            <button
              v-for="tag in tagOptions"
              :key="tag"
              type="button"
              class="chip-btn ripple-trigger"
              :class="{ active: filters.tag === tag }"
              @click="applyTagFilter(tag)"
            >
              #{{ tag }}
            </button>
          </div>
        </section>

        <section class="side-block policy-block">
          <h2>访问策略</h2>
          <p>PUBLIC 文章默认可见。</p>
          <p>分类策略默认：`game` 仅 `USER / FRIEND / ADMIN` 可访问。</p>
          <p>文章级 `GROUP / PRIVATE` 会覆盖分类策略。</p>
        </section>

        <section v-if="canWrite" class="side-block">
          <div class="mine-head">
            <h2>我的文章</h2>
            <button type="button" class="mini-btn ripple-trigger" @click="startNewDraft">新建</button>
          </div>
          <div class="mine-list">
            <button
              v-for="mine in writerState.myPosts"
              :key="mine.postId"
              type="button"
              class="mine-item ripple-trigger"
              :class="{ active: viewMode === 'editor' && writerState.editor.postId === mine.postId }"
              @click="openMinePost(mine.postId)"
            >
              <span class="mine-title">{{ mine.title }}</span>
              <span class="mine-meta">{{ mine.statusCode }} · {{ mine.visibility }}</span>
            </button>
            <p v-if="writerState.loading" class="side-tip">加载我的文章中...</p>
            <p v-else-if="!writerState.myPosts.length" class="side-tip">暂无草稿或文章。</p>
          </div>
        </section>
      </aside>

      <section class="center-panel liquid-material">
        <div class="center-tabs">
          <button
            type="button"
            class="tab-btn ripple-trigger"
            :class="{ active: viewMode === 'list' }"
            @click="switchViewMode('list')"
          >
            列表
          </button>
          <button
            type="button"
            class="tab-btn ripple-trigger"
            :class="{ active: viewMode === 'detail' }"
            :disabled="!detailState.post"
            @click="switchViewMode('detail')"
          >
            详情
          </button>
          <button
            v-if="canWrite"
            type="button"
            class="tab-btn ripple-trigger"
            :class="{ active: viewMode === 'editor' }"
            @click="switchViewMode('editor')"
          >
            编辑
          </button>
        </div>

        <div v-if="viewMode === 'list'" class="list-view">
          <p v-if="listState.error" class="error-text">{{ listState.error }}</p>
          <div class="post-list">
            <article
              v-for="post in listState.items"
              :key="post.postId"
              class="post-card liquid-material ripple-trigger"
              @click="openPostDetail(post.postId)"
            >
              <header class="card-head">
                <h3>{{ post.title }}</h3>
                <span class="visibility">{{ post.visibility }}</span>
              </header>
              <p class="summary">{{ post.summary }}</p>
              <div class="meta-row">
                <span>{{ post.categoryCode || 'uncategorized' }}</span>
                <span>{{ post.readingMinutes }} 分钟</span>
                <span>❤ {{ post.likeCount }}</span>
                <span>{{ formatDateTime(post.publishedAt) }}</span>
              </div>
              <div v-if="post.tags.length" class="tag-row">
                <span v-for="tag in post.tags" :key="`${post.postId}-${tag}`" class="tag-chip">#{{ tag }}</span>
              </div>
            </article>
            <p v-if="!listState.loading && !listState.items.length" class="empty-text">暂无符合条件的文章。</p>
          </div>
        </div>

        <div v-else-if="viewMode === 'detail'" class="detail-view">
          <p v-if="detailState.error" class="error-text">{{ detailState.error }}</p>
          <template v-else-if="detailState.post">
            <header class="detail-head">
              <h2>{{ detailState.post.title }}</h2>
              <p class="detail-summary">{{ detailState.post.summary }}</p>
              <div class="meta-row">
                <span>{{ detailState.post.categoryCode || 'uncategorized' }}</span>
                <span>{{ detailState.post.readingMinutes }} 分钟</span>
                <span>❤ {{ detailState.post.likeCount }}</span>
                <span>{{ formatDateTime(detailState.post.publishedAt) }}</span>
              </div>
              <div v-if="detailState.post.tags.length" class="tag-row">
                <span v-for="tag in detailState.post.tags" :key="`detail-${tag}`" class="tag-chip">#{{ tag }}</span>
              </div>
              <div class="detail-actions">
                <button type="button" class="mini-btn ripple-trigger" @click="switchViewMode('list')">返回列表</button>
                <button type="button" class="mini-btn ripple-trigger" @click="downloadCurrentMarkdown">下载 Markdown</button>
                <button v-if="canWrite" type="button" class="mini-btn ripple-trigger" @click="openCurrentPostInEditor">在编辑器打开</button>
              </div>
            </header>

            <div ref="articleScrollRef" class="detail-scroll">
              <article ref="markdownBodyRef" class="markdown-body" v-html="detailState.renderedHtml"></article>
            </div>
          </template>
          <p v-else class="empty-text">请选择一篇文章进入详情。</p>
        </div>

        <div v-else class="editor-view">
          <div class="editor-grid">
            <label class="field">
              <span>标题</span>
              <input v-model.trim="writerState.editor.title" type="text" class="field-input" maxlength="255" />
            </label>
            <label class="field">
              <span>分类</span>
              <input v-model.trim="writerState.editor.categoryCode" type="text" class="field-input" placeholder="如：life / game / dev" />
            </label>
            <label class="field field-wide">
              <span>摘要</span>
              <input v-model.trim="writerState.editor.summary" type="text" class="field-input" maxlength="500" />
            </label>
            <label class="field">
              <span>Slug（可选）</span>
              <input v-model.trim="writerState.editor.slugCode" type="text" class="field-input" />
            </label>
            <label class="field">
              <span>可见性</span>
              <select v-model="writerState.editor.visibility" class="field-input">
                <option value="PUBLIC">PUBLIC</option>
                <option value="PRIVATE">PRIVATE</option>
                <option value="GROUP">GROUP</option>
              </select>
            </label>
            <label class="field field-wide">
              <span>标签（逗号分隔）</span>
              <input v-model.trim="writerState.editor.tagsText" type="text" class="field-input" placeholder="#spring,#vue,#ai" />
            </label>
            <label class="field field-wide">
              <span>GROUP 分组（仅 GROUP 可见性生效）</span>
              <input v-model.trim="writerState.editor.allowedGroupCodesText" type="text" class="field-input" placeholder="USER,FRIEND,ADMIN" />
            </label>
            <label class="field field-wide file-field">
              <span>Markdown 文件上传（relay）</span>
              <input type="file" accept=".md,text/markdown,text/plain" @change="handleMarkdownFileUpload" />
            </label>
          </div>

          <div class="editor-actions">
            <button type="button" class="mini-btn ripple-trigger" :disabled="writerState.saving" @click="handleSaveDraft">保存草稿</button>
            <button
              type="button"
              class="mini-btn ripple-trigger"
              :disabled="writerState.publishing || !canPublish || !writerState.editor.postId"
              @click="handlePublish"
            >
              发布
            </button>
            <button
              type="button"
              class="mini-btn ripple-trigger"
              :disabled="writerState.publishing || !canPublish || !writerState.editor.postId"
              @click="handleUnpublish"
            >
              下线
            </button>
            <button type="button" class="mini-btn ripple-trigger" @click="resetEditorForm">清空</button>
            <button type="button" class="mini-btn ripple-trigger" @click="resetPasteSessionDecision">重置粘贴判断</button>
            <span class="editor-status">
              {{ writerState.editor.statusCode || 'DRAFT' }}
              <span v-if="pasteState.sessionDecision"> · 粘贴记忆：{{ pasteState.sessionDecision === 'markdown' ? '按 Markdown' : '按纯文本' }}</span>
            </span>
          </div>

          <p v-if="writerState.error" class="error-text">{{ writerState.error }}</p>
          <p v-if="writerState.notice" class="notice-text">{{ writerState.notice }}</p>

          <div class="editor-body">
            <label class="editor-pane">
              <span>正文编辑区</span>
              <textarea
                ref="editorTextareaRef"
                v-model="writerState.editor.markdown"
                class="markdown-editor"
                placeholder="在这里写 Markdown 内容..."
                @paste="handleEditorPaste"
              ></textarea>
            </label>
            <section class="editor-pane preview-pane">
              <span>预览</span>
              <article class="markdown-body" v-html="editorPreviewHtml"></article>
            </section>
          </div>
        </div>
      </section>

      <aside class="right-panel liquid-material">
        <div class="toc-head">
          <h2>文内目录</h2>
          <div v-if="viewMode === 'detail'" class="toc-mode-switch">
            <button type="button" class="mini-btn ripple-trigger" :class="{ active: tocMode === 'all' }" @click="tocMode = 'all'">
              全部展开
            </button>
            <button
              type="button"
              class="mini-btn ripple-trigger"
              :class="{ active: tocMode === 'onlyCurrentTree' }"
              @click="tocMode = 'onlyCurrentTree'"
            >
              当前小节
            </button>
          </div>
        </div>

        <template v-if="viewMode === 'detail' && detailState.post">
          <div class="toc-metrics">
            <p>L{{ activeLine }} / {{ detailLineCount }}</p>
            <p>{{ detailState.post.wordCount }} 字 · {{ detailState.post.readingMinutes }} 分钟</p>
            <p>已读 {{ progressPercent }}%</p>
          </div>
          <nav class="toc-list">
            <button
              v-for="heading in visibleTocHeadings"
              :key="heading.id"
              type="button"
              class="toc-item ripple-trigger"
              :class="{ active: heading.id === activeHeadingId }"
              :style="tocIndentStyle(heading)"
              @click="scrollToHeading(heading.id)"
            >
              {{ heading.text }}
            </button>
            <p v-if="!visibleTocHeadings.length" class="side-tip">当前文章暂无可展示目录。</p>
          </nav>
        </template>
        <p v-else class="side-tip">进入文章详情后，这里会显示 TOC 与阅读信息。</p>
      </aside>
    </div>

    <button v-if="showProgressFab" type="button" class="progress-fab liquid-material ripple-trigger" @click="scrollToTop">
      <svg viewBox="0 0 52 52" class="progress-ring" aria-hidden="true">
        <circle class="progress-ring-bg" cx="26" cy="26" r="20"></circle>
        <circle
          class="progress-ring-value"
          cx="26"
          cy="26"
          r="20"
          :stroke-dasharray="progressCircumference"
          :stroke-dashoffset="progressDashoffset"
        ></circle>
      </svg>
      <span>{{ progressPercent }}%</span>
      <span>回到顶部</span>
    </button>

    <div v-if="pasteState.dialogVisible" class="dialog-mask" @click.self="cancelPasteDialog">
      <section class="paste-dialog liquid-material">
        <h3>检测到疑似 Markdown</h3>
        <p>是否按 Markdown 插入？本次选择会在当前会话内记忆。</p>
        <div class="dialog-actions">
          <button type="button" class="mini-btn ripple-trigger" @click="confirmPasteDialog('markdown')">是，按 Markdown 插入</button>
          <button type="button" class="mini-btn ripple-trigger" @click="confirmPasteDialog('plain')">否，按纯文本转义插入</button>
        </div>
      </section>
    </div>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useAuthSession } from '../composables/useAuthSession';
import {
  createMyPost,
  getMyPostDetail,
  getPostDetail,
  getPostMarkdown,
  listMyPosts,
  listPosts,
  publishMyPost,
  relayPostMarkdown,
  unpublishMyPost,
  updateMyPost
} from '../services/blogApi';
import { escapeMarkdownPlainText, looksLikeMarkdown, renderMarkdownDocument } from '../utils/blogMarkdown';

const DEFAULT_CATEGORY_OPTIONS = [
  { code: '', label: '全部' },
  { code: 'life', label: 'life' },
  { code: 'dev', label: 'dev' },
  { code: 'game', label: 'game 🔒' }
];

const auth = useAuthSession();

const filters = reactive({
  keyword: '',
  category: '',
  tag: ''
});

const listState = reactive({
  loading: false,
  error: '',
  items: [],
  pageNo: 1,
  pageSize: 24,
  total: 0
});

const detailState = reactive({
  loading: false,
  error: '',
  post: null,
  renderedHtml: '',
  headings: [],
  renderedLineCount: 0
});

const writerState = reactive({
  loading: false,
  saving: false,
  publishing: false,
  error: '',
  notice: '',
  myPosts: [],
  editor: {
    postId: null,
    title: '',
    summary: '',
    categoryCode: 'life',
    slugCode: '',
    visibility: 'PUBLIC',
    tagsText: '',
    allowedGroupCodesText: 'USER,FRIEND,ADMIN',
    markdown: '',
    markdownBucket: '',
    markdownKey: '',
    statusCode: 'DRAFT',
    lastRelayedSignature: ''
  }
});

const pasteState = reactive({
  dialogVisible: false,
  pendingText: '',
  selectionStart: 0,
  selectionEnd: 0,
  sessionDecision: ''
});

const viewMode = ref('list');
const tocMode = ref('all');
const activeHeadingId = ref('');
const readingProgress = ref(0);

const articleScrollRef = ref(null);
const markdownBodyRef = ref(null);
const editorTextareaRef = ref(null);

let headingDomNodes = [];
let boundScrollRoot = null;

const groupCodes = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.map((group) => String(group || '').trim().toUpperCase()).filter(Boolean);
});

const permissionCodes = computed(() => {
  const permissions = Array.isArray(auth.user.value?.permissions) ? auth.user.value.permissions : [];
  return permissions.map((code) => String(code || '').trim().toLowerCase()).filter(Boolean);
});

const isAdminUser = computed(() => groupCodes.value.includes('ADMIN'));
const canWrite = computed(() => isAdminUser.value || permissionCodes.value.includes('blog.post.write'));
const canPublish = computed(() => isAdminUser.value || permissionCodes.value.includes('blog.post.publish'));
const loadingAny = computed(() => listState.loading || detailState.loading || writerState.loading || writerState.saving || writerState.publishing);

const categoryOptions = computed(() => {
  const dynamicCodes = new Set();
  listState.items.forEach((post) => {
    if (post.categoryCode) dynamicCodes.add(post.categoryCode);
  });
  writerState.myPosts.forEach((post) => {
    if (post.categoryCode) dynamicCodes.add(post.categoryCode);
  });

  const dynamic = Array.from(dynamicCodes)
    .filter((code) => !DEFAULT_CATEGORY_OPTIONS.some((item) => item.code === code))
    .sort((a, b) => a.localeCompare(b))
    .map((code) => ({ code, label: code }));
  return [...DEFAULT_CATEGORY_OPTIONS, ...dynamic];
});

const tagOptions = computed(() => {
  const tags = new Set();
  listState.items.forEach((post) => {
    post.tags.forEach((tag) => tags.add(tag));
  });
  return Array.from(tags).sort((a, b) => a.localeCompare(b)).slice(0, 48);
});

const visibleTocHeadings = computed(() => {
  const headings = Array.isArray(detailState.headings) ? detailState.headings : [];
  if (tocMode.value === 'all') return headings;
  if (!headings.length) return [];
  const active = headings.find((item) => item.id === activeHeadingId.value) || headings[0];
  const rootId = active?.rootId || active?.id;
  return headings.filter((item) => item.rootId === rootId);
});

const activeHeading = computed(() => {
  const headings = Array.isArray(detailState.headings) ? detailState.headings : [];
  return headings.find((item) => item.id === activeHeadingId.value) || headings[0] || null;
});

const activeLine = computed(() => activeHeading.value?.line || 0);
const detailLineCount = computed(() => toSafeInt(detailState.post?.lineCount, detailState.renderedLineCount));
const progressPercent = computed(() => Math.round(readingProgress.value * 100));
const showProgressFab = computed(() => viewMode.value === 'detail' && Boolean(detailState.post));

const progressRadius = 20;
const progressCircumference = 2 * Math.PI * progressRadius;
const progressDashoffset = computed(() => progressCircumference * (1 - readingProgress.value));

const editorPreview = computed(() => renderMarkdownDocument(writerState.editor.markdown));
const editorPreviewHtml = computed(() => editorPreview.value.html);

function toSafeInt(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? Math.trunc(normalized) : fallback;
}

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
    postId: toSafeInt(raw?.postId ?? raw?.post_id, 0),
    title: normalizeString(raw?.title),
    summary: normalizeString(raw?.summary),
    visibility: normalizeString(raw?.visibility, 'PUBLIC').toUpperCase(),
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    tags: normalizeTags(raw?.tags),
    readingMinutes: Math.max(1, toSafeInt(raw?.readingMinutes ?? raw?.reading_minutes, 1)),
    likeCount: Math.max(0, toSafeInt(raw?.likeCount ?? raw?.like_count, 0)),
    publishedAt: raw?.publishedAt ?? raw?.published_at ?? null
  };
}

function normalizePostDetail(raw) {
  return {
    postId: toSafeInt(raw?.postId ?? raw?.post_id, 0),
    title: normalizeString(raw?.title),
    summary: normalizeString(raw?.summary),
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    slugCode: normalizeString(raw?.slugCode ?? raw?.slug_code),
    visibility: normalizeString(raw?.visibility, 'PUBLIC').toUpperCase(),
    statusCode: normalizeString(raw?.statusCode ?? raw?.status_code, 'DRAFT').toUpperCase(),
    tags: normalizeTags(raw?.tags),
    wordCount: Math.max(0, toSafeInt(raw?.wordCount ?? raw?.word_count, 0)),
    lineCount: Math.max(0, toSafeInt(raw?.lineCount ?? raw?.line_count, 0)),
    readingMinutes: Math.max(1, toSafeInt(raw?.readingMinutes ?? raw?.reading_minutes, 1)),
    likeCount: Math.max(0, toSafeInt(raw?.likeCount ?? raw?.like_count, 0)),
    publishedAt: raw?.publishedAt ?? raw?.published_at ?? null,
    markdown: normalizeString(raw?.markdown)
  };
}

function normalizeAuthorPost(raw) {
  return {
    postId: toSafeInt(raw?.postId ?? raw?.post_id, 0),
    title: normalizeString(raw?.title),
    summary: normalizeString(raw?.summary),
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    slugCode: normalizeString(raw?.slugCode ?? raw?.slug_code),
    visibility: normalizeString(raw?.visibility, 'PUBLIC').toUpperCase(),
    statusCode: normalizeString(raw?.statusCode ?? raw?.status_code, 'DRAFT').toUpperCase(),
    tags: normalizeTags(raw?.tags),
    readingMinutes: Math.max(1, toSafeInt(raw?.readingMinutes ?? raw?.reading_minutes, 1)),
    likeCount: Math.max(0, toSafeInt(raw?.likeCount ?? raw?.like_count, 0))
  };
}

function parseCodeList(input) {
  return Array.from(
    new Set(
      String(input || '')
        .split(/[\s,，;；]+/)
        .map((item) => item.trim().toUpperCase())
        .filter(Boolean)
    )
  );
}

function parseTagList(input) {
  return Array.from(
    new Set(
      String(input || '')
        .split(/[\s,，;；]+/)
        .map((item) => item.replace(/^#+/, '').trim().toLowerCase())
        .filter(Boolean)
    )
  );
}

function normalizeErrorMessage(error, fallback) {
  const detail = normalizeString(error?.detail).trim();
  if (detail) return detail;
  const message = normalizeString(error?.message).trim();
  return message || fallback;
}

function formatDateTime(value) {
  if (!value) return '-';
  const date = new Date(value);
  if (Number.isNaN(date.getTime())) return String(value);
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')}`;
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
        tag: filters.tag
      },
      resolveAuthorizedFetch()
    );
    const items = Array.isArray(payload?.items) ? payload.items : [];
    listState.items = items.map(normalizePostSummary).filter((post) => post.postId > 0);
    listState.total = toSafeInt(payload?.total, listState.items.length);
  } catch (error) {
    listState.items = [];
    listState.total = 0;
    listState.error = normalizeErrorMessage(error, '加载文章列表失败');
  } finally {
    listState.loading = false;
  }
}

async function loadPostDetail(postId) {
  detailState.loading = true;
  detailState.error = '';
  try {
    const payload = await getPostDetail(postId, resolveAuthorizedFetch());
    const normalized = normalizePostDetail(payload);
    const rendered = renderMarkdownDocument(normalized.markdown);
    detailState.post = normalized;
    detailState.renderedHtml = rendered.html;
    detailState.headings = rendered.headings;
    detailState.renderedLineCount = rendered.lineCount;
    activeHeadingId.value = rendered.headings[0]?.id || '';
    readingProgress.value = 0;
    await nextTick();
    setupReadingScroll();
  } catch (error) {
    teardownReadingScroll();
    detailState.post = null;
    detailState.renderedHtml = '';
    detailState.headings = [];
    detailState.renderedLineCount = 0;
    detailState.error = normalizeErrorMessage(error, '加载文章详情失败');
  } finally {
    detailState.loading = false;
  }
}

async function loadMyPosts() {
  if (!canWrite.value) {
    writerState.myPosts = [];
    return;
  }
  writerState.loading = true;
  writerState.error = '';
  try {
    const payload = await listMyPosts({ pageNo: 1, pageSize: 80 }, auth.authorizedFetch);
    const items = Array.isArray(payload?.items) ? payload.items : [];
    writerState.myPosts = items.map(normalizeAuthorPost).filter((post) => post.postId > 0);
  } catch (error) {
    writerState.error = normalizeErrorMessage(error, '加载我的文章失败');
    writerState.myPosts = [];
  } finally {
    writerState.loading = false;
  }
}

function buildMarkdownSignature(markdown) {
  const text = String(markdown || '');
  let checksum = 0;
  for (let i = 0; i < text.length; i += 1) {
    checksum = (checksum + text.charCodeAt(i) * (i + 1)) % 2147483647;
  }
  return `${text.length}:${checksum}`;
}

async function relayMarkdownText(markdownText) {
  const file = new File([String(markdownText || '')], `blog-${Date.now()}.md`, {
    type: 'text/markdown'
  });
  return relayPostMarkdown(file, auth.authorizedFetch);
}

async function ensureEditorMarkdownRelayed() {
  const markdownText = String(writerState.editor.markdown || '');
  if (!markdownText.trim()) {
    throw new Error('正文不能为空');
  }
  const signature = buildMarkdownSignature(markdownText);
  if (
    signature === writerState.editor.lastRelayedSignature &&
    writerState.editor.markdownBucket &&
    writerState.editor.markdownKey
  ) {
    return;
  }
  const relay = await relayMarkdownText(markdownText);
  writerState.editor.markdownBucket = normalizeString(relay?.bucketName ?? relay?.bucket_name);
  writerState.editor.markdownKey = normalizeString(relay?.objectKey ?? relay?.object_key);
  writerState.editor.lastRelayedSignature = signature;
}

function buildEditorPayload() {
  const visibility = normalizeString(writerState.editor.visibility, 'PUBLIC').toUpperCase();
  return {
    title: writerState.editor.title,
    summary: writerState.editor.summary,
    categoryCode: writerState.editor.categoryCode,
    slugCode: writerState.editor.slugCode || undefined,
    visibility,
    allowedGroupCodes: visibility === 'GROUP' ? parseCodeList(writerState.editor.allowedGroupCodesText) : [],
    tags: parseTagList(writerState.editor.tagsText),
    markdownBucket: writerState.editor.markdownBucket,
    markdownKey: writerState.editor.markdownKey
  };
}

function applyPostDetailToEditor(postDetail) {
  const normalized = normalizePostDetail(postDetail);
  writerState.editor.postId = normalized.postId || null;
  writerState.editor.title = normalized.title;
  writerState.editor.summary = normalized.summary;
  writerState.editor.categoryCode = normalized.categoryCode || 'life';
  writerState.editor.slugCode = normalized.slugCode;
  writerState.editor.visibility = normalized.visibility || 'PUBLIC';
  writerState.editor.tagsText = normalized.tags.map((item) => `#${item}`).join(', ');
  writerState.editor.markdown = normalized.markdown || '';
  writerState.editor.statusCode = normalized.statusCode || 'DRAFT';
  writerState.editor.lastRelayedSignature = '';
}

function applyAuthorPostToEditor(post) {
  const normalized = normalizeAuthorPost(post);
  writerState.editor.postId = normalized.postId || null;
  writerState.editor.statusCode = normalized.statusCode || writerState.editor.statusCode;
}

async function handleSaveDraft(options = {}) {
  if (!canWrite.value) return;
  writerState.saving = true;
  writerState.error = '';
  writerState.notice = '';
  try {
    await ensureEditorMarkdownRelayed();
    const payload = buildEditorPayload();
    const result = writerState.editor.postId
      ? await updateMyPost(writerState.editor.postId, payload, auth.authorizedFetch)
      : await createMyPost(payload, auth.authorizedFetch);
    applyAuthorPostToEditor(result);
    writerState.notice = options.silent ? '' : '草稿已保存';
    await Promise.all([loadMyPosts(), loadPostList()]);
  } catch (error) {
    writerState.error = normalizeErrorMessage(error, '保存草稿失败');
    throw error;
  } finally {
    writerState.saving = false;
  }
}

async function handlePublish() {
  if (!canPublish.value || !writerState.editor.postId) return;
  writerState.publishing = true;
  writerState.error = '';
  writerState.notice = '';
  try {
    await handleSaveDraft({ silent: true });
    const result = await publishMyPost(writerState.editor.postId, auth.authorizedFetch);
    applyAuthorPostToEditor(result);
    writerState.notice = '文章已发布';
    await Promise.all([loadMyPosts(), loadPostList()]);
  } catch (error) {
    writerState.error = normalizeErrorMessage(error, '发布失败');
  } finally {
    writerState.publishing = false;
  }
}

async function handleUnpublish() {
  if (!canPublish.value || !writerState.editor.postId) return;
  writerState.publishing = true;
  writerState.error = '';
  writerState.notice = '';
  try {
    const result = await unpublishMyPost(writerState.editor.postId, auth.authorizedFetch);
    applyAuthorPostToEditor(result);
    writerState.notice = '文章已下线';
    await Promise.all([loadMyPosts(), loadPostList()]);
  } catch (error) {
    writerState.error = normalizeErrorMessage(error, '下线失败');
  } finally {
    writerState.publishing = false;
  }
}

async function handleMarkdownFileUpload(event) {
  const file = event?.target?.files?.[0];
  if (!(file instanceof File)) return;
  writerState.error = '';
  writerState.notice = '';
  try {
    const text = await file.text();
    writerState.editor.markdown = text;
    writerState.editor.lastRelayedSignature = '';
    const relay = await relayPostMarkdown(file, auth.authorizedFetch);
    writerState.editor.markdownBucket = normalizeString(relay?.bucketName ?? relay?.bucket_name);
    writerState.editor.markdownKey = normalizeString(relay?.objectKey ?? relay?.object_key);
    writerState.editor.lastRelayedSignature = buildMarkdownSignature(writerState.editor.markdown);
    writerState.notice = 'Markdown 文件已上传并同步到编辑区';
  } catch (error) {
    writerState.error = normalizeErrorMessage(error, '上传 Markdown 失败');
  } finally {
    if (event?.target) {
      event.target.value = '';
    }
  }
}

function resetEditorForm() {
  writerState.error = '';
  writerState.notice = '';
  writerState.editor.postId = null;
  writerState.editor.title = '';
  writerState.editor.summary = '';
  writerState.editor.categoryCode = 'life';
  writerState.editor.slugCode = '';
  writerState.editor.visibility = 'PUBLIC';
  writerState.editor.tagsText = '';
  writerState.editor.allowedGroupCodesText = 'USER,FRIEND,ADMIN';
  writerState.editor.markdown = '';
  writerState.editor.markdownBucket = '';
  writerState.editor.markdownKey = '';
  writerState.editor.statusCode = 'DRAFT';
  writerState.editor.lastRelayedSignature = '';
}

function startNewDraft() {
  resetEditorForm();
  switchViewMode('editor');
}

function switchViewMode(mode) {
  if (mode === 'editor' && !canWrite.value) return;
  if (mode === 'detail' && !detailState.post) return;
  viewMode.value = mode;
  if (mode !== 'detail') {
    teardownReadingScroll();
    readingProgress.value = 0;
  } else {
    nextTick(() => setupReadingScroll());
  }
}

function applyCategoryFilter(categoryCode) {
  filters.category = String(categoryCode || '').toLowerCase();
  listState.pageNo = 1;
  loadPostList();
}

function applyTagFilter(tag) {
  filters.tag = String(tag || '').toLowerCase();
  listState.pageNo = 1;
  loadPostList();
}

function resetFilters() {
  filters.keyword = '';
  filters.category = '';
  filters.tag = '';
  listState.pageNo = 1;
  loadPostList();
}

function handleSearchSubmit() {
  listState.pageNo = 1;
  loadPostList();
}

async function openPostDetail(postId) {
  viewMode.value = 'detail';
  await loadPostDetail(postId);
}

async function openMinePost(postId) {
  if (!canWrite.value) return;
  writerState.error = '';
  writerState.notice = '';
  try {
    const payload = await getMyPostDetail(postId, auth.authorizedFetch);
    applyPostDetailToEditor(payload);
    switchViewMode('editor');
  } catch (error) {
    writerState.error = normalizeErrorMessage(error, '读取我的文章失败');
  }
}

async function openCurrentPostInEditor() {
  if (!canWrite.value || !detailState.post?.postId) return;
  await openMinePost(detailState.post.postId);
}

function sanitizeFileSegment(input, fallback = 'post') {
  const normalized = String(input || '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');
  return normalized || fallback;
}

function downloadTextAsFile(content, fileName) {
  const blob = new Blob([String(content || '')], { type: 'text/markdown;charset=utf-8' });
  const url = URL.createObjectURL(blob);
  const anchor = document.createElement('a');
  anchor.href = url;
  anchor.download = fileName;
  anchor.click();
  URL.revokeObjectURL(url);
}

async function downloadCurrentMarkdown() {
  if (!detailState.post?.postId) return;
  try {
    const markdown = await getPostMarkdown(detailState.post.postId, resolveAuthorizedFetch());
    const fileName = `${sanitizeFileSegment(detailState.post.slugCode || detailState.post.title || `post-${detailState.post.postId}`)}.md`;
    downloadTextAsFile(markdown, fileName);
  } catch (error) {
    detailState.error = normalizeErrorMessage(error, '下载 Markdown 失败');
  }
}

function tocIndentStyle(heading) {
  const depth = Math.max(0, toSafeInt(heading?.level, 1) - 1);
  return {
    paddingInlineStart: `${12 + depth * 12}px`
  };
}

function refreshHeadingDomNodes() {
  if (!markdownBodyRef.value) {
    headingDomNodes = [];
    activeHeadingId.value = '';
    return;
  }
  headingDomNodes = Array.from(markdownBodyRef.value.querySelectorAll('[data-heading-id]'));
  if (!headingDomNodes.length) {
    activeHeadingId.value = '';
    return;
  }
  const firstId = headingDomNodes[0].getAttribute('data-heading-id');
  if (!activeHeadingId.value && firstId) {
    activeHeadingId.value = firstId;
  }
}

function updateActiveHeadingByScroll() {
  const root = articleScrollRef.value;
  if (!root || !headingDomNodes.length) {
    activeHeadingId.value = '';
    return;
  }
  const rootRect = root.getBoundingClientRect();
  let candidate = headingDomNodes[0];
  for (const headingEl of headingDomNodes) {
    const top = headingEl.getBoundingClientRect().top - rootRect.top;
    if (top <= 72) {
      candidate = headingEl;
    } else {
      break;
    }
  }
  activeHeadingId.value = candidate?.getAttribute('data-heading-id') || activeHeadingId.value;
}

function handleDetailScroll() {
  const root = articleScrollRef.value;
  if (!root) return;
  const maxScroll = Math.max(1, root.scrollHeight - root.clientHeight);
  readingProgress.value = Math.max(0, Math.min(1, root.scrollTop / maxScroll));
  updateActiveHeadingByScroll();
}

function teardownReadingScroll() {
  if (boundScrollRoot) {
    boundScrollRoot.removeEventListener('scroll', handleDetailScroll);
    boundScrollRoot = null;
  }
  headingDomNodes = [];
}

function setupReadingScroll() {
  teardownReadingScroll();
  const root = articleScrollRef.value;
  if (!root || viewMode.value !== 'detail') return;
  refreshHeadingDomNodes();
  root.addEventListener('scroll', handleDetailScroll, { passive: true });
  boundScrollRoot = root;
  handleDetailScroll();
}

function scrollToHeading(headingId) {
  const root = articleScrollRef.value;
  if (!root || !headingId) return;
  const target = headingDomNodes.find((item) => item.getAttribute('data-heading-id') === headingId);
  if (!target) return;
  const rootRect = root.getBoundingClientRect();
  const targetRect = target.getBoundingClientRect();
  root.scrollTo({
    top: root.scrollTop + (targetRect.top - rootRect.top) - 12,
    behavior: 'smooth'
  });
}

function scrollToTop() {
  const root = articleScrollRef.value;
  if (!root) return;
  root.scrollTo({
    top: 0,
    behavior: 'smooth'
  });
}

function insertTextIntoEditor(text, selectionStart, selectionEnd) {
  const source = String(writerState.editor.markdown || '');
  const start = Math.max(0, toSafeInt(selectionStart, source.length));
  const end = Math.max(start, toSafeInt(selectionEnd, start));
  writerState.editor.markdown = `${source.slice(0, start)}${text}${source.slice(end)}`;
  writerState.editor.lastRelayedSignature = '';
  nextTick(() => {
    const textarea = editorTextareaRef.value;
    if (!textarea) return;
    const caret = start + text.length;
    textarea.focus();
    textarea.setSelectionRange(caret, caret);
  });
}

function closePasteDialog() {
  pasteState.dialogVisible = false;
  pasteState.pendingText = '';
  pasteState.selectionStart = 0;
  pasteState.selectionEnd = 0;
}

function cancelPasteDialog() {
  closePasteDialog();
}

function confirmPasteDialog(mode) {
  const normalizedMode = mode === 'plain' ? 'plain' : 'markdown';
  const pendingText = String(pasteState.pendingText || '');
  const content = normalizedMode === 'markdown' ? pendingText : escapeMarkdownPlainText(pendingText);
  pasteState.sessionDecision = normalizedMode;
  insertTextIntoEditor(content, pasteState.selectionStart, pasteState.selectionEnd);
  closePasteDialog();
}

function resetPasteSessionDecision() {
  pasteState.sessionDecision = '';
}

function handleEditorPaste(event) {
  const clipboardText = event?.clipboardData?.getData('text/plain');
  if (!clipboardText) return;
  if (!looksLikeMarkdown(clipboardText, 2)) return;

  event.preventDefault();

  const target = event.target;
  const selectionStart = toSafeInt(target?.selectionStart, String(writerState.editor.markdown || '').length);
  const selectionEnd = toSafeInt(target?.selectionEnd, selectionStart);
  if (pasteState.sessionDecision === 'markdown') {
    insertTextIntoEditor(clipboardText, selectionStart, selectionEnd);
    return;
  }
  if (pasteState.sessionDecision === 'plain') {
    insertTextIntoEditor(escapeMarkdownPlainText(clipboardText), selectionStart, selectionEnd);
    return;
  }
  pasteState.pendingText = clipboardText;
  pasteState.selectionStart = selectionStart;
  pasteState.selectionEnd = selectionEnd;
  pasteState.dialogVisible = true;
}

watch(
  () => canWrite.value,
  async (enabled) => {
    if (enabled) {
      await loadMyPosts();
      return;
    }
    writerState.myPosts = [];
    if (viewMode.value === 'editor') {
      viewMode.value = 'list';
    }
  },
  { immediate: false }
);

watch(
  () => viewMode.value,
  (mode) => {
    if (mode === 'detail') {
      nextTick(() => setupReadingScroll());
    } else {
      teardownReadingScroll();
      readingProgress.value = 0;
    }
  }
);

onMounted(async () => {
  await auth.ensureReady();
  await loadPostList();
  if (canWrite.value) {
    await loadMyPosts();
  }
});

onBeforeUnmount(() => {
  teardownReadingScroll();
});
</script>

<style scoped>
.blog-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
  display: grid;
  grid-template-rows: auto auto 1fr;
  gap: 12px;
}

.page-header {
  padding: 8px 4px 0;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 4px;
  font-size: clamp(26px, 4vw, 40px);
}

.page-header p {
  margin-top: 10px;
  max-width: 920px;
  color: rgba(223, 230, 249, 0.86);
  line-height: 1.6;
}

.toolbar {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 12px 28px rgba(6, 10, 18, 0.2);
  border-radius: 12px;
  padding: 10px 12px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.search-form {
  min-width: 0;
  display: flex;
  align-items: center;
  gap: 8px;
  flex: 1;
}

.toolbar-meta {
  font-size: 12px;
  color: rgba(214, 223, 245, 0.9);
  display: flex;
  gap: 10px;
}

.field-input {
  width: 100%;
  min-width: 0;
  min-height: 36px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(11, 16, 28, 0.42);
  color: rgba(236, 241, 255, 0.96);
  padding: 0 12px;
}

.field-input:focus {
  outline: none;
  border-color: rgba(var(--accent-rgb), 0.56);
  box-shadow: 0 0 0 3px rgba(var(--accent-rgb), 0.2);
}

.mini-btn {
  border: 1px solid rgba(255, 255, 255, 0.22);
  border-radius: 10px;
  min-height: 34px;
  padding: 0 12px;
  background: rgba(255, 255, 255, 0.18);
  color: rgba(238, 244, 255, 0.95);
  white-space: nowrap;
}

.blog-layout {
  min-height: 0;
  display: grid;
  grid-template-columns: 240px minmax(0, 1fr) 280px;
  gap: 12px;
}

.left-panel,
.center-panel,
.right-panel {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.2);
  border-radius: 14px;
  min-height: 0;
}

.left-panel {
  padding: 10px;
  overflow: auto;
  display: grid;
  gap: 12px;
  align-content: start;
}

.side-block {
  display: grid;
  gap: 8px;
}

.side-block h2 {
  font-size: 14px;
  color: rgba(241, 246, 255, 0.95);
}

.chip-group {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.chip-btn {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 999px;
  min-height: 30px;
  padding: 0 10px;
  font-size: 12px;
  background: rgba(255, 255, 255, 0.16);
  color: rgba(236, 243, 255, 0.93);
}

.chip-btn.active,
.tab-btn.active,
.mini-btn.active {
  background: rgba(var(--accent-rgb), 0.28);
  border-color: rgba(var(--accent-rgb), 0.52);
  box-shadow: 0 10px 20px rgba(var(--accent-rgb), 0.22);
  color: rgba(255, 255, 255, 0.96);
}

.policy-block p {
  font-size: 12px;
  line-height: 1.55;
  color: rgba(218, 227, 248, 0.9);
}

.mine-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.mine-list {
  display: grid;
  gap: 6px;
}

.mine-item {
  border: 1px solid rgba(255, 255, 255, 0.18);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.14);
  padding: 8px;
  text-align: left;
  display: grid;
  gap: 3px;
}

.mine-item.active {
  border-color: rgba(var(--accent-rgb), 0.58);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.5);
}

.mine-title {
  font-size: 13px;
  color: rgba(244, 248, 255, 0.95);
}

.mine-meta {
  font-size: 11px;
  color: rgba(208, 219, 243, 0.85);
}

.side-tip {
  font-size: 12px;
  color: rgba(207, 219, 246, 0.86);
}

.center-panel {
  padding: 10px;
  display: grid;
  grid-template-rows: auto 1fr;
  gap: 10px;
}

.center-tabs {
  display: flex;
  gap: 8px;
}

.tab-btn {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 10px;
  min-height: 34px;
  padding: 0 12px;
  background: rgba(255, 255, 255, 0.16);
  color: rgba(238, 244, 255, 0.94);
}

.list-view,
.detail-view,
.editor-view {
  min-height: 0;
}

.list-view {
  overflow: auto;
}

.post-list {
  display: grid;
  gap: 10px;
}

.post-card {
  --liquid-bg: rgba(17, 24, 40, 0.32);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 12px 26px rgba(6, 10, 18, 0.2);
  border-radius: 12px;
  padding: 12px;
  cursor: pointer;
  display: grid;
  gap: 8px;
}

.card-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.card-head h3 {
  font-size: 17px;
  color: rgba(242, 247, 255, 0.96);
}

.visibility {
  border-radius: 999px;
  padding: 2px 8px;
  font-size: 11px;
  background: rgba(var(--accent-rgb), 0.2);
  border: 1px solid rgba(var(--accent-rgb), 0.44);
}

.summary {
  color: rgba(217, 226, 247, 0.9);
  line-height: 1.6;
}

.meta-row {
  display: flex;
  flex-wrap: wrap;
  gap: 8px 12px;
  font-size: 12px;
  color: rgba(204, 215, 241, 0.88);
}

.tag-row {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.tag-chip {
  border-radius: 999px;
  padding: 2px 8px;
  font-size: 11px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.14);
  color: rgba(233, 240, 255, 0.94);
}

.detail-view {
  display: grid;
  grid-template-rows: auto 1fr;
  gap: 10px;
  min-height: 0;
}

.detail-head {
  display: grid;
  gap: 8px;
}

.detail-head h2 {
  font-size: clamp(22px, 3vw, 30px);
}

.detail-summary {
  color: rgba(218, 227, 247, 0.9);
  line-height: 1.65;
}

.detail-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.detail-scroll {
  min-height: 0;
  overflow: auto;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(8, 12, 20, 0.36);
  padding: 14px;
}

.editor-view {
  min-height: 0;
  display: grid;
  grid-template-rows: auto auto auto 1fr;
  gap: 10px;
}

.editor-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px 10px;
}

.field {
  display: grid;
  gap: 6px;
}

.field span {
  font-size: 12px;
  color: rgba(218, 228, 248, 0.9);
}

.field-wide {
  grid-column: 1 / -1;
}

.file-field input[type='file'] {
  color: rgba(232, 240, 255, 0.92);
}

.editor-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  align-items: center;
}

.editor-status {
  font-size: 12px;
  color: rgba(208, 220, 247, 0.88);
}

.editor-body {
  min-height: 0;
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(0, 1fr);
  gap: 10px;
}

.editor-pane {
  min-height: 0;
  display: grid;
  grid-template-rows: auto 1fr;
  gap: 6px;
}

.editor-pane span {
  font-size: 12px;
  color: rgba(218, 228, 248, 0.9);
}

.markdown-editor {
  width: 100%;
  min-height: 0;
  height: 100%;
  resize: none;
  border: 1px solid rgba(255, 255, 255, 0.22);
  border-radius: 12px;
  background: rgba(8, 12, 20, 0.46);
  color: rgba(237, 243, 255, 0.96);
  padding: 12px;
  line-height: 1.6;
  font-size: 14px;
  user-select: text;
}

.preview-pane {
  min-height: 0;
}

.preview-pane .markdown-body {
  min-height: 0;
  height: 100%;
  overflow: auto;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(8, 12, 20, 0.34);
  padding: 12px;
}

.right-panel {
  padding: 10px;
  display: grid;
  grid-template-rows: auto 1fr;
  gap: 10px;
}

.toc-head {
  display: grid;
  gap: 8px;
}

.toc-head h2 {
  font-size: 14px;
}

.toc-mode-switch {
  display: flex;
  gap: 6px;
}

.toc-metrics {
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(10, 15, 25, 0.34);
  padding: 8px;
  display: grid;
  gap: 3px;
  font-size: 12px;
  color: rgba(207, 220, 247, 0.9);
}

.toc-list {
  min-height: 0;
  overflow: auto;
  display: grid;
  gap: 4px;
  align-content: start;
}

.toc-item {
  border: 0;
  min-height: 30px;
  border-radius: 8px;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(226, 236, 255, 0.94);
  text-align: left;
  font-size: 12px;
  padding-right: 8px;
}

.toc-item.active {
  background: rgba(var(--accent-rgb), 0.26);
  color: rgba(255, 255, 255, 0.98);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.58);
}

.error-text {
  font-size: 13px;
  color: #ffadb2;
}

.notice-text {
  font-size: 13px;
  color: #99e8c2;
}

.empty-text {
  font-size: 13px;
  color: rgba(208, 220, 246, 0.88);
}

.progress-fab {
  position: fixed;
  right: 36px;
  bottom: 136px;
  border-radius: 999px;
  width: 84px;
  height: 84px;
  display: grid;
  place-items: center;
  border: 1px solid rgba(255, 255, 255, 0.24);
  color: rgba(241, 246, 255, 0.96);
  z-index: 1200;
  gap: 1px;
  font-size: 11px;
}

.progress-ring {
  width: 52px;
  height: 52px;
  transform: rotate(-90deg);
}

.progress-ring-bg {
  fill: none;
  stroke: rgba(255, 255, 255, 0.18);
  stroke-width: 4;
}

.progress-ring-value {
  fill: none;
  stroke: rgba(var(--accent-rgb), 0.94);
  stroke-width: 4;
  stroke-linecap: round;
  transition: stroke-dashoffset 180ms linear;
}

.dialog-mask {
  position: fixed;
  inset: 0;
  background: rgba(4, 8, 15, 0.56);
  z-index: 1600;
  display: grid;
  place-items: center;
}

.paste-dialog {
  --liquid-bg: rgba(20, 27, 42, 0.54);
  --liquid-border: rgba(255, 255, 255, 0.24);
  --liquid-shadow: 0 18px 36px rgba(6, 10, 18, 0.28);
  width: min(92vw, 460px);
  border-radius: 14px;
  padding: 16px;
  display: grid;
  gap: 12px;
}

.paste-dialog h3 {
  font-size: 18px;
}

.paste-dialog p {
  line-height: 1.65;
  color: rgba(219, 229, 248, 0.92);
}

.dialog-actions {
  display: grid;
  gap: 8px;
}

.markdown-body {
  color: rgba(232, 240, 255, 0.95);
  line-height: 1.72;
  user-select: text;
}

.markdown-body :deep(h1),
.markdown-body :deep(h2),
.markdown-body :deep(h3),
.markdown-body :deep(h4),
.markdown-body :deep(h5),
.markdown-body :deep(h6) {
  margin-top: 1.15em;
  margin-bottom: 0.5em;
  color: rgba(244, 249, 255, 0.98);
  scroll-margin-top: 12px;
}

.markdown-body :deep(p) {
  margin: 0.68em 0;
}

.markdown-body :deep(ul),
.markdown-body :deep(ol) {
  margin: 0.6em 0 0.6em 1.2em;
}

.markdown-body :deep(blockquote) {
  margin: 0.75em 0;
  border-left: 3px solid rgba(var(--accent-rgb), 0.62);
  padding-left: 10px;
  color: rgba(213, 225, 248, 0.9);
}

.markdown-body :deep(pre) {
  margin: 0.8em 0;
  padding: 10px 12px;
  border-radius: 10px;
  background: rgba(5, 10, 18, 0.62);
  border: 1px solid rgba(255, 255, 255, 0.18);
  overflow: auto;
}

.markdown-body :deep(code) {
  font-family: 'JetBrains Mono', 'Consolas', 'Monaco', monospace;
  font-size: 0.92em;
}

.markdown-body :deep(.md-inline-code) {
  border-radius: 6px;
  padding: 0 6px;
  background: rgba(255, 255, 255, 0.16);
}

.markdown-body :deep(table) {
  width: 100%;
  border-collapse: collapse;
  margin: 0.8em 0;
}

.markdown-body :deep(th),
.markdown-body :deep(td) {
  border: 1px solid rgba(255, 255, 255, 0.18);
  padding: 6px 8px;
  text-align: left;
}

.markdown-body :deep(a) {
  color: rgba(var(--accent-rgb), 0.96);
}

@media (max-width: 1320px) {
  .blog-layout {
    grid-template-columns: 220px minmax(0, 1fr);
  }

  .right-panel {
    grid-column: 1 / -1;
    max-height: 260px;
  }
}

@media (max-width: 980px) {
  .toolbar {
    flex-direction: column;
    align-items: stretch;
  }

  .blog-layout {
    grid-template-columns: 1fr;
  }

  .left-panel {
    max-height: 280px;
  }

  .editor-grid,
  .editor-body {
    grid-template-columns: 1fr;
  }

  .progress-fab {
    right: 14px;
    bottom: 104px;
    width: 76px;
    height: 76px;
  }
}
</style>
