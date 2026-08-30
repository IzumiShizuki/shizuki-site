import { describe, expect, it, vi } from 'vitest';
import {
  createAdminQuote,
  getAdminSiteWeather,
  getAdminTodayQuote,
  listAdminQuotes,
  normalizeAdminQuote,
  refreshAdminDailyQuote,
  reviewAdminQuote,
  saveAdminWidgetConfiguration,
  updateAdminQuote
} from './adminSiteWidgetsApi';

describe('adminSiteWidgetsApi', () => {
  it('normalizes snake-case quote metadata and keeps the optimistic version', () => {
    expect(normalizeAdminQuote({
      id: 7,
      text: '山高水长',
      provider_code: 'local',
      approval_status: 'approved',
      enabled_flag: true,
      version_num: 4
    })).toMatchObject({
      id: 7,
      providerCode: 'LOCAL',
      approvalStatus: 'APPROVED',
      enabled: true,
      version: 4
    });
  });

  it('maps curation calls to the administrator contract', async () => {
    const authorizedFetch = vi.fn()
      .mockResolvedValueOnce({ data: [] })
      .mockResolvedValueOnce({ data: { id: 7, text: '新句子', providerCode: 'LOCAL', approvalStatus: 'DRAFT', version: 0 } })
      .mockResolvedValueOnce({ data: { id: 7, text: '修改', providerCode: 'LOCAL', approvalStatus: 'DRAFT', version: 1 } })
      .mockResolvedValueOnce({ data: { id: 7, text: '修改', providerCode: 'LOCAL', approvalStatus: 'APPROVED', enabled: true, version: 2 } });

    await listAdminQuotes({}, authorizedFetch);
    await createAdminQuote({ text: '新句子' }, authorizedFetch);
    await updateAdminQuote(7, 0, { text: '修改' }, authorizedFetch);
    await reviewAdminQuote(7, 1, 'APPROVED', true, authorizedFetch);

    expect(authorizedFetch).toHaveBeenNthCalledWith(3, '/api/v1/admin/site-widgets/quotes/7', expect.objectContaining({
      method: 'PUT', query: { expected_version: 0 }
    }));
    expect(authorizedFetch).toHaveBeenNthCalledWith(4, '/api/v1/admin/site-widgets/quotes/7/review', expect.objectContaining({
      method: 'PUT', body: { expectedVersion: 1, approvalStatus: 'APPROVED', enabled: true }
    }));
  });

  it('uses immutable refresh and visitor-safe status routes', async () => {
    const authorizedFetch = vi.fn()
      .mockResolvedValueOnce({ data: { state: 'stale', snapshot_id: 9, effective_date: '2026-08-28', text: '旧快照', provider_code: 'HITOKOTO' } })
      .mockResolvedValueOnce({ data: { id: 9 } });

    const status = await getAdminTodayQuote(authorizedFetch);
    await refreshAdminDailyQuote(authorizedFetch);

    expect(status).toMatchObject({ state: 'stale', effectiveDate: '2026-08-28' });
    expect(authorizedFetch).toHaveBeenNthCalledWith(1, '/api/v1/site/quote/today', { method: 'GET' });
    expect(authorizedFetch).toHaveBeenNthCalledWith(2, '/api/v1/admin/site-widgets/quote/refresh', { method: 'POST' });
  });

  it('saves bounded site settings and reads only the visitor-safe weather projection', async () => {
    const authorizedFetch = vi.fn()
      .mockResolvedValueOnce({ data: {
        version: 3, displayName: '上海', latitude: 31.23, longitude: 121.47,
        timezone: 'Asia/Shanghai', weatherEnabled: true, weatherMaxStaleMinutes: 360,
        quoteSourceMode: 'LOCAL', hitokotoEnabled: false
      } })
      .mockResolvedValueOnce({ data: {
        freshness: 'unavailable',
        attribution: { name: 'Open-Meteo', destination: 'https://open-meteo.com/' }
      } });

    await saveAdminWidgetConfiguration({
      version: 2, displayName: '上海', latitude: 31.23, longitude: 121.47,
      timezone: 'Asia/Shanghai', weatherEnabled: true, weatherMaxStaleMinutes: 360,
      quoteSourceMode: 'LOCAL', hitokotoEnabled: false
    }, authorizedFetch);
    const weather = await getAdminSiteWeather(authorizedFetch);

    expect(authorizedFetch).toHaveBeenNthCalledWith(1, '/api/v1/admin/site-widgets/configuration', expect.objectContaining({
      method: 'PUT', body: expect.objectContaining({ expectedVersion: 2, timezone: 'Asia/Shanghai' })
    }));
    expect(authorizedFetch).toHaveBeenNthCalledWith(2, '/api/v1/site/weather', { method: 'GET' });
    expect(weather).toMatchObject({ available: false, freshness: 'unavailable' });
  });
});
