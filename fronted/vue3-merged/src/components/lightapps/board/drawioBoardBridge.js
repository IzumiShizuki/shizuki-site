import { normalizeBoardSnapshot } from './boardTldrawMigrate';

const DEFAULT_EDITOR_URL = 'https://embed.diagrams.net/';
const DRAWIO_ENGINE = 'drawio';

export const EMPTY_DRAWIO_XML = [
  '<mxfile host="Shizuki" version="1">',
  '<diagram id="shizuki-page-1" name="Page-1">',
  '<mxGraphModel dx="1200" dy="800" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">',
  '<root><mxCell id="0"/><mxCell id="1" parent="0"/></root>',
  '</mxGraphModel>',
  '</diagram>',
  '</mxfile>'
].join('');

function escapeXml(value) {
  return String(value ?? '')
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
    .replace(/"/g, '&quot;')
    .replace(/'/g, '&apos;');
}

function finite(value, fallback = 0) {
  const number = Number(value);
  return Number.isFinite(number) ? number : fallback;
}

function sanitizeFileName(value, fallback = 'diagram') {
  const text = String(value || '')
    .trim()
    .replace(/[\\/:*?"<>|]+/g, '-')
    .replace(/\s+/g, '-');
  return text || fallback;
}

function geometryXml(shape) {
  return `<mxGeometry x="${finite(shape?.x)}" y="${finite(shape?.y)}" width="${Math.max(
    1,
    finite(shape?.w, 120)
  )}" height="${Math.max(1, finite(shape?.h, 60))}" as="geometry"/>`;
}

function dashStyle(value) {
  return String(value || '').toLowerCase() === 'solid' ? '' : 'dashed=1;';
}

function rotationStyle(value) {
  const degrees = Math.round((finite(value) * 180) / Math.PI);
  return degrees ? `rotation=${degrees};` : '';
}

function geoStyle(shape) {
  const props = shape?.props || {};
  const shapeStyles = {
    round: 'rounded=1;arcSize=18;',
    ellipse: 'ellipse;',
    diamond: 'rhombus;',
    triangle: 'triangle;',
    parallelogram: 'shape=parallelogram;perimeter=parallelogramPerimeter;',
    hexagon: 'shape=hexagon;perimeter=hexagonPerimeter2;',
    star: 'shape=mxgraph.basic.star;',
    cylinder: 'shape=cylinder3;boundedLbl=1;backgroundOutline=1;',
    bubble: 'shape=callout;perimeter=calloutPerimeter;'
  };
  return [
    'whiteSpace=wrap;html=0;',
    shapeStyles[props.geo] || 'rounded=0;',
    `fillColor=${props.fill === 'none' ? 'none' : props.fill || '#ffffff'};`,
    `strokeColor=${props.stroke || '#646a73'};`,
    `strokeWidth=${Math.max(1, finite(props.strokeWidth, 2))};`,
    `fontColor=${props.textColor || '#1f2329'};`,
    `fontSize=${Math.max(8, finite(props.fontSize, 14))};`,
    `align=${props.align || 'center'};verticalAlign=middle;`,
    dashStyle(props.dash),
    rotationStyle(shape?.rotation)
  ].join('');
}

function vertexXml(shape, id) {
  const props = shape?.props || {};
  let style = '';
  let value = props.text || '';

  if (shape.type === 'geo') {
    style = geoStyle(shape);
  } else if (shape.type === 'note') {
    style = `shape=note;whiteSpace=wrap;html=0;size=15;fillColor=${props.color || '#fff1a1'};strokeColor=none;fontColor=${
      props.textColor || '#1f2329'
    };fontSize=${Math.max(8, finite(props.fontSize, 14))};${rotationStyle(shape.rotation)}`;
  } else if (shape.type === 'text') {
    value = props.text || '';
    style = `text;html=0;strokeColor=none;fillColor=none;align=${props.align || 'left'};verticalAlign=middle;whiteSpace=wrap;rounded=0;fontColor=${
      props.color || '#1f2329'
    };fontSize=${Math.max(8, finite(props.fontSize, 16))};${rotationStyle(shape.rotation)}`;
  } else if (shape.type === 'image') {
    const source = String(props.src || '');
    style = `shape=image;verticalLabelPosition=bottom;verticalAlign=top;imageAspect=0;aspect=fixed;image=${encodeURIComponent(source)};${rotationStyle(
      shape.rotation
    )}`;
  } else {
    return '';
  }

  return `<mxCell id="${id}" value="${escapeXml(value)}" style="${escapeXml(style)}" vertex="1" parent="1">${geometryXml(
    shape
  )}</mxCell>`;
}

function edgeGeometryXml(shape) {
  const props = shape?.props || {};
  const points = Array.isArray(props.points) ? props.points : [];
  const absolutePoints = points.map(([x, y]) => ({
    x: finite(shape?.x) + finite(x),
    y: finite(shape?.y) + finite(y)
  }));
  if (absolutePoints.length < 2) {
    return '<mxGeometry relative="1" as="geometry"/>';
  }
  const source = absolutePoints[0];
  const target = absolutePoints[absolutePoints.length - 1];
  const middle = absolutePoints
    .slice(1, -1)
    .map((point) => `<mxPoint x="${point.x}" y="${point.y}"/>`)
    .join('');
  return `<mxGeometry relative="1" as="geometry"><mxPoint x="${source.x}" y="${source.y}" as="sourcePoint"/><mxPoint x="${
    target.x
  }" y="${target.y}" as="targetPoint"/>${middle ? `<Array as="points">${middle}</Array>` : ''}</mxGeometry>`;
}

function connectorGeometryXml(shape) {
  const props = shape?.props || {};
  const start = props.start || {};
  const end = props.end || {};
  const sourcePoint = start.shapeId ? '' : `<mxPoint x="${finite(start.x)}" y="${finite(start.y)}" as="sourcePoint"/>`;
  const targetPoint = end.shapeId ? '' : `<mxPoint x="${finite(end.x)}" y="${finite(end.y)}" as="targetPoint"/>`;
  return `<mxGeometry relative="1" as="geometry">${sourcePoint}${targetPoint}</mxGeometry>`;
}

function edgeXml(shape, id, idMap) {
  const props = shape?.props || {};
  const isDraw = shape.type === 'draw';
  if (!isDraw && shape.type !== 'connector') return '';

  const router =
    props.router === 'curve' ? 'curved=1;' : props.router === 'straight' ? 'edgeStyle=none;' : 'edgeStyle=orthogonalEdgeStyle;rounded=0;';
  const style = [
    isDraw ? 'edgeStyle=none;curved=1;' : router,
    'html=0;',
    `strokeColor=${props.stroke || '#646a73'};`,
    `strokeWidth=${Math.max(1, finite(props.strokeWidth, isDraw ? 3 : 2))};`,
    dashStyle(props.dash),
    `opacity=${Math.round(Math.max(0, Math.min(1, finite(props.opacity, 1))) * 100)};`,
    `startArrow=${isDraw || props.arrowStart === 'none' ? 'none' : props.arrowStart || 'none'};`,
    `endArrow=${isDraw || props.arrowEnd === 'none' ? 'none' : props.arrowEnd || 'classic'};`
  ].join('');
  const sourceId = !isDraw && props.start?.shapeId ? idMap.get(String(props.start.shapeId)) : '';
  const targetId = !isDraw && props.end?.shapeId ? idMap.get(String(props.end.shapeId)) : '';
  const terminals = `${sourceId ? ` source="${sourceId}"` : ''}${targetId ? ` target="${targetId}"` : ''}`;
  const geometry = isDraw ? edgeGeometryXml(shape) : connectorGeometryXml(shape);
  return `<mxCell id="${id}" value="${escapeXml(isDraw ? '' : props.text || '')}" style="${escapeXml(
    style
  )}" edge="1" parent="1"${terminals}>${geometry}</mxCell>`;
}

export function legacySnapshotToDrawioXml(snapshot) {
  const shapes = Array.isArray(snapshot?.shapes) ? snapshot.shapes : [];
  const idMap = new Map(shapes.map((shape, index) => [String(shape?.id || index), `legacy-${index + 2}`]));
  const cells = shapes
    .map((shape, index) => {
      const id = `legacy-${index + 2}`;
      return shape?.type === 'connector' || shape?.type === 'draw'
        ? edgeXml(shape, id, idMap)
        : vertexXml(shape, id);
    })
    .filter(Boolean)
    .join('');

  return [
    '<mxfile host="Shizuki" version="1">',
    '<diagram id="shizuki-migrated" name="Page-1">',
    '<mxGraphModel dx="1200" dy="800" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="0" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">',
    `<root><mxCell id="0"/><mxCell id="1" parent="0"/>${cells}</root>`,
    '</mxGraphModel>',
    '</diagram>',
    '</mxfile>'
  ].join('');
}

export function normalizeDrawioSnapshot(snapshot) {
  if (snapshot?.engine === DRAWIO_ENGINE && typeof snapshot.xml === 'string') {
    return { xml: snapshot.xml || EMPTY_DRAWIO_XML, migrated: false };
  }
  const legacySnapshot = normalizeBoardSnapshot(snapshot);
  if (Array.isArray(legacySnapshot?.shapes)) {
    return { xml: legacySnapshotToDrawioXml(legacySnapshot), migrated: true };
  }
  return { xml: EMPTY_DRAWIO_XML, migrated: false };
}

export function createDrawioEditorUrl(rawUrl, options = {}) {
  const base = String(rawUrl || DEFAULT_EDITOR_URL).trim() || DEFAULT_EDITOR_URL;
  const url = new URL(base, window.location.href);
  const params = {
    embed: '1',
    proto: 'json',
    spin: '1',
    libraries: options.readOnly ? '0' : '1',
    ui: options.readOnly ? 'min' : 'kennedy',
    noSaveBtn: '1',
    noExitBtn: '1'
  };
  Object.entries(params).forEach(([key, value]) => url.searchParams.set(key, value));
  if (options.readOnly) {
    url.searchParams.set('toolbar', '0');
    url.searchParams.set('sidebar', '0');
    url.searchParams.set('format', '0');
  }
  return url.toString();
}

function dataUrlToBlob(dataUrl) {
  const [header, payload = ''] = String(dataUrl || '').split(',', 2);
  const contentType = header.match(/^data:([^;,]+)/i)?.[1] || 'application/octet-stream';
  if (/;base64/i.test(header)) {
    const binary = atob(payload);
    const bytes = new Uint8Array(binary.length);
    for (let index = 0; index < binary.length; index += 1) bytes[index] = binary.charCodeAt(index);
    return new Blob([bytes], { type: contentType });
  }
  return new Blob([decodeURIComponent(payload)], { type: contentType });
}

function downloadBlob(blob, fileName) {
  const url = URL.createObjectURL(blob);
  const link = document.createElement('a');
  link.href = url;
  link.download = fileName;
  link.click();
  URL.revokeObjectURL(url);
}

export function mountDrawioCanvas(target, options = {}) {
  if (!target) throw new Error('Draw.io mount target is required.');

  const readOnly = options.readOnly === true;
  const configuredUrl =
    options.editorUrl || (typeof import.meta !== 'undefined' ? import.meta.env?.VITE_DRAWIO_EDITOR_URL : '') || DEFAULT_EDITOR_URL;
  const editorUrl = createDrawioEditorUrl(configuredUrl, { readOnly });
  const editorOrigin = new URL(editorUrl).origin;
  const iframe = document.createElement('iframe');
  iframe.className = 'drawio-editor-frame';
  iframe.title = readOnly ? 'draw.io diagram viewer' : 'draw.io diagram editor';
  iframe.src = editorUrl;
  iframe.setAttribute('frameborder', '0');
  iframe.setAttribute('allow', 'clipboard-read; clipboard-write');
  Object.assign(iframe.style, {
    width: '100%',
    height: '100%',
    border: '0',
    display: 'block',
    background: '#ffffff'
  });

  let destroyed = false;
  let ready = false;
  let currentXml = normalizeDrawioSnapshot(options.initialSnapshot).xml;
  let ignoreChangeUntil = 0;
  let pendingExport = null;
  const startupTimer = window.setTimeout(() => {
    if (!ready && !destroyed) {
      options.onError?.(new Error('draw.io 加载超时，请检查网络或配置自托管的 VITE_DRAWIO_EDITOR_URL'));
    }
  }, 20000);

  const post = (message) => {
    if (!destroyed && iframe.contentWindow) {
      iframe.contentWindow.postMessage(JSON.stringify(message), editorOrigin);
    }
  };

  const loadXml = (xml) => {
    currentXml = String(xml || EMPTY_DRAWIO_XML);
    ignoreChangeUntil = Date.now() + 350;
    if (ready) {
      post({
        action: 'load',
        autosave: readOnly ? 0 : 1,
        xml: currentXml,
        title: String(options.title || 'Shizuki Diagram'),
        modified: 'unsavedChanges'
      });
    }
  };

  const finishExport = (message) => {
    if (!pendingExport) return;
    const pending = pendingExport;
    pendingExport = null;
    window.clearTimeout(pending.timer);
    if (!message?.data) {
      pending.reject(new Error('draw.io 未返回导出数据'));
      return;
    }
    pending.resolve(message.data);
  };

  const onMessage = (event) => {
    if (destroyed || event.source !== iframe.contentWindow || event.origin !== editorOrigin) return;
    let message;
    try {
      message = typeof event.data === 'string' ? JSON.parse(event.data) : event.data;
    } catch {
      return;
    }
    if (!message || typeof message !== 'object') return;

    if (message.event === 'init') {
      window.clearTimeout(startupTimer);
      ready = true;
      loadXml(currentXml);
      options.onReady?.();
      return;
    }
    if (message.event === 'autosave' || message.event === 'save') {
      if (readOnly || typeof message.xml !== 'string') return;
      const changed = currentXml !== message.xml;
      currentXml = message.xml;
      if (changed && Date.now() >= ignoreChangeUntil) options.onChange?.({ xml: currentXml });
      return;
    }
    if (message.event === 'export') finishExport(message);
  };

  window.addEventListener('message', onMessage);
  target.replaceChildren(iframe);

  const requestExport = (format, exportOptions = {}) =>
    new Promise((resolve, reject) => {
      if (!ready) {
        reject(new Error('draw.io 尚未准备好'));
        return;
      }
      if (pendingExport) {
        reject(new Error('已有 draw.io 导出任务正在进行'));
        return;
      }
      const timer = window.setTimeout(() => {
        if (!pendingExport) return;
        pendingExport = null;
        reject(new Error('draw.io 导出超时'));
      }, 20000);
      pendingExport = { resolve, reject, timer };
      post({
        action: 'export',
        format,
        xml: currentXml,
        spinKey: 'export',
        border: 16,
        transparent: exportOptions.background === 'transparent',
        background: exportOptions.background === 'transparent' ? 'none' : '#ffffff'
      });
    });

  const api = {
    isReady: () => ready && !destroyed,
    getSelectedShapeCount: () => 0,
    getSnapshot: () => ({ version: 1, engine: DRAWIO_ENGINE, format: 'xml', xml: currentXml }),
    loadSnapshot(snapshot) {
      const normalized = normalizeDrawioSnapshot(snapshot);
      loadXml(normalized.xml);
      return normalized;
    },
    clear() {
      loadXml(EMPTY_DRAWIO_XML);
    },
    zoomToFit() {
      post({ action: 'fit', border: 12 });
      return true;
    },
    async exportPng(_scope = 'board', background = 'white', fileName = 'diagram', exportOptions = {}) {
      const dataUrl = await requestExport('png', { background });
      const blob = dataUrlToBlob(dataUrl);
      const safeName = `${sanitizeFileName(fileName)}.png`;
      if (exportOptions.download !== false) downloadBlob(blob, safeName);
      return { exported: true, shapeCount: 1, blob, fileName: safeName };
    },
    exportDrawio(fileName = 'diagram') {
      const blob = new Blob([currentXml], { type: 'application/vnd.jgraph.mxfile' });
      const safeName = `${sanitizeFileName(fileName)}.drawio`;
      downloadBlob(blob, safeName);
      return { exported: true, blob, fileName: safeName };
    }
  };

  return {
    api,
    destroy() {
      if (destroyed) return;
      destroyed = true;
      ready = false;
      window.clearTimeout(startupTimer);
      window.removeEventListener('message', onMessage);
      if (pendingExport) {
        window.clearTimeout(pendingExport.timer);
        pendingExport.reject(new Error('draw.io 已关闭'));
        pendingExport = null;
      }
      iframe.remove();
    }
  };
}

export function mountDrawioViewer(target, options = {}) {
  const bridge = mountDrawioCanvas(target, {
    ...options,
    readOnly: true,
    initialSnapshot: options.snapshot
  });
  return {
    isReady: bridge.api.isReady,
    zoomToFit: bridge.api.zoomToFit,
    destroy: bridge.destroy
  };
}

export const __TEST__ = {
  escapeXml,
  sanitizeFileName,
  vertexXml,
  edgeXml
};
