import { readFileSync } from 'node:fs';
import { resolve } from 'node:path';
import { describe, expect, it } from 'vitest';

describe('AdminDailyQuotesPanel contract', () => {
  const source = readFileSync(resolve(process.cwd(), 'src/components/admin/AdminDailyQuotesPanel.vue'), 'utf8');

  it('connects quote creation, editing, review and the local featured switch', () => {
    expect(source).toContain('createAdminQuote');
    expect(source).toContain('updateAdminQuote');
    expect(source).toContain('reviewAdminQuote');
    expect(source).toContain('toggleFeatured');
    expect(source).toContain('本地精选');
  });

  it('shows canonical source, last-good state and immutable manual refresh semantics', () => {
    expect(source).toContain('getAdminWidgetConfiguration');
    expect(source).toContain('getAdminTodayQuote');
    expect(source).toContain('refreshAdminDailyQuote');
    expect(source).toContain('last-good');
    expect(source).toContain('不会重新抽取或覆盖');
  });

  it('uses a responsive three-column glass workspace', () => {
    expect(source).toContain('grid-template-columns: minmax(220px, .78fr)');
    expect(source).toContain('backdrop-filter: blur(20px)');
    expect(source).toContain('@media (prefers-reduced-motion: reduce)');
  });
});
