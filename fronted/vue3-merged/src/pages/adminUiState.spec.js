import { describe, expect, it } from 'vitest';
import {
  buildQuotaMatrix,
  buildQuotaPayloadForGroup,
  mergeCatalogCodes,
  toggleCodeSelection,
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
});
