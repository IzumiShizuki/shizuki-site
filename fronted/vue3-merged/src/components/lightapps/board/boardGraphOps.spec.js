import { describe, expect, it } from 'vitest';
import { assignFlowLevels, extractGraphFromShapes, layoutGraphToShapes } from './boardGraphOps';
import { graphToMermaidText, parseMermaidTextToGraph } from './boardMermaid';

describe('boardGraphOps', () => {
  it('assigns layered flow levels tolerating extra edges', () => {
    const nodes = [{ id: 'a' }, { id: 'b' }, { id: 'c' }, { id: 'd' }];
    const edges = [
      { from: 'a', to: 'b' },
      { from: 'b', to: 'c' },
      { from: 'a', to: 'c' },
      { from: 'c', to: 'd' }
    ];
    const levels = assignFlowLevels(nodes, edges);
    expect(levels.get('a')).toBe(0);
    expect(levels.get('b')).toBe(1);
    expect(levels.get('c')).toBe(2);
    expect(levels.get('d')).toBe(3);
  });

  it('lays out a flowchart into geo nodes + connectors', () => {
    const graph = parseMermaidTextToGraph('flowchart TD\n  a[开始] --> b{判断}\n  b -->|是| c[结束]\n  b -->|否| a');
    const result = layoutGraphToShapes(graph);
    expect(result.createdNodeCount).toBe(3);
    expect(result.createdEdgeCount).toBe(3);
    const geo = result.shapes.filter((shape) => shape.type === 'geo');
    const connectors = result.shapes.filter((shape) => shape.type === 'connector');
    expect(geo.length).toBe(3);
    expect(connectors.length).toBe(3);
    connectors.forEach((connector) => {
      expect(connector.props.start.shapeId).toBeTruthy();
      expect(connector.props.end.shapeId).toBeTruthy();
    });
  });

  it('lays out a mindmap with root ellipse and rightward children', () => {
    const graph = parseMermaidTextToGraph('mindmap\n  根\n    分支一\n      叶子A\n      叶子B\n    分支二');
    const result = layoutGraphToShapes(graph);
    const geo = result.shapes.filter((shape) => shape.type === 'geo');
    expect(geo.length).toBe(5);
    const root = geo.find((shape) => shape.props.text === '根');
    expect(root.props.geo).toBe('ellipse');
    const branch = geo.find((shape) => shape.props.text === '分支一');
    expect(branch.x).toBeGreaterThan(root.x);
  });

  it('round-trips shapes → graph → mermaid text', () => {
    const graph = parseMermaidTextToGraph('flowchart TD\n  a[A] --> b[B]\n  b --> c[C]');
    const layout = layoutGraphToShapes(graph);
    const extracted = extractGraphFromShapes(layout.shapes, 'FLOWCHART');
    expect(extracted.graph.nodes.length).toBe(3);
    expect(extracted.graph.edges.length).toBe(2);
    expect(extracted.ignored.ignoredEdgeCount).toBe(0);
    expect(
      extracted.graph.edges.map((edge) => `${edge.from}->${edge.to}`).sort()
    ).toEqual(['a->b', 'b->c']);
    const text = graphToMermaidText(extracted.graph, 'flowchart');
    expect(text.startsWith('flowchart TD')).toBe(true);
    expect(text).toContain('A');
  });

  it('infers edges from geometry when meta is absent', () => {
    const shapes = [
      { id: 's1', type: 'geo', x: 0, y: 0, w: 100, h: 60, props: { text: '甲' }, meta: {} },
      { id: 's2', type: 'geo', x: 300, y: 0, w: 100, h: 60, props: { text: '乙' }, meta: {} },
      {
        id: 'c1',
        type: 'connector',
        x: 0,
        y: 0,
        w: 0,
        h: 0,
        props: { start: { shapeId: 's1', anchor: 'right' }, end: { shapeId: 's2', anchor: 'left' } },
        meta: {}
      }
    ];
    const extracted = extractGraphFromShapes(shapes, 'FLOWCHART');
    expect(extracted.graph.edges.length).toBe(1);
    expect(extracted.graph.edges[0].from).toBe('n1');
    expect(extracted.graph.edges[0].to).toBe('n2');
  });
});
