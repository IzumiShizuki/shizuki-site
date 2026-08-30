import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

describe('AdminSiteWidgetsPanel contract', () => {
  const source = readFileSync(resolve(process.cwd(), 'src/components/admin/AdminSiteWidgetsPanel.vue'), 'utf8');

  it('edits versioned site location, timezone, weather and quote source settings', () => {
    expect(source).toContain('saveAdminWidgetConfiguration');
    expect(source).toContain('siteForm.latitude');
    expect(source).toContain('siteForm.longitude');
    expect(source).toContain('siteForm.timezone');
    expect(source).toContain('weatherMaxStaleMinutes');
    expect(source).toContain('quoteSourceMode');
  });

  it('shows safe fresh, last-good and unavailable weather states without visitor coordinates', () => {
    expect(source).toContain('getAdminSiteWeather');
    expect(source).toContain('last-good');
    expect(source).toContain('provider 内部异常与访客位置不会进入界面');
    expect(source).toContain('不提交、不保存、不显示任何访客定位坐标');
  });

  it('updates only the recommended playlist profile and keeps tracks untouched', () => {
    expect(source).toContain('updateAdminDefaultPlaylistProfile');
    expect(source).not.toContain('replaceAdminDefaultPlaylistBundle');
    expect(source).toContain('不替换、不清空现有曲目');
  });

  it('uses a responsive three-column glass layout', () => {
    expect(source).toContain('grid-template-columns:minmax(270px,1fr)');
    expect(source).toContain('backdrop-filter: blur(20px)');
    expect(source).toContain('@media (prefers-reduced-motion:reduce)');
  });
});
