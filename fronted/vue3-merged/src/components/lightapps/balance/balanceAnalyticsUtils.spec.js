import { describe, expect, it } from 'vitest';
import {
  buildLedgerRangeQuery,
  buildLocalBalanceAnalytics,
  normalizeLedgerFilter,
  resolvePresetRange
} from './balanceAnalyticsUtils';

describe('balanceAnalyticsUtils', () => {
  it('resolves quick presets to stable date ranges', () => {
    const now = new Date('2026-02-20T08:00:00');
    expect(resolvePresetRange('7d', now)).toEqual({
      fromDate: '2026-02-14',
      toDate: '2026-02-20'
    });
    expect(resolvePresetRange('30d', now)).toEqual({
      fromDate: '2026-01-22',
      toDate: '2026-02-20'
    });
    expect(resolvePresetRange('month', now)).toEqual({
      fromDate: '2026-02-01',
      toDate: '2026-02-20'
    });
  });

  it('normalizes filter and builds datetime boundaries', () => {
    const now = new Date('2026-03-12T08:00:00');
    const normalized = normalizeLedgerFilter(
      {
        preset: 'custom',
        fromDate: '2026-01-10',
        toDate: '2026-02-20',
        channelCode: 'ALIPAY',
        direction: 'expense'
      },
      now
    );
    expect(normalized.channelCode).toBe('alipay');
    expect(normalized.direction).toBe('EXPENSE');

    expect(buildLedgerRangeQuery(normalized)).toEqual({
      fromDatetime: '2026-01-10T00:00:00',
      toDatetime: '2026-02-20T23:59:59',
      timeZone: 'Asia/Shanghai'
    });
  });

  it('aggregates local analytics with channel and date filter', () => {
    const analytics = buildLocalBalanceAnalytics({
      baseCurrency: 'CNY',
      fromDatetime: '2026-01-10T00:00:00',
      toDatetime: '2026-01-12T23:59:59',
      channelCode: 'alipay',
      accounts: [
        { accountId: 1, channelCode: 'alipay', channelName: '支付宝', currencyCode: 'CNY', balanceAmount: 1000 },
        { accountId: 2, channelCode: 'wechat', channelName: '微信', currencyCode: 'CNY', balanceAmount: 300 }
      ],
      transactions: [
        { transactionId: 1, accountId: 1, direction: 'EXPENSE', amount: 120, currencyCode: 'CNY', occurredAt: '2026-01-10T08:30:00' },
        { transactionId: 2, accountId: 1, direction: 'INCOME', amount: 300, currencyCode: 'CNY', occurredAt: '2026-01-11T10:00:00' },
        { transactionId: 3, accountId: 2, direction: 'EXPENSE', amount: 90, currencyCode: 'CNY', occurredAt: '2026-01-11T12:00:00' }
      ],
      debts: [
        { debtId: 1, amount: 200, currencyCode: 'CNY', status: 'OPEN' }
      ],
      fxRates: []
    });

    expect(analytics.summary.incomeTotal).toBe(300);
    expect(analytics.summary.expenseTotal).toBe(120);
    expect(analytics.summary.txCount).toBe(2);
    expect(analytics.channelBreakdown).toHaveLength(1);
    expect(analytics.channelBreakdown[0].channelCode).toBe('alipay');
    expect(analytics.dailyTrend.find((item) => item.day === '2026-01-12')?.incomeTotal).toBe(0);
    expect(analytics.assetSnapshot.netAsset).toBe(1100);
  });
});

