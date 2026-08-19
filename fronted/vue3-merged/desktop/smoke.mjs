import { spawn } from 'node:child_process';
import { existsSync, mkdtempSync, readFileSync, rmSync } from 'node:fs';
import { tmpdir } from 'node:os';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import electronPath from 'electron';

const workspaceRoot = fileURLToPath(new URL('..', import.meta.url));
const packagedExecutable = String(process.env.SHIZUKI_DESKTOP_EXECUTABLE || '').trim();
const desktopExecutable = packagedExecutable || electronPath;
const desktopArguments = packagedExecutable ? [] : ['desktop/main.mjs'];
const userDataDir = mkdtempSync(path.join(tmpdir(), 'shizuki-desktop-smoke-'));
const manifestPath = path.join(userDataDir, 'control-api.json');
const environment = {
  ...process.env,
  SHIZUKI_DESKTOP_SMOKE: '1',
  SHIZUKI_DESKTOP_SMOKE_EXIT_MS: '12000',
  SHIZUKI_USER_DATA_DIR: userDataDir
};

function launch() {
  return spawn(desktopExecutable, desktopArguments, {
    cwd: workspaceRoot,
    env: environment,
    stdio: ['ignore', 'pipe', 'pipe']
  });
}

async function waitFor(check, label, timeoutMs = 20_000) {
  const deadline = Date.now() + timeoutMs;
  let lastError = null;
  while (Date.now() < deadline) {
    try {
      const value = await check();
      if (value) return value;
    } catch (error) {
      lastError = error;
    }
    await new Promise(resolve => setTimeout(resolve, 150));
  }
  throw new Error(`Timed out waiting for ${label}.${lastError ? ` ${lastError.message}` : ''}`);
}

async function request(manifest, pathname, options = {}) {
  return fetch(`${manifest.endpoint}${pathname}`, {
    ...options,
    headers: {
      authorization: `Bearer ${manifest.token}`,
      ...(options.body ? { 'content-type': 'application/json' } : {}),
      ...(options.headers || {})
    }
  });
}

async function sendCommand(manifest, id, command, payload = {}) {
  const response = await request(manifest, '/v1/commands', {
    method: 'POST',
    body: JSON.stringify({ id, command, payload })
  });
  const body = await response.json();
  if (!response.ok || body.ok !== true) throw new Error(`Command ${command} failed: ${JSON.stringify(body)}`);
  return body.result;
}

const desktop = launch();
let stderr = '';
desktop.stderr.on('data', chunk => { stderr += chunk.toString(); });

try {
  const manifest = await waitFor(() => {
    if (desktop.exitCode !== null) {
      throw new Error(`Desktop exited before publishing its manifest (code ${desktop.exitCode}). ${stderr}`);
    }
    if (!existsSync(manifestPath)) return null;
    return JSON.parse(readFileSync(manifestPath, 'utf8'));
  }, 'control manifest');

  const health = await fetch(`${manifest.endpoint}/v1/health`).then(response => response.json());
  if (health.status !== 'ok' || health.protocolVersion !== '1.0') throw new Error('Unexpected health response.');

  await waitFor(async () => {
    const response = await request(manifest, '/v1/state');
    const state = await response.json();
    return state.renderer?.ready ? state : null;
  }, 'renderer readiness');

  const navigation = await sendCommand(manifest, 'smoke-nav', 'app.navigate', { destination: 'music' });
  if (navigation.route?.path !== '/music-library/music') throw new Error('Renderer did not navigate to the music workspace.');
  await sendCommand(manifest, 'smoke-music', 'music.toggle');
  const hidden = await sendCommand(manifest, 'smoke-window', 'window.hide');
  if (hidden.window?.visible !== false) throw new Error('Native window command did not update visibility.');

  const second = launch();
  const secondExit = await new Promise((resolve, reject) => {
    const timer = setTimeout(() => reject(new Error('Second desktop instance did not exit.')), 5_000);
    second.once('exit', code => {
      clearTimeout(timer);
      resolve(code ?? 0);
    });
  });
  if (secondExit !== 0) throw new Error(`Second desktop instance exited with code ${secondExit}.`);

  const stillRunning = await request(manifest, '/v1/state');
  if (!stillRunning.ok) throw new Error('Primary desktop instance stopped after second-instance launch.');

  const exitCode = await new Promise(resolve => desktop.once('exit', code => resolve(code ?? 0)));
  if (exitCode !== 0) throw new Error(`Desktop smoke process exited with code ${exitCode}. ${stderr}`);
  if (existsSync(manifestPath)) throw new Error('Control manifest was not removed during graceful shutdown.');
  console.log('Shizuki desktop smoke test passed.');
} finally {
  if (desktop.exitCode === null) {
    desktop.kill();
    await Promise.race([
      new Promise(resolve => desktop.once('exit', resolve)),
      new Promise(resolve => setTimeout(resolve, 3_000))
    ]);
  }
  try {
    rmSync(userDataDir, { recursive: true, force: true, maxRetries: 10, retryDelay: 200 });
  } catch (error) {
    console.warn(`Smoke temp cleanup deferred: ${error.message}`);
  }
}
