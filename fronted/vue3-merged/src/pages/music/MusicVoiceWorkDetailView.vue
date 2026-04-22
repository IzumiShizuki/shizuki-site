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
        <span>{{ flatTrackTree.length }} 节点</span>
      </header>
      <div v-if="!flatTrackTree.length" class="empty-state compact">暂无轨道结构</div>
      <ul v-else>
        <li
          v-for="node in flatTrackTree"
          :key="node.key"
          :style="{ paddingLeft: `${node.depth * 16 + 6}px` }"
          :class="`node-${node.nodeType}`"
        >
          <span class="node-title">{{ node.title || node.nodeType || '节点' }}</span>
          <span v-if="node.durationSec != null" class="node-duration">{{ formatDuration(node.durationSec) }}</span>
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
  flattenTrackTree(trackTree.value, 0, collector);
  return collector;
});

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
    durationSec: Number.isFinite(Number(source?.durationSec ?? source?.duration_sec))
      ? Number(source.durationSec ?? source.duration_sec)
      : null,
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

function normalizeTrackNode(raw) {
  const source = raw && typeof raw === 'object' ? raw : {};
  const childrenRaw = source?.children;
  return {
    key: `${String(source?.nodeType || source?.node_type || 'node')}:${String(source?.hash || '')}:${String(source?.title || '')}`,
    nodeType: String(source?.nodeType || source?.node_type || '').trim().toLowerCase(),
    title: String(source?.title || '').trim(),
    hash: String(source?.hash || '').trim(),
    durationSec: Number.isFinite(Number(source?.durationSec ?? source?.duration_sec))
      ? Number(source.durationSec ?? source.duration_sec)
      : null,
    children: Array.isArray(childrenRaw) ? childrenRaw.map((item) => normalizeTrackNode(item)) : []
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
    durationSec: Number.isFinite(Number(source?.durationSec ?? source?.duration_sec))
      ? Number(source.durationSec ?? source.duration_sec)
      : null,
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

function flattenTrackTree(nodes, depth, collector) {
  const rows = Array.isArray(nodes) ? nodes : [];
  rows.forEach((node) => {
    collector.push({ ...node, depth });
    if (Array.isArray(node.children) && node.children.length) {
      flattenTrackTree(node.children, depth + 1, collector);
    }
  });
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
      ? (payload.trackTree || payload.track_tree).map((item) => normalizeTrackNode(item))
      : [];
    playableTracks.value = Array.isArray(payload?.playableTracks || payload?.playable_tracks)
      ? (payload.playableTracks || payload.playable_tracks).map((item) => normalizePlayableTrack(item))
      : [];
  } catch (error) {
    work.value = createEmptyWork();
    trackTree.value = [];
    playableTracks.value = [];
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

.voice-hero {
  --liquid-bg: linear-gradient(154deg, rgba(24, 18, 34, 0.84), rgba(16, 14, 26, 0.76));
  --liquid-border: rgba(255, 255, 255, 0.14);
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
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.12);
  color: rgba(232, 241, 255, 0.94);
  align-self: start;
}

.cover {
  width: 170px;
  aspect-ratio: 1 / 1;
  border-radius: 14px;
  background-size: cover;
  background-position: center;
  background-color: rgba(255, 255, 255, 0.08);
}

.hero-main {
  min-width: 0;
  display: grid;
  gap: 8px;
}

.hero-main h1 {
  margin: 0;
  font-size: clamp(20px, 2vw, 30px);
  color: rgba(243, 248, 255, 0.96);
  line-height: 1.3;
}

.hero-type,
.hero-sub,
.hero-meta {
  margin: 0;
  color: rgba(185, 199, 224, 0.9);
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
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(232, 242, 255, 0.95);
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  text-decoration: none;
}

.hero-btn.primary {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: linear-gradient(132deg, rgba(var(--accent-rgb), 0.92), rgba(var(--accent-soft-rgb), 0.88));
  color: rgba(255, 255, 255, 0.96);
}

.voice-meta-panel,
.voice-track-tree,
.voice-playable-panel {
  --liquid-bg: linear-gradient(148deg, rgba(18, 22, 33, 0.84), rgba(13, 16, 26, 0.78));
  --liquid-border: rgba(255, 255, 255, 0.14);
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
  color: rgba(235, 243, 255, 0.95);
}

.voice-meta-panel p {
  margin: 4px 0 0;
  color: rgba(187, 201, 224, 0.9);
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

.voice-track-tree ul {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 4px;
}

.voice-track-tree li {
  min-height: 28px;
  border-radius: 8px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  background: rgba(255, 255, 255, 0.05);
  color: rgba(226, 236, 252, 0.92);
  padding-right: 8px;
}

.node-duration {
  font-size: 12px;
  color: rgba(184, 196, 220, 0.85);
}

.playable-row {
  display: grid;
  grid-template-columns: 44px minmax(0, 1fr) 80px 96px;
  align-items: center;
  gap: 8px;
  min-height: 40px;
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.05);
  padding: 0 8px;
  margin-top: 6px;
  cursor: pointer;
  color: rgba(231, 240, 255, 0.94);
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
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(230, 239, 255, 0.94);
}

.state-text {
  margin: 0;
  font-size: 12px;
  color: rgba(184, 197, 222, 0.9);
}

.state-text.error {
  color: rgba(var(--accent-soft-rgb), 0.98);
}

.empty-state {
  min-height: 90px;
  border: 1px dashed rgba(255, 255, 255, 0.16);
  border-radius: 10px;
  display: grid;
  place-items: center;
  color: rgba(179, 194, 219, 0.86);
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
