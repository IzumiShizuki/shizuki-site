import { describe, expect, it } from 'vitest';
import { createQuoteEditor, filterAdminQuotes, quoteStatusPresentation } from './adminDailyQuoteState';

describe('adminDailyQuoteState', () => {
  it('starts new entries as local disabled drafts', () => {
    expect(createQuoteEditor()).toMatchObject({
      id: null, providerCode: 'LOCAL', approvalStatus: 'DRAFT', enabled: false
    });
  });

  it('labels stale snapshots as last-good without pretending they are current', () => {
    expect(quoteStatusPresentation({ state: 'stale' })).toMatchObject({
      tone: 'stale', label: '正在使用 last-good'
    });
  });

  it('filters the local featured set independently from approval', () => {
    const quotes = [
      { id: 1, approvalStatus: 'APPROVED', enabled: true },
      { id: 2, approvalStatus: 'APPROVED', enabled: false },
      { id: 3, approvalStatus: 'DRAFT', enabled: false }
    ];
    expect(filterAdminQuotes(quotes, 'FEATURED').map((quote) => quote.id)).toEqual([1]);
    expect(filterAdminQuotes(quotes, 'APPROVED').map((quote) => quote.id)).toEqual([1, 2]);
  });
});
