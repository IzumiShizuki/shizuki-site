export const DEFAULT_VOICE_AGE_FILTER = 'safe';

export const VOICE_AGE_FILTER_OPTIONS = Object.freeze([
  {
    key: 'safe',
    label: '全年龄 + R15',
    description: '优先显示全年龄与 R15 作品',
    categories: ['general', 'r15']
  },
  {
    key: 'general',
    label: '全年龄',
    description: '仅显示全年龄作品',
    categories: ['general']
  },
  {
    key: 'r15',
    label: 'R15',
    description: '仅显示 R15 作品',
    categories: ['r15']
  },
  {
    key: 'adult',
    label: 'R18',
    description: '仅显示成人分级作品',
    categories: ['adult']
  },
  {
    key: 'all',
    label: '全部',
    description: '显示所有年龄分级',
    categories: []
  }
]);

function compactAgeCategory(value) {
  return String(value || '')
    .trim()
    .toLowerCase()
    .replace(/[\s_-]+/g, '');
}

export function normalizeVoiceAgeCategory(value, nsfw = false) {
  const normalized = compactAgeCategory(value);
  if (
    normalized === 'general' ||
    normalized === 'allage' ||
    normalized === 'allages' ||
    normalized === 'everyone' ||
    normalized.includes('全年龄') ||
    normalized.includes('全年齢')
  ) {
    return 'general';
  }
  if (
    normalized === 'r15' ||
    normalized === '15+' ||
    normalized === '15plus' ||
    normalized.includes('r15') ||
    normalized.includes('15岁') ||
    normalized.includes('15歳')
  ) {
    return 'r15';
  }
  if (
    nsfw ||
    normalized === 'adult' ||
    normalized === '18+' ||
    normalized === '18plus' ||
    normalized.includes('r18') ||
    normalized.includes('18岁') ||
    normalized.includes('18歳') ||
    normalized.includes('成人')
  ) {
    return 'adult';
  }
  return 'unknown';
}

export function voiceAgeCategoryLabel(value, nsfw = false) {
  const category = normalizeVoiceAgeCategory(value, nsfw);
  if (category === 'general') return '全年龄';
  if (category === 'r15') return 'R15';
  if (category === 'adult') return 'R18';
  return '未分级';
}

export function resolveVoiceAgeFilterCategories(filterKey) {
  const option = VOICE_AGE_FILTER_OPTIONS.find((item) => item.key === filterKey);
  return option ? [...option.categories] : [...VOICE_AGE_FILTER_OPTIONS[0].categories];
}
