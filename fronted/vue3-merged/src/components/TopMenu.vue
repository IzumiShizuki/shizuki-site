<template>
  <nav class="fixed-nav-wrapper top-menu-root motion-managed" :class="{ expanded: menuExpanded }">
    <div class="top-bar liquid-material">
      <div class="nav-section left">
        <div
          class="left-pill-group liquid-material"
          :class="{ 'no-main-active': !hasMainRouteActive }"
          :style="{ '--active-index': activeMainRouteIndex, '--left-main-count': mainNavItems.length }"
        >
          <div
            v-for="item in mainNavItems"
            :key="item.key"
            class="menu-item-stack left-main-btn ripple-trigger"
            :class="{ active: activeMainRoute === item.key }"
            @click="selectMainRoute(item.key)"
          >
            <div class="icon-minimal"><i :class="item.icon"></i></div>
            <span class="item-label">{{ item.label }}</span>
          </div>
        </div>
      </div>

      <div class="nav-section center secondary-nav">
        <div class="menu-item-stack ripple-trigger" :class="{ active: menuHubActive }" @click="openAtmosphere">
          <div class="circle-icon-box liquid-material menu-hub-box">
            <i class="fas fa-compass-drafting"></i>
            <span class="menu-status-stack" aria-hidden="true">
              <span class="menu-status-dot" :class="{ active: musicActive }"></span>
              <span class="menu-status-dot" :class="{ active: ambientActive }"></span>
              <span class="menu-status-dot" :class="{ active: effectActive }"></span>
            </span>
          </div>
          <span class="item-label">MENU</span>
        </div>

        <div
          class="menu-item-stack ripple-trigger theme-toggle-item"
          role="button"
          :aria-label="themeToggleActionLabel"
          @click="toggleThemeMode"
        >
          <div class="circle-icon-box liquid-material theme-toggle-box" :class="themeModeNormalized">
            <i :class="themeModeIcon"></i>
          </div>
          <span class="item-label">{{ themeModeLabel }}</span>
        </div>

        <div class="menu-item-stack ripple-trigger" @click="openBackgroundPicker">
          <div class="circle-icon-box liquid-material"><i class="far fa-image"></i></div>
          <span class="item-label">变换图片</span>
        </div>
      </div>

      <div class="nav-section right secondary-nav">
        <div
          class="menu-item-stack ai-chat-item ripple-trigger"
          :class="{ disabled: aiChatDisabled }"
          @click.stop="toggleAiChat"
        >
          <div class="pill-btn-box liquid-material">
            <i class="fas fa-robot"></i>
            <span>AI Chat</span>
            <span class="ai-chat-dot" :class="{ active: aiChatActive }" aria-hidden="true"></span>
          </div>
          <span class="item-label">{{ aiChatDisabled ? 'AI Hub 内已禁用' : '唤起AI对话' }}</span>
        </div>

        <div class="menu-item-stack ripple-trigger" @click="openProjectGithub">
          <div class="github-style-box liquid-material">
            <i class="fab fa-github"></i>
          </div>
          <span class="item-label">项目github</span>
        </div>

        <div
          class="menu-item-stack author-info-item ripple-trigger"
          :class="{ 'route-active': isAuthorRoute }"
          @click.stop="openAuthorOverview"
        >
          <div class="author-avatar-box">
            <img class="author-avatar-image" :src="resolvedAuthorAvatarUrl" alt="author-avatar" @error="onAuthorAvatarError" />
          </div>
          <span class="item-label">关于网站</span>
        </div>

        <div
          v-if="!isAuthenticated"
          class="menu-item-stack ripple-trigger user-profile-item login-entry"
          :class="{ 'route-active': isAuthRoute }"
          @click.stop="openAuth"
        >
          <div class="avatar-box anonymous">
            <i class="fas fa-user"></i>
          </div>
          <span class="item-label">用户登录</span>
        </div>

        <div
          v-else
          class="menu-item-stack ripple-trigger user-profile-item"
          :class="{ 'route-active': isProfileRoute }"
          @click.stop="openProfileHome"
        >
          <div class="avatar-box">
            <img class="avatar-image" :src="resolvedAvatarUrl" alt="user-avatar" @error="onAvatarError" />
          </div>
          <span class="item-label">{{ displayName || '个人页面' }}</span>
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
import { computed, ref, toRefs, watch } from 'vue';
import { useRoute } from 'vue-router';

const props = defineProps({
  menuExpanded: {
    type: Boolean,
    default: false
  },
  themeMode: {
    type: String,
    default: 'night'
  },
  aiChatActive: {
    type: Boolean,
    default: false
  },
  aiChatDisabled: {
    type: Boolean,
    default: false
  },
  isAuthenticated: {
    type: Boolean,
    default: false
  },
  isAdmin: {
    type: Boolean,
    default: false
  },
  displayName: {
    type: String,
    default: ''
  },
  avatarUrl: {
    type: String,
    default: ''
  },
  authorAvatarUrl: {
    type: String,
    default: ''
  },
  musicActive: {
    type: Boolean,
    default: false
  },
  ambientActive: {
    type: Boolean,
    default: false
  },
  effectActive: {
    type: Boolean,
    default: false
  }
});

const emit = defineEmits([
  'toggle-menu',
  'toggle-theme-mode',
  'toggle-ai-chat',
  'select-main-route',
  'open-atmosphere-panel',
  'open-background-picker',
  'open-profile',
  'open-admin',
  'open-author',
  'open-auth'
]);
const PROJECT_GITHUB_URL = 'https://github.com/IzumiShizuki/shizuki-site';
const route = useRoute();
const { menuExpanded, themeMode, aiChatActive, aiChatDisabled, isAuthenticated, displayName, avatarUrl, authorAvatarUrl, musicActive, ambientActive, effectActive } = toRefs(props);
const avatarLoadFailed = ref(false);
const authorAvatarLoadFailed = ref(false);
const menuHubActive = computed(() => musicActive.value || ambientActive.value || effectActive.value);
const themeModeNormalized = computed(() => (String(themeMode.value || '').trim().toLowerCase() === 'day' ? 'day' : 'night'));
const themeModeLabel = computed(() => (themeModeNormalized.value === 'day' ? '白天模式' : '夜间模式'));
const themeModeIcon = computed(() => (themeModeNormalized.value === 'day' ? 'fas fa-sun' : 'fas fa-moon'));
const themeToggleActionLabel = computed(() => (themeModeNormalized.value === 'day' ? '切换到夜间模式' : '切换到白天模式'));

const mainNavItems = computed(() => {
  return [
    { key: 'home', label: '主页', icon: 'fas fa-home' },
    { key: 'blog', label: '博客', icon: 'far fa-file-alt' },
    { key: 'music-library', label: '音乐库', icon: 'fas fa-music' },
    { key: 'apps', label: '轻应用', icon: 'fas fa-th-large' },
    { key: 'ai-hub', label: 'AI Hub', icon: 'fas fa-brain' }
  ];
});

const activeMainRoute = computed(() => {
  const name = typeof route.name === 'string' ? route.name : '';
  if (name.startsWith('blog')) {
    return 'blog';
  }
  if (name.startsWith('music-library')) {
    return 'music-library';
  }
  const keys = mainNavItems.value.map((item) => item.key);
  return keys.includes(name) ? name : '';
});

const hasMainRouteActive = computed(() => activeMainRoute.value !== '');

const isProfileRoute = computed(() => {
  const name = typeof route.name === 'string' ? route.name : '';
  return name === 'profile' || name === 'admin';
});

const isAuthorRoute = computed(() => {
  const name = typeof route.name === 'string' ? route.name : '';
  return name === 'author';
});

const isAuthRoute = computed(() => {
  const name = typeof route.name === 'string' ? route.name : '';
  return name === 'auth' || name === 'auth-callback';
});

const activeMainRouteIndex = computed(() => {
  if (!hasMainRouteActive.value) return 0;
  const idx = mainNavItems.value.findIndex((item) => item.key === activeMainRoute.value);
  return idx < 0 ? 0 : idx;
});

const resolvedAvatarUrl = computed(() => {
  const source = String(avatarUrl.value || '').trim();
  if (!source || avatarLoadFailed.value) {
    return '/images/katanegai.jpg';
  }
  return source;
});

const resolvedAuthorAvatarUrl = computed(() => {
  const source = String(authorAvatarUrl.value || '').trim();
  if (!source || authorAvatarLoadFailed.value) {
    return '/images/katanegai.jpg';
  }
  return source;
});

function toggleSwitch() {
  emit('toggle-menu');
}

function toggleThemeMode() {
  emit('toggle-theme-mode');
}

function onAvatarError() {
  avatarLoadFailed.value = true;
}

function onAuthorAvatarError() {
  authorAvatarLoadFailed.value = true;
}

function toggleAiChat() {
  if (aiChatDisabled.value) {
    return;
  }
  emit('toggle-ai-chat');
}

function selectMainRoute(routeKey) {
  emit('select-main-route', routeKey);
}

function openBackgroundPicker() {
  emit('open-background-picker');
}

function openAtmosphere() {
  emit('open-atmosphere-panel');
}

function openProjectGithub() {
  if (typeof window === 'undefined') return;
  window.open(PROJECT_GITHUB_URL, '_blank', 'noopener,noreferrer');
}

function openAuthorOverview() {
  emit('open-author', 'overview');
}

function openProfileHome() {
  if (!isAuthenticated.value) {
    openAuth();
    return;
  }
  emit('open-profile');
}

function openAuth() {
  emit('open-auth');
}

watch(
  () => avatarUrl.value,
  () => {
    avatarLoadFailed.value = false;
  }
);

watch(
  () => authorAvatarUrl.value,
  () => {
    authorAvatarLoadFailed.value = false;
  }
);
</script>

<style scoped>
.top-menu-root {
  --menu-alpha-scale: 0.52;
  --menu-glass-bg: rgba(var(--glass-rgb), calc(var(--glass-bg-alpha) * var(--menu-alpha-scale)));
  --menu-glass-border: rgba(255, 255, 255, calc(var(--glass-border-alpha) * var(--menu-alpha-scale)));
  --menu-glass-shadow: 0 8px 32px rgba(0, 0, 0, calc(var(--glass-shadow-alpha) * var(--menu-alpha-scale)));
  --menu-hover-bg: var(--accent-mode-fill, rgba(var(--accent-rgb), 0.24));
  --menu-active-bg: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.3));
  --menu-active-border: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  --menu-active-shadow: var(--accent-mode-shadow, 0 10px 22px rgba(var(--accent-rgb), 0.24));
  --icon-hover-color: rgb(var(--accent-strong-rgb));
  -webkit-font-smoothing: antialiased;
  text-rendering: geometricPrecision;
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
  opacity: 1;
  transform: translateY(0);
  transition: all 0.3s ease;
  position: relative;
}

.top-menu-root.motion-managed .menu-item-stack {
  transition: none !important;
}

.menu-item-stack:active .icon-minimal,
.menu-item-stack:active .circle-icon-box,
.menu-item-stack:active .github-style-box,
.menu-item-stack:active .author-avatar-box,
.menu-item-stack:active .avatar-box,
.menu-item-stack.ai-chat-item:active .pill-btn-box {
  animation: press-wobble 280ms ease;
}

.left-main-btn.active .icon-minimal {
  color: rgb(var(--accent-strong-rgb));
  transform: scale(1.06);
  text-shadow: var(--theme-contrast-icon-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.6));
}

.left-main-btn.active .item-label {
  color: rgb(var(--accent-strong-rgb));
  font-weight: 600;
  text-shadow: var(--theme-contrast-text-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.54));
}

.item-label {
  font-size: 11px;
  color: var(--theme-menu-text-muted, rgba(235, 241, 255, 0.9));
  font-weight: 560;
  letter-spacing: 0.28px;
  line-height: 1.15;
  white-space: nowrap;
  text-shadow: var(--theme-contrast-text-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.54));
  -webkit-text-stroke: var(--theme-contrast-outline-width, 0.18px) var(--theme-contrast-stroke-soft, rgba(5, 8, 14, 0.28));
}

.left-pill-group {
  --left-main-gap: 18px;
  --left-main-item-width: 96px;
  --left-main-padding-x: 20px;
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.4);
  border-radius: 40px;
  min-width: calc(
    (var(--left-main-item-width) * var(--left-main-count, 5)) +
      (var(--left-main-gap) * (var(--left-main-count, 5) - 1)) +
      (var(--left-main-padding-x) * 2)
  );
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
  background: var(--menu-active-bg);
  box-shadow:
    0 0 0 1px var(--menu-active-border),
    var(--menu-active-shadow);
  transform: translateX(calc(var(--active-index, 0) * (var(--left-main-item-width) + var(--left-main-gap))));
  transition: transform 0.35s cubic-bezier(0.22, 1, 0.36, 1);
  pointer-events: none;
  z-index: 0;
}

.left-pill-group.no-main-active::before {
  opacity: 0;
}

.left-main-btn {
  width: var(--left-main-item-width);
  z-index: 1;
}

.icon-minimal {
  font-size: 20px;
  color: var(--theme-menu-text, rgba(236, 242, 255, 0.92));
  height: 32px;
  width: 32px;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: transform 0.2s, color 0.2s, background-color 0.2s;
  border-radius: 50%;
  text-shadow: var(--theme-contrast-icon-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.6));
  -webkit-text-stroke: var(--theme-contrast-outline-width-strong, 0.24px) var(--theme-contrast-stroke-soft, rgba(5, 8, 14, 0.28));
}

.icon-minimal:hover {
  transform: scale(1.15);
  color: var(--icon-hover-color);
  background: var(--menu-hover-bg);
}

.circle-icon-box {
  width: 44px;
  height: 44px;
  border-radius: 50%;
  position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 18px;
  color: var(--theme-menu-text, rgba(236, 242, 255, 0.92));
  transition: all 0.3s ease;
  text-shadow: var(--theme-contrast-icon-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.6));
  -webkit-text-stroke: var(--theme-contrast-outline-width-strong, 0.24px) var(--theme-contrast-stroke-soft, rgba(5, 8, 14, 0.28));
}

.circle-icon-box:hover {
  --liquid-bg: var(--menu-hover-bg);
  transform: translateY(-3px);
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.08);
  color: var(--icon-hover-color);
}

.menu-item-stack.active .circle-icon-box {
  --liquid-bg: var(--menu-active-bg);
  color: rgb(var(--accent-strong-rgb));
  box-shadow:
    0 0 0 1px var(--menu-active-border),
    var(--menu-active-shadow);
}

.menu-item-stack.active .item-label {
  color: rgb(var(--accent-strong-rgb));
  font-weight: 600;
}

.menu-hub-box {
  overflow: visible;
}

.menu-status-stack {
  position: absolute;
  bottom: 4px;
  left: 50%;
  transform: translateX(-50%);
  display: inline-flex;
  gap: 4px;
  pointer-events: none;
}

.menu-status-dot {
  width: 5px;
  height: 5px;
  border-radius: 50%;
  background: color-mix(in srgb, var(--theme-menu-text-muted, rgba(235, 241, 255, 0.9)) 46%, transparent);
  box-shadow: 0 0 0 1px color-mix(in srgb, var(--theme-contrast-stroke-soft, rgba(5, 8, 14, 0.54)) 36%, transparent);
  transition: transform 0.18s ease, background-color 0.18s ease, box-shadow 0.18s ease;
}

.menu-status-dot.active {
  background: rgb(var(--accent-strong-rgb));
  box-shadow:
    0 0 0 1px rgba(255, 255, 255, 0.92),
    0 0 10px rgba(var(--accent-rgb), 0.36);
  transform: scale(1.15);
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
  color: var(--theme-menu-text, rgba(236, 242, 255, 0.92));
  transition: all 0.3s;
  letter-spacing: 0.01em;
  text-shadow: var(--theme-contrast-text-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.54));
  -webkit-text-stroke: var(--theme-contrast-outline-width, 0.18px) var(--theme-contrast-stroke-soft, rgba(5, 8, 14, 0.28));
}

.menu-item-stack:hover .pill-btn-box {
  --liquid-bg: var(--menu-hover-bg);
  transform: translateY(-2px);
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.1);
}

.pill-btn-box:hover i {
  color: var(--icon-hover-color);
}

.ai-chat-item.disabled {
  cursor: not-allowed;
  opacity: 0.68;
}

.ai-chat-item.disabled .pill-btn-box {
  --liquid-bg: rgba(255, 255, 255, 0.05);
  color: var(--theme-menu-text-disabled, rgba(210, 220, 238, 0.72));
}

.ai-chat-item.disabled:hover .pill-btn-box,
.ai-chat-item.disabled .pill-btn-box:hover {
  --liquid-bg: rgba(255, 255, 255, 0.05);
  transform: none;
  box-shadow: none;
}

.ai-chat-item.disabled .item-label {
  color: var(--theme-menu-text-disabled, rgba(210, 220, 238, 0.72));
}

.ai-chat-item.disabled .ai-chat-dot {
  opacity: 0.72;
}

.ai-chat-dot {
  position: absolute;
  top: 5px;
  right: 7px;
  width: 10px;
  height: 10px;
  border-radius: 50%;
  border: 1.5px solid var(--theme-menu-avatar-border, rgba(255, 255, 255, 0.86));
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
  color: var(--theme-menu-text, rgba(236, 242, 255, 0.92));
  border-radius: 50%;
  transition: transform 0.2s, color 0.2s;
  text-shadow: var(--theme-contrast-icon-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.6));
  -webkit-text-stroke: var(--theme-contrast-outline-width-strong, 0.24px) var(--theme-contrast-stroke-soft, rgba(5, 8, 14, 0.28));
}

.author-info-item,
.user-profile-item {
  border-radius: 12px;
  padding: 2px 6px 4px;
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
  overflow: hidden;
  background: rgba(10, 16, 25, 0.64);
  border: 2px solid var(--theme-menu-avatar-border, rgba(255, 255, 255, 0.86));
  box-shadow: 0 4px 10px rgba(0, 0, 0, 0.08);
  transition: transform 0.2s ease, border-color 0.2s ease, box-shadow 0.2s ease;
}

.author-avatar-image {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.author-info-item:hover .author-avatar-box {
  transform: scale(1.06);
  border-color: var(--menu-active-border);
  box-shadow: var(--menu-active-shadow);
}

.author-info-item.route-active .author-avatar-box {
  transform: scale(1.06);
  border-color: var(--menu-active-border);
  box-shadow:
    0 0 0 1px var(--menu-active-border),
    var(--menu-active-shadow);
}

.avatar-box {
  width: 44px;
  height: 44px;
  border-radius: 50%;
  border: 2px solid var(--theme-menu-avatar-border, rgba(255, 255, 255, 0.86));
  position: relative;
  overflow: hidden;
  background: rgba(10, 16, 25, 0.64);
}

.avatar-image {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.avatar-box.anonymous {
  display: flex;
  align-items: center;
  justify-content: center;
  filter: saturate(0.72);
  border-color: var(--theme-menu-avatar-border, rgba(255, 255, 255, 0.86));
  color: var(--theme-menu-text-muted, rgba(235, 241, 255, 0.9));
  font-size: 16px;
}

.avatar-box.anonymous::after {
  display: none;
}

.avatar-box::after {
  content: '';
  position: absolute;
  top: 0;
  right: 0;
  width: 10px;
  height: 10px;
  background: rgb(var(--accent-strong-rgb));
  border: 1px solid var(--theme-menu-avatar-border, rgba(255, 255, 255, 0.86));
  border-radius: 50%;
}

.user-profile-item.route-active .avatar-box {
  box-shadow:
    0 0 0 1px var(--menu-active-border),
    var(--menu-active-shadow);
  border-color: var(--menu-active-border);
}

.author-info-item.route-active,
.user-profile-item.route-active {
  background: var(--menu-active-bg);
  box-shadow: inset 0 0 0 1px var(--menu-active-border);
}

.author-info-item.route-active .item-label,
.user-profile-item.route-active .item-label {
  color: rgb(var(--accent-strong-rgb));
  font-weight: 600;
  text-shadow:
    var(--theme-contrast-text-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.54)),
    0 0 1px rgba(var(--accent-rgb), 0.16);
}

.fixed-nav-wrapper:not(.expanded) .menu-item-stack {
  opacity: 0;
  transform: translateY(-20px);
  pointer-events: none;
}

.fixed-nav-wrapper.expanded .menu-item-stack {
  opacity: 1;
  transform: translateY(0);
  pointer-events: auto;
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
  background: var(--theme-menu-text, rgba(236, 242, 255, 0.92));
  height: 2px;
  width: 24px;
  border-radius: 2px;
  transition: all 0.5s cubic-bezier(0.68, -0.6, 0.32, 1.6);
  box-shadow: var(--theme-contrast-icon-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.6));
}

.bar-line.top {
  transform: translateY(-7px);
}

.bar-line.bottom {
  transform: translateY(7px);
}

.menu-label-text {
  font-size: 10px;
  font-weight: 700;
  color: var(--theme-menu-text, rgba(236, 242, 255, 0.92));
  letter-spacing: 0.82px;
  transition: 0.3s;
  text-shadow: var(--theme-contrast-text-shadow-strong, 0 1px 1px rgba(0, 0, 0, 0.54));
  -webkit-text-stroke: var(--theme-contrast-outline-width, 0.18px) var(--theme-contrast-stroke-soft, rgba(5, 8, 14, 0.28));
}

.fixed-nav-wrapper.expanded .bar-line.top {
  transform: translateY(0) rotate(135deg);
  background-color: var(--theme-menu-text, rgba(236, 242, 255, 0.92));
  width: 20px;
}

.fixed-nav-wrapper.expanded .bar-line.bottom {
  transform: translateY(0) rotate(-135deg);
  background-color: var(--theme-menu-text, rgba(236, 242, 255, 0.92));
  width: 20px;
}

.theme-toggle-box {
  overflow: hidden;
}

.theme-toggle-box::before {
  content: '';
  position: absolute;
  inset: 5px;
  border-radius: 999px;
  transition: transform 0.28s ease, opacity 0.28s ease, box-shadow 0.28s ease, background 0.28s ease;
}

.theme-toggle-box.day::before {
  background: linear-gradient(180deg, rgba(255, 223, 132, 0.98), rgba(255, 169, 92, 0.88));
  box-shadow:
    0 0 0 1px rgba(139, 84, 31, 0.16),
    0 0 14px rgba(255, 184, 96, 0.36);
}

.theme-toggle-box.night::before {
  background: linear-gradient(180deg, rgba(176, 186, 255, 0.96), rgba(111, 121, 208, 0.9));
  box-shadow:
    0 0 0 1px rgba(255, 255, 255, 0.16),
    0 0 14px rgba(126, 143, 255, 0.28);
}

.theme-toggle-box i {
  position: relative;
  z-index: 1;
}

.theme-toggle-box.day i {
  color: rgba(92, 51, 20, 0.94);
}

.theme-toggle-box.night i {
  color: rgba(246, 248, 255, 0.96);
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
    background: rgba(10, 16, 26, 0.42);
    box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.22);
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
    background: rgba(10, 16, 26, 0.42);
    box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.22);
  }

  .menu-item-stack.active {
    background: var(--menu-active-bg);
    box-shadow: inset 0 0 0 1px var(--menu-active-border);
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
