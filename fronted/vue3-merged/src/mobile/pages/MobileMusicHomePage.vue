<template>
  <div class="m-music-home">
    <header class="home-head">
      <div class="head-text">
        <p class="head-caption">Shizuki Music</p>
        <h1 class="head-title">{{ greeting }}</h1>
      </div>
      <button
        type="button"
        class="head-avatar m-press"
        :aria-label="auth.isAuthenticated.value ? '个人中心' : '登录'"
        @click="goProfile"
      >
        <img v-if="avatarUrl" :src="avatarUrl" alt="" />
        <i v-else class="fa-solid fa-circle-user" aria-hidden="true"></i>
      </button>
    </header>

    <button type="button" class="search-entry m-card m-press" @click="router.push('/m/search')">
      <i class="fa-solid fa-magnifying-glass" aria-hidden="true"></i>
      <span>搜索歌曲、歌单、歌手…</span>
    </button>

    <section v-if="player.currentTrack.value" class="now-card m-card m-press" role="button" tabindex="0" @click="shell.openPlayer()">
      <div class="now-cover" :class="{ playing: player.isPlaying.value }">
        <img :src="player.currentTrack.value.cover" alt="" />
      </div>
      <div class="now-main">
        <p class="now-caption">{{ player.isPlaying.value ? '正在播放' : '已暂停' }}</p>
        <p class="now-title">{{ player.currentTrack.value.title }}</p>
        <p class="now-sub">{{ player.currentLyricLine.value || player.currentTrack.value.artist }}</p>
      </div>
      <i class="fa-solid fa-chevron-right now-arrow" aria-hidden="true"></i>
    </section>

    <div v-if="library.overviewLoading.value && !library.initialized.value" class="home-skeletons">
      <div v-for="n in 3" :key="n" class="m-skeleton skeleton-rail"></div>
    </div>

    <template v-else>
      <div v-if="library.errorText.value && !sections.length" class="m-empty">
        <i class="fa-solid fa-cloud-bolt" aria-hidden="true"></i>
        <span>{{ library.errorText.value }}</span>
        <button type="button" class="m-btn-ghost" @click="reload">重试</button>
      </div>

      <section v-for="group in sections" :key="group.key" class="playlist-group">
        <div class="m-section-head">
          <h2 class="m-section-title">{{ group.label }}</h2>
          <span class="m-section-caption">{{ group.caption }}</span>
        </div>
        <div class="playlist-rail" :class="{ grid: group.key === 'mine' }">
          <button
            v-for="item in group.items"
            :key="item.playlistCode"
            type="button"
            class="playlist-card m-press"
            @click="openPlaylist(item)"
          >
            <div class="card-cover">
              <img v-if="item.cover" :src="item.cover" alt="" loading="lazy" />
              <div v-else class="cover-fallback"><i class="fa-solid fa-music" aria-hidden="true"></i></div>
              <span v-if="item.trackCount" class="cover-count">{{ item.trackCount }} 首</span>
            </div>
            <p class="card-name">{{ item.name }}</p>
            <p v-if="item.description" class="card-desc">{{ item.description }}</p>
          </button>
        </div>
      </section>

      <section v-if="!auth.isAuthenticated.value" class="login-nudge m-card">
        <div class="nudge-text">
          <p class="nudge-title">登录后解锁我的歌单</p>
          <p class="nudge-sub">收藏喜欢的歌，云端同步到每台设备</p>
        </div>
        <button type="button" class="nudge-btn m-press" @click="router.push('/m/auth')">登录</button>
      </section>
    </template>
  </div>
</template>

<script setup>
import { computed, onMounted } from 'vue';
import { useRouter } from 'vue-router';
import { useMobileShell } from '../mobileShellContext';

const router = useRouter();
const shell = useMobileShell();
const { auth, player, library } = shell;

const sections = computed(() => library.sections.value || []);

const avatarUrl = computed(() => String(auth.user.value?.avatarUrl || '').trim());

const greeting = computed(() => {
  const hour = new Date().getHours();
  const name = auth.user.value?.nickname;
  const suffix = name ? `，${name}` : '';
  if (hour < 5) return `夜深了${suffix}`;
  if (hour < 11) return `早上好${suffix}`;
  if (hour < 14) return `中午好${suffix}`;
  if (hour < 18) return `下午好${suffix}`;
  return `晚上好${suffix}`;
});

function goProfile() {
  router.push(auth.isAuthenticated.value ? '/m/profile' : '/m/auth');
}

function openPlaylist(item) {
  if (!item?.playlistCode) return;
  router.push(`/m/playlist/${encodeURIComponent(item.playlistCode)}`);
}

async function reload() {
  try {
    await library.loadOverview({ force: true });
  } catch {
    // 错误已写入 library.errorText
  }
}

onMounted(() => {
  library.loadOverview().catch(() => {});
});
</script>

<style scoped>
.m-music-home {
  display: flex;
  flex-direction: column;
  gap: 16px;
}

.home-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 14px;
  padding: 4px 2px 0;
}

.head-caption {
  margin: 0 0 4px;
  font-size: 11px;
  letter-spacing: 0.24em;
  text-transform: uppercase;
  color: var(--m-text-faint);
}

.head-title {
  margin: 0;
  font-size: clamp(21px, 6vw, 26px);
  font-weight: 800;
  letter-spacing: 0.01em;
}

.head-avatar {
  width: 44px;
  height: 44px;
  flex-shrink: 0;
  display: grid;
  place-items: center;
  border-radius: 999px;
  overflow: hidden;
  border: 1.5px solid var(--m-border-strong);
  background: var(--m-surface-soft);
  color: var(--m-text-sub);
  font-size: 22px;
  cursor: pointer;
}

.head-avatar img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.search-entry {
  display: flex;
  align-items: center;
  gap: 12px;
  width: 100%;
  padding: 14px 18px;
  color: var(--m-text-faint);
  font-size: 14px;
  cursor: pointer;
  border-radius: 18px;
  text-align: left;
}

.search-entry i {
  color: rgba(var(--m-accent-rgb), 0.9);
}

.now-card {
  display: flex;
  align-items: center;
  gap: 14px;
  padding: 12px 16px 12px 12px;
  cursor: pointer;
  background:
    linear-gradient(120deg, rgba(var(--m-grad-a), 0.16), rgba(var(--m-grad-b), 0.1)),
    var(--m-surface);
}

.now-cover {
  width: 54px;
  height: 54px;
  flex-shrink: 0;
  border-radius: 999px;
  overflow: hidden;
  border: 2px solid rgba(var(--m-accent-rgb), 0.45);
  box-shadow: 0 6px 16px rgba(var(--m-accent-rgb), 0.3);
}

.now-cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.now-cover.playing img {
  animation: m-home-spin 16s linear infinite;
}

@keyframes m-home-spin {
  to {
    transform: rotate(360deg);
  }
}

.now-main {
  flex: 1;
  min-width: 0;
}

.now-caption {
  margin: 0;
  font-size: 10.5px;
  letter-spacing: 0.18em;
  text-transform: uppercase;
  color: rgba(var(--m-accent-rgb), 0.95);
}

.now-title {
  margin: 3px 0 0;
  font-size: 15px;
  font-weight: 700;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.now-sub {
  margin: 2px 0 0;
  font-size: 12px;
  color: var(--m-text-sub);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.now-arrow {
  flex-shrink: 0;
  color: var(--m-text-faint);
  font-size: 13px;
}

.home-skeletons {
  display: grid;
  gap: 14px;
  margin-top: 8px;
}

.skeleton-rail {
  height: 150px;
  border-radius: var(--m-radius-lg);
}

.playlist-group {
  margin-top: 2px;
}

.playlist-rail {
  display: flex;
  gap: 12px;
  overflow-x: auto;
  padding: 2px 2px 8px;
  scrollbar-width: none;
  scroll-snap-type: x proximity;
}

.playlist-rail::-webkit-scrollbar {
  display: none;
}

.playlist-rail.grid {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  overflow: visible;
}

.playlist-card {
  flex: 0 0 132px;
  display: grid;
  gap: 7px;
  padding: 0;
  border: none;
  background: transparent;
  color: inherit;
  text-align: left;
  cursor: pointer;
  scroll-snap-align: start;
}

.playlist-rail.grid .playlist-card {
  flex: initial;
}

.card-cover {
  position: relative;
  width: 100%;
  aspect-ratio: 1;
  border-radius: 20px;
  overflow: hidden;
  border: 1px solid var(--m-border);
  background: var(--m-surface-soft);
  box-shadow: var(--m-shadow-soft);
}

.card-cover img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.cover-fallback {
  width: 100%;
  height: 100%;
  display: grid;
  place-items: center;
  font-size: 26px;
  color: rgba(var(--m-accent-rgb), 0.75);
  background: linear-gradient(135deg, rgba(var(--m-grad-a), 0.22), rgba(var(--m-grad-b), 0.16));
}

.cover-count {
  position: absolute;
  right: 8px;
  bottom: 8px;
  padding: 2.5px 8px;
  border-radius: 999px;
  background: rgba(8, 11, 20, 0.6);
  color: rgba(255, 244, 236, 0.92);
  font-size: 10.5px;
  backdrop-filter: blur(6px);
  -webkit-backdrop-filter: blur(6px);
}

.card-name {
  margin: 0;
  font-size: 13.5px;
  font-weight: 650;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.card-desc {
  margin: 0;
  font-size: 11.5px;
  color: var(--m-text-faint);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.login-nudge {
  display: flex;
  align-items: center;
  gap: 14px;
  padding: 16px 18px;
  margin-top: 4px;
}

.nudge-text {
  flex: 1;
  min-width: 0;
}

.nudge-title {
  margin: 0;
  font-size: 14.5px;
  font-weight: 700;
}

.nudge-sub {
  margin: 4px 0 0;
  font-size: 12px;
  color: var(--m-text-sub);
}

.nudge-btn {
  flex-shrink: 0;
  padding: 10px 22px;
  border: none;
  border-radius: 999px;
  background: var(--m-accent-gradient);
  color: #3c2320;
  font-size: 13.5px;
  font-weight: 700;
  cursor: pointer;
  box-shadow: 0 8px 18px rgba(var(--m-accent-rgb), 0.32);
}

@media (orientation: landscape) and (max-height: 560px) {
  .playlist-rail.grid {
    grid-template-columns: repeat(4, 1fr);
  }
}

@media (min-width: 500px) {
  .playlist-rail.grid {
    grid-template-columns: repeat(3, 1fr);
  }
}

@media (prefers-reduced-motion: reduce) {
  .now-cover.playing img {
    animation: none;
  }
}
</style>
