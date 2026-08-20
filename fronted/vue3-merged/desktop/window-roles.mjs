import { ROUTE_DESTINATIONS } from './protocol.mjs';
import { nativeHandleToDecimal } from './windows-desktop-adapter.mjs';

export const DESKTOP_WINDOW_CHANNELS = Object.freeze({
  navigateRoute: 'shizuki-desktop:navigate-route',
  orbLevel: 'shizuki-desktop:orb-level'
});

export function buildSurfaceUrl(baseUrl, role, { displayId = '', route = '/' } = {}) {
  const url = new URL(baseUrl);
  url.searchParams.set('desktopSurface', role);
  if (displayId !== '') url.searchParams.set('displayId', String(displayId));
  if (role === 'main') url.hash = `#${String(route || '/').startsWith('/') ? route : `/${route}`}`;
  return url.toString();
}

function commonWebPreferences(preloadPath, role, displayId = '') {
  return {
    preload: preloadPath,
    contextIsolation: true,
    nodeIntegration: false,
    sandbox: true,
    webSecurity: true,
    additionalArguments: [
      `--shizuki-surface=${role}`,
      `--shizuki-display-id=${displayId}`
    ]
  };
}

function safeShow(window) {
  if (!window || window.isDestroyed?.()) return;
  if (window.isMinimized?.()) window.restore();
  window.show();
  window.focus();
}

export class ReusableMainWindow {
  constructor({ BrowserWindow, screen, preloadPath, baseUrl, onExternalUrl = () => {}, onBoundsChanged = () => {}, initialBounds = null }) {
    this.BrowserWindow = BrowserWindow;
    this.screen = screen;
    this.preloadPath = preloadPath;
    this.baseUrl = baseUrl;
    this.onExternalUrl = onExternalUrl;
    this.onBoundsChanged = onBoundsChanged;
    this.initialBounds = initialBounds;
    this.window = null;
    this.allowClose = false;
  }

  setInitialBounds(bounds) {
    this.initialBounds = bounds && typeof bounds === 'object' ? { ...bounds } : null;
  }

  create(route = '/') {
    if (this.window && !this.window.isDestroyed()) return this.window;
    const display = this.screen.getDisplayNearestPoint(this.screen.getCursorScreenPoint());
    const area = display.workArea;
    const saved = this.initialBounds;
    const savedWidth = Number(saved?.width);
    const savedHeight = Number(saved?.height);
    const width = Number.isFinite(savedWidth)
      ? Math.min(area.width, Math.max(720, savedWidth))
      : Math.min(1280, Math.max(820, area.width - 120));
    const height = Number.isFinite(savedHeight)
      ? Math.min(area.height, Math.max(520, savedHeight))
      : Math.min(860, Math.max(620, area.height - 100));
    const savedPoint = { x: Number(saved?.x), y: Number(saved?.y) };
    const savedDisplay = Number.isFinite(savedPoint.x) && Number.isFinite(savedPoint.y)
      ? this.screen.getDisplayNearestPoint(savedPoint)
      : null;
    const canRestorePosition = savedDisplay && savedPoint.x < savedDisplay.workArea.x + savedDisplay.workArea.width
      && savedPoint.y < savedDisplay.workArea.y + savedDisplay.workArea.height
      && savedPoint.x + width > savedDisplay.workArea.x
      && savedPoint.y + height > savedDisplay.workArea.y;
    const window = new this.BrowserWindow({
      title: 'Shizuki',
      x: canRestorePosition ? savedPoint.x : Math.round(area.x + (area.width - width) / 2),
      y: canRestorePosition ? savedPoint.y : Math.round(area.y + (area.height - height) / 2),
      width,
      height,
      minWidth: 720,
      minHeight: 520,
      show: false,
      backgroundColor: '#111827',
      webPreferences: commonWebPreferences(this.preloadPath, 'main')
    });
    this.window = window;
    window.webContents.setWindowOpenHandler(({ url }) => {
      this.onExternalUrl(url);
      return { action: 'deny' };
    });
    window.webContents.on('will-navigate', (event, url) => {
      const target = new URL(url);
      const base = new URL(this.baseUrl);
      if (target.protocol === base.protocol && target.hostname === base.hostname) return;
      event.preventDefault();
      this.onExternalUrl(url);
    });
    window.once('ready-to-show', () => {
      if (saved?.maximized) window.maximize();
      window.show();
    });
    window.on('close', event => {
      if (this.allowClose) return;
      event.preventDefault();
      this.onBoundsChanged(window.getNormalBounds(), window.isMaximized());
      window.hide();
    });
    window.on('closed', () => {
      if (this.window === window) this.window = null;
    });
    void window.loadURL(buildSurfaceUrl(this.baseUrl, 'main', { route }));
    return window;
  }

  openDestination(destination) {
    const route = ROUTE_DESTINATIONS[destination];
    if (!route) throw new TypeError(`Unsupported desktop route destination: ${destination}`);
    const existing = this.window && !this.window.isDestroyed() ? this.window : null;
    const window = existing || this.create(route);
    if (existing) window.webContents.send(DESKTOP_WINDOW_CHANNELS.navigateRoute, { destination, route });
    safeShow(window);
    return window;
  }

  focus() {
    if (!this.window || this.window.isDestroyed()) return this.openDestination('home');
    safeShow(this.window);
    return this.window;
  }

  getWindow() {
    return this.window && !this.window.isDestroyed() ? this.window : null;
  }

  destroy() {
    this.allowClose = true;
    if (this.window && !this.window.isDestroyed()) this.window.destroy();
    this.window = null;
  }
}

export class DesktopSurfaceManager {
  constructor({ BrowserWindow, screen, adapter, preloadPath, baseUrl, onAttachmentFailure = () => {} }) {
    this.BrowserWindow = BrowserWindow;
    this.screen = screen;
    this.adapter = adapter;
    this.preloadPath = preloadPath;
    this.baseUrl = baseUrl;
    this.onAttachmentFailure = onAttachmentFailure;
    this.surfaces = new Map();
    this.started = false;
    this.healthTimer = null;
    this.boundSync = () => void this.syncDisplays();
  }

  async createSurface(display) {
    const displayId = String(display.id);
    const bounds = { ...display.bounds };
    const window = new this.BrowserWindow({
      title: `Shizuki Desktop ${displayId}`,
      ...bounds,
      frame: false,
      transparent: false,
      backgroundColor: '#111827',
      show: false,
      skipTaskbar: true,
      resizable: false,
      movable: false,
      minimizable: false,
      maximizable: false,
      fullscreenable: false,
      webPreferences: commonWebPreferences(this.preloadPath, 'desktop', displayId)
    });
    const record = { displayId, display, bounds, window, attached: false, fallback: false };
    this.surfaces.set(displayId, record);
    window.setIgnoreMouseEvents(true, { forward: true });
    window.on('closed', () => {
      if (this.surfaces.get(displayId)?.window === window) this.surfaces.delete(displayId);
    });
    window.webContents.once('did-finish-load', () => void this.attach(record));
    await window.loadURL(buildSurfaceUrl(this.baseUrl, 'desktop', { displayId }));
    return record;
  }

  async attach(record) {
    if (!record || record.window.isDestroyed()) return false;
    try {
      const result = await this.adapter.attachWindow(record.window, record.bounds);
      if (!result?.attached) throw new Error('Windows desktop helper did not confirm attachment.');
      record.attached = true;
      record.fallback = false;
      record.window.setSkipTaskbar(true);
      record.window.showInactive();
      return true;
    } catch (error) {
      record.attached = false;
      record.fallback = true;
      record.window.setIgnoreMouseEvents(false);
      if (String(record.displayId) === String(this.screen.getPrimaryDisplay().id)) {
        record.window.setSkipTaskbar(false);
        record.window.setResizable(true);
        record.window.setMovable(true);
        record.window.show();
      } else {
        record.window.hide();
      }
      this.onAttachmentFailure(error, record);
      return false;
    }
  }

  async syncDisplays() {
    const displays = this.screen.getAllDisplays();
    const activeIds = new Set(displays.map(display => String(display.id)));
    for (const [displayId, record] of this.surfaces) {
      if (activeIds.has(displayId)) continue;
      record.window.destroy();
      this.surfaces.delete(displayId);
    }
    for (const display of displays) {
      const displayId = String(display.id);
      const existing = this.surfaces.get(displayId);
      if (!existing) {
        await this.createSurface(display);
        continue;
      }
      const changed = ['x', 'y', 'width', 'height'].some(key => existing.bounds[key] !== display.bounds[key]);
      if (changed) {
        existing.bounds = { ...display.bounds };
        existing.display = display;
        existing.window.setBounds(existing.bounds);
        await this.attach(existing);
      }
    }
  }

  async reconcileAttachments() {
    for (const record of this.surfaces.values()) {
      if (record.window.isDestroyed() || record.fallback) continue;
      try {
        const result = await this.adapter.isAttached(record.window);
        if (!result?.attached) await this.attach(record);
      } catch (error) {
        this.onAttachmentFailure(error, record);
      }
    }
  }

  async start() {
    if (this.started) return;
    this.started = true;
    this.screen.on('display-added', this.boundSync);
    this.screen.on('display-removed', this.boundSync);
    this.screen.on('display-metrics-changed', this.boundSync);
    await this.syncDisplays();
    this.healthTimer = setInterval(() => void this.reconcileAttachments(), 3_000);
    this.healthTimer.unref?.();
  }

  setInputPassThrough(displayId, passThrough) {
    const record = this.surfaces.get(String(displayId));
    if (!record || record.window.isDestroyed() || record.fallback) return false;
    record.window.setIgnoreMouseEvents(Boolean(passThrough), { forward: true });
    return true;
  }

  windows() {
    return [...this.surfaces.values()].map(record => record.window).filter(window => !window.isDestroyed());
  }

  close() {
    this.started = false;
    if (this.healthTimer) clearInterval(this.healthTimer);
    this.healthTimer = null;
    this.screen.off('display-added', this.boundSync);
    this.screen.off('display-removed', this.boundSync);
    this.screen.off('display-metrics-changed', this.boundSync);
    for (const record of this.surfaces.values()) record.window.destroy();
    this.surfaces.clear();
  }
}

const ORB_SIZES = Object.freeze({
  collapsed: { width: 76, height: 76 },
  controls: { width: 388, height: 112 },
  routes: { width: 540, height: 104 }
});

export class ControlOrbWindow {
  constructor({ BrowserWindow, screen, adapter, preloadPath, baseUrl, preferences, onPositionChanged = () => {} }) {
    this.BrowserWindow = BrowserWindow;
    this.screen = screen;
    this.adapter = adapter;
    this.preloadPath = preloadPath;
    this.baseUrl = baseUrl;
    this.preferences = preferences;
    this.onPositionChanged = onPositionChanged;
    this.window = null;
    this.level = 'collapsed';
    this.hiddenForFullscreen = false;
    this.timer = null;
    this.boundEnsureReachable = () => this.ensureReachable();
  }

  selectedDisplay() {
    const point = this.screen.getCursorScreenPoint();
    return this.screen.getDisplayNearestPoint(point) || this.screen.getPrimaryDisplay();
  }

  preferredBounds(display, level = this.level) {
    const size = ORB_SIZES[level] || ORB_SIZES.collapsed;
    const saved = this.preferences?.orb?.displays?.[String(display.id)];
    const x = Number.isFinite(saved?.x) ? saved.x : display.workArea.x + display.workArea.width - size.width - 24;
    const y = Number.isFinite(saved?.y) ? saved.y : display.workArea.y + Math.round(display.workArea.height * 0.32);
    return { x, y, ...size };
  }

  create() {
    if (this.window && !this.window.isDestroyed()) return this.window;
    const display = this.selectedDisplay();
    const window = new this.BrowserWindow({
      title: 'Shizuki Control',
      ...this.preferredBounds(display),
      frame: false,
      transparent: true,
      backgroundColor: '#00000000',
      show: false,
      skipTaskbar: true,
      resizable: false,
      fullscreenable: false,
      alwaysOnTop: true,
      hasShadow: false,
      webPreferences: commonWebPreferences(this.preloadPath, 'orb', String(display.id))
    });
    this.window = window;
    window.setAlwaysOnTop(true, 'floating');
    window.setVisibleOnAllWorkspaces(true, { visibleOnFullScreen: false });
    window.once('ready-to-show', () => window.showInactive());
    window.on('moved', () => {
      const bounds = window.getBounds();
      const currentDisplay = this.screen.getDisplayNearestPoint({ x: bounds.x, y: bounds.y });
      this.onPositionChanged(String(currentDisplay.id), { x: bounds.x, y: bounds.y });
    });
    window.on('closed', () => {
      if (this.window === window) this.window = null;
    });
    void window.loadURL(buildSurfaceUrl(this.baseUrl, 'orb', { displayId: display.id }));
    this.screen.on('display-removed', this.boundEnsureReachable);
    this.screen.on('display-metrics-changed', this.boundEnsureReachable);
    this.ensureReachable();
    this.timer = setInterval(() => void this.pollFullscreen(), 1_000);
    this.timer.unref?.();
    return window;
  }

  ensureReachable() {
    if (!this.window || this.window.isDestroyed()) return;
    const bounds = this.window.getBounds();
    const displays = this.screen.getAllDisplays();
    const reachable = displays.some(display => {
      const area = display.workArea;
      return bounds.x < area.x + area.width
        && bounds.x + bounds.width > area.x
        && bounds.y < area.y + area.height
        && bounds.y + bounds.height > area.y;
    });
    if (reachable) return;
    const display = this.screen.getPrimaryDisplay();
    const nextBounds = this.preferredBounds(display);
    this.window.setBounds(nextBounds);
    this.onPositionChanged(String(display.id), { x: nextBounds.x, y: nextBounds.y });
  }

  setLevel(level) {
    if (!Object.hasOwn(ORB_SIZES, level)) throw new TypeError(`Unsupported orb level: ${level}`);
    this.level = level;
    if (!this.window || this.window.isDestroyed()) return;
    const oldBounds = this.window.getBounds();
    const nextSize = ORB_SIZES[level];
    const display = this.screen.getDisplayNearestPoint({ x: oldBounds.x, y: oldBounds.y });
    const alignRight = oldBounds.x + oldBounds.width > display.workArea.x + display.workArea.width / 2;
    this.window.setBounds({
      x: alignRight ? oldBounds.x + oldBounds.width - nextSize.width : oldBounds.x,
      y: oldBounds.y,
      ...nextSize
    });
    this.window.webContents.send(DESKTOP_WINDOW_CHANNELS.orbLevel, { level });
  }

  async pollFullscreen() {
    if (!this.window || this.window.isDestroyed()) return;
    try {
      const result = await this.adapter.inspectForegroundFullscreen();
      const ownHandle = nativeHandleToDecimal(this.window.getNativeWindowHandle());
      const shouldHide = Boolean(result?.fullscreen)
        && String(result?.foreground || '') !== ownHandle
        && !this.preferences?.orb?.lockedVisible;
      if (shouldHide && !this.hiddenForFullscreen) {
        this.hiddenForFullscreen = true;
        this.window.hide();
      } else if (!shouldHide && this.hiddenForFullscreen) {
        this.hiddenForFullscreen = false;
        this.window.showInactive();
      }
    } catch {
      // Full-screen detection is advisory; keep the orb available if inspection fails.
    }
  }

  show() {
    if (!this.window || this.window.isDestroyed()) this.create();
    this.hiddenForFullscreen = false;
    this.window.showInactive();
  }

  close() {
    if (this.timer) clearInterval(this.timer);
    this.timer = null;
    this.screen.off('display-removed', this.boundEnsureReachable);
    this.screen.off('display-metrics-changed', this.boundEnsureReachable);
    if (this.window && !this.window.isDestroyed()) this.window.destroy();
    this.window = null;
  }
}

export const windowRoleInternals = Object.freeze({ ORB_SIZES, commonWebPreferences, safeShow });
