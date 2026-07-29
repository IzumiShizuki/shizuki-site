<template>
  <section class="music-center-view voice-detail-view">
    <header class="voice-hero liquid-material">
      <button class="back-btn ripple-trigger" type="button" @click="backToVoiceList">
        <i class="fas fa-arrow-left"></i>
      </button>

      <div class="cover" :style="coverStyle"></div>

      <div class="hero-main">
        <p class="hero-type">音声详情</p>
        <h1>{{ work.title || '未命名作品' }}</h1>
        <p class="hero-sub">{{ work.circle || '未知社团' }}</p>
        <p class="hero-meta">
          <span>发布时间 {{ work.releaseDate || '-' }}</span>
          <span>销量 {{ work.dlCount ?? '-' }}</span>
          <span>评分 {{ scoreText(work.rateAverage) }}（{{ work.rateCount ?? 0 }}）</span>
          <span>评论 {{ work.reviewCount ?? 0 }}</span>
          <span v-if="work.ageCategory">分级 {{ work.ageCategory }}</span>
        </p>

        <div class="hero-actions">
          <button class="hero-btn primary ripple-trigger" type="button" :disabled="!playableTracks.length" @click="playAllTracks">
            <i class="fas fa-play"></i>
            播放全部
          </button>
          <button class="hero-btn ripple-trigger" type="button" :disabled="loading" @click="loadBundle">
            <i class="fas fa-rotate-right"></i>
            刷新
          </button>
          <a
            v-if="work.sourceUrl"
            class="hero-btn link ripple-trigger"
            :href="work.sourceUrl"
            target="_blank"
            rel="noopener noreferrer"
          >
            <i class="fas fa-up-right-from-square"></i>
            来源
          </a>
        </div>
      </div>
    </header>

    <p v-if="errorText" class="state-text error">{{ errorText }}</p>

    <section class="voice-meta-panel liquid-material">
      <div>
        <h3>标签</h3>
        <p>{{ renderTagText(work.tags) }}</p>
      </div>
      <div>
        <h3>CV</h3>
        <p>{{ renderActorText(work.vas) }}</p>
      </div>
      <div>
        <h3>语言版本</h3>
        <p>{{ renderLanguageText(work.languageEditions) }}</p>
      </div>
      <div>
        <h3>排行</h3>
        <p>{{ renderRankText(work.rank) }}</p>
      </div>
      <div class="full-row" v-if="work.reviewText">
        <h3>简介</h3>
        <p>{{ work.reviewText }}</p>
      </div>
    </section>

    <section class="voice-track-tree liquid-material">
      <header>
        <h2>音轨树</h2>
        <span>{{ totalTrackNodeCount }} 节点</span>
      </header>
      <div v-if="!flatTrackTree.length" class="empty-state compact">暂无轨道结构</div>
      <ul v-else>
        <li
          v-for="node in flatTrackTree"
          :key="node.key"
          :style="{ '--tree-depth': node.depth, paddingLeft: `${node.depth * 16 + 6}px` }"
          :class="[
            `node-${node.nodeType}`,
            {
              actionable: isFolderTreeNode(node) || isPlayableTreeNode(node) || isViewableFileNode(node),
              'is-nested': node.depth > 0
            }
          ]"
        >
          <button
            v-if="isFolderTreeNode(node)"
            class="tree-node-action tree-node-folder ripple-trigger"
            type="button"
            :disabled="!node.children.length"
            :aria-expanded="isFolderExpanded(node)"
            :aria-label="`${isFolderExpanded(node) ? '收起' : '展开'}目录 ${node.title || '未命名目录'}`"
            @click="toggleFolderNode(node)"
          >
            <span class="folder-leading" aria-hidden="true">
              <i :class="['fas', isFolderExpanded(node) ? 'fa-chevron-down' : 'fa-chevron-right']"></i>
              <i :class="['fas', isFolderExpanded(node) ? 'fa-folder-open' : 'fa-folder']"></i>
            </span>
            <span class="node-title">{{ node.title || '未命名目录' }}</span>
            <span class="folder-count">{{ node.children.length }} 项</span>
          </button>
          <button
            v-else-if="isPlayableTreeNode(node)"
            class="tree-node-action tree-node-play ripple-trigger"
            type="button"
            :aria-label="`播放 ${node.title || '音轨'}`"
            @click="playTreeNode(node)"
          >
            <i class="fas fa-play" aria-hidden="true"></i>
            <span class="node-title">{{ node.title || '未命名音轨' }}</span>
            <span class="node-duration">{{ formatDuration(node.durationSec) }}</span>
          </button>
          <a
            v-else-if="isViewableFileNode(node)"
            class="tree-node-action tree-node-file ripple-trigger"
            :href="resolveTreeNodeResourceUrl(node)"
            target="_blank"
            rel="noopener noreferrer"
            :aria-label="`查看文件 ${node.title || ''}`"
          >
            <i :class="treeNodeIconClass(node)" aria-hidden="true"></i>
            <span class="node-title">{{ node.title || '查看文件' }}</span>
            <span class="node-file-label">查看文件 <i class="fas fa-up-right-from-square" aria-hidden="true"></i></span>
          </a>
          <div v-else class="tree-node-action tree-node-static">
            <i :class="treeNodeIconClass(node)" aria-hidden="true"></i>
            <span class="node-title">{{ node.title || node.nodeType || '节点' }}</span>
            <span v-if="isAudioTreeNode(node)" class="node-duration">{{ formatDuration(node.durationSec) }}</span>
          </div>
        </li>
      </ul>
    </section>

    <section class="voice-playable-panel liquid-material">
      <header>
        <h2>可播放音轨</h2>
        <span>{{ playableTracks.length }} 首</span>
      </header>

      <div v-if="!playableTracks.length" class="empty-state compact">暂无可播放音轨</div>

      <article
        v-for="(item, index) in playableTracks"
        :key="`playable-${item.trackId || index}`"
        class="playable-row ripple-trigger"
        @click="playSingleTrack(index)"
      >
        <span>{{ String(index + 1).padStart(2, '0') }}</span>
        <span class="title-col">{{ item.title || item.path || '未知音轨' }}</span>
        <span>{{ formatDuration(item.durationSec) }}</span>
        <span class="row-actions">
          <button class="track-action-btn ripple-trigger" type="button" title="立即播放" @click.stop="playSingleTrack(index)">
            <i class="fas fa-play"></i>
          </button>
          <button class="track-action-btn ripple-trigger" type="button" title="下一首播放" @click.stop="enqueueSingleTrack(index)">
            <i class="fas fa-forward"></i>
          </button>
        </span>
      </article>
    </section>
  </section>
</template>

<script setup>
import { computed, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../../composables/useAuthSession';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import * as musicApi from '../../services/musicApi';
import { formatMediaTime } from '../../utils/mediaTime';
import { safeCssUrl } from '../../utils/url';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();
const music = useMusicLibraryContext();

const loading = ref(false);
const errorText = ref('');
const work = ref(createEmptyWork());
const trackTree = ref([]);
const playableTracks = ref([]);
const expandedFolderKeys = ref(new Set());

const workId = computed(() => String(route.params.workId || '').trim());
const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const safeCover = safeCssUrl(work.value.cover || fallback);
  return {
    backgroundImage: safeCover ? `url('${safeCover}')` : 'none'
  };
});

const flatTrackTree = computed(() => {
  const collector = [];
  flattenTrackTree(trackTree.value, 0, collector, expandedFolderKeys.value);
  return collector;
});
const totalTrackNodeCount = computed(() => countTrackTreeNodes(trackTree.value));

function createEmptyWork() {
  return {
    workId: 0,
    title: '',
    circle: '',
    cover: '',
    nsfw: false,
    ageCategory: '',
    releaseDate: '',
    durationSec: null,
    dlCount: null,
    reviewCount: null,
    rateCount: null,
    rateAverage: null,
    rank: {},
    tags: [],
    vas: [],
    languageEditions: [],
    sourceId: '',
    sourceUrl: '',
    originalWorkNo: '',
    reviewText: '',
    extra: {}
  };
}

function normalizeTag(raw) {
  const tagId = Number(raw?.tagId ?? raw?.tag_id ?? 0);
  return {
    tagId: Number.isFinite(tagId) ? tagId : 0,
    name: String(raw?.name || '').trim()
  };
}

function normalizeWork(raw) {
  const source = raw && typeof raw === 'object' ? raw : {};
  return {
    workId: Number(source?.workId ?? source?.work_id ?? 0),
    title: String(source?.title || '').trim(),
    circle: String(source?.circle || source?.artist || '').trim(),
    cover: String(source?.cover || '').trim(),
    nsfw: Boolean(source?.nsfw),
    ageCategory: String(source?.ageCategory || source?.age_category || '').trim(),
    releaseDate: String(source?.releaseDate || source?.release_date || '').trim(),
    durationSec: normalizeDurationSec(source?.durationSec ?? source?.duration_sec),
    dlCount: Number.isFinite(Number(source?.dlCount ?? source?.dl_count)) ? Number(source.dlCount ?? source.dl_count) : null,
    reviewCount: Number.isFinite(Number(source?.reviewCount ?? source?.review_count))
      ? Number(source.reviewCount ?? source.review_count)
      : null,
    rateCount: Number.isFinite(Number(source?.rateCount ?? source?.rate_count)) ? Number(source.rateCount ?? source.rate_count) : null,
    rateAverage: Number.isFinite(Number(source?.rateAverage ?? source?.rate_average))
      ? Number(source.rateAverage ?? source.rate_average)
      : null,
    rank: source?.rank && typeof source.rank === 'object' ? source.rank : {},
    tags: Array.isArray(source?.tags) ? source.tags.map((item) => normalizeTag(item)) : [],
    vas: Array.isArray(source?.vas) ? source.vas.map((item) => String(item || '').trim()).filter(Boolean) : [],
    languageEditions: Array.isArray(source?.languageEditions || source?.language_editions)
      ? (source.languageEditions || source.language_editions)
      : [],
    sourceId: String(source?.sourceId || source?.source_id || '').trim(),
    sourceUrl: String(source?.sourceUrl || source?.source_url || '').trim(),
    originalWorkNo: String(source?.originalWorkNo || source?.original_work_no || '').trim(),
    reviewText: String(source?.reviewText || source?.review_text || '').trim(),
    extra: source?.extra && typeof source.extra === 'object' ? source.extra : {}
  };
}

function normalizeTrackNode(raw, parentKey = 'root', index = 0) {
  const source = raw && typeof raw === 'object' ? raw : {};
  const childrenRaw = source?.children;
  const nodeType = String(source?.nodeType || source?.node_type || '').trim().toLowerCase();
  const title = String(source?.title || '').trim();
  const hash = String(source?.hash || '').trim();
  const key = `${parentKey}/${index}:${nodeType || 'node'}:${hash || title || 'untitled'}`;
  return {
    key,
    nodeType,
    title,
    hash,
    mediaStreamUrl: String(source?.mediaStreamUrl || source?.media_stream_url || '').trim(),
    streamLowQualityUrl: String(source?.streamLowQualityUrl || source?.stream_low_quality_url || '').trim(),
    mediaDownloadUrl: String(source?.mediaDownloadUrl || source?.media_download_url || '').trim(),
    durationSec: normalizeDurationSec(source?.durationSec ?? source?.duration_sec),
    children: Array.isArray(childrenRaw)
      ? childrenRaw.map((item, childIndex) => normalizeTrackNode(item, key, childIndex))
      : []
  };
}

function normalizePlayableTrack(raw) {
  const source = raw && typeof raw === 'object' ? raw : {};
  return {
    trackId: String(source?.trackId || source?.track_id || '').trim(),
    hash: String(source?.hash || '').trim(),
    title: String(source?.title || '').trim(),
    path: String(source?.path || '').trim(),
    artist: String(source?.artist || '').trim(),
    cover: String(source?.cover || '').trim(),
    lyricUrl: String(source?.lyricUrl || source?.lyric_url || '').trim(),
    durationSec: normalizeDurationSec(source?.durationSec ?? source?.duration_sec),
    sourceId: String(source?.sourceId || source?.source_id || '').trim(),
    sourceUrl: String(source?.sourceUrl || source?.source_url || '').trim(),
    workTitle: String(source?.workTitle || source?.work_title || '').trim()
  };
}

function parseErrorMessage(error, fallback = '音声详情加载失败，请稍后重试') {
  if (typeof error?.detail === 'string' && error.detail.trim()) return error.detail.trim();
  if (typeof error?.message === 'string' && error.message.trim()) return error.message.trim();
  return fallback;
}

function normalizeDurationSec(value) {
  if (value == null || value === '') return null;
  const duration = Number(value);
  return Number.isFinite(duration) && duration > 0 ? duration : null;
}

function formatDuration(durationSec) {
  const safe = Number(durationSec);
  if (!Number.isFinite(safe) || safe <= 0) return '--:--';
  return formatMediaTime(safe);
}

function scoreText(value) {
  if (!Number.isFinite(Number(value))) return '-';
  return Number(value).toFixed(1);
}

function renderTagText(tags) {
  const list = Array.isArray(tags) ? tags : [];
  if (!list.length) return '无';
  return list.map((item) => item.name || `Tag ${item.tagId}`).join(' / ');
}

function renderActorText(actors) {
  const list = Array.isArray(actors) ? actors : [];
  return list.length ? list.join(' / ') : '无';
}

function renderLanguageText(rows) {
  const list = Array.isArray(rows) ? rows : [];
  if (!list.length) return '无';
  const tokens = list
    .map((item) => {
      const source = item && typeof item === 'object' ? item : {};
      const code = String(source?.lang || source?.locale || source?.language || '').trim();
      const title = String(source?.title || source?.name || '').trim();
      return [code, title].filter(Boolean).join(': ');
    })
    .filter(Boolean);
  return tokens.length ? tokens.join(' / ') : '无';
}

function renderRankText(rank) {
  if (!rank || typeof rank !== 'object' || !Object.keys(rank).length) return '无';
  const labels = Object.entries(rank)
    .map(([key, value]) => `${key}=${value}`)
    .slice(0, 4);
  return labels.join(' / ');
}

function countTrackTreeNodes(nodes) {
  const rows = Array.isArray(nodes) ? nodes : [];
  return rows.reduce((total, node) => total + 1 + countTrackTreeNodes(node?.children), 0);
}

function collectFolderKeys(nodes, collector = new Set()) {
  const rows = Array.isArray(nodes) ? nodes : [];
  rows.forEach((node) => {
    if (isFolderTreeNode(node) && node?.children?.length) {
      collector.add(node.key);
    }
    collectFolderKeys(node?.children, collector);
  });
  return collector;
}

function flattenTrackTree(nodes, depth, collector, expandedKeys) {
  const rows = Array.isArray(nodes) ? nodes : [];
  rows.forEach((node) => {
    collector.push({ ...node, depth });
    const canShowChildren = !isFolderTreeNode(node) || expandedKeys.has(node.key);
    if (canShowChildren && Array.isArray(node.children) && node.children.length) {
      flattenTrackTree(node.children, depth + 1, collector, expandedKeys);
    }
  });
}

function isFolderTreeNode(node) {
  return String(node?.nodeType || '').toLowerCase() === 'folder';
}

function isFolderExpanded(node) {
  return Boolean(node?.children?.length && expandedFolderKeys.value.has(node?.key));
}

function toggleFolderNode(node) {
  if (!isFolderTreeNode(node) || !node?.children?.length) return;
  const next = new Set(expandedFolderKeys.value);
  if (next.has(node.key)) {
    next.delete(node.key);
  } else {
    next.add(node.key);
  }
  expandedFolderKeys.value = next;
}

function isAudioTreeNode(node) {
  return String(node?.nodeType || '').toLowerCase() === 'audio';
}

function treeNodeIconClass(node) {
  const nodeType = String(node?.nodeType || '').toLowerCase();
  const title = String(node?.title || '').toLowerCase();
  if (nodeType === 'image' || /\.(avif|gif|jpe?g|png|webp)$/i.test(title)) {
    return 'fas fa-file-image';
  }
  if (nodeType === 'audio') {
    return 'fas fa-file-audio';
  }
  return 'fas fa-file-lines';
}

function resolvePlayableTreeNodeIndex(node) {
  const hash = String(node?.hash || '').trim();
  if (hash) {
    const hashIndex = playableTracks.value.findIndex((item) => String(item?.hash || '').trim() === hash);
    if (hashIndex >= 0) return hashIndex;
  }
  const title = String(node?.title || '').trim();
  if (!title) return -1;
  return playableTracks.value.findIndex((item) => {
    const itemTitle = String(item?.title || '').trim();
    const itemPath = String(item?.path || '').trim();
    return itemTitle === title || itemPath === title || itemPath.endsWith(`/${title}`);
  });
}

function isPlayableTreeNode(node) {
  return String(node?.nodeType || '').toLowerCase() === 'audio' && resolvePlayableTreeNodeIndex(node) >= 0;
}

function resolveTreeNodeResourceUrl(node) {
  return String(node?.mediaDownloadUrl || node?.mediaStreamUrl || node?.streamLowQualityUrl || '').trim();
}

function isViewableFileNode(node) {
  const nodeType = String(node?.nodeType || '').toLowerCase();
  return ['image', 'file'].includes(nodeType) && Boolean(resolveTreeNodeResourceUrl(node));
}

async function playTreeNode(node) {
  const index = resolvePlayableTreeNodeIndex(node);
  if (index < 0) return;
  await playSingleTrack(index);
}

function toPlayerTrack(item, index = 0) {
  const trackId = String(item?.trackId || '').trim();
  return {
    id: trackId || `asmr-voice-${index + 1}`,
    trackId: trackId || `asmr-voice-${index + 1}`,
    provider: 'asmr',
    title: String(item?.title || item?.path || `音轨 ${index + 1}`).trim(),
    artist: String(item?.artist || work.value.circle || '').trim(),
    cover: String(item?.cover || work.value.cover || '').trim(),
    audio: '',
    lyric: String(item?.lyricUrl || '').trim(),
    durationSec: Number.isFinite(Number(item?.durationSec)) ? Number(item.durationSec) : null,
    durationLabel: formatDuration(item?.durationSec),
    metadata: {
      workId: work.value.workId,
      sourceId: item?.sourceId || work.value.sourceId,
      sourceUrl: item?.sourceUrl || work.value.sourceUrl,
      hash: item?.hash || '',
      path: item?.path || '',
      sourceScene: 'asmr_voice'
    }
  };
}

async function playAllTracks() {
  if (!playableTracks.value.length) return;
  const queue = playableTracks.value.map((item, index) => toPlayerTrack(item, index));
  const ok = await music.player.replaceQueueWithTracks?.(
    queue,
    0,
    true,
    {
      sourceType: 'voice-work',
      sourceCode: String(work.value.workId || '')
    }
  );
  if (!ok) {
    window.alert('当前音轨暂不可播放');
  }
}

async function playSingleTrack(index) {
  const safeIndex = Number(index);
  if (!Number.isInteger(safeIndex) || safeIndex < 0 || safeIndex >= playableTracks.value.length) return;
  const queue = playableTracks.value.map((item, rowIndex) => toPlayerTrack(item, rowIndex));
  const ok = await music.player.replaceQueueWithTracks?.(
    queue,
    safeIndex,
    true,
    {
      sourceType: 'voice-work',
      sourceCode: String(work.value.workId || '')
    }
  );
  if (!ok) {
    window.alert('当前音轨暂不可播放');
  }
}

async function enqueueSingleTrack(index) {
  const safeIndex = Number(index);
  if (!Number.isInteger(safeIndex) || safeIndex < 0 || safeIndex >= playableTracks.value.length) return;
  const ok = await music.player.enqueueNextTrack?.(toPlayerTrack(playableTracks.value[safeIndex], safeIndex));
  if (!ok) {
    window.alert('当前音轨暂不可加入“下一首播放”');
  }
}

async function loadBundle() {
  const code = workId.value;
  if (!code) {
    errorText.value = '缺少 workId';
    return;
  }
  loading.value = true;
  errorText.value = '';
  try {
    const payload = await musicApi.getVoiceWorkBundle(
      code,
      auth.isAuthenticated.value ? auth.authorizedFetch : undefined
    );
    work.value = normalizeWork(payload?.work || {});
    trackTree.value = Array.isArray(payload?.trackTree || payload?.track_tree)
      ? (payload.trackTree || payload.track_tree).map((item, index) => normalizeTrackNode(item, 'root', index))
      : [];
    expandedFolderKeys.value = collectFolderKeys(trackTree.value);
    playableTracks.value = Array.isArray(payload?.playableTracks || payload?.playable_tracks)
      ? (payload.playableTracks || payload.playable_tracks).map((item) => normalizePlayableTrack(item))
      : [];
  } catch (error) {
    work.value = createEmptyWork();
    trackTree.value = [];
    playableTracks.value = [];
    expandedFolderKeys.value = new Set();
    errorText.value = parseErrorMessage(error);
  } finally {
    loading.value = false;
  }
}

function backToVoiceList() {
  router.push({ name: 'music-library-voice' });
}

watch(
  () => workId.value,
  async () => {
    await loadBundle();
  },
  { immediate: true }
);
</script>

<style scoped>
.music-center-view {
  display: grid;
  gap: 10px;
}

.voice-detail-view {
  --voice-row-surface: rgba(255, 240, 235, 0.07);
  --voice-row-surface-strong: rgba(255, 240, 235, 0.11);
  --voice-folder-surface: rgba(var(--accent-rgb), 0.1);
  --voice-tree-guide: rgba(240, 212, 208, 0.2);
  --voice-panel-shadow: 0 12px 28px rgba(12, 7, 12, 0.16);
  color: var(--theme-text-primary);
}

:global(:root[data-theme-mode='day']) .voice-detail-view {
  --voice-row-surface: rgba(255, 255, 255, 0.72);
  --voice-row-surface-strong: rgba(255, 251, 248, 0.92);
  --voice-folder-surface: rgba(var(--accent-rgb), 0.13);
  --voice-tree-guide: rgba(168, 108, 108, 0.2);
  --voice-panel-shadow: 0 12px 26px rgba(88, 60, 50, 0.08);
}

.voice-hero {
  --liquid-bg: var(--theme-panel-surface-elevated);
  --liquid-border: var(--theme-border);
  --liquid-shadow: var(--voice-panel-shadow);
  border-radius: 16px;
  padding: 12px;
  display: grid;
  grid-template-columns: auto 170px minmax(0, 1fr);
  gap: 12px;
  align-items: center;
}

.back-btn {
  width: 36px;
  height: 36px;
  border-radius: 10px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-icon-primary);
  align-self: start;
}

.cover {
  width: 170px;
  aspect-ratio: 1 / 1;
  border-radius: 14px;
  background-size: cover;
  background-position: center;
  background-color: var(--theme-surface-soft);
  box-shadow: 0 0 0 1px var(--theme-border);
}

.hero-main {
  min-width: 0;
  display: grid;
  gap: 8px;
}

.hero-main h1 {
  margin: 0;
  font-size: clamp(20px, 2vw, 30px);
  color: var(--theme-text-primary);
  line-height: 1.3;
}

.hero-type,
.hero-sub,
.hero-meta {
  margin: 0;
  color: var(--theme-text-secondary);
}

.hero-type {
  font-size: 12px;
  text-transform: uppercase;
  letter-spacing: 0.08em;
}

.hero-meta {
  display: flex;
  flex-wrap: wrap;
  gap: 10px;
  font-size: 12px;
}

.hero-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.hero-btn {
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  text-decoration: none;
}

.hero-btn.primary {
  border-color: var(--accent-mode-border-strong);
  background: var(--accent-mode-fill-strong);
  color: var(--accent-surface-text);
}

.voice-meta-panel,
.voice-track-tree,
.voice-playable-panel {
  --liquid-bg: var(--theme-panel-surface-elevated);
  --liquid-border: var(--theme-border);
  --liquid-shadow: var(--voice-panel-shadow);
  border-radius: 14px;
  padding: 10px;
}

.voice-meta-panel {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.voice-meta-panel .full-row {
  grid-column: 1 / -1;
}

.voice-meta-panel h3,
.voice-track-tree h2,
.voice-playable-panel h2 {
  margin: 0;
  font-size: 14px;
  color: var(--theme-text-primary);
}

.voice-meta-panel p {
  margin: 4px 0 0;
  color: var(--theme-text-secondary);
  font-size: 12px;
  line-height: 1.5;
  white-space: pre-wrap;
}

.voice-track-tree header,
.voice-playable-panel header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-bottom: 8px;
}

.voice-track-tree header > span,
.voice-playable-panel header > span {
  color: var(--theme-text-tertiary);
  font-size: 12px;
}

.voice-track-tree ul {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 4px;
}

.voice-track-tree li {
  position: relative;
  min-height: 34px;
  border: 1px solid var(--theme-border);
  border-radius: 9px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  background: var(--voice-row-surface);
  color: var(--theme-text-primary);
  padding-right: 8px;
}

.voice-track-tree li.is-nested::before {
  position: absolute;
  top: -5px;
  bottom: -5px;
  left: calc(var(--tree-depth) * 16px - 5px);
  width: 1px;
  background: var(--voice-tree-guide);
  content: '';
  pointer-events: none;
}

.voice-track-tree li.actionable {
  padding-right: 0;
  background: var(--voice-row-surface-strong);
}

.voice-track-tree li.node-folder {
  border-color: rgba(var(--accent-strong-rgb), 0.24);
  background: var(--voice-folder-surface);
}

.tree-node-action {
  width: 100%;
  min-width: 0;
  min-height: 30px;
  padding: 0 8px;
  border: 1px solid transparent;
  border-radius: 8px;
  background: transparent;
  color: inherit;
  display: grid;
  grid-template-columns: 18px minmax(0, 1fr) auto;
  align-items: center;
  gap: 7px;
  text-align: left;
  text-decoration: none;
  cursor: pointer;
}

.tree-node-action:hover,
.tree-node-action:focus-visible {
  border-color: var(--accent-mode-border);
  background: rgba(var(--accent-rgb), 0.12);
  outline: none;
  box-shadow: var(--accent-mode-focus-ring);
}

.tree-node-action > i {
  color: var(--theme-icon-muted);
  font-size: 11px;
}

.tree-node-folder {
  grid-template-columns: 34px minmax(0, 1fr) auto;
  font-weight: 650;
}

.tree-node-folder:disabled {
  cursor: default;
  opacity: 0.72;
}

.folder-leading {
  display: grid;
  grid-template-columns: 10px 16px;
  align-items: center;
  gap: 5px;
  color: rgba(var(--accent-readable-rgb), 0.92);
}

.folder-leading .fa-chevron-down,
.folder-leading .fa-chevron-right {
  font-size: 9px;
}

.folder-leading .fa-folder,
.folder-leading .fa-folder-open {
  font-size: 14px;
}

.node-title {
  min-width: 0;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.node-file-label {
  color: var(--theme-text-tertiary);
  font-size: 11px;
  white-space: nowrap;
}

.node-duration {
  font-size: 12px;
  color: var(--theme-text-tertiary);
  font-variant-numeric: tabular-nums;
}

.folder-count {
  color: var(--theme-text-tertiary);
  font-size: 11px;
  font-weight: 500;
  white-space: nowrap;
}

.tree-node-static {
  cursor: default;
}

.playable-row {
  display: grid;
  grid-template-columns: 44px minmax(0, 1fr) 80px 96px;
  align-items: center;
  gap: 8px;
  min-height: 40px;
  border-radius: 10px;
  border: 1px solid var(--theme-border);
  background: var(--voice-row-surface);
  padding: 0 8px;
  margin-top: 6px;
  cursor: pointer;
  color: var(--theme-text-primary);
}

.row-actions {
  display: inline-flex;
  justify-content: flex-end;
  gap: 6px;
}

.track-action-btn {
  width: 28px;
  height: 28px;
  border-radius: 8px;
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-icon-primary);
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
  min-height: 90px;
  border: 1px dashed var(--theme-border);
  border-radius: 10px;
  display: grid;
  place-items: center;
  color: var(--theme-text-tertiary);
}

.empty-state.compact {
  min-height: 72px;
}

@media (max-width: 960px) {
  .voice-hero {
    grid-template-columns: auto minmax(0, 1fr);
  }

  .cover {
    grid-column: 1 / -1;
    width: 180px;
  }

  .voice-meta-panel {
    grid-template-columns: minmax(0, 1fr);
  }

  .playable-row {
    grid-template-columns: 40px minmax(0, 1fr) 76px 92px;
  }
}
</style>
