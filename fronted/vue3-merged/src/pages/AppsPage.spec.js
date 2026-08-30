import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

const source = readFileSync(resolve(process.cwd(), 'src/pages/AppsPage.vue'), 'utf8');

describe('AppsPage light-app presentation contract', () => {
  it('delegates 页面打开 to the shared fullscreen shell', () => {
    expect(source).toContain("openLightAppShellWindow(code, { source: 'apps_page', fullscreen: true })");
  });

  it('does not mount a second page-mode application instance', () => {
    expect(source).not.toContain('PAGE_COMPONENT_MAP');
    expect(source).not.toContain('page-mode-overlay');
    expect(source).not.toContain('<Teleport to="body">');
    expect(source).not.toContain('resolveLightAppPageModeWindowId');
  });
});
