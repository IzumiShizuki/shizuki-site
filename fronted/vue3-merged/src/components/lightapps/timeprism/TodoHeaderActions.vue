<template>
  <div class="todo-header-actions" @pointerdown.stop>
    <button
      class="header-icon ripple-trigger"
      :class="{ active: headerState.showCreateForm }"
      type="button"
      :title="headerState.showCreateForm ? '收起添加区' : '添加待办'"
      :aria-label="headerState.showCreateForm ? '收起添加区' : '添加待办'"
      @click.stop="toggleCreateForm"
    >
      <i :class="headerState.showCreateForm ? 'fas fa-chevron-up' : 'fas fa-plus'" aria-hidden="true"></i>
    </button>
    <button
      class="header-icon ripple-trigger"
      :class="{ active: headerState.showRecurringPanel }"
      type="button"
      :title="headerState.showRecurringPanel ? '收起周期规则' : '周期规则'"
      :aria-label="headerState.showRecurringPanel ? '收起周期规则' : '周期规则'"
      @click.stop="toggleRecurringPanel"
    >
      <i :class="headerState.showRecurringPanel ? 'fas fa-repeat' : 'fas fa-calendar-plus'" aria-hidden="true"></i>
    </button>

    <span class="header-count">{{ headerState.openCount }} / {{ headerState.totalCount }}</span>
    <span class="header-divider" aria-hidden="true"></span>

    <button
      v-for="item in VIEW_ITEMS"
      :key="item.value"
      class="header-chip ripple-trigger"
      :class="{ active: headerState.viewFilter === item.value }"
      type="button"
      :title="item.label"
      @click.stop="setViewFilter(item.value)"
    >
      {{ item.label }}
    </button>

    <template v-if="showProjectFilters">
      <span class="header-divider" aria-hidden="true"></span>
      <button
        class="header-chip ripple-trigger"
        :class="{ active: !selectedProjectIds.length }"
        type="button"
        title="全部项目"
        @click.stop="clearProjectFilters"
      >
        全部项目
      </button>
      <button
        class="header-chip ripple-trigger"
        :class="{ active: isProjectFilterActive(UNASSIGNED_PROJECT_FILTER_ID) }"
        type="button"
        title="无项目"
        @click.stop="toggleProjectFilter(UNASSIGNED_PROJECT_FILTER_ID)"
      >
        无项目
      </button>
      <button
        v-for="project in headerState.projectOptions"
        :key="`todo_header_project_${project.projectId}`"
        class="header-chip ripple-trigger project-chip"
        :class="{ active: isProjectFilterActive(project.projectId) }"
        :style="projectChipStyle(project)"
        type="button"
        :title="project.name"
        @click.stop="toggleProjectFilter(project.projectId)"
      >
        <span class="project-chip-dot" :style="{ backgroundColor: project.color }"></span>
        {{ project.name }}
      </button>
    </template>

    <template v-if="headerState.showCreateForm">
      <span class="header-divider" aria-hidden="true"></span>
      <select class="header-select" :value="headerState.draft.projectId" title="项目" @change="patchDraft({ projectId: $event.target.value })">
        <option value="">无项目</option>
        <option v-for="project in headerState.projectOptions" :key="`todo_header_select_${project.projectId}`" :value="String(project.projectId)">
          {{ project.name }}
        </option>
      </select>
      <select class="header-select" :value="headerState.draft.priority" title="优先级" @change="patchDraft({ priority: $event.target.value })">
        <option v-for="item in TODO_PRIORITY_ITEMS" :key="item.value" :value="item.value">{{ item.label }}</option>
      </select>
      <select class="header-select" :value="headerState.draft.timingMode" title="任务类型" @change="patchDraft({ timingMode: $event.target.value })">
        <option v-for="item in TODO_TIMING_MODE_ITEMS" :key="item.value" :value="item.value">{{ item.label }}</option>
      </select>
      <select
        class="header-select"
        :value="headerState.draft.timePrecision"
        title="时间精度"
        @change="patchDraft({ timePrecision: $event.target.value })"
      >
        <option v-for="item in TODO_TIME_PRECISION_ITEMS" :key="item.value" :value="item.value">{{ item.label }}</option>
      </select>
      <label class="header-toggle">
        <input
          :checked="headerState.draft.showOnCalendar"
          type="checkbox"
          @change.stop="patchDraft({ showOnCalendar: $event.target.checked })"
        />
        <span>日历</span>
      </label>
      <label class="header-toggle">
        <input
          :checked="headerState.draft.reminderEnabled"
          type="checkbox"
          @change.stop="patchDraft({ reminderEnabled: $event.target.checked })"
        />
        <span>提醒</span>
      </label>
    </template>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import {
  TODO_VIEW_ALL,
  TODO_VIEW_DONE,
  TODO_VIEW_OPEN,
  UNASSIGNED_PROJECT_FILTER_ID,
  resolveTimePrismSuiteSession,
  setSuiteProjectFilters,
  toggleSuiteProjectFilter
} from './timePrismSuiteState';
import {
  TODO_PRIORITY_ITEMS,
  TODO_TIME_PRECISION_ITEMS,
  TODO_TIMING_MODE_ITEMS,
  patchTodoWindowDraft,
  resolveTodoWindowHeaderState,
  setTodoWindowViewFilter,
  toggleTodoWindowCreateForm,
  toggleTodoWindowRecurringPanel
} from './todoWindowHeaderState';

const VIEW_ITEMS = Object.freeze([
  { value: TODO_VIEW_ALL, label: '全部' },
  { value: TODO_VIEW_OPEN, label: '未完成' },
  { value: TODO_VIEW_DONE, label: '已完成' }
]);

const props = defineProps({
  windowId: {
    type: [Number, String],
    default: 0
  }
});

const headerState = resolveTodoWindowHeaderState(props.windowId);
const suiteSession = resolveTimePrismSuiteSession(props.windowId);

const selectedProjectIds = computed(() => suiteSession.selectedProjectIds || []);
const showProjectFilters = computed(() => headerState.projectOptions.length || headerState.hasUnassignedTodos);

function addHexAlpha(color, alpha) {
  const normalized = String(color || '').trim();
  if (!/^#[0-9a-fA-F]{6}$/.test(normalized)) {
    return normalized || '#6aa9ff';
  }
  return `${normalized}${alpha}`;
}

function projectChipStyle(project) {
  const color = String(project?.color || '').trim() || '#6aa9ff';
  return {
    '--project-chip-color': color,
    '--project-chip-border': addHexAlpha(color, '88'),
    '--project-chip-bg': addHexAlpha(color, '22')
  };
}

function setViewFilter(value) {
  setTodoWindowViewFilter(props.windowId, value);
}

function toggleCreateForm() {
  toggleTodoWindowCreateForm(props.windowId);
}

function toggleRecurringPanel() {
  toggleTodoWindowRecurringPanel(props.windowId);
}

function patchDraft(patch) {
  patchTodoWindowDraft(props.windowId, patch);
}

function clearProjectFilters() {
  setSuiteProjectFilters(suiteSession, []);
}

function toggleProjectFilter(projectId) {
  toggleSuiteProjectFilter(suiteSession, projectId);
}

function isProjectFilterActive(projectId) {
  return selectedProjectIds.value.includes(Number(projectId));
}
</script>

<style scoped>
.todo-header-actions {
  flex: 1 1 auto;
  min-width: 0;
  display: flex;
  align-items: center;
  gap: 4px;
  overflow-x: auto;
  padding: 0 2px 0 6px;
  scrollbar-width: thin;
}

.todo-header-actions::-webkit-scrollbar {
  height: 4px;
}

.todo-header-actions::-webkit-scrollbar-thumb {
  border-radius: 999px;
  background: rgba(118, 130, 156, 0.44);
}

.header-divider {
  flex: 0 0 auto;
  width: 1px;
  height: 18px;
  background: rgba(255, 255, 255, 0.26);
}

.header-count {
  flex: 0 0 auto;
  font-size: 11px;
  color: rgba(55, 64, 84, 0.76);
  white-space: nowrap;
}

.header-icon,
.header-chip,
.header-select,
.header-toggle {
  flex: 0 0 auto;
  min-height: 28px;
  border: 1px solid rgba(255, 255, 255, 0.42);
  background: rgba(255, 255, 255, 0.32);
  color: rgba(34, 41, 56, 0.9);
  transition:
    transform 140ms ease,
    border-color 140ms ease,
    background-color 140ms ease,
    box-shadow 180ms ease;
}

.header-icon:hover,
.header-chip:hover,
.header-select:hover,
.header-toggle:hover {
  transform: translateY(-1px);
  border-color: rgba(255, 255, 255, 0.58);
  background: rgba(255, 255, 255, 0.42);
  box-shadow: 0 5px 14px rgba(14, 20, 34, 0.14);
}

.header-icon {
  width: 28px;
  border-radius: 8px;
}

.header-chip,
.header-toggle {
  border-radius: 999px;
  padding: 0 10px;
  font-size: 12px;
}

.header-chip.active,
.header-icon.active {
  border-color: rgba(var(--accent-rgb), 0.56);
  background: rgba(var(--accent-rgb), 0.2);
  color: rgba(34, 41, 56, 0.96);
}

.header-select {
  border-radius: 999px;
  padding: 0 10px;
  font-size: 12px;
  appearance: auto;
}

.header-toggle {
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.header-toggle input {
  margin: 0;
}

.project-chip {
  color: var(--project-chip-color, rgba(34, 41, 56, 0.9));
  border-color: var(--project-chip-border, rgba(255, 255, 255, 0.42));
  background: var(--project-chip-bg, rgba(255, 255, 255, 0.32));
  display: inline-flex;
  align-items: center;
  gap: 6px;
}

.project-chip-dot {
  width: 7px;
  height: 7px;
  border-radius: 999px;
}

@media (max-width: 760px) {
  .todo-header-actions {
    padding-left: 4px;
  }

  .header-count {
    display: none;
  }

  .header-chip,
  .header-select,
  .header-toggle {
    padding-inline: 8px;
  }
}
</style>
