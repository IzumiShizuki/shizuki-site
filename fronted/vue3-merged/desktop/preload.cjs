const { contextBridge, ipcRenderer } = require('electron');

const channels = Object.freeze({
  command: 'shizuki-desktop:command',
  commandResult: 'shizuki-desktop:command-result',
  rendererState: 'shizuki-desktop:renderer-state',
  navigateRoute: 'shizuki-desktop:navigate-route',
  orbLevel: 'shizuki-desktop:orb-level',
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

function readArgument(name, fallback = '') {
  const prefix = `--${name}=`;
  const match = process.argv.find(value => String(value).startsWith(prefix));
  return match ? String(match).slice(prefix.length) : fallback;
}

const rawRole = readArgument('shizuki-surface', 'main');
const surface = Object.freeze({
  role: ['desktop', 'main', 'orb'].includes(rawRole) ? rawRole : 'main',
  displayId: readArgument('shizuki-display-id', '')
});

const api = Object.freeze({
  isDesktop: true,
  platform: process.platform,
  protocolVersion: '1.0',
  surface,
  onCommand(listener) {
    if (typeof listener !== 'function') return () => {};
    const handler = (_event, command) => listener(command);
    ipcRenderer.on(channels.command, handler);
    return () => ipcRenderer.removeListener(channels.command, handler);
  },
  reportState(state) {
    ipcRenderer.send(channels.rendererState, state);
  },
  respondToCommand(result) {
    ipcRenderer.send(channels.commandResult, result);
  },
  onRouteRequested(listener) {
    if (typeof listener !== 'function') return () => {};
    const handler = (_event, request) => listener(request);
    ipcRenderer.on(channels.navigateRoute, handler);
    return () => ipcRenderer.removeListener(channels.navigateRoute, handler);
  },
  onOrbLevel(listener) {
    if (typeof listener !== 'function') return () => {};
    const handler = (_event, request) => listener(request);
    ipcRenderer.on(channels.orbLevel, handler);
    return () => ipcRenderer.removeListener(channels.orbLevel, handler);
  },
  openRoute(destination) {
    return ipcRenderer.invoke(channels.openRoute, { destination });
  },
  setInputPassThrough(passThrough) {
    return ipcRenderer.invoke(channels.setInputPassThrough, {
      displayId: surface.displayId,
      passThrough: Boolean(passThrough)
    });
  },
  setOrbLevel(level) {
    return ipcRenderer.invoke(channels.setOrbLevel, { level });
  },
  getDesktopState() {
    return ipcRenderer.invoke(channels.getState);
  },
  setEditMode(enabled) {
    return ipcRenderer.invoke(channels.setEditMode, { enabled: Boolean(enabled) });
  },
  setDesktopIconsVisible(visible) {
    return ipcRenderer.invoke(channels.setIconsVisible, { visible: Boolean(visible) });
  },
  setLaunchAtLogin(enabled) {
    return ipcRenderer.invoke(channels.setLaunchAtLogin, { enabled: Boolean(enabled) });
  },
  getPairingSnapshot() {
    return ipcRenderer.invoke(channels.getPairingSnapshot);
  },
  approvePairing(requestId, capabilities) {
    return ipcRenderer.invoke(channels.approvePairing, {
      requestId: String(requestId || ''),
      capabilities: Array.isArray(capabilities) ? capabilities.map(String) : []
    });
  },
  rejectPairing(requestId) {
    return ipcRenderer.invoke(channels.rejectPairing, { requestId: String(requestId || '') });
  },
  revokePairedClient(clientId) {
    return ipcRenderer.invoke(channels.revokePairedClient, { clientId: String(clientId || '') });
  },
  invokeImmediateAction(action) {
    return ipcRenderer.invoke(channels.immediateAction, { action });
  },
  fullExit() {
    return ipcRenderer.invoke(channels.fullExit);
  }
});

contextBridge.exposeInMainWorld('shizukiDesktop', api);
