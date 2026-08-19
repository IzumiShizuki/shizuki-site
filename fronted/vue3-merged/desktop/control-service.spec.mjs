import { mkdtempSync, readFileSync, rmSync } from 'node:fs';
import { tmpdir } from 'node:os';
import path from 'node:path';
import { afterEach, describe, expect, it } from 'vitest';
import { ControlEventHub, startControlService } from './control-service.mjs';

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
});
