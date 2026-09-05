import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const pageSource = readFileSync(resolve(process.cwd(), 'src/pages/MusicLibraryPage.vue'), 'utf8');
const replicaSource = readFileSync(resolve(process.cwd(), 'src/styles/music-replica.css'), 'utf8');
const globalSource = readFileSync(resolve(process.cwd(), 'src/styles/global.css'), 'utf8');

describe('Music Library background-derived surface contract', () => {
  it('does not shadow shared neutral theme tokens at the route boundary', () => {
    expect(pageSource).not.toMatch(
      /--theme-(?:text-primary|text-secondary|text-tertiary|icon-primary|panel-surface|panel-surface-elevated|surface-soft|surface-strong|border|border-strong)\s*:/
    );
    expect(pageSource).not.toContain(":root[data-theme-mode='day'] .music-library-page");
  });

  it('maps music workspace aliases to shared semantic roles', () => {
    expect(replicaSource).toContain('--music-soft-text: var(--theme-text-primary);');
    expect(replicaSource).toContain('--music-soft-text-muted: var(--theme-text-secondary);');
    expect(replicaSource).toContain('--music-soft-text-dim: var(--theme-text-tertiary);');
    expect(replicaSource).toContain('--music-soft-fill: var(--theme-panel-surface-elevated);');
    expect(replicaSource).toContain('--music-soft-fill-hover: var(--theme-floating-surface-hover);');
    expect(replicaSource).toContain('--music-soft-border: var(--theme-border);');
    expect(replicaSource).toContain('--music-soft-shadow: var(--theme-shadow-soft);');
    expect(replicaSource).toContain('--music-active-fill: var(--accent-mode-fill);');
    expect(replicaSource).toContain('color: var(--theme-text-primary);');
    expect(globalSource).toContain('box-shadow: var(--theme-shadow-soft,');
    expect(globalSource).not.toContain(":root[data-theme-mode='day'] .music-library-page :is(\n  .music-left-sidebar,");
  });
});
