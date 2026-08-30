import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

describe('AdminRecycleBinWorkspace contract', () => {
  const source = readFileSync(resolve(process.cwd(), 'src/components/admin/AdminRecycleBinWorkspace.vue'), 'utf8');

  it('keeps recovery safe and purge gated by server dry-run output', () => {
    expect(source).toContain('恢复绝不自动发布');
    expect(source).toContain('runDryRun');
    expect(source).toContain('canConfirmPurge');
    expect(source).toContain('confirmationPhrase');
    expect(source).toContain('capabilityExpiresAt');
  });

  it('explicitly drops one-time authorization on target changes and refreshes after mutations', () => {
    expect(source).toContain('discardPurgeAuthorization(); selected.value = null');
    expect(source).toContain('discardPurgeAuthorization(); selected.value = entry');
    expect(source).toContain('await refreshWorkspace();');
    expect(source).toContain('系统不会在此自动删除任何内容');
  });
});
