import { afterEach, describe, expect, it, vi } from 'vitest';
import {
  buildKjToolSandboxDocument,
  describeKjToolSourceError,
  fetchKjToolCatalog,
  fetchKjToolDetail,
  normalizeKjCatalog,
  normalizeKjToolDetail,
  safeKjToolUrl
} from './kjToolSourceApi';
import { HttpError } from '../../../services/httpClient';

function jsonResponse(payload, status = 200) {
  return new Response(JSON.stringify(payload), {
    status,
    headers: { 'Content-Type': status >= 400 ? 'application/problem+json' : 'application/json' }
  });
}

afterEach(() => {
  vi.unstubAllGlobals();
});

describe('kjToolSourceApi', () => {
  it('normalizes snake_case catalog fields and compatibility', () => {
    const catalog = normalizeKjCatalog({
      enabled: true,
      source_name: 'KJ 应用社区',
      source_home_url: 'https://kj.sgguo.com/',
      categories: [{ id: 'efficiency', name: '效率工具' }],
      tools: [
        { id: 'clock-1', name: '时钟', type: 'code', compatible: true, launch_mode: 'document', downloads: 5 },
        { id: 'python-1', type: 'plugin-python', compatible: false, incompatible_reason: '不支持 Python' }
      ]
    });

    expect(catalog.sourceName).toBe('KJ 应用社区');
    expect(catalog.tools[0]).toMatchObject({ id: 'clock-1', launchMode: 'document', compatible: true });
    expect(catalog.tools[1]).toMatchObject({ compatible: false, incompatibleReason: '不支持 Python' });
  });

  it('validates external URLs and detail payloads', () => {
    expect(safeKjToolUrl('https://example.com/tool')).toBe('https://example.com/tool');
    expect(safeKjToolUrl('javascript:alert(1)')).toBe('');
    expect(normalizeKjToolDetail({
      id: 'site-1',
      compatible: true,
      launch_mode: 'website',
      url: 'javascript:alert(1)'
    }).compatible).toBe(false);
  });

  it('builds an opaque-origin sandbox document with CSP and escaped closing tags', () => {
    const documentText = buildKjToolSandboxDocument({
      id: 'tool-1',
      name: 'Community Tool',
      compatible: true,
      launchMode: 'document',
      sourceHomeUrl: 'https://kj.sgguo.com/',
      html: '<main id="app">ready</main>',
      css: 'main::after{content:"</style>"}',
      script: 'document.querySelector("#app").textContent="ok";</script><script>alert(1)'
    });

    expect(documentText).toContain('Content-Security-Policy');
    expect(documentText).toContain('<base href="https://kj.sgguo.com/" target="_blank">');
    expect(documentText).toContain('<main id="app">ready</main>');
    expect(documentText).toContain('<\\/script>');
    expect(documentText).not.toContain('allow-same-origin');
  });

  it('preserves full documents and appends the separately configured script', () => {
    const documentText = buildKjToolSandboxDocument({
      id: 'full-1',
      compatible: true,
      launch_mode: 'document',
      html: '<!doctype html><html><head></head><body><script>window.ready=true</script></body></html>',
      script: 'window.duplicated=true'
    });
    expect(documentText).toContain('Content-Security-Policy');
    expect(documentText).toContain('window.ready=true');
    expect(documentText).toContain('window.duplicated=true');
  });

  it('fetches catalog and detail through the site proxy', async () => {
    const fetchMock = vi.fn()
      .mockResolvedValueOnce(jsonResponse({ data: { enabled: true, tools: [] } }))
      .mockResolvedValueOnce(jsonResponse({
        data: { id: 'clock-1', name: '时钟', compatible: true, launch_mode: 'document', html: '<p>clock</p>' }
      }));
    vi.stubGlobal('fetch', fetchMock);

    await fetchKjToolCatalog({ refresh: true });
    const detail = await fetchKjToolDetail('clock-1');

    expect(String(fetchMock.mock.calls[0][0])).toContain('refresh=true');
    expect(String(fetchMock.mock.calls[1][0])).toContain('/api/v1/tools/kj-source/tools/clock-1');
    expect(detail).toMatchObject({ id: 'clock-1', compatible: true, launchMode: 'document' });
  });

  it('rejects invalid ids locally and describes backend problems', async () => {
    await expect(fetchKjToolDetail('../bad')).rejects.toThrow('KJ 工具标识格式无效');
    expect(describeKjToolSourceError(new HttpError('gone', {
      status: 404,
      detail: '该 KJ 工具不存在或已下架'
    }))).toBe('该 KJ 工具不存在或已下架');
  });
});
