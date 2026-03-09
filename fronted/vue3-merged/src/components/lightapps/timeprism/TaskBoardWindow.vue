<template>
  <section class="lightapp-window">
    <form class="task-create" @submit.prevent="createTaskItem">
      <input v-model.trim="draft.title" type="text" placeholder="新增看板任务，例如：完成接口联调" />
      <select v-model="draft.projectId">
        <option value="">无项目</option>
        <option v-for="item in projects" :key="item.projectId" :value="String(item.projectId)">
          {{ item.name }}
        </option>
      </select>
      <select v-model="draft.columnCode">
        <option v-for="column in enabledColumns" :key="column.columnCode" :value="column.columnCode">
          {{ column.title }}
        </option>
      </select>
      <button class="action-btn ripple-trigger" type="submit" :disabled="saving || !draft.title.trim()">
        {{ saving ? '新增中...' : '新增' }}
      </button>
      <button class="action-btn ripple-trigger" type="button" @click="toggleColumnEditor">
        {{ showColumnEditor ? '关闭列配置' : '列配置' }}
      </button>
    </form>

    <section v-if="showColumnEditor" class="column-editor liquid-material">
      <header>
        <h4>列配置</h4>
        <button class="action-btn ripple-trigger" @click="saveColumns" :disabled="saving">保存列配置</button>
      </header>
      <ul class="column-editor-list">
        <li v-for="(column, index) in columnDrafts" :key="`${column.columnCode}_${index}`">
          <input v-model.trim="column.columnCode" type="text" placeholder="列编码" />
          <input v-model.trim="column.title" type="text" placeholder="列标题" />
          <input v-model.number="column.sortNum" type="number" />
          <label><input v-model="column.enabled" type="checkbox" /> 启用</label>
          <button class="icon-btn ripple-trigger" @click="removeColumnDraft(index)">
            <i class="fas fa-trash"></i>
          </button>
        </li>
      </ul>
      <button class="action-btn ripple-trigger" @click="appendColumnDraft">新增列</button>
    </section>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <div class="board-grid">
      <article v-for="column in enabledColumns" :key="column.columnCode" class="column-card liquid-material">
        <header>
          <h4>{{ column.title }}</h4>
          <span>{{ tasksByColumn[column.columnCode]?.length || 0 }}</span>
        </header>
        <ul v-if="tasksByColumn[column.columnCode]?.length" class="card-list">
          <li v-for="item in tasksByColumn[column.columnCode]" :key="item.taskId" class="task-card">
            <p>{{ item.title }}</p>
            <small>
              <template v-if="item.projectId">{{ projectName(item.projectId) }}</template>
              <template v-if="item.dueAt"> · {{ formatDateTime(item.dueAt) }}</template>
            </small>
            <div class="card-actions">
              <button class="icon-btn ripple-trigger" :disabled="isFirstColumn(column.columnCode)" @click="moveTaskCard(item, 'left')">
                <i class="fas fa-arrow-left"></i>
              </button>
              <button class="icon-btn ripple-trigger" :disabled="isLastColumn(column.columnCode)" @click="moveTaskCard(item, 'right')">
                <i class="fas fa-arrow-right"></i>
              </button>
              <button class="icon-btn ripple-trigger" @click="removeTask(item.taskId)">
                <i class="fas fa-trash"></i>
              </button>
            </div>
          </li>
        </ul>
        <p v-else class="empty-hint">暂无任务</p>
      </article>
    </div>
  </section>
</template>

<script setup>
import { computed, onMounted, reactive, ref } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppTask,
  deleteLightAppTask,
  listLightAppProjects,
  listLightAppTaskColumns,
  listLightAppTasks,
  moveLightAppTask,
  updateLightAppTaskColumns
} from '../../../services/lightAppsApi';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';

const auth = useAuthSession();

const tasks = ref([]);
const columns = ref([]);
const projects = ref([]);
const saving = ref(false);
const errorText = ref('');
const showColumnEditor = ref(false);
const columnDrafts = ref([]);

const draft = reactive({
  title: '',
  projectId: '',
  columnCode: 'todo'
});

const enabledColumns = computed(() => columns.value.filter((item) => item.enabled));

const tasksByColumn = computed(() => {
  const result = {};
  enabledColumns.value.forEach((column) => {
    result[column.columnCode] = [];
  });
  tasks.value.forEach((task) => {
    if (!result[task.columnCode]) {
      result[task.columnCode] = [];
    }
    result[task.columnCode].push(task);
  });
  Object.keys(result).forEach((code) => {
    result[code] = result[code]
      .slice()
      .sort((left, right) => left.sortNum - right.sortNum || left.taskId - right.taskId);
  });
  return result;
});

function normalizeColumns(input) {
  return (Array.isArray(input) ? input : [])
    .map((item) => ({
      columnCode: String(item.columnCode || item.column_code || '').trim().toLowerCase(),
      title: String(item.title || '').trim(),
      sortNum: Number(item.sortNum ?? item.sort_num) || 0,
      enabled: Boolean(item.enabled)
    }))
    .filter((item) => item.columnCode)
    .sort((left, right) => left.sortNum - right.sortNum || left.columnCode.localeCompare(right.columnCode));
}

function normalizeTasks(input) {
  return (Array.isArray(input) ? input : [])
    .map((item) => ({
      taskId: Number(item.taskId ?? item.task_id) || 0,
      projectId: Number(item.projectId ?? item.project_id) || null,
      columnCode: String(item.columnCode ?? item.column_code ?? 'todo').trim().toLowerCase() || 'todo',
      title: String(item.title || '').trim(),
      detail: String(item.detail || '').trim(),
      dueAt: item.dueAt || item.due_at || '',
      sortNum: Number(item.sortNum ?? item.sort_num) || 0,
      updatedAt: item.updatedAt || item.updated_at || ''
    }))
    .filter((item) => item.taskId && item.title)
    .sort((left, right) => {
      if (left.columnCode !== right.columnCode) return left.columnCode.localeCompare(right.columnCode);
      return left.sortNum - right.sortNum || left.taskId - right.taskId;
    });
}

function cloneColumnDrafts() {
  columnDrafts.value = columns.value.map((item) => ({ ...item }));
}

function projectName(projectId) {
  const id = Number(projectId);
  const matched = projects.value.find((item) => item.projectId === id);
  return matched?.name || `项目#${id}`;
}

function formatDateTime(iso) {
  const ts = Date.parse(iso || '');
  if (!Number.isFinite(ts)) return '';
  const date = new Date(ts);
  return `${date.getMonth() + 1}/${date.getDate()} ${String(date.getHours()).padStart(2, '0')}:${String(
    date.getMinutes()
  ).padStart(2, '0')}`;
}

function isFirstColumn(columnCode) {
  const list = enabledColumns.value;
  return list.length ? list[0].columnCode === columnCode : true;
}

function isLastColumn(columnCode) {
  const list = enabledColumns.value;
  return list.length ? list[list.length - 1].columnCode === columnCode : true;
}

function nextSortForColumn(columnCode) {
  const list = tasks.value.filter((item) => item.columnCode === columnCode);
  const maxSort = list.reduce((max, item) => Math.max(max, Number(item.sortNum) || 0), 0);
  return maxSort + 10;
}

function persistGuest(payload) {
  const next = {
    tasks: normalizeTasks(payload.tasks || tasks.value),
    taskColumns: normalizeColumns(payload.taskColumns || columns.value),
    projects: payload.projects || projects.value
  };

  tasks.value = next.tasks;
  columns.value = next.taskColumns;
  projects.value = next.projects;

  if (!enabledColumns.value.some((item) => item.columnCode === draft.columnCode)) {
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  }

  updateGuestLightAppData((current) => ({
    ...current,
    tasks: next.tasks,
    taskColumns: next.taskColumns,
    projects: next.projects
  }));
}

async function hydrate() {
  errorText.value = '';
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    tasks.value = normalizeTasks(guest.tasks || []);
    columns.value = normalizeColumns(guest.taskColumns || guest.task_columns || []);
    projects.value = Array.isArray(guest.projects) ? guest.projects : [];
    if (!columns.value.length) {
      columns.value = [
        { columnCode: 'todo', title: '待处理', sortNum: 10, enabled: true },
        { columnCode: 'doing', title: '进行中', sortNum: 20, enabled: true },
        { columnCode: 'done', title: '已完成', sortNum: 30, enabled: true }
      ];
    }
    cloneColumnDrafts();
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
    return;
  }

  try {
    const [projectList, columnList, taskList] = await Promise.all([
      listLightAppProjects(auth.authorizedFetch),
      listLightAppTaskColumns(auth.authorizedFetch),
      listLightAppTasks(auth.authorizedFetch)
    ]);
    projects.value = Array.isArray(projectList) ? projectList : [];
    columns.value = normalizeColumns(columnList);
    tasks.value = normalizeTasks(taskList);
    writeRemoteLightAppCache({ projects: projects.value, taskColumns: columns.value, tasks: tasks.value });
    cloneColumnDrafts();
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  } catch (error) {
    const cache = readRemoteLightAppCache();
    projects.value = cache.projects || [];
    columns.value = normalizeColumns(cache.taskColumns || []);
    tasks.value = normalizeTasks(cache.tasks || []);
    cloneColumnDrafts();
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
    errorText.value = error?.message || '看板加载失败，已回退缓存数据。';
  }
}

async function refreshRemoteBoard() {
  const [projectList, columnList, taskList] = await Promise.all([
    listLightAppProjects(auth.authorizedFetch),
    listLightAppTaskColumns(auth.authorizedFetch),
    listLightAppTasks(auth.authorizedFetch)
  ]);
  projects.value = Array.isArray(projectList) ? projectList : [];
  columns.value = normalizeColumns(columnList);
  tasks.value = normalizeTasks(taskList);
  writeRemoteLightAppCache({ projects: projects.value, taskColumns: columns.value, tasks: tasks.value });
  cloneColumnDrafts();
  if (!enabledColumns.value.some((item) => item.columnCode === draft.columnCode)) {
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  }
}

async function createTaskItem() {
  const title = draft.title.trim();
  if (!title) return;

  errorText.value = '';
  saving.value = true;

  try {
    await auth.ensureReady();
    const targetColumn = enabledColumns.value.some((item) => item.columnCode === draft.columnCode)
      ? draft.columnCode
      : enabledColumns.value[0]?.columnCode || 'todo';

    if (auth.isAuthenticated.value) {
      await createLightAppTask(
        {
          projectId: draft.projectId ? Number(draft.projectId) : null,
          title,
          columnCode: targetColumn,
          sortNum: nextSortForColumn(targetColumn)
        },
        auth.authorizedFetch
      );
      await refreshRemoteBoard();
    } else {
      const nextId = createLocalEntityId();
      persistGuest({
        tasks: [
          ...tasks.value,
          {
            taskId: nextId,
            projectId: draft.projectId ? Number(draft.projectId) : null,
            columnCode: targetColumn,
            title,
            detail: '',
            dueAt: '',
            sortNum: nextSortForColumn(targetColumn),
            updatedAt: new Date().toISOString()
          }
        ]
      });
    }

    draft.title = '';
  } catch (error) {
    errorText.value = error?.message || '任务创建失败';
  } finally {
    saving.value = false;
  }
}

async function moveTaskCard(item, direction) {
  const enabled = enabledColumns.value;
  const index = enabled.findIndex((column) => column.columnCode === item.columnCode);
  if (index < 0) return;

  const targetIndex = direction === 'left' ? index - 1 : index + 1;
  if (targetIndex < 0 || targetIndex >= enabled.length) return;
  const targetColumn = enabled[targetIndex].columnCode;

  errorText.value = '';

  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await moveLightAppTask(
        {
          taskId: item.taskId,
          columnCode: targetColumn,
          sortNum: nextSortForColumn(targetColumn)
        },
        auth.authorizedFetch
      );
      await refreshRemoteBoard();
      return;
    }

    persistGuest({
      tasks: tasks.value.map((task) => {
        if (task.taskId !== item.taskId) return task;
        return {
          ...task,
          columnCode: targetColumn,
          sortNum: nextSortForColumn(targetColumn)
        };
      })
    });
  } catch (error) {
    errorText.value = error?.message || '任务移动失败';
  }
}

async function removeTask(taskId) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppTask(taskId, auth.authorizedFetch);
      await refreshRemoteBoard();
      return;
    }

    persistGuest({
      tasks: tasks.value.filter((item) => item.taskId !== taskId)
    });
  } catch (error) {
    errorText.value = error?.message || '任务删除失败';
  }
}

function toggleColumnEditor() {
  showColumnEditor.value = !showColumnEditor.value;
  if (showColumnEditor.value) {
    cloneColumnDrafts();
  }
}

function appendColumnDraft() {
  columnDrafts.value.push({
    columnCode: `column_${columnDrafts.value.length + 1}`,
    title: '新列',
    sortNum: (columnDrafts.value.length + 1) * 10,
    enabled: true
  });
}

function removeColumnDraft(index) {
  columnDrafts.value.splice(index, 1);
}

function normalizedColumnDrafts() {
  const seen = new Set();
  return columnDrafts.value
    .map((item, index) => {
      const code = String(item.columnCode || '').trim().toLowerCase();
      if (!code || seen.has(code)) return null;
      seen.add(code);
      return {
        columnCode: code,
        title: String(item.title || '').trim() || code,
        sortNum: Number(item.sortNum) || (index + 1) * 10,
        enabled: Boolean(item.enabled)
      };
    })
    .filter(Boolean);
}

async function saveColumns() {
  const payloadColumns = normalizedColumnDrafts();
  if (!payloadColumns.length) {
    errorText.value = '至少保留一列';
    return;
  }

  errorText.value = '';
  saving.value = true;

  try {
    await auth.ensureReady();

    if (auth.isAuthenticated.value) {
      await updateLightAppTaskColumns({ columns: payloadColumns }, auth.authorizedFetch);
      await refreshRemoteBoard();
    } else {
      const enabledCodes = payloadColumns.filter((item) => item.enabled).map((item) => item.columnCode);
      const fallbackCode = enabledCodes[0] || payloadColumns[0].columnCode;
      const validCodes = new Set(payloadColumns.map((item) => item.columnCode));
      persistGuest({
        taskColumns: payloadColumns,
        tasks: tasks.value.map((item) => {
          if (validCodes.has(item.columnCode)) return item;
          return {
            ...item,
            columnCode: fallbackCode,
            sortNum: nextSortForColumn(fallbackCode)
          };
        })
      });
      cloneColumnDrafts();
    }

    showColumnEditor.value = false;
  } catch (error) {
    errorText.value = error?.message || '列配置保存失败';
  } finally {
    saving.value = false;
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
  --la-panel-bg: rgba(var(--glass-rgb), 0.28);
  --la-column-bg: rgba(var(--glass-rgb), 0.26);
  --la-card-bg: rgba(var(--glass-rgb), 0.24);
  --la-text: rgba(35, 42, 58, 0.9);
  --la-muted: rgba(55, 64, 84, 0.74);
  --la-danger: rgba(214, 74, 103, 0.92);
  display: grid;
  gap: 10px;
  color: var(--la-text);
}

.task-create {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 140px 130px 80px 96px;
  gap: 8px;
}

.task-create input,
.task-create select,
.column-editor input {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 8px 10px;
}

.action-btn,
.icon-btn {
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  color: var(--la-text);
  border-radius: 10px;
}

.column-editor {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.column-editor header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.column-editor header h4 {
  margin: 0;
}

.column-editor-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 6px;
}

.column-editor-list li {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(0, 1fr) 96px auto 32px;
  gap: 8px;
  align-items: center;
}

.board-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
  gap: 10px;
}

.column-card {
  --liquid-bg: var(--la-column-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
}

.column-card header {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.column-card header h4 {
  margin: 0;
  font-size: 14px;
}

.column-card header span {
  font-size: 12px;
  color: var(--la-muted);
}

.card-list {
  list-style: none;
  margin: 8px 0 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.task-card {
  border-radius: 10px;
  border: 1px solid var(--la-border);
  background: var(--la-card-bg);
  padding: 8px;
  display: grid;
  gap: 8px;
}

.task-card p {
  margin: 0;
}

.task-card small {
  color: var(--la-muted);
}

.card-actions {
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

.icon-btn:disabled {
  opacity: 0.4;
  cursor: not-allowed;
}

.error-text {
  margin: 0;
  color: var(--la-danger);
  font-size: 12px;
}

.empty-hint {
  margin: 8px 0 0;
  color: var(--la-muted);
  font-size: 12px;
}

@media (max-width: 980px) {
  .task-create,
  .column-editor-list li {
    grid-template-columns: 1fr;
  }
}
</style>
