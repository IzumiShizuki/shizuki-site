import { mkdtemp, rm } from 'node:fs/promises';
import { EventEmitter } from 'node:events';
import os from 'node:os';
import path from 'node:path';
import { afterEach, describe, expect, it, vi } from 'vitest';
import {
  DESKTOP_HOST_CHANNELS,
  DesktopEnvironmentHost,
  desktopEnvironmentEnabled
} from './desktop-environment-host.mjs';

const roots = [];

class FakeTray extends EventEmitter {
  setToolTip = vi.fn();
  setContextMenu = vi.fn();
  destroy = vi.fn();
}

function dependencies(root) {
  const ipcHandlers = new Map();
  const app = {
    setLoginItemSettings: vi.fn(),
    getLoginItemSettings: vi.fn(() => ({ openAtLogin: false }))
  };
  return {
    app,
    BrowserWindow: class {},
    screen: {},
    ipcMain: {
      handle: (channel, handler) => ipcHandlers.set(channel, handler),
      removeHandler: channel => ipcHandlers.delete(channel)
    },
    Tray: FakeTray,
    Menu: { buildFromTemplate: template => template },
    nativeImage: { createFromDataURL: value => value },
    preloadPath: 'preload.cjs',
    baseUrl: 'app://shizuki/index.html',
    userDataPath: root,
    adapter: {
      getDesktopIconsVisible: vi.fn().mockResolvedValue(true),
      setDesktopIconsVisible: vi.fn(async visible => visible)
    },
    trustedIpcEvent: () => true,
    enabled: false,
    ipcHandlers
  };
}

afterEach(async () => {
  await Promise.all(roots.splice(0).map(root => rm(root, { recursive: true, force: true })));
});

describe('DesktopEnvironmentHost', () => {
  it('treats the environment feature as enabled unless explicitly disabled', () => {
    expect(desktopEnvironmentEnabled({})).toBe(true);
    expect(desktopEnvironmentEnabled({ SHIZUKI_DESKTOP_ENVIRONMENT: '0' })).toBe(false);
  });

  it('journals icon changes and restores the original value during stop', async () => {
    const root = await mkdtemp(path.join(os.tmpdir(), 'shizuki-host-'));
    roots.push(root);
    const deps = dependencies(root);
    const host = new DesktopEnvironmentHost(deps);
    host.mainWindow.openDestination = vi.fn();
    host.mainWindow.destroy = vi.fn();
    await host.start();
    host.nativeMutationsEnabled = true;
    await host.setIconsVisible(false);
    expect(deps.adapter.setDesktopIconsVisible).toHaveBeenCalledWith(false);
    await host.stop({ restore: true });
    expect(deps.adapter.setDesktopIconsVisible).toHaveBeenLastCalledWith(true);
  });

  it('registers launch-at-login per user without starting audio', async () => {
    const root = await mkdtemp(path.join(os.tmpdir(), 'shizuki-host-'));
    roots.push(root);
    const deps = dependencies(root);
    const host = new DesktopEnvironmentHost(deps);
    host.mainWindow.openDestination = vi.fn();
    await host.start();
    await host.applyLaunchAtLogin(true);
    expect(deps.app.setLoginItemSettings).toHaveBeenLastCalledWith({
      openAtLogin: true,
      args: ['--login-start', '--hidden']
    });
    await host.stop({ restore: false });
  });

  it('allows only trusted desktop review surfaces to approve pairing requests', async () => {
    const root = await mkdtemp(path.join(os.tmpdir(), 'shizuki-host-pairing-'));
    roots.push(root);
    const deps = dependencies(root);
    const reviewer = {};
    const pairingStore = {
      approve: vi.fn().mockResolvedValue({ clientId: 'client-1' }),
      reject: vi.fn(),
      revoke: vi.fn(),
      expireRequests: vi.fn(),
      listPending: vi.fn(() => []),
      listClients: vi.fn(() => []),
      listAudit: vi.fn(() => [])
    };
    const host = new DesktopEnvironmentHost({ ...deps, pairingStore });
    host.mainWindow.getWindow = () => ({ webContents: reviewer });
    host.registerIpc();

    const approve = deps.ipcHandlers.get(DESKTOP_HOST_CHANNELS.approvePairing);
    await expect(approve(
      { sender: reviewer },
      { requestId: 'request-1', capabilities: ['app.navigation'] }
    )).resolves.toEqual({ clientId: 'client-1' });
    await expect(approve(
      { sender: {} },
      { requestId: 'request-1', capabilities: ['app.navigation'] }
    )).rejects.toMatchObject({ code: 'SURFACE_MISMATCH' });
    host.removeIpc();
  });
});
