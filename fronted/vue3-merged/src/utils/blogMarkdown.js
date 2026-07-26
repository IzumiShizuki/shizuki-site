import { parseSlideChunk, splitDeckSource } from './slidevComposer';

function escapeHtml(input) {
  return String(input || '')
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
    .replace(/"/g, '&quot;')
    .replace(/'/g, '&#39;');
}

function sanitizeUrl(rawUrl) {
  const normalized = String(rawUrl || '').trim();
  if (!normalized) return '';
  const lowered = normalized.toLowerCase();
  if (lowered.startsWith('javascript:') || lowered.startsWith('data:')) {
    return '';
  }
  if (lowered.startsWith('#') || lowered.startsWith('/') || lowered.startsWith('./') || lowered.startsWith('../')) {
    return escapeHtml(normalized);
  }
  if (/^[a-z][a-z0-9+.-]*:/i.test(normalized)) {
    if (lowered.startsWith('http:') || lowered.startsWith('https:') || lowered.startsWith('mailto:')) {
      return escapeHtml(normalized);
    }
    return '';
  }
  return escapeHtml(normalized);
}

function extractTextFromInlineMarkdown(input) {
  return String(input || '')
    .replace(/`([^`]+)`/g, '$1')
    .replace(/!\[([^\]]*)\]\([^)]+\)/g, '$1')
    .replace(/\[([^\]]+)\]\([^)]+\)/g, '$1')
    .replace(/[*_~>#]/g, '')
    .replace(/\s+/g, ' ')
    .trim();
}

function toHeadingSlug(input) {
  const normalized = String(input || '')
    .normalize('NFKD')
    .replace(/[\u0300-\u036f]/g, '')
    .toLowerCase()
    .replace(/[^a-z0-9\u4e00-\u9fa5]+/g, '-')
    .replace(/^-+|-+$/g, '');
  return normalized || 'section';
}

function splitTableCells(line) {
  let normalized = String(line || '').trim();
  if (normalized.startsWith('|')) normalized = normalized.slice(1);
  if (normalized.endsWith('|')) normalized = normalized.slice(0, -1);
  return normalized.split('|').map((cell) => cell.trim());
}

function isTableDelimiterLine(line) {
  return /^\s*\|?\s*:?-{3,}:?\s*(\|\s*:?-{3,}:?\s*)+\|?\s*$/.test(String(line || ''));
}

function escapeHtmlTableText(input) {
  return escapeHtml(String(input || '')).replace(/\r?\n/g, '<br />');
}

function renderSanitizedHtmlTable(tableBlock) {
  const allowedTags = new Set(['table', 'thead', 'tbody', 'tr', 'th', 'td']);
  const cleaned = String(tableBlock || '')
    .replace(/<script\b[^>]*>[\s\S]*?<\/script>/gi, '')
    .replace(/<style\b[^>]*>[\s\S]*?<\/style>/gi, '');

  const parts = cleaned.match(/<[^>]+>|[^<]+/g) || [];
  const html = parts
    .map((part) => {
      if (!part.startsWith('<')) {
        if (!part.trim()) return '';
        return escapeHtmlTableText(part);
      }

      const tagMatch = part.match(/^<\s*(\/?)\s*([a-z0-9]+)(?:\s[^>]*)?>$/i);
      if (!tagMatch) return '';

      const isClosing = tagMatch[1] === '/';
      const tagName = String(tagMatch[2] || '').toLowerCase();
      if (!allowedTags.has(tagName)) return '';
      return isClosing ? `</${tagName}>` : `<${tagName}>`;
    })
    .join('')
    .trim();

  return html ? `<div class="md-table-wrap">${html}</div>` : '';
}

function consumeHtmlTableBlock(lines, startIndex) {
  const firstLine = String(lines[startIndex] || '').trim();
  if (!/^<table(?:\s|>)/i.test(firstLine)) {
    return null;
  }

  const collected = [];
  let cursor = startIndex;
  let closed = false;

  while (cursor < lines.length) {
    const currentLine = String(lines[cursor] || '');
    collected.push(currentLine);
    if (/<\/table>\s*$/i.test(currentLine.trim())) {
      closed = true;
      break;
    }
    cursor += 1;
  }

  if (!closed) return null;

  const html = renderSanitizedHtmlTable(collected.join('\n'));
  if (!html) return null;
  return {
    html,
    nextIndex: cursor
  };
}

function restoreCodeTokens(text, codeTokens) {
  return text.replace(/\u0000CODE_(\d+)\u0000/g, (_, index) => {
    const token = codeTokens[Number(index)] || '';
    return `<code class="md-inline-code">${token}</code>`;
  });
}

function renderInlineMarkdown(input) {
  let rendered = escapeHtml(input);
  const codeTokens = [];

  rendered = rendered.replace(/`([^`]+?)`/g, (_, code) => {
    const tokenIndex = codeTokens.push(code) - 1;
    return `\u0000CODE_${tokenIndex}\u0000`;
  });

  rendered = rendered.replace(/!\[([^\]]*)\]\(([^)\s]+)(?:\s+"[^"]*")?\)/g, (_, alt, url) => {
    const safeUrl = sanitizeUrl(url);
    if (!safeUrl) return escapeHtml(`![${alt}](${url})`);
    return `<img class="md-inline-image" src="${safeUrl}" alt="${alt}" loading="lazy" />`;
  });

  rendered = rendered.replace(/\[([^\]]+)\]\(([^)\s]+)(?:\s+"[^"]*")?\)/g, (_, text, url) => {
    const safeUrl = sanitizeUrl(url);
    if (!safeUrl) return `[${text}](${url})`;
    const attrs = safeUrl.startsWith('http') ? ' target="_blank" rel="noopener noreferrer"' : '';
    return `<a href="${safeUrl}"${attrs}>${text}</a>`;
  });

  rendered = rendered.replace(/\*\*([^*]+)\*\*/g, '<strong>$1</strong>');
  rendered = rendered.replace(/__([^_]+)__/g, '<strong>$1</strong>');
  rendered = rendered.replace(/\*([^*]+)\*/g, '<em>$1</em>');
  rendered = rendered.replace(/_([^_]+)_/g, '<em>$1</em>');
  rendered = rendered.replace(/~~([^~]+)~~/g, '<del>$1</del>');

  return restoreCodeTokens(rendered, codeTokens);
}

function buildHeadingList(headings) {
  let currentRootId = '';
  return headings.map((heading) => {
    if (heading.level <= 2 || !currentRootId) {
      currentRootId = heading.id;
    }
    return {
      ...heading,
      rootId: currentRootId
    };
  });
}

const CALLOUT_TYPE_META = Object.freeze({
  info: { className: 'md-callout-info', icon: 'fa-circle-info', label: '提示' },
  tip: { className: 'md-callout-tip', icon: 'fa-lightbulb', label: '技巧' },
  success: { className: 'md-callout-tip', icon: 'fa-circle-check', label: '完成' },
  warning: { className: 'md-callout-warning', icon: 'fa-triangle-exclamation', label: '注意' },
  caution: { className: 'md-callout-warning', icon: 'fa-triangle-exclamation', label: '注意' },
  danger: { className: 'md-callout-danger', icon: 'fa-circle-exclamation', label: '警告' },
  error: { className: 'md-callout-danger', icon: 'fa-circle-exclamation', label: '警告' },
  note: { className: 'md-callout-note', icon: 'fa-note-sticky', label: '笔记' },
  quote: { className: 'md-callout-note', icon: 'fa-quote-left', label: '引用' }
});

const CONTAINER_OPEN_PATTERN = /^\s{0,3}:{3}\s*([a-zA-Z][\w-]*)\s*(.*?)\s*$/;
const CONTAINER_CLOSE_PATTERN = /^\s{0,3}:{3}\s*$/;

export function resolveCalloutTypeMeta(type) {
  const normalized = String(type || '').trim().toLowerCase();
  return CALLOUT_TYPE_META[normalized] || CALLOUT_TYPE_META.note;
}

function consumeContainerBlock(lines, startIndex) {
  const openMatch = String(lines[startIndex] || '').match(CONTAINER_OPEN_PATTERN);
  if (!openMatch) return null;

  const type = String(openMatch[1] || '').trim().toLowerCase();
  const title = String(openMatch[2] || '').trim();
  const innerLines = [];
  let cursor = startIndex + 1;
  let depth = 1;
  let innerFence = false;

  while (cursor < lines.length) {
    const currentLine = String(lines[cursor] || '');
    if (/^\s*```/.test(currentLine)) {
      innerFence = !innerFence;
    }
    if (!innerFence) {
      if (CONTAINER_OPEN_PATTERN.test(currentLine)) {
        depth += 1;
      } else if (CONTAINER_CLOSE_PATTERN.test(currentLine)) {
        depth -= 1;
        if (depth === 0) break;
      }
    }
    innerLines.push(currentLine);
    cursor += 1;
  }

  return {
    type,
    title,
    innerLines,
    nextIndex: Math.min(cursor, lines.length - 1)
  };
}

function stripNestedHeadingAnchors(html) {
  return String(html || '').replace(/\s(?:id|data-heading-id|data-line)="[^"]*"/g, '');
}

function renderContainerBlock(container) {
  const innerMarkdown = container.innerLines.join('\n');
  const innerHtml = stripNestedHeadingAnchors(renderMarkdownDocument(innerMarkdown).html);

  if (container.type === 'details' || container.type === 'toggle') {
    const summary = renderInlineMarkdown(container.title || '展开查看');
    return [
      '<details class="md-toggle">',
      `<summary class="md-toggle-summary"><span class="md-toggle-marker" aria-hidden="true"><i class="fas fa-chevron-right"></i></span><span class="md-toggle-label">${summary}</span></summary>`,
      `<div class="md-toggle-body">${innerHtml}</div>`,
      '</details>'
    ].join('');
  }

  const meta = resolveCalloutTypeMeta(container.type);
  const titleHtml = renderInlineMarkdown(container.title || meta.label);
  return [
    `<section class="md-callout ${meta.className}">`,
    `<span class="md-callout-icon" aria-hidden="true"><i class="fas ${meta.icon}"></i></span>`,
    '<div class="md-callout-main">',
    `<p class="md-callout-title">${titleHtml}</p>`,
    innerHtml ? `<div class="md-callout-body">${innerHtml}</div>` : '',
    '</div>',
    '</section>'
  ].join('');
}

const BARE_URL_PATTERN = /^https?:\/\/\S+$/i;

export function parseVideoEmbedUrl(rawUrl) {
  const normalized = String(rawUrl || '').trim();
  if (!normalized) return null;

  const bilibiliMatch = normalized.match(/bilibili\.com\/video\/(BV[0-9A-Za-z]+)/i);
  if (bilibiliMatch) {
    const bvid = bilibiliMatch[1];
    const pageMatch = normalized.match(/[?&]p=(\d+)/);
    const page = pageMatch ? Math.max(1, Number(pageMatch[1]) || 1) : 1;
    return {
      kind: 'bilibili',
      label: 'Bilibili',
      src: `https://player.bilibili.com/player.html?bvid=${bvid}&page=${page}&autoplay=0&danmaku=0`
    };
  }

  const youtubeMatch =
    normalized.match(/youtu\.be\/([A-Za-z0-9_-]{6,20})/) ||
    normalized.match(/youtube\.com\/(?:watch\?(?:[^#]*&)?v=|shorts\/|embed\/)([A-Za-z0-9_-]{6,20})/);
  if (youtubeMatch) {
    return {
      kind: 'youtube',
      label: 'YouTube',
      src: `https://www.youtube-nocookie.com/embed/${youtubeMatch[1]}`
    };
  }

  return null;
}

function resolveUrlHostname(rawUrl) {
  try {
    return new URL(String(rawUrl || '')).hostname.replace(/^www\./, '');
  } catch {
    return '';
  }
}

function renderBareUrlEmbed(rawUrl) {
  const safeUrl = sanitizeUrl(rawUrl);
  if (!safeUrl || !/^https?:/i.test(String(rawUrl || '').trim())) {
    return '';
  }

  const video = parseVideoEmbedUrl(rawUrl);
  if (video) {
    const frameSrc = escapeHtml(video.src);
    return [
      `<figure class="md-embed md-embed-video md-embed-${video.kind}">`,
      '<div class="md-embed-frame">',
      `<iframe src="${frameSrc}" loading="lazy" frameborder="0" scrolling="no" allowfullscreen referrerpolicy="no-referrer" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"></iframe>`,
      '</div>',
      `<figcaption class="md-embed-caption"><i class="fas fa-clapperboard" aria-hidden="true"></i><span>${escapeHtml(video.label)}</span><a href="${safeUrl}" target="_blank" rel="noopener noreferrer">打开原始链接</a></figcaption>`,
      '</figure>'
    ].join('');
  }

  const hostname = resolveUrlHostname(rawUrl);
  return [
    `<a class="md-link-card" href="${safeUrl}" target="_blank" rel="noopener noreferrer">`,
    '<span class="md-link-card-icon" aria-hidden="true"><i class="fas fa-link"></i></span>',
    '<span class="md-link-card-main">',
    `<span class="md-link-card-title">${escapeHtml(hostname || '外部链接')}</span>`,
    `<span class="md-link-card-url">${escapeHtml(String(rawUrl || '').trim())}</span>`,
    '</span>',
    '<span class="md-link-card-arrow" aria-hidden="true"><i class="fas fa-arrow-up-right-from-square"></i></span>',
    '</a>'
  ].join('');
}

export const WHITEBOARD_FENCE_LANG = 'whiteboard';

export function parseWhiteboardEmbedSource(source) {
  let payload = null;
  try {
    payload = JSON.parse(String(source || ''));
  } catch {
    return null;
  }
  if (!payload || typeof payload !== 'object' || Array.isArray(payload)) return null;

  const chunks = Array.isArray(payload.chunks)
    ? payload.chunks.map((chunk) => String(chunk || '').trim()).filter(Boolean)
    : [];
  if (!chunks.length) return null;

  return {
    version: Number(payload.version) || 1,
    title: String(payload.title || '').trim(),
    preview: String(payload.preview || '').trim(),
    encoding: String(payload.encoding || '').trim().toLowerCase(),
    background: String(payload.background || '').trim().toLowerCase(),
    chunks
  };
}

function renderWhiteboardEmbedBlock(source) {
  const payload = parseWhiteboardEmbedSource(source);
  if (!payload) {
    return [
      '<section class="md-whiteboard-embed md-whiteboard-embed-error">',
      '<p><i class="fas fa-triangle-exclamation" aria-hidden="true"></i> 白板数据无法解析，请在编辑器中重新嵌入。</p>',
      '</section>'
    ].join('');
  }

  const title = escapeHtml(payload.title || '互动白板');
  const previewUrl = sanitizeUrl(payload.preview);
  const previewHtml = previewUrl
    ? `<img class="md-whiteboard-preview" src="${previewUrl}" alt="${title}" loading="lazy" />`
    : '<div class="md-whiteboard-preview-placeholder" aria-hidden="true"><i class="fas fa-chalkboard"></i></div>';

  return [
    '<section class="md-whiteboard-embed" data-wb-state="static">',
    `<template class="md-whiteboard-data">${escapeHtml(String(source || ''))}</template>`,
    '<div class="md-whiteboard-stage">',
    previewHtml,
    '<div class="md-whiteboard-overlay">',
    '<span class="md-whiteboard-badge"><i class="fas fa-chalkboard" aria-hidden="true"></i><span>互动白板</span></span>',
    `<span class="md-whiteboard-title">${title}</span>`,
    '<span class="md-whiteboard-hint">支持拖动与缩放 · 点击加载</span>',
    '</div>',
    '</div>',
    '</section>'
  ].join('');
}

export function escapeMarkdownPlainText(input) {
  return String(input || '').replace(/([\\`*_{}\[\]()#+\-.!|>])/g, '\\$1');
}

export function normalizeMarkdownForEditor(input) {
  return String(input || '')
    .replace(/\r\n?/g, '\n')
    .replace(/[ \t]+\n/g, '\n')
    .replace(/\n{3,}/g, '\n\n')
    .replace(/\u00a0/g, ' ')
    .trimEnd();
}

export function detectMarkdownSignals(input) {
  const text = String(input || '');
  const signals = {
    heading: /^\s{0,3}#{1,6}\s+\S+/m.test(text),
    list: /^\s*(?:[-*+]\s+\S+|\d+\.\s+\S+)/m.test(text),
    codeFence: /```/.test(text),
    link: /\[[^\]]+\]\([^)]+\)/.test(text),
    table: /^\s*\|.+\|\s*$/m.test(text) && /\|\s*:?-{3,}:?\s*\|/.test(text),
    blockquote: /^\s*>\s+\S+/m.test(text)
  };
  const hits = Object.entries(signals)
    .filter(([, matched]) => matched)
    .map(([name]) => name);
  return {
    score: hits.length,
    hits,
    signals
  };
}

export function looksLikeMarkdown(input, minHits = 2) {
  const threshold = Number.isFinite(Number(minHits)) ? Number(minHits) : 2;
  return detectMarkdownSignals(input).score >= threshold;
}

export function renderMarkdownDocument(input) {
  const markdown = String(input || '').replace(/\r\n?/g, '\n');
  const lines = markdown.split('\n');
  const htmlParts = [];
  const headings = [];
  const headingSlugCounter = new Map();

  let paragraphLines = [];
  let inCodeFence = false;
  let listType = '';
  let specialFence = '';
  let specialFenceLines = [];

  function flushParagraph() {
    if (!paragraphLines.length) return;
    const content = paragraphLines.map((line) => renderInlineMarkdown(line)).join('<br />');
    htmlParts.push(`<p>${content}</p>`);
    paragraphLines = [];
  }

  function closeList() {
    if (!listType) return;
    htmlParts.push(`</${listType}>`);
    listType = '';
  }

  function openList(nextType) {
    if (listType === nextType) return;
    closeList();
    htmlParts.push(`<${nextType} class="md-list">`);
    listType = nextType;
  }

  function closeBlockLevelElements() {
    flushParagraph();
    closeList();
  }

  for (let index = 0; index < lines.length; index += 1) {
    const line = lines[index];

    const codeFenceMatch = line.match(/^\s*```([^`]*)\s*$/);
    if (codeFenceMatch) {
      closeBlockLevelElements();
      if (!inCodeFence) {
        inCodeFence = true;
        const lang = escapeHtml(String(codeFenceMatch[1] || '').trim());
        if (lang.toLowerCase() === WHITEBOARD_FENCE_LANG) {
          specialFence = WHITEBOARD_FENCE_LANG;
          specialFenceLines = [];
        } else {
          specialFence = '';
          const langAttr = lang ? ` data-lang="${lang}"` : '';
          htmlParts.push(`<pre class="md-code"${langAttr}><code${langAttr}>`);
        }
      } else {
        inCodeFence = false;
        if (specialFence === WHITEBOARD_FENCE_LANG) {
          htmlParts.push(renderWhiteboardEmbedBlock(specialFenceLines.join('\n')));
          specialFence = '';
          specialFenceLines = [];
        } else {
          htmlParts.push('</code></pre>');
        }
      }
      continue;
    }

    if (inCodeFence) {
      if (specialFence === WHITEBOARD_FENCE_LANG) {
        specialFenceLines.push(line);
      } else {
        htmlParts.push(`${escapeHtml(line)}\n`);
      }
      continue;
    }

    if (line.trim() === '') {
      flushParagraph();
      closeList();
      continue;
    }

    if (CONTAINER_OPEN_PATTERN.test(line)) {
      const container = consumeContainerBlock(lines, index);
      if (container) {
        closeBlockLevelElements();
        htmlParts.push(renderContainerBlock(container));
        index = container.nextIndex;
        continue;
      }
    }

    const htmlTableBlock = consumeHtmlTableBlock(lines, index);
    if (htmlTableBlock) {
      closeBlockLevelElements();
      htmlParts.push(htmlTableBlock.html);
      index = htmlTableBlock.nextIndex;
      continue;
    }

    const headingMatch = line.match(/^\s{0,3}(#{1,6})\s+(.+?)\s*$/);
    if (headingMatch) {
      closeBlockLevelElements();
      const level = Math.min(6, headingMatch[1].length);
      const rawText = headingMatch[2].replace(/\s+#+\s*$/, '').trim();
      const plainText = extractTextFromInlineMarkdown(rawText) || `Section ${headings.length + 1}`;
      const slugBase = toHeadingSlug(plainText);
      const slugCount = headingSlugCounter.get(slugBase) || 0;
      headingSlugCounter.set(slugBase, slugCount + 1);
      const id = slugCount === 0 ? slugBase : `${slugBase}-${slugCount + 1}`;
      const lineNum = index + 1;

      headings.push({
        id,
        level,
        text: plainText,
        line: lineNum
      });
      htmlParts.push(
        `<h${level} id="${id}" data-heading-id="${id}" data-line="${lineNum}">${renderInlineMarkdown(rawText)}</h${level}>`
      );
      continue;
    }

    const hrMatch = line.match(/^\s{0,3}([-*_])(\s*\1){2,}\s*$/);
    if (hrMatch) {
      closeBlockLevelElements();
      htmlParts.push('<hr />');
      continue;
    }

    const blockQuoteMatch = line.match(/^\s*>\s?(.*)$/);
    if (blockQuoteMatch) {
      closeBlockLevelElements();
      htmlParts.push(`<blockquote><p>${renderInlineMarkdown(blockQuoteMatch[1])}</p></blockquote>`);
      continue;
    }

    const unorderedMatch = line.match(/^\s*[-*+]\s+(.+)$/);
    if (unorderedMatch) {
      flushParagraph();
      openList('ul');
      const taskMatch = unorderedMatch[1].match(/^\[( |x|X)\]\s+(.+)$/);
      if (taskMatch) {
        const checked = taskMatch[1].toLowerCase() === 'x';
        htmlParts.push(
          `<li class="md-task-item${checked ? ' is-checked' : ''}" data-task-checked="${checked ? 'true' : 'false'}"><span class="md-task-checkbox" aria-hidden="true">${checked ? '<i class="fas fa-check"></i>' : ''}</span><span class="md-task-text">${renderInlineMarkdown(taskMatch[2])}</span></li>`
        );
      } else {
        htmlParts.push(`<li>${renderInlineMarkdown(unorderedMatch[1])}</li>`);
      }
      continue;
    }

    const orderedMatch = line.match(/^\s*\d+\.\s+(.+)$/);
    if (orderedMatch) {
      flushParagraph();
      openList('ol');
      htmlParts.push(`<li>${renderInlineMarkdown(orderedMatch[1])}</li>`);
      continue;
    }

    const trimmedLine = line.trim();
    if (!paragraphLines.length && BARE_URL_PATTERN.test(trimmedLine)) {
      const embedHtml = renderBareUrlEmbed(trimmedLine);
      if (embedHtml) {
        closeBlockLevelElements();
        htmlParts.push(embedHtml);
        continue;
      }
    }

    const maybeTableHeader = splitTableCells(line);
    if (maybeTableHeader.length >= 2 && index + 1 < lines.length && isTableDelimiterLine(lines[index + 1])) {
      closeBlockLevelElements();
      const rows = [];
      let cursor = index + 2;
      while (cursor < lines.length) {
        const rowLine = lines[cursor];
        if (!rowLine || !rowLine.includes('|')) break;
        rows.push(splitTableCells(rowLine));
        cursor += 1;
      }

      const headerCellsHtml = maybeTableHeader.map((cell) => `<th>${renderInlineMarkdown(cell)}</th>`).join('');
      const bodyRowsHtml = rows
        .map((row) => `<tr>${row.map((cell) => `<td>${renderInlineMarkdown(cell)}</td>`).join('')}</tr>`)
        .join('');
      htmlParts.push(
        `<div class="md-table-wrap"><table class="md-table"><thead><tr>${headerCellsHtml}</tr></thead><tbody>${bodyRowsHtml}</tbody></table></div>`
      );
      index = cursor - 1;
      continue;
    }

    paragraphLines.push(line.trimEnd());
  }

  closeBlockLevelElements();
  if (inCodeFence) {
    if (specialFence === WHITEBOARD_FENCE_LANG) {
      htmlParts.push(renderWhiteboardEmbedBlock(specialFenceLines.join('\n')));
    } else {
      htmlParts.push('</code></pre>');
    }
  }

  return {
    html: htmlParts.join('\n'),
    headings: buildHeadingList(headings),
    lineCount: markdown.trim().length ? lines.length : 0
  };
}

function slideFrontmatterValue(frontmatterLines, key) {
  for (const line of frontmatterLines || []) {
    const match = String(line).match(/^([A-Za-z_][\w-]*)\s*:\s*(.*)$/);
    if (match && match[1] === key) {
      return match[2].trim().replace(/^['"]|['"]$/g, '');
    }
  }
  return '';
}

function isSlidevComponentLine(line) {
  const trimmed = String(line || '').trim();
  return /^<\/?(?:v-clicks?|v-after|v-click-hide|[A-Z][\w.-]*)(?:\s[^>]*)?\/?>$/.test(trimmed);
}

function markRevealLists(html) {
  return String(html || '')
    .replace(/<ul class="md-list">/g, '<ul class="md-list reveal-steps">')
    .replace(/<ol class="md-list">/g, '<ol class="md-list reveal-steps">');
}

function renderSlideBody(body) {
  const lines = String(body || '').split('\n');
  const segments = [];
  let current = [];
  let currentRevealed = false;
  let inFence = false;

  const flush = () => {
    if (current.length) {
      segments.push({ lines: current, revealed: currentRevealed });
    }
    current = [];
  };

  for (const line of lines) {
    const trimmed = line.trim();
    if (/^(```|~~~)/.test(trimmed)) {
      inFence = !inFence;
      current.push(line);
      continue;
    }
    if (inFence) {
      current.push(line);
      continue;
    }
    if (/^<v-clicks(?:\s[^>]*)?>$/.test(trimmed)) {
      flush();
      currentRevealed = true;
      continue;
    }
    if (/^<\/v-clicks>$/.test(trimmed)) {
      flush();
      currentRevealed = false;
      continue;
    }
    if (isSlidevComponentLine(trimmed)) {
      continue;
    }
    current.push(line);
  }
  flush();

  const htmlParts = [];
  const headings = [];
  for (const segment of segments) {
    const rendered = renderMarkdownDocument(segment.lines.join('\n'));
    headings.push(...rendered.headings);
    htmlParts.push(segment.revealed ? markRevealLists(rendered.html) : rendered.html);
  }

  return {
    html: htmlParts.filter(Boolean).join('\n'),
    headings
  };
}

export function parseSlidevDeck(input) {
  const normalized = normalizeMarkdownForEditor(String(input || ''));
  if (!normalized.trim()) return [];

  const { headmatterLines, chunks } = splitDeckSource(normalized);
  const slides = [];

  for (const rawChunk of chunks) {
    const chunk = String(rawChunk || '').trim();
    if (!chunk) continue;

    const { frontmatter, body } = parseSlideChunk(chunk);
    if (!slides.length && headmatterLines) {
      // Slidev 中第一页的 layout/class 与 headmatter 共用同一个块
      if (!slideFrontmatterValue(frontmatter, 'layout') && slideFrontmatterValue(headmatterLines, 'layout')) {
        frontmatter.push(`layout: ${slideFrontmatterValue(headmatterLines, 'layout')}`);
      }
      if (!slideFrontmatterValue(frontmatter, 'class') && slideFrontmatterValue(headmatterLines, 'class')) {
        frontmatter.push(`class: ${slideFrontmatterValue(headmatterLines, 'class')}`);
      }
    }
    const cleanedSlide = String(body || '').trim();
    if (!cleanedSlide) continue;

    const rendered = renderSlideBody(cleanedSlide);
    const fallbackTitleLine = cleanedSlide
      .split('\n')
      .map((line) => String(line || '').trim())
      .find((line) => line && !line.startsWith('---') && !isSlidevComponentLine(line));
    const index = slides.length + 1;
    const title =
      rendered.headings[0]?.text ||
      extractTextFromInlineMarkdown(fallbackTitleLine || '') ||
      `Slide ${index}`;

    slides.push({
      id: `slide-${index}`,
      index,
      title,
      markdown: cleanedSlide,
      html: rendered.html,
      layout: slideFrontmatterValue(frontmatter, 'layout') || 'default',
      clazz: slideFrontmatterValue(frontmatter, 'class')
    });
  }

  return slides;
}
