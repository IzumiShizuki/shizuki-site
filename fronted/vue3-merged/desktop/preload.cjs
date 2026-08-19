const { contextBridge, ipcRenderer } = require('electron');

const channels = Object.freeze({
  command: 'shizuki-desktop:command',
  commandResult: 'shizuki-desktop:command-result',
  rendererState: 'shizuki-desktop:renderer-state'
});

const api = Object.freeze({
  isDesktop: true,
  platform: process.platform,
  protocolVersion: '1.0',
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
  }
});

contextBridge.exposeInMainWorld('shizukiDesktop', api);
