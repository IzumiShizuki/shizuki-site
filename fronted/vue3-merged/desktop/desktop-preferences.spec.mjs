import { mkdtemp, readFile, rm, writeFile } from 'node:fs/promises';
import os from 'node:os';
import path from 'node:path';
import { afterEach, describe, expect, it } from 'vitest';
import {
  defaultDesktopPreferences,
  DesktopPreferencesStore
} from './desktop-preferences.mjs';

const roots = [];

async function tempFile() {
  const root = await mkdtemp(path.join(os.tmpdir(), 'shizuki-desktop-preferences-'));
  roots.push(root);
  return path.join(root, 'desktop-state.json');
}

afterEach(async () => {
  await Promise.all(roots.splice(0).map(root => rm(root, { recursive: true, force: true })));
});

describe('DesktopPreferencesStore', () => {
  it('returns safe defaults when no state exists', async () => {
    const store = new DesktopPreferencesStore(await tempFile());
    const result = await store.load();
    expect(result.value).toEqual(defaultDesktopPreferences());
    expect(result.recoveredFromInvalid).toBe(false);
  });

  it('writes a versioned complete document', async () => {
    const filePath = await tempFile();
    const store = new DesktopPreferencesStore(filePath);
    await store.load();
    await store.update(state => {
      state.interactionMode = 'edit';
    });
    const persisted = JSON.parse(await readFile(filePath, 'utf8'));
    expect(persisted.schemaVersion).toBe(1);
    expect(persisted.interactionMode).toBe('edit');
    expect(persisted.updatedAt).toMatch(/^\d{4}-\d{2}-\d{2}T/);
  });

  it('quarantines malformed or future state before using defaults', async () => {
    const filePath = await tempFile();
    await writeFile(filePath, JSON.stringify({ schemaVersion: 99 }), 'utf8');
    const store = new DesktopPreferencesStore(filePath);
    const result = await store.load();
    expect(result.recoveredFromInvalid).toBe(true);
    expect(result.quarantinePath).toContain('.invalid-');
    expect(JSON.parse(await readFile(result.quarantinePath, 'utf8')).schemaVersion).toBe(99);
    expect(result.value).toEqual(defaultDesktopPreferences());
  });

  it('recovers the previous complete document after an interrupted Windows replacement', async () => {
    const filePath = await tempFile();
    const previous = { ...defaultDesktopPreferences(), interactionMode: 'edit' };
    await writeFile(`${filePath}.bak`, JSON.stringify(previous), 'utf8');
    const store = new DesktopPreferencesStore(filePath);
    const result = await store.load();
    expect(result.recoveredFromBackup).toBe(true);
    expect(store.snapshot().interactionMode).toBe('edit');
    expect(JSON.parse(await readFile(filePath, 'utf8')).interactionMode).toBe('edit');
  });
});
