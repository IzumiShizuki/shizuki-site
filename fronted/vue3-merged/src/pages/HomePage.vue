<template>
  <section class="wallpaper-home-page" aria-label="Wallpaper Home">
    <div class="wallpaper-home-orb orb-a" aria-hidden="true"></div>
    <div class="wallpaper-home-orb orb-b" aria-hidden="true"></div>

    <article class="wallpaper-home-dock liquid-material">
      <p class="wallpaper-home-kicker">Wallpaper Home</p>
      <h1>Home</h1>
      <p class="wallpaper-home-copy">
        这里是壁纸主界面，背景、音乐和悬浮工具会保持常驻。
        <span>网站介绍已经独立到右侧的 Site 入口，不再占用 Home 主视图。</span>
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
import { useRouter } from 'vue-router';

const router = useRouter();

const quickTools = [
  { path: '/music-library/music', label: 'Music', icon: 'fas fa-compact-disc' },
  { path: '/apps', label: 'Apps', icon: 'fas fa-grip' },
  { path: '/ai-hub', label: 'AI', icon: 'fas fa-brain' }
];

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
}

.wallpaper-home-shortcut i {
  font-size: 14px;
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
  background: radial-gradient(circle, rgba(171, 201, 255, 0.18), rgba(171, 201, 255, 0));
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
