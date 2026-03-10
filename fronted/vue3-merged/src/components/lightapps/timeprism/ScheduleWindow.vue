<template>
  <section class="lightapp-window">
    <div class="top-toolbar">
      <button
        class="icon-btn toolbar-btn ripple-trigger"
        type="button"
        :title="showCreateForm ? '收起添加区' : '添加日程'"
        :aria-label="showCreateForm ? '收起添加区' : '添加日程'"
        @click="toggleCreateForm"
      >
        <i :class="showCreateForm ? 'fas fa-chevron-up' : 'fas fa-plus'" aria-hidden="true"></i>
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
    </div>

    <Transition name="panel-collapse">
      <form v-if="showCreateForm" class="event-create" @submit.prevent="createScheduleItem">
        <input v-model.trim="draft.title" type="text" placeholder="新增日程，例如：周会复盘" />
        <select v-model="draft.projectId">
          <option value="">无项目</option>
          <option v-for="item in projects" :key="item.projectId" :value="String(item.projectId)">
            {{ item.name }}
          </option>
        </select>
        <input v-model="draft.startAt" type="datetime-local" />
        <input v-model="draft.endAt" type="datetime-local" />
        <label class="all-day-check"><input v-model="draft.allDay" type="checkbox" /> 全天</label>
        <button
          class="icon-btn ripple-trigger"
          type="submit"
          :title="saving ? '添加中' : '添加日程'"
          :aria-label="saving ? '添加中' : '添加日程'"
          :disabled="saving || !draft.title.trim() || !draft.startAt"
        >
          <i :class="saving ? 'fas fa-spinner fa-spin' : 'fas fa-check'" aria-hidden="true"></i>
        </button>
      </form>
    </Transition>

    <Transition name="panel-collapse">
      <section v-if="showRecurringPanel" class="recurring-panel liquid-material">
        <header>
          <h4>Schedule 周期规则</h4>
          <button
            class="icon-btn ripple-trigger"
            type="button"
            :title="recurringSaving ? '保存中' : '新增规则'"
            :aria-label="recurringSaving ? '保存中' : '新增规则'"
            :disabled="recurringSaving || !recurringDraft.title.trim() || !recurringDraft.cronExpr.trim()"
            @click="createRecurringRule"
          >
            <i :class="recurringSaving ? 'fas fa-spinner fa-spin' : 'fas fa-plus'" aria-hidden="true"></i>
          </button>
        </header>
        <div class="recurring-form">
          <input v-model.trim="recurringDraft.title" type="text" placeholder="规则标题，例如：每日晨会" />
          <select v-model="recurringDraft.projectId">
            <option value="">无项目</option>
            <option v-for="item in projects" :key="`schedule_rule_project_${item.projectId}`" :value="String(item.projectId)">
              {{ item.name }}
            </option>
          </select>
          <input v-model.number="recurringDraft.durationMinutes" type="number" min="1" max="1440" placeholder="时长(分钟)" />
          <input v-model.trim="recurringDraft.cronExpr" type="text" placeholder="Cron，例如：0 0 10 * * *" />
          <input v-model.trim="recurringDraft.timeZoneId" type="text" placeholder="时区，例如：Asia/Shanghai" />
          <label class="all-day-check"><input v-model="recurringDraft.allDay" type="checkbox" /> 全天</label>
        </div>
        <ul v-if="scheduleRecurringRules.length" class="recurring-list">
          <li v-for="rule in scheduleRecurringRules" :key="`schedule_rule_${rule.ruleId}`">
            <div>
              <p>{{ rule.title }}</p>
              <small>{{ rule.cronExpr }} · {{ rule.timeZoneId }} · {{ rule.durationMinutes }} 分钟</small>
            </div>
            <div class="event-actions">
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
      </section>
    </Transition>

    <p v-if="errorText" class="error-text">{{ errorText }}</p>

    <section class="upcoming-panel liquid-material">
      <header>
        <h4>近期 {{ upcomingDays }} 天</h4>
        <button class="icon-btn ripple-trigger" type="button" title="刷新近期日程" aria-label="刷新近期日程" @click="reloadUpcoming">
          <i class="fas fa-rotate-right" aria-hidden="true"></i>
        </button>
      </header>
      <ul v-if="upcomingItems.length" class="upcoming-list">
        <li v-for="item in upcomingItems" :key="`upcoming_${item.scheduleId}`">
          <p>{{ item.title }}</p>
          <small>{{ formatRange(item.startAt, item.endAt) }}</small>
        </li>
      </ul>
      <p v-else class="empty-hint">近期暂无日程</p>
    </section>

    <ul v-if="schedules.length" class="event-list">
      <li v-for="item in schedules" :key="item.scheduleId" class="event-item" :class="eventClass(item)">
        <div class="event-main">
          <p>{{ item.title }}</p>
          <small>
            {{ formatRange(item.startAt, item.endAt) }}
            <template v-if="item.projectId"> · {{ projectName(item.projectId) }}</template>
          </small>
        </div>
        <div class="event-actions">
          <button class="icon-btn ripple-trigger" :title="item.status === 'ACTIVE' ? '取消日程' : '恢复日程'" @click="toggleStatus(item)">
            <i :class="item.status === 'ACTIVE' ? 'fas fa-ban' : 'fas fa-check'"></i>
          </button>
          <button class="icon-btn ripple-trigger" title="删除" @click="removeSchedule(item.scheduleId)">
            <i class="fas fa-trash"></i>
          </button>
        </div>
      </li>
    </ul>
    <p v-else class="empty-hint">暂无日程，先规划今天要做的事。</p>
  </section>
</template>

<script setup>
import { computed, inject, onMounted, reactive, ref, watch } from 'vue';
import { useAuthSession } from '../../../composables/useAuthSession';
import {
  createLightAppSchedule,
  createLightAppScheduleRecurringRule,
  deleteLightAppSchedule,
  deleteLightAppScheduleRecurringRule,
  listLightAppProjects,
  listLightAppScheduleRecurringRules,
  listLightAppSchedules,
  listUpcomingLightAppSchedules,
  updateLightAppSchedule,
  updateLightAppScheduleRecurringRule
} from '../../../services/lightAppsApi';
import {
  createLocalEntityId,
  readGuestLightAppData,
  readRemoteLightAppCache,
  updateGuestLightAppData,
  writeRemoteLightAppCache
} from '../../../utils/lightAppsDataStore';
import { TIMEPRISM_SUITE_CONTEXT_KEY } from './timePrismSuiteState';

const auth = useAuthSession();
const suiteContext = inject(TIMEPRISM_SUITE_CONTEXT_KEY, null);

const schedules = ref([]);
const projects = ref([]);
const upcomingItems = ref([]);
const saving = ref(false);
const recurringSaving = ref(false);
const errorText = ref('');
const upcomingDays = 7;
const showCreateForm = ref(false);
const showRecurringPanel = ref(false);
const scheduleRecurringRules = ref([]);

const draft = reactive({
  title: '',
  projectId: '',
  startAt: '',
  endAt: '',
  allDay: false
});

const recurringDraft = reactive({
  title: '',
  projectId: '',
  detail: '',
  durationMinutes: 60,
  allDay: false,
  location: '',
  status: 'ACTIVE',
  cronExpr: '0 0 10 * * *',
  timeZoneId: 'Asia/Shanghai'
});

function toggleCreateForm() {
  showCreateForm.value = !showCreateForm.value;
}

function toggleRecurringPanel() {
  showRecurringPanel.value = !showRecurringPanel.value;
}

function normalizeRecurringRules(input) {
  return (Array.isArray(input) ? input : [])
    .map((item) => ({
      ruleId: Number(item.ruleId ?? item.rule_id) || 0,
      projectId: Number(item.projectId ?? item.project_id) || null,
      title: String(item.title || '').trim(),
      detail: String(item.detail || '').trim(),
      durationMinutes: Number(item.durationMinutes ?? item.duration_minutes) || 60,
      allDay: Boolean(item.allDay ?? item.all_day),
      location: String(item.location || '').trim(),
      status: String(item.status || 'ACTIVE').trim().toUpperCase() || 'ACTIVE',
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

function buildScheduleRecurringPayload(item, overrides = {}) {
  return {
    projectId: overrides.projectId ?? item.projectId ?? null,
    title: overrides.title ?? item.title,
    detail: overrides.detail ?? (item.detail || null),
    durationMinutes: overrides.durationMinutes ?? item.durationMinutes ?? 60,
    allDay: overrides.allDay ?? Boolean(item.allDay),
    location: overrides.location ?? (item.location || null),
    status: overrides.status ?? (item.status || 'ACTIVE'),
    cronExpr: overrides.cronExpr ?? item.cronExpr,
    timeZoneId: overrides.timeZoneId ?? (item.timeZoneId || 'Asia/Shanghai'),
    startAt: overrides.startAt ?? (item.startAt || null),
    endAt: overrides.endAt ?? (item.endAt || null),
    enabled: overrides.enabled ?? Boolean(item.enabled),
    sortNum: overrides.sortNum ?? item.sortNum ?? 0
  };
}

function parseIso(input) {
  const raw = String(input || '').trim();
  if (!raw) return '';
  const ts = Date.parse(raw);
  if (!Number.isFinite(ts)) return '';
  return new Date(ts).toISOString();
}

function sortSchedules(items) {
  return (items || [])
    .slice()
    .sort((left, right) => {
      const leftTime = Date.parse(left.startAt || '') || 0;
      const rightTime = Date.parse(right.startAt || '') || 0;
      return leftTime - rightTime || left.sortNum - right.sortNum || left.scheduleId - right.scheduleId;
    });
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

function formatRange(startAt, endAt) {
  if (!startAt) return '';
  if (!endAt) return formatDateTime(startAt);
  return `${formatDateTime(startAt)} - ${formatDateTime(endAt)}`;
}

function eventClass(item) {
  if (item.status !== 'ACTIVE') return 'is-cancelled';
  const now = Date.now();
  const start = Date.parse(item.startAt || '') || 0;
  const end = Date.parse(item.endAt || item.startAt || '') || start;
  if (start <= now && now <= end) return 'is-live';
  if (end < now) return 'is-past';
  return 'is-upcoming';
}

function schedulePayload(item, overrides = {}) {
  return {
    projectId: overrides.projectId ?? item.projectId ?? null,
    title: overrides.title ?? item.title,
    detail: overrides.detail ?? (item.detail || null),
    startAt: overrides.startAt ?? item.startAt,
    endAt: overrides.endAt ?? (item.endAt || null),
    allDay: overrides.allDay ?? Boolean(item.allDay),
    location: overrides.location ?? (item.location || null),
    status: overrides.status ?? (item.status || 'ACTIVE'),
    sortNum: overrides.sortNum ?? item.sortNum ?? 0
  };
}

function computeGuestUpcoming(list) {
  const now = Date.now();
  const maxTime = now + upcomingDays * 24 * 60 * 60 * 1000;
  return sortSchedules(list).filter((item) => {
    const start = Date.parse(item.startAt || '');
    if (!Number.isFinite(start)) return false;
    return start >= now && start < maxTime && item.status === 'ACTIVE';
  });
}

function persistGuestSchedules(nextSchedules, nextRules = scheduleRecurringRules.value) {
  const normalized = sortSchedules(nextSchedules || []);
  schedules.value = normalized;
  upcomingItems.value = computeGuestUpcoming(normalized);
  scheduleRecurringRules.value = normalizeRecurringRules(nextRules);
  updateGuestLightAppData((current) => ({
    ...current,
    schedules: normalized,
    scheduleRecurringRules: scheduleRecurringRules.value
  }));
}

async function hydrate() {
  errorText.value = '';
  await auth.ensureReady();

  if (!auth.isAuthenticated.value) {
    const guest = readGuestLightAppData();
    projects.value = Array.isArray(guest.projects) ? guest.projects : [];
    schedules.value = sortSchedules(guest.schedules || []);
    upcomingItems.value = computeGuestUpcoming(schedules.value);
    scheduleRecurringRules.value = normalizeRecurringRules(guest.scheduleRecurringRules || guest.schedule_recurring_rules || []);
    return;
  }

  try {
    const [projectList, scheduleList, upcomingList, recurringList] = await Promise.all([
      listLightAppProjects(auth.authorizedFetch),
      listLightAppSchedules(auth.authorizedFetch),
      listUpcomingLightAppSchedules(upcomingDays, auth.authorizedFetch),
      listLightAppScheduleRecurringRules(auth.authorizedFetch)
    ]);
    projects.value = Array.isArray(projectList) ? projectList : [];
    schedules.value = sortSchedules(Array.isArray(scheduleList) ? scheduleList : []);
    upcomingItems.value = sortSchedules(Array.isArray(upcomingList) ? upcomingList : []);
    scheduleRecurringRules.value = normalizeRecurringRules(recurringList);
    writeRemoteLightAppCache({
      projects: projects.value,
      schedules: schedules.value,
      scheduleRecurringRules: scheduleRecurringRules.value
    });
  } catch (error) {
    const cache = readRemoteLightAppCache();
    projects.value = cache.projects || [];
    schedules.value = sortSchedules(cache.schedules || []);
    upcomingItems.value = computeGuestUpcoming(schedules.value);
    scheduleRecurringRules.value = normalizeRecurringRules(cache.scheduleRecurringRules || []);
    errorText.value = error?.message || '日程加载失败，已回退缓存数据。';
  }
}

async function refreshRemoteSchedules() {
  const [projectList, scheduleList, upcomingList, recurringList] = await Promise.all([
    listLightAppProjects(auth.authorizedFetch),
    listLightAppSchedules(auth.authorizedFetch),
    listUpcomingLightAppSchedules(upcomingDays, auth.authorizedFetch),
    listLightAppScheduleRecurringRules(auth.authorizedFetch)
  ]);
  projects.value = Array.isArray(projectList) ? projectList : [];
  schedules.value = sortSchedules(Array.isArray(scheduleList) ? scheduleList : []);
  upcomingItems.value = sortSchedules(Array.isArray(upcomingList) ? upcomingList : []);
  scheduleRecurringRules.value = normalizeRecurringRules(recurringList);
  writeRemoteLightAppCache({
    projects: projects.value,
    schedules: schedules.value,
    scheduleRecurringRules: scheduleRecurringRules.value
  });
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
    schedules: schedules.value,
    scheduleRecurringRules: scheduleRecurringRules.value
  });
}

async function reloadUpcoming() {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      const list = await listUpcomingLightAppSchedules(upcomingDays, auth.authorizedFetch);
      upcomingItems.value = sortSchedules(Array.isArray(list) ? list : []);
      return;
    }
    upcomingItems.value = computeGuestUpcoming(schedules.value);
  } catch (error) {
    errorText.value = error?.message || '近期日程刷新失败';
  }
}

async function createScheduleItem() {
  const title = draft.title.trim();
  const startAt = parseIso(draft.startAt);
  if (!title || !startAt) return;

  const endAt = parseIso(draft.endAt);

  errorText.value = '';
  saving.value = true;

  try {
    await auth.ensureReady();

    if (auth.isAuthenticated.value) {
      await createLightAppSchedule(
        {
          projectId: draft.projectId ? Number(draft.projectId) : null,
          title,
          startAt,
          endAt: endAt || null,
          allDay: draft.allDay,
          status: 'ACTIVE'
        },
        auth.authorizedFetch
      );
      await refreshRemoteSchedules();
    } else {
      const nextId = createLocalEntityId();
      const maxSort = schedules.value.reduce((max, item) => Math.max(max, Number(item.sortNum) || 0), 0);
      persistGuestSchedules([
        ...schedules.value,
        {
          scheduleId: nextId,
          projectId: draft.projectId ? Number(draft.projectId) : null,
          title,
          detail: '',
          startAt,
          endAt: endAt || '',
          allDay: Boolean(draft.allDay),
          location: '',
          status: 'ACTIVE',
          sortNum: maxSort + 10,
          updatedAt: new Date().toISOString()
        }
      ]);
    }

    draft.title = '';
    draft.startAt = '';
    draft.endAt = '';
    draft.allDay = false;
    showCreateForm.value = false;
  } catch (error) {
    errorText.value = error?.message || '日程创建失败';
  } finally {
    saving.value = false;
  }
}

async function toggleStatus(item) {
  errorText.value = '';
  const nextStatus = item.status === 'ACTIVE' ? 'CANCELLED' : 'ACTIVE';

  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await updateLightAppSchedule(item.scheduleId, schedulePayload(item, { status: nextStatus }), auth.authorizedFetch);
      await refreshRemoteSchedules();
      return;
    }

    persistGuestSchedules(
      schedules.value.map((row) => {
        if (row.scheduleId !== item.scheduleId) return row;
        return {
          ...row,
          status: nextStatus
        };
      })
    );
  } catch (error) {
    errorText.value = error?.message || '日程状态更新失败';
  }
}

async function removeSchedule(scheduleId) {
  errorText.value = '';
  try {
    await auth.ensureReady();
    if (auth.isAuthenticated.value) {
      await deleteLightAppSchedule(scheduleId, auth.authorizedFetch);
      await refreshRemoteSchedules();
      return;
    }

    persistGuestSchedules(schedules.value.filter((item) => item.scheduleId !== scheduleId));
  } catch (error) {
    errorText.value = error?.message || '日程删除失败';
  }
}

async function createRecurringRule() {
  if (!recurringDraft.title.trim() || !recurringDraft.cronExpr.trim()) return;
  errorText.value = '';
  recurringSaving.value = true;
  try {
    await auth.ensureReady();
    const payload = {
      projectId: recurringDraft.projectId ? Number(recurringDraft.projectId) : null,
      title: recurringDraft.title.trim(),
      detail: recurringDraft.detail.trim() || null,
      durationMinutes: Math.max(1, Number(recurringDraft.durationMinutes) || 60),
      allDay: Boolean(recurringDraft.allDay),
      location: recurringDraft.location.trim() || null,
      status: recurringDraft.status || 'ACTIVE',
      cronExpr: recurringDraft.cronExpr.trim(),
      timeZoneId: recurringDraft.timeZoneId.trim() || 'Asia/Shanghai',
      enabled: true
    };

    if (auth.isAuthenticated.value) {
      await createLightAppScheduleRecurringRule(payload, auth.authorizedFetch);
      await refreshRemoteSchedules();
    } else {
      const nextId = createLocalEntityId();
      const maxSort = scheduleRecurringRules.value.reduce((max, item) => Math.max(max, Number(item.sortNum) || 0), 0);
      persistGuestSchedules(schedules.value, [
        ...scheduleRecurringRules.value,
        {
          ruleId: nextId,
          ...payload,
          sortNum: maxSort + 10,
          updatedAt: new Date().toISOString()
        }
      ]);
    }

    recurringDraft.title = '';
    recurringDraft.projectId = '';
    recurringDraft.detail = '';
    recurringDraft.durationMinutes = 60;
    recurringDraft.allDay = false;
    recurringDraft.location = '';
    recurringDraft.status = 'ACTIVE';
    recurringDraft.cronExpr = '0 0 10 * * *';
    recurringDraft.timeZoneId = 'Asia/Shanghai';
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
      await updateLightAppScheduleRecurringRule(
        rule.ruleId,
        buildScheduleRecurringPayload(rule, { enabled: nextEnabled }),
        auth.authorizedFetch
      );
      await refreshRemoteSchedules();
      return;
    }
    persistGuestSchedules(
      schedules.value,
      scheduleRecurringRules.value.map((item) => (item.ruleId === rule.ruleId ? { ...item, enabled: nextEnabled } : item))
    );
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
      await deleteLightAppScheduleRecurringRule(ruleId, auth.authorizedFetch);
      await refreshRemoteSchedules();
      return;
    }
    persistGuestSchedules(
      schedules.value,
      scheduleRecurringRules.value.filter((item) => item.ruleId !== ruleId)
    );
  } catch (error) {
    errorText.value = error?.message || '周期规则删除失败';
  } finally {
    recurringSaving.value = false;
  }
}

onMounted(() => {
  hydrate();
});

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
</script>

<style scoped>
.lightapp-window {
  --la-border: rgba(255, 255, 255, 0.44);
  --la-input-bg: rgba(var(--glass-rgb), 0.32);
  --la-btn-bg: rgba(var(--glass-rgb), 0.3);
  --la-panel-bg: rgba(var(--glass-rgb), 0.28);
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

.event-create {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 132px repeat(2, 176px) 78px 72px;
  gap: 8px;
}

.event-create input,
.event-create select {
  border: 1px solid var(--la-border);
  background: var(--la-input-bg);
  color: var(--la-text);
  border-radius: 10px;
  padding: 8px 10px;
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
  justify-content: space-between;
  align-items: center;
}

.recurring-panel h4 {
  margin: 0;
  font-size: 13px;
}

.recurring-form {
  display: grid;
  grid-template-columns: minmax(0, 1fr) 132px 120px minmax(0, 1fr) 150px auto;
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

.all-day-check {
  display: inline-flex;
  align-items: center;
  gap: 6px;
  font-size: 12px;
  color: var(--la-muted);
}

.icon-btn {
  border: 1px solid var(--la-border);
  background: var(--la-btn-bg);
  color: var(--la-text);
  border-radius: 10px;
}

.upcoming-panel {
  --liquid-bg: var(--la-panel-bg);
  --liquid-border: var(--la-border);
  border-radius: 12px;
  padding: 10px;
  display: grid;
  gap: 8px;
}

.upcoming-panel header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.upcoming-panel h4 {
  margin: 0;
}

.upcoming-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 6px;
}

.upcoming-list p {
  margin: 0;
}

.upcoming-list small {
  color: var(--la-muted);
}

.event-list {
  list-style: none;
  margin: 0;
  padding: 0;
  display: grid;
  gap: 8px;
}

.event-item {
  display: grid;
  grid-template-columns: minmax(0, 1fr) auto;
  align-items: center;
  gap: 10px;
  border-radius: 12px;
  border: 1px solid var(--la-border);
  background: var(--la-card-bg);
  padding: 10px 12px;
}

.event-item.is-live {
  border-color: rgba(90, 224, 177, 0.66);
}

.event-item.is-past {
  opacity: 0.68;
}

.event-item.is-cancelled {
  opacity: 0.48;
}

.event-main p {
  margin: 0;
  word-break: break-word;
}

.event-main small {
  color: var(--la-muted);
}

.event-actions {
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

.error-text {
  margin: 0;
  color: var(--la-danger);
  font-size: 12px;
}

.empty-hint {
  margin: 0;
  text-align: center;
  color: var(--la-muted);
  padding: 10px 0;
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

@container lightapp-window-body (max-width: 940px) {
  .event-create {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .recurring-form {
    grid-template-columns: repeat(2, minmax(0, 1fr));
  }

  .upcoming-panel header {
    flex-wrap: wrap;
    gap: 8px;
  }
}

@container lightapp-window-body (max-width: 560px) {
  .event-create {
    grid-template-columns: 1fr;
  }

  .recurring-form {
    grid-template-columns: 1fr;
  }

  .event-item {
    grid-template-columns: 1fr;
    align-items: start;
  }

  .event-actions {
    justify-content: flex-end;
  }
}

@container lightapp-window-body (max-height: 380px) {
  .lightapp-window {
    gap: 8px;
  }

  .event-item {
    padding: 8px 10px;
  }
}

@media (max-width: 980px) {
  .event-create {
    grid-template-columns: 1fr;
  }
}
</style>
