<template>
  <section class="wallpaper-home-page" aria-label="Wallpaper Home">
    <div class="wallpaper-home-orb orb-a" aria-hidden="true"></div>
    <div class="wallpaper-home-orb orb-b" aria-hidden="true"></div>

    <article class="wallpaper-home-dock liquid-material">
      <p class="wallpaper-home-kicker">{{ greeting.en }}</p>
      <h1>{{ greeting.zh }}</h1>
      <p class="wallpaper-home-copy">
        这里是壁纸主界面，背景、音乐和悬浮工具会一直陪着你。
        <span>{{ greeting.note }}</span>
      </p>

      <div class="wallpaper-home-actions">
        <button class="primary-btn ripple-trigger" type="button" @click="openAuthorIntro">网站介绍</button>
        <button class="ghost-btn ripple-trigger" type="button" @click="openPath('/blog')">博客</button>
      </div>

      <div class="wallpaper-home-meta">
        <span>Wallpaper Focus</span>
        <span>Music Nearby</span>
        <span>Quick Tools Ready</span>
      </div>
    </article>

    <div class="wallpaper-home-shortcuts liquid-material">
      <button
        v-for="item in quickTools"
        :key="item.path"
        class="wallpaper-home-shortcut ripple-trigger"
        type="button"
        @click="openPath(item.path)"
      >
        <i :class="item.icon" aria-hidden="true"></i>
        <span>{{ item.label }}</span>
      </button>
    </div>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import { useRouter } from 'vue-router';

const router = useRouter();

const quickTools = [
  { path: '/music-library/music', label: 'Music', icon: 'fas fa-compact-disc' },
  { path: '/apps', label: 'Apps', icon: 'fas fa-grip' },
  { path: '/ai-hub', label: 'AI', icon: 'fas fa-brain' }
];

/* 时段问候：随打开时间变化的一点温度 */
const greeting = computed(() => {
  const h = new Date().getHours();
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
}

.wallpaper-home-dock {
  --liquid-bg: linear-gradient(145deg, rgba(20, 24, 40, 0.62), rgba(44, 29, 55, 0.4));
  --liquid-border: rgba(255, 255, 255, 0.26);
  --liquid-shadow: 0 28px 60px rgba(8, 10, 24, 0.34);
  position: relative;
  z-index: 1;
  width: min(100%, 460px);
  padding: clamp(24px, 4vw, 34px);
  border-radius: 30px;
  display: grid;
  gap: 16px;
  color: rgba(248, 249, 255, 0.98);
  text-shadow: 0 4px 16px rgba(7, 8, 15, 0.36);
  backdrop-filter: blur(22px) saturate(132%);
}

.wallpaper-home-kicker {
  margin: 0;
  color: rgba(255, 220, 231, 0.92);
  font-size: 12px;
  font-weight: 700;
  letter-spacing: 0.28em;
  text-transform: uppercase;
}

.wallpaper-home-dock h1 {
  margin: 0;
  font-size: clamp(34px, 6vw, 58px);
  line-height: 0.98;
}

.wallpaper-home-copy {
  margin: 0;
  display: grid;
  gap: 8px;
  color: rgba(241, 243, 252, 0.94);
  font-size: clamp(14px, 2vw, 17px);
  line-height: 1.75;
}

.wallpaper-home-copy span {
  color: rgba(255, 214, 229, 0.96);
}

.wallpaper-home-actions,
.wallpaper-home-meta {
  display: flex;
  align-items: center;
  gap: 12px;
  flex-wrap: wrap;
}

.wallpaper-home-meta span,
.wallpaper-home-shortcut {
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(255, 255, 255, 0.1);
  color: rgba(245, 247, 255, 0.94);
}

.wallpaper-home-meta span {
  padding: 8px 13px;
  font-size: 12px;
  letter-spacing: 0.04em;
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

.wallpaper-home-shortcuts {
  --liquid-bg: linear-gradient(145deg, rgba(12, 16, 32, 0.46), rgba(44, 38, 90, 0.28));
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 20px 44px rgba(8, 10, 24, 0.26);
  position: relative;
  z-index: 1;
  min-width: 196px;
  padding: 12px;
  border-radius: 22px;
  display: grid;
  gap: 10px;
  backdrop-filter: blur(18px) saturate(136%);
}

.wallpaper-home-shortcut {
  min-width: 0;
  padding: 12px 14px;
  display: inline-flex;
  align-items: center;
  justify-content: space-between;
  gap: 14px;
  font: inherit;
  cursor: pointer;
  transition:
    transform var(--dur-base, 0.28s) var(--ease-spring, ease),
    background var(--dur-base, 0.28s) var(--ease-out, ease),
    border-color var(--dur-base, 0.28s) var(--ease-out, ease),
    box-shadow var(--dur-base, 0.28s) var(--ease-out, ease);
}

.wallpaper-home-shortcut:hover {
  transform: translateY(-2px);
  background: rgba(var(--accent-rgb), 0.24);
  border-color: rgba(var(--accent-strong-rgb), 0.6);
  box-shadow:
    0 12px 24px rgba(8, 10, 20, 0.24),
    0 0 18px rgba(var(--accent-rgb), 0.22);
}

.wallpaper-home-shortcut:hover i {
  transform: scale(1.12);
}

.wallpaper-home-shortcut i {
  font-size: 14px;
  transition: transform var(--dur-base, 0.28s) var(--ease-spring, ease);
}

.wallpaper-home-orb {
  position: absolute;
  border-radius: 999px;
  pointer-events: none;
  filter: blur(2px);
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
}

@media (max-width: 920px) {
  .wallpaper-home-page {
    align-items: stretch;
    flex-direction: column;
    justify-content: flex-end;
  }

  .wallpaper-home-dock,
  .wallpaper-home-shortcuts {
    width: min(100%, 460px);
  }

  .wallpaper-home-shortcuts {
    grid-template-columns: repeat(3, minmax(0, 1fr));
  }

  .wallpaper-home-shortcut {
    justify-content: center;
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
    grid-template-columns: 1fr;
  }
}
</style>
