import { normalizeApiData } from './httpClient';

function ensureAuthorizedFetch(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required for light apps api');
  }
}

function unwrap(response) {
  const data = normalizeApiData(response);
  return data === null || data === undefined ? response : data;
}

function toObject(value) {
  return value && typeof value === 'object' && !Array.isArray(value) ? value : {};
}

function toNumber(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : fallback;
}

function toBoolean(value, fallback = false) {
  if (value === undefined || value === null) return fallback;
  return Boolean(value);
}

function toText(value, fallback = '') {
  const normalized = String(value ?? fallback).trim();
  return normalized || fallback;
}

function normalizeList(raw, itemMapper, idKey) {
  if (!Array.isArray(raw)) return [];
  return raw
    .map((item) => itemMapper(item))
    .filter((item) => (idKey ? toNumber(item?.[idKey], 0) > 0 : true));
}

function normalizeProject(raw) {
  const source = toObject(raw);
  return {
    projectId: toNumber(source.projectId ?? source.project_id, 0),
    projectCode: toText(source.projectCode ?? source.project_code, ''),
    name: toText(source.name, ''),
    description: toText(source.description, ''),
    color: toText(source.color, '#6aa9ff') || '#6aa9ff',
    archived: toBoolean(source.archived, false),
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeTodo(raw) {
  const source = toObject(raw);
  return {
    todoId: toNumber(source.todoId ?? source.todo_id, 0),
    projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
    title: toText(source.title, ''),
    detail: toText(source.detail, ''),
    priority: toText(source.priority, 'MEDIUM').toUpperCase() || 'MEDIUM',
    done: toBoolean(source.done, false),
    dueAt: source.dueAt || source.due_at || '',
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeTask(raw) {
  const source = toObject(raw);
  return {
    taskId: toNumber(source.taskId ?? source.task_id, 0),
    projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
    columnCode: toText(source.columnCode ?? source.column_code, 'todo').toLowerCase() || 'todo',
    title: toText(source.title, ''),
    detail: toText(source.detail, ''),
    dueAt: source.dueAt || source.due_at || '',
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeTaskColumn(raw) {
  const source = toObject(raw);
  return {
    columnCode: toText(source.columnCode ?? source.column_code, '').toLowerCase(),
    title: toText(source.title, ''),
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    enabled: toBoolean(source.enabled, true)
  };
}

function normalizeSchedule(raw) {
  const source = toObject(raw);
  return {
    scheduleId: toNumber(source.scheduleId ?? source.schedule_id, 0),
    projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
    title: toText(source.title, ''),
    detail: toText(source.detail, ''),
    startAt: source.startAt || source.start_at || '',
    endAt: source.endAt || source.end_at || '',
    allDay: toBoolean(source.allDay ?? source.all_day, false),
    location: toText(source.location, ''),
    status: toText(source.status, 'ACTIVE').toUpperCase() || 'ACTIVE',
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizePomodoro(raw) {
  const source = toObject(raw);
  return {
    pomodoroId: toNumber(source.pomodoroId ?? source.pomodoro_id, 0),
    title: toText(source.title, ''),
    focusMinutes: toNumber(source.focusMinutes ?? source.focus_minutes, 25),
    shortBreakMinutes: toNumber(source.shortBreakMinutes ?? source.short_break_minutes, 5),
    longBreakMinutes: toNumber(source.longBreakMinutes ?? source.long_break_minutes, 15),
    longBreakEvery: toNumber(source.longBreakEvery ?? source.long_break_every, 4),
    autoStartNext: toBoolean(source.autoStartNext ?? source.auto_start_next, false),
    ringtoneType: toText(source.ringtoneType ?? source.ringtone_type, 'BUILTIN').toUpperCase() || 'BUILTIN',
    ringtoneName: toText(source.ringtoneName ?? source.ringtone_name, ''),
    ringtoneCode: toText(source.ringtoneCode ?? source.ringtone_code, ''),
    ringtoneAssetId: toNumber(source.ringtoneAssetId ?? source.ringtone_asset_id, 0) || null,
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

export async function listLightAppProjects(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/projects', { method: 'GET' }));
  return normalizeList(raw, normalizeProject, 'projectId');
}

export async function createLightAppProject(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/projects', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeProject(raw);
}

export async function updateLightAppProject(projectId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/projects/${encodeURIComponent(projectId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeProject(raw);
}

export async function deleteLightAppProject(projectId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/projects/${encodeURIComponent(projectId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppPomodoros(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/pomodoros', { method: 'GET' }));
  return normalizeList(raw, normalizePomodoro, 'pomodoroId');
}

export async function createLightAppPomodoro(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/pomodoros', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizePomodoro(raw);
}

export async function updateLightAppPomodoro(pomodoroId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/pomodoros/${encodeURIComponent(pomodoroId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizePomodoro(raw);
}

export async function deleteLightAppPomodoro(pomodoroId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/pomodoros/${encodeURIComponent(pomodoroId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppTodos(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/todos', { method: 'GET' }));
  return normalizeList(raw, normalizeTodo, 'todoId');
}

export async function createLightAppTodo(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/todos', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeTodo(raw);
}

export async function updateLightAppTodo(todoId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/todos/${encodeURIComponent(todoId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeTodo(raw);
}

export async function deleteLightAppTodo(todoId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/todos/${encodeURIComponent(todoId)}`, {
      method: 'DELETE'
    })
  );
}

export async function reorderLightAppTodos(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/todos/reorder', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeList(raw, normalizeTodo, 'todoId');
}

export async function listLightAppTasks(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/tasks', { method: 'GET' }));
  return normalizeList(raw, normalizeTask, 'taskId');
}

export async function createLightAppTask(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/tasks', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeTask(raw);
}

export async function updateLightAppTask(taskId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/tasks/${encodeURIComponent(taskId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeTask(raw);
}

export async function deleteLightAppTask(taskId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/tasks/${encodeURIComponent(taskId)}`, {
      method: 'DELETE'
    })
  );
}

export async function moveLightAppTask(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/tasks/move', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeTask(raw);
}

export async function listLightAppTaskColumns(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/task-columns', { method: 'GET' }));
  return normalizeList(raw, normalizeTaskColumn).filter((item) => item.columnCode);
}

export async function updateLightAppTaskColumns(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/task-columns', {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeList(raw, normalizeTaskColumn);
}

export async function listLightAppSchedules(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/schedules', { method: 'GET' }));
  return normalizeList(raw, normalizeSchedule, 'scheduleId');
}

export async function createLightAppSchedule(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/schedules', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeSchedule(raw);
}

export async function updateLightAppSchedule(scheduleId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/schedules/${encodeURIComponent(scheduleId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeSchedule(raw);
}

export async function deleteLightAppSchedule(scheduleId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/schedules/${encodeURIComponent(scheduleId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listUpcomingLightAppSchedules(days, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const queryDays = Number(days);
  const query = Number.isFinite(queryDays) && queryDays > 0 ? { days: queryDays } : undefined;
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/schedules/upcoming', {
      method: 'GET',
      query
    })
  );
  return normalizeList(raw, normalizeSchedule, 'scheduleId');
}
