import { flushPromises, mount } from '@vue/test-utils';
import { ref } from 'vue';
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import McpAccountTokenPanel from './McpAccountTokenPanel.vue';

const mocked = vi.hoisted(() => ({ auth: null }));
vi.mock('../../composables/useAuthSession', () => ({ useAuthSession: () => mocked.auth }));

const TOKEN_PATH = '/api/v1/mcp/account-token';
const SCOPE_PATH = TOKEN_PATH + '/scopes/todo-dev';
const PROJECT = '9007199254740997';
const RAW = 'one-time-example-token';
const inactive = { active: false, createdAt: null, lastRotatedAt: null, scopes: [], todoProjectId: null };
const wrappers = [];
let status;

async function render() {
  const wrapper = mount(McpAccountTokenPanel);
  wrappers.push(wrapper);
  await flushPromises();
  return wrapper;
}

function response(path, options) {
  if (path === TOKEN_PATH && options.method === 'GET') return { data: status };
  if (path === SCOPE_PATH + '/projects') return { data: [{ projectId: PROJECT, name: 'Private Todo Project' }] };
  if (path === TOKEN_PATH + '/rotate') {
    status = { ...status, active: true };
    return { data: { ...status, token: RAW } };
  }
  if (path === TOKEN_PATH && options.method === 'DELETE') {
    status = { ...status, active: false };
    return { data: status };
  }
  if (path === SCOPE_PATH && options.method === 'PUT') {
    status = { ...status, todoProjectId: options.body.projectId, scopes: options.body.projectId ? ['todo-dev'] : [] };
    return { data: status };
  }
  throw new Error('Unexpected route');
}

beforeEach(() => {
  status = { ...inactive };
  localStorage.clear();
  sessionStorage.clear();
  mocked.auth = {
    user: ref({ userId: 7 }),
    isAuthenticated: ref(true),
    authorizedFetch: vi.fn(async (path, options) => response(path, options))
  };
});
afterEach(() => {
  wrappers.splice(0).forEach(wrapper => wrapper.unmount());
  vi.restoreAllMocks();
});

describe('MCP account token panel', () => {
  it('fetches no account status for guests', async () => {
    mocked.auth.isAuthenticated.value = false;
    await render();
    expect(mocked.auth.authorizedFetch).not.toHaveBeenCalled();
  });

  it('shows generated plaintext only in the immediate view and never writes it to storage', async () => {
    const set = vi.spyOn(Storage.prototype, 'setItem');
    const wrapper = await render();
    expect(wrapper.find('[data-testid="mcp-plaintext"]').exists()).toBe(false);
    await wrapper.get('[data-testid="mcp-rotate"]').trigger('click');
    await flushPromises();
    expect(wrapper.get('[data-testid="mcp-plaintext"]').text()).toBe(RAW);
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith(TOKEN_PATH + '/rotate', { method: 'POST' }, { expectedUserId: '7' });
    expect(set).not.toHaveBeenCalled();
    await wrapper.get('[data-testid="mcp-hide"]').trigger('click');
    expect(wrapper.text()).not.toContain(RAW);
    expect((await render()).text()).not.toContain(RAW);
  });

  it('does not display a late plaintext response after the account changes', async () => {
    let release;
    const pending = new Promise(resolve => { release = resolve; });
    mocked.auth.authorizedFetch.mockImplementation(async (path, options) => path.endsWith('/rotate') ? pending : response(path, options));
    const wrapper = await render();
    await wrapper.get('[data-testid="mcp-rotate"]').trigger('click');
    mocked.auth.user.value = { userId: 8 };
    await flushPromises();
    release({ data: { ...inactive, active: true, token: RAW } });
    await flushPromises();
    expect(wrapper.text()).not.toContain(RAW);
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith(TOKEN_PATH, { method: 'GET' }, { expectedUserId: '8' });
  });

  it('requires a separate confirmation to reset or revoke an active token', async () => {
    status = { ...inactive, active: true };
    const wrapper = await render();
    await wrapper.get('[data-testid="mcp-rotate"]').trigger('click');
    expect(mocked.auth.authorizedFetch.mock.calls.filter(([, options]) => options.method !== 'GET')).toHaveLength(0);
    await wrapper.findAll('button').find(button => button.text() === '取消').trigger('click');
    expect(wrapper.find('[data-testid="mcp-confirm"]').exists()).toBe(false);
    await wrapper.get('[data-testid="mcp-rotate"]').trigger('click');
    await wrapper.get('[data-testid="mcp-confirm"]').trigger('click');
    await flushPromises();
    expect(wrapper.get('[data-testid="mcp-plaintext"]').text()).toBe(RAW);
    await wrapper.get('[data-testid="mcp-revoke"]').trigger('click');
    expect(mocked.auth.authorizedFetch.mock.calls.some(([, options]) => options.method === 'DELETE')).toBe(false);
    await wrapper.get('[data-testid="mcp-confirm"]').trigger('click');
    await flushPromises();
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith(TOKEN_PATH, { method: 'DELETE' }, { expectedUserId: '7' });
    expect(wrapper.text()).not.toContain(RAW);
  });

  it('keeps project identifiers as exact strings and sends null only to remove scope', async () => {
    const wrapper = await render();
    await wrapper.get('select').setValue(PROJECT);
    await wrapper.get('form').trigger('submit');
    await flushPromises();
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith(SCOPE_PATH, { method: 'PUT', body: { projectId: PROJECT } }, { expectedUserId: '7' });
    expect(wrapper.text()).toContain('Todo 研发');
    await wrapper.get('select').setValue('');
    await wrapper.get('form').trigger('submit');
    await flushPromises();
    expect(mocked.auth.authorizedFetch).toHaveBeenCalledWith(SCOPE_PATH, { method: 'PUT', body: { projectId: null } }, { expectedUserId: '7' });
  });

  it('does not expose a server error with secret data and blocks retries until status refresh', async () => {
    mocked.auth.authorizedFetch.mockImplementation(async (path, options) => {
      if (path.endsWith('/rotate')) throw new Error(RAW);
      return response(path, options);
    });
    const wrapper = await render();
    await wrapper.get('[data-testid="mcp-rotate"]').trigger('click');
    await flushPromises();
    expect(wrapper.get('[role="alert"]').text()).toContain('无法确认操作结果');
    expect(wrapper.text()).not.toContain(RAW);
    expect(wrapper.get('[data-testid="mcp-rotate"]').attributes('disabled')).toBeDefined();
  });
});
