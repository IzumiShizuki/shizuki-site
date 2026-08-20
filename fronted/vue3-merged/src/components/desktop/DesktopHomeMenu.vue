<template>
  <nav class="desktop-home-menu" data-desktop-interactive aria-label="Shizuki 桌面菜单">
    <button class="desktop-menu-trigger" type="button" :aria-expanded="open" @click.stop="open = !open">
      <span>MENU</span>
      <i :class="open ? 'fas fa-chevron-up' : 'fas fa-chevron-down'" aria-hidden="true"></i>
    </button>

    <Transition name="desktop-menu-drop">
      <section v-if="open" class="desktop-menu-dropdown liquid-material" @click.stop>
        <header>
          <small>SHIZUKI DESKTOP</small>
          <strong>去哪里？</strong>
        </header>
        <div class="desktop-route-grid">
          <button v-for="item in routes" :key="item.destination" type="button" @click="openRoute(item.destination)">
            <i :class="item.icon" aria-hidden="true"></i>
            <span>{{ item.label }}</span>
          </button>
        </div>
        <div class="desktop-menu-controls">
          <button type="button" @click="toggleEditMode">
            <i class="fas fa-table-cells-large" aria-hidden="true"></i>
            {{ editing ? '完成布局' : '编辑布局' }}
          </button>
          <button type="button" @click="toggleDesktopIcons">
            <i :class="iconsVisible ? 'fas fa-eye-slash' : 'fas fa-eye'" aria-hidden="true"></i>
            {{ iconsVisible ? '隐藏图标' : '显示图标' }}
          </button>
          <button type="button" @click="emit('open-background-picker')">
            <i class="fas fa-image" aria-hidden="true"></i>
            主题与壁纸
          </button>
          <button type="button" @click="openPairingManager">
            <i class="fas fa-shield-halved" aria-hidden="true"></i>
            设备授权
          </button>
        </div>
      </section>
    </Transition>
  </nav>
</template>

<script setup>
import { onBeforeUnmount, onMounted, ref } from 'vue';

const emit = defineEmits(['open-background-picker']);
const desktopApi = typeof window !== 'undefined' ? window.shizukiDesktop : null;
const open = ref(false);
const editing = ref(false);
const iconsVisible = ref(false);
const routes = Object.freeze([
  { destination: 'home', label: 'Home', icon: 'fas fa-house' },
  { destination: 'blog', label: 'Blog', icon: 'fas fa-feather' },
  { destination: 'music', label: 'Music', icon: 'fas fa-compact-disc' },
  { destination: 'apps', label: 'Apps', icon: 'fas fa-shapes' },
  { destination: 'aiHub', label: 'AI Hub', icon: 'fas fa-wand-magic-sparkles' },
  { destination: 'profile', label: 'Profile', icon: 'fas fa-user' }
]);

async function refreshState() {
  const state = await desktopApi?.getDesktopState?.();
  editing.value = state?.preferences?.interactionMode === 'edit';
  iconsVisible.value = !state?.preferences?.cleanDesktopEnabled;
}

async function openRoute(destination) {
  await desktopApi?.openRoute?.(destination);
  open.value = false;
}

async function toggleEditMode() {
  const state = await desktopApi?.setEditMode?.(!editing.value);
  editing.value = state?.preferences?.interactionMode === 'edit';
  window.dispatchEvent(new CustomEvent('shizuki-desktop-edit-mode', { detail: { enabled: editing.value } }));
}

async function toggleDesktopIcons() {
  const result = await desktopApi?.setDesktopIconsVisible?.(!iconsVisible.value);
  iconsVisible.value = Boolean(result?.visible);
}

function openPairingManager() {
  window.dispatchEvent(new CustomEvent('shizuki-desktop-open-pairing-manager'));
  open.value = false;
}

function closeOnOutside() {
  open.value = false;
}

onMounted(() => {
  void refreshState();
  window.addEventListener('pointerdown', closeOnOutside);
});

onBeforeUnmount(() => window.removeEventListener('pointerdown', closeOnOutside));
</script>

<style scoped>
.desktop-home-menu {
  position: fixed;
  z-index: 1300;
  top: 14px;
  left: 50%;
  transform: translateX(-50%);
  display: grid;
  justify-items: center;
  color: var(--theme-menu-text, rgba(246, 247, 255, 0.94));
}

.desktop-menu-trigger {
  min-width: 112px;
  height: 38px;
  padding: 0 18px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  border-radius: 999px;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
  color: inherit;
  background: rgba(20, 18, 36, 0.48);
  backdrop-filter: blur(20px) saturate(1.25);
  box-shadow: 0 10px 30px rgba(15, 12, 31, 0.2);
  cursor: pointer;
}

.desktop-menu-trigger span { font-size: 11px; font-weight: 800; letter-spacing: 0.18em; }
.desktop-menu-trigger i { font-size: 10px; }

.desktop-menu-dropdown {
  width: min(560px, calc(100vw - 40px));
  margin-top: 10px;
  padding: 18px;
  border-radius: 26px;
  background: rgba(24, 21, 39, 0.76);
  backdrop-filter: blur(28px) saturate(1.28);
  box-shadow: 0 24px 64px rgba(11, 8, 29, 0.34);
}

header { display: grid; gap: 3px; margin-bottom: 13px; }
header small { font-size: 9px; letter-spacing: 0.16em; opacity: 0.66; }
header strong { font-size: 20px; }

.desktop-route-grid {
  display: grid;
  grid-template-columns: repeat(6, 1fr);
  gap: 8px;
}

.desktop-route-grid button,
.desktop-menu-controls button {
  border: 0;
  border-radius: 17px;
  color: inherit;
  background: rgba(255, 255, 255, 0.08);
  cursor: pointer;
}

.desktop-route-grid button {
  min-height: 76px;
  display: grid;
  place-items: center;
  gap: 6px;
}

.desktop-route-grid button:hover,
.desktop-menu-controls button:hover { background: rgba(255, 184, 167, 0.2); }
.desktop-route-grid i { font-size: 18px; }
.desktop-route-grid span { font-size: 10px; }

.desktop-menu-controls {
  display: grid;
  grid-template-columns: repeat(4, 1fr);
  gap: 8px;
  margin-top: 10px;
  padding-top: 10px;
  border-top: 1px solid rgba(255, 255, 255, 0.12);
}

.desktop-menu-controls button {
  height: 40px;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 8px;
}

.desktop-menu-drop-enter-active,
.desktop-menu-drop-leave-active { transition: opacity 180ms ease, transform 180ms ease; }
.desktop-menu-drop-enter-from,
.desktop-menu-drop-leave-to { opacity: 0; transform: translateY(-8px) scale(0.97); }
</style>
