import { computed, readonly, ref } from 'vue';

// Retained only so Home appearance can migrate the previously global value once.
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
const effectiveMode = computed(() => DEFAULT_MOTION_MODE);
let initialized = false;

export function normalizeMotionMode(value, fallback = DEFAULT_MOTION_MODE) {
  const normalized = String(value ?? '').trim().toLowerCase();
  if (MOTION_MODES.includes(normalized)) return normalized;
  if (LEGACY_MODE_MAP[normalized]) return LEGACY_MODE_MAP[normalized];
  return MOTION_MODES.includes(fallback) ? fallback : DEFAULT_MOTION_MODE;
}

function applyRootAttributes(documentTarget = typeof document !== 'undefined' ? document : null) {
  const root = documentTarget?.documentElement;
  if (!root?.dataset) return;
  root.dataset.motionMode = DEFAULT_MOTION_MODE;
  root.dataset.effectiveMotionMode = DEFAULT_MOTION_MODE;
}

export function initializeMotionPreference() {
  if (!initialized) initialized = true;
  storedMode.value = DEFAULT_MOTION_MODE;
  systemReducedMotion.value = false;
  applyRootAttributes();
  return DEFAULT_MOTION_MODE;
}

// Compatibility adapter for old non-Home consumers. Selectable motion now belongs to Home appearance.
export function setMotionMode() {
  initializeMotionPreference();
  return DEFAULT_MOTION_MODE;
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
  initialized = false;
  storedMode.value = DEFAULT_MOTION_MODE;
  systemReducedMotion.value = false;
  if (typeof document !== 'undefined' && document.documentElement?.dataset) {
    delete document.documentElement.dataset.motionMode;
    delete document.documentElement.dataset.effectiveMotionMode;
  }
}
