<template>
  <section class="discovery-panel">
    <header class="discovery-head">
      <div class="discovery-title-row">
        <h4>在线壁纸浏览</h4>
        <span class="status-pill soft">内嵌拉取</span>
      </div>
      <div class="discovery-source-tabs">
        <button
          type="button"
          class="tab-btn ripple-trigger"
          :class="{ active: source === 'workshop' }"
          @click="switchSource('workshop')"
        >
          创意工坊
        </button>
        <button
          type="button"
          class="tab-btn ripple-trigger"
          :class="{ active: source === 'wallhaven' }"
          @click="switchSource('wallhaven')"
        >
          Wallhaven
        </button>
      </div>
    </header>

    <div class="discovery-toolbar">
      <input
        v-model.trim="query"
        class="field-input-lite discovery-query"
        type="search"
        :placeholder="source === 'workshop' ? '搜索创意工坊，如 anime room / city rain' : '搜索 Wallhaven，如 sakura / landscape'"
        @keydown.enter.prevent="runSearch(1)"
      />
      <select v-if="source === 'workshop'" v-model="workshopSort" class="field-input-lite discovery-select" @change="runSearch(1)">
        <option value="trend">本周热门</option>
        <option value="mostrecent">最新发布</option>
        <option value="toprated">最高评价</option>
        <option value="subscribers">订阅最多</option>
      </select>
      <template v-else>
        <select v-model="wallhavenSorting" class="field-input-lite discovery-select" @change="runSearch(1)">
          <option value="toplist">精选榜单</option>
          <option value="date_added">最新上传</option>
          <option value="relevance">相关度</option>
          <option value="views">浏览最多</option>
          <option value="favorites">收藏最多</option>
          <option value="random">随机</option>
        </select>
        <select v-model="wallhavenAtleast" class="field-input-lite discovery-select" @change="runSearch(1)">
          <option value="">分辨率不限</option>
          <option value="1920x1080">≥1080P</option>
          <option value="2560x1440">≥2K</option>
          <option value="3840x2160">≥4K</option>
        </select>
      </template>
      <button type="button" class="scope-btn ripple-trigger" :disabled="loading" @click="runSearch(1)">
        {{ loading ? '搜索中...' : '搜索' }}
      </button>
    </div>

    <div v-if="source === 'wallhaven'" class="discovery-filter-row">
      <span class="scope-label">分类：</span>
      <label class="discovery-check"><input v-model="wallhavenGeneral" type="checkbox" @change="runSearch(1)" /> 综合</label>
      <label class="discovery-check"><input v-model="wallhavenAnime" type="checkbox" @change="runSearch(1)" /> 动漫</label>
      <label class="discovery-check"><input v-model="wallhavenPeople" type="checkbox" @change="runSearch(1)" /> 人物</label>
      <span class="discovery-source-note">全链路可拉取：选中后由服务器直接下载原图入库</span>
    </div>
    <p v-else class="discovery-source-note workshop-note">
      列表由服务器代理抓取，无需跳转新窗口；能否真实下载取决于条目是否有公开直链或服务器已配置 SteamCMD。
    </p>

    <p v-if="errorHint" class="route-bg-note discovery-error">{{ errorHint }}</p>

    <div v-if="loading && !items.length" class="discovery-placeholder">正在加载壁纸列表...</div>
    <div v-else-if="!items.length && searched" class="discovery-placeholder">
      没有找到相关壁纸，换个关键词试试；创意工坊源不可用时可切换 Wallhaven。
    </div>

    <div v-if="items.length" class="discovery-grid">
      <button
        v-for="item in items"
        :key="item.key"
        type="button"
        class="discovery-item ripple-trigger"
        :class="{ active: selected && selected.key === item.key }"
        @click="selectItem(item)"
      >
        <span class="discovery-thumb-wrap">
          <img
            v-if="item.thumb"
            class="discovery-thumb"
            :src="item.thumb"
            :alt="item.title"
            loading="lazy"
            referrerpolicy="no-referrer"
          />
          <span v-else class="discovery-thumb discovery-thumb-empty">无预览</span>
        </span>
        <span class="discovery-item-name">{{ item.title || '未命名壁纸' }}</span>
        <span class="discovery-item-meta">{{ item.meta }}</span>
      </button>
    </div>

    <div v-if="items.length || page > 1" class="discovery-pager">
      <button type="button" class="scope-btn ripple-trigger" :disabled="loading || page <= 1" @click="runSearch(page - 1)">
        上一页
      </button>
      <span class="discovery-page-indicator">
        第 {{ page }} 页<template v-if="source === 'wallhaven' && lastPage > 0"> / {{ lastPage }} 页</template>
      </span>
      <button type="button" class="scope-btn ripple-trigger" :disabled="loading || !canGoNext" @click="runSearch(page + 1)">
        下一页
      </button>
    </div>

    <section v-if="selected" class="discovery-selection">
      <div class="discovery-selection-main">
        <img
          v-if="selected.thumb"
          class="discovery-selection-thumb"
          :src="selected.thumb"
          :alt="selected.title"
          referrerpolicy="no-referrer"
        />
        <div class="discovery-selection-info">
          <p class="discovery-selection-title">{{ selected.title || '未命名壁纸' }}</p>
          <p class="route-bg-note">{{ selected.meta }}</p>
          <p v-if="source === 'workshop'" class="route-bg-note">
            <template v-if="workshopDetail.loading">正在检查下载通道...</template>
            <template v-else-if="workshopDetail.error">{{ workshopDetail.error }}</template>
            <template v-else-if="workshopDetail.hasDirectDownload">✅ 该条目有公开直链，可直接拉取</template>
            <template v-else>⚠️ 无公开直链，需服务器已配置 SteamCMD 才能拉取</template>
          </p>
          <a
            v-if="selected.detailUrl"
            class="discovery-detail-link"
            :href="selected.detailUrl"
            target="_blank"
            rel="noopener noreferrer"
          >
            在浏览器打开详情页
          </a>
        </div>
      </div>
      <div class="discovery-selection-actions">
        <input v-model.trim="importTitle" class="field-input-lite" type="text" placeholder="壁纸标题（可选）" />
        <select v-model="importVisibility" class="field-input-lite">
          <option value="PRIVATE">私有</option>
          <option value="PUBLIC">公开</option>
        </select>
        <button type="button" class="scope-btn ripple-trigger" :disabled="busy" @click="importSelected">
          {{ busy ? '导入中...' : source === 'workshop' ? '导入选中壁纸' : '拉取选中壁纸' }}
        </button>
      </div>
    </section>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref } from 'vue';
import {
  getWorkshopItemDetail,
  searchWallhavenWallpapers,
  searchWorkshopWallpapers
} from '../../services/wallpaperApi';

const props = defineProps({
  authorizedFetch: { type: Function, default: null },
  busy: { type: Boolean, default: false }
});

const emit = defineEmits(['import-workshop', 'import-wallhaven']);

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
  return {
    key: `workshop-${itemId}`,
    itemId,
    title: String(readField(raw, 'title', 'title', '')).trim(),
    thumb: String(readField(raw, 'previewUrl', 'preview_url', '')).trim(),
    detailUrl: String(readField(raw, 'detailUrl', 'detail_url', '')).trim(),
    meta: `Workshop #${itemId}`
  };
}

function normalizeWallhavenItem(raw) {
  const id = String(readField(raw, 'id', 'id', '')).trim();
  if (!id) return null;
  const resolution = String(readField(raw, 'resolution', 'resolution', '')).trim();
  const sizeText = formatFileSize(readField(raw, 'fileSizeBytes', 'file_size_bytes', 0));
  return {
    key: `wallhaven-${id}`,
    wallhavenId: id,
    title: `Wallhaven ${id}`,
    thumb: String(readField(raw, 'thumbUrl', 'thumb_url', '')).trim(),
    detailUrl: String(readField(raw, 'detailUrl', 'detail_url', '')).trim(),
    meta: [resolution, sizeText].filter(Boolean).join(' · ') || 'Wallhaven'
  };
}

function wallhavenCategories() {
  const bits = [wallhavenGeneral.value, wallhavenAnime.value, wallhavenPeople.value]
    .map((flag) => (flag ? '1' : '0'))
    .join('');
  return bits === '000' ? '111' : bits;
}

async function runSearch(targetPage = 1) {
  if (typeof props.authorizedFetch !== 'function') {
    errorHint.value = '登录后才能使用在线壁纸浏览。';
    return;
  }
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
      const rawItems = Array.isArray(readField(payload, 'items', 'items', [])) ? readField(payload, 'items', 'items', []) : [];
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
      const rawItems = Array.isArray(readField(payload, 'items', 'items', [])) ? readField(payload, 'items', 'items', []) : [];
      items.value = rawItems.map(normalizeWallhavenItem).filter(Boolean);
      page.value = Number(readField(payload, 'page', 'page', targetPage)) || targetPage;
      lastPage.value = Number(readField(payload, 'lastPage', 'last_page', 0)) || 0;
      hasMore.value = lastPage.value > 0 ? page.value < lastPage.value : items.value.length > 0;
    }
    searched.value = true;
  } catch (error) {
    if (seq !== searchSeq) return;
    const detail = String(error?.detail || error?.message || '').trim();
    errorHint.value = detail ? `搜索失败：${detail}` : '搜索失败，请稍后重试或切换来源。';
  } finally {
    if (seq === searchSeq) {
      loading.value = false;
    }
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
  runSearch(1);
}

async function selectItem(item) {
  selected.value = item;
  importTitle.value = item.title || '';
  if (source.value !== 'workshop') return;
  workshopDetail.loading = true;
  workshopDetail.error = '';
  workshopDetail.hasDirectDownload = false;
  try {
    const payload = await getWorkshopItemDetail(item.itemId, props.authorizedFetch);
    if (!selected.value || selected.value.key !== item.key) return;
    workshopDetail.hasDirectDownload = Boolean(readField(payload, 'hasDirectDownload', 'has_direct_download', false));
    const detailTitle = String(readField(payload, 'title', 'title', '')).trim();
    if (detailTitle && !importTitle.value) {
      importTitle.value = detailTitle;
    }
  } catch (error) {
    if (!selected.value || selected.value.key !== item.key) return;
    workshopDetail.error = '下载通道检查失败，仍可尝试导入。';
  } finally {
    if (selected.value && selected.value.key === item.key) {
      workshopDetail.loading = false;
    }
  }
}

function importSelected() {
  const item = selected.value;
  if (!item || props.busy) return;
  if (source.value === 'workshop') {
    emit('import-workshop', {
      itemId: item.itemId,
      url: `https://steamcommunity.com/sharedfiles/filedetails/?id=${item.itemId}`,
      title: importTitle.value || item.title || '',
      visibility: importVisibility.value
    });
  } else {
    emit('import-wallhaven', {
      wallhavenId: item.wallhavenId,
      title: importTitle.value || item.title || '',
      visibility: importVisibility.value
    });
  }
}

onMounted(() => {
  runSearch(1);
});

defineExpose({ runSearch, switchSource });
</script>

<style scoped>
.discovery-panel {
  border: 1px solid rgba(255, 255, 255, 0.54);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.42);
  padding: 10px;
  display: grid;
  align-content: start;
  gap: 8px;
}

.discovery-head {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.discovery-title-row {
  display: flex;
  align-items: center;
  gap: 8px;
  min-width: 0;
}

.discovery-panel h4 {
  margin: 0;
  color: var(--picker-ink) !important;
  font-family: var(--font-cute, var(--font-display));
  font-size: 14px;
  letter-spacing: 0.01em;
}

.discovery-source-tabs {
  display: flex;
  align-items: center;
  gap: 6px;
}

.discovery-toolbar {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto auto;
  gap: 8px;
}

.discovery-toolbar:has(.discovery-select + .discovery-select) {
  grid-template-columns: minmax(0, 1fr) auto auto auto;
}

.discovery-query {
  min-width: 0;
}

.discovery-select {
  min-width: 96px;
}

.discovery-filter-row {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px 12px;
}

.discovery-check {
  display: inline-flex;
  align-items: center;
  gap: 4px;
  color: var(--picker-ink-soft) !important;
  font-size: 12px;
}

.discovery-source-note {
  margin: 0;
  color: var(--picker-ink-soft) !important;
  font-size: 12px;
}

.workshop-note {
  line-height: 1.5;
}

.discovery-error {
  color: rgba(135, 27, 50, 0.92) !important;
}

.discovery-placeholder {
  border: 1px dashed rgba(85, 94, 114, 0.4);
  border-radius: 10px;
  padding: 18px 10px;
  text-align: center;
  color: var(--picker-ink-soft);
  font-size: 12px;
  background: rgba(255, 255, 255, 0.3);
}

.discovery-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(128px, 1fr));
  gap: 8px;
  max-height: 300px;
  overflow: auto;
  -webkit-overflow-scrolling: touch;
  touch-action: pan-y;
  padding-right: 2px;
}

.discovery-item {
  border: 0;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.34);
  padding: 5px;
  display: grid;
  gap: 4px;
  cursor: pointer;
  text-align: left;
}

.discovery-item.active {
  box-shadow: inset 0 0 0 2px rgba(var(--accent-rgb), 0.82);
}

.discovery-thumb-wrap {
  display: block;
  width: 100%;
}

.discovery-thumb {
  display: block;
  width: 100%;
  height: 76px;
  object-fit: cover;
  border-radius: 7px;
  background: rgba(255, 255, 255, 0.4);
}

.discovery-thumb-empty {
  display: grid;
  place-items: center;
  color: var(--picker-ink-soft);
  font-size: 11px;
}

.discovery-item-name {
  color: var(--picker-ink) !important;
  font-size: 12px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.discovery-item-meta {
  color: var(--picker-ink-soft) !important;
  font-size: 11px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.discovery-pager {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
}

.discovery-page-indicator {
  color: var(--picker-ink-soft);
  font-size: 12px;
}

.discovery-selection {
  border: 1px solid rgba(var(--accent-rgb), 0.24);
  border-radius: 10px;
  background: rgba(var(--accent-soft-rgb, 255, 255, 255), 0.18);
  padding: 8px 10px;
  display: grid;
  gap: 8px;
}

.discovery-selection-main {
  display: flex;
  align-items: flex-start;
  gap: 10px;
  min-width: 0;
}

.discovery-selection-thumb {
  width: 96px;
  height: 60px;
  object-fit: cover;
  border-radius: 8px;
  flex: none;
}

.discovery-selection-info {
  display: grid;
  gap: 3px;
  min-width: 0;
}

.discovery-selection-title {
  margin: 0;
  color: var(--picker-ink) !important;
  font-size: 13px;
  font-weight: 700;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.discovery-detail-link {
  color: var(--picker-accent-text) !important;
  font-size: 12px;
  text-decoration: underline;
  width: fit-content;
}

.discovery-selection-actions {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto auto;
  gap: 8px;
}

@media (max-width: 600px), (orientation: portrait) {
  .discovery-toolbar,
  .discovery-toolbar:has(.discovery-select + .discovery-select) {
    grid-template-columns: 1fr;
  }

  .discovery-selection-actions {
    grid-template-columns: 1fr;
  }

  .discovery-grid {
    grid-template-columns: repeat(auto-fill, minmax(108px, 1fr));
    max-height: 260px;
  }
}
</style>
