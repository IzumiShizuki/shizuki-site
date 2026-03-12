const BASE_URL = typeof import.meta !== 'undefined' && import.meta.env?.BASE_URL ? import.meta.env.BASE_URL : '/';

function withBaseUrl(path) {
  const prefix = String(BASE_URL || '/');
  const normalizedPath = String(path || '').replace(/^\/+/, '');
  return `${prefix}${normalizedPath}`;
}

export const DEFAULT_AMBIENT_MASTER_VOLUME = 0.65;
export const DEFAULT_AMBIENT_TRACK_VOLUME = 0.72;
export const DEFAULT_EFFECT_DENSITY = 1;
export const DEFAULT_EFFECT_OPACITY = 0.7;
export const DEFAULT_EFFECT_FALL_SPEED = 1;
export const DEFAULT_EFFECT_SPAWN_RATE = 1;
export const DEFAULT_ATMOSPHERE_TAB = 'ambient';

export const BUILTIN_AMBIENT_DEFINITIONS = [
  {
    id: 'white',
    title: 'White Noise',
    label: '白噪音',
    category: 'noise',
    kind: 'noise',
    noiseType: 'white',
    description: '均匀覆盖环境声，适合屏蔽杂音。',
    icon: 'fas fa-wave-square',
    cover: 'linear-gradient(135deg, rgba(246, 248, 255, 0.9), rgba(166, 177, 204, 0.92))',
    license: 'Generated in browser'
  },
  {
    id: 'pink',
    title: 'Pink Noise',
    label: '粉噪音',
    category: 'noise',
    kind: 'noise',
    noiseType: 'pink',
    description: '低频更柔和，适合长时间专注。',
    icon: 'fas fa-signal',
    cover: 'linear-gradient(135deg, rgba(255, 223, 236, 0.94), rgba(206, 139, 181, 0.92))',
    license: 'Generated in browser'
  },
  {
    id: 'brown',
    title: 'Brown Noise',
    label: '棕噪音',
    category: 'noise',
    kind: 'noise',
    noiseType: 'brown',
    description: '更沉稳的低频底噪，适合夜间陪伴。',
    icon: 'fas fa-mountain',
    cover: 'linear-gradient(135deg, rgba(214, 196, 168, 0.95), rgba(118, 88, 66, 0.92))',
    license: 'Generated in browser'
  },
  {
    id: 'rain',
    title: 'Rain Hush',
    label: '雨声',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/rain-hush.wav',
    description: '稳定雨幕与窗边滴答，适合阅读和夜晚。',
    icon: 'fas fa-cloud-rain',
    cover: 'linear-gradient(140deg, rgba(85, 109, 152, 0.95), rgba(23, 34, 61, 0.92))',
    license: 'Local generated ambience'
  },
  {
    id: 'wind',
    title: 'Wind Drift',
    label: '风声',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/wind-drift.wav',
    description: '低频风压与细微流动，存在感轻。',
    icon: 'fas fa-wind',
    cover: 'linear-gradient(140deg, rgba(123, 170, 188, 0.95), rgba(44, 77, 106, 0.92))',
    license: 'Local generated ambience'
  },
  {
    id: 'ocean',
    title: 'Ocean Wash',
    label: '海浪',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/ocean-wash.wav',
    description: '缓慢潮汐起伏，适合长时间铺底。',
    icon: 'fas fa-water',
    cover: 'linear-gradient(140deg, rgba(73, 153, 179, 0.94), rgba(18, 59, 92, 0.94))',
    license: 'Local generated ambience'
  },
  {
    id: 'forest',
    title: 'Forest Air',
    label: '林间',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/forest-air.wav',
    description: '微风与远处轻响，适合午后发呆或写作。',
    icon: 'fas fa-tree',
    cover: 'linear-gradient(140deg, rgba(110, 163, 129, 0.95), rgba(34, 66, 45, 0.94))',
    license: 'Local generated ambience'
  },
  {
    id: 'footsteps',
    title: 'Footsteps Hall',
    label: '脚步声',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/footsteps-hall.wav',
    description: '轻微远近脚步与空气残响，做陪伴氛围用。',
    icon: 'fas fa-shoe-prints',
    cover: 'linear-gradient(140deg, rgba(135, 118, 142, 0.95), rgba(52, 40, 61, 0.94))',
    license: 'Local generated ambience'
  }
];

export const BUILTIN_AMBIENT_ID_SET = new Set(BUILTIN_AMBIENT_DEFINITIONS.map((item) => item.id));

export const EFFECT_PRESET_DEFINITIONS = [
  {
    id: 'none',
    label: '关闭',
    title: '无特效',
    description: '只保留当前壁纸与氛围层。',
    cover: 'linear-gradient(140deg, rgba(255,255,255,0.2), rgba(140,150,170,0.1))'
  },
  {
    id: 'sakura',
    label: '樱花',
    title: 'Sakura Drift',
    description: '轻薄花瓣从上方滑落，适合静态或浅色背景。',
    cover: 'linear-gradient(140deg, rgba(255, 215, 232, 0.95), rgba(235, 129, 176, 0.92))'
  },
  {
    id: 'snow',
    label: '落雪',
    title: 'Soft Snow',
    description: '柔和颗粒感雪点，存在感很轻。',
    cover: 'linear-gradient(140deg, rgba(231, 244, 255, 0.95), rgba(143, 174, 211, 0.92))'
  },
  {
    id: 'soft-rain',
    label: '细雨',
    title: 'Soft Rain',
    description: '半透明细雨线，适合冷色背景。',
    cover: 'linear-gradient(140deg, rgba(103, 127, 170, 0.95), rgba(34, 44, 76, 0.94))'
  },
  {
    id: 'fireflies',
    label: '萤火',
    title: 'Fireflies',
    description: '微弱的暖光漂浮，更适合夜景和 L2D。',
    cover: 'linear-gradient(140deg, rgba(245, 227, 129, 0.94), rgba(83, 57, 22, 0.94))'
  }
];

export const EFFECT_PRESET_ID_SET = new Set(EFFECT_PRESET_DEFINITIONS.map((item) => item.id));

export function resolveBuiltinAmbientCatalog() {
  return BUILTIN_AMBIENT_DEFINITIONS.map((item) => ({
    ...item,
    audioUrl: item.assetPath ? withBaseUrl(item.assetPath) : ''
  }));
}

export function findBuiltinAmbientById(trackId) {
  return resolveBuiltinAmbientCatalog().find((item) => item.id === String(trackId || '').trim()) || null;
}

export function findEffectPresetById(presetId) {
  return EFFECT_PRESET_DEFINITIONS.find((item) => item.id === String(presetId || '').trim()) || EFFECT_PRESET_DEFINITIONS[0];
}
