<template>
  <section class="music-center-view music-playlist-view">
    <header class="playlist-hero liquid-material">
      <button class="back-btn ripple-trigger" type="button" @click="music.backToMainList">
        <i class="fas fa-arrow-left"></i>
      </button>

      <div class="cover" :style="coverStyle"></div>

      <div class="hero-main">
        <p class="hero-type">歌单详情</p>
        <h1>{{ profile.name || '未命名歌单' }}</h1>
        <p class="hero-desc">{{ profile.description || '暂无简介' }}</p>
        <p class="hero-stats">
          已显示 {{ renderTracks.length }} / 已加载 {{ allTracks.length }} / 总计 {{ totalTrackCount }} 首
        </p>

        <div class="hero-actions">
          <button class="hero-btn primary ripple-trigger" type="button" @click="playAll" :disabled="!renderTracks.length">
            <i class="fas fa-play"></i>
            播放全部
          </button>
          <button class="hero-btn ripple-trigger" type="button" @click="music.reloadCurrentPlaylist" :disabled="music.currentPlaylistLoading.value">
            <i class="fas fa-rotate-right"></i>
            刷新
          </button>
          <button
            v-if="music.authState.value.isAuthenticated"
            class="hero-btn ripple-trigger"
            type="button"
            @click="music.toggleCollectCurrentPlaylist"
            :disabled="music.collectingPlaylist.value"
          >
            <i class="fas" :class="music.isCurrentPlaylistCollected.value ? 'fa-folder-minus' : 'fa-folder-plus'"></i>
            {{ music.isCurrentPlaylistCollected.value ? '取消收藏' : '收藏歌单' }}
          </button>
        </div>
      </div>
    </header>

    <p v-if="displayErrorText" class="state-text error">{{ displayErrorText }}</p>

    <section class="playlist-table liquid-material">
      <header class="table-head search-track-head">
        <span>#</span>
        <span>标题</span>
        <span>歌手</span>
        <span>平台</span>
        <span>时长</span>
        <span>操作</span>
      </header>

      <div v-if="!renderTracks.length && !music.currentPlaylistLoading.value" class="empty-state">该歌单暂无可播放曲目</div>

      <article
        v-for="(item, index) in renderTracks"
        :key="`playlist-track-${resolveTrackId(item) || index}`"
        class="table-row search-track-row ripple-trigger"
        :class="{ active: resolveTrackId(item) === currentPlayingTrackId }"
        @click="playTrack(index)"
      >
        <span>{{ String(index + 1).padStart(2, '0') }}</span>
        <span class="title-col track-title-col">
          <span class="track-cover" :class="{ empty: !item.cover }" :style="trackCoverStyle(item)"></span>
          <span class="track-title-text">{{ item.title || '未知标题' }}</span>
        </span>
        <span class="artist-col">{{ item.artist || '未知歌手' }}</span>
        <span>{{ item.provider || 'local' }}</span>
        <span>{{ resolveDurationLabel(item) }}</span>
        <span class="row-actions">
          <button
            class="track-action-btn ripple-trigger"
            type="button"
            :title="music.isTrackLiked(resolveTrackId(item)) ? '取消红心' : '加入红心'"
            @click.stop="music.toggleTrackLike(item)"
          >
            <i class="fas" :class="music.isTrackLiked(resolveTrackId(item)) ? 'fa-heart liked' : 'fa-heart-crack'"></i>
          </button>
          <button
            class="track-action-btn ripple-trigger"
            type="button"
            title="下一首播放"
            @click.stop="enqueueTrackNext(item)"
          >
            <i class="fas fa-forward"></i>
          </button>
          <TrackCollectButton
            :track="item"
            :playlist-options="collectPlaylistTargets"
            :can-collect="music.authState.value.isAuthenticated"
            :can-collect-default-public="music.authState.value.isAdmin"
            @collect="handleCollectTrack"
            @collect-default-public="handleCollectDefaultPublic"
            @require-login="handleRequireCollectLogin"
          />
        </span>
      </article>

      <footer v-if="music.currentPlaylistHasMore.value || music.currentPlaylistLoading.value" class="playlist-pager">
        <p v-if="music.currentPlaylistLoading.value" class="pager-text">
          <i class="fas fa-spinner fa-spin"></i>
          歌单加载中...
        </p>
        <button
          v-else
          class="pager-load-btn ripple-trigger"
          type="button"
          @click="music.loadMoreCurrentPlaylistTracks"
        >
          显示更多曲目
        </button>
      </footer>
    </section>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import TrackCollectButton from '../../components/music/TrackCollectButton.vue';
import { formatMediaTime } from '../../utils/mediaTime';
import { safeCssUrl } from '../../utils/url';

const music = useMusicLibraryContext();

const profile = computed(() => music.currentPlaylistProfile.value || { name: '', description: '', cover: '' });
const allTracks = computed(() => (Array.isArray(music.currentPlaylistAllTracks?.value) ? music.currentPlaylistAllTracks.value : []));
const visibleTracks = computed(() => (Array.isArray(music.currentPlaylistTracks.value) ? music.currentPlaylistTracks.value : []));
const renderTracks = computed(() => {
  if (visibleTracks.value.length > 0) return visibleTracks.value;
  if (!allTracks.value.length) return [];
  return allTracks.value.slice(0, Math.min(allTracks.value.length, 100));
});
const currentPlayingTrackId = computed(() => resolveTrackId(music.player.currentTrack.value));
const collectPlaylistTargets = computed(() =>
  (Array.isArray(music.collectPlaylistTargets?.value) ? music.collectPlaylistTargets.value : [])
);
const totalTrackCount = computed(() => {
  const profileCount = Number(profile.value?.trackCount || 0);
  if (Number.isFinite(profileCount) && profileCount > 0) {
    return Math.max(profileCount, allTracks.value.length);
  }
  return allTracks.value.length;
});

const displayErrorText = computed(() => String(music.currentPlaylistError.value || '').trim());

const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const safeCover = safeCssUrl(profile.value.cover || fallback);
  return {
    backgroundImage: safeCover ? `url('${safeCover}')` : 'none'
  };
});

function resolveTrackId(trackItem) {
  return String(trackItem?.trackId || trackItem?.track_id || trackItem?.id || '').trim();
}

function resolveDurationLabel(trackItem) {
  const direct = String(trackItem?.durationLabel || trackItem?.duration || '').trim();
  if (direct) return direct;
  const durationSec = Number(trackItem?.durationSec ?? trackItem?.metadata?.durationSec ?? trackItem?.metadata?.duration_sec);
  if (Number.isFinite(durationSec) && durationSec > 0) {
    return formatMediaTime(durationSec);
  }
  return '--:--';
}

function trackCoverStyle(trackItem) {
  const cover = safeCssUrl(trackItem?.cover);
  return {
    backgroundImage: cover ? `url('${cover}')` : 'none'
  };
}

function resolveRawIndexByTrackId(trackId) {
  return allTracks.value.findIndex((item) => resolveTrackId(item) === trackId);
}

function playTrack(filteredIndex) {
  const row = renderTracks.value[filteredIndex];
  if (!row) return;
  const rawIndex = resolveRawIndexByTrackId(resolveTrackId(row));
  if (rawIndex < 0) return;
  music.playTrackInCurrentPlaylist(rawIndex);
}

function playAll() {
  if (!renderTracks.value.length) return;
  playTrack(0);
}

async function enqueueTrackNext(trackItem) {
  const success = await music.player.enqueueNextTrack?.(trackItem);
  if (!success) {
    window.alert('当前曲目暂不可加入“下一首播放”');
  }
}

function handleCollectTrack(payload) {
  const track = payload?.track || null;
  const playlistCode = String(payload?.playlistCode || '').trim();
  if (!playlistCode) return;
  if (typeof music.collectTrackToPlaylist !== 'function') return;
  music.collectTrackToPlaylist(track, playlistCode);
}

function handleCollectDefaultPublic(track) {
  if (typeof music.collectTrackToDefaultPublic !== 'function') return;
  music.collectTrackToDefaultPublic(track || null);
}

function handleRequireCollectLogin() {
  if (typeof music.requestMusicLogin === 'function') {
    music.requestMusicLogin();
    return;
  }
  window.alert('请先登录后再收藏');
}
</script>

<style scoped>
.music-center-view {
  display: grid;
  gap: 8px;
  align-content: start;
  grid-auto-rows: max-content;
}

.playlist-hero {
  --liquid-bg: linear-gradient(155deg, rgba(24, 28, 40, 0.82), rgba(20, 23, 34, 0.74));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 18px 36px rgba(6, 10, 18, 0.42);
  border-radius: 16px;
  padding: 12px;
  display: grid;
  grid-template-columns: auto 160px minmax(0, 1fr);
  gap: 12px;
  align-items: center;
}

.back-btn {
  width: 36px;
  height: 36px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.12);
  color: rgba(233, 240, 255, 0.94);
  align-self: start;
}

.cover {
  width: 160px;
  height: 160px;
  border-radius: 14px;
  background-size: cover;
  background-position: center;
}

.hero-main {
  min-width: 0;
  display: grid;
  gap: 8px;
}

.hero-main h1 {
  margin: 0;
  font-size: clamp(20px, 2vw, 30px);
  color: rgba(242, 247, 255, 0.96);
}

.hero-type {
  margin: 0;
  font-size: 12px;
  letter-spacing: 0.08em;
  color: rgba(176, 190, 215, 0.82);
  text-transform: uppercase;
}

.hero-desc,
.hero-stats {
  margin: 0;
  color: rgba(182, 194, 218, 0.88);
}

.hero-stats {
  font-size: 12px;
}

.hero-actions {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
}

.hero-btn {
  min-height: 34px;
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.12);
  color: rgba(236, 243, 255, 0.95);
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.hero-btn.primary {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: linear-gradient(132deg, rgba(var(--accent-rgb), 0.92), rgba(var(--accent-soft-rgb), 0.88));
  color: rgba(255, 255, 255, 0.96);
  box-shadow:
    0 0 0 1px rgba(var(--accent-rgb), 0.3),
    0 8px 16px rgba(var(--accent-rgb), 0.2);
}

.state-text {
  margin: 0;
  font-size: 12px;
  color: rgba(184, 196, 220, 0.86);
  padding-left: 2px;
}

.state-text.error {
  color: rgba(var(--accent-soft-rgb), 0.98);
}

.playlist-table {
  --liquid-bg: linear-gradient(145deg, rgba(19, 23, 34, 0.84), rgba(14, 18, 28, 0.8));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 12px 24px rgba(6, 8, 14, 0.3);
  border-radius: 14px;
  padding: 10px;
  margin-top: 0;
}

.table-head,
.table-row {
  display: grid;
  grid-template-columns: 48px minmax(0, 2.1fr) minmax(0, 1fr) 84px 72px 132px;
  gap: 8px;
  align-items: center;
}

.table-head {
  min-height: 36px;
  border-bottom: 1px solid rgba(255, 255, 255, 0.14);
  color: rgba(188, 199, 221, 0.84);
  font-size: 12px;
}

.table-row {
  min-height: 44px;
  border: 0;
  border-radius: 10px;
  padding: 0 4px;
  margin-top: 6px;
  background: rgba(255, 255, 255, 0.04);
  text-align: left;
  color: rgba(234, 240, 255, 0.92);
  cursor: pointer;
}

.table-row.active {
  background: rgba(var(--accent-rgb), 0.22);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.32);
}

.track-cover {
  width: 40px;
  height: 40px;
  border-radius: 8px;
  background-size: cover;
  background-position: center;
  box-shadow: 0 6px 14px rgba(5, 8, 16, 0.34);
}

.track-cover.empty {
  background-image: linear-gradient(145deg, rgba(65, 74, 105, 0.54), rgba(33, 40, 64, 0.6));
  border: 1px solid rgba(255, 255, 255, 0.16);
}

.track-title-col {
  display: inline-flex;
  align-items: center;
  gap: 10px;
  min-width: 0;
}

.track-title-text,
.title-col,
.artist-col {
  min-width: 0;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.artist-col {
  color: rgba(179, 190, 214, 0.86);
}

.row-actions {
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.track-action-btn {
  width: 30px;
  height: 30px;
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(231, 238, 252, 0.9);
}

.track-action-btn .liked {
  color: rgb(var(--accent-strong-rgb));
}

.empty-state {
  border-radius: 10px;
  border: 1px dashed rgba(255, 255, 255, 0.18);
  background: rgba(255, 255, 255, 0.04);
  color: rgba(179, 192, 218, 0.84);
  min-height: 72px;
  display: grid;
  place-items: center;
  margin-top: 8px;
}

.playlist-pager {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 8px;
  padding-top: 8px;
}

.pager-text {
  margin: 0;
  font-size: 12px;
  color: rgba(189, 201, 227, 0.84);
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.pager-load-btn {
  min-height: 30px;
  border-radius: 999px;
  border: 1px solid rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(240, 246, 255, 0.96);
  padding: 0 14px;
  font-size: 12px;
}

@media (max-width: 980px) {
  .playlist-hero {
    grid-template-columns: auto minmax(0, 1fr);
  }

  .cover {
    width: 128px;
    height: 128px;
    justify-self: center;
    grid-column: 1 / -1;
  }
}

@media (max-width: 760px) {
  .table-head,
  .table-row {
    grid-template-columns: 36px minmax(0, 2fr) 78px 68px;
  }

  .table-head span:nth-child(3),
  .table-head span:nth-child(6),
  .table-row span:nth-child(3),
  .table-row span:nth-child(6) {
    display: none;
  }
}
</style>
