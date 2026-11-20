import { normalizeApiData } from './httpClient';

const ROOT = '/api/v1/light-apps/todos/dev';

export const TODO_DEV_STAGES = Object.freeze({
  RESEARCH: '技术调研',
  DESIGN: '方案设计',
  IMPLEMENTATION: '代码编写',
  VERIFICATION: '测试验收'
});

export const TODO_DEV_STATUSES = Object.freeze({
  READY: '待开始',
  IN_PROGRESS: '进行中',
  BLOCKED: '阻塞',
  FAILED: '失败',
  AWAITING_APPROVAL: '待确认',
  COMPLETE: '已完成'
});

function requireContext(response) {
  const data = normalizeApiData(response);
  if (typeof data?.todo_id !== 'string' || !/^[1-9][0-9]*$/.test(data.todo_id) ||
      !Object.hasOwn(TODO_DEV_STAGES, data.stage) || !Object.hasOwn(TODO_DEV_STATUSES, data.status) ||
      !Number.isSafeInteger(data.version) || data.version < 0) {
    throw new Error('研发待办返回格式异常。');
  }
  return data;
}

function itemPath(todoId) {
  return ROOT + '/' + encodeURIComponent(todoId);
}

export async function listTodoDevelopment(authorizedFetch) {
  const data = normalizeApiData(await authorizedFetch(ROOT + '/overview', { method: 'GET' }));
  if (!Array.isArray(data)) throw new Error('研发概览返回格式异常。');
  // IDs in the workflow API are decimal strings. Do not turn them into JS numbers.
  return data.map(requireContext);
}

export async function readTodoDevelopment(todoId, authorizedFetch) {
  try {
    return requireContext(await authorizedFetch(itemPath(todoId), { method: 'GET' }));
  } catch (error) {
    if (error?.status === 404) return null;
    throw error;
  }
}

export async function enableTodoDevelopment(todoId, payload, authorizedFetch) {
  return requireContext(await authorizedFetch(itemPath(todoId) + '/enable', { method: 'POST', body: payload }));
}

export async function approveTodoDevelopment(todoId, payload, authorizedFetch) {
  return requireContext(await authorizedFetch(itemPath(todoId) + '/approve', { method: 'POST', body: payload }));
}
