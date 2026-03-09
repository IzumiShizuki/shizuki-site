<template>
  <section class="lightapp-window">
    <form class="project-form" @submit.prevent="submitProject">
      <input v-model.trim="draft.name" type="text" placeholder="项目名称，例如：春季学习计划" />
      <input v-model.trim="draft.description" type="text" placeholder="描述（可选）" />
      <input v-model="draft.color" type="color" />
      <button class="action-btn ripple-trigger" type="submit" :disabled="saving || !draft.name.trim()">
        {{ saving ? '保存中...' : editingId ? '更新项目' : '创建项目' }}
      </button>
      <button
        v-if="editingId"
        class="action-btn ripple-trigger"
        type="button"
        :disabled="saving"
        @click="cancelEditing"
      >
        取消
      </button>
    </form>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <ul v-if="projects.length" class="project-list">
      <li v-for="item in projects" :key="item.projectId" class="project-item" :class="{ archived: item.archived }">
        <div class="project-main">
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
import { onMounted, reactive, ref } from 'vue';
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

const auth = useAuthSession();

const projects = ref([]);
const errorText = ref('');
const saving = ref(false);
const editingId = ref(0);

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
  editingId.value = projectId;
  draft.name = item.name || '';
  draft.description = item.description || '';
  draft.color = item.color || '#6aa9ff';
}

function cancelEditing() {
  resetDraft();
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
      if (editingId.value === normalizedProjectId) {
        resetDraft();
      }
      return;
    }

    persistGuestProjects(projects.value.filter((item) => item.projectId !== normalizedProjectId));
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

.action-btn,
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
