import { describe, expect, it } from 'vitest';
import {
  LIGHT_APPS_PREFERENCE_KEY,
  MAX_BALL_SLOTS,
  applyLightAppsToPreference,
  normalizeLightAppsState,
  readLightAppsPreference
} from './lightAppsState';

describe('lightAppsState', () => {
  it('normalizes invalid payload into known defaults', () => {
    const normalized = normalizeLightAppsState({
      enabled_codes: ['unknown-code'],
      ball_slots: [
        { enabled: true, type: 'app', app_code: 'unknown-code' },
        { enabled: true, type: 'picker' }
      ],
      app_configs: {
        'unknown-code': { foo: 'bar' }
      }
    });

    expect(normalized.enabled_codes.length).toBeGreaterThan(0);
    expect(normalized.ball_slots).toHaveLength(MAX_BALL_SLOTS);
    expect(Object.keys(normalized.app_configs)).toHaveLength(0);
  });

  it('keeps ball slots in app|picker schema and fills fallback app code', () => {
    const normalized = normalizeLightAppsState({
      enabled_codes: ['timeprism-todo', 'timeprism-board'],
      ball_slots: [
        { enabled: true, type: 'picker' },
        { enabled: true, type: 'app', app_code: 'timeprism-board' },
        { enabled: true, type: 'app', app_code: 'unknown-code' }
      ]
    });

    expect(normalized.ball_slots).toHaveLength(MAX_BALL_SLOTS);
    expect(normalized.ball_slots[0].type).toBe('picker');
    expect(normalized.ball_slots[1].app_code).toBe('timeprism-board');
    expect(['timeprism-todo', 'timeprism-board']).toContain(normalized.ball_slots[2].app_code);
  });

  it('supports legacy state migration from enabledCodes/floatingCodes/configs', () => {
    const normalized = normalizeLightAppsState({
      enabledCodes: ['timeprism-todo', 'timeprism-schedule'],
      floatingCodes: ['timeprism-schedule'],
      configs: {
        'timeprism-schedule': {
          foo: 'bar'
        }
      }
    });

    expect(normalized.enabled_codes).toEqual(['timeprism-todo', 'timeprism-schedule']);
    expect(normalized.ball_slots[1].enabled).toBe(true);
    expect(normalized.ball_slots[1].type).toBe('app');
    expect(normalized.ball_slots[1].app_code).toBe('timeprism-schedule');
    expect(normalized.app_configs['timeprism-schedule']).toEqual({ foo: 'bar' });
  });

  it('reads and writes preference payload in snake_case key', () => {
    const state = normalizeLightAppsState({
      enabled_codes: ['timeprism-todo', 'timeprism-schedule'],
      ball_slots: [
        { enabled: true, type: 'picker' },
        { enabled: true, type: 'app', app_code: 'timeprism-schedule' }
      ]
    });

    const nextPreference = applyLightAppsToPreference({ theme: 'light' }, state);
    expect(nextPreference.theme).toBe('light');
    expect(nextPreference[LIGHT_APPS_PREFERENCE_KEY]).toEqual(state);

    const readBack = readLightAppsPreference(nextPreference);
    expect(readBack).toEqual(state);
  });
});
