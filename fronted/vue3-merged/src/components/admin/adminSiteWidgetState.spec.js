import { describe, expect, it } from 'vitest';
import { createSiteWidgetForm, normalizeMusicBundle, validateSiteWidgetForm } from './adminSiteWidgetState';

describe('adminSiteWidgetState', () => {
  it('validates coordinates, IANA timezone and stale age before saving', () => {
    const valid = createSiteWidgetForm({ displayName: '上海', latitude: 31.23, longitude: 121.47 });
    expect(validateSiteWidgetForm(valid)).toEqual({ valid: true, errors: [] });
    expect(validateSiteWidgetForm({ ...valid, latitude: 91, timezone: 'Shanghai', weatherMaxStaleMinutes: 1 }).errors).toHaveLength(3);
  });

  it('requires provider enablement when Hitokoto is the active source', () => {
    const value = createSiteWidgetForm({ displayName: '上海', latitude: 31, longitude: 121, quoteSourceMode: 'HITOKOTO' });
    expect(validateSiteWidgetForm(value).errors).toContain('使用 Hitokoto 主源时必须启用 provider');
  });

  it('keeps all existing track fields when editing the recommended playlist profile', () => {
    const bundle = normalizeMusicBundle({ profile: { playlist_code: 'default_public', name: '夜航' }, tracks: [{ track_id: '1', provider: 'netease', title: '歌', metadata: { album: 'A' } }] });
    expect(bundle.profile.name).toBe('夜航');
    expect(bundle.tracks[0]).toMatchObject({ trackId: '1', provider: 'netease', metadata: { album: 'A' } });
  });
});
