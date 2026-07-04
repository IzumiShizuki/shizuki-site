import crypto from 'node:crypto';
import fs from 'node:fs/promises';
import path from 'node:path';
import { extractQianjiRecordAccount, extractQianjiRecordBook, parseQianjiCsvText, parseQianjiJsonText } from '../src/components/lightapps/balance/qianjiImport.js';

export const DEFAULT_SOURCE_LABEL = 'qianji-local-sync-script';
export const DEFAULT_POLL_INTERVAL_MS = 60_000;
export const DEFAULT_PROVIDER = 'qianji';

const DEFAULT_FILE_EXTENSIONS = ['.csv', '.json'];
const DEFAULT_FALLBACK_ACCOUNT_NAME = '钱迹导入';
const DEFAULT_STATUS_ANCHOR_MODE = 'first_group';
const DEFAULT_ACCOUNT_MAPPING_KEY = '__default__';

const NOTE_ACCOUNT_PATTERN = /(?:^|\|\s*)账户:([^|]+)/u;
const NOTE_BOOK_PATTERN = /(?:^|\|\s*)账本:([^|]+)/u;

function normalizeText(value) {
  return String(value == null ? '' : value).trim();
}

function normalizeLookupKey(value) {
  return normalizeText(value).toLowerCase();
}

function toPositiveInteger(value) {
  const numeric = Number(value);
  return Number.isInteger(numeric) && numeric > 0 ? numeric : 0;
}

function toBoolean(value, fallback = false) {
  if (value === undefined || value === null) {
    return fallback;
  }
  return Boolean(value);
}

function toPosixPath(value) {
  return String(value || '').split(path.sep).join('/');
}

function resolvePath(baseDir, targetPath) {
  const normalized = normalizeText(targetPath);
  if (!normalized) {
    return '';
  }
  return path.isAbsolute(normalized) ? path.normalize(normalized) : path.resolve(baseDir, normalized);
}

function ensurePlainObject(value) {
  return value && typeof value === 'object' && !Array.isArray(value) ? value : {};
}

function buildJsonErrorMessage(payload, fallbackStatus) {
  if (payload && typeof payload === 'object') {
    const detail = normalizeText(payload.detail);
    const message = normalizeText(payload.message);
    if (detail) {
      return detail;
    }
    if (message) {
      return message;
    }
  }
  return fallbackStatus || 'Request failed';
}

export function stripJsonComments(sourceText) {
  const source = String(sourceText || '').replace(/^\uFEFF/, '');
  let result = '';
  let inString = false;
  let escaped = false;
  let lineComment = false;
  let blockComment = false;

  for (let index = 0; index < source.length; index += 1) {
    const current = source[index];
    const next = source[index + 1];

    if (lineComment) {
      if (current === '\n') {
        lineComment = false;
        result += current;
      }
      continue;
    }

    if (blockComment) {
      if (current === '*' && next === '/') {
        blockComment = false;
        index += 1;
      }
      continue;
    }

    if (inString) {
      result += current;
      if (escaped) {
        escaped = false;
      } else if (current === '\\') {
        escaped = true;
      } else if (current === '"') {
        inString = false;
      }
      continue;
    }

    if (current === '"') {
      inString = true;
      result += current;
      continue;
    }

    if (current === '/' && next === '/') {
      lineComment = true;
      index += 1;
      continue;
    }

    if (current === '/' && next === '*') {
      blockComment = true;
      index += 1;
      continue;
    }

    result += current;
  }

  return result;
}

export function parseJsonc(sourceText) {
  return JSON.parse(stripJsonComments(sourceText));
}

function normalizeFileExtensions(value) {
  const source = Array.isArray(value)
    ? value
    : String(value || '')
        .split(',')
        .map((item) => item.trim())
        .filter(Boolean);
  const normalized = source
    .map((item) => {
      const text = normalizeText(item).toLowerCase();
      if (!text) {
        return '';
      }
      return text.startsWith('.') ? text : `.${text}`;
    })
    .filter(Boolean);
  return normalized.length ? Array.from(new Set(normalized)) : [...DEFAULT_FILE_EXTENSIONS];
}

function normalizeAccountMappingValue(value) {
  if (typeof value === 'string') {
    return {
      accountName: normalizeText(value),
      channelCode: '',
      channelName: '',
      currencyCode: '',
      targetAccountId: 0
    };
  }

  const source = ensurePlainObject(value);
  return {
    accountName: normalizeText(source.accountName || source.account_name),
    channelCode: normalizeText(source.channelCode || source.channel_code).toLowerCase(),
    channelName: normalizeText(source.channelName || source.channel_name),
    currencyCode: normalizeText(source.currencyCode || source.currency_code).toUpperCase(),
    targetAccountId: toPositiveInteger(source.targetAccountId || source.target_account_id)
  };
}

function normalizeAccountMappings(value) {
  const source = ensurePlainObject(value);
  const next = new Map();
  Object.entries(source).forEach(([key, mapping]) => {
    const normalizedKey = normalizeLookupKey(key);
    if (!normalizedKey) {
      return;
    }
    next.set(normalizedKey, normalizeAccountMappingValue(mapping));
  });
  return next;
}

export function normalizeSyncConfig(rawConfig, options = {}) {
  const source = ensurePlainObject(rawConfig);
  const baseDir = resolvePath(process.cwd(), options.baseDir || process.cwd()) || process.cwd();
  const apiBaseUrl = normalizeText(source.apiBaseUrl || source.api_base_url).replace(/\/+$/, '');
  if (!apiBaseUrl) {
    throw new Error('config.apiBaseUrl is required');
  }

  const accessToken = normalizeText(source.accessToken || source.access_token);
  const email = normalizeText(source.email);
  const password = normalizeText(source.password);
  const dryRun = toBoolean(source.dryRun, false);
  if (!dryRun && !accessToken && !(email && password)) {
    throw new Error('config.accessToken or config.email + config.password is required');
  }

  const watchDir = resolvePath(baseDir, source.watchDir || source.watch_dir || source.exportDir || source.export_dir);
  if (!watchDir) {
    throw new Error('config.watchDir is required');
  }

  const pollIntervalSeconds = Number(source.pollIntervalSeconds ?? source.poll_interval_seconds);
  const pollIntervalMs =
    Number.isFinite(pollIntervalSeconds) && pollIntervalSeconds > 0
      ? Math.round(pollIntervalSeconds * 1000)
      : DEFAULT_POLL_INTERVAL_MS;

  const processedStateFile =
    resolvePath(baseDir, source.processedStateFile || source.processed_state_file)
    || path.resolve(baseDir, '.qianji-local-sync-state.json');

  const archiveDir = resolvePath(baseDir, source.archiveDir || source.archive_dir);
  const singleTargetAccountId = toPositiveInteger(source.singleTargetAccountId || source.single_target_account_id);
  const singleTargetAccountName = normalizeText(source.singleTargetAccountName || source.single_target_account_name);
  const groupByAccount = source.groupByAccount === undefined ? true : toBoolean(source.groupByAccount, true);

  return {
    apiBaseUrl,
    accessToken,
    email,
    password,
    watchDir,
    recursive: toBoolean(source.recursive, false),
    pollIntervalMs,
    processedStateFile,
    archiveDir,
    provider: normalizeText(source.provider).toLowerCase() || DEFAULT_PROVIDER,
    sourceLabel: normalizeText(source.sourceLabel || source.source_label) || DEFAULT_SOURCE_LABEL,
    fileExtensions: normalizeFileExtensions(source.fileExtensions || source.file_extensions),
    groupByAccount,
    autoCreateAccounts: source.autoCreateAccounts === undefined ? true : toBoolean(source.autoCreateAccounts, true),
    fallbackAccountName: normalizeText(source.fallbackAccountName || source.fallback_account_name) || DEFAULT_FALLBACK_ACCOUNT_NAME,
    singleTargetAccountId,
    singleTargetAccountName,
    nightlyEnabled: toBoolean(source.nightlyEnabled, false),
    dryRun,
    statusAnchorMode: normalizeText(source.statusAnchorMode || source.status_anchor_mode) || DEFAULT_STATUS_ANCHOR_MODE,
    statusAnchorAccountId: toPositiveInteger(source.statusAnchorAccountId || source.status_anchor_account_id),
    statusAnchorAccountName: normalizeText(source.statusAnchorAccountName || source.status_anchor_account_name),
    defaultCurrencyCode: normalizeText(source.defaultCurrencyCode || source.default_currency_code || 'CNY').toUpperCase() || 'CNY',
    accountMappings: normalizeAccountMappings(source.accountMappings || source.account_mappings)
  };
}

async function parseResponse(response) {
  const contentType = String(response.headers.get('content-type') || '').toLowerCase();
  if (contentType.includes('application/json') || contentType.includes('+json') || contentType.includes('application/problem+json')) {
    try {
      return await response.json();
    } catch {
      return null;
    }
  }
  try {
    const text = await response.text();
    return text || null;
  } catch {
    return null;
  }
}

function toSnakeKey(key) {
  return String(key || '')
    .replace(/([a-z0-9])([A-Z])/g, '$1_$2')
    .replace(/[\s-]+/g, '_')
    .toLowerCase();
}

function toSnakeCaseDeep(value) {
  if (Array.isArray(value)) {
    return value.map((item) => toSnakeCaseDeep(item));
  }
  if (!value || typeof value !== 'object' || Object.prototype.toString.call(value) !== '[object Object]') {
    return value;
  }
  const next = {};
  Object.entries(value).forEach(([key, item]) => {
    next[toSnakeKey(key)] = toSnakeCaseDeep(item);
  });
  return next;
}

export class SiteApiError extends Error {
  constructor(message, options = {}) {
    super(message);
    this.name = 'SiteApiError';
    this.status = options.status ?? 0;
    this.body = options.body ?? null;
    this.url = options.url || '';
  }
}

async function siteRequest(config, requestPath, options = {}) {
  const url = `${config.apiBaseUrl}${requestPath.startsWith('/') ? requestPath : `/${requestPath}`}`;
  const headers = {
    ...(options.headers || {})
  };

  if (options.accessToken) {
    headers.Authorization = `Bearer ${options.accessToken}`;
  }

  const fetchOptions = {
    method: String(options.method || 'GET').toUpperCase(),
    headers
  };

  if (options.body !== undefined) {
    headers['Content-Type'] = 'application/json';
    fetchOptions.body = JSON.stringify(toSnakeCaseDeep(options.body));
  }

  let response;
  try {
    response = await fetch(url, fetchOptions);
  } catch (error) {
    throw new SiteApiError(error?.message || 'Network request failed', {
      status: 0,
      url
    });
  }

  const payload = await parseResponse(response);
  if (!response.ok) {
    throw new SiteApiError(buildJsonErrorMessage(payload, response.statusText), {
      status: response.status,
      body: payload,
      url
    });
  }

  if (payload && typeof payload === 'object' && Object.prototype.hasOwnProperty.call(payload, 'data')) {
    return payload.data;
  }
  return payload;
}

export function createSiteApiClient(config) {
  const state = {
    accessToken: normalizeText(config.accessToken)
  };

  async function resolveAccessToken(forceRefresh = false) {
    if (state.accessToken && !forceRefresh) {
      return state.accessToken;
    }
    if (!config.email || !config.password) {
      return state.accessToken;
    }
    const payload = await siteRequest(config, '/api/v1/auth/tokens', {
      method: 'POST',
      body: {
        grantType: 'email_password',
        email: config.email,
        password: config.password
      }
    });
    state.accessToken = normalizeText(payload?.accessToken || payload?.access_token);
    if (!state.accessToken) {
      throw new Error('Failed to issue access token');
    }
    return state.accessToken;
  }

  async function authorizedRequest(requestPath, options = {}) {
    const accessToken = await resolveAccessToken(false);
    try {
      return await siteRequest(config, requestPath, {
        ...options,
        accessToken
      });
    } catch (error) {
      if (!(error instanceof SiteApiError) || error.status !== 401 || !config.email || !config.password) {
        throw error;
      }
      const refreshedToken = await resolveAccessToken(true);
      return siteRequest(config, requestPath, {
        ...options,
        accessToken: refreshedToken
      });
    }
  }

  return {
    async listBalanceAccounts() {
      const payload = await authorizedRequest('/api/v1/light-apps/balance/accounts', { method: 'GET' });
      return Array.isArray(payload) ? payload : [];
    },
    async createBalanceAccount(accountPayload) {
      return authorizedRequest('/api/v1/light-apps/balance/accounts', {
        method: 'POST',
        body: accountPayload
      });
    },
    async upsertSourceAccount(provider, payload) {
      return authorizedRequest(`/api/v1/me/balance/source-accounts/${encodeURIComponent(provider)}`, {
        method: 'PUT',
        body: payload
      });
    },
    async createLocalSyncImportJob(provider, payload) {
      return authorizedRequest(`/api/v1/me/balance/source-accounts/${encodeURIComponent(provider)}/local-sync`, {
        method: 'POST',
        body: payload
      });
    }
  };
}

export async function loadSyncState(stateFilePath) {
  const targetPath = resolvePath(process.cwd(), stateFilePath);
  if (!targetPath) {
    return { version: 1, files: {} };
  }
  try {
    const content = await fs.readFile(targetPath, 'utf8');
    const parsed = JSON.parse(content);
    return {
      version: Number(parsed?.version) || 1,
      files: ensurePlainObject(parsed?.files)
    };
  } catch (error) {
    if (error?.code === 'ENOENT') {
      return { version: 1, files: {} };
    }
    throw error;
  }
}

export async function saveSyncState(stateFilePath, state) {
  const targetPath = resolvePath(process.cwd(), stateFilePath);
  if (!targetPath) {
    return;
  }
  await fs.mkdir(path.dirname(targetPath), { recursive: true });
  await fs.writeFile(
    targetPath,
    `${JSON.stringify({ version: 1, files: ensurePlainObject(state?.files) }, null, 2)}\n`,
    'utf8'
  );
}

async function listFiles(dirPath, recursive, extensions) {
  const results = [];
  const entries = await fs.readdir(dirPath, { withFileTypes: true });
  for (const entry of entries) {
    const absolutePath = path.join(dirPath, entry.name);
    if (entry.isDirectory()) {
      if (recursive) {
        results.push(...(await listFiles(absolutePath, recursive, extensions)));
      }
      continue;
    }
    if (!entry.isFile()) {
      continue;
    }
    if (!extensions.includes(path.extname(entry.name).toLowerCase())) {
      continue;
    }
    results.push(absolutePath);
  }
  return results;
}

async function computeSha256(filePath) {
  const buffer = await fs.readFile(filePath);
  return crypto.createHash('sha256').update(buffer).digest('hex');
}

async function readFileFingerprint(filePath) {
  const stat = await fs.stat(filePath);
  return {
    size: stat.size,
    mtimeMs: stat.mtimeMs,
    sha256: await computeSha256(filePath)
  };
}

function fingerprintsMatch(left, right) {
  return left && right && left.sha256 === right.sha256 && left.size === right.size;
}

function normalizeFileKey(filePath) {
  return path.normalize(filePath);
}

export async function discoverPendingFiles(config, state) {
  const allFiles = await listFiles(config.watchDir, config.recursive, config.fileExtensions);
  const results = [];
  for (const filePath of allFiles) {
    const fingerprint = await readFileFingerprint(filePath);
    const fileKey = normalizeFileKey(filePath);
    const previous = ensurePlainObject(state?.files)?.[fileKey];
    if (fingerprintsMatch(previous, fingerprint)) {
      continue;
    }
    results.push({
      filePath,
      fileKey,
      fingerprint,
      mtimeMs: fingerprint.mtimeMs
    });
  }
  return results.sort((left, right) => left.mtimeMs - right.mtimeMs || left.filePath.localeCompare(right.filePath));
}

export async function parseQianjiExportFile(filePath) {
  const extension = path.extname(filePath).toLowerCase();
  const content = await fs.readFile(filePath, 'utf8');
  const parsed = extension === '.json' ? parseQianjiJsonText(content) : parseQianjiCsvText(content);
  return {
    sourceLabel: DEFAULT_SOURCE_LABEL,
    fileName: path.basename(filePath),
    ...parsed
  };
}

function safeParseJsonRecord(rawPayload) {
  if (typeof rawPayload !== 'string' || !rawPayload.trim()) {
    return null;
  }
  try {
    return JSON.parse(rawPayload);
  } catch {
    return null;
  }
}

function extractAccountFromNote(note) {
  const matched = String(note || '').match(NOTE_ACCOUNT_PATTERN);
  return normalizeText(matched?.[1] || '');
}

function extractBookFromNote(note) {
  const matched = String(note || '').match(NOTE_BOOK_PATTERN);
  return normalizeText(matched?.[1] || '');
}

function decorateTransaction(transaction) {
  const rawRecord = safeParseJsonRecord(transaction?.rawPayload);
  const sourceAccountName = normalizeText(extractQianjiRecordAccount(rawRecord) || extractAccountFromNote(transaction?.note));
  const sourceBookName = normalizeText(extractQianjiRecordBook(rawRecord) || extractBookFromNote(transaction?.note));
  return {
    ...transaction,
    amount: Number(transaction?.amount) || 0,
    currencyCode: normalizeText(transaction?.currencyCode || 'CNY').toUpperCase() || 'CNY',
    occurredAt: normalizeText(transaction?.occurredAt),
    sourceAccountName,
    sourceBookName,
    rawRecord
  };
}

export function groupParsedTransactionsByAccount(parsed, config) {
  const transactions = Array.isArray(parsed?.transactions) ? parsed.transactions.map(decorateTransaction) : [];
  const groups = new Map();

  transactions.forEach((transaction) => {
    if (!transaction.occurredAt || !(transaction.amount > 0)) {
      return;
    }
    const groupAccountName = config.groupByAccount
      ? normalizeText(transaction.sourceAccountName) || config.fallbackAccountName
      : normalizeText(config.singleTargetAccountName) || config.fallbackAccountName;
    const groupKey = config.groupByAccount
      ? `${groupAccountName}::${transaction.currencyCode}`
      : `single::${transaction.currencyCode}`;
    const current = groups.get(groupKey) || {
      groupKey,
      sourceAccountName: groupAccountName,
      sourceBookNames: new Set(),
      currencyCode: transaction.currencyCode,
      requestFromAt: transaction.occurredAt,
      requestToAt: transaction.occurredAt,
      transactions: []
    };

    if (transaction.sourceBookName) {
      current.sourceBookNames.add(transaction.sourceBookName);
    }
    if (!current.requestFromAt || transaction.occurredAt < current.requestFromAt) {
      current.requestFromAt = transaction.occurredAt;
    }
    if (!current.requestToAt || transaction.occurredAt > current.requestToAt) {
      current.requestToAt = transaction.occurredAt;
    }
    current.transactions.push(transaction);
    groups.set(groupKey, current);
  });

  return Array.from(groups.values())
    .map((group) => ({
      ...group,
      sourceBookNames: Array.from(group.sourceBookNames).sort()
    }))
    .sort((left, right) => left.groupKey.localeCompare(right.groupKey));
}

export function inferChannelFromAccountName(sourceAccountName) {
  const normalized = normalizeText(sourceAccountName);
  if (!normalized) {
    return {
      channelCode: 'qianji',
      channelName: '钱迹'
    };
  }

  if (/支付宝|余额宝/u.test(normalized)) {
    return {
      channelCode: 'alipay',
      channelName: '支付宝'
    };
  }
  if (/微信/u.test(normalized)) {
    return {
      channelCode: 'wechat',
      channelName: '微信'
    };
  }
  if (/花呗|信用卡|白条/u.test(normalized)) {
    return {
      channelCode: 'credit_card',
      channelName: '信用卡'
    };
  }
  if (/现金|cash/i.test(normalized)) {
    return {
      channelCode: 'cash',
      channelName: '现金'
    };
  }
  if (/银行|储蓄卡|借记卡|工资卡|卡/u.test(normalized)) {
    return {
      channelCode: 'bank_card',
      channelName: '银行卡'
    };
  }
  return {
    channelCode: 'qianji',
    channelName: '钱迹'
  };
}

function resolveMappingForGroup(group, config) {
  const lookupKeys = [
    group.sourceBookNames.length && group.sourceAccountName
      ? `${normalizeLookupKey(group.sourceBookNames[0])}/${normalizeLookupKey(group.sourceAccountName)}`
      : '',
    normalizeLookupKey(group.sourceAccountName),
    normalizeLookupKey(group.sourceBookNames[0] || ''),
    DEFAULT_ACCOUNT_MAPPING_KEY
  ].filter(Boolean);

  for (const key of lookupKeys) {
    if (config.accountMappings.has(key)) {
      return config.accountMappings.get(key);
    }
  }
  return null;
}

export function buildLocalAccountPlan(group, config) {
  const mapping = resolveMappingForGroup(group, config);
  const inferredChannel = inferChannelFromAccountName(group.sourceAccountName);

  if (!config.groupByAccount) {
    return {
      targetAccountId: config.singleTargetAccountId || mapping?.targetAccountId || 0,
      accountName:
        normalizeText(config.singleTargetAccountName)
        || normalizeText(mapping?.accountName)
        || config.fallbackAccountName,
      channelCode: normalizeText(mapping?.channelCode) || inferredChannel.channelCode,
      channelName: normalizeText(mapping?.channelName) || inferredChannel.channelName,
      currencyCode: normalizeText(mapping?.currencyCode) || group.currencyCode || config.defaultCurrencyCode
    };
  }

  return {
    targetAccountId: mapping?.targetAccountId || 0,
    accountName: normalizeText(mapping?.accountName) || group.sourceAccountName || config.fallbackAccountName,
    channelCode: normalizeText(mapping?.channelCode) || inferredChannel.channelCode,
    channelName: normalizeText(mapping?.channelName) || inferredChannel.channelName,
    currencyCode: normalizeText(mapping?.currencyCode) || group.currencyCode || config.defaultCurrencyCode
  };
}

function matchExistingAccount(accounts, plan) {
  const list = Array.isArray(accounts) ? accounts : [];
  if (plan.targetAccountId > 0) {
    return list.find((item) => Number(item?.accountId || item?.account_id) === plan.targetAccountId) || null;
  }

  const exactMatches = list.filter((item) => {
    const accountName = normalizeText(item?.accountName || item?.account_name);
    const currencyCode = normalizeText(item?.currencyCode || item?.currency_code).toUpperCase();
    return accountName === plan.accountName && currencyCode === plan.currencyCode;
  });

  if (!exactMatches.length) {
    return null;
  }
  return (
    exactMatches.find((item) => normalizeText(item?.channelCode || item?.channel_code).toLowerCase() === plan.channelCode)
    || exactMatches[0]
  );
}

async function ensureBalanceAccount(client, accounts, plan, config) {
  const matched = matchExistingAccount(accounts, plan);
  if (matched) {
    return matched;
  }
  if (!config.autoCreateAccounts) {
    throw new Error(`Local balance account not found: ${plan.accountName} (${plan.currencyCode})`);
  }
  const created = await client.createBalanceAccount({
    channelCode: plan.channelCode,
    channelName: plan.channelName,
    accountName: plan.accountName,
    currencyCode: plan.currencyCode,
    balanceAmount: 0
  });
  accounts.push(created);
  return created;
}

function toUploadTransaction(transaction) {
  return {
    externalId: normalizeText(transaction.externalId) || null,
    occurredAt: normalizeText(transaction.occurredAt),
    direction: normalizeText(transaction.direction).toUpperCase() || 'EXPENSE',
    amount: Number(transaction.amount) || 0,
    currencyCode: normalizeText(transaction.currencyCode || 'CNY').toUpperCase() || 'CNY',
    counterparty: normalizeText(transaction.counterparty) || null,
    categoryHint: normalizeText(transaction.categoryHint) || null,
    note: normalizeText(transaction.note) || null,
    rawPayload: typeof transaction.rawPayload === 'string' ? transaction.rawPayload : JSON.stringify(transaction.rawPayload || {}),
    digest: normalizeText(transaction.digest) || null
  };
}

async function moveProcessedFile(filePath, archiveDir) {
  if (!archiveDir) {
    return filePath;
  }
  await fs.mkdir(archiveDir, { recursive: true });
  const baseName = path.basename(filePath);
  const parsed = path.parse(baseName);
  let targetPath = path.join(archiveDir, baseName);
  let cursor = 2;
  while (true) {
    try {
      await fs.access(targetPath);
      targetPath = path.join(archiveDir, `${parsed.name}.${cursor}${parsed.ext}`);
      cursor += 1;
    } catch {
      break;
    }
  }
  await fs.rename(filePath, targetPath);
  return targetPath;
}

function createCycleSummary() {
  return {
    processedFiles: 0,
    skippedFiles: 0,
    importedCount: 0,
    duplicateCount: 0,
    skippedCount: 0,
    groups: 0
  };
}

function loggerInfo(logger, message) {
  (logger?.info || logger?.log || console.log).call(logger || console, message);
}

function loggerWarn(logger, message) {
  (logger?.warn || logger?.log || console.warn).call(logger || console, message);
}

export async function syncQianjiFile(fileItem, config, client, state, logger = console) {
  const parsed = await parseQianjiExportFile(fileItem.filePath);
  const groups = groupParsedTransactionsByAccount(parsed, config);
  const warnings = Array.isArray(parsed?.warnings) ? parsed.warnings : [];

  if (!groups.length) {
    loggerWarn(logger, `skip ${path.basename(fileItem.filePath)}: no importable income/expense rows`);
    if (!config.dryRun) {
      state.files[fileItem.fileKey] = {
        ...fileItem.fingerprint,
        processedAt: new Date().toISOString(),
        importedCount: 0,
        duplicateCount: 0,
        skippedCount: warnings.length,
        warnings
      };
    }
    return {
      processed: false,
      importedCount: 0,
      duplicateCount: 0,
      skippedCount: warnings.length,
      groups: 0
    };
  }

  if (config.dryRun) {
    groups.forEach((group) => {
      const plan = buildLocalAccountPlan(group, config);
      loggerInfo(
        logger,
        `[dry-run] ${path.basename(fileItem.filePath)} -> ${plan.accountName} (${plan.channelCode}/${plan.currencyCode}) ${group.transactions.length} records`
      );
    });
    return {
      processed: true,
      importedCount: 0,
      duplicateCount: 0,
      skippedCount: warnings.length,
      groups: groups.length
    };
  }

  const accounts = await client.listBalanceAccounts();
  const processedGroups = [];
  const summary = {
    processed: true,
    importedCount: 0,
    duplicateCount: 0,
    skippedCount: 0,
    groups: groups.length
  };

  for (const group of groups) {
    const plan = buildLocalAccountPlan(group, config);
    const account = await ensureBalanceAccount(client, accounts, plan, config);
    const accountId = Number(account.accountId || account.account_id);
    await client.upsertSourceAccount(config.provider, {
      targetAccountId: accountId,
      nightlyEnabled: Boolean(config.nightlyEnabled)
    });

    const job = await client.createLocalSyncImportJob(config.provider, {
      sourceLabel: config.sourceLabel,
      rawFilePath: toPosixPath(fileItem.filePath),
      rawFileName: path.basename(fileItem.filePath),
      requestFromAt: group.requestFromAt,
      requestToAt: group.requestToAt,
      transactions: group.transactions.map((item) => toUploadTransaction(item))
    });

    const status = normalizeText(job?.status).toUpperCase();
    if (status && status !== 'SUCCESS') {
      throw new Error(normalizeText(job?.errorText || job?.error_text) || `Import job failed: ${status}`);
    }

    summary.importedCount += Number(job?.importedCount ?? job?.imported_count) || 0;
    summary.duplicateCount += Number(job?.duplicateCount ?? job?.duplicate_count) || 0;
    summary.skippedCount += Number(job?.skippedCount ?? job?.skipped_count) || 0;
    processedGroups.push({
      accountId,
      accountName: account.accountName || account.account_name || plan.accountName
    });
    loggerInfo(
      logger,
      `imported ${path.basename(fileItem.filePath)} -> ${processedGroups.at(-1).accountName}: `
        + `+${Number(job?.importedCount ?? job?.imported_count) || 0} `
        + `dup ${Number(job?.duplicateCount ?? job?.duplicate_count) || 0} `
        + `skip ${Number(job?.skippedCount ?? job?.skipped_count) || 0}`
    );
  }

  if (!config.dryRun && processedGroups.length) {
    let anchorAccountId = config.statusAnchorAccountId;
    if (!(anchorAccountId > 0)) {
      if (config.statusAnchorAccountName) {
        const anchorPlan = {
          targetAccountId: 0,
          accountName: config.statusAnchorAccountName,
          channelCode: 'qianji',
          channelName: '钱迹',
          currencyCode: config.defaultCurrencyCode
        };
        const latestAccounts = await client.listBalanceAccounts();
        const anchorAccount = await ensureBalanceAccount(client, latestAccounts, anchorPlan, config);
        anchorAccountId = Number(anchorAccount.accountId || anchorAccount.account_id) || 0;
      } else if (config.statusAnchorMode === 'first_group') {
        anchorAccountId = processedGroups[0]?.accountId || 0;
      }
    }
    if (anchorAccountId > 0) {
      await client.upsertSourceAccount(config.provider, {
        targetAccountId: anchorAccountId,
        nightlyEnabled: Boolean(config.nightlyEnabled)
      });
    }
  }

  const finalFilePath = !config.dryRun && config.archiveDir
    ? await moveProcessedFile(fileItem.filePath, config.archiveDir)
    : fileItem.filePath;

  state.files[fileItem.fileKey] = {
    ...fileItem.fingerprint,
    processedAt: new Date().toISOString(),
    archivedTo: finalFilePath !== fileItem.filePath ? toPosixPath(finalFilePath) : '',
    importedCount: summary.importedCount,
    duplicateCount: summary.duplicateCount,
    skippedCount: summary.skippedCount,
    warnings
  };

  return summary;
}

export async function runSyncCycle(config, runtime = {}) {
  const logger = runtime.logger || console;
  const state = runtime.state || (await loadSyncState(config.processedStateFile));
  const client = runtime.client || createSiteApiClient(config);
  const pendingFiles = await discoverPendingFiles(config, state);
  const summary = createCycleSummary();

  if (!pendingFiles.length) {
    loggerInfo(logger, 'no new qianji export files found');
    return { summary, state };
  }

  for (const fileItem of pendingFiles) {
    const result = await syncQianjiFile(fileItem, config, client, state, logger);
    if (result.processed) {
      summary.processedFiles += 1;
      summary.importedCount += result.importedCount;
      summary.duplicateCount += result.duplicateCount;
      summary.skippedCount += result.skippedCount;
      summary.groups += result.groups;
    } else {
      summary.skippedFiles += 1;
      summary.skippedCount += result.skippedCount;
    }
  }

  if (!config.dryRun) {
    await saveSyncState(config.processedStateFile, state);
  }

  return { summary, state };
}
