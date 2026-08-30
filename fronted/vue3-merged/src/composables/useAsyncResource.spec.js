import { effectScope } from 'vue';
import { describe, expect, it, vi } from 'vitest';
import { useAsyncResource } from './useAsyncResource';

function deferred() {
  let resolve;
  let reject;
  const promise = new Promise((resolvePromise, rejectPromise) => {
    resolve = resolvePromise;
    reject = rejectPromise;
  });
  return { promise, resolve, reject };
}

describe('useAsyncResource', () => {
  it('aborts a superseded request and ignores a late stale response', async () => {
    const first = deferred();
    const second = deferred();
    const signals = [];
    const loader = vi.fn(({ signal, reason }) => {
      signals.push(signal);
      return reason === 'first' ? first.promise : second.promise;
    });
    const resource = useAsyncResource(loader);

    const firstRequest = resource.refresh('first');
    const secondRequest = resource.refresh('second');
    expect(signals[0].aborted).toBe(true);
    second.resolve({ value: 'new' });
    await secondRequest;
    first.resolve({ value: 'old' });
    await firstRequest;

    expect(resource.data.value).toEqual({ value: 'new' });
    expect(resource.loading.value).toBe(false);
    expect(resource.error.value).toBeNull();
  });

  it('keeps last-good data when a refresh fails and cancels on scope disposal', async () => {
    const scope = effectScope();
    let resource;
    let activeSignal;
    const loader = vi.fn(({ signal, reason }) => {
      activeSignal = signal;
      return reason === 'ok' ? Promise.resolve(['real']) : new Promise(() => {});
    });
    scope.run(() => {
      resource = useAsyncResource(loader);
    });

    await resource.refresh('ok');
    void resource.refresh('pending');
    scope.stop();

    expect(activeSignal.aborted).toBe(true);
    expect(resource.data.value).toEqual(['real']);
    expect(resource.loading.value).toBe(false);
  });
});
