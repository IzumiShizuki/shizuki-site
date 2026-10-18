import { normalizeApiData } from './httpClient';

const ROOT = '/api/v1/me/wechat-notifications';
const field = (item, camel, snake) => item?.[camel] ?? item?.[snake];
export function normalizeWechatStatus(input) {
  const data = normalizeApiData(input) || {};
  return {
    available: Boolean(data.available), bound: Boolean(data.bound), paused: Boolean(data.paused),
    maskedIdentity: field(data, 'maskedIdentity', 'masked_identity') || '',
    boundAt: field(data, 'boundAt', 'bound_at') || null,
    quietStart: field(data, 'quietStart', 'quiet_start') ?? null,
    quietEnd: field(data, 'quietEnd', 'quiet_end') ?? null,
    groups: Array.isArray(data.groups) ? data.groups : [],
    subscriptions: (data.subscriptions || []).map(s => ({ groupCode: field(s, 'groupCode', 'group_code'), kind: s.kind })),
    history: (data.history || []).map(h => ({ ...h, createdAt: field(h, 'createdAt', 'created_at'),
      errorCode: field(h, 'errorCode', 'error_code') }))
  };
}
export function createWechatNotificationsApi(authorizedFetch, expectedUserId) {
  async function request(path = '', options = {}) {
    return normalizeApiData(await authorizedFetch(ROOT + path, options, { expectedUserId }));
  }
  return {
    status: async () => normalizeWechatStatus(await request()),
    challenge: async () => {
      const value = await request('/binding-code', { method: 'POST' });
      return { command: value.command, expiresAt: field(value, 'expiresAt', 'expires_at') };
    },
    save: preferences => request('/preferences', { method: 'PUT', body: preferences }),
    unbind: () => request('/binding', { method: 'DELETE' })
  };
}
