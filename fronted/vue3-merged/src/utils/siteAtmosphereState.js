import {
  BUILTIN_AMBIENT_ID_SET,
  DEFAULT_AMBIENT_MASTER_VOLUME,
  DEFAULT_AMBIENT_TRACK_VOLUME,
  DEFAULT_ATMOSPHERE_TAB,
  DEFAULT_EFFECT_DENSITY,
  DEFAULT_EFFECT_FALL_SPEED,
  DEFAULT_EFFECT_OPACITY,
  DEFAULT_EFFECT_SPAWN_RATE,
  EFFECT_PRESET_ID_SET,
  findBuiltinAmbientById
} from './atmosphereCatalog';

export const SITE_ATMOSPHERE_PREFERENCE_KEY = 'site_atmosphere';
export const SITE_ATMOSPHERE_STORAGE_KEY = 'shizuki.siteAtmosphere.v1';
export const SITE_ATMOSPHERE_SESSION_UPLOADS_KEY = 'shizuki.siteAtmosphere.uploads.v1';

const VALID_TABS = new Set(['music', 'ambient', 'effects']);

function clampUnit(value, fallback) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return fallback;
  return Math.max(0, Math.min(1, numeric));
}

function clampDensity(value) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return DEFAULT_EFFECT_DENSITY;
  return Math.max(0.4, Math.min(1.8, Number(numeric.toFixed(2))));
}

function clampEffectRate(value, fallback) {
  const numeric = Number(value);
  if (!Number.isFinite(numeric)) return fallback;
  return Math.max(0.4, Math.min(1.8, Number(numeric.toFixed(2))));
}

function readObject(input) {
  return input && typeof input === 'object' ? input : {};
}

function normalizeTab(value) {
  const normalized = String(value || '').trim().toLowerCase();
  return VALID_TABS.has(normalized) ? normalized : DEFAULT_ATMOSPHERE_TAB;
}

function normalizeTrackId(input) {
  return String(input || '').trim();
}

function inferTrackSource(trackId, inputSource, sessionUploads) {
  const normalizedSource = String(inputSource || '').trim().toLowerCase();
  if (normalizedSource === 'asset' || /^asset:\d+$/.test(trackId)) return 'asset';
  if (normalizedSource === 'guest' || /^guest:[a-z0-9_-]+$/i.test(trackId)) {
    const guestCode = trackId.replace(/^guest:/i, '');
    return sessionUploads?.[guestCode] ? 'guest' : '';
  }
  return BUILTIN_AMBIENT_ID_SET.has(trackId) ? 'builtin' : '';
}

function normalizeTrack(input, sessionUploads) {
  const source = readObject(input);
  const trackId = normalizeTrackId(source.trackId || source.track_id);
  if (!trackId) return null;

  const resolvedSource = inferTrackSource(trackId, source.source, sessionUploads);
  if (!resolvedSource) return null;

  const next = {
    trackId,
    source: resolvedSource,
    enabled: Boolean(source.enabled),
    volume: clampUnit(source.volume, DEFAULT_AMBIENT_TRACK_VOLUME),
    title: '',
    assetId: null,
    guestCode: ''
  };

  if (resolvedSource === 'builtin') {
    const builtin = findBuiltinAmbientById(trackId);
    if (!builtin) return null;
    next.title = String(source.title || builtin.label || builtin.title || trackId).trim();
    return next;
  }

  if (resolvedSource === 'asset') {
    const assetId = Number(source.assetId ?? source.asset_id ?? trackId.replace(/^asset:/, ''));
    if (!Number.isInteger(assetId) || assetId <= 0) return null;
    next.assetId = assetId;
    next.trackId = `asset:${assetId}`;
    next.title = String(source.title || '已上传环境音').trim() || '已上传环境音';
    return next;
  }

  const guestCode = trackId.replace(/^guest:/i, '');
  const guestMeta = readObject(sessionUploads?.[guestCode]);
  if (!guestMeta.dataUrl) return null;
  next.guestCode = guestCode;
  next.trackId = `guest:${guestCode}`;
  next.title = String(source.title || guestMeta.title || '临时环境音').trim() || '临时环境音';
  return next;
}

function normalizePreset(input, knownTrackIds) {
  const source = readObject(input);
  const rawId = String(source.id || '').trim();
  const rawName = String(source.name || '').trim();
  if (!rawId || !rawName) return null;

  const trackSource = Array.isArray(source.tracks) ? source.tracks : [];
  const tracks = Array.from(
    new Set(
      trackSource
        .map((item) => normalizeTrackId(item))
        .filter((trackId) => trackId && (knownTrackIds.has(trackId) || BUILTIN_AMBIENT_ID_SET.has(trackId)))
    )
  );
  if (!tracks.length) return null;

  return {
    id: rawId,
    name: rawName,
    tracks
  };
}

export function createDefaultSiteAtmosphereState() {
  return {
    panelTab: DEFAULT_ATMOSPHERE_TAB,
    effect: {
      enabled: false,
      presetId: 'none',
      density: DEFAULT_EFFECT_DENSITY,
      opacity: DEFAULT_EFFECT_OPACITY,
      fallSpeed: DEFAULT_EFFECT_FALL_SPEED,
      spawnRate: DEFAULT_EFFECT_SPAWN_RATE
    },
    ambient: {
      masterVolume: DEFAULT_AMBIENT_MASTER_VOLUME,
      tracks: [],
      presets: []
    }
  };
}

export function normalizeGuestAmbientUploads(input) {
  const source = readObject(input);
  const next = {};
  Object.entries(source).forEach(([code, value]) => {
    const entry = readObject(value);
    const dataUrl = String(entry.dataUrl || entry.data_url || '').trim();
    if (!dataUrl.startsWith('data:audio/')) return;
    const normalizedCode = String(code || '').trim();
    if (!normalizedCode) return;
    next[normalizedCode] = {
      code: normalizedCode,
      title: String(entry.title || entry.name || '临时环境音').trim() || '临时环境音',
      dataUrl,
      contentType: String(entry.contentType || entry.content_type || 'audio/wav').trim() || 'audio/wav',
      size: Math.max(0, Number(entry.size || 0) || 0)
    };
  });
  return next;
}

export function normalizeSiteAtmosphereState(input, options = {}) {
  const source = readObject(input);
  const sessionUploads = normalizeGuestAmbientUploads(options.sessionUploads);
  const defaults = createDefaultSiteAtmosphereState();

  const effectInput = readObject(source.effect);
  const ambientInput = readObject(source.ambient);

  const tracks = [];
  const seenTrackIds = new Set();
  const trackSource = Array.isArray(ambientInput.tracks) ? ambientInput.tracks : [];
  trackSource.forEach((item) => {
    const normalized = normalizeTrack(item, sessionUploads);
    if (!normalized || seenTrackIds.has(normalized.trackId)) return;
    seenTrackIds.add(normalized.trackId);
    tracks.push(normalized);
  });

  const knownTrackIds = new Set(tracks.map((item) => item.trackId));
  const presetSource = Array.isArray(ambientInput.presets) ? ambientInput.presets : [];
  const presets = [];
  const presetIds = new Set();
  presetSource.forEach((item) => {
    const normalized = normalizePreset(item, knownTrackIds);
    if (!normalized || presetIds.has(normalized.id)) return;
    presetIds.add(normalized.id);
    presets.push(normalized);
  });

  return {
    panelTab: normalizeTab(source.panelTab || source.panel_tab || defaults.panelTab),
    effect: {
      enabled: Boolean(effectInput.enabled),
      presetId: EFFECT_PRESET_ID_SET.has(String(effectInput.presetId || effectInput.preset_id || '').trim())
        ? String(effectInput.presetId || effectInput.preset_id).trim()
        : 'none',
      density: clampDensity(effectInput.density),
      opacity: clampUnit(effectInput.opacity, defaults.effect.opacity),
      fallSpeed: clampEffectRate(effectInput.fallSpeed ?? effectInput.fall_speed, defaults.effect.fallSpeed),
      spawnRate: clampEffectRate(effectInput.spawnRate ?? effectInput.spawn_rate, defaults.effect.spawnRate)
    },
    ambient: {
      masterVolume: clampUnit(ambientInput.masterVolume ?? ambientInput.master_volume, defaults.ambient.masterVolume),
      tracks,
      presets
    }
  };
}

export function cloneSiteAtmosphereState(input) {
  return JSON.parse(JSON.stringify(normalizeSiteAtmosphereState(input)));
}

export function readAmbientGuestUploadsFromSession(storage = typeof window !== 'undefined' ? window.sessionStorage : null) {
  if (!storage) return {};
  try {
    return normalizeGuestAmbientUploads(JSON.parse(storage.getItem(SITE_ATMOSPHERE_SESSION_UPLOADS_KEY) || '{}'));
  } catch {
    return {};
  }
}

export function writeAmbientGuestUploadsToSession(input, storage = typeof window !== 'undefined' ? window.sessionStorage : null) {
  if (!storage) return false;
  try {
    storage.setItem(SITE_ATMOSPHERE_SESSION_UPLOADS_KEY, JSON.stringify(normalizeGuestAmbientUploads(input)));
    return true;
  } catch {
    return false;
  }
}

export function readSiteAtmosphereFromStorage(
  storage = typeof window !== 'undefined' ? window.localStorage : null,
  sessionStorage = typeof window !== 'undefined' ? window.sessionStorage : null
) {
  if (!storage) return createDefaultSiteAtmosphereState();
  try {
    return normalizeSiteAtmosphereState(JSON.parse(storage.getItem(SITE_ATMOSPHERE_STORAGE_KEY) || '{}'), {
      sessionUploads: readAmbientGuestUploadsFromSession(sessionStorage)
    });
  } catch {
    return createDefaultSiteAtmosphereState();
  }
}

export function writeSiteAtmosphereToStorage(input, storage = typeof window !== 'undefined' ? window.localStorage : null) {
  if (!storage) return false;
  try {
    const sessionUploads = readAmbientGuestUploadsFromSession(typeof window !== 'undefined' ? window.sessionStorage : null);
    storage.setItem(
      SITE_ATMOSPHERE_STORAGE_KEY,
      JSON.stringify(normalizeSiteAtmosphereState(input, { sessionUploads }))
    );
    return true;
  } catch {
    return false;
  }
}

export function readSiteAtmospherePreference(preferencePayload, sessionUploads) {
  const source = readObject(preferencePayload);
  const payload = readObject(source[SITE_ATMOSPHERE_PREFERENCE_KEY] || source.siteAtmosphere);
  return normalizeSiteAtmosphereState(payload, { sessionUploads });
}

export function applySiteAtmosphereToPreference(preferencePayload, state) {
  const source = readObject(preferencePayload);
  return {
    ...source,
    [SITE_ATMOSPHERE_PREFERENCE_KEY]: normalizeSiteAtmosphereState(state)
  };
}

export function upsertAmbientTrack(state, trackInput, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  const nextTrack = normalizeTrack(trackInput, normalizeGuestAmbientUploads(options.sessionUploads));
  if (!nextTrack) return normalizedState;

  const nextTracks = normalizedState.ambient.tracks.filter((item) => item.trackId !== nextTrack.trackId);
  nextTracks.push(nextTrack);
  return normalizeSiteAtmosphereState(
    {
      ...normalizedState,
      ambient: {
        ...normalizedState.ambient,
        tracks: nextTracks
      }
    },
    options
  );
}

export function toggleAmbientTrack(state, trackInput, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  const normalizedTrack = normalizeTrack(trackInput, normalizeGuestAmbientUploads(options.sessionUploads));
  if (!normalizedTrack) return normalizedState;
  const existing = normalizedState.ambient.tracks.find((item) => item.trackId === normalizedTrack.trackId);
  if (!existing) {
    return upsertAmbientTrack(
      normalizedState,
      {
        ...normalizedTrack,
        enabled: true
      },
      options
    );
  }
  return normalizeSiteAtmosphereState(
    {
      ...normalizedState,
      ambient: {
        ...normalizedState.ambient,
        tracks: normalizedState.ambient.tracks.map((item) =>
          item.trackId === normalizedTrack.trackId
            ? {
                ...item,
                enabled: !item.enabled
              }
            : item
        )
      }
    },
    options
  );
}

export function setAmbientTrackVolume(state, trackId, volume, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  return normalizeSiteAtmosphereState(
    {
      ...normalizedState,
      ambient: {
        ...normalizedState.ambient,
        tracks: normalizedState.ambient.tracks.map((item) =>
          item.trackId === trackId
            ? {
                ...item,
                volume: clampUnit(volume, item.volume)
              }
            : item
        )
      }
    },
    options
  );
}

export function setAmbientMasterVolume(state, volume, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  return normalizeSiteAtmosphereState(
    {
      ...normalizedState,
      ambient: {
        ...normalizedState.ambient,
        masterVolume: clampUnit(volume, normalizedState.ambient.masterVolume)
      }
    },
    options
  );
}

export function setAmbientAllEnabled(state, enabled, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  return normalizeSiteAtmosphereState(
    {
      ...normalizedState,
      ambient: {
        ...normalizedState.ambient,
        tracks: normalizedState.ambient.tracks.map((item) => ({
          ...item,
          enabled: Boolean(enabled)
        }))
      }
    },
    options
  );
}

export function removeAmbientTrack(state, trackId, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  return normalizeSiteAtmosphereState(
    {
      ...normalizedState,
      ambient: {
        ...normalizedState.ambient,
        tracks: normalizedState.ambient.tracks.filter((item) => item.trackId !== trackId),
        presets: normalizedState.ambient.presets.map((preset) => ({
          ...preset,
          tracks: preset.tracks.filter((item) => item !== trackId)
        }))
      }
    },
    options
  );
}

function createPresetId(name) {
  const normalized = String(name || '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9]+/g, '-')
    .replace(/^-+|-+$/g, '')
    .slice(0, 30);
  return `preset-${normalized || Date.now()}`;
}

export function saveAmbientPreset(state, name, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  const presetName = String(name || '').trim();
  const tracks = normalizedState.ambient.tracks.filter((item) => item.enabled).map((item) => item.trackId);
  if (!presetName || !tracks.length) return normalizedState;

  const nextPreset = {
    id: createPresetId(presetName),
    name: presetName,
    tracks
  };

  return normalizeSiteAtmosphereState(
    {
      ...normalizedState,
      ambient: {
        ...normalizedState.ambient,
        presets: [nextPreset, ...normalizedState.ambient.presets.filter((item) => item.name !== presetName)].slice(0, 12)
      }
    },
    options
  );
}

export function deleteAmbientPreset(state, presetId, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  return normalizeSiteAtmosphereState(
    {
      ...normalizedState,
      ambient: {
        ...normalizedState.ambient,
        presets: normalizedState.ambient.presets.filter((item) => item.id !== presetId)
      }
    },
    options
  );
}

export function applyAmbientPreset(state, presetId, options = {}) {
  const normalizedState = normalizeSiteAtmosphereState(state, options);
  const targetPreset = normalizedState.ambient.presets.find((item) => item.id === presetId);
  if (!targetPreset) return normalizedState;

  let nextState = setAmbientAllEnabled(normalizedState, false, options);
  targetPreset.tracks.forEach((trackId) => {
    const existing = nextState.ambient.tracks.find((item) => item.trackId === trackId);
    if (existing) {
      nextState = toggleAmbientTrack(
        nextState,
        {
          ...existing,
          enabled: false
        },
        options
      );
      return;
    }

    if (BUILTIN_AMBIENT_ID_SET.has(trackId)) {
      nextState = upsertAmbientTrack(
        nextState,
        {
          trackId,
          source: 'builtin',
          enabled: true,
          volume: DEFAULT_AMBIENT_TRACK_VOLUME,
          title: findBuiltinAmbientById(trackId)?.label || trackId
        },
        options
      );
    }
  });

  return normalizeSiteAtmosphereState(nextState, options);
}
