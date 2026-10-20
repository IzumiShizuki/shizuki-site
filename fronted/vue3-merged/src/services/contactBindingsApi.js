import { normalizeApiData } from './httpClient';

const ROOT = '/api/v1/me/contact-bindings';
const field = (item, camel, snake) => item?.[camel] ?? item?.[snake];

export function normalizeContactStatus(input) {
  const data = normalizeApiData(input) || {};
  return {
    available: Boolean(data.available),
    bindings: (data.bindings || []).map(item => ({
      id: item.id,
      platform: String(field(item, 'platform', 'platform') || '').toUpperCase(),
      maskedIdentity: field(item, 'maskedIdentity', 'masked_identity') || '',
      todoEditEnabled: Boolean(field(item, 'todoEditEnabled', 'todo_edit_enabled')),
      todoNotifyEnabled: Boolean(field(item, 'todoNotifyEnabled', 'todo_notify_enabled')),
      bindingVersion: field(item, 'bindingVersion', 'binding_version') || '',
      boundAt: field(item, 'boundAt', 'bound_at') || null
    }))
  };
}

export function createContactBindingsApi(authorizedFetch, expectedUserId) {
  async function request(path = '', options = {}) {
    return normalizeApiData(await authorizedFetch(ROOT + path, options, { expectedUserId }));
  }
  return {
    status: async () => normalizeContactStatus(await request()),
    challenge: async platform => {
      const value = await request('/challenge', { method: 'POST', body: { platform } });
      return { ...value, expiresAt: field(value, 'expiresAt', 'expires_at') };
    },
    updateCapabilities: async (id, capabilities) => request(`/${encodeURIComponent(id)}/capabilities`, {
      method: 'PUT', body: capabilities
    }),
    unbind: async id => request(`/${encodeURIComponent(id)}`, { method: 'DELETE' })
  };
}
