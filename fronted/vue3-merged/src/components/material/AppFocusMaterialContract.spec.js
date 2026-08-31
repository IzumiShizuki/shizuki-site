import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

describe('App Focus material contract', () => {
  it('removes full, collapsed, Site and mobile navigation from rendering and keyboard order while Focus is active', () => {
    const appSource = readFileSync(resolve(process.cwd(), 'src/App.vue'), 'utf8');
    const menuSource = readFileSync(resolve(process.cwd(), 'src/components/TopMenu.vue'), 'utf8');
    const topMenuStart = appSource.indexOf('<TopMenu');
    const topMenuEnd = appSource.indexOf('/>', topMenuStart);
    const topMenuMarkup = appSource.slice(topMenuStart, topMenuEnd);

    expect(topMenuMarkup).toContain(
      'v-if="!isMobileShellRoute && !isFocusActive && !isDesktopManagedSurface"',
    );
    expect(topMenuMarkup).not.toContain('v-show');
    expect(menuSource).not.toContain('class="compact-dock"');
    expect(menuSource).toContain('class="toggle-tab liquid-material ripple-trigger"');
    expect(menuSource).toContain('class="mobile-top-dock"');
    expect(menuSource).toContain('<SiteMenuPopover');
  });
});
