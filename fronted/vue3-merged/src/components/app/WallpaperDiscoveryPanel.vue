<template>
  <section class="wallpaper-discovery" :class="`source-${source}`">
    <main class="discovery-library">
      <div class="discovery-toolbar">
        <label class="discovery-search-field">
          <span class="search-icon" aria-hidden="true"></span>
          <input
            v-model.trim="query"
            type="search"
            :placeholder="source === 'workshop' ? '搜索创意工坊' : '搜索壁纸'"
            aria-label="搜索壁纸"
            @keydown.enter.prevent="runSearch(1)"
          />
        </label>

        <select
          v-if="source === 'workshop'"
          v-model="workshopSort"
          class="filter-control"
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
            class="filter-control"
            aria-label="Wallhaven 排序"
            @change="runSearch(1)"
          >
            <option value="toplist">精选</option>
            <option value="date_added">最新</option>
            <option value="relevance">相关度</option>
            <option value="views">浏览最多</option>
            <option value="favorites">收藏最多</option>
            <option value="random">随机</option>
          </select>
          <select
            v-model="wallhavenAtleast"
            class="filter-control resolution-control"
            aria-label="最低分辨率"
            @change="runSearch(1)"
          >
            <option value="">分辨率</option>
            <option value="1920x1080">≥1080P</option>
            <option value="2560x1440">≥2K</option>
            <option value="3840x2160">≥4K</option>
          </select>
        </template>

        <button type="button" class="search-button ripple-trigger" :disabled="loading" @click="runSearch(1)">
          {{ loading ? '搜索中…' : '搜索' }}
        </button>
        <button
          type="button"
          class="refresh-button ripple-trigger"
          :disabled="loading"
          aria-label="刷新搜索结果"
          title="刷新"
          @click="runSearch(page)"
        >
          <span :class="{ spinning: loading }">↻</span>
        </button>
      </div>

      <div v-if="source === 'wallhaven'" class="filter-row">
        <label class="filter-chip"><input v-model="wallhavenGeneral" type="checkbox" @change="runSearch(1)" /> 综合</label>
        <label class="filter-chip"><input v-model="wallhavenAnime" type="checkbox" @change="runSearch(1)" /> 动漫</label>
        <label class="filter-chip"><input v-model="wallhavenPeople" type="checkbox" @change="runSearch(1)" /> 人物</label>
        <button
          v-if="query || wallhavenAtleast || wallhavenSorting !== 'toplist'"
          type="button"
          class="reset-button"
          @click="resetFilters"
        >
          清除筛选
        </button>
        <span class="result-count">{{ searched ? `${items.length} 项` : '' }}</span>
      </div>
      <div v-else class="quick-row">
        <button type="button" class="quick-chip" @click="applyQuickSearch('anime')">动漫</button>
        <button type="button" class="quick-chip" @click="applyQuickSearch('rain')">雨夜</button>
        <button type="button" class="quick-chip" @click="applyQuickSearch('landscape')">风景</button>
        <button v-if="query" type="button" class="reset-button" @click="resetFilters">清除筛选</button>
        <span class="result-count">{{ searched ? `${items.length} 项` : '' }}</span>
      </div>

      <div v-if="loading && !items.length" class="skeleton-grid" aria-label="正在加载壁纸列表">
        <span v-for="index in 8" :key="`skeleton-${index}`" class="skeleton-card">
          <span class="skeleton-preview"></span>
          <span class="skeleton-line"></span>
          <span class="skeleton-line short"></span>
        </span>
      </div>

      <div v-else-if="errorHint" class="discovery-state error-state">
        <strong>加载失败</strong>
        <span>{{ errorHint }}</span>
        <button type="button" class="state-action" @click="runSearch(page)">重试</button>
      </div>

      <div v-else-if="!items.length && searched" class="discovery-state">
        <span class="state-mark" aria-hidden="true">⌕</span>
        <strong>没有找到壁纸</strong>
      </div>

      <div v-if="items.length" class="discovery-grid">
        <button
          v-for="item in items"
          :key="item.key"
          type="button"
          class="discovery-item ripple-trigger"
          :class="{ active: selected && selected.key === item.key }"
          :aria-pressed="Boolean(selected && selected.key === item.key)"
          @click="selectItem(item)"
        >
          <span class="discovery-thumb-wrap" :class="{ failed: previewState(item).failed }">
            <span v-if="previewState(item).loading && !previewState(item).failed" class="thumb-loading" aria-hidden="true"></span>
            <img
              v-if="previewSrc(item) && !previewState(item).failed"
              class="discovery-thumb"
              :src="previewSrc(item)"
              :alt="item.title || '未命名壁纸'"
              loading="lazy"
              decoding="async"
              referrerpolicy="no-referrer"
              @load="handlePreviewLoad(item)"
              @error="handlePreviewError(item, $event)"
            />
            <span v-else class="discovery-thumb-empty">
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
            <span class="source-badge">{{ source === 'workshop' ? 'WORKSHOP' : 'WALLHAVEN' }}</span>
            <span v-if="selected && selected.key === item.key" class="selected-check" aria-label="已选择">✓</span>
          </span>
          <span class="item-copy">
            <strong>{{ item.title || '未命名壁纸' }}</strong>
            <small>{{ item.meta }}</small>
          </span>
        </button>
      </div>

      <div v-if="items.length || page > 1" class="discovery-pager">
        <button type="button" :disabled="loading || page <= 1" @click="runSearch(page - 1)">←</button>
        <span>{{ page }}<template v-if="source === 'wallhaven' && lastPage > 0"> / {{ lastPage }}</template></span>
        <button type="button" :disabled="loading || !canGoNext" @click="runSearch(page + 1)">→</button>
      </div>
    </main>

    <aside class="discovery-inspector" :class="{ empty: !selected }" aria-label="壁纸预览">
      <template v-if="selected">
        <div class="inspector-preview" :class="{ failed: previewState(selected).failed }">
          <span v-if="previewState(selected).loading && !previewState(selected).failed" class="preview-loading">加载预览…</span>
          <img
            v-if="previewSrc(selected) && !previewState(selected).failed"
            :src="previewSrc(selected)"
            :alt="selected.title || '未命名壁纸'"
            decoding="async"
            referrerpolicy="no-referrer"
            @load="handlePreviewLoad(selected)"
            @error="handlePreviewError(selected, $event)"
          />
          <div v-else class="preview-empty">
            <strong>无预览</strong>
            <button type="button" class="state-action" @click="retryPreview(selected)">重试</button>
          </div>
        </div>

        <div class="inspector-heading">
          <div>
            <h2>{{ selected.title || '未命名壁纸' }}</h2>
            <p>{{ selected.meta }}</p>
          </div>
          <span class="inspector-source">{{ source === 'workshop' ? 'Workshop' : 'Wallhaven' }}</span>
        </div>

        <a
          v-if="selected.detailUrl"
          class="detail-link"
          :href="selected.detailUrl"
          target="_blank"
          rel="noopener noreferrer"
        >
          打开来源 ↗
        </a>

        <div v-if="source === 'workshop'" class="channel-status">
          <span class="status-dot" :class="{ ready: workshopDetail.hasDirectDownload, checking: workshopDetail.loading }"></span>
          <span v-if="workshopDetail.loading">检查下载通道…</span>
          <span v-else-if="workshopDetail.error">{{ workshopDetail.error }}</span>
          <span v-else-if="workshopDetail.hasDirectDownload">可直接导入</span>
          <span v-else>需 SteamCMD 通道</span>
        </div>

        <div class="import-controls">
          <input v-model.trim="importTitle" class="inspector-control" type="text" placeholder="标题（可选）" />
          <select v-model="importVisibility" class="inspector-control" aria-label="导入壁纸可见性">
            <option value="PRIVATE">私有</option>
            <option value="PUBLIC">公开</option>
          </select>
          <button type="button" class="import-button ripple-trigger" :disabled="busy || !isAuthenticated" @click="importSelected">
            {{ busy ? '导入中…' : !isAuthenticated ? '登录后导入' : source === 'workshop' ? '导入壁纸' : '添加壁纸' }}
          </button>
        </div>
      </template>

      <div v-else class="inspector-empty-state">
        <span class="state-mark" aria-hidden="true">▧</span>
        <strong>选择一张壁纸</strong>
      </div>
    </aside>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref, watch } from 'vue';
import {
  getWallpaperDiscoveryPreviewUrl,
  getWorkshopItemDetail,
  searchWallhavenWallpapers,
  searchWorkshopWallpapers
} from '../../services/wallpaperApi';

const props = defineProps({
  source: { type: String, default: 'workshop' },
  authorizedFetch: { type: Function, default: null },
  isAuthenticated: { type: Boolean, default: false },
  busy: { type: Boolean, default: false }
});

const emit = defineEmits(['import-workshop', 'import-wallhaven', 'select-workshop']);

const source = ref(normalizeSource(props.source));
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

const canGoNext = computed(() => {
  if (source.value === 'wallhaven') {
    return lastPage.value > 0 ? page.value < lastPage.value : hasMore.value;
  }
  return hasMore.value;
});

function normalizeSource(value) {
  return value === 'wallhaven' ? 'wallhaven' : 'workshop';
}

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
  const fullUrl = String(readField(raw, 'fullUrl', 'full_url', readField(raw, 'path', 'path', ''))).trim();
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
    previewStates[item.key] = { candidateIndex: 0, loaded: false, loading: true, failed: false };
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
    errorHint.value = detail ? `搜索失败：${detail}` : '搜索失败，请稍后重试。';
  } finally {
    if (seq === searchSeq) loading.value = false;
  }
}

function switchSource(nextSource) {
  const normalized = normalizeSource(nextSource);
  if (source.value === normalized) return;
  source.value = normalized;
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
    workshopDetail.error = '通道检查失败，仍可尝试导入。';
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

watch(() => props.source, (nextSource) => {
  switchSource(nextSource);
});

onMounted(() => runSearch(1));

defineExpose({ runSearch, switchSource });
</script>

<style scoped>
.wallpaper-discovery {
  height: 100%;
  min-height: 0;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  display: grid;
  grid-template-columns: minmax(0, 1fr) 330px;
  gap: 12px;
}

.discovery-library,
.discovery-inspector {
  min-height: 0;
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24));
  border-radius: 13px;
  background: var(--theme-surface-soft, rgba(255, 240, 235, 0.12));
  overflow: hidden;
}

.discovery-library {
  display: grid;
  grid-template-rows: auto auto minmax(0, 1fr) auto;
}

.discovery-toolbar {
  min-height: 49px;
  padding: 7px 9px;
  border-bottom: 1px solid var(--theme-border);
  display: flex;
  align-items: center;
  gap: 7px;
}

.discovery-search-field {
  min-width: 180px;
  min-height: 33px;
  flex: 1;
  padding: 0 9px;
  border: 1px solid var(--theme-border);
  border-radius: 8px;
  background: var(--theme-surface-soft);
  display: flex;
  align-items: center;
  gap: 8px;
}

.discovery-search-field:focus-within {
  border-color: var(--accent-mode-border-strong);
  box-shadow: var(--accent-mode-focus-ring);
}

.search-icon {
  position: relative;
  width: 12px;
  height: 12px;
  flex: 0 0 auto;
  border: 1.5px solid var(--theme-text-tertiary);
  border-radius: 50%;
}

.search-icon::after {
  content: '';
  position: absolute;
  width: 5px;
  height: 1.5px;
  right: -4px;
  bottom: -2px;
  border-radius: 2px;
  background: var(--theme-text-tertiary);
  transform: rotate(45deg);
}

.discovery-search-field input {
  width: 100%;
  min-width: 0;
  border: 0;
  outline: 0;
  background: transparent;
  color: var(--theme-text-primary);
  font: inherit;
  font-size: 12px;
}

.discovery-search-field input::placeholder {
  color: var(--theme-text-tertiary);
}

.filter-control,
.inspector-control {
  min-width: 108px;
  min-height: 33px;
  padding: 0 8px;
  border: 1px solid var(--theme-border) !important;
  border-radius: 8px;
  outline: 0;
  background: var(--theme-surface-soft) !important;
  color: var(--theme-text-primary) !important;
  box-shadow: none !important;
  font-size: 11px;
}

.resolution-control {
  min-width: 88px;
}

.filter-control:focus,
.inspector-control:focus {
  border-color: var(--accent-mode-border-strong) !important;
  box-shadow: var(--accent-mode-focus-ring) !important;
}

.search-button,
.refresh-button,
.import-button {
  min-height: 33px;
  border: 1px solid var(--accent-mode-border-strong) !important;
  border-radius: 8px;
  background: var(--accent-mode-fill-strong) !important;
  color: var(--accent-surface-text, var(--accent-mode-text)) !important;
  box-shadow: none !important;
  font-size: 12px;
}

.search-button {
  min-width: 58px;
  padding: 0 12px;
}

.refresh-button {
  width: 33px;
  padding: 0;
  border-color: var(--theme-border) !important;
  background: var(--theme-surface-soft) !important;
  color: var(--theme-text-primary) !important;
  font-size: 17px;
}

.search-button:disabled,
.refresh-button:disabled,
.import-button:disabled {
  cursor: not-allowed;
  opacity: 0.46;
}

.filter-row,
.quick-row {
  min-height: 39px;
  padding: 6px 10px;
  border-bottom: 1px solid var(--theme-border);
  display: flex;
  align-items: center;
  gap: 6px;
}

.filter-chip,
.quick-chip,
.reset-button {
  min-height: 25px;
  padding: 0 8px;
  border: 1px solid var(--theme-border) !important;
  border-radius: 6px;
  background: var(--theme-surface-soft) !important;
  color: var(--theme-text-secondary) !important;
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 10px;
  box-shadow: none !important;
}

.filter-chip:has(input:checked),
.quick-chip:hover {
  border-color: var(--accent-mode-border) !important;
  background: var(--accent-mode-fill-soft) !important;
  color: var(--theme-text-primary) !important;
}

.filter-chip input {
  margin: 0;
  accent-color: rgb(var(--accent-rgb));
}

.reset-button {
  border-color: transparent !important;
  background: transparent !important;
}

.result-count {
  margin-left: auto;
  color: var(--theme-text-tertiary);
  font-size: 10px;
}

.discovery-grid,
.skeleton-grid {
  min-height: 0;
  padding: 10px;
  overflow: auto;
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(185px, 1fr));
  align-content: start;
  gap: 10px;
  scrollbar-gutter: stable;
}

.discovery-item {
  min-width: 0;
  padding: 5px;
  border: 1px solid transparent !important;
  border-radius: 10px;
  background: transparent !important;
  color: var(--theme-text-primary) !important;
  display: grid;
  gap: 7px;
  text-align: left;
  box-shadow: none !important;
}

.discovery-item:hover {
  border-color: var(--theme-border) !important;
  background: var(--theme-surface-soft) !important;
}

.discovery-item.active {
  border-color: var(--accent-mode-border-strong) !important;
  background: var(--accent-mode-fill-soft) !important;
  box-shadow: inset 0 0 0 1px var(--accent-mode-border) !important;
}

.discovery-thumb-wrap {
  position: relative;
  aspect-ratio: 16 / 9;
  overflow: hidden;
  border: 1px solid var(--theme-border);
  border-radius: 7px;
  background: var(--theme-panel-surface-elevated);
  display: grid;
  place-items: center;
}

.discovery-thumb {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
  transition: transform 180ms ease;
}

.discovery-item:hover .discovery-thumb {
  transform: scale(1.018);
}

.thumb-loading {
  position: absolute;
  z-index: 1;
  width: 22px;
  height: 22px;
  border: 2px solid var(--theme-border);
  border-top-color: rgb(var(--accent-rgb));
  border-radius: 50%;
  animation: spin 800ms linear infinite;
}

.discovery-thumb-empty,
.preview-empty {
  color: var(--theme-text-tertiary);
  display: grid;
  place-items: center;
  gap: 7px;
  font-size: 11px;
}

.preview-retry,
.state-action,
.detail-link {
  color: var(--theme-text-secondary);
  text-decoration: none;
  font-size: 10px;
}

.preview-retry:hover,
.state-action:hover,
.detail-link:hover {
  color: var(--theme-text-primary);
}

.source-badge,
.selected-check,
.inspector-source {
  border: 1px solid var(--theme-border);
  background: var(--theme-panel-surface-elevated);
  color: var(--theme-text-secondary);
  backdrop-filter: blur(12px);
}

.source-badge {
  position: absolute;
  top: 6px;
  left: 6px;
  padding: 3px 6px;
  border-radius: 5px;
  font-size: 8px;
  letter-spacing: 0.06em;
}

.selected-check {
  position: absolute;
  right: 6px;
  bottom: 6px;
  width: 21px;
  height: 21px;
  border-color: var(--accent-mode-border-strong);
  border-radius: 50%;
  background: var(--accent-mode-fill-strong);
  color: var(--accent-surface-text, var(--accent-mode-text));
  display: grid;
  place-items: center;
  font-size: 10px;
  font-weight: 800;
}

.item-copy {
  min-width: 0;
  padding: 0 2px 2px;
  display: grid;
  gap: 3px;
}

.item-copy strong {
  overflow: hidden;
  font-size: 12px;
  font-weight: 650;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.item-copy small {
  overflow: hidden;
  color: var(--theme-text-tertiary);
  font-size: 10px;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.discovery-pager {
  min-height: 39px;
  padding: 5px 10px;
  border-top: 1px solid var(--theme-border);
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 9px;
}

.discovery-pager button {
  width: 28px;
  height: 27px;
  border: 1px solid var(--theme-border) !important;
  border-radius: 6px;
  background: var(--theme-surface-soft) !important;
  color: var(--theme-text-primary) !important;
  box-shadow: none !important;
}

.discovery-pager button:disabled {
  opacity: 0.38;
}

.discovery-pager span {
  min-width: 44px;
  color: var(--theme-text-tertiary);
  font-size: 10px;
  text-align: center;
}

.discovery-state {
  min-height: 220px;
  padding: 24px;
  color: var(--theme-text-tertiary);
  display: grid;
  place-content: center;
  justify-items: center;
  gap: 7px;
  font-size: 11px;
  text-align: center;
}

.discovery-state strong {
  color: var(--theme-text-secondary);
  font-size: 12px;
}

.error-state span {
  max-width: 360px;
}

.state-mark {
  font-size: 24px;
  opacity: 0.7;
}

.state-action {
  border: 0;
  background: transparent;
  cursor: pointer;
}

.skeleton-card {
  padding: 5px;
  display: grid;
  gap: 7px;
}

.skeleton-preview,
.skeleton-line {
  overflow: hidden;
  border-radius: 7px;
  background: var(--theme-surface-soft);
  position: relative;
}

.skeleton-preview {
  aspect-ratio: 16 / 9;
  border: 1px solid var(--theme-border);
}

.skeleton-line {
  width: 80%;
  height: 8px;
}

.skeleton-line.short {
  width: 50%;
}

.skeleton-preview::after,
.skeleton-line::after {
  content: '';
  position: absolute;
  inset: 0;
  background: linear-gradient(90deg, transparent, rgba(255, 255, 255, 0.14), transparent);
  transform: translateX(-100%);
  animation: shimmer 1.3s infinite;
}

.discovery-inspector {
  padding: 10px;
  overflow: auto;
  background: var(--theme-panel-surface-elevated, var(--theme-surface-elevated));
  display: flex;
  flex-direction: column;
  gap: 11px;
}

.inspector-preview {
  position: relative;
  flex: 0 0 auto;
  aspect-ratio: 16 / 9;
  overflow: hidden;
  border: 1px solid var(--theme-border);
  border-radius: 9px;
  background: var(--theme-surface-soft);
  display: grid;
  place-items: center;
}

.inspector-preview img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.preview-loading {
  position: absolute;
  z-index: 1;
  padding: 4px 7px;
  border: 1px solid var(--theme-border);
  border-radius: 5px;
  background: var(--theme-panel-surface-elevated);
  color: var(--theme-text-tertiary);
  font-size: 9px;
}

.inspector-heading {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 9px;
}

.inspector-heading h2 {
  margin: 0;
  color: var(--theme-text-primary);
  font-family: var(--font-cute, var(--font-display));
  font-size: 17px;
  line-height: 1.35;
}

.inspector-heading p {
  margin: 4px 0 0;
  color: var(--theme-text-tertiary);
  font-size: 10px;
}

.inspector-source {
  flex: 0 0 auto;
  padding: 4px 7px;
  border-radius: 5px;
  font-size: 9px;
}

.detail-link {
  align-self: flex-start;
}

.channel-status {
  min-height: 31px;
  padding: 6px 8px;
  border: 1px solid var(--theme-border);
  border-radius: 7px;
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  display: flex;
  align-items: center;
  gap: 7px;
  font-size: 10px;
}

.status-dot {
  width: 6px;
  height: 6px;
  flex: 0 0 auto;
  border-radius: 50%;
  background: var(--theme-text-tertiary);
}

.status-dot.ready {
  background: #68c892;
}

.status-dot.checking {
  background: rgb(var(--accent-rgb));
  box-shadow: var(--accent-mode-glow);
}

.import-controls {
  margin-top: auto;
  padding-top: 10px;
  border-top: 1px solid var(--theme-border);
  display: grid;
  gap: 8px;
}

.inspector-control {
  width: 100%;
}

.import-button {
  width: 100%;
}

.inspector-empty-state {
  flex: 1;
  min-height: 220px;
  color: var(--theme-text-tertiary);
  display: grid;
  place-content: center;
  justify-items: center;
  gap: 8px;
  font-size: 12px;
}

.spinning {
  display: inline-block;
  animation: spin 800ms linear infinite;
}

@keyframes spin {
  to { transform: rotate(360deg); }
}

@keyframes shimmer {
  to { transform: translateX(100%); }
}

@media (max-width: 980px) {
  .wallpaper-discovery {
    grid-template-columns: minmax(0, 1fr) 292px;
  }

  .discovery-grid,
  .skeleton-grid {
    grid-template-columns: repeat(auto-fill, minmax(155px, 1fr));
  }

  .resolution-control {
    display: none;
  }
}

@media (max-width: 720px), (orientation: portrait) {
  .wallpaper-discovery {
    height: auto;
    min-height: 100%;
    grid-template-columns: 1fr;
  }

  .discovery-library {
    min-height: 440px;
  }

  .discovery-inspector {
    min-height: 350px;
  }

  .discovery-toolbar {
    flex-wrap: wrap;
  }

  .discovery-search-field {
    flex-basis: calc(100% - 40px);
  }

  .filter-control {
    flex: 1;
  }

  .discovery-grid,
  .skeleton-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
    padding: 7px;
    gap: 7px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .discovery-thumb {
    transition: none;
  }

  .thumb-loading,
  .spinning,
  .skeleton-preview::after,
  .skeleton-line::after {
    animation: none;
  }
}
</style>
