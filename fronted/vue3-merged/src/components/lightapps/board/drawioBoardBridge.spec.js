import { describe, expect, it } from 'vitest';
import { deflateRawSync } from 'node:zlib';
import {
  __TEST__,
  EMPTY_DRAWIO_XML,
  createDrawioEditorUrl,
  legacySnapshotToDrawioXml,
  normalizeDrawioSnapshot
} from './drawioBoardBridge';

describe('drawioBoardBridge', () => {
  function compressDiagram(xml) {
    return deflateRawSync(Buffer.from(encodeURIComponent(xml))).toString('base64');
  }

  it('builds an embed-mode editor URL', () => {
    const url = new URL(createDrawioEditorUrl('https://example.com/drawio/'));
    expect(url.origin).toBe('https://example.com');
    expect(url.searchParams.get('embed')).toBe('1');
    expect(url.searchParams.get('proto')).toBe('json');
    expect(url.searchParams.get('libraries')).toBe('1');
  });

  it('keeps native draw.io snapshots unchanged', () => {
    const snapshot = { engine: 'drawio', xml: '<mxfile />' };
    expect(normalizeDrawioSnapshot(snapshot)).toEqual({ xml: '<mxfile />', migrated: false });
  });

  it('converts legacy vertices and connected edges to draw.io XML', () => {
    const xml = legacySnapshotToDrawioXml({
      shapes: [
        {
          id: 'a',
          type: 'geo',
          x: 10,
          y: 20,
          w: 160,
          h: 80,
          props: { geo: 'round', text: 'A & B', fill: '#ffffff', stroke: '#3370ff' }
        },
        {
          id: 'b',
          type: 'note',
          x: 260,
          y: 20,
          w: 180,
          h: 120,
          props: { text: 'Note', color: '#fff1a1' }
        },
        {
          id: 'edge',
          type: 'connector',
          props: {
            start: { shapeId: 'a' },
            end: { shapeId: 'b' },
            arrowEnd: 'arrow',
            text: 'next'
          }
        }
      ]
    });

    expect(xml).toContain('<mxfile');
    expect(xml).toContain('value="A &amp; B"');
    expect(xml).toContain('source="legacy-2"');
    expect(xml).toContain('target="legacy-3"');
    expect(xml).toContain('edge="1"');
  });

  it('returns an empty native document for missing content', () => {
    expect(normalizeDrawioSnapshot(null)).toEqual({ xml: EMPTY_DRAWIO_XML, migrated: false });
  });

  it('applies white and transparent canvas backgrounds to the current document', () => {
    const transparent = __TEST__.applyCanvasBackground(EMPTY_DRAWIO_XML, 'transparent');
    const white = __TEST__.applyCanvasBackground(transparent, 'white');

    expect(transparent).toContain('background="none"');
    expect(transparent).toContain('page="0"');
    expect(white).toContain('background="#ffffff"');
    expect(white).toContain('page="1"');
    expect(white).not.toContain('background="none"');
  });

  it('patches compressed draw.io content without reopening the editor', async () => {
    const model = '<mxGraphModel page="1"><root><mxCell id="0"/></root></mxGraphModel>';
    const payload = compressDiagram(model);
    const compressed = `<mxfile><diagram id="page-1">${payload}</diagram></mxfile>`;
    const result = await __TEST__.applyCanvasBackgroundDocument(compressed, 'transparent');

    expect(result).toContain('<mxGraphModel');
    expect(result).toContain('page="0"');
    expect(result).toContain('background="none"');
  });

  it('migrates old tldraw store snapshots before creating draw.io XML', () => {
    const result = normalizeDrawioSnapshot({
      store: {
        'shape:legacy': {
          id: 'shape:legacy',
          typeName: 'shape',
          type: 'geo',
          x: 40,
          y: 50,
          index: 'a1',
          props: {
            geo: 'rectangle',
            w: 180,
            h: 90,
            text: 'Legacy'
          }
        }
      }
    });

    expect(result.migrated).toBe(true);
    expect(result.xml).toContain('value="Legacy"');
    expect(result.xml).toContain('width="180"');
  });
});
