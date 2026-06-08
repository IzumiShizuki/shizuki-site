import { beforeEach, describe, expect, it, vi } from 'vitest';

const mocked = vi.hoisted(() => ({
  createShapeId: vi.fn(() => 'shape:new'),
  startEditingShapeWithRichText: vi.fn()
}));

vi.mock('tldraw', () => ({
  Tldraw: () => null,
  DefaultColorStyle: {},
  DefaultFillStyle: {},
  DefaultMenuPanel: () => null,
  DefaultStylePanel: () => null,
  DefaultSnapIndicator: () => null,
  TldrawOverlays: () => null,
  createShapeId: mocked.createShapeId,
  defaultHandleExternalSvgTextContent: () => '',
  exportAs: vi.fn(),
  getPointerInfo: vi.fn(),
  hideAllTooltips: vi.fn(),
  preventDefault: vi.fn(),
  startEditingShapeWithRichText: mocked.startEditingShapeWithRichText,
  useEditor: () => null,
  useIsToolSelected: () => false,
  useTools: () => ({})
}));

vi.mock('@tldraw/state-react', () => ({
  useValue: () => null
}));

vi.mock('./boardMermaid', () => ({
  createRichText: (text) => text,
  graphToMermaidText: () => '',
  parseMermaidTextToGraph: () => ({ kind: 'flowchart', nodes: [], edges: [] }),
  richTextToPlainText: (value) => (typeof value === 'string' ? value : '')
}));

import { __TEST__ } from './boardCanvasBridge';

function createEditor(initialShapes = []) {
  const shapes = new Map(initialShapes.map((shape) => [shape.id, { ...shape }]));

  const editor = {
    getCurrentPageShapes: vi.fn(() => Array.from(shapes.values())),
    getShape: vi.fn((shapeId) => shapes.get(shapeId) || null),
    getShapePageBounds: vi.fn((shapeId) => {
      const shape = shapes.get(shapeId);
      if (!shape) return null;
      if (shape.bounds) return shape.bounds;
      if (shape.type === 'geo') {
        return {
          x: shape.x,
          y: shape.y,
          w: shape.props?.w ?? 0,
          h: shape.props?.h ?? 0
        };
      }
      if (shape.type === 'note') {
        return {
          x: shape.x,
          y: shape.y,
          w: 184,
          h: 164
        };
      }
      return null;
    }),
    getZoomLevel: vi.fn(() => 1),
    updateShape: vi.fn((nextShape) => {
      const current = shapes.get(nextShape.id);
      if (!current) return;
      shapes.set(nextShape.id, {
        ...current,
        props: {
          ...current.props,
          ...nextShape.props
        }
      });
    }),
    createBinding: vi.fn(),
    createShape: vi.fn((shape) => {
      shapes.set(shape.id, { ...shape });
    }),
    select: vi.fn(),
    setCurrentTool: vi.fn(),
    deleteShapes: vi.fn((shapeIds) => {
      shapeIds.forEach((shapeId) => shapes.delete(shapeId));
    })
  };

  return { editor, shapes };
}

describe('boardCanvasBridge quick connect helpers', () => {
  beforeEach(() => {
    mocked.createShapeId.mockReturnValue('shape:new');
    mocked.startEditingShapeWithRichText.mockClear();
  });

  it('selects the nearest directional candidate from the editor surface', () => {
    const { editor } = createEditor([
      {
        id: 'source',
        type: 'geo',
        bounds: { x: 120, y: 120, w: 220, h: 120 }
      },
      {
        id: 'locked',
        type: 'geo',
        isLocked: true,
        bounds: { x: 390, y: 120, w: 220, h: 120 }
      },
      {
        id: 'right-far',
        type: 'geo',
        bounds: { x: 760, y: 132, w: 220, h: 120 }
      },
      {
        id: 'right-near',
        type: 'geo',
        bounds: { x: 410, y: 142, w: 220, h: 120 }
      },
      {
        id: 'note-below',
        type: 'note',
        bounds: { x: 160, y: 380, w: 184, h: 164 }
      }
    ]);

    const target = __TEST__.resolveDirectionalQuickConnectTarget(
      editor,
      { id: 'source' },
      { id: 'right' },
      'arrow:temp'
    );

    expect(target?.shape?.id).toBe('right-near');
  });

  it('updates the arrow end and binds it to the closest edge anchor', () => {
    const { editor } = createEditor([
      {
        id: 'arrow:1',
        type: 'arrow',
        x: 40,
        y: 20,
        props: {
          end: { x: 0, y: 0 }
        }
      }
    ]);

    const bound = __TEST__.bindQuickConnectArrowEnd(
      editor,
      'arrow:1',
      'target:1',
      { x: 200, y: 50, w: 220, h: 140 },
      { x: 200, y: 120 }
    );

    expect(bound).toBe(true);
    expect(editor.updateShape).toHaveBeenCalledWith({
      id: 'arrow:1',
      type: 'arrow',
      props: {
        end: {
          x: 160,
          y: 100
        }
      }
    });
    expect(editor.createBinding).toHaveBeenCalledWith({
      type: 'arrow',
      fromId: 'arrow:1',
      toId: 'target:1',
      props: expect.objectContaining({
        terminal: 'end',
        normalizedAnchor: { x: 0, y: 0.5 },
        snap: 'edge'
      })
    });
  });

  it('creates a chosen quick-connect shape and attaches the pending arrow to it', () => {
    const { editor, shapes } = createEditor([
      {
        id: 'arrow:1',
        type: 'arrow',
        x: 100,
        y: 100,
        props: {
          end: { x: 0, y: 0 }
        }
      }
    ]);

    const result = __TEST__.createQuickConnectChoiceShape(
      editor,
      {
        arrowId: 'arrow:1',
        startPagePoint: { x: 100, y: 100 },
        dropPagePoint: { x: 360, y: 100 }
      },
      'rectangle'
    );

    expect(result).toEqual({
      created: true,
      shapeId: 'shape:new'
    });
    expect(editor.createShape).toHaveBeenCalledWith(
      expect.objectContaining({
        id: 'shape:new',
        type: 'geo',
        x: 372,
        y: 44,
        props: expect.objectContaining({
          geo: 'rectangle',
          w: 300,
          h: 112,
          color: 'light-blue',
          fill: 'solid'
        })
      })
    );
    expect(editor.createBinding).toHaveBeenCalledWith(
      expect.objectContaining({
        fromId: 'arrow:1',
        toId: 'shape:new'
      })
    );
    expect(editor.select).toHaveBeenCalledWith('shape:new');
    expect(editor.setCurrentTool).toHaveBeenCalledWith('select');
    expect(shapes.get('shape:new')).toBeTruthy();
  });
});
