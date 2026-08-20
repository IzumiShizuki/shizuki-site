<template>
  <main class="desktop-orb-surface" :class="`level-${level}`" @keydown.esc="collapse">
    <section class="desktop-orb-shell" data-desktop-interactive>
      <button class="orb-core" type="button" :aria-label="orbLabel" @click="advance">
        <i :class="level === 'routes' ? 'fas fa-compass' : 'fas fa-sparkles'" aria-hidden="true"></i>
        <span>{{ level === 'collapsed' ? 'SHI' : 'Menu' }}</span>
      </button>

      <Transition name="orb-panel">
        <div v-if="level === 'controls'" class="orb-items" aria-label="轻应用与即时控制">
          <button v-for="item in controlItems" :key="item.key" type="button" @click="invokeControl(item.key)">
            <i :class="item.icon" aria-hidden="true"></i>
            <span>{{ item.label }}</span>
          </button>
        </div>
        <div v-else-if="level === 'routes'" class="orb-items route-items" aria-label="Shizuki 路由">
          <button v-for="item in routeItems" :key="item.destination" type="button" @click="openRoute(item.destination)">
            <i :class="item.icon" aria-hidden="true"></i>
            <span>{{ item.label }}</span>
          </button>
        </div>
      </Transition>
    </section>
  </main>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import {
  activateOrbBody,
  normalizeOrbLevel,
  ORB_CONTROL_ITEMS,
  ORB_ROUTE_ITEMS
} from '../../desktop/desktopOrbState';

const desktopApi = typeof window !== 'undefined' ? window.shizukiDesktop : null;
const level = ref('collapsed');
const controlItems = ORB_CONTROL_ITEMS;
const routeItems = ORB_ROUTE_ITEMS;
const orbLabel = computed(() => level.value === 'collapsed' ? '打开轻应用控制' : '切换控制层级');
let unsubscribeLevel = () => {};

function setLevel(next) {
  level.value = normalizeOrbLevel(next);
  void desktopApi?.setOrbLevel?.(level.value);
}

function advance() {
  setLevel(activateOrbBody(level.value));
}

function collapse() {
  setLevel('collapsed');
}

async function invokeControl(action) {
  await desktopApi?.invokeImmediateAction?.(action);
  collapse();
}

async function openRoute(destination) {
  await desktopApi?.openRoute?.(destination);
  collapse();
}

function onWindowBlur() {
  if (level.value !== 'collapsed') collapse();
}

onMounted(() => {
  unsubscribeLevel = desktopApi?.onOrbLevel?.(event => {
    level.value = normalizeOrbLevel(event?.level);
  }) || (() => {});
  window.addEventListener('blur', onWindowBlur);
});

onBeforeUnmount(() => {
  unsubscribeLevel();
  window.removeEventListener('blur', onWindowBlur);
});
</script>

<style scoped>
:global(html),
:global(body),
:global(#app) {
  width: 100%;
  height: 100%;
  margin: 0;
  overflow: hidden;
  background: transparent !important;
}

.desktop-orb-surface {
  width: 100%;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: flex-end;
  padding: 7px;
  box-sizing: border-box;
  color: rgba(255, 255, 255, 0.94);
  font-family: Inter, "Segoe UI", sans-serif;
  user-select: none;
}

.desktop-orb-shell {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  gap: 9px;
  width: 100%;
  height: 100%;
  -webkit-app-region: drag;
}

button {
  -webkit-app-region: no-drag;
}

.orb-core {
  order: 2;
  width: 62px;
  height: 62px;
  flex: 0 0 62px;
  border: 1px solid rgba(255, 255, 255, 0.34);
  border-radius: 50%;
  display: grid;
  place-items: center;
  gap: 1px;
  color: inherit;
  background: linear-gradient(145deg, rgba(255, 184, 167, 0.9), rgba(117, 96, 196, 0.88));
  box-shadow: 0 14px 38px rgba(25, 17, 54, 0.34), inset 0 1px 0 rgba(255, 255, 255, 0.45);
  cursor: pointer;
}

.orb-core i { font-size: 18px; }
.orb-core span { font-size: 9px; font-weight: 800; letter-spacing: 0.12em; }

.orb-items {
  order: 1;
  min-width: 0;
  height: 76px;
  flex: 1;
  display: flex;
  align-items: center;
  justify-content: flex-end;
  gap: 6px;
  padding: 8px 10px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 24px;
  background: rgba(26, 22, 45, 0.78);
  backdrop-filter: blur(22px) saturate(1.2);
  box-shadow: 0 14px 38px rgba(15, 11, 33, 0.28);
}

.orb-items button {
  width: 62px;
  height: 58px;
  border: 0;
  border-radius: 17px;
  display: grid;
  place-items: center;
  gap: 3px;
  color: inherit;
  background: rgba(255, 255, 255, 0.08);
  cursor: pointer;
}

.orb-items button:hover { background: rgba(255, 184, 167, 0.24); }
.orb-items i { font-size: 16px; }
.orb-items span { font-size: 10px; }
.route-items button { width: 64px; }

.orb-panel-enter-active,
.orb-panel-leave-active { transition: opacity 160ms ease, transform 160ms ease; }
.orb-panel-enter-from,
.orb-panel-leave-to { opacity: 0; transform: translateX(10px) scale(0.96); }
</style>
