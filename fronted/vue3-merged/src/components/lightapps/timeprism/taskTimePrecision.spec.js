import { describe, expect, it } from 'vitest';
import {
  convertTaskInputValue,
  formatTaskDateLabel,
  parseTaskInputToIso,
  resolveTaskTimeInputType,
  toTaskInputValue
} from './taskTimePrecision';

describe('taskTimePrecision', () => {
  it('switches task inputs between date and datetime-local based on precision', () => {
    expect(resolveTaskTimeInputType('DAY')).toBe('date');
    expect(resolveTaskTimeInputType('MINUTE')).toBe('datetime-local');
    expect(resolveTaskTimeInputType('')).toBe('datetime-local');
  });

  it('formats existing values for day-level and minute-level inputs', () => {
    expect(toTaskInputValue('2026-04-01T09:45:00', 'DAY')).toBe('2026-04-01');
    expect(toTaskInputValue('2026-04-01T09:45:00', 'MINUTE')).toBe('2026-04-01T09:45');
  });

  it('builds local day boundaries when day-level values are submitted', () => {
    expect(parseTaskInputToIso('2026-04-01', 'DAY')).toBe(new Date(2026, 3, 1, 0, 0, 0, 0).toISOString());
    expect(parseTaskInputToIso('2026-04-01', 'DAY', { boundary: 'end' })).toBe(
      new Date(2026, 3, 1, 23, 59, 59, 999).toISOString()
    );
  });

  it('keeps range starts and deadlines stable when precision is toggled', () => {
    expect(convertTaskInputValue('2026-04-01', 'DAY', 'MINUTE')).toBe('2026-04-01T00:00');
    expect(convertTaskInputValue('2026-04-01', 'DAY', 'MINUTE', { boundary: 'end' })).toBe('2026-04-01T23:59');
    expect(convertTaskInputValue('2026-04-01T18:30', 'MINUTE', 'DAY')).toBe('2026-04-01');
  });

  it('renders compact labels without time for day-level tasks', () => {
    expect(formatTaskDateLabel('2026-04-01T09:45:00', 'DAY')).toBe('4/1');
    expect(formatTaskDateLabel('2026-04-01T09:45:00', 'MINUTE')).toBe('4/1 09:45');
  });
});
