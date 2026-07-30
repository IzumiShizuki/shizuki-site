<template>
  <section class="music-center-view voice-home-view">
    <section class="voice-toolbar liquid-material">
      <div class="voice-search-box">
        <i class="fas fa-wave-square"></i>
        <input
          v-model="keywordDraft"
          type="search"
          placeholder="搜索音声作品（留空默认榜单）"
          @keyup.enter="submitSearch"
        />
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

        <button class="toolbar-btn ripple-trigger" type="button" :disabled="loading" @click="submitSearch">
          <i class="fas fa-magnifying-glass"></i>
          查询
        </button>
      </div>
    </section>

    <p v-if="errorText" class="state-text error">{{ errorText }}</p>

    <section class="voice-age-panel liquid-material">
      <header>
        <div>
          <h3>年龄分级</h3>
          <p>默认隐藏 R18，优先显示全年龄与 R15 作品。</p>
        </div>
      </header>
      <div class="age-filter-list" role="group" aria-label="音声年龄分级筛选">
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

    <section v-if="availableTags.length" class="voice-tag-panel liquid-material">
      <header>
        <h3>标签筛选（多选 AND）</h3>
        <button v-if="selectedTagIds.length" class="clear-btn ripple-trigger" type="button" @click="clearTags">清空</button>
      </header>
      <div class="tag-chip-list">
        <button
          v-for="tag in availableTags"
          :key="`tag-${tag.tagId || tag.name}`"
          class="tag-chip ripple-trigger"
          :class="{ active: selectedTagSet.has(tag.tagId) }"
          type="button"
          @click="toggleTag(tag.tagId)"
        >
          {{ tag.name || `Tag ${tag.tagId}` }}
        </button>
      </div>
    </section>

    <section class="voice-card-panel liquid-material">
      <header class="voice-card-header">
        <h2>音声作品</h2>
        <span>{{ works.length }} 条</span>
      </header>

      <div v-if="!works.length && !loading" class="empty-state">暂无匹配作品</div>

      <div class="voice-card-grid">
        <article
          v-for="item in works"
          :key="`voice-work-${item.workId}`"
          class="voice-work-card ripple-trigger"
          @click="openWork(item)"
        >
          <div class="cover" :style="coverStyle(item.cover)">
            <span
              class="voice-age-badge"
              :class="`age-${normalizeVoiceAgeCategory(item.ageCategory, item.nsfw)}`"
            >
              {{ voiceAgeCategoryLabel(item.ageCategory, item.nsfw) }}
            </span>
          </div>
          <div class="meta">
            <p class="title">{{ item.title || '未命名作品' }}</p>
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
        <button v-else class="pager-load-btn ripple-trigger" type="button" @click="loadMore">
          加载更多
        </button>
      </footer>
    </section>
  </section>
</template>

<script setup>
import { computed, onMounted, ref } from 'vue';
import { useRouter } from 'vue-router';
import { useAuthSession } from '../../composables/useAuthSession';
import * as musicApi from '../../services/musicApi';
import { safeCssUrl } from '../../utils/url';
import {
  DEFAULT_VOICE_AGE_FILTER,
  VOICE_AGE_FILTER_OPTIONS,
  normalizeVoiceAgeCategory,
  resolveVoiceAgeFilterCategories,
  voiceAgeCategoryLabel
} from '../../utils/voiceAgeCategory';

const router = useRouter();
const auth = useAuthSession();

const loading = ref(false);
const errorText = ref('');
const works = ref([]);
const availableTags = ref([]);
const hasMore = ref(false);
const page = ref(1);

const keywordDraft = ref('');
const committedKeyword = ref('');
const order = ref('release');
const sort = ref('desc');
const selectedTagIds = ref([]);
const ageFilter = ref(DEFAULT_VOICE_AGE_FILTER);

const PAGE_LIMIT = 24;
const selectedTagSet = computed(() => new Set(selectedTagIds.value));
const selectedAgeCategories = computed(() => resolveVoiceAgeFilterCategories(ageFilter.value));

function normalizeTag(raw) {
  const tagId = Number(raw?.tagId ?? raw?.tag_id ?? 0);
  return {
    tagId: Number.isFinite(tagId) ? tagId : 0,
    name: String(raw?.name || '').trim()
  };
}

function normalizeWork(raw, index = 0) {
  const id = Number(raw?.workId ?? raw?.work_id ?? raw?.id ?? 0);
  return {
    workId: Number.isFinite(id) ? id : index + 1,
    title: String(raw?.title || '').trim(),
    circle: String(raw?.circle || raw?.artist || '').trim(),
    cover: String(raw?.cover || '').trim(),
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
    tags: Array.isArray(raw?.tags) ? raw.tags.map((item) => normalizeTag(item)) : [],
    vas: Array.isArray(raw?.vas) ? raw.vas.map((item) => String(item || '').trim()).filter(Boolean) : []
  };
}

function coverStyle(rawUrl) {
  const url = safeCssUrl(rawUrl);
  return {
    backgroundImage: url ? `url('${url}')` : 'none'
  };
}

function scoreText(value) {
  if (!Number.isFinite(Number(value))) return '-';
  return Number(value).toFixed(1);
}

function renderTags(tags) {
  const list = Array.isArray(tags) ? tags : [];
  if (!list.length) return '无标签';
  return list.slice(0, 4).map((item) => item.name || `Tag ${item.tagId}`).join(' / ');
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
    if (!isAsmrUpstreamTimeout(error)) throw error;
    return musicApi.searchVoiceWorks(requestOptions, authorizedFetch);
  }
}

function normalizeAvailableTags(payload) {
  const list = Array.isArray(payload) ? payload : [];
  const mapById = new Map();
  list.forEach((item) => {
    const normalized = normalizeTag(item);
    if (!normalized.tagId) return;
    if (!mapById.has(normalized.tagId)) {
      mapById.set(normalized.tagId, normalized);
    }
  });
  return [...mapById.values()];
}

async function fetchVoiceWorks(options = {}) {
  const append = Boolean(options?.append);
  const nextPage = append ? page.value + 1 : 1;
  if (append && !hasMore.value) return;

  loading.value = true;
  if (!append) {
    errorText.value = '';
  }
  try {
    const payload = await requestVoiceWorks(
      {
        q: committedKeyword.value,
        page: nextPage,
        limit: PAGE_LIMIT,
        order: order.value,
        sort: sort.value,
        tagIds: selectedTagIds.value,
        ageCategories: selectedAgeCategories.value
      },
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
    const rows = Array.isArray(payload?.items) ? payload.items.map((item, index) => normalizeWork(item, index)) : [];
    works.value = append
      ? [...works.value, ...rows.filter((item) => !works.value.some((old) => old.workId === item.workId))]
      : rows;
    availableTags.value = normalizeAvailableTags(payload?.availableTags || payload?.available_tags);
    hasMore.value = Boolean(payload?.hasMore ?? payload?.has_more);
    page.value = nextPage;
  } catch (error) {
    if (!append) {
      works.value = [];
    }
    errorText.value = parseErrorMessage(error);
  } finally {
    loading.value = false;
  }
}

async function submitSearch() {
  const nextKeyword = String(keywordDraft.value || '').trim();
  if (nextKeyword && nextKeyword !== committedKeyword.value) {
    selectedTagIds.value = [];
  }
  committedKeyword.value = nextKeyword;
  page.value = 1;
  await fetchVoiceWorks({ append: false });
}

async function applySortChange() {
  page.value = 1;
  await fetchVoiceWorks({ append: false });
}

async function applyAgeFilter(filterKey) {
  if (ageFilter.value === filterKey) return;
  ageFilter.value = filterKey;
  page.value = 1;
  await fetchVoiceWorks({ append: false });
}

async function toggleTag(tagId) {
  const id = Number(tagId || 0);
  if (!Number.isFinite(id) || id <= 0) return;
  const next = new Set(selectedTagIds.value);
  if (next.has(id)) next.delete(id);
  else next.add(id);
  selectedTagIds.value = [...next];
  page.value = 1;
  await fetchVoiceWorks({ append: false });
}

async function clearTags() {
  selectedTagIds.value = [];
  page.value = 1;
  await fetchVoiceWorks({ append: false });
}

async function loadMore() {
  await fetchVoiceWorks({ append: true });
}

function openWork(item) {
  if (hasActiveTextSelection()) return;
  const workId = Number(item?.workId || 0);
  if (!Number.isFinite(workId) || workId <= 0) return;
  router.push({
    name: 'music-library-voice-work',
    params: { workId: String(workId) }
  });
}

function hasActiveTextSelection() {
  const selection = globalThis.getSelection?.();
  return Boolean(selection && !selection.isCollapsed && String(selection).trim());
}

onMounted(async () => {
  await submitSearch();
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
  border: 0;
  outline: none;
  background: transparent;
  color: var(--theme-text-primary);
  user-select: text;
  -webkit-user-select: text;
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

.pager-load-btn {
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid rgba(var(--accent-rgb), 0.54);
  background: rgba(var(--accent-rgb), 0.2);
  color: var(--accent-surface-text);
  padding: 0 14px;
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
  color: var(--theme-text-tertiary);
}

@media (max-width: 720px) {
  .voice-card-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}
</style>
