<template>
  <transition name="picker-fade">
    <div v-if="visible" class="bg-picker-mask" @click.self="$emit('close')">
      <section class="bg-picker liquid-material" role="dialog" aria-modal="true" aria-label="壁纸设置">
        <header class="workspace-header">
          <div class="workspace-brand" aria-label="Shizuki 壁纸">
            <span class="workspace-brand-mark" aria-hidden="true">▧</span>
            <span class="workspace-brand-copy">
              <strong>壁纸</strong>
              <small>SHIZUKI</small>
            </span>
          </div>

          <nav class="workspace-nav" aria-label="壁纸工作区">
            <button
              type="button"
              class="workspace-tab ripple-trigger"
              :class="{ active: workspaceSection === 'installed' }"
              :aria-current="workspaceSection === 'installed' ? 'page' : undefined"
              @click="setWorkspaceSection('installed')"
            >
              我的壁纸
            </button>
            <button
              type="button"
              class="workspace-tab ripple-trigger"
              :class="{ active: workspaceSection === 'discover' }"
              :aria-current="workspaceSection === 'discover' ? 'page' : undefined"
              @click="setWorkspaceSection('discover')"
            >
              发现
            </button>
            <button
              type="button"
              class="workspace-tab ripple-trigger"
              :class="{ active: workspaceSection === 'workshop' }"
              :aria-current="workspaceSection === 'workshop' ? 'page' : undefined"
              @click="setWorkspaceSection('workshop')"
            >
              创意工坊
            </button>
          </nav>

          <div class="workspace-head-actions">
            <button
              type="button"
              class="head-action ripple-trigger"
              :class="{ active: addPanelOpen }"
              :aria-expanded="addPanelOpen"
              @click="addPanelOpen = !addPanelOpen"
            >
              ＋ 添加壁纸
            </button>
            <button type="button" class="workspace-close ripple-trigger" aria-label="关闭" @click="$emit('close')">×</button>
          </div>
        </header>

        <section v-if="addPanelOpen" class="add-wallpaper-panel" aria-label="添加壁纸">
          <div v-if="!isAuthenticated" class="compact-empty">登录后可上传或导入壁纸。</div>
          <div v-else class="add-wallpaper-grid">
            <section class="add-card">
              <div class="add-card-title">
                <strong>本地文件</strong>
                <span v-if="importState.packageFile" class="file-name">{{ importState.packageFile.name }}</span>
              </div>
              <div
                class="package-dropzone"
                :class="{ active: packageDropActive }"
                @dragenter.prevent="$emit('package-drag-enter', $event)"
                @dragover.prevent="$emit('package-drag-over', $event)"
                @dragleave.prevent="$emit('package-drag-leave', $event)"
                @drop.prevent="$emit('package-drop', $event)"
              >
                <input type="file" accept=".zip,image/*,video/*" aria-label="选择壁纸文件" @change="$emit('package-file-change', $event)" />
              </div>
              <input v-model.trim="importState.packageTitle" class="field-control" type="text" placeholder="标题（可选）" />
              <select v-model="importState.packageVisibility" class="field-control" aria-label="本地壁纸可见性">
                <option value="PRIVATE">私有</option>
                <option value="PUBLIC">公开</option>
              </select>
              <button
                type="button"
                class="primary-action ripple-trigger"
                :disabled="importState.busy || !importState.packageFile"
                @click="$emit('submit-package-import')"
              >
                上传
              </button>
            </section>

            <section class="add-card">
              <div class="add-card-title"><strong>Workshop 链接</strong></div>
              <input
                v-model.trim="importState.workshopUrl"
                class="field-control wide-field"
                type="url"
                placeholder="粘贴 Workshop 条目链接"
              />
              <input v-model.trim="importState.workshopTitle" class="field-control" type="text" placeholder="标题（可选）" />
              <select v-model="importState.workshopVisibility" class="field-control" aria-label="Workshop 壁纸可见性">
                <option value="PRIVATE">私有</option>
                <option value="PUBLIC">公开</option>
              </select>
              <div class="add-actions">
                <button
                  type="button"
                  class="secondary-action ripple-trigger"
                  :disabled="!importState.workshopUrl"
                  @click="$emit('open-workshop-preview-window')"
                >
                  预览
                </button>
                <button
                  type="button"
                  class="primary-action ripple-trigger"
                  :disabled="importState.busy || !importState.workshopUrl"
                  @click="$emit('submit-workshop-import')"
                >
                  导入
                </button>
              </div>
            </section>
          </div>
        </section>

        <div v-if="hasStatusMessage" class="workspace-notice" role="status">
          <span v-if="backgroundEmergencyFallbackUsed">正在使用默认背景</span>
          <span v-if="wallpaperErrorHint">{{ wallpaperErrorHint }}</span>
          <span v-if="importState.hint">{{ importState.hint }}</span>
        </div>

        <div class="workspace-content">
          <div v-if="workspaceSection === 'installed'" class="installed-workspace">
            <main class="library-pane">
              <div class="library-toolbar">
                <div class="filter-tabs" role="group" aria-label="壁纸类型">
                  <button
                    v-for="tab in bgTabs"
                    :key="tab.key"
                    type="button"
                    class="filter-tab ripple-trigger"
                    :class="{ active: bgTab === tab.key }"
                    @click="$emit('set-bg-tab', tab.key)"
                  >
                    {{ tab.label }}
                  </button>
                </div>
                <div class="library-toolbar-end">
                  <span class="result-count">{{ filteredBackgroundItems.length }} 项</span>
                  <button
                    type="button"
                    class="icon-action ripple-trigger"
                    :disabled="wallpaperLoading"
                    aria-label="刷新壁纸库"
                    title="刷新壁纸库"
                    @click="$emit('refresh-background-library')"
                  >
                    <span :class="{ spinning: wallpaperLoading }">↻</span>
                  </button>
                </div>
              </div>

              <div v-if="filteredBackgroundItems.length" class="wallpaper-grid">
                <button
                  v-for="item in filteredBackgroundItems"
                  :key="item.id"
                  type="button"
                  class="wallpaper-card ripple-trigger"
                  :class="{ active: item.id === activeBackgroundId }"
                  :aria-pressed="item.id === activeBackgroundId"
                  @click="$emit('select-background', item.id)"
                >
                  <span class="wallpaper-thumb">
                    <img v-if="item.preview || item.src" :src="item.preview || item.src" :alt="item.name" loading="lazy" />
                    <span v-else class="preview-placeholder">无预览</span>
                    <span class="type-badge">{{ formatWallpaperType(item.type) }}</span>
                    <span v-if="item.id === activeBackgroundId" class="active-check" aria-label="当前壁纸">✓</span>
                  </span>
                  <span class="card-copy">
                    <strong>{{ item.name }}</strong>
                    <small>{{ formatWallpaperSource(item.importSource) }}</small>
                  </span>
                </button>
              </div>
              <div v-else class="library-empty">
                <span class="empty-mark" aria-hidden="true">▧</span>
                <strong>暂无壁纸</strong>
              </div>
            </main>

            <aside class="wallpaper-detail" aria-label="壁纸详情">
              <template v-if="activeBackground">
                <div class="detail-preview">
                  <img
                    v-if="activeBackground.preview || activeBackground.src"
                    :src="activeBackground.preview || activeBackground.src"
                    :alt="activeBackground.name"
                  />
                  <span v-else class="preview-placeholder">无预览</span>
                </div>

                <div class="detail-heading">
                  <div>
                    <h2>{{ activeBackground.name }}</h2>
                    <p>
                      {{ formatWallpaperType(activeBackground.type) }}
                      <span aria-hidden="true"> · </span>
                      {{ formatWallpaperSource(activeBackground.importSource) }}
                    </p>
                  </div>
                  <span v-if="activeBackground.visibility" class="visibility-badge">
                    {{ activeBackground.visibility === 'PUBLIC' ? '公开' : '私有' }}
                  </span>
                </div>

                <section v-if="activeBackground.wallpaperId && canEditActiveWallpaper" class="wallpaper-settings">
                  <label class="setting-field">
                    <span>标题</span>
                    <input v-model.trim="wallpaperSettingState.title" class="field-control" type="text" placeholder="壁纸标题" />
                  </label>

                  <div class="setting-toggles">
                    <label><input v-model="wallpaperSettingState.bgmEnabled" type="checkbox" /> BGM</label>
                    <label><input v-model="wallpaperSettingState.bgvEnabled" type="checkbox" /> BGV</label>
                  </div>

                  <label class="range-setting">
                    <span>主音量 <b>{{ formatPercent(wallpaperSettingState.masterVolume) }}</b></span>
                    <input v-model.number="wallpaperSettingState.masterVolume" type="range" min="0" max="1" step="0.01" />
                  </label>
                  <label class="range-setting">
                    <span>BGM <b>{{ formatPercent(wallpaperSettingState.bgmVolume) }}</b></span>
                    <input v-model.number="wallpaperSettingState.bgmVolume" type="range" min="0" max="1" step="0.01" />
                  </label>
                  <label class="range-setting">
                    <span>BGV <b>{{ formatPercent(wallpaperSettingState.bgvVolume) }}</b></span>
                    <input v-model.number="wallpaperSettingState.bgvVolume" type="range" min="0" max="1" step="0.01" />
                  </label>

                  <details v-if="activeCustomSchemaItems.length || activeBackground.wallpaperId" class="advanced-settings">
                    <summary>更多参数</summary>
                    <div class="advanced-content">
                      <label class="setting-field">
                        <span>BGM 资源 ID</span>
                        <input v-model.trim="wallpaperSettingState.bgmAssetIdText" class="field-control" type="text" placeholder="可选" />
                      </label>
                      <label class="setting-field">
                        <span>BGV 资源 ID</span>
                        <input v-model.trim="wallpaperSettingState.bgvAssetIdText" class="field-control" type="text" placeholder="可选" />
                      </label>
                      <div v-for="schemaItem in activeCustomSchemaItems" :key="schemaItem.key" class="custom-setting">
                        <label>{{ schemaItem.label }}</label>
                        <input
                          v-if="schemaItem.type === 'slider'"
                          v-model.number="wallpaperSettingState.customValues[schemaItem.key]"
                          type="range"
                          :min="schemaItem.min"
                          :max="schemaItem.max"
                          :step="schemaItem.step"
                        />
                        <select
                          v-else-if="schemaItem.type === 'select'"
                          v-model="wallpaperSettingState.customValues[schemaItem.key]"
                          class="field-control"
                        >
                          <option v-for="option in schemaItem.options" :key="option.value" :value="option.value">{{ option.label }}</option>
                        </select>
                        <input
                          v-else-if="schemaItem.type === 'toggle'"
                          v-model="wallpaperSettingState.customValues[schemaItem.key]"
                          type="checkbox"
                        />
                        <input
                          v-else-if="schemaItem.type === 'color'"
                          v-model="wallpaperSettingState.customValues[schemaItem.key]"
                          type="color"
                        />
                        <input
                          v-else
                          v-model="wallpaperSettingState.customValues[schemaItem.key]"
                          class="field-control"
                          type="text"
                        />
                      </div>
                    </div>
                  </details>

                  <div class="settings-actions">
                    <button
                      type="button"
                      class="primary-action ripple-trigger"
                      :disabled="wallpaperSettingState.saving"
                      @click="$emit('save-active-wallpaper-settings')"
                    >
                      {{ wallpaperSettingState.saving ? '保存中…' : '保存' }}
                    </button>
                    <button
                      type="button"
                      class="secondary-action ripple-trigger"
                      :disabled="wallpaperSettingState.visibilitySaving"
                      @click="$emit('set-active-wallpaper-visibility', 'PUBLIC')"
                    >
                      公开
                    </button>
                    <button
                      type="button"
                      class="secondary-action ripple-trigger"
                      :disabled="wallpaperSettingState.visibilitySaving"
                      @click="$emit('set-active-wallpaper-visibility', 'PRIVATE')"
                    >
                      私有
                    </button>
                    <button
                      type="button"
                      class="danger-action ripple-trigger"
                      :disabled="wallpaperSettingState.deleting"
                      @click="$emit('delete-active-wallpaper')"
                    >
                      {{ wallpaperSettingState.deleting ? '删除中…' : '删除' }}
                    </button>
                  </div>
                  <p v-if="wallpaperSettingState.error" class="setting-error">{{ wallpaperSettingState.error }}</p>
                </section>
              </template>
              <div v-else class="detail-empty">
                <span class="empty-mark" aria-hidden="true">▧</span>
                <strong>选择一张壁纸</strong>
              </div>
            </aside>
          </div>

          <WallpaperDiscoveryPanel
            v-else
            :source="onlineSource"
            :authorized-fetch="authorizedFetch"
            :is-authenticated="isAuthenticated"
            :busy="importState.busy"
            @import-workshop="$emit('discovery-import-workshop', $event)"
            @import-wallhaven="$emit('discovery-import-wallhaven', $event)"
            @select-workshop="$emit('discovery-select-workshop', $event)"
          />
        </div>

        <footer class="workspace-footer">
          <div class="route-context">
            <span class="route-dot" aria-hidden="true"></span>
            <span>{{ currentRouteLabel || '当前页面' }}</span>
            <small>{{ currentRouteBackgroundId ? '独立背景' : '沿用全局' }}</small>
          </div>

          <div class="scope-switch" role="group" aria-label="壁纸应用范围">
            <button
              type="button"
              :class="{ active: backgroundApplyTarget === 'route' }"
              @click="$emit('update:backgroundApplyTarget', 'route')"
            >
              当前页面
            </button>
            <button
              type="button"
              :class="{ active: backgroundApplyTarget === 'global' }"
              @click="$emit('update:backgroundApplyTarget', 'global')"
            >
              全局
            </button>
          </div>

          <button
            v-if="backgroundApplyTarget === 'route' && currentRouteBackgroundId"
            type="button"
            class="footer-link danger-link"
            @click="$emit('clear-current-route-background')"
          >
            清除页面设置
          </button>

          <div class="footer-spacer"></div>

          <span v-if="importState.lastImportJobId" class="job-status">
            #{{ importState.lastImportJobId }} {{ importState.lastImportJobStatus || 'PENDING' }}
          </span>
          <button
            v-if="importState.lastImportJobId"
            type="button"
            class="footer-link"
            :disabled="importState.statusBusy"
            @click="$emit('check-wallpaper-import-job')"
          >
            {{ importState.statusBusy ? '查询中…' : '查询状态' }}
          </button>
        </footer>
      </section>
    </div>
  </transition>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, ref, watch } from 'vue';
import WallpaperDiscoveryPanel from './WallpaperDiscoveryPanel.vue';

const props = defineProps({
  visible: { type: Boolean, default: false },
  pickerMode: { type: String, default: 'select' },
  bgTabs: { type: Array, default: () => [] },
  bgTab: { type: String, default: 'all' },
  backgroundApplyTarget: { type: String, default: 'route' },
  currentRouteLabel: { type: String, default: '' },
  currentRouteBackgroundId: { type: String, default: '' },
  wallpaperLoading: { type: Boolean, default: false },
  backgroundEmergencyFallbackUsed: { type: Boolean, default: false },
  wallpaperErrorHint: { type: String, default: '' },
  importState: { type: Object, default: () => ({}) },
  isAuthenticated: { type: Boolean, default: false },
  authorizedFetch: { type: Function, default: null },
  packageDropActive: { type: Boolean, default: false },
  activeBackground: { type: Object, default: null },
  canEditActiveWallpaper: { type: Boolean, default: false },
  activeCustomSchemaItems: { type: Array, default: () => [] },
  wallpaperSettingState: { type: Object, default: () => ({}) },
  filteredBackgroundItems: { type: Array, default: () => [] },
  activeBackgroundId: { type: String, default: '' },
  formatPercent: {
    type: Function,
    default: (value) => `${Math.round(Number(value || 0) * 100)}%`
  }
});

const emit = defineEmits([
  'close',
  'update:pickerMode',
  'set-bg-tab',
  'update:backgroundApplyTarget',
  'clear-current-route-background',
  'refresh-background-library',
  'package-drag-enter',
  'package-drag-over',
  'package-drag-leave',
  'package-drop',
  'package-file-change',
  'submit-package-import',
  'submit-workshop-import',
  'discovery-import-workshop',
  'discovery-import-wallhaven',
  'discovery-select-workshop',
  'open-workshop-preview-window',
  'check-wallpaper-import-job',
  'save-active-wallpaper-settings',
  'set-active-wallpaper-visibility',
  'delete-active-wallpaper',
  'select-background'
]);

const onlineSource = ref('wallhaven');
const addPanelOpen = ref(false);

const workspaceSection = computed(() => {
  if (props.pickerMode === 'select') return 'installed';
  return onlineSource.value === 'workshop' ? 'workshop' : 'discover';
});

const hasStatusMessage = computed(() => Boolean(
  props.backgroundEmergencyFallbackUsed || props.wallpaperErrorHint || props.importState?.hint
));

function setWorkspaceSection(section) {
  addPanelOpen.value = false;
  if (section === 'installed') {
    emit('update:pickerMode', 'select');
    return;
  }
  onlineSource.value = section === 'workshop' ? 'workshop' : 'wallhaven';
  emit('update:pickerMode', 'acquire');
}

function formatWallpaperType(type) {
  if (type === 'dynamic') return '动态';
  if (type === 'l2d') return 'L2D';
  return '静态';
}

function formatWallpaperSource(source) {
  const normalized = String(source || '').toUpperCase();
  if (normalized === 'WORKSHOP') return 'Workshop';
  if (normalized === 'WALLHAVEN') return 'Wallhaven';
  if (normalized === 'EMERGENCY_FALLBACK') return '默认';
  if (normalized === 'PACKAGE') return '本地';
  return normalized || '壁纸库';
}

function handleEscape(event) {
  if (event.key === 'Escape' && props.visible) emit('close');
}

watch(() => props.visible, (visible) => {
  if (!visible) addPanelOpen.value = false;
});

onMounted(() => window.addEventListener('keydown', handleEscape));
onBeforeUnmount(() => window.removeEventListener('keydown', handleEscape));
</script>

<style scoped>
.bg-picker-mask {
  position: fixed;
  inset: 0;
  z-index: 1500;
  display: grid;
  place-items: center;
  padding: 18px;
  background: rgba(20, 16, 22, 0.26);
  backdrop-filter: blur(14px) saturate(1.08);
}

.bg-picker {
  --liquid-bg: var(--theme-panel-surface, rgba(36, 28, 38, 0.84));
  --liquid-border: var(--theme-border-strong, rgba(255, 224, 208, 0.28));
  --liquid-shadow: 0 30px 90px rgba(20, 12, 18, 0.28);
  width: min(96vw, 1320px);
  height: min(90vh, 840px);
  min-height: min(680px, 90vh);
  overflow: hidden;
  border-radius: 18px;
  color: var(--theme-text-primary, rgba(255, 242, 233, 0.96));
  display: flex;
  flex-direction: column;
  isolation: isolate;
}

.workspace-header {
  min-height: 58px;
  padding: 0 12px 0 16px;
  border-bottom: 1px solid var(--theme-border, rgba(255, 224, 208, 0.2));
  background: var(--theme-surface-soft, rgba(255, 240, 235, 0.1));
  display: grid;
  grid-template-columns: minmax(150px, 0.8fr) minmax(300px, 1.8fr) minmax(190px, 0.9fr);
  align-items: stretch;
  gap: 14px;
}

.workspace-brand,
.workspace-head-actions,
.workspace-nav,
.route-context,
.scope-switch,
.library-toolbar,
.library-toolbar-end,
.detail-heading,
.settings-actions,
.add-card-title,
.add-actions {
  display: flex;
  align-items: center;
}

.workspace-brand {
  gap: 9px;
  min-width: 0;
}

.workspace-brand-mark {
  width: 30px;
  height: 30px;
  border: 1px solid var(--accent-mode-border, rgba(var(--accent-rgb), 0.42));
  border-radius: 8px;
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.12));
  color: var(--theme-text-primary);
  display: grid;
  place-items: center;
  font-size: 17px;
}

.workspace-brand-copy {
  display: grid;
  line-height: 1.05;
}

.workspace-brand-copy strong {
  font-family: var(--font-cute, var(--font-display));
  font-size: 15px;
  letter-spacing: 0.06em;
}

.workspace-brand-copy small {
  margin-top: 4px;
  color: var(--theme-text-tertiary);
  font-size: 9px;
  letter-spacing: 0.18em;
}

.workspace-nav {
  justify-content: center;
  gap: 4px;
}

.workspace-tab {
  position: relative;
  align-self: stretch;
  min-width: 92px;
  padding: 0 16px;
  border: 0 !important;
  border-radius: 0;
  background: transparent !important;
  color: var(--theme-text-secondary) !important;
  font-size: 13px;
  box-shadow: none !important;
}

.workspace-tab::after {
  content: '';
  position: absolute;
  right: 14px;
  bottom: 0;
  left: 14px;
  height: 2px;
  border-radius: 2px 2px 0 0;
  background: transparent;
}

.workspace-tab:hover,
.workspace-tab.active {
  color: var(--theme-text-primary) !important;
}

.workspace-tab.active {
  background: var(--theme-surface-soft, rgba(255, 255, 255, 0.08)) !important;
}

.workspace-tab.active::after {
  background: rgb(var(--accent-strong-rgb, var(--accent-rgb)));
  box-shadow: var(--accent-mode-glow, 0 0 18px rgba(var(--accent-rgb), 0.22));
}

.workspace-head-actions {
  justify-content: flex-end;
  gap: 8px;
}

.head-action,
.workspace-close,
.icon-action,
.primary-action,
.secondary-action,
.danger-action {
  border: 1px solid var(--theme-border, rgba(255, 224, 208, 0.24)) !important;
  background: var(--theme-surface-soft, rgba(255, 240, 235, 0.1)) !important;
  color: var(--theme-text-primary) !important;
  box-shadow: none !important;
}

.head-action {
  min-height: 32px;
  padding: 0 12px;
  border-radius: 8px;
  font-size: 12px;
}

.head-action.active,
.head-action:hover {
  border-color: var(--accent-mode-border, rgba(var(--accent-rgb), 0.42)) !important;
  background: var(--accent-mode-fill-soft, rgba(var(--accent-rgb), 0.12)) !important;
}

.workspace-close {
  width: 32px;
  height: 32px;
  border-radius: 8px;
  font-size: 21px;
  line-height: 1;
}

.workspace-close:hover {
  border-color: rgba(235, 94, 124, 0.42) !important;
  background: rgba(235, 94, 124, 0.12) !important;
}

.add-wallpaper-panel {
  padding: 10px 12px;
  border-bottom: 1px solid var(--theme-border);
  background: var(--theme-panel-surface-elevated, var(--theme-surface-elevated));
}

.add-wallpaper-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 10px;
}

.add-card {
  min-width: 0;
  padding: 9px;
  border: 1px solid var(--theme-border);
  border-radius: 10px;
  background: var(--theme-surface-soft);
  display: grid;
  grid-template-columns: minmax(130px, 1.4fr) minmax(105px, 0.8fr) 92px auto;
  align-items: center;
  gap: 8px;
}

.add-card-title {
  grid-column: 1 / -1;
  justify-content: space-between;
  gap: 8px;
  font-size: 12px;
}

.file-name {
  max-width: 65%;
  overflow: hidden;
  color: var(--theme-text-tertiary);
  font-size: 11px;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.package-dropzone {
  min-width: 0;
  border: 1px dashed var(--theme-border-strong);
  border-radius: 8px;
  padding: 5px 7px;
  background: var(--theme-surface-soft);
}

.package-dropzone.active {
  border-color: var(--accent-mode-border-strong);
  background: var(--accent-mode-fill-soft);
}

.package-dropzone input {
  width: 100%;
  min-width: 0;
  color: var(--theme-text-secondary);
  font-size: 11px;
}

.field-control {
  width: 100%;
  min-width: 0;
  min-height: 32px;
  padding: 0 9px;
  border: 1px solid var(--theme-border) !important;
  border-radius: 7px;
  outline: 0;
  background: var(--theme-surface-soft) !important;
  color: var(--theme-text-primary) !important;
  box-shadow: none !important;
}

.field-control::placeholder {
  color: var(--theme-text-tertiary);
}

.field-control:focus {
  border-color: var(--accent-mode-border-strong) !important;
  box-shadow: var(--accent-mode-focus-ring) !important;
}

.wide-field {
  min-width: 0;
}

.add-actions {
  gap: 6px;
}

.primary-action,
.secondary-action,
.danger-action {
  min-height: 32px;
  padding: 0 11px;
  border-radius: 7px;
  font-size: 12px;
}

.primary-action {
  border-color: var(--accent-mode-border-strong) !important;
  background: var(--accent-mode-fill-strong) !important;
  color: var(--accent-surface-text, var(--accent-mode-text)) !important;
}

.secondary-action:hover {
  border-color: var(--accent-mode-border) !important;
  background: var(--accent-mode-fill-soft) !important;
}

.danger-action {
  border-color: rgba(235, 94, 124, 0.34) !important;
  color: rgba(235, 94, 124, 0.94) !important;
}

.primary-action:disabled,
.secondary-action:disabled,
.danger-action:disabled,
.head-action:disabled,
.icon-action:disabled {
  cursor: not-allowed;
  opacity: 0.46;
}

.compact-empty {
  padding: 12px;
  color: var(--theme-text-secondary);
  font-size: 12px;
  text-align: center;
}

.workspace-notice {
  margin: 8px 12px 0;
  padding: 7px 10px;
  border: 1px solid var(--accent-mode-border);
  border-radius: 8px;
  background: var(--accent-mode-fill-soft);
  color: var(--theme-text-secondary);
  display: flex;
  flex-wrap: wrap;
  gap: 6px 14px;
  font-size: 11px;
}

.workspace-content {
  flex: 1;
  min-height: 0;
  padding: 12px;
  overflow: hidden;
}

.installed-workspace {
  height: 100%;
  min-height: 0;
  display: grid;
  grid-template-columns: minmax(0, 1fr) 330px;
  gap: 12px;
}

.library-pane,
.wallpaper-detail {
  min-height: 0;
  border: 1px solid var(--theme-border);
  border-radius: 13px;
  background: var(--theme-surface-soft);
  overflow: hidden;
}

.library-pane {
  display: grid;
  grid-template-rows: auto minmax(0, 1fr);
}

.library-toolbar {
  min-height: 48px;
  justify-content: space-between;
  gap: 12px;
  padding: 7px 9px;
  border-bottom: 1px solid var(--theme-border);
}

.filter-tabs {
  min-width: 0;
  display: flex;
  align-items: center;
  gap: 4px;
  overflow-x: auto;
}

.filter-tab {
  min-height: 30px;
  padding: 0 11px;
  border: 1px solid transparent !important;
  border-radius: 7px;
  background: transparent !important;
  color: var(--theme-text-secondary) !important;
  white-space: nowrap;
  box-shadow: none !important;
}

.filter-tab:hover,
.filter-tab.active {
  border-color: var(--theme-border) !important;
  background: var(--theme-surface-soft) !important;
  color: var(--theme-text-primary) !important;
}

.filter-tab.active {
  border-color: var(--accent-mode-border) !important;
  background: var(--accent-mode-fill-soft) !important;
}

.library-toolbar-end {
  flex: 0 0 auto;
  gap: 8px;
}

.result-count {
  color: var(--theme-text-tertiary);
  font-size: 11px;
}

.icon-action {
  width: 30px;
  height: 30px;
  border-radius: 7px;
  font-size: 17px;
}

.wallpaper-grid {
  min-height: 0;
  padding: 10px;
  overflow: auto;
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(185px, 1fr));
  align-content: start;
  gap: 10px;
  scrollbar-gutter: stable;
}

.wallpaper-card {
  min-width: 0;
  padding: 5px;
  border: 1px solid transparent !important;
  border-radius: 10px;
  background: transparent !important;
  color: var(--theme-text-primary) !important;
  display: grid;
  gap: 7px;
  text-align: left;
  box-shadow: none !important;
}

.wallpaper-card:hover {
  border-color: var(--theme-border) !important;
  background: var(--theme-surface-soft) !important;
}

.wallpaper-card.active {
  border-color: var(--accent-mode-border-strong) !important;
  background: var(--accent-mode-fill-soft) !important;
  box-shadow: inset 0 0 0 1px var(--accent-mode-border) !important;
}

.wallpaper-thumb {
  position: relative;
  aspect-ratio: 16 / 9;
  overflow: hidden;
  border: 1px solid var(--theme-border);
  border-radius: 7px;
  background: var(--theme-panel-surface-elevated);
  display: grid;
  place-items: center;
}

.wallpaper-thumb img,
.detail-preview img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  display: block;
}

.wallpaper-card:hover .wallpaper-thumb img {
  transform: scale(1.018);
}

.wallpaper-thumb img {
  transition: transform 180ms ease;
}

.type-badge,
.active-check,
.visibility-badge,
.job-status {
  border: 1px solid var(--theme-border);
  background: var(--theme-panel-surface-elevated);
  color: var(--theme-text-secondary);
  font-size: 10px;
}

.type-badge {
  position: absolute;
  top: 6px;
  left: 6px;
  padding: 3px 6px;
  border-radius: 5px;
  backdrop-filter: blur(12px);
}

.active-check {
  position: absolute;
  right: 6px;
  bottom: 6px;
  width: 21px;
  height: 21px;
  border-color: var(--accent-mode-border-strong);
  border-radius: 50%;
  background: var(--accent-mode-fill-strong);
  color: var(--accent-surface-text, var(--accent-mode-text));
  display: grid;
  place-items: center;
  font-weight: 800;
}

.card-copy {
  min-width: 0;
  padding: 0 2px 2px;
  display: grid;
  gap: 3px;
}

.card-copy strong {
  overflow: hidden;
  font-size: 12px;
  font-weight: 650;
  text-overflow: ellipsis;
  white-space: nowrap;
}

.card-copy small {
  color: var(--theme-text-tertiary);
  font-size: 10px;
}

.wallpaper-detail {
  padding: 10px;
  overflow: auto;
  background: var(--theme-panel-surface-elevated);
  display: flex;
  flex-direction: column;
  gap: 12px;
}

.detail-preview {
  flex: 0 0 auto;
  aspect-ratio: 16 / 9;
  overflow: hidden;
  border: 1px solid var(--theme-border);
  border-radius: 9px;
  background: var(--theme-surface-soft);
  display: grid;
  place-items: center;
}

.preview-placeholder {
  color: var(--theme-text-tertiary);
  font-size: 11px;
}

.detail-heading {
  align-items: flex-start;
  justify-content: space-between;
  gap: 10px;
}

.detail-heading h2 {
  margin: 0;
  color: var(--theme-text-primary);
  font-family: var(--font-cute, var(--font-display));
  font-size: 17px;
  font-weight: 700;
  line-height: 1.35;
}

.detail-heading p {
  margin: 4px 0 0;
  color: var(--theme-text-tertiary);
  font-size: 11px;
}

.visibility-badge {
  flex: 0 0 auto;
  padding: 4px 7px;
  border-radius: 5px;
}

.wallpaper-settings {
  padding-top: 11px;
  border-top: 1px solid var(--theme-border);
  display: grid;
  gap: 10px;
}

.setting-field,
.range-setting,
.custom-setting {
  display: grid;
  gap: 5px;
  color: var(--theme-text-secondary);
  font-size: 11px;
}

.setting-toggles {
  display: flex;
  align-items: center;
  gap: 16px;
  color: var(--theme-text-secondary);
  font-size: 11px;
}

.setting-toggles label {
  display: flex;
  align-items: center;
  gap: 5px;
}

.range-setting span {
  display: flex;
  justify-content: space-between;
  gap: 8px;
}

.range-setting b {
  color: var(--theme-text-tertiary);
  font-weight: 500;
}

.range-setting input[type='range'],
.custom-setting input[type='range'] {
  width: 100%;
  accent-color: rgb(var(--accent-rgb));
}

.advanced-settings {
  border-top: 1px solid var(--theme-border);
  border-bottom: 1px solid var(--theme-border);
  padding: 8px 0;
}

.advanced-settings summary {
  color: var(--theme-text-secondary);
  cursor: pointer;
  font-size: 11px;
}

.advanced-content {
  padding-top: 9px;
  display: grid;
  gap: 9px;
}

.settings-actions {
  flex-wrap: wrap;
  gap: 6px;
}

.setting-error {
  margin: 0;
  color: rgba(235, 94, 124, 0.94);
  font-size: 11px;
}

.library-empty,
.detail-empty {
  min-height: 180px;
  color: var(--theme-text-tertiary);
  display: grid;
  place-content: center;
  justify-items: center;
  gap: 8px;
  font-size: 12px;
}

.detail-empty {
  flex: 1;
}

.empty-mark {
  font-size: 24px;
  opacity: 0.7;
}

.workspace-content :deep(.wallpaper-discovery) {
  height: 100%;
}

.workspace-footer {
  min-height: 48px;
  padding: 7px 12px;
  border-top: 1px solid var(--theme-border);
  background: var(--theme-surface-soft);
  display: flex;
  align-items: center;
  gap: 9px;
}

.route-context {
  min-width: 0;
  gap: 6px;
  color: var(--theme-text-secondary);
  font-size: 11px;
}

.route-context small {
  color: var(--theme-text-tertiary);
  white-space: nowrap;
}

.route-dot {
  width: 6px;
  height: 6px;
  border-radius: 50%;
  background: rgb(var(--accent-rgb));
  box-shadow: var(--accent-mode-glow);
}

.scope-switch {
  padding: 2px;
  border: 1px solid var(--theme-border);
  border-radius: 7px;
  background: var(--theme-surface-soft);
}

.scope-switch button {
  min-height: 25px;
  padding: 0 9px;
  border: 0 !important;
  border-radius: 5px;
  background: transparent !important;
  color: var(--theme-text-tertiary) !important;
  font-size: 10px;
  box-shadow: none !important;
}

.scope-switch button.active {
  background: var(--accent-mode-fill-soft) !important;
  color: var(--theme-text-primary) !important;
}

.footer-link {
  min-height: 27px;
  padding: 0 5px;
  border: 0 !important;
  background: transparent !important;
  color: var(--theme-text-secondary) !important;
  font-size: 10px;
  box-shadow: none !important;
}

.footer-link:hover {
  color: var(--theme-text-primary) !important;
}

.danger-link {
  color: rgba(235, 94, 124, 0.9) !important;
}

.footer-spacer {
  flex: 1;
}

.job-status {
  padding: 4px 7px;
  border-radius: 5px;
  white-space: nowrap;
}

.spinning {
  display: inline-block;
  animation: workspace-spin 800ms linear infinite;
}

@keyframes workspace-spin {
  to { transform: rotate(360deg); }
}

.picker-fade-enter-active,
.picker-fade-leave-active {
  transition: opacity 160ms ease;
}

.picker-fade-enter-from,
.picker-fade-leave-to {
  opacity: 0;
}

@media (max-width: 980px) {
  .workspace-header {
    grid-template-columns: auto minmax(280px, 1fr) auto;
  }

  .workspace-brand-copy {
    display: none;
  }

  .head-action {
    width: 32px;
    padding: 0;
    font-size: 0;
  }

  .head-action::before {
    content: '+';
    font-size: 18px;
    line-height: 1;
  }

  .installed-workspace {
    grid-template-columns: minmax(0, 1fr) 292px;
  }

  .wallpaper-grid {
    grid-template-columns: repeat(auto-fill, minmax(155px, 1fr));
  }

  .add-card {
    grid-template-columns: minmax(115px, 1fr) 90px auto;
  }

  .add-card .package-dropzone,
  .add-card .wide-field {
    grid-column: span 2;
  }
}

@media (max-width: 720px), (orientation: portrait) {
  .bg-picker-mask {
    padding: 6px;
  }

  .bg-picker {
    width: calc(100vw - 12px);
    height: min(94vh, 900px);
    min-height: 0;
    border-radius: 15px;
  }

  .workspace-header {
    min-height: 52px;
    padding: 0 7px;
    grid-template-columns: 32px minmax(0, 1fr) 64px;
    gap: 5px;
  }

  .workspace-brand-mark,
  .workspace-close {
    width: 30px;
    height: 30px;
  }

  .workspace-nav {
    min-width: 0;
    justify-content: stretch;
    overflow-x: auto;
  }

  .workspace-tab {
    flex: 1 0 auto;
    min-width: 74px;
    padding: 0 8px;
    font-size: 12px;
  }

  .workspace-head-actions {
    gap: 4px;
  }

  .head-action,
  .workspace-close {
    width: 30px;
    min-width: 30px;
    flex: 0 0 30px;
  }

  .add-wallpaper-grid {
    grid-template-columns: 1fr;
    max-height: 250px;
    overflow: auto;
  }

  .add-card {
    grid-template-columns: minmax(0, 1fr) 82px auto;
  }

  .workspace-content {
    padding: 7px;
    overflow: auto;
  }

  .installed-workspace {
    height: auto;
    min-height: 100%;
    grid-template-columns: 1fr;
  }

  .library-pane {
    min-height: 400px;
  }

  .wallpaper-detail {
    min-height: 360px;
  }

  .wallpaper-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
    padding: 7px;
    gap: 7px;
  }

  .library-toolbar {
    gap: 6px;
  }

  .filter-tab {
    padding: 0 8px;
  }

  .workspace-footer {
    min-height: 44px;
    overflow-x: auto;
  }

  .route-context small,
  .danger-link,
  .job-status {
    display: none;
  }
}

@media (prefers-reduced-motion: reduce) {
  .wallpaper-thumb img,
  .picker-fade-enter-active,
  .picker-fade-leave-active {
    transition: none;
  }
}
</style>
