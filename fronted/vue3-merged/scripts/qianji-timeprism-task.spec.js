import { describe, expect, it } from 'vitest';
import {
  buildTimePrismTaskRecurringPayload,
  DEFAULT_TIMEPRISM_TASK_MARKER,
  findExistingQianjiTimePrismRule,
  resolveTaskColumnCode
} from '../../../tools/qianji-sync/qianji-timeprism-task.mjs';

describe('qianji-timeprism-task', () => {
  it('prefers the requested enabled task column', () => {
    const columnCode = resolveTaskColumnCode(
      [
        { columnCode: 'todo', enabled: true },
        { columnCode: 'doing', enabled: true }
      ],
      'doing'
    );

    expect(columnCode).toBe('doing');
  });

  it('falls back to the first enabled task column', () => {
    const columnCode = resolveTaskColumnCode(
      [
        { columnCode: 'todo', enabled: false },
        { columnCode: 'review', enabled: true }
      ],
      'todo'
    );

    expect(columnCode).toBe('review');
  });

  it('builds a recurring payload with the marker in detail', () => {
    const payload = buildTimePrismTaskRecurringPayload({
      title: '钱迹同步',
      columnCode: 'todo'
    });

    expect(payload.title).toBe('钱迹同步');
    expect(payload.detail).toContain(DEFAULT_TIMEPRISM_TASK_MARKER);
    expect(payload.columnCode).toBe('todo');
  });

  it('finds an existing qianji recurring rule by marker first', () => {
    const matched = findExistingQianjiTimePrismRule([
      {
        ruleId: 1,
        title: '别的任务',
        detail: `${DEFAULT_TIMEPRISM_TASK_MARKER}\n每天 02:00`
      },
      {
        ruleId: 2,
        title: '钱迹凌晨同步检查',
        detail: 'plain detail'
      }
    ]);

    expect(matched?.ruleId).toBe(1);
  });
});
