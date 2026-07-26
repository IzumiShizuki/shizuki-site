/**
 * boardViewerBridge.jsx
 * 博客互动白板只读查看器（自研引擎版）。
 * 兼容 v2 快照与旧版 tldraw 快照（自动迁移），不再依赖 tldraw / React，
 * 也不再需要 License Key。保留原有导出接口：
 *   getWhiteboardViewerAvailability() / mountWhiteboardViewer(target, options)
 */

import { FeishuBoardEngine } from './feishuBoardEngine';
import { FeishuBoardRenderer } from './feishuBoardRenderer';

export function getWhiteboardViewerAvailability() {
  return { supported: true, reason: 'self-engine' };
}

export function mountWhiteboardViewer(target, options = {}) {
  if (!target) {
    throw new Error('mount target is required');
  }

  let destroyed = false;
  let engine = null;
  let renderer = null;

  const host = document.createElement('div');
  host.className = 'whiteboard-viewer-host';
  host.style.position = 'relative';
  host.style.width = '100%';
  host.style.height = '100%';
  host.style.overflow = 'hidden';
  host.style.background = '#ffffff';

  const canvas = document.createElement('canvas');
  canvas.style.position = 'absolute';
  canvas.style.inset = '0';
  canvas.style.width = '100%';
  canvas.style.height = '100%';
  canvas.style.display = 'block';
  canvas.style.touchAction = 'none';
  canvas.style.cursor = 'grab';
  host.appendChild(canvas);
  target.appendChild(host);

  const disposers = [];
  const listen = (node, event, handler, opts) => {
    node.addEventListener(event, handler, opts);
    disposers.push(() => node.removeEventListener(event, handler, opts));
  };

  try {
    engine = new FeishuBoardEngine();
    renderer = new FeishuBoardRenderer(canvas);
    renderer.onImageLoaded = () => engine.requestRender();
    engine.attach(canvas, renderer);
    engine.setTool('hand');

    if (options.snapshot && typeof options.snapshot === 'object') {
      engine.loadSnapshot(options.snapshot);
    }
    engine.zoomToFit();

    // 只读交互：拖拽平移 + 滚轮缩放/平移
    const pointerPosition = (event) => {
      const rect = canvas.getBoundingClientRect();
      return { x: event.clientX - rect.left, y: event.clientY - rect.top };
    };

    let panning = null;
    listen(canvas, 'pointerdown', (event) => {
      canvas.setPointerCapture(event.pointerId);
      panning = pointerPosition(event);
      canvas.style.cursor = 'grabbing';
    });
    listen(canvas, 'pointermove', (event) => {
      if (!panning) return;
      const next = pointerPosition(event);
      engine.panBy(next.x - panning.x, next.y - panning.y);
      panning = next;
    });
    const stopPan = (event) => {
      if (event && event.pointerId !== undefined) {
        try {
          canvas.releasePointerCapture(event.pointerId);
        } catch {
          /* ignore */
        }
      }
      panning = null;
      canvas.style.cursor = 'grab';
    };
    listen(canvas, 'pointerup', stopPan);
    listen(canvas, 'pointercancel', stopPan);
    listen(
      canvas,
      'wheel',
      (event) => {
        event.preventDefault();
        engine.handleWheel(pointerPosition(event), event.deltaX, event.deltaY, event.ctrlKey || event.metaKey, event.shiftKey);
      },
      { passive: false }
    );

    let resizeObserver = null;
    if (typeof ResizeObserver === 'function') {
      resizeObserver = new ResizeObserver(() => {
        const rect = host.getBoundingClientRect();
        if (rect.width > 4 && rect.height > 4) {
          engine.setViewportSize(rect.width, rect.height);
        }
      });
      resizeObserver.observe(host);
      disposers.push(() => resizeObserver.disconnect());
    }
    const rect = host.getBoundingClientRect();
    if (rect.width > 4 && rect.height > 4) {
      engine.setViewportSize(rect.width, rect.height);
      engine.zoomToFit();
    }

    if (typeof options.onReady === 'function') {
      const notify = () => options.onReady(engine);
      if (typeof queueMicrotask === 'function') queueMicrotask(notify);
      else Promise.resolve().then(notify);
    }
  } catch (error) {
    if (typeof options.onError === 'function') {
      options.onError(error instanceof Error ? error : new Error('白板快照加载失败'));
    }
    host.innerHTML =
      '<div class="whiteboard-viewer-fallback" role="alert"><strong>互动白板加载失败</strong><p>画布初始化异常，请刷新页面后重试。</p></div>';
  }

  return {
    isReady() {
      return Boolean(engine && !destroyed);
    },
    zoomToFit() {
      if (!engine || destroyed) return false;
      try {
        engine.zoomToFit();
        return true;
      } catch {
        return false;
      }
    },
    destroy() {
      if (destroyed) return;
      destroyed = true;
      disposers.forEach((dispose) => {
        try {
          dispose();
        } catch {
          /* ignore */
        }
      });
      renderer?.destroy();
      engine?.destroy();
      engine = null;
      renderer = null;
      host.remove();
    }
  };
}
