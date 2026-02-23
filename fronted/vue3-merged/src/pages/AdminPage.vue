<template>
  <section class="route-page admin-page">
    <header class="page-header">
      <p class="eyebrow">Admin Console</p>
      <h1>管理后台</h1>
      <p>用户、分组权限、用户分组与配额策略统一管理。</p>
      <p v-if="globalHint" class="state-tip">{{ globalHint }}</p>
    </header>

    <div v-if="booting" class="state-tip">正在加载管理数据...</div>

    <div v-else class="dashboard-layout">
      <aside class="sidebar liquid-material">
        <button
          v-for="tab in tabs"
          :key="tab.key"
          class="side-item ripple-trigger"
          :class="{ active: activeTab === tab.key }"
          type="button"
          @click="openTab(tab.key)"
        >
          {{ tab.label }}
        </button>
      </aside>

      <section class="content-panel liquid-material">
        <div v-if="activeTab === 'users'" class="content-block">
          <h2>用户列表</h2>
          <div class="inline-actions">
            <input v-model.trim="usersQuery.keyword" class="field-input grow" type="text" placeholder="搜索用户ID/用户名/昵称/邮箱" />
            <button class="ghost-btn ripple-trigger" type="button" :disabled="usersLoading" @click="reloadUsers(1)">
              {{ usersLoading ? '查询中...' : '搜索' }}
            </button>
          </div>

          <div class="table-wrap">
            <table class="admin-table">
              <thead>
                <tr>
                  <th>ID</th>
                  <th>用户名</th>
                  <th>昵称</th>
                  <th>邮箱</th>
                  <th>邮箱验证</th>
                  <th>分组</th>
                  <th>权限</th>
                  <th>创建时间</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="item in usersPage.items" :key="item.userId" :class="{ active: selectedUserId === item.userId }" @click="selectUser(item)">
                  <td>{{ item.userId }}</td>
                  <td>{{ item.username || '-' }}</td>
                  <td>{{ item.nickname || '-' }}</td>
                  <td>{{ item.email || '-' }}</td>
                  <td>{{ item.emailVerified ? '是' : '否' }}</td>
                  <td>{{ item.groups.join(', ') || '-' }}</td>
                  <td>{{ item.permissions.join(', ') || '-' }}</td>
                  <td>{{ item.createdAt || '-' }}</td>
                </tr>
                <tr v-if="!usersPage.items.length">
                  <td colspan="8">暂无数据</td>
                </tr>
              </tbody>
            </table>
          </div>

          <div class="pager">
            <button class="ghost-btn ripple-trigger" type="button" :disabled="usersLoading || usersPage.page <= 1" @click="reloadUsers(usersPage.page - 1)">
              上一页
            </button>
            <span>第 {{ usersPage.page }} 页 / 共 {{ totalPages }} 页（总计 {{ usersPage.total }}）</span>
            <button class="ghost-btn ripple-trigger" type="button" :disabled="usersLoading || usersPage.page >= totalPages" @click="reloadUsers(usersPage.page + 1)">
              下一页
            </button>
          </div>
          <p v-if="usersError" class="error-text">{{ usersError }}</p>
        </div>

        <div v-else-if="activeTab === 'permissions'" class="content-block">
          <h2>分组权限</h2>
          <div class="table-wrap">
            <table class="admin-table">
              <thead>
                <tr>
                  <th>分组</th>
                  <th>权限列表</th>
                </tr>
              </thead>
              <tbody>
                <tr
                  v-for="item in groupPermissions"
                  :key="item.groupCode"
                  :class="{ active: selectedGroupCode === item.groupCode }"
                  @click="selectPermissionGroup(item.groupCode)"
                >
                  <td>{{ item.groupCode }}</td>
                  <td>{{ item.permissions.join(', ') || '-' }}</td>
                </tr>
                <tr v-if="!groupPermissions.length">
                  <td colspan="2">暂无分组权限</td>
                </tr>
              </tbody>
            </table>
          </div>

          <label class="field-label" for="group-permissions-editor">权限编辑（逗号/空格/换行分隔）</label>
          <textarea
            id="group-permissions-editor"
            v-model.trim="groupPermissionsDraft"
            class="field-textarea"
            rows="6"
            placeholder="group.permission.read&#10;group.permission.write"
          ></textarea>

          <div class="inline-actions">
            <button class="primary-btn ripple-trigger" type="button" :disabled="permissionsSubmitting" @click="submitGroupPermissions">
              {{ permissionsSubmitting ? '保存中...' : '保存分组权限' }}
            </button>
            <button class="ghost-btn ripple-trigger" type="button" :disabled="permissionsLoading" @click="reloadPermissions">
              {{ permissionsLoading ? '刷新中...' : '刷新' }}
            </button>
          </div>
          <p v-if="permissionsError" class="error-text">{{ permissionsError }}</p>
        </div>

        <div v-else-if="activeTab === 'groups'" class="content-block">
          <h2>用户分组</h2>
          <p class="helper-text">先在“用户列表”里选中用户，再编辑分组提交。</p>

          <div class="inline-actions">
            <input v-model.trim="groupEditor.userId" class="field-input grow" type="text" inputmode="numeric" placeholder="用户 ID" />
            <button class="ghost-btn ripple-trigger" type="button" :disabled="groupLoading" @click="loadSelectedUserGroups">
              {{ groupLoading ? '读取中...' : '读取当前分组' }}
            </button>
          </div>

          <label class="field-label" for="user-groups-editor">用户分组（逗号/空格/换行分隔）</label>
          <textarea
            id="user-groups-editor"
            v-model.trim="groupEditor.groupsDraft"
            class="field-textarea"
            rows="6"
            placeholder="USER&#10;ADMIN"
          ></textarea>

          <div class="inline-actions">
            <button class="primary-btn ripple-trigger" type="button" :disabled="groupSubmitting" @click="submitUserGroups">
              {{ groupSubmitting ? '保存中...' : '保存用户分组' }}
            </button>
          </div>
          <p v-if="groupError" class="error-text">{{ groupError }}</p>
        </div>

        <div v-else class="content-block">
          <h2>配额策略</h2>
          <div class="table-wrap">
            <table class="admin-table">
              <thead>
                <tr>
                  <th>策略ID</th>
                  <th>分组</th>
                  <th>配额编码</th>
                  <th>值</th>
                </tr>
              </thead>
              <tbody>
                <tr v-for="item in quotaPolicies" :key="item.policyId" :class="{ active: selectedPolicyId === item.policyId }" @click="selectPolicy(item.policyId)">
                  <td>{{ item.policyId }}</td>
                  <td>{{ item.groupCode }}</td>
                  <td>{{ item.quotaCode }}</td>
                  <td>{{ item.value }}</td>
                </tr>
                <tr v-if="!quotaPolicies.length">
                  <td colspan="4">暂无配额策略</td>
                </tr>
              </tbody>
            </table>
          </div>

          <form class="quota-editor" @submit.prevent="submitSinglePolicy">
            <label class="field-label" for="policy-id">策略 ID</label>
            <input id="policy-id" v-model.trim="policyDraft.policyId" class="field-input" type="text" required />

            <label class="field-label" for="policy-group-code">分组编码</label>
            <input id="policy-group-code" v-model.trim="policyDraft.groupCode" class="field-input" type="text" required />

            <label class="field-label" for="policy-quota-code">配额编码</label>
            <input id="policy-quota-code" v-model.trim="policyDraft.quotaCode" class="field-input" type="text" required />

            <label class="field-label" for="policy-value">配额值</label>
            <input id="policy-value" v-model.trim="policyDraft.value" class="field-input" type="number" required />

            <div class="inline-actions">
              <button class="primary-btn ripple-trigger" type="submit" :disabled="quotaSubmitting">
                {{ quotaSubmitting ? '保存中...' : '保存当前策略' }}
              </button>
              <button class="ghost-btn ripple-trigger" type="button" :disabled="quotaSubmitting" @click="submitBatchPolicies">
                批量提交全部策略
              </button>
              <button class="ghost-btn ripple-trigger" type="button" :disabled="quotaLoading" @click="reloadQuota">
                {{ quotaLoading ? '刷新中...' : '刷新列表' }}
              </button>
            </div>
          </form>
          <p v-if="quotaError" class="error-text">{{ quotaError }}</p>
        </div>
      </section>
    </div>

    <transition name="dialog-fade">
      <div v-if="unlockDialog.visible" class="dialog-mask" @click.self="cancelUnlockDialog">
        <section class="dialog-shell liquid-material" @click.stop>
          <h3>管理员权限码验证</h3>
          <p>本次写操作需要先验证权限码，验证成功后自动重试本次请求。</p>
          <label class="field-label" for="unlock-code-input">权限码</label>
          <input
            id="unlock-code-input"
            v-model.trim="unlockDialog.code"
            class="field-input"
            type="password"
            autocomplete="off"
            placeholder="请输入权限码"
            @keyup.enter="submitUnlockDialog"
          />
          <p v-if="unlockDialog.error" class="error-text">{{ unlockDialog.error }}</p>
          <div class="inline-actions">
            <button class="ghost-btn ripple-trigger" type="button" :disabled="unlockDialog.submitting" @click="cancelUnlockDialog">
              取消
            </button>
            <button class="primary-btn ripple-trigger" type="button" :disabled="unlockDialog.submitting" @click="submitUnlockDialog">
              {{ unlockDialog.submitting ? '验证中...' : '确认验证' }}
            </button>
          </div>
        </section>
      </div>
    </transition>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';
import * as adminApi from '../services/adminApi';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();

const tabs = [
  { key: 'users', label: '用户列表' },
  { key: 'permissions', label: '分组权限' },
  { key: 'groups', label: '用户分组' },
  { key: 'quota', label: '配额策略' }
];

const booting = ref(true);
const globalHint = ref('');

const usersLoading = ref(false);
const usersError = ref('');
const usersQuery = reactive({
  keyword: '',
  pageSize: 20
});
const usersPage = reactive({
  page: 1,
  pageSize: 20,
  total: 0,
  items: []
});
const selectedUserId = ref(0);

const permissionsLoading = ref(false);
const permissionsSubmitting = ref(false);
const permissionsError = ref('');
const groupPermissions = ref([]);
const selectedGroupCode = ref('');
const groupPermissionsDraft = ref('');

const groupLoading = ref(false);
const groupSubmitting = ref(false);
const groupError = ref('');
const groupEditor = reactive({
  userId: '',
  groupsDraft: ''
});

const quotaLoading = ref(false);
const quotaSubmitting = ref(false);
const quotaError = ref('');
const quotaPolicies = ref([]);
const selectedPolicyId = ref('');
const policyDraft = reactive({
  policyId: '',
  groupCode: '',
  quotaCode: '',
  value: ''
});

const unlockDialog = reactive({
  visible: false,
  code: '',
  error: '',
  submitting: false
});
let unlockResolver = null;

function normalizeTab(raw) {
  const key = String(raw || '');
  return tabs.some((item) => item.key === key) ? key : 'users';
}

const activeTab = computed(() => {
  const raw = typeof route.query.tab === 'string' ? route.query.tab : '';
  return normalizeTab(raw);
});

const totalPages = computed(() => {
  if (!usersPage.total || !usersPage.pageSize) return 1;
  return Math.max(1, Math.ceil(usersPage.total / usersPage.pageSize));
});

const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((groupCode) => String(groupCode || '').toUpperCase() === 'ADMIN');
});

function openTab(tabKey) {
  const normalized = normalizeTab(tabKey);
  if (activeTab.value === normalized) return;
  router.replace({ path: '/admin', query: { tab: normalized } });
}

function setGlobalHint(message) {
  globalHint.value = message;
}

function readField(raw, camel, snake, fallback = '') {
  if (!raw || typeof raw !== 'object') return fallback;
  if (raw[camel] !== undefined && raw[camel] !== null) return raw[camel];
  if (raw[snake] !== undefined && raw[snake] !== null) return raw[snake];
  return fallback;
}

function toPositiveInt(input, fallback = 0) {
  const value = Number.parseInt(String(input || ''), 10);
  return Number.isFinite(value) && value > 0 ? value : fallback;
}

function normalizeCodeList(input, upperCase = false) {
  let items = [];
  if (Array.isArray(input)) {
    items = input.map((item) => String(item || '').trim()).filter(Boolean);
  } else {
    items = String(input || '')
      .split(/[\s,，;；]+/)
      .map((item) => item.trim())
      .filter(Boolean);
  }
  const normalized = upperCase ? items.map((item) => item.toUpperCase()) : items;
  return Array.from(new Set(normalized));
}

function toAdminUserItem(raw) {
  return {
    userId: toPositiveInt(readField(raw, 'userId', 'user_id', 0), 0),
    username: String(readField(raw, 'username', 'username', '') || ''),
    nickname: String(readField(raw, 'nickname', 'nickname', '') || ''),
    email: String(readField(raw, 'email', 'email', '') || ''),
    emailVerified: Number(readField(raw, 'emailVerified', 'email_verified', 0)) > 0,
    avatarUrl: String(readField(raw, 'avatarUrl', 'avatar_url', '') || ''),
    groups: normalizeCodeList(readField(raw, 'groups', 'groups', []), true),
    permissions: normalizeCodeList(readField(raw, 'permissions', 'permissions', []), false),
    createdAt: String(readField(raw, 'createdAt', 'created_at', '') || '')
  };
}

function toGroupPermissionView(raw) {
  return {
    groupCode: String(readField(raw, 'groupCode', 'group_code', '') || '').toUpperCase(),
    permissions: normalizeCodeList(readField(raw, 'permissions', 'permissions', []), false)
  };
}

function toUserGroupsView(raw) {
  return {
    userId: toPositiveInt(readField(raw, 'userId', 'user_id', 0), 0),
    groups: normalizeCodeList(readField(raw, 'groups', 'groups', []), true)
  };
}

function toQuotaView(raw) {
  return {
    policyId: String(readField(raw, 'policyId', 'policy_id', '') || ''),
    groupCode: String(readField(raw, 'groupCode', 'group_code', '') || '').toUpperCase(),
    quotaCode: String(readField(raw, 'quotaCode', 'quota_code', '') || ''),
    value: Number(readField(raw, 'value', 'value', 0)) || 0
  };
}

function readErrorMessage(error) {
  if (error && typeof error === 'object') {
    if (typeof error.detail === 'string' && error.detail) return error.detail;
    if (typeof error.message === 'string' && error.message) return error.message;
  }
  return '请求失败，请稍后重试';
}

function readProblemCode(error) {
  if (!error || typeof error !== 'object') return '';
  const own = String(error.problemCode || '').toUpperCase();
  if (own) return own;
  return String(error.body?.code || '').toUpperCase();
}

function readErrorReason(error) {
  if (!error || typeof error !== 'object') return '';
  if (typeof error.reason === 'string' && error.reason) return error.reason;
  if (typeof error.body?.reason === 'string' && error.body.reason) return error.body.reason;
  if (typeof error.body?.details?.reason === 'string' && error.body.details.reason) return error.body.details.reason;
  return '';
}

function isPrivilegeRequiredError(error) {
  const code = readProblemCode(error);
  const reason = readErrorReason(error);
  if (code === 'FORBIDDEN' && reason === 'ADMIN_PRIVILEGE_REQUIRED') {
    return true;
  }
  const text = String(error?.detail || error?.message || '').toLowerCase();
  return text.includes('admin privilege verification required');
}

function openUnlockDialog() {
  unlockDialog.visible = true;
  unlockDialog.code = '';
  unlockDialog.error = '';
  unlockDialog.submitting = false;
  return new Promise((resolve) => {
    unlockResolver = resolve;
  });
}

function closeUnlockDialog(result) {
  unlockDialog.visible = false;
  unlockDialog.code = '';
  unlockDialog.error = '';
  unlockDialog.submitting = false;
  if (unlockResolver) {
    const resolve = unlockResolver;
    unlockResolver = null;
    resolve(result);
  }
}

function cancelUnlockDialog() {
  if (unlockDialog.submitting) return;
  closeUnlockDialog(false);
}

async function submitUnlockDialog() {
  unlockDialog.error = '';
  if (!unlockDialog.code) {
    unlockDialog.error = '请输入权限码';
    return;
  }
  unlockDialog.submitting = true;
  try {
    await adminApi.unlockAdminPrivilege(unlockDialog.code, auth.authorizedFetch);
    setGlobalHint('权限码验证通过，敏感操作已解锁。');
    closeUnlockDialog(true);
  } catch (error) {
    unlockDialog.error = readErrorMessage(error);
  } finally {
    unlockDialog.submitting = false;
  }
}

async function withPrivilegeRetry(action) {
  try {
    return await action();
  } catch (error) {
    if (!isPrivilegeRequiredError(error)) {
      throw error;
    }
    const unlocked = await openUnlockDialog();
    if (!unlocked) {
      throw error;
    }
    return action();
  }
}

async function reloadUsers(page = 1) {
  usersError.value = '';
  usersLoading.value = true;
  try {
    const payload = await adminApi.listAdminUsers(
      {
        page,
        pageSize: usersQuery.pageSize,
        keyword: usersQuery.keyword
      },
      auth.authorizedFetch
    );
    const itemsRaw = Array.isArray(payload?.items || payload?.Items) ? payload.items || payload.Items : [];
    usersPage.items = itemsRaw.map(toAdminUserItem);
    usersPage.page = toPositiveInt(readField(payload, 'page', 'page', page), page);
    usersPage.pageSize = toPositiveInt(readField(payload, 'pageSize', 'page_size', usersQuery.pageSize), usersQuery.pageSize);
    usersPage.total = Number(readField(payload, 'total', 'total', usersPage.items.length)) || 0;
  } catch (error) {
    usersError.value = readErrorMessage(error);
  } finally {
    usersLoading.value = false;
  }
}

function selectUser(user) {
  selectedUserId.value = user.userId;
  groupEditor.userId = String(user.userId);
  groupEditor.groupsDraft = user.groups.join('\n');
  setGlobalHint(`已选中用户 ${user.userId}`);
}

async function reloadPermissions() {
  permissionsError.value = '';
  permissionsLoading.value = true;
  try {
    const payload = await adminApi.listGroupPermissions(auth.authorizedFetch);
    groupPermissions.value = Array.isArray(payload) ? payload.map(toGroupPermissionView).filter((item) => item.groupCode) : [];
    if (!groupPermissions.value.length) {
      selectedGroupCode.value = '';
      groupPermissionsDraft.value = '';
      return;
    }
    if (!groupPermissions.value.some((item) => item.groupCode === selectedGroupCode.value)) {
      selectedGroupCode.value = groupPermissions.value[0].groupCode;
    }
    syncSelectedGroupDraft();
  } catch (error) {
    permissionsError.value = readErrorMessage(error);
  } finally {
    permissionsLoading.value = false;
  }
}

function selectPermissionGroup(groupCode) {
  selectedGroupCode.value = String(groupCode || '').toUpperCase();
  syncSelectedGroupDraft();
}

function syncSelectedGroupDraft() {
  const selected = groupPermissions.value.find((item) => item.groupCode === selectedGroupCode.value);
  groupPermissionsDraft.value = selected ? selected.permissions.join('\n') : '';
}

async function submitGroupPermissions() {
  permissionsError.value = '';
  const groupCode = String(selectedGroupCode.value || '').trim().toUpperCase();
  if (!groupCode) {
    permissionsError.value = '请先选择分组';
    return;
  }
  const permissions = normalizeCodeList(groupPermissionsDraft.value, false);
  permissionsSubmitting.value = true;
  try {
    const result = await withPrivilegeRetry(() =>
      adminApi.replaceGroupPermissions(groupCode, permissions, auth.authorizedFetch)
    );
    const normalized = toGroupPermissionView(result);
    const idx = groupPermissions.value.findIndex((item) => item.groupCode === normalized.groupCode);
    if (idx >= 0) {
      groupPermissions.value[idx] = normalized;
    } else {
      groupPermissions.value.push(normalized);
    }
    groupPermissions.value.sort((l, r) => l.groupCode.localeCompare(r.groupCode));
    selectedGroupCode.value = normalized.groupCode;
    syncSelectedGroupDraft();
    setGlobalHint(`分组 ${normalized.groupCode} 权限已保存`);
  } catch (error) {
    permissionsError.value = readErrorMessage(error);
  } finally {
    permissionsSubmitting.value = false;
  }
}

async function loadSelectedUserGroups() {
  groupError.value = '';
  const userId = toPositiveInt(groupEditor.userId, 0);
  if (!userId) {
    groupError.value = '请输入有效用户 ID';
    return;
  }
  groupLoading.value = true;
  try {
    const payload = await adminApi.getUserGroups(userId, auth.authorizedFetch);
    const normalized = toUserGroupsView(payload);
    groupEditor.userId = String(normalized.userId || userId);
    groupEditor.groupsDraft = normalized.groups.join('\n');
  } catch (error) {
    groupError.value = readErrorMessage(error);
  } finally {
    groupLoading.value = false;
  }
}

async function submitUserGroups() {
  groupError.value = '';
  const userId = toPositiveInt(groupEditor.userId, 0);
  if (!userId) {
    groupError.value = '请输入有效用户 ID';
    return;
  }
  const groups = normalizeCodeList(groupEditor.groupsDraft, true);
  groupSubmitting.value = true;
  try {
    const payload = await withPrivilegeRetry(() =>
      adminApi.replaceUserGroups(userId, groups, auth.authorizedFetch)
    );
    const normalized = toUserGroupsView(payload);
    groupEditor.userId = String(normalized.userId || userId);
    groupEditor.groupsDraft = normalized.groups.join('\n');

    const targetIndex = usersPage.items.findIndex((item) => item.userId === userId);
    if (targetIndex >= 0) {
      usersPage.items[targetIndex].groups = normalized.groups;
    }
    setGlobalHint(`用户 ${groupEditor.userId} 分组已更新`);
  } catch (error) {
    groupError.value = readErrorMessage(error);
  } finally {
    groupSubmitting.value = false;
  }
}

async function reloadQuota() {
  quotaError.value = '';
  quotaLoading.value = true;
  try {
    const payload = await adminApi.listQuotaPolicies(auth.authorizedFetch);
    quotaPolicies.value = Array.isArray(payload) ? payload.map(toQuotaView).filter((item) => item.policyId) : [];
    if (!quotaPolicies.value.length) {
      selectedPolicyId.value = '';
      syncPolicyDraftFromSelected();
      return;
    }
    if (!quotaPolicies.value.some((item) => item.policyId === selectedPolicyId.value)) {
      selectedPolicyId.value = quotaPolicies.value[0].policyId;
    }
    syncPolicyDraftFromSelected();
  } catch (error) {
    quotaError.value = readErrorMessage(error);
  } finally {
    quotaLoading.value = false;
  }
}

function selectPolicy(policyId) {
  selectedPolicyId.value = String(policyId || '');
  syncPolicyDraftFromSelected();
}

function syncPolicyDraftFromSelected() {
  const selected = quotaPolicies.value.find((item) => item.policyId === selectedPolicyId.value);
  if (!selected) {
    policyDraft.policyId = '';
    policyDraft.groupCode = '';
    policyDraft.quotaCode = '';
    policyDraft.value = '';
    return;
  }
  policyDraft.policyId = selected.policyId;
  policyDraft.groupCode = selected.groupCode;
  policyDraft.quotaCode = selected.quotaCode;
  policyDraft.value = String(selected.value);
}

function toQuotaPayloadFromDraft() {
  const value = Number.parseInt(String(policyDraft.value || ''), 10);
  return {
    policyId: String(policyDraft.policyId || '').trim(),
    groupCode: String(policyDraft.groupCode || '').trim().toUpperCase(),
    quotaCode: String(policyDraft.quotaCode || '').trim(),
    value: Number.isFinite(value) ? value : NaN
  };
}

function applyQuotaResult(raw) {
  const item = toQuotaView(raw);
  const idx = quotaPolicies.value.findIndex((target) => target.policyId === item.policyId);
  if (idx >= 0) {
    quotaPolicies.value[idx] = item;
  } else {
    quotaPolicies.value.push(item);
    quotaPolicies.value.sort((l, r) => l.policyId.localeCompare(r.policyId));
  }
  selectedPolicyId.value = item.policyId;
  syncPolicyDraftFromSelected();
}

async function submitSinglePolicy() {
  quotaError.value = '';
  const payload = toQuotaPayloadFromDraft();
  if (!payload.policyId || !payload.groupCode || !payload.quotaCode || !Number.isFinite(payload.value)) {
    quotaError.value = '策略 ID / 分组 / 配额编码 / 配额值 必填';
    return;
  }
  quotaSubmitting.value = true;
  try {
    const result = await withPrivilegeRetry(() =>
      adminApi.updateQuotaPolicy(payload.policyId, payload, auth.authorizedFetch)
    );
    applyQuotaResult(result);
    setGlobalHint(`策略 ${payload.policyId} 已保存`);
  } catch (error) {
    quotaError.value = readErrorMessage(error);
  } finally {
    quotaSubmitting.value = false;
  }
}

async function submitBatchPolicies() {
  quotaError.value = '';
  if (!quotaPolicies.value.length) {
    quotaError.value = '当前没有可提交的策略';
    return;
  }
  const payloadItems = quotaPolicies.value.map((item) => ({
    policyId: String(item.policyId || '').trim(),
    groupCode: String(item.groupCode || '').trim().toUpperCase(),
    quotaCode: String(item.quotaCode || '').trim(),
    value: Number(item.value)
  }));
  const hasInvalid = payloadItems.some(
    (item) => !item.policyId || !item.groupCode || !item.quotaCode || !Number.isFinite(item.value)
  );
  if (hasInvalid) {
    quotaError.value = '检测到非法策略数据，请先修复后再提交';
    return;
  }
  quotaSubmitting.value = true;
  try {
    const result = await withPrivilegeRetry(() =>
      adminApi.batchUpsertQuotaPolicies(payloadItems, auth.authorizedFetch)
    );
    const normalizedList = Array.isArray(result) ? result.map(toQuotaView) : [];
    if (normalizedList.length) {
      quotaPolicies.value = normalizedList;
      if (!selectedPolicyId.value && normalizedList[0]) {
        selectedPolicyId.value = normalizedList[0].policyId;
      }
      syncPolicyDraftFromSelected();
    }
    setGlobalHint('配额策略批量提交成功');
  } catch (error) {
    quotaError.value = readErrorMessage(error);
  } finally {
    quotaSubmitting.value = false;
  }
}

watch(
  () => route.query.tab,
  (nextTab) => {
    const raw = typeof nextTab === 'string' ? nextTab : '';
    const normalized = normalizeTab(raw);
    if (raw === normalized) return;
    router.replace({ path: '/admin', query: { tab: normalized } });
  },
  { immediate: true }
);

onMounted(async () => {
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) {
    router.replace({
      path: '/auth',
      query: {
        redirect: '/admin'
      }
    });
    return;
  }
  if (!isAdminUser.value) {
    router.replace({
      path: '/profile',
      query: {
        reason: 'admin_only'
      }
    });
    return;
  }

  await Promise.all([reloadUsers(1), reloadPermissions(), reloadQuota()]);
  booting.value = false;
});

onBeforeUnmount(() => {
  if (unlockResolver) {
    const resolve = unlockResolver;
    unlockResolver = null;
    resolve(false);
  }
});
</script>

<style scoped>
.admin-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
  display: grid;
  grid-template-rows: auto 1fr;
  gap: 12px;
}

.page-header {
  padding: 8px 4px 4px;
}

.eyebrow {
  font-size: 12px;
  letter-spacing: 0.16em;
  text-transform: uppercase;
  color: rgba(var(--accent-soft-rgb), 0.95);
}

h1 {
  margin-top: 4px;
  font-size: clamp(24px, 3.6vw, 36px);
}

.page-header p {
  margin-top: 10px;
  max-width: 760px;
  color: rgba(223, 230, 249, 0.86);
}

.dashboard-layout {
  min-height: 0;
  display: grid;
  grid-template-columns: 220px minmax(0, 1fr);
  gap: 12px;
}

.sidebar {
  --liquid-bg: rgba(20, 27, 42, 0.36);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 14px;
  padding: 10px;
  display: grid;
  gap: 8px;
  align-content: start;
}

.side-item {
  border: 0;
  border-radius: 10px;
  min-height: 36px;
  padding: 0 12px;
  text-align: left;
  background: rgba(255, 255, 255, 0.2);
  color: rgba(233, 241, 255, 0.92);
}

.side-item.active {
  background: rgba(var(--accent-rgb), 0.26);
  color: rgb(var(--accent-strong-rgb));
  box-shadow: inset 0 0 0 1px rgba(var(--accent-rgb), 0.58);
}

.content-panel {
  --liquid-bg: rgba(20, 27, 42, 0.32);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.2);
  border-radius: 14px;
  padding: 14px 16px;
  overflow: auto;
}

.content-block {
  display: grid;
  gap: 10px;
}

.content-block h2 {
  font-size: 20px;
}

.helper-text {
  color: rgba(223, 230, 249, 0.88);
}

.table-wrap {
  border-radius: 12px;
  overflow: auto;
  box-shadow: inset 0 0 0 1px rgba(175, 198, 228, 0.18);
}

.admin-table {
  width: 100%;
  border-collapse: collapse;
  min-width: 720px;
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
  transition: background-color 0.18s ease;
}

.admin-table tbody tr:hover {
  background: rgba(255, 255, 255, 0.06);
}

.admin-table tbody tr.active {
  background: rgba(var(--accent-rgb), 0.18);
}

.field-label {
  font-size: 12px;
  color: rgba(218, 229, 247, 0.88);
}

.field-input,
.field-textarea {
  border: 0;
  border-radius: 10px;
  min-height: 38px;
  padding: 0 12px;
  background: rgba(8, 14, 24, 0.56);
  color: rgba(237, 245, 255, 0.96);
  box-shadow: inset 0 0 0 1px rgba(165, 186, 223, 0.22);
}

.field-textarea {
  min-height: 120px;
  padding: 10px 12px;
  resize: vertical;
}

.inline-actions {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
  align-items: center;
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

.primary-btn:disabled,
.ghost-btn:disabled {
  opacity: 0.56;
  cursor: not-allowed;
}

.pager {
  display: flex;
  gap: 8px;
  align-items: center;
  flex-wrap: wrap;
  color: rgba(216, 232, 250, 0.92);
}

.state-tip {
  color: rgba(204, 223, 252, 0.92);
}

.error-text {
  color: rgba(255, 188, 206, 0.96);
}

.quota-editor {
  display: grid;
  gap: 8px;
}

.dialog-mask {
  position: fixed;
  inset: 0;
  z-index: 1200;
  display: grid;
  place-items: center;
  background: rgba(6, 10, 20, 0.44);
  backdrop-filter: blur(4px);
  padding: 12px;
}

.dialog-shell {
  --liquid-bg: rgba(18, 24, 36, 0.72);
  --liquid-border: rgba(255, 255, 255, 0.24);
  --liquid-shadow: 0 22px 48px rgba(0, 0, 0, 0.35);
  width: min(480px, 100%);
  border-radius: 14px;
  padding: 16px;
  display: grid;
  gap: 10px;
}

.dialog-shell h3 {
  font-size: 20px;
}

.dialog-shell p {
  color: rgba(223, 230, 249, 0.88);
}

.dialog-fade-enter-active,
.dialog-fade-leave-active {
  transition: opacity 0.2s ease;
}

.dialog-fade-enter-from,
.dialog-fade-leave-to {
  opacity: 0;
}

@media (max-width: 980px) {
  .dashboard-layout {
    grid-template-columns: 1fr;
  }

  .sidebar {
    grid-template-columns: repeat(4, minmax(0, 1fr));
  }

  .side-item {
    min-height: 34px;
    padding: 0 8px;
    text-align: center;
    font-size: 12px;
  }
}
</style>
