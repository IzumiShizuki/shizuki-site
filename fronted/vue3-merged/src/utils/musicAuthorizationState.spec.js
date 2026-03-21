import { describe, expect, it } from 'vitest';
import {
  MUSIC_SOURCE_MODE_OPTIONS,
  SOURCE_ACCOUNT_PROVIDERS,
  getSourceAccountProviderLabel,
  normalizeApiKeyStatus,
  normalizeMusicSourceModeValue,
  normalizeSourceAccountStatus,
  normalizeSourceProviderOrder
} from './musicAuthorizationState';

describe('musicAuthorizationState', () => {
  it('normalizes api key status payload fields', () => {
    expect(
      normalizeApiKeyStatus({
        key_bound: 1,
        key_mask: 'th-***',
        updated_at: '2026-03-21T12:00:00Z'
      })
    ).toEqual({
      keyBound: true,
      keyMask: 'th-***',
      updatedAt: '2026-03-21T12:00:00Z'
    });
  });

  it('normalizes source provider order with dedupe and fallback completion', () => {
    expect(normalizeSourceProviderOrder(['QQMusic', 'netease', 'qqmusic', 'unknown'])).toEqual([
      'qqmusic',
      'netease',
      'kugou'
    ]);
    expect(normalizeSourceProviderOrder([])).toEqual(SOURCE_ACCOUNT_PROVIDERS);
  });

  it('normalizes source account status with provider fallback', () => {
    expect(
      normalizeSourceAccountStatus(
        {
          auth_type: 'cookie',
          key_bound: 1,
          key_mask: 'uin=***',
          updated_at: '2026-03-21T12:00:00Z',
          last_verified_at: '2026-03-21T12:10:00Z',
          expire_at: '2026-04-01T00:00:00Z'
        },
        'qqmusic'
      )
    ).toEqual({
      provider: 'qqmusic',
      authType: 'cookie',
      bound: true,
      mask: 'uin=***',
      status: 'BOUND',
      updatedAt: '2026-03-21T12:00:00Z',
      lastVerifiedAt: '2026-03-21T12:10:00Z',
      expireAt: '2026-04-01T00:00:00Z'
    });
  });

  it('falls back invalid source mode values to tunehub_first', () => {
    expect(MUSIC_SOURCE_MODE_OPTIONS.map((item) => item.value)).toContain('tunehub_first');
    expect(normalizeMusicSourceModeValue('ACCOUNT_ONLY')).toBe('account_only');
    expect(normalizeMusicSourceModeValue('legacy-mode')).toBe('tunehub_first');
  });

  it('returns consistent provider labels', () => {
    expect(getSourceAccountProviderLabel('netease')).toBe('网易云');
    expect(getSourceAccountProviderLabel('qqmusic')).toBe('QQ 音乐');
    expect(getSourceAccountProviderLabel('kugou')).toBe('酷狗');
  });
});
