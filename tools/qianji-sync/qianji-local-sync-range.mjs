import fs from 'node:fs/promises';
import path from 'node:path';
import { fileURLToPath, pathToFileURL } from 'node:url';
import {
  createSiteApiClient,
  DEFAULT_SOURCE_LABEL,
  groupParsedTransactionsByAccount,
  normalizeSyncConfig,
  parseJsonc,
  parseQianjiExportFile
} from './qianji-local-sync-lib.mjs';

const scriptDir = path.dirname(fileURLToPath(import.meta.url));

function printHelp() {
  console.log(`
Usage:
  node qianji-local-sync-range.mjs --config ./qianji-local-sync.config.jsonc --from 2026-07-01 --to 2026-07-03

Options:
  --config <path>   Path to the JSONC config file.
  --from <date>     Start date in YYYY-MM-DD.
  --to <date>       End date in YYYY-MM-DD.
  --include-archive Scan archiveDir too. Default: true when archiveDir exists.
  --watch-only      Scan watchDir only.
  --dry-run         Resolve matching transactions but do not upload.
  --help            Show this message.
`.trim());
}

function parseArgs(argv) {
  const args = {
    configPath: '',
    fromDate: '',
    toDate: '',
    includeArchive: null,
    dryRun: false,
    help: false
  };

  for (let index = 0; index < argv.length; index += 1) {
    const current = argv[index];
    if (current === '--config') {
      args.configPath = argv[index + 1] || '';
      index += 1;
      continue;
    }
    if (current === '--from') {
      args.fromDate = argv[index + 1] || '';
      index += 1;
      continue;
    }
    if (current === '--to') {
      args.toDate = argv[index + 1] || '';
      index += 1;
      continue;
    }
    if (current === '--include-archive') {
      args.includeArchive = true;
      continue;
    }
    if (current === '--watch-only') {
      args.includeArchive = false;
      continue;
    }
    if (current === '--dry-run') {
      args.dryRun = true;
      continue;
    }
    if (current === '--help' || current === '-h') {
      args.help = true;
    }
  }

  return args;
}

function normalizeDateInput(value, label) {
  const normalized = String(value || '').trim();
  if (!/^\d{4}-\d{2}-\d{2}$/.test(normalized)) {
    throw new Error(`${label} must be YYYY-MM-DD`);
  }
  return normalized;
}

function isTransactionInRange(transaction, fromDate, toDate) {
  const occurredAt = String(transaction?.occurredAt || '').trim();
  const day = occurredAt.slice(0, 10);
  if (!/^\d{4}-\d{2}-\d{2}$/.test(day)) {
    return false;
  }
  return day >= fromDate && day <= toDate;
}

async function loadConfig(configPath, args) {
  const resolvedConfigPath = path.isAbsolute(configPath)
    ? configPath
    : path.resolve(process.cwd(), configPath || path.join(scriptDir, 'qianji-local-sync.config.jsonc'));
  const raw = await fs.readFile(resolvedConfigPath, 'utf8');
  const parsed = parseJsonc(raw);
  return {
    ...normalizeSyncConfig(
      {
        ...parsed,
        dryRun: args.dryRun || parsed?.dryRun
      },
      { baseDir: path.dirname(resolvedConfigPath) }
    ),
    configPath: resolvedConfigPath
  };
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

function inferChannelFromAccountName(sourceAccountName) {
  const normalized = String(sourceAccountName || '').trim();
  if (/支付宝|余额宝/u.test(normalized)) return { channelCode: 'alipay', channelName: '支付宝' };
  if (/微信/u.test(normalized)) return { channelCode: 'wechat', channelName: '微信' };
  if (/花呗|信用卡|白条/u.test(normalized)) return { channelCode: 'credit_card', channelName: '信用卡' };
  if (/现金|cash/i.test(normalized)) return { channelCode: 'cash', channelName: '现金' };
  if (/银行|储蓄卡|借记卡|工资卡|卡/u.test(normalized)) return { channelCode: 'bank_card', channelName: '银行卡' };
  return { channelCode: 'qianji', channelName: '钱迹' };
}

function resolveMappingForGroup(group, config) {
  const keys = [
    String(group?.sourceBookNames?.[0] || '').trim() && String(group?.sourceAccountName || '').trim()
      ? `${String(group.sourceBookNames[0]).trim().toLowerCase()}/${String(group.sourceAccountName).trim().toLowerCase()}`
      : '',
    String(group?.sourceAccountName || '').trim().toLowerCase(),
    String(group?.sourceBookNames?.[0] || '').trim().toLowerCase(),
    '__default__'
  ].filter(Boolean);

  for (const key of keys) {
    if (config.accountMappings.has(key)) {
      return config.accountMappings.get(key);
    }
  }
  return null;
}

function buildLocalAccountPlan(group, config) {
  const mapping = resolveMappingForGroup(group, config);
  const inferredChannel = inferChannelFromAccountName(group.sourceAccountName);
  return {
    targetAccountId: Number(mapping?.targetAccountId) || 0,
    accountName: String(mapping?.accountName || group.sourceAccountName || config.fallbackAccountName).trim(),
    channelCode: String(mapping?.channelCode || inferredChannel.channelCode).trim().toLowerCase(),
    channelName: String(mapping?.channelName || inferredChannel.channelName).trim(),
    currencyCode: String(mapping?.currencyCode || group.currencyCode || config.defaultCurrencyCode).trim().toUpperCase()
  };
}

function matchExistingAccount(accounts, plan) {
  const list = Array.isArray(accounts) ? accounts : [];
  if (plan.targetAccountId > 0) {
    return list.find((item) => Number(item?.accountId || item?.account_id) === plan.targetAccountId) || null;
  }
  const exactMatches = list.filter((item) => {
    const accountName = String(item?.accountName || item?.account_name || '').trim();
    const currencyCode = String(item?.currencyCode || item?.currency_code || '').trim().toUpperCase();
    return accountName === plan.accountName && currencyCode === plan.currencyCode;
  });
  return (
    exactMatches.find((item) => String(item?.channelCode || item?.channel_code || '').trim().toLowerCase() === plan.channelCode)
    || exactMatches[0]
    || null
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
    externalId: String(transaction?.externalId || '').trim() || null,
    occurredAt: String(transaction?.occurredAt || '').trim(),
    direction: String(transaction?.direction || 'EXPENSE').trim().toUpperCase() || 'EXPENSE',
    amount: Number(transaction?.amount) || 0,
    currencyCode: String(transaction?.currencyCode || 'CNY').trim().toUpperCase() || 'CNY',
    counterparty: String(transaction?.counterparty || '').trim() || null,
    categoryHint: String(transaction?.categoryHint || '').trim() || null,
    note: String(transaction?.note || '').trim() || null,
    rawPayload: typeof transaction?.rawPayload === 'string' ? transaction.rawPayload : JSON.stringify(transaction?.rawPayload || {}),
    digest: String(transaction?.digest || '').trim() || null
  };
}

async function importParsedByRange(parsed, filePath, config, client, logger = console) {
  const groups = groupParsedTransactionsByAccount(parsed, config);
  if (!groups.length) {
    return { importedCount: 0, duplicateCount: 0, skippedCount: 0, groups: 0 };
  }

  if (config.dryRun) {
    groups.forEach((group) => {
      const plan = buildLocalAccountPlan(group, config);
      logger.info(
        `[dry-run] ${path.basename(filePath)} -> ${plan.accountName} (${plan.channelCode}/${plan.currencyCode}) ${group.transactions.length} records`
      );
    });
    return { importedCount: 0, duplicateCount: 0, skippedCount: 0, groups: groups.length };
  }

  const accounts = await client.listBalanceAccounts();
  let importedCount = 0;
  let duplicateCount = 0;
  let skippedCount = 0;

  for (const group of groups) {
    const plan = buildLocalAccountPlan(group, config);
    const account = await ensureBalanceAccount(client, accounts, plan, config);
    const targetAccountId = Number(account.accountId || account.account_id);
    await client.upsertSourceAccount(config.provider, {
      targetAccountId,
      nightlyEnabled: Boolean(config.nightlyEnabled)
    });

    const job = await client.createLocalSyncImportJob(config.provider, {
      sourceLabel: `${config.sourceLabel || DEFAULT_SOURCE_LABEL}-range`,
      rawFilePath: filePath.replaceAll('\\', '/'),
      rawFileName: path.basename(filePath),
      requestFromAt: group.requestFromAt,
      requestToAt: group.requestToAt,
      transactions: group.transactions.map((item) => toUploadTransaction(item))
    });

    const status = String(job?.status || '').trim().toUpperCase();
    if (status && status !== 'SUCCESS') {
      throw new Error(String(job?.errorText || job?.error_text || `Import job failed: ${status}`).trim());
    }

    importedCount += Number(job?.importedCount ?? job?.imported_count) || 0;
    duplicateCount += Number(job?.duplicateCount ?? job?.duplicate_count) || 0;
    skippedCount += Number(job?.skippedCount ?? job?.skipped_count) || 0;
    logger.info(
      `backfill ${path.basename(filePath)} -> ${account.accountName || account.account_name || plan.accountName}: `
        + `+${Number(job?.importedCount ?? job?.imported_count) || 0} `
        + `dup ${Number(job?.duplicateCount ?? job?.duplicate_count) || 0} `
        + `skip ${Number(job?.skippedCount ?? job?.skipped_count) || 0}`
    );
  }

  return {
    importedCount,
    duplicateCount,
    skippedCount,
    groups: groups.length
  };
}

export async function runRangeBackfill(args = {}) {
  const config = await loadConfig(args.configPath || '', args);
  const fromDate = normalizeDateInput(args.fromDate, 'from');
  const toDate = normalizeDateInput(args.toDate, 'to');
  if (fromDate > toDate) {
    throw new Error('from must be earlier than or equal to to');
  }

  const includeArchive = args.includeArchive === null
    ? Boolean(config.archiveDir)
    : Boolean(args.includeArchive);

  const sourceDirs = [config.watchDir];
  if (includeArchive && config.archiveDir && config.archiveDir !== config.watchDir) {
    sourceDirs.push(config.archiveDir);
  }

  const client = createSiteApiClient(config);
  const summary = {
    files: 0,
    matchedFiles: 0,
    importedCount: 0,
    duplicateCount: 0,
    skippedCount: 0,
    groups: 0
  };

  const seen = new Set();
  for (const dirPath of sourceDirs) {
    try {
      const files = await listFiles(dirPath, config.recursive, config.fileExtensions);
      for (const filePath of files) {
        if (seen.has(filePath)) {
          continue;
        }
        seen.add(filePath);
        summary.files += 1;
        const parsed = await parseQianjiExportFile(filePath);
        const filteredTransactions = (Array.isArray(parsed.transactions) ? parsed.transactions : [])
          .filter((item) => isTransactionInRange(item, fromDate, toDate));
        if (!filteredTransactions.length) {
          continue;
        }
        summary.matchedFiles += 1;
        const result = await importParsedByRange(
          {
            ...parsed,
            transactions: filteredTransactions,
            requestFromAt: `${fromDate}T00:00:00`,
            requestToAt: `${toDate}T23:59:59`
          },
          filePath,
          config,
          client,
          console
        );
        summary.importedCount += result.importedCount;
        summary.duplicateCount += result.duplicateCount;
        summary.skippedCount += result.skippedCount;
        summary.groups += result.groups;
      }
    } catch (error) {
      console.warn(`skip directory ${dirPath}: ${error?.message || error}`);
    }
  }

  return summary;
}

async function main() {
  const args = parseArgs(process.argv.slice(2));
  if (args.help) {
    printHelp();
    return;
  }
  const summary = await runRangeBackfill(args);
  console.log(
    [
      `files=${summary.files}`,
      `matched_files=${summary.matchedFiles}`,
      `groups=${summary.groups}`,
      `imported=${summary.importedCount}`,
      `duplicates=${summary.duplicateCount}`,
      `skipped_records=${summary.skippedCount}`
    ].join(' ')
  );
}

const isDirectRun = process.argv[1]
  ? import.meta.url === pathToFileURL(path.resolve(process.argv[1])).href
  : false;

if (isDirectRun) {
  main().catch((error) => {
    console.error(error?.message || error);
    process.exitCode = 1;
  });
}
