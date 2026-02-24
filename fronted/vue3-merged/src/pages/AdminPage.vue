<template>
  <section class="route-page admin-page">
    <header class="page-header">
      <p class="eyebrow">Admin Console</p>
      <h1>管理后台</h1>
      <p>以表格和选择器为主完成用户、分组、权限、配额配置，减少手工输入。</p>
      <p v-if="globalHint" class="state-tip">{{ globalHint }}</p>
    </header>

    <div v-if="booting" class="state-tip">正在加载管理数据...</div>

    <template v-else>
      <section class="kpi-grid">
        <article class="kpi-card liquid-material">
          <span>用户总量</span>
          <strong>{{ usersPage.total }}</strong>
        </article>
        <article class="kpi-card liquid-material">
          <span>分组数量</span>
          <strong>{{ groupOptions.length }}</strong>
        </article>
        <article class="kpi-card liquid-material">
          <span>权限目录</span>
          <strong>{{ permissionCatalog.length }}</strong>
        </article>
        <article class="kpi-card liquid-material">
          <span>配额项</span>
          <strong>{{ quotaMatrixCodes.length }}</strong>
        </article>
      </section>

      <div class="dashboard-layout">
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
          <AdminUsersPanel
            v-if="activeTab === AdminTabKey.USERS"
            v-model:queryKeyword="usersQuery.keyword"
            :loading="usersLoading"
            :saving="usersSaving"
            :error="usersError"
            :usersPage="usersPage"
            :totalPages="usersTotalPages"
            :selectedUserId="selectedUserId"
            :selectedUser="selectedUser"
            :selectedUserGroups="selectedUserGroups"
            :groupOptions="groupOptions"
            @search="reloadUsers"
            @selectUser="selectUser"
            @toggleUserGroup="toggleSelectedUserGroup"
            @saveUserGroups="saveSelectedUserGroups"
          />

          <AdminGroupsPanel
            v-else-if="activeTab === AdminTabKey.GROUPS"
            v-model:queryKeyword="groupsQuery.keyword"
            v-model:queryStatus="groupsQuery.status"
            :loading="groupsLoading"
            :submitting="groupsSubmitting"
            :error="groupsError"
            :groupsPage="groupsPage"
            :totalPages="groupsTotalPages"
            :selectedGroupCode="selectedCatalogGroupCode"
            :selectedGroup="selectedCatalogGroup"
            @search="reloadGroups"
            @selectGroup="selectCatalogGroup"
            @createGroup="createGroup"
            @updateGroup="updateGroup"
            @requestDelete="openDeleteGroupDialog"
          />

          <AdminPermissionsPanel
            v-else-if="activeTab === AdminTabKey.PERMISSIONS"
            :loading="permissionsLoading"
            :saving="permissionsSaving"
            :error="permissionsError"
            :groupOptions="groupOptions"
            :permissionsByGroup="permissionsByGroup"
            :selectedGroupCode="selectedPermissionGroupCode"
            :selectedPermissions="selectedPermissionCodes"
            :permissionCatalog="permissionCatalog"
            :advanced="uiState.permissionsAdvanced"
            :customPermission="customPermissionCode"
            @selectGroup="selectPermissionGroup"
            @togglePermission="togglePermissionSelection"
            @save="saveGroupPermissions"
            @update:advanced="(value) => (uiState.permissionsAdvanced = value)"
            @update:customPermission="setCustomPermissionCode"
            @appendCustomPermission="appendCustomPermission"
          />

          <AdminQuotaPanel
            v-else
            :loading="quotaLoading"
            :rows="quotaMatrixRows"
            :quotaCodes="quotaMatrixCodes"
            :quotaCatalog="quotaCatalog"
            :selectedGroupCode="selectedQuotaGroupCode"
            :saving="quotaSaving"
            :error="quotaError"
            :advanced="uiState.quotaAdvanced"
            :customQuotaCode="customQuotaCode"
            @selectGroup="selectQuotaGroup"
            @updateCell="updateQuotaCell"
            @saveSelected="saveSelectedQuotaGroup"
            @saveAll="saveAllQuotaGroups"
            @addCatalogQuota="addCatalogQuota"
            @update:advanced="(value) => (uiState.quotaAdvanced = value)"
            @update:customQuotaCode="setCustomQuotaCode"
            @appendCustomQuota="appendCustomQuota"
          />
        </section>
      </div>
    </template>

    <transition name="dialog-fade">
      <div v-if="unlockDialog.visible" class="dialog-mask" @click.self="cancelUnlockDialog">
        <section class="dialog-shell liquid-material" @click.stop>
          <h3>管理员权限码验证</h3>
          <p>当前写操作需要先验证管理员权限码，验证成功后自动重试。</p>
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
            <button class="ghost-btn ripple-trigger" type="button" :disabled="unlockDialog.submitting" @click="cancelUnlockDialog">取消</button>
            <button class="primary-btn ripple-trigger" type="button" :disabled="unlockDialog.submitting" @click="submitUnlockDialog">
              {{ unlockDialog.submitting ? '验证中...' : '确认验证' }}
            </button>
          </div>
        </section>
      </div>
    </transition>

    <AdminDangerDeleteDialog
      :visible="dangerDelete.visible"
      :groupCode="dangerDelete.groupCode"
      :groupName="dangerDelete.groupName"
      :privilegeCode="dangerDelete.privilegeCode"
      :confirmText="dangerDelete.confirmText"
      :submitting="dangerDelete.submitting"
      :error="dangerDelete.error"
      @close="closeDeleteGroupDialog"
      @confirm="confirmDeleteGroup"
      @update:privilegeCode="(value) => (dangerDelete.privilegeCode = value)"
      @update:confirmText="(value) => (dangerDelete.confirmText = value)"
    />
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useRoute, useRouter } from 'vue-router';
import { useAuthSession } from '../composables/useAuthSession';
import * as adminApi from '../services/adminApi';
import AdminDangerDeleteDialog from '../components/admin/AdminDangerDeleteDialog.vue';
import AdminGroupsPanel from '../components/admin/AdminGroupsPanel.vue';
import AdminPermissionsPanel from '../components/admin/AdminPermissionsPanel.vue';
import AdminQuotaPanel from '../components/admin/AdminQuotaPanel.vue';
import AdminUsersPanel from '../components/admin/AdminUsersPanel.vue';
import {
  AdminTabKey,
  buildQuotaMatrix,
  buildQuotaPayloadForGroup,
  createAdminUiState,
  mergeCatalogCodes,
  normalizeCodeList,
  toggleCodeSelection,
  upsertQuotaCell
} from './adminUiState';

const route = useRoute();
const router = useRouter();
const auth = useAuthSession();

const tabs = [
  { key: AdminTabKey.USERS, label: '用户管理' },
  { key: AdminTabKey.GROUPS, label: '分组目录' },
  { key: AdminTabKey.PERMISSIONS, label: '分组权限' },
  { key: AdminTabKey.QUOTA, label: '配额策略' }
];

const booting = ref(true);
const globalHint = ref('');

const groupOptions = ref([]);
const permissionCatalog = ref([]);
const quotaCatalog = ref([]);

const usersLoading = ref(false);
const usersSaving = ref(false);
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
const selectedUserGroups = ref([]);

const groupsLoading = ref(false);
const groupsSubmitting = ref(false);
const groupsError = ref('');
const groupsQuery = reactive({
  keyword: '',
  status: '',
  pageSize: 20
});
const groupsPage = reactive({
  page: 1,
  pageSize: 20,
  total: 0,
  items: []
});
const selectedCatalogGroupCode = ref('');

const permissionsLoading = ref(false);
const permissionsSaving = ref(false);
const permissionsError = ref('');
const permissionsByGroup = ref({});
const selectedPermissionGroupCode = ref('');
const selectedPermissionCodes = ref([]);
const customPermissionCode = ref('');

const quotaLoading = ref(false);
const quotaSaving = ref(false);
const quotaError = ref('');
const quotaMatrixRows = ref([]);
const quotaMatrixCodes = ref([]);
const selectedQuotaGroupCode = ref('');
const customQuotaCode = ref('');

const uiState = reactive(createAdminUiState());

const dangerDelete = reactive({
  visible: false,
  groupCode: '',
  groupName: '',
  privilegeCode: '',
  confirmText: '',
  submitting: false,
  error: ''
});

const unlockDialog = reactive({
  visible: false,
  code: '',
  error: '',
  submitting: false
});
let unlockResolver = null;

const activeTab = computed(() => {
  const raw = typeof route.query.tab === 'string' ? route.query.tab : '';
  return normalizeTab(raw);
});

const isAdminUser = computed(() => {
  const groups = Array.isArray(auth.user.value?.groups) ? auth.user.value.groups : [];
  return groups.some((item) => String(item || '').toUpperCase() === 'ADMIN');
});

const usersTotalPages = computed(() => {
  if (!usersPage.total || !usersPage.pageSize) return 1;
  return Math.max(1, Math.ceil(usersPage.total / usersPage.pageSize));
});

const groupsTotalPages = computed(() => {
  if (!groupsPage.total || !groupsPage.pageSize) return 1;
  return Math.max(1, Math.ceil(groupsPage.total / groupsPage.pageSize));
});

const selectedUser = computed(() => usersPage.items.find((item) => item.userId === selectedUserId.value) || null);

const selectedCatalogGroup = computed(() => {
  return groupsPage.items.find((item) => item.groupCode === selectedCatalogGroupCode.value) || null;
});

function normalizeTab(raw) {
  const normalized = String(raw || '');
  return tabs.some((item) => item.key === normalized) ? normalized : AdminTabKey.USERS;
}

function setGlobalHint(message) {
  globalHint.value = String(message || '').trim();
}

function setCustomPermissionCode(value) {
  customPermissionCode.value = String(value || '');
}

function setCustomQuotaCode(value) {
  customQuotaCode.value = String(value || '');
}

function openTab(tabKey) {
  const normalized = normalizeTab(tabKey);
  if (activeTab.value === normalized) return;
  router.replace({
    path: '/admin',
    query: {
      ...route.query,
      tab: normalized
    }
  });
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
  const detail = String(error?.detail || error?.message || '').toLowerCase();
  return detail.includes('admin privilege verification required');
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
    createdAt: String(readField(raw, 'createdAt', 'created_at', '') || ''),
    updatedAt: String(readField(raw, 'updatedAt', 'updated_at', '') || '')
  };
}

function toGroupOption(raw) {
  return {
    groupCode: String(readField(raw, 'groupCode', 'group_code', '') || '').toUpperCase(),
    displayName: String(readField(raw, 'displayName', 'display_name', '') || ''),
    status: String(readField(raw, 'status', 'status', 'ACTIVE') || '').toUpperCase(),
    builtIn: Number(readField(raw, 'builtIn', 'built_in', 0)) > 0 ? 1 : 0
  };
}

function toGroupCatalogItem(raw) {
  return {
    groupCode: String(readField(raw, 'groupCode', 'group_code', '') || '').toUpperCase(),
    displayName: String(readField(raw, 'displayName', 'display_name', '') || ''),
    description: String(readField(raw, 'description', 'description', '') || ''),
    status: String(readField(raw, 'status', 'status', 'ACTIVE') || '').toUpperCase(),
    builtIn: Number(readField(raw, 'builtIn', 'built_in', 0)) > 0 ? 1 : 0,
    userCount: Number(readField(raw, 'userCount', 'user_count', 0)) || 0,
    permissionCount: Number(readField(raw, 'permissionCount', 'permission_count', 0)) || 0,
    quotaCount: Number(readField(raw, 'quotaCount', 'quota_count', 0)) || 0
  };
}

function toGroupPermissionView(raw) {
  return {
    groupCode: String(readField(raw, 'groupCode', 'group_code', '') || '').toUpperCase(),
    permissions: normalizeCodeList(readField(raw, 'permissions', 'permissions', []), false)
  };
}

function toQuotaPolicyView(raw) {
  return {
    policyId: String(readField(raw, 'policyId', 'policy_id', '') || ''),
    groupCode: String(readField(raw, 'groupCode', 'group_code', '') || '').toUpperCase(),
    quotaCode: String(readField(raw, 'quotaCode', 'quota_code', '') || '').trim(),
    value: Number(readField(raw, 'value', 'value', 0)) || 0
  };
}

function syncSelectedPermissionCodes() {
  const groupCode = String(selectedPermissionGroupCode.value || '').toUpperCase();
  if (!groupCode) {
    selectedPermissionCodes.value = [];
    return;
  }
  const selected = permissionsByGroup.value[groupCode] || [];
  selectedPermissionCodes.value = normalizeCodeList(selected, false);
}

function ensureSelectedPermissionGroup() {
  const groupCodes = groupOptions.value.map((item) => item.groupCode).filter(Boolean);
  if (!groupCodes.length) {
    selectedPermissionGroupCode.value = '';
    selectedPermissionCodes.value = [];
    return;
  }
  if (!groupCodes.includes(selectedPermissionGroupCode.value)) {
    selectedPermissionGroupCode.value = groupCodes[0];
  }
  syncSelectedPermissionCodes();
}

function ensureSelectedQuotaGroup() {
  const groupCodes = quotaMatrixRows.value.map((item) => item.groupCode).filter(Boolean);
  if (!groupCodes.length) {
    selectedQuotaGroupCode.value = '';
    return;
  }
  if (!groupCodes.includes(selectedQuotaGroupCode.value)) {
    selectedQuotaGroupCode.value = groupCodes[0];
  }
}

async function reloadOptions() {
  try {
    const payload = await adminApi.getAdminOptions(auth.authorizedFetch);
    const groupsRaw = Array.isArray(readField(payload, 'groups', 'groups', [])) ? readField(payload, 'groups', 'groups', []) : [];
    const permissionsRaw = Array.isArray(readField(payload, 'permissionCatalog', 'permission_catalog', []))
      ? readField(payload, 'permissionCatalog', 'permission_catalog', [])
      : [];
    const quotaRaw = Array.isArray(readField(payload, 'quotaCatalog', 'quota_catalog', []))
      ? readField(payload, 'quotaCatalog', 'quota_catalog', [])
      : [];

    groupOptions.value = groupsRaw.map(toGroupOption).filter((item) => item.groupCode);
    permissionCatalog.value = normalizeCodeList(permissionsRaw, false);
    quotaCatalog.value = normalizeCodeList(quotaRaw, false);
    ensureSelectedPermissionGroup();
  } catch (error) {
    const message = readErrorMessage(error);
    permissionsError.value = permissionsError.value || message;
    quotaError.value = quotaError.value || message;
    groupsError.value = groupsError.value || message;
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
    const itemsRaw = Array.isArray(readField(payload, 'items', 'items', [])) ? readField(payload, 'items', 'items', []) : [];
    usersPage.items = itemsRaw.map(toAdminUserItem);
    usersPage.page = toPositiveInt(readField(payload, 'page', 'page', page), page);
    usersPage.pageSize = toPositiveInt(readField(payload, 'pageSize', 'page_size', usersQuery.pageSize), usersQuery.pageSize);
    usersPage.total = Number(readField(payload, 'total', 'total', usersPage.items.length)) || 0;

    if (!usersPage.items.some((item) => item.userId === selectedUserId.value)) {
      selectedUserId.value = 0;
      selectedUserGroups.value = [];
    }
  } catch (error) {
    usersError.value = readErrorMessage(error);
  } finally {
    usersLoading.value = false;
  }
}

function selectUser(user) {
  selectedUserId.value = Number(user?.userId || 0);
  selectedUserGroups.value = normalizeCodeList(user?.groups || [], true);
  setGlobalHint(`已选中用户 #${selectedUserId.value}`);
}

function toggleSelectedUserGroup(groupCode) {
  selectedUserGroups.value = toggleCodeSelection(selectedUserGroups.value, groupCode, true);
}

async function saveSelectedUserGroups() {
  usersError.value = '';
  if (!selectedUserId.value) {
    usersError.value = '请先选择用户';
    return;
  }
  usersSaving.value = true;
  try {
    const response = await withPrivilegeRetry(() =>
      adminApi.replaceUserGroups(selectedUserId.value, selectedUserGroups.value, auth.authorizedFetch)
    );
    const groups = normalizeCodeList(readField(response, 'groups', 'groups', []), true);
    selectedUserGroups.value = groups;
    const index = usersPage.items.findIndex((item) => item.userId === selectedUserId.value);
    if (index >= 0) {
      usersPage.items[index].groups = groups;
    }
    setGlobalHint(`用户 #${selectedUserId.value} 分组已更新`);
  } catch (error) {
    usersError.value = readErrorMessage(error);
  } finally {
    usersSaving.value = false;
  }
}

async function reloadGroups(page = 1) {
  groupsError.value = '';
  groupsLoading.value = true;
  try {
    const payload = await adminApi.listAdminGroups(
      {
        page,
        pageSize: groupsQuery.pageSize,
        keyword: groupsQuery.keyword,
        status: groupsQuery.status
      },
      auth.authorizedFetch
    );
    const itemsRaw = Array.isArray(readField(payload, 'items', 'items', [])) ? readField(payload, 'items', 'items', []) : [];
    groupsPage.items = itemsRaw.map(toGroupCatalogItem).filter((item) => item.groupCode);
    groupsPage.page = toPositiveInt(readField(payload, 'page', 'page', page), page);
    groupsPage.pageSize = toPositiveInt(readField(payload, 'pageSize', 'page_size', groupsQuery.pageSize), groupsQuery.pageSize);
    groupsPage.total = Number(readField(payload, 'total', 'total', groupsPage.items.length)) || 0;

    if (!groupsPage.items.some((item) => item.groupCode === selectedCatalogGroupCode.value)) {
      selectedCatalogGroupCode.value = groupsPage.items[0]?.groupCode || '';
    }
  } catch (error) {
    groupsError.value = readErrorMessage(error);
  } finally {
    groupsLoading.value = false;
  }
}

function selectCatalogGroup(group) {
  selectedCatalogGroupCode.value = String(group?.groupCode || '').toUpperCase();
}

async function refreshGroupRelatedData(page = 1) {
  await reloadOptions();
  await Promise.all([reloadGroups(page), reloadPermissions(), reloadQuota()]);
}

async function createGroup(payload) {
  groupsError.value = '';
  const displayName = String(payload?.displayName || '').trim();
  const description = String(payload?.description || '').trim();
  if (!displayName) {
    groupsError.value = '组名不能为空';
    return;
  }

  groupsSubmitting.value = true;
  try {
    const created = await withPrivilegeRetry(() =>
      adminApi.createAdminGroup(
        {
          displayName,
          description: description || undefined
        },
        auth.authorizedFetch
      )
    );
    const groupCode = String(readField(created, 'groupCode', 'group_code', '') || '').toUpperCase();
    setGlobalHint(`分组 ${groupCode || displayName} 创建成功`);
    await refreshGroupRelatedData(1);
    if (groupCode) {
      selectedCatalogGroupCode.value = groupCode;
      selectedPermissionGroupCode.value = groupCode;
      selectedQuotaGroupCode.value = groupCode;
      syncSelectedPermissionCodes();
      ensureSelectedQuotaGroup();
    }
  } catch (error) {
    groupsError.value = readErrorMessage(error);
  } finally {
    groupsSubmitting.value = false;
  }
}

async function updateGroup(payload) {
  groupsError.value = '';
  const groupCode = String(payload?.groupCode || '').trim().toUpperCase();
  if (!groupCode) {
    groupsError.value = '分组编码不能为空';
    return;
  }

  groupsSubmitting.value = true;
  try {
    await withPrivilegeRetry(() =>
      adminApi.updateAdminGroup(
        groupCode,
        {
          displayName: String(payload?.displayName || '').trim() || undefined,
          description: String(payload?.description || '').trim() || undefined,
          status: String(payload?.status || '').trim() || undefined
        },
        auth.authorizedFetch
      )
    );
    setGlobalHint(`分组 ${groupCode} 更新成功`);
    await refreshGroupRelatedData(groupsPage.page || 1);
    selectedCatalogGroupCode.value = groupCode;
    ensureSelectedPermissionGroup();
    ensureSelectedQuotaGroup();
  } catch (error) {
    groupsError.value = readErrorMessage(error);
  } finally {
    groupsSubmitting.value = false;
  }
}

function openDeleteGroupDialog(group) {
  dangerDelete.visible = true;
  dangerDelete.groupCode = String(group?.groupCode || '').toUpperCase();
  dangerDelete.groupName = String(group?.displayName || group?.groupCode || '');
  dangerDelete.privilegeCode = '';
  dangerDelete.confirmText = '';
  dangerDelete.error = '';
  dangerDelete.submitting = false;
}

function closeDeleteGroupDialog() {
  if (dangerDelete.submitting) return;
  dangerDelete.visible = false;
  dangerDelete.groupCode = '';
  dangerDelete.groupName = '';
  dangerDelete.privilegeCode = '';
  dangerDelete.confirmText = '';
  dangerDelete.error = '';
}

async function confirmDeleteGroup() {
  dangerDelete.error = '';
  if (dangerDelete.confirmText !== 'DELETE') {
    dangerDelete.error = '请输入 DELETE 以确认删除';
    return;
  }
  if (!String(dangerDelete.privilegeCode || '').trim()) {
    dangerDelete.error = '请输入管理员秘钥';
    return;
  }

  dangerDelete.submitting = true;
  try {
    await adminApi.deleteAdminGroup(dangerDelete.groupCode, dangerDelete.privilegeCode, auth.authorizedFetch);
    const deletedCode = dangerDelete.groupCode;
    closeDeleteGroupDialog();
    setGlobalHint(`分组 ${deletedCode} 已删除并完成级联清理`);
    await Promise.all([reloadUsers(1), refreshGroupRelatedData(1)]);
  } catch (error) {
    dangerDelete.error = readErrorMessage(error);
  } finally {
    dangerDelete.submitting = false;
  }
}

async function reloadPermissions() {
  permissionsError.value = '';
  permissionsLoading.value = true;
  try {
    const payload = await adminApi.listGroupPermissions(auth.authorizedFetch);
    const rows = Array.isArray(payload) ? payload.map(toGroupPermissionView).filter((item) => item.groupCode) : [];
    const map = {};
    groupOptions.value.forEach((group) => {
      map[group.groupCode] = [];
    });
    rows.forEach((item) => {
      map[item.groupCode] = item.permissions;
    });
    permissionsByGroup.value = map;

    const discoveredPermissions = rows.flatMap((item) => item.permissions || []);
    permissionCatalog.value = mergeCatalogCodes(permissionCatalog.value, discoveredPermissions, false);
    ensureSelectedPermissionGroup();
  } catch (error) {
    permissionsError.value = readErrorMessage(error);
  } finally {
    permissionsLoading.value = false;
  }
}

function selectPermissionGroup(groupCode) {
  selectedPermissionGroupCode.value = String(groupCode || '').trim().toUpperCase();
  syncSelectedPermissionCodes();
}

function togglePermissionSelection(permissionCode) {
  selectedPermissionCodes.value = toggleCodeSelection(selectedPermissionCodes.value, permissionCode, false);
}

function appendCustomPermission() {
  const normalized = String(customPermissionCode.value || '').trim();
  if (!normalized) {
    permissionsError.value = '请输入自定义权限码';
    return;
  }
  selectedPermissionCodes.value = mergeCatalogCodes(selectedPermissionCodes.value, [normalized], false);
  permissionCatalog.value = mergeCatalogCodes(permissionCatalog.value, [normalized], false);
  customPermissionCode.value = '';
}

async function saveGroupPermissions() {
  permissionsError.value = '';
  const groupCode = String(selectedPermissionGroupCode.value || '').trim().toUpperCase();
  if (!groupCode) {
    permissionsError.value = '请先选择分组';
    return;
  }

  permissionsSaving.value = true;
  try {
    const response = await withPrivilegeRetry(() =>
      adminApi.replaceGroupPermissions(groupCode, selectedPermissionCodes.value, auth.authorizedFetch)
    );
    const normalized = toGroupPermissionView(response);
    permissionsByGroup.value = {
      ...permissionsByGroup.value,
      [normalized.groupCode]: normalized.permissions
    };
    selectedPermissionGroupCode.value = normalized.groupCode;
    selectedPermissionCodes.value = normalized.permissions;
    permissionCatalog.value = mergeCatalogCodes(permissionCatalog.value, normalized.permissions, false);
    setGlobalHint(`分组 ${normalized.groupCode} 权限已保存`);
  } catch (error) {
    permissionsError.value = readErrorMessage(error);
  } finally {
    permissionsSaving.value = false;
  }
}

async function reloadQuota() {
  quotaError.value = '';
  quotaLoading.value = true;
  try {
    const payload = await adminApi.listQuotaPolicies(auth.authorizedFetch);
    const policies = Array.isArray(payload) ? payload.map(toQuotaPolicyView).filter((item) => item.groupCode && item.quotaCode) : [];
    const discoveredQuotaCodes = policies.map((item) => item.quotaCode);
    const mergedQuotaCatalog = mergeCatalogCodes(mergeCatalogCodes(quotaCatalog.value, quotaMatrixCodes.value, false), discoveredQuotaCodes, false);
    quotaCatalog.value = mergedQuotaCatalog;

    const matrix = buildQuotaMatrix(groupOptions.value, mergedQuotaCatalog, policies);
    quotaMatrixRows.value = matrix.rows;
    quotaMatrixCodes.value = matrix.quotaCodes;
    ensureSelectedQuotaGroup();
  } catch (error) {
    quotaError.value = readErrorMessage(error);
  } finally {
    quotaLoading.value = false;
  }
}

function selectQuotaGroup(groupCode) {
  selectedQuotaGroupCode.value = String(groupCode || '').trim().toUpperCase();
}

function updateQuotaCell(payload) {
  const groupCode = String(payload?.groupCode || '').trim().toUpperCase();
  const quotaCode = String(payload?.quotaCode || '').trim();
  if (!groupCode || !quotaCode) return;
  quotaMatrixRows.value = upsertQuotaCell(quotaMatrixRows.value, groupCode, quotaCode, payload?.value);
}

function addCatalogQuota(quotaCode) {
  const normalized = String(quotaCode || '').trim().toLowerCase();
  if (!normalized) return;
  quotaMatrixCodes.value = mergeCatalogCodes(quotaMatrixCodes.value, [normalized], false);
  quotaCatalog.value = mergeCatalogCodes(quotaCatalog.value, [normalized], false);
  quotaMatrixRows.value = quotaMatrixRows.value.map((row) => ({
    ...row,
    values: {
      ...row.values,
      [normalized]: Number.isFinite(Number(row.values?.[normalized])) ? Number(row.values[normalized]) : 0
    },
    policyIds: {
      ...row.policyIds
    }
  }));
}

function appendCustomQuota() {
  const normalized = String(customQuotaCode.value || '').trim().toLowerCase();
  if (!normalized) {
    quotaError.value = '请输入自定义配额编码';
    return;
  }
  addCatalogQuota(normalized);
  customQuotaCode.value = '';
}

async function saveSelectedQuotaGroup() {
  quotaError.value = '';
  const groupCode = String(selectedQuotaGroupCode.value || '').trim().toUpperCase();
  if (!groupCode) {
    quotaError.value = '请先选择分组';
    return;
  }

  const row = quotaMatrixRows.value.find((item) => item.groupCode === groupCode);
  if (!row) {
    quotaError.value = '未找到分组配额行';
    return;
  }

  const payload = buildQuotaPayloadForGroup(row, quotaMatrixCodes.value);
  if (!payload.length) {
    quotaError.value = '没有可提交的配额项';
    return;
  }

  quotaSaving.value = true;
  try {
    await withPrivilegeRetry(() => adminApi.batchUpsertQuotaPolicies(payload, auth.authorizedFetch));
    await reloadQuota();
    setGlobalHint(`分组 ${groupCode} 配额已保存`);
  } catch (error) {
    quotaError.value = readErrorMessage(error);
  } finally {
    quotaSaving.value = false;
  }
}

async function saveAllQuotaGroups() {
  quotaError.value = '';
  if (!quotaMatrixRows.value.length) {
    quotaError.value = '暂无配额数据';
    return;
  }

  const payload = quotaMatrixRows.value.flatMap((row) => buildQuotaPayloadForGroup(row, quotaMatrixCodes.value));
  if (!payload.length) {
    quotaError.value = '没有可提交的配额项';
    return;
  }

  quotaSaving.value = true;
  try {
    await withPrivilegeRetry(() => adminApi.batchUpsertQuotaPolicies(payload, auth.authorizedFetch));
    await reloadQuota();
    setGlobalHint('全部分组配额已批量保存');
  } catch (error) {
    quotaError.value = readErrorMessage(error);
  } finally {
    quotaSaving.value = false;
  }
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
    const resolver = unlockResolver;
    unlockResolver = null;
    resolver(result);
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

watch(
  () => route.query.tab,
  (nextTab) => {
    const raw = typeof nextTab === 'string' ? nextTab : '';
    const normalized = normalizeTab(raw);
    if (raw === normalized) return;
    router.replace({
      path: '/admin',
      query: {
        ...route.query,
        tab: normalized
      }
    });
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

  try {
    await reloadOptions();
    await Promise.all([reloadUsers(1), reloadGroups(1), reloadPermissions(), reloadQuota()]);
  } finally {
    booting.value = false;
  }
});

onBeforeUnmount(() => {
  if (unlockResolver) {
    const resolver = unlockResolver;
    unlockResolver = null;
    resolver(false);
  }
});
</script>

<style scoped>
.admin-page {
  min-height: 100%;
  color: rgba(239, 244, 255, 0.96);
  display: grid;
  grid-template-rows: auto auto 1fr;
  gap: 12px;
}

.page-header {
  padding: 8px 4px 0;
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

.kpi-grid {
  display: grid;
  gap: 10px;
  grid-template-columns: repeat(4, minmax(0, 1fr));
  animation: fade-in-up 0.25s ease;
}

.kpi-card {
  --liquid-bg: rgba(20, 27, 42, 0.36);
  --liquid-border: rgba(255, 255, 255, 0.2);
  --liquid-shadow: 0 14px 30px rgba(6, 10, 18, 0.22);
  border-radius: 14px;
  padding: 12px;
  display: grid;
  gap: 6px;
}

.kpi-card span {
  color: rgba(201, 219, 243, 0.9);
  font-size: 12px;
}

.kpi-card strong {
  font-size: 22px;
  color: rgba(236, 245, 255, 0.96);
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
  min-height: 38px;
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
  animation: fade-in-up 0.25s ease;
}

.state-tip {
  color: rgba(204, 223, 252, 0.92);
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

.inline-actions {
  display: flex;
  gap: 8px;
  flex-wrap: wrap;
  align-items: center;
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

@keyframes fade-in-up {
  from {
    opacity: 0;
    transform: translateY(8px);
  }

  to {
    opacity: 1;
    transform: translateY(0);
  }
}

@media (max-width: 1080px) {
  .kpi-grid {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

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

@media (max-width: 640px) {
  .kpi-grid {
    grid-template-columns: 1fr;
  }
}
</style>
