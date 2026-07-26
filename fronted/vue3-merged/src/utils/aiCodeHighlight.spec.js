import { describe, expect, it } from 'vitest';
import { escapeCodeHtml, highlightCode, unescapeCodeEntities } from './aiCodeHighlight';

describe('aiCodeHighlight', () => {
  it('colors keywords, numbers and strings in js', () => {
    const html = highlightCode('const x = 42; const s = "hi";', 'js');
    expect(html).toContain('<span class="tok-keyword">const</span>');
    expect(html).toContain('<span class="tok-number">42</span>');
    expect(html).toContain('<span class="tok-string">&quot;hi&quot;</span>');
  });

  it('colors function calls and literals', () => {
    const html = highlightCode('print(True)', 'python');
    expect(html).toContain('<span class="tok-function">print</span>');
    expect(html).toContain('<span class="tok-literal">True</span>');
  });

  it('treats # as a comment in python but not in js', () => {
    expect(highlightCode('# note', 'python')).toContain('<span class="tok-comment"># note</span>');
    const js = highlightCode('a # b', 'js');
    expect(js).not.toContain('tok-comment');
  });

  it('colors // line comments and /* */ block comments in js', () => {
    expect(highlightCode('// hi', 'js')).toContain('<span class="tok-comment">// hi</span>');
    expect(highlightCode('/* x */', 'js')).toContain('<span class="tok-comment">/* x */</span>');
  });

  it('treats -- as a comment in sql and is keyword case-insensitive', () => {
    const html = highlightCode('SELECT * FROM t -- all', 'sql');
    expect(html).toContain('<span class="tok-keyword">SELECT</span>');
    expect(html).toContain('<span class="tok-comment">-- all</span>');
  });

  it('never emits unescaped html from code content', () => {
    const html = highlightCode('const a = "<script>alert(1)</script>";', 'js');
    expect(html).not.toContain('<script>');
    expect(html).toContain('&lt;script&gt;');
  });

  it('returns empty string for blank input', () => {
    expect(highlightCode('', 'js')).toBe('');
    expect(highlightCode(null, 'js')).toBe('');
  });

  it('round-trips escape/unescape of the five entities', () => {
    const raw = `a < b && c > d "q" 'p'`;
    expect(unescapeCodeEntities(escapeCodeHtml(raw))).toBe(raw);
  });
});
