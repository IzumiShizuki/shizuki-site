import { describe, expect, it } from 'vitest';
import {
  BUILTIN_RINGTONES,
  createDefaultPomodoroTemplate,
  migrateLegacyPomodoroState,
  normalizePomodoroTemplate,
  normalizePomodoroTemplates,
  normalizeTempRingtoneMap
} from './pomodoroState';

describe('pomodoroState', () => {
  it('creates a stable default template', () => {
    const template = createDefaultPomodoroTemplate(9);
    expect(template.pomodoroId).toBe(9);
    expect(template.focusMinutes).toBe(25);
    expect(template.ringtoneType).toBe('BUILTIN');
    expect(template.ringtoneCode).toBe(BUILTIN_RINGTONES[0].code);
  });

  it('normalizes invalid template values and falls back to builtin ringtone', () => {
    const template = normalizePomodoroTemplate(
      {
        pomodoro_id: 3,
        title: '',
        focus_minutes: -1,
        short_break_minutes: 999,
        long_break_minutes: 0,
        long_break_every: 1,
        ringtone_type: 'UPLOAD',
        ringtone_asset_id: 0
      },
      3
    );

    expect(template.title).toBeTruthy();
    expect(template.focusMinutes).toBe(5);
    expect(template.shortBreakMinutes).toBe(60);
    expect(template.longBreakMinutes).toBe(5);
    expect(template.longBreakEvery).toBe(2);
    expect(template.ringtoneType).toBe('BUILTIN');
  });

  it('deduplicates and sorts template lists', () => {
    const list = normalizePomodoroTemplates([
      { pomodoroId: 2, title: 'B', sortNum: 20, ringtoneType: 'BUILTIN', ringtoneCode: 'soft-bell' },
      { pomodoroId: 1, title: 'A', sortNum: 10, ringtoneType: 'BUILTIN', ringtoneCode: 'soft-bell' },
      { pomodoroId: 1, title: 'A2', sortNum: 30, ringtoneType: 'BUILTIN', ringtoneCode: 'soft-bell' }
    ]);

    expect(list).toHaveLength(2);
    expect(list[0].pomodoroId).toBe(1);
    expect(list[1].pomodoroId).toBe(2);
  });

  it('migrates legacy payload settings into a template', () => {
    const migrated = migrateLegacyPomodoroState(
      {
        settings: {
          focusMinutes: 40,
          shortBreakMinutes: 8,
          longBreakMinutes: 20,
          longBreakEvery: 5,
          autoStartNext: true
        }
      },
      5
    );

    expect(migrated).not.toBeNull();
    expect(migrated?.pomodoroId).toBe(5);
    expect(migrated?.focusMinutes).toBe(40);
    expect(migrated?.autoStartNext).toBe(true);
  });

  it('normalizes temporary session ringtone map and drops invalid entries', () => {
    const normalized = normalizeTempRingtoneMap({
      valid_1: {
        name: 'hello.mp3',
        data_url: 'data:audio/mpeg;base64,AAAA',
        content_type: 'audio/mpeg',
        size: 12
      },
      invalid_1: {
        name: 'bad.mp3',
        data_url: 'https://example.com/1.mp3'
      },
      invalid_2: null
    });

    expect(Object.keys(normalized)).toEqual(['valid_1']);
    expect(normalized.valid_1.name).toBe('hello.mp3');
  });
});
