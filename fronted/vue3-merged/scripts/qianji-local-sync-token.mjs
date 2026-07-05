import { spawn } from 'node:child_process';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const scriptDir = path.dirname(fileURLToPath(import.meta.url));
const targetScript = path.resolve(scriptDir, '../../../tools/qianji-sync/qianji-local-sync-token.mjs');

const child = spawn(process.execPath, [targetScript, ...process.argv.slice(2)], {
  stdio: 'inherit'
});

child.on('exit', (code, signal) => {
  if (signal) {
    process.kill(process.pid, signal);
    return;
  }
  process.exit(code ?? 1);
});
