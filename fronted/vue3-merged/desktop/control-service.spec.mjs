import { mkdtempSync, readFileSync, rmSync } from 'node:fs';
import { tmpdir } from 'node:os';
import path from 'node:path';
import { afterEach, describe, expect, it } from 'vitest';
import { ControlEventHub, startControlService } from './control-service.mjs';
import { PairedClientStore } from './pairing-store.mjs';

const cleanup = [];

afterEach(async () => {
  while (cleanup.length) await cleanup.pop()();
});

describe('loopback control service', () => {
  it('publishes discovery, authenticates protected routes, and dispatches commands', async () => {
    const root = mkdtempSync(path.join(tmpdir(), 'shizuki-control-'));
    const manifestPath = path.join(root, 'control-api.json');
    const eventHub = new ControlEventHub();
    const service = await startControlService({
      manifestPath,
      getState: () => ({ renderer: { ready: false } }),
      dispatchCommand: async command => ({ command: command.command }),
      eventHub
    });
    cleanup.push(async () => {
      await service.close();
      rmSync(root, { recursive: true, force: true });
    });

    const manifest = JSON.parse(readFileSync(manifestPath, 'utf8'));
    expect(manifest.endpoint).toBe(service.endpoint);
    expect(manifest.pid).toBe(process.pid);
    expect(manifest.token).toHaveLength(43);

    const unauthorized = await fetch(`${service.endpoint}/v1/state`);
    expect(unauthorized.status).toBe(401);

    const headers = { authorization: `Bearer ${manifest.token}` };
    const capabilities = await fetch(`${service.endpoint}/v1/capabilities`, { headers });
    expect((await capabilities.json()).commands).toEqual(expect.arrayContaining([
      expect.objectContaining({ name: 'app.navigate' })
    ]));

    const command = await fetch(`${service.endpoint}/v1/commands`, {
      method: 'POST',
      headers: { ...headers, 'content-type': 'application/json' },
      body: JSON.stringify({ id: 'test-1', command: 'window.show', payload: {} })
    });
    expect(await command.json()).toEqual({
      id: 'test-1',
      ok: true,
      result: { command: 'window.show' }
    });
  });

  it('replays buffered events after the requested event id', async () => {
    const root = mkdtempSync(path.join(tmpdir(), 'shizuki-events-'));
    const eventHub = new ControlEventHub();
    const service = await startControlService({
      manifestPath: path.join(root, 'control-api.json'),
      getState: () => ({}),
      dispatchCommand: async () => ({}),
      eventHub
    });
    cleanup.push(async () => {
      await service.close();
      rmSync(root, { recursive: true, force: true });
    });
    eventHub.publish('state.changed', { route: '/' });
    eventHub.publish('state.changed', { route: '/music' });

    const response = await fetch(`${service.endpoint}/v1/events?after=1`, {
      headers: { authorization: `Bearer ${service.token}` }
    });
    const reader = response.body.getReader();
    const { value } = await reader.read();
    await reader.cancel();
    const text = new TextDecoder().decode(value);
    expect(text).toContain('id: 2');
    expect(text).toContain('/music');
    expect(text).not.toContain('route":"/"}');
  });

  it('pairs a client and rejects commands outside its grants before dispatch', async () => {
    const root = mkdtempSync(path.join(tmpdir(), 'shizuki-pairing-api-'));
    const pairingStore = new PairedClientStore(path.join(root, 'paired-clients.json'));
    await pairingStore.load();
    const dispatched = [];
    const service = await startControlService({
      manifestPath: path.join(root, 'control-api.json'),
      getState: () => ({ desktop: true }),
      dispatchCommand: async command => {
        dispatched.push(command.command);
        return { command: command.command };
      },
      pairingStore
    });
    cleanup.push(async () => {
      await service.close();
      rmSync(root, { recursive: true, force: true });
    });

    const bootstrapHeaders = { authorization: `Bearer ${service.token}` };
    const pairingResponse = await fetch(`${service.endpoint}/v1/pairing-requests`, {
      method: 'POST',
      headers: { ...bootstrapHeaders, 'content-type': 'application/json' },
      body: JSON.stringify({
        clientName: 'Meguri Pet',
        instanceId: 'meguri:test',
        requestedCapabilities: ['app.navigation', 'music.control']
      })
    });
    expect(pairingResponse.status).toBe(202);
    const pairing = await pairingResponse.json();
    await pairingStore.approve(pairing.request.requestId, ['app.navigation', 'music.control']);

    const statusResponse = await fetch(`${service.endpoint}/v1/pairing-requests/${pairing.request.requestId}`, {
      headers: bootstrapHeaders
    });
    const status = await statusResponse.json();
    const pairedHeaders = { authorization: status.credential.authorization };

    const capabilities = await fetch(`${service.endpoint}/v1/capabilities`, { headers: pairedHeaders });
    expect((await capabilities.json()).commands.map(item => item.name)).toEqual(expect.arrayContaining([
      'app.navigate',
      'music.toggle'
    ]));

    const denied = await fetch(`${service.endpoint}/v1/commands`, {
      method: 'POST',
      headers: { ...pairedHeaders, 'content-type': 'application/json' },
      body: JSON.stringify({ id: 'denied-1', command: 'window.show', payload: {} })
    });
    expect(denied.status).toBe(403);
    expect((await denied.json()).error.code).toBe('INSUFFICIENT_CAPABILITY');
    expect(dispatched).toEqual([]);

    const allowed = await fetch(`${service.endpoint}/v1/commands`, {
      method: 'POST',
      headers: { ...pairedHeaders, 'content-type': 'application/json' },
      body: JSON.stringify({ id: 'allowed-1', command: 'app.navigate', payload: { destination: 'apps' } })
    });
    expect(allowed.status).toBe(200);
    expect(dispatched).toEqual(['app.navigate']);

    const music = await fetch(`${service.endpoint}/v1/commands`, {
      method: 'POST',
      headers: { ...pairedHeaders, 'content-type': 'application/json' },
      body: JSON.stringify({ id: 'music-1', command: 'music.toggle', payload: {} })
    });
    expect(music.status).toBe(200);
    expect(dispatched).toEqual(['app.navigate', 'music.toggle']);

    const state = await fetch(`${service.endpoint}/v1/state`, { headers: pairedHeaders });
    expect(state.status).toBe(403);
    expect(pairingStore.listAudit()).toEqual(expect.arrayContaining([
      expect.objectContaining({ type: 'capability.denied', capability: 'window.control' }),
      expect.objectContaining({ type: 'capability.denied', capability: 'desktop.read' })
    ]));
  });
});
