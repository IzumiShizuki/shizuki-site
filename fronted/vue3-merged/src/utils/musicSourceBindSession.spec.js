import { describe, expect, it } from 'vitest';
import {
  describeMusicSourceQrBindSession,
  isTerminalMusicSourceBindSession,
  resolveMusicSourceBindPollIntervalMs
} from './musicSourceBindSession';

describe('musicSourceBindSession', () => {
  it('describes qr lifecycle states', () => {
    expect(describeMusicSourceQrBindSession({ provider: 'netease', qrStatus: 'WAIT_SCAN' })).toContain('扫码登录');
    expect(describeMusicSourceQrBindSession({ provider: 'qqmusic', qrStatus: 'WAIT_CONFIRM' })).toContain('确认登录');
    expect(describeMusicSourceQrBindSession({ provider: 'kugou', qrStatus: 'AUTHORIZED' })).toContain('授权完成');
    expect(describeMusicSourceQrBindSession({ provider: 'netease', qrStatus: 'EXPIRED' })).toContain('二维码已过期');
    expect(describeMusicSourceQrBindSession({ provider: 'qqmusic', qrStatus: 'FAILED' })).toContain('扫码绑定失败');
  });

  it('respects explicit qr messages and terminal statuses', () => {
    expect(
      describeMusicSourceQrBindSession({
        provider: 'netease',
        qrStatus: 'WAIT_SCAN',
        qrMessage: '请使用网易云扫码'
      })
    ).toBe('请使用网易云扫码');
    expect(isTerminalMusicSourceBindSession({ status: 'COMPLETED' })).toBe(true);
    expect(isTerminalMusicSourceBindSession({ status: 'EXPIRED' })).toBe(true);
    expect(isTerminalMusicSourceBindSession({ status: 'FAILED' })).toBe(true);
    expect(isTerminalMusicSourceBindSession({ status: 'PENDING' })).toBe(false);
  });

  it('uses poll interval from session or falls back safely', () => {
    expect(resolveMusicSourceBindPollIntervalMs({ pollIntervalMs: 950 }, 1800)).toBe(950);
    expect(resolveMusicSourceBindPollIntervalMs({ pollIntervalMs: 0 }, 1800)).toBe(1800);
    expect(resolveMusicSourceBindPollIntervalMs({}, 120)).toBe(300);
  });
});
