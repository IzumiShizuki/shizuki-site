/**
 * feishuBoardCore.js
 * 自研白板核心：常量、调色板、形状模型、几何计算、连接线路由与命中测试。
 * 纯函数模块，不依赖 DOM / Canvas，可直接被 vitest 单测。
 */

export const FEISHU_BLUE = '#3370FF';
export const BOARD_BG = '#FFFFFF';
export const BOARD_GRID_DOT = '#DEE0E3';
export const BOARD_GRID_SPACING = 24;
export const BOARD_TEXT_DARK = '#1F2329';
export const BOARD_STROKE_NEUTRAL = '#646A73';
export const SNAP_GUIDE_COLOR = '#F54A45';

export const BOARD_FONT_FAMILY =
  "-apple-system, BlinkMacSystemFont, 'Segoe UI', 'PingFang SC', 'Hiragino Sans GB', 'Microsoft YaHei', 'Helvetica Neue', Arial, sans-serif";

export const SNAPSHOT_ENGINE = 'shizuki-feishu-board';
export const SNAPSHOT_VERSION = 2;

/** 飞书风格形状描边/软填充调色板 */
export const SHAPE_PALETTE = Object.freeze([
  { id: 'blue', stroke: '#3370FF', soft: '#E1EAFF' },
  { id: 'cyan', stroke: '#14C0FF', soft: '#D5F2FE' },
  { id: 'green', stroke: '#34C724', soft: '#D9F5D6' },
  { id: 'yellow', stroke: '#FFC60A', soft: '#FDF4C5' },
  { id: 'orange', stroke: '#FF8800', soft: '#FFE8CC' },
  { id: 'red', stroke: '#F54A45', soft: '#FDE2E2' },
  { id: 'purple', stroke: '#7F3BF5', soft: '#ECE2FE' },
  { id: 'grey', stroke: '#646A73', soft: '#EFF0F1' },
  { id: 'black', stroke: '#1F2329', soft: '#FFFFFF' }
]);

/** 便签配色（飞书便签的柔和纸色） */
export const NOTE_PALETTE = Object.freeze([
  '#FFF1A1',
  '#FFDFA6',
  '#FFD2CF',
  '#FBC7E8',
  '#D9F5D6',
  '#C4EDFC',
  '#CDDDFF',
  '#E6DCFF',
  '#F2F3F5'
]);

export const FILL_CHOICES = Object.freeze([
  '#FFFFFF',
  ...SHAPE_PALETTE.slice(0, 8).map((item) => item.soft),
  'none'
]);

export const STROKE_CHOICES = Object.freeze(SHAPE_PALETTE.map((item) => item.stroke));

export const TEXT_COLOR_CHOICES = Object.freeze([
  BOARD_TEXT_DARK,
  '#646A73',
  '#3370FF',
  '#F54A45',
  '#FF8800',
  '#2EA121',
  '#7F3BF5',
  '#FFFFFF'
]);

export const FONT_SIZE_CHOICES = Object.freeze([12, 14, 16, 20, 24, 32, 40]);
export const STROKE_WIDTH_CHOICES = Object.freeze([1, 2, 4]);

export const GEO_KINDS = Object.freeze([
  'rect',
  'round',
  'ellipse',
  'diamond',
  'triangle',
  'parallelogram',
  'hexagon',
  'star',
  'cylinder',
  'bubble'
]);

export const CONNECTOR_ROUTERS = Object.freeze(['elbow', 'straight', 'curve']);

export const ANCHOR_IDS = Object.freeze(['top', 'right', 'bottom', 'left']);

const ANCHOR_NORMALS = Object.freeze({
  top: { x: 0, y: -1 },
  right: { x: 1, y: 0 },
  bottom: { x: 0, y: 1 },
  left: { x: -1, y: 0 }
});

export const DEFAULT_GEO_SIZE = Object.freeze({
  rect: { w: 160, h: 88 },
  round: { w: 160, h: 88 },
  ellipse: { w: 140, h: 140 },
  diamond: { w: 160, h: 110 },
  triangle: { w: 150, h: 120 },
  parallelogram: { w: 180, h: 92 },
  hexagon: { w: 168, h: 96 },
  star: { w: 140, h: 132 },
  cylinder: { w: 140, h: 110 },
  bubble: { w: 176, h: 110 }
});

export const NOTE_DEFAULT_SIZE = Object.freeze({ w: 200, h: 200 });
export const TEXT_DEFAULT_WIDTH = 24;

let idSeq = 0;

export function createBoardShapeId() {
  idSeq = (idSeq + 1) % 46656;
  return `s${Date.now().toString(36)}${idSeq.toString(36).padStart(3, '0')}`;
}

export function toFiniteNumber(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : fallback;
}

export function clamp(value, min, max) {
  return Math.min(max, Math.max(min, value));
}

/* ------------------------------------------------------------------ */
/* 形状工厂                                                            */
/* ------------------------------------------------------------------ */

export function createGeoShape(kind, x, y, overrides = {}) {
  const geo = GEO_KINDS.includes(kind) ? kind : 'rect';
  const size = DEFAULT_GEO_SIZE[geo] || DEFAULT_GEO_SIZE.rect;
  return {
    id: createBoardShapeId(),
    type: 'geo',
    x: toFiniteNumber(x),
    y: toFiniteNumber(y),
    w: size.w,
    h: size.h,
    rotation: 0,
    props: {
      geo,
      fill: '#FFFFFF',
      stroke: BOARD_STROKE_NEUTRAL,
      strokeWidth: 2,
      dash: 'solid',
      text: '',
      fontSize: 14,
      textColor: BOARD_TEXT_DARK,
      align: 'center'
    },
    meta: {},
    ...overrides
  };
}

export function createNoteShape(x, y, color = NOTE_PALETTE[0]) {
  return {
    id: createBoardShapeId(),
    type: 'note',
    x: toFiniteNumber(x),
    y: toFiniteNumber(y),
    w: NOTE_DEFAULT_SIZE.w,
    h: NOTE_DEFAULT_SIZE.h,
    rotation: 0,
    props: {
      color,
      text: '',
      fontSize: 14,
      textColor: BOARD_TEXT_DARK
    },
    meta: {}
  };
}

export function createTextShape(x, y, text = '', fontSize = 16) {
  return {
    id: createBoardShapeId(),
    type: 'text',
    x: toFiniteNumber(x),
    y: toFiniteNumber(y),
    w: TEXT_DEFAULT_WIDTH,
    h: Math.round(fontSize * 1.4),
    rotation: 0,
    props: {
      text: String(text || ''),
      fontSize,
      color: BOARD_TEXT_DARK,
      align: 'left'
    },
    meta: {}
  };
}

export function createConnectorShape(start, end, overrides = {}) {
  return {
    id: createBoardShapeId(),
    type: 'connector',
    x: 0,
    y: 0,
    w: 0,
    h: 0,
    rotation: 0,
    props: {
      start: normalizeEndRef(start),
      end: normalizeEndRef(end),
      router: 'elbow',
      stroke: BOARD_STROKE_NEUTRAL,
      strokeWidth: 2,
      dash: 'solid',
      arrowStart: 'none',
      arrowEnd: 'arrow',
      text: '',
      fontSize: 13,
      ...overrides
    },
    meta: {}
  };
}

export function createDrawShape(points, options = {}) {
  const normalized = Array.isArray(points) && points.length ? points : [[0, 0]];
  let minX = Infinity;
  let minY = Infinity;
  let maxX = -Infinity;
  let maxY = -Infinity;
  normalized.forEach(([px, py]) => {
    minX = Math.min(minX, px);
    minY = Math.min(minY, py);
    maxX = Math.max(maxX, px);
    maxY = Math.max(maxY, py);
  });
  return {
    id: createBoardShapeId(),
    type: 'draw',
    x: minX,
    y: minY,
    w: Math.max(1, maxX - minX),
    h: Math.max(1, maxY - minY),
    rotation: 0,
    props: {
      points: normalized.map(([px, py]) => [round2(px - minX), round2(py - minY)]),
      stroke: options.stroke || BOARD_TEXT_DARK,
      strokeWidth: toFiniteNumber(options.strokeWidth, 3),
      opacity: toFiniteNumber(options.opacity, 1),
      highlight: Boolean(options.highlight)
    },
    meta: {}
  };
}

export function createImageShape(src, x, y, w, h) {
  return {
    id: createBoardShapeId(),
    type: 'image',
    x: toFiniteNumber(x),
    y: toFiniteNumber(y),
    w: Math.max(24, toFiniteNumber(w, 320)),
    h: Math.max(24, toFiniteNumber(h, 240)),
    rotation: 0,
    props: {
      src: String(src || '')
    },
    meta: {}
  };
}

export function normalizeEndRef(ref) {
  if (ref && typeof ref === 'object' && ref.shapeId) {
    return {
      shapeId: String(ref.shapeId),
      anchor: ANCHOR_IDS.includes(ref.anchor) ? ref.anchor : 'auto'
    };
  }
  return {
    x: toFiniteNumber(ref?.x),
    y: toFiniteNumber(ref?.y)
  };
}

export function round2(value) {
  return Math.round(toFiniteNumber(value) * 100) / 100;
}

/* ------------------------------------------------------------------ */
/* 几何基础                                                            */
/* ------------------------------------------------------------------ */

export function getShapeBounds(shape) {
  return {
    x: toFiniteNumber(shape?.x),
    y: toFiniteNumber(shape?.y),
    w: Math.max(1, toFiniteNumber(shape?.w, 1)),
    h: Math.max(1, toFiniteNumber(shape?.h, 1))
  };
}

export function getBoundsCenter(bounds) {
  return {
    x: bounds.x + bounds.w / 2,
    y: bounds.y + bounds.h / 2
  };
}

export function rotatePoint(point, origin, angle) {
  if (!angle) return { x: point.x, y: point.y };
  const cos = Math.cos(angle);
  const sin = Math.sin(angle);
  const dx = point.x - origin.x;
  const dy = point.y - origin.y;
  return {
    x: origin.x + dx * cos - dy * sin,
    y: origin.y + dx * sin + dy * cos
  };
}

/** 把页面坐标点变换到形状的未旋转局部坐标系 */
export function pointToShapeLocal(shape, point) {
  const bounds = getShapeBounds(shape);
  const center = getBoundsCenter(bounds);
  const unrotated = rotatePoint(point, center, -toFiniteNumber(shape?.rotation));
  return {
    x: unrotated.x - bounds.x,
    y: unrotated.y - bounds.y
  };
}

/** 形状旋转后的轴对齐包围盒 */
export function getShapeAabb(shape) {
  const bounds = getShapeBounds(shape);
  const rotation = toFiniteNumber(shape?.rotation);
  if (!rotation) return bounds;
  const center = getBoundsCenter(bounds);
  const corners = [
    { x: bounds.x, y: bounds.y },
    { x: bounds.x + bounds.w, y: bounds.y },
    { x: bounds.x + bounds.w, y: bounds.y + bounds.h },
    { x: bounds.x, y: bounds.y + bounds.h }
  ].map((corner) => rotatePoint(corner, center, rotation));
  const xs = corners.map((corner) => corner.x);
  const ys = corners.map((corner) => corner.y);
  const minX = Math.min(...xs);
  const minY = Math.min(...ys);
  return {
    x: minX,
    y: minY,
    w: Math.max(...xs) - minX,
    h: Math.max(...ys) - minY
  };
}

export function boundsIntersect(left, right) {
  if (!left || !right) return false;
  return !(
    left.x + left.w < right.x ||
    left.x > right.x + right.w ||
    left.y + left.h < right.y ||
    left.y > right.y + right.h
  );
}

export function boundsContain(outer, inner) {
  if (!outer || !inner) return false;
  return (
    inner.x >= outer.x &&
    inner.y >= outer.y &&
    inner.x + inner.w <= outer.x + outer.w &&
    inner.y + inner.h <= outer.y + outer.h
  );
}

export function unionBounds(list) {
  const valid = (Array.isArray(list) ? list : []).filter(Boolean);
  if (!valid.length) return null;
  let minX = Infinity;
  let minY = Infinity;
  let maxX = -Infinity;
  let maxY = -Infinity;
  valid.forEach((bounds) => {
    minX = Math.min(minX, bounds.x);
    minY = Math.min(minY, bounds.y);
    maxX = Math.max(maxX, bounds.x + bounds.w);
    maxY = Math.max(maxY, bounds.y + bounds.h);
  });
  return { x: minX, y: minY, w: maxX - minX, h: maxY - minY };
}

export function distToSegment(point, a, b) {
  const dx = b.x - a.x;
  const dy = b.y - a.y;
  const lengthSq = dx * dx + dy * dy;
  if (lengthSq <= 0.000001) {
    return Math.hypot(point.x - a.x, point.y - a.y);
  }
  const t = clamp(((point.x - a.x) * dx + (point.y - a.y) * dy) / lengthSq, 0, 1);
  return Math.hypot(point.x - (a.x + t * dx), point.y - (a.y + t * dy));
}

export function pointInPolygon(point, polygon) {
  let inside = false;
  for (let i = 0, j = polygon.length - 1; i < polygon.length; j = i, i += 1) {
    const xi = polygon[i].x;
    const yi = polygon[i].y;
    const xj = polygon[j].x;
    const yj = polygon[j].y;
    const intersects = yi > point.y !== yj > point.y && point.x < ((xj - xi) * (point.y - yi)) / (yj - yi) + xi;
    if (intersects) inside = !inside;
  }
  return inside;
}

/* ------------------------------------------------------------------ */
/* 形状轮廓（局部坐标，未旋转）                                          */
/* ------------------------------------------------------------------ */

export function getGeoOutlineLocal(geo, w, h) {
  switch (geo) {
    case 'diamond':
      return [
        { x: w / 2, y: 0 },
        { x: w, y: h / 2 },
        { x: w / 2, y: h },
        { x: 0, y: h / 2 }
      ];
    case 'triangle':
      return [
        { x: w / 2, y: 0 },
        { x: w, y: h },
        { x: 0, y: h }
      ];
    case 'parallelogram': {
      const offset = Math.min(w * 0.22, 48);
      return [
        { x: offset, y: 0 },
        { x: w, y: 0 },
        { x: w - offset, y: h },
        { x: 0, y: h }
      ];
    }
    case 'hexagon': {
      const inset = Math.min(w * 0.24, h * 0.5);
      return [
        { x: inset, y: 0 },
        { x: w - inset, y: 0 },
        { x: w, y: h / 2 },
        { x: w - inset, y: h },
        { x: inset, y: h },
        { x: 0, y: h / 2 }
      ];
    }
    case 'star': {
      const cx = w / 2;
      const cy = h / 2;
      const outerX = w / 2;
      const outerY = h / 2;
      const innerRatio = 0.42;
      const points = [];
      for (let i = 0; i < 10; i += 1) {
        const angle = -Math.PI / 2 + (i * Math.PI) / 5;
        const ratio = i % 2 === 0 ? 1 : innerRatio;
        points.push({
          x: cx + Math.cos(angle) * outerX * ratio,
          y: cy + Math.sin(angle) * outerY * ratio
        });
      }
      return points;
    }
    default:
      return [
        { x: 0, y: 0 },
        { x: w, y: 0 },
        { x: w, y: h },
        { x: 0, y: h }
      ];
  }
}

function hitTestGeoLocal(geo, w, h, local, tolerance) {
  const fatX = clamp(local.x, -tolerance, w + tolerance);
  if (fatX !== local.x && Math.abs(fatX - local.x) > tolerance) return false;
  switch (geo) {
    case 'ellipse': {
      const nx = (local.x - w / 2) / (w / 2 + tolerance);
      const ny = (local.y - h / 2) / (h / 2 + tolerance);
      return nx * nx + ny * ny <= 1;
    }
    case 'cylinder':
    case 'bubble':
    case 'rect':
    case 'round':
      return local.x >= -tolerance && local.y >= -tolerance && local.x <= w + tolerance && local.y <= h + tolerance;
    default: {
      const polygon = getGeoOutlineLocal(geo, w, h);
      if (pointInPolygon(local, polygon)) return true;
      for (let i = 0; i < polygon.length; i += 1) {
        const a = polygon[i];
        const b = polygon[(i + 1) % polygon.length];
        if (distToSegment(local, a, b) <= tolerance) return true;
      }
      return false;
    }
  }
}

/* ------------------------------------------------------------------ */
/* 锚点                                                                */
/* ------------------------------------------------------------------ */

export function getAnchorPoint(shape, anchorId) {
  const bounds = getShapeBounds(shape);
  const center = getBoundsCenter(bounds);
  let point;
  if (anchorId === 'top') point = { x: center.x, y: bounds.y };
  else if (anchorId === 'right') point = { x: bounds.x + bounds.w, y: center.y };
  else if (anchorId === 'bottom') point = { x: center.x, y: bounds.y + bounds.h };
  else if (anchorId === 'left') point = { x: bounds.x, y: center.y };
  else point = center;
  return rotatePoint(point, center, toFiniteNumber(shape?.rotation));
}

export function getAnchorNormal(shape, anchorId) {
  const base = ANCHOR_NORMALS[anchorId] || { x: 1, y: 0 };
  const rotation = toFiniteNumber(shape?.rotation);
  if (!rotation) return { ...base };
  const cos = Math.cos(rotation);
  const sin = Math.sin(rotation);
  return {
    x: base.x * cos - base.y * sin,
    y: base.x * sin + base.y * cos
  };
}

/** 依据目标点自动选边 */
export function resolveAutoAnchorId(shape, towardPoint) {
  const bounds = getShapeBounds(shape);
  const center = getBoundsCenter(bounds);
  const local = rotatePoint(towardPoint, center, -toFiniteNumber(shape?.rotation));
  const dx = local.x - center.x;
  const dy = local.y - center.y;
  const scaledDx = dx / Math.max(1, bounds.w);
  const scaledDy = dy / Math.max(1, bounds.h);
  if (Math.abs(scaledDx) >= Math.abs(scaledDy)) {
    return scaledDx >= 0 ? 'right' : 'left';
  }
  return scaledDy >= 0 ? 'bottom' : 'top';
}

/* ------------------------------------------------------------------ */
/* 连接线路由                                                          */
/* ------------------------------------------------------------------ */

function dedupeCollinear(points) {
  const result = [];
  points.forEach((point) => {
    const prev = result[result.length - 1];
    if (prev && Math.abs(prev.x - point.x) < 0.01 && Math.abs(prev.y - point.y) < 0.01) return;
    result.push({ x: round2(point.x), y: round2(point.y) });
  });
  for (let i = result.length - 2; i > 0; i -= 1) {
    const a = result[i - 1];
    const b = result[i];
    const c = result[i + 1];
    const abH = Math.abs(a.y - b.y) < 0.01;
    const bcH = Math.abs(b.y - c.y) < 0.01;
    const abV = Math.abs(a.x - b.x) < 0.01;
    const bcV = Math.abs(b.x - c.x) < 0.01;
    if ((abH && bcH) || (abV && bcV)) {
      result.splice(i, 1);
    }
  }
  return result;
}

function inferDirection(from, to) {
  const dx = to.x - from.x;
  const dy = to.y - from.y;
  if (Math.abs(dx) >= Math.abs(dy)) {
    return { x: dx >= 0 ? 1 : -1, y: 0 };
  }
  return { x: 0, y: dy >= 0 ? 1 : -1 };
}

function dominantAxisNormal(normal) {
  if (!normal) return null;
  if (Math.abs(normal.x) >= Math.abs(normal.y)) {
    return { x: normal.x >= 0 ? 1 : -1, y: 0 };
  }
  return { x: 0, y: normal.y >= 0 ? 1 : -1 };
}

/**
 * 折线路由：起终点 + 出线方向 → 正交折线点列
 */
export function routeElbow(startPoint, startNormal, endPoint, endNormal, stub = 24) {
  const d0 = dominantAxisNormal(startNormal) || inferDirection(startPoint, endPoint);
  const d1 = dominantAxisNormal(endNormal) || inferDirection(endPoint, startPoint);
  const a = { x: startPoint.x + d0.x * stub, y: startPoint.y + d0.y * stub };
  const b = { x: endPoint.x + d1.x * stub, y: endPoint.y + d1.y * stub };
  const mids = [];

  const startHorizontal = d0.y === 0;
  const endHorizontal = d1.y === 0;

  if (startHorizontal && endHorizontal) {
    const midX = (a.x + b.x) / 2;
    mids.push({ x: midX, y: a.y }, { x: midX, y: b.y });
  } else if (!startHorizontal && !endHorizontal) {
    const midY = (a.y + b.y) / 2;
    mids.push({ x: a.x, y: midY }, { x: b.x, y: midY });
  } else if (startHorizontal && !endHorizontal) {
    mids.push({ x: b.x, y: a.y });
  } else {
    mids.push({ x: a.x, y: b.y });
  }

  return dedupeCollinear([startPoint, a, ...mids, b, endPoint]);
}

export function routeCurveControls(startPoint, startNormal, endPoint, endNormal) {
  const distance = Math.hypot(endPoint.x - startPoint.x, endPoint.y - startPoint.y);
  const reach = clamp(distance * 0.5, 40, 180);
  const d0 = startNormal || inferDirection(startPoint, endPoint);
  const d1 = endNormal || inferDirection(endPoint, startPoint);
  return {
    c1: { x: startPoint.x + d0.x * reach, y: startPoint.y + d0.y * reach },
    c2: { x: endPoint.x + d1.x * reach, y: endPoint.y + d1.y * reach }
  };
}

export function sampleCubicBezier(p0, c1, c2, p1, segments = 24) {
  const points = [];
  for (let i = 0; i <= segments; i += 1) {
    const t = i / segments;
    const mt = 1 - t;
    points.push({
      x: mt * mt * mt * p0.x + 3 * mt * mt * t * c1.x + 3 * mt * t * t * c2.x + t * t * t * p1.x,
      y: mt * mt * mt * p0.y + 3 * mt * mt * t * c1.y + 3 * mt * t * t * c2.y + t * t * t * p1.y
    });
  }
  return points;
}

/**
 * 解析连接线端点：返回 { point, normal, shapeId }
 */
export function resolveConnectorEnd(endRef, otherPoint, getShapeById) {
  if (endRef && endRef.shapeId && typeof getShapeById === 'function') {
    const shape = getShapeById(endRef.shapeId);
    if (shape) {
      const anchorId =
        endRef.anchor && endRef.anchor !== 'auto'
          ? endRef.anchor
          : resolveAutoAnchorId(shape, otherPoint || getBoundsCenter(getShapeBounds(shape)));
      return {
        point: getAnchorPoint(shape, anchorId),
        normal: getAnchorNormal(shape, anchorId),
        shapeId: shape.id,
        anchorId
      };
    }
  }
  return {
    point: { x: toFiniteNumber(endRef?.x), y: toFiniteNumber(endRef?.y) },
    normal: null,
    shapeId: '',
    anchorId: ''
  };
}

function endRefApproxPoint(endRef, getShapeById) {
  if (endRef && endRef.shapeId && typeof getShapeById === 'function') {
    const shape = getShapeById(endRef.shapeId);
    if (shape) return getBoundsCenter(getShapeBounds(shape));
  }
  return { x: toFiniteNumber(endRef?.x), y: toFiniteNumber(endRef?.y) };
}

/**
 * 计算连接线完整几何：折点列 / 贝塞尔 / 箭头方向 / 标签位置
 */
export function getConnectorGeometry(shape, getShapeById) {
  const props = shape?.props || {};
  const startApprox = endRefApproxPoint(props.start, getShapeById);
  const endApprox = endRefApproxPoint(props.end, getShapeById);
  const start = resolveConnectorEnd(props.start, endApprox, getShapeById);
  const end = resolveConnectorEnd(props.end, startApprox, getShapeById);
  const router = CONNECTOR_ROUTERS.includes(props.router) ? props.router : 'elbow';

  let points;
  let curve = null;
  if (router === 'straight') {
    points = [start.point, end.point];
  } else if (router === 'curve') {
    const controls = routeCurveControls(start.point, start.normal, end.point, end.normal);
    curve = { p0: start.point, c1: controls.c1, c2: controls.c2, p1: end.point };
    points = sampleCubicBezier(curve.p0, curve.c1, curve.c2, curve.p1);
  } else {
    points = routeElbow(start.point, start.normal, end.point, end.normal);
  }

  let length = 0;
  for (let i = 1; i < points.length; i += 1) {
    length += Math.hypot(points[i].x - points[i - 1].x, points[i].y - points[i - 1].y);
  }

  const label = pointAtPolylineRatio(points, 0.5);
  const startDir = segmentDirection(points, 0);
  const endDir = segmentDirection(points, points.length - 2);

  return {
    start,
    end,
    router,
    points,
    curve,
    length,
    labelPoint: label,
    startArrowAngle: Math.atan2(-startDir.y, -startDir.x),
    endArrowAngle: Math.atan2(endDir.y, endDir.x)
  };
}

function segmentDirection(points, index) {
  const safeIndex = clamp(index, 0, points.length - 2);
  const a = points[safeIndex];
  const b = points[safeIndex + 1];
  const dx = b.x - a.x;
  const dy = b.y - a.y;
  const dist = Math.hypot(dx, dy) || 1;
  return { x: dx / dist, y: dy / dist };
}

export function pointAtPolylineRatio(points, ratio) {
  if (!points.length) return { x: 0, y: 0 };
  let total = 0;
  const lengths = [];
  for (let i = 1; i < points.length; i += 1) {
    const len = Math.hypot(points[i].x - points[i - 1].x, points[i].y - points[i - 1].y);
    lengths.push(len);
    total += len;
  }
  if (total <= 0) return { ...points[0] };
  let target = total * clamp(ratio, 0, 1);
  for (let i = 0; i < lengths.length; i += 1) {
    if (target <= lengths[i]) {
      const t = lengths[i] ? target / lengths[i] : 0;
      return {
        x: points[i].x + (points[i + 1].x - points[i].x) * t,
        y: points[i].y + (points[i + 1].y - points[i].y) * t
      };
    }
    target -= lengths[i];
  }
  return { ...points[points.length - 1] };
}

/* ------------------------------------------------------------------ */
/* 命中测试                                                            */
/* ------------------------------------------------------------------ */

export function hitTestShape(shape, point, options = {}) {
  const tolerance = toFiniteNumber(options.tolerance, 4);
  const getShapeById = options.getShapeById;
  if (!shape) return false;

  if (shape.type === 'connector') {
    const geometry = getConnectorGeometry(shape, getShapeById);
    for (let i = 0; i < geometry.points.length - 1; i += 1) {
      if (distToSegment(point, geometry.points[i], geometry.points[i + 1]) <= tolerance + toFiniteNumber(shape.props?.strokeWidth, 2)) {
        return true;
      }
    }
    return false;
  }

  const local = pointToShapeLocal(shape, point);
  const bounds = getShapeBounds(shape);

  if (shape.type === 'draw') {
    const points = Array.isArray(shape.props?.points) ? shape.props.points : [];
    const hitWidth = tolerance + toFiniteNumber(shape.props?.strokeWidth, 3) / 2 + 2;
    for (let i = 0; i < points.length - 1; i += 1) {
      const a = { x: points[i][0], y: points[i][1] };
      const b = { x: points[i + 1][0], y: points[i + 1][1] };
      if (distToSegment(local, a, b) <= hitWidth) return true;
    }
    if (points.length === 1) {
      return Math.hypot(local.x - points[0][0], local.y - points[0][1]) <= hitWidth;
    }
    return false;
  }

  if (shape.type === 'geo') {
    return hitTestGeoLocal(shape.props?.geo || 'rect', bounds.w, bounds.h, local, tolerance);
  }

  return local.x >= -tolerance && local.y >= -tolerance && local.x <= bounds.w + tolerance && local.y <= bounds.h + tolerance;
}

/* ------------------------------------------------------------------ */
/* 文本换行                                                            */
/* ------------------------------------------------------------------ */

function isCjk(char) {
  const code = char.codePointAt(0);
  return (
    (code >= 0x2e80 && code <= 0x9fff) ||
    (code >= 0xac00 && code <= 0xd7af) ||
    (code >= 0xf900 && code <= 0xfaff) ||
    (code >= 0xff00 && code <= 0xffef) ||
    (code >= 0x3000 && code <= 0x303f)
  );
}

export function fallbackMeasure(text, fontSize) {
  let width = 0;
  for (const char of String(text || '')) {
    width += isCjk(char) ? fontSize : fontSize * 0.55;
  }
  return width;
}

/**
 * 逐字/逐词换行。measure(text) 返回像素宽。
 */
export function wrapTextLines(text, maxWidth, measure) {
  const source = String(text || '');
  if (!source) return [];
  const lines = [];
  source.split('\n').forEach((rawLine) => {
    if (!rawLine) {
      lines.push('');
      return;
    }
    const tokens = rawLine.match(/([A-Za-z0-9_@#$%&'".,:;!?()\-+/\\]+\s*|\s+|.)/g) || [rawLine];
    let current = '';
    tokens.forEach((token) => {
      const candidate = current + token;
      if (!current || measure(candidate) <= maxWidth) {
        current = candidate;
        return;
      }
      if (measure(token.trimEnd()) > maxWidth) {
        // token 本身超宽，逐字符断行
        for (const char of token) {
          if (current && measure(current + char) > maxWidth) {
            lines.push(current);
            current = char === ' ' ? '' : char;
          } else {
            current += char;
          }
        }
        return;
      }
      lines.push(current.trimEnd());
      current = token.trimStart();
    });
    lines.push(current.trimEnd());
  });
  return lines;
}

export function getShapePaletteEntry(colorId) {
  return SHAPE_PALETTE.find((item) => item.id === colorId) || SHAPE_PALETTE[0];
}

export function softColorForStroke(stroke) {
  const entry = SHAPE_PALETTE.find((item) => item.stroke.toLowerCase() === String(stroke || '').toLowerCase());
  return entry ? entry.soft : '#EFF0F1';
}
