<template>
  <section class="lightapp-window">
    <LightAppTopToolbar :window-id="props.windowId">
        <button
          class="icon-btn toolbar-btn ripple-trigger"
          type="button"
          :title="showCreateForm ? '收起添加区' : '添加任务'"
          :aria-label="showCreateForm ? '收起添加区' : '添加任务'"
          @click="toggleCreateForm"
        >
          <i :class="showCreateForm ? 'fas fa-chevron-up' : 'fas fa-plus'" aria-hidden="true"></i>
        </button>
        <button
          class="icon-btn toolbar-btn ripple-trigger"
          type="button"
          :title="showColumnEditor ? '关闭列配置' : '列配置'"
          :aria-label="showColumnEditor ? '关闭列配置' : '列配置'"
          @click="toggleColumnEditor"
        >
          <i :class="showColumnEditor ? 'fas fa-sliders' : 'fas fa-table-columns'" aria-hidden="true"></i>
        </button>
        <button
          class="icon-btn toolbar-btn ripple-trigger"
          type="button"
          :title="showRecurringPanel ? '收起周期规则' : '周期规则'"
          :aria-label="showRecurringPanel ? '收起周期规则' : '周期规则'"
          @click="toggleRecurringPanel"
        >
          <i :class="showRecurringPanel ? 'fas fa-repeat' : 'fas fa-calendar-plus'" aria-hidden="true"></i>
        </button>
    </LightAppTopToolbar>

    <CollapsiblePanel :visible="showCreateForm" tag="form" class="task-create" @submit.prevent="createTaskItem">
        <input v-model.trim="draft.title" type="text" placeholder="新增看板任务，例如：完成接口联调" />
        <input v-model.trim="draft.detail" type="text" placeholder="任务详情（可选）" />
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
        <input
          v-model="draft.dueAt"
          :type="taskTimeInputType"
          :placeholder="isDayTaskPrecision ? '截止日期' : '截止时间'"
        />
        <select v-model="draft.timingMode">
          <option value="DEADLINE">截止任务</option>
          <option value="RANGE">范围任务</option>
        </select>
        <input
          v-if="draft.timingMode === 'RANGE'"
          v-model="draft.rangeStartAt"
          :type="taskTimeInputType"
          :placeholder="isDayTaskPrecision ? '开始日期' : '开始时间'"
        />
        <select v-model="draft.timePrecision">
          <option value="MINUTE">分钟级</option>
          <option value="DAY">日级</option>
        </select>
        <label class="toggle-check"><input v-model="draft.showOnCalendar" type="checkbox" /> 显示日历</label>
        <label class="toggle-check"><input v-model="draft.reminderEnabled" type="checkbox" /> 启用提醒</label>
        <input
          v-if="draft.reminderEnabled && draft.timingMode === 'RANGE'"
          v-model.number="draft.startRemindValue"
          type="number"
          min="1"
          placeholder="起始提前"
        />
        <select v-if="draft.reminderEnabled && draft.timingMode === 'RANGE'" v-model="draft.startRemindUnit">
          <option value="MINUTE">分钟</option>
          <option value="DAY">天</option>
        </select>
        <input v-if="draft.reminderEnabled" v-model.number="draft.deadlineRemindValue" type="number" min="1" placeholder="截止提前" />
        <select v-if="draft.reminderEnabled" v-model="draft.deadlineRemindUnit">
          <option value="MINUTE">分钟</option>
          <option value="DAY">天</option>
        </select>
        <button
          class="icon-btn ripple-trigger"
          type="submit"
          :title="saving ? '处理中' : editingTaskId ? '保存修改' : '新增任务'"
          :aria-label="saving ? '处理中' : editingTaskId ? '保存修改' : '新增任务'"
          :disabled="saving || !draft.title.trim()"
        >
          <i :class="saving ? 'fas fa-spinner fa-spin' : 'fas fa-check'" aria-hidden="true"></i>
        </button>
        <button v-if="editingTaskId" class="icon-btn ripple-trigger" type="button" title="取消编辑" @click="cancelTaskEdit">
          <i class="fas fa-xmark" aria-hidden="true"></i>
        </button>
    </CollapsiblePanel>

    <CollapsiblePanel :visible="showRecurringPanel" class="recurring-panel liquid-material">
        <header>
          <h4>Task 周期规则</h4>
          <button
            class="icon-btn ripple-trigger"
            type="button"
            :title="recurringSaving ? '保存中' : editingRecurringRuleId ? '保存规则' : '新增规则'"
            :aria-label="recurringSaving ? '保存中' : editingRecurringRuleId ? '保存规则' : '新增规则'"
            :disabled="recurringSaving || !recurringDraft.title.trim() || !recurringDraft.cronExpr.trim()"
            @click="createRecurringRule"
          >
            <i :class="recurringSaving ? 'fas fa-spinner fa-spin' : editingRecurringRuleId ? 'fas fa-floppy-disk' : 'fas fa-plus'" aria-hidden="true"></i>
          </button>
          <button v-if="editingRecurringRuleId" class="icon-btn ripple-trigger" type="button" title="取消编辑" @click="cancelRecurringEdit">
            <i class="fas fa-xmark" aria-hidden="true"></i>
          </button>
        </header>
        <div class="recurring-form">
          <input v-model.trim="recurringDraft.title" type="text" placeholder="规则标题，例如：每日进度同步" />
          <select v-model="recurringDraft.projectId">
            <option value="">无项目</option>
            <option v-for="item in projects" :key="`task_rule_project_${item.projectId}`" :value="String(item.projectId)">
              {{ item.name }}
            </option>
          </select>
          <select v-model="recurringDraft.columnCode">
            <option v-for="column in enabledColumns" :key="`task_rule_column_${column.columnCode}`" :value="column.columnCode">
              {{ column.title }}
            </option>
          </select>
          <input v-model.trim="recurringDraft.cronExpr" type="text" placeholder="Cron，例如：0 30 9 * * *" />
          <input v-model.trim="recurringDraft.timeZoneId" type="text" placeholder="时区，例如：Asia/Shanghai" />
        </div>

        <ul v-if="taskRecurringRules.length" class="recurring-list">
          <li v-for="rule in taskRecurringRules" :key="`task_rule_${rule.ruleId}`">
            <div>
              <p>{{ rule.title }}</p>
              <small>{{ rule.columnCode }} · {{ rule.cronExpr }} · {{ rule.timeZoneId }}</small>
            </div>
            <div class="card-actions">
              <button class="icon-btn ripple-trigger" type="button" title="编辑" @click="editRecurringRule(rule)">
                <i class="fas fa-pen" aria-hidden="true"></i>
              </button>
              <button class="icon-btn ripple-trigger" type="button" :title="rule.enabled ? '停用' : '启用'" @click="toggleRecurringRule(rule)">
                <i :class="rule.enabled ? 'fas fa-pause' : 'fas fa-play'" aria-hidden="true"></i>
              </button>
              <button class="icon-btn ripple-trigger" type="button" title="删除" @click="removeRecurringRule(rule.ruleId)">
                <i class="fas fa-trash" aria-hidden="true"></i>
              </button>
            </div>
          </li>
        </ul>
        <p v-else class="empty-hint">暂无周期规则</p>
    </CollapsiblePanel>

    <section v-if="showColumnEditor" class="column-editor liquid-material">
      <header>
        <h4>列配置</h4>
        <button
          class="icon-btn ripple-trigger"
          type="button"
          title="保存列配置"
          aria-label="保存列配置"
          :disabled="saving"
          @click="saveColumns"
        >
          <i :class="saving ? 'fas fa-spinner fa-spin' : 'fas fa-floppy-disk'" aria-hidden="true"></i>
        </button>
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
      <button class="icon-btn ripple-trigger" type="button" title="新增列" aria-label="新增列" @click="appendColumnDraft">
        <i class="fas fa-plus" aria-hidden="true"></i>
      </button>
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
              <template v-if="item.dueAt"> · {{ formatTaskDateLabel(item.dueAt, item.timePrecision) }}</template>
            </small>
            <div class="card-actions">
              <button class="icon-btn ripple-trigger" title="编辑" @click="startTaskEdit(item)">
                <i class="fas fa-pen"></i>
              </button>
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
import { computed, inject, onBeforeUnmount, onMounted, reactive, ref, watch } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppTask,
  createLightAppTaskRecurringRule,
  deleteLightAppTask,
  deleteLightAppTaskRecurringRule,
  listLightAppProjects,
  listLightAppTaskRecurringRules,
  listLightAppTaskColumns,
  listLightAppTasks,
  moveLightAppTask,
  updateLightAppTask,
  updateLightAppTaskColumns,
  updateLightAppTaskRecurringRule
} from '../../../services/lightAppsApi';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';
import { TIMEPRISM_MODULE_BOARD, TIMEPRISM_SUITE_CONTEXT_KEY } from './timePrismSuiteState';
import { TIMEPRISM_FOCUS_ITEM_EVENT } from './timePrismFocusBus';
import {
  convertTaskInputValue,
  formatTaskDateLabel,
  isDayPrecision,
  parseTaskInputToIso,
  resolveTaskTimeInputType,
  toTaskInputValue
} from './taskTimePrecision';
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

const tasks = ref([]);
const columns = ref([]);
const projects = ref([]);
const saving = ref(false);
const recurringSaving = ref(false);
const errorText = ref('');
const showColumnEditor = ref(false);
const showCreateForm = ref(false);
const showRecurringPanel = ref(false);
const columnDrafts = ref([]);
const taskRecurringRules = ref([]);
const editingTaskId = ref(0);
const editingRecurringRuleId = ref(0);

const draft = reactive({
  title: '',
  detail: '',
  projectId: '',
  columnCode: 'todo',
  dueAt: '',
  showOnCalendar: true,
  timePrecision: 'MINUTE',
  timingMode: 'DEADLINE',
  rangeStartAt: '',
  reminderEnabled: false,
  startRemindValue: null,
  startRemindUnit: 'MINUTE',
  deadlineRemindValue: null,
  deadlineRemindUnit: 'MINUTE'
});

const recurringDraft = reactive({
  title: '',
  projectId: '',
  columnCode: 'todo',
  detail: '',
  cronExpr: '0 0 9 * * *',
  timeZoneId: 'Asia/Shanghai'
});

const enabledColumns = computed(() => columns.value.filter((item) => item.enabled));
const isDayTaskPrecision = computed(() => isDayPrecision(draft.timePrecision));
const taskTimeInputType = computed(() => resolveTaskTimeInputType(draft.timePrecision));

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
      showOnCalendar: item.showOnCalendar !== false,
      timePrecision: String(item.timePrecision ?? item.time_precision ?? 'MINUTE').trim().toUpperCase() || 'MINUTE',
      timingMode: String(item.timingMode ?? item.timing_mode ?? 'DEADLINE').trim().toUpperCase() || 'DEADLINE',
      rangeStartAt: item.rangeStartAt || item.range_start_at || '',
      reminderEnabled: Boolean(item.reminderEnabled ?? item.reminder_enabled),
      startRemindValue: normalizePositiveInteger(item.startRemindValue ?? item.start_remind_value),
      startRemindUnit: String(item.startRemindUnit ?? item.start_remind_unit ?? '').trim().toUpperCase(),
      deadlineRemindValue: normalizePositiveInteger(item.deadlineRemindValue ?? item.deadline_remind_value),
      deadlineRemindUnit: String(item.deadlineRemindUnit ?? item.deadline_remind_unit ?? '').trim().toUpperCase(),
      sortNum: Number(item.sortNum ?? item.sort_num) || 0,
      updatedAt: item.updatedAt || item.updated_at || ''
    }))
    .filter((item) => item.taskId && item.title)
    .sort((left, right) => {
      if (left.columnCode !== right.columnCode) return left.columnCode.localeCompare(right.columnCode);
      return left.sortNum - right.sortNum || left.taskId - right.taskId;
    });
}

function normalizeRecurringRules(input) {
  return (Array.isArray(input) ? input : [])
    .map((item) => ({
      ruleId: Number(item.ruleId ?? item.rule_id) || 0,
      projectId: Number(item.projectId ?? item.project_id) || null,
      columnCode: String(item.columnCode ?? item.column_code ?? 'todo').trim().toLowerCase() || 'todo',
      title: String(item.title || '').trim(),
      detail: String(item.detail || '').trim(),
      cronExpr: String(item.cronExpr ?? item.cron_expr ?? '').trim(),
      timeZoneId: String(item.timeZoneId ?? item.time_zone_id ?? 'Asia/Shanghai').trim() || 'Asia/Shanghai',
      startAt: item.startAt || item.start_at || '',
      endAt: item.endAt || item.end_at || '',
      enabled: item.enabled !== false,
      sortNum: Number(item.sortNum ?? item.sort_num) || 0,
      updatedAt: item.updatedAt || item.updated_at || ''
    }))
    .filter((item) => item.ruleId && item.title)
    .sort((left, right) => left.sortNum - right.sortNum || left.ruleId - right.ruleId);
}

function buildTaskRecurringPayload(item, overrides = {}) {
  return {
    projectId: overrides.projectId ?? item.projectId ?? null,
    columnCode: overrides.columnCode ?? item.columnCode,
    title: overrides.title ?? item.title,
    detail: overrides.detail ?? (item.detail || null),
    cronExpr: overrides.cronExpr ?? item.cronExpr,
    timeZoneId: overrides.timeZoneId ?? (item.timeZoneId || 'Asia/Shanghai'),
    startAt: overrides.startAt ?? (item.startAt || null),
    endAt: overrides.endAt ?? (item.endAt || null),
    enabled: overrides.enabled ?? Boolean(item.enabled),
    sortNum: overrides.sortNum ?? item.sortNum ?? 0
  };
}

function cloneColumnDrafts() {
  columnDrafts.value = columns.value.map((item) => ({ ...item }));
}

function projectName(projectId) {
  const id = Number(projectId);
  const matched = projects.value.find((item) => item.projectId === id);
  return matched?.name || `项目#${id}`;
}

function normalizePositiveInteger(value) {
  const num = Number(value);
  if (!Number.isFinite(num) || num <= 0) return null;
  return Math.round(num);
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
    projects: payload.projects || projects.value,
    taskRecurringRules: normalizeRecurringRules(payload.taskRecurringRules || taskRecurringRules.value)
  };

  tasks.value = next.tasks;
  columns.value = next.taskColumns;
  projects.value = next.projects;
  taskRecurringRules.value = next.taskRecurringRules;

  if (!enabledColumns.value.some((item) => item.columnCode === draft.columnCode)) {
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  }

  updateGuestLightAppData((current) => ({
    ...current,
    tasks: next.tasks,
    taskColumns: next.taskColumns,
    projects: next.projects,
    taskRecurringRules: next.taskRecurringRules
  }));
}

function toggleCreateForm() {
  showCreateForm.value = !showCreateForm.value;
  if (!showCreateForm.value) {
    cancelTaskEdit();
  }
}

function toggleRecurringPanel() {
  showRecurringPanel.value = !showRecurringPanel.value;
  if (!showRecurringPanel.value) {
    cancelRecurringEdit();
  }
}

function resetTaskDraft() {
  draft.title = '';
  draft.detail = '';
  draft.projectId = '';
  draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  draft.dueAt = '';
  draft.showOnCalendar = true;
  draft.timePrecision = 'MINUTE';
  draft.timingMode = 'DEADLINE';
  draft.rangeStartAt = '';
  draft.reminderEnabled = false;
  draft.startRemindValue = null;
  draft.startRemindUnit = 'MINUTE';
  draft.deadlineRemindValue = null;
  draft.deadlineRemindUnit = 'MINUTE';
}

function startTaskEdit(item) {
  if (!item) return;
  editingTaskId.value = Number(item.taskId) || 0;
  draft.title = item.title || '';
  draft.detail = item.detail || '';
  draft.projectId = item.projectId ? String(item.projectId) : '';
  draft.columnCode = item.columnCode || enabledColumns.value[0]?.columnCode || 'todo';
  draft.showOnCalendar = item.showOnCalendar !== false;
  draft.timePrecision = item.timePrecision || 'MINUTE';
  draft.timingMode = item.timingMode || 'DEADLINE';
  draft.dueAt = toTaskInputValue(item.dueAt, draft.timePrecision);
  draft.rangeStartAt = toTaskInputValue(item.rangeStartAt, draft.timePrecision);
  draft.reminderEnabled = Boolean(item.reminderEnabled);
  draft.startRemindValue = normalizePositiveInteger(item.startRemindValue);
  draft.startRemindUnit = item.startRemindUnit || 'MINUTE';
  draft.deadlineRemindValue = normalizePositiveInteger(item.deadlineRemindValue);
  draft.deadlineRemindUnit = item.deadlineRemindUnit || 'MINUTE';
  showCreateForm.value = true;
}

function cancelTaskEdit() {
  editingTaskId.value = 0;
  resetTaskDraft();
}

function editRecurringRule(rule) {
  if (!rule) return;
  editingRecurringRuleId.value = Number(rule.ruleId) || 0;
  recurringDraft.title = rule.title || '';
  recurringDraft.projectId = rule.projectId ? String(rule.projectId) : '';
  recurringDraft.columnCode = rule.columnCode || enabledColumns.value[0]?.columnCode || 'todo';
  recurringDraft.detail = rule.detail || '';
  recurringDraft.cronExpr = rule.cronExpr || '';
  recurringDraft.timeZoneId = rule.timeZoneId || 'Asia/Shanghai';
  showRecurringPanel.value = true;
}

function cancelRecurringEdit() {
  editingRecurringRuleId.value = 0;
  recurringDraft.title = '';
  recurringDraft.projectId = '';
  recurringDraft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  recurringDraft.detail = '';
  recurringDraft.cronExpr = '0 0 9 * * *';
  recurringDraft.timeZoneId = 'Asia/Shanghai';
}

async function createRecurringRule() {
  if (!recurringDraft.title.trim() || !recurringDraft.cronExpr.trim()) return;
  errorText.value = '';
  recurringSaving.value = true;
  try {
    await auth.ensureReady();
    const targetColumn = enabledColumns.value.some((item) => item.columnCode === recurringDraft.columnCode)
      ? recurringDraft.columnCode
      : enabledColumns.value[0]?.columnCode || 'todo';
    const payload = {
      projectId: recurringDraft.projectId ? Number(recurringDraft.projectId) : null,
      columnCode: targetColumn,
      title: recurringDraft.title.trim(),
      detail: recurringDraft.detail.trim() || null,
      cronExpr: recurringDraft.cronExpr.trim(),
      timeZoneId: recurringDraft.timeZoneId.trim() || 'Asia/Shanghai',
      enabled: true
    };

    if (auth.isAuthenticated.value) {
      if (editingRecurringRuleId.value) {
        await updateLightAppTaskRecurringRule(editingRecurringRuleId.value, payload, auth.authorizedFetch);
      } else {
        await createLightAppTaskRecurringRule(payload, auth.authorizedFetch);
      }
      await refreshRemoteBoard();
    } else {
      const maxSort = taskRecurringRules.value.reduce((max, item) => Math.max(max, Number(item.sortNum) || 0), 0);
      persistGuest({
        taskRecurringRules: editingRecurringRuleId.value
          ? taskRecurringRules.value.map((item) =>
              item.ruleId === editingRecurringRuleId.value
                ? { ...item, ...payload, updatedAt: new Date().toISOString() }
                : item
            )
          : [
              ...taskRecurringRules.value,
              {
                ruleId: createLocalEntityId(),
                ...payload,
                sortNum: maxSort + 10,
                updatedAt: new Date().toISOString()
              }
            ]
      });
    }
    cancelRecurringEdit();
  } catch (error) {
    errorText.value = error?.message || '周期规则创建失败';
  } finally {
    recurringSaving.value = false;
  }
}

async function toggleRecurringRule(rule) {
  errorText.value = '';
  recurringSaving.value = true;
  try {
    await auth.ensureReady();
    const nextEnabled = !Boolean(rule.enabled);
    if (auth.isAuthenticated.value) {
      await updateLightAppTaskRecurringRule(
        rule.ruleId,
        buildTaskRecurringPayload(rule, { enabled: nextEnabled }),
        auth.authorizedFetch
      );
      await refreshRemoteBoard();
      return;
    }
    persistGuest({
      taskRecurringRules: taskRecurringRules.value.map((item) => (item.ruleId === rule.ruleId ? { ...item, enabled: nextEnabled } : item))
    });
  } catch (error) {
    errorText.value = error?.message || '周期规则更新失败';
  } finally {
    recurringSaving.value = false;
  }
}

async function removeRecurringRule(ruleId) {
  errorText.value = '';
  recurringSaving.value = true;
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppTaskRecurringRule(ruleId, auth.authorizedFetch);
      await refreshRemoteBoard();
      return;
    }
    persistGuest({
      taskRecurringRules: taskRecurringRules.value.filter((item) => item.ruleId !== ruleId)
    });
  } catch (error) {
    errorText.value = error?.message || '周期规则删除失败';
  } finally {
    recurringSaving.value = false;
  }
}

async function hydrate() {
  errorText.value = '';
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    tasks.value = normalizeTasks(guest.tasks || []);
    columns.value = normalizeColumns(guest.taskColumns || guest.task_columns || []);
    projects.value = Array.isArray(guest.projects) ? guest.projects : [];
    taskRecurringRules.value = normalizeRecurringRules(guest.taskRecurringRules || guest.task_recurring_rules || []);
    if (!columns.value.length) {
      columns.value = [
        { columnCode: 'todo', title: '待处理', sortNum: 10, enabled: true },
        { columnCode: 'doing', title: '进行中', sortNum: 20, enabled: true },
        { columnCode: 'done', title: '已完成', sortNum: 30, enabled: true }
      ];
    }
    cloneColumnDrafts();
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
    recurringDraft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
    return;
  }

  try {
    const [projectList, columnList, taskList, recurringList] = await Promise.all([
      listLightAppProjects(auth.authorizedFetch),
      listLightAppTaskColumns(auth.authorizedFetch),
      listLightAppTasks(auth.authorizedFetch),
      listLightAppTaskRecurringRules(auth.authorizedFetch)
    ]);
    projects.value = Array.isArray(projectList) ? projectList : [];
    columns.value = normalizeColumns(columnList);
    tasks.value = normalizeTasks(taskList);
    taskRecurringRules.value = normalizeRecurringRules(recurringList);
    writeRemoteLightAppCache({
      projects: projects.value,
      taskColumns: columns.value,
      tasks: tasks.value,
      taskRecurringRules: taskRecurringRules.value
    });
    cloneColumnDrafts();
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
    recurringDraft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  } catch (error) {
    const cache = readRemoteLightAppCache();
    projects.value = cache.projects || [];
    columns.value = normalizeColumns(cache.taskColumns || []);
    tasks.value = normalizeTasks(cache.tasks || []);
    taskRecurringRules.value = normalizeRecurringRules(cache.taskRecurringRules || []);
    cloneColumnDrafts();
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
    recurringDraft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
    errorText.value = error?.message || '看板加载失败，已回退缓存数据。';
  }
}

async function refreshRemoteBoard() {
  const [projectList, columnList, taskList, recurringList] = await Promise.all([
    listLightAppProjects(auth.authorizedFetch),
    listLightAppTaskColumns(auth.authorizedFetch),
    listLightAppTasks(auth.authorizedFetch),
    listLightAppTaskRecurringRules(auth.authorizedFetch)
  ]);
  projects.value = Array.isArray(projectList) ? projectList : [];
  columns.value = normalizeColumns(columnList);
  tasks.value = normalizeTasks(taskList);
  taskRecurringRules.value = normalizeRecurringRules(recurringList);
  writeRemoteLightAppCache({
    projects: projects.value,
    taskColumns: columns.value,
    tasks: tasks.value,
    taskRecurringRules: taskRecurringRules.value
  });
  cloneColumnDrafts();
  if (!enabledColumns.value.some((item) => item.columnCode === draft.columnCode)) {
    draft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  }
  if (!enabledColumns.value.some((item) => item.columnCode === recurringDraft.columnCode)) {
    recurringDraft.columnCode = enabledColumns.value[0]?.columnCode || 'todo';
  }
}

async function refreshProjectOptionsOnly() {
  await auth.ensureReady();
  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    projects.value = Array.isArray(guest.projects) ? guest.projects : [];
    return;
  }

  const projectList = await listLightAppProjects(auth.authorizedFetch);
  projects.value = Array.isArray(projectList) ? projectList : [];
  writeRemoteLightAppCache({
    projects: projects.value,
    taskColumns: columns.value,
    tasks: tasks.value,
    taskRecurringRules: taskRecurringRules.value
  });
}

async function createTaskItem() {
  const title = draft.title.trim();
  if (!title) return;

  errorText.value = '';
  saving.value = true;
  const targetColumn = enabledColumns.value.some((item) => item.columnCode === draft.columnCode)
    ? draft.columnCode
    : enabledColumns.value[0]?.columnCode || 'todo';
  const precision = (draft.timePrecision || 'MINUTE').toUpperCase();
  const parsedDueAt = parseTaskInputToIso(draft.dueAt, precision, { boundary: 'end' });
  const parsedRangeStartAt = parseTaskInputToIso(draft.rangeStartAt, precision, { boundary: 'start' });
  const timingMode = (draft.timingMode || 'DEADLINE').toUpperCase();

  try {
    await auth.ensureReady();
    const payload = {
      projectId: draft.projectId ? Number(draft.projectId) : null,
      title,
      detail: draft.detail.trim() || null,
      columnCode: targetColumn,
      dueAt: parsedDueAt || null,
      showOnCalendar: draft.showOnCalendar !== false,
      timePrecision: precision,
      timingMode,
      rangeStartAt: timingMode === 'RANGE' ? parsedRangeStartAt || null : null,
      reminderEnabled: Boolean(draft.reminderEnabled),
      startRemindValue: draft.reminderEnabled && timingMode === 'RANGE' ? normalizePositiveInteger(draft.startRemindValue) : null,
      startRemindUnit: draft.reminderEnabled && timingMode === 'RANGE' ? draft.startRemindUnit : null,
      deadlineRemindValue: draft.reminderEnabled ? normalizePositiveInteger(draft.deadlineRemindValue) : null,
      deadlineRemindUnit: draft.reminderEnabled ? draft.deadlineRemindUnit : null
    };

    if (auth.isAuthenticated.value) {
      if (editingTaskId.value) {
        const current = tasks.value.find((item) => item.taskId === editingTaskId.value);
        await updateLightAppTask(
          editingTaskId.value,
          {
            ...payload,
            sortNum: current?.sortNum ?? 0
          },
          auth.authorizedFetch
        );
      } else {
        await createLightAppTask(
          {
            ...payload,
            sortNum: nextSortForColumn(targetColumn)
          },
          auth.authorizedFetch
        );
      }
      await refreshRemoteBoard();
    } else {
      if (editingTaskId.value) {
        persistGuest({
          tasks: tasks.value.map((item) => {
            if (item.taskId !== editingTaskId.value) return item;
            return {
              ...item,
              ...payload,
              detail: payload.detail || '',
              dueAt: payload.dueAt || '',
              rangeStartAt: payload.rangeStartAt || '',
              updatedAt: new Date().toISOString()
            };
          })
        });
      } else {
        const nextId = createLocalEntityId();
        persistGuest({
          tasks: [
            ...tasks.value,
            {
              taskId: nextId,
              ...payload,
              detail: payload.detail || '',
              dueAt: payload.dueAt || '',
              rangeStartAt: payload.rangeStartAt || '',
              sortNum: nextSortForColumn(targetColumn),
              updatedAt: new Date().toISOString()
            }
          ]
        });
      }
    }
    cancelTaskEdit();
    showCreateForm.value = false;
  } catch (error) {
    errorText.value = error?.message || (editingTaskId.value ? '任务更新失败' : '任务创建失败');
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
  window.addEventListener(TIMEPRISM_FOCUS_ITEM_EVENT, handleFocusItemEvent);
});

onBeforeUnmount(() => {
  window.removeEventListener(TIMEPRISM_FOCUS_ITEM_EVENT, handleFocusItemEvent);
});

function handleFocusItemEvent(event) {
  const moduleCode = String(event?.detail?.moduleCode || '').trim().toLowerCase();
  if (moduleCode !== TIMEPRISM_MODULE_BOARD) return;
  const itemId = Number(event?.detail?.itemId) || 0;
  if (itemId <= 0) return;
  const target = tasks.value.find((item) => item.taskId === itemId);
  if (!target) return;
  startTaskEdit(target);
}

if (suiteContext?.projectVersion) {
  watch(
    () => suiteContext.projectVersion.value,
    async (current, previous) => {
      if (current === previous) return;
      try {
        await refreshProjectOptionsOnly();
      } catch {
        // keep current project snapshot
      }
    }
  );
}

watch(
  () => draft.timePrecision,
  (current, previous) => {
    if (!previous || current === previous) return;
    draft.dueAt = convertTaskInputValue(draft.dueAt, previous, current, { boundary: 'end' });
    draft.rangeStartAt = convertTaskInputValue(draft.rangeStartAt, previous, current, { boundary: 'start' });
  }
);
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
  min-width: 0;
}

.task-create {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(118px, 1fr));
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

.toggle-check {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-muted);
  border-radius: 10px;
  padding: 8px 10px;
  display: inline-flex;
  align-items: center;
  gap: 6px;
  min-height: 36px;
}

.recurring-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.recurring-panel header {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.recurring-panel header h4 {
  margin: 0;
  font-size: 13px;
}

.recurring-form {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 140px 130px minmax(0, 1fr) 150px;
  gap: 8px;
}

.recurring-form input,
.recurring-form select {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 8px 10px;
}

.recurring-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.recurring-list li {
  border: 1px solid var(--la-border);
  border-radius: 10px;
  background: rgba(var(--glass-rgb), 0.22);
  padding: 8px 10px;
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  gap: 10px;
  align-items: center;
}

.recurring-list p {
  margin: 0;
}

.recurring-list small {
  color: var(--la-muted);
}

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
  word-break: break-word;
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

.toolbar-btn {
  width: 32px;
  height: 32px;
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

@container lightapp-window-body (max-width: 860px) {
  .task-create {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .recurring-form {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .column-editor-list li {
    grid-template-columns: minmax(0, 1fr) minmax(0, 1fr) 86px auto;
  }

  .column-editor-list li button.icon-btn {
    width: 100%;
  }
}

@container lightapp-window-body (max-width: 560px) {
  .task-create,
  .column-editor-list li {
    grid-template-columns: 1fr;
  }

  .recurring-form {
    grid-template-columns: 1fr;
  }

  .column-editor header {
    flex-wrap: wrap;
    gap: 8px;
  }

  .card-actions {
    justify-content: flex-end;
  }
}

@container lightapp-window-body (max-height: 380px) {
  .lightapp-window {
    gap: 8px;
  }

  .column-card {
    padding: 8px;
  }
}

@media (max-width: 980px) {
  .task-create,
  .column-editor-list li {
    grid-template-columns: 1fr;
  }
}
</style>
