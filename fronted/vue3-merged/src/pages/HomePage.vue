<template>
  <section class="wallpaper-home-page" aria-label="自宅">
    <div class="wallpaper-home-orb orb-a" aria-hidden="true"></div>
    <div class="wallpaper-home-orb orb-b" aria-hidden="true"></div>

    <div class="home-layout">
      <article class="home-welcome-panel fade-rise">
        <header class="home-welcome-head">
          <p class="home-kicker">{{ greeting.en }}</p>
          <span class="home-place-label">SHIZUKI HOME</span>
        </header>

        <h1>{{ greeting.zh }}</h1>

        <div class="home-clock" aria-label="当前时间">
          <span class="clock-time">
            {{ clock.hm }}<small class="clock-seconds">:{{ clock.ss }}</small>
          </span>
          <span class="clock-date">
            <span>{{ clock.date }}</span>
            <span>{{ clock.weekday }}</span>
          </span>
        </div>

        <p class="home-whisper" aria-live="off">
          <span class="whisper-mark" aria-hidden="true">「</span>
          <Transition name="whisper-fade" mode="out-in">
            <span :key="whisperIndex" class="whisper-text">{{ activeWhisper }}</span>
          </Transition>
          <span class="whisper-mark" aria-hidden="true">」</span>
        </p>

        <div class="home-actions">
          <button class="primary-btn home-primary-action ripple-trigger" type="button" @click="openPath('/ai-hub')">
            <i class="fas fa-brain" aria-hidden="true"></i>
            进入 AI Hub
          </button>
          <button class="ghost-btn home-secondary-action ripple-trigger" type="button" @click="openAuthorIntro">
            <i class="fas fa-circle-info" aria-hidden="true"></i>
            关于这里
          </button>
        </div>
      </article>

      <aside class="home-room-card fade-rise-late" aria-label="自宅伴聊">
        <div class="room-door-sign" aria-hidden="true">
          <span class="room-door-line"></span>
          <span class="room-door-knob"></span>
        </div>

        <header class="room-card-head">
          <div>
            <p class="room-kicker">PRIVATE ROOM</p>
            <h2>自宅</h2>
          </div>
          <span class="room-lamp" :class="`tone-${roomLamp.tone}`">
            <i aria-hidden="true"></i>
            {{ roomLamp.label }}
          </span>
        </header>

        <div class="room-message">
          <strong>欢迎回家。</strong>
          <p>伴聊留在熟悉的壁纸与音乐旁边，不必先进入工作区。</p>
        </div>

        <button
          class="home-companion-action ripple-trigger"
          type="button"
          :disabled="companionEntry.disabled"
          @click="openCompanion"
        >
          <span class="companion-action-icon" aria-hidden="true"><i :class="companionEntry.icon"></i></span>
          <span>
            <strong>{{ companionEntry.title }}</strong>
            <small>{{ companionEntry.caption }}</small>
          </span>
          <i class="fas fa-arrow-right companion-action-arrow" aria-hidden="true"></i>
        </button>

        <nav class="home-quick-links" aria-label="自宅快捷入口">
          <button
            v-for="item in quickTools"
            :key="item.path"
            class="home-quick-link ripple-trigger"
            type="button"
            @click="openPath(item.path)"
          >
            <i :class="item.icon" aria-hidden="true"></i>
            <span>{{ item.label }}</span>
          </button>
        </nav>
      </aside>
    </div>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import { useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';
import { listPublicPostWhispers } from '../services/blogApi';
import { openAiChat } from '../utils/aiChatBus';
import { buildAuthorHomepageWhisperPool } from './authorHomepageWhispersState';

const router = useRouter();
const auth = useAuthSession();

const quickTools = [
  { path: '/music-library/music', label: 'Music', icon: 'fas fa-compact-disc' },
  { path: '/apps', label: 'Apps', icon: 'fas fa-grip' },
  { path: '/blog', label: 'Blog', icon: 'fas fa-feather' }
];

const now = ref(new Date());
let clockTimer = null;

const WEEKDAY_LABELS = ['周日', '周一', '周二', '周三', '周四', '周五', '周六'];

function pad2(value) {
  return String(value).padStart(2, '0');
}

const clock = computed(() => {
  const d = now.value;
  return {
    hm: `${pad2(d.getHours())}:${pad2(d.getMinutes())}`,
    ss: pad2(d.getSeconds()),
    date: `${d.getMonth() + 1}月${d.getDate()}日`,
    weekday: WEEKDAY_LABELS[d.getDay()]
  };
});

const greeting = computed(() => {
  const h = now.value.getHours();
  if (h >= 5 && h < 11) {
    return { en: 'Good Morning', zh: '早上好', note: '新的一天，慢慢来就好。' };
  }
  if (h >= 11 && h < 13) {
    return { en: 'Good Noon', zh: '中午好', note: '记得好好吃饭，稍作休息。' };
  }
  if (h >= 13 && h < 18) {
    return { en: 'Good Afternoon', zh: '下午好', note: '愿你今天也过得充实又自在。' };
  }
  if (h >= 18 && h < 23) {
    return { en: 'Good Evening', zh: '晚上好', note: '忙了一天，回到这里放松一下吧。' };
  }
  return { en: 'Good Night', zh: '夜深了', note: '夜深了，注意休息，晚安。' };
});

const roomLamp = computed(() => {
  const h = now.value.getHours();
  if (h >= 5 && h < 11) return { label: '晨光正好', tone: 'morning' };
  if (h >= 11 && h < 18) return { label: '窗边明亮', tone: 'day' };
  if (h >= 18 && h < 23) return { label: '暖灯亮着', tone: 'evening' };
  return { label: '留一盏灯', tone: 'night' };
});

const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((groupCode) => String(groupCode || '').trim().toUpperCase() === 'ADMIN');
});

const companionEntry = computed(() => {
  if (!auth.isAuthenticated.value) {
    return {
      title: '登录后回家',
      caption: '登录后打开自宅伴聊',
      icon: 'fas fa-right-to-bracket',
      disabled: false
    };
  }
  if (!isAdminUser.value) {
    return {
      title: '自宅伴聊未开放',
      caption: '当前仅限 ADMIN',
      icon: 'fas fa-lock',
      disabled: true
    };
  }
  return {
    title: '坐下来聊聊',
    caption: '打开自宅伴聊',
    icon: 'fas fa-comments',
    disabled: false
  };
});

const whisperPool = ref(buildAuthorHomepageWhisperPool(null));
const whisperIndex = ref(0);
let whisperTimer = null;

const activeWhisper = computed(() => {
  const pool = [greeting.value.note, ...whisperPool.value.map((item) => item.content)];
  return pool[whisperIndex.value % pool.length] || greeting.value.note;
});

function rotateWhisper() {
  const total = whisperPool.value.length + 1;
  whisperIndex.value = (whisperIndex.value + 1) % total;
}

onMounted(() => {
  clockTimer = window.setInterval(() => {
    now.value = new Date();
  }, 1000);
  whisperTimer = window.setInterval(rotateWhisper, 9000);

  listPublicPostWhispers()
    .then((payload) => {
      const pool = buildAuthorHomepageWhisperPool(payload);
      if (Array.isArray(pool) && pool.length) whisperPool.value = pool;
    })
    .catch(() => {
      /* 静默回退内置文案池 */
    });
});

onBeforeUnmount(() => {
  if (clockTimer) window.clearInterval(clockTimer);
  if (whisperTimer) window.clearInterval(whisperTimer);
});

function openAuthorIntro() {
  router.push('/author');
}

function openPath(path) {
  router.push(path);
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
</script>

<style scoped>
.wallpaper-home-page {
  position: relative;
  min-height: 100%;
  padding: clamp(116px, 17vh, 162px) clamp(22px, 5vw, 66px) clamp(132px, 19vh, 170px);
  display: grid;
  align-items: end;
  overflow: hidden;
  font-family: var(--font-ui);

  --home-panel-bg: linear-gradient(155deg, rgba(43, 34, 42, 0.7), rgba(25, 20, 28, 0.76));
  --home-room-bg: linear-gradient(150deg, rgba(50, 38, 45, 0.74), rgba(28, 22, 31, 0.82));
  --home-border: rgba(255, 231, 224, 0.24);
  --home-border-strong: rgba(255, 224, 213, 0.34);
  --home-highlight: rgba(255, 255, 255, 0.16);
  --home-shadow: 0 28px 64px rgba(12, 7, 14, 0.42);
  --home-blur: blur(22px) saturate(145%);
  --home-ink: rgba(255, 248, 244, 0.97);
  --home-ink-secondary: rgba(239, 222, 214, 0.9);
  --home-ink-tertiary: rgba(213, 193, 184, 0.76);
  --home-soft-fill: rgba(255, 255, 255, 0.08);
  --home-soft-fill-hover: rgba(255, 255, 255, 0.13);
  --home-accent-fill: linear-gradient(135deg, rgba(242, 179, 157, 0.94), rgba(226, 137, 142, 0.92));
  --home-accent-ink: rgba(54, 34, 30, 0.96);
}

.home-layout {
  position: relative;
  z-index: 1;
  width: min(100%, 1160px);
  margin: 0 auto;
  display: grid;
  grid-template-columns: minmax(0, 540px) minmax(300px, 356px);
  align-items: end;
  justify-content: space-between;
  gap: clamp(24px, 5vw, 72px);
}

.home-welcome-panel,
.home-room-card {
  color: var(--home-ink);
  border: 1px solid var(--home-border);
  box-shadow:
    var(--home-shadow),
    inset 0 1px 0 var(--home-highlight);
  backdrop-filter: var(--home-blur);
  -webkit-backdrop-filter: var(--home-blur);
  transition:
    background var(--dur-slow) var(--ease-out),
    border-color var(--dur-slow) var(--ease-out),
    box-shadow var(--dur-slow) var(--ease-out),
    color var(--dur-slow) var(--ease-out);
}

.home-welcome-panel {
  padding: clamp(28px, 4vw, 42px);
  border-radius: 32px;
  display: grid;
  gap: 17px;
  background: var(--home-panel-bg);
}

.home-welcome-head,
.room-card-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 14px;
}

.home-kicker,
.room-kicker {
  margin: 0;
  color: rgba(var(--accent-soft-rgb), 0.96);
  font-size: 11px;
  font-weight: 700;
  letter-spacing: 0.25em;
  text-transform: uppercase;
}

.home-place-label {
  color: var(--home-ink-tertiary);
  font-size: 10px;
  font-weight: 650;
  letter-spacing: 0.18em;
}

.home-welcome-panel h1 {
  margin: 0;
  font-family: var(--font-display);
  font-size: clamp(34px, 5vw, 50px);
  font-weight: 500;
  line-height: 1.05;
  letter-spacing: 0.02em;
}

.home-clock {
  display: flex;
  align-items: flex-end;
  gap: 15px;
  flex-wrap: wrap;
}

.clock-time {
  color: rgba(var(--accent-soft-rgb), 0.98);
  font-size: clamp(32px, 4.2vw, 43px);
  font-weight: 620;
  line-height: 1;
  letter-spacing: 0.035em;
  font-variant-numeric: tabular-nums;
  filter: drop-shadow(0 1px 6px rgba(var(--accent-rgb), 0.22));
}

.clock-seconds {
  color: var(--home-ink-tertiary);
  font-size: 0.48em;
  font-weight: 600;
}

.clock-date {
  padding-bottom: 3px;
  display: grid;
  gap: 2px;
  color: var(--home-ink-tertiary);
  font-size: 12px;
  line-height: 1.3;
  letter-spacing: 0.08em;
}

.clock-date span:first-child {
  color: var(--home-ink-secondary);
}

.home-whisper {
  min-height: 3.4em;
  margin: 0;
  display: flex;
  align-items: baseline;
  gap: 3px;
  color: var(--home-ink-secondary);
  font-family: var(--font-cute);
  font-size: clamp(14px, 1.8vw, 16px);
  line-height: 1.7;
}

.whisper-mark {
  flex: none;
  color: rgba(var(--accent-soft-rgb), 0.92);
  font-family: var(--font-display);
}

.whisper-text {
  display: -webkit-box;
  overflow: hidden;
  -webkit-box-orient: vertical;
  -webkit-line-clamp: 2;
}

.whisper-fade-enter-active,
.whisper-fade-leave-active {
  transition: opacity 0.42s var(--ease-out), transform 0.42s var(--ease-out);
}

.whisper-fade-enter-from {
  opacity: 0;
  transform: translateY(6px);
}

.whisper-fade-leave-to {
  opacity: 0;
  transform: translateY(-6px);
}

.home-actions {
  display: flex;
  align-items: center;
  gap: 10px;
  flex-wrap: wrap;
}

.home-actions :is(.home-primary-action, .home-secondary-action) {
  min-height: 44px;
  padding: 10px 20px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
  border-radius: 999px !important;
  font-family: var(--font-ui);
  font-size: 14px;
  font-weight: 650;
  cursor: pointer;
}

.home-primary-action {
  border: 1px solid rgba(var(--accent-soft-rgb), 0.5) !important;
  background: var(--home-accent-fill) !important;
  color: var(--home-accent-ink) !important;
  box-shadow: 0 12px 26px rgba(var(--accent-rgb), 0.22);
}

.home-secondary-action {
  border: 1px solid var(--home-border-strong) !important;
  background: var(--home-soft-fill) !important;
  color: var(--home-ink) !important;
}

.home-room-card {
  position: relative;
  overflow: hidden;
  padding: 26px 28px 22px;
  border-radius: 28px 28px 15px 28px;
  display: grid;
  gap: 22px;
  background: var(--home-room-bg);
}

.room-door-sign {
  position: absolute;
  top: 58px;
  right: 16px;
  bottom: 58px;
  width: 10px;
  pointer-events: none;
}

.room-door-line {
  position: absolute;
  top: 0;
  right: 2px;
  bottom: 0;
  width: 1px;
  background: linear-gradient(180deg, transparent, var(--home-border-strong) 18%, var(--home-border-strong) 82%, transparent);
}

.room-door-knob {
  position: absolute;
  top: 57%;
  right: -2px;
  width: 9px;
  height: 9px;
  border: 2px solid rgba(var(--accent-soft-rgb), 0.78);
  border-radius: 50%;
  box-shadow: 0 0 16px rgba(var(--accent-rgb), 0.52);
}

.room-card-head {
  padding-right: 14px;
  align-items: flex-start;
}

.room-card-head h2 {
  margin: 5px 0 0;
  font-family: var(--font-display);
  font-size: 31px;
  font-weight: 520;
  line-height: 1;
}

.room-lamp {
  margin-top: 2px;
  padding: 7px 10px;
  display: inline-flex;
  align-items: center;
  gap: 7px;
  border: 1px solid var(--home-border);
  border-radius: 999px;
  background: var(--home-soft-fill);
  color: var(--home-ink-secondary);
  font-size: 11px;
  white-space: nowrap;
}

.room-lamp i {
  width: 7px;
  height: 7px;
  border-radius: 50%;
  background: #f2b39d;
  box-shadow: 0 0 10px rgba(242, 179, 157, 0.78);
}

.room-lamp.tone-morning i {
  background: #f5c77a;
  box-shadow: 0 0 11px rgba(245, 199, 122, 0.8);
}

.room-lamp.tone-day i {
  background: #e9ad88;
  box-shadow: 0 0 11px rgba(233, 173, 136, 0.72);
}

.room-lamp.tone-evening i {
  background: #ef947e;
  box-shadow: 0 0 12px rgba(239, 148, 126, 0.82);
}

.room-message {
  padding-right: 14px;
}

.room-message strong {
  display: block;
  font-family: var(--font-cute);
  font-size: 18px;
  font-weight: 600;
}

.room-message p {
  margin: 8px 0 0;
  color: var(--home-ink-secondary);
  font-size: 13px;
  line-height: 1.65;
}

.home-companion-action {
  min-width: 0;
  min-height: 64px;
  padding: 10px 13px;
  border: 1px solid var(--home-border-strong);
  border-radius: 18px;
  display: grid;
  grid-template-columns: auto 1fr auto;
  align-items: center;
  gap: 12px;
  background: var(--home-soft-fill);
  color: var(--home-ink);
  text-align: left;
  font: inherit;
  cursor: pointer;
  transition:
    transform var(--dur-base) var(--ease-spring),
    background var(--dur-base) var(--ease-out),
    border-color var(--dur-base) var(--ease-out),
    box-shadow var(--dur-base) var(--ease-out);
}

.home-companion-action:hover {
  transform: translateY(-2px);
  border-color: rgba(var(--accent-rgb), 0.58);
  background: var(--home-soft-fill-hover);
  box-shadow: 0 14px 28px rgba(12, 7, 14, 0.2);
}

.home-companion-action:disabled {
  cursor: not-allowed;
  opacity: 0.66;
}

.home-companion-action:disabled:hover {
  transform: none;
  border-color: var(--home-border-strong);
  background: var(--home-soft-fill);
  box-shadow: none;
}

.companion-action-icon {
  width: 40px;
  height: 40px;
  display: grid;
  place-items: center;
  border-radius: 14px;
  background: var(--home-accent-fill);
  color: var(--home-accent-ink);
  box-shadow: 0 8px 18px rgba(var(--accent-rgb), 0.22);
}

.home-companion-action > span:nth-child(2) {
  min-width: 0;
  display: grid;
  gap: 3px;
}

.home-companion-action strong {
  font-size: 14px;
  font-weight: 680;
}

.home-companion-action small {
  color: var(--home-ink-tertiary);
  font-size: 11px;
}

.companion-action-arrow {
  padding-right: 5px;
  color: rgba(var(--accent-soft-rgb), 0.96);
  font-size: 12px;
  transition: transform var(--dur-base) var(--ease-spring);
}

.home-companion-action:hover .companion-action-arrow {
  transform: translateX(4px);
}

.home-quick-links {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 7px;
}

.home-quick-link {
  min-width: 0;
  min-height: 38px;
  padding: 8px 6px;
  border: 1px solid transparent;
  border-radius: 12px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 7px;
  background: transparent;
  color: var(--home-ink-tertiary);
  font: inherit;
  font-size: 11px;
  cursor: pointer;
  transition:
    color var(--dur-fast) var(--ease-out),
    background var(--dur-fast) var(--ease-out),
    border-color var(--dur-fast) var(--ease-out);
}

.home-quick-link:hover {
  border-color: var(--home-border);
  background: var(--home-soft-fill);
  color: var(--home-ink);
}

.wallpaper-home-orb {
  position: absolute;
  border-radius: 999px;
  pointer-events: none;
  animation: home-orb-drift 16s ease-in-out infinite alternate;
}

.orb-a {
  left: 9%;
  bottom: 13%;
  width: 230px;
  height: 230px;
  background: radial-gradient(circle, rgba(255, 199, 223, 0.2), rgba(255, 199, 223, 0));
}

.orb-b {
  right: 11%;
  top: 15%;
  width: 280px;
  height: 280px;
  background: radial-gradient(circle, rgba(255, 205, 190, 0.18), rgba(255, 205, 190, 0));
  animation-delay: -8s;
  animation-duration: 20s;
}

@keyframes home-orb-drift {
  from {
    transform: translate3d(0, 0, 0) scale(1);
  }
  to {
    transform: translate3d(24px, -18px, 0) scale(1.08);
  }
}

:root[data-theme-mode='day'] .wallpaper-home-page {
  --home-panel-bg: linear-gradient(155deg, rgba(255, 251, 247, 0.9), rgba(250, 240, 237, 0.84));
  --home-room-bg: linear-gradient(150deg, rgba(255, 249, 245, 0.94), rgba(247, 233, 229, 0.9));
  --home-border: rgba(126, 88, 82, 0.24);
  --home-border-strong: rgba(156, 101, 94, 0.34);
  --home-highlight: rgba(255, 255, 255, 0.92);
  --home-shadow: 0 24px 58px rgba(78, 53, 49, 0.2);
  --home-blur: blur(19px) saturate(128%);
  --home-ink: #4a3734;
  --home-ink-secondary: rgba(92, 64, 60, 0.9);
  --home-ink-tertiary: rgba(124, 88, 82, 0.76);
  --home-soft-fill: rgba(255, 255, 255, 0.52);
  --home-soft-fill-hover: rgba(255, 255, 255, 0.78);
  --home-accent-fill: linear-gradient(135deg, #f2b39d, #e68f91);
  --home-accent-ink: #3f2926;
}

:root[data-theme-mode='day'] .home-kicker,
:root[data-theme-mode='day'] .room-kicker,
:root[data-theme-mode='day'] .whisper-mark,
:root[data-theme-mode='day'] .companion-action-arrow {
  color: rgba(var(--accent-readable-rgb, var(--accent-strong-rgb)), 1);
}

:root[data-theme-mode='day'] .clock-time {
  color: rgba(var(--accent-readable-rgb, var(--accent-strong-rgb)), 1);
  filter: none;
}

:root[data-theme-mode='day'] .home-companion-action:hover {
  box-shadow: 0 14px 28px rgba(78, 53, 49, 0.14);
}

@supports not ((backdrop-filter: blur(1px)) or (-webkit-backdrop-filter: blur(1px))) {
  .wallpaper-home-page {
    --home-panel-bg: linear-gradient(150deg, rgba(52, 40, 48, 0.97), rgba(38, 29, 38, 0.96));
    --home-room-bg: linear-gradient(150deg, rgba(48, 38, 46, 0.98), rgba(36, 28, 37, 0.97));
  }

  :root[data-theme-mode='day'] .wallpaper-home-page {
    --home-panel-bg: linear-gradient(150deg, #fff9f5, #f9eeeb);
    --home-room-bg: linear-gradient(150deg, #fff9f5, #f5e5e2);
  }
}

@media (prefers-reduced-motion: reduce) {
  .wallpaper-home-orb {
    animation: none;
  }

  .whisper-fade-enter-active,
  .whisper-fade-leave-active {
    transition: opacity 0.2s linear;
  }

  .whisper-fade-enter-from,
  .whisper-fade-leave-to {
    transform: none;
  }
}

@media (max-width: 960px) {
  .wallpaper-home-page {
    align-items: end;
    overflow: auto;
  }

  .home-layout {
    grid-template-columns: minmax(0, 1fr);
    width: min(100%, 560px);
    gap: 16px;
  }

  .home-room-card {
    padding: 22px 24px 18px;
  }
}

@media (max-width: 640px) {
  .wallpaper-home-page {
    padding: 108px 16px 146px;
  }

  .home-welcome-panel {
    padding: 23px 20px;
    border-radius: 25px;
  }

  .home-place-label {
    display: none;
  }

  .home-actions > * {
    flex: 1;
  }

  .home-room-card {
    border-radius: 24px 24px 13px 24px;
  }

  .room-message p {
    max-width: 28em;
  }
}
</style>
