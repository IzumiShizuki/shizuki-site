<template>
  <div class="m-playlist-page">
    <header class="pl-head">
      <button type="button" class="back-btn m-press" aria-label="返回" @click="goBack">
        <i class="fa-solid fa-chevron-left" aria-hidden="true"></i>
      </button>
      <span class="head-label">歌单</span>
      <button type="button" class="back-btn m-press" aria-label="刷新" @click="reload">
        <i class="fa-solid fa-rotate-right" aria-hidden="true"></i>
      </button>
    </header>

    <section class="pl-hero">
      <div class="hero-cover">
        <img v-if="playlist.cover" :src="playlist.cover" alt="" />
        <div v-else class="hero-fallback"><i class="fa-solid fa-music" aria-hidden="true"></i></div>
      </div>
      <div class="hero-main">
        <h1 class="hero-name">{{ playlist.name }}</h1>
        <p v-if="playlist.description" class="hero-desc">{{ playlist.description }}</p>
        <p class="hero-meta">{{ tracks.length }} 首歌曲</p>
        <div class="hero-actions">
          <button type="button" class="play-all m-press" :disabled="!tracks.length" @click="playAll">
            <i class="fa-solid fa-play" aria-hidden="true"></i>
            播放全部
          </button>
        </div>
      </div>
    </section>

    <div v-if="loading" class="pl-skeletons">
      <div v-for="n in 6" :key="n" class="m-skeleton skeleton-row"></div>
    </div>

    <div v-else-if="errorText" class="m-empty">
      <i class="fa-solid fa-cloud-bolt" aria-hidden="true"></i>
      <span>{{ errorText }}</span>
      <button type="button" class="m-btn-ghost" @click="reload">重试</button>
    </div>

    <div v-else-if="!tracks.length" class="m-empty">
      <i class="fa-solid fa-music" aria-hidden="true"></i>
      <span>这个歌单还没有歌曲</span>
    </div>

    <section v-else class="pl-tracks m-card">
      <MobileTrackRow
        v-for="(item, idx) in tracks"
        :key="item.id || idx"
        :track="item"
        :index="idx"
        :is-current="currentTrackId === item.id"
        :is-playing="player.isPlaying.value"
        @play="playAt(idx)"
        @menu="openTrackMenu(item, idx)"
      />
    </section>

    <MobileSheet :visible="Boolean(menuTrack)" :title="menuTrack?.title || ''" @close="menuTrack = null">
      <div class="menu-actions">
        <button type="button" class="menu-item m-press" @click="menuPlay">
          <i class="fa-solid fa-play" aria-hidden="true"></i>
          立即播放
        </button>
        <button type="button" class="menu-item m-press" @click="menuPlayNext">
          <i class="fa-solid fa-forward" aria-hidden="true"></i>
          下一首播放
        </button>
        <button
          v-if="auth.isAuthenticated.value && collectTargets.length"
          type="button"
          class="menu-item m-press"
          @click="collectOpen = true"
        >
          <i class="fa-solid fa-folder-plus" aria-hidden="true"></i>
          收藏到歌单
        </button>
      </div>
    </MobileSheet>

    <MobileSheet :visible="collectOpen" title="收藏到歌单" @close="collectOpen = false">
      <div class="menu-actions">
        <button
          v-for="target in collectTargets"
          :key="target.playlistCode"
          type="button"
          class="menu-item m-press"
          @click="collectTo(target)"
        >
          <i class="fa-solid fa-record-vinyl" aria-hidden="true"></i>
          {{ target.name }}
        </button>
      </div>
    </MobileSheet>
  </div>
</template>

<script setup>
import { computed, onMounted, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { upsertMyMusicPlaylistTrack } from '../../services/musicApi';
import { buildCollectPlaylistTargets } from '../../utils/musicCollectTargets';
import { buildPlaylistTrackUpsertPayload } from '../../utils/musicTrackPayload';
import MobileSheet from '../components/MobileSheet.vue';
import MobileTrackRow from '../components/MobileTrackRow.vue';
import { useMobileShell } from '../mobileShellContext';

const route = useRoute();
const router = useRouter();
const shell = useMobileShell();
const { auth, player, library, showToast } = shell;

const menuTrack = ref(null);
const menuIndex = ref(-1);
const collectOpen = ref(false);

const playlistCode = computed(() => String(route.params.playlistCode || '').trim());
const playlist = computed(() => library.selectedPlaylist.value || { name: '歌单', description: '', cover: '' });
const tracks = computed(() => library.selectedTracks.value || []);
const loading = computed(() => library.playlistLoading.value);
const errorText = computed(() => library.playlistError.value);
const currentTrackId = computed(() => player.currentTrack.value?.id || '');

const collectTargets = computed(() =>
  buildCollectPlaylistTargets(library.myPlaylists.value, [], { excludedCodes: ['default_public', playlistCode.value] })
);

function goBack() {
  if (window.history.length > 1) {
    router.back();
  } else {
    router.push('/m/music');
  }
}

async function load(force = false) {
  if (!playlistCode.value) return;
  await library.loadOverview().catch(() => {});
  await library.selectPlaylist(playlistCode.value, { force });
}

function reload() {
  load(true);
}

async function playAll() {
  const ok = await library.playTrackAt(0);
  if (ok) shell.openPlayer();
}

async function playAt(index) {
  const ok = await library.playTrackAt(index);
  if (ok) shell.openPlayer();
  else if (!ok) showToast('该歌曲暂时无法播放');
}

function openTrackMenu(track, index) {
  menuTrack.value = track;
  menuIndex.value = index;
}

async function menuPlay() {
  const idx = menuIndex.value;
  menuTrack.value = null;
  if (idx >= 0) await playAt(idx);
}

async function menuPlayNext() {
  const track = menuTrack.value;
  menuTrack.value = null;
  if (!track) return;
  const ok = await player.enqueueNextTrack(track);
  showToast(ok ? '已加入下一首播放' : '无法加入队列');
}

async function collectTo(target) {
  const track = menuTrack.value;
  collectOpen.value = false;
  menuTrack.value = null;
  if (!track || !target?.playlistCode) return;
  try {
    await upsertMyMusicPlaylistTrack(
      target.playlistCode,
      buildPlaylistTrackUpsertPayload(track, {
        playlistCode: playlistCode.value,
        isPlaylistRoute: true
      }),
      auth.authorizedFetch
    );
    showToast(`已收藏到「${target.name}」`);
  } catch (error) {
    showToast(error?.detail || error?.message || '收藏失败，请稍后再试');
  }
}

watch(playlistCode, () => {
  load(false);
});

onMounted(() => {
  load(false);
});
</script>

<style scoped>
.m-playlist-page {
  display: flex;
  flex-direction: column;
  gap: 16px;
}

.pl-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
}

.back-btn {
  width: 40px;
  height: 40px;
  display: grid;
  place-items: center;
  border: 1px solid var(--m-border);
  border-radius: 999px;
  background: var(--m-surface-soft);
  color: var(--m-text);
  font-size: 14px;
  cursor: pointer;
}

.head-label {
  font-size: 13px;
  letter-spacing: 0.2em;
  color: var(--m-text-faint);
}

.pl-hero {
  display: flex;
  gap: 16px;
  align-items: flex-end;
}

.hero-cover {
  width: 128px;
  height: 128px;
  flex-shrink: 0;
  border-radius: 24px;
  overflow: hidden;
  border: 1px solid var(--m-border-strong);
  box-shadow: var(--m-shadow);
}

.hero-cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.hero-fallback {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  font-size: 34px;
  color: rgba(var(--m-accent-rgb), 0.8);
  background: linear-gradient(135deg, rgba(var(--m-grad-a), 0.24), rgba(var(--m-grad-b), 0.18));
}

.hero-main {
  flex: 1;
  min-width: 0;
  display: grid;
  gap: 5px;
}

.hero-name {
  margin: 0;
  font-size: clamp(19px, 5.6vw, 24px);
  font-weight: 800;
  line-height: 1.25;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.hero-desc {
  margin: 0;
  font-size: 12.5px;
  color: var(--m-text-sub);
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.hero-meta {
  margin: 0;
  font-size: 11.5px;
  color: var(--m-text-faint);
}

.hero-actions {
  margin-top: 6px;
}

.play-all {
  display: inline-flex;
  align-items: center;
  gap: 9px;
  padding: 11px 22px;
  border: none;
  border-radius: 999px;
  background: var(--m-accent-gradient);
  color: #3c2320;
  font-size: 14px;
  font-weight: 700;
  cursor: pointer;
  box-shadow: 0 10px 22px rgba(var(--m-accent-rgb), 0.34);
}

.play-all:disabled {
  opacity: 0.55;
  box-shadow: none;
}

.pl-skeletons {
  display: grid;
  gap: 10px;
}

.skeleton-row {
  height: 62px;
  border-radius: var(--m-radius-md);
}

.pl-tracks {
  padding: 8px;
  display: grid;
  gap: 2px;
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

@media (orientation: landscape) and (max-height: 560px) {
  .pl-hero {
    align-items: center;
  }

  .hero-cover {
    width: 96px;
    height: 96px;
  }
}
</style>
