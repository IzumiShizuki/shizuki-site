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
          @change="scheduleSearch(1)"
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
            @change="scheduleSearch(1)"
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
            @change="scheduleSearch(1)"
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
          @click="runSearch(page, { forceRefresh: true })"
        >
          <span :class="{ spinning: loading }">↻</span>
        </button>
      </div>

      <div v-if="source === 'wallhaven'" class="filter-row">
        <button
          type="button"
          class="filter-disclosure-toggle"
          :aria-expanded="filtersExpanded"
          aria-controls="wallpaper-filter-controls"
          @click="filtersExpanded = !filtersExpanded"
        >筛选选项 <span aria-hidden="true">{{ filtersExpanded ? '−' : '+' }}</span></button>
        <div id="wallpaper-filter-controls" class="filter-controls-list" :class="{ 'is-collapsed': !filtersExpanded }">
        <label class="filter-chip"><input v-model="wallhavenGeneral" type="checkbox" @change="scheduleSearch(1)" /> 综合</label>
        <label class="filter-chip"><input v-model="wallhavenAnime" type="checkbox" @change="scheduleSearch(1)" /> 动漫</label>
        <label class="filter-chip"><input v-model="wallhavenPeople" type="checkbox" @change="scheduleSearch(1)" /> 人物</label>
        <fieldset class="rating-filter-group">
          <legend>年龄分级</legend>
          <label class="filter-chip">
            <input
              v-model="wallhavenSafe"
              type="checkbox"
              aria-label="安全分级"
              @change="handleWallhavenRatingChange"
            />
            安全
          </label>
          <label class="filter-chip">
            <input
              v-model="wallhavenSketchy"
              type="checkbox"
              aria-label="轻微敏感分级"
              @change="handleWallhavenRatingChange"
            />
            轻微敏感
          </label>
        </fieldset>
        <select v-model="wallhavenRatios" class="filter-control compact-filter" aria-label="Wallhaven 比例" @change="scheduleSearch(1)">
          <option value="">全部比例</option>
          <option value="16x9,16x10">横屏</option>
          <option value="21x9,32x9">超宽屏</option>
          <option value="9x16,10x16">竖屏</option>
          <option value="1x1">方形</option>
        </select>
        <select v-model="wallhavenOrder" class="filter-control compact-filter" aria-label="Wallhaven 顺序" @change="scheduleSearch(1)">
          <option value="desc">降序</option>
          <option value="asc">升序</option>
        </select>
        <button
          v-if="hasCustomWallhavenFilters"
          type="button"
          class="reset-button"
          @click="resetFilters"
        >
          清除筛选
        </button>
        <span class="result-count">{{ searched ? `${items.length} 项` : '' }}</span>
        </div>
      </div>
      <div v-else class="quick-row">
        <button
          type="button"
          class="filter-disclosure-toggle"
          :aria-expanded="filtersExpanded"
          aria-controls="wallpaper-filter-controls"
          @click="filtersExpanded = !filtersExpanded"
        >筛选选项 <span aria-hidden="true">{{ filtersExpanded ? '−' : '+' }}</span></button>
        <div id="wallpaper-filter-controls" class="filter-controls-list" :class="{ 'is-collapsed': !filtersExpanded }">
        <select v-model="workshopType" class="filter-control compact-filter" aria-label="Workshop 类型" @change="scheduleSearch(1)">
          <option value="">全部类型</option>
          <option value="Scene">场景</option>
          <option value="Video">视频</option>
          <option value="Web">网页</option>
        </select>
        <select v-model="workshopGenre" class="filter-control compact-filter" aria-label="Workshop 风格" @change="scheduleSearch(1)">
          <option value="">全部风格</option>
          <option value="Anime">动漫</option>
          <option value="Landscape">风景</option>
          <option value="Nature">自然</option>
          <option value="Relaxing">放松</option>
          <option value="Game">游戏</option>
          <option value="Cyberpunk">赛博朋克</option>
          <option value="Sci-Fi">科幻</option>
          <option value="Pixel art">像素</option>
        </select>
        <select v-model="workshopResolution" class="filter-control compact-filter" aria-label="Workshop 分辨率" @change="scheduleSearch(1)">
          <option value="">全部分辨率</option>
          <option value="1280 x 720">720P</option>
          <option value="1920 x 1080">1080P</option>
          <option value="2560 x 1440">2K</option>
          <option value="3440 x 1440">超宽屏</option>
          <option value="3840 x 2160">4K</option>
          <option value="Dynamic Resolution">动态分辨率</option>
        </select>
        <button type="button" class="quick-chip" @click="applyQuickSearch('anime')">动漫</button>
        <button type="button" class="quick-chip" @click="applyQuickSearch('rain')">雨夜</button>
        <button type="button" class="quick-chip" @click="applyQuickSearch('landscape')">风景</button>
        <button v-if="query || workshopType || workshopGenre || workshopResolution" type="button" class="reset-button" @click="resetFilters">清除筛选</button>
        <span class="result-count">{{ searched ? `${items.length} 项` : '' }}</span>
        </div>
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
              :alt="item.title || item.key"
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
            <span v-if="source === 'workshop'" class="resolution-badge" title="来源于作者标注">{{ workshopResolutionLabel(item.resolution) }}</span>
            <span v-if="selected && selected.key === item.key" class="selected-check" aria-label="已选择">✓</span>
          </span>
          <span class="item-copy">
            <strong>{{ item.nameLoading ? '读取名称…' : item.title }}</strong>
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
            :alt="selected.title || selected.key"
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
            <h2>{{ selected.title }}</h2>
            <p>{{ selected.meta }}</p>
          </div>
          <span class="inspector-source">{{ source === 'workshop' ? 'Workshop' : 'Wallhaven' }}</span>
        </div>

        <div v-if="selected.details && selected.details.length" class="inspector-metadata">
          <span v-for="detail in selected.details" :key="detail">{{ detail }}</span>
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
          <span class="status-dot" :class="{ ready: workshopDetail.downloadAvailable, checking: workshopDetail.loading }"></span>
          <span v-if="workshopDetail.loading">检查下载通道…</span>
          <span v-else-if="workshopDetail.error">{{ workshopDetail.error }}</span>
          <span v-else-if="workshopDetail.channelMessage">{{ workshopDetail.channelMessage }}</span>
          <span v-else-if="workshopDetail.downloadChannel === 'DIRECT'">可直接导入</span>
          <span v-else-if="workshopDetail.downloadChannel === 'STEAMCMD'">可通过 SteamCMD 导入</span>
          <span v-else>下载通道不可用</span>
        </div>
        <p v-if="source === 'workshop'" class="resolution-notice">
          {{ workshopResolutionLabel(selected.resolution) }} · 来源于作者标注，原文件可能不同
        </p>

        <div
          v-if="importProgress.visible"
          class="import-progress"
          :class="`state-${importProgress.tone}`"
          role="status"
          aria-live="polite"
          aria-atomic="true"
        >
          <div class="import-progress-head">
            <strong>{{ importProgress.label }}</strong>
            <span v-if="importProgress.jobId">
              #{{ importProgress.jobId }} · {{ importProgress.detail || (importProgress.determinate ? `${importProgress.percent}%` : '处理中') }}
            </span>
          </div>
          <div
            class="import-progress-track"
            role="progressbar"
            aria-label="壁纸导入进度"
            aria-valuemin="0"
            aria-valuemax="100"
            :aria-valuenow="importProgress.determinate ? importProgress.percent : undefined"
            :aria-valuetext="`${importProgress.label}${importProgress.detail ? `，${importProgress.detail}` : ''}`"
            :aria-busy="String(importProgress.busy)"
          >
            <span
              class="import-progress-fill"
              :class="{ indeterminate: !importProgress.determinate }"
              :style="importProgress.determinate ? { width: `${importProgress.percent}%` } : undefined"
            ></span>
          </div>
        </div>

        <div class="import-controls">
          <input v-model.trim="importTitle" class="inspector-control" type="text" placeholder="标题（可选）" />
          <select v-model="importVisibility" class="inspector-control" aria-label="导入壁纸可见性">
            <option value="PRIVATE">私有</option>
            <option value="PUBLIC">公开</option>
          </select>
          <button type="button" class="import-button ripple-trigger" :class="{ 'retry-action': canRetrySelectedImport }" :disabled="busy || !isAuthenticated" @click="importSelected">
            {{ busy ? '导入中…' : !isAuthenticated ? '登录后导入' : canRetrySelectedImport ? '重试下载' : source === 'workshop' ? '导入壁纸' : '添加壁纸' }}
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
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import {
  getWallpaperDiscoveryPreviewUrl,
  getWorkshopItemDetail,
  getWallhavenItemDetail,
  searchWallhavenWallpapers,
  searchWorkshopWallpapers
} from '../../services/wallpaperApi';

const props = defineProps({
  source: { type: String, default: 'workshop' },
  authorizedFetch: { type: Function, default: null },
  isAuthenticated: { type: Boolean, default: false },
  busy: { type: Boolean, default: false },
  importState: { type: Object, default: () => ({}) }
});

const emit = defineEmits(['import-workshop', 'import-wallhaven', 'select-workshop']);

const source = ref(normalizeSource(props.source));
const query = ref('');
const filtersExpanded = ref(false);
const workshopSort = ref('trend');
const workshopType = ref('');
const workshopGenre = ref('');
const workshopResolution = ref('');
const wallhavenSorting = ref('toplist');
const wallhavenAtleast = ref('');
const wallhavenSafe = ref(true);
const wallhavenSketchy = ref(false);
const wallhavenRatios = ref('');
const wallhavenOrder = ref('desc');
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
const canRetrySelectedImport = computed(() => {
  const status = String(props.importState?.lastImportJobStatus || '').toUpperCase();
  return source.value === 'workshop'
    && selected.value?.itemId
    && String(props.importState?.lastImportWorkshopItemId || '') === String(selected.value.itemId)
    && ['FAILED', 'FALLBACK_REQUIRED'].includes(status);
});
const previewStates = reactive({});
const workshopDetail = reactive({
  loading: false,
  hasDirectDownload: false,
  downloadChannel: 'UNKNOWN',
  downloadAvailable: false,
  channelMessage: '',
  error: ''
});

let searchSeq = 0;
let searchDebounceTimer = 0;
let nameRetryTimer = 0;

function syncFilterDisclosureToViewport() {
  const compact = window.matchMedia?.('(max-width: 720px), (orientation: portrait)').matches;
  if (compact === false) filtersExpanded.value = true;
  if (compact === true) filtersExpanded.value = false;
}

const canGoNext = computed(() => {
  if (source.value === 'wallhaven') {
    return lastPage.value > 0 ? page.value < lastPage.value : hasMore.value;
  }
  return hasMore.value;
});

const hasCustomWallhavenFilters = computed(() => Boolean(
  query.value
  || wallhavenAtleast.value
  || wallhavenSorting.value !== 'toplist'
  || !wallhavenSafe.value
  || wallhavenSketchy.value
  || wallhavenRatios.value
  || wallhavenOrder.value !== 'desc'
  || !wallhavenGeneral.value
  || !wallhavenAnime.value
  || wallhavenPeople.value
));

const importProgress = computed(() => {
  const jobId = Number(props.importState?.lastImportJobId || 0);
  if (props.busy) {
    return {
      visible: true,
      jobId: 0,
      label: '正在创建导入任务',
      percent: 8,
      determinate: false,
      busy: true,
      tone: 'active'
    };
  }
  if (!Number.isFinite(jobId) || jobId <= 0) {
    return { visible: false, jobId: 0, label: '', percent: 0, determinate: true, busy: false, tone: 'idle' };
  }

  const status = String(props.importState?.lastImportJobStatus || 'PENDING').trim().toUpperCase();
  const stage = String(props.importState?.lastImportJobProgressStage || '').trim().toUpperCase();
  const rawProgressPercent = props.importState?.lastImportJobProgressPercent;
  const rawPercent = rawProgressPercent == null ? Number.NaN : Number(rawProgressPercent);
  const sourceType = String(props.importState?.lastImportJobSourceType || '').trim().toUpperCase();
  const rawDownloadedBytes = props.importState?.lastImportJobDownloadedBytes;
  const downloadedBytes = rawDownloadedBytes == null || rawDownloadedBytes === '' ? Number.NaN : Number(rawDownloadedBytes);
  const totalBytes = Number(props.importState?.lastImportJobTotalBytes);
  if (['FAILED', 'FALLBACK_REQUIRED'].includes(status)) {
    const failureDetail = String(
      props.importState?.lastImportJobErrorMessage
      || props.importState?.lastImportJobFallbackHint
      || ''
    ).trim();
    return {
      visible: true,
      jobId,
      label: status === 'FALLBACK_REQUIRED' ? '自动下载未完成' : '导入失败',
      detail: failureDetail,
      percent: 0,
      determinate: false,
      busy: false,
      tone: 'failed'
    };
  }
  if (stage === 'DOWNLOADING' && sourceType === 'WORKSHOP') {
    const hasDownloadedBytes = Number.isFinite(downloadedBytes) && downloadedBytes >= 0;
    const hasTotal = Number.isFinite(totalBytes) && totalBytes > 0;
    const percent = hasDownloadedBytes && hasTotal
      ? Math.max(0, Math.min(100, (downloadedBytes / totalBytes) * 100))
      : 0;
    const formatMb = (bytes) => `${(bytes / (1024 * 1024)).toFixed(1)} MB`;
    return {
      visible: true,
      jobId,
      label: '正在下载资源',
      detail: hasDownloadedBytes
        ? hasTotal
          ? `${formatMb(downloadedBytes)} / ${formatMb(totalBytes)}`
          : `已获取 ${formatMb(downloadedBytes)}`
        : '等待字节数据',
      percent,
      determinate: hasDownloadedBytes && hasTotal,
      busy: true,
      tone: 'active'
    };
  }
  const stageStates = {
    QUEUED: { label: '正在排队准备下载', busy: true, tone: 'active' },
    RESOLVING: { label: '正在读取创意工坊信息', busy: true, tone: 'active' },
    DOWNLOADING: { label: '正在下载资源', busy: true, tone: 'active' },
    INSPECTING: { label: '正在检查资源', busy: true, tone: 'active' },
    PERSISTING: { label: '正在保存壁纸', busy: true, tone: 'active' },
    COMPLETED: { label: '壁纸已添加', busy: false, tone: 'success' },
    FAILED: { label: '导入失败', busy: false, tone: 'failed' },
    FALLBACK_REQUIRED: { label: '自动下载未完成', busy: false, tone: 'failed' }
  };
  const serverStage = stageStates[stage];
  if (serverStage && Number.isFinite(rawPercent)) {
    return {
      visible: true,
      jobId,
      ...serverStage,
      percent: Math.max(0, Math.min(100, Math.round(rawPercent))),
      determinate: true
    };
  }
  const states = {
    PENDING: { label: '等待开始下载', percent: 18, determinate: false, busy: true, tone: 'active' },
    RUNNING: { label: '正在下载和解析', percent: 58, determinate: false, busy: true, tone: 'active' },
    SUCCEEDED: { label: '壁纸已添加', percent: 100, determinate: true, busy: false, tone: 'success' },
    FAILED: { label: '导入失败', percent: 0, determinate: false, busy: false, tone: 'failed' },
    FALLBACK_REQUIRED: { label: '自动下载未完成', percent: 0, determinate: false, busy: false, tone: 'failed' }
  };
  return { visible: true, jobId, ...(states[status] || states.PENDING) };
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

function formatCompactCount(value, suffix) {
  const count = Number(value || 0);
  if (!Number.isFinite(count) || count <= 0) return '';
  if (count >= 10000) return `${(count / 10000).toFixed(count >= 100000 ? 0 : 1)}万${suffix}`;
  return `${Math.round(count)}${suffix}`;
}

function wallhavenCategoryLabel(category) {
  return ({ anime: '动漫', general: '综合', people: '人物' })[String(category || '').toLowerCase()] || '壁纸';
}

function wallhavenPurityLabel(purity) {
  return ({ sfw: '安全', sketchy: '轻微敏感', nsfw: '成人' })[String(purity || '').toLowerCase()] || '';
}

function wallhavenPurityBits() {
  return `${wallhavenSafe.value ? '1' : '0'}${wallhavenSketchy.value ? '1' : '0'}0`;
}

function handleWallhavenRatingChange() {
  if (!wallhavenSafe.value && !wallhavenSketchy.value) {
    wallhavenSafe.value = true;
  }
  scheduleSearch(1);
}

function formatCreatedDate(value) {
  const raw = String(value || '').trim();
  return /^\d{4}-\d{2}-\d{2}/.test(raw) ? raw.slice(0, 10) : '';
}

function normalizeWorkshopItem(raw) {
  const itemId = String(readField(raw, 'itemId', 'item_id', '')).trim();
  if (!itemId) return null;
  const title = String(readField(raw, 'title', 'title', '')).trim();
  const thumb = String(readField(raw, 'previewUrl', 'preview_url', '')).trim();
  return {
    key: `workshop-${itemId}`,
    itemId,
    title: title || `Workshop #${itemId}`,
    thumb,
    fullUrl: '',
    resolution: String(readField(raw, 'resolution', 'resolution', '')).trim(),
    detailUrl: String(readField(raw, 'detailUrl', 'detail_url', '')).trim(),
    meta: `Workshop #${itemId}`,
    details: [`ID ${itemId}`]
  };
}

function workshopResolutionLabel(value) {
  if (value === 'Dynamic Resolution') return '动态分辨率';
  const pixels = /^(\d{3,5})\s*[x×]\s*(\d{3,5})$/i.exec(String(value || ''));
  return pixels ? `${pixels[1]} × ${pixels[2]}` : '分辨率未提供';
}

function normalizeWallhavenItem(raw) {
  const id = String(readField(raw, 'id', 'id', '')).trim();
  if (!id) return null;
  const resolution = String(readField(raw, 'resolution', 'resolution', '')).trim();
  const ratio = String(readField(raw, 'ratio', 'ratio', '')).trim();
  const sizeText = formatFileSize(readField(raw, 'fileSizeBytes', 'file_size_bytes', 0));
  const thumb = String(readField(raw, 'thumbUrl', 'thumb_url', '')).trim();
  const fullUrl = String(readField(raw, 'fullUrl', 'full_url', readField(raw, 'path', 'path', ''))).trim();
  const category = String(readField(raw, 'category', 'category', '')).trim();
  const purity = String(readField(raw, 'purity', 'purity', '')).trim();
  const categoryLabel = wallhavenCategoryLabel(category);
  const rawTitle = String(readField(raw, 'title', 'title', '')).trim();
  const title = !rawTitle || /^Wallhaven\s*#?[a-z0-9]{4,20}$/i.test(rawTitle) ? '未命名壁纸' : rawTitle;
  const viewsText = formatCompactCount(readField(raw, 'views', 'views', 0), '浏览');
  const favoritesText = formatCompactCount(readField(raw, 'favorites', 'favorites', 0), '收藏');
  const createdText = formatCreatedDate(readField(raw, 'createdAt', 'created_at', ''));
  const colors = readField(raw, 'colors', 'colors', []);
  return {
    key: `wallhaven-${id}`,
    wallhavenId: id,
    title,
    nameLoading: false,
    thumb,
    fullUrl,
    detailUrl: String(readField(raw, 'detailUrl', 'detail_url', '')).trim(),
    resolution,
    ratio,
    category,
    purity,
    views: Number(readField(raw, 'views', 'views', 0)) || 0,
    favorites: Number(readField(raw, 'favorites', 'favorites', 0)) || 0,
    createdAt: String(readField(raw, 'createdAt', 'created_at', '')).trim(),
    colors: Array.isArray(colors) ? colors.filter((color) => /^#[0-9a-f]{6}$/i.test(String(color || ''))) : [],
    sourceUrl: String(readField(raw, 'sourceUrl', 'source_url', '')).trim(),
    meta: [resolution, categoryLabel, viewsText].filter(Boolean).join(' · ') || `Wallhaven #${id}`,
    details: [
      `ID ${id}`,
      wallhavenPurityLabel(purity),
      sizeText,
      viewsText,
      favoritesText,
      createdText
    ].filter(Boolean)
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
    item.thumb,
    getWallpaperDiscoveryPreviewUrl(source.value, sourceId),
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

async function runSearch(targetPage = 1, { forceRefresh = false } = {}) {
  if (nameRetryTimer) window.clearTimeout(nameRetryTimer);
  nameRetryTimer = 0;
  if (searchDebounceTimer) {
    window.clearTimeout(searchDebounceTimer);
    searchDebounceTimer = 0;
  }
  const seq = ++searchSeq;
  loading.value = true;
  errorHint.value = '';
  try {
    if (source.value === 'workshop') {
      const payload = await searchWorkshopWallpapers(
        {
          query: query.value,
          page: targetPage,
          sort: workshopSort.value,
          tags: [workshopType.value, workshopGenre.value, workshopResolution.value].filter(Boolean)
        },
        props.authorizedFetch,
        { forceRefresh }
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
          purity: wallhavenPurityBits(),
          sorting: wallhavenSorting.value,
          order: wallhavenOrder.value,
          atleast: wallhavenAtleast.value,
          ratios: wallhavenRatios.value
        },
        props.authorizedFetch,
        { forceRefresh }
      );
      if (seq !== searchSeq) return;
      const rawItems = Array.isArray(readField(payload, 'items', 'items', []))
        ? readField(payload, 'items', 'items', [])
        : [];
      clearPreviewStates();
      items.value = rawItems.map(normalizeWallhavenItem).filter(Boolean);
      enrichWallhavenNames(items.value.filter((item) => item.title === '未命名壁纸'), seq);
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

async function enrichWallhavenNames(queue, seq, attempt = 0) {
  let cursor = 0;
  const retry = [];
  let retrySeconds = 61;
  await Promise.all(Array.from({ length: Math.min(3, queue.length) }, async () => {
    while (cursor < queue.length && seq === searchSeq) {
      const item = queue[cursor++];
      item.nameLoading = true;
      try {
        const payload = await getWallhavenItemDetail(item.wallhavenId, props.authorizedFetch);
        if (seq !== searchSeq) return;
        const delay = Number(readField(payload, 'retryAfterSeconds', 'retry_after_seconds', 0));
        if (delay > 0) {
          retry.push(item);
          retrySeconds = Math.max(retrySeconds, delay);
        } else {
          const title = String(readField(payload, 'title', 'title', '')).trim();
          if (title && title !== '未命名壁纸') {
            const oldTitle = item.title;
            item.title = title;
            if (selected.value?.key === item.key && importTitle.value === oldTitle) importTitle.value = title;
          }
        }
      } catch {
        if (seq === searchSeq && attempt < 2) retry.push(item);
      } finally {
        item.nameLoading = false;
      }
    }
  }));
  if (retry.length && seq === searchSeq && attempt < 4) {
    nameRetryTimer = window.setTimeout(() => {
      nameRetryTimer = 0;
      enrichWallhavenNames(retry, seq, attempt + 1);
    }, Math.min(retrySeconds, 120) * 1000);
  }
}

function scheduleSearch(targetPage = 1) {
  if (searchDebounceTimer) window.clearTimeout(searchDebounceTimer);
  searchDebounceTimer = window.setTimeout(() => {
    searchDebounceTimer = 0;
    void runSearch(targetPage);
  }, 260);
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
    workshopType.value = '';
    workshopGenre.value = '';
    workshopResolution.value = '';
  } else {
    wallhavenSorting.value = 'toplist';
    wallhavenAtleast.value = '';
    wallhavenSafe.value = true;
    wallhavenSketchy.value = false;
    wallhavenRatios.value = '';
    wallhavenOrder.value = 'desc';
    wallhavenGeneral.value = true;
    wallhavenAnime.value = true;
    wallhavenPeople.value = false;
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
  workshopDetail.downloadChannel = 'UNKNOWN';
  workshopDetail.downloadAvailable = false;
  workshopDetail.channelMessage = '';
  try {
    const payload = await getWorkshopItemDetail(item.itemId, props.authorizedFetch);
    if (!selected.value || selected.value.key !== item.key) return;
    item.resolution = String(readField(payload, 'resolution', 'resolution', item.resolution)).trim();
    workshopDetail.hasDirectDownload = Boolean(readField(payload, 'hasDirectDownload', 'has_direct_download', false));
    workshopDetail.downloadChannel = String(readField(
      payload,
      'downloadChannel',
      'download_channel',
      workshopDetail.hasDirectDownload ? 'DIRECT' : 'UNKNOWN'
    )).trim().toUpperCase();
    workshopDetail.downloadAvailable = Boolean(readField(
      payload,
      'downloadAvailable',
      'download_available',
      workshopDetail.hasDirectDownload
    ));
    workshopDetail.channelMessage = String(readField(payload, 'channelMessage', 'channel_message', '')).trim();
    if (!workshopDetail.channelMessage && workshopDetail.downloadChannel === 'UNKNOWN') {
      workshopDetail.channelMessage = '需 SteamCMD 通道';
    }
    const detailTitle = String(readField(payload, 'title', 'title', '')).trim();
    if (detailTitle && detailTitle !== item.title) {
      item.title = detailTitle;
      importTitle.value = detailTitle;
    }
  } catch {
    if (!selected.value || selected.value.key !== item.key) return;
    workshopDetail.error = '暂时无法检查，可重试';
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

onMounted(() => {
  syncFilterDisclosureToViewport();
  window.addEventListener('resize', syncFilterDisclosureToViewport, { passive: true });
  runSearch(1);
});
onBeforeUnmount(() => {
  if (nameRetryTimer) window.clearTimeout(nameRetryTimer);
  if (searchDebounceTimer) window.clearTimeout(searchDebounceTimer);
  window.removeEventListener('resize', syncFilterDisclosureToViewport);
  searchSeq += 1;
});

watch(query, () => scheduleSearch(1));

defineExpose({ runSearch, switchSource });
</script>

<style scoped>
.wallpaper-discovery {
  height: 100%;
  min-height: 0;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  --discovery-solid-surface: rgba(36, 28, 38, 0.96);
  display: grid;
  grid-template-columns: minmax(150px, 172px) minmax(0, 1fr) minmax(238px, 292px);
  grid-template-rows: 44px minmax(0, 1fr) 39px;
  grid-template-areas: 'filters toolbar inspector' 'filters gallery inspector' 'filters pager inspector';
  gap: 8px;
}

:global(:root[data-theme-mode='day']) .wallpaper-discovery {
  --discovery-solid-surface: rgba(255, 252, 248, 0.97);
}

.discovery-library {
  display: contents;
}

.discovery-inspector {
  min-height: 0;
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24));
  border-radius: 9px;
  background: var(--discovery-solid-surface);
  overflow: hidden;
}

.discovery-toolbar {
  grid-area: toolbar;
  min-width: 0;
  min-height: 49px;
  padding: 5px 7px;
  border: 1px solid var(--theme-border);
  border-radius: 8px;
  background: var(--discovery-solid-surface);
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
  color-scheme: var(--theme-color-scheme, dark);
  font-size: 11px;
}

.filter-control option,
.inspector-control option {
  background: var(--theme-input-surface);
  color: var(--theme-text-primary);
}

:global(:root[data-theme-mode='day']) .filter-control,
:global(:root[data-theme-mode='day']) .inspector-control {
  color-scheme: light;
}

.resolution-control {
  min-width: 88px;
}

.compact-filter {
  min-width: 92px;
  min-height: 27px;
  border-radius: 6px;
  font-size: 10px;
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
  grid-area: filters;
  min-width: 0;
  min-height: 0;
  padding: 8px;
  border: 1px solid var(--theme-border);
  border-radius: 9px;
  background: var(--discovery-solid-surface);
  display: flex;
  flex-direction: column;
  align-items: stretch;
  flex-wrap: nowrap;
  gap: 7px;
  overflow: auto;
  scrollbar-width: thin;
}

.filter-controls-list { display: contents; }
.filter-disclosure-toggle { display: none; }

.quick-row .result-count,
.filter-row .result-count { margin: 5px 0 0; }

.quick-row .filter-control,
.filter-row .filter-control { width: 100%; min-width: 0; }

.quick-row .quick-chip,
.filter-row .filter-chip,
.filter-row .reset-button { justify-content: flex-start; }

.quick-row .rating-filter-group { flex-wrap: wrap; }

.rating-filter-group {
  min-width: 0;
  margin: 0;
  padding: 0;
  border: 0;
  display: inline-flex;
  align-items: center;
  gap: 5px;
}

.rating-filter-group legend {
  padding: 0;
  color: var(--theme-text-tertiary);
  font-size: 9px;
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
  grid-area: gallery;
  min-height: 0;
  padding: 7px;
  overflow: auto;
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(132px, 1fr));
  align-content: start;
  gap: 6px;
  scrollbar-gutter: stable;
  background: var(--discovery-solid-surface);
}

.discovery-item {
  position: relative;
  min-width: 0;
  padding: 3px;
  border: 1px solid transparent !important;
  border-radius: 6px;
  background: transparent !important;
  color: var(--theme-text-primary) !important;
  display: grid;
  gap: 4px;
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
  aspect-ratio: 1;
  overflow: hidden;
  border: 1px solid var(--theme-border);
  border-radius: 7px;
  background: var(--discovery-solid-surface);
  display: grid;
  place-items: center;
}

.discovery-thumb {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
  transition: none;
}

.discovery-item:hover .discovery-thumb {
  transform: none;
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
  background: var(--theme-surface-elevated);
  color: var(--theme-text-secondary);
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
  position: absolute;
  right: 4px;
  bottom: 4px;
  left: 4px;
  min-width: 0;
  padding: 5px 6px;
  border-radius: 4px;
  background: rgba(18, 14, 18, 0.82);
  color: #fff;
  display: block;
  pointer-events: none;
}

.item-copy strong {
  display: block;
  overflow: hidden;
  font-size: 10px;
  font-weight: 650;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.item-copy small {
  display: none;
}

.resolution-badge {
  position: absolute;
  right: 6px;
  bottom: 34px;
  padding: 3px 5px;
  border-radius: 5px;
  background: rgb(0 0 0 / 70%);
  color: #fff;
  font-size: 10px;
  line-height: 1.3;
}

.resolution-notice {
  color: var(--theme-text-secondary);
  font-size: 12px;
  line-height: 1.6;
}

.discovery-pager {
  grid-area: pager;
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
  grid-area: gallery;
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
  grid-area: inspector;
  grid-row: 1 / 4;
  padding: 10px;
  overflow: auto;
  background: var(--discovery-solid-surface);
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
  background: var(--discovery-solid-surface);
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

.inspector-metadata {
  display: flex;
  flex-wrap: wrap;
  gap: 5px;
}

.inspector-metadata span {
  padding: 4px 7px;
  border: 1px solid var(--theme-border);
  border-radius: 5px;
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  font-size: 9px;
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

.import-progress {
  padding: 8px;
  border: 1px solid var(--accent-mode-border);
  border-radius: 7px;
  background: var(--accent-mode-fill-soft);
  display: grid;
  gap: 7px;
}

.import-progress-head {
  color: var(--theme-text-secondary);
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  font-size: 10px;
}

.import-progress-head strong {
  color: var(--theme-text-primary);
  font-weight: 650;
}

.import-progress-head span {
  color: var(--theme-text-tertiary);
  font-variant-numeric: tabular-nums;
}

.import-progress-track {
  position: relative;
  height: 5px;
  overflow: hidden;
  border-radius: 999px;
  background: var(--theme-surface-soft);
}

.import-progress-fill {
  position: absolute;
  inset: 0 auto 0 0;
  border-radius: inherit;
  background: var(--accent-mode-fill-strong);
  transition: width var(--dur-base) var(--ease-out);
}

.import-progress-fill.indeterminate {
  width: 44%;
  animation: import-progress-scan 1.2s var(--ease-out) infinite alternate;
}

.import-progress.state-success {
  border-color: color-mix(in srgb, var(--theme-positive) 48%, transparent);
}

.import-progress.state-success .import-progress-fill {
  background: var(--theme-positive);
}

.import-progress.state-failed {
  border-color: color-mix(in srgb, var(--theme-danger) 48%, transparent);
}

.import-progress.state-failed .import-progress-fill {
  background: var(--theme-danger);
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

.import-button.retry-action {
  border-color: var(--theme-danger) !important;
  background: var(--theme-surface-soft) !important;
  color: var(--theme-text-primary) !important;
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

@keyframes import-progress-scan {
  from { transform: translateX(-20%); }
  to { transform: translateX(150%); }
}

@media (max-width: 980px) {
  .wallpaper-discovery {
    grid-template-columns: minmax(132px, 150px) minmax(0, 1fr) minmax(210px, 250px);
  }

  .discovery-grid,
  .skeleton-grid {
    grid-template-columns: repeat(auto-fill, minmax(118px, 1fr));
  }

  .resolution-control {
    display: none;
  }
}

@media (max-width: 720px), (orientation: portrait) {
  .wallpaper-discovery {
    height: auto;
    min-height: 100%;
    grid-template-columns: minmax(0, 1fr);
    grid-template-rows: auto auto minmax(36vh, 1fr) auto auto;
    grid-template-areas: 'toolbar' 'filters' 'gallery' 'pager' 'inspector';
  }

  .quick-row,
  .filter-row {
    min-height: 46px;
    max-height: 150px;
    flex-direction: row;
    flex-wrap: wrap;
    align-items: center;
    overflow: auto;
  }

  .filter-disclosure-toggle {
    flex: 0 0 100%;
    width: 100%;
    min-height: 30px;
    padding: 0 8px;
    border: 1px solid var(--theme-border);
    border-radius: 6px;
    background: var(--theme-surface-soft);
    color: var(--theme-text-primary);
    display: flex;
    align-items: center;
    justify-content: space-between;
    text-align: left;
    font-size: 11px;
  }

  .filter-controls-list { display: contents; }
  .filter-controls-list.is-collapsed { display: none; }
  .filter-controls-list:not(.is-collapsed) {
    width: 100%;
    display: flex;
    align-items: center;
    flex-wrap: wrap;
    gap: 6px;
  }

  .discovery-inspector {
    min-height: 350px;
    grid-row: auto;
  }

  .discovery-toolbar {
    min-height: 76px;
    display: grid;
    grid-template-columns: minmax(0, 1fr) auto auto;
    grid-template-rows: 33px 33px;
    align-items: center;
    gap: 5px;
  }

  .discovery-search-field {
    grid-column: 1 / -1;
    min-width: 0;
    width: 100%;
    flex: none;
  }

  .filter-control {
    grid-column: 1;
    width: 100%;
    min-width: 0;
    flex: none;
  }

  .search-button { grid-column: 2; }
  .refresh-button { grid-column: 3; }

  .discovery-grid,
  .skeleton-grid {
    min-height: 36vh;
    max-height: none;
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
  .import-progress-fill.indeterminate,
  .skeleton-preview::after,
  .skeleton-line::after {
    animation: none;
  }

  .import-progress-fill.indeterminate {
    width: 60%;
    transform: none;
  }
}
</style>
