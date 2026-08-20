import { EventEmitter } from 'node:events';
import { describe, expect, it, vi } from 'vitest';
import {
  buildSurfaceUrl,
  ControlOrbWindow,
  DesktopSurfaceManager,
  ReusableMainWindow
} from './window-roles.mjs';

class FakeWebContents extends EventEmitter {
  constructor() {
    super();
    this.send = vi.fn();
    this.setWindowOpenHandler = vi.fn();
  }
}

class FakeWindow extends EventEmitter {
  static instances = [];
  constructor(options) {
    super();
    this.options = options;
    this.bounds = { x: options.x || 0, y: options.y || 0, width: options.width, height: options.height };
    this.webContents = new FakeWebContents();
    this.destroyed = false;
    this.loadURL = vi.fn(async () => {
      this.webContents.emit('did-finish-load');
      this.emit('ready-to-show');
    });
    this.show = vi.fn();
    this.showInactive = vi.fn();
    this.hide = vi.fn();
    this.focus = vi.fn();
    this.restore = vi.fn();
    this.maximize = vi.fn();
    this.setSkipTaskbar = vi.fn();
    this.setIgnoreMouseEvents = vi.fn();
    this.setResizable = vi.fn();
    this.setMovable = vi.fn();
    this.setAlwaysOnTop = vi.fn();
    this.setVisibleOnAllWorkspaces = vi.fn();
    FakeWindow.instances.push(this);
  }
  isDestroyed() { return this.destroyed; }
  isMinimized() { return false; }
  isMaximized() { return false; }
  getNormalBounds() { return this.bounds; }
  getBounds() { return this.bounds; }
  setBounds(bounds) { this.bounds = { ...this.bounds, ...bounds }; }
  getNativeWindowHandle() { const value = Buffer.alloc(8); value.writeBigUInt64LE(77n); return value; }
  destroy() { this.destroyed = true; this.emit('closed'); }
}

function fakeScreen(displays = [{ id: 1, bounds: { x: 0, y: 0, width: 1920, height: 1080 }, workArea: { x: 0, y: 0, width: 1920, height: 1040 } }]) {
  const events = new EventEmitter();
  return Object.assign(events, {
    getAllDisplays: () => displays,
    getPrimaryDisplay: () => displays[0],
    getCursorScreenPoint: () => ({ x: 100, y: 100 }),
    getDisplayNearestPoint: () => displays[0]
  });
}

describe('desktop window roles', () => {
  it('builds fixed renderer surface URLs without changing the trusted origin', () => {
    expect(buildSurfaceUrl('app://shizuki/index.html', 'desktop', { displayId: 4 }))
      .toBe('app://shizuki/index.html?desktopSurface=desktop&displayId=4');
    expect(buildSurfaceUrl('app://shizuki/index.html', 'main', { route: '/music-library/music' }))
      .toContain('desktopSurface=main#/music-library/music');
  });

  it('reuses one main window for large route destinations', () => {
    FakeWindow.instances = [];
    const manager = new ReusableMainWindow({
      BrowserWindow: FakeWindow,
      screen: fakeScreen(),
      preloadPath: 'preload.cjs',
      baseUrl: 'app://shizuki/index.html'
    });
    const first = manager.openDestination('music');
    const second = manager.openDestination('blog');
    expect(second).toBe(first);
    expect(FakeWindow.instances).toHaveLength(1);
    expect(first.webContents.send).toHaveBeenCalledWith(
      'shizuki-desktop:navigate-route',
      { destination: 'blog', route: '/blog' }
    );
  });

  it('restores a saved reachable main-window placement and maximized state', () => {
    FakeWindow.instances = [];
    const manager = new ReusableMainWindow({
      BrowserWindow: FakeWindow,
      screen: fakeScreen(),
      preloadPath: 'preload.cjs',
      baseUrl: 'app://shizuki/index.html',
      initialBounds: { x: 120, y: 90, width: 1100, height: 760, maximized: true }
    });
    const window = manager.openDestination('home');
    expect(window.getBounds()).toMatchObject({ x: 120, y: 90, width: 1100, height: 760 });
    expect(window.maximize).toHaveBeenCalledOnce();
    manager.destroy();
  });

  it('creates one attached desktop surface per display', async () => {
    FakeWindow.instances = [];
    const displays = [
      { id: 1, bounds: { x: 0, y: 0, width: 1920, height: 1080 }, workArea: { x: 0, y: 0, width: 1920, height: 1040 } },
      { id: 2, bounds: { x: 1920, y: 0, width: 1280, height: 1024 }, workArea: { x: 1920, y: 0, width: 1280, height: 984 } }
    ];
    const adapter = {
      attachWindow: vi.fn().mockResolvedValue({ attached: true }),
      isAttached: vi.fn().mockResolvedValue({ attached: true })
    };
    const manager = new DesktopSurfaceManager({
      BrowserWindow: FakeWindow,
      screen: fakeScreen(displays),
      adapter,
      preloadPath: 'preload.cjs',
      baseUrl: 'app://shizuki/index.html'
    });
    await manager.start();
    expect(manager.windows()).toHaveLength(2);
    expect(adapter.attachWindow).toHaveBeenCalledTimes(2);
    manager.close();
  });

  it('falls back safely and reattaches a stale Explorer desktop surface', async () => {
    FakeWindow.instances = [];
    const adapter = {
      attachWindow: vi.fn()
        .mockRejectedValueOnce(new Error('WorkerW unavailable'))
        .mockResolvedValue({ attached: true }),
      isAttached: vi.fn().mockResolvedValue({ attached: false })
    };
    const manager = new DesktopSurfaceManager({
      BrowserWindow: FakeWindow,
      screen: fakeScreen(),
      adapter,
      preloadPath: 'preload.cjs',
      baseUrl: 'app://shizuki/index.html'
    });
    await manager.start();
    const record = [...manager.surfaces.values()][0];
    expect(record.fallback).toBe(true);
    await manager.attach(record);
    await manager.reconcileAttachments();
    expect(record.attached).toBe(true);
    expect(adapter.attachWindow).toHaveBeenCalledTimes(3);
    manager.close();
  });

  it('moves the orb through collapsed, controls, and routes sizes', () => {
    FakeWindow.instances = [];
    const orb = new ControlOrbWindow({
      BrowserWindow: FakeWindow,
      screen: fakeScreen(),
      adapter: { inspectForegroundFullscreen: vi.fn().mockResolvedValue({ fullscreen: false }) },
      preloadPath: 'preload.cjs',
      baseUrl: 'app://shizuki/index.html',
      preferences: { orb: { displays: {}, lockedVisible: false } }
    });
    const window = orb.create();
    orb.setLevel('controls');
    expect(window.getBounds()).toMatchObject({ width: 388, height: 112 });
    orb.setLevel('routes');
    expect(window.getBounds()).toMatchObject({ width: 540, height: 104 });
    orb.close();
  });

  it('moves an unreachable orb back to the primary display after a display is removed', () => {
    FakeWindow.instances = [];
    const primary = { id: 1, bounds: { x: 0, y: 0, width: 1920, height: 1080 }, workArea: { x: 0, y: 0, width: 1920, height: 1040 } };
    const secondary = { id: 2, bounds: { x: 1920, y: 0, width: 1280, height: 1024 }, workArea: { x: 1920, y: 0, width: 1280, height: 984 } };
    const screen = fakeScreen([primary, secondary]);
    const orb = new ControlOrbWindow({
      BrowserWindow: FakeWindow,
      screen,
      adapter: { inspectForegroundFullscreen: vi.fn().mockResolvedValue({ fullscreen: false }) },
      preloadPath: 'preload.cjs',
      baseUrl: 'app://shizuki/index.html',
      preferences: { orb: { displays: {}, lockedVisible: false } }
    });
    const window = orb.create();
    window.setBounds({ x: 2500, y: 300, width: 76, height: 76 });
    screen.getAllDisplays = () => [primary];
    screen.emit('display-removed', {}, secondary);
    expect(window.getBounds().x).toBeLessThan(primary.workArea.width);
    orb.close();
  });

  it('hides the orb for unrelated full-screen work and restores it afterwards', async () => {
    FakeWindow.instances = [];
    const inspectForegroundFullscreen = vi.fn()
      .mockResolvedValueOnce({ fullscreen: true, foreground: '999' })
      .mockResolvedValueOnce({ fullscreen: false, foreground: '999' });
    const orb = new ControlOrbWindow({
      BrowserWindow: FakeWindow,
      screen: fakeScreen(),
      adapter: { inspectForegroundFullscreen },
      preloadPath: 'preload.cjs',
      baseUrl: 'app://shizuki/index.html',
      preferences: { orb: { displays: {}, lockedVisible: false } }
    });
    const window = orb.create();
    await orb.pollFullscreen();
    expect(window.hide).toHaveBeenCalledOnce();
    await orb.pollFullscreen();
    expect(window.showInactive).toHaveBeenCalledTimes(2);
    orb.close();
  });
});
