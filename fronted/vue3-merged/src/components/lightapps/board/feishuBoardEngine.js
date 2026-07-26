/**
 * feishuBoardEngine.js
 * 自研白板引擎：相机、选择、历史、剪贴板、吸附、工具状态机、快照 IO。
 * 渲染由 feishuBoardRenderer 完成；DOM/UI 由 bridge 层负责。
 */

import {
  ANCHOR_IDS,
  BOARD_FONT_FAMILY,
  NOTE_PALETTE,
  SNAPSHOT_ENGINE,
  SNAPSHOT_VERSION,
  clamp,
  createBoardShapeId,
  createConnectorShape,
  createDrawShape,
  createGeoShape,
  createImageShape,
  createNoteShape,
  createTextShape,
  fallbackMeasure,
  getAnchorPoint,
  getConnectorGeometry,
  getShapeAabb,
  getShapeBounds,
  getBoundsCenter,
  hitTestShape,
  normalizeEndRef,
  pointToShapeLocal,
  resolveAutoAnchorId,
  rotatePoint,
  round2,
  toFiniteNumber,
  unionBounds,
  wrapTextLines
} from './feishuBoardCore';
import { normalizeBoardSnapshot } from './boardTldrawMigrate';
import { extractGraphFromShapes, layoutGraphToShapes } from './boardGraphOps';
import {
  getQuickConnectShapeSize,
  resolveNearestDirectionalTarget,
  resolveQuickConnectFallbackPoint,
  resolveQuickConnectSpawnCenter
} from './boardQuickConnect';

const MIN_ZOOM = 0.1;
const MAX_ZOOM = 4;
const ZOOM_WHEEL_FACTOR = 1.0018;
const NUDGE_STEP = 1;
const NUDGE_STEP_LARGE = 10;
const SNAP_THRESHOLD = 5;
const HANDLE_HIT = 7;
const ANCHOR_HIT = 9;
const MIN_SHAPE_SIZE = 16;
const HISTORY_LIMIT = 100;

let sharedClipboard = null;

function deepClone(value) {
  if (typeof structuredClone === 'function') return structuredClone(value);
  return JSON.parse(JSON.stringify(value));
}

export class FeishuBoardEngine {
  constructor(options = {}) {
    this.shapes = [];
    this.camera = { x: 0, y: 0, zoom: 1 };
    this.viewport = { width: toFiniteNumber(options.width, 960), height: toFiniteNumber(options.height, 640) };
    this.selection = new Set();
    this.tool = { id: 'select' };
    this.hover = { shapeId: '', anchorId: '', handleId: '' };
    this.interaction = null;
    this.marquee = null;
    this.penStroke = null;
    this.guides = [];
    this.connectPreview = null;
    this.pendingChoice = null;
    this.editingId = '';
    this.spacePanning = false;
    this.history = { undo: [], redo: [] };
    this.listeners = new Map();
    this.renderer = null;
    this.canvas = null;
    this.measureCtx = null;
    this.lastStyles = {
      geo: null,
      noteColor: NOTE_PALETTE[0],
      connector: { router: 'elbow', stroke: '#646A73', strokeWidth: 2, dash: 'solid', arrowStart: 'none', arrowEnd: 'arrow' },
      pen: { stroke: '#1F2329', strokeWidth: 3 },
      highlighter: { stroke: '#FFC60A', strokeWidth: 12 }
    };
    this._txBefore = null;
    this._renderQueued = false;
    this._destroyed = false;
  }

  /* ---------------------------------------------------------------- */
  /* 事件                                                              */
  /* ---------------------------------------------------------------- */

  on(event, listener) {
    if (!this.listeners.has(event)) this.listeners.set(event, new Set());
    this.listeners.get(event).add(listener);
    return () => this.listeners.get(event)?.delete(listener);
  }

  emit(event, payload) {
    this.listeners.get(event)?.forEach((listener) => {
      try {
        listener(payload);
      } catch {
        /* 忽略监听器异常 */
      }
    });
  }

  emitState() {
    this.emit('state', this.getUiState());
    this.requestRender();
  }

  attach(canvas, renderer) {
    this.canvas = canvas;
    this.renderer = renderer;
    try {
      this.measureCtx = canvas ? canvas.getContext('2d') : null;
    } catch {
      this.measureCtx = null;
    }
    this.requestRender();
  }

  setViewportSize(width, height) {
    this.viewport = { width: Math.max(1, width), height: Math.max(1, height) };
    this.requestRender();
  }

  destroy() {
    this._destroyed = true;
    this.listeners.clear();
    this.renderer = null;
    this.canvas = null;
  }

  requestRender() {
    if (this._destroyed || !this.renderer) return;
    if (typeof requestAnimationFrame !== 'function') {
      this.renderer.draw(this);
      return;
    }
    if (this._renderQueued) return;
    this._renderQueued = true;
    requestAnimationFrame(() => {
      this._renderQueued = false;
      if (!this._destroyed && this.renderer) {
        this.renderer.draw(this);
      }
    });
  }

  /* ---------------------------------------------------------------- */
  /* 坐标与相机                                                        */
  /* ---------------------------------------------------------------- */

  screenToWorld(point) {
    return {
      x: point.x / this.camera.zoom + this.camera.x,
      y: point.y / this.camera.zoom + this.camera.y
    };
  }

  worldToScreen(point) {
    return {
      x: (point.x - this.camera.x) * this.camera.zoom,
      y: (point.y - this.camera.y) * this.camera.zoom
    };
  }

  panBy(dxScreen, dyScreen) {
    this.camera.x -= dxScreen / this.camera.zoom;
    this.camera.y -= dyScreen / this.camera.zoom;
    this.emitState();
  }

  setZoom(zoom, screenAnchor) {
    const next = clamp(zoom, MIN_ZOOM, MAX_ZOOM);
    const anchor = screenAnchor || { x: this.viewport.width / 2, y: this.viewport.height / 2 };
    const worldAnchor = this.screenToWorld(anchor);
    this.camera.zoom = next;
    this.camera.x = worldAnchor.x - anchor.x / next;
    this.camera.y = worldAnchor.y - anchor.y / next;
    this.emitState();
  }

  zoomIn(screenAnchor) {
    this.setZoom(this._nextZoomStep(1), screenAnchor);
  }

  zoomOut(screenAnchor) {
    this.setZoom(this._nextZoomStep(-1), screenAnchor);
  }

  _nextZoomStep(direction) {
    const presets = [0.1, 0.25, 0.5, 0.75, 1, 1.25, 1.5, 2, 3, 4];
    const current = this.camera.zoom;
    if (direction > 0) {
      const next = presets.find((value) => value > current + 0.001);
      return next ?? MAX_ZOOM;
    }
    const smaller = presets.filter((value) => value < current - 0.001);
    return smaller.length ? smaller[smaller.length - 1] : MIN_ZOOM;
  }

  zoomToFit(padding = 80) {
    const boxes = this.shapes.map((shape) => this.getShapeRenderAabb(shape)).filter(Boolean);
    const bounds = unionBounds(boxes);
    if (!bounds) {
      this.camera = { x: -this.viewport.width / 2, y: -this.viewport.height / 2, zoom: 1 };
      this.emitState();
      return;
    }
    const zoom = clamp(
      Math.min(
        (this.viewport.width - padding * 2) / Math.max(1, bounds.w),
        (this.viewport.height - padding * 2) / Math.max(1, bounds.h),
        1.5
      ),
      MIN_ZOOM,
      MAX_ZOOM
    );
    this.camera.zoom = zoom;
    this.camera.x = bounds.x + bounds.w / 2 - this.viewport.width / 2 / zoom;
    this.camera.y = bounds.y + bounds.h / 2 - this.viewport.height / 2 / zoom;
    this.emitState();
  }

  resetZoom() {
    this.setZoom(1);
  }

  /* ---------------------------------------------------------------- */
  /* 文本测量                                                          */
  /* ---------------------------------------------------------------- */

  measureText(text, fontSize, bold = false) {
    if (this.measureCtx) {
      this.measureCtx.font = `${bold ? '600 ' : ''}${fontSize}px ${BOARD_FONT_FAMILY}`;
      return this.measureCtx.measureText(text).width;
    }
    return fallbackMeasure(text, fontSize);
  }

  wrapShapeText(shape) {
    const props = shape.props || {};
    const fontSize = toFiniteNumber(props.fontSize, 14);
    const padding = shape.type === 'note' ? 16 : shape.type === 'text' ? 2 : 12;
    const maxWidth = Math.max(fontSize, toFiniteNumber(shape.w) - padding * 2);
    return wrapTextLines(String(props.text || ''), maxWidth, (value) => this.measureText(value, fontSize));
  }

  autoSizeTextShape(shape) {
    if (shape.type !== 'text') return;
    const fontSize = toFiniteNumber(shape.props.fontSize, 16);
    const lines = String(shape.props.text || '').split('\n');
    const widest = lines.reduce((max, line) => Math.max(max, this.measureText(line, fontSize)), 0);
    shape.w = Math.max(24, Math.ceil(widest) + 8);
    shape.h = Math.max(Math.round(fontSize * 1.4), Math.round(lines.length * fontSize * 1.4));
  }

  /* ---------------------------------------------------------------- */
  /* 查询                                                              */
  /* ---------------------------------------------------------------- */

  getShapeById(id) {
    return this.shapes.find((shape) => shape.id === id) || null;
  }

  getShapeRenderAabb(shape) {
    if (!shape) return null;
    if (shape.type === 'connector') {
      const geometry = getConnectorGeometry(shape, (id) => this.getShapeById(id));
      const xs = geometry.points.map((point) => point.x);
      const ys = geometry.points.map((point) => point.y);
      const minX = Math.min(...xs);
      const minY = Math.min(...ys);
      return { x: minX - 8, y: minY - 8, w: Math.max(...xs) - minX + 16, h: Math.max(...ys) - minY + 16 };
    }
    return getShapeAabb(shape);
  }

  hitTest(worldPoint, options = {}) {
    const tolerance = toFiniteNumber(options.tolerance, 4) / this.camera.zoom;
    for (let i = this.shapes.length - 1; i >= 0; i -= 1) {
      const shape = this.shapes[i];
      if (options.exclude && options.exclude.has(shape.id)) continue;
      if (options.types && !options.types.includes(shape.type)) continue;
      if (hitTestShape(shape, worldPoint, { tolerance, getShapeById: (id) => this.getShapeById(id) })) {
        return shape;
      }
    }
    return null;
  }

  getSelectedShapes() {
    return this.shapes.filter((shape) => this.selection.has(shape.id));
  }

  getSelectionBounds() {
    const boxes = this.getSelectedShapes().map((shape) => this.getShapeRenderAabb(shape));
    return unionBounds(boxes);
  }

  /* ---------------------------------------------------------------- */
  /* 历史 / 事务                                                       */
  /* ---------------------------------------------------------------- */

  serializeShapes() {
    return JSON.stringify(this.shapes);
  }

  beginTransaction() {
    if (this._txBefore === null) {
      this._txBefore = this.serializeShapes();
    }
  }

  commitTransaction() {
    if (this._txBefore === null) return false;
    const before = this._txBefore;
    this._txBefore = null;
    const after = this.serializeShapes();
    if (before === after) return false;
    this.history.undo.push(before);
    if (this.history.undo.length > HISTORY_LIMIT) this.history.undo.shift();
    this.history.redo = [];
    this.emit('change');
    this.emitState();
    return true;
  }

  abortTransaction() {
    if (this._txBefore === null) return;
    this.shapes = JSON.parse(this._txBefore);
    this._txBefore = null;
    this.emitState();
  }

  mutate(fn) {
    this.beginTransaction();
    fn();
    return this.commitTransaction();
  }

  undo() {
    if (!this.history.undo.length) return;
    const current = this.serializeShapes();
    const previous = this.history.undo.pop();
    this.history.redo.push(current);
    this.shapes = JSON.parse(previous);
    this._pruneSelection();
    this.emit('change');
    this.emitState();
  }

  redo() {
    if (!this.history.redo.length) return;
    const current = this.serializeShapes();
    const next = this.history.redo.pop();
    this.history.undo.push(current);
    this.shapes = JSON.parse(next);
    this._pruneSelection();
    this.emit('change');
    this.emitState();
  }

  _pruneSelection() {
    const ids = new Set(this.shapes.map((shape) => shape.id));
    this.selection = new Set([...this.selection].filter((id) => ids.has(id)));
    if (this.editingId && !ids.has(this.editingId)) this.editingId = '';
  }

  /* ---------------------------------------------------------------- */
  /* 选择                                                              */
  /* ---------------------------------------------------------------- */

  setSelection(ids) {
    this.selection = new Set(ids);
    this.emitState();
  }

  selectAll() {
    this.setSelection(this.shapes.map((shape) => shape.id));
  }

  clearSelection() {
    if (!this.selection.size) return;
    this.selection = new Set();
    this.emitState();
  }

  deleteSelection() {
    if (!this.selection.size) return;
    this.deleteShapes([...this.selection]);
  }

  deleteShapes(ids) {
    const idSet = new Set(ids);
    if (!idSet.size) return;
    this.mutate(() => {
      // 解绑将被删除形状上的连接线端点
      this.shapes.forEach((shape) => {
        if (shape.type !== 'connector' || idSet.has(shape.id)) return;
        ['start', 'end'].forEach((terminal) => {
          const ref = shape.props[terminal];
          if (ref?.shapeId && idSet.has(ref.shapeId)) {
            const geometry = getConnectorGeometry(shape, (id) => this.getShapeById(id));
            const point = terminal === 'start' ? geometry.start.point : geometry.end.point;
            shape.props[terminal] = { x: round2(point.x), y: round2(point.y) };
          }
        });
      });
      this.shapes = this.shapes.filter((shape) => !idSet.has(shape.id));
    });
    this.selection = new Set([...this.selection].filter((id) => !idSet.has(id)));
    if (idSet.has(this.editingId)) this.editingId = '';
    this.emitState();
  }

  duplicateSelection() {
    const selected = this.getSelectedShapes();
    if (!selected.length) return;
    const clones = this._cloneShapesWithNewIds(selected, 24, 24);
    this.mutate(() => {
      this.shapes.push(...clones);
    });
    this.setSelection(clones.map((shape) => shape.id));
  }

  _cloneShapesWithNewIds(shapeList, offsetX, offsetY) {
    const idMap = new Map();
    const clones = shapeList.map((shape) => {
      const clone = deepClone(shape);
      const newId = createBoardShapeId();
      idMap.set(shape.id, newId);
      clone.id = newId;
      if (clone.type === 'connector') {
        ['start', 'end'].forEach((terminal) => {
          const ref = clone.props[terminal];
          if (!ref?.shapeId) {
            clone.props[terminal] = { x: round2(toFiniteNumber(ref?.x) + offsetX), y: round2(toFiniteNumber(ref?.y) + offsetY) };
          }
        });
      } else {
        clone.x = round2(clone.x + offsetX);
        clone.y = round2(clone.y + offsetY);
      }
      return clone;
    });
    clones.forEach((clone) => {
      if (clone.type !== 'connector') return;
      ['start', 'end'].forEach((terminal) => {
        const ref = clone.props[terminal];
        if (ref?.shapeId) {
          if (idMap.has(ref.shapeId)) {
            clone.props[terminal] = { shapeId: idMap.get(ref.shapeId), anchor: ref.anchor };
          } else {
            const source = this.getShapeById(ref.shapeId);
            if (source) {
              const point = getAnchorPoint(source, ref.anchor === 'auto' ? resolveAutoAnchorId(source, getBoundsCenter(getShapeBounds(source))) : ref.anchor);
              clone.props[terminal] = { x: round2(point.x + offsetX), y: round2(point.y + offsetY) };
            } else {
              clone.props[terminal] = { x: offsetX, y: offsetY };
            }
          }
        }
      });
    });
    return clones;
  }

  copySelection() {
    const selected = this.getSelectedShapes();
    if (!selected.length) return false;
    sharedClipboard = deepClone(selected);
    return true;
  }

  cutSelection() {
    if (!this.copySelection()) return;
    this.deleteSelection();
  }

  pasteClipboard() {
    if (!sharedClipboard || !sharedClipboard.length) return;
    const clones = this._cloneShapesWithNewIds(sharedClipboard, 24, 24);
    sharedClipboard = deepClone(clones);
    this.mutate(() => {
      this.shapes.push(...clones);
    });
    this.setSelection(clones.map((shape) => shape.id));
  }

  /* ---------------------------------------------------------------- */
  /* 层级 / 对齐                                                       */
  /* ---------------------------------------------------------------- */

  reorderSelection(mode) {
    const ids = new Set(this.selection);
    if (!ids.size) return;
    this.mutate(() => {
      const selected = this.shapes.filter((shape) => ids.has(shape.id));
      const rest = this.shapes.filter((shape) => !ids.has(shape.id));
      if (mode === 'front') {
        this.shapes = [...rest, ...selected];
      } else if (mode === 'back') {
        this.shapes = [...selected, ...rest];
      } else if (mode === 'forward' || mode === 'backward') {
        const list = [...this.shapes];
        const indexes = list.map((shape, index) => (ids.has(shape.id) ? index : -1)).filter((index) => index >= 0);
        if (mode === 'forward') {
          for (let i = indexes.length - 1; i >= 0; i -= 1) {
            const index = indexes[i];
            if (index < list.length - 1 && !ids.has(list[index + 1].id)) {
              [list[index], list[index + 1]] = [list[index + 1], list[index]];
            }
          }
        } else {
          for (let i = 0; i < indexes.length; i += 1) {
            const index = indexes[i];
            if (index > 0 && !ids.has(list[index - 1].id)) {
              [list[index], list[index - 1]] = [list[index - 1], list[index]];
            }
          }
        }
        this.shapes = list;
      }
    });
  }

  alignSelection(mode) {
    const selected = this.getSelectedShapes().filter((shape) => shape.type !== 'connector');
    if (selected.length < 2) return;
    const boxes = selected.map((shape) => ({ shape, box: getShapeAabb(shape) }));
    const union = unionBounds(boxes.map((item) => item.box));
    this.mutate(() => {
      if (mode === 'left') boxes.forEach(({ shape, box }) => { shape.x += union.x - box.x; });
      else if (mode === 'right') boxes.forEach(({ shape, box }) => { shape.x += union.x + union.w - (box.x + box.w); });
      else if (mode === 'hcenter') boxes.forEach(({ shape, box }) => { shape.x += union.x + union.w / 2 - (box.x + box.w / 2); });
      else if (mode === 'top') boxes.forEach(({ shape, box }) => { shape.y += union.y - box.y; });
      else if (mode === 'bottom') boxes.forEach(({ shape, box }) => { shape.y += union.y + union.h - (box.y + box.h); });
      else if (mode === 'vcenter') boxes.forEach(({ shape, box }) => { shape.y += union.y + union.h / 2 - (box.y + box.h / 2); });
      else if (mode === 'hdistribute' && boxes.length > 2) {
        const sorted = boxes.slice().sort((a, b) => a.box.x - b.box.x);
        const totalWidth = sorted.reduce((sum, item) => sum + item.box.w, 0);
        const gap = (union.w - totalWidth) / (sorted.length - 1);
        let cursor = union.x;
        sorted.forEach(({ shape, box }) => {
          shape.x += cursor - box.x;
          cursor += box.w + gap;
        });
      } else if (mode === 'vdistribute' && boxes.length > 2) {
        const sorted = boxes.slice().sort((a, b) => a.box.y - b.box.y);
        const totalHeight = sorted.reduce((sum, item) => sum + item.box.h, 0);
        const gap = (union.h - totalHeight) / (sorted.length - 1);
        let cursor = union.y;
        sorted.forEach(({ shape, box }) => {
          shape.y += cursor - box.y;
          cursor += box.h + gap;
        });
      }
      selected.forEach((shape) => {
        shape.x = round2(shape.x);
        shape.y = round2(shape.y);
      });
    });
  }

  /* ---------------------------------------------------------------- */
  /* 样式                                                              */
  /* ---------------------------------------------------------------- */

  getSelectionStyleSummary() {
    const selected = this.getSelectedShapes();
    if (!selected.length) return null;
    const summary = {
      types: [...new Set(selected.map((shape) => shape.type))],
      count: selected.length
    };
    const first = selected[0];
    const props = first.props || {};
    summary.fill = props.fill;
    summary.stroke = props.stroke;
    summary.strokeWidth = props.strokeWidth;
    summary.dash = props.dash;
    summary.fontSize = props.fontSize;
    summary.textColor = first.type === 'text' ? props.color : props.textColor;
    summary.noteColor = first.type === 'note' ? props.color : undefined;
    summary.router = props.router;
    summary.arrowStart = props.arrowStart;
    summary.arrowEnd = props.arrowEnd;
    summary.align = props.align;
    summary.geo = props.geo;
    return summary;
  }

  setSelectionStyle(patch) {
    const selected = this.getSelectedShapes();
    if (!selected.length || !patch || typeof patch !== 'object') return;
    this.mutate(() => {
      selected.forEach((shape) => {
        const props = shape.props;
        if (shape.type === 'geo') {
          if (patch.fill !== undefined) props.fill = patch.fill;
          if (patch.stroke !== undefined) props.stroke = patch.stroke;
          if (patch.strokeWidth !== undefined) props.strokeWidth = patch.strokeWidth;
          if (patch.dash !== undefined) props.dash = patch.dash;
          if (patch.fontSize !== undefined) props.fontSize = patch.fontSize;
          if (patch.textColor !== undefined) props.textColor = patch.textColor;
          if (patch.align !== undefined) props.align = patch.align;
          this.lastStyles.geo = {
            fill: props.fill,
            stroke: props.stroke,
            strokeWidth: props.strokeWidth,
            dash: props.dash
          };
        } else if (shape.type === 'note') {
          if (patch.noteColor !== undefined) props.color = patch.noteColor;
          if (patch.fontSize !== undefined) props.fontSize = patch.fontSize;
          if (patch.textColor !== undefined) props.textColor = patch.textColor;
          this.lastStyles.noteColor = props.color;
        } else if (shape.type === 'text') {
          if (patch.textColor !== undefined) props.color = patch.textColor;
          if (patch.fontSize !== undefined) {
            props.fontSize = patch.fontSize;
            this.autoSizeTextShape(shape);
          }
          if (patch.align !== undefined) props.align = patch.align;
        } else if (shape.type === 'connector') {
          if (patch.stroke !== undefined) props.stroke = patch.stroke;
          if (patch.strokeWidth !== undefined) props.strokeWidth = patch.strokeWidth;
          if (patch.dash !== undefined) props.dash = patch.dash;
          if (patch.router !== undefined) props.router = patch.router;
          if (patch.arrowStart !== undefined) props.arrowStart = patch.arrowStart;
          if (patch.arrowEnd !== undefined) props.arrowEnd = patch.arrowEnd;
          if (patch.fontSize !== undefined) props.fontSize = patch.fontSize;
          this.lastStyles.connector = {
            router: props.router,
            stroke: props.stroke,
            strokeWidth: props.strokeWidth,
            dash: props.dash,
            arrowStart: props.arrowStart,
            arrowEnd: props.arrowEnd
          };
        } else if (shape.type === 'draw') {
          if (patch.stroke !== undefined) props.stroke = patch.stroke;
          if (patch.strokeWidth !== undefined) props.strokeWidth = patch.strokeWidth;
        }
      });
    });
  }

  /* ---------------------------------------------------------------- */
  /* 工具                                                              */
  /* ---------------------------------------------------------------- */

  setTool(id, options = {}) {
    this.tool = { id, ...options };
    if (id !== 'select') this.clearSelection();
    this.hover = { shapeId: '', anchorId: '', handleId: '' };
    this.emit('tool', this.tool);
    this.emitState();
  }

  /* ---------------------------------------------------------------- */
  /* 指针交互                                                          */
  /* ---------------------------------------------------------------- */

  handlePointerDown(screenPoint, info = {}) {
    const world = this.screenToWorld(screenPoint);
    this.closePendingChoice();

    if (info.button === 1 || this.tool.id === 'hand' || this.spacePanning) {
      this.interaction = { type: 'pan', lastScreen: screenPoint };
      this.emitState();
      return;
    }
    if (info.button === 2) return;

    const toolId = this.tool.id;
    if (toolId === 'select') {
      this._pointerDownSelect(world, screenPoint, info);
    } else if (toolId === 'geo') {
      this.interaction = {
        type: 'create-geo',
        kind: this.tool.geo || 'rect',
        origin: world,
        current: world
      };
    } else if (toolId === 'note') {
      this._createNoteAt(world);
    } else if (toolId === 'text') {
      this._createTextAt(world);
    } else if (toolId === 'connector') {
      const hit = this.hitTest(world, { types: ['geo', 'note', 'text', 'image'] });
      const start = hit
        ? { shapeId: hit.id, anchor: 'auto' }
        : { x: round2(world.x), y: round2(world.y) };
      this._startConnectorDrag(start, world, { fromTool: true });
    } else if (toolId === 'pen' || toolId === 'highlighter') {
      const style = toolId === 'pen' ? this.lastStyles.pen : this.lastStyles.highlighter;
      this.penStroke = {
        tool: toolId,
        points: [[world.x, world.y]],
        stroke: style.stroke,
        strokeWidth: style.strokeWidth
      };
      this.interaction = { type: 'draw' };
      this.requestRender();
    } else if (toolId === 'eraser') {
      this.beginTransaction();
      this.interaction = { type: 'erase', erased: new Set() };
      this._eraseAt(world);
    }
  }

  _pointerDownSelect(world, screenPoint, info) {
    const zoom = this.camera.zoom;

    // 1. 单选连接线端点手柄
    if (this.selection.size === 1) {
      const selectedShape = this.getSelectedShapes()[0];
      if (selectedShape?.type === 'connector') {
        const geometry = getConnectorGeometry(selectedShape, (id) => this.getShapeById(id));
        const startDist = Math.hypot(world.x - geometry.start.point.x, world.y - geometry.start.point.y) * zoom;
        const endDist = Math.hypot(world.x - geometry.end.point.x, world.y - geometry.end.point.y) * zoom;
        if (Math.min(startDist, endDist) <= HANDLE_HIT + 2) {
          this.beginTransaction();
          this.interaction = {
            type: 'connector-end',
            shapeId: selectedShape.id,
            terminal: startDist <= endDist ? 'start' : 'end'
          };
          return;
        }
      }

      // 2. 缩放 / 旋转手柄
      if (selectedShape && selectedShape.type !== 'connector') {
        const handle = this._hitSelectionHandle(selectedShape, world);
        if (handle === 'rotate') {
          const bounds = getShapeBounds(selectedShape);
          const center = getBoundsCenter(bounds);
          this.beginTransaction();
          this.interaction = {
            type: 'rotate',
            shapeId: selectedShape.id,
            center,
            startAngle: Math.atan2(world.y - center.y, world.x - center.x) - toFiniteNumber(selectedShape.rotation)
          };
          return;
        }
        if (handle) {
          this.beginTransaction();
          this.interaction = {
            type: 'resize',
            shapeId: selectedShape.id,
            handle,
            initial: deepClone(selectedShape)
          };
          return;
        }
      }
    }

    // 3. 锚点（快速连线）
    const anchorHit = this._hitAnchor(world);
    if (anchorHit) {
      this._startQuickConnect(anchorHit.shape, anchorHit.anchorId, world);
      return;
    }

    // 4. 形状
    const hit = this.hitTest(world, { tolerance: 5 });
    if (hit) {
      if (info.shiftKey) {
        const next = new Set(this.selection);
        if (next.has(hit.id)) next.delete(hit.id);
        else next.add(hit.id);
        this.setSelection([...next]);
      } else if (!this.selection.has(hit.id)) {
        this.setSelection([hit.id]);
      }
      if (this.selection.size) {
        this.beginTransaction();
        this.interaction = {
          type: 'translate',
          origin: world,
          moved: false,
          initial: new Map(this.getSelectedShapes().map((shape) => [shape.id, deepClone(shape)]))
        };
      }
      return;
    }

    // 5. 空白 → 框选
    this.interaction = {
      type: 'marquee',
      origin: world,
      additive: Boolean(info.shiftKey),
      baseSelection: info.shiftKey ? new Set(this.selection) : new Set()
    };
    if (!info.shiftKey) this.clearSelection();
    this.marquee = { x: world.x, y: world.y, w: 0, h: 0 };
    this.requestRender();
  }

  handlePointerMove(screenPoint, info = {}) {
    const world = this.screenToWorld(screenPoint);
    const interaction = this.interaction;

    if (!interaction) {
      this._updateHover(world);
      return;
    }

    switch (interaction.type) {
      case 'pan': {
        const dx = screenPoint.x - interaction.lastScreen.x;
        const dy = screenPoint.y - interaction.lastScreen.y;
        interaction.lastScreen = screenPoint;
        this.panBy(dx, dy);
        break;
      }
      case 'marquee': {
        this.marquee = {
          x: Math.min(interaction.origin.x, world.x),
          y: Math.min(interaction.origin.y, world.y),
          w: Math.abs(world.x - interaction.origin.x),
          h: Math.abs(world.y - interaction.origin.y)
        };
        const picked = this.shapes
          .filter((shape) => {
            const box = this.getShapeRenderAabb(shape);
            return box && boundsIntersectSafe(this.marquee, box);
          })
          .map((shape) => shape.id);
        this.selection = new Set([...interaction.baseSelection, ...picked]);
        this.emitState();
        break;
      }
      case 'translate':
        this._moveSelection(interaction, world, info);
        break;
      case 'resize':
        this._resizeShape(interaction, world, info);
        break;
      case 'rotate': {
        const shape = this.getShapeById(interaction.shapeId);
        if (!shape) break;
        let rotation = Math.atan2(world.y - interaction.center.y, world.x - interaction.center.x) - interaction.startAngle;
        if (info.shiftKey) {
          const step = Math.PI / 12;
          rotation = Math.round(rotation / step) * step;
        }
        if (Math.abs(rotation) < 0.02) rotation = 0;
        shape.rotation = round2(rotation);
        this.requestRender();
        break;
      }
      case 'create-geo': {
        interaction.current = world;
        this.requestRender();
        break;
      }
      case 'draw': {
        if (this.penStroke) {
          const last = this.penStroke.points[this.penStroke.points.length - 1];
          if (Math.hypot(world.x - last[0], world.y - last[1]) > 1.2 / this.camera.zoom) {
            this.penStroke.points.push([world.x, world.y]);
            this.requestRender();
          }
        }
        break;
      }
      case 'erase':
        this._eraseAt(world);
        break;
      case 'connect':
        this._moveQuickConnect(world);
        break;
      case 'connector-end': {
        const shape = this.getShapeById(interaction.shapeId);
        if (!shape) break;
        const exclude = new Set([shape.id]);
        const otherRef = shape.props[interaction.terminal === 'start' ? 'end' : 'start'];
        if (otherRef?.shapeId) exclude.add(otherRef.shapeId);
        const target = this.hitTest(world, { types: ['geo', 'note', 'text', 'image'], exclude });
        if (target) {
          const anchorId = this._preciseAnchorAt(target, world) || 'auto';
          shape.props[interaction.terminal] = { shapeId: target.id, anchor: anchorId };
          this.connectPreview = { targetShapeId: target.id };
        } else {
          shape.props[interaction.terminal] = { x: round2(world.x), y: round2(world.y) };
          this.connectPreview = null;
        }
        this.requestRender();
        break;
      }
      default:
        break;
    }
  }

  handlePointerUp(screenPoint, info = {}) {
    const world = this.screenToWorld(screenPoint);
    const interaction = this.interaction;
    this.interaction = null;
    this.guides = [];

    if (!interaction) {
      this.requestRender();
      return;
    }

    switch (interaction.type) {
      case 'marquee':
        this.marquee = null;
        this.emitState();
        break;
      case 'translate':
        if (!interaction.moved) {
          // 原地点击：单选命中形状
          if (!info.shiftKey) {
            const hit = this.hitTest(world, { tolerance: 5 });
            if (hit) this.setSelection([hit.id]);
          }
          this.abortTransaction();
        } else {
          this.commitTransaction();
        }
        break;
      case 'resize':
      case 'rotate':
      case 'connector-end':
        this.connectPreview = null;
        this.commitTransaction();
        break;
      case 'create-geo': {
        const kind = interaction.kind;
        const dx = Math.abs(world.x - interaction.origin.x);
        const dy = Math.abs(world.y - interaction.origin.y);
        let shape;
        if (dx < 6 && dy < 6) {
          shape = createGeoShape(kind, 0, 0);
          shape.x = round2(interaction.origin.x - shape.w / 2);
          shape.y = round2(interaction.origin.y - shape.h / 2);
        } else {
          shape = createGeoShape(kind, 0, 0);
          shape.x = round2(Math.min(interaction.origin.x, world.x));
          shape.y = round2(Math.min(interaction.origin.y, world.y));
          shape.w = Math.max(MIN_SHAPE_SIZE, round2(dx));
          shape.h = Math.max(MIN_SHAPE_SIZE, round2(dy));
        }
        if (this.lastStyles.geo) Object.assign(shape.props, this.lastStyles.geo);
        this.mutate(() => {
          this.shapes.push(shape);
        });
        this.setTool('select');
        this.setSelection([shape.id]);
        break;
      }
      case 'draw': {
        if (this.penStroke && this.penStroke.points.length > 1) {
          const stroke = this.penStroke;
          const shape = createDrawShape(stroke.points, {
            stroke: stroke.stroke,
            strokeWidth: stroke.strokeWidth,
            opacity: stroke.tool === 'highlighter' ? 0.45 : 1,
            highlight: stroke.tool === 'highlighter'
          });
          this.mutate(() => {
            this.shapes.push(shape);
          });
        }
        this.penStroke = null;
        this.requestRender();
        break;
      }
      case 'erase':
        this.commitTransaction();
        break;
      case 'connect':
        this._finishQuickConnect(world, interaction);
        break;
      case 'pan':
      default:
        this.emitState();
        break;
    }
  }

  handleDoubleClick(screenPoint) {
    const world = this.screenToWorld(screenPoint);
    if (this.tool.id !== 'select') return;
    const hit = this.hitTest(world, { tolerance: 5 });
    if (hit) {
      if (['geo', 'note', 'text', 'connector'].includes(hit.type)) {
        this.setSelection([hit.id]);
        this.beginEdit(hit.id);
      }
      return;
    }
    this._createTextAt(world);
  }

  handleWheel(screenPoint, deltaX, deltaY, ctrlKey, shiftKey) {
    if (ctrlKey) {
      const factor = Math.pow(ZOOM_WHEEL_FACTOR, -deltaY);
      this.setZoom(this.camera.zoom * factor, screenPoint);
      return;
    }
    if (shiftKey && !deltaX) {
      this.panBy(-deltaY, 0);
      return;
    }
    this.panBy(-deltaX, -deltaY);
  }

  /* ---------------------------------------------------------------- */
  /* 具体交互实现                                                      */
  /* ---------------------------------------------------------------- */

  _updateHover(world) {
    let anchorId = '';
    let handleId = '';
    let shapeId = '';

    if (this.tool.id === 'select' || this.tool.id === 'connector') {
      const anchorHit = this._hitAnchor(world);
      if (anchorHit) {
        shapeId = anchorHit.shape.id;
        anchorId = anchorHit.anchorId;
      }
    }

    if (!anchorId && this.tool.id === 'select' && this.selection.size === 1) {
      const selectedShape = this.getSelectedShapes()[0];
      if (selectedShape && selectedShape.type !== 'connector') {
        handleId = this._hitSelectionHandle(selectedShape, world) || '';
      }
    }

    if (!anchorId && !handleId) {
      const hit = this.hitTest(world, { tolerance: 5 });
      shapeId = hit?.id || '';
    }

    if (shapeId !== this.hover.shapeId || anchorId !== this.hover.anchorId || handleId !== this.hover.handleId) {
      this.hover = { shapeId, anchorId, handleId };
      this.emitState();
    }
  }

  _hitAnchor(world) {
    const zoom = this.camera.zoom;
    const candidates = [];
    if (this.hover.shapeId) {
      const shape = this.getShapeById(this.hover.shapeId);
      if (shape) candidates.push(shape);
    }
    this.getSelectedShapes().forEach((shape) => {
      if (!candidates.includes(shape)) candidates.push(shape);
    });
    const direct = this.hitTest(world, { types: ['geo', 'note', 'text', 'image'], tolerance: ANCHOR_HIT / zoom + 12 / zoom });
    if (direct && !candidates.includes(direct)) candidates.push(direct);

    for (const shape of candidates) {
      if (!shape || !['geo', 'note', 'text', 'image'].includes(shape.type)) continue;
      for (const anchorId of ANCHOR_IDS) {
        const point = getAnchorPoint(shape, anchorId);
        if (Math.hypot(world.x - point.x, world.y - point.y) * zoom <= ANCHOR_HIT) {
          return { shape, anchorId };
        }
      }
    }
    return null;
  }

  _preciseAnchorAt(shape, world) {
    const zoom = this.camera.zoom;
    for (const anchorId of ANCHOR_IDS) {
      const point = getAnchorPoint(shape, anchorId);
      if (Math.hypot(world.x - point.x, world.y - point.y) * zoom <= ANCHOR_HIT + 3) {
        return anchorId;
      }
    }
    return '';
  }

  _hitSelectionHandle(shape, world) {
    const zoom = this.camera.zoom;
    const bounds = getShapeBounds(shape);
    const center = getBoundsCenter(bounds);
    const rotation = toFiniteNumber(shape.rotation);
    const hit = (point) => Math.hypot(world.x - point.x, world.y - point.y) * zoom <= HANDLE_HIT + 2;

    const rotateLocal = { x: bounds.x + bounds.w / 2, y: bounds.y - 26 / zoom };
    if (hit(rotatePoint(rotateLocal, center, rotation))) return 'rotate';

    const handles = this._resizeHandleDefs(shape);
    for (const handle of handles) {
      const local = {
        x: bounds.x + handle.u * bounds.w,
        y: bounds.y + handle.v * bounds.h
      };
      if (hit(rotatePoint(local, center, rotation))) return handle.id;
    }
    return '';
  }

  _resizeHandleDefs(shape) {
    if (shape.type === 'text') {
      return [
        { id: 'w', u: 0, v: 0.5 },
        { id: 'e', u: 1, v: 0.5 }
      ];
    }
    // 仅四角缩放：边中点留给连接锚点（与飞书一致）
    return [
      { id: 'nw', u: 0, v: 0 },
      { id: 'ne', u: 1, v: 0 },
      { id: 'se', u: 1, v: 1 },
      { id: 'sw', u: 0, v: 1 }
    ];
  }

  _moveSelection(interaction, world, info) {
    let dx = world.x - interaction.origin.x;
    let dy = world.y - interaction.origin.y;
    if (!interaction.moved && Math.hypot(dx, dy) * this.camera.zoom < 3) return;
    interaction.moved = true;

    // 应用初始位置 + 位移
    const movingIds = new Set(interaction.initial.keys());
    interaction.initial.forEach((initialShape, id) => {
      const shape = this.getShapeById(id);
      if (!shape) return;
      if (shape.type === 'connector') {
        ['start', 'end'].forEach((terminal) => {
          const initRef = initialShape.props[terminal];
          if (!initRef?.shapeId) {
            shape.props[terminal] = { x: round2(initRef.x + dx), y: round2(initRef.y + dy) };
          }
        });
      } else {
        shape.x = initialShape.x + dx;
        shape.y = initialShape.y + dy;
      }
    });

    // 吸附
    this.guides = [];
    if (!info.altKey) {
      const snapDelta = this._computeSnap(movingIds);
      if (snapDelta) {
        interaction.initial.forEach((initialShape, id) => {
          const shape = this.getShapeById(id);
          if (!shape || shape.type === 'connector') return;
          shape.x += snapDelta.dx;
          shape.y += snapDelta.dy;
        });
        this.guides = snapDelta.guides;
      }
    }
    interaction.initial.forEach((initialShape, id) => {
      const shape = this.getShapeById(id);
      if (!shape || shape.type === 'connector') return;
      shape.x = round2(shape.x);
      shape.y = round2(shape.y);
    });
    this.requestRender();
  }

  _computeSnap(movingIds) {
    const movingBoxes = [...movingIds]
      .map((id) => this.getShapeById(id))
      .filter((shape) => shape && shape.type !== 'connector')
      .map((shape) => getShapeAabb(shape));
    const moving = unionBounds(movingBoxes);
    if (!moving) return null;

    const threshold = SNAP_THRESHOLD / this.camera.zoom;
    const movingXs = [moving.x, moving.x + moving.w / 2, moving.x + moving.w];
    const movingYs = [moving.y, moving.y + moving.h / 2, moving.y + moving.h];

    let bestX = null;
    let bestY = null;
    const viewBounds = {
      x: this.camera.x - 200,
      y: this.camera.y - 200,
      w: this.viewport.width / this.camera.zoom + 400,
      h: this.viewport.height / this.camera.zoom + 400
    };

    this.shapes.forEach((shape) => {
      if (movingIds.has(shape.id) || shape.type === 'connector' || shape.type === 'draw') return;
      const box = getShapeAabb(shape);
      if (!boundsIntersectSafe(viewBounds, box)) return;
      const targetXs = [box.x, box.x + box.w / 2, box.x + box.w];
      const targetYs = [box.y, box.y + box.h / 2, box.y + box.h];
      targetXs.forEach((tx) => {
        movingXs.forEach((mx) => {
          const diff = tx - mx;
          if (Math.abs(diff) <= threshold && (!bestX || Math.abs(diff) < Math.abs(bestX.diff))) {
            bestX = { diff, at: tx, box };
          }
        });
      });
      targetYs.forEach((ty) => {
        movingYs.forEach((my) => {
          const diff = ty - my;
          if (Math.abs(diff) <= threshold && (!bestY || Math.abs(diff) < Math.abs(bestY.diff))) {
            bestY = { diff, at: ty, box };
          }
        });
      });
    });

    if (!bestX && !bestY) return null;
    const guides = [];
    if (bestX) {
      const minY = Math.min(moving.y, bestX.box.y);
      const maxY = Math.max(moving.y + moving.h, bestX.box.y + bestX.box.h);
      guides.push({ type: 'v', x: bestX.at, y1: minY - 12, y2: maxY + 12 });
    }
    if (bestY) {
      const minX = Math.min(moving.x, bestY.box.x);
      const maxX = Math.max(moving.x + moving.w, bestY.box.x + bestY.box.w);
      guides.push({ type: 'h', y: bestY.at, x1: minX - 12, x2: maxX + 12 });
    }
    return {
      dx: bestX ? bestX.diff : 0,
      dy: bestY ? bestY.diff : 0,
      guides
    };
  }

  _resizeShape(interaction, world, info) {
    const shape = this.getShapeById(interaction.shapeId);
    if (!shape) return;
    const initial = interaction.initial;
    const bounds = getShapeBounds(initial);
    const center = getBoundsCenter(bounds);
    const rotation = toFiniteNumber(initial.rotation);
    const local = (() => {
      const unrotated = rotatePoint(world, center, -rotation);
      return { x: unrotated.x - bounds.x, y: unrotated.y - bounds.y };
    })();

    const handle = interaction.handle;
    let x0 = 0;
    let y0 = 0;
    let x1 = bounds.w;
    let y1 = bounds.h;

    if (handle.includes('w')) x0 = Math.min(local.x, x1 - MIN_SHAPE_SIZE);
    if (handle.includes('e')) x1 = Math.max(local.x, x0 + MIN_SHAPE_SIZE);
    if (handle.includes('n')) y0 = Math.min(local.y, y1 - MIN_SHAPE_SIZE);
    if (handle.includes('s')) y1 = Math.max(local.y, y0 + MIN_SHAPE_SIZE);

    if (info.shiftKey && handle.length === 2) {
      const ratio = bounds.w / Math.max(1, bounds.h);
      let w = x1 - x0;
      let h = y1 - y0;
      if (w / ratio >= h) h = w / ratio;
      else w = h * ratio;
      if (handle.includes('w')) x0 = x1 - w;
      else x1 = x0 + w;
      if (handle.includes('n')) y0 = y1 - h;
      else y1 = y0 + h;
    }

    const newW = Math.max(MIN_SHAPE_SIZE, x1 - x0);
    const newH = Math.max(MIN_SHAPE_SIZE, y1 - y0);
    const newCenterLocal = { x: bounds.x + x0 + newW / 2, y: bounds.y + y0 + newH / 2 };
    const newCenter = rotatePoint(newCenterLocal, center, rotation);

    shape.w = round2(newW);
    shape.h = round2(newH);
    shape.x = round2(newCenter.x - newW / 2);
    shape.y = round2(newCenter.y - newH / 2);

    if (shape.type === 'draw') {
      // 缩放笔迹点列
      const scaleX = newW / Math.max(1, bounds.w);
      const scaleY = newH / Math.max(1, bounds.h);
      shape.props.points = initial.props.points.map(([px, py]) => [round2(px * scaleX), round2(py * scaleY)]);
    }
    if (shape.type === 'text') {
      const fontSize = toFiniteNumber(shape.props.fontSize, 16);
      const lines = wrapTextLines(String(shape.props.text || ''), Math.max(24, shape.w - 4), (value) =>
        this.measureText(value, fontSize)
      );
      shape.h = Math.max(Math.round(fontSize * 1.4), Math.round(lines.length * fontSize * 1.4));
    }
    this.requestRender();
  }

  _eraseAt(world) {
    const hit = this.hitTest(world, { tolerance: 6 });
    if (hit && this.interaction?.erased && !this.interaction.erased.has(hit.id)) {
      this.interaction.erased.add(hit.id);
      const idSet = new Set([hit.id]);
      this.shapes.forEach((shape) => {
        if (shape.type !== 'connector' || idSet.has(shape.id)) return;
        ['start', 'end'].forEach((terminal) => {
          const ref = shape.props[terminal];
          if (ref?.shapeId && idSet.has(ref.shapeId)) {
            const geometry = getConnectorGeometry(shape, (id) => this.getShapeById(id));
            const point = terminal === 'start' ? geometry.start.point : geometry.end.point;
            shape.props[terminal] = { x: round2(point.x), y: round2(point.y) };
          }
        });
      });
      this.shapes = this.shapes.filter((shape) => shape.id !== hit.id);
      this.selection.delete(hit.id);
      this.requestRender();
    }
  }

  /* ---------------------------------------------------------------- */
  /* 快速连线                                                          */
  /* ---------------------------------------------------------------- */

  _startQuickConnect(sourceShape, anchorId, world) {
    this.beginTransaction();
    const connector = createConnectorShape(
      { shapeId: sourceShape.id, anchor: anchorId },
      { x: round2(world.x), y: round2(world.y) },
      { ...this.lastStyles.connector }
    );
    this.shapes.push(connector);
    this.interaction = {
      type: 'connect',
      connectorId: connector.id,
      sourceShapeId: sourceShape.id,
      sourceAnchorId: anchorId,
      startPoint: getAnchorPoint(sourceShape, anchorId),
      moved: false
    };
    this.setSelection([connector.id]);
  }

  _startConnectorDrag(startRef, world, options = {}) {
    this.beginTransaction();
    const connector = createConnectorShape(startRef, { x: round2(world.x), y: round2(world.y) }, { ...this.lastStyles.connector });
    this.shapes.push(connector);
    this.interaction = {
      type: 'connect',
      connectorId: connector.id,
      sourceShapeId: startRef.shapeId || '',
      sourceAnchorId: startRef.anchor || '',
      startPoint: { ...world },
      fromTool: Boolean(options.fromTool),
      moved: false
    };
    this.setSelection([connector.id]);
  }

  _moveQuickConnect(world) {
    const interaction = this.interaction;
    const connector = this.getShapeById(interaction.connectorId);
    if (!connector) return;
    interaction.moved = true;
    const exclude = new Set([connector.id]);
    if (interaction.sourceShapeId) exclude.add(interaction.sourceShapeId);
    const target = this.hitTest(world, { types: ['geo', 'note', 'text', 'image'], exclude, tolerance: 6 });
    if (target) {
      const preciseAnchor = this._preciseAnchorAt(target, world);
      connector.props.end = { shapeId: target.id, anchor: preciseAnchor || 'auto' };
      this.connectPreview = { targetShapeId: target.id };
    } else {
      connector.props.end = { x: round2(world.x), y: round2(world.y) };
      this.connectPreview = null;
    }
    this.requestRender();
  }

  _finishQuickConnect(world, interaction) {
    const connector = this.getShapeById(interaction.connectorId);
    this.connectPreview = null;
    if (!connector) {
      this.abortTransaction();
      return;
    }

    if (connector.props.end?.shapeId) {
      // 已吸附目标形状
      this.commitTransaction();
      this.setSelection([connector.props.end.shapeId]);
      if (interaction.fromTool) this.setTool('select');
      return;
    }

    const dragDistance = Math.hypot(world.x - interaction.startPoint.x, world.y - interaction.startPoint.y) * this.camera.zoom;

    if (dragDistance < 6 && interaction.sourceShapeId) {
      // 原地点击锚点：沿方向自动找目标
      const source = this.getShapeById(interaction.sourceShapeId);
      const candidates = this.shapes
        .filter((shape) => ['geo', 'note', 'text', 'image'].includes(shape.type) && shape.id !== interaction.sourceShapeId)
        .map((shape) => ({ shape, bounds: getShapeAabb(shape) }));
      const target = source
        ? resolveNearestDirectionalTarget(getShapeAabb(source), candidates, interaction.sourceAnchorId)
        : null;
      if (target?.shape) {
        connector.props.end = { shapeId: target.shape.id, anchor: 'auto' };
        this.commitTransaction();
        this.setSelection([target.shape.id]);
        return;
      }
      const fallbackPoint = resolveQuickConnectFallbackPoint(interaction.startPoint, interaction.sourceAnchorId);
      connector.props.end = { x: round2(fallbackPoint.x), y: round2(fallbackPoint.y) };
      this.commitTransaction();
      this.pendingChoice = {
        connectorId: connector.id,
        sourceShapeId: interaction.sourceShapeId,
        startPoint: interaction.startPoint,
        dropPoint: fallbackPoint
      };
      this.emitState();
      return;
    }

    // 拖到空白处：弹出形状选择
    this.commitTransaction();
    if (interaction.fromTool) {
      this.setTool('select');
      this.setSelection([connector.id]);
      return;
    }
    this.pendingChoice = {
      connectorId: connector.id,
      sourceShapeId: interaction.sourceShapeId,
      startPoint: interaction.startPoint,
      dropPoint: { x: world.x, y: world.y }
    };
    this.emitState();
  }

  applyPendingChoice(toolId) {
    const pending = this.pendingChoice;
    if (!pending) return null;
    const connector = this.getShapeById(pending.connectorId);
    if (!connector) {
      this.closePendingChoice();
      return null;
    }
    const center = resolveQuickConnectSpawnCenter(pending.startPoint, pending.dropPoint, toolId === 'round' ? 'rectangle' : toolId, 12);
    let shape = null;
    if (toolId === 'note') {
      shape = createNoteShape(0, 0, this.lastStyles.noteColor);
    } else if (toolId === 'text') {
      shape = createTextShape(0, 0, '文本');
      this.autoSizeTextShape(shape);
    } else {
      const kind = ['rect', 'round', 'ellipse', 'diamond', 'triangle'].includes(toolId) ? toolId : 'rect';
      shape = createGeoShape(kind, 0, 0);
      const size = getQuickConnectShapeSize(kind === 'ellipse' ? 'ellipse' : kind === 'diamond' ? 'diamond' : kind === 'triangle' ? 'triangle' : 'rectangle');
      shape.w = Math.min(size.width, 220);
      shape.h = Math.min(size.height, 120);
      if (this.lastStyles.geo) Object.assign(shape.props, this.lastStyles.geo);
    }
    shape.x = round2(center.x - shape.w / 2);
    shape.y = round2(center.y - shape.h / 2);
    this.mutate(() => {
      this.shapes.push(shape);
      const target = this.getShapeById(pending.connectorId);
      if (target) {
        target.props.end = { shapeId: shape.id, anchor: 'auto' };
      }
    });
    this.pendingChoice = null;
    this.setSelection([shape.id]);
    this.beginEdit(shape.id);
    return shape;
  }

  closePendingChoice() {
    if (!this.pendingChoice) return;
    this.pendingChoice = null;
    this.emitState();
  }

  /* ---------------------------------------------------------------- */
  /* 创建                                                              */
  /* ---------------------------------------------------------------- */

  _createNoteAt(world) {
    const shape = createNoteShape(0, 0, this.lastStyles.noteColor);
    shape.x = round2(world.x - shape.w / 2);
    shape.y = round2(world.y - shape.h / 2);
    this.mutate(() => {
      this.shapes.push(shape);
    });
    this.setTool('select');
    this.setSelection([shape.id]);
    this.beginEdit(shape.id);
  }

  _createTextAt(world) {
    const shape = createTextShape(round2(world.x), round2(world.y - 12), '');
    this.mutate(() => {
      this.shapes.push(shape);
    });
    this.setTool('select');
    this.setSelection([shape.id]);
    this.beginEdit(shape.id);
  }

  createStencilShapeAtViewportCenter(toolId) {
    const center = this.screenToWorld({ x: this.viewport.width / 2, y: this.viewport.height / 2 });
    const normalized = String(toolId || 'rectangle').toLowerCase();
    let shape = null;
    let autoEdit = false;
    if (normalized === 'note') {
      shape = createNoteShape(0, 0, this.lastStyles.noteColor);
      autoEdit = true;
    } else if (normalized === 'text') {
      shape = createTextShape(0, 0, '文本');
      this.autoSizeTextShape(shape);
      autoEdit = true;
    } else if (normalized === 'line' || normalized === 'arrow') {
      shape = createConnectorShape(
        { x: round2(center.x - 120), y: round2(center.y) },
        { x: round2(center.x + 120), y: round2(center.y) },
        {
          ...this.lastStyles.connector,
          router: 'straight',
          arrowEnd: normalized === 'arrow' ? 'arrow' : 'none'
        }
      );
    } else if (normalized === 'frame') {
      shape = createGeoShape('rect', 0, 0);
      shape.w = 480;
      shape.h = 320;
      shape.props.fill = 'none';
      shape.props.stroke = '#B4B8BF';
      shape.props.strokeWidth = 1;
    } else {
      const kindMap = { rectangle: 'rect', ellipse: 'ellipse', diamond: 'diamond', triangle: 'triangle', round: 'round' };
      shape = createGeoShape(kindMap[normalized] || 'rect', 0, 0);
      if (this.lastStyles.geo) Object.assign(shape.props, this.lastStyles.geo);
    }
    if (shape.type !== 'connector') {
      shape.x = round2(center.x - shape.w / 2);
      shape.y = round2(center.y - shape.h / 2);
    }
    this.mutate(() => {
      this.shapes.push(shape);
    });
    this.setSelection([shape.id]);
    if (autoEdit) this.beginEdit(shape.id);
    return { shapeId: shape.id, autoEdit };
  }

  insertImage(src, naturalWidth, naturalHeight) {
    const center = this.screenToWorld({ x: this.viewport.width / 2, y: this.viewport.height / 2 });
    const maxSide = 480;
    let w = toFiniteNumber(naturalWidth, 320);
    let h = toFiniteNumber(naturalHeight, 240);
    const scale = Math.min(1, maxSide / Math.max(w, h));
    w = Math.max(24, Math.round(w * scale));
    h = Math.max(24, Math.round(h * scale));
    const shape = createImageShape(src, round2(center.x - w / 2), round2(center.y - h / 2), w, h);
    this.mutate(() => {
      this.shapes.push(shape);
    });
    this.setTool('select');
    this.setSelection([shape.id]);
    return shape;
  }

  /* ---------------------------------------------------------------- */
  /* 文本编辑                                                          */
  /* ---------------------------------------------------------------- */

  beginEdit(shapeId) {
    const shape = this.getShapeById(shapeId);
    if (!shape) return;
    if (!['geo', 'note', 'text', 'connector'].includes(shape.type)) return;
    this.beginTransaction();
    this.editingId = shapeId;
    this.emit('edit-start', { shapeId });
    this.emitState();
  }

  updateEditingText(text) {
    const shape = this.getShapeById(this.editingId);
    if (!shape) return;
    shape.props.text = String(text ?? '');
    if (shape.type === 'text') this.autoSizeTextShape(shape);
    this.requestRender();
  }

  commitEdit() {
    if (!this.editingId) return;
    const shape = this.getShapeById(this.editingId);
    this.editingId = '';
    if (shape && shape.type === 'text' && !String(shape.props.text || '').trim()) {
      // 空文本自动清除
      this.shapes = this.shapes.filter((item) => item.id !== shape.id);
      this.selection.delete(shape.id);
    }
    this.commitTransaction();
    this.emitState();
  }

  cancelEdit() {
    if (!this.editingId) return;
    this.editingId = '';
    this.abortTransaction();
    this.emitState();
  }

  /* ---------------------------------------------------------------- */
  /* 键盘                                                              */
  /* ---------------------------------------------------------------- */

  handleKeyDown(event) {
    const key = event.key;
    const meta = event.ctrlKey || event.metaKey;

    if (this.editingId) return false;

    if (meta) {
      const lower = key.toLowerCase();
      if (lower === 'z') {
        if (event.shiftKey) this.redo();
        else this.undo();
        return true;
      }
      if (lower === 'y') {
        this.redo();
        return true;
      }
      if (lower === 'a') {
        this.selectAll();
        return true;
      }
      if (lower === 'c') return this.copySelection();
      if (lower === 'x') {
        this.cutSelection();
        return true;
      }
      if (lower === 'v') {
        this.pasteClipboard();
        return true;
      }
      if (lower === 'd') {
        this.duplicateSelection();
        return true;
      }
      if (key === '0') {
        this.resetZoom();
        return true;
      }
      if (key === '=' || key === '+') {
        this.zoomIn();
        return true;
      }
      if (key === '-') {
        this.zoomOut();
        return true;
      }
      return false;
    }

    if (key === 'Delete' || key === 'Backspace') {
      this.deleteSelection();
      return true;
    }
    if (key === 'Escape') {
      if (this.pendingChoice) {
        this.closePendingChoice();
        return true;
      }
      if (this.tool.id !== 'select') {
        this.setTool('select');
        return true;
      }
      this.clearSelection();
      return true;
    }
    if (key === 'Enter') {
      if (this.selection.size === 1) {
        const shape = this.getSelectedShapes()[0];
        if (shape && ['geo', 'note', 'text', 'connector'].includes(shape.type)) {
          this.beginEdit(shape.id);
          return true;
        }
      }
      return false;
    }
    if (key.startsWith('Arrow')) {
      if (!this.selection.size) return false;
      const step = (event.shiftKey ? NUDGE_STEP_LARGE : NUDGE_STEP) / 1;
      const dx = key === 'ArrowLeft' ? -step : key === 'ArrowRight' ? step : 0;
      const dy = key === 'ArrowUp' ? -step : key === 'ArrowDown' ? step : 0;
      this.mutate(() => {
        this.getSelectedShapes().forEach((shape) => {
          if (shape.type === 'connector') {
            ['start', 'end'].forEach((terminal) => {
              const ref = shape.props[terminal];
              if (!ref?.shapeId) {
                shape.props[terminal] = { x: round2(ref.x + dx), y: round2(ref.y + dy) };
              }
            });
          } else {
            shape.x = round2(shape.x + dx);
            shape.y = round2(shape.y + dy);
          }
        });
      });
      return true;
    }

    const toolKeyMap = {
      v: ['select'],
      h: ['hand'],
      n: ['note'],
      r: ['geo', { geo: 'rect' }],
      o: ['geo', { geo: 'ellipse' }],
      d: ['geo', { geo: 'diamond' }],
      t: ['text'],
      p: ['pen'],
      e: ['eraser'],
      c: ['connector', { router: 'elbow' }],
      l: ['connector', { router: 'straight' }]
    };
    const mapping = toolKeyMap[key.toLowerCase()];
    if (mapping) {
      this.setTool(mapping[0], mapping[1] || {});
      return true;
    }
    if (key === ' ') {
      if (!this.spacePanning) {
        this.spacePanning = true;
        this.emitState();
      }
      return true;
    }
    return false;
  }

  handleKeyUp(event) {
    if (event.key === ' ') {
      this.spacePanning = false;
      this.emitState();
      return true;
    }
    return false;
  }

  /* ---------------------------------------------------------------- */
  /* 快照 IO                                                           */
  /* ---------------------------------------------------------------- */

  getSnapshot() {
    return {
      version: SNAPSHOT_VERSION,
      engine: SNAPSHOT_ENGINE,
      shapes: deepClone(this.shapes),
      camera: {
        x: round2(this.camera.x),
        y: round2(this.camera.y),
        zoom: Math.round(this.camera.zoom * 10000) / 10000
      }
    };
  }

  loadSnapshot(snapshot) {
    const normalized = normalizeBoardSnapshot(snapshot);
    this.shapes = normalized ? deepClone(normalized.shapes) : [];
    this.selection = new Set();
    this.editingId = '';
    this.pendingChoice = null;
    this.interaction = null;
    this.history = { undo: [], redo: [] };
    this._txBefore = null;
    if (normalized?.camera && Number.isFinite(Number(normalized.camera.zoom))) {
      this.camera = {
        x: toFiniteNumber(normalized.camera.x),
        y: toFiniteNumber(normalized.camera.y),
        zoom: clamp(toFiniteNumber(normalized.camera.zoom, 1), MIN_ZOOM, MAX_ZOOM)
      };
      this.emitState();
    } else {
      this.zoomToFit();
    }
    return Boolean(normalized);
  }

  clear() {
    this.shapes = [];
    this.selection = new Set();
    this.editingId = '';
    this.pendingChoice = null;
    this.interaction = null;
    this.history = { undo: [], redo: [] };
    this._txBefore = null;
    this.emitState();
  }

  /* ---------------------------------------------------------------- */
  /* 图（Mermaid）                                                     */
  /* ---------------------------------------------------------------- */

  importGraph(graph) {
    const result = layoutGraphToShapes(graph, {
      measure: (text) => this.measureText(text, 14)
    });
    this.mutate(() => {
      this.shapes = result.shapes;
    });
    this.selection = new Set();
    this.zoomToFit();
    return {
      createdNodeCount: result.createdNodeCount,
      createdEdgeCount: result.createdEdgeCount
    };
  }

  exportGraph(preferredKind) {
    return extractGraphFromShapes(this.shapes, preferredKind, {
      resolveEndPoint: (connector, terminal) => {
        const geometry = getConnectorGeometry(connector, (id) => this.getShapeById(id));
        return terminal === 'start' ? geometry.start.point : geometry.end.point;
      }
    });
  }

  /* ---------------------------------------------------------------- */
  /* UI 状态                                                           */
  /* ---------------------------------------------------------------- */

  getUiState() {
    return {
      tool: { ...this.tool },
      selectionIds: [...this.selection],
      selectionCount: this.selection.size,
      selectionBounds: this.getSelectionBounds(),
      selectionSummary: this.getSelectionStyleSummary(),
      canUndo: this.history.undo.length > 0,
      canRedo: this.history.redo.length > 0,
      zoom: this.camera.zoom,
      camera: { ...this.camera },
      editingId: this.editingId,
      pendingChoice: this.pendingChoice
        ? { ...this.pendingChoice, screenPoint: this.worldToScreen(this.pendingChoice.dropPoint) }
        : null,
      spacePanning: this.spacePanning,
      hover: { ...this.hover }
    };
  }
}

function boundsIntersectSafe(left, right) {
  if (!left || !right) return false;
  return !(
    left.x + left.w < right.x ||
    left.x > right.x + right.w ||
    left.y + left.h < right.y ||
    left.y > right.y + right.h
  );
}
