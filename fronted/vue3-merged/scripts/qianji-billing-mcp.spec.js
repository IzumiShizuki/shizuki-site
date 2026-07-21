import { describe, expect, it, vi } from 'vitest';
import { createToolHandler, sanitizeTransaction } from '../../../tools/qianji-sync/qianji-billing-mcp.mjs';

describe('qianji billing MCP', () => {
  it('returns a privacy-minimized transaction by default', () => {
    expect(sanitizeTransaction({
      transactionId: 7, occurredAt: '2026-07-20T10:00:00+08:00', direction: 'EXPENSE', amount: 12.5,
      currencyCode: 'CNY', note: 'private note', rawPayload: '{"private":true}'
    })).toEqual(expect.objectContaining({ transaction_id: 7, amount: 12.5 }));
    expect(sanitizeTransaction({ note: 'private note', rawPayload: 'raw' })).not.toHaveProperty('note');
    expect(sanitizeTransaction({ note: 'private note', rawPayload: 'raw' }, { includeNote: true, includeRawPayload: true }))
      .toMatchObject({ note: 'private note', raw_payload: 'raw' });
  });

  it('requires a bounded date range and caps returned transactions', async () => {
    const client = { listBalanceTransactions: vi.fn().mockResolvedValue(Array.from({ length: 110 }, (_, index) => ({ transactionId: index }))) };
    const handler = createToolHandler(client);
    await expect(handler('shizuki_billing_transactions', {})).rejects.toThrow('required');
    const result = await handler('shizuki_billing_transactions', {
      from_datetime: '2026-07-20T00:00:00+08:00', to_datetime: '2026-07-20T23:59:59+08:00', limit: 999, direction: 'expense'
    });
    expect(client.listBalanceTransactions).toHaveBeenCalledWith(expect.objectContaining({ direction: 'EXPENSE' }));
    expect(result).toMatchObject({ returned_count: 100, truncated: true });
    expect(result.transactions).toHaveLength(100);
  });
});
