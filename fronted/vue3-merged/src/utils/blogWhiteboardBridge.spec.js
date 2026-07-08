import { describe, expect, it, vi } from 'vitest';
import {
  BLOG_WHITEBOARD_EXPORT_EVENT,
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
});
