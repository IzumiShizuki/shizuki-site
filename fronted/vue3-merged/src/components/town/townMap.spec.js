import { describe, expect, it } from 'vitest';
import { TILE, cloneMap, createStarterMap, findPath, isWalkable, nearbyEvent, parseMapJson, tileIndex, validateMap } from './townMap';

describe('playable town map', () => {
  it('ships a valid independent map whose landmarks are all reachable', () => {
    const map = createStarterMap();
    expect(isWalkable(map, map.spawn.x, map.spawn.y)).toBe(true);
    expect(map.events.filter(e => e.quest)).toHaveLength(4);
    expect(map.events.some(e => e.id === 'church')).toBe(true);
    for (const event of map.events) {
      const reachable = [[0, 1], [1, 0], [0, -1], [-1, 0]].some(([dx, dy]) => findPath(map, map.spawn, { x: event.x + dx, y: event.y + dy }).length > 0);
      expect(reachable, event.title).toBe(true);
    }
    expect(parseMapJson(JSON.stringify(map))).toEqual(map);
  });

  it('avoids water, buildings, residents and edges while respecting overrides', () => {
    const map = createStarterMap();
    expect(isWalkable(map, -1, 0)).toBe(false);
    expect(isWalkable(map, map.width, 0)).toBe(false);
    expect(isWalkable(map, 18, 5)).toBe(false);
    expect(isWalkable(map, 23, 21)).toBe(false);
    expect(isWalkable(map, 24, 24)).toBe(true);
    expect(isWalkable(map, 12, 15)).toBe(false);
    map.collision[tileIndex(map, 23, 21)] = 0;
    expect(isWalkable(map, 23, 21)).toBe(true);
    map.collision[tileIndex(map, 24, 24)] = 1;
    expect(isWalkable(map, 24, 24)).toBe(false);
    const path = findPath(map, map.spawn, { x: 7, y: 14 });
    expect(path.length).toBeGreaterThan(0);
    let previous = map.spawn;
    for (const tile of path) { expect(isWalkable(map, tile.x, tile.y)).toBe(true); expect(Math.abs(tile.x - previous.x) + Math.abs(tile.y - previous.y)).toBe(1); previous = tile; }
  });

  it('does not route through a sealed area and chooses only adjacent interactions', () => {
    const map = createStarterMap();
    for (const [dx, dy] of [[0, 1], [1, 0], [0, -1], [-1, 0]]) map.collision[tileIndex(map, map.spawn.x + dx, map.spawn.y + dy)] = 1;
    expect(findPath(map, map.spawn, { x: 7, y: 14 })).toEqual([]);
    expect(nearbyEvent(map, { x: 18, y: 16 })?.id).toBe('welcome');
    expect(nearbyEvent(map, { x: 2, y: 14 })).toBeNull();
  });

  it.each([
    ['wrong version', m => { m.version = 999; }],
    ['huge map', m => { m.width = 1000000; }],
    ['fractional size', m => { m.width = 12.5; }],
    ['bad layer length', m => { m.ground.pop(); }],
    ['bad terrain id', m => { m.ground[0] = 9999; }],
    ['bad object id', m => { m.objects[0] = 131; }],
    ['bad collision', m => { m.collision[0] = '1'; }],
    ['blocked spawn', m => { m.ground[tileIndex(m, m.spawn.x, m.spawn.y)] = TILE.WATER; }],
    ['resident spawn', m => { m.spawn = { x: 12, y: 15 }; }],
    ['outside event', m => { m.events[0].x = -1; }],
    ['script event', m => { m.events[0].kind = 'script'; }],
    ['unknown destination', m => { m.events[0].destination = 'javascript:alert(1)'; }],
    ['duplicate event', m => { m.events.push(cloneMap(m.events[0])); }],
    ['overlong text', m => { m.events[0].text = 'a'.repeat(1201); }]
  ])('rejects %s before it becomes the active map', (_, change) => {
    const map = createStarterMap(); change(map);
    expect(() => validateMap(map)).toThrow();
  });

  it('rejects invalid JSON and oversized input with readable errors', () => {
    expect(() => parseMapJson('{')).toThrow('不是有效的 JSON');
    expect(() => parseMapJson('x'.repeat(1_000_001))).toThrow('1 MB');
  });
});
