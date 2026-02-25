<template>
  <section class="panel-grid">
    <header class="panel-head">
      <h2>用户管理</h2>
      <p class="helper-text">以表格选中用户，再在右侧用勾选方式调整分组归属。</p>
    </header>

    <div class="inline-actions">
      <input
        :value="queryKeyword"
        class="field-input grow"
        type="text"
        placeholder="搜索用户ID/用户名/昵称/邮箱"
        @input="$emit('update:queryKeyword', $event.target.value)"
      />
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading" @click="$emit('search', 1)">
        {{ loading ? '查询中...' : '搜索' }}
      </button>
    </div>

    <div class="content-split">
      <div class="table-wrap">
        <table class="admin-table">
          <thead>
            <tr>
              <th>头像</th>
              <th>ID</th>
              <th>用户名</th>
              <th>昵称</th>
              <th>邮箱</th>
              <th>邮箱验证</th>
              <th>分组</th>
              <th>权限</th>
            </tr>
          </thead>
          <tbody>
            <tr
              v-for="item in usersPage.items"
              :key="item.userId"
              :class="{ active: selectedUserId === item.userId }"
              @click="$emit('selectUser', item)"
            >
              <td>
                <div class="avatar-cell">
                  <img class="avatar-thumb" :src="item.avatarUrl || '/images/katanegai.jpg'" alt="user-avatar" />
                </div>
              </td>
              <td>{{ item.userId }}</td>
              <td>{{ item.username || '-' }}</td>
              <td>{{ item.nickname || '-' }}</td>
              <td>{{ item.email || '-' }}</td>
              <td>{{ item.emailVerified ? '是' : '否' }}</td>
              <td>
                <div class="group-badges" v-if="(item.groups || []).length">
                  <GroupBadge v-for="group in item.groups" :key="`${item.userId}-${group}`" :group-code="group" />
                </div>
                <span v-else>-</span>
              </td>
              <td>{{ (item.permissions || []).join(', ') || '-' }}</td>
            </tr>
            <tr v-if="!usersPage.items.length">
              <td colspan="8">暂无用户数据</td>
            </tr>
          </tbody>
        </table>
      </div>

      <aside class="side-editor liquid-material">
        <h3>用户分组编辑</h3>
        <p class="helper-text" v-if="!selectedUser">请先在左侧选择一个用户。</p>
        <template v-else>
          <p class="helper-text">当前用户：#{{ selectedUser.userId }} · {{ selectedUser.username || selectedUser.nickname || '-' }}</p>
          <div class="chip-grid">
            <label v-for="group in activeGroupOptions" :key="group.groupCode" class="chip-option">
              <input
                type="checkbox"
                :checked="selectedUserGroups.includes(group.groupCode)"
                @change="$emit('toggleUserGroup', group.groupCode)"
              />
              <div class="chip-main">
                <GroupBadge :group-code="group.groupCode" :label="group.displayName || group.groupCode" />
                <small>{{ group.groupCode }}</small>
              </div>
            </label>
          </div>
          <div class="inline-actions">
            <button class="primary-btn ripple-trigger" type="button" :disabled="saving" @click="$emit('saveUserGroups')">
              {{ saving ? '保存中...' : '保存分组归属' }}
            </button>
          </div>
        </template>
      </aside>
    </div>

    <div class="pager">
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading || usersPage.page <= 1" @click="$emit('search', usersPage.page - 1)">
        上一页
      </button>
      <span>第 {{ usersPage.page }} 页 / 共 {{ totalPages }} 页（总计 {{ usersPage.total }}）</span>
      <button class="ghost-btn ripple-trigger" type="button" :disabled="loading || usersPage.page >= totalPages" @click="$emit('search', usersPage.page + 1)">
        下一页
      </button>
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
  queryKeyword: { type: String, default: '' },
  usersPage: {
    type: Object,
    default: () => ({
      page: 1,
      pageSize: 20,
      total: 0,
      items: []
    })
  },
  totalPages: { type: Number, default: 1 },
  selectedUserId: { type: Number, default: 0 },
  selectedUser: { type: Object, default: null },
  selectedUserGroups: { type: Array, default: () => [] },
  groupOptions: { type: Array, default: () => [] }
});

defineEmits(['update:queryKeyword', 'search', 'selectUser', 'toggleUserGroup', 'saveUserGroups']);

const activeGroupOptions = computed(() =>
  (props.groupOptions || []).filter((item) => String(item.status || '').toUpperCase() !== 'DISABLED')
);
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

.content-split {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(280px, 340px);
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
  min-width: 780px;
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

.avatar-cell {
  width: 38px;
  height: 38px;
  border-radius: 50%;
  overflow: hidden;
  background: rgba(7, 12, 20, 0.6);
  box-shadow:
    0 6px 14px rgba(4, 7, 12, 0.26),
    inset 0 0 0 1px rgba(200, 219, 244, 0.26);
}

.avatar-thumb {
  width: 100%;
  height: 100%;
  object-fit: cover;
  transition: transform 0.2s ease;
}

.admin-table tbody tr:hover .avatar-thumb {
  transform: scale(1.08);
}

.group-badges {
  display: flex;
  flex-wrap: wrap;
  gap: 6px;
}

.admin-table th {
  color: rgba(194, 218, 245, 0.92);
  font-weight: 600;
  background: rgba(11, 18, 29, 0.36);
}

.admin-table tbody tr {
  cursor: pointer;
  transition: background-color 0.18s ease;
}

.admin-table tbody tr:hover {
  background: rgba(255, 255, 255, 0.06);
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
  gap: 8px;
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

.chip-main {
  display: grid;
  gap: 4px;
}

.chip-main small {
  color: rgba(188, 211, 241, 0.86);
  font-size: 11px;
}

.pager {
  display: flex;
  gap: 8px;
  align-items: center;
  flex-wrap: wrap;
  color: rgba(216, 232, 250, 0.92);
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

@media (max-width: 1080px) {
  .content-split {
    grid-template-columns: 1fr;
  }
}
</style>
