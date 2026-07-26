<template>
  <section class="panel-grid">
    <header class="panel-head">
      <h2 class="adm-title">分组目录</h2>
      <p class="adm-desc">分组统一在这里维护；选中分组后可在右侧编辑组名、描述与状态。</p>
    </header>

    <div class="adm-toolbar">
      <input
        :value="queryKeyword"
        class="adm-input adm-grow"
        type="search"
        placeholder="搜索组编码 / 组名 / 描述"
        aria-label="搜索分组"
        @input="$emit('update:queryKeyword', $event.target.value)"
        @keyup.enter="$emit('search', 1)"
      />
      <select :value="queryStatus" class="adm-select" aria-label="状态筛选" @change="$emit('update:queryStatus', $event.target.value)">
        <option value="">全部状态</option>
        <option value="ACTIVE">启用</option>
        <option value="DISABLED">停用</option>
      </select>
      <button class="adm-btn adm-btn--ghost ripple-trigger" type="button" :disabled="loading" @click="$emit('search', 1)">
        {{ loading ? '查询中...' : '搜索' }}
      </button>
      <button class="adm-btn adm-btn--primary ripple-trigger" type="button" @click="openCreateModal">新增分组</button>
    </div>

    <div class="content-split">
      <div class="adm-table-wrap">
        <table class="adm-table">
          <thead>
            <tr>
              <th>分组</th>
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
              :class="{ 'is-active': selectedGroupCode === item.groupCode }"
              @click="$emit('selectGroup', item)"
            >
              <td><GroupBadge :group-code="item.groupCode" /></td>
              <td>{{ item.displayName || item.groupCode }}</td>
              <td>
                <span class="adm-flag" :class="item.status === 'ACTIVE' ? 'adm-flag--on' : 'adm-flag--off'">
                  {{ item.status === 'ACTIVE' ? '启用' : '停用' }}
                </span>
              </td>
              <td><span class="adm-cell-secondary">{{ item.builtIn ? '内置' : '自定义' }}</span></td>
              <td><span class="adm-count">{{ item.userCount }}</span></td>
              <td><span class="adm-count">{{ item.permissionCount }}</span></td>
              <td><span class="adm-count">{{ item.quotaCount }}</span></td>
            </tr>
            <tr v-if="!groupsPage.items.length">
              <td colspan="7"><div class="adm-empty">{{ loading ? '正在加载...' : '暂无分组数据' }}</div></td>
            </tr>
          </tbody>
        </table>
      </div>

      <aside class="adm-card">
        <h3>分组编辑</h3>
        <p class="adm-desc" v-if="!selectedGroup">请先在左侧选择一个分组。</p>
        <template v-else>
          <div class="selected-group-line">
            <GroupBadge :group-code="selectedGroup.groupCode" :label="selectedGroup.displayName || selectedGroup.groupCode" />
            <span class="adm-cell-secondary">{{ selectedGroup.groupCode }}</span>
          </div>

          <label class="adm-label" for="edit-display-name">组名</label>
          <input id="edit-display-name" v-model.trim="editForm.displayName" class="adm-input" type="text" maxlength="64" />

          <label class="adm-label" for="edit-description">描述</label>
          <textarea id="edit-description" v-model.trim="editForm.description" class="adm-textarea" rows="3"></textarea>

          <label class="adm-label" for="edit-status">状态</label>
          <select id="edit-status" v-model="editForm.status" class="adm-select" :disabled="selectedGroup.groupCode === 'ADMIN'">
            <option value="ACTIVE">启用（ACTIVE）</option>
            <option value="DISABLED">停用（DISABLED）</option>
          </select>

          <div class="adm-toolbar">
            <button class="adm-btn adm-btn--primary ripple-trigger" type="button" :disabled="submitting" @click="submitUpdate">
              {{ submitting ? '保存中...' : '保存分组' }}
            </button>
            <button
              class="adm-btn adm-btn--danger ripple-trigger"
              type="button"
              :disabled="submitting || selectedGroup.groupCode === 'ADMIN'"
              @click="$emit('requestDelete', selectedGroup)"
            >
              删除分组
            </button>
          </div>
          <p class="adm-muted" v-if="selectedGroup.groupCode === 'ADMIN'">ADMIN 为系统保留分组，不允许停用或删除。</p>
        </template>
      </aside>
    </div>

    <div class="adm-pager">
      <button
        class="adm-btn adm-btn--ghost adm-btn--sm ripple-trigger"
        type="button"
        :disabled="loading || groupsPage.page <= 1"
        @click="$emit('search', groupsPage.page - 1)"
      >
        上一页
      </button>
      <span>第 {{ groupsPage.page }} / {{ totalPages }} 页 · 共 {{ groupsPage.total }} 个分组</span>
      <button
        class="adm-btn adm-btn--ghost adm-btn--sm ripple-trigger"
        type="button"
        :disabled="loading || groupsPage.page >= totalPages"
        @click="$emit('search', groupsPage.page + 1)"
      >
        下一页
      </button>
    </div>

    <p v-if="error" class="adm-error">{{ error }}</p>

    <transition name="dialog-fade">
      <div v-if="createVisible" class="adm-dialog-mask" @click.self="closeCreateModal">
        <section class="adm-dialog" @click.stop>
          <h3>新增分组</h3>
          <p>只需填写组名，系统会自动生成分组编码（group_code）。</p>
          <label class="adm-label" for="create-display-name">组名</label>
          <input id="create-display-name" v-model.trim="createForm.displayName" class="adm-input" type="text" maxlength="64" />
          <label class="adm-label" for="create-description">描述（可选）</label>
          <textarea id="create-description" v-model.trim="createForm.description" class="adm-textarea" rows="3"></textarea>
          <div class="adm-toolbar dialog-actions">
            <button class="adm-btn adm-btn--ghost ripple-trigger" type="button" :disabled="submitting" @click="closeCreateModal">取消</button>
            <button class="adm-btn adm-btn--primary ripple-trigger" type="button" :disabled="submitting" @click="submitCreate">
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
  gap: 12px;
}

.content-split {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(290px, 340px);
  gap: 12px;
  align-items: start;
}

.selected-group-line {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.dialog-actions {
  justify-content: flex-end;
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
