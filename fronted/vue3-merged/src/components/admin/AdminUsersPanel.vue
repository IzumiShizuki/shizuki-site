<template>
  <section class="panel-grid">
    <header class="panel-head">
      <h2 class="adm-title">用户管理</h2>
      <p class="adm-desc">在表格中选中用户，右侧用勾选方式调整分组归属。</p>
    </header>

    <div class="adm-toolbar">
      <input
        :value="queryKeyword"
        class="adm-input adm-grow"
        type="search"
        placeholder="搜索用户ID / 用户名 / 昵称 / 邮箱"
        aria-label="搜索用户"
        @input="$emit('update:queryKeyword', $event.target.value)"
        @keyup.enter="$emit('search', 1)"
      />
      <select
        :value="String(usersPage.pageSize || 20)"
        class="adm-select adm-select--sm"
        aria-label="每页条数"
        @change="onPageSizeChange($event)"
      >
        <option value="10">10 条/页</option>
        <option value="20">20 条/页</option>
        <option value="50">50 条/页</option>
      </select>
      <button class="adm-btn adm-btn--primary ripple-trigger" type="button" :disabled="loading" @click="$emit('search', 1)">
        {{ loading ? '查询中...' : '搜索' }}
      </button>
    </div>

    <div class="content-split">
      <div class="adm-table-wrap">
        <table class="adm-table">
          <thead>
            <tr>
              <th>用户</th>
              <th>ID</th>
              <th>邮箱</th>
              <th>邮箱验证</th>
              <th>分组</th>
              <th>独立权限</th>
            </tr>
          </thead>
          <tbody>
            <tr
              v-for="item in usersPage.items"
              :key="item.userId"
              :class="{ 'is-active': selectedUserId === item.userId }"
              @click="$emit('selectUser', item)"
            >
              <td>
                <div class="user-cell">
                  <img class="avatar-thumb" :src="item.avatarUrl || '/images/katanegai.jpg'" alt="" loading="lazy" />
                  <div class="user-cell-text">
                    <span class="user-name">{{ item.nickname || item.username || '-' }}</span>
                    <span class="adm-cell-secondary">@{{ item.username || '-' }}</span>
                  </div>
                </div>
              </td>
              <td><span class="adm-cell-secondary">#{{ item.userId }}</span></td>
              <td>{{ item.email || '-' }}</td>
              <td>
                <span class="adm-flag" :class="item.emailVerified ? 'adm-flag--on' : 'adm-flag--off'">
                  {{ item.emailVerified ? '已验证' : '未验证' }}
                </span>
              </td>
              <td>
                <div class="group-badges" v-if="(item.groups || []).length">
                  <GroupBadge v-for="group in item.groups" :key="`${item.userId}-${group}`" :group-code="group" />
                </div>
                <span v-else class="adm-cell-secondary">-</span>
              </td>
              <td>
                <span
                  v-if="(item.permissions || []).length"
                  class="adm-count"
                  :title="(item.permissions || []).join('\n')"
                >{{ item.permissions.length }}</span>
                <span v-else class="adm-cell-secondary">-</span>
              </td>
            </tr>
            <tr v-if="!usersPage.items.length">
              <td colspan="6"><div class="adm-empty">{{ loading ? '正在加载...' : '暂无用户数据' }}</div></td>
            </tr>
          </tbody>
        </table>
      </div>

      <aside class="adm-card">
        <h3>用户分组编辑</h3>
        <p class="adm-desc" v-if="!selectedUser">请先在左侧选择一个用户。</p>
        <template v-else>
          <div class="selected-user-line">
            <img class="avatar-thumb avatar-thumb--lg" :src="selectedUser.avatarUrl || '/images/katanegai.jpg'" alt="" />
            <div class="user-cell-text">
              <span class="user-name">{{ selectedUser.nickname || selectedUser.username || '-' }}</span>
              <span class="adm-cell-secondary">#{{ selectedUser.userId }} · @{{ selectedUser.username || '-' }}</span>
            </div>
          </div>
          <div class="chip-grid">
            <label
              v-for="group in activeGroupOptions"
              :key="group.groupCode"
              class="adm-perm"
              :class="{ 'is-on': selectedUserGroups.includes(group.groupCode) }"
            >
              <input
                type="checkbox"
                :checked="selectedUserGroups.includes(group.groupCode)"
                @change="$emit('toggleUserGroup', group.groupCode)"
              />
              <span class="adm-perm-main">
                <GroupBadge :group-code="group.groupCode" :label="group.displayName || group.groupCode" />
                <span class="adm-perm-code">{{ group.groupCode }}</span>
              </span>
            </label>
          </div>
          <div class="adm-toolbar">
            <button class="adm-btn adm-btn--primary ripple-trigger" type="button" :disabled="saving" @click="$emit('saveUserGroups')">
              {{ saving ? '保存中...' : '保存分组归属' }}
            </button>
          </div>
        </template>
      </aside>
    </div>

    <div class="adm-pager">
      <button
        class="adm-btn adm-btn--ghost adm-btn--sm ripple-trigger"
        type="button"
        :disabled="loading || usersPage.page <= 1"
        @click="$emit('search', usersPage.page - 1)"
      >
        上一页
      </button>
      <span>第 {{ usersPage.page }} / {{ totalPages }} 页 · 共 {{ usersPage.total }} 位用户</span>
      <button
        class="adm-btn adm-btn--ghost adm-btn--sm ripple-trigger"
        type="button"
        :disabled="loading || usersPage.page >= totalPages"
        @click="$emit('search', usersPage.page + 1)"
      >
        下一页
      </button>
    </div>

    <p v-if="error" class="adm-error">{{ error }}</p>
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

const emit = defineEmits([
  'update:queryKeyword',
  'update:pageSize',
  'search',
  'selectUser',
  'toggleUserGroup',
  'saveUserGroups'
]);

const activeGroupOptions = computed(() =>
  (props.groupOptions || []).filter((item) => String(item.status || '').toUpperCase() !== 'DISABLED')
);

function onPageSizeChange(event) {
  const size = Number(event?.target?.value) || 20;
  emit('update:pageSize', size);
  emit('search', 1);
}
</script>

<style scoped>
.panel-grid {
  display: grid;
  gap: 12px;
}

.content-split {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(280px, 340px);
  gap: 12px;
  align-items: start;
}

.user-cell {
  display: flex;
  align-items: center;
  gap: 10px;
  min-width: 0;
}

.user-cell-text {
  display: grid;
  gap: 2px;
  min-width: 0;
}

.user-name {
  font-weight: 600;
  color: var(--theme-text-primary);
  overflow: hidden;
  text-overflow: ellipsis;
  white-space: nowrap;
  max-width: 180px;
}

.avatar-thumb {
  width: 34px;
  height: 34px;
  border-radius: 50%;
  object-fit: cover;
  flex: none;
  box-shadow:
    0 4px 10px rgba(4, 7, 12, 0.18),
    inset 0 0 0 1px var(--theme-border-strong);
  transition: transform 0.2s ease;
}

.avatar-thumb--lg {
  width: 44px;
  height: 44px;
}

.adm-table tbody tr:hover .avatar-thumb {
  transform: scale(1.06);
}

.group-badges {
  display: flex;
  flex-wrap: wrap;
  gap: 5px;
}

.selected-user-line {
  display: flex;
  align-items: center;
  gap: 10px;
}

.chip-grid {
  display: grid;
  gap: 8px;
}

.adm-perm-main {
  display: grid;
  gap: 4px;
  justify-items: start;
}

@media (max-width: 1080px) {
  .content-split {
    grid-template-columns: 1fr;
  }
}
</style>
