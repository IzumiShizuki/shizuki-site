import { describe, expect, it, vi } from 'vitest';
import { parseWhiteboardEmbedSource, renderMarkdownDocument } from './blogMarkdown';
import {
  buildWhiteboardEmbedMarkdown,
  createWhiteboardEmbedMarkdown,
  decodeWhiteboardSnapshot,
  encodeWhiteboardSnapshot,
  hydrateWhiteboardEmbeds
} from './blogWhiteboardEmbed';

const SAMPLE_SNAPSHOT = {
  document: {
    store: {
      'shape:demo': { id: 'shape:demo', type: 'geo', x: 10, y: 20 }
    },
    schema: { schemaVersion: 2 }
  },
  session: { currentPageId: 'page:page' }
};

function flushAsync(times = 4) {
  let chain = Promise.resolve();
  for (let index = 0; index < times; index += 1) {
    chain = chain.then(() => new Promise((resolve) => setTimeout(resolve, 0)));
  }
  return chain;
}

describe('blogWhiteboardEmbed', () => {
  it('encodes and decodes snapshots losslessly and drops session state', async () => {
    const encoded = await encodeWhiteboardSnapshot(SAMPLE_SNAPSHOT);
    expect(encoded.chunks.length).toBeGreaterThan(0);
    expect(encoded.encoding).toMatch(/base64/);

    const decoded = await decodeWhiteboardSnapshot(encoded);
    expect(decoded.document).toEqual(SAMPLE_SNAPSHOT.document);
    expect(decoded.session).toBeUndefined();
  });

  it('builds whiteboard fence markdown that the renderer understands', async () => {
    const markdown = await createWhiteboardEmbedMarkdown({
      snapshot: SAMPLE_SNAPSHOT,
      title: '系统架构',
      preview: 'https://cdn.example.com/wb.png',
      background: 'white'
    });

    expect(markdown).toContain('```whiteboard');
    const rendered = renderMarkdownDocument(markdown);
    expect(rendered.html).toContain('data-wb-state="static"');
    expect(rendered.html).toContain('系统架构');

    const fenceBody = markdown.split('```whiteboard')[1].split('```')[0].trim();
    const payload = parseWhiteboardEmbedSource(fenceBody);
    expect(payload).not.toBeNull();
    const decoded = await decodeWhiteboardSnapshot(payload);
    expect(decoded.document).toEqual(SAMPLE_SNAPSHOT.document);
  });

  it('rejects embeds without data chunks', () => {
    expect(() => buildWhiteboardEmbedMarkdown({ title: 'x', chunks: [] })).toThrow();
  });

  it('hydrates static embeds and mounts the viewer on demand', async () => {
    const markdown = await createWhiteboardEmbedMarkdown({ snapshot: SAMPLE_SNAPSHOT, title: '演示白板' });
    const host = document.createElement('div');
    host.innerHTML = renderMarkdownDocument(markdown).html;
    document.body.appendChild(host);

    const destroy = vi.fn();
    const zoomToFit = vi.fn();
    const mountWhiteboardViewer = vi.fn(() => ({ destroy, zoomToFit, isReady: () => true }));
    const loadViewerModule = vi.fn(async () => ({
      mountWhiteboardViewer,
      getWhiteboardViewerAvailability: () => ({ supported: true })
    }));

    const release = hydrateWhiteboardEmbeds(host, { loadViewerModule });
    const section = host.querySelector('section.md-whiteboard-embed');
    expect(section.dataset.wbState).toBe('ready');

    const loadButton = section.querySelector('.md-whiteboard-load');
    expect(loadButton).toBeTruthy();
    loadButton.click();
    await flushAsync();

    expect(loadViewerModule).toHaveBeenCalledTimes(1);
    expect(mountWhiteboardViewer).toHaveBeenCalledTimes(1);
    expect(section.dataset.wbState).toBe('active');
    expect(mountWhiteboardViewer.mock.calls[0][1].snapshot.document).toEqual(SAMPLE_SNAPSHOT.document);

    const closeButton = Array.from(section.querySelectorAll('.md-whiteboard-tool-btn')).find(
      (button) => button.textContent === '收起画布'
    );
    closeButton.click();
    expect(destroy).toHaveBeenCalledTimes(1);
    expect(section.dataset.wbState).toBe('ready');

    release();
    host.remove();
  });

  it('reports viewer errors through onError and stays recoverable', async () => {
    const markdown = await createWhiteboardEmbedMarkdown({ snapshot: SAMPLE_SNAPSHOT, title: '错误白板' });
    const host = document.createElement('div');
    host.innerHTML = renderMarkdownDocument(markdown).html;
    document.body.appendChild(host);

    const onError = vi.fn();
    const loadViewerModule = vi.fn(async () => {
      throw new Error('load failed');
    });

    hydrateWhiteboardEmbeds(host, { loadViewerModule, onError });
    host.querySelector('.md-whiteboard-load').click();
    await flushAsync();

    expect(onError).toHaveBeenCalledTimes(1);
    const section = host.querySelector('section.md-whiteboard-embed');
    expect(section.dataset.wbState).toBe('ready');
    host.remove();
  });
});
