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
});
