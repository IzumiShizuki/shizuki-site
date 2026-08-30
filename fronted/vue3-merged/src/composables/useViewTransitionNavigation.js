import { readonly, ref } from 'vue';
import { useRouter } from 'vue-router';
import { useMotionPreference } from './useMotionPreference';

const activeRouteTransitionNameState = ref('');
let pendingFocusTarget = '';

export const activeRouteTransitionName = readonly(activeRouteTransitionNameState);

function normalizeTransitionSegment(value, fallback = 'content') {
  const normalized = String(value || '')
    .trim()
    .toLowerCase()
    .replace(/[^a-z0-9_-]+/g, '-')
    .replace(/^-+|-+$/g, '')
    .slice(0, 80);
  return normalized || fallback;
}

export function resolveSharedTransitionName(value, prefix = 'content-flow') {
  return `${normalizeTransitionSegment(prefix, 'content-flow')}-${normalizeTransitionSegment(value)}`;
}

export function resolveMemoryLensName(value) {
  return resolveSharedTransitionName(value, 'memory-lens');
}

export function supportsNativeViewTransitions(documentTarget = typeof document !== 'undefined' ? document : null) {
  return typeof documentTarget?.startViewTransition === 'function';
}

export function consumeRouteFocusTarget(target) {
  const normalized = String(target || '').trim();
  if (!normalized || pendingFocusTarget !== normalized) return false;
  pendingFocusTarget = '';
  return true;
}

export function __resetViewTransitionNavigationForTests() {
  activeRouteTransitionNameState.value = '';
  pendingFocusTarget = '';
}

export function useViewTransitionNavigation({ router = useRouter() } = {}) {
  const motion = useMotionPreference();

  async function navigate(
    to,
    { sourceElement = null, sharedName = '', transitionKind = 'memory-lens', focusTarget = '' } = {}
  ) {
    const normalizedKind = normalizeTransitionSegment(transitionKind, 'content-flow');
    const transitionName = resolveSharedTransitionName(sharedName, normalizedKind);
    const normalizedFocusTarget = String(focusTarget || '').trim();
    if (normalizedFocusTarget) pendingFocusTarget = normalizedFocusTarget;

    const clearRejectedFocus = () => {
      if (normalizedFocusTarget && pendingFocusTarget === normalizedFocusTarget) pendingFocusTarget = '';
    };
    const pushRoute = () => Promise.resolve(router.push(to)).catch((error) => {
      clearRejectedFocus();
      throw error;
    });
    const canTransition = motion.effectiveMode.value === 'immersive'
      && supportsNativeViewTransitions();
    if (!canTransition) return pushRoute();

    const previousName = sourceElement?.style?.viewTransitionName || '';
    if (sourceElement?.style) sourceElement.style.viewTransitionName = transitionName;
    activeRouteTransitionNameState.value = transitionName;
    document.documentElement.dataset.routeTransition = normalizedKind;

    let transition;
    try {
      transition = document.startViewTransition(pushRoute);
    } catch {
      if (sourceElement?.style) sourceElement.style.viewTransitionName = previousName;
      activeRouteTransitionNameState.value = '';
      delete document.documentElement.dataset.routeTransition;
      return pushRoute();
    }

    const cleanup = () => {
      if (sourceElement?.style) sourceElement.style.viewTransitionName = previousName;
      if (activeRouteTransitionNameState.value === transitionName) activeRouteTransitionNameState.value = '';
      delete document.documentElement.dataset.routeTransition;
    };
    Promise.resolve(transition?.finished).catch(() => {}).finally(cleanup);
    return transition;
  }

  return Object.freeze({ navigate });
}
