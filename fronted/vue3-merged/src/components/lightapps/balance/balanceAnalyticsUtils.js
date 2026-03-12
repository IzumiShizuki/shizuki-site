const DEFAULT_TIME_ZONE = 'Asia/Shanghai';
const DEFAULT_BASE_CURRENCY = 'CNY';
const CHANNEL_CODE_UNBOUND = '__unbound__';

function pad2(value) {
  return String(value).padStart(2, '0');
}

function toDateText(date) {
  if (!(date instanceof Date) || Number.isNaN(date.getTime())) return '';
  return `${date.getFullYear()}-${pad2(date.getMonth() + 1)}-${pad2(date.getDate())}`;
}

function parseDateText(text) {
  const value = String(text || '').trim();
  if (!value) return null;
  const ts = Date.parse(`${value}T00:00:00`);
  if (!Number.isFinite(ts)) return null;
  return new Date(ts);
}

function shiftDays(date, days) {
  if (!(date instanceof Date)) return null;
  const next = new Date(date.getTime());
  next.setDate(next.getDate() + Number(days || 0));
  return next;
}

function toAmount(value) {
  const number = Number(value);
  if (!Number.isFinite(number)) return 0;
  return number;
}

function buildRateMap(fxRates, baseCurrency) {
  const map = new Map();
  const base = String(baseCurrency || DEFAULT_BASE_CURRENCY).toUpperCase();
  map.set(base, 1);
  (Array.isArray(fxRates) ? fxRates : []).forEach((item) => {
    const quote = String(item?.quoteCurrency || item?.quote_currency || '').trim().toUpperCase();
    const rate = toAmount(item?.rate);
    if (!quote || rate <= 0) return;
    map.set(quote, rate);
  });
  return map;
}

function convertToBase(amount, currencyCode, baseCurrency, rateMap) {
  const normalizedAmount = toAmount(amount);
  const source = String(currencyCode || baseCurrency).trim().toUpperCase();
  if (!source || source === baseCurrency) return normalizedAmount;
  const rate = toAmount(rateMap.get(source));
  if (rate <= 0) return normalizedAmount;
  return normalizedAmount / rate;
}

function toIsoBoundary(dateText, endOfDay = false) {
  const normalizedDate = String(dateText || '').trim();
  if (!normalizedDate) return '';
  return `${normalizedDate}T${endOfDay ? '23:59:59' : '00:00:00'}`;
}

function normalizeChannelCode(code) {
  return String(code || '').trim().toLowerCase();
}

function normalizeDirection(direction) {
  const value = String(direction || '').trim().toUpperCase();
  if (!value) return '';
  if (value === 'INCOME' || value === 'EXPENSE') return value;
  return '';
}

export function resolvePresetRange(preset, now = new Date()) {
  const normalizedPreset = String(preset || '').trim().toLowerCase();
  const today = new Date(now.getTime());
  today.setHours(0, 0, 0, 0);

  if (normalizedPreset === '7d') {
    return {
      fromDate: toDateText(shiftDays(today, -6)),
      toDate: toDateText(today)
    };
  }
  if (normalizedPreset === 'month') {
    const from = new Date(today.getFullYear(), today.getMonth(), 1);
    return {
      fromDate: toDateText(from),
      toDate: toDateText(today)
    };
  }
  if (normalizedPreset === 'custom') {
    return {
      fromDate: '',
      toDate: ''
    };
  }
  return {
    fromDate: toDateText(shiftDays(today, -29)),
    toDate: toDateText(today)
  };
}

export function normalizeLedgerFilter(rawFilter, now = new Date()) {
  const source = rawFilter && typeof rawFilter === 'object' ? rawFilter : {};
  const preset = String(source.preset || '30d').trim().toLowerCase() || '30d';
  const base = resolvePresetRange(preset, now);
  const fromDate = String(source.fromDate || source.from_date || base.fromDate || '').trim();
  const toDate = String(source.toDate || source.to_date || base.toDate || '').trim();
  const accountIdRaw = source.accountId ?? source.account_id;
  const parsedAccountId = Number(accountIdRaw);
  const accountId = Number.isInteger(parsedAccountId) && parsedAccountId > 0 ? parsedAccountId : null;

  return {
    preset,
    fromDate,
    toDate,
    timeZone: String(source.timeZone || source.time_zone || DEFAULT_TIME_ZONE).trim() || DEFAULT_TIME_ZONE,
    channelCode: normalizeChannelCode(source.channelCode || source.channel_code || ''),
    accountId,
    direction: normalizeDirection(source.direction)
  };
}

export function buildLedgerRangeQuery(filter) {
  const normalized = normalizeLedgerFilter(filter);
  return {
    fromDatetime: toIsoBoundary(normalized.fromDate, false),
    toDatetime: toIsoBoundary(normalized.toDate, true),
    timeZone: normalized.timeZone
  };
}

export function buildEmptyAnalytics(baseCurrency, range) {
  const normalizedBase = String(baseCurrency || DEFAULT_BASE_CURRENCY).toUpperCase() || DEFAULT_BASE_CURRENCY;
  return {
    baseCurrency: normalizedBase,
    range: {
      fromDatetime: range?.fromDatetime || '',
      toDatetime: range?.toDatetime || '',
      timeZone: range?.timeZone || DEFAULT_TIME_ZONE
    },
    summary: {
      incomeTotal: 0,
      expenseTotal: 0,
      netFlow: 0,
      incomeCount: 0,
      expenseCount: 0,
      txCount: 0
    },
    assetSnapshot: {
      totalBalance: 0,
      totalDebt: 0,
      netAsset: 0
    },
    dailyTrend: [],
    channelBreakdown: []
  };
}

export function buildLocalBalanceAnalytics(payload) {
  const source = payload && typeof payload === 'object' ? payload : {};
  const baseCurrency = String(source.baseCurrency || DEFAULT_BASE_CURRENCY).trim().toUpperCase() || DEFAULT_BASE_CURRENCY;
  const range = {
    fromDatetime: String(source.fromDatetime || '').trim(),
    toDatetime: String(source.toDatetime || '').trim(),
    timeZone: String(source.timeZone || DEFAULT_TIME_ZONE).trim() || DEFAULT_TIME_ZONE
  };
  const result = buildEmptyAnalytics(baseCurrency, range);

  const accountList = Array.isArray(source.accounts) ? source.accounts : [];
  const txList = Array.isArray(source.transactions) ? source.transactions : [];
  const debtList = Array.isArray(source.debts) ? source.debts : [];
  const fxRates = Array.isArray(source.fxRates) ? source.fxRates : [];
  const rateMap = buildRateMap(fxRates, baseCurrency);

  const accountMap = new Map();
  accountList.forEach((item) => {
    const id = Number(item?.accountId);
    if (!Number.isInteger(id) || id <= 0) return;
    accountMap.set(id, item);
  });

  const rangeStart = Date.parse(result.range.fromDatetime || '');
  const rangeEnd = Date.parse(result.range.toDatetime || '');
  const useRange = Number.isFinite(rangeStart) && Number.isFinite(rangeEnd) && rangeEnd >= rangeStart;
  const channelFilter = normalizeChannelCode(source.channelCode || source.channel_code || '');
  const accountFilterId = source.accountId ? Number(source.accountId) : null;
  const directionFilter = normalizeDirection(source.direction);

  const dailyMap = new Map();
  if (useRange) {
    let cursor = new Date(rangeStart);
    const end = new Date(rangeEnd);
    while (cursor.getTime() <= end.getTime()) {
      const day = toDateText(cursor);
      dailyMap.set(day, { income: 0, expense: 0 });
      cursor = shiftDays(cursor, 1);
    }
  }

  const channelMap = new Map();
  const filteredTx = [];

  txList.forEach((item) => {
    const occurredAt = Date.parse(item?.occurredAt || item?.occurred_at || '');
    if (useRange && (!Number.isFinite(occurredAt) || occurredAt < rangeStart || occurredAt > rangeEnd)) return;

    const txDirection = normalizeDirection(item?.direction);
    if (directionFilter && txDirection !== directionFilter) return;

    const accountId = Number(item?.accountId || item?.account_id);
    const account = Number.isInteger(accountId) && accountId > 0 ? accountMap.get(accountId) : null;
    const txChannelCode = account ? normalizeChannelCode(account.channelCode || account.channel_code) : CHANNEL_CODE_UNBOUND;
    const txChannelName = account
      ? String(account.channelName || account.channel_name || account.accountName || '未知渠道')
      : '未绑定';

    if (channelFilter) {
      if (channelFilter === CHANNEL_CODE_UNBOUND) {
        if (txChannelCode !== CHANNEL_CODE_UNBOUND) return;
      } else if (txChannelCode !== channelFilter) {
        return;
      }
    }
    if (Number.isInteger(accountFilterId) && accountFilterId > 0 && accountId !== accountFilterId) {
      return;
    }

    const amount = convertToBase(item?.amount, item?.currencyCode || item?.currency_code, baseCurrency, rateMap);
    const normalizedAmount = Number(amount.toFixed(4));
    const day = Number.isFinite(occurredAt) ? toDateText(new Date(occurredAt)) : '';
    const daily = dailyMap.get(day) || { income: 0, expense: 0 };

    if (txDirection === 'INCOME') {
      result.summary.incomeTotal += normalizedAmount;
      result.summary.incomeCount += 1;
      daily.income += normalizedAmount;
    } else {
      result.summary.expenseTotal += normalizedAmount;
      result.summary.expenseCount += 1;
      daily.expense += normalizedAmount;
    }
    if (day) {
      dailyMap.set(day, daily);
    }

    const channel = channelMap.get(txChannelCode) || {
      channelCode: txChannelCode,
      channelName: txChannelName,
      incomeTotal: 0,
      expenseTotal: 0,
      txCount: 0
    };
    if (txDirection === 'INCOME') {
      channel.incomeTotal += normalizedAmount;
    } else {
      channel.expenseTotal += normalizedAmount;
    }
    channel.txCount += 1;
    channelMap.set(txChannelCode, channel);

    filteredTx.push(item);
  });

  result.summary.incomeTotal = Number(result.summary.incomeTotal.toFixed(4));
  result.summary.expenseTotal = Number(result.summary.expenseTotal.toFixed(4));
  result.summary.netFlow = Number((result.summary.incomeTotal - result.summary.expenseTotal).toFixed(4));
  result.summary.txCount = filteredTx.length;

  result.dailyTrend = Array.from(dailyMap.entries())
    .sort((a, b) => a[0].localeCompare(b[0]))
    .map(([day, item]) => ({
      day,
      incomeTotal: Number(item.income.toFixed(4)),
      expenseTotal: Number(item.expense.toFixed(4)),
      netFlow: Number((item.income - item.expense).toFixed(4))
    }));

  result.channelBreakdown = Array.from(channelMap.values())
    .sort((a, b) => b.txCount - a.txCount || a.channelCode.localeCompare(b.channelCode))
    .map((item) => ({
      channelCode: item.channelCode,
      channelName: item.channelName,
      incomeTotal: Number(item.incomeTotal.toFixed(4)),
      expenseTotal: Number(item.expenseTotal.toFixed(4)),
      txCount: item.txCount
    }));

  const totalBalance = accountList.reduce(
    (sum, item) => sum + convertToBase(item?.balanceAmount || item?.balance_amount, item?.currencyCode || item?.currency_code, baseCurrency, rateMap),
    0
  );
  const totalDebt = debtList.reduce((sum, item) => {
    const status = String(item?.status || '').trim().toUpperCase();
    if (status === 'CLOSED') return sum;
    return sum + convertToBase(item?.amount, item?.currencyCode || item?.currency_code, baseCurrency, rateMap);
  }, 0);
  result.assetSnapshot.totalBalance = Number(totalBalance.toFixed(4));
  result.assetSnapshot.totalDebt = Number(totalDebt.toFixed(4));
  result.assetSnapshot.netAsset = Number((totalBalance - totalDebt).toFixed(4));

  return result;
}
