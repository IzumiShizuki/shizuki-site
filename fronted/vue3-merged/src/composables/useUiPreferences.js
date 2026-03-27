import { reactive } from 'vue';

const STORAGE_KEY = 'shizuki.uiPreferences.v1';
const LEGACY_PLAYER_STORAGE_KEY = 'shizuki.musicPlayer.v1';
const THEME_DEFAULTS_VERSION = 2;
const LEGACY_DEFAULT_ACCENT_HEX = '#C8B4FF';
const LEGACY_DEFAULT_GRADIENT_PRESET_ID = 'berry';
const LEGACY_DEFAULT_GRADIENT_START_HEX = '#E94BC5';
const LEGACY_DEFAULT_GRADIENT_END_HEX = '#9D6BFF';
const DEFAULT_ACCENT_HEX = '#F2B39D';
const DEFAULT_ACCENT_MODE = 'solid';
const DEFAULT_GRADIENT_PRESET_ID = 'apricot-blush';

const ACCENT_PRESETS = [
  { name: '奶杏桃粉', hex: '#F2B39D' },
  { name: '暖橙', hex: '#FFBF8A' },
  { name: '玫瑰粉', hex: '#F5A4D6' },
  { name: '淡紫', hex: '#C8B4FF' },
  { name: '薄荷青', hex: '#8FDCC8' },
  { name: '天空蓝', hex: '#9EC8FF' }
];

const GRADIENT_PRESETS = [
  { id: 'apricot-blush', name: '奶杏桃粉', startHex: '#F6C2A1', endHex: '#EFA0A8' },
  { id: 'sunset', name: '晚霞粉橙', startHex: '#FF7A8A', endHex: '#FFB168' },
  { id: 'rose', name: '蔷薇奶霓', startHex: '#FF6BAA', endHex: '#C36BFF' },
  { id: 'berry', name: '莓果粉紫', startHex: '#E94BC5', endHex: '#9D6BFF' },
  { id: 'mint', name: '薄荷霓虹', startHex: '#58D4C5', endHex: '#7A8CFF' }
];

function resolveGradientPreset(id) {
  const normalized = String(id || '').trim().toLowerCase();
  return GRADIENT_PRESETS.find((item) => item.id === normalized) || GRADIENT_PRESETS[0];
}

const state = reactive({
  accentHex: DEFAULT_ACCENT_HEX,
  accentMode: DEFAULT_ACCENT_MODE,
  accentGradientId: DEFAULT_GRADIENT_PRESET_ID,
  accentGradientStartHex: resolveGradientPreset(DEFAULT_GRADIENT_PRESET_ID).startHex,
  accentGradientEndHex: resolveGradientPreset(DEFAULT_GRADIENT_PRESET_ID).endHex,
  themeDefaultsVersion: THEME_DEFAULTS_VERSION,
  globalBackgroundId: '',
  routeBackgroundByKey: {},
  aiPanelOpen: false
});

let initialized = false;

function clamp(value) {
  return Math.max(0, Math.min(255, Math.round(value)));
}

function mixTuple(source, target, ratio) {
  return [
    clamp(source[0] + (target[0] - source[0]) * ratio),
    clamp(source[1] + (target[1] - source[1]) * ratio),
    clamp(source[2] + (target[2] - source[2]) * ratio)
  ];
}

function normalizeHex(input) {
  if (typeof input !== 'string') return '';
  let hex = input.trim().replace(/^#/, '').toUpperCase();
  if (/^[0-9A-F]{3}$/.test(hex)) {
    hex = hex
      .split('')
      .map((char) => char + char)
      .join('');
  }
  if (!/^[0-9A-F]{6}$/.test(hex)) return '';
  return `#${hex}`;
}

function normalizeAccentMode(input) {
  const normalized = String(input || '').trim().toLowerCase();
  return normalized === 'gradient' ? 'gradient' : 'solid';
}

function hexToRgbTuple(hex) {
  const normalized = normalizeHex(hex);
  if (!normalized) return null;
  return [
    Number.parseInt(normalized.slice(1, 3), 16),
    Number.parseInt(normalized.slice(3, 5), 16),
    Number.parseInt(normalized.slice(5, 7), 16)
  ];
}

function getThemeDefaultsVersion(payload) {
  const value = Number.parseInt(payload?.themeDefaultsVersion, 10);
  return Number.isFinite(value) ? value : 0;
}

function isLegacyDefaultThemeSelection(payload) {
  if (!payload || typeof payload !== 'object') return false;

  const accentHex = normalizeHex(payload.accentHex) || LEGACY_DEFAULT_ACCENT_HEX;
  const accentMode = normalizeAccentMode(payload.accentMode);
  const gradientId = String(payload.accentGradientId || LEGACY_DEFAULT_GRADIENT_PRESET_ID).trim().toLowerCase();
  const gradientStartHex = normalizeHex(payload.accentGradientStartHex) || LEGACY_DEFAULT_GRADIENT_START_HEX;
  const gradientEndHex = normalizeHex(payload.accentGradientEndHex) || LEGACY_DEFAULT_GRADIENT_END_HEX;
  const matchesLegacyGradient =
    gradientStartHex === LEGACY_DEFAULT_GRADIENT_START_HEX &&
    gradientEndHex === LEGACY_DEFAULT_GRADIENT_END_HEX &&
    (!gradientId || gradientId === LEGACY_DEFAULT_GRADIENT_PRESET_ID || gradientId === 'custom');

  return accentHex === LEGACY_DEFAULT_ACCENT_HEX && matchesLegacyGradient && ['solid', 'gradient'].includes(accentMode);
}

function applyThemeDefaults(modeInput = state.accentMode) {
  const preset = resolveGradientPreset(DEFAULT_GRADIENT_PRESET_ID);
  state.accentHex = DEFAULT_ACCENT_HEX;
  state.accentMode = normalizeAccentMode(modeInput);
  state.accentGradientId = preset.id;
  state.accentGradientStartHex = preset.startHex;
  state.accentGradientEndHex = preset.endHex;
  state.themeDefaultsVersion = THEME_DEFAULTS_VERSION;
}

function applyAccentVariables() {
  if (typeof document === 'undefined') return;
  const tuple = hexToRgbTuple(state.accentHex) || hexToRgbTuple(DEFAULT_ACCENT_HEX);
  if (!tuple) return;

  const [r, g, b] = tuple;
  const strong = [clamp(r * 0.86), clamp(g * 0.84), clamp(b * 0.92)];
  const soft = [clamp(r + (255 - r) * 0.42), clamp(g + (255 - g) * 0.42), clamp(b + (255 - b) * 0.38)];
  const lifted = [clamp(r + (255 - r) * 0.18), clamp(g + (255 - g) * 0.18), clamp(b + (255 - b) * 0.16)];
  const gradientStart = hexToRgbTuple(state.accentGradientStartHex) || [246, 194, 161];
  const gradientEnd = hexToRgbTuple(state.accentGradientEndHex) || [239, 160, 168];
  const warmCore = mixTuple([r, g, b], [50, 32, 28], 0.68);
  const warmShade = mixTuple([r, g, b], [20, 12, 10], 0.82);
  const warmLift = mixTuple(soft, [255, 235, 224], 0.34);
  const warmBorder = mixTuple([r, g, b], [255, 230, 214], 0.18);
  const warmBorderStrong = mixTuple(strong, [255, 214, 194], 0.12);
  const themeSurface = state.accentMode === 'gradient'
    ? `linear-gradient(155deg, rgba(${mixTuple(gradientStart, [68, 42, 34], 0.56).join(', ')}, 0.7), rgba(${mixTuple(gradientEnd, [22, 14, 12], 0.84).join(', ')}, 0.76))`
    : `linear-gradient(155deg, rgba(${warmCore.join(', ')}, 0.34), rgba(${warmShade.join(', ')}, 0.84))`;
  const themeSurfaceElevated = state.accentMode === 'gradient'
    ? `linear-gradient(145deg, rgba(${mixTuple(gradientStart, [110, 72, 56], 0.44).join(', ')}, 0.32), rgba(${mixTuple(gradientEnd, [36, 22, 18], 0.74).join(', ')}, 0.74))`
    : `linear-gradient(145deg, rgba(${mixTuple(lifted, [126, 82, 68], 0.36).join(', ')}, 0.28), rgba(${mixTuple([r, g, b], [30, 18, 16], 0.78).join(', ')}, 0.72))`;
  const themeSurfaceSoft = state.accentMode === 'gradient'
    ? `rgba(${mixTuple(gradientStart, [255, 236, 224], 0.28).join(', ')}, 0.16)`
    : `rgba(${warmLift.join(', ')}, 0.16)`;
  const themeBorder = `rgba(${warmBorder.join(', ')}, 0.24)`;
  const themeBorderStrong = `rgba(${warmBorderStrong.join(', ')}, 0.34)`;
  const themeTextPrimary = 'rgba(255, 242, 233, 0.96)';
  const themeTextSecondary = 'rgba(231, 211, 196, 0.88)';
  const themeTextTertiary = 'rgba(205, 183, 168, 0.78)';
  const themeSpotA = state.accentMode === 'gradient'
    ? `rgba(${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}, 0.22)`
    : `rgba(${lifted[0]}, ${lifted[1]}, ${lifted[2]}, 0.2)`;
  const themeSpotB = state.accentMode === 'gradient'
    ? `rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.16)`
    : `rgba(${soft[0]}, ${soft[1]}, ${soft[2]}, 0.16)`;
  const themeScrim = 'rgba(24, 14, 12, 0.64)';
  const fillSoft = state.accentMode === 'gradient'
    ? `linear-gradient(135deg, rgba(${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}, 0.18), rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.14))`
    : `linear-gradient(145deg, rgba(${lifted[0]}, ${lifted[1]}, ${lifted[2]}, 0.16), rgba(${r}, ${g}, ${b}, 0.12))`;
  const fill = state.accentMode === 'gradient'
    ? `linear-gradient(135deg, rgba(${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}, 0.28), rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.22))`
    : `linear-gradient(145deg, rgba(${lifted[0]}, ${lifted[1]}, ${lifted[2]}, 0.24), rgba(${r}, ${g}, ${b}, 0.18))`;
  const fillStrong = state.accentMode === 'gradient'
    ? 'var(--accent-gradient)'
    : `linear-gradient(145deg, rgba(${strong[0]}, ${strong[1]}, ${strong[2]}, 0.96), rgba(${r}, ${g}, ${b}, 0.86))`;
  const fillHover = state.accentMode === 'gradient'
    ? `linear-gradient(135deg, rgba(${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}, 1), rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.94))`
    : `linear-gradient(145deg, rgba(${soft[0]}, ${soft[1]}, ${soft[2]}, 0.98), rgba(${r}, ${g}, ${b}, 0.92))`;
  const border = state.accentMode === 'gradient'
    ? `rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.58)`
    : `rgba(${r}, ${g}, ${b}, 0.42)`;
  const borderStrong = state.accentMode === 'gradient'
    ? `rgba(${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}, 0.76)`
    : `rgba(${strong[0]}, ${strong[1]}, ${strong[2]}, 0.72)`;
  const shadow = state.accentMode === 'gradient'
    ? `0 12px 24px rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.28), 0 0 18px rgba(${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}, 0.16)`
    : `0 12px 24px rgba(${r}, ${g}, ${b}, 0.24), 0 0 14px rgba(${r}, ${g}, ${b}, 0.12)`;
  const focusRing = state.accentMode === 'gradient'
    ? `0 0 0 3px rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.24)`
    : `0 0 0 3px rgba(${r}, ${g}, ${b}, 0.22)`;
  const glow = state.accentMode === 'gradient'
    ? `0 0 18px rgba(${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}, 0.22)`
    : `0 0 18px rgba(${r}, ${g}, ${b}, 0.22)`;

  const root = document.documentElement;
  root.style.setProperty('--accent-hex', normalizeHex(state.accentHex) || DEFAULT_ACCENT_HEX);
  root.style.setProperty('--accent-rgb', `${r}, ${g}, ${b}`);
  root.style.setProperty('--accent-strong-rgb', `${strong[0]}, ${strong[1]}, ${strong[2]}`);
  root.style.setProperty('--accent-soft-rgb', `${soft[0]}, ${soft[1]}, ${soft[2]}`);
  root.style.setProperty('--accent-gradient-start-rgb', `${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}`);
  root.style.setProperty('--accent-gradient-end-rgb', `${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}`);
  root.style.setProperty(
    '--accent-gradient',
    `linear-gradient(135deg, rgba(${gradientStart[0]}, ${gradientStart[1]}, ${gradientStart[2]}, 0.94), rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.9))`
  );
  root.style.setProperty('--theme-surface', themeSurface);
  root.style.setProperty('--theme-surface-elevated', themeSurfaceElevated);
  root.style.setProperty('--theme-surface-soft', themeSurfaceSoft);
  root.style.setProperty('--theme-border', themeBorder);
  root.style.setProperty('--theme-border-strong', themeBorderStrong);
  root.style.setProperty('--theme-text-primary', themeTextPrimary);
  root.style.setProperty('--theme-text-secondary', themeTextSecondary);
  root.style.setProperty('--theme-text-tertiary', themeTextTertiary);
  root.style.setProperty('--theme-spot-a', themeSpotA);
  root.style.setProperty('--theme-spot-b', themeSpotB);
  root.style.setProperty('--theme-scrim', themeScrim);
  root.style.setProperty('--accent-mode-fill-soft', fillSoft);
  root.style.setProperty(
    '--accent-mode-fill',
    fill
  );
  root.style.setProperty(
    '--accent-mode-fill-strong',
    fillStrong
  );
  root.style.setProperty(
    '--accent-mode-fill-hover',
    fillHover
  );
  root.style.setProperty(
    '--accent-mode-border',
    border
  );
  root.style.setProperty(
    '--accent-mode-border-strong',
    borderStrong
  );
  root.style.setProperty(
    '--accent-mode-shadow',
    shadow
  );
  root.style.setProperty(
    '--accent-mode-focus-ring',
    focusRing
  );
  root.style.setProperty(
    '--accent-mode-glow',
    glow
  );
  root.style.setProperty('--accent-mode-text', 'rgba(255, 255, 255, 0.96)');
  root.style.setProperty(
    '--accent-mode-text-muted',
    state.accentMode === 'gradient'
      ? 'rgba(255, 244, 252, 0.84)'
      : `rgba(${soft[0]}, ${soft[1]}, ${soft[2]}, 0.84)`
  );
  root.style.setProperty(
    '--accent-press-overlay',
    state.accentMode === 'gradient' ? 'rgba(255, 255, 255, 0.1)' : `rgba(${r}, ${g}, ${b}, 0.14)`
  );
  root.setAttribute('data-accent-mode', normalizeAccentMode(state.accentMode));
}

function persist() {
  if (typeof window === 'undefined') return;
  try {
    window.localStorage.setItem(
      STORAGE_KEY,
      JSON.stringify({
        accentHex: state.accentHex,
        accentMode: state.accentMode,
        accentGradientId: state.accentGradientId,
        accentGradientStartHex: state.accentGradientStartHex,
        accentGradientEndHex: state.accentGradientEndHex,
        themeDefaultsVersion: state.themeDefaultsVersion,
        globalBackgroundId: state.globalBackgroundId,
        routeBackgroundByKey: state.routeBackgroundByKey,
        aiPanelOpen: state.aiPanelOpen
      })
    );
  } catch {
    // ignore persistence errors
  }
}

function initializeUiPreferences() {
  if (initialized) return;
  initialized = true;

  if (typeof window !== 'undefined') {
    try {
      const raw = window.localStorage.getItem(STORAGE_KEY);
      if (raw) {
        const payload = JSON.parse(raw);
        if (payload && typeof payload === 'object') {
          if (normalizeHex(payload.accentHex)) state.accentHex = normalizeHex(payload.accentHex);
          state.accentMode = normalizeAccentMode(payload.accentMode);
          const preset = resolveGradientPreset(payload.accentGradientId || DEFAULT_GRADIENT_PRESET_ID);
          state.accentGradientId = preset.id;
          state.accentGradientStartHex = normalizeHex(payload.accentGradientStartHex) || preset.startHex;
          state.accentGradientEndHex = normalizeHex(payload.accentGradientEndHex) || preset.endHex;
          state.themeDefaultsVersion = getThemeDefaultsVersion(payload);
          if (typeof payload.globalBackgroundId === 'string') state.globalBackgroundId = payload.globalBackgroundId;
          if (payload.routeBackgroundByKey && typeof payload.routeBackgroundByKey === 'object') {
            state.routeBackgroundByKey = { ...payload.routeBackgroundByKey };
          }
          state.aiPanelOpen = Boolean(payload.aiPanelOpen);

          if (state.themeDefaultsVersion < THEME_DEFAULTS_VERSION) {
            if (isLegacyDefaultThemeSelection(payload)) {
              applyThemeDefaults(payload.accentMode);
            } else {
              state.themeDefaultsVersion = THEME_DEFAULTS_VERSION;
            }
          }
        }
      }

      if (!state.globalBackgroundId) {
        const legacyRaw = window.localStorage.getItem(LEGACY_PLAYER_STORAGE_KEY);
        if (legacyRaw) {
          const legacy = JSON.parse(legacyRaw);
          if (typeof legacy?.backgroundSelectedId === 'string') {
            state.globalBackgroundId = legacy.backgroundSelectedId;
          }
        }
      }
    } catch {
      // ignore malformed storage
    }
  }

  applyAccentVariables();
  persist();
}

function setAccentHex(hexInput) {
  const normalized = normalizeHex(hexInput);
  if (!normalized) {
    return {
      ok: false,
      error: '颜色格式不正确，请输入 #RRGGBB 或 #RGB。'
    };
  }

  state.accentHex = normalized;
  state.themeDefaultsVersion = THEME_DEFAULTS_VERSION;
  applyAccentVariables();
  persist();

  return {
    ok: true,
    normalized
  };
}

function resetAccent() {
  applyThemeDefaults(state.accentMode);
  applyAccentVariables();
  persist();
}

function setAccentMode(modeInput) {
  state.accentMode = normalizeAccentMode(modeInput);
  state.themeDefaultsVersion = THEME_DEFAULTS_VERSION;
  applyAccentVariables();
  persist();
  return state.accentMode;
}

function setAccentGradientPreset(presetId) {
  const preset = resolveGradientPreset(presetId);
  state.accentGradientId = preset.id;
  state.accentGradientStartHex = preset.startHex;
  state.accentGradientEndHex = preset.endHex;
  state.themeDefaultsVersion = THEME_DEFAULTS_VERSION;
  applyAccentVariables();
  persist();
  return preset;
}

function setAccentGradientCustom(startHexInput, endHexInput) {
  const startHex = normalizeHex(startHexInput);
  const endHex = normalizeHex(endHexInput);
  if (!startHex || !endHex) {
    return {
      ok: false,
      error: '渐变色格式不正确，请输入 #RRGGBB 或 #RGB。'
    };
  }
  state.accentGradientId = 'custom';
  state.accentGradientStartHex = startHex;
  state.accentGradientEndHex = endHex;
  state.themeDefaultsVersion = THEME_DEFAULTS_VERSION;
  applyAccentVariables();
  persist();
  return {
    ok: true,
    startHex,
    endHex
  };
}

function setGlobalBackgroundId(backgroundId) {
  state.globalBackgroundId = typeof backgroundId === 'string' ? backgroundId : '';
  persist();
}

function setRouteBackground(routeKey, backgroundId) {
  if (!routeKey) return;
  const next = { ...state.routeBackgroundByKey };

  if (typeof backgroundId === 'string' && backgroundId) {
    next[routeKey] = backgroundId;
  } else {
    delete next[routeKey];
  }

  state.routeBackgroundByKey = next;
  persist();
}

function clearRouteBackground(routeKey) {
  setRouteBackground(routeKey, '');
}

function getEffectiveBackgroundId(routeKey) {
  return state.routeBackgroundByKey?.[routeKey] || state.globalBackgroundId || '';
}

function setAiPanelOpen(open) {
  state.aiPanelOpen = Boolean(open);
  persist();
}

export function useUiPreferences() {
  return {
    state,
    ACCENT_PRESETS,
    GRADIENT_PRESETS,
    initializeUiPreferences,
    setAccentHex,
    resetAccent,
    setAccentMode,
    setAccentGradientPreset,
    setAccentGradientCustom,
    setGlobalBackgroundId,
    setRouteBackground,
    clearRouteBackground,
    getEffectiveBackgroundId,
    setAiPanelOpen
  };
}
