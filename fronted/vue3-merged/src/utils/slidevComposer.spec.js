import { describe, expect, it } from 'vitest';
import { composeSlidevDeck, looksLikeSlidevDeck, parseSlideChunk } from './slidevComposer';

const LONG_CJK_PARAGRAPH = '这是一段非常长的博客正文内容，用来验证自动分页逻辑是否能够把超出单页预算的段落拆分到多张幻灯片上。'.repeat(16);

describe('slidevComposer', () => {
  it('detects slidev decks vs plain blog markdown', () => {
    expect(looksLikeSlidevDeck('---\ntheme: default\n---\n# Cover')).toBe(true);
    expect(looksLikeSlidevDeck('# 标题\n\n正文段落而已。')).toBe(false);
  });

  it('converts plain blog markdown into a cover/toc/section deck', () => {
    const blog = [
      '# 我的博客文章',
      '',
      '一句话简介。',
      '',
      '## 背景',
      '',
      '背景介绍段落。',
      '',
      '- 要点一',
      '- 要点二',
      '- 要点三',
      '',
      '## 实现',
      '',
      '实现说明。'
    ].join('\n');

    const result = composeSlidevDeck(blog, { animate: true });

    expect(result.mode).toBe('convert');
    expect(result.title).toBe('我的博客文章');
    expect(result.markdown).toMatch(/^---\nlayout: cover\n/);
    expect(result.markdown).toContain('transition: slide-left');
    expect(result.markdown).toContain('## 目录');
    expect(result.markdown).toContain('layout: section');
    expect(result.markdown).toContain('<v-clicks>');
    expect(result.markdown).toContain('# 谢谢观看');
    expect(result.slideCount).toBeGreaterThanOrEqual(6);
  });

  it('splits overlong content across continuation slides', () => {
    const blog = ['# 长文', '', '## 唯一章节', '', LONG_CJK_PARAGRAPH].join('\n');
    const result = composeSlidevDeck(blog, { animate: true });
    expect(result.markdown).toMatch(/## 唯一章节 · \d/);
  });

  it('keeps small existing decks stable in enhance mode', () => {
    const deck = ['---', 'theme: default', '---', '# 封面', '', '---', '## 第二页', '', '内容'].join('\n');
    const result = composeSlidevDeck(deck, { animate: true });

    expect(result.mode).toBe('enhance');
    expect(result.slideCount).toBe(2);
    expect(result.markdown).toContain('theme: default');
    expect(result.markdown).toContain('transition: slide-left');
    expect(result.markdown).toContain('# 封面');
    expect(result.markdown).toContain('## 第二页');
  });

  it('wraps bare lists with v-clicks in enhance mode', () => {
    const deck = ['---', 'theme: default', '---', '## 列表页', '', '- 甲', '- 乙', '- 丙'].join('\n');
    const result = composeSlidevDeck(deck, { animate: true });
    expect(result.markdown).toContain('<v-clicks>');
  });

  it('parses closed and loose slide frontmatter', () => {
    const closed = parseSlideChunk('layout: section\nclass: text-center\n---\n\n# 标题');
    expect(closed.frontmatter).toEqual(['layout: section', 'class: text-center']);
    expect(closed.body).toBe('# 标题');

    const loose = parseSlideChunk('layout: section\n\n## Deep Dive\n\n- item');
    expect(loose.frontmatter).toEqual(['layout: section']);
    expect(loose.body).toMatch(/^## Deep Dive/);
  });

  it('is deterministic for identical input', () => {
    const blog = ['# 稳定性', '', '## 章节', '', '内容段落。'].join('\n');
    expect(composeSlidevDeck(blog, { animate: true }).markdown).toBe(
      composeSlidevDeck(blog, { animate: true }).markdown
    );
  });
});
