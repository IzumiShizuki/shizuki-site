import { execFile } from 'node:child_process';
import fs from 'node:fs/promises';
import path from 'node:path';
import { promisify } from 'node:util';
import { fileURLToPath } from 'node:url';
import {
  buildLocalAccountPlan,
  createSiteApiClient,
  inferImportedTransactionSourceAccountName,
  normalizeSyncConfig,
  parseJsonc
} from './qianji-local-sync-lib.mjs';

const execFileAsync = promisify(execFile);
const scriptDir = path.dirname(fileURLToPath(import.meta.url));
const repoRoot = path.resolve(scriptDir, '..', '..');

function printHelp() {
  console.log(`
Usage:
  node qianji-android-db-sync.mjs --config ./qianji-local-sync.config.jsonc

Options:
  --config <path>   Path to the JSONC config file.
  --help            Show this message.
`.trim());
}

function parseArgs(argv) {
  const args = {
    configPath: '',
    help: false
  };

  for (let index = 0; index < argv.length; index += 1) {
    const current = argv[index];
    if (current === '--config') {
      args.configPath = argv[index + 1] || '';
      index += 1;
      continue;
    }
    if (current === '--help' || current === '-h') {
      args.help = true;
    }
  }

  return args;
}

function normalizeText(value) {
  return String(value == null ? '' : value).trim();
}

function toUpperCurrencyCode(value, fallback = 'CNY') {
  return normalizeText(value || fallback).toUpperCase() || fallback;
}

function toAccountKey(accountName, currencyCode) {
  return `${normalizeText(accountName)}::${toUpperCurrencyCode(currencyCode)}`;
}

function toTransactionMatchKey(transaction, fallbackCurrencyCode = 'CNY') {
  const occurredAt = normalizeText(transaction?.occurredAt || transaction?.occurred_at);
  const direction = normalizeText(transaction?.direction).toUpperCase() || 'EXPENSE';
  const amount = (Number(transaction?.amount) || 0).toFixed(2);
  const currencyCode = toUpperCurrencyCode(transaction?.currencyCode || transaction?.currency_code, fallbackCurrencyCode);
  return `${occurredAt}::${direction}::${amount}::${currencyCode}`;
}

function createGroups(parsed, config) {
  const transactions = Array.isArray(parsed?.transactions) ? parsed.transactions : [];
  const groups = new Map();

  transactions.forEach((transaction) => {
    const occurredAt = normalizeText(transaction?.occurredAt);
    const amount = Number(transaction?.amount) || 0;
    if (!occurredAt || !(amount > 0)) {
      return;
    }

    const sourceAccountName = normalizeText(transaction?.sourceAccountName) || config.fallbackAccountName;
    const sourceBookName = normalizeText(transaction?.sourceBookName);
    const currencyCode = normalizeText(transaction?.currencyCode || config.defaultCurrencyCode || 'CNY').toUpperCase() || 'CNY';
    const groupKey = `${sourceAccountName}::${currencyCode}`;
    const current = groups.get(groupKey) || {
      groupKey,
      sourceAccountName,
      sourceBookNames: new Set(),
      currencyCode,
      requestFromAt: occurredAt,
      requestToAt: occurredAt,
      transactions: []
    };

    if (sourceBookName) {
      current.sourceBookNames.add(sourceBookName);
    }
    if (occurredAt < current.requestFromAt) {
      current.requestFromAt = occurredAt;
    }
    if (occurredAt > current.requestToAt) {
      current.requestToAt = occurredAt;
    }
    current.transactions.push({
      externalId: normalizeText(transaction?.externalId),
      occurredAt,
      direction: normalizeText(transaction?.direction).toUpperCase() || 'EXPENSE',
      amount,
      currencyCode,
      counterparty: normalizeText(transaction?.counterparty),
      categoryHint: normalizeText(transaction?.categoryHint),
      note: normalizeText(transaction?.note),
      rawPayload: typeof transaction?.rawPayload === 'string' ? transaction.rawPayload : JSON.stringify(transaction?.rawPayload || {})
    });
    groups.set(groupKey, current);
  });

  return Array.from(groups.values())
    .map((group) => ({
      ...group,
      sourceBookNames: Array.from(group.sourceBookNames).sort()
    }))
    .sort((left, right) => left.groupKey.localeCompare(right.groupKey));
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
    digest: null
  };
}

function toTransactionUpdatePayload(transaction, accountId) {
  const sortNum = Number(transaction?.sortNum ?? transaction?.sort_num) || 0;
  return {
    accountId,
    direction: normalizeText(transaction?.direction).toUpperCase() || 'EXPENSE',
    amount: Number(transaction?.amount) || 0,
    currencyCode: toUpperCurrencyCode(transaction?.currencyCode || transaction?.currency_code),
    category: normalizeText(transaction?.category) || null,
    note: normalizeText(transaction?.note) || null,
    occurredAt: normalizeText(transaction?.occurredAt || transaction?.occurred_at),
    sortNum: sortNum > 0 ? sortNum : undefined
  };
}

function toBalanceAccountPayload(account, balanceAmount) {
  const sortNum = Number(account?.sortNum ?? account?.sort_num) || 0;
  return {
    channelCode: normalizeText(account?.channelCode || account?.channel_code),
    channelName: normalizeText(account?.channelName || account?.channel_name),
    accountName: normalizeText(account?.accountName || account?.account_name),
    currencyCode: toUpperCurrencyCode(account?.currencyCode || account?.currency_code),
    balanceAmount: Number(balanceAmount) || 0,
    sortNum: sortNum > 0 ? sortNum : undefined
  };
}

function createAssetSnapshotMap(parsed, config) {
  const map = new Map();
  const assets = Array.isArray(parsed?.assets) ? parsed.assets : [];
  assets.forEach((asset) => {
    const accountName = normalizeText(asset?.accountName);
    const currencyCode = toUpperCurrencyCode(asset?.currencyCode || config.defaultCurrencyCode);
    if (!accountName) {
      return;
    }
    map.set(toAccountKey(accountName, currencyCode), {
      accountName,
      currencyCode,
      currentBalance: Number(asset?.currentBalance) || 0,
      initialBalance: Number(asset?.initialBalance ?? asset?.currentBalance) || 0
    });
  });
  return map;
}

function createPlanFromAsset(assetSnapshot, config) {
  return buildLocalAccountPlan(
    {
      sourceAccountName: assetSnapshot.accountName,
      sourceBookNames: [],
      currencyCode: assetSnapshot.currencyCode
    },
    config
  );
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

async function loadConfig(configPath) {
  const resolvedConfigPath = path.isAbsolute(configPath)
    ? configPath
    : path.resolve(process.cwd(), configPath || path.join(scriptDir, 'qianji-local-sync.config.jsonc'));
  const raw = await fs.readFile(resolvedConfigPath, 'utf8');
  const parsed = parseJsonc(raw);
  return normalizeSyncConfig(parsed, { baseDir: path.dirname(resolvedConfigPath) });
}

async function runAndroidDbExport() {
  const pythonExe = process.env.QIANJI_SYNC_PYTHON_EXE || 'D:\\environment\\anaconda3\\envs\\py314\\python.exe';
  const exporter = path.join(scriptDir, 'qianji-android-db-export.py');
  const { stdout, stderr } = await execFileAsync(pythonExe, [exporter], {
    windowsHide: true,
    maxBuffer: 10 * 1024 * 1024
  });
  if (stdout.trim()) {
    console.log(stdout.trim());
  }
  if (stderr.trim()) {
    console.warn(stderr.trim());
  }
}

async function rehomeFallbackTransactions(client, config, accounts, groups, parsed, assetSnapshotMap) {
  const fallbackAccountName = normalizeText(config.fallbackAccountName);
  if (!fallbackAccountName || !config.groupByAccount) {
    return { movedCount: 0, unmatchedCount: 0, totalCount: 0 };
  }

  const fallbackAccount = accounts.find((item) => normalizeText(item?.accountName || item?.account_name) === fallbackAccountName);
  const fallbackAccountId = Number(fallbackAccount?.accountId || fallbackAccount?.account_id) || 0;
  if (!fallbackAccountId) {
    return { movedCount: 0, unmatchedCount: 0, totalCount: 0 };
  }

  const targetAccountIdsByKey = new Map();
  groups.forEach((group) => {
    const currencyCode = toUpperCurrencyCode(group.currencyCode || config.defaultCurrencyCode);
    const accountKey = toAccountKey(group.sourceAccountName, currencyCode);
    const matched = accounts.find((item) => {
      const accountName = normalizeText(item?.accountName || item?.account_name);
      const existingCurrencyCode = toUpperCurrencyCode(item?.currencyCode || item?.currency_code || config.defaultCurrencyCode);
      return accountName === normalizeText(group.sourceAccountName) && existingCurrencyCode === currencyCode;
    });
    const targetAccountId = Number(matched?.accountId || matched?.account_id) || 0;
    if (targetAccountId > 0) {
      targetAccountIdsByKey.set(accountKey, targetAccountId);
    }
  });

  if (!targetAccountIdsByKey.size) {
    return { movedCount: 0, unmatchedCount: 0, totalCount: 0 };
  }

  const sourceAccountNamesByTransactionKey = new Map();
  const parsedTransactions = Array.isArray(parsed?.transactions) ? parsed.transactions : [];
  const requiredSeedBalanceByAccountKey = new Map();
  parsedTransactions.forEach((transaction) => {
    const sourceAccountName = normalizeText(transaction?.sourceAccountName);
    const transactionKey = toTransactionMatchKey(transaction, config.defaultCurrencyCode);
    const currencyCode = toUpperCurrencyCode(transaction?.currencyCode || config.defaultCurrencyCode);
    const accountKey = toAccountKey(sourceAccountName, currencyCode);
    if (!sourceAccountName || !transactionKey) {
      return;
    }
    if (!sourceAccountNamesByTransactionKey.has(transactionKey)) {
      sourceAccountNamesByTransactionKey.set(transactionKey, []);
    }
    sourceAccountNamesByTransactionKey.get(transactionKey).push(sourceAccountName);

    if ((normalizeText(transaction?.direction).toUpperCase() || 'EXPENSE') === 'EXPENSE') {
      requiredSeedBalanceByAccountKey.set(
        accountKey,
        (requiredSeedBalanceByAccountKey.get(accountKey) || 0) + (Number(transaction?.amount) || 0)
      );
    }
  });

  const fallbackTransactions = await client.listBalanceTransactions({
    accountId: fallbackAccountId,
    timeZone: 'Asia/Shanghai'
  });
  if (!fallbackTransactions.length) {
    return { movedCount: 0, unmatchedCount: 0, totalCount: 0, fallbackAccountId };
  }

  const preparedTargetAccountIds = new Set();
  for (const [accountKey, targetAccountId] of targetAccountIdsByKey.entries()) {
    const targetTransactions = await client.listBalanceTransactions({
      accountId: targetAccountId,
      timeZone: 'Asia/Shanghai'
    });
    if (targetTransactions.length > 0) {
      continue;
    }
    const assetSnapshot = assetSnapshotMap.get(accountKey);
    const targetAccount = accounts.find((item) => Number(item?.accountId || item?.account_id) === targetAccountId);
    if (!assetSnapshot || !targetAccount) {
      continue;
    }
    const requiredSeedBalance = requiredSeedBalanceByAccountKey.get(accountKey) || 0;
    const preparedBalance = Math.max(requiredSeedBalance, assetSnapshot.initialBalance, 0);
    await client.updateBalanceAccount(targetAccountId, toBalanceAccountPayload(targetAccount, preparedBalance));
    targetAccount.balanceAmount = preparedBalance;
    targetAccount.balance_amount = preparedBalance;
    preparedTargetAccountIds.add(targetAccountId);
  }

  let movedCount = 0;
  let unmatchedCount = 0;

  for (const transaction of fallbackTransactions) {
    const transactionKey = toTransactionMatchKey(transaction, config.defaultCurrencyCode);
    const matchedSourceAccounts = sourceAccountNamesByTransactionKey.get(transactionKey) || [];
    const sourceAccountName = matchedSourceAccounts.length === 1
      ? normalizeText(matchedSourceAccounts[0])
      : inferImportedTransactionSourceAccountName(transaction);
    const currencyCode = toUpperCurrencyCode(transaction?.currencyCode || transaction?.currency_code || config.defaultCurrencyCode);
    const targetAccountId = targetAccountIdsByKey.get(toAccountKey(sourceAccountName, currencyCode)) || 0;
    const transactionId = Number(transaction?.transactionId || transaction?.transaction_id) || 0;

    if (!sourceAccountName || !targetAccountId || !transactionId || targetAccountId === fallbackAccountId) {
      unmatchedCount += 1;
      continue;
    }

    await client.updateBalanceTransaction(transactionId, toTransactionUpdatePayload(transaction, targetAccountId));
    movedCount += 1;
  }

  return {
    movedCount,
    unmatchedCount,
    totalCount: fallbackTransactions.length,
    preparedCount: preparedTargetAccountIds.size,
    fallbackAccountId
  };
}

async function main() {
  const args = parseArgs(process.argv.slice(2));
  if (args.help) {
    printHelp();
    return;
  }

  const config = await loadConfig(args.configPath);
  await runAndroidDbExport();

  const normalizedPath = path.join(repoRoot, 'data', 'qianji-sync', 'android-app-dump', 'normalized-transactions.json');
  const parsed = JSON.parse(await fs.readFile(normalizedPath, 'utf8'));
  const groups = createGroups(parsed, config);
  const assetSnapshotMap = createAssetSnapshotMap(parsed, config);
  if (!groups.length) {
    console.log('qianji-android-db-sync no importable transactions found');
    return;
  }

  const client = createSiteApiClient(config);
  const accounts = await client.listBalanceAccounts();
  const ensuredAccountsByGroupKey = new Map();

  for (const assetSnapshot of assetSnapshotMap.values()) {
    const plan = createPlanFromAsset(assetSnapshot, config);
    const account = await ensureBalanceAccount(client, accounts, plan, config);
    const accountId = Number(account.accountId || account.account_id) || 0;
    if (accountId > 0) {
      account.balanceAmount = assetSnapshot.currentBalance;
      account.balance_amount = assetSnapshot.currentBalance;
    }
  }

  for (const group of groups) {
    const plan = buildLocalAccountPlan(group, config);
    const account = await ensureBalanceAccount(client, accounts, plan, config);
    ensuredAccountsByGroupKey.set(group.groupKey, account);
  }

  const rehomeSummary = await rehomeFallbackTransactions(client, config, accounts, groups, parsed, assetSnapshotMap);
  if (rehomeSummary.totalCount > 0) {
    console.log(
      `qianji-android-db-sync rehome moved=${rehomeSummary.movedCount} `
        + `unmatched=${rehomeSummary.unmatchedCount} prepared=${rehomeSummary.preparedCount || 0} total=${rehomeSummary.totalCount}`
    );
  }

  let importedCount = 0;
  let duplicateCount = 0;
  let skippedCount = 0;
  let anchorAccountId = 0;

  for (const group of groups) {
    const account = ensuredAccountsByGroupKey.get(group.groupKey);
    const accountId = Number(account.accountId || account.account_id) || 0;
    if (!anchorAccountId) {
      anchorAccountId = accountId;
    }

    await client.upsertSourceAccount(config.provider, {
      targetAccountId: accountId,
      nightlyEnabled: Boolean(config.nightlyEnabled)
    });

    const job = await client.createLocalSyncImportJob(config.provider, {
      sourceLabel: 'qianji-android-db',
      rawFilePath: 'android-vhd://com.mutangtech.qianji/databases/qianjiapp',
      rawFileName: 'qianjiapp',
      requestFromAt: group.requestFromAt,
      requestToAt: group.requestToAt,
      transactions: group.transactions.map((item) => toUploadTransaction(item))
    });

    const status = normalizeText(job?.status).toUpperCase();
    if (status && status !== 'SUCCESS') {
      throw new Error(normalizeText(job?.errorText || job?.error_text) || `Import job failed: ${status}`);
    }

    const groupImportedCount = Number(job?.importedCount ?? job?.imported_count) || 0;
    const groupDuplicateCount = Number(job?.duplicateCount ?? job?.duplicate_count) || 0;
    const groupSkippedCount = Number(job?.skippedCount ?? job?.skipped_count) || 0;
    importedCount += groupImportedCount;
    duplicateCount += groupDuplicateCount;
    skippedCount += groupSkippedCount;

    console.log(
      `qianji-android-db-sync ${account.accountName || account.account_name || plan.accountName}: `
        + `+${groupImportedCount} dup ${groupDuplicateCount} skip ${groupSkippedCount}`
    );
  }

  if (anchorAccountId > 0) {
    await client.upsertSourceAccount(config.provider, {
      targetAccountId: anchorAccountId,
      nightlyEnabled: Boolean(config.nightlyEnabled)
    });
  }

  console.log(
    `qianji-android-db-sync summary groups=${groups.length} imported=${importedCount} `
      + `duplicates=${duplicateCount} skipped=${skippedCount}`
  );

  const fallbackAccountId = Number(rehomeSummary.fallbackAccountId) || 0;
  if (fallbackAccountId > 0) {
    const fallbackAccount = accounts.find((item) => Number(item?.accountId || item?.account_id) === fallbackAccountId);
    const fallbackTransactions = await client.listBalanceTransactions({
      accountId: fallbackAccountId,
      timeZone: 'Asia/Shanghai'
    });
    if (fallbackAccount && fallbackTransactions.length === 0) {
      await client.updateBalanceAccount(fallbackAccountId, toBalanceAccountPayload(fallbackAccount, 0));
      fallbackAccount.balanceAmount = 0;
      fallbackAccount.balance_amount = 0;
    }
  }

  for (const assetSnapshot of assetSnapshotMap.values()) {
    const account = accounts.find((item) => {
      const accountName = normalizeText(item?.accountName || item?.account_name);
      const currencyCode = toUpperCurrencyCode(item?.currencyCode || item?.currency_code || config.defaultCurrencyCode);
      return accountName === assetSnapshot.accountName && currencyCode === assetSnapshot.currencyCode;
    });
    const accountId = Number(account?.accountId || account?.account_id) || 0;
    if (!accountId) {
      continue;
    }
    if (assetSnapshot.currentBalance < 0) {
      console.warn(
        `qianji-android-db-sync skip negative balance reconcile ${assetSnapshot.accountName}: ${assetSnapshot.currentBalance}`
      );
      continue;
    }
    await client.updateBalanceAccount(accountId, toBalanceAccountPayload(account, assetSnapshot.currentBalance));
    account.balanceAmount = assetSnapshot.currentBalance;
    account.balance_amount = assetSnapshot.currentBalance;
  }
}

main().catch((error) => {
  console.error(error?.message || error);
  process.exit(1);
});
