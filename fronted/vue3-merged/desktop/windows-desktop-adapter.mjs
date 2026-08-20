import { execFile } from 'node:child_process';
import path from 'node:path';
import { fileURLToPath } from 'node:url';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const DEFAULT_HELPER_PATH = path.join(__dirname, 'windows-shell-helper.ps1');
const DEFAULT_POWERSHELL_PATH = path.join(
  process.env.SystemRoot || 'C:\\Windows',
  'System32',
  'WindowsPowerShell',
  'v1.0',
  'powershell.exe'
);
const ALLOWED_OPERATIONS = new Set([
  'diagnose',
  'attach',
  'is-attached',
  'get-icons',
  'set-icons',
  'foreground-fullscreen'
]);

function parseHelperOutput(stdout, stderr, operation) {
  const lines = String(stdout || '').split(/\r?\n/).map(line => line.trim()).filter(Boolean);
  const raw = lines.at(-1);
  if (!raw) throw new Error(`Windows desktop helper returned no result for ${operation}: ${String(stderr || '').trim()}`);
  let result;
  try {
    result = JSON.parse(raw);
  } catch {
    throw new Error(`Windows desktop helper returned invalid JSON for ${operation}.`);
  }
  if (!result?.ok) {
    const error = new Error(String(result?.error || `Windows desktop helper failed: ${operation}`));
    error.code = 'WINDOWS_DESKTOP_HELPER_FAILED';
    error.details = result;
    throw error;
  }
  return result;
}

export function nativeHandleToDecimal(handle) {
  if (!Buffer.isBuffer(handle) || ![4, 8].includes(handle.length)) {
    throw new TypeError('Native window handle must be a 4-byte or 8-byte Buffer.');
  }
  return (handle.length === 8 ? handle.readBigUInt64LE() : BigInt(handle.readUInt32LE())).toString(10);
}

export function executeWindowsHelper(operation, parameters = {}, {
  helperPath = DEFAULT_HELPER_PATH,
  powershellPath = DEFAULT_POWERSHELL_PATH,
  timeoutMs = 5_000
} = {}) {
  if (process.platform !== 'win32') {
    return Promise.reject(Object.assign(new Error('Windows desktop integration is available only on Windows.'), {
      code: 'UNSUPPORTED_PLATFORM'
    }));
  }
  if (!ALLOWED_OPERATIONS.has(operation)) throw new TypeError(`Unsupported Windows desktop operation: ${operation}`);
  const args = ['-NoLogo', '-NoProfile', '-NonInteractive', '-ExecutionPolicy', 'Bypass', '-File', helperPath, '-Operation', operation];
  for (const [key, value] of Object.entries(parameters)) {
    if (value === undefined || value === null) continue;
    args.push(`-${key}`, String(value));
  }
  return new Promise((resolve, reject) => {
    execFile(powershellPath, args, { encoding: 'utf8', timeout: timeoutMs, windowsHide: true }, (error, stdout, stderr) => {
      try {
        const result = parseHelperOutput(stdout, stderr, operation);
        if (error && !result.ok) throw error;
        resolve(result);
      } catch (parseError) {
        if (error && !parseError.cause) parseError.cause = error;
        reject(parseError);
      }
    });
  });
}

export class WindowsDesktopAdapter {
  constructor({ runOperation = executeWindowsHelper } = {}) {
    this.runOperation = runOperation;
  }

  diagnose() {
    return this.runOperation('diagnose');
  }

  async attachWindow(browserWindow, bounds) {
    if (!browserWindow || typeof browserWindow.getNativeWindowHandle !== 'function') {
      throw new TypeError('A BrowserWindow-like object is required.');
    }
    const safeBounds = {
      X: Math.trunc(Number(bounds?.x) || 0),
      Y: Math.trunc(Number(bounds?.y) || 0),
      Width: Math.trunc(Number(bounds?.width) || 0),
      Height: Math.trunc(Number(bounds?.height) || 0)
    };
    if (safeBounds.Width <= 0 || safeBounds.Height <= 0) throw new TypeError('Positive desktop surface bounds are required.');
    return this.runOperation('attach', {
      WindowHandle: nativeHandleToDecimal(browserWindow.getNativeWindowHandle()),
      ...safeBounds
    });
  }

  isAttached(browserWindow) {
    return this.runOperation('is-attached', {
      WindowHandle: nativeHandleToDecimal(browserWindow.getNativeWindowHandle())
    });
  }

  async getDesktopIconsVisible() {
    return Boolean((await this.runOperation('get-icons')).visible);
  }

  async setDesktopIconsVisible(visible) {
    const result = await this.runOperation('set-icons', { Visible: visible ? 'true' : 'false' });
    return Boolean(result.visible);
  }

  inspectForegroundFullscreen() {
    return this.runOperation('foreground-fullscreen');
  }
}

export const windowsDesktopAdapterInternals = Object.freeze({
  ALLOWED_OPERATIONS,
  DEFAULT_HELPER_PATH,
  DEFAULT_POWERSHELL_PATH,
  parseHelperOutput
});
