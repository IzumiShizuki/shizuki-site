/**
 * feishuBoardRenderer.js
 * Canvas 2D 渲染：点阵网格、形状、连接线、选区、参考线、快速连线预览。
 */

import {
  BOARD_BG,
  BOARD_FONT_FAMILY,
  BOARD_GRID_DOT,
  BOARD_GRID_SPACING,
  FEISHU_BLUE,
  SNAP_GUIDE_COLOR,
  clamp,
  getAnchorPoint,
  getConnectorGeometry,
  getGeoOutlineLocal,
  getShapeBounds,
  getBoundsCenter,
  toFiniteNumber,
  wrapTextLines
} from './feishuBoardCore';

const SELECT_STROKE = FEISHU_BLUE;
const HANDLE_SIZE = 8;

export class FeishuBoardRenderer {
  constructor(canvas) {
    this.canvas = canvas;
    this.ctx = canvas ? canvas.getContext('2d') : null;
    this.imageCache = new Map();
    this.onImageLoaded = null;
  }

  destroy() {
    this.imageCache.clear();
    this.canvas = null;
    this.ctx = null;
  }

  getImage(src) {
    if (!src) return null;
    const cached = this.imageCache.get(src);
    if (cached) return cached.ready ? cached.image : null;
    if (typeof Image === 'undefined') return null;
    const entry = { image: new Image(), ready: false, promise: null };
    entry.promise = new Promise((resolve) => {
      entry.image.onload = () => {
        entry.ready = true;
        resolve(true);
        if (typeof this.onImageLoaded === 'function') this.onImageLoaded();
      };
      entry.image.onerror = () => resolve(false);
    });
    entry.image.src = src;
    this.imageCache.set(src, entry);
    return null;
  }

  async ensureImagesLoaded(shapes) {
    const jobs = [];
    (shapes || []).forEach((shape) => {
      if (shape.type !== 'image' || !shape.props?.src) return;
      this.getImage(shape.props.src);
      const entry = this.imageCache.get(shape.props.src);
      if (entry?.promise) jobs.push(entry.promise);
    });
    await Promise.all(jobs);
  }

  /* ---------------------------------------------------------------- */

  draw(engine) {
    const canvas = this.canvas;
    const ctx = this.ctx;
    if (!canvas || !ctx) return;
    const dpr = typeof window !== 'undefined' ? window.devicePixelRatio || 1 : 1;
    const width = engine.viewport.width;
    const height = engine.viewport.height;
    if (canvas.width !== Math.round(width * dpr) || canvas.height !== Math.round(height * dpr)) {
      canvas.width = Math.round(width * dpr);
      canvas.height = Math.round(height * dpr);
    }
    ctx.setTransform(dpr, 0, 0, dpr, 0, 0);
    ctx.clearRect(0, 0, width, height);
    ctx.fillStyle = BOARD_BG;
    ctx.fillRect(0, 0, width, height);

    this.drawGrid(ctx, engine, width, height);

    ctx.save();
    ctx.scale(engine.camera.zoom, engine.camera.zoom);
    ctx.translate(-engine.camera.x, -engine.camera.y);

    const viewBounds = {
      x: engine.camera.x - 100,
      y: engine.camera.y - 100,
      w: width / engine.camera.zoom + 200,
      h: height / engine.camera.zoom + 200
    };

    const getShapeById = (id) => engine.getShapeById(id);

    engine.shapes.forEach((shape) => {
      const box = engine.getShapeRenderAabb(shape);
      if (
        box &&
        (box.x + box.w < viewBounds.x ||
          box.x > viewBounds.x + viewBounds.w ||
          box.y + box.h < viewBounds.y ||
          box.y > viewBounds.y + viewBounds.h)
      ) {
        return;
      }
      this.drawShape(ctx, shape, engine, getShapeById);
    });

    // 进行中的画笔笔迹
    if (engine.penStroke && engine.penStroke.points.length > 1) {
      this.strokePolyline(
        ctx,
        engine.penStroke.points.map(([x, y]) => ({ x, y })),
        engine.penStroke.stroke,
        engine.penStroke.strokeWidth,
        engine.penStroke.tool === 'highlighter' ? 0.45 : 1
      );
    }

    // 创建形状预览
    if (engine.interaction?.type === 'create-geo') {
      const { origin, current, kind } = engine.interaction;
      const x = Math.min(origin.x, current.x);
      const y = Math.min(origin.y, current.y);
      const w = Math.abs(current.x - origin.x);
      const h = Math.abs(current.y - origin.y);
      if (w > 2 && h > 2) {
        ctx.save();
        ctx.strokeStyle = SELECT_STROKE;
        ctx.lineWidth = 1.5 / engine.camera.zoom;
        ctx.setLineDash([6 / engine.camera.zoom, 4 / engine.camera.zoom]);
        this.traceGeoPath(ctx, kind, x, y, w, h);
        ctx.stroke();
        ctx.restore();
      }
    }

    this.drawHoverAndSelection(ctx, engine, getShapeById);
    this.drawGuides(ctx, engine);
    this.drawMarquee(ctx, engine);

    ctx.restore();
  }

  drawGrid(ctx, engine, width, height) {
    const zoom = engine.camera.zoom;
    let spacing = BOARD_GRID_SPACING * zoom;
    while (spacing < 14) spacing *= 2;
    while (spacing > 56) spacing /= 2;
    const offsetX = (-engine.camera.x * zoom) % spacing;
    const offsetY = (-engine.camera.y * zoom) % spacing;
    const radius = clamp(zoom, 0.8, 1.4);
    ctx.fillStyle = BOARD_GRID_DOT;
    ctx.beginPath();
    for (let x = offsetX; x < width; x += spacing) {
      for (let y = offsetY; y < height; y += spacing) {
        ctx.moveTo(x + radius, y);
        ctx.arc(x, y, radius, 0, Math.PI * 2);
      }
    }
    ctx.fill();
  }

  /* ---------------------------------------------------------------- */
  /* 形状                                                              */
  /* ---------------------------------------------------------------- */

  drawShape(ctx, shape, engine, getShapeById) {
    if (shape.type === 'connector') {
      this.drawConnector(ctx, shape, engine, getShapeById);
      return;
    }

    const bounds = getShapeBounds(shape);
    const center = getBoundsCenter(bounds);
    const rotation = toFiniteNumber(shape.rotation);
    ctx.save();
    if (rotation) {
      ctx.translate(center.x, center.y);
      ctx.rotate(rotation);
      ctx.translate(-center.x, -center.y);
    }

    if (shape.type === 'geo') this.drawGeo(ctx, shape, bounds, engine);
    else if (shape.type === 'note') this.drawNote(ctx, shape, bounds, engine);
    else if (shape.type === 'text') this.drawTextShape(ctx, shape, bounds, engine);
    else if (shape.type === 'draw') this.drawFreehand(ctx, shape, bounds);
    else if (shape.type === 'image') this.drawImage(ctx, shape, bounds);

    ctx.restore();
  }

  traceGeoPath(ctx, geo, x, y, w, h) {
    ctx.beginPath();
    if (geo === 'ellipse') {
      ctx.ellipse(x + w / 2, y + h / 2, w / 2, h / 2, 0, 0, Math.PI * 2);
      return;
    }
    if (geo === 'round' || geo === 'rect') {
      const radius = geo === 'round' ? Math.min(14, w / 4, h / 4) : Math.min(4, w / 4, h / 4);
      this.traceRoundedRect(ctx, x, y, w, h, radius);
      return;
    }
    if (geo === 'cylinder') {
      const ry = Math.min(h * 0.16, 22);
      ctx.moveTo(x, y + ry);
      ctx.ellipse(x + w / 2, y + ry, w / 2, ry, 0, Math.PI, 0);
      ctx.lineTo(x + w, y + h - ry);
      ctx.ellipse(x + w / 2, y + h - ry, w / 2, ry, 0, 0, Math.PI);
      ctx.closePath();
      return;
    }
    if (geo === 'bubble') {
      const radius = Math.min(12, w / 5, h / 5);
      const tail = Math.min(h * 0.22, 26);
      const bodyH = h - tail;
      ctx.moveTo(x + radius, y);
      ctx.arcTo(x + w, y, x + w, y + bodyH, radius);
      ctx.arcTo(x + w, y + bodyH, x, y + bodyH, radius);
      ctx.lineTo(x + w * 0.32, y + bodyH);
      ctx.lineTo(x + w * 0.2, y + h);
      ctx.lineTo(x + w * 0.18, y + bodyH);
      ctx.arcTo(x, y + bodyH, x, y, radius);
      ctx.arcTo(x, y, x + w, y, radius);
      ctx.closePath();
      return;
    }
    const outline = getGeoOutlineLocal(geo, w, h);
    outline.forEach((point, index) => {
      if (index === 0) ctx.moveTo(x + point.x, y + point.y);
      else ctx.lineTo(x + point.x, y + point.y);
    });
    ctx.closePath();
  }

  traceRoundedRect(ctx, x, y, w, h, radius) {
    const r = Math.max(0, Math.min(radius, w / 2, h / 2));
    ctx.moveTo(x + r, y);
    ctx.arcTo(x + w, y, x + w, y + h, r);
    ctx.arcTo(x + w, y + h, x, y + h, r);
    ctx.arcTo(x, y + h, x, y, r);
    ctx.arcTo(x, y, x + w, y, r);
    ctx.closePath();
  }

  applyDash(ctx, dash, strokeWidth, zoom) {
    if (dash === 'dashed') ctx.setLineDash([strokeWidth * 3, strokeWidth * 2.2]);
    else if (dash === 'dotted') ctx.setLineDash([Math.max(1, strokeWidth * 0.1), strokeWidth * 2.4]);
    else ctx.setLineDash([]);
  }

  drawGeo(ctx, shape, bounds, engine) {
    const props = shape.props || {};
    this.traceGeoPath(ctx, props.geo || 'rect', bounds.x, bounds.y, bounds.w, bounds.h);
    if (props.fill && props.fill !== 'none') {
      ctx.fillStyle = props.fill;
      ctx.fill();
    }
    const strokeWidth = toFiniteNumber(props.strokeWidth, 2);
    if (props.stroke && props.stroke !== 'none' && strokeWidth > 0) {
      ctx.strokeStyle = props.stroke;
      ctx.lineWidth = strokeWidth;
      ctx.lineJoin = 'round';
      ctx.lineCap = 'round';
      this.applyDash(ctx, props.dash, strokeWidth, engine.camera.zoom);
      ctx.stroke();
      ctx.setLineDash([]);
    }
    if (engine.editingId !== shape.id) {
      this.drawWrappedText(ctx, shape, bounds, engine, {
        padding: 12,
        vertical: 'center',
        align: props.align || 'center',
        color: props.textColor,
        fontSize: props.fontSize
      });
    }
  }

  drawNote(ctx, shape, bounds, engine) {
    const props = shape.props || {};
    ctx.save();
    ctx.shadowColor = 'rgba(31, 35, 41, 0.16)';
    ctx.shadowBlur = 10;
    ctx.shadowOffsetY = 3;
    ctx.fillStyle = props.color || '#FFF1A1';
    ctx.beginPath();
    this.traceRoundedRect(ctx, bounds.x, bounds.y, bounds.w, bounds.h, 6);
    ctx.fill();
    ctx.restore();
    // 底边略深，营造纸张厚度
    ctx.fillStyle = 'rgba(31, 35, 41, 0.05)';
    ctx.beginPath();
    this.traceRoundedRect(ctx, bounds.x, bounds.y + bounds.h - 5, bounds.w, 5, 3);
    ctx.fill();
    if (engine.editingId !== shape.id) {
      this.drawWrappedText(ctx, shape, bounds, engine, {
        padding: 16,
        vertical: 'top',
        align: 'left',
        color: props.textColor,
        fontSize: props.fontSize
      });
    }
  }

  drawTextShape(ctx, shape, bounds, engine) {
    if (engine.editingId === shape.id) return;
    const props = shape.props || {};
    this.drawWrappedText(ctx, shape, bounds, engine, {
      padding: 2,
      vertical: 'top',
      align: props.align || 'left',
      color: props.color,
      fontSize: props.fontSize
    });
  }

  drawWrappedText(ctx, shape, bounds, engine, options) {
    const text = String(shape.props?.text || '');
    if (!text) return;
    const fontSize = toFiniteNumber(options.fontSize, 14);
    const lineHeight = fontSize * 1.4;
    const padding = options.padding;
    const maxWidth = Math.max(fontSize, bounds.w - padding * 2);
    ctx.font = `${fontSize}px ${BOARD_FONT_FAMILY}`;
    const lines = wrapTextLines(text, maxWidth, (value) => ctx.measureText(value).width);
    const totalHeight = lines.length * lineHeight;
    let startY;
    if (options.vertical === 'top') {
      startY = bounds.y + padding + lineHeight / 2;
    } else {
      startY = bounds.y + bounds.h / 2 - totalHeight / 2 + lineHeight / 2;
    }
    ctx.fillStyle = options.color || '#1F2329';
    ctx.textBaseline = 'middle';
    lines.forEach((line, index) => {
      const y = startY + index * lineHeight;
      if (y > bounds.y + bounds.h + lineHeight) return;
      if (options.align === 'center') {
        ctx.textAlign = 'center';
        ctx.fillText(line, bounds.x + bounds.w / 2, y);
      } else if (options.align === 'right') {
        ctx.textAlign = 'right';
        ctx.fillText(line, bounds.x + bounds.w - padding, y);
      } else {
        ctx.textAlign = 'left';
        ctx.fillText(line, bounds.x + padding, y);
      }
    });
    ctx.textAlign = 'left';
  }

  drawFreehand(ctx, shape, bounds) {
    const props = shape.props || {};
    const points = (props.points || []).map(([x, y]) => ({ x: bounds.x + x, y: bounds.y + y }));
    this.strokePolyline(ctx, points, props.stroke, toFiniteNumber(props.strokeWidth, 3), toFiniteNumber(props.opacity, 1));
  }

  strokePolyline(ctx, points, stroke, strokeWidth, opacity) {
    if (points.length < 2) return;
    ctx.save();
    ctx.globalAlpha = opacity;
    ctx.strokeStyle = stroke || '#1F2329';
    ctx.lineWidth = strokeWidth;
    ctx.lineJoin = 'round';
    ctx.lineCap = 'round';
    ctx.beginPath();
    ctx.moveTo(points[0].x, points[0].y);
    for (let i = 1; i < points.length - 1; i += 1) {
      const midX = (points[i].x + points[i + 1].x) / 2;
      const midY = (points[i].y + points[i + 1].y) / 2;
      ctx.quadraticCurveTo(points[i].x, points[i].y, midX, midY);
    }
    const last = points[points.length - 1];
    ctx.lineTo(last.x, last.y);
    ctx.stroke();
    ctx.restore();
  }

  drawImage(ctx, shape, bounds) {
    const image = this.getImage(shape.props?.src);
    if (image) {
      ctx.drawImage(image, bounds.x, bounds.y, bounds.w, bounds.h);
      return;
    }
    ctx.fillStyle = '#F5F6F7';
    ctx.fillRect(bounds.x, bounds.y, bounds.w, bounds.h);
    ctx.strokeStyle = '#DEE0E3';
    ctx.lineWidth = 1;
    ctx.strokeRect(bounds.x, bounds.y, bounds.w, bounds.h);
  }

  /* ---------------------------------------------------------------- */
  /* 连接线                                                            */
  /* ---------------------------------------------------------------- */

  drawConnector(ctx, shape, engine, getShapeById) {
    const props = shape.props || {};
    const geometry = getConnectorGeometry(shape, getShapeById);
    const strokeWidth = toFiniteNumber(props.strokeWidth, 2);
    ctx.save();
    ctx.strokeStyle = props.stroke || '#646A73';
    ctx.lineWidth = strokeWidth;
    ctx.lineJoin = 'round';
    ctx.lineCap = 'round';
    this.applyDash(ctx, props.dash, strokeWidth, engine.camera.zoom);

    ctx.beginPath();
    if (geometry.router === 'curve' && geometry.curve) {
      ctx.moveTo(geometry.curve.p0.x, geometry.curve.p0.y);
      ctx.bezierCurveTo(
        geometry.curve.c1.x,
        geometry.curve.c1.y,
        geometry.curve.c2.x,
        geometry.curve.c2.y,
        geometry.curve.p1.x,
        geometry.curve.p1.y
      );
    } else if (geometry.router === 'elbow') {
      const points = geometry.points;
      const cornerRadius = 6;
      ctx.moveTo(points[0].x, points[0].y);
      for (let i = 1; i < points.length - 1; i += 1) {
        const prev = points[i - 1];
        const current = points[i];
        const next = points[i + 1];
        const inLen = Math.hypot(current.x - prev.x, current.y - prev.y);
        const outLen = Math.hypot(next.x - current.x, next.y - current.y);
        const radius = Math.min(cornerRadius, inLen / 2, outLen / 2);
        if (radius > 0.5) {
          ctx.arcTo(current.x, current.y, next.x, next.y, radius);
        } else {
          ctx.lineTo(current.x, current.y);
        }
      }
      const last = geometry.points[geometry.points.length - 1];
      ctx.lineTo(last.x, last.y);
    } else {
      ctx.moveTo(geometry.points[0].x, geometry.points[0].y);
      const last = geometry.points[geometry.points.length - 1];
      ctx.lineTo(last.x, last.y);
    }
    ctx.stroke();
    ctx.setLineDash([]);

    if (props.arrowEnd === 'arrow') {
      this.drawArrowHead(ctx, geometry.end.point, geometry.endArrowAngle, strokeWidth, props.stroke);
    }
    if (props.arrowStart === 'arrow') {
      this.drawArrowHead(ctx, geometry.start.point, geometry.startArrowAngle, strokeWidth, props.stroke);
    }

    // 标签
    const label = String(props.text || '').trim();
    if (label && engine.editingId !== shape.id) {
      const fontSize = toFiniteNumber(props.fontSize, 13);
      ctx.font = `${fontSize}px ${BOARD_FONT_FAMILY}`;
      const metrics = ctx.measureText(label);
      const paddingX = 6;
      const boxW = metrics.width + paddingX * 2;
      const boxH = fontSize * 1.5;
      ctx.fillStyle = BOARD_BG;
      ctx.fillRect(geometry.labelPoint.x - boxW / 2, geometry.labelPoint.y - boxH / 2, boxW, boxH);
      ctx.fillStyle = '#41464E';
      ctx.textAlign = 'center';
      ctx.textBaseline = 'middle';
      ctx.fillText(label, geometry.labelPoint.x, geometry.labelPoint.y);
      ctx.textAlign = 'left';
    }
    ctx.restore();
  }

  drawArrowHead(ctx, point, angle, strokeWidth, stroke) {
    const size = 5 + strokeWidth * 2.4;
    ctx.save();
    ctx.translate(point.x, point.y);
    ctx.rotate(angle);
    ctx.beginPath();
    ctx.moveTo(0, 0);
    ctx.lineTo(-size, -size * 0.5);
    ctx.lineTo(-size * 0.72, 0);
    ctx.lineTo(-size, size * 0.5);
    ctx.closePath();
    ctx.fillStyle = stroke || '#646A73';
    ctx.fill();
    ctx.restore();
  }

  /* ---------------------------------------------------------------- */
  /* 选区 / 参考线 / 悬浮                                              */
  /* ---------------------------------------------------------------- */

  drawHoverAndSelection(ctx, engine, getShapeById) {
    const zoom = engine.camera.zoom;
    const px = (value) => value / zoom;

    // 悬浮描边
    if (engine.hover.shapeId && !engine.selection.has(engine.hover.shapeId) && engine.tool.id === 'select') {
      const shape = getShapeById(engine.hover.shapeId);
      if (shape && !engine.interaction) {
        ctx.save();
        ctx.strokeStyle = 'rgba(51, 112, 255, 0.55)';
        ctx.lineWidth = px(1.5);
        this.traceShapeOutline(ctx, shape, engine, getShapeById);
        ctx.stroke();
        ctx.restore();
      }
    }

    // 连线目标高亮
    if (engine.connectPreview?.targetShapeId) {
      const shape = getShapeById(engine.connectPreview.targetShapeId);
      if (shape) {
        ctx.save();
        ctx.strokeStyle = SELECT_STROKE;
        ctx.lineWidth = px(2);
        this.traceShapeOutline(ctx, shape, engine, getShapeById);
        ctx.stroke();
        ctx.restore();
      }
    }

    // 选中形状描边
    const selectedShapes = engine.getSelectedShapes();
    selectedShapes.forEach((shape) => {
      ctx.save();
      ctx.strokeStyle = SELECT_STROKE;
      ctx.lineWidth = px(1.5);
      this.traceShapeOutline(ctx, shape, engine, getShapeById);
      ctx.stroke();
      ctx.restore();
      if (shape.type === 'connector') {
        const geometry = getConnectorGeometry(shape, getShapeById);
        [geometry.start.point, geometry.end.point].forEach((point) => {
          this.drawHandle(ctx, point.x, point.y, zoom, true);
        });
      }
    });

    // 单选：缩放/旋转手柄
    if (selectedShapes.length === 1 && selectedShapes[0].type !== 'connector' && !engine.editingId) {
      const shape = selectedShapes[0];
      const bounds = getShapeBounds(shape);
      const center = getBoundsCenter(bounds);
      const rotation = toFiniteNumber(shape.rotation);
      ctx.save();
      if (rotation) {
        ctx.translate(center.x, center.y);
        ctx.rotate(rotation);
        ctx.translate(-center.x, -center.y);
      }
      ctx.strokeStyle = SELECT_STROKE;
      ctx.lineWidth = px(1.2);
      ctx.strokeRect(bounds.x, bounds.y, bounds.w, bounds.h);

      engine._resizeHandleDefs(shape).forEach((handle) => {
        this.drawHandle(ctx, bounds.x + handle.u * bounds.w, bounds.y + handle.v * bounds.h, zoom, false);
      });
      // 旋转手柄
      const rotateY = bounds.y - px(26);
      ctx.beginPath();
      ctx.moveTo(bounds.x + bounds.w / 2, bounds.y);
      ctx.lineTo(bounds.x + bounds.w / 2, rotateY + px(4));
      ctx.strokeStyle = 'rgba(51, 112, 255, 0.6)';
      ctx.stroke();
      ctx.beginPath();
      ctx.arc(bounds.x + bounds.w / 2, rotateY, px(4.5), 0, Math.PI * 2);
      ctx.fillStyle = '#FFFFFF';
      ctx.fill();
      ctx.strokeStyle = SELECT_STROKE;
      ctx.lineWidth = px(1.4);
      ctx.stroke();
      ctx.restore();
    }

    // 多选：整体包围盒
    if (selectedShapes.length > 1) {
      const bounds = engine.getSelectionBounds();
      if (bounds) {
        ctx.save();
        ctx.strokeStyle = 'rgba(51, 112, 255, 0.8)';
        ctx.lineWidth = px(1.2);
        ctx.setLineDash([px(5), px(4)]);
        ctx.strokeRect(bounds.x, bounds.y, bounds.w, bounds.h);
        ctx.restore();
      }
    }

    // 锚点（悬浮 / 单选）
    if ((engine.tool.id === 'select' || engine.tool.id === 'connector') && !engine.interaction && !engine.editingId) {
      const anchorTargets = new Set();
      if (engine.hover.shapeId) anchorTargets.add(engine.hover.shapeId);
      if (engine.selection.size === 1) anchorTargets.add([...engine.selection][0]);
      anchorTargets.forEach((id) => {
        const shape = getShapeById(id);
        if (!shape || !['geo', 'note', 'text', 'image'].includes(shape.type)) return;
        ['top', 'right', 'bottom', 'left'].forEach((anchorId) => {
          const point = getAnchorPoint(shape, anchorId);
          const isActive = engine.hover.shapeId === id && engine.hover.anchorId === anchorId;
          ctx.save();
          ctx.beginPath();
          ctx.arc(point.x, point.y, px(isActive ? 5.5 : 4), 0, Math.PI * 2);
          ctx.fillStyle = '#FFFFFF';
          ctx.fill();
          ctx.lineWidth = px(1.6);
          ctx.strokeStyle = SELECT_STROKE;
          ctx.stroke();
          if (isActive) {
            ctx.beginPath();
            ctx.arc(point.x, point.y, px(2.2), 0, Math.PI * 2);
            ctx.fillStyle = SELECT_STROKE;
            ctx.fill();
          }
          ctx.restore();
        });
      });
    }
  }

  traceShapeOutline(ctx, shape, engine, getShapeById) {
    if (shape.type === 'connector') {
      const geometry = getConnectorGeometry(shape, getShapeById);
      ctx.beginPath();
      geometry.points.forEach((point, index) => {
        if (index === 0) ctx.moveTo(point.x, point.y);
        else ctx.lineTo(point.x, point.y);
      });
      return;
    }
    const bounds = getShapeBounds(shape);
    const center = getBoundsCenter(bounds);
    const rotation = toFiniteNumber(shape.rotation);
    if (rotation) {
      ctx.translate(center.x, center.y);
      ctx.rotate(rotation);
      ctx.translate(-center.x, -center.y);
    }
    if (shape.type === 'geo') {
      this.traceGeoPath(ctx, shape.props?.geo || 'rect', bounds.x, bounds.y, bounds.w, bounds.h);
    } else {
      ctx.beginPath();
      ctx.rect(bounds.x, bounds.y, bounds.w, bounds.h);
    }
  }

  drawHandle(ctx, x, y, zoom, round) {
    const size = HANDLE_SIZE / zoom;
    ctx.save();
    ctx.fillStyle = '#FFFFFF';
    ctx.strokeStyle = SELECT_STROKE;
    ctx.lineWidth = 1.4 / zoom;
    if (round) {
      ctx.beginPath();
      ctx.arc(x, y, size / 2, 0, Math.PI * 2);
      ctx.fill();
      ctx.stroke();
    } else {
      ctx.beginPath();
      const radius = 1.8 / zoom;
      this.traceRoundedRect(ctx, x - size / 2, y - size / 2, size, size, radius);
      ctx.fill();
      ctx.stroke();
    }
    ctx.restore();
  }

  drawGuides(ctx, engine) {
    if (!engine.guides.length) return;
    const zoom = engine.camera.zoom;
    ctx.save();
    ctx.strokeStyle = SNAP_GUIDE_COLOR;
    ctx.lineWidth = 1 / zoom;
    engine.guides.forEach((guide) => {
      ctx.beginPath();
      if (guide.type === 'v') {
        ctx.moveTo(guide.x, guide.y1);
        ctx.lineTo(guide.x, guide.y2);
      } else {
        ctx.moveTo(guide.x1, guide.y);
        ctx.lineTo(guide.x2, guide.y);
      }
      ctx.stroke();
    });
    ctx.restore();
  }

  drawMarquee(ctx, engine) {
    const marquee = engine.marquee;
    if (!marquee || marquee.w < 1 || marquee.h < 1) return;
    ctx.save();
    ctx.fillStyle = 'rgba(51, 112, 255, 0.08)';
    ctx.strokeStyle = 'rgba(51, 112, 255, 0.8)';
    ctx.lineWidth = 1 / engine.camera.zoom;
    ctx.fillRect(marquee.x, marquee.y, marquee.w, marquee.h);
    ctx.strokeRect(marquee.x, marquee.y, marquee.w, marquee.h);
    ctx.restore();
  }

  /* ---------------------------------------------------------------- */
  /* 静态导出                                                          */
  /* ---------------------------------------------------------------- */

  async renderToCanvas(shapes, allShapesById, bounds, options = {}) {
    const padding = toFiniteNumber(options.padding, 24);
    const width = bounds.w + padding * 2;
    const height = bounds.h + padding * 2;
    const scale = clamp(Math.min(options.maxPixels ? options.maxPixels / Math.max(width, height) : 2, 2), 0.2, 2);
    const canvas = document.createElement('canvas');
    canvas.width = Math.max(1, Math.round(width * scale));
    canvas.height = Math.max(1, Math.round(height * scale));
    const ctx = canvas.getContext('2d');

    await this.ensureImagesLoaded(shapes);

    if (options.background !== 'transparent') {
      ctx.fillStyle = BOARD_BG;
      ctx.fillRect(0, 0, canvas.width, canvas.height);
    }

    ctx.scale(scale, scale);
    ctx.translate(padding - bounds.x, padding - bounds.y);

    const fakeEngine = {
      camera: { x: 0, y: 0, zoom: scale },
      viewport: { width, height },
      editingId: '',
      selection: new Set(),
      hover: { shapeId: '', anchorId: '' },
      tool: { id: 'export' },
      interaction: null,
      connectPreview: null,
      guides: [],
      marquee: null,
      penStroke: null,
      getShapeById: (id) => allShapesById.get(id) || null,
      getSelectedShapes: () => []
    };

    shapes.forEach((shape) => {
      this.drawShape(ctx, shape, fakeEngine, fakeEngine.getShapeById);
    });

    return canvas;
  }
}
