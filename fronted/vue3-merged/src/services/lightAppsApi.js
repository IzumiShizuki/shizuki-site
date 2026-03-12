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

function toAmount(value, fallback = 0) {
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

function compactQuery(rawQuery) {
  const source = toObject(rawQuery);
  const next = {};
  Object.entries(source).forEach(([key, value]) => {
    if (value === null || value === undefined) return;
    if (typeof value === 'number') {
      if (!Number.isFinite(value)) return;
      next[key] = value;
      return;
    }
    const text = String(value).trim();
    if (!text) return;
    next[key] = text;
  });
  return Object.keys(next).length ? next : undefined;
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

function normalizeRecurringRuleBase(source) {
  return {
    cronExpr: toText(source.cronExpr ?? source.cron_expr, ''),
    timeZoneId: toText(source.timeZoneId ?? source.time_zone_id, 'Asia/Shanghai') || 'Asia/Shanghai',
    startAt: source.startAt || source.start_at || '',
    endAt: source.endAt || source.end_at || '',
    enabled: toBoolean(source.enabled, true),
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeTodoRecurringRule(raw) {
  const source = toObject(raw);
  return {
    ruleId: toNumber(source.ruleId ?? source.rule_id, 0),
    projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
    title: toText(source.title, ''),
    detail: toText(source.detail, ''),
    priority: toText(source.priority, 'MEDIUM').toUpperCase() || 'MEDIUM',
    ...normalizeRecurringRuleBase(source)
  };
}

function normalizeTaskRecurringRule(raw) {
  const source = toObject(raw);
  return {
    ruleId: toNumber(source.ruleId ?? source.rule_id, 0),
    projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
    columnCode: toText(source.columnCode ?? source.column_code, 'todo').toLowerCase() || 'todo',
    title: toText(source.title, ''),
    detail: toText(source.detail, ''),
    ...normalizeRecurringRuleBase(source)
  };
}

function normalizeScheduleRecurringRule(raw) {
  const source = toObject(raw);
  return {
    ruleId: toNumber(source.ruleId ?? source.rule_id, 0),
    projectId: toNumber(source.projectId ?? source.project_id, 0) || null,
    title: toText(source.title, ''),
    detail: toText(source.detail, ''),
    durationMinutes: toNumber(source.durationMinutes ?? source.duration_minutes, 60),
    allDay: toBoolean(source.allDay ?? source.all_day, false),
    location: toText(source.location, ''),
    status: toText(source.status, 'ACTIVE').toUpperCase() || 'ACTIVE',
    ...normalizeRecurringRuleBase(source)
  };
}

function normalizeBalanceAccount(raw) {
  const source = toObject(raw);
  return {
    accountId: toNumber(source.accountId ?? source.account_id, 0),
    channelCode: toText(source.channelCode ?? source.channel_code, ''),
    channelName: toText(source.channelName ?? source.channel_name, ''),
    accountName: toText(source.accountName ?? source.account_name, ''),
    currencyCode: toText(source.currencyCode ?? source.currency_code, 'CNY').toUpperCase() || 'CNY',
    balanceAmount: toAmount(source.balanceAmount ?? source.balance_amount, 0),
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeBalanceTransaction(raw) {
  const source = toObject(raw);
  return {
    transactionId: toNumber(source.transactionId ?? source.transaction_id, 0),
    accountId: toNumber(source.accountId ?? source.account_id, 0) || null,
    direction: toText(source.direction, 'EXPENSE').toUpperCase() || 'EXPENSE',
    amount: toAmount(source.amount, 0),
    currencyCode: toText(source.currencyCode ?? source.currency_code, 'CNY').toUpperCase() || 'CNY',
    category: toText(source.category, ''),
    note: toText(source.note, ''),
    occurredAt: source.occurredAt || source.occurred_at || '',
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeBalanceDebt(raw) {
  const source = toObject(raw);
  return {
    debtId: toNumber(source.debtId ?? source.debt_id, 0),
    title: toText(source.title, ''),
    creditor: toText(source.creditor, ''),
    amount: toAmount(source.amount, 0),
    currencyCode: toText(source.currencyCode ?? source.currency_code, 'CNY').toUpperCase() || 'CNY',
    occurredAt: source.occurredAt || source.occurred_at || '',
    dueAt: source.dueAt || source.due_at || '',
    status: toText(source.status, 'OPEN').toUpperCase() || 'OPEN',
    note: toText(source.note, ''),
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeBalanceRecurringCharge(raw) {
  const source = toObject(raw);
  return {
    recurringChargeId: toNumber(source.recurringChargeId ?? source.recurring_charge_id, 0),
    accountId: toNumber(source.accountId ?? source.account_id, 0) || null,
    title: toText(source.title, ''),
    amount: toAmount(source.amount, 0),
    currencyCode: toText(source.currencyCode ?? source.currency_code, 'CNY').toUpperCase() || 'CNY',
    category: toText(source.category, ''),
    note: toText(source.note, ''),
    cronExpr: toText(source.cronExpr ?? source.cron_expr, ''),
    timeZoneId: toText(source.timeZoneId ?? source.time_zone_id, 'Asia/Shanghai') || 'Asia/Shanghai',
    startAt: source.startAt || source.start_at || '',
    endAt: source.endAt || source.end_at || '',
    lastTriggerAt: source.lastTriggerAt || source.last_trigger_at || '',
    enabled: toBoolean(source.enabled, true),
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeBalanceOverview(raw) {
  const source = toObject(raw);
  return {
    baseCurrency: toText(source.baseCurrency ?? source.base_currency, 'CNY').toUpperCase() || 'CNY',
    totalBalance: toAmount(source.totalBalance ?? source.total_balance, 0),
    totalDebt: toAmount(source.totalDebt ?? source.total_debt, 0),
    netAsset: toAmount(source.netAsset ?? source.net_asset, 0),
    calculatedAt: source.calculatedAt || source.calculated_at || ''
  };
}

function normalizeBalanceAnalyticsRange(raw) {
  const source = toObject(raw);
  return {
    fromDatetime: source.fromDatetime || source.from_datetime || '',
    toDatetime: source.toDatetime || source.to_datetime || '',
    timeZone: toText(source.timeZone ?? source.time_zone, 'Asia/Shanghai') || 'Asia/Shanghai'
  };
}

function normalizeBalanceAnalyticsSummary(raw) {
  const source = toObject(raw);
  return {
    incomeTotal: toAmount(source.incomeTotal ?? source.income_total, 0),
    expenseTotal: toAmount(source.expenseTotal ?? source.expense_total, 0),
    netFlow: toAmount(source.netFlow ?? source.net_flow, 0),
    incomeCount: toNumber(source.incomeCount ?? source.income_count, 0),
    expenseCount: toNumber(source.expenseCount ?? source.expense_count, 0),
    txCount: toNumber(source.txCount ?? source.tx_count, 0)
  };
}

function normalizeBalanceAssetSnapshot(raw) {
  const source = toObject(raw);
  return {
    totalBalance: toAmount(source.totalBalance ?? source.total_balance, 0),
    totalDebt: toAmount(source.totalDebt ?? source.total_debt, 0),
    netAsset: toAmount(source.netAsset ?? source.net_asset, 0)
  };
}

function normalizeBalanceDailyTrendItem(raw) {
  const source = toObject(raw);
  return {
    day: toText(source.day, ''),
    incomeTotal: toAmount(source.incomeTotal ?? source.income_total, 0),
    expenseTotal: toAmount(source.expenseTotal ?? source.expense_total, 0),
    netFlow: toAmount(source.netFlow ?? source.net_flow, 0)
  };
}

function normalizeBalanceChannelBreakdownItem(raw) {
  const source = toObject(raw);
  return {
    channelCode: toText(source.channelCode ?? source.channel_code, ''),
    channelName: toText(source.channelName ?? source.channel_name, ''),
    incomeTotal: toAmount(source.incomeTotal ?? source.income_total, 0),
    expenseTotal: toAmount(source.expenseTotal ?? source.expense_total, 0),
    txCount: toNumber(source.txCount ?? source.tx_count, 0)
  };
}

function normalizeBalanceAnalytics(raw) {
  const source = toObject(raw);
  return {
    baseCurrency: toText(source.baseCurrency ?? source.base_currency, 'CNY').toUpperCase() || 'CNY',
    range: normalizeBalanceAnalyticsRange(source.range),
    summary: normalizeBalanceAnalyticsSummary(source.summary),
    assetSnapshot: normalizeBalanceAssetSnapshot(source.assetSnapshot ?? source.asset_snapshot),
    dailyTrend: normalizeList(source.dailyTrend ?? source.daily_trend, normalizeBalanceDailyTrendItem),
    channelBreakdown: normalizeList(source.channelBreakdown ?? source.channel_breakdown, normalizeBalanceChannelBreakdownItem)
  };
}

function normalizeFxRate(raw) {
  const source = toObject(raw);
  return {
    baseCurrency: toText(source.baseCurrency ?? source.base_currency, 'CNY').toUpperCase() || 'CNY',
    quoteCurrency: toText(source.quoteCurrency ?? source.quote_currency, 'CNY').toUpperCase() || 'CNY',
    rate: toAmount(source.rate, 1),
    provider: toText(source.provider, ''),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeUrlLink(raw) {
  const source = toObject(raw);
  return {
    urlLinkId: toNumber(source.urlLinkId ?? source.url_link_id, 0),
    title: toText(source.title, ''),
    url: toText(source.url, ''),
    iconMode: toText(source.iconMode ?? source.icon_mode, 'AUTO').toUpperCase() || 'AUTO',
    iconAssetId: toNumber(source.iconAssetId ?? source.icon_asset_id, 0) || null,
    faviconUrl: toText(source.faviconUrl ?? source.favicon_url, ''),
    sortNum: toNumber(source.sortNum ?? source.sort_num, 0),
    updatedAt: source.updatedAt || source.updated_at || ''
  };
}

function normalizeUrlMetadata(raw) {
  const source = toObject(raw);
  return {
    title: toText(source.title, ''),
    faviconUrl: toText(source.faviconUrl ?? source.favicon_url, ''),
    host: toText(source.host || '', '')
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

export async function listLightAppTodoRecurringRules(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/todo-recurring-rules', { method: 'GET' }));
  return normalizeList(raw, normalizeTodoRecurringRule, 'ruleId');
}

export async function createLightAppTodoRecurringRule(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/todo-recurring-rules', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeTodoRecurringRule(raw);
}

export async function updateLightAppTodoRecurringRule(ruleId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/todo-recurring-rules/${encodeURIComponent(ruleId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeTodoRecurringRule(raw);
}

export async function deleteLightAppTodoRecurringRule(ruleId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/todo-recurring-rules/${encodeURIComponent(ruleId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppTaskRecurringRules(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/task-recurring-rules', { method: 'GET' }));
  return normalizeList(raw, normalizeTaskRecurringRule, 'ruleId');
}

export async function createLightAppTaskRecurringRule(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/task-recurring-rules', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeTaskRecurringRule(raw);
}

export async function updateLightAppTaskRecurringRule(ruleId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/task-recurring-rules/${encodeURIComponent(ruleId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeTaskRecurringRule(raw);
}

export async function deleteLightAppTaskRecurringRule(ruleId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/task-recurring-rules/${encodeURIComponent(ruleId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppScheduleRecurringRules(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/schedule-recurring-rules', { method: 'GET' }));
  return normalizeList(raw, normalizeScheduleRecurringRule, 'ruleId');
}

export async function createLightAppScheduleRecurringRule(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/schedule-recurring-rules', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeScheduleRecurringRule(raw);
}

export async function updateLightAppScheduleRecurringRule(ruleId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/schedule-recurring-rules/${encodeURIComponent(ruleId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeScheduleRecurringRule(raw);
}

export async function deleteLightAppScheduleRecurringRule(ruleId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/schedule-recurring-rules/${encodeURIComponent(ruleId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppBalanceAccounts(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/balance/accounts', { method: 'GET' }));
  return normalizeList(raw, normalizeBalanceAccount, 'accountId');
}

export async function createLightAppBalanceAccount(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/balance/accounts', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeBalanceAccount(raw);
}

export async function updateLightAppBalanceAccount(accountId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/balance/accounts/${encodeURIComponent(accountId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeBalanceAccount(raw);
}

export async function deleteLightAppBalanceAccount(accountId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/balance/accounts/${encodeURIComponent(accountId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppBalanceTransactions(filtersOrFetch, maybeAuthorizedFetch) {
  const hasFilters = typeof filtersOrFetch === 'object' && filtersOrFetch !== null && typeof maybeAuthorizedFetch === 'function';
  const filters = hasFilters ? filtersOrFetch : {};
  const authorizedFetch = hasFilters ? maybeAuthorizedFetch : filtersOrFetch;
  ensureAuthorizedFetch(authorizedFetch);
  const rawAccountId = Number(filters.accountId ?? filters.account_id);
  const query = compactQuery({
    from_datetime: filters.fromDatetime || filters.from_datetime || '',
    to_datetime: filters.toDatetime || filters.to_datetime || '',
    time_zone: filters.timeZone || filters.time_zone || '',
    channel_code: filters.channelCode || filters.channel_code || '',
    account_id: Number.isInteger(rawAccountId) && rawAccountId > 0 ? rawAccountId : undefined,
    direction: filters.direction || ''
  });
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/balance/transactions', { method: 'GET', query }));
  return normalizeList(raw, normalizeBalanceTransaction, 'transactionId');
}

export async function createLightAppBalanceTransaction(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/balance/transactions', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeBalanceTransaction(raw);
}

export async function updateLightAppBalanceTransaction(transactionId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/balance/transactions/${encodeURIComponent(transactionId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeBalanceTransaction(raw);
}

export async function deleteLightAppBalanceTransaction(transactionId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/balance/transactions/${encodeURIComponent(transactionId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppBalanceDebts(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/balance/debts', { method: 'GET' }));
  return normalizeList(raw, normalizeBalanceDebt, 'debtId');
}

export async function createLightAppBalanceDebt(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/balance/debts', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeBalanceDebt(raw);
}

export async function updateLightAppBalanceDebt(debtId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/balance/debts/${encodeURIComponent(debtId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeBalanceDebt(raw);
}

export async function deleteLightAppBalanceDebt(debtId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/balance/debts/${encodeURIComponent(debtId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppBalanceRecurringCharges(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/balance/recurring-charges', { method: 'GET' }));
  return normalizeList(raw, normalizeBalanceRecurringCharge, 'recurringChargeId');
}

export async function createLightAppBalanceRecurringCharge(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/balance/recurring-charges', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeBalanceRecurringCharge(raw);
}

export async function updateLightAppBalanceRecurringCharge(recurringChargeId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/balance/recurring-charges/${encodeURIComponent(recurringChargeId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeBalanceRecurringCharge(raw);
}

export async function deleteLightAppBalanceRecurringCharge(recurringChargeId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/balance/recurring-charges/${encodeURIComponent(recurringChargeId)}`, {
      method: 'DELETE'
    })
  );
}

export async function getLightAppBalanceOverview(baseCurrency, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const normalizedBase = String(baseCurrency || '').trim().toUpperCase();
  const query = normalizedBase ? { base_currency: normalizedBase } : undefined;
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/balance/overview', {
      method: 'GET',
      query
    })
  );
  return normalizeBalanceOverview(raw);
}

export async function getLightAppBalanceAnalytics(filters, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const source = toObject(filters);
  const rawAccountId = Number(source.accountId ?? source.account_id);
  const query = compactQuery({
    base_currency: toText(source.baseCurrency ?? source.base_currency, '').toUpperCase(),
    from_datetime: source.fromDatetime || source.from_datetime || '',
    to_datetime: source.toDatetime || source.to_datetime || '',
    time_zone: source.timeZone || source.time_zone || '',
    channel_code: source.channelCode || source.channel_code || '',
    account_id: Number.isInteger(rawAccountId) && rawAccountId > 0 ? rawAccountId : undefined
  });
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/balance/analytics', {
      method: 'GET',
      query
    })
  );
  return normalizeBalanceAnalytics(raw);
}

export async function listLightAppFxRates(baseCurrency, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const normalizedBase = String(baseCurrency || '').trim().toUpperCase();
  const query = normalizedBase ? { base_currency: normalizedBase } : undefined;
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/balance/fx-rates', {
      method: 'GET',
      query
    })
  );
  return normalizeList(raw, normalizeFxRate);
}

export async function refreshLightAppFxRates(baseCurrency, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/balance/fx-rates/refresh', {
      method: 'POST',
      body: {
        baseCurrency: String(baseCurrency || '').trim().toUpperCase() || 'CNY'
      }
    })
  );
  return normalizeList(raw, normalizeFxRate);
}

export async function listLightAppUrlLinks(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(await authorizedFetch('/api/v1/light-apps/url-links', { method: 'GET' }));
  return normalizeList(raw, normalizeUrlLink, 'urlLinkId');
}

export async function createLightAppUrlLink(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/url-links', {
      method: 'POST',
      body: payload || {}
    })
  );
  return normalizeUrlLink(raw);
}

export async function updateLightAppUrlLink(urlLinkId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch(`/api/v1/light-apps/url-links/${encodeURIComponent(urlLinkId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
  return normalizeUrlLink(raw);
}

export async function deleteLightAppUrlLink(urlLinkId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/url-links/${encodeURIComponent(urlLinkId)}`, {
      method: 'DELETE'
    })
  );
}

export async function resolveLightAppUrlLinkMetadata(url, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const raw = unwrap(
    await authorizedFetch('/api/v1/light-apps/url-links/resolve-metadata', {
      method: 'POST',
      body: {
        url: toText(url, '')
      }
    })
  );
  return normalizeUrlMetadata(raw);
}
