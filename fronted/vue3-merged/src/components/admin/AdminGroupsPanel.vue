<template>
  <section class="panel-grid">
    <header class="panel-head">
      <h2>分组目录</h2>
      <p class="helper-text">分组统一在这里维护，默认用表格操作与状态选择。</p>
    </header>

    <div class="inline-actions">
      <input
        :value="queryKeyword"
        class="field-input grow"
        type="text"
        placeholder="搜索组编码/组名/描述"
        @input="$emit('update:queryKeyword', $event.target.value)"
      />
      <select :value="queryStatus" class="field-select" @change="$emit('update:queryStatus', $event.target.value)">
        <option value="">全部状态</option>
        <option value="ACTIVE">ACTIVE</option>
        <option value="DISABLED">DISABLED</option>
      </select>
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading" @click="$emit('search', 1)">
        {{ loading ? '查询中...' : '搜索' }}
      </button>
      <button class="primary-btn ripple-trigger" type="button" @click="openCreateModal">新增分组</button>
    </div>

    <div class="content-split">
      <div class="table-wrap">
        <table class="admin-table">
          <thead>
            <tr>
              <th>组编码</th>
              <th>组名</th>
              <th>状态</th>
              <th>内置</th>
              <th>用户数</th>
              <th>权限数</th>
              <th>配额项</th>
            </tr>
          </thead>
          <tbody>
            <tr
              v-for="item in groupsPage.items"
              :key="item.groupCode"
              :class="{ active: selectedGroupCode === item.groupCode }"
              @click="$emit('selectGroup', item)"
            >
              <td>
                <GroupBadge :group-code="item.groupCode" />
              </td>
              <td>{{ item.displayName || item.groupCode }}</td>
              <td>{{ item.status }}</td>
              <td>{{ item.builtIn ? '是' : '否' }}</td>
              <td>{{ item.userCount }}</td>
              <td>{{ item.permissionCount }}</td>
              <td>{{ item.quotaCount }}</td>
            </tr>
            <tr v-if="!groupsPage.items.length">
              <td colspan="7">暂无分组数据</td>
            </tr>
          </tbody>
        </table>
      </div>

      <aside class="side-editor liquid-material">
        <h3>分组编辑</h3>
        <p class="helper-text" v-if="!selectedGroup">请先在左侧选择一个分组。</p>
        <template v-else>
          <div class="selected-group-line">
            <GroupBadge :group-code="selectedGroup.groupCode" :label="selectedGroup.displayName || selectedGroup.groupCode" />
          </div>
          <label class="field-label" for="edit-display-name">组名</label>
          <input id="edit-display-name" v-model.trim="editForm.displayName" class="field-input" type="text" maxlength="64" />

          <label class="field-label" for="edit-description">描述</label>
          <textarea id="edit-description" v-model.trim="editForm.description" class="field-textarea" rows="3"></textarea>

          <label class="field-label" for="edit-status">状态</label>
          <select id="edit-status" v-model="editForm.status" class="field-select">
            <option value="ACTIVE">ACTIVE</option>
            <option value="DISABLED">DISABLED</option>
          </select>

          <div class="inline-actions">
            <button class="primary-btn ripple-trigger" type="button" :disabled="submitting" @click="submitUpdate">
              {{ submitting ? '保存中...' : '保存分组' }}
            </button>
            <button
              class="danger-btn ripple-trigger"
              type="button"
              :disabled="submitting || selectedGroup.groupCode === 'ADMIN'"
              @click="$emit('requestDelete', selectedGroup)"
            >
              删除分组
            </button>
          </div>
          <p class="helper-text" v-if="selectedGroup.groupCode === 'ADMIN'">ADMIN 为系统保留分组，不允许删除。</p>
        </template>
      </aside>
    </div>

    <div class="pager">
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading || groupsPage.page <= 1" @click="$emit('search', groupsPage.page - 1)">
        上一页
      </button>
      <span>第 {{ groupsPage.page }} 页 / 共 {{ totalPages }} 页（总计 {{ groupsPage.total }}）</span>
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading || groupsPage.page >= totalPages" @click="$emit('search', groupsPage.page + 1)">
        下一页
      </button>
    </div>

    <p v-if="error" class="error-text">{{ error }}</p>

    <transition name="dialog-fade">
      <div v-if="createVisible" class="dialog-mask" @click.self="closeCreateModal">
        <section class="dialog-shell liquid-material" @click.stop>
          <h3>新增分组</h3>
          <label class="field-label" for="create-display-name">组名</label>
          <input id="create-display-name" v-model.trim="createForm.displayName" class="field-input" type="text" maxlength="64" />
          <label class="field-label" for="create-description">描述（可选）</label>
          <textarea id="create-description" v-model.trim="createForm.description" class="field-textarea" rows="3"></textarea>
          <div class="inline-actions">
            <button class="ghost-btn ripple-trigger" type="button" :disabled="submitting" @click="closeCreateModal">取消</button>
            <button class="primary-btn ripple-trigger" type="button" :disabled="submitting" @click="submitCreate">
              {{ submitting ? '创建中...' : '创建分组' }}
            </button>
          </div>
        </section>
      </div>
    </transition>
  </section>
</template>

<script setup>
import { reactive, ref, watch } from 'vue';
import GroupBadge from './GroupBadge.vue';

const props = defineProps({
  loading: { type: Boolean, default: false },
  submitting: { type: Boolean, default: false },
  error: { type: String, default: '' },
  queryKeyword: { type: String, default: '' },
  queryStatus: { type: String, default: '' },
  groupsPage: {
    type: Object,
    default: () => ({
      page: 1,
      pageSize: 20,
      total: 0,
      items: []
    })
  },
  totalPages: { type: Number, default: 1 },
  selectedGroupCode: { type: String, default: '' },
  selectedGroup: { type: Object, default: null }
});

const emit = defineEmits([
  'update:queryKeyword',
  'update:queryStatus',
  'search',
  'selectGroup',
  'createGroup',
  'updateGroup',
  'requestDelete'
]);

const createVisible = ref(false);
const createForm = reactive({
  displayName: '',
  description: ''
});
const editForm = reactive({
  displayName: '',
  description: '',
  status: 'ACTIVE'
});

watch(
  () => props.selectedGroup,
  (next) => {
    if (!next) return;
    editForm.displayName = String(next.displayName || '').trim();
    editForm.description = String(next.description || '').trim();
    editForm.status = String(next.status || 'ACTIVE').toUpperCase();
  },
  { immediate: true }
);

function openCreateModal() {
  createForm.displayName = '';
  createForm.description = '';
  createVisible.value = true;
}

function closeCreateModal() {
  createVisible.value = false;
}

function submitCreate() {
  emit('createGroup', {
    displayName: createForm.displayName,
    description: createForm.description
  });
  createVisible.value = false;
}

function submitUpdate() {
  if (!props.selectedGroup) return;
  emit('updateGroup', {
    groupCode: props.selectedGroup.groupCode,
    displayName: editForm.displayName,
    description: editForm.description,
    status: editForm.status
  });
}
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

.inline-actions {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
  align-items: center;
}

.field-label {
  font-size: 12px;
  color: rgba(218, 229, 247, 0.88);
}

.field-input,
.field-select,
.field-textarea {
  border: 0;
  border-radius: 10px;
  min-height: 38px;
  padding: 0 12px;
  background: rgba(8, 14, 24, 0.56);
  color: rgba(237, 245, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(165, 186, 223, 0.22);
}

.field-select {
  min-width: 130px;
}

.field-textarea {
  min-height: 100px;
  padding: 10px 12px;
  resize: vertical;
}

.grow {
  flex: 1;
}

.content-split {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(290px, 340px);
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
  min-width: 680px;
  font-size: 13px;
}

.admin-table th,
.admin-table td {
  text-align: left;
  padding: 10px 8px;
  border-bottom: 1px solid rgba(180, 203, 232, 0.14);
  color: rgba(232, 241, 253, 0.92);
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
  gap: 8px;
  align-content: start;
}

.selected-group-line {
  display: flex;
  align-items: center;
}

.primary-btn,
.ghost-btn,
.danger-btn {
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

.danger-btn {
  background: rgba(252, 96, 130, 0.34);
}

.pager {
  display: flex;
  gap: 8px;
  align-items: center;
  flex-wrap: wrap;
  color: rgba(216, 232, 250, 0.92);
}

.error-text {
  color: rgba(255, 188, 206, 0.96);
}

.dialog-mask {
  position: fixed;
  inset: 0;
  z-index: 1300;
  display: grid;
  place-items: center;
  background: rgba(6, 10, 20, 0.44);
  backdrop-filter: blur(4px);
  padding: 12px;
}

.dialog-shell {
  --liquid-bg: rgba(18, 24, 36, 0.78);
  --liquid-border: rgba(255, 255, 255, 0.24);
  --liquid-shadow: 0 22px 48px rgba(0, 0, 0, 0.35);
  width: min(520px, 100%);
  border-radius: 14px;
  padding: 16px;
  display: grid;
  gap: 10px;
}

.dialog-fade-enter-active,
.dialog-fade-leave-active {
  transition: opacity 0.2s ease;
}

.dialog-fade-enter-from,
.dialog-fade-leave-to {
  opacity: 0;
}

@media (max-width: 1080px) {
  .content-split {
    grid-template-columns: 1fr;
  }
}
</style>
