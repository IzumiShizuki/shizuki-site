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
    <div
      class="top-bar"
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
    </div>

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
  /* Warm & Cozy Theme Variables */
  --menu-glass-bg: var(--glass-bg-gradient), var(--glass-bg-warm);
  --menu-glass-border: var(--glass-border);
  --menu-glass-shadow: var(--shadow-lg);
  --menu-hover-bg: var(--interactive-hover);
  --menu-active-bg: var(--accent-fill-strong);
  --menu-active-border: var(--accent-border-strong);
  --menu-active-shadow: var(--shadow-accent-md);
  --menu-icon-color: var(--icon-primary);
  --menu-mobile-chip-bg: var(--surface-soft);
  --menu-mobile-chip-border: var(--border-base);
  --icon-hover-color: var(--accent-soft);
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

/* ========================================
   Main Navigation Shell - Floating Card
   ======================================== */

.fixed-nav-wrapper {
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 800;
  display: flex;
  flex-direction: column;
  align-items: center;
  transform: translateY(var(--space-4));
  transition: transform var(--duration-base) var(--ease-smooth);
}

.fixed-nav-wrapper.expanded {
  transform: translateY(var(--space-4));
}

.fixed-nav-wrapper.compact {
  transform: translateY(var(--space-2));
}

/* Top Bar - Rounded Floating Card */
.top-bar {
  overflow: visible;
  width: 96%;
  max-width: 1400px;
  min-height: 72px;
  border-radius: var(--radius-3xl);
  padding: var(--space-3) var(--space-8);
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: var(--space-6);
  opacity: 1;
  visibility: visible;
  transform: translate3d(0, 0, 0) scale(1);
  transform-origin: 50% 0;
  scrollbar-color: var(--theme-border-strong) transparent;
  transition:
    opacity var(--duration-fast) var(--ease-out),
    transform var(--duration-base) var(--ease-smooth),
    visibility 0s linear 0s;
  will-change: transform, opacity;
  z-index: 2;

  /* Enhanced glass morphism */
  background:
    var(--gradient-glow),
    var(--glass-bg-gradient),
    var(--surface-elevated);
  border: 1px solid var(--glass-border-strong);
  box-shadow:
    var(--shadow-xl),
    var(--glass-highlight),
    var(--glass-shadow);
  backdrop-filter: var(--glass-backdrop);
  -webkit-backdrop-filter: var(--glass-backdrop);
}

.fixed-nav-wrapper.compact .top-bar {
  opacity: 0;
  visibility: hidden;
  transform: translate3d(0, -12px, 0) scale(0.98);
  transition-delay: 0s, 0s, var(--duration-base);
  pointer-events: none;
}

/* ========================================
   Navigation Sections
   ======================================== */

.nav-section {
  display: flex;
  align-items: center;
  gap: var(--space-3);
}

.nav-section.center {
  justify-content: center;
  flex: 1;
  gap: var(--space-10);
}

.nav-section.left {
  gap: var(--space-4);
}

.nav-section.right {
  gap: var(--space-5);
}

/* ========================================
   Left Main Navigation - Pill Group
   ======================================== */

.left-pill-group {
  --pill-gap: var(--space-2);
  --pill-item-width: 110px;
  --pill-padding-x: var(--space-3);

  border-radius: var(--radius-full);
  min-width: 0;
  padding: var(--space-1) var(--pill-padding-x);
  display: flex;
  gap: var(--pill-gap);
  justify-content: flex-start;
  align-items: center;
  min-height: 56px;
  position: relative;

  /* Subtle inner glow */
  background:
    linear-gradient(135deg,
      rgba(var(--accent-rgb), 0.04),
      transparent 50%),
    var(--surface-soft);
  border: 1px solid var(--border-base);
  box-shadow: var(--shadow-inner);
}

.left-pill-group::before {
  display: none;
}

.left-main-btn {
  width: var(--pill-item-width);
  min-height: 48px;
  padding: 0 var(--space-4);
  border-radius: var(--radius-full);
  flex-direction: row;
  gap: var(--space-2);
  z-index: 1;
  position: relative;
  transition:
    background-color var(--duration-base) var(--ease-smooth),
    border-color var(--duration-base) var(--ease-smooth),
    box-shadow var(--duration-base) var(--ease-smooth),
    color var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth);
}

.left-main-btn:hover {
  background: var(--interactive-hover);
  transform: translateY(-1px);
}

.left-main-btn.active {
  background:
    linear-gradient(135deg,
      rgba(var(--accent-rgb), 0.28) 0%,
      rgba(var(--accent-rgb), 0.18) 100%);
  border: 1px solid var(--accent-border);
  box-shadow:
    var(--shadow-accent-sm),
    var(--glow-soft),
    inset 0 1px 0 rgba(255, 255, 255, 0.15);
  transform: translateY(-2px) scale(1.02);
}

.left-main-btn[role='button']:focus-visible {
  outline: 2px solid var(--accent-base);
  outline-offset: 3px;
  box-shadow: 0 0 0 4px rgba(var(--accent-rgb), 0.2);
}

/* ========================================
   Icons - Smooth & Warm
   ======================================== */

.icon-minimal {
  font-size: var(--text-lg);
  color: var(--icon-primary);
  height: 36px;
  width: 36px;
  display: flex;
  align-items: center;
  justify-content: center;
  transition:
    color var(--duration-fast) var(--ease-smooth),
    opacity var(--duration-fast) var(--ease-smooth),
    transform var(--duration-fast) var(--ease-smooth);
  border-radius: var(--radius-full);
  position: relative;
}

.icon-minimal::before {
  content: '';
  position: absolute;
  inset: -2px;
  border-radius: inherit;
  background: var(--accent-fill);
  opacity: 0;
  transition: opacity var(--duration-fast) var(--ease-smooth);
  z-index: -1;
}

.icon-minimal:hover {
  transform: scale(1.12) translateY(-2px);
  color: var(--accent-soft);
}

.icon-minimal:hover::before {
  opacity: 1;
}

.left-main-btn.active .icon-minimal {
  color: var(--accent-surface-text);
  transform: scale(1.08);
  text-shadow: var(--accent-surface-text-shadow);
}

.left-main-btn.active .item-label {
  display: block;
  font-weight: var(--font-weight-semibold);
  color: var(--accent-surface-text);
  text-shadow: var(--accent-surface-text-shadow);
}

.item-label {
  display: none;
  font-size: var(--text-sm);
  font-weight: var(--font-weight-semibold);
  letter-spacing: 0.02em;
  transition: color var(--duration-fast) var(--ease-smooth);
}

.left-main-btn .item-label,
.author-info-item .item-label {
  display: block;
}

/* ========================================
   Center Circle Buttons - Enhanced
   ======================================== */

.circle-icon-box {
  width: 52px;
  height: 52px;
  border-radius: var(--radius-full);
  position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: var(--text-lg);
  color: var(--icon-primary);
  transition:
    background-color var(--duration-base) var(--ease-smooth),
    border-color var(--duration-base) var(--ease-smooth),
    box-shadow var(--duration-base) var(--ease-smooth),
    color var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth);

  /* Subtle elevation */
  background: var(--surface-soft);
  border: 1px solid var(--border-base);
  box-shadow: var(--shadow-sm);
}

.circle-icon-box::before {
  content: '';
  position: absolute;
  inset: 0;
  border-radius: inherit;
  background: var(--gradient-warm);
  opacity: 0;
  transition: opacity var(--duration-base) var(--ease-smooth);
}

.circle-icon-box i {
  position: relative;
  z-index: 1;
}

.circle-icon-box:hover {
  transform: translateY(-4px) scale(1.05);
  box-shadow: var(--shadow-md);
  border-color: var(--border-strong);
}

.circle-icon-box:hover::before {
  opacity: 1;
}

.circle-icon-box:hover i {
  color: var(--accent-soft);
}

.menu-item-stack.active .circle-icon-box {
  background: var(--accent-fill-strong);
  border-color: var(--accent-border);
  box-shadow:
    var(--shadow-accent-md),
    var(--glow-sm);
  transform: scale(1.08);
}

.menu-item-stack.active .circle-icon-box i {
  color: var(--accent-surface-text);
}

.menu-item-stack.active .circle-icon-box i {
  color: var(--accent-surface-text);
}

.menu-item-stack.active .item-label {
  color: var(--accent-soft);
  font-weight: var(--font-weight-semibold);
}

/* Menu Hub Status Indicators */
.menu-hub-box {
  overflow: visible;
}

.menu-status-stack {
  position: absolute;
  bottom: 6px;
  left: 50%;
  transform: translateX(-50%);
  display: inline-flex;
  gap: 5px;
  pointer-events: none;
}

.menu-status-dot {
  width: 6px;
  height: 6px;
  border-radius: var(--radius-full);
  background: var(--surface-soft);
  border: 1px solid var(--border-subtle);
  transition:
    background-color var(--duration-fast) var(--ease-smooth),
    border-color var(--duration-fast) var(--ease-smooth),
    box-shadow var(--duration-fast) var(--ease-smooth),
    transform var(--duration-fast) var(--ease-smooth);
}

.menu-status-dot.active {
  background: var(--accent-base);
  border-color: var(--accent-strong);
  box-shadow: var(--glow-sm);
  transform: scale(1.2);
}

/* ========================================
   AI Chat Pill Button
   ======================================== */

.pill-btn-box {
  min-width: 52px;
  height: 52px;
  padding: 0 var(--space-4);
  border-radius: var(--radius-full);
  position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: var(--space-2);
  font-size: var(--text-sm);
  font-weight: var(--font-weight-semibold);
  color: var(--text-primary);
  transition:
    background-color var(--duration-base) var(--ease-smooth),
    border-color var(--duration-base) var(--ease-smooth),
    box-shadow var(--duration-base) var(--ease-smooth),
    color var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth);

  background: var(--surface-soft);
  border: 1px solid var(--border-base);
  box-shadow: var(--shadow-sm);
}

.pill-btn-box > span:not(.ai-chat-dot) {
  display: inline;
}

.pill-btn-box i {
  color: var(--icon-primary);
  font-size: var(--text-lg);
}

.menu-item-stack:hover .pill-btn-box {
  background: var(--interactive-hover);
  border-color: var(--border-strong);
  transform: translateY(-3px);
  box-shadow: var(--shadow-md);
}

.pill-btn-box:hover i {
  color: var(--accent-soft);
}

.ai-chat-item.disabled {
  cursor: not-allowed;
  opacity: 0.5;
}

.ai-chat-item.disabled .pill-btn-box {
  background: var(--surface-soft);
  color: var(--text-disabled);
}

.ai-chat-item.disabled:hover .pill-btn-box,
.ai-chat-item.disabled .pill-btn-box:hover {
  transform: none;
  box-shadow: var(--shadow-sm);
}

.ai-chat-dot {
  position: absolute;
  top: 8px;
  right: 10px;
  width: 10px;
  height: 10px;
  border-radius: var(--radius-full);
  border: 2px solid var(--surface-elevated);
  background: transparent;
  transition:
    background-color var(--duration-fast) var(--ease-smooth),
    border-color var(--duration-fast) var(--ease-smooth),
    box-shadow var(--duration-fast) var(--ease-smooth);
}

.ai-chat-dot.active {
  background: var(--accent-base);
  border-color: var(--accent-base);
  box-shadow: var(--glow-sm);
}

/* ========================================
   Avatar Buttons - Warm & Inviting
   ======================================== */

.author-info-item,
.user-profile-item {
  border-radius: var(--radius-lg);
  padding: var(--space-1) var(--space-2) var(--space-2);
  transition:
    background-color var(--duration-base) var(--ease-smooth),
    border-color var(--duration-base) var(--ease-smooth),
    box-shadow var(--duration-base) var(--ease-smooth),
    color var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth);
}

button.author-info-item {
  border: 0;
  color: inherit;
  background: transparent;
  font: inherit;
}

button.author-info-item:focus-visible {
  outline: 2px solid var(--accent-base);
  outline-offset: 3px;
  box-shadow: 0 0 0 4px rgba(var(--accent-rgb), 0.2);
}

.author-avatar-box {
  width: 48px;
  height: 48px;
  border-radius: var(--radius-full);
  overflow: hidden;
  background: var(--surface-elevated);
  border: 2px solid var(--border-strong);
  box-shadow: var(--shadow-sm);
  transition:
    border-color var(--duration-base) var(--ease-smooth),
    box-shadow var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth);
}

.author-avatar-image {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.author-info-item:hover .author-avatar-box {
  transform: translateY(-3px) scale(1.06);
  border-color: var(--accent-border);
  box-shadow: var(--shadow-accent-sm);
}

.author-info-item.route-active .author-avatar-box {
  transform: scale(1.06);
  border-color: var(--accent-border-strong);
  box-shadow:
    var(--shadow-accent-md),
    var(--glow-sm);
}

.avatar-box {
  width: 48px;
  height: 48px;
  border-radius: var(--radius-full);
  border: 2px solid var(--border-strong);
  position: relative;
  overflow: hidden;
  background: var(--surface-elevated);
  transition:
    border-color var(--duration-base) var(--ease-smooth),
    box-shadow var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth);
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
  border-color: var(--border-base);
  color: var(--icon-secondary);
  font-size: var(--text-md);
  background: var(--surface-soft);
}

.avatar-box.anonymous::after {
  display: none;
}

.avatar-box::after {
  content: '';
  position: absolute;
  top: 2px;
  right: 2px;
  width: 12px;
  height: 12px;
  background: var(--accent-base);
  border: 2px solid var(--surface-elevated);
  border-radius: var(--radius-full);
  box-shadow: var(--glow-sm);
}

.user-profile-item.route-active .avatar-box {
  border-color: var(--accent-border-strong);
  box-shadow: var(--shadow-accent-md);
}

.author-info-item.route-active,
.user-profile-item.route-active {
  background: var(--accent-fill);
  border: 1px solid var(--accent-border);
  border-radius: var(--radius-xl);
}

.author-info-item.route-active .item-label,
.user-profile-item.route-active .item-label {
  color: var(--accent-soft);
  font-weight: var(--font-weight-semibold);
}

/* ========================================
   Menu Item Stack Base
   ======================================== */

.menu-item-stack {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: var(--space-2);
  cursor: pointer;
  opacity: 1;
  transition: opacity var(--duration-fast) var(--ease-out);
  position: relative;
}

.menu-item-stack:not(.theme-control-cluster):active .icon-minimal,
.menu-item-stack:not(.theme-control-cluster):active .circle-icon-box,
.menu-item-stack:not(.theme-control-cluster):active .author-avatar-box,
.menu-item-stack:not(.theme-control-cluster):active .avatar-box,
.menu-item-stack.ai-chat-item:active .pill-btn-box {
  transform: scale(0.96);
}

.fixed-nav-wrapper:not(.expanded) .menu-item-stack {
  opacity: 0;
  pointer-events: none;
}

.fixed-nav-wrapper.expanded .menu-item-stack {
  opacity: 1;
  pointer-events: auto;
}

/* ========================================
   Toggle Tab - Collapsible Button
   ======================================== */

.toggle-tab {
  width: 140px;
  height: 36px;
  border-bottom-left-radius: var(--radius-xl);
  border-bottom-right-radius: var(--radius-xl);
  margin-top: -2px;
  box-shadow: var(--shadow-md);
  display: flex;
  cursor: pointer;
  justify-content: center;
  align-items: flex-end;
  padding-bottom: var(--space-2);
  transition:
    background-color var(--duration-base) var(--ease-smooth),
    border-color var(--duration-base) var(--ease-smooth),
    box-shadow var(--duration-base) var(--ease-smooth),
    color var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth);
  z-index: 1001;
  border: 0;
  color: inherit;

  background:
    var(--glass-bg-gradient),
    var(--surface-elevated);
  border-left: 1px solid var(--glass-border);
  border-right: 1px solid var(--glass-border);
  border-bottom: 1px solid var(--glass-border);
  backdrop-filter: var(--glass-backdrop);
  -webkit-backdrop-filter: var(--glass-backdrop);
}

.toggle-tab:focus-visible {
  outline: 2px solid var(--accent-base);
  outline-offset: 3px;
  box-shadow: 0 0 0 4px rgba(var(--accent-rgb), 0.2);
}

.fixed-nav-wrapper.manual-collapsed {
  transform: translateY(0);
}

.fixed-nav-wrapper.manual-collapsed .top-bar {
  opacity: 0;
  visibility: hidden;
  transform: translate3d(0, -12px, 0) scale(0.98);
  transition-delay: 0s, 0s, var(--duration-base);
  pointer-events: none;
}

.fixed-nav-wrapper.manual-collapsed .toggle-tab {
  width: 120px;
  height: 44px;
  margin-top: 0;
  padding-bottom: 0;
  align-items: center;
  justify-content: center;
  border-radius: 0 0 var(--radius-xl) var(--radius-xl);
  background: var(--surface-elevated);
  border: 1px solid var(--border-strong);
  border-top: 0;
  box-shadow: var(--shadow-lg);
}

.fixed-nav-wrapper.compact .toggle-tab {
  width: 120px;
  height: 48px;
  margin-top: 0;
  padding-bottom: 0;
  align-items: center;
  border-radius: var(--radius-full);
  box-shadow: var(--shadow-xl);
}

.toggle-tab:hover {
  background: var(--interactive-hover);
  box-shadow: var(--shadow-lg);
}

.toggle-tab:active {
  background: var(--interactive-active);
  transform: scale(0.98);
}

.switch-content {
  position: relative;
  width: 60px;
  height: 18px;
  display: flex;
  align-items: center;
  justify-content: center;
}

.bar-line {
  position: absolute;
  background: var(--text-primary);
  height: 2.5px;
  width: 24px;
  border-radius: var(--radius-xs);
  transition:
    background-color var(--duration-base) var(--ease-smooth),
    height var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth),
    width var(--duration-base) var(--ease-smooth);
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.3);
}

.bar-line.top {
  transform: translateY(-7px);
}

.bar-line.bottom {
  transform: translateY(7px);
}

.menu-label-text {
  font-size: var(--text-xs);
  font-weight: var(--font-weight-bold);
  color: var(--text-primary);
  letter-spacing: 0.08em;
  transition:
    color var(--duration-fast) var(--ease-smooth),
    filter var(--duration-fast) var(--ease-smooth),
    opacity var(--duration-fast) var(--ease-smooth),
    transform var(--duration-fast) var(--ease-smooth);
  text-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);
}

.fixed-nav-wrapper.expanded .bar-line.top {
  transform: translateY(0) rotate(135deg);
  width: 20px;
}

.fixed-nav-wrapper.expanded .bar-line.bottom {
  transform: translateY(0) rotate(-135deg);
  width: 20px;
}

.fixed-nav-wrapper.expanded .menu-label-text {
  transform: scale(0.6);
  opacity: 0;
  filter: blur(2px);
}

/* ========================================
   Theme Toggle Control
   ======================================== */

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
  gap: var(--space-2);
  background: transparent;
  color: inherit;
  font: inherit;
  cursor: pointer;
}

.theme-toggle-action:active .theme-toggle-box {
  transform: scale(0.96);
}

.theme-toggle-action:focus-visible {
  outline: 0;
}

.theme-toggle-action:focus-visible .theme-toggle-box {
  outline: 2px solid var(--accent-base);
  outline-offset: 3px;
  box-shadow: 0 0 0 4px rgba(var(--accent-rgb), 0.2);
}

.theme-toggle-box {
  overflow: hidden;
  position: relative;
}

.theme-toggle-box::before {
  content: '';
  position: absolute;
  inset: 6px;
  border-radius: var(--radius-full);
  opacity: 0;
  background: transparent;
  transition:
    background-color var(--duration-base) var(--ease-smooth),
    opacity var(--duration-base) var(--ease-smooth);
}

.theme-toggle-box i {
  position: relative;
  z-index: 1;
  transition: color var(--duration-base) var(--ease-smooth);
}

.theme-toggle-box:hover::before {
  opacity: 1;
  background: var(--gradient-warm);
}

/* ========================================
   Appearance Popover - Refined
   ======================================== */

.appearance-popover {
  --liquid-bg: var(--surface-elevated);
  --liquid-border: var(--border-strong);
  --liquid-shadow: var(--shadow-xl);

  position: absolute;
  top: calc(100% + var(--space-5));
  left: 50%;
  width: 300px;
  padding: var(--space-5);
  border-radius: var(--radius-2xl);
  display: grid;
  gap: var(--space-4);
  transform: translateX(-50%);
  color: var(--text-primary);
  text-align: left;
  cursor: default;
  z-index: 20;

  background:
    var(--gradient-glow),
    var(--glass-bg-gradient),
    var(--surface-elevated);
  border: 1px solid var(--glass-border-strong);
  box-shadow:
    var(--shadow-2xl),
    var(--glass-highlight);
  backdrop-filter: var(--glass-backdrop);
  -webkit-backdrop-filter: var(--glass-backdrop);
}

.appearance-popover.home-entry-popover {
  left: 150px;
}

.appearance-popover.home-entry-popover::before {
  left: 76px;
}

.appearance-popover::before {
  content: '';
  position: absolute;
  top: -8px;
  left: 50%;
  width: 16px;
  height: 16px;
  border-top: 1px solid var(--glass-border-strong);
  border-left: 1px solid var(--glass-border-strong);
  background: var(--surface-elevated);
  transform: translateX(-50%) rotate(45deg);
  backdrop-filter: var(--glass-backdrop);
  -webkit-backdrop-filter: var(--glass-backdrop);
}

.appearance-popover-head,
.appearance-group {
  display: grid;
}

.appearance-popover-head {
  gap: var(--space-1);
}

.appearance-popover-head small {
  margin-top: var(--space-1);
  color: var(--text-tertiary);
  font-size: var(--text-xs);
  line-height: var(--line-height-relaxed);
}

.appearance-popover-head span,
.appearance-label {
  color: var(--text-tertiary);
  font-size: var(--text-xs);
  font-weight: var(--font-weight-bold);
  letter-spacing: 0.12em;
}

.appearance-popover-head strong {
  font-size: var(--text-lg);
  font-weight: var(--font-weight-bold);
  color: var(--accent-soft);
}

.appearance-group {
  gap: var(--space-2);
}

.appearance-group small {
  color: var(--text-tertiary);
  font-size: var(--text-xs);
  line-height: var(--line-height-relaxed);
}

.appearance-color-control {
  min-height: 40px;
  padding: var(--space-2) var(--space-3);
  border: 1px solid var(--border-base);
  border-radius: var(--radius-lg);
  display: flex;
  align-items: center;
  gap: var(--space-3);
  background: var(--surface-soft);
  color: var(--text-secondary);
  font-size: var(--text-sm);
  cursor: pointer;
  transition:
    background-color var(--duration-fast) var(--ease-smooth),
    border-color var(--duration-fast) var(--ease-smooth),
    color var(--duration-fast) var(--ease-smooth),
    box-shadow var(--duration-fast) var(--ease-smooth);
}

.appearance-color-control:hover {
  border-color: var(--border-strong);
  background: var(--interactive-hover);
}

.appearance-color-control input {
  width: 32px;
  height: 28px;
  padding: 0;
  border: 0;
  border-radius: var(--radius-md);
  background: transparent;
  cursor: pointer;
}

.appearance-segment {
  padding: var(--space-1);
  border: 1px solid var(--border-base);
  border-radius: var(--radius-lg);
  display: grid;
  gap: var(--space-1);
  background: var(--surface-soft);
}

.appearance-segment-two {
  grid-template-columns: repeat(2, minmax(0, 1fr));
}

.appearance-segment-three {
  grid-template-columns: repeat(3, minmax(0, 1fr));
}

.appearance-segment button {
  min-height: 36px;
  border: 0;
  border-radius: var(--radius-md);
  display: inline-flex;
  align-items: center;
  justify-content: center;
  gap: var(--space-2);
  background: transparent;
  color: var(--text-secondary);
  font: inherit;
  font-size: var(--text-sm);
  font-weight: var(--font-weight-medium);
  cursor: pointer;
  transition:
    background-color var(--duration-fast) var(--ease-smooth),
    border-color var(--duration-fast) var(--ease-smooth),
    color var(--duration-fast) var(--ease-smooth),
    box-shadow var(--duration-fast) var(--ease-smooth),
    transform var(--duration-fast) var(--ease-smooth);
}

.appearance-segment button:hover {
  background: var(--interactive-hover);
  color: var(--text-primary);
  transform: translateY(-1px);
}

.appearance-segment button.active {
  background: var(--accent-fill-strong);
  color: var(--accent-surface-text);
  box-shadow:
    inset 0 0 0 1px var(--accent-border),
    var(--shadow-accent-sm);
  transform: translateY(-1px);
}

.appearance-segment button:active {
  transform: scale(0.97);
}

.appearance-segment button:focus-visible {
  outline: 2px solid var(--accent-base);
  outline-offset: 2px;
}

.appearance-popover-enter-active,
.appearance-popover-leave-active {
  transition:
    opacity var(--duration-base) var(--ease-smooth),
    transform var(--duration-base) var(--ease-smooth);
}

.appearance-popover-enter-from,
.appearance-popover-leave-to {
  opacity: 0;
  transform: translateX(-50%) translateY(-10px) scale(0.96);
}

/* ========================================
   Day Mode Overrides
   ======================================== */

:root[data-theme-mode='day'] .top-menu-root {
  --menu-glass-bg:
    linear-gradient(135deg,
      rgba(var(--accent-rgb), 0.05),
      rgba(255, 255, 255, 0.60)),
    var(--glass-bg-gradient);
  --menu-glass-border: var(--glass-border);
  --menu-glass-shadow: var(--shadow-md);
}

:root[data-theme-mode='day'] .top-menu-root :is(.author-avatar-box, .avatar-box) {
  background: var(--surface-base);
  border-color: var(--border-strong);
}

:root[data-theme-mode='day'] .top-menu-root :is(.author-avatar-box, .avatar-box) {
  background: var(--surface-base);
  border-color: var(--border-strong);
}

/* ========================================
   Mobile Top Dock - Refined Pill
   ======================================== */

.mobile-top-dock {
  display: none;
}

/* ========================================
   Responsive Breakpoints
   ======================================== */

/* Medium Desktop (901px - 1180px) */
@media (min-width: 901px) and (max-width: 1180px) {
  .top-bar {
    width: calc(100% - var(--space-5));
    padding: var(--space-3) var(--space-4);
    gap: var(--space-3);
  }

  .nav-section.center {
    flex: 0 0 auto;
    gap: var(--space-8);
  }

  .nav-section.right {
    gap: var(--space-3);
  }

  .left-pill-group {
    --pill-gap: var(--space-1);
    --pill-item-width: 80px;
    --pill-padding-x: var(--space-2);
  }

  .left-main-btn {
    padding-inline: var(--space-2);
    gap: var(--space-1);
  }

  .left-main-btn .item-label,
  .author-info-item .item-label {
    font-size: var(--text-xs);
  }

  .circle-icon-box,
  .pill-btn-box,
  .author-avatar-box,
  .avatar-box {
    width: 44px;
    height: 44px;
  }

  .appearance-popover {
    left: auto;
    right: -100px;
    transform: none;
  }

  .appearance-popover.home-entry-popover {
    right: auto;
    left: 150px;
    transform: translateX(-50%);
  }
}

/* Tablet & Below (max-width: 900px) */
@media (max-width: 900px) {
  .appearance-popover.home-entry-popover {
    display: none;
  }

  .mobile-top-dock {
    --liquid-fill: var(--glass-bg-gradient), var(--surface-elevated);
    --liquid-border: var(--glass-border-strong);
    --liquid-shadow: var(--shadow-lg);

    position: absolute;
    z-index: 12;
    top: 0;
    left: 50%;
    width: min(calc(100vw - var(--space-4)), 680px);
    min-height: 60px;
    padding: var(--space-2);
    border-radius: var(--radius-full);
    display: flex;
    align-items: center;
    gap: var(--space-1);
    overflow-x: auto;
    transform: translateX(-50%);
    pointer-events: auto;
    scrollbar-width: none;

    background:
      var(--gradient-glow),
      var(--glass-bg-gradient),
      var(--surface-elevated);
    border: 1px solid var(--glass-border-strong);
    backdrop-filter: var(--glass-backdrop);
    -webkit-backdrop-filter: var(--glass-backdrop);
  }

  .mobile-top-dock::-webkit-scrollbar {
    display: none;
  }

  .mobile-top-nav-item {
    flex: 1 0 48px;
    min-width: 48px;
    min-height: 48px;
    border: 0;
    border-radius: var(--radius-full);
    padding: 0 var(--space-3);
    display: inline-flex;
    align-items: center;
    justify-content: center;
    gap: var(--space-2);
    color: var(--text-primary);
    background: transparent;
    font: inherit;
    font-size: var(--text-xs);
    font-weight: var(--font-weight-semibold);
    cursor: pointer;
    touch-action: manipulation;
    transition:
      background-color var(--duration-fast) var(--ease-smooth),
      border-color var(--duration-fast) var(--ease-smooth),
      color var(--duration-fast) var(--ease-smooth),
      box-shadow var(--duration-fast) var(--ease-smooth),
      transform var(--duration-fast) var(--ease-smooth);
  }

  .mobile-top-nav-item:hover {
    background: var(--interactive-hover);
  }

  .mobile-top-nav-item.active {
    color: var(--accent-surface-text);
    background: var(--accent-fill-strong);
    border: 1px solid var(--accent-border);
    box-shadow: var(--shadow-accent-sm);
  }

  .mobile-top-nav-item:focus-visible {
    outline: 2px solid var(--accent-base);
    outline-offset: 2px;
  }

  .top-bar {
    opacity: 0;
    visibility: hidden;
    pointer-events: none;
    transform: translate3d(0, -10px, 0) scale(0.98);
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
    transform: translateY(calc(var(--space-20) * -1));
  }

  .fixed-nav-wrapper.expanded {
    transform: translateY(var(--space-2));
  }

  .top-bar {
    width: calc(100% - var(--space-3));
    min-height: 80px;
    border-radius: var(--radius-2xl);
    padding: var(--space-3);
    gap: var(--space-3);
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
    gap: var(--space-3);
  }

  .nav-section.center,
  .nav-section.left,
  .nav-section.right {
    flex: 0 0 auto;
    justify-content: flex-start;
    gap: var(--space-3);
  }

  .secondary-nav {
    display: none;
  }

  .left-pill-group {
    min-width: auto;
    width: auto;
    padding: var(--space-2);
    gap: var(--space-2);
    height: auto;
  }

  .left-main-btn {
    width: auto;
    min-width: 80px;
    min-height: 56px;
    padding: var(--space-2) var(--space-3);
    flex-direction: column;
    gap: var(--space-1);
  }

  .item-label {
    font-size: var(--text-xs);
  }

  .icon-minimal,
  .circle-icon-box,
  .author-avatar-box,
  .avatar-box {
    width: 40px;
    height: 40px;
  }

  .pill-btn-box {
    height: 40px;
    padding: 0 var(--space-3);
    font-size: var(--text-sm);
  }
}

/* Portrait & Small Screens (max-width: 600px) */
@media (max-width: 600px), (orientation: portrait) {
  .top-menu-root {
    --drawer-w: 96px;
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
    left: calc(50% + var(--space-6));
    width: min(calc(100vw - 56px), 620px);
  }

  .mobile-top-nav-item span {
    display: none;
  }

  .top-bar {
    width: var(--drawer-w);
    height: calc(100vh - var(--space-8));
    margin: var(--space-4) 0 var(--space-4) var(--space-2);
    border-radius: var(--radius-2xl);
    padding: var(--space-3) var(--space-1);
    gap: var(--space-2);
    display: flex;
    flex-direction: column;
    justify-content: flex-start;
    overflow-y: auto;
    overflow-x: hidden;
    transform: translateX(calc(-100% + 28px));
    transition: transform var(--duration-slow) var(--ease-smooth);
    pointer-events: auto;
  }

  .fixed-nav-wrapper.expanded .top-bar {
    transform: translateX(0);
  }

  .nav-section {
    width: 100%;
    display: flex;
    flex-direction: column;
    gap: var(--space-2);
    align-items: center;
    justify-content: flex-start;
  }

  .left-pill-group {
    width: 100%;
    min-width: 0;
    padding: var(--space-1);
    height: auto;
    display: flex;
    flex-direction: column;
    gap: var(--space-2);
    align-items: center;
    box-shadow: none;
    background: transparent;
    border: 0;
  }

  .left-main-btn {
    width: 56px;
    height: 56px;
    min-width: 0;
    border-radius: var(--radius-full);
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 0;
    gap: 0;
    background: var(--surface-soft);
    border: 1px solid var(--border-base);
  }

  .menu-item-stack {
    width: 56px;
    min-width: 56px;
    height: 56px;
    min-height: 56px;
    border-radius: var(--radius-full);
    display: flex;
    align-items: center;
    justify-content: center;
    gap: 0;
    background: var(--surface-soft);
    border: 1px solid var(--border-base);
  }

  .theme-control-cluster {
    width: 72px;
    min-width: 72px;
    border-radius: var(--radius-full);
  }

  .theme-toggle-action {
    margin-left: var(--space-2);
  }

  .menu-item-stack.active {
    background: var(--accent-fill-strong);
    border-color: var(--accent-border);
    box-shadow: var(--shadow-accent-sm);
  }

  .item-label {
    display: none !important;
  }

  .icon-minimal {
    width: 28px;
    height: 28px;
    font-size: var(--text-md);
  }

  .circle-icon-box,
  .author-avatar-box,
  .avatar-box {
    width: 28px;
    height: 28px;
    font-size: var(--text-md);
  }

  .pill-btn-box {
    height: 28px;
    min-width: 28px;
    padding: 0;
    justify-content: center;
    border-radius: var(--radius-full);
  }

  .pill-btn-box span {
    display: none;
  }

  .secondary-nav {
    display: grid;
  }

  .toggle-tab {
    display: none;
  }
}

/* Reduced Motion */
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
  .avatar-box,
  .appearance-popover {
    animation: none !important;
    transition-duration: 0.01ms !important;
    transition-delay: 0s !important;
  }
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

/* 手动收起：隐藏 top-bar，只留窄 toggle-tab 吸附顶部（贴顶质感，不占宽度） */
.fixed-nav-wrapper.manual-collapsed {
  transform: translateY(0);
}

.fixed-nav-wrapper.manual-collapsed .top-bar {
  opacity: 0;
  visibility: hidden;
  transform: translate3d(0, -10px, 0) scale(0.985);
  transition-delay: 0s, 0s, var(--dur-base);
  pointer-events: none;
}

.fixed-nav-wrapper.manual-collapsed .toggle-tab {
  --liquid-bg: linear-gradient(155deg, rgba(var(--accent-rgb), 0.12), rgba(15, 14, 22, 0.85) 45%);
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 10px 24px rgba(6, 8, 14, 0.35);
  width: 116px;
  height: 40px;
  margin-top: 0;
  padding-bottom: 0;
  align-items: center;
  justify-content: center;
  border-radius: 0 0 14px 14px;
  border-top: 0;
  background: rgba(15, 14, 22, 0.72);
  backdrop-filter: blur(24px) saturate(160%);
  -webkit-backdrop-filter: blur(24px) saturate(160%);
  box-shadow: inset 0 -1px 0 rgba(255, 255, 255, 0.12), 0 10px 24px rgba(6, 8, 14, 0.35);
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
