import {
  app,
  BrowserWindow,
  ipcMain,
  Menu,
  nativeImage,
  net,
  protocol,
  screen,
  shell,
  Tray
} from 'electron';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { registerAppProtocol } from './app-protocol.mjs';
import { DesktopCommandDispatcher } from './command-dispatcher.mjs';
import { ControlEventHub, startControlService } from './control-service.mjs';
import { DesktopEnvironmentHost } from './desktop-environment-host.mjs';
import { PairedClientStore } from './pairing-store.mjs';

protocol.registerSchemesAsPrivileged([
  {
    scheme: 'app',
    privileges: {
      standard: true,
      secure: true,
      supportFetchAPI: true,
      stream: true,
      corsEnabled: true
    }
  }
]);

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const distRoot = path.resolve(__dirname, '..', 'dist');
const preloadPath = path.join(__dirname, 'preload.cjs');
const gatewayOrigin = process.env.SHIZUKI_GATEWAY_ORIGIN || 'http://111.228.35.186:8080';
const devUrl = String(process.env.SHIZUKI_DESKTOP_DEV_URL || '').trim();
const baseUrl = devUrl || 'app://shizuki/index.html';
const smokeMode = process.env.SHIZUKI_DESKTOP_SMOKE === '1';
const loginStart = process.argv.includes('--login-start');
const channels = Object.freeze({
  commandResult: 'shizuki-desktop:command-result',
  rendererState: 'shizuki-desktop:renderer-state'
});

app.setName('Shizuki');
if (process.env.SHIZUKI_USER_DATA_DIR) {
  app.setPath('userData', path.resolve(process.env.SHIZUKI_USER_DATA_DIR));
}
const hasSingleInstanceLock = app.requestSingleInstanceLock();
if (!hasSingleInstanceLock) app.quit();

let desktopHost = null;
let controlService = null;
let dispatcher = null;
let pairingStore = null;
let quitting = false;
let allowQuit = false;
let shutdownPromise = null;

function trustedRendererUrl(rawUrl) {
  try {
    const url = new URL(rawUrl);
    if (url.protocol === 'app:' && url.hostname === 'shizuki') return true;
    return Boolean(devUrl) && url.origin === new URL(devUrl).origin;
  } catch {
    return false;
  }
}

function trustedIpcEvent(event) {
  return trustedRendererUrl(event.senderFrame?.url || event.sender?.getURL?.() || '');
}

function handleExternalUrl(rawUrl) {
  try {
    const url = new URL(rawUrl);
    if (!['http:', 'https:'].includes(url.protocol)) return;
    void shell.openExternal(url.toString());
  } catch {
    // Ignore malformed or unsupported external URLs.
  }
}

function openRecoveryDiagnostics() {
  shell.showItemInFolder(path.join(app.getPath('userData'), 'desktop-recovery.json'));
}

function registerRendererIpc() {
  ipcMain.on(channels.rendererState, (event, state) => {
    if (!trustedIpcEvent(event)) return;
    if (desktopHost?.getMainWindow()?.webContents !== event.sender) return;
    dispatcher?.updateRendererState(state);
  });
  ipcMain.on(channels.commandResult, (event, result) => {
    if (!trustedIpcEvent(event)) return;
    if (desktopHost?.getMainWindow()?.webContents !== event.sender) return;
    dispatcher?.completeRendererCommand(result);
  });
}

async function handleImmediateAction(action) {
  if (action === 'music') return desktopHost.openRoute('music');
  if (action === 'todo' || action === 'focus') return desktopHost.openRoute('apps');
  if (action === 'home') return desktopHost.openRoute('home');
  if (action === 'edit') {
    const editing = desktopHost.preferences?.interactionMode === 'edit';
    return desktopHost.setEditMode(!editing);
  }
  throw Object.assign(new Error(`Unsupported immediate action: ${action}`), { code: 'UNSUPPORTED_ACTION' });
}

async function performShutdown() {
  if (shutdownPromise) return shutdownPromise;
  quitting = true;
  shutdownPromise = (async () => {
    dispatcher?.close();
    const results = await Promise.allSettled([
      controlService?.close?.(),
      desktopHost?.stop?.({ restore: true })
    ]);
    for (const result of results) {
      if (result.status === 'rejected') console.error('Shizuki shutdown step failed.', result.reason);
    }
    allowQuit = true;
    app.quit();
  })();
  return shutdownPromise;
}

async function startApplication() {
  if (!hasSingleInstanceLock) return;
  registerAppProtocol({ protocol, net, distRoot, gatewayOrigin });

  pairingStore = new PairedClientStore(path.join(app.getPath('userData'), 'paired-clients.json'));
  await pairingStore.load();

  desktopHost = new DesktopEnvironmentHost({
    app,
    BrowserWindow,
    screen,
    ipcMain,
    Tray,
    Menu,
    nativeImage,
    preloadPath,
    baseUrl,
    userDataPath: app.getPath('userData'),
    pairingStore,
    trustedIpcEvent,
    onExternalUrl: handleExternalUrl,
    onFullExit: () => void performShutdown(),
    onImmediateAction: handleImmediateAction,
    onOpenRecoveryDiagnostics: openRecoveryDiagnostics
  });
  await desktopHost.start();

  const eventHub = new ControlEventHub();
  dispatcher = new DesktopCommandDispatcher({
    getWindow: () => desktopHost.getMainWindow(),
    ensureWindow: () => desktopHost.getMainWindow() || desktopHost.openRoute('home'),
    navigate: destination => desktopHost.openRoute(destination),
    eventHub
  });
  registerRendererIpc();
  controlService = await startControlService({
    manifestPath: path.join(app.getPath('userData'), 'control-api.json'),
    getState: () => ({
      ...dispatcher.getState(),
      desktop: desktopHost.stateSnapshot()
    }),
    dispatchCommand: command => dispatcher.dispatch(command),
    eventHub,
    pairingStore
  });
  eventHub.publish('host.ready', {
    ...dispatcher.getState(),
    desktop: desktopHost.stateSnapshot()
  });

  if (smokeMode) {
    const exitDelay = Math.max(5_000, Number(process.env.SHIZUKI_DESKTOP_SMOKE_EXIT_MS) || 12_000);
    setTimeout(() => void performShutdown(), exitDelay).unref();
  }
}

async function startReadyApplication() {
  if (loginStart) await new Promise(resolve => setTimeout(resolve, 4_000));
  return startApplication();
}

app.on('second-instance', () => desktopHost?.focusMainWindow());

app.on('activate', () => desktopHost?.focusMainWindow());

app.on('window-all-closed', () => {
  // The tray owns desktop lifetime. Full exit is explicit.
});

app.on('before-quit', event => {
  if (allowQuit) return;
  event.preventDefault();
  if (!quitting) void performShutdown();
});

app.whenReady()
  .then(startReadyApplication)
  .catch(error => {
    console.error('Failed to start Shizuki desktop.', error);
    void performShutdown();
  });
