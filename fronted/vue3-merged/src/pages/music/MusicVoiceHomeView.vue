<template>
  <section ref="viewRootRef" class="music-center-view voice-home-view">
    <form class="voice-toolbar liquid-material" role="search" @submit.prevent="submitSearch">
      <div class="voice-search-box">
        <i class="fas fa-wave-square" aria-hidden="true"></i>
        <input
          v-model="keywordDraft"
          type="search"
          aria-label="搜索音声作品"
          maxlength="200"
          placeholder="输入作品名或关键词"
        />
        <button class="toolbar-btn ripple-trigger" type="submit">
          <i class="fas fa-magnifying-glass" aria-hidden="true"></i>
          搜索
        </button>
      </div>

      <div class="voice-toolbar-actions">
        <label>
          <span>排序</span>
          <select v-model="order" @change="applySortChange">
            <option value="release">发布时间</option>
            <option value="dl_count">销量</option>
            <option value="rate_average_2dp">评分</option>
            <option value="review_count">评论数</option>
          </select>
        </label>

        <label>
          <span>方向</span>
          <select v-model="sort" @change="applySortChange">
            <option value="desc">降序</option>
            <option value="asc">升序</option>
          </select>
        </label>

      </div>
    </form>

    <section v-if="committedKeyword || selectedTags.length" class="voice-active-filters" aria-label="已应用筛选">
      <strong>已应用</strong>
      <button v-if="committedKeyword" class="tag-chip active" type="button" @click="clearKeyword">关键词：{{ committedKeyword }} <span aria-hidden="true">×</span></button>
      <button v-for="tag in selectedTags" :key="`selected-${tag.tagId}`" class="tag-chip active" type="button"
        :aria-label="`移除标签 ${voiceTagLabel(tag)}`" @click="toggleTag(tag.tagId)">{{ voiceTagLabel(tag) }} <span aria-hidden="true">×</span></button>
    </section>

    <div v-if="errorText" class="voice-error" role="alert">
      <p class="state-text error">{{ errorText }}</p>
      <button class="toolbar-btn ripple-trigger" type="button" @click="retrySearch">重试</button>
    </div>

    <section class="voice-age-panel liquid-material" :class="{ collapsed: !ageFiltersExpanded }">
      <header>
        <div>
          <h3>年龄分级</h3>
          <p>默认隐藏 R18，优先显示全年龄与 R15 作品。</p>
        </div>
        <button
          class="filter-collapse-btn age-filter-toggle ripple-trigger"
          type="button"
          :aria-expanded="ageFiltersExpanded"
          aria-controls="voice-age-filter-body"
          :title="ageFiltersExpanded ? '收起年龄分级' : '展开年龄分级'"
          :aria-label="ageFiltersExpanded ? '收起年龄分级' : '展开年龄分级'"
          @click="ageFiltersExpanded = !ageFiltersExpanded"
        >
          <i class="fas" :class="ageFiltersExpanded ? 'fa-chevron-up' : 'fa-chevron-down'"></i>
        </button>
      </header>
      <div
        v-show="ageFiltersExpanded"
        id="voice-age-filter-body"
        class="age-filter-list filter-panel-body"
        role="group"
        aria-label="音声年龄分级筛选"
      >
        <button
          v-for="option in VOICE_AGE_FILTER_OPTIONS"
          :key="`age-filter-${option.key}`"
          class="age-filter-chip ripple-trigger"
          :class="[`age-${option.key}`, { active: ageFilter === option.key }]"
          type="button"
          :aria-pressed="ageFilter === option.key"
          :title="option.description"
          @click="applyAgeFilter(option.key)"
        >
          {{ option.label }}
        </button>
      </div>
    </section>

    <section
      v-if="availableTags.length || selectedTags.length"
      class="voice-tag-panel liquid-material"
      :class="{ collapsed: !tagFiltersExpanded }"
    >
      <header>
        <div>
          <h3>标签筛选</h3>
          <p class="state-text">可多选，作品须同时匹配所选标签。标签来自最近一批结果。</p>
        </div>
        <div class="filter-panel-actions">
          <button v-if="selectedTagIds.length" class="clear-btn ripple-trigger" type="button" @click="clearTags">清空</button>
          <button
            class="filter-collapse-btn tag-filter-toggle ripple-trigger"
            type="button"
            :aria-expanded="tagFiltersExpanded"
            aria-controls="voice-tag-filter-body"
            :title="tagFiltersExpanded ? '收起标签筛选' : '展开标签筛选'"
            :aria-label="tagFiltersExpanded ? '收起标签筛选' : '展开标签筛选'"
            @click="tagFiltersExpanded = !tagFiltersExpanded"
          >
            <i class="fas" :class="tagFiltersExpanded ? 'fa-chevron-up' : 'fa-chevron-down'"></i>
          </button>
        </div>
      </header>
      <div v-show="tagFiltersExpanded" id="voice-tag-filter-body" class="filter-panel-body">
        <input v-if="availableTags.length >= 8" v-model.trim="tagKeyword" class="voice-tag-search"
          type="search" aria-label="查找当前结果的标签" placeholder="查找当前结果的标签" />
        <div class="tag-chip-list" role="group" aria-label="当前结果的标签">
        <button
          v-for="tag in visibleTags"
          :key="`tag-${tag.tagId}`"
          class="tag-chip ripple-trigger"
          :class="{ active: selectedTagSet.has(tag.tagId) }"
          type="button"
          :aria-pressed="selectedTagSet.has(tag.tagId)"
          :title="tag.sourceName ? `原始标签：${tag.sourceName}` : undefined"
          :disabled="selectedTagIds.length >= 20 && !selectedTagSet.has(tag.tagId)"
          @click="toggleTag(tag.tagId)"
        >
          {{ voiceTagLabel(tag) }}
        </button>
        <button v-if="matchingTags.length > TAG_PREVIEW_LIMIT" class="clear-btn" type="button" @click="showAllTags = !showAllTags">
          {{ showAllTags ? '显示更少' : `显示全部 ${matchingTags.length} 个标签` }}
        </button>
        </div>
        <p v-if="tagKeyword && !matchingTags.length" class="state-text">当前结果中没有这个标签。</p>
      </div>
    </section>

    <section class="voice-card-panel liquid-material">
      <header class="voice-card-header">
        <h2>音声作品</h2>
        <span role="status">已加载 {{ works.length }} 项</span>
      </header>

      <div v-if="!works.length && !loading && !errorText" class="empty-state">
        <span>暂无匹配作品</span>
        <button v-if="committedKeyword || selectedTagIds.length" class="toolbar-btn" type="button" @click="resetSearch">清除关键词和标签</button>
      </div>

      <div class="voice-card-grid">
        <article
          v-for="item in works"
          :key="`voice-work-${item.workId}`"
          class="voice-work-card ripple-trigger"
          @click="openWork(item)"
        >
          <div class="cover">
            <img v-if="item.cover" :src="item.cover" alt="" loading="lazy" decoding="async">
            <span
              class="voice-age-badge"
              :class="`age-${normalizeVoiceAgeCategory(item.ageCategory, item.nsfw)}`"
            >
              {{ voiceAgeCategoryLabel(item.ageCategory, item.nsfw) }}
            </span>
          </div>
          <div class="meta">
            <p class="title"><RouterLink :to="workLocation(item)" @click.stop="handleTitleClick">{{ item.title || '未命名作品' }}</RouterLink></p>
            <p class="circle">{{ item.circle || '未知社团' }}</p>
            <p class="stats">
              <span>{{ item.releaseDate || '-' }}</span>
              <span>销量 {{ item.dlCount ?? '-' }}</span>
              <span>评分 {{ scoreText(item.rateAverage) }}</span>
            </p>
            <p class="tags">{{ renderTags(item.tags) }}</p>
          </div>
        </article>
      </div>

      <footer class="voice-pager" v-if="loading || hasMore">
        <p v-if="loading" class="pager-text">
          <i class="fas fa-spinner fa-spin"></i>
          加载中...
        </p>
        <button v-else-if="!errorText" class="toolbar-btn ripple-trigger" type="button" @click="loadMore">加载更多</button>
      </footer>
    </section>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, ref } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../../composables/useAuthSession';
import * as musicApi from '../../services/musicApi';
import {
  normalizeVoiceTags, readVoiceCatalogueQuery, resolveVoiceCover, voiceTagId,
  voiceTagLabel, writeVoiceCatalogueQuery
} from '../../utils/voiceCatalogue';
import {
  DEFAULT_VOICE_AGE_FILTER,
  VOICE_AGE_FILTER_OPTIONS,
  normalizeVoiceAgeCategory,
  resolveVoiceAgeFilterCategories,
  voiceAgeCategoryLabel
} from '../../utils/voiceAgeCategory';

const router = useRouter();
const route = useRoute();
const auth = useAuthSession();
const initialSearch = readVoiceCatalogueQuery(route.query);

const loading = ref(false);
const errorText = ref('');
const works = ref([]);
const availableTags = ref([]);
const hasMore = ref(false);
const viewRootRef = ref(null);
const nextAppendPage = ref(3);

const keywordDraft = ref(initialSearch.keyword);
const committedKeyword = ref(initialSearch.keyword);
const order = ref(initialSearch.order);
const sort = ref(initialSearch.sort);
const selectedTagIds = ref(initialSearch.tagIds);
const selectedTagNames = ref(new Map());
const ageFilter = ref(initialSearch.ageFilter || DEFAULT_VOICE_AGE_FILTER);
const ageFiltersExpanded = ref(true);
const tagFiltersExpanded = ref(true);
const tagKeyword = ref('');
const showAllTags = ref(false);

const INITIAL_PAGE_LIMIT = 20;
const APPEND_PAGE_LIMIT = 10;
const FIRST_APPEND_PAGE = Math.floor(INITIAL_PAGE_LIMIT / APPEND_PAGE_LIMIT) + 1;
const AUTO_LOAD_SCROLL_RATIO = 0.75;
const TAG_PREVIEW_LIMIT = 12;
let scrollHost = null;
let activeRequest = null;
let activeRequestKey = '';
let retryAppend = false;
const selectedTagSet = computed(() => new Set(selectedTagIds.value));
const selectedAgeCategories = computed(() => resolveVoiceAgeFilterCategories(ageFilter.value));
const selectedTags = computed(() => selectedTagIds.value.map((tagId) => ({
  tagId, name: selectedTagNames.value.get(tagId)
})));
const matchingTags = computed(() => {
  const q = tagKeyword.value.normalize('NFKC').toLocaleLowerCase();
  const tags = availableTags.value;
  return q ? tags.filter((tag) => [voiceTagLabel(tag), tag.sourceName]
    .some((name) => name?.normalize('NFKC').toLocaleLowerCase().includes(q))) : tags;
});
const visibleTags = computed(() => showAllTags.value
  ? matchingTags.value : matchingTags.value.slice(0, TAG_PREVIEW_LIMIT));

function normalizeWork(raw) {
  const id = voiceTagId(raw?.workId ?? raw?.work_id ?? raw?.id);
  if (!id) return null;
  return {
    workId: id,
    title: String(raw?.title || '').trim(),
    circle: String(raw?.circle || raw?.artist || '').trim(),
    cover: resolveVoiceCover(raw?.cover),
    releaseDate: String(raw?.releaseDate || raw?.release_date || '').trim(),
    durationSec: Number.isFinite(Number(raw?.durationSec ?? raw?.duration_sec))
      ? Number(raw.durationSec ?? raw.duration_sec)
      : null,
    dlCount: Number.isFinite(Number(raw?.dlCount ?? raw?.dl_count)) ? Number(raw.dlCount ?? raw.dl_count) : null,
    reviewCount: Number.isFinite(Number(raw?.reviewCount ?? raw?.review_count))
      ? Number(raw.reviewCount ?? raw.review_count)
      : null,
    rateCount: Number.isFinite(Number(raw?.rateCount ?? raw?.rate_count)) ? Number(raw.rateCount ?? raw.rate_count) : null,
    rateAverage: Number.isFinite(Number(raw?.rateAverage ?? raw?.rate_average))
      ? Number(raw.rateAverage ?? raw.rate_average)
      : null,
    nsfw: Boolean(raw?.nsfw),
    ageCategory: String(raw?.ageCategory || raw?.age_category || '').trim(),
    sourceId: String(raw?.sourceId || raw?.source_id || '').trim(),
    sourceUrl: String(raw?.sourceUrl || raw?.source_url || '').trim(),
    tags: normalizeVoiceTags(raw?.tags),
    vas: Array.isArray(raw?.vas) ? raw.vas.map((item) => String(item || '').trim()).filter(Boolean) : []
  };
}

function scoreText(value) {
  if (value == null || value === '' || !Number.isFinite(Number(value))) return '-';
  return Number(value).toFixed(1);
}

function renderTags(tags) {
  const list = Array.isArray(tags) ? tags : [];
  if (!list.length) return '无标签';
  return list.slice(0, 4).map(voiceTagLabel).join(' · ');
}

function parseErrorMessage(error, fallback = '音声查询失败，请稍后重试') {
  if (typeof error?.detail === 'string' && error.detail.trim()) return error.detail.trim();
  if (typeof error?.message === 'string' && error.message.trim()) return error.message.trim();
  return fallback;
}

function isAsmrUpstreamTimeout(error) {
  const errorCode = String(error?.body?.music_error_code || '').trim().toUpperCase();
  if (errorCode === 'MUSIC_ASMR_UPSTREAM_TIMEOUT') return true;
  return String(error?.detail || error?.message || '').toLowerCase().includes('asmr upstream timeout');
}

async function requestVoiceWorks(requestOptions, authorizedFetch) {
  try {
    return await musicApi.searchVoiceWorks(requestOptions, authorizedFetch);
  } catch (error) {
    if (requestOptions.signal.aborted || !isAsmrUpstreamTimeout(error)) throw error;
    return musicApi.searchVoiceWorks(requestOptions, authorizedFetch);
  }
}

async function fetchVoiceWorks(options = {}) {
  const append = Boolean(options?.append);
  const nextPage = append ? nextAppendPage.value : 1;
  const requestLimit = append ? APPEND_PAGE_LIMIT : INITIAL_PAGE_LIMIT;
  if (append && (loading.value || !hasMore.value)) return;
  const requestKey = JSON.stringify([append, nextPage, committedKeyword.value,
    order.value, sort.value, selectedTagIds.value, selectedAgeCategories.value]);
  if (activeRequest && activeRequestKey === requestKey) return;
  activeRequest?.abort();
  const request = new AbortController();
  activeRequest = request;
  activeRequestKey = requestKey;
  loading.value = true;
  errorText.value = '';
  if (!append) {
    works.value = [];
    hasMore.value = false;
  }
  let requestSucceeded = false;
  try {
    const payload = await requestVoiceWorks(
      {
        q: committedKeyword.value,
        page: nextPage,
        limit: requestLimit,
        order: order.value,
        sort: sort.value,
        tagIds: selectedTagIds.value,
        ageCategories: selectedAgeCategories.value,
        signal: request.signal
      },
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
    if (activeRequest !== request) return;
    const rows = Array.isArray(payload?.items) ? payload.items.map(normalizeWork).filter(Boolean) : [];
    const previousCount = works.value.length;
    const unique = new Map((append ? works.value : []).map((item) => [item.workId, item]));
    for (const row of rows) if (!unique.has(row.workId)) unique.set(row.workId, row);
    works.value = [...unique.values()];
    const incomingTags = payload?.availableTags ?? payload?.available_tags;
    availableTags.value = normalizeVoiceTags(
      [...(append ? availableTags.value : []), ...(Array.isArray(incomingTags) ? incomingTags : [])],
      { requireId: true }
    );
    rememberSelectedTags([...availableTags.value, ...rows.flatMap((row) => row.tags)]);
    hasMore.value = Boolean(payload?.hasMore ?? payload?.has_more);
    nextAppendPage.value = append ? nextPage + 1 : FIRST_APPEND_PAGE;
    requestSucceeded = !append || unique.size > previousCount;
  } catch (error) {
    if (activeRequest !== request) return;
    retryAppend = append;
    errorText.value = parseErrorMessage(error);
  } finally {
    if (activeRequest === request) {
      activeRequest = null;
      activeRequestKey = '';
      loading.value = false;
      if (requestSucceeded) scheduleAutoLoadCheck();
    }
  }
}

function resetPagination() {
  nextAppendPage.value = FIRST_APPEND_PAGE;
}

function hasReachedAutoLoadThreshold() {
  if (!scrollHost || loading.value || !hasMore.value || errorText.value) return false;
  const scrollHeight = Number(scrollHost.scrollHeight || 0);
  const clientHeight = Number(scrollHost.clientHeight || 0);
  if (scrollHeight <= 0 || clientHeight <= 0) return false;
  if (scrollHeight <= clientHeight) return false;
  return (Number(scrollHost.scrollTop || 0) + clientHeight) / scrollHeight >= AUTO_LOAD_SCROLL_RATIO;
}

function handleVoiceScroll() {
  if (hasReachedAutoLoadThreshold()) {
    void loadMore();
  }
}

function scheduleAutoLoadCheck() {
  void nextTick(() => {
    handleVoiceScroll();
  });
}

async function submitSearch() {
  committedKeyword.value = String(keywordDraft.value || '').trim().slice(0, 200);
  await applyFilters();
}

async function applySortChange() {
  await applyFilters();
}

async function applyAgeFilter(filterKey) {
  if (ageFilter.value === filterKey) return;
  ageFilter.value = filterKey;
  availableTags.value = [];
  await applyFilters();
}

async function toggleTag(tagId) {
  const id = voiceTagId(tagId);
  if (!id) return;
  const next = new Set(selectedTagIds.value);
  if (next.has(id)) next.delete(id);
  else if (next.size < 20) next.add(id);
  else return;
  selectedTagIds.value = [...next];
  rememberSelectedTags(availableTags.value);
  await applyFilters();
}

async function clearTags() {
  selectedTagIds.value = [];
  rememberSelectedTags([]);
  await applyFilters();
}

function rememberSelectedTags(tags) {
  const names = new Map(selectedTagIds.value.map((id) => [id, selectedTagNames.value.get(id)]));
  for (const tag of tags) if (names.has(tag.tagId) && tag.name) names.set(tag.tagId, tag.name);
  selectedTagNames.value = names;
}

function catalogueQuery() {
  return writeVoiceCatalogueQuery({
    keyword: committedKeyword.value, order: order.value, sort: sort.value,
    ageFilter: ageFilter.value, tagIds: selectedTagIds.value
  });
}

async function applyFilters() {
  const query = catalogueQuery();
  if (router.resolve({ name: 'music-library-voice', query }).fullPath !== route.fullPath) {
    void router.replace({ name: 'music-library-voice', query });
  }
  resetPagination();
  tagKeyword.value = '';
  showAllTags.value = false;
  if (scrollHost) scrollHost.scrollTop = 0;
  await fetchVoiceWorks();
}

async function clearKeyword() {
  keywordDraft.value = '';
  await submitSearch();
}

async function resetSearch() {
  selectedTagIds.value = [];
  rememberSelectedTags([]);
  await clearKeyword();
}

async function retrySearch() {
  await fetchVoiceWorks({ append: retryAppend });
}

async function loadMore() {
  await fetchVoiceWorks({ append: true });
}

function openWork(item) {
  if (hasActiveTextSelection()) return;
  router.push(workLocation(item));
}

function workLocation(item) {
  return {
    name: 'music-library-voice-work',
    params: { workId: String(item.workId) },
    query: catalogueQuery()
  };
}

function handleTitleClick(event) {
  if (hasActiveTextSelection()) event.preventDefault();
}

function hasActiveTextSelection() {
  const selection = globalThis.getSelection?.();
  return Boolean(selection && !selection.isCollapsed && String(selection).trim());
}

onMounted(async () => {
  scrollHost = viewRootRef.value?.closest('.music-center-pane') || null;
  scrollHost?.addEventListener('scroll', handleVoiceScroll, { passive: true });
  await fetchVoiceWorks();
});

onBeforeUnmount(() => {
  activeRequest?.abort();
  activeRequest = null;
  scrollHost?.removeEventListener('scroll', handleVoiceScroll);
  scrollHost = null;
});
</script>

<style scoped>
.music-center-view {
  display: grid;
  gap: 10px;
}

.voice-home-view {
  --voice-panel-shadow: 0 12px 28px rgba(12, 7, 12, 0.16);
  --voice-card-surface: rgba(255, 240, 235, 0.06);
  --voice-card-surface-hover: rgba(255, 240, 235, 0.1);
  --voice-general-rgb: 108, 184, 139;
  --voice-r15-rgb: 226, 177, 92;
  --voice-adult-rgb: 210, 111, 116;
  align-content: start;
  grid-auto-rows: max-content;
  color: var(--theme-text-primary);
}

:global(:root[data-theme-mode='day']) .voice-home-view {
  --voice-panel-shadow: 0 12px 26px rgba(88, 60, 50, 0.08);
  --voice-card-surface: rgba(255, 255, 255, 0.7);
  --voice-card-surface-hover: rgba(255, 251, 248, 0.96);
  --voice-general-rgb: 57, 132, 88;
  --voice-r15-rgb: 176, 116, 32;
  --voice-adult-rgb: 179, 72, 79;
}

.voice-toolbar {
  --liquid-bg: var(--theme-panel-surface-elevated);
  --liquid-border: var(--theme-border);
  --liquid-shadow: var(--voice-panel-shadow);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 10px;
  align-self: start;
}

.voice-search-box {
  min-height: 36px;
  display: flex;
  align-items: center;
  gap: 8px;
  border-radius: 12px;
  padding: 0 10px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-icon-muted);
}

.voice-search-box input {
  width: 100%;
  min-width: 0;
  border: 0;
  outline: none;
  background: transparent;
  color: var(--theme-text-primary);
  user-select: text;
  -webkit-user-select: text;
}

.voice-search-box .toolbar-btn { flex: none; margin-block: 4px; }
.voice-search-box:focus-within { border-color: var(--accent-mode-border); }

.voice-active-filters, .voice-error {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 6px;
  min-width: 0;
}

.voice-active-filters strong { font-size: 12px; }
.voice-active-filters button { max-width: 100%; overflow-wrap: anywhere; }
.voice-error { justify-content: space-between; }
.voice-tag-search {
  min-height: 36px;
  width: min(100%, 240px);
  margin-bottom: 8px;
  padding-inline: 8px;
  border-radius: 8px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
}

.voice-toolbar-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
  align-items: end;
}

.voice-toolbar-actions label {
  display: grid;
  gap: 4px;
  font-size: 12px;
  color: var(--theme-text-secondary);
}

.voice-toolbar-actions select {
  min-height: 32px;
  border-radius: 10px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
  padding: 0 8px;
}

.toolbar-btn {
  min-height: 32px;
  border-radius: 10px;
  border: 1px solid rgba(var(--accent-rgb), 0.52);
  background: rgba(var(--accent-rgb), 0.2);
  color: var(--accent-surface-text);
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.voice-age-panel,
.voice-tag-panel,
.voice-card-panel {
  --liquid-bg: var(--theme-panel-surface-elevated);
  --liquid-border: var(--theme-border);
  --liquid-shadow: var(--voice-panel-shadow);
  border-radius: 14px;
  padding: 10px;
}

.voice-age-panel header,
.voice-tag-panel header,
.voice-card-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  margin-bottom: 8px;
}

.voice-age-panel.collapsed header,
.voice-tag-panel.collapsed header {
  margin-bottom: 0;
}

.voice-age-panel header {
  align-items: start;
}

.voice-age-panel header p {
  margin: 3px 0 0;
  color: var(--theme-text-tertiary);
  font-size: 12px;
}

.voice-age-panel h3,
.voice-tag-panel h3,
.voice-card-header h2 {
  margin: 0;
  font-size: 14px;
  color: var(--theme-text-primary);
}

.clear-btn {
  min-height: 28px;
  border-radius: 8px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  padding: 0 10px;
}

.filter-panel-actions {
  display: flex;
  align-items: center;
  gap: 6px;
}

.filter-collapse-btn {
  width: 30px;
  height: 30px;
  flex: 0 0 30px;
  border-radius: 8px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  display: inline-grid;
  place-items: center;
}

.filter-collapse-btn:hover {
  border-color: var(--accent-mode-border);
  color: var(--theme-text-primary);
}

.age-filter-list,
.tag-chip-list {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.age-filter-chip,
.tag-chip {
  min-height: 28px;
  border-radius: 999px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  padding: 0 12px;
  font-size: 12px;
}

.age-filter-chip.active {
  box-shadow: inset 0 0 0 1px currentColor;
}

.age-filter-chip.age-safe.active {
  border-color: rgba(var(--voice-general-rgb), 0.58);
  background: linear-gradient(
    110deg,
    rgba(var(--voice-general-rgb), 0.2),
    rgba(var(--voice-r15-rgb), 0.2)
  );
  color: var(--theme-text-primary);
}

.age-filter-chip.age-general.active,
.voice-age-badge.age-general {
  border-color: rgba(var(--voice-general-rgb), 0.58);
  background: rgba(var(--voice-general-rgb), 0.18);
  color: rgb(var(--voice-general-rgb));
}

.age-filter-chip.age-r15.active,
.voice-age-badge.age-r15 {
  border-color: rgba(var(--voice-r15-rgb), 0.6);
  background: rgba(var(--voice-r15-rgb), 0.18);
  color: rgb(var(--voice-r15-rgb));
}

.age-filter-chip.age-adult.active,
.voice-age-badge.age-adult {
  border-color: rgba(var(--voice-adult-rgb), 0.58);
  background: rgba(var(--voice-adult-rgb), 0.17);
  color: rgb(var(--voice-adult-rgb));
}

.age-filter-chip.age-all.active,
.voice-age-badge.age-unknown {
  border-color: var(--theme-border-strong);
  background: var(--theme-surface-strong, var(--theme-surface-soft));
  color: var(--theme-text-secondary);
}

.tag-chip.active {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.26);
  color: var(--accent-surface-text);
}

.voice-card-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(210px, 1fr));
  gap: 10px;
}

.voice-work-card {
  border-radius: 12px;
  border: 1px solid var(--theme-border);
  background: var(--voice-card-surface);
  overflow: hidden;
  cursor: pointer;
  transition: border-color 160ms ease, background 160ms ease, transform 160ms ease;
}

.voice-work-card:hover {
  border-color: var(--accent-mode-border);
  background: var(--voice-card-surface-hover);
  transform: translateY(-1px);
}

.voice-work-card .cover {
  position: relative;
  width: 100%;
  aspect-ratio: 1 / 1;
  background-size: cover;
  background-position: center;
  background-color: var(--theme-surface-soft);
}

.voice-work-card .cover img {
  display: block;
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.voice-work-card .title a { color: inherit; overflow-wrap: anywhere; }
.voice-work-card .title a:focus-visible { outline: 2px solid var(--accent-mode-border); }

.voice-age-badge {
  position: absolute;
  top: 8px;
  right: 8px;
  min-height: 24px;
  border: 1px solid;
  border-radius: 999px;
  padding: 3px 9px;
  display: inline-flex;
  align-items: center;
  background: var(--theme-panel-surface-elevated);
  box-shadow: 0 4px 12px rgba(12, 7, 12, 0.18);
  font-size: 11px;
  font-weight: 700;
  letter-spacing: 0.02em;
  backdrop-filter: blur(10px);
}

.voice-work-card .meta {
  padding: 9px;
  display: grid;
  gap: 6px;
}

.voice-work-card .title {
  margin: 0;
  font-size: 14px;
  color: var(--theme-text-primary);
  line-height: 1.35;
}

.voice-work-card .circle,
.voice-work-card .stats,
.voice-work-card .tags {
  margin: 0;
  font-size: 12px;
  color: var(--theme-text-secondary);
}

.voice-work-card :is(.title, .circle, .stats, .tags, .voice-age-badge) {
  cursor: text;
  user-select: text;
  -webkit-user-select: text;
}

.voice-work-card .stats {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.voice-pager {
  margin-top: 10px;
  display: flex;
  justify-content: center;
}

.pager-sentinel {
  width: 100%;
  height: 12px;
}

.state-text {
  margin: 0;
  font-size: 12px;
  color: var(--theme-text-secondary);
}

.state-text.error {
  color: rgba(var(--accent-soft-rgb), 0.98);
}

.empty-state {
  min-height: 120px;
  border-radius: 10px;
  border: 1px dashed var(--theme-border);
  display: grid;
  place-items: center;
  align-content: center;
  gap: 8px;
  color: var(--theme-text-tertiary);
}

@media (max-width: 720px) {
  .voice-card-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}
</style>
