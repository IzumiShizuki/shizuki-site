import { LIGHT_APP_CODES, isKnownLightAppCode } from './lightAppsCatalog';

export const LIGHT_APPS_STORAGE_KEY = 'shizuki.lightApps.v2';
export const LIGHT_APPS_CHANGED_EVENT = 'shizuki:light-apps-changed';
export const LIGHT_APPS_PREFERENCE_KEY = 'light_apps';
export const MAX_BALL_SLOTS = 8;

const DEFAULT_ENABLED_CODES = LIGHT_APP_CODES.slice(0, 4);
const DEFAULT_SLOT_BLUEPRINT = Object.freeze([
  { enabled: true, type: 'picker', app_code: '' },
  { enabled: true, type: 'app', app_code: 'timeprism-todo' },
  { enabled: true, type: 'app', app_code: 'timeprism-board' },
  { enabled: true, type: 'app', app_code: 'timeprism-schedule' },
  { enabled: true, type: 'app', app_code: 'timeprism-projects' },
  { enabled: false, type: 'app', app_code: '' },
  { enabled: false, type: 'app', app_code: '' },
  { enabled: false, type: 'app', app_code: '' }
]);

function toObject(value) {
  return value && typeof value === 'object' && !Array.isArray(value) ? value : {};
}

function uniqueKnownCodes(codes) {
  const source = Array.isArray(codes) ? codes : [];
  const seen = new Set();
  const output = [];

  source.forEach((item) => {
    const code = String(item || '').trim();
    if (!isKnownLightAppCode(code)) return;
    if (seen.has(code)) return;
    seen.add(code);
    output.push(code);
  });

  return output;
}

function resolveEnabledCodes(input) {
  const codes = uniqueKnownCodes(input);
  return codes.length ? codes : DEFAULT_ENABLED_CODES.slice();
}

function normalizeConfigs(input, enabledCodes) {
  const source = toObject(input);
  const enabledSet = new Set(enabledCodes);
  const next = {};

  Object.entries(source).forEach(([rawCode, value]) => {
    const code = String(rawCode || '').trim();
    if (!enabledSet.has(code)) return;
    next[code] = toObject(value);
  });

  return next;
}

function resolveKnownCode(raw) {
  const code = String(raw || '').trim();
  return isKnownLightAppCode(code) ? code : '';
}

function pickFallbackAppCode(enabledCodes, usedCodes) {
  const enabledSet = new Set(enabledCodes);
  const firstUnused = LIGHT_APP_CODES.find((code) => enabledSet.has(code) && !usedCodes.has(code));
  if (firstUnused) {
    usedCodes.add(firstUnused);
    return firstUnused;
  }

  const firstEnabled = enabledCodes[0] || '';
  if (firstEnabled) {
    usedCodes.add(firstEnabled);
  }
  return firstEnabled;
}

function normalizeBallSlots(input, enabledCodes) {
  const source = Array.isArray(input) ? input : [];
  const normalized = [];
  const usedCodes = new Set();

  for (let i = 0; i < MAX_BALL_SLOTS; i += 1) {
    const fallback = DEFAULT_SLOT_BLUEPRINT[i] || { enabled: false, type: 'app', app_code: '' };
    const raw = toObject(source[i]);

    const enabled = raw.enabled === undefined ? Boolean(fallback.enabled) : Boolean(raw.enabled);

    const rawType = String(raw.type || fallback.type || 'app').trim().toLowerCase();
    const type = rawType === 'picker' ? 'picker' : 'app';

    let appCode = resolveKnownCode(raw.app_code || raw.appCode || fallback.app_code || fallback.appCode);
    if (appCode && enabledCodes.includes(appCode)) {
      usedCodes.add(appCode);
    }

    if (type === 'app') {
      if (!enabled) {
        appCode = '';
      } else if (!appCode || !enabledCodes.includes(appCode)) {
        appCode = pickFallbackAppCode(enabledCodes, usedCodes);
      }
    } else {
      appCode = '';
    }

    normalized.push({
      enabled,
      type,
      app_code: appCode
    });
  }

  return normalized;
}

function buildSlotsFromFloatingCodes(floatingCodes, enabledCodes) {
  const next = DEFAULT_SLOT_BLUEPRINT.map((slot) => ({ ...slot }));
  const codes = uniqueKnownCodes(floatingCodes).filter((code) => enabledCodes.includes(code));
  if (!codes.length) {
    return normalizeBallSlots(next, enabledCodes);
  }

  for (let i = 0; i < MAX_BALL_SLOTS; i += 1) {
    if (i === 0) continue;
    const code = codes[i - 1] || '';
    if (!code) {
      next[i] = { enabled: false, type: 'app', app_code: '' };
      continue;
    }
    next[i] = { enabled: true, type: 'app', app_code: code };
  }

  return normalizeBallSlots(next, enabledCodes);
}

function fromLegacyState(source) {
  const enabledCodes = resolveEnabledCodes(source.enabledCodes || source.enabled_codes);
  const legacyConfigs = source.configs || source.app_configs;
  const legacyFloatingCodes = source.floatingCodes || source.floating_codes;

  return {
    enabled_codes: enabledCodes,
    ball_slots: buildSlotsFromFloatingCodes(legacyFloatingCodes, enabledCodes),
    app_configs: normalizeConfigs(legacyConfigs, enabledCodes)
  };
}

export function createDefaultLightAppsState() {
  const enabledCodes = resolveEnabledCodes(DEFAULT_ENABLED_CODES);
  return {
    enabled_codes: enabledCodes,
    ball_slots: normalizeBallSlots(DEFAULT_SLOT_BLUEPRINT, enabledCodes),
    app_configs: {}
  };
}

export function normalizeLightAppsState(input) {
  const source = toObject(input);
  const maybeLegacy =
    Object.prototype.hasOwnProperty.call(source, 'enabledCodes') ||
    Object.prototype.hasOwnProperty.call(source, 'floatingCodes') ||
    Object.prototype.hasOwnProperty.call(source, 'configs');

  if (maybeLegacy) {
    return fromLegacyState(source);
  }

  const enabledCodes = resolveEnabledCodes(source.enabled_codes || source.enabledCodes);
  const ballSlots = normalizeBallSlots(
    source.ball_slots || source.ballSlots || source.floating_slots || source.floatingSlots,
    enabledCodes
  );
  const appConfigs = normalizeConfigs(source.app_configs || source.appConfigs || source.configs, enabledCodes);

  return {
    enabled_codes: enabledCodes,
    ball_slots: ballSlots,
    app_configs: appConfigs
  };
}

export function readLightAppsState() {
  if (typeof window === 'undefined') {
    return createDefaultLightAppsState();
  }

  try {
    const raw = window.localStorage.getItem(LIGHT_APPS_STORAGE_KEY);
    if (!raw) return createDefaultLightAppsState();
    const parsed = JSON.parse(raw);
    return normalizeLightAppsState(parsed);
  } catch {
    return createDefaultLightAppsState();
  }
}

export function writeLightAppsState(state) {
  const normalized = normalizeLightAppsState(state);
  if (typeof window !== 'undefined') {
    try {
      window.localStorage.setItem(LIGHT_APPS_STORAGE_KEY, JSON.stringify(normalized));
    } catch {
      // ignore persistence errors
    }
  }
  return normalized;
}

export function notifyLightAppsChanged(state) {
  if (typeof window === 'undefined' || typeof window.dispatchEvent !== 'function') return;
  const normalized = normalizeLightAppsState(state);
  window.dispatchEvent(
    new CustomEvent(LIGHT_APPS_CHANGED_EVENT, {
      detail: normalized
    })
  );
}

export function readLightAppsPreference(preferencePayload) {
  const source = toObject(preferencePayload);
  const candidate = source[LIGHT_APPS_PREFERENCE_KEY] || source.light_apps || source.lightApps;
  if (!candidate || typeof candidate !== 'object') return null;
  return normalizeLightAppsState(candidate);
}

export function applyLightAppsToPreference(preferencePayload, state) {
  const source = toObject(preferencePayload);
  return {
    ...source,
    [LIGHT_APPS_PREFERENCE_KEY]: normalizeLightAppsState(state)
  };
}
