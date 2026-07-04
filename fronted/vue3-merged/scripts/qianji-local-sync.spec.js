import fs from 'node:fs/promises';
import os from 'node:os';
import path from 'node:path';
import { describe, expect, it } from 'vitest';
import {
  buildLocalAccountPlan,
  groupParsedTransactionsByAccount,
  inferChannelFromAccountName,
  normalizeSyncConfig,
  syncQianjiFile,
  stripJsonComments
} from './qianji-local-sync-lib.mjs';

describe('qianji-local-sync-lib', () => {
  it('strips jsonc comments without touching string content', () => {
    const jsonc = `{
      // line comment
      "apiBaseUrl": "http://example.com",
      "watchDir": "D:/exports//qianji",
      /* block comment */
      "groupByAccount": true
    }`;

    const stripped = stripJsonComments(jsonc);

    expect(stripped).toContain('"apiBaseUrl"');
    expect(stripped).toContain('"watchDir": "D:/exports//qianji"');
    expect(stripped).not.toContain('line comment');
    expect(stripped).not.toContain('block comment');
  });

  it('treats placeholder passwords as missing credentials', () => {
    expect(() => normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        email: 'user@example.com',
        password: 'CHANGE_ME',
        watchDir: './exports'
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    )).toThrow('config.accessToken or config.email + config.password is required');
  });

  it('groups parsed transactions by qianji source account', () => {
    const config = normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        accessToken: 'token',
        watchDir: './exports',
        groupByAccount: true
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    );

    const groups = groupParsedTransactionsByAccount(
      {
        transactions: [
          {
            occurredAt: '2026-07-01T08:00:00',
            direction: 'INCOME',
            amount: '5000.00',
            currencyCode: 'CNY',
            rawPayload: JSON.stringify({
              账户1: '招商银行卡',
              账本: '默认账本'
            })
          },
          {
            occurredAt: '2026-07-01T09:15:00',
            direction: 'EXPENSE',
            amount: '12.50',
            currencyCode: 'CNY',
            rawPayload: JSON.stringify({
              账户1: '微信零钱'
            })
          }
        ]
      },
      config
    );

    expect(groups).toHaveLength(2);
    expect(groups[0].sourceAccountName).toBe('微信零钱');
    expect(groups[1].sourceAccountName).toBe('招商银行卡');
  });

  it('builds local account plans from mapping and channel inference', () => {
    const config = normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        accessToken: 'token',
        watchDir: './exports',
        accountMappings: {
          招商银行卡: {
            accountName: '工资卡',
            channelCode: 'bank_card',
            channelName: '银行卡'
          }
        }
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    );

    const mappedPlan = buildLocalAccountPlan(
      {
        sourceAccountName: '招商银行卡',
        sourceBookNames: ['默认账本'],
        currencyCode: 'CNY'
      },
      config
    );
    const inferredPlan = buildLocalAccountPlan(
      {
        sourceAccountName: '微信零钱',
        sourceBookNames: [],
        currencyCode: 'CNY'
      },
      config
    );

    expect(mappedPlan.accountName).toBe('工资卡');
    expect(mappedPlan.channelCode).toBe('bank_card');
    expect(inferredPlan.channelCode).toBe('wechat');
    expect(inferChannelFromAccountName('支付宝余额').channelCode).toBe('alipay');
  });

  it('does not touch the remote api during dry-run', async () => {
    const tempDir = await fs.mkdtemp(path.join(os.tmpdir(), 'qianji-sync-'));
    const filePath = path.join(tempDir, 'demo.csv');
    await fs.writeFile(
      filePath,
      ['日期,时间,收入,支出,分类,二级分类,账户1,商家,备注', '2026-07-01,08:30:00,5000,,收入,工资,招商银行卡,示例公司,7月工资'].join('\n'),
      'utf8'
    );

    const config = normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        accessToken: 'token',
        watchDir: tempDir,
        dryRun: true
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    );

    const result = await syncQianjiFile(
      {
        filePath,
        fileKey: filePath,
        fingerprint: {
          size: 1,
          mtimeMs: 1,
          sha256: 'demo'
        }
      },
      config,
      {
        listBalanceAccounts() {
          throw new Error('dry-run should not list remote accounts');
        }
      },
      { files: {} },
      {
        info() {},
        warn() {}
      }
    );

    expect(result.processed).toBe(true);
    expect(result.groups).toBeGreaterThanOrEqual(0);
  });
});
