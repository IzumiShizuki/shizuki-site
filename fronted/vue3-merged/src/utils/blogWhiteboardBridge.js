export const BLOG_WHITEBOARD_EXPORT_EVENT = 'shizuki:blog-whiteboard-export';

function normalizeTarget(value) {
  const normalized = String(value || '').trim().toLowerCase();
  return normalized === 'cover' ? 'cover' : 'inline';
}

function normalizeFileName(value, target) {
  const fallback = target === 'cover' ? 'blog-cover-whiteboard.png' : 'blog-inline-whiteboard.png';
  const normalized = String(value || '').trim();
  return normalized || fallback;
}

function buildPayload(detail = {}) {
  const blob = detail?.blob;
  if (!(blob instanceof Blob)) return null;

  const target = normalizeTarget(detail.target);
  const boardId = Number(detail.boardId);

  return {
    target,
    blob,
    fileName: normalizeFileName(detail.fileName, target),
    boardId: Number.isFinite(boardId) && boardId > 0 ? Math.trunc(boardId) : 0,
    boardTitle: String(detail.boardTitle || '').trim()
  };
}

export function emitBlogWhiteboardExport(detail = {}) {
  if (typeof window === 'undefined' || typeof window.dispatchEvent !== 'function') {
    return false;
  }

  const payload = buildPayload(detail);
  if (!payload) return false;

  window.dispatchEvent(
    new CustomEvent(BLOG_WHITEBOARD_EXPORT_EVENT, {
      detail: payload
    })
  );
  return true;
}

export function onBlogWhiteboardExport(listener) {
  if (typeof window === 'undefined' || typeof listener !== 'function') {
    return () => {};
  }

  const handler = (event) => {
    const payload = buildPayload(event?.detail);
    if (!payload) return;
    listener(payload, event);
  };

  window.addEventListener(BLOG_WHITEBOARD_EXPORT_EVENT, handler);
  return () => {
    window.removeEventListener(BLOG_WHITEBOARD_EXPORT_EVENT, handler);
  };
}
