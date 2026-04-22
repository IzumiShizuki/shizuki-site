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
          <div class="cover" :style="coverStyle(item.cover)"></div>
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

const PAGE_LIMIT = 24;
const selectedTagSet = computed(() => new Set(selectedTagIds.value));

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
    const payload = await musicApi.searchVoiceWorks(
      {
        q: committedKeyword.value,
        page: nextPage,
        limit: PAGE_LIMIT,
        order: order.value,
        sort: sort.value,
        tagIds: selectedTagIds.value
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
  committedKeyword.value = String(keywordDraft.value || '').trim();
  page.value = 1;
  await fetchVoiceWorks({ append: false });
}

async function applySortChange() {
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
  const workId = Number(item?.workId || 0);
  if (!Number.isFinite(workId) || workId <= 0) return;
  router.push({
    name: 'music-library-voice-work',
    params: { workId: String(workId) }
  });
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

.voice-toolbar {
  --liquid-bg: linear-gradient(150deg, rgba(26, 20, 35, 0.84), rgba(18, 15, 26, 0.76));
  --liquid-border: rgba(255, 255, 255, 0.14);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 10px;
}

.voice-search-box {
  min-height: 36px;
  display: flex;
  align-items: center;
  gap: 8px;
  border-radius: 12px;
  padding: 0 10px;
  border: 1px solid rgba(255, 255, 255, 0.15);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(226, 233, 246, 0.88);
}

.voice-search-box input {
  width: 100%;
  border: 0;
  outline: none;
  background: transparent;
  color: rgba(236, 242, 255, 0.95);
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
  color: rgba(188, 201, 222, 0.88);
}

.voice-toolbar-actions select {
  min-height: 32px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(19, 23, 34, 0.82);
  color: rgba(234, 240, 253, 0.94);
  padding: 0 8px;
}

.toolbar-btn {
  min-height: 32px;
  border-radius: 10px;
  border: 1px solid rgba(var(--accent-rgb), 0.52);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(var(--accent-soft-rgb), 0.96);
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.voice-tag-panel,
.voice-card-panel {
  --liquid-bg: linear-gradient(148deg, rgba(18, 22, 33, 0.84), rgba(13, 16, 26, 0.78));
  --liquid-border: rgba(255, 255, 255, 0.14);
  border-radius: 14px;
  padding: 10px;
}

.voice-tag-panel header,
.voice-card-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  margin-bottom: 8px;
}

.voice-tag-panel h3,
.voice-card-header h2 {
  margin: 0;
  font-size: 14px;
  color: rgba(236, 243, 255, 0.94);
}

.clear-btn {
  min-height: 28px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(214, 226, 247, 0.9);
  padding: 0 10px;
}

.tag-chip-list {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.tag-chip {
  min-height: 28px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.06);
  color: rgba(218, 229, 248, 0.9);
  padding: 0 12px;
  font-size: 12px;
}

.tag-chip.active {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.26);
  color: rgba(255, 255, 255, 0.96);
}

.voice-card-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(210px, 1fr));
  gap: 10px;
}

.voice-work-card {
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background: rgba(255, 255, 255, 0.05);
  overflow: hidden;
  cursor: pointer;
}

.voice-work-card .cover {
  width: 100%;
  aspect-ratio: 1 / 1;
  background-size: cover;
  background-position: center;
  background-color: rgba(255, 255, 255, 0.06);
}

.voice-work-card .meta {
  padding: 9px;
  display: grid;
  gap: 6px;
}

.voice-work-card .title {
  margin: 0;
  font-size: 14px;
  color: rgba(236, 243, 255, 0.96);
  line-height: 1.35;
}

.voice-work-card .circle,
.voice-work-card .stats,
.voice-work-card .tags {
  margin: 0;
  font-size: 12px;
  color: rgba(183, 198, 223, 0.86);
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
  color: rgba(var(--accent-soft-rgb), 0.96);
  padding: 0 14px;
}

.state-text {
  margin: 0;
  font-size: 12px;
  color: rgba(187, 199, 222, 0.9);
}

.state-text.error {
  color: rgba(var(--accent-soft-rgb), 0.98);
}

.empty-state {
  min-height: 120px;
  border-radius: 10px;
  border: 1px dashed rgba(255, 255, 255, 0.16);
  display: grid;
  place-items: center;
  color: rgba(178, 192, 218, 0.86);
}

@media (max-width: 720px) {
  .voice-card-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}
</style>
