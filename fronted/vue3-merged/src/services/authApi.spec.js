import { afterEach, describe, expect, it, vi } from 'vitest';
import { issueToken } from './authApi';

function jsonResponse(status, payload) {
  return new Response(JSON.stringify(payload), {
    status,
    headers: { 'Content-Type': 'application/json' }
  });
}

function abortableResponse(options, delayMs, response, onAbort = () => {}) {
  return new Promise((resolve, reject) => {
    const signal = options?.signal;
    const timer = globalThis.setTimeout(() => {
      signal?.removeEventListener('abort', abort);
      resolve(response);
    }, delayMs);
    function abort() {
      globalThis.clearTimeout(timer);
      onAbort();
      reject(new DOMException('The operation was aborted', 'AbortError'));
    }
    signal?.addEventListener('abort', abort, { once: true });
  });
}

describe('authApi timeout policy', () => {
  afterEach(() => {
    vi.useRealTimers();
    vi.unstubAllGlobals();
  });

  it('accepts a valid token response after the former five-second deadline', async () => {
    vi.useFakeTimers();
    const payload = {
      code: 'OK',
      data: {
        result_type: 'TOKEN_ISSUED',
        access_token: 'access-token',
        refresh_token: 'refresh-token'
      }
    };
    vi.stubGlobal('fetch', vi.fn((_, options) => (
      abortableResponse(options, 6_000, jsonResponse(200, payload))
    )));

    const request = issueToken({
      grantType: 'EMAIL_PASSWORD',
      email: 'owner@example.com',
      password: 'not-a-real-password'
    });
    const outcome = request.then((value) => value, (error) => error);

    await vi.advanceTimersByTimeAsync(6_000);
    await expect(outcome).resolves.toEqual(payload.data);
  });

  it('still aborts an authentication request at the fifteen-second deadline', async () => {
    vi.useFakeTimers();
    let aborted = false;
    vi.stubGlobal('fetch', vi.fn((_, options) => (
      abortableResponse(options, 60_000, jsonResponse(200, {}), () => {
        aborted = true;
      })
    )));

    const request = issueToken({
      grantType: 'EMAIL_PASSWORD',
      email: 'owner@example.com',
      password: 'not-a-real-password'
    });
    const outcome = request.then(() => null, (error) => error);

    await vi.advanceTimersByTimeAsync(14_999);
    expect(aborted).toBe(false);
    await vi.advanceTimersByTimeAsync(1);
    expect(aborted).toBe(true);
    await expect(outcome).resolves.toMatchObject({
      name: 'HttpError',
      problemCode: 'TIMEOUT',
      detail: 'Request timeout after 15000ms'
    });
  });
});
