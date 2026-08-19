import { describe, expect, it } from 'vitest';
import {
  createMeguriSseParser,
  createMeguriTurnTracker,
  followMeguriTurn,
  isExpressionMeguriEventType,
  isTerminalMeguriEventType,
  normalizeMeguriEnvelope
} from './meguriTurnStream';

function envelope(overrides = {}) {
  return {
    protocol_version: '1.0',
    event_id: 'evt-1',
    required: true,
    type: 'text.delta',
    turn_id: 'turn-1',
    session_id: 'web_session01',
    sequence: 1,
    data: {},
    ...overrides
  };
}

function sseFrame(payload, eventName = payload.type) {
  return `event: ${eventName}\ndata: ${JSON.stringify(payload)}\n\n`;
}

function streamResponseFromChunks(chunks, { ok = true, status = 200 } = {}) {
  const encoder = new TextEncoder();
  let index = 0;
  return {
    ok,
    status,
    body: {
      getReader() {
        return {
          read() {
            if (index < chunks.length) {
              const value = encoder.encode(chunks[index]);
              index += 1;
              return Promise.resolve({ value, done: false });
            }
            return Promise.resolve({ value: undefined, done: true });
          },
          cancel() {
            return Promise.resolve();
          }
        };
      }
    }
  };
}

describe('meguriTurnStream helpers', () => {
  it('classifies terminal and expression event types', () => {
    expect(isTerminalMeguriEventType('turn.completed')).toBe(true);
    expect(isTerminalMeguriEventType('turn.failed')).toBe(true);
    expect(isTerminalMeguriEventType('text.delta')).toBe(false);
    expect(isExpressionMeguriEventType('semantic.completed')).toBe(true);
    expect(isExpressionMeguriEventType('sprite.resolved')).toBe(true);
    expect(isExpressionMeguriEventType('turn.completed')).toBe(false);
  });

  it('normalizes envelopes and rejects malformed payloads', () => {
    const normalized = normalizeMeguriEnvelope(envelope({ sequence: 7 }));
    expect(normalized).toMatchObject({
      type: 'text.delta',
      turnId: 'turn-1',
      sessionId: 'web_session01',
      sequence: 7
    });
    expect(normalizeMeguriEnvelope(null)).toBeNull();
    expect(normalizeMeguriEnvelope({ type: 'x' })).toBeNull();
    expect(normalizeMeguriEnvelope(envelope({ sequence: 0 }))).toBeNull();
  });
});

describe('createMeguriSseParser', () => {
  it('parses frames that arrive split across chunks', () => {
    const parser = createMeguriSseParser();
    const frame = sseFrame(envelope({ data: { delta: '你好' } }));
    const first = parser.push(frame.slice(0, 12));
    const second = parser.push(frame.slice(12));
    expect(first).toHaveLength(0);
    expect(second).toHaveLength(1);
    expect(second[0].data.delta).toBe('你好');
  });

  it('handles CRLF frames and ignores comments', () => {
    const parser = createMeguriSseParser();
    const events = parser.push(
      `: heartbeat\r\n\r\nevent: text.delta\r\ndata: ${JSON.stringify(envelope({ data: { delta: 'a' } }))}\r\n\r\n`
    );
    expect(events).toHaveLength(1);
    expect(events[0].type).toBe('text.delta');
  });
});

describe('createMeguriTurnTracker', () => {
  it('accumulates deltas and finishes on turn.completed', () => {
    const tracker = createMeguriTurnTracker('turn-1');
    tracker.apply(normalizeMeguriEnvelope(envelope({ type: 'turn.started', sequence: 1 })));
    tracker.apply(normalizeMeguriEnvelope(envelope({ sequence: 2, data: { delta: '今天' } })));
    tracker.apply(normalizeMeguriEnvelope(envelope({ sequence: 3, data: { delta: '也加油' } })));
    tracker.apply(
      normalizeMeguriEnvelope(
        envelope({
          type: 'semantic.completed',
          sequence: 4,
          data: {
            expression_tag: 'gentle_happy',
            expression_intensity: 'medium',
            sprite_file: 'ce03005l.png',
            motion_tag: 'soft_sway'
          }
        })
      )
    );
    tracker.apply(normalizeMeguriEnvelope(envelope({ type: 'turn.completed', sequence: 5 })));

    expect(tracker.state.text).toBe('今天也加油');
    expect(tracker.state.status).toBe('completed');
    expect(tracker.state.expression).toMatchObject({
      expressionTag: 'gentle_happy',
      spriteFile: 'ce03005l.png',
      motionTag: 'soft_sway'
    });
    expect(tracker.isTerminal()).toBe(true);
  });

  it('records failure reasons and ignores other turns', () => {
    const tracker = createMeguriTurnTracker('turn-1');
    expect(tracker.apply(normalizeMeguriEnvelope(envelope({ turn_id: 'other', sequence: 1 })))).toBe(false);
    tracker.apply(normalizeMeguriEnvelope(envelope({ type: 'turn.failed', sequence: 2, data: { error: '超时' } })));
    expect(tracker.state.status).toBe('failed');
    expect(tracker.state.error).toBe('超时');
  });
});

describe('followMeguriTurn', () => {
  it('follows a turn to completion and reports events', async () => {
    const frames =
      sseFrame(envelope({ type: 'turn.started', sequence: 1 })) +
      sseFrame(envelope({ sequence: 2, data: { delta: '爱莉在这里' } })) +
      sseFrame(envelope({ type: 'turn.completed', sequence: 3 }));
    const requests = [];
    const rawFetch = (path) => {
      requests.push(path);
      return Promise.resolve(streamResponseFromChunks([frames]));
    };

    const seen = [];
    const state = await followMeguriTurn({
      rawFetch,
      sessionId: 'web_session01',
      turnId: 'turn-1',
      onEvent: (event) => {
        seen.push(event.type);
      }
    });

    expect(state.status).toBe('completed');
    expect(state.text).toBe('爱莉在这里');
    expect(seen).toEqual(['turn.started', 'text.delta', 'turn.completed']);
    expect(requests[0]).toBe('/api/v1/meguri/sessions/web_session01/events?after_sequence=0');
  });

  it('reconnects with after_sequence when the stream drops early', async () => {
    const firstHalf = sseFrame(envelope({ sequence: 1, data: { delta: '前半' } }));
    const secondHalf =
      sseFrame(envelope({ sequence: 2, data: { delta: '后半' } })) +
      sseFrame(envelope({ type: 'turn.completed', sequence: 3 }));
    const requests = [];
    const rawFetch = (path) => {
      requests.push(path);
      return Promise.resolve(
        streamResponseFromChunks([requests.length === 1 ? firstHalf : secondHalf])
      );
    };

    const state = await followMeguriTurn({
      rawFetch,
      sessionId: 'web_session01',
      turnId: 'turn-1'
    });

    expect(state.text).toBe('前半后半');
    expect(requests).toHaveLength(2);
    expect(requests[1]).toContain('after_sequence=1');
  });

  it('fails after exhausting reconnect attempts', async () => {
    const rawFetch = () => Promise.resolve(streamResponseFromChunks([], { ok: false, status: 502 }));
    await expect(
      followMeguriTurn({
        rawFetch,
        sessionId: 'web_session01',
        turnId: 'turn-1',
        maxReconnects: 1
      })
    ).rejects.toThrow('事件流连接失败');
  });
});
