import { describe, expect, it } from 'vitest';
import {
  createConnectorShape,
  createGeoShape,
  fallbackMeasure,
  getAnchorPoint,
  getConnectorGeometry,
  getShapeAabb,
  hitTestShape,
  resolveAutoAnchorId,
  routeElbow,
  wrapTextLines
} from './feishuBoardCore';

describe('feishuBoardCore geometry', () => {
  it('computes anchors and honors rotation', () => {
    const shape = createGeoShape('rect', 100, 100);
    shape.w = 200;
    shape.h = 100;
    expect(getAnchorPoint(shape, 'top')).toEqual({ x: 200, y: 100 });
    expect(getAnchorPoint(shape, 'right')).toEqual({ x: 300, y: 150 });

    shape.rotation = Math.PI / 2;
    const rotated = getAnchorPoint(shape, 'top');
    expect(rotated.x).toBeCloseTo(250, 4);
    expect(rotated.y).toBeCloseTo(150, 4);
  });

  it('computes rotated aabb', () => {
    const shape = createGeoShape('rect', 0, 0);
    shape.w = 200;
    shape.h = 100;
    shape.rotation = Math.PI / 2;
    const aabb = getShapeAabb(shape);
    expect(aabb.w).toBeCloseTo(100, 4);
    expect(aabb.h).toBeCloseTo(200, 4);
  });

  it('hit-tests rect and diamond outlines', () => {
    const rect = createGeoShape('rect', 0, 0);
    rect.w = 100;
    rect.h = 100;
    expect(hitTestShape(rect, { x: 50, y: 50 })).toBe(true);
    expect(hitTestShape(rect, { x: 150, y: 150 })).toBe(false);

    const diamond = createGeoShape('diamond', 0, 0);
    diamond.w = 100;
    diamond.h = 100;
    expect(hitTestShape(diamond, { x: 50, y: 50 })).toBe(true);
    expect(hitTestShape(diamond, { x: 8, y: 8 })).toBe(false);
  });

  it('resolves auto anchor by direction', () => {
    const shape = createGeoShape('rect', 0, 0);
    shape.w = 100;
    shape.h = 100;
    expect(resolveAutoAnchorId(shape, { x: 300, y: 50 })).toBe('right');
    expect(resolveAutoAnchorId(shape, { x: 50, y: -300 })).toBe('top');
  });

  it('routes orthogonal elbow polylines', () => {
    const points = routeElbow({ x: 0, y: 0 }, { x: 1, y: 0 }, { x: 200, y: 120 }, { x: -1, y: 0 });
    expect(points.length).toBeGreaterThanOrEqual(3);
    for (let i = 1; i < points.length; i += 1) {
      const dx = Math.abs(points[i].x - points[i - 1].x);
      const dy = Math.abs(points[i].y - points[i - 1].y);
      expect(dx < 0.01 || dy < 0.01).toBe(true);
    }
    expect(points[0]).toEqual({ x: 0, y: 0 });
    expect(points[points.length - 1]).toEqual({ x: 200, y: 120 });
  });

  it('binds connector geometry to shape anchors', () => {
    const a = createGeoShape('rect', 0, 0);
    a.w = 100;
    a.h = 100;
    const b = createGeoShape('rect', 300, 0);
    b.w = 100;
    b.h = 100;
    const byId = new Map([
      [a.id, a],
      [b.id, b]
    ]);
    const connector = createConnectorShape({ shapeId: a.id, anchor: 'right' }, { shapeId: b.id, anchor: 'left' });
    const geometry = getConnectorGeometry(connector, (id) => byId.get(id));
    expect(geometry.start.point).toEqual({ x: 100, y: 50 });
    expect(geometry.end.point).toEqual({ x: 300, y: 50 });
  });

  it('wraps cjk text within width', () => {
    const measure = (value) => fallbackMeasure(value, 14);
    const lines = wrapTextLines('白板测试文本换行效果良好', 14 * 4, measure);
    expect(lines.length).toBeGreaterThanOrEqual(3);
    lines.forEach((line) => {
      expect(measure(line)).toBeLessThanOrEqual(14 * 4 + 0.01);
    });
  });
});
