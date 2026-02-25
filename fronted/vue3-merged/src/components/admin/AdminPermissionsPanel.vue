<template>
  <section class="panel-grid">
    <header class="panel-head">
      <h2>分组权限配置</h2>
      <p class="helper-text">左侧选分组，右侧通过权限标签勾选，不需要手工输入命令式文本。</p>
    </header>

    <div class="content-split">
      <div class="table-wrap">
        <table class="admin-table">
          <thead>
            <tr>
              <th>组编码</th>
              <th>组名</th>
              <th>状态</th>
              <th>权限数</th>
            </tr>
          </thead>
          <tbody>
            <tr
              v-for="item in groupRows"
              :key="item.groupCode"
              :class="{ active: selectedGroupCode === item.groupCode }"
              @click="$emit('selectGroup', item.groupCode)"
            >
              <td><GroupBadge :group-code="item.groupCode" /></td>
              <td>{{ item.displayName || item.groupCode }}</td>
              <td>{{ item.status || '-' }}</td>
              <td>{{ item.permissions.length }}</td>
            </tr>
            <tr v-if="!groupRows.length">
              <td colspan="4">暂无分组数据</td>
            </tr>
          </tbody>
        </table>
      </div>

      <aside class="side-editor liquid-material">
        <h3>权限选择器</h3>
        <p class="helper-text" v-if="!selectedGroupCode">请先在左侧选择一个分组。</p>
        <template v-else>
          <div class="inline-actions">
            <p class="helper-text">当前分组：</p>
            <GroupBadge :group-code="selectedGroupCode" />
            <p class="helper-text">已选 {{ selectedPermissions.length }} 项</p>
          </div>

          <div class="chip-grid">
            <label v-for="code in permissionCatalog" :key="code" class="chip-option">
              <input type="checkbox" :checked="selectedPermissions.includes(code)" @change="$emit('togglePermission', code)" />
              <span>{{ code }}</span>
            </label>
            <p v-if="!permissionCatalog.length" class="helper-text">暂无权限目录，请先在系统内生成权限项。</p>
          </div>

          <div class="inline-actions">
            <button class="primary-btn ripple-trigger" type="button" :disabled="saving" @click="$emit('save')">
              {{ saving ? '保存中...' : '保存分组权限' }}
            </button>
            <button class="ghost-btn ripple-trigger" type="button" @click="$emit('update:advanced', !advanced)">
              {{ advanced ? '收起高级模式' : '高级模式' }}
            </button>
          </div>

          <div v-if="advanced" class="advanced-block">
            <label class="field-label" for="custom-permission">自定义权限码</label>
            <div class="inline-actions">
              <input
                id="custom-permission"
                :value="customPermission"
                class="field-input grow"
                type="text"
                placeholder="例如: report.export"
                @input="$emit('update:customPermission', $event.target.value)"
              />
              <button class="ghost-btn ripple-trigger" type="button" @click="$emit('appendCustomPermission')">加入选择</button>
            </div>
          </div>
        </template>
      </aside>
    </div>

    <p v-if="error" class="error-text">{{ error }}</p>
  </section>
</template>

<script setup>
import { computed } from 'vue';
import GroupBadge from './GroupBadge.vue';

const props = defineProps({
  loading: { type: Boolean, default: false },
  saving: { type: Boolean, default: false },
  error: { type: String, default: '' },
  groupOptions: { type: Array, default: () => [] },
  permissionsByGroup: { type: Object, default: () => ({}) },
  selectedGroupCode: { type: String, default: '' },
  selectedPermissions: { type: Array, default: () => [] },
  permissionCatalog: { type: Array, default: () => [] },
  advanced: { type: Boolean, default: false },
  customPermission: { type: String, default: '' }
});

defineEmits([
  'selectGroup',
  'togglePermission',
  'save',
  'update:advanced',
  'update:customPermission',
  'appendCustomPermission'
]);

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
</script>

<style scoped>
.panel-grid {
  display: grid;
  gap: 10px;
}

.panel-head h2 {
  font-size: 20px;
}

.helper-text {
  color: rgba(223, 230, 249, 0.88);
}

.content-split {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(300px, 360px);
  gap: 12px;
}

.table-wrap {
  border-radius: 12px;
  overflow: auto;
  box-shadow: inset 0 0 0 1px rgba(175, 198, 228, 0.18);
}

.admin-table {
  width: 100%;
  border-collapse: collapse;
  min-width: 620px;
  font-size: 13px;
}

.admin-table th,
.admin-table td {
  text-align: left;
  padding: 10px 8px;
  border-bottom: 1px solid rgba(180, 203, 232, 0.14);
  color: rgba(232, 241, 253, 0.92);
  vertical-align: top;
}

.admin-table th {
  color: rgba(194, 218, 245, 0.92);
  font-weight: 600;
  background: rgba(11, 18, 29, 0.36);
}

.admin-table tbody tr {
  cursor: pointer;
}

.admin-table tbody tr.active {
  background: rgba(var(--accent-rgb), 0.18);
}

.side-editor {
  --liquid-bg: rgba(20, 27, 42, 0.36);
  --liquid-border: rgba(255, 255, 255, 0.2);
  border-radius: 12px;
  padding: 12px;
  display: grid;
  gap: 10px;
  align-content: start;
}

.chip-grid {
  display: grid;
  grid-template-columns: repeat(auto-fill, minmax(150px, 1fr));
  gap: 8px;
  max-height: 320px;
  overflow: auto;
}

.chip-option {
  border-radius: 10px;
  padding: 8px 10px;
  background: rgba(255, 255, 255, 0.12);
  display: grid;
  grid-template-columns: auto 1fr;
  gap: 6px;
  align-items: center;
}

.chip-option input {
  margin: 0;
}

.chip-option span {
  color: rgba(236, 245, 255, 0.96);
  font-size: 12px;
  word-break: break-word;
}

.inline-actions {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
  align-items: center;
}

.advanced-block {
  border-radius: 10px;
  padding: 10px;
  background: rgba(11, 18, 29, 0.28);
  display: grid;
  gap: 8px;
}

.field-label {
  font-size: 12px;
  color: rgba(218, 229, 247, 0.88);
}

.field-input {
  border: 0;
  border-radius: 10px;
  min-height: 38px;
  padding: 0 12px;
  background: rgba(8, 14, 24, 0.56);
  color: rgba(237, 245, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(165, 186, 223, 0.22);
}

.grow {
  flex: 1;
}

.primary-btn,
.ghost-btn {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  padding: 0 14px;
  color: rgba(242, 247, 255, 0.94);
}

.primary-btn {
  background: rgba(var(--accent-rgb), 0.34);
}

.ghost-btn {
  background: rgba(255, 255, 255, 0.18);
}

.error-text {
  color: rgba(255, 188, 206, 0.96);
}

@media (max-width: 1100px) {
  .content-split {
    grid-template-columns: 1fr;
  }

  .chip-grid {
    max-height: none;
  }
}
</style>
