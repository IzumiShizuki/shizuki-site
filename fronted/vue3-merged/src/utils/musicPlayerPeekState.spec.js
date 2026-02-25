import { describe, expect, it } from 'vitest';
import {
  MUSIC_PLAYER_PEEK_MODE,
  MUSIC_PLAYER_PEEK_STATE,
  isMusicPlayerPeekEligible,
  nextMusicPlayerPeekStateOnDiscClick,
  resolveMusicPlayerPeekMode,
  resolveMusicPlayerPeekState
} from './musicPlayerPeekState';

describe('musicPlayerPeekState', () => {
  it('returns hidden for non-home collapsed non-pinned player', () => {
    const context = {
      isHomeRoute: false,
      isExpanded: false,
      isPinned: false
    };

    expect(isMusicPlayerPeekEligible(context)).toBe(true);
    expect(resolveMusicPlayerPeekState(context)).toBe(MUSIC_PLAYER_PEEK_STATE.HIDDEN);
  });

  it('transitions hidden -> revealed -> expand on disc click', () => {
    const first = nextMusicPlayerPeekStateOnDiscClick({
      currentState: MUSIC_PLAYER_PEEK_STATE.HIDDEN,
      isPeekEligible: true
    });
    expect(first).toEqual({
      nextState: MUSIC_PLAYER_PEEK_STATE.REVEALED,
      action: 'reveal'
    });

    const second = nextMusicPlayerPeekStateOnDiscClick({
      currentState: MUSIC_PLAYER_PEEK_STATE.REVEALED,
      isPeekEligible: true
    });
    expect(second).toEqual({
      nextState: MUSIC_PLAYER_PEEK_STATE.REVEALED,
      action: 'expand'
    });
  });

  it('disables peek in pinned state', () => {
    const context = {
      isHomeRoute: false,
      isExpanded: false,
      isPinned: true
    };
    expect(isMusicPlayerPeekEligible(context)).toBe(false);
    expect(resolveMusicPlayerPeekState(context)).toBe(MUSIC_PLAYER_PEEK_STATE.REVEALED);
  });

  it('disables peek on home route', () => {
    const context = {
      isHomeRoute: true,
      isExpanded: false,
      isPinned: false
    };
    expect(isMusicPlayerPeekEligible(context)).toBe(false);
    expect(resolveMusicPlayerPeekState(context)).toBe(MUSIC_PLAYER_PEEK_STATE.REVEALED);
  });

  it('keeps non-home expanded state from becoming hidden', () => {
    const context = {
      isHomeRoute: false,
      isExpanded: true,
      isPinned: false
    };
    expect(isMusicPlayerPeekEligible(context)).toBe(false);
    expect(resolveMusicPlayerPeekState(context)).toBe(MUSIC_PLAYER_PEEK_STATE.REVEALED);
  });

  it('uses bottom-half mode on mobile and corner-quarter on desktop', () => {
    expect(resolveMusicPlayerPeekMode({ isMobileViewport: true })).toBe(MUSIC_PLAYER_PEEK_MODE.BOTTOM_HALF);
    expect(resolveMusicPlayerPeekMode({ isMobileViewport: false })).toBe(MUSIC_PLAYER_PEEK_MODE.CORNER_QUARTER);
  });
});

