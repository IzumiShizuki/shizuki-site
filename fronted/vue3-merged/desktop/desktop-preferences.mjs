import { readVersionedJson, writeAtomicJson } from './atomic-json-store.mjs';

export const DESKTOP_PREFERENCES_SCHEMA_VERSION = 1;

export function defaultDesktopPreferences() {
  return {
    schemaVersion: DESKTOP_PREFERENCES_SCHEMA_VERSION,
    desktopEnvironmentEnabled: true,
    cleanDesktopEnabled: true,
    interactionMode: 'normal',
    launchAtLogin: false,
    orb: {
      lockedVisible: false,
      displays: {}
    },
    windows: {
      main: null
    },
    updatedAt: null
  };
}

export function validDesktopPreferences(value) {
  return value?.schemaVersion === DESKTOP_PREFERENCES_SCHEMA_VERSION
    && typeof value.desktopEnvironmentEnabled === 'boolean'
    && typeof value.cleanDesktopEnabled === 'boolean'
    && ['normal', 'edit'].includes(value.interactionMode)
    && typeof value.launchAtLogin === 'boolean'
    && value.orb && typeof value.orb === 'object' && !Array.isArray(value.orb)
    && value.orb.displays && typeof value.orb.displays === 'object' && !Array.isArray(value.orb.displays)
    && value.windows && typeof value.windows === 'object' && !Array.isArray(value.windows);
}

export class DesktopPreferencesStore {
  constructor(filePath) {
    if (!filePath) throw new TypeError('filePath is required.');
    this.filePath = filePath;
    this.state = defaultDesktopPreferences();
    this.lastLoad = null;
  }

  async load() {
    const result = await readVersionedJson(this.filePath, {
      schemaVersion: DESKTOP_PREFERENCES_SCHEMA_VERSION,
      defaults: defaultDesktopPreferences,
      validate: validDesktopPreferences
    });
    this.state = result.value;
    this.lastLoad = result;
    return result;
  }

  snapshot() {
    return structuredClone(this.state);
  }

  async replace(value) {
    const next = {
      ...structuredClone(value),
      schemaVersion: DESKTOP_PREFERENCES_SCHEMA_VERSION,
      updatedAt: new Date().toISOString()
    };
    if (!validDesktopPreferences(next)) throw new TypeError('Desktop preferences are invalid.');
    await writeAtomicJson(this.filePath, next);
    this.state = next;
    return this.snapshot();
  }

  async update(mutator) {
    const draft = this.snapshot();
    const candidate = typeof mutator === 'function' ? (mutator(draft) || draft) : { ...draft, ...mutator };
    return this.replace(candidate);
  }
}
