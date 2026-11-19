<template>
  <section class="mcp-pane" aria-label="MCP Token 管理">
    <p class="mcp-note">一个账号使用一个 MCP Token，仅可访问下方授权的 MCP 模块，不等同于网站登录权限。目前可授权 Todo 研发功能。</p>
    <p v-if="loading" role="status">正在读取 MCP Token 状态…</p>
    <p v-if="error" role="alert">{{ error }}</p>
    <button v-if="error" class="mcp-btn" type="button" :disabled="busy || loading" @click="reload">刷新状态</button>

    <template v-if="status && !loading">
      <dl class="mcp-status">
        <div><dt>凭据状态</dt><dd>{{ status.active ? '已启用' : '无有效 Token' }}</dd></div>
        <div><dt>已授权模块</dt><dd>{{ scopeLabel }}</dd></div>
        <div v-if="status.lastRotatedAt"><dt>最近签发</dt><dd>{{ formatTime(status.lastRotatedAt) }}</dd></div>
      </dl>
      <p v-if="!status.active && status.todoProjectId" class="mcp-note">Todo 项目授权仍保留，签发新 Token 后生效。</p>
      <div class="mcp-actions">
        <button class="mcp-btn primary" type="button" :disabled="actionDisabled" data-testid="mcp-rotate" @click="requestRotation">
          {{ status.active ? '重置 Token' : '生成 Token' }}
        </button>
        <button v-if="status.active" class="mcp-btn danger" type="button" :disabled="actionDisabled" data-testid="mcp-revoke" @click="confirmation = 'revoke'">撤销 Token</button>
      </div>

      <div v-if="confirmation" class="mcp-confirm" role="group" aria-label="确认凭据操作">
        <p>{{ confirmation === 'rotate' ? '重置后，旧 Token 会立即失效，所有连接的客户端都需要更换。' : '撤销后，当前 Token 会立即失效，所有连接的客户端都会失去访问权限。' }}</p>
        <div class="mcp-actions">
          <button class="mcp-btn danger" type="button" :disabled="busy" data-testid="mcp-confirm" @click="confirmMutation">
            {{ confirmation === 'rotate' ? '确认重置' : '确认撤销' }}
          </button>
          <button class="mcp-btn" type="button" :disabled="busy" @click="confirmation = ''">取消</button>
        </div>
      </div>

      <div v-if="plaintext" class="mcp-secret">
        <p><strong>此 Token 只显示一次。</strong> 请复制到客户端的安全配置中，不要发到聊天、提交到代码库或分享给他人。</p>
        <p class="mcp-note">在 Codex 的 Todo MCP 客户端中，将它配置为 <code>SHIZUKI_MCP_TOKEN</code> 环境变量。不要把真实值写进项目文件。</p>
        <code data-testid="mcp-plaintext">{{ plaintext }}</code>
        <div class="mcp-actions">
          <button class="mcp-btn" type="button" data-testid="mcp-copy" @click="copyToken">复制 Token</button>
          <button class="mcp-btn" type="button" data-testid="mcp-hide" @click="clearSecret">隐藏 Token</button>
        </div>
        <p v-if="clipboardFeedback" role="status">{{ clipboardFeedback }}</p>
      </div>

      <form class="mcp-scope" @submit.prevent="saveScope">
        <label for="account-mcp-todo-project">Todo 研发授权</label>
        <p class="mcp-note">只授权一个本人项目。选择“不授权”不会撤销 Token，但会停止其 Todo 访问。</p>
        <select id="account-mcp-todo-project" v-model="projectDraft" :disabled="actionDisabled || !projectChoicesReady">
          <option value="">不授权 Todo</option>
          <option v-if="unlistedProject" :value="status.todoProjectId" disabled>当前项目（不在可选列表）</option>
          <option v-for="project in projects" :key="project.projectId" :value="project.projectId">{{ project.name || project.projectId }}</option>
        </select>
        <p v-if="!projectChoicesReady" class="mcp-note" role="status">项目列表不可用。凭据签发、重置和撤销不受影响。</p>
        <button class="mcp-btn" data-testid="mcp-save-scope" type="submit" :disabled="actionDisabled || !projectChoicesReady || projectDraft === (status.todoProjectId || '')">保存 Todo 授权</button>
      </form>
    </template>
    <p v-if="feedback" role="status">{{ feedback }}</p>
  </section>
</template>

<script setup>
import { computed, onBeforeUnmount, ref, watch } from 'vue';
import { useAuthSession } from '../../composables/useAuthSession';
import { createMcpAccountTokenApi } from '../../services/mcpAccountTokenApi';

const auth = useAuthSession();
const owner = computed(() => auth.isAuthenticated.value ? String(auth.user.value?.userId ?? '') : '');
const status = ref(null);
const projects = ref([]);
const projectChoicesReady = ref(false);
const projectDraft = ref('');
const plaintext = ref('');
const confirmation = ref('');
const loading = ref(false);
const busy = ref(false);
const error = ref('');
const feedback = ref('');
const clipboardFeedback = ref('');
let generation = 0;

const actionDisabled = computed(() => busy.value || Boolean(error.value) || Boolean(confirmation.value));
const unlistedProject = computed(() => status.value?.todoProjectId && !projects.value.some(project => project.projectId === status.value.todoProjectId));
const scopeLabel = computed(() => status.value?.scopes.map(scope => scope === 'todo-dev' ? 'Todo 研发' : scope).join('、') || '无');

function apiFor(expectedUserId) {
  return createMcpAccountTokenApi((path, options) => auth.authorizedFetch(path, options, { expectedUserId }));
}

function formatTime(value) {
  const date = new Date(value);
  return Number.isNaN(date.getTime()) ? String(value) : date.toLocaleString();
}

function clearSecret() {
  plaintext.value = '';
  clipboardFeedback.value = '';
}

async function reload() {
  if (busy.value) return;
  const mine = ++generation;
  const account = owner.value;
  clearSecret();
  confirmation.value = '';
  error.value = '';
  feedback.value = '';
  status.value = null;
  projects.value = [];
  projectChoicesReady.value = false;
  projectDraft.value = '';
  loading.value = Boolean(account);
  if (!account) return;

  const api = apiFor(account);
  const [result, choices] = await Promise.allSettled([api.getStatus(), api.listTodoProjects()]);
  if (mine !== generation) return;
  loading.value = false;
  if (result.status === 'fulfilled') {
    status.value = result.value;
    projectDraft.value = result.value.todoProjectId || '';
  } else {
    error.value = '无法读取 MCP Token 状态。请刷新后再试。';
  }
  if (choices.status === 'fulfilled') {
    projects.value = choices.value;
    projectChoicesReady.value = true;
  }
}

watch(owner, () => {
  busy.value = false;
  void reload();
}, { immediate: true, flush: 'sync' });

onBeforeUnmount(() => {
  generation += 1;
  clearSecret();
});

function requestRotation() {
  if (actionDisabled.value || !status.value) return;
  if (status.value.active) confirmation.value = 'rotate';
  else void mutate('rotate');
}

function confirmMutation() {
  if (!confirmation.value || busy.value || error.value) return;
  const action = confirmation.value;
  confirmation.value = '';
  void mutate(action);
}

function saveScope() {
  if (actionDisabled.value || !projectChoicesReady.value || !status.value
    || projectDraft.value === (status.value.todoProjectId || '')) return;
  if (projectDraft.value && !projects.value.some(project => project.projectId === projectDraft.value)) return;
  void mutate('scope', projectDraft.value || null);
}

async function mutate(action, project) {
  const account = owner.value;
  if (!account || !status.value || busy.value || error.value) return;
  const mine = generation;
  const api = apiFor(account);
  busy.value = true;
  feedback.value = '';
  if (action !== 'scope') clearSecret();
  try {
    const result = await (action === 'rotate' ? api.rotate() : action === 'revoke' ? api.revoke() : api.setTodoProject(project));
    if (mine !== generation) return;
    status.value = action === 'rotate' ? result.status : result;
    projectDraft.value = status.value.todoProjectId || '';
    if (action === 'rotate') plaintext.value = result.token;
    feedback.value = action === 'revoke' ? 'Token 已撤销。' : action === 'scope' ? 'Todo 授权已保存。' : '';
  } catch {
    // Never render the raw network/server error: it could include credentials.
    if (mine === generation) error.value = '无法确认操作结果。请先刷新状态，再决定是否重试。';
  } finally {
    if (mine === generation) busy.value = false;
  }
}

async function copyToken() {
  const value = plaintext.value;
  if (!value) return;
  try {
    await navigator.clipboard.writeText(value);
    if (value === plaintext.value) clipboardFeedback.value = '已复制到剪贴板。';
  } catch {
    if (value === plaintext.value) clipboardFeedback.value = '剪贴板不可用，请手动复制。';
  }
}
</script>

<style scoped>
.mcp-pane, .mcp-scope { display: grid; gap: 10px; min-width: 0; }
.mcp-pane p, .mcp-status { margin: 0; }
.mcp-note { font-size: 0.9rem; opacity: 0.82; }
.mcp-actions, .mcp-status { display: flex; flex-wrap: wrap; gap: 8px 16px; }
.mcp-status dt { font-size: 0.82rem; opacity: 0.8; }
.mcp-status dd { margin: 3px 0 0; }
.mcp-btn, .mcp-scope select {
  justify-self: start; max-width: 100%; padding: 7px 12px; border-radius: 8px;
  border: 1px solid var(--surface-border, currentColor); font: inherit;
  color: inherit; background: var(--surface-raised, transparent);
}
.mcp-btn { cursor: pointer; }
.mcp-btn:disabled { opacity: 0.55; cursor: not-allowed; }
.mcp-btn.primary { font-weight: 650; }
.mcp-btn.danger { color: var(--danger-text, inherit); font-weight: 650; }
.mcp-confirm, .mcp-secret { display: grid; gap: 8px; padding: 12px; border: 1px solid var(--surface-border, currentColor); border-radius: 8px; min-width: 0; }
.mcp-secret code { overflow-wrap: anywhere; white-space: normal; user-select: all; }
.mcp-scope { margin-top: 6px; }
.mcp-scope label { font-weight: 650; }
</style>
