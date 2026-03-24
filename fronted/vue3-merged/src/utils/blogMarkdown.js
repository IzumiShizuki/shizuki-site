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
        const langAttr = lang ? ` data-lang="${lang}"` : '';
        htmlParts.push(`<pre class="md-code"><code${langAttr}>`);
      } else {
        inCodeFence = false;
        htmlParts.push('</code></pre>');
      }
      continue;
    }

    if (inCodeFence) {
      htmlParts.push(`${escapeHtml(line)}\n`);
      continue;
    }

    if (line.trim() === '') {
      flushParagraph();
      closeList();
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
      htmlParts.push(`<li>${renderInlineMarkdown(unorderedMatch[1])}</li>`);
      continue;
    }

    const orderedMatch = line.match(/^\s*\d+\.\s+(.+)$/);
    if (orderedMatch) {
      flushParagraph();
      openList('ol');
      htmlParts.push(`<li>${renderInlineMarkdown(orderedMatch[1])}</li>`);
      continue;
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
        `<table class="md-table"><thead><tr>${headerCellsHtml}</tr></thead><tbody>${bodyRowsHtml}</tbody></table>`
      );
      index = cursor - 1;
      continue;
    }

    paragraphLines.push(line.trimEnd());
  }

  closeBlockLevelElements();
  if (inCodeFence) {
    htmlParts.push('</code></pre>');
  }

  return {
    html: htmlParts.join('\n'),
    headings: buildHeadingList(headings),
    lineCount: markdown.trim().length ? lines.length : 0
  };
}

export function parseSlidevDeck(input) {
  const normalized = normalizeMarkdownForEditor(String(input || ''));
  const body = normalized.replace(/^---\n[\s\S]*?\n---\n?/, '').trim();
  if (!body) return [];

  return body
    .split(/\n---\n/g)
    .map((rawSlide) => String(rawSlide || '').trim())
    .filter(Boolean)
    .map((rawSlide, index) => {
      const cleanedSlide = rawSlide
        .replace(/^layout:\s*[^\n]+\n?/gm, '')
        .replace(/^class:\s*[^\n]+\n?/gm, '')
        .trim();
      const rendered = renderMarkdownDocument(cleanedSlide);
      const fallbackTitleLine = cleanedSlide
        .split('\n')
        .map((line) => String(line || '').trim())
        .find((line) => line && !line.startsWith('---'));
      const title =
        rendered.headings[0]?.text ||
        extractTextFromInlineMarkdown(fallbackTitleLine || '') ||
        `Slide ${index + 1}`;
      return {
        id: `slide-${index + 1}`,
        index: index + 1,
        title,
        markdown: cleanedSlide,
        html: rendered.html
      };
    });
}
