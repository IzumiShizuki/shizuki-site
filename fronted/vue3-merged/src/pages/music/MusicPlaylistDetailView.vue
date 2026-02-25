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

        <div class="hero-actions">
          <button class="hero-btn primary ripple-trigger" type="button" @click="playAll" :disabled="!filteredTracks.length">
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

    <header class="table-toolbar liquid-material">
      <label class="search-box">
        <i class="fas fa-search"></i>
        <input v-model.trim="searchKeyword" type="search" placeholder="搜索标题 / 歌手" />
      </label>
      <p v-if="music.currentPlaylistError.value" class="state-text error">{{ music.currentPlaylistError.value }}</p>
      <p v-else-if="music.currentPlaylistLoading.value" class="state-text">正在加载歌单...</p>
    </header>

    <section class="playlist-table liquid-material">
      <header class="table-head">
        <span>#</span>
        <span>标题</span>
        <span>歌手</span>
        <span>Provider</span>
        <span>喜欢</span>
        <span>时长</span>
      </header>

      <div v-if="!filteredTracks.length && !music.currentPlaylistLoading.value" class="empty-state">该歌单暂无可播放曲目</div>

      <button
        v-for="(item, index) in filteredTracks"
        :key="`playlist-track-${item.id}`"
        class="track-row ripple-trigger"
        :class="{ active: item.id === music.player.currentTrack.value?.id }"
        type="button"
        @click="playTrack(index)"
      >
        <span>{{ String(index + 1).padStart(2, '0') }}</span>
        <span class="title-col">{{ item.title || '未知标题' }}</span>
        <span class="artist-col">{{ item.artist || '未知歌手' }}</span>
        <span>{{ item.provider || 'local' }}</span>
        <span class="like-col" @click.stop="music.toggleTrackLike(item)">
          <i class="fas" :class="music.isTrackLiked(item.id) ? 'fa-heart liked' : 'fa-heart-crack'"></i>
        </span>
        <span>{{ item.durationLabel || '--:--' }}</span>
      </button>
    </section>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import { useRoute } from 'vue-router';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';

const route = useRoute();
const music = useMusicLibraryContext();

const playlistCode = computed(() => String(route.params.playlistCode || '').trim());

const profile = computed(() => music.currentPlaylistProfile.value || { name: '', description: '', cover: '' });
const allTracks = computed(() => (Array.isArray(music.currentPlaylistTracks.value) ? music.currentPlaylistTracks.value : []));

const searchKeyword = computed({
  get: () => music.ui.getDetailSearchKeyword(playlistCode.value),
  set: (value) => music.ui.setDetailSearchKeyword(playlistCode.value, value)
});

const filteredTracks = computed(() => {
  const keyword = String(searchKeyword.value || '').trim().toLowerCase();
  if (!keyword) return allTracks.value;
  return allTracks.value.filter((item) => {
    const title = String(item?.title || '').toLowerCase();
    const artist = String(item?.artist || '').toLowerCase();
    return title.includes(keyword) || artist.includes(keyword);
  });
});

const coverStyle = computed(() => {
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  return {
    backgroundImage: `url('${profile.value.cover || fallback}')`
  };
});

function resolveRawIndexByTrackId(trackId) {
  return allTracks.value.findIndex((item) => item.id === trackId);
}

function playTrack(filteredIndex) {
  const row = filteredTracks.value[filteredIndex];
  if (!row) return;
  const rawIndex = resolveRawIndexByTrackId(row.id);
  if (rawIndex < 0) return;
  music.playTrackInCurrentPlaylist(rawIndex);
}

function playAll() {
  if (!filteredTracks.value.length) return;
  playTrack(0);
}
</script>

<style scoped>
.music-center-view {
  display: grid;
  gap: 12px;
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

.hero-desc {
  margin: 0;
  color: rgba(182, 194, 218, 0.88);
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
  border-color: rgba(255, 120, 140, 0.48);
  background: linear-gradient(132deg, rgba(255, 77, 112, 0.94), rgba(255, 122, 86, 0.9));
  color: #fff;
}

.table-toolbar {
  --liquid-bg: linear-gradient(145deg, rgba(20, 24, 36, 0.82), rgba(15, 19, 30, 0.78));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 14px 26px rgba(6, 10, 18, 0.3);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.search-box {
  min-height: 36px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.08);
  padding: 0 12px;
  color: rgba(217, 228, 248, 0.88);
}

.search-box input {
  width: 100%;
  border: 0;
  outline: none;
  background: transparent;
  color: rgba(236, 243, 255, 0.95);
}

.state-text {
  margin: 0;
  font-size: 12px;
  color: rgba(184, 196, 220, 0.86);
}

.state-text.error {
  color: #ff9cb8;
}

.playlist-table {
  --liquid-bg: linear-gradient(145deg, rgba(19, 23, 34, 0.84), rgba(14, 18, 28, 0.8));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 12px 24px rgba(6, 8, 14, 0.3);
  border-radius: 14px;
  padding: 10px;
}

.table-head,
.track-row {
  display: grid;
  grid-template-columns: 44px minmax(0, 1.8fr) minmax(0, 1fr) 92px 62px 72px;
  gap: 8px;
  align-items: center;
}

.table-head {
  min-height: 36px;
  border-bottom: 1px solid rgba(255, 255, 255, 0.14);
  color: rgba(188, 199, 221, 0.84);
  font-size: 12px;
}

.track-row {
  min-height: 42px;
  border: 0;
  border-radius: 10px;
  padding: 0 4px;
  margin-top: 6px;
  background: rgba(255, 255, 255, 0.04);
  text-align: left;
  color: rgba(234, 240, 255, 0.92);
}

.track-row.active {
  background: rgba(255, 99, 138, 0.2);
}

.title-col,
.artist-col {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.artist-col {
  color: rgba(179, 190, 214, 0.86);
}

.like-col {
  text-align: center;
}

.like-col .liked {
  color: #ff5d85;
}

.empty-state {
  margin-top: 10px;
  min-height: 80px;
  border-radius: 10px;
  border: 1px dashed rgba(255, 255, 255, 0.24);
  color: rgba(184, 196, 221, 0.84);
  display: grid;
  place-items: center;
}

@media (max-width: 960px) {
  .playlist-hero {
    grid-template-columns: auto 1fr;
  }

  .cover {
    width: 120px;
    height: 120px;
  }

  .hero-main {
    grid-column: span 2;
  }

  .table-head,
  .track-row {
    grid-template-columns: 36px minmax(0, 1.6fr) minmax(0, 1fr) 70px 46px 58px;
    gap: 6px;
  }
}
</style>
