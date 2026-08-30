const READY = 'READY';

export function albumEditorForm(album = {}) {
  return {
    title: String(album.title || ''),
    summary: String(album.summary || ''),
    visibility: String(album.visibility || 'PRIVATE').toUpperCase(),
    featured: Boolean(album.featured),
    sortNum: Number(album.sortNum) || 0
  };
}

export function albumPublishReadiness(album = {}) {
  const photos = Array.isArray(album.photos) ? album.photos : [];
  const blockers = [];
  if (!String(album.title || '').trim()) blockers.push('需要填写相册标题');
  if (!photos.length) blockers.push('至少需要一张照片');
  if (!Number(album.coverPhotoId)) blockers.push('需要选择封面');
  if (photos.some((photo) => !String(photo.altText || '').trim())) blockers.push('每张照片都需要替代文本');
  if (photos.some((photo) => !photo.processing?.readyForPublication)) blockers.push('仍有照片派生未就绪');
  return { ready: blockers.length === 0, blockers };
}

export function moveAlbumPhoto(photos, fromIndex, toIndex) {
  const source = Array.isArray(photos) ? [...photos] : [];
  const from = Number(fromIndex);
  const to = Number(toIndex);
  if (!Number.isInteger(from) || !Number.isInteger(to) || from < 0 || to < 0 || from >= source.length || to >= source.length) {
    return source;
  }
  const [moved] = source.splice(from, 1);
  source.splice(to, 0, moved);
  return source.map((photo, index) => ({ ...photo, sortNum: index }));
}

export function preferredAdminPreviewRoute(photo = {}, preferred = 'DISPLAY_WEBP') {
  const variants = Array.isArray(photo.previewVariants)
    ? photo.previewVariants
    : Array.isArray(photo.variants)
      ? photo.variants
      : [];
  return String(
    variants.find((item) => item?.variant === preferred)?.route
      || variants.find((item) => item?.variant === 'THUMB_WEBP')?.route
      || variants[0]?.route
      || ''
  );
}

export function processingTone(status) {
  const normalized = String(status || '').toUpperCase();
  if (normalized === READY) return 'ready';
  if (normalized === 'FAILED') return 'failed';
  return 'working';
}

export function canReapplyPhotoOrder(serverPhotos, intendedPhotoIds) {
  const serverIds = (Array.isArray(serverPhotos) ? serverPhotos : []).map((photo) => Number(photo?.photoId));
  const intendedIds = (Array.isArray(intendedPhotoIds) ? intendedPhotoIds : []).map(Number);
  if (serverIds.length !== intendedIds.length || new Set(serverIds).size !== serverIds.length) return false;
  const intendedSet = new Set(intendedIds);
  return intendedSet.size === intendedIds.length && serverIds.every((id) => intendedSet.has(id));
}

export function uploadProgressLabel(status) {
  return ({
    queued: '等待上传',
    policy: '申请私有上传通道',
    uploading: '正在上传原图',
    relay: '直传失败，切换安全中继',
    asset: '登记私有资产',
    registering: '加入照片库',
    processing: '派生处理中',
    attached: '已加入当前相册',
    failed: '上传失败'
  })[String(status || '')] || '准备中';
}

const RETRYABLE_UPLOAD_STATUSES = new Set(['queued', 'failed']);

export function createUploadQueueItems(files, stamp = Date.now()) {
  return Array.from(files || []).map((file, index) => ({
    id: `${stamp}-${index}-${file?.name || 'photo'}`,
    file,
    title: String(file?.name || '').replace(/\.[^.]+$/u, ''),
    altText: '',
    location: '',
    locationReviewed: false,
    status: 'queued',
    error: ''
  }));
}

export function retryableUploadItems(queue) {
  return (Array.isArray(queue) ? queue : []).filter((item) => RETRYABLE_UPLOAD_STATUSES.has(String(item?.status || '')));
}

export function updateUploadQueueItem(queue, itemId, patch = {}) {
  const id = String(itemId || '');
  return (Array.isArray(queue) ? queue : []).map((item) => (
    String(item?.id || '') === id ? { ...item, ...patch } : item
  ));
}

export function uploadBatchCompletionMessage(completed, attempted) {
  const successful = Math.max(0, Number(completed) || 0);
  const total = Math.max(0, Number(attempted) || 0);
  return `本批次完成 ${successful}/${total} 项；失败项保留，可单独重试。`;
}
