import { HttpError, httpRequest, normalizeApiData } from '../../../services/httpClient';

const SANDBOX_CSP = [
  "default-src 'none'",
  "img-src https: http: data: blob:",
  "media-src https: http: data: blob:",
  "font-src https: http: data:",
  "style-src 'unsafe-inline' https: http:",
  "script-src 'unsafe-inline' https: http:",
  "connect-src https: http:",
  "form-action https: http:",
  "frame-src https: http:",
  "worker-src blob:"
].join('; ');

function toObject(value) {
  return value && typeof value === 'object' && !Array.isArray(value) ? value : {};
}

function toText(value, fallback = '') {
  const normalized = String(value ?? '').trim();
  return normalized || fallback;
}

function toNumber(value, fallback = 0) {
  const normalized = Number(value);
  return Number.isFinite(normalized) ? normalized : fallback;
}

export function safeKjToolUrl(value) {
  try {
    const parsed = new URL(String(value || '').trim());
    if (!['http:', 'https:'].includes(parsed.protocol)) return '';
    return parsed.href;
  } catch {
    return '';
  }
}

export function normalizeKjToolSummary(raw) {
  const source = toObject(raw);
  const id = toText(source.id);
  const launchMode = toText(source.launchMode ?? source.launch_mode).toLowerCase();
  const compatible = source.compatible === true && ['document', 'website'].includes(launchMode);
  return {
    id,
    name: toText(source.name, '未命名工具'),
    description: toText(source.description),
    author: toText(source.author, 'KJ 社区作者'),
    category: toText(source.category),
    type: toText(source.type).toLowerCase(),
    icon: toText(source.icon, 'fas fa-puzzle-piece'),
    color: toText(source.color, '#187aff'),
    version: toText(source.version),
    downloads: Math.max(0, toNumber(source.downloads, 0)),
    createdAt: toText(source.createdAt ?? source.created_at),
    compatible,
    launchMode: compatible ? launchMode : '',
    incompatibleReason: toText(
      source.incompatibleReason ?? source.incompatible_reason,
      compatible ? '' : '该 KJ 工具类型暂不支持'
    )
  };
}

export function normalizeKjCatalog(raw) {
  const source = toObject(raw);
  const tools = Array.isArray(source.tools)
    ? source.tools.map(normalizeKjToolSummary).filter((item) => item.id)
    : [];
  const categories = Array.isArray(source.categories)
    ? source.categories
      .map((item) => {
        const entry = toObject(item);
        const id = toText(entry.id);
        return {
          id,
          name: toText(entry.name, id),
          icon: toText(entry.icon, 'fa-folder')
        };
      })
      .filter((item) => item.id)
    : [];
  return {
    enabled: source.enabled !== false,
    sourceName: toText(source.sourceName ?? source.source_name, 'KJ 应用社区'),
    sourceHomeUrl: safeKjToolUrl(source.sourceHomeUrl ?? source.source_home_url),
    categories,
    tools
  };
}

export function normalizeKjToolDetail(raw) {
  const source = toObject(raw);
  const summary = normalizeKjToolSummary(source);
  const url = safeKjToolUrl(source.url);
  const compatible = summary.compatible
    && (summary.launchMode !== 'website' || Boolean(url))
    && (summary.launchMode !== 'document' || Boolean(String(source.html || '').trim()));
  return {
    ...summary,
    compatible,
    launchMode: compatible ? summary.launchMode : '',
    incompatibleReason: compatible
      ? ''
      : toText(summary.incompatibleReason, '该工具缺少可安全运行的内容'),
    html: String(source.html ?? ''),
    css: String(source.css ?? ''),
    script: String(source.script ?? source.js ?? ''),
    url,
    sourceHomeUrl: safeKjToolUrl(source.sourceHomeUrl ?? source.source_home_url)
  };
}

function escapeAttribute(value) {
  return String(value ?? '')
    .replace(/&/g, '&amp;')
    .replace(/"/g, '&quot;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;');
}

function safeStyleText(value) {
  return String(value ?? '').replace(/<\/style/gi, '<\\/style');
}

function safeScriptText(value) {
  return String(value ?? '').replace(/<\/script/gi, '<\\/script');
}

function sandboxHead(detail) {
  const baseUrl = safeKjToolUrl(detail.sourceHomeUrl) || 'https://kj.sgguo.com/';
  const title = escapeAttribute(detail.name || 'KJ Tool');
  const css = safeStyleText(detail.css);
  return [
    '<meta charset="UTF-8">',
    '<meta name="viewport" content="width=device-width, initial-scale=1.0">',
    `<meta http-equiv="Content-Security-Policy" content="${escapeAttribute(SANDBOX_CSP)}">`,
    `<base href="${escapeAttribute(baseUrl)}" target="_blank">`,
    `<title>${title}</title>`,
    css ? `<style>${css}</style>` : ''
  ].filter(Boolean).join('');
}

export function buildKjToolSandboxDocument(rawDetail) {
  const detail = normalizeKjToolDetail(rawDetail);
  if (!detail.compatible || detail.launchMode !== 'document') return '';

  const head = sandboxHead(detail);
  const rawHtml = String(detail.html || '');
  const isFullDocument = /<!doctype\s+html|<html[\s>]/i.test(rawHtml);
  const script = detail.script
    ? `<script>${safeScriptText(detail.script)}</script>`
    : '';

  if (!isFullDocument) {
    return `<!DOCTYPE html><html><head>${head}</head><body>${rawHtml}${script}</body></html>`;
  }

  let documentText = rawHtml;
  if (/<head[\s>][^>]*>/i.test(documentText)) {
    documentText = documentText.replace(/<head([^>]*)>/i, `<head$1>${head}`);
  } else if (/<html[\s>][^>]*>/i.test(documentText)) {
    documentText = documentText.replace(/<html([^>]*)>/i, `<html$1><head>${head}</head>`);
  } else {
    documentText = `<head>${head}</head>${documentText}`;
  }
  if (script) {
    documentText = /<\/body>/i.test(documentText)
      ? documentText.replace(/<\/body>/i, `${script}</body>`)
      : `${documentText}${script}`;
  }
  return documentText;
}

export function describeKjToolSourceError(error) {
  if (error?.name === 'AbortError') return 'KJ 工具请求已取消';
  if (error instanceof HttpError) {
    const body = toObject(error.body);
    const detail = toText(body.detail);
    if (detail) return detail;
    if (error.problemCode === 'TIMEOUT') return 'KJ 工具源响应超时，请稍后重试';
    if (error.status === 0) return '无法连接站点服务，请检查网络后重试';
    if (error.status === 404) return '该 KJ 工具不存在或已下架';
    if (error.status === 413) return '该 KJ 工具内容过大，无法安全打开';
    if (error.status === 503) return 'KJ 工具源当前未启用';
    return `KJ 工具源请求失败（HTTP ${error.status}）`;
  }
  return String(error?.message || 'KJ 工具源请求失败，请稍后重试');
}

export async function fetchKjToolCatalog(options = {}) {
  const response = await httpRequest('/api/v1/tools/kj-source/catalog', {
    method: 'GET',
    query: options.refresh ? { refresh: true } : undefined,
    timeoutMs: 12000,
    signal: options.signal
  });
  return normalizeKjCatalog(normalizeApiData(response) ?? response);
}

export async function fetchKjToolDetail(toolId, options = {}) {
  const normalizedId = String(toolId || '').trim();
  if (!/^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$/.test(normalizedId)) {
    throw new Error('KJ 工具标识格式无效');
  }
  const response = await httpRequest(`/api/v1/tools/kj-source/tools/${encodeURIComponent(normalizedId)}`, {
    method: 'GET',
    timeoutMs: 15000,
    signal: options.signal
  });
  return normalizeKjToolDetail(normalizeApiData(response) ?? response);
}
