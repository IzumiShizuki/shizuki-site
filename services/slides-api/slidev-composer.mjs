/**
 * slidev-composer
 *
 * 把"博客正文 markdown"或"已有的 Slidev markdown"统一整理成一份
 * 干净、防溢出、带动画的 Slidev 演示文稿。
 *
 * - 纯博客文（convert 模式）：生成封面 / 目录 / 章节页，按内容预算自动分页，
 *   列表包 <v-clicks> 逐条出现，超长代码块 / 表格 / 段落自动拆页。
 * - 已是 Slidev 格式（enhance 模式）：保留原有页面与 frontmatter，仅补全
 *   headmatter 默认值、拆分溢出页、为列表补充点击动画。
 *
 * 注意：本文件与前端 fronted/vue3-merged/src/utils/slidevComposer.js 保持
 * 同步（同一份逻辑的双拷贝），修改任意一份时请同步另一份。
 *
 * 输出保持确定性：相同输入永远得到相同输出（预览缓存依赖这一点）。
 */

export const COMPOSER_VERSION = 'shz-composer-v1';

const BODY_BUDGET = 12.5; // 每页可用"行单位"（与 style.css 的字号/行高匹配）
const CHARS_PER_LINE = 40; // 每视觉行可容纳的 CJK 等效字符数
const CODE_LINES_PER_SLIDE = 12; // 单页最多代码行数
const TABLE_ROWS_PER_SLIDE = 7; // 单页最多表格数据行数
const LIST_ITEMS_PER_SLIDE = 8; // 单页最多顶层列表条目数
const MAX_CLICK_ITEMS = 10; // 超过该条数的列表不再逐条动画
const SUBTITLE_MAX_CHARS = 72;

const SPECIAL_LAYOUTS = new Set([
  'cover',
  'section',
  'center',
  'end',
  'intro',
  'quote',
  'fact',
  'statement',
  'full',
  'none',
  'image',
  'image-left',
  'image-right',
  'iframe',
  'iframe-left',
  'iframe-right',
  'two-cols',
  'two-cols-header'
]);

const SLIDE_FRONTMATTER_KEYS = new Set([
  'layout',
  'class',
  'transition',
  'clicks',
  'background',
  'preload',
  'hide',
  'hideInToc',
  'level',
  'routeAlias',
  'zoom',
  'dragPos',
  'title'
]);

function normalizeNewlines(input) {
  return String(input ?? '').replace(/\r\n?/g, '\n');
}

function visualLength(text) {
  let length = 0;
  for (const char of String(text || '')) {
    const codePoint = char.codePointAt(0) || 0;
    // CJK 统一表意文字 / 全角标点按 1 计，其余按 0.55 计
    if (
      (codePoint >= 0x2e80 && codePoint <= 0x9fff) ||
      (codePoint >= 0xf900 && codePoint <= 0xfaff) ||
      (codePoint >= 0xff00 && codePoint <= 0xffef) ||
      (codePoint >= 0x3000 && codePoint <= 0x303f)
    ) {
      length += 1;
    } else {
      length += 0.55;
    }
  }
  return length;
}

function estimateTextLines(text) {
  const stripped = String(text || '').trim();
  if (!stripped) return 0;
  return Math.max(1, Math.ceil(visualLength(stripped) / CHARS_PER_LINE));
}

function isFenceLine(line) {
  return /^\s*(```|~~~)/.test(String(line || ''));
}

function isSeparatorLine(line) {
  return /^---+\s*$/.test(String(line || '').trim()) && String(line || '').trim() === '---';
}

function isTableDelimiterLine(line) {
  return /^\s*\|?\s*:?-{3,}:?\s*(\|\s*:?-{3,}:?\s*)+\|?\s*$/.test(String(line || ''));
}

function looksLikeFrontmatterLine(line) {
  return /^[A-Za-z_][\w-]*\s*:/.test(String(line || '').trim());
}

function yamlQuote(value) {
  const text = String(value ?? '').trim();
  if (!text) return "''";
  if (/^[\w一-龥][\w一-龥 .·\-]*$/.test(text) && !/^\d/.test(text)) {
    return text;
  }
  return `'${text.replace(/'/g, "''")}'`;
}

// ---------------------------------------------------------------------------
// markdown 块解析（识别代码围栏，避免在代码内部误切）
// ---------------------------------------------------------------------------

export function parseMarkdownBlocks(markdown) {
  const lines = normalizeNewlines(markdown).split('\n');
  const blocks = [];
  let index = 0;

  while (index < lines.length) {
    const line = lines[index];
    const trimmed = line.trim();

    if (!trimmed) {
      index += 1;
      continue;
    }

    // 代码围栏
    const fenceMatch = trimmed.match(/^(```+|~~~+)\s*(\S*)\s*$/);
    if (fenceMatch) {
      const fenceToken = fenceMatch[1][0].repeat(3);
      const lang = fenceMatch[2] || '';
      const codeLines = [];
      index += 1;
      while (index < lines.length && !lines[index].trim().startsWith(fenceToken)) {
        codeLines.push(lines[index]);
        index += 1;
      }
      index += 1; // 跳过收尾围栏
      blocks.push({ type: 'code', lang, lines: codeLines });
      continue;
    }

    // 标题
    const headingMatch = trimmed.match(/^(#{1,6})\s+(.+?)\s*$/);
    if (headingMatch) {
      blocks.push({
        type: 'heading',
        level: headingMatch[1].length,
        text: headingMatch[2].replace(/\s+#+\s*$/, '').trim()
      });
      index += 1;
      continue;
    }

    // 分隔线（博客里的 --- / *** 当作段落分隔，忽略）
    if (/^([-*_])(\s*\1){2,}$/.test(trimmed)) {
      blocks.push({ type: 'hr' });
      index += 1;
      continue;
    }

    // 引用块
    if (/^>\s?/.test(trimmed)) {
      const quoteLines = [];
      while (index < lines.length && /^\s*>\s?/.test(lines[index])) {
        quoteLines.push(lines[index].replace(/^\s*>\s?/, ''));
        index += 1;
      }
      blocks.push({ type: 'quote', lines: quoteLines });
      continue;
    }

    // 列表（含缩进的子项与续行）
    if (/^\s*(?:[-*+]|\d+[.)])\s+\S/.test(line)) {
      const rawLines = [];
      const itemStarts = [];
      const ordered = /^\s*\d+[.)]\s/.test(line);
      while (index < lines.length) {
        const current = lines[index];
        if (!current.trim()) {
          // 允许列表内部出现单个空行（后面仍是缩进内容或列表项时继续）
          const next = lines[index + 1] || '';
          if (/^\s*(?:[-*+]|\d+[.)])\s+\S/.test(next) || /^\s{2,}\S/.test(next)) {
            rawLines.push(current);
            index += 1;
            continue;
          }
          break;
        }
        if (/^\s*(?:[-*+]|\d+[.)])\s+\S/.test(current) && !/^\s{4,}/.test(current)) {
          itemStarts.push(rawLines.length);
          rawLines.push(current);
          index += 1;
          continue;
        }
        if (/^\s+\S/.test(current)) {
          rawLines.push(current);
          index += 1;
          continue;
        }
        break;
      }
      blocks.push({ type: 'list', ordered, lines: rawLines, itemStarts });
      continue;
    }

    // 表格
    if (trimmed.includes('|') && index + 1 < lines.length && isTableDelimiterLine(lines[index + 1])) {
      const headerLine = line;
      const delimiterLine = lines[index + 1];
      const rows = [];
      index += 2;
      while (index < lines.length && lines[index].includes('|') && lines[index].trim()) {
        rows.push(lines[index]);
        index += 1;
      }
      blocks.push({ type: 'table', headerLine, delimiterLine, rows });
      continue;
    }

    // 独立成段的图片
    const imageMatch = trimmed.match(/^!\[([^\]]*)\]\(([^)]+)\)$/);
    if (imageMatch) {
      blocks.push({ type: 'image', alt: imageMatch[1], src: imageMatch[2].trim() });
      index += 1;
      continue;
    }

    // 普通段落（连续非空行）
    const paragraphLines = [];
    while (index < lines.length) {
      const current = lines[index];
      const currentTrimmed = current.trim();
      if (
        !currentTrimmed ||
        isFenceLine(current) ||
        /^(#{1,6})\s+/.test(currentTrimmed) ||
        /^>\s?/.test(currentTrimmed) ||
        /^\s*(?:[-*+]|\d+[.)])\s+\S/.test(current) ||
        (currentTrimmed.includes('|') && isTableDelimiterLine(lines[index + 1] || ''))
      ) {
        break;
      }
      paragraphLines.push(currentTrimmed);
      index += 1;
    }
    if (paragraphLines.length) {
      blocks.push({ type: 'paragraph', text: paragraphLines.join('\n') });
    } else {
      index += 1;
    }
  }

  return blocks;
}

// ---------------------------------------------------------------------------
// 块开销估算与拆分
// ---------------------------------------------------------------------------

function paragraphCost(text) {
  return estimateTextLines(text) + 0.6;
}

function blockCost(block) {
  switch (block.type) {
    case 'heading':
      return block.level <= 2 ? 2.2 : 1.8;
    case 'paragraph':
      return paragraphCost(block.text);
    case 'list': {
      let cost = 0.6;
      for (const line of block.lines) {
        cost += Math.max(0.9, estimateTextLines(line.replace(/^\s*(?:[-*+]|\d+[.)])\s+/, '')));
      }
      return cost;
    }
    case 'code':
      return 1.6 + block.lines.length * 0.75;
    case 'table':
      return 2 + block.rows.length * 1.1;
    case 'quote':
      return 1 + block.lines.reduce((sum, line) => sum + estimateTextLines(line), 0);
    case 'image':
      return 7;
    case 'hr':
      return 0;
    default:
      return 1;
  }
}

function splitParagraphBlock(block) {
  const total = paragraphCost(block.text);
  if (total <= BODY_BUDGET) return [block];

  const sentences = block.text
    .split(/(?<=[。！？!?；;])\s*/)
    .map((item) => item.trim())
    .filter(Boolean);
  if (sentences.length <= 1) return [block];

  const parts = [];
  let current = [];
  let currentCost = 0;
  for (const sentence of sentences) {
    const cost = estimateTextLines(sentence);
    if (current.length && currentCost + cost > BODY_BUDGET - 1) {
      parts.push({ type: 'paragraph', text: current.join('') });
      current = [];
      currentCost = 0;
    }
    current.push(sentence);
    currentCost += cost;
  }
  if (current.length) {
    parts.push({ type: 'paragraph', text: current.join('') });
  }
  return parts;
}

function splitCodeBlock(block) {
  if (block.lines.length <= CODE_LINES_PER_SLIDE) return [block];
  const parts = [];
  for (let start = 0; start < block.lines.length; start += CODE_LINES_PER_SLIDE) {
    parts.push({
      type: 'code',
      lang: block.lang,
      lines: block.lines.slice(start, start + CODE_LINES_PER_SLIDE),
      continued: start > 0
    });
  }
  return parts;
}

function splitTableBlock(block) {
  if (block.rows.length <= TABLE_ROWS_PER_SLIDE) return [block];
  const parts = [];
  for (let start = 0; start < block.rows.length; start += TABLE_ROWS_PER_SLIDE) {
    parts.push({
      type: 'table',
      headerLine: block.headerLine,
      delimiterLine: block.delimiterLine,
      rows: block.rows.slice(start, start + TABLE_ROWS_PER_SLIDE),
      continued: start > 0
    });
  }
  return parts;
}

function splitListBlock(block) {
  if (block.itemStarts.length <= LIST_ITEMS_PER_SLIDE) return [block];
  const parts = [];
  for (let start = 0; start < block.itemStarts.length; start += LIST_ITEMS_PER_SLIDE) {
    const sliceStart = block.itemStarts[start];
    const nextItem = block.itemStarts[start + LIST_ITEMS_PER_SLIDE];
    const sliceEnd = nextItem === undefined ? block.lines.length : nextItem;
    const lines = block.lines.slice(sliceStart, sliceEnd);
    const itemStarts = block.itemStarts
      .slice(start, start + LIST_ITEMS_PER_SLIDE)
      .map((value) => value - sliceStart);
    parts.push({ type: 'list', ordered: block.ordered, lines, itemStarts, continued: start > 0 });
  }
  return parts;
}

function explodeOversizedBlock(block) {
  switch (block.type) {
    case 'paragraph':
      return splitParagraphBlock(block);
    case 'code':
      return splitCodeBlock(block);
    case 'table':
      return splitTableBlock(block);
    case 'list':
      return splitListBlock(block);
    default:
      return [block];
  }
}

// ---------------------------------------------------------------------------
// 块 → markdown 重新渲染
// ---------------------------------------------------------------------------

function rewriteAssetUrl(url, assetBaseUrl) {
  const normalized = String(url || '').trim();
  if (!assetBaseUrl) return normalized;
  if (/^(?:[a-z][a-z0-9+.-]*:|\/\/|#)/i.test(normalized)) return normalized;
  if (!normalized.startsWith('/')) return normalized;
  const base = assetBaseUrl.endsWith('/') ? assetBaseUrl.slice(0, -1) : assetBaseUrl;
  return `${base}${normalized}`;
}

function rewriteInlineAssets(text, assetBaseUrl) {
  if (!assetBaseUrl) return text;
  return String(text || '').replace(
    /(!\[[^\]]*\]\()(\/[^)\s]+)((?:\s+"[^"]*")?\))/g,
    (_, prefix, url, suffix) => `${prefix}${rewriteAssetUrl(url, assetBaseUrl)}${suffix}`
  );
}

function renderBlock(block, options) {
  const assetBaseUrl = options?.assetBaseUrl || '';
  switch (block.type) {
    case 'heading':
      return `${'#'.repeat(Math.min(6, block.level))} ${block.text}`;
    case 'paragraph':
      return rewriteInlineAssets(block.text, assetBaseUrl);
    case 'list': {
      const body = rewriteInlineAssets(block.lines.join('\n'), assetBaseUrl);
      const itemCount = block.itemStarts.length;
      if (options?.animate && itemCount >= 2 && itemCount <= MAX_CLICK_ITEMS) {
        return `<v-clicks>\n\n${body}\n\n</v-clicks>`;
      }
      return body;
    }
    case 'code':
      return `\`\`\`${block.lang || ''}\n${block.lines.join('\n')}\n\`\`\``;
    case 'table':
      return [block.headerLine, block.delimiterLine, ...block.rows].join('\n');
    case 'quote':
      return block.lines.map((line) => `> ${line}`).join('\n');
    case 'image':
      return `![${block.alt || ''}](${rewriteAssetUrl(block.src, assetBaseUrl)})`;
    case 'hr':
      return '';
    default:
      return '';
  }
}

// ---------------------------------------------------------------------------
// convert 模式：博客正文 → 全新 deck
// ---------------------------------------------------------------------------

function paginateBlocks(blocks, headingText, headingLevel, options) {
  const slides = [];
  let currentBlocks = [];
  let currentCost = headingText ? 2.2 : 0;

  const flush = () => {
    if (!currentBlocks.length) return;
    slides.push(currentBlocks);
    currentBlocks = [];
    currentCost = headingText ? 2.2 : 0;
  };

  for (const rawBlock of blocks) {
    if (rawBlock.type === 'hr') continue;
    for (const block of explodeOversizedBlock(rawBlock)) {
      const cost = blockCost(block);
      if (currentBlocks.length && currentCost + cost > BODY_BUDGET) {
        flush();
      }
      currentBlocks.push(block);
      currentCost += cost;
    }
  }
  flush();

  return slides.map((slideBlocks, index) => {
    const parts = [];
    if (headingText) {
      const suffix = index > 0 ? ` · ${index + 1}` : '';
      parts.push(`${'#'.repeat(headingLevel)} ${headingText}${suffix}`);
    }
    for (const block of slideBlocks) {
      const rendered = renderBlock(block, options);
      if (rendered) parts.push(rendered);
    }
    return { frontmatter: [], body: parts.join('\n\n') };
  });
}

function composeFromBlog(markdown, options) {
  const blocks = parseMarkdownBlocks(markdown);
  const slides = [];

  // 标题：优先 options.title，其次文中第一个 H1
  let title = String(options.title || '').trim();
  const firstHeadingIndex = blocks.findIndex((block) => block.type === 'heading' && block.level === 1);
  if (firstHeadingIndex >= 0) {
    if (!title) title = blocks[firstHeadingIndex].text;
    blocks.splice(firstHeadingIndex, 1);
  }
  if (!title) title = '演示文稿';

  // 副标题：第一段足够短则收进封面
  let subtitle = String(options.subtitle || '').trim();
  const firstParagraphIndex = blocks.findIndex((block) => block.type === 'paragraph');
  if (!subtitle && firstParagraphIndex >= 0) {
    const candidate = blocks[firstParagraphIndex].text.replace(/\s+/g, ' ').trim();
    if (visualLength(candidate) <= SUBTITLE_MAX_CHARS) {
      subtitle = candidate;
      blocks.splice(firstParagraphIndex, 1);
    }
  }

  const coverBody = [`# ${title}`];
  if (subtitle) coverBody.push(subtitle);
  slides.push({ frontmatter: ['layout: cover', 'class: shz-cover'], body: coverBody.join('\n\n') });

  // 按 H2 切章节
  const sections = [];
  let current = { title: '', blocks: [] };
  for (const block of blocks) {
    if (block.type === 'heading' && block.level <= 2) {
      if (current.title || current.blocks.length) sections.push(current);
      current = { title: block.text, blocks: [] };
      continue;
    }
    current.blocks.push(block);
  }
  if (current.title || current.blocks.length) sections.push(current);

  const namedSections = sections.filter((section) => section.title);
  const useSectionSlides = namedSections.length >= 2;

  // 目录页
  if (useSectionSlides) {
    const tocItems = namedSections.map((section, index) => `${index + 1}. ${section.title}`);
    const animate = options.animate && tocItems.length >= 2 && tocItems.length <= MAX_CLICK_ITEMS;
    const tocBody = animate
      ? `## 目录\n\n<v-clicks>\n\n${tocItems.join('\n')}\n\n</v-clicks>`
      : `## 目录\n\n${tocItems.join('\n')}`;
    slides.push({ frontmatter: [], body: tocBody });
  }

  let sectionNumber = 0;
  for (const section of sections) {
    if (section.title && useSectionSlides) {
      sectionNumber += 1;
      slides.push({
        frontmatter: ['layout: section'],
        body: `# ${String(sectionNumber).padStart(2, '0')} · ${section.title}`
      });
    }

    // 章节内部再按 H3 分组
    const groups = [];
    let group = { title: section.title || '', level: 2, blocks: [], isLead: true };
    for (const block of section.blocks) {
      if (block.type === 'heading' && block.level === 3) {
        if (group.blocks.length || !group.isLead) groups.push(group);
        group = { title: block.text, level: 3, blocks: [], isLead: false };
        continue;
      }
      group.blocks.push(block);
    }
    groups.push(group);

    for (const contentGroup of groups) {
      if (!contentGroup.blocks.length && contentGroup.isLead) continue;
      const headingText = contentGroup.title || (section.title ? section.title : '概览');
      const headingLevel = contentGroup.level === 3 ? 3 : 2;
      const paginated = paginateBlocks(contentGroup.blocks, headingText, headingLevel, options);
      if (!paginated.length && !contentGroup.isLead) {
        slides.push({ frontmatter: [], body: `${'#'.repeat(headingLevel)} ${headingText}` });
        continue;
      }
      slides.push(...paginated);
    }
  }

  // 结尾页
  slides.push({
    frontmatter: ['layout: center', 'class: text-center shz-end'],
    body: `# 谢谢观看\n\n${title}`
  });

  return { title, slides };
}

// ---------------------------------------------------------------------------
// enhance 模式：已有 Slidev deck 的保守增强
// ---------------------------------------------------------------------------

export function splitDeckSource(source) {
  const lines = normalizeNewlines(source).split('\n');
  let headmatterLines = null;
  let bodyStart = 0;

  if (lines[0] !== undefined && isSeparatorLine(lines[0])) {
    for (let index = 1; index < lines.length; index += 1) {
      if (isSeparatorLine(lines[index])) {
        headmatterLines = lines.slice(1, index);
        bodyStart = index + 1;
        break;
      }
      if (!lines[index].trim() || looksLikeFrontmatterLine(lines[index]) || /^\s{2,}\S/.test(lines[index])) {
        continue;
      }
      break;
    }
  }

  const bodyLines = lines.slice(bodyStart);
  const chunks = [];
  let currentLines = [];
  let inFence = false;
  let fenceToken = '';

  for (let index = 0; index < bodyLines.length; index += 1) {
    const line = bodyLines[index];
    const trimmed = line.trim();
    if (!inFence && /^(```|~~~)/.test(trimmed)) {
      inFence = true;
      fenceToken = trimmed.startsWith('~~~') ? '~~~' : '```';
      currentLines.push(line);
      continue;
    }
    if (inFence) {
      if (trimmed.startsWith(fenceToken)) {
        inFence = false;
        fenceToken = '';
      }
      currentLines.push(line);
      continue;
    }
    if (isSeparatorLine(line)) {
      chunks.push(currentLines.join('\n'));
      currentLines = [];

      // 向前看：分隔线后若紧跟 "key: value ... ---" 的闭合 frontmatter 块，
      // 把它并入新页开头（保留闭合 --- 供 parseSlideChunk 识别）。
      const frontmatterLines = [];
      let cursor = index + 1;
      while (cursor < bodyLines.length) {
        const candidate = bodyLines[cursor];
        if (isSeparatorLine(candidate)) break;
        if (
          looksLikeFrontmatterLine(candidate) ||
          /^\s{2,}\S/.test(candidate) ||
          (!candidate.trim() && frontmatterLines.length)
        ) {
          frontmatterLines.push(candidate);
          cursor += 1;
          continue;
        }
        break;
      }
      if (
        frontmatterLines.some((item) => looksLikeFrontmatterLine(item)) &&
        cursor < bodyLines.length &&
        isSeparatorLine(bodyLines[cursor])
      ) {
        currentLines.push(...frontmatterLines, '---');
        index = cursor;
      }
      continue;
    }
    currentLines.push(line);
  }
  chunks.push(currentLines.join('\n'));

  return { headmatterLines, chunks: chunks.map((chunk) => chunk.replace(/^\n+|\n+$/g, '')) };
}

export function parseSlideChunk(chunk) {
  const lines = normalizeNewlines(chunk).split('\n');
  const frontmatter = [];
  let contentStart = 0;

  let cursor = 0;
  while (cursor < lines.length && !lines[cursor].trim()) cursor += 1;

  if (cursor < lines.length && looksLikeFrontmatterLine(lines[cursor])) {
    let end = cursor;
    let closed = -1;
    while (end < lines.length) {
      const line = lines[end];
      if (isSeparatorLine(line)) {
        closed = end;
        break;
      }
      if (line.trim() && !looksLikeFrontmatterLine(line) && !/^\s{2,}\S/.test(line)) {
        break;
      }
      end += 1;
    }

    if (closed >= 0) {
      // 闭合 frontmatter 块：--- 之前的全部行都是 frontmatter
      for (let index = cursor; index < closed; index += 1) {
        if (lines[index].trim()) frontmatter.push(lines[index].trimEnd());
      }
      contentStart = closed + 1;
    } else {
      // 宽松写法：开头连续的已知 key: value 行视为 frontmatter
      let index = cursor;
      while (index < lines.length) {
        const line = lines[index].trim();
        if (!line) break;
        const keyMatch = line.match(/^([A-Za-z_][\w-]*)\s*:/);
        if (!keyMatch || !SLIDE_FRONTMATTER_KEYS.has(keyMatch[1])) break;
        frontmatter.push(line);
        index += 1;
      }
      contentStart = index;
    }
  }

  const body = lines.slice(contentStart).join('\n').replace(/^\n+|\n+$/g, '');
  return { frontmatter, body };
}

function frontmatterValue(frontmatter, key) {
  for (const line of frontmatter) {
    const match = String(line).match(/^([A-Za-z_][\w-]*)\s*:\s*(.*)$/);
    if (match && match[1] === key) {
      return match[2].trim().replace(/^['"]|['"]$/g, '');
    }
  }
  return '';
}

function enhanceSlideChunk(chunk, options) {
  const { frontmatter, body } = parseSlideChunk(chunk);
  const layout = frontmatterValue(frontmatter, 'layout');
  const isSpecial = layout && SPECIAL_LAYOUTS.has(layout);
  const hasManualClicks = /v-click/.test(body);

  if (isSpecial || !body.trim()) {
    return [{ frontmatter, body }];
  }

  const blocks = parseMarkdownBlocks(body);
  const leadingHeading = blocks[0]?.type === 'heading' ? blocks[0] : null;
  const contentBlocks = leadingHeading ? blocks.slice(1) : blocks;

  const renderOptions = {
    animate: options.animate && !hasManualClicks,
    assetBaseUrl: options.assetBaseUrl
  };

  const paginated = paginateBlocks(
    contentBlocks,
    leadingHeading ? leadingHeading.text : '',
    leadingHeading ? Math.min(3, Math.max(1, leadingHeading.level)) : 2,
    renderOptions
  );

  if (!paginated.length) {
    return [{ frontmatter, body }];
  }

  return paginated.map((slide, index) => ({
    frontmatter: index === 0 ? frontmatter : [],
    body: slide.body
  }));
}

// ---------------------------------------------------------------------------
// headmatter 与最终拼装
// ---------------------------------------------------------------------------

function buildHeadmatter(existingLines, options) {
  const lines = Array.isArray(existingLines) ? existingLines.filter((line) => line.trim()) : [];
  const has = (key) => lines.some((line) => new RegExp(`^${key}\\s*:`).test(line.trim()));

  const additions = [];
  if (!has('theme')) additions.push('theme: default');
  if (options.title && !has('title')) additions.push(`title: ${yamlQuote(options.title)}`);
  if (!has('transition')) additions.push('transition: slide-left');
  if (!has('colorSchema')) additions.push(`colorSchema: ${options.theme === 'light' ? 'light' : 'dark'}`);
  if (!has('lineNumbers')) additions.push('lineNumbers: true');

  return [...lines, ...additions];
}

function frontmatterKeyOf(line) {
  const match = String(line).match(/^([A-Za-z_][\w-]*)\s*:/);
  return match ? match[1] : '';
}

function emitDeck(headmatterLines, slides) {
  const parts = [];

  // Slidev 里第一页的 frontmatter 与 headmatter 是同一个块：合并去重
  const firstSlide = slides[0] || { frontmatter: [], body: '' };
  const firstKeys = new Set(firstSlide.frontmatter.map(frontmatterKeyOf).filter(Boolean));
  const mergedHead = [
    ...firstSlide.frontmatter,
    ...headmatterLines.filter((line) => !firstKeys.has(frontmatterKeyOf(line)))
  ];
  parts.push(`---\n${mergedHead.join('\n')}\n---`);
  parts.push('');
  parts.push(firstSlide.body.trim());
  parts.push('');

  slides.slice(1).forEach((slide) => {
    if (slide.frontmatter.length) {
      parts.push(`---\n${slide.frontmatter.join('\n')}\n---`);
    } else {
      parts.push('---');
    }
    parts.push('');
    parts.push(slide.body.trim());
    parts.push('');
  });

  return `${parts.join('\n').replace(/\n{3,}/g, '\n\n').trim()}\n`;
}

// ---------------------------------------------------------------------------
// 对外接口
// ---------------------------------------------------------------------------

export function looksLikeSlidevDeck(markdown) {
  const source = normalizeNewlines(markdown).trim();
  if (!source) return false;
  if (/^---\n[\s\S]*?\n---(\n|$)/.test(source)) return true;
  const { chunks } = splitDeckSource(source);
  return chunks.filter((chunk) => chunk.trim()).length >= 2;
}

export function composeSlidevDeck(markdown, rawOptions = {}) {
  const source = normalizeNewlines(markdown).trim();
  const options = {
    title: String(rawOptions.title || '').trim(),
    subtitle: String(rawOptions.subtitle || '').trim(),
    theme: rawOptions.theme === 'light' ? 'light' : 'dark',
    animate: rawOptions.animate !== false,
    assetBaseUrl: String(rawOptions.assetBaseUrl || '').trim()
  };

  if (!source) {
    return { markdown: '', slideCount: 0, mode: 'empty', title: options.title };
  }

  if (looksLikeSlidevDeck(source)) {
    const { headmatterLines, chunks } = splitDeckSource(source);
    const slides = [];
    for (const chunk of chunks) {
      if (!chunk.trim()) continue;
      slides.push(...enhanceSlideChunk(chunk, options));
    }
    if (!slides.length) {
      slides.push({ frontmatter: [], body: `# ${options.title || '演示文稿'}` });
    }
    const headTitle = headmatterLines ? frontmatterValue(headmatterLines, 'title') : '';
    const headmatter = buildHeadmatter(headmatterLines || [], options);
    return {
      markdown: emitDeck(headmatter, slides),
      slideCount: slides.length,
      mode: 'enhance',
      title: options.title || headTitle
    };
  }

  const { title, slides } = composeFromBlog(source, options);
  const headmatter = buildHeadmatter([], { ...options, title });
  return {
    markdown: emitDeck(headmatter, slides),
    slideCount: slides.length,
    mode: 'convert',
    title
  };
}
