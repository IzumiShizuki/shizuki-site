import { parseWhiteboardEmbedSource, WHITEBOARD_FENCE_LANG } from './blogMarkdown';

export const WHITEBOARD_EMBED_ENCODING_DEFLATE = 'deflate-raw+base64';
export const WHITEBOARD_EMBED_ENCODING_JSON = 'json+base64';

const BASE64_CHUNK_LINE_LENGTH = 96;
const MAX_SNAPSHOT_JSON_BYTES = 4 * 1024 * 1024;

function textToBytes(text) {
  return new TextEncoder().encode(String(text || ''));
}

function bytesToText(bytes) {
  return new TextDecoder().decode(bytes);
}

function bytesToBase64(bytes) {
  let binary = '';
  const step = 0x8000;
  for (let index = 0; index < bytes.length; index += step) {
    binary += String.fromCharCode.apply(null, bytes.subarray(index, index + step));
  }
  if (typeof btoa === 'function') {
    return btoa(binary);
  }
  // eslint-disable-next-line no-undef
  return Buffer.from(bytes).toString('base64');
}

function base64ToBytes(base64) {
  const normalized = String(base64 || '').replace(/\s+/g, '');
  if (typeof atob === 'function') {
    const binary = atob(normalized);
    const bytes = new Uint8Array(binary.length);
    for (let index = 0; index < binary.length; index += 1) {
      bytes[index] = binary.charCodeAt(index);
    }
    return bytes;
  }
  // eslint-disable-next-line no-undef
  return new Uint8Array(Buffer.from(normalized, 'base64'));
}

function supportsDeflateStreams() {
  return typeof CompressionStream === 'function' && typeof DecompressionStream === 'function';
}

async function pipeThroughStream(bytes, stream) {
  const source = new Blob([bytes]).stream().pipeThrough(stream);
  const buffer = await new Response(source).arrayBuffer();
  return new Uint8Array(buffer);
}

async function deflateBytes(bytes) {
  return pipeThroughStream(bytes, new CompressionStream('deflate-raw'));
}

async function inflateBytes(bytes) {
  return pipeThroughStream(bytes, new DecompressionStream('deflate-raw'));
}

function splitBase64IntoChunks(base64) {
  const chunks = [];
  for (let index = 0; index < base64.length; index += BASE64_CHUNK_LINE_LENGTH) {
    chunks.push(base64.slice(index, index + BASE64_CHUNK_LINE_LENGTH));
  }
  return chunks;
}

function sanitizeSnapshotForEmbed(snapshot) {
  if (!snapshot || typeof snapshot !== 'object') {
    throw new Error('白板快照为空，无法嵌入');
  }
  if (snapshot.document && typeof snapshot.document === 'object') {
    return { document: snapshot.document };
  }
  return snapshot;
}

export async function encodeWhiteboardSnapshot(snapshot) {
  const jsonText = JSON.stringify(sanitizeSnapshotForEmbed(snapshot));
  const jsonBytes = textToBytes(jsonText);
  if (jsonBytes.length > MAX_SNAPSHOT_JSON_BYTES) {
    throw new Error('白板内容过大（超过 4MB），请拆分后再嵌入');
  }

  if (supportsDeflateStreams()) {
    try {
      const compressed = await deflateBytes(jsonBytes);
      return {
        encoding: WHITEBOARD_EMBED_ENCODING_DEFLATE,
        chunks: splitBase64IntoChunks(bytesToBase64(compressed))
      };
    } catch {
      // fall back to uncompressed payload below
    }
  }

  return {
    encoding: WHITEBOARD_EMBED_ENCODING_JSON,
    chunks: splitBase64IntoChunks(bytesToBase64(jsonBytes))
  };
}

export async function decodeWhiteboardSnapshot(payload) {
  const encoding = String(payload?.encoding || '').trim().toLowerCase();
  const chunks = Array.isArray(payload?.chunks) ? payload.chunks : [];
  const base64 = chunks.map((chunk) => String(chunk || '').trim()).join('');
  if (!base64) {
    throw new Error('白板数据为空');
  }

  const bytes = base64ToBytes(base64);
  let jsonText = '';
  if (encoding === WHITEBOARD_EMBED_ENCODING_DEFLATE) {
    if (!supportsDeflateStreams()) {
      throw new Error('当前浏览器不支持解压白板数据，请更新浏览器');
    }
    jsonText = bytesToText(await inflateBytes(bytes));
  } else if (encoding === WHITEBOARD_EMBED_ENCODING_JSON || encoding === '') {
    jsonText = bytesToText(bytes);
  } else {
    throw new Error(`不支持的白板数据编码：${encoding}`);
  }

  const snapshot = JSON.parse(jsonText);
  if (!snapshot || typeof snapshot !== 'object') {
    throw new Error('白板数据内容异常');
  }
  return snapshot;
}

export function buildWhiteboardEmbedMarkdown({ title = '', preview = '', background = '', encoding, chunks } = {}) {
  const normalizedChunks = Array.isArray(chunks) ? chunks.map((chunk) => String(chunk || '').trim()).filter(Boolean) : [];
  if (!normalizedChunks.length) {
    throw new Error('白板数据编码失败');
  }

  const payload = {
    version: 1,
    title: String(title || '').trim(),
    preview: String(preview || '').trim(),
    background: String(background || '').trim(),
    encoding: String(encoding || WHITEBOARD_EMBED_ENCODING_JSON),
    chunks: normalizedChunks
  };

  const json = JSON.stringify(payload, null, 2);
  return `\n\n\`\`\`${WHITEBOARD_FENCE_LANG}\n${json}\n\`\`\`\n`;
}

export async function createWhiteboardEmbedMarkdown({ snapshot, title = '', preview = '', background = '' } = {}) {
  const encoded = await encodeWhiteboardSnapshot(snapshot);
  return buildWhiteboardEmbedMarkdown({
    title,
    preview,
    background,
    encoding: encoded.encoding,
    chunks: encoded.chunks
  });
}

function defaultLoadViewerModule() {
  return import('../components/lightapps/board/boardViewerBridge.jsx');
}

function createElement(tag, className, text) {
  const node = document.createElement(tag);
  if (className) node.className = className;
  if (text != null) node.textContent = text;
  return node;
}

function createIcon(iconClass) {
  const icon = document.createElement('i');
  icon.className = iconClass;
  icon.setAttribute('aria-hidden', 'true');
  return icon;
}

function readEmbedSource(section) {
  const template = section.querySelector('template.md-whiteboard-data');
  const content = template?.content;
  return String(content ? content.textContent : template?.textContent || '').trim();
}

function buildViewerToolbar({ title, onFit, onClose }) {
  const toolbar = createElement('div', 'md-whiteboard-toolbar');

  const label = createElement('span', 'md-whiteboard-toolbar-title');
  label.appendChild(createIcon('fas fa-chalkboard'));
  label.appendChild(document.createTextNode(` ${title || '互动白板'}`));
  toolbar.appendChild(label);

  const actions = createElement('span', 'md-whiteboard-toolbar-actions');

  const fitButton = createElement('button', 'md-whiteboard-tool-btn', '适配视图');
  fitButton.type = 'button';
  fitButton.addEventListener('click', onFit);
  actions.appendChild(fitButton);

  const closeButton = createElement('button', 'md-whiteboard-tool-btn', '收起画布');
  closeButton.type = 'button';
  closeButton.addEventListener('click', onClose);
  actions.appendChild(closeButton);

  toolbar.appendChild(actions);
  return toolbar;
}

export function hydrateWhiteboardEmbeds(root, options = {}) {
  if (!root || typeof root.querySelectorAll !== 'function' || typeof document === 'undefined') {
    return () => {};
  }

  const loadViewerModule = typeof options.loadViewerModule === 'function' ? options.loadViewerModule : defaultLoadViewerModule;
  const mounted = new Set();
  const sections = Array.from(root.querySelectorAll('section.md-whiteboard-embed[data-wb-state="static"]'));

  sections.forEach((section) => {
    const source = readEmbedSource(section);
    const payload = parseWhiteboardEmbedSource(source);
    if (!payload) return;

    const stage = section.querySelector('.md-whiteboard-stage');
    if (!stage) return;

    section.dataset.wbState = 'ready';

    const loadButton = createElement('button', 'md-whiteboard-load ripple-trigger');
    loadButton.type = 'button';
    loadButton.appendChild(createIcon('fas fa-play'));
    loadButton.appendChild(document.createTextNode(' 加载互动白板'));
    stage.appendChild(loadButton);

    let instance = null;
    let viewerWrap = null;

    function teardownViewer() {
      if (instance) {
        try {
          instance.destroy();
        } catch {
          // ignore unmount failures
        }
        mounted.delete(instance);
        instance = null;
      }
      if (viewerWrap) {
        viewerWrap.remove();
        viewerWrap = null;
      }
      stage.hidden = false;
      section.dataset.wbState = 'ready';
    }

    async function activateViewer() {
      if (section.dataset.wbState === 'loading' || section.dataset.wbState === 'active') return;
      section.dataset.wbState = 'loading';
      loadButton.disabled = true;
      loadButton.textContent = '';
      loadButton.appendChild(createIcon('fas fa-spinner fa-spin'));
      loadButton.appendChild(document.createTextNode(' 正在加载画布...'));

      try {
        const [viewerModule, snapshot] = await Promise.all([loadViewerModule(), decodeWhiteboardSnapshot(payload)]);
        if (!section.isConnected) return;

        const availability = viewerModule.getWhiteboardViewerAvailability?.();
        if (availability && availability.supported === false) {
          throw new Error('当前站点缺少 tldraw license key，无法加载互动白板');
        }

        viewerWrap = createElement('div', 'md-whiteboard-viewer');
        const canvasHost = createElement('div', 'md-whiteboard-viewer-canvas');
        viewerWrap.appendChild(
          buildViewerToolbar({
            title: payload.title,
            onFit: () => {
              instance?.zoomToFit?.();
            },
            onClose: teardownViewer
          })
        );
        viewerWrap.appendChild(canvasHost);
        if (payload.background === 'transparent') {
          viewerWrap.dataset.wbBackground = 'transparent';
        }
        section.appendChild(viewerWrap);

        instance = viewerModule.mountWhiteboardViewer(canvasHost, {
          snapshot,
          onError: () => {
            teardownViewer();
          }
        });
        mounted.add(instance);
        stage.hidden = true;
        section.dataset.wbState = 'active';
      } catch (error) {
        teardownViewer();
        section.dataset.wbState = 'ready';
        let errorText = stage.querySelector('.md-whiteboard-error-text');
        if (!errorText) {
          errorText = createElement('p', 'md-whiteboard-error-text');
          stage.appendChild(errorText);
        }
        errorText.textContent = String(error?.message || '互动白板加载失败，请重试');
        if (typeof options.onError === 'function') {
          options.onError(error);
        }
      } finally {
        loadButton.disabled = false;
        loadButton.textContent = '';
        loadButton.appendChild(createIcon('fas fa-play'));
        loadButton.appendChild(document.createTextNode(' 加载互动白板'));
      }
    }

    loadButton.addEventListener('click', activateViewer);
  });

  return function releaseWhiteboardEmbeds() {
    mounted.forEach((instance) => {
      try {
        instance.destroy();
      } catch {
        // ignore unmount failures
      }
    });
    mounted.clear();
  };
}
