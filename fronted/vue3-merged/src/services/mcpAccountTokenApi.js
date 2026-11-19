import { normalizeApiData } from './httpClient';

const TOKEN_PATH = '/api/v1/mcp/account-token';
const TODO_SCOPE_PATH = TOKEN_PATH + '/scopes/todo-dev';

function projectId(value) {
  return typeof value === 'string' && /^[1-9]\d*$/.test(value) ? value : null;
}

function statusOf(source) {
  if (typeof source?.active !== 'boolean') throw new Error('Invalid MCP account token status');
  return {
    active: source.active,
    createdAt: source.createdAt ?? null,
    lastRotatedAt: source.lastRotatedAt ?? null,
    scopes: Array.isArray(source.scopes) ? source.scopes.filter(scope => typeof scope === 'string') : [],
    todoProjectId: projectId(source.todoProjectId)
  };
}

export function createMcpAccountTokenApi(authorizedFetch) {
  async function request(path, options) {
    const result = await authorizedFetch(path, options);
    return normalizeApiData(result) ?? result;
  }
  return {
    async getStatus() {
      return statusOf(await request(TOKEN_PATH, { method: 'GET' }));
    },
    async listTodoProjects() {
      const data = await request(TODO_SCOPE_PATH + '/projects', { method: 'GET' });
      if (!Array.isArray(data)) throw new Error('Invalid MCP project choices');
      return data
        .map(row => ({ projectId: projectId(row?.projectId), name: String(row?.name ?? '').trim() }))
        .filter(row => row.projectId);
    },
    async rotate() {
      const data = await request(TOKEN_PATH + '/rotate', { method: 'POST' });
      if (typeof data?.token !== 'string' || !data.token || !data.active) throw new Error('MCP token not returned');
      return { status: statusOf(data), token: data.token };
    },
    async revoke() {
      return statusOf(await request(TOKEN_PATH, { method: 'DELETE' }));
    },
    async setTodoProject(value) {
      if (value !== null && !projectId(value)) throw new TypeError('Invalid MCP project ID');
      return statusOf(await request(TODO_SCOPE_PATH, { method: 'PUT', body: { projectId: value } }));
    }
  };
}
