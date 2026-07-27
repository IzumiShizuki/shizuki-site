<template>
  <section class="wallpaper-home-page" aria-label="Wallpaper Home">
    <div class="wallpaper-home-orb orb-a" aria-hidden="true"></div>
    <div class="wallpaper-home-orb orb-b" aria-hidden="true"></div>

    <article class="wallpaper-home-dock fade-rise">
      <p class="wallpaper-home-kicker">{{ greeting.en }}</p>
      <h1>{{ greeting.zh }}</h1>

      <div class="wallpaper-home-clock" aria-label="当前时间">
        <span class="clock-time">
          {{ clock.hm }}<small class="clock-seconds">:{{ clock.ss }}</small>
        </span>
        <span class="clock-date">
          <span>{{ clock.date }}</span>
          <span>{{ clock.weekday }}</span>
        </span>
      </div>

      <p class="wallpaper-home-whisper" aria-live="off">
        <span class="whisper-mark" aria-hidden="true">「</span>
        <Transition name="whisper-fade" mode="out-in">
          <span :key="whisperIndex" class="whisper-text">{{ activeWhisper }}</span>
        </Transition>
        <span class="whisper-mark" aria-hidden="true">」</span>
      </p>

      <div class="wallpaper-home-actions">
        <button class="primary-btn ripple-trigger" type="button" @click="openAuthorIntro">
          <i class="fas fa-circle-info" aria-hidden="true"></i>
          网站介绍
        </button>
        <button class="ghost-btn ripple-trigger" type="button" @click="openPath('/blog')">
          <i class="fas fa-feather" aria-hidden="true"></i>
          博客
        </button>
      </div>

      <div class="wallpaper-home-meta">
        <span>Wallpaper Focus</span>
        <span>Music Nearby</span>
        <span>Quick Tools Ready</span>
      </div>
    </article>

    <div class="wallpaper-home-shortcuts fade-rise-late">
      <p class="shortcuts-kicker">Quick Access</p>
      <button
        v-for="item in quickTools"
        :key="item.path"
        class="wallpaper-home-shortcut ripple-trigger"
        type="button"
        @click="openPath(item.path)"
      >
        <span class="shortcut-icon" aria-hidden="true"><i :class="item.icon"></i></span>
        <span class="shortcut-text">
          <span class="shortcut-label">{{ item.label }}</span>
          <span class="shortcut-sub">{{ item.sub }}</span>
        </span>
        <i class="fas fa-arrow-right shortcut-arrow" aria-hidden="true"></i>
      </button>
    </div>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import { useRouter } from 'vue-router';
import { listPublicPostWhispers } from '../services/blogApi';
import { buildAuthorHomepageWhisperPool } from './authorHomepageWhispersState';

const router = useRouter();

const quickTools = [
  { path: '/music-library/music', label: 'Music', sub: '音乐资料馆', icon: 'fas fa-compact-disc' },
  { path: '/apps', label: 'Apps', sub: '轻应用集', icon: 'fas fa-grip' },
  { path: '/ai-hub', label: 'AI', sub: 'AI 中心', icon: 'fas fa-brain' }
];

/* 实时时钟：秒级刷新，同时驱动时段问候跨时段自动切换。 */
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

/* 时段问候：随打开时间变化的一点温度 */
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

/* 低语一言：优先站内公开低语，取不到时退回内置文案池；问候语的小注脚永远排在第一条。 */
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
</script>

<style scoped>
.wallpaper-home-page {
  position: relative;
  min-height: 100%;
  padding: clamp(118px, 18vh, 168px) clamp(18px, 5vw, 54px) clamp(132px, 20vh, 176px);
  display: flex;
  align-items: flex-end;
  justify-content: space-between;
  gap: 24px;
  overflow: hidden;

  /* —— 首页毛玻璃材质（夜间默认）——
   * 清透轻盈方向：低不透明度暖炭底 + 大半径模糊 + 顶部高光边，
   * 让壁纸透进来的同时保证文字对比度；日间由下方 day 覆写整组变量。 */
  --home-glass-bg: linear-gradient(160deg, rgba(46, 36, 46, 0.5), rgba(24, 18, 28, 0.56));
  --home-glass-bg-soft: linear-gradient(160deg, rgba(46, 36, 46, 0.42), rgba(24, 18, 28, 0.48));
  --home-glass-border: rgba(255, 231, 238, 0.24);
  --home-glass-highlight: rgba(255, 255, 255, 0.18);
  --home-glass-shadow: 0 24px 56px rgba(12, 7, 14, 0.42);
  --home-glass-blur: blur(22px) saturate(150%);
  --home-glass-blur-soft: blur(18px) saturate(145%);
  --home-ink: rgba(255, 246, 240, 0.97);
  --home-ink-secondary: rgba(240, 224, 216, 0.9);
  --home-ink-tertiary: rgba(219, 199, 190, 0.78);
  --home-chip-bg: rgba(255, 255, 255, 0.09);
  --home-chip-border: rgba(255, 255, 255, 0.22);
  --home-tile-bg: rgba(var(--accent-rgb), 0.16);
  --home-hover-bg: rgba(255, 255, 255, 0.08);
}

/* 主停靠卡：真正的毛玻璃。 */
.wallpaper-home-dock {
  position: relative;
  z-index: 1;
  width: min(100%, 478px);
  padding: clamp(24px, 4vw, 34px);
  border-radius: 30px;
  display: grid;
  gap: 15px;
  color: var(--home-ink);
  background: var(--home-glass-bg);
  border: 1px solid var(--home-glass-border);
  box-shadow:
    var(--home-glass-shadow),
    inset 0 1px 0 var(--home-glass-highlight);
  backdrop-filter: var(--home-glass-blur);
  -webkit-backdrop-filter: var(--home-glass-blur);
  text-shadow: var(--theme-contrast-text-shadow-soft, 0 1px 0 rgba(0, 0, 0, 0.18));
  transition:
    background var(--dur-slow, 0.42s) var(--ease-out, ease),
    border-color var(--dur-slow, 0.42s) var(--ease-out, ease),
    box-shadow var(--dur-slow, 0.42s) var(--ease-out, ease),
    color var(--dur-slow, 0.42s) var(--ease-out, ease);
}

.wallpaper-home-kicker {
  margin: 0;
  color: rgba(var(--accent-soft-rgb), 0.95);
  font-size: 12px;
  font-weight: 700;
  letter-spacing: 0.28em;
  text-transform: uppercase;
}

.wallpaper-home-dock h1 {
  margin: 0;
  font-size: clamp(30px, 5vw, 46px);
  line-height: 1.04;
}

/* 实时时钟：渐变数字 + 右侧日期堆叠。 */
.wallpaper-home-clock {
  display: flex;
  align-items: flex-end;
  gap: 14px;
  flex-wrap: wrap;
}

.clock-time {
  font-size: clamp(30px, 4.2vw, 40px);
  font-weight: 600;
  line-height: 1;
  letter-spacing: 0.04em;
  font-variant-numeric: tabular-nums;
  color: rgba(var(--accent-soft-rgb), 0.98);
  background: var(--accent-text-gradient, none);
  -webkit-background-clip: text;
  background-clip: text;
  -webkit-text-fill-color: transparent;
  text-shadow: none;
  filter: drop-shadow(0 1px 6px rgba(var(--accent-rgb), 0.24));
}

/* 秒针刻意做成柔和的次级色：主时间强、秒数弱，日夜两版观感一致。 */
.clock-seconds {
  font-size: 0.52em;
  font-weight: 600;
  background: none;
  -webkit-background-clip: initial;
  background-clip: initial;
  -webkit-text-fill-color: currentColor;
  color: var(--home-ink-tertiary);
}

.clock-date {
  display: grid;
  gap: 2px;
  padding-bottom: 3px;
  font-size: 12.5px;
  line-height: 1.25;
  letter-spacing: 0.08em;
  color: var(--home-ink-tertiary);
}

.clock-date span:first-child {
  color: var(--home-ink-secondary);
}

/* 低语一言：固定两行高度避免轮换时跳动。 */
.wallpaper-home-whisper {
  margin: 0;
  display: flex;
  align-items: baseline;
  gap: 2px;
  min-height: calc(2em * 1.7);
  color: var(--home-ink-secondary);
  font-size: clamp(13.5px, 1.8vw, 15.5px);
  line-height: 1.7;
}

.whisper-mark {
  flex: none;
  color: rgba(var(--accent-soft-rgb), 0.9);
  font-weight: 700;
}

.whisper-text {
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
  overflow: hidden;
}

.whisper-fade-enter-active,
.whisper-fade-leave-active {
  transition: opacity 0.45s var(--ease-out, ease), transform 0.45s var(--ease-out, ease);
}

.whisper-fade-enter-from {
  opacity: 0;
  transform: translateY(6px);
}

.whisper-fade-leave-to {
  opacity: 0;
  transform: translateY(-6px);
}

.wallpaper-home-actions,
.wallpaper-home-meta {
  display: flex;
  align-items: center;
  gap: 12px;
  flex-wrap: wrap;
}

/* —— 主行动按钮：修复此前“无内边距的裸按钮”——
 * 尺寸、字体、圆角在此处定型；配色仍走全站统一的主题按钮皮肤。 */
.wallpaper-home-actions :is(.primary-btn, .ghost-btn) {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
  min-height: 42px;
  padding: 10px 24px;
  border-radius: 999px !important;
  font-family: inherit;
  font-size: 14.5px;
  font-weight: 600;
  letter-spacing: 0.03em;
  line-height: 1;
  cursor: pointer;
  text-shadow: none;
}

.wallpaper-home-actions :is(.primary-btn, .ghost-btn) i {
  font-size: 13px;
  transition: transform var(--dur-base, 0.28s) var(--ease-spring, ease);
}

.wallpaper-home-actions :is(.primary-btn, .ghost-btn):hover i {
  transform: scale(1.12) rotate(-6deg);
}

.wallpaper-home-meta {
  gap: 8px;
}

.wallpaper-home-meta span {
  border-radius: 999px;
  border: 1px solid var(--home-chip-border);
  background: var(--home-chip-bg);
  color: var(--home-ink-secondary);
  padding: 7px 11px;
  font-size: 11.5px;
  letter-spacing: 0.03em;
  white-space: nowrap;
  transition: background var(--dur-base, 0.28s) var(--ease-out, ease);
}

.wallpaper-home-meta span::before {
  content: '';
  display: inline-block;
  width: 6px;
  height: 6px;
  margin-right: 7px;
  border-radius: 999px;
  background: rgba(var(--accent-rgb), 0.9);
  box-shadow: 0 0 8px rgba(var(--accent-rgb), 0.6);
  vertical-align: middle;
}

/* 快捷入口：毛玻璃面板 + 图标卡片行。 */
.wallpaper-home-shortcuts {
  position: relative;
  z-index: 1;
  min-width: 228px;
  padding: 14px;
  border-radius: 24px;
  display: grid;
  gap: 6px;
  color: var(--home-ink);
  background: var(--home-glass-bg-soft);
  border: 1px solid var(--home-glass-border);
  box-shadow:
    0 18px 44px rgba(12, 7, 14, 0.32),
    inset 0 1px 0 var(--home-glass-highlight);
  backdrop-filter: var(--home-glass-blur-soft);
  -webkit-backdrop-filter: var(--home-glass-blur-soft);
  transition:
    background var(--dur-slow, 0.42s) var(--ease-out, ease),
    border-color var(--dur-slow, 0.42s) var(--ease-out, ease),
    box-shadow var(--dur-slow, 0.42s) var(--ease-out, ease),
    color var(--dur-slow, 0.42s) var(--ease-out, ease);
}

.shortcuts-kicker {
  margin: 0 0 2px;
  padding: 2px 6px 0;
  font-size: 10.5px;
  font-weight: 700;
  letter-spacing: 0.24em;
  text-transform: uppercase;
  color: var(--home-ink-tertiary);
}

.wallpaper-home-shortcut {
  min-width: 0;
  padding: 9px 10px;
  border: 1px solid transparent;
  border-radius: 16px;
  background: transparent;
  color: inherit;
  display: flex;
  align-items: center;
  gap: 12px;
  text-align: left;
  font: inherit;
  cursor: pointer;
  transition:
    transform var(--dur-base, 0.28s) var(--ease-spring, ease),
    background var(--dur-base, 0.28s) var(--ease-out, ease),
    border-color var(--dur-base, 0.28s) var(--ease-out, ease),
    box-shadow var(--dur-base, 0.28s) var(--ease-out, ease);
}

.shortcut-icon {
  flex: none;
  width: 38px;
  height: 38px;
  display: grid;
  place-items: center;
  border-radius: 13px;
  font-size: 15px;
  color: rgba(var(--accent-readable-rgb, var(--accent-soft-rgb)), 1);
  background: var(--home-tile-bg);
  border: 1px solid rgba(var(--accent-rgb), 0.28);
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.12);
  transition: transform var(--dur-base, 0.28s) var(--ease-spring, ease);
}

.shortcut-text {
  flex: 1;
  min-width: 0;
  display: grid;
  gap: 1px;
}

.shortcut-label {
  font-size: 14px;
  font-weight: 650;
  letter-spacing: 0.03em;
  line-height: 1.2;
}

.shortcut-sub {
  font-size: 11px;
  letter-spacing: 0.06em;
  color: var(--home-ink-tertiary);
  line-height: 1.2;
}

.shortcut-arrow {
  flex: none;
  font-size: 12px;
  opacity: 0;
  transform: translateX(-6px);
  color: rgba(var(--accent-soft-rgb), 0.95);
  transition:
    opacity var(--dur-base, 0.28s) var(--ease-out, ease),
    transform var(--dur-base, 0.28s) var(--ease-spring, ease);
}

.wallpaper-home-shortcut:hover {
  transform: translateY(-2px);
  background: var(--home-hover-bg);
  border-color: rgba(var(--accent-rgb), 0.34);
  box-shadow: 0 10px 22px rgba(8, 6, 12, 0.18);
}

.wallpaper-home-shortcut:hover .shortcut-icon {
  transform: scale(1.08) rotate(-4deg);
}

.wallpaper-home-shortcut:hover .shortcut-arrow {
  opacity: 1;
  transform: translateX(0);
}

/* 氛围光斑：缓慢漂浮，reduce-motion 时静止。 */
.wallpaper-home-orb {
  position: absolute;
  border-radius: 999px;
  pointer-events: none;
  filter: blur(2px);
  animation: home-orb-drift 16s ease-in-out infinite alternate;
}

.orb-a {
  left: 10%;
  bottom: 18%;
  width: 220px;
  height: 220px;
  background: radial-gradient(circle, rgba(255, 199, 223, 0.24), rgba(255, 199, 223, 0));
}

.orb-b {
  right: 12%;
  top: 18%;
  width: 260px;
  height: 260px;
  background: radial-gradient(circle, rgba(255, 205, 190, 0.2), rgba(255, 205, 190, 0));
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

/* ============================================================
 * 日间模式：整组玻璃变量切换为霜白玻璃 + 深暖墨字。
 * ============================================================ */
:root[data-theme-mode='day'] .wallpaper-home-page {
  --home-glass-bg: linear-gradient(160deg, rgba(255, 253, 250, 0.62), rgba(253, 245, 242, 0.46));
  --home-glass-bg-soft: linear-gradient(160deg, rgba(255, 253, 250, 0.56), rgba(253, 245, 242, 0.4));
  --home-glass-border: rgba(255, 255, 255, 0.7);
  --home-glass-highlight: rgba(255, 255, 255, 0.9);
  --home-glass-shadow: 0 22px 48px rgba(150, 104, 100, 0.2);
  --home-glass-blur: blur(22px) saturate(150%) brightness(1.04);
  --home-glass-blur-soft: blur(18px) saturate(145%) brightness(1.04);
  --home-ink: rgba(62, 42, 40, 0.96);
  --home-ink-secondary: rgba(96, 68, 62, 0.9);
  --home-ink-tertiary: rgba(134, 102, 94, 0.76);
  --home-chip-bg: rgba(255, 255, 255, 0.55);
  --home-chip-border: rgba(190, 130, 130, 0.3);
  --home-tile-bg: rgba(var(--accent-rgb), 0.2);
  --home-hover-bg: rgba(255, 255, 255, 0.6);
}

:root[data-theme-mode='day'] .wallpaper-home-dock {
  text-shadow: none;
}

:root[data-theme-mode='day'] .wallpaper-home-kicker {
  color: rgba(var(--accent-readable-rgb, 196, 92, 128), 0.98);
}

:root[data-theme-mode='day'] .whisper-mark {
  color: rgba(var(--accent-readable-rgb, var(--accent-strong-rgb)), 0.95);
}

:root[data-theme-mode='day'] .clock-time {
  color: rgba(var(--accent-readable-rgb, var(--accent-strong-rgb)), 1);
  filter: drop-shadow(0 1px 4px rgba(var(--accent-rgb), 0.18));
}

:root[data-theme-mode='day'] .shortcut-icon {
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.55);
}

:root[data-theme-mode='day'] .wallpaper-home-shortcut:hover {
  box-shadow: 0 10px 22px rgba(150, 104, 100, 0.16);
}

:root[data-theme-mode='day'] .wallpaper-home-orb {
  opacity: 0.55;
}

/* 不支持 backdrop-filter 的环境：退回近实底卡片，保证可读性。 */
@supports not ((backdrop-filter: blur(1px)) or (-webkit-backdrop-filter: blur(1px))) {
  .wallpaper-home-page {
    --home-glass-bg: linear-gradient(150deg, rgba(52, 40, 48, 0.97), rgba(38, 29, 38, 0.96));
    --home-glass-bg-soft: linear-gradient(150deg, rgba(48, 38, 46, 0.96), rgba(36, 28, 37, 0.95));
  }

  :root[data-theme-mode='day'] .wallpaper-home-page {
    --home-glass-bg: linear-gradient(150deg, rgba(255, 251, 247, 0.98), rgba(251, 240, 238, 0.97));
    --home-glass-bg-soft: linear-gradient(150deg, rgba(255, 250, 246, 0.97), rgba(250, 239, 237, 0.96));
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

@media (max-width: 920px) {
  .wallpaper-home-page {
    align-items: stretch;
    flex-direction: column;
    justify-content: flex-end;
  }

  .wallpaper-home-dock,
  .wallpaper-home-shortcuts {
    width: min(100%, 478px);
  }

  .wallpaper-home-shortcuts {
    grid-template-columns: repeat(3, minmax(0, 1fr));
  }

  .shortcuts-kicker {
    grid-column: 1 / -1;
  }

  .wallpaper-home-shortcut {
    flex-direction: column;
    align-items: center;
    gap: 8px;
    padding: 12px 8px;
    text-align: center;
  }

  .shortcut-text {
    justify-items: center;
  }

  .shortcut-arrow {
    display: none;
  }
}

@media (max-width: 640px) {
  .wallpaper-home-page {
    padding-top: 112px;
    padding-bottom: 148px;
  }

  .wallpaper-home-dock {
    border-radius: 24px;
    padding: 20px 18px;
  }

  .wallpaper-home-shortcuts {
    grid-template-columns: repeat(3, minmax(0, 1fr));
  }
}
</style>
