<template>
  <nav
    class="fixed-nav-wrapper top-menu-root motion-managed"
    :class="{
      expanded: menuPresentation.full,
      compact: menuPresentation.compact,
      'route-scrolled': menuPresentation.pastThreshold,
      'manual-expanded': menuExpanded,
      'manual-collapsed': menuCollapsed
    }"
    :data-route-scroll-top="normalizedRouteScrollTop"
    data-transform-owner="menu-shell"
  >
    <LiquidSurface
      as="div"
      class="top-bar"
      variant="navigation"
      :inert="topBarInactive ? '' : undefined"
      :aria-hidden="String(topBarInactive)"
    >
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
            :role="item.key === 'home' ? 'button' : undefined"
            :tabindex="item.key === 'home' ? 0 : undefined"
            :aria-label="item.key === 'home' && isHomeRoute ? '打开主页外观设置' : undefined"
            :aria-controls="item.key === 'home' && isHomeRoute ? 'home-appearance-panel' : undefined"
            :aria-expanded="item.key === 'home' && isHomeRoute ? String(appearancePanelOpen) : undefined"
            :title="item.key === 'home' && isHomeRoute ? '再次点击 Home 调整主页外观' : undefined"
            @click="selectMainRoute(item.key)"
            @keydown.enter.prevent="selectMainRoute(item.key)"
            @keydown.space.prevent="selectMainRoute(item.key)"
          >
            <div class="icon-minimal"><i :class="item.icon"></i></div>
            <span class="item-label">{{ item.label }}</span>
          </div>

          <Transition name="appearance-popover">
            <section
              v-if="isHomeRoute && appearancePanelOpen"
              id="home-appearance-panel"
              class="appearance-popover home-entry-popover liquid-material"
              data-testid="appearance-popover"
              aria-label="主页外观设置"
              @click.stop
            >
              <header class="appearance-popover-head">
                <span>APPEARANCE</span>
                <strong>主页外观</strong>
                <small>只调整首页时钟、壁纸与动效表现。</small>
              </header>

              <div class="appearance-group">
                <span class="appearance-label">主页时钟</span>
                <div class="appearance-segment appearance-segment-three">
                  <button
                    v-for="option in clockOptions"
                    :key="option.value"
                    type="button"
                    :class="{ active: homeClockBehavior === option.value }"
                    :aria-pressed="homeClockBehavior === option.value"
                    @click="emit('set-home-clock-behavior', option.value)"
                  >
                    {{ option.label }}
                  </button>
                </div>
              </div>

              <div class="appearance-group">
                <span class="appearance-label">当前壁纸覆盖</span>
                <div class="appearance-segment appearance-segment-three">
                  <button
                    v-for="option in wallpaperClockOptions"
                    :key="option.value"
                    type="button"
                    :class="{ active: homeWallpaperClockOverride === option.value }"
                    :aria-pressed="homeWallpaperClockOverride === option.value"
                    @click="emit('set-home-wallpaper-clock-override', option.value)"
                  >
                    {{ option.label }}
                  </button>
                </div>
                <small>当前结果：{{ homeClockVisible ? '显示时钟' : '隐藏时钟' }}</small>
              </div>

              <div class="appearance-group">
                <span class="appearance-label">壁纸取色</span>
                <div class="appearance-segment appearance-segment-two">
                  <button
                    type="button"
                    :class="{ active: homeColorMode === 'auto' }"
                    :aria-pressed="homeColorMode === 'auto'"
                    @click="emit('set-home-color-mode', 'auto')"
                  >
                    自动取色
                  </button>
                  <button
                    type="button"
                    :class="{ active: homeColorMode === 'manual' }"
                    :aria-pressed="homeColorMode === 'manual'"
                    @click="emit('set-home-color-mode', 'manual')"
                  >
                    手动覆盖
                  </button>
                </div>
                <label v-if="homeColorMode === 'manual'" class="appearance-color-control">
                  <input
                    type="color"
                    :value="homeAccentHex"
                    aria-label="主页手动主色"
                    @input="emit('set-home-manual-accent-hex', $event.target.value)"
                  />
                  <span>{{ homeAccentHex }}</span>
                </label>
                <small v-else>静态图取壁纸，动态壁纸取预览代表帧</small>
              </div>

              <div class="appearance-group">
                <span class="appearance-label">主页动效</span>
                <div class="appearance-segment appearance-segment-two" data-testid="motion-preference-options">
                  <button
                    v-for="option in motionOptions"
                    :key="option.value"
                    type="button"
                    :class="{ active: homeMotionLevel === option.value }"
                    :aria-pressed="homeMotionLevel === option.value"
                    @click="emit('set-home-motion-level', option.value)"
                  >
                    {{ option.label }}
                  </button>
                </div>
              </div>
            </section>
          </Transition>
        </div>
      </div>

      <div class="nav-section center secondary-nav">
        <div
          class="menu-item-stack ripple-trigger"
          :class="{ active: menuHubActive }"
          role="button"
          tabindex="0"
          aria-label="打开氛围面板"
          @click="openAtmosphere"
          @keydown.enter="openAtmosphere"
          @keydown.space.prevent="openAtmosphere"
        >
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

        <div class="menu-item-stack theme-control-cluster">
          <button
            class="theme-toggle-action ripple-trigger theme-toggle-item"
            type="button"
            :aria-label="themeToggleActionLabel"
            @click.stop="toggleThemeMode"
          >
            <span class="circle-icon-box liquid-material theme-toggle-box" :class="themeModeNormalized">
              <i :class="themeModeIcon"></i>
            </span>
            <span class="item-label">主题</span>
          </button>
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

        <button
          type="button"
          class="menu-item-stack author-info-item ripple-trigger"
          :class="{ 'route-active': isSiteRoute }"
          aria-label="直接打开关于网站"
          @click.stop="openAuthorAbout"
        >
          <div class="author-avatar-box">
            <img class="author-avatar-image" :src="resolvedAuthorAvatarUrl" alt="author-avatar" @error="onAuthorAvatarError" />
          </div>
          <span class="item-label">Site</span>
        </button>

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
    </LiquidSurface>

    <LiquidSurface
      as="div"
      class="mobile-top-dock"
      variant="navigation"
      aria-label="移动端主导航"
      data-testid="mobile-top-navigation"
    >
      <button
        v-for="item in mainNavItems"
        :key="`mobile-${item.key}`"
        type="button"
        class="mobile-top-nav-item ripple-trigger"
        :class="{ active: activeMainRoute === item.key }"
        :aria-current="activeMainRoute === item.key ? 'page' : undefined"
        :aria-label="item.label"
        @click="selectMainRoute(item.key)"
      >
        <i :class="item.icon" aria-hidden="true"></i>
        <span>{{ item.label }}</span>
      </button>
      <button
        type="button"
        class="mobile-top-nav-item mobile-site-item ripple-trigger"
        :class="{ active: isSiteRoute }"
        :aria-current="isSiteRoute ? 'page' : undefined"
        aria-label="Life"
        @click.stop="openAuthorAbout"
      >
        <i class="fas fa-compass" aria-hidden="true"></i>
        <span>Life</span>
      </button>
      <button
        type="button"
        class="mobile-top-nav-item mobile-more-item ripple-trigger"
        :class="{ active: menuExpanded }"
        :aria-expanded="menuExpanded"
        aria-label="更多站点控制"
        @click="toggleSwitch"
      >
        <i class="fas fa-ellipsis" aria-hidden="true"></i>
        <span>More</span>
      </button>
    </LiquidSurface>

    <button
      type="button"
      class="toggle-tab liquid-material ripple-trigger"
      :aria-label="menuPresentation.compact ? '展开完整导航' : '收起导航，仅保留 Menu 按钮'"
      :aria-expanded="menuPresentation.full"
      @click="toggleSwitch"
    >
      <div class="switch-content">
        <span class="bar-line top"></span>
        <div class="menu-label-text">MENU</div>
        <span class="bar-line bottom"></span>
      </div>
    </button>
  </nav>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref, toRefs, watch } from 'vue';
import { useRoute } from 'vue-router';
import LiquidSurface from './material/LiquidSurface.vue';
import { resolveTopMenuPresentation } from '../utils/topMenuPresentation';

const props = defineProps({
  menuExpanded: {
    type: Boolean,
    default: false
  },
  menuCollapsed: {
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
  },
  isHomeRoute: {
    type: Boolean,
    default: false
  },
  homeClockBehavior: {
    type: String,
    default: 'auto'
  },
  homeClockVisible: {
    type: Boolean,
    default: true
  },
  homeWallpaperClockOverride: {
    type: String,
    default: ''
  },
  homeMotionLevel: {
    type: String,
    default: 'immersive'
  },
  homeColorMode: {
    type: String,
    default: 'auto'
  },
  homeAccentHex: {
    type: String,
    default: '#F2B39D'
  },
  routeScrollTop: {
    type: Number,
    default: 0
  }
});

const emit = defineEmits([
  'toggle-menu',
  'set-theme-mode',
  'set-home-clock-behavior',
  'set-home-wallpaper-clock-override',
  'set-home-motion-level',
  'set-home-color-mode',
  'set-home-manual-accent-hex',
  'toggle-ai-chat',
  'select-main-route',
  'open-atmosphere-panel',
  'open-background-picker',
  'open-profile',
  'open-admin',
  'open-author',
  'open-auth'
]);
const route = useRoute();
const { menuExpanded, menuCollapsed, themeMode, aiChatActive, aiChatDisabled, isAuthenticated, displayName, avatarUrl, authorAvatarUrl, musicActive, ambientActive, effectActive, isHomeRoute, homeClockBehavior, homeClockVisible, homeWallpaperClockOverride, homeMotionLevel, homeColorMode, homeAccentHex, routeScrollTop } = toRefs(props);
const avatarLoadFailed = ref(false);
const authorAvatarLoadFailed = ref(false);
const appearancePanelOpen = ref(false);
const isMobileViewport = ref(false);
let mobileMediaQuery = null;
let mobileMediaListener = null;
const menuHubActive = computed(() => musicActive.value || ambientActive.value || effectActive.value);
const themeModeNormalized = computed(() => (String(themeMode.value || '').trim().toLowerCase() === 'day' ? 'day' : 'night'));
const themeModeIcon = computed(() => (themeModeNormalized.value === 'day' ? 'fas fa-sun' : 'fas fa-moon'));
const themeToggleActionLabel = computed(() => (themeModeNormalized.value === 'day' ? '切换到夜间模式' : '切换到白天模式'));
const normalizedRouteScrollTop = computed(() => {
  const value = Number(routeScrollTop.value);
  return Number.isFinite(value) ? Math.max(0, Math.round(value)) : 0;
});
const menuPresentation = computed(() => resolveTopMenuPresentation({
  scrollTop: normalizedRouteScrollTop.value,
  manualExpanded: menuExpanded.value,
  manualCollapsed: menuCollapsed.value
}));
const topBarInactive = computed(() => (
  menuPresentation.value.compact || (isMobileViewport.value && !menuExpanded.value)
));
const clockOptions = Object.freeze([
  { value: 'auto', label: '自动' },
  { value: 'show', label: '显示' },
  { value: 'hide', label: '隐藏' }
]);
const wallpaperClockOptions = Object.freeze([
  { value: '', label: '继承' },
  { value: 'show', label: '显示' },
  { value: 'hide', label: '隐藏' }
]);
const motionOptions = Object.freeze([
  { value: 'immersive', label: '沉浸' },
  { value: 'soothing', label: '舒缓' }
]);

const mainNavItems = computed(() => {
  return [
    { key: 'home', label: 'Home', icon: 'fas fa-house' },
    { key: 'blog', label: 'Blog', icon: 'far fa-file-alt' },
    { key: 'music-library', label: 'Music', icon: 'fas fa-music' },
    { key: 'apps', label: 'Apps', icon: 'fas fa-th-large' },
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
  if (name === 'home') {
    return 'home';
  }
  const keys = mainNavItems.value.map((item) => item.key);
  return keys.includes(name) ? name : '';
});

const hasMainRouteActive = computed(() => activeMainRoute.value !== '');

const isProfileRoute = computed(() => {
  const name = typeof route.name === 'string' ? route.name : '';
  return name === 'profile' || name === 'admin';
});

const activeSiteDestination = computed(() => {
  const name = typeof route.name === 'string' ? route.name : '';
  if (name === 'author') return 'about';
  if (name.startsWith('albums') || name.startsWith('album-')) return 'albums';
  if (name.startsWith('moments') || name.startsWith('moment-')) return 'moments';
  return '';
});

const isSiteRoute = computed(() => activeSiteDestination.value !== '');

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

function toggleAppearancePanel() {
  appearancePanelOpen.value = !appearancePanelOpen.value;
}

function toggleThemeMode() {
  appearancePanelOpen.value = false;
  emit('set-theme-mode', themeModeNormalized.value === 'day' ? 'night' : 'day');
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
  if (routeKey === 'home' && isHomeRoute.value) {
    toggleAppearancePanel();
    return;
  }
  appearancePanelOpen.value = false;
  emit('select-main-route', routeKey);
}

function openBackgroundPicker() {
  emit('open-background-picker');
}

function openAtmosphere() {
  emit('open-atmosphere-panel');
}

function openAuthorAbout() {
  appearancePanelOpen.value = false;
  emit('open-author');
}

function bindMobileViewport() {
  if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') return;
  mobileMediaQuery = window.matchMedia('(max-width: 899.98px)');
  const update = (event) => {
    isMobileViewport.value = Boolean(event?.matches ?? mobileMediaQuery?.matches);
  };
  mobileMediaListener = update;
  update(mobileMediaQuery);
  if (typeof mobileMediaQuery.addEventListener === 'function') {
    mobileMediaQuery.addEventListener('change', update);
  } else if (typeof mobileMediaQuery.addListener === 'function') {
    mobileMediaQuery.addListener(update);
  }
}

function unbindMobileViewport() {
  if (!mobileMediaQuery || !mobileMediaListener) return;
  if (typeof mobileMediaQuery.removeEventListener === 'function') {
    mobileMediaQuery.removeEventListener('change', mobileMediaListener);
  } else if (typeof mobileMediaQuery.removeListener === 'function') {
    mobileMediaQuery.removeListener(mobileMediaListener);
  }
  mobileMediaQuery = null;
  mobileMediaListener = null;
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

watch(
  () => menuExpanded.value,
  (expanded) => {
    if (!expanded) appearancePanelOpen.value = false;
  }
);

watch(() => route.fullPath, () => {
  appearancePanelOpen.value = false;
});

onMounted(bindMobileViewport);

onBeforeUnmount(() => {
  unbindMobileViewport();
});
</script>

<style scoped>
.top-menu-root {
  --menu-glass-bg: linear-gradient(
    155deg,
    rgba(var(--accent-rgb), 0.1),
    rgba(86, 66, 76, 0.26) 42%
  );
  --menu-glass-border: var(--theme-border-strong);
  --menu-glass-shadow: var(--theme-shadow-soft);
  --menu-hover-bg: var(--accent-mode-fill);
  --menu-active-bg: var(--accent-mode-fill-strong);
  --menu-active-border: var(--accent-mode-border);
  --menu-active-shadow: var(--accent-mode-shadow);
  --menu-icon-color: var(--theme-icon-primary);
  --menu-mobile-chip-bg: var(--theme-surface-soft);
  --menu-mobile-chip-border: var(--theme-border-strong);
  --icon-hover-color: rgb(var(--accent-readable-rgb));
  -webkit-font-smoothing: antialiased;
  text-rendering: geometricPrecision;
}

.top-menu-root i {
  color: inherit;
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
  transform: translateY(15px);
  transition: transform var(--dur-base) var(--ease-out);
}

.fixed-nav-wrapper.expanded {
  transform: translateY(15px);
}

.fixed-nav-wrapper.compact {
  transform: translateY(10px);
}

.top-bar {
  --liquid-fill: var(--menu-glass-bg);
  --liquid-border: var(--menu-glass-border);
  --liquid-shadow: var(--menu-glass-shadow);
  overflow: visible;
  width: 98%;
  max-width: 1500px;
  height: 86px;
  border-radius: 20px;
  padding: 0 30px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  opacity: 1;
  visibility: visible;
  transform: translate3d(0, 0, 0) scale(1);
  transform-origin: 50% 0;
  transition:
    opacity var(--dur-fast) ease,
    transform var(--dur-base) var(--ease-out),
    visibility 0s linear 0s;
  scrollbar-color: var(--theme-border-strong) transparent;
  will-change: transform, opacity;
  z-index: 2;
}

.fixed-nav-wrapper.compact .top-bar {
  opacity: 0;
  visibility: hidden;
  transform: translate3d(0, -10px, 0) scale(0.985);
  transition-delay: 0s, 0s, var(--dur-base);
  pointer-events: none;
}

.toggle-tab:focus-visible {
  outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
  outline-offset: 3px;
}

.mobile-top-dock {
  display: none;
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
  transition: opacity var(--dur-fast) ease;
  position: relative;
}

.menu-item-stack:not(.theme-control-cluster):active .icon-minimal,
.menu-item-stack:not(.theme-control-cluster):active .circle-icon-box,
.menu-item-stack:not(.theme-control-cluster):active .author-avatar-box,
.menu-item-stack:not(.theme-control-cluster):active .avatar-box,
.menu-item-stack.ai-chat-item:active .pill-btn-box {
  transform: scale(0.94);
}

.left-main-btn.active .icon-minimal {
  /* 背景是强主色填充，图标用亮度计算的墨色（黑/白自动切换）。 */
  color: var(--accent-surface-text);
  transform: scale(1.06);
}

.left-main-btn.active .item-label {
  display: block;
}

.item-label {
  display: none;
}

.left-main-btn .item-label,
.author-info-item .item-label {
  display: block;
  font-size: 12px;
  font-weight: 600;
  letter-spacing: 0.04em;
}

.left-pill-group {
  --left-main-gap: 10px;
  --left-main-item-width: 112px;
  --left-main-padding-x: 16px;
  box-shadow: inset 0 0 0 1px color-mix(in srgb, var(--theme-border-strong) 92%, transparent);
  border-radius: 40px;
  min-width: 0;
  padding: 0 var(--left-main-padding-x);
  display: flex;
  gap: var(--left-main-gap);
  justify-content: flex-start;
  align-items: center;
  height: 60px;
  position: relative;
  flex-wrap: wrap;
}

.left-pill-group::before {
  display: none;
}

.left-pill-group.no-main-active::before {
  opacity: 0;
}

.left-main-btn {
  width: var(--left-main-item-width);
  min-height: 44px;
  padding: 0 14px;
  border-radius: 999px;
  flex-direction: row;
  gap: 8px;
  z-index: 1;
}

.left-main-btn.active {
  background: var(--menu-active-bg);
  box-shadow:
    0 0 0 1px var(--menu-active-border),
    var(--menu-active-shadow);
}

.left-main-btn[role='button']:focus-visible {
  outline: 2px solid rgb(var(--accent-readable-rgb));
  outline-offset: 2px;
}

.icon-minimal {
  font-size: 18px;
  color: var(--menu-icon-color);
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
  color: var(--menu-icon-color);
  transition: transform 0.3s ease, color 0.3s ease, box-shadow 0.3s ease;
}

.circle-icon-box:hover {
  --liquid-bg: var(--menu-hover-bg);
  transform: translateY(-3px);
  box-shadow: var(--shadow-sm);
  color: var(--icon-hover-color);
}

.menu-item-stack.active .circle-icon-box {
  --liquid-bg: var(--menu-active-bg);
  /* 圆形底是强主色填充，图标改用墨色。 */
  color: var(--accent-surface-text);
  box-shadow:
    0 0 0 1px var(--menu-active-border),
    var(--menu-active-shadow);
}

.menu-item-stack.active .item-label {
  /* 标签在玻璃条上（不是主色底），保留主色点缀但做了对比度校正。 */
  color: rgb(var(--accent-readable-rgb));
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
  background: color-mix(in srgb, var(--theme-menu-text-muted) 46%, transparent);
  box-shadow: 0 0 0 1px color-mix(in srgb, var(--theme-contrast-stroke-soft) 36%, transparent);
  transition: transform 0.18s ease, background-color 0.18s ease, box-shadow 0.18s ease;
}

.menu-status-dot.active {
  background: rgb(var(--accent-strong-rgb));
  box-shadow:
    0 0 0 1px var(--theme-menu-avatar-border),
    0 0 10px rgba(var(--accent-rgb), 0.36);
  transform: scale(1.15);
}

.icon-rotated {
  transform: rotate(90deg);
}

.pill-btn-box {
  width: 44px;
  height: 44px;
  border-radius: 50%;
  position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 18px;
  color: var(--menu-icon-color);
  transition: transform 0.3s ease, color 0.3s ease, box-shadow 0.3s ease;
}

.pill-btn-box > span:not(.ai-chat-dot) {
  display: none;
}

.pill-btn-box i {
  color: var(--theme-icon-primary);
}

.menu-item-stack:hover .pill-btn-box {
  --liquid-bg: var(--menu-hover-bg);
  transform: translateY(-2px);
  box-shadow: var(--shadow-sm);
}

.pill-btn-box:hover i {
  color: var(--icon-hover-color);
}

.ai-chat-item.disabled {
  cursor: not-allowed;
  opacity: 0.68;
}

.ai-chat-item.disabled .pill-btn-box {
  --liquid-bg: var(--theme-surface-soft);
  color: var(--theme-menu-text-disabled);
}

.ai-chat-item.disabled:hover .pill-btn-box,
.ai-chat-item.disabled .pill-btn-box:hover {
  --liquid-bg: var(--theme-surface-soft);
  transform: none;
  box-shadow: none;
}

.ai-chat-dot {
  position: absolute;
  top: 5px;
  right: 7px;
  width: 10px;
  height: 10px;
  border-radius: 50%;
  border: 1.5px solid var(--theme-menu-avatar-border);
  background: transparent;
  transition: background-color 0.2s ease, border-color 0.2s ease, box-shadow 0.2s ease;
}

.ai-chat-dot.active {
  background: rgb(var(--accent-strong-rgb));
  border-color: rgb(var(--accent-strong-rgb));
  box-shadow: 0 0 0 2px rgba(var(--accent-rgb), 0.22);
}

.author-info-item,
.user-profile-item {
  border-radius: 12px;
  padding: 2px 6px 4px;
}

button.author-info-item {
  border: 0;
  color: inherit;
  background: transparent;
  font: inherit;
}

button.author-info-item:focus-visible {
  outline: 3px solid var(--theme-focus-ring);
  outline-offset: 3px;
}

.author-avatar-box {
  width: 44px;
  height: 44px;
  border-radius: 50%;
  overflow: hidden;
  background: var(--theme-panel-surface-elevated);
  border: 2px solid var(--theme-menu-avatar-border);
  box-shadow: var(--shadow-sm);
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
  border: 2px solid var(--theme-menu-avatar-border);
  position: relative;
  overflow: hidden;
  background: var(--theme-panel-surface-elevated);
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
  border-color: var(--theme-menu-avatar-border);
  color: var(--theme-icon-primary);
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
  border: 1px solid var(--theme-menu-avatar-border);
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
  /* 整块是强主色底（--menu-active-bg），文字用墨色。 */
  color: var(--accent-surface-text);
  font-weight: 600;
  text-shadow: var(--accent-surface-text-shadow);
}

.fixed-nav-wrapper:not(.expanded) .menu-item-stack {
  opacity: 0;
  pointer-events: none;
}

.fixed-nav-wrapper.expanded .menu-item-stack {
  opacity: 1;
  pointer-events: auto;
}

.toggle-tab {
  width: 140px;
  height: 32px;
  border-bottom-left-radius: 12px;
  border-bottom-right-radius: 12px;
  margin-top: -1px;
  box-shadow: var(--shadow-sm);
  display: flex;
  cursor: pointer;
  justify-content: center;
  align-items: flex-end;
  padding-bottom: 8px;
  transition: color var(--dur-fast) ease, box-shadow var(--dur-fast) ease, transform var(--dur-fast) ease;
  z-index: 1001;
  border: 0;
  color: inherit;
}

/* 手动收起：吸附顶部的玻璃窄条（对齐最上方 + 贴顶质感） */
.fixed-nav-wrapper.manual-collapsed {
  transform: translateY(0);
}

.fixed-nav-wrapper.manual-collapsed .top-bar {
  width: 100%;
  max-width: 100%;
  height: 54px;
  border-radius: 0 0 16px 16px;
  padding: 0 20px;
  --liquid-bg: linear-gradient(155deg, rgba(var(--accent-rgb), 0.08), rgba(15, 14, 22, 0.82) 45%);
  --liquid-border: rgba(255, 255, 255, 0.14);
  --liquid-shadow: 0 10px 28px rgba(6, 8, 14, 0.32);
  backdrop-filter: blur(28px) saturate(160%);
  -webkit-backdrop-filter: blur(28px) saturate(160%);
  box-shadow: 0 10px 28px rgba(6, 8, 14, 0.32), inset 0 -1px 0 rgba(255, 255, 255, 0.12);
}

/* 手动收起时覆盖 compact 自动隐藏（收起态也要显示吸附条） */
.fixed-nav-wrapper.manual-collapsed.compact .top-bar {
  opacity: 1;
  visibility: visible;
  transform: translate3d(0, 0, 0) scale(1);
  pointer-events: auto;
}

.fixed-nav-wrapper.manual-collapsed.compact .toggle-tab {
  display: none;
}

.fixed-nav-wrapper.compact .toggle-tab {
  --liquid-shadow: var(--shadow-md);
  width: 116px;
  height: 44px;
  margin-top: 0;
  padding-bottom: 0;
  align-items: center;
  border-radius: 999px;
}

.toggle-tab:hover {
  --liquid-bg: var(--menu-hover-bg);
  box-shadow: var(--shadow-md);
}

.toggle-tab:active {
  --liquid-bg: var(--menu-active-bg);
  transform: scale(0.97);
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
  background: var(--theme-menu-text);
  height: 2px;
  width: 24px;
  border-radius: 2px;
  transition: transform var(--dur-base) var(--ease-out), background-color var(--dur-fast) ease;
  box-shadow: var(--theme-contrast-icon-shadow-strong);
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
  color: var(--theme-menu-text);
  letter-spacing: 0.82px;
  transition: transform var(--dur-fast) ease, opacity var(--dur-fast) ease, filter var(--dur-fast) ease;
  text-shadow: var(--theme-contrast-text-shadow-strong);
  -webkit-text-stroke: var(--theme-contrast-outline-width) var(--theme-contrast-stroke-soft);
}

.fixed-nav-wrapper.expanded .bar-line.top {
  transform: translateY(0) rotate(135deg);
  background-color: var(--theme-menu-text);
  width: 20px;
}

.fixed-nav-wrapper.expanded .bar-line.bottom {
  transform: translateY(0) rotate(-135deg);
  background-color: var(--theme-menu-text);
  width: 20px;
}

.theme-toggle-box {
  overflow: hidden;
}

.theme-control-cluster {
  min-width: 68px;
  cursor: default;
}

.theme-toggle-action {
  margin: 0;
  padding: 0;
  border: 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 6px;
  background: transparent;
  color: inherit;
  font: inherit;
  cursor: pointer;
  align-self: flex-start;
}

.theme-toggle-action:active .theme-toggle-box {
  transform: scale(0.94);
}

.theme-toggle-action:focus-visible {
  outline: 0;
}

.theme-toggle-action:focus-visible .theme-toggle-box {
  outline: 2px solid rgb(var(--accent-readable-rgb));
  outline-offset: 2px;
}

.theme-toggle-box::before {
  content: '';
  position: absolute;
  inset: 5px;
  border-radius: 999px;
  opacity: 0;
  background: transparent;
  box-shadow: none;
  transition: transform 0.28s ease, opacity 0.28s ease, box-shadow 0.28s ease, background 0.28s ease;
}

.theme-toggle-box.day::before {
  background: transparent;
  box-shadow: none;
}

.theme-toggle-box.night::before {
  background: transparent;
  box-shadow: none;
}

.theme-toggle-box i {
  position: relative;
  z-index: 1;
}

.theme-toggle-box.day i {
  color: var(--theme-icon-primary);
}

.theme-toggle-box.night i {
  color: var(--theme-icon-primary);
}

.appearance-popover {
  --liquid-bg: var(--theme-panel-surface-elevated);
  --liquid-border: var(--theme-border-strong);
  --liquid-shadow: var(--shadow-lg);
  position: absolute;
  top: calc(100% + 18px);
  left: 50%;
  width: 286px;
  padding: 16px;
  border-radius: 24px;
  display: grid;
  gap: 15px;
  transform: translateX(-50%);
  color: var(--theme-text-primary);
  text-align: left;
  cursor: default;
  z-index: 20;
}

.appearance-popover.home-entry-popover {
  left: 143px;
}

.appearance-popover.home-entry-popover::before {
  left: 72px;
}

.appearance-popover::before {
  content: '';
  position: absolute;
  top: -7px;
  left: 50%;
  width: 14px;
  height: 14px;
  border-top: 1px solid var(--theme-border-strong);
  border-left: 1px solid var(--theme-border-strong);
  background: var(--theme-panel-surface-elevated);
  transform: translateX(-50%) rotate(45deg);
}

.appearance-popover-head,
.appearance-group {
  display: grid;
}

.appearance-popover-head {
  gap: 3px;
}

.appearance-popover-head small {
  margin-top: 3px;
  color: var(--theme-text-tertiary);
  font-size: 10px;
  line-height: 1.45;
}

.appearance-popover-head span,
.appearance-label {
  color: var(--theme-text-tertiary);
  font-size: 9px;
  font-weight: 760;
  letter-spacing: 0.17em;
}

.appearance-popover-head strong {
  font-size: 15px;
  font-weight: 680;
}

.appearance-group {
  gap: 7px;
}

.appearance-group small {
  color: var(--theme-text-tertiary);
  font-size: 9px;
}

.appearance-color-control {
  min-height: 36px;
  padding: 5px 9px;
  border: 1px solid var(--theme-border);
  border-radius: 12px;
  display: flex;
  align-items: center;
  gap: 9px;
  background: var(--theme-surface-soft);
  color: var(--theme-text-secondary);
  font-size: 10px;
  cursor: pointer;
}

.appearance-color-control input {
  width: 28px;
  height: 24px;
  padding: 0;
  border: 0;
  border-radius: 8px;
  background: transparent;
  cursor: pointer;
}

.appearance-segment {
  padding: 3px;
  border: 1px solid var(--theme-border);
  border-radius: 13px;
  display: grid;
  gap: 3px;
  background: var(--theme-surface-soft);
}

.appearance-segment-two { grid-template-columns: repeat(2, minmax(0, 1fr)); }
.appearance-segment-three { grid-template-columns: repeat(3, minmax(0, 1fr)); }

.appearance-segment button {
  min-height: 32px;
  border: 0;
  border-radius: 10px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: 6px;
  background: transparent;
  color: var(--theme-text-secondary);
  font: inherit;
  font-size: 10px;
  cursor: pointer;
  transition: background 180ms ease, color 180ms ease, box-shadow 180ms ease, transform 180ms ease;
}

.appearance-segment button:hover {
  background: rgba(var(--accent-rgb), 0.12);
  color: var(--theme-text-primary);
}

.appearance-segment button.active {
  background: var(--accent-mode-fill-strong, rgba(var(--accent-rgb), 0.26));
  color: var(--accent-surface-text, var(--theme-text-primary));
  box-shadow: inset 0 0 0 1px var(--accent-mode-border, rgba(var(--accent-rgb), 0.32));
}

.appearance-segment button:active { transform: scale(0.96); }
.appearance-segment button:focus-visible { outline: 2px solid rgb(var(--accent-strong-rgb)); outline-offset: 2px; }

.appearance-popover-enter-active,
.appearance-popover-leave-active {
  transition: opacity 220ms ease, transform 280ms cubic-bezier(0.22, 1, 0.36, 1);
}

.appearance-popover-enter-from,
.appearance-popover-leave-to {
  opacity: 0;
  transform: translateX(-50%) translateY(-8px) scale(0.96);
}

:root[data-theme-mode='day'] .top-menu-root {
  --menu-glass-bg: linear-gradient(
    155deg,
    rgba(var(--accent-rgb), 0.06),
    rgba(255, 252, 248, 0.55) 46%
  );
  --menu-glass-border: var(--theme-border-strong);
  --menu-glass-shadow: var(--theme-shadow-soft);
  --menu-active-bg: var(--accent-mode-fill-strong);
  --menu-active-border: var(--accent-mode-border);
  --menu-active-shadow: var(--accent-mode-shadow);
  --menu-mobile-chip-bg: var(--theme-surface-soft);
  --menu-mobile-chip-border: var(--theme-border-strong);
}

:root[data-theme-mode='day'] .top-menu-root :is(.author-avatar-box, .avatar-box) {
  background: var(--theme-panel-surface-elevated);
}

.fixed-nav-wrapper.expanded .menu-label-text {
  transform: scale(0.6);
  opacity: 0;
  filter: blur(2px);
}

@media (min-width: 901px) and (max-width: 1180px) {
  .top-bar {
    width: calc(100% - 20px);
    padding: 0 14px;
    gap: 8px;
  }

  .nav-section.center {
    flex: 0 0 auto;
    gap: 9px;
  }

  .nav-section.right {
    gap: 7px;
  }

  .left-pill-group {
    --left-main-gap: 4px;
    --left-main-item-width: 76px;
    --left-main-padding-x: 8px;
  }

  .left-main-btn {
    padding-inline: 8px;
    gap: 5px;
  }

  .left-main-btn .item-label,
  .author-info-item .item-label {
    font-size: 10px;
  }

  .menu-item-stack {
    gap: 4px;
  }

  .theme-control-cluster {
    min-width: 62px;
  }

  .circle-icon-box,
  .pill-btn-box,
  .author-avatar-box,
  .avatar-box {
    width: 40px;
    height: 40px;
  }

  .appearance-popover {
    left: auto;
    right: -94px;
    transform: none;
  }

  .appearance-popover.home-entry-popover {
    right: auto;
    left: 143px;
    transform: translateX(-50%);
  }

  .appearance-popover.home-entry-popover::before {
    left: 46px;
  }

  .appearance-popover::before {
    left: calc(100% - 111px);
  }

  .appearance-popover-enter-from,
  .appearance-popover-leave-to {
    transform: translateY(-8px) scale(0.96);
  }

  .home-entry-popover.appearance-popover-enter-from,
  .home-entry-popover.appearance-popover-leave-to {
    transform: translateX(-50%) translateY(-8px) scale(0.96);
  }
}

@media (max-width: 900px) {
  .appearance-popover.home-entry-popover {
    display: none;
  }

  .mobile-top-dock {
    --liquid-fill: color-mix(in srgb, var(--menu-glass-bg) 94%, transparent);
    --liquid-border: var(--menu-glass-border);
    --liquid-shadow: var(--shadow-md);
    position: absolute;
    z-index: 12;
    top: 0;
    left: 50%;
    width: min(calc(100vw - 16px), 680px);
    min-height: 54px;
    padding: 5px 7px;
    border-radius: 999px;
    display: flex;
    align-items: center;
    gap: 3px;
    overflow-x: auto;
    transform: translateX(-50%);
    pointer-events: auto;
    scrollbar-width: none;
  }

  .mobile-top-dock::-webkit-scrollbar {
    display: none;
  }

  .mobile-top-nav-item {
    flex: 1 0 44px;
    min-width: 44px;
    min-height: 44px;
    border: 0;
    border-radius: 999px;
    padding: 0 8px;
    display: inline-flex;
    align-items: center;
    justify-content: center;
    gap: 5px;
    color: var(--theme-menu-text, var(--theme-text-primary));
    background: transparent;
    font: inherit;
    font-size: 10px;
    font-weight: 650;
    cursor: pointer;
    touch-action: manipulation;
  }

  .mobile-top-nav-item.active {
    color: var(--accent-surface-text, var(--theme-text-primary));
    background: var(--menu-active-bg);
    box-shadow: inset 0 0 0 1px var(--menu-active-border);
  }

  .mobile-top-nav-item:focus-visible {
    outline: 3px solid var(--theme-focus-ring, rgba(var(--accent-rgb), 0.72));
    outline-offset: 2px;
  }

  .top-bar {
    opacity: 0;
    visibility: hidden;
    pointer-events: none;
    transform: translate3d(0, -8px, 0) scale(0.985);
  }

  .fixed-nav-wrapper.manual-expanded .top-bar {
    opacity: 1;
    visibility: visible;
    pointer-events: auto;
    transform: translate3d(0, 0, 0) scale(1);
  }

  .toggle-tab {
    display: none;
  }

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
    min-width: 76px;
    min-height: 52px;
    padding: 6px 10px;
    flex-direction: column;
    gap: 4px;
  }

  .item-label {
    font-size: 10px;
  }

  .icon-minimal,
  .circle-icon-box,
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

  .mobile-top-dock {
    position: absolute;
    top: 0;
    left: calc(50% + 22px);
    width: min(calc(100vw - 54px), 620px);
  }

  .mobile-top-nav-item span {
    display: none;
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
    background: var(--menu-mobile-chip-bg);
    box-shadow: inset 0 0 0 1px var(--menu-mobile-chip-border);
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
    background: var(--menu-mobile-chip-bg);
    box-shadow: inset 0 0 0 1px var(--menu-mobile-chip-border);
  }

  .theme-control-cluster {
    width: 64px;
    min-width: 64px;
    border-radius: 999px;
  }

  .theme-toggle-action {
    margin-left: 8px;
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
    display: none;
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

@media (prefers-reduced-motion: reduce) {
  .fixed-nav-wrapper,
  .top-bar,
  .toggle-tab,
  .bar-line,
  .menu-label-text,
  .menu-item-stack,
  .icon-minimal,
  .circle-icon-box,
  .pill-btn-box,
  .author-avatar-box,
  .avatar-box {
    animation: none !important;
    transition-duration: 0.01ms !important;
    transition-delay: 0s !important;
  }
}
</style>
