import { describe, expect, it } from 'vitest';
import {
  DEFAULT_COLLECTION_ID,
  LIGHT_APPS_PREFERENCE_KEY,
  MAX_RAIL_SLOTS,
  applyLightAppsToPreference,
  normalizeLightAppsState,
  readLightAppsPreference
} from './lightAppsState';

describe('lightAppsState', () => {
  it('normalizes invalid payload into known defaults', () => {
    const normalized = normalizeLightAppsState({
      enabled_codes: ['unknown-code'],
      rail_slots: [
        { enabled: true, item_kind: 'app', item_ref: 'unknown-code' },
        { enabled: true, item_kind: 'picker' }
      ],
      app_configs: {
        'unknown-code': { foo: 'bar' }
      }
    });

    expect(normalized.enabled_codes).toEqual(['timeprism-todo']);
    expect(normalized.rail_slots).toHaveLength(MAX_RAIL_SLOTS);
    expect(normalized.rail_slots[0]).toEqual({
      enabled: true,
      item_kind: 'app',
      item_ref: 'timeprism-todo'
    });
    expect(normalized.rail_slots[1]).toEqual({
      enabled: true,
      item_kind: 'picker',
      item_ref: ''
    });
    expect(normalized.collections[0].collection_id).toBe(DEFAULT_COLLECTION_ID);
    expect(Object.keys(normalized.app_configs)).toHaveLength(0);
  });

  it('hard-migrates legacy module codes into single todo entry and deduplicates slots', () => {
    const normalized = normalizeLightAppsState({
      enabled_codes: ['timeprism-todo', 'timeprism-board', 'timeprism-schedule', 'timeprism-projects'],
      ball_slots: [
        { enabled: true, type: 'app', app_code: 'timeprism-board' },
        { enabled: true, type: 'app', app_code: 'timeprism-schedule' },
        { enabled: true, type: 'app', app_code: 'timeprism-projects' },
        { enabled: true, type: 'picker' },
        { enabled: true, type: 'app', app_code: 'timeprism-todo' },
        { enabled: false, type: 'app', app_code: '' },
        { enabled: false, type: 'app', app_code: '' },
        { enabled: false, type: 'app', app_code: '' }
      ],
      app_configs: {
        'timeprism-schedule': { view: 'agenda' },
        'timeprism-todo': { view: 'todo' },
        'timeprism-projects': { foo: 'bar' }
      }
    });

    expect(normalized.enabled_codes).toEqual(['timeprism-todo']);
    expect(normalized.rail_slots).toHaveLength(MAX_RAIL_SLOTS);
    expect(normalized.rail_slots[0]).toEqual({
      enabled: true,
      item_kind: 'app',
      item_ref: 'timeprism-todo'
    });
    expect(normalized.rail_slots[1]).toEqual({
      enabled: false,
      item_kind: 'app',
      item_ref: ''
    });
    expect(normalized.rail_slots[2]).toEqual({
      enabled: false,
      item_kind: 'app',
      item_ref: ''
    });
    expect(normalized.rail_slots[3]).toEqual({
      enabled: true,
      item_kind: 'picker',
      item_ref: ''
    });
    expect(normalized.rail_slots[4]).toEqual({
      enabled: false,
      item_kind: 'app',
      item_ref: ''
    });
    expect(normalized.app_configs).toEqual({
      'timeprism-todo': { view: 'todo' }
    });
  });

  it('supports legacy state migration from enabledCodes/floatingCodes/configs', () => {
    const normalized = normalizeLightAppsState({
      enabledCodes: ['timeprism-todo', 'timeprism-schedule'],
      floatingCodes: ['timeprism-projects', 'timeprism-schedule'],
      configs: {
        'timeprism-schedule': {
          foo: 'bar'
        }
      }
    });

    expect(normalized.enabled_codes).toEqual(['timeprism-todo']);
    expect(normalized.rail_slots[0]).toEqual({
      enabled: true,
      item_kind: 'app',
      item_ref: 'timeprism-todo'
    });
    expect(normalized.rail_slots[1].enabled).toBe(false);
    expect(normalized.app_configs['timeprism-todo']).toEqual({ foo: 'bar' });
  });

  it('migrates old ball slots into rail slots', () => {
    const normalized = normalizeLightAppsState({
      enabled_codes: ['timeprism-todo', 'pomodoro-timer'],
      ball_slots: [
        { enabled: true, type: 'app', app_code: 'pomodoro-timer' },
        { enabled: true, type: 'picker' }
      ],
      collections: []
    });

    expect(normalized.rail_slots[0]).toEqual({
      enabled: true,
      item_kind: 'app',
      item_ref: 'pomodoro-timer'
    });
    expect(normalized.rail_slots[1]).toEqual({
      enabled: true,
      item_kind: 'picker',
      item_ref: ''
    });
    expect(normalized.collections[0].collection_id).toBe(DEFAULT_COLLECTION_ID);
  });

  it('reads and writes preference payload in snake_case key', () => {
    const state = normalizeLightAppsState({
      enabled_codes: ['pomodoro-timer'],
      rail_slots: [
        { enabled: true, item_kind: 'app', item_ref: 'pomodoro-timer' }
      ]
    });

    const nextPreference = applyLightAppsToPreference({ theme: 'light' }, state);
    expect(nextPreference.theme).toBe('light');
    expect(nextPreference[LIGHT_APPS_PREFERENCE_KEY]).toEqual(state);

    const readBack = readLightAppsPreference(nextPreference);
    expect(readBack).toEqual(state);
  });
});
