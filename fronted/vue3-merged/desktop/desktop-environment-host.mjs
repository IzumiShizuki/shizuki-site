import path from 'node:path';
import { DesktopPreferencesStore } from './desktop-preferences.mjs';
import { RecoveryJournal } from './recovery-journal.mjs';
import { WindowsDesktopAdapter } from './windows-desktop-adapter.mjs';
import {
  ControlOrbWindow,
  DesktopSurfaceManager,
  ReusableMainWindow
} from './window-roles.mjs';

export const DESKTOP_HOST_CHANNELS = Object.freeze({
  openRoute: 'shizuki-desktop:open-route',
  setInputPassThrough: 'shizuki-desktop:set-input-pass-through',
  setOrbLevel: 'shizuki-desktop:set-orb-level',
  getState: 'shizuki-desktop:get-state',
  setEditMode: 'shizuki-desktop:set-edit-mode',
  setIconsVisible: 'shizuki-desktop:set-icons-visible',
  setLaunchAtLogin: 'shizuki-desktop:set-launch-at-login',
  getPairingSnapshot: 'shizuki-desktop:get-pairing-snapshot',
  approvePairing: 'shizuki-desktop:approve-pairing',
  rejectPairing: 'shizuki-desktop:reject-pairing',
  revokePairedClient: 'shizuki-desktop:revoke-paired-client',
  fullExit: 'shizuki-desktop:full-exit',
  immediateAction: 'shizuki-desktop:immediate-action'
});

function trayImage(nativeImage) {
  const svg = `<svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 32 32"><defs><linearGradient id="g" x1="0" y1="0" x2="1" y2="1"><stop stop-color="#ffb8a7"/><stop offset="1" stop-color="#9d8cff"/></linearGradient></defs><circle cx="16" cy="16" r="14" fill="url(#g)"/><path d="M10 19c2.8 3 9.2 3 12 0M11 12.5h.01M21 12.5h.01" stroke="#271c36" stroke-width="2.2" stroke-linecap="round" fill="none"/></svg>`;
  return nativeImage.createFromDataURL(`data:image/svg+xml;charset=utf-8,${encodeURIComponent(svg)}`);
}

export function desktopEnvironmentEnabled(env = process.env) {
  return String(env.SHIZUKI_DESKTOP_ENVIRONMENT || '1').trim() !== '0';
}

export class DesktopEnvironmentHost {
  constructor({
    app,
    BrowserWindow,
    screen,
    ipcMain,
    Tray,
    Menu,
    nativeImage,
    preloadPath,
    baseUrl,
    userDataPath,
    adapter = new WindowsDesktopAdapter(),
    pairingStore = null,
    trustedIpcEvent = () => false,
    onExternalUrl = () => {},
    onFullExit = () => {},
    onImmediateAction = () => {},
    onOpenRecoveryDiagnostics = () => {},
    logger = console,
    enabled = desktopEnvironmentEnabled()
  }) {
    this.app = app;
    this.BrowserWindow = BrowserWindow;
    this.screen = screen;
    this.ipcMain = ipcMain;
    this.Tray = Tray;
    this.Menu = Menu;
    this.nativeImage = nativeImage;
    this.preloadPath = preloadPath;
    this.baseUrl = baseUrl;
    this.userDataPath = userDataPath;
    this.adapter = adapter;
    this.pairingStore = pairingStore;
    this.trustedIpcEvent = trustedIpcEvent;
    this.onExternalUrl = onExternalUrl;
    this.onFullExit = onFullExit;
    this.onImmediateAction = onImmediateAction;
    this.onOpenRecoveryDiagnostics = onOpenRecoveryDiagnostics;
    this.logger = logger;
    this.enabled = enabled;
    this.preferencesStore = new DesktopPreferencesStore(path.join(userDataPath, 'desktop-state.json'));
    this.recoveryJournal = new RecoveryJournal(path.join(userDataPath, 'desktop-recovery.json'));
    this.preferences = null;
    this.nativeMutationsEnabled = false;
    this.tray = null;
    this.stopping = false;
    this.attachmentFailures = [];
    this.handlers = [];
    this.mainWindow = new ReusableMainWindow({
      BrowserWindow,
      screen,
      preloadPath,
      baseUrl,
      onExternalUrl,
      onBoundsChanged: (bounds, maximized) => void this.saveMainBounds(bounds, maximized)
    });
    this.desktopSurfaces = null;
    this.orb = null;
  }

  async start() {
    const preferencesResult = await this.preferencesStore.load();
    this.preferences = preferencesResult.value;
    const journalResult = await this.recoveryJournal.load();
    this.mainWindow.setInitialBounds(this.preferences.windows.main);
    this.nativeMutationsEnabled = !preferencesResult.recoveredFromInvalid && !journalResult.recoveredFromInvalid;

    if (!this.recoveryJournal.state.cleanShutdown) {
      const recovery = await this.recoveryJournal.restoreOutstanding(mutation => this.restoreMutation(mutation));
      this.nativeMutationsEnabled = this.nativeMutationsEnabled && recovery.restored;
    }
    await this.recoveryJournal.beginSession({
      safeMode: !this.nativeMutationsEnabled || this.recoveryJournal.state.safeMode,
      recoveryErrors: this.recoveryJournal.state.recoveryErrors
    });

    if (!this.enabled) {
      this.mainWindow.openDestination('home');
      return this;
    }

    this.desktopSurfaces = new DesktopSurfaceManager({
      BrowserWindow: this.BrowserWindow,
      screen: this.screen,
      adapter: this.adapter,
      preloadPath: this.preloadPath,
      baseUrl: this.baseUrl,
      onAttachmentFailure: (error, record) => {
        this.attachmentFailures.push({
          displayId: record.displayId,
          message: String(error?.message || error),
          at: new Date().toISOString()
        });
        this.attachmentFailures = this.attachmentFailures.slice(-20);
        this.logger.warn?.('Shizuki desktop attachment failed.', error);
      }
    });
    this.orb = new ControlOrbWindow({
      BrowserWindow: this.BrowserWindow,
      screen: this.screen,
      adapter: this.adapter,
      preloadPath: this.preloadPath,
      baseUrl: this.baseUrl,
      preferences: this.preferences,
      onPositionChanged: (displayId, position) => void this.saveOrbPosition(displayId, position)
    });

    this.registerIpc();
    await this.desktopSurfaces.start();
    this.orb.create();
    await this.applyLaunchAtLogin(this.preferences.launchAtLogin, { persist: false });
    if (this.preferences.cleanDesktopEnabled) {
      await this.setIconsVisible(false).catch(error => {
        this.logger.warn?.('Unable to hide desktop icons safely.', error);
      });
    }
    this.createTray();
    return this;
  }

  stateSnapshot() {
    return {
      enabled: this.enabled,
      safeMode: !this.nativeMutationsEnabled || this.recoveryJournal.state.safeMode,
      preferences: structuredClone(this.preferences),
      desktopSurfaces: this.desktopSurfaces
        ? [...this.desktopSurfaces.surfaces.values()].map(record => ({
            displayId: record.displayId,
            attached: record.attached,
            fallback: record.fallback,
            bounds: record.bounds
          }))
        : [],
      attachmentFailures: structuredClone(this.attachmentFailures),
      pairing: this.pairingStore
        ? { pendingCount: this.pairingStore.listPending().length, clientCount: this.pairingStore.listClients().length }
        : { pendingCount: 0, clientCount: 0 }
    };
  }

  getMainWindow() {
    return this.mainWindow.getWindow();
  }

  openRoute(destination) {
    return this.mainWindow.openDestination(destination);
  }

  focusMainWindow() {
    return this.mainWindow.focus();
  }

  async saveMainBounds(bounds, maximized) {
    if (!this.preferences) return;
    await this.preferencesStore.update(state => {
      state.windows.main = { ...bounds, maximized: Boolean(maximized) };
    });
    this.preferences = this.preferencesStore.snapshot();
  }

  async saveOrbPosition(displayId, position) {
    if (!this.preferences) return;
    await this.preferencesStore.update(state => {
      state.orb.displays[String(displayId)] = { x: position.x, y: position.y };
    });
    this.preferences = this.preferencesStore.snapshot();
    if (this.orb) this.orb.preferences = this.preferences;
  }

  async setEditMode(enabled) {
    await this.preferencesStore.update(state => {
      state.interactionMode = enabled ? 'edit' : 'normal';
    });
    this.preferences = this.preferencesStore.snapshot();
    for (const record of this.desktopSurfaces?.surfaces.values() || []) {
      this.desktopSurfaces.setInputPassThrough(record.displayId, !enabled);
    }
    this.rebuildTrayMenu();
    return this.stateSnapshot();
  }

  async setIconsVisible(visible) {
    if (!this.nativeMutationsEnabled) {
      throw Object.assign(new Error('Desktop mutations are disabled until recovery is resolved.'), { code: 'SAFE_MODE' });
    }
    const current = await this.adapter.getDesktopIconsVisible();
    if (current !== Boolean(visible)) {
      const mutation = await this.recoveryJournal.recordIntent('desktop-icons', current, Boolean(visible));
      const actual = await this.adapter.setDesktopIconsVisible(Boolean(visible));
      if (actual !== Boolean(visible)) throw new Error('Explorer did not apply the requested icon visibility.');
      await this.recoveryJournal.markApplied(mutation.id);
    }
    await this.preferencesStore.update(state => {
      state.cleanDesktopEnabled = !Boolean(visible);
    });
    this.preferences = this.preferencesStore.snapshot();
    this.rebuildTrayMenu();
    return { visible: Boolean(visible) };
  }

  async restoreMutation(mutation) {
    if (mutation.type === 'desktop-icons') {
      await this.adapter.setDesktopIconsVisible(Boolean(mutation.originalValue));
      return;
    }
    throw new Error(`No recovery adapter exists for mutation type: ${mutation.type}`);
  }

  async applyLaunchAtLogin(enabled, { persist = true } = {}) {
    const desired = Boolean(enabled);
    this.app.setLoginItemSettings({
      openAtLogin: desired,
      args: desired ? ['--login-start', '--hidden'] : []
    });
    if (persist) {
      await this.preferencesStore.update(state => {
        state.launchAtLogin = desired;
      });
      this.preferences = this.preferencesStore.snapshot();
      this.rebuildTrayMenu();
    }
    return { enabled: desired, registered: Boolean(this.app.getLoginItemSettings().openAtLogin) };
  }

  createTray() {
    if (this.tray) return this.tray;
    this.tray = new this.Tray(trayImage(this.nativeImage));
    this.tray.setToolTip('Shizuki Desktop');
    this.tray.on('click', () => this.focusMainWindow());
    this.rebuildTrayMenu();
    return this.tray;
  }

  rebuildTrayMenu() {
    if (!this.tray || !this.preferences) return;
    this.tray.setContextMenu(this.Menu.buildFromTemplate([
      { label: '打开 Shizuki', click: () => this.openRoute('home') },
      { label: '显示全局控制中心', click: () => this.orb?.show() },
      { type: 'separator' },
      ...((!this.nativeMutationsEnabled || this.recoveryJournal.state.safeMode) ? [{
        label: '安全模式：打开桌面恢复日志',
        click: () => this.onOpenRecoveryDiagnostics()
      }, { type: 'separator' }] : []),
      {
        label: this.preferences.cleanDesktopEnabled ? '显示 Windows 桌面图标' : '隐藏 Windows 桌面图标',
        enabled: this.nativeMutationsEnabled && !this.recoveryJournal.state.safeMode,
        click: () => void this.setIconsVisible(this.preferences.cleanDesktopEnabled)
      },
      {
        label: this.preferences.interactionMode === 'edit' ? '退出桌面编辑模式' : '进入桌面编辑模式',
        click: () => void this.setEditMode(this.preferences.interactionMode !== 'edit')
      },
      {
        label: '开机启动',
        type: 'checkbox',
        checked: this.preferences.launchAtLogin,
        click: item => void this.applyLaunchAtLogin(item.checked)
      },
      { type: 'separator' },
      { label: '完全退出并恢复桌面', click: () => this.onFullExit() }
    ]));
  }

  registerHandle(channel, handler, authorize = () => true) {
    this.ipcMain.handle(channel, async (event, payload) => {
      if (!this.trustedIpcEvent(event)) throw Object.assign(new Error('Untrusted renderer.'), { code: 'UNTRUSTED_RENDERER' });
      if (!authorize(payload, event)) throw Object.assign(new Error('Renderer is not authorized for this surface action.'), { code: 'SURFACE_MISMATCH' });
      return handler(payload, event);
    });
    this.handlers.push(channel);
  }

  registerIpc() {
    const pairingReviewer = (_payload, event) => {
      if (this.mainWindow.getWindow()?.webContents === event.sender) return true;
      return [...(this.desktopSurfaces?.surfaces.values() || [])]
        .some(record => record.window.webContents === event.sender);
    };
    this.registerHandle(DESKTOP_HOST_CHANNELS.openRoute, payload => {
      this.openRoute(String(payload?.destination || ''));
      return { ok: true };
    });
    this.registerHandle(DESKTOP_HOST_CHANNELS.setInputPassThrough, payload => ({
      applied: this.desktopSurfaces?.setInputPassThrough(payload?.displayId, Boolean(payload?.passThrough)) || false
    }), (payload, event) => {
      const record = this.desktopSurfaces?.surfaces.get(String(payload?.displayId));
      return Boolean(record && record.window.webContents === event.sender);
    });
    this.registerHandle(DESKTOP_HOST_CHANNELS.setOrbLevel, payload => {
      this.orb?.setLevel(String(payload?.level || 'collapsed'));
      return { ok: true };
    }, (_payload, event) => Boolean(this.orb?.window && this.orb.window.webContents === event.sender));
    this.registerHandle(DESKTOP_HOST_CHANNELS.getState, () => this.stateSnapshot());
    this.registerHandle(DESKTOP_HOST_CHANNELS.setEditMode, payload => this.setEditMode(Boolean(payload?.enabled)));
    this.registerHandle(DESKTOP_HOST_CHANNELS.setIconsVisible, payload => this.setIconsVisible(Boolean(payload?.visible)));
    this.registerHandle(DESKTOP_HOST_CHANNELS.setLaunchAtLogin, payload => this.applyLaunchAtLogin(Boolean(payload?.enabled)));
    this.registerHandle(DESKTOP_HOST_CHANNELS.getPairingSnapshot, async () => {
      if (!this.pairingStore) return { pending: [], clients: [], audit: [] };
      await this.pairingStore.expireRequests();
      return {
        pending: this.pairingStore.listPending(),
        clients: this.pairingStore.listClients(),
        audit: this.pairingStore.listAudit()
      };
    }, pairingReviewer);
    this.registerHandle(DESKTOP_HOST_CHANNELS.approvePairing, payload => {
      if (!this.pairingStore) throw Object.assign(new Error('Pairing is not enabled.'), { code: 'PAIRING_DISABLED' });
      return this.pairingStore.approve(String(payload?.requestId || ''), payload?.capabilities);
    }, pairingReviewer);
    this.registerHandle(DESKTOP_HOST_CHANNELS.rejectPairing, payload => {
      if (!this.pairingStore) throw Object.assign(new Error('Pairing is not enabled.'), { code: 'PAIRING_DISABLED' });
      return this.pairingStore.reject(String(payload?.requestId || ''));
    }, pairingReviewer);
    this.registerHandle(DESKTOP_HOST_CHANNELS.revokePairedClient, payload => {
      if (!this.pairingStore) throw Object.assign(new Error('Pairing is not enabled.'), { code: 'PAIRING_DISABLED' });
      return this.pairingStore.revoke(String(payload?.clientId || ''));
    }, pairingReviewer);
    this.registerHandle(DESKTOP_HOST_CHANNELS.immediateAction, payload => this.onImmediateAction(String(payload?.action || '')));
    this.registerHandle(DESKTOP_HOST_CHANNELS.fullExit, () => {
      this.onFullExit();
      return { ok: true };
    });
  }

  removeIpc() {
    for (const channel of this.handlers) this.ipcMain.removeHandler(channel);
    this.handlers = [];
  }

  async stop({ restore = true } = {}) {
    if (this.stopping) return;
    this.stopping = true;
    this.removeIpc();
    this.orb?.close();
    this.desktopSurfaces?.close();
    this.mainWindow.destroy();
    if (restore) {
      await this.recoveryJournal.restoreOutstanding(mutation => this.restoreMutation(mutation));
    } else {
      await this.recoveryJournal.markClean();
    }
    this.tray?.destroy();
    this.tray = null;
  }
}

export const desktopEnvironmentHostInternals = Object.freeze({ trayImage });
