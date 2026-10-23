import victorianTileset from './data/victorian-tileset.json';

export const MAP_VERSION = 1;
export const TOWN_SAVE_KEY = 'shizuki.ai-town.map.v1';
export const ATLAS_URL = '/town/tiny-town.png';
export const TILE = Object.freeze({ CROSS: 132, WATER: 133, BRIDGE: 134, FOUNTAIN: 135, LAMP: 136 });
export const DESTINATIONS = Object.freeze(['', 'library', 'classroom', 'home_gate', 'finance_vault']);
export const TERRAIN_IDS = Object.freeze([0, 1, 2, 13, 37, 43, TILE.WATER, TILE.BRIDGE]);
export const OBJECT_IDS = Object.freeze([...Array.from({ length: 130 }, (_, i) => i), TILE.CROSS, TILE.FOUNTAIN, TILE.LAMP]);
export const PALETTES = Object.freeze([
  { name: '自然', tiles: [3, 4, 5, 6, 7, 8, 9, 10, 11, 15, 16, 17, 18, 19, 20, 21, 22, 23, 27, 28, 29, 30, 31, 32, 33, 34, 35] },
  { name: '建筑', tiles: Array.from({ length: 48 }, (_, i) => i + 48) },
  { name: '街道与摆设', tiles: [39, 40, 41, 42, 44, 45, 46, 47, ...Array.from({ length: 34 }, (_, i) => i + 96), TILE.CROSS, TILE.FOUNTAIN, TILE.LAMP] }
]);
export const TILE_NAMES = Object.freeze({ 0: '草地', 1: '碎草', 2: '花草', 13: '土路', 37: '路边', 43: '石板路', 132: '教堂十字', 133: '池水', 134: '木桥', 135: '喷泉', 136: '路灯' });

const VICTORIAN_BLOCKED = new Set(victorianTileset.blocked);
const KENNEY_META = Object.freeze({ id: 'kenney', atlasUrl: ATLAS_URL, sourceSize: 16, columns: 12, rows: 11, groundIds: TERRAIN_IDS, palettes: PALETTES, creditName: 'Kenney Tiny Town · CC0', creditUrl: 'https://kenney.nl/assets/tiny-town', detailsUrl: '/town/README.md' });
const VICTORIAN_META = Object.freeze({ ...victorianTileset, atlasUrl: '/town/victorian/atlas.png', rows: Math.ceil(victorianTileset.tileCount / victorianTileset.columns), groundIds: victorianTileset.groundPalette, palettes: [{ name: '原图建筑与街景', tiles: victorianTileset.objectPalette }], creditName: 'bluecarrot16 与 LPC 作者 · CC BY-SA 4.0', creditUrl: victorianTileset.sourcePage, detailsUrl: '/town/victorian/CREDITS.txt' });
export function townTileset(map) { return map?.tileset === 'lpc-victorian' ? VICTORIAN_META : KENNEY_META; }

export function cloneMap(map) { return JSON.parse(JSON.stringify(map)); }
export function tileIndex(map, x, y) { return y * map.width + x; }
export function inBounds(map, x, y) { return Number.isInteger(x) && Number.isInteger(y) && x >= 0 && y >= 0 && x < map.width && y < map.height; }
export function isWalkable(map, x, y, { ignoreResidents = false } = {}) {
  if (!inBounds(map, x, y)) return false;
  const i = tileIndex(map, x, y);
  if (map.collision[i] === 1) return false;
  if (!ignoreResidents && map.events.some((e) => e.kind === 'npc' && e.x === x && e.y === y)) return false;
  if (map.collision[i] === 0) return true;
  if (map.tileset === 'lpc-victorian') return !VICTORIAN_BLOCKED.has(map.ground[i]) && !VICTORIAN_BLOCKED.has(map.objects[i]);
  return map.ground[i] !== TILE.WATER && map.objects[i] === -1;
}

export function validateMap(raw) {
  const fail = (message) => { throw new Error(message); };
  if (!raw || typeof raw !== 'object' || raw.version !== MAP_VERSION) fail('地图版本不支持，请导入本编辑器导出的 v1 JSON 地图。');
  if (raw.tileset !== undefined && raw.tileset !== 'lpc-victorian') fail('地图图集不受支持，请选择已内置的场景。');
  const imported = raw.tileset === 'lpc-victorian';
  const maxSize = imported ? 128 : 64;
  const { width, height } = raw;
  if (!Number.isInteger(width) || !Number.isInteger(height) || width < 12 || height < 12 || width > maxSize || height > maxSize) fail(`地图尺寸须为 12–${maxSize} 格。`);
  const size = width * height;
  const checkLayer = (name, allowed) => {
    const accepts = typeof allowed === 'function' ? allowed : (n) => allowed.includes(n);
    if (!Array.isArray(raw[name]) || raw[name].length !== size || raw[name].some((n) => !Number.isInteger(n) || !accepts(n))) fail(`${name} 图层长度或瓦片编号无效。`);
    return [...raw[name]];
  };
  const text = (value, max, label) => {
    if (typeof value !== 'string' || value.length > max) fail(`${label}格式无效或过长。`);
    return value;
  };
  const map = {
    version: MAP_VERSION, ...(imported ? { tileset: 'lpc-victorian' } : {}), name: text(raw.name, 60, '地图名称'), width, height,
    ground: checkLayer('ground', imported ? (n) => n >= 0 && n < victorianTileset.groundCount : TERRAIN_IDS),
    objects: checkLayer('objects', imported ? (n) => n === -1 || (n >= victorianTileset.groundCount && n < victorianTileset.tileCount) : [-1, ...OBJECT_IDS]),
    collision: checkLayer('collision', [-1, 0, 1]), spawn: { x: raw.spawn?.x, y: raw.spawn?.y }, events: []
  };
  if (!Array.isArray(raw.events) || raw.events.length > 100) fail('交互点须为数组且不能超过 100 个。');
  const ids = new Set();
  const positions = new Set();
  map.events = raw.events.map((e) => {
    if (!e || !inBounds(map, e.x, e.y) || !['npc', 'sign', 'door'].includes(e.kind)) fail('交互点坐标或类型无效。');
    const id = text(e.id, 80, '交互编号');
    const position = `${e.x},${e.y}`;
    if (!id || ids.has(id) || positions.has(position)) fail('交互编号和坐标不能重复。');
    ids.add(id); positions.add(position);
    if (!DESTINATIONS.includes(e.destination || '')) fail('场景入口不受支持。');
    return { id, x: e.x, y: e.y, kind: e.kind, title: text(e.title, 60, '交互名称'), text: text(e.text, 1200, '对话'), destination: e.destination || '', color: ['blue', 'rose', 'gold', 'green'].includes(e.color) ? e.color : 'blue', quest: e.quest === true };
  });
  if (!inBounds(map, map.spawn.x, map.spawn.y) || !isWalkable(map, map.spawn.x, map.spawn.y)) fail('出生点被阻挡，请用出生点工具放在可行走的空地上。');
  return map;
}

export function parseMapJson(value) {
  if (typeof value !== 'string' || value.length > 1_000_000) throw new Error('地图文件不能超过 1 MB。');
  let raw;
  try { raw = JSON.parse(value); } catch { throw new Error('文件不是有效的 JSON，请选择本编辑器导出的地图。'); }
  return validateMap(raw);
}

// A bounded BFS serves both click navigation and starter reachability verification.
export function findPath(map, start, target) {
  if (!inBounds(map, start.x, start.y) || !isWalkable(map, target.x, target.y)) return [];
  const startId = tileIndex(map, start.x, start.y);
  const targetId = tileIndex(map, target.x, target.y);
  const previous = new Int32Array(map.width * map.height).fill(-2);
  previous[startId] = -1;
  const queue = [startId];
  for (let head = 0; head < queue.length && previous[targetId] === -2; head++) {
    const id = queue[head], x = id % map.width, y = Math.floor(id / map.width);
    for (const [dx, dy] of [[0, 1], [1, 0], [0, -1], [-1, 0]]) {
      const nx = x + dx, ny = y + dy, ni = tileIndex(map, nx, ny);
      if (isWalkable(map, nx, ny) && previous[ni] === -2) { previous[ni] = id; queue.push(ni); }
    }
  }
  if (previous[targetId] === -2) return [];
  const path = [];
  for (let id = targetId; id !== startId; id = previous[id]) path.push({ x: id % map.width, y: Math.floor(id / map.width) });
  return path.reverse();
}

export function nearbyEvent(map, player) {
  return [...map.events].filter((e) => Math.abs(e.x - player.x) + Math.abs(e.y - player.y) <= 1)
    .sort((a, b) => (Math.abs(a.x - player.x) + Math.abs(a.y - player.y)) - (Math.abs(b.x - player.x) + Math.abs(b.y - player.y)))[0] || null;
}

export function createStarterMap() {
  const width = 38, height = 28, size = width * height;
  const map = { version: 1, name: '晴川镇', width, height, ground: Array.from({ length: size }, (_, i) => i % 17 === 0 ? 2 : i % 5 === 0 ? 1 : 0), objects: Array(size).fill(-1), collision: Array(size).fill(-1), spawn: { x: 18, y: 16 }, events: [] };
  const put = (layer, x, y, id) => { if (inBounds(map, x, y)) map[layer][tileIndex(map, x, y)] = id; };
  const rect = (layer, x, y, w, h, id) => { for (let yy = y; yy < y + h; yy++) for (let xx = x; xx < x + w; xx++) put(layer, xx, yy, id); };
  // Stone avenues and the central square connect every front door.
  rect('ground', 3, 13, 32, 3, 43); rect('ground', 17, 3, 3, 23, 43);
  rect('ground', 13, 10, 12, 10, 43); rect('ground', 3, 23, 31, 2, 13);
  rect('ground', 4, 7, 29, 2, 13);
  const event = (id, x, y, kind, title, text, destination = '', color = 'blue', quest = false) => map.events.push({ id, x, y, kind, title, text, destination, color, quest });
  const house = (x, y, red = false) => {
    const offset = red ? 4 : 0;
    [[48 + offset, 49 + offset, 49 + offset, 50 + offset], [60 + offset, 61 + offset, 63 + offset, 62 + offset], [72, 73, 74, 75], [84, 86, 85, 87]].forEach((row, dy) => row.forEach((id, dx) => put('objects', x + dx, y + dy, id)));
    rect('ground', x + 1, y + 4, 2, Math.max(1, 13 - y - 4), 43);
    return { x: x + 2, y: y + 4 };
  };
  const bakery = house(5, 9, true);
  event('bakery', bakery.x, bakery.y, 'door', '麦穗面包店', '风铃叮当响，刚出炉的面包还带着温度。店主把一块蜂蜜面包递给你：「新邻居？欢迎来到晴川镇。去教堂、花园和池塘走走，大家都很乐意认识你。」', '', 'gold', true);
  const library = house(26, 9);
  event('library', library.x, library.y, 'door', '街角图书馆', '窗边留着一个安静的位置，书架上都是镇民捐来的书。馆长 Haru 正在整理索引。你可以打开图书馆场景；特殊 AI NPC 沿用管理员权限。', 'library');
  const home = house(5, 19);
  event('home', home.x, home.y, 'door', '你的新家', '门边的信箱里躺着一张欢迎卡：「愿你每天都有值得期待的小事。」这里是你的住处，向东沿着土路就能到池塘。', 'home_gate', 'rose');
  const shop = house(27, 19, true);
  event('shop', shop.x, shop.y, 'door', '杂货铺 · 账房', '货架上摆着种子、玻璃瓶和日用杂货。柜台后的账本记录着镇上的日常，你也可以从这里打开自己的账房库。', 'finance_vault', 'gold');
  // A stone church, a tall bell tower and a small walled garden.
  rect('objects', 14, 4, 9, 2, 49);
  for (let x = 14; x <= 22; x++) { put('objects', x, 4, x === 14 ? 48 : x === 22 ? 50 : 49); put('objects', x, 5, x === 18 ? 63 : 61); }
  rect('objects', 14, 6, 9, 3, 77);
  for (const x of [15, 21]) { put('objects', x, 6, 88); put('objects', x, 8, 88); }
  put('objects', 18, 7, 78); put('objects', 18, 8, 89);
  [[48, 63, 50], [76, 88, 79], [76, 77, 79], [76, 88, 79], [76, 77, 79]].forEach((row, dy) => row.forEach((id, dx) => put('objects', 17 + dx, 1 + dy, id)));
  put('objects', 18, 0, TILE.CROSS);
  event('church', 18, 9, 'door', '晨钟教堂', '钟声刚好响过。长椅上铺着午后的阳光，花瓶里是镇民早晨送来的雏菊。「这里随时欢迎你歇一会儿。」你在留言簿上写下了自己的名字。', '', 'blue', true);
  rect('ground', 26, 3, 7, 4, 13);
  for (let x = 25; x < 34; x++) { put('objects', x, 2, 81); put('objects', x, 7, x === 29 ? -1 : 81); }
  for (let y = 3; y < 7; y++) { put('objects', 25, y, 47); put('objects', 33, y, 47); }
  for (let y = 3; y < 6; y++) for (let x = 27; x < 32; x += 2) { put('ground', x, y, 2); }
  event('garden', 29, 6, 'npc', '园丁 · 林奶奶', '「这块花圃是大家一起照顾的。周末带一包种子来吧！」林奶奶摘下一小束雏菊送给你。你已经认识了小镇的第一位邻居。', '', 'green', true);
  // Pond and its little bridge, deliberately away from the town's main routes.
  rect('ground', 23, 20, 3, 6, TILE.WATER); rect('ground', 22, 21, 5, 4, TILE.WATER);
  rect('ground', 22, 23, 5, 2, TILE.BRIDGE);
  event('pond', 24, 24, 'sign', '池塘木桥', '水面晃着云的倒影，桥下偶尔有小鱼游过。你把面包屑收好，坐了一会儿。四处打过招呼，晴川镇已经开始像家了。', '', 'blue', true);
  put('objects', 18, 13, TILE.FOUNTAIN);
  event('welcome', 18, 17, 'sign', '晴川镇公告栏', '欢迎搬来晴川镇！\n今日散步：到麦穗面包店、晨钟教堂、共享花园和池塘木桥打个招呼。\n方向键 / WASD 移动，点击地面寻路，靠近后按 E 或空格交互。');
  event('neighbor', 12, 15, 'npc', '邻居 · 阿澈', '「广场喷泉往北是教堂，往西是面包店。要是想改造小镇，打开地图编辑器就行。记得保存到浏览器，也可以把地图导出带走。」', '', 'rose');
  event('teacher', 23, 15, 'npc', '老师 · Sora', '「今天的课程已经结束了，来广场散散步吧。」如果想继续学习，可以打开教室场景。', 'classroom', 'blue');
  // Tall trees use the pack's two-tile tree assemblies; keep paths clear.
  const tree = (x, y) => { put('objects', x, y, 4); put('objects', x, y + 1, 16); };
  for (let x = 0; x < width; x += 2) { if (x < 14 || x > 22) tree(x, 0); tree(x, 26); }
  for (let y = 3; y < 26; y += 3) { tree(0, y); tree(36, y); }
  for (const [x, y] of [[3, 3], [5, 4], [9, 2], [11, 5], [3, 17], [10, 18], [12, 22], [31, 16], [34, 4], [34, 20], [21, 25]]) tree(x, y);
  for (const [x, y] of [[12, 10], [24, 10], [12, 18], [24, 18]]) put('objects', x, y, TILE.LAMP);
  return validateMap(map);
}
