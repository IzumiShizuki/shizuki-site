import { readFileSync } from 'node:fs';
import path from 'node:path';
import { describe, expect, it } from 'vitest';

const source = readFileSync(path.join(process.cwd(), 'desktop', 'preload.cjs'), 'utf8');

describe('desktop preload contract', () => {
  it('exposes only the narrow desktop bridge through contextBridge', () => {
    expect(source).toContain("contextBridge.exposeInMainWorld('shizukiDesktop', api)");
    expect(source).toContain('onCommand(listener)');
    expect(source).toContain('reportState(state)');
    expect(source).toContain('respondToCommand(result)');
    expect(source).not.toMatch(/remote|webFrame|executeJavaScript|child_process|fs\b/);
  });
});
