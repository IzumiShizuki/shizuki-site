import React from 'react';
import { createRoot } from 'react-dom/client';
import {
  Tldraw,
  createShapeId,
  defaultHandleExternalSvgTextContent,
  exportAs
} from 'tldraw';
import 'tldraw/tldraw.css';
import { createRichText, graphToMermaidText, parseMermaidTextToGraph, richTextToPlainText } from './boardMermaid';

function toNumber(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : fallback;
}

function intersectsBox(left, right) {
  if (!left || !right) return false;
  return !(
    left.x + left.w < right.x ||
    left.x > right.x + right.w ||
    left.y + left.h < right.y ||
    left.y > right.y + right.h
  );
}

function sanitizeFileName(value, fallback = 'board-canvas') {
  const text = String(value || '')
    .trim()
    .replace(/[\\/:*?"<>|]+/g, '-')
    .replace(/\s+/g, '-');
  return text || fallback;
}

function downloadBlob(blob, fileName) {
  const url = URL.createObjectURL(blob);
  const link = document.createElement('a');
  link.href = url;
  link.download = fileName;
  link.click();
  URL.revokeObjectURL(url);
}

function readMeta(shape, key, fallback = '') {
  const source = shape && typeof shape === 'object' ? shape.meta : null;
  if (!source || typeof source !== 'object') return fallback;
  const value = source[key];
  if (value === undefined || value === null) return fallback;
  return String(value).trim() || fallback;
}

function getShapeLabel(shape, fallback = '') {
  const metaLabel = readMeta(shape, 'board_canvas_node_label', '');
  if (metaLabel) return metaLabel;
  const props = shape?.props || {};
  const richTextLabel = richTextToPlainText(props.richText);
  if (richTextLabel) return richTextLabel;
  if (typeof props.name === 'string' && props.name.trim()) {
    return props.name.trim();
  }
  return fallback;
}

function resolveArrowPoint(shape, terminal) {
  if (!terminal || typeof terminal !== 'object') return null;
  if (typeof terminal.x !== 'number' || typeof terminal.y !== 'number') return null;
  return {
    x: toNumber(shape?.x, 0) + terminal.x,
    y: toNumber(shape?.y, 0) + terminal.y
  };
}

function nearestNodeByPoint(point, nodes) {
  if (!point || !Array.isArray(nodes) || !nodes.length) return null;
  let winner = null;
  let minDistance = Number.POSITIVE_INFINITY;
  nodes.forEach((node) => {
    const dx = point.x - node.center.x;
    const dy = point.y - node.center.y;
    const distance = dx * dx + dy * dy;
    if (distance >= minDistance) return;
    minDistance = distance;
    winner = node;
  });
  return winner;
}

function extractGraphFromEditor(editor, preferredKind = 'FLOWCHART') {
  const shapes = editor.getCurrentPageShapes();
  const nodes = [];
  const edges = [];
  const shapeNodeMap = new Map();
  let nodeSeq = 1;

  shapes.forEach((shape) => {
    if (!shape || typeof shape !== 'object') return;
    if (!['geo', 'note', 'text'].includes(shape.type)) return;
    const shapeBounds = editor.getShapePageBounds(shape.id);
    if (!shapeBounds) return;
    const nodeId = readMeta(shape, 'board_canvas_node_id', `n${nodeSeq}`);
    const nodeLabel = getShapeLabel(shape, nodeId);
    nodeSeq += 1;
    const node = {
      id: nodeId,
      label: nodeLabel,
      shapeId: shape.id,
      center: {
        x: shapeBounds.x + shapeBounds.w / 2,
        y: shapeBounds.y + shapeBounds.h / 2
      }
    };
    nodes.push(node);
    shapeNodeMap.set(shape.id, node);
  });

  let ignoredEdgeCount = 0;
  shapes.forEach((shape) => {
    if (!shape || shape.type !== 'arrow') return;
    const props = shape.props || {};
    const metaFrom = readMeta(shape, 'board_canvas_edge_from', '');
    const metaTo = readMeta(shape, 'board_canvas_edge_to', '');
    const metaLabel = readMeta(shape, 'board_canvas_edge_label', '');
    let fromId = metaFrom;
    let toId = metaTo;

    const start = props.start;
    const end = props.end;
    if (!fromId && start?.type === 'binding' && start.boundShapeId) {
      const node = shapeNodeMap.get(start.boundShapeId);
      if (node) fromId = node.id;
    }
    if (!toId && end?.type === 'binding' && end.boundShapeId) {
      const node = shapeNodeMap.get(end.boundShapeId);
      if (node) toId = node.id;
    }

    if (!fromId || !toId) {
      const startPoint = resolveArrowPoint(shape, start);
      const endPoint = resolveArrowPoint(shape, end);
      const fromNode = fromId ? null : nearestNodeByPoint(startPoint, nodes);
      const toNode = toId ? null : nearestNodeByPoint(endPoint, nodes);
      if (!fromId && fromNode) fromId = fromNode.id;
      if (!toId && toNode) toId = toNode.id;
    }

    if (!fromId || !toId) {
      ignoredEdgeCount += 1;
      return;
    }

    edges.push({
      from: fromId,
      to: toId,
      label: metaLabel || richTextToPlainText(props.richText) || ''
    });
  });

  const nodeMap = new Map();
  nodes.forEach((node) => {
    if (!nodeMap.has(node.id)) {
      nodeMap.set(node.id, {
        id: node.id,
        label: node.label
      });
    }
  });

  const graph = {
    kind: String(preferredKind || 'FLOWCHART').toUpperCase() === 'MINDMAP' ? 'mindmap' : 'flowchart',
    nodes: Array.from(nodeMap.values()),
    edges
  };

  return {
    graph,
    ignored: {
      ignoredEdgeCount
    }
  };
}

function clearCurrentPage(editor) {
  const ids = Array.from(editor.getCurrentPageShapeIds());
  if (!ids.length) return;
  editor.deleteShapes(ids);
}

function createShapesFromGraph(editor, graphInput) {
  const graph = graphInput && typeof graphInput === 'object' ? graphInput : { kind: 'flowchart', nodes: [], edges: [] };
  const nodes = Array.isArray(graph.nodes) ? graph.nodes : [];
  const edges = Array.isArray(graph.edges) ? graph.edges : [];
  clearCurrentPage(editor);

  const kind = String(graph.kind || 'flowchart').toLowerCase();
  const nodePositions = new Map();
  const nodeShapeById = new Map();

  const levelCounters = new Map();
  const columnCount = 4;
  nodes.forEach((node, index) => {
    const nodeId = String(node?.id || `n${index + 1}`).trim() || `n${index + 1}`;
    let x = 80;
    let y = 120;
    if (kind === 'mindmap') {
      const level = Math.max(0, toNumber(node?.level, 0));
      const row = levelCounters.get(level) || 0;
      levelCounters.set(level, row + 1);
      x += level * 270;
      y += row * 140;
    } else {
      x += (index % columnCount) * 260;
      y += Math.floor(index / columnCount) * 170;
    }

    const label = String(node?.label || nodeId).trim() || nodeId;
    const shapeId = createShapeId();
    const shape = {
      id: shapeId,
      type: 'geo',
      x,
      y,
      props: {
        w: 190,
        h: 84,
        geo: kind === 'mindmap' && index === 0 ? 'ellipse' : 'rectangle',
        fill: 'none',
        richText: createRichText(label)
      },
      meta: {
        board_canvas_node_id: nodeId,
        board_canvas_node_label: label
      }
    };
    editor.createShape(shape);
    nodePositions.set(nodeId, { x, y, w: 190, h: 84 });
    nodeShapeById.set(nodeId, shapeId);
  });

  let createdEdgeCount = 0;
  edges.forEach((edge) => {
    const from = nodePositions.get(edge?.from);
    const to = nodePositions.get(edge?.to);
    if (!from || !to) return;
    const startPoint = {
      x: from.x + from.w / 2,
      y: from.y + from.h / 2
    };
    const endPoint = {
      x: to.x + to.w / 2,
      y: to.y + to.h / 2
    };
    const edgeLabel = String(edge?.label || '').trim();
    editor.createShape({
      id: createShapeId(),
      type: 'arrow',
      x: 0,
      y: 0,
      props: {
        start: startPoint,
        end: endPoint,
        bend: 0,
        kind: 'straight',
        arrowheadStart: 'none',
        arrowheadEnd: 'arrow',
        richText: edgeLabel ? createRichText(edgeLabel) : createRichText('')
      },
      meta: {
        board_canvas_edge_from: String(edge?.from || ''),
        board_canvas_edge_to: String(edge?.to || ''),
        board_canvas_edge_label: edgeLabel
      }
    });
    createdEdgeCount += 1;
  });

  try {
    editor.zoomToFit();
  } catch {
    // ignore camera failure
  }
  return {
    createdNodeCount: nodes.length,
    createdEdgeCount
  };
}

function createCanvasApi(onReady) {
  let editor = null;

  function requireEditor() {
    if (!editor) {
      throw new Error('Board editor is not ready.');
    }
    return editor;
  }

  return {
    bindEditor(nextEditor) {
      editor = nextEditor;
      if (typeof onReady === 'function') {
        onReady();
      }
    },
    isReady() {
      return Boolean(editor);
    },
    getSnapshot() {
      if (!editor) return null;
      return editor.getSnapshot();
    },
    loadSnapshot(snapshot) {
      const current = requireEditor();
      if (!snapshot || typeof snapshot !== 'object') {
        clearCurrentPage(current);
        return false;
      }
      current.loadSnapshot(snapshot);
      return true;
    },
    clear() {
      clearCurrentPage(requireEditor());
    },
    importGraph(graph) {
      return createShapesFromGraph(requireEditor(), graph);
    },
    parseMermaid(text) {
      return parseMermaidTextToGraph(text);
    },
    exportMermaid(preferredKind) {
      const extracted = extractGraphFromEditor(requireEditor(), preferredKind);
      return {
        ...extracted,
        text: graphToMermaidText(extracted.graph, extracted.graph.kind)
      };
    },
    async insertSvg(svgText) {
      const current = requireEditor();
      await defaultHandleExternalSvgTextContent(current, { text: String(svgText || '') });
    },
    async exportPng(scope = 'board', background = 'white', fileName = 'board-canvas') {
      const current = requireEditor();
      let ids = [];
      if (scope === 'selection') {
        ids = Array.from(current.getSelectedShapeIds());
      } else if (scope === 'viewport') {
        const viewport = current.getViewportPageBounds();
        ids = current
          .getCurrentPageShapes()
          .filter((shape) => intersectsBox(current.getShapePageBounds(shape.id), viewport))
          .map((shape) => shape.id);
      } else {
        ids = Array.from(current.getCurrentPageShapeIds());
      }

      if (!ids.length) {
        return { exported: false, reason: 'empty' };
      }

      const safeName = sanitizeFileName(fileName, 'board-canvas');
      try {
        const result = await current.toImage(ids, {
          format: 'png',
          background: background !== 'transparent'
        });
        downloadBlob(result.blob, `${safeName}.png`);
        return { exported: true, shapeCount: ids.length };
      } catch {
        await exportAs(current, ids, {
          format: 'png',
          name: safeName,
          background: background !== 'transparent'
        });
        return { exported: true, shapeCount: ids.length };
      }
    }
  };
}

function BoardCanvasReactHost({ api, initialSnapshot }) {
  const initializedRef = React.useRef(false);
  return (
    <div className="board-canvas-react-host">
      <Tldraw
        onMount={(editor) => {
          api.bindEditor(editor);
          if (initializedRef.current) return;
          initializedRef.current = true;
          if (!initialSnapshot || typeof initialSnapshot !== 'object') return;
          try {
            editor.loadSnapshot(initialSnapshot);
          } catch {
            // ignore invalid initial snapshot
          }
        }}
      />
    </div>
  );
}

export function mountBoardCanvas(target, options = {}) {
  if (!target) {
    throw new Error('mount target is required');
  }
  const api = createCanvasApi(options.onReady);
  const root = createRoot(target);
  root.render(<BoardCanvasReactHost api={api} initialSnapshot={options.initialSnapshot} />);

  return {
    api,
    destroy() {
      root.unmount();
    }
  };
}

