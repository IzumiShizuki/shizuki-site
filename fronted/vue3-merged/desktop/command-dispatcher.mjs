import { controlError } from './protocol.mjs';

const RENDERER_TIMEOUT_MS = 5_000;

export class CommandDispatchError extends Error {
  constructor(code, message) {
    super(message);
    this.name = 'CommandDispatchError';
    this.code = code;
  }
}

function safeString(value, maxLength = 256) {
  return typeof value === 'string' ? value.slice(0, maxLength) : '';
}

function finiteNumber(value) {
  const number = Number(value);
  return Number.isFinite(number) ? number : 0;
}

export function normalizeRendererState(input) {
  const state = input && typeof input === 'object' ? input : {};
  const route = state.route && typeof state.route === 'object'
    ? {
        name: safeString(state.route.name, 80),
        path: safeString(state.route.path, 512),
        fullPath: safeString(state.route.fullPath, 1024)
      }
    : null;
  const sourcePlayer = state.player && typeof state.player === 'object' ? state.player : null;
  const sourceTrack = sourcePlayer?.currentTrack && typeof sourcePlayer.currentTrack === 'object'
    ? sourcePlayer.currentTrack
    : null;
  const player = sourcePlayer
    ? {
        isPlaying: sourcePlayer.isPlaying === true,
        currentTime: Math.max(0, finiteNumber(sourcePlayer.currentTime)),
        duration: Math.max(0, finiteNumber(sourcePlayer.duration)),
        currentTrack: sourceTrack
          ? {
              id: safeString(sourceTrack.id, 160),
              title: safeString(sourceTrack.title, 256),
              artist: safeString(sourceTrack.artist, 256)
            }
          : null
      }
    : null;
  return {
    ready: state.ready === true,
    ...(route ? { route } : {}),
    ...(player ? { player } : {})
  };
}

function windowSnapshot(window) {
  if (!window || window.isDestroyed()) return { available: false };
  return {
    available: true,
    visible: window.isVisible(),
    focused: window.isFocused(),
    minimized: window.isMinimized(),
    maximized: window.isMaximized(),
    bounds: window.getBounds()
  };
}

export class DesktopCommandDispatcher {
  constructor({ getWindow, eventHub, rendererTimeoutMs = RENDERER_TIMEOUT_MS }) {
    this.getWindow = getWindow;
    this.eventHub = eventHub;
    this.rendererTimeoutMs = rendererTimeoutMs;
    this.rendererState = { ready: false };
    this.pending = new Map();
  }

  getState() {
    return {
      protocolVersion: '1.0',
      host: { running: true, pid: process.pid },
      window: windowSnapshot(this.getWindow()),
      renderer: this.rendererState
    };
  }

  updateRendererState(input) {
    this.rendererState = normalizeRendererState(input);
    this.eventHub.publish('state.changed', this.getState());
    return this.rendererState;
  }

  completeRendererCommand(input) {
    const id = safeString(input?.id, 128);
    const pending = this.pending.get(id);
    if (!pending) return false;
    this.pending.delete(id);
    clearTimeout(pending.timeout);
    if (input?.ok === true) {
      pending.resolve(input.result ?? {});
    } else {
      pending.reject(new CommandDispatchError(
        safeString(input?.error?.code, 80) || 'COMMAND_FAILED',
        safeString(input?.error?.message, 512) || 'Renderer command failed.'
      ));
    }
    return true;
  }

  async dispatch(command) {
    if (command.target === 'native') return this.#dispatchNative(command);
    return this.#dispatchRenderer(command);
  }

  async #dispatchNative(command) {
    const window = this.getWindow();
    if (!window || window.isDestroyed()) {
      throw new CommandDispatchError('WINDOW_UNAVAILABLE', 'Desktop window is unavailable.');
    }
    if (command.command === 'window.show') {
      if (window.isMinimized()) window.restore();
      window.show();
    } else if (command.command === 'window.hide') {
      window.hide();
    } else if (command.command === 'window.focus') {
      if (window.isMinimized()) window.restore();
      window.show();
      window.focus();
    } else if (command.command === 'window.minimize') {
      window.minimize();
    } else if (command.command === 'window.toggleVisibility') {
      if (window.isVisible() && !window.isMinimized()) window.hide();
      else {
        if (window.isMinimized()) window.restore();
        window.show();
        window.focus();
      }
    } else {
      throw new CommandDispatchError('UNSUPPORTED_COMMAND', `Unsupported native command: ${command.command}`);
    }
    const result = { window: windowSnapshot(window) };
    this.eventHub.publish('command.completed', { id: command.id, command: command.command, result });
    this.eventHub.publish('state.changed', this.getState());
    return result;
  }

  #dispatchRenderer(command) {
    const window = this.getWindow();
    if (!window || window.isDestroyed() || window.webContents.isDestroyed() || !this.rendererState.ready) {
      throw new CommandDispatchError('RENDERER_UNAVAILABLE', 'Shizuki renderer is not ready.');
    }
    if (this.pending.has(command.id)) {
      throw new CommandDispatchError('DUPLICATE_COMMAND', `Command id is already pending: ${command.id}`);
    }

    return new Promise((resolve, reject) => {
      const timeout = setTimeout(() => {
        this.pending.delete(command.id);
        const error = new CommandDispatchError('RENDERER_TIMEOUT', 'Shizuki renderer did not acknowledge the command in time.');
        this.eventHub.publish('command.failed', {
          id: command.id,
          command: command.command,
          error: controlError(error.code, error.message)
        });
        reject(error);
      }, this.rendererTimeoutMs);
      this.pending.set(command.id, {
        timeout,
        resolve: result => {
          this.eventHub.publish('command.completed', { id: command.id, command: command.command, result });
          resolve(result);
        },
        reject: error => {
          this.eventHub.publish('command.failed', {
            id: command.id,
            command: command.command,
            error: controlError(error.code || 'COMMAND_FAILED', error.message)
          });
          reject(error);
        }
      });
      window.webContents.send('shizuki-desktop:command', {
        id: command.id,
        command: command.command,
        payload: command.payload
      });
    });
  }

  close() {
    for (const [id, pending] of this.pending) {
      clearTimeout(pending.timeout);
      pending.reject(new CommandDispatchError('HOST_SHUTTING_DOWN', 'Desktop host is shutting down.'));
      this.pending.delete(id);
    }
  }
}
