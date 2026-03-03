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
