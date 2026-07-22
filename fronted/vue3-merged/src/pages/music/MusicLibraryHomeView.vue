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
              <div class="cover" :class="{ empty: !item.cover }" :style="coverStyle(item)"></div>
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
            <span>歌曲</span>
            <span>歌手</span>
            <span>专辑</span>
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
              <span class="track-title-copy">
                <span class="track-title-text">{{ item.title || '未知标题' }}</span>
                <span class="provider-badge">{{ providerLabel(item.provider) }}</span>
              </span>
            </span>
            <span class="artist-col">{{ item.artist || '未知歌手' }}</span>
            <span class="album-col">{{ item.album || '未知专辑' }}</span>
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
                :can-collect="music.authState.value.isAuthenticated"
                @open="handleOpenCollectDialog"
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
      <section class="music-cozy-library cozy-home-block">
        <header class="music-cozy-hero liquid-material">
          <div class="hero-copy">
            <p class="eyebrow">SHIZUKI CLOUD MUSIC</p>
            <h1>{{ cozyHeroTitle }}</h1>
            <p>{{ cozyHeroDescription }}</p>
            <div class="mood-chip-row">
              <button
                v-for="item in cozyMoodChips"
                :key="item.key"
                class="mood-chip ripple-trigger"
                type="button"
                @click="handleMoodChip(item)"
              >
                {{ item.label }}
              </button>
            </div>
          </div>
          <article class="hero-now-card liquid-material">
            <p class="now-label">正在推荐</p>
            <h2 class="now-title">{{ cozyNowPlaying.title }}</h2>
            <p class="now-meta">{{ cozyNowPlaying.artist }} · {{ cozyNowPlaying.duration }}</p>
            <p class="now-note">{{ cozyNowPlaying.note }}</p>
            <button class="now-play-btn ripple-trigger" type="button" @click="playPrimaryRecommendation">
              <i class="fas" :class="music.player.currentTrack.value ? 'fa-expand' : 'fa-play'"></i>
              {{ music.player.currentTrack.value ? '打开正在播放' : '播放今日推荐' }}
            </button>
          </article>
        </header>

        <div class="music-cozy-grid">
          <button
            v-for="item in cozyFeaturedCards"
            :key="item.id"
            class="album-card liquid-material ripple-trigger"
            :class="{ 'is-static': !item.actionable }"
            type="button"
            :disabled="!item.actionable"
            @click="handleCozyCardClick(item)"
          >
            <div class="album-cover" :style="cozyCardCoverStyle(item)"></div>
            <div class="album-copy">
              <h2>{{ item.title }}</h2>
              <p>{{ item.description }}</p>
              <span class="album-tag">{{ item.tag }}</span>
            </div>
          </button>
        </div>
      </section>

      <MusicAccountSyncPanel
        :authenticated="music.authState.value.isAuthenticated"
        :account="neteaseAccount"
        :session="neteaseBindSession"
        :bind-busy="neteaseBindBusy"
        :sync-busy="neteaseSyncBusy"
        :sync-result="music.musicSourceSyncResult.value"
        :error-text="music.musicSourceSyncError.value"
        @require-login="music.requestMusicLogin()"
        @bind="music.bindMusicSourceAccount('netease')"
        @sync="music.importMusicSourcePlaylists('netease')"
        @open-settings="music.openMusicAuthorization()"
      />

      <section class="panel liquid-material">
        <header class="panel-head">
          <h2>推荐歌单</h2>
          <span>{{ filteredMetingPlaylists.length }} 个</span>
        </header>

        <div v-if="!filteredMetingPlaylists.length && !music.homeLoading.value" class="empty-state">
          暂无推荐歌单
        </div>

        <div class="playlist-grid">
          <button
            v-for="item in filteredMetingPlaylists"
            :key="item.playlistCode"
            class="playlist-card ripple-trigger"
            :class="{ opening: openingPlaylistCode === item.playlistCode }"
            type="button"
            @click="handleOpenPlaylist(item.playlistCode)"
          >
            <div class="cover" :class="{ empty: !item.cover }" :style="coverStyle(item)"></div>
            <div class="meta">
              <p class="name">{{ item.name || '未命名歌单' }}</p>
              <p class="desc">{{ item.description || '点击进入歌单详情' }}</p>
            </div>
          </button>
        </div>
      </section>

      <section class="panel liquid-material">
        <header class="panel-head">
          <h2>为你推荐</h2>
          <span>{{ filteredTracks.length }} 首</span>
        </header>

        <div class="table-head recommend-track-head">
          <span>#</span>
          <span>标题</span>
          <span>歌手</span>
          <span>专辑</span>
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
          <span class="title-col track-title-col">
            <span class="track-cover" :class="{ empty: !item.cover }" :style="trackCoverStyle(item)"></span>
            <span class="track-title-text">{{ item.title || '未知标题' }}</span>
          </span>
          <span class="artist-col">{{ item.artist || '未知歌手' }}</span>
          <span class="album-col">{{ item.album || '未知专辑' }}</span>
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
              :can-collect="music.authState.value.isAuthenticated"
              @open="handleOpenCollectDialog"
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
          <span>我的收藏与云端推荐</span>
        </header>

        <section class="provider-block">
          <div class="provider-head">
            <h3>我创建的歌单</h3>
            <span>{{ userCreatedPlaylists.length }}</span>
          </div>
          <div v-if="!userCreatedPlaylists.length" class="empty-state compact">
            暂无自建歌单，可从左侧新建
          </div>
          <div class="playlist-grid">
            <button
              v-for="item in userCreatedPlaylists"
              :key="`playlist-created-${item.playlistCode}`"
              class="playlist-card ripple-trigger"
              :class="{ opening: openingPlaylistCode === item.playlistCode }"
              type="button"
              @click="handleOpenPlaylist(item.playlistCode)"
            >
              <div class="cover" :class="{ empty: !item.cover }" :style="coverStyle(item)"></div>
              <div class="meta">
                <p class="name">{{ item.name || '未命名歌单' }}</p>
                <p class="desc">{{ item.description || `${item.trackCount || 0} 首歌曲` }}</p>
              </div>
            </button>
          </div>
        </section>

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
              <div class="cover" :class="{ empty: !item.cover }" :style="coverStyle(item)"></div>
              <div class="meta">
                <p class="name">{{ item.name || '未命名歌单' }}</p>
                <p class="desc">{{ item.description || '点击进入歌单详情' }}</p>
              </div>
            </button>
          </div>
        </section>

        <section class="provider-block">
          <div class="provider-head">
            <h3>为你推荐</h3>
            <span>{{ filteredMetingPlaylists.length }}</span>
          </div>
          <div v-if="!filteredMetingPlaylists.length && !music.homeLoading.value" class="empty-state compact">
            暂无推荐歌单
          </div>
          <div class="playlist-grid">
            <button
              v-for="item in filteredMetingPlaylists"
              :key="`playlist-only-${item.playlistCode}`"
              class="playlist-card ripple-trigger"
              :class="{ opening: openingPlaylistCode === item.playlistCode }"
              type="button"
              @click="handleOpenPlaylist(item.playlistCode)"
            >
              <div class="cover" :class="{ empty: !item.cover }" :style="coverStyle(item)"></div>
              <div class="meta">
                <p class="name">{{ item.name || '未命名歌单' }}</p>
                <p class="desc">{{ item.description || '点击进入歌单详情' }}</p>
              </div>
            </button>
          </div>
        </section>

      </section>
    </template>

    <template v-else>
      <section class="panel liquid-material listening-extension-panel">
        <header class="panel-head">
          <div>
            <p class="section-kicker">Radio / Voice</p>
            <h2>播客与音声延伸</h2>
          </div>
          <button
            class="inline-panel-action ripple-trigger"
            type="button"
            :disabled="listeningExtensionLoading"
            @click="loadListeningExtension({ force: true })"
          >
            {{ listeningExtensionLoading ? '刷新中...' : '刷新推荐' }}
          </button>
        </header>

        <p class="podcast-note">
          这里先复用现有音声接口形成真实内容流；网易云播客或独立 Podcast API 后续可接在同一层。
        </p>

        <div v-if="listeningExtensionLoading && !listeningExtensionWorks.length" class="empty-state">
          正在加载听觉延伸内容...
        </div>
        <p v-else-if="listeningExtensionError" class="state-text error">{{ listeningExtensionError }}</p>
        <div v-else-if="listeningExtensionWorks.length" class="listening-extension-grid">
          <button
            v-for="item in listeningExtensionWorks"
            :key="`extension-work-${item.workId}`"
            class="listening-card ripple-trigger"
            type="button"
            @click="openVoiceWork(item)"
          >
            <div class="listening-cover" :style="listeningCoverStyle(item)"></div>
            <div class="listening-copy">
              <p class="listening-title">{{ item.title }}</p>
              <p class="listening-desc">{{ item.description }}</p>
              <p class="listening-stats">{{ item.statLine || item.circle }}</p>
              <p class="listening-tags">{{ item.tagLine }}</p>
            </div>
          </button>
        </div>
        <div v-else class="empty-state">
          暂无可展示的音声延伸内容
        </div>
      </section>

      <section class="panel liquid-material">
        <header class="panel-head">
          <h2>外部播客源</h2>
          <span>预留</span>
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

        <p class="podcast-note">当前外部播客源仍为占位，后续可接入网易云 API。</p>
      </section>
    </template>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useRouter } from 'vue-router';
import { useMusicLibraryContext } from '../../composables/musicLibraryContext';
import MusicAccountSyncPanel from '../../components/music/MusicAccountSyncPanel.vue';
import TrackCollectButton from '../../components/music/TrackCollectButton.vue';
import * as musicApi from '../../services/musicApi';
import { normalizeListeningExtensionWorks } from '../../utils/musicListeningExtension';
import {
  estimatePlaylistRowCapacity as estimatePlaylistRowCapacityByWidth,
  normalizePlaylistRowCapacity
} from '../../utils/musicSearchAllLayout';

const router = useRouter();
const music = useMusicLibraryContext();
const openingPlaylistCode = ref('');
const searchPlaylistRowRef = ref(null);
const descriptionPopoverRef = ref(null);
const listeningExtensionLoading = ref(false);
const listeningExtensionError = ref('');
const listeningExtensionLoaded = ref(false);
const listeningExtensionWorks = ref([]);
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

const PODCAST_PLACEHOLDER = [
  { id: 'pod-1', title: '夜间电台（预留）', description: '后续接入外部播客源后可播放', cover: '' },
  { id: 'pod-2', title: '学习频道（预留）', description: '暂为静态占位，不调用外部 API', cover: '' },
  { id: 'pod-3', title: '通勤资讯（预留）', description: '后续可接入网易云播客能力', cover: '' }
];

const navKey = computed(() => String(music.ui.activeNav.value || 'recommend'));

const filteredMetingPlaylists = computed(() => {
  return Array.isArray(music.homeData.value?.featuredPlaylists) ? music.homeData.value.featuredPlaylists : [];
});

const filteredTracks = computed(() => {
  return Array.isArray(music.homeData.value?.featuredTracks) ? music.homeData.value.featuredTracks : [];
});

const filteredPodcastCards = computed(() => PODCAST_PLACEHOLDER);
const userCreatedPlaylists = computed(() =>
  (Array.isArray(music.createdPlaylists?.value) ? music.createdPlaylists.value : [])
);
const userCollectedPlaylists = computed(() =>
  (Array.isArray(music.collectedPlaylists?.value) ? music.collectedPlaylists.value : [])
);
const neteaseAccount = computed(() => music.musicSourceAccounts?.value?.netease || {});
const neteaseBindSession = computed(() => music.musicSourceBindSessions?.value?.netease || {});
const neteaseBindBusy = computed(() => Boolean(music.musicSourceBindBusyMap?.value?.netease));
const neteaseSyncBusy = computed(() => Boolean(music.musicSourceImportBusyMap?.value?.netease));
const cozyHeroTitle = computed(() => (filteredTracks.value.length ? '今天，从喜欢的音乐开始' : '推荐音乐正在准备中'));
const cozyHeroDescription = computed(() => {
  const playlistCount = filteredMetingPlaylists.value.length;
  const trackCount = filteredTracks.value.length;
  if (!playlistCount && !trackCount) {
    return '搜索多平台曲库、管理个人歌单，并把网易云收藏同步到本站音乐库。';
  }
  return `为你准备了 ${playlistCount} 个推荐歌单和 ${trackCount} 首歌曲；搜索、收藏、下一首播放与云歌单同步都在这里完成。`;
});
const cozyMoodChips = computed(() => {
  return [
    {
      key: 'playlists',
      label: filteredMetingPlaylists.value.length ? `${filteredMetingPlaylists.value.length} 个推荐歌单` : '浏览歌单',
      action: 'playlists'
    },
    {
      key: 'tracks',
      label: filteredTracks.value.length ? `${filteredTracks.value.length} 首今日推荐` : '刷新推荐',
      action: 'tracks'
    },
    {
      key: 'collections',
      label: userCollectedPlaylists.value.length ? `${userCollectedPlaylists.value.length} 个收藏歌单` : '我的歌单',
      action: 'collections'
    },
    {
      key: 'continue',
      label: music.player.currentTrack.value ? '继续播放' : '播放第一首',
      action: 'continue'
    }
  ];
});
const cozyNowPlaying = computed(() => {
  const track = filteredTracks.value[0] || null;
  return {
    title: String(track?.title || '今天想听点什么呀').trim() || '今天想听点什么呀',
    artist: String(track?.artist || 'Shizuki Music').trim() || 'Shizuki Music',
    duration: String(track?.duration || track?.durationLabel || '--:--').trim() || '--:--',
    note: filteredMetingPlaylists.value.length
      ? `另有 ${filteredMetingPlaylists.value.length} 个推荐歌单，可以直接从下方卡片进入。`
      : '推荐歌单还在加载中，稍后刷新后会出现在下方。'
  };
});
const cozyFeaturedCards = computed(() => {
  const cards = filteredMetingPlaylists.value.slice(0, 4).map((item, index) => ({
    id: `playlist-${item.playlistCode || item.id || item.name || index}`,
    title: String(item?.name || '未命名歌单').trim() || '未命名歌单',
    description: String(item?.description || '点击进入歌单详情').trim() || '点击进入歌单详情',
    tag: providerLabel(item?.sourceProvider || item?.provider) || '推荐歌单',
    cover: String(item?.cover || '').trim(),
    actionable: true,
    playlistCode: String(item?.playlistCode || '').trim()
  }));

  if (cards.length < 4) {
    filteredTracks.value.slice(0, 4 - cards.length).forEach((item, index) => {
      cards.push({
        id: `track-${item?.trackId || item?.id || index}`,
        title: String(item?.title || '未命名单曲').trim() || '未命名单曲',
        description: String(item?.artist || '点击直接播放当前推荐').trim() || '点击直接播放当前推荐',
        tag: '推荐单曲',
        cover: String(item?.cover || '').trim(),
        actionable: true,
        track: item,
        trackIndex: index
      });
    });
  }

  return cards.slice(0, 4);
});
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

function providerLabel(provider) {
  const normalized = String(provider || '').trim().toLowerCase();
  if (normalized === 'netease') return '网易云';
  if (normalized === 'qq' || normalized === 'qqmusic' || normalized === 'tencent') return 'QQ 音乐';
  if (normalized === 'kuwo') return '酷我';
  if (normalized === 'kugou') return '酷狗';
  if (normalized === 'spotify') return 'Spotify';
  if (normalized === 'local') return '本站';
  return normalized ? normalized.toUpperCase() : '';
}

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

function cozyCardCoverStyle(item) {
  const url = safeCoverUrl(item?.cover);
  return url ? { backgroundImage: `url('${url}')` } : {};
}

function listeningCoverStyle(item) {
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

function handleCozyCardClick(item) {
  if (!item?.actionable) return;
  if (item.playlistCode) {
    handleOpenPlaylist(item.playlistCode);
    return;
  }
  if (item.track && typeof music.playFeaturedTrack === 'function') {
    music.playFeaturedTrack(item.track, Number(item.trackIndex || 0));
  }
}

async function playPrimaryRecommendation() {
  if (music.player.currentTrack.value) {
    music.enterPlayerDetail();
    return;
  }
  const firstTrack = filteredTracks.value[0];
  if (firstTrack && typeof music.playFeaturedTrack === 'function') {
    await music.playFeaturedTrack(firstTrack, 0);
    return;
  }
  await music.reloadHomeData?.();
}

async function handleMoodChip(item) {
  const action = String(item?.action || '').trim();
  if (action === 'playlists') {
    music.ui.setActiveNav('playlist');
    return;
  }
  if (action === 'collections') {
    const firstCollected = userCollectedPlaylists.value[0];
    if (firstCollected?.playlistCode) {
      handleOpenPlaylist(firstCollected.playlistCode);
      return;
    }
    music.ui.setActiveNav('playlist');
    return;
  }
  if (action === 'tracks') {
    const firstTrack = filteredTracks.value[0];
    if (firstTrack) {
      await music.playFeaturedTrack(firstTrack, 0);
      return;
    }
    await music.reloadHomeData?.();
    return;
  }
  await playPrimaryRecommendation();
}

function parseErrorMessage(error, fallback = '听觉延伸内容加载失败，请稍后重试') {
  if (typeof error?.detail === 'string' && error.detail.trim()) return error.detail.trim();
  if (typeof error?.message === 'string' && error.message.trim()) return error.message.trim();
  return fallback;
}

async function loadListeningExtension(options = {}) {
  const force = options?.force === true;
  if (listeningExtensionLoading.value) return;
  if (listeningExtensionLoaded.value && !force) return;
  listeningExtensionLoading.value = true;
  listeningExtensionError.value = '';
  try {
    const payload = await musicApi.searchVoiceWorks({
      q: '',
      page: 1,
      limit: 6,
      order: 'release',
      sort: 'desc'
    });
    listeningExtensionWorks.value = normalizeListeningExtensionWorks(payload, 6);
    listeningExtensionLoaded.value = true;
  } catch (error) {
    listeningExtensionError.value = parseErrorMessage(error);
    if (force || !listeningExtensionWorks.value.length) {
      listeningExtensionWorks.value = [];
    }
  } finally {
    listeningExtensionLoading.value = false;
  }
}

function openVoiceWork(item) {
  const workId = Number(item?.workId || 0);
  if (!Number.isFinite(workId) || workId <= 0) return;
  router.push({
    name: 'music-library-voice-work',
    params: { workId: String(workId) }
  });
}

function handleOpenCollectDialog(track) {
  if (typeof music.openCollectDialog === 'function') {
    music.openCollectDialog(track || null);
  }
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

.cozy-home-block {
  display: grid;
  gap: 14px;
}

.music-cozy-library .music-cozy-hero {
  --liquid-bg: linear-gradient(135deg, rgba(229, 42, 48, 0.96), rgba(118, 21, 31, 0.94));
  --liquid-border: rgba(255, 255, 255, 0.22);
  --liquid-shadow: 0 22px 48px rgba(91, 10, 20, 0.34);
  position: relative;
  overflow: hidden;
}

.music-cozy-library .music-cozy-hero::after {
  content: '';
  position: absolute;
  width: 260px;
  height: 260px;
  right: -74px;
  top: -110px;
  border-radius: 50%;
  border: 44px solid rgba(255, 255, 255, 0.08);
  pointer-events: none;
}

.music-cozy-library .hero-copy,
.music-cozy-library .hero-now-card {
  position: relative;
  z-index: 1;
}

.music-cozy-library .hero-copy .eyebrow,
.music-cozy-library .hero-copy h1,
.music-cozy-library .hero-copy p {
  color: rgba(255, 255, 255, 0.96);
}

.music-cozy-library .hero-copy p {
  color: rgba(255, 255, 255, 0.78);
}

.music-cozy-library .mood-chip {
  border-color: rgba(255, 255, 255, 0.26);
  background: rgba(255, 255, 255, 0.14);
  color: rgba(255, 255, 255, 0.94);
  transition: transform 160ms ease, background-color 160ms ease;
}

.music-cozy-library .mood-chip:hover {
  transform: translateY(-1px);
  background: rgba(255, 255, 255, 0.22);
}

.music-cozy-library .hero-now-card {
  --liquid-bg: rgba(38, 10, 15, 0.32);
  --liquid-border: rgba(255, 255, 255, 0.22);
  --liquid-shadow: 0 16px 34px rgba(50, 5, 12, 0.25);
}

.music-cozy-library .now-label,
.music-cozy-library .now-title,
.music-cozy-library .now-meta,
.music-cozy-library .now-note {
  color: rgba(255, 255, 255, 0.92);
}

.music-cozy-library .now-meta,
.music-cozy-library .now-note {
  color: rgba(255, 255, 255, 0.7);
}

.now-play-btn {
  justify-self: start;
  min-height: 36px;
  border: 0;
  border-radius: 999px;
  padding: 0 15px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  background: rgba(255, 255, 255, 0.94);
  color: #b91f2c;
  font-size: 12px;
  font-weight: 700;
  box-shadow: 0 8px 20px rgba(62, 4, 12, 0.22);
}

.music-cozy-library .album-card.is-static {
  opacity: 0.88;
}

.music-cozy-library .album-copy {
  display: grid;
  gap: 4px;
  align-content: start;
}

.music-cozy-library .album-copy h2,
.music-cozy-library .album-copy p {
  margin: 0;
}

.home-toolbar {
  --liquid-bg: var(--theme-panel-surface);
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
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  padding: 0 10px;
  color: var(--theme-text-secondary);
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
  color: var(--theme-text-primary);
  font-size: 12px;
  line-height: 1;
}

.search-box input::placeholder {
  color: rgba(226, 210, 198, 0.86);
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
  --liquid-bg: var(--theme-panel-surface);
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
  color: var(--theme-text-primary);
}

.panel-head span {
  font-size: 12px;
  color: var(--theme-text-tertiary);
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
  color: var(--theme-text-primary);
}

.provider-head span {
  font-size: 12px;
  color: var(--theme-text-tertiary);
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
  border: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
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
  position: relative;
  width: 100%;
  aspect-ratio: 1 / 1;
  background-size: cover;
  background-position: center;
}

.cover.empty {
  background-image: linear-gradient(145deg, rgba(229, 42, 48, 0.88), rgba(72, 22, 34, 0.96));
}

.cover.empty::after {
  content: '♫';
  position: absolute;
  inset: 0;
  display: grid;
  place-items: center;
  color: rgba(255, 255, 255, 0.86);
  font-size: 38px;
  text-shadow: 0 8px 18px rgba(25, 0, 4, 0.32);
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
  color: var(--theme-text-primary);
  min-height: 20px;
  line-height: 20px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.meta .desc {
  font-size: 11px;
  color: var(--theme-text-secondary);
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
  border: 1px solid var(--theme-border-strong);
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
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
  border-bottom: 1px solid var(--theme-border);
  color: var(--theme-text-tertiary);
  font-size: 12px;
}

.table-row {
  border: 0;
  border-radius: 10px;
  padding: 8px 10px;
  background: var(--theme-surface-soft);
  color: var(--theme-text-primary);
  text-align: left;
  cursor: pointer;
}

.table-row + .table-row {
  margin-top: 6px;
}

.search-track-head,
.search-track-row {
  grid-template-columns: 48px minmax(0, 2.1fr) minmax(0, 0.95fr) minmax(0, 1.15fr) 72px 132px;
}

.recommend-track-head,
.recommend-track-row {
  grid-template-columns: 48px minmax(0, 2.1fr) minmax(0, 0.95fr) minmax(0, 1.15fr) 72px 132px;
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

.track-title-copy {
  min-width: 0;
  display: grid;
  justify-items: start;
  gap: 3px;
}

.provider-badge {
  display: inline-flex;
  align-items: center;
  min-height: 18px;
  border-radius: 999px;
  padding: 0 7px;
  background: rgba(229, 42, 48, 0.14);
  color: rgba(244, 106, 111, 0.96);
  border: 1px solid rgba(229, 42, 48, 0.28);
  font-size: 10px;
  line-height: 1;
}

.artist-col,
.album-col {
  min-width: 0;
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  color: var(--theme-text-secondary);
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
  color: var(--theme-text-secondary);
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
  color: var(--theme-text-secondary);
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
  border: 1px solid var(--theme-border);
  border-radius: 12px;
  background: var(--theme-surface-soft);
  padding: 10px;
}

.artist-name {
  margin: 0;
  font-size: 14px;
  color: var(--theme-text-primary);
}

.artist-meta {
  margin: 6px 0 0;
  font-size: 12px;
  color: var(--theme-text-secondary);
}

.podcast-card {
  border: 1px solid var(--theme-border);
  border-radius: 12px;
  background: var(--theme-surface-soft);
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
  color: var(--theme-text-primary);
}

.podcast-desc {
  margin: 0;
  font-size: 12px;
  color: var(--theme-text-secondary);
}

.podcast-note {
  margin: 0;
  font-size: 12px;
  color: var(--theme-text-tertiary);
}

.empty-state {
  border-radius: 10px;
  border: 1px dashed var(--theme-border-strong);
  color: var(--theme-text-tertiary);
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
    grid-template-columns: 40px minmax(0, 1.65fr) minmax(0, 0.9fr) minmax(0, 0.9fr) 58px 122px;
    gap: 6px;
  }

  .recommend-track-head,
  .recommend-track-row {
    grid-template-columns: 40px minmax(0, 1.65fr) minmax(0, 0.9fr) minmax(0, 0.9fr) 58px 122px;
    gap: 6px;
  }
}
</style>
