import assert from 'node:assert/strict';
import test from 'node:test';
import { createSlidesApiServer } from '../server.mjs';

async function startServer() {
  const { server, service } = await createSlidesApiServer({
    workRoot: '.tmp-test',
    storageRoot: '.storage-test',
    bearerToken: 'test-token',
    signSecret: 'test-sign-secret',
    publicBaseUrl: '',
    mockExecutor: '1'
  });

  await new Promise((resolve) => server.listen(0, resolve));
  const address = server.address();
  if (!address || typeof address === 'string') {
    throw new Error('invalid address');
  }
  const baseUrl = `http://127.0.0.1:${address.port}`;
  service.config.publicBaseUrl = baseUrl;

  return {
    server,
    baseUrl,
    async close() {
      await new Promise((resolve) => server.close(resolve));
    }
  };
}

async function requestJson(baseUrl, path, options = {}) {
  const response = await fetch(`${baseUrl}${path}`, options);
  const text = await response.text();
  let payload = null;
  if (text) {
    payload = JSON.parse(text);
  }
  return { response, payload };
}

async function waitUntilSucceeded(baseUrl, path, headers) {
  for (let index = 0; index < 80; index += 1) {
    const { payload } = await requestJson(baseUrl, path, { method: 'GET', headers });
    const status = String(payload?.status || '');
    if (status === 'succeeded' || status === 'ready') {
      return payload;
    }
    if (status === 'failed') {
      throw new Error(payload?.error?.message || 'job failed');
    }
    await new Promise((resolve) => setTimeout(resolve, 50));
  }
  throw new Error('job polling timeout');
}

test('rejects unauthorized requests', async () => {
  const app = await startServer();
  try {
    const { response } = await requestJson(app.baseUrl, '/v1/exports', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ markdown: '# deck', formats: ['pptx'] })
    });
    assert.equal(response.status, 401);
  } finally {
    await app.close();
  }
});

test('submits export job and serves artifact urls', async () => {
  const app = await startServer();
  const headers = {
    Authorization: 'Bearer test-token',
    'Content-Type': 'application/json'
  };

  try {
    const submit = await requestJson(app.baseUrl, '/v1/exports', {
      method: 'POST',
      headers,
      body: JSON.stringify({
        markdown: '# deck',
        formats: ['pptx', 'pdf'],
        fileName: 'demo'
      })
    });

    assert.equal(submit.response.status, 202);
    assert.ok(submit.payload?.jobId);

    const job = await waitUntilSucceeded(app.baseUrl, `/v1/exports/${submit.payload.jobId}`, {
      Authorization: 'Bearer test-token'
    });

    assert.equal(job.status, 'succeeded');
    assert.equal(job.artifacts.length, 2);

    const formats = job.artifacts.map((item) => item.format).sort();
    assert.deepEqual(formats, ['pdf', 'pptx']);

    const artifactResponse = await fetch(job.artifacts[0].url);
    assert.equal(artifactResponse.status, 200);
  } finally {
    await app.close();
  }
});

test('builds preview and returns cache hit for repeated markdown', async () => {
  const app = await startServer();
  const headers = {
    Authorization: 'Bearer test-token',
    'Content-Type': 'application/json'
  };

  try {
    const submit = await requestJson(app.baseUrl, '/v1/previews', {
      method: 'POST',
      headers,
      body: JSON.stringify({ markdown: '# preview' })
    });

    assert.equal(submit.response.status, 202);
    const job = await waitUntilSucceeded(app.baseUrl, `/v1/previews/${submit.payload.jobId}`, {
      Authorization: 'Bearer test-token'
    });

    assert.equal(job.status, 'ready');
    assert.ok(job.previewUrl);

    const previewResponse = await fetch(job.previewUrl);
    assert.equal(previewResponse.status, 200);

    const cacheHit = await requestJson(app.baseUrl, '/v1/previews', {
      method: 'POST',
      headers,
      body: JSON.stringify({ markdown: '# preview' })
    });

    assert.equal(cacheHit.response.status, 200);
    assert.equal(cacheHit.payload.status, 'ready');
    assert.equal(cacheHit.payload.cacheHit, true);
  } finally {
    await app.close();
  }
});
