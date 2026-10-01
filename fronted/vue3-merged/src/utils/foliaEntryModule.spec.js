import { describe, expect, it } from 'vitest';
import { resolveFoliaEntryModule } from './foliaEntryModule.js';

describe('resolveFoliaEntryModule', () => {
  it('uses the module URL provided by the current Folia HTML shell', () => {
    expect(resolveFoliaEntryModule(`
      <script src="/music/runtime-config.js"></script>
      <script type="module" crossorigin src="/music/assets/Lattice-newhash.js"></script>
    `)).toBe('/music/assets/Lattice-newhash.js');
  });

  it('surfaces malformed or stale Folia HTML rather than guessing an old hashed URL', () => {
    expect(() => resolveFoliaEntryModule('<html><body>stale shell</body></html>'))
      .toThrow('Folia 页面没有提供入口模块');
  });
});
