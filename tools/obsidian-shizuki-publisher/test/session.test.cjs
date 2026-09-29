'use strict';

const test = require('node:test');
const assert = require('node:assert/strict');
const Module = require('node:module');

let requestHandler = async () => { throw new Error('request handler not configured'); };
const obsidianMock = {
  Plugin: class {},
  Modal: class {},
  Setting: class {},
  Notice: class {},
  PluginSettingTab: class {},
  FuzzySuggestModal: class {},
  ItemView: class {},
  TFile: class {},
  requestUrl: (options) => requestHandler(options),
  normalizePath: (value) => String(value).replace(/\\/g, '/')
};

const originalLoad = Module._load;
Module._load = function patchedLoad(request, parent, isMain) {
  if (request === 'obsidian') return obsidianMock;
  return originalLoad.call(this, request, parent, isMain);
};
const MainPlugin = require('../main');
Module._load = originalLoad;

function response(status, json) {
  return { status, json, text: JSON.stringify(json) };
}

function createPlugin() {
  const stored = new Map();
  const secretStorage = {
    isEncryptionAvailable: () => true,
    setSecret: (id, value) => stored.set(id, value),
    getSecret: (id) => stored.get(id) || null,
    deleteSecret: (id) => stored.delete(id)
  };
  return {
    settings: { siteUrl: 'https://site.shizuki.online' },
    app: { secretStorage },
    stored
  };
}

test('sign-in keeps password request-scoped and persists only the refresh token', async () => {
  const plugin = createPlugin();
  const calls = [];
  requestHandler = async (options) => {
    calls.push(options);
    if (options.url.endsWith('/api/v1/auth/tokens')) {
      return response(200, {
        code: 0,
        data: {
          resultType: 'TOKEN_ISSUED',
          accessToken: 'access-token',
          refreshToken: 'refresh-token',
          userId: 7
        }
      });
    }
    return response(200, { code: 0, data: { userId: 7, nickname: 'Izumi' } });
  };

  const client = new MainPlugin._test.ShizukiApiClient(plugin);
  const account = await client.signIn('izumi@example.com', 'request-only-password');
  assert.equal(account.nickname, 'Izumi');
  assert.equal(plugin.stored.get('shizuki-site-publisher-refresh-token'), 'refresh-token');
  assert.equal(client.accessToken, 'access-token');
  assert.equal(client.account.nickname, 'Izumi');
  assert.deepEqual(JSON.parse(calls[0].body), {
    grant_type: 'EMAIL_PASSWORD',
    email: 'izumi@example.com',
    password: 'request-only-password'
  });
  assert.doesNotMatch(JSON.stringify(plugin), /request-only-password|access-token/);
});

test('an unauthorized request refreshes once and retries once', async () => {
  const plugin = createPlugin();
  const client = new MainPlugin._test.ShizukiApiClient(plugin);
  client.accessToken = 'expired';
  client.refreshToken = 'refresh-token';
  let protectedCalls = 0;
  let refreshCalls = 0;
  const refreshBodies = [];
  requestHandler = async (options) => {
    if (options.url.endsWith('/api/v1/auth/tokens')) {
      refreshCalls += 1;
      refreshBodies.push(options.body);
      return response(200, {
        code: 0,
        data: { resultType: 'TOKEN_ISSUED', accessToken: 'fresh', refreshToken: 'rotated' }
      });
    }
    protectedCalls += 1;
    if (protectedCalls === 1) return response(401, { message: 'expired' });
    assert.equal(options.headers.Authorization, 'Bearer fresh');
    return response(200, { code: 0, data: { postId: 11 } });
  };

  const payload = await client.rawRequest('/api/v1/me/posts/11', { auth: true });
  assert.deepEqual(payload, { postId: 11 });
  assert.equal(refreshCalls, 1);
  assert.equal(protectedCalls, 2);
  assert.deepEqual(JSON.parse(refreshBodies.at(-1) || '{}'), {
    grant_type: 'REFRESH_TOKEN',
    refresh_token: 'refresh-token'
  });
});

test('Todo client uses the shared API and preserves the latest record on completion updates', async () => {
  const plugin = createPlugin();
  const client = new MainPlugin._test.ShizukiApiClient(plugin);
  client.accessToken = 'access-token';
  const current = {
    todo_id: 41,
    project_id: 6,
    title: 'Prepare release',
    detail: 'Keep the reminder',
    priority: 'HIGH',
    done: false,
    due_at: '2026-10-02T10:30:00',
    show_on_calendar: true,
    time_precision: 'MINUTE',
    timing_mode: 'RANGE',
    range_start_at: '2026-10-02T09:30:00',
    reminder_enabled: true,
    start_remind_value: 15,
    start_remind_unit: 'MINUTE',
    deadline_remind_value: 5,
    deadline_remind_unit: 'MINUTE',
    sort_num: 8
  };
  const calls = [];
  requestHandler = async (options) => {
    calls.push(options);
    assert.equal(options.headers.Authorization, 'Bearer access-token');
    if (options.method === 'PUT') {
      return response(200, { code: 0, data: { ...current, ...JSON.parse(options.body), todo_id: 41 } });
    }
    return response(200, { code: 0, data: [current] });
  };

  const todos = await client.listTodos();
  assert.equal(todos[0].todoId, 41);
  const saved = await client.setTodoDone(41, true);
  assert.equal(saved.done, true);
  assert.equal(calls.length, 3);
  assert.equal(calls[0].url, 'https://site.shizuki.online/api/v1/light-apps/todos');
  assert.equal(calls[1].method, 'GET');
  assert.equal(calls[2].url, 'https://site.shizuki.online/api/v1/light-apps/todos/41');
  assert.equal(calls[2].method, 'PUT');
  assert.deepEqual(JSON.parse(calls[2].body), {
    project_id: 6,
    title: 'Prepare release',
    detail: 'Keep the reminder',
    priority: 'HIGH',
    done: true,
    due_at: '2026-10-02T10:30:00',
    show_on_calendar: true,
    time_precision: 'MINUTE',
    timing_mode: 'RANGE',
    range_start_at: '2026-10-02T09:30:00',
    reminder_enabled: true,
    start_remind_value: 15,
    start_remind_unit: 'MINUTE',
    deadline_remind_value: 5,
    deadline_remind_unit: 'MINUTE',
    sort_num: 8
  });
});

test('Todo creation validates the title and posts to the shared light-app API', async () => {
  const plugin = createPlugin();
  const client = new MainPlugin._test.ShizukiApiClient(plugin);
  client.accessToken = 'access-token';
  let call;
  requestHandler = async (options) => {
    call = options;
    return response(200, { code: 0, data: { todo_id: 52, title: 'Draft a note', detail: '', priority: 'MEDIUM', done: false } });
  };

  const created = await client.createTodo('  Draft a note  ');
  assert.equal(created.todoId, 52);
  assert.equal(call.url, 'https://site.shizuki.online/api/v1/light-apps/todos');
  assert.equal(call.method, 'POST');
  assert.deepEqual(JSON.parse(call.body), {
    title: 'Draft a note',
    detail: '',
    priority: 'MEDIUM',
    done: false
  });
  await assert.rejects(() => client.createTodo('  '), /1 到 200/);
});

test('serializes nested JSON but preserves binary and pre-serialized bodies', async () => {
  const plugin = createPlugin();
  const bodies = [];
  requestHandler = async (options) => {
    bodies.push(options.body);
    return response(200, { code: 0, data: { ok: true } });
  };
  const client = new MainPlugin._test.ShizukiApiClient(plugin);
  await client.rawRequest('/api/v1/me/posts', {
    method: 'POST',
    body: { categoryCode: 'life', metadata: { sourcePostId: 4 }, tags: ['one'] }
  });
  const binary = new Uint8Array([1, 2, 3]).buffer;
  await client.rawRequest('/upload', { method: 'POST', body: binary });
  const serialized = '{"already_serialized":true}';
  await client.rawRequest('/raw', { method: 'POST', body: serialized });
  assert.deepEqual(JSON.parse(bodies[0]), {
    category_code: 'life',
    metadata: { source_post_id: 4 },
    tags: ['one']
  });
  assert.deepEqual([...new Uint8Array(bodies[1])], [1, 2, 3]);
  assert.equal(bodies[2], serialized);
});

test('adds the configured origin to transport failures and preserves HTTP problem errors', async () => {
  const plugin = createPlugin();
  const client = new MainPlugin._test.ShizukiApiClient(plugin);
  requestHandler = async () => { throw new Error('net::ERR_NAME_NOT_RESOLVED'); };
  await assert.rejects(
    () => client.rawRequest('/api/v1/me'),
    /无法连接 https:\/\/site\.shizuki\.online/
  );

  requestHandler = async () => response(401, { detail: 'Invalid email or password' });
  await assert.rejects(
    () => client.rawRequest('/api/v1/auth/tokens'),
    (error) => error.name === 'ApiError' && error.status === 401 && error.message === 'Invalid email or password'
  );
});
