<template>
  <section class="lightapp-window">
    <div class="top-toolbar">
      <button class="action-btn ripple-trigger" type="button" @click="toggleCreateForm">
        {{ showCreateForm ? '收起添加区' : '添加待办' }}
      </button>
      <span class="toolbar-hint">{{ openCount }} 未完成 / {{ todos.length }} 总计</span>
    </div>

    <Transition name="panel-collapse">
      <form v-if="showCreateForm" class="todo-create" @submit.prevent="createTodoItem">
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
    </Transition>

    <div class="todo-toolbar">
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === TODO_VIEW_ALL }" @click="viewFilter = TODO_VIEW_ALL">全部</button>
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === TODO_VIEW_OPEN }" @click="viewFilter = TODO_VIEW_OPEN">未完成</button>
      <button class="chip-btn ripple-trigger" :class="{ active: viewFilter === TODO_VIEW_DONE }" @click="viewFilter = TODO_VIEW_DONE">已完成</button>
    </div>

    <div v-if="projects.length || hasUnassignedTodos" class="project-filters">
      <button class="chip-btn ripple-trigger" :class="{ active: !selectedProjectIds.length }" @click="clearProjectFilters">
        全部项目
      </button>
      <button
        class="chip-btn ripple-trigger"
        :class="{ active: isProjectFilterActive(UNASSIGNED_PROJECT_FILTER_ID) }"
        @click="toggleProjectFilter(UNASSIGNED_PROJECT_FILTER_ID)"
      >
        无项目
      </button>
      <button
        v-for="project in projects"
        :key="`project_filter_${project.projectId}`"
        class="chip-btn ripple-trigger project-chip"
        :class="{ active: isProjectFilterActive(project.projectId) }"
        :style="projectChipStyle(project.color)"
        @click="toggleProjectFilter(project.projectId)"
      >
        <span class="project-chip-dot" :style="{ backgroundColor: projectColor(project.projectId) }"></span>
        {{ project.name }}
      </button>
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
          <small class="todo-meta">
            <span>{{ priorityLabel(item.priority) }}</span>
            <span class="project-badge" :style="projectBadgeStyle(item.projectId)">
              {{ projectName(item.projectId) }}
            </span>
            <span v-if="item.dueAt">{{ formatDateTime(item.dueAt) }}</span>
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
import { computed, inject, onMounted, reactive, ref } from 'vue';
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
import {
  TIMEPRISM_SUITE_CONTEXT_KEY,
  TODO_VIEW_ALL,
  TODO_VIEW_DONE,
  TODO_VIEW_OPEN,
  UNASSIGNED_PROJECT_FILTER_ID,
  filterTodosByViewAndProjects,
  normalizeProjectFilterIds
} from './timePrismSuiteState';

const auth = useAuthSession();
const suiteContext = inject(TIMEPRISM_SUITE_CONTEXT_KEY, null);

const todos = ref([]);
const projects = ref([]);
const viewFilter = ref(TODO_VIEW_ALL);
const saving = ref(false);
const errorText = ref('');
const showCreateForm = ref(false);
const localProjectFilters = ref([]);

const draft = reactive({
  title: '',
  projectId: '',
  priority: 'MEDIUM',
  dueAt: ''
});

const selectedProjectIds = computed(() => {
  const source = suiteContext?.selectedProjectIds?.value ?? localProjectFilters.value;
  return normalizeProjectFilterIds(source);
});

const hasUnassignedTodos = computed(() =>
  todos.value.some((item) => (Number.isInteger(Number(item?.projectId)) ? Number(item.projectId) <= 0 : true))
);

const filteredTodos = computed(() => {
  return filterTodosByViewAndProjects(todos.value, viewFilter.value, selectedProjectIds.value);
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

function addHexAlpha(color, alpha) {
  const normalized = String(color || '').trim();
  if (!/^#[0-9a-fA-F]{6}$/.test(normalized)) {
    return normalized || '#6aa9ff';
  }
  return `${normalized}${alpha}`;
}

function projectById(projectId) {
  const id = Number(projectId);
  if (!Number.isInteger(id) || id <= 0) return null;
  return projects.value.find((item) => item.projectId === id) || null;
}

function projectName(projectId) {
  const matched = projectById(projectId);
  if (matched) return matched.name;
  const id = Number(projectId);
  if (!Number.isInteger(id) || id <= 0) return '无项目';
  return `项目#${id}`;
}

function projectColor(projectId) {
  const matched = projectById(projectId);
  if (matched?.color) return matched.color;
  const id = Number(projectId);
  if (!Number.isInteger(id) || id <= 0) return '#9da6b6';
  return '#6aa9ff';
}

function projectChipStyle(color) {
  const chipColor = String(color || '#6aa9ff').trim() || '#6aa9ff';
  return {
    borderColor: addHexAlpha(chipColor, '88'),
    color: chipColor,
    backgroundColor: addHexAlpha(chipColor, '1f')
  };
}

function projectBadgeStyle(projectId) {
  const color = projectColor(projectId);
  return {
    borderColor: addHexAlpha(color, '88'),
    color,
    backgroundColor: addHexAlpha(color, '22')
  };
}

function applyProjectFilters(nextFilters) {
  const normalized = normalizeProjectFilterIds(nextFilters);
  if (suiteContext?.setProjectFilters) {
    suiteContext.setProjectFilters(normalized);
    return;
  }
  localProjectFilters.value = normalized;
}

function clearProjectFilters() {
  applyProjectFilters([]);
}

function toggleProjectFilter(projectId) {
  const normalizedProjectId = Number(projectId);
  if (!Number.isInteger(normalizedProjectId) || normalizedProjectId < 0) return;
  const active = selectedProjectIds.value.includes(normalizedProjectId);
  if (active) {
    applyProjectFilters(selectedProjectIds.value.filter((id) => id !== normalizedProjectId));
    return;
  }
  applyProjectFilters([...selectedProjectIds.value, normalizedProjectId]);
}

function isProjectFilterActive(projectId) {
  const normalizedProjectId = Number(projectId);
  if (!Number.isInteger(normalizedProjectId) || normalizedProjectId < 0) return false;
  return selectedProjectIds.value.includes(normalizedProjectId);
}

function toggleCreateForm() {
  showCreateForm.value = !showCreateForm.value;
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
    showCreateForm.value = false;
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
  min-width: 0;
}

.top-toolbar {
  display: flex;
  align-items: center;
  gap: 8px;
  flex-wrap: wrap;
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

.project-filters {
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

.project-chip {
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.project-chip-dot {
  width: 8px;
  height: 8px;
  border-radius: 50%;
  flex-shrink: 0;
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
  word-break: break-word;
}

.todo-main small {
  color: var(--la-muted);
}

.todo-meta {
  display: inline-flex;
  align-items: center;
  flex-wrap: wrap;
  gap: 6px;
}

.project-badge {
  border: 1px solid var(--la-border);
  border-radius: 999px;
  padding: 1px 8px;
  line-height: 1.2;
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

.panel-collapse-enter-active,
.panel-collapse-leave-active {
  transition:
    opacity 160ms ease,
    transform 180ms ease;
  transform-origin: top center;
}

.panel-collapse-enter-from,
.panel-collapse-leave-to {
  opacity: 0;
  transform: translateY(-4px) scaleY(0.95);
}

.panel-collapse-enter-to,
.panel-collapse-leave-from {
  opacity: 1;
  transform: translateY(0) scaleY(1);
}

@container lightapp-window-body (max-width: 760px) {
  .todo-create {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .todo-toolbar {
    gap: 6px;
  }

  .toolbar-hint {
    margin-left: 0;
    width: 100%;
  }

  .project-filters {
    gap: 6px;
  }

  .todo-item {
    grid-template-columns: auto minmax(0, 1fr);
  }

  .todo-actions {
    grid-column: 1 / -1;
    justify-content: flex-end;
  }
}

@container lightapp-window-body (max-width: 520px) {
  .todo-create {
    grid-template-columns: 1fr;
  }

  .chip-btn,
  .action-btn {
    min-height: 32px;
  }

  .todo-item {
    padding: 8px 10px;
  }

  .project-filters {
    gap: 6px;
  }
}

@container lightapp-window-body (max-height: 360px) {
  .lightapp-window {
    gap: 8px;
  }

  .todo-item {
    padding: 8px 10px;
  }
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
