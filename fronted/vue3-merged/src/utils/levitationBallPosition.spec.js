import { describe, expect, it } from 'vitest';
import {
  DEFAULT_LEVITATION_BALL_POSITION,
  LEVITATION_BALL_POSITION_STORAGE_KEY,
  readLevitationBallPosition,
  resolveLevitationBallCoordinates,
  resolveLevitationBallYRatio,
  resolveNearestLevitationBallSide,
  writeLevitationBallPosition
} from './levitationBallPosition';

describe('levitation ball position', () => {
  it('starts on the upper-middle right edge without saved state', () => {
    const point = resolveLevitationBallCoordinates(DEFAULT_LEVITATION_BALL_POSITION, {
      viewportWidth: 1440,
      viewportHeight: 900,
      width: 58,
      height: 58
    });

    expect(point.side).toBe('right');
    expect(point.x).toBe(1374);
    expect(point.y).toBeGreaterThan(250);
    expect(point.y).toBeLessThan(310);
  });

  it('chooses the nearest edge from the ball center', () => {
    expect(resolveNearestLevitationBallSide(120, { viewportWidth: 1200, width: 58 })).toBe('left');
    expect(resolveNearestLevitationBallSide(900, { viewportWidth: 1200, width: 58 })).toBe('right');
  });

  it('restores a saved edge and normalized vertical position across viewport sizes', () => {
    const storage = window.localStorage;
    storage.clear();
    writeLevitationBallPosition({ side: 'left', yRatio: 0.6 }, storage);

    expect(JSON.parse(storage.getItem(LEVITATION_BALL_POSITION_STORAGE_KEY))).toMatchObject({ side: 'left', yRatio: 0.6 });
    expect(readLevitationBallPosition(storage)).toMatchObject({ side: 'left', yRatio: 0.6 });

    const point = resolveLevitationBallCoordinates(readLevitationBallPosition(storage), {
      viewportWidth: 1024,
      viewportHeight: 768,
      width: 58,
      height: 58
    });
    expect(point.x).toBe(8);
    expect(point.y).toBeCloseTo(424.4, 1);
    expect(resolveLevitationBallYRatio(point.y, { viewportHeight: 768, height: 58 })).toBeCloseTo(0.6, 4);
  });
});
