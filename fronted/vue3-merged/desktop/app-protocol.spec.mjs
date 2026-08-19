import { mkdirSync, mkdtempSync, rmSync, writeFileSync } from 'node:fs';
import { tmpdir } from 'node:os';
import path from 'node:path';
import { afterEach, describe, expect, it } from 'vitest';
import { createGatewayUrl, resolveStaticAsset } from './app-protocol.mjs';

const tempRoots = [];

function fixture() {
  const root = mkdtempSync(path.join(tmpdir(), 'shizuki-protocol-'));
  tempRoots.push(root);
  mkdirSync(path.join(root, 'assets'));
  writeFileSync(path.join(root, 'index.html'), '<main>Shizuki</main>');
  writeFileSync(path.join(root, 'assets', 'app.js'), 'export default true;');
  return root;
}

afterEach(() => {
  while (tempRoots.length) rmSync(tempRoots.pop(), { recursive: true, force: true });
});

describe('app protocol path and gateway mapping', () => {
  it('resolves bundled files and falls back to the SPA entry for extensionless paths', () => {
    const root = fixture();
    expect(resolveStaticAsset(root, 'app://shizuki/assets/app.js')).toBe(path.join(root, 'assets', 'app.js'));
    expect(resolveStaticAsset(root, 'app://shizuki/music-library/music')).toBe(path.join(root, 'index.html'));
    expect(resolveStaticAsset(root, 'app://shizuki/assets/missing.js')).toBeNull();
  });

  it('rejects encoded traversal outside the distribution root', () => {
    const root = fixture();
    expect(() => resolveStaticAsset(root, 'app://shizuki/%2e%2e%2fsecret.txt')).toThrow(/escapes/);
  });

  it('maps only app-scheme API requests onto the configured gateway', () => {
    expect(createGatewayUrl(
      'app://shizuki/api/v1/meguri/events?after=3',
      'http://111.228.35.186:8080/base'
    )).toBe('http://111.228.35.186:8080/api/v1/meguri/events?after=3');
    expect(() => createGatewayUrl('app://shizuki/assets/app.js', 'http://127.0.0.1:8080')).toThrow(/API URLs/);
    expect(() => createGatewayUrl('app://shizuki/api/v1/state', 'file:///tmp')).toThrow(/HTTP/);
  });
});
