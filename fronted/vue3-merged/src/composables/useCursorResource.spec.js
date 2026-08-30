import { describe, expect, it, vi } from 'vitest';
import { useCursorResource } from './useCursorResource';

function deferred() {
  let resolve;
  const promise = new Promise((resolvePromise) => {
    resolve = resolvePromise;
  });
  return { promise, resolve };
}

describe('useCursorResource', () => {
  it('merges cursor pages without duplicates and preserves server order', async () => {
    const loader = vi.fn(({ cursor }) => Promise.resolve(cursor
      ? { items: [{ publicId: 'b' }, { publicId: 'c' }], hasMore: false, nextCursor: '' }
      : { items: [{ publicId: 'a' }, { publicId: 'b' }], hasMore: true, nextCursor: 'cursor-2' }));
    const resource = useCursorResource(loader, { keyOf: (item) => item.publicId });

    await resource.refresh();
    await resource.loadMore();

    expect(resource.items.value.map((item) => item.publicId)).toEqual(['a', 'b', 'c']);
    expect(resource.hasMore.value).toBe(false);
    expect(loader.mock.calls[1][0].cursor).toBe('cursor-2');
  });

  it('lets a refresh supersede an older page and ignores its late result', async () => {
    const oldPage = deferred();
    const freshPage = deferred();
    const signals = [];
    const loader = vi.fn(({ signal, reason }) => {
      signals.push(signal);
      return reason === 'old' ? oldPage.promise : freshPage.promise;
    });
    const resource = useCursorResource(loader, { keyOf: (item) => item.publicId });

    const oldRequest = resource.refresh('old');
    const freshRequest = resource.refresh('fresh');
    expect(signals[0].aborted).toBe(true);
    freshPage.resolve({ items: [{ publicId: 'new' }], hasMore: false });
    await freshRequest;
    oldPage.resolve({ items: [{ publicId: 'old' }], hasMore: false });
    await oldRequest;

    expect(resource.items.value.map((item) => item.publicId)).toEqual(['new']);
  });
});
