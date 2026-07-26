import { describe, expect, it } from 'vitest';
import {
  isFeishuBoardSnapshot,
  isTldrawSnapshot,
  migrateTldrawSnapshot,
  normalizeBoardSnapshot
} from './boardTldrawMigrate';

function richText(text) {
  return { type: 'doc', content: [{ type: 'paragraph', content: [{ type: 'text', text }] }] };
}

function buildTldrawSnapshot() {
  return {
    document: {
      store: {
        'shape:rect1': {
          id: 'shape:rect1',
          typeName: 'shape',
          type: 'geo',
          x: 10,
          y: 20,
          rotation: 0,
          index: 'a1',
          props: { w: 190, h: 84, geo: 'rectangle', color: 'light-blue', fill: 'solid', dash: 'draw', size: 'm', richText: richText('开始') },
          meta: { board_canvas_node_id: 'n1', board_canvas_node_label: '开始' }
        },
        'shape:note1': {
          id: 'shape:note1',
          typeName: 'shape',
          type: 'note',
          x: 300,
          y: 20,
          rotation: 0,
          index: 'a2',
          props: { color: 'yellow', size: 'm', growY: 0, richText: richText('便签') },
          meta: {}
        },
        'shape:arrow1': {
          id: 'shape:arrow1',
          typeName: 'shape',
          type: 'arrow',
          x: 200,
          y: 60,
          rotation: 0,
          index: 'a3',
          props: { start: { x: 0, y: 0 }, end: { x: 100, y: 0 }, bend: 0, arrowheadStart: 'none', arrowheadEnd: 'arrow', color: 'black', size: 'm' },
          meta: { board_canvas_edge_from: 'n1', board_canvas_edge_to: 'n2', board_canvas_edge_label: '' }
        },
        'binding:b1': {
          id: 'binding:b1',
          typeName: 'binding',
          type: 'arrow',
          fromId: 'shape:arrow1',
          toId: 'shape:rect1',
          props: { terminal: 'start', normalizedAnchor: { x: 1, y: 0.5 } }
        },
        'binding:b2': {
          id: 'binding:b2',
          typeName: 'binding',
          type: 'arrow',
          fromId: 'shape:arrow1',
          toId: 'shape:note1',
          props: { terminal: 'end', normalizedAnchor: { x: 0, y: 0.5 } }
        },
        'shape:draw1': {
          id: 'shape:draw1',
          typeName: 'shape',
          type: 'draw',
          x: 500,
          y: 100,
          rotation: 0,
          index: 'a4',
          props: { color: 'red', size: 'm', segments: [{ type: 'free', points: [{ x: 0, y: 0 }, { x: 30, y: 20 }, { x: 60, y: 5 }] }] }
        }
      },
      schema: {}
    },
    session: {}
  };
}

describe('boardTldrawMigrate', () => {
  it('detects tldraw vs feishu snapshots', () => {
    const snapshot = buildTldrawSnapshot();
    expect(isTldrawSnapshot(snapshot)).toBe(true);
    expect(isFeishuBoardSnapshot(snapshot)).toBe(false);
    const migrated = migrateTldrawSnapshot(snapshot);
    expect(isFeishuBoardSnapshot(migrated)).toBe(true);
    expect(isTldrawSnapshot(migrated)).toBe(false);
  });

  it('converts geo/note/arrow/draw with bindings and meta', () => {
    const migrated = migrateTldrawSnapshot(buildTldrawSnapshot());
    expect(migrated.shapes.length).toBe(4);

    const geo = migrated.shapes.find((shape) => shape.type === 'geo');
    expect(geo.props.text).toBe('开始');
    expect(geo.props.geo).toBe('rect');
    expect(geo.props.fill).toBe('#E1EAFF');
    expect(geo.meta.nodeId).toBe('n1');

    const note = migrated.shapes.find((shape) => shape.type === 'note');
    expect(note.props.text).toBe('便签');

    const connector = migrated.shapes.find((shape) => shape.type === 'connector');
    expect(connector.props.start.shapeId).toBe('shape:rect1');
    expect(connector.props.start.anchor).toBe('right');
    expect(connector.props.end.shapeId).toBe('shape:note1');
    expect(connector.props.end.anchor).toBe('left');
    expect(connector.props.arrowEnd).toBe('arrow');

    const draw = migrated.shapes.find((shape) => shape.type === 'draw');
    expect(draw.props.points.length).toBe(3);
  });

  it('passes through v2 snapshots unchanged via normalizeBoardSnapshot', () => {
    const migrated = migrateTldrawSnapshot(buildTldrawSnapshot());
    const normalized = normalizeBoardSnapshot(migrated);
    expect(normalized.shapes.length).toBe(4);
    expect(normalized.engine).toBe('shizuki-feishu-board');
    expect(normalizeBoardSnapshot(null)).toBeNull();
    expect(normalizeBoardSnapshot({})).toBeNull();
  });

  it('drops dangling connector endpoints for missing shapes', () => {
    const snapshot = buildTldrawSnapshot();
    delete snapshot.document.store['shape:note1'];
    delete snapshot.document.store['binding:b2'];
    const migrated = migrateTldrawSnapshot(snapshot);
    const connector = migrated.shapes.find((shape) => shape.type === 'connector');
    expect(connector.props.end.shapeId).toBeUndefined();
    expect(Number.isFinite(connector.props.end.x)).toBe(true);
  });
});
