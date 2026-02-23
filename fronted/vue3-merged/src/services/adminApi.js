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
