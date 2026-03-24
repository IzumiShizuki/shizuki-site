export const LIGHT_APP_WINDOW_OPEN_EVENT = 'shizuki:light-app-window-open';

export function openLightAppWindow(code, options = {}) {
  const appCode = String(code || '').trim();
  if (!appCode) return;

  if (typeof window === 'undefined' || typeof window.dispatchEvent !== 'function') return;

  const postId = Number(options.postId);
  const scope = String(options.scope || '').trim().toLowerCase();

  window.dispatchEvent(
    new CustomEvent(LIGHT_APP_WINDOW_OPEN_EVENT, {
      detail: {
        code: appCode,
        source: String(options.source || '').trim() || 'unknown',
        moduleCode: String(options.moduleCode || '').trim().toLowerCase() || '',
        focusItemId: Number(options.focusItemId) || 0,
        postId: Number.isFinite(postId) && postId > 0 ? Math.trunc(postId) : 0,
        scope: scope === 'mine' ? 'mine' : scope === 'public' ? 'public' : ''
      }
    })
  );
}
