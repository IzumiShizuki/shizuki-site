const REQUIRED_VARIANTS = Object.freeze(['THUMB_WEBP', 'DISPLAY_WEBP', 'FULL_SANITIZED']);

export function momentEditorForm(moment = {}) {
  return {
    body: String(moment.body || ''),
    visibility: String(moment.visibility || 'PRIVATE').toUpperCase(),
    featured: Boolean(moment.featured),
    pinned: Boolean(moment.pinned)
  };
}

export function momentPublishReadiness(moment = {}) {
  const blockers = [];
  const photos = Array.isArray(moment.photos) ? moment.photos : [];
  if (!String(moment.body || '').trim()) blockers.push('需要填写动态正文');
  const scope = String(moment.visibility || 'PRIVATE').toUpperCase() === 'PUBLIC'
    ? 'PUBLIC_MATERIALIZED'
    : 'PRIVATE_WORKING';
  const blockedPhoto = photos.some((photo) => {
    if (String(photo.processingStatus || '').toUpperCase() !== 'READY') return true;
    const variants = Array.isArray(photo.derivatives) ? photo.derivatives : [];
    return REQUIRED_VARIANTS.some((required) => !variants.some((variant) =>
      variant.variant === required
      && variant.deliveryScope === scope
      && String(variant.status || '').toUpperCase() === 'READY'
      && String(variant.auditStatus || '').toUpperCase() === 'APPROVED'));
  });
  if (blockedPhoto) blockers.push('仍有照片派生未就绪');
  return { ready: blockers.length === 0, blockers };
}

export function moveMomentPhoto(photos, fromIndex, toIndex) {
  const next = Array.isArray(photos) ? [...photos] : [];
  if (!Number.isInteger(fromIndex) || !Number.isInteger(toIndex)
    || fromIndex < 0 || toIndex < 0 || fromIndex >= next.length || toIndex >= next.length) return next;
  const [moved] = next.splice(fromIndex, 1);
  next.splice(toIndex, 0, moved);
  return next.map((photo, sort) => ({ ...photo, sort }));
}

export function momentPreviewPath(photo = {}, preferred = 'DISPLAY_WEBP') {
  const variants = Array.isArray(photo.derivatives) ? photo.derivatives : [];
  return String(
    variants.find((item) => item.variant === preferred && item.previewPath)?.previewPath
      || variants.find((item) => item.variant === 'THUMB_WEBP' && item.previewPath)?.previewPath
      || variants.find((item) => item.previewPath)?.previewPath
      || ''
  );
}
