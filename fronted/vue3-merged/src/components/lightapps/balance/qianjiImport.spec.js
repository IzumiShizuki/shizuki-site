import { describe, expect, it } from 'vitest';
import { parseQianjiCsvText, parseQianjiJsonText } from './qianjiImport';

describe('qianjiImport', () => {
  it('parses csv rows with income and expense columns', () => {
    const csv = [
      '日期,时间,收入,支出,一级分类,二级分类,账户1,商家,备注',
      '2026-07-01,08:30:00,5000,,收入,工资,招商银行卡,示例公司,7月工资',
      '2026-07-01,12:10:00,,26.80,餐饮,午餐,微信零钱,测试商户,工作餐',
      '2026-07-01,18:00:00,,88.00,转账,朋友往来,现金,,借给朋友'
    ].join('\n');

    const parsed = parseQianjiCsvText(csv);

    expect(parsed.importedCount).toBe(2);
    expect(parsed.skippedCount).toBe(1);
    expect(parsed.transactions).toHaveLength(2);
    expect(parsed.transactions[0]).toMatchObject({
      direction: 'INCOME',
      amount: '5000.00',
      categoryHint: '工资'
    });
    expect(parsed.transactions[1]).toMatchObject({
      direction: 'EXPENSE',
      amount: '26.80',
      counterparty: '测试商户'
    });
    expect(parsed.warnings[0]).toContain('当前不会导入');
  });

  it('parses json records with direct type and amount fields', () => {
    const json = JSON.stringify({
      data: {
        bills: [
          {
            日期: '2026-07-02',
            时间: '09:30:12',
            类型: '收入',
            金额: '128.50',
            分类: '红包',
            备注: '朋友转账'
          },
          {
            日期: '2026-07-02',
            时间: '10:00:00',
            类型: '报销',
            金额: '35.00',
            分类: '交通'
          }
        ]
      }
    });

    const parsed = parseQianjiJsonText(json);

    expect(parsed.importedCount).toBe(1);
    expect(parsed.skippedCount).toBe(1);
    expect(parsed.transactions).toHaveLength(1);
    expect(parsed.transactions[0]).toMatchObject({
      direction: 'INCOME',
      amount: '128.50',
      categoryHint: '红包'
    });
  });
});
