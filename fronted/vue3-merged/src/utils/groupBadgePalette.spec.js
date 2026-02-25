import { describe, expect, it } from 'vitest';
import { getBuiltinGroupColorMap, getGroupBadgePalette, getGroupBadgeStyle } from './groupBadgePalette';

describe('groupBadgePalette', () => {
  it('returns fixed colors for built-in groups', () => {
    const builtin = getBuiltinGroupColorMap();
    expect(builtin.ADMIN).toBe('#EF476F');
    expect(builtin.USER).toBe('#06D6A0');
    expect(builtin.GUEST).toBe('#8D99AE');
    expect(builtin.FRIEND).toBe('#118AB2');
    expect(builtin.INTERVIEWER).toBe('#FFD166');

    expect(getGroupBadgePalette('admin').base).toBe('#EF476F');
    expect(getGroupBadgePalette('USER').base).toBe('#06D6A0');
  });

  it('returns stable hash color for custom groups', () => {
    const first = getGroupBadgePalette('reviewer').base;
    const second = getGroupBadgePalette('reviewer').base;
    const other = getGroupBadgePalette('auditor').base;

    expect(first).toBe(second);
    expect(first).not.toBe(other);
  });

  it('builds css variables for component style', () => {
    const style = getGroupBadgeStyle('FRIEND');
    expect(style).toMatchObject({
      '--group-badge-bg': expect.any(String),
      '--group-badge-border': expect.any(String),
      '--group-badge-text': expect.any(String)
    });
  });
});
