import { mkdtemp, rm } from 'node:fs/promises';
import os from 'node:os';
import path from 'node:path';
import { afterEach, describe, expect, it, vi } from 'vitest';
import { RecoveryJournal } from './recovery-journal.mjs';

const roots = [];

async function journal() {
  const root = await mkdtemp(path.join(os.tmpdir(), 'shizuki-recovery-'));
  roots.push(root);
  const instance = new RecoveryJournal(path.join(root, 'desktop-recovery.json'));
  await instance.load();
  await instance.beginSession();
  return instance;
}

afterEach(async () => {
  await Promise.all(roots.splice(0).map(root => rm(root, { recursive: true, force: true })));
});

describe('RecoveryJournal', () => {
  it('persists intent before marking a native mutation applied', async () => {
    const instance = await journal();
    const mutation = await instance.recordIntent('desktop-icons', true, false);
    expect(instance.snapshot().mutations[0].status).toBe('pending');
    await instance.markApplied(mutation.id);
    expect(instance.snapshot().mutations[0].status).toBe('applied');
  });

  it('restores outstanding mutations in reverse order', async () => {
    const instance = await journal();
    const first = await instance.recordIntent('desktop-icons', true, false);
    await instance.markApplied(first.id);
    const second = await instance.recordIntent('taskbar-effect', 'normal', 'blur');
    await instance.markApplied(second.id);
    const restore = vi.fn().mockResolvedValue(undefined);
    const result = await instance.restoreOutstanding(restore);
    expect(result.restored).toBe(true);
    expect(restore.mock.calls.map(call => call[0].type)).toEqual(['taskbar-effect', 'desktop-icons']);
    expect(instance.snapshot().cleanShutdown).toBe(true);
  });

  it('enters safe mode when restoration fails', async () => {
    const instance = await journal();
    await instance.recordIntent('desktop-icons', true, false);
    const result = await instance.restoreOutstanding(async () => {
      throw new Error('Explorer unavailable');
    });
    expect(result.safeMode).toBe(true);
    expect(instance.snapshot().cleanShutdown).toBe(false);
    await expect(instance.recordIntent('desktop-icons', true, false)).rejects.toMatchObject({ code: 'SAFE_MODE' });
  });

  it('preserves safe mode when a new host session begins after failed recovery', async () => {
    const instance = await journal();
    await instance.beginSession({
      safeMode: true,
      recoveryErrors: [{ mutationId: 'old', message: 'Explorer unavailable' }]
    });
    expect(instance.snapshot()).toMatchObject({
      cleanShutdown: false,
      safeMode: true,
      recoveryErrors: [{ mutationId: 'old', message: 'Explorer unavailable' }]
    });
    await expect(instance.recordIntent('desktop-icons', true, false)).rejects.toMatchObject({ code: 'SAFE_MODE' });
  });
});
