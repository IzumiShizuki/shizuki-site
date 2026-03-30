import { describe, expect, it } from 'vitest';
import {
  detectMarkdownSignals,
  escapeMarkdownPlainText,
  looksLikeMarkdown,
  parseSlidevDeck,
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
  });
});
