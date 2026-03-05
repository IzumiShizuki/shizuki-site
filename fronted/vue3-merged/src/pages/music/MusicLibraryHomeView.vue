<template>
  <section class="music-center-view music-home-view">
    <p v-if="displayErrorText" class="state-text error">{{ displayErrorText }}</p>

    <template v-if="music.hasActiveSearch.value">
      <section class="panel liquid-material">
        <header class="panel-head">
          <h2>搜索结果</h2>
          <span>{{ searchSummaryText }}</span>
        </header>

        <p v-if="music.searchResult.value?.partial" class="state-text">
          部分平台返回失败：{{ failedProvidersText }}
        </p>

        <section v-if="showPlaylistResults" class="provider-block">
          <div class="provider-head">
            <h3>歌单</h3>
            <span>{{ visibleSearchPlaylists.length }}</span>
          </div>
          <div v-if="!visibleSearchPlaylists.length" class="empty-state compact">暂无匹配歌单</div>
          <div
            ref="searchPlaylistRowRef"
            class="playlist-grid"
            :class="{ 'playlist-grid-single-row': searchType === 'all' }"
            :style="searchType === 'all' ? playlistRowStyle : null"
          >
            <button
              v-for="item in visibleSearchPlaylists"
              :key="`search-playlist-${item.playlistCode}`"
              class="playlist-card ripple-trigger"
              :class="{ opening: openingPlaylistCode === item.playlistCode }"
              type="button"
              @click="handleOpenPlaylist(item.playlistCode)"
            >
              <div class="cover" :style="coverStyle(item)"></div>
              <div class="meta">
                <p class="name">{{ item.name || '未命名歌单' }}</p>
                <p class="desc">{{ item.description || '点击进入歌单详情' }}</p>
                <button
                  v-if="shouldShowDescExpand(item)"
                  class="desc-expand-btn ripple-trigger"
                  type="button"
                  @click.stop="openDescriptionPopover($event, item)"
                >
                  展开
                </button>
              </div>
            </button>
          </div>
          <footer v-if="showAllPlaylistPager" class="search-section-pager">
            <p v-if="music.searchSectionLoading.value?.playlists" class="pager-text">
              <i class="fas fa-spinner fa-spin"></i>
              加载更多歌单中...
            </p>
            <button
              v-else-if="playlistCanLoadMore"
              class="pager-load-btn ripple-trigger"
              type="button"
              @click="music.loadMoreMusicSearchSection('playlists')"
            >
              显示更多歌单
            </button>
            <button
              v-if="music.searchSectionError.value?.playlists"
              class="pager-retry-btn ripple-trigger"
              type="button"
              @click="music.retryMusicSearchLoadMore('playlists')"
            >
              {{ music.searchSectionError.value.playlists }}
            </button>
          </footer>
        </section>

        <section v-if="showTrackResults" class="provider-block">
          <div class="provider-head">
            <h3>歌曲</h3>
            <span>{{ visibleSearchTracks.length }}</span>
          </div>
          <div class="table-head search-track-head">
            <span>#</span>
            <span>标题</span>
            <span>歌手</span>
            <span>平台</span>
            <span>时长</span>
            <span>操作</span>
          </div>
          <div v-if="!visibleSearchTracks.length" class="empty-state compact">暂无匹配歌曲</div>
          <article
            v-for="(item, index) in visibleSearchTracks"
            :key="`search-track-${item.trackId || item.id || index}`"
            class="table-row search-track-row ripple-trigger"
            @click="music.playSearchTrack(item, index)"
          >
            <span>{{ String(index + 1).padStart(2, '0') }}</span>
            <span class="title-col track-title-col">
              <span class="track-cover" :class="{ empty: !item.cover }" :style="trackCoverStyle(item)"></span>
              <span class="track-title-text">{{ item.title || '未知标题' }}</span>
            </span>
            <span class="artist-col">{{ item.artist || '未知歌手' }}</span>
            <span>{{ item.provider || '-' }}</span>
            <span>{{ item.durationLabel || '--:--' }}</span>
            <span class="row-actions">
              <button
                class="track-action-btn ripple-trigger"
                type="button"
                :title="music.isTrackLiked(item.trackId || item.id) ? '取消红心' : '加入红心'"
                @click.stop="music.toggleTrackLike(item)"
              >
                <i class="fas" :class="music.isTrackLiked(item.trackId || item.id) ? 'fa-heart liked' : 'fa-heart-crack'"></i>
              </button>
              <button
                class="track-action-btn ripple-trigger"
                type="button"
                title="下一首播放"
                @click.stop="music.enqueueSearchTrackNext(item, index)"
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
          <footer v-if="showAllTrackPager" class="search-section-pager">
            <p v-if="music.searchSectionLoading.value?.tracks" class="pager-text">
              <i class="fas fa-spinner fa-spin"></i>
              加载更多歌曲中...
            </p>
            <button
              v-else-if="trackCanLoadMore"
              class="pager-load-btn ripple-trigger"
              type="button"
              @click="music.loadMoreMusicSearchSection('tracks')"
            >
              显示更多歌曲
            </button>
            <button
              v-if="music.searchSectionError.value?.tracks"
              class="pager-retry-btn ripple-trigger"
              type="button"
              @click="music.retryMusicSearchLoadMore('tracks')"
            >
              {{ music.searchSectionError.value.tracks }}
            </button>
          </footer>
        </section>

        <section v-if="showArtistResults" class="provider-block">
          <div class="provider-head">
            <h3>歌手</h3>
            <span>{{ visibleSearchArtists.length }}</span>
          </div>
          <div v-if="!visibleSearchArtists.length" class="empty-state compact">暂无匹配歌手</div>
          <div class="artist-grid">
            <article v-for="item in visibleSearchArtists" :key="`search-artist-${item.name}`" class="artist-card">
              <p class="artist-name">{{ item.name }}</p>
              <p class="artist-meta">{{ item.hitCount }} 首 · {{ (item.providers || []).join(' / ') || '-' }}</p>
            </article>
          </div>
          <footer v-if="showAllArtistPager" class="search-section-pager">
            <p v-if="music.searchSectionLoading.value?.artists" class="pager-text">
              <i class="fas fa-spinner fa-spin"></i>
              加载更多歌手中...
            </p>
            <button
              v-else-if="artistCanLoadMore"
              class="pager-load-btn ripple-trigger"
              type="button"
              @click="music.loadMoreMusicSearchSection('artists')"
            >
              显示更多歌手
            </button>
            <button
              v-if="music.searchSectionError.value?.artists"
              class="pager-retry-btn ripple-trigger"
              type="button"
              @click="music.retryMusicSearchLoadMore('artists')"
            >
              {{ music.searchSectionError.value.artists }}
            </button>
          </footer>
        </section>

        <teleport to="body">
          <div
            v-if="descriptionPopover.visible"
            ref="descriptionPopoverRef"
            class="playlist-desc-popover liquid-material"
            :style="descriptionPopoverStyle"
            role="dialog"
            aria-live="polite"
          >
            <header>
              <p>{{ descriptionPopover.title || '歌单简介' }}</p>
              <button type="button" class="close-btn ripple-trigger" @click="closeDescriptionPopover">×</button>
            </header>
            <div class="body">{{ descriptionPopover.description }}</div>
          </div>
        </teleport>

        <footer v-if="showSearchPager" class="search-pager">
          <p v-if="music.searchLoadingMore.value" class="pager-text">
            <i class="fas fa-spinner fa-spin"></i>
            加载更多中...
          </p>
          <button
            v-else
            class="pager-load-btn ripple-trigger"
            type="button"
            @click="music.loadMoreMusicSearch()"
          >
            加载更多
          </button>
          <button
            v-if="music.searchLoadingMoreError.value"
            class="pager-retry-btn ripple-trigger"
            type="button"
            @click="music.retryMusicSearchLoadMore()"
          >
            {{ music.searchLoadingMoreError.value }}
          </button>
        </footer>
      </section>
    </template>

    <template v-else-if="navKey === 'recommend'">
      <section class="panel liquid-material">
        <header class="panel-head">
          <h2>TuneHub 歌单</h2>
          <span>{{ filteredTunehubPlaylists.length }} 个</span>
        </header>

        <div v-if="!filteredTunehubPlaylists.length && !music.homeLoading.value" class="empty-state">
          暂无可展示 TuneHub 歌单
        </div>

        <div class="playlist-grid">
          <button
            v-for="item in filteredTunehubPlaylists"
            :key="item.playlistCode"
            class="playlist-card ripple-trigger"
            :class="{ opening: openingPlaylistCode === item.playlistCode }"
            type="button"
            @click="handleOpenPlaylist(item.playlistCode)"
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
          <h2>Spotify 歌单</h2>
          <span>即将接入</span>
        </header>

        <div class="playlist-grid">
          <article v-for="item in spotifyPlaceholderPlaylists" :key="item.id" class="playlist-card is-placeholder">
            <div class="cover placeholder-cover" :style="{ backgroundImage: item.cover ? `url('${item.cover}')` : '' }"></div>
            <div class="meta">
              <p class="name">{{ item.name }}</p>
              <p class="desc">{{ item.description }}</p>
            </div>
          </article>
        </div>
      </section>

      <section class="panel liquid-material">
        <header class="panel-head">
          <h2>主列表推荐</h2>
          <span>{{ filteredTracks.length }} 首</span>
        </header>

        <div class="table-head recommend-track-head">
          <span>#</span>
          <span>标题</span>
          <span>歌手</span>
          <span>时长</span>
          <span>操作</span>
        </div>

        <div v-if="!filteredTracks.length && !music.homeLoading.value" class="empty-state">
          暂无推荐歌曲
        </div>

        <article
          v-for="(item, index) in filteredTracks"
          :key="`home-track-${item.trackId || item.id || index}`"
          class="table-row recommend-track-row ripple-trigger"
          @click="music.playFeaturedTrack(item, index)"
        >
          <span>{{ String(index + 1).padStart(2, '0') }}</span>
          <span class="title-col">{{ item.title || '未知标题' }}</span>
          <span class="artist-col">{{ item.artist || '未知歌手' }}</span>
          <span>{{ item.duration || item.durationLabel || '--:--' }}</span>
          <span class="row-actions">
            <button
              class="track-action-btn ripple-trigger"
              type="button"
              :title="music.isTrackLiked(item.trackId || item.id) ? '取消红心' : '加入红心'"
              @click.stop="music.toggleTrackLike(item)"
            >
              <i class="fas" :class="music.isTrackLiked(item.trackId || item.id) ? 'fa-heart liked' : 'fa-heart-crack'"></i>
            </button>
            <button
              class="track-action-btn ripple-trigger"
              type="button"
              title="下一首播放"
              @click.stop="music.enqueueFeaturedTrackNext(item, index)"
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
      </section>
    </template>

    <template v-else-if="navKey === 'playlist'">
      <section class="panel liquid-material">
        <header class="panel-head">
          <h2>歌单总览</h2>
          <span>TuneHub + Spotify 占位</span>
        </header>

        <section class="provider-block">
          <div class="provider-head">
            <h3>我收藏的歌单</h3>
            <span>{{ userCollectedPlaylists.length }}</span>
          </div>
          <div v-if="!userCollectedPlaylists.length" class="empty-state compact">
            暂无收藏歌单
          </div>
          <div class="playlist-grid">
            <button
              v-for="item in userCollectedPlaylists"
              :key="`playlist-collected-${item.playlistCode}`"
              class="playlist-card ripple-trigger"
              :class="{ opening: openingPlaylistCode === item.playlistCode }"
              type="button"
              @click="handleOpenPlaylist(item.playlistCode)"
            >
              <div class="cover" :style="coverStyle(item)"></div>
              <div class="meta">
                <p class="name">{{ item.name || '未命名歌单' }}</p>
                <p class="desc">{{ item.description || '点击进入歌单详情' }}</p>
              </div>
            </button>
          </div>
        </section>

        <section class="provider-block">
          <div class="provider-head">
            <h3>TuneHub</h3>
            <span>{{ filteredTunehubPlaylists.length }}</span>
          </div>
          <div v-if="!filteredTunehubPlaylists.length && !music.homeLoading.value" class="empty-state compact">
            暂无 TuneHub 歌单
          </div>
          <div class="playlist-grid">
            <button
              v-for="item in filteredTunehubPlaylists"
              :key="`playlist-only-${item.playlistCode}`"
              class="playlist-card ripple-trigger"
              :class="{ opening: openingPlaylistCode === item.playlistCode }"
              type="button"
              @click="handleOpenPlaylist(item.playlistCode)"
            >
              <div class="cover" :style="coverStyle(item)"></div>
              <div class="meta">
                <p class="name">{{ item.name || '未命名歌单' }}</p>
                <p class="desc">{{ item.description || '点击进入歌单详情' }}</p>
              </div>
            </button>
          </div>
        </section>

        <section class="provider-block">
          <div class="provider-head">
            <h3>Spotify</h3>
            <span>占位</span>
          </div>
          <div class="playlist-grid">
            <article v-for="item in spotifyPlaceholderPlaylists" :key="`playlist-spotify-${item.id}`" class="playlist-card is-placeholder">
              <div class="cover placeholder-cover" :style="{ backgroundImage: item.cover ? `url('${item.cover}')` : '' }"></div>
              <div class="meta">
                <p class="name">{{ item.name }}</p>
                <p class="desc">{{ item.description }}</p>
              </div>
            </article>
          </div>
        </section>
      </section>
    </template>

    <template v-else>
      <section class="panel liquid-material">
        <header class="panel-head">
          <h2>播客（预留）</h2>
          <span>伪界面</span>
        </header>

        <div class="podcast-grid">
          <article v-for="item in filteredPodcastCards" :key="item.id" class="podcast-card">
            <div class="podcast-thumb" :style="{ backgroundImage: item.cover ? `url('${item.cover}')` : '' }"></div>
            <div class="podcast-meta">
              <p class="podcast-title">{{ item.title }}</p>
              <p class="podcast-desc">{{ item.description }}</p>
            </div>
          </article>
        </div>

        <p class="podcast-note">当前播客区域为占位，后续可接入网易云 API。</p>
      </section>
    </template>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import TrackCollectButton from '../../components/music/TrackCollectButton.vue';
import {
  estimatePlaylistRowCapacity as estimatePlaylistRowCapacityByWidth,
  normalizePlaylistRowCapacity
} from '../../utils/musicSearchAllLayout';

const music = useMusicLibraryContext();
const openingPlaylistCode = ref('');
const searchPlaylistRowRef = ref(null);
const descriptionPopoverRef = ref(null);
const descriptionPopover = ref({
  visible: false,
  title: '',
  description: '',
  top: 24,
  left: 24,
  width: 320
});
const playlistRowCapacity = ref(Number(music.searchPlaylistRowCapacity?.value || 3) || 3);
const OPEN_PLAYLIST_ANIMATION_MS = 320;
const PLAYLIST_DESC_EXPAND_THRESHOLD = 36;
const PLAYLIST_CARD_MIN_WIDTH = 188;
const PLAYLIST_CARD_GAP = 10;
let openPlaylistTimer = 0;
let playlistRowResizeObserver = null;

const SPOTIFY_PLACEHOLDER = [
  { id: 'sp-1', name: 'Spotify 热门精选', description: '即将接入 Spotify 歌单能力', cover: '' },
  { id: 'sp-2', name: 'Spotify 沉浸电子', description: '后续支持拉取官方歌单', cover: '' },
  { id: 'sp-3', name: 'Spotify 日推占位', description: '连接后可按账号推荐', cover: '' }
];

const PODCAST_PLACEHOLDER = [
  { id: 'pod-1', title: '夜间电台（预留）', description: '后续接入外部播客源后可播放', cover: '' },
  { id: 'pod-2', title: '学习频道（预留）', description: '暂为静态占位，不调用外部 API', cover: '' },
  { id: 'pod-3', title: '通勤资讯（预留）', description: '后续可接入网易云播客能力', cover: '' }
];

const navKey = computed(() => String(music.ui.activeNav.value || 'recommend'));

const filteredTunehubPlaylists = computed(() => {
  return Array.isArray(music.homeData.value?.featuredPlaylists) ? music.homeData.value.featuredPlaylists : [];
});

const filteredTracks = computed(() => {
  return Array.isArray(music.homeData.value?.featuredTracks) ? music.homeData.value.featuredTracks : [];
});

const spotifyPlaceholderPlaylists = computed(() => SPOTIFY_PLACEHOLDER);
const filteredPodcastCards = computed(() => PODCAST_PLACEHOLDER);
const collectPlaylistTargets = computed(() =>
  (Array.isArray(music.collectPlaylistTargets?.value) ? music.collectPlaylistTargets.value : [])
);
const userCollectedPlaylists = computed(() =>
  (Array.isArray(music.collectedPlaylists?.value) ? music.collectedPlaylists.value : [])
);
const searchType = computed(() => String(music.ui.globalSearchType.value || 'all'));
const searchPlaylists = computed(() => (Array.isArray(music.searchResult.value?.playlists) ? music.searchResult.value.playlists : []));
const searchTracks = computed(() => (Array.isArray(music.searchResult.value?.tracks) ? music.searchResult.value.tracks : []));
const searchArtists = computed(() => (Array.isArray(music.searchResult.value?.artists) ? music.searchResult.value.artists : []));
const searchAllVisibleCount = computed(() => {
  const raw = music.searchAllVisibleCount?.value || {};
  return {
    playlists: Number.isFinite(Number(raw.playlists)) ? Math.max(0, Number(raw.playlists)) : 4,
    tracks: Number.isFinite(Number(raw.tracks)) ? Math.max(0, Number(raw.tracks)) : 10,
    artists: Number.isFinite(Number(raw.artists)) ? Math.max(0, Number(raw.artists)) : 10
  };
});
const visibleSearchPlaylists = computed(() => {
  if (searchType.value !== 'all') return searchPlaylists.value;
  const configured = Math.max(1, Number(searchAllVisibleCount.value.playlists || 1));
  const capacity = Math.max(1, Number(playlistRowCapacity.value || configured));
  return searchPlaylists.value.slice(0, Math.min(configured, capacity));
});
const visibleSearchTracks = computed(() => {
  if (searchType.value !== 'all') return searchTracks.value;
  return searchTracks.value.slice(0, searchAllVisibleCount.value.tracks);
});
const visibleSearchArtists = computed(() => {
  if (searchType.value !== 'all') return searchArtists.value;
  return searchArtists.value.slice(0, searchAllVisibleCount.value.artists);
});
const hiddenPlaylistsCount = computed(() => Math.max(0, searchPlaylists.value.length - visibleSearchPlaylists.value.length));
const hiddenTracksCount = computed(() => Math.max(0, searchTracks.value.length - visibleSearchTracks.value.length));
const hiddenArtistsCount = computed(() => Math.max(0, searchArtists.value.length - visibleSearchArtists.value.length));
const failedProvidersText = computed(() => {
  const list = Array.isArray(music.searchResult.value?.failedProviders) ? music.searchResult.value.failedProviders : [];
  return list.length ? list.join(' / ') : '-';
});
const showPlaylistResults = computed(() => searchType.value === 'all' || searchType.value === 'playlist');
const showTrackResults = computed(() => searchType.value === 'all' || searchType.value === 'track');
const showArtistResults = computed(() => searchType.value === 'all' || searchType.value === 'artist');
const showSearchPager = computed(() => {
  if (searchType.value === 'all') return false;
  const hasMore = music.searchHasMore?.value || {};
  if (music.searchLoadingMore?.value) return true;
  if (searchType.value === 'playlist') return Boolean(hasMore.playlists);
  if (searchType.value === 'artist') return Boolean(hasMore.artists);
  return Boolean(hasMore.tracks);
});
const playlistRowStyle = computed(() => {
  const cardCount = Math.max(1, visibleSearchPlaylists.value.length || playlistRowCapacity.value || 1);
  return {
    '--playlist-row-capacity': String(cardCount)
  };
});
const descriptionPopoverStyle = computed(() => ({
  top: `${descriptionPopover.value.top}px`,
  left: `${descriptionPopover.value.left}px`,
  width: `${descriptionPopover.value.width}px`
}));
const playlistCanLoadMore = computed(() => hiddenPlaylistsCount.value > 0 || Boolean(music.searchHasMore.value?.playlists));
const trackCanLoadMore = computed(() => hiddenTracksCount.value > 0 || Boolean(music.searchHasMore.value?.tracks));
const artistCanLoadMore = computed(() => hiddenArtistsCount.value > 0 || Boolean(music.searchHasMore.value?.artists));
const showAllPlaylistPager = computed(
  () =>
    searchType.value === 'all' &&
    (playlistCanLoadMore.value || Boolean(music.searchSectionLoading.value?.playlists) || Boolean(music.searchSectionError.value?.playlists))
);
const showAllTrackPager = computed(
  () =>
    searchType.value === 'all' &&
    (trackCanLoadMore.value || Boolean(music.searchSectionLoading.value?.tracks) || Boolean(music.searchSectionError.value?.tracks))
);
const showAllArtistPager = computed(
  () =>
    searchType.value === 'all' &&
    (artistCanLoadMore.value || Boolean(music.searchSectionLoading.value?.artists) || Boolean(music.searchSectionError.value?.artists))
);
const searchSummaryText = computed(() => {
  const playlistCount = visibleSearchPlaylists.value.length;
  const trackCount = visibleSearchTracks.value.length;
  const artistCount = visibleSearchArtists.value.length;
  return `歌单 ${playlistCount} · 歌曲 ${trackCount} · 歌手 ${artistCount}`;
});
const displayErrorText = computed(() => {
  if (music.hasActiveSearch.value) {
    return String(music.searchError.value || '').trim();
  }
  return String(music.homeError.value || '').trim();
});

function coverStyle(item) {
  const url = safeCoverUrl(item?.cover);
  return {
    backgroundImage: url ? `url('${url}')` : 'none'
  };
}

function trackCoverStyle(item) {
  const url = safeCoverUrl(item?.cover);
  return {
    backgroundImage: url ? `url('${url}')` : 'none'
  };
}

function safeCoverUrl(rawUrl) {
  const raw = String(rawUrl || '').trim();
  if (!raw) return '';
  const escaped = raw.replace(/\\/g, '\\\\').replace(/'/g, "\\'");
  return encodeURI(escaped);
}

function prefersReducedMotion() {
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') return false;
  return window.matchMedia('(prefers-reduced-motion: reduce)').matches;
}

function handleOpenPlaylist(playlistCode) {
  const code = String(playlistCode || '').trim();
  if (!code) return;
  if (openPlaylistTimer) {
    window.clearTimeout(openPlaylistTimer);
    openPlaylistTimer = 0;
  }
  openingPlaylistCode.value = code;
  const delay = prefersReducedMotion() ? 0 : OPEN_PLAYLIST_ANIMATION_MS;
  openPlaylistTimer = window.setTimeout(() => {
    openPlaylistTimer = 0;
    closeDescriptionPopover();
    music.openPlaylistDetail(code);
  }, delay);
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

function computePlaylistRowCapacity(width) {
  return estimatePlaylistRowCapacityByWidth(width, {
    cardMinWidth: PLAYLIST_CARD_MIN_WIDTH,
    gap: PLAYLIST_CARD_GAP,
    min: 1,
    max: 12,
    fallback: normalizePlaylistRowCapacity(playlistRowCapacity.value)
  });
}

function syncSearchPlaylistRowCapacity() {
  if (searchType.value !== 'all' || !music.hasActiveSearch.value) return;
  const element = searchPlaylistRowRef.value;
  if (!element) return;
  const nextCapacity = computePlaylistRowCapacity(element.clientWidth);
  if (nextCapacity === playlistRowCapacity.value) return;
  playlistRowCapacity.value = nextCapacity;
  if (typeof music.setSearchPlaylistRowCapacity === 'function') {
    music.setSearchPlaylistRowCapacity(nextCapacity);
  }
}

function stopObservePlaylistRow() {
  if (!playlistRowResizeObserver) return;
  playlistRowResizeObserver.disconnect();
  playlistRowResizeObserver = null;
}

async function startObservePlaylistRow() {
  await nextTick();
  const element = searchPlaylistRowRef.value;
  if (!element) return;
  syncSearchPlaylistRowCapacity();
  if (typeof window === 'undefined' || typeof ResizeObserver === 'undefined') return;
  stopObservePlaylistRow();
  playlistRowResizeObserver = new ResizeObserver(() => {
    syncSearchPlaylistRowCapacity();
  });
  playlistRowResizeObserver.observe(element);
}

function shouldShowDescExpand(item) {
  return String(item?.description || '').trim().length > PLAYLIST_DESC_EXPAND_THRESHOLD;
}

function openDescriptionPopover(event, item) {
  const trigger = event?.currentTarget;
  const rect = trigger?.getBoundingClientRect?.();
  const description = String(item?.description || '').trim();
  if (!description) return;
  const width = 340;
  const safeTop = rect ? Math.min(window.innerHeight - 220, rect.bottom + 8) : 24;
  const safeLeft = rect ? Math.min(window.innerWidth - width - 16, Math.max(16, rect.left)) : 24;
  descriptionPopover.value = {
    visible: true,
    title: String(item?.name || '歌单简介'),
    description,
    top: Math.max(16, safeTop),
    left: Math.max(16, safeLeft),
    width
  };
}

function closeDescriptionPopover() {
  if (!descriptionPopover.value.visible) return;
  descriptionPopover.value = {
    visible: false,
    title: '',
    description: '',
    top: 24,
    left: 24,
    width: 320
  };
}

function handleGlobalPointerDown(event) {
  if (!descriptionPopover.value.visible) return;
  const node = descriptionPopoverRef.value;
  if (node && node.contains(event.target)) return;
  closeDescriptionPopover();
}

function handleGlobalKeydown(event) {
  if (event?.key === 'Escape') {
    closeDescriptionPopover();
  }
}

watch(
  () => [music.hasActiveSearch.value, searchType.value, showPlaylistResults.value],
  async ([activeSearch, type, showPlaylists]) => {
    if (activeSearch && showPlaylists && type === 'all') {
      await startObservePlaylistRow();
      return;
    }
    stopObservePlaylistRow();
  },
  { immediate: true }
);

watch(
  () => music.searchPlaylistRowCapacity?.value,
  (next) => {
    const normalized = normalizePlaylistRowCapacity(next, { min: 1, max: 12, fallback: 3 });
    if (normalized !== playlistRowCapacity.value) {
      playlistRowCapacity.value = normalized;
    }
  }
);

onMounted(() => {
  if (typeof window === 'undefined') return;
  window.addEventListener('pointerdown', handleGlobalPointerDown, true);
  window.addEventListener('keydown', handleGlobalKeydown);
});

onBeforeUnmount(() => {
  stopObservePlaylistRow();
  closeDescriptionPopover();
  if (typeof window !== 'undefined') {
    window.removeEventListener('pointerdown', handleGlobalPointerDown, true);
    window.removeEventListener('keydown', handleGlobalKeydown);
  }
  if (openPlaylistTimer) {
    window.clearTimeout(openPlaylistTimer);
    openPlaylistTimer = 0;
  }
});
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
  border-radius: 12px;
  padding: 8px 10px;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
}

.search-box {
  min-height: 32px;
  height: 32px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  border-radius: 14px;
  border: 1px solid rgba(255, 255, 255, 0.16);
  background: rgba(255, 255, 255, 0.1);
  padding: 0 10px;
  color: rgba(217, 228, 248, 0.88);
}

.search-box i {
  font-size: 12px;
  opacity: 0.84;
}

.search-box input {
  border: 0;
  outline: none;
  width: 100%;
  background: transparent;
  color: rgba(234, 241, 255, 0.94);
  font-size: 12px;
  line-height: 1;
}

.toolbar-btn {
  border-radius: 10px;
  border: 1px solid rgba(var(--accent-rgb), 0.52);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(var(--accent-soft-rgb), 0.96);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.24);
  padding: 0 12px;
  min-height: 32px;
}

.state-text {
  margin: 0;
  font-size: 13px;
}

.state-text.error {
  color: rgba(var(--accent-soft-rgb), 0.98);
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

.provider-block {
  display: grid;
  gap: 8px;
}

.provider-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.provider-head h3 {
  margin: 0;
  font-size: 14px;
  color: rgba(238, 244, 255, 0.94);
}

.provider-head span {
  font-size: 12px;
  color: rgba(184, 195, 220, 0.82);
}

.playlist-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(188px, 1fr));
  gap: 10px;
}

.playlist-grid-single-row {
  grid-template-columns: repeat(var(--playlist-row-capacity, 1), minmax(0, 1fr));
  grid-auto-rows: 1fr;
  overflow: hidden;
}

.playlist-card {
  position: relative;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  background: rgba(255, 255, 255, 0.07);
  color: rgba(234, 241, 255, 0.94);
  overflow: hidden;
  text-align: left;
  min-height: 278px;
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
}

.playlist-card.opening {
  transform: translateY(-5px) scale(1.035);
  box-shadow:
    0 0 0 1px rgba(var(--accent-rgb), 0.42),
    0 14px 28px rgba(var(--accent-rgb), 0.34);
  filter: saturate(1.12) brightness(1.06);
}

.playlist-card.is-placeholder {
  opacity: 0.84;
}

.cover {
  width: 100%;
  aspect-ratio: 1 / 1;
  background-size: cover;
  background-position: center;
}

.placeholder-cover {
  background-image: linear-gradient(135deg, rgba(var(--accent-rgb), 0.24), rgba(var(--accent-soft-rgb), 0.18));
}

.meta {
  padding: 8px;
  display: grid;
  gap: 6px;
  align-content: start;
}

.meta p {
  margin: 0;
}

.meta .name {
  font-size: 13px;
  color: rgba(244, 248, 255, 0.96);
  min-height: 20px;
  line-height: 20px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.meta .desc {
  font-size: 11px;
  color: rgba(181, 192, 216, 0.84);
  line-height: 1.4;
  min-height: calc(1.4em * 2);
  display: -webkit-box;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
  overflow: hidden;
  text-overflow: ellipsis;
}

.desc-expand-btn {
  justify-self: start;
  height: 24px;
  padding: 0 10px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(227, 236, 255, 0.92);
  font-size: 11px;
}

.playlist-desc-popover {
  position: fixed;
  z-index: 1200;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(16, 22, 35, 0.95);
  box-shadow: 0 20px 40px rgba(0, 0, 0, 0.36);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.playlist-desc-popover header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.playlist-desc-popover header p {
  margin: 0;
  font-size: 13px;
  color: rgba(244, 248, 255, 0.96);
  font-weight: 600;
}

.playlist-desc-popover .body {
  font-size: 12px;
  line-height: 1.5;
  color: rgba(201, 212, 236, 0.9);
  max-height: 240px;
  overflow-y: auto;
}

.playlist-desc-popover .close-btn {
  width: 24px;
  height: 24px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(220, 231, 255, 0.9);
  font-size: 16px;
  line-height: 1;
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
  cursor: pointer;
}

.table-row + .table-row {
  margin-top: 6px;
}

.search-track-head,
.search-track-row {
  grid-template-columns: 48px minmax(0, 2.1fr) minmax(0, 1fr) 84px 72px 132px;
}

.recommend-track-head,
.recommend-track-row {
  grid-template-columns: 48px minmax(0, 2.1fr) minmax(0, 1fr) 72px 132px;
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

.track-title-text {
  min-width: 0;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
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

.search-pager {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-wrap: wrap;
  gap: 8px;
  padding-top: 4px;
}

.search-section-pager {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-wrap: wrap;
  gap: 8px;
  padding-top: 2px;
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

.pager-retry-btn {
  min-height: 30px;
  border-radius: 999px;
  border: 1px solid rgba(255, 164, 189, 0.62);
  background: rgba(255, 132, 167, 0.2);
  color: rgba(255, 223, 234, 0.98);
  padding: 0 14px;
  font-size: 12px;
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

.podcast-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(220px, 1fr));
  gap: 10px;
}

.artist-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(180px, 1fr));
  gap: 10px;
}

.artist-card {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.07);
  padding: 10px;
}

.artist-name {
  margin: 0;
  font-size: 14px;
  color: rgba(244, 248, 255, 0.95);
}

.artist-meta {
  margin: 6px 0 0;
  font-size: 12px;
  color: rgba(179, 190, 214, 0.84);
}

.podcast-card {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.07);
  overflow: hidden;
}

.podcast-thumb {
  width: 100%;
  aspect-ratio: 16 / 9;
  background: linear-gradient(135deg, rgba(var(--accent-rgb), 0.2), rgba(var(--accent-soft-rgb), 0.16));
  background-size: cover;
  background-position: center;
}

.podcast-meta {
  padding: 10px;
  display: grid;
  gap: 4px;
}

.podcast-title {
  margin: 0;
  font-size: 13px;
  color: rgba(244, 248, 255, 0.95);
}

.podcast-desc {
  margin: 0;
  font-size: 12px;
  color: rgba(179, 190, 214, 0.84);
}

.podcast-note {
  margin: 0;
  font-size: 12px;
  color: rgba(184, 196, 221, 0.84);
}

.empty-state {
  border-radius: 10px;
  border: 1px dashed rgba(255, 255, 255, 0.24);
  color: rgba(184, 196, 221, 0.84);
  min-height: 84px;
  display: grid;
  place-items: center;
}

.empty-state.compact {
  min-height: 68px;
}

@media (max-width: 900px) {
  .home-toolbar {
    grid-template-columns: 1fr;
  }

  .playlist-grid {
    grid-template-columns: repeat(auto-fill, minmax(148px, 1fr));
  }

  .playlist-grid-single-row {
    grid-template-columns: repeat(var(--playlist-row-capacity, 1), minmax(0, 1fr));
  }

  .podcast-grid {
    grid-template-columns: 1fr;
  }

  .search-track-head,
  .search-track-row {
    grid-template-columns: 40px minmax(0, 1.65fr) minmax(0, 0.9fr) 66px 58px 122px;
    gap: 6px;
  }

  .recommend-track-head,
  .recommend-track-row {
    grid-template-columns: 40px minmax(0, 1.65fr) minmax(0, 0.9fr) 66px 122px;
    gap: 6px;
  }
}
</style>
