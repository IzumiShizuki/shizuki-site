import { httpRequest, normalizeApiData } from './httpClient';

function unwrapApiResponse(response) {
  return normalizeApiData(response);
}

export async function unlockAdminPrivilege(code, authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/privileges/unlock', {
    method: 'POST',
    body: { code }
  });
  return unwrapApiResponse(response);
}

export async function listGroupPermissions(authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/groups/permissions', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function replaceGroupPermissions(groupCode, permissions, authorizedFetch) {
  const response = await authorizedFetch(`/api/v1/admin/groups/${encodeURIComponent(groupCode)}/permissions`, {
    method: 'PUT',
    body: { permissions }
  });
  return unwrapApiResponse(response);
}

export async function listAdminUsers(params, authorizedFetch) {
  const query = {
    page: params?.page,
    page_size: params?.pageSize,
    keyword: params?.keyword
  };
  const response = await authorizedFetch('/api/v1/admin/users', {
    method: 'GET',
    query
  });
  return unwrapApiResponse(response);
}

export async function listAdminGroups(params, authorizedFetch) {
  const query = {
    page: params?.page,
    page_size: params?.pageSize,
    keyword: params?.keyword,
    status: params?.status
  };
  const response = await authorizedFetch('/api/v1/admin/groups', {
    method: 'GET',
    query
  });
  return unwrapApiResponse(response);
}

export async function createAdminGroup(payload, authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/groups', {
    method: 'POST',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function updateAdminGroup(groupCode, payload, authorizedFetch) {
  const response = await authorizedFetch(`/api/v1/admin/groups/${encodeURIComponent(groupCode)}`, {
    method: 'PUT',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function deleteAdminGroup(groupCode, privilegeCode, authorizedFetch) {
  const response = await authorizedFetch(`/api/v1/admin/groups/${encodeURIComponent(groupCode)}/delete`, {
    method: 'POST',
    body: {
      privilegeCode
    }
  });
  return unwrapApiResponse(response);
}

export async function getAdminOptions(authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/options', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getUserGroups(userId, authorizedFetch) {
  const response = await authorizedFetch(`/api/v1/admin/users/${encodeURIComponent(userId)}/groups`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function replaceUserGroups(userId, groups, authorizedFetch) {
  const response = await authorizedFetch(`/api/v1/admin/users/${encodeURIComponent(userId)}/groups`, {
    method: 'PUT',
    body: { groups }
  });
  return unwrapApiResponse(response);
}

export async function listQuotaPolicies(authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/group-quota-policies', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function updateQuotaPolicy(policyId, payload, authorizedFetch) {
  const response = await authorizedFetch(`/api/v1/admin/group-quota-policies/${encodeURIComponent(policyId)}`, {
    method: 'PUT',
    body: payload
  });
  return unwrapApiResponse(response);
}

export async function batchUpsertQuotaPolicies(items, authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/group-quota-policies/batch-upsert', {
    method: 'PUT',
    body: { items }
  });
  return unwrapApiResponse(response);
}

export async function probeGateway() {
  return httpRequest('/api/v1/me', {
    method: 'GET'
  });
}

export async function listBlogCategoryMetas(authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/posts/categories', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function listPendingWallpapers(authorizedFetch) {
  const response = await authorizedFetch('/api/v1/admin/home-wallpapers/pending', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function auditWallpaper(wallpaperId, payload, authorizedFetch) {
  const normalizedId = Number(wallpaperId);
  if (!Number.isFinite(normalizedId) || normalizedId <= 0) {
    throw new Error('wallpaperId is required');
  }
  const response = await authorizedFetch(`/api/v1/admin/home-wallpapers/${encodeURIComponent(normalizedId)}/audit-status`, {
    method: 'PUT',
    body: payload || {}
  });
  return unwrapApiResponse(response);
}

export async function updateBlogCategoryMeta(categoryCode, payload, authorizedFetch) {
  const code = String(categoryCode || '').trim();
  if (!code) {
    throw new Error('categoryCode is required');
  }
  const response = await authorizedFetch(`/api/v1/admin/posts/categories/${encodeURIComponent(code)}`, {
    method: 'PUT',
    body: {
      displayName: String(payload?.displayName || '').trim(),
      coverImageUrl: String(payload?.coverImageUrl || '').trim() || undefined,
      sortNum: Number.isFinite(Number(payload?.sortNum)) ? Math.max(0, Math.trunc(Number(payload.sortNum))) : 1000,
      enabled: payload?.enabled !== false
    }
  });
  return unwrapApiResponse(response);
}

export async function deleteBlogCategoryMeta(categoryCode, authorizedFetch) {
  const code = String(categoryCode || '').trim();
  if (!code) {
    throw new Error('categoryCode is required');
  }
  const response = await authorizedFetch(`/api/v1/admin/posts/categories/${encodeURIComponent(code)}`, {
    method: 'DELETE'
  });
  return unwrapApiResponse(response);
}

function normalizeAssetUrl(raw) {
  const value = String(raw || '').trim();
  return value;
}

function sanitizeAssetName(raw, fallback = 'blog-category-cover.png') {
  const source = String(raw || '').trim();
  if (!source) return fallback;
  const dotIndex = source.lastIndexOf('.');
  const ext = dotIndex >= 0 ? source.slice(dotIndex).toLowerCase() : '';
  const base = (dotIndex >= 0 ? source.slice(0, dotIndex) : source)
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');
  const safeExt = ['.png', '.jpg', '.jpeg', '.webp', '.gif'].includes(ext) ? ext : '.png';
  return `${base || 'blog-category-cover'}${safeExt}`;
}

export async function uploadBlogCategoryCover(file, authorizedFetch) {
  if (!(file instanceof File)) {
    throw new Error('请选择图片文件');
  }
  const contentType = String(file.type || '').toLowerCase();
  const allowedTypes = new Set(['image/png', 'image/jpeg', 'image/webp', 'image/gif']);
  if (!allowedTypes.has(contentType)) {
    throw new Error('分类图片必须是 png/jpeg/webp/gif');
  }
  if (Number(file.size || 0) > 5 * 1024 * 1024) {
    throw new Error('分类图片大小需 <= 5MB');
  }

  const fileName = sanitizeAssetName(file.name || 'blog-category-cover.png');
  const policy = unwrapApiResponse(
    await authorizedFetch('/api/v1/assets/upload-policies', {
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
      await authorizedFetch('/api/v1/assets/upload-relay', {
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
      throw new Error(`分类图片上传失败：${error instanceof Error ? error.message : 'unknown'}`);
    }
  }

  const created = unwrapApiResponse(
    await authorizedFetch('/api/v1/assets', {
      method: 'POST',
      body: {
        bucket,
        key,
        assetType: 'image',
        assetKind: 'STATIC_IMAGE',
        contentType: uploadContentType,
        visibility: 'PUBLIC',
        metadata: {
          usage: 'blog_category_cover'
        }
      }
    })
  );
  const assetId = Number(created?.assetId ?? created?.asset_id);
  if (!Number.isFinite(assetId) || assetId <= 0) {
    throw new Error('创建图片资产失败');
  }

  const downloadInfo = unwrapApiResponse(
    await authorizedFetch(`/api/v1/assets/${encodeURIComponent(assetId)}/download-url`, {
      method: 'GET'
    })
  );
  const url = normalizeAssetUrl(
    downloadInfo?.publicUrl || downloadInfo?.public_url || downloadInfo?.downloadUrl || downloadInfo?.download_url
  );
  if (!url) {
    throw new Error('获取分类图片地址失败');
  }
  return {
    assetId,
    url
  };
}
