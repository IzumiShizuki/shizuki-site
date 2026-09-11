import { describe, expect, it, vi } from 'vitest';
import {
  createWallpaperImportPoller,
  isWallpaperImportTerminalStatus
} from './wallpaperImportPolling';

describe('wallpaper import polling', () => {
  it('recognizes every terminal import status', () => {
    expect(isWallpaperImportTerminalStatus('SUCCEEDED')).toBe(true);
    expect(isWallpaperImportTerminalStatus('FAILED')).toBe(true);
    expect(isWallpaperImportTerminalStatus('FALLBACK_REQUIRED')).toBe(true);
    expect(isWallpaperImportTerminalStatus('RUNNING')).toBe(false);
    expect(isWallpaperImportTerminalStatus('pending')).toBe(false);
  });

  it('polls a running job until success and then stops', async () => {
    const scheduled = [];
    const schedule = vi.fn((callback) => {
      scheduled.push(callback);
      return scheduled.length;
    });
    const cancel = vi.fn();
    const fetchJob = vi.fn()
      .mockResolvedValueOnce({ jobId: 42, status: 'RUNNING' })
      .mockResolvedValueOnce({ jobId: 42, status: 'SUCCEEDED' });
    const onJob = vi.fn();
    const poller = createWallpaperImportPoller({ fetchJob, onJob, schedule, cancel, intervalMs: 10 });

    poller.start(42);
    expect(schedule).toHaveBeenCalledTimes(1);

    await scheduled.shift()();
    expect(fetchJob).toHaveBeenCalledWith(42);
    expect(onJob).toHaveBeenLastCalledWith({ jobId: 42, status: 'RUNNING' });
    expect(schedule).toHaveBeenCalledTimes(2);

    await scheduled.shift()();
    expect(onJob).toHaveBeenLastCalledWith({ jobId: 42, status: 'SUCCEEDED' });
    expect(schedule).toHaveBeenCalledTimes(2);
    expect(poller.isActive()).toBe(false);
  });

  it('cancels an older scheduled job when a new import starts', () => {
    const schedule = vi.fn(() => 9);
    const cancel = vi.fn();
    const poller = createWallpaperImportPoller({
      fetchJob: vi.fn(),
      onJob: vi.fn(),
      schedule,
      cancel
    });

    poller.start(41);
    poller.start(42);

    expect(cancel).toHaveBeenCalledWith(9);
    expect(poller.activeJobId()).toBe(42);
  });
});
