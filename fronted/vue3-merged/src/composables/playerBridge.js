import { inject } from 'vue';

export const PLAYER_BRIDGE_KEY = Symbol('shizuki.playerBridge');

export function usePlayerBridge() {
  const bridge = inject(PLAYER_BRIDGE_KEY, null);
  if (!bridge) {
    throw new Error('Player bridge is not provided in current route context.');
  }
  return bridge;
}
