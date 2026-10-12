export const MEGURI_COMPANION_OPEN_EVENT = 'shizuki:meguri-companion:open';
export const MEGURI_CHECKPOINT_UPDATED_EVENT = 'shizuki:meguri-companion:checkpoint';

export function openMeguriCompanion() {
  if (typeof window === 'undefined') return;
  window.dispatchEvent(new CustomEvent(MEGURI_COMPANION_OPEN_EVENT));
}
