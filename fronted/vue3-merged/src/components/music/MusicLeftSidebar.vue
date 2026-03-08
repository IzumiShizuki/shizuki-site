<template>
  <aside class="music-left-sidebar liquid-material" :class="{ mobile: isMobile, 'drawer-open': drawerOpen }">
    <header class="sidebar-head">
      <div class="brand">
        <span class="brand-dot"></span>
        <span class="brand-text">Shizuki Music</span>
      </div>
      <button v-if="isMobile" class="drawer-close ripple-trigger" type="button" @click="emit('close-drawer')">
        <i class="fas fa-xmark"></i>
      </button>
    </header>

    <nav class="nav-block">
      <button
        v-for="item in navItems"
        :key="item.key"
        class="nav-item ripple-trigger"
        :class="{ active: activeNav === item.key }"
        type="button"
        @click="emit('select-nav', item.key)"
      >
        <i :class="item.icon"></i>
        <span>{{ item.label }}</span>
      </button>
    </nav>

    <section class="list-block">
      <h3>我的音乐</h3>
      <button
        v-for="item in corePlaylists"
        :key="item.playlistCode"
        class="list-item ripple-trigger"
        :class="{ selected: selectedPlaylistCode === item.playlistCode }"
        type="button"
        @click="emit('select-playlist', item.playlistCode)"
      >
        <i :class="item.icon || 'fas fa-music'"></i>
        <span>{{ item.name }}</span>
      </button>
    </section>

    <section class="list-block">
      <div class="list-title-row">
        <h3>创建的歌单</h3>
        <button
          v-if="canCreate"
          class="create-btn ripple-trigger"
          type="button"
          title="创建歌单"
          @click="emit('create-playlist')"
        >
          <i class="fas fa-plus"></i>
        </button>
      </div>

      <button
        v-for="item in createdPlaylists"
        :key="item.playlistCode"
        class="list-item ripple-trigger"
        :class="{ selected: selectedPlaylistCode === item.playlistCode }"
        type="button"
        @click="emit('select-playlist', item.playlistCode)"
      >
        <i class="fas fa-record-vinyl"></i>
        <span>{{ item.name }}</span>
      </button>

      <p v-if="!createdPlaylists.length" class="empty-tip">暂无自建歌单</p>
    </section>

    <section class="list-block">
      <h3>收藏的歌单</h3>
      <button
        v-for="item in collectedPlaylists"
        :key="item.playlistCode"
        class="list-item ripple-trigger"
        :class="{ selected: selectedPlaylistCode === item.playlistCode }"
        type="button"
        @click="emit('select-playlist', item.playlistCode)"
      >
        <i class="fas fa-folder-open"></i>
        <span>{{ item.name }}</span>
      </button>

      <p v-if="!collectedPlaylists.length" class="empty-tip">暂无收藏歌单</p>
    </section>
  </aside>
</template>

<script setup>
defineProps({
  navItems: { type: Array, default: () => [] },
  activeNav: { type: String, default: 'recommend' },
  corePlaylists: { type: Array, default: () => [] },
  createdPlaylists: { type: Array, default: () => [] },
  collectedPlaylists: { type: Array, default: () => [] },
  selectedPlaylistCode: { type: String, default: '' },
  canCreate: { type: Boolean, default: false },
  isMobile: { type: Boolean, default: false },
  drawerOpen: { type: Boolean, default: false }
});

const emit = defineEmits(['select-nav', 'select-playlist', 'create-playlist', 'close-drawer']);
</script>

<style scoped>
.music-left-sidebar {
  --liquid-bg: linear-gradient(170deg, rgba(23, 26, 38, 0.78), rgba(20, 22, 32, 0.62));
  --liquid-border: rgba(255, 255, 255, 0.16);
  --liquid-shadow: 0 16px 30px rgba(8, 10, 18, 0.32);
  border-radius: 18px;
  padding: 14px 12px calc(var(--music-bottom-dock-height, 124px) + 10px);
  height: 100%;
  min-height: 0;
  overflow-y: auto;
  overflow-x: hidden;
  position: relative;
  z-index: 22;
}

.sidebar-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  margin-bottom: 14px;
}

.brand {
  display: flex;
  align-items: center;
  gap: 8px;
}

.brand-dot {
  width: 10px;
  height: 10px;
  border-radius: 50%;
  background: radial-gradient(circle at 30% 30%, rgba(var(--accent-soft-rgb), 0.96), rgba(var(--accent-strong-rgb), 0.94));
  box-shadow: 0 0 12px rgba(var(--accent-rgb), 0.6);
}

.brand-text {
  font-size: 13px;
  color: rgba(235, 240, 252, 0.96);
  font-weight: 700;
}

.drawer-close,
.create-btn {
  width: 30px;
  height: 30px;
  border-radius: 9px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.12);
  color: rgba(243, 247, 255, 0.92);
}

.nav-block,
.list-block {
  display: grid;
  gap: 8px;
}

.list-block {
  margin-top: 14px;
}

.list-title-row {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.list-block h3 {
  font-size: 11px;
  letter-spacing: 0.12em;
  text-transform: uppercase;
  color: rgba(178, 188, 212, 0.68);
  margin: 0 2px 2px;
}

.nav-item,
.list-item {
  min-height: 36px;
  border: 1px solid rgba(255, 255, 255, 0.1);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.08);
  color: rgba(233, 239, 255, 0.86);
  display: flex;
  align-items: center;
  gap: 10px;
  padding: 0 10px;
  font-size: 13px;
  text-align: left;
}

.nav-item.active,
.list-item.selected {
  border-color: rgba(var(--accent-rgb), 0.66);
  background: linear-gradient(120deg, rgba(var(--accent-rgb), 0.28), rgba(var(--accent-soft-rgb), 0.22));
  color: rgba(242, 248, 255, 0.98);
  box-shadow: 0 6px 18px rgba(var(--accent-rgb), 0.22);
}

.nav-item i,
.list-item i {
  width: 16px;
  text-align: center;
  opacity: 0.9;
}

.empty-tip {
  margin: 0;
  padding: 6px 2px 0;
  font-size: 12px;
  color: rgba(166, 179, 205, 0.76);
}

@media (max-width: 900px) {
  .music-left-sidebar.mobile {
    position: fixed;
    left: 10px;
    top: 68px;
    bottom: 96px;
    width: min(80vw, 310px);
    z-index: 1220;
    transform: translateX(-112%);
    transition: transform 260ms ease;
    padding-bottom: 16px;
  }

  .music-left-sidebar.mobile.drawer-open {
    transform: translateX(0);
  }
}
</style>
