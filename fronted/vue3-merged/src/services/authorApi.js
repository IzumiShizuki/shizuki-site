import { httpRequest, normalizeApiData } from './httpClient';

function unwrapApiResponse(response) {
  return normalizeApiData(response);
}

function requireAuthorizedFetch(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required for this request');
  }
  return authorizedFetch;
}

function normalizeAssetUrl(raw) {
  return String(raw || '').trim();
}

function sanitizeAssetName(raw, fallback = 'author-avatar.png') {
  const source = String(raw || '').trim();
  if (!source) return fallback;
  const dotIndex = source.lastIndexOf('.');
  const ext = dotIndex >= 0 ? source.slice(dotIndex).toLowerCase() : '';
  const base = (dotIndex >= 0 ? source.slice(0, dotIndex) : source)
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');
  const safeExt = ['.png', '.jpg', '.jpeg', '.webp', '.gif'].includes(ext) ? ext : '.png';
  return `${base || 'author-avatar'}${safeExt}`;
}

export async function getAuthorProfile(authorizedFetch) {
  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch('/api/v1/author/profile', { method: 'GET' })
      : await httpRequest('/api/v1/author/profile', { method: 'GET' });
  return unwrapApiResponse(response);
}

export async function getAdminAuthorProfile(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/author/profile', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function updateAdminAuthorProfile(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/author/profile', {
    method: 'PUT',
    body: {
      enabled: payload?.enabled !== false,
      profileJson: payload?.profileJson || {}
    }
  });
  return unwrapApiResponse(response);
}

export async function uploadAuthorAvatar(file, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  if (!(file instanceof File)) {
    throw new Error('请选择头像图片');
  }

  const contentType = String(file.type || '').toLowerCase();
  const allowedTypes = new Set(['image/png', 'image/jpeg', 'image/webp', 'image/gif']);
  if (!allowedTypes.has(contentType)) {
    throw new Error('头像图片必须是 png/jpeg/webp/gif');
  }
  if (Number(file.size || 0) > 8 * 1024 * 1024) {
    throw new Error('头像图片大小需 <= 8MB');
  }

  const fileName = sanitizeAssetName(file.name || 'author-avatar.png');
  const policy = unwrapApiResponse(
    await request('/api/v1/assets/upload-policies', {
      method: 'POST',
      body: {
        fileName,
        contentType,
        assetKind: 'STATIC_IMAGE',
        visibility: 'PUBLIC'
      }
    })
  );

  const uploadUrl = String(policy?.uploadUrl || policy?.upload_url || '').trim();
  const policyBucket = String(policy?.bucket || '').trim();
  const policyKey = String(policy?.key || '').trim();
  if (!uploadUrl || !policyBucket || !policyKey) {
    throw new Error('上传策略无效');
  }

  let bucket = policyBucket;
  let key = policyKey;
  let uploadContentType = contentType;

  try {
    const directResult = await fetch(uploadUrl, {
      method: 'PUT',
      headers: {
        'Content-Type': contentType
      },
      body: file
    });
    if (!directResult.ok) {
      throw new Error(`direct upload failed (${directResult.status})`);
    }
  } catch (error) {
    const relayPayload = unwrapApiResponse(
      await request('/api/v1/assets/upload-relay', {
        method: 'POST',
        body: (() => {
          const formData = new FormData();
          formData.append('file', file, file.name || fileName);
          formData.append('asset_kind', 'STATIC_IMAGE');
          formData.append('visibility', 'PUBLIC');
          return formData;
        })()
      })
    );

    bucket = String(relayPayload?.bucket || '').trim();
    key = String(relayPayload?.key || '').trim();
    uploadContentType = String(relayPayload?.contentType || relayPayload?.content_type || contentType).trim() || contentType;
    if (!bucket || !key) {
      throw new Error(`头像上传失败：${error instanceof Error ? error.message : 'unknown'}`);
    }
  }

  const created = unwrapApiResponse(
    await request('/api/v1/assets', {
      method: 'POST',
      body: {
        bucket,
        key,
        assetType: 'image',
        assetKind: 'STATIC_IMAGE',
        contentType: uploadContentType,
        visibility: 'PUBLIC',
        metadata: {
          usage: 'author_avatar'
        }
      }
    })
  );

  const assetId = Number(created?.assetId ?? created?.asset_id);
  if (!Number.isFinite(assetId) || assetId <= 0) {
    throw new Error('创建头像资产失败');
  }

  const downloadInfo = unwrapApiResponse(
    await request(`/api/v1/assets/${encodeURIComponent(assetId)}/download-url`, {
      method: 'GET'
    })
  );
  const url = normalizeAssetUrl(
    downloadInfo?.publicUrl || downloadInfo?.public_url || downloadInfo?.downloadUrl || downloadInfo?.download_url
  );
  if (!url) {
    throw new Error('获取头像地址失败');
  }
  return {
    assetId,
    url
  };
}
