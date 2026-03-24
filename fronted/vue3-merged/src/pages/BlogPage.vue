<template>
  <section class="route-page blog-page">
    <div v-if="viewMode === 'list'" class="toolbar liquid-material">
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
      <SubtleScrollArea tag="aside" class="left-panel liquid-material">
        <section class="side-block side-switch-block">
          <div class="side-switch">
            <button
              type="button"
              class="switch-btn ripple-trigger"
              :class="{ active: leftNavMode === 'read' }"
              @click="jumpToBlogList"
            >
              <i class="fas fa-house"></i>
              <span>主页</span>
            </button>
            <button
              type="button"
              class="switch-btn ripple-trigger"
              :class="{ active: leftNavMode === 'write', disabled: !canWrite }"
              @click="jumpToBlogEditor"
            >
              <i class="fas fa-pen"></i>
              <span>写文</span>
            </button>
            <button type="button" class="switch-btn ripple-trigger" @click="jumpToBlogCategories">
              <i class="fas fa-folder-open"></i>
              <span>分类</span>
            </button>
            <button type="button" class="switch-btn ripple-trigger" @click="jumpToBlogWhisper">
              <i class="fas fa-user-secret"></i>
              <span>悄悄话</span>
            </button>
          </div>
          <p v-if="leftNavHint" class="side-tip">{{ leftNavHint }}</p>
        </section>

        <template v-if="viewMode === 'detail'">
          <section class="side-block">
            <div class="mine-head">
              <h2>最新文章</h2>
            </div>
            <div class="mine-list detail-nav-list">
              <button
                v-for="item in detailNavState.latestPosts"
                :key="`detail-latest-${item.postId}`"
                type="button"
                class="mine-item ripple-trigger"
                :class="{ active: item.postId === detailState.post?.postId }"
                @click="openPostDetail(item.postId)"
              >
                <span class="mine-title">{{ item.title }}</span>
                <span class="mine-meta">{{ formatDateTime(item.publishedAt) }}</span>
              </button>
              <p v-if="detailNavState.loading" class="side-tip">加载中...</p>
              <p v-else-if="detailNavState.sidebarError" class="side-tip">{{ detailNavState.sidebarError }}</p>
              <p v-else-if="!detailNavState.latestPosts.length" class="side-tip">暂无可见文章。</p>
            </div>
          </section>

          <section class="side-block">
            <h2>分类</h2>
            <div class="chip-group">
              <button
                v-for="category in detailNavState.categories"
                :key="`detail-category-${category.categoryCode}`"
                type="button"
                class="chip-btn ripple-trigger"
                :class="{ active: detailNavState.selectedCategory === category.categoryCode }"
                @click="selectDetailCategory(category.categoryCode)"
              >
                {{ category.displayName || category.categoryCode }}
                <span class="chip-count">{{ category.count }}</span>
              </button>
            </div>
            <p v-if="!detailNavState.loading && !detailNavState.categories.length" class="side-tip">暂无分类统计。</p>
          </section>

          <section class="side-block">
            <h2>同分类文章 · {{ detailNavState.selectedCategory || 'uncategorized' }}</h2>
            <div ref="detailRelatedListRef" class="mine-list detail-nav-list">
              <button
                v-for="item in detailNavState.relatedPosts"
                :key="`detail-related-${item.postId}`"
                type="button"
                class="mine-item ripple-trigger"
                :class="{ active: item.postId === detailState.post?.postId }"
                :data-current="item.postId === detailState.post?.postId ? '1' : '0'"
                @click="openPostDetail(item.postId)"
              >
                <span class="mine-title">{{ item.title }}</span>
                <span class="mine-meta">{{ formatDateTime(item.publishedAt) }}</span>
              </button>
              <p v-if="detailNavState.relatedLoading" class="side-tip">加载同分类文章中...</p>
              <p v-else-if="detailNavState.relatedError" class="side-tip">{{ detailNavState.relatedError }}</p>
              <p v-else-if="!detailNavState.relatedPosts.length" class="side-tip">该分类下暂无其它文章。</p>
            </div>
          </section>
        </template>

        <template v-else>
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
        </template>
      </SubtleScrollArea>

      <section class="center-panel liquid-material">
        <SubtleScrollArea v-if="viewMode === 'list'" class="list-view">
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
              <p class="summary">{{ resolveSummary(post.summary) }}</p>
              <div class="meta-row">
                <span>{{ post.categoryCode || 'uncategorized' }}</span>
                <span>{{ post.wordCount }} 字 · {{ post.readingMinutes }} 分钟</span>
                <span>❤ {{ post.likeCount }}</span>
                <span>{{ formatDateTime(post.publishedAt) }}</span>
              </div>
              <div v-if="post.tags.length" class="tag-row">
                <span v-for="tag in post.tags" :key="`${post.postId}-${tag}`" class="tag-chip">#{{ tag }}</span>
              </div>
            </article>
            <p v-if="!listState.loading && !listState.items.length" class="empty-text">暂无符合条件的文章。</p>
          </div>
        </SubtleScrollArea>

        <div v-else-if="viewMode === 'detail'" class="detail-view">
          <p v-if="detailState.error" class="error-text">{{ detailState.error }}</p>
          <template v-else-if="detailState.post">
            <SubtleScrollArea ref="articleScrollRef" class="detail-scroll">
              <header class="detail-head">
                <div class="detail-top-actions">
                  <button
                    type="button"
                    class="icon-circle-btn ripple-trigger"
                    aria-label="返回博客列表"
                    title="返回博客列表"
                    @click="goBackToBlogList"
                  >
                    <i class="fas fa-arrow-left"></i>
                  </button>
                  <div class="detail-action-right">
                    <button
                      v-if="detailPresentationReady"
                      type="button"
                      class="mini-btn ripple-trigger"
                      @click="openDetailPresentationPreview"
                    >
                      预览演示
                    </button>
                    <button
                      v-if="detailPresentationReady"
                      type="button"
                      class="mini-btn ripple-trigger"
                      @click="openDetailPresentationInLightApp"
                    >
                      轻应用打开
                    </button>
                    <button
                      v-if="detailPresentationPptReady"
                      type="button"
                      class="mini-btn ripple-trigger"
                      @click="downloadDetailPresentationPpt"
                    >
                      下载 PPT
                    </button>
                    <button
                      v-if="detailState.post.editable"
                      type="button"
                      class="icon-circle-btn ripple-trigger"
                      aria-label="编辑文章"
                      title="编辑文章"
                      @click="openCurrentPostInEditor"
                    >
                      <i class="fas fa-pen"></i>
                    </button>
                    <div ref="downloadWrapRef" class="download-wrap">
                      <button
                        type="button"
                        class="icon-circle-btn ripple-trigger"
                        :aria-expanded="downloadState.open ? 'true' : 'false'"
                        aria-label="下载文章"
                        title="下载文章"
                        @click="toggleDownloadMenu"
                      >
                        <i class="fas fa-download"></i>
                      </button>
                      <div v-if="downloadState.open" class="download-menu liquid-material">
                        <button type="button" class="download-item ripple-trigger" @click="downloadCurrentPost('md')">MD</button>
                        <button type="button" class="download-item ripple-trigger" @click="downloadCurrentPost('html')">HTML</button>
                        <button type="button" class="download-item ripple-trigger" @click="downloadCurrentPost('txt')">TXT</button>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="detail-title-row">
                  <h2>{{ detailState.post.title }}</h2>
                </div>
                <p class="detail-summary">{{ resolveSummary(detailState.post.summary) }}</p>
                <div class="meta-row">
                  <span>{{ detailState.post.categoryCode || 'uncategorized' }}</span>
                  <span>{{ detailWordCount }} 字 · {{ detailReadingMinutes }} 分钟</span>
                  <span>❤ {{ detailState.post.likeCount }}</span>
                  <span>{{ formatDateTime(detailState.post.publishedAt) }}</span>
                </div>
                <div v-if="detailState.post.tags.length" class="tag-row">
                  <span v-for="tag in detailState.post.tags" :key="`detail-${tag}`" class="tag-chip">#{{ tag }}</span>
                </div>
              </header>

              <figure v-if="detailState.post.coverImageUrl" class="detail-cover-wrap">
                <img class="detail-cover" :src="detailState.post.coverImageUrl" alt="post-cover" loading="lazy" />
              </figure>
              <article ref="markdownBodyRef" class="markdown-body" v-html="detailState.renderedHtml"></article>
              <div class="detail-bottom-spacer" aria-hidden="true"></div>
            </SubtleScrollArea>
          </template>
          <p v-else class="empty-text">请选择一篇文章进入详情。</p>
        </div>

        <div v-else class="editor-view">
          <div class="editor-topbar liquid-material">
            <div class="editor-topbar-main">
              <h3>文章编辑</h3>
              <span class="editor-topbar-mode">{{ editorMode === 'wysiwyg' ? '富文本模式' : 'Markdown 源码模式' }}</span>
            </div>
            <div class="editor-topbar-actions">
              <button
                type="button"
                class="mini-btn ripple-trigger editor-topbar-btn"
                :class="{ active: editorSidebarView === 'info' }"
                :disabled="editorSidebarView === 'info'"
                @click="setEditorSidebarView('info')"
              >
                文章信息
              </button>
              <button
                type="button"
                class="mini-btn ripple-trigger editor-topbar-btn editor-mode-toggle"
                :class="{ active: editorSidebarView === 'markdown' }"
                :disabled="editorSidebarView === 'markdown'"
                @click="setEditorSidebarView('markdown')"
              >
                切换源码
              </button>
              <button
                type="button"
                class="mini-btn ripple-trigger editor-topbar-btn editor-mode-toggle"
                :class="{ active: editorSidebarView === 'wysiwyg' }"
                :disabled="editorSidebarView === 'wysiwyg'"
                @click="setEditorSidebarView('wysiwyg')"
              >
                切换富文本
              </button>
              <button type="button" class="mini-btn ripple-trigger editor-exit-btn" @click="exitEditor">退出编辑</button>
            </div>
          </div>

          <div class="editor-body">
            <section class="editor-pane editor-pane-full">
              <div class="editor-pane-head">
                <span>正文编辑区（富文本/Markdown 双模式）</span>
              </div>
              <AsyncBlogRichEditor
                ref="richEditorRef"
                v-model="writerState.editor.markdown"
                :default-mode="editorMode"
                placeholder="在这里写 Markdown 内容..."
                @ready="handleRichEditorReady"
                @mode-change="handleEditorModeChange"
                @paste-candidate="handleRichEditorPasteCandidate"
              />
            </section>
          </div>
        </div>
      </section>

      <aside class="right-panel liquid-material">
        <div class="toc-head">
          <h2>{{ rightPanelTitle }}</h2>
          <button
            v-if="viewMode === 'detail'"
            type="button"
            class="icon-circle-btn ripple-trigger toc-mode-toggle"
            :title="tocModeToggleLabel"
            :aria-label="tocModeToggleLabel"
            @click="toggleTocMode"
          >
            <i :class="tocModeToggleIcon"></i>
          </button>
        </div>

        <template v-if="viewMode === 'editor' && editorSidebarView === 'info'">
          <SubtleScrollArea tag="section" class="editor-info-panel">
            <div class="editor-info-panel-actions">
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
            </div>

            <section class="editor-info-section liquid-material">
              <div class="editor-info-section-head">
                <h3>演示文稿</h3>
                <span class="editor-info-section-status">{{ editorPresentationStatusText }}</span>
              </div>
              <div class="editor-info-section-actions">
                <button
                  type="button"
                  class="mini-btn ripple-trigger"
                  :disabled="writerState.saving || editorPresentationState.generating"
                  @click="handleGeneratePresentation"
                >
                  {{ editorPresentationReady ? '重新生成' : '生成演示文稿' }}
                </button>
                <button
                  type="button"
                  class="mini-btn ripple-trigger"
                  :disabled="!editorPresentationReady"
                  @click="openEditorPresentationPreview"
                >
                  在线预览
                </button>
                <button
                  type="button"
                  class="mini-btn ripple-trigger"
                  :disabled="!editorPresentationReady"
                  @click="openEditorPresentationInLightApp"
                >
                  轻应用打开
                </button>
                <button
                  type="button"
                  class="mini-btn ripple-trigger"
                  :disabled="!editorPresentationPptReady"
                  @click="downloadEditorPresentationPpt"
                >
                  下载 PPT
                </button>
              </div>
              <p v-if="writerState.editor.postId <= 0" class="side-tip">首次生成前会先自动保存草稿。</p>
              <p v-else-if="editorPresentationState.data?.generatedAt" class="side-tip">
                最近生成：{{ formatDateTime(editorPresentationState.data.generatedAt) }}
                <span v-if="editorPresentationState.data?.templateVersion"> · {{ editorPresentationState.data.templateVersion }}</span>
              </p>
              <p v-if="editorPresentationState.error" class="error-text editor-meta-message">{{ editorPresentationState.error }}</p>
            </section>

            <div class="editor-grid">
              <label class="field field-wide">
                <span>标题</span>
                <input v-model.trim="writerState.editor.title" type="text" class="field-input" maxlength="255" />
              </label>
              <label class="field field-wide">
                <span>分类</span>
                <input v-model.trim="writerState.editor.categoryCode" type="text" class="field-input" placeholder="如：life / game / dev" />
              </label>
              <label class="field field-wide">
                <span>摘要</span>
                <input v-model.trim="writerState.editor.summary" type="text" class="field-input" maxlength="500" />
              </label>
              <label class="field field-wide">
                <span>Slug（可选）</span>
                <input v-model.trim="writerState.editor.slugCode" type="text" class="field-input" />
              </label>
              <label class="field field-wide">
                <span>封面 URL（可选）</span>
                <input v-model.trim="writerState.editor.coverImageUrl" type="text" class="field-input" placeholder="https://..." />
              </label>
              <label class="field field-wide">
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

            <div class="editor-info-panel-footer">
              <div class="editor-info-panel-footer-actions">
                <button type="button" class="mini-btn ripple-trigger" @click="resetEditorForm">清空</button>
                <button type="button" class="mini-btn ripple-trigger" @click="resetPasteSessionDecision">重置粘贴判断</button>
              </div>
              <div class="editor-info-panel-status">
                <span class="editor-status">
                  {{ writerState.editor.statusCode || 'DRAFT' }}
                  <span v-if="pasteState.sessionDecision"> · 粘贴记忆：{{ pasteState.sessionDecision === 'markdown' ? '按 Markdown' : '按纯文本' }}</span>
                </span>
              </div>
              <p v-if="writerState.error" class="error-text editor-meta-message">{{ writerState.error }}</p>
              <p v-if="writerState.notice" class="notice-text editor-meta-message">{{ writerState.notice }}</p>
            </div>
          </SubtleScrollArea>
        </template>
        <template v-else-if="showTocPanel">
          <div class="toc-body">
            <div v-if="viewMode === 'detail' && detailState.post" class="toc-metrics">
              <p>L{{ activeLine }} / {{ detailLineCount }}</p>
              <p>{{ detailWordCount }} 字 · {{ detailReadingMinutes }} 分钟</p>
              <p>已读 {{ progressPercent }}%</p>
            </div>
            <SubtleScrollArea ref="tocListRef" tag="nav" class="toc-list">
              <button
                v-for="heading in visibleTocTreeHeadings"
                :key="heading.id"
                type="button"
                class="toc-item ripple-trigger"
                :data-heading-id="heading.id"
                :class="{
                  active: heading.id === activeHeadingId,
                  ancestor: heading.isAncestor,
                  'has-child': heading.hasChild,
                  'has-next-sibling': heading.hasNextSibling
                }"
                :style="tocIndentStyle(heading)"
                @click="handleTocItemClick(heading.id)"
              >
                <span class="toc-branch" aria-hidden="true"></span>
                <span class="toc-icon" aria-hidden="true">
                  <i :class="resolveTocIcon(heading.level, heading.id === activeHeadingId)"></i>
                </span>
                <span class="toc-level-badge">H{{ heading.level }}</span>
                <span class="toc-label">{{ heading.text }}</span>
              </button>
              <p v-if="!visibleTocTreeHeadings.length" class="side-tip">当前内容暂无可展示目录。</p>
            </SubtleScrollArea>
          </div>
        </template>
        <p v-else class="side-tip toc-empty">进入文章详情或写文编辑后，这里会显示目录。</p>
      </aside>
    </div>

    <button
      v-if="showProgressFab"
      type="button"
      class="progress-fab liquid-material ripple-trigger"
      aria-label="回到顶部"
      title="回到顶部"
      @click="scrollToTop"
    >
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
      <span class="progress-fab-percent">{{ progressPercent }}%</span>
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
import { computed, defineAsyncComponent, nextTick, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import SubtleScrollArea from '../components/SubtleScrollArea.vue';
import { useAuthSession } from '../composables/useAuthSession';
import {
  createMyPost,
  generateMyPostPresentation,
  getMyPostPresentation,
  getMyPostPresentationPptDownloadUrl,
  getMyPostDetail,
  getPostDetail,
  getPostPresentation,
  getPostPresentationPptDownloadUrl,
  getPostSidebar,
  getPostMarkdown,
  listMyPosts,
  listPosts,
  publishMyPost,
  relayPostMarkdown,
  unpublishMyPost,
  updateMyPost
} from '../services/blogApi';
import { escapeMarkdownPlainText, normalizeMarkdownForEditor, renderMarkdownDocument } from '../utils/blogMarkdown';
import { openLightAppWindow } from '../utils/lightAppWindowBus';

const AsyncBlogRichEditor = defineAsyncComponent(() => import('../components/blog/BlogRichEditor.vue'));

const DEFAULT_CATEGORY_OPTIONS = [
  { code: '', label: '全部' },
  { code: 'life', label: 'life' },
  { code: 'dev', label: 'dev' },
  { code: 'game', label: 'game' }
];

const auth = useAuthSession();
const route = useRoute();
const router = useRouter();

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
    coverImageUrl: '',
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

const detailNavState = reactive({
  loading: false,
  relatedLoading: false,
  sidebarError: '',
  relatedError: '',
  latestPosts: [],
  categories: [],
  selectedCategory: '',
  relatedPosts: []
});

const pasteState = reactive({
  dialogVisible: false,
  pendingText: '',
  sessionDecision: ''
});

const downloadState = reactive({
  open: false
});

const editorPresentationState = reactive({
  loading: false,
  generating: false,
  error: '',
  data: null
});

const detailPresentationState = reactive({
  loading: false,
  error: '',
  data: null
});

const routeMode = computed(() => {
  const name = typeof route.name === 'string' ? route.name : '';
  if (name === 'blog-detail') return 'detail';
  if (name === 'blog-editor') return 'editor';
  return 'list';
});

const viewMode = ref(routeMode.value);
const tocMode = ref('all');
const activeHeadingId = ref('');
const readingProgress = ref(0);
const editorMode = ref('wysiwyg');
const editorSidebarView = ref('wysiwyg');
const leftNavHint = ref('');

const articleScrollRef = ref(null);
const tocListRef = ref(null);
const markdownBodyRef = ref(null);
const detailRelatedListRef = ref(null);
const downloadWrapRef = ref(null);
const richEditorRef = ref(null);

let headingDomNodes = [];
let boundScrollRoot = null;
let editorPresentationPollTimer = 0;

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
const leftNavMode = computed(() => (routeMode.value === 'editor' ? 'write' : 'read'));

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

function collectCurrentFamilyHeadingIds(headings, activeId) {
  if (!Array.isArray(headings) || !headings.length) {
    return new Set();
  }

  const nodes = [];
  const nodeMap = new Map();
  const stack = [];

  headings.forEach((heading, index) => {
    const id = String(heading?.id || `heading-${index}`);
    const level = Math.max(1, toSafeInt(heading?.level, 1));
    while (stack.length && stack[stack.length - 1].level >= level) {
      stack.pop();
    }
    const parentId = stack.length ? stack[stack.length - 1].id : '';
    const node = {
      id,
      level,
      parentId,
      childIds: []
    };
    nodes.push(node);
    nodeMap.set(id, node);
    if (parentId) {
      nodeMap.get(parentId)?.childIds.push(id);
    }
    stack.push(node);
  });

  const fallbackId = String(headings[0]?.id || nodes[0]?.id || '');
  const activeNode = nodeMap.get(String(activeId || '')) || nodeMap.get(fallbackId);
  if (!activeNode) {
    return new Set();
  }

  const visibleIds = new Set();
  let cursor = activeNode;

  while (cursor) {
    if (cursor.parentId) {
      const parentNode = nodeMap.get(cursor.parentId);
      if (!parentNode) {
        visibleIds.add(cursor.id);
        break;
      }
      parentNode.childIds.forEach((id) => visibleIds.add(id));
      visibleIds.add(parentNode.id);
      cursor = parentNode;
      continue;
    }
    nodes.forEach((node) => {
      if (!node.parentId) {
        visibleIds.add(node.id);
      }
    });
    cursor = null;
  }

  return visibleIds;
}

const visibleTocHeadings = computed(() => {
  const headings =
    viewMode.value === 'editor'
      ? (Array.isArray(editorTocHeadings.value) ? editorTocHeadings.value : [])
      : (Array.isArray(detailState.headings) ? detailState.headings : []);
  if (viewMode.value === 'editor') return headings;
  if (tocMode.value === 'all') return headings;
  if (!headings.length) return [];
  const visibleIds = collectCurrentFamilyHeadingIds(headings, activeHeadingId.value);
  if (!visibleIds.size) return headings.slice(0, 1);
  return headings.filter((item) => visibleIds.has(String(item.id || '')));
});

const visibleTocTreeHeadings = computed(() => {
  const headings = Array.isArray(visibleTocHeadings.value) ? visibleTocHeadings.value : [];
  if (!headings.length) return [];
  const parentById = new Map();
  const stack = [];
  headings.forEach((heading, index) => {
    const id = String(heading?.id || `toc-${index}`);
    const level = Math.max(1, toSafeInt(heading?.level, 1));
    while (stack.length && stack[stack.length - 1].level >= level) {
      stack.pop();
    }
    const parentId = stack.length ? stack[stack.length - 1].id : '';
    parentById.set(id, parentId);
    stack.push({ id, level });
  });
  const ancestorIds = new Set();
  let cursorId = String(activeHeadingId.value || '');
  while (cursorId && parentById.has(cursorId)) {
    const parentId = parentById.get(cursorId);
    if (!parentId) break;
    ancestorIds.add(parentId);
    cursorId = parentId;
  }

  return headings.map((heading, index) => {
    const id = String(heading?.id || `toc-${index}`);
    const level = Math.max(1, toSafeInt(heading?.level, 1));
    const hasChild = index + 1 < headings.length && Math.max(1, toSafeInt(headings[index + 1]?.level, 1)) > level;
    let hasNextSibling = false;
    for (let i = index + 1; i < headings.length; i += 1) {
      const nextLevel = Math.max(1, toSafeInt(headings[i]?.level, 1));
      if (nextLevel < level) break;
      if (nextLevel === level) {
        hasNextSibling = true;
        break;
      }
    }
    return {
      ...heading,
      id,
      level,
      isAncestor: ancestorIds.has(id),
      hasChild,
      hasNextSibling
    };
  });
});

const tocModeToggleLabel = computed(() => (tocMode.value === 'all' ? '切换到当前小节模式' : '切换到全部展开模式'));
const tocModeToggleIcon = computed(() => (tocMode.value === 'all' ? 'fas fa-code-branch' : 'fas fa-list-ul'));

function estimateWordCount(markdown) {
  const text = String(markdown || '');
  if (!text.trim()) return 0;

  let cjkCount = 0;
  for (const char of text) {
    const code = char.codePointAt(0) || 0;
    if (
      (code >= 0x4e00 && code <= 0x9fff) ||
      (code >= 0x3400 && code <= 0x4dbf) ||
      (code >= 0x20000 && code <= 0x2a6df) ||
      (code >= 0x2a700 && code <= 0x2b73f) ||
      (code >= 0x2b740 && code <= 0x2b81f) ||
      (code >= 0x2f800 && code <= 0x2fa1f)
    ) {
      cjkCount += 1;
    }
  }

  const asciiMatches = text.match(/[A-Za-z0-9_]+(?:'[A-Za-z0-9_]+)?/g);
  const asciiCount = Array.isArray(asciiMatches) ? asciiMatches.length : 0;
  return cjkCount + asciiCount;
}

const detailLineCount = computed(() => {
  const backendLineCount = toSafeInt(detailState.post?.lineCount, 0);
  if (backendLineCount > 0) {
    return backendLineCount;
  }
  return Math.max(0, toSafeInt(detailState.renderedLineCount, 0));
});
const detailWordCount = computed(() => {
  const backendWordCount = toSafeInt(detailState.post?.wordCount, 0);
  if (backendWordCount > 0) {
    return backendWordCount;
  }
  return estimateWordCount(detailState.post?.markdown);
});
const detailReadingMinutes = computed(() => {
  const backendWordCount = toSafeInt(detailState.post?.wordCount, 0);
  const backendReadingMinutes = Math.max(1, toSafeInt(detailState.post?.readingMinutes, 1));
  if (backendWordCount > 0) {
    return backendReadingMinutes;
  }
  return Math.max(1, Math.ceil(Math.max(1, detailWordCount.value) / 300));
});

const activeLine = computed(() => {
  const totalLines = Math.max(0, detailLineCount.value);
  if (totalLines <= 0) {
    return 0;
  }
  if (readingProgress.value >= 1) {
    return totalLines;
  }
  const estimated = Math.floor(readingProgress.value * Math.max(0, totalLines - 1)) + 1;
  return Math.max(1, Math.min(totalLines, estimated));
});
const progressPercent = computed(() => Math.round(readingProgress.value * 100));
const showProgressFab = computed(() => viewMode.value === 'detail' && Boolean(detailState.post));
const editorTocHeadings = computed(() => {
  const markdown = normalizeMarkdownForEditor(writerState.editor.markdown);
  if (!markdown.trim()) return [];
  return renderMarkdownDocument(markdown).headings;
});
const showTocPanel = computed(
  () => (viewMode.value === 'detail' && Boolean(detailState.post)) || (viewMode.value === 'editor' && editorSidebarView.value !== 'info')
);
const rightPanelTitle = computed(() => (viewMode.value === 'editor' && editorSidebarView.value === 'info' ? '文章信息' : '文内目录'));
const editorPresentationReady = computed(() => String(editorPresentationState.data?.status || '') === 'READY');
const editorPresentationPptReady = computed(() => editorPresentationReady.value && editorPresentationState.data?.pptReady === true);
const detailPresentationReady = computed(() => String(detailPresentationState.data?.status || '') === 'READY');
const detailPresentationPptReady = computed(() => detailPresentationReady.value && detailPresentationState.data?.pptReady === true);
const editorPresentationStatusText = computed(() => resolvePresentationStatusText(editorPresentationState.data, editorPresentationState.loading || editorPresentationState.generating));
const detailPresentationStatusText = computed(() => resolvePresentationStatusText(detailPresentationState.data, detailPresentationState.loading));

const progressRadius = 20;
const progressCircumference = 2 * Math.PI * progressRadius;
const progressDashoffset = computed(() => progressCircumference * (1 - readingProgress.value));

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
    title: normalizeString(raw?.title) || '未命名文章',
    summary: normalizeString(raw?.summary),
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url),
    visibility: normalizeString(raw?.visibility, 'PUBLIC').toUpperCase(),
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    tags: normalizeTags(raw?.tags),
    wordCount: Math.max(0, toSafeInt(raw?.wordCount ?? raw?.word_count, 0)),
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
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url),
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
    editable: Boolean(raw?.editable),
    markdown: normalizeString(raw?.markdown)
  };
}

function normalizeLatestPost(raw) {
  return {
    postId: toSafeInt(raw?.postId ?? raw?.post_id, 0),
    title: normalizeString(raw?.title) || '未命名文章',
    publishedAt: raw?.publishedAt ?? raw?.published_at ?? null
  };
}

function normalizeCategoryStat(raw) {
  return {
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    count: Math.max(0, toSafeInt(raw?.count, 0)),
    displayName: normalizeString(raw?.displayName ?? raw?.display_name),
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url)
  };
}

function normalizeAuthorPost(raw) {
  return {
    postId: toSafeInt(raw?.postId ?? raw?.post_id, 0),
    title: normalizeString(raw?.title),
    summary: normalizeString(raw?.summary),
    categoryCode: normalizeString(raw?.categoryCode ?? raw?.category_code).toLowerCase(),
    slugCode: normalizeString(raw?.slugCode ?? raw?.slug_code),
    coverImageUrl: normalizeString(raw?.coverImageUrl ?? raw?.cover_image_url),
    visibility: normalizeString(raw?.visibility, 'PUBLIC').toUpperCase(),
    statusCode: normalizeString(raw?.statusCode ?? raw?.status_code, 'DRAFT').toUpperCase(),
    tags: normalizeTags(raw?.tags),
    readingMinutes: Math.max(1, toSafeInt(raw?.readingMinutes ?? raw?.reading_minutes, 1)),
    likeCount: Math.max(0, toSafeInt(raw?.likeCount ?? raw?.like_count, 0))
  };
}

function normalizePresentation(raw) {
  return {
    postId: toSafeInt(raw?.postId ?? raw?.post_id, 0),
    status: normalizeString(raw?.status, 'NOT_GENERATED').toUpperCase(),
    slideCount: Math.max(0, toSafeInt(raw?.slideCount ?? raw?.slide_count, 0)),
    generatedAt: raw?.generatedAt ?? raw?.generated_at ?? null,
    templateVersion: normalizeString(raw?.templateVersion ?? raw?.template_version),
    slidevMarkdown: normalizeString(raw?.slidevMarkdown ?? raw?.slidev_markdown),
    pptReady: Boolean(raw?.pptReady ?? raw?.ppt_ready),
    errorText: normalizeString(raw?.errorText ?? raw?.error_text)
  };
}

function resolvePresentationStatusText(payload, loading = false) {
  if (loading) return '演示文稿处理中...';
  const status = String(payload?.status || 'NOT_GENERATED').toUpperCase();
  if (status === 'READY') {
    const slideCount = Math.max(0, toSafeInt(payload?.slideCount, 0));
    return slideCount > 0 ? `已完成 · ${slideCount} 页` : '已完成';
  }
  if (status === 'GENERATING') return '生成中';
  if (status === 'FAILED') return normalizeString(payload?.errorText).trim() || '生成失败';
  return '未生成';
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
  if (Number.isNaN(date.getTime())) return '-';
  if (date.getFullYear() <= 0) return '-';
  return `${date.getFullYear()}-${String(date.getMonth() + 1).padStart(2, '0')}-${String(date.getDate()).padStart(2, '0')}`;
}

function resolveSummary(value) {
  const normalized = normalizeString(value).trim();
  return normalized || '暂无简介';
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

function resetDetailNavigationState() {
  detailNavState.loading = false;
  detailNavState.relatedLoading = false;
  detailNavState.sidebarError = '';
  detailNavState.relatedError = '';
  detailNavState.latestPosts = [];
  detailNavState.categories = [];
  detailNavState.selectedCategory = '';
  detailNavState.relatedPosts = [];
}

async function loadDetailSidebarStats() {
  detailNavState.loading = true;
  detailNavState.sidebarError = '';
  try {
    const payload = await getPostSidebar(resolveAuthorizedFetch());
    detailNavState.latestPosts = Array.isArray(payload?.latestPosts ?? payload?.latest_posts)
      ? (payload.latestPosts ?? payload.latest_posts).map(normalizeLatestPost).filter((item) => item.postId > 0)
      : [];
    detailNavState.categories = Array.isArray(payload?.categories)
      ? payload.categories.map(normalizeCategoryStat).filter((item) => item.categoryCode)
      : [];
  } catch (error) {
    detailNavState.sidebarError = normalizeErrorMessage(error, '加载详情侧栏失败');
    detailNavState.latestPosts = [];
    detailNavState.categories = [];
  } finally {
    detailNavState.loading = false;
  }
}

function scrollCurrentRelatedIntoView() {
  const listEl = detailRelatedListRef.value;
  if (!listEl) return;
  const currentItem = listEl.querySelector('[data-current="1"]');
  if (!currentItem) return;
  currentItem.scrollIntoView({ block: 'nearest' });
}

async function loadDetailRelatedPosts(categoryCode, options = {}) {
  const normalizedCategory = normalizeString(categoryCode).toLowerCase();
  detailNavState.selectedCategory = normalizedCategory;
  detailNavState.relatedError = '';
  if (!normalizedCategory) {
    detailNavState.relatedPosts = [];
    return;
  }

  const silent = options?.silent === true;
  if (!silent) {
    detailNavState.relatedLoading = true;
  }
  try {
    const payload = await listPosts(
      {
        pageNo: 1,
        pageSize: 80,
        category: normalizedCategory
      },
      resolveAuthorizedFetch()
    );
    const items = Array.isArray(payload?.items) ? payload.items : [];
    detailNavState.relatedPosts = items.map(normalizePostSummary).filter((post) => post.postId > 0);
    await nextTick();
    scrollCurrentRelatedIntoView();
  } catch (error) {
    detailNavState.relatedError = normalizeErrorMessage(error, '加载同分类文章失败');
    detailNavState.relatedPosts = [];
  } finally {
    detailNavState.relatedLoading = false;
  }
}

async function loadDetailSidebarContext(post) {
  const normalizedCategory = normalizeString(post?.categoryCode).toLowerCase();
  await Promise.all([
    loadDetailSidebarStats(),
    loadDetailRelatedPosts(normalizedCategory, { silent: true })
  ]);
  if (
    normalizedCategory &&
    !detailNavState.categories.some((item) => item.categoryCode === normalizedCategory)
  ) {
    detailNavState.categories = [
      ...detailNavState.categories,
      {
        categoryCode: normalizedCategory,
        count: detailNavState.relatedPosts.length || 0,
        displayName: normalizedCategory,
        coverImageUrl: ''
      }
    ];
  }
}

function selectDetailCategory(categoryCode) {
  loadDetailRelatedPosts(categoryCode);
}

async function loadPostDetail(postId) {
  detailState.loading = true;
  detailState.error = '';
  closeDownloadMenu();
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
    await loadDetailSidebarContext(normalized);
    void loadDetailPresentation(normalized.postId);
    await nextTick();
    setupReadingScroll();
  } catch (error) {
    teardownReadingScroll();
    detailState.post = null;
    detailState.renderedHtml = '';
    detailState.headings = [];
    detailState.renderedLineCount = 0;
    detailState.error = normalizeErrorMessage(error, '加载文章详情失败');
    resetDetailNavigationState();
    resetDetailPresentationState();
  } finally {
    detailState.loading = false;
  }
}

function clearEditorPresentationPollTimer() {
  if (!editorPresentationPollTimer) return;
  window.clearTimeout(editorPresentationPollTimer);
  editorPresentationPollTimer = 0;
}

function resetEditorPresentationState() {
  clearEditorPresentationPollTimer();
  editorPresentationState.loading = false;
  editorPresentationState.generating = false;
  editorPresentationState.error = '';
  editorPresentationState.data = null;
}

function resetDetailPresentationState() {
  detailPresentationState.loading = false;
  detailPresentationState.error = '';
  detailPresentationState.data = null;
}

async function loadEditorPresentation(postId, options = {}) {
  const normalizedPostId = toSafeInt(postId, 0);
  clearEditorPresentationPollTimer();
  if (normalizedPostId <= 0) {
    resetEditorPresentationState();
    return null;
  }
  editorPresentationState.loading = options.silent === true ? editorPresentationState.loading : true;
  editorPresentationState.error = '';
  try {
    const payload = normalizePresentation(await getMyPostPresentation(normalizedPostId, auth.authorizedFetch));
    editorPresentationState.data = payload;
    editorPresentationState.generating = payload.status === 'GENERATING';
    if (payload.status === 'GENERATING') {
      editorPresentationPollTimer = window.setTimeout(() => {
        void loadEditorPresentation(normalizedPostId, { silent: true });
      }, 2500);
    }
    return payload;
  } catch (error) {
    editorPresentationState.error = normalizeErrorMessage(error, '加载演示文稿状态失败');
    editorPresentationState.data = null;
    editorPresentationState.generating = false;
    return null;
  } finally {
    editorPresentationState.loading = false;
  }
}

async function loadDetailPresentation(postId) {
  const normalizedPostId = toSafeInt(postId, 0);
  if (normalizedPostId <= 0) {
    resetDetailPresentationState();
    return null;
  }
  detailPresentationState.loading = true;
  detailPresentationState.error = '';
  try {
    const payload = normalizePresentation(await getPostPresentation(normalizedPostId, resolveAuthorizedFetch()));
    detailPresentationState.data = payload;
    return payload;
  } catch (error) {
    detailPresentationState.error = normalizeErrorMessage(error, '加载演示文稿状态失败');
    detailPresentationState.data = null;
    return null;
  } finally {
    detailPresentationState.loading = false;
  }
}

async function handleGeneratePresentation() {
  if (!canWrite.value) return;
  writerState.error = '';
  writerState.notice = '';
  editorPresentationState.error = '';
  try {
    if (!writerState.editor.postId) {
      await handleSaveDraft({ silent: true });
    }
    const postId = toSafeInt(writerState.editor.postId, 0);
    if (postId <= 0) {
      throw new Error('请先保存草稿后再生成演示文稿');
    }
    editorPresentationState.generating = true;
    const payload = normalizePresentation(await generateMyPostPresentation(postId, auth.authorizedFetch));
    editorPresentationState.data = payload;
    writerState.notice = payload.status === 'READY' ? '演示文稿已生成' : '演示文稿生成已开始';
    await loadEditorPresentation(postId, { silent: true });
  } catch (error) {
    const message = normalizeErrorMessage(error, '生成演示文稿失败');
    editorPresentationState.error = message;
    writerState.error = message;
  } finally {
    editorPresentationState.generating = false;
  }
}

function openEditorPresentationPreview() {
  const postId = toSafeInt(writerState.editor.postId, 0);
  if (postId <= 0 || !editorPresentationReady.value) return;
  router.push({ name: 'blog-presentation', params: { postId }, query: { scope: 'mine' } });
}

function openEditorPresentationInLightApp() {
  const postId = toSafeInt(writerState.editor.postId, 0);
  if (postId <= 0 || !editorPresentationReady.value) return;
  openLightAppWindow('blog-slidev', {
    source: 'blog_editor_presentation',
    postId,
    scope: 'mine'
  });
}

function openDetailPresentationPreview() {
  const postId = toSafeInt(detailState.post?.postId, 0);
  if (postId <= 0 || !detailPresentationReady.value) return;
  router.push({ name: 'blog-presentation', params: { postId } });
}

function openDetailPresentationInLightApp() {
  const postId = toSafeInt(detailState.post?.postId, 0);
  if (postId <= 0 || !detailPresentationReady.value) return;
  openLightAppWindow('blog-slidev', {
    source: 'blog_detail_presentation',
    postId,
    scope: 'public'
  });
}

async function openPresentationDownloadUrl(loader, postId, onError) {
  try {
    const payload = await loader(postId);
    const url = normalizeString(payload?.downloadUrl ?? payload?.download_url).trim();
    if (!url) {
      throw new Error('下载地址为空');
    }
    window.open(url, '_blank', 'noopener');
  } catch (error) {
    onError(normalizeErrorMessage(error, '获取 PPT 下载地址失败'));
  }
}

async function downloadEditorPresentationPpt() {
  const postId = toSafeInt(writerState.editor.postId, 0);
  if (postId <= 0 || !editorPresentationPptReady.value) return;
  await openPresentationDownloadUrl(
    (id) => getMyPostPresentationPptDownloadUrl(id, auth.authorizedFetch),
    postId,
    (message) => {
      editorPresentationState.error = message;
      writerState.error = message;
    }
  );
}

async function downloadDetailPresentationPpt() {
  const postId = toSafeInt(detailState.post?.postId, 0);
  if (postId <= 0 || !detailPresentationPptReady.value) return;
  await openPresentationDownloadUrl(
    (id) => getPostPresentationPptDownloadUrl(id, resolveAuthorizedFetch()),
    postId,
    (message) => {
      detailPresentationState.error = message;
      detailState.error = message;
    }
  );
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
  const markdownText = normalizeMarkdownForEditor(writerState.editor.markdown);
  if (!markdownText.trim()) {
    throw new Error('正文不能为空');
  }
  writerState.editor.markdown = markdownText;
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
    coverImageUrl: writerState.editor.coverImageUrl || undefined,
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
  writerState.editor.coverImageUrl = normalized.coverImageUrl;
  writerState.editor.visibility = normalized.visibility || 'PUBLIC';
  writerState.editor.tagsText = normalized.tags.map((item) => `#${item}`).join(', ');
  writerState.editor.markdown = normalizeMarkdownForEditor(normalized.markdown || '');
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
    writerState.editor.markdown = normalizeMarkdownForEditor(text);
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
  writerState.editor.coverImageUrl = '';
  writerState.editor.visibility = 'PUBLIC';
  writerState.editor.tagsText = '';
  writerState.editor.allowedGroupCodesText = 'USER,FRIEND,ADMIN';
  writerState.editor.markdown = '';
  writerState.editor.markdownBucket = '';
  writerState.editor.markdownKey = '';
  writerState.editor.statusCode = 'DRAFT';
  writerState.editor.lastRelayedSignature = '';
  resetEditorPresentationState();
}

function startNewDraft() {
  resetEditorForm();
  editorMode.value = 'wysiwyg';
  editorSidebarView.value = 'wysiwyg';
  switchViewMode('editor');
}

function switchViewMode(mode) {
  if (mode === 'editor' && !canWrite.value) return;
  if (mode === 'detail' && !detailState.post) return;
  if (mode === 'list' && routeMode.value !== 'list') {
    goBackToBlogList();
    return;
  }
  if (mode === 'detail' && routeMode.value !== 'detail' && detailState.post?.postId) {
    router.push({ name: 'blog-detail', params: { postId: detailState.post.postId } });
    return;
  }
  if (mode === 'editor' && routeMode.value !== 'editor') {
    const postId = writerState.editor.postId || detailState.post?.postId;
    router.push({ name: 'blog-editor', params: postId ? { postId } : {} });
    return;
  }
  viewMode.value = mode;
  if (mode !== 'detail') {
    closeDownloadMenu();
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

async function jumpToBlogList() {
  leftNavHint.value = '';
  closeDownloadMenu();
  await router.push({ name: 'blog' });
}

async function jumpToBlogEditor() {
  if (!canWrite.value) {
    leftNavHint.value = '当前账号暂无写文权限';
    return;
  }
  leftNavHint.value = '';
  closeDownloadMenu();
  await router.push({ name: 'blog-editor' });
}

async function jumpToBlogCategories() {
  leftNavHint.value = '';
  closeDownloadMenu();
  await router.push({ name: 'blog', query: { panel: 'categories' } });
}

async function jumpToBlogWhisper() {
  leftNavHint.value = '';
  closeDownloadMenu();
  await router.push({ name: 'blog', query: { panel: 'whisper' } });
}

async function openPostDetail(postId) {
  const normalizedPostId = toSafeInt(postId, 0);
  if (normalizedPostId <= 0) return;
  if (routeMode.value !== 'detail') {
    closeDownloadMenu();
    await router.push({ name: 'blog-detail', params: { postId: normalizedPostId } });
    return;
  }
  viewMode.value = 'detail';
  await loadPostDetail(normalizedPostId);
}

async function openMinePost(postId, options = {}) {
  const normalizedPostId = toSafeInt(postId, 0);
  if (normalizedPostId <= 0) return;
  writerState.error = '';
  writerState.notice = '';
  try {
    const payload = await getMyPostDetail(normalizedPostId, auth.authorizedFetch);
    applyPostDetailToEditor(payload);
    await loadEditorPresentation(normalizedPostId);
    if (options.routeSync !== false && routeMode.value !== 'editor') {
      await router.push({ name: 'blog-editor', params: { postId: normalizedPostId } });
      return;
    }
    switchViewMode('editor');
  } catch (error) {
    writerState.error = normalizeErrorMessage(error, '读取我的文章失败');
  }
}

async function openCurrentPostInEditor() {
  if (!detailState.post?.editable || !detailState.post?.postId) return;
  closeDownloadMenu();
  await router.push({ name: 'blog-editor', params: { postId: detailState.post.postId } });
}

function goBackToBlogList() {
  closeDownloadMenu();
  router.push({ name: 'blog' });
}

function refreshEditorLayout() {
  const editor = richEditorRef.value;
  if (!editor || typeof editor.refreshLayout !== 'function') return;
  editor.refreshLayout();
}

async function setEditorSidebarView(mode) {
  const normalizedMode = String(mode || '').toLowerCase();
  const nextView = normalizedMode === 'info' ? 'info' : normalizedMode === 'markdown' ? 'markdown' : 'wysiwyg';
  editorSidebarView.value = nextView;
  if (nextView === 'markdown' || nextView === 'wysiwyg') {
    setEditorMode(nextView);
  }
  await nextTick();
  refreshEditorLayout();
}

function exitEditor() {
  closeDownloadMenu();
  const postId = toSafeInt(writerState.editor.postId ?? detailState.post?.postId, 0);
  if (postId > 0) {
    router.push({ name: 'blog-detail', params: { postId } });
    return;
  }
  router.push({ name: 'blog' });
}

function toggleTocMode() {
  tocMode.value = tocMode.value === 'all' ? 'onlyCurrentTree' : 'all';
}

function sanitizeFileSegment(input, fallback = 'post') {
  const normalized = String(input || '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');
  return normalized || fallback;
}

function downloadTextAsFile(content, fileName, mimeType = 'text/plain;charset=utf-8') {
  const blob = new Blob([String(content || '')], { type: mimeType });
  const url = URL.createObjectURL(blob);
  const anchor = document.createElement('a');
  anchor.href = url;
  anchor.download = fileName;
  anchor.click();
  URL.revokeObjectURL(url);
}

function closeDownloadMenu() {
  downloadState.open = false;
}

function toggleDownloadMenu() {
  downloadState.open = !downloadState.open;
}

function handleGlobalPointerDown(event) {
  if (!downloadState.open) return;
  const wrap = downloadWrapRef.value;
  if (!(wrap instanceof HTMLElement)) {
    closeDownloadMenu();
    return;
  }
  const target = event?.target;
  if (target instanceof Node && wrap.contains(target)) {
    return;
  }
  closeDownloadMenu();
}

async function resolveCurrentMarkdownForDownload() {
  if (!detailState.post?.postId) return '';
  const inMemory = normalizeString(detailState.post.markdown);
  if (inMemory) {
    return inMemory;
  }
  return getPostMarkdown(detailState.post.postId, resolveAuthorizedFetch());
}

function wrapMarkdownAsHtmlDocument(title, htmlBody) {
  const safeTitle = String(title || 'blog-post').replace(/</g, '&lt;').replace(/>/g, '&gt;');
  return `<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>${safeTitle}</title>
</head>
<body>
${String(htmlBody || '')}
</body>
</html>`;
}

function markdownToPlainText(markdown) {
  const source = String(markdown || '');
  return source
    .replace(/```[\s\S]*?```/g, (block) => block.replace(/```/g, '').trim())
    .replace(/`([^`]+)`/g, '$1')
    .replace(/!\[[^\]]*]\(([^)]+)\)/g, '$1')
    .replace(/\[([^\]]+)]\(([^)]+)\)/g, '$1')
    .replace(/^>\s?/gm, '')
    .replace(/^#{1,6}\s*/gm, '')
    .replace(/[*_~`>#-]/g, '')
    .replace(/\n{3,}/g, '\n\n')
    .trim();
}

async function downloadCurrentPost(format = 'md') {
  if (!detailState.post?.postId) return;
  try {
    const markdown = await resolveCurrentMarkdownForDownload();
    const safeBaseName = sanitizeFileSegment(detailState.post.slugCode || detailState.post.title || `post-${detailState.post.postId}`);
    const normalizedFormat = String(format || 'md').toLowerCase();
    if (normalizedFormat === 'html') {
      const rendered = renderMarkdownDocument(markdown);
      const html = wrapMarkdownAsHtmlDocument(detailState.post.title, rendered.html);
      downloadTextAsFile(html, `${safeBaseName}.html`, 'text/html;charset=utf-8');
      closeDownloadMenu();
      return;
    }
    if (normalizedFormat === 'txt') {
      const plainText = markdownToPlainText(markdown);
      downloadTextAsFile(plainText, `${safeBaseName}.txt`, 'text/plain;charset=utf-8');
      closeDownloadMenu();
      return;
    }
    downloadTextAsFile(markdown, `${safeBaseName}.md`, 'text/markdown;charset=utf-8');
    closeDownloadMenu();
  } catch (error) {
    detailState.error = normalizeErrorMessage(error, '下载文章失败');
    closeDownloadMenu();
  }
}

function tocIndentStyle(heading) {
  const depth = Math.max(0, toSafeInt(heading?.level, 1) - 1);
  return {
    '--toc-depth': depth,
    '--toc-indent': `${depth * 14}px`,
    paddingInlineStart: '4px'
  };
}

function resolveTocIcon(depth, isActive = false) {
  if (isActive) return 'fas fa-location-dot';
  const normalizedDepth = Math.max(0, toSafeInt(depth, 0));
  if (normalizedDepth <= 0) return 'fas fa-bookmark';
  if (normalizedDepth === 1) return 'fas fa-folder-open';
  if (normalizedDepth === 2) return 'fas fa-file-lines';
  return 'fas fa-angle-right';
}

function resolveScrollRoot() {
  const source = articleScrollRef.value;
  if (!source) return null;
  if (source instanceof HTMLElement) return source;
  if (typeof source.getElement === 'function') {
    const element = source.getElement();
    if (element instanceof HTMLElement) return element;
  }
  const fallback = source?.$el;
  return fallback instanceof HTMLElement ? fallback : null;
}

function resolveTocListRoot() {
  const source = tocListRef.value;
  if (!source) return null;
  if (source instanceof HTMLElement) return source;
  if (typeof source.getElement === 'function') {
    const element = source.getElement();
    if (element instanceof HTMLElement) return element;
  }
  const fallback = source?.$el;
  return fallback instanceof HTMLElement ? fallback : null;
}

function syncTocListToActive(options = {}) {
  if (viewMode.value !== 'detail' || tocMode.value !== 'all') return;
  const activeId = String(activeHeadingId.value || '');
  if (!activeId) return;
  const root = resolveTocListRoot();
  if (!root) return;

  const activeItem = Array.from(root.querySelectorAll('.toc-item')).find(
    (item) => item.getAttribute('data-heading-id') === activeId
  );
  if (!activeItem) return;

  const maxScrollTop = Math.max(0, root.scrollHeight - root.clientHeight);
  if (maxScrollTop <= 0) return;

  // Keep active heading near center when possible; clamp near edges to avoid extra movement.
  const desiredTop = activeItem.offsetTop + activeItem.offsetHeight / 2 - root.clientHeight / 2;
  const clampedTop = Math.max(0, Math.min(maxScrollTop, desiredTop));
  if (Math.abs(clampedTop - root.scrollTop) < 1) return;

  root.scrollTo({
    top: clampedTop,
    behavior: options.behavior === 'smooth' ? 'smooth' : 'auto'
  });
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
  const root = resolveScrollRoot();
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
  const nextHeadingId = candidate?.getAttribute('data-heading-id') || activeHeadingId.value;
  if (nextHeadingId !== activeHeadingId.value) {
    activeHeadingId.value = nextHeadingId;
    syncTocListToActive({ behavior: 'auto' });
  }
}

function handleDetailScroll() {
  const root = resolveScrollRoot();
  if (!root) return;
  const maxScroll = root.scrollHeight - root.clientHeight;
  if (maxScroll <= 0) {
    readingProgress.value = 1;
  } else {
    readingProgress.value = Math.max(0, Math.min(1, root.scrollTop / maxScroll));
  }
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
  const root = resolveScrollRoot();
  if (!root || viewMode.value !== 'detail') return;
  refreshHeadingDomNodes();
  root.addEventListener('scroll', handleDetailScroll, { passive: true });
  boundScrollRoot = root;
  handleDetailScroll();
  nextTick(() => syncTocListToActive({ behavior: 'auto' }));
}

function scrollToHeading(headingId) {
  const root = resolveScrollRoot();
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

function handleTocItemClick(headingId) {
  if (!headingId) return;
  if (viewMode.value === 'detail') {
    scrollToHeading(headingId);
    return;
  }
  activeHeadingId.value = String(headingId);
  richEditorRef.value?.focus?.();
}

function scrollToTop() {
  const root = resolveScrollRoot();
  if (!root) return;
  root.scrollTo({
    top: 0,
    behavior: 'smooth'
  });
}

function insertTextIntoEditor(text) {
  const editor = richEditorRef.value;
  if (!editor || typeof editor.insertText !== 'function') {
    const source = normalizeMarkdownForEditor(writerState.editor.markdown);
    const next = normalizeMarkdownForEditor(text);
    writerState.editor.markdown = source ? `${source}\n\n${next}` : next;
    writerState.editor.lastRelayedSignature = '';
    return;
  }
  editor.insertText(text);
  writerState.editor.lastRelayedSignature = '';
}

function closePasteDialog() {
  pasteState.dialogVisible = false;
  pasteState.pendingText = '';
}

function cancelPasteDialog() {
  closePasteDialog();
}

function confirmPasteDialog(mode) {
  const normalizedMode = mode === 'plain' ? 'plain' : 'markdown';
  const pendingText = String(pasteState.pendingText || '');
  const content = normalizedMode === 'markdown' ? normalizeMarkdownForEditor(pendingText) : escapeMarkdownPlainText(pendingText);
  pasteState.sessionDecision = normalizedMode;
  insertTextIntoEditor(content);
  closePasteDialog();
}

function resetPasteSessionDecision() {
  pasteState.sessionDecision = '';
}

function handleRichEditorPasteCandidate(clipboardText) {
  if (!clipboardText) return;
  if (pasteState.sessionDecision === 'markdown') {
    insertTextIntoEditor(normalizeMarkdownForEditor(clipboardText));
    return;
  }
  if (pasteState.sessionDecision === 'plain') {
    insertTextIntoEditor(escapeMarkdownPlainText(clipboardText));
    return;
  }
  pasteState.pendingText = clipboardText;
  pasteState.dialogVisible = true;
}

function handleEditorModeChange(mode) {
  const nextMode = String(mode || '').toLowerCase() === 'markdown' ? 'markdown' : 'wysiwyg';
  editorMode.value = nextMode;
  if (editorSidebarView.value !== 'info') {
    editorSidebarView.value = nextMode;
  }
}

function setEditorMode(mode) {
  const nextMode = String(mode || '').toLowerCase() === 'markdown' ? 'markdown' : 'wysiwyg';
  const editor = richEditorRef.value;
  if (editor && typeof editor.applyEditorAction === 'function') {
    editor.applyEditorAction(nextMode === 'markdown' ? 'mode-markdown' : 'mode-wysiwyg');
    return;
  }
  if (editor && typeof editor.setMode === 'function') {
    editor.setMode(nextMode);
    return;
  }
  editorMode.value = nextMode;
}

function toggleEditorMode() {
  const nextMode = editorMode.value === 'wysiwyg' ? 'markdown' : 'wysiwyg';
  setEditorSidebarView(nextMode);
}

function handleRichEditorReady() {
  const editor = richEditorRef.value;
  if (!editor || typeof editor.setMode !== 'function') return;
  editor.setMode(editorMode.value);
  refreshEditorLayout();
}

function resolveEditorHotkeyScope(target) {
  const activeTarget =
    target instanceof HTMLElement ? target : document.activeElement instanceof HTMLElement ? document.activeElement : null;
  if (!(activeTarget instanceof HTMLElement)) return '';
  if (activeTarget.closest('.blog-rich-editor')) return 'editor';
  if (activeTarget.closest('.editor-info-panel') && activeTarget.closest('input, textarea, select')) return 'meta';
  return '';
}

function applyEditorHotkeyAction(action, payload) {
  const editor = richEditorRef.value;
  if (!editor || typeof editor.applyEditorAction !== 'function') return false;
  return editor.applyEditorAction(action, payload);
}

function handleEditorHotkey(event) {
  if (viewMode.value !== 'editor' || event.defaultPrevented || event.isComposing) return;
  const primaryPressed = event.ctrlKey || event.metaKey;
  if (!primaryPressed) return;

  const scope = resolveEditorHotkeyScope(event.target);
  if (!scope) return;

  const { code, shiftKey, altKey } = event;
  if (!shiftKey && !altKey && code === 'KeyS') {
    event.preventDefault();
    void handleSaveDraft().catch(() => {});
    return;
  }

  if (!shiftKey && !altKey && code === 'Slash') {
    event.preventDefault();
    toggleEditorMode();
    return;
  }

  if (scope !== 'editor') return;

  const exec = (action, payload) => {
    event.preventDefault();
    applyEditorHotkeyAction(action, payload);
  };

  if (!shiftKey && !altKey && code === 'KeyB') return exec('bold');
  if (!shiftKey && !altKey && code === 'KeyI') return exec('italic');
  if (shiftKey && !altKey && code === 'KeyS') return exec('strike');
  if (!shiftKey && !altKey && code === 'KeyK') return exec('link');
  if (shiftKey && !altKey && code === 'Digit7') return exec('ordered-list');
  if (shiftKey && !altKey && code === 'Digit8') return exec('bullet-list');
  if (shiftKey && !altKey && code === 'Digit9') return exec('task-list');
  if (altKey && !shiftKey && code === 'Digit0') return exec('paragraph');
  if (altKey && !shiftKey && /^Digit[1-6]$/.test(code)) {
    return exec('heading', { level: Number(code.slice(-1)) });
  }
  if (altKey && !shiftKey && code === 'KeyQ') return exec('blockquote');
  if (altKey && !shiftKey && code === 'KeyC') return exec('code-block');
  if (altKey && !shiftKey && code === 'KeyH') return exec('hr');
  if (altKey && !shiftKey && code === 'KeyT') return exec('table', { rowCount: 2, columnCount: 2 });
}

async function syncRouteDrivenView() {
  const mode = routeMode.value;
  if (mode !== 'editor') {
    clearEditorPresentationPollTimer();
  }
  if (mode === 'detail') {
    leftNavHint.value = '';
    const postId = toSafeInt(route.params.postId, 0);
    viewMode.value = 'detail';
    if (postId > 0 && detailState.post?.postId !== postId) {
      await loadPostDetail(postId);
    }
    return;
  }

  if (mode === 'editor') {
    leftNavHint.value = '';
    closeDownloadMenu();
    viewMode.value = 'editor';
    const postId = toSafeInt(route.params.postId, 0);
    if (postId > 0) {
      if (writerState.editor.postId !== postId) {
        await openMinePost(postId, { routeSync: false });
      } else {
        await loadEditorPresentation(postId, { silent: true });
      }
      return;
    }
    if (!canWrite.value) {
      writerState.error = '当前账号没有博客写文权限';
      await router.replace({ name: 'blog' });
      return;
    }
    resetEditorForm();
    editorMode.value = 'wysiwyg';
    editorSidebarView.value = 'wysiwyg';
    await nextTick();
    refreshEditorLayout();
    return;
  }

  resetDetailNavigationState();
  resetDetailPresentationState();
  leftNavHint.value = '';
  closeDownloadMenu();
  viewMode.value = 'list';
}

watch(
  () => canWrite.value,
  async (enabled) => {
    if (enabled) {
      await loadMyPosts();
      return;
    }
    writerState.myPosts = [];
    resetEditorPresentationState();
    if (viewMode.value === 'editor') {
      viewMode.value = 'list';
    }
  },
  { immediate: false }
);

watch(
  () => [route.name, route.params.postId],
  () => {
    syncRouteDrivenView();
  }
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

watch(
  () => tocMode.value,
  (mode) => {
    if (mode === 'all') {
      nextTick(() => syncTocListToActive({ behavior: 'auto' }));
    }
  }
);

watch(
  () => [viewMode.value, editorTocHeadings.value],
  ([mode, headings]) => {
    if (mode !== 'editor') return;
    const items = Array.isArray(headings) ? headings : [];
    const ids = new Set(items.map((item, index) => String(item?.id || `toc-${index}`)));
    const currentId = String(activeHeadingId.value || '');
    if (!ids.has(currentId)) {
      activeHeadingId.value = items[0]?.id ? String(items[0].id) : '';
    }
  },
  { immediate: true }
);

onMounted(async () => {
  window.addEventListener('pointerdown', handleGlobalPointerDown);
  window.addEventListener('keydown', handleEditorHotkey, true);
  await auth.ensureReady();
  if (routeMode.value === 'list') {
    await loadPostList();
  }
  if (canWrite.value) {
    await loadMyPosts();
  }
  await syncRouteDrivenView();
});

onBeforeUnmount(() => {
  window.removeEventListener('pointerdown', handleGlobalPointerDown);
  window.removeEventListener('keydown', handleEditorHotkey, true);
  teardownReadingScroll();
  clearEditorPresentationPollTimer();
});
</script>

<style scoped>
.blog-page {
  --blog-gap: clamp(8px, 0.9vw, 14px);
  --blog-panel-padding: clamp(8px, 0.8vw, 12px);
  --blog-left-width: clamp(200px, 18vw, 248px);
  --blog-right-width: clamp(190px, 20vw, 288px);
  height: 100%;
  min-height: 0;
  overflow: hidden;
  color: rgba(239, 244, 255, 0.96);
  display: grid;
  grid-template-rows: auto 1fr;
  gap: var(--blog-gap);
}

.toolbar {
  --liquid-bg: rgba(20, 27, 42, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 12px 28px rgba(6, 10, 18, 0.2);
  border-radius: 12px;
  padding: var(--blog-panel-padding) calc(var(--blog-panel-padding) + 2px);
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
  height: 100%;
  min-height: 0;
  overflow: hidden;
  display: grid;
  grid-template-columns: var(--blog-left-width) minmax(0, 1fr) var(--blog-right-width);
  gap: var(--blog-gap);
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
  padding: var(--blog-panel-padding);
  display: grid;
  gap: 12px;
  align-content: start;
  min-width: 0;
}

.side-switch-block {
  gap: 10px;
}

.side-switch {
  display: grid;
  gap: 8px;
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
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.chip-count {
  min-width: 18px;
  height: 18px;
  border-radius: 999px;
  font-size: 11px;
  background: rgba(255, 255, 255, 0.2);
  display: inline-grid;
  place-items: center;
}

.chip-btn.active,
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

.detail-nav-list {
  max-height: 232px;
  overflow: auto;
  overscroll-behavior: contain;
  padding-right: 2px;
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
  line-height: 1.35;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
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
  padding: var(--blog-panel-padding);
  container-type: inline-size;
  container-name: blog-center;
  height: 100%;
  min-height: 0;
  overflow: hidden;
  display: grid;
  grid-template-rows: minmax(0, 1fr);
  min-width: 0;
  max-width: 100%;
}

.list-view,
.detail-view,
.editor-view {
  min-height: 0;
}

.list-view {
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
  min-height: 0;
  height: 100%;
}

.detail-head {
  display: grid;
  gap: 8px;
  margin-bottom: 10px;
}

.detail-top-actions {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.detail-action-right {
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.icon-circle-btn {
  width: 36px;
  height: 36px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.14);
  color: rgba(241, 246, 255, 0.96);
  display: inline-grid;
  place-items: center;
  font-size: 15px;
}

.download-wrap {
  position: relative;
}

.download-menu {
  --liquid-bg: rgba(13, 19, 32, 0.8);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 26px rgba(5, 9, 16, 0.24);
  position: absolute;
  top: calc(100% + 6px);
  right: 0;
  min-width: 120px;
  border-radius: 10px;
  padding: 6px;
  display: grid;
  gap: 4px;
  z-index: 20;
}

.download-item {
  border: 0;
  border-radius: 8px;
  min-height: 30px;
  padding: 0 10px;
  text-align: left;
  background: rgba(255, 255, 255, 0.12);
  color: rgba(236, 244, 255, 0.95);
}

.detail-title-row {
  display: block;
}

.detail-title-row h2 {
  min-width: 0;
}

.detail-head h2 {
  font-size: clamp(22px, 3vw, 30px);
}

.detail-summary {
  color: rgba(218, 227, 247, 0.9);
  line-height: 1.65;
}

.detail-scroll {
  min-height: 0;
  height: 100%;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(8, 12, 20, 0.36);
  padding: 14px;
}

.detail-bottom-spacer {
  height: clamp(140px, 24vh, 280px);
  pointer-events: none;
}

.detail-cover-wrap {
  margin-bottom: 12px;
  border-radius: 12px;
  overflow: hidden;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(7, 11, 19, 0.52);
}

.detail-cover {
  display: block;
  width: 100%;
  max-height: min(42vh, 420px);
  object-fit: cover;
}

.editor-view {
  height: 100%;
  min-height: 0;
  display: flex;
  flex-direction: column;
  gap: var(--blog-gap);
  overflow: hidden;
  min-width: 0;
  max-width: 100%;
}

.editor-topbar {
  --liquid-bg: rgba(16, 24, 38, 0.52);
  --liquid-border: rgba(255, 255, 255, 0.22);
  --liquid-shadow: 0 12px 24px rgba(6, 10, 18, 0.2);
  border-radius: 12px;
  padding: var(--blog-panel-padding);
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
  gap: 10px;
}

.editor-topbar-main {
  min-width: 0;
  display: grid;
  gap: 3px;
  align-content: center;
}

.editor-topbar-main h3 {
  margin: 0;
  font-size: 14px;
  line-height: 1.25;
  color: rgba(239, 245, 255, 0.96);
}

.editor-topbar-mode {
  font-size: 12px;
  color: rgba(211, 223, 248, 0.9);
}

.editor-topbar-actions {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  flex-wrap: wrap;
  gap: 8px;
}

.editor-topbar-btn.active {
  border-color: rgba(var(--accent-rgb), 0.46);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(247, 250, 255, 0.98);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.12);
}

.editor-topbar-btn:disabled {
  opacity: 1;
  cursor: default;
}

.editor-exit-btn {
  border-color: rgba(var(--accent-rgb), 0.46);
  background: rgba(var(--accent-rgb), 0.2);
}

.editor-meta {
  --liquid-bg: rgba(16, 24, 38, 0.34);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 12px 24px rgba(6, 10, 18, 0.2);
  border-radius: 12px;
  padding: var(--blog-panel-padding);
  display: grid;
  grid-template-rows: auto minmax(0, 1fr) auto;
  gap: var(--blog-gap);
  min-height: 0;
  overflow: hidden;
  max-height: clamp(240px, 44vh, 500px);
  min-width: 0;
  max-width: 100%;
  opacity: 1;
  transition:
    max-height 0.22s ease,
    padding 0.2s ease,
    opacity 0.18s ease,
    border-color 0.18s ease,
    gap 0.18s ease;
}

.editor-meta.collapsed {
  max-height: 0;
  padding-top: 0;
  padding-bottom: 0;
  border-color: rgba(255, 255, 255, 0);
  opacity: 0;
  gap: 0;
  pointer-events: none;
}

.editor-meta-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 10px;
  flex-wrap: wrap;
}

.editor-meta-title {
  min-width: 0;
  display: grid;
  gap: 4px;
}

.editor-meta-title h3 {
  margin: 0;
  font-size: 13px;
  color: rgba(231, 239, 255, 0.95);
}

.editor-meta-title span {
  font-size: 12px;
  color: rgba(205, 217, 243, 0.84);
}

.editor-meta-head-actions {
  min-width: 0;
  display: flex;
  align-items: center;
  justify-content: flex-end;
  flex-wrap: wrap;
  gap: 8px;
}

.editor-meta-body {
  min-height: 0;
  overflow: auto;
  overscroll-behavior: contain;
  max-height: none;
  opacity: 1;
  pointer-events: auto;
}

.editor-meta-body.collapsed {
  max-height: 0;
  opacity: 0;
  pointer-events: none;
}

.editor-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(min(260px, 100%), 1fr));
  gap: 8px 10px;
  min-width: 0;
  max-width: 100%;
}

.field {
  display: grid;
  gap: 6px;
  min-width: 0;
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

.editor-meta-foot {
  display: grid;
  gap: 8px;
  min-width: 0;
  padding-top: 2px;
  border-top: 1px solid rgba(255, 255, 255, 0.08);
}

.editor-meta-foot-actions {
  min-width: 0;
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  align-items: center;
}

.editor-meta-head-actions .mini-btn,
.editor-meta-foot-actions .mini-btn {
  min-height: 32px;
  border-radius: 9px;
  border-color: rgba(255, 255, 255, 0.24);
}

.editor-meta-status-wrap {
  min-width: 0;
}

.editor-meta-message {
  margin: 0;
}

.editor-status {
  font-size: 12px;
  color: rgba(208, 220, 247, 0.88);
}

.editor-body {
  flex: 1 1 auto;
  min-height: 0;
  display: flex;
  flex-direction: column;
  gap: var(--blog-gap);
  min-width: 0;
  max-width: 100%;
}

.editor-view.meta-expanded .editor-body {
  min-height: clamp(260px, 34vh, 520px);
}

.editor-pane {
  flex: 1;
  min-height: 0;
  display: flex;
  flex-direction: column;
  gap: 6px;
  min-width: 0;
}

.editor-pane-head {
  display: flex;
  align-items: center;
  justify-content: flex-start;
  gap: 8px;
}

.editor-pane span {
  font-size: 12px;
  color: rgba(218, 228, 248, 0.9);
}

.editor-mode-toggle {
  min-height: 30px;
  padding: 0 11px;
}

.editor-rich-editor {
  flex: 1;
  min-height: 0;
  min-width: 0;
  width: 100%;
  max-width: 100%;
}

.editor-pane-full {
  flex: 1;
  height: auto;
  min-height: clamp(420px, 58vh, 960px);
  min-width: 0;
  max-width: 100%;
}

.right-panel {
  padding: var(--blog-panel-padding);
  height: 100%;
  min-height: 0;
  min-width: 0;
  overflow: hidden;
  display: grid;
  grid-template-rows: auto 1fr;
  gap: var(--blog-gap);
}

.toc-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.toc-head h2 {
  font-size: 14px;
}

.toc-mode-toggle {
  width: 34px;
  height: 34px;
  font-size: 14px;
}

.toc-body {
  min-height: 0;
  overflow: hidden;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
  gap: 8px;
}

.editor-info-panel {
  min-height: 0;
  display: grid;
  align-content: start;
  gap: 10px;
  padding-right: 2px;
}

.editor-info-section {
  --liquid-bg: rgba(14, 20, 34, 0.42);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 12px 24px rgba(6, 10, 18, 0.14);
  border-radius: 12px;
  padding: 12px;
  display: grid;
  gap: 10px;
}

.editor-info-section-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.editor-info-section-head h3 {
  margin: 0;
  font-size: 13px;
  color: rgba(235, 243, 255, 0.96);
}

.editor-info-section-status {
  font-size: 12px;
  color: rgba(204, 217, 244, 0.9);
}

.editor-info-section-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.editor-info-panel-actions,
.editor-info-panel-footer-actions {
  min-width: 0;
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  align-items: center;
}

.editor-info-panel-actions .mini-btn,
.editor-info-panel-footer-actions .mini-btn {
  min-height: 32px;
  border-radius: 9px;
  border-color: rgba(255, 255, 255, 0.24);
}

.editor-info-panel-footer {
  display: grid;
  gap: 8px;
  min-width: 0;
  padding-top: 4px;
  border-top: 1px solid rgba(255, 255, 255, 0.08);
}

.editor-info-panel-status {
  min-width: 0;
}

.toc-metrics {
  border: none;
  background: transparent;
  padding: 4px 2px 8px;
  display: grid;
  gap: 3px;
  font-size: 12px;
  color: rgba(207, 220, 247, 0.9);
}

.toc-list {
  min-height: 0;
  display: grid;
  gap: 1px;
  align-content: start;
}

.toc-item {
  border: none;
  min-height: 30px;
  border-radius: 0;
  background: transparent;
  color: rgba(222, 234, 255, 0.93);
  text-align: left;
  font-size: 13px;
  padding: 3px 4px 3px 0;
  position: relative;
  display: flex;
  align-items: center;
  gap: 6px;
}

.toc-item::after {
  content: '';
  position: absolute;
  left: calc(10px + var(--toc-indent));
  top: -4px;
  bottom: -4px;
  border-left: 1px solid rgba(148, 168, 206, 0.3);
  pointer-events: none;
}

.toc-item .toc-branch {
  position: absolute;
  left: calc(10px + var(--toc-indent));
  top: 50%;
  width: 13px;
  border-top: 1px solid rgba(179, 199, 236, 0.64);
  transform: translateY(-50%);
}

.toc-item.has-next-sibling .toc-branch::before,
.toc-item.has-child .toc-branch::before {
  content: '';
  position: absolute;
  left: 0;
  top: -15px;
  bottom: -15px;
  border-left: 1px solid rgba(179, 199, 236, 0.5);
}

.toc-item .toc-icon {
  width: 16px;
  height: 16px;
  display: grid;
  place-items: center;
  flex: 0 0 16px;
  margin-left: calc(var(--toc-indent) + 14px);
  color: rgba(193, 211, 242, 0.9);
}

.toc-item .toc-icon i {
  font-size: 11px;
}

.toc-level-badge {
  flex: 0 0 auto;
  min-width: 24px;
  font-size: 11px;
  font-weight: 760;
  letter-spacing: 0.04em;
  color: rgba(var(--accent-rgb), 0.94);
}

.toc-item .toc-label {
  min-width: 0;
  font-weight: 630;
  letter-spacing: 0.1px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.toc-item.ancestor {
  color: rgba(236, 246, 255, 0.98);
}

.toc-item.active {
  color: rgba(255, 255, 255, 0.99);
  font-weight: 740;
  text-shadow: 0 0 12px rgba(var(--accent-rgb), 0.22);
}

.toc-item.active .toc-icon {
  color: rgba(var(--accent-rgb), 0.98);
}

.toc-item.active .toc-icon i {
  filter: drop-shadow(0 0 6px rgba(var(--accent-rgb), 0.42));
}

.toc-item:hover {
  color: rgba(246, 252, 255, 0.98);
}

.toc-empty {
  font-size: 12px;
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
  right: 24px;
  bottom: 120px;
  border-radius: 999px;
  width: 68px;
  height: 68px;
  padding: 0;
  display: grid;
  place-items: center;
  border: 1px solid rgba(255, 255, 255, 0.24);
  color: rgba(241, 246, 255, 0.96);
  z-index: 1200;
  overflow: hidden;
}

.progress-fab::before {
  content: '';
  position: absolute;
  inset: 0;
  background: radial-gradient(circle at 30% 30%, rgba(var(--accent-rgb), 0.2), rgba(9, 14, 25, 0.68));
  z-index: -1;
}

.progress-ring {
  width: 44px;
  height: 44px;
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

.progress-fab-percent {
  position: absolute;
  bottom: 6px;
  left: 0;
  right: 0;
  text-align: center;
  font-size: 12px;
  font-weight: 600;
  letter-spacing: 0.02em;
  color: rgba(241, 246, 255, 0.98);
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

@media (max-width: 1365px) {
  .blog-page {
    --blog-left-width: clamp(188px, 19vw, 232px);
    --blog-right-width: clamp(170px, 20vw, 236px);
  }
}

@media (max-width: 1200px) {
  .blog-page {
    --blog-left-width: clamp(160px, 17vw, 196px);
    --blog-right-width: clamp(156px, 18vw, 210px);
  }
}

@media (max-width: 1080px) {
  .blog-page {
    --blog-left-width: clamp(148px, 16vw, 176px);
    --blog-right-width: clamp(142px, 16.5vw, 188px);
  }
}

@container blog-center (max-width: 980px) {
  .editor-grid {
    grid-template-columns: 1fr;
  }

  .editor-meta-head-actions {
    width: 100%;
    justify-content: flex-start;
  }

  .editor-pane-full {
    min-height: clamp(260px, 34vh, 560px);
  }
}

@container blog-center (max-width: 760px) {
  .editor-topbar {
    grid-template-columns: 1fr;
    align-items: center;
  }

  .editor-topbar-main {
    width: 100%;
    justify-items: start;
    text-align: left;
  }

  .editor-topbar-actions {
    width: 100%;
    justify-content: flex-start;
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

  .editor-topbar {
    grid-template-columns: 1fr;
    align-items: stretch;
  }

  .editor-topbar-actions {
    width: 100%;
    flex-wrap: wrap;
    justify-content: flex-start;
  }

  .editor-body {
    flex: 1;
    min-height: 0;
  }

  .editor-pane-full {
    min-height: 0;
  }

  .progress-fab {
    right: 10px;
    bottom: 88px;
    width: 60px;
    height: 60px;
  }

  .progress-ring {
    width: 38px;
    height: 38px;
  }

  .progress-fab-percent {
    font-size: 11px;
    bottom: 4px;
  }
}
</style>
