<template>
  <section class="lightapp-window">
    <form class="todo-create" @submit.prevent="createTodoItem">
      <input v-model.trim="draft.title" type="text" placeholder="添加待办，例如：整理算法笔记" />
      <select v-model="draft.projectId">
        <option value="">无项目</option>
        <option v-for="item in projects" :key="item.projectId" :value="String(item.projectId)">
          {{ item.name }}
        </option>
      </select>
      <select v-model="draft.priority">
        <option value="LOW">低</option>
        <option value="MEDIUM">中</option>
        <option value="HIGH">高</option>
      </select>
      <input v-model="draft.dueAt" type="datetime-local" />
      <button class="action-btn ripple-trigger" type="submit" :disabled="saving || !draft.title.trim()">
        {{ saving ? '添加中...' : '添加' }}
      </button>
    </form>

    <div class="todo-toolbar">
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === 'ALL' }" @click="viewFilter = 'ALL'">全部</button>
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === 'OPEN' }" @click="viewFilter = 'OPEN'">未完成</button>
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === 'DONE' }" @click="viewFilter = 'DONE'">已完成</button>
      <span class="toolbar-hint">{{ openCount }} 未完成 / {{ todos.length }} 总计</span>
    </div>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <ul v-if="filteredTodos.length" class="todo-list">
      <li v-for="item in filteredTodos" :key="item.todoId" class="todo-item" :class="{ done: item.done }">
        <label class="todo-check">
          <input :checked="item.done" type="checkbox" @change="toggleDone(item)" />
          <span></span>
        </label>
        <div class="todo-main">
          <p>{{ item.title }}</p>
          <small>
            {{ priorityLabel(item.priority) }}
            <template v-if="item.projectId"> · {{ projectName(item.projectId) }}</template>
            <template v-if="item.dueAt"> · {{ formatDateTime(item.dueAt) }}</template>
          </small>
        </div>
        <div class="todo-actions">
          <button class="icon-btn ripple-trigger" title="上移" @click="moveTodo(item.todoId, 'up')">
            <i class="fas fa-arrow-up"></i>
          </button>
          <button class="icon-btn ripple-trigger" title="下移" @click="moveTodo(item.todoId, 'down')">
            <i class="fas fa-arrow-down"></i>
          </button>
          <button class="icon-btn ripple-trigger" title="删除" @click="removeTodoItem(item.todoId)">
            <i class="fas fa-trash"></i>
          </button>
        </div>
      </li>
    </ul>
    <p v-else class="empty-hint">暂无待办，先添加一条开始。</p>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppTodo,
  deleteLightAppTodo,
  listLightAppProjects,
  listLightAppTodos,
  reorderLightAppTodos,
  updateLightAppTodo
} from '../../../services/lightAppsApi';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';

const auth = useAuthSession();

const todos = ref([]);
const projects = ref([]);
const viewFilter = ref('ALL');
const saving = ref(false);
const errorText = ref('');

const draft = reactive({
  title: '',
  projectId: '',
  priority: 'MEDIUM',
  dueAt: ''
});

const filteredTodos = computed(() => {
  if (viewFilter.value === 'OPEN') return todos.value.filter((item) => !item.done);
  if (viewFilter.value === 'DONE') return todos.value.filter((item) => item.done);
  return todos.value;
});

const openCount = computed(() => todos.value.filter((item) => !item.done).length);

function sortTodos(items) {
  return items
    .slice()
    .sort((left, right) => left.sortNum - right.sortNum || left.todoId - right.todoId);
}

function parseIsoFromInput(value) {
  const source = String(value || '').trim();
  if (!source) return '';
  const ts = Date.parse(source);
  if (!Number.isFinite(ts)) return '';
  return new Date(ts).toISOString();
}

function projectName(projectId) {
  const id = Number(projectId);
  const matched = projects.value.find((item) => item.projectId === id);
  return matched?.name || `项目#${id}`;
}

function priorityLabel(priority) {
  if (priority === 'HIGH') return '高优先级';
  if (priority === 'LOW') return '低优先级';
  return '中优先级';
}

function formatDateTime(iso) {
  const ts = Date.parse(iso || '');
  if (!Number.isFinite(ts)) return '';
  const date = new Date(ts);
  return `${date.getMonth() + 1}/${date.getDate()} ${String(date.getHours()).padStart(2, '0')}:${String(
    date.getMinutes()
  ).padStart(2, '0')}`;
}

function buildTodoPayload(item, overrides = {}) {
  return {
    projectId: overrides.projectId ?? item.projectId ?? null,
    title: overrides.title ?? item.title,
    detail: overrides.detail ?? (item.detail || null),
    priority: overrides.priority ?? (item.priority || 'MEDIUM'),
    done: overrides.done ?? Boolean(item.done),
    dueAt: overrides.dueAt ?? (item.dueAt || null),
    sortNum: overrides.sortNum ?? item.sortNum ?? 0
  };
}

function persistGuestTodos(nextTodos) {
  const normalized = sortTodos(nextTodos || []);
  todos.value = normalized;
  updateGuestLightAppData((current) => ({
    ...current,
    todos: normalized
  }));
}

async function hydrate() {
  errorText.value = '';
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    projects.value = (guest.projects || []).slice();
    todos.value = sortTodos(guest.todos || []);
    return;
  }

  try {
    const [projectList, todoList] = await Promise.all([
      listLightAppProjects(auth.authorizedFetch),
      listLightAppTodos(auth.authorizedFetch)
    ]);
    projects.value = Array.isArray(projectList) ? projectList : [];
    todos.value = sortTodos(Array.isArray(todoList) ? todoList : []);
    writeRemoteLightAppCache({ projects: projects.value, todos: todos.value });
  } catch (error) {
    const cache = readRemoteLightAppCache();
    projects.value = cache.projects || [];
    todos.value = sortTodos(cache.todos || []);
    errorText.value = error?.message || '待办加载失败，已使用缓存数据。';
  }
}

async function refreshRemoteTodos() {
  const [projectList, todoList] = await Promise.all([
    listLightAppProjects(auth.authorizedFetch),
    listLightAppTodos(auth.authorizedFetch)
  ]);
  projects.value = Array.isArray(projectList) ? projectList : [];
  todos.value = sortTodos(Array.isArray(todoList) ? todoList : []);
  writeRemoteLightAppCache({ projects: projects.value, todos: todos.value });
}

async function createTodoItem() {
  const title = draft.title.trim();
  if (!title) return;

  errorText.value = '';
  saving.value = true;

  try {
    await auth.ensureReady();

    if (auth.isAuthenticated.value) {
      await createLightAppTodo(
        {
          projectId: draft.projectId ? Number(draft.projectId) : null,
          title,
          priority: draft.priority,
          done: false,
          dueAt: parseIsoFromInput(draft.dueAt) || null
        },
        auth.authorizedFetch
      );
      await refreshRemoteTodos();
    } else {
      const nextId = createLocalEntityId();
      const maxSort = todos.value.reduce((max, item) => Math.max(max, Number(item.sortNum) || 0), 0);
      persistGuestTodos([
        {
          todoId: nextId,
          projectId: draft.projectId ? Number(draft.projectId) : null,
          title,
          detail: '',
          priority: draft.priority,
          done: false,
          dueAt: parseIsoFromInput(draft.dueAt) || '',
          sortNum: maxSort + 10,
          updatedAt: new Date().toISOString()
        },
        ...todos.value
      ]);
    }

    draft.title = '';
    draft.dueAt = '';
    draft.priority = 'MEDIUM';
  } catch (error) {
    errorText.value = error?.message || '创建待办失败';
  } finally {
    saving.value = false;
  }
}

async function toggleDone(item) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await updateLightAppTodo(item.todoId, buildTodoPayload(item, { done: !item.done }), auth.authorizedFetch);
      await refreshRemoteTodos();
      return;
    }

    persistGuestTodos(
      todos.value.map((row) => {
        if (row.todoId !== item.todoId) return row;
        return {
          ...row,
          done: !row.done
        };
      })
    );
  } catch (error) {
    errorText.value = error?.message || '待办状态更新失败';
  }
}

async function removeTodoItem(todoId) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppTodo(todoId, auth.authorizedFetch);
      await refreshRemoteTodos();
      return;
    }
    persistGuestTodos(todos.value.filter((item) => item.todoId !== todoId));
  } catch (error) {
    errorText.value = error?.message || '待办删除失败';
  }
}

function buildReorderPayloadByList(list) {
  return {
    items: list.map((item, index) => ({
      todoId: item.todoId,
      sortNum: (index + 1) * 10
    }))
  };
}

async function moveTodo(todoId, direction) {
  const current = todos.value.slice();
  const index = current.findIndex((item) => item.todoId === todoId);
  if (index < 0) return;

  const target = direction === 'up' ? index - 1 : index + 1;
  if (target < 0 || target >= current.length) return;

  const temp = current[index];
  current[index] = current[target];
  current[target] = temp;

  errorText.value = '';

  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      const payload = buildReorderPayloadByList(current);
      const reordered = await reorderLightAppTodos(payload, auth.authorizedFetch);
      todos.value = sortTodos(Array.isArray(reordered) ? reordered : current);
      writeRemoteLightAppCache({ todos: todos.value, projects: projects.value });
      return;
    }

    const normalized = current.map((item, idx) => ({
      ...item,
      sortNum: (idx + 1) * 10
    }));
    persistGuestTodos(normalized);
  } catch (error) {
    errorText.value = error?.message || '待办排序失败';
  }
}

onMounted(() => {
  hydrate();
});
</script>

<style scoped>
.lightapp-window {
  --la-border: rgba(255, 255, 255, 0.44);
  --la-input-bg: rgba(var(--glass-rgb), 0.32);
  --la-btn-bg: rgba(var(--glass-rgb), 0.3);
  --la-card-bg: rgba(var(--glass-rgb), 0.24);
  --la-text: rgba(35, 42, 58, 0.9);
  --la-muted: rgba(55, 64, 84, 0.74);
  --la-danger: rgba(214, 74, 103, 0.92);
  display: grid;
  gap: 10px;
  color: var(--la-text);
}

.todo-create {
  display: grid;
  grid-template-columns: minmax(0, 1.1fr) 132px 84px 178px 72px;
  gap: 8px;
}

.todo-create input,
.todo-create select {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 8px 10px;
}

.todo-toolbar {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
}

.chip-btn,
.action-btn,
.icon-btn {
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 6px 10px;
}

.chip-btn.active {
  border-color: rgba(var(--accent-rgb), 0.58);
  background: rgba(var(--accent-rgb), 0.24);
}

.toolbar-hint {
  margin-left: auto;
  color: var(--la-muted);
  font-size: 12px;
}

.todo-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.todo-item {
  display: grid;
  grid-template-columns: auto minmax(0, 1fr) auto;
  align-items: center;
  gap: 10px;
  padding: 10px 12px;
  border-radius: 12px;
  border: 1px solid var(--la-border);
  background: var(--la-card-bg);
}

.todo-item.done {
  opacity: 0.66;
}

.todo-main p {
  margin: 0;
  line-height: 1.45;
}

.todo-main small {
  color: var(--la-muted);
}

.todo-check input {
  display: none;
}

.todo-check span {
  display: inline-flex;
  width: 18px;
  height: 18px;
  border-radius: 50%;
  border: 2px solid rgba(86, 98, 128, 0.58);
}

.todo-check input:checked + span {
  border-color: rgba(var(--accent-rgb), 0.72);
  background: rgba(var(--accent-rgb), 0.24);
}

.todo-actions {
  display: flex;
  gap: 6px;
}

.icon-btn {
  width: 30px;
  height: 30px;
  padding: 0;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.empty-hint {
  margin: 0;
  text-align: center;
  color: var(--la-muted);
  padding: 18px 0;
}

.error-text {
  margin: 0;
  color: var(--la-danger);
  font-size: 12px;
}

@media (max-width: 960px) {
  .todo-create {
    grid-template-columns: 1fr;
  }

  .toolbar-hint {
    margin-left: 0;
    width: 100%;
  }
}
</style>
