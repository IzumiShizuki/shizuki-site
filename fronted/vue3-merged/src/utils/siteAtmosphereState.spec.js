import { describe, expect, it } from 'vitest';
import {
  SITE_ATMOSPHERE_PREFERENCE_KEY,
  applyAmbientPreset,
  applySiteAtmosphereToPreference,
  createDefaultSiteAtmosphereState,
  deleteAmbientPreset,
  normalizeGuestAmbientUploads,
  normalizeSiteAtmosphereState,
  readSiteAtmospherePreference,
  saveAmbientPreset,
  setAmbientTrackVolume,
  toggleAmbientTrack,
  upsertAmbientTrack
} from './siteAtmosphereState';

describe('siteAtmosphereState', () => {
  it('normalizes invalid payloads and drops duplicate or missing tracks', () => {
    const normalized = normalizeSiteAtmosphereState(
      {
        panel_tab: 'INVALID',
        effect: {
          enabled: 1,
          preset_id: 'unknown',
          density: 99,
          opacity: -1,
          fall_speed: 99,
          spawn_rate: -3
        },
        ambient: {
          master_volume: 2,
          tracks: [
            { track_id: 'rain', source: 'builtin', enabled: true, volume: 0.9 },
            { track_id: 'rain', source: 'builtin', enabled: false, volume: 0.2 },
            { track_id: 'asset:not-a-number', source: 'asset', enabled: true, volume: 0.5 },
            { track_id: 'guest:temp_a', source: 'guest', enabled: true, volume: 0.4 }
          ],
          presets: [{ id: 'preset-1', name: 'Rain', tracks: ['rain', 'missing'] }]
        }
      },
      {
        sessionUploads: {
          temp_a: {
            title: 'Guest Rain',
            dataUrl: 'data:audio/wav;base64,AAAA'
          }
        }
      }
    );

    expect(normalized.panelTab).toBe('ambient');
    expect(normalized.effect.presetId).toBe('none');
    expect(normalized.effect.density).toBe(1.8);
    expect(normalized.effect.opacity).toBe(0);
    expect(normalized.effect.fallSpeed).toBe(1.8);
    expect(normalized.effect.spawnRate).toBe(0.4);
    expect(normalized.ambient.masterVolume).toBe(1);
    expect(normalized.ambient.tracks).toHaveLength(2);
    expect(normalized.ambient.tracks[0].trackId).toBe('rain');
    expect(normalized.ambient.tracks[1].trackId).toBe('guest:temp_a');
    expect(normalized.ambient.presets[0].tracks).toEqual(['rain']);
  });

  it('reads and writes preference payload under site_atmosphere', () => {
    const nextState = normalizeSiteAtmosphereState({
      panelTab: 'effects',
      effect: {
        enabled: true,
        presetId: 'sakura',
        density: 0.86,
        opacity: 0.58,
        fallSpeed: 1.22,
        spawnRate: 1.44
      }
    });

    const merged = applySiteAtmosphereToPreference({ theme: 'night' }, nextState);
    expect(merged.theme).toBe('night');
    expect(merged[SITE_ATMOSPHERE_PREFERENCE_KEY].effect.presetId).toBe('sakura');

    const readBack = readSiteAtmospherePreference(merged);
    expect(readBack.effect.enabled).toBe(true);
    expect(readBack.panelTab).toBe('effects');
    expect(readBack.effect.fallSpeed).toBe(1.22);
    expect(readBack.effect.spawnRate).toBe(1.44);
  });

  it('restores guest uploads from session-backed data and sanitizes broken entries', () => {
    const uploads = normalizeGuestAmbientUploads({
      demo: {
        title: 'Demo Upload',
        data_url: 'data:audio/mpeg;base64,AAAA',
        content_type: 'audio/mpeg'
      },
      broken: {
        title: 'Broken',
        data_url: 'blob:https://example.com/demo'
      }
    });

    expect(Object.keys(uploads)).toEqual(['demo']);
    expect(uploads.demo.title).toBe('Demo Upload');
  });

  it('saves, applies and deletes ambient presets while keeping builtins restorable', () => {
    let state = createDefaultSiteAtmosphereState();
    state = toggleAmbientTrack(state, { trackId: 'rain', source: 'builtin' });
    state = upsertAmbientTrack(state, { trackId: 'wind', source: 'builtin', enabled: true, volume: 0.33 });
    state = setAmbientTrackVolume(state, 'rain', 0.55);
    state = saveAmbientPreset(state, 'Storm');

    expect(state.ambient.presets).toHaveLength(1);
    const presetId = state.ambient.presets[0].id;

    state = toggleAmbientTrack(state, { trackId: 'rain', source: 'builtin' });
    state = toggleAmbientTrack(state, { trackId: 'wind', source: 'builtin' });
    expect(state.ambient.tracks.every((item) => !item.enabled)).toBe(true);

    state = applyAmbientPreset(state, presetId);
    expect(state.ambient.tracks.filter((item) => item.enabled).map((item) => item.trackId)).toEqual(['rain', 'wind']);

    state = deleteAmbientPreset(state, presetId);
    expect(state.ambient.presets).toHaveLength(0);
  });
});
