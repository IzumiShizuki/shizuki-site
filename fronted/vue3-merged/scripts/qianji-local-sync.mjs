import fs from 'node:fs/promises';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { DEFAULT_POLL_INTERVAL_MS, normalizeSyncConfig, parseJsonc, runSyncCycle } from './qianji-local-sync-lib.mjs';

const scriptDir = path.dirname(fileURLToPath(import.meta.url));

function printHelp() {
  console.log(`
Usage:
  node scripts/qianji-local-sync.mjs --config ./scripts/qianji-local-sync.config.jsonc --once
  node scripts/qianji-local-sync.mjs --config ./scripts/qianji-local-sync.config.jsonc --watch

Options:
  --config <path>   Path to the JSONC config file.
  --once            Run one sync cycle and exit.
  --watch           Poll the export directory continuously.
  --dry-run         Parse files and resolve account mapping, but do not call the site API.
  --help            Show this message.
`.trim());
}

function parseArgs(argv) {
  const args = {
    configPath: '',
    once: false,
    watch: false,
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
    if (current === '--once') {
      args.once = true;
      continue;
    }
    if (current === '--watch') {
      args.watch = true;
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

  if (!args.once && !args.watch && !args.help) {
    args.once = true;
  }

  return args;
}

async function loadConfig(configPath, args) {
  const resolvedConfigPath = path.isAbsolute(configPath)
    ? configPath
    : path.resolve(process.cwd(), configPath || path.join(scriptDir, 'qianji-local-sync.config.jsonc'));
  const raw = await fs.readFile(resolvedConfigPath, 'utf8');
  const parsed = parseJsonc(raw);
  const config = normalizeSyncConfig(
    {
      ...parsed,
      dryRun: args.dryRun || parsed?.dryRun
    },
    { baseDir: path.dirname(resolvedConfigPath) }
  );
  return {
    ...config,
    configPath: resolvedConfigPath
  };
}

function logCycleSummary(summary) {
  console.log(
    [
      `processed_files=${summary.processedFiles}`,
      `skipped_files=${summary.skippedFiles}`,
      `groups=${summary.groups}`,
      `imported=${summary.importedCount}`,
      `duplicates=${summary.duplicateCount}`,
      `skipped_records=${summary.skippedCount}`
    ].join(' ')
  );
}

async function runOnce(config) {
  console.log(`qianji-local-sync start watch_dir=${config.watchDir} dry_run=${config.dryRun}`);
  const { summary } = await runSyncCycle(config, { logger: console });
  logCycleSummary(summary);
}

async function runWatch(config) {
  console.log(
    `qianji-local-sync watch watch_dir=${config.watchDir} interval_ms=${config.pollIntervalMs || DEFAULT_POLL_INTERVAL_MS} dry_run=${config.dryRun}`
  );

  let stopped = false;
  const stop = () => {
    stopped = true;
  };
  process.on('SIGINT', stop);
  process.on('SIGTERM', stop);

  while (!stopped) {
    try {
      const { summary } = await runSyncCycle(config, { logger: console });
      logCycleSummary(summary);
    } catch (error) {
      console.error(error?.message || error);
    }

    if (stopped) {
      break;
    }
    await new Promise((resolve) => {
      setTimeout(resolve, config.pollIntervalMs || DEFAULT_POLL_INTERVAL_MS);
    });
  }

  console.log('qianji-local-sync stopped');
}

async function main() {
  const args = parseArgs(process.argv.slice(2));
  if (args.help) {
    printHelp();
    return;
  }

  const config = await loadConfig(args.configPath, args);
  if (args.watch) {
    await runWatch(config);
    return;
  }
  await runOnce(config);
}

main().catch((error) => {
  console.error(error?.message || error);
  process.exit(1);
});
