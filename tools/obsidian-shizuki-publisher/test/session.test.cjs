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
    settings: { siteUrl: 'https://shizuki.site' },
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
  assert.match(calls[0].body, /request-only-password/);
  assert.doesNotMatch(JSON.stringify(plugin), /request-only-password|access-token/);
});

test('an unauthorized request refreshes once and retries once', async () => {
  const plugin = createPlugin();
  const client = new MainPlugin._test.ShizukiApiClient(plugin);
  client.accessToken = 'expired';
  client.refreshToken = 'refresh-token';
  let protectedCalls = 0;
  let refreshCalls = 0;
  requestHandler = async (options) => {
    if (options.url.endsWith('/api/v1/auth/tokens')) {
      refreshCalls += 1;
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
});
