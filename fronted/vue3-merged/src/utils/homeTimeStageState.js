import { computed, reactive, readonly } from 'vue';

export const HOME_APPEARANCE_STORAGE_KEY = 'shizuki.homeAppearance.v1';
export const HOME_STAGE_CONTEXT_KEY = Symbol('shizuki.homeTimeStage');
export const HOME_CLOCK_BEHAVIORS = Object.freeze(['auto', 'show', 'hide']);
export const HOME_MOTION_LEVELS = Object.freeze(['vivid', 'calm', 'off']);

const DEFAULT_HOME_APPEARANCE = Object.freeze({
  version: 1,
  clockBehavior: 'auto',
  motionLevel: 'vivid',
  colorMode: 'auto',
  manualAccentHex: '#F2B39D',
  wallpaperClockOverrides: Object.freeze({})
});

const state = reactive(createDefaultHomeAppearance());
const readonlyState = readonly(state);
let initialized = false;

function createDefaultHomeAppearance() {
  return {
    version: DEFAULT_HOME_APPEARANCE.version,
    clockBehavior: DEFAULT_HOME_APPEARANCE.clockBehavior,
    motionLevel: DEFAULT_HOME_APPEARANCE.motionLevel,
    colorMode: DEFAULT_HOME_APPEARANCE.colorMode,
    manualAccentHex: DEFAULT_HOME_APPEARANCE.manualAccentHex,
    wallpaperClockOverrides: {}
  };
}

function normalizeEnum(value, allowed, fallback) {
  const normalized = String(value || '').trim().toLowerCase();
  return allowed.includes(normalized) ? normalized : fallback;
}

function normalizeWallpaperOverrides(input) {
  if (!input || typeof input !== 'object' || Array.isArray(input)) return {};
  return Object.entries(input).reduce((output, [rawId, rawValue]) => {
    const wallpaperId = String(rawId || '').trim();
    const value = normalizeEnum(rawValue, ['show', 'hide'], '');
    if (wallpaperId && value) output[wallpaperId] = value;
    return output;
  }, {});
}

export function normalizeHomeAppearance(input) {
  const source = input && typeof input === 'object' && !Array.isArray(input) ? input : {};
  return {
    version: DEFAULT_HOME_APPEARANCE.version,
    clockBehavior: normalizeEnum(source.clockBehavior, HOME_CLOCK_BEHAVIORS, DEFAULT_HOME_APPEARANCE.clockBehavior),
    motionLevel: normalizeEnum(source.motionLevel, HOME_MOTION_LEVELS, DEFAULT_HOME_APPEARANCE.motionLevel),
    colorMode: normalizeEnum(source.colorMode, ['auto', 'manual'], DEFAULT_HOME_APPEARANCE.colorMode),
    manualAccentHex: normalizeHex(source.manualAccentHex) || DEFAULT_HOME_APPEARANCE.manualAccentHex,
    wallpaperClockOverrides: normalizeWallpaperOverrides(source.wallpaperClockOverrides)
  };
}

export function normalizeHex(value) {
  const raw = String(value || '').trim().replace(/^#/, '').toUpperCase();
  if (/^[0-9A-F]{3}$/.test(raw)) return `#${raw.split('').map((part) => `${part}${part}`).join('')}`;
  return /^[0-9A-F]{6}$/.test(raw) ? `#${raw}` : '';
}

export function resolveHomeClockVisibility({
  clockBehavior = DEFAULT_HOME_APPEARANCE.clockBehavior,
  wallpaperClockOverrides = {},
  wallpaperId = '',
  isDynamic = false
} = {}) {
  const activeId = String(wallpaperId || '').trim();
  const override = activeId ? normalizeEnum(wallpaperClockOverrides?.[activeId], ['show', 'hide'], '') : '';
  if (override) return override === 'show';

  const behavior = normalizeEnum(clockBehavior, HOME_CLOCK_BEHAVIORS, DEFAULT_HOME_APPEARANCE.clockBehavior);
  if (behavior === 'show') return true;
  if (behavior === 'hide') return false;
  return !Boolean(isDynamic);
}

function applySnapshot(input) {
  const snapshot = normalizeHomeAppearance(input);
  state.version = snapshot.version;
  state.clockBehavior = snapshot.clockBehavior;
  state.motionLevel = snapshot.motionLevel;
  state.colorMode = snapshot.colorMode;
  state.manualAccentHex = snapshot.manualAccentHex;
  state.wallpaperClockOverrides = snapshot.wallpaperClockOverrides;
  return snapshot;
}

function persist(storage = typeof window !== 'undefined' ? window.localStorage : null) {
  if (!storage?.setItem) return;
  try {
    storage.setItem(HOME_APPEARANCE_STORAGE_KEY, JSON.stringify(normalizeHomeAppearance(state)));
  } catch {
    // Keep the in-memory preference usable when storage is unavailable.
  }
}

export function initializeHomeAppearance(storage = typeof window !== 'undefined' ? window.localStorage : null) {
  if (initialized) return normalizeHomeAppearance(state);
  initialized = true;
  if (!storage?.getItem) return normalizeHomeAppearance(state);
  try {
    const raw = storage.getItem(HOME_APPEARANCE_STORAGE_KEY);
    if (raw) applySnapshot(JSON.parse(raw));
  } catch {
    applySnapshot(DEFAULT_HOME_APPEARANCE);
  }
  return normalizeHomeAppearance(state);
}

export function setHomeClockBehavior(value) {
  state.clockBehavior = normalizeEnum(value, HOME_CLOCK_BEHAVIORS, DEFAULT_HOME_APPEARANCE.clockBehavior);
  persist();
  return state.clockBehavior;
}

export function setHomeMotionLevel(value) {
  state.motionLevel = normalizeEnum(value, HOME_MOTION_LEVELS, DEFAULT_HOME_APPEARANCE.motionLevel);
  persist();
  return state.motionLevel;
}

export function setHomeColorMode(value) {
  state.colorMode = normalizeEnum(value, ['auto', 'manual'], DEFAULT_HOME_APPEARANCE.colorMode);
  persist();
  return state.colorMode;
}

export function setHomeManualAccentHex(value) {
  const normalized = normalizeHex(value);
  if (!normalized) return { ok: false, error: '颜色格式不正确' };
  state.manualAccentHex = normalized;
  state.colorMode = 'manual';
  persist();
  return { ok: true, normalized };
}

export function setWallpaperClockOverride(wallpaperId, value) {
  const activeId = String(wallpaperId || '').trim();
  if (!activeId) return '';
  const override = normalizeEnum(value, ['show', 'hide'], '');
  const next = { ...state.wallpaperClockOverrides };
  if (override) next[activeId] = override;
  else delete next[activeId];
  state.wallpaperClockOverrides = next;
  persist();
  return override;
}

export function useHomeAppearance() {
  initializeHomeAppearance();
  return {
    state: readonlyState,
    effectiveClockVisible: (wallpaper) => computed(() => resolveHomeClockVisibility({
      clockBehavior: readonlyState.clockBehavior,
      wallpaperClockOverrides: readonlyState.wallpaperClockOverrides,
      wallpaperId: wallpaper?.value?.id,
      isDynamic: wallpaper?.value?.isDynamic
    })),
    setClockBehavior: setHomeClockBehavior,
    setMotionLevel: setHomeMotionLevel,
    setColorMode: setHomeColorMode,
    setManualAccentHex: setHomeManualAccentHex,
    setWallpaperClockOverride
  };
}

export function __resetHomeAppearanceForTests() {
  initialized = false;
  applySnapshot(DEFAULT_HOME_APPEARANCE);
}
