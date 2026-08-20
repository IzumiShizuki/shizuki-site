<template>
  <section class="lightapp-window kj-source-window">
    <LightAppTopToolbar :window-id="props.windowId" layout="space-between">
      <div class="toolbar-switches">
        <button
          v-if="activeTool"
          class="icon-btn toolbar-btn ripple-trigger"
          type="button"
          title="返回工具目录"
          aria-label="返回工具目录"
          @click="closePreview"
        >
          <i class="fas fa-arrow-left" aria-hidden="true"></i>
        </button>
        <span class="toolbar-hint">{{ activeTool ? activeTool.name : `${filteredTools.length}/${catalog.tools.length} 个工具` }}</span>
      </div>
      <div class="toolbar-actions">
        <button
          v-if="activeTool?.launchMode === 'website' && activeTool.url"
          class="icon-btn toolbar-btn ripple-trigger"
          type="button"
          title="在新标签页打开"
          aria-label="在新标签页打开"
          @click="openExternal(activeTool.url)"
        >
          <i class="fas fa-arrow-up-right-from-square" aria-hidden="true"></i>
        </button>
        <button
          class="icon-btn toolbar-btn ripple-trigger"
          type="button"
          title="打开 KJ 官网"
          aria-label="打开 KJ 官网"
          :disabled="!catalog.sourceHomeUrl"
          @click="openExternal(catalog.sourceHomeUrl)"
        >
          <i class="fas fa-house-signal" aria-hidden="true"></i>
        </button>
        <button
          class="icon-btn toolbar-btn ripple-trigger"
          type="button"
          title="刷新 KJ 工具目录"
          aria-label="刷新 KJ 工具目录"
          :disabled="loading || detailBusyId !== ''"
          @click="loadCatalog(true)"
        >
          <i :class="loading ? 'fas fa-spinner fa-spin' : 'fas fa-rotate'" aria-hidden="true"></i>
        </button>
      </div>
    </LightAppTopToolbar>

    <div class="trust-banner" role="note">
      <i class="fas fa-shield-halved" aria-hidden="true"></i>
      <span>KJ 社区内容由第三方作者提供；运行区使用无同源权限的浏览器沙箱，仍请勿输入账号、密码或隐私数据。</span>
    </div>

    <p v-if="errorText" class="source-message error-message" role="alert">
      <span>{{ errorText }}</span>
      <button v-if="!activeTool" class="text-action ripple-trigger" type="button" @click="loadCatalog(true)">重试</button>
    </p>

    <section v-if="activeTool" class="preview-stage">
      <header class="preview-head">
        <div class="tool-icon" :style="iconStyle(activeTool)">
          <i :class="activeTool.icon" aria-hidden="true"></i>
        </div>
        <div class="preview-copy">
          <div class="title-row">
            <h3>{{ activeTool.name }}</h3>
            <span class="mode-badge">{{ activeTool.launchMode === 'website' ? '网站' : '沙箱应用' }}</span>
          </div>
          <p>{{ activeTool.description || '这个工具没有提供说明。' }}</p>
          <small>{{ activeTool.author }} · {{ activeTool.version || '未标版本' }} · {{ activeTool.downloads }} 次获取</small>
        </div>
      </header>

      <div class="frame-wrap">
        <iframe
          v-if="activeTool.launchMode === 'document' && sandboxDocument"
          :key="`document_${previewKey}`"
          class="tool-frame"
          :title="`${activeTool.name} KJ 沙箱预览`"
          :srcdoc="sandboxDocument"
          :sandbox="sandboxPermissions"
          referrerpolicy="no-referrer"
        ></iframe>
        <iframe
          v-else-if="activeTool.launchMode === 'website' && activeTool.url"
          :key="`website_${previewKey}`"
          class="tool-frame"
          :title="`${activeTool.name} KJ 网站预览`"
          :src="activeTool.url"
          :sandbox="sandboxPermissions"
          referrerpolicy="no-referrer"
        ></iframe>
        <div v-else class="frame-empty">
          <i class="fas fa-triangle-exclamation" aria-hidden="true"></i>
          <p>没有可安全运行的工具内容。</p>
        </div>
      </div>

      <p v-if="activeTool.launchMode === 'website'" class="embed-hint">
        如果发布者禁止网页嵌入，请使用标题栏的“在新标签页打开”。
      </p>
    </section>

    <section v-else class="catalog-stage">
      <aside class="source-sidebar">
        <label class="search-field">
          <i class="fas fa-magnifying-glass" aria-hidden="true"></i>
          <input v-model.trim="searchQuery" type="search" placeholder="搜索名称、作者、说明" />
        </label>

        <nav class="category-list" aria-label="KJ 工具分类">
          <button
            class="category-btn ripple-trigger"
            :class="{ active: activeCategory === 'all' }"
            type="button"
            @click="activeCategory = 'all'"
          >
            <i class="fas fa-border-all" aria-hidden="true"></i>
            <span>全部工具</span>
            <small>{{ catalog.tools.length }}</small>
          </button>
          <button
            v-for="category in visibleCategories"
            :key="category.id"
            class="category-btn ripple-trigger"
            :class="{ active: activeCategory === category.id }"
            type="button"
            @click="activeCategory = category.id"
          >
            <i :class="`fas ${category.icon}`" aria-hidden="true"></i>
            <span>{{ category.name }}</span>
            <small>{{ category.count }}</small>
          </button>
        </nav>

        <div class="source-foot">
          <span>{{ catalog.sourceName }}</span>
          <small>只读目录 · 不连接 KJ 账号</small>
        </div>
      </aside>

      <main class="catalog-content">
        <div v-if="loading" class="catalog-state">
          <i class="fas fa-spinner fa-spin" aria-hidden="true"></i>
          <h3>正在获取 KJ 工具</h3>
          <p>通过站点后端读取公开应用社区目录…</p>
        </div>

        <div v-else-if="!catalog.enabled" class="catalog-state">
          <i class="fas fa-toggle-off" aria-hidden="true"></i>
          <h3>KJ 工具源未启用</h3>
          <p>管理员可以通过 <code>TOOLS_KJ_SOURCE_ENABLED</code> 开启它。</p>
        </div>

        <div v-else-if="!filteredTools.length" class="catalog-state">
          <i class="fas fa-box-open" aria-hidden="true"></i>
          <h3>没有匹配的工具</h3>
          <p>换个关键词或分类试试。</p>
        </div>

        <div v-else class="tool-grid">
          <article v-for="tool in filteredTools" :key="tool.id" class="tool-card" :class="{ incompatible: !tool.compatible }">
            <header class="card-head">
              <div class="tool-icon" :style="iconStyle(tool)">
                <i :class="tool.icon" aria-hidden="true"></i>
              </div>
              <div class="card-title">
                <div class="title-row">
                  <h3>{{ tool.name }}</h3>
                  <span v-if="tool.compatible" class="compat-badge">可运行</span>
                  <span v-else class="compat-badge unsupported">不兼容</span>
                </div>
                <small>{{ categoryName(tool.category) }} · {{ tool.type || 'unknown' }}</small>
              </div>
            </header>
            <p class="tool-description">{{ tool.description || '这个工具没有提供说明。' }}</p>
            <div class="tool-meta">
              <span><i class="fas fa-user-pen" aria-hidden="true"></i>{{ tool.author }}</span>
              <span><i class="fas fa-download" aria-hidden="true"></i>{{ tool.downloads }}</span>
              <span v-if="tool.version">v{{ tool.version }}</span>
            </div>
            <p v-if="!tool.compatible" class="incompatible-reason">{{ tool.incompatibleReason }}</p>
            <button
              class="acquire-btn ripple-trigger"
              type="button"
              :disabled="!tool.compatible || detailBusyId !== ''"
              @click="acquireTool(tool)"
            >
              <i :class="detailBusyId === tool.id ? 'fas fa-spinner fa-spin' : 'fas fa-cloud-arrow-down'" aria-hidden="true"></i>
              {{ detailBusyId === tool.id ? '获取中…' : tool.compatible ? '获取并打开' : '暂不支持' }}
            </button>
          </article>
        </div>
      </main>
    </section>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import LightAppTopToolbar from '../LightAppTopToolbar.vue';
import {
  buildKjToolSandboxDocument,
  describeKjToolSourceError,
  fetchKjToolCatalog,
  fetchKjToolDetail,
  safeKjToolUrl
} from './kjToolSourceApi';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const sandboxPermissions = 'allow-scripts allow-forms allow-modals allow-downloads allow-popups';
const catalog = ref({
  enabled: true,
  sourceName: 'KJ 应用社区',
  sourceHomeUrl: 'https://kj.sgguo.com/',
  categories: [],
  tools: []
});
const loading = ref(false);
const errorText = ref('');
const searchQuery = ref('');
const activeCategory = ref('all');
const activeTool = ref(null);
const detailBusyId = ref('');
const previewKey = ref(0);
let catalogController = null;
let detailController = null;

const categoryLookup = computed(() => new Map(catalog.value.categories.map((item) => [item.id, item.name])));

const visibleCategories = computed(() => catalog.value.categories
  .map((category) => ({
    ...category,
    count: catalog.value.tools.filter((tool) => tool.category === category.id).length
  }))
  .filter((category) => category.count > 0));

const filteredTools = computed(() => {
  const query = searchQuery.value.toLowerCase();
  return catalog.value.tools.filter((tool) => {
    if (activeCategory.value !== 'all' && tool.category !== activeCategory.value) return false;
    if (!query) return true;
    return [tool.name, tool.description, tool.author, tool.type, categoryName(tool.category)]
      .join(' ')
      .toLowerCase()
      .includes(query);
  });
});

const sandboxDocument = computed(() => activeTool.value?.launchMode === 'document'
  ? buildKjToolSandboxDocument(activeTool.value)
  : '');

function categoryName(categoryId) {
  return categoryLookup.value.get(categoryId) || categoryId || '未分类';
}

function iconStyle(tool) {
  const color = String(tool?.color || '#187aff').trim() || '#187aff';
  return {
    color,
    background: `color-mix(in srgb, ${color} 16%, transparent)`,
    borderColor: `color-mix(in srgb, ${color} 34%, transparent)`
  };
}

async function loadCatalog(refresh = false) {
  if (catalogController) catalogController.abort();
  const controller = new AbortController();
  catalogController = controller;
  loading.value = true;
  errorText.value = '';
  try {
    const nextCatalog = await fetchKjToolCatalog({ refresh, signal: controller.signal });
    if (catalogController !== controller) return;
    catalog.value = nextCatalog;
    if (activeCategory.value !== 'all' && !nextCatalog.categories.some((item) => item.id === activeCategory.value)) {
      activeCategory.value = 'all';
    }
  } catch (error) {
    if (catalogController !== controller || controller.signal.aborted) return;
    errorText.value = describeKjToolSourceError(error);
  } finally {
    if (catalogController === controller) {
      catalogController = null;
      loading.value = false;
    }
  }
}

async function acquireTool(tool) {
  if (!tool?.compatible || detailBusyId.value) return;
  if (detailController) detailController.abort();
  const controller = new AbortController();
  detailController = controller;
  detailBusyId.value = tool.id;
  errorText.value = '';
  try {
    const detail = await fetchKjToolDetail(tool.id, { signal: controller.signal });
    if (detailController !== controller) return;
    if (!detail.compatible) {
      throw new Error(detail.incompatibleReason || '该工具无法在 Shizuki 中运行');
    }
    activeTool.value = detail;
    previewKey.value += 1;
  } catch (error) {
    if (detailController !== controller || controller.signal.aborted) return;
    errorText.value = describeKjToolSourceError(error);
  } finally {
    if (detailController === controller) {
      detailController = null;
      detailBusyId.value = '';
    }
  }
}

function closePreview() {
  activeTool.value = null;
  errorText.value = '';
}

function openExternal(value) {
  const url = safeKjToolUrl(value);
  if (!url || typeof window === 'undefined') return;
  window.open(url, '_blank', 'noopener,noreferrer');
}

onMounted(() => {
  loadCatalog(false);
});

onBeforeUnmount(() => {
  if (catalogController) catalogController.abort();
  if (detailController) detailController.abort();
});
</script>

<style scoped>
.kj-source-window {
  height: 100%;
  min-height: 0;
  display: flex;
  flex-direction: column;
  overflow: hidden;
  color: var(--theme-text, #f6f8ff);
}

.toolbar-switches,
.toolbar-actions,
.title-row,
.tool-meta {
  display: flex;
  align-items: center;
}

.toolbar-switches,
.toolbar-actions {
  gap: 8px;
}

.toolbar-hint {
  color: var(--theme-muted, rgba(242, 246, 255, 0.72));
  font-size: 12px;
}

.trust-banner {
  flex: 0 0 auto;
  display: flex;
  align-items: center;
  gap: 9px;
  margin: 10px 12px 0;
  padding: 9px 11px;
  border: 1px solid rgba(99, 184, 255, 0.25);
  border-radius: 12px;
  background: rgba(34, 93, 145, 0.16);
  color: var(--theme-muted, rgba(242, 246, 255, 0.76));
  font-size: 11px;
  line-height: 1.45;
}

.trust-banner i {
  color: #68c7ff;
}

.source-message {
  flex: 0 0 auto;
  display: flex;
  justify-content: space-between;
  align-items: center;
  gap: 12px;
  margin: 8px 12px 0;
  padding: 8px 10px;
  border-radius: 10px;
  font-size: 12px;
}

.error-message {
  color: #ffd8df;
  background: rgba(172, 43, 72, 0.2);
  border: 1px solid rgba(255, 105, 135, 0.25);
}

.text-action {
  border: 0;
  background: transparent;
  color: inherit;
  text-decoration: underline;
  cursor: pointer;
}

.catalog-stage {
  flex: 1 1 auto;
  min-height: 0;
  display: grid;
  grid-template-columns: minmax(184px, 23%) 1fr;
  gap: 10px;
  padding: 10px 12px 12px;
}

.source-sidebar,
.catalog-content,
.preview-stage {
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.13));
  border-radius: 16px;
  background: rgba(12, 18, 31, 0.24);
  backdrop-filter: blur(12px);
}

.source-sidebar {
  min-height: 0;
  display: flex;
  flex-direction: column;
  padding: 10px;
  overflow: hidden;
}

.search-field {
  display: flex;
  align-items: center;
  gap: 8px;
  padding: 0 10px;
  min-height: 36px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.14));
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.06);
}

.search-field i {
  color: var(--theme-muted, rgba(242, 246, 255, 0.56));
}

.search-field input {
  min-width: 0;
  width: 100%;
  border: 0;
  outline: 0;
  background: transparent;
  color: inherit;
  font-size: 12px;
}

.category-list {
  min-height: 0;
  margin-top: 10px;
  display: flex;
  flex-direction: column;
  gap: 4px;
  overflow: auto;
}

.category-btn {
  min-height: 36px;
  display: grid;
  grid-template-columns: 18px 1fr auto;
  align-items: center;
  gap: 8px;
  padding: 7px 9px;
  border: 1px solid transparent;
  border-radius: 10px;
  background: transparent;
  color: var(--theme-muted, rgba(242, 246, 255, 0.72));
  text-align: left;
  cursor: pointer;
}

.category-btn.active {
  color: rgb(var(--accent-strong-rgb, 126, 203, 255));
  border-color: rgba(var(--accent-rgb, 99, 184, 255), 0.34);
  background: rgba(var(--accent-rgb, 99, 184, 255), 0.13);
}

.category-btn small {
  color: inherit;
  opacity: 0.68;
}

.source-foot {
  margin-top: auto;
  padding: 10px 6px 2px;
  display: flex;
  flex-direction: column;
  gap: 2px;
  color: var(--theme-muted, rgba(242, 246, 255, 0.58));
  font-size: 11px;
}

.catalog-content {
  min-width: 0;
  min-height: 0;
  padding: 10px;
  overflow: auto;
}

.catalog-state,
.frame-empty {
  min-height: 100%;
  display: grid;
  place-items: center;
  align-content: center;
  gap: 8px;
  text-align: center;
  color: var(--theme-muted, rgba(242, 246, 255, 0.66));
}

.catalog-state i,
.frame-empty i {
  font-size: 28px;
  color: #69c4ff;
}

.catalog-state h3,
.catalog-state p,
.frame-empty p {
  margin: 0;
}

.catalog-state p {
  font-size: 12px;
}

.catalog-state code {
  font-size: 11px;
}

.tool-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(230px, 1fr));
  gap: 10px;
}

.tool-card {
  min-width: 0;
  display: flex;
  flex-direction: column;
  gap: 10px;
  padding: 12px;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.12));
  border-radius: 14px;
  background: rgba(255, 255, 255, 0.055);
  transition: transform 160ms ease, border-color 160ms ease, background 160ms ease;
}

.tool-card:hover {
  transform: translateY(-1px);
  border-color: rgba(var(--accent-rgb, 99, 184, 255), 0.3);
  background: rgba(255, 255, 255, 0.075);
}

.tool-card.incompatible {
  opacity: 0.7;
}

.card-head {
  display: grid;
  grid-template-columns: 38px 1fr;
  align-items: center;
  gap: 10px;
}

.tool-icon {
  width: 38px;
  height: 38px;
  display: grid;
  place-items: center;
  border: 1px solid;
  border-radius: 11px;
  font-size: 16px;
}

.card-title,
.preview-copy {
  min-width: 0;
}

.title-row {
  min-width: 0;
  gap: 7px;
}

.title-row h3 {
  min-width: 0;
  margin: 0;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  font-size: 14px;
}

.card-title small,
.preview-copy small {
  display: block;
  margin-top: 3px;
  color: var(--theme-muted, rgba(242, 246, 255, 0.56));
  font-size: 10px;
}

.compat-badge,
.mode-badge {
  flex: 0 0 auto;
  padding: 2px 6px;
  border-radius: 999px;
  background: rgba(52, 205, 142, 0.14);
  color: #7ee2b4;
  font-size: 9px;
}

.compat-badge.unsupported {
  background: rgba(255, 166, 77, 0.13);
  color: #ffc17c;
}

.tool-description {
  min-height: 3.9em;
  margin: 0;
  display: -webkit-box;
  overflow: hidden;
  -webkit-line-clamp: 3;
  -webkit-box-orient: vertical;
  color: var(--theme-muted, rgba(242, 246, 255, 0.72));
  font-size: 11px;
  line-height: 1.45;
}

.tool-meta {
  flex-wrap: wrap;
  gap: 7px 10px;
  color: var(--theme-muted, rgba(242, 246, 255, 0.52));
  font-size: 10px;
}

.tool-meta span {
  display: inline-flex;
  align-items: center;
  gap: 4px;
}

.incompatible-reason {
  margin: 0;
  color: #ffc17c;
  font-size: 10px;
}

.acquire-btn {
  min-height: 34px;
  margin-top: auto;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 7px;
  border: 1px solid rgba(var(--accent-rgb, 99, 184, 255), 0.34);
  border-radius: 10px;
  background: rgba(var(--accent-rgb, 99, 184, 255), 0.14);
  color: rgb(var(--accent-strong-rgb, 126, 203, 255));
  cursor: pointer;
  font-size: 11px;
}

.acquire-btn:disabled {
  cursor: not-allowed;
  opacity: 0.55;
}

.preview-stage {
  flex: 1 1 auto;
  min-height: 0;
  margin: 10px 12px 12px;
  display: flex;
  flex-direction: column;
  overflow: hidden;
}

.preview-head {
  flex: 0 0 auto;
  display: grid;
  grid-template-columns: 38px 1fr;
  align-items: center;
  gap: 10px;
  padding: 10px 12px;
  border-bottom: 1px solid var(--theme-border, rgba(255, 255, 255, 0.12));
}

.preview-copy p {
  margin: 4px 0 0;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  color: var(--theme-muted, rgba(242, 246, 255, 0.7));
  font-size: 11px;
}

.frame-wrap {
  flex: 1 1 auto;
  min-height: 0;
  padding: 8px;
  background: rgba(3, 6, 13, 0.28);
}

.tool-frame {
  width: 100%;
  height: 100%;
  display: block;
  border: 0;
  border-radius: 10px;
  background: #fff;
}

.embed-hint {
  flex: 0 0 auto;
  margin: 0;
  padding: 7px 12px;
  border-top: 1px solid var(--theme-border, rgba(255, 255, 255, 0.1));
  color: var(--theme-muted, rgba(242, 246, 255, 0.56));
  font-size: 10px;
}

@media (max-width: 720px) {
  .catalog-stage {
    grid-template-columns: 1fr;
    overflow: auto;
  }

  .source-sidebar {
    max-height: 210px;
  }

  .catalog-content {
    min-height: 320px;
    overflow: visible;
  }
}

:root[data-theme-mode='day'] .source-sidebar,
:root[data-theme-mode='day'] .catalog-content,
:root[data-theme-mode='day'] .preview-stage {
  background: rgba(255, 255, 255, 0.58);
}

:root[data-theme-mode='day'] .trust-banner {
  background: rgba(224, 242, 255, 0.68);
  color: rgba(25, 46, 67, 0.76);
}
</style>
