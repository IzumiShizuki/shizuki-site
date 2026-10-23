import { describe, expect, it } from 'vitest';
import { TOWN_SAVE_KEY, cloneMap, createStarterMap, findPath, isWalkable, parseMapJson, tileIndex, townTileset, validateMap } from './townMap';
import { TOWN_SCENE_KEY, createSceneMap, preferredScene, sceneSaveKey } from './townScenes';

describe('downloaded authored town scene', () => {
  it('preserves the complete source dimensions and every gameplay landmark is reachable', () => {
    const map = createSceneMap('victorian');
    expect([map.width, map.height]).toEqual([128, 128]);
    expect(map.tileset).toBe('lpc-victorian');
    expect(map.events.filter(e => e.quest)).toHaveLength(4);
    expect(isWalkable(map, map.spawn.x, map.spawn.y)).toBe(true);
    for (const event of map.events) {
      expect([[0, 1], [1, 0], [0, -1], [-1, 0]].some(([dx, dy]) => findPath(map, map.spawn, { x: event.x + dx, y: event.y + dy }).length > 0), event.id).toBe(true);
    }
    expect(parseMapJson(JSON.stringify(map))).toEqual(map);
  });

  it('validates registered cell ranges and never accepts an external atlas URL as a tileset', () => {
    const map = createSceneMap('victorian'), ts = townTileset(map);
    const invalid = cloneMap(map); invalid.tileset = 'https://example.com/tile.png';
    expect(() => validateMap(invalid)).toThrow('图集');
    invalid.tileset = map.tileset; invalid.ground[0] = ts.groundCount;
    expect(() => validateMap(invalid)).toThrow('ground');
    invalid.ground[0] = map.ground[0]; invalid.objects[0] = ts.tileCount;
    expect(() => validateMap(invalid)).toThrow('objects');
    expect(townTileset(createStarterMap()).id).toBe('kenney');
  });

  it('keeps source collision semantics after sampling and repainting imported cells', () => {
    const map = createSceneMap('victorian'), ts = townTileset(map);
    const blockedGround = ts.blocked.find(id => id < ts.groundCount);
    const blockedObject = ts.blocked.find(id => id >= ts.groundCount);
    const index = tileIndex(map, map.spawn.x, map.spawn.y);
    map.ground[index] = blockedGround; expect(isWalkable(map, map.spawn.x, map.spawn.y)).toBe(false);
    map.collision[index] = 0; expect(isWalkable(map, map.spawn.x, map.spawn.y)).toBe(true);
    map.collision[index] = -1; map.ground[index] = ts.groundIds[0]; map.objects[index] = blockedObject;
    expect(isWalkable(map, map.spawn.x, map.spawn.y)).toBe(false);
  });

  it('defaults to the downloaded town, preserves customized legacy saves and isolates slots', () => {
    const data = new Map(), storage = { getItem: key => data.get(key) || null };
    expect(preferredScene(storage)).toBe('victorian');
    data.set(TOWN_SAVE_KEY, JSON.stringify(createStarterMap())); expect(preferredScene(storage)).toBe('victorian');
    const custom = createStarterMap(); custom.name = '我的旧村庄'; data.set(TOWN_SAVE_KEY, JSON.stringify(custom));
    expect(preferredScene(storage)).toBe('kenney');
    data.set(TOWN_SCENE_KEY, 'victorian'); expect(preferredScene(storage)).toBe('victorian');
    expect(sceneSaveKey('kenney')).toBe(TOWN_SAVE_KEY); expect(sceneSaveKey('victorian')).not.toBe(TOWN_SAVE_KEY);
    expect(JSON.parse(data.get(TOWN_SAVE_KEY)).name).toBe('我的旧村庄');
  });
});
