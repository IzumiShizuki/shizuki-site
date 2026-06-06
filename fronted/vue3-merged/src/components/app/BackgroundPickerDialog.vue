<template>
  <transition name="picker-fade">
    <div v-if="visible" class="bg-picker-mask" @click.self="$emit('close')">
      <section class="bg-picker liquid-material">
        <header class="picker-head">
          <div class="picker-head-main">
            <div class="picker-title">背景设置</div>
            <div class="picker-mode-switch">
              <button
                class="tab-btn ripple-trigger"
                :class="{ active: pickerMode === 'select' }"
                @click="$emit('update:pickerMode', 'select')"
              >
                壁纸选择
              </button>
              <button
                class="tab-btn ripple-trigger"
                :class="{ active: pickerMode === 'acquire' }"
                @click="$emit('update:pickerMode', 'acquire')"
              >
                获取壁纸
              </button>
            </div>
          </div>
          <button class="picker-close ripple-trigger" @click="$emit('close')">关闭</button>
        </header>

        <div class="picker-toolbar">
          <div class="picker-tabs">
            <button
              v-for="tab in bgTabs"
              :key="tab.key"
              class="tab-btn ripple-trigger"
              :class="{ active: bgTab === tab.key }"
              @click="$emit('set-bg-tab', tab.key)"
            >
              {{ tab.label }}
            </button>
          </div>
          <div class="picker-apply-mode picker-apply-mode-toolbar">
            <span class="scope-label">应用到：</span>
            <button
              class="scope-btn ripple-trigger"
              :class="{ active: backgroundApplyTarget === 'route' }"
              @click="$emit('update:backgroundApplyTarget', 'route')"
            >
              当前路由
            </button>
            <button
              class="scope-btn ripple-trigger"
              :class="{ active: backgroundApplyTarget === 'global' }"
              @click="$emit('update:backgroundApplyTarget', 'global')"
            >
              全局默认
            </button>
            <button
              v-if="backgroundApplyTarget === 'route'"
              class="scope-btn danger ripple-trigger"
              @click="$emit('clear-current-route-background')"
            >
              清理当前路由
            </button>
          </div>
        </div>

        <p class="route-bg-note">
          当前路由：{{ currentRouteLabel }}
          <span v-if="currentRouteBackgroundId">（已单独设置）</span>
          <span v-else>（未设置，沿用全局）</span>
        </p>

        <section v-if="pickerMode === 'acquire'" class="picker-acquire-body">
          <div class="picker-status">
            <button class="scope-btn ripple-trigger" :disabled="wallpaperLoading" @click="$emit('refresh-background-library')">
              {{ wallpaperLoading ? '刷新中...' : '刷新壁纸库' }}
            </button>
            <button
              class="scope-btn ghost ripple-trigger"
              :disabled="importState.statusBusy || !importState.lastImportJobId"
              @click="$emit('check-wallpaper-import-job')"
            >
              {{ importState.statusBusy ? '查询中...' : '查询导入状态' }}
            </button>
            <span v-if="importState.lastImportJobId" class="status-pill">
              #{{ importState.lastImportJobId }} {{ importState.lastImportJobStatus || 'PENDING' }}
            </span>
          </div>

          <div v-if="backgroundEmergencyFallbackUsed || wallpaperErrorHint || importState.hint" class="status-stack">
            <p v-if="backgroundEmergencyFallbackUsed" class="route-bg-note">当前使用紧急占位背景。</p>
            <p v-if="wallpaperErrorHint" class="route-bg-note">{{ wallpaperErrorHint }}</p>
            <p v-if="importState.hint" class="route-bg-note">{{ importState.hint }}</p>
          </div>

          <div v-if="isAuthenticated" class="picker-import-grid">
            <section class="import-card">
              <div class="import-card-head">
                <h4>本地包导入</h4>
                <span class="status-pill soft">最稳妥</span>
              </div>
              <p class="route-bg-note">适合已经下载好的 Wallpaper Engine 包、图片或视频。上传后资源会落到服务器对象存储，再作为站点背景使用。</p>
              <div
                class="package-dropzone"
                :class="{ active: packageDropActive }"
                @dragenter.prevent="$emit('package-drag-enter', $event)"
                @dragover.prevent="$emit('package-drag-over', $event)"
                @dragleave.prevent="$emit('package-drag-leave', $event)"
                @drop.prevent="$emit('package-drop', $event)"
              >
                <p class="route-bg-note">拖拽 .zip / 图片 / 视频到这里，或点击下方按钮选择文件</p>
                <input type="file" accept=".zip,image/*,video/*" @change="$emit('package-file-change', $event)" />
                <p v-if="importState.packageFile" class="route-bg-note">已选文件：{{ importState.packageFile.name }}</p>
              </div>
              <input v-model.trim="importState.packageTitle" class="field-input-lite" type="text" placeholder="壁纸标题（可选）" />
              <select v-model="importState.packageVisibility" class="field-input-lite">
                <option value="PRIVATE">私有</option>
                <option value="PUBLIC">公开</option>
              </select>
              <button class="scope-btn ripple-trigger" :disabled="importState.busy || !importState.packageFile" @click="$emit('submit-package-import')">
                上传并导入
              </button>
            </section>

            <section class="import-card">
              <div class="import-card-head">
                <h4>Workshop 搜索与导入</h4>
                <span class="status-pill soft">可选</span>
              </div>
              <p class="route-bg-note">先搜索并复制 Steam Workshop 条目链接。服务器会优先使用 Steam 公开文件地址；拿不到直链时需要 SteamCMD 和可访问该条目的账号。</p>
              <div class="workshop-search-row">
                <input
                  v-model.trim="importState.workshopSearchQuery"
                  class="field-input-lite"
                  type="search"
                  placeholder="搜索关键词，如 anime room / city rain"
                  @keydown.enter.prevent="$emit('open-workshop-discovery-window')"
                />
                <button class="scope-btn ghost ripple-trigger" @click="$emit('open-workshop-discovery-window')">
                  打开搜索
                </button>
              </div>
              <input
                v-model.trim="importState.workshopUrl"
                class="field-input-lite"
                type="url"
                placeholder="https://steamcommunity.com/sharedfiles/filedetails/?id=..."
              />
              <input v-model.trim="importState.workshopTitle" class="field-input-lite" type="text" placeholder="标题覆盖（可选）" />
              <select v-model="importState.workshopVisibility" class="field-input-lite">
                <option value="PRIVATE">私有</option>
                <option value="PUBLIC">公开</option>
              </select>
              <div class="import-actions">
                <button class="scope-btn ripple-trigger" :disabled="importState.busy || !importState.workshopUrl" @click="$emit('submit-workshop-import')">
                  创建导入任务
                </button>
                <button class="scope-btn ghost ripple-trigger" :disabled="!importState.workshopUrl" @click="$emit('open-workshop-preview-window')">
                  小窗预览
                </button>
              </div>
              <p class="route-bg-note">导入任务是服务器异步执行的；创建后可以点“查询导入状态”确认是否下载成功。</p>
            </section>
          </div>
          <p v-else class="route-bg-note">登录后可上传本地包或导入 Workshop 资源。</p>

          <p class="format-guide-note">
            支持图片、视频、Live2D zip 与内嵌 BGM/BGV 媒体；上传后会自动按 L2D、动态、静态的顺序分类。
          </p>
        </section>

        <section v-if="pickerMode === 'acquire' && activeBackground?.wallpaperId && canEditActiveWallpaper" class="wallpaper-settings">
          <header class="wallpaper-settings-head">
            <div>
              <div class="picker-title">Wallpaper 设置</div>
              <p class="route-bg-note">
                来源：{{ activeBackground.importSource || 'PACKAGE' }}
                <span v-if="activeBackground.workshopItemId"> | Workshop ID: {{ activeBackground.workshopItemId }}</span>
              </p>
            </div>
            <div class="settings-checks">
              <label><input v-model="wallpaperSettingState.bgmEnabled" type="checkbox" /> BGM</label>
              <label><input v-model="wallpaperSettingState.bgvEnabled" type="checkbox" /> BGV</label>
            </div>
          </header>
          <div class="settings-grid">
            <label class="settings-title-field">
              壁纸标题
              <input v-model.trim="wallpaperSettingState.title" class="field-input-lite" type="text" placeholder="请输入壁纸标题" />
            </label>
            <label>
              主音量 {{ formatPercent(wallpaperSettingState.masterVolume) }}
              <input v-model.number="wallpaperSettingState.masterVolume" type="range" min="0" max="1" step="0.01" />
            </label>
            <label>
              BGM 音量 {{ formatPercent(wallpaperSettingState.bgmVolume) }}
              <input v-model.number="wallpaperSettingState.bgmVolume" type="range" min="0" max="1" step="0.01" />
            </label>
            <label>
              BGV 音量 {{ formatPercent(wallpaperSettingState.bgvVolume) }}
              <input v-model.number="wallpaperSettingState.bgvVolume" type="range" min="0" max="1" step="0.01" />
            </label>
            <label>
              内置 BGM 资源 ID
              <input v-model.trim="wallpaperSettingState.bgmAssetIdText" class="field-input-lite" type="text" placeholder="可选，数字ID" />
            </label>
            <label>
              内置 BGV 资源 ID
              <input v-model.trim="wallpaperSettingState.bgvAssetIdText" class="field-input-lite" type="text" placeholder="可选，数字ID" />
            </label>
          </div>

          <div v-if="activeCustomSchemaItems.length" class="settings-custom">
            <h4>自定义参数</h4>
            <div v-for="schemaItem in activeCustomSchemaItems" :key="schemaItem.key" class="custom-row">
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
                class="field-input-lite"
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
                class="field-input-lite"
                type="text"
              />
            </div>
          </div>

          <div class="picker-apply-mode">
            <button class="scope-btn ripple-trigger" :disabled="wallpaperSettingState.saving" @click="$emit('save-active-wallpaper-settings')">
              {{ wallpaperSettingState.saving ? '保存中...' : '保存设置' }}
            </button>
            <button class="scope-btn ripple-trigger" :disabled="wallpaperSettingState.visibilitySaving" @click="$emit('set-active-wallpaper-visibility', 'PUBLIC')">
              提交公开
            </button>
            <button class="scope-btn danger ripple-trigger" :disabled="wallpaperSettingState.visibilitySaving" @click="$emit('set-active-wallpaper-visibility', 'PRIVATE')">
              设为私有
            </button>
            <button class="scope-btn danger ripple-trigger" :disabled="wallpaperSettingState.deleting" @click="$emit('delete-active-wallpaper')">
              {{ wallpaperSettingState.deleting ? '删除中...' : '删除壁纸' }}
            </button>
          </div>
          <p v-if="wallpaperSettingState.error" class="route-bg-note">{{ wallpaperSettingState.error }}</p>
        </section>

        <div v-if="pickerMode === 'select'" class="picker-grid">
          <button
            v-for="item in filteredBackgroundItems"
            :key="item.id"
            class="picker-item ripple-trigger"
            :class="{ active: item.id === activeBackgroundId }"
            @click="$emit('select-background', item.id)"
          >
            <img class="picker-preview" :src="item.preview" :alt="item.name" />
            <span class="picker-name">{{ item.name }}</span>
            <span class="picker-meta">{{ item.type.toUpperCase() }}</span>
          </button>
        </div>
      </section>
    </div>
  </transition>
</template>

<script setup>
defineProps({
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
  importState: {
    type: Object,
    default: () => ({})
  },
  isAuthenticated: { type: Boolean, default: false },
  packageDropActive: { type: Boolean, default: false },
  activeBackground: {
    type: Object,
    default: null
  },
  canEditActiveWallpaper: { type: Boolean, default: false },
  activeCustomSchemaItems: { type: Array, default: () => [] },
  wallpaperSettingState: {
    type: Object,
    default: () => ({})
  },
  filteredBackgroundItems: { type: Array, default: () => [] },
  activeBackgroundId: { type: String, default: '' },
  formatPercent: {
    type: Function,
    default: (value) => `${Math.round(Number(value || 0) * 100)}%`
  }
});

defineEmits([
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
  'open-workshop-discovery-window',
  'open-workshop-preview-window',
  'check-wallpaper-import-job',
  'save-active-wallpaper-settings',
  'set-active-wallpaper-visibility',
  'delete-active-wallpaper',
  'select-background'
]);
</script>

<style scoped>
.bg-picker-mask {
  position: fixed;
  inset: 0;
  z-index: 1500;
  background:
    linear-gradient(180deg, rgba(255, 255, 255, 0.2), rgba(255, 245, 246, 0.16)),
    rgba(18, 15, 20, 0.18);
  display: grid;
  place-items: center;
  backdrop-filter: blur(10px) saturate(1.05);
}

.bg-picker {
  --liquid-bg: rgba(255, 250, 250, 0.68);
  --liquid-border: rgba(255, 255, 255, 0.76);
  --liquid-shadow: 0 18px 44px rgba(55, 38, 42, 0.14);
  --picker-ink: rgba(75, 55, 54, 0.94);
  --picker-ink-soft: rgba(94, 72, 70, 0.76);
  --picker-accent-text: rgba(112, 55, 62, 0.96);
  width: min(94vw, 980px);
  max-height: min(86vh, 720px);
  border-radius: 18px;
  padding: 12px;
  overflow: hidden;
  display: flex;
  flex-direction: column;
  gap: 8px;
}

.bg-picker :is(button, label, p, h4, .picker-title, .route-bg-note, .format-guide-note) {
  text-shadow: 0 1px 0 rgba(255, 255, 255, 0.5) !important;
}

.picker-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 10px;
}

.picker-head-main {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 10px;
  min-width: 0;
}

.picker-mode-switch {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 6px;
}

.picker-title {
  color: var(--picker-ink) !important;
  font-family: var(--font-cute, var(--font-display));
  font-size: 18px;
  font-weight: 700;
  letter-spacing: 0.02em;
}

.picker-close {
  border: 1px solid rgba(255, 255, 255, 0.54) !important;
  border-radius: 10px;
  min-width: 60px;
  height: 32px;
  background: rgba(255, 255, 255, 0.48) !important;
  color: var(--picker-ink) !important;
}

.picker-toolbar {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px;
}

.picker-tabs {
  display: flex;
  align-items: center;
  flex-wrap: wrap;
  gap: 8px;
}

.tab-btn {
  border: 1px solid rgba(255, 255, 255, 0.58) !important;
  border-radius: 9px;
  min-width: 72px;
  height: 30px;
  padding: 0 12px;
  background: rgba(255, 255, 255, 0.54) !important;
  color: var(--picker-ink-soft) !important;
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.18) !important;
}

.picker-mode-switch .tab-btn {
  min-width: 92px;
}

.tab-btn.active {
  background: rgba(var(--accent-rgb), 0.34) !important;
  border-color: rgba(var(--accent-rgb), 0.38) !important;
  color: var(--picker-accent-text) !important;
  box-shadow: 0 8px 18px rgba(var(--accent-rgb), 0.16) !important;
}

.picker-apply-mode {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px;
}

.picker-apply-mode-toolbar {
  margin-left: auto;
}

.scope-label {
  color: var(--picker-ink-soft);
  font-size: 12px;
}

.scope-btn {
  border: 1px solid rgba(255, 255, 255, 0.58) !important;
  border-radius: 9px;
  min-height: 30px;
  padding: 0 12px;
  background: rgba(255, 255, 255, 0.54) !important;
  color: var(--picker-ink-soft) !important;
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.18) !important;
}

.scope-btn.active {
  background: rgba(var(--accent-rgb), 0.34) !important;
  border-color: rgba(var(--accent-rgb), 0.38) !important;
  color: var(--picker-accent-text) !important;
  box-shadow: 0 8px 18px rgba(var(--accent-rgb), 0.16) !important;
}

.scope-btn.danger {
  background: rgba(235, 94, 124, 0.14) !important;
  border-color: rgba(235, 94, 124, 0.22) !important;
  color: rgba(135, 27, 50, 0.92) !important;
}

.scope-btn.ghost {
  background: rgba(255, 255, 255, 0.42) !important;
  color: var(--picker-ink-soft) !important;
}

.route-bg-note {
  color: var(--picker-ink-soft) !important;
  font-size: 12px;
  margin: 0;
}

.picker-acquire-body {
  flex: 1;
  min-height: 0;
  overflow: auto;
  -webkit-overflow-scrolling: touch;
  touch-action: pan-y;
  display: grid;
  align-content: start;
  gap: 8px;
  padding-right: 2px;
}

.picker-status {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  gap: 8px;
}

.status-stack {
  border: 1px solid rgba(var(--accent-rgb), 0.16);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.46);
  padding: 7px 10px;
  display: grid;
  gap: 3px;
}

.status-pill {
  border-radius: 999px;
  padding: 4px 9px;
  background: rgba(var(--accent-rgb), 0.18);
  color: var(--picker-accent-text);
  font-size: 11px;
  font-weight: 700;
  line-height: 1;
}

.status-pill.soft {
  background: rgba(255, 255, 255, 0.42);
  color: rgba(94, 72, 70, 0.68);
}

.picker-import-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 8px;
}

.import-card {
  border: 1px solid rgba(255, 255, 255, 0.54);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.42);
  padding: 10px;
  display: grid;
  align-content: start;
  gap: 8px;
}

.import-card-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  min-width: 0;
}

.package-dropzone {
  border: 1px dashed rgba(85, 94, 114, 0.45);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.38);
  padding: 8px;
  display: grid;
  gap: 6px;
}

.package-dropzone.active {
  border-color: rgba(var(--accent-rgb), 0.7);
  background: rgba(var(--accent-soft-rgb), 0.24);
}

.package-dropzone input[type='file'] {
  width: 100%;
}

.import-card h4 {
  margin: 0;
  color: var(--picker-ink) !important;
  font-family: var(--font-cute, var(--font-display));
  font-size: 14px;
  letter-spacing: 0.01em;
}

.import-actions {
  display: flex;
  flex-wrap: wrap;
  gap: 8px;
}

.format-guide-note {
  border: 1px solid rgba(255, 255, 255, 0.48);
  border-radius: 10px;
  margin: 0;
  padding: 8px 10px;
  background: rgba(255, 255, 255, 0.34);
  color: var(--picker-ink-soft) !important;
  font-size: 12px;
  line-height: 1.6;
}

.workshop-search-row {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 8px;
}

.field-input-lite {
  width: 100%;
  border: 1px solid rgba(255, 255, 255, 0.62) !important;
  border-radius: 9px;
  min-height: 30px;
  padding: 0 10px;
  background: rgba(255, 255, 255, 0.72) !important;
  color: var(--picker-ink) !important;
  box-shadow: inset 0 0 0 1px rgba(255, 255, 255, 0.2) !important;
}

.settings-title-field {
  grid-column: 1 / -1;
}

.wallpaper-settings {
  border: 1px solid rgba(255, 255, 255, 0.56);
  border-radius: 10px;
  background: rgba(255, 255, 255, 0.44);
  padding: 10px;
  display: grid;
  gap: 8px;
}

.wallpaper-settings-head {
  display: flex;
  align-items: flex-start;
  justify-content: space-between;
  gap: 12px;
}

.settings-grid {
  display: grid;
  grid-template-columns: repeat(2, minmax(0, 1fr));
  gap: 6px 8px;
}

.settings-grid label {
  display: grid;
  gap: 4px;
  color: var(--picker-ink-soft) !important;
  font-size: 12px;
}

.settings-checks {
  display: flex;
  flex-wrap: wrap;
  align-items: center;
  justify-content: flex-end;
  gap: 8px 12px;
}

.settings-checks label {
  color: var(--picker-ink-soft) !important;
  font-size: 12px;
}

.settings-custom {
  display: grid;
  gap: 8px;
}

.settings-custom h4 {
  margin: 0;
  color: var(--picker-ink) !important;
  font-family: var(--font-cute, var(--font-display));
  font-size: 14px;
}

.custom-row {
  display: grid;
  grid-template-columns: 140px minmax(0, 1fr);
  align-items: center;
  gap: 8px;
}

.custom-row label {
  color: var(--picker-ink-soft) !important;
  font-size: 12px;
}

.picker-grid {
  flex: 1;
  min-height: 0;
  overflow: auto;
  -webkit-overflow-scrolling: touch;
  touch-action: pan-y;
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(132px, 1fr));
  gap: 10px;
}

.picker-item {
  border: 0;
  border-radius: 12px;
  background: rgba(255, 255, 255, 0.3);
  padding: 6px;
  display: grid;
  gap: 4px;
}

.picker-item.active {
  box-shadow: inset 0 0 0 2px rgba(var(--accent-rgb), 0.82);
}

.picker-preview {
  width: 100%;
  height: 88px;
  object-fit: cover;
  border-radius: 8px;
}

.picker-name {
  color: var(--picker-ink) !important;
  font-size: 12px;
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
}

.picker-meta {
  color: var(--picker-ink-soft) !important;
  font-size: 11px;
}

.picker-fade-enter-active,
.picker-fade-leave-active {
  transition: opacity 180ms ease;
}

.picker-fade-enter-from,
.picker-fade-leave-to {
  opacity: 0;
}

@media (max-width: 600px), (orientation: portrait) {
  .bg-picker {
    width: calc(100vw - 12px);
    max-height: 90vh;
    border-radius: 16px;
    padding: 10px;
  }

  .picker-head-main {
    width: 100%;
    flex-direction: column;
    align-items: flex-start;
    gap: 6px;
  }

  .picker-mode-switch {
    width: 100%;
  }

  .picker-mode-switch .tab-btn {
    flex: 1;
    min-width: 0;
  }

  .picker-tabs {
    width: 100%;
  }

  .picker-apply-mode-toolbar {
    width: 100%;
    margin-left: 0;
  }

  .scope-label {
    width: 100%;
  }

  .picker-acquire-body {
    padding-right: 0;
  }

  .picker-import-grid,
  .settings-grid,
  .workshop-search-row {
    grid-template-columns: 1fr;
  }

  .custom-row {
    grid-template-columns: 1fr;
  }

  .picker-grid {
    grid-template-columns: repeat(auto-fill, minmax(116px, 1fr));
  }
}
</style>
