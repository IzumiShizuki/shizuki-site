import React from 'react';
import { createRoot } from 'react-dom/client';
import { createPortal } from 'react-dom';
import {
  Tldraw,
  DefaultMenuPanel,
  DefaultStylePanel,
  DefaultSnapIndicator,
  TldrawOverlays,
  createShapeId,
  defaultHandleExternalSvgTextContent,
  exportAs,
  getPointerInfo,
  hideAllTooltips,
  preventDefault,
  startEditingShapeWithRichText,
  useEditor,
  useIsToolSelected,
  useTools
} from 'tldraw';
import { useValue } from '@tldraw/state-react';
import 'tldraw/tldraw.css';
import { createRichText, graphToMermaidText, parseMermaidTextToGraph, richTextToPlainText } from './boardMermaid';

const GUIDE_STORAGE_KEY = 'shizuki.board-canvas.palette-guide-dismissed.v1';
const STYLE_PANEL_COMPACT_BREAKPOINT = '(max-width: 980px)';
const QUICK_CONNECT_SHAPE_TYPES = new Set(['geo', 'note', 'text', 'frame']);
const quickConnectPreviewStore = {
  state: null,
  listeners: new Set()
};
const QUICK_CONNECT_DIRECTIONS = [
  { id: 'top', label: '顶部连接点', normalizedAnchor: { x: 0.5, y: 0 }, snap: 'edge' },
  { id: 'right', label: '右侧连接点', normalizedAnchor: { x: 1, y: 0.5 }, snap: 'edge' },
  { id: 'bottom', label: '底部连接点', normalizedAnchor: { x: 0.5, y: 1 }, snap: 'edge' },
  { id: 'left', label: '左侧连接点', normalizedAnchor: { x: 0, y: 0.5 }, snap: 'edge' }
];

const LEFT_PALETTE_COMMON_TOOLS = [
  { id: 'select', label: '选择', iconClass: 'fas fa-mouse-pointer', title: '选择工具' },
  { id: 'hand', label: '手型', iconClass: 'far fa-hand', title: '手型拖拽' },
  { id: 'rectangle', label: '矩形', iconClass: 'far fa-square', title: '矩形' },
  { id: 'ellipse', label: '圆形', iconClass: 'far fa-circle', title: '圆形' },
  { id: 'diamond', label: '菱形', iconClass: 'far fa-gem', title: '菱形' },
  { id: 'triangle', label: '三角', iconClass: 'fas fa-play', title: '三角形' },
  { id: 'note', label: '便签', iconClass: 'fas fa-note-sticky', title: '便签' },
  { id: 'text', label: '文本', iconClass: 'fas fa-font', title: '文本' },
  { id: 'line', label: '连线', iconClass: 'fas fa-minus', title: '连线' },
  { id: 'arrow', label: '箭头', iconClass: 'fas fa-arrow-right', title: '箭头' },
  { id: 'frame', label: '框架', iconClass: 'far fa-window-maximize', title: '框架' }
];

const LEFT_PALETTE_EXTRA_TOOLS = [
  { id: 'draw', label: '画笔', iconClass: 'fas fa-pen', title: '画笔' },
  { id: 'eraser', label: '橡皮', iconClass: 'fas fa-eraser', title: '橡皮擦' },
  { id: 'highlight', label: '高亮', iconClass: 'fas fa-highlighter', title: '高亮' },
  { id: 'asset', label: '图片', iconClass: 'far fa-image', title: '插入图片' }
];

function subscribeQuickConnectPreview(listener) {
  quickConnectPreviewStore.listeners.add(listener);
  return () => {
    quickConnectPreviewStore.listeners.delete(listener);
  };
}

function getQuickConnectPreviewSnapshot() {
  return quickConnectPreviewStore.state;
}

function setQuickConnectPreviewState(nextState) {
  quickConnectPreviewStore.state = nextState || null;
  quickConnectPreviewStore.listeners.forEach((listener) => {
    try {
      listener();
    } catch {
      // ignore listener failure
    }
  });
}

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

function createTextShape(editor, shapeId, centerPoint) {
  const x = toNumber(centerPoint?.x, 0);
  const y = toNumber(centerPoint?.y, 0);
  editor.createShape({
    id: shapeId,
    type: 'text',
    x: x - 72,
    y: y - 18,
    props: {
      richText: createRichText('文本')
    }
  });
  return { shapeId, autoEdit: true };
}

function createNoteShape(editor, shapeId, centerPoint) {
  const x = toNumber(centerPoint?.x, 0);
  const y = toNumber(centerPoint?.y, 0);
  editor.createShape({
    id: shapeId,
    type: 'note',
    x: x - 92,
    y: y - 82
  });
  return { shapeId, autoEdit: true };
}

function createGeoShape(editor, shapeId, centerPoint, geo, width = 220, height = 140) {
  const x = toNumber(centerPoint?.x, 0);
  const y = toNumber(centerPoint?.y, 0);
  editor.createShape({
    id: shapeId,
    type: 'geo',
    x: x - width / 2,
    y: y - height / 2,
    props: {
      w: width,
      h: height,
      geo,
      fill: 'solid'
    }
  });
  return { shapeId, autoEdit: false };
}

function createArrowLikeShape(editor, shapeId, centerPoint, withArrowHead) {
  const x = toNumber(centerPoint?.x, 0);
  const y = toNumber(centerPoint?.y, 0);
  editor.createShape({
    id: shapeId,
    type: 'arrow',
    x: x - 110,
    y: y - 8,
    props: {
      start: { x: 0, y: 8 },
      end: { x: 220, y: 8 },
      bend: 0,
      kind: 'straight',
      arrowheadStart: 'none',
      arrowheadEnd: withArrowHead ? 'arrow' : 'none',
      richText: createRichText('')
    }
  });
  return { shapeId, autoEdit: false };
}

function createFrameShape(editor, shapeId, centerPoint) {
  const x = toNumber(centerPoint?.x, 0);
  const y = toNumber(centerPoint?.y, 0);
  editor.createShape({
    id: shapeId,
    type: 'frame',
    x: x - 240,
    y: y - 160,
    props: {
      w: 480,
      h: 320
    }
  });
  return { shapeId, autoEdit: false };
}

function createStencilShape(editor, toolId, centerPoint, explicitShapeId) {
  const shapeId = explicitShapeId || createShapeId();
  const key = String(toolId || '').trim().toLowerCase();
  switch (key) {
    case 'rectangle':
      return createGeoShape(editor, shapeId, centerPoint, 'rectangle');
    case 'ellipse':
      return createGeoShape(editor, shapeId, centerPoint, 'ellipse');
    case 'diamond':
      return createGeoShape(editor, shapeId, centerPoint, 'diamond');
    case 'triangle':
      return createGeoShape(editor, shapeId, centerPoint, 'triangle');
    case 'note':
      return createNoteShape(editor, shapeId, centerPoint);
    case 'text':
      return createTextShape(editor, shapeId, centerPoint);
    case 'line':
      return createArrowLikeShape(editor, shapeId, centerPoint, false);
    case 'arrow':
      return createArrowLikeShape(editor, shapeId, centerPoint, true);
    case 'frame':
      return createFrameShape(editor, shapeId, centerPoint);
    default:
      return null;
  }
}

function finalizeCreatedShape(editor, created) {
  if (!created?.shapeId) {
    return { created: false, shapeId: null };
  }
  editor.select(created.shapeId);
  editor.setCurrentTool('select');
  if (created.autoEdit) {
    window.requestAnimationFrame(() => {
      try {
        startEditingShapeWithRichText(editor, created.shapeId, { selectAll: true });
      } catch {
        // ignore edit failure
      }
    });
  }
  return { created: true, shapeId: created.shapeId };
}

function createStencilShapeAtPagePoint(editor, toolId, pagePoint) {
  const created = createStencilShape(editor, toolId, pagePoint);
  return finalizeCreatedShape(editor, created);
}

function createStencilShapeAtViewportCenter(editor, toolId) {
  const centerPoint = editor.getViewportPageBounds()?.center || { x: 0, y: 0, z: 1 };
  return createStencilShapeAtPagePoint(editor, toolId, centerPoint);
}

function isQuickConnectVisible(editor, shape) {
  if (!shape || !QUICK_CONNECT_SHAPE_TYPES.has(shape.type)) return false;
  if (shape.isLocked) return false;
  if (editor.isInAny('select.editing_shape', 'select.brushing', 'select.scribble_brushing')) return false;
  return editor.isInAny('select.idle', 'select.pointing_shape', 'select.pointing_selection', 'select.pointing_canvas');
}

function getQuickConnectAnchors(bounds) {
  if (!bounds) return [];
  const left = toNumber(bounds.x, 0);
  const top = toNumber(bounds.y, 0);
  const width = toNumber(bounds.w, 0);
  const height = toNumber(bounds.h, 0);
  const midX = left + width / 2;
  const midY = top + height / 2;

  return QUICK_CONNECT_DIRECTIONS.map((direction) => {
    if (direction.id === 'top') {
      return { ...direction, pagePoint: { x: midX, y: top } };
    }
    if (direction.id === 'right') {
      return { ...direction, pagePoint: { x: left + width, y: midY } };
    }
    if (direction.id === 'bottom') {
      return { ...direction, pagePoint: { x: midX, y: top + height } };
    }
    return { ...direction, pagePoint: { x: left, y: midY } };
  });
}

function getQuickConnectScreenOffset(anchorId) {
  if (anchorId === 'top') return { x: 0, y: -12 };
  if (anchorId === 'right') return { x: 12, y: 0 };
  if (anchorId === 'bottom') return { x: 0, y: 12 };
  return { x: -12, y: 0 };
}

function resolveQuickConnectScreenPoint(editor, pagePoint) {
  const hostRect = editor.getContainer()?.getBoundingClientRect?.();
  const screenPoint = editor.pageToScreen(pagePoint);
  return {
    x: screenPoint.x - (hostRect?.left || 0),
    y: screenPoint.y - (hostRect?.top || 0)
  };
}

function clamp01(value) {
  return Math.max(0, Math.min(1, toNumber(value, 0)));
}

function resolveQuickConnectBindingAnchor(bounds, point) {
  const width = Math.max(1, toNumber(bounds?.w, 1));
  const height = Math.max(1, toNumber(bounds?.h, 1));
  const relativeX = clamp01((toNumber(point?.x, 0) - toNumber(bounds?.x, 0)) / width);
  const relativeY = clamp01((toNumber(point?.y, 0) - toNumber(bounds?.y, 0)) / height);
  const distances = [
    { edge: 'left', value: relativeX },
    { edge: 'right', value: 1 - relativeX },
    { edge: 'top', value: relativeY },
    { edge: 'bottom', value: 1 - relativeY }
  ].sort((left, right) => left.value - right.value);

  const nearest = distances[0]?.edge || 'right';
  if (nearest === 'left') {
    return { x: 0, y: relativeY };
  }
  if (nearest === 'right') {
    return { x: 1, y: relativeY };
  }
  if (nearest === 'top') {
    return { x: relativeX, y: 0 };
  }
  return { x: relativeX, y: 1 };
}

function isPointInsideBounds(point, bounds, padding = 0) {
  if (!point || !bounds) return false;
  const x = toNumber(point.x, 0);
  const y = toNumber(point.y, 0);
  const left = toNumber(bounds.x, 0) - padding;
  const top = toNumber(bounds.y, 0) - padding;
  const right = toNumber(bounds.x, 0) + toNumber(bounds.w, 0) + padding;
  const bottom = toNumber(bounds.y, 0) + toNumber(bounds.h, 0) + padding;
  return x >= left && x <= right && y >= top && y <= bottom;
}

function resolveQuickConnectTarget(editor, point, sourceShapeId, arrowId) {
  const shapes = editor.getCurrentPageShapes();
  if (!Array.isArray(shapes) || !shapes.length) return null;
  const padding = 6 / Math.max(editor.getZoomLevel(), 0.5);
  let winner = null;

  shapes.forEach((shape) => {
    if (!shape || shape.id === sourceShapeId || shape.id === arrowId) return;
    if (!QUICK_CONNECT_SHAPE_TYPES.has(shape.type) || shape.isLocked) return;
    const bounds = editor.getShapePageBounds(shape.id);
    if (!bounds || !isPointInsideBounds(point, bounds, padding)) return;
    const area = Math.max(1, toNumber(bounds.w, 1) * toNumber(bounds.h, 1));
    if (winner && winner.area <= area) return;
    winner = { shape, bounds, area };
  });

  return winner;
}

function updateQuickConnectArrowEnd(editor, arrowId, pagePoint) {
  const arrow = editor.getShape(arrowId);
  if (!arrow) return false;
  editor.updateShape({
    id: arrowId,
    type: 'arrow',
    props: {
      end: {
        x: toNumber(pagePoint?.x, 0) - toNumber(arrow.x, 0),
        y: toNumber(pagePoint?.y, 0) - toNumber(arrow.y, 0)
      }
    }
  });
  return true;
}

function buildQuickConnectPreviewPath(start, end) {
  const startX = toNumber(start?.x, 0);
  const startY = toNumber(start?.y, 0);
  const endX = toNumber(end?.x, 0);
  const endY = toNumber(end?.y, 0);
  const deltaX = Math.abs(endX - startX);
  const deltaY = Math.abs(endY - startY);
  if (deltaX < 10 || deltaY < 10) {
    return `M ${startX} ${startY} L ${endX} ${endY}`;
  }
  const midX = startX + (endX - startX) / 2;
  return `M ${startX} ${startY} L ${midX} ${startY} L ${midX} ${endY} L ${endX} ${endY}`;
}

function beginQuickConnectDrag(editor, sourceShape, anchor, nativeEvent) {
  if (!editor || !sourceShape || !anchor?.pagePoint) return false;

  const arrowId = createShapeId();
  editor.markEventAsHandled(nativeEvent);
  editor.getContainer().focus();
  hideAllTooltips();

  editor.createShape({
    id: arrowId,
    type: 'arrow',
    x: anchor.pagePoint.x,
    y: anchor.pagePoint.y,
    props: {
      start: { x: 0, y: 0 },
      end: { x: 0, y: 0 },
      bend: 0,
      kind: 'elbow',
      arrowheadStart: 'none',
      arrowheadEnd: 'arrow',
      richText: createRichText(''),
      scale: editor.user.getIsDynamicResizeMode() ? 1 / editor.getZoomLevel() : 1
    }
  });

  editor.createBinding({
    type: 'arrow',
    fromId: arrowId,
    toId: sourceShape.id,
    props: {
      terminal: 'start',
      normalizedAnchor: anchor.normalizedAnchor,
      isPrecise: true,
      isExact: false,
      snap: anchor.snap || 'edge'
    }
  });

  editor.select(arrowId);
  editor.setCurrentTool('select');

  const pointerId = Number(nativeEvent?.pointerId) || 0;
  const toPagePoint = (event) =>
    editor.screenToPage({
      x: toNumber(event?.clientX, 0),
      y: toNumber(event?.clientY, 0)
    });

  const cleanup = () => {
    window.removeEventListener('pointermove', handlePointerMove);
    window.removeEventListener('pointerup', handlePointerUp);
    window.removeEventListener('pointercancel', handlePointerCancel);
  };

  const handlePointerMove = (event) => {
    if (pointerId && Number(event?.pointerId || 0) !== pointerId) return;
    event.preventDefault();
    const pagePoint = toPagePoint(event);
    const target = resolveQuickConnectTarget(editor, pagePoint, sourceShape.id, arrowId);
    updateQuickConnectArrowEnd(editor, arrowId, pagePoint);
    setQuickConnectPreviewState({
      arrowId,
      sourceShapeId: sourceShape.id,
      startPagePoint: anchor.pagePoint,
      currentPagePoint: pagePoint,
      targetShapeId: target?.shape?.id || '',
      targetBounds: target?.bounds || null
    });
  };

  const handlePointerUp = (event) => {
    if (pointerId && Number(event?.pointerId || 0) !== pointerId) return;
    event.preventDefault();
    const pagePoint = toPagePoint(event);
    updateQuickConnectArrowEnd(editor, arrowId, pagePoint);
    const target = resolveQuickConnectTarget(editor, pagePoint, sourceShape.id, arrowId);
    if (target?.shape && target?.bounds) {
      editor.createBinding({
        type: 'arrow',
        fromId: arrowId,
        toId: target.shape.id,
        props: {
          terminal: 'end',
          normalizedAnchor: resolveQuickConnectBindingAnchor(target.bounds, pagePoint),
          isPrecise: true,
          isExact: false,
          snap: 'edge'
        }
      });
    }
    setQuickConnectPreviewState(null);
    cleanup();
  };

  const handlePointerCancel = () => {
    setQuickConnectPreviewState(null);
    cleanup();
  };

  setQuickConnectPreviewState({
    arrowId,
    sourceShapeId: sourceShape.id,
    startPagePoint: anchor.pagePoint,
    currentPagePoint: anchor.pagePoint,
    targetShapeId: '',
    targetBounds: null
  });
  window.addEventListener('pointermove', handlePointerMove);
  window.addEventListener('pointerup', handlePointerUp);
  window.addEventListener('pointercancel', handlePointerCancel);
  return true;
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
        fill: 'solid',
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
    createStencilShapeAtViewportCenter(toolId) {
      return createStencilShapeAtViewportCenter(requireEditor(), toolId);
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

function useCompactBoardUi() {
  const [compact, setCompact] = React.useState(() => {
    if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') {
      return false;
    }
    return window.matchMedia(STYLE_PANEL_COMPACT_BREAKPOINT).matches;
  });

  React.useEffect(() => {
    if (typeof window === 'undefined' || typeof window.matchMedia !== 'function') {
      return undefined;
    }
    const media = window.matchMedia(STYLE_PANEL_COMPACT_BREAKPOINT);
    const update = () => setCompact(media.matches);
    update();
    if (typeof media.addEventListener === 'function') {
      media.addEventListener('change', update);
      return () => media.removeEventListener('change', update);
    }
    media.addListener(update);
    return () => media.removeListener(update);
  }, []);

  return compact;
}

function usePaletteToolButtonEvents(tool, onActivated) {
  const editor = useEditor();

  return React.useMemo(() => {
    if (!tool) {
      return {};
    }

    let state = { name: 'idle' };

    function handlePointerDown(event) {
      if (!tool.onDragStart) return;
      state = {
        name: 'pointing',
        screenSpaceStart: { x: event.clientX, y: event.clientY }
      };
      event.currentTarget.setPointerCapture(event.pointerId);
    }

    function handlePointerMove(event) {
      if (!tool.onDragStart || state.name !== 'pointing' || event.isSpecialRedispatchedEvent) return;
      const dx = event.clientX - state.screenSpaceStart.x;
      const dy = event.clientY - state.screenSpaceStart.y;
      const distanceSq = dx * dx + dy * dy;
      const thresholdSq = editor.getInstanceState().isCoarsePointer
        ? editor.options.uiCoarseDragDistanceSquared
        : editor.options.uiDragDistanceSquared;

      if (distanceSq <= thresholdSq) return;

      const screenSpaceStart = state.screenSpaceStart;
      state = {
        name: 'dragging',
        screenSpaceStart
      };

      editor.run(() => {
        editor.setCurrentTool('select');
        editor.dispatch({
          type: 'pointer',
          target: 'canvas',
          name: 'pointer_down',
          ...getPointerInfo(editor, event),
          point: screenSpaceStart
        });
        editor.selectNone();
        tool.onDragStart('toolbar', {
          type: 'pointer',
          target: 'canvas',
          name: 'pointer_move',
          ...getPointerInfo(editor, event),
          point: screenSpaceStart
        });
        hideAllTooltips();
        editor.getContainer().focus();
      });

      if (typeof onActivated === 'function') {
        onActivated();
      }
    }

    function handlePointerUp(event) {
      if (tool.onDragStart) {
        try {
          event.currentTarget.releasePointerCapture(event.pointerId);
        } catch {
          // ignore release failure
        }
        editor.dispatch({
          type: 'pointer',
          target: 'canvas',
          name: 'pointer_up',
          ...getPointerInfo(editor, event)
        });
      }
      if (state.name === 'dragging') {
        state = { name: 'dragged' };
      } else {
        state = { name: 'idle' };
      }
    }

    function handlePointerCancel() {
      state = { name: 'idle' };
    }

    function handleClick() {
      if (state.name === 'dragging' || state.name === 'dragged') {
        state = { name: 'idle' };
        return;
      }
      state = { name: 'idle' };
      tool.onSelect?.('toolbar');
      if (typeof onActivated === 'function') {
        onActivated();
      }
    }

    function handleTouchStart(event) {
      preventDefault(event);
      tool.onSelect?.('toolbar');
      if (typeof onActivated === 'function') {
        onActivated();
      }
    }

    return {
      onPointerDown: handlePointerDown,
      onPointerMove: handlePointerMove,
      onPointerUp: handlePointerUp,
      onPointerCancel: handlePointerCancel,
      onClick: handleClick,
      onTouchStart: handleTouchStart
    };
  }, [editor, onActivated, tool]);
}

function BoardCanvasPaletteToolButton({ toolDef, onActivated }) {
  const tools = useTools();
  const tool = tools[toolDef.id];
  const isSelected = useIsToolSelected(tool);
  const events = usePaletteToolButtonEvents(tool, onActivated);

  if (!tool) {
    return null;
  }

  return (
    <button
      type="button"
      className={`board-left-palette__tool${isSelected ? ' is-selected' : ''}`}
      title={toolDef.title}
      aria-label={toolDef.title}
      {...events}
    >
      <i className={toolDef.iconClass} aria-hidden="true"></i>
      <span>{toolDef.label}</span>
    </button>
  );
}

function BoardCanvasLeftPalette() {
  const [paletteExpanded, setPaletteExpanded] = React.useState(false);
  const [guideDismissed, setGuideDismissed] = React.useState(() => {
    if (typeof window === 'undefined') return true;
    return window.localStorage.getItem(GUIDE_STORAGE_KEY) === '1';
  });
  const editor = useEditor();
  const shapeCount = useValue(
    'board-canvas-shape-count',
    () => {
      const ids = editor.getCurrentPageShapeIds();
      return Array.isArray(ids) ? ids.length : ids.size;
    },
    [editor]
  );

  const dismissGuide = React.useCallback(() => {
    setGuideDismissed(true);
    if (typeof window !== 'undefined') {
      window.localStorage.setItem(GUIDE_STORAGE_KEY, '1');
    }
  }, []);

  const showGuide = !guideDismissed && shapeCount === 0;

  return (
    <aside className={`board-left-palette ${paletteExpanded ? 'expanded' : 'compact'}`}>
      <section className="board-left-palette__group">
        {LEFT_PALETTE_COMMON_TOOLS.map((toolDef) => (
          <BoardCanvasPaletteToolButton key={`tool_common_${toolDef.id}`} toolDef={toolDef} onActivated={dismissGuide} />
        ))}
      </section>

      {paletteExpanded ? (
        <section className="board-left-palette__group board-left-palette__group--extra">
          {LEFT_PALETTE_EXTRA_TOOLS.map((toolDef) => (
            <BoardCanvasPaletteToolButton key={`tool_extra_${toolDef.id}`} toolDef={toolDef} onActivated={dismissGuide} />
          ))}
        </section>
      ) : null}

      <button
        type="button"
        className="board-left-palette__toggle"
        aria-label={paletteExpanded ? '收起更多工具' : '展开更多工具'}
        title={paletteExpanded ? '收起更多工具' : '展开更多工具'}
        onClick={() => setPaletteExpanded((value) => !value)}
      >
        <i className={paletteExpanded ? 'fas fa-angle-left' : 'fas fa-ellipsis-h'} aria-hidden="true"></i>
        <span>{paletteExpanded ? '收起' : '更多'}</span>
      </button>

      {showGuide ? (
        <div className="board-left-palette__guide">
          <p>从左侧拖拽图形到画布，或单击模板快速插入</p>
          <button type="button" onClick={dismissGuide}>知道了</button>
        </div>
      ) : null}
    </aside>
  );
}

function BoardCanvasStylePanel() {
  const editor = useEditor();
  const isCompact = useCompactBoardUi();
  const [collapsed, setCollapsed] = React.useState(isCompact);
  const selectedCount = useValue(
    'board-canvas-selected-count',
    () => editor.getSelectedShapeIds().length,
    [editor]
  );

  React.useEffect(() => {
    if (!isCompact) {
      setCollapsed(false);
      return;
    }
    setCollapsed(true);
  }, [isCompact]);

  return (
    <aside className={`board-right-style${collapsed ? ' is-collapsed' : ''}${isCompact ? ' is-compact' : ''}`}>
      <header className="board-right-style__head">
        <strong>样式</strong>
        {isCompact ? (
          <button type="button" className="board-right-style__toggle" onClick={() => setCollapsed((value) => !value)}>
            <i className={collapsed ? 'fas fa-sliders-h' : 'fas fa-angle-down'} aria-hidden="true"></i>
            <span>{collapsed ? '展开' : '收起'}</span>
          </button>
        ) : null}
      </header>
      {!collapsed ? (
        <div className="board-right-style__body">
          {selectedCount > 0 ? (
            <DefaultStylePanel />
          ) : (
            <p className="board-right-style__placeholder">选中图形后可编辑颜色、粗细、填充和文本样式</p>
          )}
        </div>
      ) : null}
    </aside>
  );
}

function BoardCanvasZoomControls() {
  const editor = useEditor();
  const zoomPercent = useValue(
    'board-canvas-zoom-percent',
    () => Math.round(editor.getZoomLevel() * 100),
    [editor]
  );
  const shapeCount = useValue(
    'board-canvas-shape-total',
    () => {
      const ids = editor.getCurrentPageShapeIds();
      return Array.isArray(ids) ? ids.length : ids.size;
    },
    [editor]
  );

  const zoomOut = React.useCallback(() => {
    editor.zoomOut();
  }, [editor]);

  const zoomIn = React.useCallback(() => {
    editor.zoomIn();
  }, [editor]);

  const resetZoom = React.useCallback(() => {
    editor.resetZoom();
  }, [editor]);

  const zoomToFit = React.useCallback(() => {
    if (!shapeCount) return;
    editor.zoomToFit();
  }, [editor, shapeCount]);

  return (
    <div className="board-zoom-panel">
      <button type="button" className="board-zoom-panel__btn" title="缩小" onClick={zoomOut}>
        <i className="fas fa-minus" aria-hidden="true"></i>
      </button>
      <span className="board-zoom-panel__value">{zoomPercent}%</span>
      <button type="button" className="board-zoom-panel__btn" title="放大" onClick={zoomIn}>
        <i className="fas fa-plus" aria-hidden="true"></i>
      </button>
      <button type="button" className="board-zoom-panel__secondary" title="重置为 100%" onClick={resetZoom}>
        100%
      </button>
      <button
        type="button"
        className="board-zoom-panel__secondary"
        title="适配画布"
        disabled={!shapeCount}
        onClick={zoomToFit}
      >
        适配
      </button>
    </div>
  );
}

function BoardCanvasSnapIndicator(props) {
  return <DefaultSnapIndicator {...props} className={`board-snap-indicator board-snap-indicator--${props.line?.type || 'default'}`} />;
}

function BoardCanvasQuickConnectOverlay() {
  const editor = useEditor();
  const overlayState = useValue(
    'board-canvas-quick-connect-overlay',
    () => {
      const shape = editor.getOnlySelectedShape();
      if (!isQuickConnectVisible(editor, shape)) return null;
      const bounds = editor.getSelectionPageBounds() || editor.getShapePageBounds(shape.id);
      if (!bounds) return null;
      const hostRect = editor.getContainer()?.getBoundingClientRect?.();
      const hostLeft = hostRect?.left || 0;
      const hostTop = hostRect?.top || 0;
      return {
        shape,
        anchors: getQuickConnectAnchors(bounds).map((anchor) => ({
          ...anchor,
          screenPoint: (() => {
            const screenPoint = editor.pageToScreen(anchor.pagePoint);
            const offset = getQuickConnectScreenOffset(anchor.id);
            return {
              x: screenPoint.x - hostLeft + offset.x,
              y: screenPoint.y - hostTop + offset.y
            };
          })()
        }))
      };
    },
    [editor]
  );

  const handlePointerDown = React.useCallback(
    (anchor, event) => {
      event.preventDefault();
      event.stopPropagation();
      beginQuickConnectDrag(editor, overlayState?.shape, anchor, event.nativeEvent || event);
    },
    [editor, overlayState]
  );

  if (!overlayState) {
    return null;
  }

  return (
    <div className="board-connect-overlay board-connect-overlay--html" aria-hidden="true">
      {overlayState.anchors.map((anchor) => (
        <button
          key={`quick_connect_${overlayState.shape.id}_${anchor.id}`}
          type="button"
          className={`board-connect-overlay__button board-connect-overlay__button--${anchor.id}`}
          aria-label={anchor.label}
          title={anchor.label}
          style={{
            left: `${anchor.screenPoint.x}px`,
            top: `${anchor.screenPoint.y}px`
          }}
          onPointerDown={(event) => handlePointerDown(anchor, event)}
        >
          <span className="board-connect-overlay__ring"></span>
          <span className="board-connect-overlay__core"></span>
        </button>
      ))}
    </div>
  );
}

function BoardCanvasQuickConnectPreview() {
  const editor = useEditor();
  const preview = React.useSyncExternalStore(
    subscribeQuickConnectPreview,
    getQuickConnectPreviewSnapshot,
    getQuickConnectPreviewSnapshot
  );

  const previewState = useValue(
    'board-canvas-quick-connect-preview',
    () => {
      if (!preview?.startPagePoint || !preview?.currentPagePoint) return null;
      const start = resolveQuickConnectScreenPoint(editor, preview.startPagePoint);
      const end = resolveQuickConnectScreenPoint(editor, preview.currentPagePoint);
      const targetBounds = preview.targetBounds;
      let targetRect = null;
      if (targetBounds) {
        const topLeft = resolveQuickConnectScreenPoint(editor, {
          x: targetBounds.x,
          y: targetBounds.y
        });
        const bottomRight = resolveQuickConnectScreenPoint(editor, {
          x: targetBounds.x + targetBounds.w,
          y: targetBounds.y + targetBounds.h
        });
        targetRect = {
          x: topLeft.x,
          y: topLeft.y,
          w: bottomRight.x - topLeft.x,
          h: bottomRight.y - topLeft.y
        };
      }
      return {
        path: buildQuickConnectPreviewPath(start, end),
        targetRect
      };
    },
    [editor, preview]
  );

  if (!previewState) {
    return null;
  }

  return (
    <svg className="board-connect-preview" aria-hidden="true">
      <path d={previewState.path} className="board-connect-preview__path" />
      {previewState.targetRect ? (
        <rect
          className="board-connect-preview__target"
          x={previewState.targetRect.x}
          y={previewState.targetRect.y}
          width={previewState.targetRect.w}
          height={previewState.targetRect.h}
          rx="12"
          ry="12"
        />
      ) : null}
    </svg>
  );
}

function BoardCanvasOverlays() {
  return <TldrawOverlays />;
}

function BoardCanvasInFrontOfTheCanvas() {
  return (
    <>
      <BoardCanvasQuickConnectPreview />
      <BoardCanvasQuickConnectOverlay />
    </>
  );
}

function BoardCanvasUiPortals({ leftHost, rightHost, zoomHost }) {
  return (
    <>
      {leftHost ? createPortal(<BoardCanvasLeftPalette />, leftHost) : null}
      {rightHost ? createPortal(<BoardCanvasStylePanel />, rightHost) : null}
      {zoomHost ? createPortal(<BoardCanvasZoomControls />, zoomHost) : null}
    </>
  );
}

function BoardCanvasReactHost({ api, initialSnapshot }) {
  const [leftHost, setLeftHost] = React.useState(null);
  const [rightHost, setRightHost] = React.useState(null);
  const [zoomHost, setZoomHost] = React.useState(null);
  const hiddenUiComponents = React.useMemo(
    () => ({
      Toolbar: null,
      StylePanel: null,
      NavigationPanel: null,
      MenuPanel: DefaultMenuPanel,
      HelpMenu: null,
      HelperButtons: null,
      SharePanel: null,
      Overlays: BoardCanvasOverlays,
      SnapIndicator: BoardCanvasSnapIndicator,
      InFrontOfTheCanvas: BoardCanvasInFrontOfTheCanvas
    }),
    []
  );
  const initializedRef = React.useRef(false);
  return (
    <div className="board-canvas-react-host">
      <div className="board-canvas-react-host__surface">
        <Tldraw
          components={hiddenUiComponents}
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
        >
          <BoardCanvasUiPortals leftHost={leftHost} rightHost={rightHost} zoomHost={zoomHost} />
        </Tldraw>
      </div>
      <div ref={setLeftHost} className="board-left-palette-host"></div>
      <div ref={setRightHost} className="board-right-style-host"></div>
      <div ref={setZoomHost} className="board-zoom-host"></div>
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
