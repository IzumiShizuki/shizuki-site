import { reactive } from 'vue';

const STORAGE_KEY = 'shizuki.uiPreferences.v1';
const LEGACY_PLAYER_STORAGE_KEY = 'shizuki.musicPlayer.v1';
const DEFAULT_ACCENT_HEX = '#C8B4FF';
const DEFAULT_ACCENT_MODE = 'solid';
const DEFAULT_GRADIENT_PRESET_ID = 'berry';

const ACCENT_PRESETS = [
  { name: '淡紫', hex: '#C8B4FF' },
  { name: '玫瑰粉', hex: '#F5A4D6' },
  { name: '薄荷青', hex: '#8FDCC8' },
  { name: '天空蓝', hex: '#9EC8FF' },
  { name: '暖橙', hex: '#FFBF8A' }
];

const GRADIENT_PRESETS = [
  { id: 'berry', name: '莓果粉紫', startHex: '#E94BC5', endHex: '#9D6BFF' },
  { id: 'rose', name: '蔷薇奶霓', startHex: '#FF6BAA', endHex: '#C36BFF' },
  { id: 'mint', name: '薄荷霓虹', startHex: '#58D4C5', endHex: '#7A8CFF' },
  { id: 'sunset', name: '晚霞粉橙', startHex: '#FF7A8A', endHex: '#FFB168' }
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
  globalBackgroundId: '',
  routeBackgroundByKey: {},
  aiPanelOpen: false
});

let initialized = false;

function clamp(value) {
  return Math.max(0, Math.min(255, Math.round(value)));
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

function applyAccentVariables() {
  if (typeof document === 'undefined') return;
  const tuple = hexToRgbTuple(state.accentHex) || hexToRgbTuple(DEFAULT_ACCENT_HEX);
  if (!tuple) return;

  const [r, g, b] = tuple;
  const strong = [clamp(r * 0.86), clamp(g * 0.84), clamp(b * 0.92)];
  const soft = [clamp(r + (255 - r) * 0.42), clamp(g + (255 - g) * 0.42), clamp(b + (255 - b) * 0.38)];
  const gradientStart = hexToRgbTuple(state.accentGradientStartHex) || [233, 75, 197];
  const gradientEnd = hexToRgbTuple(state.accentGradientEndHex) || [157, 107, 255];

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
  root.style.setProperty(
    '--accent-mode-fill',
    state.accentMode === 'gradient' ? 'var(--accent-gradient)' : `rgba(${r}, ${g}, ${b}, 0.24)`
  );
  root.style.setProperty(
    '--accent-mode-fill-strong',
    state.accentMode === 'gradient' ? 'var(--accent-gradient)' : `rgba(${r}, ${g}, ${b}, 0.3)`
  );
  root.style.setProperty(
    '--accent-mode-border',
    state.accentMode === 'gradient'
      ? `rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.66)`
      : `rgba(${r}, ${g}, ${b}, 0.42)`
  );
  root.style.setProperty(
    '--accent-mode-shadow',
    state.accentMode === 'gradient'
      ? `0 10px 22px rgba(${gradientEnd[0]}, ${gradientEnd[1]}, ${gradientEnd[2]}, 0.28)`
      : `0 10px 22px rgba(${r}, ${g}, ${b}, 0.24)`
  );
  root.style.setProperty('--accent-mode-text', 'rgba(255, 255, 255, 0.96)');
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
          if (typeof payload.globalBackgroundId === 'string') state.globalBackgroundId = payload.globalBackgroundId;
          if (payload.routeBackgroundByKey && typeof payload.routeBackgroundByKey === 'object') {
            state.routeBackgroundByKey = { ...payload.routeBackgroundByKey };
          }
          state.aiPanelOpen = Boolean(payload.aiPanelOpen);
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
  applyAccentVariables();
  persist();

  return {
    ok: true,
    normalized
  };
}

function resetAccent() {
  state.accentHex = DEFAULT_ACCENT_HEX;
  applyAccentVariables();
  persist();
}

function setAccentMode(modeInput) {
  state.accentMode = normalizeAccentMode(modeInput);
  applyAccentVariables();
  persist();
  return state.accentMode;
}

function setAccentGradientPreset(presetId) {
  const preset = resolveGradientPreset(presetId);
  state.accentGradientId = preset.id;
  state.accentGradientStartHex = preset.startHex;
  state.accentGradientEndHex = preset.endHex;
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
