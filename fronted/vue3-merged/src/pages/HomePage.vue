<template>
  <section
    class="home-time-stage"
    :class="`motion-${homeAppearance.state.motionLevel}`"
    :data-motion-level="homeAppearance.state.motionLevel"
    :style="stageAccentStyle"
    aria-label="主页时间舞台"
  >
    <template v-if="!isFocusActive">
      <div class="stage-ambient stage-ambient-primary" aria-hidden="true"></div>
      <div class="stage-ambient stage-ambient-secondary" aria-hidden="true"></div>

      <header class="stage-greeting" data-testid="home-stage-greeting">
        <span class="greeting-rule" aria-hidden="true"></span>
        <p>{{ greeting.en }}</p>
        <span>{{ greeting.zh }} · {{ periodNote }}</span>
      </header>

      <Transition name="clock-reveal">
        <div v-if="clockVisible" class="stage-clock" data-testid="home-stage-clock" aria-label="当前时间">
          <time :datetime="clock.datetime" class="clock-time">
            <span>{{ clock.hm }}</span>
            <small aria-label="秒">{{ clock.ss }}</small>
          </time>
          <p class="clock-date">
            <span>{{ clock.date }}</span>
            <i aria-hidden="true"></i>
            <span>{{ clock.weekday }}</span>
          </p>
        </div>
      </Transition>

      <p v-if="!clockVisible" class="clock-hidden-note" data-testid="home-clock-hidden-note">
        <i class="fas fa-eye-slash" aria-hidden="true"></i>
        当前壁纸已隐藏时钟，可从 Menu · 主题中重新开启
      </p>

      <div class="context-island-row" aria-label="情境小岛">
        <button
          class="context-island music-island ripple-trigger"
          type="button"
          data-testid="home-music-island"
          @click="handleMusicAction"
        >
          <span class="island-icon" :class="{ 'is-playing': musicState.isPlaying }" aria-hidden="true">
            <i :class="musicState.isPlaying ? 'fas fa-pause' : 'fas fa-music'"></i>
          </span>
          <span class="island-copy">
            <small>{{ musicState.isPlaying ? 'NOW PLAYING' : 'MUSIC' }}</small>
            <strong>{{ musicState.title }}</strong>
            <span>{{ musicState.caption }}</span>
          </span>
          <i class="fas fa-wave-square island-trailing" aria-hidden="true"></i>
        </button>

        <button
          class="context-island focus-island ripple-trigger"
          type="button"
          data-testid="home-focus-island"
          @click="handleFocusAction"
        >
          <span class="island-icon" aria-hidden="true"><i class="fas fa-bullseye"></i></span>
          <span class="island-copy">
            <small>{{ focusIslandState.eyebrow }}</small>
            <strong>{{ currentFocusTask?.title || '开始一段专注' }}</strong>
            <span>{{ focusIslandState.caption }}</span>
          </span>
          <i class="fas fa-arrow-right island-trailing" aria-hidden="true"></i>
        </button>

        <button
          class="context-island reminder-island ripple-trigger"
          type="button"
          data-testid="home-reminder-island"
          @click="openTodo"
        >
          <span class="island-icon" aria-hidden="true"><i :class="reminder.icon"></i></span>
          <span class="island-copy">
            <small>{{ reminder.eyebrow }}</small>
            <strong>{{ reminder.title }}</strong>
            <span>{{ reminder.caption }}</span>
          </span>
          <i class="fas fa-list-check island-trailing" aria-hidden="true"></i>
        </button>
      </div>

      <nav class="home-room-utilities" aria-label="自宅入口" data-testid="home-room-utilities">
        <button
          class="home-room-utility ripple-trigger"
          type="button"
          data-testid="home-intro-action"
          @click="openAuthorIntro"
        >
          <i class="fas fa-circle-info" aria-hidden="true"></i>
          <span>关于这里</span>
        </button>
        <button
          class="home-room-utility home-companion-utility ripple-trigger"
          :class="{ locked: companionEntry.disabled }"
          type="button"
          data-testid="home-companion-action"
          :disabled="companionEntry.disabled"
          @click="openCompanion"
        >
          <i :class="companionEntry.icon" aria-hidden="true"></i>
          <span>{{ companionEntry.title }}</span>
          <small>{{ companionEntry.caption }}</small>
        </button>
      </nav>

      <footer class="stage-footer">
        <Transition name="whisper-fade" mode="out-in">
          <p :key="whisperIndex">{{ activeWhisper }}</p>
        </Transition>
        <span>展开 Menu 可前往 Blog、Music、Apps 与 AI Hub</span>
      </footer>
    </template>

    <div v-else class="focus-stage-placeholder" aria-hidden="true"></div>
  </section>
</template>

<script setup>
import { computed, inject, onBeforeUnmount, onMounted, ref } from 'vue';
import { useRouter } from 'vue-router';
import { PLAYER_BRIDGE_KEY } from '../composables/playerBridge';
import { useAuthSession } from '../composables/useAuthSession';
import { listPublicPostWhispers } from '../services/blogApi';
import { openAiChat } from '../utils/aiChatBus';
import { useFocusSession } from '../utils/focusSessionState';
import { HOME_STAGE_CONTEXT_KEY, resolveHomeClockVisibility, useHomeAppearance } from '../utils/homeTimeStageState';
import { openLightAppWindow } from '../utils/lightAppWindowBus';
import { buildAuthorHomepageWhisperPool } from './authorHomepageWhispersState';

const router = useRouter();
const auth = useAuthSession();
const player = inject(PLAYER_BRIDGE_KEY, null);
const stageContext = inject(HOME_STAGE_CONTEXT_KEY, null);
const focus = useFocusSession();
const homeAppearance = useHomeAppearance();
const isFocusActive = focus.isActive;
const currentFocusTask = focus.currentTask;
const now = ref(new Date());
const whisperPool = ref(buildAuthorHomepageWhisperPool(null));
const whisperIndex = ref(0);
let clockTimer = 0;
let whisperTimer = 0;

const WEEKDAY_LABELS = ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'];

function pad2(value) {
  return String(value).padStart(2, '0');
}

const activeWallpaper = computed(() => stageContext?.wallpaper?.value || { id: '', isDynamic: false });
const stageAccentHex = computed(() => String(stageContext?.accentHex?.value || '#F2B39D'));
const stageAccentStyle = computed(() => {
  const normalized = /^#[0-9A-F]{6}$/i.test(stageAccentHex.value) ? stageAccentHex.value : '#F2B39D';
  const red = Number.parseInt(normalized.slice(1, 3), 16);
  const green = Number.parseInt(normalized.slice(3, 5), 16);
  const blue = Number.parseInt(normalized.slice(5, 7), 16);
  const soft = [red, green, blue].map((channel) => Math.round(channel + (255 - channel) * 0.42));
  const strong = [Math.round(red * 0.86), Math.round(green * 0.84), Math.round(blue * 0.92)];
  return {
    '--accent-rgb': `${red}, ${green}, ${blue}`,
    '--accent-soft-rgb': soft.join(', '),
    '--accent-strong-rgb': strong.join(', ')
  };
});
const clockVisible = computed(() => resolveHomeClockVisibility({
  clockBehavior: homeAppearance.state.clockBehavior,
  wallpaperClockOverrides: homeAppearance.state.wallpaperClockOverrides,
  wallpaperId: activeWallpaper.value.id,
  isDynamic: activeWallpaper.value.isDynamic
}));

const clock = computed(() => {
  const value = now.value;
  return {
    hm: `${pad2(value.getHours())}:${pad2(value.getMinutes())}`,
    ss: pad2(value.getSeconds()),
    date: `${value.getFullYear()}年 ${pad2(value.getMonth() + 1)}月${pad2(value.getDate())}日`,
    weekday: WEEKDAY_LABELS[value.getDay()],
    datetime: value.toISOString()
  };
});

const greeting = computed(() => {
  const hour = now.value.getHours();
  if (hour >= 5 && hour < 11) return { en: 'GOOD MORNING', zh: '早上好' };
  if (hour >= 11 && hour < 14) return { en: 'GOOD NOON', zh: '中午好' };
  if (hour >= 14 && hour < 18) return { en: 'GOOD AFTERNOON', zh: '下午好' };
  if (hour >= 18 && hour < 23) return { en: 'GOOD EVENING', zh: '晚上好' };
  return { en: 'GOOD NIGHT', zh: '夜深了' };
});

const periodNote = computed(() => {
  const hour = now.value.getHours();
  if (hour >= 5 && hour < 11) return '从一件小事开始';
  if (hour >= 11 && hour < 14) return '记得留一点午间空白';
  if (hour >= 14 && hour < 18) return '把注意力放回此刻';
  if (hour >= 18 && hour < 23) return '慢下来，也算抵达';
  return '灯还亮着，别忘了休息';
});

const reminder = computed(() => {
  const hour = now.value.getHours();
  if (hour >= 5 && hour < 11) return { eyebrow: 'MORNING NOTE', title: '先确认今天的三件事', caption: '打开 Todo 整理今日节奏', icon: 'fas fa-sun' };
  if (hour >= 11 && hour < 14) return { eyebrow: 'MIDDAY NOTE', title: '给午间留一点余量', caption: '打开 Todo 看看剩余安排', icon: 'fas fa-mug-hot' };
  if (hour >= 14 && hour < 19) return { eyebrow: 'AFTERNOON NOTE', title: '挑一件事做到结束', caption: '打开 Todo 选择当前任务', icon: 'fas fa-feather-pointed' };
  return { eyebrow: 'EVENING NOTE', title: '收好今天，再慢慢休息', caption: '打开 Todo 完成今日回顾', icon: 'fas fa-moon' };
});

const musicState = computed(() => {
  const track = player?.currentTrack?.value || null;
  return {
    isPlaying: Boolean(player?.isPlaying?.value),
    title: String(track?.title || '选择一段陪伴').trim(),
    caption: track ? String(track.artist || 'Shizuki Music').trim() : '打开音乐库开始播放'
  };
});

const activeWhisper = computed(() => {
  const fallback = periodNote.value;
  const pool = [fallback, ...whisperPool.value.map((item) => item.content).filter(Boolean)];
  return pool[whisperIndex.value % pool.length] || fallback;
});

const focusIslandState = computed(() => {
  if (currentFocusTask.value) {
    return {
      eyebrow: 'NEXT TASK',
      caption: '进入专注继续这件事'
    };
  }
  return {
    eyebrow: 'FOCUS DESK',
    caption: 'Todo + 番茄钟会留在桌面'
  };
});

const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((groupCode) => String(groupCode || '').trim().toUpperCase() === 'ADMIN');
});

const companionEntry = computed(() => {
  if (!auth.isAuthenticated.value) {
    return {
      title: '登录后回家',
      caption: '开启自宅伴聊',
      icon: 'fas fa-right-to-bracket',
      disabled: false
    };
  }
  if (!isAdminUser.value) {
    return {
      title: '伴聊未开放',
      caption: '当前仅限 ADMIN',
      icon: 'fas fa-lock',
      disabled: true
    };
  }
  return {
    title: '自宅伴聊',
    caption: '坐下来聊聊',
    icon: 'fas fa-comments',
    disabled: false
  };
});

function handleMusicAction() {
  if (player?.currentTrack?.value && typeof player.togglePlay === 'function') {
    player.togglePlay();
    return;
  }
  router.push('/music-library/music');
}

function handleFocusAction() {
  if (!isFocusActive.value) focus.startFocusSession({ presetId: 'desk' });
}

function openTodo() {
  openLightAppWindow('timeprism-todo', { source: 'home-context-island' });
}

function openAuthorIntro() {
  router.push('/author');
}

function openCompanion() {
  if (!auth.isAuthenticated.value) {
    auth.redirectToAuth('login_required', '/');
    return;
  }
  if (!isAdminUser.value) return;
  openAiChat({
    source: 'home-room',
    preferredMode: 'companion'
  });
}

onMounted(() => {
  clockTimer = window.setInterval(() => {
    now.value = new Date();
  }, 1000);
  whisperTimer = window.setInterval(() => {
    whisperIndex.value += 1;
  }, 9000);

  listPublicPostWhispers()
    .then((payload) => {
      const pool = buildAuthorHomepageWhisperPool(payload);
      if (Array.isArray(pool) && pool.length) whisperPool.value = pool;
    })
    .catch(() => {});
});

onBeforeUnmount(() => {
  if (clockTimer) window.clearInterval(clockTimer);
  if (whisperTimer) window.clearInterval(whisperTimer);
});
</script>

<style scoped>
.home-time-stage {
  --stage-ink: rgba(255, 251, 248, 0.98);
  --stage-ink-soft: rgba(255, 247, 242, 0.78);
  --stage-ink-faint: rgba(255, 244, 238, 0.58);
  --stage-material: linear-gradient(145deg, rgba(36, 28, 35, 0.5), rgba(20, 17, 25, 0.6));
  --stage-material-hover: linear-gradient(145deg, rgba(45, 35, 43, 0.64), rgba(26, 21, 30, 0.7));
  --stage-border: rgba(255, 244, 238, 0.22);
  position: relative;
  min-height: 100%;
  overflow: hidden;
  padding: clamp(100px, 14vh, 148px) clamp(28px, 6vw, 96px) clamp(126px, 17vh, 170px);
  display: grid;
  grid-template-rows: auto minmax(0, 1fr) auto auto;
  align-items: center;
  isolation: isolate;
  color: var(--stage-ink);
  font-family: var(--font-ui);
  text-shadow: var(--theme-contrast-text-shadow-strong, 0 2px 14px rgba(0, 0, 0, 0.62));
}

.stage-ambient {
  position: absolute;
  z-index: -1;
  border-radius: 50%;
  pointer-events: none;
  filter: blur(20px);
  mix-blend-mode: screen;
}

.stage-ambient-primary {
  width: min(42vw, 620px);
  aspect-ratio: 1;
  left: 17%;
  top: 18%;
  background: radial-gradient(circle, rgba(var(--accent-rgb), 0.18), transparent 67%);
  animation: stage-drift-a 16s ease-in-out infinite alternate;
}

.stage-ambient-secondary {
  width: min(34vw, 480px);
  aspect-ratio: 1;
  right: 12%;
  bottom: 7%;
  background: radial-gradient(circle, rgba(var(--accent-soft-rgb), 0.13), transparent 69%);
  animation: stage-drift-b 20s ease-in-out infinite alternate;
}

.stage-greeting {
  justify-self: center;
  display: grid;
  justify-items: center;
  gap: 6px;
  text-align: center;
  animation: stage-rise 720ms cubic-bezier(0.22, 1, 0.36, 1) both;
}

.greeting-rule {
  width: 30px;
  height: 2px;
  margin-bottom: 4px;
  border-radius: 999px;
  background: rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 16px rgba(var(--accent-rgb), 0.55);
}

.stage-greeting p,
.stage-greeting span,
.stage-footer p,
.stage-footer span,
.clock-date,
.clock-hidden-note {
  margin: 0;
}

.stage-greeting p {
  font-size: 11px;
  font-weight: 760;
  letter-spacing: 0.3em;
}

.stage-greeting > span:last-child {
  color: var(--stage-ink-soft);
  font-size: 12px;
  letter-spacing: 0.08em;
}

.stage-clock {
  justify-self: center;
  align-self: center;
  display: grid;
  justify-items: center;
  transform: translateY(-1vh);
  filter: drop-shadow(0 16px 34px rgba(0, 0, 0, 0.28));
}

.clock-time {
  display: flex;
  align-items: flex-start;
  font-size: clamp(92px, 14vw, 202px);
  font-weight: 300;
  line-height: 0.82;
  letter-spacing: -0.075em;
  font-variant-numeric: tabular-nums lining-nums;
  font-feature-settings: 'tnum' 1, 'lnum' 1;
}

.clock-time small {
  margin: 0.06em 0 0 0.32em;
  color: var(--stage-ink-soft);
  font-size: 0.12em;
  font-weight: 620;
  letter-spacing: 0.08em;
}

.clock-date {
  margin-top: clamp(22px, 4vh, 38px);
  padding: 9px 15px;
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  gap: 10px;
  background: rgba(18, 16, 22, 0.2);
  backdrop-filter: blur(8px) saturate(120%);
  -webkit-backdrop-filter: blur(8px) saturate(120%);
  color: var(--stage-ink-soft);
  font-size: 11px;
  letter-spacing: 0.11em;
}

.clock-date i {
  width: 3px;
  height: 3px;
  border-radius: 50%;
  background: rgb(var(--accent-soft-rgb));
}

.clock-hidden-note {
  align-self: center;
  justify-self: center;
  padding: 11px 16px;
  border: 1px solid var(--stage-border);
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  background: rgba(22, 18, 25, 0.3);
  backdrop-filter: blur(14px);
  -webkit-backdrop-filter: blur(14px);
  color: var(--stage-ink-soft);
  font-size: 12px;
}

.context-island-row {
  width: min(100%, 1060px);
  margin: 0 auto;
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 12px;
}

.context-island {
  min-width: 0;
  min-height: 76px;
  padding: 12px 14px;
  border: 1px solid var(--stage-border);
  border-radius: 24px;
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  align-items: center;
  gap: 11px;
  background: var(--stage-material);
  box-shadow: 0 16px 34px rgba(8, 7, 12, 0.22), inset 0 1px rgba(255, 255, 255, 0.1);
  backdrop-filter: blur(20px) saturate(135%);
  -webkit-backdrop-filter: blur(20px) saturate(135%);
  color: var(--stage-ink);
  text-align: left;
  text-shadow: inherit;
  cursor: pointer;
  transition: transform 320ms cubic-bezier(0.22, 1, 0.36, 1), border-color 220ms ease, background 220ms ease, box-shadow 260ms ease;
  animation: island-arrive 680ms cubic-bezier(0.22, 1, 0.36, 1) both;
}

.context-island:nth-child(2) { animation-delay: 80ms; }
.context-island:nth-child(3) { animation-delay: 160ms; }

.context-island:hover {
  transform: translateY(-5px) scale(1.01);
  border-color: rgba(var(--accent-soft-rgb), 0.46);
  background: var(--stage-material-hover);
  box-shadow: 0 22px 42px rgba(8, 7, 12, 0.28), 0 0 0 1px rgba(var(--accent-rgb), 0.1);
}

.context-island:active {
  transform: translateY(-1px) scale(0.985);
}

.context-island:focus-visible {
  outline: 2px solid rgb(var(--accent-soft-rgb));
  outline-offset: 3px;
}

.island-icon {
  width: 42px;
  height: 42px;
  border-radius: 15px;
  display: grid;
  place-items: center;
  background: rgba(var(--accent-rgb), 0.18);
  color: rgb(var(--accent-soft-rgb));
  box-shadow: inset 0 0 0 1px rgba(var(--accent-soft-rgb), 0.14);
}

.island-icon.is-playing {
  animation: icon-pulse 2.2s ease-in-out infinite;
}

.island-copy {
  min-width: 0;
  display: grid;
  gap: 2px;
}

.island-copy small {
  color: rgb(var(--accent-soft-rgb));
  font-size: 8px;
  font-weight: 760;
  letter-spacing: 0.19em;
}

.island-copy strong,
.island-copy span {
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.island-copy strong {
  font-size: 13px;
  font-weight: 680;
}

.island-copy span {
  color: var(--stage-ink-faint);
  font-size: 10px;
}

.island-trailing {
  color: var(--stage-ink-faint);
  font-size: 11px;
  transition: transform 260ms cubic-bezier(0.22, 1, 0.36, 1), color 220ms ease;
}

.context-island:hover .island-trailing {
  transform: translateX(3px);
  color: rgb(var(--accent-soft-rgb));
}

.home-room-utilities {
  position: absolute;
  left: clamp(30px, 5vw, 76px);
  bottom: clamp(28px, 5vh, 52px);
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.home-room-utility {
  min-height: 34px;
  padding: 7px 11px;
  border: 1px solid var(--stage-border);
  border-radius: 999px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  background: rgba(22, 18, 25, 0.28);
  box-shadow: inset 0 1px rgba(255, 255, 255, 0.08);
  backdrop-filter: blur(14px) saturate(125%);
  -webkit-backdrop-filter: blur(14px) saturate(125%);
  color: var(--stage-ink-soft);
  font: inherit;
  font-size: 10px;
  text-shadow: inherit;
  cursor: pointer;
  transition: transform 240ms cubic-bezier(0.22, 1, 0.36, 1), border-color 200ms ease, background 200ms ease, color 200ms ease;
}

.home-room-utility:hover:not(:disabled) {
  transform: translateY(-2px);
  border-color: rgba(var(--accent-soft-rgb), 0.42);
  background: rgba(var(--accent-rgb), 0.14);
  color: var(--stage-ink);
}

.home-room-utility:focus-visible {
  outline: 2px solid rgb(var(--accent-soft-rgb));
  outline-offset: 2px;
}

.home-room-utility i {
  color: rgb(var(--accent-soft-rgb));
}

.home-companion-utility small {
  color: var(--stage-ink-faint);
  font-size: 8px;
}

.home-room-utility.locked {
  cursor: not-allowed;
  opacity: 0.62;
}

.stage-footer {
  position: absolute;
  right: clamp(30px, 5vw, 76px);
  bottom: clamp(28px, 5vh, 52px);
  max-width: min(36vw, 430px);
  display: grid;
  gap: 4px;
  text-align: right;
}

.stage-footer p {
  color: var(--stage-ink-soft);
  font-family: var(--font-cute);
  font-size: 12px;
}

.stage-footer span {
  color: var(--stage-ink-faint);
  font-size: 9px;
  letter-spacing: 0.08em;
}

.focus-stage-placeholder {
  min-height: 100%;
}

.clock-reveal-enter-active,
.clock-reveal-leave-active {
  transition: opacity 420ms ease, transform 520ms cubic-bezier(0.22, 1, 0.36, 1), filter 420ms ease;
}

.clock-reveal-enter-from,
.clock-reveal-leave-to {
  opacity: 0;
  transform: translateY(12px) scale(0.96);
  filter: blur(6px);
}

.whisper-fade-enter-active,
.whisper-fade-leave-active {
  transition: opacity 320ms ease, transform 320ms ease;
}

.whisper-fade-enter-from { opacity: 0; transform: translateY(4px); }
.whisper-fade-leave-to { opacity: 0; transform: translateY(-4px); }

@keyframes stage-rise {
  from { opacity: 0; transform: translateY(12px); }
  to { opacity: 1; transform: translateY(0); }
}

@keyframes island-arrive {
  from { opacity: 0; transform: translateY(18px) scale(0.96); }
  to { opacity: 1; transform: translateY(0) scale(1); }
}

@keyframes stage-drift-a {
  to { transform: translate3d(42px, -18px, 0) scale(1.08); }
}

@keyframes stage-drift-b {
  to { transform: translate3d(-28px, 24px, 0) scale(1.1); }
}

@keyframes icon-pulse {
  50% { transform: scale(1.06); box-shadow: inset 0 0 0 1px rgba(var(--accent-soft-rgb), 0.22), 0 0 20px rgba(var(--accent-rgb), 0.2); }
}

.home-time-stage.motion-calm .stage-ambient,
.home-time-stage.motion-calm .island-icon.is-playing {
  animation: none;
}

.home-time-stage.motion-calm .context-island,
.home-time-stage.motion-calm .stage-greeting {
  animation-duration: 300ms;
  animation-delay: 0ms;
}

.home-time-stage.motion-off *,
.home-time-stage.motion-off *::before,
.home-time-stage.motion-off *::after {
  animation: none !important;
  transition-duration: 0ms !important;
}

:root[data-theme-mode='day'] .home-time-stage {
  --stage-ink: rgba(61, 47, 45, 0.98);
  --stage-ink-soft: rgba(77, 58, 55, 0.82);
  --stage-ink-faint: rgba(95, 71, 67, 0.64);
  --stage-material: linear-gradient(145deg, rgba(255, 252, 249, 0.68), rgba(244, 233, 231, 0.64));
  --stage-material-hover: linear-gradient(145deg, rgba(255, 254, 252, 0.84), rgba(246, 232, 230, 0.78));
  --stage-border: rgba(106, 76, 72, 0.24);
  text-shadow: 0 1px 8px rgba(255, 255, 255, 0.38), 0 2px 12px rgba(63, 43, 41, 0.14);
}

:root[data-theme-mode='day'] .clock-date,
:root[data-theme-mode='day'] .clock-hidden-note,
:root[data-theme-mode='day'] .home-room-utility {
  background: rgba(255, 250, 247, 0.48);
}

@media (max-width: 1100px) {
  .home-time-stage {
    padding-inline: 24px;
  }

  .context-island-row {
    gap: 8px;
  }

  .context-island {
    padding-inline: 11px;
  }

  .island-icon {
    width: 38px;
    height: 38px;
  }

  .home-companion-utility small {
    display: none;
  }

  .home-room-utilities {
    left: 124px;
  }
}

@media (max-width: 900px) {
  .home-time-stage {
    overflow: auto;
    padding: 100px 18px 138px;
    grid-template-rows: auto minmax(240px, 1fr) auto;
  }

  .context-island-row {
    grid-template-columns: minmax(0, 1fr);
    width: min(100%, 520px);
  }

  .stage-footer {
    display: none;
  }

  .home-room-utilities {
    position: static;
    justify-self: center;
    margin-top: 14px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .home-time-stage *,
  .home-time-stage *::before,
  .home-time-stage *::after {
    scroll-behavior: auto !important;
    animation: none !important;
    transition-duration: 0.01ms !important;
  }
}
</style>
