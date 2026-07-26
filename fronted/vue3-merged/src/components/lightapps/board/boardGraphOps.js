/**
 * boardGraphOps.js
 * Mermaid 图（flowchart / mindmap）与白板形状之间的互转：
 * - layoutGraphToShapes：图 → 自动布局的形状 + 连接线
 * - extractGraphFromShapes：形状 → 图（用于 Mermaid 导出）
 * 纯函数模块，可单测。
 */

import {
  BOARD_TEXT_DARK,
  SHAPE_PALETTE,
  createBoardShapeId,
  fallbackMeasure,
  toFiniteNumber
} from './feishuBoardCore';

const FLOW_LEVEL_GAP = 150;
const FLOW_NODE_GAP = 56;
const FLOW_NODE_HEIGHT = 72;
const MIND_LEVEL_GAP = 260;
const MIND_ROW_GAP = 26;
const MIND_NODE_HEIGHT = 56;

function nodeLabel(node) {
  return String(node?.label || node?.id || '').trim() || String(node?.id || 'node');
}

function measureNodeWidth(label, fontSize, measure) {
  const fn = typeof measure === 'function' ? measure : (text) => fallbackMeasure(text, fontSize);
  const longest = String(label)
    .split('\n')
    .reduce((max, line) => Math.max(max, fn(line)), 0);
  return Math.round(Math.min(280, Math.max(120, longest + 56)));
}

/** 拓扑分层：返回 Map<nodeId, level>，容忍环 */
export function assignFlowLevels(nodes, edges) {
  const levelById = new Map();
  const outgoing = new Map();
  const indegree = new Map();
  nodes.forEach((node) => {
    indegree.set(node.id, 0);
    outgoing.set(node.id, []);
  });
  edges.forEach((edge) => {
    if (!indegree.has(edge.from) || !indegree.has(edge.to) || edge.from === edge.to) return;
    outgoing.get(edge.from).push(edge.to);
    indegree.set(edge.to, indegree.get(edge.to) + 1);
  });

  const queue = [];
  nodes.forEach((node) => {
    if ((indegree.get(node.id) || 0) === 0) {
      levelById.set(node.id, 0);
      queue.push(node.id);
    }
  });
  if (!queue.length && nodes.length) {
    levelById.set(nodes[0].id, 0);
    queue.push(nodes[0].id);
  }

  const remaining = new Map(indegree);
  while (queue.length) {
    const current = queue.shift();
    const currentLevel = levelById.get(current) || 0;
    (outgoing.get(current) || []).forEach((next) => {
      const nextLevel = Math.max(levelById.get(next) ?? 0, currentLevel + 1);
      levelById.set(next, nextLevel);
      remaining.set(next, (remaining.get(next) || 0) - 1);
      if ((remaining.get(next) || 0) === 0) {
        queue.push(next);
      }
    });
  }

  // 环中的孤立节点兜底
  nodes.forEach((node) => {
    if (!levelById.has(node.id)) {
      const fromLevels = edges
        .filter((edge) => edge.to === node.id && levelById.has(edge.from))
        .map((edge) => levelById.get(edge.from) + 1);
      levelById.set(node.id, fromLevels.length ? Math.max(...fromLevels) : 0);
    }
  });

  return levelById;
}

function layoutFlowchart(graph, measure) {
  const nodes = Array.isArray(graph.nodes) ? graph.nodes : [];
  const edges = Array.isArray(graph.edges) ? graph.edges : [];
  const levelById = assignFlowLevels(nodes, edges);

  const rows = new Map();
  nodes.forEach((node) => {
    const level = levelById.get(node.id) || 0;
    const list = rows.get(level) || [];
    list.push(node);
    rows.set(level, list);
  });

  const placements = new Map();
  const sortedLevels = Array.from(rows.keys()).sort((a, b) => a - b);
  sortedLevels.forEach((level) => {
    const list = rows.get(level);
    const widths = list.map((node) => measureNodeWidth(nodeLabel(node), 14, measure));
    const totalWidth = widths.reduce((sum, w) => sum + w, 0) + FLOW_NODE_GAP * Math.max(0, list.length - 1);
    let cursor = -totalWidth / 2;
    list.forEach((node, index) => {
      placements.set(node.id, {
        x: cursor,
        y: level * (FLOW_NODE_HEIGHT + FLOW_LEVEL_GAP),
        w: widths[index],
        h: FLOW_NODE_HEIGHT,
        level
      });
      cursor += widths[index] + FLOW_NODE_GAP;
    });
  });

  return { placements, levelById };
}

/** 思维导图：右向树布局，按子树高度堆叠 */
function layoutMindmap(graph, measure) {
  const nodes = Array.isArray(graph.nodes) ? graph.nodes : [];
  const edges = Array.isArray(graph.edges) ? graph.edges : [];
  const childrenById = new Map(nodes.map((node) => [node.id, []]));
  const hasParent = new Set();
  edges.forEach((edge) => {
    if (!childrenById.has(edge.from) || !childrenById.has(edge.to)) return;
    childrenById.get(edge.from).push(edge.to);
    hasParent.add(edge.to);
  });
  const roots = nodes.filter((node) => !hasParent.has(node.id));
  const rootList = roots.length ? roots : nodes.slice(0, 1);

  const nodeById = new Map(nodes.map((node) => [node.id, node]));
  const heights = new Map();
  const visited = new Set();

  function subtreeHeight(id) {
    if (heights.has(id)) return heights.get(id);
    if (visited.has(id)) return MIND_NODE_HEIGHT;
    visited.add(id);
    const children = childrenById.get(id) || [];
    if (!children.length) {
      heights.set(id, MIND_NODE_HEIGHT);
      return MIND_NODE_HEIGHT;
    }
    const total = children.reduce((sum, child) => sum + subtreeHeight(child), 0) + MIND_ROW_GAP * (children.length - 1);
    const height = Math.max(MIND_NODE_HEIGHT, total);
    heights.set(id, height);
    return height;
  }

  const placements = new Map();
  const placed = new Set();

  function place(id, depth, top) {
    if (placed.has(id)) return;
    placed.add(id);
    const node = nodeById.get(id);
    const height = subtreeHeight(id);
    const width = measureNodeWidth(nodeLabel(node), depth === 0 ? 16 : 14, measure);
    placements.set(id, {
      x: depth * MIND_LEVEL_GAP,
      y: top + height / 2 - MIND_NODE_HEIGHT / 2,
      w: width,
      h: MIND_NODE_HEIGHT,
      level: depth
    });
    let cursor = top;
    (childrenById.get(id) || []).forEach((child) => {
      if (placed.has(child)) return;
      place(child, depth + 1, cursor);
      cursor += subtreeHeight(child) + MIND_ROW_GAP;
    });
  }

  let rootTop = 0;
  rootList.forEach((root) => {
    place(root.id, 0, rootTop);
    rootTop += subtreeHeight(root.id) + MIND_ROW_GAP * 2;
  });
  // 环导致的漏网节点
  nodes.forEach((node) => {
    if (!placed.has(node.id)) {
      place(node.id, 1, rootTop);
      rootTop += subtreeHeight(node.id) + MIND_ROW_GAP;
    }
  });

  return { placements };
}

const MIND_BRANCH_COLORS = [1, 2, 4, 6, 0, 5, 3, 7];

/**
 * 图 → 形状列表（节点 + 连接线）
 * 返回 { shapes, createdNodeCount, createdEdgeCount }
 */
export function layoutGraphToShapes(graphInput, options = {}) {
  const graph = graphInput && typeof graphInput === 'object' ? graphInput : { kind: 'flowchart', nodes: [], edges: [] };
  const kind = String(graph.kind || 'flowchart').toLowerCase() === 'mindmap' ? 'mindmap' : 'flowchart';
  const nodes = Array.isArray(graph.nodes) ? graph.nodes : [];
  const edges = Array.isArray(graph.edges) ? graph.edges : [];
  const measure = options.measure;
  const origin = {
    x: toFiniteNumber(options.originX, 160),
    y: toFiniteNumber(options.originY, 120)
  };

  const layoutResult = kind === 'mindmap' ? layoutMindmap(graph, measure) : layoutFlowchart(graph, measure);
  const { placements } = layoutResult;
  const levelById = layoutResult.levelById || new Map();

  const shapes = [];
  const shapeIdByNode = new Map();
  const branchColorByNode = new Map();

  if (kind === 'mindmap') {
    // 根的直接子分支决定颜色
    const childrenByFrom = new Map();
    edges.forEach((edge) => {
      const list = childrenByFrom.get(edge.from) || [];
      list.push(edge.to);
      childrenByFrom.set(edge.from, list);
    });
    const hasParent = new Set(edges.map((edge) => edge.to));
    const roots = nodes.filter((node) => !hasParent.has(node.id)).map((node) => node.id);
    let branchSeq = 0;
    function paint(id, colorIndex) {
      if (branchColorByNode.has(id)) return;
      branchColorByNode.set(id, colorIndex);
      (childrenByFrom.get(id) || []).forEach((child) => paint(child, colorIndex));
    }
    roots.forEach((rootId) => {
      branchColorByNode.set(rootId, 0);
      (childrenByFrom.get(rootId) || []).forEach((child) => {
        paint(child, MIND_BRANCH_COLORS[branchSeq % MIND_BRANCH_COLORS.length]);
        branchSeq += 1;
      });
    });
  }

  nodes.forEach((node, index) => {
    const placement = placements.get(node.id);
    if (!placement) return;
    const label = nodeLabel(node);
    const shapeId = createBoardShapeId();
    const isMind = kind === 'mindmap';
    const isRoot = isMind && placement.level === 0;
    const paletteEntry = isMind
      ? SHAPE_PALETTE[branchColorByNode.get(node.id) || 0]
      : SHAPE_PALETTE[0];
    shapes.push({
      id: shapeId,
      type: 'geo',
      x: Math.round(origin.x + placement.x),
      y: Math.round(origin.y + placement.y),
      w: placement.w,
      h: placement.h,
      rotation: 0,
      props: {
        geo: isRoot ? 'ellipse' : 'round',
        fill: paletteEntry.soft,
        stroke: isMind ? 'none' : paletteEntry.stroke,
        strokeWidth: isMind ? 0 : 2,
        dash: 'solid',
        text: label,
        fontSize: isRoot ? 16 : 14,
        textColor: BOARD_TEXT_DARK,
        align: 'center'
      },
      meta: {
        nodeId: String(node.id || `n${index + 1}`),
        nodeLabel: label
      }
    });
    shapeIdByNode.set(node.id, shapeId);
  });

  let createdEdgeCount = 0;
  edges.forEach((edge) => {
    const fromShapeId = shapeIdByNode.get(edge.from);
    const toShapeId = shapeIdByNode.get(edge.to);
    if (!fromShapeId || !toShapeId) return;
    const label = String(edge.label || '').trim();
    const isMind = kind === 'mindmap';
    // 跨多层或回连的边用曲线路由，避免横穿中间层节点
    const fromLevel = levelById.get(edge.from);
    const toLevel = levelById.get(edge.to);
    const isLongSpan =
      !isMind && Number.isFinite(fromLevel) && Number.isFinite(toLevel) && (toLevel - fromLevel > 1 || toLevel <= fromLevel);
    shapes.push({
      id: createBoardShapeId(),
      type: 'connector',
      x: 0,
      y: 0,
      w: 0,
      h: 0,
      rotation: 0,
      props: {
        start: { shapeId: fromShapeId, anchor: isMind ? 'right' : isLongSpan ? 'auto' : 'bottom' },
        end: { shapeId: toShapeId, anchor: isMind ? 'left' : isLongSpan ? 'auto' : 'top' },
        router: isMind || isLongSpan ? 'curve' : 'elbow',
        stroke: '#8F959E',
        strokeWidth: 2,
        dash: 'solid',
        arrowStart: 'none',
        arrowEnd: isMind ? 'none' : 'arrow',
        text: label,
        fontSize: 13
      },
      meta: {
        edgeFrom: String(edge.from || ''),
        edgeTo: String(edge.to || ''),
        edgeLabel: label
      }
    });
    createdEdgeCount += 1;
  });

  return {
    shapes,
    createdNodeCount: shapeIdByNode.size,
    createdEdgeCount
  };
}

function nearestNodeByPoint(point, nodeList) {
  if (!point || !nodeList.length) return null;
  let winner = null;
  let minDistance = Infinity;
  nodeList.forEach((node) => {
    const dx = point.x - node.center.x;
    const dy = point.y - node.center.y;
    const distance = dx * dx + dy * dy;
    if (distance >= minDistance) return;
    minDistance = distance;
    winner = node;
  });
  return winner;
}

/**
 * 形状 → 图。可作为 Mermaid 导出的输入。
 * 返回 { graph, ignored: { ignoredEdgeCount } }
 */
export function extractGraphFromShapes(shapes, preferredKind = 'FLOWCHART', options = {}) {
  const list = Array.isArray(shapes) ? shapes : [];
  const getShapeById = (id) => list.find((shape) => shape.id === id) || null;
  const resolveEndPoint =
    typeof options.resolveEndPoint === 'function'
      ? options.resolveEndPoint
      : (connector, terminal) => {
          const ref = connector.props?.[terminal];
          return { x: toFiniteNumber(ref?.x), y: toFiniteNumber(ref?.y) };
        };

  const nodeList = [];
  const nodeByShapeId = new Map();
  let seq = 1;

  list.forEach((shape) => {
    if (!shape || !['geo', 'note', 'text'].includes(shape.type)) return;
    const metaNodeId = String(shape.meta?.nodeId || '').trim();
    const nodeId = metaNodeId || `n${seq}`;
    seq += 1;
    const text = String(shape.props?.text || '').trim();
    const label = String(shape.meta?.nodeLabel || '').trim() || text || nodeId;
    const node = {
      id: nodeId,
      label,
      shapeId: shape.id,
      center: {
        x: toFiniteNumber(shape.x) + toFiniteNumber(shape.w) / 2,
        y: toFiniteNumber(shape.y) + toFiniteNumber(shape.h) / 2
      }
    };
    nodeList.push(node);
    nodeByShapeId.set(shape.id, node);
  });

  const edges = [];
  let ignoredEdgeCount = 0;
  list.forEach((shape) => {
    if (!shape || shape.type !== 'connector') return;
    const props = shape.props || {};
    let fromId = String(shape.meta?.edgeFrom || '').trim();
    let toId = String(shape.meta?.edgeTo || '').trim();
    const validIds = new Set(nodeList.map((node) => node.id));
    if (fromId && !validIds.has(fromId)) fromId = '';
    if (toId && !validIds.has(toId)) toId = '';

    if (!fromId && props.start?.shapeId) {
      fromId = nodeByShapeId.get(props.start.shapeId)?.id || '';
    }
    if (!toId && props.end?.shapeId) {
      toId = nodeByShapeId.get(props.end.shapeId)?.id || '';
    }
    if (!fromId) {
      fromId = nearestNodeByPoint(resolveEndPoint(shape, 'start'), nodeList)?.id || '';
    }
    if (!toId) {
      toId = nearestNodeByPoint(resolveEndPoint(shape, 'end'), nodeList)?.id || '';
    }
    if (!fromId || !toId) {
      ignoredEdgeCount += 1;
      return;
    }
    edges.push({
      from: fromId,
      to: toId,
      label: String(shape.meta?.edgeLabel || '').trim() || String(props.text || '').trim()
    });
  });

  const uniqueNodes = [];
  const seen = new Set();
  nodeList.forEach((node) => {
    if (seen.has(node.id)) return;
    seen.add(node.id);
    uniqueNodes.push({ id: node.id, label: node.label });
  });

  return {
    graph: {
      kind: String(preferredKind || 'FLOWCHART').toUpperCase() === 'MINDMAP' ? 'mindmap' : 'flowchart',
      nodes: uniqueNodes,
      edges
    },
    ignored: { ignoredEdgeCount }
  };
}
