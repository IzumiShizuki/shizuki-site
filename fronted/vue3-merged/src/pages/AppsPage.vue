<template>
  <section class="route-page apps-route">
    <header class="page-header">
      <p class="eyebrow">Apps</p>
      <h1>轻应用中心</h1>
      <p>已将 TimePrism 核心能力接入轻应用模块。你可以启用应用，并将常用应用固定到悬浮球快捷位。</p>
      <p v-if="syncHint" class="sync-hint">{{ syncHint }}</p>
    </header>

    <section class="config-block liquid-material">
      <header class="block-head">
        <h2>应用选择</h2>
        <span>已启用 {{ appState.enabledCodes.length }}/{{ catalog.length }}</span>
      </header>
      <div class="catalog-grid">
        <article
          v-for="app in catalog"
          :key="app.code"
          class="app-card"
          :class="{ enabled: isEnabled(app.code), floating: isFloating(app.code) }"
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
            <button
              class="action-btn ripple-trigger"
              :disabled="!isEnabled(app.code)"
              @click="toggleFloating(app.code)"
            >
              {{ isFloating(app.code) ? '移出悬浮球' : '加入悬浮球' }}
            </button>
            <button
              class="action-btn ripple-trigger"
              :disabled="!isEnabled(app.code)"
              @click="openAppInFocus(app.code)"
            >
              打开
            </button>
          </div>
        </article>
      </div>
    </section>

    <section class="config-block liquid-material">
      <header class="block-head">
        <h2>悬浮球快捷顺序</h2>
        <span>最多 {{ maxFloatingApps }} 个</span>
      </header>
      <ul class="floating-list">
        <li v-for="(code, index) in appState.floatingCodes" :key="code" class="floating-item">
          <div class="floating-main">
            <i :class="resolveApp(code)?.iconClass || 'fas fa-circle'" aria-hidden="true"></i>
            <div>
              <p>{{ resolveApp(code)?.title || code }}</p>
              <small>快捷位 {{ index + 1 }}</small>
            </div>
          </div>
          <div class="floating-actions">
            <button class="icon-btn ripple-trigger" :disabled="index === 0" @click="moveFloating(code, 'up')">
              <i class="fas fa-arrow-up"></i>
            </button>
            <button
              class="icon-btn ripple-trigger"
              :disabled="index === appState.floatingCodes.length - 1"
              @click="moveFloating(code, 'down')"
            >
              <i class="fas fa-arrow-down"></i>
            </button>
            <button class="icon-btn ripple-trigger" @click="toggleFloating(code)">
              <i class="fas fa-trash"></i>
            </button>
          </div>
        </li>
      </ul>
      <p v-if="!appState.floatingCodes.length" class="empty-hint">暂无悬浮球快捷应用，先从上面的卡片里添加。</p>
    </section>

    <section class="workspace-block">
      <header class="block-head">
        <h2>应用工作区</h2>
        <div class="workspace-actions">
          <button
            v-if="focusModeActive"
            class="action-btn ripple-trigger"
            @click="clearFocusMode"
          >
            返回全部应用
          </button>
          <span>{{ focusModeActive ? '悬浮球聚焦模式' : '全部已启用应用' }}</span>
        </div>
      </header>

      <div v-if="visibleCodes.length" class="workspace-grid">
        <article
          v-for="code in visibleCodes"
          :key="code"
          class="workspace-card liquid-material"
          :class="{ focused: code === focusedCode }"
        >
          <header class="workspace-card-head">
            <div>
              <h3>{{ resolveApp(code)?.title || code }}</h3>
              <p>{{ resolveApp(code)?.summary || '轻应用' }}</p>
            </div>
            <button class="action-btn ripple-trigger" @click="toggleFloating(code)">
              {{ isFloating(code) ? '取消快捷' : '设为悬浮球快捷' }}
            </button>
          </header>
          <component
            :is="resolveWidgetComponent(code)"
            :model-value="appState.configs[code] || {}"
            @update:model-value="updateAppConfig(code, $event)"
          />
        </article>
      </div>

      <div v-else class="empty-workspace liquid-material">
        <p>暂无已启用轻应用，请先在上方卡片启用。</p>
      </div>
    </section>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import TimePrismBoardWidget from '../components/apps/TimePrismBoardWidget.vue';
import TimePrismScheduleWidget from '../components/apps/TimePrismScheduleWidget.vue';
import TimePrismTodoWidget from '../components/apps/TimePrismTodoWidget.vue';
import { useAuthSession } from '../composables/useAuthSession';
import { LIGHT_APPS_CATALOG, getLightAppByCode } from '../utils/lightAppsCatalog';
import {
  MAX_FLOATING_APPS,
  applyLightAppsToPreference,
  createDefaultLightAppsState,
  normalizeLightAppsState,
  notifyLightAppsChanged,
  readLightAppsPreference,
  readLightAppsState,
  writeLightAppsState
} from '../utils/lightAppsState';

const catalog = LIGHT_APPS_CATALOG;
const maxFloatingApps = MAX_FLOATING_APPS;
const appState = ref(createDefaultLightAppsState());
const syncHint = ref('');

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();

let syncTimer = 0;
let syncHintTimer = 0;
let remoteHydrating = false;

const widgetComponentMap = {
  'timeprism-todo': TimePrismTodoWidget,
  'timeprism-board': TimePrismBoardWidget,
  'timeprism-schedule': TimePrismScheduleWidget
};

const focusedCode = computed(() => {
  const code = String(route.query.app || '').trim();
  return getLightAppByCode(code) ? code : '';
});

const focusModeActive = computed(() => {
  return String(route.query.mode || '').trim() === 'floating' && Boolean(focusedCode.value);
});

const visibleCodes = computed(() => {
  if (focusModeActive.value && focusedCode.value && appState.value.enabledCodes.includes(focusedCode.value)) {
    return [focusedCode.value];
  }
  return appState.value.enabledCodes;
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
  }, 2400);
}

function resolveApp(code) {
  return getLightAppByCode(code);
}

function isEnabled(code) {
  return appState.value.enabledCodes.includes(code);
}

function isFloating(code) {
  return appState.value.floatingCodes.includes(code);
}

function persistState(nextState, options = {}) {
  const normalized = writeLightAppsState(nextState);
  appState.value = normalized;
  notifyLightAppsChanged(normalized);
  if (options.skipRemote) return;
  queueRemotePreferenceSync();
}

function mergeLocalAndRemote(localState, remoteState) {
  if (!remoteState) return localState;
  return normalizeLightAppsState({
    enabledCodes: remoteState.enabledCodes,
    floatingCodes: remoteState.floatingCodes,
    configs: {
      ...(localState.configs || {}),
      ...(remoteState.configs || {})
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

function toggleEnabled(code) {
  if (!resolveApp(code)) return;
  const enabledSet = new Set(appState.value.enabledCodes);
  const floatingSet = new Set(appState.value.floatingCodes);
  const nextConfigs = {
    ...(appState.value.configs || {})
  };

  if (enabledSet.has(code)) {
    enabledSet.delete(code);
    floatingSet.delete(code);
    delete nextConfigs[code];
    showHint('应用已停用。');
  } else {
    enabledSet.add(code);
    nextConfigs[code] = nextConfigs[code] && typeof nextConfigs[code] === 'object' ? nextConfigs[code] : {};
    showHint('应用已启用。');
  }

  persistState({
    enabledCodes: Array.from(enabledSet),
    floatingCodes: Array.from(floatingSet),
    configs: nextConfigs
  });
}

function toggleFloating(code) {
  if (!isEnabled(code)) {
    showHint('请先启用该应用。');
    return;
  }

  const nextFloating = appState.value.floatingCodes.slice();
  const index = nextFloating.indexOf(code);

  if (index >= 0) {
    nextFloating.splice(index, 1);
    showHint('已移出悬浮球。');
  } else {
    if (nextFloating.length >= maxFloatingApps) {
      showHint(`悬浮球最多支持 ${maxFloatingApps} 个快捷应用。`);
      return;
    }
    nextFloating.push(code);
    showHint('已加入悬浮球。');
  }

  persistState({
    ...appState.value,
    floatingCodes: nextFloating
  });
}

function moveFloating(code, direction) {
  const nextFloating = appState.value.floatingCodes.slice();
  const index = nextFloating.indexOf(code);
  if (index < 0) return;

  const target = direction === 'up' ? index - 1 : index + 1;
  if (target < 0 || target >= nextFloating.length) return;

  const temp = nextFloating[index];
  nextFloating[index] = nextFloating[target];
  nextFloating[target] = temp;

  persistState({
    ...appState.value,
    floatingCodes: nextFloating
  });
}

function openAppInFocus(code) {
  if (!isEnabled(code)) return;
  router.replace({
    path: '/apps',
    query: {
      app: code,
      mode: 'floating'
    }
  });
}

function clearFocusMode() {
  router.replace({ path: '/apps' });
}

function resolveWidgetComponent(code) {
  return widgetComponentMap[code] || TimePrismTodoWidget;
}

function updateAppConfig(code, nextConfig) {
  if (!isEnabled(code)) return;
  const normalizedConfig = nextConfig && typeof nextConfig === 'object' ? nextConfig : {};
  persistState({
    ...appState.value,
    configs: {
      ...(appState.value.configs || {}),
      [code]: normalizedConfig
    }
  });
}

watch(
  () => [focusedCode.value, appState.value.enabledCodes.join(',')],
  ([queryCode]) => {
    if (!queryCode) return;
    if (appState.value.enabledCodes.includes(queryCode)) return;
    router.replace({ path: '/apps' });
  }
);

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

h1 {
  margin-top: 4px;
  font-size: clamp(26px, 3.6vw, 40px);
}

.page-header p {
  margin-top: 10px;
  max-width: 760px;
  color: rgba(223, 230, 249, 0.86);
}

.sync-hint {
  color: rgba(151, 231, 192, 0.92);
}

.config-block {
  --liquid-bg: rgba(16, 23, 38, 0.4);
  --liquid-border: rgba(255, 255, 255, 0.2);
  border-radius: 14px;
  padding: 14px;
}

.block-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 10px;
  margin-bottom: 10px;
}

.block-head h2 {
  margin: 0;
  font-size: 18px;
}

.block-head span {
  color: rgba(223, 230, 249, 0.72);
  font-size: 12px;
}

.catalog-grid {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 10px;
}

.app-card {
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background: rgba(11, 17, 30, 0.44);
  padding: 12px;
  display: grid;
  gap: 10px;
}

.app-card.enabled {
  border-color: rgba(var(--accent-rgb), 0.58);
}

.app-card.floating {
  box-shadow: 0 0 0 1px rgba(124, 194, 255, 0.4) inset;
}

.card-head {
  display: grid;
  grid-template-columns: 32px minmax(0, 1fr);
  gap: 10px;
}

.card-head i {
  width: 32px;
  height: 32px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
  border-radius: 10px;
  background: rgba(var(--accent-rgb), 0.24);
}

.card-head h3 {
  margin: 0;
  font-size: 15px;
}

.card-head p {
  margin: 4px 0 0;
  color: rgba(223, 230, 249, 0.75);
  font-size: 13px;
  line-height: 1.5;
}

.card-meta {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  color: rgba(223, 230, 249, 0.62);
  font-size: 11px;
}

.card-actions {
  display: grid;
  grid-template-columns: repeat(3, minmax(0, 1fr));
  gap: 8px;
}

.action-btn,
.icon-btn {
  border: 1px solid rgba(255, 255, 255, 0.2);
  background: rgba(15, 20, 33, 0.58);
  color: rgba(239, 244, 255, 0.95);
  border-radius: 10px;
  padding: 7px 8px;
}

.action-btn:disabled,
.icon-btn:disabled {
  opacity: 0.45;
  cursor: not-allowed;
}

.floating-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.floating-item {
  border-radius: 12px;
  border: 1px solid rgba(255, 255, 255, 0.12);
  background: rgba(10, 14, 24, 0.4);
  padding: 10px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
}

.floating-main {
  display: flex;
  align-items: center;
  gap: 10px;
  min-width: 0;
}

.floating-main p {
  margin: 0;
}

.floating-main small {
  color: rgba(223, 230, 249, 0.66);
}

.floating-actions {
  display: flex;
  gap: 6px;
}

.icon-btn {
  width: 30px;
  height: 30px;
  padding: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.workspace-block {
  display: grid;
  gap: 8px;
}

.workspace-actions {
  display: flex;
  align-items: center;
  gap: 8px;
}

.workspace-grid {
  display: grid;
  gap: 10px;
}

.workspace-card {
  --liquid-bg: rgba(15, 22, 35, 0.42);
  --liquid-border: rgba(255, 255, 255, 0.18);
  border-radius: 14px;
  padding: 12px;
  display: grid;
  gap: 10px;
}

.workspace-card.focused {
  box-shadow: 0 0 0 1px rgba(134, 204, 255, 0.5) inset;
}

.workspace-card-head {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 10px;
}

.workspace-card-head h3 {
  margin: 0;
}

.workspace-card-head p {
  margin: 5px 0 0;
  color: rgba(223, 230, 249, 0.74);
  font-size: 13px;
}

.empty-hint,
.empty-workspace {
  color: rgba(223, 230, 249, 0.72);
}

.empty-workspace {
  --liquid-bg: rgba(16, 22, 34, 0.38);
  --liquid-border: rgba(255, 255, 255, 0.14);
  border-radius: 14px;
  padding: 18px;
  text-align: center;
}

@media (max-width: 1080px) {
  .catalog-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }
}

@media (max-width: 760px) {
  .catalog-grid {
    grid-template-columns: 1fr;
  }

  .card-actions {
    grid-template-columns: 1fr;
  }

  .workspace-card-head {
    flex-direction: column;
  }

  .workspace-actions {
    flex-direction: column;
    align-items: flex-start;
  }

  .floating-item {
    flex-direction: column;
    align-items: flex-start;
  }
}
</style>
