const BUILTIN_BASE_COLORS = Object.freeze({
  ADMIN: '#EF476F',
  USER: '#06D6A0',
  GUEST: '#8D99AE',
  FRIEND: '#118AB2',
  INTERVIEWER: '#FFD166'
});

function normalizeGroupCode(groupCode) {
  return String(groupCode || '').trim().toUpperCase();
}

function hashCode(input) {
  let hash = 0;
  for (let i = 0; i < input.length; i += 1) {
    hash = (hash << 5) - hash + input.charCodeAt(i);
    hash |= 0;
  }
  return Math.abs(hash);
}

function hexToRgb(hex) {
  const normalized = String(hex || '').trim().replace('#', '');
  if (!/^[0-9a-fA-F]{6}$/.test(normalized)) {
    return { r: 160, g: 176, b: 205 };
  }
  return {
    r: Number.parseInt(normalized.slice(0, 2), 16),
    g: Number.parseInt(normalized.slice(2, 4), 16),
    b: Number.parseInt(normalized.slice(4, 6), 16)
  };
}

function toHexPair(value) {
  const clamped = Math.max(0, Math.min(255, Number(value) || 0));
  return clamped.toString(16).padStart(2, '0');
}

function rgbToHex(rgb) {
  return `#${toHexPair(rgb.r)}${toHexPair(rgb.g)}${toHexPair(rgb.b)}`;
}

function hslToRgb(h, s, l) {
  const hue = ((Number(h) % 360) + 360) % 360;
  const sat = Math.max(0, Math.min(100, Number(s))) / 100;
  const light = Math.max(0, Math.min(100, Number(l))) / 100;

  if (sat === 0) {
    const value = Math.round(light * 255);
    return { r: value, g: value, b: value };
  }

  const q = light < 0.5 ? light * (1 + sat) : light + sat - light * sat;
  const p = 2 * light - q;

  const hueToChannel = (t) => {
    let value = t;
    if (value < 0) value += 1;
    if (value > 1) value -= 1;
    if (value < 1 / 6) return p + (q - p) * 6 * value;
    if (value < 1 / 2) return q;
    if (value < 2 / 3) return p + (q - p) * (2 / 3 - value) * 6;
    return p;
  };

  const hNorm = hue / 360;
  return {
    r: Math.round(hueToChannel(hNorm + 1 / 3) * 255),
    g: Math.round(hueToChannel(hNorm) * 255),
    b: Math.round(hueToChannel(hNorm - 1 / 3) * 255)
  };
}

function resolveBaseColor(groupCode) {
  const normalized = normalizeGroupCode(groupCode);
  if (!normalized) {
    return '#8D99AE';
  }
  if (BUILTIN_BASE_COLORS[normalized]) {
    return BUILTIN_BASE_COLORS[normalized];
  }

  const hash = hashCode(normalized);
  const hue = hash % 360;
  const saturation = 70;
  const lightness = 56;
  return rgbToHex(hslToRgb(hue, saturation, lightness));
}

export function getGroupBadgePalette(groupCode) {
  const base = resolveBaseColor(groupCode);
  const { r, g, b } = hexToRgb(base);
  return {
    base,
    border: `rgba(${r}, ${g}, ${b}, 0.74)`,
    background: `rgba(${r}, ${g}, ${b}, 0.24)`,
    text: `rgb(${Math.min(255, r + 20)}, ${Math.min(255, g + 20)}, ${Math.min(255, b + 20)})`
  };
}

export function getGroupBadgeStyle(groupCode) {
  const palette = getGroupBadgePalette(groupCode);
  return {
    '--group-badge-bg': palette.background,
    '--group-badge-border': palette.border,
    '--group-badge-text': palette.text
  };
}

export function getBuiltinGroupColorMap() {
  return { ...BUILTIN_BASE_COLORS };
}
