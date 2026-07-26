import { renderMarkdownDocument } from './blogMarkdown';
import { escapeCodeHtml, highlightCode, unescapeCodeEntities } from './aiCodeHighlight';

// blogMarkdown 会同时在 pre 与 code 上附带语言属性；兼容无语言属性的旧输出。
const AI_CODE_BLOCK_RE =
  /<pre class="md-code"(?: data-lang="([^"]*)")?><code(?: data-lang="([^"]*)")?>([\s\S]*?)<\/code><\/pre>/g;

/**
 * 对 blogMarkdown 输出里的代码块做语法高亮后处理：
 * 反转义拿回原始代码 → 逐 token 着色（内部重新转义，安全）→ 包回代码块，
 * 并在右上角补一个语言角标。
 */
function decorateCodeBlocks(html) {
  return html.replace(AI_CODE_BLOCK_RE, (full, preLangAttr, codeLangAttr, body) => {
    const lang = String(preLangAttr || codeLangAttr || '');
    const rawCode = unescapeCodeEntities(body);
    const highlighted = highlightCode(rawCode, lang);
    const langLabel = lang ? `<span class="code-lang">${escapeCodeHtml(lang)}</span>` : '';
    const dataAttr = lang ? ` data-lang="${escapeCodeHtml(lang)}"` : '';
    return `<pre class="md-code has-highlight"${dataAttr}>${langLabel}<code>${highlighted}</code></pre>`;
  });
}

/**
 * Renders one AI chat message body as sanitized HTML.
 * Reuses the blog markdown pipeline (HTML is escaped before inline markup is applied),
 * then adds syntax highlighting to fenced code blocks, so assistant output is safe to bind with v-html.
 */
export function renderAiMessageHtml(content) {
  const normalized = String(content ?? '').trim();
  if (!normalized) {
    return '';
  }
  return decorateCodeBlocks(renderMarkdownDocument(normalized).html);
}

/**
 * Formats a message timestamp (ms) as a compact HH:mm label for the chat stream.
 */
export function formatAiMessageTime(timestamp) {
  const value = Number(timestamp);
  if (!Number.isFinite(value) || value <= 0) {
    return '';
  }
  const date = new Date(value);
  if (Number.isNaN(date.getTime())) {
    return '';
  }
  const hours = String(date.getHours()).padStart(2, '0');
  const minutes = String(date.getMinutes()).padStart(2, '0');
  return `${hours}:${minutes}`;
}

/**
 * Groups session summaries into date buckets for the session rail (DeepSeek-style).
 * When no session carries a usable timestamp (the phase-1 summary has none), the
 * whole list collapses into a single "最近会话" group that keeps the backend order.
 */
export function groupAiSessionsByRecency(sessions, now = Date.now()) {
  const list = Array.isArray(sessions) ? sessions : [];
  if (!list.length) {
    return [];
  }

  const hasTimestamps = list.some((session) => Number.isFinite(Number(session?.updatedAtMs)) && Number(session?.updatedAtMs) > 0);
  if (!hasTimestamps) {
    return [{ key: 'recent', label: '最近会话', sessions: [...list] }];
  }

  const today = [];
  const week = [];
  const earlier = [];
  const startOfToday = new Date(now);
  startOfToday.setHours(0, 0, 0, 0);
  const todayMs = startOfToday.getTime();
  const weekMs = todayMs - 6 * 24 * 60 * 60 * 1000;

  list.forEach((session) => {
    const at = Number(session?.updatedAtMs);
    if (Number.isFinite(at) && at >= todayMs) {
      today.push(session);
    } else if (Number.isFinite(at) && at >= weekMs) {
      week.push(session);
    } else {
      earlier.push(session);
    }
  });

  return [
    { key: 'today', label: '今天', sessions: today },
    { key: 'week', label: '7 天内', sessions: week },
    { key: 'earlier', label: '更早', sessions: earlier }
  ].filter((group) => group.sessions.length > 0);
}
