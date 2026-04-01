<template>
  <section class="lightapp-window">
    <LightAppTopToolbar :window-id="props.windowId">
        <button
          class="icon-btn toolbar-btn ripple-trigger"
          :class="{ 'is-active': showForm }"
          type="button"
          :title="showForm ? '收起添加区' : '添加项目'"
          :aria-label="showForm ? '收起添加区' : '添加项目'"
          @click="toggleForm"
        >
          <i class="fas fa-plus" aria-hidden="true"></i>
        </button>
        <span class="toolbar-hint">共 {{ projects.length }} 个项目</span>
    </LightAppTopToolbar>

    <CollapsiblePanel :visible="showForm" tag="form" class="project-form" @submit.prevent="submitProject">
        <input v-model.trim="draft.name" type="text" placeholder="项目名称，例如：春季学习计划" />
        <input v-model.trim="draft.description" type="text" placeholder="描述（可选）" />
        <input v-model="draft.color" type="color" />
        <button
          class="icon-btn ripple-trigger"
          type="submit"
          :title="saving ? '保存中' : editingId ? '更新项目' : '创建项目'"
          :aria-label="saving ? '保存中' : editingId ? '更新项目' : '创建项目'"
          :disabled="saving || !draft.name.trim()"
        >
          <i :class="saving ? 'fas fa-spinner fa-spin' : editingId ? 'fas fa-check' : 'fas fa-plus'" aria-hidden="true"></i>
        </button>
        <button
          v-if="editingId"
          class="icon-btn ripple-trigger"
          type="button"
          title="取消编辑"
          aria-label="取消编辑"
          :disabled="saving"
          @click="cancelEditing"
        >
          <i class="fas fa-xmark" aria-hidden="true"></i>
        </button>
    </CollapsiblePanel>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <ul v-if="projects.length" class="project-list">
      <li v-for="item in projects" :key="item.projectId" class="project-item" :class="{ archived: item.archived }">
        <div
          class="project-main project-main-clickable"
          role="button"
          tabindex="0"
          title="查看该项目待办"
          @click="openTodoByProject(item.projectId)"
          @keydown.enter.prevent="openTodoByProject(item.projectId)"
          @keydown.space.prevent="openTodoByProject(item.projectId)"
        >
          <span class="project-color" :style="{ backgroundColor: item.color || '#6aa9ff' }"></span>
          <div>
            <p>{{ item.name }}</p>
            <small>{{ item.description || '无描述' }}</small>
          </div>
        </div>
        <div class="project-actions">
          <button class="icon-btn ripple-trigger" title="编辑" @click="startEditing(item)">
            <i class="fas fa-pen"></i>
          </button>
          <button class="icon-btn ripple-trigger" :title="item.archived ? '取消归档' : '归档'" @click="toggleArchived(item)">
            <i :class="item.archived ? 'fas fa-box-open' : 'fas fa-box-archive'"></i>
          </button>
          <button class="icon-btn ripple-trigger" title="删除" @click="removeProject(item.projectId)">
            <i class="fas fa-trash"></i>
          </button>
        </div>
      </li>
    </ul>
    <p v-else class="empty-hint">暂无项目，先创建一个作为 Todo/Task/Schedule 的归属。</p>
  </section>
</template>

<script setup>
import { inject, onMounted, reactive, ref } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppProject,
  deleteLightAppProject,
  listLightAppProjects,
  updateLightAppProject
} from '../../../services/lightAppsApi';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';
import { TIMEPRISM_SUITE_CONTEXT_KEY } from './timePrismSuiteState';
import CollapsiblePanel from '../CollapsiblePanel.vue';
import LightAppTopToolbar from '../LightAppTopToolbar.vue';

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const auth = useAuthSession();
const suiteContext = inject(TIMEPRISM_SUITE_CONTEXT_KEY, null);

const projects = ref([]);
const errorText = ref('');
const saving = ref(false);
const editingId = ref(0);
const showForm = ref(false);

const draft = reactive({
  name: '',
  description: '',
  color: '#6aa9ff'
});

function normalizeProjectId(value) {
  const normalized = Number(value);
  return Number.isFinite(normalized) && normalized > 0 ? normalized : 0;
}

function toProjectPayload() {
  return {
    name: draft.name.trim(),
    description: draft.description.trim() || null,
    color: draft.color,
    archived: false
  };
}

function resetDraft() {
  draft.name = '';
  draft.description = '';
  draft.color = '#6aa9ff';
  editingId.value = 0;
}

function toggleForm() {
  if (showForm.value && editingId.value) {
    resetDraft();
  }
  showForm.value = !showForm.value;
}

function sortProjects(items) {
  return items
    .slice()
    .sort((left, right) => left.sortNum - right.sortNum || left.projectId - right.projectId);
}

async function hydrate() {
  errorText.value = '';
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    projects.value = sortProjects(guest.projects || []);
    return;
  }

  try {
    const list = await listLightAppProjects(auth.authorizedFetch);
    projects.value = sortProjects(Array.isArray(list) ? list : []);
    writeRemoteLightAppCache({ projects: projects.value });
  } catch (error) {
    const cached = readRemoteLightAppCache();
    projects.value = sortProjects(cached.projects || []);
    errorText.value = error?.message || '项目加载失败，已回退缓存数据。';
  }
}

function persistGuestProjects(nextProjects) {
  const normalized = sortProjects(nextProjects || []);
  projects.value = normalized;
  updateGuestLightAppData((current) => ({
    ...current,
    projects: normalized
  }));
}

function startEditing(item) {
  const projectId = normalizeProjectId(item?.projectId ?? item?.project_id);
  if (!projectId) {
    errorText.value = '项目数据异常，请刷新后重试';
    return;
  }
  showForm.value = true;
  editingId.value = projectId;
  draft.name = item.name || '';
  draft.description = item.description || '';
  draft.color = item.color || '#6aa9ff';
}

function cancelEditing() {
  resetDraft();
  showForm.value = false;
}

function openTodoByProject(projectId) {
  const normalizedProjectId = normalizeProjectId(projectId);
  if (!normalizedProjectId) return;
  if (!suiteContext?.openTodoWithProject) return;
  suiteContext.openTodoWithProject(normalizedProjectId);
}

async function submitProject() {
  const name = draft.name.trim();
  if (!name) return;

  errorText.value = '';
  saving.value = true;

  try {
    await auth.ensureReady();

    if (auth.isAuthenticated.value) {
      if (editingId.value) {
        const projectId = normalizeProjectId(editingId.value);
        if (!projectId) {
          throw new Error('项目ID无效，请刷新后重试');
        }
        await updateLightAppProject(projectId, toProjectPayload(), auth.authorizedFetch);
      } else {
        await createLightAppProject(toProjectPayload(), auth.authorizedFetch);
      }
      const list = await listLightAppProjects(auth.authorizedFetch);
      projects.value = sortProjects(Array.isArray(list) ? list : []);
      writeRemoteLightAppCache({ projects: projects.value });
      suiteContext?.notifyProjectsChanged?.();
      showForm.value = false;
      resetDraft();
      return;
    }

    const current = projects.value.slice();
    if (editingId.value) {
      persistGuestProjects(
        current.map((item) => {
          if (item.projectId !== editingId.value) return item;
          return {
            ...item,
            name,
            description: draft.description.trim(),
            color: draft.color || '#6aa9ff'
          };
        })
      );
      suiteContext?.notifyProjectsChanged?.();
      showForm.value = false;
      resetDraft();
      return;
    }

    const nextId = createLocalEntityId();
    const maxSort = current.reduce((max, item) => Math.max(max, Number(item.sortNum) || 0), 0);
    persistGuestProjects([
      ...current,
      {
        projectId: nextId,
        projectCode: `local_${nextId}`,
        name,
        description: draft.description.trim(),
        color: draft.color || '#6aa9ff',
        archived: false,
        sortNum: maxSort + 10,
        updatedAt: new Date().toISOString()
      }
    ]);
    suiteContext?.notifyProjectsChanged?.();
    showForm.value = false;
    resetDraft();
  } catch (error) {
    errorText.value = error?.message || '项目保存失败';
  } finally {
    saving.value = false;
  }
}

async function toggleArchived(item) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    const projectId = normalizeProjectId(item?.projectId ?? item?.project_id);
    if (!projectId) {
      throw new Error('项目ID无效，请刷新后重试');
    }

    if (auth.isAuthenticated.value) {
      await updateLightAppProject(
        projectId,
        {
          name: item.name,
          description: item.description,
          color: item.color,
          archived: !item.archived,
          sortNum: item.sortNum
        },
        auth.authorizedFetch
      );
      const list = await listLightAppProjects(auth.authorizedFetch);
      projects.value = sortProjects(Array.isArray(list) ? list : []);
      writeRemoteLightAppCache({ projects: projects.value });
      suiteContext?.notifyProjectsChanged?.();
      return;
    }

    persistGuestProjects(
      projects.value.map((row) => {
        if (row.projectId !== projectId) return row;
        return {
          ...row,
          archived: !row.archived
        };
      })
    );
    suiteContext?.notifyProjectsChanged?.();
  } catch (error) {
    errorText.value = error?.message || '项目状态更新失败';
  }
}

async function removeProject(projectId) {
  errorText.value = '';
  const normalizedProjectId = normalizeProjectId(projectId);
  if (!normalizedProjectId) {
    errorText.value = '项目ID无效，请刷新后重试';
    return;
  }

  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppProject(normalizedProjectId, auth.authorizedFetch);
      const list = await listLightAppProjects(auth.authorizedFetch);
      projects.value = sortProjects(Array.isArray(list) ? list : []);
      writeRemoteLightAppCache({ projects: projects.value });
      suiteContext?.notifyProjectsChanged?.();
      if (editingId.value === normalizedProjectId) {
        resetDraft();
      }
      return;
    }

    persistGuestProjects(projects.value.filter((item) => item.projectId !== normalizedProjectId));
    suiteContext?.notifyProjectsChanged?.();
    if (editingId.value === normalizedProjectId) {
      resetDraft();
    }
  } catch (error) {
    errorText.value = error?.message || '项目删除失败';
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

.toolbar-hint {
  margin-left: auto;
  color: var(--la-muted);
  font-size: 12px;
}

.project-form {
  display: grid;
  grid-template-columns: minmax(0, 1fr) minmax(0, 1fr) 60px auto auto;
  gap: 8px;
}

.project-form input[type='text'],
.project-form input[type='color'] {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 8px 10px;
}

.icon-btn {
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  color: var(--la-text);
  border-radius: 10px;
}

.project-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.project-item {
  border: 1px solid var(--la-border);
  border-radius: 12px;
  background: var(--la-card-bg);
  padding: 10px;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 10px;
}

.project-item.archived {
  opacity: 0.68;
}

.project-main {
  display: flex;
  align-items: center;
  gap: 10px;
  min-width: 0;
}

.project-main-clickable {
  cursor: pointer;
  border-radius: 10px;
  padding: 4px 6px;
  margin: -4px -6px;
  transition: background-color 140ms ease;
}

.project-main-clickable:hover {
  background: rgba(var(--accent-rgb), 0.14);
}

.project-main-clickable:focus-visible {
  outline: 2px solid rgba(var(--accent-rgb), 0.45);
  outline-offset: 2px;
}

.project-main p {
  margin: 0;
  word-break: break-word;
}

.project-main small {
  color: var(--la-muted);
}

.project-color {
  width: 12px;
  height: 46px;
  border-radius: 999px;
  flex-shrink: 0;
}

.project-actions {
  display: flex;
  align-items: center;
  gap: 6px;
}

.icon-btn {
  width: 30px;
  height: 30px;
  display: inline-flex;
  align-items: center;
  justify-content: center;
}

.toolbar-btn {
  width: 32px;
  height: 32px;
}

.error-text {
  margin: 0;
  color: var(--la-danger);
  font-size: 12px;
}

.empty-hint {
  margin: 0;
  text-align: center;
  color: var(--la-muted);
  padding: 14px 0;
}

@container lightapp-window-body (max-width: 860px) {
  .project-form {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .toolbar-hint {
    margin-left: 0;
    width: 100%;
  }
}

@container lightapp-window-body (max-width: 560px) {
  .project-form {
    grid-template-columns: 1fr;
  }

  .project-item {
    grid-template-columns: 1fr;
  }

  .project-actions {
    justify-content: flex-end;
  }
}

@container lightapp-window-body (max-height: 360px) {
  .lightapp-window {
    gap: 8px;
  }
}

@media (max-width: 900px) {
  .project-form {
    grid-template-columns: 1fr;
  }
}
</style>
