import { decode as decodeToon, encode as encodeToon } from '@toon-format/toon';
import md5 from 'blueimp-md5';
import JSON5 from 'json5';

const BASE64_ALPHABET = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';

export const WEB_TOOLBOX_GROUPS = Object.freeze([
  {
    code: 'text',
    label: '文本与编码',
    tools: [
      { code: 'unicode', title: 'Unicode 转换', summary: '中文与 Unicode 转义互转', iconClass: 'fas fa-language' },
      { code: 'utf8', title: 'UTF-8 字节', summary: '文本与 Hex / 百分号字节互转', iconClass: 'fas fa-code' },
      { code: 'encoding', title: '编码解码器', summary: 'GBK / Big5 / Shift_JIS / EUC-KR 字节解码', iconClass: 'fas fa-font' },
      { code: 'base64', title: 'Base64', summary: 'UTF-8 安全的 Base64 编解码', iconClass: 'fas fa-layer-group' },
      { code: 'md5', title: 'MD5 生成器', summary: '快速计算文本 MD5', iconClass: 'fas fa-fingerprint' },
      { code: 'url-codec', title: 'URL 编解码', summary: 'URL、组件和表单编码互转', iconClass: 'fas fa-link' }
    ]
  },
  {
    code: 'data',
    label: '数据工具',
    tools: [
      { code: 'json', title: 'JSON / JSON5', summary: '格式化、校验、排序和压缩', iconClass: 'fas fa-file-code' },
      { code: 'url-params', title: 'URL 参数解析', summary: '拆解路径、查询参数与 Hash', iconClass: 'fas fa-filter' },
      { code: 'toon', title: 'JSON ↔ TOON', summary: '面向 LLM 的紧凑数据格式转换', iconClass: 'fas fa-table-list' }
    ]
  },
  {
    code: 'web',
    label: 'Web 实用工具',
    tools: [
      { code: 'password', title: '随机密码', summary: '使用安全随机数生成强密码', iconClass: 'fas fa-key' },
      { code: 'timestamp', title: 'Unix 时间戳', summary: '秒、毫秒与日期时间互转', iconClass: 'fas fa-clock' },
      { code: 'change-rate', title: '涨跌幅计算', summary: '计算差额、涨跌幅和倍数', iconClass: 'fas fa-chart-line' },
      { code: 'qr-tools', title: '二维码工具', summary: '打开生成、识别和 WiFi 卡片', iconClass: 'fas fa-qrcode' }
    ]
  }
]);

export const WEB_TOOLBOX_TOOLS = Object.freeze(WEB_TOOLBOX_GROUPS.flatMap((group) => group.tools));

function assertText(value, message = '请输入内容') {
  const text = String(value ?? '');
  if (!text.trim()) throw new Error(message);
  return text;
}

export function encodeUnicodeEscapes(value) {
  const text = String(value ?? '');
  let output = '';
  for (const char of text) {
    const codePoint = char.codePointAt(0);
    if (codePoint >= 0x20 && codePoint <= 0x7e) {
      output += char;
      continue;
    }
    if (codePoint <= 0xffff) {
      output += `\\u${codePoint.toString(16).padStart(4, '0')}`;
      continue;
    }
    const adjusted = codePoint - 0x10000;
    const high = 0xd800 + (adjusted >> 10);
    const low = 0xdc00 + (adjusted & 0x3ff);
    output += `\\u${high.toString(16)}\\u${low.toString(16)}`;
  }
  return output;
}

export function decodeUnicodeEscapes(value) {
  const text = assertText(value);
  return text
    .replace(/\\u\{([0-9a-fA-F]{1,6})\}/g, (_, hex) => String.fromCodePoint(Number.parseInt(hex, 16)))
    .replace(/\\u([0-9a-fA-F]{4})/g, (_, hex) => String.fromCharCode(Number.parseInt(hex, 16)))
    .replace(/\\x([0-9a-fA-F]{2})/g, (_, hex) => String.fromCharCode(Number.parseInt(hex, 16)));
}

export function bytesToHex(bytes) {
  return Array.from(bytes, (byte) => byte.toString(16).padStart(2, '0')).join(' ');
}

export function hexToBytes(value) {
  const normalized = assertText(value).replace(/0x/gi, '');
  if (/[^0-9a-fA-F\s,:-]/.test(normalized)) throw new Error('包含无效 Hex 字符');
  const compact = normalized.replace(/[\s,:-]/g, '');
  if (!compact || compact.length % 2 !== 0) throw new Error('Hex 字节数量必须为偶数');
  const bytes = new Uint8Array(compact.length / 2);
  for (let index = 0; index < compact.length; index += 2) {
    bytes[index / 2] = Number.parseInt(compact.slice(index, index + 2), 16);
  }
  return bytes;
}

export function bytesToPercent(bytes) {
  return Array.from(bytes, (byte) => `%${byte.toString(16).padStart(2, '0').toUpperCase()}`).join('');
}

export function percentToBytes(value) {
  const text = assertText(value);
  const matches = text.match(/%[0-9a-fA-F]{2}/g);
  if (!matches || matches.join('').length !== text.replace(/\s+/g, '').length) {
    throw new Error('请输入连续的 %E4%B8%AD 形式字节');
  }
  return Uint8Array.from(matches.map((item) => Number.parseInt(item.slice(1), 16)));
}

export function bytesToBase64(bytes) {
  let output = '';
  for (let index = 0; index < bytes.length; index += 3) {
    const first = bytes[index];
    const second = index + 1 < bytes.length ? bytes[index + 1] : 0;
    const third = index + 2 < bytes.length ? bytes[index + 2] : 0;
    const triple = (first << 16) | (second << 8) | third;
    output += BASE64_ALPHABET[(triple >> 18) & 63];
    output += BASE64_ALPHABET[(triple >> 12) & 63];
    output += index + 1 < bytes.length ? BASE64_ALPHABET[(triple >> 6) & 63] : '=';
    output += index + 2 < bytes.length ? BASE64_ALPHABET[triple & 63] : '=';
  }
  return output;
}

export function base64ToBytes(value) {
  const text = assertText(value).replace(/\s+/g, '');
  if (!/^[A-Za-z0-9+/]*={0,2}$/.test(text) || text.length % 4 !== 0) {
    throw new Error('Base64 内容无效');
  }
  const bytes = [];
  for (let index = 0; index < text.length; index += 4) {
    const chunk = text.slice(index, index + 4);
    const values = [...chunk].map((char) => (char === '=' ? 0 : BASE64_ALPHABET.indexOf(char)));
    const triple = (values[0] << 18) | (values[1] << 12) | (values[2] << 6) | values[3];
    bytes.push((triple >> 16) & 255);
    if (chunk[2] !== '=') bytes.push((triple >> 8) & 255);
    if (chunk[3] !== '=') bytes.push(triple & 255);
  }
  return Uint8Array.from(bytes);
}

export function encodeUtf8Bytes(value, format = 'hex') {
  const bytes = new TextEncoder().encode(String(value ?? ''));
  if (format === 'percent') return bytesToPercent(bytes);
  if (format === 'base64') return bytesToBase64(bytes);
  return bytesToHex(bytes);
}

export function decodeByteText(value, format = 'hex', encoding = 'utf-8') {
  let bytes;
  if (format === 'percent') bytes = percentToBytes(value);
  else if (format === 'base64') bytes = base64ToBytes(value);
  else bytes = hexToBytes(value);
  return new TextDecoder(encoding, { fatal: true }).decode(bytes);
}

export function encodeBase64Text(value) {
  return bytesToBase64(new TextEncoder().encode(String(value ?? '')));
}

export function decodeBase64Text(value) {
  return new TextDecoder('utf-8', { fatal: true }).decode(base64ToBytes(value));
}

export function createMd5(value) {
  return md5(String(value ?? ''));
}

export function transformUrlText(value, options = {}) {
  const text = assertText(value);
  const mode = options.mode === 'decode' ? 'decode' : 'encode';
  const scope = String(options.scope || 'component');
  if (mode === 'decode') {
    if (scope === 'form') return decodeURIComponent(text.replace(/\+/g, ' '));
    return scope === 'url' ? decodeURI(text) : decodeURIComponent(text);
  }
  if (scope === 'form') return encodeURIComponent(text).replace(/%20/g, '+');
  return scope === 'url' ? encodeURI(text) : encodeURIComponent(text);
}

export function parseUrlDetails(value) {
  const text = assertText(value, '请输入 URL');
  const hasScheme = /^[a-z][a-z0-9+.-]*:\/\//i.test(text);
  const parsed = new URL(hasScheme ? text : `https://toolbox.local/${text.replace(/^\/+/, '')}`);
  const pairs = Array.from(parsed.searchParams.entries()).map(([key, itemValue], index) => ({
    id: `query-${index}`,
    source: 'query',
    key,
    value: itemValue
  }));
  const hashText = parsed.hash.replace(/^#/, '');
  const hashQueryIndex = hashText.indexOf('?');
  if (hashQueryIndex >= 0) {
    const hashParams = new URLSearchParams(hashText.slice(hashQueryIndex + 1));
    Array.from(hashParams.entries()).forEach(([key, itemValue], index) => {
      pairs.push({ id: `hash-${index}`, source: 'hash', key, value: itemValue });
    });
  }
  return {
    protocol: hasScheme ? parsed.protocol : '',
    host: hasScheme ? parsed.host : '',
    pathname: parsed.pathname,
    hash: parsed.hash,
    pairs
  };
}

function sortKeysDeep(value) {
  if (Array.isArray(value)) return value.map(sortKeysDeep);
  if (!value || typeof value !== 'object') return value;
  return Object.keys(value)
    .sort((left, right) => left.localeCompare(right))
    .reduce((acc, key) => {
      acc[key] = sortKeysDeep(value[key]);
      return acc;
    }, {});
}

export function formatJsonLike(value, options = {}) {
  const parsed = JSON5.parse(assertText(value, '请输入 JSON / JSON5'));
  const normalized = options.sortKeys ? sortKeysDeep(parsed) : parsed;
  if (options.mode === 'minify') return JSON.stringify(normalized);
  const indent = Math.min(8, Math.max(1, Number(options.indent) || 2));
  return JSON.stringify(normalized, null, indent);
}

export function convertJsonToToon(value) {
  return encodeToon(JSON5.parse(assertText(value, '请输入 JSON / JSON5')));
}

export function convertToonToJson(value, indent = 2) {
  return JSON.stringify(decodeToon(assertText(value, '请输入 TOON')), null, Math.min(8, Math.max(1, Number(indent) || 2)));
}

export function generatePassword(options = {}, randomValues) {
  const length = Math.min(128, Math.max(4, Number(options.length) || 20));
  const sets = [];
  if (options.lowercase !== false) sets.push('abcdefghijklmnopqrstuvwxyz');
  if (options.uppercase !== false) sets.push('ABCDEFGHIJKLMNOPQRSTUVWXYZ');
  if (options.numbers !== false) sets.push('0123456789');
  if (options.symbols !== false) sets.push('!@#$%^&*()-_=+[]{};:,.?');
  if (!sets.length) throw new Error('请至少选择一种字符类型');

  const ambiguous = /[Il1O0o]/g;
  const normalizedSets = sets.map((set) => (options.excludeAmbiguous ? set.replace(ambiguous, '') : set));
  const pool = normalizedSets.join('');
  const needed = Math.max(length * 3, normalizedSets.length + length);
  const values = randomValues && randomValues.length >= needed
    ? randomValues
    : globalThis.crypto.getRandomValues(new Uint32Array(needed));
  let cursor = 0;
  const pick = (set) => set[values[cursor++] % set.length];
  const chars = normalizedSets.map(pick);
  while (chars.length < length) chars.push(pick(pool));
  for (let index = chars.length - 1; index > 0; index -= 1) {
    const swapIndex = values[cursor++] % (index + 1);
    [chars[index], chars[swapIndex]] = [chars[swapIndex], chars[index]];
  }
  return chars.join('');
}

export function resolveTimestamp(value, unit = 'auto') {
  const text = String(value ?? '').trim();
  let milliseconds;
  if (!text) {
    milliseconds = Date.now();
  } else if (/^-?\d+(\.\d+)?$/.test(text)) {
    const numeric = Number(text);
    const resolvedUnit = unit === 'auto' ? (Math.abs(numeric) < 1e11 ? 'seconds' : 'milliseconds') : unit;
    milliseconds = resolvedUnit === 'seconds' ? numeric * 1000 : numeric;
  } else {
    milliseconds = Date.parse(text);
  }
  if (!Number.isFinite(milliseconds)) throw new Error('无法识别该时间');
  const date = new Date(milliseconds);
  if (Number.isNaN(date.getTime())) throw new Error('时间超出有效范围');
  return {
    seconds: Math.floor(milliseconds / 1000),
    milliseconds: Math.trunc(milliseconds),
    iso: date.toISOString(),
    local: date.toLocaleString('zh-CN', { hour12: false })
  };
}

export function calculateChange(startValue, endValue) {
  const start = Number(startValue);
  const end = Number(endValue);
  if (!Number.isFinite(start) || !Number.isFinite(end)) throw new Error('请输入有效数字');
  const amount = end - start;
  const percentage = start === 0 ? null : (amount / Math.abs(start)) * 100;
  return {
    start,
    end,
    amount,
    percentage,
    multiple: start === 0 ? null : end / start,
    direction: amount > 0 ? 'up' : amount < 0 ? 'down' : 'flat'
  };
}

export function findWebTool(code) {
  return WEB_TOOLBOX_TOOLS.find((item) => item.code === String(code || '').trim()) || null;
}
