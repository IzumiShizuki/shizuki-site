import { describe, expect, it } from 'vitest';
import {
  detectMarkdownSignals,
  escapeMarkdownPlainText,
  looksLikeMarkdown,
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
});
