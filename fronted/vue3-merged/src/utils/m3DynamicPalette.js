import {
  Hct,
  SchemeContent,
  SchemeExpressive,
  SchemeTonalSpot,
  SchemeVibrant,
  argbFromHex,
  hexFromArgb
} from '@material/material-color-utilities';

export const DEFAULT_PALETTE_STYLE = 'soft';

export const PALETTE_STYLES = Object.freeze([
  {
    id: 'soft',
    label: '柔和陪伴',
    description: '温和的主色与稳定表面，适合长时间阅读。'
  },
  {
    id: 'expressive',
    label: '灵动跳色',
    description: '让次色与第三色形成更有情绪的色相对比。'
  },
  {
    id: 'vibrant',
    label: '鲜明能量',
    description: '提高色彩存在感，让操作与重点更醒目。'
  },
  {
    id: 'content',
    label: '忠于原色',
    description: '尽量保留种子色气质，适合自定义配色。'
  }
]);

const PALETTE_STYLE_IDS = new Set(PALETTE_STYLES.map((item) => item.id));
const FALLBACK_SEED_HEX = '#F2B39D';

const ROLE_RESOLVERS = Object.freeze({
  primary: (colors) => colors.primary(),
  onPrimary: (colors) => colors.onPrimary(),
  primaryContainer: (colors) => colors.primaryContainer(),
  onPrimaryContainer: (colors) => colors.onPrimaryContainer(),
  inversePrimary: (colors) => colors.inversePrimary(),
  primaryFixed: (colors) => colors.primaryFixed(),
  primaryFixedDim: (colors) => colors.primaryFixedDim(),
  onPrimaryFixed: (colors) => colors.onPrimaryFixed(),
  secondary: (colors) => colors.secondary(),
  onSecondary: (colors) => colors.onSecondary(),
  secondaryContainer: (colors) => colors.secondaryContainer(),
  onSecondaryContainer: (colors) => colors.onSecondaryContainer(),
  secondaryFixed: (colors) => colors.secondaryFixed(),
  secondaryFixedDim: (colors) => colors.secondaryFixedDim(),
  tertiary: (colors) => colors.tertiary(),
  onTertiary: (colors) => colors.onTertiary(),
  tertiaryContainer: (colors) => colors.tertiaryContainer(),
  onTertiaryContainer: (colors) => colors.onTertiaryContainer(),
  tertiaryFixed: (colors) => colors.tertiaryFixed(),
  tertiaryFixedDim: (colors) => colors.tertiaryFixedDim(),
  error: (colors) => colors.error(),
  onError: (colors) => colors.onError(),
  errorContainer: (colors) => colors.errorContainer(),
  onErrorContainer: (colors) => colors.onErrorContainer(),
  surface: (colors) => colors.surface(),
  surfaceDim: (colors) => colors.surfaceDim(),
  surfaceBright: (colors) => colors.surfaceBright(),
  surfaceContainerLowest: (colors) => colors.surfaceContainerLowest(),
  surfaceContainerLow: (colors) => colors.surfaceContainerLow(),
  surfaceContainer: (colors) => colors.surfaceContainer(),
  surfaceContainerHigh: (colors) => colors.surfaceContainerHigh(),
  surfaceContainerHighest: (colors) => colors.surfaceContainerHighest(),
  onSurface: (colors) => colors.onSurface(),
  surfaceVariant: (colors) => colors.surfaceVariant(),
  onSurfaceVariant: (colors) => colors.onSurfaceVariant(),
  outline: (colors) => colors.outline(),
  outlineVariant: (colors) => colors.outlineVariant(),
  inverseSurface: (colors) => colors.inverseSurface(),
  inverseOnSurface: (colors) => colors.inverseOnSurface(),
  shadow: (colors) => colors.shadow(),
  scrim: (colors) => colors.scrim(),
  surfaceTint: (colors) => colors.surfaceTint()
});

const COMPANION_ROLE_NAMES = Object.freeze([
  'secondary',
  'onSecondary',
  'secondaryContainer',
  'onSecondaryContainer',
  'secondaryFixed',
  'secondaryFixedDim',
  'tertiary',
  'onTertiary',
  'tertiaryContainer',
  'onTertiaryContainer',
  'tertiaryFixed',
  'tertiaryFixedDim'
]);

export function normalizePaletteStyle(input) {
  const value = String(input || '').trim().toLowerCase();
  return PALETTE_STYLE_IDS.has(value) ? value : DEFAULT_PALETTE_STYLE;
}

function normalizeSeedHex(input) {
  const value = String(input || '').trim().toUpperCase();
  if (/^#[0-9A-F]{6}$/.test(value)) return value;
  if (/^#[0-9A-F]{3}$/.test(value)) {
    return `#${value
      .slice(1)
      .split('')
      .map((char) => `${char}${char}`)
      .join('')}`;
  }
  return FALLBACK_SEED_HEX;
}

function createScheme(seedHex, isDark, paletteStyle) {
  const source = Hct.fromInt(argbFromHex(seedHex));
  switch (paletteStyle) {
    case 'expressive':
      return new SchemeExpressive(source, isDark, 0, '2025');
    case 'vibrant':
      return new SchemeVibrant(source, isDark, 0, '2025');
    case 'content':
      return new SchemeContent(source, isDark, 0, '2025');
    case 'soft':
    default:
      return new SchemeTonalSpot(source, isDark, 0, '2025');
  }
}

function resolveRoles(scheme) {
  const roles = {};
  for (const [name, resolveColor] of Object.entries(ROLE_RESOLVERS)) {
    roles[name] = hexFromArgb(resolveColor(scheme.colors).getArgb(scheme)).toUpperCase();
  }
  return roles;
}

/**
 * Resolve the semantic color roles used by Shizuki's M3E bridge.
 * Gradient mode deliberately keeps the first seed for primary/surfaces and
 * takes secondary/tertiary families from a companion scheme built from the
 * second endpoint, so both visitor-selected colors stay visible.
 */
export function resolveM3DynamicPalette({
  primaryHex = FALLBACK_SEED_HEX,
  companionHex = primaryHex,
  accentMode = 'solid',
  isDark = true,
  paletteStyle = DEFAULT_PALETTE_STYLE
} = {}) {
  const normalizedPrimary = normalizeSeedHex(primaryHex);
  const normalizedCompanion = normalizeSeedHex(companionHex);
  const normalizedStyle = normalizePaletteStyle(paletteStyle);
  const dark = Boolean(isDark);
  const primaryScheme = createScheme(normalizedPrimary, dark, normalizedStyle);
  const roles = resolveRoles(primaryScheme);
  const usesCompanion = accentMode === 'gradient' && normalizedCompanion !== normalizedPrimary;

  if (usesCompanion) {
    const companionRoles = resolveRoles(createScheme(normalizedCompanion, dark, normalizedStyle));
    for (const name of COMPANION_ROLE_NAMES) {
      roles[name] = companionRoles[name];
    }
  }

  return {
    roles,
    style: normalizedStyle,
    isDark: dark,
    primarySeedHex: normalizedPrimary,
    companionSeedHex: usesCompanion ? normalizedCompanion : normalizedPrimary,
    usesCompanion
  };
}

export function roleNameToCssVariable(roleName) {
  const kebab = String(roleName || '').replace(/[A-Z]/g, (letter) => `-${letter.toLowerCase()}`);
  return kebab ? `--m3-${kebab}` : '';
}
