import { app, BrowserWindow, ipcMain, net, protocol, screen, shell } from 'electron';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { registerAppProtocol } from './app-protocol.mjs';
import { DesktopCommandDispatcher } from './command-dispatcher.mjs';
import { ControlEventHub, startControlService } from './control-service.mjs';
import { readWindowState, writeWindowState } from './window-state.mjs';

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
const smokeMode = process.env.SHIZUKI_DESKTOP_SMOKE === '1';
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

let mainWindow = null;
let controlService = null;
let dispatcher = null;
let quitting = false;
let allowQuit = false;

function displayAreas() {
  const primary = screen.getPrimaryDisplay();
  return [primary, ...screen.getAllDisplays().filter(display => display.id !== primary.id)]
    .map(display => display.workArea);
}

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

function persistWindowState() {
  if (!mainWindow || mainWindow.isDestroyed()) return;
  const bounds = mainWindow.getNormalBounds();
  writeWindowState(path.join(app.getPath('userData'), 'window-state.json'), {
    ...bounds,
    maximized: mainWindow.isMaximized()
  });
}

function focusMainWindow() {
  if (!mainWindow || mainWindow.isDestroyed()) return;
  if (mainWindow.isMinimized()) mainWindow.restore();
  mainWindow.show();
  mainWindow.focus();
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

function createMainWindow() {
  const saved = readWindowState(path.join(app.getPath('userData'), 'window-state.json'), displayAreas());
  mainWindow = new BrowserWindow({
    title: 'Shizuki',
    x: saved.x,
    y: saved.y,
    width: saved.width,
    height: saved.height,
    minWidth: 720,
    minHeight: 520,
    show: false,
    backgroundColor: '#111827',
    webPreferences: {
      preload: preloadPath,
      contextIsolation: true,
      nodeIntegration: false,
      sandbox: true,
      webSecurity: true
    }
  });
  if (saved.maximized) mainWindow.maximize();

  mainWindow.webContents.setWindowOpenHandler(({ url }) => {
    if (trustedRendererUrl(url)) return { action: 'allow' };
    handleExternalUrl(url);
    return { action: 'deny' };
  });
  mainWindow.webContents.on('will-navigate', (event, url) => {
    if (trustedRendererUrl(url)) return;
    event.preventDefault();
    handleExternalUrl(url);
  });
  mainWindow.once('ready-to-show', () => {
    if (!smokeMode) mainWindow?.show();
  });
  mainWindow.on('close', persistWindowState);
  mainWindow.on('closed', () => {
    mainWindow = null;
  });
  void mainWindow.loadURL(devUrl || 'app://shizuki/index.html');
  return mainWindow;
}

function registerIpc() {
  ipcMain.on(channels.rendererState, (event, state) => {
    if (!trustedIpcEvent(event)) return;
    dispatcher?.updateRendererState(state);
  });
  ipcMain.on(channels.commandResult, (event, result) => {
    if (!trustedIpcEvent(event)) return;
    dispatcher?.completeRendererCommand(result);
  });
}

async function startApplication() {
  if (!hasSingleInstanceLock) return;
  registerAppProtocol({ protocol, net, distRoot, gatewayOrigin });
  createMainWindow();
  const eventHub = new ControlEventHub();
  dispatcher = new DesktopCommandDispatcher({ getWindow: () => mainWindow, eventHub });
  registerIpc();
  controlService = await startControlService({
    manifestPath: path.join(app.getPath('userData'), 'control-api.json'),
    getState: () => dispatcher.getState(),
    dispatchCommand: command => dispatcher.dispatch(command),
    eventHub
  });
  eventHub.publish('host.ready', dispatcher.getState());
  if (smokeMode) {
    const exitDelay = Math.max(5_000, Number(process.env.SHIZUKI_DESKTOP_SMOKE_EXIT_MS) || 12_000);
    setTimeout(() => app.quit(), exitDelay).unref();
  }
}

app.on('second-instance', focusMainWindow);

app.on('activate', () => {
  if (!mainWindow) createMainWindow();
  else focusMainWindow();
});

app.on('window-all-closed', () => {
  if (process.platform !== 'darwin') app.quit();
});

app.on('before-quit', event => {
  if (allowQuit || quitting) return;
  event.preventDefault();
  quitting = true;
  persistWindowState();
  dispatcher?.close();
  Promise.resolve(controlService?.close())
    .catch(error => console.error('Failed to stop Shizuki control service.', error))
    .finally(() => {
      allowQuit = true;
      app.quit();
    });
});

app.whenReady()
  .then(startApplication)
  .catch(error => {
    console.error('Failed to start Shizuki desktop.', error);
    app.quit();
  });
