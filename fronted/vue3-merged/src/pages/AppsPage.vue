<template>
  <section class="route-page apps-route">
    <div class="apps-layout">
      <section class="apps-main liquid-material">
        <header class="apps-main-head">
          <h2>轻应用</h2>
          <span>{{ appState.enabled_codes.length }}/{{ catalog.length }} 已启用</span>
        </header>
        <p v-if="syncHint" class="sync-hint">{{ syncHint }}</p>

        <div class="catalog-grid">
          <article
            v-for="app in catalog"
            :key="app.code"
            class="app-card"
            :class="{ enabled: isEnabled(app.code), floating: isInRailSlots(app.code) }"
          >
            <div class="card-head">
              <button
                class="card-icon-drag ripple-trigger"
                type="button"
                draggable="true"
                :title="`拖拽 ${app.title} 到右栏`"
                @dragstart="onAppDragStart(app, $event)"
                @click="useApp(app.code)"
              >
                <i :class="app.iconClass" aria-hidden="true"></i>
              </button>
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
              <button class="action-btn ripple-trigger" :disabled="!isEnabled(app.code)" @click="toggleAppInRail(app.code)">
                {{ isInRailSlots(app.code) ? '移出右栏' : '加入右栏' }}
              </button>
              <button class="action-btn ripple-trigger" :disabled="!isEnabled(app.code)" @click="useApp(app.code)">
                使用
              </button>
              <button class="action-btn ripple-trigger" :disabled="!isEnabled(app.code)" @click="openAppInPage(app.code)">
                页面打开
              </button>
            </div>

            <div class="card-mobile-actions">
              <button class="icon-btn ripple-trigger" :disabled="!isEnabled(app.code)" title="加入右栏" @click="assignPaletteToFirstSlot('app', app.code)">
                <i class="fas fa-right-to-bracket" aria-hidden="true"></i>
              </button>
              <button class="icon-btn ripple-trigger" :disabled="!isEnabled(app.code)" title="加入集合" @click="addPaletteToCollection('app', app.code)">
                <i class="fas fa-layer-group" aria-hidden="true"></i>
              </button>
            </div>
          </article>
        </div>

        <section class="url-source-block liquid-material">
          <header class="block-head">
            <h3>Url Links 网址项</h3>
            <div class="block-head-actions">
              <button
                class="icon-btn ripple-trigger"
                type="button"
                :title="isUrlSourceIconMode ? '切换为详情模式' : '切换为图标模式'"
                :aria-label="isUrlSourceIconMode ? '切换为详情模式' : '切换为图标模式'"
                @click="toggleUrlSourceViewMode"
              >
                <i :class="isUrlSourceIconMode ? 'fas fa-list' : 'fas fa-table-cells-large'" aria-hidden="true"></i>
              </button>
              <button class="icon-btn ripple-trigger" type="button" title="打开网址管理器" @click="openUrlManager">
                <i class="fas fa-link" aria-hidden="true"></i>
              </button>
            </div>
          </header>

          <ul class="url-source-list" :class="{ 'icon-mode': isUrlSourceIconMode }">
            <li
              v-for="item in urlLinks"
              :key="`url_source_${item.urlLinkId}`"
              class="url-source-item"
              :class="{ 'icon-mode': isUrlSourceIconMode }"
            >
              <button
                class="url-source-icon ripple-trigger"
                type="button"
                draggable="true"
                :title="`拖拽 ${item.title} 到右栏`"
                @dragstart="onUrlDragStart(item, $event)"
                @click="openUrlLink(item.urlLinkId)"
              >
                <img v-if="item.faviconUrl" :src="item.faviconUrl" alt="" />
                <i v-else class="fas fa-link" aria-hidden="true"></i>
              </button>

              <button class="url-source-main" type="button" @click="openUrlLink(item.urlLinkId)">
                <div>
                  <p :title="item.title">{{ isUrlSourceIconMode ? toCompactTitle(item.title) : item.title }}</p>
                  <small v-if="!isUrlSourceIconMode">{{ item.url }}</small>
                </div>
              </button>

              <div class="url-source-actions">
                <button class="icon-btn ripple-trigger" type="button" title="加入右栏" @click="assignPaletteToFirstSlot('url', String(item.urlLinkId))">
                  <i class="fas fa-right-to-bracket" aria-hidden="true"></i>
                </button>
                <button class="icon-btn ripple-trigger" type="button" title="加入集合" @click="addPaletteToCollection('url', String(item.urlLinkId))">
                  <i class="fas fa-layer-group" aria-hidden="true"></i>
                </button>
                <button class="icon-btn ripple-trigger" type="button" title="由此链接生成集合" @click="createCollectionFromUrl(item.urlLinkId)">
                  <i class="fas fa-folder-plus" aria-hidden="true"></i>
                </button>
              </div>
            </li>
            <li v-if="!urlLinks.length" class="url-empty">还没有网址项，请点击上方链接图标在 `url-links` 中创建。</li>
          </ul>
        </section>
      </section>

      <LightAppRailEditor
        ref="railEditorRef"
        :rail-slots="appState.rail_slots"
        :collections="appState.collections"
        :url-links="urlLinks"
        @assign-slot="handleAssignSlot"
        @clear-slot="clearSlot"
        @remove-slot="clearSlot"
        @add-to-collection="addToCollection"
        @remove-collection-item="removeCollectionItem"
        @open-slot="openSlot"
        @open-collection-item="openCollectionItem"
        @rename-collection="renameCollection"
      />
    </div>

    <Teleport to="body">
      <Transition name="page-mode-overlay">
        <section
          v-if="activePageApp && activePageComponent"
          class="page-mode-overlay"
          role="dialog"
          aria-modal="true"
          :aria-label="`${activePageApp.title} 页面模式`"
          @click.self="closePageMode"
        >
          <article class="page-mode-shell liquid-material" @click.stop>
            <header class="page-mode-head">
              <div class="page-mode-title">
                <i :class="activePageApp.iconClass" aria-hidden="true"></i>
                <strong>{{ activePageApp.title }}</strong>
              </div>

              <div v-if="activePageTabItems.length" class="page-mode-tabs" role="tablist" :aria-label="`${activePageApp.title} tabs`">
                <button
                  v-for="item in activePageTabItems"
                  :key="`page_tab_${activePageCode}_${item.value}`"
                  class="tab-btn ripple-trigger"
                  :class="{ active: activePageTabCode === item.value }"
                  type="button"
                  role="tab"
                  :aria-selected="activePageTabCode === item.value"
                  :title="item.label"
                  :aria-label="item.label"
                  @click="setActivePageTab(item.value)"
                >
                  <i :class="item.iconClass" aria-hidden="true"></i>
                </button>
              </div>

              <button class="tab-btn ripple-trigger" type="button" title="关闭页面模式" aria-label="关闭页面模式" @click="closePageMode">
                <i class="fas fa-xmark" aria-hidden="true"></i>
              </button>
            </header>

            <section class="page-mode-body">
              <component :is="activePageComponent" :window-id="activePageWindowId" />
            </section>
            <p class="page-mode-foot-hint">按 Esc 或点击遮罩空白区域可关闭页面模式</p>
          </article>
        </section>
      </Transition>
    </Teleport>
  </section>
</template>

<script setup>
import { computed, nextTick, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import { onBeforeRouteLeave } from 'vue-router';
import LightAppRailEditor from '../components/lightapps/LightAppRailEditor.vue';
import BalanceLedgerWindow from '../components/lightapps/balance/BalanceLedgerWindow.vue';
import {
  BALANCE_SECTION_ITEMS,
  releaseBalanceWindowState,
  resolveBalanceWindowState,
  setBalanceWindowSection
} from '../components/lightapps/balance/balanceWindowState';
import PomodoroWindow from '../components/lightapps/pomodoro/PomodoroWindow.vue';
import {
  POMODORO_MODE_ITEMS,
  releasePomodoroWindowState,
  resolvePomodoroWindowState,
  setPomodoroWindowMode
} from '../components/lightapps/pomodoro/pomodoroWindowState';
import TimePrismTodoSuiteWindow from '../components/lightapps/timeprism/TimePrismTodoSuiteWindow.vue';
import {
  releaseTimePrismSuiteSession,
  resolveTimePrismSuiteSession,
  setSuiteActiveModule,
  TIMEPRISM_MODULE_ITEMS
} from '../components/lightapps/timeprism/timePrismSuiteState';
import UrlLinksWindow from '../components/lightapps/url/UrlLinksWindow.vue';
import { useAuthSession } from '../composables/useAuthSession';
import { listLightAppUrlLinks } from '../services/lightAppsApi';
import { openLightAppWindow } from '../utils/lightAppWindowBus';
import { LIGHT_APPS_CATALOG, getLightAppByCode, isKnownLightAppCode } from '../utils/lightAppsCatalog';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  writeRemoteLightAppCache
} from '../utils/lightAppsDataStore';
import {
  DEFAULT_COLLECTION_ID,
  applyLightAppsToPreference,
  createDefaultLightAppsState,
  notifyLightAppsChanged,
  normalizeLightAppsState,
  readLightAppsPreference,
  readLightAppsState,
  writeLightAppsState
} from '../utils/lightAppsState';

const DRAG_MIME = 'application/x-shizuki-lightapp-item';

const catalog = LIGHT_APPS_CATALOG;
const appState = ref(createDefaultLightAppsState());
const activePageCode = ref('');
const syncHint = ref('');
const urlLinks = ref([]);
const urlSourceViewMode = ref('detail');

const railEditorRef = ref(null);

const auth = useAuthSession();

const PAGE_WINDOW_IDS = Object.freeze({
  'timeprism-todo': 910001,
  'pomodoro-timer': 910002,
  'balance-ledger': 910003,
  'url-links': 910004
});

const PAGE_COMPONENT_MAP = Object.freeze({
  'timeprism-todo': TimePrismTodoSuiteWindow,
  'pomodoro-timer': PomodoroWindow,
  'balance-ledger': BalanceLedgerWindow,
  'url-links': UrlLinksWindow
});

let syncTimer = 0;
let syncHintTimer = 0;
let remoteHydrating = false;

const activePageApp = computed(() => getLightAppByCode(activePageCode.value));
const activePageWindowId = computed(() => PAGE_WINDOW_IDS[activePageCode.value] || 0);
const activePageComponent = computed(() => PAGE_COMPONENT_MAP[activePageCode.value] || null);
const hasActivePageOverlay = computed(() => Boolean(activePageApp.value && activePageComponent.value));
const isUrlSourceIconMode = computed(() => urlSourceViewMode.value === 'icon');

const activePageTabItems = computed(() => {
  if (activePageCode.value === 'timeprism-todo') {
    return TIMEPRISM_MODULE_ITEMS.map((item) => ({ value: item.code, label: item.label, iconClass: item.iconClass }));
  }
  if (activePageCode.value === 'pomodoro-timer') {
    return POMODORO_MODE_ITEMS.map((item) => ({ value: item.mode, label: item.label, iconClass: item.iconClass }));
  }
  if (activePageCode.value === 'balance-ledger') {
    return BALANCE_SECTION_ITEMS.map((item) => ({ value: item.code, label: item.label, iconClass: item.iconClass }));
  }
  return [];
});

const activePageTabCode = computed(() => {
  const windowId = activePageWindowId.value;
  if (!windowId) return '';
  if (activePageCode.value === 'timeprism-todo') {
    return resolveTimePrismSuiteSession(windowId).activeModule;
  }
  if (activePageCode.value === 'pomodoro-timer') {
    return resolvePomodoroWindowState(windowId).mode;
  }
  if (activePageCode.value === 'balance-ledger') {
    return resolveBalanceWindowState(windowId).section;
  }
  return '';
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

function toggleUrlSourceViewMode() {
  urlSourceViewMode.value = isUrlSourceIconMode.value ? 'detail' : 'icon';
}

function toCompactTitle(value) {
  const title = String(value || '').trim();
  if (!title) return '网址';
  if (title.length <= 4) return title;
  return `${title.slice(0, 4)}..`;
}

function isEnabled(code) {
  return appState.value.enabled_codes.includes(code);
}

function isInRailSlots(code) {
  return (appState.value.rail_slots || []).some((slot) => slot.enabled && slot.item_kind === 'app' && slot.item_ref === code);
}

function compactRailSlots(slots) {
  const normalized = (Array.isArray(slots) ? slots : [])
    .map((slot) => ({
      enabled: Boolean(slot?.enabled),
      item_kind: String(slot?.item_kind || '').trim().toLowerCase() || 'app',
      item_ref: String(slot?.item_ref || '').trim()
    }))
    .filter((slot) => slot.enabled && slot.item_ref);

  while (normalized.length < 8) {
    normalized.push({ enabled: false, item_kind: 'app', item_ref: '' });
  }

  return normalized.slice(0, 8);
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
    rail_slots: remoteState.rail_slots,
    collections: remoteState.collections,
    app_configs: {
      ...(localState.app_configs || {}),
      ...(remoteState.app_configs || {})
    }
  });
}

async function hydrateUrlLinks() {
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    urlLinks.value = Array.isArray(guest.urlLinks) ? guest.urlLinks : [];
    return;
  }

  try {
    const list = await listLightAppUrlLinks(auth.authorizedFetch);
    urlLinks.value = Array.isArray(list) ? list : [];
    writeRemoteLightAppCache({ urlLinks: urlLinks.value });
  } catch {
    const cache = readRemoteLightAppCache();
    urlLinks.value = Array.isArray(cache.urlLinks) ? cache.urlLinks : [];
  }
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
  await hydrateUrlLinks();
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

const DEFAULT_COLLECTION_TITLE = '集合';

function normalizeCollectionItems(items) {
  const dedup = new Set();
  return (Array.isArray(items) ? items : [])
    .map((item) => ({
      item_kind: String(item?.item_kind || '').trim().toLowerCase(),
      item_ref: String(item?.item_ref || '').trim()
    }))
    .filter((item) => {
      if (!item.item_ref) return false;
      if (!['app', 'url'].includes(item.item_kind)) return false;
      const key = `${item.item_kind}:${item.item_ref}`;
      if (dedup.has(key)) return false;
      dedup.add(key);
      return true;
    });
}

function normalizeCollections(collectionsInput) {
  const source = Array.isArray(collectionsInput) ? collectionsInput : [];
  const dedupIds = new Set();
  const normalized = source
    .map((entry) => ({
      collection_id: String(entry?.collection_id || '').trim(),
      title: String(entry?.title || '').trim() || DEFAULT_COLLECTION_TITLE,
      items: normalizeCollectionItems(entry?.items)
    }))
    .filter((entry) => {
      if (!entry.collection_id) return false;
      if (dedupIds.has(entry.collection_id)) return false;
      dedupIds.add(entry.collection_id);
      return true;
    });

  if (normalized.length) return normalized;
  return [{
    collection_id: DEFAULT_COLLECTION_ID,
    title: DEFAULT_COLLECTION_TITLE,
    items: []
  }];
}

function cloneCollections(state) {
  return normalizeCollections(state?.collections).map((entry) => ({
    collection_id: entry.collection_id,
    title: entry.title,
    items: normalizeCollectionItems(entry.items)
  }));
}

function cleanupCollections(collectionsInput) {
  const normalized = normalizeCollections(collectionsInput).map((entry) => ({
    ...entry,
    items: normalizeCollectionItems(entry.items)
  }));
  const nonEmpty = normalized.filter((entry) => entry.items.length > 0);
  if (nonEmpty.length) return nonEmpty;
  return [{
    collection_id: DEFAULT_COLLECTION_ID,
    title: DEFAULT_COLLECTION_TITLE,
    items: []
  }];
}

function findCollectionIndex(collections, collectionId) {
  const targetId = String(collectionId || '').trim();
  if (!targetId) return -1;
  return collections.findIndex((entry) => entry.collection_id === targetId);
}

function resolveCollectionId(collectionsInput, preferredId = '') {
  const collections = normalizeCollections(collectionsInput);
  const preferred = String(preferredId || '').trim();
  if (preferred && collections.some((entry) => entry.collection_id === preferred)) {
    return preferred;
  }
  return collections[0]?.collection_id || DEFAULT_COLLECTION_ID;
}

function toUniqueCollectionTitle(collectionsInput, rawTitle, excludeCollectionId = '') {
  const collections = normalizeCollections(collectionsInput);
  const base = String(rawTitle || '').trim() || DEFAULT_COLLECTION_TITLE;
  const normalizedBase = base.toLowerCase();
  const reserved = new Set(
    collections
      .filter((entry) => entry.collection_id !== excludeCollectionId)
      .map((entry) => String(entry.title || '').trim().toLowerCase())
      .filter(Boolean)
  );
  if (!reserved.has(normalizedBase)) return base;
  let nextIndex = 2;
  while (reserved.has(`${normalizedBase} (${nextIndex})`)) {
    nextIndex += 1;
  }
  return `${base} (${nextIndex})`;
}

function createCollectionId(collectionsInput) {
  const collections = normalizeCollections(collectionsInput);
  const existing = new Set(collections.map((entry) => entry.collection_id));
  let nextId = `col_${createLocalEntityId()}`;
  while (existing.has(nextId)) {
    nextId = `col_${createLocalEntityId()}`;
  }
  return nextId;
}

function withCollections(state, collections, cleanupEmpty = true) {
  return {
    ...state,
    collections: cleanupEmpty ? cleanupCollections(collections) : normalizeCollections(collections)
  };
}

function removeAppRefsFromState(code, state) {
  const slots = compactRailSlots((state.rail_slots || []).map((slot) => {
    if (slot.item_kind === 'app' && slot.item_ref === code) {
      return { enabled: false, item_kind: 'app', item_ref: '' };
    }
    return slot;
  }));

  const nextCollections = cloneCollections(state).map((entry) => ({
    ...entry,
    items: entry.items.filter((item) => !(item.item_kind === 'app' && item.item_ref === code))
  }));

  return withCollections({
    ...state,
    rail_slots: slots,
  }, nextCollections, true);
}

function toggleEnabled(code) {
  if (!isKnownLightAppCode(code)) return;

  const enabledSet = new Set(appState.value.enabled_codes);
  const nextConfigs = {
    ...(appState.value.app_configs || {})
  };

  let nextState = { ...appState.value };

  if (enabledSet.has(code)) {
    enabledSet.delete(code);
    nextState = removeAppRefsFromState(code, nextState);
    delete nextConfigs[code];
    if (activePageCode.value === code) {
      closePageMode();
    }
    showHint('应用已停用。');
  } else {
    enabledSet.add(code);
    nextConfigs[code] = nextConfigs[code] && typeof nextConfigs[code] === 'object' ? nextConfigs[code] : {};
    showHint('应用已启用。');
  }

  persistState({
    ...nextState,
    enabled_codes: Array.from(enabledSet),
    app_configs: nextConfigs
  });
}

function findFirstAvailableSlot(slots) {
  return slots.findIndex((slot) => !slot.enabled || !slot.item_ref);
}

function toggleAppInRail(code) {
  if (!isEnabled(code)) {
    showHint('请先启用该应用。');
    return;
  }

  const nextSlots = (appState.value.rail_slots || []).slice();
  const existingIndex = nextSlots.findIndex((slot) => slot.enabled && slot.item_kind === 'app' && slot.item_ref === code);

  if (existingIndex >= 0) {
    nextSlots[existingIndex] = {
      enabled: false,
      item_kind: 'app',
      item_ref: ''
    };
    persistState({
      ...appState.value,
      rail_slots: compactRailSlots(nextSlots)
    });
    showHint('已移出右栏。');
    return;
  }

  const targetIndex = findFirstAvailableSlot(nextSlots);
  if (targetIndex < 0) {
    showHint('右栏已满（最多 8 槽）。');
    return;
  }

  nextSlots[targetIndex] = {
    enabled: true,
    item_kind: 'app',
    item_ref: code
  };

  persistState({
    ...appState.value,
    rail_slots: compactRailSlots(nextSlots)
  });
  showHint('已加入右栏。');
}

function setDragPayload(event, payload) {
  if (!event?.dataTransfer) return;
  event.dataTransfer.setData(DRAG_MIME, JSON.stringify(payload));
  event.dataTransfer.effectAllowed = 'copyMove';
}

function onAppDragStart(app, event) {
  setDragPayload(event, {
    item_kind: 'app',
    item_ref: app.code,
    source: { type: 'palette-app' }
  });
}

function onUrlDragStart(item, event) {
  setDragPayload(event, {
    item_kind: 'url',
    item_ref: String(item.urlLinkId),
    source: { type: 'palette-url' }
  });
}

function normalizePayload(payload) {
  const itemKind = String(payload?.item_kind || '').trim().toLowerCase();
  const itemRef = String(payload?.item_ref || '').trim();
  if (!itemRef) return null;
  if (!['app', 'url', 'collection', 'picker'].includes(itemKind)) return null;
  return {
    item_kind: itemKind,
    item_ref: itemRef,
    source: payload?.source || null
  };
}

function handleAssignSlot({ slotIndex, payload }) {
  const targetIndex = Number(slotIndex);
  if (!Number.isInteger(targetIndex) || targetIndex < 0 || targetIndex >= 8) return;

  const normalizedPayload = normalizePayload(payload);
  if (!normalizedPayload) return;

  let nextState = {
    ...appState.value,
    rail_slots: (appState.value.rail_slots || []).slice(),
    collections: (appState.value.collections || []).map((item) => ({ ...item, items: Array.isArray(item.items) ? item.items.slice() : [] })),
    enabled_codes: appState.value.enabled_codes.slice()
  };

  if (normalizedPayload.item_kind === 'app' && !nextState.enabled_codes.includes(normalizedPayload.item_ref)) {
    nextState.enabled_codes = [...nextState.enabled_codes, normalizedPayload.item_ref];
  }

  const collectionId = normalizedPayload.item_kind === 'collection'
    ? resolveCollectionId(nextState.collections, normalizedPayload.item_ref)
    : '';

  nextState.rail_slots[targetIndex] = {
    enabled: true,
    item_kind: normalizedPayload.item_kind,
    item_ref: normalizedPayload.item_kind === 'collection' ? collectionId : normalizedPayload.item_ref
  };

  if (normalizedPayload.source?.type === 'slot') {
    const fromIndex = Number(normalizedPayload.source.index);
    if (Number.isInteger(fromIndex) && fromIndex >= 0 && fromIndex < 8 && fromIndex !== targetIndex) {
      nextState.rail_slots[fromIndex] = {
        enabled: false,
        item_kind: 'app',
        item_ref: ''
      };
    }
  }

  if (normalizedPayload.source?.type === 'collection-item' || normalizedPayload.source?.type === 'collection') {
    const sourceCollectionId = String(
      normalizedPayload.source.collectionId || normalizedPayload.source.collection_id || ''
    ).trim();
    const fromIndex = Number(normalizedPayload.source.index);
    if (Number.isInteger(fromIndex) && fromIndex >= 0) {
      const nextCollections = cloneCollections(nextState);
      const targetCollectionId = resolveCollectionId(nextCollections, sourceCollectionId);
      const collectionIndex = findCollectionIndex(nextCollections, targetCollectionId);
      if (collectionIndex >= 0) {
        nextCollections[collectionIndex] = {
          ...nextCollections[collectionIndex],
          items: nextCollections[collectionIndex].items.filter((_, index) => index !== fromIndex)
        };
        nextState = withCollections(nextState, nextCollections, true);
      }
    }
  }

  nextState.rail_slots = compactRailSlots(nextState.rail_slots);
  persistState(nextState);
}

function clearSlot(index) {
  const targetIndex = Number(index);
  if (!Number.isInteger(targetIndex) || targetIndex < 0 || targetIndex >= 8) return;
  const nextSlots = (appState.value.rail_slots || []).slice();
  nextSlots[targetIndex] = {
    enabled: false,
    item_kind: 'app',
    item_ref: ''
  };
  persistState({
    ...appState.value,
    rail_slots: compactRailSlots(nextSlots)
  });
}

function addToCollection(input) {
  const normalizedPayload = normalizePayload(input?.payload || input);
  if (!normalizedPayload) return;
  if (!['app', 'url'].includes(normalizedPayload.item_kind)) return;

  let nextState = {
    ...appState.value,
    enabled_codes: appState.value.enabled_codes.slice(),
    collections: cloneCollections(appState.value)
  };

  if (normalizedPayload.item_kind === 'app' && !nextState.enabled_codes.includes(normalizedPayload.item_ref)) {
    nextState.enabled_codes = [...nextState.enabled_codes, normalizedPayload.item_ref];
  }

  const targetCollectionId = resolveCollectionId(nextState.collections, input?.targetCollectionId);
  const targetCollectionIndex = findCollectionIndex(nextState.collections, targetCollectionId);
  if (targetCollectionIndex < 0) return;

  const current = Array.isArray(nextState.collections[targetCollectionIndex].items)
    ? nextState.collections[targetCollectionIndex].items
    : [];
  const key = `${normalizedPayload.item_kind}:${normalizedPayload.item_ref}`;
  const dedupe = new Set(current.map((item) => `${item.item_kind}:${item.item_ref}`));
  let nextItems = current;
  if (!dedupe.has(key)) {
    nextItems = [
      ...current,
      {
        item_kind: normalizedPayload.item_kind,
        item_ref: normalizedPayload.item_ref
      }
    ];
  }

  nextState.collections[targetCollectionIndex] = {
    ...nextState.collections[targetCollectionIndex],
    items: normalizeCollectionItems(nextItems)
  };

  if (normalizedPayload.source?.type === 'collection-item' || normalizedPayload.source?.type === 'collection') {
    const sourceCollectionId = String(
      normalizedPayload.source.collectionId || normalizedPayload.source.collection_id || ''
    ).trim();
    const fromIndex = Number(normalizedPayload.source.index);
    if (Number.isInteger(fromIndex) && fromIndex >= 0) {
      const sourceId = resolveCollectionId(nextState.collections, sourceCollectionId);
      const sourceIndex = findCollectionIndex(nextState.collections, sourceId);
      if (sourceIndex >= 0) {
        nextState.collections[sourceIndex] = {
          ...nextState.collections[sourceIndex],
          items: nextState.collections[sourceIndex].items.filter((_, index) => index !== fromIndex)
        };
      }
    }
  }

  persistState(withCollections(nextState, nextState.collections, true));
}

function removeCollectionItem(payload) {
  const targetCollectionId = String(payload?.collectionId || payload?.collection_id || '').trim();
  const targetIndex = Number(payload?.index);
  if (!Number.isInteger(targetIndex) || targetIndex < 0) return;

  const nextCollections = cloneCollections(appState.value);
  const collectionId = resolveCollectionId(nextCollections, targetCollectionId);
  const collectionIndex = findCollectionIndex(nextCollections, collectionId);
  if (collectionIndex < 0) return;

  nextCollections[collectionIndex] = {
    ...nextCollections[collectionIndex],
    items: nextCollections[collectionIndex].items.filter((_, itemIndex) => itemIndex !== targetIndex)
  };
  persistState(withCollections(appState.value, nextCollections, true));
}

function createCollectionFromUrl(urlLinkId) {
  const link = findUrlLink(urlLinkId);
  if (!link) {
    showHint('链接不存在或已失效。');
    return;
  }

  const nextCollections = cloneCollections(appState.value);
  const title = toUniqueCollectionTitle(nextCollections, link.title || '网址集合');
  const collectionId = createCollectionId(nextCollections);
  nextCollections.push({
    collection_id: collectionId,
    title,
    items: [{
      item_kind: 'url',
      item_ref: String(link.urlLinkId)
    }]
  });

  persistState(withCollections(appState.value, nextCollections, true));
  railEditorRef.value?.focusCollection?.(collectionId, true);
  showHint('已创建集合文件夹。');
}

function renameCollection(payload) {
  const collectionId = String(payload?.collectionId || payload?.collection_id || '').trim();
  const nextTitleRaw = String(payload?.title || '').trim();
  if (!collectionId || !nextTitleRaw) return;

  const nextCollections = cloneCollections(appState.value);
  const targetIndex = findCollectionIndex(nextCollections, collectionId);
  if (targetIndex < 0) return;

  const uniqueTitle = toUniqueCollectionTitle(nextCollections, nextTitleRaw, collectionId);
  nextCollections[targetIndex] = {
    ...nextCollections[targetIndex],
    title: uniqueTitle
  };

  persistState(withCollections(appState.value, nextCollections, false));
}

function assignPaletteToFirstSlot(itemKind, itemRef) {
  const nextSlots = (appState.value.rail_slots || []).slice();
  const targetIndex = findFirstAvailableSlot(nextSlots);
  if (targetIndex < 0) {
    showHint('右栏已满（最多 8 槽）。');
    return;
  }
  handleAssignSlot({
    slotIndex: targetIndex,
    payload: {
      item_kind: itemKind,
      item_ref: itemRef,
      source: { type: 'palette-button' }
    }
  });
}

function addPaletteToCollection(itemKind, itemRef) {
  addToCollection({
    item_kind: itemKind,
    item_ref: itemRef,
    source: { type: 'palette-button' }
  });
}

function openSlot(slot) {
  if (!slot?.enabled) return;
  if (slot.item_kind === 'app') {
    useApp(slot.item_ref);
    return;
  }
  if (slot.item_kind === 'url') {
    openUrlLink(slot.item_ref);
    return;
  }
  if (slot.item_kind === 'collection') {
    railEditorRef.value?.focusCollection?.(slot.item_ref, true);
    showHint('已定位到对应文件夹。');
    return;
  }
  if (slot.item_kind === 'picker') {
    showHint('请选择右侧集合或直接放置应用。');
  }
}

function openCollectionItem(payload) {
  const item = payload?.item || payload;
  if (!item) return;
  if (item.item_kind === 'app') {
    useApp(item.item_ref);
    return;
  }
  if (item.item_kind === 'url') {
    openUrlLink(item.item_ref);
  }
}

function useApp(code) {
  const app = getLightAppByCode(code);
  if (!app || !isEnabled(code)) return;
  openLightAppWindow(code, { source: 'apps_center' });
}

function openUrlManager() {
  if (!isEnabled('url-links')) {
    toggleEnabled('url-links');
  }
  openLightAppWindow('url-links', { source: 'apps_center_url' });
}

function openAppInPage(code) {
  const app = getLightAppByCode(code);
  if (!app || !isEnabled(code)) return;
  activePageCode.value = code;
  const windowId = PAGE_WINDOW_IDS[code];
  if (code === 'timeprism-todo') {
    resolveTimePrismSuiteSession(windowId);
  } else if (code === 'pomodoro-timer') {
    resolvePomodoroWindowState(windowId);
  } else if (code === 'balance-ledger') {
    resolveBalanceWindowState(windowId);
  }
}

function closePageMode() {
  activePageCode.value = '';
}

function setActivePageTab(tabCode) {
  const windowId = activePageWindowId.value;
  if (!windowId) return;

  if (activePageCode.value === 'timeprism-todo') {
    const session = resolveTimePrismSuiteSession(windowId);
    setSuiteActiveModule(session, tabCode);
    return;
  }

  if (activePageCode.value === 'pomodoro-timer') {
    setPomodoroWindowMode(windowId, tabCode);
    return;
  }

  if (activePageCode.value === 'balance-ledger') {
    setBalanceWindowSection(windowId, tabCode);
  }
}

function onOverlayKeydown(event) {
  if (!hasActivePageOverlay.value) return;
  if (event.key === 'Escape') {
    closePageMode();
  }
}

function findUrlLink(urlLinkId) {
  const target = String(urlLinkId || '').trim();
  if (!target) return null;
  return urlLinks.value.find((item) => String(item.urlLinkId) === target) || null;
}

function openUrlLink(urlLinkId) {
  const item = findUrlLink(urlLinkId);
  if (!item?.url) {
    showHint('网址不存在或已失效。');
    return;
  }
  window.open(item.url, '_blank', 'noopener,noreferrer');
}

async function runBallRailAnimation(direction) {
  if (typeof window === 'undefined' || typeof document === 'undefined') return;
  const reduceMotion = window.matchMedia('(prefers-reduced-motion: reduce)').matches;
  if (reduceMotion) return;

  const railHost = railEditorRef.value?.$el || railEditorRef.value;
  const ball = document.querySelector('.float-ball');
  if (!railHost || !ball) return;

  const railRect = railHost.getBoundingClientRect();
  const ballRect = ball.getBoundingClientRect();

  const startRect = direction === 'in' ? ballRect : railRect;
  const endRect = direction === 'in' ? railRect : ballRect;

  if (!startRect || !endRect || !startRect.width || !startRect.height || !endRect.width || !endRect.height) {
    return;
  }

  const ghost = document.createElement('div');
  ghost.className = 'apps-rail-ghost';
  ghost.style.left = `${startRect.left}px`;
  ghost.style.top = `${startRect.top}px`;
  ghost.style.width = `${startRect.width}px`;
  ghost.style.height = `${startRect.height}px`;
  ghost.style.borderRadius = direction === 'in' ? '28px' : '16px';
  document.body.appendChild(ghost);

  try {
    const animation = ghost.animate(
      [
        {
          left: `${startRect.left}px`,
          top: `${startRect.top}px`,
          width: `${startRect.width}px`,
          height: `${startRect.height}px`,
          borderRadius: direction === 'in' ? '28px' : '16px',
          opacity: 0.88
        },
        {
          left: `${endRect.left}px`,
          top: `${endRect.top}px`,
          width: `${endRect.width}px`,
          height: `${endRect.height}px`,
          borderRadius: direction === 'in' ? '16px' : '28px',
          opacity: 0.24
        }
      ],
      {
        duration: 420,
        easing: 'cubic-bezier(0.2, 0.88, 0.34, 1)',
        fill: 'forwards'
      }
    );
    await animation.finished;
  } catch {
    // ignore animation interruptions
  } finally {
    ghost.remove();
  }
}

watch(hasActivePageOverlay, (open) => {
  if (typeof document === 'undefined') return;
  document.body.classList.toggle('apps-page-overlay-open', open);
});

onMounted(async () => {
  if (typeof window !== 'undefined') {
    window.addEventListener('keydown', onOverlayKeydown);
  }

  await hydrateState();
  await nextTick();
  await runBallRailAnimation('in');
  if (typeof document !== 'undefined') {
    document.body.classList.add('apps-rail-mode');
  }
});

onBeforeRouteLeave(async () => {
  closePageMode();
  if (typeof document !== 'undefined') {
    document.body.classList.remove('apps-page-overlay-open');
    document.body.classList.remove('apps-rail-mode');
  }
  await runBallRailAnimation('out');
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

  releaseTimePrismSuiteSession(PAGE_WINDOW_IDS['timeprism-todo']);
  releasePomodoroWindowState(PAGE_WINDOW_IDS['pomodoro-timer']);
  releaseBalanceWindowState(PAGE_WINDOW_IDS['balance-ledger']);

  if (typeof window !== 'undefined') {
    window.removeEventListener('keydown', onOverlayKeydown);
  }
  if (typeof document !== 'undefined') {
    document.body.classList.remove('apps-page-overlay-open');
    document.body.classList.remove('apps-rail-mode');
  }
});
</script>

<style scoped>
.apps-route {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
}

.apps-layout {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 190px;
  gap: 12px;
}

.apps-main {
  --liquid-bg: rgba(14, 22, 36, 0.58);
  border-radius: 16px;
  padding: 12px;
  display: grid;
  gap: 12px;
}

.apps-main-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 12px;
}

.apps-main-head h2 {
  margin: 0;
  font-size: 18px;
}

.apps-main-head span {
  color: rgba(217, 226, 247, 0.74);
  font-size: 12px;
}

.sync-hint {
  margin: 0;
  padding: 4px 10px;
  border: 1px solid rgba(162, 233, 197, 0.36);
  border-radius: 10px;
  background: rgba(98, 177, 142, 0.14);
  color: rgba(168, 236, 200, 0.92);
  font-size: 13px;
}

.catalog-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
  gap: 10px;
}

.app-card {
  position: relative;
  border: 1px solid rgba(255, 255, 255, 0.14);
  border-radius: 12px;
  padding: 10px;
  background: rgba(11, 16, 28, 0.5);
  display: grid;
  gap: 9px;
  transition:
    transform 180ms ease,
    border-color 180ms ease,
    box-shadow 220ms ease,
    background-color 180ms ease;
}

.app-card:hover {
  transform: translateY(-2px);
  border-color: rgba(188, 215, 255, 0.38);
  background: rgba(14, 20, 34, 0.58);
  box-shadow: 0 10px 24px rgba(5, 9, 18, 0.22);
}

.app-card.enabled {
  border-color: rgba(var(--accent-rgb), 0.45);
}

.app-card.floating {
  box-shadow: 0 0 0 1px rgba(151, 221, 190, 0.4);
}

.card-head {
  display: grid;
  grid-template-columns: 30px minmax(0, 1fr);
  gap: 8px;
}

.card-icon-drag {
  width: 30px;
  height: 30px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.26);
  background: rgba(255, 255, 255, 0.16);
  color: rgba(234, 242, 255, 0.9);
  display: inline-flex;
  align-items: center;
  justify-content: center;
  transition:
    transform 150ms ease,
    border-color 150ms ease,
    background-color 150ms ease;
}

.card-icon-drag:hover {
  transform: translateY(-1px);
  border-color: rgba(var(--accent-rgb), 0.5);
  background: rgba(var(--accent-rgb), 0.2);
}

.card-icon-drag i {
  font-size: 16px;
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
  grid-template-columns: repeat(4, minmax(0, 1fr));
  gap: 8px;
}

.card-mobile-actions {
  display: none;
  gap: 6px;
}

.action-btn {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 10px;
  background: rgba(21, 29, 47, 0.62);
  color: rgba(236, 243, 255, 0.94);
  padding: 7px 10px;
  font-size: 12px;
  transition:
    transform 150ms ease,
    background-color 150ms ease,
    border-color 150ms ease,
    box-shadow 180ms ease;
}

.action-btn:hover:not(:disabled) {
  transform: translateY(-1px);
  border-color: rgba(var(--accent-rgb), 0.48);
  background: rgba(27, 37, 58, 0.72);
  box-shadow: 0 6px 16px rgba(5, 10, 20, 0.2);
}

.action-btn:disabled {
  opacity: 0.46;
  cursor: not-allowed;
}

.url-source-block {
  --liquid-bg: rgba(13, 20, 33, 0.56);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.block-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
}

.block-head h3 {
  margin: 0;
  font-size: 15px;
}

.block-head-actions {
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.url-source-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.url-source-list.icon-mode {
  grid-template-columns: repeat(auto-fill, minmax(96px, 1fr));
  gap: 10px;
}

.url-source-item {
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.12);
  display: grid;
  grid-template-columns: 30px minmax(0, 1fr) auto;
  align-items: center;
  gap: 8px;
  padding: 8px;
}

.url-source-item.icon-mode {
  grid-template-columns: 1fr;
  justify-items: center;
  gap: 6px;
  padding: 8px 6px;
}

.url-source-icon {
  width: 30px;
  height: 30px;
  border-radius: 999px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(255, 255, 255, 0.16);
  color: rgba(232, 241, 255, 0.9);
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.url-source-icon img,
.url-source-icon i {
  width: 17px;
  height: 17px;
  border-radius: 999px;
  object-fit: cover;
}

.url-source-item.icon-mode .url-source-icon {
  width: 34px;
  height: 34px;
}

.url-source-item.icon-mode .url-source-icon img,
.url-source-item.icon-mode .url-source-icon i {
  width: 20px;
  height: 20px;
}

.url-source-main {
  border: 0;
  background: transparent;
  display: block;
  text-align: left;
  color: inherit;
}

.url-source-item.icon-mode .url-source-main {
  width: 100%;
  text-align: center;
}

.url-source-main p {
  margin: 0;
  color: rgba(240, 246, 255, 0.95);
}

.url-source-item.icon-mode .url-source-main p {
  max-width: 100%;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  font-size: 12px;
}

.url-source-main small {
  color: rgba(212, 224, 247, 0.7);
}

.url-source-actions {
  display: inline-flex;
  gap: 6px;
}

.url-source-item.icon-mode .url-source-actions {
  width: 100%;
  justify-content: center;
  flex-wrap: wrap;
}

.url-empty {
  margin: 0;
  color: rgba(206, 219, 241, 0.72);
  font-size: 12px;
}

.page-mode-shell {
  --liquid-bg: rgba(16, 24, 40, 0.74);
  --liquid-border: rgba(255, 255, 255, 0.34);
  --liquid-shadow: 0 28px 72px rgba(4, 7, 14, 0.5);
  width: min(1320px, calc(100vw - 34px));
  max-height: calc(100vh - 32px);
  border: 1px solid rgba(255, 255, 255, 0.2);
  border-radius: 16px;
  background: rgba(10, 16, 28, 0.42);
  display: grid;
  gap: 10px;
  padding: 12px;
  overflow: hidden;
}

.page-mode-head {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  align-items: center;
  gap: 8px;
}

.page-mode-title {
  display: inline-flex;
  align-items: center;
  gap: 8px;
  color: rgba(237, 244, 255, 0.96);
}

.page-mode-tabs {
  justify-self: center;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  padding: 4px 8px;
  border-radius: 999px;
  background: rgba(255, 255, 255, 0.1);
  border: 1px solid rgba(255, 255, 255, 0.18);
}

.tab-btn,
.icon-btn {
  width: 30px;
  height: 30px;
  border-radius: 9px;
  border: 1px solid rgba(255, 255, 255, 0.24);
  background: rgba(20, 28, 45, 0.56);
  color: rgba(236, 243, 255, 0.95);
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease,
    box-shadow 180ms ease;
}

.tab-btn:hover,
.icon-btn:hover {
  transform: translateY(-1px);
  border-color: rgba(193, 217, 255, 0.46);
  background: rgba(27, 37, 58, 0.7);
}

.tab-btn.active {
  border-color: rgba(var(--accent-rgb), 0.62);
  background: rgba(var(--accent-rgb), 0.22);
  color: rgba(244, 248, 255, 0.98);
}

.page-mode-body {
  min-height: 60vh;
  max-height: calc(100vh - 130px);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.08);
  border: 1px solid rgba(255, 255, 255, 0.14);
  padding: 10px;
  overflow: auto;
}

.page-mode-foot-hint {
  margin: 0;
  font-size: 12px;
  color: rgba(213, 226, 249, 0.72);
}

.page-mode-overlay {
  position: fixed;
  inset: 0;
  z-index: 2500;
  padding: 16px;
  display: grid;
  place-items: center;
  background: rgba(8, 12, 21, 0.5);
  backdrop-filter: blur(5px);
}

.page-mode-overlay-enter-active,
.page-mode-overlay-leave-active {
  transition: opacity 240ms ease;
}

.page-mode-overlay-enter-active .page-mode-shell,
.page-mode-overlay-leave-active .page-mode-shell {
  transition:
    transform 260ms cubic-bezier(0.2, 0.88, 0.34, 1),
    opacity 200ms ease;
}

.page-mode-overlay-enter-from,
.page-mode-overlay-leave-to {
  opacity: 0;
}

.page-mode-overlay-enter-from .page-mode-shell,
.page-mode-overlay-leave-to .page-mode-shell {
  opacity: 0;
  transform: translateY(10px) scale(0.97);
}

.page-mode-overlay-enter-to .page-mode-shell,
.page-mode-overlay-leave-from .page-mode-shell {
  opacity: 1;
  transform: translateY(0) scale(1);
}

:global(body.apps-page-overlay-open) {
  overflow: hidden;
}

:global(body.apps-rail-mode .float-ball) {
  opacity: 0;
  pointer-events: none;
  transform: translate3d(0, -14px, 0);
  transition: opacity 200ms ease, transform 280ms ease;
}

:global(.apps-rail-ghost) {
  position: fixed;
  z-index: 2600;
  pointer-events: none;
  border: 1px solid rgba(255, 255, 255, 0.3);
  background: rgba(255, 255, 255, 0.16);
  backdrop-filter: blur(8px);
  box-shadow: 0 20px 38px rgba(5, 8, 16, 0.24);
}

@media (max-width: 980px) {
  .apps-layout {
    grid-template-columns: 1fr;
  }

  .card-actions {
    grid-template-columns: 1fr 1fr;
  }

  .card-mobile-actions {
    display: inline-flex;
  }

  .url-source-item {
    grid-template-columns: 1fr;
  }

  .page-mode-head {
    grid-template-columns: 1fr;
    justify-items: flex-start;
  }

  .page-mode-tabs {
    justify-self: flex-start;
    flex-wrap: wrap;
  }

  .page-mode-shell {
    width: calc(100vw - 14px);
    max-height: calc(100vh - 12px);
    padding: 10px;
  }

  .page-mode-overlay {
    padding: 6px;
  }
}

@media (prefers-reduced-motion: reduce) {
  .app-card,
  .action-btn,
  .tab-btn,
  .icon-btn,
  .page-mode-overlay-enter-active,
  .page-mode-overlay-leave-active,
  .page-mode-overlay-enter-active .page-mode-shell,
  .page-mode-overlay-leave-active .page-mode-shell {
    transition-duration: 80ms !important;
    animation-duration: 80ms !important;
  }
}
</style>
