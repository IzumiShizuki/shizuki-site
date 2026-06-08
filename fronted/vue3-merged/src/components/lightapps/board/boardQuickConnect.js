export const BOARD_DEFAULT_SHAPE_COLOR = 'light-blue';
export const BOARD_DEFAULT_SHAPE_FILL = 'solid';
export const BOARD_DEFAULT_LABEL_COLOR = 'black';
export const QUICK_CONNECT_FALLBACK_DISTANCE = 260;

export const QUICK_CONNECT_CHOICE_TOOLS = Object.freeze([
  { id: 'rectangle', label: '矩形', iconClass: 'far fa-square' },
  { id: 'ellipse', label: '圆形', iconClass: 'far fa-circle' },
  { id: 'diamond', label: '菱形', iconClass: 'far fa-gem' },
  { id: 'triangle', label: '三角', iconClass: 'fas fa-play' },
  { id: 'note', label: '便签', iconClass: 'fas fa-note-sticky' },
  { id: 'text', label: '文本', iconClass: 'fas fa-font' }
]);

const DEFAULT_SHAPE_SIZE = Object.freeze({
  rectangle: { width: 300, height: 112 },
  ellipse: { width: 220, height: 140 },
  diamond: { width: 220, height: 140 },
  triangle: { width: 220, height: 140 },
  note: { width: 184, height: 164 },
  text: { width: 144, height: 36 },
  frame: { width: 480, height: 320 }
});

const DEFAULT_SHAPE_STYLE = Object.freeze({
  rectangle: { color: 'light-blue', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR },
  ellipse: { color: 'light-green', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR },
  diamond: { color: 'yellow', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR },
  triangle: { color: 'light-red', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR },
  note: { color: 'orange', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR },
  text: { color: 'violet', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR },
  frame: { color: 'grey', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR },
  line: { color: 'orange', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR },
  arrow: { color: 'orange', fill: BOARD_DEFAULT_SHAPE_FILL, labelColor: BOARD_DEFAULT_LABEL_COLOR }
});

function toNumber(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : fallback;
}

function normalizeToolId(toolId) {
  return String(toolId || '').trim().toLowerCase();
}

export function getBoardDefaultShapeStyleProps(toolIdOrOverrides = 'rectangle', overrides = {}) {
  const hasOnlyOverrides =
    toolIdOrOverrides &&
    typeof toolIdOrOverrides === 'object' &&
    !Array.isArray(toolIdOrOverrides);
  const toolId = hasOnlyOverrides ? 'rectangle' : normalizeToolId(toolIdOrOverrides || 'rectangle');
  const nextOverrides = hasOnlyOverrides ? toolIdOrOverrides : overrides;
  return {
    ...(DEFAULT_SHAPE_STYLE[toolId] || DEFAULT_SHAPE_STYLE.rectangle),
    ...nextOverrides
  };
}

export function getQuickConnectShapeSize(toolId) {
  return DEFAULT_SHAPE_SIZE[normalizeToolId(toolId)] || DEFAULT_SHAPE_SIZE.rectangle;
}

export function resolveQuickConnectSpawnCenter(sourcePoint, dropPoint, toolId, gap = 12) {
  const size = getQuickConnectShapeSize(toolId);
  const sourceX = toNumber(sourcePoint?.x, 0);
  const sourceY = toNumber(sourcePoint?.y, 0);
  const dropX = toNumber(dropPoint?.x, sourceX);
  const dropY = toNumber(dropPoint?.y, sourceY);
  const dx = dropX - sourceX;
  const dy = dropY - sourceY;

  if (Math.abs(dx) >= Math.abs(dy)) {
    return {
      x: dropX + (dx >= 0 ? 1 : -1) * (size.width / 2 + gap),
      y: dropY
    };
  }

  return {
    x: dropX,
    y: dropY + (dy >= 0 ? 1 : -1) * (size.height / 2 + gap)
  };
}

export function resolveQuickConnectFallbackPoint(sourcePoint, directionId, distance = QUICK_CONNECT_FALLBACK_DISTANCE) {
  const x = toNumber(sourcePoint?.x, 0);
  const y = toNumber(sourcePoint?.y, 0);
  const offset = Math.max(80, toNumber(distance, QUICK_CONNECT_FALLBACK_DISTANCE));
  if (directionId === 'top') {
    return { x, y: y - offset };
  }
  if (directionId === 'bottom') {
    return { x, y: y + offset };
  }
  if (directionId === 'left') {
    return { x: x - offset, y };
  }
  return { x: x + offset, y };
}

export function resolveBoundsEdgePointToward(bounds, externalPoint) {
  const left = toNumber(bounds?.x, 0);
  const top = toNumber(bounds?.y, 0);
  const width = Math.max(1, toNumber(bounds?.w, 1));
  const height = Math.max(1, toNumber(bounds?.h, 1));
  const centerX = left + width / 2;
  const centerY = top + height / 2;
  const dx = toNumber(externalPoint?.x, centerX) - centerX;
  const dy = toNumber(externalPoint?.y, centerY) - centerY;

  if (Math.abs(dx) >= Math.abs(dy)) {
    return {
      x: dx <= 0 ? left : left + width,
      y: centerY
    };
  }

  return {
    x: centerX,
    y: dy <= 0 ? top : top + height
  };
}

export function resolveBoundsPointFromNormalizedAnchor(bounds, normalizedAnchor) {
  const left = toNumber(bounds?.x, 0);
  const top = toNumber(bounds?.y, 0);
  const width = Math.max(1, toNumber(bounds?.w, 1));
  const height = Math.max(1, toNumber(bounds?.h, 1));
  return {
    x: left + Math.max(0, Math.min(1, toNumber(normalizedAnchor?.x, 0.5))) * width,
    y: top + Math.max(0, Math.min(1, toNumber(normalizedAnchor?.y, 0.5))) * height
  };
}

export function resolveNearestDirectionalTarget(sourceBounds, candidates, directionId, options = {}) {
  if (!sourceBounds || !Array.isArray(candidates) || !candidates.length) return null;

  const tolerance = Math.max(0, toNumber(options.tolerance, 24));
  const sourceLeft = toNumber(sourceBounds.x, 0);
  const sourceTop = toNumber(sourceBounds.y, 0);
  const sourceWidth = Math.max(1, toNumber(sourceBounds.w, 1));
  const sourceHeight = Math.max(1, toNumber(sourceBounds.h, 1));
  const sourceRight = sourceLeft + sourceWidth;
  const sourceBottom = sourceTop + sourceHeight;
  const sourceCenter = {
    x: sourceLeft + sourceWidth / 2,
    y: sourceTop + sourceHeight / 2
  };

  let winner = null;

  candidates.forEach((candidate) => {
    const bounds = candidate?.bounds;
    if (!bounds) return;

    const left = toNumber(bounds.x, 0);
    const top = toNumber(bounds.y, 0);
    const width = Math.max(1, toNumber(bounds.w, 1));
    const height = Math.max(1, toNumber(bounds.h, 1));
    const right = left + width;
    const bottom = top + height;
    const center = {
      x: left + width / 2,
      y: top + height / 2
    };

    let axisDistance = 0;
    let crossDistance = 0;
    if (directionId === 'top') {
      if (center.y > sourceCenter.y - tolerance) return;
      axisDistance = Math.max(0, sourceTop - bottom);
      crossDistance = Math.abs(center.x - sourceCenter.x);
    } else if (directionId === 'bottom') {
      if (center.y < sourceCenter.y + tolerance) return;
      axisDistance = Math.max(0, top - sourceBottom);
      crossDistance = Math.abs(center.x - sourceCenter.x);
    } else if (directionId === 'left') {
      if (center.x > sourceCenter.x - tolerance) return;
      axisDistance = Math.max(0, sourceLeft - right);
      crossDistance = Math.abs(center.y - sourceCenter.y);
    } else {
      if (center.x < sourceCenter.x + tolerance) return;
      axisDistance = Math.max(0, left - sourceRight);
      crossDistance = Math.abs(center.y - sourceCenter.y);
    }

    const score = axisDistance * axisDistance + crossDistance * crossDistance * 1.35;
    if (winner && winner.score <= score) return;
    winner = {
      ...candidate,
      bounds,
      score
    };
  });

  return winner;
}
