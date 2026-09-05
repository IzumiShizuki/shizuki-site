import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const source = readFileSync(resolve(process.cwd(), 'src/components/lightapps/LightAppRailEditor.vue'), 'utf8');

describe('LightAppRailEditor background-derived surface contract', () => {
  it('uses shared semantic roles for the rail and nested neutral surfaces', () => {
    expect(source).toContain('--liquid-bg: var(--theme-panel-surface);');
    expect(source).toContain('--liquid-border: var(--theme-border);');
    expect(source).toContain('--liquid-shadow: var(--theme-shadow-soft);');
    expect(source).toContain('background: var(--theme-panel-surface-elevated);');
    expect(source).toContain('background: var(--theme-surface-soft);');
    expect(source).toContain('background: var(--theme-input-surface);');
    expect(source).toContain('color: var(--theme-text-primary);');
    expect(source).toContain('color: var(--theme-text-secondary);');
  });

  it('uses semantic accent and keyboard focus roles without a day-only palette', () => {
    expect(source).toContain('background: var(--accent-mode-fill-soft);');
    expect(source).toContain('border-color: var(--accent-mode-border);');
    expect(source).toContain('box-shadow: var(--accent-mode-focus-ring);');
    expect(source).toContain(':focus-visible');
    expect(source).not.toContain(":root[data-theme-mode='day'] .rail-editor");
  });

  it('does not retain fixed black, white, or blue-gray neutral fills', () => {
    expect(source).not.toMatch(/rgba\(\s*(?:0\s*,\s*0\s*,\s*0|255\s*,\s*255\s*,\s*255|13\s*,\s*20\s*,\s*33)\s*,/);
  });
});
