import assert from 'node:assert/strict';
import test from 'node:test';
import {
  composeSlidevDeck,
  looksLikeSlidevDeck,
  parseMarkdownBlocks,
  parseSlideChunk
} from '../slidev-composer.mjs';
import { buildGlobalBottomVue, buildSlidevStyleCss } from '../slidev-assets.mjs';

const LONG_CJK_PARAGRAPH = '这是一段非常长的博客正文内容，用来验证自动分页逻辑是否能够把超出单页预算的段落拆分到多张幻灯片上。'.repeat(16);

function splitSlides(markdown) {
  const body = markdown.replace(/^---\n[\s\S]*?\n---\n/, '');
  const lines = body.split('\n');
  const chunks = [];
  let current = [];
  let inFence = false;
  for (let index = 0; index < lines.length; index += 1) {
    const line = lines[index];
    if (/^(```|~~~)/.test(line.trim())) inFence = !inFence;
    if (!inFence && line.trim() === '---') {
      chunks.push(current.join('\n'));
      current = [];
      // 跳过分隔线后的闭合 frontmatter 块（key: value ... ---）
      let cursor = index + 1;
      while (cursor < lines.length && /^[A-Za-z_][\w-]*\s*:/.test(lines[cursor].trim())) {
        cursor += 1;
      }
      if (cursor > index + 1 && cursor < lines.length && lines[cursor].trim() === '---') {
        index = cursor;
      }
      continue;
    }
    current.push(line);
  }
  chunks.push(current.join('\n'));
  return chunks.map((chunk) => chunk.trim()).filter(Boolean);
}

test('detects slidev decks vs plain blog markdown', () => {
  assert.equal(looksLikeSlidevDeck('---\ntheme: default\n---\n# Cover'), true);
  assert.equal(looksLikeSlidevDeck('# 标题\n\n正文段落而已。'), false);
  assert.equal(looksLikeSlidevDeck('第一页\n\n---\n\n第二页\n\n---\n\n第三页'), true);
});

test('parses markdown blocks with fenced code protection', () => {
  const blocks = parseMarkdownBlocks([
    '# 标题',
    '',
    '```js',
    '## 这不是标题',
    '---',
    '```',
    '',
    '- a',
    '- b'
  ].join('\n'));

  assert.deepEqual(blocks.map((block) => block.type), ['heading', 'code', 'list']);
  assert.equal(blocks[1].lines.length, 2);
  assert.equal(blocks[2].itemStarts.length, 2);
});

test('converts plain blog markdown into a full deck', () => {
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

  assert.equal(result.mode, 'convert');
  assert.equal(result.title, '我的博客文章');
  assert.match(result.markdown, /^---\nlayout: cover\n/);
  assert.match(result.markdown, /theme: default/);
  assert.match(result.markdown, /transition: slide-left/);
  assert.match(result.markdown, /colorSchema: dark/);
  assert.match(result.markdown, /layout: cover/);
  assert.match(result.markdown, /## 目录/);
  assert.match(result.markdown, /layout: section/);
  assert.match(result.markdown, /<v-clicks>/);
  assert.match(result.markdown, /# 谢谢观看/);

  const slides = splitSlides(result.markdown);
  // 封面 + 目录 + 2×(章节页+内容页) + 结尾
  assert.equal(slides.length, result.slideCount);
  assert.ok(result.slideCount >= 6);
});

test('splits an overlong paragraph across multiple slides', () => {
  const blog = ['# 长文', '', '## 唯一章节', '', LONG_CJK_PARAGRAPH].join('\n');
  const result = composeSlidevDeck(blog, { animate: true });

  const slides = splitSlides(result.markdown);
  const continuation = slides.filter((slide) => /## 唯一章节 · \d/.test(slide));
  assert.ok(continuation.length >= 1, 'expected continuation slides for long paragraph');
});

test('splits long code blocks by line budget', () => {
  const codeLines = Array.from({ length: 30 }, (_, index) => `console.log(${index});`);
  const blog = ['# 代码文', '', '## 代码', '', '```js', ...codeLines, '```'].join('\n');
  const result = composeSlidevDeck(blog, { animate: true });

  const fenceCount = (result.markdown.match(/```js/g) || []).length;
  assert.ok(fenceCount >= 3, `expected code split into >=3 fences, got ${fenceCount}`);
  assert.ok(!result.markdown.includes(codeLines.join('\n')), 'code should not stay in one block');
});

test('enhances an existing slidev deck without changing small slides', () => {
  const deck = [
    '---',
    'theme: default',
    '---',
    '# 封面',
    '',
    '---',
    '## 第二页',
    '',
    '内容'
  ].join('\n');

  const result = composeSlidevDeck(deck, { animate: true });

  assert.equal(result.mode, 'enhance');
  assert.equal(result.slideCount, 2);
  assert.match(result.markdown, /theme: default/);
  assert.match(result.markdown, /transition: slide-left/);
  assert.match(result.markdown, /# 封面/);
  assert.match(result.markdown, /## 第二页/);
});

test('enhance mode splits an oversized slide and keeps special layouts intact', () => {
  const deck = [
    '---',
    'theme: default',
    '---',
    '---',
    'layout: cover',
    '---',
    '',
    `# 封面\n\n${LONG_CJK_PARAGRAPH}`,
    '',
    '---',
    '',
    `## 超长页\n\n${LONG_CJK_PARAGRAPH}`
  ].join('\n');

  const result = composeSlidevDeck(deck, { animate: true });
  const slides = splitSlides(result.markdown);

  const coverSlides = slides.filter((slide) => slide.includes('# 封面'));
  assert.equal(coverSlides.length, 1, 'cover layout must not be split');
  const longSlides = slides.filter((slide) => /## 超长页/.test(slide));
  assert.ok(longSlides.length >= 2, 'oversized default slide should split');
});

test('enhance mode wraps bare lists with v-clicks but respects manual clicks', () => {
  const deck = [
    '---',
    'theme: default',
    '---',
    '## 列表页',
    '',
    '- 甲',
    '- 乙',
    '- 丙'
  ].join('\n');

  const result = composeSlidevDeck(deck, { animate: true });
  assert.match(result.markdown, /<v-clicks>/);

  const manual = composeSlidevDeck(deck.replace('- 丙', '- 丙 <v-click>手动</v-click>'), { animate: true });
  const manualBody = manual.markdown.replace(/^---[\s\S]*?---\n/, '');
  assert.ok(!manualBody.includes('<v-clicks>'), 'manual v-click slide should not be re-wrapped');
});

test('rewrites relative asset urls when assetBaseUrl provided', () => {
  const blog = ['# 图片文', '', '## 图', '', '![封面](/api/media/cover.png)'].join('\n');
  const result = composeSlidevDeck(blog, { assetBaseUrl: 'https://example.com' });
  assert.match(result.markdown, /https:\/\/example\.com\/api\/media\/cover\.png/);

  const untouched = composeSlidevDeck(blog, {});
  assert.match(untouched.markdown, /\(\/api\/media\/cover\.png\)/);
});

test('parseSlideChunk handles closed and loose frontmatter styles', () => {
  const closed = parseSlideChunk('layout: section\nclass: text-center\n---\n\n# 标题');
  assert.deepEqual(closed.frontmatter, ['layout: section', 'class: text-center']);
  assert.equal(closed.body, '# 标题');

  const loose = parseSlideChunk('layout: section\n\n## Deep Dive\n\n- item');
  assert.deepEqual(loose.frontmatter, ['layout: section']);
  assert.match(loose.body, /^## Deep Dive/);

  const plain = parseSlideChunk('注意: 这是正文不是 frontmatter\n\n继续');
  assert.deepEqual(plain.frontmatter, []);
  assert.match(plain.body, /^注意:/);
});

test('deck output is deterministic for identical input', () => {
  const blog = ['# 稳定性', '', '## 章节', '', '内容段落。'].join('\n');
  const first = composeSlidevDeck(blog, { animate: true });
  const second = composeSlidevDeck(blog, { animate: true });
  assert.equal(first.markdown, second.markdown);
});

test('style assets generate for both themes and footer escapes title', () => {
  const dark = buildSlidevStyleCss('dark');
  const light = buildSlidevStyleCss('light');
  assert.match(dark, /pre-wrap/);
  assert.match(dark, /overflow-wrap: anywhere/);
  assert.match(light, /theme: light/);

  const footer = buildGlobalBottomVue('我的<标题>');
  assert.ok(!footer.includes('<标题>'));
  assert.match(footer, /\$slidev\.nav\.currentPage/);
  assert.match(footer, /\$slidev\.nav\.total/);
});
