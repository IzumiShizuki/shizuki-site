<template>
  <aside class="author-route-sidebar liquid-material" :class="{ 'is-public': publicMode, 'is-workspace': workspace }">
    <section v-if="showProfile || (compactProfile && hasCompactIdentity)" class="author-profile-summary" :class="{ 'is-compact': compactProfile, 'without-avatar': !hero.avatarUrl }" aria-label="作者资料与统计">
      <img v-if="hero.avatarUrl" class="author-profile-avatar" :src="hero.avatarUrl" :alt="hero.name || '作者头像'" />
      <div class="author-profile-copy">
        <span>ABOUT THE AUTHOR</span>
        <h2 v-if="hero.name">{{ hero.name }}</h2>
        <p v-if="identity.role || identity.major">{{ identity.role || identity.major }}</p>
      </div>
      <dl v-if="!compactProfile" class="author-profile-stats">
        <div v-for="stat in profileStats" :key="stat.label">
          <dt>{{ stat.label }}</dt>
          <dd>{{ stat.value }}</dd>
        </div>
      </dl>
      <div v-if="!compactProfile && identity.labels?.length" class="author-profile-labels" aria-label="作者标签">
        <span v-for="label in identity.labels.slice(0, 4)" :key="label">{{ label }}</span>
      </div>
    </section>

    <header class="author-route-heading">
      <span class="author-route-mark" aria-hidden="true">
        <i class="fas fa-compass"></i>
      </span>
      <span class="author-route-heading-copy">
        <strong>{{ heading }}</strong>
        <small>{{ description || (adminUser ? '浏览与管理' : '浏览站点内容') }}</small>
      </span>
    </header>

    <button
      v-if="adminUser && studioKey"
      class="author-studio-entry ripple-trigger"
      type="button"
      @click="$emit('select', publicMode ? studioKey : 'about')"
    >
      <i :class="publicMode ? 'fas fa-pen-ruler' : 'fas fa-arrow-left'" aria-hidden="true"></i>
      {{ publicMode ? '内容工作台' : '返回作者主页' }}
      <i v-if="publicMode" class="fas fa-arrow-right" aria-hidden="true"></i>
    </button>
    <RouteDotRail
      class="sidebar-route-menu"
      :items="items"
      :active-key="activeKey"
      variant="menu"
      :aria-label="ariaLabel"
      @select="$emit('select', $event)"
    />
    <nav v-if="compactProfile" class="author-public-paths" aria-label="公开路径">
      <RouterLink :to="{ name: 'blog' }"><i class="fas fa-feather-pointed" aria-hidden="true"></i> 博客</RouterLink>
      <RouterLink to="/music-library/music"><i class="fas fa-music" aria-hidden="true"></i> 音乐</RouterLink>
      <RouterLink to="/apps"><i class="fas fa-grip" aria-hidden="true"></i> 轻应用</RouterLink>
    </nav>
    <PublicPostCalendar
      v-if="compactProfile"
      @select="$emit('select-date', $event)"
    />
  </aside>
</template>

<script setup>
import { computed } from 'vue';
import RouteDotRail from '../common/RouteDotRail.vue';
import PublicPostCalendar from '../blog/PublicPostCalendar.vue';

const props = defineProps({
  items: {
    type: Array,
    default: () => []
  },
  activeKey: {
    type: String,
    default: ''
  },
  adminUser: {
    type: Boolean,
    default: false
  },
  studioKey: { type: String, default: '' },
  publicMode: {
    type: Boolean,
    default: false
  },
  workspace: {
    type: Boolean,
    default: false
  },
  showProfile: {
    type: Boolean,
    default: false
  },
  compactProfile: {
    type: Boolean,
    default: false
  },
  heading: {
    type: String,
    default: '站点导航'
  },
  description: {
    type: String,
    default: ''
  },
  ariaLabel: {
    type: String,
    default: '关于网站导航'
  },
  profile: {
    type: Object,
    default: () => ({ profileJson: {} })
  }
});

defineEmits(['select', 'select-date']);

const profileJson = computed(() => props.profile?.profileJson || {});
const hero = computed(() => profileJson.value.hero || {});
const identity = computed(() => profileJson.value.identity || {});
const hasCompactIdentity = computed(() => Boolean(hero.value.name || hero.value.avatarUrl || identity.value.role || identity.value.major));
const profileStats = computed(() => [
  { label: '建站节点', value: Array.isArray(profileJson.value.journey) ? profileJson.value.journey.length : 0 },
  { label: '技能方向', value: Array.isArray(profileJson.value.skills) ? profileJson.value.skills.length : 0 },
  { label: '公开状态', value: props.profile?.enabled === false ? '暂停' : '在线' }
]);
</script>

<style scoped>
.author-route-sidebar {
  --liquid-bg: var(--theme-panel-surface);
  --liquid-border: var(--theme-border);
  --liquid-shadow: var(--theme-shadow-soft);
  position: relative;
  z-index: 6;
  width: 100%;
  height: 100%;
  min-width: 0;
  min-height: 0;
  display: flex;
  flex-direction: column;
  gap: 12px;
  padding: 13px 10px 10px;
  overflow: hidden;
  border-radius: 16px;
}

.author-route-sidebar.is-public {
  height: auto;
  overflow: visible;
}

.author-route-sidebar.is-public.is-workspace {
  height: 100%;
  overflow: hidden;
}

.author-profile-summary {
  display: grid;
  grid-template-columns: 58px minmax(0, 1fr);
  gap: 12px;
  padding: 6px 5px 14px;
  border-bottom: 1px solid var(--theme-border);
}

.author-profile-summary.is-compact { grid-template-columns: 46px minmax(0, 1fr); padding-bottom: 9px; }
.author-profile-summary.without-avatar { grid-template-columns: minmax(0, 1fr); }
.author-profile-summary.is-compact .author-profile-avatar { width: 46px; height: 46px; border-radius: 15px; }
.author-profile-summary.is-compact .author-profile-copy h2 { font-size: 15px; }
.author-profile-summary.is-compact .author-profile-copy p { font-size: 10px; }

.author-profile-avatar {
  width: 58px;
  height: 58px;
  grid-row: span 2;
  display: block;
  object-fit: cover;
  border: 1px solid var(--theme-border-strong);
  border-radius: 19px;
  background: var(--theme-surface-soft);
  box-shadow: var(--shadow-sm);
}

.author-profile-copy {
  min-width: 0;
  display: grid;
  align-content: center;
  gap: 2px;
}

.author-profile-copy span {
  color: rgb(var(--accent-readable-rgb));
  font-size: 9px;
  font-weight: 760;
  letter-spacing: 0.12em;
}

.author-profile-copy h2,
.author-profile-copy p {
  overflow: hidden;
  margin: 0;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.author-profile-copy h2 {
  color: var(--theme-text-primary);
  font-size: 17px;
}

.author-profile-copy p {
  color: var(--theme-text-secondary);
  font-size: 11px;
}

.author-profile-stats {
  grid-column: 1 / -1;
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 6px;
  margin: 0;
}

.author-profile-stats div {
  min-width: 0;
  display: grid;
  gap: 3px;
  padding: 8px 5px;
  border: 1px solid var(--theme-border-subtle);
  border-radius: 10px;
  background: var(--theme-panel-surface-elevated);
  text-align: center;
}

.author-profile-stats dt {
  overflow: hidden;
  color: var(--theme-text-tertiary, var(--theme-text-secondary));
  font-size: 9px;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.author-profile-stats dd {
  margin: 0;
  color: var(--theme-text-primary);
  font-size: 12px;
  font-weight: 750;
}

.author-profile-labels {
  grid-column: 1 / -1;
  display: flex;
  flex-wrap: wrap;
  gap: 5px;
}

.author-profile-labels span {
  padding: 3px 7px;
  border-radius: 999px;
  color: var(--theme-text-secondary);
  background: rgba(var(--accent-rgb), 0.1);
  font-size: 9px;
}

.author-route-heading {
  display: grid;
  grid-template-columns: 34px minmax(0, 1fr);
  align-items: center;
  gap: 9px;
  min-height: 46px;
  padding: 2px 5px 11px;
  border-bottom: 1px solid var(--theme-border);
}

.author-route-mark {
  width: 34px;
  height: 34px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  border-radius: 11px;
  color: var(--accent-surface-text);
  background: var(--accent-mode-fill-strong);
  box-shadow: inset 0 0 0 1px rgba(var(--accent-soft-rgb), 0.34);
}

.author-route-heading-copy {
  min-width: 0;
  display: grid;
  gap: 2px;
}

.author-route-heading-copy strong {
  overflow: hidden;
  color: var(--theme-text-primary);
  font-size: 14px;
  letter-spacing: 0.02em;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.author-route-heading-copy small {
  color: var(--theme-text-secondary);
  font-size: 10px;
  letter-spacing: 0.08em;
}

.sidebar-route-menu {
  flex: 1;
  min-width: 0;
  min-height: 0;
  padding-right: 3px;
  overflow-x: hidden;
  overflow-y: auto;
  scrollbar-width: thin;
  scrollbar-color: var(--theme-border-strong) transparent;
}

.author-studio-entry {
  display: flex;
  align-items: center;
  gap: 9px;
  flex-shrink: 0;
  min-height: 40px;
  padding: 9px 12px;
  border: 1px solid var(--theme-border-strong);
  border-radius: 11px;
  color: var(--theme-text-primary);
  background: var(--theme-panel-surface-elevated);
  font: inherit;
  font-size: 12px;
  font-weight: 650;
  cursor: pointer;
}
.author-studio-entry .fa-arrow-right { margin-left: auto; }
.author-studio-entry:hover { background: rgba(var(--accent-rgb), 0.16); }
.author-studio-entry:focus-visible { outline: 2px solid rgb(var(--accent-rgb)); outline-offset: 3px; }

.is-public .sidebar-route-menu {
  height: auto;
  overflow: visible;
}

.is-public.is-workspace .sidebar-route-menu {
  flex: 1;
  min-height: 0;
  overflow-x: hidden;
  overflow-y: auto;
}

.author-public-paths {
  display: grid;
  gap: 5px;
  padding-top: 9px;
  border-top: 1px solid var(--theme-border);
}
.author-public-paths a {
  display: flex;
  align-items: center;
  gap: 7px;
  min-height: 28px;
  padding: 0 6px;
  border-radius: 8px;
  color: var(--theme-text-secondary);
  font-size: 11px;
  text-decoration: none;
}
.author-public-paths a:focus-visible { outline: 2px solid rgb(var(--accent-readable-rgb)); outline-offset: 2px; }

.sidebar-route-menu::-webkit-scrollbar {
  width: 5px;
}

.sidebar-route-menu::-webkit-scrollbar-track {
  background: transparent;
}

.sidebar-route-menu::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(var(--accent-rgb), 0.34);
}

@container author-page (max-width: 1100px) {
  .author-route-sidebar:not(.is-public) {
    width: 100%;
    min-height: auto;
    height: auto;
    padding: 10px 12px;
    overflow: hidden;
  }

  .author-route-heading {
    min-height: 40px;
    padding-bottom: 9px;
  }

  .sidebar-route-menu {
    flex: none;
    width: 100%;
    padding-right: 0;
    overflow: visible;
  }
}
</style>
