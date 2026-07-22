import fs from 'node:fs/promises';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { normalizeSyncConfig, parseJsonc, syncQianjiAuthTokens } from './qianji-local-sync-lib.mjs';

const scriptDir = path.dirname(fileURLToPath(import.meta.url));

function printHelp() {
  console.log(`
Usage:
  node qianji-local-sync-token.mjs --config ./qianji-local-sync.config.jsonc --issue
  node qianji-local-sync-token.mjs --config ./qianji-local-sync.config.jsonc --refresh

Options:
  --config <path>   Path to the JSONC config file.
  --issue           Issue fresh access/refresh tokens with email + password.
  --refresh         Refresh access token with refresh token.
  --help            Show this message.
`.trim());
}

function parseArgs(argv) {
  const args = {
    configPath: '',
    mode: 'auto',
    help: false
  };

  for (let index = 0; index < argv.length; index += 1) {
    const current = argv[index];
    if (current === '--config') {
      args.configPath = argv[index + 1] || '';
      index += 1;
      continue;
    }
    if (current === '--issue') {
      args.mode = 'issue';
      continue;
    }
    if (current === '--refresh') {
      args.mode = 'refresh';
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
  return normalizeSyncConfig(parsed, { baseDir: path.dirname(resolvedConfigPath) });
}

async function main() {
  const args = parseArgs(process.argv.slice(2));
  if (args.help) {
    printHelp();
    return;
  }

  const config = await loadConfig(args.configPath);
  const result = await syncQianjiAuthTokens(config, { mode: args.mode });

  console.log(
    [
      `mode=${args.mode}`,
      `access_token_len=${String(result.accessToken || '').length}`,
      `refresh_token_len=${String(result.refreshToken || '').length}`,
      `auth_state_file=${config.authStateFile}`
    ].join(' ')
  );
}

main().catch((error) => {
  console.error(error?.message || error);
  process.exitCode = 1;
});
