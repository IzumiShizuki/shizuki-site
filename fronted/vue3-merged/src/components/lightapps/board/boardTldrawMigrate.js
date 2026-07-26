/**
 * boardTldrawMigrate.js
 * 把旧版（tldraw v3/v4）画板快照转换为自研引擎的 v2 快照格式。
 * 纯函数模块，可单测。
 */

import { richTextToPlainText } from './boardMermaid';
import {
  BOARD_STROKE_NEUTRAL,
  BOARD_TEXT_DARK,
  NOTE_PALETTE,
  SNAPSHOT_ENGINE,
  SNAPSHOT_VERSION,
  round2,
  toFiniteNumber
} from './feishuBoardCore';

/** tldraw 颜色名 → 自研引擎 { stroke, soft } */
const TLDRAW_COLOR_MAP = Object.freeze({
  black: { stroke: '#1F2329', soft: '#FFFFFF' },
  grey: { stroke: '#646A73', soft: '#EFF0F1' },
  'light-violet': { stroke: '#7F3BF5', soft: '#ECE2FE' },
  violet: { stroke: '#7F3BF5', soft: '#ECE2FE' },
  blue: { stroke: '#3370FF', soft: '#E1EAFF' },
  'light-blue': { stroke: '#3370FF', soft: '#E1EAFF' },
  yellow: { stroke: '#FFC60A', soft: '#FDF4C5' },
  orange: { stroke: '#FF8800', soft: '#FFE8CC' },
  green: { stroke: '#34C724', soft: '#D9F5D6' },
  'light-green': { stroke: '#34C724', soft: '#D9F5D6' },
  'light-red': { stroke: '#F54A45', soft: '#FDE2E2' },
  red: { stroke: '#F54A45', soft: '#FDE2E2' },
  white: { stroke: '#FFFFFF', soft: '#FFFFFF' }
});

const TLDRAW_NOTE_COLOR_MAP = Object.freeze({
  black: NOTE_PALETTE[8],
  grey: NOTE_PALETTE[8],
  'light-violet': NOTE_PALETTE[7],
  violet: NOTE_PALETTE[7],
  blue: NOTE_PALETTE[6],
  'light-blue': NOTE_PALETTE[5],
  yellow: NOTE_PALETTE[0],
  orange: NOTE_PALETTE[1],
  green: NOTE_PALETTE[4],
  'light-green': NOTE_PALETTE[4],
  'light-red': NOTE_PALETTE[2],
  red: NOTE_PALETTE[2],
  white: '#FFFFFF'
});

const TLDRAW_GEO_MAP = Object.freeze({
  rectangle: 'rect',
  'check-box': 'rect',
  'x-box': 'rect',
  ellipse: 'ellipse',
  oval: 'ellipse',
  diamond: 'diamond',
  rhombus: 'parallelogram',
  'rhombus-2': 'parallelogram',
  triangle: 'triangle',
  trapezoid: 'parallelogram',
  hexagon: 'hexagon',
  octagon: 'hexagon',
  pentagon: 'hexagon',
  star: 'star',
  cloud: 'bubble',
  heart: 'bubble',
  'arrow-right': 'rect',
  'arrow-left': 'rect',
  'arrow-up': 'rect',
  'arrow-down': 'rect'
});

const STROKE_WIDTH_MAP = Object.freeze({ s: 2, m: 3, l: 4, xl: 6 });
const FONT_SIZE_MAP = Object.freeze({ s: 13, m: 16, l: 22, xl: 30 });
const NOTE_FONT_SIZE_MAP = Object.freeze({ s: 13, m: 15, l: 20, xl: 26 });

function mapColor(name) {
  return TLDRAW_COLOR_MAP[String(name || '').trim()] || { stroke: BOARD_STROKE_NEUTRAL, soft: '#EFF0F1' };
}

function extractPlainText(props) {
  if (!props || typeof props !== 'object') return '';
  if (props.richText) {
    const text = richTextToPlainText(props.richText);
    if (text) return text;
  }
  if (typeof props.text === 'string') return props.text;
  return '';
}

function readMetaText(meta, key) {
  if (!meta || typeof meta !== 'object') return '';
  const value = meta[key];
  if (value === undefined || value === null) return '';
  return String(value).trim();
}

function convertMeta(meta) {
  const nodeId = readMetaText(meta, 'board_canvas_node_id');
  const nodeLabel = readMetaText(meta, 'board_canvas_node_label');
  const edgeFrom = readMetaText(meta, 'board_canvas_edge_from');
  const edgeTo = readMetaText(meta, 'board_canvas_edge_to');
  const edgeLabel = readMetaText(meta, 'board_canvas_edge_label');
  const next = {};
  if (nodeId) next.nodeId = nodeId;
  if (nodeLabel) next.nodeLabel = nodeLabel;
  if (edgeFrom) next.edgeFrom = edgeFrom;
  if (edgeTo) next.edgeTo = edgeTo;
  if (edgeLabel) next.edgeLabel = edgeLabel;
  return next;
}

/** 判断是否为 tldraw 快照（编辑器快照或 store 快照两种包装） */
export function isTldrawSnapshot(snapshot) {
  if (!snapshot || typeof snapshot !== 'object') return false;
  if (snapshot.engine === SNAPSHOT_ENGINE) return false;
  if (snapshot.document && typeof snapshot.document === 'object' && snapshot.document.store) return true;
  if (snapshot.store && typeof snapshot.store === 'object') return true;
  return false;
}

export function isFeishuBoardSnapshot(snapshot) {
  return Boolean(
    snapshot &&
      typeof snapshot === 'object' &&
      (snapshot.engine === SNAPSHOT_ENGINE || (Number(snapshot.version) >= 2 && Array.isArray(snapshot.shapes)))
  );
}

function collectRecords(snapshot) {
  const store = snapshot?.document?.store || snapshot?.store || {};
  return Object.values(store).filter((record) => record && typeof record === 'object');
}

function convertGeo(record) {
  const props = record.props || {};
  const color = mapColor(props.color);
  const fillMode = String(props.fill || 'none');
  const geoKind = TLDRAW_GEO_MAP[String(props.geo || 'rectangle')] || 'rect';
  return {
    id: String(record.id),
    type: 'geo',
    x: round2(record.x),
    y: round2(record.y),
    w: Math.max(8, round2(props.w)),
    h: Math.max(8, round2(props.h)),
    rotation: toFiniteNumber(record.rotation),
    props: {
      geo: geoKind,
      fill: fillMode === 'none' ? 'none' : color.soft,
      stroke: color.stroke,
      strokeWidth: STROKE_WIDTH_MAP[props.size] || 2,
      dash: props.dash === 'dashed' ? 'dashed' : props.dash === 'dotted' ? 'dotted' : 'solid',
      text: extractPlainText(props),
      fontSize: FONT_SIZE_MAP[props.size] || 14,
      textColor: BOARD_TEXT_DARK,
      align: 'center'
    },
    meta: convertMeta(record.meta)
  };
}

function convertNote(record) {
  const props = record.props || {};
  return {
    id: String(record.id),
    type: 'note',
    x: round2(record.x),
    y: round2(record.y),
    w: 200,
    h: Math.max(200, 200 + toFiniteNumber(props.growY)),
    rotation: toFiniteNumber(record.rotation),
    props: {
      color: TLDRAW_NOTE_COLOR_MAP[String(props.color || 'yellow')] || NOTE_PALETTE[0],
      text: extractPlainText(props),
      fontSize: NOTE_FONT_SIZE_MAP[props.size] || 15,
      textColor: BOARD_TEXT_DARK
    },
    meta: convertMeta(record.meta)
  };
}

function convertText(record) {
  const props = record.props || {};
  const fontSize = FONT_SIZE_MAP[props.size] || 16;
  const text = extractPlainText(props);
  const lineCount = Math.max(1, text.split('\n').length);
  return {
    id: String(record.id),
    type: 'text',
    x: round2(record.x),
    y: round2(record.y),
    w: Math.max(24, round2(props.w) || 200),
    h: Math.round(lineCount * fontSize * 1.4),
    rotation: toFiniteNumber(record.rotation),
    props: {
      text,
      fontSize,
      color: mapColor(props.color).stroke,
      align: props.textAlign === 'middle' ? 'center' : props.textAlign === 'end' ? 'right' : 'left'
    },
    meta: convertMeta(record.meta)
  };
}

function convertFrame(record) {
  const props = record.props || {};
  return {
    id: String(record.id),
    type: 'geo',
    x: round2(record.x),
    y: round2(record.y),
    w: Math.max(8, round2(props.w)),
    h: Math.max(8, round2(props.h)),
    rotation: toFiniteNumber(record.rotation),
    props: {
      geo: 'rect',
      fill: 'none',
      stroke: '#B4B8BF',
      strokeWidth: 1,
      dash: 'solid',
      text: String(props.name || ''),
      fontSize: 13,
      textColor: BOARD_STROKE_NEUTRAL,
      align: 'center'
    },
    meta: convertMeta(record.meta)
  };
}

function convertDrawLike(record, highlight) {
  const props = record.props || {};
  const color = mapColor(props.color);
  const segments = Array.isArray(props.segments) ? props.segments : [];
  const points = [];
  segments.forEach((segment) => {
    (Array.isArray(segment?.points) ? segment.points : []).forEach((point) => {
      points.push([round2(point.x), round2(point.y)]);
    });
  });
  if (!points.length) return null;
  return {
    id: String(record.id),
    type: 'draw',
    x: round2(record.x),
    y: round2(record.y),
    w: 1,
    h: 1,
    rotation: toFiniteNumber(record.rotation),
    props: {
      points,
      stroke: color.stroke,
      strokeWidth: highlight ? (STROKE_WIDTH_MAP[props.size] || 3) * 3 : STROKE_WIDTH_MAP[props.size] || 3,
      opacity: highlight ? 0.45 : 1,
      highlight: Boolean(highlight)
    },
    meta: {}
  };
}

function convertLine(record) {
  const props = record.props || {};
  const color = mapColor(props.color);
  const rawPoints = props.points && typeof props.points === 'object' ? Object.values(props.points) : [];
  const sorted = rawPoints
    .filter((point) => point && typeof point === 'object')
    .sort((a, b) => String(a.index || '').localeCompare(String(b.index || '')));
  if (sorted.length < 2) return null;
  const first = sorted[0];
  const last = sorted[sorted.length - 1];
  return {
    id: String(record.id),
    type: 'connector',
    x: 0,
    y: 0,
    w: 0,
    h: 0,
    rotation: 0,
    props: {
      start: { x: round2(record.x + toFiniteNumber(first.x)), y: round2(record.y + toFiniteNumber(first.y)) },
      end: { x: round2(record.x + toFiniteNumber(last.x)), y: round2(record.y + toFiniteNumber(last.y)) },
      router: 'straight',
      stroke: color.stroke,
      strokeWidth: STROKE_WIDTH_MAP[props.size] || 2,
      dash: props.dash === 'dashed' ? 'dashed' : props.dash === 'dotted' ? 'dotted' : 'solid',
      arrowStart: 'none',
      arrowEnd: 'none',
      text: '',
      fontSize: 13
    },
    meta: {}
  };
}

function normalizedAnchorToAnchorId(normalizedAnchor) {
  const ax = toFiniteNumber(normalizedAnchor?.x, 0.5);
  const ay = toFiniteNumber(normalizedAnchor?.y, 0.5);
  const dx = ax - 0.5;
  const dy = ay - 0.5;
  if (Math.abs(dx) < 0.18 && Math.abs(dy) < 0.18) return 'auto';
  if (Math.abs(dx) >= Math.abs(dy)) return dx >= 0 ? 'right' : 'left';
  return dy >= 0 ? 'bottom' : 'top';
}

function convertArrow(record, bindingsByArrow) {
  const props = record.props || {};
  const color = mapColor(props.color);
  const bindings = bindingsByArrow.get(String(record.id)) || {};

  function endRefFor(terminal, terminalPoint) {
    const binding = bindings[terminal];
    if (binding && binding.toId) {
      return {
        shapeId: String(binding.toId),
        anchor: normalizedAnchorToAnchorId(binding.props?.normalizedAnchor)
      };
    }
    // tldraw v2 内嵌 binding
    const inline = props[terminal];
    if (inline && inline.type === 'binding' && inline.boundShapeId) {
      return {
        shapeId: String(inline.boundShapeId),
        anchor: normalizedAnchorToAnchorId(inline.normalizedAnchor)
      };
    }
    return {
      x: round2(record.x + toFiniteNumber(terminalPoint?.x)),
      y: round2(record.y + toFiniteNumber(terminalPoint?.y))
    };
  }

  return {
    id: String(record.id),
    type: 'connector',
    x: 0,
    y: 0,
    w: 0,
    h: 0,
    rotation: 0,
    props: {
      start: endRefFor('start', props.start),
      end: endRefFor('end', props.end),
      router: Math.abs(toFiniteNumber(props.bend)) > 4 ? 'curve' : 'straight',
      stroke: color.stroke === '#1F2329' ? BOARD_STROKE_NEUTRAL : color.stroke,
      strokeWidth: STROKE_WIDTH_MAP[props.size] || 2,
      dash: props.dash === 'dashed' ? 'dashed' : props.dash === 'dotted' ? 'dotted' : 'solid',
      arrowStart: props.arrowheadStart && props.arrowheadStart !== 'none' ? 'arrow' : 'none',
      arrowEnd: props.arrowheadEnd && props.arrowheadEnd !== 'none' ? 'arrow' : 'none',
      text: extractPlainText(props),
      fontSize: 13
    },
    meta: convertMeta(record.meta)
  };
}

function convertImage(record, assetsById) {
  const props = record.props || {};
  const asset = assetsById.get(String(props.assetId || ''));
  const src = String(asset?.props?.src || props.url || '');
  if (!src || (!src.startsWith('data:') && !src.startsWith('http'))) return null;
  return {
    id: String(record.id),
    type: 'image',
    x: round2(record.x),
    y: round2(record.y),
    w: Math.max(8, round2(props.w) || 320),
    h: Math.max(8, round2(props.h) || 240),
    rotation: toFiniteNumber(record.rotation),
    props: { src },
    meta: {}
  };
}

/**
 * tldraw 快照 → v2 快照
 */
export function migrateTldrawSnapshot(snapshot) {
  const records = collectRecords(snapshot);
  const shapeRecords = records.filter((record) => record.typeName === 'shape');
  const assetsById = new Map(
    records.filter((record) => record.typeName === 'asset').map((record) => [String(record.id), record])
  );

  const bindingsByArrow = new Map();
  records
    .filter((record) => record.typeName === 'binding' && record.type === 'arrow')
    .forEach((record) => {
      const arrowId = String(record.fromId || '');
      if (!arrowId) return;
      const bucket = bindingsByArrow.get(arrowId) || {};
      const terminal = record.props?.terminal === 'start' ? 'start' : 'end';
      bucket[terminal] = record;
      bindingsByArrow.set(arrowId, bucket);
    });

  const sorted = shapeRecords
    .slice()
    .sort((a, b) => String(a.index || '').localeCompare(String(b.index || '')));

  const shapes = [];
  const connectors = [];
  sorted.forEach((record) => {
    let converted = null;
    switch (record.type) {
      case 'geo':
        converted = convertGeo(record);
        break;
      case 'note':
        converted = convertNote(record);
        break;
      case 'text':
        converted = convertText(record);
        break;
      case 'frame':
        converted = convertFrame(record);
        break;
      case 'draw':
        converted = convertDrawLike(record, false);
        break;
      case 'highlight':
        converted = convertDrawLike(record, true);
        break;
      case 'line':
        converted = convertLine(record);
        break;
      case 'arrow':
        converted = convertArrow(record, bindingsByArrow);
        break;
      case 'image':
        converted = convertImage(record, assetsById);
        break;
      default:
        converted = null;
    }
    if (!converted) return;
    if (converted.type === 'connector') {
      connectors.push(converted);
    } else {
      shapes.push(converted);
    }
  });

  // draw 形状的包围盒需要根据点列重建
  shapes.forEach((shape) => {
    if (shape.type !== 'draw') return;
    const points = shape.props.points;
    let minX = Infinity;
    let minY = Infinity;
    let maxX = -Infinity;
    let maxY = -Infinity;
    points.forEach(([px, py]) => {
      minX = Math.min(minX, px);
      minY = Math.min(minY, py);
      maxX = Math.max(maxX, px);
      maxY = Math.max(maxY, py);
    });
    shape.x = round2(shape.x + minX);
    shape.y = round2(shape.y + minY);
    shape.w = Math.max(1, round2(maxX - minX));
    shape.h = Math.max(1, round2(maxY - minY));
    shape.props.points = points.map(([px, py]) => [round2(px - minX), round2(py - minY)]);
  });

  const shapeIds = new Set(shapes.map((shape) => shape.id));
  connectors.forEach((connector) => {
    ['start', 'end'].forEach((terminal) => {
      const ref = connector.props[terminal];
      if (ref?.shapeId && !shapeIds.has(ref.shapeId)) {
        connector.props[terminal] = { x: 0, y: 0 };
      }
    });
  });

  return {
    version: SNAPSHOT_VERSION,
    engine: SNAPSHOT_ENGINE,
    shapes: [...shapes, ...connectors],
    camera: null
  };
}

/**
 * 任意快照（v2 / tldraw / 空）→ v2 快照
 */
export function normalizeBoardSnapshot(snapshot) {
  if (!snapshot || typeof snapshot !== 'object') return null;
  if (isFeishuBoardSnapshot(snapshot)) {
    return {
      version: SNAPSHOT_VERSION,
      engine: SNAPSHOT_ENGINE,
      shapes: Array.isArray(snapshot.shapes) ? snapshot.shapes : [],
      camera: snapshot.camera && typeof snapshot.camera === 'object' ? snapshot.camera : null
    };
  }
  if (isTldrawSnapshot(snapshot)) {
    return migrateTldrawSnapshot(snapshot);
  }
  return null;
}
