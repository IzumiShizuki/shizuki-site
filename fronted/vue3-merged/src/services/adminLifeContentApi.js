import { normalizeApiData } from './httpClient';

const PHOTO_MAX_BYTES = 50 * 1024 * 1024;
const PHOTO_CONTENT_TYPES = new Set(['image/png', 'image/jpeg', 'image/webp', 'image/gif']);

function requestWith(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') throw new TypeError('authorizedFetch is required');
  return authorizedFetch;
}

function unwrap(response) {
  return normalizeApiData(response);
}

function positiveId(value, label) {
  const id = Number(value);
  if (!Number.isSafeInteger(id) || id <= 0) throw new TypeError(`${label} must be a positive integer`);
  return id;
}

function ifMatchHeaders(etag) {
  const value = String(etag || '').trim();
  if (!value) throw new TypeError('ETag is required');
  return { 'If-Match': value };
}

function albumPath(albumId, suffix = '') {
  return `/api/v1/admin/life/albums/${encodeURIComponent(positiveId(albumId, 'albumId'))}${suffix}`;
}

function momentPath(momentId, suffix = '') {
  return `/api/v1/admin/life/moments/${encodeURIComponent(positiveId(momentId, 'momentId'))}${suffix}`;
}

function photoPath(photoId, suffix = '') {
  return `/api/v1/admin/life/photos/${encodeURIComponent(positiveId(photoId, 'photoId'))}${suffix}`;
}

function expectedVersion(value) {
  const version = Number(value);
  if (!Number.isSafeInteger(version) || version < 0) throw new TypeError('expectedVersion must be a non-negative integer');
  return version;
}

function safeFileName(raw, fallback = 'photo.jpg') {
  const source = String(raw || '').trim();
  const dot = source.lastIndexOf('.');
  const extension = dot >= 0 ? source.slice(dot).toLowerCase() : '';
  const stem = (dot >= 0 ? source.slice(0, dot) : source)
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');
  const safeExtension = ['.png', '.jpg', '.jpeg', '.webp', '.gif'].includes(extension) ? extension : '.jpg';
  return `${stem || fallback.replace(/\.[^.]+$/u, '')}${safeExtension}`;
}

export async function listAdminAlbums({ includeRecycled = false, limit = 50 } = {}, authorizedFetch) {
  const response = await requestWith(authorizedFetch)('/api/v1/admin/life/albums', {
    method: 'GET',
    query: { include_recycled: Boolean(includeRecycled), limit: Math.max(1, Math.min(100, Number(limit) || 50)) }
  });
  const data = unwrap(response);
  return Array.isArray(data) ? data : [];
}

export async function getAdminAlbum(albumId, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId), { method: 'GET' }));
}

export async function getAdminAlbumPreview(albumId, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId, '/preview'), { method: 'GET' }));
}

export async function createAdminAlbum(payload, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)('/api/v1/admin/life/albums', {
    method: 'POST',
    body: {
      title: String(payload?.title || '').trim(),
      summary: String(payload?.summary || '').trim(),
      visibility: String(payload?.visibility || 'PRIVATE').toUpperCase()
    }
  }));
}

export async function updateAdminAlbum(albumId, payload, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId), {
    method: 'PUT',
    headers: ifMatchHeaders(etag),
    body: {
      title: String(payload?.title || '').trim(),
      summary: String(payload?.summary || '').trim(),
      visibility: String(payload?.visibility || 'PRIVATE').toUpperCase(),
      featured: Boolean(payload?.featured),
      sortNum: Number(payload?.sortNum) || 0
    }
  }));
}

export async function selectAdminAlbumCover(albumId, photoId, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId, '/cover'), {
    method: 'PUT',
    headers: ifMatchHeaders(etag),
    body: { photoId: positiveId(photoId, 'photoId') }
  }));
}

export async function attachAdminAlbumPhotos(albumId, photos, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId, '/photos/attach'), {
    method: 'POST',
    headers: ifMatchHeaders(etag),
    body: { photos }
  }));
}

export async function detachAdminAlbumPhotos(albumId, photoIds, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId, '/photos/detach'), {
    method: 'POST',
    headers: ifMatchHeaders(etag),
    body: { photoIds }
  }));
}

export async function reorderAdminAlbumPhotos(albumId, photoIds, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId, '/photos/order'), {
    method: 'PUT',
    headers: ifMatchHeaders(etag),
    body: { photoIds }
  }));
}

async function albumCommand(albumId, command, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId, `/${command}`), {
    method: 'POST',
    headers: ifMatchHeaders(etag)
  }));
}

export const publishAdminAlbum = (albumId, etag, authorizedFetch) => albumCommand(albumId, 'publish', etag, authorizedFetch);
export const archiveAdminAlbum = (albumId, etag, authorizedFetch) => albumCommand(albumId, 'archive', etag, authorizedFetch);
export const restoreAdminAlbum = (albumId, etag, authorizedFetch) => albumCommand(albumId, 'restore', etag, authorizedFetch);

export async function dryRunAdminAlbumPurge(albumId, version, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId, '/purge-dry-run'), {
    method: 'POST', body: { expectedVersion: expectedVersion(version) }
  }));
}

export async function purgeAdminAlbum(albumId, version, capability, confirmation, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(albumPath(albumId, '/purge'), {
    method: 'POST', body: { expectedVersion: expectedVersion(version), capability: String(capability || '').trim(), confirmation: String(confirmation || '').trim() }
  }));
}

export async function listAdminMoments({ includeRecycled = false, limit = 50 } = {}, authorizedFetch) {
  const response = await requestWith(authorizedFetch)('/api/v1/admin/life/moments', {
    method: 'GET',
    query: { include_recycled: Boolean(includeRecycled), limit: Math.max(1, Math.min(100, Number(limit) || 50)) }
  });
  const data = unwrap(response);
  return Array.isArray(data) ? data : [];
}

export async function getAdminMoment(momentId, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(momentPath(momentId), { method: 'GET' }));
}

export async function getAdminMomentPreview(momentId, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(momentPath(momentId, '/preview'), { method: 'GET' }));
}

export async function createAdminMoment(payload, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)('/api/v1/admin/life/moments', {
    method: 'POST',
    body: {
      body: String(payload?.body || '').trim(),
      visibility: String(payload?.visibility || 'PRIVATE').toUpperCase()
    }
  }));
}

export async function updateAdminMoment(momentId, payload, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(momentPath(momentId), {
    method: 'PUT',
    headers: ifMatchHeaders(etag),
    body: {
      body: String(payload?.body || '').trim(),
      visibility: String(payload?.visibility || 'PRIVATE').toUpperCase(),
      featured: Boolean(payload?.featured),
      pinned: Boolean(payload?.pinned)
    }
  }));
}

async function mutateAdminMomentPhotos(momentId, command, method, photoIds, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(momentPath(momentId, `/photos/${command}`), {
    method,
    headers: ifMatchHeaders(etag),
    body: { photoIds: (Array.isArray(photoIds) ? photoIds : []).map((id) => positiveId(id, 'photoId')) }
  }));
}

export const attachAdminMomentPhotos = (momentId, photoIds, etag, authorizedFetch) =>
  mutateAdminMomentPhotos(momentId, 'attach', 'POST', photoIds, etag, authorizedFetch);
export const detachAdminMomentPhotos = (momentId, photoIds, etag, authorizedFetch) =>
  mutateAdminMomentPhotos(momentId, 'detach', 'POST', photoIds, etag, authorizedFetch);
export const reorderAdminMomentPhotos = (momentId, photoIds, etag, authorizedFetch) =>
  mutateAdminMomentPhotos(momentId, 'order', 'PUT', photoIds, etag, authorizedFetch);

async function momentCommand(momentId, command, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(momentPath(momentId, `/${command}`), {
    method: 'POST',
    headers: ifMatchHeaders(etag)
  }));
}

export const publishAdminMoment = (momentId, etag, authorizedFetch) => momentCommand(momentId, 'publish', etag, authorizedFetch);
export const archiveAdminMoment = (momentId, etag, authorizedFetch) => momentCommand(momentId, 'archive', etag, authorizedFetch);
export const restoreAdminMoment = (momentId, etag, authorizedFetch) => momentCommand(momentId, 'restore', etag, authorizedFetch);

export async function dryRunAdminMomentPurge(momentId, version, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(momentPath(momentId, '/purge-dry-run'), {
    method: 'POST', body: { expectedVersion: expectedVersion(version) }
  }));
}

export async function purgeAdminMoment(momentId, version, capability, confirmation, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(momentPath(momentId, '/purge'), {
    method: 'POST', body: { expectedVersion: expectedVersion(version), capability: String(capability || '').trim(), confirmation: String(confirmation || '').trim() }
  }));
}

export async function listAdminManagedPhotos({ includeRecycled = false, limit = 100 } = {}, authorizedFetch) {
  const response = await requestWith(authorizedFetch)('/api/v1/admin/life/photos', {
    method: 'GET',
    query: { include_recycled: Boolean(includeRecycled), limit: Math.max(1, Math.min(200, Number(limit) || 100)) }
  });
  const data = unwrap(response);
  return Array.isArray(data) ? data : [];
}

/** The current photo management contract exposes recycled photo metadata through the collection route only. */
export async function getAdminManagedPhoto(photoId, authorizedFetch) {
  const id = positiveId(photoId, 'photoId');
  const photos = await listAdminManagedPhotos({ includeRecycled: true, limit: 200 }, authorizedFetch);
  return photos.find((photo) => Number(photo?.id) === id) || null;
}

export async function restoreAdminManagedPhoto(photoId, version, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(photoPath(photoId, '/restore'), {
    method: 'POST', body: { expectedVersion: expectedVersion(version) }
  }));
}

export async function dryRunAdminManagedPhotoPurge(photoId, version, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(photoPath(photoId, '/purge-dry-run'), {
    method: 'POST', body: { expectedVersion: expectedVersion(version) }
  }));
}

export async function purgeAdminManagedPhoto(photoId, version, capability, confirmation, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(photoPath(photoId, '/purge'), {
    method: 'POST', body: { expectedVersion: expectedVersion(version), capability: String(capability || '').trim(), confirmation: String(confirmation || '').trim() }
  }));
}

export async function registerAdminManagedPhoto(payload, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)('/api/v1/admin/life/photos', {
    method: 'POST',
    body: {
      assetId: positiveId(payload?.assetId, 'assetId'),
      title: String(payload?.title || '').trim(),
      altText: String(payload?.altText || '').trim(),
      publishedLocationLabel: String(payload?.publishedLocationLabel || '').trim(),
      capturedAtDraft: payload?.capturedAtDraft || null,
      locationReviewAcknowledged: Boolean(payload?.locationReviewAcknowledged)
    }
  }));
}

export async function updateAdminManagedPhoto(photoId, payload, etag, authorizedFetch) {
  return unwrap(await requestWith(authorizedFetch)(`/api/v1/admin/life/photos/${encodeURIComponent(positiveId(photoId, 'photoId'))}`, {
    method: 'PUT',
    headers: ifMatchHeaders(etag),
    body: {
      title: String(payload?.title || '').trim(),
      altText: String(payload?.altText || '').trim(),
      publishedLocationLabel: String(payload?.publishedLocationLabel || '').trim(),
      capturedAtDraft: payload?.capturedAtDraft || null,
      locationReviewAcknowledged: Boolean(payload?.locationReviewAcknowledged)
    }
  }));
}

export async function retryAdminMediaDerivative(route, etag, authorizedFetch) {
  const path = String(route || '').trim();
  if (!/^\/api\/v1\/admin\/life\/media-associations\/[A-Za-z0-9_-]+\/processing\/[A-Z_]+\/retry$/u.test(path)) {
    throw new TypeError('Invalid derivative retry route');
  }
  return unwrap(await requestWith(authorizedFetch)(path, {
    method: 'POST',
    headers: ifMatchHeaders(etag)
  }));
}

export async function updateAdminPhotoDownloadPolicy(photo, mode, privacyAcknowledged, authorizedFetch) {
  const mediaRef = String(photo?.mediaRef || '').trim();
  if (!/^[A-Za-z0-9_-]+$/u.test(mediaRef)) throw new TypeError('Invalid mediaRef');
  return unwrap(await requestWith(authorizedFetch)(`/api/v1/admin/life/media-associations/${encodeURIComponent(mediaRef)}/download-policy`, {
    method: 'PUT',
    body: {
      mode: String(mode || 'NONE').toUpperCase(),
      expectedVersion: Number(photo?.associationVersion) || 0,
      originalPrivacyAcknowledged: Boolean(privacyAcknowledged)
    }
  }));
}

export async function uploadAdminManagedPhoto(file, metadata, authorizedFetch, onProgress = () => {}) {
  const request = requestWith(authorizedFetch);
  if (!(file instanceof File)) throw new TypeError('请选择照片文件');
  const contentType = String(file.type || '').toLowerCase();
  if (!PHOTO_CONTENT_TYPES.has(contentType)) throw new TypeError('照片必须是 png/jpeg/webp/gif');
  if (Number(file.size || 0) > PHOTO_MAX_BYTES) throw new TypeError('照片大小需不超过 50MB');
  const assetKind = contentType === 'image/gif' ? 'ANIMATED_IMAGE' : 'STATIC_IMAGE';
  const fileName = safeFileName(file.name);

  onProgress('policy');
  const policy = unwrap(await request('/api/v1/assets/upload-policies', {
    method: 'POST',
    body: { fileName, contentType, assetKind, visibility: 'PRIVATE' }
  }));
  let bucket = String(policy?.bucket || '').trim();
  let key = String(policy?.key || '').trim();
  const uploadUrl = String(policy?.uploadUrl || policy?.upload_url || '').trim();
  if (!bucket || !key || !uploadUrl) throw new Error('照片上传策略无效');

  onProgress('uploading');
  try {
    const response = await fetch(uploadUrl, { method: 'PUT', headers: { 'Content-Type': contentType }, body: file });
    if (!response.ok) throw new Error(`direct upload failed (${response.status})`);
  } catch (directError) {
    onProgress('relay');
    const formData = new FormData();
    formData.append('file', file, file.name || fileName);
    formData.append('asset_kind', assetKind);
    formData.append('visibility', 'PRIVATE');
    const relay = unwrap(await request('/api/v1/assets/upload-relay', { method: 'POST', body: formData }));
    bucket = String(relay?.bucket || '').trim();
    key = String(relay?.key || '').trim();
    if (!bucket || !key) throw directError;
  }

  onProgress('asset');
  const asset = unwrap(await request('/api/v1/assets', {
    method: 'POST',
    body: {
      bucket,
      key,
      assetType: 'image',
      assetKind,
      contentType,
      visibility: 'PRIVATE',
      metadata: { usage: 'personal_photo_original', originalFileName: fileName }
    }
  }));

  onProgress('registering');
  const photo = await registerAdminManagedPhoto({ ...metadata, assetId: asset?.assetId ?? asset?.asset_id }, authorizedFetch);
  onProgress('processing');
  return photo;
}
