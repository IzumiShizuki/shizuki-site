<template>
  <section class="route-page apps-route">
    <header class="page-header">
      <p class="eyebrow">Apps</p>
      <h1>轻应用中心</h1>
      <p>这里只做管理：说明、是否加入悬浮球、以及“使用”按钮。真正功能在可拖拽/可缩放的小窗中打开。</p>
      <p v-if="syncHint" class="sync-hint">{{ syncHint }}</p>
    </header>

    <section class="config-block liquid-material">
      <header class="block-head">
        <h2>应用清单</h2>
        <span>已启用 {{ appState.enabled_codes.length }}/{{ catalog.length }}</span>
      </header>
      <div class="catalog-grid">
        <article
          v-for="app in catalog"
          :key="app.code"
          class="app-card"
          :class="{ enabled: isEnabled(app.code), floating: isInBallSlots(app.code) }"
        >
          <div class="card-head">
            <i :class="app.iconClass" aria-hidden="true"></i>
            <div>
              <h3>{{ app.title }}</h3>
              <p>{{ app.summary }}</p>
            </div>
          </div>
          <div class="card-meta">
            <span>{{ app.source }}</span>
            <span>{{ app.code }}</span>
          </div>
          <div class="card-actions">
            <button class="action-btn ripple-trigger" @click="toggleEnabled(app.code)">
              {{ isEnabled(app.code) ? '停用' : '启用' }}
            </button>
            <button class="action-btn ripple-trigger" :disabled="!isEnabled(app.code)" @click="toggleAppInSlots(app.code)">
              {{ isInBallSlots(app.code) ? '移出悬浮球' : '加入悬浮球' }}
            </button>
            <button class="action-btn ripple-trigger" :disabled="!isEnabled(app.code)" @click="useApp(app.code)">
              使用
            </button>
          </div>
        </article>
      </div>
    </section>

    <section class="config-block liquid-material">
      <header class="block-head">
        <h2>悬浮球 8 槽配置</h2>
        <span>第 1 块固定为开关；以下 8 槽可配 app/picker</span>
      </header>

      <ul class="slot-list">
        <li v-for="(slot, index) in appState.ball_slots" :key="`slot_${index}`" class="slot-item">
          <div class="slot-main">
            <p>槽位 {{ index + 2 }}</p>
            <small>{{ slot.enabled ? '已启用' : '未启用' }}</small>
          </div>

          <label class="slot-toggle">
            <input :checked="slot.enabled" type="checkbox" @change="updateSlot(index, { enabled: !slot.enabled })" />
            <span>启用</span>
          </label>

          <select :value="slot.type" @change="setSlotType(index, $event.target.value)">
            <option value="app">直接打开应用</option>
            <option value="picker">应用选择器</option>
          </select>

          <select
            :value="slot.app_code || ''"
            :disabled="slot.type !== 'app'"
            @change="setSlotApp(index, $event.target.value)"
          >
            <option value="">请选择应用</option>
            <option v-for="app in enabledApps" :key="`slot_${index}_${app.code}`" :value="app.code">
              {{ app.title }}
            </option>
          </select>
        </li>
      </ul>
      <p class="empty-hint">
        提示：默认第 2 块建议使用 picker，其余槽位可直开高频轻应用；悬浮球面板长度会随启用槽位自动增长。
      </p>
    </section>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref } from 'vue';
import { useAuthSession } from '../composables/useAuthSession';
import { openLightAppWindow } from '../utils/lightAppWindowBus';
import { LIGHT_APPS_CATALOG, getLightAppByCode, isKnownLightAppCode } from '../utils/lightAppsCatalog';
import {
  MAX_BALL_SLOTS,
  applyLightAppsToPreference,
  createDefaultLightAppsState,
  normalizeLightAppsState,
  notifyLightAppsChanged,
  readLightAppsPreference,
  readLightAppsState,
  writeLightAppsState
} from '../utils/lightAppsState';

const catalog = LIGHT_APPS_CATALOG;
const appState = ref(createDefaultLightAppsState());
const syncHint = ref('');

const auth = useAuthSession();

let syncTimer = 0;
let syncHintTimer = 0;
let remoteHydrating = false;

const enabledApps = computed(() => {
  const enabledSet = new Set(appState.value.enabled_codes);
  return catalog.filter((item) => enabledSet.has(item.code));
});

function showHint(message) {
  syncHint.value = String(message || '').trim();
  if (syncHintTimer) {
    window.clearTimeout(syncHintTimer);
  }
  if (!syncHint.value) return;
  syncHintTimer = window.setTimeout(() => {
    syncHint.value = '';
    syncHintTimer = 0;
  }, 2200);
}

function isEnabled(code) {
  return appState.value.enabled_codes.includes(code);
}

function isInBallSlots(code) {
  return appState.value.ball_slots.some((slot) => slot.enabled && slot.type === 'app' && slot.app_code === code);
}

function persistState(nextState, options = {}) {
  const normalized = writeLightAppsState(nextState);
  appState.value = normalized;
  notifyLightAppsChanged(normalized);
  if (!options.skipRemote) {
    queueRemotePreferenceSync();
  }
}

function mergeLocalAndRemote(localState, remoteState) {
  if (!remoteState) return localState;
  return normalizeLightAppsState({
    enabled_codes: remoteState.enabled_codes,
    ball_slots: remoteState.ball_slots,
    app_configs: {
      ...(localState.app_configs || {}),
      ...(remoteState.app_configs || {})
    }
  });
}

async function hydrateState() {
  await auth.ensureReady();
  const localState = readLightAppsState();
  let mergedState = localState;

  if (auth.isAuthenticated.value) {
    remoteHydrating = true;
    try {
      const preferencePayload = await auth.getPreference();
      const remoteState = readLightAppsPreference(preferencePayload);
      mergedState = mergeLocalAndRemote(localState, remoteState);
    } catch {
      // keep local fallback
    } finally {
      remoteHydrating = false;
    }
  }

  persistState(mergedState, { skipRemote: true });
}

function queueRemotePreferenceSync() {
  if (!auth.isAuthenticated.value || remoteHydrating) return;

  if (syncTimer) {
    window.clearTimeout(syncTimer);
  }

  syncTimer = window.setTimeout(async () => {
    try {
      const preferencePayload = await auth.getPreference();
      const nextPayload = applyLightAppsToPreference(preferencePayload, appState.value);
      await auth.updatePreference(nextPayload);
    } catch {
      // ignore remote sync failures
    } finally {
      syncTimer = 0;
    }
  }, 720);
}

function findFirstAvailableSlot() {
  const slots = appState.value.ball_slots || [];
  const disabledIndex = slots.findIndex((slot) => !slot.enabled);
  if (disabledIndex >= 0) return disabledIndex;

  const emptyAppIndex = slots.findIndex((slot) => slot.enabled && slot.type === 'app' && !slot.app_code);
  if (emptyAppIndex >= 0) return emptyAppIndex;

  return -1;
}

function removeAppFromSlots(code, slots) {
  return slots.map((slot) => {
    if (slot.type === 'app' && slot.app_code === code) {
      return {
        ...slot,
        app_code: '',
        enabled: false
      };
    }
    return slot;
  });
}

function toggleEnabled(code) {
  if (!isKnownLightAppCode(code)) return;

  const enabledSet = new Set(appState.value.enabled_codes);
  let nextSlots = appState.value.ball_slots.slice();
  const nextConfigs = {
    ...(appState.value.app_configs || {})
  };

  if (enabledSet.has(code)) {
    enabledSet.delete(code);
    nextSlots = removeAppFromSlots(code, nextSlots);
    delete nextConfigs[code];
    showHint('应用已停用。');
  } else {
    enabledSet.add(code);
    nextConfigs[code] = nextConfigs[code] && typeof nextConfigs[code] === 'object' ? nextConfigs[code] : {};
    showHint('应用已启用。');
  }

  persistState({
    ...appState.value,
    enabled_codes: Array.from(enabledSet),
    ball_slots: nextSlots,
    app_configs: nextConfigs
  });
}

function toggleAppInSlots(code) {
  if (!isEnabled(code)) {
    showHint('请先启用该应用。');
    return;
  }

  const nextSlots = appState.value.ball_slots.slice();
  const existingIndex = nextSlots.findIndex((slot) => slot.enabled && slot.type === 'app' && slot.app_code === code);

  if (existingIndex >= 0) {
    nextSlots[existingIndex] = {
      ...nextSlots[existingIndex],
      enabled: false,
      app_code: ''
    };
    persistState({
      ...appState.value,
      ball_slots: nextSlots
    });
    showHint('已移出悬浮球。');
    return;
  }

  const slotIndex = findFirstAvailableSlot();
  if (slotIndex < 0) {
    showHint(`悬浮球已满（最多 ${MAX_BALL_SLOTS} 槽）。`);
    return;
  }

  nextSlots[slotIndex] = {
    enabled: true,
    type: 'app',
    app_code: code
  };

  persistState({
    ...appState.value,
    ball_slots: nextSlots
  });
  showHint('已加入悬浮球。');
}

function updateSlot(index, patch) {
  const slotIndex = Number(index);
  if (!Number.isInteger(slotIndex) || slotIndex < 0 || slotIndex >= MAX_BALL_SLOTS) return;

  const nextSlots = appState.value.ball_slots.slice();
  const current = nextSlots[slotIndex] || { enabled: false, type: 'app', app_code: '' };
  const next = {
    ...current,
    ...patch
  };

  if (next.type !== 'picker' && next.type !== 'app') {
    next.type = 'app';
  }
  if (next.type === 'picker') {
    next.app_code = '';
  }
  if (next.type === 'app' && next.app_code && !isEnabled(next.app_code)) {
    next.app_code = '';
  }

  nextSlots[slotIndex] = next;
  persistState({
    ...appState.value,
    ball_slots: nextSlots
  });
}

function setSlotType(index, type) {
  updateSlot(index, {
    type: String(type || '').trim().toLowerCase() === 'picker' ? 'picker' : 'app',
    app_code: ''
  });
}

function setSlotApp(index, code) {
  const normalizedCode = String(code || '').trim();
  if (!normalizedCode) {
    updateSlot(index, { app_code: '' });
    return;
  }

  if (!isEnabled(normalizedCode)) {
    showHint('只能绑定已启用应用。');
    return;
  }

  updateSlot(index, {
    type: 'app',
    enabled: true,
    app_code: normalizedCode
  });
}

function useApp(code) {
  const app = getLightAppByCode(code);
  if (!app || !isEnabled(code)) return;
  openLightAppWindow(code, { source: 'apps_center' });
}

onMounted(async () => {
  await hydrateState();
});

onBeforeUnmount(() => {
  if (syncTimer) {
    window.clearTimeout(syncTimer);
    syncTimer = 0;
  }
  if (syncHintTimer) {
    window.clearTimeout(syncHintTimer);
    syncHintTimer = 0;
  }
});
</script>

<style scoped>
.apps-route {
  min-height: 100%;
  display: grid;
  gap: 12px;
  color: rgba(239, 244, 255, 0.96);
}

.page-header {
  padding: 8px 4px 2px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

.page-header h1 {
  margin: 2px 0 6px;
}

.page-header p {
  margin: 0;
  color: rgba(226, 233, 250, 0.86);
}

.sync-hint {
  margin-top: 8px;
  color: rgba(168, 236, 200, 0.92);
  font-size: 13px;
}

.config-block {
  --liquid-bg: rgba(16, 23, 38, 0.62);
  border-radius: 14px;
  padding: 12px;
  display: grid;
  gap: 10px;
}

.block-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
}

.block-head h2 {
  margin: 0;
  font-size: 17px;
}

.block-head span {
  color: rgba(217, 226, 247, 0.74);
  font-size: 12px;
}

.catalog-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
  gap: 10px;
}

.app-card {
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 12px;
  padding: 10px;
  background: rgba(11, 16, 28, 0.5);
  display: grid;
  gap: 9px;
}

.app-card.enabled {
  border-color: rgba(var(--accent-rgb), 0.45);
}

.app-card.floating {
  box-shadow: 0 0 0 1px rgba(151, 221, 190, 0.4);
}

.card-head {
  display: grid;
  grid-template-columns: 24px minmax(0, 1fr);
  gap: 8px;
}

.card-head i {
  font-size: 18px;
  margin-top: 3px;
}

.card-head h3 {
  margin: 0;
  font-size: 15px;
}

.card-head p {
  margin: 4px 0 0;
  color: rgba(218, 227, 247, 0.78);
  font-size: 12px;
  line-height: 1.5;
}

.card-meta {
  display: flex;
  justify-content: space-between;
  gap: 8px;
  color: rgba(198, 208, 232, 0.62);
  font-size: 11px;
}

.card-actions {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.action-btn {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 10px;
  background: rgba(21, 29, 47, 0.62);
  color: rgba(236, 243, 255, 0.94);
  padding: 7px 10px;
  font-size: 12px;
}

.action-btn:disabled {
  opacity: 0.46;
  cursor: not-allowed;
}

.slot-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.slot-item {
  display: grid;
  grid-template-columns: 120px 74px 180px minmax(0, 1fr);
  gap: 8px;
  align-items: center;
  border: 1px solid rgba(255, 255, 255, 0.12);
  border-radius: 10px;
  background: rgba(11, 16, 27, 0.44);
  padding: 8px;
}

.slot-main p {
  margin: 0;
}

.slot-main small {
  color: rgba(206, 219, 241, 0.72);
}

.slot-toggle {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  color: rgba(236, 243, 255, 0.9);
  font-size: 12px;
}

.slot-item select {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 8px;
  background: rgba(19, 27, 44, 0.68);
  color: rgba(236, 243, 255, 0.95);
  min-height: 32px;
  padding: 0 8px;
}

.empty-hint {
  margin: 0;
  color: rgba(206, 219, 241, 0.72);
  font-size: 12px;
}

@media (max-width: 980px) {
  .slot-item {
    grid-template-columns: 1fr;
  }

  .card-actions {
    grid-template-columns: 1fr;
  }
}
</style>
