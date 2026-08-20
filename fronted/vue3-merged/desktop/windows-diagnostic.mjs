import { WindowsDesktopAdapter } from './windows-desktop-adapter.mjs';

const adapter = new WindowsDesktopAdapter();

try {
  const result = await adapter.diagnose();
  process.stdout.write(`${JSON.stringify(result, null, 2)}\n`);
} catch (error) {
  process.stderr.write(`${JSON.stringify({
    ok: false,
    code: error?.code || 'DIAGNOSTIC_FAILED',
    message: String(error?.message || error)
  }, null, 2)}\n`);
  process.exitCode = 1;
}
