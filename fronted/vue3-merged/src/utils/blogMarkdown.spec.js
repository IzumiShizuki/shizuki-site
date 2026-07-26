import { describe, expect, it } from 'vitest';
import {
  detectMarkdownSignals,
  escapeMarkdownPlainText,
  looksLikeMarkdown,
  parseSlidevDeck,
  parseVideoEmbedUrl,
  parseWhiteboardEmbedSource,
  renderMarkdownDocument
} from './blogMarkdown';

describe('blogMarkdown', () => {
  it('detects markdown signals with medium threshold', () => {
    const sample = ['# Blog Title', '- item one', '- item two', '[link](https://example.com)'].join('\n');
    const detected = detectMarkdownSignals(sample);
    expect(detected.score).toBeGreaterThanOrEqual(2);
    expect(looksLikeMarkdown(sample, 2)).toBe(true);
  });

  it('escapes markdown syntax into plain text', () => {
    const escaped = escapeMarkdownPlainText('# title *strong* [x](y)');
    expect(escaped).toBe('\\# title \\*strong\\* \\[x\\]\\(y\\)');
  });

  it('renders headings with unique ids and root tree', () => {
    const markdown = ['# A', '## B', '### C', '## D', '# E'].join('\n');
    const rendered = renderMarkdownDocument(markdown);

    expect(rendered.headings).toHaveLength(5);
    expect(rendered.headings[0].id).toBe('a');
    expect(rendered.headings[1].rootId).toBe('b');
    expect(rendered.headings[2].rootId).toBe('b');
    expect(rendered.headings[4].rootId).toBe('e');
    expect(rendered.html).toContain('data-heading-id="a"');
  });

  it('blocks unsafe javascript links', () => {
    const markdown = '[xss](javascript:alert(1))';
    const rendered = renderMarkdownDocument(markdown);
    expect(rendered.html).not.toContain('href="javascript:');
  });

  it('renders sanitized raw html tables', () => {
    const markdown = [
      '<table class="x" onclick="alert(1)">',
      '<thead><tr><th scope="col">A</th><th>B</th></tr></thead>',
      '<tbody><tr><td><strong>1</strong></td><td><script>alert(1)</script>2</td></tr></tbody>',
      '</table>'
    ].join('\n');

    const rendered = renderMarkdownDocument(markdown);

    expect(rendered.html).toContain('<div class="md-table-wrap"><table>');
    expect(rendered.html).toContain('<th>A</th>');
    expect(rendered.html).toContain('<td>1</td>');
    expect(rendered.html).toContain('<td>2</td>');
    expect(rendered.html).not.toContain('onclick=');
    expect(rendered.html).not.toContain('<script');
    expect(rendered.html).not.toContain('<strong>');
  });

  it('renders callout containers with type styles and nested markdown', () => {
    const markdown = [':::warning 部署须知', '先执行 **备份**。', '', '- 第一步', ':::'].join('\n');
    const rendered = renderMarkdownDocument(markdown);

    expect(rendered.html).toContain('md-callout md-callout-warning');
    expect(rendered.html).toContain('md-callout-title');
    expect(rendered.html).toContain('部署须知');
    expect(rendered.html).toContain('<strong>备份</strong>');
    expect(rendered.html).toContain('<li>第一步</li>');
  });

  it('renders details containers as native toggle blocks', () => {
    const markdown = [':::details 展开查看日志', '```js', 'console.log(1)', '```', ':::'].join('\n');
    const rendered = renderMarkdownDocument(markdown);

    expect(rendered.html).toContain('<details class="md-toggle">');
    expect(rendered.html).toContain('md-toggle-summary');
    expect(rendered.html).toContain('展开查看日志');
    expect(rendered.html).toContain('data-lang="js"');
  });

  it('keeps callout headings out of the document toc', () => {
    const markdown = ['# Outside', '', ':::info', '## Inside', ':::'].join('\n');
    const rendered = renderMarkdownDocument(markdown);

    expect(rendered.headings).toHaveLength(1);
    expect(rendered.headings[0].text).toBe('Outside');
    expect(rendered.html).toContain('<h2>Inside</h2>');
  });

  it('renders task list items with checked state', () => {
    const markdown = ['- [ ] todo item', '- [x] done item', '- normal item'].join('\n');
    const rendered = renderMarkdownDocument(markdown);

    expect(rendered.html).toContain('data-task-checked="false"');
    expect(rendered.html).toContain('data-task-checked="true"');
    expect(rendered.html).toContain('md-task-item is-checked');
    expect(rendered.html).toContain('<li>normal item</li>');
  });

  it('converts bare video urls into embed players', () => {
    const markdown = ['https://www.bilibili.com/video/BV1xx411c7mD?p=2', '', 'https://youtu.be/dQw4w9WgXcQ'].join('\n');
    const rendered = renderMarkdownDocument(markdown);

    expect(rendered.html).toContain('md-embed-bilibili');
    expect(rendered.html).toContain('player.bilibili.com/player.html?bvid=BV1xx411c7mD&amp;page=2');
    expect(rendered.html).toContain('md-embed-youtube');
    expect(rendered.html).toContain('youtube-nocookie.com/embed/dQw4w9WgXcQ');
  });

  it('converts other bare urls into bookmark cards but keeps inline urls as text', () => {
    const rendered = renderMarkdownDocument('https://example.com/some/page');
    expect(rendered.html).toContain('md-link-card');
    expect(rendered.html).toContain('example.com');

    const inline = renderMarkdownDocument('前往 https://example.com/some/page 查看');
    expect(inline.html).not.toContain('md-link-card');
  });

  it('parses video embed urls', () => {
    expect(parseVideoEmbedUrl('https://www.bilibili.com/video/BV1xx411c7mD')).toMatchObject({ kind: 'bilibili' });
    expect(parseVideoEmbedUrl('https://www.youtube.com/watch?v=dQw4w9WgXcQ')).toMatchObject({ kind: 'youtube' });
    expect(parseVideoEmbedUrl('https://example.com/x')).toBeNull();
  });

  it('renders whiteboard fences as interactive embed placeholders', () => {
    const payload = JSON.stringify({
      version: 1,
      title: '架构白板',
      preview: 'https://cdn.example.com/p.png',
      encoding: 'deflate-raw+base64',
      chunks: ['AAAA', 'BBBB']
    });
    const markdown = ['```whiteboard', payload, '```'].join('\n');
    const rendered = renderMarkdownDocument(markdown);

    expect(rendered.html).toContain('class="md-whiteboard-embed"');
    expect(rendered.html).toContain('data-wb-state="static"');
    expect(rendered.html).toContain('md-whiteboard-data');
    expect(rendered.html).toContain('架构白板');
    expect(rendered.html).not.toContain('<pre class="md-code"><code data-lang="whiteboard">');
  });

  it('renders invalid whiteboard fences as an error card', () => {
    const rendered = renderMarkdownDocument(['```whiteboard', 'not json', '```'].join('\n'));
    expect(rendered.html).toContain('md-whiteboard-embed-error');
  });

  it('parses whiteboard embed sources defensively', () => {
    expect(parseWhiteboardEmbedSource('not json')).toBeNull();
    expect(parseWhiteboardEmbedSource(JSON.stringify({ title: 'x' }))).toBeNull();
    const parsed = parseWhiteboardEmbedSource(
      JSON.stringify({ version: 1, title: 't', encoding: 'json+base64', chunks: ['aa', ' ', 'bb'] })
    );
    expect(parsed).toMatchObject({ title: 't', encoding: 'json+base64' });
    expect(parsed.chunks).toEqual(['aa', 'bb']);
  });

  it('parses slidev deck into ordered slides', () => {
    const deck = [
      '---',
      'theme: default',
      '---',
      '# Cover',
      '',
      'Summary',
      '',
      '---',
      'layout: section',
      '',
      '## Deep Dive',
      '',
      '- item',
      '',
      '---',
      'Plain fallback title'
    ].join('\n');

    const slides = parseSlidevDeck(deck);

    expect(slides).toHaveLength(3);
    expect(slides[0].index).toBe(1);
    expect(slides[0].title).toBe('Cover');
    expect(slides[1].title).toBe('Deep Dive');
    expect(slides[2].title).toBe('Plain fallback title');
    expect(slides[1].markdown).not.toContain('layout: section');
    expect(slides[1].layout).toBe('section');
  });

  it('parses closed per-slide frontmatter blocks without ghost slides', () => {
    const deck = [
      '---',
      'layout: cover',
      'theme: default',
      'transition: slide-left',
      '---',
      '# 封面标题',
      '',
      '---',
      'layout: section',
      '---',
      '',
      '# 01 · 章节',
      '',
      '---',
      '',
      '## 内容页',
      '',
      '正文'
    ].join('\n');

    const slides = parseSlidevDeck(deck);

    expect(slides).toHaveLength(3);
    expect(slides[0].title).toBe('封面标题');
    expect(slides[0].layout).toBe('cover');
    expect(slides[1].layout).toBe('section');
    expect(slides[2].layout).toBe('default');
    expect(slides.some((slide) => slide.html.includes('layout:'))).toBe(false);
  });

  it('turns v-clicks wrappers into reveal-steps lists', () => {
    const deck = [
      '---',
      'theme: default',
      '---',
      '## 列表页',
      '',
      '<v-clicks>',
      '',
      '- 甲',
      '- 乙',
      '',
      '</v-clicks>',
      '',
      '普通段落'
    ].join('\n');

    const slides = parseSlidevDeck(deck);

    expect(slides).toHaveLength(1);
    expect(slides[0].html).toContain('reveal-steps');
    expect(slides[0].html).not.toContain('v-clicks');
    expect(slides[0].html).toContain('普通段落');
  });

  it('does not split slides on --- inside code fences', () => {
    const deck = [
      '---',
      'theme: default',
      '---',
      '## 代码页',
      '',
      '```yaml',
      'front: value',
      '---',
      'other: value',
      '```'
    ].join('\n');

    const slides = parseSlidevDeck(deck);

    expect(slides).toHaveLength(1);
    expect(slides[0].html).toContain('front: value');
    expect(slides[0].html).toContain('other: value');
  });
});
