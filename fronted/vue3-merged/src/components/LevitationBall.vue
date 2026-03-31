<template>
  <div
    ref="containerRef"
    class="float-ball"
    :class="{ expanded: ui.expanded, dragging: ui.dragging }"
    :style="containerStyle"
    @pointerdown="onPointerDown"
    @click="onContainerClick"
  >
    <div class="ball-body drop-body liquid-material">
      <div v-if="!ui.expanded" class="ball-icon icon-gear-wrapper">
        <i class="fas fa-compass"></i>
      </div>

      <div v-else class="menu-list">
        <button class="menu-block menu-item close-block ripple-trigger" type="button" title="收起" @click.stop="collapseMenu">
          <i class="fas fa-chevron-down"></i>
        </button>
        <button
          v-for="slot in activeSlots"
          :key="`slot_${slot.slotIndex}`"
          class="menu-block menu-item ripple-trigger"
          type="button"
          :title="slotTitle(slot)"
          @click.stop="triggerSlot(slot)"
        >
          <i :class="slotIcon(slot)"></i>
        </button>
      </div>

      <div v-if="ui.expanded && ui.panelMode" class="picker-panel submenu-panel liquid-material">
        <button
          v-for="item in panelItems"
          :key="item.key"
          class="picker-item submenu-item ripple-trigger"
          type="button"
          @click.stop="onPanelItemClick(item)"
        >
          <i :class="item.iconClass"></i>
          <span>{{ item.label }}</span>
        </button>
        <p v-if="!panelItems.length" class="picker-empty">{{ ui.panelMode === 'collection' ? '集合为空' : '暂无可选应用' }}</p>
      </div>
    </div>
  </div>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref } from 'vue';
import { useRouter } from 'vue-router';
import { getLightAppByCode, LIGHT_APPS_CATALOG } from '../utils/lightAppsCatalog';
import { openLightAppWindow } from '../utils/lightAppWindowBus';
import { readGuestLightAppData, readRemoteLightAppCache } from '../utils/lightAppsDataStore';
import { LIGHT_APPS_CHANGED_EVENT, readLightAppsState } from '../utils/lightAppsState';

const router = useRouter();
const containerRef = ref(null);
const appState = ref(readLightAppsState());

const ui = reactive({
  x: 0,
  y: 120,
  dragging: false,
  expanded: false,
  panelMode: '',
  panelCollectionId: '',
  pointerId: 0,
  dragOffsetX: 0,
  dragOffsetY: 0,
  clickStartX: 0,
  clickStartY: 0
});
const urlLinks = ref([]);

const activeSlots = computed(() => {
  const railSlots = Array.isArray(appState.value?.rail_slots) && appState.value.rail_slots.length
    ? appState.value.rail_slots
    : [];
  if (railSlots.length) {
    return railSlots
      .map((slot, index) => ({
        slotIndex: index,
        enabled: Boolean(slot?.enabled),
        type: String(slot?.item_kind || 'app').trim().toLowerCase() || 'app',
        appCode: String(slot?.item_ref || '').trim(),
        itemRef: String(slot?.item_ref || '').trim()
      }))
      .filter((slot) => slot.enabled)
      .slice(0, 8);
  }

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

const collections = computed(() =>
  (Array.isArray(appState.value?.collections) ? appState.value.collections : [])
    .map((item) => ({
      collectionId: String(item?.collection_id || '').trim(),
      title: String(item?.title || '').trim() || '集合',
      items: Array.isArray(item?.items) ? item.items : []
    }))
    .filter((item) => item.collectionId)
);

function resolveCollectionById(collectionId) {
  const targetId = String(collectionId || '').trim();
  if (targetId) {
    const matched = collections.value.find((item) => item.collectionId === targetId);
    if (matched) return matched;
  }
  return collections.value[0] || { collectionId: '', title: '集合', items: [] };
}

const panelItems = computed(() => {
  if (ui.panelMode === 'picker') {
    return pickerApps.value.map((app) => ({
      key: `app_${app.code}`,
      kind: 'app',
      appCode: app.code,
      iconClass: app.iconClass,
      label: app.title
    }));
  }

  if (ui.panelMode === 'collection') {
    const activeCollection = resolveCollectionById(ui.panelCollectionId);
    const items = Array.isArray(activeCollection.items) ? activeCollection.items : [];
    return items
      .map((entry, index) => {
        const kind = String(entry?.item_kind || '').trim().toLowerCase();
        const itemRef = String(entry?.item_ref || '').trim();
        if (!itemRef) return null;
        if (kind === 'app') {
          const app = getLightAppByCode(itemRef);
          if (!app) return null;
          return {
            key: `collection_app_${itemRef}_${index}`,
            kind: 'app',
            appCode: itemRef,
            iconClass: app.iconClass,
            label: app.title
          };
        }
        if (kind === 'url') {
          const link = findUrlLink(itemRef);
          return {
            key: `collection_url_${itemRef}_${index}`,
            kind: 'url',
            urlLinkId: itemRef,
            iconClass: 'fas fa-link',
            label: link?.title || '网址快捷项'
          };
        }
        return null;
      })
      .filter(Boolean);
  }
  return [];
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
  if (ui.panelMode === 'collection') {
    const active = resolveCollectionById(ui.panelCollectionId);
    ui.panelCollectionId = String(active.collectionId || '');
  }
  syncUrlLinks();
}

function onLightAppsChanged(event) {
  syncState(event?.detail);
}

function syncUrlLinks() {
  const merged = [
    ...(readRemoteLightAppCache()?.urlLinks || []),
    ...(readGuestLightAppData()?.urlLinks || [])
  ];
  const dedupe = new Map();
  merged.forEach((item) => {
    const id = String(item?.urlLinkId || item?.url_link_id || '').trim();
    const title = String(item?.title || '').trim();
    const url = String(item?.url || '').trim();
    if (!id || !url) return;
    dedupe.set(id, {
      urlLinkId: id,
      title: title || '网址快捷项',
      url
    });
  });
  urlLinks.value = Array.from(dedupe.values());
}

function findUrlLink(urlLinkId) {
  const target = String(urlLinkId || '').trim();
  if (!target) return null;
  return urlLinks.value.find((item) => item.urlLinkId === target) || null;
}

function openUrlLink(urlLinkId) {
  const link = findUrlLink(urlLinkId);
  if (!link?.url) {
    router.push({ path: '/apps' }).catch(() => {});
    collapseMenu();
    return;
  }
  window.open(link.url, '_blank', 'noopener,noreferrer');
  collapseMenu();
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
  ui.panelMode = '';
  clampPosition();
}

function collapseMenu() {
  ui.expanded = false;
  ui.panelMode = '';
  ui.panelCollectionId = '';
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
  if (slot.type === 'collection') return 'fas fa-folder';
  if (slot.type === 'url') return 'fas fa-link';
  return getLightAppByCode(slot.appCode)?.iconClass || 'fas fa-circle';
}

function slotTitle(slot) {
  if (slot.type === 'picker') return '应用选择器';
  if (slot.type === 'collection') {
    return resolveCollectionById(slot.itemRef || slot.appCode).title || '集合';
  }
  if (slot.type === 'url') {
    const target = findUrlLink(slot.itemRef || slot.appCode);
    return target?.title || '网址快捷项';
  }
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
    ui.panelMode = ui.panelMode === 'picker' ? '' : 'picker';
    return;
  }

  if (slot.type === 'collection') {
    const collectionId = String(slot.itemRef || slot.appCode || '').trim();
    const activeCollection = resolveCollectionById(collectionId);
    if (ui.panelMode === 'collection' && ui.panelCollectionId === activeCollection.collectionId) {
      ui.panelMode = '';
      ui.panelCollectionId = '';
      return;
    }
    ui.panelMode = 'collection';
    ui.panelCollectionId = String(activeCollection.collectionId || '');
    return;
  }

  if (slot.type === 'url') {
    openUrlLink(slot.itemRef || slot.appCode);
    return;
  }

  if (!slot.appCode) {
    router.push({ path: '/apps' }).catch(() => {});
    collapseMenu();
    return;
  }

  openByCode(slot.appCode);
}

function onPanelItemClick(item) {
  if (!item) return;
  if (item.kind === 'app') {
    openByCode(item.appCode);
    return;
  }
  if (item.kind === 'url') {
    openUrlLink(item.urlLinkId);
  }
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
  syncUrlLinks();
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
  --ease-elastic: cubic-bezier(0.34, 1.56, 0.64, 1);
  position: fixed;
  top: 0;
  left: 0;
  z-index: 2200;
  touch-action: none;
  cursor: pointer;
  transition: width 0.35s var(--ease-elastic), height 0.35s var(--ease-elastic);
}

.float-ball.dragging {
  cursor: grabbing;
}

.ball-body {
  --liquid-bg: var(--theme-floating-surface, var(--glass-bg));
  --liquid-border: var(--theme-border, rgba(255, 255, 255, 0.18));
  --liquid-shadow: 0 16px 28px rgba(18, 9, 8, 0.16);
  position: relative;
  width: 100%;
  height: 100%;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  overflow: hidden;
  transform-origin: center center;
  transition:
    border-radius 0.34s ease,
    background-color 0.3s ease;
}

.ball-body::after {
  content: '';
  position: absolute;
  top: 8%;
  left: 12%;
  width: 40%;
  height: 25%;
  border-radius: 50%;
  background: radial-gradient(circle at center, rgba(255, 255, 255, 0.8) 0%, rgba(255, 255, 255, 0) 70%);
  opacity: 0.7;
  pointer-events: none;
  filter: blur(2px);
}

.ball-body::before {
  content: '';
  position: absolute;
  inset: 0;
  border-radius: inherit;
  box-shadow: inset 0 0 0 1px color-mix(in srgb, var(--theme-border-strong, rgba(255, 255, 255, 0.24)) 88%, transparent);
  pointer-events: none;
}

@keyframes breath {
  0%,
  100% {
    transform: scale(1);
  }

  50% {
    transform: scale(1.03);
  }
}

.float-ball:not(.dragging):not(.expanded) .ball-body {
  animation: breath 6s ease-in-out infinite;
}

.float-ball.expanded .ball-body {
  --liquid-bg: var(--theme-floating-surface, rgba(var(--glass-rgb), 0.34));
  border-radius: 35px;
  overflow: visible;
}

.ball-icon {
  color: var(--theme-floating-ink, rgba(255, 255, 255, 0.88));
  font-size: 18px;
  opacity: 0.8;
  transition: opacity 0.26s ease, transform 0.26s ease;
}

.float-ball.expanded .ball-icon {
  opacity: 0;
  transform: scale(0.5);
}

.menu-list {
  position: absolute;
  inset: 0;
  width: 100%;
  height: 100%;
  padding: 14px 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: flex-start;
  gap: 10px;
  opacity: 0;
  pointer-events: none;
  transform: translateY(10px);
  transition: opacity 0.22s 0.1s, transform 0.3s var(--ease-elastic) 0.1s;
}

.float-ball.expanded .menu-list {
  opacity: 1;
  pointer-events: auto;
  transform: translateY(0);
}

.menu-block {
  width: 40px;
  height: 40px;
  border-radius: 50%;
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.2));
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.2));
  color: var(--theme-floating-ink, rgba(255, 255, 255, 0.94));
  display: inline-flex;
  align-items: center;
  justify-content: center;
  transition: transform 0.1s ease, background-color 0.2s ease, color 0.2s ease, border-color 0.2s ease;
}

.menu-block:hover {
  background: var(--theme-floating-surface-hover, rgba(var(--accent-rgb), 0.46));
  border-color: rgba(var(--accent-rgb), 0.32);
}

.menu-block.close-block {
  background: var(--theme-floating-close-surface, rgba(0, 0, 0, 0.1));
  color: var(--theme-icon-muted, rgba(0, 0, 0, 0.6));
}

.menu-block.close-block:hover {
  background: color-mix(in srgb, var(--theme-floating-close-surface, rgba(0, 0, 0, 0.1)) 76%, rgba(var(--accent-rgb), 0.2));
  border-color: rgba(var(--accent-rgb), 0.24);
}

.picker-panel {
  position: absolute;
  left: calc(100% + 10px);
  top: 6px;
  min-width: 188px;
  max-width: 240px;
  border-radius: 24px;
  --liquid-bg: var(--theme-floating-surface, rgba(var(--glass-rgb), 0.34));
  --liquid-border: var(--theme-border, rgba(255, 255, 255, 0.18));
  --liquid-shadow: 0 16px 30px rgba(18, 9, 8, 0.16);
  padding: 10px 8px;
  display: flex;
  flex-direction: column;
  gap: 6px;
  opacity: 0;
  transform: translate3d(8px, 0, 0) scale(0.94);
  transform-origin: left center;
  animation: submenu-panel-in 320ms cubic-bezier(0.18, 0.92, 0.24, 1.2) forwards;
}

@keyframes submenu-panel-in {
  0% {
    opacity: 0;
    transform: translate3d(8px, 0, 0) scale(0.82);
  }

  100% {
    opacity: 1;
    transform: translate3d(0, 0, 0) scale(1);
  }
}

.picker-item {
  border: 1px solid var(--theme-border, rgba(255, 255, 255, 0.18));
  border-radius: 18px;
  background: var(--theme-panel-surface-elevated, rgba(255, 255, 255, 0.3));
  color: var(--theme-floating-ink, rgba(255, 255, 255, 0.95));
  min-height: 36px;
  padding: 0 12px;
  display: inline-flex;
  align-items: center;
  gap: 8px;
  justify-content: flex-start;
  transition: background-color 0.2s ease, color 0.2s ease;
}

.picker-item:hover {
  background: var(--theme-floating-surface-hover, rgba(var(--accent-rgb), 0.46));
  color: var(--theme-icon-strong, rgba(255, 255, 255, 1));
  border-color: rgba(var(--accent-rgb), 0.32);
}

.picker-empty {
  margin: 0;
  font-size: 12px;
  color: var(--theme-text-secondary, rgba(67, 74, 94, 0.82));
  padding: 6px;
  text-align: center;
}

@media (max-width: 860px) {
  .picker-panel {
    left: auto;
    right: calc(100% + 10px);
    transform-origin: right center;
  }
}
</style>
