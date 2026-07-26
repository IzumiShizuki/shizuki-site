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
  },
  {
    id: 'thunder',
    title: 'Thunder Roll',
    label: '雷雨',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/thunder-roll.wav',
    description: '雨幕铺底，远处滚雷缓慢掠过。',
    icon: 'fas fa-cloud-bolt',
    cover: 'linear-gradient(140deg, rgba(96, 110, 148, 0.95), rgba(30, 34, 56, 0.95))',
    license: 'Local generated ambience'
  },
  {
    id: 'campfire',
    title: 'Campfire Glow',
    label: '篝火',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/campfire-glow.wav',
    description: '低沉火焰与细碎噼啪，冬夜陪伴感十足。',
    icon: 'fas fa-fire',
    cover: 'linear-gradient(140deg, rgba(236, 150, 82, 0.95), rgba(96, 42, 24, 0.94))',
    license: 'Local generated ambience'
  },
  {
    id: 'creek',
    title: 'Creek Babble',
    label: '溪流',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/creek-babble.wav',
    description: '轻快水流与偶尔的汩汩气泡声。',
    icon: 'fas fa-droplet',
    cover: 'linear-gradient(140deg, rgba(126, 194, 196, 0.95), rgba(30, 84, 92, 0.94))',
    license: 'Local generated ambience'
  },
  {
    id: 'birds',
    title: 'Morning Birds',
    label: '鸟鸣',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/morning-birds.wav',
    description: '清晨林间鸟鸣，稀疏清亮不聒噪。',
    icon: 'fas fa-dove',
    cover: 'linear-gradient(140deg, rgba(170, 208, 148, 0.95), rgba(60, 104, 66, 0.94))',
    license: 'Local generated ambience'
  },
  {
    id: 'crickets',
    title: 'Night Crickets',
    label: '虫鸣',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/night-crickets.wav',
    description: '夏夜虫鸣与安静的夜风底噪。',
    icon: 'fas fa-moon',
    cover: 'linear-gradient(140deg, rgba(88, 106, 156, 0.95), rgba(22, 26, 52, 0.95))',
    license: 'Local generated ambience'
  },
  {
    id: 'cafe',
    title: 'Cafe Murmur',
    label: '咖啡馆',
    category: 'scene',
    kind: 'media',
    assetPath: 'ambient/cafe-murmur.wav',
    description: '模糊人声与杯盏轻响，白天干活好搭档。',
    icon: 'fas fa-mug-hot',
    cover: 'linear-gradient(140deg, rgba(196, 156, 118, 0.95), rgba(84, 56, 40, 0.94))',
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
  },
  {
    id: 'leaves',
    label: '落叶',
    title: 'Autumn Leaves',
    description: '暖色叶片打着旋缓缓飘落，秋日限定。',
    cover: 'linear-gradient(140deg, rgba(244, 196, 134, 0.95), rgba(150, 78, 44, 0.93))'
  },
  {
    id: 'starfield',
    label: '星屑',
    title: 'Starfield',
    description: '满屏细小星光缓慢闪烁，夜景壁纸绝配。',
    cover: 'linear-gradient(140deg, rgba(70, 86, 158, 0.92), rgba(12, 16, 44, 0.96))'
  },
  {
    id: 'meteor',
    label: '流星',
    title: 'Meteor Shower',
    description: '星幕之上偶有流星划过，稀疏而克制。',
    cover: 'linear-gradient(140deg, rgba(104, 90, 178, 0.93), rgba(22, 14, 54, 0.96))'
  },
  {
    id: 'bubbles',
    label: '气泡',
    title: 'Rising Bubbles',
    description: '透亮气泡从底部轻轻升起，凉爽治愈。',
    cover: 'linear-gradient(140deg, rgba(136, 208, 224, 0.94), rgba(26, 94, 128, 0.94))'
  },
  {
    id: 'dust',
    label: '光尘',
    title: 'Light Dust',
    description: '微光尘埃缓慢浮游，几乎无存在感的氛围层。',
    cover: 'linear-gradient(140deg, rgba(240, 224, 188, 0.95), rgba(122, 100, 70, 0.92))'
  },
  {
    id: 'aurora',
    label: '极光',
    title: 'Aurora Veil',
    description: '柔和光幕在上方流动，冷色与夜空更出效果。',
    cover: 'linear-gradient(140deg, rgba(104, 220, 190, 0.92), rgba(56, 34, 96, 0.95))'
  }
];

export const EFFECT_PRESET_ID_SET = new Set(EFFECT_PRESET_DEFINITIONS.map((item) => item.id));

export const ATMOSPHERE_SCENE_DEFINITIONS = [
  {
    id: 'rainy-study',
    label: '雨夜书房',
    title: 'Rainy Study',
    description: '雨声铺底、远雷点缀，细雨落在窗外。',
    icon: 'fas fa-book-open',
    cover: 'linear-gradient(140deg, rgba(90, 114, 160, 0.95), rgba(26, 34, 60, 0.95))',
    effect: { presetId: 'soft-rain', opacity: 0.56 },
    tracks: [
      { trackId: 'rain', volume: 0.66 },
      { trackId: 'thunder', volume: 0.4 }
    ]
  },
  {
    id: 'forest-morning',
    label: '林间晨光',
    title: 'Forest Morning',
    description: '鸟鸣与溪流交叠，光尘在晨光里浮动。',
    icon: 'fas fa-sun',
    cover: 'linear-gradient(140deg, rgba(178, 210, 150, 0.95), rgba(64, 108, 70, 0.94))',
    effect: { presetId: 'dust', opacity: 0.6 },
    tracks: [
      { trackId: 'birds', volume: 0.6 },
      { trackId: 'creek', volume: 0.52 }
    ]
  },
  {
    id: 'summer-night',
    label: '夏夜萤火',
    title: 'Summer Fireflies',
    description: '虫鸣与夜风，萤火在屏幕上缓缓漂浮。',
    icon: 'fas fa-moon',
    cover: 'linear-gradient(140deg, rgba(94, 128, 116, 0.95), rgba(24, 40, 48, 0.95))',
    effect: { presetId: 'fireflies', opacity: 0.72 },
    tracks: [
      { trackId: 'crickets', volume: 0.62 },
      { trackId: 'wind', volume: 0.3 }
    ]
  },
  {
    id: 'winter-hearth',
    label: '冬日炉火',
    title: 'Winter Hearth',
    description: '窗外落雪无声，屋里只有篝火噼啪。',
    icon: 'fas fa-fire',
    cover: 'linear-gradient(140deg, rgba(232, 158, 96, 0.95), rgba(88, 44, 28, 0.95))',
    effect: { presetId: 'snow', opacity: 0.66 },
    tracks: [
      { trackId: 'campfire', volume: 0.68 },
      { trackId: 'wind', volume: 0.34 }
    ]
  },
  {
    id: 'seaside-calm',
    label: '海岸冥想',
    title: 'Seaside Calm',
    description: '潮汐往复，气泡轻轻上浮，放空专用。',
    icon: 'fas fa-umbrella-beach',
    cover: 'linear-gradient(140deg, rgba(110, 176, 196, 0.95), rgba(24, 66, 96, 0.95))',
    effect: { presetId: 'bubbles', opacity: 0.5 },
    tracks: [
      { trackId: 'ocean', volume: 0.66 },
      { trackId: 'wind', volume: 0.28 }
    ]
  },
  {
    id: 'cafe-afternoon',
    label: '午后咖啡',
    title: 'Cafe Afternoon',
    description: '人声底噪配窗边细雨，专注效率翻倍。',
    icon: 'fas fa-mug-hot',
    cover: 'linear-gradient(140deg, rgba(202, 162, 122, 0.95), rgba(90, 60, 42, 0.95))',
    effect: { presetId: 'dust', opacity: 0.42 },
    tracks: [
      { trackId: 'cafe', volume: 0.62 },
      { trackId: 'rain', volume: 0.3 }
    ]
  },
  {
    id: 'starry-wish',
    label: '星夜许愿',
    title: 'Starry Wish',
    description: '虫鸣渐远，星屑与流星铺满整片夜空。',
    icon: 'fas fa-star',
    cover: 'linear-gradient(140deg, rgba(96, 88, 168, 0.94), rgba(16, 12, 44, 0.96))',
    effect: { presetId: 'meteor', opacity: 0.78 },
    tracks: [
      { trackId: 'crickets', volume: 0.3 },
      { trackId: 'wind', volume: 0.26 }
    ]
  }
];

export function findAtmosphereSceneById(sceneId) {
  return ATMOSPHERE_SCENE_DEFINITIONS.find((item) => item.id === String(sceneId || '').trim()) || null;
}

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
