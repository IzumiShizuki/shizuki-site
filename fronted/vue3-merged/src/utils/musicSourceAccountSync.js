/** Creates a page-scoped, account-aware synchronizer for Folia source accounts. */
export function createMusicSourceAccountSync({ readContext, persistCookie, importPlaylists }) {
  const successfulKeys = new Set();
  const inFlight = new Map();

  const readSnapshot = () => {
    const context = readContext?.() || {};
    const accountId = String(context.accountId || '').trim();
    const cookie = String(context.cookie || '').trim();
    const bound = Boolean(context.bound);
    const bindingVersion = String(context.bindingVersion || '').trim();
    if (!accountId || (!cookie && !bound)) return null;
    return {
      accountId,
      cookie,
      bound,
      key: JSON.stringify([accountId, cookie, cookie ? '' : bindingVersion])
    };
  };

  return async function syncStoredMusicSourceAccount() {
    const snapshot = readSnapshot();
    if (!snapshot) return { skipped: true };
    if (successfulKeys.has(snapshot.key)) return { skipped: true, unchanged: true };
    if (inFlight.has(snapshot.key)) return inFlight.get(snapshot.key);

    const isCurrent = () => readSnapshot()?.key === snapshot.key;
    const pending = (async () => {
      if (snapshot.cookie) {
        let persisted;
        try {
          persisted = await persistCookie(snapshot.cookie, snapshot.accountId);
        } catch (error) {
          if (!isCurrent()) return { skipped: true, stale: true };
          throw error;
        }
        if (!persisted) {
          if (!isCurrent()) return { skipped: true, stale: true };
          throw new Error('无法同步网易云授权，请重试');
        }
      }
      if (!isCurrent()) return { skipped: true, stale: true };
      let result;
      try {
        result = await importPlaylists(snapshot.accountId);
      } catch (error) {
        if (!isCurrent()) return { skipped: true, stale: true };
        throw error;
      }
      if (!isCurrent()) return { skipped: true, stale: true };
      successfulKeys.add(snapshot.key);
      return { skipped: false, result };
    })().finally(() => {
      inFlight.delete(snapshot.key);
    });
    inFlight.set(snapshot.key, pending);
    return pending;
  };
}
