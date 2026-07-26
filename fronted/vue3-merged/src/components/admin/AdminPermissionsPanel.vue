<template>
  <section class="panel-grid">
    <header class="panel-head">
      <h2 class="adm-title">分组权限配置</h2>
      <p class="adm-desc">左侧选择分组，右侧按模块勾选权限；每个权限都有名称与说明，不需要记忆权限码。</p>
    </header>

    <div class="content-split">
      <div class="adm-table-wrap">
        <table class="adm-table">
          <thead>
            <tr>
              <th>分组</th>
              <th>组名</th>
              <th>状态</th>
              <th>权限数</th>
            </tr>
          </thead>
          <tbody>
            <tr
              v-for="item in groupRows"
              :key="item.groupCode"
              :class="{ 'is-active': selectedGroupCode === item.groupCode }"
              @click="$emit('selectGroup', item.groupCode)"
            >
              <td><GroupBadge :group-code="item.groupCode" /></td>
              <td>{{ item.displayName || item.groupCode }}</td>
              <td>
                <span class="adm-flag" :class="item.status === 'ACTIVE' ? 'adm-flag--on' : 'adm-flag--off'">
                  {{ item.status === 'ACTIVE' ? '启用' : '停用' }}
                </span>
              </td>
              <td><span class="adm-count">{{ item.permissions.length }}</span></td>
            </tr>
            <tr v-if="!groupRows.length">
              <td colspan="4"><div class="adm-empty">暂无分组数据</div></td>
            </tr>
          </tbody>
        </table>
      </div>

      <aside class="adm-card editor-card">
        <p class="adm-desc" v-if="!selectedGroupCode">请先在左侧选择一个分组。</p>
        <template v-else>
          <div class="editor-head">
            <div class="editor-head-main">
              <GroupBadge :group-code="selectedGroupCode" />
              <span class="adm-muted">已选 {{ selectedPermissions.length }} 项权限</span>
            </div>
            <span v-if="isDirty" class="adm-dirty">有未保存的更改</span>
          </div>

          <input
            v-model.trim="filterKeyword"
            class="adm-input adm-input--sm"
            type="search"
            placeholder="搜索权限名称 / 编码 / 说明"
            aria-label="搜索权限"
          />

          <div class="perm-sections adm-scroll">
            <section v-for="section in filteredSections" :key="section.category" class="perm-section">
              <div class="adm-section-title">
                <span>{{ section.category }}</span>
                <button class="adm-btn adm-btn--ghost adm-btn--sm" type="button" @click="toggleSection(section)">
                  {{ isSectionAllSelected(section) ? '清空本组' : '全选本组' }}
                </button>
              </div>
              <div class="adm-perm-grid">
                <label
                  v-for="option in section.options"
                  :key="option.code"
                  class="adm-perm"
                  :class="{ 'is-on': selectedSet.has(option.code) }"
                >
                  <input
                    type="checkbox"
                    :checked="selectedSet.has(option.code)"
                    @change="$emit('togglePermission', option.code)"
                  />
                  <span class="adm-perm-main">
                    <span class="adm-perm-label">{{ option.label }}</span>
                    <span v-if="option.label !== option.code" class="adm-perm-code">{{ option.code }}</span>
                    <span v-if="option.description" class="adm-perm-desc">{{ option.description }}</span>
                  </span>
                </label>
              </div>
            </section>
            <p v-if="!filteredSections.length" class="adm-empty">没有匹配「{{ filterKeyword }}」的权限项</p>
          </div>

          <div v-if="extraSelectedCodes.length" class="perm-extra">
            <div class="adm-section-title"><span>目录之外（自定义）</span></div>
            <div class="adm-toolbar">
              <button
                v-for="code in extraSelectedCodes"
                :key="code"
                class="adm-btn adm-btn--ghost adm-btn--sm"
                type="button"
                :title="`移除 ${code}`"
                @click="$emit('togglePermission', code)"
              >
                {{ code }} ✕
              </button>
            </div>
          </div>

          <div class="adm-toolbar">
            <button class="adm-btn adm-btn--primary ripple-trigger" type="button" :disabled="saving || !isDirty" @click="$emit('save')">
              {{ saving ? '保存中...' : '保存分组权限' }}
            </button>
            <button class="adm-btn adm-btn--ghost ripple-trigger" type="button" :disabled="saving || !isDirty" @click="$emit('selectGroup', selectedGroupCode)">
              重置
            </button>
            <button class="adm-btn adm-btn--ghost adm-btn--sm ripple-trigger" type="button" @click="$emit('update:advanced', !advanced)">
              {{ advanced ? '收起高级模式' : '高级模式' }}
            </button>
          </div>

          <div v-if="advanced" class="advanced-block">
            <label class="adm-label" for="custom-permission">自定义权限码（供扩展模块使用）</label>
            <div class="adm-toolbar">
              <input
                id="custom-permission"
                :value="customPermission"
                class="adm-input adm-input--sm adm-grow"
                type="text"
                placeholder="例如: report.export"
                @input="$emit('update:customPermission', $event.target.value)"
                @keyup.enter="$emit('appendCustomPermission')"
              />
              <button class="adm-btn adm-btn--ghost adm-btn--sm ripple-trigger" type="button" @click="$emit('appendCustomPermission')">
                加入选择
              </button>
            </div>
          </div>
        </template>
      </aside>
    </div>

    <p v-if="error" class="adm-error">{{ error }}</p>
  </section>
</template>

<script setup>
import { computed, ref } from 'vue';
import GroupBadge from './GroupBadge.vue';
import { groupPermissionOptions, normalizePermissionOptions } from '../../pages/adminUiState';

const props = defineProps({
  loading: { type: Boolean, default: false },
  saving: { type: Boolean, default: false },
  error: { type: String, default: '' },
  groupOptions: { type: Array, default: () => [] },
  permissionsByGroup: { type: Object, default: () => ({}) },
  selectedGroupCode: { type: String, default: '' },
  selectedPermissions: { type: Array, default: () => [] },
  permissionCatalog: { type: Array, default: () => [] },
  permissionOptions: { type: Array, default: () => [] },
  advanced: { type: Boolean, default: false },
  customPermission: { type: String, default: '' }
});

const emit = defineEmits([
  'selectGroup',
  'togglePermission',
  'save',
  'update:advanced',
  'update:customPermission',
  'appendCustomPermission'
]);

const filterKeyword = ref('');

const groupRows = computed(() => {
  return (props.groupOptions || []).map((group) => {
    const groupCode = String(group.groupCode || '').toUpperCase();
    const permissions = Array.isArray(props.permissionsByGroup[groupCode]) ? props.permissionsByGroup[groupCode] : [];
    return {
      groupCode,
      displayName: String(group.displayName || groupCode || '').trim(),
      status: String(group.status || '').toUpperCase(),
      permissions
    };
  });
});

const normalizedOptions = computed(() =>
  normalizePermissionOptions(props.permissionOptions, props.permissionCatalog)
);

const selectedSet = computed(() => new Set(props.selectedPermissions || []));

const savedSet = computed(() => {
  const groupCode = String(props.selectedGroupCode || '').toUpperCase();
  const saved = Array.isArray(props.permissionsByGroup[groupCode]) ? props.permissionsByGroup[groupCode] : [];
  return new Set(saved);
});

const isDirty = computed(() => {
  if (selectedSet.value.size !== savedSet.value.size) return true;
  for (const code of selectedSet.value) {
    if (!savedSet.value.has(code)) return true;
  }
  return false;
});

const filteredSections = computed(() => {
  const keyword = filterKeyword.value.toLowerCase();
  const options = normalizedOptions.value.filter((option) => {
    if (!keyword) return true;
    return (
      option.code.toLowerCase().includes(keyword) ||
      option.label.toLowerCase().includes(keyword) ||
      option.description.toLowerCase().includes(keyword)
    );
  });
  return groupPermissionOptions(options);
});

const extraSelectedCodes = computed(() => {
  const catalogCodes = new Set(normalizedOptions.value.map((option) => option.code));
  return (props.selectedPermissions || []).filter((code) => !catalogCodes.has(code));
});

function isSectionAllSelected(section) {
  return section.options.every((option) => selectedSet.value.has(option.code));
}

function toggleSection(section) {
  const allSelected = isSectionAllSelected(section);
  section.options.forEach((option) => {
    const isOn = selectedSet.value.has(option.code);
    if (allSelected ? isOn : !isOn) {
      emit('togglePermission', option.code);
    }
  });
}
</script>

<style scoped>
.panel-grid {
  display: grid;
  gap: 12px;
}

.content-split {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(320px, 420px);
  gap: 12px;
  align-items: start;
}

.editor-card {
  min-width: 0;
}

.editor-head {
  display: flex;
  align-items: center;
  justify-content: space-between;
  gap: 8px;
  flex-wrap: wrap;
}

.editor-head-main {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.perm-sections {
  display: grid;
  gap: 12px;
  max-height: 46vh;
  overflow: auto;
  padding-right: 2px;
}

.perm-section {
  display: grid;
  gap: 8px;
}

.perm-extra {
  display: grid;
  gap: 8px;
}

.advanced-block {
  border-radius: 10px;
  padding: 10px;
  border: 1px dashed var(--theme-border-strong);
  display: grid;
  gap: 8px;
}

.adm-perm-main {
  display: grid;
  gap: 3px;
  min-width: 0;
}

@media (max-width: 1100px) {
  .content-split {
    grid-template-columns: 1fr;
  }

  .perm-sections {
    max-height: none;
  }
}
</style>
