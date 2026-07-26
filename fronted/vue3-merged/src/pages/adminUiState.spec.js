import { describe, expect, it } from 'vitest';
import {
  buildQuotaMatrix,
  buildQuotaPayloadForGroup,
  formatBytes,
  formatQuotaValue,
  groupPermissionOptions,
  mergeCatalogCodes,
  normalizePermissionOptions,
  normalizeQuotaOptions,
  normalizeQuotaValue,
  toggleCodeSelection,
  UNLIMITED_QUOTA_VALUE,
  upsertQuotaCell
} from './adminUiState';

describe('adminUiState', () => {
  it('toggles code selection with dedupe support', () => {
    const selected = ['USER', 'ADMIN'];
    const removed = toggleCodeSelection(selected, 'USER', true);
    expect(removed).toEqual(['ADMIN']);

    const added = toggleCodeSelection(removed, 'friend', true);
    expect(added).toEqual(['ADMIN', 'FRIEND']);
  });

  it('merges catalog codes and removes duplicates', () => {
    const merged = mergeCatalogCodes(['basic.read', 'group.permission.write'], ['basic.read', 'quota.policy.read']);
    expect(merged).toEqual(['basic.read', 'group.permission.write', 'quota.policy.read']);
  });

  it('builds quota matrix from groups and policies', () => {
    const matrix = buildQuotaMatrix(
      [{ groupCode: 'USER', displayName: '用户', status: 'ACTIVE', builtIn: 1 }],
      ['ai_round_total'],
      [{ policyId: 'user-ai-rounds', groupCode: 'USER', quotaCode: 'ai_round_total', value: 5 }]
    );

    expect(matrix.quotaCodes).toEqual(['ai_round_total']);
    expect(matrix.rows[0].values.ai_round_total).toBe(5);
  });

  it('updates quota matrix cell and builds payload', () => {
    const matrix = buildQuotaMatrix(
      [{ groupCode: 'USER', displayName: '用户', status: 'ACTIVE', builtIn: 1 }],
      ['ai_round_total'],
      [{ policyId: 'user-ai-rounds', groupCode: 'USER', quotaCode: 'ai_round_total', value: 5 }]
    );

    const updatedRows = upsertQuotaCell(matrix.rows, 'USER', 'ai_round_total', 12);
    const payload = buildQuotaPayloadForGroup(updatedRows[0], matrix.quotaCodes);

    expect(updatedRows[0].values.ai_round_total).toBe(12);
    expect(payload[0]).toEqual({
      policyId: 'user-ai-rounds',
      groupCode: 'USER',
      quotaCode: 'ai_round_total',
      value: 12
    });
  });

  it('supports -1 as unlimited quota value', () => {
    const matrix = buildQuotaMatrix(
      [{ groupCode: 'USER', displayName: '用户', status: 'ACTIVE', builtIn: 1 }],
      ['music_song_pick_total'],
      [{ policyId: 'user-music-pick', groupCode: 'USER', quotaCode: 'music_song_pick_total', value: 5 }]
    );

    const updatedRows = upsertQuotaCell(matrix.rows, 'USER', 'music_song_pick_total', -1);
    const payload = buildQuotaPayloadForGroup(updatedRows[0], matrix.quotaCodes);

    expect(updatedRows[0].values.music_song_pick_total).toBe(-1);
    expect(payload[0].value).toBe(-1);
  });

  it('normalizes legacy Long.MAX style unlimited values to -1', () => {
    // 9223372036854775807 经 JSON 解析后变成 9223372036854775808，超出 JS 安全整数。
    expect(normalizeQuotaValue(9223372036854775807)).toBe(UNLIMITED_QUOTA_VALUE);
    expect(normalizeQuotaValue(Number.MAX_SAFE_INTEGER)).toBe(UNLIMITED_QUOTA_VALUE);
    expect(normalizeQuotaValue(-5)).toBe(UNLIMITED_QUOTA_VALUE);
    expect(normalizeQuotaValue('abc')).toBe(0);
    expect(normalizeQuotaValue(12.9)).toBe(12);

    const matrix = buildQuotaMatrix(
      [{ groupCode: 'ADMIN', displayName: '管理员', status: 'ACTIVE', builtIn: 1 }],
      ['ai_round_total'],
      [{ policyId: 'user-ai-rounds-admin', groupCode: 'ADMIN', quotaCode: 'ai_round_total', value: 9223372036854775807 }]
    );
    expect(matrix.rows[0].values.ai_round_total).toBe(UNLIMITED_QUOTA_VALUE);

    const payload = buildQuotaPayloadForGroup(matrix.rows[0], matrix.quotaCodes);
    expect(payload[0].value).toBe(UNLIMITED_QUOTA_VALUE);
  });

  it('normalizes permission options with fallback and custom codes', () => {
    const options = normalizePermissionOptions(
      [{ code: 'report.export', label: '报表导出', description: '导出统计报表', category: '报表', built_in: false }],
      ['basic.read', 'custom.zone']
    );

    const reportOption = options.find((item) => item.code === 'report.export');
    expect(reportOption.label).toBe('报表导出');

    const fallbackOption = options.find((item) => item.code === 'basic.read');
    expect(fallbackOption.label).toBe('基础浏览');
    expect(fallbackOption.builtIn).toBe(true);

    const customOption = options.find((item) => item.code === 'custom.zone');
    expect(customOption.label).toBe('custom.zone');
    expect(customOption.builtIn).toBe(false);

    const grouped = groupPermissionOptions(options);
    expect(grouped.some((section) => section.category === '报表')).toBe(true);
  });

  it('normalizes quota options and formats values', () => {
    const options = normalizeQuotaOptions([], ['ai_round_total', 'my_custom_bytes_total']);
    const builtin = options.find((item) => item.code === 'ai_round_total');
    expect(builtin.label).toBe('AI 对话轮次');
    expect(builtin.unit).toBe('count');

    const custom = options.find((item) => item.code === 'my_custom_bytes_total');
    expect(custom.unit).toBe('bytes');

    expect(formatQuotaValue(-1)).toBe('无限');
    expect(formatQuotaValue(0)).toBe('禁用');
    expect(formatQuotaValue(5)).toBe('5 次');
    expect(formatQuotaValue(104857600, 'bytes')).toBe('100 MB');
    expect(formatBytes(1536)).toBe('1.5 KB');
  });
});
