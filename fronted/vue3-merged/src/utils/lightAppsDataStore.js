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

function normalizeTodoRecurringRules(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.ruleId ?? source.rule_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      return {
        ruleId: id,
        projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
        title,
        detail: String(source.detail || '').trim(),
        priority: String(source.priority || 'MEDIUM').trim().toUpperCase() || 'MEDIUM',
        cronExpr: String(source.cronExpr ?? source.cron_expr ?? '').trim(),
        timeZoneId: String(source.timeZoneId ?? source.time_zone_id ?? 'Asia/Shanghai').trim() || 'Asia/Shanghai',
        startAt: source.startAt || source.start_at || '',
        endAt: source.endAt || source.end_at || '',
        enabled: toBoolean(source.enabled, true),
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.ruleId - right.ruleId);
}

function normalizeTaskRecurringRules(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.ruleId ?? source.rule_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      return {
        ruleId: id,
        projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
        columnCode: String(source.columnCode ?? source.column_code ?? 'todo').trim().toLowerCase() || 'todo',
        title,
        detail: String(source.detail || '').trim(),
        cronExpr: String(source.cronExpr ?? source.cron_expr ?? '').trim(),
        timeZoneId: String(source.timeZoneId ?? source.time_zone_id ?? 'Asia/Shanghai').trim() || 'Asia/Shanghai',
        startAt: source.startAt || source.start_at || '',
        endAt: source.endAt || source.end_at || '',
        enabled: toBoolean(source.enabled, true),
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.ruleId - right.ruleId);
}

function normalizeScheduleRecurringRules(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.ruleId ?? source.rule_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      return {
        ruleId: id,
        projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
        title,
        detail: String(source.detail || '').trim(),
        durationMinutes: toNumber(source.durationMinutes ?? source.duration_minutes, 60),
        allDay: toBoolean(source.allDay ?? source.all_day, false),
        location: String(source.location || '').trim(),
        status: String(source.status || 'ACTIVE').trim().toUpperCase() || 'ACTIVE',
        cronExpr: String(source.cronExpr ?? source.cron_expr ?? '').trim(),
        timeZoneId: String(source.timeZoneId ?? source.time_zone_id ?? 'Asia/Shanghai').trim() || 'Asia/Shanghai',
        startAt: source.startAt || source.start_at || '',
        endAt: source.endAt || source.end_at || '',
        enabled: toBoolean(source.enabled, true),
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.ruleId - right.ruleId);
}

function normalizeBalanceAccounts(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.accountId ?? source.account_id);
      const accountName = String(source.accountName ?? source.account_name ?? '').trim();
      if (!id || !accountName) return null;
      return {
        accountId: id,
        channelCode: String(source.channelCode ?? source.channel_code ?? '').trim(),
        channelName: String(source.channelName ?? source.channel_name ?? '').trim(),
        accountName,
        currencyCode: String(source.currencyCode ?? source.currency_code ?? 'CNY').trim().toUpperCase() || 'CNY',
        balanceAmount: toNumber(source.balanceAmount ?? source.balance_amount, 0),
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.accountId - right.accountId);
}

function normalizeBalanceTransactions(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.transactionId ?? source.transaction_id);
      if (!id) return null;
      return {
        transactionId: id,
        accountId: toNumber(source.accountId ?? source.account_id, 0) || null,
        direction: String(source.direction || 'EXPENSE').trim().toUpperCase() || 'EXPENSE',
        amount: toNumber(source.amount, 0),
        currencyCode: String(source.currencyCode ?? source.currency_code ?? 'CNY').trim().toUpperCase() || 'CNY',
        category: String(source.category || '').trim(),
        note: String(source.note || '').trim(),
        occurredAt: source.occurredAt || source.occurred_at || '',
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => {
      const leftTime = Date.parse(left.occurredAt || '') || 0;
      const rightTime = Date.parse(right.occurredAt || '') || 0;
      return rightTime - leftTime || right.sortNum - left.sortNum || right.transactionId - left.transactionId;
    });
}

function normalizeBalanceDebts(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.debtId ?? source.debt_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      return {
        debtId: id,
        title,
        creditor: String(source.creditor || '').trim(),
        amount: toNumber(source.amount, 0),
        currencyCode: String(source.currencyCode ?? source.currency_code ?? 'CNY').trim().toUpperCase() || 'CNY',
        occurredAt: source.occurredAt || source.occurred_at || '',
        dueAt: source.dueAt || source.due_at || '',
        status: String(source.status || 'OPEN').trim().toUpperCase() || 'OPEN',
        note: String(source.note || '').trim(),
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.debtId - right.debtId);
}

function normalizeBalanceRecurringCharges(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      const id = toNumber(source.recurringChargeId ?? source.recurring_charge_id);
      const title = String(source.title || '').trim();
      if (!id || !title) return null;
      return {
        recurringChargeId: id,
        accountId: toNumber(source.accountId ?? source.account_id, 0) || null,
        title,
        amount: toNumber(source.amount, 0),
        currencyCode: String(source.currencyCode ?? source.currency_code ?? 'CNY').trim().toUpperCase() || 'CNY',
        category: String(source.category || '').trim(),
        note: String(source.note || '').trim(),
        cronExpr: String(source.cronExpr ?? source.cron_expr ?? '').trim(),
        timeZoneId: String(source.timeZoneId ?? source.time_zone_id ?? 'Asia/Shanghai').trim() || 'Asia/Shanghai',
        startAt: source.startAt || source.start_at || '',
        endAt: source.endAt || source.end_at || '',
        lastTriggerAt: source.lastTriggerAt || source.last_trigger_at || '',
        enabled: toBoolean(source.enabled, true),
        sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter(Boolean)
    .sort((left, right) => left.sortNum - right.sortNum || left.recurringChargeId - right.recurringChargeId);
}

function normalizeBalanceFxRates(raw) {
  return toArray(raw)
    .map((item) => {
      const source = toObject(item);
      return {
        baseCurrency: String(source.baseCurrency ?? source.base_currency ?? 'CNY').trim().toUpperCase() || 'CNY',
        quoteCurrency: String(source.quoteCurrency ?? source.quote_currency ?? 'CNY').trim().toUpperCase() || 'CNY',
        rate: toNumber(source.rate, 1),
        provider: String(source.provider || '').trim(),
        updatedAt: source.updatedAt || source.updated_at || ''
      };
    })
    .filter((item) => item.quoteCurrency)
    .sort((left, right) => left.quoteCurrency.localeCompare(right.quoteCurrency));
}

function normalizeBalanceOverview(raw) {
  const source = toObject(raw);
  return {
    baseCurrency: String(source.baseCurrency ?? source.base_currency ?? 'CNY').trim().toUpperCase() || 'CNY',
    totalBalance: toNumber(source.totalBalance ?? source.total_balance, 0),
    totalDebt: toNumber(source.totalDebt ?? source.total_debt, 0),
    netAsset: toNumber(source.netAsset ?? source.net_asset, 0),
    calculatedAt: source.calculatedAt || source.calculated_at || ''
  };
}

export function createEmptyLightAppDataStore() {
  return {
    projects: [],
    pomodoros: [],
    todos: [],
    tasks: [],
    taskColumns: DEFAULT_TASK_COLUMNS.map((item) => ({ ...item })),
    schedules: [],
    todoRecurringRules: [],
    taskRecurringRules: [],
    scheduleRecurringRules: [],
    balanceAccounts: [],
    balanceTransactions: [],
    balanceDebts: [],
    balanceRecurringCharges: [],
    balanceFxRates: [],
    balanceOverview: normalizeBalanceOverview({})
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
    schedules: normalizeSchedules(source.schedules),
    todoRecurringRules: normalizeTodoRecurringRules(source.todoRecurringRules || source.todo_recurring_rules),
    taskRecurringRules: normalizeTaskRecurringRules(source.taskRecurringRules || source.task_recurring_rules),
    scheduleRecurringRules: normalizeScheduleRecurringRules(source.scheduleRecurringRules || source.schedule_recurring_rules),
    balanceAccounts: normalizeBalanceAccounts(source.balanceAccounts || source.balance_accounts),
    balanceTransactions: normalizeBalanceTransactions(source.balanceTransactions || source.balance_transactions),
    balanceDebts: normalizeBalanceDebts(source.balanceDebts || source.balance_debts),
    balanceRecurringCharges: normalizeBalanceRecurringCharges(source.balanceRecurringCharges || source.balance_recurring_charges),
    balanceFxRates: normalizeBalanceFxRates(source.balanceFxRates || source.balance_fx_rates),
    balanceOverview: normalizeBalanceOverview(source.balanceOverview || source.balance_overview)
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
