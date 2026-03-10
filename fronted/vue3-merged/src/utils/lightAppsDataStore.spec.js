import { describe, expect, it } from 'vitest';
import { createEmptyLightAppDataStore, normalizeLightAppDataStore } from './lightAppsDataStore';

describe('lightAppsDataStore', () => {
  it('creates empty store with pomodoros key', () => {
    const store = createEmptyLightAppDataStore();
    expect(Array.isArray(store.pomodoros)).toBe(true);
    expect(store.pomodoros).toHaveLength(0);
  });

  it('normalizes pomodoro list items', () => {
    const normalized = normalizeLightAppDataStore({
      pomodoros: [
        {
          pomodoro_id: 2,
          title: 'B',
          focus_minutes: 40,
          short_break_minutes: 8,
          long_break_minutes: 20,
          long_break_every: 4,
          auto_start_next: true,
          ringtone_type: 'UPLOAD',
          ringtone_name: 'custom.mp3',
          ringtone_asset_id: 77,
          sort_num: 20
        },
        {
          pomodoro_id: 1,
          title: 'A',
          ringtone_type: 'BUILTIN',
          ringtone_code: 'soft-bell',
          sort_num: 10
        },
        {
          pomodoro_id: 0,
          title: ''
        }
      ]
    });

    expect(normalized.pomodoros).toHaveLength(2);
    expect(normalized.pomodoros[0].pomodoroId).toBe(1);
    expect(normalized.pomodoros[1].pomodoroId).toBe(2);
    expect(normalized.pomodoros[1].ringtoneType).toBe('UPLOAD');
    expect(normalized.pomodoros[1].ringtoneAssetId).toBe(77);
  });
});
