import { describe, expect, it } from 'vitest';
import { runRangeBackfill } from '../../../tools/qianji-sync/qianji-local-sync-range.mjs';
import { resolveTaskColumnCode } from '../../../tools/qianji-sync/qianji-timeprism-task.mjs';

describe('qianji-local-sync-range', () => {
  it('exposes the range runner', () => {
    expect(typeof runRangeBackfill).toBe('function');
  });

  it('keeps unrelated helper imports working', () => {
    expect(resolveTaskColumnCode([{ columnCode: 'todo', enabled: true }], 'todo')).toBe('todo');
  });
});
