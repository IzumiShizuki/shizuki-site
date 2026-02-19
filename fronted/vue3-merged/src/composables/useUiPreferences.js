import { reactive } from 'vue';

const STORAGE_KEY = 'shizuki.uiPreferences.v1';
const LEGACY_PLAYER_STORAGE_KEY = 'shizuki.musicPlayer.v1';
const DEFAULT_ACCENT_HEX = '#C8B4FF';

const ACCENT_PRESETS = [
  { name: '淡紫', hex: '#C8B4FF' },
  { name: '玫瑰粉', hex: '#F5A4D6' },
  { name: '薄荷青', hex: '#8FDCC8' },
  { name: '天空蓝', hex: '#9EC8FF' },
  { name: '暖橙', hex: '#FFBF8A' }
];

const state = reactive({
  accentHex: DEFAULT_ACCENT_HEX,
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

function hexToRgbTuple(hex) {
  const normalized = normalizeHex(hex);
  if (!normalized) return null;
  return [
    Number.parseInt(normalized.slice(1, 3), 16),
    Number.parseInt(normalized.slice(3, 5), 16),
    Number.parseInt(normalized.slice(5, 7), 16)
  ];
}

function applyAccentVariables(hex) {
  if (typeof document === 'undefined') return;
  const tuple = hexToRgbTuple(hex) || hexToRgbTuple(DEFAULT_ACCENT_HEX);
  if (!tuple) return;

  const [r, g, b] = tuple;
  const strong = [clamp(r * 0.86), clamp(g * 0.84), clamp(b * 0.92)];
  const soft = [clamp(r + (255 - r) * 0.42), clamp(g + (255 - g) * 0.42), clamp(b + (255 - b) * 0.38)];

  const root = document.documentElement;
  root.style.setProperty('--accent-hex', normalizeHex(hex) || DEFAULT_ACCENT_HEX);
  root.style.setProperty('--accent-rgb', `${r}, ${g}, ${b}`);
  root.style.setProperty('--accent-strong-rgb', `${strong[0]}, ${strong[1]}, ${strong[2]}`);
  root.style.setProperty('--accent-soft-rgb', `${soft[0]}, ${soft[1]}, ${soft[2]}`);
}

function persist() {
  if (typeof window === 'undefined') return;
  try {
    window.localStorage.setItem(
      STORAGE_KEY,
      JSON.stringify({
        accentHex: state.accentHex,
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

  applyAccentVariables(state.accentHex);
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
  applyAccentVariables(normalized);
  persist();

  return {
    ok: true,
    normalized
  };
}

function resetAccent() {
  state.accentHex = DEFAULT_ACCENT_HEX;
  applyAccentVariables(state.accentHex);
  persist();
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
    initializeUiPreferences,
    setAccentHex,
    resetAccent,
    setGlobalBackgroundId,
    setRouteBackground,
    clearRouteBackground,
    getEffectiveBackgroundId,
    setAiPanelOpen
  };
}
