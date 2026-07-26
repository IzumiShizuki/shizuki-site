import { describe, expect, it } from 'vitest';
import { formatAiMessageTime, groupAiSessionsByRecency, renderAiMessageHtml } from './aiChatMarkdown';

describe('aiChatMarkdown', () => {
  it('renders markdown content with code blocks', () => {
    const html = renderAiMessageHtml('你好 **世界**\n\n```js\nconst a = 1;\n```');
    expect(html).toContain('<strong>世界</strong>');
    expect(html).toContain('md-code');
    expect(html).toContain('<span class="tok-keyword">const</span>');
  });

  it('syntax-highlights fenced code blocks with a language badge', () => {
    const html = renderAiMessageHtml('```js\nconst a = 1;\n```');
    expect(html).toContain('has-highlight');
    expect(html).toContain('<span class="code-lang">js</span>');
    expect(html).toContain('<span class="tok-keyword">const</span>');
    expect(html).toContain('<span class="tok-number">1</span>');
  });

  it('escapes raw html from model output', () => {
    const html = renderAiMessageHtml('<script>alert(1)</script>');
    expect(html).not.toContain('<script>');
    expect(html).toContain('&lt;script&gt;');
  });

  it('returns empty string for blank content', () => {
    expect(renderAiMessageHtml('   ')).toBe('');
    expect(renderAiMessageHtml(null)).toBe('');
  });

  it('formats message timestamps as HH:mm', () => {
    const stamp = new Date(2026, 6, 26, 9, 5).getTime();
    expect(formatAiMessageTime(stamp)).toBe('09:05');
    expect(formatAiMessageTime('not-a-number')).toBe('');
  });

  it('groups sessions into recency buckets', () => {
    const now = new Date(2026, 6, 26, 12, 0).getTime();
    const dayMs = 24 * 60 * 60 * 1000;
    const groups = groupAiSessionsByRecency(
      [
        { sessionId: 'a', updatedAtMs: now - 60 * 1000 },
        { sessionId: 'b', updatedAtMs: now - 3 * dayMs },
        { sessionId: 'c', updatedAtMs: now - 30 * dayMs },
        { sessionId: 'd' }
      ],
      now
    );

    const byKey = Object.fromEntries(groups.map((group) => [group.key, group.sessions.map((item) => item.sessionId)]));
    expect(byKey.today).toEqual(['a']);
    expect(byKey.week).toEqual(['b']);
    expect(byKey.earlier).toEqual(['c', 'd']);
  });

  it('drops empty buckets', () => {
    const groups = groupAiSessionsByRecency([], Date.now());
    expect(groups).toEqual([]);
  });

  it('falls back to a single recent group when no session has timestamps', () => {
    const groups = groupAiSessionsByRecency([{ sessionId: 'a' }, { sessionId: 'b' }], Date.now());
    expect(groups).toHaveLength(1);
    expect(groups[0].key).toBe('recent');
    expect(groups[0].sessions.map((item) => item.sessionId)).toEqual(['a', 'b']);
  });
});
