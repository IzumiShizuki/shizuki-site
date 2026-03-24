import { normalizeApiData, httpRequest } from './httpClient';

function unwrapApiResponse(response) {
  return normalizeApiData(response);
}

function requireAuthorizedFetch(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required for this request');
  }
  return authorizedFetch;
}

function normalizePostId(postId) {
  const normalized = Number(postId);
  if (!Number.isFinite(normalized) || normalized <= 0) {
    throw new Error('postId is required');
  }
  return Math.trunc(normalized);
}

function normalizeUpsertPayload(payload = {}) {
  const allowedGroupCodes = Array.isArray(payload.allowedGroupCodes) ? payload.allowedGroupCodes : [];
  const tags = Array.isArray(payload.tags) ? payload.tags : [];
  return {
    title: String(payload.title || '').trim(),
    summary: String(payload.summary || '').trim(),
    categoryCode: String(payload.categoryCode || '').trim(),
    slugCode: payload.slugCode ? String(payload.slugCode).trim() : undefined,
    coverImageUrl: payload.coverImageUrl ? String(payload.coverImageUrl).trim() : undefined,
    visibility: String(payload.visibility || 'PUBLIC').trim().toUpperCase(),
    allowedGroupCodes,
    tags,
    markdownBucket: String(payload.markdownBucket || '').trim(),
    markdownKey: String(payload.markdownKey || '').trim()
  };
}

export async function listPosts(query = {}, authorizedFetch) {
  const publishedFrom = String(query.publishedFrom || '').trim();
  const publishedTo = String(query.publishedTo || '').trim();
  const requestPayload = {
    method: 'GET',
    query: {
      page_no: Number.isFinite(Number(query.pageNo)) ? Number(query.pageNo) : 1,
      page_size: Number.isFinite(Number(query.pageSize)) ? Number(query.pageSize) : 10,
      keyword: String(query.keyword || '').trim(),
      category: String(query.category || '').trim(),
      tag: String(query.tag || '').trim(),
      published_from: publishedFrom,
      published_to: publishedTo
    }
  };

  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch('/api/v1/posts', requestPayload)
      : await httpRequest('/api/v1/posts', requestPayload);
  return unwrapApiResponse(response);
}

export async function getPostSidebar(authorizedFetch) {
  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch('/api/v1/posts/sidebar', { method: 'GET' })
      : await httpRequest('/api/v1/posts/sidebar', { method: 'GET' });
  return unwrapApiResponse(response);
}

function normalizeWhisperPayload(payload = {}) {
  return {
    content: String(payload.content || '').trim(),
    nickname: payload.nickname ? String(payload.nickname).trim() : undefined,
    remark: payload.remark ? String(payload.remark).trim() : undefined,
    postId: Number.isFinite(Number(payload.postId)) ? Number(payload.postId) : undefined
  };
}

export async function submitPostWhisper(payload = {}, authorizedFetch) {
  const requestPayload = {
    method: 'POST',
    body: normalizeWhisperPayload(payload)
  };
  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch('/api/v1/posts/whispers', requestPayload)
      : await httpRequest('/api/v1/posts/whispers', requestPayload);
  return unwrapApiResponse(response);
}

export async function getPostDetail(postId, authorizedFetch) {
  const id = normalizePostId(postId);
  const path = `/api/v1/posts/${id}`;
  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch(path, { method: 'GET' })
      : await httpRequest(path, { method: 'GET' });
  return unwrapApiResponse(response);
}

export async function getPostMarkdown(postId, authorizedFetch) {
  const id = normalizePostId(postId);
  const path = `/api/v1/posts/${id}/markdown`;
  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch(path, { method: 'GET' })
      : await httpRequest(path, { method: 'GET' });
  return typeof response === 'string' ? response : String(response || '');
}

export async function listMyPosts(query = {}, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/me/posts', {
    method: 'GET',
    query: {
      page_no: Number.isFinite(Number(query.pageNo)) ? Number(query.pageNo) : 1,
      page_size: Number.isFinite(Number(query.pageSize)) ? Number(query.pageSize) : 20,
      keyword: String(query.keyword || '').trim(),
      status: String(query.status || '').trim().toUpperCase()
    }
  });
  return unwrapApiResponse(response);
}

export async function getMyPostDetail(postId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const id = normalizePostId(postId);
  const response = await request(`/api/v1/me/posts/${id}`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getMyPostCategoryPolicies(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/me/posts/category-policies', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function relayPostMarkdown(file, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  if (!(file instanceof File)) {
    throw new Error('file is required');
  }
  const formData = new FormData();
  formData.append('file', file, file.name || 'blog-post.md');
  const response = await request('/api/v1/me/posts/content-relay', {
    method: 'POST',
    body: formData
  });
  return unwrapApiResponse(response);
}

function normalizeAssetUrl(raw) {
  return String(raw || '').trim();
}

function sanitizeAssetName(raw, fallback = 'blog-cover.png') {
  const source = String(raw || '').trim();
  if (!source) return fallback;
  const dotIndex = source.lastIndexOf('.');
  const ext = dotIndex >= 0 ? source.slice(dotIndex).toLowerCase() : '';
  const base = (dotIndex >= 0 ? source.slice(0, dotIndex) : source)
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '');
  const safeExt = ['.png', '.jpg', '.jpeg', '.webp', '.gif'].includes(ext) ? ext : '.png';
  return `${base || 'blog-cover'}${safeExt}`;
}

export async function uploadBlogCoverImage(file, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  if (!(file instanceof File)) {
    throw new Error('请选择图片文件');
  }

  const contentType = String(file.type || '').toLowerCase();
  const allowedTypes = new Set(['image/png', 'image/jpeg', 'image/webp', 'image/gif']);
  if (!allowedTypes.has(contentType)) {
    throw new Error('封面图片必须是 png/jpeg/webp/gif');
  }
  if (Number(file.size || 0) > 8 * 1024 * 1024) {
    throw new Error('封面图片大小需 <= 8MB');
  }

  const fileName = sanitizeAssetName(file.name || 'blog-cover.png');
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
      throw new Error(`封面上传失败：${error instanceof Error ? error.message : 'unknown'}`);
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
          usage: 'blog_post_cover'
        }
      }
    })
  );

  const assetId = Number(created?.assetId ?? created?.asset_id);
  if (!Number.isFinite(assetId) || assetId <= 0) {
    throw new Error('创建封面资产失败');
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
    throw new Error('获取封面地址失败');
  }
  return {
    assetId,
    url
  };
}

export async function createMyPost(payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/me/posts', {
    method: 'POST',
    body: normalizeUpsertPayload(payload)
  });
  return unwrapApiResponse(response);
}

export async function updateMyPost(postId, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const id = normalizePostId(postId);
  const response = await request(`/api/v1/me/posts/${id}`, {
    method: 'PUT',
    body: normalizeUpsertPayload(payload)
  });
  return unwrapApiResponse(response);
}

export async function publishMyPost(postId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const id = normalizePostId(postId);
  const response = await request(`/api/v1/me/posts/${id}/publish`, {
    method: 'POST'
  });
  return unwrapApiResponse(response);
}

export async function unpublishMyPost(postId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const id = normalizePostId(postId);
  const response = await request(`/api/v1/me/posts/${id}/unpublish`, {
    method: 'POST'
  });
  return unwrapApiResponse(response);
}

export async function generateMyPostPresentation(postId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const id = normalizePostId(postId);
  const response = await request(`/api/v1/me/posts/${id}/presentation/generate`, {
    method: 'POST'
  });
  return unwrapApiResponse(response);
}

export async function getMyPostPresentation(postId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const id = normalizePostId(postId);
  const response = await request(`/api/v1/me/posts/${id}/presentation`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getMyPostPresentationPptDownloadUrl(postId, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const id = normalizePostId(postId);
  const response = await request(`/api/v1/me/posts/${id}/presentation/ppt-download-url`, {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function getPostPresentation(postId, authorizedFetch) {
  const id = normalizePostId(postId);
  const path = `/api/v1/posts/${id}/presentation`;
  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch(path, { method: 'GET' })
      : await httpRequest(path, { method: 'GET' });
  return unwrapApiResponse(response);
}

export async function getPostPresentationPptDownloadUrl(postId, authorizedFetch) {
  const id = normalizePostId(postId);
  const path = `/api/v1/posts/${id}/presentation/ppt-download-url`;
  const response =
    typeof authorizedFetch === 'function'
      ? await authorizedFetch(path, { method: 'GET' })
      : await httpRequest(path, { method: 'GET' });
  return unwrapApiResponse(response);
}

export async function listAdminCategoryPolicies(authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const response = await request('/api/v1/admin/posts/category-policies', {
    method: 'GET'
  });
  return unwrapApiResponse(response);
}

export async function updateAdminCategoryPolicy(categoryCode, payload, authorizedFetch) {
  const request = requireAuthorizedFetch(authorizedFetch);
  const code = String(categoryCode || '').trim();
  if (!code) {
    throw new Error('categoryCode is required');
  }
  const response = await request(`/api/v1/admin/posts/category-policies/${encodeURIComponent(code)}`, {
    method: 'PUT',
    body: {
      enabled: payload?.enabled !== false,
      allowedGroupCodes: Array.isArray(payload?.allowedGroupCodes) ? payload.allowedGroupCodes : []
    }
  });
  return unwrapApiResponse(response);
}
