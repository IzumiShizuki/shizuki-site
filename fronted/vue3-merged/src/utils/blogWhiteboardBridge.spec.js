import { describe, expect, it, vi } from 'vitest';
import {
  BLOG_WHITEBOARD_EXPORT_EVENT,
  BLOG_WHITEBOARD_TARGET_EMBED,
  emitBlogWhiteboardExport,
  onBlogWhiteboardExport
} from './blogWhiteboardBridge';

describe('blogWhiteboardBridge', () => {
  it('emits normalized whiteboard payloads to listeners', () => {
    const listener = vi.fn();
    const release = onBlogWhiteboardExport(listener);
    const blob = new Blob(['demo'], { type: 'image/png' });

    const emitted = emitBlogWhiteboardExport({
      target: 'cover',
      blob,
      fileName: 'board.png',
      boardId: 7,
      boardTitle: 'System Map'
    });

    release();

    expect(emitted).toBe(true);
    expect(listener).toHaveBeenCalledTimes(1);
    expect(listener.mock.calls[0][0]).toEqual({
      target: 'cover',
      blob,
      snapshot: null,
      background: '',
      fileName: 'board.png',
      boardId: 7,
      boardTitle: 'System Map'
    });
  });

  it('ignores invalid payloads that do not contain blobs', () => {
    const handler = vi.fn();
    const domHandler = vi.fn();
    window.addEventListener(BLOG_WHITEBOARD_EXPORT_EVENT, domHandler);
    const release = onBlogWhiteboardExport(handler);

    const emitted = emitBlogWhiteboardExport({
      target: 'inline',
      fileName: 'missing.png'
    });

    release();
    window.removeEventListener(BLOG_WHITEBOARD_EXPORT_EVENT, domHandler);

    expect(emitted).toBe(false);
    expect(handler).not.toHaveBeenCalled();
    expect(domHandler).not.toHaveBeenCalled();
  });

  it('emits embed payloads with snapshots and optional preview blobs', () => {
    const listener = vi.fn();
    const release = onBlogWhiteboardExport(listener);
    const snapshot = { document: { store: {} } };

    const emitted = emitBlogWhiteboardExport({
      target: BLOG_WHITEBOARD_TARGET_EMBED,
      snapshot,
      background: 'White',
      boardId: 3,
      boardTitle: 'Embed Map'
    });

    release();

    expect(emitted).toBe(true);
    expect(listener).toHaveBeenCalledTimes(1);
    expect(listener.mock.calls[0][0]).toEqual({
      target: BLOG_WHITEBOARD_TARGET_EMBED,
      blob: null,
      snapshot,
      background: 'white',
      fileName: 'blog-embed-whiteboard.png',
      boardId: 3,
      boardTitle: 'Embed Map'
    });
  });

  it('rejects embed payloads without snapshots', () => {
    const listener = vi.fn();
    const release = onBlogWhiteboardExport(listener);

    const emitted = emitBlogWhiteboardExport({
      target: BLOG_WHITEBOARD_TARGET_EMBED,
      blob: new Blob(['x'], { type: 'image/png' })
    });

    release();

    expect(emitted).toBe(false);
    expect(listener).not.toHaveBeenCalled();
  });
});
