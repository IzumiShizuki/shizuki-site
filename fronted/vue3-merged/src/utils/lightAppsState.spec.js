import { describe, expect, it } from 'vitest';
import {
  LIGHT_APPS_PREFERENCE_KEY,
  MAX_FLOATING_APPS,
  applyLightAppsToPreference,
  normalizeLightAppsState,
  readLightAppsPreference
} from './lightAppsState';

describe('lightAppsState', () => {
  it('normalizes invalid payload into known defaults', () => {
    const normalized = normalizeLightAppsState({
      enabledCodes: ['unknown-code'],
      floatingCodes: ['unknown-code'],
      configs: {
        'unknown-code': { foo: 'bar' }
      }
    });

    expect(normalized.enabledCodes.length).toBeGreaterThan(0);
    expect(normalized.floatingCodes.length).toBeGreaterThan(0);
    expect(Object.keys(normalized.configs)).toHaveLength(0);
  });

  it('keeps floating slots within enabled list and max size', () => {
    const normalized = normalizeLightAppsState({
      enabledCodes: ['timeprism-todo', 'timeprism-board'],
      floatingCodes: ['timeprism-todo', 'timeprism-board', 'timeprism-schedule', 'timeprism-todo']
    });

    expect(normalized.floatingCodes).toEqual(['timeprism-todo', 'timeprism-board']);
    expect(normalized.floatingCodes.length).toBeLessThanOrEqual(MAX_FLOATING_APPS);
  });

  it('reads and writes preference payload in snake_case key', () => {
    const state = normalizeLightAppsState({
      enabledCodes: ['timeprism-todo', 'timeprism-schedule'],
      floatingCodes: ['timeprism-schedule']
    });

    const nextPreference = applyLightAppsToPreference({ theme: 'light' }, state);
    expect(nextPreference.theme).toBe('light');
    expect(nextPreference[LIGHT_APPS_PREFERENCE_KEY]).toEqual(state);

    const readBack = readLightAppsPreference(nextPreference);
    expect(readBack).toEqual(state);
  });
});
