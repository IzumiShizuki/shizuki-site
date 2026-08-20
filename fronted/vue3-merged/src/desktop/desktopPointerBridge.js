const INTERACTIVE_SELECTOR = [
  '[data-desktop-interactive]',
  'button',
  'a[href]',
  'input',
  'select',
  'textarea',
  '[role="button"]'
].join(',');

export function pointerRequiresDesktopInput(target, editMode = false) {
  if (editMode) return true;
  return Boolean(target && typeof target.closest === 'function' && target.closest(INTERACTIVE_SELECTOR));
}

export function installDesktopPointerBridge({
  desktopApi = typeof window !== 'undefined' ? window.shizukiDesktop : null,
  windowTarget = typeof window !== 'undefined' ? window : null
} = {}) {
  if (!desktopApi?.isDesktop || desktopApi.surface?.role !== 'desktop' || !windowTarget) return () => {};
  let editMode = false;
  let lastPassThrough = null;

  const apply = passThrough => {
    if (lastPassThrough === passThrough) return;
    lastPassThrough = passThrough;
    void desktopApi.setInputPassThrough(passThrough);
  };
  const onPointerMove = event => apply(!pointerRequiresDesktopInput(event.target, editMode));
  const onPointerLeave = () => apply(!editMode);
  const onEditMode = event => {
    editMode = Boolean(event?.detail?.enabled);
    apply(!editMode);
  };

  windowTarget.addEventListener('pointermove', onPointerMove, true);
  windowTarget.addEventListener('pointerleave', onPointerLeave, true);
  windowTarget.addEventListener('shizuki-desktop-edit-mode', onEditMode);
  apply(true);

  return () => {
    windowTarget.removeEventListener('pointermove', onPointerMove, true);
    windowTarget.removeEventListener('pointerleave', onPointerLeave, true);
    windowTarget.removeEventListener('shizuki-desktop-edit-mode', onEditMode);
  };
}

export const desktopPointerBridgeInternals = Object.freeze({ INTERACTIVE_SELECTOR });
