import { computed, ref, watch } from 'vue';
import { useAuthSession } from './useAuthSession';

const mode = ref('normal');
let accountKey = '';
let activations = 0;
let activationStart = 0;

export function resetCompanionMode() {
  mode.value = 'normal';
  activations = 0;
  activationStart = 0;
}

// Presentation state is intentionally never persisted or used as a server grant.
export function useCompanionMode(auth = useAuthSession()) {
  const isOwner = computed(() => auth.isAuthenticated.value &&
    (auth.user.value?.groups || []).some((group) => String(group).trim().toUpperCase() === 'ADMIN'));
  const identity = computed(() => auth.isAuthenticated.value
    ? String(auth.user.value?.userId || auth.user.value?.id || '') : '');

  watch([identity, isOwner], ([id, owner]) => {
    if (accountKey !== id || !owner) resetCompanionMode();
    accountKey = id;
  }, { immediate: true, flush: 'sync' });

  const isAnime = computed(() => isOwner.value && mode.value === 'anime' && accountKey === identity.value);

  function registerActivation() {
    if (!isOwner.value) return false;
    const now = Date.now();
    if (!activations || now - activationStart > 3000) {
      activations = 0;
      activationStart = now;
    }
    activations += 1;
    if (activations < 5) return false;
    activations = 0;
    mode.value = 'anime';
    return true;
  }

  return { isAnime, registerActivation, returnToNormal: resetCompanionMode };
}
