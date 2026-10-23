import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';
import { PALETTE_STYLES, resolveM3DynamicPalette, roleNameToCssVariable } from '../utils/m3DynamicPalette';

const theme = readFileSync(resolve(process.cwd(), 'src/styles/theme.css'), 'utf8');
const definitions = Object.fromEntries(
  [...theme.matchAll(/(--menu-[\w-]+):\s*var\((--m3-[\w-]+),\s*(#[\da-f]{6})\)/gi)]
    .map(([, token, role]) => [token, role])
);
const pairs = [
  ['--menu-ink', '--menu-surface', 4.5],
  ['--menu-ink', '--menu-surface-raised', 4.5],
  ['--menu-ink-muted', '--menu-surface', 4.5],
  ['--menu-ink-muted', '--menu-surface-raised', 4.5],
  ['--menu-on-selected', '--menu-selected-bg', 4.5],
  ['--menu-on-action', '--menu-action-bg', 4.5],
  ['--menu-focus', '--menu-surface', 3],
  ['--menu-focus', '--menu-surface-raised', 3]
];

function luminance(hex) {
  const linear = hex.slice(1).match(/../g).map(channel => {
    const value = Number.parseInt(channel, 16) / 255;
    return value <= 0.04045 ? value / 12.92 : ((value + 0.055) / 1.055) ** 2.4;
  });
  return linear[0] * 0.2126 + linear[1] * 0.7152 + linear[2] * 0.0722;
}

function contrast(a, b) {
  const l = [luminance(a), luminance(b)].sort((x, y) => y - x);
  return (l[0] + 0.05) / (l[1] + 0.05);
}

describe('menu color contrast contract', () => {
  const seeds = ['#F2B39D', '#FFBF8A', '#F5A4D6', '#C8B4FF', '#8FDCC8', '#9EC8FF',
    '#FFFFFF', '#000000', '#FFFF00', '#0000FF', '#FF0000', '#00FF00', '#777777'];
  const gradients = [['#FFFFFF', '#000000'], ['#000000', '#FFFFFF'], ['#0000FF', '#FFFF00'],
    ['#F6C2A1', '#EFA0A8'], ['#A78BFA', '#4F46E5'], ['#58D4C5', '#7A8CFF']];

  for (const { id: paletteStyle } of PALETTE_STYLES) {
    for (const isDark of [false, true]) {
      it(`keeps enabled text and focus visible for ${paletteStyle}/${isDark ? 'night' : 'day'}`, () => {
        const cases = [
          ...seeds.map(primaryHex => ({ primaryHex, accentMode: 'solid' })),
          ...gradients.map(([primaryHex, companionHex]) => ({ primaryHex, companionHex, accentMode: 'gradient' }))
        ];
        for (const colors of cases) {
          const { roles } = resolveM3DynamicPalette({ ...colors, paletteStyle, isDark });
          const css = Object.fromEntries(Object.entries(roles).map(([key, value]) => [roleNameToCssVariable(key), value]));
          for (const [foreground, background, minimum] of pairs) {
            const ink = css[definitions[foreground]];
            const surface = css[definitions[background]];
            expect(ink, foreground).toMatch(/^#[\da-f]{6}$/i);
            expect(surface, background).toMatch(/^#[\da-f]{6}$/i);
            expect(contrast(ink, surface), `${JSON.stringify(colors)} ${foreground}/${background}: ${ink}/${surface}`)
              .toBeGreaterThanOrEqual(minimum);
          }
        }
      });
    }
  }

  it('provides readable paired fallbacks before JavaScript initializes', () => {
    const blocks = [theme.split('/* ============================================================')[0],
      theme.split(":root[data-theme-mode='day'] {")[1].split('}')[0]];
    for (const block of blocks) {
      const fallbacks = Object.fromEntries([...block.matchAll(/(--menu-[\w-]+):\s*var\(--m3-[\w-]+,\s*(#[\da-f]{6})\)/gi)]
        .map(([, name, value]) => [name, value]));
      for (const [foreground, background, minimum] of pairs) {
        expect(contrast(fallbacks[foreground], fallbacks[background]), `${foreground}/${background}`)
          .toBeGreaterThanOrEqual(minimum);
      }
    }
  });
});
