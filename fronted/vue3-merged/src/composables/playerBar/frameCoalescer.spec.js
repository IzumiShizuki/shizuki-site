/**
 * createFrameCoalescer 核心测试。
 * Ported with Apache-2.0 attribution (Twilight_Echo, author Px-asen / Pxasen.com);
 * 上游 liquidGlassPointer.ts 无独立测试，按文档语义补写。
 */
import { afterEach, beforeEach, describe, expect, it, vi } from 'vitest';
import { createFrameCoalescer } from './frameCoalescer.js';

describe('createFrameCoalescer', () => {
  beforeEach(() => {
    vi.useFakeTimers();
  });

  afterEach(() => {
    vi.useRealTimers();
  });

  it('coalesces bursts into one callback per frame, latest payload wins', async () => {
    const flush = vi.fn();
    const coalescer = createFrameCoalescer(flush);

    coalescer.schedule(1);
    coalescer.schedule(2);
    coalescer.schedule(3);
    expect(coalescer.hasPending()).toBe(true);

    await vi.advanceTimersByTimeAsync(16);
    expect(flush).toHaveBeenCalledTimes(1);
    expect(flush).toHaveBeenCalledWith(3);
    expect(coalescer.hasPending()).toBe(false);
  });

  it('cancel drops the pending payload and the scheduled frame', async () => {
    const flush = vi.fn();
    const coalescer = createFrameCoalescer(flush);

    coalescer.schedule(1);
    coalescer.cancel();
    expect(coalescer.hasPending()).toBe(false);

    await vi.advanceTimersByTimeAsync(64);
    expect(flush).not.toHaveBeenCalled();
  });

  it('minIntervalMs defers flushes below the interval to the next frame', async () => {
    const flush = vi.fn();
    let clock = 0;
    const coalescer = createFrameCoalescer(flush, { minIntervalMs: 100, now: () => clock });

    coalescer.schedule('a');
    clock = 16;
    await vi.advanceTimersByTimeAsync(16); // first flush always passes
    expect(flush).toHaveBeenCalledWith('a');

    coalescer.schedule('b');
    clock = 32;
    await vi.advanceTimersByTimeAsync(16); // 16ms since last flush < 100ms → reschedule
    expect(flush).toHaveBeenCalledTimes(1);

    clock = 132;
    await vi.advanceTimersByTimeAsync(16); // 116ms since last flush → flush
    expect(flush).toHaveBeenCalledTimes(2);
    expect(flush).toHaveBeenLastCalledWith('b');
  });
});
