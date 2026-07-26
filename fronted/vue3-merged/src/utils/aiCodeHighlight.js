// 轻量、零依赖的代码高亮器，专供 AI 聊天代码块使用。
// 设计目标：输出 HTML 一律转义（不可 XSS）、token 不重叠、覆盖常见语言的通用词法。

const KEYWORDS = new Set([
  // JS / TS
  'const', 'let', 'var', 'function', 'return', 'if', 'else', 'for', 'while', 'do', 'switch', 'case',
  'break', 'continue', 'new', 'class', 'extends', 'super', 'this', 'import', 'from', 'export', 'default',
  'async', 'await', 'yield', 'try', 'catch', 'finally', 'throw', 'typeof', 'instanceof', 'delete', 'void',
  'in', 'of', 'with', 'static', 'get', 'set',
  // Python（print/len 等内置函数不算关键字，交给函数名着色）
  'def', 'lambda', 'pass', 'elif', 'and', 'or', 'not', 'is', 'global', 'nonlocal', 'assert', 'del', 'raise', 'with',
  // Java / C-like
  'public', 'private', 'protected', 'abstract', 'interface', 'enum', 'implements', 'throws', 'final',
  'synchronized', 'volatile', 'transient', 'native', 'package', 'int', 'long', 'double', 'float',
  'boolean', 'char', 'byte', 'short', 'unsigned', 'signed', 'struct', 'typedef', 'sizeof', 'namespace', 'using',
  // Go / Rust
  'func', 'type', 'chan', 'defer', 'select', 'fallthrough', 'range', 'go', 'map', 'fn', 'mut', 'impl',
  'trait', 'pub', 'use', 'mod', 'match', 'loop', 'where', 'as', 'ref', 'move', 'unsafe', 'crate',
  // SQL（大写变体在下方做大小写不敏感处理）
  'select', 'insert', 'update', 'delete', 'where', 'join', 'inner', 'left', 'right', 'outer', 'on',
  'group', 'order', 'having', 'limit', 'offset', 'union', 'values', 'into', 'set', 'table', 'create',
  'drop', 'alter', 'index', 'view', 'distinct', 'between', 'like', 'exists', 'begin', 'commit', 'rollback'
]);

const LITERALS = new Set([
  'true', 'false', 'null', 'undefined', 'NaN', 'Infinity',
  'None', 'True', 'False', 'nil', 'self'
]);

// 用 '#' 作行注释的语言（同时没有 /* */ 块注释）
const HASH_LANGS = new Set([
  'py', 'python', 'sh', 'bash', 'shell', 'zsh', 'console', 'yaml', 'yml', 'toml', 'ini',
  'ruby', 'rb', 'dockerfile', 'r', 'perl', 'pl', 'makefile', 'conf', 'properties'
]);

const SQL_LANGS = new Set(['sql', 'mysql', 'postgres', 'postgresql', 'sqlite', 'plsql', 'tsql']);

export function escapeCodeHtml(input) {
  return String(input ?? '')
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
    .replace(/"/g, '&quot;')
    .replace(/'/g, '&#39;');
}

// 反转义 blogMarkdown.escapeHtml 产生的实体，拿回原始代码文本。
// 顺序很重要：&amp; 最后处理，避免把 &amp;lt; 误还原。
export function unescapeCodeEntities(input) {
  return String(input ?? '')
    .replace(/&lt;/g, '<')
    .replace(/&gt;/g, '>')
    .replace(/&quot;/g, '"')
    .replace(/&#39;/g, "'")
    .replace(/&amp;/g, '&');
}

function isIdentStart(ch) {
  return /[A-Za-z_$]/.test(ch);
}

function isIdentPart(ch) {
  return /[A-Za-z0-9_$]/.test(ch);
}

/**
 * 将原始代码文本着色为安全 HTML。任何未被识别为 token 的字符都会被转义后原样输出，
 * 识别出的 token 包裹为 <span class="tok-xxx">。
 */
export function highlightCode(rawCode, lang = '') {
  const code = String(rawCode ?? '');
  if (!code) {
    return '';
  }
  const normalizedLang = String(lang || '').trim().toLowerCase();
  const hashComment = HASH_LANGS.has(normalizedLang);
  const sqlLike = SQL_LANGS.has(normalizedLang);
  const linePrefix = hashComment ? '#' : sqlLike ? '--' : '//';
  const allowBlockComment = !hashComment; // python / shell 没有 /* */
  const caseInsensitiveKeywords = sqlLike;

  const out = [];
  const length = code.length;
  let index = 0;

  while (index < length) {
    const ch = code[index];

    // 块注释 /* ... */
    if (allowBlockComment && ch === '/' && code[index + 1] === '*') {
      let end = code.indexOf('*/', index + 2);
      end = end < 0 ? length : end + 2;
      out.push(`<span class="tok-comment">${escapeCodeHtml(code.slice(index, end))}</span>`);
      index = end;
      continue;
    }

    // 行注释
    if (code.startsWith(linePrefix, index)) {
      let end = code.indexOf('\n', index);
      if (end < 0) end = length;
      out.push(`<span class="tok-comment">${escapeCodeHtml(code.slice(index, end))}</span>`);
      index = end;
      continue;
    }

    // 字符串 "..." '...' `...`
    if (ch === '"' || ch === "'" || ch === '`') {
      let cursor = index + 1;
      while (cursor < length) {
        if (code[cursor] === '\\') {
          cursor += 2;
          continue;
        }
        if (code[cursor] === ch) {
          cursor += 1;
          break;
        }
        cursor += 1;
      }
      out.push(`<span class="tok-string">${escapeCodeHtml(code.slice(index, cursor))}</span>`);
      index = cursor;
      continue;
    }

    // 数字（十进制 / 十六进制 / 科学计数）
    if (/[0-9]/.test(ch) || (ch === '.' && /[0-9]/.test(code[index + 1] || ''))) {
      const match = /^(0[xX][0-9a-fA-F]+|\d[\d_]*\.?\d*(?:[eE][+-]?\d+)?)/.exec(code.slice(index));
      if (match) {
        out.push(`<span class="tok-number">${escapeCodeHtml(match[0])}</span>`);
        index += match[0].length;
        continue;
      }
    }

    // 标识符 / 关键字 / 字面量 / 函数名
    if (isIdentStart(ch)) {
      let cursor = index + 1;
      while (cursor < length && isIdentPart(code[cursor])) {
        cursor += 1;
      }
      const word = code.slice(index, cursor);
      let lookahead = cursor;
      while (lookahead < length && (code[lookahead] === ' ' || code[lookahead] === '\t')) {
        lookahead += 1;
      }
      const isCall = code[lookahead] === '(';
      const wordKey = caseInsensitiveKeywords ? word.toLowerCase() : word;

      let cls = '';
      if (LITERALS.has(word)) {
        cls = 'tok-literal';
      } else if (KEYWORDS.has(wordKey)) {
        cls = 'tok-keyword';
      } else if (isCall) {
        cls = 'tok-function';
      }

      out.push(cls ? `<span class="${cls}">${escapeCodeHtml(word)}</span>` : escapeCodeHtml(word));
      index = cursor;
      continue;
    }

    out.push(escapeCodeHtml(ch));
    index += 1;
  }

  return out.join('');
}
