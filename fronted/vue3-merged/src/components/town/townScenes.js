import victorianMap from './data/victorian-map.json';
import { TOWN_SAVE_KEY, cloneMap, createStarterMap, validateMap } from './townMap';

export const TOWN_SCENE_KEY = 'shizuki.ai-town.scene.v1';
export const TOWN_SCENES = Object.freeze([
  { id: 'victorian', label: '维多利亚街区 · 原作者完整地图' },
  { id: 'kenney', label: '晴川镇 · 先前自建场景' }
]);
export function sceneIdForMap(map) { return map?.tileset === 'lpc-victorian' ? 'victorian' : 'kenney'; }
export function sceneSaveKey(id) { return id === 'victorian' ? `${TOWN_SAVE_KEY}.victorian` : TOWN_SAVE_KEY; }
export function createSceneMap(id) { return id === 'victorian' ? validateMap(cloneMap(victorianMap)) : createStarterMap(); }

export function preferredScene(storage, fallback = 'victorian') {
  const selected = storage.getItem(TOWN_SCENE_KEY);
  if (TOWN_SCENES.some(scene => scene.id === selected)) return selected;
  const legacy = storage.getItem(TOWN_SAVE_KEY);
  if (legacy) {
    try {
      if (JSON.stringify(validateMap(JSON.parse(legacy))) !== JSON.stringify(createStarterMap())) return 'kenney';
    } catch { return 'kenney'; }
  }
  return fallback;
}
