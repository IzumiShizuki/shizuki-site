export const MUSIC_PLAYER_PEEK_STATE = Object.freeze({
  HIDDEN: 'hidden',
  REVEALED: 'revealed'
});

export const MUSIC_PLAYER_PEEK_MODE = Object.freeze({
  CORNER_QUARTER: 'corner-quarter',
  BOTTOM_HALF: 'bottom-half'
});

export function isMusicPlayerPeekEligible({ isHomeRoute, isExpanded, isPinned }) {
  return !Boolean(isHomeRoute) && !Boolean(isExpanded) && !Boolean(isPinned);
}

export function resolveMusicPlayerPeekMode({ isMobileViewport }) {
  return isMobileViewport ? MUSIC_PLAYER_PEEK_MODE.BOTTOM_HALF : MUSIC_PLAYER_PEEK_MODE.CORNER_QUARTER;
}

export function resolveMusicPlayerPeekState(context) {
  return isMusicPlayerPeekEligible(context) ? MUSIC_PLAYER_PEEK_STATE.HIDDEN : MUSIC_PLAYER_PEEK_STATE.REVEALED;
}

export function nextMusicPlayerPeekStateOnDiscClick({ currentState, isPeekEligible }) {
  if (!isPeekEligible) {
    return { nextState: MUSIC_PLAYER_PEEK_STATE.REVEALED, action: 'expand' };
  }

  if (currentState === MUSIC_PLAYER_PEEK_STATE.HIDDEN) {
    return { nextState: MUSIC_PLAYER_PEEK_STATE.REVEALED, action: 'reveal' };
  }

  return { nextState: MUSIC_PLAYER_PEEK_STATE.REVEALED, action: 'expand' };
}

