<template>
  <div
    ref="containerRef"
    class="float-ball"
    :class="{ expanded: ui.expanded, dragging: ui.dragging }"
    :style="containerStyle"
    @pointerdown="onPointerDown"
    @click="onContainerClick"
  >
    <div class="ball-body liquid-material">
      <div v-if="!ui.expanded" class="ball-icon">
        <i class="fas fa-compass"></i>
      </div>

      <div v-else class="menu-list">
        <button class="menu-block close-block ripple-trigger" type="button" title="收起" @click.stop="collapseMenu">
          <i class="fas fa-chevron-down"></i>
        </button>
        <button
          v-for="slot in activeSlots"
          :key="`slot_${slot.slotIndex}`"
          class="menu-block ripple-trigger"
          type="button"
          :title="slotTitle(slot)"
          @click.stop="triggerSlot(slot)"
        >
          <i :class="slotIcon(slot)"></i>
        </button>
      </div>

      <div v-if="ui.expanded && ui.pickerOpen" class="picker-panel liquid-material">
        <button
          v-for="app in pickerApps"
          :key="app.code"
          class="picker-item ripple-trigger"
          type="button"
          @click.stop="openByCode(app.code)"
        >
          <i :class="app.iconClass"></i>
          <span>{{ app.title }}</span>
        </button>
        <p v-if="!pickerApps.length" class="picker-empty">暂无可选应用</p>
      </div>
    </div>
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref } from 'vue';
import { useRouter } from 'vue-router';
import { getLightAppByCode, LIGHT_APPS_CATALOG } from '../utils/lightAppsCatalog';
import { openLightAppWindow } from '../utils/lightAppWindowBus';
import { LIGHT_APPS_CHANGED_EVENT, readLightAppsState } from '../utils/lightAppsState';

const router = useRouter();
const containerRef = ref(null);
const appState = ref(readLightAppsState());

const ui = reactive({
  x: 0,
  y: 120,
  dragging: false,
  expanded: false,
  pickerOpen: false,
  pointerId: 0,
  dragOffsetX: 0,
  dragOffsetY: 0,
  clickStartX: 0,
  clickStartY: 0
});

const activeSlots = computed(() => {
  const slots = Array.isArray(appState.value?.ball_slots) ? appState.value.ball_slots : [];
  return slots
    .map((slot, index) => ({
      slotIndex: index,
      enabled: Boolean(slot?.enabled),
      type: String(slot?.type || 'app').trim().toLowerCase() === 'picker' ? 'picker' : 'app',
      appCode: String(slot?.app_code || '').trim()
    }))
    .filter((slot) => slot.enabled)
    .slice(0, 8);
});

const pickerApps = computed(() => {
  const enabledCodes = Array.isArray(appState.value?.enabled_codes) ? appState.value.enabled_codes : [];
  const enabledSet = new Set(enabledCodes);
  return LIGHT_APPS_CATALOG.filter((item) => enabledSet.has(item.code));
});

const panelHeight = computed(() => {
  const blockCount = 1 + activeSlots.value.length;
  return 14 + blockCount * 40 + (blockCount - 1) * 8 + 14;
});

const containerStyle = computed(() => {
  const width = ui.expanded ? 70 : 58;
  const height = ui.expanded ? panelHeight.value : 58;
  return {
    transform: `translate3d(${ui.x}px, ${ui.y}px, 0)`,
    width: `${width}px`,
    height: `${height}px`
  };
});

function syncState(rawState) {
  appState.value = rawState && typeof rawState === 'object' ? rawState : readLightAppsState();
}

function onLightAppsChanged(event) {
  syncState(event?.detail);
}

function clampPosition() {
  const width = ui.expanded ? 70 : 58;
  const height = ui.expanded ? panelHeight.value : 58;
  const maxX = Math.max(8, window.innerWidth - width - 8);
  const maxY = Math.max(8, window.innerHeight - height - 8);

  if (ui.x < 8) ui.x = 8;
  if (ui.y < 8) ui.y = 8;
  if (ui.x > maxX) ui.x = maxX;
  if (ui.y > maxY) ui.y = maxY;
}

function expandMenu() {
  ui.expanded = true;
  ui.pickerOpen = false;
  clampPosition();
}

function collapseMenu() {
  ui.expanded = false;
  ui.pickerOpen = false;
  clampPosition();
}

function toggleMenu() {
  if (ui.expanded) {
    collapseMenu();
  } else {
    expandMenu();
  }
}

function onContainerClick(event) {
  if (ui.dragging) return;
  const target = event.target;
  if (target?.closest?.('.menu-block, .picker-item')) return;
  if (!ui.expanded) {
    expandMenu();
  }
}

function onPointerDown(event) {
  const target = event.target;
  if (target?.closest?.('.menu-block, .picker-panel')) return;

  ui.dragging = true;
  ui.pointerId = event.pointerId;
  ui.dragOffsetX = event.clientX - ui.x;
  ui.dragOffsetY = event.clientY - ui.y;
  ui.clickStartX = event.clientX;
  ui.clickStartY = event.clientY;

  window.addEventListener('pointermove', onPointerMove);
  window.addEventListener('pointerup', onPointerUp);
}

function onPointerMove(event) {
  if (!ui.dragging) return;
  if (ui.pointerId && event.pointerId !== ui.pointerId) return;

  ui.x = event.clientX - ui.dragOffsetX;
  ui.y = event.clientY - ui.dragOffsetY;
  clampPosition();
}

function onPointerUp(event) {
  if (!ui.dragging) return;
  if (ui.pointerId && event.pointerId !== ui.pointerId) return;

  const dx = Math.abs(event.clientX - ui.clickStartX);
  const dy = Math.abs(event.clientY - ui.clickStartY);
  const clickLike = dx <= 5 && dy <= 5;

  ui.dragging = false;
  ui.pointerId = 0;
  window.removeEventListener('pointermove', onPointerMove);
  window.removeEventListener('pointerup', onPointerUp);

  if (clickLike && !ui.expanded) {
    toggleMenu();
  }
}

function slotIcon(slot) {
  if (slot.type === 'picker') return 'fas fa-th-large';
  return getLightAppByCode(slot.appCode)?.iconClass || 'fas fa-circle';
}

function slotTitle(slot) {
  if (slot.type === 'picker') return '应用选择器';
  return getLightAppByCode(slot.appCode)?.title || '未绑定应用';
}

function openByCode(code) {
  const app = getLightAppByCode(code);
  if (!app) {
    router.push({ path: '/apps' }).catch(() => {});
    collapseMenu();
    return;
  }

  openLightAppWindow(app.code, { source: 'levitation_ball' });
  collapseMenu();
}

function triggerSlot(slot) {
  if (slot.type === 'picker') {
    ui.pickerOpen = !ui.pickerOpen;
    return;
  }

  if (!slot.appCode) {
    router.push({ path: '/apps' }).catch(() => {});
    collapseMenu();
    return;
  }

  openByCode(slot.appCode);
}

function onDocumentPointerDown(event) {
  if (!ui.expanded) return;
  const container = containerRef.value;
  if (!container) return;
  if (container.contains(event.target)) return;
  collapseMenu();
}

function onResize() {
  clampPosition();
}

defineExpose({
  toggleExpanded: toggleMenu,
  triggerMenuByIndex(index) {
    const n = Number(index);
    if (!Number.isInteger(n) || n < 1 || n > 9) return;

    if (n === 1) {
      toggleMenu();
      return;
    }

    if (!ui.expanded) {
      expandMenu();
    }

    const slot = activeSlots.value[n - 2];
    if (!slot) return;
    triggerSlot(slot);
  }
});

onMounted(() => {
  syncState();
  ui.x = Math.max(8, window.innerWidth - 92);
  ui.y = 120;
  clampPosition();

  window.addEventListener(LIGHT_APPS_CHANGED_EVENT, onLightAppsChanged);
  window.addEventListener('resize', onResize);
  document.addEventListener('pointerdown', onDocumentPointerDown);
});

onBeforeUnmount(() => {
  window.removeEventListener(LIGHT_APPS_CHANGED_EVENT, onLightAppsChanged);
  window.removeEventListener('resize', onResize);
  document.removeEventListener('pointerdown', onDocumentPointerDown);
  window.removeEventListener('pointermove', onPointerMove);
  window.removeEventListener('pointerup', onPointerUp);
});
</script>

<style scoped>
.float-ball {
  position: fixed;
  top: 0;
  left: 0;
  z-index: 2200;
  touch-action: none;
  cursor: grab;
  transition: width 0.22s ease, height 0.22s ease;
}

.float-ball.dragging {
  cursor: grabbing;
}

.ball-body {
  position: relative;
  width: 100%;
  height: 100%;
  border-radius: 999px;
  --liquid-bg: rgba(var(--glass-rgb), 0.46);
  display: flex;
  align-items: center;
  justify-content: center;
  overflow: visible;
  transition: border-radius 0.2s ease;
}

.float-ball.expanded .ball-body {
  border-radius: 24px;
}

.ball-icon {
  color: rgba(245, 249, 255, 0.94);
  font-size: 18px;
}

.menu-list {
  width: 100%;
  height: 100%;
  padding: 14px 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 8px;
}

.menu-block {
  width: 40px;
  height: 40px;
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.22);
  background: rgba(24, 31, 48, 0.64);
  color: rgba(236, 243, 255, 0.94);
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.menu-block.close-block {
  background: rgba(35, 44, 66, 0.78);
}

.picker-panel {
  position: absolute;
  left: calc(100% + 10px);
  top: 8px;
  min-width: 180px;
  max-width: 240px;
  border-radius: 12px;
  --liquid-bg: rgba(13, 19, 34, 0.86);
  padding: 8px;
  display: grid;
  gap: 6px;
}

.picker-item {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 10px;
  background: rgba(24, 31, 47, 0.68);
  color: rgba(236, 243, 255, 0.95);
  min-height: 34px;
  padding: 0 10px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
}

.picker-empty {
  margin: 0;
  font-size: 12px;
  color: rgba(210, 221, 242, 0.78);
  padding: 6px;
}

@media (max-width: 860px) {
  .picker-panel {
    left: auto;
    right: calc(100% + 10px);
  }
}
</style>
