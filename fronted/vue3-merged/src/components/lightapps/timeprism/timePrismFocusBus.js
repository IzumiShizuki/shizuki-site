export const TIMEPRISM_FOCUS_ITEM_EVENT = 'shizuki:timeprism-focus-item';

export function emitTimePrismFocusItem(payload = {}) {
  if (typeof window === 'undefined' || typeof window.dispatchEvent !== 'function') return;
  window.dispatchEvent(
    new CustomEvent(TIMEPRISM_FOCUS_ITEM_EVENT, {
      detail: {
        moduleCode: String(payload.moduleCode || '').trim().toLowerCase(),
        itemId: Number(payload.itemId) || 0
      }
    })
  );
}
