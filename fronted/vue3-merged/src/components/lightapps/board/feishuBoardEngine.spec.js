import { describe, expect, it } from 'vitest';
import { FeishuBoardEngine } from './feishuBoardEngine';
import { createConnectorShape, createGeoShape } from './feishuBoardCore';
import { parseMermaidTextToGraph } from './boardMermaid';

function makeEngine() {
  const engine = new FeishuBoardEngine({ width: 800, height: 600 });
  engine.camera = { x: 0, y: 0, zoom: 1 };
  return engine;
}

describe('FeishuBoardEngine', () => {
  it('records history for mutations and supports undo/redo', () => {
    const engine = makeEngine();
    const shape = createGeoShape('rect', 100, 100);
    engine.mutate(() => engine.shapes.push(shape));
    expect(engine.shapes.length).toBe(1);
    expect(engine.history.undo.length).toBe(1);
    engine.undo();
    expect(engine.shapes.length).toBe(0);
    engine.redo();
    expect(engine.shapes.length).toBe(1);
  });

  it('serializes and reloads snapshots across engines', () => {
    const engine = makeEngine();
    const shape = createGeoShape('rect', 100, 100);
    engine.mutate(() => engine.shapes.push(shape));
    engine.setSelection([shape.id]);
    engine.duplicateSelection();
    expect(engine.shapes.length).toBe(2);

    const snapshot = engine.getSnapshot();
    expect(snapshot.engine).toBe('shizuki-feishu-board');
    expect(snapshot.shapes.length).toBe(2);

    const next = makeEngine();
    next.loadSnapshot(snapshot);
    expect(next.shapes.length).toBe(2);
    expect(next.history.undo.length).toBe(0);
  });

  it('unbinds connectors when a bound shape is deleted', () => {
    const engine = makeEngine();
    const a = createGeoShape('rect', 0, 0);
    const b = createGeoShape('rect', 300, 0);
    const connector = createConnectorShape({ shapeId: a.id, anchor: 'right' }, { shapeId: b.id, anchor: 'left' });
    engine.mutate(() => engine.shapes.push(a, b, connector));
    engine.deleteShapes([b.id]);
    expect(engine.shapes.length).toBe(2);
    const remaining = engine.getShapeById(connector.id);
    expect(remaining.props.end.shapeId).toBeUndefined();
    expect(Number.isFinite(remaining.props.end.x)).toBe(true);
  });

  it('marquee-selects then translates shapes', () => {
    const engine = makeEngine();
    const shape = createGeoShape('rect', 100, 100);
    shape.w = 100;
    shape.h = 100;
    engine.mutate(() => engine.shapes.push(shape));

    engine.handlePointerDown({ x: 50, y: 50 }, { button: 0 });
    engine.handlePointerMove({ x: 250, y: 250 }, {});
    engine.handlePointerUp({ x: 250, y: 250 }, {});
    expect([...engine.selection]).toEqual([shape.id]);

    engine.handlePointerDown({ x: 150, y: 150 }, { button: 0 });
    engine.handlePointerMove({ x: 210, y: 190 }, { altKey: true });
    engine.handlePointerUp({ x: 210, y: 190 }, { altKey: true });
    expect(engine.getShapeById(shape.id).x).toBe(160);
    expect(engine.getShapeById(shape.id).y).toBe(140);
  });

  it('quick-connects from an anchor to empty space and opens a choice', () => {
    const engine = makeEngine();
    const shape = createGeoShape('rect', 100, 100);
    shape.w = 100;
    shape.h = 100;
    engine.mutate(() => engine.shapes.push(shape));
    engine.setSelection([shape.id]);

    engine.handlePointerDown({ x: 200, y: 150 }, { button: 0 });
    expect(engine.interaction?.type).toBe('connect');
    engine.handlePointerMove({ x: 420, y: 150 }, {});
    engine.handlePointerUp({ x: 420, y: 150 }, {});
    expect(engine.pendingChoice).toBeTruthy();

    const created = engine.applyPendingChoice('rect');
    expect(created).toBeTruthy();
    const connector = engine.shapes.find((item) => item.type === 'connector');
    expect(connector.props.start.shapeId).toBe(shape.id);
    expect(connector.props.end.shapeId).toBe(created.id);
    engine.commitEdit();
  });

  it('imports a graph and exports it back with parity', () => {
    const engine = makeEngine();
    const graph = parseMermaidTextToGraph('flowchart TD\n  a[A] --> b[B]\n  b --> c[C]');
    const result = engine.importGraph(graph);
    expect(result.createdNodeCount).toBe(3);
    expect(result.createdEdgeCount).toBe(2);
    const exported = engine.exportGraph('FLOWCHART');
    expect(exported.graph.nodes.length).toBe(3);
    expect(exported.graph.edges.length).toBe(2);
  });

  it('applies style patches to the selection and remembers last styles', () => {
    const engine = makeEngine();
    const shape = createGeoShape('rect', 0, 0);
    engine.mutate(() => engine.shapes.push(shape));
    engine.setSelection([shape.id]);
    engine.setSelectionStyle({ fill: '#E1EAFF', stroke: '#3370FF', strokeWidth: 4 });
    const updated = engine.getShapeById(shape.id);
    expect(updated.props.fill).toBe('#E1EAFF');
    expect(updated.props.stroke).toBe('#3370FF');
    expect(updated.props.strokeWidth).toBe(4);
    expect(engine.lastStyles.geo.fill).toBe('#E1EAFF');
  });
});
