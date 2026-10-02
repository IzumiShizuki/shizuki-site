const PRIVATE_VISIBILITY = 'PRIVATE';

function normalizeAccountId(value) {
  return String(value ?? '').trim();
}

export function resolveWallpaperSnapshotForSession(snapshot, session = {}) {
  if (!snapshot || typeof snapshot !== 'object' || !snapshot.profile || typeof snapshot.profile !== 'object') {
    return null;
  }
  const visibility = String(snapshot.visibility || snapshot.profile.visibility || 'UNKNOWN').toUpperCase();
  if (!['PUBLIC', PRIVATE_VISIBILITY].includes(visibility)) return null;
  if (visibility === PRIVATE_VISIBILITY) {
    const ownerId = normalizeAccountId(snapshot.accountId);
    const currentId = normalizeAccountId(session.accountId);
    if (!session.authorizationReady || !ownerId || ownerId !== currentId) return null;
  }
  return { ...snapshot, visibility };
}

export function reconcileWallpaperSelections(selection, items, { authoritative = false } = {}) {
  const current = {
    globalBackgroundId: String(selection?.globalBackgroundId || ''),
    routeBackgroundByKey: { ...(selection?.routeBackgroundByKey || {}) }
  };
  if (!authoritative) return current;

  const validIds = new Set((Array.isArray(items) ? items : [])
    .map((item) => String(item?.id || '').trim())
    .filter(Boolean));
  if (current.globalBackgroundId && !validIds.has(current.globalBackgroundId)) {
    current.globalBackgroundId = '';
  }
  for (const [routeKey, id] of Object.entries(current.routeBackgroundByKey)) {
    if (!validIds.has(String(id || ''))) delete current.routeBackgroundByKey[routeKey];
  }
  return current;
}

export function isSnapshotSelectionCurrent(snapshot, { globalBackgroundId = '', routeBackgroundId = '' } = {}) {
  if (!snapshot?.profile?.id) return false;
  const selectedId = snapshot.scope === 'route' ? routeBackgroundId : globalBackgroundId;
  return !selectedId || String(selectedId) === String(snapshot.profile.id);
}
