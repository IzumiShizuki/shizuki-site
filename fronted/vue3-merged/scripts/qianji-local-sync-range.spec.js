import { describe, expect, it } from 'vitest';
import { runRangeBackfill } from './qianji-local-sync-range.mjs';
import { resolveTaskColumnCode } from './qianji-timeprism-task.mjs';

describe('qianji-local-sync-range', () => {
  it('exposes the range runner', () => {
    expect(typeof runRangeBackfill).toBe('function');
  });

  it('keeps unrelated helper imports working', () => {
    expect(resolveTaskColumnCode([{ columnCode: 'todo', enabled: true }], 'todo')).toBe('todo');
  });
});
