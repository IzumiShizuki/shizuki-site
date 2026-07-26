/**
 * boardCanvasBridge.js
 * 白板挂载桥：组装自研引擎（FeishuBoardEngine）+ 渲染器 + 飞书风格 UI，
 * 并向 BoardCanvasWindow.vue 暴露与旧版一致的 api 接口。
 * 自研引擎无需任何第三方 License，生产环境不再存在授权降级模式。
 */

import { FeishuBoardEngine } from './feishuBoardEngine';
import { FeishuBoardRenderer } from './feishuBoardRenderer';
import { createFeishuBoardUi } from './feishuBoardUi';
import { graphToMermaidText, parseMermaidTextToGraph } from './boardMermaid';
import { getConnectorGeometry, toFiniteNumber, unionBounds } from './feishuBoardCore';
import './feishuBoard.css';

export function getBoardCanvasAvailability() {
  return {
    supported: true,
    reason: 'self-engine',
    requiresLicenseKey: false,
    hasLicenseKey: false
  };
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

export function resolveSvgSize(svgText) {
  const source = String(svgText || '');
  const readAttr = (name) => {
    const match = source.match(new RegExp(`${name}="([\\d.]+)(?:px)?"`, 'i'));
    return match ? Number(match[1]) : 0;
  };
  let width = readAttr('width');
  let height = readAttr('height');
  if (!width || !height) {
    const viewBoxMatch = source.match(/viewBox="([\d.\s-]+)"/i);
    if (viewBoxMatch) {
      const parts = viewBoxMatch[1].trim().split(/\s+/).map(Number);
      if (parts.length === 4) {
        width = width || parts[2];
        height = height || parts[3];
      }
    }
  }
  return {
    width: toFiniteNumber(width, 640) || 640,
    height: toFiniteNumber(height, 480) || 480
  };
}

export function svgTextToDataUrl(svgText) {
  let source = String(svgText || '').trim();
  if (!source) return '';
  if (!/xmlns=/.test(source)) {
    source = source.replace(/<svg/i, '<svg xmlns="http://www.w3.org/2000/svg"');
  }
  return `data:image/svg+xml;charset=utf-8,${encodeURIComponent(source)}`;
}

function computeExportEntries(engine, scope) {
  let shapes;
  if (scope === 'selection') {
    const ids = new Set(engine.selection);
    shapes = engine.shapes.filter((shape) => ids.has(shape.id));
  } else if (scope === 'viewport') {
    const viewBounds = {
      x: engine.camera.x,
      y: engine.camera.y,
      w: engine.viewport.width / engine.camera.zoom,
      h: engine.viewport.height / engine.camera.zoom
    };
    shapes = engine.shapes.filter((shape) => {
      const box = engine.getShapeRenderAabb(shape);
      return (
        box &&
        !(
          box.x + box.w < viewBounds.x ||
          box.x > viewBounds.x + viewBounds.w ||
          box.y + box.h < viewBounds.y ||
          box.y > viewBounds.y + viewBounds.h
        )
      );
    });
  } else {
    shapes = engine.shapes.slice();
  }
  const bounds = unionBounds(shapes.map((shape) => engine.getShapeRenderAabb(shape)));
  return { shapes, bounds };
}

function createBridgeApi(engine, renderer) {
  return {
    engine,
    isReady() {
      return Boolean(engine && !engine._destroyed);
    },
    getSelectedShapeCount() {
      return engine.selection.size;
    },
    getSnapshot() {
      return engine.getSnapshot();
    },
    loadSnapshot(snapshot) {
      if (!snapshot || typeof snapshot !== 'object') {
        engine.clear();
        return false;
      }
      return engine.loadSnapshot(snapshot);
    },
    clear() {
      engine.clear();
    },
    createStencilShapeAtViewportCenter(toolId) {
      return engine.createStencilShapeAtViewportCenter(toolId);
    },
    importGraph(graph) {
      return engine.importGraph(graph);
    },
    parseMermaid(text) {
      return parseMermaidTextToGraph(text);
    },
    exportMermaid(preferredKind) {
      const extracted = engine.exportGraph(preferredKind);
      return {
        ...extracted,
        text: graphToMermaidText(extracted.graph, extracted.graph.kind)
      };
    },
    async insertSvg(svgText) {
      const dataUrl = svgTextToDataUrl(svgText);
      if (!dataUrl) throw new Error('SVG 内容为空');
      const size = resolveSvgSize(svgText);
      engine.insertImage(dataUrl, size.width, size.height);
    },
    async exportPng(scope = 'board', background = 'white', fileName = 'board-canvas', options = {}) {
      const download = options?.download !== false;
      const { shapes, bounds } = computeExportEntries(engine, scope);
      if (!shapes.length || !bounds) {
        return { exported: false, reason: 'empty' };
      }
      const allShapesById = new Map(engine.shapes.map((shape) => [shape.id, shape]));
      const canvas = await renderer.renderToCanvas(shapes, allShapesById, bounds, {
        background: background === 'transparent' ? 'transparent' : 'white',
        maxPixels: 4096,
        padding: 24
      });
      const blob = await new Promise((resolve, reject) => {
        canvas.toBlob((result) => {
          if (result) resolve(result);
          else reject(new Error('画布导出失败'));
        }, 'image/png');
      });
      const safeName = sanitizeFileName(fileName, 'board-canvas');
      if (download) {
        downloadBlob(blob, `${safeName}.png`);
      }
      return {
        exported: true,
        shapeCount: shapes.length,
        blob,
        fileName: `${safeName}.png`
      };
    }
  };
}

/**
 * 挂载白板。
 * @param {HTMLElement} target 容器
 * @param {object} options { onReady, onError, onChange, initialSnapshot }
 * @returns {{ api: object, destroy: () => void }}
 */
export function mountBoardCanvas(target, options = {}) {
  if (!target) {
    throw new Error('Board canvas target is required.');
  }

  let engine = null;
  let renderer = null;
  let ui = null;

  try {
    engine = new FeishuBoardEngine();
    ui = createFeishuBoardUi(target, engine, null);
    renderer = new FeishuBoardRenderer(ui.canvas);
    renderer.onImageLoaded = () => engine.requestRender();
    engine.attach(ui.canvas, renderer);

    if (typeof options.onChange === 'function') {
      engine.on('change', options.onChange);
    }

    if (options.initialSnapshot) {
      engine.loadSnapshot(options.initialSnapshot);
    }
  } catch (error) {
    if (typeof options.onError === 'function') {
      options.onError(error instanceof Error ? error : new Error('白板初始化失败'));
    }
    throw error;
  }

  const api = createBridgeApi(engine, renderer);

  if (typeof options.onReady === 'function') {
    const notifyReady = () => options.onReady();
    if (typeof queueMicrotask === 'function') queueMicrotask(notifyReady);
    else Promise.resolve().then(notifyReady);
  }

  return {
    api,
    destroy() {
      try {
        ui?.destroy();
      } catch {
        /* ignore */
      }
      renderer?.destroy();
      engine?.destroy();
      engine = null;
      renderer = null;
      ui = null;
    }
  };
}

/** 供单测使用的内部方法 */
export const __TEST__ = {
  resolveSvgSize,
  svgTextToDataUrl,
  sanitizeFileName,
  computeExportEntries,
  getConnectorGeometry
};
