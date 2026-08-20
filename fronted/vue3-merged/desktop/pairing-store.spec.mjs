import { mkdtemp, readFile, rm } from 'node:fs/promises';
import os from 'node:os';
import path from 'node:path';
import { afterEach, describe, expect, it } from 'vitest';
import { PairedClientStore } from './pairing-store.mjs';

const roots = [];

async function createStore(options) {
  const root = await mkdtemp(path.join(os.tmpdir(), 'shizuki-pairing-'));
  roots.push(root);
  const filePath = path.join(root, 'paired-clients.json');
  const store = new PairedClientStore(filePath, options);
  await store.load();
  return { store, filePath };
}

afterEach(async () => {
  await Promise.all(roots.splice(0).map(root => rm(root, { recursive: true, force: true })));
});

describe('PairedClientStore', () => {
  it('requires approval and delivers the credential exactly once', async () => {
    const { store } = await createStore();
    const request = await store.createRequest({
      clientName: 'Meguri Pet',
      instanceId: 'meguri.local',
      requestedCapabilities: ['music.control', 'app.navigation']
    });
    expect(store.listPending()).toHaveLength(1);
    const client = await store.approve(request.requestId, ['music.control']);
    expect(client.capabilities).toEqual(['music.control']);
    const delivery = await store.consumeCredential(request.requestId);
    expect(delivery.credential.authorization).toMatch(/^ShizukiClient /);
    expect(await store.consumeCredential(request.requestId)).toMatchObject({ status: 'approved' });
    await expect(store.verify(delivery.credential.clientId, delivery.credential.secret)).resolves.toMatchObject({
      clientName: 'Meguri Pet',
      capabilities: ['music.control']
    });
  });

  it('stores only a verifier and rejects revoked credentials', async () => {
    const { store, filePath } = await createStore();
    const request = await store.createRequest({
      clientName: 'Meguri Pet',
      instanceId: 'meguri.local',
      requestedCapabilities: ['desktop.read']
    });
    const client = await store.approve(request.requestId, ['desktop.read']);
    const delivery = await store.consumeCredential(request.requestId);
    const persisted = await readFile(filePath, 'utf8');
    expect(persisted).not.toContain(delivery.credential.secret);
    expect(persisted).toContain('verifier');
    await store.revoke(client.clientId);
    await expect(store.verify(client.clientId, delivery.credential.secret)).resolves.toBeNull();
  });

  it('expires unanswered requests and records bounded audit metadata', async () => {
    let time = Date.now();
    const { store } = await createStore({ now: () => time, auditLimit: 20 });
    await store.createRequest({
      clientName: 'Client',
      instanceId: 'client.one',
      requestedCapabilities: ['app.navigation']
    });
    time += 11 * 60 * 1000;
    await store.expireRequests();
    expect(store.listPending()).toEqual([]);
    expect(store.listAudit().map(item => item.type)).toContain('pairing.expired');
  });

  it('rejects a pending request without creating a durable client', async () => {
    const { store } = await createStore();
    const request = await store.createRequest({
      clientName: 'Rejected Client',
      instanceId: 'client.rejected',
      requestedCapabilities: ['window.control']
    });
    await store.reject(request.requestId);
    expect(await store.consumeCredential(request.requestId)).toMatchObject({ status: 'rejected' });
    expect(store.listClients()).toEqual([]);
    expect(store.listAudit()[0]).toMatchObject({ type: 'pairing.rejected' });
  });
});
