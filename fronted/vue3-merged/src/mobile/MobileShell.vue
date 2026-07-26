<template>
  <div class="m-shell" :class="{ 'is-native': isNative }">
    <div ref="viewRef" class="m-shell-view" :class="{ 'no-mini': !player.currentTrack.value }">
      <RouterView v-slot="{ Component }">
        <transition name="m-page" mode="out-in">
          <component :is="Component" :key="route.path" />
        </transition>
      </RouterView>
    </div>

    <MobileMiniPlayer
      :track="player.currentTrack.value"
      :is-playing="player.isPlaying.value"
      :current-time="player.currentTime.value"
      :duration="player.duration.value"
      :lyric-line="player.currentLyricLine.value"
      @expand="playerOpen = true"
      @toggle-play="player.togglePlay"
      @next="player.playNext"
    />

    <MobileTabBar :tabs="tabs" :active-key="activeTabKey" @select="onSelectTab" />

    <MobileFullPlayer
      :visible="playerOpen"
      :track="player.currentTrack.value"
      :tracks="player.tracks.value"
      :source-name="player.playlistProfile.value?.name || ''"
      :is-playing="player.isPlaying.value"
      :is-preview-playback="player.isPreviewPlayback.value"
      :current-time="player.currentTime.value"
      :duration="player.duration.value"
      :current-lyric-line="player.currentLyricLine.value"
      :lyric-timeline="player.lyricTimeline.value"
      :current-lyric-entry-index="player.currentLyricEntryIndex.value"
      :lyric-render-mode="player.lyricRenderMode.value"
      :available-lyric-modes="player.availableLyricModes.value"
      :play-mode="player.playMode.value"
      @close="playerOpen = false"
      @toggle-play="player.togglePlay"
      @prev="player.playPrev"
      @next="player.playNext"
      @cycle-mode="player.cyclePlayMode"
      @seek-percent="player.seekToPercent"
      @seek-time="player.seekToTime"
      @select-track="onPlayerSelectTrack"
      @set-lyric-mode="player.setLyricRenderMode"
    />

    <transition name="m-toast">
      <div v-if="toastText" class="m-toast" role="status">{{ toastText }}</div>
    </transition>
  </div>
</template>

<script setup>
import { computed, provide, ref, watch } from 'vue';
import { RouterView, useRoute, useRouter } from 'vue-router';
import { usePlayerBridge } from '../composables/playerBridge';
import { useAuthSession } from '../composables/useAuthSession';
import { useMiniMusicLibrary } from '../composables/useMiniMusicLibrary';
import { isNativeAppShell } from '../services/apiBase';
import { MOBILE_SHELL_CONTEXT_KEY } from './mobileShellContext';
import MobileFullPlayer from './components/MobileFullPlayer.vue';
import MobileMiniPlayer from './components/MobileMiniPlayer.vue';
import MobileTabBar from './components/MobileTabBar.vue';
import './styles/mobile.css';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();
const player = usePlayerBridge();
const isNative = isNativeAppShell();

const library = useMiniMusicLibrary({
  player,
  isAuthenticated: auth.isAuthenticated,
  getAuthorizedFetch: () => auth.authorizedFetch
});

const playerOpen = ref(false);
const viewRef = ref(null);
const toastText = ref('');
let toastTimer = null;

function showToast(message, durationMs = 2200) {
  toastText.value = String(message || '');
  if (toastTimer) clearTimeout(toastTimer);
  if (toastText.value) {
    toastTimer = setTimeout(() => {
      toastText.value = '';
    }, durationMs);
  }
}

const tabs = computed(() => [
  { key: 'music', label: '音乐', icon: 'fa-solid fa-compact-disc', path: '/m/music' },
  { key: 'search', label: '搜索', icon: 'fa-solid fa-magnifying-glass', path: '/m/search' },
  {
    key: 'profile',
    label: auth.isAuthenticated.value ? '我的' : '登录',
    icon: 'fa-solid fa-circle-user',
    path: auth.isAuthenticated.value ? '/m/profile' : '/m/auth'
  }
]);

const activeTabKey = computed(() => {
  const path = route.path;
  if (path.startsWith('/m/search')) return 'search';
  if (path.startsWith('/m/profile') || path.startsWith('/m/auth')) return 'profile';
  return 'music';
});

function onSelectTab(tab) {
  if (!tab?.path || route.path === tab.path) return;
  router.push(tab.path);
}

async function onPlayerSelectTrack(index) {
  await player.selectTrackByIndex(index, true);
}

watch(
  () => auth.isAuthenticated.value,
  async () => {
    try {
      await library.handleAuthChanged();
    } catch {
      // 保底：登录态切换时静默刷新失败不打断浏览
    }
  }
);

watch(
  () => route.path,
  () => {
    playerOpen.value = false;
    if (viewRef.value) viewRef.value.scrollTop = 0;
  }
);

provide(MOBILE_SHELL_CONTEXT_KEY, {
  auth,
  player,
  library,
  isNative,
  openPlayer: () => {
    playerOpen.value = true;
  },
  showToast
});
</script>

<style scoped>
.m-page-enter-active,
.m-page-leave-active {
  transition: opacity 180ms ease, transform 220ms ease;
}

.m-page-enter-from {
  opacity: 0;
  transform: translateY(10px);
}

.m-page-leave-to {
  opacity: 0;
  transform: translateY(-6px);
}

.m-toast {
  position: absolute;
  left: 50%;
  transform: translateX(-50%);
  bottom: calc(var(--m-safe-bottom) + var(--m-tabbar-height) + var(--m-mini-height) + 34px);
  z-index: 130;
  max-width: min(84vw, 420px);
  padding: 10px 18px;
  border-radius: 999px;
  background: var(--m-surface-strong);
  border: 1px solid var(--m-border-strong);
  backdrop-filter: var(--m-blur);
  -webkit-backdrop-filter: var(--m-blur);
  box-shadow: var(--m-shadow);
  color: var(--m-text);
  font-size: 13px;
  text-align: center;
}

.m-toast-enter-active,
.m-toast-leave-active {
  transition: opacity 200ms ease, transform 240ms ease;
}

.m-toast-enter-from,
.m-toast-leave-to {
  opacity: 0;
  transform: translateX(-50%) translateY(10px);
}
</style>
