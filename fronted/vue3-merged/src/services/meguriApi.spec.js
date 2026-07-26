import { describe, expect, it, vi } from 'vitest';
import {
  cancelMeguriTurn,
  createMeguriSessionId,
  createMeguriTurn,
  fetchMeguriSpriteObjectUrl,
  getMeguriBootstrap,
  isValidMeguriSessionId,
  isValidMeguriSpriteFile,
  meguriSpritePath,
  normalizeMeguriBootstrap,
  normalizeMeguriTurnCreated
} from './meguriApi';

describe('meguri identifiers', () => {
  it('generates valid website session ids', () => {
    const sessionId = createMeguriSessionId();
    expect(sessionId.startsWith('web_')).toBe(true);
    expect(isValidMeguriSessionId(sessionId)).toBe(true);
  });

  it('rejects malformed session ids and sprite names', () => {
    expect(isValidMeguriSessionId('short')).toBe(false);
    expect(isValidMeguriSessionId('bad session id')).toBe(false);
    expect(isValidMeguriSpriteFile('ce04001l.png')).toBe(true);
    expect(isValidMeguriSpriteFile('../etc/passwd')).toBe(false);
    expect(isValidMeguriSpriteFile('CE04001L.PNG')).toBe(false);
    expect(meguriSpritePath('..%2fx.png')).toBe('');
    expect(meguriSpritePath('ce04001l.png')).toBe('/api/v1/meguri/assets/sprites/ce04001l.png');
  });
});

describe('normalizers', () => {
  it('normalizes bootstrap payloads from snake or camel case', () => {
    expect(
      normalizeMeguriBootstrap({ enabled: true, core_online: true, build_id: 'b1', rag_chunks: 174 })
    ).toMatchObject({ enabled: true, coreOnline: true, buildId: 'b1', ragChunks: 174 });
    expect(
      normalizeMeguriBootstrap({ enabled: true, coreOnline: false, defaultSprite: 'ce04001l.png', spriteAvailable: true })
    ).toMatchObject({ coreOnline: false, defaultSprite: 'ce04001l.png', spriteAvailable: true });
  });

  it('normalizes turn creation payloads', () => {
    expect(
      normalizeMeguriTurnCreated({ turn_id: 't1', session_id: 's1', build_id: 'b', status: 'accepted' })
    ).toEqual({ turnId: 't1', sessionId: 's1', buildId: 'b', status: 'accepted' });
  });
});

describe('createMeguriTurn', () => {
  it('posts a normalized body through authorizedFetch', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({
      data: { turn_id: 't1', session_id: 'web_session01', build_id: 'b', status: 'accepted' }
    });

    const created = await createMeguriTurn(
      { message: '  你好  ', sessionId: 'web_session01', idempotencyKey: 'k-1' },
      authorizedFetch
    );

    expect(created).toMatchObject({ turnId: 't1', sessionId: 'web_session01' });
    expect(authorizedFetch).toHaveBeenCalledWith('/api/v1/meguri/turns', {
      method: 'POST',
      body: { message: '你好', sessionId: 'web_session01', idempotencyKey: 'k-1' }
    });
  });

  it('rejects empty messages and bad session ids locally', async () => {
    const authorizedFetch = vi.fn();
    await expect(createMeguriTurn({ message: ' ', sessionId: 'web_session01' }, authorizedFetch)).rejects.toThrow(
      'message is required'
    );
    await expect(createMeguriTurn({ message: 'hi', sessionId: 'nope' }, authorizedFetch)).rejects.toThrow(
      'sessionId is invalid'
    );
    expect(authorizedFetch).not.toHaveBeenCalled();
  });

  it('requires authorizedFetch', async () => {
    await expect(createMeguriTurn({ message: 'hi', sessionId: 'web_session01' })).rejects.toThrow(
      'authorizedFetch is required'
    );
  });
});

describe('gateway calls', () => {
  it('reads bootstrap through authorizedFetch', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({ data: { enabled: true, core_online: true } });
    const bootstrap = await getMeguriBootstrap(authorizedFetch);
    expect(authorizedFetch).toHaveBeenCalledWith('/api/v1/meguri/bootstrap', { method: 'GET' });
    expect(bootstrap.enabled).toBe(true);
  });

  it('cancels one turn by id', async () => {
    const authorizedFetch = vi.fn().mockResolvedValue({ data: { status: 'cancelling' } });
    await cancelMeguriTurn('turn-9', authorizedFetch);
    expect(authorizedFetch).toHaveBeenCalledWith('/api/v1/meguri/turns/turn-9/cancel', { method: 'POST' });
  });

  it('loads sprites as object urls through rawFetch', async () => {
    const blob = new Blob([new Uint8Array([137, 80, 78, 71])], { type: 'image/png' });
    const rawFetch = vi.fn().mockResolvedValue({ ok: true, status: 200, blob: () => Promise.resolve(blob) });
    const createObjectURL = vi.fn().mockReturnValue('blob:meguri');
    const originalCreate = URL.createObjectURL;
    URL.createObjectURL = createObjectURL;
    try {
      const url = await fetchMeguriSpriteObjectUrl('ce04001l.png', rawFetch);
      expect(url).toBe('blob:meguri');
      expect(rawFetch).toHaveBeenCalledWith('/api/v1/meguri/assets/sprites/ce04001l.png', { method: 'GET' });
    } finally {
      URL.createObjectURL = originalCreate;
    }
  });

  it('rejects invalid sprite names before fetching', async () => {
    const rawFetch = vi.fn();
    await expect(fetchMeguriSpriteObjectUrl('../secret.png', rawFetch)).rejects.toThrow('sprite file name is invalid');
    expect(rawFetch).not.toHaveBeenCalled();
  });
});
