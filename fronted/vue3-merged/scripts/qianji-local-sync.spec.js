import fs from 'node:fs/promises';
import os from 'node:os';
import path from 'node:path';
import { describe, expect, it } from 'vitest';
import {
  buildLocalAccountPlan,
  createSiteApiClient,
  groupParsedTransactionsByAccount,
  inferChannelFromAccountName,
  normalizeSyncConfig,
  syncQianjiAuthTokens,
  syncQianjiFile,
  stripJsonComments
} from '../../../tools/qianji-sync/qianji-local-sync-lib.mjs';
import { buildDailyBillingDigest, previousLocalDate, writeDailyBillingDigest } from '../../../tools/qianji-sync/qianji-daily-billing-digest.mjs';

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

  it('normalizes placeholder passwords to empty strings', () => {
    const config = normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        email: 'user@example.com',
        password: 'CHANGE_ME',
        watchDir: './exports'
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    );

    expect(config.email).toBe('user@example.com');
    expect(config.password).toBe('');
  });

  it('accepts refresh token without password and assigns auth state file', () => {
    const config = normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        refreshToken: 'refresh-token-1',
        watchDir: './exports'
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    );

    expect(config.refreshToken).toBe('refresh-token-1');
    expect(config.authStateFile).toContain('.qianji-local-sync-auth.json');
  });

  it('accepts persisted auth state without inline credentials', () => {
    const config = normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        watchDir: './exports',
        authStateFile: './persisted-auth.json'
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    );

    expect(config.accessToken).toBe('');
    expect(config.refreshToken).toBe('');
    expect(config.authStateFile).toContain('persisted-auth.json');
    expect(config.dailyDigestFile).toContain('data');
    expect(config.dailyDigestFile).toContain('daily-billing-digest.json');
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

  it('refreshes qianji auth tokens and persists rotated state', async () => {
    const tempDir = await fs.mkdtemp(path.join(os.tmpdir(), 'qianji-token-'));
    const authStateFile = path.join(tempDir, 'auth.json');
    const config = normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        refreshToken: 'refresh-token-1',
        watchDir: tempDir,
        authStateFile
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    );

    const originalFetch = globalThis.fetch;
    globalThis.fetch = async () => new Response(
      JSON.stringify({
        data: {
          result_type: 'TOKEN_ISSUED',
          access_token: 'access-token-2',
          refresh_token: 'refresh-token-2',
          expires_in_sec: 1800,
          refresh_expires_in_sec: 604800
        }
      }),
      {
        status: 200,
        headers: { 'content-type': 'application/json' }
      }
    );

    try {
      const result = await syncQianjiAuthTokens(config, { mode: 'refresh' });
      const persisted = JSON.parse(await fs.readFile(authStateFile, 'utf8'));

      expect(result.accessToken).toBe('access-token-2');
      expect(result.refreshToken).toBe('refresh-token-2');
      expect(persisted.accessToken).toBe('access-token-2');
      expect(persisted.refreshToken).toBe('refresh-token-2');
    } finally {
      globalThis.fetch = originalFetch;
    }
  });

  it('uses refresh token to recover from 401 responses', async () => {
    const tempDir = await fs.mkdtemp(path.join(os.tmpdir(), 'qianji-client-'));
    const authStateFile = path.join(tempDir, 'auth.json');
    const config = normalizeSyncConfig(
      {
        apiBaseUrl: 'http://example.com',
        accessToken: 'expired-access',
        refreshToken: 'refresh-token-1',
        watchDir: tempDir,
        authStateFile
      },
      { baseDir: path.resolve('fronted/vue3-merged/scripts') }
    );

    const requests = [];
    const originalFetch = globalThis.fetch;
    globalThis.fetch = async (url, options = {}) => {
      requests.push({
        url: String(url),
        method: String(options.method || 'GET'),
        auth: options.headers?.Authorization || ''
      });

      if (String(url).endsWith('/api/v1/light-apps/balance/accounts') && options.headers?.Authorization === 'Bearer expired-access') {
        return new Response(JSON.stringify({ message: 'expired' }), {
          status: 401,
          headers: { 'content-type': 'application/json' }
        });
      }
      if (String(url).endsWith('/api/v1/auth/tokens')) {
        return new Response(
          JSON.stringify({
            data: {
              result_type: 'TOKEN_ISSUED',
              access_token: 'fresh-access',
              refresh_token: 'refresh-token-2'
            }
          }),
          {
            status: 200,
            headers: { 'content-type': 'application/json' }
          }
        );
      }
      if (String(url).endsWith('/api/v1/light-apps/balance/accounts') && options.headers?.Authorization === 'Bearer fresh-access') {
        return new Response(JSON.stringify({ data: [] }), {
          status: 200,
          headers: { 'content-type': 'application/json' }
        });
      }
      throw new Error(`Unexpected request: ${String(url)} ${options.headers?.Authorization || ''}`);
    };

    try {
      const client = createSiteApiClient(config);
      const accounts = await client.listBalanceAccounts();
      const persisted = JSON.parse(await fs.readFile(authStateFile, 'utf8'));

      expect(accounts).toEqual([]);
      expect(requests.map((item) => item.auth)).toEqual(['Bearer expired-access', '', 'Bearer fresh-access']);
      expect(persisted.accessToken).toBe('fresh-access');
      expect(persisted.refreshToken).toBe('refresh-token-2');
    } finally {
      globalThis.fetch = originalFetch;
    }
  });

  it('writes an aggregate-only daily digest after sync', async () => {
    const tempDir = await fs.mkdtemp(path.join(os.tmpdir(), 'qianji-digest-'));
    const digestFile = path.join(tempDir, 'daily-billing-digest.json');
    const now = new Date('2026-07-21T18:00:00.000Z');
    const digest = await writeDailyBillingDigest(
      { dailyDigestFile: digestFile, dailyDigestTimeZone: 'Asia/Shanghai' },
      {
        async getBalanceAnalytics() {
          return {
            base_currency: 'CNY',
            summary: { income_total: 1000, expense_total: 128.5, net_flow: 871.5, tx_count: 4 },
            asset_snapshot: { net_asset: 3000 },
            expense_category_breakdown: [{ category_name: '餐饮', amount_total: 80 }]
          };
        }
      },
      { processedFiles: 1, importedCount: 2, duplicateCount: 1, skippedCount: 0, groups: 1 },
      { now }
    );
    const persisted = JSON.parse(await fs.readFile(digestFile, 'utf8'));

    expect(previousLocalDate('Asia/Shanghai', now)).toBe('2026-07-21');
    expect(digest.target_date).toBe('2026-07-21');
    expect(persisted.analytics.expense_total).toBe(128.5);
    expect(persisted.analytics.top_expense_categories).toEqual([{ category: '餐饮', amount: 80 }]);
    expect(JSON.stringify(persisted)).not.toContain('accessToken');
  });

  it('builds deterministic digest fields from analytics data', () => {
    const digest = buildDailyBillingDigest({
      analytics: { summary: { income_total: 10, expense_total: 3, net_flow: 7, tx_count: 2 } },
      syncSummary: {}, targetDate: '2026-07-20', timeZone: 'Asia/Shanghai', generatedAt: new Date('2026-07-21T00:00:00Z')
    });
    expect(digest.analytics.net_flow).toBe(7);
    expect(digest.sync.imported_count).toBe(0);
  });
});
