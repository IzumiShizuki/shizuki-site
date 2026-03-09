import { normalizeApiData } from './httpClient';

function ensureAuthorizedFetch(authorizedFetch) {
  if (typeof authorizedFetch !== 'function') {
    throw new Error('authorizedFetch is required for light apps api');
  }
}

function unwrap(response) {
  const data = normalizeApiData(response);
  return data === null || data === undefined ? response : data;
}

export async function listLightAppProjects(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(await authorizedFetch('/api/v1/light-apps/projects', { method: 'GET' }));
}

export async function createLightAppProject(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch('/api/v1/light-apps/projects', {
      method: 'POST',
      body: payload || {}
    })
  );
}

export async function updateLightAppProject(projectId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/projects/${encodeURIComponent(projectId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
}

export async function deleteLightAppProject(projectId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/projects/${encodeURIComponent(projectId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listLightAppTodos(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(await authorizedFetch('/api/v1/light-apps/todos', { method: 'GET' }));
}

export async function createLightAppTodo(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch('/api/v1/light-apps/todos', {
      method: 'POST',
      body: payload || {}
    })
  );
}

export async function updateLightAppTodo(todoId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/todos/${encodeURIComponent(todoId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
}

export async function deleteLightAppTodo(todoId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/todos/${encodeURIComponent(todoId)}`, {
      method: 'DELETE'
    })
  );
}

export async function reorderLightAppTodos(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch('/api/v1/light-apps/todos/reorder', {
      method: 'POST',
      body: payload || {}
    })
  );
}

export async function listLightAppTasks(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(await authorizedFetch('/api/v1/light-apps/tasks', { method: 'GET' }));
}

export async function createLightAppTask(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch('/api/v1/light-apps/tasks', {
      method: 'POST',
      body: payload || {}
    })
  );
}

export async function updateLightAppTask(taskId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/tasks/${encodeURIComponent(taskId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
}

export async function deleteLightAppTask(taskId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/tasks/${encodeURIComponent(taskId)}`, {
      method: 'DELETE'
    })
  );
}

export async function moveLightAppTask(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch('/api/v1/light-apps/tasks/move', {
      method: 'POST',
      body: payload || {}
    })
  );
}

export async function listLightAppTaskColumns(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(await authorizedFetch('/api/v1/light-apps/task-columns', { method: 'GET' }));
}

export async function updateLightAppTaskColumns(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch('/api/v1/light-apps/task-columns', {
      method: 'PUT',
      body: payload || {}
    })
  );
}

export async function listLightAppSchedules(authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(await authorizedFetch('/api/v1/light-apps/schedules', { method: 'GET' }));
}

export async function createLightAppSchedule(payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch('/api/v1/light-apps/schedules', {
      method: 'POST',
      body: payload || {}
    })
  );
}

export async function updateLightAppSchedule(scheduleId, payload, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/schedules/${encodeURIComponent(scheduleId)}`, {
      method: 'PUT',
      body: payload || {}
    })
  );
}

export async function deleteLightAppSchedule(scheduleId, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  return unwrap(
    await authorizedFetch(`/api/v1/light-apps/schedules/${encodeURIComponent(scheduleId)}`, {
      method: 'DELETE'
    })
  );
}

export async function listUpcomingLightAppSchedules(days, authorizedFetch) {
  ensureAuthorizedFetch(authorizedFetch);
  const queryDays = Number(days);
  const query = Number.isFinite(queryDays) && queryDays > 0 ? { days: queryDays } : undefined;
  return unwrap(
    await authorizedFetch('/api/v1/light-apps/schedules/upcoming', {
      method: 'GET',
      query
    })
  );
}
