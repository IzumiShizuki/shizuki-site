import { describe, expect, it, vi } from 'vitest';
import { HttpError, httpRequest } from './httpClient';

function jsonResponse(status, payload, contentType = 'application/json') {
  return new Response(JSON.stringify(payload), {
    status,
    headers: {
      'Content-Type': contentType
    }
  });
}

describe('httpClient', () => {
  it('percent-encodes spaces in query parameters', async () => {
    const fetchMock = vi.fn().mockResolvedValueOnce(jsonResponse(200, { ok: true }));
    globalThis.fetch = fetchMock;

    await httpRequest('/api/v1/search', {
      query: { tag: 'snow mountain' }
    });

    expect(fetchMock).toHaveBeenCalledOnce();
    expect(fetchMock.mock.calls[0][0]).toMatch(/\/api\/v1\/search\?tag=snow%20mountain$/);
  });

  it('parses application/problem+json into HttpError.body', async () => {
    const fetchMock = vi.fn().mockResolvedValueOnce(
      jsonResponse(
        403,
        {
          type: 'https://shizuki.dev/problems/forbidden',
          title: 'FORBIDDEN',
          status: 403,
          detail: 'Admin privilege verification required',
          code: 'FORBIDDEN',
          reason: 'ADMIN_PRIVILEGE_REQUIRED'
        },
        'application/problem+json'
      )
    );
    globalThis.fetch = fetchMock;

    await expect(
      httpRequest('/api/v1/admin/groups/ADMIN/permissions', {
        method: 'PUT'
      })
    ).rejects.toMatchObject({
      name: 'HttpError',
      status: 403,
      problemCode: 'FORBIDDEN',
      detail: 'Admin privilege verification required',
      body: expect.objectContaining({
        reason: 'ADMIN_PRIVILEGE_REQUIRED'
      })
    });
  });

  it('parses custom +json media type as json', async () => {
    const fetchMock = vi.fn().mockResolvedValueOnce(
      jsonResponse(
        400,
        {
          detail: 'Bad Request',
          code: 'BAD_REQUEST'
        },
        'application/vnd.api+json'
      )
    );
    globalThis.fetch = fetchMock;

    try {
      await httpRequest('/api/v1/demo', {
        method: 'POST'
      });
    } catch (error) {
      expect(error).toBeInstanceOf(HttpError);
      expect(error.problemCode).toBe('BAD_REQUEST');
      expect(error.body).toEqual(
        expect.objectContaining({
          code: 'BAD_REQUEST'
        })
      );
    }
  });

  it('dispatches SSE data events to the stream handler', async () => {
    const encoder = new TextEncoder();
    const chunks = [
      'data: {"type":"delta","content":"你好"}\n\n',
      'data: {"type":"delta","content":"，世界"}\n\ndata: {"type":"done","payload":{"assistantMessage":"你好，世界"}}\n\n',
      'data: [DONE]\n\n'
    ];
    let index = 0;
    const stream = new ReadableStream({
      pull(controller) {
        if (index < chunks.length) {
          controller.enqueue(encoder.encode(chunks[index]));
          index += 1;
        } else {
          controller.close();
        }
      }
    });
    const response = new Response(stream, {
      status: 200,
      headers: { 'Content-Type': 'text/event-stream' }
    });
    globalThis.fetch = vi.fn().mockResolvedValueOnce(response);

    const events = [];
    const result = await httpRequest('/api/v1/ai-sessions/s1/messages/stream', {
      method: 'POST',
      body: { message: 'hi' },
      stream: {
        onEvent(event) {
          events.push(event);
        }
      }
    });

    expect(events).toHaveLength(3);
    expect(events[0]).toEqual({ type: 'delta', content: '你好' });
    expect(events[1]).toEqual({ type: 'delta', content: '，世界' });
    expect(events[2]).toEqual({ type: 'done', payload: { assistantMessage: '你好，世界' } });
    expect(result).toEqual({ streamed: true, eventCount: 3 });
  });

  it('ignores non-data SSE lines and the [DONE] sentinel', async () => {
    const encoder = new TextEncoder();
    const stream = new ReadableStream({
      start(controller) {
        controller.enqueue(encoder.encode(': keep-alive comment\n\n'));
        controller.enqueue(encoder.encode('event: message\n'));
        controller.enqueue(encoder.encode('data: {"type":"delta","content":"x"}\n\n'));
        controller.enqueue(encoder.encode('data: [DONE]\n\n'));
        controller.close();
      }
    });
    const response = new Response(stream, {
      status: 200,
      headers: { 'Content-Type': 'text/event-stream' }
    });
    globalThis.fetch = vi.fn().mockResolvedValueOnce(response);

    const events = [];
    const result = await httpRequest('/api/v1/ai-sessions/s2/messages/stream', {
      method: 'POST',
      body: {},
      stream: { onEvent: (event) => events.push(event) }
    });

    expect(events).toEqual([{ type: 'delta', content: 'x' }]);
    expect(result.eventCount).toBe(1);
  });
});
