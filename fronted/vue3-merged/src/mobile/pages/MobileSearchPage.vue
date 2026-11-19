<template>
  <div class="m-search-page">
    <form class="search-head" role="search" @submit.prevent="submitSearch()">
      <div class="search-box m-card">
        <i class="fa-solid fa-magnifying-glass" aria-hidden="true"></i>
        <input
          ref="inputRef"
          v-model="keyword"
          class="search-input"
          type="search"
          enterkeyhint="search"
          placeholder="搜索歌曲、歌单、歌手"
          aria-label="搜索歌曲、歌单或歌手"
          @keydown.enter="guardComposition"
        />
        <button v-if="keyword" type="button" class="clear-btn" aria-label="清空" @click="clearKeyword">
          <i class="fa-solid fa-circle-xmark" aria-hidden="true"></i>
        </button>
      </div>
      <button type="submit" class="search-go m-press" :disabled="!keyword.trim()">
        搜索
      </button>
    </form>

    <section v-if="!hasSearched" class="search-idle">
      <template v-if="historyItems.length">
        <div class="m-section-head">
          <h2 class="m-section-title">搜索历史</h2>
          <button type="button" class="history-clear" @click="clearHistory">清空</button>
        </div>
        <div class="history-chips">
          <button
            v-for="item in historyItems"
            :key="item"
            type="button"
            class="m-chip m-press"
            @click="submitSearch(item)"
          >
            {{ item }}
          </button>
        </div>
      </template>
      <div v-else class="m-empty">
        <i class="fa-solid fa-compact-disc" aria-hidden="true"></i>
        <span>输入关键词，跨源搜索音乐</span>
      </div>
    </section>

    <section v-else :aria-busy="searching" aria-label="搜索结果">
      <p class="result-context" role="status">{{ searching ? '正在搜索' : '搜索：' }}「{{ result.query }}」</p>
      <div v-if="searching" class="search-skeletons" aria-hidden="true">
        <div v-for="n in 6" :key="n" class="m-skeleton skeleton-row"></div>
      </div>

      <div v-else-if="searchError" class="m-empty" role="alert">
        <i class="fa-solid fa-cloud-bolt" aria-hidden="true"></i>
        <span>{{ searchError }}</span>
        <button type="button" class="m-btn-ghost" @click="runSearch(result.query)">重试</button>
      </div>

      <template v-else>
        <p v-if="result.partial" class="partial-hint">
          <i class="fa-solid fa-triangle-exclamation" aria-hidden="true"></i>
          部分音源暂时不可用，结果可能不完整
        </p>

        <section v-if="result.tracks.length" class="result-group">
          <div class="m-section-head">
            <h2 class="m-section-title">歌曲</h2>
            <span class="m-section-caption">Tracks</span>
          </div>
          <div class="m-card result-tracks">
            <MobileTrackRow
              v-for="(item, idx) in result.tracks"
              :key="`${item.provider}:${item.id}`"
              :track="item"
              :index="idx"
              :is-current="currentTrackId === item.id"
              :is-playing="player.isPlaying.value"
              @play="playSearchTrack(item)"
              @menu="menuTrack = item"
            />
          </div>
        </section>

        <section v-if="result.playlists.length" class="result-group">
          <div class="m-section-head">
            <h2 class="m-section-title">歌单</h2>
            <span class="m-section-caption">Playlists</span>
          </div>
          <div class="result-playlists">
            <button
              v-for="item in result.playlists"
              :key="`${item.provider}:${item.playlistCode || item.id || item.name}`"
              type="button"
              class="playlist-row m-card m-press"
              :disabled="!item.playlistCode"
              @click="openSearchPlaylist(item)"
            >
              <div class="pl-cover">
                <img v-if="item.cover" :src="item.cover" alt="" loading="lazy" />
                <div v-else class="pl-fallback"><i class="fa-solid fa-music" aria-hidden="true"></i></div>
              </div>
              <div class="pl-main">
                <p class="pl-name">{{ item.name }}</p>
                <p class="pl-sub">{{ item.trackCount ? `${item.trackCount} 首` : '歌单' }}</p>
              </div>
              <i class="fa-solid fa-chevron-right pl-arrow" aria-hidden="true"></i>
            </button>
          </div>
        </section>

        <section v-if="result.artists.length" class="result-group">
          <div class="m-section-head">
            <h2 class="m-section-title">歌手</h2>
            <span class="m-section-caption">Artists</span>
          </div>
          <div class="artist-chips">
            <button
              v-for="item in result.artists"
              :key="item.name"
              type="button"
              class="m-chip m-press"
              @click="submitSearch(item.name)"
            >
              {{ item.name }}
            </button>
          </div>
        </section>

        <div v-if="!result.tracks.length && !result.playlists.length && !result.artists.length" class="m-empty">
          <i class="fa-solid fa-ghost" aria-hidden="true"></i>
          <span>没找到「{{ result.query }}」的相关内容。试试换个歌名或歌手。</span>
        </div>
      </template>
    </section>

    <MobileSheet :visible="Boolean(menuTrack)" :title="menuTrack?.title || ''" @close="menuTrack = null">
      <div class="menu-actions">
        <button type="button" class="menu-item m-press" @click="menuPlayNow">
          <i class="fa-solid fa-play" aria-hidden="true"></i>
          立即播放
        </button>
        <button type="button" class="menu-item m-press" @click="menuPlayNext">
          <i class="fa-solid fa-forward" aria-hidden="true"></i>
          下一首播放
        </button>
      </div>
    </MobileSheet>
  </div>
</template>

<script setup>
import { computed, onUnmounted, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { searchMusic } from '../../services/musicApi';
import { formatMediaTime } from '../../utils/mediaTime';
import MobileSheet from '../components/MobileSheet.vue';
import MobileTrackRow from '../components/MobileTrackRow.vue';
import { useMobileShell } from '../mobileShellContext';

const HISTORY_KEY = 'shizuki.mobile.searchHistory.v1';
const HISTORY_LIMIT = 10;

const route = useRoute();
const router = useRouter();
const shell = useMobileShell();
const { auth, player, showToast } = shell;

const inputRef = ref(null);
const keyword = ref('');
const searching = ref(false);
const hasSearched = ref(false);
const searchError = ref('');
const menuTrack = ref(null);
const historyItems = ref(readHistory());
let requestSequence = 0;
let searchController = null;
const result = ref(createEmptyResult());

const currentTrackId = computed(() => player.currentTrack.value?.id || '');

function createEmptyResult(query = '') {
  return { query, partial: false, tracks: [], playlists: [], artists: [] };
}

function readHistory() {
  try {
    const parsed = JSON.parse(window.localStorage.getItem(HISTORY_KEY) || '[]');
    return Array.isArray(parsed) ? parsed.map((item) => String(item || '').trim()).filter(Boolean) : [];
  } catch {
    return [];
  }
}

function writeHistory(items) {
  try {
    window.localStorage.setItem(HISTORY_KEY, JSON.stringify(items.slice(0, HISTORY_LIMIT)));
  } catch {
    // ignore
  }
}

function pushHistory(term) {
  const next = [term, ...historyItems.value.filter((item) => item !== term)].slice(0, HISTORY_LIMIT);
  historyItems.value = next;
  writeHistory(next);
}

function clearHistory() {
  historyItems.value = [];
  writeHistory([]);
}

function resetResults() {
  requestSequence += 1;
  searchController?.abort();
  searchController = null;
  searching.value = false;
  hasSearched.value = false;
  searchError.value = '';
  menuTrack.value = null;
  result.value = createEmptyResult();
}

function clearKeyword() {
  keyword.value = '';
  resetResults();
  if ('q' in route.query) {
    const query = { ...route.query };
    delete query.q;
    router.replace({ query });
  }
  inputRef.value?.focus();
}

function guardComposition(event) {
  if (event.isComposing || event.keyCode === 229) event.preventDefault();
}

function normalizeTrack(raw, index) {
  const trackId = String(raw?.trackId || raw?.track_id || raw?.id || `search-${index + 1}`).trim();
  const durationSec = Number(raw?.durationSec ?? raw?.duration_sec);
  const durationLabel = String(raw?.durationLabel || raw?.duration_label || raw?.duration || '').trim()
    || (Number.isFinite(durationSec) && durationSec > 0 ? formatMediaTime(durationSec, { fallback: '--:--' }) : '--:--');
  return {
    id: trackId,
    trackId,
    provider: String(raw?.provider || raw?.providerCode || raw?.provider_code || 'local').trim().toLowerCase(),
    title: String(raw?.title || '').trim() || '未知标题',
    artist: String(raw?.artist || '').trim() || '未知歌手',
    album: String(raw?.album || '').trim(),
    cover: String(raw?.cover || raw?.coverUrl || raw?.cover_url || '').trim(),
    audio: String(raw?.audio || raw?.audioUrl || raw?.audio_url || '').trim(),
    lyric: String(raw?.lyric || raw?.lyricUrl || raw?.lyric_url || '').trim(),
    lyricText: String(raw?.lyricText || raw?.lyric_text || '').trim(),
    durationSec: Number.isFinite(durationSec) ? durationSec : null,
    durationLabel,
    duration: durationLabel,
    metadata: raw?.metadata && typeof raw.metadata === 'object' ? raw.metadata : {}
  };
}

function normalizePlaylist(raw) {
  return {
    playlistCode: String(raw?.playlistCode || raw?.playlist_code || raw?.id || '').trim(),
    provider: String(raw?.provider || raw?.providerCode || raw?.provider_code || '').trim().toLowerCase(),
    name: String(raw?.name || raw?.title || '未命名歌单').trim(),
    cover: String(raw?.cover || raw?.coverUrl || raw?.cover_url || '').trim(),
    trackCount: Number(raw?.trackCount || raw?.track_count || 0)
  };
}

function submitSearch(term) {
  const nextKeyword = typeof term === 'string' ? term.trim() : keyword.value.trim();
  if (!nextKeyword) return;
  keyword.value = nextKeyword;
  if (nextKeyword !== route.query.q) {
    router.replace({ query: { ...route.query, q: nextKeyword } });
  } else if (!searching.value) {
    runSearch(nextKeyword);
  }
}

async function runSearch(nextKeyword) {
  if (!nextKeyword) return;
  searchController?.abort();
  const controller = new AbortController();
  searchController = controller;
  const sequence = ++requestSequence;
  searching.value = true;
  hasSearched.value = true;
  searchError.value = '';
  menuTrack.value = null;
  result.value = createEmptyResult(nextKeyword);
  pushHistory(nextKeyword);

  try {
    const authorizedFetch = auth.isAuthenticated.value ? auth.authorizedFetch : undefined;
    const payload = await searchMusic(nextKeyword, { type: 'all', page: 1, limit: 24, signal: controller.signal }, authorizedFetch);
    if (sequence !== requestSequence) return;
    result.value = {
      query: String(payload?.query || nextKeyword),
      partial: Boolean(payload?.partial),
      tracks: Array.isArray(payload?.tracks) ? payload.tracks.map((item, idx) => normalizeTrack(item, idx)) : [],
      playlists: Array.isArray(payload?.playlists)
        ? payload.playlists.map((item) => normalizePlaylist(item)).filter((item) => item.playlistCode || item.name)
        : [],
      artists: Array.isArray(payload?.artists)
        ? payload.artists
            .map((item) => ({ name: String(item?.name || '').trim() }))
            .filter((item) => item.name)
        : []
    };
  } catch (error) {
    if (sequence !== requestSequence) return;
    searchError.value = error?.detail || error?.message || '搜索失败，请稍后重试';
  } finally {
    if (sequence === requestSequence) {
      searching.value = false;
      searchController = null;
    }
  }
}

async function playSearchTrack(track) {
  const ok = await player.playExternalTrack(track, { replaceQueue: false });
  if (ok) {
    shell.openPlayer();
  } else {
    showToast('该歌曲暂时无法播放');
  }
}

async function menuPlayNow() {
  const track = menuTrack.value;
  menuTrack.value = null;
  if (track) await playSearchTrack(track);
}

async function menuPlayNext() {
  const track = menuTrack.value;
  menuTrack.value = null;
  if (!track) return;
  const ok = await player.enqueueNextTrack(track);
  showToast(ok ? '已加入下一首播放' : '无法加入队列');
}

function openSearchPlaylist(item) {
  if (!item?.playlistCode) return;
  router.push({ name: 'mobile-playlist', params: { playlistCode: item.playlistCode } });
}

watch(() => route.query.q, (value) => {
  const query = typeof value === 'string' ? value.trim() : '';
  keyword.value = query;
  if (query) runSearch(query);
  else resetResults();
}, { immediate: true });

onUnmounted(resetResults);
</script>

<style scoped>
.m-search-page {
  display: flex;
  flex-direction: column;
  gap: 14px;
}

.search-head {
  display: flex;
  gap: 10px;
  align-items: stretch;
}

.search-box {
  flex: 1;
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 0 14px;
  border-radius: 18px;
}

.search-box > i {
  color: rgba(var(--m-accent-rgb), 0.9);
  font-size: 14px;
}

.search-input {
  flex: 1;
  min-width: 0;
  padding: 14px 0;
  border: none;
  background: transparent;
  color: var(--m-text);
  /* 16px 起步，避免聚焦时移动端浏览器自动缩放 */
  font-size: 16px;
  outline: none;
}

.search-input::placeholder {
  color: var(--m-text-faint);
}

.search-input::-webkit-search-cancel-button {
  display: none;
}

.clear-btn {
  flex-shrink: 0;
  border: none;
  background: transparent;
  color: var(--m-text-faint);
  font-size: 15px;
  cursor: pointer;
  padding: 6px;
}

.search-go {
  flex-shrink: 0;
  padding: 0 20px;
  border: none;
  border-radius: 18px;
  background: var(--m-accent-gradient);
  color: #3c2320;
  font-size: 14px;
  font-weight: 700;
  cursor: pointer;
  box-shadow: 0 8px 18px rgba(var(--m-accent-rgb), 0.3);
}

.search-go:disabled {
  opacity: 0.55;
  box-shadow: none;
}

.history-clear {
  border: none;
  background: transparent;
  color: var(--m-text-faint);
  font-size: 12.5px;
  cursor: pointer;
}

.history-chips,
.artist-chips {
  display: flex;
  flex-wrap: wrap;
  gap: 9px;
}

.result-context {
  margin: 0 0 8px;
  color: var(--m-text-faint);
  font-size: 13px;
  overflow-wrap: anywhere;
}

.search-skeletons {
  display: grid;
  gap: 10px;
}

.skeleton-row {
  height: 62px;
  border-radius: var(--m-radius-md);
}

.partial-hint {
  margin: 0;
  display: flex;
  align-items: center;
  gap: 8px;
  padding: 10px 14px;
  border-radius: 14px;
  border: 1px solid rgba(255, 202, 128, 0.35);
  background: rgba(255, 202, 128, 0.1);
  color: rgba(255, 214, 158, 0.95);
  font-size: 12.5px;
}

:root[data-theme-mode='day'] .partial-hint {
  color: #9a6a1f;
}

.result-group {
  display: grid;
  gap: 2px;
}

.result-tracks {
  padding: 8px;
  display: grid;
  gap: 2px;
}

.result-playlists {
  display: grid;
  gap: 10px;
}

.playlist-row {
  display: flex;
  align-items: center;
  gap: 13px;
  width: 100%;
  padding: 10px 14px 10px 10px;
  cursor: pointer;
  text-align: left;
  color: inherit;
}

.pl-cover {
  width: 52px;
  height: 52px;
  flex-shrink: 0;
  border-radius: 14px;
  overflow: hidden;
  border: 1px solid var(--m-border);
}

.pl-cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.pl-fallback {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  color: rgba(var(--m-accent-rgb), 0.8);
  background: linear-gradient(135deg, rgba(var(--m-grad-a), 0.22), rgba(var(--m-grad-b), 0.16));
}

.pl-main {
  flex: 1;
  min-width: 0;
}

.pl-name {
  margin: 0;
  font-size: 14px;
  font-weight: 650;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.pl-sub {
  margin: 3px 0 0;
  font-size: 11.5px;
  color: var(--m-text-faint);
}

.pl-arrow {
  flex-shrink: 0;
  color: var(--m-text-faint);
  font-size: 12px;
}

.menu-actions {
  display: grid;
  gap: 4px;
  padding: 4px 0 8px;
}

.menu-item {
  display: flex;
  align-items: center;
  gap: 14px;
  width: 100%;
  padding: 14px 16px;
  border: none;
  border-radius: 14px;
  background: transparent;
  color: var(--m-text);
  font-size: 14.5px;
  text-align: left;
  cursor: pointer;
}

.menu-item:active {
  background: var(--m-surface-soft);
}

.menu-item i {
  width: 20px;
  text-align: center;
  color: rgba(var(--m-accent-rgb), 0.9);
}
</style>
