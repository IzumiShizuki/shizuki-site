import { LIGHT_APP_CODES, isKnownLightAppCode } from './lightAppsCatalog';

export const LIGHT_APPS_STORAGE_KEY = 'shizuki.lightApps.v1';
export const LIGHT_APPS_CHANGED_EVENT = 'shizuki:light-apps-changed';
export const LIGHT_APPS_PREFERENCE_KEY = 'light_apps';
export const MAX_FLOATING_APPS = 3;

const DEFAULT_ENABLED_CODES = LIGHT_APP_CODES.slice(0, 3);
const DEFAULT_FLOATING_CODES = LIGHT_APP_CODES.slice(0, MAX_FLOATING_APPS);

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

function resolveEnabledCodes(input) {
  const codes = uniqueKnownCodes(input);
  return codes.length ? codes : DEFAULT_ENABLED_CODES.slice();
}

function resolveFloatingCodes(input, enabledCodes) {
  const enabledSet = new Set(enabledCodes);
  const codes = uniqueKnownCodes(input).filter((code) => enabledSet.has(code));
  if (codes.length) {
    return codes.slice(0, MAX_FLOATING_APPS);
  }

  return DEFAULT_FLOATING_CODES.filter((code) => enabledSet.has(code)).slice(0, MAX_FLOATING_APPS);
}

export function createDefaultLightAppsState() {
  const enabledCodes = resolveEnabledCodes(DEFAULT_ENABLED_CODES);
  return {
    enabledCodes,
    floatingCodes: resolveFloatingCodes(DEFAULT_FLOATING_CODES, enabledCodes),
    configs: {}
  };
}

export function normalizeLightAppsState(input) {
  const source = toObject(input);
  const enabledCodes = resolveEnabledCodes(source.enabledCodes);
  const floatingCodes = resolveFloatingCodes(source.floatingCodes, enabledCodes);
  return {
    enabledCodes,
    floatingCodes,
    configs: normalizeConfigs(source.configs, enabledCodes)
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
  const candidate = source[LIGHT_APPS_PREFERENCE_KEY] || source.lightApps;
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
