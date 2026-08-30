import { computed, readonly, ref } from 'vue';

export const MOTION_PREFERENCE_STORAGE_KEY = 'shizuki.motionPreference.v1';
export const LEGACY_HOME_APPEARANCE_STORAGE_KEY = 'shizuki.homeAppearance.v1';
export const MOTION_MODES = Object.freeze(['immersive', 'soothing']);
export const DEFAULT_MOTION_MODE = 'immersive';

const LEGACY_MODE_MAP = Object.freeze({
  vivid: 'immersive',
  calm: 'soothing',
  off: 'soothing'
});

const storedMode = ref(DEFAULT_MOTION_MODE);
const systemReducedMotion = ref(false);
const effectiveMode = computed(() => (
  systemReducedMotion.value ? 'soothing' : storedMode.value
));

let initialized = false;
let activeStorage = null;
let reducedMotionQuery = null;
let reducedMotionListener = null;

function defaultStorage() {
  return typeof window !== 'undefined' ? window.localStorage : null;
}

function defaultWindowTarget() {
  return typeof window !== 'undefined' ? window : null;
}

export function normalizeMotionMode(value, fallback = DEFAULT_MOTION_MODE) {
  const normalized = String(value ?? '').trim().toLowerCase();
  if (MOTION_MODES.includes(normalized)) return normalized;
  if (LEGACY_MODE_MAP[normalized]) return LEGACY_MODE_MAP[normalized];
  return MOTION_MODES.includes(fallback) ? fallback : DEFAULT_MOTION_MODE;
}

function readStoredCandidate(raw) {
  if (raw === null || raw === undefined || raw === '') return '';
  let value = raw;
  if (typeof raw === 'string') {
    try {
      value = JSON.parse(raw);
    } catch {
      value = raw;
    }
  }
  if (value && typeof value === 'object' && !Array.isArray(value)) {
    return value.mode ?? value.storedMode ?? value.motionLevel ?? '';
  }
  return value;
}

function readStorageItem(storage, key) {
  if (!storage?.getItem) return null;
  try {
    return storage.getItem(key);
  } catch {
    return null;
  }
}

function persistMode(storage = activeStorage) {
  if (!storage?.setItem) return;
  try {
    storage.setItem(MOTION_PREFERENCE_STORAGE_KEY, JSON.stringify({
      version: 1,
      mode: storedMode.value
    }));
  } catch {
    // Keep the in-memory preference usable when storage is unavailable.
  }
}

function scrubLegacyHomeMotion(storage) {
  if (!storage?.getItem) return;
  const raw = readStorageItem(storage, LEGACY_HOME_APPEARANCE_STORAGE_KEY);
  if (!raw) return;
  let legacy;
  try {
    legacy = JSON.parse(raw);
  } catch {
    try {
      storage.removeItem?.(LEGACY_HOME_APPEARANCE_STORAGE_KEY);
    } catch {
      // Ignore cleanup failure for an unreadable legacy snapshot.
    }
    return;
  }
  if (!legacy || typeof legacy !== 'object' || Array.isArray(legacy)) {
    try {
      storage.removeItem?.(LEGACY_HOME_APPEARANCE_STORAGE_KEY);
    } catch {
      // Ignore cleanup failure for an invalid legacy snapshot.
    }
    return;
  }
  if (!Object.prototype.hasOwnProperty.call(legacy, 'motionLevel')) return;
  delete legacy.motionLevel;
  try {
    storage.setItem(LEGACY_HOME_APPEARANCE_STORAGE_KEY, JSON.stringify(legacy));
  } catch {
    // The new value is already persisted; keep unrelated legacy Home settings intact.
  }
}

function applyRootAttributes(documentTarget = typeof document !== 'undefined' ? document : null) {
  const root = documentTarget?.documentElement;
  if (!root?.dataset) return;
  root.dataset.motionMode = storedMode.value;
  root.dataset.effectiveMotionMode = effectiveMode.value;
}

function updateSystemReducedMotion(matches) {
  systemReducedMotion.value = Boolean(matches);
  applyRootAttributes();
}

function bindReducedMotion(windowTarget) {
  if (typeof windowTarget?.matchMedia !== 'function') {
    updateSystemReducedMotion(false);
    return;
  }
  reducedMotionQuery = windowTarget.matchMedia('(prefers-reduced-motion: reduce)');
  updateSystemReducedMotion(reducedMotionQuery.matches);
  reducedMotionListener = (event) => updateSystemReducedMotion(event?.matches);
  if (typeof reducedMotionQuery.addEventListener === 'function') {
    reducedMotionQuery.addEventListener('change', reducedMotionListener);
  } else if (typeof reducedMotionQuery.addListener === 'function') {
    reducedMotionQuery.addListener(reducedMotionListener);
  }
}

function unbindReducedMotion() {
  if (!reducedMotionQuery || !reducedMotionListener) return;
  if (typeof reducedMotionQuery.removeEventListener === 'function') {
    reducedMotionQuery.removeEventListener('change', reducedMotionListener);
  } else if (typeof reducedMotionQuery.removeListener === 'function') {
    reducedMotionQuery.removeListener(reducedMotionListener);
  }
  reducedMotionQuery = null;
  reducedMotionListener = null;
}

export function initializeMotionPreference({
  storage = defaultStorage(),
  windowTarget = defaultWindowTarget()
} = {}) {
  if (initialized) return storedMode.value;
  initialized = true;
  activeStorage = storage;

  const currentRaw = readStorageItem(storage, MOTION_PREFERENCE_STORAGE_KEY);
  const legacyRaw = currentRaw === null
    ? readStorageItem(storage, LEGACY_HOME_APPEARANCE_STORAGE_KEY)
    : null;
  const candidate = currentRaw === null
    ? readStoredCandidate(legacyRaw)
    : readStoredCandidate(currentRaw);

  storedMode.value = normalizeMotionMode(candidate);
  persistMode(storage);
  scrubLegacyHomeMotion(storage);
  bindReducedMotion(windowTarget);
  applyRootAttributes();
  return storedMode.value;
}

export function setMotionMode(value, storage = activeStorage || defaultStorage()) {
  storedMode.value = normalizeMotionMode(value);
  activeStorage = storage;
  persistMode(storage);
  applyRootAttributes();
  return storedMode.value;
}

const motionPreference = Object.freeze({
  storedMode: readonly(storedMode),
  effectiveMode,
  systemReducedMotion: readonly(systemReducedMotion),
  initialize: initializeMotionPreference,
  setMode: setMotionMode
});

export function useMotionPreference() {
  initializeMotionPreference();
  return motionPreference;
}

export function __resetMotionPreferenceForTests() {
  unbindReducedMotion();
  initialized = false;
  activeStorage = null;
  storedMode.value = DEFAULT_MOTION_MODE;
  systemReducedMotion.value = false;
  if (typeof document !== 'undefined' && document.documentElement?.dataset) {
    delete document.documentElement.dataset.motionMode;
    delete document.documentElement.dataset.effectiveMotionMode;
  }
}
