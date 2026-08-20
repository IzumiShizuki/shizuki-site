import { describe, expect, it } from 'vitest';
import { activateOrbBody, normalizeOrbLevel, ORB_CONTROL_ITEMS, ORB_ROUTE_ITEMS } from './desktopOrbState';

describe('desktopOrbState', () => {
  it('uses the confirmed two-level click sequence', () => {
    expect(activateOrbBody('collapsed')).toBe('controls');
    expect(activateOrbBody('controls')).toBe('routes');
    expect(activateOrbBody('routes')).toBe('collapsed');
  });

  it('keeps first-level controls separate from second-level routes', () => {
    expect(ORB_CONTROL_ITEMS.map(item => item.key)).toEqual(['music', 'todo', 'focus', 'edit']);
    expect(ORB_ROUTE_ITEMS.map(item => item.destination)).toContain('music');
    expect(normalizeOrbLevel('unknown')).toBe('collapsed');
  });
});
