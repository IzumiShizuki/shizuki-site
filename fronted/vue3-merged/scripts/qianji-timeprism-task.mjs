import fs from 'node:fs/promises';
import path from 'node:path';
import { fileURLToPath, pathToFileURL } from 'node:url';
import { createSiteApiClient, normalizeSyncConfig, parseJsonc } from './qianji-local-sync-lib.mjs';

export const DEFAULT_TIMEPRISM_TASK_MARKER = '[system:qianji-local-sync]';
export const DEFAULT_TIMEPRISM_TASK_TITLE = '钱迹凌晨同步检查';
export const DEFAULT_TIMEPRISM_TASK_CRON = '0 0 2 * * *';
export const DEFAULT_TIMEPRISM_TASK_TIMEZONE = 'Asia/Shanghai';

const scriptDir = path.dirname(fileURLToPath(import.meta.url));

export function resolveTaskColumnCode(columns, preferredColumnCode = 'todo') {
  const normalizedPreferred = String(preferredColumnCode || '').trim().toLowerCase() || 'todo';
  const enabledColumns = (Array.isArray(columns) ? columns : [])
    .map((item) => ({
      columnCode: String(item?.columnCode ?? item?.column_code ?? '').trim().toLowerCase(),
      enabled: item?.enabled !== false
    }))
    .filter((item) => item.columnCode && item.enabled);

  if (!enabledColumns.length) {
    throw new Error('No enabled TimePrism task columns found');
  }

  const preferred = enabledColumns.find((item) => item.columnCode === normalizedPreferred);
  return (preferred || enabledColumns[0]).columnCode;
}

export function buildTimePrismTaskRecurringPayload(options = {}) {
  const title = String(options.title || DEFAULT_TIMEPRISM_TASK_TITLE).trim() || DEFAULT_TIMEPRISM_TASK_TITLE;
  const cronExpr = String(options.cronExpr || DEFAULT_TIMEPRISM_TASK_CRON).trim() || DEFAULT_TIMEPRISM_TASK_CRON;
  const timeZoneId = String(options.timeZoneId || DEFAULT_TIMEPRISM_TASK_TIMEZONE).trim() || DEFAULT_TIMEPRISM_TASK_TIMEZONE;
  const columnCode = String(options.columnCode || 'todo').trim().toLowerCase() || 'todo';
  const detailText = String(options.detail || '').trim();

  return {
    projectId: options.projectId ?? null,
    columnCode,
    title,
    detail: [DEFAULT_TIMEPRISM_TASK_MARKER, detailText || '每天 02:00 检查钱迹本地同步与账单归档状态。'].join('\n'),
    cronExpr,
    timeZoneId,
    enabled: options.enabled !== false
  };
}

export function findExistingQianjiTimePrismRule(rules, options = {}) {
  const marker = String(options.marker || DEFAULT_TIMEPRISM_TASK_MARKER).trim();
  const title = String(options.title || DEFAULT_TIMEPRISM_TASK_TITLE).trim();
  const list = Array.isArray(rules) ? rules : [];

  return (
    list.find((item) => String(item?.detail || '').includes(marker))
    || list.find((item) => String(item?.title || '').trim() === title)
    || null
  );
}

function printHelp() {
  console.log(`
Usage:
  node scripts/qianji-timeprism-task.mjs --config ./scripts/qianji-local-sync.config.jsonc

Options:
  --config <path>   Path to the JSONC config file.
  --title <text>    TimePrism recurring task title.
  --cron <expr>     Cron expression. Default: 0 0 2 * * *
  --timezone <id>   Time zone. Default: Asia/Shanghai
  --column <code>   Preferred task column. Default: todo
  --dry-run         Print the resolved payload without creating/updating.
  --help            Show this message.
`.trim());
}

function parseArgs(argv) {
  const args = {
    configPath: '',
    title: DEFAULT_TIMEPRISM_TASK_TITLE,
    cronExpr: DEFAULT_TIMEPRISM_TASK_CRON,
    timeZoneId: DEFAULT_TIMEPRISM_TASK_TIMEZONE,
    columnCode: 'todo',
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
    if (current === '--title') {
      args.title = argv[index + 1] || args.title;
      index += 1;
      continue;
    }
    if (current === '--cron') {
      args.cronExpr = argv[index + 1] || args.cronExpr;
      index += 1;
      continue;
    }
    if (current === '--timezone') {
      args.timeZoneId = argv[index + 1] || args.timeZoneId;
      index += 1;
      continue;
    }
    if (current === '--column') {
      args.columnCode = argv[index + 1] || args.columnCode;
      index += 1;
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

async function loadConfig(configPath) {
  const resolvedConfigPath = path.isAbsolute(configPath)
    ? configPath
    : path.resolve(process.cwd(), configPath || path.join(scriptDir, 'qianji-local-sync.config.jsonc'));
  const raw = await fs.readFile(resolvedConfigPath, 'utf8');
  const parsed = parseJsonc(raw);
  return {
    ...normalizeSyncConfig(parsed, { baseDir: path.dirname(resolvedConfigPath) }),
    configPath: resolvedConfigPath
  };
}

export async function registerQianjiTimePrismTask(args = {}) {
  const config = await loadConfig(args.configPath || '');
  const client = createSiteApiClient(config);
  const columns = await client.listTaskColumns();
  const rules = await client.listTaskRecurringRules();
  const payload = buildTimePrismTaskRecurringPayload({
    title: args.title,
    cronExpr: args.cronExpr,
    timeZoneId: args.timeZoneId,
    columnCode: resolveTaskColumnCode(columns, args.columnCode),
    enabled: true
  });

  const existing = findExistingQianjiTimePrismRule(rules, {
    title: payload.title
  });

  if (args.dryRun) {
    return {
      action: existing ? 'update' : 'create',
      payload,
      existing
    };
  }

  const result = existing?.ruleId || existing?.rule_id
    ? await client.updateTaskRecurringRule(existing.ruleId || existing.rule_id, payload)
    : await client.createTaskRecurringRule(payload);

  return {
    action: existing ? 'update' : 'create',
    payload,
    existing,
    result
  };
}

async function main() {
  const args = parseArgs(process.argv.slice(2));
  if (args.help) {
    printHelp();
    return;
  }

  const result = await registerQianjiTimePrismTask(args);
  if (args.dryRun) {
    console.log(JSON.stringify(result, null, 2));
    return;
  }
  console.log(
    `${result.action === 'update' ? 'updated' : 'created'} TimePrism recurring task: `
      + `${result.result?.title || result.payload.title} @ ${result.payload.cronExpr} (${result.payload.timeZoneId})`
  );
}

const isDirectRun = process.argv[1]
  ? import.meta.url === pathToFileURL(path.resolve(process.argv[1])).href
  : false;

if (isDirectRun) {
  main().catch((error) => {
    console.error(error?.message || error);
    process.exit(1);
  });
}
