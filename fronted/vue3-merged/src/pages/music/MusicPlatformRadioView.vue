<template>
  <section class="platform-radio-view">
    <section class="panel liquid-material">
      <header class="panel-head">
        <div><p class="section-kicker">NETEASE CLOUD</p><h2>网易云声音</h2></div>
        <button class="inline-panel-action ripple-trigger" type="button" :disabled="loading" @click="loadPodcasts">刷新</button>
      </header>
      <form class="podcast-search" @submit.prevent="loadPodcasts">
        <input v-model="query" type="search" aria-label="搜索网易云声音与播客" placeholder="搜索声音、播客或电台" maxlength="200" />
        <button class="inline-panel-action ripple-trigger" :disabled="loading" type="submit">搜索</button>
      </form>
      <p class="source-note">来自网易云的声音与播客，打开后可浏览并播放节目。</p>
      <p v-if="error" class="state-text error" role="alert">{{ error }}</p>
      <p v-if="loading" role="status">正在加载网易云声音…</p>
      <div class="podcast-grid">
        <button v-for="item in podcasts" :key="item.playlistCode" class="podcast-card ripple-trigger" type="button" @click="music.openPlaylistDetail(item.playlistCode)">
          <img v-if="item.cover" :src="item.cover" :alt="item.name" loading="lazy" />
          <span v-else class="empty-cover" aria-hidden="true"><i class="fas fa-podcast"></i></span>
          <span class="card-copy"><strong>{{ item.name }}</strong><span>{{ item.description || '网易云播客' }}</span><small>{{ item.trackCount }} 个节目</small></span>
        </button>
      </div>
      <p v-if="!loading && !error && !podcasts.length" class="empty-state">暂无相关声音，试试其他关键词。</p>
    </section>

    <section class="panel liquid-material">
      <header class="panel-head">
        <div><p class="section-kicker">PERSONAL FM</p><h2>私人 FM</h2></div>
        <button class="inline-panel-action ripple-trigger" type="button" :disabled="fmLoading" @click="loadFm">
          {{ fmLoading ? '加载中…' : fmTracks.length ? '换一批' : '听私人 FM' }}
        </button>
      </header>
      <p v-if="!isBound" class="source-note">绑定网易云账号后，在这里收听为你推荐的私人 FM。</p>
      <button v-if="!isBound" class="inline-panel-action ripple-trigger" type="button" @click="connectAccount">{{ isAuthenticated ? '绑定网易云账号' : '登录并绑定账号' }}</button>
      <p v-if="fmError" class="state-text error" role="alert">{{ fmError }}</p>
      <div v-if="fmTracks.length" class="fm-track-list">
        <article v-for="(item, index) in fmTracks" :key="item.trackId" class="fm-track">
          <button class="fm-track-play ripple-trigger" type="button" @click="playFm(index)">
            <img v-if="item.cover" :src="item.cover" alt="" loading="lazy" /><i v-else class="fas fa-music" aria-hidden="true"></i>
            <span><strong>{{ item.title }}</strong><small>{{ item.artist || '网易云音乐' }}</small></span><i class="fas fa-play" aria-hidden="true"></i>
          </button>
          <button class="inline-panel-action ripple-trigger" type="button" :disabled="music.isTrackLikePending?.(item)" :aria-pressed="music.isTrackLiked(item)" :aria-label="music.isTrackLiked(item) ? '取消喜欢' : '喜欢这首歌'" @click="music.toggleTrackLike(item)">
            <i class="fas fa-heart" :class="{ liked: music.isTrackLiked(item) }" aria-hidden="true"></i>
          </button>
        </article>
      </div>
      <p v-if="isBound && !fmLoading && !fmError && !fmTracks.length" class="source-note">点击“听私人 FM”获取推荐歌曲。</p>
    </section>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, ref, watch } from 'vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import * as musicApi from '../../services/musicApi';

const music = useMusicLibraryContext();
const query = ref('');
const podcasts = ref([]);
const loading = ref(false);
const error = ref('');
const fmTracks = ref([]);
const fmLoading = ref(false);
const fmError = ref('');
const isAuthenticated = computed(() => Boolean(music.authState.value.isAuthenticated));
const isBound = computed(() => Boolean(music.musicSourceAccounts.value?.netease?.bound));
let podcastVersion = 0;
let fmVersion = 0;

function message(failure) {
  return failure?.detail || failure?.message || '网易云内容加载失败，请重试';
}

async function loadPodcasts() {
  const version = ++podcastVersion;
  loading.value = true;
  error.value = '';
  try {
    const rows = await musicApi.getRecommendedPodcasts({ q: query.value.trim() }, music.authorizedMusicFetch?.());
    if (version !== podcastVersion) return;
    if (!Array.isArray(rows)) throw new Error('网易云声音返回数据异常');
    podcasts.value = rows.map((item) => ({ ...item, playlistCode: item.playlistCode || item.playlist_code, trackCount: item.trackCount ?? item.track_count ?? 0 }));
  } catch (failure) {
    if (version === podcastVersion) error.value = message(failure);
  } finally {
    if (version === podcastVersion) loading.value = false;
  }
}

function connectAccount() {
  if (!isAuthenticated.value) music.requestMusicLogin();
  else music.bindMusicSourceAccount('netease');
}

async function loadFm() {
  if (!isAuthenticated.value || !isBound.value) { connectAccount(); return; }
  const version = ++fmVersion;
  fmLoading.value = true;
  fmError.value = '';
  try {
    const rows = await musicApi.getPersonalFmTracks(music.authorizedMusicFetch());
    if (version !== fmVersion) return;
    if (!Array.isArray(rows)) throw new Error('网易云私人 FM 返回数据异常');
    fmTracks.value = rows.map((item) => ({ ...item, trackId: item.trackId || item.track_id, provider: 'netease' }));
    if (!rows.length) fmError.value = '网易云暂未返回 FM 推荐，请重试';
  } catch (failure) {
    if (version === fmVersion) fmError.value = message(failure);
  } finally {
    if (version === fmVersion) fmLoading.value = false;
  }
}

async function playFm(index) {
  const played = await music.player.replaceQueueWithTracks(fmTracks.value, index, true, { sourceType: 'personal-fm', sourceCode: 'netease_fm', sourceName: '网易云私人 FM' });
  if (!played) fmError.value = '这首 FM 歌曲暂时无法播放，请重试';
}

watch(() => [music.authState.value.accountId, isAuthenticated.value, isBound.value], () => {
  podcastVersion += 1;
  fmVersion += 1;
  podcasts.value = [];
  fmTracks.value = [];
  fmLoading.value = false;
  fmError.value = '';
  void loadPodcasts();
}, { immediate: true, flush: 'sync' });

onBeforeUnmount(() => { podcastVersion += 1; fmVersion += 1; });
</script>

<style scoped>
.platform-radio-view { display: grid; gap: 18px; }
.panel { padding: 20px; border-radius: 18px; }
.panel-head { display: flex; justify-content: space-between; align-items: center; gap: 12px; margin-bottom: 16px; }
.panel-head h2 { margin: 4px 0 0; font-size: 21px; }
.section-kicker, .source-note, .card-copy span, small { color: var(--music-soft-text-dim, var(--theme-text-secondary)); }
.section-kicker { margin: 0; font-size: 11px; letter-spacing: .12em; }
.source-note { font-size: 13px; line-height: 1.6; }
.podcast-search { display: flex; gap: 8px; }
.podcast-search input { min-width: 0; flex: 1; padding: 10px 12px; border: 1px solid var(--theme-border); border-radius: 10px; background: var(--theme-panel-surface); color: var(--theme-text); }
.inline-panel-action { border: 1px solid var(--theme-border); border-radius: 10px; padding: 9px 12px; background: var(--theme-panel-surface); color: var(--theme-text); cursor: pointer; }
button:disabled { opacity: .5; cursor: wait; }
button:focus-visible, input:focus-visible { outline: 2px solid var(--theme-accent, #ec4141); outline-offset: 3px; }
.podcast-grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(200px, 1fr)); gap: 14px; }
.podcast-card { display: grid; padding: 0; text-align: left; border: 1px solid var(--theme-border); border-radius: 14px; overflow: hidden; background: var(--theme-panel-surface); color: var(--theme-text); cursor: pointer; }
.podcast-card img, .empty-cover { width: 100%; aspect-ratio: 1; object-fit: cover; }
.empty-cover { display: grid; place-items: center; background: rgba(var(--accent-rgb, 236, 65, 65), .1); font-size: 40px; }
.card-copy { display: grid; gap: 7px; padding: 12px; }
.card-copy span { font-size: 12px; display: -webkit-box; -webkit-line-clamp: 2; -webkit-box-orient: vertical; overflow: hidden; }
.fm-track-list { display: grid; gap: 10px; }
.fm-track { display: flex; align-items: center; gap: 12px; }
.fm-track-play { flex: 1; min-width: 0; display: flex; align-items: center; gap: 12px; border: 0; padding: 6px; color: var(--theme-text); background: transparent; text-align: left; cursor: pointer; }
.fm-track-play img { width: 48px; height: 48px; object-fit: cover; border-radius: 8px; }
.fm-track-play span { flex: 1; display: grid; gap: 5px; }
.liked, .error { color: #ec4141; }
@media (max-width: 560px) { .panel { padding: 14px; } .podcast-grid { grid-template-columns: repeat(2, minmax(0, 1fr)); } }
</style>
