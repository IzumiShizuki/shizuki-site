<template>
  <section class="entry-shell-page" aria-label="Entry Shell">
    <div class="entry-shell-orbit orbit-a" aria-hidden="true"></div>
    <div class="entry-shell-orbit orbit-b" aria-hidden="true"></div>
    <div class="entry-shell-orbit orbit-c" aria-hidden="true"></div>

    <article class="entry-shell-card liquid-material">
      <p class="entry-shell-sign">Shizuki Site</p>
      <h1>入口壳</h1>
      <p class="entry-shell-copy">
        保留原本的背景、音乐与小工具氛围。
        <span>点击下面的入口卡，再进入正式首页。</span>
      </p>

      <div class="entry-shell-actions">
        <button class="primary-btn ripple-trigger" type="button" @click="enterAuthorHome">进入首页</button>
        <button class="ghost-btn ripple-trigger" type="button" @click="openPath('/blog')">博客</button>
      </div>

      <div class="entry-shell-meta">
        <span>Background Ready</span>
        <span>Music Always On</span>
        <span>Tools Nearby</span>
      </div>
    </article>

    <div class="entry-shell-toolbelt liquid-material">
      <button v-for="item in quickTools" :key="item.path" class="entry-tool-chip ripple-trigger" type="button" @click="openPath(item.path)">
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

function enterAuthorHome() {
  router.push('/author');
}

function openPath(path) {
  router.push(path);
}
</script>

<style scoped>
.entry-shell-page {
  position: relative;
  min-height: 100%;
  padding: clamp(116px, 18vh, 164px) clamp(18px, 5vw, 54px) clamp(132px, 22vh, 184px);
  display: grid;
  place-items: center;
  overflow: hidden;
}

.entry-shell-card {
  --liquid-bg: linear-gradient(145deg, rgba(255, 243, 252, 0.26), rgba(224, 230, 255, 0.16));
  --liquid-border: rgba(255, 255, 255, 0.42);
  --liquid-shadow: 0 30px 70px rgba(17, 18, 36, 0.2);
  position: relative;
  z-index: 1;
  width: min(100%, 580px);
  padding: clamp(28px, 5vw, 42px);
  border-radius: 30px;
  display: grid;
  gap: 18px;
  text-align: center;
}

.entry-shell-sign {
  color: rgba(246, 235, 255, 0.92);
  font-size: 12px;
  letter-spacing: 0.32em;
  text-transform: uppercase;
}

.entry-shell-card h1 {
  margin: 0;
  font-size: clamp(38px, 6vw, 62px);
  line-height: 1.04;
  color: rgba(255, 248, 252, 0.98);
}

.entry-shell-copy {
  display: grid;
  gap: 8px;
  color: rgba(237, 239, 252, 0.9);
  font-size: clamp(14px, 2vw, 17px);
  line-height: 1.8;
}

.entry-shell-copy span {
  color: rgba(255, 220, 236, 0.94);
}

.entry-shell-actions {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 12px;
  flex-wrap: wrap;
}

.entry-shell-meta {
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
  flex-wrap: wrap;
}

.entry-shell-meta span,
.entry-tool-chip {
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.26);
  background: rgba(255, 255, 255, 0.08);
  color: rgba(243, 240, 255, 0.88);
}

.entry-shell-meta span {
  padding: 7px 12px;
  font-size: 12px;
  letter-spacing: 0.04em;
}

.entry-shell-toolbelt {
  --liquid-bg: rgba(16, 18, 34, 0.24);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 16px 36px rgba(8, 10, 24, 0.18);
  position: absolute;
  right: clamp(18px, 4vw, 42px);
  bottom: clamp(96px, 18vh, 146px);
  z-index: 1;
  padding: 12px;
  border-radius: 22px;
  display: grid;
  gap: 10px;
}

.entry-tool-chip {
  min-width: 132px;
  padding: 11px 14px;
  display: inline-flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
  font: inherit;
  cursor: pointer;
}

.entry-tool-chip i {
  font-size: 14px;
}

.entry-shell-orbit {
  position: absolute;
  border-radius: 999px;
  filter: blur(1px);
  pointer-events: none;
}

.orbit-a {
  inset: 12% auto auto 9%;
  width: 180px;
  height: 180px;
  background: radial-gradient(circle, rgba(255, 208, 230, 0.24), rgba(255, 208, 230, 0));
  animation: entry-drift-a 12s ease-in-out infinite;
}

.orbit-b {
  inset: auto 12% 18% auto;
  width: 220px;
  height: 220px;
  background: radial-gradient(circle, rgba(194, 210, 255, 0.2), rgba(194, 210, 255, 0));
  animation: entry-drift-b 15s ease-in-out infinite;
}

.orbit-c {
  inset: auto auto 14% 16%;
  width: 128px;
  height: 128px;
  background: radial-gradient(circle, rgba(255, 243, 189, 0.16), rgba(255, 243, 189, 0));
  animation: entry-drift-c 10s ease-in-out infinite;
}

@keyframes entry-drift-a {
  0%,
  100% {
    transform: translate3d(0, 0, 0);
  }
  50% {
    transform: translate3d(18px, -14px, 0);
  }
}

@keyframes entry-drift-b {
  0%,
  100% {
    transform: translate3d(0, 0, 0);
  }
  50% {
    transform: translate3d(-16px, 18px, 0);
  }
}

@keyframes entry-drift-c {
  0%,
  100% {
    transform: translate3d(0, 0, 0);
  }
  50% {
    transform: translate3d(12px, -12px, 0);
  }
}

@media (prefers-reduced-motion: reduce) {
  .entry-shell-orbit {
    animation: none;
  }
}

@media (max-width: 920px) {
  .entry-shell-toolbelt {
    position: static;
    width: min(100%, 420px);
    margin-top: 18px;
    grid-template-columns: repeat(3, minmax(0, 1fr));
  }

  .entry-tool-chip {
    min-width: 0;
    justify-content: center;
  }
}

@media (max-width: 640px) {
  .entry-shell-page {
    padding-top: 110px;
    padding-bottom: 144px;
  }

  .entry-shell-card {
    border-radius: 24px;
    padding: 22px 18px;
  }

  .entry-shell-toolbelt {
    grid-template-columns: 1fr;
  }
}
</style>
