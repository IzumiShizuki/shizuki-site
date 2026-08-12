<template>
  <section class="wallpaper-discovery" :class="`source-${source}`">
    <header class="wallpaper-window-bar">
      <div class="wallpaper-brand" aria-label="Wallpaper Workshop Browser">
        <span class="wallpaper-brand-mark">W</span>
        <span class="wallpaper-brand-copy">
          <strong>WALLPAPER</strong>
          <small>WORKSHOP BROWSER</small>
        </span>
      </div>
      <div class="wallpaper-window-status">
        <span class="status-light"></span>
        <span>ONLINE DISCOVERY</span>
        <span v-if="searched" class="status-divider">/</span>
        <span v-if="searched">{{ items.length }} RESULTS</span>
      </div>
      <button
        type="button"
        class="window-refresh"
        :disabled="loading"
        aria-label="刷新搜索结果"
        @click="runSearch(page)"
      >
        <span class="icon-refresh" :class="{ spinning: loading }">↻</span>
        <span>刷新</span>
      </button>
    </header>

    <div class="wallpaper-window-body">
      <aside class="workshop-rail" aria-label="壁纸来源">
        <p class="rail-label">LIBRARY</p>
        <button
          v-for="option in sourceOptions"
          :key="option.key"
          type="button"
          class="source-nav"
          :class="{ active: source === option.key }"
          :aria-pressed="source === option.key"
          @click="switchSource(option.key)"
        >
          <span class="source-nav-icon" :class="`source-nav-icon-${option.key}`" aria-hidden="true"></span>
          <span class="source-nav-label">{{ option.label }}</span>
        </button>

        <div class="rail-rule"></div>
        <p class="rail-label">QUICK SEARCH</p>
        <button type="button" class="quick-search" @click="applyQuickSearch('anime')">
          <span class="quick-search-dot warm"></span>
          <span>Anime scenes</span>
        </button>
        <button type="button" class="quick-search" @click="applyQuickSearch('rain')">
          <span class="quick-search-dot blue"></span>
          <span>Rainy nights</span>
        </button>
        <button type="button" class="quick-search" @click="applyQuickSearch('landscape')">
          <span class="quick-search-dot green"></span>
          <span>Open landscapes</span>
        </button>

        <div class="rail-footnote">
          <span class="rail-footnote-line"><span class="status-light"></span> PROXY ONLINE</span>
          <p>Search and preview traffic is routed through the site server.</p>
        </div>
      </aside>

      <main class="workshop-main">
        <div class="workshop-heading">
          <div>
            <p class="workshop-kicker">DISCOVERY / {{ sourceLabel }}</p>
            <h4>{{ source === 'workshop' ? 'Find your next scene' : 'Curated stills for your desktop' }}</h4>
          </div>
          <div class="source-breadcrumb">{{ source === 'workshop' ? 'STEAM WORKSHOP' : 'WALLHAVEN' }}</div>
        </div>

        <div class="discovery-toolbar">
          <label class="discovery-search-field">
            <span class="search-glyph" aria-hidden="true">⌕</span>
            <input
              v-model.trim="query"
              type="search"
              :placeholder="source === 'workshop' ? 'Search Workshop, e.g. city rain' : 'Search Wallhaven, e.g. sakura'"
              aria-label="搜索壁纸"
              @keydown.enter.prevent="runSearch(1)"
            />
            <kbd>ENTER</kbd>
          </label>
          <select
            v-if="source === 'workshop'"
            v-model="workshopSort"
            class="discovery-filter-control"
            aria-label="Workshop 排序"
            @change="runSearch(1)"
          >
            <option value="trend">本周热门</option>
            <option value="mostrecent">最新发布</option>
            <option value="toprated">最高评价</option>
            <option value="subscribers">订阅最多</option>
          </select>
          <template v-else>
            <select
              v-model="wallhavenSorting"
              class="discovery-filter-control"
              aria-label="Wallhaven 排序"
              @change="runSearch(1)"
            >
              <option value="toplist">精选榜单</option>
              <option value="date_added">最新上传</option>
              <option value="relevance">相关度</option>
              <option value="views">浏览最多</option>
              <option value="favorites">收藏最多</option>
              <option value="random">随机</option>
            </select>
            <select
              v-model="wallhavenAtleast"
              class="discovery-filter-control"
              aria-label="最低分辨率"
              @change="runSearch(1)"
            >
              <option value="">分辨率不限</option>
              <option value="1920x1080">≥1080P</option>
              <option value="2560x1440">≥2K</option>
              <option value="3840x2160">≥4K</option>
            </select>
          </template>
          <button
            type="button"
            class="discovery-search-button"
            :disabled="loading"
            @click="runSearch(1)"
          >
            {{ loading ? '搜索中…' : '搜索' }}
          </button>
        </div>

        <div v-if="source === 'wallhaven'" class="discovery-filter-row">
          <span class="filter-row-label">分类</span>
          <label class="filter-chip"><input v-model="wallhavenGeneral" type="checkbox" @change="runSearch(1)" /> 综合</label>
          <label class="filter-chip"><input v-model="wallhavenAnime" type="checkbox" @change="runSearch(1)" /> 动漫</label>
          <label class="filter-chip"><input v-model="wallhavenPeople" type="checkbox" @change="runSearch(1)" /> 人物</label>
          <span class="filter-row-note">SFW search</span>
        </div>

        <div class="results-toolbar">
          <div class="results-heading">
            <span class="results-count">{{ searched ? `${items.length} RESULTS` : 'READY TO SEARCH' }}</span>
            <span class="results-source-tag">{{ sourceLabel }}</span>
          </div>
          <button
            v-if="query || (source === 'wallhaven' && (wallhavenAtleast || wallhavenSorting !== 'toplist'))"
            type="button"
            class="reset-search"
            @click="resetFilters"
          >
            清除筛选
          </button>
        </div>

        <div v-if="loading && !items.length" class="discovery-skeleton-grid" aria-label="正在加载壁纸列表">
          <span v-for="index in 8" :key="`skeleton-${index}`" class="discovery-skeleton-card">
            <span class="skeleton-block"></span>
            <span class="skeleton-line short"></span>
            <span class="skeleton-line"></span>
          </span>
        </div>
        <p v-else-if="errorHint" class="discovery-placeholder discovery-error">
          <span class="placeholder-mark">ERROR</span>
          {{ errorHint }}
          <button type="button" class="inline-retry" @click="runSearch(page)">重试</button>
        </p>
        <p v-else-if="!items.length && searched" class="discovery-placeholder discovery-empty-state">
          <span class="placeholder-mark">EMPTY</span>
          没有找到相关壁纸，换个关键词试试；也可以切换到另一个来源。
        </p>

        <div v-if="items.length" class="discovery-grid">
          <button
            v-for="item in items"
            :key="item.key"
            type="button"
            class="discovery-item ripple-trigger"
            :class="{ active: selected && selected.key === item.key }"
            @click="selectItem(item)"
          >
            <span class="discovery-thumb-wrap" :class="{ failed: previewState(item).failed }">
              <span v-if="previewState(item).loading && !previewState(item).failed" class="thumb-loading" aria-hidden="true"></span>
              <img
                v-if="previewSrc(item) && !previewState(item).failed"
                class="discovery-thumb"
                :src="previewSrc(item)"
                :alt="`${item.title || '未命名壁纸'} preview`"
                loading="lazy"
                decoding="async"
                referrerpolicy="no-referrer"
                @load="handlePreviewLoad(item)"
                @error="handlePreviewError(item, $event)"
              />
              <span v-else class="discovery-thumb-empty">
                <span class="empty-preview-icon">◌</span>
                <strong>无预览</strong>
                <span
                  role="button"
                  tabindex="0"
                  class="preview-retry"
                  @click.stop="retryPreview(item)"
                  @keydown.enter.stop="retryPreview(item)"
                >
                  重试
                </span>
              </span>
              <span class="thumb-source-badge">{{ source === 'workshop' ? 'WORKSHOP' : 'WALLHAVEN' }}</span>
            </span>
            <span class="discovery-item-title-row">
              <span class="discovery-item-name">{{ item.title || '未命名壁纸' }}</span>
              <span v-if="selected && selected.key === item.key" class="selected-mark">✓</span>
            </span>
            <span class="discovery-item-meta">{{ item.meta }}</span>
          </button>
        </div>

        <div v-if="items.length || page > 1" class="discovery-pager">
          <button type="button" class="pager-button" :disabled="loading || page <= 1" @click="runSearch(page - 1)">
            ← 上一页
          </button>
          <span class="discovery-page-indicator">
            {{ page }}<template v-if="source === 'wallhaven' && lastPage > 0"> / {{ lastPage }}</template>
          </span>
          <button type="button" class="pager-button" :disabled="loading || !canGoNext" @click="runSearch(page + 1)">
            下一页 →
          </button>
        </div>
      </main>

      <aside class="discovery-inspector" :class="{ empty: !selected }">
        <template v-if="selected">
          <div class="inspector-heading">
            <div>
              <p class="inspector-kicker">SELECTED ITEM</p>
              <h5>{{ source === 'workshop' ? 'Workshop detail' : 'Wallhaven detail' }}</h5>
            </div>
            <button type="button" class="inspector-clear" aria-label="清除选择" @click="selected = null">×</button>
          </div>

          <div class="inspector-preview" :class="{ failed: previewState(selected).failed }">
            <span v-if="previewState(selected).loading && !previewState(selected).failed" class="inspector-preview-loading">LOADING PREVIEW</span>
            <img
              v-if="previewSrc(selected) && !previewState(selected).failed"
              :src="previewSrc(selected)"
              :alt="`${selected.title || '未命名壁纸'} large preview`"
              decoding="async"
              referrerpolicy="no-referrer"
              @load="handlePreviewLoad(selected)"
              @error="handlePreviewError(selected, $event)"
            />
            <span v-else class="inspector-preview-empty">
              <span class="empty-preview-icon">◌</span>
              <strong>Preview unavailable</strong>
              <button type="button" class="inspector-retry" @click="retryPreview(selected)">重试预览</button>
            </span>
          </div>

          <div class="inspector-copy">
            <div class="inspector-title-row">
              <h5>{{ selected.title || '未命名壁纸' }}</h5>
              <span class="inspector-source-pill">{{ source === 'workshop' ? 'STEAM' : 'WH' }}</span>
            </div>
            <p class="inspector-meta">{{ selected.meta }}</p>
            <a
              v-if="selected.detailUrl"
              class="discovery-detail-link"
              :href="selected.detailUrl"
              target="_blank"
              rel="noopener noreferrer"
            >
              在浏览器打开详情页 ↗
            </a>
          </div>

          <div v-if="source === 'workshop'" class="workshop-channel-status">
            <span class="channel-status-dot" :class="{ ready: workshopDetail.hasDirectDownload, checking: workshopDetail.loading }"></span>
            <span v-if="workshopDetail.loading">正在检查下载通道…</span>
            <span v-else-if="workshopDetail.error">{{ workshopDetail.error }}</span>
            <span v-else-if="workshopDetail.hasDirectDownload">✅ 该条目有公开直链，可直接拉取</span>
            <span v-else>⚠️ 无公开直链，需服务器已配置 SteamCMD 才能拉取</span>
          </div>

          <div class="inspector-import-box">
            <label class="inspector-label">导入为</label>
            <input v-model.trim="importTitle" class="inspector-input" type="text" placeholder="壁纸标题（可选）" />
            <select v-model="importVisibility" class="inspector-input">
              <option value="PRIVATE">私有壁纸</option>
              <option value="PUBLIC">公开壁纸</option>
            </select>
            <button type="button" class="inspector-import-button" :disabled="busy || !isAuthenticated" @click="importSelected">
              {{ busy ? '导入中…' : !isAuthenticated ? '登录后导入' : source === 'workshop' ? '导入选中壁纸' : '拉取选中壁纸' }}
            </button>
          </div>
        </template>
        <div v-else class="inspector-empty-state">
          <span class="inspector-empty-mark">+</span>
          <p class="inspector-kicker">NO SELECTION</p>
          <h5>选择一张壁纸</h5>
          <p>点击左侧结果卡片，在这里查看大图、来源信息和导入选项。</p>
        </div>
      </aside>
    </div>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref } from 'vue';
import {
  getWallpaperDiscoveryPreviewUrl,
  getWorkshopItemDetail,
  searchWallhavenWallpapers,
  searchWorkshopWallpapers
} from '../../services/wallpaperApi';

const props = defineProps({
  authorizedFetch: { type: Function, default: null },
  isAuthenticated: { type: Boolean, default: false },
  busy: { type: Boolean, default: false }
});

const emit = defineEmits(['import-workshop', 'import-wallhaven', 'select-workshop']);

const sourceOptions = [
  { key: 'workshop', label: '创意工坊', mark: 'S' },
  { key: 'wallhaven', label: 'Wallhaven', mark: 'W' }
];
const source = ref('workshop');
const query = ref('');
const workshopSort = ref('trend');
const wallhavenSorting = ref('toplist');
const wallhavenAtleast = ref('');
const wallhavenGeneral = ref(true);
const wallhavenAnime = ref(true);
const wallhavenPeople = ref(false);

const items = ref([]);
const page = ref(1);
const lastPage = ref(0);
const hasMore = ref(false);
const loading = ref(false);
const searched = ref(false);
const errorHint = ref('');
const selected = ref(null);
const importTitle = ref('');
const importVisibility = ref('PRIVATE');
const previewStates = reactive({});
const workshopDetail = reactive({
  loading: false,
  hasDirectDownload: false,
  error: ''
});

let searchSeq = 0;

const sourceLabel = computed(() => sourceOptions.find((option) => option.key === source.value)?.label || 'Workshop');
const canGoNext = computed(() => {
  if (source.value === 'wallhaven') {
    return lastPage.value > 0 ? page.value < lastPage.value : hasMore.value;
  }
  return hasMore.value;
});

function readField(raw, camelKey, snakeKey, defaultValue = '') {
  if (!raw || typeof raw !== 'object') return defaultValue;
  if (raw[camelKey] !== undefined && raw[camelKey] !== null) return raw[camelKey];
  if (raw[snakeKey] !== undefined && raw[snakeKey] !== null) return raw[snakeKey];
  return defaultValue;
}

function formatFileSize(bytes) {
  const size = Number(bytes || 0);
  if (!Number.isFinite(size) || size <= 0) return '';
  if (size >= 1024 * 1024) return `${(size / (1024 * 1024)).toFixed(1)}MB`;
  if (size >= 1024) return `${Math.round(size / 1024)}KB`;
  return `${size}B`;
}

function normalizeWorkshopItem(raw) {
  const itemId = String(readField(raw, 'itemId', 'item_id', '')).trim();
  if (!itemId) return null;
  const title = String(readField(raw, 'title', 'title', '')).trim();
  const thumb = String(readField(raw, 'previewUrl', 'preview_url', '')).trim();
  return {
    key: `workshop-${itemId}`,
    itemId,
    title,
    thumb,
    fullUrl: '',
    detailUrl: String(readField(raw, 'detailUrl', 'detail_url', '')).trim(),
    meta: `Workshop #${itemId}`
  };
}

function normalizeWallhavenItem(raw) {
  const id = String(readField(raw, 'id', 'id', '')).trim();
  if (!id) return null;
  const resolution = String(readField(raw, 'resolution', 'resolution', '')).trim();
  const ratio = String(readField(raw, 'ratio', 'ratio', '')).trim();
  const sizeText = formatFileSize(readField(raw, 'fileSizeBytes', 'file_size_bytes', 0));
  const thumb = String(readField(raw, 'thumbUrl', 'thumb_url', '')).trim();
  const fullUrl = String(
    readField(raw, 'fullUrl', 'full_url', readField(raw, 'path', 'path', ''))
  ).trim();
  return {
    key: `wallhaven-${id}`,
    wallhavenId: id,
    title: `Wallhaven ${id}`,
    thumb,
    fullUrl,
    detailUrl: String(readField(raw, 'detailUrl', 'detail_url', '')).trim(),
    resolution,
    ratio,
    meta: [resolution, ratio, sizeText].filter(Boolean).join(' · ') || 'Wallhaven'
  };
}

function clearPreviewStates() {
  Object.keys(previewStates).forEach((key) => delete previewStates[key]);
}

function ensurePreviewState(item) {
  if (!item) return { candidateIndex: 0, loaded: false, loading: false, failed: true };
  if (!previewStates[item.key]) {
    previewStates[item.key] = {
      candidateIndex: 0,
      loaded: false,
      loading: true,
      failed: false
    };
  }
  return previewStates[item.key];
}

function previewCandidates(item) {
  if (!item) return [];
  const sourceId = source.value === 'workshop' ? item.itemId : item.wallhavenId;
  return [...new Set([
    getWallpaperDiscoveryPreviewUrl(source.value, sourceId),
    item.thumb,
    item.fullUrl
  ].filter(Boolean))];
}

function previewState(item) {
  return ensurePreviewState(item);
}

function previewSrc(item) {
  const candidates = previewCandidates(item);
  const state = ensurePreviewState(item);
  return candidates[state.candidateIndex] || '';
}

function handlePreviewLoad(item) {
  const state = ensurePreviewState(item);
  state.loading = false;
  state.loaded = true;
  state.failed = false;
  state.lastFailedSrc = '';
}

function handlePreviewError(item, event) {
  const state = ensurePreviewState(item);
  const candidates = previewCandidates(item);
  const failedSrc = event?.currentTarget?.getAttribute('src') || previewSrc(item);
  if (state.lastFailedSrc === failedSrc) return;
  state.lastFailedSrc = failedSrc;
  if (state.candidateIndex < candidates.length - 1) {
    state.candidateIndex += 1;
    state.loading = true;
    state.loaded = false;
    return;
  }
  state.loading = false;
  state.loaded = false;
  state.failed = true;
}

function retryPreview(item) {
  if (!item) return;
  previewStates[item.key] = {
    candidateIndex: 0,
    loaded: false,
    loading: true,
    failed: false,
    lastFailedSrc: ''
  };
}

function wallhavenCategories() {
  const bits = [wallhavenGeneral.value, wallhavenAnime.value, wallhavenPeople.value]
    .map((flag) => (flag ? '1' : '0'))
    .join('');
  return bits === '000' ? '111' : bits;
}

async function runSearch(targetPage = 1) {
  const seq = ++searchSeq;
  loading.value = true;
  errorHint.value = '';
  try {
    if (source.value === 'workshop') {
      const payload = await searchWorkshopWallpapers(
        { query: query.value, page: targetPage, sort: workshopSort.value },
        props.authorizedFetch
      );
      if (seq !== searchSeq) return;
      const rawItems = Array.isArray(readField(payload, 'items', 'items', []))
        ? readField(payload, 'items', 'items', [])
        : [];
      clearPreviewStates();
      items.value = rawItems.map(normalizeWorkshopItem).filter(Boolean);
      page.value = Number(readField(payload, 'page', 'page', targetPage)) || targetPage;
      hasMore.value = Boolean(readField(payload, 'hasMore', 'has_more', false));
      lastPage.value = 0;
    } else {
      const payload = await searchWallhavenWallpapers(
        {
          query: query.value,
          page: targetPage,
          categories: wallhavenCategories(),
          purity: '100',
          sorting: wallhavenSorting.value,
          atleast: wallhavenAtleast.value
        },
        props.authorizedFetch
      );
      if (seq !== searchSeq) return;
      const rawItems = Array.isArray(readField(payload, 'items', 'items', []))
        ? readField(payload, 'items', 'items', [])
        : [];
      clearPreviewStates();
      items.value = rawItems.map(normalizeWallhavenItem).filter(Boolean);
      page.value = Number(readField(payload, 'page', 'page', targetPage)) || targetPage;
      lastPage.value = Number(readField(payload, 'lastPage', 'last_page', 0)) || 0;
      hasMore.value = lastPage.value > 0 ? page.value < lastPage.value : items.value.length > 0;
    }
    selected.value = null;
    searched.value = true;
  } catch (error) {
    if (seq !== searchSeq) return;
    const detail = String(error?.detail || error?.message || '').trim();
    errorHint.value = detail ? `搜索失败：${detail}` : '搜索失败，请稍后重试或切换来源。';
  } finally {
    if (seq === searchSeq) loading.value = false;
  }
}

function switchSource(nextSource) {
  if (source.value === nextSource) return;
  source.value = nextSource;
  items.value = [];
  page.value = 1;
  lastPage.value = 0;
  hasMore.value = false;
  selected.value = null;
  errorHint.value = '';
  searched.value = false;
  clearPreviewStates();
  runSearch(1);
}

function applyQuickSearch(nextQuery) {
  query.value = nextQuery;
  runSearch(1);
}

function resetFilters() {
  query.value = '';
  if (source.value === 'workshop') {
    workshopSort.value = 'trend';
  } else {
    wallhavenSorting.value = 'toplist';
    wallhavenAtleast.value = '';
  }
  runSearch(1);
}

async function selectItem(item) {
  selected.value = item;
  importTitle.value = item.title || '';
  if (source.value !== 'workshop') return;

  emit('select-workshop', {
    itemId: item.itemId,
    url: item.detailUrl || `https://steamcommunity.com/sharedfiles/filedetails/?id=${item.itemId}`,
    title: item.title || ''
  });
  workshopDetail.loading = true;
  workshopDetail.error = '';
  workshopDetail.hasDirectDownload = false;
  try {
    const payload = await getWorkshopItemDetail(item.itemId, props.authorizedFetch);
    if (!selected.value || selected.value.key !== item.key) return;
    workshopDetail.hasDirectDownload = Boolean(readField(payload, 'hasDirectDownload', 'has_direct_download', false));
    const detailTitle = String(readField(payload, 'title', 'title', '')).trim();
    if (detailTitle && !importTitle.value) importTitle.value = detailTitle;
  } catch {
    if (!selected.value || selected.value.key !== item.key) return;
    workshopDetail.error = '下载通道检查失败，仍可尝试导入。';
  } finally {
    if (selected.value && selected.value.key === item.key) workshopDetail.loading = false;
  }
}

function importSelected() {
  const item = selected.value;
  if (!item || props.busy || !props.isAuthenticated) return;
  if (source.value === 'workshop') {
    emit('import-workshop', {
      itemId: item.itemId,
      url: item.detailUrl || `https://steamcommunity.com/sharedfiles/filedetails/?id=${item.itemId}`,
      title: importTitle.value || item.title || '',
      visibility: importVisibility.value
    });
    return;
  }
  emit('import-wallhaven', {
    wallhavenId: item.wallhavenId,
    title: importTitle.value || item.title || '',
    visibility: importVisibility.value
  });
}

onMounted(() => {
  runSearch(1);
});

defineExpose({ runSearch, switchSource });
</script>

<style scoped>
.wallpaper-discovery {
  --wallpaper-ink: #eef2f5;
  --wallpaper-ink-soft: #9ca8b5;
  --wallpaper-ink-faint: #647180;
  --wallpaper-canvas: #10151c;
  --wallpaper-panel: #171e27;
  --wallpaper-raised: #202a35;
  --wallpaper-line: rgba(220, 232, 242, 0.1);
  --wallpaper-line-strong: rgba(220, 232, 242, 0.17);
  --wallpaper-accent: #f06a3b;
  --wallpaper-accent-soft: rgba(240, 106, 59, 0.18);
  --wallpaper-success: #6fd3a1;
  --wallpaper-warning: #e7b35a;
  min-height: 580px;
  overflow: hidden;
  border: 1px solid var(--wallpaper-line-strong);
  border-radius: 12px;
  background: var(--wallpaper-canvas);
  color: var(--wallpaper-ink);
  box-shadow: 0 24px 70px rgba(5, 8, 12, 0.34), inset 0 1px 0 rgba(255, 255, 255, 0.03);
  font-family: var(--font-body, Inter, 'Segoe UI', sans-serif);
}

.wallpaper-window-bar {
  min-height: 56px;
  padding: 0 16px;
  display: flex;
  align-items: center;
  gap: 16px;
  border-bottom: 1px solid var(--wallpaper-line);
  background: linear-gradient(180deg, rgba(36, 47, 59, 0.92), rgba(23, 30, 39, 0.96));
}

.wallpaper-brand,
.wallpaper-window-status,
.window-refresh,
.source-nav,
.quick-search,
.results-heading,
.inspector-title-row,
.inspector-heading,
.rail-footnote-line {
  display: flex;
  align-items: center;
}

.wallpaper-brand {
  flex: 0 0 auto;
  gap: 9px;
}

.wallpaper-brand-mark {
  width: 27px;
  height: 27px;
  display: grid;
  place-items: center;
  border-radius: 5px;
  color: #fff7f2;
  background: var(--wallpaper-accent);
  font-size: 15px;
  font-weight: 900;
  letter-spacing: -0.06em;
  box-shadow: 0 6px 18px rgba(240, 106, 59, 0.24);
}

.wallpaper-brand-copy {
  display: grid;
  gap: 1px;
}

.wallpaper-brand-copy strong {
  font-family: var(--font-display, 'Segoe UI', sans-serif);
  font-size: 12px;
  letter-spacing: 0.18em;
}

.wallpaper-brand-copy small,
.wallpaper-window-status,
.rail-label,
.workshop-kicker,
.results-count,
.results-source-tag,
.inspector-kicker,
.inspector-label,
.source-breadcrumb,
.filter-row-note,
.thumb-source-badge,
.placeholder-mark,
.channel-status-dot,
.inspector-source-pill {
  font-family: var(--font-mono, 'SFMono-Regular', Consolas, monospace);
  letter-spacing: 0.11em;
  text-transform: uppercase;
}

.wallpaper-brand-copy small {
  color: var(--wallpaper-ink-faint);
  font-size: 8px;
  letter-spacing: 0.12em;
}

.wallpaper-window-status {
  margin-left: auto;
  gap: 8px;
  color: var(--wallpaper-ink-faint);
  font-size: 9px;
}

.status-light,
.quick-search-dot,
.channel-status-dot {
  width: 6px;
  height: 6px;
  flex: 0 0 auto;
  border-radius: 999px;
  background: var(--wallpaper-success);
  box-shadow: 0 0 0 3px rgba(111, 211, 161, 0.11), 0 0 10px rgba(111, 211, 161, 0.45);
}

.status-divider {
  color: #4f5d6b;
}

.window-refresh {
  gap: 7px;
  min-height: 30px;
  padding: 0 10px;
  border: 1px solid var(--wallpaper-line-strong);
  border-radius: 5px;
  background: rgba(255, 255, 255, 0.03);
  color: var(--wallpaper-ink-soft);
  cursor: pointer;
  font-size: 11px;
}

.window-refresh:hover:not(:disabled),
.pager-button:hover:not(:disabled) {
  border-color: rgba(240, 106, 59, 0.58);
  color: #fff4ef;
  background: rgba(240, 106, 59, 0.1);
}

.window-refresh:disabled,
.pager-button:disabled,
.discovery-search-button:disabled,
.inspector-import-button:disabled {
  cursor: not-allowed;
  opacity: 0.48;
}

.icon-refresh {
  display: inline-block;
  font-size: 17px;
  line-height: 1;
}

.icon-refresh.spinning {
  animation: wallpaper-spin 0.8s linear infinite;
}

.wallpaper-window-body {
  min-height: 524px;
  display: grid;
  grid-template-columns: 178px minmax(0, 1fr) 292px;
}

.workshop-rail {
  min-width: 0;
  padding: 20px 11px 14px;
  display: flex;
  flex-direction: column;
  gap: 5px;
  border-right: 1px solid var(--wallpaper-line);
  background: rgba(18, 24, 31, 0.92);
}

.rail-label {
  margin: 0 8px 7px;
  color: #566373;
  font-size: 9px;
  font-weight: 700;
}

.source-nav,
.quick-search {
  width: 100%;
  min-height: 38px;
  gap: 10px;
  padding: 0 10px;
  border: 1px solid transparent;
  border-radius: 5px;
  background: transparent;
  color: var(--wallpaper-ink-soft);
  cursor: pointer;
  text-align: left;
  transition: 160ms ease;
}

.source-nav:hover,
.quick-search:hover {
  color: var(--wallpaper-ink);
  background: rgba(255, 255, 255, 0.04);
}

.source-nav.active {
  border-color: rgba(240, 106, 59, 0.3);
  background: linear-gradient(90deg, rgba(240, 106, 59, 0.17), rgba(240, 106, 59, 0.04));
  color: #fff4ef;
  box-shadow: inset 2px 0 0 var(--wallpaper-accent);
}

.source-nav-icon {
  width: 23px;
  height: 23px;
  display: grid;
  place-items: center;
  border: 1px solid currentColor;
  border-radius: 4px;
  color: #718092;
  font-family: var(--font-mono, monospace);
  font-size: 10px;
  font-weight: 800;
}

.source-nav-icon-workshop::before { content: 'S'; }
.source-nav-icon-wallhaven::before { content: 'W'; }

.source-nav.active .source-nav-icon {
  border-color: var(--wallpaper-accent);
  color: var(--wallpaper-accent);
}

.source-nav-label {
  font-size: 12px;
  font-weight: 650;
}

.rail-rule {
  height: 1px;
  margin: 16px 7px 13px;
  background: var(--wallpaper-line);
}

.quick-search {
  min-height: 29px;
  gap: 8px;
  color: #7f8b98;
  font-size: 11px;
}

.quick-search-dot {
  width: 5px;
  height: 5px;
  box-shadow: none;
  background: #718092;
}

.quick-search-dot.warm { background: var(--wallpaper-accent); }
.quick-search-dot.blue { background: #6ca3d5; }
.quick-search-dot.green { background: var(--wallpaper-success); }

.rail-footnote {
  margin-top: auto;
  padding: 12px 8px 0;
  border-top: 1px solid var(--wallpaper-line);
}

.rail-footnote-line {
  gap: 7px;
  color: var(--wallpaper-success);
  font-family: var(--font-mono, monospace);
  font-size: 8px;
  letter-spacing: 0.08em;
}

.rail-footnote p {
  margin: 8px 0 0;
  color: #586575;
  font-size: 10px;
  line-height: 1.55;
}

.workshop-main {
  min-width: 0;
  padding: 20px 20px 16px;
  overflow: hidden;
  background: linear-gradient(135deg, rgba(27, 36, 47, 0.68), rgba(16, 21, 28, 0.96));
}

.workshop-heading,
.results-toolbar,
.inspector-heading,
.inspector-title-row {
  justify-content: space-between;
}

.workshop-heading {
  display: flex;
  align-items: flex-start;
  gap: 14px;
  margin-bottom: 15px;
}

.workshop-kicker,
.inspector-kicker {
  margin: 0 0 6px;
  color: var(--wallpaper-accent);
  font-size: 9px;
  font-weight: 700;
}

.workshop-heading h4,
.inspector-heading h5,
.inspector-copy h5,
.inspector-empty-state h5 {
  margin: 0;
  color: var(--wallpaper-ink);
  font-family: var(--font-display, 'Segoe UI', sans-serif);
  font-size: 20px;
  font-weight: 700;
  letter-spacing: -0.02em;
}

.source-breadcrumb {
  margin-top: 3px;
  color: #5b6877;
  font-size: 9px;
  white-space: nowrap;
}

.discovery-toolbar {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 142px auto;
  gap: 7px;
  padding: 7px;
  border: 1px solid var(--wallpaper-line-strong);
  border-radius: 7px;
  background: rgba(10, 14, 19, 0.48);
}

.source-wallhaven .discovery-toolbar {
  grid-template-columns: minmax(0, 1fr) 116px 116px auto;
}

.discovery-search-field,
.discovery-filter-control,
.inspector-input {
  min-width: 0;
  min-height: 34px;
  border: 1px solid var(--wallpaper-line);
  border-radius: 4px;
  background: rgba(255, 255, 255, 0.055);
  color: var(--wallpaper-ink);
  font: inherit;
  font-size: 11px;
}

.discovery-search-field {
  display: flex;
  align-items: center;
  gap: 8px;
  padding: 0 9px;
}

.discovery-search-field:focus-within,
.discovery-filter-control:focus,
.inspector-input:focus {
  border-color: rgba(240, 106, 59, 0.75);
  outline: 2px solid rgba(240, 106, 59, 0.12);
  outline-offset: 0;
}

.search-glyph {
  color: var(--wallpaper-accent);
  font-size: 20px;
  line-height: 1;
  transform: translateY(-1px);
}

.discovery-search-field input {
  width: 100%;
  min-width: 0;
  border: 0;
  outline: 0;
  background: transparent;
  color: var(--wallpaper-ink);
  font: inherit;
}

.discovery-search-field input::placeholder {
  color: #617081;
}

.discovery-search-field kbd {
  color: #536170;
  font-family: var(--font-mono, monospace);
  font-size: 8px;
  white-space: nowrap;
}

.discovery-filter-control {
  padding: 0 9px;
}

.discovery-filter-control option,
.inspector-input option {
  color: #17202a;
  background: #f4f6f8;
}

.discovery-search-button,
.inspector-import-button {
  min-height: 34px;
  padding: 0 15px;
  border: 1px solid var(--wallpaper-accent);
  border-radius: 4px;
  background: var(--wallpaper-accent);
  color: #fff8f5;
  cursor: pointer;
  font-size: 11px;
  font-weight: 750;
  box-shadow: 0 6px 16px rgba(240, 106, 59, 0.17);
}

.discovery-search-button:hover:not(:disabled),
.inspector-import-button:hover:not(:disabled) {
  background: #ff7c4c;
}

.discovery-filter-row {
  min-height: 30px;
  display: flex;
  align-items: center;
  flex-wrap: wrap;
  gap: 7px;
  margin-top: 7px;
}

.filter-row-label {
  color: #637183;
  font-size: 10px;
}

.filter-chip {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  min-height: 25px;
  padding: 0 8px;
  border: 1px solid var(--wallpaper-line);
  border-radius: 4px;
  background: rgba(255, 255, 255, 0.035);
  color: var(--wallpaper-ink-soft);
  cursor: pointer;
  font-size: 10px;
}

.filter-chip:has(input:checked) {
  border-color: rgba(240, 106, 59, 0.45);
  background: var(--wallpaper-accent-soft);
  color: #ffe7dd;
}

.filter-chip input {
  accent-color: var(--wallpaper-accent);
}

.filter-row-note {
  margin-left: auto;
  color: #536170;
  font-size: 8px;
}

.results-toolbar {
  display: flex;
  align-items: center;
  min-height: 44px;
  margin-top: 8px;
  border-bottom: 1px solid var(--wallpaper-line);
}

.results-heading {
  gap: 8px;
}

.results-count {
  color: #8491a0;
  font-size: 9px;
  font-weight: 700;
}

.results-source-tag {
  padding: 4px 6px;
  border: 1px solid rgba(240, 106, 59, 0.25);
  border-radius: 3px;
  color: var(--wallpaper-accent);
  font-size: 8px;
}

.reset-search,
.inline-retry,
.inspector-retry,
.preview-retry {
  border: 0;
  background: transparent;
  color: var(--wallpaper-accent);
  cursor: pointer;
  font: inherit;
  font-size: 10px;
}

.reset-search:hover,
.inline-retry:hover,
.inspector-retry:hover,
.preview-retry:hover {
  color: #ffb19a;
  text-decoration: underline;
}

.discovery-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
  max-height: 356px;
  margin-top: 14px;
  overflow: auto;
  padding: 1px 3px 5px 1px;
  scrollbar-color: #3a4653 transparent;
  scrollbar-width: thin;
}

.discovery-item {
  min-width: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid var(--wallpaper-line);
  border-radius: 6px;
  background: rgba(31, 41, 52, 0.68);
  color: inherit;
  cursor: pointer;
  text-align: left;
  transition: transform 150ms ease, border-color 150ms ease, box-shadow 150ms ease;
}

.discovery-item:hover {
  transform: translateY(-2px);
  border-color: rgba(240, 106, 59, 0.46);
  box-shadow: 0 9px 20px rgba(3, 6, 10, 0.23);
}

.discovery-item.active {
  border-color: var(--wallpaper-accent);
  box-shadow: 0 0 0 2px rgba(240, 106, 59, 0.16), inset 3px 0 0 var(--wallpaper-accent);
}

.discovery-item:focus-visible,
.source-nav:focus-visible,
.quick-search:focus-visible,
.window-refresh:focus-visible,
.pager-button:focus-visible,
.inspector-clear:focus-visible,
.discovery-search-button:focus-visible {
  outline: 2px solid var(--wallpaper-accent);
  outline-offset: 2px;
}

.discovery-thumb-wrap {
  position: relative;
  display: block;
  aspect-ratio: 16 / 9;
  overflow: hidden;
  background: linear-gradient(135deg, #2b3b4b, #17232d 42%, #242d3b);
}

.discovery-thumb-wrap::after,
.inspector-preview::after {
  position: absolute;
  inset: 0;
  pointer-events: none;
  content: '';
  background: linear-gradient(180deg, transparent 50%, rgba(4, 7, 10, 0.48));
}

.discovery-thumb {
  display: block;
  width: 100%;
  height: 100%;
  object-fit: cover;
  background: #1c2732;
  transition: transform 300ms ease, opacity 180ms ease;
}

.discovery-item:hover .discovery-thumb {
  transform: scale(1.035);
}

.thumb-loading {
  position: absolute;
  inset: 0;
  z-index: 1;
  background: linear-gradient(110deg, rgba(255, 255, 255, 0.02) 30%, rgba(255, 255, 255, 0.13) 48%, rgba(255, 255, 255, 0.02) 68%);
  background-size: 220% 100%;
  animation: wallpaper-shimmer 1.3s linear infinite;
}

.thumb-source-badge {
  position: absolute;
  z-index: 2;
  top: 7px;
  left: 7px;
  padding: 4px 5px;
  border-radius: 3px;
  background: rgba(7, 11, 15, 0.68);
  color: #d9e0e6;
  font-size: 7px;
}

.discovery-thumb-empty {
  position: absolute;
  inset: 0;
  z-index: 1;
  display: grid;
  place-items: center;
  align-content: center;
  gap: 3px;
  color: #94a1ae;
  font-size: 10px;
}

.empty-preview-icon {
  color: #63778b;
  font-size: 24px;
  line-height: 1;
}

.discovery-thumb-empty strong {
  font-size: 10px;
  font-weight: 650;
}

.preview-retry {
  padding: 2px 4px;
  font-size: 9px;
}

.discovery-item-title-row {
  display: flex;
  align-items: center;
  gap: 5px;
  padding: 8px 8px 0;
}

.discovery-item-name {
  min-width: 0;
  overflow: hidden;
  color: #e6ebef;
  font-size: 11px;
  font-weight: 650;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.selected-mark {
  margin-left: auto;
  color: var(--wallpaper-accent);
  font-size: 12px;
}

.discovery-item-meta {
  display: block;
  overflow: hidden;
  padding: 3px 8px 9px;
  color: #778594;
  font-family: var(--font-mono, monospace);
  font-size: 8px;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.discovery-skeleton-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
  margin-top: 14px;
}

.discovery-skeleton-card {
  display: grid;
  gap: 7px;
  padding: 7px;
  border: 1px solid var(--wallpaper-line);
  border-radius: 6px;
  background: rgba(31, 41, 52, 0.48);
}

.skeleton-block,
.skeleton-line {
  display: block;
  border-radius: 3px;
  background: linear-gradient(110deg, #1d2934 30%, #2c3a48 48%, #1d2934 68%);
  background-size: 220% 100%;
  animation: wallpaper-shimmer 1.3s linear infinite;
}

.skeleton-block {
  aspect-ratio: 16 / 9;
}

.skeleton-line {
  height: 8px;
}

.skeleton-line.short {
  width: 62%;
}

.discovery-placeholder {
  min-height: 150px;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-wrap: wrap;
  gap: 7px;
  margin: 14px 0 0;
  padding: 20px;
  border: 1px dashed var(--wallpaper-line-strong);
  border-radius: 6px;
  color: var(--wallpaper-ink-soft);
  font-size: 11px;
  text-align: center;
}

.discovery-error {
  border-color: rgba(231, 179, 90, 0.4);
  color: #e6c185;
}

.placeholder-mark {
  width: 100%;
  color: var(--wallpaper-accent);
  font-size: 9px;
  font-weight: 700;
}

.discovery-pager {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 12px;
  margin-top: 10px;
}

.pager-button {
  min-height: 28px;
  padding: 0 10px;
  border: 1px solid var(--wallpaper-line-strong);
  border-radius: 4px;
  background: rgba(255, 255, 255, 0.035);
  color: var(--wallpaper-ink-soft);
  cursor: pointer;
  font-size: 10px;
}

.discovery-page-indicator {
  min-width: 48px;
  color: #8c99a7;
  font-family: var(--font-mono, monospace);
  font-size: 10px;
  text-align: center;
}

.discovery-inspector {
  min-width: 0;
  padding: 20px 16px 16px;
  overflow: auto;
  border-left: 1px solid var(--wallpaper-line);
  background: linear-gradient(180deg, rgba(27, 35, 45, 0.98), rgba(17, 23, 30, 0.98));
}

.discovery-inspector.empty {
  display: grid;
  place-items: center;
}

.inspector-heading {
  display: flex;
  align-items: flex-start;
  gap: 10px;
}

.inspector-heading h5 {
  font-size: 15px;
}

.inspector-clear {
  width: 26px;
  height: 26px;
  border: 1px solid var(--wallpaper-line-strong);
  border-radius: 4px;
  background: transparent;
  color: #82909f;
  cursor: pointer;
  font-size: 19px;
  line-height: 1;
}

.inspector-clear:hover {
  border-color: var(--wallpaper-accent);
  color: #fff;
}

.inspector-preview {
  position: relative;
  aspect-ratio: 16 / 10;
  overflow: hidden;
  margin-top: 15px;
  border: 1px solid var(--wallpaper-line-strong);
  border-radius: 5px;
  background: linear-gradient(135deg, #2b3b4b, #17232d 42%, #242d3b);
}

.inspector-preview img {
  width: 100%;
  height: 100%;
  display: block;
  object-fit: cover;
}

.inspector-preview-loading,
.inspector-preview-empty {
  position: absolute;
  inset: 0;
  z-index: 1;
  display: grid;
  place-items: center;
  align-content: center;
  gap: 7px;
  color: #91a0ae;
  font-family: var(--font-mono, monospace);
  font-size: 9px;
  letter-spacing: 0.09em;
  text-align: center;
  text-transform: uppercase;
}

.inspector-preview-empty strong {
  font-family: var(--font-body, sans-serif);
  font-size: 11px;
  letter-spacing: 0;
  text-transform: none;
}

.inspector-retry {
  padding: 5px 7px;
  border: 1px solid rgba(240, 106, 59, 0.35);
  border-radius: 3px;
  background: rgba(240, 106, 59, 0.08);
}

.inspector-copy {
  padding: 14px 0 12px;
  border-bottom: 1px solid var(--wallpaper-line);
}

.inspector-title-row {
  display: flex;
  align-items: flex-start;
  gap: 8px;
}

.inspector-copy h5 {
  min-width: 0;
  overflow: hidden;
  font-size: 15px;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.inspector-source-pill {
  flex: 0 0 auto;
  padding: 4px 5px;
  border: 1px solid var(--wallpaper-line-strong);
  border-radius: 3px;
  color: #94a1af;
  font-size: 8px;
}

.inspector-meta {
  margin: 6px 0 11px;
  color: #82909e;
  font-family: var(--font-mono, monospace);
  font-size: 9px;
}

.discovery-detail-link {
  color: var(--wallpaper-accent);
  font-size: 10px;
  text-decoration: none;
}

.discovery-detail-link:hover {
  color: #ffb19a;
  text-decoration: underline;
}

.workshop-channel-status {
  display: flex;
  align-items: flex-start;
  gap: 8px;
  margin-top: 12px;
  padding: 9px;
  border: 1px solid var(--wallpaper-line);
  border-radius: 4px;
  color: #9ba8b5;
  font-size: 10px;
  line-height: 1.45;
}

.channel-status-dot {
  margin-top: 4px;
  background: var(--wallpaper-warning);
  box-shadow: none;
}

.channel-status-dot.ready {
  background: var(--wallpaper-success);
}

.channel-status-dot.checking {
  animation: wallpaper-pulse 1s ease-in-out infinite;
}

.inspector-import-box {
  display: grid;
  gap: 8px;
  margin-top: 14px;
}

.inspector-label {
  color: #697787;
  font-size: 9px;
  font-weight: 700;
}

.inspector-input {
  width: 100%;
  padding: 0 9px;
}

.inspector-import-button {
  width: 100%;
  margin-top: 2px;
}

.inspector-empty-state {
  max-width: 190px;
  text-align: center;
}

.inspector-empty-mark {
  width: 42px;
  height: 42px;
  display: grid;
  place-items: center;
  margin: 0 auto 17px;
  border: 1px dashed rgba(240, 106, 59, 0.55);
  border-radius: 50%;
  color: var(--wallpaper-accent);
  font-size: 25px;
  font-weight: 300;
}

.inspector-empty-state h5 {
  font-size: 15px;
}

.inspector-empty-state > p:last-child {
  margin: 9px 0 0;
  color: #6f7d8c;
  font-size: 11px;
  line-height: 1.55;
}

@keyframes wallpaper-shimmer {
  from { background-position: 200% 0; }
  to { background-position: -20% 0; }
}

@keyframes wallpaper-spin {
  to { transform: rotate(360deg); }
}

@keyframes wallpaper-pulse {
  50% { opacity: 0.35; }
}

@media (max-width: 1120px) {
  .wallpaper-window-body {
    grid-template-columns: 150px minmax(0, 1fr) 260px;
  }

  .workshop-main {
    padding-inline: 14px;
  }

  .discovery-grid,
  .discovery-skeleton-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}

@media (max-width: 820px) {
  .wallpaper-window-bar {
    padding-inline: 11px;
  }

  .wallpaper-window-status {
    display: none;
  }

  .wallpaper-window-body {
    display: block;
  }

  .workshop-rail {
    min-height: 55px;
    padding: 8px 10px;
    flex-direction: row;
    align-items: center;
    gap: 6px;
    overflow-x: auto;
    border-right: 0;
    border-bottom: 1px solid var(--wallpaper-line);
  }

  .rail-label,
  .rail-rule,
  .quick-search,
  .rail-footnote {
    display: none;
  }

  .source-nav {
    width: auto;
    min-width: 116px;
    min-height: 34px;
    flex: 0 0 auto;
  }

  .workshop-main {
    min-height: 470px;
  }

  .discovery-inspector {
    border-top: 1px solid var(--wallpaper-line);
    border-left: 0;
  }

  .discovery-inspector.empty {
    min-height: 230px;
  }
}

@media (max-width: 560px) {
  .wallpaper-brand-copy small,
  .window-refresh span:last-child,
  .discovery-search-field kbd,
  .source-breadcrumb {
    display: none;
  }

  .wallpaper-window-bar {
    gap: 9px;
  }

  .discovery-toolbar,
  .source-wallhaven .discovery-toolbar {
    grid-template-columns: 1fr 1fr;
  }

  .discovery-search-field {
    grid-column: 1 / -1;
  }

  .discovery-search-button {
    grid-column: 1 / -1;
  }

  .discovery-grid,
  .discovery-skeleton-grid {
    grid-template-columns: 1fr 1fr;
  }

  .workshop-heading h4 {
    font-size: 16px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .wallpaper-discovery *,
  .wallpaper-discovery *::before,
  .wallpaper-discovery *::after {
    animation-duration: 0.01ms !important;
    animation-iteration-count: 1 !important;
    scroll-behavior: auto !important;
    transition-duration: 0.01ms !important;
  }
}
</style>
