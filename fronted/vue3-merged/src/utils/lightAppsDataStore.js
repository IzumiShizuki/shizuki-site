const GUEST_DATA_KEY = 'shizuki.lightApps.guest.v1';
const REMOTE_CACHE_KEY = 'shizuki.lightApps.remoteCache.v1';

const DEFAULT_TASK_COLUMNS = Object.freeze([
  { columnCode: 'todo', title: '待处理', sortNum: 10, enabled: true },
  { columnCode: 'doing', title: '进行中', sortNum: 20, enabled: true },
  { columnCode: 'done', title: '已完成', sortNum: 30, enabled: true }
]);

function toObject(value) {
  return value && typeof value === 'object' && !Array.isArray(value) ? value : {};
}

function toArray(value) {
  return Array.isArray(value) ? value : [];
}

function toBoolean(value, fallback = false) {
  if (value === undefined || value === null) return fallback;
  return Boolean(value);
}

function toNumber(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : fallback;
}

function normalizeProjects(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.projectId ?? source.project_id);
      const name = String(source.name || '').trim();
      if (!id || !name) return null;
      return {
        projectId: id,
        projectCode: String(source.projectCode ?? source.project_code ?? '').trim(),
        name,
        description: String(source.description || '').trim(),
        color: String(source.color || '#6aa9ff').trim() || '#6aa9ff',
        archived: toBoolean(source.archived),
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.projectId - right.projectId);
}

function normalizeTodos(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.todoId ?? source.todo_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      return {
        todoId: id,
        projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
        title,
        detail: String(source.detail || '').trim(),
        priority: String(source.priority || 'MEDIUM').trim().toUpperCase() || 'MEDIUM',
        done: toBoolean(source.done),
        dueAt: source.dueAt || source.due_at || '',
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.todoId - right.todoId);
}

function normalizeTasks(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.taskId ?? source.task_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      return {
        taskId: id,
        projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
        columnCode: String(source.columnCode ?? source.column_code ?? 'todo').trim().toLowerCase() || 'todo',
        title,
        detail: String(source.detail || '').trim(),
        dueAt: source.dueAt || source.due_at || '',
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => {
      if (left.columnCode !== right.columnCode) return left.columnCode.localeCompare(right.columnCode);
      return left.sortNum - right.sortNum || left.taskId - right.taskId;
    });
}

function normalizeTaskColumns(raw) {
  const normalized = toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const columnCode = String(source.columnCode ?? source.column_code ?? '').trim().toLowerCase();
      if (!columnCode) return null;
      return {
        columnCode,
        title: String(source.title || '').trim() || columnCode,
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        enabled: toBoolean(source.enabled, true)
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.columnCode.localeCompare(right.columnCode));

  return normalized.length ? normalized : DEFAULT_TASK_COLUMNS.map((item) => ({ ...item }));
}

function normalizeSchedules(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.scheduleId ?? source.schedule_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      return {
        scheduleId: id,
        projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
        title,
        detail: String(source.detail || '').trim(),
        startAt: source.startAt || source.start_at || '',
        endAt: source.endAt || source.end_at || '',
        allDay: toBoolean(source.allDay ?? source.all_day),
        location: String(source.location || '').trim(),
        status: String(source.status || 'ACTIVE').trim().toUpperCase() || 'ACTIVE',
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => {
      const leftTime = Date.parse(left.startAt || '') || 0;
      const rightTime = Date.parse(right.startAt || '') || 0;
      return leftTime - rightTime || left.sortNum - right.sortNum || left.scheduleId - right.scheduleId;
    });
}

function normalizePomodoros(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.pomodoroId ?? source.pomodoro_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      const ringtoneType = String(source.ringtoneType ?? source.ringtone_type ?? 'BUILTIN').trim().toUpperCase() || 'BUILTIN';
      return {
        pomodoroId: id,
        title,
        focusMinutes: toNumber(source.focusMinutes ?? source.focus_minutes, 25),
        shortBreakMinutes: toNumber(source.shortBreakMinutes ?? source.short_break_minutes, 5),
        longBreakMinutes: toNumber(source.longBreakMinutes ?? source.long_break_minutes, 15),
        longBreakEvery: toNumber(source.longBreakEvery ?? source.long_break_every, 4),
        autoStartNext: toBoolean(source.autoStartNext ?? source.auto_start_next),
        ringtoneType: ringtoneType === 'UPLOAD' ? 'UPLOAD' : 'BUILTIN',
        ringtoneName: String(source.ringtoneName ?? source.ringtone_name ?? '').trim(),
        ringtoneCode: String(source.ringtoneCode ?? source.ringtone_code ?? '').trim(),
        ringtoneAssetId: toNumber(source.ringtoneAssetId ?? source.ringtone_asset_id, 0) || null,
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.pomodoroId - right.pomodoroId);
}

export function createEmptyLightAppDataStore() {
  return {
    projects: [],
    pomodoros: [],
    todos: [],
    tasks: [],
    taskColumns: DEFAULT_TASK_COLUMNS.map((item) => ({ ...item })),
    schedules: []
  };
}

export function normalizeLightAppDataStore(input) {
  const source = toObject(input);
  return {
    projects: normalizeProjects(source.projects),
    pomodoros: normalizePomodoros(source.pomodoros),
    todos: normalizeTodos(source.todos),
    tasks: normalizeTasks(source.tasks),
    taskColumns: normalizeTaskColumns(source.taskColumns || source.task_columns),
    schedules: normalizeSchedules(source.schedules)
  };
}

function readStorageJson(key) {
  if (typeof window === 'undefined') {
    return createEmptyLightAppDataStore();
  }
  try {
    const raw = window.localStorage.getItem(key);
    if (!raw) return createEmptyLightAppDataStore();
    return normalizeLightAppDataStore(JSON.parse(raw));
  } catch {
    return createEmptyLightAppDataStore();
  }
}

function writeStorageJson(key, data) {
  const normalized = normalizeLightAppDataStore(data);
  if (typeof window !== 'undefined') {
    try {
      window.localStorage.setItem(key, JSON.stringify(normalized));
    } catch {
      // ignore storage write errors
    }
  }
  return normalized;
}

export function createLocalEntityId() {
  return Date.now() + Math.floor(Math.random() * 1000);
}

export function readGuestLightAppData() {
  return readStorageJson(GUEST_DATA_KEY);
}

export function writeGuestLightAppData(data) {
  return writeStorageJson(GUEST_DATA_KEY, data);
}

export function updateGuestLightAppData(mutator) {
  const current = readGuestLightAppData();
  const next = typeof mutator === 'function' ? mutator(current) : current;
  return writeGuestLightAppData(next);
}

export function readRemoteLightAppCache() {
  return readStorageJson(REMOTE_CACHE_KEY);
}

export function writeRemoteLightAppCache(partial) {
  const current = readRemoteLightAppCache();
  const source = toObject(partial);
  const merged = {
    ...current,
    ...source
  };
  return writeStorageJson(REMOTE_CACHE_KEY, merged);
}
