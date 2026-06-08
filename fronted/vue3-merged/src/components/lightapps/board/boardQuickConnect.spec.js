import { describe, expect, it } from 'vitest';
import {
  BOARD_DEFAULT_LABEL_COLOR,
  BOARD_DEFAULT_SHAPE_COLOR,
  BOARD_DEFAULT_SHAPE_FILL,
  QUICK_CONNECT_CHOICE_TOOLS,
  getBoardDefaultShapeStyleProps,
  getQuickConnectShapeSize,
  resolveBoundsEdgePointToward,
  resolveBoundsPointFromNormalizedAnchor,
  resolveNearestDirectionalTarget,
  resolveQuickConnectFallbackPoint,
  resolveQuickConnectSpawnCenter
} from './boardQuickConnect';

describe('boardQuickConnect', () => {
  it('provides default Feishu-like shape fill style', () => {
    expect(getBoardDefaultShapeStyleProps()).toMatchObject({
      color: BOARD_DEFAULT_SHAPE_COLOR,
      fill: BOARD_DEFAULT_SHAPE_FILL,
      labelColor: BOARD_DEFAULT_LABEL_COLOR
    });
  });

  it('uses distinct initial colors for quick-connect shape choices', () => {
    const colors = QUICK_CONNECT_CHOICE_TOOLS.map((tool) => getBoardDefaultShapeStyleProps(tool.id).color);

    expect(new Set(colors).size).toBe(colors.length);
    expect(getBoardDefaultShapeStyleProps('ellipse')).toMatchObject({ color: 'light-green' });
    expect(getBoardDefaultShapeStyleProps('text')).toMatchObject({ color: 'violet' });
  });

  it('places a quick-created next shape beyond the arrow drop point', () => {
    expect(getQuickConnectShapeSize('rectangle')).toMatchObject({
      width: 300,
      height: 112
    });
    expect(resolveQuickConnectSpawnCenter({ x: 100, y: 100 }, { x: 260, y: 104 }, 'rectangle')).toMatchObject({
      x: 422,
      y: 104
    });
    expect(resolveQuickConnectSpawnCenter({ x: 100, y: 100 }, { x: 96, y: 300 }, 'ellipse')).toMatchObject({
      x: 96,
      y: 382
    });
  });

  it('resolves exact edge points for arrow binding', () => {
    const bounds = { x: 200, y: 120, w: 220, h: 140 };

    expect(resolveBoundsEdgePointToward(bounds, { x: 80, y: 190 })).toEqual({ x: 200, y: 190 });
    expect(resolveBoundsEdgePointToward(bounds, { x: 500, y: 190 })).toEqual({ x: 420, y: 190 });
    expect(resolveBoundsPointFromNormalizedAnchor(bounds, { x: 1, y: 0.5 })).toEqual({ x: 420, y: 190 });
  });

  it('resolves nearest target in the chosen direction', () => {
    const source = { x: 100, y: 100, w: 220, h: 120 };
    const candidates = [
      { id: 'above', bounds: { x: 120, y: -80, w: 220, h: 100 } },
      { id: 'right-far', bounds: { x: 620, y: 104, w: 220, h: 100 } },
      { id: 'right-near', bounds: { x: 380, y: 126, w: 220, h: 100 } },
      { id: 'below', bounds: { x: 100, y: 330, w: 220, h: 100 } }
    ];

    expect(resolveNearestDirectionalTarget(source, candidates, 'right')?.id).toBe('right-near');
    expect(resolveNearestDirectionalTarget(source, candidates, 'top')?.id).toBe('above');
    expect(resolveNearestDirectionalTarget(source, candidates, 'left')).toBeNull();
  });

  it('extends a fallback line from the requested edge when no target exists', () => {
    expect(resolveQuickConnectFallbackPoint({ x: 100, y: 100 }, 'right')).toEqual({ x: 360, y: 100 });
    expect(resolveQuickConnectFallbackPoint({ x: 100, y: 100 }, 'left')).toEqual({ x: -160, y: 100 });
    expect(resolveQuickConnectFallbackPoint({ x: 100, y: 100 }, 'bottom')).toEqual({ x: 100, y: 360 });
    expect(resolveQuickConnectFallbackPoint({ x: 100, y: 100 }, 'top')).toEqual({ x: 100, y: -160 });
  });
});
