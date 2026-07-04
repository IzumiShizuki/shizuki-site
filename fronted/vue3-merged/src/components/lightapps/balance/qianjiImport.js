const QIANJI_SOURCE_LABEL = 'qianji-local-import';

const HEADER_ALIASES = Object.freeze({
  externalId: ['流水号', '交易ID', '账单ID', '记录ID', 'id'],
  datetime: ['日期时间', '记账时间', '发生时间'],
  date: ['日期', '记账日期', '发生日期'],
  time: ['时间', '时刻', '时间点'],
  type: ['类型', '收支类型', '账单类型'],
  amount: ['金额', '金额(元)', '数额', 'amount'],
  income: ['收入'],
  expense: ['支出'],
  currency: ['币种', 'currency'],
  primaryCategory: ['一级分类', '主分类'],
  secondaryCategory: ['二级分类', '子分类'],
  category: ['分类'],
  account: ['账户', '账户1', '资产账户', '支付账户'],
  merchant: ['商家', '交易对象', '对方'],
  member: ['成员'],
  book: ['账本'],
  tag: ['标签'],
  note: ['备注', '说明', '附言', 'comment']
});

const INCOME_MARKERS = ['收入', 'income', '退款', '返现', '返利'];
const EXPENSE_MARKERS = ['支出', 'expense', '消费'];
const UNSUPPORTED_MARKERS = ['转账', '还款', '报销', '借入', '借出', '平账'];

function normalizeOptionalText(value) {
  const normalized = String(value == null ? '' : value).replace(/^\uFEFF/, '').trim();
  return normalized;
}

function normalizeHeader(value) {
  return normalizeOptionalText(value)
    .replace(/[\s_-]+/g, '')
    .toLowerCase();
}

function readMatchingValue(record, aliases) {
  const entries = Object.entries(record || {});
  for (const alias of aliases) {
    const normalizedAlias = normalizeHeader(alias);
    const matched = entries.find(([key]) => normalizeHeader(key) === normalizedAlias);
    if (matched) {
      return normalizeOptionalText(matched[1]);
    }
  }
  return '';
}

function parseCsvRows(text) {
  const rows = [];
  let row = [];
  let cell = '';
  let inQuotes = false;
  const source = String(text || '').replace(/\r\n/g, '\n').replace(/\r/g, '\n');

  for (let index = 0; index < source.length; index += 1) {
    const char = source[index];
    const next = source[index + 1];

    if (char === '"') {
      if (inQuotes && next === '"') {
        cell += '"';
        index += 1;
      } else {
        inQuotes = !inQuotes;
      }
      continue;
    }

    if (!inQuotes && char === ',') {
      row.push(cell);
      cell = '';
      continue;
    }

    if (!inQuotes && char === '\n') {
      row.push(cell);
      rows.push(row);
      row = [];
      cell = '';
      continue;
    }

    cell += char;
  }

  if (cell.length || row.length) {
    row.push(cell);
    rows.push(row);
  }

  return rows
    .map((item) => item.map((cellValue) => normalizeOptionalText(cellValue)))
    .filter((item) => item.some((cellValue) => cellValue));
}

function parseDecimal(value) {
  const normalized = normalizeOptionalText(value).replace(/,/g, '');
  if (!normalized) {
    return 0;
  }
  const match = normalized.match(/-?\d+(?:\.\d+)?/);
  if (!match) {
    return 0;
  }
  const parsed = Number(match[0]);
  return Number.isFinite(parsed) ? parsed : 0;
}

function toLocalDateTimeText(value) {
  const normalized = normalizeOptionalText(value).replace(/\//g, '-');
  if (!normalized) {
    return '';
  }

  const direct = normalized.includes('T')
    ? normalized
    : normalized.includes(' ')
      ? normalized.replace(' ', 'T')
      : `${normalized}T00:00:00`;

  const parsed = new Date(direct);
  if (!Number.isNaN(parsed.getTime())) {
    const pad = (item) => String(item).padStart(2, '0');
    return `${parsed.getFullYear()}-${pad(parsed.getMonth() + 1)}-${pad(parsed.getDate())}`
      + `T${pad(parsed.getHours())}:${pad(parsed.getMinutes())}:${pad(parsed.getSeconds())}`;
  }

  const fallback = direct.match(/^(\d{4}-\d{2}-\d{2})T(\d{2}:\d{2}(?::\d{2})?)$/);
  if (!fallback) {
    return '';
  }
  const seconds = fallback[2].length === 5 ? `${fallback[2]}:00` : fallback[2];
  return `${fallback[1]}T${seconds}`;
}

function resolveOccurredAt(record) {
  const directDateTime = readMatchingValue(record, HEADER_ALIASES.datetime);
  const dateValue = readMatchingValue(record, HEADER_ALIASES.date);
  const timeValue = readMatchingValue(record, HEADER_ALIASES.time);
  const timeCandidate = timeValue || directDateTime;
  const combined = dateValue && timeCandidate ? `${dateValue} ${timeCandidate}` : directDateTime || dateValue;
  return toLocalDateTimeText(combined);
}

function resolveDirection(record) {
  const typeValue = readMatchingValue(record, HEADER_ALIASES.type).toLowerCase();
  const categoryText = [
    readMatchingValue(record, HEADER_ALIASES.primaryCategory),
    readMatchingValue(record, HEADER_ALIASES.secondaryCategory),
    readMatchingValue(record, HEADER_ALIASES.category)
  ]
    .join(' ')
    .toLowerCase();
  if (typeValue) {
    if (UNSUPPORTED_MARKERS.some((marker) => typeValue.includes(marker))) {
      return 'UNSUPPORTED';
    }
    if (INCOME_MARKERS.some((marker) => typeValue.includes(marker))) {
      return 'INCOME';
    }
    if (EXPENSE_MARKERS.some((marker) => typeValue.includes(marker))) {
      return 'EXPENSE';
    }
  }
  if (UNSUPPORTED_MARKERS.some((marker) => categoryText.includes(marker))) {
    return 'UNSUPPORTED';
  }

  const incomeAmount = parseDecimal(readMatchingValue(record, HEADER_ALIASES.income));
  const expenseAmount = parseDecimal(readMatchingValue(record, HEADER_ALIASES.expense));
  if (incomeAmount > 0 && expenseAmount <= 0) {
    return 'INCOME';
  }
  if (expenseAmount > 0 && incomeAmount <= 0) {
    return 'EXPENSE';
  }
  return '';
}

function resolveAmount(record, direction) {
  const directAmount = parseDecimal(readMatchingValue(record, HEADER_ALIASES.amount));
  if (directAmount > 0) {
    return directAmount.toFixed(2);
  }
  if (direction === 'INCOME') {
    const incomeAmount = parseDecimal(readMatchingValue(record, HEADER_ALIASES.income));
    return incomeAmount > 0 ? incomeAmount.toFixed(2) : '';
  }
  if (direction === 'EXPENSE') {
    const expenseAmount = parseDecimal(readMatchingValue(record, HEADER_ALIASES.expense));
    return expenseAmount > 0 ? expenseAmount.toFixed(2) : '';
  }
  return '';
}

function resolveCategory(record) {
  const secondary = readMatchingValue(record, HEADER_ALIASES.secondaryCategory);
  const category = readMatchingValue(record, HEADER_ALIASES.category);
  const primary = readMatchingValue(record, HEADER_ALIASES.primaryCategory);
  return secondary || category || primary || '钱迹导入';
}

export function extractQianjiRecordAccount(record) {
  return readMatchingValue(record, HEADER_ALIASES.account);
}

export function extractQianjiRecordBook(record) {
  return readMatchingValue(record, HEADER_ALIASES.book);
}

function resolveNote(record) {
  const parts = [
    readMatchingValue(record, HEADER_ALIASES.note),
    readMatchingValue(record, HEADER_ALIASES.account) ? `账户:${readMatchingValue(record, HEADER_ALIASES.account)}` : '',
    readMatchingValue(record, HEADER_ALIASES.book) ? `账本:${readMatchingValue(record, HEADER_ALIASES.book)}` : '',
    readMatchingValue(record, HEADER_ALIASES.member) ? `成员:${readMatchingValue(record, HEADER_ALIASES.member)}` : '',
    readMatchingValue(record, HEADER_ALIASES.tag) ? `标签:${readMatchingValue(record, HEADER_ALIASES.tag)}` : ''
  ].filter(Boolean);
  return parts.join(' | ').slice(0, 500);
}

function createRowWarning(rowNumber, reason) {
  return `第 ${rowNumber} 行：${reason}`;
}

function buildTransaction(record, rowNumber) {
  const occurredAt = resolveOccurredAt(record);
  if (!occurredAt) {
    return { warning: createRowWarning(rowNumber, '缺少可识别的时间') };
  }

  const direction = resolveDirection(record);
  if (direction === 'UNSUPPORTED') {
    return { warning: createRowWarning(rowNumber, '转账、还款或报销类记录当前不会导入') };
  }
  if (!direction) {
    return { warning: createRowWarning(rowNumber, '缺少可识别的收支类型') };
  }

  const amount = resolveAmount(record, direction);
  if (!amount) {
    return { warning: createRowWarning(rowNumber, '缺少有效金额') };
  }

  return {
    transaction: {
      externalId: readMatchingValue(record, HEADER_ALIASES.externalId),
      occurredAt,
      direction,
      amount,
      currencyCode: readMatchingValue(record, HEADER_ALIASES.currency) || 'CNY',
      counterparty: readMatchingValue(record, HEADER_ALIASES.merchant),
      categoryHint: resolveCategory(record),
      note: resolveNote(record),
      rawPayload: JSON.stringify(record)
    }
  };
}

function summarizeTransactions(transactions, warnings) {
  const occurredAtValues = transactions
    .map((item) => item.occurredAt)
    .filter(Boolean)
    .sort();
  return {
    transactions,
    importedCount: transactions.length,
    skippedCount: warnings.length,
    requestFromAt: occurredAtValues[0] || '',
    requestToAt: occurredAtValues[occurredAtValues.length - 1] || '',
    warnings
  };
}

export function parseQianjiCsvText(text) {
  const rows = parseCsvRows(text);
  if (!rows.length) {
    return summarizeTransactions([], ['文件内容为空']);
  }

  const headerIndex = rows.findIndex((row) => {
    const merged = row.map((item) => normalizeHeader(item)).join('|');
    return merged.includes(normalizeHeader('日期')) || merged.includes(normalizeHeader('金额')) || merged.includes(normalizeHeader('类型'));
  });
  if (headerIndex < 0) {
    return summarizeTransactions([], ['没有找到钱迹表头']);
  }

  const headers = rows[headerIndex];
  const records = rows.slice(headerIndex + 1).map((row) => {
    const record = {};
    headers.forEach((header, index) => {
      if (header) {
        record[header] = normalizeOptionalText(row[index]);
      }
    });
    return record;
  });

  const transactions = [];
  const warnings = [];
  records.forEach((record, index) => {
    const result = buildTransaction(record, headerIndex + index + 2);
    if (result.transaction) {
      transactions.push(result.transaction);
    } else if (result.warning) {
      warnings.push(result.warning);
    }
  });

  return summarizeTransactions(transactions, warnings);
}

function extractJsonRecords(value) {
  if (Array.isArray(value)) {
    return value;
  }
  if (value && typeof value === 'object') {
    const nestedKeys = ['data', 'items', 'list', 'bills', 'records'];
    for (const key of nestedKeys) {
      const nested = extractJsonRecords(value[key]);
      if (nested.length) {
        return nested;
      }
    }
  }
  return [];
}

export function parseQianjiJsonText(text) {
  let parsed;
  try {
    parsed = JSON.parse(String(text || ''));
  } catch (error) {
    return summarizeTransactions([], ['JSON 解析失败']);
  }

  const records = extractJsonRecords(parsed).filter((item) => item && typeof item === 'object');
  if (!records.length) {
    return summarizeTransactions([], ['没有找到可导入的账单记录']);
  }

  const transactions = [];
  const warnings = [];
  records.forEach((record, index) => {
    const result = buildTransaction(record, index + 1);
    if (result.transaction) {
      transactions.push(result.transaction);
    } else if (result.warning) {
      warnings.push(result.warning);
    }
  });

  return summarizeTransactions(transactions, warnings);
}

export async function parseQianjiImportFile(file) {
  const fileName = normalizeOptionalText(file?.name);
  const text = await file.text();
  const extension = fileName.split('.').pop()?.toLowerCase() || '';
  const parsed = extension === 'json' ? parseQianjiJsonText(text) : parseQianjiCsvText(text);
  return {
    sourceLabel: QIANJI_SOURCE_LABEL,
    fileName,
    ...parsed
  };
}
