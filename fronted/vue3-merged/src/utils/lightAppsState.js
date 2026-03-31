import { LIGHT_APP_CODES, isKnownLightAppCode } from './lightAppsCatalog';

export const LIGHT_APPS_STORAGE_KEY = 'shizuki.lightApps.v2';
export const LIGHT_APPS_CHANGED_EVENT = 'shizuki:light-apps-changed';
export const LIGHT_APPS_PREFERENCE_KEY = 'light_apps';
export const MAX_DOCK_SLOTS = 8;
export const MAX_BALL_SLOTS = MAX_DOCK_SLOTS;
export const MAX_RAIL_SLOTS = MAX_DOCK_SLOTS;
export const DEFAULT_COLLECTION_ID = 'default';

const TIMEPRISM_TODO_CODE = 'timeprism-todo';
const LEGACY_TIMEPRISM_CODE_MAP = Object.freeze({
  'timeprism-board': TIMEPRISM_TODO_CODE,
  'timeprism-schedule': TIMEPRISM_TODO_CODE,
  'timeprism-projects': TIMEPRISM_TODO_CODE
});

const DEFAULT_ENABLED_CODES = Object.freeze([TIMEPRISM_TODO_CODE]);
const DEFAULT_RAIL_SLOT_BLUEPRINT = Object.freeze([
  { enabled: true, item_kind: 'app', item_ref: TIMEPRISM_TODO_CODE },
  { enabled: false, item_kind: 'app', item_ref: '' },
  { enabled: false, item_kind: 'app', item_ref: '' },
  { enabled: false, item_kind: 'app', item_ref: '' },
  { enabled: false, item_kind: 'app', item_ref: '' },
  { enabled: false, item_kind: 'app', item_ref: '' },
  { enabled: false, item_kind: 'app', item_ref: '' },
  { enabled: false, item_kind: 'app', item_ref: '' }
]);
const DEFAULT_COLLECTION = Object.freeze({
  collection_id: DEFAULT_COLLECTION_ID,
  title: '集合',
  items: []
});

function toObject(value) {
  return value && typeof value === 'object' && !Array.isArray(value) ? value : {};
}

function normalizeCodeAlias(rawCode) {
  const code = String(rawCode || '').trim();
  if (!code) return '';
  return LEGACY_TIMEPRISM_CODE_MAP[code] || code;
}

function uniqueKnownCodes(codes) {
  const source = Array.isArray(codes) ? codes : [];
  const seen = new Set();
  const output = [];

  source.forEach((item) => {
    const code = normalizeCodeAlias(item);
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

  if (enabledSet.has(TIMEPRISM_TODO_CODE) && source[TIMEPRISM_TODO_CODE] && typeof source[TIMEPRISM_TODO_CODE] === 'object') {
    next[TIMEPRISM_TODO_CODE] = toObject(source[TIMEPRISM_TODO_CODE]);
  }

  Object.entries(source).forEach(([rawCode, value]) => {
    const code = normalizeCodeAlias(rawCode);
    if (!enabledSet.has(code)) return;
    if (Object.prototype.hasOwnProperty.call(next, code)) return;
    next[code] = toObject(value);
  });

  return next;
}

function resolveKnownCode(raw) {
  const code = normalizeCodeAlias(raw);
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

function normalizeDockItemKind(rawKind) {
  const kind = String(rawKind || '').trim().toLowerCase();
  if (kind === 'picker') return 'picker';
  if (kind === 'url') return 'url';
  if (kind === 'collection') return 'collection';
  return 'app';
}

function normalizeCollectionItem(rawItem) {
  const source = toObject(rawItem);
  const kind = normalizeDockItemKind(source.item_kind || source.itemKind);
  if (kind !== 'app' && kind !== 'url') return null;

  if (kind === 'app') {
    const code = resolveKnownCode(source.item_ref || source.itemRef || source.app_code || source.appCode);
    if (!code) return null;
    return {
      item_kind: 'app',
      item_ref: code
    };
  }

  const ref = String(source.item_ref || source.itemRef || source.url_link_id || source.urlLinkId || '').trim();
  if (!ref) return null;
  return {
    item_kind: 'url',
    item_ref: ref
  };
}

function normalizeCollections(input) {
  const source = Array.isArray(input)
    ? input
    : Object.values(toObject(input));

  const normalizeCollectionItems = (rawItems) => {
    const dedup = new Set();
    return (Array.isArray(rawItems) ? rawItems : [])
      .map((entry) => normalizeCollectionItem(entry))
      .filter((entry) => {
        if (!entry) return false;
        const key = `${entry.item_kind}:${entry.item_ref}`;
        if (dedup.has(key)) return false;
        dedup.add(key);
        return true;
      });
  };

  const mergedById = new Map();
  source.forEach((raw) => {
    const item = toObject(raw);
    const collectionId = String(item.collection_id || item.collectionId || '').trim();
    if (!collectionId) return;

    const title = String(item.title || '').trim() || '集合';
    const nextItems = normalizeCollectionItems(item.items);
    const current = mergedById.get(collectionId);
    if (!current) {
      mergedById.set(collectionId, {
        collection_id: collectionId,
        title,
        items: nextItems
      });
      return;
    }

    const dedup = new Set(current.items.map((entry) => `${entry.item_kind}:${entry.item_ref}`));
    nextItems.forEach((entry) => {
      const key = `${entry.item_kind}:${entry.item_ref}`;
      if (dedup.has(key)) return;
      dedup.add(key);
      current.items.push(entry);
    });
    if (!String(current.title || '').trim() && title) {
      current.title = title;
    }
  });

  const normalized = Array.from(mergedById.values());
  if (normalized.length === 0) {
    return [{ ...DEFAULT_COLLECTION, items: [] }];
  }
  return normalized;
}

function normalizeRailSlots(input, enabledCodes, collections = []) {
  const source = Array.isArray(input) ? input : [];
  const normalized = [];
  const usedAppCodes = new Set();
  const dedupeKeys = new Set();
  const collectionIds = new Set(
    (Array.isArray(collections) ? collections : [])
      .map((entry) => String(entry?.collection_id || '').trim())
      .filter(Boolean)
  );
  const fallbackCollectionId = (Array.isArray(collections) ? collections : [])
    .map((entry) => String(entry?.collection_id || '').trim())
    .find(Boolean) || DEFAULT_COLLECTION_ID;

  for (let i = 0; i < MAX_RAIL_SLOTS; i += 1) {
    const fallback = DEFAULT_RAIL_SLOT_BLUEPRINT[i] || { enabled: false, item_kind: 'app', item_ref: '' };
    const raw = toObject(source[i]);

    const enabled = raw.enabled === undefined ? Boolean(fallback.enabled) : Boolean(raw.enabled);

    const legacyType = String(raw.type || '').trim().toLowerCase();
    const rawKind = raw.item_kind || raw.itemKind || (legacyType === 'picker' ? 'picker' : 'app');
    const itemKind = normalizeDockItemKind(rawKind);

    let itemRef = String(
      raw.item_ref || raw.itemRef || raw.app_code || raw.appCode || fallback.item_ref || fallback.itemRef || ''
    ).trim();

    if (itemKind === 'app') {
      itemRef = resolveKnownCode(itemRef);
      if (itemRef && enabledCodes.includes(itemRef)) {
        usedAppCodes.add(itemRef);
      }

      if (!enabled) {
        itemRef = '';
      } else if (!itemRef || !enabledCodes.includes(itemRef)) {
        itemRef = pickFallbackAppCode(enabledCodes, usedAppCodes);
      }
    } else if (itemKind === 'picker') {
      itemRef = '';
    } else if (itemKind === 'collection') {
      itemRef = String(raw.item_ref || raw.itemRef || raw.collection_id || raw.collectionId || '').trim();
      if (!enabled) {
        itemRef = '';
      } else if (!itemRef || !collectionIds.has(itemRef)) {
        itemRef = fallbackCollectionId;
      }
    } else if (itemKind === 'url') {
      itemRef = String(raw.item_ref || raw.itemRef || raw.url_link_id || raw.urlLinkId || '').trim();
      if (!enabled || !itemRef) {
        itemRef = '';
      }
    }

    const slot = {
      enabled,
      item_kind: itemKind,
      item_ref: itemRef
    };

    if (!slot.enabled || !slot.item_ref || slot.item_kind === 'picker') {
      normalized.push(slot);
      continue;
    }

    const dedupeKey = `${slot.item_kind}:${slot.item_ref}`;
    if (dedupeKeys.has(dedupeKey)) {
      normalized.push({
        ...slot,
        enabled: false,
        item_ref: ''
      });
      continue;
    }

    dedupeKeys.add(dedupeKey);
    normalized.push(slot);
  }

  return normalized;
}

function buildLegacyBallSlotsFromRail(railSlots) {
  return railSlots.map((slot) => {
    if (!slot?.enabled) {
      return {
        enabled: false,
        type: 'app',
        app_code: ''
      };
    }

    if (slot.item_kind === 'picker') {
      return {
        enabled: true,
        type: 'picker',
        app_code: ''
      };
    }

    if (slot.item_kind === 'app') {
      return {
        enabled: true,
        type: 'app',
        app_code: slot.item_ref || ''
      };
    }

    return {
      enabled: slot.enabled,
      type: 'app',
      app_code: ''
    };
  });
}

function buildRailSlotsFromLegacy(input, enabledCodes) {
  if (Array.isArray(input)) {
    return normalizeRailSlots(
      input.map((slot) => {
        const item = toObject(slot);
        const type = String(item.type || '').trim().toLowerCase();
        if (type === 'picker') {
          return {
            enabled: Boolean(item.enabled),
            item_kind: 'picker',
            item_ref: ''
          };
        }
        return {
          enabled: Boolean(item.enabled),
          item_kind: 'app',
          item_ref: item.app_code || item.appCode || ''
        };
      }),
      enabledCodes,
      [{ ...DEFAULT_COLLECTION, items: [] }]
    );
  }
  return normalizeRailSlots([], enabledCodes, [{ ...DEFAULT_COLLECTION, items: [] }]);
}

function buildRailSlotsFromLegacyFloatingCodes(floatingCodes, enabledCodes) {
  const codes = uniqueKnownCodes(floatingCodes).filter((code) => enabledCodes.includes(code));
  return normalizeRailSlots(
    DEFAULT_RAIL_SLOT_BLUEPRINT.map((slot, index) => {
      const code = codes[index] || '';
      if (!code) {
        return { enabled: false, item_kind: 'app', item_ref: '' };
      }
      return { enabled: true, item_kind: 'app', item_ref: code };
    }),
    enabledCodes,
    [{ ...DEFAULT_COLLECTION, items: [] }]
  );
}

function fromLegacyState(source) {
  const enabledCodes = resolveEnabledCodes(source.enabledCodes || source.enabled_codes);
  const legacyConfigs = source.configs || source.app_configs;
  const legacyFloatingCodes = source.floatingCodes || source.floating_codes;
  const railSlots = buildRailSlotsFromLegacyFloatingCodes(legacyFloatingCodes, enabledCodes);

  return {
    enabled_codes: enabledCodes,
    rail_slots: railSlots,
    ball_slots: buildLegacyBallSlotsFromRail(railSlots),
    collections: normalizeCollections(source.collections),
    app_configs: normalizeConfigs(legacyConfigs, enabledCodes)
  };
}

export function createDefaultLightAppsState() {
  const enabledCodes = resolveEnabledCodes(DEFAULT_ENABLED_CODES);
  const collections = [{ ...DEFAULT_COLLECTION, items: [] }];
  const railSlots = normalizeRailSlots(DEFAULT_RAIL_SLOT_BLUEPRINT, enabledCodes, collections);
  return {
    enabled_codes: enabledCodes,
    rail_slots: railSlots,
    // `ball_slots` remains a derived legacy alias for older payloads.
    ball_slots: buildLegacyBallSlotsFromRail(railSlots),
    collections,
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
  const collections = normalizeCollections(source.collections);
  const rawRailSlots = source.rail_slots || source.railSlots;
  const railSlots = rawRailSlots
    ? normalizeRailSlots(rawRailSlots, enabledCodes, collections)
    : buildRailSlotsFromLegacy(source.ball_slots || source.ballSlots || source.floating_slots || source.floatingSlots, enabledCodes);
  const appConfigs = normalizeConfigs(source.app_configs || source.appConfigs || source.configs, enabledCodes);

  return {
    enabled_codes: enabledCodes,
    rail_slots: railSlots,
    // `rail_slots` is the canonical persisted structure; `ball_slots` is compat only.
    ball_slots: buildLegacyBallSlotsFromRail(railSlots),
    collections,
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
