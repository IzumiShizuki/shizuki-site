import assert from 'node:assert/strict';
import { once } from 'node:events';
import { createServer } from 'node:http';
import { test } from 'node:test';
import { fileURLToPath } from 'node:url';
import { Client } from '@modelcontextprotocol/sdk/client/index.js';
import { StdioClientTransport } from '@modelcontextprotocol/sdk/client/stdio.js';
import { makeTodoApi } from '../src/api.mjs';

const script = fileURLToPath(new URL('../src/server.mjs', import.meta.url));
const base = '/api/v1/light-apps/todos/dev';
const token = 'local-test-fake-credential-not-for-real-use';
const todo = '9007199254740993';
const project = '9007199254740995';
const firstRequest = '6448abcb-2e35-46b2-9907-3369a0f45a07';
const secondRequest = 'e0deaa46-9cdc-4c3b-8d04-824848ff2683';
const callText = (result) => {
  assert.equal(result.content?.[0]?.type, 'text');
  return result.content[0].text;
};

async function connect(t, origin) {
  const client = new Client({ name: 'shizuki-todo-test', version: '0.1.0' });
  const transport = new StdioClientTransport({
    command: process.execPath,
    args: [script],
    env: { SHIZUKI_TODO_ORIGIN: origin, SHIZUKI_TODO_TOKEN: token },
  });
  t.after(() => client.close());
  await client.connect(transport);
  return client;
}

async function mockApi(t) {
  const requests = [];
  const context = {
    todo_id: todo,
    project_id: project,
    title: '检验跨会话续做',
    repository: 'owner/example',
    stage: 'DESIGN',
    status: 'READY',
    version: 0,
    next_step: '写初稿',
    skill_ids: ['todo-dev-design'],
    required_artifact: 'design',
    events: [],
  };
  let mode;
  const http = createServer(async (req, res) => {
    try {
      let raw = '';
      for await (const chunk of req) raw += chunk;
      const body = raw ? JSON.parse(raw) : null;
      requests.push({
        method: req.method,
        url: req.url,
        body,
        authorized: req.headers['x-todo-dev-token'] === token,
        sentAuthorization: req.headers.authorization !== undefined,
      });
      const pathname = new URL(req.url, 'http://127.0.0.1').pathname;
      const send = (data, status = 200) => {
        res.writeHead(status, { 'Content-Type': 'application/json; charset=utf-8' });
        res.end(JSON.stringify(data));
      };
      if (mode === 'redirect') {
        res.writeHead(307, { Location: '/must-not-be-called' }).end();
        return;
      }
      if (mode === 'forbidden') {
        send({ message: token }, 403);
        return;
      }
      if (mode === 'invalid') {
        res.writeHead(200, { 'Content-Type': 'application/json' }).end('{ corrupted');
        return;
      }
      if (mode === 'large') {
        send({ code: 'OK', data: { title: 'a'.repeat(2_100_000) } });
        return;
      }
      if (mode === 'long-history') {
        const events = Array.from({ length: 30 }, (_, i) => ({ summary: String(i) + '测'.repeat(1000) }));
        send({ code: 'OK', data: { ...context, events } });
        return;
      }
      if (mode === 'echo') {
        send({ code: 'OK', data: { title: token } });
        return;
      }
      if (mode === 'fault') {
        send({ code: 'ERROR', message: token, data: null });
        return;
      }
      if (req.method === 'GET' && pathname === base) {
        send({ code: 'OK', data: [context] });
        return;
      }
      if (req.method === 'GET' && pathname === base + '/' + todo) {
        send({ code: 'OK', data: context });
        return;
      }
      if (req.method === 'POST' && pathname.startsWith(base + '/' + todo + '/')) {
        if (body.expected_version !== context.version) {
          send({ code: 'CONFLICT', message: 'stale' }, 409);
          return;
        }
        context.version += 1;
        context.next_step = body.next_step ?? context.next_step;
        context.status = pathname.endsWith('/submit') ? 'AWAITING_APPROVAL' : body.status ?? 'IN_PROGRESS';
        context.events.push({ summary: body.summary });
        send({ code: 'OK', data: context });
        return;
      }
      send({}, 404);
    } catch {
      res.writeHead(500).end();
    }
  });
  http.listen(0, '127.0.0.1');
  await once(http, 'listening');
  t.after(() => new Promise((resolve) => http.close(resolve)));
  return { origin: 'http://127.0.0.1:' + http.address().port, requests, setMode: (value) => { mode = value; } };
}

test('requires HTTPS except for explicit loopback test origins', () => {
  for (const invalid of [
    'http://todo.example.com', 'https://user@todo.example.com', 'https://todo.example.com/path',
    'https://todo.example.com?q=x', 'https://todo.example.com/#a', 'file:///tmp/a',
  ]) {
    assert.throws(() => makeTodoApi({ origin: invalid, token }), /HTTPS origin/);
  }
  assert.doesNotThrow(() => makeTodoApi({ origin: 'https://todo.example.com', token }));
  assert.doesNotThrow(() => makeTodoApi({ origin: 'http://[::1]:18080', token }));
  assert.throws(() => makeTodoApi({ origin: 'https://todo.example.com', token: 'invalid\r\nvalue' }), /SHIZUKI_TODO_TOKEN/);
});

test('stdio handshake, four scoped tools and a second client resumes from server state', async (t) => {
  const api = await mockApi(t);
  const a = await connect(t, api.origin);
  const { tools } = await a.listTools();
  assert.deepEqual(tools.map((item) => item.name),
    ['todo_search', 'todo_get_context', 'todo_report_progress', 'todo_submit_stage']);
  assert.equal(tools[0].annotations.readOnlyHint, true);
  assert.equal(tools[2].annotations.idempotentHint, true);

  const q = '验收 & /x?';
  const result = await a.callTool({ name: 'todo_search', arguments: { q, project_id: project } });
  assert.equal(JSON.parse(callText(result))[0].todo_id, todo);
  const search = new URL(api.requests[0].url, api.origin);
  assert.equal(search.pathname, base);
  assert.equal(search.searchParams.get('q'), q);
  assert.equal(search.searchParams.get('project_id'), project);

  const before = await a.callTool({ name: 'todo_get_context', arguments: { todo_id: todo } });
  assert.equal(JSON.parse(callText(before)).version, 0);
  const progress = { expected_version: 0, request_id: firstRequest, summary: '已写方案初稿', next_step: '补回滚步骤', status: 'IN_PROGRESS' };
  const updated = await a.callTool({ name: 'todo_report_progress', arguments: { todo_id: todo, ...progress } });
  assert.equal(JSON.parse(callText(updated)).version, 1);
  assert.equal(api.requests.at(-1).url, base + '/' + todo + '/progress');
  assert.deepEqual(api.requests.at(-1).body, progress);
  await a.close();

  const b = await connect(t, api.origin);
  const resumed = JSON.parse(callText(await b.callTool({ name: 'todo_get_context', arguments: { todo_id: todo } })));
  assert.equal(resumed.next_step, '补回滚步骤');
  assert.deepEqual(resumed.skill_ids, ['todo-dev-design']);
  assert.equal(resumed.events[0].summary, '已写方案初稿');

  const submission = { expected_version: 1, request_id: secondRequest, summary: '补完回滚步骤',
    artifacts: [{ kind: 'design', url: 'https://github.com/owner/example/pull/1' }] };
  const submitted = JSON.parse(callText(await b.callTool({ name: 'todo_submit_stage', arguments: { todo_id: todo, ...submission } })));
  assert.equal(api.requests.at(-1).url, base + '/' + todo + '/submit');
  assert.deepEqual(api.requests.at(-1).body, submission);
  assert.equal(submitted.status, 'AWAITING_APPROVAL');
  assert.equal(submitted.stage, 'DESIGN');
  assert.ok(api.requests.every((request) => request.authorized && !request.sentAuthorization));
});

test('rejects unsafe or invalid tool inputs before sending an HTTP request', async (t) => {
  const api = await mockApi(t);
  const client = await connect(t, api.origin);
  const write = { todo_id: todo, expected_version: 0, request_id: firstRequest, summary: '完成方案' };
  for (const [name, args] of [
    ['todo_get_context', { todo_id: 1 }],
    ['todo_get_context', { todo_id: '../other-project' }],
    ['todo_get_context', { todo_id: '9999999999999999999' }],
    ['todo_search', { q: 'x'.repeat(121) }],
    ['todo_report_progress', { ...write, status: 'COMPLETE' }],
    ['todo_report_progress', { ...write, expected_version: -1 }],
    ['todo_report_progress', { ...write, next_step: '   ' }],
    ['todo_report_progress', { ...write, request_id: 'abc' }],
    ['todo_report_progress', { ...write, done: true }],
    ['todo_submit_stage', { ...write }],
    ['todo_submit_stage', { ...write, artifacts: [{ kind: 'design', url: 'file:///etc/passwd' }] }],
    ['todo_submit_stage', { ...write, artifacts: [{ kind: 'design', url: 'https://test:pw@example.com' }] }],
  ]) {
    assert.equal((await client.callTool({ name, arguments: args })).isError, true, name + ' should reject input');
  }
  assert.equal(api.requests.length, 0);
});

test('reports conflicts and rejected credentials without leaking secrets or following redirects', async (t) => {
  const api = await mockApi(t);
  const client = await connect(t, api.origin);
  const readContext = () => client.callTool({ name: 'todo_get_context', arguments: { todo_id: todo } });
  const progress = { todo_id: todo, expected_version: 99, request_id: firstRequest, summary: '过期的进展' };

  let failure = await client.callTool({ name: 'todo_report_progress', arguments: progress });
  assert.equal(failure.isError, true);
  assert.match(callText(failure), /fresh context/);

  api.setMode('forbidden');
  failure = await readContext();
  assert.equal(failure.isError, true);
  assert.match(callText(failure), /does not permit/);
  assert.ok(!callText(failure).includes(token));

  api.setMode('redirect');
  const count = api.requests.length;
  failure = await readContext();
  assert.equal(failure.isError, true);
  assert.match(callText(failure), /redirects are disabled/);
  assert.equal(api.requests.length, count + 1);

  api.setMode('invalid');
  failure = await client.callTool({ name: 'todo_report_progress', arguments: progress });
  assert.equal(failure.isError, true);
  assert.match(callText(failure), /write outcome unknown/);

  api.setMode('large');
  failure = await readContext();
  assert.equal(failure.isError, true);
  assert.match(callText(failure), /size limit/);

  api.setMode('long-history');
  const bounded = JSON.parse(callText(await readContext()));
  assert.equal(bounded.todo_id, todo);
  assert.equal(bounded.version, 0);
  assert.equal(bounded.events[0].summary[0], '0');
  assert.ok(bounded.events_omitted > 0);
  assert.equal(bounded.events.length + bounded.events_omitted, 30);

  api.setMode('fault');
  failure = await readContext();
  assert.equal(failure.isError, true);
  assert.ok(!callText(failure).includes(token));

  api.setMode('echo');
  assert.deepEqual(JSON.parse(callText(await readContext())), { title: '[redacted]' });
});
