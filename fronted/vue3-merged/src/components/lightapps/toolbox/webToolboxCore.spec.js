import { describe, expect, it } from 'vitest';
import {
  calculateChange,
  convertJsonToToon,
  convertToonToJson,
  decodeBase64Text,
  decodeByteText,
  decodeUnicodeEscapes,
  encodeBase64Text,
  encodeUnicodeEscapes,
  encodeUtf8Bytes,
  formatJsonLike,
  generatePassword,
  parseUrlDetails,
  resolveTimestamp,
  transformUrlText
} from './webToolboxCore';

describe('webToolboxCore', () => {
  it('round-trips Unicode escape text', () => {
    const encoded = encodeUnicodeEscapes('Hello 世界 👋');
    expect(encoded).toContain('\\u4e16\\u754c');
    expect(decodeUnicodeEscapes(encoded)).toBe('Hello 世界 👋');
  });

  it('encodes and decodes UTF-8 bytes', () => {
    const hex = encodeUtf8Bytes('你好', 'hex');
    expect(hex).toBe('e4 bd a0 e5 a5 bd');
    expect(decodeByteText(hex, 'hex', 'utf-8')).toBe('你好');
    expect(() => decodeByteText('e4 bd zz', 'hex', 'utf-8')).toThrow('包含无效 Hex 字符');
  });

  it('round-trips UTF-8 Base64', () => {
    const encoded = encodeBase64Text('Shizuki 月');
    expect(decodeBase64Text(encoded)).toBe('Shizuki 月');
  });

  it('supports URL component and form conversion', () => {
    expect(transformUrlText('你好 world', { mode: 'encode', scope: 'form' })).toBe('%E4%BD%A0%E5%A5%BD+world');
    expect(transformUrlText('%E4%BD%A0%E5%A5%BD+world', { mode: 'decode', scope: 'form' })).toBe('你好 world');
  });

  it('parses repeated query and hash parameters', () => {
    const result = parseUrlDetails('https://example.com/a?tag=vue&tag=codex#page?tab=2');
    expect(result.pathname).toBe('/a');
    expect(result.pairs).toEqual([
      expect.objectContaining({ source: 'query', key: 'tag', value: 'vue' }),
      expect.objectContaining({ source: 'query', key: 'tag', value: 'codex' }),
      expect.objectContaining({ source: 'hash', key: 'tab', value: '2' })
    ]);
  });

  it('formats JSON5 and sorts keys', () => {
    expect(formatJsonLike("{ beta: 2, alpha: 1, }", { sortKeys: true, indent: 2 })).toBe('{\n  "alpha": 1,\n  "beta": 2\n}');
  });

  it('round-trips JSON through official TOON encoding', () => {
    const toon = convertJsonToToon('{ users: [{ id: 1, name: "A" }, { id: 2, name: "B" }] }');
    expect(toon).toContain('users[2]{id,name}');
    expect(JSON.parse(convertToonToJson(toon))).toEqual({ users: [{ id: 1, name: 'A' }, { id: 2, name: 'B' }] });
  });

  it('generates deterministic passwords with selected character sets', () => {
    const values = Uint32Array.from({ length: 80 }, (_, index) => index + 1);
    const password = generatePassword({ length: 16, lowercase: true, uppercase: true, numbers: true, symbols: false }, values);
    expect(password).toHaveLength(16);
    expect(password).toMatch(/[a-z]/);
    expect(password).toMatch(/[A-Z]/);
    expect(password).toMatch(/[0-9]/);
  });

  it('resolves second timestamps', () => {
    const result = resolveTimestamp('0', 'seconds');
    expect(result.seconds).toBe(0);
    expect(result.iso).toBe('1970-01-01T00:00:00.000Z');
  });

  it('calculates positive and zero-base changes', () => {
    expect(calculateChange(100, 125)).toEqual(expect.objectContaining({ amount: 25, percentage: 25, multiple: 1.25, direction: 'up' }));
    expect(calculateChange(0, 5).percentage).toBeNull();
  });
});
