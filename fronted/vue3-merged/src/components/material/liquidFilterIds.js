export const LIQUID_FILTER_IDS = Object.freeze({
  surface: 'shizuki-liquid-surface-refraction',
  lens: 'shizuki-liquid-lens-refraction'
});

export const LIQUID_FILTER_URLS = Object.freeze({
  surface: `url("#${LIQUID_FILTER_IDS.surface}")`,
  lens: `url("#${LIQUID_FILTER_IDS.lens}")`
});
