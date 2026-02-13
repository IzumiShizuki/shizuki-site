<template>
  <nav class="fixed-nav-wrapper top-menu-root" :class="{ expanded: menuExpanded }">
    <div class="top-bar liquid-material">
      <div class="nav-section left">
        <div class="left-pill-group liquid-material">
          <div class="menu-item-stack">
            <div class="icon-minimal"><i class="fas fa-home"></i></div>
            <span class="item-label">主页</span>
          </div>
          <div class="menu-item-stack">
            <div class="icon-minimal"><i class="far fa-file-alt"></i></div>
            <span class="item-label">博客</span>
          </div>
          <div class="menu-item-stack">
            <div class="icon-minimal"><i class="fas fa-th-large"></i></div>
            <span class="item-label">轻应用</span>
          </div>
          <div class="menu-item-stack">
            <div class="icon-minimal"><i class="far fa-comment-dots"></i></div>
            <span class="item-label">AI酒馆</span>
          </div>
        </div>
      </div>

      <div class="nav-section center">
        <div class="menu-item-stack">
          <div class="circle-icon-box liquid-material"><i class="fas fa-music"></i></div>
          <span class="item-label">音乐</span>
        </div>

        <div class="menu-item-stack">
          <div class="circle-icon-box liquid-material"><i class="fas fa-sliders-h icon-rotated"></i></div>
          <span class="item-label">白噪音</span>
        </div>

        <div class="menu-item-stack">
          <div class="circle-icon-box liquid-material"><i class="far fa-image"></i></div>
          <span class="item-label">变换图片</span>
        </div>

        <div class="menu-item-stack">
          <div class="circle-icon-box liquid-material"><i class="fas fa-wand-magic-sparkles"></i></div>
          <span class="item-label">特效</span>
        </div>
      </div>

      <div class="nav-section right">
        <div class="menu-item-stack ai-chat-item" @click.stop="toggleAiChat">
          <div class="pill-btn-box liquid-material">
            <i class="fas fa-robot"></i>
            <span>AI Chat</span>
            <span class="ai-chat-dot" :class="{ active: aiChatActive }" aria-hidden="true"></span>
          </div>
          <span class="item-label">唤起AI对话</span>
        </div>

        <div class="menu-item-stack">
          <div class="github-style-box liquid-material">
            <i class="fab fa-github"></i>
          </div>
          <span class="item-label">项目github</span>
        </div>

        <div class="menu-item-stack">
          <div class="avatar-box"></div>
          <span class="item-label">用户登录</span>
        </div>
      </div>
    </div>

    <div class="toggle-tab liquid-material" @click="toggleSwitch">
      <div class="switch-content">
        <span class="bar-line top"></span>
        <div class="menu-label-text">MENU</div>
        <span class="bar-line bottom"></span>
      </div>
    </div>
  </nav>
</template>

<script setup>
import { toRefs } from 'vue';

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

const emit = defineEmits(['toggle-menu', 'toggle-ai-chat']);

function toggleSwitch() {
  emit('toggle-menu');
}

function toggleAiChat() {
  emit('toggle-ai-chat');
}

const { menuExpanded, aiChatActive } = toRefs(props);
</script>

<style scoped>
.top-menu-root {
  --menu-alpha-scale: 0.65;
  --menu-glass-bg: rgba(var(--glass-rgb), calc(var(--glass-bg-alpha) * var(--menu-alpha-scale)));
  --menu-glass-border: rgba(255, 255, 255, calc(var(--glass-border-alpha) * var(--menu-alpha-scale)));
  --menu-glass-shadow: 0 8px 32px rgba(0, 0, 0, calc(var(--glass-shadow-alpha) * var(--menu-alpha-scale)));
  --menu-hover-bg: rgba(208, 218, 238, 0.44);
  --menu-active-bg: rgba(192, 204, 228, 0.52);
  --icon-hover-color: #b79cff;
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
  width: 95%;
  max-width: 1200px;
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

.menu-item-stack:active .icon-minimal,
.menu-item-stack:active .circle-icon-box,
.menu-item-stack:active .github-style-box,
.menu-item-stack:active .avatar-box,
.menu-item-stack.ai-chat-item:active .pill-btn-box {
  animation: press-wobble 280ms ease;
}

.item-label {
  font-size: 11px;
  color: #555;
  font-weight: 500;
  letter-spacing: 0.5px;
  white-space: nowrap;
}

.left-pill-group {
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.4);
  border-radius: 40px;
  min-width: 430px;
  padding: 8px 26px 4px;
  display: flex;
  gap: 34px;
  justify-content: space-between;
  align-items: flex-start;
  height: 70px;
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
  background: rgba(208, 218, 238, 0.32);
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
  background: #35d36a;
  border-color: #35d36a;
  box-shadow: 0 0 0 2px rgba(53, 211, 106, 0.2);
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
  background: #7c8fff;
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
</style>
