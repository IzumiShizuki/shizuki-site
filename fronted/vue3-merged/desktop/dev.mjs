import { spawn } from 'node:child_process';
import { fileURLToPath } from 'node:url';
import electronPath from 'electron';

const host = '127.0.0.1';
const port = 4175;
const devUrl = `http://${host}:${port}`;
const workspaceRoot = fileURLToPath(new URL('..', import.meta.url));
const viteEntry = fileURLToPath(new URL('../node_modules/vite/bin/vite.js', import.meta.url));

const vite = spawn(process.execPath, [viteEntry.pathname, '--host', host, '--port', String(port), '--strictPort'], {
  cwd: workspaceRoot,
  stdio: 'inherit'
});

async function waitForVite() {
  const deadline = Date.now() + 30_000;
  while (Date.now() < deadline) {
    if (vite.exitCode !== null) throw new Error(`Vite exited with code ${vite.exitCode}.`);
    try {
      const response = await fetch(devUrl);
      if (response.ok) return;
    } catch {
      // Vite is still starting.
    }
    await new Promise(resolve => setTimeout(resolve, 150));
  }
  throw new Error('Timed out waiting for the Vite desktop development server.');
}

let desktop = null;

function stopChildren() {
  if (desktop && desktop.exitCode === null) desktop.kill();
  if (vite.exitCode === null) vite.kill();
}

process.once('SIGINT', stopChildren);
process.once('SIGTERM', stopChildren);
process.once('exit', stopChildren);

try {
  await waitForVite();
  desktop = spawn(electronPath, ['desktop/main.mjs'], {
    cwd: workspaceRoot,
    env: { ...process.env, SHIZUKI_DESKTOP_DEV_URL: devUrl },
    stdio: 'inherit'
  });
  const exitCode = await new Promise(resolve => desktop.once('exit', code => resolve(code ?? 0)));
  stopChildren();
  process.exitCode = exitCode;
} catch (error) {
  console.error(error);
  stopChildren();
  process.exitCode = 1;
}
