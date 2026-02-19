<template>
  <nav ref="menuScope" class="fixed-nav-wrapper top-menu-root motion-managed" :class="{ expanded: menuExpanded }">
    <div class="top-bar liquid-material">
      <div class="nav-section left">
        <div class="left-pill-group liquid-material" :style="{ '--active-index': activeMainRouteIndex }">
          <div
            class="menu-item-stack left-main-btn ripple-trigger"
            :class="{ active: activeMainRoute === 'home' }"
            @click="selectMainRoute('home')"
          >
            <div class="icon-minimal"><i class="fas fa-home"></i></div>
            <span class="item-label">主页</span>
          </div>
          <div
            class="menu-item-stack left-main-btn ripple-trigger"
            :class="{ active: activeMainRoute === 'blog' }"
            @click="selectMainRoute('blog')"
          >
            <div class="icon-minimal"><i class="far fa-file-alt"></i></div>
            <span class="item-label">博客</span>
          </div>
          <div
            class="menu-item-stack left-main-btn ripple-trigger"
            :class="{ active: activeMainRoute === 'music-library' }"
            @click="selectMainRoute('music-library')"
          >
            <div class="icon-minimal"><i class="fas fa-music"></i></div>
            <span class="item-label">音乐库</span>
          </div>
          <div
            class="menu-item-stack left-main-btn ripple-trigger"
            :class="{ active: activeMainRoute === 'apps' }"
            @click="selectMainRoute('apps')"
          >
            <div class="icon-minimal"><i class="fas fa-th-large"></i></div>
            <span class="item-label">轻应用</span>
          </div>
          <div
            class="menu-item-stack left-main-btn ripple-trigger"
            :class="{ active: activeMainRoute === 'ai-tavern' }"
            @click="selectMainRoute('ai-tavern')"
          >
            <div class="icon-minimal"><i class="far fa-comment-dots"></i></div>
            <span class="item-label">AI酒馆</span>
          </div>
        </div>
      </div>

      <div class="nav-section center secondary-nav">
        <div class="menu-item-stack ripple-trigger">
          <div class="circle-icon-box liquid-material"><i class="fas fa-music"></i></div>
          <span class="item-label">音乐</span>
        </div>

        <div class="menu-item-stack ripple-trigger">
          <div class="circle-icon-box liquid-material"><i class="fas fa-sliders-h icon-rotated"></i></div>
          <span class="item-label">白噪音</span>
        </div>

        <div class="menu-item-stack ripple-trigger" @click="openBackgroundPicker">
          <div class="circle-icon-box liquid-material"><i class="far fa-image"></i></div>
          <span class="item-label">变换图片</span>
        </div>

        <div class="menu-item-stack ripple-trigger">
          <div class="circle-icon-box liquid-material"><i class="fas fa-wand-magic-sparkles"></i></div>
          <span class="item-label">特效</span>
        </div>
      </div>

      <div class="nav-section right secondary-nav">
        <div class="menu-item-stack ai-chat-item ripple-trigger" @click.stop="toggleAiChat">
          <div class="pill-btn-box liquid-material">
            <i class="fas fa-robot"></i>
            <span>AI Chat</span>
            <span class="ai-chat-dot" :class="{ active: aiChatActive }" aria-hidden="true"></span>
          </div>
          <span class="item-label">唤起AI对话</span>
        </div>

        <div class="menu-item-stack ripple-trigger">
          <div class="github-style-box liquid-material">
            <i class="fab fa-github"></i>
          </div>
          <span class="item-label">项目github</span>
        </div>

        <div class="menu-item-stack author-info-item ripple-trigger" @click.stop="handleAuthorInfoClick">
          <div class="author-avatar-box"></div>
          <span class="item-label">作者信息</span>
        </div>

        <div class="menu-item-stack ripple-trigger user-profile-item" @click.stop="openProfile">
          <div class="avatar-box"></div>
          <span class="item-label">个人页面</span>
        </div>
      </div>
    </div>

    <div class="toggle-tab liquid-material ripple-trigger" @click="toggleSwitch">
      <div class="switch-content">
        <span class="bar-line top"></span>
        <div class="menu-label-text">MENU</div>
        <span class="bar-line bottom"></span>
      </div>
    </div>
  </nav>
</template>

<script setup>
import { computed, nextTick, onMounted, ref, toRefs, watch } from 'vue';
import { useAnimate, useReducedMotion } from 'motion-v';
import { useRoute } from 'vue-router';

const props = defineProps({
  menuExpanded: {
    type: Boolean,
    default: false
  },
  aiChatActive: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits(['toggle-menu', 'toggle-ai-chat', 'select-main-route', 'author-info-click', 'open-background-picker', 'open-profile']);
const route = useRoute();
const mainRouteOrder = ['home', 'blog', 'music-library', 'apps', 'ai-tavern'];
const [menuScope, animate] = useAnimate();
const prefersReducedMotion = useReducedMotion();
const { menuExpanded, aiChatActive } = toRefs(props);

const activeMainRoute = computed(() => {
  const name = typeof route.name === 'string' ? route.name : 'home';
  return mainRouteOrder.includes(name) ? name : 'home';
});

const activeMainRouteIndex = computed(() => {
  const idx = mainRouteOrder.indexOf(activeMainRoute.value);
  return idx < 0 ? 0 : idx;
});

function toggleSwitch() {
  emit('toggle-menu');
}

function toggleAiChat() {
  emit('toggle-ai-chat');
}

function selectMainRoute(routeKey) {
  emit('select-main-route', routeKey);
}

function handleAuthorInfoClick() {
  emit('author-info-click');
}

function openBackgroundPicker() {
  emit('open-background-picker');
}

function openProfile() {
  emit('open-profile');
}

function getMenuItems() {
  if (!menuScope.value) return [];
  return Array.from(menuScope.value.querySelectorAll('.menu-item-stack'));
}

function applyMenuState(expanded) {
  const items = getMenuItems();
  items.forEach((item) => {
    item.style.opacity = expanded ? '1' : '0';
    item.style.transform = expanded ? 'translateY(0px)' : 'translateY(-20px)';
  });
}

function runMenuAnimation(expanded, immediate = false) {
  const items = getMenuItems();
  if (!items.length) return;

  if (immediate || prefersReducedMotion.value) {
    applyMenuState(expanded);
    return;
  }

  const ordered = expanded ? items : [...items].reverse();
  ordered.forEach((item, index) => {
    animate(
      item,
      expanded
        ? { opacity: [0, 1], y: [-18, 0], scale: [0.96, 1] }
        : { opacity: [1, 0], y: [0, -14], scale: [1, 0.985] },
      {
        duration: expanded ? 0.32 : 0.18,
        delay: index * 0.03,
        ease: expanded ? 'cubic-bezier(0.22, 1, 0.36, 1)' : 'ease-out'
      }
    );
  });
}

watch(
  menuExpanded,
  (expanded) => {
    nextTick(() => runMenuAnimation(expanded));
  },
  { immediate: true }
);

onMounted(() => {
  nextTick(() => runMenuAnimation(menuExpanded.value, true));
});
</script>

<style scoped>
.top-menu-root {
  --menu-alpha-scale: 0.52;
  --menu-glass-bg: rgba(var(--glass-rgb), calc(var(--glass-bg-alpha) * var(--menu-alpha-scale)));
  --menu-glass-border: rgba(255, 255, 255, calc(var(--glass-border-alpha) * var(--menu-alpha-scale)));
  --menu-glass-shadow: 0 8px 32px rgba(0, 0, 0, calc(var(--glass-shadow-alpha) * var(--menu-alpha-scale)));
  --menu-hover-bg: rgba(var(--accent-soft-rgb), 0.44);
  --menu-active-bg: rgba(var(--accent-rgb), 0.22);
  --icon-hover-color: rgb(var(--accent-strong-rgb));
}

.top-menu-root .liquid-material {
  --liquid-bg: var(--menu-glass-bg);
  --liquid-border: var(--menu-glass-border);
  --liquid-shadow: var(--menu-glass-shadow);
}

.fixed-nav-wrapper {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 800;
  display: flex;
  flex-direction: column;
  align-items: center;
  transform: translateY(-90px);
  transition: transform 0.6s cubic-bezier(0.22, 1, 0.36, 1);
}

.fixed-nav-wrapper.expanded {
  transform: translateY(15px);
}

.top-bar {
  width: 98%;
  max-width: 1500px;
  height: 86px;
  border-radius: 20px;
  padding: 0 30px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  z-index: 2;
}

.nav-section {
  display: flex;
  align-items: center;
  gap: 10px;
}

.nav-section.center {
  justify-content: center;
  flex: 1;
  gap: 30px;
}

.nav-section.left {
  gap: 15px;
}

.nav-section.right {
  gap: 20px;
}

.menu-item-stack {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 6px;
  cursor: pointer;
  opacity: 0;
  transform: translateY(-20px);
  transition: all 0.3s ease;
  position: relative;
}

.top-menu-root.motion-managed .menu-item-stack {
  transition: none !important;
}

.menu-item-stack:active .icon-minimal,
.menu-item-stack:active .circle-icon-box,
.menu-item-stack:active .github-style-box,
.menu-item-stack:active .avatar-box,
.menu-item-stack.ai-chat-item:active .pill-btn-box {
  animation: press-wobble 280ms ease;
}

.left-main-btn.active .icon-minimal {
  color: rgb(var(--accent-strong-rgb));
  transform: scale(1.06);
}

.left-main-btn.active .item-label {
  color: rgb(var(--accent-strong-rgb));
  font-weight: 600;
}

.item-label {
  font-size: 11px;
  color: #555;
  font-weight: 500;
  letter-spacing: 0.5px;
  white-space: nowrap;
}

.left-pill-group {
  --left-main-gap: 18px;
  --left-main-item-width: 96px;
  --left-main-padding-x: 20px;
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.4);
  border-radius: 40px;
  min-width: 592px;
  padding: 8px var(--left-main-padding-x) 4px;
  display: flex;
  gap: var(--left-main-gap);
  justify-content: flex-start;
  align-items: flex-start;
  height: 70px;
  position: relative;
}

.left-pill-group::before {
  content: '';
  position: absolute;
  top: 6px;
  bottom: 6px;
  left: var(--left-main-padding-x);
  width: var(--left-main-item-width);
  border-radius: 24px;
  background: rgba(var(--accent-rgb), 0.24);
  box-shadow:
    0 0 0 1px rgba(var(--accent-rgb), 0.42),
    0 8px 16px rgba(var(--accent-rgb), 0.2);
  transform: translateX(calc(var(--active-index, 0) * (var(--left-main-item-width) + var(--left-main-gap))));
  transition: transform 0.35s cubic-bezier(0.22, 1, 0.36, 1);
  pointer-events: none;
  z-index: 0;
}

.left-main-btn {
  width: var(--left-main-item-width);
  z-index: 1;
}

.icon-minimal {
  font-size: 20px;
  color: #333;
  height: 32px;
  width: 32px;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: transform 0.2s, color 0.2s, background-color 0.2s;
  border-radius: 50%;
}

.icon-minimal:hover {
  transform: scale(1.15);
  color: var(--icon-hover-color);
  background: rgba(var(--accent-soft-rgb), 0.36);
}

.circle-icon-box {
  width: 44px;
  height: 44px;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 18px;
  color: #444;
  transition: all 0.3s ease;
}

.circle-icon-box:hover {
  --liquid-bg: var(--menu-hover-bg);
  transform: translateY(-3px);
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.08);
  color: var(--icon-hover-color);
}

.icon-rotated {
  transform: rotate(90deg);
}

.pill-btn-box {
  height: 40px;
  padding: 0 20px;
  border-radius: 30px;
  position: relative;
  display: flex;
  align-items: center;
  gap: 8px;
  font-size: 13px;
  font-weight: 600;
  color: #333;
  transition: all 0.3s;
}

.menu-item-stack:hover .pill-btn-box {
  --liquid-bg: var(--menu-hover-bg);
  transform: translateY(-2px);
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.1);
}

.pill-btn-box:hover i {
  color: var(--icon-hover-color);
}

.ai-chat-dot {
  position: absolute;
  top: 5px;
  right: 7px;
  width: 10px;
  height: 10px;
  border-radius: 50%;
  border: 1.5px solid rgba(255, 255, 255, 0.95);
  background: transparent;
  transition: background-color 0.2s ease, border-color 0.2s ease, box-shadow 0.2s ease;
}

.ai-chat-dot.active {
  background: rgb(var(--accent-strong-rgb));
  border-color: rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 0 2px rgba(var(--accent-rgb), 0.22);
}

.github-style-box {
  width: 44px;
  height: 44px;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 28px;
  color: #2b3137;
  border-radius: 50%;
  transition: transform 0.2s, color 0.2s;
}

.github-style-box:hover {
  --liquid-bg: var(--menu-hover-bg);
  transform: scale(1.1);
  color: var(--icon-hover-color);
}

.author-avatar-box {
  width: 44px;
  height: 44px;
  border-radius: 50%;
  background-image: url('/images/katanegai.jpg');
  background-size: cover;
  background-position: center;
  border: 2px solid rgba(255, 255, 255, 0.86);
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.08);
  transition: transform 0.2s ease, border-color 0.2s ease, box-shadow 0.2s ease;
}

.author-info-item:hover .author-avatar-box {
  transform: scale(1.06);
  border-color: rgba(var(--accent-rgb), 0.78);
  box-shadow: 0 6px 14px rgba(var(--accent-rgb), 0.24);
}

.avatar-box {
  width: 44px;
  height: 44px;
  border-radius: 50%;
  background-image: url('https://picsum.photos/id/64/200/200');
  background-size: cover;
  background-position: center;
  border: 2px solid #fff;
  position: relative;
}

.avatar-box::after {
  content: '';
  position: absolute;
  top: 0;
  right: 0;
  width: 10px;
  height: 10px;
  background: rgb(var(--accent-strong-rgb));
  border: 1px solid #fff;
  border-radius: 50%;
}

.fixed-nav-wrapper.expanded .menu-item-stack {
  opacity: 1;
  transform: translateY(0);
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(1) .menu-item-stack:nth-child(1) {
  transition: all 0.4s 0.05s ease;
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(1) .menu-item-stack:nth-child(2) {
  transition: all 0.4s 0.1s ease;
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(1) .menu-item-stack:nth-child(3) {
  transition: all 0.4s 0.15s ease;
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(1) .menu-item-stack:nth-child(4) {
  transition: all 0.4s 0.2s ease;
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(1) .menu-item-stack:nth-child(5) {
  transition: all 0.4s 0.25s ease;
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(2) .menu-item-stack:nth-child(1) {
  transition: all 0.4s 0.25s cubic-bezier(0.175, 0.885, 0.32, 1.275);
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(2) .menu-item-stack:nth-child(2) {
  transition: all 0.4s 0.3s cubic-bezier(0.175, 0.885, 0.32, 1.275);
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(2) .menu-item-stack:nth-child(3) {
  transition: all 0.4s 0.35s cubic-bezier(0.175, 0.885, 0.32, 1.275);
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(2) .menu-item-stack:nth-child(4) {
  transition: all 0.4s 0.4s cubic-bezier(0.175, 0.885, 0.32, 1.275);
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(3) .menu-item-stack:nth-child(1) {
  transition: all 0.4s 0.45s ease;
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(3) .menu-item-stack:nth-child(2) {
  transition: all 0.4s 0.5s ease;
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(3) .menu-item-stack:nth-child(3) {
  transition: all 0.4s 0.55s ease;
}

.fixed-nav-wrapper.expanded .nav-section:nth-child(3) .menu-item-stack:nth-child(4) {
  transition: all 0.4s 0.6s ease;
}

.toggle-tab {
  width: 140px;
  height: 32px;
  border-bottom-left-radius: 12px;
  border-bottom-right-radius: 12px;
  margin-top: -1px;
  box-shadow: 0 10px 20px rgba(0, 0, 0, 0.05);
  display: flex;
  cursor: pointer;
  justify-content: center;
  align-items: flex-end;
  padding-bottom: 8px;
  transition: all 0.3s;
  z-index: 1001;
}

.toggle-tab:hover {
  --liquid-bg: var(--menu-hover-bg);
  box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
}

.toggle-tab:active {
  --liquid-bg: var(--menu-active-bg);
  animation: press-wobble 280ms ease;
}

.switch-content {
  position: relative;
  width: 60px;
  height: 16px;
  display: flex;
  align-items: center;
  justify-content: center;
}

.bar-line {
  position: absolute;
  background: #3e4452;
  height: 2px;
  width: 24px;
  border-radius: 2px;
  transition: all 0.5s cubic-bezier(0.68, -0.6, 0.32, 1.6);
}

.bar-line.top {
  transform: translateY(-7px);
}

.bar-line.bottom {
  transform: translateY(7px);
}

.menu-label-text {
  font-size: 10px;
  font-weight: 800;
  color: #3e4452;
  letter-spacing: 1px;
  transition: 0.3s;
}

.fixed-nav-wrapper.expanded .bar-line.top {
  transform: translateY(0) rotate(135deg);
  background-color: #555;
  width: 20px;
}

.fixed-nav-wrapper.expanded .bar-line.bottom {
  transform: translateY(0) rotate(-135deg);
  background-color: #555;
  width: 20px;
}

.fixed-nav-wrapper.expanded .menu-label-text {
  transform: scale(0.6);
  opacity: 0;
  filter: blur(2px);
}

@keyframes press-wobble {
  0% {
    transform: translateY(0) scale(1);
  }
  30% {
    transform: translateY(1px) scale(0.94, 1.05);
  }
  65% {
    transform: translateY(-1px) scale(1.04, 0.96);
  }
  100% {
    transform: translateY(0) scale(1);
  }
}

@media (max-width: 900px) {
  .fixed-nav-wrapper {
    transform: translateY(-72px);
  }

  .fixed-nav-wrapper.expanded {
    transform: translateY(8px);
  }

  .top-bar {
    width: calc(100% - 12px);
    height: 72px;
    border-radius: 16px;
    padding: 0 12px;
    gap: 10px;
    overflow-x: auto;
    overflow-y: hidden;
    justify-content: flex-start;
    scrollbar-width: none;
  }

  .top-bar::-webkit-scrollbar {
    display: none;
  }

  .nav-section {
    flex: 0 0 auto;
    gap: 10px;
  }

  .nav-section.center,
  .nav-section.left,
  .nav-section.right {
    flex: 0 0 auto;
    justify-content: flex-start;
    gap: 10px;
  }

  .secondary-nav {
    display: none;
  }

  .left-pill-group {
    min-width: auto;
    width: auto;
    padding: 6px 8px;
    gap: 8px;
    height: auto;
  }

  .left-pill-group::before {
    display: none;
  }

  .left-main-btn {
    width: auto;
    min-width: 56px;
    padding: 0 6px;
  }

  .item-label {
    font-size: 10px;
  }

  .icon-minimal,
  .circle-icon-box,
  .github-style-box,
  .author-avatar-box,
  .avatar-box {
    width: 36px;
    height: 36px;
  }

  .pill-btn-box {
    height: 36px;
    padding: 0 12px;
    font-size: 12px;
  }

  .toggle-tab {
    width: 112px;
    height: 28px;
    padding-bottom: 6px;
  }
}

@media (max-width: 600px), (orientation: portrait) {
  .top-menu-root {
    --drawer-w: 92px;
  }

  .fixed-nav-wrapper {
    top: 0;
    left: 0;
    width: 100%;
    height: 100vh;
    align-items: flex-start;
    transform: none;
    pointer-events: none;
  }

  .top-bar {
    width: var(--drawer-w);
    height: calc(100vh - 28px);
    margin: 14px 0 14px 8px;
    border-radius: 16px;
    padding: 10px 4px;
    gap: 8px;
    display: flex;
    flex-direction: column;
    justify-content: flex-start;
    overflow-y: auto;
    overflow-x: hidden;
    transform: translateX(calc(-100% + 26px));
    transition: transform 360ms cubic-bezier(0.22, 1, 0.36, 1);
    pointer-events: auto;
  }

  .fixed-nav-wrapper.expanded .top-bar {
    transform: translateX(0);
  }

  .nav-section.left {
    width: 100%;
  }

  .nav-section {
    width: 100%;
    display: flex;
    flex-direction: column;
    gap: 8px;
    align-items: center;
    justify-content: flex-start;
  }

  .nav-section.center,
  .nav-section.right {
    display: flex;
    width: 100%;
    gap: 8px;
    flex-direction: column;
    align-items: center;
    justify-content: flex-start;
  }

  .left-pill-group {
    width: 100%;
    min-width: 0;
    padding: 4px;
    height: auto;
    display: flex;
    flex-direction: column;
    gap: 8px;
    align-items: center;
    box-shadow: none;
  }

  .left-pill-group::before {
    display: none;
  }

  .left-main-btn {
    width: 48px;
    height: 48px;
    min-width: 0;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 0;
    gap: 0;
    background: rgba(255, 255, 255, 0.22);
  }

  .menu-item-stack {
    width: 48px;
    min-width: 48px;
    height: 48px;
    min-height: 48px;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    gap: 0;
    background: rgba(255, 255, 255, 0.22);
  }

  .menu-item-stack.active {
    background: rgba(var(--accent-rgb), 0.24);
    box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.42);
  }

  .item-label {
    display: none !important;
  }

  .icon-minimal {
    width: 24px;
    height: 24px;
    font-size: 14px;
  }

  .circle-icon-box,
  .github-style-box,
  .author-avatar-box,
  .avatar-box {
    width: 24px;
    height: 24px;
    font-size: 14px;
  }

  .pill-btn-box {
    height: 24px;
    min-width: 24px;
    padding: 0;
    justify-content: center;
    border-radius: 50%;
  }

  .pill-btn-box span {
    display: none;
  }

  .secondary-nav {
    display: grid;
  }

  .toggle-tab {
    position: fixed;
    left: 8px;
    top: 50%;
    transform: translateY(-50%);
    width: 34px;
    height: 122px;
    border-radius: 12px;
    margin-top: 0;
    padding-bottom: 0;
    align-items: center;
    justify-content: center;
    z-index: 1600;
    pointer-events: auto !important;
    touch-action: manipulation;
  }

  .fixed-nav-wrapper.expanded .toggle-tab {
    left: calc(var(--drawer-w) + 8px);
  }

  .switch-content {
    width: 18px;
    height: 82px;
    writing-mode: vertical-rl;
    transform: rotate(180deg);
  }

  .bar-line {
    width: 2px;
    height: 20px;
  }

  .bar-line.top {
    transform: translateX(-6px);
  }

  .bar-line.bottom {
    transform: translateX(6px);
  }

  .menu-label-text {
    font-size: 9px;
    letter-spacing: 0.8px;
  }

  .fixed-nav-wrapper.expanded .bar-line.top {
    transform: translateX(0) rotate(135deg);
    height: 18px;
    width: 2px;
  }

  .fixed-nav-wrapper.expanded .bar-line.bottom {
    transform: translateX(0) rotate(-135deg);
    height: 18px;
    width: 2px;
  }
}
</style>
