import { describe, expect, it, vi } from 'vitest';
import { createMusicSourceAccountSync } from './musicSourceAccountSync';

function setup(initialContext = {}) {
  let context = { accountId: 'user-1', cookie: 'cookie-a', bound: false, ...initialContext };
  const persistCookie = vi.fn().mockResolvedValue(true);
  const importPlaylists = vi.fn().mockResolvedValue({ importedPlaylists: 2 });
  const sync = createMusicSourceAccountSync({
    readContext: () => context,
    persistCookie,
    importPlaylists
  });
  return { sync, persistCookie, importPlaylists, setContext: (next) => { context = next; } };
}

describe('stored music source account synchronization', () => {
  it('persists an existing Folia cookie and imports playlists once per account and credential', async () => {
    const { sync, persistCookie, importPlaylists } = setup();

    const first = await sync();
    const repeated = await sync();

    expect(first).toMatchObject({ skipped: false, result: { importedPlaylists: 2 } });
    expect(repeated).toMatchObject({ skipped: true, unchanged: true });
    expect(persistCookie).toHaveBeenCalledOnce();
    expect(persistCookie).toHaveBeenCalledWith('cookie-a', 'user-1');
    expect(importPlaylists).toHaveBeenCalledOnce();
    expect(importPlaylists).toHaveBeenCalledWith('user-1');
  });

  it('deduplicates overlapping work and does not import under a switched account', async () => {
    let resolvePersist;
    const persistCookie = vi.fn(() => new Promise((resolve) => { resolvePersist = resolve; }));
    const importPlaylists = vi.fn().mockResolvedValue({});
    let context = { accountId: 'user-1', cookie: 'cookie-a' };
    const sync = createMusicSourceAccountSync({ readContext: () => context, persistCookie, importPlaylists });

    const first = sync();
    const overlapping = sync();
    expect(persistCookie).toHaveBeenCalledOnce();
    context = { accountId: 'user-2', cookie: 'cookie-b' };
    resolvePersist(true);

    await Promise.all([first, overlapping]);
    expect(importPlaylists).not.toHaveBeenCalled();
  });

  it('imports for an already-bound backend account and permits retry after failure', async () => {
    const { sync, persistCookie, importPlaylists } = setup({ cookie: '', bound: true, bindingVersion: '2026-01-01' });
    importPlaylists.mockRejectedValueOnce(new Error('temporary failure'));

    await expect(sync()).rejects.toThrow('temporary failure');
    expect(await sync()).toMatchObject({ skipped: false });
    expect(persistCookie).not.toHaveBeenCalled();
    expect(importPlaylists).toHaveBeenCalledTimes(2);
  });

  it('scopes unchanged-credential deduplication to the signed-in account', async () => {
    const { sync, importPlaylists, setContext } = setup();
    await sync();
    setContext({ accountId: 'user-2', cookie: 'cookie-a', bound: false });

    await sync();

    expect(importPlaylists).toHaveBeenCalledTimes(2);
    expect(importPlaylists).toHaveBeenLastCalledWith('user-2');
  });
});
