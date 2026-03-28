function toSafeInt(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? Math.trunc(normalized) : fallback;
}

export function shouldSyncEditorRoute(routeName, routePostId, editorPostId) {
  const normalizedEditorPostId = toSafeInt(editorPostId, 0);
  if (normalizedEditorPostId <= 0) {
    return false;
  }
  if (String(routeName || '') !== 'blog-editor') {
    return false;
  }
  return toSafeInt(routePostId, 0) !== normalizedEditorPostId;
}
