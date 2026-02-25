<template>
  <section class="music-center-view music-home-view">
    <header class="home-toolbar liquid-material">
      <div class="search-box">
        <i class="fas fa-search"></i>
        <input v-model.trim="searchKeyword" type="search" placeholder="搜索歌单 / 歌曲 / 歌手" />
      </div>
      <button class="toolbar-btn ripple-trigger" type="button" @click="music.reloadHomeData" :disabled="music.homeLoading.value">
        <i class="fas fa-rotate-right"></i>
        {{ music.homeLoading.value ? '加载中...' : '刷新' }}
      </button>
    </header>

    <p v-if="music.homeError.value" class="state-text error">{{ music.homeError.value }}</p>

    <section class="panel liquid-material">
      <header class="panel-head">
        <h2>你的音乐列表</h2>
        <span>{{ filteredPlaylists.length }} 个歌单</span>
      </header>

      <div v-if="!filteredPlaylists.length && !music.homeLoading.value" class="empty-state">
        暂无可展示歌单
      </div>

      <div class="playlist-grid">
        <button
          v-for="item in filteredPlaylists"
          :key="item.playlistCode"
          class="playlist-card ripple-trigger"
          type="button"
          @click="music.openPlaylistDetail(item.playlistCode)"
        >
          <div class="cover" :style="coverStyle(item)"></div>
          <div class="meta">
            <p class="name">{{ item.name || '未命名歌单' }}</p>
            <p class="desc">{{ item.description || '点击进入歌单详情' }}</p>
          </div>
        </button>
      </div>
    </section>

    <section class="panel liquid-material">
      <header class="panel-head">
        <h2>主列表推荐</h2>
        <span>{{ filteredTracks.length }} 首</span>
      </header>

      <div class="table-head">
        <span>#</span>
        <span>标题</span>
        <span>歌手</span>
        <span>时长</span>
      </div>

      <div v-if="!filteredTracks.length && !music.homeLoading.value" class="empty-state">
        暂无推荐歌曲
      </div>

      <button
        v-for="(item, index) in filteredTracks"
        :key="`home-track-${item.trackId || item.id || index}`"
        class="table-row ripple-trigger"
        type="button"
        @click="music.playFeaturedTrack(item, index)"
      >
        <span>{{ String(index + 1).padStart(2, '0') }}</span>
        <span class="title-col">{{ item.title || '未知标题' }}</span>
        <span class="artist-col">{{ item.artist || '未知歌手' }}</span>
        <span>{{ item.duration || item.durationLabel || '--:--' }}</span>
      </button>
    </section>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';

const music = useMusicLibraryContext();

const searchKeyword = computed({
  get: () => music.ui.homeSearchKeyword.value,
  set: (value) => music.ui.setHomeSearchKeyword(value)
});

const filteredPlaylists = computed(() => {
  const source = Array.isArray(music.homeData.value?.featuredPlaylists)
    ? music.homeData.value.featuredPlaylists
    : [];
  const navKey = String(music.ui.activeNav.value || 'recommend');
  const keyword = String(searchKeyword.value || '').trim().toLowerCase();
  const keywordFiltered = source.filter((item) => {
    const name = String(item?.name || '').toLowerCase();
    const desc = String(item?.description || '').toLowerCase();
    return !keyword || name.includes(keyword) || desc.includes(keyword);
  });
  if (navKey === 'playlist') return keywordFiltered;
  if (navKey === 'discover') return keywordFiltered.slice(0, Math.min(6, keywordFiltered.length));
  if (navKey === 'radio') return keywordFiltered.filter((_, index) => index % 2 === 0);
  return keywordFiltered;
});

const filteredTracks = computed(() => {
  const source = Array.isArray(music.homeData.value?.featuredTracks)
    ? music.homeData.value.featuredTracks
    : [];
  const navKey = String(music.ui.activeNav.value || 'recommend');
  const keyword = String(searchKeyword.value || '').trim().toLowerCase();
  const keywordFiltered = source.filter((item) => {
    const title = String(item?.title || '').toLowerCase();
    const artist = String(item?.artist || '').toLowerCase();
    return !keyword || title.includes(keyword) || artist.includes(keyword);
  });
  if (navKey === 'playlist') return keywordFiltered.slice(0, Math.min(18, keywordFiltered.length));
  if (navKey === 'discover') return keywordFiltered.slice(0, Math.min(12, keywordFiltered.length));
  if (navKey === 'radio') return keywordFiltered.filter((_, index) => index % 2 === 0);
  return keywordFiltered;
});

function coverStyle(item) {
  const raw = String(item?.cover || '').trim();
  const fallback = `${import.meta.env.BASE_URL}images/katanegai.jpg`;
  const url = raw || fallback;
  return {
    backgroundImage: `url('${url}')`
  };
}
</script>

<style scoped>
.music-center-view {
  display: grid;
  gap: 12px;
}

.home-toolbar {
  --liquid-bg: linear-gradient(145deg, rgba(22, 26, 38, 0.82), rgba(16, 20, 30, 0.78));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 12px 24px rgba(6, 8, 14, 0.3);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
}

.search-box {
  min-height: 38px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.1);
  padding: 0 12px;
  color: rgba(217, 228, 248, 0.88);
}

.search-box input {
  border: 0;
  outline: none;
  width: 100%;
  background: transparent;
  color: rgba(234, 241, 255, 0.94);
}

.toolbar-btn {
  border-radius: 10px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.12);
  color: rgba(236, 243, 255, 0.94);
  padding: 0 14px;
  min-height: 38px;
}

.state-text {
  margin: 0;
  font-size: 13px;
}

.state-text.error {
  color: #ff9cb8;
}

.panel {
  --liquid-bg: linear-gradient(145deg, rgba(19, 23, 34, 0.84), rgba(14, 18, 28, 0.8));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 12px 24px rgba(6, 8, 14, 0.3);
  border-radius: 14px;
  padding: 12px;
  display: grid;
  gap: 10px;
}

.panel-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.panel-head h2 {
  margin: 0;
  font-size: 18px;
  color: rgba(240, 246, 255, 0.95);
}

.panel-head span {
  font-size: 12px;
  color: rgba(184, 195, 220, 0.82);
}

.playlist-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(188px, 1fr));
  gap: 10px;
}

.playlist-card {
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(255, 255, 255, 0.07);
  color: rgba(234, 241, 255, 0.94);
  overflow: hidden;
  text-align: left;
}

.cover {
  width: 100%;
  aspect-ratio: 1 / 1;
  background-size: cover;
  background-position: center;
}

.meta {
  padding: 8px;
  display: grid;
  gap: 4px;
}

.meta p {
  margin: 0;
}

.meta .name {
  font-size: 13px;
  color: rgba(244, 248, 255, 0.96);
}

.meta .desc {
  font-size: 11px;
  color: rgba(181, 192, 216, 0.84);
}

.table-head,
.table-row {
  display: grid;
  grid-template-columns: 48px minmax(0, 2fr) minmax(0, 1fr) 72px;
  gap: 8px;
  align-items: center;
}

.table-head {
  padding: 8px 10px;
  border-bottom: 1px solid rgba(255, 255, 255, 0.14);
  color: rgba(188, 199, 221, 0.84);
  font-size: 12px;
}

.table-row {
  border: 0;
  border-radius: 10px;
  padding: 8px 10px;
  background: rgba(255, 255, 255, 0.04);
  color: rgba(234, 240, 255, 0.92);
  text-align: left;
}

.table-row + .table-row {
  margin-top: 6px;
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

.empty-state {
  border-radius: 10px;
  border: 1px dashed rgba(255, 255, 255, 0.24);
  color: rgba(184, 196, 221, 0.84);
  min-height: 84px;
  display: grid;
  place-items: center;
}

@media (max-width: 900px) {
  .home-toolbar {
    grid-template-columns: 1fr;
  }

  .playlist-grid {
    grid-template-columns: repeat(auto-fill, minmax(148px, 1fr));
  }
}
</style>
